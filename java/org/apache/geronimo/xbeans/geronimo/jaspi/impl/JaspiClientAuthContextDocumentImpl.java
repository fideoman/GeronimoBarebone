/*
 * An XML document type.
 * Localname: clientAuthContext
 * Namespace: http://geronimo.apache.org/xml/ns/geronimo-jaspi
 * Java type: org.apache.geronimo.xbeans.geronimo.jaspi.JaspiClientAuthContextDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.geronimo.jaspi.impl;
/**
 * A document containing one clientAuthContext(@http://geronimo.apache.org/xml/ns/geronimo-jaspi) element.
 *
 * This is a complex type.
 */
public class JaspiClientAuthContextDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.xbeans.geronimo.jaspi.JaspiClientAuthContextDocument
{
    private static final long serialVersionUID = 1L;
    
    public JaspiClientAuthContextDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CLIENTAUTHCONTEXT$0 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/geronimo-jaspi", "clientAuthContext");
    
    
    /**
     * Gets the "clientAuthContext" element
     */
    public org.apache.geronimo.xbeans.geronimo.jaspi.JaspiClientAuthContextType getClientAuthContext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.jaspi.JaspiClientAuthContextType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.jaspi.JaspiClientAuthContextType)get_store().find_element_user(CLIENTAUTHCONTEXT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "clientAuthContext" element
     */
    public void setClientAuthContext(org.apache.geronimo.xbeans.geronimo.jaspi.JaspiClientAuthContextType clientAuthContext)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.jaspi.JaspiClientAuthContextType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.jaspi.JaspiClientAuthContextType)get_store().find_element_user(CLIENTAUTHCONTEXT$0, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.xbeans.geronimo.jaspi.JaspiClientAuthContextType)get_store().add_element_user(CLIENTAUTHCONTEXT$0);
            }
            target.set(clientAuthContext);
        }
    }
    
    /**
     * Appends and returns a new empty "clientAuthContext" element
     */
    public org.apache.geronimo.xbeans.geronimo.jaspi.JaspiClientAuthContextType addNewClientAuthContext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.jaspi.JaspiClientAuthContextType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.jaspi.JaspiClientAuthContextType)get_store().add_element_user(CLIENTAUTHCONTEXT$0);
            return target;
        }
    }
}
