/*
 * XML Type:  web-service-bindingType
 * Namespace: http://geronimo.apache.org/xml/ns/j2ee/ejb/openejb-2.0
 * Java type: org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbWebServiceBindingType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.openejb.xbeans.ejbjar;


/**
 * An XML web-service-bindingType(@http://geronimo.apache.org/xml/ns/j2ee/ejb/openejb-2.0).
 *
 * This is a complex type.
 */
public interface OpenejbWebServiceBindingType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OpenejbWebServiceBindingType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sCB8E5D801CA82AB8B1999B71F1BE50C7").resolveHandle("webservicebindingtype98a7type");
    
    /**
     * Gets the "ejb-name" element
     */
    java.lang.String getEjbName();
    
    /**
     * Gets (as xml) the "ejb-name" element
     */
    org.apache.xmlbeans.XmlString xgetEjbName();
    
    /**
     * Sets the "ejb-name" element
     */
    void setEjbName(java.lang.String ejbName);
    
    /**
     * Sets (as xml) the "ejb-name" element
     */
    void xsetEjbName(org.apache.xmlbeans.XmlString ejbName);
    
    /**
     * Gets the "web-service-address" element
     */
    java.lang.String getWebServiceAddress();
    
    /**
     * Gets (as xml) the "web-service-address" element
     */
    org.apache.xmlbeans.XmlString xgetWebServiceAddress();
    
    /**
     * True if has "web-service-address" element
     */
    boolean isSetWebServiceAddress();
    
    /**
     * Sets the "web-service-address" element
     */
    void setWebServiceAddress(java.lang.String webServiceAddress);
    
    /**
     * Sets (as xml) the "web-service-address" element
     */
    void xsetWebServiceAddress(org.apache.xmlbeans.XmlString webServiceAddress);
    
    /**
     * Unsets the "web-service-address" element
     */
    void unsetWebServiceAddress();
    
    /**
     * Gets array of all "web-service-virtual-host" elements
     */
    java.lang.String[] getWebServiceVirtualHostArray();
    
    /**
     * Gets ith "web-service-virtual-host" element
     */
    java.lang.String getWebServiceVirtualHostArray(int i);
    
    /**
     * Gets (as xml) array of all "web-service-virtual-host" elements
     */
    org.apache.xmlbeans.XmlString[] xgetWebServiceVirtualHostArray();
    
    /**
     * Gets (as xml) ith "web-service-virtual-host" element
     */
    org.apache.xmlbeans.XmlString xgetWebServiceVirtualHostArray(int i);
    
    /**
     * Returns number of "web-service-virtual-host" element
     */
    int sizeOfWebServiceVirtualHostArray();
    
    /**
     * Sets array of all "web-service-virtual-host" element
     */
    void setWebServiceVirtualHostArray(java.lang.String[] webServiceVirtualHostArray);
    
    /**
     * Sets ith "web-service-virtual-host" element
     */
    void setWebServiceVirtualHostArray(int i, java.lang.String webServiceVirtualHost);
    
    /**
     * Sets (as xml) array of all "web-service-virtual-host" element
     */
    void xsetWebServiceVirtualHostArray(org.apache.xmlbeans.XmlString[] webServiceVirtualHostArray);
    
    /**
     * Sets (as xml) ith "web-service-virtual-host" element
     */
    void xsetWebServiceVirtualHostArray(int i, org.apache.xmlbeans.XmlString webServiceVirtualHost);
    
    /**
     * Inserts the value as the ith "web-service-virtual-host" element
     */
    void insertWebServiceVirtualHost(int i, java.lang.String webServiceVirtualHost);
    
    /**
     * Appends the value as the last "web-service-virtual-host" element
     */
    void addWebServiceVirtualHost(java.lang.String webServiceVirtualHost);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "web-service-virtual-host" element
     */
    org.apache.xmlbeans.XmlString insertNewWebServiceVirtualHost(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "web-service-virtual-host" element
     */
    org.apache.xmlbeans.XmlString addNewWebServiceVirtualHost();
    
    /**
     * Removes the ith "web-service-virtual-host" element
     */
    void removeWebServiceVirtualHost(int i);
    
    /**
     * Gets the "web-service-security" element
     */
    org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbWebServiceSecurityType getWebServiceSecurity();
    
    /**
     * True if has "web-service-security" element
     */
    boolean isSetWebServiceSecurity();
    
    /**
     * Sets the "web-service-security" element
     */
    void setWebServiceSecurity(org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbWebServiceSecurityType webServiceSecurity);
    
    /**
     * Appends and returns a new empty "web-service-security" element
     */
    org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbWebServiceSecurityType addNewWebServiceSecurity();
    
    /**
     * Unsets the "web-service-security" element
     */
    void unsetWebServiceSecurity();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbWebServiceBindingType newInstance() {
          return (org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbWebServiceBindingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbWebServiceBindingType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbWebServiceBindingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbWebServiceBindingType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbWebServiceBindingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbWebServiceBindingType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbWebServiceBindingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbWebServiceBindingType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbWebServiceBindingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbWebServiceBindingType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbWebServiceBindingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbWebServiceBindingType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbWebServiceBindingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbWebServiceBindingType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbWebServiceBindingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbWebServiceBindingType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbWebServiceBindingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbWebServiceBindingType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbWebServiceBindingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbWebServiceBindingType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbWebServiceBindingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbWebServiceBindingType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbWebServiceBindingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbWebServiceBindingType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbWebServiceBindingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbWebServiceBindingType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbWebServiceBindingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbWebServiceBindingType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbWebServiceBindingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbWebServiceBindingType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbWebServiceBindingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbWebServiceBindingType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbWebServiceBindingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbWebServiceBindingType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbWebServiceBindingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
