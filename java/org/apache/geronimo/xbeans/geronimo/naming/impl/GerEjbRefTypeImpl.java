/*
 * XML Type:  ejb-refType
 * Namespace: http://geronimo.apache.org/xml/ns/naming-1.2
 * Java type: org.apache.geronimo.xbeans.geronimo.naming.GerEjbRefType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.geronimo.naming.impl;
/**
 * An XML ejb-refType(@http://geronimo.apache.org/xml/ns/naming-1.2).
 *
 * This is a complex type.
 */
public class GerEjbRefTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.xbeans.geronimo.naming.GerEjbRefType
{
    private static final long serialVersionUID = 1L;
    
    public GerEjbRefTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REFNAME$0 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "ref-name");
    private static final javax.xml.namespace.QName PATTERN$2 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "pattern");
    private static final javax.xml.namespace.QName NSCORBALOC$4 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "ns-corbaloc");
    private static final javax.xml.namespace.QName NAME$6 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "name");
    private static final javax.xml.namespace.QName CSS$8 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "css");
    private static final javax.xml.namespace.QName CSSLINK$10 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "css-link");
    private static final javax.xml.namespace.QName EJBLINK$12 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "ejb-link");
    
    
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
     * Gets the "ns-corbaloc" element
     */
    public java.lang.String getNsCorbaloc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NSCORBALOC$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ns-corbaloc" element
     */
    public org.apache.xmlbeans.XmlAnyURI xgetNsCorbaloc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(NSCORBALOC$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "ns-corbaloc" element
     */
    public boolean isSetNsCorbaloc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NSCORBALOC$4) != 0;
        }
    }
    
    /**
     * Sets the "ns-corbaloc" element
     */
    public void setNsCorbaloc(java.lang.String nsCorbaloc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NSCORBALOC$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NSCORBALOC$4);
            }
            target.setStringValue(nsCorbaloc);
        }
    }
    
    /**
     * Sets (as xml) the "ns-corbaloc" element
     */
    public void xsetNsCorbaloc(org.apache.xmlbeans.XmlAnyURI nsCorbaloc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(NSCORBALOC$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(NSCORBALOC$4);
            }
            target.set(nsCorbaloc);
        }
    }
    
    /**
     * Unsets the "ns-corbaloc" element
     */
    public void unsetNsCorbaloc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NSCORBALOC$4, 0);
        }
    }
    
    /**
     * Gets the "name" element
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "name" element
     */
    public org.apache.xmlbeans.XmlString xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "name" element
     */
    public boolean isSetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NAME$6) != 0;
        }
    }
    
    /**
     * Sets the "name" element
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$6);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "name" element
     */
    public void xsetName(org.apache.xmlbeans.XmlString name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$6);
            }
            target.set(name);
        }
    }
    
    /**
     * Unsets the "name" element
     */
    public void unsetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NAME$6, 0);
        }
    }
    
    /**
     * Gets the "css" element
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerPatternType getCss()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerPatternType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerPatternType)get_store().find_element_user(CSS$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "css" element
     */
    public boolean isSetCss()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CSS$8) != 0;
        }
    }
    
    /**
     * Sets the "css" element
     */
    public void setCss(org.apache.geronimo.xbeans.geronimo.naming.GerPatternType css)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerPatternType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerPatternType)get_store().find_element_user(CSS$8, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.xbeans.geronimo.naming.GerPatternType)get_store().add_element_user(CSS$8);
            }
            target.set(css);
        }
    }
    
    /**
     * Appends and returns a new empty "css" element
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerPatternType addNewCss()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerPatternType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerPatternType)get_store().add_element_user(CSS$8);
            return target;
        }
    }
    
    /**
     * Unsets the "css" element
     */
    public void unsetCss()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CSS$8, 0);
        }
    }
    
    /**
     * Gets the "css-link" element
     */
    public java.lang.String getCssLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CSSLINK$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "css-link" element
     */
    public org.apache.xmlbeans.XmlString xgetCssLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CSSLINK$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "css-link" element
     */
    public boolean isSetCssLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CSSLINK$10) != 0;
        }
    }
    
    /**
     * Sets the "css-link" element
     */
    public void setCssLink(java.lang.String cssLink)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CSSLINK$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CSSLINK$10);
            }
            target.setStringValue(cssLink);
        }
    }
    
    /**
     * Sets (as xml) the "css-link" element
     */
    public void xsetCssLink(org.apache.xmlbeans.XmlString cssLink)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CSSLINK$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CSSLINK$10);
            }
            target.set(cssLink);
        }
    }
    
    /**
     * Unsets the "css-link" element
     */
    public void unsetCssLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CSSLINK$10, 0);
        }
    }
    
    /**
     * Gets the "ejb-link" element
     */
    public java.lang.String getEjbLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EJBLINK$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ejb-link" element
     */
    public org.apache.xmlbeans.XmlString xgetEjbLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EJBLINK$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "ejb-link" element
     */
    public boolean isSetEjbLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EJBLINK$12) != 0;
        }
    }
    
    /**
     * Sets the "ejb-link" element
     */
    public void setEjbLink(java.lang.String ejbLink)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EJBLINK$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EJBLINK$12);
            }
            target.setStringValue(ejbLink);
        }
    }
    
    /**
     * Sets (as xml) the "ejb-link" element
     */
    public void xsetEjbLink(org.apache.xmlbeans.XmlString ejbLink)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EJBLINK$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EJBLINK$12);
            }
            target.set(ejbLink);
        }
    }
    
    /**
     * Unsets the "ejb-link" element
     */
    public void unsetEjbLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EJBLINK$12, 0);
        }
    }
}
