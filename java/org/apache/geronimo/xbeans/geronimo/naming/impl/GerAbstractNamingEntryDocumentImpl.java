/*
 * An XML document type.
 * Localname: abstract-naming-entry
 * Namespace: http://geronimo.apache.org/xml/ns/naming-1.2
 * Java type: org.apache.geronimo.xbeans.geronimo.naming.GerAbstractNamingEntryDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.geronimo.naming.impl;
/**
 * A document containing one abstract-naming-entry(@http://geronimo.apache.org/xml/ns/naming-1.2) element.
 *
 * This is a complex type.
 */
public class GerAbstractNamingEntryDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.xbeans.geronimo.naming.GerAbstractNamingEntryDocument
{
    private static final long serialVersionUID = 1L;
    
    public GerAbstractNamingEntryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ABSTRACTNAMINGENTRY$0 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "abstract-naming-entry");
    private static final org.apache.xmlbeans.QNameSet ABSTRACTNAMINGENTRY$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "persistence-unit-ref"),
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "gbean-ref"),
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "persistence-context-ref"),
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "abstract-naming-entry"),
    });
    
    
    /**
     * Gets the "abstract-naming-entry" element
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerAbstractNamingEntryType getAbstractNamingEntry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerAbstractNamingEntryType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerAbstractNamingEntryType)get_store().find_element_user(ABSTRACTNAMINGENTRY$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "abstract-naming-entry" element
     */
    public void setAbstractNamingEntry(org.apache.geronimo.xbeans.geronimo.naming.GerAbstractNamingEntryType abstractNamingEntry)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerAbstractNamingEntryType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerAbstractNamingEntryType)get_store().find_element_user(ABSTRACTNAMINGENTRY$1, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.xbeans.geronimo.naming.GerAbstractNamingEntryType)get_store().add_element_user(ABSTRACTNAMINGENTRY$0);
            }
            target.set(abstractNamingEntry);
        }
    }
    
    /**
     * Appends and returns a new empty "abstract-naming-entry" element
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerAbstractNamingEntryType addNewAbstractNamingEntry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerAbstractNamingEntryType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerAbstractNamingEntryType)get_store().add_element_user(ABSTRACTNAMINGENTRY$0);
            return target;
        }
    }
}
