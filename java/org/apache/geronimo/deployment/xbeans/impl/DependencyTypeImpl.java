/*
 * XML Type:  dependencyType
 * Namespace: http://geronimo.apache.org/xml/ns/deployment-1.2
 * Java type: org.apache.geronimo.deployment.xbeans.DependencyType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.deployment.xbeans.impl;
/**
 * An XML dependencyType(@http://geronimo.apache.org/xml/ns/deployment-1.2).
 *
 * This is a complex type.
 */
public class DependencyTypeImpl extends org.apache.geronimo.deployment.xbeans.impl.ArtifactTypeImpl implements org.apache.geronimo.deployment.xbeans.DependencyType
{
    private static final long serialVersionUID = 1L;
    
    public DependencyTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IMPORT$0 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/deployment-1.2", "import");
    
    
    /**
     * Gets the "import" element
     */
    public org.apache.geronimo.deployment.xbeans.ImportType.Enum getImport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IMPORT$0, 0);
            if (target == null)
            {
                return null;
            }
            return (org.apache.geronimo.deployment.xbeans.ImportType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "import" element
     */
    public org.apache.geronimo.deployment.xbeans.ImportType xgetImport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.xbeans.ImportType target = null;
            target = (org.apache.geronimo.deployment.xbeans.ImportType)get_store().find_element_user(IMPORT$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "import" element
     */
    public boolean isSetImport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IMPORT$0) != 0;
        }
    }
    
    /**
     * Sets the "import" element
     */
    public void setImport(org.apache.geronimo.deployment.xbeans.ImportType.Enum ximport)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IMPORT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IMPORT$0);
            }
            target.setEnumValue(ximport);
        }
    }
    
    /**
     * Sets (as xml) the "import" element
     */
    public void xsetImport(org.apache.geronimo.deployment.xbeans.ImportType ximport)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.xbeans.ImportType target = null;
            target = (org.apache.geronimo.deployment.xbeans.ImportType)get_store().find_element_user(IMPORT$0, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.deployment.xbeans.ImportType)get_store().add_element_user(IMPORT$0);
            }
            target.set(ximport);
        }
    }
    
    /**
     * Unsets the "import" element
     */
    public void unsetImport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IMPORT$0, 0);
        }
    }
}
