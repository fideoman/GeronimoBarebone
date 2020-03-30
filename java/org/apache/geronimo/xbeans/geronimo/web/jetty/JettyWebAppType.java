/*
 * XML Type:  web-appType
 * Namespace: http://geronimo.apache.org/xml/ns/j2ee/web/jetty-2.0.2
 * Java type: org.apache.geronimo.xbeans.geronimo.web.jetty.JettyWebAppType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.geronimo.web.jetty;


/**
 * An XML web-appType(@http://geronimo.apache.org/xml/ns/j2ee/web/jetty-2.0.2).
 *
 * This is a complex type.
 */
public interface JettyWebAppType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(JettyWebAppType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s410131F774D16ACADDA4C3237CEF120B").resolveHandle("webapptype88f9type");
    
    /**
     * Gets the "environment" element
     */
    org.apache.geronimo.deployment.xbeans.EnvironmentType getEnvironment();
    
    /**
     * True if has "environment" element
     */
    boolean isSetEnvironment();
    
    /**
     * Sets the "environment" element
     */
    void setEnvironment(org.apache.geronimo.deployment.xbeans.EnvironmentType environment);
    
    /**
     * Appends and returns a new empty "environment" element
     */
    org.apache.geronimo.deployment.xbeans.EnvironmentType addNewEnvironment();
    
    /**
     * Unsets the "environment" element
     */
    void unsetEnvironment();
    
    /**
     * Gets array of all "module" elements
     */
    org.apache.geronimo.xbeans.geronimo.web.jetty.JettyModuleType[] getModuleArray();
    
    /**
     * Gets ith "module" element
     */
    org.apache.geronimo.xbeans.geronimo.web.jetty.JettyModuleType getModuleArray(int i);
    
    /**
     * Returns number of "module" element
     */
    int sizeOfModuleArray();
    
    /**
     * Sets array of all "module" element
     */
    void setModuleArray(org.apache.geronimo.xbeans.geronimo.web.jetty.JettyModuleType[] moduleArray);
    
    /**
     * Sets ith "module" element
     */
    void setModuleArray(int i, org.apache.geronimo.xbeans.geronimo.web.jetty.JettyModuleType module);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "module" element
     */
    org.apache.geronimo.xbeans.geronimo.web.jetty.JettyModuleType insertNewModule(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "module" element
     */
    org.apache.geronimo.xbeans.geronimo.web.jetty.JettyModuleType addNewModule();
    
    /**
     * Removes the ith "module" element
     */
    void removeModule(int i);
    
    /**
     * Gets the "context-root" element
     */
    java.lang.String getContextRoot();
    
    /**
     * Gets (as xml) the "context-root" element
     */
    org.apache.xmlbeans.XmlString xgetContextRoot();
    
    /**
     * True if has "context-root" element
     */
    boolean isSetContextRoot();
    
    /**
     * Sets the "context-root" element
     */
    void setContextRoot(java.lang.String contextRoot);
    
    /**
     * Sets (as xml) the "context-root" element
     */
    void xsetContextRoot(org.apache.xmlbeans.XmlString contextRoot);
    
    /**
     * Unsets the "context-root" element
     */
    void unsetContextRoot();
    
    /**
     * Gets the "work-dir" element
     */
    java.lang.String getWorkDir();
    
    /**
     * Gets (as xml) the "work-dir" element
     */
    org.apache.xmlbeans.XmlString xgetWorkDir();
    
    /**
     * True if has "work-dir" element
     */
    boolean isSetWorkDir();
    
    /**
     * Sets the "work-dir" element
     */
    void setWorkDir(java.lang.String workDir);
    
    /**
     * Sets (as xml) the "work-dir" element
     */
    void xsetWorkDir(org.apache.xmlbeans.XmlString workDir);
    
    /**
     * Unsets the "work-dir" element
     */
    void unsetWorkDir();
    
    /**
     * Gets the "clustering" element
     */
    org.apache.geronimo.xbeans.geronimo.j2ee.GerAbstractClusteringType getClustering();
    
    /**
     * True if has "clustering" element
     */
    boolean isSetClustering();
    
    /**
     * Sets the "clustering" element
     */
    void setClustering(org.apache.geronimo.xbeans.geronimo.j2ee.GerAbstractClusteringType clustering);
    
    /**
     * Appends and returns a new empty "clustering" element
     */
    org.apache.geronimo.xbeans.geronimo.j2ee.GerAbstractClusteringType addNewClustering();
    
    /**
     * Unsets the "clustering" element
     */
    void unsetClustering();
    
    /**
     * Gets the "web-container" element
     */
    org.apache.geronimo.xbeans.geronimo.naming.GerGbeanLocatorType getWebContainer();
    
    /**
     * True if has "web-container" element
     */
    boolean isSetWebContainer();
    
    /**
     * Sets the "web-container" element
     */
    void setWebContainer(org.apache.geronimo.xbeans.geronimo.naming.GerGbeanLocatorType webContainer);
    
    /**
     * Appends and returns a new empty "web-container" element
     */
    org.apache.geronimo.xbeans.geronimo.naming.GerGbeanLocatorType addNewWebContainer();
    
    /**
     * Unsets the "web-container" element
     */
    void unsetWebContainer();
    
    /**
     * Gets array of all "host" elements
     */
    java.lang.String[] getHostArray();
    
    /**
     * Gets ith "host" element
     */
    java.lang.String getHostArray(int i);
    
    /**
     * Gets (as xml) array of all "host" elements
     */
    org.apache.xmlbeans.XmlString[] xgetHostArray();
    
    /**
     * Gets (as xml) ith "host" element
     */
    org.apache.xmlbeans.XmlString xgetHostArray(int i);
    
    /**
     * Returns number of "host" element
     */
    int sizeOfHostArray();
    
    /**
     * Sets array of all "host" element
     */
    void setHostArray(java.lang.String[] hostArray);
    
    /**
     * Sets ith "host" element
     */
    void setHostArray(int i, java.lang.String host);
    
    /**
     * Sets (as xml) array of all "host" element
     */
    void xsetHostArray(org.apache.xmlbeans.XmlString[] hostArray);
    
    /**
     * Sets (as xml) ith "host" element
     */
    void xsetHostArray(int i, org.apache.xmlbeans.XmlString host);
    
    /**
     * Inserts the value as the ith "host" element
     */
    void insertHost(int i, java.lang.String host);
    
    /**
     * Appends the value as the last "host" element
     */
    void addHost(java.lang.String host);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "host" element
     */
    org.apache.xmlbeans.XmlString insertNewHost(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "host" element
     */
    org.apache.xmlbeans.XmlString addNewHost();
    
    /**
     * Removes the ith "host" element
     */
    void removeHost(int i);
    
    /**
     * Gets array of all "virtual-host" elements
     */
    java.lang.String[] getVirtualHostArray();
    
    /**
     * Gets ith "virtual-host" element
     */
    java.lang.String getVirtualHostArray(int i);
    
    /**
     * Gets (as xml) array of all "virtual-host" elements
     */
    org.apache.xmlbeans.XmlString[] xgetVirtualHostArray();
    
    /**
     * Gets (as xml) ith "virtual-host" element
     */
    org.apache.xmlbeans.XmlString xgetVirtualHostArray(int i);
    
    /**
     * Returns number of "virtual-host" element
     */
    int sizeOfVirtualHostArray();
    
    /**
     * Sets array of all "virtual-host" element
     */
    void setVirtualHostArray(java.lang.String[] virtualHostArray);
    
    /**
     * Sets ith "virtual-host" element
     */
    void setVirtualHostArray(int i, java.lang.String virtualHost);
    
    /**
     * Sets (as xml) array of all "virtual-host" element
     */
    void xsetVirtualHostArray(org.apache.xmlbeans.XmlString[] virtualHostArray);
    
    /**
     * Sets (as xml) ith "virtual-host" element
     */
    void xsetVirtualHostArray(int i, org.apache.xmlbeans.XmlString virtualHost);
    
    /**
     * Inserts the value as the ith "virtual-host" element
     */
    void insertVirtualHost(int i, java.lang.String virtualHost);
    
    /**
     * Appends the value as the last "virtual-host" element
     */
    void addVirtualHost(java.lang.String virtualHost);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "virtual-host" element
     */
    org.apache.xmlbeans.XmlString insertNewVirtualHost(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "virtual-host" element
     */
    org.apache.xmlbeans.XmlString addNewVirtualHost();
    
    /**
     * Removes the ith "virtual-host" element
     */
    void removeVirtualHost(int i);
    
    /**
     * Gets the "session-manager" element
     */
    java.lang.String getSessionManager();
    
    /**
     * Gets (as xml) the "session-manager" element
     */
    org.apache.xmlbeans.XmlString xgetSessionManager();
    
    /**
     * True if has "session-manager" element
     */
    boolean isSetSessionManager();
    
    /**
     * Sets the "session-manager" element
     */
    void setSessionManager(java.lang.String sessionManager);
    
    /**
     * Sets (as xml) the "session-manager" element
     */
    void xsetSessionManager(org.apache.xmlbeans.XmlString sessionManager);
    
    /**
     * Unsets the "session-manager" element
     */
    void unsetSessionManager();
    
    /**
     * Gets the "compact-path" element
     */
    boolean getCompactPath();
    
    /**
     * Gets (as xml) the "compact-path" element
     */
    org.apache.xmlbeans.XmlBoolean xgetCompactPath();
    
    /**
     * True if has "compact-path" element
     */
    boolean isSetCompactPath();
    
    /**
     * Sets the "compact-path" element
     */
    void setCompactPath(boolean compactPath);
    
    /**
     * Sets (as xml) the "compact-path" element
     */
    void xsetCompactPath(org.apache.xmlbeans.XmlBoolean compactPath);
    
    /**
     * Unsets the "compact-path" element
     */
    void unsetCompactPath();
    
    /**
     * Gets array of all "abstract-naming-entry" elements
     */
    org.apache.geronimo.xbeans.geronimo.naming.GerAbstractNamingEntryType[] getAbstractNamingEntryArray();
    
    /**
     * Gets ith "abstract-naming-entry" element
     */
    org.apache.geronimo.xbeans.geronimo.naming.GerAbstractNamingEntryType getAbstractNamingEntryArray(int i);
    
    /**
     * Returns number of "abstract-naming-entry" element
     */
    int sizeOfAbstractNamingEntryArray();
    
    /**
     * Sets array of all "abstract-naming-entry" element
     */
    void setAbstractNamingEntryArray(org.apache.geronimo.xbeans.geronimo.naming.GerAbstractNamingEntryType[] abstractNamingEntryArray);
    
    /**
     * Sets ith "abstract-naming-entry" element
     */
    void setAbstractNamingEntryArray(int i, org.apache.geronimo.xbeans.geronimo.naming.GerAbstractNamingEntryType abstractNamingEntry);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "abstract-naming-entry" element
     */
    org.apache.geronimo.xbeans.geronimo.naming.GerAbstractNamingEntryType insertNewAbstractNamingEntry(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "abstract-naming-entry" element
     */
    org.apache.geronimo.xbeans.geronimo.naming.GerAbstractNamingEntryType addNewAbstractNamingEntry();
    
    /**
     * Removes the ith "abstract-naming-entry" element
     */
    void removeAbstractNamingEntry(int i);
    
    /**
     * Gets array of all "env-entry" elements
     */
    org.apache.geronimo.xbeans.geronimo.naming.GerEnvEntryType[] getEnvEntryArray();
    
    /**
     * Gets ith "env-entry" element
     */
    org.apache.geronimo.xbeans.geronimo.naming.GerEnvEntryType getEnvEntryArray(int i);
    
    /**
     * Returns number of "env-entry" element
     */
    int sizeOfEnvEntryArray();
    
    /**
     * Sets array of all "env-entry" element
     */
    void setEnvEntryArray(org.apache.geronimo.xbeans.geronimo.naming.GerEnvEntryType[] envEntryArray);
    
    /**
     * Sets ith "env-entry" element
     */
    void setEnvEntryArray(int i, org.apache.geronimo.xbeans.geronimo.naming.GerEnvEntryType envEntry);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "env-entry" element
     */
    org.apache.geronimo.xbeans.geronimo.naming.GerEnvEntryType insertNewEnvEntry(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "env-entry" element
     */
    org.apache.geronimo.xbeans.geronimo.naming.GerEnvEntryType addNewEnvEntry();
    
    /**
     * Removes the ith "env-entry" element
     */
    void removeEnvEntry(int i);
    
    /**
     * Gets array of all "ejb-ref" elements
     */
    org.apache.geronimo.xbeans.geronimo.naming.GerEjbRefType[] getEjbRefArray();
    
    /**
     * Gets ith "ejb-ref" element
     */
    org.apache.geronimo.xbeans.geronimo.naming.GerEjbRefType getEjbRefArray(int i);
    
    /**
     * Returns number of "ejb-ref" element
     */
    int sizeOfEjbRefArray();
    
    /**
     * Sets array of all "ejb-ref" element
     */
    void setEjbRefArray(org.apache.geronimo.xbeans.geronimo.naming.GerEjbRefType[] ejbRefArray);
    
    /**
     * Sets ith "ejb-ref" element
     */
    void setEjbRefArray(int i, org.apache.geronimo.xbeans.geronimo.naming.GerEjbRefType ejbRef);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ejb-ref" element
     */
    org.apache.geronimo.xbeans.geronimo.naming.GerEjbRefType insertNewEjbRef(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ejb-ref" element
     */
    org.apache.geronimo.xbeans.geronimo.naming.GerEjbRefType addNewEjbRef();
    
    /**
     * Removes the ith "ejb-ref" element
     */
    void removeEjbRef(int i);
    
    /**
     * Gets array of all "ejb-local-ref" elements
     */
    org.apache.geronimo.xbeans.geronimo.naming.GerEjbLocalRefType[] getEjbLocalRefArray();
    
    /**
     * Gets ith "ejb-local-ref" element
     */
    org.apache.geronimo.xbeans.geronimo.naming.GerEjbLocalRefType getEjbLocalRefArray(int i);
    
    /**
     * Returns number of "ejb-local-ref" element
     */
    int sizeOfEjbLocalRefArray();
    
    /**
     * Sets array of all "ejb-local-ref" element
     */
    void setEjbLocalRefArray(org.apache.geronimo.xbeans.geronimo.naming.GerEjbLocalRefType[] ejbLocalRefArray);
    
    /**
     * Sets ith "ejb-local-ref" element
     */
    void setEjbLocalRefArray(int i, org.apache.geronimo.xbeans.geronimo.naming.GerEjbLocalRefType ejbLocalRef);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ejb-local-ref" element
     */
    org.apache.geronimo.xbeans.geronimo.naming.GerEjbLocalRefType insertNewEjbLocalRef(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ejb-local-ref" element
     */
    org.apache.geronimo.xbeans.geronimo.naming.GerEjbLocalRefType addNewEjbLocalRef();
    
    /**
     * Removes the ith "ejb-local-ref" element
     */
    void removeEjbLocalRef(int i);
    
    /**
     * Gets array of all "service-ref" elements
     */
    org.apache.geronimo.xbeans.geronimo.naming.GerServiceRefType[] getServiceRefArray();
    
    /**
     * Gets ith "service-ref" element
     */
    org.apache.geronimo.xbeans.geronimo.naming.GerServiceRefType getServiceRefArray(int i);
    
    /**
     * Returns number of "service-ref" element
     */
    int sizeOfServiceRefArray();
    
    /**
     * Sets array of all "service-ref" element
     */
    void setServiceRefArray(org.apache.geronimo.xbeans.geronimo.naming.GerServiceRefType[] serviceRefArray);
    
    /**
     * Sets ith "service-ref" element
     */
    void setServiceRefArray(int i, org.apache.geronimo.xbeans.geronimo.naming.GerServiceRefType serviceRef);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "service-ref" element
     */
    org.apache.geronimo.xbeans.geronimo.naming.GerServiceRefType insertNewServiceRef(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "service-ref" element
     */
    org.apache.geronimo.xbeans.geronimo.naming.GerServiceRefType addNewServiceRef();
    
    /**
     * Removes the ith "service-ref" element
     */
    void removeServiceRef(int i);
    
    /**
     * Gets array of all "resource-ref" elements
     */
    org.apache.geronimo.xbeans.geronimo.naming.GerResourceRefType[] getResourceRefArray();
    
    /**
     * Gets ith "resource-ref" element
     */
    org.apache.geronimo.xbeans.geronimo.naming.GerResourceRefType getResourceRefArray(int i);
    
    /**
     * Returns number of "resource-ref" element
     */
    int sizeOfResourceRefArray();
    
    /**
     * Sets array of all "resource-ref" element
     */
    void setResourceRefArray(org.apache.geronimo.xbeans.geronimo.naming.GerResourceRefType[] resourceRefArray);
    
    /**
     * Sets ith "resource-ref" element
     */
    void setResourceRefArray(int i, org.apache.geronimo.xbeans.geronimo.naming.GerResourceRefType resourceRef);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "resource-ref" element
     */
    org.apache.geronimo.xbeans.geronimo.naming.GerResourceRefType insertNewResourceRef(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "resource-ref" element
     */
    org.apache.geronimo.xbeans.geronimo.naming.GerResourceRefType addNewResourceRef();
    
    /**
     * Removes the ith "resource-ref" element
     */
    void removeResourceRef(int i);
    
    /**
     * Gets array of all "resource-env-ref" elements
     */
    org.apache.geronimo.xbeans.geronimo.naming.GerResourceEnvRefType[] getResourceEnvRefArray();
    
    /**
     * Gets ith "resource-env-ref" element
     */
    org.apache.geronimo.xbeans.geronimo.naming.GerResourceEnvRefType getResourceEnvRefArray(int i);
    
    /**
     * Returns number of "resource-env-ref" element
     */
    int sizeOfResourceEnvRefArray();
    
    /**
     * Sets array of all "resource-env-ref" element
     */
    void setResourceEnvRefArray(org.apache.geronimo.xbeans.geronimo.naming.GerResourceEnvRefType[] resourceEnvRefArray);
    
    /**
     * Sets ith "resource-env-ref" element
     */
    void setResourceEnvRefArray(int i, org.apache.geronimo.xbeans.geronimo.naming.GerResourceEnvRefType resourceEnvRef);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "resource-env-ref" element
     */
    org.apache.geronimo.xbeans.geronimo.naming.GerResourceEnvRefType insertNewResourceEnvRef(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "resource-env-ref" element
     */
    org.apache.geronimo.xbeans.geronimo.naming.GerResourceEnvRefType addNewResourceEnvRef();
    
    /**
     * Removes the ith "resource-env-ref" element
     */
    void removeResourceEnvRef(int i);
    
    /**
     * Gets array of all "message-destination" elements
     */
    org.apache.geronimo.xbeans.geronimo.naming.GerMessageDestinationType[] getMessageDestinationArray();
    
    /**
     * Gets ith "message-destination" element
     */
    org.apache.geronimo.xbeans.geronimo.naming.GerMessageDestinationType getMessageDestinationArray(int i);
    
    /**
     * Returns number of "message-destination" element
     */
    int sizeOfMessageDestinationArray();
    
    /**
     * Sets array of all "message-destination" element
     */
    void setMessageDestinationArray(org.apache.geronimo.xbeans.geronimo.naming.GerMessageDestinationType[] messageDestinationArray);
    
    /**
     * Sets ith "message-destination" element
     */
    void setMessageDestinationArray(int i, org.apache.geronimo.xbeans.geronimo.naming.GerMessageDestinationType messageDestination);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "message-destination" element
     */
    org.apache.geronimo.xbeans.geronimo.naming.GerMessageDestinationType insertNewMessageDestination(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "message-destination" element
     */
    org.apache.geronimo.xbeans.geronimo.naming.GerMessageDestinationType addNewMessageDestination();
    
    /**
     * Removes the ith "message-destination" element
     */
    void removeMessageDestination(int i);
    
    /**
     * Gets the "security-realm-name" element
     */
    java.lang.String getSecurityRealmName();
    
    /**
     * Gets (as xml) the "security-realm-name" element
     */
    org.apache.xmlbeans.XmlString xgetSecurityRealmName();
    
    /**
     * True if has "security-realm-name" element
     */
    boolean isSetSecurityRealmName();
    
    /**
     * Sets the "security-realm-name" element
     */
    void setSecurityRealmName(java.lang.String securityRealmName);
    
    /**
     * Sets (as xml) the "security-realm-name" element
     */
    void xsetSecurityRealmName(org.apache.xmlbeans.XmlString securityRealmName);
    
    /**
     * Unsets the "security-realm-name" element
     */
    void unsetSecurityRealmName();
    
    /**
     * Gets the "authentication" element
     */
    org.apache.geronimo.xbeans.geronimo.web.jetty.JettyAuthenticationType getAuthentication();
    
    /**
     * True if has "authentication" element
     */
    boolean isSetAuthentication();
    
    /**
     * Sets the "authentication" element
     */
    void setAuthentication(org.apache.geronimo.xbeans.geronimo.web.jetty.JettyAuthenticationType authentication);
    
    /**
     * Appends and returns a new empty "authentication" element
     */
    org.apache.geronimo.xbeans.geronimo.web.jetty.JettyAuthenticationType addNewAuthentication();
    
    /**
     * Unsets the "authentication" element
     */
    void unsetAuthentication();
    
    /**
     * Gets the "security" element
     */
    org.apache.geronimo.xbeans.geronimo.j2ee.GerAbstractSecurityType getSecurity();
    
    /**
     * True if has "security" element
     */
    boolean isSetSecurity();
    
    /**
     * Sets the "security" element
     */
    void setSecurity(org.apache.geronimo.xbeans.geronimo.j2ee.GerAbstractSecurityType security);
    
    /**
     * Appends and returns a new empty "security" element
     */
    org.apache.geronimo.xbeans.geronimo.j2ee.GerAbstractSecurityType addNewSecurity();
    
    /**
     * Unsets the "security" element
     */
    void unsetSecurity();
    
    /**
     * Gets array of all "service" elements
     */
    org.apache.geronimo.deployment.xbeans.AbstractServiceType[] getServiceArray();
    
    /**
     * Gets ith "service" element
     */
    org.apache.geronimo.deployment.xbeans.AbstractServiceType getServiceArray(int i);
    
    /**
     * Returns number of "service" element
     */
    int sizeOfServiceArray();
    
    /**
     * Sets array of all "service" element
     */
    void setServiceArray(org.apache.geronimo.deployment.xbeans.AbstractServiceType[] serviceArray);
    
    /**
     * Sets ith "service" element
     */
    void setServiceArray(int i, org.apache.geronimo.deployment.xbeans.AbstractServiceType service);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "service" element
     */
    org.apache.geronimo.deployment.xbeans.AbstractServiceType insertNewService(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "service" element
     */
    org.apache.geronimo.deployment.xbeans.AbstractServiceType addNewService();
    
    /**
     * Removes the ith "service" element
     */
    void removeService(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.apache.geronimo.xbeans.geronimo.web.jetty.JettyWebAppType newInstance() {
          return (org.apache.geronimo.xbeans.geronimo.web.jetty.JettyWebAppType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.web.jetty.JettyWebAppType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.apache.geronimo.xbeans.geronimo.web.jetty.JettyWebAppType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.apache.geronimo.xbeans.geronimo.web.jetty.JettyWebAppType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.geronimo.web.jetty.JettyWebAppType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.web.jetty.JettyWebAppType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.geronimo.web.jetty.JettyWebAppType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.apache.geronimo.xbeans.geronimo.web.jetty.JettyWebAppType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.web.jetty.JettyWebAppType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.web.jetty.JettyWebAppType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.web.jetty.JettyWebAppType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.apache.geronimo.xbeans.geronimo.web.jetty.JettyWebAppType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.web.jetty.JettyWebAppType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.web.jetty.JettyWebAppType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.web.jetty.JettyWebAppType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.apache.geronimo.xbeans.geronimo.web.jetty.JettyWebAppType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.web.jetty.JettyWebAppType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.web.jetty.JettyWebAppType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.web.jetty.JettyWebAppType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.apache.geronimo.xbeans.geronimo.web.jetty.JettyWebAppType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.web.jetty.JettyWebAppType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.web.jetty.JettyWebAppType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.web.jetty.JettyWebAppType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.apache.geronimo.xbeans.geronimo.web.jetty.JettyWebAppType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.geronimo.web.jetty.JettyWebAppType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.web.jetty.JettyWebAppType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.geronimo.web.jetty.JettyWebAppType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.apache.geronimo.xbeans.geronimo.web.jetty.JettyWebAppType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.geronimo.web.jetty.JettyWebAppType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.web.jetty.JettyWebAppType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.geronimo.web.jetty.JettyWebAppType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.geronimo.xbeans.geronimo.web.jetty.JettyWebAppType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.geronimo.xbeans.geronimo.web.jetty.JettyWebAppType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.geronimo.xbeans.geronimo.web.jetty.JettyWebAppType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.geronimo.xbeans.geronimo.web.jetty.JettyWebAppType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
