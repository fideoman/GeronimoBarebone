/*
 * An XML document type.
 * Localname: clustering-wadi
 * Namespace: http://geronimo.apache.org/xml/ns/clustering-wadi-1.2
 * Java type: org.apache.geronimo.xbeans.jetty8.cluster.wadi.GerClusteringWadiDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.jetty8.cluster.wadi.impl;
/**
 * A document containing one clustering-wadi(@http://geronimo.apache.org/xml/ns/clustering-wadi-1.2) element.
 *
 * This is a complex type.
 */
public class GerClusteringWadiDocumentImpl extends org.apache.geronimo.xbeans.geronimo.j2ee.impl.GerClusteringDocumentImpl implements org.apache.geronimo.xbeans.jetty8.cluster.wadi.GerClusteringWadiDocument
{
    private static final long serialVersionUID = 1L;
    
    public GerClusteringWadiDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CLUSTERINGWADI$0 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/clustering-wadi-1.2", "clustering-wadi");
    
    
    /**
     * Gets the "clustering-wadi" element
     */
    public org.apache.geronimo.xbeans.jetty8.cluster.wadi.GerClusteringWadiType getClusteringWadi()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.jetty8.cluster.wadi.GerClusteringWadiType target = null;
            target = (org.apache.geronimo.xbeans.jetty8.cluster.wadi.GerClusteringWadiType)get_store().find_element_user(CLUSTERINGWADI$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "clustering-wadi" element
     */
    public void setClusteringWadi(org.apache.geronimo.xbeans.jetty8.cluster.wadi.GerClusteringWadiType clusteringWadi)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.jetty8.cluster.wadi.GerClusteringWadiType target = null;
            target = (org.apache.geronimo.xbeans.jetty8.cluster.wadi.GerClusteringWadiType)get_store().find_element_user(CLUSTERINGWADI$0, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.xbeans.jetty8.cluster.wadi.GerClusteringWadiType)get_store().add_element_user(CLUSTERINGWADI$0);
            }
            target.set(clusteringWadi);
        }
    }
    
    /**
     * Appends and returns a new empty "clustering-wadi" element
     */
    public org.apache.geronimo.xbeans.jetty8.cluster.wadi.GerClusteringWadiType addNewClusteringWadi()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.jetty8.cluster.wadi.GerClusteringWadiType target = null;
            target = (org.apache.geronimo.xbeans.jetty8.cluster.wadi.GerClusteringWadiType)get_store().add_element_user(CLUSTERINGWADI$0);
            return target;
        }
    }
}
