/*
 * XML Type:  applicationType
 * Namespace: http://geronimo.apache.org/xml/ns/j2ee/application-2.0
 * Java type: org.apache.geronimo.xbeans.geronimo.j2ee.GerApplicationType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.geronimo.j2ee.impl;
/**
 * An XML applicationType(@http://geronimo.apache.org/xml/ns/j2ee/application-2.0).
 *
 * This is a complex type.
 */
public class GerApplicationTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.xbeans.geronimo.j2ee.GerApplicationType
{
    private static final long serialVersionUID = 1L;
    
    public GerApplicationTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENVIRONMENT$0 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/deployment-1.2", "environment");
    private static final javax.xml.namespace.QName MODULE$2 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/j2ee/application-2.0", "module");
    private static final javax.xml.namespace.QName EXTMODULE$4 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/j2ee/application-2.0", "ext-module");
    private static final javax.xml.namespace.QName SECURITY$6 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/j2ee/application-2.0", "security");
    private static final javax.xml.namespace.QName ABSTRACTNAMINGENTRY$8 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "abstract-naming-entry");
    private static final org.apache.xmlbeans.QNameSet ABSTRACTNAMINGENTRY$9 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "persistence-unit-ref"),
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "gbean-ref"),
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "persistence-context-ref"),
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "abstract-naming-entry"),
    });
    private static final javax.xml.namespace.QName ENVENTRY$10 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "env-entry");
    private static final javax.xml.namespace.QName EJBREF$12 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "ejb-ref");
    private static final javax.xml.namespace.QName EJBLOCALREF$14 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "ejb-local-ref");
    private static final javax.xml.namespace.QName SERVICEREF$16 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "service-ref");
    private static final javax.xml.namespace.QName RESOURCEREF$18 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "resource-ref");
    private static final javax.xml.namespace.QName RESOURCEENVREF$20 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "resource-env-ref");
    private static final javax.xml.namespace.QName MESSAGEDESTINATION$22 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "message-destination");
    private static final javax.xml.namespace.QName SERVICE$24 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/deployment-1.2", "service");
    private static final org.apache.xmlbeans.QNameSet SERVICE$25 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/deployment-1.2", "gbean"),
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/deployment-1.2", "service"),
    });
    private static final javax.xml.namespace.QName APPLICATIONNAME$26 = 
        new javax.xml.namespace.QName("", "application-name");
    
    
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
     * Gets array of all "module" elements
     */
    public org.apache.geronimo.xbeans.geronimo.j2ee.GerModuleType[] getModuleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MODULE$2, targetList);
            org.apache.geronimo.xbeans.geronimo.j2ee.GerModuleType[] result = new org.apache.geronimo.xbeans.geronimo.j2ee.GerModuleType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "module" element
     */
    public org.apache.geronimo.xbeans.geronimo.j2ee.GerModuleType getModuleArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.j2ee.GerModuleType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.j2ee.GerModuleType)get_store().find_element_user(MODULE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "module" element
     */
    public int sizeOfModuleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MODULE$2);
        }
    }
    
    /**
     * Sets array of all "module" element
     */
    public void setModuleArray(org.apache.geronimo.xbeans.geronimo.j2ee.GerModuleType[] moduleArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(moduleArray, MODULE$2);
        }
    }
    
    /**
     * Sets ith "module" element
     */
    public void setModuleArray(int i, org.apache.geronimo.xbeans.geronimo.j2ee.GerModuleType module)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.j2ee.GerModuleType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.j2ee.GerModuleType)get_store().find_element_user(MODULE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(module);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "module" element
     */
    public org.apache.geronimo.xbeans.geronimo.j2ee.GerModuleType insertNewModule(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.j2ee.GerModuleType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.j2ee.GerModuleType)get_store().insert_element_user(MODULE$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "module" element
     */
    public org.apache.geronimo.xbeans.geronimo.j2ee.GerModuleType addNewModule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.j2ee.GerModuleType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.j2ee.GerModuleType)get_store().add_element_user(MODULE$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "module" element
     */
    public void removeModule(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MODULE$2, i);
        }
    }
    
    /**
     * Gets array of all "ext-module" elements
     */
    public org.apache.geronimo.xbeans.geronimo.j2ee.GerExtModuleType[] getExtModuleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(EXTMODULE$4, targetList);
            org.apache.geronimo.xbeans.geronimo.j2ee.GerExtModuleType[] result = new org.apache.geronimo.xbeans.geronimo.j2ee.GerExtModuleType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ext-module" element
     */
    public org.apache.geronimo.xbeans.geronimo.j2ee.GerExtModuleType getExtModuleArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.j2ee.GerExtModuleType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.j2ee.GerExtModuleType)get_store().find_element_user(EXTMODULE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ext-module" element
     */
    public int sizeOfExtModuleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXTMODULE$4);
        }
    }
    
    /**
     * Sets array of all "ext-module" element
     */
    public void setExtModuleArray(org.apache.geronimo.xbeans.geronimo.j2ee.GerExtModuleType[] extModuleArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(extModuleArray, EXTMODULE$4);
        }
    }
    
    /**
     * Sets ith "ext-module" element
     */
    public void setExtModuleArray(int i, org.apache.geronimo.xbeans.geronimo.j2ee.GerExtModuleType extModule)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.j2ee.GerExtModuleType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.j2ee.GerExtModuleType)get_store().find_element_user(EXTMODULE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(extModule);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ext-module" element
     */
    public org.apache.geronimo.xbeans.geronimo.j2ee.GerExtModuleType insertNewExtModule(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.j2ee.GerExtModuleType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.j2ee.GerExtModuleType)get_store().insert_element_user(EXTMODULE$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ext-module" element
     */
    public org.apache.geronimo.xbeans.geronimo.j2ee.GerExtModuleType addNewExtModule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.j2ee.GerExtModuleType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.j2ee.GerExtModuleType)get_store().add_element_user(EXTMODULE$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "ext-module" element
     */
    public void removeExtModule(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXTMODULE$4, i);
        }
    }
    
    /**
     * Gets the "security" element
     */
    public org.apache.geronimo.xbeans.geronimo.j2ee.GerAbstractSecurityType getSecurity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.j2ee.GerAbstractSecurityType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.j2ee.GerAbstractSecurityType)get_store().find_element_user(SECURITY$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "security" element
     */
    public boolean isSetSecurity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SECURITY$6) != 0;
        }
    }
    
    /**
     * Sets the "security" element
     */
    public void setSecurity(org.apache.geronimo.xbeans.geronimo.j2ee.GerAbstractSecurityType security)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.j2ee.GerAbstractSecurityType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.j2ee.GerAbstractSecurityType)get_store().find_element_user(SECURITY$6, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.xbeans.geronimo.j2ee.GerAbstractSecurityType)get_store().add_element_user(SECURITY$6);
            }
            target.set(security);
        }
    }
    
    /**
     * Appends and returns a new empty "security" element
     */
    public org.apache.geronimo.xbeans.geronimo.j2ee.GerAbstractSecurityType addNewSecurity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.j2ee.GerAbstractSecurityType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.j2ee.GerAbstractSecurityType)get_store().add_element_user(SECURITY$6);
            return target;
        }
    }
    
    /**
     * Unsets the "security" element
     */
    public void unsetSecurity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SECURITY$6, 0);
        }
    }
    
    /**
     * Gets array of all "abstract-naming-entry" elements
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerAbstractNamingEntryType[] getAbstractNamingEntryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ABSTRACTNAMINGENTRY$9, targetList);
            org.apache.geronimo.xbeans.geronimo.naming.GerAbstractNamingEntryType[] result = new org.apache.geronimo.xbeans.geronimo.naming.GerAbstractNamingEntryType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "abstract-naming-entry" element
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerAbstractNamingEntryType getAbstractNamingEntryArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerAbstractNamingEntryType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerAbstractNamingEntryType)get_store().find_element_user(ABSTRACTNAMINGENTRY$9, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "abstract-naming-entry" element
     */
    public int sizeOfAbstractNamingEntryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ABSTRACTNAMINGENTRY$9);
        }
    }
    
    /**
     * Sets array of all "abstract-naming-entry" element
     */
    public void setAbstractNamingEntryArray(org.apache.geronimo.xbeans.geronimo.naming.GerAbstractNamingEntryType[] abstractNamingEntryArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(abstractNamingEntryArray, ABSTRACTNAMINGENTRY$8, ABSTRACTNAMINGENTRY$9);
        }
    }
    
    /**
     * Sets ith "abstract-naming-entry" element
     */
    public void setAbstractNamingEntryArray(int i, org.apache.geronimo.xbeans.geronimo.naming.GerAbstractNamingEntryType abstractNamingEntry)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerAbstractNamingEntryType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerAbstractNamingEntryType)get_store().find_element_user(ABSTRACTNAMINGENTRY$9, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(abstractNamingEntry);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "abstract-naming-entry" element
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerAbstractNamingEntryType insertNewAbstractNamingEntry(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerAbstractNamingEntryType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerAbstractNamingEntryType)get_store().insert_element_user(ABSTRACTNAMINGENTRY$9, ABSTRACTNAMINGENTRY$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "abstract-naming-entry" element
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerAbstractNamingEntryType addNewAbstractNamingEntry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerAbstractNamingEntryType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerAbstractNamingEntryType)get_store().add_element_user(ABSTRACTNAMINGENTRY$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "abstract-naming-entry" element
     */
    public void removeAbstractNamingEntry(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ABSTRACTNAMINGENTRY$9, i);
        }
    }
    
    /**
     * Gets array of all "env-entry" elements
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerEnvEntryType[] getEnvEntryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ENVENTRY$10, targetList);
            org.apache.geronimo.xbeans.geronimo.naming.GerEnvEntryType[] result = new org.apache.geronimo.xbeans.geronimo.naming.GerEnvEntryType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "env-entry" element
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerEnvEntryType getEnvEntryArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerEnvEntryType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerEnvEntryType)get_store().find_element_user(ENVENTRY$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "env-entry" element
     */
    public int sizeOfEnvEntryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENVENTRY$10);
        }
    }
    
    /**
     * Sets array of all "env-entry" element
     */
    public void setEnvEntryArray(org.apache.geronimo.xbeans.geronimo.naming.GerEnvEntryType[] envEntryArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(envEntryArray, ENVENTRY$10);
        }
    }
    
    /**
     * Sets ith "env-entry" element
     */
    public void setEnvEntryArray(int i, org.apache.geronimo.xbeans.geronimo.naming.GerEnvEntryType envEntry)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerEnvEntryType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerEnvEntryType)get_store().find_element_user(ENVENTRY$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(envEntry);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "env-entry" element
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerEnvEntryType insertNewEnvEntry(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerEnvEntryType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerEnvEntryType)get_store().insert_element_user(ENVENTRY$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "env-entry" element
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerEnvEntryType addNewEnvEntry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerEnvEntryType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerEnvEntryType)get_store().add_element_user(ENVENTRY$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "env-entry" element
     */
    public void removeEnvEntry(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENVENTRY$10, i);
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
            get_store().find_all_element_users(EJBREF$12, targetList);
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
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerEjbRefType)get_store().find_element_user(EJBREF$12, i);
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
            return get_store().count_elements(EJBREF$12);
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
            arraySetterHelper(ejbRefArray, EJBREF$12);
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
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerEjbRefType)get_store().find_element_user(EJBREF$12, i);
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
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerEjbRefType)get_store().insert_element_user(EJBREF$12, i);
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
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerEjbRefType)get_store().add_element_user(EJBREF$12);
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
            get_store().remove_element(EJBREF$12, i);
        }
    }
    
    /**
     * Gets array of all "ejb-local-ref" elements
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerEjbLocalRefType[] getEjbLocalRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(EJBLOCALREF$14, targetList);
            org.apache.geronimo.xbeans.geronimo.naming.GerEjbLocalRefType[] result = new org.apache.geronimo.xbeans.geronimo.naming.GerEjbLocalRefType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ejb-local-ref" element
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerEjbLocalRefType getEjbLocalRefArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerEjbLocalRefType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerEjbLocalRefType)get_store().find_element_user(EJBLOCALREF$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ejb-local-ref" element
     */
    public int sizeOfEjbLocalRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EJBLOCALREF$14);
        }
    }
    
    /**
     * Sets array of all "ejb-local-ref" element
     */
    public void setEjbLocalRefArray(org.apache.geronimo.xbeans.geronimo.naming.GerEjbLocalRefType[] ejbLocalRefArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(ejbLocalRefArray, EJBLOCALREF$14);
        }
    }
    
    /**
     * Sets ith "ejb-local-ref" element
     */
    public void setEjbLocalRefArray(int i, org.apache.geronimo.xbeans.geronimo.naming.GerEjbLocalRefType ejbLocalRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerEjbLocalRefType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerEjbLocalRefType)get_store().find_element_user(EJBLOCALREF$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(ejbLocalRef);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ejb-local-ref" element
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerEjbLocalRefType insertNewEjbLocalRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerEjbLocalRefType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerEjbLocalRefType)get_store().insert_element_user(EJBLOCALREF$14, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ejb-local-ref" element
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerEjbLocalRefType addNewEjbLocalRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerEjbLocalRefType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerEjbLocalRefType)get_store().add_element_user(EJBLOCALREF$14);
            return target;
        }
    }
    
    /**
     * Removes the ith "ejb-local-ref" element
     */
    public void removeEjbLocalRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EJBLOCALREF$14, i);
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
            get_store().find_all_element_users(SERVICEREF$16, targetList);
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
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerServiceRefType)get_store().find_element_user(SERVICEREF$16, i);
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
            return get_store().count_elements(SERVICEREF$16);
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
            arraySetterHelper(serviceRefArray, SERVICEREF$16);
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
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerServiceRefType)get_store().find_element_user(SERVICEREF$16, i);
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
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerServiceRefType)get_store().insert_element_user(SERVICEREF$16, i);
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
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerServiceRefType)get_store().add_element_user(SERVICEREF$16);
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
            get_store().remove_element(SERVICEREF$16, i);
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
            get_store().find_all_element_users(RESOURCEREF$18, targetList);
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
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerResourceRefType)get_store().find_element_user(RESOURCEREF$18, i);
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
            return get_store().count_elements(RESOURCEREF$18);
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
            arraySetterHelper(resourceRefArray, RESOURCEREF$18);
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
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerResourceRefType)get_store().find_element_user(RESOURCEREF$18, i);
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
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerResourceRefType)get_store().insert_element_user(RESOURCEREF$18, i);
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
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerResourceRefType)get_store().add_element_user(RESOURCEREF$18);
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
            get_store().remove_element(RESOURCEREF$18, i);
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
            get_store().find_all_element_users(RESOURCEENVREF$20, targetList);
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
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerResourceEnvRefType)get_store().find_element_user(RESOURCEENVREF$20, i);
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
            return get_store().count_elements(RESOURCEENVREF$20);
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
            arraySetterHelper(resourceEnvRefArray, RESOURCEENVREF$20);
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
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerResourceEnvRefType)get_store().find_element_user(RESOURCEENVREF$20, i);
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
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerResourceEnvRefType)get_store().insert_element_user(RESOURCEENVREF$20, i);
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
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerResourceEnvRefType)get_store().add_element_user(RESOURCEENVREF$20);
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
            get_store().remove_element(RESOURCEENVREF$20, i);
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
            get_store().find_all_element_users(MESSAGEDESTINATION$22, targetList);
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
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerMessageDestinationType)get_store().find_element_user(MESSAGEDESTINATION$22, i);
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
            return get_store().count_elements(MESSAGEDESTINATION$22);
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
            arraySetterHelper(messageDestinationArray, MESSAGEDESTINATION$22);
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
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerMessageDestinationType)get_store().find_element_user(MESSAGEDESTINATION$22, i);
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
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerMessageDestinationType)get_store().insert_element_user(MESSAGEDESTINATION$22, i);
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
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerMessageDestinationType)get_store().add_element_user(MESSAGEDESTINATION$22);
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
            get_store().remove_element(MESSAGEDESTINATION$22, i);
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
    
    /**
     * Gets the "application-name" attribute
     */
    public java.lang.String getApplicationName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPLICATIONNAME$26);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "application-name" attribute
     */
    public org.apache.xmlbeans.XmlString xgetApplicationName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(APPLICATIONNAME$26);
            return target;
        }
    }
    
    /**
     * True if has "application-name" attribute
     */
    public boolean isSetApplicationName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(APPLICATIONNAME$26) != null;
        }
    }
    
    /**
     * Sets the "application-name" attribute
     */
    public void setApplicationName(java.lang.String applicationName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPLICATIONNAME$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(APPLICATIONNAME$26);
            }
            target.setStringValue(applicationName);
        }
    }
    
    /**
     * Sets (as xml) the "application-name" attribute
     */
    public void xsetApplicationName(org.apache.xmlbeans.XmlString applicationName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(APPLICATIONNAME$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(APPLICATIONNAME$26);
            }
            target.set(applicationName);
        }
    }
    
    /**
     * Unsets the "application-name" attribute
     */
    public void unsetApplicationName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(APPLICATIONNAME$26);
        }
    }
}
