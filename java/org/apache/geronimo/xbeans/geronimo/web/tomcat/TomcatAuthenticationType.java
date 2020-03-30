/*
 * XML Type:  authenticationType
 * Namespace: http://geronimo.apache.org/xml/ns/j2ee/web/tomcat-2.0.1
 * Java type: org.apache.geronimo.xbeans.geronimo.web.tomcat.TomcatAuthenticationType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.geronimo.web.tomcat;


/**
 * An XML authenticationType(@http://geronimo.apache.org/xml/ns/j2ee/web/tomcat-2.0.1).
 *
 * This is a complex type.
 */
public interface TomcatAuthenticationType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TomcatAuthenticationType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0AA4320C5FAEDBCDB82FFFAFAC4D0F41").resolveHandle("authenticationtype0080type");
    
    /**
     * Gets the "configProvider" element
     */
    org.apache.geronimo.xbeans.geronimo.jaspi.JaspiConfigProviderType getConfigProvider();
    
    /**
     * True if has "configProvider" element
     */
    boolean isSetConfigProvider();
    
    /**
     * Sets the "configProvider" element
     */
    void setConfigProvider(org.apache.geronimo.xbeans.geronimo.jaspi.JaspiConfigProviderType configProvider);
    
    /**
     * Appends and returns a new empty "configProvider" element
     */
    org.apache.geronimo.xbeans.geronimo.jaspi.JaspiConfigProviderType addNewConfigProvider();
    
    /**
     * Unsets the "configProvider" element
     */
    void unsetConfigProvider();
    
    /**
     * Gets the "serverAuthConfig" element
     */
    org.apache.geronimo.xbeans.geronimo.jaspi.JaspiServerAuthConfigType getServerAuthConfig();
    
    /**
     * True if has "serverAuthConfig" element
     */
    boolean isSetServerAuthConfig();
    
    /**
     * Sets the "serverAuthConfig" element
     */
    void setServerAuthConfig(org.apache.geronimo.xbeans.geronimo.jaspi.JaspiServerAuthConfigType serverAuthConfig);
    
    /**
     * Appends and returns a new empty "serverAuthConfig" element
     */
    org.apache.geronimo.xbeans.geronimo.jaspi.JaspiServerAuthConfigType addNewServerAuthConfig();
    
    /**
     * Unsets the "serverAuthConfig" element
     */
    void unsetServerAuthConfig();
    
    /**
     * Gets the "serverAuthContext" element
     */
    org.apache.geronimo.xbeans.geronimo.jaspi.JaspiServerAuthContextType getServerAuthContext();
    
    /**
     * True if has "serverAuthContext" element
     */
    boolean isSetServerAuthContext();
    
    /**
     * Sets the "serverAuthContext" element
     */
    void setServerAuthContext(org.apache.geronimo.xbeans.geronimo.jaspi.JaspiServerAuthContextType serverAuthContext);
    
    /**
     * Appends and returns a new empty "serverAuthContext" element
     */
    org.apache.geronimo.xbeans.geronimo.jaspi.JaspiServerAuthContextType addNewServerAuthContext();
    
    /**
     * Unsets the "serverAuthContext" element
     */
    void unsetServerAuthContext();
    
    /**
     * Gets the "serverAuthModule" element
     */
    org.apache.geronimo.xbeans.geronimo.jaspi.JaspiAuthModuleType getServerAuthModule();
    
    /**
     * True if has "serverAuthModule" element
     */
    boolean isSetServerAuthModule();
    
    /**
     * Sets the "serverAuthModule" element
     */
    void setServerAuthModule(org.apache.geronimo.xbeans.geronimo.jaspi.JaspiAuthModuleType serverAuthModule);
    
    /**
     * Appends and returns a new empty "serverAuthModule" element
     */
    org.apache.geronimo.xbeans.geronimo.jaspi.JaspiAuthModuleType addNewServerAuthModule();
    
    /**
     * Unsets the "serverAuthModule" element
     */
    void unsetServerAuthModule();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.apache.geronimo.xbeans.geronimo.web.tomcat.TomcatAuthenticationType newInstance() {
          return (org.apache.geronimo.xbeans.geronimo.web.tomcat.TomcatAuthenticationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.web.tomcat.TomcatAuthenticationType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.apache.geronimo.xbeans.geronimo.web.tomcat.TomcatAuthenticationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.apache.geronimo.xbeans.geronimo.web.tomcat.TomcatAuthenticationType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.geronimo.web.tomcat.TomcatAuthenticationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.web.tomcat.TomcatAuthenticationType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.geronimo.web.tomcat.TomcatAuthenticationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.apache.geronimo.xbeans.geronimo.web.tomcat.TomcatAuthenticationType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.web.tomcat.TomcatAuthenticationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.web.tomcat.TomcatAuthenticationType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.web.tomcat.TomcatAuthenticationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.apache.geronimo.xbeans.geronimo.web.tomcat.TomcatAuthenticationType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.web.tomcat.TomcatAuthenticationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.web.tomcat.TomcatAuthenticationType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.web.tomcat.TomcatAuthenticationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.apache.geronimo.xbeans.geronimo.web.tomcat.TomcatAuthenticationType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.web.tomcat.TomcatAuthenticationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.web.tomcat.TomcatAuthenticationType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.web.tomcat.TomcatAuthenticationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.apache.geronimo.xbeans.geronimo.web.tomcat.TomcatAuthenticationType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.web.tomcat.TomcatAuthenticationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.web.tomcat.TomcatAuthenticationType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.web.tomcat.TomcatAuthenticationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.apache.geronimo.xbeans.geronimo.web.tomcat.TomcatAuthenticationType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.geronimo.web.tomcat.TomcatAuthenticationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.web.tomcat.TomcatAuthenticationType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.geronimo.web.tomcat.TomcatAuthenticationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.apache.geronimo.xbeans.geronimo.web.tomcat.TomcatAuthenticationType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.geronimo.web.tomcat.TomcatAuthenticationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.web.tomcat.TomcatAuthenticationType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.geronimo.web.tomcat.TomcatAuthenticationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.geronimo.xbeans.geronimo.web.tomcat.TomcatAuthenticationType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.geronimo.xbeans.geronimo.web.tomcat.TomcatAuthenticationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.geronimo.xbeans.geronimo.web.tomcat.TomcatAuthenticationType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.geronimo.xbeans.geronimo.web.tomcat.TomcatAuthenticationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
