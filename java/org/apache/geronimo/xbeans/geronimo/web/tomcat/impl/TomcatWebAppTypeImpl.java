/*
 * XML Type:  web-appType
 * Namespace: http://geronimo.apache.org/xml/ns/j2ee/web/tomcat-2.0.1
 * Java type: org.apache.geronimo.xbeans.geronimo.web.tomcat.TomcatWebAppType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.geronimo.web.tomcat.impl;
/**
 * An XML web-appType(@http://geronimo.apache.org/xml/ns/j2ee/web/tomcat-2.0.1).
 *
 * This is a complex type.
 */
public class TomcatWebAppTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.xbeans.geronimo.web.tomcat.TomcatWebAppType
{
    private static final long serialVersionUID = 1L;
    
    public TomcatWebAppTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENVIRONMENT$0 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/deployment-1.2", "environment");
    private static final javax.xml.namespace.QName MODULE$2 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/j2ee/web/tomcat-2.0.1", "module");
    private static final javax.xml.namespace.QName CONTEXTROOT$4 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/j2ee/web/tomcat-2.0.1", "context-root");
    private static final javax.xml.namespace.QName WORKDIR$6 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/j2ee/web/tomcat-2.0.1", "work-dir");
    private static final javax.xml.namespace.QName CLUSTERING$8 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/j2ee/application-2.0", "clustering");
    private static final javax.xml.namespace.QName WEBCONTAINER$10 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "web-container");
    private static final javax.xml.namespace.QName HOST$12 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/j2ee/web/tomcat-2.0.1", "host");
    private static final javax.xml.namespace.QName CROSSCONTEXT$14 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/j2ee/web/tomcat-2.0.1", "cross-context");
    private static final javax.xml.namespace.QName DISABLECOOKIES$16 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/j2ee/web/tomcat-2.0.1", "disable-cookies");
    private static final javax.xml.namespace.QName CONTEXT$18 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/j2ee/web/tomcat-2.0.1", "context");
    private static final javax.xml.namespace.QName VALVECHAIN$20 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/j2ee/web/tomcat-2.0.1", "valve-chain");
    private static final javax.xml.namespace.QName LISTENERCHAIN$22 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/j2ee/web/tomcat-2.0.1", "listener-chain");
    private static final javax.xml.namespace.QName TOMCATREALM$24 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/j2ee/web/tomcat-2.0.1", "tomcat-realm");
    private static final javax.xml.namespace.QName MANAGER$26 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/j2ee/web/tomcat-2.0.1", "manager");
    private static final javax.xml.namespace.QName CLUSTER$28 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/j2ee/web/tomcat-2.0.1", "cluster");
    private static final javax.xml.namespace.QName ABSTRACTNAMINGENTRY$30 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "abstract-naming-entry");
    private static final org.apache.xmlbeans.QNameSet ABSTRACTNAMINGENTRY$31 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "persistence-unit-ref"),
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "gbean-ref"),
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "persistence-context-ref"),
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "abstract-naming-entry"),
    });
    private static final javax.xml.namespace.QName ENVENTRY$32 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "env-entry");
    private static final javax.xml.namespace.QName EJBREF$34 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "ejb-ref");
    private static final javax.xml.namespace.QName EJBLOCALREF$36 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "ejb-local-ref");
    private static final javax.xml.namespace.QName SERVICEREF$38 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "service-ref");
    private static final javax.xml.namespace.QName RESOURCEREF$40 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "resource-ref");
    private static final javax.xml.namespace.QName RESOURCEENVREF$42 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "resource-env-ref");
    private static final javax.xml.namespace.QName MESSAGEDESTINATION$44 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "message-destination");
    private static final javax.xml.namespace.QName SECURITYREALMNAME$46 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/j2ee/web/tomcat-2.0.1", "security-realm-name");
    private static final javax.xml.namespace.QName AUTHENTICATION$48 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/j2ee/web/tomcat-2.0.1", "authentication");
    private static final javax.xml.namespace.QName SECURITY$50 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/j2ee/application-2.0", "security");
    private static final javax.xml.namespace.QName SERVICE$52 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/deployment-1.2", "service");
    private static final org.apache.xmlbeans.QNameSet SERVICE$53 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
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
    public org.apache.geronimo.xbeans.geronimo.web.tomcat.TomcatModuleType[] getModuleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MODULE$2, targetList);
            org.apache.geronimo.xbeans.geronimo.web.tomcat.TomcatModuleType[] result = new org.apache.geronimo.xbeans.geronimo.web.tomcat.TomcatModuleType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "module" element
     */
    public org.apache.geronimo.xbeans.geronimo.web.tomcat.TomcatModuleType getModuleArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.web.tomcat.TomcatModuleType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.web.tomcat.TomcatModuleType)get_store().find_element_user(MODULE$2, i);
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
    public void setModuleArray(org.apache.geronimo.xbeans.geronimo.web.tomcat.TomcatModuleType[] moduleArray)
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
    public void setModuleArray(int i, org.apache.geronimo.xbeans.geronimo.web.tomcat.TomcatModuleType module)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.web.tomcat.TomcatModuleType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.web.tomcat.TomcatModuleType)get_store().find_element_user(MODULE$2, i);
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
    public org.apache.geronimo.xbeans.geronimo.web.tomcat.TomcatModuleType insertNewModule(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.web.tomcat.TomcatModuleType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.web.tomcat.TomcatModuleType)get_store().insert_element_user(MODULE$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "module" element
     */
    public org.apache.geronimo.xbeans.geronimo.web.tomcat.TomcatModuleType addNewModule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.web.tomcat.TomcatModuleType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.web.tomcat.TomcatModuleType)get_store().add_element_user(MODULE$2);
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
     * Gets the "host" element
     */
    public java.lang.String getHost()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HOST$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "host" element
     */
    public org.apache.xmlbeans.XmlString xgetHost()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HOST$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "host" element
     */
    public boolean isSetHost()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HOST$12) != 0;
        }
    }
    
    /**
     * Sets the "host" element
     */
    public void setHost(java.lang.String host)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HOST$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HOST$12);
            }
            target.setStringValue(host);
        }
    }
    
    /**
     * Sets (as xml) the "host" element
     */
    public void xsetHost(org.apache.xmlbeans.XmlString host)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HOST$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(HOST$12);
            }
            target.set(host);
        }
    }
    
    /**
     * Unsets the "host" element
     */
    public void unsetHost()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HOST$12, 0);
        }
    }
    
    /**
     * Gets the "cross-context" element
     */
    public org.apache.geronimo.xbeans.geronimo.web.tomcat.TomcatEmptyType getCrossContext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.web.tomcat.TomcatEmptyType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.web.tomcat.TomcatEmptyType)get_store().find_element_user(CROSSCONTEXT$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "cross-context" element
     */
    public boolean isSetCrossContext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CROSSCONTEXT$14) != 0;
        }
    }
    
    /**
     * Sets the "cross-context" element
     */
    public void setCrossContext(org.apache.geronimo.xbeans.geronimo.web.tomcat.TomcatEmptyType crossContext)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.web.tomcat.TomcatEmptyType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.web.tomcat.TomcatEmptyType)get_store().find_element_user(CROSSCONTEXT$14, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.xbeans.geronimo.web.tomcat.TomcatEmptyType)get_store().add_element_user(CROSSCONTEXT$14);
            }
            target.set(crossContext);
        }
    }
    
    /**
     * Appends and returns a new empty "cross-context" element
     */
    public org.apache.geronimo.xbeans.geronimo.web.tomcat.TomcatEmptyType addNewCrossContext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.web.tomcat.TomcatEmptyType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.web.tomcat.TomcatEmptyType)get_store().add_element_user(CROSSCONTEXT$14);
            return target;
        }
    }
    
    /**
     * Unsets the "cross-context" element
     */
    public void unsetCrossContext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CROSSCONTEXT$14, 0);
        }
    }
    
    /**
     * Gets the "disable-cookies" element
     */
    public org.apache.geronimo.xbeans.geronimo.web.tomcat.TomcatEmptyType getDisableCookies()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.web.tomcat.TomcatEmptyType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.web.tomcat.TomcatEmptyType)get_store().find_element_user(DISABLECOOKIES$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "disable-cookies" element
     */
    public boolean isSetDisableCookies()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DISABLECOOKIES$16) != 0;
        }
    }
    
    /**
     * Sets the "disable-cookies" element
     */
    public void setDisableCookies(org.apache.geronimo.xbeans.geronimo.web.tomcat.TomcatEmptyType disableCookies)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.web.tomcat.TomcatEmptyType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.web.tomcat.TomcatEmptyType)get_store().find_element_user(DISABLECOOKIES$16, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.xbeans.geronimo.web.tomcat.TomcatEmptyType)get_store().add_element_user(DISABLECOOKIES$16);
            }
            target.set(disableCookies);
        }
    }
    
    /**
     * Appends and returns a new empty "disable-cookies" element
     */
    public org.apache.geronimo.xbeans.geronimo.web.tomcat.TomcatEmptyType addNewDisableCookies()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.web.tomcat.TomcatEmptyType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.web.tomcat.TomcatEmptyType)get_store().add_element_user(DISABLECOOKIES$16);
            return target;
        }
    }
    
    /**
     * Unsets the "disable-cookies" element
     */
    public void unsetDisableCookies()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DISABLECOOKIES$16, 0);
        }
    }
    
    /**
     * Gets the "context" element
     */
    public org.apache.geronimo.xbeans.geronimo.web.tomcat.TomcatContextType getContext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.web.tomcat.TomcatContextType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.web.tomcat.TomcatContextType)get_store().find_element_user(CONTEXT$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "context" element
     */
    public boolean isSetContext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTEXT$18) != 0;
        }
    }
    
    /**
     * Sets the "context" element
     */
    public void setContext(org.apache.geronimo.xbeans.geronimo.web.tomcat.TomcatContextType context)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.web.tomcat.TomcatContextType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.web.tomcat.TomcatContextType)get_store().find_element_user(CONTEXT$18, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.xbeans.geronimo.web.tomcat.TomcatContextType)get_store().add_element_user(CONTEXT$18);
            }
            target.set(context);
        }
    }
    
    /**
     * Appends and returns a new empty "context" element
     */
    public org.apache.geronimo.xbeans.geronimo.web.tomcat.TomcatContextType addNewContext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.web.tomcat.TomcatContextType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.web.tomcat.TomcatContextType)get_store().add_element_user(CONTEXT$18);
            return target;
        }
    }
    
    /**
     * Unsets the "context" element
     */
    public void unsetContext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTEXT$18, 0);
        }
    }
    
    /**
     * Gets the "valve-chain" element
     */
    public java.lang.String getValveChain()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALVECHAIN$20, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "valve-chain" element
     */
    public org.apache.xmlbeans.XmlString xgetValveChain()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VALVECHAIN$20, 0);
            return target;
        }
    }
    
    /**
     * True if has "valve-chain" element
     */
    public boolean isSetValveChain()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALVECHAIN$20) != 0;
        }
    }
    
    /**
     * Sets the "valve-chain" element
     */
    public void setValveChain(java.lang.String valveChain)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALVECHAIN$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VALVECHAIN$20);
            }
            target.setStringValue(valveChain);
        }
    }
    
    /**
     * Sets (as xml) the "valve-chain" element
     */
    public void xsetValveChain(org.apache.xmlbeans.XmlString valveChain)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VALVECHAIN$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VALVECHAIN$20);
            }
            target.set(valveChain);
        }
    }
    
    /**
     * Unsets the "valve-chain" element
     */
    public void unsetValveChain()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALVECHAIN$20, 0);
        }
    }
    
    /**
     * Gets the "listener-chain" element
     */
    public java.lang.String getListenerChain()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LISTENERCHAIN$22, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "listener-chain" element
     */
    public org.apache.xmlbeans.XmlString xgetListenerChain()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LISTENERCHAIN$22, 0);
            return target;
        }
    }
    
    /**
     * True if has "listener-chain" element
     */
    public boolean isSetListenerChain()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LISTENERCHAIN$22) != 0;
        }
    }
    
    /**
     * Sets the "listener-chain" element
     */
    public void setListenerChain(java.lang.String listenerChain)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LISTENERCHAIN$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LISTENERCHAIN$22);
            }
            target.setStringValue(listenerChain);
        }
    }
    
    /**
     * Sets (as xml) the "listener-chain" element
     */
    public void xsetListenerChain(org.apache.xmlbeans.XmlString listenerChain)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LISTENERCHAIN$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LISTENERCHAIN$22);
            }
            target.set(listenerChain);
        }
    }
    
    /**
     * Unsets the "listener-chain" element
     */
    public void unsetListenerChain()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LISTENERCHAIN$22, 0);
        }
    }
    
    /**
     * Gets the "tomcat-realm" element
     */
    public java.lang.String getTomcatRealm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOMCATREALM$24, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "tomcat-realm" element
     */
    public org.apache.xmlbeans.XmlString xgetTomcatRealm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TOMCATREALM$24, 0);
            return target;
        }
    }
    
    /**
     * True if has "tomcat-realm" element
     */
    public boolean isSetTomcatRealm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TOMCATREALM$24) != 0;
        }
    }
    
    /**
     * Sets the "tomcat-realm" element
     */
    public void setTomcatRealm(java.lang.String tomcatRealm)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOMCATREALM$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOMCATREALM$24);
            }
            target.setStringValue(tomcatRealm);
        }
    }
    
    /**
     * Sets (as xml) the "tomcat-realm" element
     */
    public void xsetTomcatRealm(org.apache.xmlbeans.XmlString tomcatRealm)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TOMCATREALM$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TOMCATREALM$24);
            }
            target.set(tomcatRealm);
        }
    }
    
    /**
     * Unsets the "tomcat-realm" element
     */
    public void unsetTomcatRealm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TOMCATREALM$24, 0);
        }
    }
    
    /**
     * Gets the "manager" element
     */
    public java.lang.String getManager()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MANAGER$26, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "manager" element
     */
    public org.apache.xmlbeans.XmlString xgetManager()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MANAGER$26, 0);
            return target;
        }
    }
    
    /**
     * True if has "manager" element
     */
    public boolean isSetManager()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MANAGER$26) != 0;
        }
    }
    
    /**
     * Sets the "manager" element
     */
    public void setManager(java.lang.String manager)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MANAGER$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MANAGER$26);
            }
            target.setStringValue(manager);
        }
    }
    
    /**
     * Sets (as xml) the "manager" element
     */
    public void xsetManager(org.apache.xmlbeans.XmlString manager)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MANAGER$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MANAGER$26);
            }
            target.set(manager);
        }
    }
    
    /**
     * Unsets the "manager" element
     */
    public void unsetManager()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MANAGER$26, 0);
        }
    }
    
    /**
     * Gets the "cluster" element
     */
    public java.lang.String getCluster()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLUSTER$28, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "cluster" element
     */
    public org.apache.xmlbeans.XmlString xgetCluster()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLUSTER$28, 0);
            return target;
        }
    }
    
    /**
     * True if has "cluster" element
     */
    public boolean isSetCluster()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CLUSTER$28) != 0;
        }
    }
    
    /**
     * Sets the "cluster" element
     */
    public void setCluster(java.lang.String cluster)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLUSTER$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CLUSTER$28);
            }
            target.setStringValue(cluster);
        }
    }
    
    /**
     * Sets (as xml) the "cluster" element
     */
    public void xsetCluster(org.apache.xmlbeans.XmlString cluster)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLUSTER$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CLUSTER$28);
            }
            target.set(cluster);
        }
    }
    
    /**
     * Unsets the "cluster" element
     */
    public void unsetCluster()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CLUSTER$28, 0);
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
            get_store().find_all_element_users(ABSTRACTNAMINGENTRY$31, targetList);
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
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerAbstractNamingEntryType)get_store().find_element_user(ABSTRACTNAMINGENTRY$31, i);
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
            return get_store().count_elements(ABSTRACTNAMINGENTRY$31);
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
            arraySetterHelper(abstractNamingEntryArray, ABSTRACTNAMINGENTRY$30, ABSTRACTNAMINGENTRY$31);
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
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerAbstractNamingEntryType)get_store().find_element_user(ABSTRACTNAMINGENTRY$31, i);
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
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerAbstractNamingEntryType)get_store().insert_element_user(ABSTRACTNAMINGENTRY$31, ABSTRACTNAMINGENTRY$30, i);
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
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerAbstractNamingEntryType)get_store().add_element_user(ABSTRACTNAMINGENTRY$30);
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
            get_store().remove_element(ABSTRACTNAMINGENTRY$31, i);
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
            get_store().find_all_element_users(ENVENTRY$32, targetList);
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
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerEnvEntryType)get_store().find_element_user(ENVENTRY$32, i);
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
            return get_store().count_elements(ENVENTRY$32);
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
            arraySetterHelper(envEntryArray, ENVENTRY$32);
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
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerEnvEntryType)get_store().find_element_user(ENVENTRY$32, i);
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
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerEnvEntryType)get_store().insert_element_user(ENVENTRY$32, i);
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
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerEnvEntryType)get_store().add_element_user(ENVENTRY$32);
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
            get_store().remove_element(ENVENTRY$32, i);
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
            get_store().find_all_element_users(EJBREF$34, targetList);
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
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerEjbRefType)get_store().find_element_user(EJBREF$34, i);
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
            return get_store().count_elements(EJBREF$34);
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
            arraySetterHelper(ejbRefArray, EJBREF$34);
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
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerEjbRefType)get_store().find_element_user(EJBREF$34, i);
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
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerEjbRefType)get_store().insert_element_user(EJBREF$34, i);
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
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerEjbRefType)get_store().add_element_user(EJBREF$34);
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
            get_store().remove_element(EJBREF$34, i);
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
            get_store().find_all_element_users(EJBLOCALREF$36, targetList);
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
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerEjbLocalRefType)get_store().find_element_user(EJBLOCALREF$36, i);
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
            return get_store().count_elements(EJBLOCALREF$36);
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
            arraySetterHelper(ejbLocalRefArray, EJBLOCALREF$36);
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
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerEjbLocalRefType)get_store().find_element_user(EJBLOCALREF$36, i);
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
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerEjbLocalRefType)get_store().insert_element_user(EJBLOCALREF$36, i);
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
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerEjbLocalRefType)get_store().add_element_user(EJBLOCALREF$36);
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
            get_store().remove_element(EJBLOCALREF$36, i);
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
            get_store().find_all_element_users(SERVICEREF$38, targetList);
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
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerServiceRefType)get_store().find_element_user(SERVICEREF$38, i);
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
            return get_store().count_elements(SERVICEREF$38);
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
            arraySetterHelper(serviceRefArray, SERVICEREF$38);
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
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerServiceRefType)get_store().find_element_user(SERVICEREF$38, i);
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
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerServiceRefType)get_store().insert_element_user(SERVICEREF$38, i);
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
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerServiceRefType)get_store().add_element_user(SERVICEREF$38);
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
            get_store().remove_element(SERVICEREF$38, i);
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
            get_store().find_all_element_users(RESOURCEREF$40, targetList);
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
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerResourceRefType)get_store().find_element_user(RESOURCEREF$40, i);
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
            return get_store().count_elements(RESOURCEREF$40);
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
            arraySetterHelper(resourceRefArray, RESOURCEREF$40);
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
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerResourceRefType)get_store().find_element_user(RESOURCEREF$40, i);
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
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerResourceRefType)get_store().insert_element_user(RESOURCEREF$40, i);
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
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerResourceRefType)get_store().add_element_user(RESOURCEREF$40);
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
            get_store().remove_element(RESOURCEREF$40, i);
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
            get_store().find_all_element_users(RESOURCEENVREF$42, targetList);
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
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerResourceEnvRefType)get_store().find_element_user(RESOURCEENVREF$42, i);
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
            return get_store().count_elements(RESOURCEENVREF$42);
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
            arraySetterHelper(resourceEnvRefArray, RESOURCEENVREF$42);
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
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerResourceEnvRefType)get_store().find_element_user(RESOURCEENVREF$42, i);
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
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerResourceEnvRefType)get_store().insert_element_user(RESOURCEENVREF$42, i);
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
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerResourceEnvRefType)get_store().add_element_user(RESOURCEENVREF$42);
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
            get_store().remove_element(RESOURCEENVREF$42, i);
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
            get_store().find_all_element_users(MESSAGEDESTINATION$44, targetList);
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
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerMessageDestinationType)get_store().find_element_user(MESSAGEDESTINATION$44, i);
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
            return get_store().count_elements(MESSAGEDESTINATION$44);
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
            arraySetterHelper(messageDestinationArray, MESSAGEDESTINATION$44);
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
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerMessageDestinationType)get_store().find_element_user(MESSAGEDESTINATION$44, i);
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
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerMessageDestinationType)get_store().insert_element_user(MESSAGEDESTINATION$44, i);
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
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerMessageDestinationType)get_store().add_element_user(MESSAGEDESTINATION$44);
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
            get_store().remove_element(MESSAGEDESTINATION$44, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SECURITYREALMNAME$46, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SECURITYREALMNAME$46, 0);
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
            return get_store().count_elements(SECURITYREALMNAME$46) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SECURITYREALMNAME$46, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SECURITYREALMNAME$46);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SECURITYREALMNAME$46, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SECURITYREALMNAME$46);
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
            get_store().remove_element(SECURITYREALMNAME$46, 0);
        }
    }
    
    /**
     * Gets the "authentication" element
     */
    public org.apache.geronimo.xbeans.geronimo.web.tomcat.TomcatAuthenticationType getAuthentication()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.web.tomcat.TomcatAuthenticationType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.web.tomcat.TomcatAuthenticationType)get_store().find_element_user(AUTHENTICATION$48, 0);
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
            return get_store().count_elements(AUTHENTICATION$48) != 0;
        }
    }
    
    /**
     * Sets the "authentication" element
     */
    public void setAuthentication(org.apache.geronimo.xbeans.geronimo.web.tomcat.TomcatAuthenticationType authentication)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.web.tomcat.TomcatAuthenticationType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.web.tomcat.TomcatAuthenticationType)get_store().find_element_user(AUTHENTICATION$48, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.xbeans.geronimo.web.tomcat.TomcatAuthenticationType)get_store().add_element_user(AUTHENTICATION$48);
            }
            target.set(authentication);
        }
    }
    
    /**
     * Appends and returns a new empty "authentication" element
     */
    public org.apache.geronimo.xbeans.geronimo.web.tomcat.TomcatAuthenticationType addNewAuthentication()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.web.tomcat.TomcatAuthenticationType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.web.tomcat.TomcatAuthenticationType)get_store().add_element_user(AUTHENTICATION$48);
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
            get_store().remove_element(AUTHENTICATION$48, 0);
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
            target = (org.apache.geronimo.xbeans.geronimo.j2ee.GerAbstractSecurityType)get_store().find_element_user(SECURITY$50, 0);
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
            return get_store().count_elements(SECURITY$50) != 0;
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
            target = (org.apache.geronimo.xbeans.geronimo.j2ee.GerAbstractSecurityType)get_store().find_element_user(SECURITY$50, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.xbeans.geronimo.j2ee.GerAbstractSecurityType)get_store().add_element_user(SECURITY$50);
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
            target = (org.apache.geronimo.xbeans.geronimo.j2ee.GerAbstractSecurityType)get_store().add_element_user(SECURITY$50);
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
            get_store().remove_element(SECURITY$50, 0);
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
            get_store().find_all_element_users(SERVICE$53, targetList);
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
            target = (org.apache.geronimo.deployment.xbeans.AbstractServiceType)get_store().find_element_user(SERVICE$53, i);
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
            return get_store().count_elements(SERVICE$53);
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
            arraySetterHelper(serviceArray, SERVICE$52, SERVICE$53);
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
            target = (org.apache.geronimo.deployment.xbeans.AbstractServiceType)get_store().find_element_user(SERVICE$53, i);
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
            target = (org.apache.geronimo.deployment.xbeans.AbstractServiceType)get_store().insert_element_user(SERVICE$53, SERVICE$52, i);
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
            target = (org.apache.geronimo.deployment.xbeans.AbstractServiceType)get_store().add_element_user(SERVICE$52);
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
            get_store().remove_element(SERVICE$53, i);
        }
    }
}
