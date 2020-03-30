/*
 * XML Type:  application-clientType
 * Namespace: http://geronimo.apache.org/xml/ns/j2ee/application-client-2.0
 * Java type: org.apache.geronimo.xbeans.geronimo.client.GerApplicationClientType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.geronimo.client.impl;
/**
 * An XML application-clientType(@http://geronimo.apache.org/xml/ns/j2ee/application-client-2.0).
 *
 * This is a complex type.
 */
public class GerApplicationClientTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.xbeans.geronimo.client.GerApplicationClientType
{
    private static final long serialVersionUID = 1L;
    
    public GerApplicationClientTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CLIENTENVIRONMENT$0 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/deployment-1.2", "client-environment");
    private static final javax.xml.namespace.QName SERVERENVIRONMENT$2 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/deployment-1.2", "server-environment");
    private static final javax.xml.namespace.QName GBEANREF$4 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "gbean-ref");
    private static final javax.xml.namespace.QName EJBREF$6 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "ejb-ref");
    private static final javax.xml.namespace.QName SERVICEREF$8 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "service-ref");
    private static final javax.xml.namespace.QName RESOURCEREF$10 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "resource-ref");
    private static final javax.xml.namespace.QName RESOURCEENVREF$12 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "resource-env-ref");
    private static final javax.xml.namespace.QName MESSAGEDESTINATION$14 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "message-destination");
    private static final javax.xml.namespace.QName DEFAULTSUBJECT$16 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/security-2.0", "default-subject");
    private static final javax.xml.namespace.QName REALMNAME$18 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/j2ee/application-client-2.0", "realm-name");
    private static final javax.xml.namespace.QName CALLBACKHANDLER$20 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/j2ee/application-client-2.0", "callback-handler");
    private static final javax.xml.namespace.QName RESOURCE$22 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/j2ee/application-client-2.0", "resource");
    private static final javax.xml.namespace.QName SERVICE$24 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/deployment-1.2", "service");
    private static final org.apache.xmlbeans.QNameSet SERVICE$25 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/deployment-1.2", "gbean"),
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/deployment-1.2", "service"),
    });
    
    
    /**
     * Gets the "client-environment" element
     */
    public org.apache.geronimo.deployment.xbeans.EnvironmentType getClientEnvironment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.xbeans.EnvironmentType target = null;
            target = (org.apache.geronimo.deployment.xbeans.EnvironmentType)get_store().find_element_user(CLIENTENVIRONMENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "client-environment" element
     */
    public void setClientEnvironment(org.apache.geronimo.deployment.xbeans.EnvironmentType clientEnvironment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.xbeans.EnvironmentType target = null;
            target = (org.apache.geronimo.deployment.xbeans.EnvironmentType)get_store().find_element_user(CLIENTENVIRONMENT$0, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.deployment.xbeans.EnvironmentType)get_store().add_element_user(CLIENTENVIRONMENT$0);
            }
            target.set(clientEnvironment);
        }
    }
    
    /**
     * Appends and returns a new empty "client-environment" element
     */
    public org.apache.geronimo.deployment.xbeans.EnvironmentType addNewClientEnvironment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.xbeans.EnvironmentType target = null;
            target = (org.apache.geronimo.deployment.xbeans.EnvironmentType)get_store().add_element_user(CLIENTENVIRONMENT$0);
            return target;
        }
    }
    
    /**
     * Gets the "server-environment" element
     */
    public org.apache.geronimo.deployment.xbeans.EnvironmentType getServerEnvironment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.xbeans.EnvironmentType target = null;
            target = (org.apache.geronimo.deployment.xbeans.EnvironmentType)get_store().find_element_user(SERVERENVIRONMENT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "server-environment" element
     */
    public void setServerEnvironment(org.apache.geronimo.deployment.xbeans.EnvironmentType serverEnvironment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.xbeans.EnvironmentType target = null;
            target = (org.apache.geronimo.deployment.xbeans.EnvironmentType)get_store().find_element_user(SERVERENVIRONMENT$2, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.deployment.xbeans.EnvironmentType)get_store().add_element_user(SERVERENVIRONMENT$2);
            }
            target.set(serverEnvironment);
        }
    }
    
    /**
     * Appends and returns a new empty "server-environment" element
     */
    public org.apache.geronimo.deployment.xbeans.EnvironmentType addNewServerEnvironment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.xbeans.EnvironmentType target = null;
            target = (org.apache.geronimo.deployment.xbeans.EnvironmentType)get_store().add_element_user(SERVERENVIRONMENT$2);
            return target;
        }
    }
    
    /**
     * Gets array of all "gbean-ref" elements
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerGbeanRefType[] getGbeanRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(GBEANREF$4, targetList);
            org.apache.geronimo.xbeans.geronimo.naming.GerGbeanRefType[] result = new org.apache.geronimo.xbeans.geronimo.naming.GerGbeanRefType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "gbean-ref" element
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerGbeanRefType getGbeanRefArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerGbeanRefType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerGbeanRefType)get_store().find_element_user(GBEANREF$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "gbean-ref" element
     */
    public int sizeOfGbeanRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GBEANREF$4);
        }
    }
    
    /**
     * Sets array of all "gbean-ref" element
     */
    public void setGbeanRefArray(org.apache.geronimo.xbeans.geronimo.naming.GerGbeanRefType[] gbeanRefArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(gbeanRefArray, GBEANREF$4);
        }
    }
    
    /**
     * Sets ith "gbean-ref" element
     */
    public void setGbeanRefArray(int i, org.apache.geronimo.xbeans.geronimo.naming.GerGbeanRefType gbeanRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerGbeanRefType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerGbeanRefType)get_store().find_element_user(GBEANREF$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(gbeanRef);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "gbean-ref" element
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerGbeanRefType insertNewGbeanRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerGbeanRefType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerGbeanRefType)get_store().insert_element_user(GBEANREF$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "gbean-ref" element
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerGbeanRefType addNewGbeanRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerGbeanRefType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerGbeanRefType)get_store().add_element_user(GBEANREF$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "gbean-ref" element
     */
    public void removeGbeanRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GBEANREF$4, i);
        }
    }
    
    /**
     * Gets array of all "ejb-ref" elements
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerEjbRefType[] getEjbRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(EJBREF$6, targetList);
            org.apache.geronimo.xbeans.geronimo.naming.GerEjbRefType[] result = new org.apache.geronimo.xbeans.geronimo.naming.GerEjbRefType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ejb-ref" element
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerEjbRefType getEjbRefArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerEjbRefType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerEjbRefType)get_store().find_element_user(EJBREF$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ejb-ref" element
     */
    public int sizeOfEjbRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EJBREF$6);
        }
    }
    
    /**
     * Sets array of all "ejb-ref" element
     */
    public void setEjbRefArray(org.apache.geronimo.xbeans.geronimo.naming.GerEjbRefType[] ejbRefArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(ejbRefArray, EJBREF$6);
        }
    }
    
    /**
     * Sets ith "ejb-ref" element
     */
    public void setEjbRefArray(int i, org.apache.geronimo.xbeans.geronimo.naming.GerEjbRefType ejbRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerEjbRefType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerEjbRefType)get_store().find_element_user(EJBREF$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(ejbRef);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ejb-ref" element
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerEjbRefType insertNewEjbRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerEjbRefType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerEjbRefType)get_store().insert_element_user(EJBREF$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ejb-ref" element
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerEjbRefType addNewEjbRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerEjbRefType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerEjbRefType)get_store().add_element_user(EJBREF$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "ejb-ref" element
     */
    public void removeEjbRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EJBREF$6, i);
        }
    }
    
    /**
     * Gets array of all "service-ref" elements
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerServiceRefType[] getServiceRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SERVICEREF$8, targetList);
            org.apache.geronimo.xbeans.geronimo.naming.GerServiceRefType[] result = new org.apache.geronimo.xbeans.geronimo.naming.GerServiceRefType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "service-ref" element
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerServiceRefType getServiceRefArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerServiceRefType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerServiceRefType)get_store().find_element_user(SERVICEREF$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "service-ref" element
     */
    public int sizeOfServiceRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SERVICEREF$8);
        }
    }
    
    /**
     * Sets array of all "service-ref" element
     */
    public void setServiceRefArray(org.apache.geronimo.xbeans.geronimo.naming.GerServiceRefType[] serviceRefArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(serviceRefArray, SERVICEREF$8);
        }
    }
    
    /**
     * Sets ith "service-ref" element
     */
    public void setServiceRefArray(int i, org.apache.geronimo.xbeans.geronimo.naming.GerServiceRefType serviceRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerServiceRefType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerServiceRefType)get_store().find_element_user(SERVICEREF$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(serviceRef);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "service-ref" element
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerServiceRefType insertNewServiceRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerServiceRefType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerServiceRefType)get_store().insert_element_user(SERVICEREF$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "service-ref" element
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerServiceRefType addNewServiceRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerServiceRefType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerServiceRefType)get_store().add_element_user(SERVICEREF$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "service-ref" element
     */
    public void removeServiceRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SERVICEREF$8, i);
        }
    }
    
    /**
     * Gets array of all "resource-ref" elements
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerResourceRefType[] getResourceRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RESOURCEREF$10, targetList);
            org.apache.geronimo.xbeans.geronimo.naming.GerResourceRefType[] result = new org.apache.geronimo.xbeans.geronimo.naming.GerResourceRefType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "resource-ref" element
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerResourceRefType getResourceRefArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerResourceRefType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerResourceRefType)get_store().find_element_user(RESOURCEREF$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "resource-ref" element
     */
    public int sizeOfResourceRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESOURCEREF$10);
        }
    }
    
    /**
     * Sets array of all "resource-ref" element
     */
    public void setResourceRefArray(org.apache.geronimo.xbeans.geronimo.naming.GerResourceRefType[] resourceRefArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(resourceRefArray, RESOURCEREF$10);
        }
    }
    
    /**
     * Sets ith "resource-ref" element
     */
    public void setResourceRefArray(int i, org.apache.geronimo.xbeans.geronimo.naming.GerResourceRefType resourceRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerResourceRefType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerResourceRefType)get_store().find_element_user(RESOURCEREF$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(resourceRef);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "resource-ref" element
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerResourceRefType insertNewResourceRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerResourceRefType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerResourceRefType)get_store().insert_element_user(RESOURCEREF$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "resource-ref" element
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerResourceRefType addNewResourceRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerResourceRefType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerResourceRefType)get_store().add_element_user(RESOURCEREF$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "resource-ref" element
     */
    public void removeResourceRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESOURCEREF$10, i);
        }
    }
    
    /**
     * Gets array of all "resource-env-ref" elements
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerResourceEnvRefType[] getResourceEnvRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RESOURCEENVREF$12, targetList);
            org.apache.geronimo.xbeans.geronimo.naming.GerResourceEnvRefType[] result = new org.apache.geronimo.xbeans.geronimo.naming.GerResourceEnvRefType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "resource-env-ref" element
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerResourceEnvRefType getResourceEnvRefArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerResourceEnvRefType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerResourceEnvRefType)get_store().find_element_user(RESOURCEENVREF$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "resource-env-ref" element
     */
    public int sizeOfResourceEnvRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESOURCEENVREF$12);
        }
    }
    
    /**
     * Sets array of all "resource-env-ref" element
     */
    public void setResourceEnvRefArray(org.apache.geronimo.xbeans.geronimo.naming.GerResourceEnvRefType[] resourceEnvRefArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(resourceEnvRefArray, RESOURCEENVREF$12);
        }
    }
    
    /**
     * Sets ith "resource-env-ref" element
     */
    public void setResourceEnvRefArray(int i, org.apache.geronimo.xbeans.geronimo.naming.GerResourceEnvRefType resourceEnvRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerResourceEnvRefType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerResourceEnvRefType)get_store().find_element_user(RESOURCEENVREF$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(resourceEnvRef);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "resource-env-ref" element
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerResourceEnvRefType insertNewResourceEnvRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerResourceEnvRefType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerResourceEnvRefType)get_store().insert_element_user(RESOURCEENVREF$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "resource-env-ref" element
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerResourceEnvRefType addNewResourceEnvRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerResourceEnvRefType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerResourceEnvRefType)get_store().add_element_user(RESOURCEENVREF$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "resource-env-ref" element
     */
    public void removeResourceEnvRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESOURCEENVREF$12, i);
        }
    }
    
    /**
     * Gets array of all "message-destination" elements
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerMessageDestinationType[] getMessageDestinationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MESSAGEDESTINATION$14, targetList);
            org.apache.geronimo.xbeans.geronimo.naming.GerMessageDestinationType[] result = new org.apache.geronimo.xbeans.geronimo.naming.GerMessageDestinationType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "message-destination" element
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerMessageDestinationType getMessageDestinationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerMessageDestinationType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerMessageDestinationType)get_store().find_element_user(MESSAGEDESTINATION$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "message-destination" element
     */
    public int sizeOfMessageDestinationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MESSAGEDESTINATION$14);
        }
    }
    
    /**
     * Sets array of all "message-destination" element
     */
    public void setMessageDestinationArray(org.apache.geronimo.xbeans.geronimo.naming.GerMessageDestinationType[] messageDestinationArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(messageDestinationArray, MESSAGEDESTINATION$14);
        }
    }
    
    /**
     * Sets ith "message-destination" element
     */
    public void setMessageDestinationArray(int i, org.apache.geronimo.xbeans.geronimo.naming.GerMessageDestinationType messageDestination)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerMessageDestinationType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerMessageDestinationType)get_store().find_element_user(MESSAGEDESTINATION$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(messageDestination);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "message-destination" element
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerMessageDestinationType insertNewMessageDestination(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerMessageDestinationType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerMessageDestinationType)get_store().insert_element_user(MESSAGEDESTINATION$14, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "message-destination" element
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerMessageDestinationType addNewMessageDestination()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerMessageDestinationType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerMessageDestinationType)get_store().add_element_user(MESSAGEDESTINATION$14);
            return target;
        }
    }
    
    /**
     * Removes the ith "message-destination" element
     */
    public void removeMessageDestination(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MESSAGEDESTINATION$14, i);
        }
    }
    
    /**
     * Gets the "default-subject" element
     */
    public org.apache.geronimo.xbeans.geronimo.security.GerSubjectInfoType getDefaultSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.security.GerSubjectInfoType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.security.GerSubjectInfoType)get_store().find_element_user(DEFAULTSUBJECT$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "default-subject" element
     */
    public boolean isSetDefaultSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DEFAULTSUBJECT$16) != 0;
        }
    }
    
    /**
     * Sets the "default-subject" element
     */
    public void setDefaultSubject(org.apache.geronimo.xbeans.geronimo.security.GerSubjectInfoType defaultSubject)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.security.GerSubjectInfoType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.security.GerSubjectInfoType)get_store().find_element_user(DEFAULTSUBJECT$16, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.xbeans.geronimo.security.GerSubjectInfoType)get_store().add_element_user(DEFAULTSUBJECT$16);
            }
            target.set(defaultSubject);
        }
    }
    
    /**
     * Appends and returns a new empty "default-subject" element
     */
    public org.apache.geronimo.xbeans.geronimo.security.GerSubjectInfoType addNewDefaultSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.security.GerSubjectInfoType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.security.GerSubjectInfoType)get_store().add_element_user(DEFAULTSUBJECT$16);
            return target;
        }
    }
    
    /**
     * Unsets the "default-subject" element
     */
    public void unsetDefaultSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DEFAULTSUBJECT$16, 0);
        }
    }
    
    /**
     * Gets the "realm-name" element
     */
    public java.lang.String getRealmName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REALMNAME$18, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "realm-name" element
     */
    public org.apache.xmlbeans.XmlString xgetRealmName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REALMNAME$18, 0);
            return target;
        }
    }
    
    /**
     * True if has "realm-name" element
     */
    public boolean isSetRealmName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REALMNAME$18) != 0;
        }
    }
    
    /**
     * Sets the "realm-name" element
     */
    public void setRealmName(java.lang.String realmName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REALMNAME$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REALMNAME$18);
            }
            target.setStringValue(realmName);
        }
    }
    
    /**
     * Sets (as xml) the "realm-name" element
     */
    public void xsetRealmName(org.apache.xmlbeans.XmlString realmName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REALMNAME$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REALMNAME$18);
            }
            target.set(realmName);
        }
    }
    
    /**
     * Unsets the "realm-name" element
     */
    public void unsetRealmName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REALMNAME$18, 0);
        }
    }
    
    /**
     * Gets the "callback-handler" element
     */
    public java.lang.String getCallbackHandler()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CALLBACKHANDLER$20, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "callback-handler" element
     */
    public org.apache.xmlbeans.XmlString xgetCallbackHandler()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CALLBACKHANDLER$20, 0);
            return target;
        }
    }
    
    /**
     * True if has "callback-handler" element
     */
    public boolean isSetCallbackHandler()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CALLBACKHANDLER$20) != 0;
        }
    }
    
    /**
     * Sets the "callback-handler" element
     */
    public void setCallbackHandler(java.lang.String callbackHandler)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CALLBACKHANDLER$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CALLBACKHANDLER$20);
            }
            target.setStringValue(callbackHandler);
        }
    }
    
    /**
     * Sets (as xml) the "callback-handler" element
     */
    public void xsetCallbackHandler(org.apache.xmlbeans.XmlString callbackHandler)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CALLBACKHANDLER$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CALLBACKHANDLER$20);
            }
            target.set(callbackHandler);
        }
    }
    
    /**
     * Unsets the "callback-handler" element
     */
    public void unsetCallbackHandler()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CALLBACKHANDLER$20, 0);
        }
    }
    
    /**
     * Gets array of all "resource" elements
     */
    public org.apache.geronimo.xbeans.geronimo.client.GerResourceType[] getResourceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RESOURCE$22, targetList);
            org.apache.geronimo.xbeans.geronimo.client.GerResourceType[] result = new org.apache.geronimo.xbeans.geronimo.client.GerResourceType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "resource" element
     */
    public org.apache.geronimo.xbeans.geronimo.client.GerResourceType getResourceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.client.GerResourceType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.client.GerResourceType)get_store().find_element_user(RESOURCE$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "resource" element
     */
    public int sizeOfResourceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESOURCE$22);
        }
    }
    
    /**
     * Sets array of all "resource" element
     */
    public void setResourceArray(org.apache.geronimo.xbeans.geronimo.client.GerResourceType[] resourceArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(resourceArray, RESOURCE$22);
        }
    }
    
    /**
     * Sets ith "resource" element
     */
    public void setResourceArray(int i, org.apache.geronimo.xbeans.geronimo.client.GerResourceType resource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.client.GerResourceType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.client.GerResourceType)get_store().find_element_user(RESOURCE$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(resource);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "resource" element
     */
    public org.apache.geronimo.xbeans.geronimo.client.GerResourceType insertNewResource(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.client.GerResourceType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.client.GerResourceType)get_store().insert_element_user(RESOURCE$22, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "resource" element
     */
    public org.apache.geronimo.xbeans.geronimo.client.GerResourceType addNewResource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.client.GerResourceType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.client.GerResourceType)get_store().add_element_user(RESOURCE$22);
            return target;
        }
    }
    
    /**
     * Removes the ith "resource" element
     */
    public void removeResource(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESOURCE$22, i);
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
            get_store().find_all_element_users(SERVICE$25, targetList);
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
            target = (org.apache.geronimo.deployment.xbeans.AbstractServiceType)get_store().find_element_user(SERVICE$25, i);
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
            return get_store().count_elements(SERVICE$25);
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
            arraySetterHelper(serviceArray, SERVICE$24, SERVICE$25);
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
            target = (org.apache.geronimo.deployment.xbeans.AbstractServiceType)get_store().find_element_user(SERVICE$25, i);
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
            target = (org.apache.geronimo.deployment.xbeans.AbstractServiceType)get_store().insert_element_user(SERVICE$25, SERVICE$24, i);
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
            target = (org.apache.geronimo.deployment.xbeans.AbstractServiceType)get_store().add_element_user(SERVICE$24);
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
            get_store().remove_element(SERVICE$25, i);
        }
    }
}
