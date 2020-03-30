/*
 * XML Type:  configProviderType
 * Namespace: http://geronimo.apache.org/xml/ns/geronimo-jaspi
 * Java type: org.apache.geronimo.xbeans.geronimo.jaspi.JaspiConfigProviderType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.geronimo.jaspi.impl;
/**
 * An XML configProviderType(@http://geronimo.apache.org/xml/ns/geronimo-jaspi).
 *
 * This is a complex type.
 */
public class JaspiConfigProviderTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.xbeans.geronimo.jaspi.JaspiConfigProviderType
{
    private static final long serialVersionUID = 1L;
    
    public JaspiConfigProviderTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MESSAGELAYER$0 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/geronimo-jaspi", "messageLayer");
    private static final javax.xml.namespace.QName APPCONTEXT$2 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/geronimo-jaspi", "appContext");
    private static final javax.xml.namespace.QName DESCRIPTION$4 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/geronimo-jaspi", "description");
    private static final javax.xml.namespace.QName CLASSNAME$6 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/geronimo-jaspi", "className");
    private static final javax.xml.namespace.QName PROPERTIES$8 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/geronimo-jaspi", "properties");
    private static final javax.xml.namespace.QName CLIENTAUTHCONFIG$10 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/geronimo-jaspi", "clientAuthConfig");
    private static final javax.xml.namespace.QName SERVERAUTHCONFIG$12 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/geronimo-jaspi", "serverAuthConfig");
    private static final javax.xml.namespace.QName PERSISTENT$14 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/geronimo-jaspi", "persistent");
    private static final javax.xml.namespace.QName CLASSLOADERNAME$16 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/geronimo-jaspi", "classLoaderName");
    
    
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
     * Gets the "description" element
     */
    public java.lang.String getDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "description" element
     */
    public org.apache.xmlbeans.XmlString xgetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "description" element
     */
    public boolean isSetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DESCRIPTION$4) != 0;
        }
    }
    
    /**
     * Sets the "description" element
     */
    public void setDescription(java.lang.String description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTION$4);
            }
            target.setStringValue(description);
        }
    }
    
    /**
     * Sets (as xml) the "description" element
     */
    public void xsetDescription(org.apache.xmlbeans.XmlString description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESCRIPTION$4);
            }
            target.set(description);
        }
    }
    
    /**
     * Unsets the "description" element
     */
    public void unsetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DESCRIPTION$4, 0);
        }
    }
    
    /**
     * Gets the "className" element
     */
    public java.lang.String getClassName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLASSNAME$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "className" element
     */
    public org.apache.xmlbeans.XmlString xgetClassName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLASSNAME$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "className" element
     */
    public boolean isSetClassName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CLASSNAME$6) != 0;
        }
    }
    
    /**
     * Sets the "className" element
     */
    public void setClassName(java.lang.String className)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLASSNAME$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CLASSNAME$6);
            }
            target.setStringValue(className);
        }
    }
    
    /**
     * Sets (as xml) the "className" element
     */
    public void xsetClassName(org.apache.xmlbeans.XmlString className)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLASSNAME$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CLASSNAME$6);
            }
            target.set(className);
        }
    }
    
    /**
     * Unsets the "className" element
     */
    public void unsetClassName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CLASSNAME$6, 0);
        }
    }
    
    /**
     * Gets the "properties" element
     */
    public java.lang.String getProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTIES$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "properties" element
     */
    public org.apache.xmlbeans.XmlString xgetProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTIES$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "properties" element
     */
    public boolean isSetProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROPERTIES$8) != 0;
        }
    }
    
    /**
     * Sets the "properties" element
     */
    public void setProperties(java.lang.String properties)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTIES$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTIES$8);
            }
            target.setStringValue(properties);
        }
    }
    
    /**
     * Sets (as xml) the "properties" element
     */
    public void xsetProperties(org.apache.xmlbeans.XmlString properties)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTIES$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROPERTIES$8);
            }
            target.set(properties);
        }
    }
    
    /**
     * Unsets the "properties" element
     */
    public void unsetProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROPERTIES$8, 0);
        }
    }
    
    /**
     * Gets array of all "clientAuthConfig" elements
     */
    public org.apache.geronimo.xbeans.geronimo.jaspi.JaspiClientAuthConfigType[] getClientAuthConfigArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CLIENTAUTHCONFIG$10, targetList);
            org.apache.geronimo.xbeans.geronimo.jaspi.JaspiClientAuthConfigType[] result = new org.apache.geronimo.xbeans.geronimo.jaspi.JaspiClientAuthConfigType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "clientAuthConfig" element
     */
    public org.apache.geronimo.xbeans.geronimo.jaspi.JaspiClientAuthConfigType getClientAuthConfigArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.jaspi.JaspiClientAuthConfigType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.jaspi.JaspiClientAuthConfigType)get_store().find_element_user(CLIENTAUTHCONFIG$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "clientAuthConfig" element
     */
    public int sizeOfClientAuthConfigArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CLIENTAUTHCONFIG$10);
        }
    }
    
    /**
     * Sets array of all "clientAuthConfig" element
     */
    public void setClientAuthConfigArray(org.apache.geronimo.xbeans.geronimo.jaspi.JaspiClientAuthConfigType[] clientAuthConfigArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(clientAuthConfigArray, CLIENTAUTHCONFIG$10);
        }
    }
    
    /**
     * Sets ith "clientAuthConfig" element
     */
    public void setClientAuthConfigArray(int i, org.apache.geronimo.xbeans.geronimo.jaspi.JaspiClientAuthConfigType clientAuthConfig)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.jaspi.JaspiClientAuthConfigType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.jaspi.JaspiClientAuthConfigType)get_store().find_element_user(CLIENTAUTHCONFIG$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(clientAuthConfig);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "clientAuthConfig" element
     */
    public org.apache.geronimo.xbeans.geronimo.jaspi.JaspiClientAuthConfigType insertNewClientAuthConfig(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.jaspi.JaspiClientAuthConfigType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.jaspi.JaspiClientAuthConfigType)get_store().insert_element_user(CLIENTAUTHCONFIG$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "clientAuthConfig" element
     */
    public org.apache.geronimo.xbeans.geronimo.jaspi.JaspiClientAuthConfigType addNewClientAuthConfig()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.jaspi.JaspiClientAuthConfigType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.jaspi.JaspiClientAuthConfigType)get_store().add_element_user(CLIENTAUTHCONFIG$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "clientAuthConfig" element
     */
    public void removeClientAuthConfig(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CLIENTAUTHCONFIG$10, i);
        }
    }
    
    /**
     * Gets array of all "serverAuthConfig" elements
     */
    public org.apache.geronimo.xbeans.geronimo.jaspi.JaspiServerAuthConfigType[] getServerAuthConfigArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SERVERAUTHCONFIG$12, targetList);
            org.apache.geronimo.xbeans.geronimo.jaspi.JaspiServerAuthConfigType[] result = new org.apache.geronimo.xbeans.geronimo.jaspi.JaspiServerAuthConfigType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "serverAuthConfig" element
     */
    public org.apache.geronimo.xbeans.geronimo.jaspi.JaspiServerAuthConfigType getServerAuthConfigArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.jaspi.JaspiServerAuthConfigType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.jaspi.JaspiServerAuthConfigType)get_store().find_element_user(SERVERAUTHCONFIG$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "serverAuthConfig" element
     */
    public int sizeOfServerAuthConfigArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SERVERAUTHCONFIG$12);
        }
    }
    
    /**
     * Sets array of all "serverAuthConfig" element
     */
    public void setServerAuthConfigArray(org.apache.geronimo.xbeans.geronimo.jaspi.JaspiServerAuthConfigType[] serverAuthConfigArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(serverAuthConfigArray, SERVERAUTHCONFIG$12);
        }
    }
    
    /**
     * Sets ith "serverAuthConfig" element
     */
    public void setServerAuthConfigArray(int i, org.apache.geronimo.xbeans.geronimo.jaspi.JaspiServerAuthConfigType serverAuthConfig)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.jaspi.JaspiServerAuthConfigType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.jaspi.JaspiServerAuthConfigType)get_store().find_element_user(SERVERAUTHCONFIG$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(serverAuthConfig);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "serverAuthConfig" element
     */
    public org.apache.geronimo.xbeans.geronimo.jaspi.JaspiServerAuthConfigType insertNewServerAuthConfig(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.jaspi.JaspiServerAuthConfigType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.jaspi.JaspiServerAuthConfigType)get_store().insert_element_user(SERVERAUTHCONFIG$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "serverAuthConfig" element
     */
    public org.apache.geronimo.xbeans.geronimo.jaspi.JaspiServerAuthConfigType addNewServerAuthConfig()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.jaspi.JaspiServerAuthConfigType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.jaspi.JaspiServerAuthConfigType)get_store().add_element_user(SERVERAUTHCONFIG$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "serverAuthConfig" element
     */
    public void removeServerAuthConfig(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SERVERAUTHCONFIG$12, i);
        }
    }
    
    /**
     * Gets the "persistent" element
     */
    public boolean getPersistent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERSISTENT$14, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "persistent" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetPersistent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PERSISTENT$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "persistent" element
     */
    public boolean isSetPersistent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PERSISTENT$14) != 0;
        }
    }
    
    /**
     * Sets the "persistent" element
     */
    public void setPersistent(boolean persistent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERSISTENT$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PERSISTENT$14);
            }
            target.setBooleanValue(persistent);
        }
    }
    
    /**
     * Sets (as xml) the "persistent" element
     */
    public void xsetPersistent(org.apache.xmlbeans.XmlBoolean persistent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PERSISTENT$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(PERSISTENT$14);
            }
            target.set(persistent);
        }
    }
    
    /**
     * Unsets the "persistent" element
     */
    public void unsetPersistent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PERSISTENT$14, 0);
        }
    }
    
    /**
     * Gets the "classLoaderName" element
     */
    public java.lang.String getClassLoaderName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLASSLOADERNAME$16, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "classLoaderName" element
     */
    public org.apache.xmlbeans.XmlString xgetClassLoaderName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLASSLOADERNAME$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "classLoaderName" element
     */
    public boolean isSetClassLoaderName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CLASSLOADERNAME$16) != 0;
        }
    }
    
    /**
     * Sets the "classLoaderName" element
     */
    public void setClassLoaderName(java.lang.String classLoaderName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLASSLOADERNAME$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CLASSLOADERNAME$16);
            }
            target.setStringValue(classLoaderName);
        }
    }
    
    /**
     * Sets (as xml) the "classLoaderName" element
     */
    public void xsetClassLoaderName(org.apache.xmlbeans.XmlString classLoaderName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLASSLOADERNAME$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CLASSLOADERNAME$16);
            }
            target.set(classLoaderName);
        }
    }
    
    /**
     * Unsets the "classLoaderName" element
     */
    public void unsetClassLoaderName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CLASSLOADERNAME$16, 0);
        }
    }
}
