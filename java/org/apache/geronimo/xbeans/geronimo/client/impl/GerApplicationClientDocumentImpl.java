/*
 * An XML document type.
 * Localname: application-client
 * Namespace: http://geronimo.apache.org/xml/ns/j2ee/application-client-2.0
 * Java type: org.apache.geronimo.xbeans.geronimo.client.GerApplicationClientDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.geronimo.client.impl;
/**
 * A document containing one application-client(@http://geronimo.apache.org/xml/ns/j2ee/application-client-2.0) element.
 *
 * This is a complex type.
 */
public class GerApplicationClientDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.xbeans.geronimo.client.GerApplicationClientDocument
{
    private static final long serialVersionUID = 1L;
    
    public GerApplicationClientDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName APPLICATIONCLIENT$0 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/j2ee/application-client-2.0", "application-client");
    
    
    /**
     * Gets the "application-client" element
     */
    public org.apache.geronimo.xbeans.geronimo.client.GerApplicationClientType getApplicationClient()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.client.GerApplicationClientType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.client.GerApplicationClientType)get_store().find_element_user(APPLICATIONCLIENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "application-client" element
     */
    public void setApplicationClient(org.apache.geronimo.xbeans.geronimo.client.GerApplicationClientType applicationClient)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.client.GerApplicationClientType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.client.GerApplicationClientType)get_store().find_element_user(APPLICATIONCLIENT$0, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.xbeans.geronimo.client.GerApplicationClientType)get_store().add_element_user(APPLICATIONCLIENT$0);
            }
            target.set(applicationClient);
        }
    }
    
    /**
     * Appends and returns a new empty "application-client" element
     */
    public org.apache.geronimo.xbeans.geronimo.client.GerApplicationClientType addNewApplicationClient()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.client.GerApplicationClientType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.client.GerApplicationClientType)get_store().add_element_user(APPLICATIONCLIENT$0);
            return target;
        }
    }
}
