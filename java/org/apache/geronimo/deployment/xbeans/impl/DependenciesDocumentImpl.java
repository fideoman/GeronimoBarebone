/*
 * An XML document type.
 * Localname: dependencies
 * Namespace: http://geronimo.apache.org/xml/ns/deployment-1.2
 * Java type: org.apache.geronimo.deployment.xbeans.DependenciesDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.deployment.xbeans.impl;
/**
 * A document containing one dependencies(@http://geronimo.apache.org/xml/ns/deployment-1.2) element.
 *
 * This is a complex type.
 */
public class DependenciesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.deployment.xbeans.DependenciesDocument
{
    private static final long serialVersionUID = 1L;
    
    public DependenciesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DEPENDENCIES$0 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/deployment-1.2", "dependencies");
    
    
    /**
     * Gets the "dependencies" element
     */
    public org.apache.geronimo.deployment.xbeans.DependenciesType getDependencies()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.xbeans.DependenciesType target = null;
            target = (org.apache.geronimo.deployment.xbeans.DependenciesType)get_store().find_element_user(DEPENDENCIES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "dependencies" element
     */
    public void setDependencies(org.apache.geronimo.deployment.xbeans.DependenciesType dependencies)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.xbeans.DependenciesType target = null;
            target = (org.apache.geronimo.deployment.xbeans.DependenciesType)get_store().find_element_user(DEPENDENCIES$0, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.deployment.xbeans.DependenciesType)get_store().add_element_user(DEPENDENCIES$0);
            }
            target.set(dependencies);
        }
    }
    
    /**
     * Appends and returns a new empty "dependencies" element
     */
    public org.apache.geronimo.deployment.xbeans.DependenciesType addNewDependencies()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.xbeans.DependenciesType target = null;
            target = (org.apache.geronimo.deployment.xbeans.DependenciesType)get_store().add_element_user(DEPENDENCIES$0);
            return target;
        }
    }
}
