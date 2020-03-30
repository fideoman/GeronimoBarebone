/*
 * XML Type:  cssType
 * Namespace: http://openejb.apache.org/xml/ns/corba-css-config-2.1
 * Java type: org.apache.geronimo.corba.xbeans.csiv2.css.CSSCssType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.corba.xbeans.csiv2.css.impl;
/**
 * An XML cssType(@http://openejb.apache.org/xml/ns/corba-css-config-2.1).
 *
 * This is a complex type.
 */
public class CSSCssTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.corba.xbeans.csiv2.css.CSSCssType
{
    private static final long serialVersionUID = 1L;
    
    public CSSCssTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DESCRIPTION$0 = 
        new javax.xml.namespace.QName("http://openejb.apache.org/xml/ns/corba-css-config-2.1", "description");
    private static final javax.xml.namespace.QName COMPOUNDSECMECHTYPELIST$2 = 
        new javax.xml.namespace.QName("http://openejb.apache.org/xml/ns/corba-css-config-2.1", "compoundSecMechTypeList");
    
    
    /**
     * Gets array of all "description" elements
     */
    public org.apache.geronimo.corba.xbeans.csiv2.css.CSSDescriptionType[] getDescriptionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DESCRIPTION$0, targetList);
            org.apache.geronimo.corba.xbeans.csiv2.css.CSSDescriptionType[] result = new org.apache.geronimo.corba.xbeans.csiv2.css.CSSDescriptionType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "description" element
     */
    public org.apache.geronimo.corba.xbeans.csiv2.css.CSSDescriptionType getDescriptionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.corba.xbeans.csiv2.css.CSSDescriptionType target = null;
            target = (org.apache.geronimo.corba.xbeans.csiv2.css.CSSDescriptionType)get_store().find_element_user(DESCRIPTION$0, i);
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
    public void setDescriptionArray(org.apache.geronimo.corba.xbeans.csiv2.css.CSSDescriptionType[] descriptionArray)
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
    public void setDescriptionArray(int i, org.apache.geronimo.corba.xbeans.csiv2.css.CSSDescriptionType description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.corba.xbeans.csiv2.css.CSSDescriptionType target = null;
            target = (org.apache.geronimo.corba.xbeans.csiv2.css.CSSDescriptionType)get_store().find_element_user(DESCRIPTION$0, i);
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
    public org.apache.geronimo.corba.xbeans.csiv2.css.CSSDescriptionType insertNewDescription(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.corba.xbeans.csiv2.css.CSSDescriptionType target = null;
            target = (org.apache.geronimo.corba.xbeans.csiv2.css.CSSDescriptionType)get_store().insert_element_user(DESCRIPTION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "description" element
     */
    public org.apache.geronimo.corba.xbeans.csiv2.css.CSSDescriptionType addNewDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.corba.xbeans.csiv2.css.CSSDescriptionType target = null;
            target = (org.apache.geronimo.corba.xbeans.csiv2.css.CSSDescriptionType)get_store().add_element_user(DESCRIPTION$0);
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
     * Gets the "compoundSecMechTypeList" element
     */
    public org.apache.geronimo.corba.xbeans.csiv2.css.CSSCssType.CompoundSecMechTypeList getCompoundSecMechTypeList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.corba.xbeans.csiv2.css.CSSCssType.CompoundSecMechTypeList target = null;
            target = (org.apache.geronimo.corba.xbeans.csiv2.css.CSSCssType.CompoundSecMechTypeList)get_store().find_element_user(COMPOUNDSECMECHTYPELIST$2, 0);
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
            return get_store().count_elements(COMPOUNDSECMECHTYPELIST$2) != 0;
        }
    }
    
    /**
     * Sets the "compoundSecMechTypeList" element
     */
    public void setCompoundSecMechTypeList(org.apache.geronimo.corba.xbeans.csiv2.css.CSSCssType.CompoundSecMechTypeList compoundSecMechTypeList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.corba.xbeans.csiv2.css.CSSCssType.CompoundSecMechTypeList target = null;
            target = (org.apache.geronimo.corba.xbeans.csiv2.css.CSSCssType.CompoundSecMechTypeList)get_store().find_element_user(COMPOUNDSECMECHTYPELIST$2, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.corba.xbeans.csiv2.css.CSSCssType.CompoundSecMechTypeList)get_store().add_element_user(COMPOUNDSECMECHTYPELIST$2);
            }
            target.set(compoundSecMechTypeList);
        }
    }
    
    /**
     * Appends and returns a new empty "compoundSecMechTypeList" element
     */
    public org.apache.geronimo.corba.xbeans.csiv2.css.CSSCssType.CompoundSecMechTypeList addNewCompoundSecMechTypeList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.corba.xbeans.csiv2.css.CSSCssType.CompoundSecMechTypeList target = null;
            target = (org.apache.geronimo.corba.xbeans.csiv2.css.CSSCssType.CompoundSecMechTypeList)get_store().add_element_user(COMPOUNDSECMECHTYPELIST$2);
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
            get_store().remove_element(COMPOUNDSECMECHTYPELIST$2, 0);
        }
    }
    /**
     * An XML compoundSecMechTypeList(@http://openejb.apache.org/xml/ns/corba-css-config-2.1).
     *
     * This is a complex type.
     */
    public static class CompoundSecMechTypeListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.corba.xbeans.csiv2.css.CSSCssType.CompoundSecMechTypeList
    {
        private static final long serialVersionUID = 1L;
        
        public CompoundSecMechTypeListImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName COMPOUNDSECMECH$0 = 
            new javax.xml.namespace.QName("http://openejb.apache.org/xml/ns/corba-css-config-2.1", "compoundSecMech");
        private static final javax.xml.namespace.QName STATEFUL$2 = 
            new javax.xml.namespace.QName("", "stateful");
        
        
        /**
         * Gets array of all "compoundSecMech" elements
         */
        public org.apache.geronimo.corba.xbeans.csiv2.css.CSSCompoundSecMechType[] getCompoundSecMechArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(COMPOUNDSECMECH$0, targetList);
                org.apache.geronimo.corba.xbeans.csiv2.css.CSSCompoundSecMechType[] result = new org.apache.geronimo.corba.xbeans.csiv2.css.CSSCompoundSecMechType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "compoundSecMech" element
         */
        public org.apache.geronimo.corba.xbeans.csiv2.css.CSSCompoundSecMechType getCompoundSecMechArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.geronimo.corba.xbeans.csiv2.css.CSSCompoundSecMechType target = null;
                target = (org.apache.geronimo.corba.xbeans.csiv2.css.CSSCompoundSecMechType)get_store().find_element_user(COMPOUNDSECMECH$0, i);
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
        public void setCompoundSecMechArray(org.apache.geronimo.corba.xbeans.csiv2.css.CSSCompoundSecMechType[] compoundSecMechArray)
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
        public void setCompoundSecMechArray(int i, org.apache.geronimo.corba.xbeans.csiv2.css.CSSCompoundSecMechType compoundSecMech)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.geronimo.corba.xbeans.csiv2.css.CSSCompoundSecMechType target = null;
                target = (org.apache.geronimo.corba.xbeans.csiv2.css.CSSCompoundSecMechType)get_store().find_element_user(COMPOUNDSECMECH$0, i);
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
        public org.apache.geronimo.corba.xbeans.csiv2.css.CSSCompoundSecMechType insertNewCompoundSecMech(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.geronimo.corba.xbeans.csiv2.css.CSSCompoundSecMechType target = null;
                target = (org.apache.geronimo.corba.xbeans.csiv2.css.CSSCompoundSecMechType)get_store().insert_element_user(COMPOUNDSECMECH$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "compoundSecMech" element
         */
        public org.apache.geronimo.corba.xbeans.csiv2.css.CSSCompoundSecMechType addNewCompoundSecMech()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.geronimo.corba.xbeans.csiv2.css.CSSCompoundSecMechType target = null;
                target = (org.apache.geronimo.corba.xbeans.csiv2.css.CSSCompoundSecMechType)get_store().add_element_user(COMPOUNDSECMECH$0);
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
