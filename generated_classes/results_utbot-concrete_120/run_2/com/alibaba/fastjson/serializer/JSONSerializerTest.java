package com.alibaba.fastjson.serializer;

import org.junit.Test;
import com.alibaba.fastjson.util.ASMClassLoader;
import java.security.ProtectionDomain;
import java.security.CodeSource;
import java.net.URL;
import sun.net.www.protocol.file.Handler;
import java.util.Hashtable;
import com.huawei.utbot.instrumentation.process.HandlerClassesLoader;
import sun.misc.URLClassPath;
import java.util.ArrayList;
import java.util.Stack;
import java.io.File;
import java.util.jar.JarFile;
import sun.nio.cs.StandardCharsets;
import sun.nio.cs.US_ASCII;
import java.util.concurrent.atomic.AtomicInteger;
import java.nio.charset.CodingErrorAction;
import java.util.WeakHashMap;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayDeque;
import java.util.zip.Inflater;
import java.util.HashMap;
import java.security.AccessControlContext;
import java.lang.ref.SoftReference;
import java.util.jar.Manifest;
import java.util.jar.Attributes;
import java.util.jar.Attributes.Name;
import sun.misc.JarIndex;
import java.util.LinkedList;
import sun.net.www.protocol.jar.URLJarFile;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Vector;
import java.security.Principal;
import java.security.cert.Certificate;
import java.security.Permissions;
import java.io.FilePermission;
import java.security.CodeSigner;
import sun.security.provider.certpath.X509CertPath;
import sun.security.x509.X509CertImpl;
import sun.security.x509.X509CertInfo;
import sun.security.x509.CertificateVersion;
import sun.security.x509.CertificateSerialNumber;
import sun.security.x509.SerialNumber;
import java.math.BigInteger;
import sun.security.x509.CertificateAlgorithmId;
import sun.security.x509.AlgorithmId;
import sun.security.util.ObjectIdentifier;
import sun.security.x509.X500Name;
import sun.security.x509.RDN;
import sun.security.x509.AVA;
import sun.security.util.DerValue;
import sun.security.util.DerInputStream;
import sun.security.x509.CertificateValidity;
import java.util.Date;
import sun.security.x509.CertificateX509Key;
import sun.security.rsa.RSAPublicKeyImpl;
import sun.security.util.BitArray;
import sun.security.x509.CertificateExtensions;
import java.util.TreeMap;
import sun.security.x509.Extension;
import sun.security.x509.AuthorityInfoAccessExtension;
import sun.security.x509.AccessDescription;
import sun.security.x509.GeneralName;
import sun.security.x509.URIName;
import java.net.URI;
import sun.security.x509.DNSName;
import sun.security.x509.AuthorityKeyIdentifierExtension;
import sun.security.x509.KeyIdentifier;
import sun.security.x509.BasicConstraintsExtension;
import sun.security.x509.CRLDistributionPointsExtension;
import sun.security.x509.DistributionPoint;
import sun.security.x509.GeneralNames;
import sun.security.x509.CertificatePoliciesExtension;
import sun.security.x509.PolicyInformation;
import sun.security.x509.CertificatePolicyId;
import java.util.LinkedHashSet;
import java.security.cert.PolicyQualifierInfo;
import sun.security.x509.ExtendedKeyUsageExtension;
import sun.security.x509.KeyUsageExtension;
import sun.security.x509.NetscapeCertTypeExtension;
import sun.security.x509.SubjectAlternativeNameExtension;
import sun.security.x509.SubjectKeyIdentifierExtension;
import java.security.Timestamp;
import java.util.List;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.plaf.basic.BasicSplitPaneDivider;
import java.io.OutputStreamWriter;
import sun.nio.cs.StreamEncoder;
import java.util.IdentityHashMap;
import java.lang.reflect.Method;
import jersey.repackaged.com.google.common.collect.Multimaps;
import com.alibaba.fastjson.util.FieldInfo;
import java.io.BufferedWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Array;
import java.util.Objects;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Iterator;
import sun.misc.Unsafe;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static java.lang.reflect.Array.get;

public class JSONSerializerTest {
    
    ///region Errors report for getMapping
    
