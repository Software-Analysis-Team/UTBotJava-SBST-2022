package com.alibaba.fastjson.support.spring;

import org.junit.Test;
import java.lang.reflect.Method;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import java.nio.charset.Charset;
import sun.nio.cs.StandardCharsets;
import sun.nio.cs.US_ASCII;
import java.util.concurrent.atomic.AtomicInteger;
import sun.reflect.generics.reflectiveObjects.TypeVariableImpl;
import org.springframework.http.HttpInputMessage;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.ASMSerializerFactory;
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
import com.alibaba.fastjson.serializer.SerializeFilter;
import java.lang.reflect.Type;
import org.springframework.core.ResolvableType;
import sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl;
import java.lang.reflect.Constructor;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Map;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import sun.misc.Unsafe;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.Assert.assertNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mockStatic;
import static org.junit.Assert.assertFalse;
import static org.springframework.core.ResolvableType.forType;
import static org.springframework.core.ResolvableType.forClass;

public class FastJsonHttpMessageConverterTest {
    ///region
    
    @Test(timeout = 10000)
    public void testCanWrite1() throws Throwable  {
        FastJsonHttpMessageConverter fastJsonHttpMessageConverter = ((FastJsonHttpMessageConverter) createInstance("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter"));
        Class class1 = Object.class;
        
        boolean actual = fastJsonHttpMessageConverter.canWrite(class1, class1, null);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testWriteInternal1() throws Throwable  {
        FastJsonHttpMessageConverter fastJsonHttpMessageConverter = new FastJsonHttpMessageConverter();
        Object object = new Object();
        
        Class fastJsonHttpMessageConverterClazz = Class.forName("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter");
        Class objectType = Class.forName("java.lang.Object");
        Class httpOutputMessageType = Class.forName("org.springframework.http.HttpOutputMessage");
        Method writeInternalMethod = fastJsonHttpMessageConverterClazz.getDeclaredMethod("writeInternal", objectType, httpOutputMessageType);
        writeInternalMethod.setAccessible(true);
        java.lang.Object[] writeInternalMethodArguments = new java.lang.Object[2];
        writeInternalMethodArguments[0] = object;
        writeInternalMethodArguments[1] = null;
        try {
            writeInternalMethod.invoke(fastJsonHttpMessageConverter, writeInternalMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSupports1() throws Throwable  {
        FastJsonHttpMessageConverter fastJsonHttpMessageConverter = ((FastJsonHttpMessageConverter) createInstance("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter"));
        Class class1 = Object.class;
        
        Class fastJsonHttpMessageConverterClazz = Class.forName("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter");
        Class class1Type = Class.forName("java.lang.Class");
        Method supportsMethod = fastJsonHttpMessageConverterClazz.getDeclaredMethod("supports", class1Type);
        supportsMethod.setAccessible(true);
        java.lang.Object[] supportsMethodArguments = new java.lang.Object[1];
        supportsMethodArguments[0] = class1;
        boolean actual = ((boolean) supportsMethod.invoke(fastJsonHttpMessageConverter, supportsMethodArguments));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetFeatures1() throws Throwable  {
        FastJsonHttpMessageConverter fastJsonHttpMessageConverter = new FastJsonHttpMessageConverter();
        com.alibaba.fastjson.serializer.SerializerFeature[] serializerFeatureArray = new com.alibaba.fastjson.serializer.SerializerFeature[0];
        
        fastJsonHttpMessageConverter.setFeatures(serializerFeatureArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetFeatures2() throws Throwable  {
        FastJsonHttpMessageConverter fastJsonHttpMessageConverter = ((FastJsonHttpMessageConverter) createInstance("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter"));
        FastJsonConfig fastJsonConfigMock = mock(FastJsonConfig.class);
        setField(fastJsonHttpMessageConverter, "fastJsonConfig", fastJsonConfigMock);
        com.alibaba.fastjson.serializer.SerializerFeature[] serializerFeatureArray = new com.alibaba.fastjson.serializer.SerializerFeature[9];
        
        fastJsonHttpMessageConverter.setFeatures(serializerFeatureArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testSetFeatures3() throws Throwable  {
        FastJsonHttpMessageConverter fastJsonHttpMessageConverter = ((FastJsonHttpMessageConverter) createInstance("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter"));
        setField(fastJsonHttpMessageConverter, "fastJsonConfig", null);
        com.alibaba.fastjson.serializer.SerializerFeature[] serializerFeatureArray = new com.alibaba.fastjson.serializer.SerializerFeature[9];
        
        fastJsonHttpMessageConverter.setFeatures(serializerFeatureArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetCharset1() throws Throwable  {
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetCharset2() throws Throwable  {
        FastJsonHttpMessageConverter fastJsonHttpMessageConverter = ((FastJsonHttpMessageConverter) createInstance("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter"));
        setField(fastJsonHttpMessageConverter, "fastJsonConfig", null);
        
        fastJsonHttpMessageConverter.getCharset();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetCharset3() throws Throwable  {
        FastJsonHttpMessageConverter fastJsonHttpMessageConverter = ((FastJsonHttpMessageConverter) createInstance("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter"));
        FastJsonConfig fastJsonConfigMock = mock(FastJsonConfig.class);
        when(fastJsonConfigMock.getCharset()).thenReturn(((Charset) null));
        setField(fastJsonHttpMessageConverter, "fastJsonConfig", fastJsonConfigMock);
        
        Charset actual = fastJsonHttpMessageConverter.getCharset();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetFeatures1() throws Throwable  {
        FastJsonHttpMessageConverter fastJsonHttpMessageConverter = new FastJsonHttpMessageConverter();
        
        com.alibaba.fastjson.serializer.SerializerFeature[] actual = fastJsonHttpMessageConverter.getFeatures();
        
        com.alibaba.fastjson.serializer.SerializerFeature[] expected = new com.alibaba.fastjson.serializer.SerializerFeature[1];
        SerializerFeature serializerFeature = SerializerFeature.BrowserSecure;
        expected[0] = serializerFeature;
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetFeatures2() throws Throwable  {
        FastJsonHttpMessageConverter fastJsonHttpMessageConverter = ((FastJsonHttpMessageConverter) createInstance("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter"));
        setField(fastJsonHttpMessageConverter, "fastJsonConfig", null);
        
        fastJsonHttpMessageConverter.getFeatures();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetFeatures3() throws Throwable  {
        FastJsonHttpMessageConverter fastJsonHttpMessageConverter = ((FastJsonHttpMessageConverter) createInstance("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter"));
        FastJsonConfig fastJsonConfigMock = mock(FastJsonConfig.class);
        com.alibaba.fastjson.serializer.SerializerFeature[] serializerFeatureArray = new com.alibaba.fastjson.serializer.SerializerFeature[9];
        when(fastJsonConfigMock.getSerializerFeatures()).thenReturn(serializerFeatureArray);
        setField(fastJsonHttpMessageConverter, "fastJsonConfig", fastJsonConfigMock);
        
        com.alibaba.fastjson.serializer.SerializerFeature[] actual = fastJsonHttpMessageConverter.getFeatures();
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(serializerFeatureArray, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetCharset1() throws Throwable  {
        FastJsonHttpMessageConverter fastJsonHttpMessageConverter = new FastJsonHttpMessageConverter();
        
        fastJsonHttpMessageConverter.setCharset(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetCharset2() throws Throwable  {
        FastJsonHttpMessageConverter fastJsonHttpMessageConverter = ((FastJsonHttpMessageConverter) createInstance("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter"));
        FastJsonConfig fastJsonConfigMock = mock(FastJsonConfig.class);
        setField(fastJsonHttpMessageConverter, "fastJsonConfig", fastJsonConfigMock);
        
        fastJsonHttpMessageConverter.setCharset(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testSetCharset3() throws Throwable  {
        FastJsonHttpMessageConverter fastJsonHttpMessageConverter = ((FastJsonHttpMessageConverter) createInstance("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter"));
        setField(fastJsonHttpMessageConverter, "fastJsonConfig", null);
        Charset charsetMock = mock(Charset.class);
        
        fastJsonHttpMessageConverter.setCharset(charsetMock);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadType1() throws Throwable  {
        FastJsonHttpMessageConverter fastJsonHttpMessageConverter = new FastJsonHttpMessageConverter();
        
        Class fastJsonHttpMessageConverterClazz = Class.forName("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter");
        Class typeType = Class.forName("java.lang.reflect.Type");
        Class httpInputMessageType = Class.forName("org.springframework.http.HttpInputMessage");
        Method readTypeMethod = fastJsonHttpMessageConverterClazz.getDeclaredMethod("readType", typeType, httpInputMessageType);
        readTypeMethod.setAccessible(true);
        java.lang.Object[] readTypeMethodArguments = new java.lang.Object[2];
        readTypeMethodArguments[0] = null;
        readTypeMethodArguments[1] = null;
        try {
            readTypeMethod.invoke(fastJsonHttpMessageConverter, readTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadType2() throws Throwable  {
        FastJsonHttpMessageConverter fastJsonHttpMessageConverter = ((FastJsonHttpMessageConverter) createInstance("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter"));
        TypeVariableImpl typeVariableImpl = ((TypeVariableImpl) createInstance("sun.reflect.generics.reflectiveObjects.TypeVariableImpl"));
        
        Class fastJsonHttpMessageConverterClazz = Class.forName("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter");
        Class typeVariableImplType = Class.forName("java.lang.reflect.Type");
        Class httpInputMessageType = Class.forName("org.springframework.http.HttpInputMessage");
        Method readTypeMethod = fastJsonHttpMessageConverterClazz.getDeclaredMethod("readType", typeVariableImplType, httpInputMessageType);
        readTypeMethod.setAccessible(true);
        java.lang.Object[] readTypeMethodArguments = new java.lang.Object[2];
        readTypeMethodArguments[0] = typeVariableImpl;
        readTypeMethodArguments[1] = null;
        try {
            readTypeMethod.invoke(fastJsonHttpMessageConverter, readTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadType3() throws Throwable  {
        FastJsonHttpMessageConverter fastJsonHttpMessageConverter = ((FastJsonHttpMessageConverter) createInstance("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter"));
        setField(fastJsonHttpMessageConverter, "fastJsonConfig", null);
        TypeVariableImpl typeVariableImpl = ((TypeVariableImpl) createInstance("sun.reflect.generics.reflectiveObjects.TypeVariableImpl"));
        HttpInputMessage httpInputMessageMock = mock(HttpInputMessage.class);
        Object verifierStream = createInstance("java.util.jar.JarVerifier$VerifierStream");
        when(httpInputMessageMock.getBody()).thenReturn(((java.io.InputStream) verifierStream));
        
        Class fastJsonHttpMessageConverterClazz = Class.forName("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter");
        Class typeVariableImplType = Class.forName("java.lang.reflect.Type");
        Class httpInputMessageMockType = Class.forName("org.springframework.http.HttpInputMessage");
        Method readTypeMethod = fastJsonHttpMessageConverterClazz.getDeclaredMethod("readType", typeVariableImplType, httpInputMessageMockType);
        readTypeMethod.setAccessible(true);
        java.lang.Object[] readTypeMethodArguments = new java.lang.Object[2];
        readTypeMethodArguments[0] = typeVariableImpl;
        readTypeMethodArguments[1] = httpInputMessageMock;
        try {
            readTypeMethod.invoke(fastJsonHttpMessageConverter, readTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReadType4() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(com.alibaba.fastjson.JSON.class);
            mockedStatic.when(() -> {
                com.alibaba.fastjson.JSON.parseObject(any(java.io.InputStream.class), any(Charset.class), any(Type.class), any(com.alibaba.fastjson.parser.Feature[].class));
            }).thenReturn(null);
            FastJsonHttpMessageConverter fastJsonHttpMessageConverter = ((FastJsonHttpMessageConverter) createInstance("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter"));
            FastJsonConfig fastJsonConfigMock = mock(FastJsonConfig.class);
            Charset charsetMock = mock(Charset.class);
            when(fastJsonConfigMock.getCharset()).thenReturn(charsetMock);
            com.alibaba.fastjson.parser.Feature[] featureArray = new com.alibaba.fastjson.parser.Feature[9];
            when(fastJsonConfigMock.getFeatures()).thenReturn(featureArray);
            setField(fastJsonHttpMessageConverter, "fastJsonConfig", fastJsonConfigMock);
            HttpInputMessage httpInputMessageMock = mock(HttpInputMessage.class);
            Object secureObjectInputStream = createInstance("com.alibaba.fastjson.JSONObject$SecureObjectInputStream");
            when(httpInputMessageMock.getBody()).thenReturn(((java.io.InputStream) secureObjectInputStream));
            
            Class fastJsonHttpMessageConverterClazz = Class.forName("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter");
            Class typeType = Class.forName("java.lang.reflect.Type");
            Class httpInputMessageMockType = Class.forName("org.springframework.http.HttpInputMessage");
            Method readTypeMethod = fastJsonHttpMessageConverterClazz.getDeclaredMethod("readType", typeType, httpInputMessageMockType);
            readTypeMethod.setAccessible(true);
            java.lang.Object[] readTypeMethodArguments = new java.lang.Object[2];
            readTypeMethodArguments[0] = null;
            readTypeMethodArguments[1] = httpInputMessageMock;
            Object actual = readTypeMethod.invoke(fastJsonHttpMessageConverter, readTypeMethodArguments);
            
            assertNull(actual);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    
    ///region Errors report for getFastJsonConfig
    
    public void testGetFastJsonConfig_errors()
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
    public void testGetFastJsonConfig2() throws Throwable  {
        FastJsonHttpMessageConverter fastJsonHttpMessageConverter = ((FastJsonHttpMessageConverter) createInstance("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter"));
        setField(fastJsonHttpMessageConverter, "fastJsonConfig", null);
        
        FastJsonConfig actual = fastJsonHttpMessageConverter.getFastJsonConfig();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetFilters1() throws Throwable  {
        FastJsonHttpMessageConverter fastJsonHttpMessageConverter = new FastJsonHttpMessageConverter();
        
        com.alibaba.fastjson.serializer.SerializeFilter[] actual = fastJsonHttpMessageConverter.getFilters();
        
        com.alibaba.fastjson.serializer.SerializeFilter[] expected = new com.alibaba.fastjson.serializer.SerializeFilter[0];
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetFilters2() throws Throwable  {
        FastJsonHttpMessageConverter fastJsonHttpMessageConverter = ((FastJsonHttpMessageConverter) createInstance("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter"));
        setField(fastJsonHttpMessageConverter, "fastJsonConfig", null);
        
        fastJsonHttpMessageConverter.getFilters();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetFilters3() throws Throwable  {
        FastJsonHttpMessageConverter fastJsonHttpMessageConverter = ((FastJsonHttpMessageConverter) createInstance("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter"));
        FastJsonConfig fastJsonConfigMock = mock(FastJsonConfig.class);
        com.alibaba.fastjson.serializer.SerializeFilter[] serializeFilterArray = new com.alibaba.fastjson.serializer.SerializeFilter[9];
        when(fastJsonConfigMock.getSerializeFilters()).thenReturn(serializeFilterArray);
        setField(fastJsonHttpMessageConverter, "fastJsonConfig", fastJsonConfigMock);
        
        com.alibaba.fastjson.serializer.SerializeFilter[] actual = fastJsonHttpMessageConverter.getFilters();
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(serializeFilterArray, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetFilters1() throws Throwable  {
        FastJsonHttpMessageConverter fastJsonHttpMessageConverter = new FastJsonHttpMessageConverter();
        com.alibaba.fastjson.serializer.SerializeFilter[] serializeFilterArray = new com.alibaba.fastjson.serializer.SerializeFilter[0];
        
        fastJsonHttpMessageConverter.setFilters(serializeFilterArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetFilters2() throws Throwable  {
        FastJsonHttpMessageConverter fastJsonHttpMessageConverter = ((FastJsonHttpMessageConverter) createInstance("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter"));
        FastJsonConfig fastJsonConfigMock = mock(FastJsonConfig.class);
        setField(fastJsonHttpMessageConverter, "fastJsonConfig", fastJsonConfigMock);
        com.alibaba.fastjson.serializer.SerializeFilter[] serializeFilterArray = new com.alibaba.fastjson.serializer.SerializeFilter[9];
        
        fastJsonHttpMessageConverter.setFilters(serializeFilterArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testSetFilters3() throws Throwable  {
        FastJsonHttpMessageConverter fastJsonHttpMessageConverter = ((FastJsonHttpMessageConverter) createInstance("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter"));
        setField(fastJsonHttpMessageConverter, "fastJsonConfig", null);
        com.alibaba.fastjson.serializer.SerializeFilter[] serializeFilterArray = new com.alibaba.fastjson.serializer.SerializeFilter[9];
        
        fastJsonHttpMessageConverter.setFilters(serializeFilterArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetDateFormat1() throws Throwable  {
        FastJsonHttpMessageConverter fastJsonHttpMessageConverter = new FastJsonHttpMessageConverter();
        String string = new String();
        
        fastJsonHttpMessageConverter.setDateFormat(string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetDateFormat2() throws Throwable  {
        FastJsonHttpMessageConverter fastJsonHttpMessageConverter = ((FastJsonHttpMessageConverter) createInstance("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter"));
        FastJsonConfig fastJsonConfigMock = mock(FastJsonConfig.class);
        setField(fastJsonHttpMessageConverter, "fastJsonConfig", fastJsonConfigMock);
        
        fastJsonHttpMessageConverter.setDateFormat(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testSetDateFormat3() throws Throwable  {
        FastJsonHttpMessageConverter fastJsonHttpMessageConverter = ((FastJsonHttpMessageConverter) createInstance("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter"));
        setField(fastJsonHttpMessageConverter, "fastJsonConfig", null);
        String string = new String("");
        
        fastJsonHttpMessageConverter.setDateFormat(string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetDateFormat1() throws Throwable  {
        FastJsonHttpMessageConverter fastJsonHttpMessageConverter = new FastJsonHttpMessageConverter();
        
        String actual = fastJsonHttpMessageConverter.getDateFormat();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetDateFormat2() throws Throwable  {
        FastJsonHttpMessageConverter fastJsonHttpMessageConverter = ((FastJsonHttpMessageConverter) createInstance("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter"));
        setField(fastJsonHttpMessageConverter, "fastJsonConfig", null);
        
        fastJsonHttpMessageConverter.getDateFormat();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetDateFormat3() throws Throwable  {
        FastJsonHttpMessageConverter fastJsonHttpMessageConverter = ((FastJsonHttpMessageConverter) createInstance("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter"));
        FastJsonConfig fastJsonConfigMock = mock(FastJsonConfig.class);
        when(fastJsonConfigMock.getDateFormat()).thenReturn(((String) null));
        setField(fastJsonHttpMessageConverter, "fastJsonConfig", fastJsonConfigMock);
        
        String actual = fastJsonHttpMessageConverter.getDateFormat();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testAddSerializeFilter1() throws Throwable  {
        FastJsonHttpMessageConverter fastJsonHttpMessageConverter = new FastJsonHttpMessageConverter();
        
        fastJsonHttpMessageConverter.addSerializeFilter(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testAddSerializeFilter2() throws Throwable  {
        FastJsonHttpMessageConverter fastJsonHttpMessageConverter = ((FastJsonHttpMessageConverter) createInstance("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter"));
        
        fastJsonHttpMessageConverter.addSerializeFilter(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testAddSerializeFilter3() throws Throwable  {
        FastJsonHttpMessageConverter fastJsonHttpMessageConverter = ((FastJsonHttpMessageConverter) createInstance("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter"));
        setField(fastJsonHttpMessageConverter, "fastJsonConfig", null);
        SerializeFilter serializeFilterMock = mock(SerializeFilter.class);
        
        fastJsonHttpMessageConverter.addSerializeFilter(serializeFilterMock);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testAddSerializeFilter4() throws Throwable  {
        FastJsonHttpMessageConverter fastJsonHttpMessageConverter = ((FastJsonHttpMessageConverter) createInstance("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter"));
        FastJsonConfig fastJsonConfigMock = mock(FastJsonConfig.class);
        when(fastJsonConfigMock.getSerializeFilters()).thenReturn(((com.alibaba.fastjson.serializer.SerializeFilter[]) null));
        setField(fastJsonHttpMessageConverter, "fastJsonConfig", fastJsonConfigMock);
        SerializeFilter serializeFilterMock = mock(SerializeFilter.class);
        
        fastJsonHttpMessageConverter.addSerializeFilter(serializeFilterMock);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testAddSerializeFilter5() throws Throwable  {
        FastJsonHttpMessageConverter fastJsonHttpMessageConverter = ((FastJsonHttpMessageConverter) createInstance("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter"));
        FastJsonConfig fastJsonConfigMock = mock(FastJsonConfig.class);
        com.alibaba.fastjson.serializer.SerializeFilter[] serializeFilterArray = new com.alibaba.fastjson.serializer.SerializeFilter[8];
        when(fastJsonConfigMock.getSerializeFilters()).thenReturn(serializeFilterArray, ((com.alibaba.fastjson.serializer.SerializeFilter[]) null));
        setField(fastJsonHttpMessageConverter, "fastJsonConfig", fastJsonConfigMock);
        SerializeFilter serializeFilterMock = mock(SerializeFilter.class);
        
        fastJsonHttpMessageConverter.addSerializeFilter(serializeFilterMock);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testAddSerializeFilter6() throws Throwable  {
        FastJsonHttpMessageConverter fastJsonHttpMessageConverter = ((FastJsonHttpMessageConverter) createInstance("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter"));
        FastJsonConfig fastJsonConfigMock = mock(FastJsonConfig.class);
        com.alibaba.fastjson.serializer.SerializeFilter[] serializeFilterArray = new com.alibaba.fastjson.serializer.SerializeFilter[9];
        com.alibaba.fastjson.serializer.SerializeFilter[] serializeFilterArray1 = new com.alibaba.fastjson.serializer.SerializeFilter[9];
        when(fastJsonConfigMock.getSerializeFilters()).thenReturn(serializeFilterArray, serializeFilterArray1);
        setField(fastJsonHttpMessageConverter, "fastJsonConfig", fastJsonConfigMock);
        SerializeFilter serializeFilterMock = mock(SerializeFilter.class);
        
        fastJsonHttpMessageConverter.addSerializeFilter(serializeFilterMock);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetFastJsonConfig1() throws Throwable  {
        FastJsonHttpMessageConverter fastJsonHttpMessageConverter = new FastJsonHttpMessageConverter();
        FastJsonConfig fastJsonConfig = new FastJsonConfig();
        
        fastJsonHttpMessageConverter.setFastJsonConfig(fastJsonConfig);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetFastJsonConfig2() throws Throwable  {
        FastJsonHttpMessageConverter fastJsonHttpMessageConverter = ((FastJsonHttpMessageConverter) createInstance("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter"));
        setField(fastJsonHttpMessageConverter, "fastJsonConfig", null);
        FastJsonConfig fastJsonConfigMock = mock(FastJsonConfig.class);
        
        Object initialFastJsonHttpMessageConverterFastJsonConfig = getFieldValue(fastJsonHttpMessageConverter, "fastJsonConfig");
        
        fastJsonHttpMessageConverter.setFastJsonConfig(fastJsonConfigMock);
        
        Object finalFastJsonHttpMessageConverterFastJsonConfig = getFieldValue(fastJsonHttpMessageConverter, "fastJsonConfig");
        
        assertFalse(initialFastJsonHttpMessageConverterFastJsonConfig == finalFastJsonHttpMessageConverterFastJsonConfig);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testStrangeCodeForJackson1() throws Throwable  {
        FastJsonHttpMessageConverter fastJsonHttpMessageConverter = new FastJsonHttpMessageConverter();
        Object object = new Object();
        
        Class fastJsonHttpMessageConverterClazz = Class.forName("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter");
        Class objectType = Class.forName("java.lang.Object");
        Method strangeCodeForJacksonMethod = fastJsonHttpMessageConverterClazz.getDeclaredMethod("strangeCodeForJackson", objectType);
        strangeCodeForJacksonMethod.setAccessible(true);
        java.lang.Object[] strangeCodeForJacksonMethodArguments = new java.lang.Object[1];
        strangeCodeForJacksonMethodArguments[0] = object;
        Object actual = strangeCodeForJacksonMethod.invoke(fastJsonHttpMessageConverter, strangeCodeForJacksonMethodArguments);
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(object, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testStrangeCodeForJackson2() throws Throwable  {
        FastJsonHttpMessageConverter fastJsonHttpMessageConverter = ((FastJsonHttpMessageConverter) createInstance("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter"));
        
        Class fastJsonHttpMessageConverterClazz = Class.forName("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter");
        Class objectType = Class.forName("java.lang.Object");
        Method strangeCodeForJacksonMethod = fastJsonHttpMessageConverterClazz.getDeclaredMethod("strangeCodeForJackson", objectType);
        strangeCodeForJacksonMethod.setAccessible(true);
        java.lang.Object[] strangeCodeForJacksonMethodArguments = new java.lang.Object[1];
        strangeCodeForJacksonMethodArguments[0] = null;
        Object actual = strangeCodeForJacksonMethod.invoke(fastJsonHttpMessageConverter, strangeCodeForJacksonMethodArguments);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetType1() throws Throwable  {
        Class spring4TypeResolvableHelperClazz = Class.forName("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter$Spring4TypeResolvableHelper");
        boolean prevHasClazzResolvableType = ((boolean) getStaticFieldValue(spring4TypeResolvableHelperClazz, "hasClazzResolvableType"));
        try {
            setStaticField(spring4TypeResolvableHelperClazz, "hasClazzResolvableType", false);
            FastJsonHttpMessageConverter fastJsonHttpMessageConverter = ((FastJsonHttpMessageConverter) createInstance("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter"));
            
            Class fastJsonHttpMessageConverterClazz = Class.forName("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter");
            Class typeType = Class.forName("java.lang.reflect.Type");
            Class classType = Class.forName("java.lang.Class");
            Method getTypeMethod = fastJsonHttpMessageConverterClazz.getDeclaredMethod("getType", typeType, classType);
            getTypeMethod.setAccessible(true);
            java.lang.Object[] getTypeMethodArguments = new java.lang.Object[2];
            getTypeMethodArguments[0] = null;
            getTypeMethodArguments[1] = null;
            Type actual = ((Type) getTypeMethod.invoke(fastJsonHttpMessageConverter, getTypeMethodArguments));
            
            assertNull(actual);
        } finally {
            setStaticField(spring4TypeResolvableHelperClazz, "hasClazzResolvableType", prevHasClazzResolvableType);
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetType2() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            Class spring4TypeResolvableHelperClazz = Class.forName("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter$Spring4TypeResolvableHelper");
            boolean prevHasClazzResolvableType = ((boolean) getStaticFieldValue(spring4TypeResolvableHelperClazz, "hasClazzResolvableType"));
            try {
                setStaticField(spring4TypeResolvableHelperClazz, "hasClazzResolvableType", true);
                mockedStatic = mockStatic(ResolvableType.class);
                mockedStatic.when(() -> {
                    forType(org.mockito.ArgumentMatchers.any());
                }).thenReturn(((ResolvableType) null));
                FastJsonHttpMessageConverter fastJsonHttpMessageConverter = ((FastJsonHttpMessageConverter) createInstance("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter"));
                Object wildcardTypeImpl = createInstance("retrofit2.Utils$WildcardTypeImpl");
                Class class1 = Object.class;
                
                Class fastJsonHttpMessageConverterClazz = Class.forName("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter");
                Class wildcardTypeImplType = Class.forName("java.lang.reflect.Type");
                Class class1Type = Class.forName("java.lang.Class");
                Method getTypeMethod = fastJsonHttpMessageConverterClazz.getDeclaredMethod("getType", wildcardTypeImplType, class1Type);
                getTypeMethod.setAccessible(true);
                java.lang.Object[] getTypeMethodArguments = new java.lang.Object[2];
                getTypeMethodArguments[0] = wildcardTypeImpl;
                getTypeMethodArguments[1] = class1;
                Type actual = ((Type) getTypeMethod.invoke(fastJsonHttpMessageConverter, getTypeMethodArguments));
                
                
                // Current deep equals depth exceeds max depth 0
                assertTrue(deepEquals(wildcardTypeImpl, actual));
            } finally {
                setStaticField(spring4TypeResolvableHelperClazz, "hasClazzResolvableType", prevHasClazzResolvableType);
            }
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetType3() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            Class spring4TypeResolvableHelperClazz = Class.forName("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter$Spring4TypeResolvableHelper");
            boolean prevHasClazzResolvableType = ((boolean) getStaticFieldValue(spring4TypeResolvableHelperClazz, "hasClazzResolvableType"));
            try {
                setStaticField(spring4TypeResolvableHelperClazz, "hasClazzResolvableType", true);
                mockedStatic = mockStatic(ResolvableType.class);
                ResolvableType resolvableTypeMock = mock(ResolvableType.class);
                when(resolvableTypeMock.hasUnresolvableGenerics()).thenReturn(false);
                mockedStatic.when(() -> {
                    forType(org.mockito.ArgumentMatchers.any());
                }).thenReturn(resolvableTypeMock);
                FastJsonHttpMessageConverter fastJsonHttpMessageConverter = ((FastJsonHttpMessageConverter) createInstance("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter"));
                ParameterizedTypeImpl parameterizedTypeImpl = ((ParameterizedTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl"));
                Class class1 = Object.class;
                
                Class fastJsonHttpMessageConverterClazz = Class.forName("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter");
                Class parameterizedTypeImplType = Class.forName("java.lang.reflect.Type");
                Class class1Type = Class.forName("java.lang.Class");
                Method getTypeMethod = fastJsonHttpMessageConverterClazz.getDeclaredMethod("getType", parameterizedTypeImplType, class1Type);
                getTypeMethod.setAccessible(true);
                java.lang.Object[] getTypeMethodArguments = new java.lang.Object[2];
                getTypeMethodArguments[0] = parameterizedTypeImpl;
                getTypeMethodArguments[1] = class1;
                Type actual = ((Type) getTypeMethod.invoke(fastJsonHttpMessageConverter, getTypeMethodArguments));
                
                
                // Current deep equals depth exceeds max depth 0
                assertTrue(deepEquals(parameterizedTypeImpl, actual));
            } finally {
                setStaticField(spring4TypeResolvableHelperClazz, "hasClazzResolvableType", prevHasClazzResolvableType);
            }
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetType4() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            Class spring4TypeResolvableHelperClazz = Class.forName("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter$Spring4TypeResolvableHelper");
            boolean prevHasClazzResolvableType = ((boolean) getStaticFieldValue(spring4TypeResolvableHelperClazz, "hasClazzResolvableType"));
            try {
                setStaticField(spring4TypeResolvableHelperClazz, "hasClazzResolvableType", true);
                mockedStatic = mockStatic(ResolvableType.class);
                mockedStatic.when(() -> {
                    forType(org.mockito.ArgumentMatchers.any());
                }).thenReturn(((ResolvableType) null));
                FastJsonHttpMessageConverter fastJsonHttpMessageConverter = ((FastJsonHttpMessageConverter) createInstance("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter"));
                ParameterizedTypeImpl parameterizedTypeImpl = ((ParameterizedTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl"));
                Class class1 = Object.class;
                
                Class fastJsonHttpMessageConverterClazz = Class.forName("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter");
                Class parameterizedTypeImplType = Class.forName("java.lang.reflect.Type");
                Class class1Type = Class.forName("java.lang.Class");
                Method getTypeMethod = fastJsonHttpMessageConverterClazz.getDeclaredMethod("getType", parameterizedTypeImplType, class1Type);
                getTypeMethod.setAccessible(true);
                java.lang.Object[] getTypeMethodArguments = new java.lang.Object[2];
                getTypeMethodArguments[0] = parameterizedTypeImpl;
                getTypeMethodArguments[1] = class1;
                try {
                    getTypeMethod.invoke(fastJsonHttpMessageConverter, getTypeMethodArguments);
                } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }} finally {
                setStaticField(spring4TypeResolvableHelperClazz, "hasClazzResolvableType", prevHasClazzResolvableType);
            }
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetType5() throws Throwable  {
        Class spring4TypeResolvableHelperClazz = Class.forName("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter$Spring4TypeResolvableHelper");
        boolean prevHasClazzResolvableType = ((boolean) getStaticFieldValue(spring4TypeResolvableHelperClazz, "hasClazzResolvableType"));
        try {
            setStaticField(spring4TypeResolvableHelperClazz, "hasClazzResolvableType", true);
            FastJsonHttpMessageConverter fastJsonHttpMessageConverter = ((FastJsonHttpMessageConverter) createInstance("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter"));
            
            Class fastJsonHttpMessageConverterClazz = Class.forName("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter");
            Class typeType = Class.forName("java.lang.reflect.Type");
            Class classType = Class.forName("java.lang.Class");
            Method getTypeMethod = fastJsonHttpMessageConverterClazz.getDeclaredMethod("getType", typeType, classType);
            getTypeMethod.setAccessible(true);
            java.lang.Object[] getTypeMethodArguments = new java.lang.Object[2];
            getTypeMethodArguments[0] = null;
            getTypeMethodArguments[1] = null;
            Type actual = ((Type) getTypeMethod.invoke(fastJsonHttpMessageConverter, getTypeMethodArguments));
            
            assertNull(actual);
        } finally {
            setStaticField(spring4TypeResolvableHelperClazz, "hasClazzResolvableType", prevHasClazzResolvableType);
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetType6() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            Class spring4TypeResolvableHelperClazz = Class.forName("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter$Spring4TypeResolvableHelper");
            boolean prevHasClazzResolvableType = ((boolean) getStaticFieldValue(spring4TypeResolvableHelperClazz, "hasClazzResolvableType"));
            try {
                setStaticField(spring4TypeResolvableHelperClazz, "hasClazzResolvableType", true);
                mockedStatic = mockStatic(ResolvableType.class);
                mockedStatic.when(() -> {
                    forType(org.mockito.ArgumentMatchers.any());
                }).thenReturn(((ResolvableType) null));
                ResolvableType resolvableTypeMock = mock(ResolvableType.class);
                when(resolvableTypeMock.hasGenerics()).thenReturn(true);
                mockedStatic.when(() -> {
                    forClass(org.mockito.ArgumentMatchers.any());
                }).thenReturn(resolvableTypeMock);
                mockedStatic.when(() -> {
                    ResolvableType.forType(any(Type.class), any(ResolvableType.class));
                }).thenReturn(((ResolvableType) null));
                FastJsonHttpMessageConverter fastJsonHttpMessageConverter = ((FastJsonHttpMessageConverter) createInstance("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter"));
                TypeVariableImpl typeVariableImpl = ((TypeVariableImpl) createInstance("sun.reflect.generics.reflectiveObjects.TypeVariableImpl"));
                Class class1 = Object.class;
                
                Class fastJsonHttpMessageConverterClazz = Class.forName("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter");
                Class typeVariableImplType = Class.forName("java.lang.reflect.Type");
                Class class1Type = Class.forName("java.lang.Class");
                Method getTypeMethod = fastJsonHttpMessageConverterClazz.getDeclaredMethod("getType", typeVariableImplType, class1Type);
                getTypeMethod.setAccessible(true);
                java.lang.Object[] getTypeMethodArguments = new java.lang.Object[2];
                getTypeMethodArguments[0] = typeVariableImpl;
                getTypeMethodArguments[1] = class1;
                try {
                    getTypeMethod.invoke(fastJsonHttpMessageConverter, getTypeMethodArguments);
                } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }} finally {
                setStaticField(spring4TypeResolvableHelperClazz, "hasClazzResolvableType", prevHasClazzResolvableType);
            }
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetType7() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            Class spring4TypeResolvableHelperClazz = Class.forName("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter$Spring4TypeResolvableHelper");
            boolean prevHasClazzResolvableType = ((boolean) getStaticFieldValue(spring4TypeResolvableHelperClazz, "hasClazzResolvableType"));
            try {
                setStaticField(spring4TypeResolvableHelperClazz, "hasClazzResolvableType", true);
                mockedStatic = mockStatic(ResolvableType.class);
                mockedStatic.when(() -> {
                    forType(org.mockito.ArgumentMatchers.any());
                }).thenReturn(((ResolvableType) null));
                ResolvableType resolvableTypeMock = mock(ResolvableType.class);
                when(resolvableTypeMock.hasGenerics()).thenReturn(false);
                ResolvableType resolvableTypeMock1 = mock(ResolvableType.class);
                when(resolvableTypeMock.getSuperType()).thenReturn(resolvableTypeMock1);
                org.springframework.core.ResolvableType[] resolvableTypeArray = new org.springframework.core.ResolvableType[0];
                when(resolvableTypeMock.getInterfaces()).thenReturn(resolvableTypeArray);
                mockedStatic.when(() -> {
                    forClass(org.mockito.ArgumentMatchers.any());
                }).thenReturn(resolvableTypeMock);
                FastJsonHttpMessageConverter fastJsonHttpMessageConverter = ((FastJsonHttpMessageConverter) createInstance("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter"));
                TypeVariableImpl typeVariableImpl = ((TypeVariableImpl) createInstance("sun.reflect.generics.reflectiveObjects.TypeVariableImpl"));
                Class class1 = Object.class;
                
                Class fastJsonHttpMessageConverterClazz = Class.forName("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter");
                Class typeVariableImplType = Class.forName("java.lang.reflect.Type");
                Class class1Type = Class.forName("java.lang.Class");
                Method getTypeMethod = fastJsonHttpMessageConverterClazz.getDeclaredMethod("getType", typeVariableImplType, class1Type);
                getTypeMethod.setAccessible(true);
                java.lang.Object[] getTypeMethodArguments = new java.lang.Object[2];
                getTypeMethodArguments[0] = typeVariableImpl;
                getTypeMethodArguments[1] = class1;
                Type actual = ((Type) getTypeMethod.invoke(fastJsonHttpMessageConverter, getTypeMethodArguments));
                
                
                // Current deep equals depth exceeds max depth 0
                assertTrue(deepEquals(typeVariableImpl, actual));
            } finally {
                setStaticField(spring4TypeResolvableHelperClazz, "hasClazzResolvableType", prevHasClazzResolvableType);
            }
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetType8() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            Class spring4TypeResolvableHelperClazz = Class.forName("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter$Spring4TypeResolvableHelper");
            boolean prevHasClazzResolvableType = ((boolean) getStaticFieldValue(spring4TypeResolvableHelperClazz, "hasClazzResolvableType"));
            try {
                setStaticField(spring4TypeResolvableHelperClazz, "hasClazzResolvableType", true);
                mockedStatic = mockStatic(ResolvableType.class);
                mockedStatic.when(() -> {
                    forType(org.mockito.ArgumentMatchers.any());
                }).thenReturn(((ResolvableType) null));
                ResolvableType resolvableTypeMock = mock(ResolvableType.class);
                when(resolvableTypeMock.hasGenerics()).thenReturn(true);
                mockedStatic.when(() -> {
                    forClass(org.mockito.ArgumentMatchers.any());
                }).thenReturn(resolvableTypeMock);
                ResolvableType resolvableTypeMock1 = mock(ResolvableType.class);
                Class class1 = Object.class;
                when(resolvableTypeMock1.resolve()).thenReturn(class1);
                mockedStatic.when(() -> {
                    ResolvableType.forType(any(Type.class), any(ResolvableType.class));
                }).thenReturn(resolvableTypeMock1);
                FastJsonHttpMessageConverter fastJsonHttpMessageConverter = ((FastJsonHttpMessageConverter) createInstance("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter"));
                TypeVariableImpl typeVariableImpl = ((TypeVariableImpl) createInstance("sun.reflect.generics.reflectiveObjects.TypeVariableImpl"));
                
                Class fastJsonHttpMessageConverterClazz = Class.forName("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter");
                Class typeVariableImplType = Class.forName("java.lang.reflect.Type");
                Class class1Type = Class.forName("java.lang.Class");
                Method getTypeMethod = fastJsonHttpMessageConverterClazz.getDeclaredMethod("getType", typeVariableImplType, class1Type);
                getTypeMethod.setAccessible(true);
                java.lang.Object[] getTypeMethodArguments = new java.lang.Object[2];
                getTypeMethodArguments[0] = typeVariableImpl;
                getTypeMethodArguments[1] = class1;
                Type actual = ((Type) getTypeMethod.invoke(fastJsonHttpMessageConverter, getTypeMethodArguments));
                
                
                // Current deep equals depth exceeds max depth 0
                assertTrue(deepEquals(typeVariableImpl, actual));
            } finally {
                setStaticField(spring4TypeResolvableHelperClazz, "hasClazzResolvableType", prevHasClazzResolvableType);
            }
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetType9() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            Class spring4TypeResolvableHelperClazz = Class.forName("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter$Spring4TypeResolvableHelper");
            boolean prevHasClazzResolvableType = ((boolean) getStaticFieldValue(spring4TypeResolvableHelperClazz, "hasClazzResolvableType"));
            try {
                setStaticField(spring4TypeResolvableHelperClazz, "hasClazzResolvableType", true);
                mockedStatic = mockStatic(ResolvableType.class);
                ResolvableType resolvableTypeMock = mock(ResolvableType.class);
                when(resolvableTypeMock.hasGenerics()).thenReturn(true);
                Class class1 = Object.class;
                when(resolvableTypeMock.resolve()).thenReturn(class1, ((Class) null));
                mockedStatic.when(() -> {
                    forType(org.mockito.ArgumentMatchers.any());
                }).thenReturn(resolvableTypeMock);
                mockedStatic.when(() -> {
                    forClass(org.mockito.ArgumentMatchers.any());
                }).thenReturn(resolvableTypeMock);
                mockedStatic.when(() -> {
                    ResolvableType.forType(any(Type.class), any(ResolvableType.class));
                }).thenReturn(resolvableTypeMock);
                FastJsonHttpMessageConverter fastJsonHttpMessageConverter = ((FastJsonHttpMessageConverter) createInstance("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter"));
                TypeVariableImpl typeVariableImpl = ((TypeVariableImpl) createInstance("sun.reflect.generics.reflectiveObjects.TypeVariableImpl"));
                
                Class fastJsonHttpMessageConverterClazz = Class.forName("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter");
                Class typeVariableImplType = Class.forName("java.lang.reflect.Type");
                Class class1Type = Class.forName("java.lang.Class");
                Method getTypeMethod = fastJsonHttpMessageConverterClazz.getDeclaredMethod("getType", typeVariableImplType, class1Type);
                getTypeMethod.setAccessible(true);
                java.lang.Object[] getTypeMethodArguments = new java.lang.Object[2];
                getTypeMethodArguments[0] = typeVariableImpl;
                getTypeMethodArguments[1] = class1;
                Type actual = ((Type) getTypeMethod.invoke(fastJsonHttpMessageConverter, getTypeMethodArguments));
                
                assertNull(actual);
            } finally {
                setStaticField(spring4TypeResolvableHelperClazz, "hasClazzResolvableType", prevHasClazzResolvableType);
            }
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetType10() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            Class spring4TypeResolvableHelperClazz = Class.forName("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter$Spring4TypeResolvableHelper");
            boolean prevHasClazzResolvableType = ((boolean) getStaticFieldValue(spring4TypeResolvableHelperClazz, "hasClazzResolvableType"));
            try {
                setStaticField(spring4TypeResolvableHelperClazz, "hasClazzResolvableType", true);
                mockedStatic = mockStatic(ResolvableType.class);
                mockedStatic.when(() -> {
                    forType(org.mockito.ArgumentMatchers.any());
                }).thenReturn(((ResolvableType) null));
                ResolvableType resolvableTypeMock = mock(ResolvableType.class);
                when(resolvableTypeMock.hasGenerics()).thenReturn(false);
                ResolvableType resolvableTypeMock1 = mock(ResolvableType.class);
                when(resolvableTypeMock.getSuperType()).thenReturn(resolvableTypeMock1);
                when(resolvableTypeMock.getInterfaces()).thenReturn(((org.springframework.core.ResolvableType[]) null));
                mockedStatic.when(() -> {
                    forClass(org.mockito.ArgumentMatchers.any());
                }).thenReturn(resolvableTypeMock);
                FastJsonHttpMessageConverter fastJsonHttpMessageConverter = ((FastJsonHttpMessageConverter) createInstance("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter"));
                TypeVariableImpl typeVariableImpl = ((TypeVariableImpl) createInstance("sun.reflect.generics.reflectiveObjects.TypeVariableImpl"));
                Class class1 = Object.class;
                
                Class fastJsonHttpMessageConverterClazz = Class.forName("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter");
                Class typeVariableImplType = Class.forName("java.lang.reflect.Type");
                Class class1Type = Class.forName("java.lang.Class");
                Method getTypeMethod = fastJsonHttpMessageConverterClazz.getDeclaredMethod("getType", typeVariableImplType, class1Type);
                getTypeMethod.setAccessible(true);
                java.lang.Object[] getTypeMethodArguments = new java.lang.Object[2];
                getTypeMethodArguments[0] = typeVariableImpl;
                getTypeMethodArguments[1] = class1;
                try {
                    getTypeMethod.invoke(fastJsonHttpMessageConverter, getTypeMethodArguments);
                } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }} finally {
                setStaticField(spring4TypeResolvableHelperClazz, "hasClazzResolvableType", prevHasClazzResolvableType);
            }
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testFastJsonHttpMessageConverter1() {
        FastJsonHttpMessageConverter actual = new FastJsonHttpMessageConverter();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testResolveVariable1() throws Throwable  {
        ResolvableType resolvableType = ((ResolvableType) createInstance("org.springframework.core.ResolvableType"));
        
        Class spring4TypeResolvableHelperClazz = Class.forName("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter$Spring4TypeResolvableHelper");
        Class typeVariableType = Class.forName("java.lang.reflect.TypeVariable");
        Class resolvableTypeType = Class.forName("org.springframework.core.ResolvableType");
        Method resolveVariableMethod = spring4TypeResolvableHelperClazz.getDeclaredMethod("resolveVariable", typeVariableType, resolvableTypeType);
        resolveVariableMethod.setAccessible(true);
        java.lang.Object[] resolveVariableMethodArguments = new java.lang.Object[2];
        resolveVariableMethodArguments[0] = null;
        resolveVariableMethodArguments[1] = resolvableType;
        ResolvableType actual = ((ResolvableType) resolveVariableMethod.invoke(null, resolveVariableMethodArguments));
        
        ResolvableType expected = ((ResolvableType) createInstance("org.springframework.core.ResolvableType"));
        setField(expected, "type", null);
        setField(expected, "typeProvider", null);
        setField(expected, "variableResolver", null);
        setField(expected, "componentType", null);
        setField(expected, "resolved", null);
        Integer integer = 0;
        setField(expected, "hash", integer);
        setField(expected, "superType", null);
        setField(expected, "interfaces", null);
        setField(expected, "generics", null);
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testResolveVariable2() throws Throwable  {
        TypeVariableImpl typeVariableImpl = ((TypeVariableImpl) createInstance("sun.reflect.generics.reflectiveObjects.TypeVariableImpl"));
        
        Class spring4TypeResolvableHelperClazz = Class.forName("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter$Spring4TypeResolvableHelper");
        Class typeVariableImplType = Class.forName("java.lang.reflect.TypeVariable");
        Class resolvableTypeType = Class.forName("org.springframework.core.ResolvableType");
        Method resolveVariableMethod = spring4TypeResolvableHelperClazz.getDeclaredMethod("resolveVariable", typeVariableImplType, resolvableTypeType);
        resolveVariableMethod.setAccessible(true);
        java.lang.Object[] resolveVariableMethodArguments = new java.lang.Object[2];
        resolveVariableMethodArguments[0] = typeVariableImpl;
        resolveVariableMethodArguments[1] = null;
        try {
            resolveVariableMethod.invoke(null, resolveVariableMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testResolveVariable3() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(ResolvableType.class);
            ResolvableType resolvableTypeMock = mock(ResolvableType.class);
            when(resolvableTypeMock.hasGenerics()).thenReturn(true);
            Class class1 = Object.class;
            when(resolvableTypeMock.resolve()).thenReturn(class1);
            mockedStatic.when(() -> {
                ResolvableType.forType(any(Type.class), any(ResolvableType.class));
            }).thenReturn(resolvableTypeMock);
            
            Class spring4TypeResolvableHelperClazz = Class.forName("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter$Spring4TypeResolvableHelper");
            Class typeVariableType = Class.forName("java.lang.reflect.TypeVariable");
            Class resolvableTypeMockType = Class.forName("org.springframework.core.ResolvableType");
            Method resolveVariableMethod = spring4TypeResolvableHelperClazz.getDeclaredMethod("resolveVariable", typeVariableType, resolvableTypeMockType);
            resolveVariableMethod.setAccessible(true);
            java.lang.Object[] resolveVariableMethodArguments = new java.lang.Object[2];
            resolveVariableMethodArguments[0] = null;
            resolveVariableMethodArguments[1] = resolvableTypeMock;
            ResolvableType actual = ((ResolvableType) resolveVariableMethod.invoke(null, resolveVariableMethodArguments));
            
            
            // Current deep equals depth exceeds max depth 0
            assertTrue(deepEquals(resolvableTypeMock, actual));
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testResolveVariable4() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(ResolvableType.class);
            mockedStatic.when(() -> {
                ResolvableType.forType(any(Type.class), any(ResolvableType.class));
            }).thenReturn(((ResolvableType) null));
            TypeVariableImpl typeVariableImpl = ((TypeVariableImpl) createInstance("sun.reflect.generics.reflectiveObjects.TypeVariableImpl"));
            ResolvableType resolvableTypeMock = mock(ResolvableType.class);
            when(resolvableTypeMock.hasGenerics()).thenReturn(true);
            
            Class spring4TypeResolvableHelperClazz = Class.forName("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter$Spring4TypeResolvableHelper");
            Class typeVariableImplType = Class.forName("java.lang.reflect.TypeVariable");
            Class resolvableTypeMockType = Class.forName("org.springframework.core.ResolvableType");
            Method resolveVariableMethod = spring4TypeResolvableHelperClazz.getDeclaredMethod("resolveVariable", typeVariableImplType, resolvableTypeMockType);
            resolveVariableMethod.setAccessible(true);
            java.lang.Object[] resolveVariableMethodArguments = new java.lang.Object[2];
            resolveVariableMethodArguments[0] = typeVariableImpl;
            resolveVariableMethodArguments[1] = resolvableTypeMock;
            try {
                resolveVariableMethod.invoke(null, resolveVariableMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }} finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    
    ///region Errors report for resolveVariable
    
    public void testResolveVariable_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // <Throwable with empty message>
        // 
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testResolveVariable6() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(ResolvableType.class);
            ResolvableType resolvableTypeMock = mock(ResolvableType.class);
            when(resolvableTypeMock.hasGenerics()).thenReturn(true);
            ResolvableType resolvableTypeMock1 = mock(ResolvableType.class);
            when(resolvableTypeMock.getSuperType()).thenReturn(resolvableTypeMock1);
            org.springframework.core.ResolvableType[] resolvableTypeArray = new org.springframework.core.ResolvableType[0];
            when(resolvableTypeMock.getInterfaces()).thenReturn(resolvableTypeArray);
            when(resolvableTypeMock.resolve()).thenReturn(((Class) null));
            mockedStatic.when(() -> {
                ResolvableType.forType(any(Type.class), any(ResolvableType.class));
            }).thenReturn(resolvableTypeMock);
            TypeVariableImpl typeVariableImpl = ((TypeVariableImpl) createInstance("sun.reflect.generics.reflectiveObjects.TypeVariableImpl"));
            
            Class spring4TypeResolvableHelperClazz = Class.forName("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter$Spring4TypeResolvableHelper");
            Class typeVariableImplType = Class.forName("java.lang.reflect.TypeVariable");
            Class resolvableTypeMockType = Class.forName("org.springframework.core.ResolvableType");
            Method resolveVariableMethod = spring4TypeResolvableHelperClazz.getDeclaredMethod("resolveVariable", typeVariableImplType, resolvableTypeMockType);
            resolveVariableMethod.setAccessible(true);
            java.lang.Object[] resolveVariableMethodArguments = new java.lang.Object[2];
            resolveVariableMethodArguments[0] = typeVariableImpl;
            resolveVariableMethodArguments[1] = resolvableTypeMock;
            ResolvableType actual = ((ResolvableType) resolveVariableMethod.invoke(null, resolveVariableMethodArguments));
            
            
            // Current deep equals depth exceeds max depth 0
            assertTrue(deepEquals(resolvableTypeMock1, actual));
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testResolveVariable7() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(ResolvableType.class);
            ResolvableType resolvableTypeMock = mock(ResolvableType.class);
            Class class1 = Object.class;
            when(resolvableTypeMock.resolve()).thenReturn(((Class) null), class1, class1);
            when(resolvableTypeMock.hasGenerics()).thenReturn(true);
            mockedStatic.when(() -> {
                ResolvableType.forType(any(Type.class), any(ResolvableType.class));
            }).thenReturn(resolvableTypeMock, resolvableTypeMock);
            ResolvableType resolvableTypeMock1 = mock(ResolvableType.class);
            when(resolvableTypeMock1.hasGenerics()).thenReturn(true);
            when(resolvableTypeMock1.getSuperType()).thenReturn(resolvableTypeMock);
            
            Class spring4TypeResolvableHelperClazz = Class.forName("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter$Spring4TypeResolvableHelper");
            Class typeVariableType = Class.forName("java.lang.reflect.TypeVariable");
            Class resolvableTypeMock1Type = Class.forName("org.springframework.core.ResolvableType");
            Method resolveVariableMethod = spring4TypeResolvableHelperClazz.getDeclaredMethod("resolveVariable", typeVariableType, resolvableTypeMock1Type);
            resolveVariableMethod.setAccessible(true);
            java.lang.Object[] resolveVariableMethodArguments = new java.lang.Object[2];
            resolveVariableMethodArguments[0] = null;
            resolveVariableMethodArguments[1] = resolvableTypeMock1;
            ResolvableType actual = ((ResolvableType) resolveVariableMethod.invoke(null, resolveVariableMethodArguments));
            
            
            // Current deep equals depth exceeds max depth 0
            assertTrue(deepEquals(resolvableTypeMock, actual));
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testResolveVariable8() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(ResolvableType.class);
            ResolvableType resolvableTypeMock = mock(ResolvableType.class);
            Class class1 = Object.class;
            when(resolvableTypeMock.resolve()).thenReturn(((Class) null), class1, ((Class) null));
            when(resolvableTypeMock.hasGenerics()).thenReturn(true);
            mockedStatic.when(() -> {
                ResolvableType.forType(any(Type.class), any(ResolvableType.class));
            }).thenReturn(resolvableTypeMock, resolvableTypeMock);
            ResolvableType resolvableTypeMock1 = mock(ResolvableType.class);
            when(resolvableTypeMock1.hasGenerics()).thenReturn(true);
            when(resolvableTypeMock1.getSuperType()).thenReturn(resolvableTypeMock);
            when(resolvableTypeMock1.getInterfaces()).thenReturn(((org.springframework.core.ResolvableType[]) null));
            
            Class spring4TypeResolvableHelperClazz = Class.forName("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter$Spring4TypeResolvableHelper");
            Class typeVariableType = Class.forName("java.lang.reflect.TypeVariable");
            Class resolvableTypeMock1Type = Class.forName("org.springframework.core.ResolvableType");
            Method resolveVariableMethod = spring4TypeResolvableHelperClazz.getDeclaredMethod("resolveVariable", typeVariableType, resolvableTypeMock1Type);
            resolveVariableMethod.setAccessible(true);
            java.lang.Object[] resolveVariableMethodArguments = new java.lang.Object[2];
            resolveVariableMethodArguments[0] = null;
            resolveVariableMethodArguments[1] = resolvableTypeMock1;
            try {
                resolveVariableMethod.invoke(null, resolveVariableMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }} finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testResolveVariable9() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(ResolvableType.class);
            ResolvableType resolvableTypeMock = mock(ResolvableType.class);
            when(resolvableTypeMock.hasGenerics()).thenReturn(true);
            ResolvableType resolvableTypeMock1 = mock(ResolvableType.class);
            when(resolvableTypeMock1.hasGenerics()).thenReturn(false);
            ResolvableType resolvableTypeMock2 = mock(ResolvableType.class);
            when(resolvableTypeMock1.getSuperType()).thenReturn(resolvableTypeMock2);
            when(resolvableTypeMock1.getInterfaces()).thenReturn(((org.springframework.core.ResolvableType[]) null));
            when(resolvableTypeMock.getSuperType()).thenReturn(resolvableTypeMock1);
            when(resolvableTypeMock.resolve()).thenReturn(((Class) null));
            mockedStatic.when(() -> {
                ResolvableType.forType(any(Type.class), any(ResolvableType.class));
            }).thenReturn(resolvableTypeMock);
            TypeVariableImpl typeVariableImpl = ((TypeVariableImpl) createInstance("sun.reflect.generics.reflectiveObjects.TypeVariableImpl"));
            
            Class spring4TypeResolvableHelperClazz = Class.forName("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter$Spring4TypeResolvableHelper");
            Class typeVariableImplType = Class.forName("java.lang.reflect.TypeVariable");
            Class resolvableTypeMockType = Class.forName("org.springframework.core.ResolvableType");
            Method resolveVariableMethod = spring4TypeResolvableHelperClazz.getDeclaredMethod("resolveVariable", typeVariableImplType, resolvableTypeMockType);
            resolveVariableMethod.setAccessible(true);
            java.lang.Object[] resolveVariableMethodArguments = new java.lang.Object[2];
            resolveVariableMethodArguments[0] = typeVariableImpl;
            resolveVariableMethodArguments[1] = resolvableTypeMock;
            try {
                resolveVariableMethod.invoke(null, resolveVariableMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }} finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testResolveVariable10() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(ResolvableType.class);
            ResolvableType resolvableTypeMock = mock(ResolvableType.class);
            when(resolvableTypeMock.resolve()).thenReturn(((Class) null));
            ResolvableType resolvableTypeMock1 = mock(ResolvableType.class);
            Class class1 = Object.class;
            when(resolvableTypeMock1.resolve()).thenReturn(class1, class1);
            mockedStatic.when(() -> {
                ResolvableType.forType(any(Type.class), any(ResolvableType.class));
            }).thenReturn(resolvableTypeMock, resolvableTypeMock1);
            TypeVariableImpl typeVariableImpl = ((TypeVariableImpl) createInstance("sun.reflect.generics.reflectiveObjects.TypeVariableImpl"));
            ResolvableType resolvableTypeMock2 = mock(ResolvableType.class);
            when(resolvableTypeMock2.hasGenerics()).thenReturn(true);
            ResolvableType resolvableTypeMock3 = mock(ResolvableType.class);
            when(resolvableTypeMock2.getSuperType()).thenReturn(resolvableTypeMock3);
            org.springframework.core.ResolvableType[] resolvableTypeArray = new org.springframework.core.ResolvableType[9];
            ResolvableType resolvableTypeMock4 = mock(ResolvableType.class);
            when(resolvableTypeMock4.hasGenerics()).thenReturn(true);
            resolvableTypeArray[0] = resolvableTypeMock4;
            when(resolvableTypeMock2.getInterfaces()).thenReturn(resolvableTypeArray);
            
            Class spring4TypeResolvableHelperClazz = Class.forName("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter$Spring4TypeResolvableHelper");
            Class typeVariableImplType = Class.forName("java.lang.reflect.TypeVariable");
            Class resolvableTypeMock2Type = Class.forName("org.springframework.core.ResolvableType");
            Method resolveVariableMethod = spring4TypeResolvableHelperClazz.getDeclaredMethod("resolveVariable", typeVariableImplType, resolvableTypeMock2Type);
            resolveVariableMethod.setAccessible(true);
            java.lang.Object[] resolveVariableMethodArguments = new java.lang.Object[2];
            resolveVariableMethodArguments[0] = typeVariableImpl;
            resolveVariableMethodArguments[1] = resolvableTypeMock2;
            ResolvableType actual = ((ResolvableType) resolveVariableMethod.invoke(null, resolveVariableMethodArguments));
            
            
            // Current deep equals depth exceeds max depth 0
            assertTrue(deepEquals(resolvableTypeMock1, actual));
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testResolveVariable11() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(ResolvableType.class);
            ResolvableType resolvableTypeMock = mock(ResolvableType.class);
            when(resolvableTypeMock.resolve()).thenReturn(((Class) null));
            ResolvableType resolvableTypeMock1 = mock(ResolvableType.class);
            when(resolvableTypeMock1.hasGenerics()).thenReturn(true);
            Class class1 = Object.class;
            when(resolvableTypeMock1.resolve()).thenReturn(class1, class1, ((Class) null));
            mockedStatic.when(() -> {
                ResolvableType.forType(any(Type.class), any(ResolvableType.class));
            }).thenReturn(resolvableTypeMock, resolvableTypeMock1);
            TypeVariableImpl typeVariableImpl = ((TypeVariableImpl) createInstance("sun.reflect.generics.reflectiveObjects.TypeVariableImpl"));
            ResolvableType resolvableTypeMock2 = mock(ResolvableType.class);
            when(resolvableTypeMock2.hasGenerics()).thenReturn(true);
            when(resolvableTypeMock2.getSuperType()).thenReturn(resolvableTypeMock);
            org.springframework.core.ResolvableType[] resolvableTypeArray = new org.springframework.core.ResolvableType[1];
            ResolvableType resolvableTypeMock3 = mock(ResolvableType.class);
            when(resolvableTypeMock3.hasGenerics()).thenReturn(false);
            when(resolvableTypeMock3.getSuperType()).thenReturn(resolvableTypeMock1);
            resolvableTypeArray[0] = resolvableTypeMock3;
            when(resolvableTypeMock2.getInterfaces()).thenReturn(resolvableTypeArray);
            
            Class spring4TypeResolvableHelperClazz = Class.forName("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter$Spring4TypeResolvableHelper");
            Class typeVariableImplType = Class.forName("java.lang.reflect.TypeVariable");
            Class resolvableTypeMock2Type = Class.forName("org.springframework.core.ResolvableType");
            Method resolveVariableMethod = spring4TypeResolvableHelperClazz.getDeclaredMethod("resolveVariable", typeVariableImplType, resolvableTypeMock2Type);
            resolveVariableMethod.setAccessible(true);
            java.lang.Object[] resolveVariableMethodArguments = new java.lang.Object[2];
            resolveVariableMethodArguments[0] = typeVariableImpl;
            resolveVariableMethodArguments[1] = resolvableTypeMock2;
            ResolvableType actual = ((ResolvableType) resolveVariableMethod.invoke(null, resolveVariableMethodArguments));
            
            
            // Current deep equals depth exceeds max depth 0
            assertTrue(deepEquals(resolvableTypeMock, actual));
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIsSupport1() throws Throwable  {
        Class spring4TypeResolvableHelperClazz = Class.forName("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter$Spring4TypeResolvableHelper");
        Method isSupportMethod = spring4TypeResolvableHelperClazz.getDeclaredMethod("isSupport");
        isSupportMethod.setAccessible(true);
        java.lang.Object[] isSupportMethodArguments = new java.lang.Object[0];
        boolean actual = ((boolean) isSupportMethod.invoke(null, isSupportMethodArguments));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIsSupport2() throws Throwable  {
        Class spring4TypeResolvableHelperClazz = Class.forName("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter$Spring4TypeResolvableHelper");
        boolean prevHasClazzResolvableType = ((boolean) getStaticFieldValue(spring4TypeResolvableHelperClazz, "hasClazzResolvableType"));
        try {
            setStaticField(spring4TypeResolvableHelperClazz, "hasClazzResolvableType", false);
            
            Method isSupportMethod = spring4TypeResolvableHelperClazz.getDeclaredMethod("isSupport");
            isSupportMethod.setAccessible(true);
            java.lang.Object[] isSupportMethodArguments = new java.lang.Object[0];
            boolean actual = ((boolean) isSupportMethod.invoke(null, isSupportMethodArguments));
            
            assertFalse(actual);
        } finally {
            setStaticField(spring4TypeResolvableHelperClazz, "hasClazzResolvableType", prevHasClazzResolvableType);
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetType11() throws Throwable  {
        Class class1 = Object.class;
        
        Class spring4TypeResolvableHelperClazz = Class.forName("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter$Spring4TypeResolvableHelper");
        Class class1Type = Class.forName("java.lang.reflect.Type");
        Class classType = Class.forName("java.lang.Class");
        Method getTypeMethod = spring4TypeResolvableHelperClazz.getDeclaredMethod("getType", class1Type, classType);
        getTypeMethod.setAccessible(true);
        java.lang.Object[] getTypeMethodArguments = new java.lang.Object[2];
        getTypeMethodArguments[0] = class1;
        getTypeMethodArguments[1] = null;
        Type actual = ((Type) getTypeMethod.invoke(null, getTypeMethodArguments));
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(class1, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetType12() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(ResolvableType.class);
            mockedStatic.when(() -> {
                forType(org.mockito.ArgumentMatchers.any());
            }).thenReturn(((ResolvableType) null));
            ParameterizedTypeImpl parameterizedTypeImpl = ((ParameterizedTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl"));
            Class class1 = Object.class;
            
            Class spring4TypeResolvableHelperClazz = Class.forName("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter$Spring4TypeResolvableHelper");
            Class parameterizedTypeImplType = Class.forName("java.lang.reflect.Type");
            Class class1Type = Class.forName("java.lang.Class");
            Method getTypeMethod = spring4TypeResolvableHelperClazz.getDeclaredMethod("getType", parameterizedTypeImplType, class1Type);
            getTypeMethod.setAccessible(true);
            java.lang.Object[] getTypeMethodArguments = new java.lang.Object[2];
            getTypeMethodArguments[0] = parameterizedTypeImpl;
            getTypeMethodArguments[1] = class1;
            try {
                getTypeMethod.invoke(null, getTypeMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }} finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetType13() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(ResolvableType.class);
            ResolvableType resolvableTypeMock = mock(ResolvableType.class);
            mockedStatic.when(() -> {
                forType(org.mockito.ArgumentMatchers.any());
            }).thenReturn(resolvableTypeMock);
            Class class1 = Object.class;
            
            Class spring4TypeResolvableHelperClazz = Class.forName("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter$Spring4TypeResolvableHelper");
            Class typeType = Class.forName("java.lang.reflect.Type");
            Class class1Type = Class.forName("java.lang.Class");
            Method getTypeMethod = spring4TypeResolvableHelperClazz.getDeclaredMethod("getType", typeType, class1Type);
            getTypeMethod.setAccessible(true);
            java.lang.Object[] getTypeMethodArguments = new java.lang.Object[2];
            getTypeMethodArguments[0] = null;
            getTypeMethodArguments[1] = class1;
            Type actual = ((Type) getTypeMethod.invoke(null, getTypeMethodArguments));
            
            assertNull(actual);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetType14() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(ResolvableType.class);
            ResolvableType resolvableTypeMock = mock(ResolvableType.class);
            when(resolvableTypeMock.hasUnresolvableGenerics()).thenReturn(false);
            mockedStatic.when(() -> {
                forType(org.mockito.ArgumentMatchers.any());
            }).thenReturn(resolvableTypeMock);
            ParameterizedTypeImpl parameterizedTypeImpl = ((ParameterizedTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl"));
            Class class1 = Object.class;
            
            Class spring4TypeResolvableHelperClazz = Class.forName("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter$Spring4TypeResolvableHelper");
            Class parameterizedTypeImplType = Class.forName("java.lang.reflect.Type");
            Class class1Type = Class.forName("java.lang.Class");
            Method getTypeMethod = spring4TypeResolvableHelperClazz.getDeclaredMethod("getType", parameterizedTypeImplType, class1Type);
            getTypeMethod.setAccessible(true);
            java.lang.Object[] getTypeMethodArguments = new java.lang.Object[2];
            getTypeMethodArguments[0] = parameterizedTypeImpl;
            getTypeMethodArguments[1] = class1;
            Type actual = ((Type) getTypeMethod.invoke(null, getTypeMethodArguments));
            
            
            // Current deep equals depth exceeds max depth 0
            assertTrue(deepEquals(parameterizedTypeImpl, actual));
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetType15() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(ResolvableType.class);
            ResolvableType resolvableTypeMock = mock(ResolvableType.class);
            when(resolvableTypeMock.hasGenerics()).thenReturn(false);
            ResolvableType resolvableTypeMock1 = mock(ResolvableType.class);
            when(resolvableTypeMock.getSuperType()).thenReturn(resolvableTypeMock1);
            when(resolvableTypeMock.getInterfaces()).thenReturn(((org.springframework.core.ResolvableType[]) null));
            mockedStatic.when(() -> {
                forType(org.mockito.ArgumentMatchers.any());
            }).thenReturn(resolvableTypeMock);
            mockedStatic.when(() -> {
                forClass(org.mockito.ArgumentMatchers.any());
            }).thenReturn(resolvableTypeMock);
            TypeVariableImpl typeVariableImpl = ((TypeVariableImpl) createInstance("sun.reflect.generics.reflectiveObjects.TypeVariableImpl"));
            Class class1 = Object.class;
            
            Class spring4TypeResolvableHelperClazz = Class.forName("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter$Spring4TypeResolvableHelper");
            Class typeVariableImplType = Class.forName("java.lang.reflect.Type");
            Class class1Type = Class.forName("java.lang.Class");
            Method getTypeMethod = spring4TypeResolvableHelperClazz.getDeclaredMethod("getType", typeVariableImplType, class1Type);
            getTypeMethod.setAccessible(true);
            java.lang.Object[] getTypeMethodArguments = new java.lang.Object[2];
            getTypeMethodArguments[0] = typeVariableImpl;
            getTypeMethodArguments[1] = class1;
            try {
                getTypeMethod.invoke(null, getTypeMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }} finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetType16() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(ResolvableType.class);
            mockedStatic.when(() -> {
                forType(org.mockito.ArgumentMatchers.any());
            }).thenReturn(((ResolvableType) null));
            ResolvableType resolvableTypeMock = mock(ResolvableType.class);
            when(resolvableTypeMock.hasGenerics()).thenReturn(true);
            mockedStatic.when(() -> {
                forClass(org.mockito.ArgumentMatchers.any());
            }).thenReturn(resolvableTypeMock);
            mockedStatic.when(() -> {
                ResolvableType.forType(any(Type.class), any(ResolvableType.class));
            }).thenReturn(((ResolvableType) null));
            TypeVariableImpl typeVariableImpl = ((TypeVariableImpl) createInstance("sun.reflect.generics.reflectiveObjects.TypeVariableImpl"));
            Class class1 = Object.class;
            
            Class spring4TypeResolvableHelperClazz = Class.forName("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter$Spring4TypeResolvableHelper");
            Class typeVariableImplType = Class.forName("java.lang.reflect.Type");
            Class class1Type = Class.forName("java.lang.Class");
            Method getTypeMethod = spring4TypeResolvableHelperClazz.getDeclaredMethod("getType", typeVariableImplType, class1Type);
            getTypeMethod.setAccessible(true);
            java.lang.Object[] getTypeMethodArguments = new java.lang.Object[2];
            getTypeMethodArguments[0] = typeVariableImpl;
            getTypeMethodArguments[1] = class1;
            try {
                getTypeMethod.invoke(null, getTypeMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }} finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetType17() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(ResolvableType.class);
            mockedStatic.when(() -> {
                forType(org.mockito.ArgumentMatchers.any());
            }).thenReturn(((ResolvableType) null));
            ResolvableType resolvableTypeMock = mock(ResolvableType.class);
            when(resolvableTypeMock.hasGenerics()).thenReturn(true);
            Class class1 = Object.class;
            when(resolvableTypeMock.resolve()).thenReturn(class1, class1);
            mockedStatic.when(() -> {
                forClass(org.mockito.ArgumentMatchers.any());
            }).thenReturn(resolvableTypeMock);
            mockedStatic.when(() -> {
                ResolvableType.forType(any(Type.class), any(ResolvableType.class));
            }).thenReturn(resolvableTypeMock);
            TypeVariableImpl typeVariableImpl = ((TypeVariableImpl) createInstance("sun.reflect.generics.reflectiveObjects.TypeVariableImpl"));
            
            Class spring4TypeResolvableHelperClazz = Class.forName("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter$Spring4TypeResolvableHelper");
            Class typeVariableImplType = Class.forName("java.lang.reflect.Type");
            Class class1Type = Class.forName("java.lang.Class");
            Method getTypeMethod = spring4TypeResolvableHelperClazz.getDeclaredMethod("getType", typeVariableImplType, class1Type);
            getTypeMethod.setAccessible(true);
            java.lang.Object[] getTypeMethodArguments = new java.lang.Object[2];
            getTypeMethodArguments[0] = typeVariableImpl;
            getTypeMethodArguments[1] = class1;
            Type actual = ((Type) getTypeMethod.invoke(null, getTypeMethodArguments));
            
            
            // Current deep equals depth exceeds max depth 0
            assertTrue(deepEquals(class1, actual));
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetType18() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(ResolvableType.class);
            ResolvableType resolvableTypeMock = mock(ResolvableType.class);
            mockedStatic.when(() -> {
                forType(org.mockito.ArgumentMatchers.any());
            }).thenReturn(resolvableTypeMock);
            ResolvableType resolvableTypeMock1 = mock(ResolvableType.class);
            when(resolvableTypeMock1.hasGenerics()).thenReturn(true);
            ResolvableType resolvableTypeMock2 = mock(ResolvableType.class);
            when(resolvableTypeMock1.getSuperType()).thenReturn(resolvableTypeMock2);
            org.springframework.core.ResolvableType[] resolvableTypeArray = new org.springframework.core.ResolvableType[0];
            when(resolvableTypeMock1.getInterfaces()).thenReturn(resolvableTypeArray);
            when(resolvableTypeMock1.resolve()).thenReturn(((Class) null));
            mockedStatic.when(() -> {
                forClass(org.mockito.ArgumentMatchers.any());
            }).thenReturn(resolvableTypeMock1);
            mockedStatic.when(() -> {
                ResolvableType.forType(any(Type.class), any(ResolvableType.class));
            }).thenReturn(resolvableTypeMock1);
            TypeVariableImpl typeVariableImpl = ((TypeVariableImpl) createInstance("sun.reflect.generics.reflectiveObjects.TypeVariableImpl"));
            Class class1 = Object.class;
            
            Class spring4TypeResolvableHelperClazz = Class.forName("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter$Spring4TypeResolvableHelper");
            Class typeVariableImplType = Class.forName("java.lang.reflect.Type");
            Class class1Type = Class.forName("java.lang.Class");
            Method getTypeMethod = spring4TypeResolvableHelperClazz.getDeclaredMethod("getType", typeVariableImplType, class1Type);
            getTypeMethod.setAccessible(true);
            java.lang.Object[] getTypeMethodArguments = new java.lang.Object[2];
            getTypeMethodArguments[0] = typeVariableImpl;
            getTypeMethodArguments[1] = class1;
            Type actual = ((Type) getTypeMethod.invoke(null, getTypeMethodArguments));
            
            
            // Current deep equals depth exceeds max depth 0
            assertTrue(deepEquals(typeVariableImpl, actual));
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetType19() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(ResolvableType.class);
            ResolvableType resolvableTypeMock = mock(ResolvableType.class);
            when(resolvableTypeMock.hasUnresolvableGenerics()).thenReturn(true);
            mockedStatic.when(() -> {
                forType(org.mockito.ArgumentMatchers.any());
            }).thenReturn(resolvableTypeMock);
            ParameterizedTypeImpl parameterizedTypeImpl = ((ParameterizedTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl"));
            java.lang.reflect.Type[] typeArray = new java.lang.reflect.Type[0];
            setField(parameterizedTypeImpl, "actualTypeArguments", typeArray);
            Class class1 = Object.class;
            
            Class spring4TypeResolvableHelperClazz = Class.forName("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter$Spring4TypeResolvableHelper");
            Class parameterizedTypeImplType = Class.forName("java.lang.reflect.Type");
            Class class1Type = Class.forName("java.lang.Class");
            Method getTypeMethod = spring4TypeResolvableHelperClazz.getDeclaredMethod("getType", parameterizedTypeImplType, class1Type);
            getTypeMethod.setAccessible(true);
            java.lang.Object[] getTypeMethodArguments = new java.lang.Object[2];
            getTypeMethodArguments[0] = parameterizedTypeImpl;
            getTypeMethodArguments[1] = class1;
            try {
                getTypeMethod.invoke(null, getTypeMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }} finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetType20() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(ResolvableType.class);
            mockedStatic.when(() -> {
                forType(org.mockito.ArgumentMatchers.any());
            }).thenReturn(((ResolvableType) null));
            mockedStatic.when(() -> {
                forClass(org.mockito.ArgumentMatchers.any());
            }).thenReturn(((ResolvableType) null));
            TypeVariableImpl typeVariableImpl = ((TypeVariableImpl) createInstance("sun.reflect.generics.reflectiveObjects.TypeVariableImpl"));
            Class class1 = Object.class;
            
            Class spring4TypeResolvableHelperClazz = Class.forName("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter$Spring4TypeResolvableHelper");
            Class typeVariableImplType = Class.forName("java.lang.reflect.Type");
            Class class1Type = Class.forName("java.lang.Class");
            Method getTypeMethod = spring4TypeResolvableHelperClazz.getDeclaredMethod("getType", typeVariableImplType, class1Type);
            getTypeMethod.setAccessible(true);
            java.lang.Object[] getTypeMethodArguments = new java.lang.Object[2];
            getTypeMethodArguments[0] = typeVariableImpl;
            getTypeMethodArguments[1] = class1;
            try {
                getTypeMethod.invoke(null, getTypeMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }} finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetType21() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(ResolvableType.class);
            mockedStatic.when(() -> {
                forType(org.mockito.ArgumentMatchers.any());
            }).thenReturn(((ResolvableType) null));
            ResolvableType resolvableTypeMock = mock(ResolvableType.class);
            when(resolvableTypeMock.hasGenerics()).thenReturn(false);
            ResolvableType resolvableTypeMock1 = mock(ResolvableType.class);
            when(resolvableTypeMock.getSuperType()).thenReturn(resolvableTypeMock1);
            org.springframework.core.ResolvableType[] resolvableTypeArray = new org.springframework.core.ResolvableType[9];
            ResolvableType resolvableTypeMock2 = mock(ResolvableType.class);
            when(resolvableTypeMock2.forType(org.mockito.ArgumentMatchers.any())).thenReturn(((ResolvableType) null));
            ResolvableType resolvableTypeMock3 = mock(ResolvableType.class);
            when(resolvableTypeMock3.hasGenerics()).thenReturn(false);
            when(resolvableTypeMock3.getSuperType()).thenReturn(resolvableTypeMock1);
            when(resolvableTypeMock3.getInterfaces()).thenReturn(resolvableTypeArray);
            when(resolvableTypeMock2.forClass(org.mockito.ArgumentMatchers.any())).thenReturn(resolvableTypeMock3);
            ResolvableType resolvableTypeMock4 = mock(ResolvableType.class);
            Class class1 = Object.class;
            when(resolvableTypeMock4.resolve()).thenReturn(class1, class1, class1);
            when(resolvableTypeMock2.forType(any(Type.class), any(ResolvableType.class))).thenReturn(resolvableTypeMock4);
            when(resolvableTypeMock2.hasGenerics()).thenReturn(true);
            resolvableTypeArray[0] = resolvableTypeMock2;
            ResolvableType resolvableType = ((ResolvableType) createInstance("org.springframework.core.ResolvableType"));
            resolvableTypeArray[1] = resolvableType;
            resolvableTypeArray[2] = resolvableType;
            resolvableTypeArray[3] = resolvableType;
            resolvableTypeArray[4] = resolvableType;
            resolvableTypeArray[5] = resolvableType;
            resolvableTypeArray[6] = resolvableType;
            resolvableTypeArray[7] = resolvableType;
            resolvableTypeArray[8] = resolvableType;
            when(resolvableTypeMock.getInterfaces()).thenReturn(resolvableTypeArray);
            mockedStatic.when(() -> {
                forClass(org.mockito.ArgumentMatchers.any());
            }).thenReturn(resolvableTypeMock);
            mockedStatic.when(() -> {
                ResolvableType.forType(any(Type.class), any(ResolvableType.class));
            }).thenReturn(resolvableTypeMock4);
            TypeVariableImpl typeVariableImpl = ((TypeVariableImpl) createInstance("sun.reflect.generics.reflectiveObjects.TypeVariableImpl"));
            
            Class spring4TypeResolvableHelperClazz = Class.forName("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter$Spring4TypeResolvableHelper");
            Class typeVariableImplType = Class.forName("java.lang.reflect.Type");
            Class class1Type = Class.forName("java.lang.Class");
            Method getTypeMethod = spring4TypeResolvableHelperClazz.getDeclaredMethod("getType", typeVariableImplType, class1Type);
            getTypeMethod.setAccessible(true);
            java.lang.Object[] getTypeMethodArguments = new java.lang.Object[2];
            getTypeMethodArguments[0] = typeVariableImpl;
            getTypeMethodArguments[1] = class1;
            Type actual = ((Type) getTypeMethod.invoke(null, getTypeMethodArguments));
            
            
            // Current deep equals depth exceeds max depth 0
            assertTrue(deepEquals(class1, actual));
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetType22() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(ResolvableType.class);
            ResolvableType resolvableTypeMock = mock(ResolvableType.class);
            when(resolvableTypeMock.hasUnresolvableGenerics()).thenReturn(true);
            mockedStatic.when(() -> {
                forType(org.mockito.ArgumentMatchers.any());
            }).thenReturn(resolvableTypeMock, ((ResolvableType) null));
            ParameterizedTypeImpl parameterizedTypeImpl = ((ParameterizedTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl"));
            java.lang.reflect.Type[] typeArray = new java.lang.reflect.Type[1];
            Class class1 = Object.class;
            typeArray[0] = ((Type) class1);
            setField(parameterizedTypeImpl, "actualTypeArguments", typeArray);
            
            Class spring4TypeResolvableHelperClazz = Class.forName("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter$Spring4TypeResolvableHelper");
            Class parameterizedTypeImplType = Class.forName("java.lang.reflect.Type");
            Class class1Type = Class.forName("java.lang.Class");
            Method getTypeMethod = spring4TypeResolvableHelperClazz.getDeclaredMethod("getType", parameterizedTypeImplType, class1Type);
            getTypeMethod.setAccessible(true);
            java.lang.Object[] getTypeMethodArguments = new java.lang.Object[2];
            getTypeMethodArguments[0] = parameterizedTypeImpl;
            getTypeMethodArguments[1] = class1;
            try {
                getTypeMethod.invoke(null, getTypeMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }} finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetType23() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(ResolvableType.class);
            ResolvableType resolvableTypeMock = mock(ResolvableType.class);
            when(resolvableTypeMock.hasUnresolvableGenerics()).thenReturn(true);
            when(resolvableTypeMock.getRawClass()).thenReturn(((Class) null));
            when(resolvableTypeMock.getType()).thenReturn(((Type) null));
            mockedStatic.when(() -> {
                forType(org.mockito.ArgumentMatchers.any());
            }).thenReturn(resolvableTypeMock);
            mockedStatic.when(() -> {
                ResolvableType.forClassWithGenerics(any(Class.class), any(java.lang.Class[].class));
            }).thenReturn(resolvableTypeMock);
            ParameterizedTypeImpl parameterizedTypeImpl = ((ParameterizedTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl"));
            java.lang.reflect.Type[] typeArray = new java.lang.reflect.Type[0];
            setField(parameterizedTypeImpl, "actualTypeArguments", typeArray);
            Class class1 = Object.class;
            
            Class spring4TypeResolvableHelperClazz = Class.forName("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter$Spring4TypeResolvableHelper");
            Class parameterizedTypeImplType = Class.forName("java.lang.reflect.Type");
            Class class1Type = Class.forName("java.lang.Class");
            Method getTypeMethod = spring4TypeResolvableHelperClazz.getDeclaredMethod("getType", parameterizedTypeImplType, class1Type);
            getTypeMethod.setAccessible(true);
            java.lang.Object[] getTypeMethodArguments = new java.lang.Object[2];
            getTypeMethodArguments[0] = parameterizedTypeImpl;
            getTypeMethodArguments[1] = class1;
            Type actual = ((Type) getTypeMethod.invoke(null, getTypeMethodArguments));
            
            assertNull(actual);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetType24() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(ResolvableType.class);
            ResolvableType resolvableTypeMock = mock(ResolvableType.class);
            when(resolvableTypeMock.hasUnresolvableGenerics()).thenReturn(true);
            Class class1 = Object.class;
            when(resolvableTypeMock.getRawClass()).thenReturn(class1);
            mockedStatic.when(() -> {
                forType(org.mockito.ArgumentMatchers.any());
            }).thenReturn(resolvableTypeMock);
            mockedStatic.when(() -> {
                ResolvableType.forClassWithGenerics(any(Class.class), any(java.lang.Class[].class));
            }).thenReturn(((ResolvableType) null));
            ParameterizedTypeImpl parameterizedTypeImpl = ((ParameterizedTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl"));
            java.lang.reflect.Type[] typeArray = new java.lang.reflect.Type[0];
            setField(parameterizedTypeImpl, "actualTypeArguments", typeArray);
            
            Class spring4TypeResolvableHelperClazz = Class.forName("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter$Spring4TypeResolvableHelper");
            Class parameterizedTypeImplType = Class.forName("java.lang.reflect.Type");
            Class class1Type = Class.forName("java.lang.Class");
            Method getTypeMethod = spring4TypeResolvableHelperClazz.getDeclaredMethod("getType", parameterizedTypeImplType, class1Type);
            getTypeMethod.setAccessible(true);
            java.lang.Object[] getTypeMethodArguments = new java.lang.Object[2];
            getTypeMethodArguments[0] = parameterizedTypeImpl;
            getTypeMethodArguments[1] = class1;
            try {
                getTypeMethod.invoke(null, getTypeMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }} finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    
    ///region Errors report for getType
    
    public void testGetType_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // <Throwable with empty message>
        // 
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetType26() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(ResolvableType.class);
            mockedStatic.when(() -> {
                forType(org.mockito.ArgumentMatchers.any());
            }).thenReturn(((ResolvableType) null));
            ResolvableType resolvableTypeMock = mock(ResolvableType.class);
            when(resolvableTypeMock.hasGenerics()).thenReturn(false);
            when(resolvableTypeMock.getSuperType()).thenReturn(((ResolvableType) null));
            mockedStatic.when(() -> {
                forClass(org.mockito.ArgumentMatchers.any());
            }).thenReturn(resolvableTypeMock);
            TypeVariableImpl typeVariableImpl = ((TypeVariableImpl) createInstance("sun.reflect.generics.reflectiveObjects.TypeVariableImpl"));
            Class class1 = Object.class;
            
            Class spring4TypeResolvableHelperClazz = Class.forName("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter$Spring4TypeResolvableHelper");
            Class typeVariableImplType = Class.forName("java.lang.reflect.Type");
            Class class1Type = Class.forName("java.lang.Class");
            Method getTypeMethod = spring4TypeResolvableHelperClazz.getDeclaredMethod("getType", typeVariableImplType, class1Type);
            getTypeMethod.setAccessible(true);
            java.lang.Object[] getTypeMethodArguments = new java.lang.Object[2];
            getTypeMethodArguments[0] = typeVariableImpl;
            getTypeMethodArguments[1] = class1;
            try {
                getTypeMethod.invoke(null, getTypeMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }} finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    
    ///region Errors report for getType
    
    public void testGetType_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // <Throwable with empty message>
        // 
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetType28() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(ResolvableType.class);
            ResolvableType resolvableTypeMock = mock(ResolvableType.class);
            when(resolvableTypeMock.hasUnresolvableGenerics()).thenReturn(true);
            mockedStatic.when(() -> {
                forType(org.mockito.ArgumentMatchers.any());
            }).thenReturn(resolvableTypeMock);
            mockedStatic.when(() -> {
                forClass(org.mockito.ArgumentMatchers.any());
            }).thenReturn(((ResolvableType) null));
            ParameterizedTypeImpl parameterizedTypeImpl = ((ParameterizedTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl"));
            java.lang.reflect.Type[] typeArray = new java.lang.reflect.Type[1];
            TypeVariableImpl typeVariableImpl = ((TypeVariableImpl) createInstance("sun.reflect.generics.reflectiveObjects.TypeVariableImpl"));
            typeArray[0] = ((Type) typeVariableImpl);
            setField(parameterizedTypeImpl, "actualTypeArguments", typeArray);
            Class class1 = Object.class;
            
            Class spring4TypeResolvableHelperClazz = Class.forName("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter$Spring4TypeResolvableHelper");
            Class parameterizedTypeImplType = Class.forName("java.lang.reflect.Type");
            Class class1Type = Class.forName("java.lang.Class");
            Method getTypeMethod = spring4TypeResolvableHelperClazz.getDeclaredMethod("getType", parameterizedTypeImplType, class1Type);
            getTypeMethod.setAccessible(true);
            java.lang.Object[] getTypeMethodArguments = new java.lang.Object[2];
            getTypeMethodArguments[0] = parameterizedTypeImpl;
            getTypeMethodArguments[1] = class1;
            try {
                getTypeMethod.invoke(null, getTypeMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }} finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetType29() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(ResolvableType.class);
            ResolvableType resolvableTypeMock = mock(ResolvableType.class);
            mockedStatic.when(() -> {
                forType(org.mockito.ArgumentMatchers.any());
            }).thenReturn(resolvableTypeMock);
            ResolvableType resolvableTypeMock1 = mock(ResolvableType.class);
            when(resolvableTypeMock1.hasGenerics()).thenReturn(false);
            ResolvableType resolvableTypeMock2 = mock(ResolvableType.class);
            Class class1 = Object.class;
            when(resolvableTypeMock2.resolve()).thenReturn(class1, ((Class) null));
            when(resolvableTypeMock1.getSuperType()).thenReturn(resolvableTypeMock2);
            org.springframework.core.ResolvableType[] resolvableTypeArray = new org.springframework.core.ResolvableType[1];
            ResolvableType resolvableTypeMock3 = mock(ResolvableType.class);
            when(resolvableTypeMock3.forType(org.mockito.ArgumentMatchers.any())).thenReturn(resolvableTypeMock);
            ResolvableType resolvableTypeMock4 = mock(ResolvableType.class);
            when(resolvableTypeMock4.hasGenerics()).thenReturn(false);
            when(resolvableTypeMock4.getSuperType()).thenReturn(resolvableTypeMock2);
            when(resolvableTypeMock4.getInterfaces()).thenReturn(resolvableTypeArray);
            when(resolvableTypeMock3.forClass(org.mockito.ArgumentMatchers.any())).thenReturn(resolvableTypeMock4);
            when(resolvableTypeMock3.forType(any(Type.class), any(ResolvableType.class))).thenReturn(resolvableTypeMock2);
            when(resolvableTypeMock3.hasGenerics()).thenReturn(true);
            resolvableTypeArray[0] = resolvableTypeMock3;
            when(resolvableTypeMock1.getInterfaces()).thenReturn(resolvableTypeArray);
            mockedStatic.when(() -> {
                forClass(org.mockito.ArgumentMatchers.any());
            }).thenReturn(resolvableTypeMock1);
            mockedStatic.when(() -> {
                ResolvableType.forType(any(Type.class), any(ResolvableType.class));
            }).thenReturn(resolvableTypeMock2);
            TypeVariableImpl typeVariableImpl = ((TypeVariableImpl) createInstance("sun.reflect.generics.reflectiveObjects.TypeVariableImpl"));
            
            Class spring4TypeResolvableHelperClazz = Class.forName("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter$Spring4TypeResolvableHelper");
            Class typeVariableImplType = Class.forName("java.lang.reflect.Type");
            Class class1Type = Class.forName("java.lang.Class");
            Method getTypeMethod = spring4TypeResolvableHelperClazz.getDeclaredMethod("getType", typeVariableImplType, class1Type);
            getTypeMethod.setAccessible(true);
            java.lang.Object[] getTypeMethodArguments = new java.lang.Object[2];
            getTypeMethodArguments[0] = typeVariableImpl;
            getTypeMethodArguments[1] = class1;
            Type actual = ((Type) getTypeMethod.invoke(null, getTypeMethodArguments));
            
            
            // Current deep equals depth exceeds max depth 0
            assertTrue(deepEquals(typeVariableImpl, actual));
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetType30() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(ResolvableType.class);
            ResolvableType resolvableTypeMock = mock(ResolvableType.class);
            when(resolvableTypeMock.hasUnresolvableGenerics()).thenReturn(true);
            when(resolvableTypeMock.hasGenerics()).thenReturn(true);
            mockedStatic.when(() -> {
                forType(org.mockito.ArgumentMatchers.any());
            }).thenReturn(resolvableTypeMock, ((ResolvableType) null));
            mockedStatic.when(() -> {
                forClass(org.mockito.ArgumentMatchers.any());
            }).thenReturn(resolvableTypeMock);
            ResolvableType resolvableTypeMock1 = mock(ResolvableType.class);
            Class class1 = Object.class;
            when(resolvableTypeMock1.resolve()).thenReturn(class1);
            mockedStatic.when(() -> {
                ResolvableType.forType(any(Type.class), any(ResolvableType.class));
            }).thenReturn(resolvableTypeMock1);
            ParameterizedTypeImpl parameterizedTypeImpl = ((ParameterizedTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl"));
            java.lang.reflect.Type[] typeArray = new java.lang.reflect.Type[1];
            TypeVariableImpl typeVariableImpl = ((TypeVariableImpl) createInstance("sun.reflect.generics.reflectiveObjects.TypeVariableImpl"));
            typeArray[0] = ((Type) typeVariableImpl);
            setField(parameterizedTypeImpl, "actualTypeArguments", typeArray);
            
            Class spring4TypeResolvableHelperClazz = Class.forName("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter$Spring4TypeResolvableHelper");
            Class parameterizedTypeImplType = Class.forName("java.lang.reflect.Type");
            Class class1Type = Class.forName("java.lang.Class");
            Method getTypeMethod = spring4TypeResolvableHelperClazz.getDeclaredMethod("getType", parameterizedTypeImplType, class1Type);
            getTypeMethod.setAccessible(true);
            java.lang.Object[] getTypeMethodArguments = new java.lang.Object[2];
            getTypeMethodArguments[0] = parameterizedTypeImpl;
            getTypeMethodArguments[1] = class1;
            try {
                getTypeMethod.invoke(null, getTypeMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }} finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetType31() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(ResolvableType.class);
            ResolvableType resolvableTypeMock = mock(ResolvableType.class);
            when(resolvableTypeMock.hasUnresolvableGenerics()).thenReturn(true);
            when(resolvableTypeMock.getRawClass()).thenReturn(((Class) null));
            when(resolvableTypeMock.resolve()).thenReturn(((Class) null));
            when(resolvableTypeMock.getType()).thenReturn(((Type) null));
            mockedStatic.when(() -> {
                forType(org.mockito.ArgumentMatchers.any());
            }).thenReturn(resolvableTypeMock, resolvableTypeMock);
            mockedStatic.when(() -> {
                ResolvableType.forClassWithGenerics(any(Class.class), any(java.lang.Class[].class));
            }).thenReturn(resolvableTypeMock);
            ParameterizedTypeImpl parameterizedTypeImpl = ((ParameterizedTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl"));
            java.lang.reflect.Type[] typeArray = new java.lang.reflect.Type[1];
            setField(parameterizedTypeImpl, "actualTypeArguments", typeArray);
            Class class1 = Object.class;
            
            Class spring4TypeResolvableHelperClazz = Class.forName("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter$Spring4TypeResolvableHelper");
            Class parameterizedTypeImplType = Class.forName("java.lang.reflect.Type");
            Class class1Type = Class.forName("java.lang.Class");
            Method getTypeMethod = spring4TypeResolvableHelperClazz.getDeclaredMethod("getType", parameterizedTypeImplType, class1Type);
            getTypeMethod.setAccessible(true);
            java.lang.Object[] getTypeMethodArguments = new java.lang.Object[2];
            getTypeMethodArguments[0] = parameterizedTypeImpl;
            getTypeMethodArguments[1] = class1;
            Type actual = ((Type) getTypeMethod.invoke(null, getTypeMethodArguments));
            
            assertNull(actual);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetType32() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(ResolvableType.class);
            mockedStatic.when(() -> {
                forType(org.mockito.ArgumentMatchers.any());
            }).thenReturn(((ResolvableType) null));
            ResolvableType resolvableTypeMock = mock(ResolvableType.class);
            when(resolvableTypeMock.hasGenerics()).thenReturn(false);
            ResolvableType resolvableTypeMock1 = mock(ResolvableType.class);
            when(resolvableTypeMock.getSuperType()).thenReturn(resolvableTypeMock1);
            org.springframework.core.ResolvableType[] resolvableTypeArray = new org.springframework.core.ResolvableType[9];
            ResolvableType resolvableType = ((ResolvableType) createInstance("org.springframework.core.ResolvableType"));
            resolvableTypeArray[1] = resolvableType;
            resolvableTypeArray[2] = resolvableType;
            resolvableTypeArray[3] = resolvableType;
            resolvableTypeArray[4] = resolvableType;
            resolvableTypeArray[5] = resolvableType;
            resolvableTypeArray[6] = resolvableType;
            resolvableTypeArray[7] = resolvableType;
            resolvableTypeArray[8] = resolvableType;
            when(resolvableTypeMock.getInterfaces()).thenReturn(resolvableTypeArray);
            mockedStatic.when(() -> {
                forClass(org.mockito.ArgumentMatchers.any());
            }).thenReturn(resolvableTypeMock);
            TypeVariableImpl typeVariableImpl = ((TypeVariableImpl) createInstance("sun.reflect.generics.reflectiveObjects.TypeVariableImpl"));
            Class class1 = Object.class;
            
            Class spring4TypeResolvableHelperClazz = Class.forName("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter$Spring4TypeResolvableHelper");
            Class typeVariableImplType = Class.forName("java.lang.reflect.Type");
            Class class1Type = Class.forName("java.lang.Class");
            Method getTypeMethod = spring4TypeResolvableHelperClazz.getDeclaredMethod("getType", typeVariableImplType, class1Type);
            getTypeMethod.setAccessible(true);
            java.lang.Object[] getTypeMethodArguments = new java.lang.Object[2];
            getTypeMethodArguments[0] = typeVariableImpl;
            getTypeMethodArguments[1] = class1;
            try {
                getTypeMethod.invoke(null, getTypeMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }} finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetType33() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(ResolvableType.class);
            ResolvableType resolvableTypeMock = mock(ResolvableType.class);
            when(resolvableTypeMock.hasUnresolvableGenerics()).thenReturn(true);
            when(resolvableTypeMock.getRawClass()).thenReturn(((Class) null));
            when(resolvableTypeMock.hasGenerics()).thenReturn(true);
            when(resolvableTypeMock.resolve()).thenReturn(((Class) null));
            when(resolvableTypeMock.getType()).thenReturn(((Type) null));
            mockedStatic.when(() -> {
                forType(org.mockito.ArgumentMatchers.any());
            }).thenReturn(resolvableTypeMock, resolvableTypeMock);
            mockedStatic.when(() -> {
                forClass(org.mockito.ArgumentMatchers.any());
            }).thenReturn(resolvableTypeMock);
            ResolvableType resolvableTypeMock1 = mock(ResolvableType.class);
            Class class1 = Object.class;
            when(resolvableTypeMock1.resolve()).thenReturn(class1);
            mockedStatic.when(() -> {
                ResolvableType.forType(any(Type.class), any(ResolvableType.class));
            }).thenReturn(resolvableTypeMock1);
            mockedStatic.when(() -> {
                ResolvableType.forClassWithGenerics(any(Class.class), any(java.lang.Class[].class));
            }).thenReturn(resolvableTypeMock);
            ParameterizedTypeImpl parameterizedTypeImpl = ((ParameterizedTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl"));
            java.lang.reflect.Type[] typeArray = new java.lang.reflect.Type[1];
            TypeVariableImpl typeVariableImpl = ((TypeVariableImpl) createInstance("sun.reflect.generics.reflectiveObjects.TypeVariableImpl"));
            typeArray[0] = ((Type) typeVariableImpl);
            setField(parameterizedTypeImpl, "actualTypeArguments", typeArray);
            
            Class spring4TypeResolvableHelperClazz = Class.forName("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter$Spring4TypeResolvableHelper");
            Class parameterizedTypeImplType = Class.forName("java.lang.reflect.Type");
            Class class1Type = Class.forName("java.lang.Class");
            Method getTypeMethod = spring4TypeResolvableHelperClazz.getDeclaredMethod("getType", parameterizedTypeImplType, class1Type);
            getTypeMethod.setAccessible(true);
            java.lang.Object[] getTypeMethodArguments = new java.lang.Object[2];
            getTypeMethodArguments[0] = parameterizedTypeImpl;
            getTypeMethodArguments[1] = class1;
            Type actual = ((Type) getTypeMethod.invoke(null, getTypeMethodArguments));
            
            assertNull(actual);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSpring4TypeResolvableHelper1() throws Throwable  {
        Class spring4TypeResolvableHelperClazz = Class.forName("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter$Spring4TypeResolvableHelper");
        Constructor spring4TypeResolvableHelperConstructor = spring4TypeResolvableHelperClazz.getDeclaredConstructor();
        spring4TypeResolvableHelperConstructor.setAccessible(true);
        java.lang.Object[] spring4TypeResolvableHelperConstructorArguments = new java.lang.Object[0];
        Object actual = spring4TypeResolvableHelperConstructor.newInstance(spring4TypeResolvableHelperConstructorArguments);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSpring4TypeResolvableHelper2() throws Throwable  {
        Class spring4TypeResolvableHelperClazz = Class.forName("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter$Spring4TypeResolvableHelper");
        Constructor spring4TypeResolvableHelperConstructor = spring4TypeResolvableHelperClazz.getDeclaredConstructor();
        spring4TypeResolvableHelperConstructor.setAccessible(true);
        java.lang.Object[] spring4TypeResolvableHelperConstructorArguments = new java.lang.Object[0];
        Object actual = spring4TypeResolvableHelperConstructor.newInstance(spring4TypeResolvableHelperConstructorArguments);
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
    private static Object[] createArray(String className, int length, Object... values) throws ClassNotFoundException {
        Object array = java.lang.reflect.Array.newInstance(Class.forName(className), length);
    
        for (int i = 0; i < values.length; i++) {
            java.lang.reflect.Array.set(array, i, values[i]);
        }
        
        return (Object[]) array;
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
    private static Object getStaticFieldValue(Class<?> clazz, String fieldName) throws Exception {
        java.lang.reflect.Field field;
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);
                java.lang.reflect.Field modifiersField = java.lang.reflect.Field.class.getDeclaredField("modifiers");
                modifiersField.setAccessible(true);
                modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
                
                return field.get(null);
            } catch (NoSuchFieldException e) {
                clazz = clazz.getSuperclass();
            }
        } while (clazz != null);
    
        throw new NoSuchFieldException("Field '" + fieldName + "' not found on class " + clazz);
    }
    private static void setStaticField(Class<?> clazz, String fieldName, Object fieldValue) throws Exception {
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
        field.set(null, fieldValue);
    }
    private static sun.misc.Unsafe getUnsafeInstance() throws Exception {
        java.lang.reflect.Field f = sun.misc.Unsafe.class.getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return (sun.misc.Unsafe) f.get(null);
    }
}
