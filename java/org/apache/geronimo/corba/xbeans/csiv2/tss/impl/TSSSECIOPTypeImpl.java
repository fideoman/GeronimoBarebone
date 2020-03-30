/*
 * XML Type:  SECIOPType
 * Namespace: http://openejb.apache.org/xml/ns/corba-tss-config-2.1
 * Java type: org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSECIOPType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.corba.xbeans.csiv2.tss.impl;
/**
 * An XML SECIOPType(@http://openejb.apache.org/xml/ns/corba-tss-config-2.1).
 *
 * This is a complex type.
 */
public class TSSSECIOPTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSECIOPType
{
    private static final long serialVersionUID = 1L;
    
    public TSSSECIOPTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DESCRIPTION$0 = 
        new javax.xml.namespace.QName("http://openejb.apache.org/xml/ns/corba-tss-config-2.1", "description");
    private static final javax.xml.namespace.QName SUPPORTS$2 = 
        new javax.xml.namespace.QName("http://openejb.apache.org/xml/ns/corba-tss-config-2.1", "supports");
    private static final javax.xml.namespace.QName REQUIRES$4 = 
        new javax.xml.namespace.QName("http://openejb.apache.org/xml/ns/corba-tss-config-2.1", "requires");
    private static final javax.xml.namespace.QName TRANSPORTADDRESS$6 = 
        new javax.xml.namespace.QName("http://openejb.apache.org/xml/ns/corba-tss-config-2.1", "transportAddress");
    private static final javax.xml.namespace.QName TRUSTEVERYONE$8 = 
        new javax.xml.namespace.QName("http://openejb.apache.org/xml/ns/corba-tss-config-2.1", "trustEveryone");
    private static final javax.xml.namespace.QName TRUSTNOONE$10 = 
        new javax.xml.namespace.QName("http://openejb.apache.org/xml/ns/corba-tss-config-2.1", "trustNoone");
    private static final javax.xml.namespace.QName TRUSTLIST$12 = 
        new javax.xml.namespace.QName("http://openejb.apache.org/xml/ns/corba-tss-config-2.1", "trustList");
    private static final javax.xml.namespace.QName MECHOID$14 = 
        new javax.xml.namespace.QName("", "mechOID");
    private static final javax.xml.namespace.QName TARGETNAME$16 = 
        new javax.xml.namespace.QName("", "targetName");
    
    
    /**
     * Gets array of all "description" elements
     */
    public org.apache.geronimo.corba.xbeans.csiv2.tss.TSSDescriptionType[] getDescriptionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DESCRIPTION$0, targetList);
            org.apache.geronimo.corba.xbeans.csiv2.tss.TSSDescriptionType[] result = new org.apache.geronimo.corba.xbeans.csiv2.tss.TSSDescriptionType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "description" element
     */
    public org.apache.geronimo.corba.xbeans.csiv2.tss.TSSDescriptionType getDescriptionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.corba.xbeans.csiv2.tss.TSSDescriptionType target = null;
            target = (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSDescriptionType)get_store().find_element_user(DESCRIPTION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "description" element
     */
    public int sizeOfDescriptionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DESCRIPTION$0);
        }
    }
    
    /**
     * Sets array of all "description" element
     */
    public void setDescriptionArray(org.apache.geronimo.corba.xbeans.csiv2.tss.TSSDescriptionType[] descriptionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(descriptionArray, DESCRIPTION$0);
        }
    }
    
    /**
     * Sets ith "description" element
     */
    public void setDescriptionArray(int i, org.apache.geronimo.corba.xbeans.csiv2.tss.TSSDescriptionType description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.corba.xbeans.csiv2.tss.TSSDescriptionType target = null;
            target = (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSDescriptionType)get_store().find_element_user(DESCRIPTION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(description);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "description" element
     */
    public org.apache.geronimo.corba.xbeans.csiv2.tss.TSSDescriptionType insertNewDescription(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.corba.xbeans.csiv2.tss.TSSDescriptionType target = null;
            target = (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSDescriptionType)get_store().insert_element_user(DESCRIPTION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "description" element
     */
    public org.apache.geronimo.corba.xbeans.csiv2.tss.TSSDescriptionType addNewDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.corba.xbeans.csiv2.tss.TSSDescriptionType target = null;
            target = (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSDescriptionType)get_store().add_element_user(DESCRIPTION$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "description" element
     */
    public void removeDescription(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DESCRIPTION$0, i);
        }
    }
    
    /**
     * Gets the "supports" element
     */
    public java.util.List getSupports()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUPPORTS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "supports" element
     */
    public org.apache.geronimo.corba.xbeans.csiv2.tss.TSSAssociationOptionList xgetSupports()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.corba.xbeans.csiv2.tss.TSSAssociationOptionList target = null;
            target = (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSAssociationOptionList)get_store().find_element_user(SUPPORTS$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "supports" element
     */
    public void setSupports(java.util.List supports)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUPPORTS$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUPPORTS$2);
            }
            target.setListValue(supports);
        }
    }
    
    /**
     * Sets (as xml) the "supports" element
     */
    public void xsetSupports(org.apache.geronimo.corba.xbeans.csiv2.tss.TSSAssociationOptionList supports)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.corba.xbeans.csiv2.tss.TSSAssociationOptionList target = null;
            target = (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSAssociationOptionList)get_store().find_element_user(SUPPORTS$2, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSAssociationOptionList)get_store().add_element_user(SUPPORTS$2);
            }
            target.set(supports);
        }
    }
    
    /**
     * Gets the "requires" element
     */
    public java.util.List getRequires()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REQUIRES$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "requires" element
     */
    public org.apache.geronimo.corba.xbeans.csiv2.tss.TSSAssociationOptionList xgetRequires()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.corba.xbeans.csiv2.tss.TSSAssociationOptionList target = null;
            target = (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSAssociationOptionList)get_store().find_element_user(REQUIRES$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "requires" element
     */
    public void setRequires(java.util.List requires)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REQUIRES$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REQUIRES$4);
            }
            target.setListValue(requires);
        }
    }
    
    /**
     * Sets (as xml) the "requires" element
     */
    public void xsetRequires(org.apache.geronimo.corba.xbeans.csiv2.tss.TSSAssociationOptionList requires)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.corba.xbeans.csiv2.tss.TSSAssociationOptionList target = null;
            target = (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSAssociationOptionList)get_store().find_element_user(REQUIRES$4, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSAssociationOptionList)get_store().add_element_user(REQUIRES$4);
            }
            target.set(requires);
        }
    }
    
    /**
     * Gets array of all "transportAddress" elements
     */
    public org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTransportAddressType[] getTransportAddressArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TRANSPORTADDRESS$6, targetList);
            org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTransportAddressType[] result = new org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTransportAddressType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "transportAddress" element
     */
    public org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTransportAddressType getTransportAddressArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTransportAddressType target = null;
            target = (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTransportAddressType)get_store().find_element_user(TRANSPORTADDRESS$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "transportAddress" element
     */
    public int sizeOfTransportAddressArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TRANSPORTADDRESS$6);
        }
    }
    
    /**
     * Sets array of all "transportAddress" element
     */
    public void setTransportAddressArray(org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTransportAddressType[] transportAddressArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(transportAddressArray, TRANSPORTADDRESS$6);
        }
    }
    
    /**
     * Sets ith "transportAddress" element
     */
    public void setTransportAddressArray(int i, org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTransportAddressType transportAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTransportAddressType target = null;
            target = (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTransportAddressType)get_store().find_element_user(TRANSPORTADDRESS$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(transportAddress);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "transportAddress" element
     */
    public org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTransportAddressType insertNewTransportAddress(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTransportAddressType target = null;
            target = (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTransportAddressType)get_store().insert_element_user(TRANSPORTADDRESS$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "transportAddress" element
     */
    public org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTransportAddressType addNewTransportAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTransportAddressType target = null;
            target = (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTransportAddressType)get_store().add_element_user(TRANSPORTADDRESS$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "transportAddress" element
     */
    public void removeTransportAddress(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TRANSPORTADDRESS$6, i);
        }
    }
    
    /**
     * Gets the "trustEveryone" element
     */
    public org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTrustEveryoneType getTrustEveryone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTrustEveryoneType target = null;
            target = (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTrustEveryoneType)get_store().find_element_user(TRUSTEVERYONE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "trustEveryone" element
     */
    public boolean isSetTrustEveryone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TRUSTEVERYONE$8) != 0;
        }
    }
    
    /**
     * Sets the "trustEveryone" element
     */
    public void setTrustEveryone(org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTrustEveryoneType trustEveryone)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTrustEveryoneType target = null;
            target = (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTrustEveryoneType)get_store().find_element_user(TRUSTEVERYONE$8, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTrustEveryoneType)get_store().add_element_user(TRUSTEVERYONE$8);
            }
            target.set(trustEveryone);
        }
    }
    
    /**
     * Appends and returns a new empty "trustEveryone" element
     */
    public org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTrustEveryoneType addNewTrustEveryone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTrustEveryoneType target = null;
            target = (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTrustEveryoneType)get_store().add_element_user(TRUSTEVERYONE$8);
            return target;
        }
    }
    
    /**
     * Unsets the "trustEveryone" element
     */
    public void unsetTrustEveryone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TRUSTEVERYONE$8, 0);
        }
    }
    
    /**
     * Gets the "trustNoone" element
     */
    public org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTrustNooneType getTrustNoone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTrustNooneType target = null;
            target = (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTrustNooneType)get_store().find_element_user(TRUSTNOONE$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "trustNoone" element
     */
    public boolean isSetTrustNoone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TRUSTNOONE$10) != 0;
        }
    }
    
    /**
     * Sets the "trustNoone" element
     */
    public void setTrustNoone(org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTrustNooneType trustNoone)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTrustNooneType target = null;
            target = (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTrustNooneType)get_store().find_element_user(TRUSTNOONE$10, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTrustNooneType)get_store().add_element_user(TRUSTNOONE$10);
            }
            target.set(trustNoone);
        }
    }
    
    /**
     * Appends and returns a new empty "trustNoone" element
     */
    public org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTrustNooneType addNewTrustNoone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTrustNooneType target = null;
            target = (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTrustNooneType)get_store().add_element_user(TRUSTNOONE$10);
            return target;
        }
    }
    
    /**
     * Unsets the "trustNoone" element
     */
    public void unsetTrustNoone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TRUSTNOONE$10, 0);
        }
    }
    
    /**
     * Gets the "trustList" element
     */
    public org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSECIOPType.TrustList getTrustList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSECIOPType.TrustList target = null;
            target = (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSECIOPType.TrustList)get_store().find_element_user(TRUSTLIST$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "trustList" element
     */
    public boolean isSetTrustList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TRUSTLIST$12) != 0;
        }
    }
    
    /**
     * Sets the "trustList" element
     */
    public void setTrustList(org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSECIOPType.TrustList trustList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSECIOPType.TrustList target = null;
            target = (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSECIOPType.TrustList)get_store().find_element_user(TRUSTLIST$12, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSECIOPType.TrustList)get_store().add_element_user(TRUSTLIST$12);
            }
            target.set(trustList);
        }
    }
    
    /**
     * Appends and returns a new empty "trustList" element
     */
    public org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSECIOPType.TrustList addNewTrustList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSECIOPType.TrustList target = null;
            target = (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSECIOPType.TrustList)get_store().add_element_user(TRUSTLIST$12);
            return target;
        }
    }
    
    /**
     * Unsets the "trustList" element
     */
    public void unsetTrustList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TRUSTLIST$12, 0);
        }
    }
    
    /**
     * Gets the "mechOID" attribute
     */
    public java.lang.String getMechOID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MECHOID$14);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "mechOID" attribute
     */
    public org.apache.xmlbeans.XmlString xgetMechOID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MECHOID$14);
            return target;
        }
    }
    
    /**
     * True if has "mechOID" attribute
     */
    public boolean isSetMechOID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MECHOID$14) != null;
        }
    }
    
    /**
     * Sets the "mechOID" attribute
     */
    public void setMechOID(java.lang.String mechOID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MECHOID$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MECHOID$14);
            }
            target.setStringValue(mechOID);
        }
    }
    
    /**
     * Sets (as xml) the "mechOID" attribute
     */
    public void xsetMechOID(org.apache.xmlbeans.XmlString mechOID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MECHOID$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(MECHOID$14);
            }
            target.set(mechOID);
        }
    }
    
    /**
     * Unsets the "mechOID" attribute
     */
    public void unsetMechOID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MECHOID$14);
        }
    }
    
    /**
     * Gets the "targetName" attribute
     */
    public java.lang.String getTargetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TARGETNAME$16);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "targetName" attribute
     */
    public org.apache.xmlbeans.XmlString xgetTargetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TARGETNAME$16);
            return target;
        }
    }
    
    /**
     * True if has "targetName" attribute
     */
    public boolean isSetTargetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TARGETNAME$16) != null;
        }
    }
    
    /**
     * Sets the "targetName" attribute
     */
    public void setTargetName(java.lang.String targetName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TARGETNAME$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TARGETNAME$16);
            }
            target.setStringValue(targetName);
        }
    }
    
    /**
     * Sets (as xml) the "targetName" attribute
     */
    public void xsetTargetName(org.apache.xmlbeans.XmlString targetName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TARGETNAME$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TARGETNAME$16);
            }
            target.set(targetName);
        }
    }
    
    /**
     * Unsets the "targetName" attribute
     */
    public void unsetTargetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TARGETNAME$16);
        }
    }
    /**
     * An XML trustList(@http://openejb.apache.org/xml/ns/corba-tss-config-2.1).
     *
     * This is a complex type.
     */
    public static class TrustListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSECIOPType.TrustList
    {
        private static final long serialVersionUID = 1L;
        
        public TrustListImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ENTITY$0 = 
            new javax.xml.namespace.QName("http://openejb.apache.org/xml/ns/corba-tss-config-2.1", "entity");
        
        
        /**
         * Gets array of all "entity" elements
         */
        public org.apache.geronimo.corba.xbeans.csiv2.tss.TSSEntityType[] getEntityArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ENTITY$0, targetList);
                org.apache.geronimo.corba.xbeans.csiv2.tss.TSSEntityType[] result = new org.apache.geronimo.corba.xbeans.csiv2.tss.TSSEntityType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "entity" element
         */
        public org.apache.geronimo.corba.xbeans.csiv2.tss.TSSEntityType getEntityArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.geronimo.corba.xbeans.csiv2.tss.TSSEntityType target = null;
                target = (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSEntityType)get_store().find_element_user(ENTITY$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "entity" element
         */
        public int sizeOfEntityArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ENTITY$0);
            }
        }
        
        /**
         * Sets array of all "entity" element
         */
        public void setEntityArray(org.apache.geronimo.corba.xbeans.csiv2.tss.TSSEntityType[] entityArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(entityArray, ENTITY$0);
            }
        }
        
        /**
         * Sets ith "entity" element
         */
        public void setEntityArray(int i, org.apache.geronimo.corba.xbeans.csiv2.tss.TSSEntityType entity)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.geronimo.corba.xbeans.csiv2.tss.TSSEntityType target = null;
                target = (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSEntityType)get_store().find_element_user(ENTITY$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(entity);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "entity" element
         */
        public org.apache.geronimo.corba.xbeans.csiv2.tss.TSSEntityType insertNewEntity(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.geronimo.corba.xbeans.csiv2.tss.TSSEntityType target = null;
                target = (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSEntityType)get_store().insert_element_user(ENTITY$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "entity" element
         */
        public org.apache.geronimo.corba.xbeans.csiv2.tss.TSSEntityType addNewEntity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.geronimo.corba.xbeans.csiv2.tss.TSSEntityType target = null;
                target = (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSEntityType)get_store().add_element_user(ENTITY$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "entity" element
         */
        public void removeEntity(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ENTITY$0, i);
            }
        }
    }
}
