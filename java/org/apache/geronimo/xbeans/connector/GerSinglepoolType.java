/*
 * XML Type:  singlepoolType
 * Namespace: http://geronimo.apache.org/xml/ns/j2ee/connector-1.2
 * Java type: org.apache.geronimo.xbeans.connector.GerSinglepoolType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.connector;


/**
 * An XML singlepoolType(@http://geronimo.apache.org/xml/ns/j2ee/connector-1.2).
 *
 * This is a complex type.
 */
public interface GerSinglepoolType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GerSinglepoolType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE3FD554C5A45CC9CE15631ABA4AB98A7").resolveHandle("singlepooltype2972type");
    
    /**
     * Gets the "max-size" element
     */
    int getMaxSize();
    
    /**
     * Gets (as xml) the "max-size" element
     */
    org.apache.xmlbeans.XmlInt xgetMaxSize();
    
    /**
     * True if has "max-size" element
     */
    boolean isSetMaxSize();
    
    /**
     * Sets the "max-size" element
     */
    void setMaxSize(int maxSize);
    
    /**
     * Sets (as xml) the "max-size" element
     */
    void xsetMaxSize(org.apache.xmlbeans.XmlInt maxSize);
    
    /**
     * Unsets the "max-size" element
     */
    void unsetMaxSize();
    
    /**
     * Gets the "min-size" element
     */
    int getMinSize();
    
    /**
     * Gets (as xml) the "min-size" element
     */
    org.apache.xmlbeans.XmlInt xgetMinSize();
    
    /**
     * True if has "min-size" element
     */
    boolean isSetMinSize();
    
    /**
     * Sets the "min-size" element
     */
    void setMinSize(int minSize);
    
    /**
     * Sets (as xml) the "min-size" element
     */
    void xsetMinSize(org.apache.xmlbeans.XmlInt minSize);
    
    /**
     * Unsets the "min-size" element
     */
    void unsetMinSize();
    
    /**
     * Gets the "blocking-timeout-milliseconds" element
     */
    int getBlockingTimeoutMilliseconds();
    
    /**
     * Gets (as xml) the "blocking-timeout-milliseconds" element
     */
    org.apache.xmlbeans.XmlInt xgetBlockingTimeoutMilliseconds();
    
    /**
     * True if has "blocking-timeout-milliseconds" element
     */
    boolean isSetBlockingTimeoutMilliseconds();
    
    /**
     * Sets the "blocking-timeout-milliseconds" element
     */
    void setBlockingTimeoutMilliseconds(int blockingTimeoutMilliseconds);
    
    /**
     * Sets (as xml) the "blocking-timeout-milliseconds" element
     */
    void xsetBlockingTimeoutMilliseconds(org.apache.xmlbeans.XmlInt blockingTimeoutMilliseconds);
    
    /**
     * Unsets the "blocking-timeout-milliseconds" element
     */
    void unsetBlockingTimeoutMilliseconds();
    
    /**
     * Gets the "idle-timeout-minutes" element
     */
    int getIdleTimeoutMinutes();
    
    /**
     * Gets (as xml) the "idle-timeout-minutes" element
     */
    org.apache.xmlbeans.XmlInt xgetIdleTimeoutMinutes();
    
    /**
     * True if has "idle-timeout-minutes" element
     */
    boolean isSetIdleTimeoutMinutes();
    
    /**
     * Sets the "idle-timeout-minutes" element
     */
    void setIdleTimeoutMinutes(int idleTimeoutMinutes);
    
    /**
     * Sets (as xml) the "idle-timeout-minutes" element
     */
    void xsetIdleTimeoutMinutes(org.apache.xmlbeans.XmlInt idleTimeoutMinutes);
    
    /**
     * Unsets the "idle-timeout-minutes" element
     */
    void unsetIdleTimeoutMinutes();
    
    /**
     * Gets the "match-one" element
     */
    org.apache.geronimo.xbeans.connector.GerEmptyType getMatchOne();
    
    /**
     * True if has "match-one" element
     */
    boolean isSetMatchOne();
    
    /**
     * Sets the "match-one" element
     */
    void setMatchOne(org.apache.geronimo.xbeans.connector.GerEmptyType matchOne);
    
    /**
     * Appends and returns a new empty "match-one" element
     */
    org.apache.geronimo.xbeans.connector.GerEmptyType addNewMatchOne();
    
    /**
     * Unsets the "match-one" element
     */
    void unsetMatchOne();
    
    /**
     * Gets the "match-all" element
     */
    org.apache.geronimo.xbeans.connector.GerEmptyType getMatchAll();
    
    /**
     * True if has "match-all" element
     */
    boolean isSetMatchAll();
    
    /**
     * Sets the "match-all" element
     */
    void setMatchAll(org.apache.geronimo.xbeans.connector.GerEmptyType matchAll);
    
    /**
     * Appends and returns a new empty "match-all" element
     */
    org.apache.geronimo.xbeans.connector.GerEmptyType addNewMatchAll();
    
    /**
     * Unsets the "match-all" element
     */
    void unsetMatchAll();
    
    /**
     * Gets the "select-one-assume-match" element
     */
    org.apache.geronimo.xbeans.connector.GerEmptyType getSelectOneAssumeMatch();
    
    /**
     * True if has "select-one-assume-match" element
     */
    boolean isSetSelectOneAssumeMatch();
    
    /**
     * Sets the "select-one-assume-match" element
     */
    void setSelectOneAssumeMatch(org.apache.geronimo.xbeans.connector.GerEmptyType selectOneAssumeMatch);
    
    /**
     * Appends and returns a new empty "select-one-assume-match" element
     */
    org.apache.geronimo.xbeans.connector.GerEmptyType addNewSelectOneAssumeMatch();
    
    /**
     * Unsets the "select-one-assume-match" element
     */
    void unsetSelectOneAssumeMatch();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.apache.geronimo.xbeans.connector.GerSinglepoolType newInstance() {
          return (org.apache.geronimo.xbeans.connector.GerSinglepoolType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.apache.geronimo.xbeans.connector.GerSinglepoolType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.apache.geronimo.xbeans.connector.GerSinglepoolType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.apache.geronimo.xbeans.connector.GerSinglepoolType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.connector.GerSinglepoolType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.apache.geronimo.xbeans.connector.GerSinglepoolType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.connector.GerSinglepoolType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.apache.geronimo.xbeans.connector.GerSinglepoolType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.connector.GerSinglepoolType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.apache.geronimo.xbeans.connector.GerSinglepoolType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.connector.GerSinglepoolType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.apache.geronimo.xbeans.connector.GerSinglepoolType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.connector.GerSinglepoolType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.apache.geronimo.xbeans.connector.GerSinglepoolType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.connector.GerSinglepoolType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.apache.geronimo.xbeans.connector.GerSinglepoolType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.connector.GerSinglepoolType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.apache.geronimo.xbeans.connector.GerSinglepoolType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.connector.GerSinglepoolType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.apache.geronimo.xbeans.connector.GerSinglepoolType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.connector.GerSinglepoolType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.apache.geronimo.xbeans.connector.GerSinglepoolType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.connector.GerSinglepoolType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.apache.geronimo.xbeans.connector.GerSinglepoolType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.connector.GerSinglepoolType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.apache.geronimo.xbeans.connector.GerSinglepoolType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.connector.GerSinglepoolType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.apache.geronimo.xbeans.connector.GerSinglepoolType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.connector.GerSinglepoolType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.apache.geronimo.xbeans.connector.GerSinglepoolType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.connector.GerSinglepoolType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.geronimo.xbeans.connector.GerSinglepoolType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.geronimo.xbeans.connector.GerSinglepoolType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.geronimo.xbeans.connector.GerSinglepoolType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.geronimo.xbeans.connector.GerSinglepoolType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
