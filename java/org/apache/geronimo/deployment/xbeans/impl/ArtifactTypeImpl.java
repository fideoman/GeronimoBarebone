/*
 * XML Type:  artifactType
 * Namespace: http://geronimo.apache.org/xml/ns/deployment-1.2
 * Java type: org.apache.geronimo.deployment.xbeans.ArtifactType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.deployment.xbeans.impl;
/**
 * An XML artifactType(@http://geronimo.apache.org/xml/ns/deployment-1.2).
 *
 * This is a complex type.
 */
public class ArtifactTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.deployment.xbeans.ArtifactType
{
    private static final long serialVersionUID = 1L;
    
    public ArtifactTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GROUPID$0 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/deployment-1.2", "groupId");
    private static final javax.xml.namespace.QName ARTIFACTID$2 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/deployment-1.2", "artifactId");
    private static final javax.xml.namespace.QName VERSION$4 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/deployment-1.2", "version");
    private static final javax.xml.namespace.QName TYPE$6 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/deployment-1.2", "type");
    
    
    /**
     * Gets the "groupId" element
     */
    public java.lang.String getGroupId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GROUPID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "groupId" element
     */
    public org.apache.xmlbeans.XmlString xgetGroupId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GROUPID$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "groupId" element
     */
    public boolean isSetGroupId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GROUPID$0) != 0;
        }
    }
    
    /**
     * Sets the "groupId" element
     */
    public void setGroupId(java.lang.String groupId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GROUPID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GROUPID$0);
            }
            target.setStringValue(groupId);
        }
    }
    
    /**
     * Sets (as xml) the "groupId" element
     */
    public void xsetGroupId(org.apache.xmlbeans.XmlString groupId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GROUPID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(GROUPID$0);
            }
            target.set(groupId);
        }
    }
    
    /**
     * Unsets the "groupId" element
     */
    public void unsetGroupId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GROUPID$0, 0);
        }
    }
    
    /**
     * Gets the "artifactId" element
     */
    public java.lang.String getArtifactId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARTIFACTID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "artifactId" element
     */
    public org.apache.xmlbeans.XmlString xgetArtifactId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARTIFACTID$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "artifactId" element
     */
    public void setArtifactId(java.lang.String artifactId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARTIFACTID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ARTIFACTID$2);
            }
            target.setStringValue(artifactId);
        }
    }
    
    /**
     * Sets (as xml) the "artifactId" element
     */
    public void xsetArtifactId(org.apache.xmlbeans.XmlString artifactId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARTIFACTID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ARTIFACTID$2);
            }
            target.set(artifactId);
        }
    }
    
    /**
     * Gets the "version" element
     */
    public java.lang.String getVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERSION$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "version" element
     */
    public org.apache.xmlbeans.XmlString xgetVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VERSION$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "version" element
     */
    public boolean isSetVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VERSION$4) != 0;
        }
    }
    
    /**
     * Sets the "version" element
     */
    public void setVersion(java.lang.String version)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERSION$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VERSION$4);
            }
            target.setStringValue(version);
        }
    }
    
    /**
     * Sets (as xml) the "version" element
     */
    public void xsetVersion(org.apache.xmlbeans.XmlString version)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VERSION$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VERSION$4);
            }
            target.set(version);
        }
    }
    
    /**
     * Unsets the "version" element
     */
    public void unsetVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VERSION$4, 0);
        }
    }
    
    /**
     * Gets the "type" element
     */
    public java.lang.String getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "type" element
     */
    public org.apache.xmlbeans.XmlString xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TYPE$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "type" element
     */
    public boolean isSetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TYPE$6) != 0;
        }
    }
    
    /**
     * Sets the "type" element
     */
    public void setType(java.lang.String type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TYPE$6);
            }
            target.setStringValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "type" element
     */
    public void xsetType(org.apache.xmlbeans.XmlString type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TYPE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TYPE$6);
            }
            target.set(type);
        }
    }
    
    /**
     * Unsets the "type" element
     */
    public void unsetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TYPE$6, 0);
        }
    }
}
