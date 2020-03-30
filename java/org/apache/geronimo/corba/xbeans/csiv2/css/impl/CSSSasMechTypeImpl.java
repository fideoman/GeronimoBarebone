/*
 * XML Type:  sasMechType
 * Namespace: http://openejb.apache.org/xml/ns/corba-css-config-2.1
 * Java type: org.apache.geronimo.corba.xbeans.csiv2.css.CSSSasMechType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.corba.xbeans.csiv2.css.impl;
/**
 * An XML sasMechType(@http://openejb.apache.org/xml/ns/corba-css-config-2.1).
 *
 * This is a complex type.
 */
public class CSSSasMechTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.corba.xbeans.csiv2.css.CSSSasMechType
{
    private static final long serialVersionUID = 1L;
    
    public CSSSasMechTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DESCRIPTION$0 = 
        new javax.xml.namespace.QName("http://openejb.apache.org/xml/ns/corba-css-config-2.1", "description");
    private static final javax.xml.namespace.QName ITTABSENT$2 = 
        new javax.xml.namespace.QName("http://openejb.apache.org/xml/ns/corba-css-config-2.1", "ITTAbsent");
    private static final javax.xml.namespace.QName ITTANONYMOUS$4 = 
        new javax.xml.namespace.QName("http://openejb.apache.org/xml/ns/corba-css-config-2.1", "ITTAnonymous");
    private static final javax.xml.namespace.QName ITTPRINCIPALNAMESTATIC$6 = 
        new javax.xml.namespace.QName("http://openejb.apache.org/xml/ns/corba-css-config-2.1", "ITTPrincipalNameStatic");
    private static final javax.xml.namespace.QName ITTPRINCIPALNAMEDYNAMIC$8 = 
        new javax.xml.namespace.QName("http://openejb.apache.org/xml/ns/corba-css-config-2.1", "ITTPrincipalNameDynamic");
    
    
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
     * Gets the "ITTAbsent" element
     */
    public org.apache.geronimo.corba.xbeans.csiv2.css.CSSITTAbsentType getITTAbsent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.corba.xbeans.csiv2.css.CSSITTAbsentType target = null;
            target = (org.apache.geronimo.corba.xbeans.csiv2.css.CSSITTAbsentType)get_store().find_element_user(ITTABSENT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ITTAbsent" element
     */
    public boolean isSetITTAbsent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ITTABSENT$2) != 0;
        }
    }
    
    /**
     * Sets the "ITTAbsent" element
     */
    public void setITTAbsent(org.apache.geronimo.corba.xbeans.csiv2.css.CSSITTAbsentType ittAbsent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.corba.xbeans.csiv2.css.CSSITTAbsentType target = null;
            target = (org.apache.geronimo.corba.xbeans.csiv2.css.CSSITTAbsentType)get_store().find_element_user(ITTABSENT$2, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.corba.xbeans.csiv2.css.CSSITTAbsentType)get_store().add_element_user(ITTABSENT$2);
            }
            target.set(ittAbsent);
        }
    }
    
    /**
     * Appends and returns a new empty "ITTAbsent" element
     */
    public org.apache.geronimo.corba.xbeans.csiv2.css.CSSITTAbsentType addNewITTAbsent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.corba.xbeans.csiv2.css.CSSITTAbsentType target = null;
            target = (org.apache.geronimo.corba.xbeans.csiv2.css.CSSITTAbsentType)get_store().add_element_user(ITTABSENT$2);
            return target;
        }
    }
    
    /**
     * Unsets the "ITTAbsent" element
     */
    public void unsetITTAbsent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ITTABSENT$2, 0);
        }
    }
    
    /**
     * Gets the "ITTAnonymous" element
     */
    public org.apache.geronimo.corba.xbeans.csiv2.css.CSSITTAnonymousType getITTAnonymous()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.corba.xbeans.csiv2.css.CSSITTAnonymousType target = null;
            target = (org.apache.geronimo.corba.xbeans.csiv2.css.CSSITTAnonymousType)get_store().find_element_user(ITTANONYMOUS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ITTAnonymous" element
     */
    public boolean isSetITTAnonymous()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ITTANONYMOUS$4) != 0;
        }
    }
    
    /**
     * Sets the "ITTAnonymous" element
     */
    public void setITTAnonymous(org.apache.geronimo.corba.xbeans.csiv2.css.CSSITTAnonymousType ittAnonymous)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.corba.xbeans.csiv2.css.CSSITTAnonymousType target = null;
            target = (org.apache.geronimo.corba.xbeans.csiv2.css.CSSITTAnonymousType)get_store().find_element_user(ITTANONYMOUS$4, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.corba.xbeans.csiv2.css.CSSITTAnonymousType)get_store().add_element_user(ITTANONYMOUS$4);
            }
            target.set(ittAnonymous);
        }
    }
    
    /**
     * Appends and returns a new empty "ITTAnonymous" element
     */
    public org.apache.geronimo.corba.xbeans.csiv2.css.CSSITTAnonymousType addNewITTAnonymous()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.corba.xbeans.csiv2.css.CSSITTAnonymousType target = null;
            target = (org.apache.geronimo.corba.xbeans.csiv2.css.CSSITTAnonymousType)get_store().add_element_user(ITTANONYMOUS$4);
            return target;
        }
    }
    
    /**
     * Unsets the "ITTAnonymous" element
     */
    public void unsetITTAnonymous()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ITTANONYMOUS$4, 0);
        }
    }
    
    /**
     * Gets the "ITTPrincipalNameStatic" element
     */
    public org.apache.geronimo.corba.xbeans.csiv2.css.CSSITTPrincipalNameStaticType getITTPrincipalNameStatic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.corba.xbeans.csiv2.css.CSSITTPrincipalNameStaticType target = null;
            target = (org.apache.geronimo.corba.xbeans.csiv2.css.CSSITTPrincipalNameStaticType)get_store().find_element_user(ITTPRINCIPALNAMESTATIC$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ITTPrincipalNameStatic" element
     */
    public boolean isSetITTPrincipalNameStatic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ITTPRINCIPALNAMESTATIC$6) != 0;
        }
    }
    
    /**
     * Sets the "ITTPrincipalNameStatic" element
     */
    public void setITTPrincipalNameStatic(org.apache.geronimo.corba.xbeans.csiv2.css.CSSITTPrincipalNameStaticType ittPrincipalNameStatic)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.corba.xbeans.csiv2.css.CSSITTPrincipalNameStaticType target = null;
            target = (org.apache.geronimo.corba.xbeans.csiv2.css.CSSITTPrincipalNameStaticType)get_store().find_element_user(ITTPRINCIPALNAMESTATIC$6, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.corba.xbeans.csiv2.css.CSSITTPrincipalNameStaticType)get_store().add_element_user(ITTPRINCIPALNAMESTATIC$6);
            }
            target.set(ittPrincipalNameStatic);
        }
    }
    
    /**
     * Appends and returns a new empty "ITTPrincipalNameStatic" element
     */
    public org.apache.geronimo.corba.xbeans.csiv2.css.CSSITTPrincipalNameStaticType addNewITTPrincipalNameStatic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.corba.xbeans.csiv2.css.CSSITTPrincipalNameStaticType target = null;
            target = (org.apache.geronimo.corba.xbeans.csiv2.css.CSSITTPrincipalNameStaticType)get_store().add_element_user(ITTPRINCIPALNAMESTATIC$6);
            return target;
        }
    }
    
    /**
     * Unsets the "ITTPrincipalNameStatic" element
     */
    public void unsetITTPrincipalNameStatic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ITTPRINCIPALNAMESTATIC$6, 0);
        }
    }
    
    /**
     * Gets the "ITTPrincipalNameDynamic" element
     */
    public org.apache.geronimo.corba.xbeans.csiv2.css.CSSITTPrincipalNameDynamicType getITTPrincipalNameDynamic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.corba.xbeans.csiv2.css.CSSITTPrincipalNameDynamicType target = null;
            target = (org.apache.geronimo.corba.xbeans.csiv2.css.CSSITTPrincipalNameDynamicType)get_store().find_element_user(ITTPRINCIPALNAMEDYNAMIC$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ITTPrincipalNameDynamic" element
     */
    public boolean isSetITTPrincipalNameDynamic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ITTPRINCIPALNAMEDYNAMIC$8) != 0;
        }
    }
    
    /**
     * Sets the "ITTPrincipalNameDynamic" element
     */
    public void setITTPrincipalNameDynamic(org.apache.geronimo.corba.xbeans.csiv2.css.CSSITTPrincipalNameDynamicType ittPrincipalNameDynamic)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.corba.xbeans.csiv2.css.CSSITTPrincipalNameDynamicType target = null;
            target = (org.apache.geronimo.corba.xbeans.csiv2.css.CSSITTPrincipalNameDynamicType)get_store().find_element_user(ITTPRINCIPALNAMEDYNAMIC$8, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.corba.xbeans.csiv2.css.CSSITTPrincipalNameDynamicType)get_store().add_element_user(ITTPRINCIPALNAMEDYNAMIC$8);
            }
            target.set(ittPrincipalNameDynamic);
        }
    }
    
    /**
     * Appends and returns a new empty "ITTPrincipalNameDynamic" element
     */
    public org.apache.geronimo.corba.xbeans.csiv2.css.CSSITTPrincipalNameDynamicType addNewITTPrincipalNameDynamic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.corba.xbeans.csiv2.css.CSSITTPrincipalNameDynamicType target = null;
            target = (org.apache.geronimo.corba.xbeans.csiv2.css.CSSITTPrincipalNameDynamicType)get_store().add_element_user(ITTPRINCIPALNAMEDYNAMIC$8);
            return target;
        }
    }
    
    /**
     * Unsets the "ITTPrincipalNameDynamic" element
     */
    public void unsetITTPrincipalNameDynamic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ITTPRINCIPALNAMEDYNAMIC$8, 0);
        }
    }
}
