/*
 * XML Type:  GSSUPDynamicType
 * Namespace: http://openejb.apache.org/xml/ns/corba-css-config-2.1
 * Java type: org.apache.geronimo.corba.xbeans.csiv2.css.CSSGSSUPDynamicType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.corba.xbeans.csiv2.css.impl;
/**
 * An XML GSSUPDynamicType(@http://openejb.apache.org/xml/ns/corba-css-config-2.1).
 *
 * This is a complex type.
 */
public class CSSGSSUPDynamicTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.corba.xbeans.csiv2.css.CSSGSSUPDynamicType
{
    private static final long serialVersionUID = 1L;
    
    public CSSGSSUPDynamicTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DOMAIN$0 = 
        new javax.xml.namespace.QName("", "domain");
    
    
    /**
     * Gets the "domain" attribute
     */
    public java.lang.String getDomain()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DOMAIN$0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DOMAIN$0);
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
            return get_store().find_attribute_user(DOMAIN$0) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DOMAIN$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DOMAIN$0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DOMAIN$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DOMAIN$0);
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
            get_store().remove_attribute(DOMAIN$0);
        }
    }
}
