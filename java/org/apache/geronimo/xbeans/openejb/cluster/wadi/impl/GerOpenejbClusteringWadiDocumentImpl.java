/*
 * An XML document type.
 * Localname: openejb-clustering-wadi
 * Namespace: http://geronimo.apache.org/xml/ns/openejb-clustering-wadi-1.2
 * Java type: org.apache.geronimo.xbeans.openejb.cluster.wadi.GerOpenejbClusteringWadiDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.openejb.cluster.wadi.impl;
/**
 * A document containing one openejb-clustering-wadi(@http://geronimo.apache.org/xml/ns/openejb-clustering-wadi-1.2) element.
 *
 * This is a complex type.
 */
public class GerOpenejbClusteringWadiDocumentImpl extends org.apache.geronimo.xbeans.geronimo.j2ee.impl.GerClusteringDocumentImpl implements org.apache.geronimo.xbeans.openejb.cluster.wadi.GerOpenejbClusteringWadiDocument
{
    private static final long serialVersionUID = 1L;
    
    public GerOpenejbClusteringWadiDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OPENEJBCLUSTERINGWADI$0 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/openejb-clustering-wadi-1.2", "openejb-clustering-wadi");
    
    
    /**
     * Gets the "openejb-clustering-wadi" element
     */
    public org.apache.geronimo.xbeans.openejb.cluster.wadi.GerOpenejbClusteringWadiType getOpenejbClusteringWadi()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.openejb.cluster.wadi.GerOpenejbClusteringWadiType target = null;
            target = (org.apache.geronimo.xbeans.openejb.cluster.wadi.GerOpenejbClusteringWadiType)get_store().find_element_user(OPENEJBCLUSTERINGWADI$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "openejb-clustering-wadi" element
     */
    public void setOpenejbClusteringWadi(org.apache.geronimo.xbeans.openejb.cluster.wadi.GerOpenejbClusteringWadiType openejbClusteringWadi)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.openejb.cluster.wadi.GerOpenejbClusteringWadiType target = null;
            target = (org.apache.geronimo.xbeans.openejb.cluster.wadi.GerOpenejbClusteringWadiType)get_store().find_element_user(OPENEJBCLUSTERINGWADI$0, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.xbeans.openejb.cluster.wadi.GerOpenejbClusteringWadiType)get_store().add_element_user(OPENEJBCLUSTERINGWADI$0);
            }
            target.set(openejbClusteringWadi);
        }
    }
    
    /**
     * Appends and returns a new empty "openejb-clustering-wadi" element
     */
    public org.apache.geronimo.xbeans.openejb.cluster.wadi.GerOpenejbClusteringWadiType addNewOpenejbClusteringWadi()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.openejb.cluster.wadi.GerOpenejbClusteringWadiType target = null;
            target = (org.apache.geronimo.xbeans.openejb.cluster.wadi.GerOpenejbClusteringWadiType)get_store().add_element_user(OPENEJBCLUSTERINGWADI$0);
            return target;
        }
    }
}
