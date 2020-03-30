/*
 * An XML attribute type.
 * Localname: required
 * Namespace: http://schemas.xmlsoap.org/wsdl/
 * Java type: org.apache.geronimo.xbeans.wsdl.RequiredAttribute
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.wsdl;


/**
 * A document containing one required(@http://schemas.xmlsoap.org/wsdl/) attribute.
 *
 * This is a complex type.
 */
public interface RequiredAttribute extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RequiredAttribute.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDD32E5A2898F33527024818ADE537D3B").resolveHandle("requiredff7cattrtypetype");
    
    /**
     * Gets the "required" attribute
     */
    boolean getRequired();
    
    /**
     * Gets (as xml) the "required" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetRequired();
    
    /**
     * True if has "required" attribute
     */
    boolean isSetRequired();
    
    /**
     * Sets the "required" attribute
     */
    void setRequired(boolean required);
    
    /**
     * Sets (as xml) the "required" attribute
     */
    void xsetRequired(org.apache.xmlbeans.XmlBoolean required);
    
    /**
     * Unsets the "required" attribute
     */
    void unsetRequired();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.apache.geronimo.xbeans.wsdl.RequiredAttribute newInstance() {
          return (org.apache.geronimo.xbeans.wsdl.RequiredAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.apache.geronimo.xbeans.wsdl.RequiredAttribute newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.apache.geronimo.xbeans.wsdl.RequiredAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.apache.geronimo.xbeans.wsdl.RequiredAttribute parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.wsdl.RequiredAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.apache.geronimo.xbeans.wsdl.RequiredAttribute parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.wsdl.RequiredAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.apache.geronimo.xbeans.wsdl.RequiredAttribute parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.wsdl.RequiredAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.apache.geronimo.xbeans.wsdl.RequiredAttribute parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.wsdl.RequiredAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.apache.geronimo.xbeans.wsdl.RequiredAttribute parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.wsdl.RequiredAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.apache.geronimo.xbeans.wsdl.RequiredAttribute parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.wsdl.RequiredAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.apache.geronimo.xbeans.wsdl.RequiredAttribute parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.wsdl.RequiredAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.apache.geronimo.xbeans.wsdl.RequiredAttribute parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.wsdl.RequiredAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.apache.geronimo.xbeans.wsdl.RequiredAttribute parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.wsdl.RequiredAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.apache.geronimo.xbeans.wsdl.RequiredAttribute parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.wsdl.RequiredAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.apache.geronimo.xbeans.wsdl.RequiredAttribute parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.wsdl.RequiredAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.apache.geronimo.xbeans.wsdl.RequiredAttribute parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.wsdl.RequiredAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.apache.geronimo.xbeans.wsdl.RequiredAttribute parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.wsdl.RequiredAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.apache.geronimo.xbeans.wsdl.RequiredAttribute parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.wsdl.RequiredAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.geronimo.xbeans.wsdl.RequiredAttribute parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.geronimo.xbeans.wsdl.RequiredAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.geronimo.xbeans.wsdl.RequiredAttribute parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.geronimo.xbeans.wsdl.RequiredAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
