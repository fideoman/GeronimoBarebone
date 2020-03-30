/*
 * XML Type:  tBinding
 * Namespace: http://schemas.xmlsoap.org/wsdl/
 * Java type: org.apache.geronimo.xbeans.wsdl.TBinding
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.wsdl.impl;
/**
 * An XML tBinding(@http://schemas.xmlsoap.org/wsdl/).
 *
 * This is a complex type.
 */
public class TBindingImpl extends org.apache.geronimo.xbeans.wsdl.impl.TExtensibleDocumentedImpl implements org.apache.geronimo.xbeans.wsdl.TBinding
{
    private static final long serialVersionUID = 1L;
    
    public TBindingImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OPERATION$0 = 
        new javax.xml.namespace.QName("http://schemas.xmlsoap.org/wsdl/", "operation");
    private static final javax.xml.namespace.QName NAME$2 = 
        new javax.xml.namespace.QName("", "name");
    private static final javax.xml.namespace.QName TYPE$4 = 
        new javax.xml.namespace.QName("", "type");
    
    
    /**
     * Gets array of all "operation" elements
     */
    public org.apache.geronimo.xbeans.wsdl.TBindingOperation[] getOperationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(OPERATION$0, targetList);
            org.apache.geronimo.xbeans.wsdl.TBindingOperation[] result = new org.apache.geronimo.xbeans.wsdl.TBindingOperation[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "operation" element
     */
    public org.apache.geronimo.xbeans.wsdl.TBindingOperation getOperationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.wsdl.TBindingOperation target = null;
            target = (org.apache.geronimo.xbeans.wsdl.TBindingOperation)get_store().find_element_user(OPERATION$0, i);
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
    public void setOperationArray(org.apache.geronimo.xbeans.wsdl.TBindingOperation[] operationArray)
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
    public void setOperationArray(int i, org.apache.geronimo.xbeans.wsdl.TBindingOperation operation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.wsdl.TBindingOperation target = null;
            target = (org.apache.geronimo.xbeans.wsdl.TBindingOperation)get_store().find_element_user(OPERATION$0, i);
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
    public org.apache.geronimo.xbeans.wsdl.TBindingOperation insertNewOperation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.wsdl.TBindingOperation target = null;
            target = (org.apache.geronimo.xbeans.wsdl.TBindingOperation)get_store().insert_element_user(OPERATION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "operation" element
     */
    public org.apache.geronimo.xbeans.wsdl.TBindingOperation addNewOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.wsdl.TBindingOperation target = null;
            target = (org.apache.geronimo.xbeans.wsdl.TBindingOperation)get_store().add_element_user(OPERATION$0);
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
    
    /**
     * Gets the "type" attribute
     */
    public javax.xml.namespace.QName getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$4);
            if (target == null)
            {
                return null;
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) the "type" attribute
     */
    public org.apache.xmlbeans.XmlQName xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(TYPE$4);
            return target;
        }
    }
    
    /**
     * Sets the "type" attribute
     */
    public void setType(javax.xml.namespace.QName type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$4);
            }
            target.setQNameValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "type" attribute
     */
    public void xsetType(org.apache.xmlbeans.XmlQName type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(TYPE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_attribute_user(TYPE$4);
            }
            target.set(type);
        }
    }
}
