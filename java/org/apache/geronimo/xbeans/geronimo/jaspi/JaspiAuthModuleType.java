/*
 * XML Type:  authModuleType
 * Namespace: http://geronimo.apache.org/xml/ns/geronimo-jaspi
 * Java type: org.apache.geronimo.xbeans.geronimo.jaspi.JaspiAuthModuleType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.geronimo.jaspi;


/**
 * An XML authModuleType(@http://geronimo.apache.org/xml/ns/geronimo-jaspi).
 *
 * This is a complex type.
 */
public interface JaspiAuthModuleType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(JaspiAuthModuleType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4769874CABA12AE1DF68A448E73C1B12").resolveHandle("authmoduletypedf54type");
    
    /**
     * Gets the "className" element
     */
    java.lang.String getClassName();
    
    /**
     * Gets (as xml) the "className" element
     */
    org.apache.xmlbeans.XmlString xgetClassName();
    
    /**
     * Sets the "className" element
     */
    void setClassName(java.lang.String className);
    
    /**
     * Sets (as xml) the "className" element
     */
    void xsetClassName(org.apache.xmlbeans.XmlString className);
    
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
     * Gets the "requestPolicy" element
     */
    org.apache.geronimo.xbeans.geronimo.jaspi.JaspiMessagePolicyType getRequestPolicy();
    
    /**
     * True if has "requestPolicy" element
     */
    boolean isSetRequestPolicy();
    
    /**
     * Sets the "requestPolicy" element
     */
    void setRequestPolicy(org.apache.geronimo.xbeans.geronimo.jaspi.JaspiMessagePolicyType requestPolicy);
    
    /**
     * Appends and returns a new empty "requestPolicy" element
     */
    org.apache.geronimo.xbeans.geronimo.jaspi.JaspiMessagePolicyType addNewRequestPolicy();
    
    /**
     * Unsets the "requestPolicy" element
     */
    void unsetRequestPolicy();
    
    /**
     * Gets the "responsePolicy" element
     */
    org.apache.geronimo.xbeans.geronimo.jaspi.JaspiMessagePolicyType getResponsePolicy();
    
    /**
     * True if has "responsePolicy" element
     */
    boolean isSetResponsePolicy();
    
    /**
     * Sets the "responsePolicy" element
     */
    void setResponsePolicy(org.apache.geronimo.xbeans.geronimo.jaspi.JaspiMessagePolicyType responsePolicy);
    
    /**
     * Appends and returns a new empty "responsePolicy" element
     */
    org.apache.geronimo.xbeans.geronimo.jaspi.JaspiMessagePolicyType addNewResponsePolicy();
    
    /**
     * Unsets the "responsePolicy" element
     */
    void unsetResponsePolicy();
    
    /**
     * Gets the "options" element
     */
    java.lang.String getOptions();
    
    /**
     * Gets (as xml) the "options" element
     */
    org.apache.xmlbeans.XmlString xgetOptions();
    
    /**
     * True if has "options" element
     */
    boolean isSetOptions();
    
    /**
     * Sets the "options" element
     */
    void setOptions(java.lang.String options);
    
    /**
     * Sets (as xml) the "options" element
     */
    void xsetOptions(org.apache.xmlbeans.XmlString options);
    
    /**
     * Unsets the "options" element
     */
    void unsetOptions();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.apache.geronimo.xbeans.geronimo.jaspi.JaspiAuthModuleType newInstance() {
          return (org.apache.geronimo.xbeans.geronimo.jaspi.JaspiAuthModuleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.jaspi.JaspiAuthModuleType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.apache.geronimo.xbeans.geronimo.jaspi.JaspiAuthModuleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.apache.geronimo.xbeans.geronimo.jaspi.JaspiAuthModuleType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.geronimo.jaspi.JaspiAuthModuleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.jaspi.JaspiAuthModuleType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.geronimo.jaspi.JaspiAuthModuleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.apache.geronimo.xbeans.geronimo.jaspi.JaspiAuthModuleType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.jaspi.JaspiAuthModuleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.jaspi.JaspiAuthModuleType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.jaspi.JaspiAuthModuleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.apache.geronimo.xbeans.geronimo.jaspi.JaspiAuthModuleType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.jaspi.JaspiAuthModuleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.jaspi.JaspiAuthModuleType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.jaspi.JaspiAuthModuleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.apache.geronimo.xbeans.geronimo.jaspi.JaspiAuthModuleType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.jaspi.JaspiAuthModuleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.jaspi.JaspiAuthModuleType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.jaspi.JaspiAuthModuleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.apache.geronimo.xbeans.geronimo.jaspi.JaspiAuthModuleType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.jaspi.JaspiAuthModuleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.jaspi.JaspiAuthModuleType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.jaspi.JaspiAuthModuleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.apache.geronimo.xbeans.geronimo.jaspi.JaspiAuthModuleType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.geronimo.jaspi.JaspiAuthModuleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.jaspi.JaspiAuthModuleType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.geronimo.jaspi.JaspiAuthModuleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.apache.geronimo.xbeans.geronimo.jaspi.JaspiAuthModuleType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.geronimo.jaspi.JaspiAuthModuleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.jaspi.JaspiAuthModuleType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.geronimo.jaspi.JaspiAuthModuleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.geronimo.xbeans.geronimo.jaspi.JaspiAuthModuleType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.geronimo.xbeans.geronimo.jaspi.JaspiAuthModuleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.geronimo.xbeans.geronimo.jaspi.JaspiAuthModuleType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.geronimo.xbeans.geronimo.jaspi.JaspiAuthModuleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
