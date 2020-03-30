/*
 * An XML document type.
 * Localname: security
 * Namespace: http://geronimo.apache.org/xml/ns/security-1.2
 * Java type: org.apache.geronimo.xml.ns.security12.SecurityDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xml.ns.security12.impl;
/**
 * A document containing one security(@http://geronimo.apache.org/xml/ns/security-1.2) element.
 *
 * This is a complex type.
 */
public class SecurityDocumentImpl extends org.apache.geronimo.xbeans.geronimo.j2ee.impl.GerSecurityDocumentImpl implements org.apache.geronimo.xml.ns.security12.SecurityDocument
{
    private static final long serialVersionUID = 1L;
    
    public SecurityDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SECURITY2$0 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/security-1.2", "security");
    
    
    /**
     * Gets the "security" element
     */
    public org.apache.geronimo.xml.ns.security12.SecurityType getSecurity2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xml.ns.security12.SecurityType target = null;
            target = (org.apache.geronimo.xml.ns.security12.SecurityType)get_store().find_element_user(SECURITY2$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "security" element
     */
    public void setSecurity2(org.apache.geronimo.xml.ns.security12.SecurityType security2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xml.ns.security12.SecurityType target = null;
            target = (org.apache.geronimo.xml.ns.security12.SecurityType)get_store().find_element_user(SECURITY2$0, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.xml.ns.security12.SecurityType)get_store().add_element_user(SECURITY2$0);
            }
            target.set(security2);
        }
    }
    
    /**
     * Appends and returns a new empty "security" element
     */
    public org.apache.geronimo.xml.ns.security12.SecurityType addNewSecurity2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xml.ns.security12.SecurityType target = null;
            target = (org.apache.geronimo.xml.ns.security12.SecurityType)get_store().add_element_user(SECURITY2$0);
            return target;
        }
    }
}
