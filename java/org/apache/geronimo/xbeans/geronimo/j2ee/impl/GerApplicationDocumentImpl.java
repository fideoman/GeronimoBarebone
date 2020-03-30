/*
 * An XML document type.
 * Localname: application
 * Namespace: http://geronimo.apache.org/xml/ns/j2ee/application-2.0
 * Java type: org.apache.geronimo.xbeans.geronimo.j2ee.GerApplicationDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.geronimo.j2ee.impl;
/**
 * A document containing one application(@http://geronimo.apache.org/xml/ns/j2ee/application-2.0) element.
 *
 * This is a complex type.
 */
public class GerApplicationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.xbeans.geronimo.j2ee.GerApplicationDocument
{
    private static final long serialVersionUID = 1L;
    
    public GerApplicationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName APPLICATION$0 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/j2ee/application-2.0", "application");
    
    
    /**
     * Gets the "application" element
     */
    public org.apache.geronimo.xbeans.geronimo.j2ee.GerApplicationType getApplication()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.j2ee.GerApplicationType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.j2ee.GerApplicationType)get_store().find_element_user(APPLICATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "application" element
     */
    public void setApplication(org.apache.geronimo.xbeans.geronimo.j2ee.GerApplicationType application)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.j2ee.GerApplicationType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.j2ee.GerApplicationType)get_store().find_element_user(APPLICATION$0, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.xbeans.geronimo.j2ee.GerApplicationType)get_store().add_element_user(APPLICATION$0);
            }
            target.set(application);
        }
    }
    
    /**
     * Appends and returns a new empty "application" element
     */
    public org.apache.geronimo.xbeans.geronimo.j2ee.GerApplicationType addNewApplication()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.j2ee.GerApplicationType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.j2ee.GerApplicationType)get_store().add_element_user(APPLICATION$0);
            return target;
        }
    }
}
