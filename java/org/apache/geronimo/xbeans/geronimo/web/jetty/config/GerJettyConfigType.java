/*
 * XML Type:  jetty-configType
 * Namespace: http://geronimo.apache.org/xml/ns/web/jetty/config-1.0.1
 * Java type: org.apache.geronimo.xbeans.geronimo.web.jetty.config.GerJettyConfigType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.geronimo.web.jetty.config;


/**
 * An XML jetty-configType(@http://geronimo.apache.org/xml/ns/web/jetty/config-1.0.1).
 *
 * This is a complex type.
 */
public interface GerJettyConfigType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GerJettyConfigType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s410131F774D16ACADDA4C3237CEF120B").resolveHandle("jettyconfigtypee0aetype");
    
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
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.apache.geronimo.xbeans.geronimo.web.jetty.config.GerJettyConfigType newInstance() {
          return (org.apache.geronimo.xbeans.geronimo.web.jetty.config.GerJettyConfigType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.web.jetty.config.GerJettyConfigType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.apache.geronimo.xbeans.geronimo.web.jetty.config.GerJettyConfigType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.apache.geronimo.xbeans.geronimo.web.jetty.config.GerJettyConfigType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.geronimo.web.jetty.config.GerJettyConfigType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.web.jetty.config.GerJettyConfigType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.geronimo.web.jetty.config.GerJettyConfigType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.apache.geronimo.xbeans.geronimo.web.jetty.config.GerJettyConfigType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.web.jetty.config.GerJettyConfigType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.web.jetty.config.GerJettyConfigType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.web.jetty.config.GerJettyConfigType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.apache.geronimo.xbeans.geronimo.web.jetty.config.GerJettyConfigType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.web.jetty.config.GerJettyConfigType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.web.jetty.config.GerJettyConfigType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.web.jetty.config.GerJettyConfigType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.apache.geronimo.xbeans.geronimo.web.jetty.config.GerJettyConfigType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.web.jetty.config.GerJettyConfigType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.web.jetty.config.GerJettyConfigType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.web.jetty.config.GerJettyConfigType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.apache.geronimo.xbeans.geronimo.web.jetty.config.GerJettyConfigType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.web.jetty.config.GerJettyConfigType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.web.jetty.config.GerJettyConfigType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.web.jetty.config.GerJettyConfigType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.apache.geronimo.xbeans.geronimo.web.jetty.config.GerJettyConfigType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.geronimo.web.jetty.config.GerJettyConfigType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.web.jetty.config.GerJettyConfigType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.geronimo.web.jetty.config.GerJettyConfigType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.apache.geronimo.xbeans.geronimo.web.jetty.config.GerJettyConfigType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.geronimo.web.jetty.config.GerJettyConfigType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.web.jetty.config.GerJettyConfigType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.geronimo.web.jetty.config.GerJettyConfigType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.geronimo.xbeans.geronimo.web.jetty.config.GerJettyConfigType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.geronimo.xbeans.geronimo.web.jetty.config.GerJettyConfigType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.geronimo.xbeans.geronimo.web.jetty.config.GerJettyConfigType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.geronimo.xbeans.geronimo.web.jetty.config.GerJettyConfigType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
