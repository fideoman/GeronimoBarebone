/*
 * An XML document type.
 * Localname: serverAuthContext
 * Namespace: http://geronimo.apache.org/xml/ns/geronimo-jaspi
 * Java type: org.apache.geronimo.xbeans.geronimo.jaspi.JaspiServerAuthContextDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.geronimo.jaspi.impl;
/**
 * A document containing one serverAuthContext(@http://geronimo.apache.org/xml/ns/geronimo-jaspi) element.
 *
 * This is a complex type.
 */
public class JaspiServerAuthContextDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.xbeans.geronimo.jaspi.JaspiServerAuthContextDocument
{
    private static final long serialVersionUID = 1L;
    
    public JaspiServerAuthContextDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SERVERAUTHCONTEXT$0 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/geronimo-jaspi", "serverAuthContext");
    
    
    /**
     * Gets the "serverAuthContext" element
     */
    public org.apache.geronimo.xbeans.geronimo.jaspi.JaspiServerAuthContextType getServerAuthContext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.jaspi.JaspiServerAuthContextType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.jaspi.JaspiServerAuthContextType)get_store().find_element_user(SERVERAUTHCONTEXT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "serverAuthContext" element
     */
    public void setServerAuthContext(org.apache.geronimo.xbeans.geronimo.jaspi.JaspiServerAuthContextType serverAuthContext)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.jaspi.JaspiServerAuthContextType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.jaspi.JaspiServerAuthContextType)get_store().find_element_user(SERVERAUTHCONTEXT$0, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.xbeans.geronimo.jaspi.JaspiServerAuthContextType)get_store().add_element_user(SERVERAUTHCONTEXT$0);
            }
            target.set(serverAuthContext);
        }
    }
    
    /**
     * Appends and returns a new empty "serverAuthContext" element
     */
    public org.apache.geronimo.xbeans.geronimo.jaspi.JaspiServerAuthContextType addNewServerAuthContext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.jaspi.JaspiServerAuthContextType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.jaspi.JaspiServerAuthContextType)get_store().add_element_user(SERVERAUTHCONTEXT$0);
            return target;
        }
    }
}
