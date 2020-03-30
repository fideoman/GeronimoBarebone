/*
 * An XML document type.
 * Localname: gbean
 * Namespace: http://geronimo.apache.org/xml/ns/deployment-1.2
 * Java type: org.apache.geronimo.deployment.xbeans.GbeanDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.deployment.xbeans.impl;
/**
 * A document containing one gbean(@http://geronimo.apache.org/xml/ns/deployment-1.2) element.
 *
 * This is a complex type.
 */
public class GbeanDocumentImpl extends org.apache.geronimo.deployment.xbeans.impl.ServiceDocumentImpl implements org.apache.geronimo.deployment.xbeans.GbeanDocument
{
    private static final long serialVersionUID = 1L;
    
    public GbeanDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GBEAN$0 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/deployment-1.2", "gbean");
    
    
    /**
     * Gets the "gbean" element
     */
    public org.apache.geronimo.deployment.xbeans.GbeanType getGbean()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.xbeans.GbeanType target = null;
            target = (org.apache.geronimo.deployment.xbeans.GbeanType)get_store().find_element_user(GBEAN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "gbean" element
     */
    public void setGbean(org.apache.geronimo.deployment.xbeans.GbeanType gbean)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.xbeans.GbeanType target = null;
            target = (org.apache.geronimo.deployment.xbeans.GbeanType)get_store().find_element_user(GBEAN$0, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.deployment.xbeans.GbeanType)get_store().add_element_user(GBEAN$0);
            }
            target.set(gbean);
        }
    }
    
    /**
     * Appends and returns a new empty "gbean" element
     */
    public org.apache.geronimo.deployment.xbeans.GbeanType addNewGbean()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.xbeans.GbeanType target = null;
            target = (org.apache.geronimo.deployment.xbeans.GbeanType)get_store().add_element_user(GBEAN$0);
            return target;
        }
    }
}
