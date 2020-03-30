/*
 * XML Type:  resourceadapterType
 * Namespace: http://geronimo.apache.org/xml/ns/j2ee/connector-1.2
 * Java type: org.apache.geronimo.xbeans.connector.GerResourceadapterType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.connector.impl;
/**
 * An XML resourceadapterType(@http://geronimo.apache.org/xml/ns/j2ee/connector-1.2).
 *
 * This is a complex type.
 */
public class GerResourceadapterTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.xbeans.connector.GerResourceadapterType
{
    private static final long serialVersionUID = 1L;
    
    public GerResourceadapterTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESOURCEADAPTERINSTANCE$0 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/j2ee/connector-1.2", "resourceadapter-instance");
    private static final javax.xml.namespace.QName OUTBOUNDRESOURCEADAPTER$2 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/j2ee/connector-1.2", "outbound-resourceadapter");
    private static final javax.xml.namespace.QName ADMINOBJECT$4 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/j2ee/connector-1.2", "adminobject");
    
    
    /**
     * Gets the "resourceadapter-instance" element
     */
    public org.apache.geronimo.xbeans.connector.GerResourceadapterInstanceType getResourceadapterInstance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.connector.GerResourceadapterInstanceType target = null;
            target = (org.apache.geronimo.xbeans.connector.GerResourceadapterInstanceType)get_store().find_element_user(RESOURCEADAPTERINSTANCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "resourceadapter-instance" element
     */
    public boolean isSetResourceadapterInstance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESOURCEADAPTERINSTANCE$0) != 0;
        }
    }
    
    /**
     * Sets the "resourceadapter-instance" element
     */
    public void setResourceadapterInstance(org.apache.geronimo.xbeans.connector.GerResourceadapterInstanceType resourceadapterInstance)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.connector.GerResourceadapterInstanceType target = null;
            target = (org.apache.geronimo.xbeans.connector.GerResourceadapterInstanceType)get_store().find_element_user(RESOURCEADAPTERINSTANCE$0, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.xbeans.connector.GerResourceadapterInstanceType)get_store().add_element_user(RESOURCEADAPTERINSTANCE$0);
            }
            target.set(resourceadapterInstance);
        }
    }
    
    /**
     * Appends and returns a new empty "resourceadapter-instance" element
     */
    public org.apache.geronimo.xbeans.connector.GerResourceadapterInstanceType addNewResourceadapterInstance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.connector.GerResourceadapterInstanceType target = null;
            target = (org.apache.geronimo.xbeans.connector.GerResourceadapterInstanceType)get_store().add_element_user(RESOURCEADAPTERINSTANCE$0);
            return target;
        }
    }
    
    /**
     * Unsets the "resourceadapter-instance" element
     */
    public void unsetResourceadapterInstance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESOURCEADAPTERINSTANCE$0, 0);
        }
    }
    
    /**
     * Gets the "outbound-resourceadapter" element
     */
    public org.apache.geronimo.xbeans.connector.GerOutboundResourceadapterType getOutboundResourceadapter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.connector.GerOutboundResourceadapterType target = null;
            target = (org.apache.geronimo.xbeans.connector.GerOutboundResourceadapterType)get_store().find_element_user(OUTBOUNDRESOURCEADAPTER$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "outbound-resourceadapter" element
     */
    public boolean isSetOutboundResourceadapter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OUTBOUNDRESOURCEADAPTER$2) != 0;
        }
    }
    
    /**
     * Sets the "outbound-resourceadapter" element
     */
    public void setOutboundResourceadapter(org.apache.geronimo.xbeans.connector.GerOutboundResourceadapterType outboundResourceadapter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.connector.GerOutboundResourceadapterType target = null;
            target = (org.apache.geronimo.xbeans.connector.GerOutboundResourceadapterType)get_store().find_element_user(OUTBOUNDRESOURCEADAPTER$2, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.xbeans.connector.GerOutboundResourceadapterType)get_store().add_element_user(OUTBOUNDRESOURCEADAPTER$2);
            }
            target.set(outboundResourceadapter);
        }
    }
    
    /**
     * Appends and returns a new empty "outbound-resourceadapter" element
     */
    public org.apache.geronimo.xbeans.connector.GerOutboundResourceadapterType addNewOutboundResourceadapter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.connector.GerOutboundResourceadapterType target = null;
            target = (org.apache.geronimo.xbeans.connector.GerOutboundResourceadapterType)get_store().add_element_user(OUTBOUNDRESOURCEADAPTER$2);
            return target;
        }
    }
    
    /**
     * Unsets the "outbound-resourceadapter" element
     */
    public void unsetOutboundResourceadapter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OUTBOUNDRESOURCEADAPTER$2, 0);
        }
    }
    
    /**
     * Gets array of all "adminobject" elements
     */
    public org.apache.geronimo.xbeans.connector.GerAdminobjectType[] getAdminobjectArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ADMINOBJECT$4, targetList);
            org.apache.geronimo.xbeans.connector.GerAdminobjectType[] result = new org.apache.geronimo.xbeans.connector.GerAdminobjectType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "adminobject" element
     */
    public org.apache.geronimo.xbeans.connector.GerAdminobjectType getAdminobjectArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.connector.GerAdminobjectType target = null;
            target = (org.apache.geronimo.xbeans.connector.GerAdminobjectType)get_store().find_element_user(ADMINOBJECT$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "adminobject" element
     */
    public int sizeOfAdminobjectArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADMINOBJECT$4);
        }
    }
    
    /**
     * Sets array of all "adminobject" element
     */
    public void setAdminobjectArray(org.apache.geronimo.xbeans.connector.GerAdminobjectType[] adminobjectArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(adminobjectArray, ADMINOBJECT$4);
        }
    }
    
    /**
     * Sets ith "adminobject" element
     */
    public void setAdminobjectArray(int i, org.apache.geronimo.xbeans.connector.GerAdminobjectType adminobject)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.connector.GerAdminobjectType target = null;
            target = (org.apache.geronimo.xbeans.connector.GerAdminobjectType)get_store().find_element_user(ADMINOBJECT$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(adminobject);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "adminobject" element
     */
    public org.apache.geronimo.xbeans.connector.GerAdminobjectType insertNewAdminobject(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.connector.GerAdminobjectType target = null;
            target = (org.apache.geronimo.xbeans.connector.GerAdminobjectType)get_store().insert_element_user(ADMINOBJECT$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "adminobject" element
     */
    public org.apache.geronimo.xbeans.connector.GerAdminobjectType addNewAdminobject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.connector.GerAdminobjectType target = null;
            target = (org.apache.geronimo.xbeans.connector.GerAdminobjectType)get_store().add_element_user(ADMINOBJECT$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "adminobject" element
     */
    public void removeAdminobject(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADMINOBJECT$4, i);
        }
    }
}
