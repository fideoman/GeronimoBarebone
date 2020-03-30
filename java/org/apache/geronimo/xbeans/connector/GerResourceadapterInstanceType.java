/*
 * XML Type:  resourceadapter-instanceType
 * Namespace: http://geronimo.apache.org/xml/ns/j2ee/connector-1.2
 * Java type: org.apache.geronimo.xbeans.connector.GerResourceadapterInstanceType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.connector;


/**
 * An XML resourceadapter-instanceType(@http://geronimo.apache.org/xml/ns/j2ee/connector-1.2).
 *
 * This is a complex type.
 */
public interface GerResourceadapterInstanceType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GerResourceadapterInstanceType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE3FD554C5A45CC9CE15631ABA4AB98A7").resolveHandle("resourceadapterinstancetype1ad5type");
    
    /**
     * Gets the "resourceadapter-name" element
     */
    java.lang.String getResourceadapterName();
    
    /**
     * Gets (as xml) the "resourceadapter-name" element
     */
    org.apache.xmlbeans.XmlString xgetResourceadapterName();
    
    /**
     * Sets the "resourceadapter-name" element
     */
    void setResourceadapterName(java.lang.String resourceadapterName);
    
    /**
     * Sets (as xml) the "resourceadapter-name" element
     */
    void xsetResourceadapterName(org.apache.xmlbeans.XmlString resourceadapterName);
    
    /**
     * Gets array of all "config-property-setting" elements
     */
    org.apache.geronimo.xbeans.connector.GerConfigPropertySettingType[] getConfigPropertySettingArray();
    
    /**
     * Gets ith "config-property-setting" element
     */
    org.apache.geronimo.xbeans.connector.GerConfigPropertySettingType getConfigPropertySettingArray(int i);
    
    /**
     * Returns number of "config-property-setting" element
     */
    int sizeOfConfigPropertySettingArray();
    
    /**
     * Sets array of all "config-property-setting" element
     */
    void setConfigPropertySettingArray(org.apache.geronimo.xbeans.connector.GerConfigPropertySettingType[] configPropertySettingArray);
    
    /**
     * Sets ith "config-property-setting" element
     */
    void setConfigPropertySettingArray(int i, org.apache.geronimo.xbeans.connector.GerConfigPropertySettingType configPropertySetting);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "config-property-setting" element
     */
    org.apache.geronimo.xbeans.connector.GerConfigPropertySettingType insertNewConfigPropertySetting(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "config-property-setting" element
     */
    org.apache.geronimo.xbeans.connector.GerConfigPropertySettingType addNewConfigPropertySetting();
    
    /**
     * Removes the ith "config-property-setting" element
     */
    void removeConfigPropertySetting(int i);
    
    /**
     * Gets the "workmanager" element
     */
    org.apache.geronimo.xbeans.geronimo.naming.GerGbeanLocatorType getWorkmanager();
    
    /**
     * Sets the "workmanager" element
     */
    void setWorkmanager(org.apache.geronimo.xbeans.geronimo.naming.GerGbeanLocatorType workmanager);
    
    /**
     * Appends and returns a new empty "workmanager" element
     */
    org.apache.geronimo.xbeans.geronimo.naming.GerGbeanLocatorType addNewWorkmanager();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.apache.geronimo.xbeans.connector.GerResourceadapterInstanceType newInstance() {
          return (org.apache.geronimo.xbeans.connector.GerResourceadapterInstanceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.apache.geronimo.xbeans.connector.GerResourceadapterInstanceType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.apache.geronimo.xbeans.connector.GerResourceadapterInstanceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.apache.geronimo.xbeans.connector.GerResourceadapterInstanceType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.connector.GerResourceadapterInstanceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.apache.geronimo.xbeans.connector.GerResourceadapterInstanceType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.connector.GerResourceadapterInstanceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.apache.geronimo.xbeans.connector.GerResourceadapterInstanceType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.connector.GerResourceadapterInstanceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.apache.geronimo.xbeans.connector.GerResourceadapterInstanceType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.connector.GerResourceadapterInstanceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.apache.geronimo.xbeans.connector.GerResourceadapterInstanceType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.connector.GerResourceadapterInstanceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.apache.geronimo.xbeans.connector.GerResourceadapterInstanceType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.connector.GerResourceadapterInstanceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.apache.geronimo.xbeans.connector.GerResourceadapterInstanceType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.connector.GerResourceadapterInstanceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.apache.geronimo.xbeans.connector.GerResourceadapterInstanceType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.connector.GerResourceadapterInstanceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.apache.geronimo.xbeans.connector.GerResourceadapterInstanceType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.connector.GerResourceadapterInstanceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.apache.geronimo.xbeans.connector.GerResourceadapterInstanceType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.connector.GerResourceadapterInstanceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.apache.geronimo.xbeans.connector.GerResourceadapterInstanceType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.connector.GerResourceadapterInstanceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.apache.geronimo.xbeans.connector.GerResourceadapterInstanceType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.connector.GerResourceadapterInstanceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.apache.geronimo.xbeans.connector.GerResourceadapterInstanceType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.connector.GerResourceadapterInstanceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.apache.geronimo.xbeans.connector.GerResourceadapterInstanceType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.connector.GerResourceadapterInstanceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.geronimo.xbeans.connector.GerResourceadapterInstanceType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.geronimo.xbeans.connector.GerResourceadapterInstanceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.geronimo.xbeans.connector.GerResourceadapterInstanceType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.geronimo.xbeans.connector.GerResourceadapterInstanceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
