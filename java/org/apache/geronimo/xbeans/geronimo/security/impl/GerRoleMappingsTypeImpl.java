/*
 * XML Type:  role-mappingsType
 * Namespace: http://geronimo.apache.org/xml/ns/security-2.0
 * Java type: org.apache.geronimo.xbeans.geronimo.security.GerRoleMappingsType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.geronimo.security.impl;
/**
 * An XML role-mappingsType(@http://geronimo.apache.org/xml/ns/security-2.0).
 *
 * This is a complex type.
 */
public class GerRoleMappingsTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.xbeans.geronimo.security.GerRoleMappingsType
{
    private static final long serialVersionUID = 1L;
    
    public GerRoleMappingsTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ROLE$0 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/security-2.0", "role");
    
    
    /**
     * Gets array of all "role" elements
     */
    public org.apache.geronimo.xbeans.geronimo.security.GerRoleType[] getRoleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ROLE$0, targetList);
            org.apache.geronimo.xbeans.geronimo.security.GerRoleType[] result = new org.apache.geronimo.xbeans.geronimo.security.GerRoleType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "role" element
     */
    public org.apache.geronimo.xbeans.geronimo.security.GerRoleType getRoleArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.security.GerRoleType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.security.GerRoleType)get_store().find_element_user(ROLE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "role" element
     */
    public int sizeOfRoleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ROLE$0);
        }
    }
    
    /**
     * Sets array of all "role" element
     */
    public void setRoleArray(org.apache.geronimo.xbeans.geronimo.security.GerRoleType[] roleArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(roleArray, ROLE$0);
        }
    }
    
    /**
     * Sets ith "role" element
     */
    public void setRoleArray(int i, org.apache.geronimo.xbeans.geronimo.security.GerRoleType role)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.security.GerRoleType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.security.GerRoleType)get_store().find_element_user(ROLE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(role);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "role" element
     */
    public org.apache.geronimo.xbeans.geronimo.security.GerRoleType insertNewRole(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.security.GerRoleType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.security.GerRoleType)get_store().insert_element_user(ROLE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "role" element
     */
    public org.apache.geronimo.xbeans.geronimo.security.GerRoleType addNewRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.security.GerRoleType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.security.GerRoleType)get_store().add_element_user(ROLE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "role" element
     */
    public void removeRole(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ROLE$0, i);
        }
    }
}
