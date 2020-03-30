/*
 * XML Type:  targetPolicyType
 * Namespace: http://geronimo.apache.org/xml/ns/geronimo-jaspi
 * Java type: org.apache.geronimo.xbeans.geronimo.jaspi.JaspiTargetPolicyType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.geronimo.jaspi.impl;
/**
 * An XML targetPolicyType(@http://geronimo.apache.org/xml/ns/geronimo-jaspi).
 *
 * This is a complex type.
 */
public class JaspiTargetPolicyTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.xbeans.geronimo.jaspi.JaspiTargetPolicyType
{
    private static final long serialVersionUID = 1L;
    
    public JaspiTargetPolicyTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROTECTIONPOLICY$0 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/geronimo-jaspi", "protectionPolicy");
    private static final javax.xml.namespace.QName TARGET$2 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/geronimo-jaspi", "target");
    
    
    /**
     * Gets the "protectionPolicy" element
     */
    public org.apache.geronimo.xbeans.geronimo.jaspi.JaspiProtectionPolicyType getProtectionPolicy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.jaspi.JaspiProtectionPolicyType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.jaspi.JaspiProtectionPolicyType)get_store().find_element_user(PROTECTIONPOLICY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "protectionPolicy" element
     */
    public void setProtectionPolicy(org.apache.geronimo.xbeans.geronimo.jaspi.JaspiProtectionPolicyType protectionPolicy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.jaspi.JaspiProtectionPolicyType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.jaspi.JaspiProtectionPolicyType)get_store().find_element_user(PROTECTIONPOLICY$0, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.xbeans.geronimo.jaspi.JaspiProtectionPolicyType)get_store().add_element_user(PROTECTIONPOLICY$0);
            }
            target.set(protectionPolicy);
        }
    }
    
    /**
     * Appends and returns a new empty "protectionPolicy" element
     */
    public org.apache.geronimo.xbeans.geronimo.jaspi.JaspiProtectionPolicyType addNewProtectionPolicy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.jaspi.JaspiProtectionPolicyType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.jaspi.JaspiProtectionPolicyType)get_store().add_element_user(PROTECTIONPOLICY$0);
            return target;
        }
    }
    
    /**
     * Gets array of all "target" elements
     */
    public org.apache.geronimo.xbeans.geronimo.jaspi.JaspiTargetType[] getTargetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TARGET$2, targetList);
            org.apache.geronimo.xbeans.geronimo.jaspi.JaspiTargetType[] result = new org.apache.geronimo.xbeans.geronimo.jaspi.JaspiTargetType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "target" element
     */
    public org.apache.geronimo.xbeans.geronimo.jaspi.JaspiTargetType getTargetArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.jaspi.JaspiTargetType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.jaspi.JaspiTargetType)get_store().find_element_user(TARGET$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "target" element
     */
    public int sizeOfTargetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TARGET$2);
        }
    }
    
    /**
     * Sets array of all "target" element
     */
    public void setTargetArray(org.apache.geronimo.xbeans.geronimo.jaspi.JaspiTargetType[] targetValueArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(targetValueArray, TARGET$2);
        }
    }
    
    /**
     * Sets ith "target" element
     */
    public void setTargetArray(int i, org.apache.geronimo.xbeans.geronimo.jaspi.JaspiTargetType targetValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.jaspi.JaspiTargetType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.jaspi.JaspiTargetType)get_store().find_element_user(TARGET$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(targetValue);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "target" element
     */
    public org.apache.geronimo.xbeans.geronimo.jaspi.JaspiTargetType insertNewTarget(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.jaspi.JaspiTargetType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.jaspi.JaspiTargetType)get_store().insert_element_user(TARGET$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "target" element
     */
    public org.apache.geronimo.xbeans.geronimo.jaspi.JaspiTargetType addNewTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.jaspi.JaspiTargetType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.jaspi.JaspiTargetType)get_store().add_element_user(TARGET$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "target" element
     */
    public void removeTarget(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TARGET$2, i);
        }
    }
}
