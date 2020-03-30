/*
 * XML Type:  identityTokenTypeList
 * Namespace: http://openejb.apache.org/xml/ns/corba-tss-config-2.1
 * Java type: org.apache.geronimo.corba.xbeans.csiv2.tss.TSSIdentityTokenTypeList
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.corba.xbeans.csiv2.tss;


/**
 * An XML identityTokenTypeList(@http://openejb.apache.org/xml/ns/corba-tss-config-2.1).
 *
 * This is a complex type.
 */
public interface TSSIdentityTokenTypeList extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TSSIdentityTokenTypeList.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s09ACC41411FB14C20ABEF817C47DD1DF").resolveHandle("identitytokentypelist87c9type");
    
    /**
     * Gets the "ITTAbsent" element
     */
    org.apache.geronimo.corba.xbeans.csiv2.tss.TSSITTAbsentType getITTAbsent();
    
    /**
     * True if has "ITTAbsent" element
     */
    boolean isSetITTAbsent();
    
    /**
     * Sets the "ITTAbsent" element
     */
    void setITTAbsent(org.apache.geronimo.corba.xbeans.csiv2.tss.TSSITTAbsentType ittAbsent);
    
    /**
     * Appends and returns a new empty "ITTAbsent" element
     */
    org.apache.geronimo.corba.xbeans.csiv2.tss.TSSITTAbsentType addNewITTAbsent();
    
    /**
     * Unsets the "ITTAbsent" element
     */
    void unsetITTAbsent();
    
    /**
     * Gets the "ITTAnonymous" element
     */
    org.apache.geronimo.corba.xbeans.csiv2.tss.TSSITTAnonymousType getITTAnonymous();
    
    /**
     * True if has "ITTAnonymous" element
     */
    boolean isSetITTAnonymous();
    
    /**
     * Sets the "ITTAnonymous" element
     */
    void setITTAnonymous(org.apache.geronimo.corba.xbeans.csiv2.tss.TSSITTAnonymousType ittAnonymous);
    
    /**
     * Appends and returns a new empty "ITTAnonymous" element
     */
    org.apache.geronimo.corba.xbeans.csiv2.tss.TSSITTAnonymousType addNewITTAnonymous();
    
    /**
     * Unsets the "ITTAnonymous" element
     */
    void unsetITTAnonymous();
    
    /**
     * Gets the "ITTPrincipalNameGSSUP" element
     */
    org.apache.geronimo.corba.xbeans.csiv2.tss.TSSITTPrincipalNameGSSUPType getITTPrincipalNameGSSUP();
    
    /**
     * True if has "ITTPrincipalNameGSSUP" element
     */
    boolean isSetITTPrincipalNameGSSUP();
    
    /**
     * Sets the "ITTPrincipalNameGSSUP" element
     */
    void setITTPrincipalNameGSSUP(org.apache.geronimo.corba.xbeans.csiv2.tss.TSSITTPrincipalNameGSSUPType ittPrincipalNameGSSUP);
    
    /**
     * Appends and returns a new empty "ITTPrincipalNameGSSUP" element
     */
    org.apache.geronimo.corba.xbeans.csiv2.tss.TSSITTPrincipalNameGSSUPType addNewITTPrincipalNameGSSUP();
    
    /**
     * Unsets the "ITTPrincipalNameGSSUP" element
     */
    void unsetITTPrincipalNameGSSUP();
    
    /**
     * Gets the "ITTDistinguishedName" element
     */
    org.apache.geronimo.corba.xbeans.csiv2.tss.TSSITTDistinguishedNameType getITTDistinguishedName();
    
    /**
     * True if has "ITTDistinguishedName" element
     */
    boolean isSetITTDistinguishedName();
    
    /**
     * Sets the "ITTDistinguishedName" element
     */
    void setITTDistinguishedName(org.apache.geronimo.corba.xbeans.csiv2.tss.TSSITTDistinguishedNameType ittDistinguishedName);
    
    /**
     * Appends and returns a new empty "ITTDistinguishedName" element
     */
    org.apache.geronimo.corba.xbeans.csiv2.tss.TSSITTDistinguishedNameType addNewITTDistinguishedName();
    
    /**
     * Unsets the "ITTDistinguishedName" element
     */
    void unsetITTDistinguishedName();
    
    /**
     * Gets the "ITTX509CertChain" element
     */
    org.apache.geronimo.corba.xbeans.csiv2.tss.TSSITTX509CertChainType getITTX509CertChain();
    
    /**
     * True if has "ITTX509CertChain" element
     */
    boolean isSetITTX509CertChain();
    
    /**
     * Sets the "ITTX509CertChain" element
     */
    void setITTX509CertChain(org.apache.geronimo.corba.xbeans.csiv2.tss.TSSITTX509CertChainType ittx509CertChain);
    
    /**
     * Appends and returns a new empty "ITTX509CertChain" element
     */
    org.apache.geronimo.corba.xbeans.csiv2.tss.TSSITTX509CertChainType addNewITTX509CertChain();
    
    /**
     * Unsets the "ITTX509CertChain" element
     */
    void unsetITTX509CertChain();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSIdentityTokenTypeList newInstance() {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSIdentityTokenTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSIdentityTokenTypeList newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSIdentityTokenTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSIdentityTokenTypeList parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSIdentityTokenTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSIdentityTokenTypeList parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSIdentityTokenTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSIdentityTokenTypeList parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSIdentityTokenTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSIdentityTokenTypeList parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSIdentityTokenTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSIdentityTokenTypeList parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSIdentityTokenTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSIdentityTokenTypeList parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSIdentityTokenTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSIdentityTokenTypeList parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSIdentityTokenTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSIdentityTokenTypeList parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSIdentityTokenTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSIdentityTokenTypeList parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSIdentityTokenTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSIdentityTokenTypeList parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSIdentityTokenTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSIdentityTokenTypeList parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSIdentityTokenTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSIdentityTokenTypeList parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSIdentityTokenTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSIdentityTokenTypeList parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSIdentityTokenTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSIdentityTokenTypeList parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSIdentityTokenTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSIdentityTokenTypeList parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSIdentityTokenTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSIdentityTokenTypeList parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSIdentityTokenTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
