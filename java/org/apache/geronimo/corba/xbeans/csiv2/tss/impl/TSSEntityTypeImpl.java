/*
 * XML Type:  entityType
 * Namespace: http://openejb.apache.org/xml/ns/corba-tss-config-2.1
 * Java type: org.apache.geronimo.corba.xbeans.csiv2.tss.TSSEntityType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.corba.xbeans.csiv2.tss.impl;
/**
 * An XML entityType(@http://openejb.apache.org/xml/ns/corba-tss-config-2.1).
 *
 * This is a complex type.
 */
public class TSSEntityTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.corba.xbeans.csiv2.tss.TSSEntityType
{
    private static final long serialVersionUID = 1L;
    
    public TSSEntityTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HOSTNAME$0 = 
        new javax.xml.namespace.QName("", "hostname");
    private static final javax.xml.namespace.QName DISTINGUISHEDNAME$2 = 
        new javax.xml.namespace.QName("", "distinguishedName");
    
    
    /**
     * Gets the "hostname" attribute
     */
    public java.lang.String getHostname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HOSTNAME$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "hostname" attribute
     */
    public org.apache.xmlbeans.XmlString xgetHostname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(HOSTNAME$0);
            return target;
        }
    }
    
    /**
     * True if has "hostname" attribute
     */
    public boolean isSetHostname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(HOSTNAME$0) != null;
        }
    }
    
    /**
     * Sets the "hostname" attribute
     */
    public void setHostname(java.lang.String hostname)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HOSTNAME$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HOSTNAME$0);
            }
            target.setStringValue(hostname);
        }
    }
    
    /**
     * Sets (as xml) the "hostname" attribute
     */
    public void xsetHostname(org.apache.xmlbeans.XmlString hostname)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(HOSTNAME$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(HOSTNAME$0);
            }
            target.set(hostname);
        }
    }
    
    /**
     * Unsets the "hostname" attribute
     */
    public void unsetHostname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(HOSTNAME$0);
        }
    }
    
    /**
     * Gets the "distinguishedName" attribute
     */
    public java.lang.String getDistinguishedName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISTINGUISHEDNAME$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "distinguishedName" attribute
     */
    public org.apache.xmlbeans.XmlString xgetDistinguishedName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DISTINGUISHEDNAME$2);
            return target;
        }
    }
    
    /**
     * True if has "distinguishedName" attribute
     */
    public boolean isSetDistinguishedName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DISTINGUISHEDNAME$2) != null;
        }
    }
    
    /**
     * Sets the "distinguishedName" attribute
     */
    public void setDistinguishedName(java.lang.String distinguishedName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISTINGUISHEDNAME$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DISTINGUISHEDNAME$2);
            }
            target.setStringValue(distinguishedName);
        }
    }
    
    /**
     * Sets (as xml) the "distinguishedName" attribute
     */
    public void xsetDistinguishedName(org.apache.xmlbeans.XmlString distinguishedName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DISTINGUISHEDNAME$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DISTINGUISHEDNAME$2);
            }
            target.set(distinguishedName);
        }
    }
    
    /**
     * Unsets the "distinguishedName" attribute
     */
    public void unsetDistinguishedName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DISTINGUISHEDNAME$2);
        }
    }
}
