/*
 * An XML document type.
 * Localname: clientAuthConfig
 * Namespace: http://geronimo.apache.org/xml/ns/geronimo-jaspi
 * Java type: org.apache.geronimo.xbeans.geronimo.jaspi.JaspiClientAuthConfigDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.geronimo.jaspi.impl;
/**
 * A document containing one clientAuthConfig(@http://geronimo.apache.org/xml/ns/geronimo-jaspi) element.
 *
 * This is a complex type.
 */
public class JaspiClientAuthConfigDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.xbeans.geronimo.jaspi.JaspiClientAuthConfigDocument
{
    private static final long serialVersionUID = 1L;
    
    public JaspiClientAuthConfigDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CLIENTAUTHCONFIG$0 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/geronimo-jaspi", "clientAuthConfig");
    
    
    /**
     * Gets the "clientAuthConfig" element
     */
    public org.apache.geronimo.xbeans.geronimo.jaspi.JaspiClientAuthConfigType getClientAuthConfig()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.jaspi.JaspiClientAuthConfigType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.jaspi.JaspiClientAuthConfigType)get_store().find_element_user(CLIENTAUTHCONFIG$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "clientAuthConfig" element
     */
    public void setClientAuthConfig(org.apache.geronimo.xbeans.geronimo.jaspi.JaspiClientAuthConfigType clientAuthConfig)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.jaspi.JaspiClientAuthConfigType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.jaspi.JaspiClientAuthConfigType)get_store().find_element_user(CLIENTAUTHCONFIG$0, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.xbeans.geronimo.jaspi.JaspiClientAuthConfigType)get_store().add_element_user(CLIENTAUTHCONFIG$0);
            }
            target.set(clientAuthConfig);
        }
    }
    
    /**
     * Appends and returns a new empty "clientAuthConfig" element
     */
    public org.apache.geronimo.xbeans.geronimo.jaspi.JaspiClientAuthConfigType addNewClientAuthConfig()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.jaspi.JaspiClientAuthConfigType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.jaspi.JaspiClientAuthConfigType)get_store().add_element_user(CLIENTAUTHCONFIG$0);
            return target;
        }
    }
}
