/*
 * An XML document type.
 * Localname: clientAuthModule
 * Namespace: http://geronimo.apache.org/xml/ns/geronimo-jaspi
 * Java type: org.apache.geronimo.xbeans.geronimo.jaspi.JaspiClientAuthModuleDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.geronimo.jaspi.impl;
/**
 * A document containing one clientAuthModule(@http://geronimo.apache.org/xml/ns/geronimo-jaspi) element.
 *
 * This is a complex type.
 */
public class JaspiClientAuthModuleDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.xbeans.geronimo.jaspi.JaspiClientAuthModuleDocument
{
    private static final long serialVersionUID = 1L;
    
    public JaspiClientAuthModuleDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CLIENTAUTHMODULE$0 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/geronimo-jaspi", "clientAuthModule");
    
    
    /**
     * Gets the "clientAuthModule" element
     */
    public org.apache.geronimo.xbeans.geronimo.jaspi.JaspiAuthModuleType getClientAuthModule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.jaspi.JaspiAuthModuleType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.jaspi.JaspiAuthModuleType)get_store().find_element_user(CLIENTAUTHMODULE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "clientAuthModule" element
     */
    public void setClientAuthModule(org.apache.geronimo.xbeans.geronimo.jaspi.JaspiAuthModuleType clientAuthModule)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.jaspi.JaspiAuthModuleType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.jaspi.JaspiAuthModuleType)get_store().find_element_user(CLIENTAUTHMODULE$0, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.xbeans.geronimo.jaspi.JaspiAuthModuleType)get_store().add_element_user(CLIENTAUTHMODULE$0);
            }
            target.set(clientAuthModule);
        }
    }
    
    /**
     * Appends and returns a new empty "clientAuthModule" element
     */
    public org.apache.geronimo.xbeans.geronimo.jaspi.JaspiAuthModuleType addNewClientAuthModule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.jaspi.JaspiAuthModuleType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.jaspi.JaspiAuthModuleType)get_store().add_element_user(CLIENTAUTHMODULE$0);
            return target;
        }
    }
}
