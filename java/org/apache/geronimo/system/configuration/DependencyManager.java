/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.apache.geronimo.system.configuration;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.felix.bundlerepository.RepositoryAdmin;
import org.apache.geronimo.gbean.GBeanLifecycle;
import org.apache.geronimo.gbean.annotation.GBean;
import org.apache.geronimo.gbean.annotation.OsgiService;
import org.apache.geronimo.gbean.annotation.ParamReference;
import org.apache.geronimo.gbean.annotation.ParamSpecial;
import org.apache.geronimo.gbean.annotation.SpecialAttributeType;
import org.apache.geronimo.kernel.config.InvalidConfigException;
import org.apache.geronimo.kernel.config.NoSuchConfigException;
import org.apache.geronimo.kernel.repository.AbstractRepository;
import org.apache.geronimo.kernel.repository.Artifact;
import org.apache.geronimo.kernel.repository.ArtifactResolver;
import org.apache.geronimo.kernel.repository.MissingDependencyException;
import org.apache.geronimo.kernel.repository.Repository;
import org.apache.geronimo.kernel.util.BundleUtil;
import org.apache.geronimo.kernel.util.IOUtils;
import org.apache.geronimo.system.plugin.model.DependencyType;
import org.apache.geronimo.system.plugin.model.PluginArtifactType;
import org.apache.geronimo.system.plugin.model.PluginType;
import org.apache.geronimo.system.plugin.model.PluginXmlUtil;
import org.apache.xbean.osgi.bundle.util.BundleDescription.ExportPackage;
import org.apache.xbean.osgi.bundle.util.BundleUtils;
import org.apache.xbean.osgi.bundle.util.HeaderParser;
import org.apache.xbean.osgi.bundle.util.HeaderParser.HeaderElement;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.BundleEvent;
import org.osgi.framework.BundleException;
import org.osgi.framework.Constants;
import org.osgi.framework.ServiceReference;
import org.osgi.framework.SynchronousBundleListener;
import org.osgi.framework.Version;
import org.osgi.service.packageadmin.ExportedPackage;
import org.osgi.service.packageadmin.PackageAdmin;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @version $Rev$ $Date$
 */
@GBean
@OsgiService
public class DependencyManager implements SynchronousBundleListener, GBeanLifecycle {

    private static final Logger log = LoggerFactory.getLogger(DependencyManager.class);

    private final BundleContext bundleContext;

    private final Collection<Repository> repositories;

    private RepositoryAdmin repositoryAdmin;

    private final ArtifactResolver artifactResolver;

    private final Map<Long, PluginArtifactType> pluginMap = Collections.synchronizedMap(new WeakHashMap<Long, PluginArtifactType>());

    private final Map<Long, Set<Long>> dependentBundleIdsMap = new ConcurrentHashMap<Long, Set<Long>>();

    private final Map<Long, Set<Long>> fullDependentBundleIdsMap = new ConcurrentHashMap<Long, Set<Long>>();

    private final Map<Long, Set<ExportPackage>> bundleExportPackagesMap = new HashMap<Long, Set<ExportPackage>>();

    private final Map<Artifact, Bundle> artifactBundleMap = new ConcurrentHashMap<Artifact, Bundle>();

    private final Map<Long, Artifact> bundleIdArtifactMap = new ConcurrentHashMap<Long, Artifact>();

    private ServiceReference respositoryAdminReference;

    public DependencyManager(@ParamSpecial(type = SpecialAttributeType.bundleContext) BundleContext bundleContext,
            @ParamReference(name = "Repositories", namingType = "Repository") Collection<Repository> repositories,
            @ParamReference(name = "ArtifactResolver", namingType = "ArtifactResolver") ArtifactResolver artifactResolver) {
        this.bundleContext = bundleContext;
        this.repositories = repositories;
        this.artifactResolver = artifactResolver;
    }

