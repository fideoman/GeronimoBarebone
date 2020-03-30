/*
 * XML Type:  referenceType
 * Namespace: http://geronimo.apache.org/xml/ns/deployment-1.2
 * Java type: org.apache.geronimo.deployment.xbeans.ReferenceType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.deployment.xbeans.impl;
/**
 * An XML referenceType(@http://geronimo.apache.org/xml/ns/deployment-1.2).
 *
 * This is a complex type.
 */
public class ReferenceTypeImpl extends org.apache.geronimo.deployment.xbeans.impl.PatternTypeImpl implements org.apache.geronimo.deployment.xbeans.ReferenceType
{
    private static final long serialVersionUID = 1L;
    
    public ReferenceTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME2$0 = 
        new javax.xml.namespace.QName("", "name");
    
    
    /**
     * Gets the "name" attribute
     */
    public java.lang.String getName2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME2$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "name" attribute
     */
    public org.apache.xmlbeans.XmlString xgetName2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME2$0);
            return target;
        }
    }
    
    /**
     * True if has "name" attribute
     */
    public boolean isSetName2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(NAME2$0) != null;
        }
    }
    
    /**
     * Sets the "name" attribute
     */
    public void setName2(java.lang.String name2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME2$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME2$0);
            }
            target.setStringValue(name2);
        }
    }
    
    /**
     * Sets (as xml) the "name" attribute
     */
    public void xsetName2(org.apache.xmlbeans.XmlString name2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME2$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME2$0);
            }
            target.set(name2);
        }
    }
    
    /**
     * Unsets the "name" attribute
     */
    public void unsetName2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(NAME2$0);
        }
    }
}
