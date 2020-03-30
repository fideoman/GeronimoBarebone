/*
 * An XML document type.
 * Localname: server-environment
 * Namespace: http://geronimo.apache.org/xml/ns/deployment-1.2
 * Java type: org.apache.geronimo.deployment.xbeans.ServerEnvironmentDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.deployment.xbeans.impl;
/**
 * A document containing one server-environment(@http://geronimo.apache.org/xml/ns/deployment-1.2) element.
 *
 * This is a complex type.
 */
public class ServerEnvironmentDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.deployment.xbeans.ServerEnvironmentDocument
{
    private static final long serialVersionUID = 1L;
    
    public ServerEnvironmentDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SERVERENVIRONMENT$0 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/deployment-1.2", "server-environment");
    
    
    /**
     * Gets the "server-environment" element
     */
    public org.apache.geronimo.deployment.xbeans.EnvironmentType getServerEnvironment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.xbeans.EnvironmentType target = null;
            target = (org.apache.geronimo.deployment.xbeans.EnvironmentType)get_store().find_element_user(SERVERENVIRONMENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "server-environment" element
     */
    public void setServerEnvironment(org.apache.geronimo.deployment.xbeans.EnvironmentType serverEnvironment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.xbeans.EnvironmentType target = null;
            target = (org.apache.geronimo.deployment.xbeans.EnvironmentType)get_store().find_element_user(SERVERENVIRONMENT$0, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.deployment.xbeans.EnvironmentType)get_store().add_element_user(SERVERENVIRONMENT$0);
            }
            target.set(serverEnvironment);
        }
    }
    
    /**
     * Appends and returns a new empty "server-environment" element
     */
    public org.apache.geronimo.deployment.xbeans.EnvironmentType addNewServerEnvironment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.xbeans.EnvironmentType target = null;
            target = (org.apache.geronimo.deployment.xbeans.EnvironmentType)get_store().add_element_user(SERVERENVIRONMENT$0);
            return target;
        }
    }
}
