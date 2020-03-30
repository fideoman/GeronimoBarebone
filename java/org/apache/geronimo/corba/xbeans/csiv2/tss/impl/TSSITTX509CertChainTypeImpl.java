/*
 * XML Type:  ITTX509CertChainType
 * Namespace: http://openejb.apache.org/xml/ns/corba-tss-config-2.1
 * Java type: org.apache.geronimo.corba.xbeans.csiv2.tss.TSSITTX509CertChainType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.corba.xbeans.csiv2.tss.impl;
/**
 * An XML ITTX509CertChainType(@http://openejb.apache.org/xml/ns/corba-tss-config-2.1).
 *
 * This is a complex type.
 */
public class TSSITTX509CertChainTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.corba.xbeans.csiv2.tss.TSSITTX509CertChainType
{
    private static final long serialVersionUID = 1L;
    
    public TSSITTX509CertChainTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REALM$0 = 
        new javax.xml.namespace.QName("", "realm");
    private static final javax.xml.namespace.QName DOMAIN$2 = 
        new javax.xml.namespace.QName("", "domain");
    
    
    /**
     * Gets the "realm" attribute
     */
    public java.lang.String getRealm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REALM$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "realm" attribute
     */
    public org.apache.xmlbeans.XmlString xgetRealm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(REALM$0);
            return target;
        }
    }
    
    /**
     * True if has "realm" attribute
     */
    public boolean isSetRealm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(REALM$0) != null;
        }
    }
    
    /**
     * Sets the "realm" attribute
     */
    public void setRealm(java.lang.String realm)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REALM$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REALM$0);
            }
            target.setStringValue(realm);
        }
    }
    
    /**
     * Sets (as xml) the "realm" attribute
     */
    public void xsetRealm(org.apache.xmlbeans.XmlString realm)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(REALM$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(REALM$0);
            }
            target.set(realm);
        }
    }
    
    /**
     * Unsets the "realm" attribute
     */
    public void unsetRealm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(REALM$0);
        }
    }
    
    /**
     * Gets the "domain" attribute
     */
    public java.lang.String getDomain()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DOMAIN$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "domain" attribute
     */
    public org.apache.xmlbeans.XmlString xgetDomain()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DOMAIN$2);
            return target;
        }
    }
    
    /**
     * True if has "domain" attribute
     */
    public boolean isSetDomain()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DOMAIN$2) != null;
        }
    }
    
    /**
     * Sets the "domain" attribute
     */
    public void setDomain(java.lang.String domain)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DOMAIN$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DOMAIN$2);
            }
            target.setStringValue(domain);
        }
    }
    
    /**
     * Sets (as xml) the "domain" attribute
     */
    public void xsetDomain(org.apache.xmlbeans.XmlString domain)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DOMAIN$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DOMAIN$2);
            }
            target.set(domain);
        }
    }
    
    /**
     * Unsets the "domain" attribute
     */
    public void unsetDomain()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DOMAIN$2);
        }
    }
}
