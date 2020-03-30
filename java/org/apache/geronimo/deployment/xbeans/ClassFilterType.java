/*
 * XML Type:  classFilterType
 * Namespace: http://geronimo.apache.org/xml/ns/deployment-1.2
 * Java type: org.apache.geronimo.deployment.xbeans.ClassFilterType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.deployment.xbeans;


/**
 * An XML classFilterType(@http://geronimo.apache.org/xml/ns/deployment-1.2).
 *
 * This is a complex type.
 */
public interface ClassFilterType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ClassFilterType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1D00E640B90252F7DCFA98454B9E9CE2").resolveHandle("classfiltertypeead7type");
    
    /**
     * Gets array of all "filter" elements
     */
    java.lang.String[] getFilterArray();
    
    /**
     * Gets ith "filter" element
     */
    java.lang.String getFilterArray(int i);
    
    /**
     * Gets (as xml) array of all "filter" elements
     */
    org.apache.xmlbeans.XmlString[] xgetFilterArray();
    
    /**
     * Gets (as xml) ith "filter" element
     */
    org.apache.xmlbeans.XmlString xgetFilterArray(int i);
    
    /**
     * Returns number of "filter" element
     */
    int sizeOfFilterArray();
    
    /**
     * Sets array of all "filter" element
     */
    void setFilterArray(java.lang.String[] filterArray);
    
    /**
     * Sets ith "filter" element
     */
    void setFilterArray(int i, java.lang.String filter);
    
    /**
     * Sets (as xml) array of all "filter" element
     */
    void xsetFilterArray(org.apache.xmlbeans.XmlString[] filterArray);
    
    /**
     * Sets (as xml) ith "filter" element
     */
    void xsetFilterArray(int i, org.apache.xmlbeans.XmlString filter);
    
    /**
     * Inserts the value as the ith "filter" element
     */
    void insertFilter(int i, java.lang.String filter);
    
    /**
     * Appends the value as the last "filter" element
     */
    void addFilter(java.lang.String filter);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "filter" element
     */
    org.apache.xmlbeans.XmlString insertNewFilter(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "filter" element
     */
    org.apache.xmlbeans.XmlString addNewFilter();
    
    /**
     * Removes the ith "filter" element
     */
    void removeFilter(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.apache.geronimo.deployment.xbeans.ClassFilterType newInstance() {
          return (org.apache.geronimo.deployment.xbeans.ClassFilterType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.apache.geronimo.deployment.xbeans.ClassFilterType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.apache.geronimo.deployment.xbeans.ClassFilterType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.apache.geronimo.deployment.xbeans.ClassFilterType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.deployment.xbeans.ClassFilterType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.apache.geronimo.deployment.xbeans.ClassFilterType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.deployment.xbeans.ClassFilterType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.apache.geronimo.deployment.xbeans.ClassFilterType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.deployment.xbeans.ClassFilterType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.apache.geronimo.deployment.xbeans.ClassFilterType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.deployment.xbeans.ClassFilterType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.apache.geronimo.deployment.xbeans.ClassFilterType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.deployment.xbeans.ClassFilterType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.apache.geronimo.deployment.xbeans.ClassFilterType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.deployment.xbeans.ClassFilterType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.apache.geronimo.deployment.xbeans.ClassFilterType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.deployment.xbeans.ClassFilterType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.apache.geronimo.deployment.xbeans.ClassFilterType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.deployment.xbeans.ClassFilterType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.apache.geronimo.deployment.xbeans.ClassFilterType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.deployment.xbeans.ClassFilterType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.apache.geronimo.deployment.xbeans.ClassFilterType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.deployment.xbeans.ClassFilterType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.apache.geronimo.deployment.xbeans.ClassFilterType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.deployment.xbeans.ClassFilterType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.apache.geronimo.deployment.xbeans.ClassFilterType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.deployment.xbeans.ClassFilterType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.apache.geronimo.deployment.xbeans.ClassFilterType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.deployment.xbeans.ClassFilterType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.apache.geronimo.deployment.xbeans.ClassFilterType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.deployment.xbeans.ClassFilterType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.geronimo.deployment.xbeans.ClassFilterType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.geronimo.deployment.xbeans.ClassFilterType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.geronimo.deployment.xbeans.ClassFilterType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.geronimo.deployment.xbeans.ClassFilterType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
