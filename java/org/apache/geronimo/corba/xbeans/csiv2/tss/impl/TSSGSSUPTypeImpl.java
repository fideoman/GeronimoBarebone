/*
 * XML Type:  GSSUPType
 * Namespace: http://openejb.apache.org/xml/ns/corba-tss-config-2.1
 * Java type: org.apache.geronimo.corba.xbeans.csiv2.tss.TSSGSSUPType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.corba.xbeans.csiv2.tss.impl;
/**
 * An XML GSSUPType(@http://openejb.apache.org/xml/ns/corba-tss-config-2.1).
 *
 * This is a complex type.
 */
public class TSSGSSUPTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.corba.xbeans.csiv2.tss.TSSGSSUPType
{
    private static final long serialVersionUID = 1L;
    
    public TSSGSSUPTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DESCRIPTION$0 = 
        new javax.xml.namespace.QName("http://openejb.apache.org/xml/ns/corba-tss-config-2.1", "description");
    private static final javax.xml.namespace.QName TARGETNAME$2 = 
        new javax.xml.namespace.QName("", "targetName");
    private static final javax.xml.namespace.QName REQUIRED$4 = 
        new javax.xml.namespace.QName("", "required");
    
    
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
     * Gets the "targetName" attribute
     */
    public java.lang.String getTargetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TARGETNAME$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "targetName" attribute
     */
    public org.apache.xmlbeans.XmlString xgetTargetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TARGETNAME$2);
            return target;
        }
    }
    
    /**
     * True if has "targetName" attribute
     */
    public boolean isSetTargetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TARGETNAME$2) != null;
        }
    }
    
    /**
     * Sets the "targetName" attribute
     */
    public void setTargetName(java.lang.String targetName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TARGETNAME$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TARGETNAME$2);
            }
            target.setStringValue(targetName);
        }
    }
    
    /**
     * Sets (as xml) the "targetName" attribute
     */
    public void xsetTargetName(org.apache.xmlbeans.XmlString targetName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TARGETNAME$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TARGETNAME$2);
            }
            target.set(targetName);
        }
    }
    
    /**
     * Unsets the "targetName" attribute
     */
    public void unsetTargetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TARGETNAME$2);
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
