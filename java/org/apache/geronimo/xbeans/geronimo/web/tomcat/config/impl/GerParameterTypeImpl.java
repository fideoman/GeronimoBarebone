/*
 * XML Type:  parameterType
 * Namespace: http://geronimo.apache.org/xml/ns/web/tomcat/config-1.0
 * Java type: org.apache.geronimo.xbeans.geronimo.web.tomcat.config.GerParameterType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.geronimo.web.tomcat.config.impl;
/**
 * An XML parameterType(@http://geronimo.apache.org/xml/ns/web/tomcat/config-1.0).
 *
 * This is a complex type.
 */
public class GerParameterTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.xbeans.geronimo.web.tomcat.config.GerParameterType
{
    private static final long serialVersionUID = 1L;
    
    public GerParameterTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("", "name");
    private static final javax.xml.namespace.QName VALUE$2 = 
        new javax.xml.namespace.QName("", "value");
    private static final javax.xml.namespace.QName OVERRIDE$4 = 
        new javax.xml.namespace.QName("", "override");
    
    
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
     * Gets the "value" attribute
     */
    public java.lang.String getValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "value" attribute
     */
    public org.apache.xmlbeans.XmlString xgetValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VALUE$2);
            return target;
        }
    }
    
    /**
     * True if has "value" attribute
     */
    public boolean isSetValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(VALUE$2) != null;
        }
    }
    
    /**
     * Sets the "value" attribute
     */
    public void setValue(java.lang.String value)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALUE$2);
            }
            target.setStringValue(value);
        }
    }
    
    /**
     * Sets (as xml) the "value" attribute
     */
    public void xsetValue(org.apache.xmlbeans.XmlString value)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VALUE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(VALUE$2);
            }
            target.set(value);
        }
    }
    
    /**
     * Unsets the "value" attribute
     */
    public void unsetValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(VALUE$2);
        }
    }
    
    /**
     * Gets the "override" attribute
     */
    public boolean getOverride()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OVERRIDE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(OVERRIDE$4);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "override" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetOverride()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(OVERRIDE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(OVERRIDE$4);
            }
            return target;
        }
    }
    
    /**
     * True if has "override" attribute
     */
    public boolean isSetOverride()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(OVERRIDE$4) != null;
        }
    }
    
    /**
     * Sets the "override" attribute
     */
    public void setOverride(boolean override)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OVERRIDE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OVERRIDE$4);
            }
            target.setBooleanValue(override);
        }
    }
    
    /**
     * Sets (as xml) the "override" attribute
     */
    public void xsetOverride(org.apache.xmlbeans.XmlBoolean override)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(OVERRIDE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(OVERRIDE$4);
            }
            target.set(override);
        }
    }
    
    /**
     * Unsets the "override" attribute
     */
    public void unsetOverride()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(OVERRIDE$4);
        }
    }
}
