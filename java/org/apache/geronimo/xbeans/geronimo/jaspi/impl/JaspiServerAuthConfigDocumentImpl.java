/*
 * An XML document type.
 * Localname: serverAuthConfig
 * Namespace: http://geronimo.apache.org/xml/ns/geronimo-jaspi
 * Java type: org.apache.geronimo.xbeans.geronimo.jaspi.JaspiServerAuthConfigDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.geronimo.jaspi.impl;
/**
 * A document containing one serverAuthConfig(@http://geronimo.apache.org/xml/ns/geronimo-jaspi) element.
 *
 * This is a complex type.
 */
public class JaspiServerAuthConfigDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.xbeans.geronimo.jaspi.JaspiServerAuthConfigDocument
{
    private static final long serialVersionUID = 1L;
    
    public JaspiServerAuthConfigDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SERVERAUTHCONFIG$0 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/geronimo-jaspi", "serverAuthConfig");
    
    
    /**
     * Gets the "serverAuthConfig" element
     */
    public org.apache.geronimo.xbeans.geronimo.jaspi.JaspiServerAuthConfigType getServerAuthConfig()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.jaspi.JaspiServerAuthConfigType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.jaspi.JaspiServerAuthConfigType)get_store().find_element_user(SERVERAUTHCONFIG$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "serverAuthConfig" element
     */
    public void setServerAuthConfig(org.apache.geronimo.xbeans.geronimo.jaspi.JaspiServerAuthConfigType serverAuthConfig)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.jaspi.JaspiServerAuthConfigType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.jaspi.JaspiServerAuthConfigType)get_store().find_element_user(SERVERAUTHCONFIG$0, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.xbeans.geronimo.jaspi.JaspiServerAuthConfigType)get_store().add_element_user(SERVERAUTHCONFIG$0);
            }
            target.set(serverAuthConfig);
        }
    }
    
    /**
     * Appends and returns a new empty "serverAuthConfig" element
     */
    public org.apache.geronimo.xbeans.geronimo.jaspi.JaspiServerAuthConfigType addNewServerAuthConfig()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.jaspi.JaspiServerAuthConfigType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.jaspi.JaspiServerAuthConfigType)get_store().add_element_user(SERVERAUTHCONFIG$0);
            return target;
        }
    }
}
