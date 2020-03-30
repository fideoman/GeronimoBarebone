/*
 * XML Type:  roleType
 * Namespace: http://geronimo.apache.org/xml/ns/security-1.2
 * Java type: org.apache.geronimo.xml.ns.security12.RoleType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xml.ns.security12;


/**
 * An XML roleType(@http://geronimo.apache.org/xml/ns/security-1.2).
 *
 * This is a complex type.
 */
public interface RoleType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RoleType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4769874CABA12AE1DF68A448E73C1B12").resolveHandle("roletypea7fatype");
    
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
     * Gets array of all "realm-principal" elements
     */
    org.apache.geronimo.xml.ns.security12.RealmPrincipalType[] getRealmPrincipalArray();
    
    /**
     * Gets ith "realm-principal" element
     */
    org.apache.geronimo.xml.ns.security12.RealmPrincipalType getRealmPrincipalArray(int i);
    
    /**
     * Returns number of "realm-principal" element
     */
    int sizeOfRealmPrincipalArray();
    
    /**
     * Sets array of all "realm-principal" element
     */
    void setRealmPrincipalArray(org.apache.geronimo.xml.ns.security12.RealmPrincipalType[] realmPrincipalArray);
    
    /**
     * Sets ith "realm-principal" element
     */
    void setRealmPrincipalArray(int i, org.apache.geronimo.xml.ns.security12.RealmPrincipalType realmPrincipal);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "realm-principal" element
     */
    org.apache.geronimo.xml.ns.security12.RealmPrincipalType insertNewRealmPrincipal(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "realm-principal" element
     */
    org.apache.geronimo.xml.ns.security12.RealmPrincipalType addNewRealmPrincipal();
    
    /**
     * Removes the ith "realm-principal" element
     */
    void removeRealmPrincipal(int i);
    
    /**
     * Gets array of all "login-domain-principal" elements
     */
    org.apache.geronimo.xml.ns.security12.LoginDomainPrincipalType[] getLoginDomainPrincipalArray();
    
    /**
     * Gets ith "login-domain-principal" element
     */
    org.apache.geronimo.xml.ns.security12.LoginDomainPrincipalType getLoginDomainPrincipalArray(int i);
    
    /**
     * Returns number of "login-domain-principal" element
     */
    int sizeOfLoginDomainPrincipalArray();
    
    /**
     * Sets array of all "login-domain-principal" element
     */
    void setLoginDomainPrincipalArray(org.apache.geronimo.xml.ns.security12.LoginDomainPrincipalType[] loginDomainPrincipalArray);
    
    /**
     * Sets ith "login-domain-principal" element
     */
    void setLoginDomainPrincipalArray(int i, org.apache.geronimo.xml.ns.security12.LoginDomainPrincipalType loginDomainPrincipal);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "login-domain-principal" element
     */
    org.apache.geronimo.xml.ns.security12.LoginDomainPrincipalType insertNewLoginDomainPrincipal(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "login-domain-principal" element
     */
    org.apache.geronimo.xml.ns.security12.LoginDomainPrincipalType addNewLoginDomainPrincipal();
    
    /**
     * Removes the ith "login-domain-principal" element
     */
    void removeLoginDomainPrincipal(int i);
    
    /**
     * Gets array of all "principal" elements
     */
    org.apache.geronimo.xml.ns.security12.PrincipalType[] getPrincipalArray();
    
    /**
     * Gets ith "principal" element
     */
    org.apache.geronimo.xml.ns.security12.PrincipalType getPrincipalArray(int i);
    
    /**
     * Returns number of "principal" element
     */
    int sizeOfPrincipalArray();
    
    /**
     * Sets array of all "principal" element
     */
    void setPrincipalArray(org.apache.geronimo.xml.ns.security12.PrincipalType[] principalArray);
    
    /**
     * Sets ith "principal" element
     */
    void setPrincipalArray(int i, org.apache.geronimo.xml.ns.security12.PrincipalType principal);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "principal" element
     */
    org.apache.geronimo.xml.ns.security12.PrincipalType insertNewPrincipal(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "principal" element
     */
    org.apache.geronimo.xml.ns.security12.PrincipalType addNewPrincipal();
    
    /**
     * Removes the ith "principal" element
     */
    void removePrincipal(int i);
    
    /**
     * Gets array of all "distinguished-name" elements
     */
    org.apache.geronimo.xml.ns.security12.DistinguishedNameType[] getDistinguishedNameArray();
    
    /**
     * Gets ith "distinguished-name" element
     */
    org.apache.geronimo.xml.ns.security12.DistinguishedNameType getDistinguishedNameArray(int i);
    
    /**
     * Returns number of "distinguished-name" element
     */
    int sizeOfDistinguishedNameArray();
    
    /**
     * Sets array of all "distinguished-name" element
     */
    void setDistinguishedNameArray(org.apache.geronimo.xml.ns.security12.DistinguishedNameType[] distinguishedNameArray);
    
    /**
     * Sets ith "distinguished-name" element
     */
    void setDistinguishedNameArray(int i, org.apache.geronimo.xml.ns.security12.DistinguishedNameType distinguishedName);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "distinguished-name" element
     */
    org.apache.geronimo.xml.ns.security12.DistinguishedNameType insertNewDistinguishedName(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "distinguished-name" element
     */
    org.apache.geronimo.xml.ns.security12.DistinguishedNameType addNewDistinguishedName();
    
    /**
     * Removes the ith "distinguished-name" element
     */
    void removeDistinguishedName(int i);
    
    /**
     * Gets the "role-name" attribute
     */
    java.lang.String getRoleName();
    
    /**
     * Gets (as xml) the "role-name" attribute
     */
    org.apache.xmlbeans.XmlString xgetRoleName();
    
    /**
     * Sets the "role-name" attribute
     */
    void setRoleName(java.lang.String roleName);
    
    /**
     * Sets (as xml) the "role-name" attribute
     */
    void xsetRoleName(org.apache.xmlbeans.XmlString roleName);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.apache.geronimo.xml.ns.security12.RoleType newInstance() {
          return (org.apache.geronimo.xml.ns.security12.RoleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.apache.geronimo.xml.ns.security12.RoleType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.apache.geronimo.xml.ns.security12.RoleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.apache.geronimo.xml.ns.security12.RoleType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xml.ns.security12.RoleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.apache.geronimo.xml.ns.security12.RoleType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xml.ns.security12.RoleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.apache.geronimo.xml.ns.security12.RoleType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xml.ns.security12.RoleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.apache.geronimo.xml.ns.security12.RoleType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xml.ns.security12.RoleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.apache.geronimo.xml.ns.security12.RoleType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xml.ns.security12.RoleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.apache.geronimo.xml.ns.security12.RoleType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xml.ns.security12.RoleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.apache.geronimo.xml.ns.security12.RoleType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xml.ns.security12.RoleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.apache.geronimo.xml.ns.security12.RoleType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xml.ns.security12.RoleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.apache.geronimo.xml.ns.security12.RoleType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xml.ns.security12.RoleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.apache.geronimo.xml.ns.security12.RoleType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xml.ns.security12.RoleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.apache.geronimo.xml.ns.security12.RoleType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xml.ns.security12.RoleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.apache.geronimo.xml.ns.security12.RoleType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xml.ns.security12.RoleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.apache.geronimo.xml.ns.security12.RoleType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xml.ns.security12.RoleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.apache.geronimo.xml.ns.security12.RoleType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xml.ns.security12.RoleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.geronimo.xml.ns.security12.RoleType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.geronimo.xml.ns.security12.RoleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.geronimo.xml.ns.security12.RoleType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.geronimo.xml.ns.security12.RoleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
