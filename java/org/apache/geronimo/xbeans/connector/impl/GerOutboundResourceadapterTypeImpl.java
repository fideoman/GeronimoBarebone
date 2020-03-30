/*
 * XML Type:  outbound-resourceadapterType
 * Namespace: http://geronimo.apache.org/xml/ns/j2ee/connector-1.2
 * Java type: org.apache.geronimo.xbeans.connector.GerOutboundResourceadapterType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.connector.impl;
/**
 * An XML outbound-resourceadapterType(@http://geronimo.apache.org/xml/ns/j2ee/connector-1.2).
 *
 * This is a complex type.
 */
public class GerOutboundResourceadapterTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.xbeans.connector.GerOutboundResourceadapterType
{
    private static final long serialVersionUID = 1L;
    
    public GerOutboundResourceadapterTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONNECTIONDEFINITION$0 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/j2ee/connector-1.2", "connection-definition");
    
    
    /**
     * Gets array of all "connection-definition" elements
     */
    public org.apache.geronimo.xbeans.connector.GerConnectionDefinitionType[] getConnectionDefinitionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CONNECTIONDEFINITION$0, targetList);
            org.apache.geronimo.xbeans.connector.GerConnectionDefinitionType[] result = new org.apache.geronimo.xbeans.connector.GerConnectionDefinitionType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "connection-definition" element
     */
    public org.apache.geronimo.xbeans.connector.GerConnectionDefinitionType getConnectionDefinitionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.connector.GerConnectionDefinitionType target = null;
            target = (org.apache.geronimo.xbeans.connector.GerConnectionDefinitionType)get_store().find_element_user(CONNECTIONDEFINITION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "connection-definition" element
     */
    public int sizeOfConnectionDefinitionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONNECTIONDEFINITION$0);
        }
    }
    
    /**
     * Sets array of all "connection-definition" element
     */
    public void setConnectionDefinitionArray(org.apache.geronimo.xbeans.connector.GerConnectionDefinitionType[] connectionDefinitionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(connectionDefinitionArray, CONNECTIONDEFINITION$0);
        }
    }
    
    /**
     * Sets ith "connection-definition" element
     */
    public void setConnectionDefinitionArray(int i, org.apache.geronimo.xbeans.connector.GerConnectionDefinitionType connectionDefinition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.connector.GerConnectionDefinitionType target = null;
            target = (org.apache.geronimo.xbeans.connector.GerConnectionDefinitionType)get_store().find_element_user(CONNECTIONDEFINITION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(connectionDefinition);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "connection-definition" element
     */
    public org.apache.geronimo.xbeans.connector.GerConnectionDefinitionType insertNewConnectionDefinition(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.connector.GerConnectionDefinitionType target = null;
            target = (org.apache.geronimo.xbeans.connector.GerConnectionDefinitionType)get_store().insert_element_user(CONNECTIONDEFINITION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "connection-definition" element
     */
    public org.apache.geronimo.xbeans.connector.GerConnectionDefinitionType addNewConnectionDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.connector.GerConnectionDefinitionType target = null;
            target = (org.apache.geronimo.xbeans.connector.GerConnectionDefinitionType)get_store().add_element_user(CONNECTIONDEFINITION$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "connection-definition" element
     */
    public void removeConnectionDefinition(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONNECTIONDEFINITION$0, i);
        }
    }
}
