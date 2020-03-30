/*
 * XML Type:  jaspiType
 * Namespace: http://geronimo.apache.org/xml/ns/geronimo-jaspi
 * Java type: org.apache.geronimo.xbeans.geronimo.jaspi.JaspiJaspiType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.geronimo.jaspi.impl;
/**
 * An XML jaspiType(@http://geronimo.apache.org/xml/ns/geronimo-jaspi).
 *
 * This is a complex type.
 */
public class JaspiJaspiTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.xbeans.geronimo.jaspi.JaspiJaspiType
{
    private static final long serialVersionUID = 1L;
    
    public JaspiJaspiTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONFIGPROVIDER$0 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/geronimo-jaspi", "configProvider");
    
    
    /**
     * Gets array of all "configProvider" elements
     */
    public org.apache.geronimo.xbeans.geronimo.jaspi.JaspiConfigProviderType[] getConfigProviderArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CONFIGPROVIDER$0, targetList);
            org.apache.geronimo.xbeans.geronimo.jaspi.JaspiConfigProviderType[] result = new org.apache.geronimo.xbeans.geronimo.jaspi.JaspiConfigProviderType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "configProvider" element
     */
    public org.apache.geronimo.xbeans.geronimo.jaspi.JaspiConfigProviderType getConfigProviderArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.jaspi.JaspiConfigProviderType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.jaspi.JaspiConfigProviderType)get_store().find_element_user(CONFIGPROVIDER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "configProvider" element
     */
    public int sizeOfConfigProviderArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONFIGPROVIDER$0);
        }
    }
    
    /**
     * Sets array of all "configProvider" element
     */
    public void setConfigProviderArray(org.apache.geronimo.xbeans.geronimo.jaspi.JaspiConfigProviderType[] configProviderArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(configProviderArray, CONFIGPROVIDER$0);
        }
    }
    
    /**
     * Sets ith "configProvider" element
     */
    public void setConfigProviderArray(int i, org.apache.geronimo.xbeans.geronimo.jaspi.JaspiConfigProviderType configProvider)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.jaspi.JaspiConfigProviderType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.jaspi.JaspiConfigProviderType)get_store().find_element_user(CONFIGPROVIDER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(configProvider);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "configProvider" element
     */
    public org.apache.geronimo.xbeans.geronimo.jaspi.JaspiConfigProviderType insertNewConfigProvider(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.jaspi.JaspiConfigProviderType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.jaspi.JaspiConfigProviderType)get_store().insert_element_user(CONFIGPROVIDER$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "configProvider" element
     */
    public org.apache.geronimo.xbeans.geronimo.jaspi.JaspiConfigProviderType addNewConfigProvider()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.jaspi.JaspiConfigProviderType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.jaspi.JaspiConfigProviderType)get_store().add_element_user(CONFIGPROVIDER$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "configProvider" element
     */
    public void removeConfigProvider(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONFIGPROVIDER$0, i);
        }
    }
}
