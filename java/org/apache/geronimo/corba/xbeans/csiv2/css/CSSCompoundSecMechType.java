/*
 * XML Type:  compoundSecMechType
 * Namespace: http://openejb.apache.org/xml/ns/corba-css-config-2.1
 * Java type: org.apache.geronimo.corba.xbeans.csiv2.css.CSSCompoundSecMechType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.corba.xbeans.csiv2.css;


/**
 * An XML compoundSecMechType(@http://openejb.apache.org/xml/ns/corba-css-config-2.1).
 *
 * This is a complex type.
 */
public interface CSSCompoundSecMechType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CSSCompoundSecMechType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s09ACC41411FB14C20ABEF817C47DD1DF").resolveHandle("compoundsecmechtyped824type");
    
    /**
     * Gets array of all "description" elements
     */
    org.apache.geronimo.corba.xbeans.csiv2.css.CSSDescriptionType[] getDescriptionArray();
    
    /**
     * Gets ith "description" element
     */
    org.apache.geronimo.corba.xbeans.csiv2.css.CSSDescriptionType getDescriptionArray(int i);
    
    /**
     * Returns number of "description" element
     */
    int sizeOfDescriptionArray();
    
    /**
     * Sets array of all "description" element
     */
    void setDescriptionArray(org.apache.geronimo.corba.xbeans.csiv2.css.CSSDescriptionType[] descriptionArray);
    
    /**
     * Sets ith "description" element
     */
    void setDescriptionArray(int i, org.apache.geronimo.corba.xbeans.csiv2.css.CSSDescriptionType description);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "description" element
     */
    org.apache.geronimo.corba.xbeans.csiv2.css.CSSDescriptionType insertNewDescription(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "description" element
     */
    org.apache.geronimo.corba.xbeans.csiv2.css.CSSDescriptionType addNewDescription();
    
    /**
     * Removes the ith "description" element
     */
    void removeDescription(int i);
    
    /**
     * Gets the "SSL" element
     */
    org.apache.geronimo.corba.xbeans.csiv2.css.CSSSSLType getSSL();
    
    /**
     * True if has "SSL" element
     */
    boolean isSetSSL();
    
    /**
     * Sets the "SSL" element
     */
    void setSSL(org.apache.geronimo.corba.xbeans.csiv2.css.CSSSSLType ssl);
    
    /**
     * Appends and returns a new empty "SSL" element
     */
    org.apache.geronimo.corba.xbeans.csiv2.css.CSSSSLType addNewSSL();
    
    /**
     * Unsets the "SSL" element
     */
    void unsetSSL();
    
    /**
     * Gets the "SECIOP" element
     */
    org.apache.geronimo.corba.xbeans.csiv2.css.CSSSECIOPType getSECIOP();
    
    /**
     * True if has "SECIOP" element
     */
    boolean isSetSECIOP();
    
    /**
     * Sets the "SECIOP" element
     */
    void setSECIOP(org.apache.geronimo.corba.xbeans.csiv2.css.CSSSECIOPType seciop);
    
    /**
     * Appends and returns a new empty "SECIOP" element
     */
    org.apache.geronimo.corba.xbeans.csiv2.css.CSSSECIOPType addNewSECIOP();
    
    /**
     * Unsets the "SECIOP" element
     */
    void unsetSECIOP();
    
    /**
     * Gets the "GSSUPStatic" element
     */
    org.apache.geronimo.corba.xbeans.csiv2.css.CSSGSSUPStaticType getGSSUPStatic();
    
    /**
     * True if has "GSSUPStatic" element
     */
    boolean isSetGSSUPStatic();
    
    /**
     * Sets the "GSSUPStatic" element
     */
    void setGSSUPStatic(org.apache.geronimo.corba.xbeans.csiv2.css.CSSGSSUPStaticType gssupStatic);
    
    /**
     * Appends and returns a new empty "GSSUPStatic" element
     */
    org.apache.geronimo.corba.xbeans.csiv2.css.CSSGSSUPStaticType addNewGSSUPStatic();
    
    /**
     * Unsets the "GSSUPStatic" element
     */
    void unsetGSSUPStatic();
    
    /**
     * Gets the "GSSUPDynamic" element
     */
    org.apache.geronimo.corba.xbeans.csiv2.css.CSSGSSUPDynamicType getGSSUPDynamic();
    
    /**
     * True if has "GSSUPDynamic" element
     */
    boolean isSetGSSUPDynamic();
    
    /**
     * Sets the "GSSUPDynamic" element
     */
    void setGSSUPDynamic(org.apache.geronimo.corba.xbeans.csiv2.css.CSSGSSUPDynamicType gssupDynamic);
    
    /**
     * Appends and returns a new empty "GSSUPDynamic" element
     */
    org.apache.geronimo.corba.xbeans.csiv2.css.CSSGSSUPDynamicType addNewGSSUPDynamic();
    
    /**
     * Unsets the "GSSUPDynamic" element
     */
    void unsetGSSUPDynamic();
    
    /**
     * Gets the "sasMech" element
     */
    org.apache.geronimo.corba.xbeans.csiv2.css.CSSSasMechType getSasMech();
    
    /**
     * True if has "sasMech" element
     */
    boolean isSetSasMech();
    
    /**
     * Sets the "sasMech" element
     */
    void setSasMech(org.apache.geronimo.corba.xbeans.csiv2.css.CSSSasMechType sasMech);
    
    /**
     * Appends and returns a new empty "sasMech" element
     */
    org.apache.geronimo.corba.xbeans.csiv2.css.CSSSasMechType addNewSasMech();
    
    /**
     * Unsets the "sasMech" element
     */
    void unsetSasMech();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.apache.geronimo.corba.xbeans.csiv2.css.CSSCompoundSecMechType newInstance() {
          return (org.apache.geronimo.corba.xbeans.csiv2.css.CSSCompoundSecMechType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.css.CSSCompoundSecMechType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.apache.geronimo.corba.xbeans.csiv2.css.CSSCompoundSecMechType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.apache.geronimo.corba.xbeans.csiv2.css.CSSCompoundSecMechType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.corba.xbeans.csiv2.css.CSSCompoundSecMechType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.css.CSSCompoundSecMechType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.corba.xbeans.csiv2.css.CSSCompoundSecMechType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.apache.geronimo.corba.xbeans.csiv2.css.CSSCompoundSecMechType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.corba.xbeans.csiv2.css.CSSCompoundSecMechType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.css.CSSCompoundSecMechType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.corba.xbeans.csiv2.css.CSSCompoundSecMechType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.css.CSSCompoundSecMechType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.corba.xbeans.csiv2.css.CSSCompoundSecMechType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.css.CSSCompoundSecMechType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.corba.xbeans.csiv2.css.CSSCompoundSecMechType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.css.CSSCompoundSecMechType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.corba.xbeans.csiv2.css.CSSCompoundSecMechType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.css.CSSCompoundSecMechType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.corba.xbeans.csiv2.css.CSSCompoundSecMechType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.css.CSSCompoundSecMechType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.corba.xbeans.csiv2.css.CSSCompoundSecMechType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.css.CSSCompoundSecMechType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.corba.xbeans.csiv2.css.CSSCompoundSecMechType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.css.CSSCompoundSecMechType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.corba.xbeans.csiv2.css.CSSCompoundSecMechType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.css.CSSCompoundSecMechType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.corba.xbeans.csiv2.css.CSSCompoundSecMechType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.css.CSSCompoundSecMechType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.corba.xbeans.csiv2.css.CSSCompoundSecMechType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.css.CSSCompoundSecMechType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.corba.xbeans.csiv2.css.CSSCompoundSecMechType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.geronimo.corba.xbeans.csiv2.css.CSSCompoundSecMechType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.geronimo.corba.xbeans.csiv2.css.CSSCompoundSecMechType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.geronimo.corba.xbeans.csiv2.css.CSSCompoundSecMechType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.geronimo.corba.xbeans.csiv2.css.CSSCompoundSecMechType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
