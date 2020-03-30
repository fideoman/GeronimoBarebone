/*
 * XML Type:  portType
 * Namespace: http://geronimo.apache.org/xml/ns/naming-1.2
 * Java type: org.apache.geronimo.xbeans.geronimo.naming.GerPortType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.geronimo.naming.impl;
/**
 * An XML portType(@http://geronimo.apache.org/xml/ns/naming-1.2).
 *
 * This is a complex type.
 */
public class GerPortTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.xbeans.geronimo.naming.GerPortType
{
    private static final long serialVersionUID = 1L;
    
    public GerPortTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PORTNAME$0 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "port-name");
    private static final javax.xml.namespace.QName PROTOCOL$2 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "protocol");
    private static final javax.xml.namespace.QName HOST$4 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "host");
    private static final javax.xml.namespace.QName PORT$6 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "port");
    private static final javax.xml.namespace.QName URI$8 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "uri");
    private static final javax.xml.namespace.QName CREDENTIALSNAME$10 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "credentials-name");
    private static final javax.xml.namespace.QName PROPERTY$12 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "property");
    
    
    /**
     * Gets the "port-name" element
     */
    public java.lang.String getPortName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PORTNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "port-name" element
     */
    public org.apache.xmlbeans.XmlString xgetPortName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PORTNAME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "port-name" element
     */
    public void setPortName(java.lang.String portName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PORTNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PORTNAME$0);
            }
            target.setStringValue(portName);
        }
    }
    
    /**
     * Sets (as xml) the "port-name" element
     */
    public void xsetPortName(org.apache.xmlbeans.XmlString portName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PORTNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PORTNAME$0);
            }
            target.set(portName);
        }
    }
    
    /**
     * Gets the "protocol" element
     */
    public java.lang.String getProtocol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROTOCOL$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "protocol" element
     */
    public org.apache.xmlbeans.XmlString xgetProtocol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROTOCOL$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "protocol" element
     */
    public boolean isSetProtocol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROTOCOL$2) != 0;
        }
    }
    
    /**
     * Sets the "protocol" element
     */
    public void setProtocol(java.lang.String protocol)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROTOCOL$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROTOCOL$2);
            }
            target.setStringValue(protocol);
        }
    }
    
    /**
     * Sets (as xml) the "protocol" element
     */
    public void xsetProtocol(org.apache.xmlbeans.XmlString protocol)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROTOCOL$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROTOCOL$2);
            }
            target.set(protocol);
        }
    }
    
    /**
     * Unsets the "protocol" element
     */
    public void unsetProtocol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROTOCOL$2, 0);
        }
    }
    
    /**
     * Gets the "host" element
     */
    public java.lang.String getHost()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HOST$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "host" element
     */
    public org.apache.xmlbeans.XmlString xgetHost()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HOST$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "host" element
     */
    public boolean isSetHost()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HOST$4) != 0;
        }
    }
    
    /**
     * Sets the "host" element
     */
    public void setHost(java.lang.String host)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HOST$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HOST$4);
            }
            target.setStringValue(host);
        }
    }
    
    /**
     * Sets (as xml) the "host" element
     */
    public void xsetHost(org.apache.xmlbeans.XmlString host)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HOST$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(HOST$4);
            }
            target.set(host);
        }
    }
    
    /**
     * Unsets the "host" element
     */
    public void unsetHost()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HOST$4, 0);
        }
    }
    
    /**
     * Gets the "port" element
     */
    public int getPort()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PORT$6, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "port" element
     */
    public org.apache.xmlbeans.XmlInt xgetPort()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(PORT$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "port" element
     */
    public boolean isSetPort()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PORT$6) != 0;
        }
    }
    
    /**
     * Sets the "port" element
     */
    public void setPort(int port)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PORT$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PORT$6);
            }
            target.setIntValue(port);
        }
    }
    
    /**
     * Sets (as xml) the "port" element
     */
    public void xsetPort(org.apache.xmlbeans.XmlInt port)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(PORT$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(PORT$6);
            }
            target.set(port);
        }
    }
    
    /**
     * Unsets the "port" element
     */
    public void unsetPort()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PORT$6, 0);
        }
    }
    
    /**
     * Gets the "uri" element
     */
    public java.lang.String getUri()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(URI$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "uri" element
     */
    public org.apache.xmlbeans.XmlString xgetUri()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(URI$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "uri" element
     */
    public void setUri(java.lang.String uri)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(URI$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(URI$8);
            }
            target.setStringValue(uri);
        }
    }
    
    /**
     * Sets (as xml) the "uri" element
     */
    public void xsetUri(org.apache.xmlbeans.XmlString uri)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(URI$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(URI$8);
            }
            target.set(uri);
        }
    }
    
    /**
     * Gets the "credentials-name" element
     */
    public java.lang.String getCredentialsName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREDENTIALSNAME$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "credentials-name" element
     */
    public org.apache.xmlbeans.XmlString xgetCredentialsName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CREDENTIALSNAME$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "credentials-name" element
     */
    public boolean isSetCredentialsName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CREDENTIALSNAME$10) != 0;
        }
    }
    
    /**
     * Sets the "credentials-name" element
     */
    public void setCredentialsName(java.lang.String credentialsName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREDENTIALSNAME$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CREDENTIALSNAME$10);
            }
            target.setStringValue(credentialsName);
        }
    }
    
    /**
     * Sets (as xml) the "credentials-name" element
     */
    public void xsetCredentialsName(org.apache.xmlbeans.XmlString credentialsName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CREDENTIALSNAME$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CREDENTIALSNAME$10);
            }
            target.set(credentialsName);
        }
    }
    
    /**
     * Unsets the "credentials-name" element
     */
    public void unsetCredentialsName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CREDENTIALSNAME$10, 0);
        }
    }
    
    /**
     * Gets array of all "property" elements
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerPortPropertyType[] getPropertyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PROPERTY$12, targetList);
            org.apache.geronimo.xbeans.geronimo.naming.GerPortPropertyType[] result = new org.apache.geronimo.xbeans.geronimo.naming.GerPortPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "property" element
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerPortPropertyType getPropertyArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerPortPropertyType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerPortPropertyType)get_store().find_element_user(PROPERTY$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "property" element
     */
    public int sizeOfPropertyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROPERTY$12);
        }
    }
    
    /**
     * Sets array of all "property" element
     */
    public void setPropertyArray(org.apache.geronimo.xbeans.geronimo.naming.GerPortPropertyType[] propertyArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(propertyArray, PROPERTY$12);
        }
    }
    
    /**
     * Sets ith "property" element
     */
    public void setPropertyArray(int i, org.apache.geronimo.xbeans.geronimo.naming.GerPortPropertyType property)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerPortPropertyType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerPortPropertyType)get_store().find_element_user(PROPERTY$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(property);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "property" element
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerPortPropertyType insertNewProperty(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerPortPropertyType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerPortPropertyType)get_store().insert_element_user(PROPERTY$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "property" element
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerPortPropertyType addNewProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerPortPropertyType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerPortPropertyType)get_store().add_element_user(PROPERTY$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "property" element
     */
    public void removeProperty(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROPERTY$12, i);
        }
    }
}
