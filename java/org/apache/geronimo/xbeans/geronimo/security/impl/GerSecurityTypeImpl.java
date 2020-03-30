/*
 * XML Type:  securityType
 * Namespace: http://geronimo.apache.org/xml/ns/security-2.0
 * Java type: org.apache.geronimo.xbeans.geronimo.security.GerSecurityType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.geronimo.security.impl;
/**
 * An XML securityType(@http://geronimo.apache.org/xml/ns/security-2.0).
 *
 * This is a complex type.
 */
public class GerSecurityTypeImpl extends org.apache.geronimo.xbeans.geronimo.j2ee.impl.GerAbstractSecurityTypeImpl implements org.apache.geronimo.xbeans.geronimo.security.GerSecurityType
{
    private static final long serialVersionUID = 1L;
    
    public GerSecurityTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DESCRIPTION$0 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/security-2.0", "description");
    private static final javax.xml.namespace.QName CREDENTIALSTOREREF$2 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/security-2.0", "credential-store-ref");
    private static final javax.xml.namespace.QName DEFAULTSUBJECT$4 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/security-2.0", "default-subject");
    private static final javax.xml.namespace.QName ROLEMAPPINGS$6 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/security-2.0", "role-mappings");
    private static final javax.xml.namespace.QName NAME$8 = 
        new javax.xml.namespace.QName("", "name");
    private static final javax.xml.namespace.QName DOASCURRENTCALLER$10 = 
        new javax.xml.namespace.QName("", "doas-current-caller");
    private static final javax.xml.namespace.QName USECONTEXTHANDLER$12 = 
        new javax.xml.namespace.QName("", "use-context-handler");
    private static final javax.xml.namespace.QName DEFAULTROLE$14 = 
        new javax.xml.namespace.QName("", "default-role");
    
    
    /**
     * Gets array of all "description" elements
     */
    public org.apache.geronimo.xbeans.geronimo.security.GerDescriptionType[] getDescriptionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DESCRIPTION$0, targetList);
            org.apache.geronimo.xbeans.geronimo.security.GerDescriptionType[] result = new org.apache.geronimo.xbeans.geronimo.security.GerDescriptionType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "description" element
     */
    public org.apache.geronimo.xbeans.geronimo.security.GerDescriptionType getDescriptionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.security.GerDescriptionType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.security.GerDescriptionType)get_store().find_element_user(DESCRIPTION$0, i);
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
    public void setDescriptionArray(org.apache.geronimo.xbeans.geronimo.security.GerDescriptionType[] descriptionArray)
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
    public void setDescriptionArray(int i, org.apache.geronimo.xbeans.geronimo.security.GerDescriptionType description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.security.GerDescriptionType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.security.GerDescriptionType)get_store().find_element_user(DESCRIPTION$0, i);
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
    public org.apache.geronimo.xbeans.geronimo.security.GerDescriptionType insertNewDescription(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.security.GerDescriptionType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.security.GerDescriptionType)get_store().insert_element_user(DESCRIPTION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "description" element
     */
    public org.apache.geronimo.xbeans.geronimo.security.GerDescriptionType addNewDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.security.GerDescriptionType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.security.GerDescriptionType)get_store().add_element_user(DESCRIPTION$0);
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
     * Gets the "credential-store-ref" element
     */
    public org.apache.geronimo.deployment.xbeans.PatternType getCredentialStoreRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.xbeans.PatternType target = null;
            target = (org.apache.geronimo.deployment.xbeans.PatternType)get_store().find_element_user(CREDENTIALSTOREREF$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "credential-store-ref" element
     */
    public boolean isSetCredentialStoreRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CREDENTIALSTOREREF$2) != 0;
        }
    }
    
    /**
     * Sets the "credential-store-ref" element
     */
    public void setCredentialStoreRef(org.apache.geronimo.deployment.xbeans.PatternType credentialStoreRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.xbeans.PatternType target = null;
            target = (org.apache.geronimo.deployment.xbeans.PatternType)get_store().find_element_user(CREDENTIALSTOREREF$2, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.deployment.xbeans.PatternType)get_store().add_element_user(CREDENTIALSTOREREF$2);
            }
            target.set(credentialStoreRef);
        }
    }
    
    /**
     * Appends and returns a new empty "credential-store-ref" element
     */
    public org.apache.geronimo.deployment.xbeans.PatternType addNewCredentialStoreRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.xbeans.PatternType target = null;
            target = (org.apache.geronimo.deployment.xbeans.PatternType)get_store().add_element_user(CREDENTIALSTOREREF$2);
            return target;
        }
    }
    
    /**
     * Unsets the "credential-store-ref" element
     */
    public void unsetCredentialStoreRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CREDENTIALSTOREREF$2, 0);
        }
    }
    
    /**
     * Gets the "default-subject" element
     */
    public org.apache.geronimo.xbeans.geronimo.security.GerSubjectInfoType getDefaultSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.security.GerSubjectInfoType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.security.GerSubjectInfoType)get_store().find_element_user(DEFAULTSUBJECT$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "default-subject" element
     */
    public boolean isSetDefaultSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DEFAULTSUBJECT$4) != 0;
        }
    }
    
    /**
     * Sets the "default-subject" element
     */
    public void setDefaultSubject(org.apache.geronimo.xbeans.geronimo.security.GerSubjectInfoType defaultSubject)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.security.GerSubjectInfoType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.security.GerSubjectInfoType)get_store().find_element_user(DEFAULTSUBJECT$4, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.xbeans.geronimo.security.GerSubjectInfoType)get_store().add_element_user(DEFAULTSUBJECT$4);
            }
            target.set(defaultSubject);
        }
    }
    
    /**
     * Appends and returns a new empty "default-subject" element
     */
    public org.apache.geronimo.xbeans.geronimo.security.GerSubjectInfoType addNewDefaultSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.security.GerSubjectInfoType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.security.GerSubjectInfoType)get_store().add_element_user(DEFAULTSUBJECT$4);
            return target;
        }
    }
    
    /**
     * Unsets the "default-subject" element
     */
    public void unsetDefaultSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DEFAULTSUBJECT$4, 0);
        }
    }
    
    /**
     * Gets the "role-mappings" element
     */
    public org.apache.geronimo.xbeans.geronimo.security.GerRoleMappingsType getRoleMappings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.security.GerRoleMappingsType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.security.GerRoleMappingsType)get_store().find_element_user(ROLEMAPPINGS$6, 0);
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
            return get_store().count_elements(ROLEMAPPINGS$6) != 0;
        }
    }
    
    /**
     * Sets the "role-mappings" element
     */
    public void setRoleMappings(org.apache.geronimo.xbeans.geronimo.security.GerRoleMappingsType roleMappings)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.security.GerRoleMappingsType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.security.GerRoleMappingsType)get_store().find_element_user(ROLEMAPPINGS$6, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.xbeans.geronimo.security.GerRoleMappingsType)get_store().add_element_user(ROLEMAPPINGS$6);
            }
            target.set(roleMappings);
        }
    }
    
    /**
     * Appends and returns a new empty "role-mappings" element
     */
    public org.apache.geronimo.xbeans.geronimo.security.GerRoleMappingsType addNewRoleMappings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.security.GerRoleMappingsType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.security.GerRoleMappingsType)get_store().add_element_user(ROLEMAPPINGS$6);
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
            get_store().remove_element(ROLEMAPPINGS$6, 0);
        }
    }
    
    /**
     * Gets the "name" attribute
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$8);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "name" attribute
     */
    public org.apache.xmlbeans.XmlString xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$8);
            return target;
        }
    }
    
    /**
     * True if has "name" attribute
     */
    public boolean isSetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(NAME$8) != null;
        }
    }
    
    /**
     * Sets the "name" attribute
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$8);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "name" attribute
     */
    public void xsetName(org.apache.xmlbeans.XmlString name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$8);
            }
            target.set(name);
        }
    }
    
    /**
     * Unsets the "name" attribute
     */
    public void unsetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(NAME$8);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DOASCURRENTCALLER$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(DOASCURRENTCALLER$10);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DOASCURRENTCALLER$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(DOASCURRENTCALLER$10);
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
            return get_store().find_attribute_user(DOASCURRENTCALLER$10) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DOASCURRENTCALLER$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DOASCURRENTCALLER$10);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DOASCURRENTCALLER$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(DOASCURRENTCALLER$10);
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
            get_store().remove_attribute(DOASCURRENTCALLER$10);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USECONTEXTHANDLER$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(USECONTEXTHANDLER$12);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(USECONTEXTHANDLER$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(USECONTEXTHANDLER$12);
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
            return get_store().find_attribute_user(USECONTEXTHANDLER$12) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USECONTEXTHANDLER$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(USECONTEXTHANDLER$12);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(USECONTEXTHANDLER$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(USECONTEXTHANDLER$12);
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
            get_store().remove_attribute(USECONTEXTHANDLER$12);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULTROLE$14);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DEFAULTROLE$14);
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
            return get_store().find_attribute_user(DEFAULTROLE$14) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULTROLE$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEFAULTROLE$14);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DEFAULTROLE$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DEFAULTROLE$14);
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
            get_store().remove_attribute(DEFAULTROLE$14);
        }
    }
}
