/*
 * XML Type:  connectionmanagerType
 * Namespace: http://geronimo.apache.org/xml/ns/j2ee/connector-1.2
 * Java type: org.apache.geronimo.xbeans.connector.GerConnectionmanagerType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.connector;


/**
 * An XML connectionmanagerType(@http://geronimo.apache.org/xml/ns/j2ee/connector-1.2).
 *
 * This is a complex type.
 */
public interface GerConnectionmanagerType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GerConnectionmanagerType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE3FD554C5A45CC9CE15631ABA4AB98A7").resolveHandle("connectionmanagertypeb359type");
    
    /**
     * Gets the "container-managed-security" element
     */
    org.apache.geronimo.xbeans.connector.GerEmptyType getContainerManagedSecurity();
    
    /**
     * True if has "container-managed-security" element
     */
    boolean isSetContainerManagedSecurity();
    
    /**
     * Sets the "container-managed-security" element
     */
    void setContainerManagedSecurity(org.apache.geronimo.xbeans.connector.GerEmptyType containerManagedSecurity);
    
    /**
     * Appends and returns a new empty "container-managed-security" element
     */
    org.apache.geronimo.xbeans.connector.GerEmptyType addNewContainerManagedSecurity();
    
    /**
     * Unsets the "container-managed-security" element
     */
    void unsetContainerManagedSecurity();
    
    /**
     * Gets the "no-transaction" element
     */
    org.apache.geronimo.xbeans.connector.GerEmptyType getNoTransaction();
    
    /**
     * True if has "no-transaction" element
     */
    boolean isSetNoTransaction();
    
    /**
     * Sets the "no-transaction" element
     */
    void setNoTransaction(org.apache.geronimo.xbeans.connector.GerEmptyType noTransaction);
    
    /**
     * Appends and returns a new empty "no-transaction" element
     */
    org.apache.geronimo.xbeans.connector.GerEmptyType addNewNoTransaction();
    
    /**
     * Unsets the "no-transaction" element
     */
    void unsetNoTransaction();
    
    /**
     * Gets the "local-transaction" element
     */
    org.apache.geronimo.xbeans.connector.GerEmptyType getLocalTransaction();
    
    /**
     * True if has "local-transaction" element
     */
    boolean isSetLocalTransaction();
    
    /**
     * Sets the "local-transaction" element
     */
    void setLocalTransaction(org.apache.geronimo.xbeans.connector.GerEmptyType localTransaction);
    
    /**
     * Appends and returns a new empty "local-transaction" element
     */
    org.apache.geronimo.xbeans.connector.GerEmptyType addNewLocalTransaction();
    
    /**
     * Unsets the "local-transaction" element
     */
    void unsetLocalTransaction();
    
    /**
     * Gets the "xa-transaction" element
     */
    org.apache.geronimo.xbeans.connector.GerXatransactionType getXaTransaction();
    
    /**
     * True if has "xa-transaction" element
     */
    boolean isSetXaTransaction();
    
    /**
     * Sets the "xa-transaction" element
     */
    void setXaTransaction(org.apache.geronimo.xbeans.connector.GerXatransactionType xaTransaction);
    
    /**
     * Appends and returns a new empty "xa-transaction" element
     */
    org.apache.geronimo.xbeans.connector.GerXatransactionType addNewXaTransaction();
    
    /**
     * Unsets the "xa-transaction" element
     */
    void unsetXaTransaction();
    
    /**
     * Gets the "transaction-log" element
     */
    org.apache.geronimo.xbeans.connector.GerEmptyType getTransactionLog();
    
    /**
     * True if has "transaction-log" element
     */
    boolean isSetTransactionLog();
    
    /**
     * Sets the "transaction-log" element
     */
    void setTransactionLog(org.apache.geronimo.xbeans.connector.GerEmptyType transactionLog);
    
    /**
     * Appends and returns a new empty "transaction-log" element
     */
    org.apache.geronimo.xbeans.connector.GerEmptyType addNewTransactionLog();
    
    /**
     * Unsets the "transaction-log" element
     */
    void unsetTransactionLog();
    
    /**
     * Gets the "no-pool" element
     */
    org.apache.geronimo.xbeans.connector.GerEmptyType getNoPool();
    
    /**
     * True if has "no-pool" element
     */
    boolean isSetNoPool();
    
    /**
     * Sets the "no-pool" element
     */
    void setNoPool(org.apache.geronimo.xbeans.connector.GerEmptyType noPool);
    
    /**
     * Appends and returns a new empty "no-pool" element
     */
    org.apache.geronimo.xbeans.connector.GerEmptyType addNewNoPool();
    
    /**
     * Unsets the "no-pool" element
     */
    void unsetNoPool();
    
    /**
     * Gets the "single-pool" element
     */
    org.apache.geronimo.xbeans.connector.GerSinglepoolType getSinglePool();
    
    /**
     * True if has "single-pool" element
     */
    boolean isSetSinglePool();
    
    /**
     * Sets the "single-pool" element
     */
    void setSinglePool(org.apache.geronimo.xbeans.connector.GerSinglepoolType singlePool);
    
    /**
     * Appends and returns a new empty "single-pool" element
     */
    org.apache.geronimo.xbeans.connector.GerSinglepoolType addNewSinglePool();
    
    /**
     * Unsets the "single-pool" element
     */
    void unsetSinglePool();
    
    /**
     * Gets the "partitioned-pool" element
     */
    org.apache.geronimo.xbeans.connector.GerPartitionedpoolType getPartitionedPool();
    
    /**
     * True if has "partitioned-pool" element
     */
    boolean isSetPartitionedPool();
    
    /**
     * Sets the "partitioned-pool" element
     */
    void setPartitionedPool(org.apache.geronimo.xbeans.connector.GerPartitionedpoolType partitionedPool);
    
    /**
     * Appends and returns a new empty "partitioned-pool" element
     */
    org.apache.geronimo.xbeans.connector.GerPartitionedpoolType addNewPartitionedPool();
    
    /**
     * Unsets the "partitioned-pool" element
     */
    void unsetPartitionedPool();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.apache.geronimo.xbeans.connector.GerConnectionmanagerType newInstance() {
          return (org.apache.geronimo.xbeans.connector.GerConnectionmanagerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.apache.geronimo.xbeans.connector.GerConnectionmanagerType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.apache.geronimo.xbeans.connector.GerConnectionmanagerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.apache.geronimo.xbeans.connector.GerConnectionmanagerType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.connector.GerConnectionmanagerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.apache.geronimo.xbeans.connector.GerConnectionmanagerType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.connector.GerConnectionmanagerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.apache.geronimo.xbeans.connector.GerConnectionmanagerType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.connector.GerConnectionmanagerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.apache.geronimo.xbeans.connector.GerConnectionmanagerType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.connector.GerConnectionmanagerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.apache.geronimo.xbeans.connector.GerConnectionmanagerType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.connector.GerConnectionmanagerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.apache.geronimo.xbeans.connector.GerConnectionmanagerType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.connector.GerConnectionmanagerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.apache.geronimo.xbeans.connector.GerConnectionmanagerType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.connector.GerConnectionmanagerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.apache.geronimo.xbeans.connector.GerConnectionmanagerType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.connector.GerConnectionmanagerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.apache.geronimo.xbeans.connector.GerConnectionmanagerType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.connector.GerConnectionmanagerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.apache.geronimo.xbeans.connector.GerConnectionmanagerType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.connector.GerConnectionmanagerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.apache.geronimo.xbeans.connector.GerConnectionmanagerType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.connector.GerConnectionmanagerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.apache.geronimo.xbeans.connector.GerConnectionmanagerType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.connector.GerConnectionmanagerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.apache.geronimo.xbeans.connector.GerConnectionmanagerType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.connector.GerConnectionmanagerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.apache.geronimo.xbeans.connector.GerConnectionmanagerType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.connector.GerConnectionmanagerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.geronimo.xbeans.connector.GerConnectionmanagerType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.geronimo.xbeans.connector.GerConnectionmanagerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.geronimo.xbeans.connector.GerConnectionmanagerType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.geronimo.xbeans.connector.GerConnectionmanagerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
