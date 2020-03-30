/*
 * An XML document type.
 * Localname: message-destination
 * Namespace: http://geronimo.apache.org/xml/ns/naming-1.2
 * Java type: org.apache.geronimo.xbeans.geronimo.naming.GerMessageDestinationDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.geronimo.naming.impl;
/**
 * A document containing one message-destination(@http://geronimo.apache.org/xml/ns/naming-1.2) element.
 *
 * This is a complex type.
 */
public class GerMessageDestinationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.xbeans.geronimo.naming.GerMessageDestinationDocument
{
    private static final long serialVersionUID = 1L;
    
    public GerMessageDestinationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MESSAGEDESTINATION$0 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/naming-1.2", "message-destination");
    
    
    /**
     * Gets the "message-destination" element
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerMessageDestinationType getMessageDestination()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerMessageDestinationType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerMessageDestinationType)get_store().find_element_user(MESSAGEDESTINATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "message-destination" element
     */
    public void setMessageDestination(org.apache.geronimo.xbeans.geronimo.naming.GerMessageDestinationType messageDestination)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerMessageDestinationType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerMessageDestinationType)get_store().find_element_user(MESSAGEDESTINATION$0, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.xbeans.geronimo.naming.GerMessageDestinationType)get_store().add_element_user(MESSAGEDESTINATION$0);
            }
            target.set(messageDestination);
        }
    }
    
    /**
     * Appends and returns a new empty "message-destination" element
     */
    public org.apache.geronimo.xbeans.geronimo.naming.GerMessageDestinationType addNewMessageDestination()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.naming.GerMessageDestinationType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.naming.GerMessageDestinationType)get_store().add_element_user(MESSAGEDESTINATION$0);
            return target;
        }
    }
}
