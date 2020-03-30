/*
 * XML Type:  compoundSecMechType
 * Namespace: http://openejb.apache.org/xml/ns/corba-tss-config-2.1
 * Java type: org.apache.geronimo.corba.xbeans.csiv2.tss.TSSCompoundSecMechType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.corba.xbeans.csiv2.tss;


/**
 * An XML compoundSecMechType(@http://openejb.apache.org/xml/ns/corba-tss-config-2.1).
 *
 * This is a complex type.
 */
public interface TSSCompoundSecMechType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TSSCompoundSecMechType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s09ACC41411FB14C20ABEF817C47DD1DF").resolveHandle("compoundsecmechtype3bb3type");
    
    /**
     * Gets array of all "description" elements
     */
    org.apache.geronimo.corba.xbeans.csiv2.tss.TSSDescriptionType[] getDescriptionArray();
    
    /**
     * Gets ith "description" element
     */
    org.apache.geronimo.corba.xbeans.csiv2.tss.TSSDescriptionType getDescriptionArray(int i);
    
    /**
     * Returns number of "description" element
     */
    int sizeOfDescriptionArray();
    
    /**
     * Sets array of all "description" element
     */
    void setDescriptionArray(org.apache.geronimo.corba.xbeans.csiv2.tss.TSSDescriptionType[] descriptionArray);
    
    /**
     * Sets ith "description" element
     */
    void setDescriptionArray(int i, org.apache.geronimo.corba.xbeans.csiv2.tss.TSSDescriptionType description);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "description" element
     */
    org.apache.geronimo.corba.xbeans.csiv2.tss.TSSDescriptionType insertNewDescription(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "description" element
     */
    org.apache.geronimo.corba.xbeans.csiv2.tss.TSSDescriptionType addNewDescription();
    
    /**
     * Removes the ith "description" element
     */
    void removeDescription(int i);
    
    /**
     * Gets the "GSSUP" element
     */
    org.apache.geronimo.corba.xbeans.csiv2.tss.TSSGSSUPType getGSSUP();
    
    /**
     * True if has "GSSUP" element
     */
    boolean isSetGSSUP();
    
    /**
     * Sets the "GSSUP" element
     */
    void setGSSUP(org.apache.geronimo.corba.xbeans.csiv2.tss.TSSGSSUPType gssup);
    
    /**
     * Appends and returns a new empty "GSSUP" element
     */
    org.apache.geronimo.corba.xbeans.csiv2.tss.TSSGSSUPType addNewGSSUP();
    
    /**
     * Unsets the "GSSUP" element
     */
    void unsetGSSUP();
    
    /**
     * Gets the "sasMech" element
     */
    org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSasMechType getSasMech();
    
    /**
     * True if has "sasMech" element
     */
    boolean isSetSasMech();
    
    /**
     * Sets the "sasMech" element
     */
    void setSasMech(org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSasMechType sasMech);
    
    /**
     * Appends and returns a new empty "sasMech" element
     */
    org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSasMechType addNewSasMech();
    
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
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSCompoundSecMechType newInstance() {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSCompoundSecMechType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSCompoundSecMechType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSCompoundSecMechType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSCompoundSecMechType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSCompoundSecMechType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSCompoundSecMechType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSCompoundSecMechType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSCompoundSecMechType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSCompoundSecMechType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSCompoundSecMechType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSCompoundSecMechType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSCompoundSecMechType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSCompoundSecMechType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSCompoundSecMechType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSCompoundSecMechType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSCompoundSecMechType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSCompoundSecMechType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSCompoundSecMechType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSCompoundSecMechType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSCompoundSecMechType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSCompoundSecMechType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSCompoundSecMechType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSCompoundSecMechType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSCompoundSecMechType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSCompoundSecMechType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSCompoundSecMechType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSCompoundSecMechType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSCompoundSecMechType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSCompoundSecMechType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSCompoundSecMechType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSCompoundSecMechType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSCompoundSecMechType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSCompoundSecMechType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSCompoundSecMechType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSCompoundSecMechType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
