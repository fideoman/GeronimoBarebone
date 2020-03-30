/*
 * An XML document type.
 * Localname: persistence-unit-ref
 * Namespace: http://geronimo.apache.org/xml/ns/naming-1.2
 * Java type: org.apache.geronimo.xbeans.geronimo.naming.GerPersistenceUnitRefDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.geronimo.naming.impl;
/**
 * A document containing one persistence-unit-ref(@http://geronimo.apache.org/xml/ns/naming-1.2) element.
 *
 * This is a complex type.
 */
public class GerPersistenceUnitRefDocumentImpl extends org.apache.geronimo.xbeans.geronimo.naming.impl.GerAbstractNamingEntryDocumentImpl implements org.apache.geronimo.xbeans.geronimo.naming.GerPersistenceUnitRefDocument
{
    private static final long serialVersionUID = 1L;
    
    public GerPersistenceUnitRefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PERSISTENCEUNITREF$0 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "persistence-unit-ref");
    
    
    /**
     * Gets the "persistence-unit-ref" element
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerPersistenceUnitRefType getPersistenceUnitRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerPersistenceUnitRefType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerPersistenceUnitRefType)get_store().find_element_user(PERSISTENCEUNITREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "persistence-unit-ref" element
     */
    public void setPersistenceUnitRef(org.apache.geronimo.xbeans.geronimo.naming.GerPersistenceUnitRefType persistenceUnitRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerPersistenceUnitRefType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerPersistenceUnitRefType)get_store().find_element_user(PERSISTENCEUNITREF$0, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.xbeans.geronimo.naming.GerPersistenceUnitRefType)get_store().add_element_user(PERSISTENCEUNITREF$0);
            }
            target.set(persistenceUnitRef);
        }
    }
    
    /**
     * Appends and returns a new empty "persistence-unit-ref" element
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerPersistenceUnitRefType addNewPersistenceUnitRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerPersistenceUnitRefType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerPersistenceUnitRefType)get_store().add_element_user(PERSISTENCEUNITREF$0);
            return target;
        }
    }
}
