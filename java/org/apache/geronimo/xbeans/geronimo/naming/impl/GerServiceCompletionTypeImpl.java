/*
 * XML Type:  service-completionType
 * Namespace: http://geronimo.apache.org/xml/ns/naming-1.2
 * Java type: org.apache.geronimo.xbeans.geronimo.naming.GerServiceCompletionType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.geronimo.naming.impl;
/**
 * An XML service-completionType(@http://geronimo.apache.org/xml/ns/naming-1.2).
 *
 * This is a complex type.
 */
public class GerServiceCompletionTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.xbeans.geronimo.naming.GerServiceCompletionType
{
    private static final long serialVersionUID = 1L;
    
    public GerServiceCompletionTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SERVICENAME$0 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "service-name");
    private static final javax.xml.namespace.QName PORTCOMPLETION$2 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "port-completion");
    
    
    /**
     * Gets the "service-name" element
     */
    public java.lang.String getServiceName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERVICENAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "service-name" element
     */
    public org.apache.xmlbeans.XmlString xgetServiceName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SERVICENAME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "service-name" element
     */
    public void setServiceName(java.lang.String serviceName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERVICENAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SERVICENAME$0);
            }
            target.setStringValue(serviceName);
        }
    }
    
    /**
     * Sets (as xml) the "service-name" element
     */
    public void xsetServiceName(org.apache.xmlbeans.XmlString serviceName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SERVICENAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SERVICENAME$0);
            }
            target.set(serviceName);
        }
    }
    
    /**
     * Gets array of all "port-completion" elements
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerPortCompletionType[] getPortCompletionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PORTCOMPLETION$2, targetList);
            org.apache.geronimo.xbeans.geronimo.naming.GerPortCompletionType[] result = new org.apache.geronimo.xbeans.geronimo.naming.GerPortCompletionType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "port-completion" element
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerPortCompletionType getPortCompletionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerPortCompletionType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerPortCompletionType)get_store().find_element_user(PORTCOMPLETION$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "port-completion" element
     */
    public int sizeOfPortCompletionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PORTCOMPLETION$2);
        }
    }
    
    /**
     * Sets array of all "port-completion" element
     */
    public void setPortCompletionArray(org.apache.geronimo.xbeans.geronimo.naming.GerPortCompletionType[] portCompletionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(portCompletionArray, PORTCOMPLETION$2);
        }
    }
    
    /**
     * Sets ith "port-completion" element
     */
    public void setPortCompletionArray(int i, org.apache.geronimo.xbeans.geronimo.naming.GerPortCompletionType portCompletion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerPortCompletionType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerPortCompletionType)get_store().find_element_user(PORTCOMPLETION$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(portCompletion);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "port-completion" element
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerPortCompletionType insertNewPortCompletion(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerPortCompletionType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerPortCompletionType)get_store().insert_element_user(PORTCOMPLETION$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "port-completion" element
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerPortCompletionType addNewPortCompletion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerPortCompletionType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerPortCompletionType)get_store().add_element_user(PORTCOMPLETION$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "port-completion" element
     */
    public void removePortCompletion(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PORTCOMPLETION$2, i);
        }
    }
}
