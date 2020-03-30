/*
 * XML Type:  jetty-configType
 * Namespace: http://geronimo.apache.org/xml/ns/web/jetty/config-1.0.1
 * Java type: org.apache.geronimo.xbeans.geronimo.web.jetty.config.GerJettyConfigType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.geronimo.web.jetty.config.impl;
/**
 * An XML jetty-configType(@http://geronimo.apache.org/xml/ns/web/jetty/config-1.0.1).
 *
 * This is a complex type.
 */
public class GerJettyConfigTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.xbeans.geronimo.web.jetty.config.GerJettyConfigType
{
    private static final long serialVersionUID = 1L;
    
    public GerJettyConfigTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HOST$0 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/web/jetty/config-1.0.1", "host");
    private static final javax.xml.namespace.QName VIRTUALHOST$2 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/web/jetty/config-1.0.1", "virtual-host");
    private static final javax.xml.namespace.QName SESSIONMANAGER$4 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/web/jetty/config-1.0.1", "session-manager");
    private static final javax.xml.namespace.QName COMPACTPATH$6 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/web/jetty/config-1.0.1", "compact-path");
    
    
    /**
     * Gets array of all "host" elements
     */
    public java.lang.String[] getHostArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(HOST$0, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "host" element
     */
    public java.lang.String getHostArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HOST$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "host" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetHostArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(HOST$0, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "host" element
     */
    public org.apache.xmlbeans.XmlString xgetHostArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HOST$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "host" element
     */
    public int sizeOfHostArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HOST$0);
        }
    }
    
    /**
     * Sets array of all "host" element
     */
    public void setHostArray(java.lang.String[] hostArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(hostArray, HOST$0);
        }
    }
    
    /**
     * Sets ith "host" element
     */
    public void setHostArray(int i, java.lang.String host)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HOST$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(host);
        }
    }
    
    /**
     * Sets (as xml) array of all "host" element
     */
    public void xsetHostArray(org.apache.xmlbeans.XmlString[]hostArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(hostArray, HOST$0);
        }
    }
    
    /**
     * Sets (as xml) ith "host" element
     */
    public void xsetHostArray(int i, org.apache.xmlbeans.XmlString host)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HOST$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(host);
        }
    }
    
    /**
     * Inserts the value as the ith "host" element
     */
    public void insertHost(int i, java.lang.String host)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(HOST$0, i);
            target.setStringValue(host);
        }
    }
    
    /**
     * Appends the value as the last "host" element
     */
    public void addHost(java.lang.String host)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HOST$0);
            target.setStringValue(host);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "host" element
     */
    public org.apache.xmlbeans.XmlString insertNewHost(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(HOST$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "host" element
     */
    public org.apache.xmlbeans.XmlString addNewHost()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(HOST$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "host" element
     */
    public void removeHost(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HOST$0, i);
        }
    }
    
    /**
     * Gets array of all "virtual-host" elements
     */
    public java.lang.String[] getVirtualHostArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(VIRTUALHOST$2, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "virtual-host" element
     */
    public java.lang.String getVirtualHostArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VIRTUALHOST$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "virtual-host" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetVirtualHostArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(VIRTUALHOST$2, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "virtual-host" element
     */
    public org.apache.xmlbeans.XmlString xgetVirtualHostArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VIRTUALHOST$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "virtual-host" element
     */
    public int sizeOfVirtualHostArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VIRTUALHOST$2);
        }
    }
    
    /**
     * Sets array of all "virtual-host" element
     */
    public void setVirtualHostArray(java.lang.String[] virtualHostArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(virtualHostArray, VIRTUALHOST$2);
        }
    }
    
    /**
     * Sets ith "virtual-host" element
     */
    public void setVirtualHostArray(int i, java.lang.String virtualHost)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VIRTUALHOST$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(virtualHost);
        }
    }
    
    /**
     * Sets (as xml) array of all "virtual-host" element
     */
    public void xsetVirtualHostArray(org.apache.xmlbeans.XmlString[]virtualHostArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(virtualHostArray, VIRTUALHOST$2);
        }
    }
    
    /**
     * Sets (as xml) ith "virtual-host" element
     */
    public void xsetVirtualHostArray(int i, org.apache.xmlbeans.XmlString virtualHost)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VIRTUALHOST$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(virtualHost);
        }
    }
    
    /**
     * Inserts the value as the ith "virtual-host" element
     */
    public void insertVirtualHost(int i, java.lang.String virtualHost)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(VIRTUALHOST$2, i);
            target.setStringValue(virtualHost);
        }
    }
    
    /**
     * Appends the value as the last "virtual-host" element
     */
    public void addVirtualHost(java.lang.String virtualHost)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VIRTUALHOST$2);
            target.setStringValue(virtualHost);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "virtual-host" element
     */
    public org.apache.xmlbeans.XmlString insertNewVirtualHost(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(VIRTUALHOST$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "virtual-host" element
     */
    public org.apache.xmlbeans.XmlString addNewVirtualHost()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VIRTUALHOST$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "virtual-host" element
     */
    public void removeVirtualHost(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VIRTUALHOST$2, i);
        }
    }
    
    /**
     * Gets the "session-manager" element
     */
    public java.lang.String getSessionManager()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SESSIONMANAGER$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "session-manager" element
     */
    public org.apache.xmlbeans.XmlString xgetSessionManager()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SESSIONMANAGER$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "session-manager" element
     */
    public boolean isSetSessionManager()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SESSIONMANAGER$4) != 0;
        }
    }
    
    /**
     * Sets the "session-manager" element
     */
    public void setSessionManager(java.lang.String sessionManager)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SESSIONMANAGER$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SESSIONMANAGER$4);
            }
            target.setStringValue(sessionManager);
        }
    }
    
    /**
     * Sets (as xml) the "session-manager" element
     */
    public void xsetSessionManager(org.apache.xmlbeans.XmlString sessionManager)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SESSIONMANAGER$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SESSIONMANAGER$4);
            }
            target.set(sessionManager);
        }
    }
    
    /**
     * Unsets the "session-manager" element
     */
    public void unsetSessionManager()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SESSIONMANAGER$4, 0);
        }
    }
    
    /**
     * Gets the "compact-path" element
     */
    public boolean getCompactPath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMPACTPATH$6, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "compact-path" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetCompactPath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(COMPACTPATH$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "compact-path" element
     */
    public boolean isSetCompactPath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMPACTPATH$6) != 0;
        }
    }
    
    /**
     * Sets the "compact-path" element
     */
    public void setCompactPath(boolean compactPath)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMPACTPATH$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COMPACTPATH$6);
            }
            target.setBooleanValue(compactPath);
        }
    }
    
    /**
     * Sets (as xml) the "compact-path" element
     */
    public void xsetCompactPath(org.apache.xmlbeans.XmlBoolean compactPath)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(COMPACTPATH$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(COMPACTPATH$6);
            }
            target.set(compactPath);
        }
    }
    
    /**
     * Unsets the "compact-path" element
     */
    public void unsetCompactPath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMPACTPATH$6, 0);
        }
    }
}
