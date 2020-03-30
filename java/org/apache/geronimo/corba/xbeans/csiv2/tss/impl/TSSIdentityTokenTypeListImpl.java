/*
 * XML Type:  identityTokenTypeList
 * Namespace: http://openejb.apache.org/xml/ns/corba-tss-config-2.1
 * Java type: org.apache.geronimo.corba.xbeans.csiv2.tss.TSSIdentityTokenTypeList
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.corba.xbeans.csiv2.tss.impl;
/**
 * An XML identityTokenTypeList(@http://openejb.apache.org/xml/ns/corba-tss-config-2.1).
 *
 * This is a complex type.
 */
public class TSSIdentityTokenTypeListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.corba.xbeans.csiv2.tss.TSSIdentityTokenTypeList
{
    private static final long serialVersionUID = 1L;
    
    public TSSIdentityTokenTypeListImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ITTABSENT$0 = 
        new javax.xml.namespace.QName("http://openejb.apache.org/xml/ns/corba-tss-config-2.1", "ITTAbsent");
    private static final javax.xml.namespace.QName ITTANONYMOUS$2 = 
        new javax.xml.namespace.QName("http://openejb.apache.org/xml/ns/corba-tss-config-2.1", "ITTAnonymous");
    private static final javax.xml.namespace.QName ITTPRINCIPALNAMEGSSUP$4 = 
        new javax.xml.namespace.QName("http://openejb.apache.org/xml/ns/corba-tss-config-2.1", "ITTPrincipalNameGSSUP");
    private static final javax.xml.namespace.QName ITTDISTINGUISHEDNAME$6 = 
        new javax.xml.namespace.QName("http://openejb.apache.org/xml/ns/corba-tss-config-2.1", "ITTDistinguishedName");
    private static final javax.xml.namespace.QName ITTX509CERTCHAIN$8 = 
        new javax.xml.namespace.QName("http://openejb.apache.org/xml/ns/corba-tss-config-2.1", "ITTX509CertChain");
    
    
    /**
     * Gets the "ITTAbsent" element
     */
    public org.apache.geronimo.corba.xbeans.csiv2.tss.TSSITTAbsentType getITTAbsent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.corba.xbeans.csiv2.tss.TSSITTAbsentType target = null;
            target = (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSITTAbsentType)get_store().find_element_user(ITTABSENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ITTAbsent" element
     */
    public boolean isSetITTAbsent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ITTABSENT$0) != 0;
        }
    }
    
    /**
     * Sets the "ITTAbsent" element
     */
    public void setITTAbsent(org.apache.geronimo.corba.xbeans.csiv2.tss.TSSITTAbsentType ittAbsent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.corba.xbeans.csiv2.tss.TSSITTAbsentType target = null;
            target = (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSITTAbsentType)get_store().find_element_user(ITTABSENT$0, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSITTAbsentType)get_store().add_element_user(ITTABSENT$0);
            }
            target.set(ittAbsent);
        }
    }
    
    /**
     * Appends and returns a new empty "ITTAbsent" element
     */
    public org.apache.geronimo.corba.xbeans.csiv2.tss.TSSITTAbsentType addNewITTAbsent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.corba.xbeans.csiv2.tss.TSSITTAbsentType target = null;
            target = (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSITTAbsentType)get_store().add_element_user(ITTABSENT$0);
            return target;
        }
    }
    
    /**
     * Unsets the "ITTAbsent" element
     */
    public void unsetITTAbsent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ITTABSENT$0, 0);
        }
    }
    
    /**
     * Gets the "ITTAnonymous" element
     */
    public org.apache.geronimo.corba.xbeans.csiv2.tss.TSSITTAnonymousType getITTAnonymous()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.corba.xbeans.csiv2.tss.TSSITTAnonymousType target = null;
            target = (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSITTAnonymousType)get_store().find_element_user(ITTANONYMOUS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ITTAnonymous" element
     */
    public boolean isSetITTAnonymous()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ITTANONYMOUS$2) != 0;
        }
    }
    
    /**
     * Sets the "ITTAnonymous" element
     */
    public void setITTAnonymous(org.apache.geronimo.corba.xbeans.csiv2.tss.TSSITTAnonymousType ittAnonymous)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.corba.xbeans.csiv2.tss.TSSITTAnonymousType target = null;
            target = (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSITTAnonymousType)get_store().find_element_user(ITTANONYMOUS$2, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSITTAnonymousType)get_store().add_element_user(ITTANONYMOUS$2);
            }
            target.set(ittAnonymous);
        }
    }
    
    /**
     * Appends and returns a new empty "ITTAnonymous" element
     */
    public org.apache.geronimo.corba.xbeans.csiv2.tss.TSSITTAnonymousType addNewITTAnonymous()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.corba.xbeans.csiv2.tss.TSSITTAnonymousType target = null;
            target = (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSITTAnonymousType)get_store().add_element_user(ITTANONYMOUS$2);
            return target;
        }
    }
    
    /**
     * Unsets the "ITTAnonymous" element
     */
    public void unsetITTAnonymous()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ITTANONYMOUS$2, 0);
        }
    }
    
    /**
     * Gets the "ITTPrincipalNameGSSUP" element
     */
    public org.apache.geronimo.corba.xbeans.csiv2.tss.TSSITTPrincipalNameGSSUPType getITTPrincipalNameGSSUP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.corba.xbeans.csiv2.tss.TSSITTPrincipalNameGSSUPType target = null;
            target = (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSITTPrincipalNameGSSUPType)get_store().find_element_user(ITTPRINCIPALNAMEGSSUP$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ITTPrincipalNameGSSUP" element
     */
    public boolean isSetITTPrincipalNameGSSUP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ITTPRINCIPALNAMEGSSUP$4) != 0;
        }
    }
    
    /**
     * Sets the "ITTPrincipalNameGSSUP" element
     */
    public void setITTPrincipalNameGSSUP(org.apache.geronimo.corba.xbeans.csiv2.tss.TSSITTPrincipalNameGSSUPType ittPrincipalNameGSSUP)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.corba.xbeans.csiv2.tss.TSSITTPrincipalNameGSSUPType target = null;
            target = (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSITTPrincipalNameGSSUPType)get_store().find_element_user(ITTPRINCIPALNAMEGSSUP$4, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSITTPrincipalNameGSSUPType)get_store().add_element_user(ITTPRINCIPALNAMEGSSUP$4);
            }
            target.set(ittPrincipalNameGSSUP);
        }
    }
    
    /**
     * Appends and returns a new empty "ITTPrincipalNameGSSUP" element
     */
    public org.apache.geronimo.corba.xbeans.csiv2.tss.TSSITTPrincipalNameGSSUPType addNewITTPrincipalNameGSSUP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.corba.xbeans.csiv2.tss.TSSITTPrincipalNameGSSUPType target = null;
            target = (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSITTPrincipalNameGSSUPType)get_store().add_element_user(ITTPRINCIPALNAMEGSSUP$4);
            return target;
        }
    }
    
    /**
     * Unsets the "ITTPrincipalNameGSSUP" element
     */
    public void unsetITTPrincipalNameGSSUP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ITTPRINCIPALNAMEGSSUP$4, 0);
        }
    }
    
    /**
     * Gets the "ITTDistinguishedName" element
     */
    public org.apache.geronimo.corba.xbeans.csiv2.tss.TSSITTDistinguishedNameType getITTDistinguishedName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.corba.xbeans.csiv2.tss.TSSITTDistinguishedNameType target = null;
            target = (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSITTDistinguishedNameType)get_store().find_element_user(ITTDISTINGUISHEDNAME$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ITTDistinguishedName" element
     */
    public boolean isSetITTDistinguishedName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ITTDISTINGUISHEDNAME$6) != 0;
        }
    }
    
    /**
     * Sets the "ITTDistinguishedName" element
     */
    public void setITTDistinguishedName(org.apache.geronimo.corba.xbeans.csiv2.tss.TSSITTDistinguishedNameType ittDistinguishedName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.corba.xbeans.csiv2.tss.TSSITTDistinguishedNameType target = null;
            target = (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSITTDistinguishedNameType)get_store().find_element_user(ITTDISTINGUISHEDNAME$6, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSITTDistinguishedNameType)get_store().add_element_user(ITTDISTINGUISHEDNAME$6);
            }
            target.set(ittDistinguishedName);
        }
    }
    
    /**
     * Appends and returns a new empty "ITTDistinguishedName" element
     */
    public org.apache.geronimo.corba.xbeans.csiv2.tss.TSSITTDistinguishedNameType addNewITTDistinguishedName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.corba.xbeans.csiv2.tss.TSSITTDistinguishedNameType target = null;
            target = (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSITTDistinguishedNameType)get_store().add_element_user(ITTDISTINGUISHEDNAME$6);
            return target;
        }
    }
    
    /**
     * Unsets the "ITTDistinguishedName" element
     */
    public void unsetITTDistinguishedName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ITTDISTINGUISHEDNAME$6, 0);
        }
    }
    
    /**
     * Gets the "ITTX509CertChain" element
     */
    public org.apache.geronimo.corba.xbeans.csiv2.tss.TSSITTX509CertChainType getITTX509CertChain()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.corba.xbeans.csiv2.tss.TSSITTX509CertChainType target = null;
            target = (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSITTX509CertChainType)get_store().find_element_user(ITTX509CERTCHAIN$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ITTX509CertChain" element
     */
    public boolean isSetITTX509CertChain()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ITTX509CERTCHAIN$8) != 0;
        }
    }
    
    /**
     * Sets the "ITTX509CertChain" element
     */
    public void setITTX509CertChain(org.apache.geronimo.corba.xbeans.csiv2.tss.TSSITTX509CertChainType ittx509CertChain)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.corba.xbeans.csiv2.tss.TSSITTX509CertChainType target = null;
            target = (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSITTX509CertChainType)get_store().find_element_user(ITTX509CERTCHAIN$8, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSITTX509CertChainType)get_store().add_element_user(ITTX509CERTCHAIN$8);
            }
            target.set(ittx509CertChain);
        }
    }
    
    /**
     * Appends and returns a new empty "ITTX509CertChain" element
     */
    public org.apache.geronimo.corba.xbeans.csiv2.tss.TSSITTX509CertChainType addNewITTX509CertChain()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.corba.xbeans.csiv2.tss.TSSITTX509CertChainType target = null;
            target = (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSITTX509CertChainType)get_store().add_element_user(ITTX509CERTCHAIN$8);
            return target;
        }
    }
    
    /**
     * Unsets the "ITTX509CertChain" element
     */
    public void unsetITTX509CertChain()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ITTX509CERTCHAIN$8, 0);
        }
    }
}
