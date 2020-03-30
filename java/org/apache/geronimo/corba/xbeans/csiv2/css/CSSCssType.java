/*
 * XML Type:  cssType
 * Namespace: http://openejb.apache.org/xml/ns/corba-css-config-2.1
 * Java type: org.apache.geronimo.corba.xbeans.csiv2.css.CSSCssType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.corba.xbeans.csiv2.css;


/**
 * An XML cssType(@http://openejb.apache.org/xml/ns/corba-css-config-2.1).
 *
 * This is a complex type.
 */
public interface CSSCssType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CSSCssType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s09ACC41411FB14C20ABEF817C47DD1DF").resolveHandle("csstype48e4type");
    
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
     * Gets the "compoundSecMechTypeList" element
     */
    org.apache.geronimo.corba.xbeans.csiv2.css.CSSCssType.CompoundSecMechTypeList getCompoundSecMechTypeList();
    
    /**
     * True if has "compoundSecMechTypeList" element
     */
    boolean isSetCompoundSecMechTypeList();
    
    /**
     * Sets the "compoundSecMechTypeList" element
     */
    void setCompoundSecMechTypeList(org.apache.geronimo.corba.xbeans.csiv2.css.CSSCssType.CompoundSecMechTypeList compoundSecMechTypeList);
    
    /**
     * Appends and returns a new empty "compoundSecMechTypeList" element
     */
    org.apache.geronimo.corba.xbeans.csiv2.css.CSSCssType.CompoundSecMechTypeList addNewCompoundSecMechTypeList();
    
    /**
     * Unsets the "compoundSecMechTypeList" element
     */
    void unsetCompoundSecMechTypeList();
    
    /**
     * An XML compoundSecMechTypeList(@http://openejb.apache.org/xml/ns/corba-css-config-2.1).
     *
     * This is a complex type.
     */
    public interface CompoundSecMechTypeList extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CompoundSecMechTypeList.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s09ACC41411FB14C20ABEF817C47DD1DF").resolveHandle("compoundsecmechtypelist312belemtype");
        
        /**
         * Gets array of all "compoundSecMech" elements
         */
        org.apache.geronimo.corba.xbeans.csiv2.css.CSSCompoundSecMechType[] getCompoundSecMechArray();
        
        /**
         * Gets ith "compoundSecMech" element
         */
        org.apache.geronimo.corba.xbeans.csiv2.css.CSSCompoundSecMechType getCompoundSecMechArray(int i);
        
        /**
         * Returns number of "compoundSecMech" element
         */
        int sizeOfCompoundSecMechArray();
        
        /**
         * Sets array of all "compoundSecMech" element
         */
        void setCompoundSecMechArray(org.apache.geronimo.corba.xbeans.csiv2.css.CSSCompoundSecMechType[] compoundSecMechArray);
        
        /**
         * Sets ith "compoundSecMech" element
         */
        void setCompoundSecMechArray(int i, org.apache.geronimo.corba.xbeans.csiv2.css.CSSCompoundSecMechType compoundSecMech);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "compoundSecMech" element
         */
        org.apache.geronimo.corba.xbeans.csiv2.css.CSSCompoundSecMechType insertNewCompoundSecMech(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "compoundSecMech" element
         */
        org.apache.geronimo.corba.xbeans.csiv2.css.CSSCompoundSecMechType addNewCompoundSecMech();
        
        /**
         * Removes the ith "compoundSecMech" element
         */
        void removeCompoundSecMech(int i);
        
        /**
         * Gets the "stateful" attribute
         */
        boolean getStateful();
        
        /**
         * Gets (as xml) the "stateful" attribute
         */
        org.apache.xmlbeans.XmlBoolean xgetStateful();
        
        /**
         * True if has "stateful" attribute
         */
        boolean isSetStateful();
        
        /**
         * Sets the "stateful" attribute
         */
        void setStateful(boolean stateful);
        
        /**
         * Sets (as xml) the "stateful" attribute
         */
        void xsetStateful(org.apache.xmlbeans.XmlBoolean stateful);
        
        /**
         * Unsets the "stateful" attribute
         */
        void unsetStateful();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.apache.geronimo.corba.xbeans.csiv2.css.CSSCssType.CompoundSecMechTypeList newInstance() {
              return (org.apache.geronimo.corba.xbeans.csiv2.css.CSSCssType.CompoundSecMechTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.apache.geronimo.corba.xbeans.csiv2.css.CSSCssType.CompoundSecMechTypeList newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.apache.geronimo.corba.xbeans.csiv2.css.CSSCssType.CompoundSecMechTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.apache.geronimo.corba.xbeans.csiv2.css.CSSCssType newInstance() {
          return (org.apache.geronimo.corba.xbeans.csiv2.css.CSSCssType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.css.CSSCssType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.apache.geronimo.corba.xbeans.csiv2.css.CSSCssType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.apache.geronimo.corba.xbeans.csiv2.css.CSSCssType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.corba.xbeans.csiv2.css.CSSCssType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.css.CSSCssType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.corba.xbeans.csiv2.css.CSSCssType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.apache.geronimo.corba.xbeans.csiv2.css.CSSCssType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.corba.xbeans.csiv2.css.CSSCssType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.css.CSSCssType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.corba.xbeans.csiv2.css.CSSCssType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.css.CSSCssType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.corba.xbeans.csiv2.css.CSSCssType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.css.CSSCssType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.corba.xbeans.csiv2.css.CSSCssType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.css.CSSCssType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.corba.xbeans.csiv2.css.CSSCssType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.css.CSSCssType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.corba.xbeans.csiv2.css.CSSCssType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.css.CSSCssType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.corba.xbeans.csiv2.css.CSSCssType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.css.CSSCssType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.corba.xbeans.csiv2.css.CSSCssType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.css.CSSCssType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.corba.xbeans.csiv2.css.CSSCssType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.css.CSSCssType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.corba.xbeans.csiv2.css.CSSCssType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.css.CSSCssType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.corba.xbeans.csiv2.css.CSSCssType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.css.CSSCssType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.corba.xbeans.csiv2.css.CSSCssType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.geronimo.corba.xbeans.csiv2.css.CSSCssType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.geronimo.corba.xbeans.csiv2.css.CSSCssType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.geronimo.corba.xbeans.csiv2.css.CSSCssType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.geronimo.corba.xbeans.csiv2.css.CSSCssType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
