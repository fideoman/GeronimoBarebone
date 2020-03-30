/*
 * An XML document type.
 * Localname: security
 * Namespace: http://geronimo.apache.org/xml/ns/j2ee/application-2.0
 * Java type: org.apache.geronimo.xbeans.geronimo.j2ee.GerSecurityDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.geronimo.j2ee.impl;
/**
 * A document containing one security(@http://geronimo.apache.org/xml/ns/j2ee/application-2.0) element.
 *
 * This is a complex type.
 */
public class GerSecurityDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.xbeans.geronimo.j2ee.GerSecurityDocument
{
    private static final long serialVersionUID = 1L;
    
    public GerSecurityDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SECURITY$0 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/j2ee/application-2.0", "security");
    
    
    /**
     * Gets the "security" element
     */
    public org.apache.geronimo.xbeans.geronimo.j2ee.GerAbstractSecurityType getSecurity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.j2ee.GerAbstractSecurityType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.j2ee.GerAbstractSecurityType)get_store().find_element_user(SECURITY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "security" element
     */
    public void setSecurity(org.apache.geronimo.xbeans.geronimo.j2ee.GerAbstractSecurityType security)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.j2ee.GerAbstractSecurityType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.j2ee.GerAbstractSecurityType)get_store().find_element_user(SECURITY$0, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.xbeans.geronimo.j2ee.GerAbstractSecurityType)get_store().add_element_user(SECURITY$0);
            }
            target.set(security);
        }
    }
    
    /**
     * Appends and returns a new empty "security" element
     */
    public org.apache.geronimo.xbeans.geronimo.j2ee.GerAbstractSecurityType addNewSecurity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.j2ee.GerAbstractSecurityType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.j2ee.GerAbstractSecurityType)get_store().add_element_user(SECURITY$0);
            return target;
        }
    }
}
