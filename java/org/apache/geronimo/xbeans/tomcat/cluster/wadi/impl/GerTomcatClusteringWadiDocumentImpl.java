/*
 * An XML document type.
 * Localname: tomcat-clustering-wadi
 * Namespace: http://geronimo.apache.org/xml/ns/tomcat-clustering-wadi-1.2
 * Java type: org.apache.geronimo.xbeans.tomcat.cluster.wadi.GerTomcatClusteringWadiDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.tomcat.cluster.wadi.impl;
/**
 * A document containing one tomcat-clustering-wadi(@http://geronimo.apache.org/xml/ns/tomcat-clustering-wadi-1.2) element.
 *
 * This is a complex type.
 */
public class GerTomcatClusteringWadiDocumentImpl extends org.apache.geronimo.xbeans.geronimo.j2ee.impl.GerClusteringDocumentImpl implements org.apache.geronimo.xbeans.tomcat.cluster.wadi.GerTomcatClusteringWadiDocument
{
    private static final long serialVersionUID = 1L;
    
    public GerTomcatClusteringWadiDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TOMCATCLUSTERINGWADI$0 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/tomcat-clustering-wadi-1.2", "tomcat-clustering-wadi");
    
    
    /**
     * Gets the "tomcat-clustering-wadi" element
     */
    public org.apache.geronimo.xbeans.tomcat.cluster.wadi.GerTomcatClusteringWadiType getTomcatClusteringWadi()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.tomcat.cluster.wadi.GerTomcatClusteringWadiType target = null;
            target = (org.apache.geronimo.xbeans.tomcat.cluster.wadi.GerTomcatClusteringWadiType)get_store().find_element_user(TOMCATCLUSTERINGWADI$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "tomcat-clustering-wadi" element
     */
    public void setTomcatClusteringWadi(org.apache.geronimo.xbeans.tomcat.cluster.wadi.GerTomcatClusteringWadiType tomcatClusteringWadi)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.tomcat.cluster.wadi.GerTomcatClusteringWadiType target = null;
            target = (org.apache.geronimo.xbeans.tomcat.cluster.wadi.GerTomcatClusteringWadiType)get_store().find_element_user(TOMCATCLUSTERINGWADI$0, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.xbeans.tomcat.cluster.wadi.GerTomcatClusteringWadiType)get_store().add_element_user(TOMCATCLUSTERINGWADI$0);
            }
            target.set(tomcatClusteringWadi);
        }
    }
    
    /**
     * Appends and returns a new empty "tomcat-clustering-wadi" element
     */
    public org.apache.geronimo.xbeans.tomcat.cluster.wadi.GerTomcatClusteringWadiType addNewTomcatClusteringWadi()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.tomcat.cluster.wadi.GerTomcatClusteringWadiType target = null;
            target = (org.apache.geronimo.xbeans.tomcat.cluster.wadi.GerTomcatClusteringWadiType)get_store().add_element_user(TOMCATCLUSTERINGWADI$0);
            return target;
        }
    }
}
