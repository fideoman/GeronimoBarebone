/*
 * XML Type:  login-configType
 * Namespace: http://geronimo.apache.org/xml/ns/loginconfig-2.0
 * Java type: org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginConfigType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.geronimo.loginconfig.impl;
/**
 * An XML login-configType(@http://geronimo.apache.org/xml/ns/loginconfig-2.0).
 *
 * This is a complex type.
 */
public class GerLoginConfigTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginConfigType
{
    private static final long serialVersionUID = 1L;
    
    public GerLoginConfigTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOGINMODULEREF$0 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/loginconfig-2.0", "login-module-ref");
    private static final javax.xml.namespace.QName LOGINMODULE$2 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/loginconfig-2.0", "login-module");
    
    
    /**
     * Gets array of all "login-module-ref" elements
     */
    public org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginModuleRefType[] getLoginModuleRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LOGINMODULEREF$0, targetList);
            org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginModuleRefType[] result = new org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginModuleRefType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "login-module-ref" element
     */
    public org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginModuleRefType getLoginModuleRefArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginModuleRefType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginModuleRefType)get_store().find_element_user(LOGINMODULEREF$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "login-module-ref" element
     */
    public int sizeOfLoginModuleRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOGINMODULEREF$0);
        }
    }
    
    /**
     * Sets array of all "login-module-ref" element
     */
    public void setLoginModuleRefArray(org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginModuleRefType[] loginModuleRefArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(loginModuleRefArray, LOGINMODULEREF$0);
        }
    }
    
    /**
     * Sets ith "login-module-ref" element
     */
    public void setLoginModuleRefArray(int i, org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginModuleRefType loginModuleRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginModuleRefType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginModuleRefType)get_store().find_element_user(LOGINMODULEREF$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(loginModuleRef);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "login-module-ref" element
     */
    public org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginModuleRefType insertNewLoginModuleRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginModuleRefType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginModuleRefType)get_store().insert_element_user(LOGINMODULEREF$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "login-module-ref" element
     */
    public org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginModuleRefType addNewLoginModuleRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginModuleRefType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginModuleRefType)get_store().add_element_user(LOGINMODULEREF$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "login-module-ref" element
     */
    public void removeLoginModuleRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOGINMODULEREF$0, i);
        }
    }
    
    /**
     * Gets array of all "login-module" elements
     */
    public org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginModuleType[] getLoginModuleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LOGINMODULE$2, targetList);
            org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginModuleType[] result = new org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginModuleType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "login-module" element
     */
    public org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginModuleType getLoginModuleArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginModuleType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginModuleType)get_store().find_element_user(LOGINMODULE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "login-module" element
     */
    public int sizeOfLoginModuleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOGINMODULE$2);
        }
    }
    
    /**
     * Sets array of all "login-module" element
     */
    public void setLoginModuleArray(org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginModuleType[] loginModuleArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(loginModuleArray, LOGINMODULE$2);
        }
    }
    
    /**
     * Sets ith "login-module" element
     */
    public void setLoginModuleArray(int i, org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginModuleType loginModule)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginModuleType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginModuleType)get_store().find_element_user(LOGINMODULE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(loginModule);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "login-module" element
     */
    public org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginModuleType insertNewLoginModule(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginModuleType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginModuleType)get_store().insert_element_user(LOGINMODULE$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "login-module" element
     */
    public org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginModuleType addNewLoginModule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginModuleType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginModuleType)get_store().add_element_user(LOGINMODULE$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "login-module" element
     */
    public void removeLoginModule(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOGINMODULE$2, i);
        }
    }
}
