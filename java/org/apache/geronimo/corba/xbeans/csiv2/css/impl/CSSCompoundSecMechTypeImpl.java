/*
 * XML Type:  compoundSecMechType
 * Namespace: http://openejb.apache.org/xml/ns/corba-css-config-2.1
 * Java type: org.apache.geronimo.corba.xbeans.csiv2.css.CSSCompoundSecMechType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.corba.xbeans.csiv2.css.impl;
/**
 * An XML compoundSecMechType(@http://openejb.apache.org/xml/ns/corba-css-config-2.1).
 *
 * This is a complex type.
 */
public class CSSCompoundSecMechTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.corba.xbeans.csiv2.css.CSSCompoundSecMechType
{
    private static final long serialVersionUID = 1L;
    
    public CSSCompoundSecMechTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DESCRIPTION$0 = 
        new javax.xml.namespace.QName("http://openejb.apache.org/xml/ns/corba-css-config-2.1", "description");
    private static final javax.xml.namespace.QName SSL$2 = 
        new javax.xml.namespace.QName("http://openejb.apache.org/xml/ns/corba-css-config-2.1", "SSL");
    private static final javax.xml.namespace.QName SECIOP$4 = 
        new javax.xml.namespace.QName("http://openejb.apache.org/xml/ns/corba-css-config-2.1", "SECIOP");
    private static final javax.xml.namespace.QName GSSUPSTATIC$6 = 
        new javax.xml.namespace.QName("http://openejb.apache.org/xml/ns/corba-css-config-2.1", "GSSUPStatic");
    private static final javax.xml.namespace.QName GSSUPDYNAMIC$8 = 
        new javax.xml.namespace.QName("http://openejb.apache.org/xml/ns/corba-css-config-2.1", "GSSUPDynamic");
    private static final javax.xml.namespace.QName SASMECH$10 = 
        new javax.xml.namespace.QName("http://openejb.apache.org/xml/ns/corba-css-config-2.1", "sasMech");
    
    
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
     * Gets the "SSL" element
     */
    public org.apache.geronimo.corba.xbeans.csiv2.css.CSSSSLType getSSL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.corba.xbeans.csiv2.css.CSSSSLType target = null;
            target = (org.apache.geronimo.corba.xbeans.csiv2.css.CSSSSLType)get_store().find_element_user(SSL$2, 0);
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
    public void setSSL(org.apache.geronimo.corba.xbeans.csiv2.css.CSSSSLType ssl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.corba.xbeans.csiv2.css.CSSSSLType target = null;
            target = (org.apache.geronimo.corba.xbeans.csiv2.css.CSSSSLType)get_store().find_element_user(SSL$2, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.corba.xbeans.csiv2.css.CSSSSLType)get_store().add_element_user(SSL$2);
            }
            target.set(ssl);
        }
    }
    
    /**
     * Appends and returns a new empty "SSL" element
     */
    public org.apache.geronimo.corba.xbeans.csiv2.css.CSSSSLType addNewSSL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.corba.xbeans.csiv2.css.CSSSSLType target = null;
            target = (org.apache.geronimo.corba.xbeans.csiv2.css.CSSSSLType)get_store().add_element_user(SSL$2);
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
    public org.apache.geronimo.corba.xbeans.csiv2.css.CSSSECIOPType getSECIOP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.corba.xbeans.csiv2.css.CSSSECIOPType target = null;
            target = (org.apache.geronimo.corba.xbeans.csiv2.css.CSSSECIOPType)get_store().find_element_user(SECIOP$4, 0);
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
    public void setSECIOP(org.apache.geronimo.corba.xbeans.csiv2.css.CSSSECIOPType seciop)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.corba.xbeans.csiv2.css.CSSSECIOPType target = null;
            target = (org.apache.geronimo.corba.xbeans.csiv2.css.CSSSECIOPType)get_store().find_element_user(SECIOP$4, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.corba.xbeans.csiv2.css.CSSSECIOPType)get_store().add_element_user(SECIOP$4);
            }
            target.set(seciop);
        }
    }
    
    /**
     * Appends and returns a new empty "SECIOP" element
     */
    public org.apache.geronimo.corba.xbeans.csiv2.css.CSSSECIOPType addNewSECIOP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.corba.xbeans.csiv2.css.CSSSECIOPType target = null;
            target = (org.apache.geronimo.corba.xbeans.csiv2.css.CSSSECIOPType)get_store().add_element_user(SECIOP$4);
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
     * Gets the "GSSUPStatic" element
     */
    public org.apache.geronimo.corba.xbeans.csiv2.css.CSSGSSUPStaticType getGSSUPStatic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.corba.xbeans.csiv2.css.CSSGSSUPStaticType target = null;
            target = (org.apache.geronimo.corba.xbeans.csiv2.css.CSSGSSUPStaticType)get_store().find_element_user(GSSUPSTATIC$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "GSSUPStatic" element
     */
    public boolean isSetGSSUPStatic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GSSUPSTATIC$6) != 0;
        }
    }
    
    /**
     * Sets the "GSSUPStatic" element
     */
    public void setGSSUPStatic(org.apache.geronimo.corba.xbeans.csiv2.css.CSSGSSUPStaticType gssupStatic)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.corba.xbeans.csiv2.css.CSSGSSUPStaticType target = null;
            target = (org.apache.geronimo.corba.xbeans.csiv2.css.CSSGSSUPStaticType)get_store().find_element_user(GSSUPSTATIC$6, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.corba.xbeans.csiv2.css.CSSGSSUPStaticType)get_store().add_element_user(GSSUPSTATIC$6);
            }
            target.set(gssupStatic);
        }
    }
    
    /**
     * Appends and returns a new empty "GSSUPStatic" element
     */
    public org.apache.geronimo.corba.xbeans.csiv2.css.CSSGSSUPStaticType addNewGSSUPStatic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.corba.xbeans.csiv2.css.CSSGSSUPStaticType target = null;
            target = (org.apache.geronimo.corba.xbeans.csiv2.css.CSSGSSUPStaticType)get_store().add_element_user(GSSUPSTATIC$6);
            return target;
        }
    }
    
    /**
     * Unsets the "GSSUPStatic" element
     */
    public void unsetGSSUPStatic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GSSUPSTATIC$6, 0);
        }
    }
    
    /**
     * Gets the "GSSUPDynamic" element
     */
    public org.apache.geronimo.corba.xbeans.csiv2.css.CSSGSSUPDynamicType getGSSUPDynamic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.corba.xbeans.csiv2.css.CSSGSSUPDynamicType target = null;
            target = (org.apache.geronimo.corba.xbeans.csiv2.css.CSSGSSUPDynamicType)get_store().find_element_user(GSSUPDYNAMIC$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "GSSUPDynamic" element
     */
    public boolean isSetGSSUPDynamic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GSSUPDYNAMIC$8) != 0;
        }
    }
    
    /**
     * Sets the "GSSUPDynamic" element
     */
    public void setGSSUPDynamic(org.apache.geronimo.corba.xbeans.csiv2.css.CSSGSSUPDynamicType gssupDynamic)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.corba.xbeans.csiv2.css.CSSGSSUPDynamicType target = null;
            target = (org.apache.geronimo.corba.xbeans.csiv2.css.CSSGSSUPDynamicType)get_store().find_element_user(GSSUPDYNAMIC$8, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.corba.xbeans.csiv2.css.CSSGSSUPDynamicType)get_store().add_element_user(GSSUPDYNAMIC$8);
            }
            target.set(gssupDynamic);
        }
    }
    
    /**
     * Appends and returns a new empty "GSSUPDynamic" element
     */
    public org.apache.geronimo.corba.xbeans.csiv2.css.CSSGSSUPDynamicType addNewGSSUPDynamic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.corba.xbeans.csiv2.css.CSSGSSUPDynamicType target = null;
            target = (org.apache.geronimo.corba.xbeans.csiv2.css.CSSGSSUPDynamicType)get_store().add_element_user(GSSUPDYNAMIC$8);
            return target;
        }
    }
    
    /**
     * Unsets the "GSSUPDynamic" element
     */
    public void unsetGSSUPDynamic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GSSUPDYNAMIC$8, 0);
        }
    }
    
    /**
     * Gets the "sasMech" element
     */
    public org.apache.geronimo.corba.xbeans.csiv2.css.CSSSasMechType getSasMech()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.corba.xbeans.csiv2.css.CSSSasMechType target = null;
            target = (org.apache.geronimo.corba.xbeans.csiv2.css.CSSSasMechType)get_store().find_element_user(SASMECH$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "sasMech" element
     */
    public boolean isSetSasMech()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SASMECH$10) != 0;
        }
    }
    
    /**
     * Sets the "sasMech" element
     */
    public void setSasMech(org.apache.geronimo.corba.xbeans.csiv2.css.CSSSasMechType sasMech)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.corba.xbeans.csiv2.css.CSSSasMechType target = null;
            target = (org.apache.geronimo.corba.xbeans.csiv2.css.CSSSasMechType)get_store().find_element_user(SASMECH$10, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.corba.xbeans.csiv2.css.CSSSasMechType)get_store().add_element_user(SASMECH$10);
            }
            target.set(sasMech);
        }
    }
    
    /**
     * Appends and returns a new empty "sasMech" element
     */
    public org.apache.geronimo.corba.xbeans.csiv2.css.CSSSasMechType addNewSasMech()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.corba.xbeans.csiv2.css.CSSSasMechType target = null;
            target = (org.apache.geronimo.corba.xbeans.csiv2.css.CSSSasMechType)get_store().add_element_user(SASMECH$10);
            return target;
        }
    }
    
    /**
     * Unsets the "sasMech" element
     */
    public void unsetSasMech()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SASMECH$10, 0);
        }
    }
}
