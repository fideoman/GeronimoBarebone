/*
 * An XML document type.
 * Localname: security-ref
 * Namespace: http://geronimo.apache.org/xml/ns/security-2.0
 * Java type: org.apache.geronimo.xbeans.geronimo.security.GerSecurityRefDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.geronimo.security.impl;
/**
 * A document containing one security-ref(@http://geronimo.apache.org/xml/ns/security-2.0) element.
 *
 * This is a complex type.
 */
public class GerSecurityRefDocumentImpl extends org.apache.geronimo.xbeans.geronimo.j2ee.impl.GerSecurityDocumentImpl implements org.apache.geronimo.xbeans.geronimo.security.GerSecurityRefDocument
{
    private static final long serialVersionUID = 1L;
    
    public GerSecurityRefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SECURITYREF$0 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/security-2.0", "security-ref");
    
    
    /**
     * Gets the "security-ref" element
     */
    public org.apache.geronimo.xbeans.geronimo.security.GerSecurityRefType getSecurityRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.security.GerSecurityRefType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.security.GerSecurityRefType)get_store().find_element_user(SECURITYREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "security-ref" element
     */
    public void setSecurityRef(org.apache.geronimo.xbeans.geronimo.security.GerSecurityRefType securityRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.security.GerSecurityRefType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.security.GerSecurityRefType)get_store().find_element_user(SECURITYREF$0, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.xbeans.geronimo.security.GerSecurityRefType)get_store().add_element_user(SECURITYREF$0);
            }
            target.set(securityRef);
        }
    }
    
    /**
     * Appends and returns a new empty "security-ref" element
     */
    public org.apache.geronimo.xbeans.geronimo.security.GerSecurityRefType addNewSecurityRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.security.GerSecurityRefType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.security.GerSecurityRefType)get_store().add_element_user(SECURITYREF$0);
            return target;
        }
    }
}
