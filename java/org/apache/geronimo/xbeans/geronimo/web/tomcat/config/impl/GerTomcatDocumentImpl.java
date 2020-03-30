/*
 * An XML document type.
 * Localname: tomcat
 * Namespace: http://geronimo.apache.org/xml/ns/web/tomcat/config-1.0
 * Java type: org.apache.geronimo.xbeans.geronimo.web.tomcat.config.GerTomcatDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.geronimo.web.tomcat.config.impl;
/**
 * A document containing one tomcat(@http://geronimo.apache.org/xml/ns/web/tomcat/config-1.0) element.
 *
 * This is a complex type.
 */
public class GerTomcatDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.xbeans.geronimo.web.tomcat.config.GerTomcatDocument
{
    private static final long serialVersionUID = 1L;
    
    public GerTomcatDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TOMCAT$0 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/web/tomcat/config-1.0", "tomcat");
    
    
    /**
     * Gets the "tomcat" element
     */
    public org.apache.geronimo.xbeans.geronimo.web.tomcat.config.GerTomcatConfigType getTomcat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.web.tomcat.config.GerTomcatConfigType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.web.tomcat.config.GerTomcatConfigType)get_store().find_element_user(TOMCAT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "tomcat" element
     */
    public void setTomcat(org.apache.geronimo.xbeans.geronimo.web.tomcat.config.GerTomcatConfigType tomcat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.web.tomcat.config.GerTomcatConfigType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.web.tomcat.config.GerTomcatConfigType)get_store().find_element_user(TOMCAT$0, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.xbeans.geronimo.web.tomcat.config.GerTomcatConfigType)get_store().add_element_user(TOMCAT$0);
            }
            target.set(tomcat);
        }
    }
    
    /**
     * Appends and returns a new empty "tomcat" element
     */
    public org.apache.geronimo.xbeans.geronimo.web.tomcat.config.GerTomcatConfigType addNewTomcat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.web.tomcat.config.GerTomcatConfigType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.web.tomcat.config.GerTomcatConfigType)get_store().add_element_user(TOMCAT$0);
            return target;
        }
    }
}
