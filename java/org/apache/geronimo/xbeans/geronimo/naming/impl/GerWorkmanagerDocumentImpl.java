/*
 * An XML document type.
 * Localname: workmanager
 * Namespace: http://geronimo.apache.org/xml/ns/naming-1.2
 * Java type: org.apache.geronimo.xbeans.geronimo.naming.GerWorkmanagerDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.geronimo.naming.impl;
/**
 * A document containing one workmanager(@http://geronimo.apache.org/xml/ns/naming-1.2) element.
 *
 * This is a complex type.
 */
public class GerWorkmanagerDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.xbeans.geronimo.naming.GerWorkmanagerDocument
{
    private static final long serialVersionUID = 1L;
    
    public GerWorkmanagerDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName WORKMANAGER$0 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "workmanager");
    
    
    /**
     * Gets the "workmanager" element
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerGbeanLocatorType getWorkmanager()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerGbeanLocatorType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerGbeanLocatorType)get_store().find_element_user(WORKMANAGER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "workmanager" element
     */
    public void setWorkmanager(org.apache.geronimo.xbeans.geronimo.naming.GerGbeanLocatorType workmanager)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerGbeanLocatorType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerGbeanLocatorType)get_store().find_element_user(WORKMANAGER$0, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.xbeans.geronimo.naming.GerGbeanLocatorType)get_store().add_element_user(WORKMANAGER$0);
            }
            target.set(workmanager);
        }
    }
    
    /**
     * Appends and returns a new empty "workmanager" element
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerGbeanLocatorType addNewWorkmanager()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerGbeanLocatorType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerGbeanLocatorType)get_store().add_element_user(WORKMANAGER$0);
            return target;
        }
    }
}
