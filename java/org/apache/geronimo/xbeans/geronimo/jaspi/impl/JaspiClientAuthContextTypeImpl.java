/*
 * XML Type:  clientAuthContextType
 * Namespace: http://geronimo.apache.org/xml/ns/geronimo-jaspi
 * Java type: org.apache.geronimo.xbeans.geronimo.jaspi.JaspiClientAuthContextType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.geronimo.jaspi.impl;
/**
 * An XML clientAuthContextType(@http://geronimo.apache.org/xml/ns/geronimo-jaspi).
 *
 * This is a complex type.
 */
public class JaspiClientAuthContextTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.xbeans.geronimo.jaspi.JaspiClientAuthContextType
{
    private static final long serialVersionUID = 1L;
    
    public JaspiClientAuthContextTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MESSAGELAYER$0 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/geronimo-jaspi", "messageLayer");
    private static final javax.xml.namespace.QName APPCONTEXT$2 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/geronimo-jaspi", "appContext");
    private static final javax.xml.namespace.QName AUTHENTICATIONCONTEXTID$4 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/geronimo-jaspi", "authenticationContextID");
    private static final javax.xml.namespace.QName CLIENTAUTHMODULE$6 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/geronimo-jaspi", "clientAuthModule");
    
    
    /**
     * Gets the "messageLayer" element
     */
    public java.lang.String getMessageLayer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGELAYER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "messageLayer" element
     */
    public org.apache.xmlbeans.XmlString xgetMessageLayer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MESSAGELAYER$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "messageLayer" element
     */
    public boolean isSetMessageLayer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MESSAGELAYER$0) != 0;
        }
    }
    
    /**
     * Sets the "messageLayer" element
     */
    public void setMessageLayer(java.lang.String messageLayer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGELAYER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MESSAGELAYER$0);
            }
            target.setStringValue(messageLayer);
        }
    }
    
    /**
     * Sets (as xml) the "messageLayer" element
     */
    public void xsetMessageLayer(org.apache.xmlbeans.XmlString messageLayer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MESSAGELAYER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MESSAGELAYER$0);
            }
            target.set(messageLayer);
        }
    }
    
    /**
     * Unsets the "messageLayer" element
     */
    public void unsetMessageLayer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MESSAGELAYER$0, 0);
        }
    }
    
    /**
     * Gets the "appContext" element
     */
    public java.lang.String getAppContext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(APPCONTEXT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "appContext" element
     */
    public org.apache.xmlbeans.XmlString xgetAppContext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(APPCONTEXT$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "appContext" element
     */
    public boolean isSetAppContext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(APPCONTEXT$2) != 0;
        }
    }
    
    /**
     * Sets the "appContext" element
     */
    public void setAppContext(java.lang.String appContext)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(APPCONTEXT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(APPCONTEXT$2);
            }
            target.setStringValue(appContext);
        }
    }
    
    /**
     * Sets (as xml) the "appContext" element
     */
    public void xsetAppContext(org.apache.xmlbeans.XmlString appContext)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(APPCONTEXT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(APPCONTEXT$2);
            }
            target.set(appContext);
        }
    }
    
    /**
     * Unsets the "appContext" element
     */
    public void unsetAppContext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(APPCONTEXT$2, 0);
        }
    }
    
    /**
     * Gets the "authenticationContextID" element
     */
    public java.lang.String getAuthenticationContextID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTHENTICATIONCONTEXTID$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "authenticationContextID" element
     */
    public org.apache.xmlbeans.XmlString xgetAuthenticationContextID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AUTHENTICATIONCONTEXTID$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "authenticationContextID" element
     */
    public boolean isSetAuthenticationContextID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AUTHENTICATIONCONTEXTID$4) != 0;
        }
    }
    
    /**
     * Sets the "authenticationContextID" element
     */
    public void setAuthenticationContextID(java.lang.String authenticationContextID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTHENTICATIONCONTEXTID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AUTHENTICATIONCONTEXTID$4);
            }
            target.setStringValue(authenticationContextID);
        }
    }
    
    /**
     * Sets (as xml) the "authenticationContextID" element
     */
    public void xsetAuthenticationContextID(org.apache.xmlbeans.XmlString authenticationContextID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AUTHENTICATIONCONTEXTID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(AUTHENTICATIONCONTEXTID$4);
            }
            target.set(authenticationContextID);
        }
    }
    
    /**
     * Unsets the "authenticationContextID" element
     */
    public void unsetAuthenticationContextID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AUTHENTICATIONCONTEXTID$4, 0);
        }
    }
    
    /**
     * Gets array of all "clientAuthModule" elements
     */
    public org.apache.geronimo.xbeans.geronimo.jaspi.JaspiAuthModuleType[] getClientAuthModuleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CLIENTAUTHMODULE$6, targetList);
            org.apache.geronimo.xbeans.geronimo.jaspi.JaspiAuthModuleType[] result = new org.apache.geronimo.xbeans.geronimo.jaspi.JaspiAuthModuleType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "clientAuthModule" element
     */
    public org.apache.geronimo.xbeans.geronimo.jaspi.JaspiAuthModuleType getClientAuthModuleArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.jaspi.JaspiAuthModuleType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.jaspi.JaspiAuthModuleType)get_store().find_element_user(CLIENTAUTHMODULE$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "clientAuthModule" element
     */
    public int sizeOfClientAuthModuleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CLIENTAUTHMODULE$6);
        }
    }
    
    /**
     * Sets array of all "clientAuthModule" element
     */
    public void setClientAuthModuleArray(org.apache.geronimo.xbeans.geronimo.jaspi.JaspiAuthModuleType[] clientAuthModuleArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(clientAuthModuleArray, CLIENTAUTHMODULE$6);
        }
    }
    
    /**
     * Sets ith "clientAuthModule" element
     */
    public void setClientAuthModuleArray(int i, org.apache.geronimo.xbeans.geronimo.jaspi.JaspiAuthModuleType clientAuthModule)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.jaspi.JaspiAuthModuleType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.jaspi.JaspiAuthModuleType)get_store().find_element_user(CLIENTAUTHMODULE$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(clientAuthModule);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "clientAuthModule" element
     */
    public org.apache.geronimo.xbeans.geronimo.jaspi.JaspiAuthModuleType insertNewClientAuthModule(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.jaspi.JaspiAuthModuleType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.jaspi.JaspiAuthModuleType)get_store().insert_element_user(CLIENTAUTHMODULE$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "clientAuthModule" element
     */
    public org.apache.geronimo.xbeans.geronimo.jaspi.JaspiAuthModuleType addNewClientAuthModule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.jaspi.JaspiAuthModuleType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.jaspi.JaspiAuthModuleType)get_store().add_element_user(CLIENTAUTHMODULE$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "clientAuthModule" element
     */
    public void removeClientAuthModule(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CLIENTAUTHMODULE$6, i);
        }
    }
}
