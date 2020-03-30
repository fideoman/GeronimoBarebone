/*
 * XML Type:  clustering-wadiType
 * Namespace: http://geronimo.apache.org/xml/ns/clustering-wadi-1.2
 * Java type: org.apache.geronimo.xbeans.jetty8.cluster.wadi.GerClusteringWadiType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.jetty8.cluster.wadi.impl;
/**
 * An XML clustering-wadiType(@http://geronimo.apache.org/xml/ns/clustering-wadi-1.2).
 *
 * This is a complex type.
 */
public class GerClusteringWadiTypeImpl extends org.apache.geronimo.xbeans.geronimo.j2ee.impl.GerAbstractClusteringTypeImpl implements org.apache.geronimo.xbeans.jetty8.cluster.wadi.GerClusteringWadiType
{
    private static final long serialVersionUID = 1L;
    
    public GerClusteringWadiTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SWEEPINTERVAL$0 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/clustering-wadi-1.2", "sweepInterval");
    private static final javax.xml.namespace.QName NUMPARTITIONS$2 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/clustering-wadi-1.2", "numPartitions");
    private static final javax.xml.namespace.QName CLUSTER$4 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/clustering-wadi-1.2", "cluster");
    private static final javax.xml.namespace.QName DISABLEREPLICATION$6 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/clustering-wadi-1.2", "disableReplication");
    private static final javax.xml.namespace.QName DELTAREPLICATION$8 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/clustering-wadi-1.2", "deltaReplication");
    private static final javax.xml.namespace.QName BACKINGSTRATEGYFACTORY$10 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/clustering-wadi-1.2", "backing-strategy-factory");
    
    
    /**
     * Gets the "sweepInterval" element
     */
    public java.math.BigInteger getSweepInterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SWEEPINTERVAL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "sweepInterval" element
     */
    public org.apache.xmlbeans.XmlInteger xgetSweepInterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(SWEEPINTERVAL$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "sweepInterval" element
     */
    public boolean isSetSweepInterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SWEEPINTERVAL$0) != 0;
        }
    }
    
    /**
     * Sets the "sweepInterval" element
     */
    public void setSweepInterval(java.math.BigInteger sweepInterval)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SWEEPINTERVAL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SWEEPINTERVAL$0);
            }
            target.setBigIntegerValue(sweepInterval);
        }
    }
    
    /**
     * Sets (as xml) the "sweepInterval" element
     */
    public void xsetSweepInterval(org.apache.xmlbeans.XmlInteger sweepInterval)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(SWEEPINTERVAL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(SWEEPINTERVAL$0);
            }
            target.set(sweepInterval);
        }
    }
    
    /**
     * Unsets the "sweepInterval" element
     */
    public void unsetSweepInterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SWEEPINTERVAL$0, 0);
        }
    }
    
    /**
     * Gets the "numPartitions" element
     */
    public java.math.BigInteger getNumPartitions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMPARTITIONS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "numPartitions" element
     */
    public org.apache.xmlbeans.XmlInteger xgetNumPartitions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(NUMPARTITIONS$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "numPartitions" element
     */
    public boolean isSetNumPartitions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NUMPARTITIONS$2) != 0;
        }
    }
    
    /**
     * Sets the "numPartitions" element
     */
    public void setNumPartitions(java.math.BigInteger numPartitions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMPARTITIONS$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMPARTITIONS$2);
            }
            target.setBigIntegerValue(numPartitions);
        }
    }
    
    /**
     * Sets (as xml) the "numPartitions" element
     */
    public void xsetNumPartitions(org.apache.xmlbeans.XmlInteger numPartitions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(NUMPARTITIONS$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(NUMPARTITIONS$2);
            }
            target.set(numPartitions);
        }
    }
    
    /**
     * Unsets the "numPartitions" element
     */
    public void unsetNumPartitions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NUMPARTITIONS$2, 0);
        }
    }
    
    /**
     * Gets the "cluster" element
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerGbeanRefType getCluster()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerGbeanRefType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerGbeanRefType)get_store().find_element_user(CLUSTER$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "cluster" element
     */
    public boolean isSetCluster()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CLUSTER$4) != 0;
        }
    }
    
    /**
     * Sets the "cluster" element
     */
    public void setCluster(org.apache.geronimo.xbeans.geronimo.naming.GerGbeanRefType cluster)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerGbeanRefType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerGbeanRefType)get_store().find_element_user(CLUSTER$4, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.xbeans.geronimo.naming.GerGbeanRefType)get_store().add_element_user(CLUSTER$4);
            }
            target.set(cluster);
        }
    }
    
    /**
     * Appends and returns a new empty "cluster" element
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerGbeanRefType addNewCluster()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerGbeanRefType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerGbeanRefType)get_store().add_element_user(CLUSTER$4);
            return target;
        }
    }
    
    /**
     * Unsets the "cluster" element
     */
    public void unsetCluster()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CLUSTER$4, 0);
        }
    }
    
    /**
     * Gets the "disableReplication" element
     */
    public boolean getDisableReplication()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISABLEREPLICATION$6, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "disableReplication" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetDisableReplication()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(DISABLEREPLICATION$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "disableReplication" element
     */
    public boolean isSetDisableReplication()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DISABLEREPLICATION$6) != 0;
        }
    }
    
    /**
     * Sets the "disableReplication" element
     */
    public void setDisableReplication(boolean disableReplication)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISABLEREPLICATION$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DISABLEREPLICATION$6);
            }
            target.setBooleanValue(disableReplication);
        }
    }
    
    /**
     * Sets (as xml) the "disableReplication" element
     */
    public void xsetDisableReplication(org.apache.xmlbeans.XmlBoolean disableReplication)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(DISABLEREPLICATION$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(DISABLEREPLICATION$6);
            }
            target.set(disableReplication);
        }
    }
    
    /**
     * Unsets the "disableReplication" element
     */
    public void unsetDisableReplication()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DISABLEREPLICATION$6, 0);
        }
    }
    
    /**
     * Gets the "deltaReplication" element
     */
    public boolean getDeltaReplication()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DELTAREPLICATION$8, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "deltaReplication" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetDeltaReplication()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(DELTAREPLICATION$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "deltaReplication" element
     */
    public boolean isSetDeltaReplication()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DELTAREPLICATION$8) != 0;
        }
    }
    
    /**
     * Sets the "deltaReplication" element
     */
    public void setDeltaReplication(boolean deltaReplication)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DELTAREPLICATION$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DELTAREPLICATION$8);
            }
            target.setBooleanValue(deltaReplication);
        }
    }
    
    /**
     * Sets (as xml) the "deltaReplication" element
     */
    public void xsetDeltaReplication(org.apache.xmlbeans.XmlBoolean deltaReplication)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(DELTAREPLICATION$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(DELTAREPLICATION$8);
            }
            target.set(deltaReplication);
        }
    }
    
    /**
     * Unsets the "deltaReplication" element
     */
    public void unsetDeltaReplication()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DELTAREPLICATION$8, 0);
        }
    }
    
    /**
     * Gets the "backing-strategy-factory" element
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerGbeanRefType getBackingStrategyFactory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerGbeanRefType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerGbeanRefType)get_store().find_element_user(BACKINGSTRATEGYFACTORY$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "backing-strategy-factory" element
     */
    public boolean isSetBackingStrategyFactory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BACKINGSTRATEGYFACTORY$10) != 0;
        }
    }
    
    /**
     * Sets the "backing-strategy-factory" element
     */
    public void setBackingStrategyFactory(org.apache.geronimo.xbeans.geronimo.naming.GerGbeanRefType backingStrategyFactory)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerGbeanRefType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerGbeanRefType)get_store().find_element_user(BACKINGSTRATEGYFACTORY$10, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.xbeans.geronimo.naming.GerGbeanRefType)get_store().add_element_user(BACKINGSTRATEGYFACTORY$10);
            }
            target.set(backingStrategyFactory);
        }
    }
    
    /**
     * Appends and returns a new empty "backing-strategy-factory" element
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerGbeanRefType addNewBackingStrategyFactory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerGbeanRefType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerGbeanRefType)get_store().add_element_user(BACKINGSTRATEGYFACTORY$10);
            return target;
        }
    }
    
    /**
     * Unsets the "backing-strategy-factory" element
     */
    public void unsetBackingStrategyFactory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BACKINGSTRATEGYFACTORY$10, 0);
        }
    }
}
