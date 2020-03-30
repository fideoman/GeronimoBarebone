/*
 * XML Type:  moduleType
 * Namespace: http://geronimo.apache.org/xml/ns/j2ee/web/jetty-2.0.2
 * Java type: org.apache.geronimo.xbeans.geronimo.web.jetty.JettyModuleType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.geronimo.web.jetty.impl;
/**
 * An XML moduleType(@http://geronimo.apache.org/xml/ns/j2ee/web/jetty-2.0.2).
 *
 * This is a complex type.
 */
public class JettyModuleTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.xbeans.geronimo.web.jetty.JettyModuleType
{
    private static final long serialVersionUID = 1L;
    
    public JettyModuleTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EJB$0 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/j2ee/web/jetty-2.0.2", "ejb");
    private static final javax.xml.namespace.QName ALTDD$2 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/j2ee/web/jetty-2.0.2", "alt-dd");
    
    
    /**
     * Gets the "ejb" element
     */
    public org.apache.geronimo.xbeans.geronimo.web.jetty.JettyPathType getEjb()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.web.jetty.JettyPathType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.web.jetty.JettyPathType)get_store().find_element_user(EJB$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ejb" element
     */
    public void setEjb(org.apache.geronimo.xbeans.geronimo.web.jetty.JettyPathType ejb)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.web.jetty.JettyPathType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.web.jetty.JettyPathType)get_store().find_element_user(EJB$0, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.xbeans.geronimo.web.jetty.JettyPathType)get_store().add_element_user(EJB$0);
            }
            target.set(ejb);
        }
    }
    
    /**
     * Appends and returns a new empty "ejb" element
     */
    public org.apache.geronimo.xbeans.geronimo.web.jetty.JettyPathType addNewEjb()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.web.jetty.JettyPathType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.web.jetty.JettyPathType)get_store().add_element_user(EJB$0);
            return target;
        }
    }
    
    /**
     * Gets the "alt-dd" element
     */
    public org.apache.geronimo.xbeans.geronimo.web.jetty.JettyPathType getAltDd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.web.jetty.JettyPathType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.web.jetty.JettyPathType)get_store().find_element_user(ALTDD$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "alt-dd" element
     */
    public boolean isSetAltDd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ALTDD$2) != 0;
        }
    }
    
    /**
     * Sets the "alt-dd" element
     */
    public void setAltDd(org.apache.geronimo.xbeans.geronimo.web.jetty.JettyPathType altDd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.web.jetty.JettyPathType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.web.jetty.JettyPathType)get_store().find_element_user(ALTDD$2, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.xbeans.geronimo.web.jetty.JettyPathType)get_store().add_element_user(ALTDD$2);
            }
            target.set(altDd);
        }
    }
    
    /**
     * Appends and returns a new empty "alt-dd" element
     */
    public org.apache.geronimo.xbeans.geronimo.web.jetty.JettyPathType addNewAltDd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.web.jetty.JettyPathType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.web.jetty.JettyPathType)get_store().add_element_user(ALTDD$2);
            return target;
        }
    }
    
    /**
     * Unsets the "alt-dd" element
     */
    public void unsetAltDd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ALTDD$2, 0);
        }
    }
}
