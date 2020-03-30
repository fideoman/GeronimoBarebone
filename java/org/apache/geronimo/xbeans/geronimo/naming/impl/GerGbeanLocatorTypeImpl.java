/*
 * XML Type:  gbean-locatorType
 * Namespace: http://geronimo.apache.org/xml/ns/naming-1.2
 * Java type: org.apache.geronimo.xbeans.geronimo.naming.GerGbeanLocatorType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.geronimo.naming.impl;
/**
 * An XML gbean-locatorType(@http://geronimo.apache.org/xml/ns/naming-1.2).
 *
 * This is a complex type.
 */
public class GerGbeanLocatorTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.xbeans.geronimo.naming.GerGbeanLocatorType
{
    private static final long serialVersionUID = 1L;
    
    public GerGbeanLocatorTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PATTERN$0 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "pattern");
    private static final javax.xml.namespace.QName GBEANLINK$2 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "gbean-link");
    
    
    /**
     * Gets the "pattern" element
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerPatternType getPattern()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerPatternType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerPatternType)get_store().find_element_user(PATTERN$0, 0);
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
            return get_store().count_elements(PATTERN$0) != 0;
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
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerPatternType)get_store().find_element_user(PATTERN$0, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.xbeans.geronimo.naming.GerPatternType)get_store().add_element_user(PATTERN$0);
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
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerPatternType)get_store().add_element_user(PATTERN$0);
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
            get_store().remove_element(PATTERN$0, 0);
        }
    }
    
    /**
     * Gets the "gbean-link" element
     */
    public java.lang.String getGbeanLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GBEANLINK$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "gbean-link" element
     */
    public org.apache.xmlbeans.XmlString xgetGbeanLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GBEANLINK$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "gbean-link" element
     */
    public boolean isSetGbeanLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GBEANLINK$2) != 0;
        }
    }
    
    /**
     * Sets the "gbean-link" element
     */
    public void setGbeanLink(java.lang.String gbeanLink)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GBEANLINK$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GBEANLINK$2);
            }
            target.setStringValue(gbeanLink);
        }
    }
    
    /**
     * Sets (as xml) the "gbean-link" element
     */
    public void xsetGbeanLink(org.apache.xmlbeans.XmlString gbeanLink)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GBEANLINK$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(GBEANLINK$2);
            }
            target.set(gbeanLink);
        }
    }
    
    /**
     * Unsets the "gbean-link" element
     */
    public void unsetGbeanLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GBEANLINK$2, 0);
        }
    }
}
