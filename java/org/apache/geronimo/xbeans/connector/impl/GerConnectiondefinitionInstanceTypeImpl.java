/*
 * XML Type:  connectiondefinition-instanceType
 * Namespace: http://geronimo.apache.org/xml/ns/j2ee/connector-1.2
 * Java type: org.apache.geronimo.xbeans.connector.GerConnectiondefinitionInstanceType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.connector.impl;
/**
 * An XML connectiondefinition-instanceType(@http://geronimo.apache.org/xml/ns/j2ee/connector-1.2).
 *
 * This is a complex type.
 */
public class GerConnectiondefinitionInstanceTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.xbeans.connector.GerConnectiondefinitionInstanceType
{
    private static final long serialVersionUID = 1L;
    
    public GerConnectiondefinitionInstanceTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/j2ee/connector-1.2", "name");
    private static final javax.xml.namespace.QName JNDINAME$2 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/j2ee/connector-1.2", "jndi-name");
    private static final javax.xml.namespace.QName IMPLEMENTEDINTERFACE$4 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/j2ee/connector-1.2", "implemented-interface");
    private static final javax.xml.namespace.QName CONFIGPROPERTYSETTING$6 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/j2ee/connector-1.2", "config-property-setting");
    private static final javax.xml.namespace.QName CONNECTIONMANAGER$8 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/j2ee/connector-1.2", "connectionmanager");
    
    
    /**
     * Gets the "name" element
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "name" element
     */
    public org.apache.xmlbeans.XmlString xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "name" element
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$0);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "name" element
     */
    public void xsetName(org.apache.xmlbeans.XmlString name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$0);
            }
            target.set(name);
        }
    }
    
    /**
     * Gets the "jndi-name" element
     */
    public java.lang.String getJndiName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(JNDINAME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "jndi-name" element
     */
    public org.apache.xmlbeans.XmlString xgetJndiName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(JNDINAME$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "jndi-name" element
     */
    public boolean isSetJndiName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(JNDINAME$2) != 0;
        }
    }
    
    /**
     * Sets the "jndi-name" element
     */
    public void setJndiName(java.lang.String jndiName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(JNDINAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(JNDINAME$2);
            }
            target.setStringValue(jndiName);
        }
    }
    
    /**
     * Sets (as xml) the "jndi-name" element
     */
    public void xsetJndiName(org.apache.xmlbeans.XmlString jndiName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(JNDINAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(JNDINAME$2);
            }
            target.set(jndiName);
        }
    }
    
    /**
     * Unsets the "jndi-name" element
     */
    public void unsetJndiName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(JNDINAME$2, 0);
        }
    }
    
    /**
     * Gets array of all "implemented-interface" elements
     */
    public java.lang.String[] getImplementedInterfaceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(IMPLEMENTEDINTERFACE$4, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "implemented-interface" element
     */
    public java.lang.String getImplementedInterfaceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IMPLEMENTEDINTERFACE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "implemented-interface" elements
     */
    public org.apache.geronimo.xbeans.connector.GerFullyQualifiedClassType[] xgetImplementedInterfaceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(IMPLEMENTEDINTERFACE$4, targetList);
            org.apache.geronimo.xbeans.connector.GerFullyQualifiedClassType[] result = new org.apache.geronimo.xbeans.connector.GerFullyQualifiedClassType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "implemented-interface" element
     */
    public org.apache.geronimo.xbeans.connector.GerFullyQualifiedClassType xgetImplementedInterfaceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.connector.GerFullyQualifiedClassType target = null;
            target = (org.apache.geronimo.xbeans.connector.GerFullyQualifiedClassType)get_store().find_element_user(IMPLEMENTEDINTERFACE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.geronimo.xbeans.connector.GerFullyQualifiedClassType)target;
        }
    }
    
    /**
     * Returns number of "implemented-interface" element
     */
    public int sizeOfImplementedInterfaceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IMPLEMENTEDINTERFACE$4);
        }
    }
    
    /**
     * Sets array of all "implemented-interface" element
     */
    public void setImplementedInterfaceArray(java.lang.String[] implementedInterfaceArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(implementedInterfaceArray, IMPLEMENTEDINTERFACE$4);
        }
    }
    
    /**
     * Sets ith "implemented-interface" element
     */
    public void setImplementedInterfaceArray(int i, java.lang.String implementedInterface)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IMPLEMENTEDINTERFACE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(implementedInterface);
        }
    }
    
    /**
     * Sets (as xml) array of all "implemented-interface" element
     */
    public void xsetImplementedInterfaceArray(org.apache.geronimo.xbeans.connector.GerFullyQualifiedClassType[]implementedInterfaceArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(implementedInterfaceArray, IMPLEMENTEDINTERFACE$4);
        }
    }
    
    /**
     * Sets (as xml) ith "implemented-interface" element
     */
    public void xsetImplementedInterfaceArray(int i, org.apache.geronimo.xbeans.connector.GerFullyQualifiedClassType implementedInterface)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.connector.GerFullyQualifiedClassType target = null;
            target = (org.apache.geronimo.xbeans.connector.GerFullyQualifiedClassType)get_store().find_element_user(IMPLEMENTEDINTERFACE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(implementedInterface);
        }
    }
    
    /**
     * Inserts the value as the ith "implemented-interface" element
     */
    public void insertImplementedInterface(int i, java.lang.String implementedInterface)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(IMPLEMENTEDINTERFACE$4, i);
            target.setStringValue(implementedInterface);
        }
    }
    
    /**
     * Appends the value as the last "implemented-interface" element
     */
    public void addImplementedInterface(java.lang.String implementedInterface)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IMPLEMENTEDINTERFACE$4);
            target.setStringValue(implementedInterface);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "implemented-interface" element
     */
    public org.apache.geronimo.xbeans.connector.GerFullyQualifiedClassType insertNewImplementedInterface(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.connector.GerFullyQualifiedClassType target = null;
            target = (org.apache.geronimo.xbeans.connector.GerFullyQualifiedClassType)get_store().insert_element_user(IMPLEMENTEDINTERFACE$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "implemented-interface" element
     */
    public org.apache.geronimo.xbeans.connector.GerFullyQualifiedClassType addNewImplementedInterface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.connector.GerFullyQualifiedClassType target = null;
            target = (org.apache.geronimo.xbeans.connector.GerFullyQualifiedClassType)get_store().add_element_user(IMPLEMENTEDINTERFACE$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "implemented-interface" element
     */
    public void removeImplementedInterface(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IMPLEMENTEDINTERFACE$4, i);
        }
    }
    
    /**
     * Gets array of all "config-property-setting" elements
     */
    public org.apache.geronimo.xbeans.connector.GerConfigPropertySettingType[] getConfigPropertySettingArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CONFIGPROPERTYSETTING$6, targetList);
            org.apache.geronimo.xbeans.connector.GerConfigPropertySettingType[] result = new org.apache.geronimo.xbeans.connector.GerConfigPropertySettingType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "config-property-setting" element
     */
    public org.apache.geronimo.xbeans.connector.GerConfigPropertySettingType getConfigPropertySettingArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.connector.GerConfigPropertySettingType target = null;
            target = (org.apache.geronimo.xbeans.connector.GerConfigPropertySettingType)get_store().find_element_user(CONFIGPROPERTYSETTING$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "config-property-setting" element
     */
    public int sizeOfConfigPropertySettingArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONFIGPROPERTYSETTING$6);
        }
    }
    
    /**
     * Sets array of all "config-property-setting" element
     */
    public void setConfigPropertySettingArray(org.apache.geronimo.xbeans.connector.GerConfigPropertySettingType[] configPropertySettingArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(configPropertySettingArray, CONFIGPROPERTYSETTING$6);
        }
    }
    
    /**
     * Sets ith "config-property-setting" element
     */
    public void setConfigPropertySettingArray(int i, org.apache.geronimo.xbeans.connector.GerConfigPropertySettingType configPropertySetting)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.connector.GerConfigPropertySettingType target = null;
            target = (org.apache.geronimo.xbeans.connector.GerConfigPropertySettingType)get_store().find_element_user(CONFIGPROPERTYSETTING$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(configPropertySetting);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "config-property-setting" element
     */
    public org.apache.geronimo.xbeans.connector.GerConfigPropertySettingType insertNewConfigPropertySetting(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.connector.GerConfigPropertySettingType target = null;
            target = (org.apache.geronimo.xbeans.connector.GerConfigPropertySettingType)get_store().insert_element_user(CONFIGPROPERTYSETTING$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "config-property-setting" element
     */
    public org.apache.geronimo.xbeans.connector.GerConfigPropertySettingType addNewConfigPropertySetting()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.connector.GerConfigPropertySettingType target = null;
            target = (org.apache.geronimo.xbeans.connector.GerConfigPropertySettingType)get_store().add_element_user(CONFIGPROPERTYSETTING$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "config-property-setting" element
     */
    public void removeConfigPropertySetting(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONFIGPROPERTYSETTING$6, i);
        }
    }
    
    /**
     * Gets the "connectionmanager" element
     */
    public org.apache.geronimo.xbeans.connector.GerConnectionmanagerType getConnectionmanager()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.connector.GerConnectionmanagerType target = null;
            target = (org.apache.geronimo.xbeans.connector.GerConnectionmanagerType)get_store().find_element_user(CONNECTIONMANAGER$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "connectionmanager" element
     */
    public void setConnectionmanager(org.apache.geronimo.xbeans.connector.GerConnectionmanagerType connectionmanager)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.connector.GerConnectionmanagerType target = null;
            target = (org.apache.geronimo.xbeans.connector.GerConnectionmanagerType)get_store().find_element_user(CONNECTIONMANAGER$8, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.xbeans.connector.GerConnectionmanagerType)get_store().add_element_user(CONNECTIONMANAGER$8);
            }
            target.set(connectionmanager);
        }
    }
    
    /**
     * Appends and returns a new empty "connectionmanager" element
     */
    public org.apache.geronimo.xbeans.connector.GerConnectionmanagerType addNewConnectionmanager()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.connector.GerConnectionmanagerType target = null;
            target = (org.apache.geronimo.xbeans.connector.GerConnectionmanagerType)get_store().add_element_user(CONNECTIONMANAGER$8);
            return target;
        }
    }
}
