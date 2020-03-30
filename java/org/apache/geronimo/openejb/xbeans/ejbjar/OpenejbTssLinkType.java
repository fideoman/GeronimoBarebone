/*
 * XML Type:  tss-linkType
 * Namespace: http://geronimo.apache.org/xml/ns/j2ee/ejb/openejb-2.0
 * Java type: org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbTssLinkType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.openejb.xbeans.ejbjar;


/**
 * An XML tss-linkType(@http://geronimo.apache.org/xml/ns/j2ee/ejb/openejb-2.0).
 *
 * This is a complex type.
 */
public interface OpenejbTssLinkType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OpenejbTssLinkType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sCB8E5D801CA82AB8B1999B71F1BE50C7").resolveHandle("tsslinktype3636type");
    
    /**
     * Gets the "ejb-name" element
     */
    java.lang.String getEjbName();
    
    /**
     * Gets (as xml) the "ejb-name" element
     */
    org.apache.xmlbeans.XmlString xgetEjbName();
    
    /**
     * True if has "ejb-name" element
     */
    boolean isSetEjbName();
    
    /**
     * Sets the "ejb-name" element
     */
    void setEjbName(java.lang.String ejbName);
    
    /**
     * Sets (as xml) the "ejb-name" element
     */
    void xsetEjbName(org.apache.xmlbeans.XmlString ejbName);
    
    /**
     * Unsets the "ejb-name" element
     */
    void unsetEjbName();
    
    /**
     * Gets the "tss-name" element
     */
    java.lang.String getTssName();
    
    /**
     * Gets (as xml) the "tss-name" element
     */
    org.apache.xmlbeans.XmlString xgetTssName();
    
    /**
     * True if has "tss-name" element
     */
    boolean isSetTssName();
    
    /**
     * Sets the "tss-name" element
     */
    void setTssName(java.lang.String tssName);
    
    /**
     * Sets (as xml) the "tss-name" element
     */
    void xsetTssName(org.apache.xmlbeans.XmlString tssName);
    
    /**
     * Unsets the "tss-name" element
     */
    void unsetTssName();
    
    /**
     * Gets array of all "jndi-name" elements
     */
    java.lang.String[] getJndiNameArray();
    
    /**
     * Gets ith "jndi-name" element
     */
    java.lang.String getJndiNameArray(int i);
    
    /**
     * Gets (as xml) array of all "jndi-name" elements
     */
    org.apache.xmlbeans.XmlString[] xgetJndiNameArray();
    
    /**
     * Gets (as xml) ith "jndi-name" element
     */
    org.apache.xmlbeans.XmlString xgetJndiNameArray(int i);
    
    /**
     * Returns number of "jndi-name" element
     */
    int sizeOfJndiNameArray();
    
    /**
     * Sets array of all "jndi-name" element
     */
    void setJndiNameArray(java.lang.String[] jndiNameArray);
    
    /**
     * Sets ith "jndi-name" element
     */
    void setJndiNameArray(int i, java.lang.String jndiName);
    
    /**
     * Sets (as xml) array of all "jndi-name" element
     */
    void xsetJndiNameArray(org.apache.xmlbeans.XmlString[] jndiNameArray);
    
    /**
     * Sets (as xml) ith "jndi-name" element
     */
    void xsetJndiNameArray(int i, org.apache.xmlbeans.XmlString jndiName);
    
    /**
     * Inserts the value as the ith "jndi-name" element
     */
    void insertJndiName(int i, java.lang.String jndiName);
    
    /**
     * Appends the value as the last "jndi-name" element
     */
    void addJndiName(java.lang.String jndiName);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "jndi-name" element
     */
    org.apache.xmlbeans.XmlString insertNewJndiName(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "jndi-name" element
     */
    org.apache.xmlbeans.XmlString addNewJndiName();
    
    /**
     * Removes the ith "jndi-name" element
     */
    void removeJndiName(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbTssLinkType newInstance() {
          return (org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbTssLinkType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbTssLinkType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbTssLinkType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbTssLinkType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbTssLinkType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbTssLinkType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbTssLinkType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbTssLinkType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbTssLinkType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbTssLinkType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbTssLinkType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbTssLinkType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbTssLinkType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbTssLinkType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbTssLinkType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbTssLinkType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbTssLinkType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbTssLinkType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbTssLinkType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbTssLinkType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbTssLinkType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbTssLinkType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbTssLinkType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbTssLinkType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbTssLinkType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbTssLinkType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbTssLinkType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbTssLinkType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbTssLinkType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbTssLinkType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbTssLinkType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbTssLinkType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbTssLinkType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbTssLinkType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbTssLinkType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
