/*
 * XML Type:  authModuleType
 * Namespace: http://geronimo.apache.org/xml/ns/geronimo-jaspi
 * Java type: org.apache.geronimo.xbeans.geronimo.jaspi.JaspiAuthModuleType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.geronimo.jaspi.impl;
/**
 * An XML authModuleType(@http://geronimo.apache.org/xml/ns/geronimo-jaspi).
 *
 * This is a complex type.
 */
public class JaspiAuthModuleTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.xbeans.geronimo.jaspi.JaspiAuthModuleType
{
    private static final long serialVersionUID = 1L;
    
    public JaspiAuthModuleTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CLASSNAME$0 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/geronimo-jaspi", "className");
    private static final javax.xml.namespace.QName CLASSLOADERNAME$2 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/geronimo-jaspi", "classLoaderName");
    private static final javax.xml.namespace.QName REQUESTPOLICY$4 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/geronimo-jaspi", "requestPolicy");
    private static final javax.xml.namespace.QName RESPONSEPOLICY$6 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/geronimo-jaspi", "responsePolicy");
    private static final javax.xml.namespace.QName OPTIONS$8 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/geronimo-jaspi", "options");
    
    
    /**
     * Gets the "className" element
     */
    public java.lang.String getClassName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLASSNAME$0, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLASSNAME$0, 0);
            return target;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLASSNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CLASSNAME$0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLASSNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CLASSNAME$0);
            }
            target.set(className);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLASSLOADERNAME$2, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLASSLOADERNAME$2, 0);
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
            return get_store().count_elements(CLASSLOADERNAME$2) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLASSLOADERNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CLASSLOADERNAME$2);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLASSLOADERNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CLASSLOADERNAME$2);
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
            get_store().remove_element(CLASSLOADERNAME$2, 0);
        }
    }
    
    /**
     * Gets the "requestPolicy" element
     */
    public org.apache.geronimo.xbeans.geronimo.jaspi.JaspiMessagePolicyType getRequestPolicy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.jaspi.JaspiMessagePolicyType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.jaspi.JaspiMessagePolicyType)get_store().find_element_user(REQUESTPOLICY$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "requestPolicy" element
     */
    public boolean isSetRequestPolicy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REQUESTPOLICY$4) != 0;
        }
    }
    
    /**
     * Sets the "requestPolicy" element
     */
    public void setRequestPolicy(org.apache.geronimo.xbeans.geronimo.jaspi.JaspiMessagePolicyType requestPolicy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.jaspi.JaspiMessagePolicyType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.jaspi.JaspiMessagePolicyType)get_store().find_element_user(REQUESTPOLICY$4, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.xbeans.geronimo.jaspi.JaspiMessagePolicyType)get_store().add_element_user(REQUESTPOLICY$4);
            }
            target.set(requestPolicy);
        }
    }
    
    /**
     * Appends and returns a new empty "requestPolicy" element
     */
    public org.apache.geronimo.xbeans.geronimo.jaspi.JaspiMessagePolicyType addNewRequestPolicy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.jaspi.JaspiMessagePolicyType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.jaspi.JaspiMessagePolicyType)get_store().add_element_user(REQUESTPOLICY$4);
            return target;
        }
    }
    
    /**
     * Unsets the "requestPolicy" element
     */
    public void unsetRequestPolicy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REQUESTPOLICY$4, 0);
        }
    }
    
    /**
     * Gets the "responsePolicy" element
     */
    public org.apache.geronimo.xbeans.geronimo.jaspi.JaspiMessagePolicyType getResponsePolicy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.jaspi.JaspiMessagePolicyType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.jaspi.JaspiMessagePolicyType)get_store().find_element_user(RESPONSEPOLICY$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "responsePolicy" element
     */
    public boolean isSetResponsePolicy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESPONSEPOLICY$6) != 0;
        }
    }
    
    /**
     * Sets the "responsePolicy" element
     */
    public void setResponsePolicy(org.apache.geronimo.xbeans.geronimo.jaspi.JaspiMessagePolicyType responsePolicy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.jaspi.JaspiMessagePolicyType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.jaspi.JaspiMessagePolicyType)get_store().find_element_user(RESPONSEPOLICY$6, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.xbeans.geronimo.jaspi.JaspiMessagePolicyType)get_store().add_element_user(RESPONSEPOLICY$6);
            }
            target.set(responsePolicy);
        }
    }
    
    /**
     * Appends and returns a new empty "responsePolicy" element
     */
    public org.apache.geronimo.xbeans.geronimo.jaspi.JaspiMessagePolicyType addNewResponsePolicy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.jaspi.JaspiMessagePolicyType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.jaspi.JaspiMessagePolicyType)get_store().add_element_user(RESPONSEPOLICY$6);
            return target;
        }
    }
    
    /**
     * Unsets the "responsePolicy" element
     */
    public void unsetResponsePolicy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESPONSEPOLICY$6, 0);
        }
    }
    
    /**
     * Gets the "options" element
     */
    public java.lang.String getOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPTIONS$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "options" element
     */
    public org.apache.xmlbeans.XmlString xgetOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OPTIONS$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "options" element
     */
    public boolean isSetOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OPTIONS$8) != 0;
        }
    }
    
    /**
     * Sets the "options" element
     */
    public void setOptions(java.lang.String options)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPTIONS$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OPTIONS$8);
            }
            target.setStringValue(options);
        }
    }
    
    /**
     * Sets (as xml) the "options" element
     */
    public void xsetOptions(org.apache.xmlbeans.XmlString options)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OPTIONS$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OPTIONS$8);
            }
            target.set(options);
        }
    }
    
    /**
     * Unsets the "options" element
     */
    public void unsetOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OPTIONS$8, 0);
        }
    }
}
