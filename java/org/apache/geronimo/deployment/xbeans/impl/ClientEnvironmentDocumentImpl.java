/*
 * An XML document type.
 * Localname: client-environment
 * Namespace: http://geronimo.apache.org/xml/ns/deployment-1.2
 * Java type: org.apache.geronimo.deployment.xbeans.ClientEnvironmentDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.deployment.xbeans.impl;
/**
 * A document containing one client-environment(@http://geronimo.apache.org/xml/ns/deployment-1.2) element.
 *
 * This is a complex type.
 */
public class ClientEnvironmentDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.deployment.xbeans.ClientEnvironmentDocument
{
    private static final long serialVersionUID = 1L;
    
    public ClientEnvironmentDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CLIENTENVIRONMENT$0 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/deployment-1.2", "client-environment");
    
    
    /**
     * Gets the "client-environment" element
     */
    public org.apache.geronimo.deployment.xbeans.EnvironmentType getClientEnvironment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.xbeans.EnvironmentType target = null;
            target = (org.apache.geronimo.deployment.xbeans.EnvironmentType)get_store().find_element_user(CLIENTENVIRONMENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "client-environment" element
     */
    public void setClientEnvironment(org.apache.geronimo.deployment.xbeans.EnvironmentType clientEnvironment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.xbeans.EnvironmentType target = null;
            target = (org.apache.geronimo.deployment.xbeans.EnvironmentType)get_store().find_element_user(CLIENTENVIRONMENT$0, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.deployment.xbeans.EnvironmentType)get_store().add_element_user(CLIENTENVIRONMENT$0);
            }
            target.set(clientEnvironment);
        }
    }
    
    /**
     * Appends and returns a new empty "client-environment" element
     */
    public org.apache.geronimo.deployment.xbeans.EnvironmentType addNewClientEnvironment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.xbeans.EnvironmentType target = null;
            target = (org.apache.geronimo.deployment.xbeans.EnvironmentType)get_store().add_element_user(CLIENTENVIRONMENT$0);
            return target;
        }
    }
}
