/*
 * An XML document type.
 * Localname: javabean
 * Namespace: http://geronimo.apache.org/xml/ns/deployment/javabean-1.0
 * Java type: org.apache.geronimo.deployment.javabean.xbeans.JavabeanDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.deployment.javabean.xbeans.impl;
/**
 * A document containing one javabean(@http://geronimo.apache.org/xml/ns/deployment/javabean-1.0) element.
 *
 * This is a complex type.
 */
public class JavabeanDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.deployment.javabean.xbeans.JavabeanDocument
{
    private static final long serialVersionUID = 1L;
    
    public JavabeanDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName JAVABEAN$0 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/deployment/javabean-1.0", "javabean");
    
    
    /**
     * Gets the "javabean" element
     */
    public org.apache.geronimo.deployment.javabean.xbeans.JavabeanType getJavabean()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.javabean.xbeans.JavabeanType target = null;
            target = (org.apache.geronimo.deployment.javabean.xbeans.JavabeanType)get_store().find_element_user(JAVABEAN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "javabean" element
     */
    public void setJavabean(org.apache.geronimo.deployment.javabean.xbeans.JavabeanType javabean)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.javabean.xbeans.JavabeanType target = null;
            target = (org.apache.geronimo.deployment.javabean.xbeans.JavabeanType)get_store().find_element_user(JAVABEAN$0, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.deployment.javabean.xbeans.JavabeanType)get_store().add_element_user(JAVABEAN$0);
            }
            target.set(javabean);
        }
    }
    
    /**
     * Appends and returns a new empty "javabean" element
     */
    public org.apache.geronimo.deployment.javabean.xbeans.JavabeanType addNewJavabean()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.javabean.xbeans.JavabeanType target = null;
            target = (org.apache.geronimo.deployment.javabean.xbeans.JavabeanType)get_store().add_element_user(JAVABEAN$0);
            return target;
        }
    }
}
