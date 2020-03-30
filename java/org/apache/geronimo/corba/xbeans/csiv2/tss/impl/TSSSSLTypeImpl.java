/*
 * XML Type:  SSLType
 * Namespace: http://openejb.apache.org/xml/ns/corba-tss-config-2.1
 * Java type: org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSSLType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.corba.xbeans.csiv2.tss.impl;
/**
 * An XML SSLType(@http://openejb.apache.org/xml/ns/corba-tss-config-2.1).
 *
 * This is a complex type.
 */
public class TSSSSLTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSSLType
{
    private static final long serialVersionUID = 1L;
    
    public TSSSSLTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DESCRIPTION$0 = 
        new javax.xml.namespace.QName("http://openejb.apache.org/xml/ns/corba-tss-config-2.1", "description");
    private static final javax.xml.namespace.QName SUPPORTS$2 = 
        new javax.xml.namespace.QName("http://openejb.apache.org/xml/ns/corba-tss-config-2.1", "supports");
    private static final javax.xml.namespace.QName REQUIRES$4 = 
        new javax.xml.namespace.QName("http://openejb.apache.org/xml/ns/corba-tss-config-2.1", "requires");
    private static final javax.xml.namespace.QName TRUSTEVERYONE$6 = 
        new javax.xml.namespace.QName("http://openejb.apache.org/xml/ns/corba-tss-config-2.1", "trustEveryone");
    private static final javax.xml.namespace.QName TRUSTNOONE$8 = 
        new javax.xml.namespace.QName("http://openejb.apache.org/xml/ns/corba-tss-config-2.1", "trustNoone");
    private static final javax.xml.namespace.QName TRUSTLIST$10 = 
        new javax.xml.namespace.QName("http://openejb.apache.org/xml/ns/corba-tss-config-2.1", "trustList");
    private static final javax.xml.namespace.QName PORT$12 = 
        new javax.xml.namespace.QName("", "port");
    private static final javax.xml.namespace.QName HOSTNAME$14 = 
        new javax.xml.namespace.QName("", "hostname");
    private static final javax.xml.namespace.QName HANDSHAKETIMEOUT$16 = 
        new javax.xml.namespace.QName("", "handshakeTimeout");
    
    
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
     * Gets the "trustEveryone" element
     */
    public org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTrustEveryoneType getTrustEveryone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTrustEveryoneType target = null;
            target = (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTrustEveryoneType)get_store().find_element_user(TRUSTEVERYONE$6, 0);
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
            return get_store().count_elements(TRUSTEVERYONE$6) != 0;
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
            target = (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTrustEveryoneType)get_store().find_element_user(TRUSTEVERYONE$6, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTrustEveryoneType)get_store().add_element_user(TRUSTEVERYONE$6);
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
            target = (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTrustEveryoneType)get_store().add_element_user(TRUSTEVERYONE$6);
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
            get_store().remove_element(TRUSTEVERYONE$6, 0);
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
            target = (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTrustNooneType)get_store().find_element_user(TRUSTNOONE$8, 0);
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
            return get_store().count_elements(TRUSTNOONE$8) != 0;
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
            target = (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTrustNooneType)get_store().find_element_user(TRUSTNOONE$8, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTrustNooneType)get_store().add_element_user(TRUSTNOONE$8);
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
            target = (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTrustNooneType)get_store().add_element_user(TRUSTNOONE$8);
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
            get_store().remove_element(TRUSTNOONE$8, 0);
        }
    }
    
    /**
     * Gets the "trustList" element
     */
    public org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSSLType.TrustList getTrustList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSSLType.TrustList target = null;
            target = (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSSLType.TrustList)get_store().find_element_user(TRUSTLIST$10, 0);
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
            return get_store().count_elements(TRUSTLIST$10) != 0;
        }
    }
    
    /**
     * Sets the "trustList" element
     */
    public void setTrustList(org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSSLType.TrustList trustList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSSLType.TrustList target = null;
            target = (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSSLType.TrustList)get_store().find_element_user(TRUSTLIST$10, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSSLType.TrustList)get_store().add_element_user(TRUSTLIST$10);
            }
            target.set(trustList);
        }
    }
    
    /**
     * Appends and returns a new empty "trustList" element
     */
    public org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSSLType.TrustList addNewTrustList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSSLType.TrustList target = null;
            target = (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSSLType.TrustList)get_store().add_element_user(TRUSTLIST$10);
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
            get_store().remove_element(TRUSTLIST$10, 0);
        }
    }
    
    /**
     * Gets the "port" attribute
     */
    public short getPort()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PORT$12);
            if (target == null)
            {
                return 0;
            }
            return target.getShortValue();
        }
    }
    
    /**
     * Gets (as xml) the "port" attribute
     */
    public org.apache.xmlbeans.XmlShort xgetPort()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlShort target = null;
            target = (org.apache.xmlbeans.XmlShort)get_store().find_attribute_user(PORT$12);
            return target;
        }
    }
    
    /**
     * Sets the "port" attribute
     */
    public void setPort(short port)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PORT$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PORT$12);
            }
            target.setShortValue(port);
        }
    }
    
    /**
     * Sets (as xml) the "port" attribute
     */
    public void xsetPort(org.apache.xmlbeans.XmlShort port)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlShort target = null;
            target = (org.apache.xmlbeans.XmlShort)get_store().find_attribute_user(PORT$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlShort)get_store().add_attribute_user(PORT$12);
            }
            target.set(port);
        }
    }
    
    /**
     * Gets the "hostname" attribute
     */
    public java.lang.String getHostname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HOSTNAME$14);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "hostname" attribute
     */
    public org.apache.xmlbeans.XmlString xgetHostname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(HOSTNAME$14);
            return target;
        }
    }
    
    /**
     * Sets the "hostname" attribute
     */
    public void setHostname(java.lang.String hostname)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HOSTNAME$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HOSTNAME$14);
            }
            target.setStringValue(hostname);
        }
    }
    
    /**
     * Sets (as xml) the "hostname" attribute
     */
    public void xsetHostname(org.apache.xmlbeans.XmlString hostname)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(HOSTNAME$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(HOSTNAME$14);
            }
            target.set(hostname);
        }
    }
    
    /**
     * Gets the "handshakeTimeout" attribute
     */
    public short getHandshakeTimeout()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HANDSHAKETIMEOUT$16);
            if (target == null)
            {
                return 0;
            }
            return target.getShortValue();
        }
    }
    
    /**
     * Gets (as xml) the "handshakeTimeout" attribute
     */
    public org.apache.xmlbeans.XmlShort xgetHandshakeTimeout()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlShort target = null;
            target = (org.apache.xmlbeans.XmlShort)get_store().find_attribute_user(HANDSHAKETIMEOUT$16);
            return target;
        }
    }
    
    /**
     * True if has "handshakeTimeout" attribute
     */
    public boolean isSetHandshakeTimeout()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(HANDSHAKETIMEOUT$16) != null;
        }
    }
    
    /**
     * Sets the "handshakeTimeout" attribute
     */
    public void setHandshakeTimeout(short handshakeTimeout)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HANDSHAKETIMEOUT$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HANDSHAKETIMEOUT$16);
            }
            target.setShortValue(handshakeTimeout);
        }
    }
    
    /**
     * Sets (as xml) the "handshakeTimeout" attribute
     */
    public void xsetHandshakeTimeout(org.apache.xmlbeans.XmlShort handshakeTimeout)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlShort target = null;
            target = (org.apache.xmlbeans.XmlShort)get_store().find_attribute_user(HANDSHAKETIMEOUT$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlShort)get_store().add_attribute_user(HANDSHAKETIMEOUT$16);
            }
            target.set(handshakeTimeout);
        }
    }
    
    /**
     * Unsets the "handshakeTimeout" attribute
     */
    public void unsetHandshakeTimeout()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(HANDSHAKETIMEOUT$16);
        }
    }
    /**
     * An XML trustList(@http://openejb.apache.org/xml/ns/corba-tss-config-2.1).
     *
     * This is a complex type.
     */
    public static class TrustListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.corba.xbeans.csiv2.tss.TSSSSLType.TrustList
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
