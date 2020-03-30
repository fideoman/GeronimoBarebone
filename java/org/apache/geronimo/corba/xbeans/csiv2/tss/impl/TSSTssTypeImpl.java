/*
 * XML Type:  tssType
 * Namespace: http://openejb.apache.org/xml/ns/corba-tss-config-2.1
 * Java type: org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTssType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.corba.xbeans.csiv2.tss.impl;
/**
 * An XML tssType(@http://openejb.apache.org/xml/ns/corba-tss-config-2.1).
 *
 * This is a complex type.
 */
public class TSSTssTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTssType
{
    private static final long serialVersionUID = 1L;
    
    public TSSTssTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DESCRIPTION$0 = 
        new javax.xml.namespace.QName("http://openejb.apache.org/xml/ns/corba-tss-config-2.1", "description");
    private static final javax.xml.namespace.QName SSL$2 = 
        new javax.xml.namespace.QName("http://openejb.apache.org/xml/ns/corba-tss-config-2.1", "SSL");
    private static final javax.xml.namespace.QName SECIOP$4 = 
        new javax.xml.namespace.QName("http://openejb.apache.org/xml/ns/corba-tss-config-2.1", "SECIOP");
    private static final javax.xml.namespace.QName COMPOUNDSECMECHTYPELIST$6 = 
        new javax.xml.namespace.QName("http://openejb.apache.org/xml/ns/corba-tss-config-2.1", "compoundSecMechTypeList");
    private static final javax.xml.namespace.QName INHERIT$8 = 
        new javax.xml.namespace.QName("", "inherit");
    
    
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
     * Gets the "SSL" element
     */
    public org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSSLType getSSL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSSLType target = null;
            target = (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSSLType)get_store().find_element_user(SSL$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "SSL" element
     */
    public boolean isSetSSL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SSL$2) != 0;
        }
    }
    
    /**
     * Sets the "SSL" element
     */
    public void setSSL(org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSSLType ssl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSSLType target = null;
            target = (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSSLType)get_store().find_element_user(SSL$2, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSSLType)get_store().add_element_user(SSL$2);
            }
            target.set(ssl);
        }
    }
    
    /**
     * Appends and returns a new empty "SSL" element
     */
    public org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSSLType addNewSSL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSSLType target = null;
            target = (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSSLType)get_store().add_element_user(SSL$2);
            return target;
        }
    }
    
    /**
     * Unsets the "SSL" element
     */
    public void unsetSSL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SSL$2, 0);
        }
    }
    
    /**
     * Gets the "SECIOP" element
     */
    public org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSECIOPType getSECIOP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSECIOPType target = null;
            target = (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSECIOPType)get_store().find_element_user(SECIOP$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "SECIOP" element
     */
    public boolean isSetSECIOP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SECIOP$4) != 0;
        }
    }
    
    /**
     * Sets the "SECIOP" element
     */
    public void setSECIOP(org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSECIOPType seciop)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSECIOPType target = null;
            target = (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSECIOPType)get_store().find_element_user(SECIOP$4, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSECIOPType)get_store().add_element_user(SECIOP$4);
            }
            target.set(seciop);
        }
    }
    
    /**
     * Appends and returns a new empty "SECIOP" element
     */
    public org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSECIOPType addNewSECIOP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSECIOPType target = null;
            target = (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSECIOPType)get_store().add_element_user(SECIOP$4);
            return target;
        }
    }
    
    /**
     * Unsets the "SECIOP" element
     */
    public void unsetSECIOP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SECIOP$4, 0);
        }
    }
    
    /**
     * Gets the "compoundSecMechTypeList" element
     */
    public org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTssType.CompoundSecMechTypeList getCompoundSecMechTypeList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTssType.CompoundSecMechTypeList target = null;
            target = (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTssType.CompoundSecMechTypeList)get_store().find_element_user(COMPOUNDSECMECHTYPELIST$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "compoundSecMechTypeList" element
     */
    public boolean isSetCompoundSecMechTypeList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMPOUNDSECMECHTYPELIST$6) != 0;
        }
    }
    
    /**
     * Sets the "compoundSecMechTypeList" element
     */
    public void setCompoundSecMechTypeList(org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTssType.CompoundSecMechTypeList compoundSecMechTypeList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTssType.CompoundSecMechTypeList target = null;
            target = (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTssType.CompoundSecMechTypeList)get_store().find_element_user(COMPOUNDSECMECHTYPELIST$6, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTssType.CompoundSecMechTypeList)get_store().add_element_user(COMPOUNDSECMECHTYPELIST$6);
            }
            target.set(compoundSecMechTypeList);
        }
    }
    
    /**
     * Appends and returns a new empty "compoundSecMechTypeList" element
     */
    public org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTssType.CompoundSecMechTypeList addNewCompoundSecMechTypeList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTssType.CompoundSecMechTypeList target = null;
            target = (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTssType.CompoundSecMechTypeList)get_store().add_element_user(COMPOUNDSECMECHTYPELIST$6);
            return target;
        }
    }
    
    /**
     * Unsets the "compoundSecMechTypeList" element
     */
    public void unsetCompoundSecMechTypeList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMPOUNDSECMECHTYPELIST$6, 0);
        }
    }
    
    /**
     * Gets the "inherit" attribute
     */
    public boolean getInherit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INHERIT$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(INHERIT$8);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "inherit" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetInherit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(INHERIT$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(INHERIT$8);
            }
            return target;
        }
    }
    
    /**
     * True if has "inherit" attribute
     */
    public boolean isSetInherit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(INHERIT$8) != null;
        }
    }
    
    /**
     * Sets the "inherit" attribute
     */
    public void setInherit(boolean inherit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INHERIT$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INHERIT$8);
            }
            target.setBooleanValue(inherit);
        }
    }
    
    /**
     * Sets (as xml) the "inherit" attribute
     */
    public void xsetInherit(org.apache.xmlbeans.XmlBoolean inherit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(INHERIT$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(INHERIT$8);
            }
            target.set(inherit);
        }
    }
    
    /**
     * Unsets the "inherit" attribute
     */
    public void unsetInherit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(INHERIT$8);
        }
    }
    /**
     * An XML compoundSecMechTypeList(@http://openejb.apache.org/xml/ns/corba-tss-config-2.1).
     *
     * This is a complex type.
     */
    public static class CompoundSecMechTypeListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTssType.CompoundSecMechTypeList
    {
        private static final long serialVersionUID = 1L;
        
        public CompoundSecMechTypeListImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName COMPOUNDSECMECH$0 = 
            new javax.xml.namespace.QName("http://openejb.apache.org/xml/ns/corba-tss-config-2.1", "compoundSecMech");
        private static final javax.xml.namespace.QName STATEFUL$2 = 
            new javax.xml.namespace.QName("", "stateful");
        
        
        /**
         * Gets array of all "compoundSecMech" elements
         */
        public org.apache.geronimo.corba.xbeans.csiv2.tss.TSSCompoundSecMechType[] getCompoundSecMechArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(COMPOUNDSECMECH$0, targetList);
                org.apache.geronimo.corba.xbeans.csiv2.tss.TSSCompoundSecMechType[] result = new org.apache.geronimo.corba.xbeans.csiv2.tss.TSSCompoundSecMechType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "compoundSecMech" element
         */
        public org.apache.geronimo.corba.xbeans.csiv2.tss.TSSCompoundSecMechType getCompoundSecMechArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.geronimo.corba.xbeans.csiv2.tss.TSSCompoundSecMechType target = null;
                target = (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSCompoundSecMechType)get_store().find_element_user(COMPOUNDSECMECH$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "compoundSecMech" element
         */
        public int sizeOfCompoundSecMechArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(COMPOUNDSECMECH$0);
            }
        }
        
        /**
         * Sets array of all "compoundSecMech" element
         */
        public void setCompoundSecMechArray(org.apache.geronimo.corba.xbeans.csiv2.tss.TSSCompoundSecMechType[] compoundSecMechArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(compoundSecMechArray, COMPOUNDSECMECH$0);
            }
        }
        
        /**
         * Sets ith "compoundSecMech" element
         */
        public void setCompoundSecMechArray(int i, org.apache.geronimo.corba.xbeans.csiv2.tss.TSSCompoundSecMechType compoundSecMech)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.geronimo.corba.xbeans.csiv2.tss.TSSCompoundSecMechType target = null;
                target = (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSCompoundSecMechType)get_store().find_element_user(COMPOUNDSECMECH$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(compoundSecMech);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "compoundSecMech" element
         */
        public org.apache.geronimo.corba.xbeans.csiv2.tss.TSSCompoundSecMechType insertNewCompoundSecMech(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.geronimo.corba.xbeans.csiv2.tss.TSSCompoundSecMechType target = null;
                target = (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSCompoundSecMechType)get_store().insert_element_user(COMPOUNDSECMECH$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "compoundSecMech" element
         */
        public org.apache.geronimo.corba.xbeans.csiv2.tss.TSSCompoundSecMechType addNewCompoundSecMech()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.geronimo.corba.xbeans.csiv2.tss.TSSCompoundSecMechType target = null;
                target = (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSCompoundSecMechType)get_store().add_element_user(COMPOUNDSECMECH$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "compoundSecMech" element
         */
        public void removeCompoundSecMech(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(COMPOUNDSECMECH$0, i);
            }
        }
        
        /**
         * Gets the "stateful" attribute
         */
        public boolean getStateful()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATEFUL$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(STATEFUL$2);
                }
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "stateful" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetStateful()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(STATEFUL$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(STATEFUL$2);
                }
                return target;
            }
        }
        
        /**
         * True if has "stateful" attribute
         */
        public boolean isSetStateful()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(STATEFUL$2) != null;
            }
        }
        
        /**
         * Sets the "stateful" attribute
         */
        public void setStateful(boolean stateful)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATEFUL$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STATEFUL$2);
                }
                target.setBooleanValue(stateful);
            }
        }
        
        /**
         * Sets (as xml) the "stateful" attribute
         */
        public void xsetStateful(org.apache.xmlbeans.XmlBoolean stateful)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(STATEFUL$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(STATEFUL$2);
                }
                target.set(stateful);
            }
        }
        
        /**
         * Unsets the "stateful" attribute
         */
        public void unsetStateful()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(STATEFUL$2);
            }
        }
    }
}
