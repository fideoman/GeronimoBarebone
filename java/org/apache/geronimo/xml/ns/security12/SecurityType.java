/*
 * XML Type:  securityType
 * Namespace: http://geronimo.apache.org/xml/ns/security-1.2
 * Java type: org.apache.geronimo.xml.ns.security12.SecurityType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xml.ns.security12;


/**
 * An XML securityType(@http://geronimo.apache.org/xml/ns/security-1.2).
 *
 * This is a complex type.
 */
public interface SecurityType extends org.apache.geronimo.xbeans.geronimo.j2ee.GerAbstractSecurityType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SecurityType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4769874CABA12AE1DF68A448E73C1B12").resolveHandle("securitytype2d70type");
    
    /**
     * Gets array of all "description" elements
     */
    org.apache.geronimo.xml.ns.security12.DescriptionType[] getDescriptionArray();
    
    /**
     * Gets ith "description" element
     */
    org.apache.geronimo.xml.ns.security12.DescriptionType getDescriptionArray(int i);
    
    /**
     * Returns number of "description" element
     */
    int sizeOfDescriptionArray();
    
    /**
     * Sets array of all "description" element
     */
    void setDescriptionArray(org.apache.geronimo.xml.ns.security12.DescriptionType[] descriptionArray);
    
    /**
     * Sets ith "description" element
     */
    void setDescriptionArray(int i, org.apache.geronimo.xml.ns.security12.DescriptionType description);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "description" element
     */
    org.apache.geronimo.xml.ns.security12.DescriptionType insertNewDescription(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "description" element
     */
    org.apache.geronimo.xml.ns.security12.DescriptionType addNewDescription();
    
    /**
     * Removes the ith "description" element
     */
    void removeDescription(int i);
    
    /**
     * Gets the "default-principal" element
     */
    org.apache.geronimo.xml.ns.security12.DefaultPrincipalType getDefaultPrincipal();
    
    /**
     * Sets the "default-principal" element
     */
    void setDefaultPrincipal(org.apache.geronimo.xml.ns.security12.DefaultPrincipalType defaultPrincipal);
    
    /**
     * Appends and returns a new empty "default-principal" element
     */
    org.apache.geronimo.xml.ns.security12.DefaultPrincipalType addNewDefaultPrincipal();
    
    /**
     * Gets the "role-mappings" element
     */
    org.apache.geronimo.xml.ns.security12.RoleMappingsType getRoleMappings();
    
    /**
     * True if has "role-mappings" element
     */
    boolean isSetRoleMappings();
    
    /**
     * Sets the "role-mappings" element
     */
    void setRoleMappings(org.apache.geronimo.xml.ns.security12.RoleMappingsType roleMappings);
    
    /**
     * Appends and returns a new empty "role-mappings" element
     */
    org.apache.geronimo.xml.ns.security12.RoleMappingsType addNewRoleMappings();
    
    /**
     * Unsets the "role-mappings" element
     */
    void unsetRoleMappings();
    
    /**
     * Gets the "doas-current-caller" attribute
     */
    boolean getDoasCurrentCaller();
    
    /**
     * Gets (as xml) the "doas-current-caller" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetDoasCurrentCaller();
    
    /**
     * True if has "doas-current-caller" attribute
     */
    boolean isSetDoasCurrentCaller();
    
    /**
     * Sets the "doas-current-caller" attribute
     */
    void setDoasCurrentCaller(boolean doasCurrentCaller);
    
    /**
     * Sets (as xml) the "doas-current-caller" attribute
     */
    void xsetDoasCurrentCaller(org.apache.xmlbeans.XmlBoolean doasCurrentCaller);
    
    /**
     * Unsets the "doas-current-caller" attribute
     */
    void unsetDoasCurrentCaller();
    
    /**
     * Gets the "use-context-handler" attribute
     */
    boolean getUseContextHandler();
    
    /**
     * Gets (as xml) the "use-context-handler" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetUseContextHandler();
    
    /**
     * True if has "use-context-handler" attribute
     */
    boolean isSetUseContextHandler();
    
    /**
     * Sets the "use-context-handler" attribute
     */
    void setUseContextHandler(boolean useContextHandler);
    
    /**
     * Sets (as xml) the "use-context-handler" attribute
     */
    void xsetUseContextHandler(org.apache.xmlbeans.XmlBoolean useContextHandler);
    
    /**
     * Unsets the "use-context-handler" attribute
     */
    void unsetUseContextHandler();
    
    /**
     * Gets the "default-role" attribute
     */
    java.lang.String getDefaultRole();
    
    /**
     * Gets (as xml) the "default-role" attribute
     */
    org.apache.xmlbeans.XmlString xgetDefaultRole();
    
    /**
     * True if has "default-role" attribute
     */
    boolean isSetDefaultRole();
    
    /**
     * Sets the "default-role" attribute
     */
    void setDefaultRole(java.lang.String defaultRole);
    
    /**
     * Sets (as xml) the "default-role" attribute
     */
    void xsetDefaultRole(org.apache.xmlbeans.XmlString defaultRole);
    
    /**
     * Unsets the "default-role" attribute
     */
    void unsetDefaultRole();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.apache.geronimo.xml.ns.security12.SecurityType newInstance() {
          return (org.apache.geronimo.xml.ns.security12.SecurityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.apache.geronimo.xml.ns.security12.SecurityType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.apache.geronimo.xml.ns.security12.SecurityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.apache.geronimo.xml.ns.security12.SecurityType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xml.ns.security12.SecurityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.apache.geronimo.xml.ns.security12.SecurityType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xml.ns.security12.SecurityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.apache.geronimo.xml.ns.security12.SecurityType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xml.ns.security12.SecurityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.apache.geronimo.xml.ns.security12.SecurityType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xml.ns.security12.SecurityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.apache.geronimo.xml.ns.security12.SecurityType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xml.ns.security12.SecurityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.apache.geronimo.xml.ns.security12.SecurityType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xml.ns.security12.SecurityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.apache.geronimo.xml.ns.security12.SecurityType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xml.ns.security12.SecurityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.apache.geronimo.xml.ns.security12.SecurityType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xml.ns.security12.SecurityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.apache.geronimo.xml.ns.security12.SecurityType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xml.ns.security12.SecurityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.apache.geronimo.xml.ns.security12.SecurityType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xml.ns.security12.SecurityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.apache.geronimo.xml.ns.security12.SecurityType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xml.ns.security12.SecurityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.apache.geronimo.xml.ns.security12.SecurityType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xml.ns.security12.SecurityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.apache.geronimo.xml.ns.security12.SecurityType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xml.ns.security12.SecurityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.apache.geronimo.xml.ns.security12.SecurityType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xml.ns.security12.SecurityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.geronimo.xml.ns.security12.SecurityType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.geronimo.xml.ns.security12.SecurityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.geronimo.xml.ns.security12.SecurityType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.geronimo.xml.ns.security12.SecurityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
