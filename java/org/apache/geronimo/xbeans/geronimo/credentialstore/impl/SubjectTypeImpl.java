/*
 * XML Type:  subjectType
 * Namespace: http://geronimo.apache.org/xml/ns/credentialstore-1.0
 * Java type: org.apache.geronimo.xbeans.geronimo.credentialstore.SubjectType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.geronimo.credentialstore.impl;
/**
 * An XML subjectType(@http://geronimo.apache.org/xml/ns/credentialstore-1.0).
 *
 * This is a complex type.
 */
public class SubjectTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.xbeans.geronimo.credentialstore.SubjectType
{
    private static final long serialVersionUID = 1L;
    
    public SubjectTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ID$0 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/credentialstore-1.0", "id");
    private static final javax.xml.namespace.QName CREDENTIAL$2 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/credentialstore-1.0", "credential");
    
    
    /**
     * Gets the "id" element
     */
    public java.lang.String getId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$0, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ID$0, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ID$0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ID$0);
            }
            target.set(id);
        }
    }
    
    /**
     * Gets array of all "credential" elements
     */
    public org.apache.geronimo.xbeans.geronimo.credentialstore.CredentialType[] getCredentialArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CREDENTIAL$2, targetList);
            org.apache.geronimo.xbeans.geronimo.credentialstore.CredentialType[] result = new org.apache.geronimo.xbeans.geronimo.credentialstore.CredentialType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "credential" element
     */
    public org.apache.geronimo.xbeans.geronimo.credentialstore.CredentialType getCredentialArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.credentialstore.CredentialType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.credentialstore.CredentialType)get_store().find_element_user(CREDENTIAL$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "credential" element
     */
    public int sizeOfCredentialArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CREDENTIAL$2);
        }
    }
    
    /**
     * Sets array of all "credential" element
     */
    public void setCredentialArray(org.apache.geronimo.xbeans.geronimo.credentialstore.CredentialType[] credentialArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(credentialArray, CREDENTIAL$2);
        }
    }
    
    /**
     * Sets ith "credential" element
     */
    public void setCredentialArray(int i, org.apache.geronimo.xbeans.geronimo.credentialstore.CredentialType credential)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.credentialstore.CredentialType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.credentialstore.CredentialType)get_store().find_element_user(CREDENTIAL$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(credential);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "credential" element
     */
    public org.apache.geronimo.xbeans.geronimo.credentialstore.CredentialType insertNewCredential(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.credentialstore.CredentialType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.credentialstore.CredentialType)get_store().insert_element_user(CREDENTIAL$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "credential" element
     */
    public org.apache.geronimo.xbeans.geronimo.credentialstore.CredentialType addNewCredential()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.credentialstore.CredentialType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.credentialstore.CredentialType)get_store().add_element_user(CREDENTIAL$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "credential" element
     */
    public void removeCredential(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CREDENTIAL$2, i);
        }
    }
}
