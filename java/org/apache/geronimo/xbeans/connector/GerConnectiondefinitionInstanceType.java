/*
 * XML Type:  connectiondefinition-instanceType
 * Namespace: http://geronimo.apache.org/xml/ns/j2ee/connector-1.2
 * Java type: org.apache.geronimo.xbeans.connector.GerConnectiondefinitionInstanceType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.connector;


/**
 * An XML connectiondefinition-instanceType(@http://geronimo.apache.org/xml/ns/j2ee/connector-1.2).
 *
 * This is a complex type.
 */
public interface GerConnectiondefinitionInstanceType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GerConnectiondefinitionInstanceType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE3FD554C5A45CC9CE15631ABA4AB98A7").resolveHandle("connectiondefinitioninstancetyped2f7type");
    
    /**
     * Gets the "name" element
     */
    java.lang.String getName();
    
    /**
     * Gets (as xml) the "name" element
     */
    org.apache.xmlbeans.XmlString xgetName();
    
    /**
     * Sets the "name" element
     */
    void setName(java.lang.String name);
    
    /**
     * Sets (as xml) the "name" element
     */
    void xsetName(org.apache.xmlbeans.XmlString name);
    
    /**
     * Gets the "jndi-name" element
     */
    java.lang.String getJndiName();
    
    /**
     * Gets (as xml) the "jndi-name" element
     */
    org.apache.xmlbeans.XmlString xgetJndiName();
    
    /**
     * True if has "jndi-name" element
     */
    boolean isSetJndiName();
    
    /**
     * Sets the "jndi-name" element
     */
    void setJndiName(java.lang.String jndiName);
    
    /**
     * Sets (as xml) the "jndi-name" element
     */
    void xsetJndiName(org.apache.xmlbeans.XmlString jndiName);
    
    /**
     * Unsets the "jndi-name" element
     */
    void unsetJndiName();
    
    /**
     * Gets array of all "implemented-interface" elements
     */
    java.lang.String[] getImplementedInterfaceArray();
    
    /**
     * Gets ith "implemented-interface" element
     */
    java.lang.String getImplementedInterfaceArray(int i);
    
    /**
     * Gets (as xml) array of all "implemented-interface" elements
     */
    org.apache.geronimo.xbeans.connector.GerFullyQualifiedClassType[] xgetImplementedInterfaceArray();
    
    /**
     * Gets (as xml) ith "implemented-interface" element
     */
    org.apache.geronimo.xbeans.connector.GerFullyQualifiedClassType xgetImplementedInterfaceArray(int i);
    
    /**
     * Returns number of "implemented-interface" element
     */
    int sizeOfImplementedInterfaceArray();
    
    /**
     * Sets array of all "implemented-interface" element
     */
    void setImplementedInterfaceArray(java.lang.String[] implementedInterfaceArray);
    
    /**
     * Sets ith "implemented-interface" element
     */
    void setImplementedInterfaceArray(int i, java.lang.String implementedInterface);
    
    /**
     * Sets (as xml) array of all "implemented-interface" element
     */
    void xsetImplementedInterfaceArray(org.apache.geronimo.xbeans.connector.GerFullyQualifiedClassType[] implementedInterfaceArray);
    
    /**
     * Sets (as xml) ith "implemented-interface" element
     */
    void xsetImplementedInterfaceArray(int i, org.apache.geronimo.xbeans.connector.GerFullyQualifiedClassType implementedInterface);
    
    /**
     * Inserts the value as the ith "implemented-interface" element
     */
    void insertImplementedInterface(int i, java.lang.String implementedInterface);
    
    /**
     * Appends the value as the last "implemented-interface" element
     */
    void addImplementedInterface(java.lang.String implementedInterface);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "implemented-interface" element
     */
    org.apache.geronimo.xbeans.connector.GerFullyQualifiedClassType insertNewImplementedInterface(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "implemented-interface" element
     */
    org.apache.geronimo.xbeans.connector.GerFullyQualifiedClassType addNewImplementedInterface();
    
    /**
     * Removes the ith "implemented-interface" element
     */
    void removeImplementedInterface(int i);
    
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
     * Gets the "connectionmanager" element
     */
    org.apache.geronimo.xbeans.connector.GerConnectionmanagerType getConnectionmanager();
    
    /**
     * Sets the "connectionmanager" element
     */
    void setConnectionmanager(org.apache.geronimo.xbeans.connector.GerConnectionmanagerType connectionmanager);
    
    /**
     * Appends and returns a new empty "connectionmanager" element
     */
    org.apache.geronimo.xbeans.connector.GerConnectionmanagerType addNewConnectionmanager();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.apache.geronimo.xbeans.connector.GerConnectiondefinitionInstanceType newInstance() {
          return (org.apache.geronimo.xbeans.connector.GerConnectiondefinitionInstanceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.apache.geronimo.xbeans.connector.GerConnectiondefinitionInstanceType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.apache.geronimo.xbeans.connector.GerConnectiondefinitionInstanceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.apache.geronimo.xbeans.connector.GerConnectiondefinitionInstanceType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.connector.GerConnectiondefinitionInstanceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.apache.geronimo.xbeans.connector.GerConnectiondefinitionInstanceType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.connector.GerConnectiondefinitionInstanceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.apache.geronimo.xbeans.connector.GerConnectiondefinitionInstanceType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.connector.GerConnectiondefinitionInstanceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.apache.geronimo.xbeans.connector.GerConnectiondefinitionInstanceType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.connector.GerConnectiondefinitionInstanceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.apache.geronimo.xbeans.connector.GerConnectiondefinitionInstanceType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.connector.GerConnectiondefinitionInstanceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.apache.geronimo.xbeans.connector.GerConnectiondefinitionInstanceType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.connector.GerConnectiondefinitionInstanceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.apache.geronimo.xbeans.connector.GerConnectiondefinitionInstanceType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.connector.GerConnectiondefinitionInstanceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.apache.geronimo.xbeans.connector.GerConnectiondefinitionInstanceType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.connector.GerConnectiondefinitionInstanceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.apache.geronimo.xbeans.connector.GerConnectiondefinitionInstanceType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.connector.GerConnectiondefinitionInstanceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.apache.geronimo.xbeans.connector.GerConnectiondefinitionInstanceType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.connector.GerConnectiondefinitionInstanceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.apache.geronimo.xbeans.connector.GerConnectiondefinitionInstanceType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.connector.GerConnectiondefinitionInstanceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.apache.geronimo.xbeans.connector.GerConnectiondefinitionInstanceType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.connector.GerConnectiondefinitionInstanceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.apache.geronimo.xbeans.connector.GerConnectiondefinitionInstanceType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.connector.GerConnectiondefinitionInstanceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.apache.geronimo.xbeans.connector.GerConnectiondefinitionInstanceType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.connector.GerConnectiondefinitionInstanceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.geronimo.xbeans.connector.GerConnectiondefinitionInstanceType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.geronimo.xbeans.connector.GerConnectiondefinitionInstanceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.geronimo.xbeans.connector.GerConnectiondefinitionInstanceType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.geronimo.xbeans.connector.GerConnectiondefinitionInstanceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
