/*
 * XML Type:  moduleType
 * Namespace: http://geronimo.apache.org/xml/ns/deployment-1.2
 * Java type: org.apache.geronimo.deployment.xbeans.ModuleType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.deployment.xbeans.impl;
/**
 * An XML moduleType(@http://geronimo.apache.org/xml/ns/deployment-1.2).
 *
 * This is a complex type.
 */
public class ModuleTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.deployment.xbeans.ModuleType
{
    private static final long serialVersionUID = 1L;
    
    public ModuleTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENVIRONMENT$0 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/deployment-1.2", "environment");
    private static final javax.xml.namespace.QName SERVICE$2 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/deployment-1.2", "service");
    private static final org.apache.xmlbeans.QNameSet SERVICE$3 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/deployment-1.2", "gbean"),
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/deployment-1.2", "service"),
    });
    
    
    /**
     * Gets the "environment" element
     */
    public org.apache.geronimo.deployment.xbeans.EnvironmentType getEnvironment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.xbeans.EnvironmentType target = null;
            target = (org.apache.geronimo.deployment.xbeans.EnvironmentType)get_store().find_element_user(ENVIRONMENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "environment" element
     */
    public void setEnvironment(org.apache.geronimo.deployment.xbeans.EnvironmentType environment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.xbeans.EnvironmentType target = null;
            target = (org.apache.geronimo.deployment.xbeans.EnvironmentType)get_store().find_element_user(ENVIRONMENT$0, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.deployment.xbeans.EnvironmentType)get_store().add_element_user(ENVIRONMENT$0);
            }
            target.set(environment);
        }
    }
    
    /**
     * Appends and returns a new empty "environment" element
     */
    public org.apache.geronimo.deployment.xbeans.EnvironmentType addNewEnvironment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.xbeans.EnvironmentType target = null;
            target = (org.apache.geronimo.deployment.xbeans.EnvironmentType)get_store().add_element_user(ENVIRONMENT$0);
            return target;
        }
    }
    
    /**
     * Gets array of all "service" elements
     */
    public org.apache.geronimo.deployment.xbeans.AbstractServiceType[] getServiceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SERVICE$3, targetList);
            org.apache.geronimo.deployment.xbeans.AbstractServiceType[] result = new org.apache.geronimo.deployment.xbeans.AbstractServiceType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "service" element
     */
    public org.apache.geronimo.deployment.xbeans.AbstractServiceType getServiceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.xbeans.AbstractServiceType target = null;
            target = (org.apache.geronimo.deployment.xbeans.AbstractServiceType)get_store().find_element_user(SERVICE$3, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "service" element
     */
    public int sizeOfServiceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SERVICE$3);
        }
    }
    
    /**
     * Sets array of all "service" element
     */
    public void setServiceArray(org.apache.geronimo.deployment.xbeans.AbstractServiceType[] serviceArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(serviceArray, SERVICE$2, SERVICE$3);
        }
    }
    
    /**
     * Sets ith "service" element
     */
    public void setServiceArray(int i, org.apache.geronimo.deployment.xbeans.AbstractServiceType service)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.xbeans.AbstractServiceType target = null;
            target = (org.apache.geronimo.deployment.xbeans.AbstractServiceType)get_store().find_element_user(SERVICE$3, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(service);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "service" element
     */
    public org.apache.geronimo.deployment.xbeans.AbstractServiceType insertNewService(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.xbeans.AbstractServiceType target = null;
            target = (org.apache.geronimo.deployment.xbeans.AbstractServiceType)get_store().insert_element_user(SERVICE$3, SERVICE$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "service" element
     */
    public org.apache.geronimo.deployment.xbeans.AbstractServiceType addNewService()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.xbeans.AbstractServiceType target = null;
            target = (org.apache.geronimo.deployment.xbeans.AbstractServiceType)get_store().add_element_user(SERVICE$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "service" element
     */
    public void removeService(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SERVICE$3, i);
        }
    }
}
