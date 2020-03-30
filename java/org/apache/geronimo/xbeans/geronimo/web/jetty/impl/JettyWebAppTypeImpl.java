/*
 * XML Type:  web-appType
 * Namespace: http://geronimo.apache.org/xml/ns/j2ee/web/jetty-2.0.2
 * Java type: org.apache.geronimo.xbeans.geronimo.web.jetty.JettyWebAppType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.geronimo.web.jetty.impl;
/**
 * An XML web-appType(@http://geronimo.apache.org/xml/ns/j2ee/web/jetty-2.0.2).
 *
 * This is a complex type.
 */
public class JettyWebAppTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.xbeans.geronimo.web.jetty.JettyWebAppType
{
    private static final long serialVersionUID = 1L;
    
    public JettyWebAppTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENVIRONMENT$0 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/deployment-1.2", "environment");
    private static final javax.xml.namespace.QName MODULE$2 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/j2ee/web/jetty-2.0.2", "module");
    private static final javax.xml.namespace.QName CONTEXTROOT$4 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/j2ee/web/jetty-2.0.2", "context-root");
    private static final javax.xml.namespace.QName WORKDIR$6 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/j2ee/web/jetty-2.0.2", "work-dir");
    private static final javax.xml.namespace.QName CLUSTERING$8 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/j2ee/application-2.0", "clustering");
    private static final javax.xml.namespace.QName WEBCONTAINER$10 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "web-container");
    private static final javax.xml.namespace.QName HOST$12 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/j2ee/web/jetty-2.0.2", "host");
    private static final javax.xml.namespace.QName VIRTUALHOST$14 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/j2ee/web/jetty-2.0.2", "virtual-host");
    private static final javax.xml.namespace.QName SESSIONMANAGER$16 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/j2ee/web/jetty-2.0.2", "session-manager");
    private static final javax.xml.namespace.QName COMPACTPATH$18 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/j2ee/web/jetty-2.0.2", "compact-path");
    private static final javax.xml.namespace.QName ABSTRACTNAMINGENTRY$20 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "abstract-naming-entry");
    private static final org.apache.xmlbeans.QNameSet ABSTRACTNAMINGENTRY$21 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "persistence-unit-ref"),
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "gbean-ref"),
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "persistence-context-ref"),
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "abstract-naming-entry"),
    });
    private static final javax.xml.namespace.QName ENVENTRY$22 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "env-entry");
    private static final javax.xml.namespace.QName EJBREF$24 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "ejb-ref");
    private static final javax.xml.namespace.QName EJBLOCALREF$26 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "ejb-local-ref");
    private static final javax.xml.namespace.QName SERVICEREF$28 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "service-ref");
    private static final javax.xml.namespace.QName RESOURCEREF$30 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "resource-ref");
    private static final javax.xml.namespace.QName RESOURCEENVREF$32 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "resource-env-ref");
    private static final javax.xml.namespace.QName MESSAGEDESTINATION$34 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "message-destination");
    private static final javax.xml.namespace.QName SECURITYREALMNAME$36 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/j2ee/web/jetty-2.0.2", "security-realm-name");
    private static final javax.xml.namespace.QName AUTHENTICATION$38 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/j2ee/web/jetty-2.0.2", "authentication");
    private static final javax.xml.namespace.QName SECURITY$40 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/j2ee/application-2.0", "security");
    private static final javax.xml.namespace.QName SERVICE$42 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/deployment-1.2", "service");
    private static final org.apache.xmlbeans.QNameSet SERVICE$43 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
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
    public org.apache.geronimo.xbeans.geronimo.web.jetty.JettyModuleType[] getModuleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MODULE$2, targetList);
            org.apache.geronimo.xbeans.geronimo.web.jetty.JettyModuleType[] result = new org.apache.geronimo.xbeans.geronimo.web.jetty.JettyModuleType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "module" element
     */
    public org.apache.geronimo.xbeans.geronimo.web.jetty.JettyModuleType getModuleArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.web.jetty.JettyModuleType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.web.jetty.JettyModuleType)get_store().find_element_user(MODULE$2, i);
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
    public void setModuleArray(org.apache.geronimo.xbeans.geronimo.web.jetty.JettyModuleType[] moduleArray)
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
    public void setModuleArray(int i, org.apache.geronimo.xbeans.geronimo.web.jetty.JettyModuleType module)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.web.jetty.JettyModuleType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.web.jetty.JettyModuleType)get_store().find_element_user(MODULE$2, i);
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
    public org.apache.geronimo.xbeans.geronimo.web.jetty.JettyModuleType insertNewModule(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.web.jetty.JettyModuleType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.web.jetty.JettyModuleType)get_store().insert_element_user(MODULE$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "module" element
     */
    public org.apache.geronimo.xbeans.geronimo.web.jetty.JettyModuleType addNewModule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.web.jetty.JettyModuleType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.web.jetty.JettyModuleType)get_store().add_element_user(MODULE$2);
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
     * Gets the "clustering" element
     */
    public org.apache.geronimo.xbeans.geronimo.j2ee.GerAbstractClusteringType getClustering()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.j2ee.GerAbstractClusteringType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.j2ee.GerAbstractClusteringType)get_store().find_element_user(CLUSTERING$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "clustering" element
     */
    public boolean isSetClustering()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CLUSTERING$8) != 0;
        }
    }
    
    /**
     * Sets the "clustering" element
     */
    public void setClustering(org.apache.geronimo.xbeans.geronimo.j2ee.GerAbstractClusteringType clustering)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.j2ee.GerAbstractClusteringType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.j2ee.GerAbstractClusteringType)get_store().find_element_user(CLUSTERING$8, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.xbeans.geronimo.j2ee.GerAbstractClusteringType)get_store().add_element_user(CLUSTERING$8);
            }
            target.set(clustering);
        }
    }
    
    /**
     * Appends and returns a new empty "clustering" element
     */
    public org.apache.geronimo.xbeans.geronimo.j2ee.GerAbstractClusteringType addNewClustering()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.j2ee.GerAbstractClusteringType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.j2ee.GerAbstractClusteringType)get_store().add_element_user(CLUSTERING$8);
            return target;
        }
    }
    
    /**
     * Unsets the "clustering" element
     */
    public void unsetClustering()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CLUSTERING$8, 0);
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
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerGbeanLocatorType)get_store().find_element_user(WEBCONTAINER$10, 0);
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
            return get_store().count_elements(WEBCONTAINER$10) != 0;
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
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerGbeanLocatorType)get_store().find_element_user(WEBCONTAINER$10, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.xbeans.geronimo.naming.GerGbeanLocatorType)get_store().add_element_user(WEBCONTAINER$10);
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
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerGbeanLocatorType)get_store().add_element_user(WEBCONTAINER$10);
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
            get_store().remove_element(WEBCONTAINER$10, 0);
        }
    }
    
    /**
     * Gets array of all "host" elements
     */
    public java.lang.String[] getHostArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(HOST$12, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "host" element
     */
    public java.lang.String getHostArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HOST$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "host" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetHostArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(HOST$12, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "host" element
     */
    public org.apache.xmlbeans.XmlString xgetHostArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HOST$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "host" element
     */
    public int sizeOfHostArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HOST$12);
        }
    }
    
    /**
     * Sets array of all "host" element
     */
    public void setHostArray(java.lang.String[] hostArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(hostArray, HOST$12);
        }
    }
    
    /**
     * Sets ith "host" element
     */
    public void setHostArray(int i, java.lang.String host)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HOST$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(host);
        }
    }
    
    /**
     * Sets (as xml) array of all "host" element
     */
    public void xsetHostArray(org.apache.xmlbeans.XmlString[]hostArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(hostArray, HOST$12);
        }
    }
    
    /**
     * Sets (as xml) ith "host" element
     */
    public void xsetHostArray(int i, org.apache.xmlbeans.XmlString host)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HOST$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(host);
        }
    }
    
    /**
     * Inserts the value as the ith "host" element
     */
    public void insertHost(int i, java.lang.String host)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(HOST$12, i);
            target.setStringValue(host);
        }
    }
    
    /**
     * Appends the value as the last "host" element
     */
    public void addHost(java.lang.String host)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HOST$12);
            target.setStringValue(host);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "host" element
     */
    public org.apache.xmlbeans.XmlString insertNewHost(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(HOST$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "host" element
     */
    public org.apache.xmlbeans.XmlString addNewHost()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(HOST$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "host" element
     */
    public void removeHost(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HOST$12, i);
        }
    }
    
    /**
     * Gets array of all "virtual-host" elements
     */
    public java.lang.String[] getVirtualHostArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(VIRTUALHOST$14, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "virtual-host" element
     */
    public java.lang.String getVirtualHostArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VIRTUALHOST$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "virtual-host" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetVirtualHostArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(VIRTUALHOST$14, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "virtual-host" element
     */
    public org.apache.xmlbeans.XmlString xgetVirtualHostArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VIRTUALHOST$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "virtual-host" element
     */
    public int sizeOfVirtualHostArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VIRTUALHOST$14);
        }
    }
    
    /**
     * Sets array of all "virtual-host" element
     */
    public void setVirtualHostArray(java.lang.String[] virtualHostArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(virtualHostArray, VIRTUALHOST$14);
        }
    }
    
    /**
     * Sets ith "virtual-host" element
     */
    public void setVirtualHostArray(int i, java.lang.String virtualHost)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VIRTUALHOST$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(virtualHost);
        }
    }
    
    /**
     * Sets (as xml) array of all "virtual-host" element
     */
    public void xsetVirtualHostArray(org.apache.xmlbeans.XmlString[]virtualHostArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(virtualHostArray, VIRTUALHOST$14);
        }
    }
    
    /**
     * Sets (as xml) ith "virtual-host" element
     */
    public void xsetVirtualHostArray(int i, org.apache.xmlbeans.XmlString virtualHost)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VIRTUALHOST$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(virtualHost);
        }
    }
    
    /**
     * Inserts the value as the ith "virtual-host" element
     */
    public void insertVirtualHost(int i, java.lang.String virtualHost)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(VIRTUALHOST$14, i);
            target.setStringValue(virtualHost);
        }
    }
    
    /**
     * Appends the value as the last "virtual-host" element
     */
    public void addVirtualHost(java.lang.String virtualHost)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VIRTUALHOST$14);
            target.setStringValue(virtualHost);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "virtual-host" element
     */
    public org.apache.xmlbeans.XmlString insertNewVirtualHost(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(VIRTUALHOST$14, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "virtual-host" element
     */
    public org.apache.xmlbeans.XmlString addNewVirtualHost()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VIRTUALHOST$14);
            return target;
        }
    }
    
    /**
     * Removes the ith "virtual-host" element
     */
    public void removeVirtualHost(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VIRTUALHOST$14, i);
        }
    }
    
    /**
     * Gets the "session-manager" element
     */
    public java.lang.String getSessionManager()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SESSIONMANAGER$16, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "session-manager" element
     */
    public org.apache.xmlbeans.XmlString xgetSessionManager()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SESSIONMANAGER$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "session-manager" element
     */
    public boolean isSetSessionManager()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SESSIONMANAGER$16) != 0;
        }
    }
    
    /**
     * Sets the "session-manager" element
     */
    public void setSessionManager(java.lang.String sessionManager)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SESSIONMANAGER$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SESSIONMANAGER$16);
            }
            target.setStringValue(sessionManager);
        }
    }
    
    /**
     * Sets (as xml) the "session-manager" element
     */
    public void xsetSessionManager(org.apache.xmlbeans.XmlString sessionManager)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SESSIONMANAGER$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SESSIONMANAGER$16);
            }
            target.set(sessionManager);
        }
    }
    
    /**
     * Unsets the "session-manager" element
     */
    public void unsetSessionManager()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SESSIONMANAGER$16, 0);
        }
    }
    
    /**
     * Gets the "compact-path" element
     */
    public boolean getCompactPath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMPACTPATH$18, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "compact-path" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetCompactPath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(COMPACTPATH$18, 0);
            return target;
        }
    }
    
    /**
     * True if has "compact-path" element
     */
    public boolean isSetCompactPath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMPACTPATH$18) != 0;
        }
    }
    
    /**
     * Sets the "compact-path" element
     */
    public void setCompactPath(boolean compactPath)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMPACTPATH$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COMPACTPATH$18);
            }
            target.setBooleanValue(compactPath);
        }
    }
    
    /**
     * Sets (as xml) the "compact-path" element
     */
    public void xsetCompactPath(org.apache.xmlbeans.XmlBoolean compactPath)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(COMPACTPATH$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(COMPACTPATH$18);
            }
            target.set(compactPath);
        }
    }
    
    /**
     * Unsets the "compact-path" element
     */
    public void unsetCompactPath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMPACTPATH$18, 0);
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
            get_store().find_all_element_users(ABSTRACTNAMINGENTRY$21, targetList);
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
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerAbstractNamingEntryType)get_store().find_element_user(ABSTRACTNAMINGENTRY$21, i);
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
            return get_store().count_elements(ABSTRACTNAMINGENTRY$21);
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
            arraySetterHelper(abstractNamingEntryArray, ABSTRACTNAMINGENTRY$20, ABSTRACTNAMINGENTRY$21);
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
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerAbstractNamingEntryType)get_store().find_element_user(ABSTRACTNAMINGENTRY$21, i);
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
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerAbstractNamingEntryType)get_store().insert_element_user(ABSTRACTNAMINGENTRY$21, ABSTRACTNAMINGENTRY$20, i);
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
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerAbstractNamingEntryType)get_store().add_element_user(ABSTRACTNAMINGENTRY$20);
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
            get_store().remove_element(ABSTRACTNAMINGENTRY$21, i);
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
            get_store().find_all_element_users(ENVENTRY$22, targetList);
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
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerEnvEntryType)get_store().find_element_user(ENVENTRY$22, i);
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
            return get_store().count_elements(ENVENTRY$22);
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
            arraySetterHelper(envEntryArray, ENVENTRY$22);
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
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerEnvEntryType)get_store().find_element_user(ENVENTRY$22, i);
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
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerEnvEntryType)get_store().insert_element_user(ENVENTRY$22, i);
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
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerEnvEntryType)get_store().add_element_user(ENVENTRY$22);
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
            get_store().remove_element(ENVENTRY$22, i);
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
            get_store().find_all_element_users(EJBREF$24, targetList);
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
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerEjbRefType)get_store().find_element_user(EJBREF$24, i);
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
            return get_store().count_elements(EJBREF$24);
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
            arraySetterHelper(ejbRefArray, EJBREF$24);
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
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerEjbRefType)get_store().find_element_user(EJBREF$24, i);
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
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerEjbRefType)get_store().insert_element_user(EJBREF$24, i);
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
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerEjbRefType)get_store().add_element_user(EJBREF$24);
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
            get_store().remove_element(EJBREF$24, i);
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
            get_store().find_all_element_users(EJBLOCALREF$26, targetList);
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
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerEjbLocalRefType)get_store().find_element_user(EJBLOCALREF$26, i);
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
            return get_store().count_elements(EJBLOCALREF$26);
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
            arraySetterHelper(ejbLocalRefArray, EJBLOCALREF$26);
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
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerEjbLocalRefType)get_store().find_element_user(EJBLOCALREF$26, i);
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
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerEjbLocalRefType)get_store().insert_element_user(EJBLOCALREF$26, i);
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
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerEjbLocalRefType)get_store().add_element_user(EJBLOCALREF$26);
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
            get_store().remove_element(EJBLOCALREF$26, i);
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
            get_store().find_all_element_users(SERVICEREF$28, targetList);
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
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerServiceRefType)get_store().find_element_user(SERVICEREF$28, i);
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
            return get_store().count_elements(SERVICEREF$28);
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
            arraySetterHelper(serviceRefArray, SERVICEREF$28);
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
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerServiceRefType)get_store().find_element_user(SERVICEREF$28, i);
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
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerServiceRefType)get_store().insert_element_user(SERVICEREF$28, i);
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
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerServiceRefType)get_store().add_element_user(SERVICEREF$28);
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
            get_store().remove_element(SERVICEREF$28, i);
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
            get_store().find_all_element_users(RESOURCEREF$30, targetList);
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
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerResourceRefType)get_store().find_element_user(RESOURCEREF$30, i);
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
            return get_store().count_elements(RESOURCEREF$30);
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
            arraySetterHelper(resourceRefArray, RESOURCEREF$30);
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
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerResourceRefType)get_store().find_element_user(RESOURCEREF$30, i);
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
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerResourceRefType)get_store().insert_element_user(RESOURCEREF$30, i);
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
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerResourceRefType)get_store().add_element_user(RESOURCEREF$30);
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
            get_store().remove_element(RESOURCEREF$30, i);
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
            get_store().find_all_element_users(RESOURCEENVREF$32, targetList);
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
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerResourceEnvRefType)get_store().find_element_user(RESOURCEENVREF$32, i);
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
            return get_store().count_elements(RESOURCEENVREF$32);
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
            arraySetterHelper(resourceEnvRefArray, RESOURCEENVREF$32);
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
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerResourceEnvRefType)get_store().find_element_user(RESOURCEENVREF$32, i);
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
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerResourceEnvRefType)get_store().insert_element_user(RESOURCEENVREF$32, i);
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
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerResourceEnvRefType)get_store().add_element_user(RESOURCEENVREF$32);
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
            get_store().remove_element(RESOURCEENVREF$32, i);
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
            get_store().find_all_element_users(MESSAGEDESTINATION$34, targetList);
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
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerMessageDestinationType)get_store().find_element_user(MESSAGEDESTINATION$34, i);
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
            return get_store().count_elements(MESSAGEDESTINATION$34);
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
            arraySetterHelper(messageDestinationArray, MESSAGEDESTINATION$34);
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
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerMessageDestinationType)get_store().find_element_user(MESSAGEDESTINATION$34, i);
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
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerMessageDestinationType)get_store().insert_element_user(MESSAGEDESTINATION$34, i);
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
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerMessageDestinationType)get_store().add_element_user(MESSAGEDESTINATION$34);
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
            get_store().remove_element(MESSAGEDESTINATION$34, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SECURITYREALMNAME$36, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SECURITYREALMNAME$36, 0);
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
            return get_store().count_elements(SECURITYREALMNAME$36) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SECURITYREALMNAME$36, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SECURITYREALMNAME$36);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SECURITYREALMNAME$36, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SECURITYREALMNAME$36);
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
            get_store().remove_element(SECURITYREALMNAME$36, 0);
        }
    }
    
    /**
     * Gets the "authentication" element
     */
    public org.apache.geronimo.xbeans.geronimo.web.jetty.JettyAuthenticationType getAuthentication()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.web.jetty.JettyAuthenticationType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.web.jetty.JettyAuthenticationType)get_store().find_element_user(AUTHENTICATION$38, 0);
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
            return get_store().count_elements(AUTHENTICATION$38) != 0;
        }
    }
    
    /**
     * Sets the "authentication" element
     */
    public void setAuthentication(org.apache.geronimo.xbeans.geronimo.web.jetty.JettyAuthenticationType authentication)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.web.jetty.JettyAuthenticationType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.web.jetty.JettyAuthenticationType)get_store().find_element_user(AUTHENTICATION$38, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.xbeans.geronimo.web.jetty.JettyAuthenticationType)get_store().add_element_user(AUTHENTICATION$38);
            }
            target.set(authentication);
        }
    }
    
    /**
     * Appends and returns a new empty "authentication" element
     */
    public org.apache.geronimo.xbeans.geronimo.web.jetty.JettyAuthenticationType addNewAuthentication()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.web.jetty.JettyAuthenticationType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.web.jetty.JettyAuthenticationType)get_store().add_element_user(AUTHENTICATION$38);
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
            get_store().remove_element(AUTHENTICATION$38, 0);
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
            target = (org.apache.geronimo.xbeans.geronimo.j2ee.GerAbstractSecurityType)get_store().find_element_user(SECURITY$40, 0);
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
            return get_store().count_elements(SECURITY$40) != 0;
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
            target = (org.apache.geronimo.xbeans.geronimo.j2ee.GerAbstractSecurityType)get_store().find_element_user(SECURITY$40, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.xbeans.geronimo.j2ee.GerAbstractSecurityType)get_store().add_element_user(SECURITY$40);
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
            target = (org.apache.geronimo.xbeans.geronimo.j2ee.GerAbstractSecurityType)get_store().add_element_user(SECURITY$40);
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
            get_store().remove_element(SECURITY$40, 0);
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
            get_store().find_all_element_users(SERVICE$43, targetList);
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
            target = (org.apache.geronimo.deployment.xbeans.AbstractServiceType)get_store().find_element_user(SERVICE$43, i);
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
            return get_store().count_elements(SERVICE$43);
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
            arraySetterHelper(serviceArray, SERVICE$42, SERVICE$43);
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
            target = (org.apache.geronimo.deployment.xbeans.AbstractServiceType)get_store().find_element_user(SERVICE$43, i);
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
            target = (org.apache.geronimo.deployment.xbeans.AbstractServiceType)get_store().insert_element_user(SERVICE$43, SERVICE$42, i);
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
            target = (org.apache.geronimo.deployment.xbeans.AbstractServiceType)get_store().add_element_user(SERVICE$42);
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
            get_store().remove_element(SERVICE$43, i);
        }
    }
}
