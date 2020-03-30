/*
 * XML Type:  securityType
 * Namespace: http://geronimo.apache.org/xml/ns/security-1.2
 * Java type: org.apache.geronimo.xml.ns.security12.SecurityType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xml.ns.security12.impl;
/**
 * An XML securityType(@http://geronimo.apache.org/xml/ns/security-1.2).
 *
 * This is a complex type.
 */
public class SecurityTypeImpl extends org.apache.geronimo.xbeans.geronimo.j2ee.impl.GerAbstractSecurityTypeImpl implements org.apache.geronimo.xml.ns.security12.SecurityType
{
    private static final long serialVersionUID = 1L;
    
    public SecurityTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DESCRIPTION$0 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/security-1.2", "description");
    private static final javax.xml.namespace.QName DEFAULTPRINCIPAL$2 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/security-1.2", "default-principal");
    private static final javax.xml.namespace.QName ROLEMAPPINGS$4 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/security-1.2", "role-mappings");
    private static final javax.xml.namespace.QName DOASCURRENTCALLER$6 = 
        new javax.xml.namespace.QName("", "doas-current-caller");
    private static final javax.xml.namespace.QName USECONTEXTHANDLER$8 = 
        new javax.xml.namespace.QName("", "use-context-handler");
    private static final javax.xml.namespace.QName DEFAULTROLE$10 = 
        new javax.xml.namespace.QName("", "default-role");
    
    
    /**
     * Gets array of all "description" elements
     */
    public org.apache.geronimo.xml.ns.security12.DescriptionType[] getDescriptionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DESCRIPTION$0, targetList);
            org.apache.geronimo.xml.ns.security12.DescriptionType[] result = new org.apache.geronimo.xml.ns.security12.DescriptionType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "description" element
     */
    public org.apache.geronimo.xml.ns.security12.DescriptionType getDescriptionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xml.ns.security12.DescriptionType target = null;
            target = (org.apache.geronimo.xml.ns.security12.DescriptionType)get_store().find_element_user(DESCRIPTION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "description" element
     */
    public int sizeOfDescriptionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DESCRIPTION$0);
        }
    }
    
    /**
     * Sets array of all "description" element
     */
    public void setDescriptionArray(org.apache.geronimo.xml.ns.security12.DescriptionType[] descriptionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(descriptionArray, DESCRIPTION$0);
        }
    }
    
    /**
     * Sets ith "description" element
     */
    public void setDescriptionArray(int i, org.apache.geronimo.xml.ns.security12.DescriptionType description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xml.ns.security12.DescriptionType target = null;
            target = (org.apache.geronimo.xml.ns.security12.DescriptionType)get_store().find_element_user(DESCRIPTION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(description);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "description" element
     */
    public org.apache.geronimo.xml.ns.security12.DescriptionType insertNewDescription(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xml.ns.security12.DescriptionType target = null;
            target = (org.apache.geronimo.xml.ns.security12.DescriptionType)get_store().insert_element_user(DESCRIPTION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "description" element
     */
    public org.apache.geronimo.xml.ns.security12.DescriptionType addNewDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xml.ns.security12.DescriptionType target = null;
            target = (org.apache.geronimo.xml.ns.security12.DescriptionType)get_store().add_element_user(DESCRIPTION$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "description" element
     */
    public void removeDescription(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DESCRIPTION$0, i);
        }
    }
    
    /**
     * Gets the "default-principal" element
     */
    public org.apache.geronimo.xml.ns.security12.DefaultPrincipalType getDefaultPrincipal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xml.ns.security12.DefaultPrincipalType target = null;
            target = (org.apache.geronimo.xml.ns.security12.DefaultPrincipalType)get_store().find_element_user(DEFAULTPRINCIPAL$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "default-principal" element
     */
    public void setDefaultPrincipal(org.apache.geronimo.xml.ns.security12.DefaultPrincipalType defaultPrincipal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xml.ns.security12.DefaultPrincipalType target = null;
            target = (org.apache.geronimo.xml.ns.security12.DefaultPrincipalType)get_store().find_element_user(DEFAULTPRINCIPAL$2, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.xml.ns.security12.DefaultPrincipalType)get_store().add_element_user(DEFAULTPRINCIPAL$2);
            }
            target.set(defaultPrincipal);
        }
    }
    
    /**
     * Appends and returns a new empty "default-principal" element
     */
    public org.apache.geronimo.xml.ns.security12.DefaultPrincipalType addNewDefaultPrincipal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xml.ns.security12.DefaultPrincipalType target = null;
            target = (org.apache.geronimo.xml.ns.security12.DefaultPrincipalType)get_store().add_element_user(DEFAULTPRINCIPAL$2);
            return target;
        }
    }
    
    /**
     * Gets the "role-mappings" element
     */
    public org.apache.geronimo.xml.ns.security12.RoleMappingsType getRoleMappings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xml.ns.security12.RoleMappingsType target = null;
            target = (org.apache.geronimo.xml.ns.security12.RoleMappingsType)get_store().find_element_user(ROLEMAPPINGS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "role-mappings" element
     */
    public boolean isSetRoleMappings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ROLEMAPPINGS$4) != 0;
        }
    }
    
    /**
     * Sets the "role-mappings" element
     */
    public void setRoleMappings(org.apache.geronimo.xml.ns.security12.RoleMappingsType roleMappings)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xml.ns.security12.RoleMappingsType target = null;
            target = (org.apache.geronimo.xml.ns.security12.RoleMappingsType)get_store().find_element_user(ROLEMAPPINGS$4, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.xml.ns.security12.RoleMappingsType)get_store().add_element_user(ROLEMAPPINGS$4);
            }
            target.set(roleMappings);
        }
    }
    
    /**
     * Appends and returns a new empty "role-mappings" element
     */
    public org.apache.geronimo.xml.ns.security12.RoleMappingsType addNewRoleMappings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xml.ns.security12.RoleMappingsType target = null;
            target = (org.apache.geronimo.xml.ns.security12.RoleMappingsType)get_store().add_element_user(ROLEMAPPINGS$4);
            return target;
        }
    }
    
    /**
     * Unsets the "role-mappings" element
     */
    public void unsetRoleMappings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ROLEMAPPINGS$4, 0);
        }
    }
    
    /**
     * Gets the "doas-current-caller" attribute
     */
    public boolean getDoasCurrentCaller()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DOASCURRENTCALLER$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(DOASCURRENTCALLER$6);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "doas-current-caller" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetDoasCurrentCaller()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DOASCURRENTCALLER$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(DOASCURRENTCALLER$6);
            }
            return target;
        }
    }
    
    /**
     * True if has "doas-current-caller" attribute
     */
    public boolean isSetDoasCurrentCaller()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DOASCURRENTCALLER$6) != null;
        }
    }
    
    /**
     * Sets the "doas-current-caller" attribute
     */
    public void setDoasCurrentCaller(boolean doasCurrentCaller)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DOASCURRENTCALLER$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DOASCURRENTCALLER$6);
            }
            target.setBooleanValue(doasCurrentCaller);
        }
    }
    
    /**
     * Sets (as xml) the "doas-current-caller" attribute
     */
    public void xsetDoasCurrentCaller(org.apache.xmlbeans.XmlBoolean doasCurrentCaller)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DOASCURRENTCALLER$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(DOASCURRENTCALLER$6);
            }
            target.set(doasCurrentCaller);
        }
    }
    
    /**
     * Unsets the "doas-current-caller" attribute
     */
    public void unsetDoasCurrentCaller()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DOASCURRENTCALLER$6);
        }
    }
    
    /**
     * Gets the "use-context-handler" attribute
     */
    public boolean getUseContextHandler()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USECONTEXTHANDLER$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(USECONTEXTHANDLER$8);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "use-context-handler" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetUseContextHandler()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(USECONTEXTHANDLER$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(USECONTEXTHANDLER$8);
            }
            return target;
        }
    }
    
    /**
     * True if has "use-context-handler" attribute
     */
    public boolean isSetUseContextHandler()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(USECONTEXTHANDLER$8) != null;
        }
    }
    
    /**
     * Sets the "use-context-handler" attribute
     */
    public void setUseContextHandler(boolean useContextHandler)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USECONTEXTHANDLER$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(USECONTEXTHANDLER$8);
            }
            target.setBooleanValue(useContextHandler);
        }
    }
    
    /**
     * Sets (as xml) the "use-context-handler" attribute
     */
    public void xsetUseContextHandler(org.apache.xmlbeans.XmlBoolean useContextHandler)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(USECONTEXTHANDLER$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(USECONTEXTHANDLER$8);
            }
            target.set(useContextHandler);
        }
    }
    
    /**
     * Unsets the "use-context-handler" attribute
     */
    public void unsetUseContextHandler()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(USECONTEXTHANDLER$8);
        }
    }
    
    /**
     * Gets the "default-role" attribute
     */
    public java.lang.String getDefaultRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULTROLE$10);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "default-role" attribute
     */
    public org.apache.xmlbeans.XmlString xgetDefaultRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DEFAULTROLE$10);
            return target;
        }
    }
    
    /**
     * True if has "default-role" attribute
     */
    public boolean isSetDefaultRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DEFAULTROLE$10) != null;
        }
    }
    
    /**
     * Sets the "default-role" attribute
     */
    public void setDefaultRole(java.lang.String defaultRole)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULTROLE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEFAULTROLE$10);
            }
            target.setStringValue(defaultRole);
        }
    }
    
    /**
     * Sets (as xml) the "default-role" attribute
     */
    public void xsetDefaultRole(org.apache.xmlbeans.XmlString defaultRole)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DEFAULTROLE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DEFAULTROLE$10);
            }
            target.set(defaultRole);
        }
    }
    
    /**
     * Unsets the "default-role" attribute
     */
    public void unsetDefaultRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DEFAULTROLE$10);
        }
    }
}
