/*
 * XML Type:  tssType
 * Namespace: http://openejb.apache.org/xml/ns/corba-tss-config-2.1
 * Java type: org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTssType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.corba.xbeans.csiv2.tss;


/**
 * An XML tssType(@http://openejb.apache.org/xml/ns/corba-tss-config-2.1).
 *
 * This is a complex type.
 */
public interface TSSTssType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TSSTssType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s09ACC41411FB14C20ABEF817C47DD1DF").resolveHandle("tsstype5504type");
    
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
     * Gets the "SSL" element
     */
    org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSSLType getSSL();
    
    /**
     * True if has "SSL" element
     */
    boolean isSetSSL();
    
    /**
     * Sets the "SSL" element
     */
    void setSSL(org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSSLType ssl);
    
    /**
     * Appends and returns a new empty "SSL" element
     */
    org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSSLType addNewSSL();
    
    /**
     * Unsets the "SSL" element
     */
    void unsetSSL();
    
    /**
     * Gets the "SECIOP" element
     */
    org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSECIOPType getSECIOP();
    
    /**
     * True if has "SECIOP" element
     */
    boolean isSetSECIOP();
    
    /**
     * Sets the "SECIOP" element
     */
    void setSECIOP(org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSECIOPType seciop);
    
    /**
     * Appends and returns a new empty "SECIOP" element
     */
    org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSECIOPType addNewSECIOP();
    
    /**
     * Unsets the "SECIOP" element
     */
    void unsetSECIOP();
    
    /**
     * Gets the "compoundSecMechTypeList" element
     */
    org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTssType.CompoundSecMechTypeList getCompoundSecMechTypeList();
    
    /**
     * True if has "compoundSecMechTypeList" element
     */
    boolean isSetCompoundSecMechTypeList();
    
    /**
     * Sets the "compoundSecMechTypeList" element
     */
    void setCompoundSecMechTypeList(org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTssType.CompoundSecMechTypeList compoundSecMechTypeList);
    
    /**
     * Appends and returns a new empty "compoundSecMechTypeList" element
     */
    org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTssType.CompoundSecMechTypeList addNewCompoundSecMechTypeList();
    
    /**
     * Unsets the "compoundSecMechTypeList" element
     */
    void unsetCompoundSecMechTypeList();
    
    /**
     * Gets the "inherit" attribute
     */
    boolean getInherit();
    
    /**
     * Gets (as xml) the "inherit" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetInherit();
    
    /**
     * True if has "inherit" attribute
     */
    boolean isSetInherit();
    
    /**
     * Sets the "inherit" attribute
     */
    void setInherit(boolean inherit);
    
    /**
     * Sets (as xml) the "inherit" attribute
     */
    void xsetInherit(org.apache.xmlbeans.XmlBoolean inherit);
    
    /**
     * Unsets the "inherit" attribute
     */
    void unsetInherit();
    
    /**
     * An XML compoundSecMechTypeList(@http://openejb.apache.org/xml/ns/corba-tss-config-2.1).
     *
     * This is a complex type.
     */
    public interface CompoundSecMechTypeList extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CompoundSecMechTypeList.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s09ACC41411FB14C20ABEF817C47DD1DF").resolveHandle("compoundsecmechtypelist3d4belemtype");
        
        /**
         * Gets array of all "compoundSecMech" elements
         */
        org.apache.geronimo.corba.xbeans.csiv2.tss.TSSCompoundSecMechType[] getCompoundSecMechArray();
        
        /**
         * Gets ith "compoundSecMech" element
         */
        org.apache.geronimo.corba.xbeans.csiv2.tss.TSSCompoundSecMechType getCompoundSecMechArray(int i);
        
        /**
         * Returns number of "compoundSecMech" element
         */
        int sizeOfCompoundSecMechArray();
        
        /**
         * Sets array of all "compoundSecMech" element
         */
        void setCompoundSecMechArray(org.apache.geronimo.corba.xbeans.csiv2.tss.TSSCompoundSecMechType[] compoundSecMechArray);
        
        /**
         * Sets ith "compoundSecMech" element
         */
        void setCompoundSecMechArray(int i, org.apache.geronimo.corba.xbeans.csiv2.tss.TSSCompoundSecMechType compoundSecMech);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "compoundSecMech" element
         */
        org.apache.geronimo.corba.xbeans.csiv2.tss.TSSCompoundSecMechType insertNewCompoundSecMech(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "compoundSecMech" element
         */
        org.apache.geronimo.corba.xbeans.csiv2.tss.TSSCompoundSecMechType addNewCompoundSecMech();
        
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
            public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTssType.CompoundSecMechTypeList newInstance() {
              return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTssType.CompoundSecMechTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTssType.CompoundSecMechTypeList newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTssType.CompoundSecMechTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTssType newInstance() {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTssType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTssType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTssType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTssType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTssType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTssType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTssType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTssType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTssType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTssType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTssType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTssType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTssType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTssType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTssType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTssType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTssType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTssType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTssType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTssType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTssType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTssType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTssType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTssType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTssType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTssType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTssType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTssType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTssType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTssType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTssType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTssType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTssType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTssType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTssType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
