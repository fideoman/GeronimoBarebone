/*
 * XML Type:  port-completionType
 * Namespace: http://geronimo.apache.org/xml/ns/naming-1.2
 * Java type: org.apache.geronimo.xbeans.geronimo.naming.GerPortCompletionType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.geronimo.naming.impl;
/**
 * An XML port-completionType(@http://geronimo.apache.org/xml/ns/naming-1.2).
 *
 * This is a complex type.
 */
public class GerPortCompletionTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.xbeans.geronimo.naming.GerPortCompletionType
{
    private static final long serialVersionUID = 1L;
    
    public GerPortCompletionTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PORT$0 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "port");
    private static final javax.xml.namespace.QName BINDINGNAME$2 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "binding-name");
    
    
    /**
     * Gets the "port" element
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerPortType getPort()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerPortType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerPortType)get_store().find_element_user(PORT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "port" element
     */
    public void setPort(org.apache.geronimo.xbeans.geronimo.naming.GerPortType port)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerPortType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerPortType)get_store().find_element_user(PORT$0, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.xbeans.geronimo.naming.GerPortType)get_store().add_element_user(PORT$0);
            }
            target.set(port);
        }
    }
    
    /**
     * Appends and returns a new empty "port" element
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerPortType addNewPort()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerPortType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerPortType)get_store().add_element_user(PORT$0);
            return target;
        }
    }
    
    /**
     * Gets the "binding-name" element
     */
    public java.lang.String getBindingName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BINDINGNAME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "binding-name" element
     */
    public org.apache.xmlbeans.XmlString xgetBindingName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BINDINGNAME$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "binding-name" element
     */
    public void setBindingName(java.lang.String bindingName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BINDINGNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BINDINGNAME$2);
            }
            target.setStringValue(bindingName);
        }
    }
    
    /**
     * Sets (as xml) the "binding-name" element
     */
    public void xsetBindingName(org.apache.xmlbeans.XmlString bindingName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BINDINGNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BINDINGNAME$2);
            }
            target.set(bindingName);
        }
    }
}
