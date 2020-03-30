/*
 * An XML document type.
 * Localname: default-subject
 * Namespace: http://geronimo.apache.org/xml/ns/subject-info-1.0
 * Java type: org.apache.geronimo.xbeans.geronimo.security.subjectinfo.GerDefaultSubjectDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.geronimo.security.subjectinfo.impl;
/**
 * A document containing one default-subject(@http://geronimo.apache.org/xml/ns/subject-info-1.0) element.
 *
 * This is a complex type.
 */
public class GerDefaultSubjectDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.xbeans.geronimo.security.subjectinfo.GerDefaultSubjectDocument
{
    private static final long serialVersionUID = 1L;
    
    public GerDefaultSubjectDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DEFAULTSUBJECT$0 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/subject-info-1.0", "default-subject");
    
    
    /**
     * Gets the "default-subject" element
     */
    public org.apache.geronimo.xbeans.geronimo.security.subjectinfo.GerDefaultSubjectType getDefaultSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.security.subjectinfo.GerDefaultSubjectType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.security.subjectinfo.GerDefaultSubjectType)get_store().find_element_user(DEFAULTSUBJECT$0, 0);
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
    public void setDefaultSubject(org.apache.geronimo.xbeans.geronimo.security.subjectinfo.GerDefaultSubjectType defaultSubject)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.security.subjectinfo.GerDefaultSubjectType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.security.subjectinfo.GerDefaultSubjectType)get_store().find_element_user(DEFAULTSUBJECT$0, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.xbeans.geronimo.security.subjectinfo.GerDefaultSubjectType)get_store().add_element_user(DEFAULTSUBJECT$0);
            }
            target.set(defaultSubject);
        }
    }
    
    /**
     * Appends and returns a new empty "default-subject" element
     */
    public org.apache.geronimo.xbeans.geronimo.security.subjectinfo.GerDefaultSubjectType addNewDefaultSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.security.subjectinfo.GerDefaultSubjectType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.security.subjectinfo.GerDefaultSubjectType)get_store().add_element_user(DEFAULTSUBJECT$0);
            return target;
        }
    }
}