    public void bundleChanged(BundleEvent bundleEvent) {
        int eventType = bundleEvent.getType();
        //TODO Need to optimize the codes, as we will not receive the INSTALLED event after the cache is created
        if (eventType == BundleEvent.INSTALLED || eventType == BundleEvent.RESOLVED) {
            installed(bundleEvent.getBundle());
        } else if (eventType == BundleEvent.STARTING) {
            starting(bundleEvent.getBundle());
        } else if (eventType == BundleEvent.UNINSTALLED) {
            uninstall(bundleEvent.getBundle());
        }
    }

    public Set<ExportPackage> getExportedPackages(Bundle bundle) {
        return getExportedPackages(bundle.getBundleId());
    }

    public Set<ExportPackage> getExportedPackages(Long bundleId) {
        synchronized (bundleExportPackagesMap) {
            Set<ExportPackage> exportPackages = bundleExportPackagesMap.get(bundleId);
            if (exportPackages == null) {
                exportPackages = getExportPackagesInternal(bundleContext.getBundle(bundleId));
                bundleExportPackagesMap.put(bundleId, exportPackages);
            }
            return exportPackages;
        }
    }

    public List<Bundle> getDependentBundles(Bundle bundle) {
        Set<Long> dependentBundleIds = getDependentBundleIds(bundle);
        if (dependentBundleIds.size() == 0) {
            return Collections.<Bundle> emptyList();
        }
        List<Bundle> dependentBundles = new ArrayList<Bundle>(dependentBundleIds.size());
        for (Long dependentBundleId : dependentBundleIds) {
            Bundle b = bundleContext.getBundle(dependentBundleId);
            if (b!=null) {
                dependentBundles.add(b);
            }
        }
        return dependentBundles;
    }

    public Set<Long> getDependentBundleIds(Bundle bundle) {
        Set<Long> dependentBundleIds = dependentBundleIdsMap.get(bundle.getBundleId());
        return dependentBundleIds == null ? Collections.<Long> emptySet() : new HashSet<Long>(dependentBundleIds);
    }

    public Set<Bundle> getFullDependentBundles(Bundle bundle) {
        return getFullDependentBundles(bundle.getBundleId());
    }

    public Set<Bundle> getFullDependentBundles(Long bundleId) {
        Set<Long> fullDependentBundleIds = getFullDependentBundleIds(bundleId);
        if (fullDependentBundleIds.size() == 0) {
            return Collections.<Bundle> emptySet();
        }
        Set<Bundle> dependentBundles = new HashSet<Bundle>(fullDependentBundleIds.size());
        for (Long dependentBundleId : fullDependentBundleIds) {
            Bundle b = bundleContext.getBundle(dependentBundleId);
            if (b!=null) {
                dependentBundles.add(b);
            }
        }
        return dependentBundles;
    }

    public Set<Long> getFullDependentBundleIds(Bundle bundle) {
        return getFullDependentBundleIds(bundle.getBundleId());
    }

    public Set<Long> getFullDependentBundleIds(Long bundleId) {
        Set<Long> fullDependentBundleIds = fullDependentBundleIdsMap.get(bundleId);
        return fullDependentBundleIds == null ? Collections.<Long> emptySet() : new HashSet<Long>(fullDependentBundleIds);
    }

    public Bundle getBundle(Artifact artifact) {
        if (!artifact.isResolved()) {
            try {
                if (artifactResolver != null) {
                    artifact = artifactResolver.resolveInClassLoader(artifact);
                }
            } catch (MissingDependencyException e) {
            }
        }
        return artifactBundleMap.get(artifact);
    }

    public Artifact getArtifact(long bundleId) {
        return bundleIdArtifactMap.get(bundleId);
    }

