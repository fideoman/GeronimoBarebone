/*
 * XML Type:  tDefinitions
 * Namespace: http://schemas.xmlsoap.org/wsdl/
 * Java type: org.apache.geronimo.xbeans.wsdl.TDefinitions
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.xbeans.wsdl.impl;
/**
 * An XML tDefinitions(@http://schemas.xmlsoap.org/wsdl/).
 *
 * This is a complex type.
 */
public class TDefinitionsImpl extends org.apache.geronimo.xbeans.wsdl.impl.TExtensibleDocumentedImpl implements org.apache.geronimo.xbeans.wsdl.TDefinitions
{
    private static final long serialVersionUID = 1L;
    
    public TDefinitionsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IMPORT$0 = 
        new javax.xml.namespace.QName("http://schemas.xmlsoap.org/wsdl/", "import");
    private static final javax.xml.namespace.QName TYPES$2 = 
        new javax.xml.namespace.QName("http://schemas.xmlsoap.org/wsdl/", "types");
    private static final javax.xml.namespace.QName MESSAGE$4 = 
        new javax.xml.namespace.QName("http://schemas.xmlsoap.org/wsdl/", "message");
    private static final javax.xml.namespace.QName PORTTYPE$6 = 
        new javax.xml.namespace.QName("http://schemas.xmlsoap.org/wsdl/", "portType");
    private static final javax.xml.namespace.QName BINDING$8 = 
        new javax.xml.namespace.QName("http://schemas.xmlsoap.org/wsdl/", "binding");
    private static final javax.xml.namespace.QName SERVICE$10 = 
        new javax.xml.namespace.QName("http://schemas.xmlsoap.org/wsdl/", "service");
    private static final javax.xml.namespace.QName TARGETNAMESPACE$12 = 
        new javax.xml.namespace.QName("", "targetNamespace");
    private static final javax.xml.namespace.QName NAME$14 = 
        new javax.xml.namespace.QName("", "name");
    
    
    /**
     * Gets array of all "import" elements
     */
    public org.apache.geronimo.xbeans.wsdl.TImport[] getImportArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(IMPORT$0, targetList);
            org.apache.geronimo.xbeans.wsdl.TImport[] result = new org.apache.geronimo.xbeans.wsdl.TImport[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "import" element
     */
    public org.apache.geronimo.xbeans.wsdl.TImport getImportArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.wsdl.TImport target = null;
            target = (org.apache.geronimo.xbeans.wsdl.TImport)get_store().find_element_user(IMPORT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "import" element
     */
    public int sizeOfImportArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IMPORT$0);
        }
    }
    
    /**
     * Sets array of all "import" element
     */
    public void setImportArray(org.apache.geronimo.xbeans.wsdl.TImport[] ximportArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(ximportArray, IMPORT$0);
        }
    }
    
    /**
     * Sets ith "import" element
     */
    public void setImportArray(int i, org.apache.geronimo.xbeans.wsdl.TImport ximport)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.wsdl.TImport target = null;
            target = (org.apache.geronimo.xbeans.wsdl.TImport)get_store().find_element_user(IMPORT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(ximport);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "import" element
     */
    public org.apache.geronimo.xbeans.wsdl.TImport insertNewImport(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.wsdl.TImport target = null;
            target = (org.apache.geronimo.xbeans.wsdl.TImport)get_store().insert_element_user(IMPORT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "import" element
     */
    public org.apache.geronimo.xbeans.wsdl.TImport addNewImport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.wsdl.TImport target = null;
            target = (org.apache.geronimo.xbeans.wsdl.TImport)get_store().add_element_user(IMPORT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "import" element
     */
    public void removeImport(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IMPORT$0, i);
        }
    }
    
    /**
     * Gets array of all "types" elements
     */
    public org.apache.geronimo.xbeans.wsdl.TTypes[] getTypesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TYPES$2, targetList);
            org.apache.geronimo.xbeans.wsdl.TTypes[] result = new org.apache.geronimo.xbeans.wsdl.TTypes[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "types" element
     */
    public org.apache.geronimo.xbeans.wsdl.TTypes getTypesArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.wsdl.TTypes target = null;
            target = (org.apache.geronimo.xbeans.wsdl.TTypes)get_store().find_element_user(TYPES$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "types" element
     */
    public int sizeOfTypesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TYPES$2);
        }
    }
    
    /**
     * Sets array of all "types" element
     */
    public void setTypesArray(org.apache.geronimo.xbeans.wsdl.TTypes[] typesArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(typesArray, TYPES$2);
        }
    }
    
    /**
     * Sets ith "types" element
     */
    public void setTypesArray(int i, org.apache.geronimo.xbeans.wsdl.TTypes types)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.wsdl.TTypes target = null;
            target = (org.apache.geronimo.xbeans.wsdl.TTypes)get_store().find_element_user(TYPES$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(types);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "types" element
     */
    public org.apache.geronimo.xbeans.wsdl.TTypes insertNewTypes(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.wsdl.TTypes target = null;
            target = (org.apache.geronimo.xbeans.wsdl.TTypes)get_store().insert_element_user(TYPES$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "types" element
     */
    public org.apache.geronimo.xbeans.wsdl.TTypes addNewTypes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.wsdl.TTypes target = null;
            target = (org.apache.geronimo.xbeans.wsdl.TTypes)get_store().add_element_user(TYPES$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "types" element
     */
    public void removeTypes(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TYPES$2, i);
        }
    }
    
    /**
     * Gets array of all "message" elements
     */
    public org.apache.geronimo.xbeans.wsdl.TMessage[] getMessageArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MESSAGE$4, targetList);
            org.apache.geronimo.xbeans.wsdl.TMessage[] result = new org.apache.geronimo.xbeans.wsdl.TMessage[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "message" element
     */
    public org.apache.geronimo.xbeans.wsdl.TMessage getMessageArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.wsdl.TMessage target = null;
            target = (org.apache.geronimo.xbeans.wsdl.TMessage)get_store().find_element_user(MESSAGE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "message" element
     */
    public int sizeOfMessageArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MESSAGE$4);
        }
    }
    
    /**
     * Sets array of all "message" element
     */
    public void setMessageArray(org.apache.geronimo.xbeans.wsdl.TMessage[] messageArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(messageArray, MESSAGE$4);
        }
    }
    
    /**
     * Sets ith "message" element
     */
    public void setMessageArray(int i, org.apache.geronimo.xbeans.wsdl.TMessage message)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.wsdl.TMessage target = null;
            target = (org.apache.geronimo.xbeans.wsdl.TMessage)get_store().find_element_user(MESSAGE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(message);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "message" element
     */
    public org.apache.geronimo.xbeans.wsdl.TMessage insertNewMessage(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.wsdl.TMessage target = null;
            target = (org.apache.geronimo.xbeans.wsdl.TMessage)get_store().insert_element_user(MESSAGE$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "message" element
     */
    public org.apache.geronimo.xbeans.wsdl.TMessage addNewMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.wsdl.TMessage target = null;
            target = (org.apache.geronimo.xbeans.wsdl.TMessage)get_store().add_element_user(MESSAGE$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "message" element
     */
    public void removeMessage(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MESSAGE$4, i);
        }
    }
    
    /**
     * Gets array of all "portType" elements
     */
    public org.apache.geronimo.xbeans.wsdl.TPortType[] getPortTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PORTTYPE$6, targetList);
            org.apache.geronimo.xbeans.wsdl.TPortType[] result = new org.apache.geronimo.xbeans.wsdl.TPortType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "portType" element
     */
    public org.apache.geronimo.xbeans.wsdl.TPortType getPortTypeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.wsdl.TPortType target = null;
            target = (org.apache.geronimo.xbeans.wsdl.TPortType)get_store().find_element_user(PORTTYPE$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "portType" element
     */
    public int sizeOfPortTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PORTTYPE$6);
        }
    }
    
    /**
     * Sets array of all "portType" element
     */
    public void setPortTypeArray(org.apache.geronimo.xbeans.wsdl.TPortType[] portTypeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(portTypeArray, PORTTYPE$6);
        }
    }
    
    /**
     * Sets ith "portType" element
     */
    public void setPortTypeArray(int i, org.apache.geronimo.xbeans.wsdl.TPortType portType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.wsdl.TPortType target = null;
            target = (org.apache.geronimo.xbeans.wsdl.TPortType)get_store().find_element_user(PORTTYPE$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(portType);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "portType" element
     */
    public org.apache.geronimo.xbeans.wsdl.TPortType insertNewPortType(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.wsdl.TPortType target = null;
            target = (org.apache.geronimo.xbeans.wsdl.TPortType)get_store().insert_element_user(PORTTYPE$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "portType" element
     */
    public org.apache.geronimo.xbeans.wsdl.TPortType addNewPortType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.wsdl.TPortType target = null;
            target = (org.apache.geronimo.xbeans.wsdl.TPortType)get_store().add_element_user(PORTTYPE$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "portType" element
     */
    public void removePortType(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PORTTYPE$6, i);
        }
    }
    
    /**
     * Gets array of all "binding" elements
     */
    public org.apache.geronimo.xbeans.wsdl.TBinding[] getBindingArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(BINDING$8, targetList);
            org.apache.geronimo.xbeans.wsdl.TBinding[] result = new org.apache.geronimo.xbeans.wsdl.TBinding[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "binding" element
     */
    public org.apache.geronimo.xbeans.wsdl.TBinding getBindingArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.wsdl.TBinding target = null;
            target = (org.apache.geronimo.xbeans.wsdl.TBinding)get_store().find_element_user(BINDING$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "binding" element
     */
    public int sizeOfBindingArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BINDING$8);
        }
    }
    
    /**
     * Sets array of all "binding" element
     */
    public void setBindingArray(org.apache.geronimo.xbeans.wsdl.TBinding[] bindingArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(bindingArray, BINDING$8);
        }
    }
    
    /**
     * Sets ith "binding" element
     */
    public void setBindingArray(int i, org.apache.geronimo.xbeans.wsdl.TBinding binding)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.wsdl.TBinding target = null;
            target = (org.apache.geronimo.xbeans.wsdl.TBinding)get_store().find_element_user(BINDING$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(binding);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "binding" element
     */
    public org.apache.geronimo.xbeans.wsdl.TBinding insertNewBinding(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.wsdl.TBinding target = null;
            target = (org.apache.geronimo.xbeans.wsdl.TBinding)get_store().insert_element_user(BINDING$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "binding" element
     */
    public org.apache.geronimo.xbeans.wsdl.TBinding addNewBinding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.wsdl.TBinding target = null;
            target = (org.apache.geronimo.xbeans.wsdl.TBinding)get_store().add_element_user(BINDING$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "binding" element
     */
    public void removeBinding(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BINDING$8, i);
        }
    }
    
    /**
     * Gets array of all "service" elements
     */
    public org.apache.geronimo.xbeans.wsdl.TService[] getServiceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SERVICE$10, targetList);
            org.apache.geronimo.xbeans.wsdl.TService[] result = new org.apache.geronimo.xbeans.wsdl.TService[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "service" element
     */
    public org.apache.geronimo.xbeans.wsdl.TService getServiceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.wsdl.TService target = null;
            target = (org.apache.geronimo.xbeans.wsdl.TService)get_store().find_element_user(SERVICE$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "service" element
     */
    public int sizeOfServiceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SERVICE$10);
        }
    }
    
    /**
     * Sets array of all "service" element
     */
    public void setServiceArray(org.apache.geronimo.xbeans.wsdl.TService[] serviceArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(serviceArray, SERVICE$10);
        }
    }
    
    /**
     * Sets ith "service" element
     */
    public void setServiceArray(int i, org.apache.geronimo.xbeans.wsdl.TService service)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.wsdl.TService target = null;
            target = (org.apache.geronimo.xbeans.wsdl.TService)get_store().find_element_user(SERVICE$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(service);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "service" element
     */
    public org.apache.geronimo.xbeans.wsdl.TService insertNewService(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.wsdl.TService target = null;
            target = (org.apache.geronimo.xbeans.wsdl.TService)get_store().insert_element_user(SERVICE$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "service" element
     */
    public org.apache.geronimo.xbeans.wsdl.TService addNewService()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.geronimo.xbeans.wsdl.TService target = null;
            target = (org.apache.geronimo.xbeans.wsdl.TService)get_store().add_element_user(SERVICE$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "service" element
     */
    public void removeService(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SERVICE$10, i);
        }
    }
    
    /**
     * Gets the "targetNamespace" attribute
     */
    public java.lang.String getTargetNamespace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TARGETNAMESPACE$12);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "targetNamespace" attribute
     */
    public org.apache.xmlbeans.XmlAnyURI xgetTargetNamespace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(TARGETNAMESPACE$12);
            return target;
        }
    }
    
    /**
     * True if has "targetNamespace" attribute
     */
    public boolean isSetTargetNamespace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TARGETNAMESPACE$12) != null;
        }
    }
    
    /**
     * Sets the "targetNamespace" attribute
     */
    public void setTargetNamespace(java.lang.String targetNamespace)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TARGETNAMESPACE$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TARGETNAMESPACE$12);
            }
            target.setStringValue(targetNamespace);
        }
    }
    
    /**
     * Sets (as xml) the "targetNamespace" attribute
     */
    public void xsetTargetNamespace(org.apache.xmlbeans.XmlAnyURI targetNamespace)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(TARGETNAMESPACE$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(TARGETNAMESPACE$12);
            }
            target.set(targetNamespace);
        }
    }
    
    /**
     * Unsets the "targetNamespace" attribute
     */
    public void unsetTargetNamespace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TARGETNAMESPACE$12);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$14);
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
    public org.apache.xmlbeans.XmlNCName xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNCName target = null;
            target = (org.apache.xmlbeans.XmlNCName)get_store().find_attribute_user(NAME$14);
            return target;
        }
    }
    
    /**
     * True if has "name" attribute
     */
    public boolean isSetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(NAME$14) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$14);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "name" attribute
     */
    public void xsetName(org.apache.xmlbeans.XmlNCName name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNCName target = null;
            target = (org.apache.xmlbeans.XmlNCName)get_store().find_attribute_user(NAME$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNCName)get_store().add_attribute_user(NAME$14);
            }
            target.set(name);
        }
    }
    
    /**
     * Unsets the "name" attribute
     */
    public void unsetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(NAME$14);
        }
    }
}
