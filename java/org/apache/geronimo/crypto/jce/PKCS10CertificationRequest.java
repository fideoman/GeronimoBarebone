/**
 *  Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  See the NOTICE file distributed with
 *  this work for additional information regarding copyright ownership.
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 *  (the "License"); you may not use this file except in compliance with
 *  the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.apache.geronimo.crypto.jce;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.Hashtable;

import javax.security.auth.x500.X500Principal;

import org.apache.geronimo.crypto.asn1.ASN1InputStream;
import org.apache.geronimo.crypto.asn1.ASN1Sequence;
import org.apache.geronimo.crypto.asn1.ASN1Set;
import org.apache.geronimo.crypto.asn1.DERBitString;
import org.apache.geronimo.crypto.asn1.DERObjectIdentifier;
import org.apache.geronimo.crypto.asn1.DEROutputStream;
import org.apache.geronimo.crypto.asn1.pkcs.PKCSObjectIdentifiers;
import org.apache.geronimo.crypto.asn1.pkcs.CertificationRequest;
import org.apache.geronimo.crypto.asn1.pkcs.CertificationRequestInfo;
import org.apache.geronimo.crypto.asn1.x509.AlgorithmIdentifier;
import org.apache.geronimo.crypto.asn1.x509.SubjectPublicKeyInfo;
import org.apache.geronimo.crypto.asn1.x509.X509Name;
import org.apache.geronimo.crypto.asn1.x9.X9ObjectIdentifiers;

/**
 * A class for verifying and creating PKCS10 Certification requests.
 * <pre>
 * CertificationRequest ::= SEQUENCE {
 *   certificationRequestInfo  CertificationRequestInfo,
 *   signatureAlgorithm        AlgorithmIdentifier{{ SignatureAlgorithms }},
 *   signature                 BIT STRING
 * }
 *
 * CertificationRequestInfo ::= SEQUENCE {
 *   version             INTEGER { v1(0) } (v1,...),
 *   subject             Name,
 *   subjectPKInfo   SubjectPublicKeyInfo{{ PKInfoAlgorithms }},
 *   attributes          [0] Attributes{{ CRIAttributes }}
 *  }
 *
 *  Attributes { ATTRIBUTE:IOSet } ::= SET OF Attribute{{ IOSet }}
 *
 *  Attribute { ATTRIBUTE:IOSet } ::= SEQUENCE {
 *    type    ATTRIBUTE.&id({IOSet}),
 *    values  SET SIZE(1..MAX) OF ATTRIBUTE.&Type({IOSet}{\@type})
 *  }
 * </pre>
 */
