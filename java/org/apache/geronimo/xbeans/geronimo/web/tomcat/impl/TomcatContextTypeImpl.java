/*
 * XML Type:  contextType
 * Namespace: http://geronimo.apache.org/xml/ns/j2ee/web/tomcat-2.0.1
 * Java type: org.apache.geronimo.xbeans.geronimo.web.tomcat.TomcatContextType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.geronimo.web.tomcat.impl;
/**
 * An XML contextType(@http://geronimo.apache.org/xml/ns/j2ee/web/tomcat-2.0.1).
 *
 * This is a complex type.
 */
public class TomcatContextTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.geronimo.xbeans.geronimo.web.tomcat.TomcatContextType
{
    private static final long serialVersionUID = 1L;
    
    public TomcatContextTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARAMETER$0 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/j2ee/web/tomcat-2.0.1", "parameter");
    
    
    /**
     * Gets array of all "parameter" elements
     */
    public org.apache.geronimo.xbeans.geronimo.web.tomcat.TomcatParameterType[] getParameterArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PARAMETER$0, targetList);
            org.apache.geronimo.xbeans.geronimo.web.tomcat.TomcatParameterType[] result = new org.apache.geronimo.xbeans.geronimo.web.tomcat.TomcatParameterType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "parameter" element
     */
    public org.apache.geronimo.xbeans.geronimo.web.tomcat.TomcatParameterType getParameterArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.web.tomcat.TomcatParameterType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.web.tomcat.TomcatParameterType)get_store().find_element_user(PARAMETER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "parameter" element
     */
    public int sizeOfParameterArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARAMETER$0);
        }
    }
    
    /**
     * Sets array of all "parameter" element
     */
    public void setParameterArray(org.apache.geronimo.xbeans.geronimo.web.tomcat.TomcatParameterType[] parameterArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(parameterArray, PARAMETER$0);
        }
    }
    
    /**
     * Sets ith "parameter" element
     */
    public void setParameterArray(int i, org.apache.geronimo.xbeans.geronimo.web.tomcat.TomcatParameterType parameter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.web.tomcat.TomcatParameterType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.web.tomcat.TomcatParameterType)get_store().find_element_user(PARAMETER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(parameter);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "parameter" element
     */
    public org.apache.geronimo.xbeans.geronimo.web.tomcat.TomcatParameterType insertNewParameter(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.web.tomcat.TomcatParameterType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.web.tomcat.TomcatParameterType)get_store().insert_element_user(PARAMETER$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "parameter" element
     */
    public org.apache.geronimo.xbeans.geronimo.web.tomcat.TomcatParameterType addNewParameter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.geronimo.web.tomcat.TomcatParameterType target = null;
            target = (org.apache.geronimo.xbeans.geronimo.web.tomcat.TomcatParameterType)get_store().add_element_user(PARAMETER$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "parameter" element
     */
    public void removeParameter(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARAMETER$0, i);
        }
    }
}
