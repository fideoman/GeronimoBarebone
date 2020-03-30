/*
 * An XML document type.
 * Localname: definitions
 * Namespace: http://schemas.xmlsoap.org/wsdl/
 * Java type: org.apache.geronimo.xbeans.wsdl.DefinitionsDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.wsdl.impl;
/**
 * A document containing one definitions(@http://schemas.xmlsoap.org/wsdl/) element.
 *
 * This is a complex type.
 */
public class DefinitionsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.xbeans.wsdl.DefinitionsDocument
{
    private static final long serialVersionUID = 1L;
    
    public DefinitionsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DEFINITIONS$0 = 
        new javax.xml.namespace.QName("http://schemas.xmlsoap.org/wsdl/", "definitions");
    
    
    /**
     * Gets the "definitions" element
     */
    public org.apache.geronimo.xbeans.wsdl.TDefinitions getDefinitions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.wsdl.TDefinitions target = null;
            target = (org.apache.geronimo.xbeans.wsdl.TDefinitions)get_store().find_element_user(DEFINITIONS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "definitions" element
     */
    public void setDefinitions(org.apache.geronimo.xbeans.wsdl.TDefinitions definitions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.wsdl.TDefinitions target = null;
            target = (org.apache.geronimo.xbeans.wsdl.TDefinitions)get_store().find_element_user(DEFINITIONS$0, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.xbeans.wsdl.TDefinitions)get_store().add_element_user(DEFINITIONS$0);
            }
            target.set(definitions);
        }
    }
    
    /**
     * Appends and returns a new empty "definitions" element
     */
    public org.apache.geronimo.xbeans.wsdl.TDefinitions addNewDefinitions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.wsdl.TDefinitions target = null;
            target = (org.apache.geronimo.xbeans.wsdl.TDefinitions)get_store().add_element_user(DEFINITIONS$0);
            return target;
        }
    }
}
