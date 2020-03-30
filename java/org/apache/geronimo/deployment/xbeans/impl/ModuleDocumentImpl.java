/*
 * An XML document type.
 * Localname: module
 * Namespace: http://geronimo.apache.org/xml/ns/deployment-1.2
 * Java type: org.apache.geronimo.deployment.xbeans.ModuleDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.deployment.xbeans.impl;
/**
 * A document containing one module(@http://geronimo.apache.org/xml/ns/deployment-1.2) element.
 *
 * This is a complex type.
 */
public class ModuleDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.deployment.xbeans.ModuleDocument
{
    private static final long serialVersionUID = 1L;
    
    public ModuleDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MODULE$0 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/deployment-1.2", "module");
    
    
    /**
     * Gets the "module" element
     */
    public org.apache.geronimo.deployment.xbeans.ModuleType getModule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.xbeans.ModuleType target = null;
            target = (org.apache.geronimo.deployment.xbeans.ModuleType)get_store().find_element_user(MODULE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "module" element
     */
    public void setModule(org.apache.geronimo.deployment.xbeans.ModuleType module)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.xbeans.ModuleType target = null;
            target = (org.apache.geronimo.deployment.xbeans.ModuleType)get_store().find_element_user(MODULE$0, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.deployment.xbeans.ModuleType)get_store().add_element_user(MODULE$0);
            }
            target.set(module);
        }
    }
    
    /**
     * Appends and returns a new empty "module" element
     */
    public org.apache.geronimo.deployment.xbeans.ModuleType addNewModule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.xbeans.ModuleType target = null;
            target = (org.apache.geronimo.deployment.xbeans.ModuleType)get_store().add_element_user(MODULE$0);
            return target;
        }
    }
}
