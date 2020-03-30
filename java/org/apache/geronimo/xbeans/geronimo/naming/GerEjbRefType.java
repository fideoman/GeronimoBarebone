/*
 * XML Type:  ejb-refType
 * Namespace: http://geronimo.apache.org/xml/ns/naming-1.2
 * Java type: org.apache.geronimo.xbeans.geronimo.naming.GerEjbRefType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.geronimo.naming;


/**
 * An XML ejb-refType(@http://geronimo.apache.org/xml/ns/naming-1.2).
 *
 * This is a complex type.
 */
public interface GerEjbRefType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GerEjbRefType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1DE3CC699F4F003C18CA209853695E0").resolveHandle("ejbreftypeb4e7type");
    
    /**
     * Gets the "ref-name" element
     */
    java.lang.String getRefName();
    
    /**
     * Gets (as xml) the "ref-name" element
     */
    org.apache.xmlbeans.XmlString xgetRefName();
    
    /**
     * Sets the "ref-name" element
     */
    void setRefName(java.lang.String refName);
    
    /**
     * Sets (as xml) the "ref-name" element
     */
    void xsetRefName(org.apache.xmlbeans.XmlString refName);
    
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
     * Gets the "ns-corbaloc" element
     */
    java.lang.String getNsCorbaloc();
    
    /**
     * Gets (as xml) the "ns-corbaloc" element
     */
    org.apache.xmlbeans.XmlAnyURI xgetNsCorbaloc();
    
    /**
     * True if has "ns-corbaloc" element
     */
    boolean isSetNsCorbaloc();
    
    /**
     * Sets the "ns-corbaloc" element
     */
    void setNsCorbaloc(java.lang.String nsCorbaloc);
    
    /**
     * Sets (as xml) the "ns-corbaloc" element
     */
    void xsetNsCorbaloc(org.apache.xmlbeans.XmlAnyURI nsCorbaloc);
    
    /**
     * Unsets the "ns-corbaloc" element
     */
    void unsetNsCorbaloc();
    
    /**
     * Gets the "name" element
     */
    java.lang.String getName();
    
    /**
     * Gets (as xml) the "name" element
     */
    org.apache.xmlbeans.XmlString xgetName();
    
    /**
     * True if has "name" element
     */
    boolean isSetName();
    
    /**
     * Sets the "name" element
     */
    void setName(java.lang.String name);
    
    /**
     * Sets (as xml) the "name" element
     */
    void xsetName(org.apache.xmlbeans.XmlString name);
    
    /**
     * Unsets the "name" element
     */
    void unsetName();
    
    /**
     * Gets the "css" element
     */
    org.apache.geronimo.xbeans.geronimo.naming.GerPatternType getCss();
    
    /**
     * True if has "css" element
     */
    boolean isSetCss();
    
    /**
     * Sets the "css" element
     */
    void setCss(org.apache.geronimo.xbeans.geronimo.naming.GerPatternType css);
    
    /**
     * Appends and returns a new empty "css" element
     */
    org.apache.geronimo.xbeans.geronimo.naming.GerPatternType addNewCss();
    
    /**
     * Unsets the "css" element
     */
    void unsetCss();
    
    /**
     * Gets the "css-link" element
     */
    java.lang.String getCssLink();
    
    /**
     * Gets (as xml) the "css-link" element
     */
    org.apache.xmlbeans.XmlString xgetCssLink();
    
    /**
     * True if has "css-link" element
     */
    boolean isSetCssLink();
    
    /**
     * Sets the "css-link" element
     */
    void setCssLink(java.lang.String cssLink);
    
    /**
     * Sets (as xml) the "css-link" element
     */
    void xsetCssLink(org.apache.xmlbeans.XmlString cssLink);
    
    /**
     * Unsets the "css-link" element
     */
    void unsetCssLink();
    
    /**
     * Gets the "ejb-link" element
     */
    java.lang.String getEjbLink();
    
    /**
     * Gets (as xml) the "ejb-link" element
     */
    org.apache.xmlbeans.XmlString xgetEjbLink();
    
    /**
     * True if has "ejb-link" element
     */
    boolean isSetEjbLink();
    
    /**
     * Sets the "ejb-link" element
     */
    void setEjbLink(java.lang.String ejbLink);
    
    /**
     * Sets (as xml) the "ejb-link" element
     */
    void xsetEjbLink(org.apache.xmlbeans.XmlString ejbLink);
    
    /**
     * Unsets the "ejb-link" element
     */
    void unsetEjbLink();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.apache.geronimo.xbeans.geronimo.naming.GerEjbRefType newInstance() {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerEjbRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.naming.GerEjbRefType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerEjbRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.apache.geronimo.xbeans.geronimo.naming.GerEjbRefType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerEjbRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.naming.GerEjbRefType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerEjbRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.apache.geronimo.xbeans.geronimo.naming.GerEjbRefType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerEjbRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.naming.GerEjbRefType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerEjbRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.apache.geronimo.xbeans.geronimo.naming.GerEjbRefType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerEjbRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.naming.GerEjbRefType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerEjbRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.apache.geronimo.xbeans.geronimo.naming.GerEjbRefType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerEjbRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.naming.GerEjbRefType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerEjbRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.apache.geronimo.xbeans.geronimo.naming.GerEjbRefType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerEjbRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.naming.GerEjbRefType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerEjbRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.apache.geronimo.xbeans.geronimo.naming.GerEjbRefType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerEjbRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.naming.GerEjbRefType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerEjbRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.apache.geronimo.xbeans.geronimo.naming.GerEjbRefType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerEjbRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.naming.GerEjbRefType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerEjbRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.geronimo.xbeans.geronimo.naming.GerEjbRefType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerEjbRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.geronimo.xbeans.geronimo.naming.GerEjbRefType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerEjbRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
