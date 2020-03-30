/*
 * XML Type:  gbean-refType
 * Namespace: http://geronimo.apache.org/xml/ns/naming-1.2
 * Java type: org.apache.geronimo.xbeans.geronimo.naming.GerGbeanRefType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.geronimo.naming;


/**
 * An XML gbean-refType(@http://geronimo.apache.org/xml/ns/naming-1.2).
 *
 * This is a complex type.
 */
public interface GerGbeanRefType extends org.apache.geronimo.xbeans.geronimo.naming.GerAbstractNamingEntryType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GerGbeanRefType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1DE3CC699F4F003C18CA209853695E0").resolveHandle("gbeanreftype2eadtype");
    
    /**
     * Gets the "ref-name" element
     */
    java.lang.String getRefName();
    
    /**
     * Gets (as xml) the "ref-name" element
     */
    org.apache.xmlbeans.XmlString xgetRefName();
    
    /**
     * Sets the "ref-name" element
     */
    void setRefName(java.lang.String refName);
    
    /**
     * Sets (as xml) the "ref-name" element
     */
    void xsetRefName(org.apache.xmlbeans.XmlString refName);
    
    /**
     * Gets array of all "ref-type" elements
     */
    java.lang.String[] getRefTypeArray();
    
    /**
     * Gets ith "ref-type" element
     */
    java.lang.String getRefTypeArray(int i);
    
    /**
     * Gets (as xml) array of all "ref-type" elements
     */
    org.apache.xmlbeans.XmlString[] xgetRefTypeArray();
    
    /**
     * Gets (as xml) ith "ref-type" element
     */
    org.apache.xmlbeans.XmlString xgetRefTypeArray(int i);
    
    /**
     * Returns number of "ref-type" element
     */
    int sizeOfRefTypeArray();
    
    /**
     * Sets array of all "ref-type" element
     */
    void setRefTypeArray(java.lang.String[] refTypeArray);
    
    /**
     * Sets ith "ref-type" element
     */
    void setRefTypeArray(int i, java.lang.String refType);
    
    /**
     * Sets (as xml) array of all "ref-type" element
     */
    void xsetRefTypeArray(org.apache.xmlbeans.XmlString[] refTypeArray);
    
    /**
     * Sets (as xml) ith "ref-type" element
     */
    void xsetRefTypeArray(int i, org.apache.xmlbeans.XmlString refType);
    
    /**
     * Inserts the value as the ith "ref-type" element
     */
    void insertRefType(int i, java.lang.String refType);
    
    /**
     * Appends the value as the last "ref-type" element
     */
    void addRefType(java.lang.String refType);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ref-type" element
     */
    org.apache.xmlbeans.XmlString insertNewRefType(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ref-type" element
     */
    org.apache.xmlbeans.XmlString addNewRefType();
    
    /**
     * Removes the ith "ref-type" element
     */
    void removeRefType(int i);
    
    /**
     * Gets array of all "pattern" elements
     */
    org.apache.geronimo.xbeans.geronimo.naming.GerPatternType[] getPatternArray();
    
    /**
     * Gets ith "pattern" element
     */
    org.apache.geronimo.xbeans.geronimo.naming.GerPatternType getPatternArray(int i);
    
    /**
     * Returns number of "pattern" element
     */
    int sizeOfPatternArray();
    
    /**
     * Sets array of all "pattern" element
     */
    void setPatternArray(org.apache.geronimo.xbeans.geronimo.naming.GerPatternType[] patternArray);
    
    /**
     * Sets ith "pattern" element
     */
    void setPatternArray(int i, org.apache.geronimo.xbeans.geronimo.naming.GerPatternType pattern);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "pattern" element
     */
    org.apache.geronimo.xbeans.geronimo.naming.GerPatternType insertNewPattern(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "pattern" element
     */
    org.apache.geronimo.xbeans.geronimo.naming.GerPatternType addNewPattern();
    
    /**
     * Removes the ith "pattern" element
     */
    void removePattern(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.apache.geronimo.xbeans.geronimo.naming.GerGbeanRefType newInstance() {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerGbeanRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.naming.GerGbeanRefType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerGbeanRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.apache.geronimo.xbeans.geronimo.naming.GerGbeanRefType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerGbeanRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.naming.GerGbeanRefType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerGbeanRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.apache.geronimo.xbeans.geronimo.naming.GerGbeanRefType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerGbeanRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.naming.GerGbeanRefType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerGbeanRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.apache.geronimo.xbeans.geronimo.naming.GerGbeanRefType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerGbeanRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.naming.GerGbeanRefType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerGbeanRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.apache.geronimo.xbeans.geronimo.naming.GerGbeanRefType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerGbeanRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.naming.GerGbeanRefType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerGbeanRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.apache.geronimo.xbeans.geronimo.naming.GerGbeanRefType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerGbeanRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.naming.GerGbeanRefType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerGbeanRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.apache.geronimo.xbeans.geronimo.naming.GerGbeanRefType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerGbeanRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.naming.GerGbeanRefType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerGbeanRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.apache.geronimo.xbeans.geronimo.naming.GerGbeanRefType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerGbeanRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.naming.GerGbeanRefType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerGbeanRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.geronimo.xbeans.geronimo.naming.GerGbeanRefType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerGbeanRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.geronimo.xbeans.geronimo.naming.GerGbeanRefType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.geronimo.xbeans.geronimo.naming.GerGbeanRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
