/*
 * XML Type:  messagePolicyType
 * Namespace: http://geronimo.apache.org/xml/ns/geronimo-jaspi
 * Java type: org.apache.geronimo.xbeans.geronimo.jaspi.JaspiMessagePolicyType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.geronimo.jaspi.impl;
/**
 * An XML messagePolicyType(@http://geronimo.apache.org/xml/ns/geronimo-jaspi).
 *
 * This is a complex type.
 */
public class JaspiMessagePolicyTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.xbeans.geronimo.jaspi.JaspiMessagePolicyType
{
    private static final long serialVersionUID = 1L;
    
    public JaspiMessagePolicyTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TARGETPOLICY$0 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/geronimo-jaspi", "targetPolicy");
    private static final javax.xml.namespace.QName MANDATORY$2 = 
        new javax.xml.namespace.QName("", "mandatory");
    
    
    /**
     * Gets array of all "targetPolicy" elements
     */
    public org.apache.geronimo.xbeans.geronimo.jaspi.JaspiTargetPolicyType[] getTargetPolicyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TARGETPOLICY$0, targetList);
            org.apache.geronimo.xbeans.geronimo.jaspi.JaspiTargetPolicyType[] result = new org.apache.geronimo.xbeans.geronimo.jaspi.JaspiTargetPolicyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "targetPolicy" element
     */
    public org.apache.geronimo.xbeans.geronimo.jaspi.JaspiTargetPolicyType getTargetPolicyArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.jaspi.JaspiTargetPolicyType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.jaspi.JaspiTargetPolicyType)get_store().find_element_user(TARGETPOLICY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "targetPolicy" element
     */
    public int sizeOfTargetPolicyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TARGETPOLICY$0);
        }
    }
    
    /**
     * Sets array of all "targetPolicy" element
     */
    public void setTargetPolicyArray(org.apache.geronimo.xbeans.geronimo.jaspi.JaspiTargetPolicyType[] targetPolicyArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(targetPolicyArray, TARGETPOLICY$0);
        }
    }
    
    /**
     * Sets ith "targetPolicy" element
     */
    public void setTargetPolicyArray(int i, org.apache.geronimo.xbeans.geronimo.jaspi.JaspiTargetPolicyType targetPolicy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.jaspi.JaspiTargetPolicyType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.jaspi.JaspiTargetPolicyType)get_store().find_element_user(TARGETPOLICY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(targetPolicy);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "targetPolicy" element
     */
    public org.apache.geronimo.xbeans.geronimo.jaspi.JaspiTargetPolicyType insertNewTargetPolicy(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.jaspi.JaspiTargetPolicyType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.jaspi.JaspiTargetPolicyType)get_store().insert_element_user(TARGETPOLICY$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "targetPolicy" element
     */
    public org.apache.geronimo.xbeans.geronimo.jaspi.JaspiTargetPolicyType addNewTargetPolicy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.jaspi.JaspiTargetPolicyType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.jaspi.JaspiTargetPolicyType)get_store().add_element_user(TARGETPOLICY$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "targetPolicy" element
     */
    public void removeTargetPolicy(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TARGETPOLICY$0, i);
        }
    }
    
    /**
     * Gets the "mandatory" attribute
     */
    public boolean getMandatory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MANDATORY$2);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "mandatory" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetMandatory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(MANDATORY$2);
            return target;
        }
    }
    
    /**
     * True if has "mandatory" attribute
     */
    public boolean isSetMandatory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MANDATORY$2) != null;
        }
    }
    
    /**
     * Sets the "mandatory" attribute
     */
    public void setMandatory(boolean mandatory)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MANDATORY$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MANDATORY$2);
            }
            target.setBooleanValue(mandatory);
        }
    }
    
    /**
     * Sets (as xml) the "mandatory" attribute
     */
    public void xsetMandatory(org.apache.xmlbeans.XmlBoolean mandatory)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(MANDATORY$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(MANDATORY$2);
            }
            target.set(mandatory);
        }
    }
    
    /**
     * Unsets the "mandatory" attribute
     */
    public void unsetMandatory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MANDATORY$2);
        }
    }
}
