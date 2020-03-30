/*
 * XML Type:  connectorType
 * Namespace: http://geronimo.apache.org/xml/ns/j2ee/connector-1.2
 * Java type: org.apache.geronimo.xbeans.connector.GerConnectorType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.connector.impl;
/**
 * An XML connectorType(@http://geronimo.apache.org/xml/ns/j2ee/connector-1.2).
 *
 * This is a complex type.
 */
public class GerConnectorTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.xbeans.connector.GerConnectorType
{
    private static final long serialVersionUID = 1L;
    
    public GerConnectorTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENVIRONMENT$0 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/deployment-1.2", "environment");
    private static final javax.xml.namespace.QName RESOURCEADAPTER$2 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/j2ee/connector-1.2", "resourceadapter");
    private static final javax.xml.namespace.QName ADMINOBJECT$4 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/j2ee/connector-1.2", "adminobject");
    private static final javax.xml.namespace.QName SERVICE$6 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/deployment-1.2", "service");
    private static final org.apache.xmlbeans.QNameSet SERVICE$7 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
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
     * True if has "environment" element
     */
    public boolean isSetEnvironment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENVIRONMENT$0) != 0;
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
     * Unsets the "environment" element
     */
    public void unsetEnvironment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENVIRONMENT$0, 0);
        }
    }
    
    /**
     * Gets array of all "resourceadapter" elements
     */
    public org.apache.geronimo.xbeans.connector.GerResourceadapterType[] getResourceadapterArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RESOURCEADAPTER$2, targetList);
            org.apache.geronimo.xbeans.connector.GerResourceadapterType[] result = new org.apache.geronimo.xbeans.connector.GerResourceadapterType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "resourceadapter" element
     */
    public org.apache.geronimo.xbeans.connector.GerResourceadapterType getResourceadapterArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.connector.GerResourceadapterType target = null;
            target = (org.apache.geronimo.xbeans.connector.GerResourceadapterType)get_store().find_element_user(RESOURCEADAPTER$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "resourceadapter" element
     */
    public int sizeOfResourceadapterArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESOURCEADAPTER$2);
        }
    }
    
    /**
     * Sets array of all "resourceadapter" element
     */
    public void setResourceadapterArray(org.apache.geronimo.xbeans.connector.GerResourceadapterType[] resourceadapterArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(resourceadapterArray, RESOURCEADAPTER$2);
        }
    }
    
    /**
     * Sets ith "resourceadapter" element
     */
    public void setResourceadapterArray(int i, org.apache.geronimo.xbeans.connector.GerResourceadapterType resourceadapter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.connector.GerResourceadapterType target = null;
            target = (org.apache.geronimo.xbeans.connector.GerResourceadapterType)get_store().find_element_user(RESOURCEADAPTER$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(resourceadapter);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "resourceadapter" element
     */
    public org.apache.geronimo.xbeans.connector.GerResourceadapterType insertNewResourceadapter(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.connector.GerResourceadapterType target = null;
            target = (org.apache.geronimo.xbeans.connector.GerResourceadapterType)get_store().insert_element_user(RESOURCEADAPTER$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "resourceadapter" element
     */
    public org.apache.geronimo.xbeans.connector.GerResourceadapterType addNewResourceadapter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.connector.GerResourceadapterType target = null;
            target = (org.apache.geronimo.xbeans.connector.GerResourceadapterType)get_store().add_element_user(RESOURCEADAPTER$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "resourceadapter" element
     */
    public void removeResourceadapter(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESOURCEADAPTER$2, i);
        }
    }
    
    /**
     * Gets array of all "adminobject" elements
     */
    public org.apache.geronimo.xbeans.connector.GerAdminobjectType[] getAdminobjectArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ADMINOBJECT$4, targetList);
            org.apache.geronimo.xbeans.connector.GerAdminobjectType[] result = new org.apache.geronimo.xbeans.connector.GerAdminobjectType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "adminobject" element
     */
    public org.apache.geronimo.xbeans.connector.GerAdminobjectType getAdminobjectArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.connector.GerAdminobjectType target = null;
            target = (org.apache.geronimo.xbeans.connector.GerAdminobjectType)get_store().find_element_user(ADMINOBJECT$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "adminobject" element
     */
    public int sizeOfAdminobjectArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADMINOBJECT$4);
        }
    }
    
    /**
     * Sets array of all "adminobject" element
     */
    public void setAdminobjectArray(org.apache.geronimo.xbeans.connector.GerAdminobjectType[] adminobjectArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(adminobjectArray, ADMINOBJECT$4);
        }
    }
    
    /**
     * Sets ith "adminobject" element
     */
    public void setAdminobjectArray(int i, org.apache.geronimo.xbeans.connector.GerAdminobjectType adminobject)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.connector.GerAdminobjectType target = null;
            target = (org.apache.geronimo.xbeans.connector.GerAdminobjectType)get_store().find_element_user(ADMINOBJECT$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(adminobject);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "adminobject" element
     */
    public org.apache.geronimo.xbeans.connector.GerAdminobjectType insertNewAdminobject(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.connector.GerAdminobjectType target = null;
            target = (org.apache.geronimo.xbeans.connector.GerAdminobjectType)get_store().insert_element_user(ADMINOBJECT$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "adminobject" element
     */
    public org.apache.geronimo.xbeans.connector.GerAdminobjectType addNewAdminobject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.connector.GerAdminobjectType target = null;
            target = (org.apache.geronimo.xbeans.connector.GerAdminobjectType)get_store().add_element_user(ADMINOBJECT$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "adminobject" element
     */
    public void removeAdminobject(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADMINOBJECT$4, i);
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
            get_store().find_all_element_users(SERVICE$7, targetList);
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
            target = (org.apache.geronimo.deployment.xbeans.AbstractServiceType)get_store().find_element_user(SERVICE$7, i);
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
            return get_store().count_elements(SERVICE$7);
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
            arraySetterHelper(serviceArray, SERVICE$6, SERVICE$7);
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
            target = (org.apache.geronimo.deployment.xbeans.AbstractServiceType)get_store().find_element_user(SERVICE$7, i);
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
            target = (org.apache.geronimo.deployment.xbeans.AbstractServiceType)get_store().insert_element_user(SERVICE$7, SERVICE$6, i);
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
            target = (org.apache.geronimo.deployment.xbeans.AbstractServiceType)get_store().add_element_user(SERVICE$6);
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
            get_store().remove_element(SERVICE$7, i);
        }
    }
}
