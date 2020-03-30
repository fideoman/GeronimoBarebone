/*
 * XML Type:  adminobjectType
 * Namespace: http://geronimo.apache.org/xml/ns/j2ee/connector-1.2
 * Java type: org.apache.geronimo.xbeans.connector.GerAdminobjectType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.connector.impl;
/**
 * An XML adminobjectType(@http://geronimo.apache.org/xml/ns/j2ee/connector-1.2).
 *
 * This is a complex type.
 */
public class GerAdminobjectTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.xbeans.connector.GerAdminobjectType
{
    private static final long serialVersionUID = 1L;
    
    public GerAdminobjectTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADMINOBJECTINTERFACE$0 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/j2ee/connector-1.2", "adminobject-interface");
    private static final javax.xml.namespace.QName ADMINOBJECTCLASS$2 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/j2ee/connector-1.2", "adminobject-class");
    private static final javax.xml.namespace.QName ADMINOBJECTINSTANCE$4 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/j2ee/connector-1.2", "adminobject-instance");
    
    
    /**
     * Gets the "adminobject-interface" element
     */
    public java.lang.String getAdminobjectInterface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADMINOBJECTINTERFACE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "adminobject-interface" element
     */
    public org.apache.geronimo.xbeans.connector.GerFullyQualifiedClassType xgetAdminobjectInterface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.connector.GerFullyQualifiedClassType target = null;
            target = (org.apache.geronimo.xbeans.connector.GerFullyQualifiedClassType)get_store().find_element_user(ADMINOBJECTINTERFACE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "adminobject-interface" element
     */
    public void setAdminobjectInterface(java.lang.String adminobjectInterface)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADMINOBJECTINTERFACE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADMINOBJECTINTERFACE$0);
            }
            target.setStringValue(adminobjectInterface);
        }
    }
    
    /**
     * Sets (as xml) the "adminobject-interface" element
     */
    public void xsetAdminobjectInterface(org.apache.geronimo.xbeans.connector.GerFullyQualifiedClassType adminobjectInterface)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.connector.GerFullyQualifiedClassType target = null;
            target = (org.apache.geronimo.xbeans.connector.GerFullyQualifiedClassType)get_store().find_element_user(ADMINOBJECTINTERFACE$0, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.xbeans.connector.GerFullyQualifiedClassType)get_store().add_element_user(ADMINOBJECTINTERFACE$0);
            }
            target.set(adminobjectInterface);
        }
    }
    
    /**
     * Gets the "adminobject-class" element
     */
    public java.lang.String getAdminobjectClass()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADMINOBJECTCLASS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "adminobject-class" element
     */
    public org.apache.geronimo.xbeans.connector.GerFullyQualifiedClassType xgetAdminobjectClass()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.connector.GerFullyQualifiedClassType target = null;
            target = (org.apache.geronimo.xbeans.connector.GerFullyQualifiedClassType)get_store().find_element_user(ADMINOBJECTCLASS$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "adminobject-class" element
     */
    public void setAdminobjectClass(java.lang.String adminobjectClass)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADMINOBJECTCLASS$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADMINOBJECTCLASS$2);
            }
            target.setStringValue(adminobjectClass);
        }
    }
    
    /**
     * Sets (as xml) the "adminobject-class" element
     */
    public void xsetAdminobjectClass(org.apache.geronimo.xbeans.connector.GerFullyQualifiedClassType adminobjectClass)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.connector.GerFullyQualifiedClassType target = null;
            target = (org.apache.geronimo.xbeans.connector.GerFullyQualifiedClassType)get_store().find_element_user(ADMINOBJECTCLASS$2, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.xbeans.connector.GerFullyQualifiedClassType)get_store().add_element_user(ADMINOBJECTCLASS$2);
            }
            target.set(adminobjectClass);
        }
    }
    
    /**
     * Gets array of all "adminobject-instance" elements
     */
    public org.apache.geronimo.xbeans.connector.GerAdminobjectInstanceType[] getAdminobjectInstanceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ADMINOBJECTINSTANCE$4, targetList);
            org.apache.geronimo.xbeans.connector.GerAdminobjectInstanceType[] result = new org.apache.geronimo.xbeans.connector.GerAdminobjectInstanceType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "adminobject-instance" element
     */
    public org.apache.geronimo.xbeans.connector.GerAdminobjectInstanceType getAdminobjectInstanceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.connector.GerAdminobjectInstanceType target = null;
            target = (org.apache.geronimo.xbeans.connector.GerAdminobjectInstanceType)get_store().find_element_user(ADMINOBJECTINSTANCE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "adminobject-instance" element
     */
    public int sizeOfAdminobjectInstanceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADMINOBJECTINSTANCE$4);
        }
    }
    
    /**
     * Sets array of all "adminobject-instance" element
     */
    public void setAdminobjectInstanceArray(org.apache.geronimo.xbeans.connector.GerAdminobjectInstanceType[] adminobjectInstanceArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(adminobjectInstanceArray, ADMINOBJECTINSTANCE$4);
        }
    }
    
    /**
     * Sets ith "adminobject-instance" element
     */
    public void setAdminobjectInstanceArray(int i, org.apache.geronimo.xbeans.connector.GerAdminobjectInstanceType adminobjectInstance)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.connector.GerAdminobjectInstanceType target = null;
            target = (org.apache.geronimo.xbeans.connector.GerAdminobjectInstanceType)get_store().find_element_user(ADMINOBJECTINSTANCE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(adminobjectInstance);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "adminobject-instance" element
     */
    public org.apache.geronimo.xbeans.connector.GerAdminobjectInstanceType insertNewAdminobjectInstance(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.connector.GerAdminobjectInstanceType target = null;
            target = (org.apache.geronimo.xbeans.connector.GerAdminobjectInstanceType)get_store().insert_element_user(ADMINOBJECTINSTANCE$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "adminobject-instance" element
     */
    public org.apache.geronimo.xbeans.connector.GerAdminobjectInstanceType addNewAdminobjectInstance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.connector.GerAdminobjectInstanceType target = null;
            target = (org.apache.geronimo.xbeans.connector.GerAdminobjectInstanceType)get_store().add_element_user(ADMINOBJECTINSTANCE$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "adminobject-instance" element
     */
    public void removeAdminobjectInstance(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADMINOBJECTINSTANCE$4, i);
        }
    }
}