    public Artifact toArtifact(String installationLocation) {
        if (installationLocation == null) {
            return null;
        }
        if (installationLocation.startsWith("mvn:")) {
            String[] artifactFragments = installationLocation.substring(4).split("[/]");
            if (artifactFragments.length < 2) {
                return null;
            }
            return new Artifact(artifactFragments[0], artifactFragments[1], artifactFragments.length > 2 ? artifactFragments[2] : "",
                    artifactFragments.length > 3 && artifactFragments[3].length() > 0 ? artifactFragments[3] : "jar");
        } else if(installationLocation.startsWith(BundleUtils.REFERENCE_SCHEME)) {
            //TODO a better way for this ???
            String bundleFilePath = BundleUtils.toFile(installationLocation).getAbsolutePath();
            for (Repository repo : repositories) {
                if (repo instanceof AbstractRepository) {
                    File rootFile = ((AbstractRepository) repo).getRootFile();
                    if (bundleFilePath.startsWith(rootFile.getAbsolutePath())) {
                        String artifactString = bundleFilePath.substring(rootFile.getAbsolutePath().length());
                        if (artifactString.startsWith(File.separator)) {
                            artifactString = artifactString.substring(File.separator.length());
                        }
                        String[] filePathFragments = artifactString.split("[" + (File.separator.equals("\\") ? "\\\\" : File.separator) + "]");
                        if (filePathFragments.length >= 4) {
                            StringBuilder groupId = new StringBuilder(filePathFragments[0]);
                            for (int i = 1; i <= filePathFragments.length - 4; i++) {
                                groupId.append(".").append(filePathFragments[i]);
                            }
                            return new Artifact(groupId.toString(), filePathFragments[filePathFragments.length - 3], filePathFragments[filePathFragments.length - 2],
                                    filePathFragments[filePathFragments.length - 1].substring(filePathFragments[filePathFragments.length - 1].lastIndexOf('.') + 1));
                        }
                    }
                }
            }
        }
        return null;
    }

    public void updatePluginMetadata(Bundle bundle) {
        Long bundleId = bundle.getBundleId();
        dependentBundleIdsMap.remove(bundleId);
        fullDependentBundleIdsMap.remove(bundleId);
        pluginMap.remove(bundleId);
        PluginArtifactType pluginArtifactType = getCachedPluginMetadata(bundle);
        if (pluginArtifactType != null) {
            List<DependencyType> dependencies = pluginArtifactType.getDependency();
            Set<Long> dependentBundleIds = new HashSet<Long>();
            Set<Long> fullDependentBundleIds = new HashSet<Long>();
            try {
                for (DependencyType dependencyType : dependencies) {
                    Artifact artifact = dependencyType.toArtifact();
                    Bundle dependentBundle = getBundle(artifact);
                    if(dependentBundle == null) {
                        log.warn("Dependent artifact " + artifact + " could not be resolved, it will be ignored");
                        continue;
                    }
                    Long dependentBundleId = dependentBundle.getBundleId();
                    dependentBundleIds.add(dependentBundleId);
                    if (fullDependentBundleIds.add(dependentBundleId)) {
                        Set<Long> parentDependentBundleIds = fullDependentBundleIdsMap.get(dependentBundleId);
                        if (parentDependentBundleIds != null) {
                            fullDependentBundleIds.addAll(parentDependentBundleIds);
                        }
                    }
                }
                fullDependentBundleIdsMap.put(bundle.getBundleId(), fullDependentBundleIds);
                dependentBundleIdsMap.put(bundle.getBundleId(), dependentBundleIds);
            } catch (Exception e) {
                log.error("Could not update bundle dependecy", e);
            }
        }
    }

    public static void updatePluginMetadata(BundleContext bundleContext, Bundle bundle) {
        ServiceReference serviceReference = null;
        try {
            serviceReference = bundleContext.getServiceReference(DependencyManager.class.getName());
            DependencyManager dependencyManager = null;
            if (serviceReference != null) {
                dependencyManager = (DependencyManager) bundleContext.getService(serviceReference);
                dependencyManager.updatePluginMetadata(bundle);
            }
        } finally {
            if (serviceReference != null) {
                bundleContext.ungetService(serviceReference);
            }
        }
    }

