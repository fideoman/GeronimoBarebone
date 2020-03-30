/*
 * XML Type:  env-entryType
 * Namespace: http://geronimo.apache.org/xml/ns/naming-1.2
 * Java type: org.apache.geronimo.xbeans.geronimo.naming.GerEnvEntryType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.geronimo.naming.impl;
/**
 * An XML env-entryType(@http://geronimo.apache.org/xml/ns/naming-1.2).
 *
 * This is a complex type.
 */
public class GerEnvEntryTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.xbeans.geronimo.naming.GerEnvEntryType
{
    private static final long serialVersionUID = 1L;
    
    public GerEnvEntryTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENVENTRYNAME$0 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "env-entry-name");
    private static final javax.xml.namespace.QName ENVENTRYVALUE$2 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "env-entry-value");
    
    
    /**
     * Gets the "env-entry-name" element
     */
    public java.lang.String getEnvEntryName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENVENTRYNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "env-entry-name" element
     */
    public org.apache.xmlbeans.XmlString xgetEnvEntryName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENVENTRYNAME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "env-entry-name" element
     */
    public void setEnvEntryName(java.lang.String envEntryName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENVENTRYNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENVENTRYNAME$0);
            }
            target.setStringValue(envEntryName);
        }
    }
    
    /**
     * Sets (as xml) the "env-entry-name" element
     */
    public void xsetEnvEntryName(org.apache.xmlbeans.XmlString envEntryName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENVENTRYNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ENVENTRYNAME$0);
            }
            target.set(envEntryName);
        }
    }
    
    /**
     * Gets the "env-entry-value" element
     */
    public java.lang.String getEnvEntryValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENVENTRYVALUE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "env-entry-value" element
     */
    public org.apache.xmlbeans.XmlString xgetEnvEntryValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENVENTRYVALUE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "env-entry-value" element
     */
    public void setEnvEntryValue(java.lang.String envEntryValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENVENTRYVALUE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENVENTRYVALUE$2);
            }
            target.setStringValue(envEntryValue);
        }
    }
    
    /**
     * Sets (as xml) the "env-entry-value" element
     */
    public void xsetEnvEntryValue(org.apache.xmlbeans.XmlString envEntryValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENVENTRYVALUE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ENVENTRYVALUE$2);
            }
            target.set(envEntryValue);
        }
    }
}
