/*
 * An XML document type.
 * Localname: gbean-ref
 * Namespace: http://geronimo.apache.org/xml/ns/naming-1.2
 * Java type: org.apache.geronimo.xbeans.geronimo.naming.GerGbeanRefDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.geronimo.naming.impl;
/**
 * A document containing one gbean-ref(@http://geronimo.apache.org/xml/ns/naming-1.2) element.
 *
 * This is a complex type.
 */
public class GerGbeanRefDocumentImpl extends org.apache.geronimo.xbeans.geronimo.naming.impl.GerAbstractNamingEntryDocumentImpl implements org.apache.geronimo.xbeans.geronimo.naming.GerGbeanRefDocument
{
    private static final long serialVersionUID = 1L;
    
    public GerGbeanRefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GBEANREF$0 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "gbean-ref");
    
    
    /**
     * Gets the "gbean-ref" element
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerGbeanRefType getGbeanRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerGbeanRefType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerGbeanRefType)get_store().find_element_user(GBEANREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "gbean-ref" element
     */
    public void setGbeanRef(org.apache.geronimo.xbeans.geronimo.naming.GerGbeanRefType gbeanRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerGbeanRefType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerGbeanRefType)get_store().find_element_user(GBEANREF$0, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.xbeans.geronimo.naming.GerGbeanRefType)get_store().add_element_user(GBEANREF$0);
            }
            target.set(gbeanRef);
        }
    }
    
    /**
     * Appends and returns a new empty "gbean-ref" element
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerGbeanRefType addNewGbeanRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerGbeanRefType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerGbeanRefType)get_store().add_element_user(GBEANREF$0);
            return target;
        }
    }
}
