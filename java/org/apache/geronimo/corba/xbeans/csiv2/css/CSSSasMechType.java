/*
 * XML Type:  sasMechType
 * Namespace: http://openejb.apache.org/xml/ns/corba-css-config-2.1
 * Java type: org.apache.geronimo.corba.xbeans.csiv2.css.CSSSasMechType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.corba.xbeans.csiv2.css;


/**
 * An XML sasMechType(@http://openejb.apache.org/xml/ns/corba-css-config-2.1).
 *
 * This is a complex type.
 */
public interface CSSSasMechType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CSSSasMechType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s09ACC41411FB14C20ABEF817C47DD1DF").resolveHandle("sasmechtype7023type");
    
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
     * Gets the "ITTAbsent" element
     */
    org.apache.geronimo.corba.xbeans.csiv2.css.CSSITTAbsentType getITTAbsent();
    
    /**
     * True if has "ITTAbsent" element
     */
    boolean isSetITTAbsent();
    
    /**
     * Sets the "ITTAbsent" element
     */
    void setITTAbsent(org.apache.geronimo.corba.xbeans.csiv2.css.CSSITTAbsentType ittAbsent);
    
    /**
     * Appends and returns a new empty "ITTAbsent" element
     */
    org.apache.geronimo.corba.xbeans.csiv2.css.CSSITTAbsentType addNewITTAbsent();
    
    /**
     * Unsets the "ITTAbsent" element
     */
    void unsetITTAbsent();
    
    /**
     * Gets the "ITTAnonymous" element
     */
    org.apache.geronimo.corba.xbeans.csiv2.css.CSSITTAnonymousType getITTAnonymous();
    
    /**
     * True if has "ITTAnonymous" element
     */
    boolean isSetITTAnonymous();
    
    /**
     * Sets the "ITTAnonymous" element
     */
    void setITTAnonymous(org.apache.geronimo.corba.xbeans.csiv2.css.CSSITTAnonymousType ittAnonymous);
    
    /**
     * Appends and returns a new empty "ITTAnonymous" element
     */
    org.apache.geronimo.corba.xbeans.csiv2.css.CSSITTAnonymousType addNewITTAnonymous();
    
    /**
     * Unsets the "ITTAnonymous" element
     */
    void unsetITTAnonymous();
    
    /**
     * Gets the "ITTPrincipalNameStatic" element
     */
    org.apache.geronimo.corba.xbeans.csiv2.css.CSSITTPrincipalNameStaticType getITTPrincipalNameStatic();
    
    /**
     * True if has "ITTPrincipalNameStatic" element
     */
    boolean isSetITTPrincipalNameStatic();
    
    /**
     * Sets the "ITTPrincipalNameStatic" element
     */
    void setITTPrincipalNameStatic(org.apache.geronimo.corba.xbeans.csiv2.css.CSSITTPrincipalNameStaticType ittPrincipalNameStatic);
    
    /**
     * Appends and returns a new empty "ITTPrincipalNameStatic" element
     */
    org.apache.geronimo.corba.xbeans.csiv2.css.CSSITTPrincipalNameStaticType addNewITTPrincipalNameStatic();
    
    /**
     * Unsets the "ITTPrincipalNameStatic" element
     */
    void unsetITTPrincipalNameStatic();
    
    /**
     * Gets the "ITTPrincipalNameDynamic" element
     */
    org.apache.geronimo.corba.xbeans.csiv2.css.CSSITTPrincipalNameDynamicType getITTPrincipalNameDynamic();
    
    /**
     * True if has "ITTPrincipalNameDynamic" element
     */
    boolean isSetITTPrincipalNameDynamic();
    
    /**
     * Sets the "ITTPrincipalNameDynamic" element
     */
    void setITTPrincipalNameDynamic(org.apache.geronimo.corba.xbeans.csiv2.css.CSSITTPrincipalNameDynamicType ittPrincipalNameDynamic);
    
    /**
     * Appends and returns a new empty "ITTPrincipalNameDynamic" element
     */
    org.apache.geronimo.corba.xbeans.csiv2.css.CSSITTPrincipalNameDynamicType addNewITTPrincipalNameDynamic();
    
    /**
     * Unsets the "ITTPrincipalNameDynamic" element
     */
    void unsetITTPrincipalNameDynamic();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.apache.geronimo.corba.xbeans.csiv2.css.CSSSasMechType newInstance() {
          return (org.apache.geronimo.corba.xbeans.csiv2.css.CSSSasMechType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.css.CSSSasMechType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.apache.geronimo.corba.xbeans.csiv2.css.CSSSasMechType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.apache.geronimo.corba.xbeans.csiv2.css.CSSSasMechType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.corba.xbeans.csiv2.css.CSSSasMechType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.css.CSSSasMechType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.corba.xbeans.csiv2.css.CSSSasMechType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.apache.geronimo.corba.xbeans.csiv2.css.CSSSasMechType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.corba.xbeans.csiv2.css.CSSSasMechType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.css.CSSSasMechType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.corba.xbeans.csiv2.css.CSSSasMechType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.css.CSSSasMechType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.corba.xbeans.csiv2.css.CSSSasMechType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.css.CSSSasMechType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.corba.xbeans.csiv2.css.CSSSasMechType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.css.CSSSasMechType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.corba.xbeans.csiv2.css.CSSSasMechType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.css.CSSSasMechType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.corba.xbeans.csiv2.css.CSSSasMechType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.css.CSSSasMechType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.corba.xbeans.csiv2.css.CSSSasMechType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.css.CSSSasMechType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.corba.xbeans.csiv2.css.CSSSasMechType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.css.CSSSasMechType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.corba.xbeans.csiv2.css.CSSSasMechType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.css.CSSSasMechType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.corba.xbeans.csiv2.css.CSSSasMechType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.css.CSSSasMechType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.corba.xbeans.csiv2.css.CSSSasMechType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.css.CSSSasMechType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.corba.xbeans.csiv2.css.CSSSasMechType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.geronimo.corba.xbeans.csiv2.css.CSSSasMechType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.geronimo.corba.xbeans.csiv2.css.CSSSasMechType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.geronimo.corba.xbeans.csiv2.css.CSSSasMechType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.geronimo.corba.xbeans.csiv2.css.CSSSasMechType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
