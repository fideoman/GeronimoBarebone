/*
 * An XML document type.
 * Localname: ejb-local-ref
 * Namespace: http://geronimo.apache.org/xml/ns/naming-1.2
 * Java type: org.apache.geronimo.xbeans.geronimo.naming.GerEjbLocalRefDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.geronimo.naming.impl;
/**
 * A document containing one ejb-local-ref(@http://geronimo.apache.org/xml/ns/naming-1.2) element.
 *
 * This is a complex type.
 */
public class GerEjbLocalRefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.xbeans.geronimo.naming.GerEjbLocalRefDocument
{
    private static final long serialVersionUID = 1L;
    
    public GerEjbLocalRefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EJBLOCALREF$0 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "ejb-local-ref");
    
    
    /**
     * Gets the "ejb-local-ref" element
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerEjbLocalRefType getEjbLocalRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerEjbLocalRefType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerEjbLocalRefType)get_store().find_element_user(EJBLOCALREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ejb-local-ref" element
     */
    public void setEjbLocalRef(org.apache.geronimo.xbeans.geronimo.naming.GerEjbLocalRefType ejbLocalRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerEjbLocalRefType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerEjbLocalRefType)get_store().find_element_user(EJBLOCALREF$0, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.xbeans.geronimo.naming.GerEjbLocalRefType)get_store().add_element_user(EJBLOCALREF$0);
            }
            target.set(ejbLocalRef);
        }
    }
    
    /**
     * Appends and returns a new empty "ejb-local-ref" element
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerEjbLocalRefType addNewEjbLocalRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerEjbLocalRefType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerEjbLocalRefType)get_store().add_element_user(EJBLOCALREF$0);
            return target;
        }
    }
}
