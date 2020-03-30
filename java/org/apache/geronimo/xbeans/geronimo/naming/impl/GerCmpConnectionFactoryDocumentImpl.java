/*
 * An XML document type.
 * Localname: cmp-connection-factory
 * Namespace: http://geronimo.apache.org/xml/ns/naming-1.2
 * Java type: org.apache.geronimo.xbeans.geronimo.naming.GerCmpConnectionFactoryDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.geronimo.naming.impl;
/**
 * A document containing one cmp-connection-factory(@http://geronimo.apache.org/xml/ns/naming-1.2) element.
 *
 * This is a complex type.
 */
public class GerCmpConnectionFactoryDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.xbeans.geronimo.naming.GerCmpConnectionFactoryDocument
{
    private static final long serialVersionUID = 1L;
    
    public GerCmpConnectionFactoryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CMPCONNECTIONFACTORY$0 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "cmp-connection-factory");
    
    
    /**
     * Gets the "cmp-connection-factory" element
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerResourceLocatorType getCmpConnectionFactory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerResourceLocatorType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerResourceLocatorType)get_store().find_element_user(CMPCONNECTIONFACTORY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "cmp-connection-factory" element
     */
    public void setCmpConnectionFactory(org.apache.geronimo.xbeans.geronimo.naming.GerResourceLocatorType cmpConnectionFactory)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerResourceLocatorType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerResourceLocatorType)get_store().find_element_user(CMPCONNECTIONFACTORY$0, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.xbeans.geronimo.naming.GerResourceLocatorType)get_store().add_element_user(CMPCONNECTIONFACTORY$0);
            }
            target.set(cmpConnectionFactory);
        }
    }
    
    /**
     * Appends and returns a new empty "cmp-connection-factory" element
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerResourceLocatorType addNewCmpConnectionFactory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerResourceLocatorType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerResourceLocatorType)get_store().add_element_user(CMPCONNECTIONFACTORY$0);
            return target;
        }
    }
}
