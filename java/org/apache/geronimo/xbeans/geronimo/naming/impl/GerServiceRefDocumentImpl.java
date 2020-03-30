/*
 * An XML document type.
 * Localname: service-ref
 * Namespace: http://geronimo.apache.org/xml/ns/naming-1.2
 * Java type: org.apache.geronimo.xbeans.geronimo.naming.GerServiceRefDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.geronimo.naming.impl;
/**
 * A document containing one service-ref(@http://geronimo.apache.org/xml/ns/naming-1.2) element.
 *
 * This is a complex type.
 */
public class GerServiceRefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.xbeans.geronimo.naming.GerServiceRefDocument
{
    private static final long serialVersionUID = 1L;
    
    public GerServiceRefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SERVICEREF$0 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "service-ref");
    
    
    /**
     * Gets the "service-ref" element
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerServiceRefType getServiceRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerServiceRefType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerServiceRefType)get_store().find_element_user(SERVICEREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "service-ref" element
     */
    public void setServiceRef(org.apache.geronimo.xbeans.geronimo.naming.GerServiceRefType serviceRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerServiceRefType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerServiceRefType)get_store().find_element_user(SERVICEREF$0, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.xbeans.geronimo.naming.GerServiceRefType)get_store().add_element_user(SERVICEREF$0);
            }
            target.set(serviceRef);
        }
    }
    
    /**
     * Appends and returns a new empty "service-ref" element
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerServiceRefType addNewServiceRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerServiceRefType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerServiceRefType)get_store().add_element_user(SERVICEREF$0);
            return target;
        }
    }
}
