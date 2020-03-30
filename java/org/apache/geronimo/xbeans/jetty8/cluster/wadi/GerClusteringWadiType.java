/*
 * XML Type:  clustering-wadiType
 * Namespace: http://geronimo.apache.org/xml/ns/clustering-wadi-1.2
 * Java type: org.apache.geronimo.xbeans.jetty8.cluster.wadi.GerClusteringWadiType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.jetty8.cluster.wadi;


/**
 * An XML clustering-wadiType(@http://geronimo.apache.org/xml/ns/clustering-wadi-1.2).
 *
 * This is a complex type.
 */
public interface GerClusteringWadiType extends org.apache.geronimo.xbeans.geronimo.j2ee.GerAbstractClusteringType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GerClusteringWadiType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4986B3F482CB7AF931EBD941A6497D31").resolveHandle("clusteringwaditype1296type");
    
    /**
     * Gets the "sweepInterval" element
     */
    java.math.BigInteger getSweepInterval();
    
    /**
     * Gets (as xml) the "sweepInterval" element
     */
    org.apache.xmlbeans.XmlInteger xgetSweepInterval();
    
    /**
     * True if has "sweepInterval" element
     */
    boolean isSetSweepInterval();
    
    /**
     * Sets the "sweepInterval" element
     */
    void setSweepInterval(java.math.BigInteger sweepInterval);
    
    /**
     * Sets (as xml) the "sweepInterval" element
     */
    void xsetSweepInterval(org.apache.xmlbeans.XmlInteger sweepInterval);
    
    /**
     * Unsets the "sweepInterval" element
     */
    void unsetSweepInterval();
    
    /**
     * Gets the "numPartitions" element
     */
    java.math.BigInteger getNumPartitions();
    
    /**
     * Gets (as xml) the "numPartitions" element
     */
    org.apache.xmlbeans.XmlInteger xgetNumPartitions();
    
    /**
     * True if has "numPartitions" element
     */
    boolean isSetNumPartitions();
    
    /**
     * Sets the "numPartitions" element
     */
    void setNumPartitions(java.math.BigInteger numPartitions);
    
    /**
     * Sets (as xml) the "numPartitions" element
     */
    void xsetNumPartitions(org.apache.xmlbeans.XmlInteger numPartitions);
    
    /**
     * Unsets the "numPartitions" element
     */
    void unsetNumPartitions();
    
    /**
     * Gets the "cluster" element
     */
    org.apache.geronimo.xbeans.geronimo.naming.GerGbeanRefType getCluster();
    
    /**
     * True if has "cluster" element
     */
    boolean isSetCluster();
    
    /**
     * Sets the "cluster" element
     */
    void setCluster(org.apache.geronimo.xbeans.geronimo.naming.GerGbeanRefType cluster);
    
    /**
     * Appends and returns a new empty "cluster" element
     */
    org.apache.geronimo.xbeans.geronimo.naming.GerGbeanRefType addNewCluster();
    
    /**
     * Unsets the "cluster" element
     */
    void unsetCluster();
    
    /**
     * Gets the "disableReplication" element
     */
    boolean getDisableReplication();
    
    /**
     * Gets (as xml) the "disableReplication" element
     */
    org.apache.xmlbeans.XmlBoolean xgetDisableReplication();
    
    /**
     * True if has "disableReplication" element
     */
    boolean isSetDisableReplication();
    
    /**
     * Sets the "disableReplication" element
     */
    void setDisableReplication(boolean disableReplication);
    
    /**
     * Sets (as xml) the "disableReplication" element
     */
    void xsetDisableReplication(org.apache.xmlbeans.XmlBoolean disableReplication);
    
    /**
     * Unsets the "disableReplication" element
     */
    void unsetDisableReplication();
    
    /**
     * Gets the "deltaReplication" element
     */
    boolean getDeltaReplication();
    
    /**
     * Gets (as xml) the "deltaReplication" element
     */
    org.apache.xmlbeans.XmlBoolean xgetDeltaReplication();
    
    /**
     * True if has "deltaReplication" element
     */
    boolean isSetDeltaReplication();
    
    /**
     * Sets the "deltaReplication" element
     */
    void setDeltaReplication(boolean deltaReplication);
    
    /**
     * Sets (as xml) the "deltaReplication" element
     */
    void xsetDeltaReplication(org.apache.xmlbeans.XmlBoolean deltaReplication);
    
    /**
     * Unsets the "deltaReplication" element
     */
    void unsetDeltaReplication();
    
    /**
     * Gets the "backing-strategy-factory" element
     */
    org.apache.geronimo.xbeans.geronimo.naming.GerGbeanRefType getBackingStrategyFactory();
    
    /**
     * True if has "backing-strategy-factory" element
     */
    boolean isSetBackingStrategyFactory();
    
    /**
     * Sets the "backing-strategy-factory" element
     */
    void setBackingStrategyFactory(org.apache.geronimo.xbeans.geronimo.naming.GerGbeanRefType backingStrategyFactory);
    
    /**
     * Appends and returns a new empty "backing-strategy-factory" element
     */
    org.apache.geronimo.xbeans.geronimo.naming.GerGbeanRefType addNewBackingStrategyFactory();
    
    /**
     * Unsets the "backing-strategy-factory" element
     */
    void unsetBackingStrategyFactory();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.apache.geronimo.xbeans.jetty8.cluster.wadi.GerClusteringWadiType newInstance() {
          return (org.apache.geronimo.xbeans.jetty8.cluster.wadi.GerClusteringWadiType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.apache.geronimo.xbeans.jetty8.cluster.wadi.GerClusteringWadiType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.apache.geronimo.xbeans.jetty8.cluster.wadi.GerClusteringWadiType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.apache.geronimo.xbeans.jetty8.cluster.wadi.GerClusteringWadiType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.jetty8.cluster.wadi.GerClusteringWadiType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.apache.geronimo.xbeans.jetty8.cluster.wadi.GerClusteringWadiType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.jetty8.cluster.wadi.GerClusteringWadiType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.apache.geronimo.xbeans.jetty8.cluster.wadi.GerClusteringWadiType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.jetty8.cluster.wadi.GerClusteringWadiType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.apache.geronimo.xbeans.jetty8.cluster.wadi.GerClusteringWadiType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.jetty8.cluster.wadi.GerClusteringWadiType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.apache.geronimo.xbeans.jetty8.cluster.wadi.GerClusteringWadiType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.jetty8.cluster.wadi.GerClusteringWadiType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.apache.geronimo.xbeans.jetty8.cluster.wadi.GerClusteringWadiType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.jetty8.cluster.wadi.GerClusteringWadiType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.apache.geronimo.xbeans.jetty8.cluster.wadi.GerClusteringWadiType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.jetty8.cluster.wadi.GerClusteringWadiType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.apache.geronimo.xbeans.jetty8.cluster.wadi.GerClusteringWadiType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.jetty8.cluster.wadi.GerClusteringWadiType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.apache.geronimo.xbeans.jetty8.cluster.wadi.GerClusteringWadiType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.jetty8.cluster.wadi.GerClusteringWadiType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.apache.geronimo.xbeans.jetty8.cluster.wadi.GerClusteringWadiType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.jetty8.cluster.wadi.GerClusteringWadiType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.apache.geronimo.xbeans.jetty8.cluster.wadi.GerClusteringWadiType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.jetty8.cluster.wadi.GerClusteringWadiType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.apache.geronimo.xbeans.jetty8.cluster.wadi.GerClusteringWadiType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.jetty8.cluster.wadi.GerClusteringWadiType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.apache.geronimo.xbeans.jetty8.cluster.wadi.GerClusteringWadiType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.jetty8.cluster.wadi.GerClusteringWadiType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.apache.geronimo.xbeans.jetty8.cluster.wadi.GerClusteringWadiType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.jetty8.cluster.wadi.GerClusteringWadiType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.geronimo.xbeans.jetty8.cluster.wadi.GerClusteringWadiType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.geronimo.xbeans.jetty8.cluster.wadi.GerClusteringWadiType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.geronimo.xbeans.jetty8.cluster.wadi.GerClusteringWadiType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.geronimo.xbeans.jetty8.cluster.wadi.GerClusteringWadiType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
