/**
 *  Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  See the NOTICE file distributed with
 *  this work for additional information regarding copyright ownership.
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 *  (the "License"); you may not use this file except in compliance with
 *  the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.apache.geronimo.console.obrmanager;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletConfig;
import javax.portlet.PortletException;
import javax.portlet.PortletRequest;
import javax.portlet.PortletRequestDispatcher;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.WindowState;

import org.apache.felix.bundlerepository.Capability;
import org.apache.felix.bundlerepository.Repository;
import org.apache.felix.bundlerepository.RepositoryAdmin;
import org.apache.felix.bundlerepository.Requirement;
import org.apache.felix.bundlerepository.Resolver;
import org.apache.felix.bundlerepository.Resource;
import org.apache.geronimo.console.BasePortlet;
import org.apache.geronimo.console.util.PortletManager;
import org.apache.geronimo.obr.GeronimoOBRGBean;
import org.apache.geronimo.system.serverinfo.ServerInfo;
import org.osgi.framework.BundleContext;
import org.osgi.framework.InvalidSyntaxException;
import org.osgi.framework.ServiceReference;
import org.osgi.framework.Version;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OBRManagerPortlet extends BasePortlet {

    private static final Logger logger = LoggerFactory.getLogger(OBRManagerPortlet.class);

    private PortletRequestDispatcher helpView;

    private PortletRequestDispatcher obrManagerView;
    
    private PortletRequestDispatcher resolveView;

    private static final String SERACH_ACTION = "search";

    private static final String LIST_ACTION = "listAll";

    private static final String REMOVE_URL_ACTION = "removeurl";

    private static final String REFRESH_URL_ACTION = "refreshurl";

    private static final String ADD_URL_ACTION = "add_url";
    
    private static final String RESOLVE_ACTION = "resolve";
    
    private static final String DEPLOY_ACTION = "deploy";

    private static final String SEARCH_TYPE_ALL = "ALL";
    
    private Map<String, Resolver> resolverMap = Collections.synchronizedMap(new HashMap<String, Resolver>());

    public void init(PortletConfig portletConfig) throws PortletException {
        super.init(portletConfig);
        helpView = portletConfig.getPortletContext().getRequestDispatcher("/WEB-INF/view/obrmanager/OBRManager.jsp");
        obrManagerView = portletConfig.getPortletContext().getRequestDispatcher("/WEB-INF/view/obrmanager/OBRManager.jsp");
        resolveView = portletConfig.getPortletContext().getRequestDispatcher("/WEB-INF/view/obrmanager/resolve.jsp");
    }

    public void destroy() {
        obrManagerView = null;
        super.destroy();
    }

    public void processAction(ActionRequest actionRequest, ActionResponse actionResponse) throws PortletException,
            IOException {
        actionResponse.setRenderParameter("message", ""); // set to blank first
        
        String action = actionRequest.getParameter("action");

        if (ADD_URL_ACTION.equals(action)) {
            try {
                addRepository(actionRequest);
            } catch (Exception e) {
                addErrorMessage(actionRequest, getLocalizedString(actionRequest, "consolebase.obrmanager.err.actionError") + action, e.getMessage());
                logger.error("Exception", e);
            }
        }
        else if (REFRESH_URL_ACTION.equals(action)) {
            try {
                refreshRepository(actionRequest);    
            } catch (Exception e) {
                addErrorMessage(actionRequest, getLocalizedString(actionRequest, "consolebase.obrmanager.err.actionError") + action, e.getMessage());
                logger.error("Exception", e);
            }
        }
        else if (REMOVE_URL_ACTION.equals(action)) {
            String uri = actionRequest.getParameter("repo.uri");
            String name = actionRequest.getParameter("repo.name");
            if (name == null || name.trim().length() == 0) {
                name = uri;
            }
            removeRepository(actionRequest);
        }
        else if (LIST_ACTION.equals(action)) {
            String searchType = SEARCH_TYPE_ALL;
            actionResponse.setRenderParameter("searchType", searchType);
        }
        else if (SERACH_ACTION.equals(action)) {
            String searchString = actionRequest.getParameter("searchString");
            actionResponse.setRenderParameter("searchString", searchString);        
            String searchType = actionRequest.getParameter("searchType");
            actionResponse.setRenderParameter("searchType", searchType);
        }
        else if (RESOLVE_ACTION.equals(action)) {
            actionResponse.setRenderParameter("mode", RESOLVE_ACTION);
            String[] selectedResources = actionRequest.getParameterValues("selected-resources");
            actionResponse.setRenderParameter("selected-resources", selectedResources);
        }  
        else if (DEPLOY_ACTION.equals(action)) {
            actionResponse.setRenderParameter("mode", DEPLOY_ACTION);
            String resolverId = actionRequest.getParameter("resolverId");
            actionResponse.setRenderParameter("resolverId", resolverId);
        }
    }
        
    private void refreshRepository(ActionRequest actionRequest) throws Exception {
        String uri = actionRequest.getParameter("repo.uri");
        String name = getName(actionRequest.getParameter("repo.name"), uri);

        BundleContext bundleContext = getBundleContext(actionRequest);
        ServiceReference reference = null;
        
        try {
            if (GeronimoOBRGBean.REPOSITORY_NAME.equals(name)) {
                reference = bundleContext.getServiceReference(GeronimoOBRGBean.class.getName());
                GeronimoOBRGBean obrGBean = (GeronimoOBRGBean) bundleContext.getService(reference);

                // do refresh
                obrGBean.refresh();                
            } else {
                reference = bundleContext.getServiceReference(RepositoryAdmin.class.getName());
                RepositoryAdmin repositoryAdmin = (RepositoryAdmin) bundleContext.getService(reference);

                // do refresh
                repositoryAdmin.removeRepository(uri);
                repositoryAdmin.addRepository(uri);
            }
        } finally {
            if (reference != null) {
                bundleContext.ungetService(reference);
            }
        }
        
        addInfoMessage(actionRequest, getLocalizedString(actionRequest, "consolebase.obrmanager.info.refreshurl", name));
    }
    
    private void removeRepository(ActionRequest actionRequest) {
        String uri = actionRequest.getParameter("repo.uri");
        String name = getName(actionRequest.getParameter("repo.name"), uri);

        BundleContext bundleContext = getBundleContext(actionRequest);
        ServiceReference reference = null;
        
        try {
            reference = bundleContext.getServiceReference(RepositoryAdmin.class.getName());
            RepositoryAdmin repositoryAdmin = (RepositoryAdmin) bundleContext.getService(reference);

            // remove repository and persist
            repositoryAdmin.removeRepository(uri);
            persistRepositoryList(repositoryAdmin, PortletManager.getCurrentServer(actionRequest).getServerInfo()); 
            
        } finally {
            if (reference != null) {
                bundleContext.ungetService(reference);
            }
        }
        
        addInfoMessage(actionRequest, getLocalizedString(actionRequest, "consolebase.obrmanager.info.removeurl", name));
    }
    
    private void addRepository(ActionRequest actionRequest) throws Exception {
        String obrUrl = actionRequest.getParameter("obrUrl");

        BundleContext bundleContext = getBundleContext(actionRequest);
        ServiceReference reference = null;
        String name = null;
        
        try {
            reference = bundleContext.getServiceReference(RepositoryAdmin.class.getName());
            RepositoryAdmin repositoryAdmin = (RepositoryAdmin) bundleContext.getService(reference);

            // add repository and persist
            Repository repository = repositoryAdmin.addRepository(new URI(obrUrl).toURL());
            persistRepositoryList(repositoryAdmin, PortletManager.getCurrentServer(actionRequest).getServerInfo());                   
            
            name = getName(repository.getName(), obrUrl);
            
        } finally {
            if (reference != null) {
                bundleContext.ungetService(reference);
            }
        }
        
        addInfoMessage(actionRequest, getLocalizedString(actionRequest, "consolebase.obrmanager.info.add", name));        
    }
    
    private static String getName(String name, String uri) {
        if (name == null || name.trim().length() == 0) {
            return uri;
        } else {
            return name;
        }
    }
    
    protected void doView(RenderRequest renderRequest, RenderResponse renderResponse) throws IOException,
            PortletException {

        if (WindowState.MINIMIZED.equals(renderRequest.getWindowState())) { // minimal view
            return;
        } else { // normal and maximal view
            String mode = renderRequest.getParameter("mode");
            try {
                if (RESOLVE_ACTION.equals(mode)) {
                    resolveResources(renderRequest, renderResponse);
                    return;
                } else if (DEPLOY_ACTION.equals(mode)) {
                    deployResources(renderRequest, renderResponse);
                    return;
                }
            } catch (Exception e) {
                addErrorMessage(renderRequest, getLocalizedString(renderRequest, "consolebase.obrmanager.err.actionError"), e.getMessage());
                logger.error("Exception", e);
            }
            
            BundleContext bundleContext = getBundleContext(renderRequest);
            ServiceReference reference = bundleContext.getServiceReference(RepositoryAdmin.class.getName());
            RepositoryAdmin repositoryAdmin = (RepositoryAdmin) bundleContext.getService(reference);

            //get All OBR
            Repository[] repos = repositoryAdmin.listRepositories();
            renderRequest.setAttribute("repos", repos);

            try {
                String searchType = renderRequest.getParameter("searchType");
                if (searchType != null && !"".equals(searchType)) {
                    if (SEARCH_TYPE_ALL.equals(searchType)) {
                        Resource[] resources = getAllResources(repositoryAdmin);
                        Arrays.sort(resources, ResourceComparator.INSTANCE);
                        renderRequest.setAttribute("resources", resources);
                    } else {
                        String searchString = renderRequest.getParameter("searchString");
                        if (searchString == null || searchString.trim().length() == 0) {
                            Resource[] resources = getAllResources(repositoryAdmin);
                            Arrays.sort(resources, ResourceComparator.INSTANCE);
                            renderRequest.setAttribute("resources", resources);
                        } else {
                            ResourceMatcher resourceMatcher = getResourceMatcher(searchType, searchString.trim().toLowerCase());
                            List<Resource> resourcesResult = queryResources(repositoryAdmin, resourceMatcher);
                            renderRequest.setAttribute("resources", resourcesResult);
                        }
                    }
                }                
            } catch (Exception e) {
                addErrorMessage(renderRequest, getLocalizedString(renderRequest, "consolebase.obrmanager.err.actionError"), e.getMessage());
                logger.error("Exception", e);
            } finally {
                bundleContext.ungetService(reference);
            }

            obrManagerView.include(renderRequest, renderResponse);
        }

    }
    
    private List<Resource> queryResources(RepositoryAdmin repositoryAdmin, ResourceMatcher resourceMatcher) {
        List<Resource> resourcesResult = null;
        Resource[] resources = getAllResources(repositoryAdmin);
        if (resources != null) {
            resourcesResult = new ArrayList<Resource>();
            for (Resource resource : resources) {
                if (resourceMatcher.match(resource)) {
                    resourcesResult.add(resource);
                }
            }       
            Collections.sort(resourcesResult, ResourceComparator.INSTANCE);
        } else {
            resourcesResult = new ArrayList<Resource>(0);
        }
        return resourcesResult;
    }
    
    private Resource[] getAllResources(RepositoryAdmin repositoryAdmin) {
        try {
            return repositoryAdmin.discoverResources("(symbolicname=*)");
        } catch (InvalidSyntaxException e) {
            throw new RuntimeException("Unexpected error", e);
        }
    }

    private ResourceMatcher getResourceMatcher(String searchType, String searchString) {
        if (searchType.equalsIgnoreCase("symbolic-name")) {
            return new SymbolicNameMatcher(searchString);
        } else if (searchType.equalsIgnoreCase("resource-name")) {
            return new ResourceNameMatcher(searchString);
        } else if (searchType.equalsIgnoreCase("package-capability")) {
            return new PackageCapabilityMatcher(searchString);
        } else if (searchType.equalsIgnoreCase("package-requirement")) {
            return new PackageRequirementMatcher(searchString);
        } else {
            throw new RuntimeException("Unsupported search type: " + searchType);
        }
    }
    
    private abstract static class ResourceMatcher {
        
        private String query;
        
        public ResourceMatcher(String query) {
            this.query = query;
        }
        
        abstract boolean match(Resource resource);
        
        protected boolean matchQuery(String name) {
            if (name != null) {
                return name.toLowerCase().contains(query);
            } else {
                return false;
            }
        }
    }
    
    private static class SymbolicNameMatcher extends ResourceMatcher {

        public SymbolicNameMatcher(String query) {
            super(query);
        }

        public boolean match(Resource resource) {
            return matchQuery(resource.getSymbolicName());
        }
        
    }
    
    private static class ResourceNameMatcher extends ResourceMatcher {

        public ResourceNameMatcher(String query) {
            super(query);
        }

        public boolean match(Resource resource) {
            return matchQuery(resource.getPresentationName());
        }
        
    }
    
    private static class PackageCapabilityMatcher extends ResourceMatcher {

        public PackageCapabilityMatcher(String query) {
            super(query);
        }

        public boolean match(Resource resource) {
            Capability[] capabilities = resource.getCapabilities();
            if (capabilities != null) {
                for (Capability capability : capabilities) {
                    if (Capability.PACKAGE.equals(capability.getName())) {
                        String packageName = (String) capability.getPropertiesAsMap().get(Capability.PACKAGE);
                        if (matchQuery(packageName)) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        
    }
    
    private static class PackageRequirementMatcher extends ResourceMatcher {

        public PackageRequirementMatcher(String query) {
            super(query);
        }

        public boolean match(Resource resource) {
            Requirement[] requirements = resource.getRequirements();
            if (requirements != null) {
                for (Requirement requirement : requirements) {
                    if (Capability.PACKAGE.equals(requirement.getName())) {
                        String filter = requirement.getFilter();
                        String packageName = getPackageName(filter);
                        if (packageName != null) {
                            if (matchQuery(packageName)) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }
        
        /*
         * look for "(package = <package name>)" in the filter and return <package name>.
         */
        private String getPackageName(String filter) {
            int pos = filter.indexOf(Capability.PACKAGE);
            if (pos != -1) {
                int length = filter.length();
                pos += Capability.PACKAGE.length();
                pos = skipWhitespace(filter, pos);
                if (pos < length && filter.charAt(pos) == '=') {
                    pos = skipWhitespace(filter, pos + 1);
                    if (pos < length) {
                        int start = pos;
                        while (pos < length) {
                            char ch = filter.charAt(pos);
                            if (Character.isWhitespace(ch) || ch == ')') {
                                break;
                            } else {
                                pos++;
                            }
                        }
                        int end = pos;
                        return filter.substring(start, end);
                    }
                }
            }
            return null;
        }
        
        private int skipWhitespace(String filter, int start) {
            int size = filter.length();
            int pos = start;
            while (pos < size && Character.isWhitespace(filter.charAt(pos))) {
                pos++;
            }
            return pos;
        }
    }
    
    private static class ResourceComparator implements Comparator<Resource> {

        public static final ResourceComparator INSTANCE = new ResourceComparator();
        
        @Override
        public int compare(Resource resource1, Resource resource2) {
            int rs = compareSymbolicNames(resource1, resource2);
            if (rs == 0) {
                return compareVersions(resource2, resource1);
            } else {
                return rs;
            }
        }
        
        private int compareSymbolicNames(Resource resource1, Resource resource2) {
            String name1 = resource1.getSymbolicName();
            String name2 = resource2.getSymbolicName();
            if (name1 == null) {
                if (name2 == null) {
                    return 0;
                } else {
                    return 1;
                }
            } else if (name2 == null) {
                return -1;
            } else {
                return name1.compareTo(name2);
            }
        }
        
        private int compareVersions(Resource resource1, Resource resource2) {
            Version version1 = resource1.getVersion();
            Version version2 = resource2.getVersion();
            if (version1 == null) {
                if (version2 == null) {
                    return 0;
                } else {
                    return 1;                    
                }
            } else if (version2 == null) {
                return -1;
            } else {
                return version1.compareTo(version2);
            }
        }
    }

    /*
     * Borrowed from ObrCommandSupport.java in Apache Karaf.     
     */
    private void persistRepositoryList(RepositoryAdmin admin, ServerInfo serverInfo) {
        try {
            StringBuilder sb = new StringBuilder();
            for (Repository repo : admin.listRepositories()) {
                if (sb.length() > 0) {
                    sb.append(" ");
                }
                sb.append(repo.getURI());
            }

            File sys = serverInfo.resolveServer("etc/config.properties");
            File sysTmp = serverInfo.resolveServer("etc/config.properties.tmp");

            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(sysTmp)));
            boolean modified = false;
            try {
                if (sys.exists()) {
                    BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(sys)));
                    try {
                        String line = reader.readLine();
                        while (line != null) {
                            if (line.matches("obr\\.repository\\.url[:= ].*")) {
                                modified = true;
                                line = "obr.repository.url = " + sb.toString();
                            }
                            writer.write(line);
                            writer.newLine();
                            line = reader.readLine();
                        }
                    } finally {
                        reader.close();
                    }
                }
                if (!modified) {
                    writer.newLine();
                    writer.write("# ");
                    writer.newLine();
                    writer.write("# OBR Repository list");
                    writer.newLine();
                    writer.write("# ");
                    writer.newLine();
                    writer.write("obr.repository.url = " + sb.toString());
                    writer.newLine();
                    writer.newLine();
                }
            } finally {
                writer.close();
            }

            sys.delete();
            sysTmp.renameTo(sys);

        } catch (Exception e) {
            logger.error("Error while persisting repository list", e);
        }
    }

    private void resolveResources(RenderRequest request, RenderResponse response) throws Exception {
        String[] selectedResources = request.getParameterValues("selected-resources");
        if (selectedResources == null || selectedResources.length == 0) {
            throw new IllegalArgumentException("No resources selected");
        }
        
        BundleContext bundleContext = getBundleContext(request);
        ServiceReference reference = null;
            
        try {
            reference = bundleContext.getServiceReference(RepositoryAdmin.class.getName());
            RepositoryAdmin repositoryAdmin = (RepositoryAdmin) bundleContext.getService(reference);
        
            Map<String, Resource> resourceMap = new HashMap<String, Resource>();
            Resource[] resources = getAllResources(repositoryAdmin);
            for (Resource resource : resources) {
                resourceMap.put(resource.getSymbolicName() + "/" + resource.getVersion(), resource);
            }
                    
            Resolver resolver = repositoryAdmin.resolver();
                    
            for (String resourceName : selectedResources) {
                Resource resource = resourceMap.get(resourceName);
                if (resource == null) {
                    throw new IllegalArgumentException("Resource not found: " + resourceName);
                }
                resolver.add(resource);
            }
            
            request.setAttribute("resolved", resolver.resolve());
            request.setAttribute("resolver", resolver);
            String resolverId = String.valueOf(resolver.hashCode());
            request.setAttribute("resolverId", resolverId);
            resolverMap.put(resolverId, resolver);
            resolveView.include(request, response);
        } finally {
            if (reference != null) {
                bundleContext.ungetService(reference);
            }
        }
    }        

    private void deployResources(RenderRequest request, RenderResponse response) throws Exception {
        String resolverId = request.getParameter("resolverId");

        Resolver resolver = resolverMap.get(resolverId);
        
        try {
            resolver.deploy(Resolver.START);
            addInfoMessage(request, getLocalizedString(request, "consolebase.obrmanager.info.deploy"));
        } catch (Exception e) {
            addErrorMessage(request, getLocalizedString(request, "consolebase.obrmanager.err.deploy"), e.getMessage());
            logger.error("Exception", e);
        }
        
        request.setAttribute("resolved", true);
        request.setAttribute("resolver", resolver);
        resolveView.include(request, response);
    }
    
    private BundleContext getBundleContext(PortletRequest request) {
        return (BundleContext) request.getPortletSession().getPortletContext().getAttribute("osgi-bundlecontext");
    }
}
