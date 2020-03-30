/*
 * XML Type:  application-clientType
 * Namespace: http://geronimo.apache.org/xml/ns/j2ee/application-client-2.0
 * Java type: org.apache.geronimo.xbeans.geronimo.client.GerApplicationClientType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.geronimo.client;


/**
 * An XML application-clientType(@http://geronimo.apache.org/xml/ns/j2ee/application-client-2.0).
 *
 * This is a complex type.
 */
public interface GerApplicationClientType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GerApplicationClientType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB0E830105F8E1C6D33ECCB7C5228F24D").resolveHandle("applicationclienttypec0f6type");
    
    /**
     * Gets the "client-environment" element
     */
    org.apache.geronimo.deployment.xbeans.EnvironmentType getClientEnvironment();
    
    /**
     * Sets the "client-environment" element
     */
    void setClientEnvironment(org.apache.geronimo.deployment.xbeans.EnvironmentType clientEnvironment);
    
    /**
     * Appends and returns a new empty "client-environment" element
     */
    org.apache.geronimo.deployment.xbeans.EnvironmentType addNewClientEnvironment();
    
    /**
     * Gets the "server-environment" element
     */
    org.apache.geronimo.deployment.xbeans.EnvironmentType getServerEnvironment();
    
    /**
     * Sets the "server-environment" element
     */
    void setServerEnvironment(org.apache.geronimo.deployment.xbeans.EnvironmentType serverEnvironment);
    
    /**
     * Appends and returns a new empty "server-environment" element
     */
    org.apache.geronimo.deployment.xbeans.EnvironmentType addNewServerEnvironment();
    
    /**
     * Gets array of all "gbean-ref" elements
     */
    org.apache.geronimo.xbeans.geronimo.naming.GerGbeanRefType[] getGbeanRefArray();
    
    /**
     * Gets ith "gbean-ref" element
     */
    org.apache.geronimo.xbeans.geronimo.naming.GerGbeanRefType getGbeanRefArray(int i);
    
    /**
     * Returns number of "gbean-ref" element
     */
    int sizeOfGbeanRefArray();
    
    /**
     * Sets array of all "gbean-ref" element
     */
    void setGbeanRefArray(org.apache.geronimo.xbeans.geronimo.naming.GerGbeanRefType[] gbeanRefArray);
    
    /**
     * Sets ith "gbean-ref" element
     */
    void setGbeanRefArray(int i, org.apache.geronimo.xbeans.geronimo.naming.GerGbeanRefType gbeanRef);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "gbean-ref" element
     */
    org.apache.geronimo.xbeans.geronimo.naming.GerGbeanRefType insertNewGbeanRef(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "gbean-ref" element
     */
    org.apache.geronimo.xbeans.geronimo.naming.GerGbeanRefType addNewGbeanRef();
    
    /**
     * Removes the ith "gbean-ref" element
     */
    void removeGbeanRef(int i);
    
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
     * Gets the "default-subject" element
     */
    org.apache.geronimo.xbeans.geronimo.security.GerSubjectInfoType getDefaultSubject();
    
    /**
     * True if has "default-subject" element
     */
    boolean isSetDefaultSubject();
    
    /**
     * Sets the "default-subject" element
     */
    void setDefaultSubject(org.apache.geronimo.xbeans.geronimo.security.GerSubjectInfoType defaultSubject);
    
    /**
     * Appends and returns a new empty "default-subject" element
     */
    org.apache.geronimo.xbeans.geronimo.security.GerSubjectInfoType addNewDefaultSubject();
    
    /**
     * Unsets the "default-subject" element
     */
    void unsetDefaultSubject();
    
    /**
     * Gets the "realm-name" element
     */
    java.lang.String getRealmName();
    
    /**
     * Gets (as xml) the "realm-name" element
     */
    org.apache.xmlbeans.XmlString xgetRealmName();
    
    /**
     * True if has "realm-name" element
     */
    boolean isSetRealmName();
    
    /**
     * Sets the "realm-name" element
     */
    void setRealmName(java.lang.String realmName);
    
    /**
     * Sets (as xml) the "realm-name" element
     */
    void xsetRealmName(org.apache.xmlbeans.XmlString realmName);
    
    /**
     * Unsets the "realm-name" element
     */
    void unsetRealmName();
    
    /**
     * Gets the "callback-handler" element
     */
    java.lang.String getCallbackHandler();
    
    /**
     * Gets (as xml) the "callback-handler" element
     */
    org.apache.xmlbeans.XmlString xgetCallbackHandler();
    
    /**
     * True if has "callback-handler" element
     */
    boolean isSetCallbackHandler();
    
    /**
     * Sets the "callback-handler" element
     */
    void setCallbackHandler(java.lang.String callbackHandler);
    
    /**
     * Sets (as xml) the "callback-handler" element
     */
    void xsetCallbackHandler(org.apache.xmlbeans.XmlString callbackHandler);
    
    /**
     * Unsets the "callback-handler" element
     */
    void unsetCallbackHandler();
    
    /**
     * Gets array of all "resource" elements
     */
    org.apache.geronimo.xbeans.geronimo.client.GerResourceType[] getResourceArray();
    
    /**
     * Gets ith "resource" element
     */
    org.apache.geronimo.xbeans.geronimo.client.GerResourceType getResourceArray(int i);
    
    /**
     * Returns number of "resource" element
     */
    int sizeOfResourceArray();
    
    /**
     * Sets array of all "resource" element
     */
    void setResourceArray(org.apache.geronimo.xbeans.geronimo.client.GerResourceType[] resourceArray);
    
    /**
     * Sets ith "resource" element
     */
    void setResourceArray(int i, org.apache.geronimo.xbeans.geronimo.client.GerResourceType resource);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "resource" element
     */
    org.apache.geronimo.xbeans.geronimo.client.GerResourceType insertNewResource(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "resource" element
     */
    org.apache.geronimo.xbeans.geronimo.client.GerResourceType addNewResource();
    
    /**
     * Removes the ith "resource" element
     */
    void removeResource(int i);
    
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
        public static org.apache.geronimo.xbeans.geronimo.client.GerApplicationClientType newInstance() {
          return (org.apache.geronimo.xbeans.geronimo.client.GerApplicationClientType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.client.GerApplicationClientType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.apache.geronimo.xbeans.geronimo.client.GerApplicationClientType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.apache.geronimo.xbeans.geronimo.client.GerApplicationClientType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.geronimo.client.GerApplicationClientType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.client.GerApplicationClientType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.geronimo.client.GerApplicationClientType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.apache.geronimo.xbeans.geronimo.client.GerApplicationClientType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.client.GerApplicationClientType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.client.GerApplicationClientType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.client.GerApplicationClientType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.apache.geronimo.xbeans.geronimo.client.GerApplicationClientType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.client.GerApplicationClientType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.client.GerApplicationClientType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.client.GerApplicationClientType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.apache.geronimo.xbeans.geronimo.client.GerApplicationClientType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.client.GerApplicationClientType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.client.GerApplicationClientType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.client.GerApplicationClientType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.apache.geronimo.xbeans.geronimo.client.GerApplicationClientType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.client.GerApplicationClientType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.client.GerApplicationClientType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.client.GerApplicationClientType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.apache.geronimo.xbeans.geronimo.client.GerApplicationClientType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.geronimo.client.GerApplicationClientType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.client.GerApplicationClientType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.geronimo.client.GerApplicationClientType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.apache.geronimo.xbeans.geronimo.client.GerApplicationClientType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.geronimo.client.GerApplicationClientType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.client.GerApplicationClientType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.geronimo.client.GerApplicationClientType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.geronimo.xbeans.geronimo.client.GerApplicationClientType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.geronimo.xbeans.geronimo.client.GerApplicationClientType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.geronimo.xbeans.geronimo.client.GerApplicationClientType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.geronimo.xbeans.geronimo.client.GerApplicationClientType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
