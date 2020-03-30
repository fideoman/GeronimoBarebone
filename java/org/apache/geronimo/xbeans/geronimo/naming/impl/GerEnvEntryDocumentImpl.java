/*
 * An XML document type.
 * Localname: env-entry
 * Namespace: http://geronimo.apache.org/xml/ns/naming-1.2
 * Java type: org.apache.geronimo.xbeans.geronimo.naming.GerEnvEntryDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.geronimo.naming.impl;
/**
 * A document containing one env-entry(@http://geronimo.apache.org/xml/ns/naming-1.2) element.
 *
 * This is a complex type.
 */
public class GerEnvEntryDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.xbeans.geronimo.naming.GerEnvEntryDocument
{
    private static final long serialVersionUID = 1L;
    
    public GerEnvEntryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENVENTRY$0 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "env-entry");
    
    
    /**
     * Gets the "env-entry" element
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerEnvEntryType getEnvEntry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerEnvEntryType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerEnvEntryType)get_store().find_element_user(ENVENTRY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "env-entry" element
     */
    public void setEnvEntry(org.apache.geronimo.xbeans.geronimo.naming.GerEnvEntryType envEntry)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerEnvEntryType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerEnvEntryType)get_store().find_element_user(ENVENTRY$0, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.xbeans.geronimo.naming.GerEnvEntryType)get_store().add_element_user(ENVENTRY$0);
            }
            target.set(envEntry);
        }
    }
    
    /**
     * Appends and returns a new empty "env-entry" element
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerEnvEntryType addNewEnvEntry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerEnvEntryType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerEnvEntryType)get_store().add_element_user(ENVENTRY$0);
            return target;
        }
    }
}
