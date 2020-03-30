/*
 * XML Type:  connection-definitionType
 * Namespace: http://geronimo.apache.org/xml/ns/j2ee/connector-1.2
 * Java type: org.apache.geronimo.xbeans.connector.GerConnectionDefinitionType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.connector;


/**
 * An XML connection-definitionType(@http://geronimo.apache.org/xml/ns/j2ee/connector-1.2).
 *
 * This is a complex type.
 */
public interface GerConnectionDefinitionType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GerConnectionDefinitionType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE3FD554C5A45CC9CE15631ABA4AB98A7").resolveHandle("connectiondefinitiontype2da6type");
    
    /**
     * Gets the "connectionfactory-interface" element
     */
    java.lang.String getConnectionfactoryInterface();
    
    /**
     * Gets (as xml) the "connectionfactory-interface" element
     */
    org.apache.geronimo.xbeans.connector.GerFullyQualifiedClassType xgetConnectionfactoryInterface();
    
    /**
     * Sets the "connectionfactory-interface" element
     */
    void setConnectionfactoryInterface(java.lang.String connectionfactoryInterface);
    
    /**
     * Sets (as xml) the "connectionfactory-interface" element
     */
    void xsetConnectionfactoryInterface(org.apache.geronimo.xbeans.connector.GerFullyQualifiedClassType connectionfactoryInterface);
    
    /**
     * Gets array of all "connectiondefinition-instance" elements
     */
    org.apache.geronimo.xbeans.connector.GerConnectiondefinitionInstanceType[] getConnectiondefinitionInstanceArray();
    
    /**
     * Gets ith "connectiondefinition-instance" element
     */
    org.apache.geronimo.xbeans.connector.GerConnectiondefinitionInstanceType getConnectiondefinitionInstanceArray(int i);
    
    /**
     * Returns number of "connectiondefinition-instance" element
     */
    int sizeOfConnectiondefinitionInstanceArray();
    
    /**
     * Sets array of all "connectiondefinition-instance" element
     */
    void setConnectiondefinitionInstanceArray(org.apache.geronimo.xbeans.connector.GerConnectiondefinitionInstanceType[] connectiondefinitionInstanceArray);
    
    /**
     * Sets ith "connectiondefinition-instance" element
     */
    void setConnectiondefinitionInstanceArray(int i, org.apache.geronimo.xbeans.connector.GerConnectiondefinitionInstanceType connectiondefinitionInstance);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "connectiondefinition-instance" element
     */
    org.apache.geronimo.xbeans.connector.GerConnectiondefinitionInstanceType insertNewConnectiondefinitionInstance(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "connectiondefinition-instance" element
     */
    org.apache.geronimo.xbeans.connector.GerConnectiondefinitionInstanceType addNewConnectiondefinitionInstance();
    
    /**
     * Removes the ith "connectiondefinition-instance" element
     */
    void removeConnectiondefinitionInstance(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.apache.geronimo.xbeans.connector.GerConnectionDefinitionType newInstance() {
          return (org.apache.geronimo.xbeans.connector.GerConnectionDefinitionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.apache.geronimo.xbeans.connector.GerConnectionDefinitionType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.apache.geronimo.xbeans.connector.GerConnectionDefinitionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.apache.geronimo.xbeans.connector.GerConnectionDefinitionType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.connector.GerConnectionDefinitionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.apache.geronimo.xbeans.connector.GerConnectionDefinitionType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.connector.GerConnectionDefinitionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.apache.geronimo.xbeans.connector.GerConnectionDefinitionType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.connector.GerConnectionDefinitionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.apache.geronimo.xbeans.connector.GerConnectionDefinitionType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.connector.GerConnectionDefinitionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.apache.geronimo.xbeans.connector.GerConnectionDefinitionType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.connector.GerConnectionDefinitionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.apache.geronimo.xbeans.connector.GerConnectionDefinitionType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.connector.GerConnectionDefinitionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.apache.geronimo.xbeans.connector.GerConnectionDefinitionType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.connector.GerConnectionDefinitionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.apache.geronimo.xbeans.connector.GerConnectionDefinitionType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.connector.GerConnectionDefinitionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.apache.geronimo.xbeans.connector.GerConnectionDefinitionType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.connector.GerConnectionDefinitionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.apache.geronimo.xbeans.connector.GerConnectionDefinitionType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.connector.GerConnectionDefinitionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.apache.geronimo.xbeans.connector.GerConnectionDefinitionType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.connector.GerConnectionDefinitionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.apache.geronimo.xbeans.connector.GerConnectionDefinitionType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.connector.GerConnectionDefinitionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.apache.geronimo.xbeans.connector.GerConnectionDefinitionType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.connector.GerConnectionDefinitionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.apache.geronimo.xbeans.connector.GerConnectionDefinitionType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.connector.GerConnectionDefinitionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.geronimo.xbeans.connector.GerConnectionDefinitionType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.geronimo.xbeans.connector.GerConnectionDefinitionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.geronimo.xbeans.connector.GerConnectionDefinitionType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.geronimo.xbeans.connector.GerConnectionDefinitionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
