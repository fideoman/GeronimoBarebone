/*
 * XML Type:  login-module-refType
 * Namespace: http://geronimo.apache.org/xml/ns/loginconfig-2.0
 * Java type: org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginModuleRefType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.geronimo.loginconfig.impl;
/**
 * An XML login-module-refType(@http://geronimo.apache.org/xml/ns/loginconfig-2.0).
 *
 * This is a complex type.
 */
public class GerLoginModuleRefTypeImpl extends org.apache.geronimo.xbeans.geronimo.loginconfig.impl.GerAbstractLoginModuleTypeImpl implements org.apache.geronimo.xbeans.geronimo.loginconfig.GerLoginModuleRefType
{
    private static final long serialVersionUID = 1L;
    
    public GerLoginModuleRefTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PATTERN$0 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/loginconfig-2.0", "pattern");
    
    
    /**
     * Gets the "pattern" element
     */
    public org.apache.geronimo.deployment.xbeans.PatternType getPattern()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.xbeans.PatternType target = null;
            target = (org.apache.geronimo.deployment.xbeans.PatternType)get_store().find_element_user(PATTERN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "pattern" element
     */
    public void setPattern(org.apache.geronimo.deployment.xbeans.PatternType pattern)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.xbeans.PatternType target = null;
            target = (org.apache.geronimo.deployment.xbeans.PatternType)get_store().find_element_user(PATTERN$0, 0);
            if (target == null)
            {
                target = (org.apache.geronimo.deployment.xbeans.PatternType)get_store().add_element_user(PATTERN$0);
            }
            target.set(pattern);
        }
    }
    
    /**
     * Appends and returns a new empty "pattern" element
     */
    public org.apache.geronimo.deployment.xbeans.PatternType addNewPattern()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.xbeans.PatternType target = null;
            target = (org.apache.geronimo.deployment.xbeans.PatternType)get_store().add_element_user(PATTERN$0);
            return target;
        }
    }
}
