/*
 * XML Type:  persistence-unit-refType
 * Namespace: http://geronimo.apache.org/xml/ns/naming-1.2
 * Java type: org.apache.geronimo.xbeans.geronimo.naming.GerPersistenceUnitRefType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.geronimo.naming;


/**
 * An XML persistence-unit-refType(@http://geronimo.apache.org/xml/ns/naming-1.2).
 *
 * This is a complex type.
 */
public interface GerPersistenceUnitRefType extends org.apache.geronimo.xbeans.geronimo.naming.GerAbstractNamingEntryType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GerPersistenceUnitRefType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1DE3CC699F4F003C18CA209853695E0").resolveHandle("persistenceunitreftype6840type");
    
    /**
     * Gets the "persistence-unit-ref-name" element
     */
    java.lang.String getPersistenceUnitRefName();
    
    /**
     * Gets (as xml) the "persistence-unit-ref-name" element
     */
    org.apache.xmlbeans.XmlString xgetPersistenceUnitRefName();
    
    /**
     * Sets the "persistence-unit-ref-name" element
     */
    void setPersistenceUnitRefName(java.lang.String persistenceUnitRefName);
    
    /**
     * Sets (as xml) the "persistence-unit-ref-name" element
     */
    void xsetPersistenceUnitRefName(org.apache.xmlbeans.XmlString persistenceUnitRefName);
    
    /**
     * Gets the "persistence-unit-name" element
     */
    java.lang.String getPersistenceUnitName();
    
    /**
     * Gets (as xml) the "persistence-unit-name" element
     */
    org.apache.xmlbeans.XmlString xgetPersistenceUnitName();
    
    /**
     * True if has "persistence-unit-name" element
     */
    boolean isSetPersistenceUnitName();
    
    /**
     * Sets the "persistence-unit-name" element
     */
    void setPersistenceUnitName(java.lang.String persistenceUnitName);
    
    /**
     * Sets (as xml) the "persistence-unit-name" element
     */
    void xsetPersistenceUnitName(org.apache.xmlbeans.XmlString persistenceUnitName);
    
    /**
     * Unsets the "persistence-unit-name" element
     */
    void unsetPersistenceUnitName();
    
    /**
     * Gets the "pattern" element
     */
    org.apache.geronimo.xbeans.geronimo.naming.GerPatternType getPattern();
    
    /**
     * True if has "pattern" element
     */
    boolean isSetPattern();
    
    /**
     * Sets the "pattern" element
     */
    void setPattern(org.apache.geronimo.xbeans.geronimo.naming.GerPatternType pattern);
    
    /**
     * Appends and returns a new empty "pattern" element
     */
    org.apache.geronimo.xbeans.geronimo.naming.GerPatternType addNewPattern();
    
    /**
     * Unsets the "pattern" element
     */
    void unsetPattern();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.apache.geronimo.xbeans.geronimo.naming.GerPersistenceUnitRefType newInstance() {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerPersistenceUnitRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.naming.GerPersistenceUnitRefType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerPersistenceUnitRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.apache.geronimo.xbeans.geronimo.naming.GerPersistenceUnitRefType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerPersistenceUnitRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.naming.GerPersistenceUnitRefType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerPersistenceUnitRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.apache.geronimo.xbeans.geronimo.naming.GerPersistenceUnitRefType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerPersistenceUnitRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.naming.GerPersistenceUnitRefType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerPersistenceUnitRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.apache.geronimo.xbeans.geronimo.naming.GerPersistenceUnitRefType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerPersistenceUnitRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.naming.GerPersistenceUnitRefType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerPersistenceUnitRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.apache.geronimo.xbeans.geronimo.naming.GerPersistenceUnitRefType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerPersistenceUnitRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.naming.GerPersistenceUnitRefType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerPersistenceUnitRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.apache.geronimo.xbeans.geronimo.naming.GerPersistenceUnitRefType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerPersistenceUnitRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.naming.GerPersistenceUnitRefType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerPersistenceUnitRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.apache.geronimo.xbeans.geronimo.naming.GerPersistenceUnitRefType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerPersistenceUnitRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.naming.GerPersistenceUnitRefType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerPersistenceUnitRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.apache.geronimo.xbeans.geronimo.naming.GerPersistenceUnitRefType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerPersistenceUnitRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.naming.GerPersistenceUnitRefType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerPersistenceUnitRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.geronimo.xbeans.geronimo.naming.GerPersistenceUnitRefType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerPersistenceUnitRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.geronimo.xbeans.geronimo.naming.GerPersistenceUnitRefType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerPersistenceUnitRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
