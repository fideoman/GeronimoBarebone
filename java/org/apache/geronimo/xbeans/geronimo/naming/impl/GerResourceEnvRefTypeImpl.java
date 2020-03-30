/*
 * XML Type:  resource-env-refType
 * Namespace: http://geronimo.apache.org/xml/ns/naming-1.2
 * Java type: org.apache.geronimo.xbeans.geronimo.naming.GerResourceEnvRefType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.geronimo.naming.impl;
/**
 * An XML resource-env-refType(@http://geronimo.apache.org/xml/ns/naming-1.2).
 *
 * This is a complex type.
 */
public class GerResourceEnvRefTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.xbeans.geronimo.naming.GerResourceEnvRefType
{
    private static final long serialVersionUID = 1L;
    
    public GerResourceEnvRefTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REFNAME$0 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "ref-name");
    private static final javax.xml.namespace.QName PATTERN$2 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "pattern");
    private static final javax.xml.namespace.QName MESSAGEDESTINATIONLINK$4 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "message-destination-link");
    private static final javax.xml.namespace.QName ADMINOBJECTMODULE$6 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "admin-object-module");
    private static final javax.xml.namespace.QName ADMINOBJECTLINK$8 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "admin-object-link");
    private static final javax.xml.namespace.QName REFERENCECLASS$10 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "reference-class");
    private static final javax.xml.namespace.QName STRINGADDRTYPE$12 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "string-addr-type");
    private static final javax.xml.namespace.QName STRINGADDR$14 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "string-addr");
    private static final javax.xml.namespace.QName OBJECTFACTORY$16 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "object-factory");
    private static final javax.xml.namespace.QName OBJECTFACTORYLOCATION$18 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "object-factory-location");
    
    
    /**
     * Gets the "ref-name" element
     */
    public java.lang.String getRefName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ref-name" element
     */
    public org.apache.xmlbeans.XmlString xgetRefName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REFNAME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ref-name" element
     */
    public void setRefName(java.lang.String refName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REFNAME$0);
            }
            target.setStringValue(refName);
        }
    }
    
    /**
     * Sets (as xml) the "ref-name" element
     */
    public void xsetRefName(org.apache.xmlbeans.XmlString refName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REFNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REFNAME$0);
            }
            target.set(refName);
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
     * Gets the "message-destination-link" element
     */
    public java.lang.String getMessageDestinationLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGEDESTINATIONLINK$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "message-destination-link" element
     */
    public org.apache.xmlbeans.XmlString xgetMessageDestinationLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MESSAGEDESTINATIONLINK$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "message-destination-link" element
     */
    public boolean isSetMessageDestinationLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MESSAGEDESTINATIONLINK$4) != 0;
        }
    }
    
    /**
     * Sets the "message-destination-link" element
     */
    public void setMessageDestinationLink(java.lang.String messageDestinationLink)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGEDESTINATIONLINK$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MESSAGEDESTINATIONLINK$4);
            }
            target.setStringValue(messageDestinationLink);
        }
    }
    
    /**
     * Sets (as xml) the "message-destination-link" element
     */
    public void xsetMessageDestinationLink(org.apache.xmlbeans.XmlString messageDestinationLink)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MESSAGEDESTINATIONLINK$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MESSAGEDESTINATIONLINK$4);
            }
            target.set(messageDestinationLink);
        }
    }
    
    /**
     * Unsets the "message-destination-link" element
     */
    public void unsetMessageDestinationLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MESSAGEDESTINATIONLINK$4, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADMINOBJECTMODULE$6, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADMINOBJECTMODULE$6, 0);
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
            return get_store().count_elements(ADMINOBJECTMODULE$6) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADMINOBJECTMODULE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADMINOBJECTMODULE$6);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADMINOBJECTMODULE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADMINOBJECTMODULE$6);
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
            get_store().remove_element(ADMINOBJECTMODULE$6, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADMINOBJECTLINK$8, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADMINOBJECTLINK$8, 0);
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
            return get_store().count_elements(ADMINOBJECTLINK$8) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADMINOBJECTLINK$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADMINOBJECTLINK$8);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADMINOBJECTLINK$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADMINOBJECTLINK$8);
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
            get_store().remove_element(ADMINOBJECTLINK$8, 0);
        }
    }
    
    /**
     * Gets the "reference-class" element
     */
    public java.lang.String getReferenceClass()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFERENCECLASS$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "reference-class" element
     */
    public org.apache.xmlbeans.XmlString xgetReferenceClass()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REFERENCECLASS$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "reference-class" element
     */
    public boolean isSetReferenceClass()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REFERENCECLASS$10) != 0;
        }
    }
    
    /**
     * Sets the "reference-class" element
     */
    public void setReferenceClass(java.lang.String referenceClass)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFERENCECLASS$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REFERENCECLASS$10);
            }
            target.setStringValue(referenceClass);
        }
    }
    
    /**
     * Sets (as xml) the "reference-class" element
     */
    public void xsetReferenceClass(org.apache.xmlbeans.XmlString referenceClass)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REFERENCECLASS$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REFERENCECLASS$10);
            }
            target.set(referenceClass);
        }
    }
    
    /**
     * Unsets the "reference-class" element
     */
    public void unsetReferenceClass()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REFERENCECLASS$10, 0);
        }
    }
    
    /**
     * Gets the "string-addr-type" element
     */
    public java.lang.String getStringAddrType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STRINGADDRTYPE$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "string-addr-type" element
     */
    public org.apache.xmlbeans.XmlString xgetStringAddrType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STRINGADDRTYPE$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "string-addr-type" element
     */
    public boolean isSetStringAddrType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STRINGADDRTYPE$12) != 0;
        }
    }
    
    /**
     * Sets the "string-addr-type" element
     */
    public void setStringAddrType(java.lang.String stringAddrType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STRINGADDRTYPE$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STRINGADDRTYPE$12);
            }
            target.setStringValue(stringAddrType);
        }
    }
    
    /**
     * Sets (as xml) the "string-addr-type" element
     */
    public void xsetStringAddrType(org.apache.xmlbeans.XmlString stringAddrType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STRINGADDRTYPE$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STRINGADDRTYPE$12);
            }
            target.set(stringAddrType);
        }
    }
    
    /**
     * Unsets the "string-addr-type" element
     */
    public void unsetStringAddrType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STRINGADDRTYPE$12, 0);
        }
    }
    
    /**
     * Gets the "string-addr" element
     */
    public java.lang.String getStringAddr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STRINGADDR$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "string-addr" element
     */
    public org.apache.xmlbeans.XmlString xgetStringAddr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STRINGADDR$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "string-addr" element
     */
    public boolean isSetStringAddr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STRINGADDR$14) != 0;
        }
    }
    
    /**
     * Sets the "string-addr" element
     */
    public void setStringAddr(java.lang.String stringAddr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STRINGADDR$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STRINGADDR$14);
            }
            target.setStringValue(stringAddr);
        }
    }
    
    /**
     * Sets (as xml) the "string-addr" element
     */
    public void xsetStringAddr(org.apache.xmlbeans.XmlString stringAddr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STRINGADDR$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STRINGADDR$14);
            }
            target.set(stringAddr);
        }
    }
    
    /**
     * Unsets the "string-addr" element
     */
    public void unsetStringAddr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STRINGADDR$14, 0);
        }
    }
    
    /**
     * Gets the "object-factory" element
     */
    public java.lang.String getObjectFactory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OBJECTFACTORY$16, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "object-factory" element
     */
    public org.apache.xmlbeans.XmlString xgetObjectFactory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OBJECTFACTORY$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "object-factory" element
     */
    public boolean isSetObjectFactory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OBJECTFACTORY$16) != 0;
        }
    }
    
    /**
     * Sets the "object-factory" element
     */
    public void setObjectFactory(java.lang.String objectFactory)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OBJECTFACTORY$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OBJECTFACTORY$16);
            }
            target.setStringValue(objectFactory);
        }
    }
    
    /**
     * Sets (as xml) the "object-factory" element
     */
    public void xsetObjectFactory(org.apache.xmlbeans.XmlString objectFactory)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OBJECTFACTORY$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OBJECTFACTORY$16);
            }
            target.set(objectFactory);
        }
    }
    
    /**
     * Unsets the "object-factory" element
     */
    public void unsetObjectFactory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OBJECTFACTORY$16, 0);
        }
    }
    
    /**
     * Gets the "object-factory-location" element
     */
    public java.lang.String getObjectFactoryLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OBJECTFACTORYLOCATION$18, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "object-factory-location" element
     */
    public org.apache.xmlbeans.XmlString xgetObjectFactoryLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OBJECTFACTORYLOCATION$18, 0);
            return target;
        }
    }
    
    /**
     * True if has "object-factory-location" element
     */
    public boolean isSetObjectFactoryLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OBJECTFACTORYLOCATION$18) != 0;
        }
    }
    
    /**
     * Sets the "object-factory-location" element
     */
    public void setObjectFactoryLocation(java.lang.String objectFactoryLocation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OBJECTFACTORYLOCATION$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OBJECTFACTORYLOCATION$18);
            }
            target.setStringValue(objectFactoryLocation);
        }
    }
    
    /**
     * Sets (as xml) the "object-factory-location" element
     */
    public void xsetObjectFactoryLocation(org.apache.xmlbeans.XmlString objectFactoryLocation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OBJECTFACTORYLOCATION$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OBJECTFACTORYLOCATION$18);
            }
            target.set(objectFactoryLocation);
        }
    }
    
    /**
     * Unsets the "object-factory-location" element
     */
    public void unsetObjectFactoryLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OBJECTFACTORYLOCATION$18, 0);
        }
    }
}
