/*
 * XML Type:  javabeanType
 * Namespace: http://geronimo.apache.org/xml/ns/deployment/javabean-1.0
 * Java type: org.apache.geronimo.deployment.javabean.xbeans.JavabeanType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.deployment.javabean.xbeans.impl;
/**
 * An XML javabeanType(@http://geronimo.apache.org/xml/ns/deployment/javabean-1.0).
 *
 * This is a complex type.
 */
public class JavabeanTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.deployment.javabean.xbeans.JavabeanType
{
    private static final long serialVersionUID = 1L;
    
    public JavabeanTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROPERTY$0 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/deployment/javabean-1.0", "property");
    private static final javax.xml.namespace.QName BEANPROPERTY$2 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/deployment/javabean-1.0", "bean-property");
    private static final javax.xml.namespace.QName CLASS1$4 = 
        new javax.xml.namespace.QName("", "class");
    
    
    /**
     * Gets array of all "property" elements
     */
    public org.apache.geronimo.deployment.javabean.xbeans.PropertyType[] getPropertyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PROPERTY$0, targetList);
            org.apache.geronimo.deployment.javabean.xbeans.PropertyType[] result = new org.apache.geronimo.deployment.javabean.xbeans.PropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "property" element
     */
    public org.apache.geronimo.deployment.javabean.xbeans.PropertyType getPropertyArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.javabean.xbeans.PropertyType target = null;
            target = (org.apache.geronimo.deployment.javabean.xbeans.PropertyType)get_store().find_element_user(PROPERTY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "property" element
     */
    public int sizeOfPropertyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROPERTY$0);
        }
    }
    
    /**
     * Sets array of all "property" element
     */
    public void setPropertyArray(org.apache.geronimo.deployment.javabean.xbeans.PropertyType[] propertyArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(propertyArray, PROPERTY$0);
        }
    }
    
    /**
     * Sets ith "property" element
     */
    public void setPropertyArray(int i, org.apache.geronimo.deployment.javabean.xbeans.PropertyType property)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.javabean.xbeans.PropertyType target = null;
            target = (org.apache.geronimo.deployment.javabean.xbeans.PropertyType)get_store().find_element_user(PROPERTY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(property);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "property" element
     */
    public org.apache.geronimo.deployment.javabean.xbeans.PropertyType insertNewProperty(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.javabean.xbeans.PropertyType target = null;
            target = (org.apache.geronimo.deployment.javabean.xbeans.PropertyType)get_store().insert_element_user(PROPERTY$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "property" element
     */
    public org.apache.geronimo.deployment.javabean.xbeans.PropertyType addNewProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.javabean.xbeans.PropertyType target = null;
            target = (org.apache.geronimo.deployment.javabean.xbeans.PropertyType)get_store().add_element_user(PROPERTY$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "property" element
     */
    public void removeProperty(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROPERTY$0, i);
        }
    }
    
    /**
     * Gets array of all "bean-property" elements
     */
    public org.apache.geronimo.deployment.javabean.xbeans.BeanPropertyType[] getBeanPropertyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(BEANPROPERTY$2, targetList);
            org.apache.geronimo.deployment.javabean.xbeans.BeanPropertyType[] result = new org.apache.geronimo.deployment.javabean.xbeans.BeanPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "bean-property" element
     */
    public org.apache.geronimo.deployment.javabean.xbeans.BeanPropertyType getBeanPropertyArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.javabean.xbeans.BeanPropertyType target = null;
            target = (org.apache.geronimo.deployment.javabean.xbeans.BeanPropertyType)get_store().find_element_user(BEANPROPERTY$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "bean-property" element
     */
    public int sizeOfBeanPropertyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BEANPROPERTY$2);
        }
    }
    
    /**
     * Sets array of all "bean-property" element
     */
    public void setBeanPropertyArray(org.apache.geronimo.deployment.javabean.xbeans.BeanPropertyType[] beanPropertyArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(beanPropertyArray, BEANPROPERTY$2);
        }
    }
    
    /**
     * Sets ith "bean-property" element
     */
    public void setBeanPropertyArray(int i, org.apache.geronimo.deployment.javabean.xbeans.BeanPropertyType beanProperty)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.javabean.xbeans.BeanPropertyType target = null;
            target = (org.apache.geronimo.deployment.javabean.xbeans.BeanPropertyType)get_store().find_element_user(BEANPROPERTY$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(beanProperty);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "bean-property" element
     */
    public org.apache.geronimo.deployment.javabean.xbeans.BeanPropertyType insertNewBeanProperty(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.javabean.xbeans.BeanPropertyType target = null;
            target = (org.apache.geronimo.deployment.javabean.xbeans.BeanPropertyType)get_store().insert_element_user(BEANPROPERTY$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "bean-property" element
     */
    public org.apache.geronimo.deployment.javabean.xbeans.BeanPropertyType addNewBeanProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.javabean.xbeans.BeanPropertyType target = null;
            target = (org.apache.geronimo.deployment.javabean.xbeans.BeanPropertyType)get_store().add_element_user(BEANPROPERTY$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "bean-property" element
     */
    public void removeBeanProperty(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BEANPROPERTY$2, i);
        }
    }
    
    /**
     * Gets the "class" attribute
     */
    public java.lang.String getClass1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASS1$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "class" attribute
     */
    public org.apache.xmlbeans.XmlString xgetClass1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CLASS1$4);
            return target;
        }
    }
    
    /**
     * True if has "class" attribute
     */
    public boolean isSetClass1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CLASS1$4) != null;
        }
    }
    
    /**
     * Sets the "class" attribute
     */
    public void setClass1(java.lang.String class1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASS1$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CLASS1$4);
            }
            target.setStringValue(class1);
        }
    }
    
    /**
     * Sets (as xml) the "class" attribute
     */
    public void xsetClass1(org.apache.xmlbeans.XmlString class1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CLASS1$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CLASS1$4);
            }
            target.set(class1);
        }
    }
    
    /**
     * Unsets the "class" attribute
     */
    public void unsetClass1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CLASS1$4);
        }
    }
}
