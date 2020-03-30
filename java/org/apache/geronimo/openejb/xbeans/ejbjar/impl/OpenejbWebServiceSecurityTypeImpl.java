/*
 * XML Type:  web-service-securityType
 * Namespace: http://geronimo.apache.org/xml/ns/j2ee/ejb/openejb-2.0
 * Java type: org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbWebServiceSecurityType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.openejb.xbeans.ejbjar.impl;
/**
 * An XML web-service-securityType(@http://geronimo.apache.org/xml/ns/j2ee/ejb/openejb-2.0).
 *
 * This is a complex type.
 */
public class OpenejbWebServiceSecurityTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbWebServiceSecurityType
{
    private static final long serialVersionUID = 1L;
    
    public OpenejbWebServiceSecurityTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SECURITYREALMNAME$0 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/j2ee/ejb/openejb-2.0", "security-realm-name");
    private static final javax.xml.namespace.QName REALMNAME$2 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/j2ee/ejb/openejb-2.0", "realm-name");
    private static final javax.xml.namespace.QName TRANSPORTGUARANTEE$4 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/j2ee/ejb/openejb-2.0", "transport-guarantee");
    private static final javax.xml.namespace.QName AUTHMETHOD$6 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/j2ee/ejb/openejb-2.0", "auth-method");
    private static final javax.xml.namespace.QName HTTPMETHOD$8 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/j2ee/ejb/openejb-2.0", "http-method");
    
    
    /**
     * Gets the "security-realm-name" element
     */
    public java.lang.String getSecurityRealmName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SECURITYREALMNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "security-realm-name" element
     */
    public org.apache.xmlbeans.XmlString xgetSecurityRealmName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SECURITYREALMNAME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "security-realm-name" element
     */
    public void setSecurityRealmName(java.lang.String securityRealmName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SECURITYREALMNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SECURITYREALMNAME$0);
            }
            target.setStringValue(securityRealmName);
        }
    }
    
    /**
     * Sets (as xml) the "security-realm-name" element
     */
    public void xsetSecurityRealmName(org.apache.xmlbeans.XmlString securityRealmName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SECURITYREALMNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SECURITYREALMNAME$0);
            }
            target.set(securityRealmName);
        }
    }
    
    /**
     * Gets the "realm-name" element
     */
    public java.lang.String getRealmName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REALMNAME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "realm-name" element
     */
    public org.apache.xmlbeans.XmlString xgetRealmName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REALMNAME$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "realm-name" element
     */
    public boolean isSetRealmName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REALMNAME$2) != 0;
        }
    }
    
    /**
     * Sets the "realm-name" element
     */
    public void setRealmName(java.lang.String realmName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REALMNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REALMNAME$2);
            }
            target.setStringValue(realmName);
        }
    }
    
    /**
     * Sets (as xml) the "realm-name" element
     */
    public void xsetRealmName(org.apache.xmlbeans.XmlString realmName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REALMNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REALMNAME$2);
            }
            target.set(realmName);
        }
    }
    
    /**
     * Unsets the "realm-name" element
     */
    public void unsetRealmName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REALMNAME$2, 0);
        }
    }
    
    /**
     * Gets the "transport-guarantee" element
     */
    public org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbTransportGuaranteeType.Enum getTransportGuarantee()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRANSPORTGUARANTEE$4, 0);
            if (target == null)
            {
                return null;
            }
            return (org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbTransportGuaranteeType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "transport-guarantee" element
     */
    public org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbTransportGuaranteeType xgetTransportGuarantee()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbTransportGuaranteeType target = null;
            target = (org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbTransportGuaranteeType)get_store().find_element_user(TRANSPORTGUARANTEE$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "transport-guarantee" element
     */
    public void setTransportGuarantee(org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbTransportGuaranteeType.Enum transportGuarantee)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRANSPORTGUARANTEE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TRANSPORTGUARANTEE$4);
            }
            target.setEnumValue(transportGuarantee);
        }
    }
    
    /**
     * Sets (as xml) the "transport-guarantee" element
     */
    public void xsetTransportGuarantee(org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbTransportGuaranteeType transportGuarantee)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbTransportGuaranteeType target = null;
            target = (org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbTransportGuaranteeType)get_store().find_element_user(TRANSPORTGUARANTEE$4, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbTransportGuaranteeType)get_store().add_element_user(TRANSPORTGUARANTEE$4);
            }
            target.set(transportGuarantee);
        }
    }
    
    /**
     * Gets the "auth-method" element
     */
    public org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbAuthMethodType.Enum getAuthMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTHMETHOD$6, 0);
            if (target == null)
            {
                return null;
            }
            return (org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbAuthMethodType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "auth-method" element
     */
    public org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbAuthMethodType xgetAuthMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbAuthMethodType target = null;
            target = (org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbAuthMethodType)get_store().find_element_user(AUTHMETHOD$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "auth-method" element
     */
    public void setAuthMethod(org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbAuthMethodType.Enum authMethod)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTHMETHOD$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AUTHMETHOD$6);
            }
            target.setEnumValue(authMethod);
        }
    }
    
    /**
     * Sets (as xml) the "auth-method" element
     */
    public void xsetAuthMethod(org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbAuthMethodType authMethod)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbAuthMethodType target = null;
            target = (org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbAuthMethodType)get_store().find_element_user(AUTHMETHOD$6, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbAuthMethodType)get_store().add_element_user(AUTHMETHOD$6);
            }
            target.set(authMethod);
        }
    }
    
    /**
     * Gets array of all "http-method" elements
     */
    public java.lang.String[] getHttpMethodArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(HTTPMETHOD$8, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "http-method" element
     */
    public java.lang.String getHttpMethodArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HTTPMETHOD$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "http-method" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetHttpMethodArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(HTTPMETHOD$8, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "http-method" element
     */
    public org.apache.xmlbeans.XmlString xgetHttpMethodArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HTTPMETHOD$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "http-method" element
     */
    public int sizeOfHttpMethodArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HTTPMETHOD$8);
        }
    }
    
    /**
     * Sets array of all "http-method" element
     */
    public void setHttpMethodArray(java.lang.String[] httpMethodArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(httpMethodArray, HTTPMETHOD$8);
        }
    }
    
    /**
     * Sets ith "http-method" element
     */
    public void setHttpMethodArray(int i, java.lang.String httpMethod)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HTTPMETHOD$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(httpMethod);
        }
    }
    
    /**
     * Sets (as xml) array of all "http-method" element
     */
    public void xsetHttpMethodArray(org.apache.xmlbeans.XmlString[]httpMethodArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(httpMethodArray, HTTPMETHOD$8);
        }
    }
    
    /**
     * Sets (as xml) ith "http-method" element
     */
    public void xsetHttpMethodArray(int i, org.apache.xmlbeans.XmlString httpMethod)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HTTPMETHOD$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(httpMethod);
        }
    }
    
    /**
     * Inserts the value as the ith "http-method" element
     */
    public void insertHttpMethod(int i, java.lang.String httpMethod)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(HTTPMETHOD$8, i);
            target.setStringValue(httpMethod);
        }
    }
    
    /**
     * Appends the value as the last "http-method" element
     */
    public void addHttpMethod(java.lang.String httpMethod)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HTTPMETHOD$8);
            target.setStringValue(httpMethod);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "http-method" element
     */
    public org.apache.xmlbeans.XmlString insertNewHttpMethod(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(HTTPMETHOD$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "http-method" element
     */
    public org.apache.xmlbeans.XmlString addNewHttpMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(HTTPMETHOD$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "http-method" element
     */
    public void removeHttpMethod(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HTTPMETHOD$8, i);
        }
    }
}
