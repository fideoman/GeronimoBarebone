/*
 * XML Type:  tomcat-configType
 * Namespace: http://geronimo.apache.org/xml/ns/web/tomcat/config-1.0
 * Java type: org.apache.geronimo.xbeans.geronimo.web.tomcat.config.GerTomcatConfigType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.geronimo.web.tomcat.config;


/**
 * An XML tomcat-configType(@http://geronimo.apache.org/xml/ns/web/tomcat/config-1.0).
 *
 * This is a complex type.
 */
public interface GerTomcatConfigType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GerTomcatConfigType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0AA4320C5FAEDBCDB82FFFAFAC4D0F41").resolveHandle("tomcatconfigtypecd89type");
    
    /**
     * Gets the "host" element
     */
    java.lang.String getHost();
    
    /**
     * Gets (as xml) the "host" element
     */
    org.apache.xmlbeans.XmlString xgetHost();
    
    /**
     * True if has "host" element
     */
    boolean isSetHost();
    
    /**
     * Sets the "host" element
     */
    void setHost(java.lang.String host);
    
    /**
     * Sets (as xml) the "host" element
     */
    void xsetHost(org.apache.xmlbeans.XmlString host);
    
    /**
     * Unsets the "host" element
     */
    void unsetHost();
    
    /**
     * Gets the "cross-context" element
     */
    org.apache.geronimo.xbeans.geronimo.web.tomcat.config.GerEmptyType getCrossContext();
    
    /**
     * True if has "cross-context" element
     */
    boolean isSetCrossContext();
    
    /**
     * Sets the "cross-context" element
     */
    void setCrossContext(org.apache.geronimo.xbeans.geronimo.web.tomcat.config.GerEmptyType crossContext);
    
    /**
     * Appends and returns a new empty "cross-context" element
     */
    org.apache.geronimo.xbeans.geronimo.web.tomcat.config.GerEmptyType addNewCrossContext();
    
    /**
     * Unsets the "cross-context" element
     */
    void unsetCrossContext();
    
    /**
     * Gets the "disable-cookies" element
     */
    org.apache.geronimo.xbeans.geronimo.web.tomcat.config.GerEmptyType getDisableCookies();
    
    /**
     * True if has "disable-cookies" element
     */
    boolean isSetDisableCookies();
    
    /**
     * Sets the "disable-cookies" element
     */
    void setDisableCookies(org.apache.geronimo.xbeans.geronimo.web.tomcat.config.GerEmptyType disableCookies);
    
    /**
     * Appends and returns a new empty "disable-cookies" element
     */
    org.apache.geronimo.xbeans.geronimo.web.tomcat.config.GerEmptyType addNewDisableCookies();
    
    /**
     * Unsets the "disable-cookies" element
     */
    void unsetDisableCookies();
    
    /**
     * Gets the "context" element
     */
    org.apache.geronimo.xbeans.geronimo.web.tomcat.config.GerContextType getContext();
    
    /**
     * True if has "context" element
     */
    boolean isSetContext();
    
    /**
     * Sets the "context" element
     */
    void setContext(org.apache.geronimo.xbeans.geronimo.web.tomcat.config.GerContextType context);
    
    /**
     * Appends and returns a new empty "context" element
     */
    org.apache.geronimo.xbeans.geronimo.web.tomcat.config.GerContextType addNewContext();
    
    /**
     * Unsets the "context" element
     */
    void unsetContext();
    
    /**
     * Gets the "valve-chain" element
     */
    java.lang.String getValveChain();
    
    /**
     * Gets (as xml) the "valve-chain" element
     */
    org.apache.xmlbeans.XmlString xgetValveChain();
    
    /**
     * True if has "valve-chain" element
     */
    boolean isSetValveChain();
    
    /**
     * Sets the "valve-chain" element
     */
    void setValveChain(java.lang.String valveChain);
    
    /**
     * Sets (as xml) the "valve-chain" element
     */
    void xsetValveChain(org.apache.xmlbeans.XmlString valveChain);
    
    /**
     * Unsets the "valve-chain" element
     */
    void unsetValveChain();
    
    /**
     * Gets the "listener-chain" element
     */
    java.lang.String getListenerChain();
    
    /**
     * Gets (as xml) the "listener-chain" element
     */
    org.apache.xmlbeans.XmlString xgetListenerChain();
    
    /**
     * True if has "listener-chain" element
     */
    boolean isSetListenerChain();
    
    /**
     * Sets the "listener-chain" element
     */
    void setListenerChain(java.lang.String listenerChain);
    
    /**
     * Sets (as xml) the "listener-chain" element
     */
    void xsetListenerChain(org.apache.xmlbeans.XmlString listenerChain);
    
    /**
     * Unsets the "listener-chain" element
     */
    void unsetListenerChain();
    
    /**
     * Gets the "tomcat-realm" element
     */
    java.lang.String getTomcatRealm();
    
    /**
     * Gets (as xml) the "tomcat-realm" element
     */
    org.apache.xmlbeans.XmlString xgetTomcatRealm();
    
    /**
     * True if has "tomcat-realm" element
     */
    boolean isSetTomcatRealm();
    
    /**
     * Sets the "tomcat-realm" element
     */
    void setTomcatRealm(java.lang.String tomcatRealm);
    
    /**
     * Sets (as xml) the "tomcat-realm" element
     */
    void xsetTomcatRealm(org.apache.xmlbeans.XmlString tomcatRealm);
    
    /**
     * Unsets the "tomcat-realm" element
     */
    void unsetTomcatRealm();
    
    /**
     * Gets the "manager" element
     */
    java.lang.String getManager();
    
    /**
     * Gets (as xml) the "manager" element
     */
    org.apache.xmlbeans.XmlString xgetManager();
    
    /**
     * True if has "manager" element
     */
    boolean isSetManager();
    
    /**
     * Sets the "manager" element
     */
    void setManager(java.lang.String manager);
    
    /**
     * Sets (as xml) the "manager" element
     */
    void xsetManager(org.apache.xmlbeans.XmlString manager);
    
    /**
     * Unsets the "manager" element
     */
    void unsetManager();
    
    /**
     * Gets the "cluster" element
     */
    java.lang.String getCluster();
    
    /**
     * Gets (as xml) the "cluster" element
     */
    org.apache.xmlbeans.XmlString xgetCluster();
    
    /**
     * True if has "cluster" element
     */
    boolean isSetCluster();
    
    /**
     * Sets the "cluster" element
     */
    void setCluster(java.lang.String cluster);
    
    /**
     * Sets (as xml) the "cluster" element
     */
    void xsetCluster(org.apache.xmlbeans.XmlString cluster);
    
    /**
     * Unsets the "cluster" element
     */
    void unsetCluster();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.apache.geronimo.xbeans.geronimo.web.tomcat.config.GerTomcatConfigType newInstance() {
          return (org.apache.geronimo.xbeans.geronimo.web.tomcat.config.GerTomcatConfigType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.web.tomcat.config.GerTomcatConfigType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.apache.geronimo.xbeans.geronimo.web.tomcat.config.GerTomcatConfigType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.apache.geronimo.xbeans.geronimo.web.tomcat.config.GerTomcatConfigType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.geronimo.web.tomcat.config.GerTomcatConfigType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.web.tomcat.config.GerTomcatConfigType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.geronimo.web.tomcat.config.GerTomcatConfigType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.apache.geronimo.xbeans.geronimo.web.tomcat.config.GerTomcatConfigType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.web.tomcat.config.GerTomcatConfigType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.web.tomcat.config.GerTomcatConfigType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.web.tomcat.config.GerTomcatConfigType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.apache.geronimo.xbeans.geronimo.web.tomcat.config.GerTomcatConfigType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.web.tomcat.config.GerTomcatConfigType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.web.tomcat.config.GerTomcatConfigType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.web.tomcat.config.GerTomcatConfigType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.apache.geronimo.xbeans.geronimo.web.tomcat.config.GerTomcatConfigType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.web.tomcat.config.GerTomcatConfigType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.web.tomcat.config.GerTomcatConfigType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.web.tomcat.config.GerTomcatConfigType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.apache.geronimo.xbeans.geronimo.web.tomcat.config.GerTomcatConfigType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.web.tomcat.config.GerTomcatConfigType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.web.tomcat.config.GerTomcatConfigType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.web.tomcat.config.GerTomcatConfigType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.apache.geronimo.xbeans.geronimo.web.tomcat.config.GerTomcatConfigType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.geronimo.web.tomcat.config.GerTomcatConfigType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.web.tomcat.config.GerTomcatConfigType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.geronimo.web.tomcat.config.GerTomcatConfigType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.apache.geronimo.xbeans.geronimo.web.tomcat.config.GerTomcatConfigType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.geronimo.web.tomcat.config.GerTomcatConfigType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.web.tomcat.config.GerTomcatConfigType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.geronimo.web.tomcat.config.GerTomcatConfigType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.geronimo.xbeans.geronimo.web.tomcat.config.GerTomcatConfigType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.geronimo.xbeans.geronimo.web.tomcat.config.GerTomcatConfigType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.geronimo.xbeans.geronimo.web.tomcat.config.GerTomcatConfigType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.geronimo.xbeans.geronimo.web.tomcat.config.GerTomcatConfigType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
