/*
 * XML Type:  moduleType
 * Namespace: http://geronimo.apache.org/xml/ns/j2ee/application-2.0
 * Java type: org.apache.geronimo.xbeans.geronimo.j2ee.GerModuleType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.geronimo.j2ee.impl;
/**
 * An XML moduleType(@http://geronimo.apache.org/xml/ns/j2ee/application-2.0).
 *
 * This is a complex type.
 */
public class GerModuleTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.xbeans.geronimo.j2ee.GerModuleType
{
    private static final long serialVersionUID = 1L;
    
    public GerModuleTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONNECTOR$0 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/j2ee/application-2.0", "connector");
    private static final javax.xml.namespace.QName EJB$2 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/j2ee/application-2.0", "ejb");
    private static final javax.xml.namespace.QName JAVA$4 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/j2ee/application-2.0", "java");
    private static final javax.xml.namespace.QName WEB$6 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/j2ee/application-2.0", "web");
    private static final javax.xml.namespace.QName ALTDD$8 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/j2ee/application-2.0", "alt-dd");
    
    
    /**
     * Gets the "connector" element
     */
    public org.apache.geronimo.xbeans.geronimo.j2ee.GerPathType getConnector()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.j2ee.GerPathType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.j2ee.GerPathType)get_store().find_element_user(CONNECTOR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "connector" element
     */
    public boolean isSetConnector()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONNECTOR$0) != 0;
        }
    }
    
    /**
     * Sets the "connector" element
     */
    public void setConnector(org.apache.geronimo.xbeans.geronimo.j2ee.GerPathType connector)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.j2ee.GerPathType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.j2ee.GerPathType)get_store().find_element_user(CONNECTOR$0, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.xbeans.geronimo.j2ee.GerPathType)get_store().add_element_user(CONNECTOR$0);
            }
            target.set(connector);
        }
    }
    
    /**
     * Appends and returns a new empty "connector" element
     */
    public org.apache.geronimo.xbeans.geronimo.j2ee.GerPathType addNewConnector()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.j2ee.GerPathType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.j2ee.GerPathType)get_store().add_element_user(CONNECTOR$0);
            return target;
        }
    }
    
    /**
     * Unsets the "connector" element
     */
    public void unsetConnector()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONNECTOR$0, 0);
        }
    }
    
    /**
     * Gets the "ejb" element
     */
    public org.apache.geronimo.xbeans.geronimo.j2ee.GerPathType getEjb()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.j2ee.GerPathType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.j2ee.GerPathType)get_store().find_element_user(EJB$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ejb" element
     */
    public boolean isSetEjb()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EJB$2) != 0;
        }
    }
    
    /**
     * Sets the "ejb" element
     */
    public void setEjb(org.apache.geronimo.xbeans.geronimo.j2ee.GerPathType ejb)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.j2ee.GerPathType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.j2ee.GerPathType)get_store().find_element_user(EJB$2, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.xbeans.geronimo.j2ee.GerPathType)get_store().add_element_user(EJB$2);
            }
            target.set(ejb);
        }
    }
    
    /**
     * Appends and returns a new empty "ejb" element
     */
    public org.apache.geronimo.xbeans.geronimo.j2ee.GerPathType addNewEjb()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.j2ee.GerPathType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.j2ee.GerPathType)get_store().add_element_user(EJB$2);
            return target;
        }
    }
    
    /**
     * Unsets the "ejb" element
     */
    public void unsetEjb()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EJB$2, 0);
        }
    }
    
    /**
     * Gets the "java" element
     */
    public org.apache.geronimo.xbeans.geronimo.j2ee.GerPathType getJava()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.j2ee.GerPathType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.j2ee.GerPathType)get_store().find_element_user(JAVA$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "java" element
     */
    public boolean isSetJava()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(JAVA$4) != 0;
        }
    }
    
    /**
     * Sets the "java" element
     */
    public void setJava(org.apache.geronimo.xbeans.geronimo.j2ee.GerPathType java)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.j2ee.GerPathType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.j2ee.GerPathType)get_store().find_element_user(JAVA$4, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.xbeans.geronimo.j2ee.GerPathType)get_store().add_element_user(JAVA$4);
            }
            target.set(java);
        }
    }
    
    /**
     * Appends and returns a new empty "java" element
     */
    public org.apache.geronimo.xbeans.geronimo.j2ee.GerPathType addNewJava()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.j2ee.GerPathType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.j2ee.GerPathType)get_store().add_element_user(JAVA$4);
            return target;
        }
    }
    
    /**
     * Unsets the "java" element
     */
    public void unsetJava()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(JAVA$4, 0);
        }
    }
    
    /**
     * Gets the "web" element
     */
    public org.apache.geronimo.xbeans.geronimo.j2ee.GerPathType getWeb()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.j2ee.GerPathType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.j2ee.GerPathType)get_store().find_element_user(WEB$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "web" element
     */
    public boolean isSetWeb()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WEB$6) != 0;
        }
    }
    
    /**
     * Sets the "web" element
     */
    public void setWeb(org.apache.geronimo.xbeans.geronimo.j2ee.GerPathType web)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.j2ee.GerPathType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.j2ee.GerPathType)get_store().find_element_user(WEB$6, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.xbeans.geronimo.j2ee.GerPathType)get_store().add_element_user(WEB$6);
            }
            target.set(web);
        }
    }
    
    /**
     * Appends and returns a new empty "web" element
     */
    public org.apache.geronimo.xbeans.geronimo.j2ee.GerPathType addNewWeb()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.j2ee.GerPathType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.j2ee.GerPathType)get_store().add_element_user(WEB$6);
            return target;
        }
    }
    
    /**
     * Unsets the "web" element
     */
    public void unsetWeb()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WEB$6, 0);
        }
    }
    
    /**
     * Gets the "alt-dd" element
     */
    public org.apache.geronimo.xbeans.geronimo.j2ee.GerPathType getAltDd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.j2ee.GerPathType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.j2ee.GerPathType)get_store().find_element_user(ALTDD$8, 0);
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
            return get_store().count_elements(ALTDD$8) != 0;
        }
    }
    
    /**
     * Sets the "alt-dd" element
     */
    public void setAltDd(org.apache.geronimo.xbeans.geronimo.j2ee.GerPathType altDd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.j2ee.GerPathType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.j2ee.GerPathType)get_store().find_element_user(ALTDD$8, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.xbeans.geronimo.j2ee.GerPathType)get_store().add_element_user(ALTDD$8);
            }
            target.set(altDd);
        }
    }
    
    /**
     * Appends and returns a new empty "alt-dd" element
     */
    public org.apache.geronimo.xbeans.geronimo.j2ee.GerPathType addNewAltDd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.j2ee.GerPathType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.j2ee.GerPathType)get_store().add_element_user(ALTDD$8);
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
            get_store().remove_element(ALTDD$8, 0);
        }
    }
}
