/*
 * An XML document type.
 * Localname: tss
 * Namespace: http://openejb.apache.org/xml/ns/corba-tss-config-2.1
 * Java type: org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTssDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.corba.xbeans.csiv2.tss.impl;
/**
 * A document containing one tss(@http://openejb.apache.org/xml/ns/corba-tss-config-2.1) element.
 *
 * This is a complex type.
 */
public class TSSTssDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTssDocument
{
    private static final long serialVersionUID = 1L;
    
    public TSSTssDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TSS$0 = 
        new javax.xml.namespace.QName("http://openejb.apache.org/xml/ns/corba-tss-config-2.1", "tss");
    
    
    /**
     * Gets the "tss" element
     */
    public org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTssType getTss()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTssType target = null;
            target = (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTssType)get_store().find_element_user(TSS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "tss" element
     */
    public void setTss(org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTssType tss)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTssType target = null;
            target = (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTssType)get_store().find_element_user(TSS$0, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTssType)get_store().add_element_user(TSS$0);
            }
            target.set(tss);
        }
    }
    
    /**
     * Appends and returns a new empty "tss" element
     */
    public org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTssType addNewTss()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTssType target = null;
            target = (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSTssType)get_store().add_element_user(TSS$0);
            return target;
        }
    }
}
