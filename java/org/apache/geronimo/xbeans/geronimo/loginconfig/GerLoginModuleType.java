/*
 * XML Type:  login-moduleType
 * Namespace: http://geronimo.apache.org/xml/ns/loginconfig-2.0
 * Java type: org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginModuleType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.geronimo.loginconfig;


/**
 * An XML login-moduleType(@http://geronimo.apache.org/xml/ns/loginconfig-2.0).
 *
 * This is a complex type.
 */
public interface GerLoginModuleType extends org.apache.geronimo.xbeans.geronimo.loginconfig.GerAbstractLoginModuleType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GerLoginModuleType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4769874CABA12AE1DF68A448E73C1B12").resolveHandle("loginmoduletype395atype");
    
    /**
     * Gets the "login-domain-name" element
     */
    java.lang.String getLoginDomainName();
    
    /**
     * Gets (as xml) the "login-domain-name" element
     */
    org.apache.xmlbeans.XmlString xgetLoginDomainName();
    
    /**
     * Sets the "login-domain-name" element
     */
    void setLoginDomainName(java.lang.String loginDomainName);
    
    /**
     * Sets (as xml) the "login-domain-name" element
     */
    void xsetLoginDomainName(org.apache.xmlbeans.XmlString loginDomainName);
    
    /**
     * Gets the "login-module-class" element
     */
    java.lang.String getLoginModuleClass();
    
    /**
     * Gets (as xml) the "login-module-class" element
     */
    org.apache.xmlbeans.XmlString xgetLoginModuleClass();
    
    /**
     * Sets the "login-module-class" element
     */
    void setLoginModuleClass(java.lang.String loginModuleClass);
    
    /**
     * Sets (as xml) the "login-module-class" element
     */
    void xsetLoginModuleClass(org.apache.xmlbeans.XmlString loginModuleClass);
    
    /**
     * Gets array of all "option" elements
     */
    org.apache.geronimo.xbeans.geronimo.loginconfig.GerOptionType[] getOptionArray();
    
    /**
     * Gets ith "option" element
     */
    org.apache.geronimo.xbeans.geronimo.loginconfig.GerOptionType getOptionArray(int i);
    
    /**
     * Returns number of "option" element
     */
    int sizeOfOptionArray();
    
    /**
     * Sets array of all "option" element
     */
    void setOptionArray(org.apache.geronimo.xbeans.geronimo.loginconfig.GerOptionType[] optionArray);
    
    /**
     * Sets ith "option" element
     */
    void setOptionArray(int i, org.apache.geronimo.xbeans.geronimo.loginconfig.GerOptionType option);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "option" element
     */
    org.apache.geronimo.xbeans.geronimo.loginconfig.GerOptionType insertNewOption(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "option" element
     */
    org.apache.geronimo.xbeans.geronimo.loginconfig.GerOptionType addNewOption();
    
    /**
     * Removes the ith "option" element
     */
    void removeOption(int i);
    
    /**
     * Gets array of all "xml-option" elements
     */
    org.apache.geronimo.deployment.xbeans.XmlAttributeType[] getXmlOptionArray();
    
    /**
     * Gets ith "xml-option" element
     */
    org.apache.geronimo.deployment.xbeans.XmlAttributeType getXmlOptionArray(int i);
    
    /**
     * Returns number of "xml-option" element
     */
    int sizeOfXmlOptionArray();
    
    /**
     * Sets array of all "xml-option" element
     */
    void setXmlOptionArray(org.apache.geronimo.deployment.xbeans.XmlAttributeType[] xmlOptionArray);
    
    /**
     * Sets ith "xml-option" element
     */
    void setXmlOptionArray(int i, org.apache.geronimo.deployment.xbeans.XmlAttributeType xmlOption);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "xml-option" element
     */
    org.apache.geronimo.deployment.xbeans.XmlAttributeType insertNewXmlOption(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "xml-option" element
     */
    org.apache.geronimo.deployment.xbeans.XmlAttributeType addNewXmlOption();
    
    /**
     * Removes the ith "xml-option" element
     */
    void removeXmlOption(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginModuleType newInstance() {
          return (org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginModuleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginModuleType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginModuleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginModuleType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginModuleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginModuleType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginModuleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginModuleType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginModuleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginModuleType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginModuleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginModuleType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginModuleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginModuleType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginModuleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginModuleType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginModuleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginModuleType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginModuleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginModuleType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginModuleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginModuleType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginModuleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginModuleType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginModuleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginModuleType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginModuleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginModuleType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginModuleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginModuleType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginModuleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginModuleType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginModuleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginModuleType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginModuleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
