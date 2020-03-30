/*
 * XML Type:  connection-definitionType
 * Namespace: http://geronimo.apache.org/xml/ns/j2ee/connector-1.2
 * Java type: org.apache.geronimo.xbeans.connector.GerConnectionDefinitionType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.connector.impl;
/**
 * An XML connection-definitionType(@http://geronimo.apache.org/xml/ns/j2ee/connector-1.2).
 *
 * This is a complex type.
 */
public class GerConnectionDefinitionTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.xbeans.connector.GerConnectionDefinitionType
{
    private static final long serialVersionUID = 1L;
    
    public GerConnectionDefinitionTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONNECTIONFACTORYINTERFACE$0 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/j2ee/connector-1.2", "connectionfactory-interface");
    private static final javax.xml.namespace.QName CONNECTIONDEFINITIONINSTANCE$2 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/j2ee/connector-1.2", "connectiondefinition-instance");
    
    
    /**
     * Gets the "connectionfactory-interface" element
     */
    public java.lang.String getConnectionfactoryInterface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONNECTIONFACTORYINTERFACE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "connectionfactory-interface" element
     */
    public org.apache.geronimo.xbeans.connector.GerFullyQualifiedClassType xgetConnectionfactoryInterface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.connector.GerFullyQualifiedClassType target = null;
            target = (org.apache.geronimo.xbeans.connector.GerFullyQualifiedClassType)get_store().find_element_user(CONNECTIONFACTORYINTERFACE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "connectionfactory-interface" element
     */
    public void setConnectionfactoryInterface(java.lang.String connectionfactoryInterface)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONNECTIONFACTORYINTERFACE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONNECTIONFACTORYINTERFACE$0);
            }
            target.setStringValue(connectionfactoryInterface);
        }
    }
    
    /**
     * Sets (as xml) the "connectionfactory-interface" element
     */
    public void xsetConnectionfactoryInterface(org.apache.geronimo.xbeans.connector.GerFullyQualifiedClassType connectionfactoryInterface)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.connector.GerFullyQualifiedClassType target = null;
            target = (org.apache.geronimo.xbeans.connector.GerFullyQualifiedClassType)get_store().find_element_user(CONNECTIONFACTORYINTERFACE$0, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.xbeans.connector.GerFullyQualifiedClassType)get_store().add_element_user(CONNECTIONFACTORYINTERFACE$0);
            }
            target.set(connectionfactoryInterface);
        }
    }
    
    /**
     * Gets array of all "connectiondefinition-instance" elements
     */
    public org.apache.geronimo.xbeans.connector.GerConnectiondefinitionInstanceType[] getConnectiondefinitionInstanceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CONNECTIONDEFINITIONINSTANCE$2, targetList);
            org.apache.geronimo.xbeans.connector.GerConnectiondefinitionInstanceType[] result = new org.apache.geronimo.xbeans.connector.GerConnectiondefinitionInstanceType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "connectiondefinition-instance" element
     */
    public org.apache.geronimo.xbeans.connector.GerConnectiondefinitionInstanceType getConnectiondefinitionInstanceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.connector.GerConnectiondefinitionInstanceType target = null;
            target = (org.apache.geronimo.xbeans.connector.GerConnectiondefinitionInstanceType)get_store().find_element_user(CONNECTIONDEFINITIONINSTANCE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "connectiondefinition-instance" element
     */
    public int sizeOfConnectiondefinitionInstanceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONNECTIONDEFINITIONINSTANCE$2);
        }
    }
    
    /**
     * Sets array of all "connectiondefinition-instance" element
     */
    public void setConnectiondefinitionInstanceArray(org.apache.geronimo.xbeans.connector.GerConnectiondefinitionInstanceType[] connectiondefinitionInstanceArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(connectiondefinitionInstanceArray, CONNECTIONDEFINITIONINSTANCE$2);
        }
    }
    
    /**
     * Sets ith "connectiondefinition-instance" element
     */
    public void setConnectiondefinitionInstanceArray(int i, org.apache.geronimo.xbeans.connector.GerConnectiondefinitionInstanceType connectiondefinitionInstance)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.connector.GerConnectiondefinitionInstanceType target = null;
            target = (org.apache.geronimo.xbeans.connector.GerConnectiondefinitionInstanceType)get_store().find_element_user(CONNECTIONDEFINITIONINSTANCE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(connectiondefinitionInstance);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "connectiondefinition-instance" element
     */
    public org.apache.geronimo.xbeans.connector.GerConnectiondefinitionInstanceType insertNewConnectiondefinitionInstance(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.connector.GerConnectiondefinitionInstanceType target = null;
            target = (org.apache.geronimo.xbeans.connector.GerConnectiondefinitionInstanceType)get_store().insert_element_user(CONNECTIONDEFINITIONINSTANCE$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "connectiondefinition-instance" element
     */
    public org.apache.geronimo.xbeans.connector.GerConnectiondefinitionInstanceType addNewConnectiondefinitionInstance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.connector.GerConnectiondefinitionInstanceType target = null;
            target = (org.apache.geronimo.xbeans.connector.GerConnectiondefinitionInstanceType)get_store().add_element_user(CONNECTIONDEFINITIONINSTANCE$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "connectiondefinition-instance" element
     */
    public void removeConnectiondefinitionInstance(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONNECTIONDEFINITIONINSTANCE$2, i);
        }
    }
}
