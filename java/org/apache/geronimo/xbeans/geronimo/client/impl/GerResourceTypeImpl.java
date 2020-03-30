/*
 * XML Type:  resourceType
 * Namespace: http://geronimo.apache.org/xml/ns/j2ee/application-client-2.0
 * Java type: org.apache.geronimo.xbeans.geronimo.client.GerResourceType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.geronimo.client.impl;
/**
 * An XML resourceType(@http://geronimo.apache.org/xml/ns/j2ee/application-client-2.0).
 *
 * This is a complex type.
 */
public class GerResourceTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.xbeans.geronimo.client.GerResourceType
{
    private static final long serialVersionUID = 1L;
    
    public GerResourceTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXTERNALRAR$0 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/j2ee/application-client-2.0", "external-rar");
    private static final javax.xml.namespace.QName INTERNALRAR$2 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/j2ee/application-client-2.0", "internal-rar");
    private static final javax.xml.namespace.QName CONNECTOR$4 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/j2ee/connector-1.2", "connector");
    
    
    /**
     * Gets the "external-rar" element
     */
    public org.apache.geronimo.deployment.xbeans.PatternType getExternalRar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.xbeans.PatternType target = null;
            target = (org.apache.geronimo.deployment.xbeans.PatternType)get_store().find_element_user(EXTERNALRAR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "external-rar" element
     */
    public boolean isSetExternalRar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXTERNALRAR$0) != 0;
        }
    }
    
    /**
     * Sets the "external-rar" element
     */
    public void setExternalRar(org.apache.geronimo.deployment.xbeans.PatternType externalRar)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.xbeans.PatternType target = null;
            target = (org.apache.geronimo.deployment.xbeans.PatternType)get_store().find_element_user(EXTERNALRAR$0, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.deployment.xbeans.PatternType)get_store().add_element_user(EXTERNALRAR$0);
            }
            target.set(externalRar);
        }
    }
    
    /**
     * Appends and returns a new empty "external-rar" element
     */
    public org.apache.geronimo.deployment.xbeans.PatternType addNewExternalRar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.xbeans.PatternType target = null;
            target = (org.apache.geronimo.deployment.xbeans.PatternType)get_store().add_element_user(EXTERNALRAR$0);
            return target;
        }
    }
    
    /**
     * Unsets the "external-rar" element
     */
    public void unsetExternalRar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXTERNALRAR$0, 0);
        }
    }
    
    /**
     * Gets the "internal-rar" element
     */
    public java.lang.String getInternalRar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTERNALRAR$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "internal-rar" element
     */
    public org.apache.xmlbeans.XmlString xgetInternalRar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INTERNALRAR$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "internal-rar" element
     */
    public boolean isSetInternalRar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INTERNALRAR$2) != 0;
        }
    }
    
    /**
     * Sets the "internal-rar" element
     */
    public void setInternalRar(java.lang.String internalRar)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTERNALRAR$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INTERNALRAR$2);
            }
            target.setStringValue(internalRar);
        }
    }
    
    /**
     * Sets (as xml) the "internal-rar" element
     */
    public void xsetInternalRar(org.apache.xmlbeans.XmlString internalRar)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INTERNALRAR$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(INTERNALRAR$2);
            }
            target.set(internalRar);
        }
    }
    
    /**
     * Unsets the "internal-rar" element
     */
    public void unsetInternalRar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INTERNALRAR$2, 0);
        }
    }
    
    /**
     * Gets the "connector" element
     */
    public org.apache.geronimo.xbeans.connector.GerConnectorType getConnector()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.connector.GerConnectorType target = null;
            target = (org.apache.geronimo.xbeans.connector.GerConnectorType)get_store().find_element_user(CONNECTOR$4, 0);
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
            target = (org.apache.geronimo.xbeans.connector.GerConnectorType)get_store().find_element_user(CONNECTOR$4, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.xbeans.connector.GerConnectorType)get_store().add_element_user(CONNECTOR$4);
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
            target = (org.apache.geronimo.xbeans.connector.GerConnectorType)get_store().add_element_user(CONNECTOR$4);
            return target;
        }
    }
}
