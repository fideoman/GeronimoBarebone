/*
 * XML Type:  tPortType
 * Namespace: http://schemas.xmlsoap.org/wsdl/
 * Java type: org.apache.geronimo.xbeans.wsdl.TPortType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.wsdl.impl;
/**
 * An XML tPortType(@http://schemas.xmlsoap.org/wsdl/).
 *
 * This is a complex type.
 */
public class TPortTypeImpl extends org.apache.geronimo.xbeans.wsdl.impl.TExtensibleAttributesDocumentedImpl implements org.apache.geronimo.xbeans.wsdl.TPortType
{
    private static final long serialVersionUID = 1L;
    
    public TPortTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OPERATION$0 = 
        new javax.xml.namespace.QName("http://schemas.xmlsoap.org/wsdl/", "operation");
    private static final javax.xml.namespace.QName NAME$2 = 
        new javax.xml.namespace.QName("", "name");
    
    
    /**
     * Gets array of all "operation" elements
     */
    public org.apache.geronimo.xbeans.wsdl.TOperation[] getOperationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(OPERATION$0, targetList);
            org.apache.geronimo.xbeans.wsdl.TOperation[] result = new org.apache.geronimo.xbeans.wsdl.TOperation[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "operation" element
     */
    public org.apache.geronimo.xbeans.wsdl.TOperation getOperationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.wsdl.TOperation target = null;
            target = (org.apache.geronimo.xbeans.wsdl.TOperation)get_store().find_element_user(OPERATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "operation" element
     */
    public int sizeOfOperationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OPERATION$0);
        }
    }
    
    /**
     * Sets array of all "operation" element
     */
    public void setOperationArray(org.apache.geronimo.xbeans.wsdl.TOperation[] operationArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(operationArray, OPERATION$0);
        }
    }
    
    /**
     * Sets ith "operation" element
     */
    public void setOperationArray(int i, org.apache.geronimo.xbeans.wsdl.TOperation operation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.wsdl.TOperation target = null;
            target = (org.apache.geronimo.xbeans.wsdl.TOperation)get_store().find_element_user(OPERATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(operation);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "operation" element
     */
    public org.apache.geronimo.xbeans.wsdl.TOperation insertNewOperation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.wsdl.TOperation target = null;
            target = (org.apache.geronimo.xbeans.wsdl.TOperation)get_store().insert_element_user(OPERATION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "operation" element
     */
    public org.apache.geronimo.xbeans.wsdl.TOperation addNewOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.wsdl.TOperation target = null;
            target = (org.apache.geronimo.xbeans.wsdl.TOperation)get_store().add_element_user(OPERATION$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "operation" element
     */
    public void removeOperation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OPERATION$0, i);
        }
    }
    
    /**
     * Gets the "name" attribute
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "name" attribute
     */
    public org.apache.xmlbeans.XmlNCName xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNCName target = null;
            target = (org.apache.xmlbeans.XmlNCName)get_store().find_attribute_user(NAME$2);
            return target;
        }
    }
    
    /**
     * Sets the "name" attribute
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$2);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "name" attribute
     */
    public void xsetName(org.apache.xmlbeans.XmlNCName name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNCName target = null;
            target = (org.apache.xmlbeans.XmlNCName)get_store().find_attribute_user(NAME$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNCName)get_store().add_attribute_user(NAME$2);
            }
            target.set(name);
        }
    }
}
