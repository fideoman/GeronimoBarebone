/*
 * XML Type:  login-moduleType
 * Namespace: http://geronimo.apache.org/xml/ns/loginconfig-2.0
 * Java type: org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginModuleType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.geronimo.loginconfig.impl;
/**
 * An XML login-moduleType(@http://geronimo.apache.org/xml/ns/loginconfig-2.0).
 *
 * This is a complex type.
 */
public class GerLoginModuleTypeImpl extends org.apache.geronimo.xbeans.geronimo.loginconfig.impl.GerAbstractLoginModuleTypeImpl implements org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginModuleType
{
    private static final long serialVersionUID = 1L;
    
    public GerLoginModuleTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOGINDOMAINNAME$0 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/loginconfig-2.0", "login-domain-name");
    private static final javax.xml.namespace.QName LOGINMODULECLASS$2 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/loginconfig-2.0", "login-module-class");
    private static final javax.xml.namespace.QName OPTION$4 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/loginconfig-2.0", "option");
    private static final javax.xml.namespace.QName XMLOPTION$6 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/loginconfig-2.0", "xml-option");
    
    
    /**
     * Gets the "login-domain-name" element
     */
    public java.lang.String getLoginDomainName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOGINDOMAINNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "login-domain-name" element
     */
    public org.apache.xmlbeans.XmlString xgetLoginDomainName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOGINDOMAINNAME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "login-domain-name" element
     */
    public void setLoginDomainName(java.lang.String loginDomainName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOGINDOMAINNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOGINDOMAINNAME$0);
            }
            target.setStringValue(loginDomainName);
        }
    }
    
    /**
     * Sets (as xml) the "login-domain-name" element
     */
    public void xsetLoginDomainName(org.apache.xmlbeans.XmlString loginDomainName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOGINDOMAINNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LOGINDOMAINNAME$0);
            }
            target.set(loginDomainName);
        }
    }
    
    /**
     * Gets the "login-module-class" element
     */
    public java.lang.String getLoginModuleClass()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOGINMODULECLASS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "login-module-class" element
     */
    public org.apache.xmlbeans.XmlString xgetLoginModuleClass()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOGINMODULECLASS$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "login-module-class" element
     */
    public void setLoginModuleClass(java.lang.String loginModuleClass)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOGINMODULECLASS$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOGINMODULECLASS$2);
            }
            target.setStringValue(loginModuleClass);
        }
    }
    
    /**
     * Sets (as xml) the "login-module-class" element
     */
    public void xsetLoginModuleClass(org.apache.xmlbeans.XmlString loginModuleClass)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOGINMODULECLASS$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LOGINMODULECLASS$2);
            }
            target.set(loginModuleClass);
        }
    }
    
    /**
     * Gets array of all "option" elements
     */
    public org.apache.geronimo.xbeans.geronimo.loginconfig.GerOptionType[] getOptionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(OPTION$4, targetList);
            org.apache.geronimo.xbeans.geronimo.loginconfig.GerOptionType[] result = new org.apache.geronimo.xbeans.geronimo.loginconfig.GerOptionType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "option" element
     */
    public org.apache.geronimo.xbeans.geronimo.loginconfig.GerOptionType getOptionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.loginconfig.GerOptionType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.loginconfig.GerOptionType)get_store().find_element_user(OPTION$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "option" element
     */
    public int sizeOfOptionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OPTION$4);
        }
    }
    
    /**
     * Sets array of all "option" element
     */
    public void setOptionArray(org.apache.geronimo.xbeans.geronimo.loginconfig.GerOptionType[] optionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(optionArray, OPTION$4);
        }
    }
    
    /**
     * Sets ith "option" element
     */
    public void setOptionArray(int i, org.apache.geronimo.xbeans.geronimo.loginconfig.GerOptionType option)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.loginconfig.GerOptionType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.loginconfig.GerOptionType)get_store().find_element_user(OPTION$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(option);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "option" element
     */
    public org.apache.geronimo.xbeans.geronimo.loginconfig.GerOptionType insertNewOption(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.loginconfig.GerOptionType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.loginconfig.GerOptionType)get_store().insert_element_user(OPTION$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "option" element
     */
    public org.apache.geronimo.xbeans.geronimo.loginconfig.GerOptionType addNewOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.loginconfig.GerOptionType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.loginconfig.GerOptionType)get_store().add_element_user(OPTION$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "option" element
     */
    public void removeOption(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OPTION$4, i);
        }
    }
    
    /**
     * Gets array of all "xml-option" elements
     */
    public org.apache.geronimo.deployment.xbeans.XmlAttributeType[] getXmlOptionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(XMLOPTION$6, targetList);
            org.apache.geronimo.deployment.xbeans.XmlAttributeType[] result = new org.apache.geronimo.deployment.xbeans.XmlAttributeType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "xml-option" element
     */
    public org.apache.geronimo.deployment.xbeans.XmlAttributeType getXmlOptionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.xbeans.XmlAttributeType target = null;
            target = (org.apache.geronimo.deployment.xbeans.XmlAttributeType)get_store().find_element_user(XMLOPTION$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "xml-option" element
     */
    public int sizeOfXmlOptionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(XMLOPTION$6);
        }
    }
    
    /**
     * Sets array of all "xml-option" element
     */
    public void setXmlOptionArray(org.apache.geronimo.deployment.xbeans.XmlAttributeType[] xmlOptionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(xmlOptionArray, XMLOPTION$6);
        }
    }
    
    /**
     * Sets ith "xml-option" element
     */
    public void setXmlOptionArray(int i, org.apache.geronimo.deployment.xbeans.XmlAttributeType xmlOption)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.xbeans.XmlAttributeType target = null;
            target = (org.apache.geronimo.deployment.xbeans.XmlAttributeType)get_store().find_element_user(XMLOPTION$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(xmlOption);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "xml-option" element
     */
    public org.apache.geronimo.deployment.xbeans.XmlAttributeType insertNewXmlOption(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.xbeans.XmlAttributeType target = null;
            target = (org.apache.geronimo.deployment.xbeans.XmlAttributeType)get_store().insert_element_user(XMLOPTION$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "xml-option" element
     */
    public org.apache.geronimo.deployment.xbeans.XmlAttributeType addNewXmlOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.xbeans.XmlAttributeType target = null;
            target = (org.apache.geronimo.deployment.xbeans.XmlAttributeType)get_store().add_element_user(XMLOPTION$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "xml-option" element
     */
    public void removeXmlOption(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(XMLOPTION$6, i);
        }
    }
}
