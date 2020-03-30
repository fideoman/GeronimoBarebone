/*
 * XML Type:  geronimo-ejb-jarType
 * Namespace: http://geronimo.apache.org/xml/ns/j2ee/ejb/openejb-2.0
 * Java type: org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbGeronimoEjbJarType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.openejb.xbeans.ejbjar;


/**
 * An XML geronimo-ejb-jarType(@http://geronimo.apache.org/xml/ns/j2ee/ejb/openejb-2.0).
 *
 * This is a complex type.
 */
public interface OpenejbGeronimoEjbJarType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OpenejbGeronimoEjbJarType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sCB8E5D801CA82AB8B1999B71F1BE50C7").resolveHandle("geronimoejbjartype6313type");
    
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
     * Gets the "openejb-jar" element
     */
    org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbOpenejbJarType getOpenejbJar();
    
    /**
     * True if has "openejb-jar" element
     */
    boolean isSetOpenejbJar();
    
    /**
     * Sets the "openejb-jar" element
     */
    void setOpenejbJar(org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbOpenejbJarType openejbJar);
    
    /**
     * Appends and returns a new empty "openejb-jar" element
     */
    org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbOpenejbJarType addNewOpenejbJar();
    
    /**
     * Unsets the "openejb-jar" element
     */
    void unsetOpenejbJar();
    
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
     * Gets array of all "tss-link" elements
     */
    org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbTssLinkType[] getTssLinkArray();
    
    /**
     * Gets ith "tss-link" element
     */
    org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbTssLinkType getTssLinkArray(int i);
    
    /**
     * Returns number of "tss-link" element
     */
    int sizeOfTssLinkArray();
    
    /**
     * Sets array of all "tss-link" element
     */
    void setTssLinkArray(org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbTssLinkType[] tssLinkArray);
    
    /**
     * Sets ith "tss-link" element
     */
    void setTssLinkArray(int i, org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbTssLinkType tssLink);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "tss-link" element
     */
    org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbTssLinkType insertNewTssLink(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "tss-link" element
     */
    org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbTssLinkType addNewTssLink();
    
    /**
     * Removes the ith "tss-link" element
     */
    void removeTssLink(int i);
    
    /**
     * Gets array of all "web-service-binding" elements
     */
    org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbWebServiceBindingType[] getWebServiceBindingArray();
    
    /**
     * Gets ith "web-service-binding" element
     */
    org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbWebServiceBindingType getWebServiceBindingArray(int i);
    
    /**
     * Returns number of "web-service-binding" element
     */
    int sizeOfWebServiceBindingArray();
    
    /**
     * Sets array of all "web-service-binding" element
     */
    void setWebServiceBindingArray(org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbWebServiceBindingType[] webServiceBindingArray);
    
    /**
     * Sets ith "web-service-binding" element
     */
    void setWebServiceBindingArray(int i, org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbWebServiceBindingType webServiceBinding);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "web-service-binding" element
     */
    org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbWebServiceBindingType insertNewWebServiceBinding(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "web-service-binding" element
     */
    org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbWebServiceBindingType addNewWebServiceBinding();
    
    /**
     * Removes the ith "web-service-binding" element
     */
    void removeWebServiceBinding(int i);
    
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
        public static org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbGeronimoEjbJarType newInstance() {
          return (org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbGeronimoEjbJarType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbGeronimoEjbJarType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbGeronimoEjbJarType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbGeronimoEjbJarType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbGeronimoEjbJarType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbGeronimoEjbJarType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbGeronimoEjbJarType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbGeronimoEjbJarType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbGeronimoEjbJarType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbGeronimoEjbJarType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbGeronimoEjbJarType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbGeronimoEjbJarType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbGeronimoEjbJarType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbGeronimoEjbJarType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbGeronimoEjbJarType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbGeronimoEjbJarType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbGeronimoEjbJarType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbGeronimoEjbJarType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbGeronimoEjbJarType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbGeronimoEjbJarType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbGeronimoEjbJarType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbGeronimoEjbJarType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbGeronimoEjbJarType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbGeronimoEjbJarType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbGeronimoEjbJarType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbGeronimoEjbJarType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbGeronimoEjbJarType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbGeronimoEjbJarType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbGeronimoEjbJarType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbGeronimoEjbJarType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbGeronimoEjbJarType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbGeronimoEjbJarType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbGeronimoEjbJarType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbGeronimoEjbJarType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbGeronimoEjbJarType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
