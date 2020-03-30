/*
 * XML Type:  realmPrincipalType
 * Namespace: http://geronimo.apache.org/xml/ns/security-1.2
 * Java type: org.apache.geronimo.xml.ns.security12.RealmPrincipalType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xml.ns.security12.impl;
/**
 * An XML realmPrincipalType(@http://geronimo.apache.org/xml/ns/security-1.2).
 *
 * This is a complex type.
 */
public class RealmPrincipalTypeImpl extends org.apache.geronimo.xml.ns.security12.impl.LoginDomainPrincipalTypeImpl implements org.apache.geronimo.xml.ns.security12.RealmPrincipalType
{
    private static final long serialVersionUID = 1L;
    
    public RealmPrincipalTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REALMNAME$0 = 
        new javax.xml.namespace.QName("", "realm-name");
    
    
    /**
     * Gets the "realm-name" attribute
     */
    public java.lang.String getRealmName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REALMNAME$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "realm-name" attribute
     */
    public org.apache.xmlbeans.XmlString xgetRealmName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(REALMNAME$0);
            return target;
        }
    }
    
    /**
     * Sets the "realm-name" attribute
     */
    public void setRealmName(java.lang.String realmName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REALMNAME$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REALMNAME$0);
            }
            target.setStringValue(realmName);
        }
    }
    
    /**
     * Sets (as xml) the "realm-name" attribute
     */
    public void xsetRealmName(org.apache.xmlbeans.XmlString realmName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(REALMNAME$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(REALMNAME$0);
            }
            target.set(realmName);
        }
    }
}
