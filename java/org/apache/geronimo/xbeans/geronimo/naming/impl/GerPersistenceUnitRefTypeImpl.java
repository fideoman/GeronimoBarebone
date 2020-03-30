/*
 * XML Type:  persistence-unit-refType
 * Namespace: http://geronimo.apache.org/xml/ns/naming-1.2
 * Java type: org.apache.geronimo.xbeans.geronimo.naming.GerPersistenceUnitRefType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.geronimo.naming.impl;
/**
 * An XML persistence-unit-refType(@http://geronimo.apache.org/xml/ns/naming-1.2).
 *
 * This is a complex type.
 */
public class GerPersistenceUnitRefTypeImpl extends org.apache.geronimo.xbeans.geronimo.naming.impl.GerAbstractNamingEntryTypeImpl implements org.apache.geronimo.xbeans.geronimo.naming.GerPersistenceUnitRefType
{
    private static final long serialVersionUID = 1L;
    
    public GerPersistenceUnitRefTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PERSISTENCEUNITREFNAME$0 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "persistence-unit-ref-name");
    private static final javax.xml.namespace.QName PERSISTENCEUNITNAME$2 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "persistence-unit-name");
    private static final javax.xml.namespace.QName PATTERN$4 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "pattern");
    
    
    /**
     * Gets the "persistence-unit-ref-name" element
     */
    public java.lang.String getPersistenceUnitRefName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERSISTENCEUNITREFNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "persistence-unit-ref-name" element
     */
    public org.apache.xmlbeans.XmlString xgetPersistenceUnitRefName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PERSISTENCEUNITREFNAME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "persistence-unit-ref-name" element
     */
    public void setPersistenceUnitRefName(java.lang.String persistenceUnitRefName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERSISTENCEUNITREFNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PERSISTENCEUNITREFNAME$0);
            }
            target.setStringValue(persistenceUnitRefName);
        }
    }
    
    /**
     * Sets (as xml) the "persistence-unit-ref-name" element
     */
    public void xsetPersistenceUnitRefName(org.apache.xmlbeans.XmlString persistenceUnitRefName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PERSISTENCEUNITREFNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PERSISTENCEUNITREFNAME$0);
            }
            target.set(persistenceUnitRefName);
        }
    }
    
    /**
     * Gets the "persistence-unit-name" element
     */
    public java.lang.String getPersistenceUnitName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERSISTENCEUNITNAME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "persistence-unit-name" element
     */
    public org.apache.xmlbeans.XmlString xgetPersistenceUnitName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PERSISTENCEUNITNAME$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "persistence-unit-name" element
     */
    public boolean isSetPersistenceUnitName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PERSISTENCEUNITNAME$2) != 0;
        }
    }
    
    /**
     * Sets the "persistence-unit-name" element
     */
    public void setPersistenceUnitName(java.lang.String persistenceUnitName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERSISTENCEUNITNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PERSISTENCEUNITNAME$2);
            }
            target.setStringValue(persistenceUnitName);
        }
    }
    
    /**
     * Sets (as xml) the "persistence-unit-name" element
     */
    public void xsetPersistenceUnitName(org.apache.xmlbeans.XmlString persistenceUnitName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PERSISTENCEUNITNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PERSISTENCEUNITNAME$2);
            }
            target.set(persistenceUnitName);
        }
    }
    
    /**
     * Unsets the "persistence-unit-name" element
     */
    public void unsetPersistenceUnitName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PERSISTENCEUNITNAME$2, 0);
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
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerPatternType)get_store().find_element_user(PATTERN$4, 0);
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
            return get_store().count_elements(PATTERN$4) != 0;
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
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerPatternType)get_store().find_element_user(PATTERN$4, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.xbeans.geronimo.naming.GerPatternType)get_store().add_element_user(PATTERN$4);
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
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerPatternType)get_store().add_element_user(PATTERN$4);
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
            get_store().remove_element(PATTERN$4, 0);
        }
    }
}
