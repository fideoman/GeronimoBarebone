/*
 * XML Type:  persistence-context-refType
 * Namespace: http://geronimo.apache.org/xml/ns/naming-1.2
 * Java type: org.apache.geronimo.xbeans.geronimo.naming.GerPersistenceContextRefType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.geronimo.naming.impl;
/**
 * An XML persistence-context-refType(@http://geronimo.apache.org/xml/ns/naming-1.2).
 *
 * This is a complex type.
 */
public class GerPersistenceContextRefTypeImpl extends org.apache.geronimo.xbeans.geronimo.naming.impl.GerAbstractNamingEntryTypeImpl implements org.apache.geronimo.xbeans.geronimo.naming.GerPersistenceContextRefType
{
    private static final long serialVersionUID = 1L;
    
    public GerPersistenceContextRefTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PERSISTENCECONTEXTREFNAME$0 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "persistence-context-ref-name");
    private static final javax.xml.namespace.QName PERSISTENCEUNITNAME$2 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "persistence-unit-name");
    private static final javax.xml.namespace.QName PATTERN$4 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "pattern");
    private static final javax.xml.namespace.QName PERSISTENCECONTEXTTYPE$6 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "persistence-context-type");
    private static final javax.xml.namespace.QName PROPERTY$8 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "property");
    
    
    /**
     * Gets the "persistence-context-ref-name" element
     */
    public java.lang.String getPersistenceContextRefName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERSISTENCECONTEXTREFNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "persistence-context-ref-name" element
     */
    public org.apache.xmlbeans.XmlString xgetPersistenceContextRefName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PERSISTENCECONTEXTREFNAME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "persistence-context-ref-name" element
     */
    public void setPersistenceContextRefName(java.lang.String persistenceContextRefName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERSISTENCECONTEXTREFNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PERSISTENCECONTEXTREFNAME$0);
            }
            target.setStringValue(persistenceContextRefName);
        }
    }
    
    /**
     * Sets (as xml) the "persistence-context-ref-name" element
     */
    public void xsetPersistenceContextRefName(org.apache.xmlbeans.XmlString persistenceContextRefName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PERSISTENCECONTEXTREFNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PERSISTENCECONTEXTREFNAME$0);
            }
            target.set(persistenceContextRefName);
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
    
    /**
     * Gets the "persistence-context-type" element
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerPersistenceContextTypeType.Enum getPersistenceContextType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERSISTENCECONTEXTTYPE$6, 0);
            if (target == null)
            {
                return null;
            }
            return (org.apache.geronimo.xbeans.geronimo.naming.GerPersistenceContextTypeType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "persistence-context-type" element
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerPersistenceContextTypeType xgetPersistenceContextType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerPersistenceContextTypeType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerPersistenceContextTypeType)get_store().find_element_user(PERSISTENCECONTEXTTYPE$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "persistence-context-type" element
     */
    public boolean isSetPersistenceContextType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PERSISTENCECONTEXTTYPE$6) != 0;
        }
    }
    
    /**
     * Sets the "persistence-context-type" element
     */
    public void setPersistenceContextType(org.apache.geronimo.xbeans.geronimo.naming.GerPersistenceContextTypeType.Enum persistenceContextType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERSISTENCECONTEXTTYPE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PERSISTENCECONTEXTTYPE$6);
            }
            target.setEnumValue(persistenceContextType);
        }
    }
    
    /**
     * Sets (as xml) the "persistence-context-type" element
     */
    public void xsetPersistenceContextType(org.apache.geronimo.xbeans.geronimo.naming.GerPersistenceContextTypeType persistenceContextType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerPersistenceContextTypeType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerPersistenceContextTypeType)get_store().find_element_user(PERSISTENCECONTEXTTYPE$6, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.xbeans.geronimo.naming.GerPersistenceContextTypeType)get_store().add_element_user(PERSISTENCECONTEXTTYPE$6);
            }
            target.set(persistenceContextType);
        }
    }
    
    /**
     * Unsets the "persistence-context-type" element
     */
    public void unsetPersistenceContextType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PERSISTENCECONTEXTTYPE$6, 0);
        }
    }
    
    /**
     * Gets array of all "property" elements
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerPropertyType[] getPropertyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PROPERTY$8, targetList);
            org.apache.geronimo.xbeans.geronimo.naming.GerPropertyType[] result = new org.apache.geronimo.xbeans.geronimo.naming.GerPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "property" element
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerPropertyType getPropertyArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerPropertyType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerPropertyType)get_store().find_element_user(PROPERTY$8, i);
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
            return get_store().count_elements(PROPERTY$8);
        }
    }
    
    /**
     * Sets array of all "property" element
     */
    public void setPropertyArray(org.apache.geronimo.xbeans.geronimo.naming.GerPropertyType[] propertyArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(propertyArray, PROPERTY$8);
        }
    }
    
    /**
     * Sets ith "property" element
     */
    public void setPropertyArray(int i, org.apache.geronimo.xbeans.geronimo.naming.GerPropertyType property)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerPropertyType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerPropertyType)get_store().find_element_user(PROPERTY$8, i);
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
    public org.apache.geronimo.xbeans.geronimo.naming.GerPropertyType insertNewProperty(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerPropertyType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerPropertyType)get_store().insert_element_user(PROPERTY$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "property" element
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerPropertyType addNewProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerPropertyType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerPropertyType)get_store().add_element_user(PROPERTY$8);
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
            get_store().remove_element(PROPERTY$8, i);
        }
    }
}
