/*
 * XML Type:  credential-storeType
 * Namespace: http://geronimo.apache.org/xml/ns/credentialstore-1.0
 * Java type: org.apache.geronimo.xbeans.geronimo.credentialstore.CredentialStoreType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.geronimo.credentialstore.impl;
/**
 * An XML credential-storeType(@http://geronimo.apache.org/xml/ns/credentialstore-1.0).
 *
 * This is a complex type.
 */
public class CredentialStoreTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.xbeans.geronimo.credentialstore.CredentialStoreType
{
    private static final long serialVersionUID = 1L;
    
    public CredentialStoreTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REALM$0 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/credentialstore-1.0", "realm");
    
    
    /**
     * Gets array of all "realm" elements
     */
    public org.apache.geronimo.xbeans.geronimo.credentialstore.RealmType[] getRealmArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(REALM$0, targetList);
            org.apache.geronimo.xbeans.geronimo.credentialstore.RealmType[] result = new org.apache.geronimo.xbeans.geronimo.credentialstore.RealmType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "realm" element
     */
    public org.apache.geronimo.xbeans.geronimo.credentialstore.RealmType getRealmArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.credentialstore.RealmType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.credentialstore.RealmType)get_store().find_element_user(REALM$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "realm" element
     */
    public int sizeOfRealmArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REALM$0);
        }
    }
    
    /**
     * Sets array of all "realm" element
     */
    public void setRealmArray(org.apache.geronimo.xbeans.geronimo.credentialstore.RealmType[] realmArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(realmArray, REALM$0);
        }
    }
    
    /**
     * Sets ith "realm" element
     */
    public void setRealmArray(int i, org.apache.geronimo.xbeans.geronimo.credentialstore.RealmType realm)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.credentialstore.RealmType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.credentialstore.RealmType)get_store().find_element_user(REALM$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(realm);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "realm" element
     */
    public org.apache.geronimo.xbeans.geronimo.credentialstore.RealmType insertNewRealm(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.credentialstore.RealmType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.credentialstore.RealmType)get_store().insert_element_user(REALM$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "realm" element
     */
    public org.apache.geronimo.xbeans.geronimo.credentialstore.RealmType addNewRealm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.credentialstore.RealmType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.credentialstore.RealmType)get_store().add_element_user(REALM$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "realm" element
     */
    public void removeRealm(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REALM$0, i);
        }
    }
}
