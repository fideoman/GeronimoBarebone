/*
 * An XML document type.
 * Localname: login-config
 * Namespace: http://geronimo.apache.org/xml/ns/loginconfig-2.0
 * Java type: org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginConfigDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.geronimo.loginconfig.impl;
/**
 * A document containing one login-config(@http://geronimo.apache.org/xml/ns/loginconfig-2.0) element.
 *
 * This is a complex type.
 */
public class GerLoginConfigDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginConfigDocument
{
    private static final long serialVersionUID = 1L;
    
    public GerLoginConfigDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOGINCONFIG$0 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/loginconfig-2.0", "login-config");
    
    
    /**
     * Gets the "login-config" element
     */
    public org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginConfigType getLoginConfig()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginConfigType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginConfigType)get_store().find_element_user(LOGINCONFIG$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "login-config" element
     */
    public void setLoginConfig(org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginConfigType loginConfig)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginConfigType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginConfigType)get_store().find_element_user(LOGINCONFIG$0, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginConfigType)get_store().add_element_user(LOGINCONFIG$0);
            }
            target.set(loginConfig);
        }
    }
    
    /**
     * Appends and returns a new empty "login-config" element
     */
    public org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginConfigType addNewLoginConfig()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginConfigType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginConfigType)get_store().add_element_user(LOGINCONFIG$0);
            return target;
        }
    }
}