public class PKCS10CertificationRequest
    extends CertificationRequest
{
    private static Hashtable            algorithms = new Hashtable();
    private static Hashtable            oids = new Hashtable();

    static
    {
        algorithms.put("MD2WITHRSAENCRYPTION", new DERObjectIdentifier("1.2.840.113549.1.1.2"));
        algorithms.put("MD2WITHRSA", new DERObjectIdentifier("1.2.840.113549.1.1.2"));
        algorithms.put("MD5WITHRSA", new DERObjectIdentifier("1.2.840.113549.1.1.1"));
        algorithms.put("MD5WITHRSAENCRYPTION", new DERObjectIdentifier("1.2.840.113549.1.1.4"));
        algorithms.put("MD5WITHRSA", new DERObjectIdentifier("1.2.840.113549.1.1.4"));
        algorithms.put("RSAWITHMD5", new DERObjectIdentifier("1.2.840.113549.1.1.4"));
        algorithms.put("SHA1WITHRSAENCRYPTION", new DERObjectIdentifier("1.2.840.113549.1.1.5"));
        algorithms.put("SHA1WITHRSA", new DERObjectIdentifier("1.2.840.113549.1.1.5"));
        algorithms.put("SHA224WITHRSAENCRYPTION", PKCSObjectIdentifiers.sha224WithRSAEncryption);
        algorithms.put("SHA224WITHRSA", PKCSObjectIdentifiers.sha224WithRSAEncryption);
        algorithms.put("SHA256WITHRSAENCRYPTION", PKCSObjectIdentifiers.sha256WithRSAEncryption);
        algorithms.put("SHA256WITHRSA", PKCSObjectIdentifiers.sha256WithRSAEncryption);
        algorithms.put("SHA384WITHRSAENCRYPTION", PKCSObjectIdentifiers.sha384WithRSAEncryption);
        algorithms.put("SHA384WITHRSA", PKCSObjectIdentifiers.sha384WithRSAEncryption);
        algorithms.put("SHA512WITHRSAENCRYPTION", PKCSObjectIdentifiers.sha512WithRSAEncryption);
        algorithms.put("SHA512WITHRSA", PKCSObjectIdentifiers.sha512WithRSAEncryption);
        algorithms.put("RSAWITHSHA1", new DERObjectIdentifier("1.2.840.113549.1.1.5"));
        algorithms.put("RIPEMD160WITHRSAENCRYPTION", new DERObjectIdentifier("1.3.36.3.3.1.2"));
        algorithms.put("RIPEMD160WITHRSA", new DERObjectIdentifier("1.3.36.3.3.1.2"));
        algorithms.put("SHA1WITHDSA", new DERObjectIdentifier("1.2.840.10040.4.3"));
        algorithms.put("DSAWITHSHA1", new DERObjectIdentifier("1.2.840.10040.4.3"));
        algorithms.put("SHA1WITHECDSA", X9ObjectIdentifiers.ecdsa_with_SHA1);
        algorithms.put("ECDSAWITHSHA1", X9ObjectIdentifiers.ecdsa_with_SHA1);

        //
        // reverse mappings
        //
        oids.put(new DERObjectIdentifier("1.2.840.113549.1.1.5"), "SHA1WITHRSA");
        oids.put(PKCSObjectIdentifiers.sha224WithRSAEncryption, "SHA224WITHRSA");
        oids.put(PKCSObjectIdentifiers.sha256WithRSAEncryption, "SHA256WITHRSA");
        oids.put(PKCSObjectIdentifiers.sha384WithRSAEncryption, "SHA384WITHRSA");
        oids.put(PKCSObjectIdentifiers.sha512WithRSAEncryption, "SHA512WITHRSA");

        oids.put(new DERObjectIdentifier("1.2.840.113549.1.1.4"), "MD5WITHRSA");
        oids.put(new DERObjectIdentifier("1.2.840.113549.1.1.2"), "MD2WITHRSA");
        oids.put(new DERObjectIdentifier("1.2.840.113549.1.1.1"), "MD5WIDHRSA");
        oids.put(new DERObjectIdentifier("1.2.840.10040.4.3"), "DSAWITHSHA1");
        oids.put(X9ObjectIdentifiers.ecdsa_with_SHA1, "DSAWITHSHA1");
    }

    private static ASN1Sequence toDERSequence(
        byte[]  bytes)
    {
        try
        {
            ByteArrayInputStream    bIn = new ByteArrayInputStream(bytes);
            ASN1InputStream         dIn = new ASN1InputStream(bIn);

            return (ASN1Sequence)dIn.readObject();
        }
        catch (Exception e)
        {
            throw new IllegalArgumentException("badly encoded request", e);
        }
    }

    /**
     * construct a PKCS10 certification request from a DER encoded
     * byte stream.
     */
    public PKCS10CertificationRequest(
        byte[]  bytes)
    {
        super(toDERSequence(bytes));
    }

    public PKCS10CertificationRequest(
        ASN1Sequence  sequence)
    {
        super(sequence);
    }

    /**
     * create a PKCS10 certfication request using the BC provider.
     */
    public PKCS10CertificationRequest(
        String              signatureAlgorithm,
        X509Name            subject,
        PublicKey           key,
        ASN1Set             attributes,
        PrivateKey          signingKey)
        throws NoSuchAlgorithmException, NoSuchProviderException,
                InvalidKeyException, SignatureException
    {
        this(signatureAlgorithm, subject, key, attributes, signingKey, null);
    }

    private static X509Name convertName(
        X500Principal	name)
    {
        try
        {
            return new X509Principal(name.getEncoded());
        }
        catch (IOException e)
        {
            throw new IllegalArgumentException("can't convert name", e);
        }
    }

    /**
     * create a PKCS10 certfication request using the BC provider.
     */
    public PKCS10CertificationRequest(
        String              signatureAlgorithm,
        X500Principal       subject,
        PublicKey           key,
        ASN1Set             attributes,
        PrivateKey          signingKey)
        throws NoSuchAlgorithmException, NoSuchProviderException,
                InvalidKeyException, SignatureException
    {
        this(signatureAlgorithm, convertName(subject), key, attributes, signingKey, null);
    }

    /**
     * create a PKCS10 certfication request using the named provider.
     */
    public PKCS10CertificationRequest(
        String              signatureAlgorithm,
        X500Principal       subject,
        PublicKey           key,
        ASN1Set             attributes,
        PrivateKey          signingKey,
        String              provider)
        throws NoSuchAlgorithmException, NoSuchProviderException,
                InvalidKeyException, SignatureException
    {
        this(signatureAlgorithm, convertName(subject), key, attributes, signingKey, provider);
    }

    /**
     * create a PKCS10 certfication request using the named provider.
     */
    public PKCS10CertificationRequest(
        String              signatureAlgorithm,
        X509Name            subject,
        PublicKey           key,
        ASN1Set             attributes,
        PrivateKey          signingKey,
        String              provider)
        throws NoSuchAlgorithmException, NoSuchProviderException,
                InvalidKeyException, SignatureException
    {
        DERObjectIdentifier sigOID = (DERObjectIdentifier)algorithms.get(signatureAlgorithm.toUpperCase());

        if (sigOID == null)
        {
            throw new IllegalArgumentException("Unknown signature type requested");
        }

        if (subject == null)
        {
            throw new IllegalArgumentException("subject must not be null");
        }

        if (key == null)
        {
            throw new IllegalArgumentException("public key must not be null");
        }

        this.sigAlgId = new AlgorithmIdentifier(sigOID, null);

        byte[]                  bytes = key.getEncoded();
        ByteArrayInputStream    bIn = new ByteArrayInputStream(bytes);
        ASN1InputStream         dIn = new ASN1InputStream(bIn);

        try
        {
            this.reqInfo = new CertificationRequestInfo(subject, new SubjectPublicKeyInfo((ASN1Sequence)dIn.readObject()), attributes);
        }
        catch (IOException e)
        {
            throw new IllegalArgumentException("can't encode public key", e);
        }

        Signature sig = null;

        try
        {
            if (provider == null) {
                sig = Signature.getInstance(sigAlgId.getObjectId().getId());
            }
            else {
                sig = Signature.getInstance(sigAlgId.getObjectId().getId(), provider);
            }
        }
        catch (NoSuchAlgorithmException e)
        {
            if (provider == null) {
                sig = Signature.getInstance(signatureAlgorithm);
            }
            else {
                sig = Signature.getInstance(signatureAlgorithm, provider);
            }
        }

        sig.initSign(signingKey);

        try
        {
            ByteArrayOutputStream   bOut = new ByteArrayOutputStream();
            DEROutputStream         dOut = new DEROutputStream(bOut);

            dOut.writeObject(reqInfo);

            sig.update(bOut.toByteArray());
        }
        catch (Exception e)
        {
            throw new SecurityException("exception encoding TBS cert request - " + e.getMessage(), e);
        }

        this.sigBits = new DERBitString(sig.sign());
    }

    /**
     * return the public key associated with the certification request -
     * the public key is created using the BC provider.
     */
    public PublicKey getPublicKey()
        throws NoSuchAlgorithmException, NoSuchProviderException, InvalidKeyException
    {
        return getPublicKey(null);
    }

    public PublicKey getPublicKey(
        String  provider)
        throws NoSuchAlgorithmException, NoSuchProviderException,
                InvalidKeyException
    {
        SubjectPublicKeyInfo    subjectPKInfo = reqInfo.getSubjectPublicKeyInfo();

        try
        {
            X509EncodedKeySpec      xspec = new X509EncodedKeySpec(new DERBitString(subjectPKInfo).getBytes());
            AlgorithmIdentifier     keyAlg = subjectPKInfo.getAlgorithmId ();
            try {

                if (provider == null) {
                    return KeyFactory.getInstance(keyAlg.getObjectId().getId ()).generatePublic(xspec);
                }
                else {
                    return KeyFactory.getInstance(keyAlg.getObjectId().getId (), provider).generatePublic(xspec);
                }

            } catch (NoSuchAlgorithmException e) {
                // if we can't resolve this via the OID, just as for the RSA algorithm.  This is all
                // Geronimo requires anyway.
                if (provider == null) {
                    return KeyFactory.getInstance("RSA").generatePublic(xspec);
                }
                else {
                    return KeyFactory.getInstance("RSA", provider).generatePublic(xspec);
                }
            }
        }
        catch (InvalidKeySpecException e)
        {
            throw (InvalidKeyException)new InvalidKeyException("error decoding public key").initCause(e);
        }
    }

    /**
     * verify the request using the BC provider.
     */
    public boolean verify()
        throws NoSuchAlgorithmException, NoSuchProviderException,
                InvalidKeyException, SignatureException
    {
        return verify(null);
    }

    public boolean verify(
        String provider)
        throws NoSuchAlgorithmException, NoSuchProviderException,
                InvalidKeyException, SignatureException
    {
        Signature   sig = null;

        try
        {
            if (provider == null) {
                sig = Signature.getInstance(sigAlgId.getObjectId().getId());
            }
            else {
                sig = Signature.getInstance(sigAlgId.getObjectId().getId(), provider);
            }
        }
        catch (NoSuchAlgorithmException e)
        {
            //
            // try an alternate
            //
            if (oids.get(sigAlgId.getObjectId().getId()) != null)
            {
                String  signatureAlgorithm = (String)oids.get(sigAlgId.getObjectId().getId());

                if (provider == null) {
                    sig = Signature.getInstance(signatureAlgorithm);
                }
                else {
                    sig = Signature.getInstance(signatureAlgorithm, provider);
                }
            }
        }

        sig.initVerify(this.getPublicKey(provider));

        try
        {
            ByteArrayOutputStream   bOut = new ByteArrayOutputStream();
            DEROutputStream         dOut = new DEROutputStream(bOut);

            dOut.writeObject(reqInfo);

            sig.update(bOut.toByteArray());
        }
        catch (Exception e)
        {
            throw (SecurityException)new SecurityException("exception encoding TBS cert request - " + e.getMessage()).initCause(e);
        }

        return sig.verify(sigBits.getBytes());
    }

    /**
     * return a DER encoded byte array representing this object
     */
    public byte[] getEncoded()
    {
        ByteArrayOutputStream   bOut = new ByteArrayOutputStream();
        DEROutputStream         dOut = new DEROutputStream(bOut);

        try
        {
            dOut.writeObject(this);
        }
        catch (IOException e)
        {
            throw new RuntimeException(e.getMessage(), e);
        }

        return bOut.toByteArray();
    }
}
