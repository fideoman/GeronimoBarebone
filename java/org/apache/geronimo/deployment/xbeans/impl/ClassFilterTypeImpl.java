/*
 * XML Type:  classFilterType
 * Namespace: http://geronimo.apache.org/xml/ns/deployment-1.2
 * Java type: org.apache.geronimo.deployment.xbeans.ClassFilterType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.deployment.xbeans.impl;
/**
 * An XML classFilterType(@http://geronimo.apache.org/xml/ns/deployment-1.2).
 *
 * This is a complex type.
 */
public class ClassFilterTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.deployment.xbeans.ClassFilterType
{
    private static final long serialVersionUID = 1L;
    
    public ClassFilterTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FILTER$0 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/deployment-1.2", "filter");
    
    
    /**
     * Gets array of all "filter" elements
     */
    public java.lang.String[] getFilterArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FILTER$0, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "filter" element
     */
    public java.lang.String getFilterArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FILTER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "filter" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetFilterArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FILTER$0, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "filter" element
     */
    public org.apache.xmlbeans.XmlString xgetFilterArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FILTER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "filter" element
     */
    public int sizeOfFilterArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FILTER$0);
        }
    }
    
    /**
     * Sets array of all "filter" element
     */
    public void setFilterArray(java.lang.String[] filterArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(filterArray, FILTER$0);
        }
    }
    
    /**
     * Sets ith "filter" element
     */
    public void setFilterArray(int i, java.lang.String filter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FILTER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(filter);
        }
    }
    
    /**
     * Sets (as xml) array of all "filter" element
     */
    public void xsetFilterArray(org.apache.xmlbeans.XmlString[]filterArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(filterArray, FILTER$0);
        }
    }
    
    /**
     * Sets (as xml) ith "filter" element
     */
    public void xsetFilterArray(int i, org.apache.xmlbeans.XmlString filter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FILTER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(filter);
        }
    }
    
    /**
     * Inserts the value as the ith "filter" element
     */
    public void insertFilter(int i, java.lang.String filter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(FILTER$0, i);
            target.setStringValue(filter);
        }
    }
    
    /**
     * Appends the value as the last "filter" element
     */
    public void addFilter(java.lang.String filter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FILTER$0);
            target.setStringValue(filter);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "filter" element
     */
    public org.apache.xmlbeans.XmlString insertNewFilter(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(FILTER$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "filter" element
     */
    public org.apache.xmlbeans.XmlString addNewFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FILTER$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "filter" element
     */
    public void removeFilter(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FILTER$0, i);
        }
    }
}
