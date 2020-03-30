/*
 * XML Type:  environmentType
 * Namespace: http://geronimo.apache.org/xml/ns/deployment-1.2
 * Java type: org.apache.geronimo.deployment.xbeans.EnvironmentType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.deployment.xbeans.impl;
/**
 * An XML environmentType(@http://geronimo.apache.org/xml/ns/deployment-1.2).
 *
 * This is a complex type.
 */
public class EnvironmentTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.deployment.xbeans.EnvironmentType
{
    private static final long serialVersionUID = 1L;
    
    public EnvironmentTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MODULEID$0 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/deployment-1.2", "moduleId");
    private static final javax.xml.namespace.QName DEPENDENCIES$2 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/deployment-1.2", "dependencies");
    private static final javax.xml.namespace.QName BUNDLEACTIVATOR$4 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/deployment-1.2", "bundle-activator");
    private static final javax.xml.namespace.QName BUNDLECLASSPATH$6 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/deployment-1.2", "bundle-classPath");
    private static final javax.xml.namespace.QName IMPORTPACKAGE$8 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/deployment-1.2", "import-package");
    private static final javax.xml.namespace.QName EXPORTPACKAGE$10 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/deployment-1.2", "export-package");
    private static final javax.xml.namespace.QName REQUIREBUNDLE$12 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/deployment-1.2", "require-bundle");
    private static final javax.xml.namespace.QName DYNAMICIMPORTPACKAGE$14 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/deployment-1.2", "dynamic-import-package");
    private static final javax.xml.namespace.QName HIDDENCLASSES$16 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/deployment-1.2", "hidden-classes");
    private static final javax.xml.namespace.QName NONOVERRIDABLECLASSES$18 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/deployment-1.2", "non-overridable-classes");
    private static final javax.xml.namespace.QName PRIVATECLASSES$20 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/deployment-1.2", "private-classes");
    private static final javax.xml.namespace.QName INVERSECLASSLOADING$22 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/deployment-1.2", "inverse-classloading");
    private static final javax.xml.namespace.QName SUPPRESSDEFAULTENVIRONMENT$24 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/deployment-1.2", "suppress-default-environment");
    
    
    /**
     * Gets the "moduleId" element
     */
    public org.apache.geronimo.deployment.xbeans.ArtifactType getModuleId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.xbeans.ArtifactType target = null;
            target = (org.apache.geronimo.deployment.xbeans.ArtifactType)get_store().find_element_user(MODULEID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "moduleId" element
     */
    public boolean isSetModuleId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MODULEID$0) != 0;
        }
    }
    
    /**
     * Sets the "moduleId" element
     */
    public void setModuleId(org.apache.geronimo.deployment.xbeans.ArtifactType moduleId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.xbeans.ArtifactType target = null;
            target = (org.apache.geronimo.deployment.xbeans.ArtifactType)get_store().find_element_user(MODULEID$0, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.deployment.xbeans.ArtifactType)get_store().add_element_user(MODULEID$0);
            }
            target.set(moduleId);
        }
    }
    
    /**
     * Appends and returns a new empty "moduleId" element
     */
    public org.apache.geronimo.deployment.xbeans.ArtifactType addNewModuleId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.xbeans.ArtifactType target = null;
            target = (org.apache.geronimo.deployment.xbeans.ArtifactType)get_store().add_element_user(MODULEID$0);
            return target;
        }
    }
    
    /**
     * Unsets the "moduleId" element
     */
    public void unsetModuleId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MODULEID$0, 0);
        }
    }
    
    /**
     * Gets the "dependencies" element
     */
    public org.apache.geronimo.deployment.xbeans.DependenciesType getDependencies()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.xbeans.DependenciesType target = null;
            target = (org.apache.geronimo.deployment.xbeans.DependenciesType)get_store().find_element_user(DEPENDENCIES$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "dependencies" element
     */
    public boolean isSetDependencies()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DEPENDENCIES$2) != 0;
        }
    }
    
    /**
     * Sets the "dependencies" element
     */
    public void setDependencies(org.apache.geronimo.deployment.xbeans.DependenciesType dependencies)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.xbeans.DependenciesType target = null;
            target = (org.apache.geronimo.deployment.xbeans.DependenciesType)get_store().find_element_user(DEPENDENCIES$2, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.deployment.xbeans.DependenciesType)get_store().add_element_user(DEPENDENCIES$2);
            }
            target.set(dependencies);
        }
    }
    
    /**
     * Appends and returns a new empty "dependencies" element
     */
    public org.apache.geronimo.deployment.xbeans.DependenciesType addNewDependencies()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.xbeans.DependenciesType target = null;
            target = (org.apache.geronimo.deployment.xbeans.DependenciesType)get_store().add_element_user(DEPENDENCIES$2);
            return target;
        }
    }
    
    /**
     * Unsets the "dependencies" element
     */
    public void unsetDependencies()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DEPENDENCIES$2, 0);
        }
    }
    
    /**
     * Gets the "bundle-activator" element
     */
    public java.lang.String getBundleActivator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BUNDLEACTIVATOR$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "bundle-activator" element
     */
    public org.apache.xmlbeans.XmlString xgetBundleActivator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BUNDLEACTIVATOR$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "bundle-activator" element
     */
    public boolean isSetBundleActivator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BUNDLEACTIVATOR$4) != 0;
        }
    }
    
    /**
     * Sets the "bundle-activator" element
     */
    public void setBundleActivator(java.lang.String bundleActivator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BUNDLEACTIVATOR$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BUNDLEACTIVATOR$4);
            }
            target.setStringValue(bundleActivator);
        }
    }
    
    /**
     * Sets (as xml) the "bundle-activator" element
     */
    public void xsetBundleActivator(org.apache.xmlbeans.XmlString bundleActivator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BUNDLEACTIVATOR$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BUNDLEACTIVATOR$4);
            }
            target.set(bundleActivator);
        }
    }
    
    /**
     * Unsets the "bundle-activator" element
     */
    public void unsetBundleActivator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BUNDLEACTIVATOR$4, 0);
        }
    }
    
    /**
     * Gets array of all "bundle-classPath" elements
     */
    public java.lang.String[] getBundleClassPathArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(BUNDLECLASSPATH$6, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "bundle-classPath" element
     */
    public java.lang.String getBundleClassPathArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BUNDLECLASSPATH$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "bundle-classPath" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetBundleClassPathArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(BUNDLECLASSPATH$6, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "bundle-classPath" element
     */
    public org.apache.xmlbeans.XmlString xgetBundleClassPathArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BUNDLECLASSPATH$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "bundle-classPath" element
     */
    public int sizeOfBundleClassPathArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BUNDLECLASSPATH$6);
        }
    }
    
    /**
     * Sets array of all "bundle-classPath" element
     */
    public void setBundleClassPathArray(java.lang.String[] bundleClassPathArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(bundleClassPathArray, BUNDLECLASSPATH$6);
        }
    }
    
    /**
     * Sets ith "bundle-classPath" element
     */
    public void setBundleClassPathArray(int i, java.lang.String bundleClassPath)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BUNDLECLASSPATH$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(bundleClassPath);
        }
    }
    
    /**
     * Sets (as xml) array of all "bundle-classPath" element
     */
    public void xsetBundleClassPathArray(org.apache.xmlbeans.XmlString[]bundleClassPathArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(bundleClassPathArray, BUNDLECLASSPATH$6);
        }
    }
    
    /**
     * Sets (as xml) ith "bundle-classPath" element
     */
    public void xsetBundleClassPathArray(int i, org.apache.xmlbeans.XmlString bundleClassPath)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BUNDLECLASSPATH$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(bundleClassPath);
        }
    }
    
    /**
     * Inserts the value as the ith "bundle-classPath" element
     */
    public void insertBundleClassPath(int i, java.lang.String bundleClassPath)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(BUNDLECLASSPATH$6, i);
            target.setStringValue(bundleClassPath);
        }
    }
    
    /**
     * Appends the value as the last "bundle-classPath" element
     */
    public void addBundleClassPath(java.lang.String bundleClassPath)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BUNDLECLASSPATH$6);
            target.setStringValue(bundleClassPath);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "bundle-classPath" element
     */
    public org.apache.xmlbeans.XmlString insertNewBundleClassPath(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(BUNDLECLASSPATH$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "bundle-classPath" element
     */
    public org.apache.xmlbeans.XmlString addNewBundleClassPath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BUNDLECLASSPATH$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "bundle-classPath" element
     */
    public void removeBundleClassPath(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BUNDLECLASSPATH$6, i);
        }
    }
    
    /**
     * Gets array of all "import-package" elements
     */
    public java.lang.String[] getImportPackageArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(IMPORTPACKAGE$8, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "import-package" element
     */
    public java.lang.String getImportPackageArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IMPORTPACKAGE$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "import-package" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetImportPackageArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(IMPORTPACKAGE$8, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "import-package" element
     */
    public org.apache.xmlbeans.XmlString xgetImportPackageArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IMPORTPACKAGE$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "import-package" element
     */
    public int sizeOfImportPackageArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IMPORTPACKAGE$8);
        }
    }
    
    /**
     * Sets array of all "import-package" element
     */
    public void setImportPackageArray(java.lang.String[] importPackageArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(importPackageArray, IMPORTPACKAGE$8);
        }
    }
    
    /**
     * Sets ith "import-package" element
     */
    public void setImportPackageArray(int i, java.lang.String importPackage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IMPORTPACKAGE$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(importPackage);
        }
    }
    
    /**
     * Sets (as xml) array of all "import-package" element
     */
    public void xsetImportPackageArray(org.apache.xmlbeans.XmlString[]importPackageArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(importPackageArray, IMPORTPACKAGE$8);
        }
    }
    
    /**
     * Sets (as xml) ith "import-package" element
     */
    public void xsetImportPackageArray(int i, org.apache.xmlbeans.XmlString importPackage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IMPORTPACKAGE$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(importPackage);
        }
    }
    
    /**
     * Inserts the value as the ith "import-package" element
     */
    public void insertImportPackage(int i, java.lang.String importPackage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(IMPORTPACKAGE$8, i);
            target.setStringValue(importPackage);
        }
    }
    
    /**
     * Appends the value as the last "import-package" element
     */
    public void addImportPackage(java.lang.String importPackage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IMPORTPACKAGE$8);
            target.setStringValue(importPackage);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "import-package" element
     */
    public org.apache.xmlbeans.XmlString insertNewImportPackage(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(IMPORTPACKAGE$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "import-package" element
     */
    public org.apache.xmlbeans.XmlString addNewImportPackage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(IMPORTPACKAGE$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "import-package" element
     */
    public void removeImportPackage(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IMPORTPACKAGE$8, i);
        }
    }
    
    /**
     * Gets array of all "export-package" elements
     */
    public java.lang.String[] getExportPackageArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(EXPORTPACKAGE$10, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "export-package" element
     */
    public java.lang.String getExportPackageArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXPORTPACKAGE$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "export-package" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetExportPackageArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(EXPORTPACKAGE$10, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "export-package" element
     */
    public org.apache.xmlbeans.XmlString xgetExportPackageArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXPORTPACKAGE$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "export-package" element
     */
    public int sizeOfExportPackageArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXPORTPACKAGE$10);
        }
    }
    
    /**
     * Sets array of all "export-package" element
     */
    public void setExportPackageArray(java.lang.String[] exportPackageArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(exportPackageArray, EXPORTPACKAGE$10);
        }
    }
    
    /**
     * Sets ith "export-package" element
     */
    public void setExportPackageArray(int i, java.lang.String exportPackage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXPORTPACKAGE$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(exportPackage);
        }
    }
    
    /**
     * Sets (as xml) array of all "export-package" element
     */
    public void xsetExportPackageArray(org.apache.xmlbeans.XmlString[]exportPackageArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(exportPackageArray, EXPORTPACKAGE$10);
        }
    }
    
    /**
     * Sets (as xml) ith "export-package" element
     */
    public void xsetExportPackageArray(int i, org.apache.xmlbeans.XmlString exportPackage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXPORTPACKAGE$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(exportPackage);
        }
    }
    
    /**
     * Inserts the value as the ith "export-package" element
     */
    public void insertExportPackage(int i, java.lang.String exportPackage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(EXPORTPACKAGE$10, i);
            target.setStringValue(exportPackage);
        }
    }
    
    /**
     * Appends the value as the last "export-package" element
     */
    public void addExportPackage(java.lang.String exportPackage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXPORTPACKAGE$10);
            target.setStringValue(exportPackage);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "export-package" element
     */
    public org.apache.xmlbeans.XmlString insertNewExportPackage(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(EXPORTPACKAGE$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "export-package" element
     */
    public org.apache.xmlbeans.XmlString addNewExportPackage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EXPORTPACKAGE$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "export-package" element
     */
    public void removeExportPackage(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXPORTPACKAGE$10, i);
        }
    }
    
    /**
     * Gets array of all "require-bundle" elements
     */
    public java.lang.String[] getRequireBundleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(REQUIREBUNDLE$12, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "require-bundle" element
     */
    public java.lang.String getRequireBundleArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REQUIREBUNDLE$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "require-bundle" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetRequireBundleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(REQUIREBUNDLE$12, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "require-bundle" element
     */
    public org.apache.xmlbeans.XmlString xgetRequireBundleArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REQUIREBUNDLE$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "require-bundle" element
     */
    public int sizeOfRequireBundleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REQUIREBUNDLE$12);
        }
    }
    
    /**
     * Sets array of all "require-bundle" element
     */
    public void setRequireBundleArray(java.lang.String[] requireBundleArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(requireBundleArray, REQUIREBUNDLE$12);
        }
    }
    
    /**
     * Sets ith "require-bundle" element
     */
    public void setRequireBundleArray(int i, java.lang.String requireBundle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REQUIREBUNDLE$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(requireBundle);
        }
    }
    
    /**
     * Sets (as xml) array of all "require-bundle" element
     */
    public void xsetRequireBundleArray(org.apache.xmlbeans.XmlString[]requireBundleArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(requireBundleArray, REQUIREBUNDLE$12);
        }
    }
    
    /**
     * Sets (as xml) ith "require-bundle" element
     */
    public void xsetRequireBundleArray(int i, org.apache.xmlbeans.XmlString requireBundle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REQUIREBUNDLE$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(requireBundle);
        }
    }
    
    /**
     * Inserts the value as the ith "require-bundle" element
     */
    public void insertRequireBundle(int i, java.lang.String requireBundle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(REQUIREBUNDLE$12, i);
            target.setStringValue(requireBundle);
        }
    }
    
    /**
     * Appends the value as the last "require-bundle" element
     */
    public void addRequireBundle(java.lang.String requireBundle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REQUIREBUNDLE$12);
            target.setStringValue(requireBundle);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "require-bundle" element
     */
    public org.apache.xmlbeans.XmlString insertNewRequireBundle(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(REQUIREBUNDLE$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "require-bundle" element
     */
    public org.apache.xmlbeans.XmlString addNewRequireBundle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REQUIREBUNDLE$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "require-bundle" element
     */
    public void removeRequireBundle(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REQUIREBUNDLE$12, i);
        }
    }
    
    /**
     * Gets array of all "dynamic-import-package" elements
     */
    public java.lang.String[] getDynamicImportPackageArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DYNAMICIMPORTPACKAGE$14, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "dynamic-import-package" element
     */
    public java.lang.String getDynamicImportPackageArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DYNAMICIMPORTPACKAGE$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "dynamic-import-package" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetDynamicImportPackageArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DYNAMICIMPORTPACKAGE$14, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "dynamic-import-package" element
     */
    public org.apache.xmlbeans.XmlString xgetDynamicImportPackageArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DYNAMICIMPORTPACKAGE$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "dynamic-import-package" element
     */
    public int sizeOfDynamicImportPackageArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DYNAMICIMPORTPACKAGE$14);
        }
    }
    
    /**
     * Sets array of all "dynamic-import-package" element
     */
    public void setDynamicImportPackageArray(java.lang.String[] dynamicImportPackageArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dynamicImportPackageArray, DYNAMICIMPORTPACKAGE$14);
        }
    }
    
    /**
     * Sets ith "dynamic-import-package" element
     */
    public void setDynamicImportPackageArray(int i, java.lang.String dynamicImportPackage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DYNAMICIMPORTPACKAGE$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(dynamicImportPackage);
        }
    }
    
    /**
     * Sets (as xml) array of all "dynamic-import-package" element
     */
    public void xsetDynamicImportPackageArray(org.apache.xmlbeans.XmlString[]dynamicImportPackageArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dynamicImportPackageArray, DYNAMICIMPORTPACKAGE$14);
        }
    }
    
    /**
     * Sets (as xml) ith "dynamic-import-package" element
     */
    public void xsetDynamicImportPackageArray(int i, org.apache.xmlbeans.XmlString dynamicImportPackage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DYNAMICIMPORTPACKAGE$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(dynamicImportPackage);
        }
    }
    
    /**
     * Inserts the value as the ith "dynamic-import-package" element
     */
    public void insertDynamicImportPackage(int i, java.lang.String dynamicImportPackage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(DYNAMICIMPORTPACKAGE$14, i);
            target.setStringValue(dynamicImportPackage);
        }
    }
    
    /**
     * Appends the value as the last "dynamic-import-package" element
     */
    public void addDynamicImportPackage(java.lang.String dynamicImportPackage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DYNAMICIMPORTPACKAGE$14);
            target.setStringValue(dynamicImportPackage);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "dynamic-import-package" element
     */
    public org.apache.xmlbeans.XmlString insertNewDynamicImportPackage(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(DYNAMICIMPORTPACKAGE$14, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "dynamic-import-package" element
     */
    public org.apache.xmlbeans.XmlString addNewDynamicImportPackage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DYNAMICIMPORTPACKAGE$14);
            return target;
        }
    }
    
    /**
     * Removes the ith "dynamic-import-package" element
     */
    public void removeDynamicImportPackage(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DYNAMICIMPORTPACKAGE$14, i);
        }
    }
    
    /**
     * Gets the "hidden-classes" element
     */
    public org.apache.geronimo.deployment.xbeans.ClassFilterType getHiddenClasses()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.xbeans.ClassFilterType target = null;
            target = (org.apache.geronimo.deployment.xbeans.ClassFilterType)get_store().find_element_user(HIDDENCLASSES$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "hidden-classes" element
     */
    public boolean isSetHiddenClasses()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HIDDENCLASSES$16) != 0;
        }
    }
    
    /**
     * Sets the "hidden-classes" element
     */
    public void setHiddenClasses(org.apache.geronimo.deployment.xbeans.ClassFilterType hiddenClasses)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.xbeans.ClassFilterType target = null;
            target = (org.apache.geronimo.deployment.xbeans.ClassFilterType)get_store().find_element_user(HIDDENCLASSES$16, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.deployment.xbeans.ClassFilterType)get_store().add_element_user(HIDDENCLASSES$16);
            }
            target.set(hiddenClasses);
        }
    }
    
    /**
     * Appends and returns a new empty "hidden-classes" element
     */
    public org.apache.geronimo.deployment.xbeans.ClassFilterType addNewHiddenClasses()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.xbeans.ClassFilterType target = null;
            target = (org.apache.geronimo.deployment.xbeans.ClassFilterType)get_store().add_element_user(HIDDENCLASSES$16);
            return target;
        }
    }
    
    /**
     * Unsets the "hidden-classes" element
     */
    public void unsetHiddenClasses()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HIDDENCLASSES$16, 0);
        }
    }
    
    /**
     * Gets the "non-overridable-classes" element
     */
    public org.apache.geronimo.deployment.xbeans.ClassFilterType getNonOverridableClasses()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.xbeans.ClassFilterType target = null;
            target = (org.apache.geronimo.deployment.xbeans.ClassFilterType)get_store().find_element_user(NONOVERRIDABLECLASSES$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "non-overridable-classes" element
     */
    public boolean isSetNonOverridableClasses()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NONOVERRIDABLECLASSES$18) != 0;
        }
    }
    
    /**
     * Sets the "non-overridable-classes" element
     */
    public void setNonOverridableClasses(org.apache.geronimo.deployment.xbeans.ClassFilterType nonOverridableClasses)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.xbeans.ClassFilterType target = null;
            target = (org.apache.geronimo.deployment.xbeans.ClassFilterType)get_store().find_element_user(NONOVERRIDABLECLASSES$18, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.deployment.xbeans.ClassFilterType)get_store().add_element_user(NONOVERRIDABLECLASSES$18);
            }
            target.set(nonOverridableClasses);
        }
    }
    
    /**
     * Appends and returns a new empty "non-overridable-classes" element
     */
    public org.apache.geronimo.deployment.xbeans.ClassFilterType addNewNonOverridableClasses()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.xbeans.ClassFilterType target = null;
            target = (org.apache.geronimo.deployment.xbeans.ClassFilterType)get_store().add_element_user(NONOVERRIDABLECLASSES$18);
            return target;
        }
    }
    
    /**
     * Unsets the "non-overridable-classes" element
     */
    public void unsetNonOverridableClasses()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NONOVERRIDABLECLASSES$18, 0);
        }
    }
    
    /**
     * Gets the "private-classes" element
     */
    public org.apache.geronimo.deployment.xbeans.ClassFilterType getPrivateClasses()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.xbeans.ClassFilterType target = null;
            target = (org.apache.geronimo.deployment.xbeans.ClassFilterType)get_store().find_element_user(PRIVATECLASSES$20, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "private-classes" element
     */
    public boolean isSetPrivateClasses()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRIVATECLASSES$20) != 0;
        }
    }
    
    /**
     * Sets the "private-classes" element
     */
    public void setPrivateClasses(org.apache.geronimo.deployment.xbeans.ClassFilterType privateClasses)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.xbeans.ClassFilterType target = null;
            target = (org.apache.geronimo.deployment.xbeans.ClassFilterType)get_store().find_element_user(PRIVATECLASSES$20, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.deployment.xbeans.ClassFilterType)get_store().add_element_user(PRIVATECLASSES$20);
            }
            target.set(privateClasses);
        }
    }
    
    /**
     * Appends and returns a new empty "private-classes" element
     */
    public org.apache.geronimo.deployment.xbeans.ClassFilterType addNewPrivateClasses()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.xbeans.ClassFilterType target = null;
            target = (org.apache.geronimo.deployment.xbeans.ClassFilterType)get_store().add_element_user(PRIVATECLASSES$20);
            return target;
        }
    }
    
    /**
     * Unsets the "private-classes" element
     */
    public void unsetPrivateClasses()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRIVATECLASSES$20, 0);
        }
    }
    
    /**
     * Gets the "inverse-classloading" element
     */
    public org.apache.geronimo.deployment.xbeans.EmptyType getInverseClassloading()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.xbeans.EmptyType target = null;
            target = (org.apache.geronimo.deployment.xbeans.EmptyType)get_store().find_element_user(INVERSECLASSLOADING$22, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "inverse-classloading" element
     */
    public boolean isSetInverseClassloading()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INVERSECLASSLOADING$22) != 0;
        }
    }
    
    /**
     * Sets the "inverse-classloading" element
     */
    public void setInverseClassloading(org.apache.geronimo.deployment.xbeans.EmptyType inverseClassloading)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.xbeans.EmptyType target = null;
            target = (org.apache.geronimo.deployment.xbeans.EmptyType)get_store().find_element_user(INVERSECLASSLOADING$22, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.deployment.xbeans.EmptyType)get_store().add_element_user(INVERSECLASSLOADING$22);
            }
            target.set(inverseClassloading);
        }
    }
    
    /**
     * Appends and returns a new empty "inverse-classloading" element
     */
    public org.apache.geronimo.deployment.xbeans.EmptyType addNewInverseClassloading()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.xbeans.EmptyType target = null;
            target = (org.apache.geronimo.deployment.xbeans.EmptyType)get_store().add_element_user(INVERSECLASSLOADING$22);
            return target;
        }
    }
    
    /**
     * Unsets the "inverse-classloading" element
     */
    public void unsetInverseClassloading()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INVERSECLASSLOADING$22, 0);
        }
    }
    
    /**
     * Gets the "suppress-default-environment" element
     */
    public org.apache.geronimo.deployment.xbeans.EmptyType getSuppressDefaultEnvironment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.xbeans.EmptyType target = null;
            target = (org.apache.geronimo.deployment.xbeans.EmptyType)get_store().find_element_user(SUPPRESSDEFAULTENVIRONMENT$24, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "suppress-default-environment" element
     */
    public boolean isSetSuppressDefaultEnvironment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUPPRESSDEFAULTENVIRONMENT$24) != 0;
        }
    }
    
    /**
     * Sets the "suppress-default-environment" element
     */
    public void setSuppressDefaultEnvironment(org.apache.geronimo.deployment.xbeans.EmptyType suppressDefaultEnvironment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.xbeans.EmptyType target = null;
            target = (org.apache.geronimo.deployment.xbeans.EmptyType)get_store().find_element_user(SUPPRESSDEFAULTENVIRONMENT$24, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.deployment.xbeans.EmptyType)get_store().add_element_user(SUPPRESSDEFAULTENVIRONMENT$24);
            }
            target.set(suppressDefaultEnvironment);
        }
    }
    
    /**
     * Appends and returns a new empty "suppress-default-environment" element
     */
    public org.apache.geronimo.deployment.xbeans.EmptyType addNewSuppressDefaultEnvironment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.xbeans.EmptyType target = null;
            target = (org.apache.geronimo.deployment.xbeans.EmptyType)get_store().add_element_user(SUPPRESSDEFAULTENVIRONMENT$24);
            return target;
        }
    }
    
    /**
     * Unsets the "suppress-default-environment" element
     */
    public void unsetSuppressDefaultEnvironment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUPPRESSDEFAULTENVIRONMENT$24, 0);
        }
    }
}
