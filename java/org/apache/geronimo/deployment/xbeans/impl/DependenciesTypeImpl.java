/*
 * XML Type:  dependenciesType
 * Namespace: http://geronimo.apache.org/xml/ns/deployment-1.2
 * Java type: org.apache.geronimo.deployment.xbeans.DependenciesType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.deployment.xbeans.impl;
/**
 * An XML dependenciesType(@http://geronimo.apache.org/xml/ns/deployment-1.2).
 *
 * This is a complex type.
 */
public class DependenciesTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.deployment.xbeans.DependenciesType
{
    private static final long serialVersionUID = 1L;
    
    public DependenciesTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DEPENDENCY$0 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/deployment-1.2", "dependency");
    
    
    /**
     * Gets array of all "dependency" elements
     */
    public org.apache.geronimo.deployment.xbeans.DependencyType[] getDependencyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DEPENDENCY$0, targetList);
            org.apache.geronimo.deployment.xbeans.DependencyType[] result = new org.apache.geronimo.deployment.xbeans.DependencyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "dependency" element
     */
    public org.apache.geronimo.deployment.xbeans.DependencyType getDependencyArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.xbeans.DependencyType target = null;
            target = (org.apache.geronimo.deployment.xbeans.DependencyType)get_store().find_element_user(DEPENDENCY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "dependency" element
     */
    public int sizeOfDependencyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DEPENDENCY$0);
        }
    }
    
    /**
     * Sets array of all "dependency" element
     */
    public void setDependencyArray(org.apache.geronimo.deployment.xbeans.DependencyType[] dependencyArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dependencyArray, DEPENDENCY$0);
        }
    }
    
    /**
     * Sets ith "dependency" element
     */
    public void setDependencyArray(int i, org.apache.geronimo.deployment.xbeans.DependencyType dependency)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.xbeans.DependencyType target = null;
            target = (org.apache.geronimo.deployment.xbeans.DependencyType)get_store().find_element_user(DEPENDENCY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(dependency);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "dependency" element
     */
    public org.apache.geronimo.deployment.xbeans.DependencyType insertNewDependency(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.xbeans.DependencyType target = null;
            target = (org.apache.geronimo.deployment.xbeans.DependencyType)get_store().insert_element_user(DEPENDENCY$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "dependency" element
     */
    public org.apache.geronimo.deployment.xbeans.DependencyType addNewDependency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.xbeans.DependencyType target = null;
            target = (org.apache.geronimo.deployment.xbeans.DependencyType)get_store().add_element_user(DEPENDENCY$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "dependency" element
     */
    public void removeDependency(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DEPENDENCY$0, i);
        }
    }
}
