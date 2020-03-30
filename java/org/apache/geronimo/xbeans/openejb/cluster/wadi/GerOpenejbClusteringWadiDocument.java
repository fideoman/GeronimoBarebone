/*
 * An XML document type.
 * Localname: openejb-clustering-wadi
 * Namespace: http://geronimo.apache.org/xml/ns/openejb-clustering-wadi-1.2
 * Java type: org.apache.geronimo.xbeans.openejb.cluster.wadi.GerOpenejbClusteringWadiDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.openejb.cluster.wadi;


/**
 * A document containing one openejb-clustering-wadi(@http://geronimo.apache.org/xml/ns/openejb-clustering-wadi-1.2) element.
 *
 * This is a complex type.
 */
public interface GerOpenejbClusteringWadiDocument extends org.apache.geronimo.xbeans.geronimo.j2ee.GerClusteringDocument
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GerOpenejbClusteringWadiDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s7EF167CAD7833074B635F3419B7C19FD").resolveHandle("openejbclusteringwadi3fb8doctype");
    
    /**
     * Gets the "openejb-clustering-wadi" element
     */
    org.apache.geronimo.xbeans.openejb.cluster.wadi.GerOpenejbClusteringWadiType getOpenejbClusteringWadi();
    
    /**
     * Sets the "openejb-clustering-wadi" element
     */
    void setOpenejbClusteringWadi(org.apache.geronimo.xbeans.openejb.cluster.wadi.GerOpenejbClusteringWadiType openejbClusteringWadi);
    
    /**
     * Appends and returns a new empty "openejb-clustering-wadi" element
     */
    org.apache.geronimo.xbeans.openejb.cluster.wadi.GerOpenejbClusteringWadiType addNewOpenejbClusteringWadi();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.apache.geronimo.xbeans.openejb.cluster.wadi.GerOpenejbClusteringWadiDocument newInstance() {
          return (org.apache.geronimo.xbeans.openejb.cluster.wadi.GerOpenejbClusteringWadiDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.apache.geronimo.xbeans.openejb.cluster.wadi.GerOpenejbClusteringWadiDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.apache.geronimo.xbeans.openejb.cluster.wadi.GerOpenejbClusteringWadiDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.apache.geronimo.xbeans.openejb.cluster.wadi.GerOpenejbClusteringWadiDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.openejb.cluster.wadi.GerOpenejbClusteringWadiDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.apache.geronimo.xbeans.openejb.cluster.wadi.GerOpenejbClusteringWadiDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.openejb.cluster.wadi.GerOpenejbClusteringWadiDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.apache.geronimo.xbeans.openejb.cluster.wadi.GerOpenejbClusteringWadiDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.openejb.cluster.wadi.GerOpenejbClusteringWadiDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.apache.geronimo.xbeans.openejb.cluster.wadi.GerOpenejbClusteringWadiDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.openejb.cluster.wadi.GerOpenejbClusteringWadiDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.apache.geronimo.xbeans.openejb.cluster.wadi.GerOpenejbClusteringWadiDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.openejb.cluster.wadi.GerOpenejbClusteringWadiDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.apache.geronimo.xbeans.openejb.cluster.wadi.GerOpenejbClusteringWadiDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.openejb.cluster.wadi.GerOpenejbClusteringWadiDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.apache.geronimo.xbeans.openejb.cluster.wadi.GerOpenejbClusteringWadiDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.openejb.cluster.wadi.GerOpenejbClusteringWadiDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.apache.geronimo.xbeans.openejb.cluster.wadi.GerOpenejbClusteringWadiDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.openejb.cluster.wadi.GerOpenejbClusteringWadiDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.apache.geronimo.xbeans.openejb.cluster.wadi.GerOpenejbClusteringWadiDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.openejb.cluster.wadi.GerOpenejbClusteringWadiDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.apache.geronimo.xbeans.openejb.cluster.wadi.GerOpenejbClusteringWadiDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.xbeans.openejb.cluster.wadi.GerOpenejbClusteringWadiDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.apache.geronimo.xbeans.openejb.cluster.wadi.GerOpenejbClusteringWadiDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.openejb.cluster.wadi.GerOpenejbClusteringWadiDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.apache.geronimo.xbeans.openejb.cluster.wadi.GerOpenejbClusteringWadiDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.openejb.cluster.wadi.GerOpenejbClusteringWadiDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.apache.geronimo.xbeans.openejb.cluster.wadi.GerOpenejbClusteringWadiDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.openejb.cluster.wadi.GerOpenejbClusteringWadiDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.apache.geronimo.xbeans.openejb.cluster.wadi.GerOpenejbClusteringWadiDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.xbeans.openejb.cluster.wadi.GerOpenejbClusteringWadiDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.geronimo.xbeans.openejb.cluster.wadi.GerOpenejbClusteringWadiDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.geronimo.xbeans.openejb.cluster.wadi.GerOpenejbClusteringWadiDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.geronimo.xbeans.openejb.cluster.wadi.GerOpenejbClusteringWadiDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.geronimo.xbeans.openejb.cluster.wadi.GerOpenejbClusteringWadiDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
