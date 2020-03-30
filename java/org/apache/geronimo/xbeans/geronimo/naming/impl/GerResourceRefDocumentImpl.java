/*
 * An XML document type.
 * Localname: resource-ref
 * Namespace: http://geronimo.apache.org/xml/ns/naming-1.2
 * Java type: org.apache.geronimo.xbeans.geronimo.naming.GerResourceRefDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.geronimo.naming.impl;
/**
 * A document containing one resource-ref(@http://geronimo.apache.org/xml/ns/naming-1.2) element.
 *
 * This is a complex type.
 */
public class GerResourceRefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.xbeans.geronimo.naming.GerResourceRefDocument
{
    private static final long serialVersionUID = 1L;
    
    public GerResourceRefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESOURCEREF$0 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "resource-ref");
    
    
    /**
     * Gets the "resource-ref" element
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerResourceRefType getResourceRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerResourceRefType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerResourceRefType)get_store().find_element_user(RESOURCEREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "resource-ref" element
     */
    public void setResourceRef(org.apache.geronimo.xbeans.geronimo.naming.GerResourceRefType resourceRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerResourceRefType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerResourceRefType)get_store().find_element_user(RESOURCEREF$0, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.xbeans.geronimo.naming.GerResourceRefType)get_store().add_element_user(RESOURCEREF$0);
            }
            target.set(resourceRef);
        }
    }
    
    /**
     * Appends and returns a new empty "resource-ref" element
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerResourceRefType addNewResourceRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerResourceRefType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerResourceRefType)get_store().add_element_user(RESOURCEREF$0);
            return target;
        }
    }
}
