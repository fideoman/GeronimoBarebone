/*
 * XML Type:  ext-moduleType
 * Namespace: http://geronimo.apache.org/xml/ns/j2ee/application-2.0
 * Java type: org.apache.geronimo.xbeans.geronimo.j2ee.GerExtModuleType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.geronimo.j2ee.impl;
/**
 * An XML ext-moduleType(@http://geronimo.apache.org/xml/ns/j2ee/application-2.0).
 *
 * This is a complex type.
 */
public class GerExtModuleTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.xbeans.geronimo.j2ee.GerExtModuleType
{
    private static final long serialVersionUID = 1L;
    
    public GerExtModuleTypeImpl(org.apache.xmlbeans.SchemaType sType)
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
    private static final javax.xml.namespace.QName INTERNALPATH$8 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/j2ee/application-2.0", "internal-path");
    private static final javax.xml.namespace.QName EXTERNALPATH$10 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/j2ee/application-2.0", "external-path");
    
    
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
     * Gets the "internal-path" element
     */
    public java.lang.String getInternalPath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTERNALPATH$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "internal-path" element
     */
    public org.apache.xmlbeans.XmlToken xgetInternalPath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlToken target = null;
            target = (org.apache.xmlbeans.XmlToken)get_store().find_element_user(INTERNALPATH$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "internal-path" element
     */
    public boolean isSetInternalPath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INTERNALPATH$8) != 0;
        }
    }
    
    /**
     * Sets the "internal-path" element
     */
    public void setInternalPath(java.lang.String internalPath)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTERNALPATH$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INTERNALPATH$8);
            }
            target.setStringValue(internalPath);
        }
    }
    
    /**
     * Sets (as xml) the "internal-path" element
     */
    public void xsetInternalPath(org.apache.xmlbeans.XmlToken internalPath)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlToken target = null;
            target = (org.apache.xmlbeans.XmlToken)get_store().find_element_user(INTERNALPATH$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlToken)get_store().add_element_user(INTERNALPATH$8);
            }
            target.set(internalPath);
        }
    }
    
    /**
     * Unsets the "internal-path" element
     */
    public void unsetInternalPath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INTERNALPATH$8, 0);
        }
    }
    
    /**
     * Gets the "external-path" element
     */
    public org.apache.geronimo.deployment.xbeans.PatternType getExternalPath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.xbeans.PatternType target = null;
            target = (org.apache.geronimo.deployment.xbeans.PatternType)get_store().find_element_user(EXTERNALPATH$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "external-path" element
     */
    public boolean isSetExternalPath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXTERNALPATH$10) != 0;
        }
    }
    
    /**
     * Sets the "external-path" element
     */
    public void setExternalPath(org.apache.geronimo.deployment.xbeans.PatternType externalPath)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.xbeans.PatternType target = null;
            target = (org.apache.geronimo.deployment.xbeans.PatternType)get_store().find_element_user(EXTERNALPATH$10, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.deployment.xbeans.PatternType)get_store().add_element_user(EXTERNALPATH$10);
            }
            target.set(externalPath);
        }
    }
    
    /**
     * Appends and returns a new empty "external-path" element
     */
    public org.apache.geronimo.deployment.xbeans.PatternType addNewExternalPath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.xbeans.PatternType target = null;
            target = (org.apache.geronimo.deployment.xbeans.PatternType)get_store().add_element_user(EXTERNALPATH$10);
            return target;
        }
    }
    
    /**
     * Unsets the "external-path" element
     */
    public void unsetExternalPath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXTERNALPATH$10, 0);
        }
    }
}
