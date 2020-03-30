/*
 * XML Type:  transportAddressType
 * Namespace: http://openejb.apache.org/xml/ns/corba-tss-config-2.1
 * Java type: org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTransportAddressType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.corba.xbeans.csiv2.tss.impl;
/**
 * An XML transportAddressType(@http://openejb.apache.org/xml/ns/corba-tss-config-2.1).
 *
 * This is an atomic type that is a restriction of org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTransportAddressType.
 */
public class TSSTransportAddressTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTransportAddressType
{
    private static final long serialVersionUID = 1L;
    
    public TSSTransportAddressTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, true);
    }
    
    protected TSSTransportAddressTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    
    private static final javax.xml.namespace.QName PORT$0 = 
        new javax.xml.namespace.QName("", "port");
    private static final javax.xml.namespace.QName HOSTNAME$2 = 
        new javax.xml.namespace.QName("", "hostname");
    
    
    /**
     * Gets the "port" attribute
     */
    public short getPort()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PORT$0);
            if (target == null)
            {
                return 0;
            }
            return target.getShortValue();
        }
    }
    
    /**
     * Gets (as xml) the "port" attribute
     */
    public org.apache.xmlbeans.XmlShort xgetPort()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlShort target = null;
            target = (org.apache.xmlbeans.XmlShort)get_store().find_attribute_user(PORT$0);
            return target;
        }
    }
    
    /**
     * True if has "port" attribute
     */
    public boolean isSetPort()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PORT$0) != null;
        }
    }
    
    /**
     * Sets the "port" attribute
     */
    public void setPort(short port)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PORT$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PORT$0);
            }
            target.setShortValue(port);
        }
    }
    
    /**
     * Sets (as xml) the "port" attribute
     */
    public void xsetPort(org.apache.xmlbeans.XmlShort port)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlShort target = null;
            target = (org.apache.xmlbeans.XmlShort)get_store().find_attribute_user(PORT$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlShort)get_store().add_attribute_user(PORT$0);
            }
            target.set(port);
        }
    }
    
    /**
     * Unsets the "port" attribute
     */
    public void unsetPort()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PORT$0);
        }
    }
    
    /**
     * Gets the "hostname" attribute
     */
    public java.lang.String getHostname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HOSTNAME$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "hostname" attribute
     */
    public org.apache.xmlbeans.XmlString xgetHostname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(HOSTNAME$2);
            return target;
        }
    }
    
    /**
     * True if has "hostname" attribute
     */
    public boolean isSetHostname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(HOSTNAME$2) != null;
        }
    }
    
    /**
     * Sets the "hostname" attribute
     */
    public void setHostname(java.lang.String hostname)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HOSTNAME$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HOSTNAME$2);
            }
            target.setStringValue(hostname);
        }
    }
    
    /**
     * Sets (as xml) the "hostname" attribute
     */
    public void xsetHostname(org.apache.xmlbeans.XmlString hostname)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(HOSTNAME$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(HOSTNAME$2);
            }
            target.set(hostname);
        }
    }
    
    /**
     * Unsets the "hostname" attribute
     */
    public void unsetHostname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(HOSTNAME$2);
        }
    }
}
