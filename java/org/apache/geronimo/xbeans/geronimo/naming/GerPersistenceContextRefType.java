/*
 * XML Type:  persistence-context-refType
 * Namespace: http://geronimo.apache.org/xml/ns/naming-1.2
 * Java type: org.apache.geronimo.xbeans.geronimo.naming.GerPersistenceContextRefType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.geronimo.naming;


/**
 * An XML persistence-context-refType(@http://geronimo.apache.org/xml/ns/naming-1.2).
 *
 * This is a complex type.
 */
public interface GerPersistenceContextRefType extends org.apache.geronimo.xbeans.geronimo.naming.GerAbstractNamingEntryType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GerPersistenceContextRefType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1DE3CC699F4F003C18CA209853695E0").resolveHandle("persistencecontextreftype4d43type");
    
    /**
     * Gets the "persistence-context-ref-name" element
     */
    java.lang.String getPersistenceContextRefName();
    
    /**
     * Gets (as xml) the "persistence-context-ref-name" element
     */
    org.apache.xmlbeans.XmlString xgetPersistenceContextRefName();
    
    /**
     * Sets the "persistence-context-ref-name" element
     */
    void setPersistenceContextRefName(java.lang.String persistenceContextRefName);
    
    /**
     * Sets (as xml) the "persistence-context-ref-name" element
     */
    void xsetPersistenceContextRefName(org.apache.xmlbeans.XmlString persistenceContextRefName);
    
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
     * Gets the "persistence-context-type" element
     */
    org.apache.geronimo.xbeans.geronimo.naming.GerPersistenceContextTypeType.Enum getPersistenceContextType();
    
    /**
     * Gets (as xml) the "persistence-context-type" element
     */
    org.apache.geronimo.xbeans.geronimo.naming.GerPersistenceContextTypeType xgetPersistenceContextType();
    
    /**
     * True if has "persistence-context-type" element
     */
    boolean isSetPersistenceContextType();
    
    /**
     * Sets the "persistence-context-type" element
     */
    void setPersistenceContextType(org.apache.geronimo.xbeans.geronimo.naming.GerPersistenceContextTypeType.Enum persistenceContextType);
    
    /**
     * Sets (as xml) the "persistence-context-type" element
     */
    void xsetPersistenceContextType(org.apache.geronimo.xbeans.geronimo.naming.GerPersistenceContextTypeType persistenceContextType);
    
    /**
     * Unsets the "persistence-context-type" element
     */
    void unsetPersistenceContextType();
    
    /**
     * Gets array of all "property" elements
     */
    org.apache.geronimo.xbeans.geronimo.naming.GerPropertyType[] getPropertyArray();
    
    /**
     * Gets ith "property" element
     */
    org.apache.geronimo.xbeans.geronimo.naming.GerPropertyType getPropertyArray(int i);
    
    /**
     * Returns number of "property" element
     */
    int sizeOfPropertyArray();
    
    /**
     * Sets array of all "property" element
     */
    void setPropertyArray(org.apache.geronimo.xbeans.geronimo.naming.GerPropertyType[] propertyArray);
    
    /**
     * Sets ith "property" element
     */
    void setPropertyArray(int i, org.apache.geronimo.xbeans.geronimo.naming.GerPropertyType property);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "property" element
     */
    org.apache.geronimo.xbeans.geronimo.naming.GerPropertyType insertNewProperty(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "property" element
     */
    org.apache.geronimo.xbeans.geronimo.naming.GerPropertyType addNewProperty();
    
    /**
     * Removes the ith "property" element
     */
    void removeProperty(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.apache.geronimo.xbeans.geronimo.naming.GerPersistenceContextRefType newInstance() {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerPersistenceContextRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.naming.GerPersistenceContextRefType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerPersistenceContextRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.apache.geronimo.xbeans.geronimo.naming.GerPersistenceContextRefType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerPersistenceContextRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.naming.GerPersistenceContextRefType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerPersistenceContextRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.apache.geronimo.xbeans.geronimo.naming.GerPersistenceContextRefType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerPersistenceContextRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.naming.GerPersistenceContextRefType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerPersistenceContextRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.apache.geronimo.xbeans.geronimo.naming.GerPersistenceContextRefType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerPersistenceContextRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.naming.GerPersistenceContextRefType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerPersistenceContextRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.apache.geronimo.xbeans.geronimo.naming.GerPersistenceContextRefType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerPersistenceContextRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.naming.GerPersistenceContextRefType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerPersistenceContextRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.apache.geronimo.xbeans.geronimo.naming.GerPersistenceContextRefType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerPersistenceContextRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.naming.GerPersistenceContextRefType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerPersistenceContextRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.apache.geronimo.xbeans.geronimo.naming.GerPersistenceContextRefType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerPersistenceContextRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.naming.GerPersistenceContextRefType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerPersistenceContextRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.apache.geronimo.xbeans.geronimo.naming.GerPersistenceContextRefType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerPersistenceContextRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.naming.GerPersistenceContextRefType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerPersistenceContextRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.geronimo.xbeans.geronimo.naming.GerPersistenceContextRefType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerPersistenceContextRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.geronimo.xbeans.geronimo.naming.GerPersistenceContextRefType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerPersistenceContextRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
