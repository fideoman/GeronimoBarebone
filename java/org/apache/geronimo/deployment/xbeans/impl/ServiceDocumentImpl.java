/*
 * An XML document type.
 * Localname: service
 * Namespace: http://geronimo.apache.org/xml/ns/deployment-1.2
 * Java type: org.apache.geronimo.deployment.xbeans.ServiceDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.deployment.xbeans.impl;
/**
 * A document containing one service(@http://geronimo.apache.org/xml/ns/deployment-1.2) element.
 *
 * This is a complex type.
 */
public class ServiceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.deployment.xbeans.ServiceDocument
{
    private static final long serialVersionUID = 1L;
    
    public ServiceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SERVICE$0 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/deployment-1.2", "service");
    private static final org.apache.xmlbeans.QNameSet SERVICE$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/deployment-1.2", "gbean"),
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/deployment-1.2", "service"),
    });
    
    
    /**
     * Gets the "service" element
     */
    public org.apache.geronimo.deployment.xbeans.AbstractServiceType getService()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.xbeans.AbstractServiceType target = null;
            target = (org.apache.geronimo.deployment.xbeans.AbstractServiceType)get_store().find_element_user(SERVICE$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "service" element
     */
    public void setService(org.apache.geronimo.deployment.xbeans.AbstractServiceType service)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.xbeans.AbstractServiceType target = null;
            target = (org.apache.geronimo.deployment.xbeans.AbstractServiceType)get_store().find_element_user(SERVICE$1, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.deployment.xbeans.AbstractServiceType)get_store().add_element_user(SERVICE$0);
            }
            target.set(service);
        }
    }
    
    /**
     * Appends and returns a new empty "service" element
     */
    public org.apache.geronimo.deployment.xbeans.AbstractServiceType addNewService()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.xbeans.AbstractServiceType target = null;
            target = (org.apache.geronimo.deployment.xbeans.AbstractServiceType)get_store().add_element_user(SERVICE$0);
            return target;
        }
    }
}
