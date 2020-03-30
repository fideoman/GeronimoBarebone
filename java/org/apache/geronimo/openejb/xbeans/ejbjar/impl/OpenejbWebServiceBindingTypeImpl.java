/*
 * XML Type:  web-service-bindingType
 * Namespace: http://geronimo.apache.org/xml/ns/j2ee/ejb/openejb-2.0
 * Java type: org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbWebServiceBindingType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.openejb.xbeans.ejbjar.impl;
/**
 * An XML web-service-bindingType(@http://geronimo.apache.org/xml/ns/j2ee/ejb/openejb-2.0).
 *
 * This is a complex type.
 */
public class OpenejbWebServiceBindingTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbWebServiceBindingType
{
    private static final long serialVersionUID = 1L;
    
    public OpenejbWebServiceBindingTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EJBNAME$0 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/j2ee/ejb/openejb-2.0", "ejb-name");
    private static final javax.xml.namespace.QName WEBSERVICEADDRESS$2 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/j2ee/ejb/openejb-2.0", "web-service-address");
    private static final javax.xml.namespace.QName WEBSERVICEVIRTUALHOST$4 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/j2ee/ejb/openejb-2.0", "web-service-virtual-host");
    private static final javax.xml.namespace.QName WEBSERVICESECURITY$6 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/j2ee/ejb/openejb-2.0", "web-service-security");
    
    
    /**
     * Gets the "ejb-name" element
     */
    public java.lang.String getEjbName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EJBNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ejb-name" element
     */
    public org.apache.xmlbeans.XmlString xgetEjbName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EJBNAME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ejb-name" element
     */
    public void setEjbName(java.lang.String ejbName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EJBNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EJBNAME$0);
            }
            target.setStringValue(ejbName);
        }
    }
    
    /**
     * Sets (as xml) the "ejb-name" element
     */
    public void xsetEjbName(org.apache.xmlbeans.XmlString ejbName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EJBNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EJBNAME$0);
            }
            target.set(ejbName);
        }
    }
    
    /**
     * Gets the "web-service-address" element
     */
    public java.lang.String getWebServiceAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WEBSERVICEADDRESS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "web-service-address" element
     */
    public org.apache.xmlbeans.XmlString xgetWebServiceAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WEBSERVICEADDRESS$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "web-service-address" element
     */
    public boolean isSetWebServiceAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WEBSERVICEADDRESS$2) != 0;
        }
    }
    
    /**
     * Sets the "web-service-address" element
     */
    public void setWebServiceAddress(java.lang.String webServiceAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WEBSERVICEADDRESS$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WEBSERVICEADDRESS$2);
            }
            target.setStringValue(webServiceAddress);
        }
    }
    
    /**
     * Sets (as xml) the "web-service-address" element
     */
    public void xsetWebServiceAddress(org.apache.xmlbeans.XmlString webServiceAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WEBSERVICEADDRESS$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(WEBSERVICEADDRESS$2);
            }
            target.set(webServiceAddress);
        }
    }
    
    /**
     * Unsets the "web-service-address" element
     */
    public void unsetWebServiceAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WEBSERVICEADDRESS$2, 0);
        }
    }
    
    /**
     * Gets array of all "web-service-virtual-host" elements
     */
    public java.lang.String[] getWebServiceVirtualHostArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(WEBSERVICEVIRTUALHOST$4, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "web-service-virtual-host" element
     */
    public java.lang.String getWebServiceVirtualHostArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WEBSERVICEVIRTUALHOST$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "web-service-virtual-host" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetWebServiceVirtualHostArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(WEBSERVICEVIRTUALHOST$4, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "web-service-virtual-host" element
     */
    public org.apache.xmlbeans.XmlString xgetWebServiceVirtualHostArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WEBSERVICEVIRTUALHOST$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "web-service-virtual-host" element
     */
    public int sizeOfWebServiceVirtualHostArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WEBSERVICEVIRTUALHOST$4);
        }
    }
    
    /**
     * Sets array of all "web-service-virtual-host" element
     */
    public void setWebServiceVirtualHostArray(java.lang.String[] webServiceVirtualHostArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(webServiceVirtualHostArray, WEBSERVICEVIRTUALHOST$4);
        }
    }
    
    /**
     * Sets ith "web-service-virtual-host" element
     */
    public void setWebServiceVirtualHostArray(int i, java.lang.String webServiceVirtualHost)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WEBSERVICEVIRTUALHOST$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(webServiceVirtualHost);
        }
    }
    
    /**
     * Sets (as xml) array of all "web-service-virtual-host" element
     */
    public void xsetWebServiceVirtualHostArray(org.apache.xmlbeans.XmlString[]webServiceVirtualHostArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(webServiceVirtualHostArray, WEBSERVICEVIRTUALHOST$4);
        }
    }
    
    /**
     * Sets (as xml) ith "web-service-virtual-host" element
     */
    public void xsetWebServiceVirtualHostArray(int i, org.apache.xmlbeans.XmlString webServiceVirtualHost)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WEBSERVICEVIRTUALHOST$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(webServiceVirtualHost);
        }
    }
    
    /**
     * Inserts the value as the ith "web-service-virtual-host" element
     */
    public void insertWebServiceVirtualHost(int i, java.lang.String webServiceVirtualHost)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(WEBSERVICEVIRTUALHOST$4, i);
            target.setStringValue(webServiceVirtualHost);
        }
    }
    
    /**
     * Appends the value as the last "web-service-virtual-host" element
     */
    public void addWebServiceVirtualHost(java.lang.String webServiceVirtualHost)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WEBSERVICEVIRTUALHOST$4);
            target.setStringValue(webServiceVirtualHost);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "web-service-virtual-host" element
     */
    public org.apache.xmlbeans.XmlString insertNewWebServiceVirtualHost(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(WEBSERVICEVIRTUALHOST$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "web-service-virtual-host" element
     */
    public org.apache.xmlbeans.XmlString addNewWebServiceVirtualHost()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(WEBSERVICEVIRTUALHOST$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "web-service-virtual-host" element
     */
    public void removeWebServiceVirtualHost(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WEBSERVICEVIRTUALHOST$4, i);
        }
    }
    
    /**
     * Gets the "web-service-security" element
     */
    public org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbWebServiceSecurityType getWebServiceSecurity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbWebServiceSecurityType target = null;
            target = (org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbWebServiceSecurityType)get_store().find_element_user(WEBSERVICESECURITY$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "web-service-security" element
     */
    public boolean isSetWebServiceSecurity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WEBSERVICESECURITY$6) != 0;
        }
    }
    
    /**
     * Sets the "web-service-security" element
     */
    public void setWebServiceSecurity(org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbWebServiceSecurityType webServiceSecurity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbWebServiceSecurityType target = null;
            target = (org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbWebServiceSecurityType)get_store().find_element_user(WEBSERVICESECURITY$6, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbWebServiceSecurityType)get_store().add_element_user(WEBSERVICESECURITY$6);
            }
            target.set(webServiceSecurity);
        }
    }
    
    /**
     * Appends and returns a new empty "web-service-security" element
     */
    public org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbWebServiceSecurityType addNewWebServiceSecurity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbWebServiceSecurityType target = null;
            target = (org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbWebServiceSecurityType)get_store().add_element_user(WEBSERVICESECURITY$6);
            return target;
        }
    }
    
    /**
     * Unsets the "web-service-security" element
     */
    public void unsetWebServiceSecurity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WEBSERVICESECURITY$6, 0);
        }
    }
}
