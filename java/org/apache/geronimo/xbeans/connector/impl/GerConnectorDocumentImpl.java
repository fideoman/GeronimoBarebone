/*
 * An XML document type.
 * Localname: connector
 * Namespace: http://geronimo.apache.org/xml/ns/j2ee/connector-1.2
 * Java type: org.apache.geronimo.xbeans.connector.GerConnectorDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.connector.impl;
/**
 * A document containing one connector(@http://geronimo.apache.org/xml/ns/j2ee/connector-1.2) element.
 *
 * This is a complex type.
 */
public class GerConnectorDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.xbeans.connector.GerConnectorDocument
{
    private static final long serialVersionUID = 1L;
    
    public GerConnectorDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONNECTOR$0 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/j2ee/connector-1.2", "connector");
    
    
    /**
     * Gets the "connector" element
     */
    public org.apache.geronimo.xbeans.connector.GerConnectorType getConnector()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.connector.GerConnectorType target = null;
            target = (org.apache.geronimo.xbeans.connector.GerConnectorType)get_store().find_element_user(CONNECTOR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "connector" element
     */
    public void setConnector(org.apache.geronimo.xbeans.connector.GerConnectorType connector)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.connector.GerConnectorType target = null;
            target = (org.apache.geronimo.xbeans.connector.GerConnectorType)get_store().find_element_user(CONNECTOR$0, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.xbeans.connector.GerConnectorType)get_store().add_element_user(CONNECTOR$0);
            }
            target.set(connector);
        }
    }
    
    /**
     * Appends and returns a new empty "connector" element
     */
    public org.apache.geronimo.xbeans.connector.GerConnectorType addNewConnector()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.connector.GerConnectorType target = null;
            target = (org.apache.geronimo.xbeans.connector.GerConnectorType)get_store().add_element_user(CONNECTOR$0);
            return target;
        }
    }
}
