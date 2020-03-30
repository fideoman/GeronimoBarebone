/*
 * An XML document type.
 * Localname: resource-adapter
 * Namespace: http://geronimo.apache.org/xml/ns/naming-1.2
 * Java type: org.apache.geronimo.xbeans.geronimo.naming.GerResourceAdapterDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.geronimo.naming.impl;
/**
 * A document containing one resource-adapter(@http://geronimo.apache.org/xml/ns/naming-1.2) element.
 *
 * This is a complex type.
 */
public class GerResourceAdapterDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.xbeans.geronimo.naming.GerResourceAdapterDocument
{
    private static final long serialVersionUID = 1L;
    
    public GerResourceAdapterDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESOURCEADAPTER$0 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "resource-adapter");
    
    
    /**
     * Gets the "resource-adapter" element
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerResourceLocatorType getResourceAdapter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerResourceLocatorType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerResourceLocatorType)get_store().find_element_user(RESOURCEADAPTER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "resource-adapter" element
     */
    public void setResourceAdapter(org.apache.geronimo.xbeans.geronimo.naming.GerResourceLocatorType resourceAdapter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerResourceLocatorType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerResourceLocatorType)get_store().find_element_user(RESOURCEADAPTER$0, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.xbeans.geronimo.naming.GerResourceLocatorType)get_store().add_element_user(RESOURCEADAPTER$0);
            }
            target.set(resourceAdapter);
        }
    }
    
    /**
     * Appends and returns a new empty "resource-adapter" element
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerResourceLocatorType addNewResourceAdapter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerResourceLocatorType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerResourceLocatorType)get_store().add_element_user(RESOURCEADAPTER$0);
            return target;
        }
    }
}
