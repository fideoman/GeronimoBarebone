/*
 * XML Type:  portType
 * Namespace: http://geronimo.apache.org/xml/ns/naming-1.2
 * Java type: org.apache.geronimo.xbeans.geronimo.naming.GerPortType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.geronimo.naming;


/**
 * An XML portType(@http://geronimo.apache.org/xml/ns/naming-1.2).
 *
 * This is a complex type.
 */
public interface GerPortType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GerPortType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1DE3CC699F4F003C18CA209853695E0").resolveHandle("porttypee517type");
    
    /**
     * Gets the "port-name" element
     */
    java.lang.String getPortName();
    
    /**
     * Gets (as xml) the "port-name" element
     */
    org.apache.xmlbeans.XmlString xgetPortName();
    
    /**
     * Sets the "port-name" element
     */
    void setPortName(java.lang.String portName);
    
    /**
     * Sets (as xml) the "port-name" element
     */
    void xsetPortName(org.apache.xmlbeans.XmlString portName);
    
    /**
     * Gets the "protocol" element
     */
    java.lang.String getProtocol();
    
    /**
     * Gets (as xml) the "protocol" element
     */
    org.apache.xmlbeans.XmlString xgetProtocol();
    
    /**
     * True if has "protocol" element
     */
    boolean isSetProtocol();
    
    /**
     * Sets the "protocol" element
     */
    void setProtocol(java.lang.String protocol);
    
    /**
     * Sets (as xml) the "protocol" element
     */
    void xsetProtocol(org.apache.xmlbeans.XmlString protocol);
    
    /**
     * Unsets the "protocol" element
     */
    void unsetProtocol();
    
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
     * Gets the "port" element
     */
    int getPort();
    
    /**
     * Gets (as xml) the "port" element
     */
    org.apache.xmlbeans.XmlInt xgetPort();
    
    /**
     * True if has "port" element
     */
    boolean isSetPort();
    
    /**
     * Sets the "port" element
     */
    void setPort(int port);
    
    /**
     * Sets (as xml) the "port" element
     */
    void xsetPort(org.apache.xmlbeans.XmlInt port);
    
    /**
     * Unsets the "port" element
     */
    void unsetPort();
    
    /**
     * Gets the "uri" element
     */
    java.lang.String getUri();
    
    /**
     * Gets (as xml) the "uri" element
     */
    org.apache.xmlbeans.XmlString xgetUri();
    
    /**
     * Sets the "uri" element
     */
    void setUri(java.lang.String uri);
    
    /**
     * Sets (as xml) the "uri" element
     */
    void xsetUri(org.apache.xmlbeans.XmlString uri);
    
    /**
     * Gets the "credentials-name" element
     */
    java.lang.String getCredentialsName();
    
    /**
     * Gets (as xml) the "credentials-name" element
     */
    org.apache.xmlbeans.XmlString xgetCredentialsName();
    
    /**
     * True if has "credentials-name" element
     */
    boolean isSetCredentialsName();
    
    /**
     * Sets the "credentials-name" element
     */
    void setCredentialsName(java.lang.String credentialsName);
    
    /**
     * Sets (as xml) the "credentials-name" element
     */
    void xsetCredentialsName(org.apache.xmlbeans.XmlString credentialsName);
    
    /**
     * Unsets the "credentials-name" element
     */
    void unsetCredentialsName();
    
    /**
     * Gets array of all "property" elements
     */
    org.apache.geronimo.xbeans.geronimo.naming.GerPortPropertyType[] getPropertyArray();
    
    /**
     * Gets ith "property" element
     */
    org.apache.geronimo.xbeans.geronimo.naming.GerPortPropertyType getPropertyArray(int i);
    
    /**
     * Returns number of "property" element
     */
    int sizeOfPropertyArray();
    
    /**
     * Sets array of all "property" element
     */
    void setPropertyArray(org.apache.geronimo.xbeans.geronimo.naming.GerPortPropertyType[] propertyArray);
    
    /**
     * Sets ith "property" element
     */
    void setPropertyArray(int i, org.apache.geronimo.xbeans.geronimo.naming.GerPortPropertyType property);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "property" element
     */
    org.apache.geronimo.xbeans.geronimo.naming.GerPortPropertyType insertNewProperty(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "property" element
     */
    org.apache.geronimo.xbeans.geronimo.naming.GerPortPropertyType addNewProperty();
    
    /**
     * Removes the ith "property" element
     */
    void removeProperty(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.apache.geronimo.xbeans.geronimo.naming.GerPortType newInstance() {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerPortType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.naming.GerPortType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerPortType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.apache.geronimo.xbeans.geronimo.naming.GerPortType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerPortType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.naming.GerPortType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerPortType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.apache.geronimo.xbeans.geronimo.naming.GerPortType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerPortType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.naming.GerPortType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerPortType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.apache.geronimo.xbeans.geronimo.naming.GerPortType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerPortType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.naming.GerPortType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerPortType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.apache.geronimo.xbeans.geronimo.naming.GerPortType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerPortType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.naming.GerPortType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerPortType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.apache.geronimo.xbeans.geronimo.naming.GerPortType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerPortType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.naming.GerPortType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerPortType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.apache.geronimo.xbeans.geronimo.naming.GerPortType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerPortType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.naming.GerPortType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerPortType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.apache.geronimo.xbeans.geronimo.naming.GerPortType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerPortType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.naming.GerPortType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerPortType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.geronimo.xbeans.geronimo.naming.GerPortType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerPortType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.geronimo.xbeans.geronimo.naming.GerPortType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerPortType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
