/*
 * XML Type:  role-subject-mappingsType
 * Namespace: http://geronimo.apache.org/xml/ns/subject-info-1.0
 * Java type: org.apache.geronimo.xbeans.geronimo.security.subjectinfo.GerRoleSubjectMappingsType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.geronimo.security.subjectinfo;


/**
 * An XML role-subject-mappingsType(@http://geronimo.apache.org/xml/ns/subject-info-1.0).
 *
 * This is a complex type.
 */
public interface GerRoleSubjectMappingsType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GerRoleSubjectMappingsType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4769874CABA12AE1DF68A448E73C1B12").resolveHandle("rolesubjectmappingstype0912type");
    
    /**
     * Gets array of all "role" elements
     */
    org.apache.geronimo.xbeans.geronimo.security.subjectinfo.GerRoleType[] getRoleArray();
    
    /**
     * Gets ith "role" element
     */
    org.apache.geronimo.xbeans.geronimo.security.subjectinfo.GerRoleType getRoleArray(int i);
    
    /**
     * Returns number of "role" element
     */
    int sizeOfRoleArray();
    
    /**
     * Sets array of all "role" element
     */
    void setRoleArray(org.apache.geronimo.xbeans.geronimo.security.subjectinfo.GerRoleType[] roleArray);
    
    /**
     * Sets ith "role" element
     */
    void setRoleArray(int i, org.apache.geronimo.xbeans.geronimo.security.subjectinfo.GerRoleType role);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "role" element
     */
    org.apache.geronimo.xbeans.geronimo.security.subjectinfo.GerRoleType insertNewRole(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "role" element
     */
    org.apache.geronimo.xbeans.geronimo.security.subjectinfo.GerRoleType addNewRole();
    
    /**
     * Removes the ith "role" element
     */
    void removeRole(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.apache.geronimo.xbeans.geronimo.security.subjectinfo.GerRoleSubjectMappingsType newInstance() {
          return (org.apache.geronimo.xbeans.geronimo.security.subjectinfo.GerRoleSubjectMappingsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.security.subjectinfo.GerRoleSubjectMappingsType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.apache.geronimo.xbeans.geronimo.security.subjectinfo.GerRoleSubjectMappingsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.apache.geronimo.xbeans.geronimo.security.subjectinfo.GerRoleSubjectMappingsType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.geronimo.security.subjectinfo.GerRoleSubjectMappingsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.security.subjectinfo.GerRoleSubjectMappingsType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.geronimo.security.subjectinfo.GerRoleSubjectMappingsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.apache.geronimo.xbeans.geronimo.security.subjectinfo.GerRoleSubjectMappingsType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.security.subjectinfo.GerRoleSubjectMappingsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.security.subjectinfo.GerRoleSubjectMappingsType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.security.subjectinfo.GerRoleSubjectMappingsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.apache.geronimo.xbeans.geronimo.security.subjectinfo.GerRoleSubjectMappingsType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.security.subjectinfo.GerRoleSubjectMappingsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.security.subjectinfo.GerRoleSubjectMappingsType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.security.subjectinfo.GerRoleSubjectMappingsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.apache.geronimo.xbeans.geronimo.security.subjectinfo.GerRoleSubjectMappingsType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.security.subjectinfo.GerRoleSubjectMappingsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.security.subjectinfo.GerRoleSubjectMappingsType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.security.subjectinfo.GerRoleSubjectMappingsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.apache.geronimo.xbeans.geronimo.security.subjectinfo.GerRoleSubjectMappingsType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.security.subjectinfo.GerRoleSubjectMappingsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.security.subjectinfo.GerRoleSubjectMappingsType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.geronimo.security.subjectinfo.GerRoleSubjectMappingsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.apache.geronimo.xbeans.geronimo.security.subjectinfo.GerRoleSubjectMappingsType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.geronimo.security.subjectinfo.GerRoleSubjectMappingsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.security.subjectinfo.GerRoleSubjectMappingsType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.geronimo.security.subjectinfo.GerRoleSubjectMappingsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.apache.geronimo.xbeans.geronimo.security.subjectinfo.GerRoleSubjectMappingsType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.geronimo.security.subjectinfo.GerRoleSubjectMappingsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.apache.geronimo.xbeans.geronimo.security.subjectinfo.GerRoleSubjectMappingsType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.geronimo.security.subjectinfo.GerRoleSubjectMappingsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.geronimo.xbeans.geronimo.security.subjectinfo.GerRoleSubjectMappingsType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.geronimo.xbeans.geronimo.security.subjectinfo.GerRoleSubjectMappingsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.geronimo.xbeans.geronimo.security.subjectinfo.GerRoleSubjectMappingsType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.geronimo.xbeans.geronimo.security.subjectinfo.GerRoleSubjectMappingsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
