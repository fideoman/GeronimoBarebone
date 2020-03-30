/*
 * XML Type:  roleType
 * Namespace: http://geronimo.apache.org/xml/ns/security-2.0
 * Java type: org.apache.geronimo.xbeans.geronimo.security.GerRoleType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.geronimo.security;


/**
 * An XML roleType(@http://geronimo.apache.org/xml/ns/security-2.0).
 *
 * This is a complex type.
 */
public interface GerRoleType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GerRoleType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4769874CABA12AE1DF68A448E73C1B12").resolveHandle("roletypeabb9type");
    
    /**
     * Gets array of all "description" elements
     */
    org.apache.geronimo.xbeans.geronimo.security.GerDescriptionType[] getDescriptionArray();
    
    /**
     * Gets ith "description" element
     */
    org.apache.geronimo.xbeans.geronimo.security.GerDescriptionType getDescriptionArray(int i);
    
    /**
     * Returns number of "description" element
     */
    int sizeOfDescriptionArray();
    
    /**
     * Sets array of all "description" element
     */
    void setDescriptionArray(org.apache.geronimo.xbeans.geronimo.security.GerDescriptionType[] descriptionArray);
    
    /**
     * Sets ith "description" element
     */
    void setDescriptionArray(int i, org.apache.geronimo.xbeans.geronimo.security.GerDescriptionType description);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "description" element
     */
    org.apache.geronimo.xbeans.geronimo.security.GerDescriptionType insertNewDescription(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "description" element
     */
    org.apache.geronimo.xbeans.geronimo.security.GerDescriptionType addNewDescription();
    
    /**
     * Removes the ith "description" element
     */
    void removeDescription(int i);
    
    /**
     * Gets the "run-as-subject" element
     */
    org.apache.geronimo.xbeans.geronimo.security.GerSubjectInfoType getRunAsSubject();
    
    /**
     * True if has "run-as-subject" element
     */
    boolean isSetRunAsSubject();
    
    /**
     * Sets the "run-as-subject" element
     */
    void setRunAsSubject(org.apache.geronimo.xbeans.geronimo.security.GerSubjectInfoType runAsSubject);
    
    /**
     * Appends and returns a new empty "run-as-subject" element
     */
    org.apache.geronimo.xbeans.geronimo.security.GerSubjectInfoType addNewRunAsSubject();
    
    /**
     * Unsets the "run-as-subject" element
     */
    void unsetRunAsSubject();
    
    /**
     * Gets array of all "realm-principal" elements
     */
    org.apache.geronimo.xbeans.geronimo.security.GerRealmPrincipalType[] getRealmPrincipalArray();
    
    /**
     * Gets ith "realm-principal" element
     */
    org.apache.geronimo.xbeans.geronimo.security.GerRealmPrincipalType getRealmPrincipalArray(int i);
    
    /**
     * Returns number of "realm-principal" element
     */
    int sizeOfRealmPrincipalArray();
    
    /**
     * Sets array of all "realm-principal" element
     */
    void setRealmPrincipalArray(org.apache.geronimo.xbeans.geronimo.security.GerRealmPrincipalType[] realmPrincipalArray);
    
    /**
     * Sets ith "realm-principal" element
     */
    void setRealmPrincipalArray(int i, org.apache.geronimo.xbeans.geronimo.security.GerRealmPrincipalType realmPrincipal);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "realm-principal" element
     */
    org.apache.geronimo.xbeans.geronimo.security.GerRealmPrincipalType insertNewRealmPrincipal(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "realm-principal" element
     */
    org.apache.geronimo.xbeans.geronimo.security.GerRealmPrincipalType addNewRealmPrincipal();
    
    /**
     * Removes the ith "realm-principal" element
     */
    void removeRealmPrincipal(int i);
    
    /**
     * Gets array of all "login-domain-principal" elements
     */
    org.apache.geronimo.xbeans.geronimo.security.GerLoginDomainPrincipalType[] getLoginDomainPrincipalArray();
    
    /**
     * Gets ith "login-domain-principal" element
     */
    org.apache.geronimo.xbeans.geronimo.security.GerLoginDomainPrincipalType getLoginDomainPrincipalArray(int i);
    
    /**
     * Returns number of "login-domain-principal" element
     */
    int sizeOfLoginDomainPrincipalArray();
    
    /**
     * Sets array of all "login-domain-principal" element
     */
    void setLoginDomainPrincipalArray(org.apache.geronimo.xbeans.geronimo.security.GerLoginDomainPrincipalType[] loginDomainPrincipalArray);
    
    /**
     * Sets ith "login-domain-principal" element
     */
    void setLoginDomainPrincipalArray(int i, org.apache.geronimo.xbeans.geronimo.security.GerLoginDomainPrincipalType loginDomainPrincipal);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "login-domain-principal" element
     */
    org.apache.geronimo.xbeans.geronimo.security.GerLoginDomainPrincipalType insertNewLoginDomainPrincipal(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "login-domain-principal" element
     */
    org.apache.geronimo.xbeans.geronimo.security.GerLoginDomainPrincipalType addNewLoginDomainPrincipal();
    
    /**
     * Removes the ith "login-domain-principal" element
     */
    void removeLoginDomainPrincipal(int i);
    
    /**
     * Gets array of all "principal" elements
     */
    org.apache.geronimo.xbeans.geronimo.security.GerPrincipalType[] getPrincipalArray();
    
    /**
     * Gets ith "principal" element
     */
    org.apache.geronimo.xbeans.geronimo.security.GerPrincipalType getPrincipalArray(int i);
    
    /**
     * Returns number of "principal" element
     */
    int sizeOfPrincipalArray();
    
    /**
     * Sets array of all "principal" element
     */
    void setPrincipalArray(org.apache.geronimo.xbeans.geronimo.security.GerPrincipalType[] principalArray);
    
    /**
     * Sets ith "principal" element
     */
    void setPrincipalArray(int i, org.apache.geronimo.xbeans.geronimo.security.GerPrincipalType principal);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "principal" element
     */
    org.apache.geronimo.xbeans.geronimo.security.GerPrincipalType insertNewPrincipal(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "principal" element
     */
    org.apache.geronimo.xbeans.geronimo.security.GerPrincipalType addNewPrincipal();
    
    /**
     * Removes the ith "principal" element
     */
    void removePrincipal(int i);
    
    /**
     * Gets array of all "distinguished-name" elements
     */
    org.apache.geronimo.xbeans.geronimo.security.GerDistinguishedNameType[] getDistinguishedNameArray();
    
    /**
     * Gets ith "distinguished-name" element
     */
    org.apache.geronimo.xbeans.geronimo.security.GerDistinguishedNameType getDistinguishedNameArray(int i);
    
    /**
     * Returns number of "distinguished-name" element
     */
    int sizeOfDistinguishedNameArray();
    
    /**
     * Sets array of all "distinguished-name" element
     */
    void setDistinguishedNameArray(org.apache.geronimo.xbeans.geronimo.security.GerDistinguishedNameType[] distinguishedNameArray);
    
    /**
     * Sets ith "distinguished-name" element
     */
    void setDistinguishedNameArray(int i, org.apache.geronimo.xbeans.geronimo.security.GerDistinguishedNameType distinguishedName);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "distinguished-name" element
     */
    org.apache.geronimo.xbeans.geronimo.security.GerDistinguishedNameType insertNewDistinguishedName(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "distinguished-name" element
     */
    org.apache.geronimo.xbeans.geronimo.security.GerDistinguishedNameType addNewDistinguishedName();
    
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
        public static org.apache.geronimo.xbeans.geronimo.security.GerRoleType newInstance() {
          return (org.apache.geronimo.xbeans.geronimo.security.GerRoleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.security.GerRoleType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.apache.geronimo.xbeans.geronimo.security.GerRoleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.apache.geronimo.xbeans.geronimo.security.GerRoleType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.geronimo.security.GerRoleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.security.GerRoleType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.geronimo.security.GerRoleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.apache.geronimo.xbeans.geronimo.security.GerRoleType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.security.GerRoleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.security.GerRoleType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.security.GerRoleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.apache.geronimo.xbeans.geronimo.security.GerRoleType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.security.GerRoleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.security.GerRoleType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.security.GerRoleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.apache.geronimo.xbeans.geronimo.security.GerRoleType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.security.GerRoleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.security.GerRoleType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.security.GerRoleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.apache.geronimo.xbeans.geronimo.security.GerRoleType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.security.GerRoleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.security.GerRoleType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.security.GerRoleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.apache.geronimo.xbeans.geronimo.security.GerRoleType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.geronimo.security.GerRoleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.security.GerRoleType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.geronimo.security.GerRoleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.apache.geronimo.xbeans.geronimo.security.GerRoleType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.geronimo.security.GerRoleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.security.GerRoleType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.geronimo.security.GerRoleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.geronimo.xbeans.geronimo.security.GerRoleType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.geronimo.xbeans.geronimo.security.GerRoleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.geronimo.xbeans.geronimo.security.GerRoleType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.geronimo.xbeans.geronimo.security.GerRoleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
