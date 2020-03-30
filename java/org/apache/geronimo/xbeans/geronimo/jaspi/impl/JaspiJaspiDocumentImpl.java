/*
 * An XML document type.
 * Localname: jaspi
 * Namespace: http://geronimo.apache.org/xml/ns/geronimo-jaspi
 * Java type: org.apache.geronimo.xbeans.geronimo.jaspi.JaspiJaspiDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.geronimo.jaspi.impl;
/**
 * A document containing one jaspi(@http://geronimo.apache.org/xml/ns/geronimo-jaspi) element.
 *
 * This is a complex type.
 */
public class JaspiJaspiDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.xbeans.geronimo.jaspi.JaspiJaspiDocument
{
    private static final long serialVersionUID = 1L;
    
    public JaspiJaspiDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName JASPI$0 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/geronimo-jaspi", "jaspi");
    
    
    /**
     * Gets the "jaspi" element
     */
    public org.apache.geronimo.xbeans.geronimo.jaspi.JaspiJaspiType getJaspi()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.jaspi.JaspiJaspiType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.jaspi.JaspiJaspiType)get_store().find_element_user(JASPI$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "jaspi" element
     */
    public void setJaspi(org.apache.geronimo.xbeans.geronimo.jaspi.JaspiJaspiType jaspi)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.jaspi.JaspiJaspiType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.jaspi.JaspiJaspiType)get_store().find_element_user(JASPI$0, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.xbeans.geronimo.jaspi.JaspiJaspiType)get_store().add_element_user(JASPI$0);
            }
            target.set(jaspi);
        }
    }
    
    /**
     * Appends and returns a new empty "jaspi" element
     */
    public org.apache.geronimo.xbeans.geronimo.jaspi.JaspiJaspiType addNewJaspi()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.jaspi.JaspiJaspiType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.jaspi.JaspiJaspiType)get_store().add_element_user(JASPI$0);
            return target;
        }
    }
}
