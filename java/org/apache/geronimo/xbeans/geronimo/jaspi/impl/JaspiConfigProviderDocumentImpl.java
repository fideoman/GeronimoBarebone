/*
 * An XML document type.
 * Localname: configProvider
 * Namespace: http://geronimo.apache.org/xml/ns/geronimo-jaspi
 * Java type: org.apache.geronimo.xbeans.geronimo.jaspi.JaspiConfigProviderDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.geronimo.jaspi.impl;
/**
 * A document containing one configProvider(@http://geronimo.apache.org/xml/ns/geronimo-jaspi) element.
 *
 * This is a complex type.
 */
public class JaspiConfigProviderDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.xbeans.geronimo.jaspi.JaspiConfigProviderDocument
{
    private static final long serialVersionUID = 1L;
    
    public JaspiConfigProviderDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONFIGPROVIDER$0 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/geronimo-jaspi", "configProvider");
    
    
    /**
     * Gets the "configProvider" element
     */
    public org.apache.geronimo.xbeans.geronimo.jaspi.JaspiConfigProviderType getConfigProvider()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.jaspi.JaspiConfigProviderType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.jaspi.JaspiConfigProviderType)get_store().find_element_user(CONFIGPROVIDER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "configProvider" element
     */
    public void setConfigProvider(org.apache.geronimo.xbeans.geronimo.jaspi.JaspiConfigProviderType configProvider)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.jaspi.JaspiConfigProviderType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.jaspi.JaspiConfigProviderType)get_store().find_element_user(CONFIGPROVIDER$0, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.xbeans.geronimo.jaspi.JaspiConfigProviderType)get_store().add_element_user(CONFIGPROVIDER$0);
            }
            target.set(configProvider);
        }
    }
    
    /**
     * Appends and returns a new empty "configProvider" element
     */
    public org.apache.geronimo.xbeans.geronimo.jaspi.JaspiConfigProviderType addNewConfigProvider()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.jaspi.JaspiConfigProviderType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.jaspi.JaspiConfigProviderType)get_store().add_element_user(CONFIGPROVIDER$0);
            return target;
        }
    }
}
