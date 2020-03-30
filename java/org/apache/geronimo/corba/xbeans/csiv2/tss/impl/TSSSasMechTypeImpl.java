/*
 * XML Type:  sasMechType
 * Namespace: http://openejb.apache.org/xml/ns/corba-tss-config-2.1
 * Java type: org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSasMechType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.corba.xbeans.csiv2.tss.impl;
/**
 * An XML sasMechType(@http://openejb.apache.org/xml/ns/corba-tss-config-2.1).
 *
 * This is a complex type.
 */
public class TSSSasMechTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSasMechType
{
    private static final long serialVersionUID = 1L;
    
    public TSSSasMechTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DESCRIPTION$0 = 
        new javax.xml.namespace.QName("http://openejb.apache.org/xml/ns/corba-tss-config-2.1", "description");
    private static final javax.xml.namespace.QName SERVICECONFIGURATIONLIST$2 = 
        new javax.xml.namespace.QName("http://openejb.apache.org/xml/ns/corba-tss-config-2.1", "serviceConfigurationList");
    private static final javax.xml.namespace.QName IDENTITYTOKENTYPES$4 = 
        new javax.xml.namespace.QName("http://openejb.apache.org/xml/ns/corba-tss-config-2.1", "identityTokenTypes");
    
    
    /**
     * Gets array of all "description" elements
     */
    public org.apache.geronimo.corba.xbeans.csiv2.tss.TSSDescriptionType[] getDescriptionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DESCRIPTION$0, targetList);
            org.apache.geronimo.corba.xbeans.csiv2.tss.TSSDescriptionType[] result = new org.apache.geronimo.corba.xbeans.csiv2.tss.TSSDescriptionType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "description" element
     */
    public org.apache.geronimo.corba.xbeans.csiv2.tss.TSSDescriptionType getDescriptionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.corba.xbeans.csiv2.tss.TSSDescriptionType target = null;
            target = (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSDescriptionType)get_store().find_element_user(DESCRIPTION$0, i);
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
    public void setDescriptionArray(org.apache.geronimo.corba.xbeans.csiv2.tss.TSSDescriptionType[] descriptionArray)
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
    public void setDescriptionArray(int i, org.apache.geronimo.corba.xbeans.csiv2.tss.TSSDescriptionType description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.corba.xbeans.csiv2.tss.TSSDescriptionType target = null;
            target = (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSDescriptionType)get_store().find_element_user(DESCRIPTION$0, i);
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
    public org.apache.geronimo.corba.xbeans.csiv2.tss.TSSDescriptionType insertNewDescription(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.corba.xbeans.csiv2.tss.TSSDescriptionType target = null;
            target = (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSDescriptionType)get_store().insert_element_user(DESCRIPTION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "description" element
     */
    public org.apache.geronimo.corba.xbeans.csiv2.tss.TSSDescriptionType addNewDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.corba.xbeans.csiv2.tss.TSSDescriptionType target = null;
            target = (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSDescriptionType)get_store().add_element_user(DESCRIPTION$0);
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
     * Gets the "serviceConfigurationList" element
     */
    public org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSasMechType.ServiceConfigurationList getServiceConfigurationList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSasMechType.ServiceConfigurationList target = null;
            target = (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSasMechType.ServiceConfigurationList)get_store().find_element_user(SERVICECONFIGURATIONLIST$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "serviceConfigurationList" element
     */
    public boolean isSetServiceConfigurationList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SERVICECONFIGURATIONLIST$2) != 0;
        }
    }
    
    /**
     * Sets the "serviceConfigurationList" element
     */
    public void setServiceConfigurationList(org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSasMechType.ServiceConfigurationList serviceConfigurationList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSasMechType.ServiceConfigurationList target = null;
            target = (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSasMechType.ServiceConfigurationList)get_store().find_element_user(SERVICECONFIGURATIONLIST$2, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSasMechType.ServiceConfigurationList)get_store().add_element_user(SERVICECONFIGURATIONLIST$2);
            }
            target.set(serviceConfigurationList);
        }
    }
    
    /**
     * Appends and returns a new empty "serviceConfigurationList" element
     */
    public org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSasMechType.ServiceConfigurationList addNewServiceConfigurationList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSasMechType.ServiceConfigurationList target = null;
            target = (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSasMechType.ServiceConfigurationList)get_store().add_element_user(SERVICECONFIGURATIONLIST$2);
            return target;
        }
    }
    
    /**
     * Unsets the "serviceConfigurationList" element
     */
    public void unsetServiceConfigurationList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SERVICECONFIGURATIONLIST$2, 0);
        }
    }
    
    /**
     * Gets the "identityTokenTypes" element
     */
    public org.apache.geronimo.corba.xbeans.csiv2.tss.TSSIdentityTokenTypeList getIdentityTokenTypes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.corba.xbeans.csiv2.tss.TSSIdentityTokenTypeList target = null;
            target = (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSIdentityTokenTypeList)get_store().find_element_user(IDENTITYTOKENTYPES$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "identityTokenTypes" element
     */
    public void setIdentityTokenTypes(org.apache.geronimo.corba.xbeans.csiv2.tss.TSSIdentityTokenTypeList identityTokenTypes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.corba.xbeans.csiv2.tss.TSSIdentityTokenTypeList target = null;
            target = (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSIdentityTokenTypeList)get_store().find_element_user(IDENTITYTOKENTYPES$4, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSIdentityTokenTypeList)get_store().add_element_user(IDENTITYTOKENTYPES$4);
            }
            target.set(identityTokenTypes);
        }
    }
    
    /**
     * Appends and returns a new empty "identityTokenTypes" element
     */
    public org.apache.geronimo.corba.xbeans.csiv2.tss.TSSIdentityTokenTypeList addNewIdentityTokenTypes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.corba.xbeans.csiv2.tss.TSSIdentityTokenTypeList target = null;
            target = (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSIdentityTokenTypeList)get_store().add_element_user(IDENTITYTOKENTYPES$4);
            return target;
        }
    }
    /**
     * An XML serviceConfigurationList(@http://openejb.apache.org/xml/ns/corba-tss-config-2.1).
     *
     * This is a complex type.
     */
    public static class ServiceConfigurationListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSasMechType.ServiceConfigurationList
    {
        private static final long serialVersionUID = 1L;
        
        public ServiceConfigurationListImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GENERALNAME$0 = 
            new javax.xml.namespace.QName("http://openejb.apache.org/xml/ns/corba-tss-config-2.1", "generalName");
        private static final javax.xml.namespace.QName GSSEXPORTEDNAME$2 = 
            new javax.xml.namespace.QName("http://openejb.apache.org/xml/ns/corba-tss-config-2.1", "gssExportedName");
        private static final javax.xml.namespace.QName REQUIRED$4 = 
            new javax.xml.namespace.QName("", "required");
        
        
        /**
         * Gets array of all "generalName" elements
         */
        public org.apache.geronimo.corba.xbeans.csiv2.tss.TSSGeneralNameType[] getGeneralNameArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(GENERALNAME$0, targetList);
                org.apache.geronimo.corba.xbeans.csiv2.tss.TSSGeneralNameType[] result = new org.apache.geronimo.corba.xbeans.csiv2.tss.TSSGeneralNameType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "generalName" element
         */
        public org.apache.geronimo.corba.xbeans.csiv2.tss.TSSGeneralNameType getGeneralNameArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.geronimo.corba.xbeans.csiv2.tss.TSSGeneralNameType target = null;
                target = (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSGeneralNameType)get_store().find_element_user(GENERALNAME$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "generalName" element
         */
        public int sizeOfGeneralNameArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GENERALNAME$0);
            }
        }
        
        /**
         * Sets array of all "generalName" element
         */
        public void setGeneralNameArray(org.apache.geronimo.corba.xbeans.csiv2.tss.TSSGeneralNameType[] generalNameArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(generalNameArray, GENERALNAME$0);
            }
        }
        
        /**
         * Sets ith "generalName" element
         */
        public void setGeneralNameArray(int i, org.apache.geronimo.corba.xbeans.csiv2.tss.TSSGeneralNameType generalName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.geronimo.corba.xbeans.csiv2.tss.TSSGeneralNameType target = null;
                target = (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSGeneralNameType)get_store().find_element_user(GENERALNAME$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(generalName);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "generalName" element
         */
        public org.apache.geronimo.corba.xbeans.csiv2.tss.TSSGeneralNameType insertNewGeneralName(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.geronimo.corba.xbeans.csiv2.tss.TSSGeneralNameType target = null;
                target = (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSGeneralNameType)get_store().insert_element_user(GENERALNAME$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "generalName" element
         */
        public org.apache.geronimo.corba.xbeans.csiv2.tss.TSSGeneralNameType addNewGeneralName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.geronimo.corba.xbeans.csiv2.tss.TSSGeneralNameType target = null;
                target = (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSGeneralNameType)get_store().add_element_user(GENERALNAME$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "generalName" element
         */
        public void removeGeneralName(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GENERALNAME$0, i);
            }
        }
        
        /**
         * Gets array of all "gssExportedName" elements
         */
        public org.apache.geronimo.corba.xbeans.csiv2.tss.TSSGssExportedNameType[] getGssExportedNameArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(GSSEXPORTEDNAME$2, targetList);
                org.apache.geronimo.corba.xbeans.csiv2.tss.TSSGssExportedNameType[] result = new org.apache.geronimo.corba.xbeans.csiv2.tss.TSSGssExportedNameType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "gssExportedName" element
         */
        public org.apache.geronimo.corba.xbeans.csiv2.tss.TSSGssExportedNameType getGssExportedNameArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.geronimo.corba.xbeans.csiv2.tss.TSSGssExportedNameType target = null;
                target = (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSGssExportedNameType)get_store().find_element_user(GSSEXPORTEDNAME$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "gssExportedName" element
         */
        public int sizeOfGssExportedNameArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GSSEXPORTEDNAME$2);
            }
        }
        
        /**
         * Sets array of all "gssExportedName" element
         */
        public void setGssExportedNameArray(org.apache.geronimo.corba.xbeans.csiv2.tss.TSSGssExportedNameType[] gssExportedNameArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(gssExportedNameArray, GSSEXPORTEDNAME$2);
            }
        }
        
        /**
         * Sets ith "gssExportedName" element
         */
        public void setGssExportedNameArray(int i, org.apache.geronimo.corba.xbeans.csiv2.tss.TSSGssExportedNameType gssExportedName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.geronimo.corba.xbeans.csiv2.tss.TSSGssExportedNameType target = null;
                target = (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSGssExportedNameType)get_store().find_element_user(GSSEXPORTEDNAME$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(gssExportedName);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "gssExportedName" element
         */
        public org.apache.geronimo.corba.xbeans.csiv2.tss.TSSGssExportedNameType insertNewGssExportedName(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.geronimo.corba.xbeans.csiv2.tss.TSSGssExportedNameType target = null;
                target = (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSGssExportedNameType)get_store().insert_element_user(GSSEXPORTEDNAME$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "gssExportedName" element
         */
        public org.apache.geronimo.corba.xbeans.csiv2.tss.TSSGssExportedNameType addNewGssExportedName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.geronimo.corba.xbeans.csiv2.tss.TSSGssExportedNameType target = null;
                target = (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSGssExportedNameType)get_store().add_element_user(GSSEXPORTEDNAME$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "gssExportedName" element
         */
        public void removeGssExportedName(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GSSEXPORTEDNAME$2, i);
            }
        }
        
        /**
         * Gets the "required" attribute
         */
        public boolean getRequired()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REQUIRED$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(REQUIRED$4);
                }
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "required" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetRequired()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(REQUIRED$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(REQUIRED$4);
                }
                return target;
            }
        }
        
        /**
         * True if has "required" attribute
         */
        public boolean isSetRequired()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(REQUIRED$4) != null;
            }
        }
        
        /**
         * Sets the "required" attribute
         */
        public void setRequired(boolean required)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REQUIRED$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REQUIRED$4);
                }
                target.setBooleanValue(required);
            }
        }
        
        /**
         * Sets (as xml) the "required" attribute
         */
        public void xsetRequired(org.apache.xmlbeans.XmlBoolean required)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(REQUIRED$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(REQUIRED$4);
                }
                target.set(required);
            }
        }
        
        /**
         * Unsets the "required" attribute
         */
        public void unsetRequired()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(REQUIRED$4);
            }
        }
    }
}
