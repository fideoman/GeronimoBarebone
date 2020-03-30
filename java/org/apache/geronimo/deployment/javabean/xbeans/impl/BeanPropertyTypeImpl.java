/*
 * XML Type:  bean-propertyType
 * Namespace: http://geronimo.apache.org/xml/ns/deployment/javabean-1.0
 * Java type: org.apache.geronimo.deployment.javabean.xbeans.BeanPropertyType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.deployment.javabean.xbeans.impl;
/**
 * An XML bean-propertyType(@http://geronimo.apache.org/xml/ns/deployment/javabean-1.0).
 *
 * This is a complex type.
 */
public class BeanPropertyTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.deployment.javabean.xbeans.BeanPropertyType
{
    private static final long serialVersionUID = 1L;
    
    public BeanPropertyTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName JAVABEAN$0 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/deployment/javabean-1.0", "javabean");
    private static final javax.xml.namespace.QName NAME$2 = 
        new javax.xml.namespace.QName("", "name");
    
    
    /**
     * Gets the "javabean" element
     */
    public org.apache.geronimo.deployment.javabean.xbeans.JavabeanType getJavabean()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.javabean.xbeans.JavabeanType target = null;
            target = (org.apache.geronimo.deployment.javabean.xbeans.JavabeanType)get_store().find_element_user(JAVABEAN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "javabean" element
     */
    public void setJavabean(org.apache.geronimo.deployment.javabean.xbeans.JavabeanType javabean)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.javabean.xbeans.JavabeanType target = null;
            target = (org.apache.geronimo.deployment.javabean.xbeans.JavabeanType)get_store().find_element_user(JAVABEAN$0, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.deployment.javabean.xbeans.JavabeanType)get_store().add_element_user(JAVABEAN$0);
            }
            target.set(javabean);
        }
    }
    
    /**
     * Appends and returns a new empty "javabean" element
     */
    public org.apache.geronimo.deployment.javabean.xbeans.JavabeanType addNewJavabean()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.javabean.xbeans.JavabeanType target = null;
            target = (org.apache.geronimo.deployment.javabean.xbeans.JavabeanType)get_store().add_element_user(JAVABEAN$0);
            return target;
        }
    }
    
    /**
     * Gets the "name" attribute
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$2);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$2);
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
            return get_store().find_attribute_user(NAME$2) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$2);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$2);
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
            get_store().remove_attribute(NAME$2);
        }
    }
}
