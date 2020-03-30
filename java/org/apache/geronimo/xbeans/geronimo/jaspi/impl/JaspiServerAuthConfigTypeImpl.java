/*
 * XML Type:  serverAuthConfigType
 * Namespace: http://geronimo.apache.org/xml/ns/geronimo-jaspi
 * Java type: org.apache.geronimo.xbeans.geronimo.jaspi.JaspiServerAuthConfigType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.geronimo.jaspi.impl;
/**
 * An XML serverAuthConfigType(@http://geronimo.apache.org/xml/ns/geronimo-jaspi).
 *
 * This is a complex type.
 */
public class JaspiServerAuthConfigTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.xbeans.geronimo.jaspi.JaspiServerAuthConfigType
{
    private static final long serialVersionUID = 1L;
    
    public JaspiServerAuthConfigTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MESSAGELAYER$0 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/geronimo-jaspi", "messageLayer");
    private static final javax.xml.namespace.QName APPCONTEXT$2 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/geronimo-jaspi", "appContext");
    private static final javax.xml.namespace.QName AUTHENTICATIONCONTEXTID$4 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/geronimo-jaspi", "authenticationContextID");
    private static final javax.xml.namespace.QName PROTECTED$6 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/geronimo-jaspi", "protected");
    private static final javax.xml.namespace.QName SERVERAUTHCONTEXT$8 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/geronimo-jaspi", "serverAuthContext");
    
    
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
     * Gets the "protected" element
     */
    public boolean getProtected()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROTECTED$6, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "protected" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetProtected()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PROTECTED$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "protected" element
     */
    public void setProtected(boolean xprotected)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROTECTED$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROTECTED$6);
            }
            target.setBooleanValue(xprotected);
        }
    }
    
    /**
     * Sets (as xml) the "protected" element
     */
    public void xsetProtected(org.apache.xmlbeans.XmlBoolean xprotected)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PROTECTED$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(PROTECTED$6);
            }
            target.set(xprotected);
        }
    }
    
    /**
     * Gets array of all "serverAuthContext" elements
     */
    public org.apache.geronimo.xbeans.geronimo.jaspi.JaspiServerAuthContextType[] getServerAuthContextArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SERVERAUTHCONTEXT$8, targetList);
            org.apache.geronimo.xbeans.geronimo.jaspi.JaspiServerAuthContextType[] result = new org.apache.geronimo.xbeans.geronimo.jaspi.JaspiServerAuthContextType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "serverAuthContext" element
     */
    public org.apache.geronimo.xbeans.geronimo.jaspi.JaspiServerAuthContextType getServerAuthContextArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.jaspi.JaspiServerAuthContextType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.jaspi.JaspiServerAuthContextType)get_store().find_element_user(SERVERAUTHCONTEXT$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "serverAuthContext" element
     */
    public int sizeOfServerAuthContextArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SERVERAUTHCONTEXT$8);
        }
    }
    
    /**
     * Sets array of all "serverAuthContext" element
     */
    public void setServerAuthContextArray(org.apache.geronimo.xbeans.geronimo.jaspi.JaspiServerAuthContextType[] serverAuthContextArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(serverAuthContextArray, SERVERAUTHCONTEXT$8);
        }
    }
    
    /**
     * Sets ith "serverAuthContext" element
     */
    public void setServerAuthContextArray(int i, org.apache.geronimo.xbeans.geronimo.jaspi.JaspiServerAuthContextType serverAuthContext)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.jaspi.JaspiServerAuthContextType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.jaspi.JaspiServerAuthContextType)get_store().find_element_user(SERVERAUTHCONTEXT$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(serverAuthContext);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "serverAuthContext" element
     */
    public org.apache.geronimo.xbeans.geronimo.jaspi.JaspiServerAuthContextType insertNewServerAuthContext(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.jaspi.JaspiServerAuthContextType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.jaspi.JaspiServerAuthContextType)get_store().insert_element_user(SERVERAUTHCONTEXT$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "serverAuthContext" element
     */
    public org.apache.geronimo.xbeans.geronimo.jaspi.JaspiServerAuthContextType addNewServerAuthContext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.jaspi.JaspiServerAuthContextType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.jaspi.JaspiServerAuthContextType)get_store().add_element_user(SERVERAUTHCONTEXT$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "serverAuthContext" element
     */
    public void removeServerAuthContext(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SERVERAUTHCONTEXT$8, i);
        }
    }
}
