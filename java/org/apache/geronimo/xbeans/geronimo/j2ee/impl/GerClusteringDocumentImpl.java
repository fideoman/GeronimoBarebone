/*
 * An XML document type.
 * Localname: clustering
 * Namespace: http://geronimo.apache.org/xml/ns/j2ee/application-2.0
 * Java type: org.apache.geronimo.xbeans.geronimo.j2ee.GerClusteringDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.geronimo.j2ee.impl;
/**
 * A document containing one clustering(@http://geronimo.apache.org/xml/ns/j2ee/application-2.0) element.
 *
 * This is a complex type.
 */
public class GerClusteringDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.xbeans.geronimo.j2ee.GerClusteringDocument
{
    private static final long serialVersionUID = 1L;
    
    public GerClusteringDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CLUSTERING$0 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/j2ee/application-2.0", "clustering");
    
    
    /**
     * Gets the "clustering" element
     */
    public org.apache.geronimo.xbeans.geronimo.j2ee.GerAbstractClusteringType getClustering()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.j2ee.GerAbstractClusteringType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.j2ee.GerAbstractClusteringType)get_store().find_element_user(CLUSTERING$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "clustering" element
     */
    public void setClustering(org.apache.geronimo.xbeans.geronimo.j2ee.GerAbstractClusteringType clustering)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.j2ee.GerAbstractClusteringType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.j2ee.GerAbstractClusteringType)get_store().find_element_user(CLUSTERING$0, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.xbeans.geronimo.j2ee.GerAbstractClusteringType)get_store().add_element_user(CLUSTERING$0);
            }
            target.set(clustering);
        }
    }
    
    /**
     * Appends and returns a new empty "clustering" element
     */
    public org.apache.geronimo.xbeans.geronimo.j2ee.GerAbstractClusteringType addNewClustering()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.j2ee.GerAbstractClusteringType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.j2ee.GerAbstractClusteringType)get_store().add_element_user(CLUSTERING$0);
            return target;
        }
    }
}
