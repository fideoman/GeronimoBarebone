/*
 * XML Type:  compoundSecMechType
 * Namespace: http://openejb.apache.org/xml/ns/corba-tss-config-2.1
 * Java type: org.apache.geronimo.corba.xbeans.csiv2.tss.TSSCompoundSecMechType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.corba.xbeans.csiv2.tss.impl;
/**
 * An XML compoundSecMechType(@http://openejb.apache.org/xml/ns/corba-tss-config-2.1).
 *
 * This is a complex type.
 */
public class TSSCompoundSecMechTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.corba.xbeans.csiv2.tss.TSSCompoundSecMechType
{
    private static final long serialVersionUID = 1L;
    
    public TSSCompoundSecMechTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DESCRIPTION$0 = 
        new javax.xml.namespace.QName("http://openejb.apache.org/xml/ns/corba-tss-config-2.1", "description");
    private static final javax.xml.namespace.QName GSSUP$2 = 
        new javax.xml.namespace.QName("http://openejb.apache.org/xml/ns/corba-tss-config-2.1", "GSSUP");
    private static final javax.xml.namespace.QName SASMECH$4 = 
        new javax.xml.namespace.QName("http://openejb.apache.org/xml/ns/corba-tss-config-2.1", "sasMech");
    
    
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
     * Gets the "GSSUP" element
     */
    public org.apache.geronimo.corba.xbeans.csiv2.tss.TSSGSSUPType getGSSUP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.corba.xbeans.csiv2.tss.TSSGSSUPType target = null;
            target = (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSGSSUPType)get_store().find_element_user(GSSUP$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "GSSUP" element
     */
    public boolean isSetGSSUP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GSSUP$2) != 0;
        }
    }
    
    /**
     * Sets the "GSSUP" element
     */
    public void setGSSUP(org.apache.geronimo.corba.xbeans.csiv2.tss.TSSGSSUPType gssup)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.corba.xbeans.csiv2.tss.TSSGSSUPType target = null;
            target = (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSGSSUPType)get_store().find_element_user(GSSUP$2, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSGSSUPType)get_store().add_element_user(GSSUP$2);
            }
            target.set(gssup);
        }
    }
    
    /**
     * Appends and returns a new empty "GSSUP" element
     */
    public org.apache.geronimo.corba.xbeans.csiv2.tss.TSSGSSUPType addNewGSSUP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.corba.xbeans.csiv2.tss.TSSGSSUPType target = null;
            target = (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSGSSUPType)get_store().add_element_user(GSSUP$2);
            return target;
        }
    }
    
    /**
     * Unsets the "GSSUP" element
     */
    public void unsetGSSUP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GSSUP$2, 0);
        }
    }
    
    /**
     * Gets the "sasMech" element
     */
    public org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSasMechType getSasMech()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSasMechType target = null;
            target = (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSasMechType)get_store().find_element_user(SASMECH$4, 0);
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
            return get_store().count_elements(SASMECH$4) != 0;
        }
    }
    
    /**
     * Sets the "sasMech" element
     */
    public void setSasMech(org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSasMechType sasMech)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSasMechType target = null;
            target = (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSasMechType)get_store().find_element_user(SASMECH$4, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSasMechType)get_store().add_element_user(SASMECH$4);
            }
            target.set(sasMech);
        }
    }
    
    /**
     * Appends and returns a new empty "sasMech" element
     */
    public org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSasMechType addNewSasMech()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSasMechType target = null;
            target = (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSasMechType)get_store().add_element_user(SASMECH$4);
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
            get_store().remove_element(SASMECH$4, 0);
        }
    }
}
