/*
 * An XML document type.
 * Localname: serverAuthModule
 * Namespace: http://geronimo.apache.org/xml/ns/geronimo-jaspi
 * Java type: org.apache.geronimo.xbeans.geronimo.jaspi.JaspiServerAuthModuleDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.geronimo.jaspi.impl;
/**
 * A document containing one serverAuthModule(@http://geronimo.apache.org/xml/ns/geronimo-jaspi) element.
 *
 * This is a complex type.
 */
public class JaspiServerAuthModuleDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.xbeans.geronimo.jaspi.JaspiServerAuthModuleDocument
{
    private static final long serialVersionUID = 1L;
    
    public JaspiServerAuthModuleDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SERVERAUTHMODULE$0 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/geronimo-jaspi", "serverAuthModule");
    
    
    /**
     * Gets the "serverAuthModule" element
     */
    public org.apache.geronimo.xbeans.geronimo.jaspi.JaspiAuthModuleType getServerAuthModule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.jaspi.JaspiAuthModuleType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.jaspi.JaspiAuthModuleType)get_store().find_element_user(SERVERAUTHMODULE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "serverAuthModule" element
     */
    public void setServerAuthModule(org.apache.geronimo.xbeans.geronimo.jaspi.JaspiAuthModuleType serverAuthModule)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.jaspi.JaspiAuthModuleType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.jaspi.JaspiAuthModuleType)get_store().find_element_user(SERVERAUTHMODULE$0, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.xbeans.geronimo.jaspi.JaspiAuthModuleType)get_store().add_element_user(SERVERAUTHMODULE$0);
            }
            target.set(serverAuthModule);
        }
    }
    
    /**
     * Appends and returns a new empty "serverAuthModule" element
     */
    public org.apache.geronimo.xbeans.geronimo.jaspi.JaspiAuthModuleType addNewServerAuthModule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.jaspi.JaspiAuthModuleType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.jaspi.JaspiAuthModuleType)get_store().add_element_user(SERVERAUTHMODULE$0);
            return target;
        }
    }
}
