/*
 * XML Type:  distinguishedNameType
 * Namespace: http://geronimo.apache.org/xml/ns/security-2.0
 * Java type: org.apache.geronimo.xbeans.geronimo.security.GerDistinguishedNameType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.geronimo.security.impl;
/**
 * An XML distinguishedNameType(@http://geronimo.apache.org/xml/ns/security-2.0).
 *
 * This is a complex type.
 */
public class GerDistinguishedNameTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.xbeans.geronimo.security.GerDistinguishedNameType
{
    private static final long serialVersionUID = 1L;
    
    public GerDistinguishedNameTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DESCRIPTION$0 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/security-2.0", "description");
    private static final javax.xml.namespace.QName NAME$2 = 
        new javax.xml.namespace.QName("", "name");
    
    
    /**
     * Gets array of all "description" elements
     */
    public org.apache.geronimo.xbeans.geronimo.security.GerDescriptionType[] getDescriptionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DESCRIPTION$0, targetList);
            org.apache.geronimo.xbeans.geronimo.security.GerDescriptionType[] result = new org.apache.geronimo.xbeans.geronimo.security.GerDescriptionType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "description" element
     */
    public org.apache.geronimo.xbeans.geronimo.security.GerDescriptionType getDescriptionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.security.GerDescriptionType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.security.GerDescriptionType)get_store().find_element_user(DESCRIPTION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "description" element
     */
    public int sizeOfDescriptionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DESCRIPTION$0);
        }
    }
    
    /**
     * Sets array of all "description" element
     */
    public void setDescriptionArray(org.apache.geronimo.xbeans.geronimo.security.GerDescriptionType[] descriptionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(descriptionArray, DESCRIPTION$0);
        }
    }
    
    /**
     * Sets ith "description" element
     */
    public void setDescriptionArray(int i, org.apache.geronimo.xbeans.geronimo.security.GerDescriptionType description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.security.GerDescriptionType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.security.GerDescriptionType)get_store().find_element_user(DESCRIPTION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(description);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "description" element
     */
    public org.apache.geronimo.xbeans.geronimo.security.GerDescriptionType insertNewDescription(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.security.GerDescriptionType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.security.GerDescriptionType)get_store().insert_element_user(DESCRIPTION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "description" element
     */
    public org.apache.geronimo.xbeans.geronimo.security.GerDescriptionType addNewDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.security.GerDescriptionType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.security.GerDescriptionType)get_store().add_element_user(DESCRIPTION$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "description" element
     */
    public void removeDescription(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DESCRIPTION$0, i);
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
}
