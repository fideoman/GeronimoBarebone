/*
 * XML Type:  associationOption
 * Namespace: http://openejb.apache.org/xml/ns/corba-tss-config-2.1
 * Java type: org.apache.geronimo.corba.xbeans.csiv2.tss.TSSAssociationOption
 *
 * Automatically generated - do not modify.
 */
package org.apache.geronimo.corba.xbeans.csiv2.tss;


/**
 * An XML associationOption(@http://openejb.apache.org/xml/ns/corba-tss-config-2.1).
 *
 * This is an atomic type that is a restriction of org.apache.geronimo.corba.xbeans.csiv2.tss.TSSAssociationOption.
 */
public interface TSSAssociationOption extends org.apache.xmlbeans.XmlToken
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TSSAssociationOption.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s09ACC41411FB14C20ABEF817C47DD1DF").resolveHandle("associationoption3f6ctype");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum NO_PROTECTION = Enum.forString("NoProtection");
    static final Enum INTEGRITY = Enum.forString("Integrity");
    static final Enum CONFIDENTIALITY = Enum.forString("Confidentiality");
    static final Enum DETECT_REPLAY = Enum.forString("DetectReplay");
    static final Enum DETECT_MISORDERING = Enum.forString("DetectMisordering");
    static final Enum ESTABLISH_TRUST_IN_TARGET = Enum.forString("EstablishTrustInTarget");
    static final Enum ESTABLISH_TRUST_IN_CLIENT = Enum.forString("EstablishTrustInClient");
    static final Enum NO_DELEGATION = Enum.forString("NoDelegation");
    static final Enum SIMPLE_DELEGATION = Enum.forString("SimpleDelegation");
    static final Enum COMPOSITE_DELEGATION = Enum.forString("CompositeDelegation");
    static final Enum IDENTITY_ASSERTION = Enum.forString("IdentityAssertion");
    static final Enum DELEGATION_BY_CLIENT = Enum.forString("DelegationByClient");
    
    static final int INT_NO_PROTECTION = Enum.INT_NO_PROTECTION;
    static final int INT_INTEGRITY = Enum.INT_INTEGRITY;
    static final int INT_CONFIDENTIALITY = Enum.INT_CONFIDENTIALITY;
    static final int INT_DETECT_REPLAY = Enum.INT_DETECT_REPLAY;
    static final int INT_DETECT_MISORDERING = Enum.INT_DETECT_MISORDERING;
    static final int INT_ESTABLISH_TRUST_IN_TARGET = Enum.INT_ESTABLISH_TRUST_IN_TARGET;
    static final int INT_ESTABLISH_TRUST_IN_CLIENT = Enum.INT_ESTABLISH_TRUST_IN_CLIENT;
    static final int INT_NO_DELEGATION = Enum.INT_NO_DELEGATION;
    static final int INT_SIMPLE_DELEGATION = Enum.INT_SIMPLE_DELEGATION;
    static final int INT_COMPOSITE_DELEGATION = Enum.INT_COMPOSITE_DELEGATION;
    static final int INT_IDENTITY_ASSERTION = Enum.INT_IDENTITY_ASSERTION;
    static final int INT_DELEGATION_BY_CLIENT = Enum.INT_DELEGATION_BY_CLIENT;
    
    /**
     * Enumeration value class for org.apache.geronimo.corba.xbeans.csiv2.tss.TSSAssociationOption.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_NO_PROTECTION
     * Enum.forString(s); // returns the enum value for a string
     * Enum.forInt(i); // returns the enum value for an int
     * </pre>
     * Enumeration objects are immutable singleton objects that
     * can be compared using == object equality. They have no
     * public constructor. See the constants defined within this
     * class for all the valid values.
     */
    static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase
    {
        /**
         * Returns the enum value for a string, or null if none.
         */
        public static Enum forString(java.lang.String s)
            { return (Enum)table.forString(s); }
        /**
         * Returns the enum value corresponding to an int, or null if none.
         */
        public static Enum forInt(int i)
            { return (Enum)table.forInt(i); }
        
        private Enum(java.lang.String s, int i)
            { super(s, i); }
        
        static final int INT_NO_PROTECTION = 1;
        static final int INT_INTEGRITY = 2;
        static final int INT_CONFIDENTIALITY = 3;
        static final int INT_DETECT_REPLAY = 4;
        static final int INT_DETECT_MISORDERING = 5;
        static final int INT_ESTABLISH_TRUST_IN_TARGET = 6;
        static final int INT_ESTABLISH_TRUST_IN_CLIENT = 7;
        static final int INT_NO_DELEGATION = 8;
        static final int INT_SIMPLE_DELEGATION = 9;
        static final int INT_COMPOSITE_DELEGATION = 10;
        static final int INT_IDENTITY_ASSERTION = 11;
        static final int INT_DELEGATION_BY_CLIENT = 12;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("NoProtection", INT_NO_PROTECTION),
                new Enum("Integrity", INT_INTEGRITY),
                new Enum("Confidentiality", INT_CONFIDENTIALITY),
                new Enum("DetectReplay", INT_DETECT_REPLAY),
                new Enum("DetectMisordering", INT_DETECT_MISORDERING),
                new Enum("EstablishTrustInTarget", INT_ESTABLISH_TRUST_IN_TARGET),
                new Enum("EstablishTrustInClient", INT_ESTABLISH_TRUST_IN_CLIENT),
                new Enum("NoDelegation", INT_NO_DELEGATION),
                new Enum("SimpleDelegation", INT_SIMPLE_DELEGATION),
                new Enum("CompositeDelegation", INT_COMPOSITE_DELEGATION),
                new Enum("IdentityAssertion", INT_IDENTITY_ASSERTION),
                new Enum("DelegationByClient", INT_DELEGATION_BY_CLIENT),
            }
        );
        private static final long serialVersionUID = 1L;
        private java.lang.Object readResolve() { return forInt(intValue()); } 
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSAssociationOption newValue(java.lang.Object obj) {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSAssociationOption) type.newValue( obj ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSAssociationOption newInstance() {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSAssociationOption) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSAssociationOption newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSAssociationOption) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSAssociationOption parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSAssociationOption) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSAssociationOption parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSAssociationOption) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSAssociationOption parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSAssociationOption) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSAssociationOption parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSAssociationOption) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSAssociationOption parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSAssociationOption) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSAssociationOption parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSAssociationOption) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSAssociationOption parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSAssociationOption) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSAssociationOption parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSAssociationOption) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSAssociationOption parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSAssociationOption) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSAssociationOption parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSAssociationOption) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSAssociationOption parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSAssociationOption) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSAssociationOption parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSAssociationOption) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSAssociationOption parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSAssociationOption) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSAssociationOption parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSAssociationOption) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSAssociationOption parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSAssociationOption) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.geronimo.corba.xbeans.csiv2.tss.TSSAssociationOption parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.geronimo.corba.xbeans.csiv2.tss.TSSAssociationOption) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
