/*
 * An XML document type.
 * Localname: credential-store
 * Namespace: http://geronimo.apache.org/xml/ns/security-2.0
 * Java type: org.apache.geronimo.xbeans.geronimo.security.GerCredentialStoreDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.geronimo.security.impl;
/**
 * A document containing one credential-store(@http://geronimo.apache.org/xml/ns/security-2.0) element.
 *
 * This is a complex type.
 */
public class GerCredentialStoreDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.xbeans.geronimo.security.GerCredentialStoreDocument
{
    private static final long serialVersionUID = 1L;
    
    public GerCredentialStoreDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CREDENTIALSTORE$0 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/security-2.0", "credential-store");
    
    
    /**
     * Gets the "credential-store" element
     */
    public org.apache.geronimo.deployment.xbeans.PatternType getCredentialStore()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.xbeans.PatternType target = null;
            target = (org.apache.geronimo.deployment.xbeans.PatternType)get_store().find_element_user(CREDENTIALSTORE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "credential-store" element
     */
    public void setCredentialStore(org.apache.geronimo.deployment.xbeans.PatternType credentialStore)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.xbeans.PatternType target = null;
            target = (org.apache.geronimo.deployment.xbeans.PatternType)get_store().find_element_user(CREDENTIALSTORE$0, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.deployment.xbeans.PatternType)get_store().add_element_user(CREDENTIALSTORE$0);
            }
            target.set(credentialStore);
        }
    }
    
    /**
     * Appends and returns a new empty "credential-store" element
     */
    public org.apache.geronimo.deployment.xbeans.PatternType addNewCredentialStore()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.xbeans.PatternType target = null;
            target = (org.apache.geronimo.deployment.xbeans.PatternType)get_store().add_element_user(CREDENTIALSTORE$0);
            return target;
        }
    }
}
