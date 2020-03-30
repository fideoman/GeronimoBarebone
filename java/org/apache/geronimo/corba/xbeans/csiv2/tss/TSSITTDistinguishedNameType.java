/*
 * XML Type:  ITTDistinguishedNameType
 * Namespace: http://openejb.apache.org/xml/ns/corba-tss-config-2.1
 * Java type: org.apache.geronimo.corba.xbeans.csiv2.tss.TSSITTDistinguishedNameType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.corba.xbeans.csiv2.tss;


/**
 * An XML ITTDistinguishedNameType(@http://openejb.apache.org/xml/ns/corba-tss-config-2.1).
 *
 * This is a complex type.
 */
public interface TSSITTDistinguishedNameType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TSSITTDistinguishedNameType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s09ACC41411FB14C20ABEF817C47DD1DF").resolveHandle("ittdistinguishednametypeb608type");
    
    /**
     * Gets the "realm" attribute
     */
    java.lang.String getRealm();
    
    /**
     * Gets (as xml) the "realm" attribute
     */
    org.apache.xmlbeans.XmlString xgetRealm();
    
    /**
     * True if has "realm" attribute
     */
    boolean isSetRealm();
    
    /**
     * Sets the "realm" attribute
     */
    void setRealm(java.lang.String realm);
    
    /**
     * Sets (as xml) the "realm" attribute
     */
    void xsetRealm(org.apache.xmlbeans.XmlString realm);
    
    /**
     * Unsets the "realm" attribute
     */
    void unsetRealm();
    
    /**
     * Gets the "domain" attribute
     */
    java.lang.String getDomain();
    
    /**
     * Gets (as xml) the "domain" attribute
     */
    org.apache.xmlbeans.XmlString xgetDomain();
    
    /**
     * True if has "domain" attribute
     */
    boolean isSetDomain();
    
    /**
     * Sets the "domain" attribute
     */
    void setDomain(java.lang.String domain);
    
    /**
     * Sets (as xml) the "domain" attribute
     */
    void xsetDomain(org.apache.xmlbeans.XmlString domain);
    
    /**
     * Unsets the "domain" attribute
     */
    void unsetDomain();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSITTDistinguishedNameType newInstance() {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSITTDistinguishedNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSITTDistinguishedNameType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSITTDistinguishedNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSITTDistinguishedNameType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSITTDistinguishedNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSITTDistinguishedNameType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSITTDistinguishedNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSITTDistinguishedNameType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSITTDistinguishedNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSITTDistinguishedNameType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSITTDistinguishedNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSITTDistinguishedNameType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSITTDistinguishedNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSITTDistinguishedNameType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSITTDistinguishedNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSITTDistinguishedNameType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSITTDistinguishedNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSITTDistinguishedNameType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSITTDistinguishedNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSITTDistinguishedNameType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSITTDistinguishedNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSITTDistinguishedNameType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSITTDistinguishedNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSITTDistinguishedNameType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSITTDistinguishedNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSITTDistinguishedNameType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSITTDistinguishedNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSITTDistinguishedNameType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSITTDistinguishedNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSITTDistinguishedNameType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSITTDistinguishedNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSITTDistinguishedNameType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSITTDistinguishedNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSITTDistinguishedNameType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSITTDistinguishedNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
