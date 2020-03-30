/*
 * XML Type:  default-principalType
 * Namespace: http://geronimo.apache.org/xml/ns/security-1.2
 * Java type: org.apache.geronimo.xml.ns.security12.DefaultPrincipalType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xml.ns.security12.impl;
/**
 * An XML default-principalType(@http://geronimo.apache.org/xml/ns/security-1.2).
 *
 * This is a complex type.
 */
public class DefaultPrincipalTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.xml.ns.security12.DefaultPrincipalType
{
    private static final long serialVersionUID = 1L;
    
    public DefaultPrincipalTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DESCRIPTION$0 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/security-1.2", "description");
    private static final javax.xml.namespace.QName PRINCIPAL$2 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/security-1.2", "principal");
    private static final javax.xml.namespace.QName LOGINDOMAINPRINCIPAL$4 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/security-1.2", "login-domain-principal");
    private static final javax.xml.namespace.QName REALMPRINCIPAL$6 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/security-1.2", "realm-principal");
    private static final javax.xml.namespace.QName NAMEDUSERNAMEPASSWORDCREDENTIAL$8 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/security-1.2", "named-username-password-credential");
    
    
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
     * Gets the "principal" element
     */
    public org.apache.geronimo.xml.ns.security12.PrincipalType getPrincipal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xml.ns.security12.PrincipalType target = null;
            target = (org.apache.geronimo.xml.ns.security12.PrincipalType)get_store().find_element_user(PRINCIPAL$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "principal" element
     */
    public boolean isSetPrincipal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRINCIPAL$2) != 0;
        }
    }
    
    /**
     * Sets the "principal" element
     */
    public void setPrincipal(org.apache.geronimo.xml.ns.security12.PrincipalType principal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xml.ns.security12.PrincipalType target = null;
            target = (org.apache.geronimo.xml.ns.security12.PrincipalType)get_store().find_element_user(PRINCIPAL$2, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.xml.ns.security12.PrincipalType)get_store().add_element_user(PRINCIPAL$2);
            }
            target.set(principal);
        }
    }
    
    /**
     * Appends and returns a new empty "principal" element
     */
    public org.apache.geronimo.xml.ns.security12.PrincipalType addNewPrincipal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xml.ns.security12.PrincipalType target = null;
            target = (org.apache.geronimo.xml.ns.security12.PrincipalType)get_store().add_element_user(PRINCIPAL$2);
            return target;
        }
    }
    
    /**
     * Unsets the "principal" element
     */
    public void unsetPrincipal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRINCIPAL$2, 0);
        }
    }
    
    /**
     * Gets the "login-domain-principal" element
     */
    public org.apache.geronimo.xml.ns.security12.LoginDomainPrincipalType getLoginDomainPrincipal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xml.ns.security12.LoginDomainPrincipalType target = null;
            target = (org.apache.geronimo.xml.ns.security12.LoginDomainPrincipalType)get_store().find_element_user(LOGINDOMAINPRINCIPAL$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "login-domain-principal" element
     */
    public boolean isSetLoginDomainPrincipal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOGINDOMAINPRINCIPAL$4) != 0;
        }
    }
    
    /**
     * Sets the "login-domain-principal" element
     */
    public void setLoginDomainPrincipal(org.apache.geronimo.xml.ns.security12.LoginDomainPrincipalType loginDomainPrincipal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xml.ns.security12.LoginDomainPrincipalType target = null;
            target = (org.apache.geronimo.xml.ns.security12.LoginDomainPrincipalType)get_store().find_element_user(LOGINDOMAINPRINCIPAL$4, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.xml.ns.security12.LoginDomainPrincipalType)get_store().add_element_user(LOGINDOMAINPRINCIPAL$4);
            }
            target.set(loginDomainPrincipal);
        }
    }
    
    /**
     * Appends and returns a new empty "login-domain-principal" element
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
     * Unsets the "login-domain-principal" element
     */
    public void unsetLoginDomainPrincipal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOGINDOMAINPRINCIPAL$4, 0);
        }
    }
    
    /**
     * Gets the "realm-principal" element
     */
    public org.apache.geronimo.xml.ns.security12.RealmPrincipalType getRealmPrincipal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xml.ns.security12.RealmPrincipalType target = null;
            target = (org.apache.geronimo.xml.ns.security12.RealmPrincipalType)get_store().find_element_user(REALMPRINCIPAL$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "realm-principal" element
     */
    public boolean isSetRealmPrincipal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REALMPRINCIPAL$6) != 0;
        }
    }
    
    /**
     * Sets the "realm-principal" element
     */
    public void setRealmPrincipal(org.apache.geronimo.xml.ns.security12.RealmPrincipalType realmPrincipal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xml.ns.security12.RealmPrincipalType target = null;
            target = (org.apache.geronimo.xml.ns.security12.RealmPrincipalType)get_store().find_element_user(REALMPRINCIPAL$6, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.xml.ns.security12.RealmPrincipalType)get_store().add_element_user(REALMPRINCIPAL$6);
            }
            target.set(realmPrincipal);
        }
    }
    
    /**
     * Appends and returns a new empty "realm-principal" element
     */
    public org.apache.geronimo.xml.ns.security12.RealmPrincipalType addNewRealmPrincipal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xml.ns.security12.RealmPrincipalType target = null;
            target = (org.apache.geronimo.xml.ns.security12.RealmPrincipalType)get_store().add_element_user(REALMPRINCIPAL$6);
            return target;
        }
    }
    
    /**
     * Unsets the "realm-principal" element
     */
    public void unsetRealmPrincipal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REALMPRINCIPAL$6, 0);
        }
    }
    
    /**
     * Gets array of all "named-username-password-credential" elements
     */
    public org.apache.geronimo.xml.ns.security12.NamedUsernamePasswordCredentialType[] getNamedUsernamePasswordCredentialArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(NAMEDUSERNAMEPASSWORDCREDENTIAL$8, targetList);
            org.apache.geronimo.xml.ns.security12.NamedUsernamePasswordCredentialType[] result = new org.apache.geronimo.xml.ns.security12.NamedUsernamePasswordCredentialType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "named-username-password-credential" element
     */
    public org.apache.geronimo.xml.ns.security12.NamedUsernamePasswordCredentialType getNamedUsernamePasswordCredentialArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xml.ns.security12.NamedUsernamePasswordCredentialType target = null;
            target = (org.apache.geronimo.xml.ns.security12.NamedUsernamePasswordCredentialType)get_store().find_element_user(NAMEDUSERNAMEPASSWORDCREDENTIAL$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "named-username-password-credential" element
     */
    public int sizeOfNamedUsernamePasswordCredentialArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NAMEDUSERNAMEPASSWORDCREDENTIAL$8);
        }
    }
    
    /**
     * Sets array of all "named-username-password-credential" element
     */
    public void setNamedUsernamePasswordCredentialArray(org.apache.geronimo.xml.ns.security12.NamedUsernamePasswordCredentialType[] namedUsernamePasswordCredentialArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(namedUsernamePasswordCredentialArray, NAMEDUSERNAMEPASSWORDCREDENTIAL$8);
        }
    }
    
    /**
     * Sets ith "named-username-password-credential" element
     */
    public void setNamedUsernamePasswordCredentialArray(int i, org.apache.geronimo.xml.ns.security12.NamedUsernamePasswordCredentialType namedUsernamePasswordCredential)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xml.ns.security12.NamedUsernamePasswordCredentialType target = null;
            target = (org.apache.geronimo.xml.ns.security12.NamedUsernamePasswordCredentialType)get_store().find_element_user(NAMEDUSERNAMEPASSWORDCREDENTIAL$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(namedUsernamePasswordCredential);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "named-username-password-credential" element
     */
    public org.apache.geronimo.xml.ns.security12.NamedUsernamePasswordCredentialType insertNewNamedUsernamePasswordCredential(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xml.ns.security12.NamedUsernamePasswordCredentialType target = null;
            target = (org.apache.geronimo.xml.ns.security12.NamedUsernamePasswordCredentialType)get_store().insert_element_user(NAMEDUSERNAMEPASSWORDCREDENTIAL$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "named-username-password-credential" element
     */
    public org.apache.geronimo.xml.ns.security12.NamedUsernamePasswordCredentialType addNewNamedUsernamePasswordCredential()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xml.ns.security12.NamedUsernamePasswordCredentialType target = null;
            target = (org.apache.geronimo.xml.ns.security12.NamedUsernamePasswordCredentialType)get_store().add_element_user(NAMEDUSERNAMEPASSWORDCREDENTIAL$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "named-username-password-credential" element
     */
    public void removeNamedUsernamePasswordCredential(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NAMEDUSERNAMEPASSWORDCREDENTIAL$8, i);
        }
    }
}