    public void testGetMapping_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // ClassId java.util.jar.JarVerifier$3 does not have canonical name
        // 
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetMapping2() throws Throwable  {
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        SerializeConfig serializeConfig = ((SerializeConfig) createInstance("com.alibaba.fastjson.serializer.SerializeConfig"));
        setField(jSONSerializer, "config", serializeConfig);
        
        SerializeConfig actual = jSONSerializer.getMapping();
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(serializeConfig, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIsEnabled1() throws Throwable  {
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        SerializeWriter serializeWriter = ((SerializeWriter) createInstance("com.alibaba.fastjson.serializer.SerializeWriter"));
        serializeWriter.features = -1;
        setField(jSONSerializer, "out", serializeWriter);
        SerializerFeature serializerFeature = SerializerFeature.QuoteFieldNames;
        
        boolean actual = jSONSerializer.isEnabled(serializerFeature);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIsEnabled2() throws Throwable  {
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        SerializeWriter serializeWriter = ((SerializeWriter) createInstance("com.alibaba.fastjson.serializer.SerializeWriter"));
        serializeWriter.features = 0;
        setField(jSONSerializer, "out", serializeWriter);
        SerializerFeature serializerFeature = SerializerFeature.QuoteFieldNames;
        
        boolean actual = jSONSerializer.isEnabled(serializerFeature);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testConfig1() throws Throwable  {
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        SerializeWriter serializeWriter = ((SerializeWriter) createInstance("com.alibaba.fastjson.serializer.SerializeWriter"));
        serializeWriter.features = 0;
        setField(jSONSerializer, "out", serializeWriter);
        SerializerFeature serializerFeature = SerializerFeature.QuoteFieldNames;
        
        jSONSerializer.config(serializerFeature, true);
        
        int finalJSONSerializerOutFeatures = jSONSerializer.out.features;
        
        assertEquals(1, finalJSONSerializerOutFeatures);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testPopContext1() throws Throwable  {
        JSONSerializer jSONSerializer = new JSONSerializer();
        
        jSONSerializer.popContext();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testPopContext2() throws Throwable  {
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        setField(jSONSerializer, "context", null);
        
        jSONSerializer.popContext();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testPopContext3() throws Throwable  {
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        SerialContext serialContext = ((SerialContext) createInstance("com.alibaba.fastjson.serializer.SerialContext"));
        setField(serialContext, "parent", serialContext);
        jSONSerializer.context = serialContext;
        
        jSONSerializer.popContext();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCheckValue1() throws Throwable  {
        JSONSerializer jSONSerializer = new JSONSerializer();
        
        jSONSerializer.checkValue(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCheckValue2() throws Throwable  {
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        setField(jSONSerializer, "contextValueFilters", null);
        setField(jSONSerializer, "valueFilters", null);
        
        List initialJSONSerializerContextValueFilters = jSONSerializer.contextValueFilters;
        List initialJSONSerializerValueFilters = jSONSerializer.valueFilters;
        
        jSONSerializer.checkValue(null);
        
        List finalJSONSerializerContextValueFilters = jSONSerializer.contextValueFilters;
        List finalJSONSerializerValueFilters = jSONSerializer.valueFilters;
        
        assertNull(finalJSONSerializerContextValueFilters);
        
        assertNull(finalJSONSerializerValueFilters);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCheckValue3() throws Throwable  {
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        setField(jSONSerializer, "contextValueFilters", null);
        setField(jSONSerializer, "valueFilters", null);
        SerializeWriter serializeWriter = ((SerializeWriter) createInstance("com.alibaba.fastjson.serializer.SerializeWriter"));
        serializeWriter.writeNonStringValueAsString = false;
        setField(jSONSerializer, "out", serializeWriter);
        JSONSerializer jSONSerializer1 = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        setField(jSONSerializer1, "contextValueFilters", null);
        setField(jSONSerializer1, "valueFilters", null);
        setField(jSONSerializer1, "out", null);
        
        List initialJSONSerializerContextValueFilters = jSONSerializer.contextValueFilters;
        List initialJSONSerializerValueFilters = jSONSerializer.valueFilters;
        
        List initialJSONSerializer1ContextValueFilters = jSONSerializer1.contextValueFilters;
        List initialJSONSerializer1ValueFilters = jSONSerializer1.valueFilters;
        
        boolean actual = jSONSerializer.checkValue(jSONSerializer1);
        
        assertFalse(actual);
        
        List finalJSONSerializerContextValueFilters = jSONSerializer.contextValueFilters;
        List finalJSONSerializerValueFilters = jSONSerializer.valueFilters;
        
        List finalJSONSerializer1ContextValueFilters = jSONSerializer1.contextValueFilters;
        List finalJSONSerializer1ValueFilters = jSONSerializer1.valueFilters;
        
        assertNull(finalJSONSerializerContextValueFilters);
        
        assertNull(finalJSONSerializerValueFilters);
        
        assertNull(finalJSONSerializer1ContextValueFilters);
        
        assertNull(finalJSONSerializer1ValueFilters);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCheckValue4() throws Throwable  {
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        setField(jSONSerializer, "contextValueFilters", null);
        setField(jSONSerializer, "valueFilters", null);
        SerializeWriter serializeWriter = ((SerializeWriter) createInstance("com.alibaba.fastjson.serializer.SerializeWriter"));
        serializeWriter.writeNonStringValueAsString = true;
        setField(jSONSerializer, "out", serializeWriter);
        JSONSerializer jSONSerializer1 = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        setField(jSONSerializer1, "contextValueFilters", null);
        setField(jSONSerializer1, "valueFilters", null);
        setField(jSONSerializer1, "out", null);
        
        List initialJSONSerializerContextValueFilters = jSONSerializer.contextValueFilters;
        List initialJSONSerializerValueFilters = jSONSerializer.valueFilters;
        
        List initialJSONSerializer1ContextValueFilters = jSONSerializer1.contextValueFilters;
        List initialJSONSerializer1ValueFilters = jSONSerializer1.valueFilters;
        
        boolean actual = jSONSerializer.checkValue(jSONSerializer1);
        
        assertTrue(actual);
        
        List finalJSONSerializerContextValueFilters = jSONSerializer.contextValueFilters;
        List finalJSONSerializerValueFilters = jSONSerializer.valueFilters;
        
        List finalJSONSerializer1ContextValueFilters = jSONSerializer1.contextValueFilters;
        List finalJSONSerializer1ValueFilters = jSONSerializer1.valueFilters;
        
        assertNull(finalJSONSerializerContextValueFilters);
        
        assertNull(finalJSONSerializerValueFilters);
        
        assertNull(finalJSONSerializer1ContextValueFilters);
        
        assertNull(finalJSONSerializer1ValueFilters);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCheckValue5() throws Throwable  {
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        setField(jSONSerializer, "contextValueFilters", null);
        setField(jSONSerializer, "valueFilters", null);
        JSONSerializer jSONSerializer1 = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        setField(jSONSerializer1, "contextValueFilters", null);
        ArrayList arrayList = new ArrayList();
        setField(jSONSerializer1, "valueFilters", arrayList);
        
        List initialJSONSerializerContextValueFilters = jSONSerializer.contextValueFilters;
        List initialJSONSerializerValueFilters = jSONSerializer.valueFilters;
        
        List initialJSONSerializer1ContextValueFilters = jSONSerializer1.contextValueFilters;
        
        jSONSerializer.checkValue(jSONSerializer1);
        
        List finalJSONSerializerContextValueFilters = jSONSerializer.contextValueFilters;
        List finalJSONSerializerValueFilters = jSONSerializer.valueFilters;
        
        List finalJSONSerializer1ContextValueFilters = jSONSerializer1.contextValueFilters;
        
        assertNull(finalJSONSerializerContextValueFilters);
        
        assertNull(finalJSONSerializerValueFilters);
        
        assertNull(finalJSONSerializer1ContextValueFilters);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCheckValue6() throws Throwable  {
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        ArrayList arrayList = new ArrayList();
        setField(jSONSerializer, "contextValueFilters", arrayList);
        setField(jSONSerializer, "valueFilters", null);
        JSONSerializer jSONSerializer1 = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        setField(jSONSerializer1, "contextValueFilters", arrayList);
        setField(jSONSerializer1, "valueFilters", null);
        
        List initialJSONSerializerValueFilters = jSONSerializer.valueFilters;
        
        List initialJSONSerializer1ValueFilters = jSONSerializer1.valueFilters;
        
        jSONSerializer.checkValue(jSONSerializer1);
        
        List finalJSONSerializerValueFilters = jSONSerializer.valueFilters;
        
        List finalJSONSerializer1ValueFilters = jSONSerializer1.valueFilters;
        
        assertNull(finalJSONSerializerValueFilters);
        
        assertNull(finalJSONSerializer1ValueFilters);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetContext1() throws Throwable  {
        JSONSerializer jSONSerializer = new JSONSerializer();
        SerialContext serialContext = ((SerialContext) createInstance("com.alibaba.fastjson.serializer.SerialContext"));
        Object object = new Object();
        Object object1 = new Object();
        
        jSONSerializer.setContext(serialContext, object, object1, 0, 0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetContext2() throws Throwable  {
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        SerializeWriter serializeWriter = ((SerializeWriter) createInstance("com.alibaba.fastjson.serializer.SerializeWriter"));
        serializeWriter.disableCircularReferenceDetect = true;
        setField(jSONSerializer, "out", serializeWriter);
        
        jSONSerializer.setContext(null, null, null, 0, 0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetContext3() throws Throwable  {
        JSONSerializer jSONSerializer = new JSONSerializer();
        SerialContext serialContext = ((SerialContext) createInstance("com.alibaba.fastjson.serializer.SerialContext"));
        
        jSONSerializer.setContext(serialContext);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetContext4() throws Throwable  {
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        setField(jSONSerializer, "context", null);
        
        jSONSerializer.setContext(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetContext5() throws Throwable  {
        JSONSerializer jSONSerializer = new JSONSerializer();
        Object object = new Object();
        Object object1 = new Object();
        
        jSONSerializer.setContext(object, object1);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetContext6() throws Throwable  {
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        setField(jSONSerializer, "context", null);
        SerializeWriter serializeWriter = ((SerializeWriter) createInstance("com.alibaba.fastjson.serializer.SerializeWriter"));
        serializeWriter.disableCircularReferenceDetect = true;
        setField(jSONSerializer, "out", serializeWriter);
        
        jSONSerializer.setContext(null, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetContext7() throws Throwable  {
        JSONSerializer jSONSerializer = new JSONSerializer();
        SerialContext serialContext = ((SerialContext) createInstance("com.alibaba.fastjson.serializer.SerialContext"));
        Object object = new Object();
        Object object1 = new Object();
        
        jSONSerializer.setContext(serialContext, object, object1, 0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetContext8() throws Throwable  {
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        SerializeWriter serializeWriter = ((SerializeWriter) createInstance("com.alibaba.fastjson.serializer.SerializeWriter"));
        serializeWriter.disableCircularReferenceDetect = true;
        setField(jSONSerializer, "out", serializeWriter);
        
        jSONSerializer.setContext(null, null, null, 0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetDateFormat1() throws Throwable  {
        JSONSerializer jSONSerializer = new JSONSerializer();
        
        jSONSerializer.setDateFormat(((DateFormat) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetDateFormat2() throws Throwable  {
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        setField(jSONSerializer, "dateFormat", null);
        setField(jSONSerializer, "dateFormatPattern", null);
        
        jSONSerializer.setDateFormat(((DateFormat) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetDateFormat3() throws Throwable  {
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        setField(jSONSerializer, "dateFormat", null);
        String string = new String("");
        setField(jSONSerializer, "dateFormatPattern", string);
        
        jSONSerializer.setDateFormat(((DateFormat) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetDateFormat4() throws Throwable  {
        JSONSerializer jSONSerializer = new JSONSerializer();
        String string = new String();
        
        jSONSerializer.setDateFormat(string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetDateFormat5() throws Throwable  {
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        setField(jSONSerializer, "dateFormat", null);
        setField(jSONSerializer, "dateFormatPattern", null);
        
        jSONSerializer.setDateFormat(((String) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetDateFormat6() throws Throwable  {
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        SimpleDateFormat simpleDateFormat = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        setField(jSONSerializer, "dateFormat", simpleDateFormat);
        setField(jSONSerializer, "dateFormatPattern", null);
        
        Object initialJSONSerializerDateFormat = getFieldValue(jSONSerializer, "dateFormat");
        
        jSONSerializer.setDateFormat(((String) null));
        
        Object finalJSONSerializerDateFormat = getFieldValue(jSONSerializer, "dateFormat");
        
        assertNull(finalJSONSerializerDateFormat);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetDateFormat1() throws Throwable  {
        JSONSerializer jSONSerializer = new JSONSerializer();
        
        DateFormat actual = jSONSerializer.getDateFormat();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetDateFormat2() throws Throwable  {
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        SimpleDateFormat simpleDateFormat = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        setField(jSONSerializer, "dateFormat", simpleDateFormat);
        
        DateFormat actual = jSONSerializer.getDateFormat();
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(simpleDateFormat, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetDateFormat3() throws Throwable  {
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        setField(jSONSerializer, "dateFormat", null);
        setField(jSONSerializer, "dateFormatPattern", null);
        
        DateFormat actual = jSONSerializer.getDateFormat();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetDateFormat4() throws Throwable  {
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        setField(jSONSerializer, "locale", null);
        setField(jSONSerializer, "dateFormat", null);
        String string = new String("");
        setField(jSONSerializer, "dateFormatPattern", string);
        
        jSONSerializer.getDateFormat();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testHasPropertyFilters1() throws Throwable  {
        JSONSerializer jSONSerializer = new JSONSerializer();
        
        jSONSerializer.hasPropertyFilters(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testHasPropertyFilters2() throws Throwable  {
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        setField(jSONSerializer, "propertyFilters", null);
        
        List initialJSONSerializerPropertyFilters = jSONSerializer.propertyFilters;
        
        jSONSerializer.hasPropertyFilters(null);
        
        List finalJSONSerializerPropertyFilters = jSONSerializer.propertyFilters;
        
        assertNull(finalJSONSerializerPropertyFilters);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testHasPropertyFilters3() throws Throwable  {
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        setField(jSONSerializer, "propertyFilters", null);
        JSONSerializer jSONSerializer1 = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        setField(jSONSerializer1, "propertyFilters", null);
        
        List initialJSONSerializerPropertyFilters = jSONSerializer.propertyFilters;
        
        List initialJSONSerializer1PropertyFilters = jSONSerializer1.propertyFilters;
        
        boolean actual = jSONSerializer.hasPropertyFilters(jSONSerializer1);
        
        assertFalse(actual);
        
        List finalJSONSerializerPropertyFilters = jSONSerializer.propertyFilters;
        
        List finalJSONSerializer1PropertyFilters = jSONSerializer1.propertyFilters;
        
        assertNull(finalJSONSerializerPropertyFilters);
        
        assertNull(finalJSONSerializer1PropertyFilters);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testHasPropertyFilters4() throws Throwable  {
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        ArrayList arrayList = new ArrayList();
        setField(jSONSerializer, "propertyFilters", arrayList);
        
        jSONSerializer.hasPropertyFilters(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testWriteWithFieldName1() throws Throwable  {
        JSONSerializer jSONSerializer = new JSONSerializer();
        Object object = new Object();
        Object object1 = new Object();
        
        jSONSerializer.writeWithFieldName(object, object1);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testWriteWithFieldName2() throws Throwable  {
        JSONSerializer jSONSerializer = new JSONSerializer();
        Object object = new Object();
        Object object1 = new Object();
        
        jSONSerializer.writeWithFieldName(object, object1, null, 0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testHasNameFilters1() throws Throwable  {
        JSONSerializer jSONSerializer = new JSONSerializer();
        
        jSONSerializer.hasNameFilters(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testHasNameFilters2() throws Throwable  {
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        setField(jSONSerializer, "nameFilters", null);
        
        List initialJSONSerializerNameFilters = jSONSerializer.nameFilters;
        
        jSONSerializer.hasNameFilters(null);
        
        List finalJSONSerializerNameFilters = jSONSerializer.nameFilters;
        
        assertNull(finalJSONSerializerNameFilters);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testHasNameFilters3() throws Throwable  {
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        setField(jSONSerializer, "nameFilters", null);
        JSONSerializer jSONSerializer1 = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        setField(jSONSerializer1, "nameFilters", null);
        
        List initialJSONSerializerNameFilters = jSONSerializer.nameFilters;
        
        List initialJSONSerializer1NameFilters = jSONSerializer1.nameFilters;
        
        boolean actual = jSONSerializer.hasNameFilters(jSONSerializer1);
        
        assertFalse(actual);
        
        List finalJSONSerializerNameFilters = jSONSerializer.nameFilters;
        
        List finalJSONSerializer1NameFilters = jSONSerializer1.nameFilters;
        
        assertNull(finalJSONSerializerNameFilters);
        
        assertNull(finalJSONSerializer1NameFilters);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testHasNameFilters4() throws Throwable  {
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        ArrayList arrayList = new ArrayList();
        setField(jSONSerializer, "nameFilters", arrayList);
        
        jSONSerializer.hasNameFilters(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetIndentCount1() throws Throwable  {
        JSONSerializer jSONSerializer = new JSONSerializer();
        
        int actual = jSONSerializer.getIndentCount();
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetIndentCount2() throws Throwable  {
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        setField(jSONSerializer, "indentCount", 0);
        
        int actual = jSONSerializer.getIndentCount();
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIncrementIndent1() throws Throwable  {
        JSONSerializer jSONSerializer = new JSONSerializer();
        
        jSONSerializer.incrementIndent();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIncrementIndent2() throws Throwable  {
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        setField(jSONSerializer, "indentCount", 0);
        
        jSONSerializer.incrementIndent();
        
        Object finalJSONSerializerIndentCount = getFieldValue(jSONSerializer, "indentCount");
        
        assertEquals(1, finalJSONSerializerIndentCount);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testWriteReference1() throws Throwable  {
        JSONSerializer jSONSerializer = new JSONSerializer();
        Object object = new Object();
        
        jSONSerializer.writeReference(object);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testWriteReference2() throws Throwable  {
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        setField(jSONSerializer, "context", null);
        javax.swing.plaf.basic.BasicSplitPaneDivider[] basicSplitPaneDividerArray = new javax.swing.plaf.basic.BasicSplitPaneDivider[0];
        
        jSONSerializer.writeReference(basicSplitPaneDividerArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testWriteReference3() throws Throwable  {
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        SerialContext serialContext = ((SerialContext) createInstance("com.alibaba.fastjson.serializer.SerialContext"));
        Object forEachOrderedTask = createInstance("java.util.stream.ForEachOps$ForEachOrderedTask");
        setField(serialContext, "object", forEachOrderedTask);
        SerialContext serialContext1 = ((SerialContext) createInstance("com.alibaba.fastjson.serializer.SerialContext"));
        java.lang.Object[] forEachOrderedTaskArray = createArray("java.util.stream.ForEachOps$ForEachOrderedTask", 0);
        setField(serialContext1, "object", forEachOrderedTaskArray);
        setField(serialContext1, "parent", null);
        setField(serialContext, "parent", serialContext1);
        jSONSerializer.context = serialContext;
        SerializeWriter serializeWriter = ((SerializeWriter) createInstance("com.alibaba.fastjson.serializer.SerializeWriter"));
        serializeWriter.count = -14;
        char[] charArray = new char[10];
        serializeWriter.buf = charArray;
        setField(jSONSerializer, "out", serializeWriter);
        
        jSONSerializer.writeReference(forEachOrderedTaskArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testWriteReference4() throws Throwable  {
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        SerialContext serialContext = ((SerialContext) createInstance("com.alibaba.fastjson.serializer.SerialContext"));
        java.lang.Object[] forEachOrderedTaskArray = createArray("java.util.stream.ForEachOps$ForEachOrderedTask", 0);
        setField(serialContext, "object", forEachOrderedTaskArray);
        jSONSerializer.context = serialContext;
        SerializeWriter serializeWriter = ((SerializeWriter) createInstance("com.alibaba.fastjson.serializer.SerializeWriter"));
        OutputStreamWriter outputStreamWriter = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        setField(serializeWriter, "writer", outputStreamWriter);
        serializeWriter.count = 2147450897;
        char[] charArray = new char[12];
        serializeWriter.buf = charArray;
        setField(jSONSerializer, "out", serializeWriter);
        
        jSONSerializer.writeReference(forEachOrderedTaskArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testWriteReference5() throws Throwable  {
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        SerialContext serialContext = ((SerialContext) createInstance("com.alibaba.fastjson.serializer.SerialContext"));
        java.lang.Object[] forEachOrderedTaskArray = createArray("java.util.stream.ForEachOps$ForEachOrderedTask", 0);
        setField(serialContext, "object", forEachOrderedTaskArray);
        SerialContext serialContext1 = ((SerialContext) createInstance("com.alibaba.fastjson.serializer.SerialContext"));
        setField(serialContext1, "object", forEachOrderedTaskArray);
        setField(serialContext1, "parent", serialContext1);
        setField(serialContext, "parent", serialContext1);
        jSONSerializer.context = serialContext;
        
        jSONSerializer.writeReference(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIsWriteClassName1() throws Throwable  {
        JSONSerializer jSONSerializer = new JSONSerializer();
        Object object = new Object();
        
        boolean actual = jSONSerializer.isWriteClassName(null, object);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDecrementIdent1() throws Throwable  {
        JSONSerializer jSONSerializer = new JSONSerializer();
        
        jSONSerializer.decrementIdent();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDecrementIdent2() throws Throwable  {
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        setField(jSONSerializer, "indentCount", 0);
        
        jSONSerializer.decrementIdent();
        
        Object finalJSONSerializerIndentCount = getFieldValue(jSONSerializer, "indentCount");
        
        assertEquals(-1, finalJSONSerializerIndentCount);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetWriter1() throws Throwable  {
        JSONSerializer jSONSerializer = new JSONSerializer();
        
        SerializeWriter actual = jSONSerializer.getWriter();
        
        SerializeWriter expected = ((SerializeWriter) createInstance("com.alibaba.fastjson.serializer.SerializeWriter"));
        char[] charArray = new char[2048];
        expected.buf = charArray;
        expected.count = 0;
        expected.features = 3089;
        setField(expected, "writer", null);
        expected.useSingleQuotes = false;
        expected.quoteFieldNames = true;
        expected.sortField = true;
        expected.disableCircularReferenceDetect = false;
        expected.beanToArray = false;
        expected.writeNonStringValueAsString = false;
        expected.notWriteDefaultValue = false;
        expected.writeEnumUsingName = true;
        expected.writeEnumUsingToString = false;
        expected.writeDirect = true;
        expected.keySeperator = '\"';
        expected.maxBufSize = -1;
        expected.browserSecure = false;
        expected.sepcialBits = 21474836479L;
        setField(expected, "writeBuffer", null);
        setField(expected, "lock", expected);
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetWriter2() throws Throwable  {
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        SerializeWriter serializeWriter = ((SerializeWriter) createInstance("com.alibaba.fastjson.serializer.SerializeWriter"));
        setField(jSONSerializer, "out", serializeWriter);
        
        SerializeWriter actual = jSONSerializer.getWriter();
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(serializeWriter, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testWriteNull1() throws Throwable  {
        JSONSerializer jSONSerializer = new JSONSerializer();
        
        jSONSerializer.writeNull();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testWriteNull2() throws Throwable  {
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        SerializeWriter serializeWriter = ((SerializeWriter) createInstance("com.alibaba.fastjson.serializer.SerializeWriter"));
        serializeWriter.count = -507;
        char[] charArray = new char[0];
        serializeWriter.buf = charArray;
        setField(jSONSerializer, "out", serializeWriter);
        
        jSONSerializer.writeNull();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testWriteNull3() throws Throwable  {
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        SerializeWriter serializeWriter = ((SerializeWriter) createInstance("com.alibaba.fastjson.serializer.SerializeWriter"));
        setField(serializeWriter, "writer", serializeWriter);
        serializeWriter.count = 2147475472;
        char[] charArray = new char[9];
        serializeWriter.buf = charArray;
        setField(jSONSerializer, "out", serializeWriter);
        
        jSONSerializer.writeNull();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testWriteNull4() throws Throwable  {
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        SerializeWriter serializeWriter = ((SerializeWriter) createInstance("com.alibaba.fastjson.serializer.SerializeWriter"));
        setField(serializeWriter, "lock", null);
        OutputStreamWriter outputStreamWriter = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        setField(outputStreamWriter, "lock", null);
        StreamEncoder streamEncoder = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(streamEncoder, "lock", null);
        Object heapByteBufferR = createInstance("java.nio.HeapByteBufferR");
        setField(heapByteBufferR, "position", 1);
        setField(streamEncoder, "bb", heapByteBufferR);
        setField(streamEncoder, "isOpen", true);
        setField(outputStreamWriter, "se", streamEncoder);
        setField(serializeWriter, "writer", outputStreamWriter);
        serializeWriter.count = 0;
        char[] charArray = new char[0];
        serializeWriter.buf = charArray;
        setField(jSONSerializer, "out", serializeWriter);
        
        SerializeWriter serializeWriter1 = jSONSerializer.out;
        Object initialJSONSerializerOutLock = getFieldValue(serializeWriter1, "lock");
        SerializeWriter serializeWriter2 = jSONSerializer.out;
        Object serializeWriter2OutWriter = getFieldValue(serializeWriter2, "writer");
        Object initialJSONSerializerOutWriterLock = getFieldValue(serializeWriter2OutWriter, "lock");
        SerializeWriter serializeWriter3 = jSONSerializer.out;
        Object serializeWriter3OutWriter = getFieldValue(serializeWriter3, "writer");
        Object serializeWriter3OutWriterOutWriterSe = getFieldValue(serializeWriter3OutWriter, "se");
        Object initialJSONSerializerOutWriterSeLock = getFieldValue(serializeWriter3OutWriterOutWriterSe, "lock");
        
        jSONSerializer.writeNull();
        
        SerializeWriter serializeWriter4 = jSONSerializer.out;
        Object finalJSONSerializerOutLock = getFieldValue(serializeWriter4, "lock");
        SerializeWriter serializeWriter5 = jSONSerializer.out;
        Object serializeWriter5OutWriter = getFieldValue(serializeWriter5, "writer");
        Object finalJSONSerializerOutWriterLock = getFieldValue(serializeWriter5OutWriter, "lock");
        SerializeWriter serializeWriter6 = jSONSerializer.out;
        Object serializeWriter6OutWriter = getFieldValue(serializeWriter6, "writer");
        Object serializeWriter6OutWriterOutWriterSe = getFieldValue(serializeWriter6OutWriter, "se");
        Object finalJSONSerializerOutWriterSeLock = getFieldValue(serializeWriter6OutWriterOutWriterSe, "lock");
        
        assertNull(finalJSONSerializerOutLock);
        
        assertNull(finalJSONSerializerOutWriterLock);
        
        assertNull(finalJSONSerializerOutWriterSeLock);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testContainsReference1() throws Throwable  {
        JSONSerializer jSONSerializer = new JSONSerializer();
        Object object = new Object();
        
        boolean actual = jSONSerializer.containsReference(object);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testContainsReference2() throws Throwable  {
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        setField(jSONSerializer, "references", null);
        
        boolean actual = jSONSerializer.containsReference(null);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testContainsReference3() throws Throwable  {
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        IdentityHashMap identityHashMap = ((IdentityHashMap) createInstance("java.util.IdentityHashMap"));
        java.lang.Object[] objectArray = new java.lang.Object[9];
        setField(identityHashMap, "table", objectArray);
        jSONSerializer.references = identityHashMap;
        java.lang.Object[] forEachOrderedTaskArray = createArray("java.util.stream.ForEachOps$ForEachOrderedTask", 0);
        
        boolean actual = jSONSerializer.containsReference(forEachOrderedTaskArray);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetDateFormatPattern1() throws Throwable  {
        JSONSerializer jSONSerializer = new JSONSerializer();
        
        String actual = jSONSerializer.getDateFormatPattern();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetDateFormatPattern2() throws Throwable  {
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        setField(jSONSerializer, "dateFormat", null);
        setField(jSONSerializer, "dateFormatPattern", null);
        
        String actual = jSONSerializer.getDateFormatPattern();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetDateFormatPattern3() throws Throwable  {
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        SimpleDateFormat simpleDateFormat = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        setField(simpleDateFormat, "pattern", null);
        setField(jSONSerializer, "dateFormat", simpleDateFormat);
        
        String actual = jSONSerializer.getDateFormatPattern();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testWriteKeyValue1() throws Throwable  {
        JSONSerializer jSONSerializer = new JSONSerializer();
        String string = new String();
        Object object = new Object();
        
        Class jSONSerializerClazz = Class.forName("com.alibaba.fastjson.serializer.JSONSerializer");
        Class charType = char.class;
        Class stringType = Class.forName("java.lang.String");
        Class objectType = Class.forName("java.lang.Object");
        Method writeKeyValueMethod = jSONSerializerClazz.getDeclaredMethod("writeKeyValue", charType, stringType, objectType);
        writeKeyValueMethod.setAccessible(true);
        java.lang.Object[] writeKeyValueMethodArguments = new java.lang.Object[3];
        writeKeyValueMethodArguments[0] = '\u0000';
        writeKeyValueMethodArguments[1] = string;
        writeKeyValueMethodArguments[2] = object;
        writeKeyValueMethod.invoke(jSONSerializer, writeKeyValueMethodArguments);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testWriteKeyValue2() throws Throwable  {
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        SerializeWriter serializeWriter = ((SerializeWriter) createInstance("com.alibaba.fastjson.serializer.SerializeWriter"));
        serializeWriter.count = -2;
        char[] charArray = new char[10];
        serializeWriter.buf = charArray;
        setField(jSONSerializer, "out", serializeWriter);
        
        Class jSONSerializerClazz = Class.forName("com.alibaba.fastjson.serializer.JSONSerializer");
        Class charType = char.class;
        Class stringType = Class.forName("java.lang.String");
        Class objectType = Class.forName("java.lang.Object");
        Method writeKeyValueMethod = jSONSerializerClazz.getDeclaredMethod("writeKeyValue", charType, stringType, objectType);
        writeKeyValueMethod.setAccessible(true);
        java.lang.Object[] writeKeyValueMethodArguments = new java.lang.Object[3];
        writeKeyValueMethodArguments[0] = '\u0001';
        writeKeyValueMethodArguments[1] = null;
        writeKeyValueMethodArguments[2] = null;
        try {
            writeKeyValueMethod.invoke(jSONSerializer, writeKeyValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testWriteKeyValue3() throws Throwable  {
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        SerializeWriter serializeWriter = ((SerializeWriter) createInstance("com.alibaba.fastjson.serializer.SerializeWriter"));
        serializeWriter.quoteFieldNames = true;
        serializeWriter.useSingleQuotes = true;
        setField(jSONSerializer, "out", serializeWriter);
        String string = new String("");
        
        Class jSONSerializerClazz = Class.forName("com.alibaba.fastjson.serializer.JSONSerializer");
        Class charType = char.class;
        Class stringType = Class.forName("java.lang.String");
        Class objectType = Class.forName("java.lang.Object");
        Method writeKeyValueMethod = jSONSerializerClazz.getDeclaredMethod("writeKeyValue", charType, stringType, objectType);
        writeKeyValueMethod.setAccessible(true);
        java.lang.Object[] writeKeyValueMethodArguments = new java.lang.Object[3];
        writeKeyValueMethodArguments[0] = '\u0000';
        writeKeyValueMethodArguments[1] = string;
        writeKeyValueMethodArguments[2] = null;
        try {
            writeKeyValueMethod.invoke(jSONSerializer, writeKeyValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testWriteKeyValue4() throws Throwable  {
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        SerializeWriter serializeWriter = ((SerializeWriter) createInstance("com.alibaba.fastjson.serializer.SerializeWriter"));
        serializeWriter.quoteFieldNames = false;
        serializeWriter.useSingleQuotes = true;
        setField(jSONSerializer, "out", serializeWriter);
        String string = new String("");
        
        Class jSONSerializerClazz = Class.forName("com.alibaba.fastjson.serializer.JSONSerializer");
        Class charType = char.class;
        Class stringType = Class.forName("java.lang.String");
        Class objectType = Class.forName("java.lang.Object");
        Method writeKeyValueMethod = jSONSerializerClazz.getDeclaredMethod("writeKeyValue", charType, stringType, objectType);
        writeKeyValueMethod.setAccessible(true);
        java.lang.Object[] writeKeyValueMethodArguments = new java.lang.Object[3];
        writeKeyValueMethodArguments[0] = '\u0000';
        writeKeyValueMethodArguments[1] = string;
        writeKeyValueMethodArguments[2] = null;
        try {
            writeKeyValueMethod.invoke(jSONSerializer, writeKeyValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testWriteWithFormat1() throws Throwable  {
        JSONSerializer jSONSerializer = new JSONSerializer();
        Object object = new Object();
        String string = new String();
        
        jSONSerializer.writeWithFormat(object, string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testWriteWithFormat2() throws Throwable  {
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        SerializeConfig serializeConfig = ((SerializeConfig) createInstance("com.alibaba.fastjson.serializer.SerializeConfig"));
        com.alibaba.fastjson.util.IdentityHashMap identityHashMap = ((com.alibaba.fastjson.util.IdentityHashMap) createInstance("com.alibaba.fastjson.util.IdentityHashMap"));
        setField(identityHashMap, "indexMask", 38);
        java.lang.Object[] entryArray = createArray("com.alibaba.fastjson.util.IdentityHashMap$Entry", 39);
        setField(identityHashMap, "buckets", entryArray);
        setField(serializeConfig, "serializers", identityHashMap);
        setField(jSONSerializer, "config", serializeConfig);
        jersey.repackaged.com.google.common.collect.Multimaps[][] multimapsArray = new jersey.repackaged.com.google.common.collect.Multimaps[9][];
        multimapsArray[0] = ((jersey.repackaged.com.google.common.collect.Multimaps[]) null);
        multimapsArray[1] = ((jersey.repackaged.com.google.common.collect.Multimaps[]) null);
        multimapsArray[2] = ((jersey.repackaged.com.google.common.collect.Multimaps[]) null);
        multimapsArray[3] = ((jersey.repackaged.com.google.common.collect.Multimaps[]) null);
        multimapsArray[4] = ((jersey.repackaged.com.google.common.collect.Multimaps[]) null);
        multimapsArray[5] = ((jersey.repackaged.com.google.common.collect.Multimaps[]) null);
        multimapsArray[6] = ((jersey.repackaged.com.google.common.collect.Multimaps[]) null);
        multimapsArray[7] = ((jersey.repackaged.com.google.common.collect.Multimaps[]) null);
        multimapsArray[8] = ((jersey.repackaged.com.google.common.collect.Multimaps[]) null);
        
        SerializeConfig serializeConfig1 = jSONSerializer.config;
        Object serializeConfig1ConfigSerializers = getFieldValue(serializeConfig1, "serializers");
        Object serializeConfig1ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig1ConfigSerializers, "buckets");
        Object initialJSONSerializerConfigSerializersBuckets0 = get(serializeConfig1ConfigSerializersConfigSerializersBuckets, 0);
        SerializeConfig serializeConfig2 = jSONSerializer.config;
        Object serializeConfig2ConfigSerializers = getFieldValue(serializeConfig2, "serializers");
        Object serializeConfig2ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig2ConfigSerializers, "buckets");
        Object initialJSONSerializerConfigSerializersBuckets1 = get(serializeConfig2ConfigSerializersConfigSerializersBuckets, 1);
        SerializeConfig serializeConfig3 = jSONSerializer.config;
        Object serializeConfig3ConfigSerializers = getFieldValue(serializeConfig3, "serializers");
        Object serializeConfig3ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig3ConfigSerializers, "buckets");
        Object initialJSONSerializerConfigSerializersBuckets2 = get(serializeConfig3ConfigSerializersConfigSerializersBuckets, 2);
        SerializeConfig serializeConfig4 = jSONSerializer.config;
        Object serializeConfig4ConfigSerializers = getFieldValue(serializeConfig4, "serializers");
        Object serializeConfig4ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig4ConfigSerializers, "buckets");
        Object initialJSONSerializerConfigSerializersBuckets3 = get(serializeConfig4ConfigSerializersConfigSerializersBuckets, 3);
        SerializeConfig serializeConfig5 = jSONSerializer.config;
        Object serializeConfig5ConfigSerializers = getFieldValue(serializeConfig5, "serializers");
        Object serializeConfig5ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig5ConfigSerializers, "buckets");
        Object initialJSONSerializerConfigSerializersBuckets4 = get(serializeConfig5ConfigSerializersConfigSerializersBuckets, 4);
        SerializeConfig serializeConfig6 = jSONSerializer.config;
        Object serializeConfig6ConfigSerializers = getFieldValue(serializeConfig6, "serializers");
        Object serializeConfig6ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig6ConfigSerializers, "buckets");
        Object initialJSONSerializerConfigSerializersBuckets5 = get(serializeConfig6ConfigSerializersConfigSerializersBuckets, 5);
        SerializeConfig serializeConfig7 = jSONSerializer.config;
        Object serializeConfig7ConfigSerializers = getFieldValue(serializeConfig7, "serializers");
        Object serializeConfig7ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig7ConfigSerializers, "buckets");
        Object initialJSONSerializerConfigSerializersBuckets6 = get(serializeConfig7ConfigSerializersConfigSerializersBuckets, 6);
        SerializeConfig serializeConfig8 = jSONSerializer.config;
        Object serializeConfig8ConfigSerializers = getFieldValue(serializeConfig8, "serializers");
        Object serializeConfig8ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig8ConfigSerializers, "buckets");
        Object initialJSONSerializerConfigSerializersBuckets7 = get(serializeConfig8ConfigSerializersConfigSerializersBuckets, 7);
        SerializeConfig serializeConfig9 = jSONSerializer.config;
        Object serializeConfig9ConfigSerializers = getFieldValue(serializeConfig9, "serializers");
        Object serializeConfig9ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig9ConfigSerializers, "buckets");
        Object initialJSONSerializerConfigSerializersBuckets8 = get(serializeConfig9ConfigSerializersConfigSerializersBuckets, 8);
        SerializeConfig serializeConfig10 = jSONSerializer.config;
        Object serializeConfig10ConfigSerializers = getFieldValue(serializeConfig10, "serializers");
        Object serializeConfig10ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig10ConfigSerializers, "buckets");
        Object initialJSONSerializerConfigSerializersBuckets9 = get(serializeConfig10ConfigSerializersConfigSerializersBuckets, 9);
        SerializeConfig serializeConfig11 = jSONSerializer.config;
        Object serializeConfig11ConfigSerializers = getFieldValue(serializeConfig11, "serializers");
        Object serializeConfig11ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig11ConfigSerializers, "buckets");
        Object initialJSONSerializerConfigSerializersBuckets10 = get(serializeConfig11ConfigSerializersConfigSerializersBuckets, 10);
        SerializeConfig serializeConfig12 = jSONSerializer.config;
        Object serializeConfig12ConfigSerializers = getFieldValue(serializeConfig12, "serializers");
        Object serializeConfig12ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig12ConfigSerializers, "buckets");
        Object initialJSONSerializerConfigSerializersBuckets11 = get(serializeConfig12ConfigSerializersConfigSerializersBuckets, 11);
        SerializeConfig serializeConfig13 = jSONSerializer.config;
        Object serializeConfig13ConfigSerializers = getFieldValue(serializeConfig13, "serializers");
        Object serializeConfig13ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig13ConfigSerializers, "buckets");
        Object initialJSONSerializerConfigSerializersBuckets12 = get(serializeConfig13ConfigSerializersConfigSerializersBuckets, 12);
        SerializeConfig serializeConfig14 = jSONSerializer.config;
        Object serializeConfig14ConfigSerializers = getFieldValue(serializeConfig14, "serializers");
        Object serializeConfig14ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig14ConfigSerializers, "buckets");
        Object initialJSONSerializerConfigSerializersBuckets13 = get(serializeConfig14ConfigSerializersConfigSerializersBuckets, 13);
        SerializeConfig serializeConfig15 = jSONSerializer.config;
        Object serializeConfig15ConfigSerializers = getFieldValue(serializeConfig15, "serializers");
        Object serializeConfig15ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig15ConfigSerializers, "buckets");
        Object initialJSONSerializerConfigSerializersBuckets14 = get(serializeConfig15ConfigSerializersConfigSerializersBuckets, 14);
        SerializeConfig serializeConfig16 = jSONSerializer.config;
        Object serializeConfig16ConfigSerializers = getFieldValue(serializeConfig16, "serializers");
        Object serializeConfig16ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig16ConfigSerializers, "buckets");
        Object initialJSONSerializerConfigSerializersBuckets15 = get(serializeConfig16ConfigSerializersConfigSerializersBuckets, 15);
        SerializeConfig serializeConfig17 = jSONSerializer.config;
        Object serializeConfig17ConfigSerializers = getFieldValue(serializeConfig17, "serializers");
        Object serializeConfig17ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig17ConfigSerializers, "buckets");
        Object initialJSONSerializerConfigSerializersBuckets16 = get(serializeConfig17ConfigSerializersConfigSerializersBuckets, 16);
        SerializeConfig serializeConfig18 = jSONSerializer.config;
        Object serializeConfig18ConfigSerializers = getFieldValue(serializeConfig18, "serializers");
        Object serializeConfig18ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig18ConfigSerializers, "buckets");
        Object initialJSONSerializerConfigSerializersBuckets17 = get(serializeConfig18ConfigSerializersConfigSerializersBuckets, 17);
        SerializeConfig serializeConfig19 = jSONSerializer.config;
        Object serializeConfig19ConfigSerializers = getFieldValue(serializeConfig19, "serializers");
        Object serializeConfig19ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig19ConfigSerializers, "buckets");
        Object initialJSONSerializerConfigSerializersBuckets18 = get(serializeConfig19ConfigSerializersConfigSerializersBuckets, 18);
        SerializeConfig serializeConfig20 = jSONSerializer.config;
        Object serializeConfig20ConfigSerializers = getFieldValue(serializeConfig20, "serializers");
        Object serializeConfig20ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig20ConfigSerializers, "buckets");
        Object initialJSONSerializerConfigSerializersBuckets19 = get(serializeConfig20ConfigSerializersConfigSerializersBuckets, 19);
        SerializeConfig serializeConfig21 = jSONSerializer.config;
        Object serializeConfig21ConfigSerializers = getFieldValue(serializeConfig21, "serializers");
        Object serializeConfig21ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig21ConfigSerializers, "buckets");
        Object initialJSONSerializerConfigSerializersBuckets20 = get(serializeConfig21ConfigSerializersConfigSerializersBuckets, 20);
        SerializeConfig serializeConfig22 = jSONSerializer.config;
        Object serializeConfig22ConfigSerializers = getFieldValue(serializeConfig22, "serializers");
        Object serializeConfig22ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig22ConfigSerializers, "buckets");
        Object initialJSONSerializerConfigSerializersBuckets21 = get(serializeConfig22ConfigSerializersConfigSerializersBuckets, 21);
        SerializeConfig serializeConfig23 = jSONSerializer.config;
        Object serializeConfig23ConfigSerializers = getFieldValue(serializeConfig23, "serializers");
        Object serializeConfig23ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig23ConfigSerializers, "buckets");
        Object initialJSONSerializerConfigSerializersBuckets22 = get(serializeConfig23ConfigSerializersConfigSerializersBuckets, 22);
        SerializeConfig serializeConfig24 = jSONSerializer.config;
        Object serializeConfig24ConfigSerializers = getFieldValue(serializeConfig24, "serializers");
        Object serializeConfig24ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig24ConfigSerializers, "buckets");
        Object initialJSONSerializerConfigSerializersBuckets23 = get(serializeConfig24ConfigSerializersConfigSerializersBuckets, 23);
        SerializeConfig serializeConfig25 = jSONSerializer.config;
        Object serializeConfig25ConfigSerializers = getFieldValue(serializeConfig25, "serializers");
        Object serializeConfig25ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig25ConfigSerializers, "buckets");
        Object initialJSONSerializerConfigSerializersBuckets24 = get(serializeConfig25ConfigSerializersConfigSerializersBuckets, 24);
        SerializeConfig serializeConfig26 = jSONSerializer.config;
        Object serializeConfig26ConfigSerializers = getFieldValue(serializeConfig26, "serializers");
        Object serializeConfig26ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig26ConfigSerializers, "buckets");
        Object initialJSONSerializerConfigSerializersBuckets25 = get(serializeConfig26ConfigSerializersConfigSerializersBuckets, 25);
        SerializeConfig serializeConfig27 = jSONSerializer.config;
        Object serializeConfig27ConfigSerializers = getFieldValue(serializeConfig27, "serializers");
        Object serializeConfig27ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig27ConfigSerializers, "buckets");
        Object initialJSONSerializerConfigSerializersBuckets26 = get(serializeConfig27ConfigSerializersConfigSerializersBuckets, 26);
        SerializeConfig serializeConfig28 = jSONSerializer.config;
        Object serializeConfig28ConfigSerializers = getFieldValue(serializeConfig28, "serializers");
        Object serializeConfig28ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig28ConfigSerializers, "buckets");
        Object initialJSONSerializerConfigSerializersBuckets27 = get(serializeConfig28ConfigSerializersConfigSerializersBuckets, 27);
        SerializeConfig serializeConfig29 = jSONSerializer.config;
        Object serializeConfig29ConfigSerializers = getFieldValue(serializeConfig29, "serializers");
        Object serializeConfig29ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig29ConfigSerializers, "buckets");
        Object initialJSONSerializerConfigSerializersBuckets28 = get(serializeConfig29ConfigSerializersConfigSerializersBuckets, 28);
        SerializeConfig serializeConfig30 = jSONSerializer.config;
        Object serializeConfig30ConfigSerializers = getFieldValue(serializeConfig30, "serializers");
        Object serializeConfig30ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig30ConfigSerializers, "buckets");
        Object initialJSONSerializerConfigSerializersBuckets29 = get(serializeConfig30ConfigSerializersConfigSerializersBuckets, 29);
        SerializeConfig serializeConfig31 = jSONSerializer.config;
        Object serializeConfig31ConfigSerializers = getFieldValue(serializeConfig31, "serializers");
        Object serializeConfig31ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig31ConfigSerializers, "buckets");
        Object initialJSONSerializerConfigSerializersBuckets30 = get(serializeConfig31ConfigSerializersConfigSerializersBuckets, 30);
        SerializeConfig serializeConfig32 = jSONSerializer.config;
        Object serializeConfig32ConfigSerializers = getFieldValue(serializeConfig32, "serializers");
        Object serializeConfig32ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig32ConfigSerializers, "buckets");
        Object initialJSONSerializerConfigSerializersBuckets31 = get(serializeConfig32ConfigSerializersConfigSerializersBuckets, 31);
        SerializeConfig serializeConfig33 = jSONSerializer.config;
        Object serializeConfig33ConfigSerializers = getFieldValue(serializeConfig33, "serializers");
        Object serializeConfig33ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig33ConfigSerializers, "buckets");
        Object initialJSONSerializerConfigSerializersBuckets32 = get(serializeConfig33ConfigSerializersConfigSerializersBuckets, 32);
        SerializeConfig serializeConfig34 = jSONSerializer.config;
        Object serializeConfig34ConfigSerializers = getFieldValue(serializeConfig34, "serializers");
        Object serializeConfig34ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig34ConfigSerializers, "buckets");
        Object initialJSONSerializerConfigSerializersBuckets33 = get(serializeConfig34ConfigSerializersConfigSerializersBuckets, 33);
        SerializeConfig serializeConfig35 = jSONSerializer.config;
        Object serializeConfig35ConfigSerializers = getFieldValue(serializeConfig35, "serializers");
        Object serializeConfig35ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig35ConfigSerializers, "buckets");
        Object initialJSONSerializerConfigSerializersBuckets34 = get(serializeConfig35ConfigSerializersConfigSerializersBuckets, 34);
        SerializeConfig serializeConfig36 = jSONSerializer.config;
        Object serializeConfig36ConfigSerializers = getFieldValue(serializeConfig36, "serializers");
        Object serializeConfig36ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig36ConfigSerializers, "buckets");
        Object initialJSONSerializerConfigSerializersBuckets35 = get(serializeConfig36ConfigSerializersConfigSerializersBuckets, 35);
        SerializeConfig serializeConfig37 = jSONSerializer.config;
        Object serializeConfig37ConfigSerializers = getFieldValue(serializeConfig37, "serializers");
        Object serializeConfig37ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig37ConfigSerializers, "buckets");
        Object initialJSONSerializerConfigSerializersBuckets36 = get(serializeConfig37ConfigSerializersConfigSerializersBuckets, 36);
        SerializeConfig serializeConfig38 = jSONSerializer.config;
        Object serializeConfig38ConfigSerializers = getFieldValue(serializeConfig38, "serializers");
        Object serializeConfig38ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig38ConfigSerializers, "buckets");
        Object initialJSONSerializerConfigSerializersBuckets37 = get(serializeConfig38ConfigSerializersConfigSerializersBuckets, 37);
        SerializeConfig serializeConfig39 = jSONSerializer.config;
        Object serializeConfig39ConfigSerializers = getFieldValue(serializeConfig39, "serializers");
        Object serializeConfig39ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig39ConfigSerializers, "buckets");
        Object initialJSONSerializerConfigSerializersBuckets38 = get(serializeConfig39ConfigSerializersConfigSerializersBuckets, 38);
        
        jSONSerializer.writeWithFormat(multimapsArray, null);
        
        SerializeConfig serializeConfig40 = jSONSerializer.config;
        Object serializeConfig40ConfigSerializers = getFieldValue(serializeConfig40, "serializers");
        Object serializeConfig40ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig40ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets0 = get(serializeConfig40ConfigSerializersConfigSerializersBuckets, 0);
        SerializeConfig serializeConfig41 = jSONSerializer.config;
        Object serializeConfig41ConfigSerializers = getFieldValue(serializeConfig41, "serializers");
        Object serializeConfig41ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig41ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets1 = get(serializeConfig41ConfigSerializersConfigSerializersBuckets, 1);
        SerializeConfig serializeConfig42 = jSONSerializer.config;
        Object serializeConfig42ConfigSerializers = getFieldValue(serializeConfig42, "serializers");
        Object serializeConfig42ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig42ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets2 = get(serializeConfig42ConfigSerializersConfigSerializersBuckets, 2);
        SerializeConfig serializeConfig43 = jSONSerializer.config;
        Object serializeConfig43ConfigSerializers = getFieldValue(serializeConfig43, "serializers");
        Object serializeConfig43ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig43ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets3 = get(serializeConfig43ConfigSerializersConfigSerializersBuckets, 3);
        SerializeConfig serializeConfig44 = jSONSerializer.config;
        Object serializeConfig44ConfigSerializers = getFieldValue(serializeConfig44, "serializers");
        Object serializeConfig44ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig44ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets4 = get(serializeConfig44ConfigSerializersConfigSerializersBuckets, 4);
        SerializeConfig serializeConfig45 = jSONSerializer.config;
        Object serializeConfig45ConfigSerializers = getFieldValue(serializeConfig45, "serializers");
        Object serializeConfig45ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig45ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets5 = get(serializeConfig45ConfigSerializersConfigSerializersBuckets, 5);
        SerializeConfig serializeConfig46 = jSONSerializer.config;
        Object serializeConfig46ConfigSerializers = getFieldValue(serializeConfig46, "serializers");
        Object serializeConfig46ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig46ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets6 = get(serializeConfig46ConfigSerializersConfigSerializersBuckets, 6);
        SerializeConfig serializeConfig47 = jSONSerializer.config;
        Object serializeConfig47ConfigSerializers = getFieldValue(serializeConfig47, "serializers");
        Object serializeConfig47ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig47ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets7 = get(serializeConfig47ConfigSerializersConfigSerializersBuckets, 7);
        SerializeConfig serializeConfig48 = jSONSerializer.config;
        Object serializeConfig48ConfigSerializers = getFieldValue(serializeConfig48, "serializers");
        Object serializeConfig48ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig48ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets8 = get(serializeConfig48ConfigSerializersConfigSerializersBuckets, 8);
        SerializeConfig serializeConfig49 = jSONSerializer.config;
        Object serializeConfig49ConfigSerializers = getFieldValue(serializeConfig49, "serializers");
        Object serializeConfig49ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig49ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets9 = get(serializeConfig49ConfigSerializersConfigSerializersBuckets, 9);
        SerializeConfig serializeConfig50 = jSONSerializer.config;
        Object serializeConfig50ConfigSerializers = getFieldValue(serializeConfig50, "serializers");
        Object serializeConfig50ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig50ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets10 = get(serializeConfig50ConfigSerializersConfigSerializersBuckets, 10);
        SerializeConfig serializeConfig51 = jSONSerializer.config;
        Object serializeConfig51ConfigSerializers = getFieldValue(serializeConfig51, "serializers");
        Object serializeConfig51ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig51ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets11 = get(serializeConfig51ConfigSerializersConfigSerializersBuckets, 11);
        SerializeConfig serializeConfig52 = jSONSerializer.config;
        Object serializeConfig52ConfigSerializers = getFieldValue(serializeConfig52, "serializers");
        Object serializeConfig52ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig52ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets12 = get(serializeConfig52ConfigSerializersConfigSerializersBuckets, 12);
        SerializeConfig serializeConfig53 = jSONSerializer.config;
        Object serializeConfig53ConfigSerializers = getFieldValue(serializeConfig53, "serializers");
        Object serializeConfig53ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig53ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets13 = get(serializeConfig53ConfigSerializersConfigSerializersBuckets, 13);
        SerializeConfig serializeConfig54 = jSONSerializer.config;
        Object serializeConfig54ConfigSerializers = getFieldValue(serializeConfig54, "serializers");
        Object serializeConfig54ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig54ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets14 = get(serializeConfig54ConfigSerializersConfigSerializersBuckets, 14);
        SerializeConfig serializeConfig55 = jSONSerializer.config;
        Object serializeConfig55ConfigSerializers = getFieldValue(serializeConfig55, "serializers");
        Object serializeConfig55ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig55ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets15 = get(serializeConfig55ConfigSerializersConfigSerializersBuckets, 15);
        SerializeConfig serializeConfig56 = jSONSerializer.config;
        Object serializeConfig56ConfigSerializers = getFieldValue(serializeConfig56, "serializers");
        Object serializeConfig56ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig56ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets16 = get(serializeConfig56ConfigSerializersConfigSerializersBuckets, 16);
        SerializeConfig serializeConfig57 = jSONSerializer.config;
        Object serializeConfig57ConfigSerializers = getFieldValue(serializeConfig57, "serializers");
        Object serializeConfig57ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig57ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets17 = get(serializeConfig57ConfigSerializersConfigSerializersBuckets, 17);
        SerializeConfig serializeConfig58 = jSONSerializer.config;
        Object serializeConfig58ConfigSerializers = getFieldValue(serializeConfig58, "serializers");
        Object serializeConfig58ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig58ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets18 = get(serializeConfig58ConfigSerializersConfigSerializersBuckets, 18);
        SerializeConfig serializeConfig59 = jSONSerializer.config;
        Object serializeConfig59ConfigSerializers = getFieldValue(serializeConfig59, "serializers");
        Object serializeConfig59ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig59ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets19 = get(serializeConfig59ConfigSerializersConfigSerializersBuckets, 19);
        SerializeConfig serializeConfig60 = jSONSerializer.config;
        Object serializeConfig60ConfigSerializers = getFieldValue(serializeConfig60, "serializers");
        Object serializeConfig60ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig60ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets20 = get(serializeConfig60ConfigSerializersConfigSerializersBuckets, 20);
        SerializeConfig serializeConfig61 = jSONSerializer.config;
        Object serializeConfig61ConfigSerializers = getFieldValue(serializeConfig61, "serializers");
        Object serializeConfig61ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig61ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets21 = get(serializeConfig61ConfigSerializersConfigSerializersBuckets, 21);
        SerializeConfig serializeConfig62 = jSONSerializer.config;
        Object serializeConfig62ConfigSerializers = getFieldValue(serializeConfig62, "serializers");
        Object serializeConfig62ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig62ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets22 = get(serializeConfig62ConfigSerializersConfigSerializersBuckets, 22);
        SerializeConfig serializeConfig63 = jSONSerializer.config;
        Object serializeConfig63ConfigSerializers = getFieldValue(serializeConfig63, "serializers");
        Object serializeConfig63ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig63ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets23 = get(serializeConfig63ConfigSerializersConfigSerializersBuckets, 23);
        SerializeConfig serializeConfig64 = jSONSerializer.config;
        Object serializeConfig64ConfigSerializers = getFieldValue(serializeConfig64, "serializers");
        Object serializeConfig64ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig64ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets24 = get(serializeConfig64ConfigSerializersConfigSerializersBuckets, 24);
        SerializeConfig serializeConfig65 = jSONSerializer.config;
        Object serializeConfig65ConfigSerializers = getFieldValue(serializeConfig65, "serializers");
        Object serializeConfig65ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig65ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets25 = get(serializeConfig65ConfigSerializersConfigSerializersBuckets, 25);
        SerializeConfig serializeConfig66 = jSONSerializer.config;
        Object serializeConfig66ConfigSerializers = getFieldValue(serializeConfig66, "serializers");
        Object serializeConfig66ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig66ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets26 = get(serializeConfig66ConfigSerializersConfigSerializersBuckets, 26);
        SerializeConfig serializeConfig67 = jSONSerializer.config;
        Object serializeConfig67ConfigSerializers = getFieldValue(serializeConfig67, "serializers");
        Object serializeConfig67ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig67ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets27 = get(serializeConfig67ConfigSerializersConfigSerializersBuckets, 27);
        SerializeConfig serializeConfig68 = jSONSerializer.config;
        Object serializeConfig68ConfigSerializers = getFieldValue(serializeConfig68, "serializers");
        Object serializeConfig68ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig68ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets28 = get(serializeConfig68ConfigSerializersConfigSerializersBuckets, 28);
        SerializeConfig serializeConfig69 = jSONSerializer.config;
        Object serializeConfig69ConfigSerializers = getFieldValue(serializeConfig69, "serializers");
        Object serializeConfig69ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig69ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets29 = get(serializeConfig69ConfigSerializersConfigSerializersBuckets, 29);
        SerializeConfig serializeConfig70 = jSONSerializer.config;
        Object serializeConfig70ConfigSerializers = getFieldValue(serializeConfig70, "serializers");
        Object serializeConfig70ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig70ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets30 = get(serializeConfig70ConfigSerializersConfigSerializersBuckets, 30);
        SerializeConfig serializeConfig71 = jSONSerializer.config;
        Object serializeConfig71ConfigSerializers = getFieldValue(serializeConfig71, "serializers");
        Object serializeConfig71ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig71ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets31 = get(serializeConfig71ConfigSerializersConfigSerializersBuckets, 31);
        SerializeConfig serializeConfig72 = jSONSerializer.config;
        Object serializeConfig72ConfigSerializers = getFieldValue(serializeConfig72, "serializers");
        Object serializeConfig72ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig72ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets32 = get(serializeConfig72ConfigSerializersConfigSerializersBuckets, 32);
        SerializeConfig serializeConfig73 = jSONSerializer.config;
        Object serializeConfig73ConfigSerializers = getFieldValue(serializeConfig73, "serializers");
        Object serializeConfig73ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig73ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets33 = get(serializeConfig73ConfigSerializersConfigSerializersBuckets, 33);
        SerializeConfig serializeConfig74 = jSONSerializer.config;
        Object serializeConfig74ConfigSerializers = getFieldValue(serializeConfig74, "serializers");
        Object serializeConfig74ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig74ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets34 = get(serializeConfig74ConfigSerializersConfigSerializersBuckets, 34);
        SerializeConfig serializeConfig75 = jSONSerializer.config;
        Object serializeConfig75ConfigSerializers = getFieldValue(serializeConfig75, "serializers");
        Object serializeConfig75ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig75ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets35 = get(serializeConfig75ConfigSerializersConfigSerializersBuckets, 35);
        SerializeConfig serializeConfig76 = jSONSerializer.config;
        Object serializeConfig76ConfigSerializers = getFieldValue(serializeConfig76, "serializers");
        Object serializeConfig76ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig76ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets36 = get(serializeConfig76ConfigSerializersConfigSerializersBuckets, 36);
        SerializeConfig serializeConfig77 = jSONSerializer.config;
        Object serializeConfig77ConfigSerializers = getFieldValue(serializeConfig77, "serializers");
        Object serializeConfig77ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig77ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets37 = get(serializeConfig77ConfigSerializersConfigSerializersBuckets, 37);
        SerializeConfig serializeConfig78 = jSONSerializer.config;
        Object serializeConfig78ConfigSerializers = getFieldValue(serializeConfig78, "serializers");
        Object serializeConfig78ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig78ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets38 = get(serializeConfig78ConfigSerializersConfigSerializersBuckets, 38);
        
        jersey.repackaged.com.google.common.collect.Multimaps[] finalMultimapsArray0 = multimapsArray[0];
        jersey.repackaged.com.google.common.collect.Multimaps[] finalMultimapsArray1 = multimapsArray[1];
        jersey.repackaged.com.google.common.collect.Multimaps[] finalMultimapsArray2 = multimapsArray[2];
        jersey.repackaged.com.google.common.collect.Multimaps[] finalMultimapsArray3 = multimapsArray[3];
        jersey.repackaged.com.google.common.collect.Multimaps[] finalMultimapsArray4 = multimapsArray[4];
        jersey.repackaged.com.google.common.collect.Multimaps[] finalMultimapsArray5 = multimapsArray[5];
        jersey.repackaged.com.google.common.collect.Multimaps[] finalMultimapsArray6 = multimapsArray[6];
        jersey.repackaged.com.google.common.collect.Multimaps[] finalMultimapsArray7 = multimapsArray[7];
        jersey.repackaged.com.google.common.collect.Multimaps[] finalMultimapsArray8 = multimapsArray[8];
        
        assertNull(finalJSONSerializerConfigSerializersBuckets0);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets1);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets2);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets3);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets4);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets5);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets6);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets7);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets8);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets9);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets10);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets11);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets12);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets13);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets14);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets15);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets16);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets17);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets18);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets19);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets20);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets21);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets22);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets23);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets24);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets25);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets26);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets27);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets28);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets29);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets30);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets31);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets32);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets33);
        
        assertFalse(initialJSONSerializerConfigSerializersBuckets34 == finalJSONSerializerConfigSerializersBuckets34);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets35);
        
        assertFalse(initialJSONSerializerConfigSerializersBuckets36 == finalJSONSerializerConfigSerializersBuckets36);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets37);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets38);
        
        assertNull(finalMultimapsArray0);
        
        assertNull(finalMultimapsArray1);
        
        assertNull(finalMultimapsArray2);
        
        assertNull(finalMultimapsArray3);
        
        assertNull(finalMultimapsArray4);
        
        assertNull(finalMultimapsArray5);
        
        assertNull(finalMultimapsArray6);
        
        assertNull(finalMultimapsArray7);
        
        assertNull(finalMultimapsArray8);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testWriteWithFormat3() throws Throwable  {
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        SerializeWriter serializeWriter = ((SerializeWriter) createInstance("com.alibaba.fastjson.serializer.SerializeWriter"));
        setField(jSONSerializer, "out", serializeWriter);
        
        jSONSerializer.writeWithFormat(null, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testWriteWithFormat4() throws Throwable  {
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        byte[] byteArray = new byte[9];
        String string = new String("");
        
        jSONSerializer.writeWithFormat(byteArray, string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testWriteWithFormat5() throws Throwable  {
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        setField(jSONSerializer, "locale", null);
        setField(jSONSerializer, "dateFormat", null);
        setField(jSONSerializer, "dateFormatPattern", null);
        java.sql.Date date = ((java.sql.Date) createInstance("java.sql.Date"));
        
        jSONSerializer.writeWithFormat(date, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testWriteWithFormat6() throws Throwable  {
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        SimpleDateFormat simpleDateFormat = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        setField(jSONSerializer, "dateFormat", simpleDateFormat);
        java.sql.Date date = ((java.sql.Date) createInstance("java.sql.Date"));
        
        jSONSerializer.writeWithFormat(date, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testWriteWithFormat7() throws Throwable  {
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        ArrayList arrayList = ((ArrayList) createInstance("java.util.ArrayList"));
        
        jSONSerializer.writeWithFormat(arrayList, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetObjectWriter1() throws Throwable  {
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        SerializeConfig serializeConfig = ((SerializeConfig) createInstance("com.alibaba.fastjson.serializer.SerializeConfig"));
        com.alibaba.fastjson.util.IdentityHashMap identityHashMap = ((com.alibaba.fastjson.util.IdentityHashMap) createInstance("com.alibaba.fastjson.util.IdentityHashMap"));
        setField(identityHashMap, "indexMask", 38);
        java.lang.Object[] entryArray = createArray("com.alibaba.fastjson.util.IdentityHashMap$Entry", 39);
        Object entry = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        JSONLibDataFormatSerializer jSONLibDataFormatSerializer = ((JSONLibDataFormatSerializer) createInstance("com.alibaba.fastjson.serializer.JSONLibDataFormatSerializer"));
        setField(entry, "value", jSONLibDataFormatSerializer);
        Class class1 = Object.class;
        setField(entry, "key", class1);
        entryArray[38] = entry;
        setField(identityHashMap, "buckets", entryArray);
        setField(serializeConfig, "serializers", identityHashMap);
        setField(jSONSerializer, "config", serializeConfig);
        
        SerializeConfig serializeConfig1 = jSONSerializer.config;
        Object serializeConfig1ConfigSerializers = getFieldValue(serializeConfig1, "serializers");
        Object serializeConfig1ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig1ConfigSerializers, "buckets");
        Object initialJSONSerializerConfigSerializersBuckets0 = get(serializeConfig1ConfigSerializersConfigSerializersBuckets, 0);
        SerializeConfig serializeConfig2 = jSONSerializer.config;
        Object serializeConfig2ConfigSerializers = getFieldValue(serializeConfig2, "serializers");
        Object serializeConfig2ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig2ConfigSerializers, "buckets");
        Object initialJSONSerializerConfigSerializersBuckets1 = get(serializeConfig2ConfigSerializersConfigSerializersBuckets, 1);
        SerializeConfig serializeConfig3 = jSONSerializer.config;
        Object serializeConfig3ConfigSerializers = getFieldValue(serializeConfig3, "serializers");
        Object serializeConfig3ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig3ConfigSerializers, "buckets");
        Object initialJSONSerializerConfigSerializersBuckets2 = get(serializeConfig3ConfigSerializersConfigSerializersBuckets, 2);
        SerializeConfig serializeConfig4 = jSONSerializer.config;
        Object serializeConfig4ConfigSerializers = getFieldValue(serializeConfig4, "serializers");
        Object serializeConfig4ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig4ConfigSerializers, "buckets");
        Object initialJSONSerializerConfigSerializersBuckets3 = get(serializeConfig4ConfigSerializersConfigSerializersBuckets, 3);
        SerializeConfig serializeConfig5 = jSONSerializer.config;
        Object serializeConfig5ConfigSerializers = getFieldValue(serializeConfig5, "serializers");
        Object serializeConfig5ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig5ConfigSerializers, "buckets");
        Object initialJSONSerializerConfigSerializersBuckets4 = get(serializeConfig5ConfigSerializersConfigSerializersBuckets, 4);
        SerializeConfig serializeConfig6 = jSONSerializer.config;
        Object serializeConfig6ConfigSerializers = getFieldValue(serializeConfig6, "serializers");
        Object serializeConfig6ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig6ConfigSerializers, "buckets");
        Object initialJSONSerializerConfigSerializersBuckets5 = get(serializeConfig6ConfigSerializersConfigSerializersBuckets, 5);
        SerializeConfig serializeConfig7 = jSONSerializer.config;
        Object serializeConfig7ConfigSerializers = getFieldValue(serializeConfig7, "serializers");
        Object serializeConfig7ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig7ConfigSerializers, "buckets");
        Object initialJSONSerializerConfigSerializersBuckets6 = get(serializeConfig7ConfigSerializersConfigSerializersBuckets, 6);
        SerializeConfig serializeConfig8 = jSONSerializer.config;
        Object serializeConfig8ConfigSerializers = getFieldValue(serializeConfig8, "serializers");
        Object serializeConfig8ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig8ConfigSerializers, "buckets");
        Object initialJSONSerializerConfigSerializersBuckets7 = get(serializeConfig8ConfigSerializersConfigSerializersBuckets, 7);
        SerializeConfig serializeConfig9 = jSONSerializer.config;
        Object serializeConfig9ConfigSerializers = getFieldValue(serializeConfig9, "serializers");
        Object serializeConfig9ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig9ConfigSerializers, "buckets");
        Object initialJSONSerializerConfigSerializersBuckets8 = get(serializeConfig9ConfigSerializersConfigSerializersBuckets, 8);
        SerializeConfig serializeConfig10 = jSONSerializer.config;
        Object serializeConfig10ConfigSerializers = getFieldValue(serializeConfig10, "serializers");
        Object serializeConfig10ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig10ConfigSerializers, "buckets");
        Object initialJSONSerializerConfigSerializersBuckets9 = get(serializeConfig10ConfigSerializersConfigSerializersBuckets, 9);
        SerializeConfig serializeConfig11 = jSONSerializer.config;
        Object serializeConfig11ConfigSerializers = getFieldValue(serializeConfig11, "serializers");
        Object serializeConfig11ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig11ConfigSerializers, "buckets");
        Object initialJSONSerializerConfigSerializersBuckets10 = get(serializeConfig11ConfigSerializersConfigSerializersBuckets, 10);
        SerializeConfig serializeConfig12 = jSONSerializer.config;
        Object serializeConfig12ConfigSerializers = getFieldValue(serializeConfig12, "serializers");
        Object serializeConfig12ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig12ConfigSerializers, "buckets");
        Object initialJSONSerializerConfigSerializersBuckets11 = get(serializeConfig12ConfigSerializersConfigSerializersBuckets, 11);
        SerializeConfig serializeConfig13 = jSONSerializer.config;
        Object serializeConfig13ConfigSerializers = getFieldValue(serializeConfig13, "serializers");
        Object serializeConfig13ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig13ConfigSerializers, "buckets");
        Object initialJSONSerializerConfigSerializersBuckets12 = get(serializeConfig13ConfigSerializersConfigSerializersBuckets, 12);
        SerializeConfig serializeConfig14 = jSONSerializer.config;
        Object serializeConfig14ConfigSerializers = getFieldValue(serializeConfig14, "serializers");
        Object serializeConfig14ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig14ConfigSerializers, "buckets");
        Object initialJSONSerializerConfigSerializersBuckets13 = get(serializeConfig14ConfigSerializersConfigSerializersBuckets, 13);
        SerializeConfig serializeConfig15 = jSONSerializer.config;
        Object serializeConfig15ConfigSerializers = getFieldValue(serializeConfig15, "serializers");
        Object serializeConfig15ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig15ConfigSerializers, "buckets");
        Object initialJSONSerializerConfigSerializersBuckets14 = get(serializeConfig15ConfigSerializersConfigSerializersBuckets, 14);
        SerializeConfig serializeConfig16 = jSONSerializer.config;
        Object serializeConfig16ConfigSerializers = getFieldValue(serializeConfig16, "serializers");
        Object serializeConfig16ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig16ConfigSerializers, "buckets");
        Object initialJSONSerializerConfigSerializersBuckets15 = get(serializeConfig16ConfigSerializersConfigSerializersBuckets, 15);
        SerializeConfig serializeConfig17 = jSONSerializer.config;
        Object serializeConfig17ConfigSerializers = getFieldValue(serializeConfig17, "serializers");
        Object serializeConfig17ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig17ConfigSerializers, "buckets");
        Object initialJSONSerializerConfigSerializersBuckets16 = get(serializeConfig17ConfigSerializersConfigSerializersBuckets, 16);
        SerializeConfig serializeConfig18 = jSONSerializer.config;
        Object serializeConfig18ConfigSerializers = getFieldValue(serializeConfig18, "serializers");
        Object serializeConfig18ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig18ConfigSerializers, "buckets");
        Object initialJSONSerializerConfigSerializersBuckets17 = get(serializeConfig18ConfigSerializersConfigSerializersBuckets, 17);
        SerializeConfig serializeConfig19 = jSONSerializer.config;
        Object serializeConfig19ConfigSerializers = getFieldValue(serializeConfig19, "serializers");
        Object serializeConfig19ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig19ConfigSerializers, "buckets");
        Object initialJSONSerializerConfigSerializersBuckets18 = get(serializeConfig19ConfigSerializersConfigSerializersBuckets, 18);
        SerializeConfig serializeConfig20 = jSONSerializer.config;
        Object serializeConfig20ConfigSerializers = getFieldValue(serializeConfig20, "serializers");
        Object serializeConfig20ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig20ConfigSerializers, "buckets");
        Object initialJSONSerializerConfigSerializersBuckets19 = get(serializeConfig20ConfigSerializersConfigSerializersBuckets, 19);
        SerializeConfig serializeConfig21 = jSONSerializer.config;
        Object serializeConfig21ConfigSerializers = getFieldValue(serializeConfig21, "serializers");
        Object serializeConfig21ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig21ConfigSerializers, "buckets");
        Object initialJSONSerializerConfigSerializersBuckets20 = get(serializeConfig21ConfigSerializersConfigSerializersBuckets, 20);
        SerializeConfig serializeConfig22 = jSONSerializer.config;
        Object serializeConfig22ConfigSerializers = getFieldValue(serializeConfig22, "serializers");
        Object serializeConfig22ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig22ConfigSerializers, "buckets");
        Object initialJSONSerializerConfigSerializersBuckets21 = get(serializeConfig22ConfigSerializersConfigSerializersBuckets, 21);
        SerializeConfig serializeConfig23 = jSONSerializer.config;
        Object serializeConfig23ConfigSerializers = getFieldValue(serializeConfig23, "serializers");
        Object serializeConfig23ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig23ConfigSerializers, "buckets");
        Object initialJSONSerializerConfigSerializersBuckets22 = get(serializeConfig23ConfigSerializersConfigSerializersBuckets, 22);
        SerializeConfig serializeConfig24 = jSONSerializer.config;
        Object serializeConfig24ConfigSerializers = getFieldValue(serializeConfig24, "serializers");
        Object serializeConfig24ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig24ConfigSerializers, "buckets");
        Object initialJSONSerializerConfigSerializersBuckets23 = get(serializeConfig24ConfigSerializersConfigSerializersBuckets, 23);
        SerializeConfig serializeConfig25 = jSONSerializer.config;
        Object serializeConfig25ConfigSerializers = getFieldValue(serializeConfig25, "serializers");
        Object serializeConfig25ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig25ConfigSerializers, "buckets");
        Object initialJSONSerializerConfigSerializersBuckets24 = get(serializeConfig25ConfigSerializersConfigSerializersBuckets, 24);
        SerializeConfig serializeConfig26 = jSONSerializer.config;
        Object serializeConfig26ConfigSerializers = getFieldValue(serializeConfig26, "serializers");
        Object serializeConfig26ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig26ConfigSerializers, "buckets");
        Object initialJSONSerializerConfigSerializersBuckets25 = get(serializeConfig26ConfigSerializersConfigSerializersBuckets, 25);
        SerializeConfig serializeConfig27 = jSONSerializer.config;
        Object serializeConfig27ConfigSerializers = getFieldValue(serializeConfig27, "serializers");
        Object serializeConfig27ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig27ConfigSerializers, "buckets");
        Object initialJSONSerializerConfigSerializersBuckets26 = get(serializeConfig27ConfigSerializersConfigSerializersBuckets, 26);
        SerializeConfig serializeConfig28 = jSONSerializer.config;
        Object serializeConfig28ConfigSerializers = getFieldValue(serializeConfig28, "serializers");
        Object serializeConfig28ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig28ConfigSerializers, "buckets");
        Object initialJSONSerializerConfigSerializersBuckets27 = get(serializeConfig28ConfigSerializersConfigSerializersBuckets, 27);
        SerializeConfig serializeConfig29 = jSONSerializer.config;
        Object serializeConfig29ConfigSerializers = getFieldValue(serializeConfig29, "serializers");
        Object serializeConfig29ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig29ConfigSerializers, "buckets");
        Object initialJSONSerializerConfigSerializersBuckets28 = get(serializeConfig29ConfigSerializersConfigSerializersBuckets, 28);
        SerializeConfig serializeConfig30 = jSONSerializer.config;
        Object serializeConfig30ConfigSerializers = getFieldValue(serializeConfig30, "serializers");
        Object serializeConfig30ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig30ConfigSerializers, "buckets");
        Object initialJSONSerializerConfigSerializersBuckets29 = get(serializeConfig30ConfigSerializersConfigSerializersBuckets, 29);
        SerializeConfig serializeConfig31 = jSONSerializer.config;
        Object serializeConfig31ConfigSerializers = getFieldValue(serializeConfig31, "serializers");
        Object serializeConfig31ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig31ConfigSerializers, "buckets");
        Object initialJSONSerializerConfigSerializersBuckets30 = get(serializeConfig31ConfigSerializersConfigSerializersBuckets, 30);
        SerializeConfig serializeConfig32 = jSONSerializer.config;
        Object serializeConfig32ConfigSerializers = getFieldValue(serializeConfig32, "serializers");
        Object serializeConfig32ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig32ConfigSerializers, "buckets");
        Object initialJSONSerializerConfigSerializersBuckets31 = get(serializeConfig32ConfigSerializersConfigSerializersBuckets, 31);
        SerializeConfig serializeConfig33 = jSONSerializer.config;
        Object serializeConfig33ConfigSerializers = getFieldValue(serializeConfig33, "serializers");
        Object serializeConfig33ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig33ConfigSerializers, "buckets");
        Object initialJSONSerializerConfigSerializersBuckets32 = get(serializeConfig33ConfigSerializersConfigSerializersBuckets, 32);
        SerializeConfig serializeConfig34 = jSONSerializer.config;
        Object serializeConfig34ConfigSerializers = getFieldValue(serializeConfig34, "serializers");
        Object serializeConfig34ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig34ConfigSerializers, "buckets");
        Object initialJSONSerializerConfigSerializersBuckets33 = get(serializeConfig34ConfigSerializersConfigSerializersBuckets, 33);
        SerializeConfig serializeConfig35 = jSONSerializer.config;
        Object serializeConfig35ConfigSerializers = getFieldValue(serializeConfig35, "serializers");
        Object serializeConfig35ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig35ConfigSerializers, "buckets");
        Object initialJSONSerializerConfigSerializersBuckets34 = get(serializeConfig35ConfigSerializersConfigSerializersBuckets, 34);
        SerializeConfig serializeConfig36 = jSONSerializer.config;
        Object serializeConfig36ConfigSerializers = getFieldValue(serializeConfig36, "serializers");
        Object serializeConfig36ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig36ConfigSerializers, "buckets");
        Object initialJSONSerializerConfigSerializersBuckets35 = get(serializeConfig36ConfigSerializersConfigSerializersBuckets, 35);
        SerializeConfig serializeConfig37 = jSONSerializer.config;
        Object serializeConfig37ConfigSerializers = getFieldValue(serializeConfig37, "serializers");
        Object serializeConfig37ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig37ConfigSerializers, "buckets");
        Object initialJSONSerializerConfigSerializersBuckets36 = get(serializeConfig37ConfigSerializersConfigSerializersBuckets, 36);
        SerializeConfig serializeConfig38 = jSONSerializer.config;
        Object serializeConfig38ConfigSerializers = getFieldValue(serializeConfig38, "serializers");
        Object serializeConfig38ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig38ConfigSerializers, "buckets");
        Object initialJSONSerializerConfigSerializersBuckets37 = get(serializeConfig38ConfigSerializersConfigSerializersBuckets, 37);
        
        ObjectSerializer actual = jSONSerializer.getObjectWriter(class1);
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(jSONLibDataFormatSerializer, actual));
        
        SerializeConfig serializeConfig39 = jSONSerializer.config;
        Object serializeConfig39ConfigSerializers = getFieldValue(serializeConfig39, "serializers");
        Object serializeConfig39ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig39ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets0 = get(serializeConfig39ConfigSerializersConfigSerializersBuckets, 0);
        SerializeConfig serializeConfig40 = jSONSerializer.config;
        Object serializeConfig40ConfigSerializers = getFieldValue(serializeConfig40, "serializers");
        Object serializeConfig40ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig40ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets1 = get(serializeConfig40ConfigSerializersConfigSerializersBuckets, 1);
        SerializeConfig serializeConfig41 = jSONSerializer.config;
        Object serializeConfig41ConfigSerializers = getFieldValue(serializeConfig41, "serializers");
        Object serializeConfig41ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig41ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets2 = get(serializeConfig41ConfigSerializersConfigSerializersBuckets, 2);
        SerializeConfig serializeConfig42 = jSONSerializer.config;
        Object serializeConfig42ConfigSerializers = getFieldValue(serializeConfig42, "serializers");
        Object serializeConfig42ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig42ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets3 = get(serializeConfig42ConfigSerializersConfigSerializersBuckets, 3);
        SerializeConfig serializeConfig43 = jSONSerializer.config;
        Object serializeConfig43ConfigSerializers = getFieldValue(serializeConfig43, "serializers");
        Object serializeConfig43ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig43ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets4 = get(serializeConfig43ConfigSerializersConfigSerializersBuckets, 4);
        SerializeConfig serializeConfig44 = jSONSerializer.config;
        Object serializeConfig44ConfigSerializers = getFieldValue(serializeConfig44, "serializers");
        Object serializeConfig44ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig44ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets5 = get(serializeConfig44ConfigSerializersConfigSerializersBuckets, 5);
        SerializeConfig serializeConfig45 = jSONSerializer.config;
        Object serializeConfig45ConfigSerializers = getFieldValue(serializeConfig45, "serializers");
        Object serializeConfig45ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig45ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets6 = get(serializeConfig45ConfigSerializersConfigSerializersBuckets, 6);
        SerializeConfig serializeConfig46 = jSONSerializer.config;
        Object serializeConfig46ConfigSerializers = getFieldValue(serializeConfig46, "serializers");
        Object serializeConfig46ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig46ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets7 = get(serializeConfig46ConfigSerializersConfigSerializersBuckets, 7);
        SerializeConfig serializeConfig47 = jSONSerializer.config;
        Object serializeConfig47ConfigSerializers = getFieldValue(serializeConfig47, "serializers");
        Object serializeConfig47ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig47ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets8 = get(serializeConfig47ConfigSerializersConfigSerializersBuckets, 8);
        SerializeConfig serializeConfig48 = jSONSerializer.config;
        Object serializeConfig48ConfigSerializers = getFieldValue(serializeConfig48, "serializers");
        Object serializeConfig48ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig48ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets9 = get(serializeConfig48ConfigSerializersConfigSerializersBuckets, 9);
        SerializeConfig serializeConfig49 = jSONSerializer.config;
        Object serializeConfig49ConfigSerializers = getFieldValue(serializeConfig49, "serializers");
        Object serializeConfig49ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig49ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets10 = get(serializeConfig49ConfigSerializersConfigSerializersBuckets, 10);
        SerializeConfig serializeConfig50 = jSONSerializer.config;
        Object serializeConfig50ConfigSerializers = getFieldValue(serializeConfig50, "serializers");
        Object serializeConfig50ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig50ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets11 = get(serializeConfig50ConfigSerializersConfigSerializersBuckets, 11);
        SerializeConfig serializeConfig51 = jSONSerializer.config;
        Object serializeConfig51ConfigSerializers = getFieldValue(serializeConfig51, "serializers");
        Object serializeConfig51ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig51ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets12 = get(serializeConfig51ConfigSerializersConfigSerializersBuckets, 12);
        SerializeConfig serializeConfig52 = jSONSerializer.config;
        Object serializeConfig52ConfigSerializers = getFieldValue(serializeConfig52, "serializers");
        Object serializeConfig52ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig52ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets13 = get(serializeConfig52ConfigSerializersConfigSerializersBuckets, 13);
        SerializeConfig serializeConfig53 = jSONSerializer.config;
        Object serializeConfig53ConfigSerializers = getFieldValue(serializeConfig53, "serializers");
        Object serializeConfig53ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig53ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets14 = get(serializeConfig53ConfigSerializersConfigSerializersBuckets, 14);
        SerializeConfig serializeConfig54 = jSONSerializer.config;
        Object serializeConfig54ConfigSerializers = getFieldValue(serializeConfig54, "serializers");
        Object serializeConfig54ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig54ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets15 = get(serializeConfig54ConfigSerializersConfigSerializersBuckets, 15);
        SerializeConfig serializeConfig55 = jSONSerializer.config;
        Object serializeConfig55ConfigSerializers = getFieldValue(serializeConfig55, "serializers");
        Object serializeConfig55ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig55ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets16 = get(serializeConfig55ConfigSerializersConfigSerializersBuckets, 16);
        SerializeConfig serializeConfig56 = jSONSerializer.config;
        Object serializeConfig56ConfigSerializers = getFieldValue(serializeConfig56, "serializers");
        Object serializeConfig56ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig56ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets17 = get(serializeConfig56ConfigSerializersConfigSerializersBuckets, 17);
        SerializeConfig serializeConfig57 = jSONSerializer.config;
        Object serializeConfig57ConfigSerializers = getFieldValue(serializeConfig57, "serializers");
        Object serializeConfig57ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig57ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets18 = get(serializeConfig57ConfigSerializersConfigSerializersBuckets, 18);
        SerializeConfig serializeConfig58 = jSONSerializer.config;
        Object serializeConfig58ConfigSerializers = getFieldValue(serializeConfig58, "serializers");
        Object serializeConfig58ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig58ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets19 = get(serializeConfig58ConfigSerializersConfigSerializersBuckets, 19);
        SerializeConfig serializeConfig59 = jSONSerializer.config;
        Object serializeConfig59ConfigSerializers = getFieldValue(serializeConfig59, "serializers");
        Object serializeConfig59ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig59ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets20 = get(serializeConfig59ConfigSerializersConfigSerializersBuckets, 20);
        SerializeConfig serializeConfig60 = jSONSerializer.config;
        Object serializeConfig60ConfigSerializers = getFieldValue(serializeConfig60, "serializers");
        Object serializeConfig60ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig60ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets21 = get(serializeConfig60ConfigSerializersConfigSerializersBuckets, 21);
        SerializeConfig serializeConfig61 = jSONSerializer.config;
        Object serializeConfig61ConfigSerializers = getFieldValue(serializeConfig61, "serializers");
        Object serializeConfig61ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig61ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets22 = get(serializeConfig61ConfigSerializersConfigSerializersBuckets, 22);
        SerializeConfig serializeConfig62 = jSONSerializer.config;
        Object serializeConfig62ConfigSerializers = getFieldValue(serializeConfig62, "serializers");
        Object serializeConfig62ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig62ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets23 = get(serializeConfig62ConfigSerializersConfigSerializersBuckets, 23);
        SerializeConfig serializeConfig63 = jSONSerializer.config;
        Object serializeConfig63ConfigSerializers = getFieldValue(serializeConfig63, "serializers");
        Object serializeConfig63ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig63ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets24 = get(serializeConfig63ConfigSerializersConfigSerializersBuckets, 24);
        SerializeConfig serializeConfig64 = jSONSerializer.config;
        Object serializeConfig64ConfigSerializers = getFieldValue(serializeConfig64, "serializers");
        Object serializeConfig64ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig64ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets25 = get(serializeConfig64ConfigSerializersConfigSerializersBuckets, 25);
        SerializeConfig serializeConfig65 = jSONSerializer.config;
        Object serializeConfig65ConfigSerializers = getFieldValue(serializeConfig65, "serializers");
        Object serializeConfig65ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig65ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets26 = get(serializeConfig65ConfigSerializersConfigSerializersBuckets, 26);
        SerializeConfig serializeConfig66 = jSONSerializer.config;
        Object serializeConfig66ConfigSerializers = getFieldValue(serializeConfig66, "serializers");
        Object serializeConfig66ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig66ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets27 = get(serializeConfig66ConfigSerializersConfigSerializersBuckets, 27);
        SerializeConfig serializeConfig67 = jSONSerializer.config;
        Object serializeConfig67ConfigSerializers = getFieldValue(serializeConfig67, "serializers");
        Object serializeConfig67ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig67ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets28 = get(serializeConfig67ConfigSerializersConfigSerializersBuckets, 28);
        SerializeConfig serializeConfig68 = jSONSerializer.config;
        Object serializeConfig68ConfigSerializers = getFieldValue(serializeConfig68, "serializers");
        Object serializeConfig68ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig68ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets29 = get(serializeConfig68ConfigSerializersConfigSerializersBuckets, 29);
        SerializeConfig serializeConfig69 = jSONSerializer.config;
        Object serializeConfig69ConfigSerializers = getFieldValue(serializeConfig69, "serializers");
        Object serializeConfig69ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig69ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets30 = get(serializeConfig69ConfigSerializersConfigSerializersBuckets, 30);
        SerializeConfig serializeConfig70 = jSONSerializer.config;
        Object serializeConfig70ConfigSerializers = getFieldValue(serializeConfig70, "serializers");
        Object serializeConfig70ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig70ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets31 = get(serializeConfig70ConfigSerializersConfigSerializersBuckets, 31);
        SerializeConfig serializeConfig71 = jSONSerializer.config;
        Object serializeConfig71ConfigSerializers = getFieldValue(serializeConfig71, "serializers");
        Object serializeConfig71ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig71ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets32 = get(serializeConfig71ConfigSerializersConfigSerializersBuckets, 32);
        SerializeConfig serializeConfig72 = jSONSerializer.config;
        Object serializeConfig72ConfigSerializers = getFieldValue(serializeConfig72, "serializers");
        Object serializeConfig72ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig72ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets33 = get(serializeConfig72ConfigSerializersConfigSerializersBuckets, 33);
        SerializeConfig serializeConfig73 = jSONSerializer.config;
        Object serializeConfig73ConfigSerializers = getFieldValue(serializeConfig73, "serializers");
        Object serializeConfig73ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig73ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets34 = get(serializeConfig73ConfigSerializersConfigSerializersBuckets, 34);
        SerializeConfig serializeConfig74 = jSONSerializer.config;
        Object serializeConfig74ConfigSerializers = getFieldValue(serializeConfig74, "serializers");
        Object serializeConfig74ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig74ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets35 = get(serializeConfig74ConfigSerializersConfigSerializersBuckets, 35);
        SerializeConfig serializeConfig75 = jSONSerializer.config;
        Object serializeConfig75ConfigSerializers = getFieldValue(serializeConfig75, "serializers");
        Object serializeConfig75ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig75ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets36 = get(serializeConfig75ConfigSerializersConfigSerializersBuckets, 36);
        SerializeConfig serializeConfig76 = jSONSerializer.config;
        Object serializeConfig76ConfigSerializers = getFieldValue(serializeConfig76, "serializers");
        Object serializeConfig76ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig76ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets37 = get(serializeConfig76ConfigSerializersConfigSerializersBuckets, 37);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets0);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets1);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets2);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets3);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets4);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets5);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets6);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets7);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets8);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets9);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets10);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets11);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets12);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets13);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets14);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets15);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets16);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets17);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets18);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets19);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets20);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets21);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets22);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets23);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets24);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets25);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets26);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets27);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets28);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets29);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets30);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets31);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets32);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets33);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets34);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets35);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets36);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets37);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetObjectWriter2() throws Throwable  {
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        SerializeConfig serializeConfig = ((SerializeConfig) createInstance("com.alibaba.fastjson.serializer.SerializeConfig"));
        com.alibaba.fastjson.util.IdentityHashMap identityHashMap = ((com.alibaba.fastjson.util.IdentityHashMap) createInstance("com.alibaba.fastjson.util.IdentityHashMap"));
        setField(identityHashMap, "indexMask", 38);
        java.lang.Object[] entryArray = createArray("com.alibaba.fastjson.util.IdentityHashMap$Entry", 39);
        Object entry = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        Object entry1 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry1, "next", entry1);
        setField(entry1, "value", null);
        Class class1 = Object.class;
        setField(entry1, "key", class1);
        setField(entry, "next", entry1);
        setField(entry, "value", null);
        java.lang.Object[] ofRefArray = createArray("java.util.stream.ForEachOps$ForEachOp$OfRef", 39);
        setField(entry, "key", ofRefArray);
        entryArray[0] = entry;
        entryArray[1] = entry;
        entryArray[2] = entry;
        entryArray[3] = entry;
        entryArray[4] = entry;
        entryArray[5] = entry;
        entryArray[6] = entry;
        entryArray[7] = entry;
        entryArray[8] = entry;
        entryArray[9] = entry;
        entryArray[10] = entry;
        entryArray[11] = entry;
        entryArray[12] = entry;
        entryArray[13] = entry;
        entryArray[14] = entry;
        entryArray[15] = entry;
        entryArray[16] = entry;
        entryArray[17] = entry;
        entryArray[18] = entry;
        entryArray[19] = entry;
        entryArray[20] = entry;
        entryArray[21] = entry;
        entryArray[22] = entry;
        entryArray[23] = entry;
        entryArray[24] = entry;
        entryArray[25] = entry;
        entryArray[26] = entry;
        entryArray[27] = entry;
        entryArray[28] = entry;
        entryArray[29] = entry;
        entryArray[30] = entry;
        entryArray[31] = entry;
        entryArray[32] = entry;
        entryArray[33] = entry;
        entryArray[34] = entry;
        entryArray[35] = entry;
        entryArray[36] = entry;
        entryArray[37] = entry;
        entryArray[38] = entry;
        setField(identityHashMap, "buckets", entryArray);
        setField(serializeConfig, "serializers", identityHashMap);
        setField(jSONSerializer, "config", serializeConfig);
        
        SerializeConfig serializeConfig1 = jSONSerializer.config;
        Object serializeConfig1ConfigSerializers = getFieldValue(serializeConfig1, "serializers");
        Object serializeConfig1ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig1ConfigSerializers, "buckets");
        Object serializeConfig1ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0 = get(serializeConfig1ConfigSerializersConfigSerializersBuckets, 0);
        Object serializeConfig1ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Next = getFieldValue(serializeConfig1ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0, "next");
        Object initialJSONSerializerConfigSerializersBuckets0NextValue = getFieldValue(serializeConfig1ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Next, "value");
        SerializeConfig serializeConfig2 = jSONSerializer.config;
        Object serializeConfig2ConfigSerializers = getFieldValue(serializeConfig2, "serializers");
        Object serializeConfig2ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig2ConfigSerializers, "buckets");
        Object serializeConfig2ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0 = get(serializeConfig2ConfigSerializersConfigSerializersBuckets, 0);
        Object serializeConfig2ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key = getFieldValue(serializeConfig2ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0, "key");
        Object initialJSONSerializerConfigSerializersBuckets0Key0 = get(serializeConfig2ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key, 0);
        SerializeConfig serializeConfig3 = jSONSerializer.config;
        Object serializeConfig3ConfigSerializers = getFieldValue(serializeConfig3, "serializers");
        Object serializeConfig3ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig3ConfigSerializers, "buckets");
        Object serializeConfig3ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0 = get(serializeConfig3ConfigSerializersConfigSerializersBuckets, 0);
        Object serializeConfig3ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key = getFieldValue(serializeConfig3ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0, "key");
        Object initialJSONSerializerConfigSerializersBuckets0Key1 = get(serializeConfig3ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key, 1);
        SerializeConfig serializeConfig4 = jSONSerializer.config;
        Object serializeConfig4ConfigSerializers = getFieldValue(serializeConfig4, "serializers");
        Object serializeConfig4ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig4ConfigSerializers, "buckets");
        Object serializeConfig4ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0 = get(serializeConfig4ConfigSerializersConfigSerializersBuckets, 0);
        Object serializeConfig4ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key = getFieldValue(serializeConfig4ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0, "key");
        Object initialJSONSerializerConfigSerializersBuckets0Key2 = get(serializeConfig4ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key, 2);
        SerializeConfig serializeConfig5 = jSONSerializer.config;
        Object serializeConfig5ConfigSerializers = getFieldValue(serializeConfig5, "serializers");
        Object serializeConfig5ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig5ConfigSerializers, "buckets");
        Object serializeConfig5ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0 = get(serializeConfig5ConfigSerializersConfigSerializersBuckets, 0);
        Object serializeConfig5ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key = getFieldValue(serializeConfig5ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0, "key");
        Object initialJSONSerializerConfigSerializersBuckets0Key3 = get(serializeConfig5ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key, 3);
        SerializeConfig serializeConfig6 = jSONSerializer.config;
        Object serializeConfig6ConfigSerializers = getFieldValue(serializeConfig6, "serializers");
        Object serializeConfig6ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig6ConfigSerializers, "buckets");
        Object serializeConfig6ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0 = get(serializeConfig6ConfigSerializersConfigSerializersBuckets, 0);
        Object serializeConfig6ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key = getFieldValue(serializeConfig6ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0, "key");
        Object initialJSONSerializerConfigSerializersBuckets0Key4 = get(serializeConfig6ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key, 4);
        SerializeConfig serializeConfig7 = jSONSerializer.config;
        Object serializeConfig7ConfigSerializers = getFieldValue(serializeConfig7, "serializers");
        Object serializeConfig7ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig7ConfigSerializers, "buckets");
        Object serializeConfig7ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0 = get(serializeConfig7ConfigSerializersConfigSerializersBuckets, 0);
        Object serializeConfig7ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key = getFieldValue(serializeConfig7ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0, "key");
        Object initialJSONSerializerConfigSerializersBuckets0Key5 = get(serializeConfig7ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key, 5);
        SerializeConfig serializeConfig8 = jSONSerializer.config;
        Object serializeConfig8ConfigSerializers = getFieldValue(serializeConfig8, "serializers");
        Object serializeConfig8ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig8ConfigSerializers, "buckets");
        Object serializeConfig8ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0 = get(serializeConfig8ConfigSerializersConfigSerializersBuckets, 0);
        Object serializeConfig8ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key = getFieldValue(serializeConfig8ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0, "key");
        Object initialJSONSerializerConfigSerializersBuckets0Key6 = get(serializeConfig8ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key, 6);
        SerializeConfig serializeConfig9 = jSONSerializer.config;
        Object serializeConfig9ConfigSerializers = getFieldValue(serializeConfig9, "serializers");
        Object serializeConfig9ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig9ConfigSerializers, "buckets");
        Object serializeConfig9ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0 = get(serializeConfig9ConfigSerializersConfigSerializersBuckets, 0);
        Object serializeConfig9ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key = getFieldValue(serializeConfig9ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0, "key");
        Object initialJSONSerializerConfigSerializersBuckets0Key7 = get(serializeConfig9ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key, 7);
        SerializeConfig serializeConfig10 = jSONSerializer.config;
        Object serializeConfig10ConfigSerializers = getFieldValue(serializeConfig10, "serializers");
        Object serializeConfig10ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig10ConfigSerializers, "buckets");
        Object serializeConfig10ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0 = get(serializeConfig10ConfigSerializersConfigSerializersBuckets, 0);
        Object serializeConfig10ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key = getFieldValue(serializeConfig10ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0, "key");
        Object initialJSONSerializerConfigSerializersBuckets0Key8 = get(serializeConfig10ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key, 8);
        SerializeConfig serializeConfig11 = jSONSerializer.config;
        Object serializeConfig11ConfigSerializers = getFieldValue(serializeConfig11, "serializers");
        Object serializeConfig11ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig11ConfigSerializers, "buckets");
        Object serializeConfig11ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0 = get(serializeConfig11ConfigSerializersConfigSerializersBuckets, 0);
        Object serializeConfig11ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key = getFieldValue(serializeConfig11ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0, "key");
        Object initialJSONSerializerConfigSerializersBuckets0Key9 = get(serializeConfig11ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key, 9);
        SerializeConfig serializeConfig12 = jSONSerializer.config;
        Object serializeConfig12ConfigSerializers = getFieldValue(serializeConfig12, "serializers");
        Object serializeConfig12ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig12ConfigSerializers, "buckets");
        Object serializeConfig12ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0 = get(serializeConfig12ConfigSerializersConfigSerializersBuckets, 0);
        Object serializeConfig12ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key = getFieldValue(serializeConfig12ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0, "key");
        Object initialJSONSerializerConfigSerializersBuckets0Key10 = get(serializeConfig12ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key, 10);
        SerializeConfig serializeConfig13 = jSONSerializer.config;
        Object serializeConfig13ConfigSerializers = getFieldValue(serializeConfig13, "serializers");
        Object serializeConfig13ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig13ConfigSerializers, "buckets");
        Object serializeConfig13ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0 = get(serializeConfig13ConfigSerializersConfigSerializersBuckets, 0);
        Object serializeConfig13ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key = getFieldValue(serializeConfig13ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0, "key");
        Object initialJSONSerializerConfigSerializersBuckets0Key11 = get(serializeConfig13ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key, 11);
        SerializeConfig serializeConfig14 = jSONSerializer.config;
        Object serializeConfig14ConfigSerializers = getFieldValue(serializeConfig14, "serializers");
        Object serializeConfig14ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig14ConfigSerializers, "buckets");
        Object serializeConfig14ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0 = get(serializeConfig14ConfigSerializersConfigSerializersBuckets, 0);
        Object serializeConfig14ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key = getFieldValue(serializeConfig14ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0, "key");
        Object initialJSONSerializerConfigSerializersBuckets0Key12 = get(serializeConfig14ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key, 12);
        SerializeConfig serializeConfig15 = jSONSerializer.config;
        Object serializeConfig15ConfigSerializers = getFieldValue(serializeConfig15, "serializers");
        Object serializeConfig15ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig15ConfigSerializers, "buckets");
        Object serializeConfig15ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0 = get(serializeConfig15ConfigSerializersConfigSerializersBuckets, 0);
        Object serializeConfig15ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key = getFieldValue(serializeConfig15ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0, "key");
        Object initialJSONSerializerConfigSerializersBuckets0Key13 = get(serializeConfig15ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key, 13);
        SerializeConfig serializeConfig16 = jSONSerializer.config;
        Object serializeConfig16ConfigSerializers = getFieldValue(serializeConfig16, "serializers");
        Object serializeConfig16ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig16ConfigSerializers, "buckets");
        Object serializeConfig16ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0 = get(serializeConfig16ConfigSerializersConfigSerializersBuckets, 0);
        Object serializeConfig16ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key = getFieldValue(serializeConfig16ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0, "key");
        Object initialJSONSerializerConfigSerializersBuckets0Key14 = get(serializeConfig16ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key, 14);
        SerializeConfig serializeConfig17 = jSONSerializer.config;
        Object serializeConfig17ConfigSerializers = getFieldValue(serializeConfig17, "serializers");
        Object serializeConfig17ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig17ConfigSerializers, "buckets");
        Object serializeConfig17ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0 = get(serializeConfig17ConfigSerializersConfigSerializersBuckets, 0);
        Object serializeConfig17ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key = getFieldValue(serializeConfig17ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0, "key");
        Object initialJSONSerializerConfigSerializersBuckets0Key15 = get(serializeConfig17ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key, 15);
        SerializeConfig serializeConfig18 = jSONSerializer.config;
        Object serializeConfig18ConfigSerializers = getFieldValue(serializeConfig18, "serializers");
        Object serializeConfig18ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig18ConfigSerializers, "buckets");
        Object serializeConfig18ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0 = get(serializeConfig18ConfigSerializersConfigSerializersBuckets, 0);
        Object serializeConfig18ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key = getFieldValue(serializeConfig18ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0, "key");
        Object initialJSONSerializerConfigSerializersBuckets0Key16 = get(serializeConfig18ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key, 16);
        SerializeConfig serializeConfig19 = jSONSerializer.config;
        Object serializeConfig19ConfigSerializers = getFieldValue(serializeConfig19, "serializers");
        Object serializeConfig19ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig19ConfigSerializers, "buckets");
        Object serializeConfig19ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0 = get(serializeConfig19ConfigSerializersConfigSerializersBuckets, 0);
        Object serializeConfig19ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key = getFieldValue(serializeConfig19ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0, "key");
        Object initialJSONSerializerConfigSerializersBuckets0Key17 = get(serializeConfig19ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key, 17);
        SerializeConfig serializeConfig20 = jSONSerializer.config;
        Object serializeConfig20ConfigSerializers = getFieldValue(serializeConfig20, "serializers");
        Object serializeConfig20ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig20ConfigSerializers, "buckets");
        Object serializeConfig20ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0 = get(serializeConfig20ConfigSerializersConfigSerializersBuckets, 0);
        Object serializeConfig20ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key = getFieldValue(serializeConfig20ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0, "key");
        Object initialJSONSerializerConfigSerializersBuckets0Key18 = get(serializeConfig20ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key, 18);
        SerializeConfig serializeConfig21 = jSONSerializer.config;
        Object serializeConfig21ConfigSerializers = getFieldValue(serializeConfig21, "serializers");
        Object serializeConfig21ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig21ConfigSerializers, "buckets");
        Object serializeConfig21ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0 = get(serializeConfig21ConfigSerializersConfigSerializersBuckets, 0);
        Object serializeConfig21ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key = getFieldValue(serializeConfig21ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0, "key");
        Object initialJSONSerializerConfigSerializersBuckets0Key19 = get(serializeConfig21ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key, 19);
        SerializeConfig serializeConfig22 = jSONSerializer.config;
        Object serializeConfig22ConfigSerializers = getFieldValue(serializeConfig22, "serializers");
        Object serializeConfig22ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig22ConfigSerializers, "buckets");
        Object serializeConfig22ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0 = get(serializeConfig22ConfigSerializersConfigSerializersBuckets, 0);
        Object serializeConfig22ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key = getFieldValue(serializeConfig22ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0, "key");
        Object initialJSONSerializerConfigSerializersBuckets0Key20 = get(serializeConfig22ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key, 20);
        SerializeConfig serializeConfig23 = jSONSerializer.config;
        Object serializeConfig23ConfigSerializers = getFieldValue(serializeConfig23, "serializers");
        Object serializeConfig23ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig23ConfigSerializers, "buckets");
        Object serializeConfig23ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0 = get(serializeConfig23ConfigSerializersConfigSerializersBuckets, 0);
        Object serializeConfig23ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key = getFieldValue(serializeConfig23ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0, "key");
        Object initialJSONSerializerConfigSerializersBuckets0Key21 = get(serializeConfig23ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key, 21);
        SerializeConfig serializeConfig24 = jSONSerializer.config;
        Object serializeConfig24ConfigSerializers = getFieldValue(serializeConfig24, "serializers");
        Object serializeConfig24ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig24ConfigSerializers, "buckets");
        Object serializeConfig24ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0 = get(serializeConfig24ConfigSerializersConfigSerializersBuckets, 0);
        Object serializeConfig24ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key = getFieldValue(serializeConfig24ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0, "key");
        Object initialJSONSerializerConfigSerializersBuckets0Key22 = get(serializeConfig24ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key, 22);
        SerializeConfig serializeConfig25 = jSONSerializer.config;
        Object serializeConfig25ConfigSerializers = getFieldValue(serializeConfig25, "serializers");
        Object serializeConfig25ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig25ConfigSerializers, "buckets");
        Object serializeConfig25ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0 = get(serializeConfig25ConfigSerializersConfigSerializersBuckets, 0);
        Object serializeConfig25ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key = getFieldValue(serializeConfig25ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0, "key");
        Object initialJSONSerializerConfigSerializersBuckets0Key23 = get(serializeConfig25ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key, 23);
        SerializeConfig serializeConfig26 = jSONSerializer.config;
        Object serializeConfig26ConfigSerializers = getFieldValue(serializeConfig26, "serializers");
        Object serializeConfig26ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig26ConfigSerializers, "buckets");
        Object serializeConfig26ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0 = get(serializeConfig26ConfigSerializersConfigSerializersBuckets, 0);
        Object serializeConfig26ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key = getFieldValue(serializeConfig26ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0, "key");
        Object initialJSONSerializerConfigSerializersBuckets0Key24 = get(serializeConfig26ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key, 24);
        SerializeConfig serializeConfig27 = jSONSerializer.config;
        Object serializeConfig27ConfigSerializers = getFieldValue(serializeConfig27, "serializers");
        Object serializeConfig27ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig27ConfigSerializers, "buckets");
        Object serializeConfig27ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0 = get(serializeConfig27ConfigSerializersConfigSerializersBuckets, 0);
        Object serializeConfig27ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key = getFieldValue(serializeConfig27ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0, "key");
        Object initialJSONSerializerConfigSerializersBuckets0Key25 = get(serializeConfig27ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key, 25);
        SerializeConfig serializeConfig28 = jSONSerializer.config;
        Object serializeConfig28ConfigSerializers = getFieldValue(serializeConfig28, "serializers");
        Object serializeConfig28ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig28ConfigSerializers, "buckets");
        Object serializeConfig28ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0 = get(serializeConfig28ConfigSerializersConfigSerializersBuckets, 0);
        Object serializeConfig28ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key = getFieldValue(serializeConfig28ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0, "key");
        Object initialJSONSerializerConfigSerializersBuckets0Key26 = get(serializeConfig28ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key, 26);
        SerializeConfig serializeConfig29 = jSONSerializer.config;
        Object serializeConfig29ConfigSerializers = getFieldValue(serializeConfig29, "serializers");
        Object serializeConfig29ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig29ConfigSerializers, "buckets");
        Object serializeConfig29ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0 = get(serializeConfig29ConfigSerializersConfigSerializersBuckets, 0);
        Object serializeConfig29ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key = getFieldValue(serializeConfig29ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0, "key");
        Object initialJSONSerializerConfigSerializersBuckets0Key27 = get(serializeConfig29ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key, 27);
        SerializeConfig serializeConfig30 = jSONSerializer.config;
        Object serializeConfig30ConfigSerializers = getFieldValue(serializeConfig30, "serializers");
        Object serializeConfig30ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig30ConfigSerializers, "buckets");
        Object serializeConfig30ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0 = get(serializeConfig30ConfigSerializersConfigSerializersBuckets, 0);
        Object serializeConfig30ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key = getFieldValue(serializeConfig30ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0, "key");
        Object initialJSONSerializerConfigSerializersBuckets0Key28 = get(serializeConfig30ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key, 28);
        SerializeConfig serializeConfig31 = jSONSerializer.config;
        Object serializeConfig31ConfigSerializers = getFieldValue(serializeConfig31, "serializers");
        Object serializeConfig31ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig31ConfigSerializers, "buckets");
        Object serializeConfig31ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0 = get(serializeConfig31ConfigSerializersConfigSerializersBuckets, 0);
        Object serializeConfig31ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key = getFieldValue(serializeConfig31ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0, "key");
        Object initialJSONSerializerConfigSerializersBuckets0Key29 = get(serializeConfig31ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key, 29);
        SerializeConfig serializeConfig32 = jSONSerializer.config;
        Object serializeConfig32ConfigSerializers = getFieldValue(serializeConfig32, "serializers");
        Object serializeConfig32ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig32ConfigSerializers, "buckets");
        Object serializeConfig32ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0 = get(serializeConfig32ConfigSerializersConfigSerializersBuckets, 0);
        Object serializeConfig32ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key = getFieldValue(serializeConfig32ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0, "key");
        Object initialJSONSerializerConfigSerializersBuckets0Key30 = get(serializeConfig32ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key, 30);
        SerializeConfig serializeConfig33 = jSONSerializer.config;
        Object serializeConfig33ConfigSerializers = getFieldValue(serializeConfig33, "serializers");
        Object serializeConfig33ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig33ConfigSerializers, "buckets");
        Object serializeConfig33ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0 = get(serializeConfig33ConfigSerializersConfigSerializersBuckets, 0);
        Object serializeConfig33ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key = getFieldValue(serializeConfig33ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0, "key");
        Object initialJSONSerializerConfigSerializersBuckets0Key31 = get(serializeConfig33ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key, 31);
        SerializeConfig serializeConfig34 = jSONSerializer.config;
        Object serializeConfig34ConfigSerializers = getFieldValue(serializeConfig34, "serializers");
        Object serializeConfig34ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig34ConfigSerializers, "buckets");
        Object serializeConfig34ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0 = get(serializeConfig34ConfigSerializersConfigSerializersBuckets, 0);
        Object serializeConfig34ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key = getFieldValue(serializeConfig34ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0, "key");
        Object initialJSONSerializerConfigSerializersBuckets0Key32 = get(serializeConfig34ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key, 32);
        SerializeConfig serializeConfig35 = jSONSerializer.config;
        Object serializeConfig35ConfigSerializers = getFieldValue(serializeConfig35, "serializers");
        Object serializeConfig35ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig35ConfigSerializers, "buckets");
        Object serializeConfig35ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0 = get(serializeConfig35ConfigSerializersConfigSerializersBuckets, 0);
        Object serializeConfig35ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key = getFieldValue(serializeConfig35ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0, "key");
        Object initialJSONSerializerConfigSerializersBuckets0Key33 = get(serializeConfig35ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key, 33);
        SerializeConfig serializeConfig36 = jSONSerializer.config;
        Object serializeConfig36ConfigSerializers = getFieldValue(serializeConfig36, "serializers");
        Object serializeConfig36ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig36ConfigSerializers, "buckets");
        Object serializeConfig36ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0 = get(serializeConfig36ConfigSerializersConfigSerializersBuckets, 0);
        Object serializeConfig36ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key = getFieldValue(serializeConfig36ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0, "key");
        Object initialJSONSerializerConfigSerializersBuckets0Key34 = get(serializeConfig36ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key, 34);
        SerializeConfig serializeConfig37 = jSONSerializer.config;
        Object serializeConfig37ConfigSerializers = getFieldValue(serializeConfig37, "serializers");
        Object serializeConfig37ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig37ConfigSerializers, "buckets");
        Object serializeConfig37ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0 = get(serializeConfig37ConfigSerializersConfigSerializersBuckets, 0);
        Object serializeConfig37ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key = getFieldValue(serializeConfig37ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0, "key");
        Object initialJSONSerializerConfigSerializersBuckets0Key35 = get(serializeConfig37ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key, 35);
        SerializeConfig serializeConfig38 = jSONSerializer.config;
        Object serializeConfig38ConfigSerializers = getFieldValue(serializeConfig38, "serializers");
        Object serializeConfig38ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig38ConfigSerializers, "buckets");
        Object serializeConfig38ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0 = get(serializeConfig38ConfigSerializersConfigSerializersBuckets, 0);
        Object serializeConfig38ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key = getFieldValue(serializeConfig38ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0, "key");
        Object initialJSONSerializerConfigSerializersBuckets0Key36 = get(serializeConfig38ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key, 36);
        SerializeConfig serializeConfig39 = jSONSerializer.config;
        Object serializeConfig39ConfigSerializers = getFieldValue(serializeConfig39, "serializers");
        Object serializeConfig39ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig39ConfigSerializers, "buckets");
        Object serializeConfig39ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0 = get(serializeConfig39ConfigSerializersConfigSerializersBuckets, 0);
        Object serializeConfig39ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key = getFieldValue(serializeConfig39ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0, "key");
        Object initialJSONSerializerConfigSerializersBuckets0Key37 = get(serializeConfig39ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key, 37);
        SerializeConfig serializeConfig40 = jSONSerializer.config;
        Object serializeConfig40ConfigSerializers = getFieldValue(serializeConfig40, "serializers");
        Object serializeConfig40ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig40ConfigSerializers, "buckets");
        Object serializeConfig40ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0 = get(serializeConfig40ConfigSerializersConfigSerializersBuckets, 0);
        Object serializeConfig40ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key = getFieldValue(serializeConfig40ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0, "key");
        Object initialJSONSerializerConfigSerializersBuckets0Key38 = get(serializeConfig40ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key, 38);
        
        ObjectSerializer actual = jSONSerializer.getObjectWriter(class1);
        
        JavaBeanSerializer expected = ((JavaBeanSerializer) createInstance("com.alibaba.fastjson.serializer.JavaBeanSerializer"));
        com.alibaba.fastjson.serializer.FieldSerializer[] fieldSerializerArray = new com.alibaba.fastjson.serializer.FieldSerializer[0];
        setField(expected, "getters", fieldSerializerArray);
        setField(expected, "sortedGetters", fieldSerializerArray);
        SerializeBeanInfo serializeBeanInfo = ((SerializeBeanInfo) createInstance("com.alibaba.fastjson.serializer.SerializeBeanInfo"));
        setField(serializeBeanInfo, "beanType", class1);
        setField(serializeBeanInfo, "typeName", null);
        setField(serializeBeanInfo, "typeKey", null);
        setField(serializeBeanInfo, "jsonType", null);
        com.alibaba.fastjson.util.FieldInfo[] fieldInfoArray = new com.alibaba.fastjson.util.FieldInfo[0];
        setField(serializeBeanInfo, "fields", fieldInfoArray);
        setField(serializeBeanInfo, "sortedFields", fieldInfoArray);
        serializeBeanInfo.features = 0;
        expected.beanInfo = serializeBeanInfo;
        setField(expected, "hashArray", null);
        setField(expected, "hashArrayMapping", null);
        setField(expected, "beforeFilters", null);
        setField(expected, "afterFilters", null);
        setField(expected, "propertyFilters", null);
        setField(expected, "valueFilters", null);
        setField(expected, "nameFilters", null);
        setField(expected, "propertyPreFilters", null);
        setField(expected, "labelFilters", null);
        setField(expected, "contextValueFilters", null);
        expected.writeDirect = true;
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
        
        SerializeConfig serializeConfig41 = jSONSerializer.config;
        Object serializeConfig41ConfigSerializers = getFieldValue(serializeConfig41, "serializers");
        Object serializeConfig41ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig41ConfigSerializers, "buckets");
        Object serializeConfig41ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0 = get(serializeConfig41ConfigSerializersConfigSerializersBuckets, 0);
        Object serializeConfig41ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Next = getFieldValue(serializeConfig41ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0, "next");
        Object finalJSONSerializerConfigSerializersBuckets0NextValue = getFieldValue(serializeConfig41ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Next, "value");
        SerializeConfig serializeConfig42 = jSONSerializer.config;
        Object serializeConfig42ConfigSerializers = getFieldValue(serializeConfig42, "serializers");
        Object serializeConfig42ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig42ConfigSerializers, "buckets");
        Object serializeConfig42ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0 = get(serializeConfig42ConfigSerializersConfigSerializersBuckets, 0);
        Object serializeConfig42ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key = getFieldValue(serializeConfig42ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0, "key");
        Object finalJSONSerializerConfigSerializersBuckets0Key0 = get(serializeConfig42ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key, 0);
        SerializeConfig serializeConfig43 = jSONSerializer.config;
        Object serializeConfig43ConfigSerializers = getFieldValue(serializeConfig43, "serializers");
        Object serializeConfig43ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig43ConfigSerializers, "buckets");
        Object serializeConfig43ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0 = get(serializeConfig43ConfigSerializersConfigSerializersBuckets, 0);
        Object serializeConfig43ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key = getFieldValue(serializeConfig43ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0, "key");
        Object finalJSONSerializerConfigSerializersBuckets0Key1 = get(serializeConfig43ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key, 1);
        SerializeConfig serializeConfig44 = jSONSerializer.config;
        Object serializeConfig44ConfigSerializers = getFieldValue(serializeConfig44, "serializers");
        Object serializeConfig44ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig44ConfigSerializers, "buckets");
        Object serializeConfig44ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0 = get(serializeConfig44ConfigSerializersConfigSerializersBuckets, 0);
        Object serializeConfig44ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key = getFieldValue(serializeConfig44ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0, "key");
        Object finalJSONSerializerConfigSerializersBuckets0Key2 = get(serializeConfig44ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key, 2);
        SerializeConfig serializeConfig45 = jSONSerializer.config;
        Object serializeConfig45ConfigSerializers = getFieldValue(serializeConfig45, "serializers");
        Object serializeConfig45ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig45ConfigSerializers, "buckets");
        Object serializeConfig45ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0 = get(serializeConfig45ConfigSerializersConfigSerializersBuckets, 0);
        Object serializeConfig45ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key = getFieldValue(serializeConfig45ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0, "key");
        Object finalJSONSerializerConfigSerializersBuckets0Key3 = get(serializeConfig45ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key, 3);
        SerializeConfig serializeConfig46 = jSONSerializer.config;
        Object serializeConfig46ConfigSerializers = getFieldValue(serializeConfig46, "serializers");
        Object serializeConfig46ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig46ConfigSerializers, "buckets");
        Object serializeConfig46ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0 = get(serializeConfig46ConfigSerializersConfigSerializersBuckets, 0);
        Object serializeConfig46ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key = getFieldValue(serializeConfig46ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0, "key");
        Object finalJSONSerializerConfigSerializersBuckets0Key4 = get(serializeConfig46ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key, 4);
        SerializeConfig serializeConfig47 = jSONSerializer.config;
        Object serializeConfig47ConfigSerializers = getFieldValue(serializeConfig47, "serializers");
        Object serializeConfig47ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig47ConfigSerializers, "buckets");
        Object serializeConfig47ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0 = get(serializeConfig47ConfigSerializersConfigSerializersBuckets, 0);
        Object serializeConfig47ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key = getFieldValue(serializeConfig47ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0, "key");
        Object finalJSONSerializerConfigSerializersBuckets0Key5 = get(serializeConfig47ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key, 5);
        SerializeConfig serializeConfig48 = jSONSerializer.config;
        Object serializeConfig48ConfigSerializers = getFieldValue(serializeConfig48, "serializers");
        Object serializeConfig48ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig48ConfigSerializers, "buckets");
        Object serializeConfig48ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0 = get(serializeConfig48ConfigSerializersConfigSerializersBuckets, 0);
        Object serializeConfig48ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key = getFieldValue(serializeConfig48ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0, "key");
        Object finalJSONSerializerConfigSerializersBuckets0Key6 = get(serializeConfig48ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key, 6);
        SerializeConfig serializeConfig49 = jSONSerializer.config;
        Object serializeConfig49ConfigSerializers = getFieldValue(serializeConfig49, "serializers");
        Object serializeConfig49ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig49ConfigSerializers, "buckets");
        Object serializeConfig49ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0 = get(serializeConfig49ConfigSerializersConfigSerializersBuckets, 0);
        Object serializeConfig49ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key = getFieldValue(serializeConfig49ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0, "key");
        Object finalJSONSerializerConfigSerializersBuckets0Key7 = get(serializeConfig49ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key, 7);
        SerializeConfig serializeConfig50 = jSONSerializer.config;
        Object serializeConfig50ConfigSerializers = getFieldValue(serializeConfig50, "serializers");
        Object serializeConfig50ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig50ConfigSerializers, "buckets");
        Object serializeConfig50ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0 = get(serializeConfig50ConfigSerializersConfigSerializersBuckets, 0);
        Object serializeConfig50ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key = getFieldValue(serializeConfig50ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0, "key");
        Object finalJSONSerializerConfigSerializersBuckets0Key8 = get(serializeConfig50ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key, 8);
        SerializeConfig serializeConfig51 = jSONSerializer.config;
        Object serializeConfig51ConfigSerializers = getFieldValue(serializeConfig51, "serializers");
        Object serializeConfig51ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig51ConfigSerializers, "buckets");
        Object serializeConfig51ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0 = get(serializeConfig51ConfigSerializersConfigSerializersBuckets, 0);
        Object serializeConfig51ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key = getFieldValue(serializeConfig51ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0, "key");
        Object finalJSONSerializerConfigSerializersBuckets0Key9 = get(serializeConfig51ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key, 9);
        SerializeConfig serializeConfig52 = jSONSerializer.config;
        Object serializeConfig52ConfigSerializers = getFieldValue(serializeConfig52, "serializers");
        Object serializeConfig52ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig52ConfigSerializers, "buckets");
        Object serializeConfig52ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0 = get(serializeConfig52ConfigSerializersConfigSerializersBuckets, 0);
        Object serializeConfig52ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key = getFieldValue(serializeConfig52ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0, "key");
        Object finalJSONSerializerConfigSerializersBuckets0Key10 = get(serializeConfig52ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key, 10);
        SerializeConfig serializeConfig53 = jSONSerializer.config;
        Object serializeConfig53ConfigSerializers = getFieldValue(serializeConfig53, "serializers");
        Object serializeConfig53ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig53ConfigSerializers, "buckets");
        Object serializeConfig53ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0 = get(serializeConfig53ConfigSerializersConfigSerializersBuckets, 0);
        Object serializeConfig53ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key = getFieldValue(serializeConfig53ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0, "key");
        Object finalJSONSerializerConfigSerializersBuckets0Key11 = get(serializeConfig53ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key, 11);
        SerializeConfig serializeConfig54 = jSONSerializer.config;
        Object serializeConfig54ConfigSerializers = getFieldValue(serializeConfig54, "serializers");
        Object serializeConfig54ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig54ConfigSerializers, "buckets");
        Object serializeConfig54ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0 = get(serializeConfig54ConfigSerializersConfigSerializersBuckets, 0);
        Object serializeConfig54ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key = getFieldValue(serializeConfig54ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0, "key");
        Object finalJSONSerializerConfigSerializersBuckets0Key12 = get(serializeConfig54ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key, 12);
        SerializeConfig serializeConfig55 = jSONSerializer.config;
        Object serializeConfig55ConfigSerializers = getFieldValue(serializeConfig55, "serializers");
        Object serializeConfig55ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig55ConfigSerializers, "buckets");
        Object serializeConfig55ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0 = get(serializeConfig55ConfigSerializersConfigSerializersBuckets, 0);
        Object serializeConfig55ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key = getFieldValue(serializeConfig55ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0, "key");
        Object finalJSONSerializerConfigSerializersBuckets0Key13 = get(serializeConfig55ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key, 13);
        SerializeConfig serializeConfig56 = jSONSerializer.config;
        Object serializeConfig56ConfigSerializers = getFieldValue(serializeConfig56, "serializers");
        Object serializeConfig56ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig56ConfigSerializers, "buckets");
        Object serializeConfig56ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0 = get(serializeConfig56ConfigSerializersConfigSerializersBuckets, 0);
        Object serializeConfig56ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key = getFieldValue(serializeConfig56ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0, "key");
        Object finalJSONSerializerConfigSerializersBuckets0Key14 = get(serializeConfig56ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key, 14);
        SerializeConfig serializeConfig57 = jSONSerializer.config;
        Object serializeConfig57ConfigSerializers = getFieldValue(serializeConfig57, "serializers");
        Object serializeConfig57ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig57ConfigSerializers, "buckets");
        Object serializeConfig57ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0 = get(serializeConfig57ConfigSerializersConfigSerializersBuckets, 0);
        Object serializeConfig57ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key = getFieldValue(serializeConfig57ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0, "key");
        Object finalJSONSerializerConfigSerializersBuckets0Key15 = get(serializeConfig57ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key, 15);
        SerializeConfig serializeConfig58 = jSONSerializer.config;
        Object serializeConfig58ConfigSerializers = getFieldValue(serializeConfig58, "serializers");
        Object serializeConfig58ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig58ConfigSerializers, "buckets");
        Object serializeConfig58ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0 = get(serializeConfig58ConfigSerializersConfigSerializersBuckets, 0);
        Object serializeConfig58ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key = getFieldValue(serializeConfig58ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0, "key");
        Object finalJSONSerializerConfigSerializersBuckets0Key16 = get(serializeConfig58ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key, 16);
        SerializeConfig serializeConfig59 = jSONSerializer.config;
        Object serializeConfig59ConfigSerializers = getFieldValue(serializeConfig59, "serializers");
        Object serializeConfig59ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig59ConfigSerializers, "buckets");
        Object serializeConfig59ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0 = get(serializeConfig59ConfigSerializersConfigSerializersBuckets, 0);
        Object serializeConfig59ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key = getFieldValue(serializeConfig59ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0, "key");
        Object finalJSONSerializerConfigSerializersBuckets0Key17 = get(serializeConfig59ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key, 17);
        SerializeConfig serializeConfig60 = jSONSerializer.config;
        Object serializeConfig60ConfigSerializers = getFieldValue(serializeConfig60, "serializers");
        Object serializeConfig60ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig60ConfigSerializers, "buckets");
        Object serializeConfig60ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0 = get(serializeConfig60ConfigSerializersConfigSerializersBuckets, 0);
        Object serializeConfig60ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key = getFieldValue(serializeConfig60ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0, "key");
        Object finalJSONSerializerConfigSerializersBuckets0Key18 = get(serializeConfig60ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key, 18);
        SerializeConfig serializeConfig61 = jSONSerializer.config;
        Object serializeConfig61ConfigSerializers = getFieldValue(serializeConfig61, "serializers");
        Object serializeConfig61ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig61ConfigSerializers, "buckets");
        Object serializeConfig61ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0 = get(serializeConfig61ConfigSerializersConfigSerializersBuckets, 0);
        Object serializeConfig61ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key = getFieldValue(serializeConfig61ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0, "key");
        Object finalJSONSerializerConfigSerializersBuckets0Key19 = get(serializeConfig61ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key, 19);
        SerializeConfig serializeConfig62 = jSONSerializer.config;
        Object serializeConfig62ConfigSerializers = getFieldValue(serializeConfig62, "serializers");
        Object serializeConfig62ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig62ConfigSerializers, "buckets");
        Object serializeConfig62ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0 = get(serializeConfig62ConfigSerializersConfigSerializersBuckets, 0);
        Object serializeConfig62ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key = getFieldValue(serializeConfig62ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0, "key");
        Object finalJSONSerializerConfigSerializersBuckets0Key20 = get(serializeConfig62ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key, 20);
        SerializeConfig serializeConfig63 = jSONSerializer.config;
        Object serializeConfig63ConfigSerializers = getFieldValue(serializeConfig63, "serializers");
        Object serializeConfig63ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig63ConfigSerializers, "buckets");
        Object serializeConfig63ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0 = get(serializeConfig63ConfigSerializersConfigSerializersBuckets, 0);
        Object serializeConfig63ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key = getFieldValue(serializeConfig63ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0, "key");
        Object finalJSONSerializerConfigSerializersBuckets0Key21 = get(serializeConfig63ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key, 21);
        SerializeConfig serializeConfig64 = jSONSerializer.config;
        Object serializeConfig64ConfigSerializers = getFieldValue(serializeConfig64, "serializers");
        Object serializeConfig64ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig64ConfigSerializers, "buckets");
        Object serializeConfig64ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0 = get(serializeConfig64ConfigSerializersConfigSerializersBuckets, 0);
        Object serializeConfig64ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key = getFieldValue(serializeConfig64ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0, "key");
        Object finalJSONSerializerConfigSerializersBuckets0Key22 = get(serializeConfig64ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key, 22);
        SerializeConfig serializeConfig65 = jSONSerializer.config;
        Object serializeConfig65ConfigSerializers = getFieldValue(serializeConfig65, "serializers");
        Object serializeConfig65ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig65ConfigSerializers, "buckets");
        Object serializeConfig65ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0 = get(serializeConfig65ConfigSerializersConfigSerializersBuckets, 0);
        Object serializeConfig65ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key = getFieldValue(serializeConfig65ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0, "key");
        Object finalJSONSerializerConfigSerializersBuckets0Key23 = get(serializeConfig65ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key, 23);
        SerializeConfig serializeConfig66 = jSONSerializer.config;
        Object serializeConfig66ConfigSerializers = getFieldValue(serializeConfig66, "serializers");
        Object serializeConfig66ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig66ConfigSerializers, "buckets");
        Object serializeConfig66ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0 = get(serializeConfig66ConfigSerializersConfigSerializersBuckets, 0);
        Object serializeConfig66ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key = getFieldValue(serializeConfig66ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0, "key");
        Object finalJSONSerializerConfigSerializersBuckets0Key24 = get(serializeConfig66ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key, 24);
        SerializeConfig serializeConfig67 = jSONSerializer.config;
        Object serializeConfig67ConfigSerializers = getFieldValue(serializeConfig67, "serializers");
        Object serializeConfig67ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig67ConfigSerializers, "buckets");
        Object serializeConfig67ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0 = get(serializeConfig67ConfigSerializersConfigSerializersBuckets, 0);
        Object serializeConfig67ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key = getFieldValue(serializeConfig67ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0, "key");
        Object finalJSONSerializerConfigSerializersBuckets0Key25 = get(serializeConfig67ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key, 25);
        SerializeConfig serializeConfig68 = jSONSerializer.config;
        Object serializeConfig68ConfigSerializers = getFieldValue(serializeConfig68, "serializers");
        Object serializeConfig68ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig68ConfigSerializers, "buckets");
        Object serializeConfig68ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0 = get(serializeConfig68ConfigSerializersConfigSerializersBuckets, 0);
        Object serializeConfig68ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key = getFieldValue(serializeConfig68ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0, "key");
        Object finalJSONSerializerConfigSerializersBuckets0Key26 = get(serializeConfig68ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key, 26);
        SerializeConfig serializeConfig69 = jSONSerializer.config;
        Object serializeConfig69ConfigSerializers = getFieldValue(serializeConfig69, "serializers");
        Object serializeConfig69ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig69ConfigSerializers, "buckets");
        Object serializeConfig69ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0 = get(serializeConfig69ConfigSerializersConfigSerializersBuckets, 0);
        Object serializeConfig69ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key = getFieldValue(serializeConfig69ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0, "key");
        Object finalJSONSerializerConfigSerializersBuckets0Key27 = get(serializeConfig69ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key, 27);
        SerializeConfig serializeConfig70 = jSONSerializer.config;
        Object serializeConfig70ConfigSerializers = getFieldValue(serializeConfig70, "serializers");
        Object serializeConfig70ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig70ConfigSerializers, "buckets");
        Object serializeConfig70ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0 = get(serializeConfig70ConfigSerializersConfigSerializersBuckets, 0);
        Object serializeConfig70ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key = getFieldValue(serializeConfig70ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0, "key");
        Object finalJSONSerializerConfigSerializersBuckets0Key28 = get(serializeConfig70ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key, 28);
        SerializeConfig serializeConfig71 = jSONSerializer.config;
        Object serializeConfig71ConfigSerializers = getFieldValue(serializeConfig71, "serializers");
        Object serializeConfig71ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig71ConfigSerializers, "buckets");
        Object serializeConfig71ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0 = get(serializeConfig71ConfigSerializersConfigSerializersBuckets, 0);
        Object serializeConfig71ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key = getFieldValue(serializeConfig71ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0, "key");
        Object finalJSONSerializerConfigSerializersBuckets0Key29 = get(serializeConfig71ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key, 29);
        SerializeConfig serializeConfig72 = jSONSerializer.config;
        Object serializeConfig72ConfigSerializers = getFieldValue(serializeConfig72, "serializers");
        Object serializeConfig72ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig72ConfigSerializers, "buckets");
        Object serializeConfig72ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0 = get(serializeConfig72ConfigSerializersConfigSerializersBuckets, 0);
        Object serializeConfig72ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key = getFieldValue(serializeConfig72ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0, "key");
        Object finalJSONSerializerConfigSerializersBuckets0Key30 = get(serializeConfig72ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key, 30);
        SerializeConfig serializeConfig73 = jSONSerializer.config;
        Object serializeConfig73ConfigSerializers = getFieldValue(serializeConfig73, "serializers");
        Object serializeConfig73ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig73ConfigSerializers, "buckets");
        Object serializeConfig73ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0 = get(serializeConfig73ConfigSerializersConfigSerializersBuckets, 0);
        Object serializeConfig73ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key = getFieldValue(serializeConfig73ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0, "key");
        Object finalJSONSerializerConfigSerializersBuckets0Key31 = get(serializeConfig73ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key, 31);
        SerializeConfig serializeConfig74 = jSONSerializer.config;
        Object serializeConfig74ConfigSerializers = getFieldValue(serializeConfig74, "serializers");
        Object serializeConfig74ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig74ConfigSerializers, "buckets");
        Object serializeConfig74ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0 = get(serializeConfig74ConfigSerializersConfigSerializersBuckets, 0);
        Object serializeConfig74ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key = getFieldValue(serializeConfig74ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0, "key");
        Object finalJSONSerializerConfigSerializersBuckets0Key32 = get(serializeConfig74ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key, 32);
        SerializeConfig serializeConfig75 = jSONSerializer.config;
        Object serializeConfig75ConfigSerializers = getFieldValue(serializeConfig75, "serializers");
        Object serializeConfig75ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig75ConfigSerializers, "buckets");
        Object serializeConfig75ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0 = get(serializeConfig75ConfigSerializersConfigSerializersBuckets, 0);
        Object serializeConfig75ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key = getFieldValue(serializeConfig75ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0, "key");
        Object finalJSONSerializerConfigSerializersBuckets0Key33 = get(serializeConfig75ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key, 33);
        SerializeConfig serializeConfig76 = jSONSerializer.config;
        Object serializeConfig76ConfigSerializers = getFieldValue(serializeConfig76, "serializers");
        Object serializeConfig76ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig76ConfigSerializers, "buckets");
        Object serializeConfig76ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0 = get(serializeConfig76ConfigSerializersConfigSerializersBuckets, 0);
        Object serializeConfig76ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key = getFieldValue(serializeConfig76ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0, "key");
        Object finalJSONSerializerConfigSerializersBuckets0Key34 = get(serializeConfig76ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key, 34);
        SerializeConfig serializeConfig77 = jSONSerializer.config;
        Object serializeConfig77ConfigSerializers = getFieldValue(serializeConfig77, "serializers");
        Object serializeConfig77ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig77ConfigSerializers, "buckets");
        Object serializeConfig77ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0 = get(serializeConfig77ConfigSerializersConfigSerializersBuckets, 0);
        Object serializeConfig77ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key = getFieldValue(serializeConfig77ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0, "key");
        Object finalJSONSerializerConfigSerializersBuckets0Key35 = get(serializeConfig77ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key, 35);
        SerializeConfig serializeConfig78 = jSONSerializer.config;
        Object serializeConfig78ConfigSerializers = getFieldValue(serializeConfig78, "serializers");
        Object serializeConfig78ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig78ConfigSerializers, "buckets");
        Object serializeConfig78ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0 = get(serializeConfig78ConfigSerializersConfigSerializersBuckets, 0);
        Object serializeConfig78ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key = getFieldValue(serializeConfig78ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0, "key");
        Object finalJSONSerializerConfigSerializersBuckets0Key36 = get(serializeConfig78ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key, 36);
        SerializeConfig serializeConfig79 = jSONSerializer.config;
        Object serializeConfig79ConfigSerializers = getFieldValue(serializeConfig79, "serializers");
        Object serializeConfig79ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig79ConfigSerializers, "buckets");
        Object serializeConfig79ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0 = get(serializeConfig79ConfigSerializersConfigSerializersBuckets, 0);
        Object serializeConfig79ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key = getFieldValue(serializeConfig79ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0, "key");
        Object finalJSONSerializerConfigSerializersBuckets0Key37 = get(serializeConfig79ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key, 37);
        SerializeConfig serializeConfig80 = jSONSerializer.config;
        Object serializeConfig80ConfigSerializers = getFieldValue(serializeConfig80, "serializers");
        Object serializeConfig80ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig80ConfigSerializers, "buckets");
        Object serializeConfig80ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0 = get(serializeConfig80ConfigSerializersConfigSerializersBuckets, 0);
        Object serializeConfig80ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key = getFieldValue(serializeConfig80ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0, "key");
        Object finalJSONSerializerConfigSerializersBuckets0Key38 = get(serializeConfig80ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0ConfigSerializersBuckets0Key, 38);
        
        assertFalse(initialJSONSerializerConfigSerializersBuckets0NextValue == finalJSONSerializerConfigSerializersBuckets0NextValue);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets0Key0);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets0Key1);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets0Key2);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets0Key3);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets0Key4);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets0Key5);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets0Key6);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets0Key7);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets0Key8);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets0Key9);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets0Key10);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets0Key11);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets0Key12);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets0Key13);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets0Key14);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets0Key15);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets0Key16);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets0Key17);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets0Key18);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets0Key19);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets0Key20);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets0Key21);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets0Key22);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets0Key23);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets0Key24);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets0Key25);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets0Key26);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets0Key27);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets0Key28);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets0Key29);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets0Key30);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets0Key31);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets0Key32);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets0Key33);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets0Key34);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets0Key35);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets0Key36);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets0Key37);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets0Key38);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetObjectWriter3() throws Throwable  {
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        SerializeConfig serializeConfig = ((SerializeConfig) createInstance("com.alibaba.fastjson.serializer.SerializeConfig"));
        com.alibaba.fastjson.util.IdentityHashMap identityHashMap = ((com.alibaba.fastjson.util.IdentityHashMap) createInstance("com.alibaba.fastjson.util.IdentityHashMap"));
        setField(identityHashMap, "indexMask", 38);
        java.lang.Object[] entryArray = createArray("com.alibaba.fastjson.util.IdentityHashMap$Entry", 39);
        setField(identityHashMap, "buckets", entryArray);
        setField(serializeConfig, "serializers", identityHashMap);
        setField(jSONSerializer, "config", serializeConfig);
        Class class1 = Object.class;
        
        SerializeConfig serializeConfig1 = jSONSerializer.config;
        Object serializeConfig1ConfigSerializers = getFieldValue(serializeConfig1, "serializers");
        Object serializeConfig1ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig1ConfigSerializers, "buckets");
        Object initialJSONSerializerConfigSerializersBuckets0 = get(serializeConfig1ConfigSerializersConfigSerializersBuckets, 0);
        SerializeConfig serializeConfig2 = jSONSerializer.config;
        Object serializeConfig2ConfigSerializers = getFieldValue(serializeConfig2, "serializers");
        Object serializeConfig2ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig2ConfigSerializers, "buckets");
        Object initialJSONSerializerConfigSerializersBuckets1 = get(serializeConfig2ConfigSerializersConfigSerializersBuckets, 1);
        SerializeConfig serializeConfig3 = jSONSerializer.config;
        Object serializeConfig3ConfigSerializers = getFieldValue(serializeConfig3, "serializers");
        Object serializeConfig3ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig3ConfigSerializers, "buckets");
        Object initialJSONSerializerConfigSerializersBuckets2 = get(serializeConfig3ConfigSerializersConfigSerializersBuckets, 2);
        SerializeConfig serializeConfig4 = jSONSerializer.config;
        Object serializeConfig4ConfigSerializers = getFieldValue(serializeConfig4, "serializers");
        Object serializeConfig4ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig4ConfigSerializers, "buckets");
        Object initialJSONSerializerConfigSerializersBuckets3 = get(serializeConfig4ConfigSerializersConfigSerializersBuckets, 3);
        SerializeConfig serializeConfig5 = jSONSerializer.config;
        Object serializeConfig5ConfigSerializers = getFieldValue(serializeConfig5, "serializers");
        Object serializeConfig5ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig5ConfigSerializers, "buckets");
        Object initialJSONSerializerConfigSerializersBuckets4 = get(serializeConfig5ConfigSerializersConfigSerializersBuckets, 4);
        SerializeConfig serializeConfig6 = jSONSerializer.config;
        Object serializeConfig6ConfigSerializers = getFieldValue(serializeConfig6, "serializers");
        Object serializeConfig6ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig6ConfigSerializers, "buckets");
        Object initialJSONSerializerConfigSerializersBuckets5 = get(serializeConfig6ConfigSerializersConfigSerializersBuckets, 5);
        SerializeConfig serializeConfig7 = jSONSerializer.config;
        Object serializeConfig7ConfigSerializers = getFieldValue(serializeConfig7, "serializers");
        Object serializeConfig7ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig7ConfigSerializers, "buckets");
        Object initialJSONSerializerConfigSerializersBuckets6 = get(serializeConfig7ConfigSerializersConfigSerializersBuckets, 6);
        SerializeConfig serializeConfig8 = jSONSerializer.config;
        Object serializeConfig8ConfigSerializers = getFieldValue(serializeConfig8, "serializers");
        Object serializeConfig8ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig8ConfigSerializers, "buckets");
        Object initialJSONSerializerConfigSerializersBuckets7 = get(serializeConfig8ConfigSerializersConfigSerializersBuckets, 7);
        SerializeConfig serializeConfig9 = jSONSerializer.config;
        Object serializeConfig9ConfigSerializers = getFieldValue(serializeConfig9, "serializers");
        Object serializeConfig9ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig9ConfigSerializers, "buckets");
        Object initialJSONSerializerConfigSerializersBuckets8 = get(serializeConfig9ConfigSerializersConfigSerializersBuckets, 8);
        SerializeConfig serializeConfig10 = jSONSerializer.config;
        Object serializeConfig10ConfigSerializers = getFieldValue(serializeConfig10, "serializers");
        Object serializeConfig10ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig10ConfigSerializers, "buckets");
        Object initialJSONSerializerConfigSerializersBuckets9 = get(serializeConfig10ConfigSerializersConfigSerializersBuckets, 9);
        SerializeConfig serializeConfig11 = jSONSerializer.config;
        Object serializeConfig11ConfigSerializers = getFieldValue(serializeConfig11, "serializers");
        Object serializeConfig11ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig11ConfigSerializers, "buckets");
        Object initialJSONSerializerConfigSerializersBuckets10 = get(serializeConfig11ConfigSerializersConfigSerializersBuckets, 10);
        SerializeConfig serializeConfig12 = jSONSerializer.config;
        Object serializeConfig12ConfigSerializers = getFieldValue(serializeConfig12, "serializers");
        Object serializeConfig12ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig12ConfigSerializers, "buckets");
        Object initialJSONSerializerConfigSerializersBuckets11 = get(serializeConfig12ConfigSerializersConfigSerializersBuckets, 11);
        SerializeConfig serializeConfig13 = jSONSerializer.config;
        Object serializeConfig13ConfigSerializers = getFieldValue(serializeConfig13, "serializers");
        Object serializeConfig13ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig13ConfigSerializers, "buckets");
        Object initialJSONSerializerConfigSerializersBuckets12 = get(serializeConfig13ConfigSerializersConfigSerializersBuckets, 12);
        SerializeConfig serializeConfig14 = jSONSerializer.config;
        Object serializeConfig14ConfigSerializers = getFieldValue(serializeConfig14, "serializers");
        Object serializeConfig14ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig14ConfigSerializers, "buckets");
        Object initialJSONSerializerConfigSerializersBuckets13 = get(serializeConfig14ConfigSerializersConfigSerializersBuckets, 13);
        SerializeConfig serializeConfig15 = jSONSerializer.config;
        Object serializeConfig15ConfigSerializers = getFieldValue(serializeConfig15, "serializers");
        Object serializeConfig15ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig15ConfigSerializers, "buckets");
        Object initialJSONSerializerConfigSerializersBuckets14 = get(serializeConfig15ConfigSerializersConfigSerializersBuckets, 14);
        SerializeConfig serializeConfig16 = jSONSerializer.config;
        Object serializeConfig16ConfigSerializers = getFieldValue(serializeConfig16, "serializers");
        Object serializeConfig16ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig16ConfigSerializers, "buckets");
        Object initialJSONSerializerConfigSerializersBuckets15 = get(serializeConfig16ConfigSerializersConfigSerializersBuckets, 15);
        SerializeConfig serializeConfig17 = jSONSerializer.config;
        Object serializeConfig17ConfigSerializers = getFieldValue(serializeConfig17, "serializers");
        Object serializeConfig17ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig17ConfigSerializers, "buckets");
        Object initialJSONSerializerConfigSerializersBuckets16 = get(serializeConfig17ConfigSerializersConfigSerializersBuckets, 16);
        SerializeConfig serializeConfig18 = jSONSerializer.config;
        Object serializeConfig18ConfigSerializers = getFieldValue(serializeConfig18, "serializers");
        Object serializeConfig18ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig18ConfigSerializers, "buckets");
        Object initialJSONSerializerConfigSerializersBuckets17 = get(serializeConfig18ConfigSerializersConfigSerializersBuckets, 17);
        SerializeConfig serializeConfig19 = jSONSerializer.config;
        Object serializeConfig19ConfigSerializers = getFieldValue(serializeConfig19, "serializers");
        Object serializeConfig19ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig19ConfigSerializers, "buckets");
        Object initialJSONSerializerConfigSerializersBuckets18 = get(serializeConfig19ConfigSerializersConfigSerializersBuckets, 18);
        SerializeConfig serializeConfig20 = jSONSerializer.config;
        Object serializeConfig20ConfigSerializers = getFieldValue(serializeConfig20, "serializers");
        Object serializeConfig20ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig20ConfigSerializers, "buckets");
        Object initialJSONSerializerConfigSerializersBuckets19 = get(serializeConfig20ConfigSerializersConfigSerializersBuckets, 19);
        SerializeConfig serializeConfig21 = jSONSerializer.config;
        Object serializeConfig21ConfigSerializers = getFieldValue(serializeConfig21, "serializers");
        Object serializeConfig21ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig21ConfigSerializers, "buckets");
        Object initialJSONSerializerConfigSerializersBuckets20 = get(serializeConfig21ConfigSerializersConfigSerializersBuckets, 20);
        SerializeConfig serializeConfig22 = jSONSerializer.config;
        Object serializeConfig22ConfigSerializers = getFieldValue(serializeConfig22, "serializers");
        Object serializeConfig22ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig22ConfigSerializers, "buckets");
        Object initialJSONSerializerConfigSerializersBuckets21 = get(serializeConfig22ConfigSerializersConfigSerializersBuckets, 21);
        SerializeConfig serializeConfig23 = jSONSerializer.config;
        Object serializeConfig23ConfigSerializers = getFieldValue(serializeConfig23, "serializers");
        Object serializeConfig23ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig23ConfigSerializers, "buckets");
        Object initialJSONSerializerConfigSerializersBuckets22 = get(serializeConfig23ConfigSerializersConfigSerializersBuckets, 22);
        SerializeConfig serializeConfig24 = jSONSerializer.config;
        Object serializeConfig24ConfigSerializers = getFieldValue(serializeConfig24, "serializers");
        Object serializeConfig24ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig24ConfigSerializers, "buckets");
        Object initialJSONSerializerConfigSerializersBuckets23 = get(serializeConfig24ConfigSerializersConfigSerializersBuckets, 23);
        SerializeConfig serializeConfig25 = jSONSerializer.config;
        Object serializeConfig25ConfigSerializers = getFieldValue(serializeConfig25, "serializers");
        Object serializeConfig25ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig25ConfigSerializers, "buckets");
        Object initialJSONSerializerConfigSerializersBuckets24 = get(serializeConfig25ConfigSerializersConfigSerializersBuckets, 24);
        SerializeConfig serializeConfig26 = jSONSerializer.config;
        Object serializeConfig26ConfigSerializers = getFieldValue(serializeConfig26, "serializers");
        Object serializeConfig26ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig26ConfigSerializers, "buckets");
        Object initialJSONSerializerConfigSerializersBuckets25 = get(serializeConfig26ConfigSerializersConfigSerializersBuckets, 25);
        SerializeConfig serializeConfig27 = jSONSerializer.config;
        Object serializeConfig27ConfigSerializers = getFieldValue(serializeConfig27, "serializers");
        Object serializeConfig27ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig27ConfigSerializers, "buckets");
        Object initialJSONSerializerConfigSerializersBuckets26 = get(serializeConfig27ConfigSerializersConfigSerializersBuckets, 26);
        SerializeConfig serializeConfig28 = jSONSerializer.config;
        Object serializeConfig28ConfigSerializers = getFieldValue(serializeConfig28, "serializers");
        Object serializeConfig28ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig28ConfigSerializers, "buckets");
        Object initialJSONSerializerConfigSerializersBuckets27 = get(serializeConfig28ConfigSerializersConfigSerializersBuckets, 27);
        SerializeConfig serializeConfig29 = jSONSerializer.config;
        Object serializeConfig29ConfigSerializers = getFieldValue(serializeConfig29, "serializers");
        Object serializeConfig29ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig29ConfigSerializers, "buckets");
        Object initialJSONSerializerConfigSerializersBuckets28 = get(serializeConfig29ConfigSerializersConfigSerializersBuckets, 28);
        SerializeConfig serializeConfig30 = jSONSerializer.config;
        Object serializeConfig30ConfigSerializers = getFieldValue(serializeConfig30, "serializers");
        Object serializeConfig30ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig30ConfigSerializers, "buckets");
        Object initialJSONSerializerConfigSerializersBuckets29 = get(serializeConfig30ConfigSerializersConfigSerializersBuckets, 29);
        SerializeConfig serializeConfig31 = jSONSerializer.config;
        Object serializeConfig31ConfigSerializers = getFieldValue(serializeConfig31, "serializers");
        Object serializeConfig31ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig31ConfigSerializers, "buckets");
        Object initialJSONSerializerConfigSerializersBuckets30 = get(serializeConfig31ConfigSerializersConfigSerializersBuckets, 30);
        SerializeConfig serializeConfig32 = jSONSerializer.config;
        Object serializeConfig32ConfigSerializers = getFieldValue(serializeConfig32, "serializers");
        Object serializeConfig32ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig32ConfigSerializers, "buckets");
        Object initialJSONSerializerConfigSerializersBuckets31 = get(serializeConfig32ConfigSerializersConfigSerializersBuckets, 31);
        SerializeConfig serializeConfig33 = jSONSerializer.config;
        Object serializeConfig33ConfigSerializers = getFieldValue(serializeConfig33, "serializers");
        Object serializeConfig33ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig33ConfigSerializers, "buckets");
        Object initialJSONSerializerConfigSerializersBuckets32 = get(serializeConfig33ConfigSerializersConfigSerializersBuckets, 32);
        SerializeConfig serializeConfig34 = jSONSerializer.config;
        Object serializeConfig34ConfigSerializers = getFieldValue(serializeConfig34, "serializers");
        Object serializeConfig34ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig34ConfigSerializers, "buckets");
        Object initialJSONSerializerConfigSerializersBuckets33 = get(serializeConfig34ConfigSerializersConfigSerializersBuckets, 33);
        SerializeConfig serializeConfig35 = jSONSerializer.config;
        Object serializeConfig35ConfigSerializers = getFieldValue(serializeConfig35, "serializers");
        Object serializeConfig35ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig35ConfigSerializers, "buckets");
        Object initialJSONSerializerConfigSerializersBuckets34 = get(serializeConfig35ConfigSerializersConfigSerializersBuckets, 34);
        SerializeConfig serializeConfig36 = jSONSerializer.config;
        Object serializeConfig36ConfigSerializers = getFieldValue(serializeConfig36, "serializers");
        Object serializeConfig36ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig36ConfigSerializers, "buckets");
        Object initialJSONSerializerConfigSerializersBuckets35 = get(serializeConfig36ConfigSerializersConfigSerializersBuckets, 35);
        SerializeConfig serializeConfig37 = jSONSerializer.config;
        Object serializeConfig37ConfigSerializers = getFieldValue(serializeConfig37, "serializers");
        Object serializeConfig37ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig37ConfigSerializers, "buckets");
        Object initialJSONSerializerConfigSerializersBuckets36 = get(serializeConfig37ConfigSerializersConfigSerializersBuckets, 36);
        SerializeConfig serializeConfig38 = jSONSerializer.config;
        Object serializeConfig38ConfigSerializers = getFieldValue(serializeConfig38, "serializers");
        Object serializeConfig38ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig38ConfigSerializers, "buckets");
        Object initialJSONSerializerConfigSerializersBuckets37 = get(serializeConfig38ConfigSerializersConfigSerializersBuckets, 37);
        SerializeConfig serializeConfig39 = jSONSerializer.config;
        Object serializeConfig39ConfigSerializers = getFieldValue(serializeConfig39, "serializers");
        Object serializeConfig39ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig39ConfigSerializers, "buckets");
        Object initialJSONSerializerConfigSerializersBuckets38 = get(serializeConfig39ConfigSerializersConfigSerializersBuckets, 38);
        
        ObjectSerializer actual = jSONSerializer.getObjectWriter(class1);
        
        JavaBeanSerializer expected = ((JavaBeanSerializer) createInstance("com.alibaba.fastjson.serializer.JavaBeanSerializer"));
        com.alibaba.fastjson.serializer.FieldSerializer[] fieldSerializerArray = new com.alibaba.fastjson.serializer.FieldSerializer[0];
        setField(expected, "getters", fieldSerializerArray);
        setField(expected, "sortedGetters", fieldSerializerArray);
        SerializeBeanInfo serializeBeanInfo = ((SerializeBeanInfo) createInstance("com.alibaba.fastjson.serializer.SerializeBeanInfo"));
        setField(serializeBeanInfo, "beanType", class1);
        setField(serializeBeanInfo, "typeName", null);
        setField(serializeBeanInfo, "typeKey", null);
        setField(serializeBeanInfo, "jsonType", null);
        com.alibaba.fastjson.util.FieldInfo[] fieldInfoArray = new com.alibaba.fastjson.util.FieldInfo[0];
        setField(serializeBeanInfo, "fields", fieldInfoArray);
        setField(serializeBeanInfo, "sortedFields", fieldInfoArray);
        serializeBeanInfo.features = 0;
        expected.beanInfo = serializeBeanInfo;
        setField(expected, "hashArray", null);
        setField(expected, "hashArrayMapping", null);
        setField(expected, "beforeFilters", null);
        setField(expected, "afterFilters", null);
        setField(expected, "propertyFilters", null);
        setField(expected, "valueFilters", null);
        setField(expected, "nameFilters", null);
        setField(expected, "propertyPreFilters", null);
        setField(expected, "labelFilters", null);
        setField(expected, "contextValueFilters", null);
        expected.writeDirect = true;
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
        
        SerializeConfig serializeConfig40 = jSONSerializer.config;
        Object serializeConfig40ConfigSerializers = getFieldValue(serializeConfig40, "serializers");
        Object serializeConfig40ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig40ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets0 = get(serializeConfig40ConfigSerializersConfigSerializersBuckets, 0);
        SerializeConfig serializeConfig41 = jSONSerializer.config;
        Object serializeConfig41ConfigSerializers = getFieldValue(serializeConfig41, "serializers");
        Object serializeConfig41ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig41ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets1 = get(serializeConfig41ConfigSerializersConfigSerializersBuckets, 1);
        SerializeConfig serializeConfig42 = jSONSerializer.config;
        Object serializeConfig42ConfigSerializers = getFieldValue(serializeConfig42, "serializers");
        Object serializeConfig42ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig42ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets2 = get(serializeConfig42ConfigSerializersConfigSerializersBuckets, 2);
        SerializeConfig serializeConfig43 = jSONSerializer.config;
        Object serializeConfig43ConfigSerializers = getFieldValue(serializeConfig43, "serializers");
        Object serializeConfig43ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig43ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets3 = get(serializeConfig43ConfigSerializersConfigSerializersBuckets, 3);
        SerializeConfig serializeConfig44 = jSONSerializer.config;
        Object serializeConfig44ConfigSerializers = getFieldValue(serializeConfig44, "serializers");
        Object serializeConfig44ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig44ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets4 = get(serializeConfig44ConfigSerializersConfigSerializersBuckets, 4);
        SerializeConfig serializeConfig45 = jSONSerializer.config;
        Object serializeConfig45ConfigSerializers = getFieldValue(serializeConfig45, "serializers");
        Object serializeConfig45ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig45ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets5 = get(serializeConfig45ConfigSerializersConfigSerializersBuckets, 5);
        SerializeConfig serializeConfig46 = jSONSerializer.config;
        Object serializeConfig46ConfigSerializers = getFieldValue(serializeConfig46, "serializers");
        Object serializeConfig46ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig46ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets6 = get(serializeConfig46ConfigSerializersConfigSerializersBuckets, 6);
        SerializeConfig serializeConfig47 = jSONSerializer.config;
        Object serializeConfig47ConfigSerializers = getFieldValue(serializeConfig47, "serializers");
        Object serializeConfig47ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig47ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets7 = get(serializeConfig47ConfigSerializersConfigSerializersBuckets, 7);
        SerializeConfig serializeConfig48 = jSONSerializer.config;
        Object serializeConfig48ConfigSerializers = getFieldValue(serializeConfig48, "serializers");
        Object serializeConfig48ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig48ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets8 = get(serializeConfig48ConfigSerializersConfigSerializersBuckets, 8);
        SerializeConfig serializeConfig49 = jSONSerializer.config;
        Object serializeConfig49ConfigSerializers = getFieldValue(serializeConfig49, "serializers");
        Object serializeConfig49ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig49ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets9 = get(serializeConfig49ConfigSerializersConfigSerializersBuckets, 9);
        SerializeConfig serializeConfig50 = jSONSerializer.config;
        Object serializeConfig50ConfigSerializers = getFieldValue(serializeConfig50, "serializers");
        Object serializeConfig50ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig50ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets10 = get(serializeConfig50ConfigSerializersConfigSerializersBuckets, 10);
        SerializeConfig serializeConfig51 = jSONSerializer.config;
        Object serializeConfig51ConfigSerializers = getFieldValue(serializeConfig51, "serializers");
        Object serializeConfig51ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig51ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets11 = get(serializeConfig51ConfigSerializersConfigSerializersBuckets, 11);
        SerializeConfig serializeConfig52 = jSONSerializer.config;
        Object serializeConfig52ConfigSerializers = getFieldValue(serializeConfig52, "serializers");
        Object serializeConfig52ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig52ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets12 = get(serializeConfig52ConfigSerializersConfigSerializersBuckets, 12);
        SerializeConfig serializeConfig53 = jSONSerializer.config;
        Object serializeConfig53ConfigSerializers = getFieldValue(serializeConfig53, "serializers");
        Object serializeConfig53ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig53ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets13 = get(serializeConfig53ConfigSerializersConfigSerializersBuckets, 13);
        SerializeConfig serializeConfig54 = jSONSerializer.config;
        Object serializeConfig54ConfigSerializers = getFieldValue(serializeConfig54, "serializers");
        Object serializeConfig54ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig54ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets14 = get(serializeConfig54ConfigSerializersConfigSerializersBuckets, 14);
        SerializeConfig serializeConfig55 = jSONSerializer.config;
        Object serializeConfig55ConfigSerializers = getFieldValue(serializeConfig55, "serializers");
        Object serializeConfig55ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig55ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets15 = get(serializeConfig55ConfigSerializersConfigSerializersBuckets, 15);
        SerializeConfig serializeConfig56 = jSONSerializer.config;
        Object serializeConfig56ConfigSerializers = getFieldValue(serializeConfig56, "serializers");
        Object serializeConfig56ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig56ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets16 = get(serializeConfig56ConfigSerializersConfigSerializersBuckets, 16);
        SerializeConfig serializeConfig57 = jSONSerializer.config;
        Object serializeConfig57ConfigSerializers = getFieldValue(serializeConfig57, "serializers");
        Object serializeConfig57ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig57ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets17 = get(serializeConfig57ConfigSerializersConfigSerializersBuckets, 17);
        SerializeConfig serializeConfig58 = jSONSerializer.config;
        Object serializeConfig58ConfigSerializers = getFieldValue(serializeConfig58, "serializers");
        Object serializeConfig58ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig58ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets18 = get(serializeConfig58ConfigSerializersConfigSerializersBuckets, 18);
        SerializeConfig serializeConfig59 = jSONSerializer.config;
        Object serializeConfig59ConfigSerializers = getFieldValue(serializeConfig59, "serializers");
        Object serializeConfig59ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig59ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets19 = get(serializeConfig59ConfigSerializersConfigSerializersBuckets, 19);
        SerializeConfig serializeConfig60 = jSONSerializer.config;
        Object serializeConfig60ConfigSerializers = getFieldValue(serializeConfig60, "serializers");
        Object serializeConfig60ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig60ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets20 = get(serializeConfig60ConfigSerializersConfigSerializersBuckets, 20);
        SerializeConfig serializeConfig61 = jSONSerializer.config;
        Object serializeConfig61ConfigSerializers = getFieldValue(serializeConfig61, "serializers");
        Object serializeConfig61ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig61ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets21 = get(serializeConfig61ConfigSerializersConfigSerializersBuckets, 21);
        SerializeConfig serializeConfig62 = jSONSerializer.config;
        Object serializeConfig62ConfigSerializers = getFieldValue(serializeConfig62, "serializers");
        Object serializeConfig62ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig62ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets22 = get(serializeConfig62ConfigSerializersConfigSerializersBuckets, 22);
        SerializeConfig serializeConfig63 = jSONSerializer.config;
        Object serializeConfig63ConfigSerializers = getFieldValue(serializeConfig63, "serializers");
        Object serializeConfig63ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig63ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets23 = get(serializeConfig63ConfigSerializersConfigSerializersBuckets, 23);
        SerializeConfig serializeConfig64 = jSONSerializer.config;
        Object serializeConfig64ConfigSerializers = getFieldValue(serializeConfig64, "serializers");
        Object serializeConfig64ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig64ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets24 = get(serializeConfig64ConfigSerializersConfigSerializersBuckets, 24);
        SerializeConfig serializeConfig65 = jSONSerializer.config;
        Object serializeConfig65ConfigSerializers = getFieldValue(serializeConfig65, "serializers");
        Object serializeConfig65ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig65ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets25 = get(serializeConfig65ConfigSerializersConfigSerializersBuckets, 25);
        SerializeConfig serializeConfig66 = jSONSerializer.config;
        Object serializeConfig66ConfigSerializers = getFieldValue(serializeConfig66, "serializers");
        Object serializeConfig66ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig66ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets26 = get(serializeConfig66ConfigSerializersConfigSerializersBuckets, 26);
        SerializeConfig serializeConfig67 = jSONSerializer.config;
        Object serializeConfig67ConfigSerializers = getFieldValue(serializeConfig67, "serializers");
        Object serializeConfig67ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig67ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets27 = get(serializeConfig67ConfigSerializersConfigSerializersBuckets, 27);
        SerializeConfig serializeConfig68 = jSONSerializer.config;
        Object serializeConfig68ConfigSerializers = getFieldValue(serializeConfig68, "serializers");
        Object serializeConfig68ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig68ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets28 = get(serializeConfig68ConfigSerializersConfigSerializersBuckets, 28);
        SerializeConfig serializeConfig69 = jSONSerializer.config;
        Object serializeConfig69ConfigSerializers = getFieldValue(serializeConfig69, "serializers");
        Object serializeConfig69ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig69ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets29 = get(serializeConfig69ConfigSerializersConfigSerializersBuckets, 29);
        SerializeConfig serializeConfig70 = jSONSerializer.config;
        Object serializeConfig70ConfigSerializers = getFieldValue(serializeConfig70, "serializers");
        Object serializeConfig70ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig70ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets30 = get(serializeConfig70ConfigSerializersConfigSerializersBuckets, 30);
        SerializeConfig serializeConfig71 = jSONSerializer.config;
        Object serializeConfig71ConfigSerializers = getFieldValue(serializeConfig71, "serializers");
        Object serializeConfig71ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig71ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets31 = get(serializeConfig71ConfigSerializersConfigSerializersBuckets, 31);
        SerializeConfig serializeConfig72 = jSONSerializer.config;
        Object serializeConfig72ConfigSerializers = getFieldValue(serializeConfig72, "serializers");
        Object serializeConfig72ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig72ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets32 = get(serializeConfig72ConfigSerializersConfigSerializersBuckets, 32);
        SerializeConfig serializeConfig73 = jSONSerializer.config;
        Object serializeConfig73ConfigSerializers = getFieldValue(serializeConfig73, "serializers");
        Object serializeConfig73ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig73ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets33 = get(serializeConfig73ConfigSerializersConfigSerializersBuckets, 33);
        SerializeConfig serializeConfig74 = jSONSerializer.config;
        Object serializeConfig74ConfigSerializers = getFieldValue(serializeConfig74, "serializers");
        Object serializeConfig74ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig74ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets34 = get(serializeConfig74ConfigSerializersConfigSerializersBuckets, 34);
        SerializeConfig serializeConfig75 = jSONSerializer.config;
        Object serializeConfig75ConfigSerializers = getFieldValue(serializeConfig75, "serializers");
        Object serializeConfig75ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig75ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets35 = get(serializeConfig75ConfigSerializersConfigSerializersBuckets, 35);
        SerializeConfig serializeConfig76 = jSONSerializer.config;
        Object serializeConfig76ConfigSerializers = getFieldValue(serializeConfig76, "serializers");
        Object serializeConfig76ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig76ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets36 = get(serializeConfig76ConfigSerializersConfigSerializersBuckets, 36);
        SerializeConfig serializeConfig77 = jSONSerializer.config;
        Object serializeConfig77ConfigSerializers = getFieldValue(serializeConfig77, "serializers");
        Object serializeConfig77ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig77ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets37 = get(serializeConfig77ConfigSerializersConfigSerializersBuckets, 37);
        SerializeConfig serializeConfig78 = jSONSerializer.config;
        Object serializeConfig78ConfigSerializers = getFieldValue(serializeConfig78, "serializers");
        Object serializeConfig78ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig78ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets38 = get(serializeConfig78ConfigSerializersConfigSerializersBuckets, 38);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets0);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets1);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets2);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets3);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets4);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets5);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets6);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets7);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets8);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets9);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets10);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets11);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets12);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets13);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets14);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets15);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets16);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets17);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets18);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets19);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets20);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets21);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets22);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets23);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets24);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets25);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets26);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets27);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets28);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets29);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets30);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets31);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets32);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets33);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets34);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets35);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets36);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets37);
        
        assertFalse(initialJSONSerializerConfigSerializersBuckets38 == finalJSONSerializerConfigSerializersBuckets38);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testPrintln1() throws Throwable  {
        JSONSerializer jSONSerializer = new JSONSerializer();
        
        jSONSerializer.println();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testPrintln2() throws Throwable  {
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        setField(jSONSerializer, "indentCount", -2145386496);
        SerializeWriter serializeWriter = ((SerializeWriter) createInstance("com.alibaba.fastjson.serializer.SerializeWriter"));
        serializeWriter.count = 0;
        char[] charArray = new char[33];
        serializeWriter.buf = charArray;
        setField(jSONSerializer, "out", serializeWriter);
        
        jSONSerializer.println();
        
        int finalJSONSerializerOutCount = jSONSerializer.out.count;
        char finalJSONSerializerOutBuf0 = jSONSerializer.out.buf[0];
        
        assertEquals(1, finalJSONSerializerOutCount);
        
        assertEquals('\n', finalJSONSerializerOutBuf0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testPrintln3() throws Throwable  {
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        SerializeWriter serializeWriter = ((SerializeWriter) createInstance("com.alibaba.fastjson.serializer.SerializeWriter"));
        setField(serializeWriter, "lock", null);
        OutputStreamWriter outputStreamWriter = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        setField(outputStreamWriter, "lock", null);
        StreamEncoder streamEncoder = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(streamEncoder, "lock", null);
        setField(streamEncoder, "isOpen", false);
        setField(outputStreamWriter, "se", streamEncoder);
        setField(serializeWriter, "writer", outputStreamWriter);
        serializeWriter.count = 2147352576;
        char[] charArray = new char[0];
        serializeWriter.buf = charArray;
        setField(jSONSerializer, "out", serializeWriter);
        
        SerializeWriter serializeWriter1 = jSONSerializer.out;
        Object initialJSONSerializerOutLock = getFieldValue(serializeWriter1, "lock");
        SerializeWriter serializeWriter2 = jSONSerializer.out;
        Object serializeWriter2OutWriter = getFieldValue(serializeWriter2, "writer");
        Object initialJSONSerializerOutWriterLock = getFieldValue(serializeWriter2OutWriter, "lock");
        SerializeWriter serializeWriter3 = jSONSerializer.out;
        Object serializeWriter3OutWriter = getFieldValue(serializeWriter3, "writer");
        Object serializeWriter3OutWriterOutWriterSe = getFieldValue(serializeWriter3OutWriter, "se");
        Object initialJSONSerializerOutWriterSeLock = getFieldValue(serializeWriter3OutWriterOutWriterSe, "lock");
        
        jSONSerializer.println();
        
        SerializeWriter serializeWriter4 = jSONSerializer.out;
        Object finalJSONSerializerOutLock = getFieldValue(serializeWriter4, "lock");
        SerializeWriter serializeWriter5 = jSONSerializer.out;
        Object serializeWriter5OutWriter = getFieldValue(serializeWriter5, "writer");
        Object finalJSONSerializerOutWriterLock = getFieldValue(serializeWriter5OutWriter, "lock");
        SerializeWriter serializeWriter6 = jSONSerializer.out;
        Object serializeWriter6OutWriter = getFieldValue(serializeWriter6, "writer");
        Object serializeWriter6OutWriterOutWriterSe = getFieldValue(serializeWriter6OutWriter, "se");
        Object finalJSONSerializerOutWriterSeLock = getFieldValue(serializeWriter6OutWriterOutWriterSe, "lock");
        
        assertNull(finalJSONSerializerOutLock);
        
        assertNull(finalJSONSerializerOutWriterLock);
        
        assertNull(finalJSONSerializerOutWriterSeLock);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testPrintln4() throws Throwable  {
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        setField(jSONSerializer, "indent", null);
        setField(jSONSerializer, "indentCount", 1);
        SerializeWriter serializeWriter = ((SerializeWriter) createInstance("com.alibaba.fastjson.serializer.SerializeWriter"));
        SerializeWriter serializeWriter1 = ((SerializeWriter) createInstance("com.alibaba.fastjson.serializer.SerializeWriter"));
        setField(serializeWriter1, "writer", null);
        serializeWriter1.count = 0;
        setField(serializeWriter1, "buf", null);
        setField(serializeWriter, "writer", serializeWriter1);
        serializeWriter.count = 11;
        char[] charArray = new char[12];
        serializeWriter.buf = charArray;
        setField(jSONSerializer, "out", serializeWriter);
        
        jSONSerializer.println();
        
        int finalJSONSerializerOutCount = jSONSerializer.out.count;
        char finalJSONSerializerOutBuf11 = jSONSerializer.out.buf[11];
        
        assertEquals(12, finalJSONSerializerOutCount);
        
        assertEquals('\n', finalJSONSerializerOutBuf11);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testWrite1() throws Throwable  {
        StringCodec prevInstance = StringCodec.instance;
        try {
            StringCodec.instance = null;
            JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
            
            jSONSerializer.write(((String) null));
        } finally {
            StringCodec.instance = prevInstance;
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testWrite2() throws Throwable  {
        StringCodec prevInstance = StringCodec.instance;
        try {
            StringCodec instance = ((StringCodec) createInstance("com.alibaba.fastjson.serializer.StringCodec"));
            StringCodec.instance = instance;
            JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
            SerializeWriter serializeWriter = ((SerializeWriter) createInstance("com.alibaba.fastjson.serializer.SerializeWriter"));
            serializeWriter.useSingleQuotes = false;
            serializeWriter.count = 0;
            char[] charArray = new char[33];
            serializeWriter.buf = charArray;
            setField(jSONSerializer, "out", serializeWriter);
            String string = new String("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
            
            jSONSerializer.write(string);
            
            int finalJSONSerializerOutCount = jSONSerializer.out.count;
            char finalJSONSerializerOutBuf0 = jSONSerializer.out.buf[0];
            char finalJSONSerializerOutBuf30 = jSONSerializer.out.buf[30];
            
            assertEquals(31, finalJSONSerializerOutCount);
            
            assertEquals('\"', finalJSONSerializerOutBuf0);
            
            assertEquals('\"', finalJSONSerializerOutBuf30);
        } finally {
            StringCodec.instance = prevInstance;
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testWrite3() throws Throwable  {
        StringCodec prevInstance = StringCodec.instance;
        try {
            StringCodec instance = ((StringCodec) createInstance("com.alibaba.fastjson.serializer.StringCodec"));
            StringCodec.instance = instance;
            JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
            SerializeWriter serializeWriter = ((SerializeWriter) createInstance("com.alibaba.fastjson.serializer.SerializeWriter"));
            setField(serializeWriter, "lock", null);
            serializeWriter.useSingleQuotes = false;
            OutputStreamWriter outputStreamWriter = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
            setField(outputStreamWriter, "lock", null);
            StreamEncoder streamEncoder = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
            setField(streamEncoder, "lock", null);
            setField(streamEncoder, "isOpen", false);
            setField(outputStreamWriter, "se", streamEncoder);
            setField(serializeWriter, "writer", outputStreamWriter);
            serializeWriter.count = 1073741822;
            char[] charArray = new char[10];
            serializeWriter.buf = charArray;
            setField(jSONSerializer, "out", serializeWriter);
            String string = new String("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
            
            jSONSerializer.write(string);
        } finally {
            StringCodec.instance = prevInstance;
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testWrite4() throws Throwable  {
        StringCodec prevInstance = StringCodec.instance;
        try {
            StringCodec instance = ((StringCodec) createInstance("com.alibaba.fastjson.serializer.StringCodec"));
            StringCodec.instance = instance;
            JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
            SerializeWriter serializeWriter = ((SerializeWriter) createInstance("com.alibaba.fastjson.serializer.SerializeWriter"));
            serializeWriter.useSingleQuotes = true;
            serializeWriter.count = 0;
            char[] charArray = new char[33];
            serializeWriter.buf = charArray;
            setField(jSONSerializer, "out", serializeWriter);
            String string = new String("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
            
            jSONSerializer.write(string);
            
            int finalJSONSerializerOutCount = jSONSerializer.out.count;
            char finalJSONSerializerOutBuf0 = jSONSerializer.out.buf[0];
            
            assertEquals(31, finalJSONSerializerOutCount);
            
            assertEquals('\'', finalJSONSerializerOutBuf0);
        } finally {
            StringCodec.instance = prevInstance;
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testWrite5() throws Throwable  {
        StringCodec prevInstance = StringCodec.instance;
        try {
            StringCodec instance = ((StringCodec) createInstance("com.alibaba.fastjson.serializer.StringCodec"));
            StringCodec.instance = instance;
            JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
            SerializeWriter serializeWriter = ((SerializeWriter) createInstance("com.alibaba.fastjson.serializer.SerializeWriter"));
            serializeWriter.useSingleQuotes = true;
            OutputStreamWriter outputStreamWriter = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
            StreamEncoder streamEncoder = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
            setField(outputStreamWriter, "se", streamEncoder);
            setField(serializeWriter, "writer", outputStreamWriter);
            serializeWriter.count = 1073741822;
            char[] charArray = new char[10];
            serializeWriter.buf = charArray;
            setField(jSONSerializer, "out", serializeWriter);
            String string = new String("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
            
            jSONSerializer.write(string);
        } finally {
            StringCodec.instance = prevInstance;
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testWrite6() throws Throwable  {
        StringCodec prevInstance = StringCodec.instance;
        try {
            StringCodec instance = ((StringCodec) createInstance("com.alibaba.fastjson.serializer.StringCodec"));
            StringCodec.instance = instance;
            JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
            SerializeWriter serializeWriter = ((SerializeWriter) createInstance("com.alibaba.fastjson.serializer.SerializeWriter"));
            setField(jSONSerializer, "out", serializeWriter);
            
            jSONSerializer.write(((String) null));
        } finally {
            StringCodec.instance = prevInstance;
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testWrite7() throws Throwable  {
        StringCodec prevInstance = StringCodec.instance;
        try {
            StringCodec instance = ((StringCodec) createInstance("com.alibaba.fastjson.serializer.StringCodec"));
            StringCodec.instance = instance;
            JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
            SerializeWriter serializeWriter = ((SerializeWriter) createInstance("com.alibaba.fastjson.serializer.SerializeWriter"));
            serializeWriter.useSingleQuotes = true;
            BufferedWriter bufferedWriter = ((BufferedWriter) createInstance("java.io.BufferedWriter"));
            setField(serializeWriter, "writer", bufferedWriter);
            serializeWriter.count = 33;
            char[] charArray = new char[34];
            serializeWriter.buf = charArray;
            setField(jSONSerializer, "out", serializeWriter);
            String string = new String("\u0000\u0000\u0000\u0000");
            
            jSONSerializer.write(string);
            
            int finalJSONSerializerOutCount = jSONSerializer.out.count;
            char finalJSONSerializerOutBuf33 = jSONSerializer.out.buf[33];
            
            assertEquals(34, finalJSONSerializerOutCount);
            
            assertEquals('\'', finalJSONSerializerOutBuf33);
        } finally {
            StringCodec.instance = prevInstance;
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testWrite8() throws Throwable  {
        StringCodec prevInstance = StringCodec.instance;
        try {
            StringCodec instance = ((StringCodec) createInstance("com.alibaba.fastjson.serializer.StringCodec"));
            StringCodec.instance = instance;
            JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
            SerializeWriter serializeWriter = ((SerializeWriter) createInstance("com.alibaba.fastjson.serializer.SerializeWriter"));
            serializeWriter.useSingleQuotes = false;
            BufferedWriter bufferedWriter = ((BufferedWriter) createInstance("java.io.BufferedWriter"));
            setField(serializeWriter, "writer", bufferedWriter);
            serializeWriter.count = 37;
            char[] charArray = new char[38];
            serializeWriter.buf = charArray;
            setField(jSONSerializer, "out", serializeWriter);
            String string = new String("");
            
            jSONSerializer.write(string);
            
            int finalJSONSerializerOutCount = jSONSerializer.out.count;
            char finalJSONSerializerOutBuf37 = jSONSerializer.out.buf[37];
            
            assertEquals(38, finalJSONSerializerOutCount);
            
            assertEquals('\"', finalJSONSerializerOutBuf37);
        } finally {
            StringCodec.instance = prevInstance;
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetContext1() throws Throwable  {
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        setField(jSONSerializer, "context", null);
        
        SerialContext actual = jSONSerializer.getContext();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testClose1() throws Throwable  {
        JSONSerializer jSONSerializer = new JSONSerializer();
        
        jSONSerializer.close();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testClose2() throws Throwable  {
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        SerializeWriter serializeWriter = ((SerializeWriter) createInstance("com.alibaba.fastjson.serializer.SerializeWriter"));
        setField(serializeWriter, "lock", null);
        OutputStreamWriter outputStreamWriter = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        setField(outputStreamWriter, "lock", null);
        StreamEncoder streamEncoder = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(streamEncoder, "lock", null);
        setField(streamEncoder, "isOpen", false);
        setField(outputStreamWriter, "se", streamEncoder);
        setField(serializeWriter, "writer", outputStreamWriter);
        serializeWriter.count = 512;
        setField(serializeWriter, "buf", null);
        setField(jSONSerializer, "out", serializeWriter);
        
        SerializeWriter serializeWriter1 = jSONSerializer.out;
        Object initialJSONSerializerOutLock = getFieldValue(serializeWriter1, "lock");
        SerializeWriter serializeWriter2 = jSONSerializer.out;
        Object serializeWriter2OutWriter = getFieldValue(serializeWriter2, "writer");
        Object initialJSONSerializerOutWriterLock = getFieldValue(serializeWriter2OutWriter, "lock");
        SerializeWriter serializeWriter3 = jSONSerializer.out;
        Object serializeWriter3OutWriter = getFieldValue(serializeWriter3, "writer");
        Object serializeWriter3OutWriterOutWriterSe = getFieldValue(serializeWriter3OutWriter, "se");
        Object initialJSONSerializerOutWriterSeLock = getFieldValue(serializeWriter3OutWriterOutWriterSe, "lock");
        
        jSONSerializer.close();
        
        SerializeWriter serializeWriter4 = jSONSerializer.out;
        Object finalJSONSerializerOutLock = getFieldValue(serializeWriter4, "lock");
        SerializeWriter serializeWriter5 = jSONSerializer.out;
        Object serializeWriter5OutWriter = getFieldValue(serializeWriter5, "writer");
        Object finalJSONSerializerOutWriterLock = getFieldValue(serializeWriter5OutWriter, "lock");
        SerializeWriter serializeWriter6 = jSONSerializer.out;
        Object serializeWriter6OutWriter = getFieldValue(serializeWriter6, "writer");
        Object serializeWriter6OutWriterOutWriterSe = getFieldValue(serializeWriter6OutWriter, "se");
        Object finalJSONSerializerOutWriterSeLock = getFieldValue(serializeWriter6OutWriterOutWriterSe, "lock");
        
        assertNull(finalJSONSerializerOutLock);
        
        assertNull(finalJSONSerializerOutWriterLock);
        
        assertNull(finalJSONSerializerOutWriterSeLock);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testWrite9() throws Throwable  {
        SerializeWriter serializeWriter = new SerializeWriter();
        Object object = new Object();
        
        JSONSerializer.write(serializeWriter, object);
    }
    ///endregion
    
    
    ///region Errors report for write
    
    public void testWrite_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Field security is not found in class java.lang.System
        // 
    }
    ///endregion
    
    
    ///region Errors report for write
    
    public void testWrite_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Field security is not found in class java.lang.System
        // 
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testJSONSerializer1() {
        SerializeWriter serializeWriter = new SerializeWriter();
        SerializeConfig serializeConfig = new SerializeConfig();
        JSONSerializer actual = new JSONSerializer(serializeWriter, serializeConfig);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testJSONSerializer2() {
        SerializeConfig serializeConfig = new SerializeConfig();
        JSONSerializer actual = new JSONSerializer(serializeConfig);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testJSONSerializer3() {
        JSONSerializer actual = new JSONSerializer();
    }
    ///endregion
    
    private static Object createInstance(String className) throws Exception {
        Class<?> clazz = Class.forName(className);
        return getUnsafeInstance().allocateInstance(clazz);
    }
    private static void setField(Object object, String fieldName, Object fieldValue) throws Exception {
        Class<?> clazz = object.getClass();
        java.lang.reflect.Field field;
    
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
            } catch (Exception e) {
                clazz = clazz.getSuperclass();
                field = null;
            }
        } while (field == null);
        
        java.lang.reflect.Field modifiersField = java.lang.reflect.Field.class.getDeclaredField("modifiers");
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
    }
    private static Object[] createArray(String className, int length, Object... values) throws ClassNotFoundException {
        Object array = java.lang.reflect.Array.newInstance(Class.forName(className), length);
    
        for (int i = 0; i < values.length; i++) {
            java.lang.reflect.Array.set(array, i, values[i]);
        }
        
        return (Object[]) array;
    }
    static class FieldsPair {
        final Object o1;
        final Object o2;
    
        public FieldsPair(Object o1, Object o2) {
            this.o1 = o1;
            this.o2 = o2;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            FieldsPair that = (FieldsPair) o;
            return Objects.equals(o1, that.o1) && Objects.equals(o2, that.o2);
        }
    
        @Override
        public int hashCode() {
            return Objects.hash(o1, o2);
        }
    }
    
    private boolean deepEquals(Object o1, Object o2) {
        try {
            return deepEquals(o1, o2, new HashSet<>());
        } catch (Throwable t) {
            return true;
        }
    }
    
    private boolean deepEquals(Object o1, Object o2, Set<FieldsPair> visited) {
        visited.add(new FieldsPair(o1, o2));
    
        if (o1 == o2) {
            return true;
        }
    
        if (o1 == null || o2 == null) {
            return false;
        }
    
        if (o1 instanceof Iterable) {
            if (!(o2 instanceof Iterable)) {
                return false;
            }
    
            return iterablesDeepEquals((Iterable<?>) o1, (Iterable<?>) o2, visited);
        }
        
        if (o2 instanceof Iterable) {
            return false;
        }
    
        if (o1 instanceof Map) {
            if (!(o2 instanceof Map)) {
                return false;
            }
    
            return mapsDeepEquals((Map<?, ?>) o1, (Map<?, ?>) o2, visited);
        }
        
        if (o2 instanceof Map) {
            return false;
        }
    
        Class<?> firstClass = o1.getClass();
        if (firstClass.isArray()) {
            if (!o2.getClass().isArray()) {
                return false;
            }
    
            // Primitive arrays should not appear here
            return arraysDeepEquals(o1, o2, visited);
        }
    
        // common classes
    
        // common classes without custom equals, use comparison by fields
        final List<java.lang.reflect.Field> fields = new ArrayList<>();
        while (firstClass != Object.class) {
            fields.addAll(Arrays.asList(firstClass.getDeclaredFields()));
            // Interface should not appear here
            firstClass = firstClass.getSuperclass();
        }
    
        for (java.lang.reflect.Field field : fields) {
            field.setAccessible(true);
            try {
                final Object field1 = field.get(o1);
                final Object field2 = field.get(o2);
                if (!visited.contains(new FieldsPair(field1, field2)) && !deepEquals(field1, field2, visited)) {
                    return false;
                }
            } catch (IllegalArgumentException e) {
                return false;
            } catch (IllegalAccessException e) {
                // should never occur because field was set accessible
                return false;
            }
        }
    
        return true;
    }
    private boolean arraysDeepEquals(Object arr1, Object arr2, Set<FieldsPair> visited) {
        final int length = Array.getLength(arr1);
        if (length != Array.getLength(arr2)) {
            return false;
        }
    
        for (int i = 0; i < length; i++) {
            if (!deepEquals(Array.get(arr1, i), Array.get(arr2, i), visited)) {
                return false;
            }
        }
    
        return true;
    }
    private boolean iterablesDeepEquals(Iterable<?> i1, Iterable<?> i2, Set<FieldsPair> visited) {
        final Iterator<?> firstIterator = i1.iterator();
        final Iterator<?> secondIterator = i2.iterator();
        while (firstIterator.hasNext() && secondIterator.hasNext()) {
            if (!deepEquals(firstIterator.next(), secondIterator.next(), visited)) {
                return false;
            }
        }
    
        if (firstIterator.hasNext()) {
            return false;
        }
    
        return !secondIterator.hasNext();
    }
    private boolean mapsDeepEquals(Map<?, ?> m1, Map<?, ?> m2, Set<FieldsPair> visited) {
        final Iterator<? extends Map.Entry<?, ?>> firstIterator = m1.entrySet().iterator();
        final Iterator<? extends Map.Entry<?, ?>> secondIterator = m2.entrySet().iterator();
        while (firstIterator.hasNext() && secondIterator.hasNext()) {
            final Map.Entry<?, ?> firstEntry = firstIterator.next();
            final Map.Entry<?, ?> secondEntry = secondIterator.next();
    
            if (!deepEquals(firstEntry.getKey(), secondEntry.getKey(), visited)) {
                return false;
            }
    
            if (!deepEquals(firstEntry.getValue(), secondEntry.getValue(), visited)) {
                return false;
            }
        }
    
        if (firstIterator.hasNext()) {
            return false;
        }
    
        return !secondIterator.hasNext();
    }
    private boolean hasCustomEquals(Class<?> clazz) {
        while (!Object.class.equals(clazz)) {
            try {
                clazz.getDeclaredMethod("equals", Object.class);
                return true;
            } catch (Exception e) { 
                // Interface should not appear here
                clazz = clazz.getSuperclass();
            }
        }
    
        return false;
    }
    private static Object getFieldValue(Object obj, String fieldName) throws Exception {
        Class<?> clazz = obj.getClass();
        java.lang.reflect.Field field;
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);
                java.lang.reflect.Field modifiersField = java.lang.reflect.Field.class.getDeclaredField("modifiers");
                modifiersField.setAccessible(true);
                modifiersField.setInt(field, field.getModifiers() & ~Modifier.FINAL);
                
                return field.get(obj);
            } catch (NoSuchFieldException e) {
                clazz = clazz.getSuperclass();
            }
        } while (clazz != null);
    
        throw new NoSuchFieldException("Field '" + fieldName + "' not found on class " + obj.getClass());
    }
    private static sun.misc.Unsafe getUnsafeInstance() throws Exception {
        java.lang.reflect.Field f = sun.misc.Unsafe.class.getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return (sun.misc.Unsafe) f.get(null);
    }
}
