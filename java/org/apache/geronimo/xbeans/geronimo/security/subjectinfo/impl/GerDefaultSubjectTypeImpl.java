/*
 * XML Type:  default-subjectType
 * Namespace: http://geronimo.apache.org/xml/ns/subject-info-1.0
 * Java type: org.apache.geronimo.xbeans.geronimo.security.subjectinfo.GerDefaultSubjectType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.geronimo.security.subjectinfo.impl;
/**
 * An XML default-subjectType(@http://geronimo.apache.org/xml/ns/subject-info-1.0).
 *
 * This is a complex type.
 */
public class GerDefaultSubjectTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.xbeans.geronimo.security.subjectinfo.GerDefaultSubjectType
{
    private static final long serialVersionUID = 1L;
    
    public GerDefaultSubjectTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DESCRIPTION$0 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/subject-info-1.0", "description");
    private static final javax.xml.namespace.QName REALM$2 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/subject-info-1.0", "realm");
    private static final javax.xml.namespace.QName ID$4 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/subject-info-1.0", "id");
    
    
    /**
     * Gets array of all "description" elements
     */
    public org.apache.geronimo.xbeans.geronimo.security.subjectinfo.GerDescriptionType[] getDescriptionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DESCRIPTION$0, targetList);
            org.apache.geronimo.xbeans.geronimo.security.subjectinfo.GerDescriptionType[] result = new org.apache.geronimo.xbeans.geronimo.security.subjectinfo.GerDescriptionType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "description" element
     */
    public org.apache.geronimo.xbeans.geronimo.security.subjectinfo.GerDescriptionType getDescriptionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.security.subjectinfo.GerDescriptionType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.security.subjectinfo.GerDescriptionType)get_store().find_element_user(DESCRIPTION$0, i);
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
    public void setDescriptionArray(org.apache.geronimo.xbeans.geronimo.security.subjectinfo.GerDescriptionType[] descriptionArray)
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
    public void setDescriptionArray(int i, org.apache.geronimo.xbeans.geronimo.security.subjectinfo.GerDescriptionType description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.security.subjectinfo.GerDescriptionType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.security.subjectinfo.GerDescriptionType)get_store().find_element_user(DESCRIPTION$0, i);
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
    public org.apache.geronimo.xbeans.geronimo.security.subjectinfo.GerDescriptionType insertNewDescription(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.security.subjectinfo.GerDescriptionType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.security.subjectinfo.GerDescriptionType)get_store().insert_element_user(DESCRIPTION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "description" element
     */
    public org.apache.geronimo.xbeans.geronimo.security.subjectinfo.GerDescriptionType addNewDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.security.subjectinfo.GerDescriptionType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.security.subjectinfo.GerDescriptionType)get_store().add_element_user(DESCRIPTION$0);
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
     * Gets the "realm" element
     */
    public java.lang.String getRealm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REALM$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "realm" element
     */
    public org.apache.xmlbeans.XmlString xgetRealm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REALM$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "realm" element
     */
    public void setRealm(java.lang.String realm)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REALM$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REALM$2);
            }
            target.setStringValue(realm);
        }
    }
    
    /**
     * Sets (as xml) the "realm" element
     */
    public void xsetRealm(org.apache.xmlbeans.XmlString realm)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REALM$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REALM$2);
            }
            target.set(realm);
        }
    }
    
    /**
     * Gets the "id" element
     */
    public java.lang.String getId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "id" element
     */
    public org.apache.xmlbeans.XmlString xgetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ID$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "id" element
     */
    public void setId(java.lang.String id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ID$4);
            }
            target.setStringValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "id" element
     */
    public void xsetId(org.apache.xmlbeans.XmlString id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ID$4);
            }
            target.set(id);
        }
    }
}
