/*
 * XML Type:  connectionmanagerType
 * Namespace: http://geronimo.apache.org/xml/ns/j2ee/connector-1.2
 * Java type: org.apache.geronimo.xbeans.connector.GerConnectionmanagerType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.connector.impl;
/**
 * An XML connectionmanagerType(@http://geronimo.apache.org/xml/ns/j2ee/connector-1.2).
 *
 * This is a complex type.
 */
public class GerConnectionmanagerTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.xbeans.connector.GerConnectionmanagerType
{
    private static final long serialVersionUID = 1L;
    
    public GerConnectionmanagerTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTAINERMANAGEDSECURITY$0 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/j2ee/connector-1.2", "container-managed-security");
    private static final javax.xml.namespace.QName NOTRANSACTION$2 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/j2ee/connector-1.2", "no-transaction");
    private static final javax.xml.namespace.QName LOCALTRANSACTION$4 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/j2ee/connector-1.2", "local-transaction");
    private static final javax.xml.namespace.QName XATRANSACTION$6 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/j2ee/connector-1.2", "xa-transaction");
    private static final javax.xml.namespace.QName TRANSACTIONLOG$8 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/j2ee/connector-1.2", "transaction-log");
    private static final javax.xml.namespace.QName NOPOOL$10 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/j2ee/connector-1.2", "no-pool");
    private static final javax.xml.namespace.QName SINGLEPOOL$12 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/j2ee/connector-1.2", "single-pool");
    private static final javax.xml.namespace.QName PARTITIONEDPOOL$14 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/j2ee/connector-1.2", "partitioned-pool");
    
    
    /**
     * Gets the "container-managed-security" element
     */
    public org.apache.geronimo.xbeans.connector.GerEmptyType getContainerManagedSecurity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.connector.GerEmptyType target = null;
            target = (org.apache.geronimo.xbeans.connector.GerEmptyType)get_store().find_element_user(CONTAINERMANAGEDSECURITY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "container-managed-security" element
     */
    public boolean isSetContainerManagedSecurity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTAINERMANAGEDSECURITY$0) != 0;
        }
    }
    
    /**
     * Sets the "container-managed-security" element
     */
    public void setContainerManagedSecurity(org.apache.geronimo.xbeans.connector.GerEmptyType containerManagedSecurity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.connector.GerEmptyType target = null;
            target = (org.apache.geronimo.xbeans.connector.GerEmptyType)get_store().find_element_user(CONTAINERMANAGEDSECURITY$0, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.xbeans.connector.GerEmptyType)get_store().add_element_user(CONTAINERMANAGEDSECURITY$0);
            }
            target.set(containerManagedSecurity);
        }
    }
    
    /**
     * Appends and returns a new empty "container-managed-security" element
     */
    public org.apache.geronimo.xbeans.connector.GerEmptyType addNewContainerManagedSecurity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.connector.GerEmptyType target = null;
            target = (org.apache.geronimo.xbeans.connector.GerEmptyType)get_store().add_element_user(CONTAINERMANAGEDSECURITY$0);
            return target;
        }
    }
    
    /**
     * Unsets the "container-managed-security" element
     */
    public void unsetContainerManagedSecurity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTAINERMANAGEDSECURITY$0, 0);
        }
    }
    
    /**
     * Gets the "no-transaction" element
     */
    public org.apache.geronimo.xbeans.connector.GerEmptyType getNoTransaction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.connector.GerEmptyType target = null;
            target = (org.apache.geronimo.xbeans.connector.GerEmptyType)get_store().find_element_user(NOTRANSACTION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "no-transaction" element
     */
    public boolean isSetNoTransaction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NOTRANSACTION$2) != 0;
        }
    }
    
    /**
     * Sets the "no-transaction" element
     */
    public void setNoTransaction(org.apache.geronimo.xbeans.connector.GerEmptyType noTransaction)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.connector.GerEmptyType target = null;
            target = (org.apache.geronimo.xbeans.connector.GerEmptyType)get_store().find_element_user(NOTRANSACTION$2, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.xbeans.connector.GerEmptyType)get_store().add_element_user(NOTRANSACTION$2);
            }
            target.set(noTransaction);
        }
    }
    
    /**
     * Appends and returns a new empty "no-transaction" element
     */
    public org.apache.geronimo.xbeans.connector.GerEmptyType addNewNoTransaction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.connector.GerEmptyType target = null;
            target = (org.apache.geronimo.xbeans.connector.GerEmptyType)get_store().add_element_user(NOTRANSACTION$2);
            return target;
        }
    }
    
    /**
     * Unsets the "no-transaction" element
     */
    public void unsetNoTransaction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NOTRANSACTION$2, 0);
        }
    }
    
    /**
     * Gets the "local-transaction" element
     */
    public org.apache.geronimo.xbeans.connector.GerEmptyType getLocalTransaction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.connector.GerEmptyType target = null;
            target = (org.apache.geronimo.xbeans.connector.GerEmptyType)get_store().find_element_user(LOCALTRANSACTION$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "local-transaction" element
     */
    public boolean isSetLocalTransaction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOCALTRANSACTION$4) != 0;
        }
    }
    
    /**
     * Sets the "local-transaction" element
     */
    public void setLocalTransaction(org.apache.geronimo.xbeans.connector.GerEmptyType localTransaction)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.connector.GerEmptyType target = null;
            target = (org.apache.geronimo.xbeans.connector.GerEmptyType)get_store().find_element_user(LOCALTRANSACTION$4, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.xbeans.connector.GerEmptyType)get_store().add_element_user(LOCALTRANSACTION$4);
            }
            target.set(localTransaction);
        }
    }
    
    /**
     * Appends and returns a new empty "local-transaction" element
     */
    public org.apache.geronimo.xbeans.connector.GerEmptyType addNewLocalTransaction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.connector.GerEmptyType target = null;
            target = (org.apache.geronimo.xbeans.connector.GerEmptyType)get_store().add_element_user(LOCALTRANSACTION$4);
            return target;
        }
    }
    
    /**
     * Unsets the "local-transaction" element
     */
    public void unsetLocalTransaction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOCALTRANSACTION$4, 0);
        }
    }
    
    /**
     * Gets the "xa-transaction" element
     */
    public org.apache.geronimo.xbeans.connector.GerXatransactionType getXaTransaction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.connector.GerXatransactionType target = null;
            target = (org.apache.geronimo.xbeans.connector.GerXatransactionType)get_store().find_element_user(XATRANSACTION$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "xa-transaction" element
     */
    public boolean isSetXaTransaction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(XATRANSACTION$6) != 0;
        }
    }
    
    /**
     * Sets the "xa-transaction" element
     */
    public void setXaTransaction(org.apache.geronimo.xbeans.connector.GerXatransactionType xaTransaction)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.connector.GerXatransactionType target = null;
            target = (org.apache.geronimo.xbeans.connector.GerXatransactionType)get_store().find_element_user(XATRANSACTION$6, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.xbeans.connector.GerXatransactionType)get_store().add_element_user(XATRANSACTION$6);
            }
            target.set(xaTransaction);
        }
    }
    
    /**
     * Appends and returns a new empty "xa-transaction" element
     */
    public org.apache.geronimo.xbeans.connector.GerXatransactionType addNewXaTransaction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.connector.GerXatransactionType target = null;
            target = (org.apache.geronimo.xbeans.connector.GerXatransactionType)get_store().add_element_user(XATRANSACTION$6);
            return target;
        }
    }
    
    /**
     * Unsets the "xa-transaction" element
     */
    public void unsetXaTransaction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(XATRANSACTION$6, 0);
        }
    }
    
    /**
     * Gets the "transaction-log" element
     */
    public org.apache.geronimo.xbeans.connector.GerEmptyType getTransactionLog()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.connector.GerEmptyType target = null;
            target = (org.apache.geronimo.xbeans.connector.GerEmptyType)get_store().find_element_user(TRANSACTIONLOG$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "transaction-log" element
     */
    public boolean isSetTransactionLog()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TRANSACTIONLOG$8) != 0;
        }
    }
    
    /**
     * Sets the "transaction-log" element
     */
    public void setTransactionLog(org.apache.geronimo.xbeans.connector.GerEmptyType transactionLog)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.connector.GerEmptyType target = null;
            target = (org.apache.geronimo.xbeans.connector.GerEmptyType)get_store().find_element_user(TRANSACTIONLOG$8, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.xbeans.connector.GerEmptyType)get_store().add_element_user(TRANSACTIONLOG$8);
            }
            target.set(transactionLog);
        }
    }
    
    /**
     * Appends and returns a new empty "transaction-log" element
     */
    public org.apache.geronimo.xbeans.connector.GerEmptyType addNewTransactionLog()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.connector.GerEmptyType target = null;
            target = (org.apache.geronimo.xbeans.connector.GerEmptyType)get_store().add_element_user(TRANSACTIONLOG$8);
            return target;
        }
    }
    
    /**
     * Unsets the "transaction-log" element
     */
    public void unsetTransactionLog()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TRANSACTIONLOG$8, 0);
        }
    }
    
    /**
     * Gets the "no-pool" element
     */
    public org.apache.geronimo.xbeans.connector.GerEmptyType getNoPool()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.connector.GerEmptyType target = null;
            target = (org.apache.geronimo.xbeans.connector.GerEmptyType)get_store().find_element_user(NOPOOL$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "no-pool" element
     */
    public boolean isSetNoPool()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NOPOOL$10) != 0;
        }
    }
    
    /**
     * Sets the "no-pool" element
     */
    public void setNoPool(org.apache.geronimo.xbeans.connector.GerEmptyType noPool)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.connector.GerEmptyType target = null;
            target = (org.apache.geronimo.xbeans.connector.GerEmptyType)get_store().find_element_user(NOPOOL$10, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.xbeans.connector.GerEmptyType)get_store().add_element_user(NOPOOL$10);
            }
            target.set(noPool);
        }
    }
    
    /**
     * Appends and returns a new empty "no-pool" element
     */
    public org.apache.geronimo.xbeans.connector.GerEmptyType addNewNoPool()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.connector.GerEmptyType target = null;
            target = (org.apache.geronimo.xbeans.connector.GerEmptyType)get_store().add_element_user(NOPOOL$10);
            return target;
        }
    }
    
    /**
     * Unsets the "no-pool" element
     */
    public void unsetNoPool()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NOPOOL$10, 0);
        }
    }
    
    /**
     * Gets the "single-pool" element
     */
    public org.apache.geronimo.xbeans.connector.GerSinglepoolType getSinglePool()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.connector.GerSinglepoolType target = null;
            target = (org.apache.geronimo.xbeans.connector.GerSinglepoolType)get_store().find_element_user(SINGLEPOOL$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "single-pool" element
     */
    public boolean isSetSinglePool()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SINGLEPOOL$12) != 0;
        }
    }
    
    /**
     * Sets the "single-pool" element
     */
    public void setSinglePool(org.apache.geronimo.xbeans.connector.GerSinglepoolType singlePool)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.connector.GerSinglepoolType target = null;
            target = (org.apache.geronimo.xbeans.connector.GerSinglepoolType)get_store().find_element_user(SINGLEPOOL$12, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.xbeans.connector.GerSinglepoolType)get_store().add_element_user(SINGLEPOOL$12);
            }
            target.set(singlePool);
        }
    }
    
    /**
     * Appends and returns a new empty "single-pool" element
     */
    public org.apache.geronimo.xbeans.connector.GerSinglepoolType addNewSinglePool()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.connector.GerSinglepoolType target = null;
            target = (org.apache.geronimo.xbeans.connector.GerSinglepoolType)get_store().add_element_user(SINGLEPOOL$12);
            return target;
        }
    }
    
    /**
     * Unsets the "single-pool" element
     */
    public void unsetSinglePool()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SINGLEPOOL$12, 0);
        }
    }
    
    /**
     * Gets the "partitioned-pool" element
     */
    public org.apache.geronimo.xbeans.connector.GerPartitionedpoolType getPartitionedPool()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.connector.GerPartitionedpoolType target = null;
            target = (org.apache.geronimo.xbeans.connector.GerPartitionedpoolType)get_store().find_element_user(PARTITIONEDPOOL$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "partitioned-pool" element
     */
    public boolean isSetPartitionedPool()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARTITIONEDPOOL$14) != 0;
        }
    }
    
    /**
     * Sets the "partitioned-pool" element
     */
    public void setPartitionedPool(org.apache.geronimo.xbeans.connector.GerPartitionedpoolType partitionedPool)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.connector.GerPartitionedpoolType target = null;
            target = (org.apache.geronimo.xbeans.connector.GerPartitionedpoolType)get_store().find_element_user(PARTITIONEDPOOL$14, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.xbeans.connector.GerPartitionedpoolType)get_store().add_element_user(PARTITIONEDPOOL$14);
            }
            target.set(partitionedPool);
        }
    }
    
    /**
     * Appends and returns a new empty "partitioned-pool" element
     */
    public org.apache.geronimo.xbeans.connector.GerPartitionedpoolType addNewPartitionedPool()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.connector.GerPartitionedpoolType target = null;
            target = (org.apache.geronimo.xbeans.connector.GerPartitionedpoolType)get_store().add_element_user(PARTITIONEDPOOL$14);
            return target;
        }
    }
    
    /**
     * Unsets the "partitioned-pool" element
     */
    public void unsetPartitionedPool()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARTITIONEDPOOL$14, 0);
        }
    }
}
