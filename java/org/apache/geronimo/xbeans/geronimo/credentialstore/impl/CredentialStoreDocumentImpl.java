/*
 * An XML document type.
 * Localname: credential-store
 * Namespace: http://geronimo.apache.org/xml/ns/credentialstore-1.0
 * Java type: org.apache.geronimo.xbeans.geronimo.credentialstore.CredentialStoreDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.geronimo.credentialstore.impl;
/**
 * A document containing one credential-store(@http://geronimo.apache.org/xml/ns/credentialstore-1.0) element.
 *
 * This is a complex type.
 */
public class CredentialStoreDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.xbeans.geronimo.credentialstore.CredentialStoreDocument
{
    private static final long serialVersionUID = 1L;
    
    public CredentialStoreDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CREDENTIALSTORE$0 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/credentialstore-1.0", "credential-store");
    
    
    /**
     * Gets the "credential-store" element
     */
    public org.apache.geronimo.xbeans.geronimo.credentialstore.CredentialStoreType getCredentialStore()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.credentialstore.CredentialStoreType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.credentialstore.CredentialStoreType)get_store().find_element_user(CREDENTIALSTORE$0, 0);
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
    public void setCredentialStore(org.apache.geronimo.xbeans.geronimo.credentialstore.CredentialStoreType credentialStore)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.credentialstore.CredentialStoreType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.credentialstore.CredentialStoreType)get_store().find_element_user(CREDENTIALSTORE$0, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.xbeans.geronimo.credentialstore.CredentialStoreType)get_store().add_element_user(CREDENTIALSTORE$0);
            }
            target.set(credentialStore);
        }
    }
    
    /**
     * Appends and returns a new empty "credential-store" element
     */
    public org.apache.geronimo.xbeans.geronimo.credentialstore.CredentialStoreType addNewCredentialStore()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.credentialstore.CredentialStoreType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.credentialstore.CredentialStoreType)get_store().add_element_user(CREDENTIALSTORE$0);
            return target;
        }
    }
}
