/*
 * XML Type:  abstract-login-moduleType
 * Namespace: http://geronimo.apache.org/xml/ns/loginconfig-2.0
 * Java type: org.apache.geronimo.xbeans.geronimo.loginconfig.GerAbstractLoginModuleType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.geronimo.loginconfig.impl;
/**
 * An XML abstract-login-moduleType(@http://geronimo.apache.org/xml/ns/loginconfig-2.0).
 *
 * This is a complex type.
 */
public class GerAbstractLoginModuleTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.xbeans.geronimo.loginconfig.GerAbstractLoginModuleType
{
    private static final long serialVersionUID = 1L;
    
    public GerAbstractLoginModuleTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTROLFLAG$0 = 
        new javax.xml.namespace.QName("", "control-flag");
    private static final javax.xml.namespace.QName WRAPPRINCIPALS$2 = 
        new javax.xml.namespace.QName("", "wrap-principals");
    
    
    /**
     * Gets the "control-flag" attribute
     */
    public org.apache.geronimo.xbeans.geronimo.loginconfig.GerControlFlagType.Enum getControlFlag()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONTROLFLAG$0);
            if (target == null)
            {
                return null;
            }
            return (org.apache.geronimo.xbeans.geronimo.loginconfig.GerControlFlagType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "control-flag" attribute
     */
    public org.apache.geronimo.xbeans.geronimo.loginconfig.GerControlFlagType xgetControlFlag()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.loginconfig.GerControlFlagType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.loginconfig.GerControlFlagType)get_store().find_attribute_user(CONTROLFLAG$0);
            return target;
        }
    }
    
    /**
     * Sets the "control-flag" attribute
     */
    public void setControlFlag(org.apache.geronimo.xbeans.geronimo.loginconfig.GerControlFlagType.Enum controlFlag)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONTROLFLAG$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CONTROLFLAG$0);
            }
            target.setEnumValue(controlFlag);
        }
    }
    
    /**
     * Sets (as xml) the "control-flag" attribute
     */
    public void xsetControlFlag(org.apache.geronimo.xbeans.geronimo.loginconfig.GerControlFlagType controlFlag)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.loginconfig.GerControlFlagType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.loginconfig.GerControlFlagType)get_store().find_attribute_user(CONTROLFLAG$0);
            if (target == null)
            {
                target = (org.apache.geronimo.xbeans.geronimo.loginconfig.GerControlFlagType)get_store().add_attribute_user(CONTROLFLAG$0);
            }
            target.set(controlFlag);
        }
    }
    
    /**
     * Gets the "wrap-principals" attribute
     */
    public boolean getWrapPrincipals()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WRAPPRINCIPALS$2);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "wrap-principals" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetWrapPrincipals()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(WRAPPRINCIPALS$2);
            return target;
        }
    }
    
    /**
     * True if has "wrap-principals" attribute
     */
    public boolean isSetWrapPrincipals()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(WRAPPRINCIPALS$2) != null;
        }
    }
    
    /**
     * Sets the "wrap-principals" attribute
     */
    public void setWrapPrincipals(boolean wrapPrincipals)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WRAPPRINCIPALS$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(WRAPPRINCIPALS$2);
            }
            target.setBooleanValue(wrapPrincipals);
        }
    }
    
    /**
     * Sets (as xml) the "wrap-principals" attribute
     */
    public void xsetWrapPrincipals(org.apache.xmlbeans.XmlBoolean wrapPrincipals)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(WRAPPRINCIPALS$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(WRAPPRINCIPALS$2);
            }
            target.set(wrapPrincipals);
        }
    }
    
    /**
     * Unsets the "wrap-principals" attribute
     */
    public void unsetWrapPrincipals()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(WRAPPRINCIPALS$2);
        }
    }
}
