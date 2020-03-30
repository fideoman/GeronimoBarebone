/*
 * XML Type:  ITTPrincipalNameDynamicType
 * Namespace: http://openejb.apache.org/xml/ns/corba-css-config-2.1
 * Java type: org.apache.geronimo.corba.xbeans.csiv2.css.CSSITTPrincipalNameDynamicType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.corba.xbeans.csiv2.css.impl;
/**
 * An XML ITTPrincipalNameDynamicType(@http://openejb.apache.org/xml/ns/corba-css-config-2.1).
 *
 * This is a complex type.
 */
public class CSSITTPrincipalNameDynamicTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.corba.xbeans.csiv2.css.CSSITTPrincipalNameDynamicType
{
    private static final long serialVersionUID = 1L;
    
    public CSSITTPrincipalNameDynamicTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRINCIPALCLASS$0 = 
        new javax.xml.namespace.QName("", "principal-class");
    private static final javax.xml.namespace.QName DOMAIN$2 = 
        new javax.xml.namespace.QName("", "domain");
    private static final javax.xml.namespace.QName REALM$4 = 
        new javax.xml.namespace.QName("", "realm");
    private static final javax.xml.namespace.QName OID$6 = 
        new javax.xml.namespace.QName("", "oid");
    
    
    /**
     * Gets the "principal-class" attribute
     */
    public java.lang.String getPrincipalClass()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRINCIPALCLASS$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "principal-class" attribute
     */
    public org.apache.xmlbeans.XmlString xgetPrincipalClass()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PRINCIPALCLASS$0);
            return target;
        }
    }
    
    /**
     * True if has "principal-class" attribute
     */
    public boolean isSetPrincipalClass()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PRINCIPALCLASS$0) != null;
        }
    }
    
    /**
     * Sets the "principal-class" attribute
     */
    public void setPrincipalClass(java.lang.String principalClass)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRINCIPALCLASS$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PRINCIPALCLASS$0);
            }
            target.setStringValue(principalClass);
        }
    }
    
    /**
     * Sets (as xml) the "principal-class" attribute
     */
    public void xsetPrincipalClass(org.apache.xmlbeans.XmlString principalClass)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PRINCIPALCLASS$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PRINCIPALCLASS$0);
            }
            target.set(principalClass);
        }
    }
    
    /**
     * Unsets the "principal-class" attribute
     */
    public void unsetPrincipalClass()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PRINCIPALCLASS$0);
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
    
    /**
     * Gets the "realm" attribute
     */
    public java.lang.String getRealm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REALM$4);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(REALM$4);
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
            return get_store().find_attribute_user(REALM$4) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REALM$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REALM$4);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(REALM$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(REALM$4);
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
            get_store().remove_attribute(REALM$4);
        }
    }
    
    /**
     * Gets the "oid" attribute
     */
    public java.lang.String getOid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OID$6);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "oid" attribute
     */
    public org.apache.xmlbeans.XmlString xgetOid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(OID$6);
            return target;
        }
    }
    
    /**
     * True if has "oid" attribute
     */
    public boolean isSetOid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(OID$6) != null;
        }
    }
    
    /**
     * Sets the "oid" attribute
     */
    public void setOid(java.lang.String oid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OID$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OID$6);
            }
            target.setStringValue(oid);
        }
    }
    
    /**
     * Sets (as xml) the "oid" attribute
     */
    public void xsetOid(org.apache.xmlbeans.XmlString oid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(OID$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(OID$6);
            }
            target.set(oid);
        }
    }
    
    /**
     * Unsets the "oid" attribute
     */
    public void unsetOid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(OID$6);
        }
    }
}
