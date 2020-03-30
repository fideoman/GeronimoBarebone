/*
 * XML Type:  message-destinationType
 * Namespace: http://geronimo.apache.org/xml/ns/naming-1.2
 * Java type: org.apache.geronimo.xbeans.geronimo.naming.GerMessageDestinationType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.geronimo.naming.impl;
/**
 * An XML message-destinationType(@http://geronimo.apache.org/xml/ns/naming-1.2).
 *
 * This is a complex type.
 */
public class GerMessageDestinationTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.xbeans.geronimo.naming.GerMessageDestinationType
{
    private static final long serialVersionUID = 1L;
    
    public GerMessageDestinationTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MESSAGEDESTINATIONNAME$0 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "message-destination-name");
    private static final javax.xml.namespace.QName PATTERN$2 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "pattern");
    private static final javax.xml.namespace.QName ADMINOBJECTMODULE$4 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "admin-object-module");
    private static final javax.xml.namespace.QName ADMINOBJECTLINK$6 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "admin-object-link");
    
    
    /**
     * Gets the "message-destination-name" element
     */
    public java.lang.String getMessageDestinationName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGEDESTINATIONNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "message-destination-name" element
     */
    public org.apache.xmlbeans.XmlString xgetMessageDestinationName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MESSAGEDESTINATIONNAME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "message-destination-name" element
     */
    public void setMessageDestinationName(java.lang.String messageDestinationName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGEDESTINATIONNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MESSAGEDESTINATIONNAME$0);
            }
            target.setStringValue(messageDestinationName);
        }
    }
    
    /**
     * Sets (as xml) the "message-destination-name" element
     */
    public void xsetMessageDestinationName(org.apache.xmlbeans.XmlString messageDestinationName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MESSAGEDESTINATIONNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MESSAGEDESTINATIONNAME$0);
            }
            target.set(messageDestinationName);
        }
    }
    
    /**
     * Gets the "pattern" element
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerPatternType getPattern()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerPatternType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerPatternType)get_store().find_element_user(PATTERN$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "pattern" element
     */
    public boolean isSetPattern()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PATTERN$2) != 0;
        }
    }
    
    /**
     * Sets the "pattern" element
     */
    public void setPattern(org.apache.geronimo.xbeans.geronimo.naming.GerPatternType pattern)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerPatternType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerPatternType)get_store().find_element_user(PATTERN$2, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.xbeans.geronimo.naming.GerPatternType)get_store().add_element_user(PATTERN$2);
            }
            target.set(pattern);
        }
    }
    
    /**
     * Appends and returns a new empty "pattern" element
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerPatternType addNewPattern()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerPatternType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerPatternType)get_store().add_element_user(PATTERN$2);
            return target;
        }
    }
    
    /**
     * Unsets the "pattern" element
     */
    public void unsetPattern()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PATTERN$2, 0);
        }
    }
    
    /**
     * Gets the "admin-object-module" element
     */
    public java.lang.String getAdminObjectModule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADMINOBJECTMODULE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "admin-object-module" element
     */
    public org.apache.xmlbeans.XmlString xgetAdminObjectModule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADMINOBJECTMODULE$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "admin-object-module" element
     */
    public boolean isSetAdminObjectModule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADMINOBJECTMODULE$4) != 0;
        }
    }
    
    /**
     * Sets the "admin-object-module" element
     */
    public void setAdminObjectModule(java.lang.String adminObjectModule)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADMINOBJECTMODULE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADMINOBJECTMODULE$4);
            }
            target.setStringValue(adminObjectModule);
        }
    }
    
    /**
     * Sets (as xml) the "admin-object-module" element
     */
    public void xsetAdminObjectModule(org.apache.xmlbeans.XmlString adminObjectModule)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADMINOBJECTMODULE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADMINOBJECTMODULE$4);
            }
            target.set(adminObjectModule);
        }
    }
    
    /**
     * Unsets the "admin-object-module" element
     */
    public void unsetAdminObjectModule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADMINOBJECTMODULE$4, 0);
        }
    }
    
    /**
     * Gets the "admin-object-link" element
     */
    public java.lang.String getAdminObjectLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADMINOBJECTLINK$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "admin-object-link" element
     */
    public org.apache.xmlbeans.XmlString xgetAdminObjectLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADMINOBJECTLINK$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "admin-object-link" element
     */
    public boolean isSetAdminObjectLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADMINOBJECTLINK$6) != 0;
        }
    }
    
    /**
     * Sets the "admin-object-link" element
     */
    public void setAdminObjectLink(java.lang.String adminObjectLink)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADMINOBJECTLINK$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADMINOBJECTLINK$6);
            }
            target.setStringValue(adminObjectLink);
        }
    }
    
    /**
     * Sets (as xml) the "admin-object-link" element
     */
    public void xsetAdminObjectLink(org.apache.xmlbeans.XmlString adminObjectLink)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADMINOBJECTLINK$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADMINOBJECTLINK$6);
            }
            target.set(adminObjectLink);
        }
    }
    
    /**
     * Unsets the "admin-object-link" element
     */
    public void unsetAdminObjectLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADMINOBJECTLINK$6, 0);
        }
    }
}
