/*
 * XML Type:  tss-linkType
 * Namespace: http://geronimo.apache.org/xml/ns/j2ee/ejb/openejb-2.0
 * Java type: org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbTssLinkType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.openejb.xbeans.ejbjar.impl;
/**
 * An XML tss-linkType(@http://geronimo.apache.org/xml/ns/j2ee/ejb/openejb-2.0).
 *
 * This is a complex type.
 */
public class OpenejbTssLinkTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbTssLinkType
{
    private static final long serialVersionUID = 1L;
    
    public OpenejbTssLinkTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EJBNAME$0 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/j2ee/ejb/openejb-2.0", "ejb-name");
    private static final javax.xml.namespace.QName TSSNAME$2 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/j2ee/ejb/openejb-2.0", "tss-name");
    private static final javax.xml.namespace.QName JNDINAME$4 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/j2ee/ejb/openejb-2.0", "jndi-name");
    
    
    /**
     * Gets the "ejb-name" element
     */
    public java.lang.String getEjbName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EJBNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ejb-name" element
     */
    public org.apache.xmlbeans.XmlString xgetEjbName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EJBNAME$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "ejb-name" element
     */
    public boolean isSetEjbName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EJBNAME$0) != 0;
        }
    }
    
    /**
     * Sets the "ejb-name" element
     */
    public void setEjbName(java.lang.String ejbName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EJBNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EJBNAME$0);
            }
            target.setStringValue(ejbName);
        }
    }
    
    /**
     * Sets (as xml) the "ejb-name" element
     */
    public void xsetEjbName(org.apache.xmlbeans.XmlString ejbName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EJBNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EJBNAME$0);
            }
            target.set(ejbName);
        }
    }
    
    /**
     * Unsets the "ejb-name" element
     */
    public void unsetEjbName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EJBNAME$0, 0);
        }
    }
    
    /**
     * Gets the "tss-name" element
     */
    public java.lang.String getTssName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TSSNAME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "tss-name" element
     */
    public org.apache.xmlbeans.XmlString xgetTssName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TSSNAME$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "tss-name" element
     */
    public boolean isSetTssName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TSSNAME$2) != 0;
        }
    }
    
    /**
     * Sets the "tss-name" element
     */
    public void setTssName(java.lang.String tssName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TSSNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TSSNAME$2);
            }
            target.setStringValue(tssName);
        }
    }
    
    /**
     * Sets (as xml) the "tss-name" element
     */
    public void xsetTssName(org.apache.xmlbeans.XmlString tssName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TSSNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TSSNAME$2);
            }
            target.set(tssName);
        }
    }
    
    /**
     * Unsets the "tss-name" element
     */
    public void unsetTssName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TSSNAME$2, 0);
        }
    }
    
    /**
     * Gets array of all "jndi-name" elements
     */
    public java.lang.String[] getJndiNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(JNDINAME$4, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "jndi-name" element
     */
    public java.lang.String getJndiNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(JNDINAME$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "jndi-name" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetJndiNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(JNDINAME$4, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "jndi-name" element
     */
    public org.apache.xmlbeans.XmlString xgetJndiNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(JNDINAME$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "jndi-name" element
     */
    public int sizeOfJndiNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(JNDINAME$4);
        }
    }
    
    /**
     * Sets array of all "jndi-name" element
     */
    public void setJndiNameArray(java.lang.String[] jndiNameArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(jndiNameArray, JNDINAME$4);
        }
    }
    
    /**
     * Sets ith "jndi-name" element
     */
    public void setJndiNameArray(int i, java.lang.String jndiName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(JNDINAME$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(jndiName);
        }
    }
    
    /**
     * Sets (as xml) array of all "jndi-name" element
     */
    public void xsetJndiNameArray(org.apache.xmlbeans.XmlString[]jndiNameArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(jndiNameArray, JNDINAME$4);
        }
    }
    
    /**
     * Sets (as xml) ith "jndi-name" element
     */
    public void xsetJndiNameArray(int i, org.apache.xmlbeans.XmlString jndiName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(JNDINAME$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(jndiName);
        }
    }
    
    /**
     * Inserts the value as the ith "jndi-name" element
     */
    public void insertJndiName(int i, java.lang.String jndiName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(JNDINAME$4, i);
            target.setStringValue(jndiName);
        }
    }
    
    /**
     * Appends the value as the last "jndi-name" element
     */
    public void addJndiName(java.lang.String jndiName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(JNDINAME$4);
            target.setStringValue(jndiName);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "jndi-name" element
     */
    public org.apache.xmlbeans.XmlString insertNewJndiName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(JNDINAME$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "jndi-name" element
     */
    public org.apache.xmlbeans.XmlString addNewJndiName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(JNDINAME$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "jndi-name" element
     */
    public void removeJndiName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(JNDINAME$4, i);
        }
    }
}
