/*
 * XML Type:  gbean-refType
 * Namespace: http://geronimo.apache.org/xml/ns/naming-1.2
 * Java type: org.apache.geronimo.xbeans.geronimo.naming.GerGbeanRefType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.geronimo.naming.impl;
/**
 * An XML gbean-refType(@http://geronimo.apache.org/xml/ns/naming-1.2).
 *
 * This is a complex type.
 */
public class GerGbeanRefTypeImpl extends org.apache.geronimo.xbeans.geronimo.naming.impl.GerAbstractNamingEntryTypeImpl implements org.apache.geronimo.xbeans.geronimo.naming.GerGbeanRefType
{
    private static final long serialVersionUID = 1L;
    
    public GerGbeanRefTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REFNAME$0 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "ref-name");
    private static final javax.xml.namespace.QName REFTYPE$2 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "ref-type");
    private static final javax.xml.namespace.QName PATTERN$4 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "pattern");
    
    
    /**
     * Gets the "ref-name" element
     */
    public java.lang.String getRefName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ref-name" element
     */
    public org.apache.xmlbeans.XmlString xgetRefName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REFNAME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ref-name" element
     */
    public void setRefName(java.lang.String refName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REFNAME$0);
            }
            target.setStringValue(refName);
        }
    }
    
    /**
     * Sets (as xml) the "ref-name" element
     */
    public void xsetRefName(org.apache.xmlbeans.XmlString refName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REFNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REFNAME$0);
            }
            target.set(refName);
        }
    }
    
    /**
     * Gets array of all "ref-type" elements
     */
    public java.lang.String[] getRefTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(REFTYPE$2, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "ref-type" element
     */
    public java.lang.String getRefTypeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFTYPE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "ref-type" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetRefTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(REFTYPE$2, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "ref-type" element
     */
    public org.apache.xmlbeans.XmlString xgetRefTypeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REFTYPE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "ref-type" element
     */
    public int sizeOfRefTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REFTYPE$2);
        }
    }
    
    /**
     * Sets array of all "ref-type" element
     */
    public void setRefTypeArray(java.lang.String[] refTypeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(refTypeArray, REFTYPE$2);
        }
    }
    
    /**
     * Sets ith "ref-type" element
     */
    public void setRefTypeArray(int i, java.lang.String refType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFTYPE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(refType);
        }
    }
    
    /**
     * Sets (as xml) array of all "ref-type" element
     */
    public void xsetRefTypeArray(org.apache.xmlbeans.XmlString[]refTypeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(refTypeArray, REFTYPE$2);
        }
    }
    
    /**
     * Sets (as xml) ith "ref-type" element
     */
    public void xsetRefTypeArray(int i, org.apache.xmlbeans.XmlString refType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REFTYPE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(refType);
        }
    }
    
    /**
     * Inserts the value as the ith "ref-type" element
     */
    public void insertRefType(int i, java.lang.String refType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(REFTYPE$2, i);
            target.setStringValue(refType);
        }
    }
    
    /**
     * Appends the value as the last "ref-type" element
     */
    public void addRefType(java.lang.String refType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REFTYPE$2);
            target.setStringValue(refType);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ref-type" element
     */
    public org.apache.xmlbeans.XmlString insertNewRefType(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(REFTYPE$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ref-type" element
     */
    public org.apache.xmlbeans.XmlString addNewRefType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REFTYPE$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "ref-type" element
     */
    public void removeRefType(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REFTYPE$2, i);
        }
    }
    
    /**
     * Gets array of all "pattern" elements
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerPatternType[] getPatternArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PATTERN$4, targetList);
            org.apache.geronimo.xbeans.geronimo.naming.GerPatternType[] result = new org.apache.geronimo.xbeans.geronimo.naming.GerPatternType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "pattern" element
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerPatternType getPatternArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerPatternType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerPatternType)get_store().find_element_user(PATTERN$4, i);
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
            return get_store().count_elements(PATTERN$4);
        }
    }
    
    /**
     * Sets array of all "pattern" element
     */
    public void setPatternArray(org.apache.geronimo.xbeans.geronimo.naming.GerPatternType[] patternArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(patternArray, PATTERN$4);
        }
    }
    
    /**
     * Sets ith "pattern" element
     */
    public void setPatternArray(int i, org.apache.geronimo.xbeans.geronimo.naming.GerPatternType pattern)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerPatternType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerPatternType)get_store().find_element_user(PATTERN$4, i);
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
    public org.apache.geronimo.xbeans.geronimo.naming.GerPatternType insertNewPattern(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerPatternType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerPatternType)get_store().insert_element_user(PATTERN$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "pattern" element
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerPatternType addNewPattern()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerPatternType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerPatternType)get_store().add_element_user(PATTERN$4);
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
            get_store().remove_element(PATTERN$4, i);
        }
    }
}
