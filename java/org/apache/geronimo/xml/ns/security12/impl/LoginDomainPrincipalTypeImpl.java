/*
 * XML Type:  loginDomainPrincipalType
 * Namespace: http://geronimo.apache.org/xml/ns/security-1.2
 * Java type: org.apache.geronimo.xml.ns.security12.LoginDomainPrincipalType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xml.ns.security12.impl;
/**
 * An XML loginDomainPrincipalType(@http://geronimo.apache.org/xml/ns/security-1.2).
 *
 * This is a complex type.
 */
public class LoginDomainPrincipalTypeImpl extends org.apache.geronimo.xml.ns.security12.impl.PrincipalTypeImpl implements org.apache.geronimo.xml.ns.security12.LoginDomainPrincipalType
{
    private static final long serialVersionUID = 1L;
    
    public LoginDomainPrincipalTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DOMAINNAME$0 = 
        new javax.xml.namespace.QName("", "domain-name");
    
    
    /**
     * Gets the "domain-name" attribute
     */
    public java.lang.String getDomainName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DOMAINNAME$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "domain-name" attribute
     */
    public org.apache.xmlbeans.XmlString xgetDomainName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DOMAINNAME$0);
            return target;
        }
    }
    
    /**
     * Sets the "domain-name" attribute
     */
    public void setDomainName(java.lang.String domainName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DOMAINNAME$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DOMAINNAME$0);
            }
            target.setStringValue(domainName);
        }
    }
    
    /**
     * Sets (as xml) the "domain-name" attribute
     */
    public void xsetDomainName(org.apache.xmlbeans.XmlString domainName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DOMAINNAME$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DOMAINNAME$0);
            }
            target.set(domainName);
        }
    }
}
