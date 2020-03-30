/*
 * XML Type:  tService
 * Namespace: http://schemas.xmlsoap.org/wsdl/
 * Java type: org.apache.geronimo.xbeans.wsdl.TService
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.wsdl.impl;
/**
 * An XML tService(@http://schemas.xmlsoap.org/wsdl/).
 *
 * This is a complex type.
 */
public class TServiceImpl extends org.apache.geronimo.xbeans.wsdl.impl.TExtensibleDocumentedImpl implements org.apache.geronimo.xbeans.wsdl.TService
{
    private static final long serialVersionUID = 1L;
    
    public TServiceImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PORT$0 = 
        new javax.xml.namespace.QName("http://schemas.xmlsoap.org/wsdl/", "port");
    private static final javax.xml.namespace.QName NAME$2 = 
        new javax.xml.namespace.QName("", "name");
    
    
    /**
     * Gets array of all "port" elements
     */
    public org.apache.geronimo.xbeans.wsdl.TPort[] getPortArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PORT$0, targetList);
            org.apache.geronimo.xbeans.wsdl.TPort[] result = new org.apache.geronimo.xbeans.wsdl.TPort[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "port" element
     */
    public org.apache.geronimo.xbeans.wsdl.TPort getPortArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.wsdl.TPort target = null;
            target = (org.apache.geronimo.xbeans.wsdl.TPort)get_store().find_element_user(PORT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "port" element
     */
    public int sizeOfPortArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PORT$0);
        }
    }
    
    /**
     * Sets array of all "port" element
     */
    public void setPortArray(org.apache.geronimo.xbeans.wsdl.TPort[] portArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(portArray, PORT$0);
        }
    }
    
    /**
     * Sets ith "port" element
     */
    public void setPortArray(int i, org.apache.geronimo.xbeans.wsdl.TPort port)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.wsdl.TPort target = null;
            target = (org.apache.geronimo.xbeans.wsdl.TPort)get_store().find_element_user(PORT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(port);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "port" element
     */
    public org.apache.geronimo.xbeans.wsdl.TPort insertNewPort(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.wsdl.TPort target = null;
            target = (org.apache.geronimo.xbeans.wsdl.TPort)get_store().insert_element_user(PORT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "port" element
     */
    public org.apache.geronimo.xbeans.wsdl.TPort addNewPort()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.wsdl.TPort target = null;
            target = (org.apache.geronimo.xbeans.wsdl.TPort)get_store().add_element_user(PORT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "port" element
     */
    public void removePort(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PORT$0, i);
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
