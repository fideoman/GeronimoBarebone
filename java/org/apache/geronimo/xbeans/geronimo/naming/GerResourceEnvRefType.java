/*
 * XML Type:  resource-env-refType
 * Namespace: http://geronimo.apache.org/xml/ns/naming-1.2
 * Java type: org.apache.geronimo.xbeans.geronimo.naming.GerResourceEnvRefType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.geronimo.naming;


/**
 * An XML resource-env-refType(@http://geronimo.apache.org/xml/ns/naming-1.2).
 *
 * This is a complex type.
 */
public interface GerResourceEnvRefType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GerResourceEnvRefType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1DE3CC699F4F003C18CA209853695E0").resolveHandle("resourceenvreftyped284type");
    
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
     * Gets the "message-destination-link" element
     */
    java.lang.String getMessageDestinationLink();
    
    /**
     * Gets (as xml) the "message-destination-link" element
     */
    org.apache.xmlbeans.XmlString xgetMessageDestinationLink();
    
    /**
     * True if has "message-destination-link" element
     */
    boolean isSetMessageDestinationLink();
    
    /**
     * Sets the "message-destination-link" element
     */
    void setMessageDestinationLink(java.lang.String messageDestinationLink);
    
    /**
     * Sets (as xml) the "message-destination-link" element
     */
    void xsetMessageDestinationLink(org.apache.xmlbeans.XmlString messageDestinationLink);
    
    /**
     * Unsets the "message-destination-link" element
     */
    void unsetMessageDestinationLink();
    
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
     * Gets the "reference-class" element
     */
    java.lang.String getReferenceClass();
    
    /**
     * Gets (as xml) the "reference-class" element
     */
    org.apache.xmlbeans.XmlString xgetReferenceClass();
    
    /**
     * True if has "reference-class" element
     */
    boolean isSetReferenceClass();
    
    /**
     * Sets the "reference-class" element
     */
    void setReferenceClass(java.lang.String referenceClass);
    
    /**
     * Sets (as xml) the "reference-class" element
     */
    void xsetReferenceClass(org.apache.xmlbeans.XmlString referenceClass);
    
    /**
     * Unsets the "reference-class" element
     */
    void unsetReferenceClass();
    
    /**
     * Gets the "string-addr-type" element
     */
    java.lang.String getStringAddrType();
    
    /**
     * Gets (as xml) the "string-addr-type" element
     */
    org.apache.xmlbeans.XmlString xgetStringAddrType();
    
    /**
     * True if has "string-addr-type" element
     */
    boolean isSetStringAddrType();
    
    /**
     * Sets the "string-addr-type" element
     */
    void setStringAddrType(java.lang.String stringAddrType);
    
    /**
     * Sets (as xml) the "string-addr-type" element
     */
    void xsetStringAddrType(org.apache.xmlbeans.XmlString stringAddrType);
    
    /**
     * Unsets the "string-addr-type" element
     */
    void unsetStringAddrType();
    
    /**
     * Gets the "string-addr" element
     */
    java.lang.String getStringAddr();
    
    /**
     * Gets (as xml) the "string-addr" element
     */
    org.apache.xmlbeans.XmlString xgetStringAddr();
    
    /**
     * True if has "string-addr" element
     */
    boolean isSetStringAddr();
    
    /**
     * Sets the "string-addr" element
     */
    void setStringAddr(java.lang.String stringAddr);
    
    /**
     * Sets (as xml) the "string-addr" element
     */
    void xsetStringAddr(org.apache.xmlbeans.XmlString stringAddr);
    
    /**
     * Unsets the "string-addr" element
     */
    void unsetStringAddr();
    
    /**
     * Gets the "object-factory" element
     */
    java.lang.String getObjectFactory();
    
    /**
     * Gets (as xml) the "object-factory" element
     */
    org.apache.xmlbeans.XmlString xgetObjectFactory();
    
    /**
     * True if has "object-factory" element
     */
    boolean isSetObjectFactory();
    
    /**
     * Sets the "object-factory" element
     */
    void setObjectFactory(java.lang.String objectFactory);
    
    /**
     * Sets (as xml) the "object-factory" element
     */
    void xsetObjectFactory(org.apache.xmlbeans.XmlString objectFactory);
    
    /**
     * Unsets the "object-factory" element
     */
    void unsetObjectFactory();
    
    /**
     * Gets the "object-factory-location" element
     */
    java.lang.String getObjectFactoryLocation();
    
    /**
     * Gets (as xml) the "object-factory-location" element
     */
    org.apache.xmlbeans.XmlString xgetObjectFactoryLocation();
    
    /**
     * True if has "object-factory-location" element
     */
    boolean isSetObjectFactoryLocation();
    
    /**
     * Sets the "object-factory-location" element
     */
    void setObjectFactoryLocation(java.lang.String objectFactoryLocation);
    
    /**
     * Sets (as xml) the "object-factory-location" element
     */
    void xsetObjectFactoryLocation(org.apache.xmlbeans.XmlString objectFactoryLocation);
    
    /**
     * Unsets the "object-factory-location" element
     */
    void unsetObjectFactoryLocation();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.apache.geronimo.xbeans.geronimo.naming.GerResourceEnvRefType newInstance() {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerResourceEnvRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.naming.GerResourceEnvRefType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerResourceEnvRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.apache.geronimo.xbeans.geronimo.naming.GerResourceEnvRefType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerResourceEnvRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.naming.GerResourceEnvRefType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerResourceEnvRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.apache.geronimo.xbeans.geronimo.naming.GerResourceEnvRefType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerResourceEnvRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.naming.GerResourceEnvRefType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerResourceEnvRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.apache.geronimo.xbeans.geronimo.naming.GerResourceEnvRefType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerResourceEnvRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.naming.GerResourceEnvRefType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerResourceEnvRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.apache.geronimo.xbeans.geronimo.naming.GerResourceEnvRefType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerResourceEnvRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.naming.GerResourceEnvRefType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerResourceEnvRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.apache.geronimo.xbeans.geronimo.naming.GerResourceEnvRefType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerResourceEnvRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.naming.GerResourceEnvRefType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerResourceEnvRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.apache.geronimo.xbeans.geronimo.naming.GerResourceEnvRefType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerResourceEnvRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.naming.GerResourceEnvRefType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerResourceEnvRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.apache.geronimo.xbeans.geronimo.naming.GerResourceEnvRefType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerResourceEnvRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.naming.GerResourceEnvRefType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerResourceEnvRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.geronimo.xbeans.geronimo.naming.GerResourceEnvRefType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerResourceEnvRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.geronimo.xbeans.geronimo.naming.GerResourceEnvRefType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerResourceEnvRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
