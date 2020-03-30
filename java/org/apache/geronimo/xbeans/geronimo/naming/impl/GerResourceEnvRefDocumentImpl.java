/*
 * An XML document type.
 * Localname: resource-env-ref
 * Namespace: http://geronimo.apache.org/xml/ns/naming-1.2
 * Java type: org.apache.geronimo.xbeans.geronimo.naming.GerResourceEnvRefDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.geronimo.naming.impl;
/**
 * A document containing one resource-env-ref(@http://geronimo.apache.org/xml/ns/naming-1.2) element.
 *
 * This is a complex type.
 */
public class GerResourceEnvRefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.xbeans.geronimo.naming.GerResourceEnvRefDocument
{
    private static final long serialVersionUID = 1L;
    
    public GerResourceEnvRefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESOURCEENVREF$0 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "resource-env-ref");
    
    
    /**
     * Gets the "resource-env-ref" element
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerResourceEnvRefType getResourceEnvRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerResourceEnvRefType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerResourceEnvRefType)get_store().find_element_user(RESOURCEENVREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "resource-env-ref" element
     */
    public void setResourceEnvRef(org.apache.geronimo.xbeans.geronimo.naming.GerResourceEnvRefType resourceEnvRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerResourceEnvRefType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerResourceEnvRefType)get_store().find_element_user(RESOURCEENVREF$0, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.xbeans.geronimo.naming.GerResourceEnvRefType)get_store().add_element_user(RESOURCEENVREF$0);
            }
            target.set(resourceEnvRef);
        }
    }
    
    /**
     * Appends and returns a new empty "resource-env-ref" element
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerResourceEnvRefType addNewResourceEnvRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerResourceEnvRefType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerResourceEnvRefType)get_store().add_element_user(RESOURCEENVREF$0);
            return target;
        }
    }
}
