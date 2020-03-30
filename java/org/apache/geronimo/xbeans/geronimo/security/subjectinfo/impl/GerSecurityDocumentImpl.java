/*
 * An XML document type.
 * Localname: security
 * Namespace: http://geronimo.apache.org/xml/ns/subject-info-1.0
 * Java type: org.apache.geronimo.xbeans.geronimo.security.subjectinfo.GerSecurityDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.geronimo.security.subjectinfo.impl;
/**
 * A document containing one security(@http://geronimo.apache.org/xml/ns/subject-info-1.0) element.
 *
 * This is a complex type.
 */
public class GerSecurityDocumentImpl extends org.apache.geronimo.xbeans.geronimo.j2ee.impl.GerSecurityDocumentImpl implements org.apache.geronimo.xbeans.geronimo.security.subjectinfo.GerSecurityDocument
{
    private static final long serialVersionUID = 1L;
    
    public GerSecurityDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SECURITY2$0 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/subject-info-1.0", "security");
    
    
    /**
     * Gets the "security" element
     */
    public org.apache.geronimo.xbeans.geronimo.security.subjectinfo.GerSecurityType getSecurity2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.security.subjectinfo.GerSecurityType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.security.subjectinfo.GerSecurityType)get_store().find_element_user(SECURITY2$0, 0);
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
    public void setSecurity2(org.apache.geronimo.xbeans.geronimo.security.subjectinfo.GerSecurityType security2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.security.subjectinfo.GerSecurityType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.security.subjectinfo.GerSecurityType)get_store().find_element_user(SECURITY2$0, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.xbeans.geronimo.security.subjectinfo.GerSecurityType)get_store().add_element_user(SECURITY2$0);
            }
            target.set(security2);
        }
    }
    
    /**
     * Appends and returns a new empty "security" element
     */
    public org.apache.geronimo.xbeans.geronimo.security.subjectinfo.GerSecurityType addNewSecurity2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.security.subjectinfo.GerSecurityType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.security.subjectinfo.GerSecurityType)get_store().add_element_user(SECURITY2$0);
            return target;
        }
    }
}
