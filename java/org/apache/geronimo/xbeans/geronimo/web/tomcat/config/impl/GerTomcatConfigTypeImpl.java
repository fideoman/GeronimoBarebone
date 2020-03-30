/*
 * XML Type:  tomcat-configType
 * Namespace: http://geronimo.apache.org/xml/ns/web/tomcat/config-1.0
 * Java type: org.apache.geronimo.xbeans.geronimo.web.tomcat.config.GerTomcatConfigType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.geronimo.web.tomcat.config.impl;
/**
 * An XML tomcat-configType(@http://geronimo.apache.org/xml/ns/web/tomcat/config-1.0).
 *
 * This is a complex type.
 */
public class GerTomcatConfigTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.xbeans.geronimo.web.tomcat.config.GerTomcatConfigType
{
    private static final long serialVersionUID = 1L;
    
    public GerTomcatConfigTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HOST$0 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/web/tomcat/config-1.0", "host");
    private static final javax.xml.namespace.QName CROSSCONTEXT$2 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/web/tomcat/config-1.0", "cross-context");
    private static final javax.xml.namespace.QName DISABLECOOKIES$4 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/web/tomcat/config-1.0", "disable-cookies");
    private static final javax.xml.namespace.QName CONTEXT$6 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/web/tomcat/config-1.0", "context");
    private static final javax.xml.namespace.QName VALVECHAIN$8 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/web/tomcat/config-1.0", "valve-chain");
    private static final javax.xml.namespace.QName LISTENERCHAIN$10 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/web/tomcat/config-1.0", "listener-chain");
    private static final javax.xml.namespace.QName TOMCATREALM$12 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/web/tomcat/config-1.0", "tomcat-realm");
    private static final javax.xml.namespace.QName MANAGER$14 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/web/tomcat/config-1.0", "manager");
    private static final javax.xml.namespace.QName CLUSTER$16 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/web/tomcat/config-1.0", "cluster");
    
    
    /**
     * Gets the "host" element
     */
    public java.lang.String getHost()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HOST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "host" element
     */
    public org.apache.xmlbeans.XmlString xgetHost()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HOST$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "host" element
     */
    public boolean isSetHost()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HOST$0) != 0;
        }
    }
    
    /**
     * Sets the "host" element
     */
    public void setHost(java.lang.String host)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HOST$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HOST$0);
            }
            target.setStringValue(host);
        }
    }
    
    /**
     * Sets (as xml) the "host" element
     */
    public void xsetHost(org.apache.xmlbeans.XmlString host)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HOST$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(HOST$0);
            }
            target.set(host);
        }
    }
    
    /**
     * Unsets the "host" element
     */
    public void unsetHost()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HOST$0, 0);
        }
    }
    
    /**
     * Gets the "cross-context" element
     */
    public org.apache.geronimo.xbeans.geronimo.web.tomcat.config.GerEmptyType getCrossContext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.web.tomcat.config.GerEmptyType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.web.tomcat.config.GerEmptyType)get_store().find_element_user(CROSSCONTEXT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "cross-context" element
     */
    public boolean isSetCrossContext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CROSSCONTEXT$2) != 0;
        }
    }
    
    /**
     * Sets the "cross-context" element
     */
    public void setCrossContext(org.apache.geronimo.xbeans.geronimo.web.tomcat.config.GerEmptyType crossContext)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.web.tomcat.config.GerEmptyType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.web.tomcat.config.GerEmptyType)get_store().find_element_user(CROSSCONTEXT$2, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.xbeans.geronimo.web.tomcat.config.GerEmptyType)get_store().add_element_user(CROSSCONTEXT$2);
            }
            target.set(crossContext);
        }
    }
    
    /**
     * Appends and returns a new empty "cross-context" element
     */
    public org.apache.geronimo.xbeans.geronimo.web.tomcat.config.GerEmptyType addNewCrossContext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.web.tomcat.config.GerEmptyType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.web.tomcat.config.GerEmptyType)get_store().add_element_user(CROSSCONTEXT$2);
            return target;
        }
    }
    
    /**
     * Unsets the "cross-context" element
     */
    public void unsetCrossContext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CROSSCONTEXT$2, 0);
        }
    }
    
    /**
     * Gets the "disable-cookies" element
     */
    public org.apache.geronimo.xbeans.geronimo.web.tomcat.config.GerEmptyType getDisableCookies()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.web.tomcat.config.GerEmptyType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.web.tomcat.config.GerEmptyType)get_store().find_element_user(DISABLECOOKIES$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "disable-cookies" element
     */
    public boolean isSetDisableCookies()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DISABLECOOKIES$4) != 0;
        }
    }
    
    /**
     * Sets the "disable-cookies" element
     */
    public void setDisableCookies(org.apache.geronimo.xbeans.geronimo.web.tomcat.config.GerEmptyType disableCookies)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.web.tomcat.config.GerEmptyType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.web.tomcat.config.GerEmptyType)get_store().find_element_user(DISABLECOOKIES$4, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.xbeans.geronimo.web.tomcat.config.GerEmptyType)get_store().add_element_user(DISABLECOOKIES$4);
            }
            target.set(disableCookies);
        }
    }
    
    /**
     * Appends and returns a new empty "disable-cookies" element
     */
    public org.apache.geronimo.xbeans.geronimo.web.tomcat.config.GerEmptyType addNewDisableCookies()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.web.tomcat.config.GerEmptyType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.web.tomcat.config.GerEmptyType)get_store().add_element_user(DISABLECOOKIES$4);
            return target;
        }
    }
    
    /**
     * Unsets the "disable-cookies" element
     */
    public void unsetDisableCookies()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DISABLECOOKIES$4, 0);
        }
    }
    
    /**
     * Gets the "context" element
     */
    public org.apache.geronimo.xbeans.geronimo.web.tomcat.config.GerContextType getContext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.web.tomcat.config.GerContextType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.web.tomcat.config.GerContextType)get_store().find_element_user(CONTEXT$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "context" element
     */
    public boolean isSetContext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTEXT$6) != 0;
        }
    }
    
    /**
     * Sets the "context" element
     */
    public void setContext(org.apache.geronimo.xbeans.geronimo.web.tomcat.config.GerContextType context)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.web.tomcat.config.GerContextType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.web.tomcat.config.GerContextType)get_store().find_element_user(CONTEXT$6, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.xbeans.geronimo.web.tomcat.config.GerContextType)get_store().add_element_user(CONTEXT$6);
            }
            target.set(context);
        }
    }
    
    /**
     * Appends and returns a new empty "context" element
     */
    public org.apache.geronimo.xbeans.geronimo.web.tomcat.config.GerContextType addNewContext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.web.tomcat.config.GerContextType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.web.tomcat.config.GerContextType)get_store().add_element_user(CONTEXT$6);
            return target;
        }
    }
    
    /**
     * Unsets the "context" element
     */
    public void unsetContext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTEXT$6, 0);
        }
    }
    
    /**
     * Gets the "valve-chain" element
     */
    public java.lang.String getValveChain()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALVECHAIN$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "valve-chain" element
     */
    public org.apache.xmlbeans.XmlString xgetValveChain()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VALVECHAIN$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "valve-chain" element
     */
    public boolean isSetValveChain()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALVECHAIN$8) != 0;
        }
    }
    
    /**
     * Sets the "valve-chain" element
     */
    public void setValveChain(java.lang.String valveChain)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALVECHAIN$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VALVECHAIN$8);
            }
            target.setStringValue(valveChain);
        }
    }
    
    /**
     * Sets (as xml) the "valve-chain" element
     */
    public void xsetValveChain(org.apache.xmlbeans.XmlString valveChain)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VALVECHAIN$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VALVECHAIN$8);
            }
            target.set(valveChain);
        }
    }
    
    /**
     * Unsets the "valve-chain" element
     */
    public void unsetValveChain()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALVECHAIN$8, 0);
        }
    }
    
    /**
     * Gets the "listener-chain" element
     */
    public java.lang.String getListenerChain()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LISTENERCHAIN$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "listener-chain" element
     */
    public org.apache.xmlbeans.XmlString xgetListenerChain()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LISTENERCHAIN$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "listener-chain" element
     */
    public boolean isSetListenerChain()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LISTENERCHAIN$10) != 0;
        }
    }
    
    /**
     * Sets the "listener-chain" element
     */
    public void setListenerChain(java.lang.String listenerChain)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LISTENERCHAIN$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LISTENERCHAIN$10);
            }
            target.setStringValue(listenerChain);
        }
    }
    
    /**
     * Sets (as xml) the "listener-chain" element
     */
    public void xsetListenerChain(org.apache.xmlbeans.XmlString listenerChain)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LISTENERCHAIN$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LISTENERCHAIN$10);
            }
            target.set(listenerChain);
        }
    }
    
    /**
     * Unsets the "listener-chain" element
     */
    public void unsetListenerChain()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LISTENERCHAIN$10, 0);
        }
    }
    
    /**
     * Gets the "tomcat-realm" element
     */
    public java.lang.String getTomcatRealm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOMCATREALM$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "tomcat-realm" element
     */
    public org.apache.xmlbeans.XmlString xgetTomcatRealm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TOMCATREALM$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "tomcat-realm" element
     */
    public boolean isSetTomcatRealm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TOMCATREALM$12) != 0;
        }
    }
    
    /**
     * Sets the "tomcat-realm" element
     */
    public void setTomcatRealm(java.lang.String tomcatRealm)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOMCATREALM$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOMCATREALM$12);
            }
            target.setStringValue(tomcatRealm);
        }
    }
    
    /**
     * Sets (as xml) the "tomcat-realm" element
     */
    public void xsetTomcatRealm(org.apache.xmlbeans.XmlString tomcatRealm)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TOMCATREALM$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TOMCATREALM$12);
            }
            target.set(tomcatRealm);
        }
    }
    
    /**
     * Unsets the "tomcat-realm" element
     */
    public void unsetTomcatRealm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TOMCATREALM$12, 0);
        }
    }
    
    /**
     * Gets the "manager" element
     */
    public java.lang.String getManager()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MANAGER$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "manager" element
     */
    public org.apache.xmlbeans.XmlString xgetManager()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MANAGER$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "manager" element
     */
    public boolean isSetManager()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MANAGER$14) != 0;
        }
    }
    
    /**
     * Sets the "manager" element
     */
    public void setManager(java.lang.String manager)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MANAGER$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MANAGER$14);
            }
            target.setStringValue(manager);
        }
    }
    
    /**
     * Sets (as xml) the "manager" element
     */
    public void xsetManager(org.apache.xmlbeans.XmlString manager)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MANAGER$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MANAGER$14);
            }
            target.set(manager);
        }
    }
    
    /**
     * Unsets the "manager" element
     */
    public void unsetManager()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MANAGER$14, 0);
        }
    }
    
    /**
     * Gets the "cluster" element
     */
    public java.lang.String getCluster()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLUSTER$16, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "cluster" element
     */
    public org.apache.xmlbeans.XmlString xgetCluster()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLUSTER$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "cluster" element
     */
    public boolean isSetCluster()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CLUSTER$16) != 0;
        }
    }
    
    /**
     * Sets the "cluster" element
     */
    public void setCluster(java.lang.String cluster)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLUSTER$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CLUSTER$16);
            }
            target.setStringValue(cluster);
        }
    }
    
    /**
     * Sets (as xml) the "cluster" element
     */
    public void xsetCluster(org.apache.xmlbeans.XmlString cluster)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLUSTER$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CLUSTER$16);
            }
            target.set(cluster);
        }
    }
    
    /**
     * Unsets the "cluster" element
     */
    public void unsetCluster()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CLUSTER$16, 0);
        }
    }
}
