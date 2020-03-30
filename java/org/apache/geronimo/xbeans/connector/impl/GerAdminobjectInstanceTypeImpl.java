/*
 * XML Type:  adminobject-instanceType
 * Namespace: http://geronimo.apache.org/xml/ns/j2ee/connector-1.2
 * Java type: org.apache.geronimo.xbeans.connector.GerAdminobjectInstanceType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.connector.impl;
/**
 * An XML adminobject-instanceType(@http://geronimo.apache.org/xml/ns/j2ee/connector-1.2).
 *
 * This is a complex type.
 */
public class GerAdminobjectInstanceTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.xbeans.connector.GerAdminobjectInstanceType
{
    private static final long serialVersionUID = 1L;
    
    public GerAdminobjectInstanceTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MESSAGEDESTINATIONNAME$0 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/j2ee/connector-1.2", "message-destination-name");
    private static final javax.xml.namespace.QName CONFIGPROPERTYSETTING$2 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/j2ee/connector-1.2", "config-property-setting");
    
    
    /**
     * Gets the "message-destination-name" element
     */
    public java.lang.String getMessageDestinationName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGEDESTINATIONNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "message-destination-name" element
     */
    public org.apache.xmlbeans.XmlString xgetMessageDestinationName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MESSAGEDESTINATIONNAME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "message-destination-name" element
     */
    public void setMessageDestinationName(java.lang.String messageDestinationName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGEDESTINATIONNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MESSAGEDESTINATIONNAME$0);
            }
            target.setStringValue(messageDestinationName);
        }
    }
    
    /**
     * Sets (as xml) the "message-destination-name" element
     */
    public void xsetMessageDestinationName(org.apache.xmlbeans.XmlString messageDestinationName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MESSAGEDESTINATIONNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MESSAGEDESTINATIONNAME$0);
            }
            target.set(messageDestinationName);
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
            get_store().find_all_element_users(CONFIGPROPERTYSETTING$2, targetList);
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
            target = (org.apache.geronimo.xbeans.connector.GerConfigPropertySettingType)get_store().find_element_user(CONFIGPROPERTYSETTING$2, i);
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
            return get_store().count_elements(CONFIGPROPERTYSETTING$2);
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
            arraySetterHelper(configPropertySettingArray, CONFIGPROPERTYSETTING$2);
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
            target = (org.apache.geronimo.xbeans.connector.GerConfigPropertySettingType)get_store().find_element_user(CONFIGPROPERTYSETTING$2, i);
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
            target = (org.apache.geronimo.xbeans.connector.GerConfigPropertySettingType)get_store().insert_element_user(CONFIGPROPERTYSETTING$2, i);
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
            target = (org.apache.geronimo.xbeans.connector.GerConfigPropertySettingType)get_store().add_element_user(CONFIGPROPERTYSETTING$2);
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
            get_store().remove_element(CONFIGPROPERTYSETTING$2, i);
        }
    }
}
