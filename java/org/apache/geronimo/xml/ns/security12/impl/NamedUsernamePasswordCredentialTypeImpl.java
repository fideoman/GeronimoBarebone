/*
 * XML Type:  named-username-password-credentialType
 * Namespace: http://geronimo.apache.org/xml/ns/security-1.2
 * Java type: org.apache.geronimo.xml.ns.security12.NamedUsernamePasswordCredentialType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xml.ns.security12.impl;
/**
 * An XML named-username-password-credentialType(@http://geronimo.apache.org/xml/ns/security-1.2).
 *
 * This is a complex type.
 */
public class NamedUsernamePasswordCredentialTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.xml.ns.security12.NamedUsernamePasswordCredentialType
{
    private static final long serialVersionUID = 1L;
    
    public NamedUsernamePasswordCredentialTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/security-1.2", "name");
    private static final javax.xml.namespace.QName USERNAME$2 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/security-1.2", "username");
    private static final javax.xml.namespace.QName PASSWORD$4 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/security-1.2", "password");
    
    
    /**
     * Gets the "name" element
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "name" element
     */
    public org.apache.xmlbeans.XmlString xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "name" element
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$0);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "name" element
     */
    public void xsetName(org.apache.xmlbeans.XmlString name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$0);
            }
            target.set(name);
        }
    }
    
    /**
     * Gets the "username" element
     */
    public java.lang.String getUsername()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USERNAME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "username" element
     */
    public org.apache.xmlbeans.XmlString xgetUsername()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USERNAME$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "username" element
     */
    public void setUsername(java.lang.String username)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USERNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(USERNAME$2);
            }
            target.setStringValue(username);
        }
    }
    
    /**
     * Sets (as xml) the "username" element
     */
    public void xsetUsername(org.apache.xmlbeans.XmlString username)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USERNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(USERNAME$2);
            }
            target.set(username);
        }
    }
    
    /**
     * Gets the "password" element
     */
    public java.lang.String getPassword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PASSWORD$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "password" element
     */
    public org.apache.xmlbeans.XmlString xgetPassword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PASSWORD$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "password" element
     */
    public void setPassword(java.lang.String password)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PASSWORD$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PASSWORD$4);
            }
            target.setStringValue(password);
        }
    }
    
    /**
     * Sets (as xml) the "password" element
     */
    public void xsetPassword(org.apache.xmlbeans.XmlString password)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PASSWORD$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PASSWORD$4);
            }
            target.set(password);
        }
    }
}
