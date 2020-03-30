/*
 * XML Type:  ITTPrincipalNameStaticType
 * Namespace: http://openejb.apache.org/xml/ns/corba-css-config-2.1
 * Java type: org.apache.geronimo.corba.xbeans.csiv2.css.CSSITTPrincipalNameStaticType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.corba.xbeans.csiv2.css.impl;
/**
 * An XML ITTPrincipalNameStaticType(@http://openejb.apache.org/xml/ns/corba-css-config-2.1).
 *
 * This is a complex type.
 */
public class CSSITTPrincipalNameStaticTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.corba.xbeans.csiv2.css.CSSITTPrincipalNameStaticType
{
    private static final long serialVersionUID = 1L;
    
    public CSSITTPrincipalNameStaticTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("", "name");
    private static final javax.xml.namespace.QName OID$2 = 
        new javax.xml.namespace.QName("", "oid");
    
    
    /**
     * Gets the "name" attribute
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "name" attribute
     */
    public org.apache.xmlbeans.XmlString xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$0);
            return target;
        }
    }
    
    /**
     * True if has "name" attribute
     */
    public boolean isSetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(NAME$0) != null;
        }
    }
    
    /**
     * Sets the "name" attribute
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$0);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "name" attribute
     */
    public void xsetName(org.apache.xmlbeans.XmlString name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$0);
            }
            target.set(name);
        }
    }
    
    /**
     * Unsets the "name" attribute
     */
    public void unsetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(NAME$0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OID$2);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(OID$2);
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
            return get_store().find_attribute_user(OID$2) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OID$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OID$2);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(OID$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(OID$2);
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
            get_store().remove_attribute(OID$2);
        }
    }
}
