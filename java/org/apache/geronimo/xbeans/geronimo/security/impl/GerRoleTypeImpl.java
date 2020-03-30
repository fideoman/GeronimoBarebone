/*
 * XML Type:  roleType
 * Namespace: http://geronimo.apache.org/xml/ns/security-2.0
 * Java type: org.apache.geronimo.xbeans.geronimo.security.GerRoleType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.geronimo.security.impl;
/**
 * An XML roleType(@http://geronimo.apache.org/xml/ns/security-2.0).
 *
 * This is a complex type.
 */
public class GerRoleTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.xbeans.geronimo.security.GerRoleType
{
    private static final long serialVersionUID = 1L;
    
    public GerRoleTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DESCRIPTION$0 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/security-2.0", "description");
    private static final javax.xml.namespace.QName RUNASSUBJECT$2 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/security-2.0", "run-as-subject");
    private static final javax.xml.namespace.QName REALMPRINCIPAL$4 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/security-2.0", "realm-principal");
    private static final javax.xml.namespace.QName LOGINDOMAINPRINCIPAL$6 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/security-2.0", "login-domain-principal");
    private static final javax.xml.namespace.QName PRINCIPAL$8 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/security-2.0", "principal");
    private static final javax.xml.namespace.QName DISTINGUISHEDNAME$10 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/security-2.0", "distinguished-name");
    private static final javax.xml.namespace.QName ROLENAME$12 = 
        new javax.xml.namespace.QName("", "role-name");
    
    
    /**
     * Gets array of all "description" elements
     */
    public org.apache.geronimo.xbeans.geronimo.security.GerDescriptionType[] getDescriptionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DESCRIPTION$0, targetList);
            org.apache.geronimo.xbeans.geronimo.security.GerDescriptionType[] result = new org.apache.geronimo.xbeans.geronimo.security.GerDescriptionType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "description" element
     */
    public org.apache.geronimo.xbeans.geronimo.security.GerDescriptionType getDescriptionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.security.GerDescriptionType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.security.GerDescriptionType)get_store().find_element_user(DESCRIPTION$0, i);
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
    public void setDescriptionArray(org.apache.geronimo.xbeans.geronimo.security.GerDescriptionType[] descriptionArray)
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
    public void setDescriptionArray(int i, org.apache.geronimo.xbeans.geronimo.security.GerDescriptionType description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.security.GerDescriptionType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.security.GerDescriptionType)get_store().find_element_user(DESCRIPTION$0, i);
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
    public org.apache.geronimo.xbeans.geronimo.security.GerDescriptionType insertNewDescription(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.security.GerDescriptionType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.security.GerDescriptionType)get_store().insert_element_user(DESCRIPTION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "description" element
     */
    public org.apache.geronimo.xbeans.geronimo.security.GerDescriptionType addNewDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.security.GerDescriptionType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.security.GerDescriptionType)get_store().add_element_user(DESCRIPTION$0);
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
     * Gets the "run-as-subject" element
     */
    public org.apache.geronimo.xbeans.geronimo.security.GerSubjectInfoType getRunAsSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.security.GerSubjectInfoType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.security.GerSubjectInfoType)get_store().find_element_user(RUNASSUBJECT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "run-as-subject" element
     */
    public boolean isSetRunAsSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RUNASSUBJECT$2) != 0;
        }
    }
    
    /**
     * Sets the "run-as-subject" element
     */
    public void setRunAsSubject(org.apache.geronimo.xbeans.geronimo.security.GerSubjectInfoType runAsSubject)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.security.GerSubjectInfoType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.security.GerSubjectInfoType)get_store().find_element_user(RUNASSUBJECT$2, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.xbeans.geronimo.security.GerSubjectInfoType)get_store().add_element_user(RUNASSUBJECT$2);
            }
            target.set(runAsSubject);
        }
    }
    
    /**
     * Appends and returns a new empty "run-as-subject" element
     */
    public org.apache.geronimo.xbeans.geronimo.security.GerSubjectInfoType addNewRunAsSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.security.GerSubjectInfoType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.security.GerSubjectInfoType)get_store().add_element_user(RUNASSUBJECT$2);
            return target;
        }
    }
    
    /**
     * Unsets the "run-as-subject" element
     */
    public void unsetRunAsSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RUNASSUBJECT$2, 0);
        }
    }
    
    /**
     * Gets array of all "realm-principal" elements
     */
    public org.apache.geronimo.xbeans.geronimo.security.GerRealmPrincipalType[] getRealmPrincipalArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(REALMPRINCIPAL$4, targetList);
            org.apache.geronimo.xbeans.geronimo.security.GerRealmPrincipalType[] result = new org.apache.geronimo.xbeans.geronimo.security.GerRealmPrincipalType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "realm-principal" element
     */
    public org.apache.geronimo.xbeans.geronimo.security.GerRealmPrincipalType getRealmPrincipalArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.security.GerRealmPrincipalType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.security.GerRealmPrincipalType)get_store().find_element_user(REALMPRINCIPAL$4, i);
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
            return get_store().count_elements(REALMPRINCIPAL$4);
        }
    }
    
    /**
     * Sets array of all "realm-principal" element
     */
    public void setRealmPrincipalArray(org.apache.geronimo.xbeans.geronimo.security.GerRealmPrincipalType[] realmPrincipalArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(realmPrincipalArray, REALMPRINCIPAL$4);
        }
    }
    
    /**
     * Sets ith "realm-principal" element
     */
    public void setRealmPrincipalArray(int i, org.apache.geronimo.xbeans.geronimo.security.GerRealmPrincipalType realmPrincipal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.security.GerRealmPrincipalType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.security.GerRealmPrincipalType)get_store().find_element_user(REALMPRINCIPAL$4, i);
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
    public org.apache.geronimo.xbeans.geronimo.security.GerRealmPrincipalType insertNewRealmPrincipal(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.security.GerRealmPrincipalType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.security.GerRealmPrincipalType)get_store().insert_element_user(REALMPRINCIPAL$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "realm-principal" element
     */
    public org.apache.geronimo.xbeans.geronimo.security.GerRealmPrincipalType addNewRealmPrincipal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.security.GerRealmPrincipalType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.security.GerRealmPrincipalType)get_store().add_element_user(REALMPRINCIPAL$4);
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
            get_store().remove_element(REALMPRINCIPAL$4, i);
        }
    }
    
    /**
     * Gets array of all "login-domain-principal" elements
     */
    public org.apache.geronimo.xbeans.geronimo.security.GerLoginDomainPrincipalType[] getLoginDomainPrincipalArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LOGINDOMAINPRINCIPAL$6, targetList);
            org.apache.geronimo.xbeans.geronimo.security.GerLoginDomainPrincipalType[] result = new org.apache.geronimo.xbeans.geronimo.security.GerLoginDomainPrincipalType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "login-domain-principal" element
     */
    public org.apache.geronimo.xbeans.geronimo.security.GerLoginDomainPrincipalType getLoginDomainPrincipalArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.security.GerLoginDomainPrincipalType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.security.GerLoginDomainPrincipalType)get_store().find_element_user(LOGINDOMAINPRINCIPAL$6, i);
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
            return get_store().count_elements(LOGINDOMAINPRINCIPAL$6);
        }
    }
    
    /**
     * Sets array of all "login-domain-principal" element
     */
    public void setLoginDomainPrincipalArray(org.apache.geronimo.xbeans.geronimo.security.GerLoginDomainPrincipalType[] loginDomainPrincipalArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(loginDomainPrincipalArray, LOGINDOMAINPRINCIPAL$6);
        }
    }
    
    /**
     * Sets ith "login-domain-principal" element
     */
    public void setLoginDomainPrincipalArray(int i, org.apache.geronimo.xbeans.geronimo.security.GerLoginDomainPrincipalType loginDomainPrincipal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.security.GerLoginDomainPrincipalType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.security.GerLoginDomainPrincipalType)get_store().find_element_user(LOGINDOMAINPRINCIPAL$6, i);
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
    public org.apache.geronimo.xbeans.geronimo.security.GerLoginDomainPrincipalType insertNewLoginDomainPrincipal(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.security.GerLoginDomainPrincipalType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.security.GerLoginDomainPrincipalType)get_store().insert_element_user(LOGINDOMAINPRINCIPAL$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "login-domain-principal" element
     */
    public org.apache.geronimo.xbeans.geronimo.security.GerLoginDomainPrincipalType addNewLoginDomainPrincipal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.security.GerLoginDomainPrincipalType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.security.GerLoginDomainPrincipalType)get_store().add_element_user(LOGINDOMAINPRINCIPAL$6);
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
            get_store().remove_element(LOGINDOMAINPRINCIPAL$6, i);
        }
    }
    
    /**
     * Gets array of all "principal" elements
     */
    public org.apache.geronimo.xbeans.geronimo.security.GerPrincipalType[] getPrincipalArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PRINCIPAL$8, targetList);
            org.apache.geronimo.xbeans.geronimo.security.GerPrincipalType[] result = new org.apache.geronimo.xbeans.geronimo.security.GerPrincipalType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "principal" element
     */
    public org.apache.geronimo.xbeans.geronimo.security.GerPrincipalType getPrincipalArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.security.GerPrincipalType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.security.GerPrincipalType)get_store().find_element_user(PRINCIPAL$8, i);
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
            return get_store().count_elements(PRINCIPAL$8);
        }
    }
    
    /**
     * Sets array of all "principal" element
     */
    public void setPrincipalArray(org.apache.geronimo.xbeans.geronimo.security.GerPrincipalType[] principalArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(principalArray, PRINCIPAL$8);
        }
    }
    
    /**
     * Sets ith "principal" element
     */
    public void setPrincipalArray(int i, org.apache.geronimo.xbeans.geronimo.security.GerPrincipalType principal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.security.GerPrincipalType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.security.GerPrincipalType)get_store().find_element_user(PRINCIPAL$8, i);
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
    public org.apache.geronimo.xbeans.geronimo.security.GerPrincipalType insertNewPrincipal(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.security.GerPrincipalType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.security.GerPrincipalType)get_store().insert_element_user(PRINCIPAL$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "principal" element
     */
    public org.apache.geronimo.xbeans.geronimo.security.GerPrincipalType addNewPrincipal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.security.GerPrincipalType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.security.GerPrincipalType)get_store().add_element_user(PRINCIPAL$8);
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
            get_store().remove_element(PRINCIPAL$8, i);
        }
    }
    
    /**
     * Gets array of all "distinguished-name" elements
     */
    public org.apache.geronimo.xbeans.geronimo.security.GerDistinguishedNameType[] getDistinguishedNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DISTINGUISHEDNAME$10, targetList);
            org.apache.geronimo.xbeans.geronimo.security.GerDistinguishedNameType[] result = new org.apache.geronimo.xbeans.geronimo.security.GerDistinguishedNameType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "distinguished-name" element
     */
    public org.apache.geronimo.xbeans.geronimo.security.GerDistinguishedNameType getDistinguishedNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.security.GerDistinguishedNameType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.security.GerDistinguishedNameType)get_store().find_element_user(DISTINGUISHEDNAME$10, i);
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
            return get_store().count_elements(DISTINGUISHEDNAME$10);
        }
    }
    
    /**
     * Sets array of all "distinguished-name" element
     */
    public void setDistinguishedNameArray(org.apache.geronimo.xbeans.geronimo.security.GerDistinguishedNameType[] distinguishedNameArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(distinguishedNameArray, DISTINGUISHEDNAME$10);
        }
    }
    
    /**
     * Sets ith "distinguished-name" element
     */
    public void setDistinguishedNameArray(int i, org.apache.geronimo.xbeans.geronimo.security.GerDistinguishedNameType distinguishedName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.security.GerDistinguishedNameType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.security.GerDistinguishedNameType)get_store().find_element_user(DISTINGUISHEDNAME$10, i);
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
    public org.apache.geronimo.xbeans.geronimo.security.GerDistinguishedNameType insertNewDistinguishedName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.security.GerDistinguishedNameType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.security.GerDistinguishedNameType)get_store().insert_element_user(DISTINGUISHEDNAME$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "distinguished-name" element
     */
    public org.apache.geronimo.xbeans.geronimo.security.GerDistinguishedNameType addNewDistinguishedName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.security.GerDistinguishedNameType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.security.GerDistinguishedNameType)get_store().add_element_user(DISTINGUISHEDNAME$10);
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
            get_store().remove_element(DISTINGUISHEDNAME$10, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROLENAME$12);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ROLENAME$12);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROLENAME$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ROLENAME$12);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ROLENAME$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ROLENAME$12);
            }
            target.set(roleName);
        }
    }
}
