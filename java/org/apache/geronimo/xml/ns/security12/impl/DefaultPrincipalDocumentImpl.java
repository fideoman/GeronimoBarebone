/*
 * An XML document type.
 * Localname: default-principal
 * Namespace: http://geronimo.apache.org/xml/ns/security-1.2
 * Java type: org.apache.geronimo.xml.ns.security12.DefaultPrincipalDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xml.ns.security12.impl;
/**
 * A document containing one default-principal(@http://geronimo.apache.org/xml/ns/security-1.2) element.
 *
 * This is a complex type.
 */
public class DefaultPrincipalDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.xml.ns.security12.DefaultPrincipalDocument
{
    private static final long serialVersionUID = 1L;
    
    public DefaultPrincipalDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DEFAULTPRINCIPAL$0 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/security-1.2", "default-principal");
    
    
    /**
     * Gets the "default-principal" element
     */
    public org.apache.geronimo.xml.ns.security12.DefaultPrincipalType getDefaultPrincipal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xml.ns.security12.DefaultPrincipalType target = null;
            target = (org.apache.geronimo.xml.ns.security12.DefaultPrincipalType)get_store().find_element_user(DEFAULTPRINCIPAL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "default-principal" element
     */
    public void setDefaultPrincipal(org.apache.geronimo.xml.ns.security12.DefaultPrincipalType defaultPrincipal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xml.ns.security12.DefaultPrincipalType target = null;
            target = (org.apache.geronimo.xml.ns.security12.DefaultPrincipalType)get_store().find_element_user(DEFAULTPRINCIPAL$0, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.xml.ns.security12.DefaultPrincipalType)get_store().add_element_user(DEFAULTPRINCIPAL$0);
            }
            target.set(defaultPrincipal);
        }
    }
    
    /**
     * Appends and returns a new empty "default-principal" element
     */
    public org.apache.geronimo.xml.ns.security12.DefaultPrincipalType addNewDefaultPrincipal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xml.ns.security12.DefaultPrincipalType target = null;
            target = (org.apache.geronimo.xml.ns.security12.DefaultPrincipalType)get_store().add_element_user(DEFAULTPRINCIPAL$0);
            return target;
        }
    }
}