    private PluginArtifactType addArtifactBundleEntry(Bundle bundle) {
        PluginArtifactType pluginArtifactType = getCachedPluginMetadata(bundle);
        Artifact artifact;
        if (pluginArtifactType == null) {
            artifact = toArtifact(bundle.getLocation());
        } else {
            artifact = pluginArtifactType.getModuleId().toArtifact();
        }
        if (artifact != null) {
            artifactBundleMap.put(artifact, bundle);
            bundleIdArtifactMap.put(bundle.getBundleId(), artifact);
        } else {
            if (log.isDebugEnabled()) {
                log.debug("fail to resovle artifact from the bundle location " + bundle.getLocation());
            }
        }
        return pluginArtifactType;
    }

    private void removeArtifactBundleEntry(Bundle bundle) {
        Artifact artifact = bundleIdArtifactMap.remove(bundle.getBundleId());
        if (artifact != null) {
            artifactBundleMap.remove(artifact);
        }
    }

    private Set<ExportPackage> getExportPackagesInternal(Bundle bundle) {
        ServiceReference reference = null;
        try {
            reference = bundleContext.getServiceReference(PackageAdmin.class.getName());
            if (reference == null) {
                log.warn("No PackageAdmin service is found, fail to get export packages of " + bundle.getLocation());
                return Collections.<ExportPackage> emptySet();
            }
            String exportPackageHeader = bundle.getHeaders().get(Constants.EXPORT_PACKAGE);
            Map<String, HeaderElement> nameVersionExportPackageMap = new HashMap<String, HeaderElement>();
            if (exportPackageHeader != null) {
                List<HeaderElement> headerElements = HeaderParser.parseHeader(exportPackageHeader);
                for (HeaderElement headerElement : headerElements) {
                    String version = headerElement.getAttribute(Constants.VERSION_ATTRIBUTE);
                    if (version == null) {
                        headerElement.addAttribute(Constants.VERSION_ATTRIBUTE, "0.0.0");
                        nameVersionExportPackageMap.put(headerElement.getName() + "0.0.0", headerElement);
                    } else {
                        nameVersionExportPackageMap.put(headerElement.getName() + new Version(version).toString(), headerElement);
                    }
                }
            }
            PackageAdmin packageAdmin = (PackageAdmin) bundleContext.getService(reference);
            ExportedPackage[] exportedPackages = packageAdmin.getExportedPackages(bundle);
            if (exportedPackages != null) {
                Set<ExportPackage> exportPackageNames = new HashSet<ExportPackage>();
                for (ExportedPackage exportedPackage : exportedPackages) {
                    HeaderElement headerElement = nameVersionExportPackageMap.get(exportedPackage.getName() + exportedPackage.getVersion());
                    if (headerElement != null) {
                        exportPackageNames.add(new ExportPackage(headerElement.getName(), headerElement.getAttributes(), headerElement.getDirectives()));
                    }
                }
                return exportPackageNames;
            }
            return Collections.<ExportPackage> emptySet();
        } finally {
            if (reference != null) {
                bundleContext.ungetService(reference);
            }
        }
    }

    private PluginArtifactType getPluginMetadata(Bundle bundle) {
        PluginArtifactType pluginArtifactType = null;
        InputStream in = null;
        try {
            URL info = bundle.getEntry("META-INF/geronimo-plugin.xml");
            if (info != null) {
                if (log.isDebugEnabled()) {
                    log.debug("found geronimo-plugin.xml for bundle " + bundle);
                }
                in = info.openStream();
            } else if (bundle.getBundleContext() != null) {
                File pluginMetadataFile = bundle.getBundleContext().getDataFile("geronimo-plugin.xml");
                if (pluginMetadataFile.exists()) {
                    in = new FileInputStream(pluginMetadataFile);
                }
            }
            if (in != null) {
                PluginType pluginType = PluginXmlUtil.loadPluginMetadata(in);
                pluginArtifactType = pluginType.getPluginArtifact().get(0);
            } else {
                if (log.isDebugEnabled()) {
                    log.debug("did not find geronimo-plugin.xml for bundle " + bundle);
                }
            }
        } catch (Throwable e) {
            log.warn("Could not read Geronimo metadata for bundle: " + bundle, e);
        } finally {
            IOUtils.close(in);
        }
        return pluginArtifactType;
    }

