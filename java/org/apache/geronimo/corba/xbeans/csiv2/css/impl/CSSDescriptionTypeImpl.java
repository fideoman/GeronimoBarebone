/*
 * XML Type:  descriptionType
 * Namespace: http://openejb.apache.org/xml/ns/corba-css-config-2.1
 * Java type: org.apache.geronimo.corba.xbeans.csiv2.css.CSSDescriptionType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.corba.xbeans.csiv2.css.impl;
/**
 * An XML descriptionType(@http://openejb.apache.org/xml/ns/corba-css-config-2.1).
 *
 * This is an atomic type that is a restriction of org.apache.geronimo.corba.xbeans.csiv2.css.CSSDescriptionType.
 */
public class CSSDescriptionTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.apache.geronimo.corba.xbeans.csiv2.css.CSSDescriptionType
{
    private static final long serialVersionUID = 1L;
    
    public CSSDescriptionTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, true);
    }
    
    protected CSSDescriptionTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    
    private static final javax.xml.namespace.QName LANG$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/XML/1998/namespace", "lang");
    
    
    /**
     * Gets the "lang" attribute
     */
    public java.lang.String getLang()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "lang" attribute
     */
    public org.apache.xmlbeans.XmlLanguage xgetLang()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLanguage target = null;
            target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANG$0);
            return target;
        }
    }
    
    /**
     * True if has "lang" attribute
     */
    public boolean isSetLang()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LANG$0) != null;
        }
    }
    
    /**
     * Sets the "lang" attribute
     */
    public void setLang(java.lang.String lang)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LANG$0);
            }
            target.setStringValue(lang);
        }
    }
    
    /**
     * Sets (as xml) the "lang" attribute
     */
    public void xsetLang(org.apache.xmlbeans.XmlLanguage lang)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLanguage target = null;
            target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANG$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLanguage)get_store().add_attribute_user(LANG$0);
            }
            target.set(lang);
        }
    }
    
    /**
     * Unsets the "lang" attribute
     */
    public void unsetLang()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LANG$0);
        }
    }
}
