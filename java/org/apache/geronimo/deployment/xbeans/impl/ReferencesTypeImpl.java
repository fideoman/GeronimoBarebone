/*
 * XML Type:  referencesType
 * Namespace: http://geronimo.apache.org/xml/ns/deployment-1.2
 * Java type: org.apache.geronimo.deployment.xbeans.ReferencesType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.deployment.xbeans.impl;
/**
 * An XML referencesType(@http://geronimo.apache.org/xml/ns/deployment-1.2).
 *
 * This is a complex type.
 */
public class ReferencesTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.deployment.xbeans.ReferencesType
{
    private static final long serialVersionUID = 1L;
    
    public ReferencesTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PATTERN$0 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/deployment-1.2", "pattern");
    private static final javax.xml.namespace.QName NAME$2 = 
        new javax.xml.namespace.QName("", "name");
    
    
    /**
     * Gets array of all "pattern" elements
     */
    public org.apache.geronimo.deployment.xbeans.PatternType[] getPatternArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PATTERN$0, targetList);
            org.apache.geronimo.deployment.xbeans.PatternType[] result = new org.apache.geronimo.deployment.xbeans.PatternType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "pattern" element
     */
    public org.apache.geronimo.deployment.xbeans.PatternType getPatternArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.xbeans.PatternType target = null;
            target = (org.apache.geronimo.deployment.xbeans.PatternType)get_store().find_element_user(PATTERN$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "pattern" element
     */
    public int sizeOfPatternArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PATTERN$0);
        }
    }
    
    /**
     * Sets array of all "pattern" element
     */
    public void setPatternArray(org.apache.geronimo.deployment.xbeans.PatternType[] patternArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(patternArray, PATTERN$0);
        }
    }
    
    /**
     * Sets ith "pattern" element
     */
    public void setPatternArray(int i, org.apache.geronimo.deployment.xbeans.PatternType pattern)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.xbeans.PatternType target = null;
            target = (org.apache.geronimo.deployment.xbeans.PatternType)get_store().find_element_user(PATTERN$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(pattern);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "pattern" element
     */
    public org.apache.geronimo.deployment.xbeans.PatternType insertNewPattern(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.xbeans.PatternType target = null;
            target = (org.apache.geronimo.deployment.xbeans.PatternType)get_store().insert_element_user(PATTERN$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "pattern" element
     */
    public org.apache.geronimo.deployment.xbeans.PatternType addNewPattern()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.xbeans.PatternType target = null;
            target = (org.apache.geronimo.deployment.xbeans.PatternType)get_store().add_element_user(PATTERN$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "pattern" element
     */
    public void removePattern(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PATTERN$0, i);
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
