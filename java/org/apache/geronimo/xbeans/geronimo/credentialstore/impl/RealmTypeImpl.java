/*
 * XML Type:  realmType
 * Namespace: http://geronimo.apache.org/xml/ns/credentialstore-1.0
 * Java type: org.apache.geronimo.xbeans.geronimo.credentialstore.RealmType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.geronimo.credentialstore.impl;
/**
 * An XML realmType(@http://geronimo.apache.org/xml/ns/credentialstore-1.0).
 *
 * This is a complex type.
 */
public class RealmTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.xbeans.geronimo.credentialstore.RealmType
{
    private static final long serialVersionUID = 1L;
    
    public RealmTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUBJECT$0 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/credentialstore-1.0", "subject");
    private static final javax.xml.namespace.QName NAME$2 = 
        new javax.xml.namespace.QName("", "name");
    
    
    /**
     * Gets array of all "subject" elements
     */
    public org.apache.geronimo.xbeans.geronimo.credentialstore.SubjectType[] getSubjectArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SUBJECT$0, targetList);
            org.apache.geronimo.xbeans.geronimo.credentialstore.SubjectType[] result = new org.apache.geronimo.xbeans.geronimo.credentialstore.SubjectType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "subject" element
     */
    public org.apache.geronimo.xbeans.geronimo.credentialstore.SubjectType getSubjectArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.credentialstore.SubjectType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.credentialstore.SubjectType)get_store().find_element_user(SUBJECT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "subject" element
     */
    public int sizeOfSubjectArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBJECT$0);
        }
    }
    
    /**
     * Sets array of all "subject" element
     */
    public void setSubjectArray(org.apache.geronimo.xbeans.geronimo.credentialstore.SubjectType[] subjectArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(subjectArray, SUBJECT$0);
        }
    }
    
    /**
     * Sets ith "subject" element
     */
    public void setSubjectArray(int i, org.apache.geronimo.xbeans.geronimo.credentialstore.SubjectType subject)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.credentialstore.SubjectType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.credentialstore.SubjectType)get_store().find_element_user(SUBJECT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(subject);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "subject" element
     */
    public org.apache.geronimo.xbeans.geronimo.credentialstore.SubjectType insertNewSubject(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.credentialstore.SubjectType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.credentialstore.SubjectType)get_store().insert_element_user(SUBJECT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "subject" element
     */
    public org.apache.geronimo.xbeans.geronimo.credentialstore.SubjectType addNewSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.credentialstore.SubjectType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.credentialstore.SubjectType)get_store().add_element_user(SUBJECT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "subject" element
     */
    public void removeSubject(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBJECT$0, i);
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
