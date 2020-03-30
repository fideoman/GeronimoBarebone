/*
 * XML Type:  default-principalType
 * Namespace: http://geronimo.apache.org/xml/ns/security-1.2
 * Java type: org.apache.geronimo.xml.ns.security12.DefaultPrincipalType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xml.ns.security12;


/**
 * An XML default-principalType(@http://geronimo.apache.org/xml/ns/security-1.2).
 *
 * This is a complex type.
 */
public interface DefaultPrincipalType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DefaultPrincipalType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4769874CABA12AE1DF68A448E73C1B12").resolveHandle("defaultprincipaltypef7c0type");
    
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
     * Gets the "principal" element
     */
    org.apache.geronimo.xml.ns.security12.PrincipalType getPrincipal();
    
    /**
     * True if has "principal" element
     */
    boolean isSetPrincipal();
    
    /**
     * Sets the "principal" element
     */
    void setPrincipal(org.apache.geronimo.xml.ns.security12.PrincipalType principal);
    
    /**
     * Appends and returns a new empty "principal" element
     */
    org.apache.geronimo.xml.ns.security12.PrincipalType addNewPrincipal();
    
    /**
     * Unsets the "principal" element
     */
    void unsetPrincipal();
    
    /**
     * Gets the "login-domain-principal" element
     */
    org.apache.geronimo.xml.ns.security12.LoginDomainPrincipalType getLoginDomainPrincipal();
    
    /**
     * True if has "login-domain-principal" element
     */
    boolean isSetLoginDomainPrincipal();
    
    /**
     * Sets the "login-domain-principal" element
     */
    void setLoginDomainPrincipal(org.apache.geronimo.xml.ns.security12.LoginDomainPrincipalType loginDomainPrincipal);
    
    /**
     * Appends and returns a new empty "login-domain-principal" element
     */
    org.apache.geronimo.xml.ns.security12.LoginDomainPrincipalType addNewLoginDomainPrincipal();
    
    /**
     * Unsets the "login-domain-principal" element
     */
    void unsetLoginDomainPrincipal();
    
    /**
     * Gets the "realm-principal" element
     */
    org.apache.geronimo.xml.ns.security12.RealmPrincipalType getRealmPrincipal();
    
    /**
     * True if has "realm-principal" element
     */
    boolean isSetRealmPrincipal();
    
    /**
     * Sets the "realm-principal" element
     */
    void setRealmPrincipal(org.apache.geronimo.xml.ns.security12.RealmPrincipalType realmPrincipal);
    
    /**
     * Appends and returns a new empty "realm-principal" element
     */
    org.apache.geronimo.xml.ns.security12.RealmPrincipalType addNewRealmPrincipal();
    
    /**
     * Unsets the "realm-principal" element
     */
    void unsetRealmPrincipal();
    
    /**
     * Gets array of all "named-username-password-credential" elements
     */
    org.apache.geronimo.xml.ns.security12.NamedUsernamePasswordCredentialType[] getNamedUsernamePasswordCredentialArray();
    
    /**
     * Gets ith "named-username-password-credential" element
     */
    org.apache.geronimo.xml.ns.security12.NamedUsernamePasswordCredentialType getNamedUsernamePasswordCredentialArray(int i);
    
    /**
     * Returns number of "named-username-password-credential" element
     */
    int sizeOfNamedUsernamePasswordCredentialArray();
    
    /**
     * Sets array of all "named-username-password-credential" element
     */
    void setNamedUsernamePasswordCredentialArray(org.apache.geronimo.xml.ns.security12.NamedUsernamePasswordCredentialType[] namedUsernamePasswordCredentialArray);
    
    /**
     * Sets ith "named-username-password-credential" element
     */
    void setNamedUsernamePasswordCredentialArray(int i, org.apache.geronimo.xml.ns.security12.NamedUsernamePasswordCredentialType namedUsernamePasswordCredential);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "named-username-password-credential" element
     */
    org.apache.geronimo.xml.ns.security12.NamedUsernamePasswordCredentialType insertNewNamedUsernamePasswordCredential(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "named-username-password-credential" element
     */
    org.apache.geronimo.xml.ns.security12.NamedUsernamePasswordCredentialType addNewNamedUsernamePasswordCredential();
    
    /**
     * Removes the ith "named-username-password-credential" element
     */
    void removeNamedUsernamePasswordCredential(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.apache.geronimo.xml.ns.security12.DefaultPrincipalType newInstance() {
          return (org.apache.geronimo.xml.ns.security12.DefaultPrincipalType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.apache.geronimo.xml.ns.security12.DefaultPrincipalType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.apache.geronimo.xml.ns.security12.DefaultPrincipalType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.apache.geronimo.xml.ns.security12.DefaultPrincipalType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xml.ns.security12.DefaultPrincipalType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.apache.geronimo.xml.ns.security12.DefaultPrincipalType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xml.ns.security12.DefaultPrincipalType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.apache.geronimo.xml.ns.security12.DefaultPrincipalType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xml.ns.security12.DefaultPrincipalType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.apache.geronimo.xml.ns.security12.DefaultPrincipalType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xml.ns.security12.DefaultPrincipalType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.apache.geronimo.xml.ns.security12.DefaultPrincipalType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xml.ns.security12.DefaultPrincipalType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.apache.geronimo.xml.ns.security12.DefaultPrincipalType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xml.ns.security12.DefaultPrincipalType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.apache.geronimo.xml.ns.security12.DefaultPrincipalType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xml.ns.security12.DefaultPrincipalType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.apache.geronimo.xml.ns.security12.DefaultPrincipalType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xml.ns.security12.DefaultPrincipalType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.apache.geronimo.xml.ns.security12.DefaultPrincipalType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xml.ns.security12.DefaultPrincipalType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.apache.geronimo.xml.ns.security12.DefaultPrincipalType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xml.ns.security12.DefaultPrincipalType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.apache.geronimo.xml.ns.security12.DefaultPrincipalType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xml.ns.security12.DefaultPrincipalType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.apache.geronimo.xml.ns.security12.DefaultPrincipalType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xml.ns.security12.DefaultPrincipalType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.apache.geronimo.xml.ns.security12.DefaultPrincipalType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xml.ns.security12.DefaultPrincipalType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.apache.geronimo.xml.ns.security12.DefaultPrincipalType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xml.ns.security12.DefaultPrincipalType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.geronimo.xml.ns.security12.DefaultPrincipalType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.geronimo.xml.ns.security12.DefaultPrincipalType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.geronimo.xml.ns.security12.DefaultPrincipalType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.geronimo.xml.ns.security12.DefaultPrincipalType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
