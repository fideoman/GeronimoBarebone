/*
 * XML Type:  message-destinationType
 * Namespace: http://geronimo.apache.org/xml/ns/naming-1.2
 * Java type: org.apache.geronimo.xbeans.geronimo.naming.GerMessageDestinationType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.geronimo.naming;


/**
 * An XML message-destinationType(@http://geronimo.apache.org/xml/ns/naming-1.2).
 *
 * This is a complex type.
 */
public interface GerMessageDestinationType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GerMessageDestinationType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1DE3CC699F4F003C18CA209853695E0").resolveHandle("messagedestinationtype1de2type");
    
    /**
     * Gets the "message-destination-name" element
     */
    java.lang.String getMessageDestinationName();
    
    /**
     * Gets (as xml) the "message-destination-name" element
     */
    org.apache.xmlbeans.XmlString xgetMessageDestinationName();
    
    /**
     * Sets the "message-destination-name" element
     */
    void setMessageDestinationName(java.lang.String messageDestinationName);
    
    /**
     * Sets (as xml) the "message-destination-name" element
     */
    void xsetMessageDestinationName(org.apache.xmlbeans.XmlString messageDestinationName);
    
    /**
     * Gets the "pattern" element
     */
    org.apache.geronimo.xbeans.geronimo.naming.GerPatternType getPattern();
    
    /**
     * True if has "pattern" element
     */
    boolean isSetPattern();
    
    /**
     * Sets the "pattern" element
     */
    void setPattern(org.apache.geronimo.xbeans.geronimo.naming.GerPatternType pattern);
    
    /**
     * Appends and returns a new empty "pattern" element
     */
    org.apache.geronimo.xbeans.geronimo.naming.GerPatternType addNewPattern();
    
    /**
     * Unsets the "pattern" element
     */
    void unsetPattern();
    
    /**
     * Gets the "admin-object-module" element
     */
    java.lang.String getAdminObjectModule();
    
    /**
     * Gets (as xml) the "admin-object-module" element
     */
    org.apache.xmlbeans.XmlString xgetAdminObjectModule();
    
    /**
     * True if has "admin-object-module" element
     */
    boolean isSetAdminObjectModule();
    
    /**
     * Sets the "admin-object-module" element
     */
    void setAdminObjectModule(java.lang.String adminObjectModule);
    
    /**
     * Sets (as xml) the "admin-object-module" element
     */
    void xsetAdminObjectModule(org.apache.xmlbeans.XmlString adminObjectModule);
    
    /**
     * Unsets the "admin-object-module" element
     */
    void unsetAdminObjectModule();
    
    /**
     * Gets the "admin-object-link" element
     */
    java.lang.String getAdminObjectLink();
    
    /**
     * Gets (as xml) the "admin-object-link" element
     */
    org.apache.xmlbeans.XmlString xgetAdminObjectLink();
    
    /**
     * True if has "admin-object-link" element
     */
    boolean isSetAdminObjectLink();
    
    /**
     * Sets the "admin-object-link" element
     */
    void setAdminObjectLink(java.lang.String adminObjectLink);
    
    /**
     * Sets (as xml) the "admin-object-link" element
     */
    void xsetAdminObjectLink(org.apache.xmlbeans.XmlString adminObjectLink);
    
    /**
     * Unsets the "admin-object-link" element
     */
    void unsetAdminObjectLink();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.apache.geronimo.xbeans.geronimo.naming.GerMessageDestinationType newInstance() {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerMessageDestinationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.naming.GerMessageDestinationType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerMessageDestinationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.apache.geronimo.xbeans.geronimo.naming.GerMessageDestinationType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerMessageDestinationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.naming.GerMessageDestinationType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerMessageDestinationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.apache.geronimo.xbeans.geronimo.naming.GerMessageDestinationType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerMessageDestinationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.naming.GerMessageDestinationType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerMessageDestinationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.apache.geronimo.xbeans.geronimo.naming.GerMessageDestinationType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerMessageDestinationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.naming.GerMessageDestinationType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerMessageDestinationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.apache.geronimo.xbeans.geronimo.naming.GerMessageDestinationType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerMessageDestinationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.naming.GerMessageDestinationType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerMessageDestinationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.apache.geronimo.xbeans.geronimo.naming.GerMessageDestinationType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerMessageDestinationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.naming.GerMessageDestinationType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerMessageDestinationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.apache.geronimo.xbeans.geronimo.naming.GerMessageDestinationType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerMessageDestinationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.naming.GerMessageDestinationType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerMessageDestinationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.apache.geronimo.xbeans.geronimo.naming.GerMessageDestinationType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerMessageDestinationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.naming.GerMessageDestinationType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerMessageDestinationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.geronimo.xbeans.geronimo.naming.GerMessageDestinationType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerMessageDestinationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.geronimo.xbeans.geronimo.naming.GerMessageDestinationType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerMessageDestinationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
