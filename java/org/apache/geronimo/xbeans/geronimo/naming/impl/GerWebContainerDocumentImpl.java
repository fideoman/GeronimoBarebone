/*
 * An XML document type.
 * Localname: web-container
 * Namespace: http://geronimo.apache.org/xml/ns/naming-1.2
 * Java type: org.apache.geronimo.xbeans.geronimo.naming.GerWebContainerDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.geronimo.naming.impl;
/**
 * A document containing one web-container(@http://geronimo.apache.org/xml/ns/naming-1.2) element.
 *
 * This is a complex type.
 */
public class GerWebContainerDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.xbeans.geronimo.naming.GerWebContainerDocument
{
    private static final long serialVersionUID = 1L;
    
    public GerWebContainerDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName WEBCONTAINER$0 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "web-container");
    
    
    /**
     * Gets the "web-container" element
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerGbeanLocatorType getWebContainer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerGbeanLocatorType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerGbeanLocatorType)get_store().find_element_user(WEBCONTAINER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "web-container" element
     */
    public void setWebContainer(org.apache.geronimo.xbeans.geronimo.naming.GerGbeanLocatorType webContainer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerGbeanLocatorType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerGbeanLocatorType)get_store().find_element_user(WEBCONTAINER$0, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.xbeans.geronimo.naming.GerGbeanLocatorType)get_store().add_element_user(WEBCONTAINER$0);
            }
            target.set(webContainer);
        }
    }
    
    /**
     * Appends and returns a new empty "web-container" element
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerGbeanLocatorType addNewWebContainer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerGbeanLocatorType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerGbeanLocatorType)get_store().add_element_user(WEBCONTAINER$0);
            return target;
        }
    }
}
