/*
 * XML Type:  environmentType
 * Namespace: http://geronimo.apache.org/xml/ns/deployment-1.2
 * Java type: org.apache.geronimo.deployment.xbeans.EnvironmentType
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.deployment.xbeans;


/**
 * An XML environmentType(@http://geronimo.apache.org/xml/ns/deployment-1.2).
 *
 * This is a complex type.
 */
public interface EnvironmentType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EnvironmentType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1D00E640B90252F7DCFA98454B9E9CE2").resolveHandle("environmenttype7bb4type");
    
    /**
     * Gets the "moduleId" element
     */
    org.apache.geronimo.deployment.xbeans.ArtifactType getModuleId();
    
    /**
     * True if has "moduleId" element
     */
    boolean isSetModuleId();
    
    /**
     * Sets the "moduleId" element
     */
    void setModuleId(org.apache.geronimo.deployment.xbeans.ArtifactType moduleId);
    
    /**
     * Appends and returns a new empty "moduleId" element
     */
    org.apache.geronimo.deployment.xbeans.ArtifactType addNewModuleId();
    
    /**
     * Unsets the "moduleId" element
     */
    void unsetModuleId();
    
    /**
     * Gets the "dependencies" element
     */
    org.apache.geronimo.deployment.xbeans.DependenciesType getDependencies();
    
    /**
     * True if has "dependencies" element
     */
    boolean isSetDependencies();
    
    /**
     * Sets the "dependencies" element
     */
    void setDependencies(org.apache.geronimo.deployment.xbeans.DependenciesType dependencies);
    
    /**
     * Appends and returns a new empty "dependencies" element
     */
    org.apache.geronimo.deployment.xbeans.DependenciesType addNewDependencies();
    
    /**
     * Unsets the "dependencies" element
     */
    void unsetDependencies();
    
    /**
     * Gets the "bundle-activator" element
     */
    java.lang.String getBundleActivator();
    
    /**
     * Gets (as xml) the "bundle-activator" element
     */
    org.apache.xmlbeans.XmlString xgetBundleActivator();
    
    /**
     * True if has "bundle-activator" element
     */
    boolean isSetBundleActivator();
    
    /**
     * Sets the "bundle-activator" element
     */
    void setBundleActivator(java.lang.String bundleActivator);
    
    /**
     * Sets (as xml) the "bundle-activator" element
     */
    void xsetBundleActivator(org.apache.xmlbeans.XmlString bundleActivator);
    
    /**
     * Unsets the "bundle-activator" element
     */
    void unsetBundleActivator();
    
    /**
     * Gets array of all "bundle-classPath" elements
     */
    java.lang.String[] getBundleClassPathArray();
    
    /**
     * Gets ith "bundle-classPath" element
     */
    java.lang.String getBundleClassPathArray(int i);
    
    /**
     * Gets (as xml) array of all "bundle-classPath" elements
     */
    org.apache.xmlbeans.XmlString[] xgetBundleClassPathArray();
    
    /**
     * Gets (as xml) ith "bundle-classPath" element
     */
    org.apache.xmlbeans.XmlString xgetBundleClassPathArray(int i);
    
    /**
     * Returns number of "bundle-classPath" element
     */
    int sizeOfBundleClassPathArray();
    
    /**
     * Sets array of all "bundle-classPath" element
     */
    void setBundleClassPathArray(java.lang.String[] bundleClassPathArray);
    
    /**
     * Sets ith "bundle-classPath" element
     */
    void setBundleClassPathArray(int i, java.lang.String bundleClassPath);
    
    /**
     * Sets (as xml) array of all "bundle-classPath" element
     */
    void xsetBundleClassPathArray(org.apache.xmlbeans.XmlString[] bundleClassPathArray);
    
    /**
     * Sets (as xml) ith "bundle-classPath" element
     */
    void xsetBundleClassPathArray(int i, org.apache.xmlbeans.XmlString bundleClassPath);
    
    /**
     * Inserts the value as the ith "bundle-classPath" element
     */
    void insertBundleClassPath(int i, java.lang.String bundleClassPath);
    
    /**
     * Appends the value as the last "bundle-classPath" element
     */
    void addBundleClassPath(java.lang.String bundleClassPath);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "bundle-classPath" element
     */
    org.apache.xmlbeans.XmlString insertNewBundleClassPath(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "bundle-classPath" element
     */
    org.apache.xmlbeans.XmlString addNewBundleClassPath();
    
    /**
     * Removes the ith "bundle-classPath" element
     */
    void removeBundleClassPath(int i);
    
    /**
     * Gets array of all "import-package" elements
     */
    java.lang.String[] getImportPackageArray();
    
    /**
     * Gets ith "import-package" element
     */
    java.lang.String getImportPackageArray(int i);
    
    /**
     * Gets (as xml) array of all "import-package" elements
     */
    org.apache.xmlbeans.XmlString[] xgetImportPackageArray();
    
    /**
     * Gets (as xml) ith "import-package" element
     */
    org.apache.xmlbeans.XmlString xgetImportPackageArray(int i);
    
    /**
     * Returns number of "import-package" element
     */
    int sizeOfImportPackageArray();
    
    /**
     * Sets array of all "import-package" element
     */
    void setImportPackageArray(java.lang.String[] importPackageArray);
    
    /**
     * Sets ith "import-package" element
     */
    void setImportPackageArray(int i, java.lang.String importPackage);
    
    /**
     * Sets (as xml) array of all "import-package" element
     */
    void xsetImportPackageArray(org.apache.xmlbeans.XmlString[] importPackageArray);
    
    /**
     * Sets (as xml) ith "import-package" element
     */
    void xsetImportPackageArray(int i, org.apache.xmlbeans.XmlString importPackage);
    
    /**
     * Inserts the value as the ith "import-package" element
     */
    void insertImportPackage(int i, java.lang.String importPackage);
    
    /**
     * Appends the value as the last "import-package" element
     */
    void addImportPackage(java.lang.String importPackage);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "import-package" element
     */
    org.apache.xmlbeans.XmlString insertNewImportPackage(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "import-package" element
     */
    org.apache.xmlbeans.XmlString addNewImportPackage();
    
    /**
     * Removes the ith "import-package" element
     */
    void removeImportPackage(int i);
    
    /**
     * Gets array of all "export-package" elements
     */
    java.lang.String[] getExportPackageArray();
    
    /**
     * Gets ith "export-package" element
     */
    java.lang.String getExportPackageArray(int i);
    
    /**
     * Gets (as xml) array of all "export-package" elements
     */
    org.apache.xmlbeans.XmlString[] xgetExportPackageArray();
    
    /**
     * Gets (as xml) ith "export-package" element
     */
    org.apache.xmlbeans.XmlString xgetExportPackageArray(int i);
    
    /**
     * Returns number of "export-package" element
     */
    int sizeOfExportPackageArray();
    
    /**
     * Sets array of all "export-package" element
     */
    void setExportPackageArray(java.lang.String[] exportPackageArray);
    
    /**
     * Sets ith "export-package" element
     */
    void setExportPackageArray(int i, java.lang.String exportPackage);
    
    /**
     * Sets (as xml) array of all "export-package" element
     */
    void xsetExportPackageArray(org.apache.xmlbeans.XmlString[] exportPackageArray);
    
    /**
     * Sets (as xml) ith "export-package" element
     */
    void xsetExportPackageArray(int i, org.apache.xmlbeans.XmlString exportPackage);
    
    /**
     * Inserts the value as the ith "export-package" element
     */
    void insertExportPackage(int i, java.lang.String exportPackage);
    
    /**
     * Appends the value as the last "export-package" element
     */
    void addExportPackage(java.lang.String exportPackage);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "export-package" element
     */
    org.apache.xmlbeans.XmlString insertNewExportPackage(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "export-package" element
     */
    org.apache.xmlbeans.XmlString addNewExportPackage();
    
    /**
     * Removes the ith "export-package" element
     */
    void removeExportPackage(int i);
    
    /**
     * Gets array of all "require-bundle" elements
     */
    java.lang.String[] getRequireBundleArray();
    
    /**
     * Gets ith "require-bundle" element
     */
    java.lang.String getRequireBundleArray(int i);
    
    /**
     * Gets (as xml) array of all "require-bundle" elements
     */
    org.apache.xmlbeans.XmlString[] xgetRequireBundleArray();
    
    /**
     * Gets (as xml) ith "require-bundle" element
     */
    org.apache.xmlbeans.XmlString xgetRequireBundleArray(int i);
    
    /**
     * Returns number of "require-bundle" element
     */
    int sizeOfRequireBundleArray();
    
    /**
     * Sets array of all "require-bundle" element
     */
    void setRequireBundleArray(java.lang.String[] requireBundleArray);
    
    /**
     * Sets ith "require-bundle" element
     */
    void setRequireBundleArray(int i, java.lang.String requireBundle);
    
    /**
     * Sets (as xml) array of all "require-bundle" element
     */
    void xsetRequireBundleArray(org.apache.xmlbeans.XmlString[] requireBundleArray);
    
    /**
     * Sets (as xml) ith "require-bundle" element
     */
    void xsetRequireBundleArray(int i, org.apache.xmlbeans.XmlString requireBundle);
    
    /**
     * Inserts the value as the ith "require-bundle" element
     */
    void insertRequireBundle(int i, java.lang.String requireBundle);
    
    /**
     * Appends the value as the last "require-bundle" element
     */
    void addRequireBundle(java.lang.String requireBundle);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "require-bundle" element
     */
    org.apache.xmlbeans.XmlString insertNewRequireBundle(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "require-bundle" element
     */
    org.apache.xmlbeans.XmlString addNewRequireBundle();
    
    /**
     * Removes the ith "require-bundle" element
     */
    void removeRequireBundle(int i);
    
    /**
     * Gets array of all "dynamic-import-package" elements
     */
    java.lang.String[] getDynamicImportPackageArray();
    
    /**
     * Gets ith "dynamic-import-package" element
     */
    java.lang.String getDynamicImportPackageArray(int i);
    
    /**
     * Gets (as xml) array of all "dynamic-import-package" elements
     */
    org.apache.xmlbeans.XmlString[] xgetDynamicImportPackageArray();
    
    /**
     * Gets (as xml) ith "dynamic-import-package" element
     */
    org.apache.xmlbeans.XmlString xgetDynamicImportPackageArray(int i);
    
    /**
     * Returns number of "dynamic-import-package" element
     */
    int sizeOfDynamicImportPackageArray();
    
    /**
     * Sets array of all "dynamic-import-package" element
     */
    void setDynamicImportPackageArray(java.lang.String[] dynamicImportPackageArray);
    
    /**
     * Sets ith "dynamic-import-package" element
     */
    void setDynamicImportPackageArray(int i, java.lang.String dynamicImportPackage);
    
    /**
     * Sets (as xml) array of all "dynamic-import-package" element
     */
    void xsetDynamicImportPackageArray(org.apache.xmlbeans.XmlString[] dynamicImportPackageArray);
    
    /**
     * Sets (as xml) ith "dynamic-import-package" element
     */
    void xsetDynamicImportPackageArray(int i, org.apache.xmlbeans.XmlString dynamicImportPackage);
    
    /**
     * Inserts the value as the ith "dynamic-import-package" element
     */
    void insertDynamicImportPackage(int i, java.lang.String dynamicImportPackage);
    
    /**
     * Appends the value as the last "dynamic-import-package" element
     */
    void addDynamicImportPackage(java.lang.String dynamicImportPackage);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "dynamic-import-package" element
     */
    org.apache.xmlbeans.XmlString insertNewDynamicImportPackage(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "dynamic-import-package" element
     */
    org.apache.xmlbeans.XmlString addNewDynamicImportPackage();
    
    /**
     * Removes the ith "dynamic-import-package" element
     */
    void removeDynamicImportPackage(int i);
    
    /**
     * Gets the "hidden-classes" element
     */
    org.apache.geronimo.deployment.xbeans.ClassFilterType getHiddenClasses();
    
    /**
     * True if has "hidden-classes" element
     */
    boolean isSetHiddenClasses();
    
    /**
     * Sets the "hidden-classes" element
     */
    void setHiddenClasses(org.apache.geronimo.deployment.xbeans.ClassFilterType hiddenClasses);
    
    /**
     * Appends and returns a new empty "hidden-classes" element
     */
    org.apache.geronimo.deployment.xbeans.ClassFilterType addNewHiddenClasses();
    
    /**
     * Unsets the "hidden-classes" element
     */
    void unsetHiddenClasses();
    
    /**
     * Gets the "non-overridable-classes" element
     */
    org.apache.geronimo.deployment.xbeans.ClassFilterType getNonOverridableClasses();
    
    /**
     * True if has "non-overridable-classes" element
     */
    boolean isSetNonOverridableClasses();
    
    /**
     * Sets the "non-overridable-classes" element
     */
    void setNonOverridableClasses(org.apache.geronimo.deployment.xbeans.ClassFilterType nonOverridableClasses);
    
    /**
     * Appends and returns a new empty "non-overridable-classes" element
     */
    org.apache.geronimo.deployment.xbeans.ClassFilterType addNewNonOverridableClasses();
    
    /**
     * Unsets the "non-overridable-classes" element
     */
    void unsetNonOverridableClasses();
    
    /**
     * Gets the "private-classes" element
     */
    org.apache.geronimo.deployment.xbeans.ClassFilterType getPrivateClasses();
    
    /**
     * True if has "private-classes" element
     */
    boolean isSetPrivateClasses();
    
    /**
     * Sets the "private-classes" element
     */
    void setPrivateClasses(org.apache.geronimo.deployment.xbeans.ClassFilterType privateClasses);
    
    /**
     * Appends and returns a new empty "private-classes" element
     */
    org.apache.geronimo.deployment.xbeans.ClassFilterType addNewPrivateClasses();
    
    /**
     * Unsets the "private-classes" element
     */
    void unsetPrivateClasses();
    
    /**
     * Gets the "inverse-classloading" element
     */
    org.apache.geronimo.deployment.xbeans.EmptyType getInverseClassloading();
    
    /**
     * True if has "inverse-classloading" element
     */
    boolean isSetInverseClassloading();
    
    /**
     * Sets the "inverse-classloading" element
     */
    void setInverseClassloading(org.apache.geronimo.deployment.xbeans.EmptyType inverseClassloading);
    
    /**
     * Appends and returns a new empty "inverse-classloading" element
     */
    org.apache.geronimo.deployment.xbeans.EmptyType addNewInverseClassloading();
    
    /**
     * Unsets the "inverse-classloading" element
     */
    void unsetInverseClassloading();
    
    /**
     * Gets the "suppress-default-environment" element
     */
    org.apache.geronimo.deployment.xbeans.EmptyType getSuppressDefaultEnvironment();
    
    /**
     * True if has "suppress-default-environment" element
     */
    boolean isSetSuppressDefaultEnvironment();
    
    /**
     * Sets the "suppress-default-environment" element
     */
    void setSuppressDefaultEnvironment(org.apache.geronimo.deployment.xbeans.EmptyType suppressDefaultEnvironment);
    
    /**
     * Appends and returns a new empty "suppress-default-environment" element
     */
    org.apache.geronimo.deployment.xbeans.EmptyType addNewSuppressDefaultEnvironment();
    
    /**
     * Unsets the "suppress-default-environment" element
     */
    void unsetSuppressDefaultEnvironment();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.apache.geronimo.deployment.xbeans.EnvironmentType newInstance() {
          return (org.apache.geronimo.deployment.xbeans.EnvironmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.apache.geronimo.deployment.xbeans.EnvironmentType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.apache.geronimo.deployment.xbeans.EnvironmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.apache.geronimo.deployment.xbeans.EnvironmentType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.deployment.xbeans.EnvironmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.apache.geronimo.deployment.xbeans.EnvironmentType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.deployment.xbeans.EnvironmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.apache.geronimo.deployment.xbeans.EnvironmentType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.deployment.xbeans.EnvironmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.apache.geronimo.deployment.xbeans.EnvironmentType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.deployment.xbeans.EnvironmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.apache.geronimo.deployment.xbeans.EnvironmentType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.deployment.xbeans.EnvironmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.apache.geronimo.deployment.xbeans.EnvironmentType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.deployment.xbeans.EnvironmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.apache.geronimo.deployment.xbeans.EnvironmentType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.deployment.xbeans.EnvironmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.apache.geronimo.deployment.xbeans.EnvironmentType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.deployment.xbeans.EnvironmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.apache.geronimo.deployment.xbeans.EnvironmentType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.deployment.xbeans.EnvironmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.apache.geronimo.deployment.xbeans.EnvironmentType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.deployment.xbeans.EnvironmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.apache.geronimo.deployment.xbeans.EnvironmentType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.deployment.xbeans.EnvironmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.apache.geronimo.deployment.xbeans.EnvironmentType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.deployment.xbeans.EnvironmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.apache.geronimo.deployment.xbeans.EnvironmentType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.deployment.xbeans.EnvironmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.apache.geronimo.deployment.xbeans.EnvironmentType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.deployment.xbeans.EnvironmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.geronimo.deployment.xbeans.EnvironmentType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.geronimo.deployment.xbeans.EnvironmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.geronimo.deployment.xbeans.EnvironmentType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.geronimo.deployment.xbeans.EnvironmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
