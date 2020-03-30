/*
 * An XML document type.
 * Localname: web-app
 * Namespace: http://geronimo.apache.org/xml/ns/j2ee/web/jetty-2.0.2
 * Java type: org.apache.geronimo.xbeans.geronimo.web.jetty.JettyWebAppDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.geronimo.web.jetty.impl;
/**
 * A document containing one web-app(@http://geronimo.apache.org/xml/ns/j2ee/web/jetty-2.0.2) element.
 *
 * This is a complex type.
 */
public class JettyWebAppDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.xbeans.geronimo.web.jetty.JettyWebAppDocument
{
    private static final long serialVersionUID = 1L;
    
    public JettyWebAppDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName WEBAPP$0 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/j2ee/web/jetty-2.0.2", "web-app");
    
    
    /**
     * Gets the "web-app" element
     */
    public org.apache.geronimo.xbeans.geronimo.web.jetty.JettyWebAppType getWebApp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.web.jetty.JettyWebAppType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.web.jetty.JettyWebAppType)get_store().find_element_user(WEBAPP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "web-app" element
     */
    public void setWebApp(org.apache.geronimo.xbeans.geronimo.web.jetty.JettyWebAppType webApp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.web.jetty.JettyWebAppType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.web.jetty.JettyWebAppType)get_store().find_element_user(WEBAPP$0, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.xbeans.geronimo.web.jetty.JettyWebAppType)get_store().add_element_user(WEBAPP$0);
            }
            target.set(webApp);
        }
    }
    
    /**
     * Appends and returns a new empty "web-app" element
     */
    public org.apache.geronimo.xbeans.geronimo.web.jetty.JettyWebAppType addNewWebApp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.web.jetty.JettyWebAppType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.web.jetty.JettyWebAppType)get_store().add_element_user(WEBAPP$0);
            return target;
        }
    }
}
