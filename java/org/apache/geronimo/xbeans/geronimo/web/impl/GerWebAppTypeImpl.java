/*
 * XML Type:  web-appType
 * Namespace: http://geronimo.apache.org/xml/ns/j2ee/web-2.0.1
 * Java type: org.apache.geronimo.xbeans.geronimo.web.GerWebAppType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.geronimo.web.impl;
/**
 * An XML web-appType(@http://geronimo.apache.org/xml/ns/j2ee/web-2.0.1).
 *
 * This is a complex type.
 */
public class GerWebAppTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.xbeans.geronimo.web.GerWebAppType
{
    private static final long serialVersionUID = 1L;
    
    public GerWebAppTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENVIRONMENT$0 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/deployment-1.2", "environment");
    private static final javax.xml.namespace.QName MODULE$2 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/j2ee/web-2.0.1", "module");
    private static final javax.xml.namespace.QName CONTEXTROOT$4 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/j2ee/web-2.0.1", "context-root");
    private static final javax.xml.namespace.QName WORKDIR$6 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/j2ee/web-2.0.1", "work-dir");
    private static final javax.xml.namespace.QName WEBCONTAINER$8 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "web-container");
    private static final javax.xml.namespace.QName CONTAINERCONFIG$10 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/j2ee/web-2.0.1", "container-config");
    private static final javax.xml.namespace.QName ABSTRACTNAMINGENTRY$12 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "abstract-naming-entry");
    private static final org.apache.xmlbeans.QNameSet ABSTRACTNAMINGENTRY$13 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "persistence-unit-ref"),
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "gbean-ref"),
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "persistence-context-ref"),
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "abstract-naming-entry"),
    });
    private static final javax.xml.namespace.QName ENVENTRY$14 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "env-entry");
    private static final javax.xml.namespace.QName EJBREF$16 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "ejb-ref");
    private static final javax.xml.namespace.QName EJBLOCALREF$18 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "ejb-local-ref");
    private static final javax.xml.namespace.QName SERVICEREF$20 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "service-ref");
    private static final javax.xml.namespace.QName RESOURCEREF$22 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "resource-ref");
    private static final javax.xml.namespace.QName RESOURCEENVREF$24 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "resource-env-ref");
    private static final javax.xml.namespace.QName MESSAGEDESTINATION$26 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "message-destination");
    private static final javax.xml.namespace.QName SECURITYREALMNAME$28 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/j2ee/web-2.0.1", "security-realm-name");
    private static final javax.xml.namespace.QName AUTHENTICATION$30 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/j2ee/web-2.0.1", "authentication");
    private static final javax.xml.namespace.QName SECURITY$32 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/j2ee/application-2.0", "security");
    private static final javax.xml.namespace.QName SERVICE$34 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/deployment-1.2", "service");
    private static final org.apache.xmlbeans.QNameSet SERVICE$35 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/deployment-1.2", "gbean"),
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/deployment-1.2", "service"),
    });
    
    
    /**
     * Gets the "environment" element
     */
    public org.apache.geronimo.deployment.xbeans.EnvironmentType getEnvironment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.xbeans.EnvironmentType target = null;
            target = (org.apache.geronimo.deployment.xbeans.EnvironmentType)get_store().find_element_user(ENVIRONMENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "environment" element
     */
    public boolean isSetEnvironment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENVIRONMENT$0) != 0;
        }
    }
    
    /**
     * Sets the "environment" element
     */
    public void setEnvironment(org.apache.geronimo.deployment.xbeans.EnvironmentType environment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.xbeans.EnvironmentType target = null;
            target = (org.apache.geronimo.deployment.xbeans.EnvironmentType)get_store().find_element_user(ENVIRONMENT$0, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.deployment.xbeans.EnvironmentType)get_store().add_element_user(ENVIRONMENT$0);
            }
            target.set(environment);
        }
    }
    
    /**
     * Appends and returns a new empty "environment" element
     */
    public org.apache.geronimo.deployment.xbeans.EnvironmentType addNewEnvironment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.xbeans.EnvironmentType target = null;
            target = (org.apache.geronimo.deployment.xbeans.EnvironmentType)get_store().add_element_user(ENVIRONMENT$0);
            return target;
        }
    }
    
    /**
     * Unsets the "environment" element
     */
    public void unsetEnvironment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENVIRONMENT$0, 0);
        }
    }
    
    /**
     * Gets array of all "module" elements
     */
    public org.apache.geronimo.xbeans.geronimo.web.GerModuleType[] getModuleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MODULE$2, targetList);
            org.apache.geronimo.xbeans.geronimo.web.GerModuleType[] result = new org.apache.geronimo.xbeans.geronimo.web.GerModuleType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "module" element
     */
    public org.apache.geronimo.xbeans.geronimo.web.GerModuleType getModuleArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.web.GerModuleType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.web.GerModuleType)get_store().find_element_user(MODULE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "module" element
     */
    public int sizeOfModuleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MODULE$2);
        }
    }
    
    /**
     * Sets array of all "module" element
     */
    public void setModuleArray(org.apache.geronimo.xbeans.geronimo.web.GerModuleType[] moduleArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(moduleArray, MODULE$2);
        }
    }
    
    /**
     * Sets ith "module" element
     */
    public void setModuleArray(int i, org.apache.geronimo.xbeans.geronimo.web.GerModuleType module)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.web.GerModuleType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.web.GerModuleType)get_store().find_element_user(MODULE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(module);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "module" element
     */
    public org.apache.geronimo.xbeans.geronimo.web.GerModuleType insertNewModule(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.web.GerModuleType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.web.GerModuleType)get_store().insert_element_user(MODULE$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "module" element
     */
    public org.apache.geronimo.xbeans.geronimo.web.GerModuleType addNewModule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.web.GerModuleType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.web.GerModuleType)get_store().add_element_user(MODULE$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "module" element
     */
    public void removeModule(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MODULE$2, i);
        }
    }
    
    /**
     * Gets the "context-root" element
     */
    public java.lang.String getContextRoot()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTEXTROOT$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "context-root" element
     */
    public org.apache.xmlbeans.XmlString xgetContextRoot()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTEXTROOT$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "context-root" element
     */
    public boolean isSetContextRoot()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTEXTROOT$4) != 0;
        }
    }
    
    /**
     * Sets the "context-root" element
     */
    public void setContextRoot(java.lang.String contextRoot)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTEXTROOT$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONTEXTROOT$4);
            }
            target.setStringValue(contextRoot);
        }
    }
    
    /**
     * Sets (as xml) the "context-root" element
     */
    public void xsetContextRoot(org.apache.xmlbeans.XmlString contextRoot)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTEXTROOT$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONTEXTROOT$4);
            }
            target.set(contextRoot);
        }
    }
    
    /**
     * Unsets the "context-root" element
     */
    public void unsetContextRoot()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTEXTROOT$4, 0);
        }
    }
    
    /**
     * Gets the "work-dir" element
     */
    public java.lang.String getWorkDir()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WORKDIR$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "work-dir" element
     */
    public org.apache.xmlbeans.XmlString xgetWorkDir()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WORKDIR$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "work-dir" element
     */
    public boolean isSetWorkDir()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WORKDIR$6) != 0;
        }
    }
    
    /**
     * Sets the "work-dir" element
     */
    public void setWorkDir(java.lang.String workDir)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WORKDIR$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WORKDIR$6);
            }
            target.setStringValue(workDir);
        }
    }
    
    /**
     * Sets (as xml) the "work-dir" element
     */
    public void xsetWorkDir(org.apache.xmlbeans.XmlString workDir)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WORKDIR$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(WORKDIR$6);
            }
            target.set(workDir);
        }
    }
    
    /**
     * Unsets the "work-dir" element
     */
    public void unsetWorkDir()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WORKDIR$6, 0);
        }
    }
    
    /**
     * Gets the "web-container" element
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerGbeanLocatorType getWebContainer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerGbeanLocatorType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerGbeanLocatorType)get_store().find_element_user(WEBCONTAINER$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "web-container" element
     */
    public boolean isSetWebContainer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WEBCONTAINER$8) != 0;
        }
    }
    
    /**
     * Sets the "web-container" element
     */
    public void setWebContainer(org.apache.geronimo.xbeans.geronimo.naming.GerGbeanLocatorType webContainer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerGbeanLocatorType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerGbeanLocatorType)get_store().find_element_user(WEBCONTAINER$8, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.xbeans.geronimo.naming.GerGbeanLocatorType)get_store().add_element_user(WEBCONTAINER$8);
            }
            target.set(webContainer);
        }
    }
    
    /**
     * Appends and returns a new empty "web-container" element
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerGbeanLocatorType addNewWebContainer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerGbeanLocatorType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerGbeanLocatorType)get_store().add_element_user(WEBCONTAINER$8);
            return target;
        }
    }
    
    /**
     * Unsets the "web-container" element
     */
    public void unsetWebContainer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WEBCONTAINER$8, 0);
        }
    }
    
    /**
     * Gets the "container-config" element
     */
    public org.apache.geronimo.xbeans.geronimo.web.GerContainerConfigType getContainerConfig()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.web.GerContainerConfigType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.web.GerContainerConfigType)get_store().find_element_user(CONTAINERCONFIG$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "container-config" element
     */
    public boolean isSetContainerConfig()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTAINERCONFIG$10) != 0;
        }
    }
    
    /**
     * Sets the "container-config" element
     */
    public void setContainerConfig(org.apache.geronimo.xbeans.geronimo.web.GerContainerConfigType containerConfig)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.web.GerContainerConfigType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.web.GerContainerConfigType)get_store().find_element_user(CONTAINERCONFIG$10, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.xbeans.geronimo.web.GerContainerConfigType)get_store().add_element_user(CONTAINERCONFIG$10);
            }
            target.set(containerConfig);
        }
    }
    
    /**
     * Appends and returns a new empty "container-config" element
     */
    public org.apache.geronimo.xbeans.geronimo.web.GerContainerConfigType addNewContainerConfig()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.web.GerContainerConfigType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.web.GerContainerConfigType)get_store().add_element_user(CONTAINERCONFIG$10);
            return target;
        }
    }
    
    /**
     * Unsets the "container-config" element
     */
    public void unsetContainerConfig()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTAINERCONFIG$10, 0);
        }
    }
    
    /**
     * Gets array of all "abstract-naming-entry" elements
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerAbstractNamingEntryType[] getAbstractNamingEntryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ABSTRACTNAMINGENTRY$13, targetList);
            org.apache.geronimo.xbeans.geronimo.naming.GerAbstractNamingEntryType[] result = new org.apache.geronimo.xbeans.geronimo.naming.GerAbstractNamingEntryType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "abstract-naming-entry" element
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerAbstractNamingEntryType getAbstractNamingEntryArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerAbstractNamingEntryType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerAbstractNamingEntryType)get_store().find_element_user(ABSTRACTNAMINGENTRY$13, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "abstract-naming-entry" element
     */
    public int sizeOfAbstractNamingEntryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ABSTRACTNAMINGENTRY$13);
        }
    }
    
    /**
     * Sets array of all "abstract-naming-entry" element
     */
    public void setAbstractNamingEntryArray(org.apache.geronimo.xbeans.geronimo.naming.GerAbstractNamingEntryType[] abstractNamingEntryArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(abstractNamingEntryArray, ABSTRACTNAMINGENTRY$12, ABSTRACTNAMINGENTRY$13);
        }
    }
    
    /**
     * Sets ith "abstract-naming-entry" element
     */
    public void setAbstractNamingEntryArray(int i, org.apache.geronimo.xbeans.geronimo.naming.GerAbstractNamingEntryType abstractNamingEntry)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerAbstractNamingEntryType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerAbstractNamingEntryType)get_store().find_element_user(ABSTRACTNAMINGENTRY$13, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(abstractNamingEntry);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "abstract-naming-entry" element
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerAbstractNamingEntryType insertNewAbstractNamingEntry(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerAbstractNamingEntryType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerAbstractNamingEntryType)get_store().insert_element_user(ABSTRACTNAMINGENTRY$13, ABSTRACTNAMINGENTRY$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "abstract-naming-entry" element
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerAbstractNamingEntryType addNewAbstractNamingEntry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerAbstractNamingEntryType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerAbstractNamingEntryType)get_store().add_element_user(ABSTRACTNAMINGENTRY$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "abstract-naming-entry" element
     */
    public void removeAbstractNamingEntry(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ABSTRACTNAMINGENTRY$13, i);
        }
    }
    
    /**
     * Gets array of all "env-entry" elements
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerEnvEntryType[] getEnvEntryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ENVENTRY$14, targetList);
            org.apache.geronimo.xbeans.geronimo.naming.GerEnvEntryType[] result = new org.apache.geronimo.xbeans.geronimo.naming.GerEnvEntryType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "env-entry" element
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerEnvEntryType getEnvEntryArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerEnvEntryType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerEnvEntryType)get_store().find_element_user(ENVENTRY$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "env-entry" element
     */
    public int sizeOfEnvEntryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENVENTRY$14);
        }
    }
    
    /**
     * Sets array of all "env-entry" element
     */
    public void setEnvEntryArray(org.apache.geronimo.xbeans.geronimo.naming.GerEnvEntryType[] envEntryArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(envEntryArray, ENVENTRY$14);
        }
    }
    
    /**
     * Sets ith "env-entry" element
     */
    public void setEnvEntryArray(int i, org.apache.geronimo.xbeans.geronimo.naming.GerEnvEntryType envEntry)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerEnvEntryType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerEnvEntryType)get_store().find_element_user(ENVENTRY$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(envEntry);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "env-entry" element
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerEnvEntryType insertNewEnvEntry(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerEnvEntryType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerEnvEntryType)get_store().insert_element_user(ENVENTRY$14, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "env-entry" element
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerEnvEntryType addNewEnvEntry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerEnvEntryType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerEnvEntryType)get_store().add_element_user(ENVENTRY$14);
            return target;
        }
    }
    
    /**
     * Removes the ith "env-entry" element
     */
    public void removeEnvEntry(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENVENTRY$14, i);
        }
    }
    
    /**
     * Gets array of all "ejb-ref" elements
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerEjbRefType[] getEjbRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(EJBREF$16, targetList);
            org.apache.geronimo.xbeans.geronimo.naming.GerEjbRefType[] result = new org.apache.geronimo.xbeans.geronimo.naming.GerEjbRefType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ejb-ref" element
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerEjbRefType getEjbRefArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerEjbRefType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerEjbRefType)get_store().find_element_user(EJBREF$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ejb-ref" element
     */
    public int sizeOfEjbRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EJBREF$16);
        }
    }
    
    /**
     * Sets array of all "ejb-ref" element
     */
    public void setEjbRefArray(org.apache.geronimo.xbeans.geronimo.naming.GerEjbRefType[] ejbRefArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(ejbRefArray, EJBREF$16);
        }
    }
    
    /**
     * Sets ith "ejb-ref" element
     */
    public void setEjbRefArray(int i, org.apache.geronimo.xbeans.geronimo.naming.GerEjbRefType ejbRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerEjbRefType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerEjbRefType)get_store().find_element_user(EJBREF$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(ejbRef);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ejb-ref" element
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerEjbRefType insertNewEjbRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerEjbRefType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerEjbRefType)get_store().insert_element_user(EJBREF$16, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ejb-ref" element
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerEjbRefType addNewEjbRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerEjbRefType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerEjbRefType)get_store().add_element_user(EJBREF$16);
            return target;
        }
    }
    
    /**
     * Removes the ith "ejb-ref" element
     */
    public void removeEjbRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EJBREF$16, i);
        }
    }
    
    /**
     * Gets array of all "ejb-local-ref" elements
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerEjbLocalRefType[] getEjbLocalRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(EJBLOCALREF$18, targetList);
            org.apache.geronimo.xbeans.geronimo.naming.GerEjbLocalRefType[] result = new org.apache.geronimo.xbeans.geronimo.naming.GerEjbLocalRefType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ejb-local-ref" element
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerEjbLocalRefType getEjbLocalRefArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerEjbLocalRefType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerEjbLocalRefType)get_store().find_element_user(EJBLOCALREF$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ejb-local-ref" element
     */
    public int sizeOfEjbLocalRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EJBLOCALREF$18);
        }
    }
    
    /**
     * Sets array of all "ejb-local-ref" element
     */
    public void setEjbLocalRefArray(org.apache.geronimo.xbeans.geronimo.naming.GerEjbLocalRefType[] ejbLocalRefArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(ejbLocalRefArray, EJBLOCALREF$18);
        }
    }
    
    /**
     * Sets ith "ejb-local-ref" element
     */
    public void setEjbLocalRefArray(int i, org.apache.geronimo.xbeans.geronimo.naming.GerEjbLocalRefType ejbLocalRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerEjbLocalRefType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerEjbLocalRefType)get_store().find_element_user(EJBLOCALREF$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(ejbLocalRef);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ejb-local-ref" element
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerEjbLocalRefType insertNewEjbLocalRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerEjbLocalRefType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerEjbLocalRefType)get_store().insert_element_user(EJBLOCALREF$18, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ejb-local-ref" element
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerEjbLocalRefType addNewEjbLocalRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerEjbLocalRefType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerEjbLocalRefType)get_store().add_element_user(EJBLOCALREF$18);
            return target;
        }
    }
    
    /**
     * Removes the ith "ejb-local-ref" element
     */
    public void removeEjbLocalRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EJBLOCALREF$18, i);
        }
    }
    
    /**
     * Gets array of all "service-ref" elements
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerServiceRefType[] getServiceRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SERVICEREF$20, targetList);
            org.apache.geronimo.xbeans.geronimo.naming.GerServiceRefType[] result = new org.apache.geronimo.xbeans.geronimo.naming.GerServiceRefType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "service-ref" element
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerServiceRefType getServiceRefArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerServiceRefType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerServiceRefType)get_store().find_element_user(SERVICEREF$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "service-ref" element
     */
    public int sizeOfServiceRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SERVICEREF$20);
        }
    }
    
    /**
     * Sets array of all "service-ref" element
     */
    public void setServiceRefArray(org.apache.geronimo.xbeans.geronimo.naming.GerServiceRefType[] serviceRefArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(serviceRefArray, SERVICEREF$20);
        }
    }
    
    /**
     * Sets ith "service-ref" element
     */
    public void setServiceRefArray(int i, org.apache.geronimo.xbeans.geronimo.naming.GerServiceRefType serviceRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerServiceRefType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerServiceRefType)get_store().find_element_user(SERVICEREF$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(serviceRef);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "service-ref" element
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerServiceRefType insertNewServiceRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerServiceRefType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerServiceRefType)get_store().insert_element_user(SERVICEREF$20, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "service-ref" element
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerServiceRefType addNewServiceRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerServiceRefType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerServiceRefType)get_store().add_element_user(SERVICEREF$20);
            return target;
        }
    }
    
    /**
     * Removes the ith "service-ref" element
     */
    public void removeServiceRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SERVICEREF$20, i);
        }
    }
    
    /**
     * Gets array of all "resource-ref" elements
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerResourceRefType[] getResourceRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RESOURCEREF$22, targetList);
            org.apache.geronimo.xbeans.geronimo.naming.GerResourceRefType[] result = new org.apache.geronimo.xbeans.geronimo.naming.GerResourceRefType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "resource-ref" element
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerResourceRefType getResourceRefArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerResourceRefType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerResourceRefType)get_store().find_element_user(RESOURCEREF$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "resource-ref" element
     */
    public int sizeOfResourceRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESOURCEREF$22);
        }
    }
    
    /**
     * Sets array of all "resource-ref" element
     */
    public void setResourceRefArray(org.apache.geronimo.xbeans.geronimo.naming.GerResourceRefType[] resourceRefArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(resourceRefArray, RESOURCEREF$22);
        }
    }
    
    /**
     * Sets ith "resource-ref" element
     */
    public void setResourceRefArray(int i, org.apache.geronimo.xbeans.geronimo.naming.GerResourceRefType resourceRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerResourceRefType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerResourceRefType)get_store().find_element_user(RESOURCEREF$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(resourceRef);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "resource-ref" element
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerResourceRefType insertNewResourceRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerResourceRefType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerResourceRefType)get_store().insert_element_user(RESOURCEREF$22, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "resource-ref" element
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerResourceRefType addNewResourceRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerResourceRefType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerResourceRefType)get_store().add_element_user(RESOURCEREF$22);
            return target;
        }
    }
    
    /**
     * Removes the ith "resource-ref" element
     */
    public void removeResourceRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESOURCEREF$22, i);
        }
    }
    
    /**
     * Gets array of all "resource-env-ref" elements
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerResourceEnvRefType[] getResourceEnvRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RESOURCEENVREF$24, targetList);
            org.apache.geronimo.xbeans.geronimo.naming.GerResourceEnvRefType[] result = new org.apache.geronimo.xbeans.geronimo.naming.GerResourceEnvRefType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "resource-env-ref" element
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerResourceEnvRefType getResourceEnvRefArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerResourceEnvRefType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerResourceEnvRefType)get_store().find_element_user(RESOURCEENVREF$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "resource-env-ref" element
     */
    public int sizeOfResourceEnvRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESOURCEENVREF$24);
        }
    }
    
    /**
     * Sets array of all "resource-env-ref" element
     */
    public void setResourceEnvRefArray(org.apache.geronimo.xbeans.geronimo.naming.GerResourceEnvRefType[] resourceEnvRefArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(resourceEnvRefArray, RESOURCEENVREF$24);
        }
    }
    
    /**
     * Sets ith "resource-env-ref" element
     */
    public void setResourceEnvRefArray(int i, org.apache.geronimo.xbeans.geronimo.naming.GerResourceEnvRefType resourceEnvRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerResourceEnvRefType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerResourceEnvRefType)get_store().find_element_user(RESOURCEENVREF$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(resourceEnvRef);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "resource-env-ref" element
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerResourceEnvRefType insertNewResourceEnvRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerResourceEnvRefType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerResourceEnvRefType)get_store().insert_element_user(RESOURCEENVREF$24, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "resource-env-ref" element
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerResourceEnvRefType addNewResourceEnvRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerResourceEnvRefType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerResourceEnvRefType)get_store().add_element_user(RESOURCEENVREF$24);
            return target;
        }
    }
    
    /**
     * Removes the ith "resource-env-ref" element
     */
    public void removeResourceEnvRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESOURCEENVREF$24, i);
        }
    }
    
    /**
     * Gets array of all "message-destination" elements
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerMessageDestinationType[] getMessageDestinationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MESSAGEDESTINATION$26, targetList);
            org.apache.geronimo.xbeans.geronimo.naming.GerMessageDestinationType[] result = new org.apache.geronimo.xbeans.geronimo.naming.GerMessageDestinationType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "message-destination" element
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerMessageDestinationType getMessageDestinationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerMessageDestinationType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerMessageDestinationType)get_store().find_element_user(MESSAGEDESTINATION$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "message-destination" element
     */
    public int sizeOfMessageDestinationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MESSAGEDESTINATION$26);
        }
    }
    
    /**
     * Sets array of all "message-destination" element
     */
    public void setMessageDestinationArray(org.apache.geronimo.xbeans.geronimo.naming.GerMessageDestinationType[] messageDestinationArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(messageDestinationArray, MESSAGEDESTINATION$26);
        }
    }
    
    /**
     * Sets ith "message-destination" element
     */
    public void setMessageDestinationArray(int i, org.apache.geronimo.xbeans.geronimo.naming.GerMessageDestinationType messageDestination)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerMessageDestinationType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerMessageDestinationType)get_store().find_element_user(MESSAGEDESTINATION$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(messageDestination);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "message-destination" element
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerMessageDestinationType insertNewMessageDestination(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerMessageDestinationType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerMessageDestinationType)get_store().insert_element_user(MESSAGEDESTINATION$26, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "message-destination" element
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerMessageDestinationType addNewMessageDestination()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerMessageDestinationType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerMessageDestinationType)get_store().add_element_user(MESSAGEDESTINATION$26);
            return target;
        }
    }
    
    /**
     * Removes the ith "message-destination" element
     */
    public void removeMessageDestination(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MESSAGEDESTINATION$26, i);
        }
    }
    
    /**
     * Gets the "security-realm-name" element
     */
    public java.lang.String getSecurityRealmName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SECURITYREALMNAME$28, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "security-realm-name" element
     */
    public org.apache.xmlbeans.XmlString xgetSecurityRealmName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SECURITYREALMNAME$28, 0);
            return target;
        }
    }
    
    /**
     * True if has "security-realm-name" element
     */
    public boolean isSetSecurityRealmName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SECURITYREALMNAME$28) != 0;
        }
    }
    
    /**
     * Sets the "security-realm-name" element
     */
    public void setSecurityRealmName(java.lang.String securityRealmName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SECURITYREALMNAME$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SECURITYREALMNAME$28);
            }
            target.setStringValue(securityRealmName);
        }
    }
    
    /**
     * Sets (as xml) the "security-realm-name" element
     */
    public void xsetSecurityRealmName(org.apache.xmlbeans.XmlString securityRealmName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SECURITYREALMNAME$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SECURITYREALMNAME$28);
            }
            target.set(securityRealmName);
        }
    }
    
    /**
     * Unsets the "security-realm-name" element
     */
    public void unsetSecurityRealmName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SECURITYREALMNAME$28, 0);
        }
    }
    
    /**
     * Gets the "authentication" element
     */
    public org.apache.geronimo.xbeans.geronimo.web.GerAuthenticationType getAuthentication()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.web.GerAuthenticationType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.web.GerAuthenticationType)get_store().find_element_user(AUTHENTICATION$30, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "authentication" element
     */
    public boolean isSetAuthentication()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AUTHENTICATION$30) != 0;
        }
    }
    
    /**
     * Sets the "authentication" element
     */
    public void setAuthentication(org.apache.geronimo.xbeans.geronimo.web.GerAuthenticationType authentication)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.web.GerAuthenticationType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.web.GerAuthenticationType)get_store().find_element_user(AUTHENTICATION$30, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.xbeans.geronimo.web.GerAuthenticationType)get_store().add_element_user(AUTHENTICATION$30);
            }
            target.set(authentication);
        }
    }
    
    /**
     * Appends and returns a new empty "authentication" element
     */
    public org.apache.geronimo.xbeans.geronimo.web.GerAuthenticationType addNewAuthentication()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.web.GerAuthenticationType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.web.GerAuthenticationType)get_store().add_element_user(AUTHENTICATION$30);
            return target;
        }
    }
    
    /**
     * Unsets the "authentication" element
     */
    public void unsetAuthentication()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AUTHENTICATION$30, 0);
        }
    }
    
    /**
     * Gets the "security" element
     */
    public org.apache.geronimo.xbeans.geronimo.j2ee.GerAbstractSecurityType getSecurity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.j2ee.GerAbstractSecurityType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.j2ee.GerAbstractSecurityType)get_store().find_element_user(SECURITY$32, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "security" element
     */
    public boolean isSetSecurity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SECURITY$32) != 0;
        }
    }
    
    /**
     * Sets the "security" element
     */
    public void setSecurity(org.apache.geronimo.xbeans.geronimo.j2ee.GerAbstractSecurityType security)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.j2ee.GerAbstractSecurityType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.j2ee.GerAbstractSecurityType)get_store().find_element_user(SECURITY$32, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.xbeans.geronimo.j2ee.GerAbstractSecurityType)get_store().add_element_user(SECURITY$32);
            }
            target.set(security);
        }
    }
    
    /**
     * Appends and returns a new empty "security" element
     */
    public org.apache.geronimo.xbeans.geronimo.j2ee.GerAbstractSecurityType addNewSecurity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.j2ee.GerAbstractSecurityType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.j2ee.GerAbstractSecurityType)get_store().add_element_user(SECURITY$32);
            return target;
        }
    }
    
    /**
     * Unsets the "security" element
     */
    public void unsetSecurity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SECURITY$32, 0);
        }
    }
    
    /**
     * Gets array of all "service" elements
     */
    public org.apache.geronimo.deployment.xbeans.AbstractServiceType[] getServiceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SERVICE$35, targetList);
            org.apache.geronimo.deployment.xbeans.AbstractServiceType[] result = new org.apache.geronimo.deployment.xbeans.AbstractServiceType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "service" element
     */
    public org.apache.geronimo.deployment.xbeans.AbstractServiceType getServiceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.xbeans.AbstractServiceType target = null;
            target = (org.apache.geronimo.deployment.xbeans.AbstractServiceType)get_store().find_element_user(SERVICE$35, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "service" element
     */
    public int sizeOfServiceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SERVICE$35);
        }
    }
    
    /**
     * Sets array of all "service" element
     */
    public void setServiceArray(org.apache.geronimo.deployment.xbeans.AbstractServiceType[] serviceArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(serviceArray, SERVICE$34, SERVICE$35);
        }
    }
    
    /**
     * Sets ith "service" element
     */
    public void setServiceArray(int i, org.apache.geronimo.deployment.xbeans.AbstractServiceType service)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.xbeans.AbstractServiceType target = null;
            target = (org.apache.geronimo.deployment.xbeans.AbstractServiceType)get_store().find_element_user(SERVICE$35, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(service);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "service" element
     */
    public org.apache.geronimo.deployment.xbeans.AbstractServiceType insertNewService(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.xbeans.AbstractServiceType target = null;
            target = (org.apache.geronimo.deployment.xbeans.AbstractServiceType)get_store().insert_element_user(SERVICE$35, SERVICE$34, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "service" element
     */
    public org.apache.geronimo.deployment.xbeans.AbstractServiceType addNewService()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.xbeans.AbstractServiceType target = null;
            target = (org.apache.geronimo.deployment.xbeans.AbstractServiceType)get_store().add_element_user(SERVICE$34);
            return target;
        }
    }
    
    /**
     * Removes the ith "service" element
     */
    public void removeService(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SERVICE$35, i);
        }
    }
}
