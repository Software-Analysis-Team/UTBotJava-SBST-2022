package com.alibaba.fastjson.serializer;

import org.junit.Test;
import java.util.List;
import java.util.ArrayList;
import com.alibaba.fastjson.util.ASMClassLoader;
import java.security.ProtectionDomain;
import java.security.CodeSource;
import java.net.URL;
import sun.net.www.protocol.file.Handler;
import java.util.Hashtable;
import com.huawei.utbot.instrumentation.process.HandlerClassesLoader;
import sun.misc.URLClassPath;
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
import java.io.FileWriter;
import sun.nio.cs.StreamEncoder;
import java.io.PrintWriter;
import com.alibaba.fastjson.util.IdentityHashMap;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.lang.reflect.Method;
import java.util.IllegalFormatWidthException;
import com.alibaba.fastjson.util.FieldInfo;
import java.io.Writer;
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

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static java.lang.reflect.Array.get;

public class JSONSerializerTest {
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
        Object object = new Object();
        Object object1 = new Object();
        
        jSONSerializer.setContext(object, object1);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetContext2() throws Throwable  {
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        setField(jSONSerializer, "context", null);
        SerializeWriter serializeWriter = ((SerializeWriter) createInstance("com.alibaba.fastjson.serializer.SerializeWriter"));
        serializeWriter.disableCircularReferenceDetect = false;
        setField(jSONSerializer, "out", serializeWriter);
        
        jSONSerializer.setContext(null, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetContext3() throws Throwable  {
        JSONSerializer jSONSerializer = new JSONSerializer();
        SerialContext serialContext = ((SerialContext) createInstance("com.alibaba.fastjson.serializer.SerialContext"));
        Object object = new Object();
        Object object1 = new Object();
        
        jSONSerializer.setContext(serialContext, object, object1, 0, 0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetContext4() throws Throwable  {
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        SerializeWriter serializeWriter = ((SerializeWriter) createInstance("com.alibaba.fastjson.serializer.SerializeWriter"));
        serializeWriter.disableCircularReferenceDetect = true;
        setField(jSONSerializer, "out", serializeWriter);
        
        jSONSerializer.setContext(null, null, null, 0, 0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetContext5() throws Throwable  {
        JSONSerializer jSONSerializer = new JSONSerializer();
        SerialContext serialContext = ((SerialContext) createInstance("com.alibaba.fastjson.serializer.SerialContext"));
        Object object = new Object();
        Object object1 = new Object();
        
        jSONSerializer.setContext(serialContext, object, object1, 0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetContext6() throws Throwable  {
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        SerializeWriter serializeWriter = ((SerializeWriter) createInstance("com.alibaba.fastjson.serializer.SerializeWriter"));
        serializeWriter.disableCircularReferenceDetect = true;
        setField(jSONSerializer, "out", serializeWriter);
        
        jSONSerializer.setContext(null, null, null, 0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetContext7() throws Throwable  {
        JSONSerializer jSONSerializer = new JSONSerializer();
        SerialContext serialContext = ((SerialContext) createInstance("com.alibaba.fastjson.serializer.SerialContext"));
        
        jSONSerializer.setContext(serialContext);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetContext8() throws Throwable  {
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        setField(jSONSerializer, "context", null);
        
        jSONSerializer.setContext(null);
    }
    ///endregion
    
    
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
    public void testPrintln1() throws Throwable  {
        JSONSerializer jSONSerializer = new JSONSerializer();
        
        jSONSerializer.println();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testPrintln2() throws Throwable  {
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        setField(jSONSerializer, "indentCount", -2147483647);
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
    
    @Test(timeout = 10000)
    public void testPrintln3() throws Throwable  {
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        String string = new String("");
        setField(jSONSerializer, "indent", string);
        setField(jSONSerializer, "indentCount", 1);
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
    public void testPrintln4() throws Throwable  {
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        SerializeWriter serializeWriter = ((SerializeWriter) createInstance("com.alibaba.fastjson.serializer.SerializeWriter"));
        setField(serializeWriter, "lock", null);
        FileWriter fileWriter = ((FileWriter) createInstance("java.io.FileWriter"));
        setField(fileWriter, "lock", null);
        StreamEncoder streamEncoder = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(streamEncoder, "lock", null);
        setField(streamEncoder, "isOpen", true);
        setField(fileWriter, "se", streamEncoder);
        setField(serializeWriter, "writer", fileWriter);
        serializeWriter.count = 2147483646;
        char[] charArray = new char[10];
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
    
    @Test(timeout = 10000)
    public void testWrite1() throws Throwable  {
        JSONSerializer jSONSerializer = new JSONSerializer();
        String string = new String();
        
        jSONSerializer.write(string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testWrite2() throws Throwable  {
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
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testWrite3() throws Throwable  {
        StringCodec prevInstance = StringCodec.instance;
        try {
            StringCodec instance = ((StringCodec) createInstance("com.alibaba.fastjson.serializer.StringCodec"));
            StringCodec.instance = instance;
            JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
            SerializeWriter serializeWriter = ((SerializeWriter) createInstance("com.alibaba.fastjson.serializer.SerializeWriter"));
            serializeWriter.useSingleQuotes = true;
            FileWriter fileWriter = ((FileWriter) createInstance("java.io.FileWriter"));
            StreamEncoder streamEncoder = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
            setField(fileWriter, "se", streamEncoder);
            setField(serializeWriter, "writer", fileWriter);
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
            setField(serializeWriter, "lock", null);
            serializeWriter.useSingleQuotes = false;
            FileWriter fileWriter = ((FileWriter) createInstance("java.io.FileWriter"));
            setField(fileWriter, "lock", null);
            StreamEncoder streamEncoder = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
            setField(streamEncoder, "lock", null);
            setField(fileWriter, "se", streamEncoder);
            setField(serializeWriter, "writer", fileWriter);
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
    public void testWrite5() throws Throwable  {
        StringCodec prevInstance = StringCodec.instance;
        try {
            StringCodec instance = ((StringCodec) createInstance("com.alibaba.fastjson.serializer.StringCodec"));
            StringCodec.instance = instance;
            JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
            SerializeWriter serializeWriter = ((SerializeWriter) createInstance("com.alibaba.fastjson.serializer.SerializeWriter"));
            serializeWriter.useSingleQuotes = false;
            PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
            setField(serializeWriter, "writer", printWriter);
            serializeWriter.count = 33;
            char[] charArray = new char[34];
            serializeWriter.buf = charArray;
            setField(jSONSerializer, "out", serializeWriter);
            String string = new String("\u0000\u0000\u0000\u0000");
            
            jSONSerializer.write(string);
            
            int finalJSONSerializerOutCount = jSONSerializer.out.count;
            char finalJSONSerializerOutBuf33 = jSONSerializer.out.buf[33];
            
            assertEquals(34, finalJSONSerializerOutCount);
            
            assertEquals('\"', finalJSONSerializerOutBuf33);
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
            serializeWriter.useSingleQuotes = false;
            serializeWriter.count = -1073741855;
            char[] charArray = new char[2];
            serializeWriter.buf = charArray;
            setField(jSONSerializer, "out", serializeWriter);
            String string = new String("\u0000\u0000\u0000\u0000");
            
            jSONSerializer.write(string);
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
    public void testWrite9() throws Throwable  {
        StringCodec prevInstance = StringCodec.instance;
        try {
            StringCodec instance = ((StringCodec) createInstance("com.alibaba.fastjson.serializer.StringCodec"));
            StringCodec.instance = instance;
            JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
            SerializeWriter serializeWriter = ((SerializeWriter) createInstance("com.alibaba.fastjson.serializer.SerializeWriter"));
            serializeWriter.useSingleQuotes = true;
            PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
            setField(serializeWriter, "writer", printWriter);
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
    
    @Test(timeout = 10000)
    public void testWrite10() throws Throwable  {
        JSONSerializer jSONSerializer = new JSONSerializer();
        Object object = new Object();
        
        jSONSerializer.write(object);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testWrite11() throws Throwable  {
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        SerializeConfig serializeConfig = ((SerializeConfig) createInstance("com.alibaba.fastjson.serializer.SerializeConfig"));
        IdentityHashMap identityHashMap = ((IdentityHashMap) createInstance("com.alibaba.fastjson.util.IdentityHashMap"));
        setField(identityHashMap, "indexMask", 38);
        java.lang.Object[] entryArray = createArray("com.alibaba.fastjson.util.IdentityHashMap$Entry", 39);
        Object entry = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry, "value", null);
        Class class1 = Object.class;
        setField(entry, "key", class1);
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
        java.lang.Object[] forEachOrderedTaskArray = createArray("java.util.stream.ForEachOps$ForEachOrderedTask", 39);
        
        Object initialForEachOrderedTaskArray0 = forEachOrderedTaskArray[0];
        Object initialForEachOrderedTaskArray1 = forEachOrderedTaskArray[1];
        Object initialForEachOrderedTaskArray2 = forEachOrderedTaskArray[2];
        Object initialForEachOrderedTaskArray3 = forEachOrderedTaskArray[3];
        Object initialForEachOrderedTaskArray4 = forEachOrderedTaskArray[4];
        Object initialForEachOrderedTaskArray5 = forEachOrderedTaskArray[5];
        Object initialForEachOrderedTaskArray6 = forEachOrderedTaskArray[6];
        Object initialForEachOrderedTaskArray7 = forEachOrderedTaskArray[7];
        Object initialForEachOrderedTaskArray8 = forEachOrderedTaskArray[8];
        Object initialForEachOrderedTaskArray9 = forEachOrderedTaskArray[9];
        Object initialForEachOrderedTaskArray10 = forEachOrderedTaskArray[10];
        Object initialForEachOrderedTaskArray11 = forEachOrderedTaskArray[11];
        Object initialForEachOrderedTaskArray12 = forEachOrderedTaskArray[12];
        Object initialForEachOrderedTaskArray13 = forEachOrderedTaskArray[13];
        Object initialForEachOrderedTaskArray14 = forEachOrderedTaskArray[14];
        Object initialForEachOrderedTaskArray15 = forEachOrderedTaskArray[15];
        Object initialForEachOrderedTaskArray16 = forEachOrderedTaskArray[16];
        Object initialForEachOrderedTaskArray17 = forEachOrderedTaskArray[17];
        Object initialForEachOrderedTaskArray18 = forEachOrderedTaskArray[18];
        Object initialForEachOrderedTaskArray19 = forEachOrderedTaskArray[19];
        Object initialForEachOrderedTaskArray20 = forEachOrderedTaskArray[20];
        Object initialForEachOrderedTaskArray21 = forEachOrderedTaskArray[21];
        Object initialForEachOrderedTaskArray22 = forEachOrderedTaskArray[22];
        Object initialForEachOrderedTaskArray23 = forEachOrderedTaskArray[23];
        Object initialForEachOrderedTaskArray24 = forEachOrderedTaskArray[24];
        Object initialForEachOrderedTaskArray25 = forEachOrderedTaskArray[25];
        Object initialForEachOrderedTaskArray26 = forEachOrderedTaskArray[26];
        Object initialForEachOrderedTaskArray27 = forEachOrderedTaskArray[27];
        Object initialForEachOrderedTaskArray28 = forEachOrderedTaskArray[28];
        Object initialForEachOrderedTaskArray29 = forEachOrderedTaskArray[29];
        Object initialForEachOrderedTaskArray30 = forEachOrderedTaskArray[30];
        Object initialForEachOrderedTaskArray31 = forEachOrderedTaskArray[31];
        Object initialForEachOrderedTaskArray32 = forEachOrderedTaskArray[32];
        Object initialForEachOrderedTaskArray33 = forEachOrderedTaskArray[33];
        Object initialForEachOrderedTaskArray34 = forEachOrderedTaskArray[34];
        Object initialForEachOrderedTaskArray35 = forEachOrderedTaskArray[35];
        Object initialForEachOrderedTaskArray36 = forEachOrderedTaskArray[36];
        Object initialForEachOrderedTaskArray37 = forEachOrderedTaskArray[37];
        Object initialForEachOrderedTaskArray38 = forEachOrderedTaskArray[38];
        
        jSONSerializer.write(forEachOrderedTaskArray);
        
        Object finalForEachOrderedTaskArray0 = forEachOrderedTaskArray[0];
        Object finalForEachOrderedTaskArray1 = forEachOrderedTaskArray[1];
        Object finalForEachOrderedTaskArray2 = forEachOrderedTaskArray[2];
        Object finalForEachOrderedTaskArray3 = forEachOrderedTaskArray[3];
        Object finalForEachOrderedTaskArray4 = forEachOrderedTaskArray[4];
        Object finalForEachOrderedTaskArray5 = forEachOrderedTaskArray[5];
        Object finalForEachOrderedTaskArray6 = forEachOrderedTaskArray[6];
        Object finalForEachOrderedTaskArray7 = forEachOrderedTaskArray[7];
        Object finalForEachOrderedTaskArray8 = forEachOrderedTaskArray[8];
        Object finalForEachOrderedTaskArray9 = forEachOrderedTaskArray[9];
        Object finalForEachOrderedTaskArray10 = forEachOrderedTaskArray[10];
        Object finalForEachOrderedTaskArray11 = forEachOrderedTaskArray[11];
        Object finalForEachOrderedTaskArray12 = forEachOrderedTaskArray[12];
        Object finalForEachOrderedTaskArray13 = forEachOrderedTaskArray[13];
        Object finalForEachOrderedTaskArray14 = forEachOrderedTaskArray[14];
        Object finalForEachOrderedTaskArray15 = forEachOrderedTaskArray[15];
        Object finalForEachOrderedTaskArray16 = forEachOrderedTaskArray[16];
        Object finalForEachOrderedTaskArray17 = forEachOrderedTaskArray[17];
        Object finalForEachOrderedTaskArray18 = forEachOrderedTaskArray[18];
        Object finalForEachOrderedTaskArray19 = forEachOrderedTaskArray[19];
        Object finalForEachOrderedTaskArray20 = forEachOrderedTaskArray[20];
        Object finalForEachOrderedTaskArray21 = forEachOrderedTaskArray[21];
        Object finalForEachOrderedTaskArray22 = forEachOrderedTaskArray[22];
        Object finalForEachOrderedTaskArray23 = forEachOrderedTaskArray[23];
        Object finalForEachOrderedTaskArray24 = forEachOrderedTaskArray[24];
        Object finalForEachOrderedTaskArray25 = forEachOrderedTaskArray[25];
        Object finalForEachOrderedTaskArray26 = forEachOrderedTaskArray[26];
        Object finalForEachOrderedTaskArray27 = forEachOrderedTaskArray[27];
        Object finalForEachOrderedTaskArray28 = forEachOrderedTaskArray[28];
        Object finalForEachOrderedTaskArray29 = forEachOrderedTaskArray[29];
        Object finalForEachOrderedTaskArray30 = forEachOrderedTaskArray[30];
        Object finalForEachOrderedTaskArray31 = forEachOrderedTaskArray[31];
        Object finalForEachOrderedTaskArray32 = forEachOrderedTaskArray[32];
        Object finalForEachOrderedTaskArray33 = forEachOrderedTaskArray[33];
        Object finalForEachOrderedTaskArray34 = forEachOrderedTaskArray[34];
        Object finalForEachOrderedTaskArray35 = forEachOrderedTaskArray[35];
        Object finalForEachOrderedTaskArray36 = forEachOrderedTaskArray[36];
        Object finalForEachOrderedTaskArray37 = forEachOrderedTaskArray[37];
        Object finalForEachOrderedTaskArray38 = forEachOrderedTaskArray[38];
        
        assertNull(finalForEachOrderedTaskArray0);
        
        assertNull(finalForEachOrderedTaskArray1);
        
        assertNull(finalForEachOrderedTaskArray2);
        
        assertNull(finalForEachOrderedTaskArray3);
        
        assertNull(finalForEachOrderedTaskArray4);
        
        assertNull(finalForEachOrderedTaskArray5);
        
        assertNull(finalForEachOrderedTaskArray6);
        
        assertNull(finalForEachOrderedTaskArray7);
        
        assertNull(finalForEachOrderedTaskArray8);
        
        assertNull(finalForEachOrderedTaskArray9);
        
        assertNull(finalForEachOrderedTaskArray10);
        
        assertNull(finalForEachOrderedTaskArray11);
        
        assertNull(finalForEachOrderedTaskArray12);
        
        assertNull(finalForEachOrderedTaskArray13);
        
        assertNull(finalForEachOrderedTaskArray14);
        
        assertNull(finalForEachOrderedTaskArray15);
        
        assertNull(finalForEachOrderedTaskArray16);
        
        assertNull(finalForEachOrderedTaskArray17);
        
        assertNull(finalForEachOrderedTaskArray18);
        
        assertNull(finalForEachOrderedTaskArray19);
        
        assertNull(finalForEachOrderedTaskArray20);
        
        assertNull(finalForEachOrderedTaskArray21);
        
        assertNull(finalForEachOrderedTaskArray22);
        
        assertNull(finalForEachOrderedTaskArray23);
        
        assertNull(finalForEachOrderedTaskArray24);
        
        assertNull(finalForEachOrderedTaskArray25);
        
        assertNull(finalForEachOrderedTaskArray26);
        
        assertNull(finalForEachOrderedTaskArray27);
        
        assertNull(finalForEachOrderedTaskArray28);
        
        assertNull(finalForEachOrderedTaskArray29);
        
        assertNull(finalForEachOrderedTaskArray30);
        
        assertNull(finalForEachOrderedTaskArray31);
        
        assertNull(finalForEachOrderedTaskArray32);
        
        assertNull(finalForEachOrderedTaskArray33);
        
        assertNull(finalForEachOrderedTaskArray34);
        
        assertNull(finalForEachOrderedTaskArray35);
        
        assertNull(finalForEachOrderedTaskArray36);
        
        assertNull(finalForEachOrderedTaskArray37);
        
        assertNull(finalForEachOrderedTaskArray38);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetContext1() throws Throwable  {
        JSONSerializer jSONSerializer = new JSONSerializer();
        
        SerialContext actual = jSONSerializer.getContext();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetContext2() throws Throwable  {
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
        
        jSONSerializer.config(serializerFeature, false);
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
    public void testWriteWithFieldName3() throws Throwable  {
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        SerializeConfig serializeConfig = ((SerializeConfig) createInstance("com.alibaba.fastjson.serializer.SerializeConfig"));
        IdentityHashMap identityHashMap = ((IdentityHashMap) createInstance("com.alibaba.fastjson.util.IdentityHashMap"));
        setField(identityHashMap, "indexMask", 38);
        java.lang.Object[] entryArray = createArray("com.alibaba.fastjson.util.IdentityHashMap$Entry", 39);
        Object entry = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry, "value", null);
        Class class1 = Object.class;
        setField(entry, "key", class1);
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
        java.lang.Object[] forEachOrderedTaskArray = createArray("java.util.stream.ForEachOps$ForEachOrderedTask", 39);
        
        SerializeConfig serializeConfig1 = jSONSerializer.config;
        Object serializeConfig1ConfigSerializers = getFieldValue(serializeConfig1, "serializers");
        Object serializeConfig1ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig1ConfigSerializers, "buckets");
        Object serializeConfig1ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0 = get(serializeConfig1ConfigSerializersConfigSerializersBuckets, 0);
        Object initialJSONSerializerConfigSerializersBuckets0Value = getFieldValue(serializeConfig1ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0, "value");
        
        Object initialForEachOrderedTaskArray0 = forEachOrderedTaskArray[0];
        Object initialForEachOrderedTaskArray1 = forEachOrderedTaskArray[1];
        Object initialForEachOrderedTaskArray2 = forEachOrderedTaskArray[2];
        Object initialForEachOrderedTaskArray3 = forEachOrderedTaskArray[3];
        Object initialForEachOrderedTaskArray4 = forEachOrderedTaskArray[4];
        Object initialForEachOrderedTaskArray5 = forEachOrderedTaskArray[5];
        Object initialForEachOrderedTaskArray6 = forEachOrderedTaskArray[6];
        Object initialForEachOrderedTaskArray7 = forEachOrderedTaskArray[7];
        Object initialForEachOrderedTaskArray8 = forEachOrderedTaskArray[8];
        Object initialForEachOrderedTaskArray9 = forEachOrderedTaskArray[9];
        Object initialForEachOrderedTaskArray10 = forEachOrderedTaskArray[10];
        Object initialForEachOrderedTaskArray11 = forEachOrderedTaskArray[11];
        Object initialForEachOrderedTaskArray12 = forEachOrderedTaskArray[12];
        Object initialForEachOrderedTaskArray13 = forEachOrderedTaskArray[13];
        Object initialForEachOrderedTaskArray14 = forEachOrderedTaskArray[14];
        Object initialForEachOrderedTaskArray15 = forEachOrderedTaskArray[15];
        Object initialForEachOrderedTaskArray16 = forEachOrderedTaskArray[16];
        Object initialForEachOrderedTaskArray17 = forEachOrderedTaskArray[17];
        Object initialForEachOrderedTaskArray18 = forEachOrderedTaskArray[18];
        Object initialForEachOrderedTaskArray19 = forEachOrderedTaskArray[19];
        Object initialForEachOrderedTaskArray20 = forEachOrderedTaskArray[20];
        Object initialForEachOrderedTaskArray21 = forEachOrderedTaskArray[21];
        Object initialForEachOrderedTaskArray22 = forEachOrderedTaskArray[22];
        Object initialForEachOrderedTaskArray23 = forEachOrderedTaskArray[23];
        Object initialForEachOrderedTaskArray24 = forEachOrderedTaskArray[24];
        Object initialForEachOrderedTaskArray25 = forEachOrderedTaskArray[25];
        Object initialForEachOrderedTaskArray26 = forEachOrderedTaskArray[26];
        Object initialForEachOrderedTaskArray27 = forEachOrderedTaskArray[27];
        Object initialForEachOrderedTaskArray28 = forEachOrderedTaskArray[28];
        Object initialForEachOrderedTaskArray29 = forEachOrderedTaskArray[29];
        Object initialForEachOrderedTaskArray30 = forEachOrderedTaskArray[30];
        Object initialForEachOrderedTaskArray31 = forEachOrderedTaskArray[31];
        Object initialForEachOrderedTaskArray32 = forEachOrderedTaskArray[32];
        Object initialForEachOrderedTaskArray33 = forEachOrderedTaskArray[33];
        Object initialForEachOrderedTaskArray34 = forEachOrderedTaskArray[34];
        Object initialForEachOrderedTaskArray35 = forEachOrderedTaskArray[35];
        Object initialForEachOrderedTaskArray36 = forEachOrderedTaskArray[36];
        Object initialForEachOrderedTaskArray37 = forEachOrderedTaskArray[37];
        Object initialForEachOrderedTaskArray38 = forEachOrderedTaskArray[38];
        
        jSONSerializer.writeWithFieldName(forEachOrderedTaskArray, null, null, 0);
        
        SerializeConfig serializeConfig2 = jSONSerializer.config;
        Object serializeConfig2ConfigSerializers = getFieldValue(serializeConfig2, "serializers");
        Object serializeConfig2ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig2ConfigSerializers, "buckets");
        Object serializeConfig2ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0 = get(serializeConfig2ConfigSerializersConfigSerializersBuckets, 0);
        Object finalJSONSerializerConfigSerializersBuckets0Value = getFieldValue(serializeConfig2ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0, "value");
        
        Object finalForEachOrderedTaskArray0 = forEachOrderedTaskArray[0];
        Object finalForEachOrderedTaskArray1 = forEachOrderedTaskArray[1];
        Object finalForEachOrderedTaskArray2 = forEachOrderedTaskArray[2];
        Object finalForEachOrderedTaskArray3 = forEachOrderedTaskArray[3];
        Object finalForEachOrderedTaskArray4 = forEachOrderedTaskArray[4];
        Object finalForEachOrderedTaskArray5 = forEachOrderedTaskArray[5];
        Object finalForEachOrderedTaskArray6 = forEachOrderedTaskArray[6];
        Object finalForEachOrderedTaskArray7 = forEachOrderedTaskArray[7];
        Object finalForEachOrderedTaskArray8 = forEachOrderedTaskArray[8];
        Object finalForEachOrderedTaskArray9 = forEachOrderedTaskArray[9];
        Object finalForEachOrderedTaskArray10 = forEachOrderedTaskArray[10];
        Object finalForEachOrderedTaskArray11 = forEachOrderedTaskArray[11];
        Object finalForEachOrderedTaskArray12 = forEachOrderedTaskArray[12];
        Object finalForEachOrderedTaskArray13 = forEachOrderedTaskArray[13];
        Object finalForEachOrderedTaskArray14 = forEachOrderedTaskArray[14];
        Object finalForEachOrderedTaskArray15 = forEachOrderedTaskArray[15];
        Object finalForEachOrderedTaskArray16 = forEachOrderedTaskArray[16];
        Object finalForEachOrderedTaskArray17 = forEachOrderedTaskArray[17];
        Object finalForEachOrderedTaskArray18 = forEachOrderedTaskArray[18];
        Object finalForEachOrderedTaskArray19 = forEachOrderedTaskArray[19];
        Object finalForEachOrderedTaskArray20 = forEachOrderedTaskArray[20];
        Object finalForEachOrderedTaskArray21 = forEachOrderedTaskArray[21];
        Object finalForEachOrderedTaskArray22 = forEachOrderedTaskArray[22];
        Object finalForEachOrderedTaskArray23 = forEachOrderedTaskArray[23];
        Object finalForEachOrderedTaskArray24 = forEachOrderedTaskArray[24];
        Object finalForEachOrderedTaskArray25 = forEachOrderedTaskArray[25];
        Object finalForEachOrderedTaskArray26 = forEachOrderedTaskArray[26];
        Object finalForEachOrderedTaskArray27 = forEachOrderedTaskArray[27];
        Object finalForEachOrderedTaskArray28 = forEachOrderedTaskArray[28];
        Object finalForEachOrderedTaskArray29 = forEachOrderedTaskArray[29];
        Object finalForEachOrderedTaskArray30 = forEachOrderedTaskArray[30];
        Object finalForEachOrderedTaskArray31 = forEachOrderedTaskArray[31];
        Object finalForEachOrderedTaskArray32 = forEachOrderedTaskArray[32];
        Object finalForEachOrderedTaskArray33 = forEachOrderedTaskArray[33];
        Object finalForEachOrderedTaskArray34 = forEachOrderedTaskArray[34];
        Object finalForEachOrderedTaskArray35 = forEachOrderedTaskArray[35];
        Object finalForEachOrderedTaskArray36 = forEachOrderedTaskArray[36];
        Object finalForEachOrderedTaskArray37 = forEachOrderedTaskArray[37];
        Object finalForEachOrderedTaskArray38 = forEachOrderedTaskArray[38];
        
        assertNull(finalJSONSerializerConfigSerializersBuckets0Value);
        
        assertNull(finalForEachOrderedTaskArray0);
        
        assertNull(finalForEachOrderedTaskArray1);
        
        assertNull(finalForEachOrderedTaskArray2);
        
        assertNull(finalForEachOrderedTaskArray3);
        
        assertNull(finalForEachOrderedTaskArray4);
        
        assertNull(finalForEachOrderedTaskArray5);
        
        assertNull(finalForEachOrderedTaskArray6);
        
        assertNull(finalForEachOrderedTaskArray7);
        
        assertNull(finalForEachOrderedTaskArray8);
        
        assertNull(finalForEachOrderedTaskArray9);
        
        assertNull(finalForEachOrderedTaskArray10);
        
        assertNull(finalForEachOrderedTaskArray11);
        
        assertNull(finalForEachOrderedTaskArray12);
        
        assertNull(finalForEachOrderedTaskArray13);
        
        assertNull(finalForEachOrderedTaskArray14);
        
        assertNull(finalForEachOrderedTaskArray15);
        
        assertNull(finalForEachOrderedTaskArray16);
        
        assertNull(finalForEachOrderedTaskArray17);
        
        assertNull(finalForEachOrderedTaskArray18);
        
        assertNull(finalForEachOrderedTaskArray19);
        
        assertNull(finalForEachOrderedTaskArray20);
        
        assertNull(finalForEachOrderedTaskArray21);
        
        assertNull(finalForEachOrderedTaskArray22);
        
        assertNull(finalForEachOrderedTaskArray23);
        
        assertNull(finalForEachOrderedTaskArray24);
        
        assertNull(finalForEachOrderedTaskArray25);
        
        assertNull(finalForEachOrderedTaskArray26);
        
        assertNull(finalForEachOrderedTaskArray27);
        
        assertNull(finalForEachOrderedTaskArray28);
        
        assertNull(finalForEachOrderedTaskArray29);
        
        assertNull(finalForEachOrderedTaskArray30);
        
        assertNull(finalForEachOrderedTaskArray31);
        
        assertNull(finalForEachOrderedTaskArray32);
        
        assertNull(finalForEachOrderedTaskArray33);
        
        assertNull(finalForEachOrderedTaskArray34);
        
        assertNull(finalForEachOrderedTaskArray35);
        
        assertNull(finalForEachOrderedTaskArray36);
        
        assertNull(finalForEachOrderedTaskArray37);
        
        assertNull(finalForEachOrderedTaskArray38);
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
        java.util.IdentityHashMap identityHashMap = ((java.util.IdentityHashMap) createInstance("java.util.IdentityHashMap"));
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
        
        jSONSerializer.writeReference(null);
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
        FileWriter fileWriter = ((FileWriter) createInstance("java.io.FileWriter"));
        setField(serializeWriter, "writer", fileWriter);
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
    public void testSetDateFormat1() throws Throwable  {
        JSONSerializer jSONSerializer = new JSONSerializer();
        String string = new String();
        
        jSONSerializer.setDateFormat(string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetDateFormat2() throws Throwable  {
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        setField(jSONSerializer, "dateFormat", null);
        setField(jSONSerializer, "dateFormatPattern", null);
        
        jSONSerializer.setDateFormat(((String) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetDateFormat3() throws Throwable  {
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
    public void testSetDateFormat4() throws Throwable  {
        JSONSerializer jSONSerializer = new JSONSerializer();
        
        jSONSerializer.setDateFormat(((DateFormat) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetDateFormat5() throws Throwable  {
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        setField(jSONSerializer, "dateFormat", null);
        setField(jSONSerializer, "dateFormatPattern", null);
        
        jSONSerializer.setDateFormat(((DateFormat) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetDateFormat6() throws Throwable  {
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        setField(jSONSerializer, "dateFormat", null);
        String string = new String("");
        setField(jSONSerializer, "dateFormatPattern", string);
        
        jSONSerializer.setDateFormat(((DateFormat) null));
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
    
    @Test(timeout = 10000)
    public void testHasNameFilters4() throws Throwable  {
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        setField(jSONSerializer, "nameFilters", null);
        JSONSerializer jSONSerializer1 = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        setField(jSONSerializer1, "nameFilters", arrayList);
        
        List initialJSONSerializerNameFilters = jSONSerializer.nameFilters;
        
        boolean actual = jSONSerializer.hasNameFilters(jSONSerializer1);
        
        assertTrue(actual);
        
        List finalJSONSerializerNameFilters = jSONSerializer.nameFilters;
        
        assertNull(finalJSONSerializerNameFilters);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testHasNameFilters5() throws Throwable  {
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
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(printWriter, "lock", null);
        FileWriter fileWriter = ((FileWriter) createInstance("java.io.FileWriter"));
        setField(fileWriter, "lock", null);
        StreamEncoder streamEncoder = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(streamEncoder, "lock", null);
        setField(fileWriter, "se", streamEncoder);
        setField(printWriter, "out", fileWriter);
        setField(serializeWriter, "writer", printWriter);
        serializeWriter.count = 3;
        char[] charArray = new char[4];
        serializeWriter.buf = charArray;
        setField(jSONSerializer, "out", serializeWriter);
        
        SerializeWriter serializeWriter1 = jSONSerializer.out;
        Object initialJSONSerializerOutLock = getFieldValue(serializeWriter1, "lock");
        SerializeWriter serializeWriter2 = jSONSerializer.out;
        Object serializeWriter2OutWriter = getFieldValue(serializeWriter2, "writer");
        Object initialJSONSerializerOutWriterLock = getFieldValue(serializeWriter2OutWriter, "lock");
        SerializeWriter serializeWriter3 = jSONSerializer.out;
        Object serializeWriter3OutWriter = getFieldValue(serializeWriter3, "writer");
        Object serializeWriter3OutWriterOutWriterOut = getFieldValue(serializeWriter3OutWriter, "out");
        Object initialJSONSerializerOutWriterOutLock = getFieldValue(serializeWriter3OutWriterOutWriterOut, "lock");
        SerializeWriter serializeWriter4 = jSONSerializer.out;
        Object serializeWriter4OutWriter = getFieldValue(serializeWriter4, "writer");
        Object serializeWriter4OutWriterOutWriterOut = getFieldValue(serializeWriter4OutWriter, "out");
        Object serializeWriter4OutWriterOutWriterOutOutWriterOutSe = getFieldValue(serializeWriter4OutWriterOutWriterOut, "se");
        Object initialJSONSerializerOutWriterOutSeLock = getFieldValue(serializeWriter4OutWriterOutWriterOutOutWriterOutSe, "lock");
        
        jSONSerializer.writeNull();
        
        SerializeWriter serializeWriter5 = jSONSerializer.out;
        Object finalJSONSerializerOutLock = getFieldValue(serializeWriter5, "lock");
        SerializeWriter serializeWriter6 = jSONSerializer.out;
        Object serializeWriter6OutWriter = getFieldValue(serializeWriter6, "writer");
        Object finalJSONSerializerOutWriterLock = getFieldValue(serializeWriter6OutWriter, "lock");
        SerializeWriter serializeWriter7 = jSONSerializer.out;
        Object serializeWriter7OutWriter = getFieldValue(serializeWriter7, "writer");
        Object serializeWriter7OutWriterOutWriterOut = getFieldValue(serializeWriter7OutWriter, "out");
        Object finalJSONSerializerOutWriterOutLock = getFieldValue(serializeWriter7OutWriterOutWriterOut, "lock");
        SerializeWriter serializeWriter8 = jSONSerializer.out;
        Object serializeWriter8OutWriter = getFieldValue(serializeWriter8, "writer");
        Object serializeWriter8OutWriterOutWriterOut = getFieldValue(serializeWriter8OutWriter, "out");
        Object serializeWriter8OutWriterOutWriterOutOutWriterOutSe = getFieldValue(serializeWriter8OutWriterOutWriterOut, "se");
        Object finalJSONSerializerOutWriterOutSeLock = getFieldValue(serializeWriter8OutWriterOutWriterOutOutWriterOutSe, "lock");
        int finalJSONSerializerOutCount = jSONSerializer.out.count;
        char finalJSONSerializerOutBuf3 = jSONSerializer.out.buf[3];
        
        assertNull(finalJSONSerializerOutLock);
        
        assertNull(finalJSONSerializerOutWriterLock);
        
        assertNull(finalJSONSerializerOutWriterOutLock);
        
        assertNull(finalJSONSerializerOutWriterOutSeLock);
        
        assertEquals(4, finalJSONSerializerOutCount);
        
        assertEquals('n', finalJSONSerializerOutBuf3);
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
        java.lang.Object[] classDataSlotArray = createArray("java.io.ObjectStreamClass$ClassDataSlot", 10);
        setField(serializeWriter, "lock", classDataSlotArray);
        OutputStreamWriter outputStreamWriter = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        setField(outputStreamWriter, "lock", classDataSlotArray);
        StreamEncoder streamEncoder = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(streamEncoder, "lock", classDataSlotArray);
        setField(streamEncoder, "isOpen", true);
        setField(outputStreamWriter, "se", streamEncoder);
        setField(serializeWriter, "writer", outputStreamWriter);
        serializeWriter.count = 2147483646;
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
    
    @Test(timeout = 10000)
    public void testWriteKeyValue4() throws Throwable  {
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        SerializeWriter serializeWriter = ((SerializeWriter) createInstance("com.alibaba.fastjson.serializer.SerializeWriter"));
        serializeWriter.count = 0;
        char[] charArray = new char[33];
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
        writeKeyValueMethod.invoke(jSONSerializer, writeKeyValueMethodArguments);
        
        int finalJSONSerializerOutCount = jSONSerializer.out.count;
        char finalJSONSerializerOutBuf0 = jSONSerializer.out.buf[0];
        char finalJSONSerializerOutBuf1 = jSONSerializer.out.buf[1];
        char finalJSONSerializerOutBuf2 = jSONSerializer.out.buf[2];
        char finalJSONSerializerOutBuf3 = jSONSerializer.out.buf[3];
        char finalJSONSerializerOutBuf4 = jSONSerializer.out.buf[4];
        char finalJSONSerializerOutBuf5 = jSONSerializer.out.buf[5];
        char finalJSONSerializerOutBuf6 = jSONSerializer.out.buf[6];
        char finalJSONSerializerOutBuf7 = jSONSerializer.out.buf[7];
        char finalJSONSerializerOutBuf8 = jSONSerializer.out.buf[8];
        char finalJSONSerializerOutBuf9 = jSONSerializer.out.buf[9];
        
        assertEquals(10, finalJSONSerializerOutCount);
        
        assertEquals('\u0001', finalJSONSerializerOutBuf0);
        
        assertEquals('n', finalJSONSerializerOutBuf1);
        
        assertEquals('u', finalJSONSerializerOutBuf2);
        
        assertEquals('l', finalJSONSerializerOutBuf3);
        
        assertEquals('l', finalJSONSerializerOutBuf4);
        
        assertEquals(':', finalJSONSerializerOutBuf5);
        
        assertEquals('n', finalJSONSerializerOutBuf6);
        
        assertEquals('u', finalJSONSerializerOutBuf7);
        
        assertEquals('l', finalJSONSerializerOutBuf8);
        
        assertEquals('l', finalJSONSerializerOutBuf9);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testWriteKeyValue5() throws Throwable  {
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
        IdentityHashMap identityHashMap = ((IdentityHashMap) createInstance("com.alibaba.fastjson.util.IdentityHashMap"));
        setField(identityHashMap, "indexMask", 38);
        java.lang.Object[] entryArray = createArray("com.alibaba.fastjson.util.IdentityHashMap$Entry", 39);
        setField(identityHashMap, "buckets", entryArray);
        setField(serializeConfig, "serializers", identityHashMap);
        setField(jSONSerializer, "config", serializeConfig);
        java.util.IllegalFormatWidthException[][] illegalFormatWidthExceptionArray = new java.util.IllegalFormatWidthException[9][];
        illegalFormatWidthExceptionArray[0] = ((java.util.IllegalFormatWidthException[]) null);
        illegalFormatWidthExceptionArray[1] = ((java.util.IllegalFormatWidthException[]) null);
        illegalFormatWidthExceptionArray[2] = ((java.util.IllegalFormatWidthException[]) null);
        illegalFormatWidthExceptionArray[3] = ((java.util.IllegalFormatWidthException[]) null);
        illegalFormatWidthExceptionArray[4] = ((java.util.IllegalFormatWidthException[]) null);
        illegalFormatWidthExceptionArray[5] = ((java.util.IllegalFormatWidthException[]) null);
        illegalFormatWidthExceptionArray[6] = ((java.util.IllegalFormatWidthException[]) null);
        illegalFormatWidthExceptionArray[7] = ((java.util.IllegalFormatWidthException[]) null);
        illegalFormatWidthExceptionArray[8] = ((java.util.IllegalFormatWidthException[]) null);
        
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
        
        jSONSerializer.writeWithFormat(illegalFormatWidthExceptionArray, null);
        
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
        
        java.util.IllegalFormatWidthException[] finalIllegalFormatWidthExceptionArray0 = illegalFormatWidthExceptionArray[0];
        java.util.IllegalFormatWidthException[] finalIllegalFormatWidthExceptionArray1 = illegalFormatWidthExceptionArray[1];
        java.util.IllegalFormatWidthException[] finalIllegalFormatWidthExceptionArray2 = illegalFormatWidthExceptionArray[2];
        java.util.IllegalFormatWidthException[] finalIllegalFormatWidthExceptionArray3 = illegalFormatWidthExceptionArray[3];
        java.util.IllegalFormatWidthException[] finalIllegalFormatWidthExceptionArray4 = illegalFormatWidthExceptionArray[4];
        java.util.IllegalFormatWidthException[] finalIllegalFormatWidthExceptionArray5 = illegalFormatWidthExceptionArray[5];
        java.util.IllegalFormatWidthException[] finalIllegalFormatWidthExceptionArray6 = illegalFormatWidthExceptionArray[6];
        java.util.IllegalFormatWidthException[] finalIllegalFormatWidthExceptionArray7 = illegalFormatWidthExceptionArray[7];
        java.util.IllegalFormatWidthException[] finalIllegalFormatWidthExceptionArray8 = illegalFormatWidthExceptionArray[8];
        
        assertFalse(initialJSONSerializerConfigSerializersBuckets0 == finalJSONSerializerConfigSerializersBuckets0);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets1);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets2);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets3);
        
        assertFalse(initialJSONSerializerConfigSerializersBuckets4 == finalJSONSerializerConfigSerializersBuckets4);
        
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
        
        assertFalse(initialJSONSerializerConfigSerializersBuckets32 == finalJSONSerializerConfigSerializersBuckets32);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets33);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets34);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets35);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets36);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets37);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets38);
        
        assertNull(finalIllegalFormatWidthExceptionArray0);
        
        assertNull(finalIllegalFormatWidthExceptionArray1);
        
        assertNull(finalIllegalFormatWidthExceptionArray2);
        
        assertNull(finalIllegalFormatWidthExceptionArray3);
        
        assertNull(finalIllegalFormatWidthExceptionArray4);
        
        assertNull(finalIllegalFormatWidthExceptionArray5);
        
        assertNull(finalIllegalFormatWidthExceptionArray6);
        
        assertNull(finalIllegalFormatWidthExceptionArray7);
        
        assertNull(finalIllegalFormatWidthExceptionArray8);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testWriteWithFormat3() throws Throwable  {
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        SerializeWriter serializeWriter = ((SerializeWriter) createInstance("com.alibaba.fastjson.serializer.SerializeWriter"));
        serializeWriter.count = -2013265922;
        char[] charArray = new char[10];
        serializeWriter.buf = charArray;
        setField(jSONSerializer, "out", serializeWriter);
        ArrayList arrayList = ((ArrayList) createInstance("java.util.ArrayList"));
        setField(arrayList, "modCount", 0);
        
        jSONSerializer.writeWithFormat(arrayList, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testWriteWithFormat4() throws Throwable  {
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        SerializeWriter serializeWriter = ((SerializeWriter) createInstance("com.alibaba.fastjson.serializer.SerializeWriter"));
        serializeWriter.count = -1073741827;
        char[] charArray = new char[0];
        serializeWriter.buf = charArray;
        setField(jSONSerializer, "out", serializeWriter);
        
        jSONSerializer.writeWithFormat(null, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testWriteWithFormat5() throws Throwable  {
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        SerializeConfig serializeConfig = ((SerializeConfig) createInstance("com.alibaba.fastjson.serializer.SerializeConfig"));
        IdentityHashMap identityHashMap = ((IdentityHashMap) createInstance("com.alibaba.fastjson.util.IdentityHashMap"));
        setField(identityHashMap, "indexMask", 38);
        java.lang.Object[] entryArray = createArray("com.alibaba.fastjson.util.IdentityHashMap$Entry", 39);
        Object entry = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        Object entry1 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry1, "next", entry1);
        java.lang.Object[] classDataSlotArray = createArray("[Ljava.io.ObjectStreamClass$ClassDataSlot;", 39);
        classDataSlotArray[0] = null;
        classDataSlotArray[1] = null;
        classDataSlotArray[2] = null;
        classDataSlotArray[3] = null;
        classDataSlotArray[4] = null;
        classDataSlotArray[5] = null;
        classDataSlotArray[6] = null;
        classDataSlotArray[7] = null;
        classDataSlotArray[8] = null;
        classDataSlotArray[9] = null;
        classDataSlotArray[10] = null;
        classDataSlotArray[11] = null;
        classDataSlotArray[12] = null;
        classDataSlotArray[13] = null;
        classDataSlotArray[14] = null;
        classDataSlotArray[15] = null;
        classDataSlotArray[16] = null;
        classDataSlotArray[17] = null;
        classDataSlotArray[18] = null;
        classDataSlotArray[19] = null;
        classDataSlotArray[20] = null;
        classDataSlotArray[21] = null;
        classDataSlotArray[22] = null;
        classDataSlotArray[23] = null;
        classDataSlotArray[24] = null;
        classDataSlotArray[25] = null;
        classDataSlotArray[26] = null;
        classDataSlotArray[27] = null;
        classDataSlotArray[28] = null;
        classDataSlotArray[29] = null;
        classDataSlotArray[30] = null;
        classDataSlotArray[31] = null;
        classDataSlotArray[32] = null;
        classDataSlotArray[33] = null;
        classDataSlotArray[34] = null;
        classDataSlotArray[35] = null;
        classDataSlotArray[36] = null;
        classDataSlotArray[37] = null;
        classDataSlotArray[38] = null;
        setField(entry1, "key", classDataSlotArray);
        setField(entry, "next", entry1);
        setField(entry, "key", classDataSlotArray);
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
        java.lang.NullPointerException[][] nullPointerExceptionArray = new java.lang.NullPointerException[9][];
        nullPointerExceptionArray[0] = ((java.lang.NullPointerException[]) null);
        nullPointerExceptionArray[1] = ((java.lang.NullPointerException[]) null);
        nullPointerExceptionArray[2] = ((java.lang.NullPointerException[]) null);
        nullPointerExceptionArray[3] = ((java.lang.NullPointerException[]) null);
        nullPointerExceptionArray[4] = ((java.lang.NullPointerException[]) null);
        nullPointerExceptionArray[5] = ((java.lang.NullPointerException[]) null);
        nullPointerExceptionArray[6] = ((java.lang.NullPointerException[]) null);
        nullPointerExceptionArray[7] = ((java.lang.NullPointerException[]) null);
        nullPointerExceptionArray[8] = ((java.lang.NullPointerException[]) null);
        
        jSONSerializer.writeWithFormat(nullPointerExceptionArray, null);
        
        java.lang.NullPointerException[] finalNullPointerExceptionArray0 = nullPointerExceptionArray[0];
        java.lang.NullPointerException[] finalNullPointerExceptionArray1 = nullPointerExceptionArray[1];
        java.lang.NullPointerException[] finalNullPointerExceptionArray2 = nullPointerExceptionArray[2];
        java.lang.NullPointerException[] finalNullPointerExceptionArray3 = nullPointerExceptionArray[3];
        java.lang.NullPointerException[] finalNullPointerExceptionArray4 = nullPointerExceptionArray[4];
        java.lang.NullPointerException[] finalNullPointerExceptionArray5 = nullPointerExceptionArray[5];
        java.lang.NullPointerException[] finalNullPointerExceptionArray6 = nullPointerExceptionArray[6];
        java.lang.NullPointerException[] finalNullPointerExceptionArray7 = nullPointerExceptionArray[7];
        java.lang.NullPointerException[] finalNullPointerExceptionArray8 = nullPointerExceptionArray[8];
        
        assertNull(finalNullPointerExceptionArray0);
        
        assertNull(finalNullPointerExceptionArray1);
        
        assertNull(finalNullPointerExceptionArray2);
        
        assertNull(finalNullPointerExceptionArray3);
        
        assertNull(finalNullPointerExceptionArray4);
        
        assertNull(finalNullPointerExceptionArray5);
        
        assertNull(finalNullPointerExceptionArray6);
        
        assertNull(finalNullPointerExceptionArray7);
        
        assertNull(finalNullPointerExceptionArray8);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testWriteWithFormat6() throws Throwable  {
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        SerializeWriter serializeWriter = ((SerializeWriter) createInstance("com.alibaba.fastjson.serializer.SerializeWriter"));
        SerializeWriter serializeWriter1 = ((SerializeWriter) createInstance("com.alibaba.fastjson.serializer.SerializeWriter"));
        setField(serializeWriter1, "writer", null);
        serializeWriter1.count = 10075;
        char[] charArray = new char[0];
        serializeWriter1.buf = charArray;
        setField(serializeWriter, "writer", serializeWriter1);
        serializeWriter.count = 1073741821;
        char[] charArray1 = new char[0];
        serializeWriter.buf = charArray1;
        setField(jSONSerializer, "out", serializeWriter);
        
        jSONSerializer.writeWithFormat(null, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testWriteWithFormat7() throws Throwable  {
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
    public void testWriteWithFormat8() throws Throwable  {
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        byte[] byteArray = new byte[9];
        
        jSONSerializer.writeWithFormat(byteArray, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testWriteWithFormat9() throws Throwable  {
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        SimpleDateFormat simpleDateFormat = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        setField(jSONSerializer, "dateFormat", simpleDateFormat);
        java.sql.Date date = ((java.sql.Date) createInstance("java.sql.Date"));
        
        jSONSerializer.writeWithFormat(date, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetObjectWriter1() throws Throwable  {
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        SerializeConfig serializeConfig = ((SerializeConfig) createInstance("com.alibaba.fastjson.serializer.SerializeConfig"));
        IdentityHashMap identityHashMap = ((IdentityHashMap) createInstance("com.alibaba.fastjson.util.IdentityHashMap"));
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
        IdentityHashMap identityHashMap = ((IdentityHashMap) createInstance("com.alibaba.fastjson.util.IdentityHashMap"));
        setField(identityHashMap, "indexMask", 38);
        java.lang.Object[] entryArray = createArray("com.alibaba.fastjson.util.IdentityHashMap$Entry", 39);
        Object entry = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry, "value", null);
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
        SerializeConfig serializeConfig39 = jSONSerializer.config;
        Object serializeConfig39ConfigSerializers = getFieldValue(serializeConfig39, "serializers");
        Object serializeConfig39ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig39ConfigSerializers, "buckets");
        Object serializeConfig39ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets38 = get(serializeConfig39ConfigSerializersConfigSerializersBuckets, 38);
        Object initialJSONSerializerConfigSerializersBuckets38Value = getFieldValue(serializeConfig39ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets38, "value");
        
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
        Object serializeConfig78ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets38 = get(serializeConfig78ConfigSerializersConfigSerializersBuckets, 38);
        Object finalJSONSerializerConfigSerializersBuckets38Value = getFieldValue(serializeConfig78ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets38, "value");
        
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
        
        assertFalse(initialJSONSerializerConfigSerializersBuckets38Value == finalJSONSerializerConfigSerializersBuckets38Value);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetObjectWriter3() throws Throwable  {
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        SerializeConfig serializeConfig = ((SerializeConfig) createInstance("com.alibaba.fastjson.serializer.SerializeConfig"));
        IdentityHashMap identityHashMap = ((IdentityHashMap) createInstance("com.alibaba.fastjson.util.IdentityHashMap"));
        setField(identityHashMap, "indexMask", 38);
        java.lang.Object[] entryArray = createArray("com.alibaba.fastjson.util.IdentityHashMap$Entry", 39);
        Object entry = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        Object entry1 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry1, "next", entry1);
        java.lang.Object[] handleTableArray = createArray("[Ljava.io.ObjectInputStream$HandleTable;", 39);
        handleTableArray[0] = null;
        handleTableArray[1] = null;
        handleTableArray[2] = null;
        handleTableArray[3] = null;
        handleTableArray[4] = null;
        handleTableArray[5] = null;
        handleTableArray[6] = null;
        handleTableArray[7] = null;
        handleTableArray[8] = null;
        handleTableArray[9] = null;
        handleTableArray[10] = null;
        handleTableArray[11] = null;
        handleTableArray[12] = null;
        handleTableArray[13] = null;
        handleTableArray[14] = null;
        handleTableArray[15] = null;
        handleTableArray[16] = null;
        handleTableArray[17] = null;
        handleTableArray[18] = null;
        handleTableArray[19] = null;
        handleTableArray[20] = null;
        handleTableArray[21] = null;
        handleTableArray[22] = null;
        handleTableArray[23] = null;
        handleTableArray[24] = null;
        handleTableArray[25] = null;
        handleTableArray[26] = null;
        handleTableArray[27] = null;
        handleTableArray[28] = null;
        handleTableArray[29] = null;
        handleTableArray[30] = null;
        handleTableArray[31] = null;
        handleTableArray[32] = null;
        handleTableArray[33] = null;
        handleTableArray[34] = null;
        handleTableArray[35] = null;
        handleTableArray[36] = null;
        handleTableArray[37] = null;
        handleTableArray[38] = null;
        setField(entry1, "key", handleTableArray);
        setField(entry, "next", entry1);
        setField(entry, "key", handleTableArray);
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
        Class class1 = Object.class;
        
        jSONSerializer.getObjectWriter(class1);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetObjectWriter4() throws Throwable  {
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        SerializeConfig serializeConfig = ((SerializeConfig) createInstance("com.alibaba.fastjson.serializer.SerializeConfig"));
        IdentityHashMap identityHashMap = ((IdentityHashMap) createInstance("com.alibaba.fastjson.util.IdentityHashMap"));
        setField(identityHashMap, "indexMask", 30);
        java.lang.Object[] entryArray = createArray("com.alibaba.fastjson.util.IdentityHashMap$Entry", 31);
        Object entry = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        Object entry1 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry1, "next", null);
        setField(entry1, "value", null);
        Class class1 = Object.class;
        setField(entry1, "key", class1);
        setField(entry, "next", entry1);
        setField(entry, "value", null);
        java.lang.Object[] ofRefArray = createArray("java.util.stream.ForEachOps$ForEachOp$OfRef", 0);
        setField(entry, "key", ofRefArray);
        entryArray[30] = entry;
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
        
        SerializeConfig serializeConfig31 = jSONSerializer.config;
        Object serializeConfig31ConfigSerializers = getFieldValue(serializeConfig31, "serializers");
        Object serializeConfig31ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig31ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets0 = get(serializeConfig31ConfigSerializersConfigSerializersBuckets, 0);
        SerializeConfig serializeConfig32 = jSONSerializer.config;
        Object serializeConfig32ConfigSerializers = getFieldValue(serializeConfig32, "serializers");
        Object serializeConfig32ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig32ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets1 = get(serializeConfig32ConfigSerializersConfigSerializersBuckets, 1);
        SerializeConfig serializeConfig33 = jSONSerializer.config;
        Object serializeConfig33ConfigSerializers = getFieldValue(serializeConfig33, "serializers");
        Object serializeConfig33ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig33ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets2 = get(serializeConfig33ConfigSerializersConfigSerializersBuckets, 2);
        SerializeConfig serializeConfig34 = jSONSerializer.config;
        Object serializeConfig34ConfigSerializers = getFieldValue(serializeConfig34, "serializers");
        Object serializeConfig34ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig34ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets3 = get(serializeConfig34ConfigSerializersConfigSerializersBuckets, 3);
        SerializeConfig serializeConfig35 = jSONSerializer.config;
        Object serializeConfig35ConfigSerializers = getFieldValue(serializeConfig35, "serializers");
        Object serializeConfig35ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig35ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets4 = get(serializeConfig35ConfigSerializersConfigSerializersBuckets, 4);
        SerializeConfig serializeConfig36 = jSONSerializer.config;
        Object serializeConfig36ConfigSerializers = getFieldValue(serializeConfig36, "serializers");
        Object serializeConfig36ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig36ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets5 = get(serializeConfig36ConfigSerializersConfigSerializersBuckets, 5);
        SerializeConfig serializeConfig37 = jSONSerializer.config;
        Object serializeConfig37ConfigSerializers = getFieldValue(serializeConfig37, "serializers");
        Object serializeConfig37ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig37ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets6 = get(serializeConfig37ConfigSerializersConfigSerializersBuckets, 6);
        SerializeConfig serializeConfig38 = jSONSerializer.config;
        Object serializeConfig38ConfigSerializers = getFieldValue(serializeConfig38, "serializers");
        Object serializeConfig38ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig38ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets7 = get(serializeConfig38ConfigSerializersConfigSerializersBuckets, 7);
        SerializeConfig serializeConfig39 = jSONSerializer.config;
        Object serializeConfig39ConfigSerializers = getFieldValue(serializeConfig39, "serializers");
        Object serializeConfig39ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig39ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets8 = get(serializeConfig39ConfigSerializersConfigSerializersBuckets, 8);
        SerializeConfig serializeConfig40 = jSONSerializer.config;
        Object serializeConfig40ConfigSerializers = getFieldValue(serializeConfig40, "serializers");
        Object serializeConfig40ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig40ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets9 = get(serializeConfig40ConfigSerializersConfigSerializersBuckets, 9);
        SerializeConfig serializeConfig41 = jSONSerializer.config;
        Object serializeConfig41ConfigSerializers = getFieldValue(serializeConfig41, "serializers");
        Object serializeConfig41ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig41ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets10 = get(serializeConfig41ConfigSerializersConfigSerializersBuckets, 10);
        SerializeConfig serializeConfig42 = jSONSerializer.config;
        Object serializeConfig42ConfigSerializers = getFieldValue(serializeConfig42, "serializers");
        Object serializeConfig42ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig42ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets11 = get(serializeConfig42ConfigSerializersConfigSerializersBuckets, 11);
        SerializeConfig serializeConfig43 = jSONSerializer.config;
        Object serializeConfig43ConfigSerializers = getFieldValue(serializeConfig43, "serializers");
        Object serializeConfig43ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig43ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets12 = get(serializeConfig43ConfigSerializersConfigSerializersBuckets, 12);
        SerializeConfig serializeConfig44 = jSONSerializer.config;
        Object serializeConfig44ConfigSerializers = getFieldValue(serializeConfig44, "serializers");
        Object serializeConfig44ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig44ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets13 = get(serializeConfig44ConfigSerializersConfigSerializersBuckets, 13);
        SerializeConfig serializeConfig45 = jSONSerializer.config;
        Object serializeConfig45ConfigSerializers = getFieldValue(serializeConfig45, "serializers");
        Object serializeConfig45ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig45ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets14 = get(serializeConfig45ConfigSerializersConfigSerializersBuckets, 14);
        SerializeConfig serializeConfig46 = jSONSerializer.config;
        Object serializeConfig46ConfigSerializers = getFieldValue(serializeConfig46, "serializers");
        Object serializeConfig46ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig46ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets15 = get(serializeConfig46ConfigSerializersConfigSerializersBuckets, 15);
        SerializeConfig serializeConfig47 = jSONSerializer.config;
        Object serializeConfig47ConfigSerializers = getFieldValue(serializeConfig47, "serializers");
        Object serializeConfig47ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig47ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets16 = get(serializeConfig47ConfigSerializersConfigSerializersBuckets, 16);
        SerializeConfig serializeConfig48 = jSONSerializer.config;
        Object serializeConfig48ConfigSerializers = getFieldValue(serializeConfig48, "serializers");
        Object serializeConfig48ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig48ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets17 = get(serializeConfig48ConfigSerializersConfigSerializersBuckets, 17);
        SerializeConfig serializeConfig49 = jSONSerializer.config;
        Object serializeConfig49ConfigSerializers = getFieldValue(serializeConfig49, "serializers");
        Object serializeConfig49ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig49ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets18 = get(serializeConfig49ConfigSerializersConfigSerializersBuckets, 18);
        SerializeConfig serializeConfig50 = jSONSerializer.config;
        Object serializeConfig50ConfigSerializers = getFieldValue(serializeConfig50, "serializers");
        Object serializeConfig50ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig50ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets19 = get(serializeConfig50ConfigSerializersConfigSerializersBuckets, 19);
        SerializeConfig serializeConfig51 = jSONSerializer.config;
        Object serializeConfig51ConfigSerializers = getFieldValue(serializeConfig51, "serializers");
        Object serializeConfig51ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig51ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets20 = get(serializeConfig51ConfigSerializersConfigSerializersBuckets, 20);
        SerializeConfig serializeConfig52 = jSONSerializer.config;
        Object serializeConfig52ConfigSerializers = getFieldValue(serializeConfig52, "serializers");
        Object serializeConfig52ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig52ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets21 = get(serializeConfig52ConfigSerializersConfigSerializersBuckets, 21);
        SerializeConfig serializeConfig53 = jSONSerializer.config;
        Object serializeConfig53ConfigSerializers = getFieldValue(serializeConfig53, "serializers");
        Object serializeConfig53ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig53ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets22 = get(serializeConfig53ConfigSerializersConfigSerializersBuckets, 22);
        SerializeConfig serializeConfig54 = jSONSerializer.config;
        Object serializeConfig54ConfigSerializers = getFieldValue(serializeConfig54, "serializers");
        Object serializeConfig54ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig54ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets23 = get(serializeConfig54ConfigSerializersConfigSerializersBuckets, 23);
        SerializeConfig serializeConfig55 = jSONSerializer.config;
        Object serializeConfig55ConfigSerializers = getFieldValue(serializeConfig55, "serializers");
        Object serializeConfig55ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig55ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets24 = get(serializeConfig55ConfigSerializersConfigSerializersBuckets, 24);
        SerializeConfig serializeConfig56 = jSONSerializer.config;
        Object serializeConfig56ConfigSerializers = getFieldValue(serializeConfig56, "serializers");
        Object serializeConfig56ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig56ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets25 = get(serializeConfig56ConfigSerializersConfigSerializersBuckets, 25);
        SerializeConfig serializeConfig57 = jSONSerializer.config;
        Object serializeConfig57ConfigSerializers = getFieldValue(serializeConfig57, "serializers");
        Object serializeConfig57ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig57ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets26 = get(serializeConfig57ConfigSerializersConfigSerializersBuckets, 26);
        SerializeConfig serializeConfig58 = jSONSerializer.config;
        Object serializeConfig58ConfigSerializers = getFieldValue(serializeConfig58, "serializers");
        Object serializeConfig58ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig58ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets27 = get(serializeConfig58ConfigSerializersConfigSerializersBuckets, 27);
        SerializeConfig serializeConfig59 = jSONSerializer.config;
        Object serializeConfig59ConfigSerializers = getFieldValue(serializeConfig59, "serializers");
        Object serializeConfig59ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig59ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets28 = get(serializeConfig59ConfigSerializersConfigSerializersBuckets, 28);
        SerializeConfig serializeConfig60 = jSONSerializer.config;
        Object serializeConfig60ConfigSerializers = getFieldValue(serializeConfig60, "serializers");
        Object serializeConfig60ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig60ConfigSerializers, "buckets");
        Object finalJSONSerializerConfigSerializersBuckets29 = get(serializeConfig60ConfigSerializersConfigSerializersBuckets, 29);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets0);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets1);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets2);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets3);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets4);
        
        assertNull(finalJSONSerializerConfigSerializersBuckets5);
        
        assertFalse(initialJSONSerializerConfigSerializersBuckets6 == finalJSONSerializerConfigSerializersBuckets6);
        
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
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testWrite12() throws Throwable  {
        Object object = new Object();
        
        JSONSerializer.write(((Writer) null), object);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testWrite13() throws Throwable  {
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
    
    
    ///region Errors report for write
    
    public void testWrite_errors2()
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
        JSONSerializer actual = new JSONSerializer();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testJSONSerializer2() {
        SerializeWriter serializeWriter = new SerializeWriter();
        JSONSerializer actual = new JSONSerializer(serializeWriter);
    }
    ///endregion
    
    
    ///region Errors report for <init>
    
    public void testJSONSerializer_errors()
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
    public void testJSONSerializer4() {
        SerializeConfig serializeConfig = new SerializeConfig();
        JSONSerializer actual = new JSONSerializer(serializeConfig);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testJSONSerializer5() {
        SerializeWriter serializeWriter = new SerializeWriter();
        SerializeConfig serializeConfig = new SerializeConfig();
        JSONSerializer actual = new JSONSerializer(serializeWriter, serializeConfig);
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
