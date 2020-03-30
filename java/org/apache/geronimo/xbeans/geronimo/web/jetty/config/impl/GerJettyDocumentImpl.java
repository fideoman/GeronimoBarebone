/*
 * An XML document type.
 * Localname: jetty
 * Namespace: http://geronimo.apache.org/xml/ns/web/jetty/config-1.0.1
 * Java type: org.apache.geronimo.xbeans.geronimo.web.jetty.config.GerJettyDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.geronimo.web.jetty.config.impl;
/**
 * A document containing one jetty(@http://geronimo.apache.org/xml/ns/web/jetty/config-1.0.1) element.
 *
 * This is a complex type.
 */
public class GerJettyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.xbeans.geronimo.web.jetty.config.GerJettyDocument
{
    private static final long serialVersionUID = 1L;
    
    public GerJettyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName JETTY$0 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/web/jetty/config-1.0.1", "jetty");
    
    
    /**
     * Gets the "jetty" element
     */
    public org.apache.geronimo.xbeans.geronimo.web.jetty.config.GerJettyConfigType getJetty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.web.jetty.config.GerJettyConfigType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.web.jetty.config.GerJettyConfigType)get_store().find_element_user(JETTY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "jetty" element
     */
    public void setJetty(org.apache.geronimo.xbeans.geronimo.web.jetty.config.GerJettyConfigType jetty)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.web.jetty.config.GerJettyConfigType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.web.jetty.config.GerJettyConfigType)get_store().find_element_user(JETTY$0, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.xbeans.geronimo.web.jetty.config.GerJettyConfigType)get_store().add_element_user(JETTY$0);
            }
            target.set(jetty);
        }
    }
    
    /**
     * Appends and returns a new empty "jetty" element
     */
    public org.apache.geronimo.xbeans.geronimo.web.jetty.config.GerJettyConfigType addNewJetty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.web.jetty.config.GerJettyConfigType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.web.jetty.config.GerJettyConfigType)get_store().add_element_user(JETTY$0);
            return target;
        }
    }
}
