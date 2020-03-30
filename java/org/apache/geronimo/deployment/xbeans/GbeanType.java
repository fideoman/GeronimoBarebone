/*
 * XML Type:  gbeanType
 * Namespace: http://geronimo.apache.org/xml/ns/deployment-1.2
 * Java type: org.apache.geronimo.deployment.xbeans.GbeanType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.deployment.xbeans;


/**
 * An XML gbeanType(@http://geronimo.apache.org/xml/ns/deployment-1.2).
 *
 * This is a complex type.
 */
public interface GbeanType extends org.apache.geronimo.deployment.xbeans.AbstractServiceType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GbeanType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1D00E640B90252F7DCFA98454B9E9CE2").resolveHandle("gbeantype7270type");
    
    /**
     * Gets array of all "attribute" elements
     */
    org.apache.geronimo.deployment.xbeans.AttributeType[] getAttributeArray();
    
    /**
     * Gets ith "attribute" element
     */
    org.apache.geronimo.deployment.xbeans.AttributeType getAttributeArray(int i);
    
    /**
     * Returns number of "attribute" element
     */
    int sizeOfAttributeArray();
    
    /**
     * Sets array of all "attribute" element
     */
    void setAttributeArray(org.apache.geronimo.deployment.xbeans.AttributeType[] attributeArray);
    
    /**
     * Sets ith "attribute" element
     */
    void setAttributeArray(int i, org.apache.geronimo.deployment.xbeans.AttributeType attribute);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "attribute" element
     */
    org.apache.geronimo.deployment.xbeans.AttributeType insertNewAttribute(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "attribute" element
     */
    org.apache.geronimo.deployment.xbeans.AttributeType addNewAttribute();
    
    /**
     * Removes the ith "attribute" element
     */
    void removeAttribute(int i);
    
    /**
     * Gets array of all "xml-attribute" elements
     */
    org.apache.geronimo.deployment.xbeans.XmlAttributeType[] getXmlAttributeArray();
    
    /**
     * Gets ith "xml-attribute" element
     */
    org.apache.geronimo.deployment.xbeans.XmlAttributeType getXmlAttributeArray(int i);
    
    /**
     * Returns number of "xml-attribute" element
     */
    int sizeOfXmlAttributeArray();
    
    /**
     * Sets array of all "xml-attribute" element
     */
    void setXmlAttributeArray(org.apache.geronimo.deployment.xbeans.XmlAttributeType[] xmlAttributeArray);
    
    /**
     * Sets ith "xml-attribute" element
     */
    void setXmlAttributeArray(int i, org.apache.geronimo.deployment.xbeans.XmlAttributeType xmlAttribute);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "xml-attribute" element
     */
    org.apache.geronimo.deployment.xbeans.XmlAttributeType insertNewXmlAttribute(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "xml-attribute" element
     */
    org.apache.geronimo.deployment.xbeans.XmlAttributeType addNewXmlAttribute();
    
    /**
     * Removes the ith "xml-attribute" element
     */
    void removeXmlAttribute(int i);
    
    /**
     * Gets array of all "reference" elements
     */
    org.apache.geronimo.deployment.xbeans.ReferenceType[] getReferenceArray();
    
    /**
     * Gets ith "reference" element
     */
    org.apache.geronimo.deployment.xbeans.ReferenceType getReferenceArray(int i);
    
    /**
     * Returns number of "reference" element
     */
    int sizeOfReferenceArray();
    
    /**
     * Sets array of all "reference" element
     */
    void setReferenceArray(org.apache.geronimo.deployment.xbeans.ReferenceType[] referenceArray);
    
    /**
     * Sets ith "reference" element
     */
    void setReferenceArray(int i, org.apache.geronimo.deployment.xbeans.ReferenceType reference);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "reference" element
     */
    org.apache.geronimo.deployment.xbeans.ReferenceType insertNewReference(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "reference" element
     */
    org.apache.geronimo.deployment.xbeans.ReferenceType addNewReference();
    
    /**
     * Removes the ith "reference" element
     */
    void removeReference(int i);
    
    /**
     * Gets array of all "references" elements
     */
    org.apache.geronimo.deployment.xbeans.ReferencesType[] getReferencesArray();
    
    /**
     * Gets ith "references" element
     */
    org.apache.geronimo.deployment.xbeans.ReferencesType getReferencesArray(int i);
    
    /**
     * Returns number of "references" element
     */
    int sizeOfReferencesArray();
    
    /**
     * Sets array of all "references" element
     */
    void setReferencesArray(org.apache.geronimo.deployment.xbeans.ReferencesType[] referencesArray);
    
    /**
     * Sets ith "references" element
     */
    void setReferencesArray(int i, org.apache.geronimo.deployment.xbeans.ReferencesType references);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "references" element
     */
    org.apache.geronimo.deployment.xbeans.ReferencesType insertNewReferences(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "references" element
     */
    org.apache.geronimo.deployment.xbeans.ReferencesType addNewReferences();
    
    /**
     * Removes the ith "references" element
     */
    void removeReferences(int i);
    
    /**
     * Gets array of all "xml-reference" elements
     */
    org.apache.geronimo.deployment.xbeans.XmlAttributeType[] getXmlReferenceArray();
    
    /**
     * Gets ith "xml-reference" element
     */
    org.apache.geronimo.deployment.xbeans.XmlAttributeType getXmlReferenceArray(int i);
    
    /**
     * Returns number of "xml-reference" element
     */
    int sizeOfXmlReferenceArray();
    
    /**
     * Sets array of all "xml-reference" element
     */
    void setXmlReferenceArray(org.apache.geronimo.deployment.xbeans.XmlAttributeType[] xmlReferenceArray);
    
    /**
     * Sets ith "xml-reference" element
     */
    void setXmlReferenceArray(int i, org.apache.geronimo.deployment.xbeans.XmlAttributeType xmlReference);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "xml-reference" element
     */
    org.apache.geronimo.deployment.xbeans.XmlAttributeType insertNewXmlReference(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "xml-reference" element
     */
    org.apache.geronimo.deployment.xbeans.XmlAttributeType addNewXmlReference();
    
    /**
     * Removes the ith "xml-reference" element
     */
    void removeXmlReference(int i);
    
    /**
     * Gets array of all "dependency" elements
     */
    org.apache.geronimo.deployment.xbeans.PatternType[] getDependencyArray();
    
    /**
     * Gets ith "dependency" element
     */
    org.apache.geronimo.deployment.xbeans.PatternType getDependencyArray(int i);
    
    /**
     * Returns number of "dependency" element
     */
    int sizeOfDependencyArray();
    
    /**
     * Sets array of all "dependency" element
     */
    void setDependencyArray(org.apache.geronimo.deployment.xbeans.PatternType[] dependencyArray);
    
    /**
     * Sets ith "dependency" element
     */
    void setDependencyArray(int i, org.apache.geronimo.deployment.xbeans.PatternType dependency);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "dependency" element
     */
    org.apache.geronimo.deployment.xbeans.PatternType insertNewDependency(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "dependency" element
     */
    org.apache.geronimo.deployment.xbeans.PatternType addNewDependency();
    
    /**
     * Removes the ith "dependency" element
     */
    void removeDependency(int i);
    
    /**
     * Gets the "name" attribute
     */
    java.lang.String getName();
    
    /**
     * Gets (as xml) the "name" attribute
     */
    org.apache.xmlbeans.XmlString xgetName();
    
    /**
     * Sets the "name" attribute
     */
    void setName(java.lang.String name);
    
    /**
     * Sets (as xml) the "name" attribute
     */
    void xsetName(org.apache.xmlbeans.XmlString name);
    
    /**
     * Gets the "class" attribute
     */
    java.lang.String getClass1();
    
    /**
     * Gets (as xml) the "class" attribute
     */
    org.apache.xmlbeans.XmlString xgetClass1();
    
    /**
     * Sets the "class" attribute
     */
    void setClass1(java.lang.String class1);
    
    /**
     * Sets (as xml) the "class" attribute
     */
    void xsetClass1(org.apache.xmlbeans.XmlString class1);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.apache.geronimo.deployment.xbeans.GbeanType newInstance() {
          return (org.apache.geronimo.deployment.xbeans.GbeanType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.apache.geronimo.deployment.xbeans.GbeanType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.apache.geronimo.deployment.xbeans.GbeanType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.apache.geronimo.deployment.xbeans.GbeanType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.deployment.xbeans.GbeanType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.apache.geronimo.deployment.xbeans.GbeanType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.deployment.xbeans.GbeanType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.apache.geronimo.deployment.xbeans.GbeanType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.deployment.xbeans.GbeanType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.apache.geronimo.deployment.xbeans.GbeanType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.deployment.xbeans.GbeanType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.apache.geronimo.deployment.xbeans.GbeanType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.deployment.xbeans.GbeanType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.apache.geronimo.deployment.xbeans.GbeanType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.deployment.xbeans.GbeanType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.apache.geronimo.deployment.xbeans.GbeanType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.deployment.xbeans.GbeanType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.apache.geronimo.deployment.xbeans.GbeanType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.deployment.xbeans.GbeanType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.apache.geronimo.deployment.xbeans.GbeanType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.deployment.xbeans.GbeanType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.apache.geronimo.deployment.xbeans.GbeanType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.deployment.xbeans.GbeanType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.apache.geronimo.deployment.xbeans.GbeanType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.deployment.xbeans.GbeanType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.apache.geronimo.deployment.xbeans.GbeanType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.deployment.xbeans.GbeanType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.apache.geronimo.deployment.xbeans.GbeanType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.deployment.xbeans.GbeanType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.apache.geronimo.deployment.xbeans.GbeanType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.deployment.xbeans.GbeanType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.geronimo.deployment.xbeans.GbeanType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.geronimo.deployment.xbeans.GbeanType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.geronimo.deployment.xbeans.GbeanType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.geronimo.deployment.xbeans.GbeanType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
