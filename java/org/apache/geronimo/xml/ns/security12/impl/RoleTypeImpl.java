/*
 * XML Type:  roleType
 * Namespace: http://geronimo.apache.org/xml/ns/security-1.2
 * Java type: org.apache.geronimo.xml.ns.security12.RoleType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xml.ns.security12.impl;
/**
 * An XML roleType(@http://geronimo.apache.org/xml/ns/security-1.2).
 *
 * This is a complex type.
 */
public class RoleTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.xml.ns.security12.RoleType
{
    private static final long serialVersionUID = 1L;
    
    public RoleTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DESCRIPTION$0 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/security-1.2", "description");
    private static final javax.xml.namespace.QName REALMPRINCIPAL$2 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/security-1.2", "realm-principal");
    private static final javax.xml.namespace.QName LOGINDOMAINPRINCIPAL$4 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/security-1.2", "login-domain-principal");
    private static final javax.xml.namespace.QName PRINCIPAL$6 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/security-1.2", "principal");
    private static final javax.xml.namespace.QName DISTINGUISHEDNAME$8 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/security-1.2", "distinguished-name");
    private static final javax.xml.namespace.QName ROLENAME$10 = 
        new javax.xml.namespace.QName("", "role-name");
    
    
    /**
     * Gets array of all "description" elements
     */
    public org.apache.geronimo.xml.ns.security12.DescriptionType[] getDescriptionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DESCRIPTION$0, targetList);
            org.apache.geronimo.xml.ns.security12.DescriptionType[] result = new org.apache.geronimo.xml.ns.security12.DescriptionType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "description" element
     */
    public org.apache.geronimo.xml.ns.security12.DescriptionType getDescriptionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xml.ns.security12.DescriptionType target = null;
            target = (org.apache.geronimo.xml.ns.security12.DescriptionType)get_store().find_element_user(DESCRIPTION$0, i);
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
    public void setDescriptionArray(org.apache.geronimo.xml.ns.security12.DescriptionType[] descriptionArray)
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
    public void setDescriptionArray(int i, org.apache.geronimo.xml.ns.security12.DescriptionType description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xml.ns.security12.DescriptionType target = null;
            target = (org.apache.geronimo.xml.ns.security12.DescriptionType)get_store().find_element_user(DESCRIPTION$0, i);
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
    public org.apache.geronimo.xml.ns.security12.DescriptionType insertNewDescription(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xml.ns.security12.DescriptionType target = null;
            target = (org.apache.geronimo.xml.ns.security12.DescriptionType)get_store().insert_element_user(DESCRIPTION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "description" element
     */
    public org.apache.geronimo.xml.ns.security12.DescriptionType addNewDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xml.ns.security12.DescriptionType target = null;
            target = (org.apache.geronimo.xml.ns.security12.DescriptionType)get_store().add_element_user(DESCRIPTION$0);
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
     * Gets array of all "realm-principal" elements
     */
    public org.apache.geronimo.xml.ns.security12.RealmPrincipalType[] getRealmPrincipalArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(REALMPRINCIPAL$2, targetList);
            org.apache.geronimo.xml.ns.security12.RealmPrincipalType[] result = new org.apache.geronimo.xml.ns.security12.RealmPrincipalType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "realm-principal" element
     */
    public org.apache.geronimo.xml.ns.security12.RealmPrincipalType getRealmPrincipalArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xml.ns.security12.RealmPrincipalType target = null;
            target = (org.apache.geronimo.xml.ns.security12.RealmPrincipalType)get_store().find_element_user(REALMPRINCIPAL$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "realm-principal" element
     */
    public int sizeOfRealmPrincipalArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REALMPRINCIPAL$2);
        }
    }
    
    /**
     * Sets array of all "realm-principal" element
     */
    public void setRealmPrincipalArray(org.apache.geronimo.xml.ns.security12.RealmPrincipalType[] realmPrincipalArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(realmPrincipalArray, REALMPRINCIPAL$2);
        }
    }
    
    /**
     * Sets ith "realm-principal" element
     */
    public void setRealmPrincipalArray(int i, org.apache.geronimo.xml.ns.security12.RealmPrincipalType realmPrincipal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xml.ns.security12.RealmPrincipalType target = null;
            target = (org.apache.geronimo.xml.ns.security12.RealmPrincipalType)get_store().find_element_user(REALMPRINCIPAL$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(realmPrincipal);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "realm-principal" element
     */
    public org.apache.geronimo.xml.ns.security12.RealmPrincipalType insertNewRealmPrincipal(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xml.ns.security12.RealmPrincipalType target = null;
            target = (org.apache.geronimo.xml.ns.security12.RealmPrincipalType)get_store().insert_element_user(REALMPRINCIPAL$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "realm-principal" element
     */
    public org.apache.geronimo.xml.ns.security12.RealmPrincipalType addNewRealmPrincipal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xml.ns.security12.RealmPrincipalType target = null;
            target = (org.apache.geronimo.xml.ns.security12.RealmPrincipalType)get_store().add_element_user(REALMPRINCIPAL$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "realm-principal" element
     */
    public void removeRealmPrincipal(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REALMPRINCIPAL$2, i);
        }
    }
    
    /**
     * Gets array of all "login-domain-principal" elements
     */
    public org.apache.geronimo.xml.ns.security12.LoginDomainPrincipalType[] getLoginDomainPrincipalArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LOGINDOMAINPRINCIPAL$4, targetList);
            org.apache.geronimo.xml.ns.security12.LoginDomainPrincipalType[] result = new org.apache.geronimo.xml.ns.security12.LoginDomainPrincipalType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "login-domain-principal" element
     */
    public org.apache.geronimo.xml.ns.security12.LoginDomainPrincipalType getLoginDomainPrincipalArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xml.ns.security12.LoginDomainPrincipalType target = null;
            target = (org.apache.geronimo.xml.ns.security12.LoginDomainPrincipalType)get_store().find_element_user(LOGINDOMAINPRINCIPAL$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "login-domain-principal" element
     */
    public int sizeOfLoginDomainPrincipalArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOGINDOMAINPRINCIPAL$4);
        }
    }
    
    /**
     * Sets array of all "login-domain-principal" element
     */
    public void setLoginDomainPrincipalArray(org.apache.geronimo.xml.ns.security12.LoginDomainPrincipalType[] loginDomainPrincipalArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(loginDomainPrincipalArray, LOGINDOMAINPRINCIPAL$4);
        }
    }
    
    /**
     * Sets ith "login-domain-principal" element
     */
    public void setLoginDomainPrincipalArray(int i, org.apache.geronimo.xml.ns.security12.LoginDomainPrincipalType loginDomainPrincipal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xml.ns.security12.LoginDomainPrincipalType target = null;
            target = (org.apache.geronimo.xml.ns.security12.LoginDomainPrincipalType)get_store().find_element_user(LOGINDOMAINPRINCIPAL$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(loginDomainPrincipal);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "login-domain-principal" element
     */
    public org.apache.geronimo.xml.ns.security12.LoginDomainPrincipalType insertNewLoginDomainPrincipal(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xml.ns.security12.LoginDomainPrincipalType target = null;
            target = (org.apache.geronimo.xml.ns.security12.LoginDomainPrincipalType)get_store().insert_element_user(LOGINDOMAINPRINCIPAL$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "login-domain-principal" element
     */
    public org.apache.geronimo.xml.ns.security12.LoginDomainPrincipalType addNewLoginDomainPrincipal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xml.ns.security12.LoginDomainPrincipalType target = null;
            target = (org.apache.geronimo.xml.ns.security12.LoginDomainPrincipalType)get_store().add_element_user(LOGINDOMAINPRINCIPAL$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "login-domain-principal" element
     */
    public void removeLoginDomainPrincipal(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOGINDOMAINPRINCIPAL$4, i);
        }
    }
    
    /**
     * Gets array of all "principal" elements
     */
    public org.apache.geronimo.xml.ns.security12.PrincipalType[] getPrincipalArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PRINCIPAL$6, targetList);
            org.apache.geronimo.xml.ns.security12.PrincipalType[] result = new org.apache.geronimo.xml.ns.security12.PrincipalType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "principal" element
     */
    public org.apache.geronimo.xml.ns.security12.PrincipalType getPrincipalArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xml.ns.security12.PrincipalType target = null;
            target = (org.apache.geronimo.xml.ns.security12.PrincipalType)get_store().find_element_user(PRINCIPAL$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "principal" element
     */
    public int sizeOfPrincipalArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRINCIPAL$6);
        }
    }
    
    /**
     * Sets array of all "principal" element
     */
    public void setPrincipalArray(org.apache.geronimo.xml.ns.security12.PrincipalType[] principalArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(principalArray, PRINCIPAL$6);
        }
    }
    
    /**
     * Sets ith "principal" element
     */
    public void setPrincipalArray(int i, org.apache.geronimo.xml.ns.security12.PrincipalType principal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xml.ns.security12.PrincipalType target = null;
            target = (org.apache.geronimo.xml.ns.security12.PrincipalType)get_store().find_element_user(PRINCIPAL$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(principal);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "principal" element
     */
    public org.apache.geronimo.xml.ns.security12.PrincipalType insertNewPrincipal(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xml.ns.security12.PrincipalType target = null;
            target = (org.apache.geronimo.xml.ns.security12.PrincipalType)get_store().insert_element_user(PRINCIPAL$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "principal" element
     */
    public org.apache.geronimo.xml.ns.security12.PrincipalType addNewPrincipal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xml.ns.security12.PrincipalType target = null;
            target = (org.apache.geronimo.xml.ns.security12.PrincipalType)get_store().add_element_user(PRINCIPAL$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "principal" element
     */
    public void removePrincipal(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRINCIPAL$6, i);
        }
    }
    
    /**
     * Gets array of all "distinguished-name" elements
     */
    public org.apache.geronimo.xml.ns.security12.DistinguishedNameType[] getDistinguishedNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DISTINGUISHEDNAME$8, targetList);
            org.apache.geronimo.xml.ns.security12.DistinguishedNameType[] result = new org.apache.geronimo.xml.ns.security12.DistinguishedNameType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "distinguished-name" element
     */
    public org.apache.geronimo.xml.ns.security12.DistinguishedNameType getDistinguishedNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xml.ns.security12.DistinguishedNameType target = null;
            target = (org.apache.geronimo.xml.ns.security12.DistinguishedNameType)get_store().find_element_user(DISTINGUISHEDNAME$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "distinguished-name" element
     */
    public int sizeOfDistinguishedNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DISTINGUISHEDNAME$8);
        }
    }
    
    /**
     * Sets array of all "distinguished-name" element
     */
    public void setDistinguishedNameArray(org.apache.geronimo.xml.ns.security12.DistinguishedNameType[] distinguishedNameArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(distinguishedNameArray, DISTINGUISHEDNAME$8);
        }
    }
    
    /**
     * Sets ith "distinguished-name" element
     */
    public void setDistinguishedNameArray(int i, org.apache.geronimo.xml.ns.security12.DistinguishedNameType distinguishedName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xml.ns.security12.DistinguishedNameType target = null;
            target = (org.apache.geronimo.xml.ns.security12.DistinguishedNameType)get_store().find_element_user(DISTINGUISHEDNAME$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(distinguishedName);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "distinguished-name" element
     */
    public org.apache.geronimo.xml.ns.security12.DistinguishedNameType insertNewDistinguishedName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xml.ns.security12.DistinguishedNameType target = null;
            target = (org.apache.geronimo.xml.ns.security12.DistinguishedNameType)get_store().insert_element_user(DISTINGUISHEDNAME$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "distinguished-name" element
     */
    public org.apache.geronimo.xml.ns.security12.DistinguishedNameType addNewDistinguishedName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xml.ns.security12.DistinguishedNameType target = null;
            target = (org.apache.geronimo.xml.ns.security12.DistinguishedNameType)get_store().add_element_user(DISTINGUISHEDNAME$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "distinguished-name" element
     */
    public void removeDistinguishedName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DISTINGUISHEDNAME$8, i);
        }
    }
    
    /**
     * Gets the "role-name" attribute
     */
    public java.lang.String getRoleName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROLENAME$10);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "role-name" attribute
     */
    public org.apache.xmlbeans.XmlString xgetRoleName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ROLENAME$10);
            return target;
        }
    }
    
    /**
     * Sets the "role-name" attribute
     */
    public void setRoleName(java.lang.String roleName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROLENAME$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ROLENAME$10);
            }
            target.setStringValue(roleName);
        }
    }
    
    /**
     * Sets (as xml) the "role-name" attribute
     */
    public void xsetRoleName(org.apache.xmlbeans.XmlString roleName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ROLENAME$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ROLENAME$10);
            }
            target.set(roleName);
        }
    }
}
