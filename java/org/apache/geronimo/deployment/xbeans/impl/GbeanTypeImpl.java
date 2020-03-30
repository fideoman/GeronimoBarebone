/*
 * XML Type:  gbeanType
 * Namespace: http://geronimo.apache.org/xml/ns/deployment-1.2
 * Java type: org.apache.geronimo.deployment.xbeans.GbeanType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.deployment.xbeans.impl;
/**
 * An XML gbeanType(@http://geronimo.apache.org/xml/ns/deployment-1.2).
 *
 * This is a complex type.
 */
public class GbeanTypeImpl extends org.apache.geronimo.deployment.xbeans.impl.AbstractServiceTypeImpl implements org.apache.geronimo.deployment.xbeans.GbeanType
{
    private static final long serialVersionUID = 1L;
    
    public GbeanTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ATTRIBUTE$0 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/deployment-1.2", "attribute");
    private static final javax.xml.namespace.QName XMLATTRIBUTE$2 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/deployment-1.2", "xml-attribute");
    private static final javax.xml.namespace.QName REFERENCE$4 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/deployment-1.2", "reference");
    private static final javax.xml.namespace.QName REFERENCES$6 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/deployment-1.2", "references");
    private static final javax.xml.namespace.QName XMLREFERENCE$8 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/deployment-1.2", "xml-reference");
    private static final javax.xml.namespace.QName DEPENDENCY$10 = 
        new javax.xml.namespace.QName("http://geronimo.apache.org/xml/ns/deployment-1.2", "dependency");
    private static final javax.xml.namespace.QName NAME$12 = 
        new javax.xml.namespace.QName("", "name");
    private static final javax.xml.namespace.QName CLASS1$14 = 
        new javax.xml.namespace.QName("", "class");
    
    
    /**
     * Gets array of all "attribute" elements
     */
    public org.apache.geronimo.deployment.xbeans.AttributeType[] getAttributeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ATTRIBUTE$0, targetList);
            org.apache.geronimo.deployment.xbeans.AttributeType[] result = new org.apache.geronimo.deployment.xbeans.AttributeType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "attribute" element
     */
    public org.apache.geronimo.deployment.xbeans.AttributeType getAttributeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.xbeans.AttributeType target = null;
            target = (org.apache.geronimo.deployment.xbeans.AttributeType)get_store().find_element_user(ATTRIBUTE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "attribute" element
     */
    public int sizeOfAttributeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ATTRIBUTE$0);
        }
    }
    
    /**
     * Sets array of all "attribute" element
     */
    public void setAttributeArray(org.apache.geronimo.deployment.xbeans.AttributeType[] attributeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(attributeArray, ATTRIBUTE$0);
        }
    }
    
    /**
     * Sets ith "attribute" element
     */
    public void setAttributeArray(int i, org.apache.geronimo.deployment.xbeans.AttributeType attribute)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.xbeans.AttributeType target = null;
            target = (org.apache.geronimo.deployment.xbeans.AttributeType)get_store().find_element_user(ATTRIBUTE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(attribute);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "attribute" element
     */
    public org.apache.geronimo.deployment.xbeans.AttributeType insertNewAttribute(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.xbeans.AttributeType target = null;
            target = (org.apache.geronimo.deployment.xbeans.AttributeType)get_store().insert_element_user(ATTRIBUTE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "attribute" element
     */
    public org.apache.geronimo.deployment.xbeans.AttributeType addNewAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.xbeans.AttributeType target = null;
            target = (org.apache.geronimo.deployment.xbeans.AttributeType)get_store().add_element_user(ATTRIBUTE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "attribute" element
     */
    public void removeAttribute(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ATTRIBUTE$0, i);
        }
    }
    
    /**
     * Gets array of all "xml-attribute" elements
     */
    public org.apache.geronimo.deployment.xbeans.XmlAttributeType[] getXmlAttributeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(XMLATTRIBUTE$2, targetList);
            org.apache.geronimo.deployment.xbeans.XmlAttributeType[] result = new org.apache.geronimo.deployment.xbeans.XmlAttributeType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "xml-attribute" element
     */
    public org.apache.geronimo.deployment.xbeans.XmlAttributeType getXmlAttributeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.xbeans.XmlAttributeType target = null;
            target = (org.apache.geronimo.deployment.xbeans.XmlAttributeType)get_store().find_element_user(XMLATTRIBUTE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "xml-attribute" element
     */
    public int sizeOfXmlAttributeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(XMLATTRIBUTE$2);
        }
    }
    
    /**
     * Sets array of all "xml-attribute" element
     */
    public void setXmlAttributeArray(org.apache.geronimo.deployment.xbeans.XmlAttributeType[] xmlAttributeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(xmlAttributeArray, XMLATTRIBUTE$2);
        }
    }
    
    /**
     * Sets ith "xml-attribute" element
     */
    public void setXmlAttributeArray(int i, org.apache.geronimo.deployment.xbeans.XmlAttributeType xmlAttribute)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.xbeans.XmlAttributeType target = null;
            target = (org.apache.geronimo.deployment.xbeans.XmlAttributeType)get_store().find_element_user(XMLATTRIBUTE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(xmlAttribute);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "xml-attribute" element
     */
    public org.apache.geronimo.deployment.xbeans.XmlAttributeType insertNewXmlAttribute(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.xbeans.XmlAttributeType target = null;
            target = (org.apache.geronimo.deployment.xbeans.XmlAttributeType)get_store().insert_element_user(XMLATTRIBUTE$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "xml-attribute" element
     */
    public org.apache.geronimo.deployment.xbeans.XmlAttributeType addNewXmlAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.xbeans.XmlAttributeType target = null;
            target = (org.apache.geronimo.deployment.xbeans.XmlAttributeType)get_store().add_element_user(XMLATTRIBUTE$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "xml-attribute" element
     */
    public void removeXmlAttribute(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(XMLATTRIBUTE$2, i);
        }
    }
    
    /**
     * Gets array of all "reference" elements
     */
    public org.apache.geronimo.deployment.xbeans.ReferenceType[] getReferenceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(REFERENCE$4, targetList);
            org.apache.geronimo.deployment.xbeans.ReferenceType[] result = new org.apache.geronimo.deployment.xbeans.ReferenceType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "reference" element
     */
    public org.apache.geronimo.deployment.xbeans.ReferenceType getReferenceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.xbeans.ReferenceType target = null;
            target = (org.apache.geronimo.deployment.xbeans.ReferenceType)get_store().find_element_user(REFERENCE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "reference" element
     */
    public int sizeOfReferenceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REFERENCE$4);
        }
    }
    
    /**
     * Sets array of all "reference" element
     */
    public void setReferenceArray(org.apache.geronimo.deployment.xbeans.ReferenceType[] referenceArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(referenceArray, REFERENCE$4);
        }
    }
    
    /**
     * Sets ith "reference" element
     */
    public void setReferenceArray(int i, org.apache.geronimo.deployment.xbeans.ReferenceType reference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.xbeans.ReferenceType target = null;
            target = (org.apache.geronimo.deployment.xbeans.ReferenceType)get_store().find_element_user(REFERENCE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(reference);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "reference" element
     */
    public org.apache.geronimo.deployment.xbeans.ReferenceType insertNewReference(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.xbeans.ReferenceType target = null;
            target = (org.apache.geronimo.deployment.xbeans.ReferenceType)get_store().insert_element_user(REFERENCE$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "reference" element
     */
    public org.apache.geronimo.deployment.xbeans.ReferenceType addNewReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.xbeans.ReferenceType target = null;
            target = (org.apache.geronimo.deployment.xbeans.ReferenceType)get_store().add_element_user(REFERENCE$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "reference" element
     */
    public void removeReference(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REFERENCE$4, i);
        }
    }
    
    /**
     * Gets array of all "references" elements
     */
    public org.apache.geronimo.deployment.xbeans.ReferencesType[] getReferencesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(REFERENCES$6, targetList);
            org.apache.geronimo.deployment.xbeans.ReferencesType[] result = new org.apache.geronimo.deployment.xbeans.ReferencesType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "references" element
     */
    public org.apache.geronimo.deployment.xbeans.ReferencesType getReferencesArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.xbeans.ReferencesType target = null;
            target = (org.apache.geronimo.deployment.xbeans.ReferencesType)get_store().find_element_user(REFERENCES$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "references" element
     */
    public int sizeOfReferencesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REFERENCES$6);
        }
    }
    
    /**
     * Sets array of all "references" element
     */
    public void setReferencesArray(org.apache.geronimo.deployment.xbeans.ReferencesType[] referencesArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(referencesArray, REFERENCES$6);
        }
    }
    
    /**
     * Sets ith "references" element
     */
    public void setReferencesArray(int i, org.apache.geronimo.deployment.xbeans.ReferencesType references)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.xbeans.ReferencesType target = null;
            target = (org.apache.geronimo.deployment.xbeans.ReferencesType)get_store().find_element_user(REFERENCES$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(references);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "references" element
     */
    public org.apache.geronimo.deployment.xbeans.ReferencesType insertNewReferences(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.xbeans.ReferencesType target = null;
            target = (org.apache.geronimo.deployment.xbeans.ReferencesType)get_store().insert_element_user(REFERENCES$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "references" element
     */
    public org.apache.geronimo.deployment.xbeans.ReferencesType addNewReferences()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.xbeans.ReferencesType target = null;
            target = (org.apache.geronimo.deployment.xbeans.ReferencesType)get_store().add_element_user(REFERENCES$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "references" element
     */
    public void removeReferences(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REFERENCES$6, i);
        }
    }
    
    /**
     * Gets array of all "xml-reference" elements
     */
    public org.apache.geronimo.deployment.xbeans.XmlAttributeType[] getXmlReferenceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(XMLREFERENCE$8, targetList);
            org.apache.geronimo.deployment.xbeans.XmlAttributeType[] result = new org.apache.geronimo.deployment.xbeans.XmlAttributeType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "xml-reference" element
     */
    public org.apache.geronimo.deployment.xbeans.XmlAttributeType getXmlReferenceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.xbeans.XmlAttributeType target = null;
            target = (org.apache.geronimo.deployment.xbeans.XmlAttributeType)get_store().find_element_user(XMLREFERENCE$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "xml-reference" element
     */
    public int sizeOfXmlReferenceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(XMLREFERENCE$8);
        }
    }
    
    /**
     * Sets array of all "xml-reference" element
     */
    public void setXmlReferenceArray(org.apache.geronimo.deployment.xbeans.XmlAttributeType[] xmlReferenceArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(xmlReferenceArray, XMLREFERENCE$8);
        }
    }
    
    /**
     * Sets ith "xml-reference" element
     */
    public void setXmlReferenceArray(int i, org.apache.geronimo.deployment.xbeans.XmlAttributeType xmlReference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.xbeans.XmlAttributeType target = null;
            target = (org.apache.geronimo.deployment.xbeans.XmlAttributeType)get_store().find_element_user(XMLREFERENCE$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(xmlReference);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "xml-reference" element
     */
    public org.apache.geronimo.deployment.xbeans.XmlAttributeType insertNewXmlReference(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.xbeans.XmlAttributeType target = null;
            target = (org.apache.geronimo.deployment.xbeans.XmlAttributeType)get_store().insert_element_user(XMLREFERENCE$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "xml-reference" element
     */
    public org.apache.geronimo.deployment.xbeans.XmlAttributeType addNewXmlReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.xbeans.XmlAttributeType target = null;
            target = (org.apache.geronimo.deployment.xbeans.XmlAttributeType)get_store().add_element_user(XMLREFERENCE$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "xml-reference" element
     */
    public void removeXmlReference(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(XMLREFERENCE$8, i);
        }
    }
    
    /**
     * Gets array of all "dependency" elements
     */
    public org.apache.geronimo.deployment.xbeans.PatternType[] getDependencyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DEPENDENCY$10, targetList);
            org.apache.geronimo.deployment.xbeans.PatternType[] result = new org.apache.geronimo.deployment.xbeans.PatternType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "dependency" element
     */
    public org.apache.geronimo.deployment.xbeans.PatternType getDependencyArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.xbeans.PatternType target = null;
            target = (org.apache.geronimo.deployment.xbeans.PatternType)get_store().find_element_user(DEPENDENCY$10, i);
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
            return get_store().count_elements(DEPENDENCY$10);
        }
    }
    
    /**
     * Sets array of all "dependency" element
     */
    public void setDependencyArray(org.apache.geronimo.deployment.xbeans.PatternType[] dependencyArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dependencyArray, DEPENDENCY$10);
        }
    }
    
    /**
     * Sets ith "dependency" element
     */
    public void setDependencyArray(int i, org.apache.geronimo.deployment.xbeans.PatternType dependency)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.xbeans.PatternType target = null;
            target = (org.apache.geronimo.deployment.xbeans.PatternType)get_store().find_element_user(DEPENDENCY$10, i);
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
    public org.apache.geronimo.deployment.xbeans.PatternType insertNewDependency(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.xbeans.PatternType target = null;
            target = (org.apache.geronimo.deployment.xbeans.PatternType)get_store().insert_element_user(DEPENDENCY$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "dependency" element
     */
    public org.apache.geronimo.deployment.xbeans.PatternType addNewDependency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.deployment.xbeans.PatternType target = null;
            target = (org.apache.geronimo.deployment.xbeans.PatternType)get_store().add_element_user(DEPENDENCY$10);
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
            get_store().remove_element(DEPENDENCY$10, i);
        }
    }
    
    /**
     * Gets the "name" attribute
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$12);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "name" attribute
     */
    public org.apache.xmlbeans.XmlString xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$12);
            return target;
        }
    }
    
    /**
     * Sets the "name" attribute
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$12);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "name" attribute
     */
    public void xsetName(org.apache.xmlbeans.XmlString name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$12);
            }
            target.set(name);
        }
    }
    
    /**
     * Gets the "class" attribute
     */
    public java.lang.String getClass1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASS1$14);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "class" attribute
     */
    public org.apache.xmlbeans.XmlString xgetClass1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CLASS1$14);
            return target;
        }
    }
    
    /**
     * Sets the "class" attribute
     */
    public void setClass1(java.lang.String class1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASS1$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CLASS1$14);
            }
            target.setStringValue(class1);
        }
    }
    
    /**
     * Sets (as xml) the "class" attribute
     */
    public void xsetClass1(org.apache.xmlbeans.XmlString class1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CLASS1$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CLASS1$14);
            }
            target.set(class1);
        }
    }
}
