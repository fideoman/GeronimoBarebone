/*
 * XML Type:  partitionedpoolType
 * Namespace: http://geronimo.apache.org/xml/ns/j2ee/connector-1.2
 * Java type: org.apache.geronimo.xbeans.connector.GerPartitionedpoolType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.connector.impl;
/**
 * An XML partitionedpoolType(@http://geronimo.apache.org/xml/ns/j2ee/connector-1.2).
 *
 * This is a complex type.
 */
public class GerPartitionedpoolTypeImpl extends org.apache.geronimo.xbeans.connector.impl.GerSinglepoolTypeImpl implements org.apache.geronimo.xbeans.connector.GerPartitionedpoolType
{
    private static final long serialVersionUID = 1L;
    
    public GerPartitionedpoolTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARTITIONBYSUBJECT$0 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/j2ee/connector-1.2", "partition-by-subject");
    private static final javax.xml.namespace.QName PARTITIONBYCONNECTIONREQUESTINFO$2 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/j2ee/connector-1.2", "partition-by-connectionrequestinfo");
    
    
    /**
     * Gets the "partition-by-subject" element
     */
    public org.apache.geronimo.xbeans.connector.GerEmptyType getPartitionBySubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.connector.GerEmptyType target = null;
            target = (org.apache.geronimo.xbeans.connector.GerEmptyType)get_store().find_element_user(PARTITIONBYSUBJECT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "partition-by-subject" element
     */
    public boolean isSetPartitionBySubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARTITIONBYSUBJECT$0) != 0;
        }
    }
    
    /**
     * Sets the "partition-by-subject" element
     */
    public void setPartitionBySubject(org.apache.geronimo.xbeans.connector.GerEmptyType partitionBySubject)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.connector.GerEmptyType target = null;
            target = (org.apache.geronimo.xbeans.connector.GerEmptyType)get_store().find_element_user(PARTITIONBYSUBJECT$0, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.xbeans.connector.GerEmptyType)get_store().add_element_user(PARTITIONBYSUBJECT$0);
            }
            target.set(partitionBySubject);
        }
    }
    
    /**
     * Appends and returns a new empty "partition-by-subject" element
     */
    public org.apache.geronimo.xbeans.connector.GerEmptyType addNewPartitionBySubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.connector.GerEmptyType target = null;
            target = (org.apache.geronimo.xbeans.connector.GerEmptyType)get_store().add_element_user(PARTITIONBYSUBJECT$0);
            return target;
        }
    }
    
    /**
     * Unsets the "partition-by-subject" element
     */
    public void unsetPartitionBySubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARTITIONBYSUBJECT$0, 0);
        }
    }
    
    /**
     * Gets the "partition-by-connectionrequestinfo" element
     */
    public org.apache.geronimo.xbeans.connector.GerEmptyType getPartitionByConnectionrequestinfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.connector.GerEmptyType target = null;
            target = (org.apache.geronimo.xbeans.connector.GerEmptyType)get_store().find_element_user(PARTITIONBYCONNECTIONREQUESTINFO$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "partition-by-connectionrequestinfo" element
     */
    public boolean isSetPartitionByConnectionrequestinfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARTITIONBYCONNECTIONREQUESTINFO$2) != 0;
        }
    }
    
    /**
     * Sets the "partition-by-connectionrequestinfo" element
     */
    public void setPartitionByConnectionrequestinfo(org.apache.geronimo.xbeans.connector.GerEmptyType partitionByConnectionrequestinfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.connector.GerEmptyType target = null;
            target = (org.apache.geronimo.xbeans.connector.GerEmptyType)get_store().find_element_user(PARTITIONBYCONNECTIONREQUESTINFO$2, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.xbeans.connector.GerEmptyType)get_store().add_element_user(PARTITIONBYCONNECTIONREQUESTINFO$2);
            }
            target.set(partitionByConnectionrequestinfo);
        }
    }
    
    /**
     * Appends and returns a new empty "partition-by-connectionrequestinfo" element
     */
    public org.apache.geronimo.xbeans.connector.GerEmptyType addNewPartitionByConnectionrequestinfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.connector.GerEmptyType target = null;
            target = (org.apache.geronimo.xbeans.connector.GerEmptyType)get_store().add_element_user(PARTITIONBYCONNECTIONREQUESTINFO$2);
            return target;
        }
    }
    
    /**
     * Unsets the "partition-by-connectionrequestinfo" element
     */
    public void unsetPartitionByConnectionrequestinfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARTITIONBYCONNECTIONREQUESTINFO$2, 0);
        }
    }
}
