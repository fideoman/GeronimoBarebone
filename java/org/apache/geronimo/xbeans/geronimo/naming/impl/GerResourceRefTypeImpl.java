/*
 * XML Type:  resource-refType
 * Namespace: http://geronimo.apache.org/xml/ns/naming-1.2
 * Java type: org.apache.geronimo.xbeans.geronimo.naming.GerResourceRefType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.geronimo.naming.impl;
/**
 * An XML resource-refType(@http://geronimo.apache.org/xml/ns/naming-1.2).
 *
 * This is a complex type.
 */
public class GerResourceRefTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.xbeans.geronimo.naming.GerResourceRefType
{
    private static final long serialVersionUID = 1L;
    
    public GerResourceRefTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REFNAME$0 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "ref-name");
    private static final javax.xml.namespace.QName PATTERN$2 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "pattern");
    private static final javax.xml.namespace.QName RESOURCELINK$4 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "resource-link");
    private static final javax.xml.namespace.QName URL$6 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "url");
    
    
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
     * Gets the "resource-link" element
     */
    public java.lang.String getResourceLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESOURCELINK$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "resource-link" element
     */
    public org.apache.xmlbeans.XmlString xgetResourceLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RESOURCELINK$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "resource-link" element
     */
    public boolean isSetResourceLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESOURCELINK$4) != 0;
        }
    }
    
    /**
     * Sets the "resource-link" element
     */
    public void setResourceLink(java.lang.String resourceLink)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESOURCELINK$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RESOURCELINK$4);
            }
            target.setStringValue(resourceLink);
        }
    }
    
    /**
     * Sets (as xml) the "resource-link" element
     */
    public void xsetResourceLink(org.apache.xmlbeans.XmlString resourceLink)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RESOURCELINK$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RESOURCELINK$4);
            }
            target.set(resourceLink);
        }
    }
    
    /**
     * Unsets the "resource-link" element
     */
    public void unsetResourceLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESOURCELINK$4, 0);
        }
    }
    
    /**
     * Gets the "url" element
     */
    public java.lang.String getUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(URL$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "url" element
     */
    public org.apache.xmlbeans.XmlString xgetUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(URL$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "url" element
     */
    public boolean isSetUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(URL$6) != 0;
        }
    }
    
    /**
     * Sets the "url" element
     */
    public void setUrl(java.lang.String url)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(URL$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(URL$6);
            }
            target.setStringValue(url);
        }
    }
    
    /**
     * Sets (as xml) the "url" element
     */
    public void xsetUrl(org.apache.xmlbeans.XmlString url)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(URL$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(URL$6);
            }
            target.set(url);
        }
    }
    
    /**
     * Unsets the "url" element
     */
    public void unsetUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(URL$6, 0);
        }
    }
}
