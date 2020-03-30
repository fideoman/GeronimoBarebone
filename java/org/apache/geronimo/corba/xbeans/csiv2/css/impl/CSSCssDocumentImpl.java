/*
 * An XML document type.
 * Localname: css
 * Namespace: http://openejb.apache.org/xml/ns/corba-css-config-2.1
 * Java type: org.apache.geronimo.corba.xbeans.csiv2.css.CSSCssDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.corba.xbeans.csiv2.css.impl;
/**
 * A document containing one css(@http://openejb.apache.org/xml/ns/corba-css-config-2.1) element.
 *
 * This is a complex type.
 */
public class CSSCssDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.corba.xbeans.csiv2.css.CSSCssDocument
{
    private static final long serialVersionUID = 1L;
    
    public CSSCssDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CSS$0 = 
        new javax.xml.namespace.QName("http://openejb.apache.org/xml/ns/corba-css-config-2.1", "css");
    
    
    /**
     * Gets the "css" element
     */
    public org.apache.geronimo.corba.xbeans.csiv2.css.CSSCssType getCss()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.corba.xbeans.csiv2.css.CSSCssType target = null;
            target = (org.apache.geronimo.corba.xbeans.csiv2.css.CSSCssType)get_store().find_element_user(CSS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "css" element
     */
    public void setCss(org.apache.geronimo.corba.xbeans.csiv2.css.CSSCssType css)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.corba.xbeans.csiv2.css.CSSCssType target = null;
            target = (org.apache.geronimo.corba.xbeans.csiv2.css.CSSCssType)get_store().find_element_user(CSS$0, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.corba.xbeans.csiv2.css.CSSCssType)get_store().add_element_user(CSS$0);
            }
            target.set(css);
        }
    }
    
    /**
     * Appends and returns a new empty "css" element
     */
    public org.apache.geronimo.corba.xbeans.csiv2.css.CSSCssType addNewCss()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.corba.xbeans.csiv2.css.CSSCssType target = null;
            target = (org.apache.geronimo.corba.xbeans.csiv2.css.CSSCssType)get_store().add_element_user(CSS$0);
            return target;
        }
    }
}
