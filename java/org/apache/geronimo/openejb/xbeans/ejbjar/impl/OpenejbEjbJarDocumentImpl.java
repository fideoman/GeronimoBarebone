/*
 * An XML document type.
 * Localname: ejb-jar
 * Namespace: http://geronimo.apache.org/xml/ns/j2ee/ejb/openejb-2.0
 * Java type: org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbEjbJarDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.openejb.xbeans.ejbjar.impl;
/**
 * A document containing one ejb-jar(@http://geronimo.apache.org/xml/ns/j2ee/ejb/openejb-2.0) element.
 *
 * This is a complex type.
 */
public class OpenejbEjbJarDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbEjbJarDocument
{
    private static final long serialVersionUID = 1L;
    
    public OpenejbEjbJarDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EJBJAR$0 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/j2ee/ejb/openejb-2.0", "ejb-jar");
    
    
    /**
     * Gets the "ejb-jar" element
     */
    public org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbGeronimoEjbJarType getEjbJar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbGeronimoEjbJarType target = null;
            target = (org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbGeronimoEjbJarType)get_store().find_element_user(EJBJAR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ejb-jar" element
     */
    public void setEjbJar(org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbGeronimoEjbJarType ejbJar)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbGeronimoEjbJarType target = null;
            target = (org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbGeronimoEjbJarType)get_store().find_element_user(EJBJAR$0, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbGeronimoEjbJarType)get_store().add_element_user(EJBJAR$0);
            }
            target.set(ejbJar);
        }
    }
    
    /**
     * Appends and returns a new empty "ejb-jar" element
     */
    public org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbGeronimoEjbJarType addNewEjbJar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbGeronimoEjbJarType target = null;
            target = (org.apache.geronimo.openejb.xbeans.ejbjar.OpenejbGeronimoEjbJarType)get_store().add_element_user(EJBJAR$0);
            return target;
        }
    }
}
