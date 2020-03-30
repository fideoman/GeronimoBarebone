/*
 * XML Type:  singlepoolType
 * Namespace: http://geronimo.apache.org/xml/ns/j2ee/connector-1.2
 * Java type: org.apache.geronimo.xbeans.connector.GerSinglepoolType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.connector.impl;
/**
 * An XML singlepoolType(@http://geronimo.apache.org/xml/ns/j2ee/connector-1.2).
 *
 * This is a complex type.
 */
public class GerSinglepoolTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.xbeans.connector.GerSinglepoolType
{
    private static final long serialVersionUID = 1L;
    
    public GerSinglepoolTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MAXSIZE$0 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/j2ee/connector-1.2", "max-size");
    private static final javax.xml.namespace.QName MINSIZE$2 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/j2ee/connector-1.2", "min-size");
    private static final javax.xml.namespace.QName BLOCKINGTIMEOUTMILLISECONDS$4 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/j2ee/connector-1.2", "blocking-timeout-milliseconds");
    private static final javax.xml.namespace.QName IDLETIMEOUTMINUTES$6 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/j2ee/connector-1.2", "idle-timeout-minutes");
    private static final javax.xml.namespace.QName MATCHONE$8 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/j2ee/connector-1.2", "match-one");
    private static final javax.xml.namespace.QName MATCHALL$10 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/j2ee/connector-1.2", "match-all");
    private static final javax.xml.namespace.QName SELECTONEASSUMEMATCH$12 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/j2ee/connector-1.2", "select-one-assume-match");
    
    
    /**
     * Gets the "max-size" element
     */
    public int getMaxSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXSIZE$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "max-size" element
     */
    public org.apache.xmlbeans.XmlInt xgetMaxSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MAXSIZE$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "max-size" element
     */
    public boolean isSetMaxSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MAXSIZE$0) != 0;
        }
    }
    
    /**
     * Sets the "max-size" element
     */
    public void setMaxSize(int maxSize)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXSIZE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MAXSIZE$0);
            }
            target.setIntValue(maxSize);
        }
    }
    
    /**
     * Sets (as xml) the "max-size" element
     */
    public void xsetMaxSize(org.apache.xmlbeans.XmlInt maxSize)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MAXSIZE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(MAXSIZE$0);
            }
            target.set(maxSize);
        }
    }
    
    /**
     * Unsets the "max-size" element
     */
    public void unsetMaxSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MAXSIZE$0, 0);
        }
    }
    
    /**
     * Gets the "min-size" element
     */
    public int getMinSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINSIZE$2, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "min-size" element
     */
    public org.apache.xmlbeans.XmlInt xgetMinSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MINSIZE$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "min-size" element
     */
    public boolean isSetMinSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MINSIZE$2) != 0;
        }
    }
    
    /**
     * Sets the "min-size" element
     */
    public void setMinSize(int minSize)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINSIZE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MINSIZE$2);
            }
            target.setIntValue(minSize);
        }
    }
    
    /**
     * Sets (as xml) the "min-size" element
     */
    public void xsetMinSize(org.apache.xmlbeans.XmlInt minSize)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MINSIZE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(MINSIZE$2);
            }
            target.set(minSize);
        }
    }
    
    /**
     * Unsets the "min-size" element
     */
    public void unsetMinSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MINSIZE$2, 0);
        }
    }
    
    /**
     * Gets the "blocking-timeout-milliseconds" element
     */
    public int getBlockingTimeoutMilliseconds()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BLOCKINGTIMEOUTMILLISECONDS$4, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "blocking-timeout-milliseconds" element
     */
    public org.apache.xmlbeans.XmlInt xgetBlockingTimeoutMilliseconds()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(BLOCKINGTIMEOUTMILLISECONDS$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "blocking-timeout-milliseconds" element
     */
    public boolean isSetBlockingTimeoutMilliseconds()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BLOCKINGTIMEOUTMILLISECONDS$4) != 0;
        }
    }
    
    /**
     * Sets the "blocking-timeout-milliseconds" element
     */
    public void setBlockingTimeoutMilliseconds(int blockingTimeoutMilliseconds)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BLOCKINGTIMEOUTMILLISECONDS$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BLOCKINGTIMEOUTMILLISECONDS$4);
            }
            target.setIntValue(blockingTimeoutMilliseconds);
        }
    }
    
    /**
     * Sets (as xml) the "blocking-timeout-milliseconds" element
     */
    public void xsetBlockingTimeoutMilliseconds(org.apache.xmlbeans.XmlInt blockingTimeoutMilliseconds)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(BLOCKINGTIMEOUTMILLISECONDS$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(BLOCKINGTIMEOUTMILLISECONDS$4);
            }
            target.set(blockingTimeoutMilliseconds);
        }
    }
    
    /**
     * Unsets the "blocking-timeout-milliseconds" element
     */
    public void unsetBlockingTimeoutMilliseconds()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BLOCKINGTIMEOUTMILLISECONDS$4, 0);
        }
    }
    
    /**
     * Gets the "idle-timeout-minutes" element
     */
    public int getIdleTimeoutMinutes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDLETIMEOUTMINUTES$6, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "idle-timeout-minutes" element
     */
    public org.apache.xmlbeans.XmlInt xgetIdleTimeoutMinutes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(IDLETIMEOUTMINUTES$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "idle-timeout-minutes" element
     */
    public boolean isSetIdleTimeoutMinutes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IDLETIMEOUTMINUTES$6) != 0;
        }
    }
    
    /**
     * Sets the "idle-timeout-minutes" element
     */
    public void setIdleTimeoutMinutes(int idleTimeoutMinutes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDLETIMEOUTMINUTES$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IDLETIMEOUTMINUTES$6);
            }
            target.setIntValue(idleTimeoutMinutes);
        }
    }
    
    /**
     * Sets (as xml) the "idle-timeout-minutes" element
     */
    public void xsetIdleTimeoutMinutes(org.apache.xmlbeans.XmlInt idleTimeoutMinutes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(IDLETIMEOUTMINUTES$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(IDLETIMEOUTMINUTES$6);
            }
            target.set(idleTimeoutMinutes);
        }
    }
    
    /**
     * Unsets the "idle-timeout-minutes" element
     */
    public void unsetIdleTimeoutMinutes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IDLETIMEOUTMINUTES$6, 0);
        }
    }
    
    /**
     * Gets the "match-one" element
     */
    public org.apache.geronimo.xbeans.connector.GerEmptyType getMatchOne()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.connector.GerEmptyType target = null;
            target = (org.apache.geronimo.xbeans.connector.GerEmptyType)get_store().find_element_user(MATCHONE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "match-one" element
     */
    public boolean isSetMatchOne()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MATCHONE$8) != 0;
        }
    }
    
    /**
     * Sets the "match-one" element
     */
    public void setMatchOne(org.apache.geronimo.xbeans.connector.GerEmptyType matchOne)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.connector.GerEmptyType target = null;
            target = (org.apache.geronimo.xbeans.connector.GerEmptyType)get_store().find_element_user(MATCHONE$8, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.xbeans.connector.GerEmptyType)get_store().add_element_user(MATCHONE$8);
            }
            target.set(matchOne);
        }
    }
    
    /**
     * Appends and returns a new empty "match-one" element
     */
    public org.apache.geronimo.xbeans.connector.GerEmptyType addNewMatchOne()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.connector.GerEmptyType target = null;
            target = (org.apache.geronimo.xbeans.connector.GerEmptyType)get_store().add_element_user(MATCHONE$8);
            return target;
        }
    }
    
    /**
     * Unsets the "match-one" element
     */
    public void unsetMatchOne()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MATCHONE$8, 0);
        }
    }
    
    /**
     * Gets the "match-all" element
     */
    public org.apache.geronimo.xbeans.connector.GerEmptyType getMatchAll()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.connector.GerEmptyType target = null;
            target = (org.apache.geronimo.xbeans.connector.GerEmptyType)get_store().find_element_user(MATCHALL$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "match-all" element
     */
    public boolean isSetMatchAll()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MATCHALL$10) != 0;
        }
    }
    
    /**
     * Sets the "match-all" element
     */
    public void setMatchAll(org.apache.geronimo.xbeans.connector.GerEmptyType matchAll)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.connector.GerEmptyType target = null;
            target = (org.apache.geronimo.xbeans.connector.GerEmptyType)get_store().find_element_user(MATCHALL$10, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.xbeans.connector.GerEmptyType)get_store().add_element_user(MATCHALL$10);
            }
            target.set(matchAll);
        }
    }
    
    /**
     * Appends and returns a new empty "match-all" element
     */
    public org.apache.geronimo.xbeans.connector.GerEmptyType addNewMatchAll()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.connector.GerEmptyType target = null;
            target = (org.apache.geronimo.xbeans.connector.GerEmptyType)get_store().add_element_user(MATCHALL$10);
            return target;
        }
    }
    
    /**
     * Unsets the "match-all" element
     */
    public void unsetMatchAll()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MATCHALL$10, 0);
        }
    }
    
    /**
     * Gets the "select-one-assume-match" element
     */
    public org.apache.geronimo.xbeans.connector.GerEmptyType getSelectOneAssumeMatch()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.connector.GerEmptyType target = null;
            target = (org.apache.geronimo.xbeans.connector.GerEmptyType)get_store().find_element_user(SELECTONEASSUMEMATCH$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "select-one-assume-match" element
     */
    public boolean isSetSelectOneAssumeMatch()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SELECTONEASSUMEMATCH$12) != 0;
        }
    }
    
    /**
     * Sets the "select-one-assume-match" element
     */
    public void setSelectOneAssumeMatch(org.apache.geronimo.xbeans.connector.GerEmptyType selectOneAssumeMatch)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.connector.GerEmptyType target = null;
            target = (org.apache.geronimo.xbeans.connector.GerEmptyType)get_store().find_element_user(SELECTONEASSUMEMATCH$12, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.xbeans.connector.GerEmptyType)get_store().add_element_user(SELECTONEASSUMEMATCH$12);
            }
            target.set(selectOneAssumeMatch);
        }
    }
    
    /**
     * Appends and returns a new empty "select-one-assume-match" element
     */
    public org.apache.geronimo.xbeans.connector.GerEmptyType addNewSelectOneAssumeMatch()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.connector.GerEmptyType target = null;
            target = (org.apache.geronimo.xbeans.connector.GerEmptyType)get_store().add_element_user(SELECTONEASSUMEMATCH$12);
            return target;
        }
    }
    
    /**
     * Unsets the "select-one-assume-match" element
     */
    public void unsetSelectOneAssumeMatch()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SELECTONEASSUMEMATCH$12, 0);
        }
    }
}
