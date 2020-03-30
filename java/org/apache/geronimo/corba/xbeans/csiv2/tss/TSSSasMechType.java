/*
 * XML Type:  sasMechType
 * Namespace: http://openejb.apache.org/xml/ns/corba-tss-config-2.1
 * Java type: org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSasMechType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.corba.xbeans.csiv2.tss;


/**
 * An XML sasMechType(@http://openejb.apache.org/xml/ns/corba-tss-config-2.1).
 *
 * This is a complex type.
 */
public interface TSSSasMechType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TSSSasMechType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s09ACC41411FB14C20ABEF817C47DD1DF").resolveHandle("sasmechtyped3b2type");
    
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
     * Gets the "serviceConfigurationList" element
     */
    org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSasMechType.ServiceConfigurationList getServiceConfigurationList();
    
    /**
     * True if has "serviceConfigurationList" element
     */
    boolean isSetServiceConfigurationList();
    
    /**
     * Sets the "serviceConfigurationList" element
     */
    void setServiceConfigurationList(org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSasMechType.ServiceConfigurationList serviceConfigurationList);
    
    /**
     * Appends and returns a new empty "serviceConfigurationList" element
     */
    org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSasMechType.ServiceConfigurationList addNewServiceConfigurationList();
    
    /**
     * Unsets the "serviceConfigurationList" element
     */
    void unsetServiceConfigurationList();
    
    /**
     * Gets the "identityTokenTypes" element
     */
    org.apache.geronimo.corba.xbeans.csiv2.tss.TSSIdentityTokenTypeList getIdentityTokenTypes();
    
    /**
     * Sets the "identityTokenTypes" element
     */
    void setIdentityTokenTypes(org.apache.geronimo.corba.xbeans.csiv2.tss.TSSIdentityTokenTypeList identityTokenTypes);
    
    /**
     * Appends and returns a new empty "identityTokenTypes" element
     */
    org.apache.geronimo.corba.xbeans.csiv2.tss.TSSIdentityTokenTypeList addNewIdentityTokenTypes();
    
    /**
     * An XML serviceConfigurationList(@http://openejb.apache.org/xml/ns/corba-tss-config-2.1).
     *
     * This is a complex type.
     */
    public interface ServiceConfigurationList extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ServiceConfigurationList.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s09ACC41411FB14C20ABEF817C47DD1DF").resolveHandle("serviceconfigurationlist7f4delemtype");
        
        /**
         * Gets array of all "generalName" elements
         */
        org.apache.geronimo.corba.xbeans.csiv2.tss.TSSGeneralNameType[] getGeneralNameArray();
        
        /**
         * Gets ith "generalName" element
         */
        org.apache.geronimo.corba.xbeans.csiv2.tss.TSSGeneralNameType getGeneralNameArray(int i);
        
        /**
         * Returns number of "generalName" element
         */
        int sizeOfGeneralNameArray();
        
        /**
         * Sets array of all "generalName" element
         */
        void setGeneralNameArray(org.apache.geronimo.corba.xbeans.csiv2.tss.TSSGeneralNameType[] generalNameArray);
        
        /**
         * Sets ith "generalName" element
         */
        void setGeneralNameArray(int i, org.apache.geronimo.corba.xbeans.csiv2.tss.TSSGeneralNameType generalName);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "generalName" element
         */
        org.apache.geronimo.corba.xbeans.csiv2.tss.TSSGeneralNameType insertNewGeneralName(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "generalName" element
         */
        org.apache.geronimo.corba.xbeans.csiv2.tss.TSSGeneralNameType addNewGeneralName();
        
        /**
         * Removes the ith "generalName" element
         */
        void removeGeneralName(int i);
        
        /**
         * Gets array of all "gssExportedName" elements
         */
        org.apache.geronimo.corba.xbeans.csiv2.tss.TSSGssExportedNameType[] getGssExportedNameArray();
        
        /**
         * Gets ith "gssExportedName" element
         */
        org.apache.geronimo.corba.xbeans.csiv2.tss.TSSGssExportedNameType getGssExportedNameArray(int i);
        
        /**
         * Returns number of "gssExportedName" element
         */
        int sizeOfGssExportedNameArray();
        
        /**
         * Sets array of all "gssExportedName" element
         */
        void setGssExportedNameArray(org.apache.geronimo.corba.xbeans.csiv2.tss.TSSGssExportedNameType[] gssExportedNameArray);
        
        /**
         * Sets ith "gssExportedName" element
         */
        void setGssExportedNameArray(int i, org.apache.geronimo.corba.xbeans.csiv2.tss.TSSGssExportedNameType gssExportedName);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "gssExportedName" element
         */
        org.apache.geronimo.corba.xbeans.csiv2.tss.TSSGssExportedNameType insertNewGssExportedName(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "gssExportedName" element
         */
        org.apache.geronimo.corba.xbeans.csiv2.tss.TSSGssExportedNameType addNewGssExportedName();
        
        /**
         * Removes the ith "gssExportedName" element
         */
        void removeGssExportedName(int i);
        
        /**
         * Gets the "required" attribute
         */
        boolean getRequired();
        
        /**
         * Gets (as xml) the "required" attribute
         */
        org.apache.xmlbeans.XmlBoolean xgetRequired();
        
        /**
         * True if has "required" attribute
         */
        boolean isSetRequired();
        
        /**
         * Sets the "required" attribute
         */
        void setRequired(boolean required);
        
        /**
         * Sets (as xml) the "required" attribute
         */
        void xsetRequired(org.apache.xmlbeans.XmlBoolean required);
        
        /**
         * Unsets the "required" attribute
         */
        void unsetRequired();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSasMechType.ServiceConfigurationList newInstance() {
              return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSasMechType.ServiceConfigurationList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSasMechType.ServiceConfigurationList newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSasMechType.ServiceConfigurationList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSasMechType newInstance() {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSasMechType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSasMechType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSasMechType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSasMechType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSasMechType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSasMechType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSasMechType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSasMechType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSasMechType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSasMechType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSasMechType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSasMechType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSasMechType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSasMechType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSasMechType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSasMechType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSasMechType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSasMechType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSasMechType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSasMechType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSasMechType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSasMechType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSasMechType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSasMechType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSasMechType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSasMechType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSasMechType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSasMechType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSasMechType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSasMechType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSasMechType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSasMechType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSasMechType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSasMechType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSasMechType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
