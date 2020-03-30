/*
 * XML Type:  configProviderType
 * Namespace: http://geronimo.apache.org/xml/ns/geronimo-jaspi
 * Java type: org.apache.geronimo.xbeans.geronimo.jaspi.JaspiConfigProviderType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.geronimo.jaspi;


/**
 * An XML configProviderType(@http://geronimo.apache.org/xml/ns/geronimo-jaspi).
 *
 * This is a complex type.
 */
public interface JaspiConfigProviderType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(JaspiConfigProviderType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4769874CABA12AE1DF68A448E73C1B12").resolveHandle("configprovidertypec815type");
    
    /**
     * Gets the "messageLayer" element
     */
    java.lang.String getMessageLayer();
    
    /**
     * Gets (as xml) the "messageLayer" element
     */
    org.apache.xmlbeans.XmlString xgetMessageLayer();
    
    /**
     * True if has "messageLayer" element
     */
    boolean isSetMessageLayer();
    
    /**
     * Sets the "messageLayer" element
     */
    void setMessageLayer(java.lang.String messageLayer);
    
    /**
     * Sets (as xml) the "messageLayer" element
     */
    void xsetMessageLayer(org.apache.xmlbeans.XmlString messageLayer);
    
    /**
     * Unsets the "messageLayer" element
     */
    void unsetMessageLayer();
    
    /**
     * Gets the "appContext" element
     */
    java.lang.String getAppContext();
    
    /**
     * Gets (as xml) the "appContext" element
     */
    org.apache.xmlbeans.XmlString xgetAppContext();
    
    /**
     * True if has "appContext" element
     */
    boolean isSetAppContext();
    
    /**
     * Sets the "appContext" element
     */
    void setAppContext(java.lang.String appContext);
    
    /**
     * Sets (as xml) the "appContext" element
     */
    void xsetAppContext(org.apache.xmlbeans.XmlString appContext);
    
    /**
     * Unsets the "appContext" element
     */
    void unsetAppContext();
    
    /**
     * Gets the "description" element
     */
    java.lang.String getDescription();
    
    /**
     * Gets (as xml) the "description" element
     */
    org.apache.xmlbeans.XmlString xgetDescription();
    
    /**
     * True if has "description" element
     */
    boolean isSetDescription();
    
    /**
     * Sets the "description" element
     */
    void setDescription(java.lang.String description);
    
    /**
     * Sets (as xml) the "description" element
     */
    void xsetDescription(org.apache.xmlbeans.XmlString description);
    
    /**
     * Unsets the "description" element
     */
    void unsetDescription();
    
    /**
     * Gets the "className" element
     */
    java.lang.String getClassName();
    
    /**
     * Gets (as xml) the "className" element
     */
    org.apache.xmlbeans.XmlString xgetClassName();
    
    /**
     * True if has "className" element
     */
    boolean isSetClassName();
    
    /**
     * Sets the "className" element
     */
    void setClassName(java.lang.String className);
    
    /**
     * Sets (as xml) the "className" element
     */
    void xsetClassName(org.apache.xmlbeans.XmlString className);
    
    /**
     * Unsets the "className" element
     */
    void unsetClassName();
    
    /**
     * Gets the "properties" element
     */
    java.lang.String getProperties();
    
    /**
     * Gets (as xml) the "properties" element
     */
    org.apache.xmlbeans.XmlString xgetProperties();
    
    /**
     * True if has "properties" element
     */
    boolean isSetProperties();
    
    /**
     * Sets the "properties" element
     */
    void setProperties(java.lang.String properties);
    
    /**
     * Sets (as xml) the "properties" element
     */
    void xsetProperties(org.apache.xmlbeans.XmlString properties);
    
    /**
     * Unsets the "properties" element
     */
    void unsetProperties();
    
    /**
     * Gets array of all "clientAuthConfig" elements
     */
    org.apache.geronimo.xbeans.geronimo.jaspi.JaspiClientAuthConfigType[] getClientAuthConfigArray();
    
    /**
     * Gets ith "clientAuthConfig" element
     */
    org.apache.geronimo.xbeans.geronimo.jaspi.JaspiClientAuthConfigType getClientAuthConfigArray(int i);
    
    /**
     * Returns number of "clientAuthConfig" element
     */
    int sizeOfClientAuthConfigArray();
    
    /**
     * Sets array of all "clientAuthConfig" element
     */
    void setClientAuthConfigArray(org.apache.geronimo.xbeans.geronimo.jaspi.JaspiClientAuthConfigType[] clientAuthConfigArray);
    
    /**
     * Sets ith "clientAuthConfig" element
     */
    void setClientAuthConfigArray(int i, org.apache.geronimo.xbeans.geronimo.jaspi.JaspiClientAuthConfigType clientAuthConfig);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "clientAuthConfig" element
     */
    org.apache.geronimo.xbeans.geronimo.jaspi.JaspiClientAuthConfigType insertNewClientAuthConfig(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "clientAuthConfig" element
     */
    org.apache.geronimo.xbeans.geronimo.jaspi.JaspiClientAuthConfigType addNewClientAuthConfig();
    
    /**
     * Removes the ith "clientAuthConfig" element
     */
    void removeClientAuthConfig(int i);
    
    /**
     * Gets array of all "serverAuthConfig" elements
     */
    org.apache.geronimo.xbeans.geronimo.jaspi.JaspiServerAuthConfigType[] getServerAuthConfigArray();
    
    /**
     * Gets ith "serverAuthConfig" element
     */
    org.apache.geronimo.xbeans.geronimo.jaspi.JaspiServerAuthConfigType getServerAuthConfigArray(int i);
    
    /**
     * Returns number of "serverAuthConfig" element
     */
    int sizeOfServerAuthConfigArray();
    
    /**
     * Sets array of all "serverAuthConfig" element
     */
    void setServerAuthConfigArray(org.apache.geronimo.xbeans.geronimo.jaspi.JaspiServerAuthConfigType[] serverAuthConfigArray);
    
    /**
     * Sets ith "serverAuthConfig" element
     */
    void setServerAuthConfigArray(int i, org.apache.geronimo.xbeans.geronimo.jaspi.JaspiServerAuthConfigType serverAuthConfig);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "serverAuthConfig" element
     */
    org.apache.geronimo.xbeans.geronimo.jaspi.JaspiServerAuthConfigType insertNewServerAuthConfig(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "serverAuthConfig" element
     */
    org.apache.geronimo.xbeans.geronimo.jaspi.JaspiServerAuthConfigType addNewServerAuthConfig();
    
    /**
     * Removes the ith "serverAuthConfig" element
     */
    void removeServerAuthConfig(int i);
    
    /**
     * Gets the "persistent" element
     */
    boolean getPersistent();
    
    /**
     * Gets (as xml) the "persistent" element
     */
    org.apache.xmlbeans.XmlBoolean xgetPersistent();
    
    /**
     * True if has "persistent" element
     */
    boolean isSetPersistent();
    
    /**
     * Sets the "persistent" element
     */
    void setPersistent(boolean persistent);
    
    /**
     * Sets (as xml) the "persistent" element
     */
    void xsetPersistent(org.apache.xmlbeans.XmlBoolean persistent);
    
    /**
     * Unsets the "persistent" element
     */
    void unsetPersistent();
    
    /**
     * Gets the "classLoaderName" element
     */
    java.lang.String getClassLoaderName();
    
    /**
     * Gets (as xml) the "classLoaderName" element
     */
    org.apache.xmlbeans.XmlString xgetClassLoaderName();
    
    /**
     * True if has "classLoaderName" element
     */
    boolean isSetClassLoaderName();
    
    /**
     * Sets the "classLoaderName" element
     */
    void setClassLoaderName(java.lang.String classLoaderName);
    
    /**
     * Sets (as xml) the "classLoaderName" element
     */
    void xsetClassLoaderName(org.apache.xmlbeans.XmlString classLoaderName);
    
    /**
     * Unsets the "classLoaderName" element
     */
    void unsetClassLoaderName();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.apache.geronimo.xbeans.geronimo.jaspi.JaspiConfigProviderType newInstance() {
          return (org.apache.geronimo.xbeans.geronimo.jaspi.JaspiConfigProviderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.jaspi.JaspiConfigProviderType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.apache.geronimo.xbeans.geronimo.jaspi.JaspiConfigProviderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.apache.geronimo.xbeans.geronimo.jaspi.JaspiConfigProviderType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.geronimo.jaspi.JaspiConfigProviderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.jaspi.JaspiConfigProviderType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.geronimo.jaspi.JaspiConfigProviderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.apache.geronimo.xbeans.geronimo.jaspi.JaspiConfigProviderType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.jaspi.JaspiConfigProviderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.jaspi.JaspiConfigProviderType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.jaspi.JaspiConfigProviderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.apache.geronimo.xbeans.geronimo.jaspi.JaspiConfigProviderType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.jaspi.JaspiConfigProviderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.jaspi.JaspiConfigProviderType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.jaspi.JaspiConfigProviderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.apache.geronimo.xbeans.geronimo.jaspi.JaspiConfigProviderType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.jaspi.JaspiConfigProviderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.jaspi.JaspiConfigProviderType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.jaspi.JaspiConfigProviderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.apache.geronimo.xbeans.geronimo.jaspi.JaspiConfigProviderType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.jaspi.JaspiConfigProviderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.jaspi.JaspiConfigProviderType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.jaspi.JaspiConfigProviderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.apache.geronimo.xbeans.geronimo.jaspi.JaspiConfigProviderType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.geronimo.jaspi.JaspiConfigProviderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.jaspi.JaspiConfigProviderType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.geronimo.jaspi.JaspiConfigProviderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.apache.geronimo.xbeans.geronimo.jaspi.JaspiConfigProviderType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.geronimo.jaspi.JaspiConfigProviderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.jaspi.JaspiConfigProviderType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.geronimo.jaspi.JaspiConfigProviderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.geronimo.xbeans.geronimo.jaspi.JaspiConfigProviderType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.geronimo.xbeans.geronimo.jaspi.JaspiConfigProviderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.geronimo.xbeans.geronimo.jaspi.JaspiConfigProviderType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.geronimo.xbeans.geronimo.jaspi.JaspiConfigProviderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
