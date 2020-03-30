/*
 * An XML document type.
 * Localname: default-subject
 * Namespace: http://geronimo.apache.org/xml/ns/security-2.0
 * Java type: org.apache.geronimo.xbeans.geronimo.security.GerDefaultSubjectDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.geronimo.security.impl;
/**
 * A document containing one default-subject(@http://geronimo.apache.org/xml/ns/security-2.0) element.
 *
 * This is a complex type.
 */
public class GerDefaultSubjectDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.xbeans.geronimo.security.GerDefaultSubjectDocument
{
    private static final long serialVersionUID = 1L;
    
    public GerDefaultSubjectDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DEFAULTSUBJECT$0 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/security-2.0", "default-subject");
    
    
    /**
     * Gets the "default-subject" element
     */
    public org.apache.geronimo.xbeans.geronimo.security.GerSubjectInfoType getDefaultSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.security.GerSubjectInfoType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.security.GerSubjectInfoType)get_store().find_element_user(DEFAULTSUBJECT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "default-subject" element
     */
    public void setDefaultSubject(org.apache.geronimo.xbeans.geronimo.security.GerSubjectInfoType defaultSubject)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.security.GerSubjectInfoType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.security.GerSubjectInfoType)get_store().find_element_user(DEFAULTSUBJECT$0, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.xbeans.geronimo.security.GerSubjectInfoType)get_store().add_element_user(DEFAULTSUBJECT$0);
            }
            target.set(defaultSubject);
        }
    }
    
    /**
     * Appends and returns a new empty "default-subject" element
     */
    public org.apache.geronimo.xbeans.geronimo.security.GerSubjectInfoType addNewDefaultSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.security.GerSubjectInfoType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.security.GerSubjectInfoType)get_store().add_element_user(DEFAULTSUBJECT$0);
            return target;
        }
    }
}
