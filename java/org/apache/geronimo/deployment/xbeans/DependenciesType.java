/*
 * XML Type:  dependenciesType
 * Namespace: http://geronimo.apache.org/xml/ns/deployment-1.2
 * Java type: org.apache.geronimo.deployment.xbeans.DependenciesType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.deployment.xbeans;


/**
 * An XML dependenciesType(@http://geronimo.apache.org/xml/ns/deployment-1.2).
 *
 * This is a complex type.
 */
public interface DependenciesType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DependenciesType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1D00E640B90252F7DCFA98454B9E9CE2").resolveHandle("dependenciestype3aactype");
    
    /**
     * Gets array of all "dependency" elements
     */
    org.apache.geronimo.deployment.xbeans.DependencyType[] getDependencyArray();
    
    /**
     * Gets ith "dependency" element
     */
    org.apache.geronimo.deployment.xbeans.DependencyType getDependencyArray(int i);
    
    /**
     * Returns number of "dependency" element
     */
    int sizeOfDependencyArray();
    
    /**
     * Sets array of all "dependency" element
     */
    void setDependencyArray(org.apache.geronimo.deployment.xbeans.DependencyType[] dependencyArray);
    
    /**
     * Sets ith "dependency" element
     */
    void setDependencyArray(int i, org.apache.geronimo.deployment.xbeans.DependencyType dependency);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "dependency" element
     */
    org.apache.geronimo.deployment.xbeans.DependencyType insertNewDependency(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "dependency" element
     */
    org.apache.geronimo.deployment.xbeans.DependencyType addNewDependency();
    
    /**
     * Removes the ith "dependency" element
     */
    void removeDependency(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.apache.geronimo.deployment.xbeans.DependenciesType newInstance() {
          return (org.apache.geronimo.deployment.xbeans.DependenciesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.apache.geronimo.deployment.xbeans.DependenciesType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.apache.geronimo.deployment.xbeans.DependenciesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.apache.geronimo.deployment.xbeans.DependenciesType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.deployment.xbeans.DependenciesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.apache.geronimo.deployment.xbeans.DependenciesType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.deployment.xbeans.DependenciesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.apache.geronimo.deployment.xbeans.DependenciesType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.deployment.xbeans.DependenciesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.apache.geronimo.deployment.xbeans.DependenciesType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.deployment.xbeans.DependenciesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.apache.geronimo.deployment.xbeans.DependenciesType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.deployment.xbeans.DependenciesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.apache.geronimo.deployment.xbeans.DependenciesType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.deployment.xbeans.DependenciesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.apache.geronimo.deployment.xbeans.DependenciesType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.deployment.xbeans.DependenciesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.apache.geronimo.deployment.xbeans.DependenciesType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.deployment.xbeans.DependenciesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.apache.geronimo.deployment.xbeans.DependenciesType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.deployment.xbeans.DependenciesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.apache.geronimo.deployment.xbeans.DependenciesType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.deployment.xbeans.DependenciesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.apache.geronimo.deployment.xbeans.DependenciesType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.deployment.xbeans.DependenciesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.apache.geronimo.deployment.xbeans.DependenciesType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.deployment.xbeans.DependenciesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.apache.geronimo.deployment.xbeans.DependenciesType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.deployment.xbeans.DependenciesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.apache.geronimo.deployment.xbeans.DependenciesType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.deployment.xbeans.DependenciesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.geronimo.deployment.xbeans.DependenciesType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.geronimo.deployment.xbeans.DependenciesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.geronimo.deployment.xbeans.DependenciesType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.geronimo.deployment.xbeans.DependenciesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
