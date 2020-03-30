/*
 * An XML document type.
 * Localname: persistence-context-ref
 * Namespace: http://geronimo.apache.org/xml/ns/naming-1.2
 * Java type: org.apache.geronimo.xbeans.geronimo.naming.GerPersistenceContextRefDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.geronimo.naming.impl;
/**
 * A document containing one persistence-context-ref(@http://geronimo.apache.org/xml/ns/naming-1.2) element.
 *
 * This is a complex type.
 */
public class GerPersistenceContextRefDocumentImpl extends org.apache.geronimo.xbeans.geronimo.naming.impl.GerAbstractNamingEntryDocumentImpl implements org.apache.geronimo.xbeans.geronimo.naming.GerPersistenceContextRefDocument
{
    private static final long serialVersionUID = 1L;
    
    public GerPersistenceContextRefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PERSISTENCECONTEXTREF$0 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "persistence-context-ref");
    
    
    /**
     * Gets the "persistence-context-ref" element
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerPersistenceContextRefType getPersistenceContextRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerPersistenceContextRefType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerPersistenceContextRefType)get_store().find_element_user(PERSISTENCECONTEXTREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "persistence-context-ref" element
     */
    public void setPersistenceContextRef(org.apache.geronimo.xbeans.geronimo.naming.GerPersistenceContextRefType persistenceContextRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerPersistenceContextRefType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerPersistenceContextRefType)get_store().find_element_user(PERSISTENCECONTEXTREF$0, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.xbeans.geronimo.naming.GerPersistenceContextRefType)get_store().add_element_user(PERSISTENCECONTEXTREF$0);
            }
            target.set(persistenceContextRef);
        }
    }
    
    /**
     * Appends and returns a new empty "persistence-context-ref" element
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerPersistenceContextRefType addNewPersistenceContextRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerPersistenceContextRefType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerPersistenceContextRefType)get_store().add_element_user(PERSISTENCECONTEXTREF$0);
            return target;
        }
    }
}
