/*
 * XML Type:  web-service-securityType
 * Namespace: http://geronimo.apache.org/xml/ns/j2ee/ejb/openejb-2.0
 * Java type: org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbWebServiceSecurityType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.openejb.xbeans.ejbjar;


/**
 * An XML web-service-securityType(@http://geronimo.apache.org/xml/ns/j2ee/ejb/openejb-2.0).
 *
 * This is a complex type.
 */
public interface OpenejbWebServiceSecurityType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OpenejbWebServiceSecurityType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sCB8E5D801CA82AB8B1999B71F1BE50C7").resolveHandle("webservicesecuritytype8098type");
    
    /**
     * Gets the "security-realm-name" element
     */
    java.lang.String getSecurityRealmName();
    
    /**
     * Gets (as xml) the "security-realm-name" element
     */
    org.apache.xmlbeans.XmlString xgetSecurityRealmName();
    
    /**
     * Sets the "security-realm-name" element
     */
    void setSecurityRealmName(java.lang.String securityRealmName);
    
    /**
     * Sets (as xml) the "security-realm-name" element
     */
    void xsetSecurityRealmName(org.apache.xmlbeans.XmlString securityRealmName);
    
    /**
     * Gets the "realm-name" element
     */
    java.lang.String getRealmName();
    
    /**
     * Gets (as xml) the "realm-name" element
     */
    org.apache.xmlbeans.XmlString xgetRealmName();
    
    /**
     * True if has "realm-name" element
     */
    boolean isSetRealmName();
    
    /**
     * Sets the "realm-name" element
     */
    void setRealmName(java.lang.String realmName);
    
    /**
     * Sets (as xml) the "realm-name" element
     */
    void xsetRealmName(org.apache.xmlbeans.XmlString realmName);
    
    /**
     * Unsets the "realm-name" element
     */
    void unsetRealmName();
    
    /**
     * Gets the "transport-guarantee" element
     */
    org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbTransportGuaranteeType.Enum getTransportGuarantee();
    
    /**
     * Gets (as xml) the "transport-guarantee" element
     */
    org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbTransportGuaranteeType xgetTransportGuarantee();
    
    /**
     * Sets the "transport-guarantee" element
     */
    void setTransportGuarantee(org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbTransportGuaranteeType.Enum transportGuarantee);
    
    /**
     * Sets (as xml) the "transport-guarantee" element
     */
    void xsetTransportGuarantee(org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbTransportGuaranteeType transportGuarantee);
    
    /**
     * Gets the "auth-method" element
     */
    org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbAuthMethodType.Enum getAuthMethod();
    
    /**
     * Gets (as xml) the "auth-method" element
     */
    org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbAuthMethodType xgetAuthMethod();
    
    /**
     * Sets the "auth-method" element
     */
    void setAuthMethod(org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbAuthMethodType.Enum authMethod);
    
    /**
     * Sets (as xml) the "auth-method" element
     */
    void xsetAuthMethod(org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbAuthMethodType authMethod);
    
    /**
     * Gets array of all "http-method" elements
     */
    java.lang.String[] getHttpMethodArray();
    
    /**
     * Gets ith "http-method" element
     */
    java.lang.String getHttpMethodArray(int i);
    
    /**
     * Gets (as xml) array of all "http-method" elements
     */
    org.apache.xmlbeans.XmlString[] xgetHttpMethodArray();
    
    /**
     * Gets (as xml) ith "http-method" element
     */
    org.apache.xmlbeans.XmlString xgetHttpMethodArray(int i);
    
    /**
     * Returns number of "http-method" element
     */
    int sizeOfHttpMethodArray();
    
    /**
     * Sets array of all "http-method" element
     */
    void setHttpMethodArray(java.lang.String[] httpMethodArray);
    
    /**
     * Sets ith "http-method" element
     */
    void setHttpMethodArray(int i, java.lang.String httpMethod);
    
    /**
     * Sets (as xml) array of all "http-method" element
     */
    void xsetHttpMethodArray(org.apache.xmlbeans.XmlString[] httpMethodArray);
    
    /**
     * Sets (as xml) ith "http-method" element
     */
    void xsetHttpMethodArray(int i, org.apache.xmlbeans.XmlString httpMethod);
    
    /**
     * Inserts the value as the ith "http-method" element
     */
    void insertHttpMethod(int i, java.lang.String httpMethod);
    
    /**
     * Appends the value as the last "http-method" element
     */
    void addHttpMethod(java.lang.String httpMethod);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "http-method" element
     */
    org.apache.xmlbeans.XmlString insertNewHttpMethod(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "http-method" element
     */
    org.apache.xmlbeans.XmlString addNewHttpMethod();
    
    /**
     * Removes the ith "http-method" element
     */
    void removeHttpMethod(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbWebServiceSecurityType newInstance() {
          return (org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbWebServiceSecurityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbWebServiceSecurityType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbWebServiceSecurityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbWebServiceSecurityType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbWebServiceSecurityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbWebServiceSecurityType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbWebServiceSecurityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbWebServiceSecurityType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbWebServiceSecurityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbWebServiceSecurityType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbWebServiceSecurityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbWebServiceSecurityType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbWebServiceSecurityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbWebServiceSecurityType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbWebServiceSecurityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbWebServiceSecurityType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbWebServiceSecurityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbWebServiceSecurityType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbWebServiceSecurityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbWebServiceSecurityType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbWebServiceSecurityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbWebServiceSecurityType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbWebServiceSecurityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbWebServiceSecurityType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbWebServiceSecurityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbWebServiceSecurityType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbWebServiceSecurityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbWebServiceSecurityType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbWebServiceSecurityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbWebServiceSecurityType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbWebServiceSecurityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbWebServiceSecurityType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbWebServiceSecurityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbWebServiceSecurityType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbWebServiceSecurityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
