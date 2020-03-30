/*
 * XML Type:  role-mappingsType
 * Namespace: http://geronimo.apache.org/xml/ns/security-1.2
 * Java type: org.apache.geronimo.xml.ns.security12.RoleMappingsType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xml.ns.security12.impl;
/**
 * An XML role-mappingsType(@http://geronimo.apache.org/xml/ns/security-1.2).
 *
 * This is a complex type.
 */
public class RoleMappingsTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.xml.ns.security12.RoleMappingsType
{
    private static final long serialVersionUID = 1L;
    
    public RoleMappingsTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ROLE$0 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/security-1.2", "role");
    
    
    /**
     * Gets array of all "role" elements
     */
    public org.apache.geronimo.xml.ns.security12.RoleType[] getRoleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ROLE$0, targetList);
            org.apache.geronimo.xml.ns.security12.RoleType[] result = new org.apache.geronimo.xml.ns.security12.RoleType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "role" element
     */
    public org.apache.geronimo.xml.ns.security12.RoleType getRoleArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xml.ns.security12.RoleType target = null;
            target = (org.apache.geronimo.xml.ns.security12.RoleType)get_store().find_element_user(ROLE$0, i);
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
    public void setRoleArray(org.apache.geronimo.xml.ns.security12.RoleType[] roleArray)
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
    public void setRoleArray(int i, org.apache.geronimo.xml.ns.security12.RoleType role)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xml.ns.security12.RoleType target = null;
            target = (org.apache.geronimo.xml.ns.security12.RoleType)get_store().find_element_user(ROLE$0, i);
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
    public org.apache.geronimo.xml.ns.security12.RoleType insertNewRole(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xml.ns.security12.RoleType target = null;
            target = (org.apache.geronimo.xml.ns.security12.RoleType)get_store().insert_element_user(ROLE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "role" element
     */
    public org.apache.geronimo.xml.ns.security12.RoleType addNewRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xml.ns.security12.RoleType target = null;
            target = (org.apache.geronimo.xml.ns.security12.RoleType)get_store().add_element_user(ROLE$0);
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
