/*
 * XML Type:  service-refType
 * Namespace: http://geronimo.apache.org/xml/ns/naming-1.2
 * Java type: org.apache.geronimo.xbeans.geronimo.naming.GerServiceRefType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.geronimo.naming.impl;
/**
 * An XML service-refType(@http://geronimo.apache.org/xml/ns/naming-1.2).
 *
 * This is a complex type.
 */
public class GerServiceRefTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.xbeans.geronimo.naming.GerServiceRefType
{
    private static final long serialVersionUID = 1L;
    
    public GerServiceRefTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SERVICEREFNAME$0 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "service-ref-name");
    private static final javax.xml.namespace.QName WSDLFILE$2 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "wsdl-file");
    private static final javax.xml.namespace.QName SERVICECOMPLETION$4 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "service-completion");
    private static final javax.xml.namespace.QName PORT$6 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "port");
    
    
    /**
     * Gets the "service-ref-name" element
     */
    public java.lang.String getServiceRefName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERVICEREFNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "service-ref-name" element
     */
    public org.apache.xmlbeans.XmlString xgetServiceRefName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SERVICEREFNAME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "service-ref-name" element
     */
    public void setServiceRefName(java.lang.String serviceRefName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERVICEREFNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SERVICEREFNAME$0);
            }
            target.setStringValue(serviceRefName);
        }
    }
    
    /**
     * Sets (as xml) the "service-ref-name" element
     */
    public void xsetServiceRefName(org.apache.xmlbeans.XmlString serviceRefName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SERVICEREFNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SERVICEREFNAME$0);
            }
            target.set(serviceRefName);
        }
    }
    
    /**
     * Gets the "wsdl-file" element
     */
    public java.lang.String getWsdlFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WSDLFILE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "wsdl-file" element
     */
    public org.apache.xmlbeans.XmlAnyURI xgetWsdlFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(WSDLFILE$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "wsdl-file" element
     */
    public boolean isSetWsdlFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WSDLFILE$2) != 0;
        }
    }
    
    /**
     * Sets the "wsdl-file" element
     */
    public void setWsdlFile(java.lang.String wsdlFile)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WSDLFILE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WSDLFILE$2);
            }
            target.setStringValue(wsdlFile);
        }
    }
    
    /**
     * Sets (as xml) the "wsdl-file" element
     */
    public void xsetWsdlFile(org.apache.xmlbeans.XmlAnyURI wsdlFile)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(WSDLFILE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(WSDLFILE$2);
            }
            target.set(wsdlFile);
        }
    }
    
    /**
     * Unsets the "wsdl-file" element
     */
    public void unsetWsdlFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WSDLFILE$2, 0);
        }
    }
    
    /**
     * Gets the "service-completion" element
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerServiceCompletionType getServiceCompletion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerServiceCompletionType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerServiceCompletionType)get_store().find_element_user(SERVICECOMPLETION$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "service-completion" element
     */
    public boolean isSetServiceCompletion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SERVICECOMPLETION$4) != 0;
        }
    }
    
    /**
     * Sets the "service-completion" element
     */
    public void setServiceCompletion(org.apache.geronimo.xbeans.geronimo.naming.GerServiceCompletionType serviceCompletion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerServiceCompletionType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerServiceCompletionType)get_store().find_element_user(SERVICECOMPLETION$4, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.xbeans.geronimo.naming.GerServiceCompletionType)get_store().add_element_user(SERVICECOMPLETION$4);
            }
            target.set(serviceCompletion);
        }
    }
    
    /**
     * Appends and returns a new empty "service-completion" element
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerServiceCompletionType addNewServiceCompletion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerServiceCompletionType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerServiceCompletionType)get_store().add_element_user(SERVICECOMPLETION$4);
            return target;
        }
    }
    
    /**
     * Unsets the "service-completion" element
     */
    public void unsetServiceCompletion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SERVICECOMPLETION$4, 0);
        }
    }
    
    /**
     * Gets array of all "port" elements
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerPortType[] getPortArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PORT$6, targetList);
            org.apache.geronimo.xbeans.geronimo.naming.GerPortType[] result = new org.apache.geronimo.xbeans.geronimo.naming.GerPortType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "port" element
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerPortType getPortArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerPortType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerPortType)get_store().find_element_user(PORT$6, i);
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
            return get_store().count_elements(PORT$6);
        }
    }
    
    /**
     * Sets array of all "port" element
     */
    public void setPortArray(org.apache.geronimo.xbeans.geronimo.naming.GerPortType[] portArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(portArray, PORT$6);
        }
    }
    
    /**
     * Sets ith "port" element
     */
    public void setPortArray(int i, org.apache.geronimo.xbeans.geronimo.naming.GerPortType port)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerPortType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerPortType)get_store().find_element_user(PORT$6, i);
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
    public org.apache.geronimo.xbeans.geronimo.naming.GerPortType insertNewPort(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerPortType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerPortType)get_store().insert_element_user(PORT$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "port" element
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerPortType addNewPort()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerPortType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerPortType)get_store().add_element_user(PORT$6);
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
            get_store().remove_element(PORT$6, i);
        }
    }
}
