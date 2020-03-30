/*
 * XML Type:  GSSUPStaticType
 * Namespace: http://openejb.apache.org/xml/ns/corba-css-config-2.1
 * Java type: org.apache.geronimo.corba.xbeans.csiv2.css.CSSGSSUPStaticType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.corba.xbeans.csiv2.css.impl;
/**
 * An XML GSSUPStaticType(@http://openejb.apache.org/xml/ns/corba-css-config-2.1).
 *
 * This is a complex type.
 */
public class CSSGSSUPStaticTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.corba.xbeans.csiv2.css.CSSGSSUPStaticType
{
    private static final long serialVersionUID = 1L;
    
    public CSSGSSUPStaticTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USERNAME$0 = 
        new javax.xml.namespace.QName("", "username");
    private static final javax.xml.namespace.QName PASSWORD$2 = 
        new javax.xml.namespace.QName("", "password");
    private static final javax.xml.namespace.QName DOMAIN$4 = 
        new javax.xml.namespace.QName("", "domain");
    
    
    /**
     * Gets the "username" attribute
     */
    public java.lang.String getUsername()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USERNAME$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "username" attribute
     */
    public org.apache.xmlbeans.XmlString xgetUsername()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(USERNAME$0);
            return target;
        }
    }
    
    /**
     * True if has "username" attribute
     */
    public boolean isSetUsername()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(USERNAME$0) != null;
        }
    }
    
    /**
     * Sets the "username" attribute
     */
    public void setUsername(java.lang.String username)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USERNAME$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(USERNAME$0);
            }
            target.setStringValue(username);
        }
    }
    
    /**
     * Sets (as xml) the "username" attribute
     */
    public void xsetUsername(org.apache.xmlbeans.XmlString username)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(USERNAME$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(USERNAME$0);
            }
            target.set(username);
        }
    }
    
    /**
     * Unsets the "username" attribute
     */
    public void unsetUsername()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(USERNAME$0);
        }
    }
    
    /**
     * Gets the "password" attribute
     */
    public java.lang.String getPassword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PASSWORD$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "password" attribute
     */
    public org.apache.xmlbeans.XmlString xgetPassword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PASSWORD$2);
            return target;
        }
    }
    
    /**
     * True if has "password" attribute
     */
    public boolean isSetPassword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PASSWORD$2) != null;
        }
    }
    
    /**
     * Sets the "password" attribute
     */
    public void setPassword(java.lang.String password)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PASSWORD$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PASSWORD$2);
            }
            target.setStringValue(password);
        }
    }
    
    /**
     * Sets (as xml) the "password" attribute
     */
    public void xsetPassword(org.apache.xmlbeans.XmlString password)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PASSWORD$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PASSWORD$2);
            }
            target.set(password);
        }
    }
    
    /**
     * Unsets the "password" attribute
     */
    public void unsetPassword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PASSWORD$2);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DOMAIN$4);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DOMAIN$4);
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
            return get_store().find_attribute_user(DOMAIN$4) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DOMAIN$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DOMAIN$4);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DOMAIN$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DOMAIN$4);
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
            get_store().remove_attribute(DOMAIN$4);
        }
    }
}
