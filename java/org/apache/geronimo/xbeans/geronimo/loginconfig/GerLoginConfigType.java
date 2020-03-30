/*
 * XML Type:  login-configType
 * Namespace: http://geronimo.apache.org/xml/ns/loginconfig-2.0
 * Java type: org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginConfigType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.geronimo.loginconfig;


/**
 * An XML login-configType(@http://geronimo.apache.org/xml/ns/loginconfig-2.0).
 *
 * This is a complex type.
 */
public interface GerLoginConfigType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GerLoginConfigType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4769874CABA12AE1DF68A448E73C1B12").resolveHandle("loginconfigtype59b0type");
    
    /**
     * Gets array of all "login-module-ref" elements
     */
    org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginModuleRefType[] getLoginModuleRefArray();
    
    /**
     * Gets ith "login-module-ref" element
     */
    org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginModuleRefType getLoginModuleRefArray(int i);
    
    /**
     * Returns number of "login-module-ref" element
     */
    int sizeOfLoginModuleRefArray();
    
    /**
     * Sets array of all "login-module-ref" element
     */
    void setLoginModuleRefArray(org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginModuleRefType[] loginModuleRefArray);
    
    /**
     * Sets ith "login-module-ref" element
     */
    void setLoginModuleRefArray(int i, org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginModuleRefType loginModuleRef);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "login-module-ref" element
     */
    org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginModuleRefType insertNewLoginModuleRef(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "login-module-ref" element
     */
    org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginModuleRefType addNewLoginModuleRef();
    
    /**
     * Removes the ith "login-module-ref" element
     */
    void removeLoginModuleRef(int i);
    
    /**
     * Gets array of all "login-module" elements
     */
    org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginModuleType[] getLoginModuleArray();
    
    /**
     * Gets ith "login-module" element
     */
    org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginModuleType getLoginModuleArray(int i);
    
    /**
     * Returns number of "login-module" element
     */
    int sizeOfLoginModuleArray();
    
    /**
     * Sets array of all "login-module" element
     */
    void setLoginModuleArray(org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginModuleType[] loginModuleArray);
    
    /**
     * Sets ith "login-module" element
     */
    void setLoginModuleArray(int i, org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginModuleType loginModule);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "login-module" element
     */
    org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginModuleType insertNewLoginModule(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "login-module" element
     */
    org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginModuleType addNewLoginModule();
    
    /**
     * Removes the ith "login-module" element
     */
    void removeLoginModule(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginConfigType newInstance() {
          return (org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginConfigType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginConfigType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginConfigType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginConfigType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginConfigType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginConfigType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginConfigType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginConfigType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginConfigType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginConfigType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginConfigType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginConfigType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginConfigType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginConfigType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginConfigType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginConfigType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginConfigType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginConfigType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginConfigType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginConfigType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginConfigType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginConfigType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginConfigType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginConfigType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginConfigType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginConfigType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginConfigType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginConfigType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginConfigType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginConfigType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginConfigType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginConfigType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginConfigType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginConfigType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginConfigType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
