/*
 * XML Type:  SECIOPType
 * Namespace: http://openejb.apache.org/xml/ns/corba-tss-config-2.1
 * Java type: org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSECIOPType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.corba.xbeans.csiv2.tss;


/**
 * An XML SECIOPType(@http://openejb.apache.org/xml/ns/corba-tss-config-2.1).
 *
 * This is a complex type.
 */
public interface TSSSECIOPType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TSSSECIOPType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s09ACC41411FB14C20ABEF817C47DD1DF").resolveHandle("secioptype293btype");
    
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
     * Gets the "supports" element
     */
    java.util.List getSupports();
    
    /**
     * Gets (as xml) the "supports" element
     */
    org.apache.geronimo.corba.xbeans.csiv2.tss.TSSAssociationOptionList xgetSupports();
    
    /**
     * Sets the "supports" element
     */
    void setSupports(java.util.List supports);
    
    /**
     * Sets (as xml) the "supports" element
     */
    void xsetSupports(org.apache.geronimo.corba.xbeans.csiv2.tss.TSSAssociationOptionList supports);
    
    /**
     * Gets the "requires" element
     */
    java.util.List getRequires();
    
    /**
     * Gets (as xml) the "requires" element
     */
    org.apache.geronimo.corba.xbeans.csiv2.tss.TSSAssociationOptionList xgetRequires();
    
    /**
     * Sets the "requires" element
     */
    void setRequires(java.util.List requires);
    
    /**
     * Sets (as xml) the "requires" element
     */
    void xsetRequires(org.apache.geronimo.corba.xbeans.csiv2.tss.TSSAssociationOptionList requires);
    
    /**
     * Gets array of all "transportAddress" elements
     */
    org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTransportAddressType[] getTransportAddressArray();
    
    /**
     * Gets ith "transportAddress" element
     */
    org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTransportAddressType getTransportAddressArray(int i);
    
    /**
     * Returns number of "transportAddress" element
     */
    int sizeOfTransportAddressArray();
    
    /**
     * Sets array of all "transportAddress" element
     */
    void setTransportAddressArray(org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTransportAddressType[] transportAddressArray);
    
    /**
     * Sets ith "transportAddress" element
     */
    void setTransportAddressArray(int i, org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTransportAddressType transportAddress);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "transportAddress" element
     */
    org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTransportAddressType insertNewTransportAddress(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "transportAddress" element
     */
    org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTransportAddressType addNewTransportAddress();
    
    /**
     * Removes the ith "transportAddress" element
     */
    void removeTransportAddress(int i);
    
    /**
     * Gets the "trustEveryone" element
     */
    org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTrustEveryoneType getTrustEveryone();
    
    /**
     * True if has "trustEveryone" element
     */
    boolean isSetTrustEveryone();
    
    /**
     * Sets the "trustEveryone" element
     */
    void setTrustEveryone(org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTrustEveryoneType trustEveryone);
    
    /**
     * Appends and returns a new empty "trustEveryone" element
     */
    org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTrustEveryoneType addNewTrustEveryone();
    
    /**
     * Unsets the "trustEveryone" element
     */
    void unsetTrustEveryone();
    
    /**
     * Gets the "trustNoone" element
     */
    org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTrustNooneType getTrustNoone();
    
    /**
     * True if has "trustNoone" element
     */
    boolean isSetTrustNoone();
    
    /**
     * Sets the "trustNoone" element
     */
    void setTrustNoone(org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTrustNooneType trustNoone);
    
    /**
     * Appends and returns a new empty "trustNoone" element
     */
    org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTrustNooneType addNewTrustNoone();
    
    /**
     * Unsets the "trustNoone" element
     */
    void unsetTrustNoone();
    
    /**
     * Gets the "trustList" element
     */
    org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSECIOPType.TrustList getTrustList();
    
    /**
     * True if has "trustList" element
     */
    boolean isSetTrustList();
    
    /**
     * Sets the "trustList" element
     */
    void setTrustList(org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSECIOPType.TrustList trustList);
    
    /**
     * Appends and returns a new empty "trustList" element
     */
    org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSECIOPType.TrustList addNewTrustList();
    
    /**
     * Unsets the "trustList" element
     */
    void unsetTrustList();
    
    /**
     * Gets the "mechOID" attribute
     */
    java.lang.String getMechOID();
    
    /**
     * Gets (as xml) the "mechOID" attribute
     */
    org.apache.xmlbeans.XmlString xgetMechOID();
    
    /**
     * True if has "mechOID" attribute
     */
    boolean isSetMechOID();
    
    /**
     * Sets the "mechOID" attribute
     */
    void setMechOID(java.lang.String mechOID);
    
    /**
     * Sets (as xml) the "mechOID" attribute
     */
    void xsetMechOID(org.apache.xmlbeans.XmlString mechOID);
    
    /**
     * Unsets the "mechOID" attribute
     */
    void unsetMechOID();
    
    /**
     * Gets the "targetName" attribute
     */
    java.lang.String getTargetName();
    
    /**
     * Gets (as xml) the "targetName" attribute
     */
    org.apache.xmlbeans.XmlString xgetTargetName();
    
    /**
     * True if has "targetName" attribute
     */
    boolean isSetTargetName();
    
    /**
     * Sets the "targetName" attribute
     */
    void setTargetName(java.lang.String targetName);
    
    /**
     * Sets (as xml) the "targetName" attribute
     */
    void xsetTargetName(org.apache.xmlbeans.XmlString targetName);
    
    /**
     * Unsets the "targetName" attribute
     */
    void unsetTargetName();
    
    /**
     * An XML trustList(@http://openejb.apache.org/xml/ns/corba-tss-config-2.1).
     *
     * This is a complex type.
     */
    public interface TrustList extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TrustList.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s09ACC41411FB14C20ABEF817C47DD1DF").resolveHandle("trustlist1879elemtype");
        
        /**
         * Gets array of all "entity" elements
         */
        org.apache.geronimo.corba.xbeans.csiv2.tss.TSSEntityType[] getEntityArray();
        
        /**
         * Gets ith "entity" element
         */
        org.apache.geronimo.corba.xbeans.csiv2.tss.TSSEntityType getEntityArray(int i);
        
        /**
         * Returns number of "entity" element
         */
        int sizeOfEntityArray();
        
        /**
         * Sets array of all "entity" element
         */
        void setEntityArray(org.apache.geronimo.corba.xbeans.csiv2.tss.TSSEntityType[] entityArray);
        
        /**
         * Sets ith "entity" element
         */
        void setEntityArray(int i, org.apache.geronimo.corba.xbeans.csiv2.tss.TSSEntityType entity);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "entity" element
         */
        org.apache.geronimo.corba.xbeans.csiv2.tss.TSSEntityType insertNewEntity(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "entity" element
         */
        org.apache.geronimo.corba.xbeans.csiv2.tss.TSSEntityType addNewEntity();
        
        /**
         * Removes the ith "entity" element
         */
        void removeEntity(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSECIOPType.TrustList newInstance() {
              return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSECIOPType.TrustList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSECIOPType.TrustList newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSECIOPType.TrustList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSECIOPType newInstance() {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSECIOPType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSECIOPType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSECIOPType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSECIOPType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSECIOPType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSECIOPType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSECIOPType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSECIOPType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSECIOPType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSECIOPType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSECIOPType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSECIOPType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSECIOPType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSECIOPType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSECIOPType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSECIOPType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSECIOPType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSECIOPType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSECIOPType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSECIOPType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSECIOPType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSECIOPType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSECIOPType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSECIOPType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSECIOPType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSECIOPType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSECIOPType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSECIOPType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSECIOPType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSECIOPType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSECIOPType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSECIOPType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSECIOPType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSECIOPType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSECIOPType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