    private void uninstall(Bundle bundle) {
        removeArtifactBundleEntry(bundle);
        dependentBundleIdsMap.remove(bundle.getBundleId());
        fullDependentBundleIdsMap.remove(bundle.getBundleId());
        pluginMap.remove(bundle.getBundleId());
    }

    private void installRepository(Bundle bundle) {
        if (repositoryAdmin != null) {
            URL info = bundle.getEntry("OSGI-INF/obr/repository.xml");
            if (info != null) {
                if (log.isDebugEnabled()) {
                    log.debug("found repository.xml for bundle " + bundle);
                }
                try {
                    repositoryAdmin.addRepository(info);
                } catch (Exception e) {
                    log.info("Error adding respository.xml for bundle " + bundle, e);
                }
            } else {
                if (log.isDebugEnabled()) {
                    log.debug("did not find respository.xml for bundle " + bundle);
                }
            }
        }
    }

    public PluginArtifactType getCachedPluginMetadata(Bundle bundle) {
        PluginArtifactType pluginArtifactType = pluginMap.get(bundle.getBundleId());
        if (pluginArtifactType == null) {
            pluginArtifactType = getPluginMetadata(bundle);
            if (pluginArtifactType != null) {
                pluginMap.put(bundle.getBundleId(), pluginArtifactType);
            }
            //take this opportunity to install obr repo fragment
            // installRepository(bundle);
        }
        return pluginArtifactType;
    }

    public void installed(Bundle bundle) {
        if (bundleIdArtifactMap.containsKey(bundle.getBundleId())) {
            return;
        }
        PluginArtifactType pluginArtifactType = addArtifactBundleEntry(bundle);
        if (pluginArtifactType == null) {
            return;
        }
        List<DependencyType> dependencies = pluginArtifactType.getDependency();
        Set<Long> dependentBundleIds = new HashSet<Long>();
        Set<Long> fullDependentBundleIds = new HashSet<Long>();
        try {
            for (DependencyType dependencyType : dependencies) {
                if (log.isDebugEnabled()) {
                    log.debug("Installing artifact: " + dependencyType);
                }
                Artifact artifact = dependencyType.toArtifact();
                if (artifactResolver != null) {
                    artifact = artifactResolver.resolveInClassLoader(artifact);
                }
                String location = locateBundle(artifact);
                try {
                    Bundle installedDependentBundle = bundleContext.installBundle(location);
                    long installedDependentBundleId = installedDependentBundle.getBundleId();
                    dependentBundleIds.add(installedDependentBundleId);
                    if (fullDependentBundleIds.add(installedDependentBundleId)) {
                        Set<Long> parentDependentBundleIds = fullDependentBundleIdsMap.get(installedDependentBundleId);
                        if (parentDependentBundleIds != null) {
                            fullDependentBundleIds.addAll(parentDependentBundleIds);
                        }
                    }
                } catch (BundleException e) {
                    log.warn("Could not install bundle for artifact: " + artifact, e);
                }
            }
            fullDependentBundleIdsMap.put(bundle.getBundleId(), fullDependentBundleIds);
            dependentBundleIdsMap.put(bundle.getBundleId(), dependentBundleIds);
        } catch (Exception e) {
            log.error("Could not install bundle dependency", e);
        }
    }

