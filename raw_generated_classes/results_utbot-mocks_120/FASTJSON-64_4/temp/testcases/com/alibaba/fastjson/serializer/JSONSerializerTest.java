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
import java.lang.reflect.Method;
import java.time.chrono.IsoEra;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.concurrent.ThreadPoolExecutor;
import java.io.Writer;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Array;
import java.util.Objects;
import java.util.Map;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Iterator;
import sun.misc.Unsafe;

import static org.mockito.Mockito.mock;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.junit.Assert.assertNull;

public class JSONSerializerTest {
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
        
        jSONSerializer.checkValue(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCheckValue3() throws Throwable  {
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        setField(jSONSerializer, "contextValueFilters", null);
        setField(jSONSerializer, "valueFilters", null);
        SerializeWriter serializeWriterMock = mock(SerializeWriter.class);
        serializeWriterMock.writeNonStringValueAsString = false;
        setField(jSONSerializer, "out", serializeWriterMock);
        SerializeFilterable serializeFilterableMock = mock(SerializeFilterable.class);
        setField(serializeFilterableMock, "contextValueFilters", null);
        setField(serializeFilterableMock, "valueFilters", null);
        
        boolean actual = jSONSerializer.checkValue(serializeFilterableMock);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCheckValue4() throws Throwable  {
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        setField(jSONSerializer, "contextValueFilters", null);
        setField(jSONSerializer, "valueFilters", null);
        SerializeWriter serializeWriterMock = mock(SerializeWriter.class);
        serializeWriterMock.writeNonStringValueAsString = true;
        setField(jSONSerializer, "out", serializeWriterMock);
        SerializeFilterable serializeFilterableMock = mock(SerializeFilterable.class);
        setField(serializeFilterableMock, "contextValueFilters", null);
        setField(serializeFilterableMock, "valueFilters", null);
        
        boolean actual = jSONSerializer.checkValue(serializeFilterableMock);
        
        assertTrue(actual);
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
        SerializeWriter serializeWriterMock = mock(SerializeWriter.class);
        serializeWriterMock.disableCircularReferenceDetect = true;
        setField(jSONSerializer, "out", serializeWriterMock);
        SerialContext serialContextMock = mock(SerialContext.class);
        
        jSONSerializer.setContext(serialContextMock, null, null, 0, 0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetContext3() throws Throwable  {
        JSONSerializer jSONSerializer = new JSONSerializer();
        SerialContext serialContext = ((SerialContext) createInstance("com.alibaba.fastjson.serializer.SerialContext"));
        Object object = new Object();
        Object object1 = new Object();
        
        jSONSerializer.setContext(serialContext, object, object1, 0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetContext4() throws Throwable  {
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        SerializeWriter serializeWriterMock = mock(SerializeWriter.class);
        serializeWriterMock.disableCircularReferenceDetect = true;
        setField(jSONSerializer, "out", serializeWriterMock);
        SerialContext serialContextMock = mock(SerialContext.class);
        
        jSONSerializer.setContext(serialContextMock, null, null, 0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetContext5() throws Throwable  {
        JSONSerializer jSONSerializer = new JSONSerializer();
        SerialContext serialContext = ((SerialContext) createInstance("com.alibaba.fastjson.serializer.SerialContext"));
        
        jSONSerializer.setContext(serialContext);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetContext6() throws Throwable  {
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        setField(jSONSerializer, "context", null);
        
        jSONSerializer.setContext(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetContext7() throws Throwable  {
        JSONSerializer jSONSerializer = new JSONSerializer();
        Object object = new Object();
        Object object1 = new Object();
        
        jSONSerializer.setContext(object, object1);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetContext8() throws Throwable  {
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        setField(jSONSerializer, "context", null);
        SerializeWriter serializeWriterMock = mock(SerializeWriter.class);
        serializeWriterMock.disableCircularReferenceDetect = true;
        setField(jSONSerializer, "out", serializeWriterMock);
        java.lang.Object[] forEachTaskArray = createArray("java.util.stream.ForEachOps$ForEachTask", 0);
        java.lang.Object[] forEachTaskArray1 = createArray("java.util.stream.ForEachOps$ForEachTask", 0);
        
        jSONSerializer.setContext(forEachTaskArray, forEachTaskArray1);
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
        SerialContext serialContextMock = mock(SerialContext.class);
        setField(serialContextMock, "parent", serialContextMock);
        jSONSerializer.context = serialContextMock;
        
        jSONSerializer.popContext();
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
        SerializeConfig serializeConfigMock = mock(SerializeConfig.class);
        setField(jSONSerializer, "config", serializeConfigMock);
        
        SerializeConfig actual = jSONSerializer.getMapping();
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(serializeConfigMock, actual));
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
        
        jSONSerializer.hasNameFilters(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testHasNameFilters3() throws Throwable  {
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        setField(jSONSerializer, "nameFilters", null);
        SerializeFilterable serializeFilterableMock = mock(SerializeFilterable.class);
        setField(serializeFilterableMock, "nameFilters", null);
        
        boolean actual = jSONSerializer.hasNameFilters(serializeFilterableMock);
        
        assertFalse(actual);
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
        SerializeWriter serializeWriterMock = mock(SerializeWriter.class);
        setField(jSONSerializer, "out", serializeWriterMock);
        
        SerializeWriter actual = jSONSerializer.getWriter();
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(serializeWriterMock, actual));
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
    
    @Test(timeout = 10000)
    public void testWriteNull2() throws Throwable  {
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        SerializeWriter serializeWriterMock = mock(SerializeWriter.class);
        setField(jSONSerializer, "out", serializeWriterMock);
        
        jSONSerializer.writeNull();
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
    
    @Test(timeout = 10000)
    public void testWriteKeyValue2() throws Throwable  {
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        SerializeWriter serializeWriterMock = mock(SerializeWriter.class);
        setField(jSONSerializer, "out", serializeWriterMock);
        
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
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testWriteKeyValue3() throws Throwable  {
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        SerializeWriter serializeWriterMock = mock(SerializeWriter.class);
        setField(jSONSerializer, "out", serializeWriterMock);
        
        Class jSONSerializerClazz = Class.forName("com.alibaba.fastjson.serializer.JSONSerializer");
        Class charType = char.class;
        Class stringType = Class.forName("java.lang.String");
        Class objectType = Class.forName("java.lang.Object");
        Method writeKeyValueMethod = jSONSerializerClazz.getDeclaredMethod("writeKeyValue", charType, stringType, objectType);
        writeKeyValueMethod.setAccessible(true);
        java.lang.Object[] writeKeyValueMethodArguments = new java.lang.Object[3];
        writeKeyValueMethodArguments[0] = '\u0000';
        writeKeyValueMethodArguments[1] = null;
        writeKeyValueMethodArguments[2] = null;
        writeKeyValueMethod.invoke(jSONSerializer, writeKeyValueMethodArguments);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testWriteKeyValue4() throws Throwable  {
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        SerializeWriter serializeWriterMock = mock(SerializeWriter.class);
        setField(jSONSerializer, "out", serializeWriterMock);
        SerializeConfig serializeConfigMock = mock(SerializeConfig.class);
        ObjectSerializer objectSerializerMock = mock(ObjectSerializer.class);
        when(serializeConfigMock.getObjectWriter(any())).thenReturn(objectSerializerMock);
        setField(jSONSerializer, "config", serializeConfigMock);
        java.lang.Object[] forEachOrderedTaskArray = createArray("java.util.stream.ForEachOps$ForEachOrderedTask", 0);
        
        Class jSONSerializerClazz = Class.forName("com.alibaba.fastjson.serializer.JSONSerializer");
        Class charType = char.class;
        Class stringType = Class.forName("java.lang.String");
        Class forEachOrderedTaskArrayType = Class.forName("java.lang.Object");
        Method writeKeyValueMethod = jSONSerializerClazz.getDeclaredMethod("writeKeyValue", charType, stringType, forEachOrderedTaskArrayType);
        writeKeyValueMethod.setAccessible(true);
        java.lang.Object[] writeKeyValueMethodArguments = new java.lang.Object[3];
        writeKeyValueMethodArguments[0] = '\u0000';
        writeKeyValueMethodArguments[1] = null;
        writeKeyValueMethodArguments[2] = ((Object) forEachOrderedTaskArray);
        writeKeyValueMethod.invoke(jSONSerializer, writeKeyValueMethodArguments);
    }
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
    
    @Test(timeout = 10000)
    public void testWriteWithFormat2() throws Throwable  {
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        SerializeWriter serializeWriterMock = mock(SerializeWriter.class);
        setField(jSONSerializer, "out", serializeWriterMock);
        
        jSONSerializer.writeWithFormat(null, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testWriteWithFormat3() throws Throwable  {
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        SerializeWriter serializeWriterMock = mock(SerializeWriter.class);
        setField(jSONSerializer, "out", serializeWriterMock);
        ArrayList arrayList = ((ArrayList) createInstance("java.util.ArrayList"));
        setField(arrayList, "modCount", 0);
        setField(arrayList, "size", -2147483647);
        
        jSONSerializer.writeWithFormat(arrayList, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testWriteWithFormat4() throws Throwable  {
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        SerializeConfig serializeConfigMock = mock(SerializeConfig.class);
        ObjectSerializer objectSerializerMock = mock(ObjectSerializer.class);
        when(serializeConfigMock.getObjectWriter(any())).thenReturn(objectSerializerMock);
        setField(jSONSerializer, "config", serializeConfigMock);
        java.util.concurrent.ConcurrentHashMap[][] concurrentHashMapArray = new java.util.concurrent.ConcurrentHashMap[9][];
        concurrentHashMapArray[0] = ((java.util.concurrent.ConcurrentHashMap[]) null);
        concurrentHashMapArray[1] = ((java.util.concurrent.ConcurrentHashMap[]) null);
        concurrentHashMapArray[2] = ((java.util.concurrent.ConcurrentHashMap[]) null);
        concurrentHashMapArray[3] = ((java.util.concurrent.ConcurrentHashMap[]) null);
        concurrentHashMapArray[4] = ((java.util.concurrent.ConcurrentHashMap[]) null);
        concurrentHashMapArray[5] = ((java.util.concurrent.ConcurrentHashMap[]) null);
        concurrentHashMapArray[6] = ((java.util.concurrent.ConcurrentHashMap[]) null);
        concurrentHashMapArray[7] = ((java.util.concurrent.ConcurrentHashMap[]) null);
        concurrentHashMapArray[8] = ((java.util.concurrent.ConcurrentHashMap[]) null);
        
        jSONSerializer.writeWithFormat(concurrentHashMapArray, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetObjectWriter1() throws Throwable  {
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        SerializeConfig serializeConfigMock = mock(SerializeConfig.class);
        when(serializeConfigMock.getObjectWriter(any())).thenReturn(((ObjectSerializer) null));
        setField(jSONSerializer, "config", serializeConfigMock);
        Class class1 = Object.class;
        
        ObjectSerializer actual = jSONSerializer.getObjectWriter(class1);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIsEnabled1() throws Throwable  {
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        SerializeWriter serializeWriterMock = mock(SerializeWriter.class);
        when(serializeWriterMock.isEnabled(org.mockito.ArgumentMatchers.any(SerializerFeature.class))).thenReturn(false);
        setField(jSONSerializer, "out", serializeWriterMock);
        
        boolean actual = jSONSerializer.isEnabled(null);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testConfig1() throws Throwable  {
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        SerializeWriter serializeWriterMock = mock(SerializeWriter.class);
        setField(jSONSerializer, "out", serializeWriterMock);
        
        jSONSerializer.config(null, false);
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
        java.time.chrono.IsoEra[] isoEraArray = new java.time.chrono.IsoEra[0];
        
        jSONSerializer.writeReference(isoEraArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testWriteReference3() throws Throwable  {
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        SerialContext serialContextMock = mock(SerialContext.class);
        java.lang.Object[] forEachOrderedTaskArray = createArray("java.util.stream.ForEachOps$ForEachOrderedTask", 0);
        setField(serialContextMock, "object", forEachOrderedTaskArray);
        jSONSerializer.context = serialContextMock;
        SerializeWriter serializeWriterMock = mock(SerializeWriter.class);
        setField(jSONSerializer, "out", serializeWriterMock);
        
        jSONSerializer.writeReference(forEachOrderedTaskArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testWriteReference4() throws Throwable  {
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        SerialContext serialContextMock = mock(SerialContext.class);
        java.lang.Object[] forEachOrderedTaskArray = createArray("java.util.stream.ForEachOps$ForEachOrderedTask", 0);
        setField(serialContextMock, "object", forEachOrderedTaskArray);
        SerialContext serialContextMock1 = mock(SerialContext.class);
        java.lang.Object[] forEachOrderedTaskArray1 = createArray("java.util.stream.ForEachOps$ForEachOrderedTask", 0);
        setField(serialContextMock1, "object", forEachOrderedTaskArray1);
        setField(serialContextMock1, "parent", null);
        setField(serialContextMock, "parent", serialContextMock1);
        jSONSerializer.context = serialContextMock;
        SerializeWriter serializeWriterMock = mock(SerializeWriter.class);
        setField(jSONSerializer, "out", serializeWriterMock);
        
        jSONSerializer.writeReference(forEachOrderedTaskArray1);
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
        
        jSONSerializer.hasPropertyFilters(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testHasPropertyFilters3() throws Throwable  {
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        setField(jSONSerializer, "propertyFilters", null);
        SerializeFilterable serializeFilterableMock = mock(SerializeFilterable.class);
        setField(serializeFilterableMock, "propertyFilters", null);
        
        boolean actual = jSONSerializer.hasPropertyFilters(serializeFilterableMock);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testHasPropertyFilters4() throws Throwable  {
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        setField(jSONSerializer, "propertyFilters", null);
        SerializeFilterable serializeFilterableMock = mock(SerializeFilterable.class);
        ArrayList arrayList = new ArrayList();
        setField(serializeFilterableMock, "propertyFilters", arrayList);
        
        boolean actual = jSONSerializer.hasPropertyFilters(serializeFilterableMock);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testHasPropertyFilters5() throws Throwable  {
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        setField(jSONSerializer, "propertyFilters", null);
        SerializeFilterable serializeFilterableMock = mock(SerializeFilterable.class);
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        setField(serializeFilterableMock, "propertyFilters", arrayList);
        
        boolean actual = jSONSerializer.hasPropertyFilters(serializeFilterableMock);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testHasPropertyFilters6() throws Throwable  {
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        ArrayList arrayList = new ArrayList();
        setField(jSONSerializer, "propertyFilters", arrayList);
        
        jSONSerializer.hasPropertyFilters(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testHasPropertyFilters7() throws Throwable  {
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        setField(jSONSerializer, "propertyFilters", arrayList);
        SerializeFilterable serializeFilterableMock = mock(SerializeFilterable.class);
        setField(serializeFilterableMock, "propertyFilters", null);
        
        boolean actual = jSONSerializer.hasPropertyFilters(serializeFilterableMock);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testWriteWithFieldName1() throws Throwable  {
        JSONSerializer jSONSerializer = new JSONSerializer();
        Object object = new Object();
        Object object1 = new Object();
        
        jSONSerializer.writeWithFieldName(object, object1, null, 0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testWriteWithFieldName2() throws Throwable  {
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        SerializeWriter serializeWriterMock = mock(SerializeWriter.class);
        setField(jSONSerializer, "out", serializeWriterMock);
        
        jSONSerializer.writeWithFieldName(null, null, null, 0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testWriteWithFieldName3() throws Throwable  {
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        SerializeConfig serializeConfigMock = mock(SerializeConfig.class);
        when(serializeConfigMock.getObjectWriter(any())).thenReturn(((ObjectSerializer) null));
        setField(jSONSerializer, "config", serializeConfigMock);
        java.util.concurrent.ThreadPoolExecutor[] threadPoolExecutorArray = new java.util.concurrent.ThreadPoolExecutor[0];
        java.lang.Object[] forEachOrderedTaskArray = createArray("java.util.stream.ForEachOps$ForEachOrderedTask", 0);
        Class class1 = Object.class;
        
        jSONSerializer.writeWithFieldName(threadPoolExecutorArray, forEachOrderedTaskArray, class1, 0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testWriteWithFieldName4() throws Throwable  {
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        SerializeConfig serializeConfigMock = mock(SerializeConfig.class);
        ObjectSerializer objectSerializerMock = mock(ObjectSerializer.class);
        when(serializeConfigMock.getObjectWriter(any())).thenReturn(objectSerializerMock);
        setField(jSONSerializer, "config", serializeConfigMock);
        java.lang.Object[] forEachOrderedTaskArray = createArray("java.util.stream.ForEachOps$ForEachOrderedTask", 0);
        
        jSONSerializer.writeWithFieldName(forEachOrderedTaskArray, null, null, 0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testWriteWithFieldName5() throws Throwable  {
        JSONSerializer jSONSerializer = new JSONSerializer();
        Object object = new Object();
        Object object1 = new Object();
        
        jSONSerializer.writeWithFieldName(object, object1);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testWriteWithFieldName6() throws Throwable  {
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        SerializeWriter serializeWriterMock = mock(SerializeWriter.class);
        setField(jSONSerializer, "out", serializeWriterMock);
        
        jSONSerializer.writeWithFieldName(null, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testWriteWithFieldName7() throws Throwable  {
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        SerializeConfig serializeConfigMock = mock(SerializeConfig.class);
        ObjectSerializer objectSerializerMock = mock(ObjectSerializer.class);
        when(serializeConfigMock.getObjectWriter(any())).thenReturn(objectSerializerMock);
        setField(jSONSerializer, "config", serializeConfigMock);
        java.lang.Object[] forEachOrderedTaskArray = createArray("java.util.stream.ForEachOps$ForEachOrderedTask", 0);
        
        jSONSerializer.writeWithFieldName(forEachOrderedTaskArray, null);
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
        SerializeWriter serializeWriterMock = mock(SerializeWriter.class);
        setField(jSONSerializer, "out", serializeWriterMock);
        
        jSONSerializer.println();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testPrintln3() throws Throwable  {
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        setField(jSONSerializer, "indent", null);
        setField(jSONSerializer, "indentCount", 1);
        SerializeWriter serializeWriterMock = mock(SerializeWriter.class);
        setField(jSONSerializer, "out", serializeWriterMock);
        
        jSONSerializer.println();
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
    
    @Test(timeout = 10000)
    public void testWrite2() throws Throwable  {
        JSONSerializer jSONSerializer = new JSONSerializer();
        Object object = new Object();
        
        jSONSerializer.write(object);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testWrite3() throws Throwable  {
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        SerializeWriter serializeWriterMock = mock(SerializeWriter.class);
        setField(jSONSerializer, "out", serializeWriterMock);
        
        jSONSerializer.write(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testWrite4() throws Throwable  {
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        SerializeConfig serializeConfigMock = mock(SerializeConfig.class);
        ObjectSerializer objectSerializerMock = mock(ObjectSerializer.class);
        when(serializeConfigMock.getObjectWriter(any())).thenReturn(objectSerializerMock);
        setField(jSONSerializer, "config", serializeConfigMock);
        java.lang.Object[] forEachOrderedTaskArray = createArray("java.util.stream.ForEachOps$ForEachOrderedTask", 0);
        
        jSONSerializer.write(forEachOrderedTaskArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testWrite5() throws Throwable  {
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        SerializeConfig serializeConfigMock = mock(SerializeConfig.class);
        when(serializeConfigMock.getObjectWriter(any())).thenReturn(((ObjectSerializer) null));
        setField(jSONSerializer, "config", serializeConfigMock);
        java.lang.Object[] forEachOrderedTaskArray = createArray("java.util.stream.ForEachOps$ForEachOrderedTask", 0);
        
        jSONSerializer.write(forEachOrderedTaskArray);
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
    
    @Test(timeout = 10000)
    public void testClose2() throws Throwable  {
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        SerializeWriter serializeWriterMock = mock(SerializeWriter.class);
        setField(jSONSerializer, "out", serializeWriterMock);
        
        jSONSerializer.close();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testWrite6() throws Throwable  {
        Object object = new Object();
        
        JSONSerializer.write(((Writer) null), object);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testWrite7() throws Throwable  {
        SerializeWriter serializeWriter = new SerializeWriter();
        Object object = new Object();
        
        JSONSerializer.write(serializeWriter, object);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testJSONSerializer1() {
        SerializeWriter serializeWriter = new SerializeWriter();
        JSONSerializer actual = new JSONSerializer(serializeWriter);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testJSONSerializer2() {
        SerializeWriter serializeWriter = new SerializeWriter();
        SerializeConfig serializeConfig = new SerializeConfig();
        JSONSerializer actual = new JSONSerializer(serializeWriter, serializeConfig);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testJSONSerializer3() {
        SerializeConfig serializeConfig = new SerializeConfig();
        JSONSerializer actual = new JSONSerializer(serializeConfig);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testJSONSerializer4() {
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
