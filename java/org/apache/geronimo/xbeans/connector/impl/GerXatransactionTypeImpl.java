/*
 * XML Type:  xatransactionType
 * Namespace: http://geronimo.apache.org/xml/ns/j2ee/connector-1.2
 * Java type: org.apache.geronimo.xbeans.connector.GerXatransactionType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.connector.impl;
/**
 * An XML xatransactionType(@http://geronimo.apache.org/xml/ns/j2ee/connector-1.2).
 *
 * This is a complex type.
 */
public class GerXatransactionTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.xbeans.connector.GerXatransactionType
{
    private static final long serialVersionUID = 1L;
    
    public GerXatransactionTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TRANSACTIONCACHING$0 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/j2ee/connector-1.2", "transaction-caching");
    private static final javax.xml.namespace.QName THREADCACHING$2 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/j2ee/connector-1.2", "thread-caching");
    
    
    /**
     * Gets the "transaction-caching" element
     */
    public org.apache.geronimo.xbeans.connector.GerEmptyType getTransactionCaching()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.connector.GerEmptyType target = null;
            target = (org.apache.geronimo.xbeans.connector.GerEmptyType)get_store().find_element_user(TRANSACTIONCACHING$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "transaction-caching" element
     */
    public boolean isSetTransactionCaching()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TRANSACTIONCACHING$0) != 0;
        }
    }
    
    /**
     * Sets the "transaction-caching" element
     */
    public void setTransactionCaching(org.apache.geronimo.xbeans.connector.GerEmptyType transactionCaching)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.connector.GerEmptyType target = null;
            target = (org.apache.geronimo.xbeans.connector.GerEmptyType)get_store().find_element_user(TRANSACTIONCACHING$0, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.xbeans.connector.GerEmptyType)get_store().add_element_user(TRANSACTIONCACHING$0);
            }
            target.set(transactionCaching);
        }
    }
    
    /**
     * Appends and returns a new empty "transaction-caching" element
     */
    public org.apache.geronimo.xbeans.connector.GerEmptyType addNewTransactionCaching()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.connector.GerEmptyType target = null;
            target = (org.apache.geronimo.xbeans.connector.GerEmptyType)get_store().add_element_user(TRANSACTIONCACHING$0);
            return target;
        }
    }
    
    /**
     * Unsets the "transaction-caching" element
     */
    public void unsetTransactionCaching()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TRANSACTIONCACHING$0, 0);
        }
    }
    
    /**
     * Gets the "thread-caching" element
     */
    public org.apache.geronimo.xbeans.connector.GerEmptyType getThreadCaching()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.connector.GerEmptyType target = null;
            target = (org.apache.geronimo.xbeans.connector.GerEmptyType)get_store().find_element_user(THREADCACHING$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "thread-caching" element
     */
    public boolean isSetThreadCaching()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(THREADCACHING$2) != 0;
        }
    }
    
    /**
     * Sets the "thread-caching" element
     */
    public void setThreadCaching(org.apache.geronimo.xbeans.connector.GerEmptyType threadCaching)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.connector.GerEmptyType target = null;
            target = (org.apache.geronimo.xbeans.connector.GerEmptyType)get_store().find_element_user(THREADCACHING$2, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.xbeans.connector.GerEmptyType)get_store().add_element_user(THREADCACHING$2);
            }
            target.set(threadCaching);
        }
    }
    
    /**
     * Appends and returns a new empty "thread-caching" element
     */
    public org.apache.geronimo.xbeans.connector.GerEmptyType addNewThreadCaching()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.connector.GerEmptyType target = null;
            target = (org.apache.geronimo.xbeans.connector.GerEmptyType)get_store().add_element_user(THREADCACHING$2);
            return target;
        }
    }
    
    /**
     * Unsets the "thread-caching" element
     */
    public void unsetThreadCaching()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(THREADCACHING$2, 0);
        }
    }
}