    private void starting(Bundle bundle) {
        PluginArtifactType pluginArtifactType = getCachedPluginMetadata(bundle);
        if (pluginArtifactType != null) {
            List<Bundle> bundles = new ArrayList<Bundle>();
            List<DependencyType> dependencies = pluginArtifactType.getDependency();
            boolean dependencyHierarchyBuildingRequired = !dependentBundleIdsMap.containsKey(bundle.getBundleId());
            Set<Long> dependentBundleIds = null;
            Set<Long> fullDependentBundleIds = null;
            if (dependencyHierarchyBuildingRequired) {
                dependentBundleIds = new HashSet<Long>();
                fullDependentBundleIds = new HashSet<Long>();
            }
            try {
                for (DependencyType dependencyType : dependencies) {
                    if (log.isDebugEnabled()) {
                        log.debug("Starting artifact: " + dependencyType);
                    }
                    Artifact artifact = dependencyType.toArtifact();
                    if (artifactResolver != null) {
                        artifact = artifactResolver.resolveInClassLoader(artifact);
                    }
                    String location = locateBundle(artifact);
                    Bundle b = bundleContext.installBundle(location);
                    if (dependencyHierarchyBuildingRequired) {
                        long startingBundleId = b.getBundleId();
                        dependentBundleIds.add(startingBundleId);
                        if (fullDependentBundleIds.add(startingBundleId)) {
                            Set<Long> parentDependentBundleIds = fullDependentBundleIdsMap.get(startingBundleId);
                            if (parentDependentBundleIds != null) {
                                fullDependentBundleIds.addAll(parentDependentBundleIds);
                            }
                        }
                    }
                    if (b.getState() != Bundle.ACTIVE ) {
                        bundles.add(b);
                    }
                }

                for (Bundle b : bundles) {
                    if (BundleUtils.canStart(b)) {
                        try {
                            b.start(Bundle.START_TRANSIENT);
                        } catch (BundleException e) {
                            log.warn("Could not start bundle: " + b, e);
                        }
                    }
                }

                if (dependencyHierarchyBuildingRequired) {
                    fullDependentBundleIdsMap.put(bundle.getBundleId(), fullDependentBundleIds);
                    dependentBundleIdsMap.put(bundle.getBundleId(), dependentBundleIds);
                }
            } catch (Exception e) {
                log.error("Could not install bundle dependecy", e);
            }
        }
    }

    private String locateBundle(Artifact configurationId) throws NoSuchConfigException, IOException, InvalidConfigException {
        for (Repository repo : repositories) {
            if (repo.contains(configurationId)) {
                return BundleUtils.toReferenceFileLocation(repo.getLocation(configurationId));
            }
        }
        throw new NoSuchConfigException(configurationId);
    }

    @Override
    public void doStart() throws Exception {
        bundleContext.addBundleListener(this);
        respositoryAdminReference = bundleContext.getServiceReference(RepositoryAdmin.class.getName());
        repositoryAdmin = respositoryAdminReference == null ? null : (RepositoryAdmin) bundleContext.getService(respositoryAdminReference);
        //init installed bundles
        for (Bundle bundle : bundleContext.getBundles()) {
            installed(bundle);
        }
        //Check the car who loads me ...
        try {
            PluginArtifactType pluginArtifact = getCachedPluginMetadata(bundleContext.getBundle());
            if (pluginArtifact != null) {
                Set<Long> dependentBundleIds = new HashSet<Long>();
                for (DependencyType dependency : pluginArtifact.getDependency()) {
                    Bundle dependentBundle = getBundle(dependency.toArtifact());
                    if (dependentBundle != null) {
                        dependentBundleIds.add(dependentBundle.getBundleId());
                    }
                }
                long bundleId = bundleContext.getBundle().getBundleId();
                dependentBundleIdsMap.put(bundleId, dependentBundleIds);
                fullDependentBundleIdsMap.put(bundleId, dependentBundleIds);
            }
        } catch (Exception e) {
            log.error("Fail to read the dependency info from bundle " + bundleContext.getBundle().getLocation());
        }
    }

    @Override
    public void doStop() throws Exception {
        if (respositoryAdminReference != null) {
            try {
                bundleContext.ungetService(respositoryAdminReference);
            } catch (Exception e) {
            }
        }
        bundleContext.removeBundleListener(this);
        //Some clean up work
        pluginMap.clear();
        dependentBundleIdsMap.clear();
        fullDependentBundleIdsMap.clear();
        bundleExportPackagesMap.clear();
        artifactBundleMap.clear();
        bundleIdArtifactMap.clear();
    }

    @Override
    public void doFail() {
        try {
            doStop();
        } catch (Exception e) {
        }
    }
}
