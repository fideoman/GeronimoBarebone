/*
 * XML Type:  moduleType
 * Namespace: http://geronimo.apache.org/xml/ns/j2ee/application-2.0
 * Java type: org.apache.geronimo.xbeans.geronimo.j2ee.GerModuleType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.geronimo.j2ee;


/**
 * An XML moduleType(@http://geronimo.apache.org/xml/ns/j2ee/application-2.0).
 *
 * This is a complex type.
 */
public interface GerModuleType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GerModuleType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDC67E1A1DF49495E839343AC6B681AEB").resolveHandle("moduletype89ectype");
    
    /**
     * Gets the "connector" element
     */
    org.apache.geronimo.xbeans.geronimo.j2ee.GerPathType getConnector();
    
    /**
     * True if has "connector" element
     */
    boolean isSetConnector();
    
    /**
     * Sets the "connector" element
     */
    void setConnector(org.apache.geronimo.xbeans.geronimo.j2ee.GerPathType connector);
    
    /**
     * Appends and returns a new empty "connector" element
     */
    org.apache.geronimo.xbeans.geronimo.j2ee.GerPathType addNewConnector();
    
    /**
     * Unsets the "connector" element
     */
    void unsetConnector();
    
    /**
     * Gets the "ejb" element
     */
    org.apache.geronimo.xbeans.geronimo.j2ee.GerPathType getEjb();
    
    /**
     * True if has "ejb" element
     */
    boolean isSetEjb();
    
    /**
     * Sets the "ejb" element
     */
    void setEjb(org.apache.geronimo.xbeans.geronimo.j2ee.GerPathType ejb);
    
    /**
     * Appends and returns a new empty "ejb" element
     */
    org.apache.geronimo.xbeans.geronimo.j2ee.GerPathType addNewEjb();
    
    /**
     * Unsets the "ejb" element
     */
    void unsetEjb();
    
    /**
     * Gets the "java" element
     */
    org.apache.geronimo.xbeans.geronimo.j2ee.GerPathType getJava();
    
    /**
     * True if has "java" element
     */
    boolean isSetJava();
    
    /**
     * Sets the "java" element
     */
    void setJava(org.apache.geronimo.xbeans.geronimo.j2ee.GerPathType java);
    
    /**
     * Appends and returns a new empty "java" element
     */
    org.apache.geronimo.xbeans.geronimo.j2ee.GerPathType addNewJava();
    
    /**
     * Unsets the "java" element
     */
    void unsetJava();
    
    /**
     * Gets the "web" element
     */
    org.apache.geronimo.xbeans.geronimo.j2ee.GerPathType getWeb();
    
    /**
     * True if has "web" element
     */
    boolean isSetWeb();
    
    /**
     * Sets the "web" element
     */
    void setWeb(org.apache.geronimo.xbeans.geronimo.j2ee.GerPathType web);
    
    /**
     * Appends and returns a new empty "web" element
     */
    org.apache.geronimo.xbeans.geronimo.j2ee.GerPathType addNewWeb();
    
    /**
     * Unsets the "web" element
     */
    void unsetWeb();
    
    /**
     * Gets the "alt-dd" element
     */
    org.apache.geronimo.xbeans.geronimo.j2ee.GerPathType getAltDd();
    
    /**
     * True if has "alt-dd" element
     */
    boolean isSetAltDd();
    
    /**
     * Sets the "alt-dd" element
     */
    void setAltDd(org.apache.geronimo.xbeans.geronimo.j2ee.GerPathType altDd);
    
    /**
     * Appends and returns a new empty "alt-dd" element
     */
    org.apache.geronimo.xbeans.geronimo.j2ee.GerPathType addNewAltDd();
    
    /**
     * Unsets the "alt-dd" element
     */
    void unsetAltDd();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.apache.geronimo.xbeans.geronimo.j2ee.GerModuleType newInstance() {
          return (org.apache.geronimo.xbeans.geronimo.j2ee.GerModuleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.j2ee.GerModuleType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.apache.geronimo.xbeans.geronimo.j2ee.GerModuleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.apache.geronimo.xbeans.geronimo.j2ee.GerModuleType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.geronimo.j2ee.GerModuleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.j2ee.GerModuleType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.geronimo.j2ee.GerModuleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.apache.geronimo.xbeans.geronimo.j2ee.GerModuleType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.j2ee.GerModuleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.j2ee.GerModuleType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.j2ee.GerModuleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.apache.geronimo.xbeans.geronimo.j2ee.GerModuleType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.j2ee.GerModuleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.j2ee.GerModuleType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.j2ee.GerModuleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.apache.geronimo.xbeans.geronimo.j2ee.GerModuleType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.j2ee.GerModuleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.j2ee.GerModuleType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.j2ee.GerModuleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.apache.geronimo.xbeans.geronimo.j2ee.GerModuleType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.j2ee.GerModuleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.j2ee.GerModuleType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.j2ee.GerModuleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.apache.geronimo.xbeans.geronimo.j2ee.GerModuleType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.geronimo.j2ee.GerModuleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.j2ee.GerModuleType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.geronimo.j2ee.GerModuleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.apache.geronimo.xbeans.geronimo.j2ee.GerModuleType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.geronimo.j2ee.GerModuleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.j2ee.GerModuleType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.geronimo.j2ee.GerModuleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.geronimo.xbeans.geronimo.j2ee.GerModuleType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.geronimo.xbeans.geronimo.j2ee.GerModuleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.geronimo.xbeans.geronimo.j2ee.GerModuleType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.geronimo.xbeans.geronimo.j2ee.GerModuleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
