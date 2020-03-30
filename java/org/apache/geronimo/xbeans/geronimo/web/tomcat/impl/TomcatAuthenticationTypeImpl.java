/*
 * XML Type:  authenticationType
 * Namespace: http://geronimo.apache.org/xml/ns/j2ee/web/tomcat-2.0.1
 * Java type: org.apache.geronimo.xbeans.geronimo.web.tomcat.TomcatAuthenticationType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.geronimo.web.tomcat.impl;
/**
 * An XML authenticationType(@http://geronimo.apache.org/xml/ns/j2ee/web/tomcat-2.0.1).
 *
 * This is a complex type.
 */
public class TomcatAuthenticationTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.xbeans.geronimo.web.tomcat.TomcatAuthenticationType
{
    private static final long serialVersionUID = 1L;
    
    public TomcatAuthenticationTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONFIGPROVIDER$0 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/geronimo-jaspi", "configProvider");
    private static final javax.xml.namespace.QName SERVERAUTHCONFIG$2 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/geronimo-jaspi", "serverAuthConfig");
    private static final javax.xml.namespace.QName SERVERAUTHCONTEXT$4 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/geronimo-jaspi", "serverAuthContext");
    private static final javax.xml.namespace.QName SERVERAUTHMODULE$6 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/geronimo-jaspi", "serverAuthModule");
    
    
    /**
     * Gets the "configProvider" element
     */
    public org.apache.geronimo.xbeans.geronimo.jaspi.JaspiConfigProviderType getConfigProvider()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.jaspi.JaspiConfigProviderType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.jaspi.JaspiConfigProviderType)get_store().find_element_user(CONFIGPROVIDER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "configProvider" element
     */
    public boolean isSetConfigProvider()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONFIGPROVIDER$0) != 0;
        }
    }
    
    /**
     * Sets the "configProvider" element
     */
    public void setConfigProvider(org.apache.geronimo.xbeans.geronimo.jaspi.JaspiConfigProviderType configProvider)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.jaspi.JaspiConfigProviderType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.jaspi.JaspiConfigProviderType)get_store().find_element_user(CONFIGPROVIDER$0, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.xbeans.geronimo.jaspi.JaspiConfigProviderType)get_store().add_element_user(CONFIGPROVIDER$0);
            }
            target.set(configProvider);
        }
    }
    
    /**
     * Appends and returns a new empty "configProvider" element
     */
    public org.apache.geronimo.xbeans.geronimo.jaspi.JaspiConfigProviderType addNewConfigProvider()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.jaspi.JaspiConfigProviderType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.jaspi.JaspiConfigProviderType)get_store().add_element_user(CONFIGPROVIDER$0);
            return target;
        }
    }
    
    /**
     * Unsets the "configProvider" element
     */
    public void unsetConfigProvider()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONFIGPROVIDER$0, 0);
        }
    }
    
    /**
     * Gets the "serverAuthConfig" element
     */
    public org.apache.geronimo.xbeans.geronimo.jaspi.JaspiServerAuthConfigType getServerAuthConfig()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.jaspi.JaspiServerAuthConfigType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.jaspi.JaspiServerAuthConfigType)get_store().find_element_user(SERVERAUTHCONFIG$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "serverAuthConfig" element
     */
    public boolean isSetServerAuthConfig()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SERVERAUTHCONFIG$2) != 0;
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
            target = (org.apache.geronimo.xbeans.geronimo.jaspi.JaspiServerAuthConfigType)get_store().find_element_user(SERVERAUTHCONFIG$2, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.xbeans.geronimo.jaspi.JaspiServerAuthConfigType)get_store().add_element_user(SERVERAUTHCONFIG$2);
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
            target = (org.apache.geronimo.xbeans.geronimo.jaspi.JaspiServerAuthConfigType)get_store().add_element_user(SERVERAUTHCONFIG$2);
            return target;
        }
    }
    
    /**
     * Unsets the "serverAuthConfig" element
     */
    public void unsetServerAuthConfig()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SERVERAUTHCONFIG$2, 0);
        }
    }
    
    /**
     * Gets the "serverAuthContext" element
     */
    public org.apache.geronimo.xbeans.geronimo.jaspi.JaspiServerAuthContextType getServerAuthContext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.jaspi.JaspiServerAuthContextType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.jaspi.JaspiServerAuthContextType)get_store().find_element_user(SERVERAUTHCONTEXT$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "serverAuthContext" element
     */
    public boolean isSetServerAuthContext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SERVERAUTHCONTEXT$4) != 0;
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
            target = (org.apache.geronimo.xbeans.geronimo.jaspi.JaspiServerAuthContextType)get_store().find_element_user(SERVERAUTHCONTEXT$4, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.xbeans.geronimo.jaspi.JaspiServerAuthContextType)get_store().add_element_user(SERVERAUTHCONTEXT$4);
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
            target = (org.apache.geronimo.xbeans.geronimo.jaspi.JaspiServerAuthContextType)get_store().add_element_user(SERVERAUTHCONTEXT$4);
            return target;
        }
    }
    
    /**
     * Unsets the "serverAuthContext" element
     */
    public void unsetServerAuthContext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SERVERAUTHCONTEXT$4, 0);
        }
    }
    
    /**
     * Gets the "serverAuthModule" element
     */
    public org.apache.geronimo.xbeans.geronimo.jaspi.JaspiAuthModuleType getServerAuthModule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.jaspi.JaspiAuthModuleType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.jaspi.JaspiAuthModuleType)get_store().find_element_user(SERVERAUTHMODULE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "serverAuthModule" element
     */
    public boolean isSetServerAuthModule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SERVERAUTHMODULE$6) != 0;
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
            target = (org.apache.geronimo.xbeans.geronimo.jaspi.JaspiAuthModuleType)get_store().find_element_user(SERVERAUTHMODULE$6, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.xbeans.geronimo.jaspi.JaspiAuthModuleType)get_store().add_element_user(SERVERAUTHMODULE$6);
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
            target = (org.apache.geronimo.xbeans.geronimo.jaspi.JaspiAuthModuleType)get_store().add_element_user(SERVERAUTHMODULE$6);
            return target;
        }
    }
    
    /**
     * Unsets the "serverAuthModule" element
     */
    public void unsetServerAuthModule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SERVERAUTHMODULE$6, 0);
        }
    }
}
