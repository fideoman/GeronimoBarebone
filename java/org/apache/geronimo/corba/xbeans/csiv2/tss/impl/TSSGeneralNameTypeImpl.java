/*
 * XML Type:  generalNameType
 * Namespace: http://openejb.apache.org/xml/ns/corba-tss-config-2.1
 * Java type: org.apache.geronimo.corba.xbeans.csiv2.tss.TSSGeneralNameType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.corba.xbeans.csiv2.tss.impl;
/**
 * An XML generalNameType(@http://openejb.apache.org/xml/ns/corba-tss-config-2.1).
 *
 * This is a complex type.
 */
public class TSSGeneralNameTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.corba.xbeans.csiv2.tss.TSSGeneralNameType
{
    private static final long serialVersionUID = 1L;
    
    public TSSGeneralNameTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRIVILEGEAUTHORITY$0 = 
        new javax.xml.namespace.QName("", "privilegeAuthority");
    
    
    /**
     * Gets the "privilegeAuthority" attribute
     */
    public java.lang.String getPrivilegeAuthority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRIVILEGEAUTHORITY$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "privilegeAuthority" attribute
     */
    public org.apache.xmlbeans.XmlString xgetPrivilegeAuthority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PRIVILEGEAUTHORITY$0);
            return target;
        }
    }
    
    /**
     * True if has "privilegeAuthority" attribute
     */
    public boolean isSetPrivilegeAuthority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PRIVILEGEAUTHORITY$0) != null;
        }
    }
    
    /**
     * Sets the "privilegeAuthority" attribute
     */
    public void setPrivilegeAuthority(java.lang.String privilegeAuthority)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRIVILEGEAUTHORITY$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PRIVILEGEAUTHORITY$0);
            }
            target.setStringValue(privilegeAuthority);
        }
    }
    
    /**
     * Sets (as xml) the "privilegeAuthority" attribute
     */
    public void xsetPrivilegeAuthority(org.apache.xmlbeans.XmlString privilegeAuthority)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PRIVILEGEAUTHORITY$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PRIVILEGEAUTHORITY$0);
            }
            target.set(privilegeAuthority);
        }
    }
    
    /**
     * Unsets the "privilegeAuthority" attribute
     */
    public void unsetPrivilegeAuthority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PRIVILEGEAUTHORITY$0);
        }
    }
}
