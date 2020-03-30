/*
 * XML Type:  security-refType
 * Namespace: http://geronimo.apache.org/xml/ns/security-2.0
 * Java type: org.apache.geronimo.xbeans.geronimo.security.GerSecurityRefType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.geronimo.security.impl;
/**
 * An XML security-refType(@http://geronimo.apache.org/xml/ns/security-2.0).
 *
 * This is a complex type.
 */
public class GerSecurityRefTypeImpl extends org.apache.geronimo.xbeans.geronimo.j2ee.impl.GerAbstractSecurityTypeImpl implements org.apache.geronimo.xbeans.geronimo.security.GerSecurityRefType
{
    private static final long serialVersionUID = 1L;
    
    public GerSecurityRefTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/security-2.0", "name");
    private static final javax.xml.namespace.QName REF$2 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/security-2.0", "ref");
    
    
    /**
     * Gets the "name" element
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
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
            return get_store().count_elements(NAME$0) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$0);
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
            get_store().remove_element(NAME$0, 0);
        }
    }
    
    /**
     * Gets the "ref" element
     */
    public org.apache.geronimo.deployment.xbeans.PatternType getRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.xbeans.PatternType target = null;
            target = (org.apache.geronimo.deployment.xbeans.PatternType)get_store().find_element_user(REF$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ref" element
     */
    public boolean isSetRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REF$2) != 0;
        }
    }
    
    /**
     * Sets the "ref" element
     */
    public void setRef(org.apache.geronimo.deployment.xbeans.PatternType ref)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.xbeans.PatternType target = null;
            target = (org.apache.geronimo.deployment.xbeans.PatternType)get_store().find_element_user(REF$2, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.deployment.xbeans.PatternType)get_store().add_element_user(REF$2);
            }
            target.set(ref);
        }
    }
    
    /**
     * Appends and returns a new empty "ref" element
     */
    public org.apache.geronimo.deployment.xbeans.PatternType addNewRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.xbeans.PatternType target = null;
            target = (org.apache.geronimo.deployment.xbeans.PatternType)get_store().add_element_user(REF$2);
            return target;
        }
    }
    
    /**
     * Unsets the "ref" element
     */
    public void unsetRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REF$2, 0);
        }
    }
}
