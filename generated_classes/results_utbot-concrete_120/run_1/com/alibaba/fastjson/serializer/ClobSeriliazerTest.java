package com.alibaba.fastjson.support.spring;

import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.http.server.ServletServerHttpRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.ServletRequestWrapper;
import org.springframework.web.context.support.ContextExposingHttpServletRequest;
import java.lang.reflect.Method;
import org.springframework.http.server.ServletServerHttpResponse;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.serializer.SerializerFeature;
import java.nio.charset.Charset;
import sun.nio.cs.StandardCharsets;
import sun.nio.cs.US_ASCII;
import java.util.concurrent.atomic.AtomicInteger;
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
import sun.reflect.generics.reflectiveObjects.TypeVariableImpl;
import com.alibaba.fastjson.serializer.PascalNameFilter;
import com.alibaba.fastjson.serializer.SerializeFilter;
import com.alibaba.fastjson.serializer.SimplePropertyPreFilter;
import java.lang.reflect.Type;
import org.springframework.core.ResolvableType;
import java.lang.reflect.Constructor;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
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

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertFalse;

public class FastJsonHttpMessageConverterTest {
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testWrite1() throws Throwable  {
        FastJsonHttpMessageConverter fastJsonHttpMessageConverter = new FastJsonHttpMessageConverter();
        Object object = new Object();
        MediaType mediaType = ((MediaType) createInstance("org.springframework.http.MediaType"));
        
        fastJsonHttpMessageConverter.write(object, null, mediaType, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testRead1() throws Throwable  {
        Class spring4TypeResolvableHelperClazz = Class.forName("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter$Spring4TypeResolvableHelper");
        boolean prevHasClazzResolvableType = ((boolean) getStaticFieldValue(spring4TypeResolvableHelperClazz, "hasClazzResolvableType"));
        try {
            setStaticField(spring4TypeResolvableHelperClazz, "hasClazzResolvableType", false);
            FastJsonHttpMessageConverter fastJsonHttpMessageConverter = ((FastJsonHttpMessageConverter) createInstance("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter"));
            
            fastJsonHttpMessageConverter.read(null, null, null);
        } finally {
            setStaticField(spring4TypeResolvableHelperClazz, "hasClazzResolvableType", prevHasClazzResolvableType);
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testRead2() throws Throwable  {
        Class spring4TypeResolvableHelperClazz = Class.forName("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter$Spring4TypeResolvableHelper");
        boolean prevHasClazzResolvableType = ((boolean) getStaticFieldValue(spring4TypeResolvableHelperClazz, "hasClazzResolvableType"));
        try {
            setStaticField(spring4TypeResolvableHelperClazz, "hasClazzResolvableType", true);
            FastJsonHttpMessageConverter fastJsonHttpMessageConverter = ((FastJsonHttpMessageConverter) createInstance("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter"));
            
            fastJsonHttpMessageConverter.read(null, null, null);
        } finally {
            setStaticField(spring4TypeResolvableHelperClazz, "hasClazzResolvableType", prevHasClazzResolvableType);
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testRead3() throws Throwable  {
        Class spring4TypeResolvableHelperClazz = Class.forName("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter$Spring4TypeResolvableHelper");
        boolean prevHasClazzResolvableType = ((boolean) getStaticFieldValue(spring4TypeResolvableHelperClazz, "hasClazzResolvableType"));
        try {
            setStaticField(spring4TypeResolvableHelperClazz, "hasClazzResolvableType", true);
            FastJsonHttpMessageConverter fastJsonHttpMessageConverter = ((FastJsonHttpMessageConverter) createInstance("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter"));
            ServletServerHttpRequest servletServerHttpRequest = ((ServletServerHttpRequest) createInstance("org.springframework.http.server.ServletServerHttpRequest"));
            HttpServletRequestWrapper httpServletRequestWrapper = ((HttpServletRequestWrapper) createInstance("javax.servlet.http.HttpServletRequestWrapper"));
            HttpServletRequestWrapper httpServletRequestWrapper1 = ((HttpServletRequestWrapper) createInstance("javax.servlet.http.HttpServletRequestWrapper"));
            HttpServletRequestWrapper httpServletRequestWrapper2 = ((HttpServletRequestWrapper) createInstance("javax.servlet.http.HttpServletRequestWrapper"));
            HttpServletRequestWrapper httpServletRequestWrapper3 = ((HttpServletRequestWrapper) createInstance("javax.servlet.http.HttpServletRequestWrapper"));
            ServletRequestWrapper servletRequestWrapper = ((ServletRequestWrapper) createInstance("javax.servlet.ServletRequestWrapper"));
            ServletRequestWrapper servletRequestWrapper1 = ((ServletRequestWrapper) createInstance("javax.servlet.ServletRequestWrapper"));
            ServletRequestWrapper servletRequestWrapper2 = ((ServletRequestWrapper) createInstance("javax.servlet.ServletRequestWrapper"));
            ServletRequestWrapper servletRequestWrapper3 = ((ServletRequestWrapper) createInstance("javax.servlet.ServletRequestWrapper"));
            ServletRequestWrapper servletRequestWrapper4 = ((ServletRequestWrapper) createInstance("javax.servlet.ServletRequestWrapper"));
            ServletRequestWrapper servletRequestWrapper5 = ((ServletRequestWrapper) createInstance("javax.servlet.ServletRequestWrapper"));
            ContextExposingHttpServletRequest contextExposingHttpServletRequest = ((ContextExposingHttpServletRequest) createInstance("org.springframework.web.context.support.ContextExposingHttpServletRequest"));
            HttpServletRequestWrapper httpServletRequestWrapper4 = ((HttpServletRequestWrapper) createInstance("javax.servlet.http.HttpServletRequestWrapper"));
            ContextExposingHttpServletRequest contextExposingHttpServletRequest1 = ((ContextExposingHttpServletRequest) createInstance("org.springframework.web.context.support.ContextExposingHttpServletRequest"));
            ContextExposingHttpServletRequest contextExposingHttpServletRequest2 = ((ContextExposingHttpServletRequest) createInstance("org.springframework.web.context.support.ContextExposingHttpServletRequest"));
            ContextExposingHttpServletRequest contextExposingHttpServletRequest3 = ((ContextExposingHttpServletRequest) createInstance("org.springframework.web.context.support.ContextExposingHttpServletRequest"));
            setField(contextExposingHttpServletRequest3, "request", servletRequestWrapper);
            setField(contextExposingHttpServletRequest2, "request", contextExposingHttpServletRequest3);
            setField(contextExposingHttpServletRequest1, "request", contextExposingHttpServletRequest2);
            setField(httpServletRequestWrapper4, "request", contextExposingHttpServletRequest1);
            setField(contextExposingHttpServletRequest, "request", httpServletRequestWrapper4);
            setField(servletRequestWrapper5, "request", contextExposingHttpServletRequest);
            setField(servletRequestWrapper4, "request", servletRequestWrapper5);
            setField(servletRequestWrapper3, "request", servletRequestWrapper4);
            setField(servletRequestWrapper2, "request", servletRequestWrapper3);
            setField(servletRequestWrapper1, "request", servletRequestWrapper2);
            setField(servletRequestWrapper, "request", servletRequestWrapper1);
            setField(httpServletRequestWrapper3, "request", servletRequestWrapper);
            setField(httpServletRequestWrapper2, "request", httpServletRequestWrapper3);
            setField(httpServletRequestWrapper1, "request", httpServletRequestWrapper2);
            setField(httpServletRequestWrapper, "request", httpServletRequestWrapper1);
            setField(servletServerHttpRequest, "servletRequest", httpServletRequestWrapper);
            
            fastJsonHttpMessageConverter.read(null, null, servletServerHttpRequest);
        } finally {
            setStaticField(spring4TypeResolvableHelperClazz, "hasClazzResolvableType", prevHasClazzResolvableType);
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCanRead1() throws Throwable  {
        FastJsonHttpMessageConverter fastJsonHttpMessageConverter = ((FastJsonHttpMessageConverter) createInstance("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter"));
        
        boolean actual = fastJsonHttpMessageConverter.canRead(null, null, null);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCanRead2() throws Throwable  {
        FastJsonHttpMessageConverter fastJsonHttpMessageConverter = ((FastJsonHttpMessageConverter) createInstance("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter"));
        setField(fastJsonHttpMessageConverter, "supportedMediaTypes", null);
        MediaType mediaType = ((MediaType) createInstance("org.springframework.http.MediaType"));
        
        Object initialFastJsonHttpMessageConverterSupportedMediaTypes = getFieldValue(fastJsonHttpMessageConverter, "supportedMediaTypes");
        
        fastJsonHttpMessageConverter.canRead(null, null, mediaType);
        
        Object finalFastJsonHttpMessageConverterSupportedMediaTypes = getFieldValue(fastJsonHttpMessageConverter, "supportedMediaTypes");
        
        assertNull(finalFastJsonHttpMessageConverterSupportedMediaTypes);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCanWrite1() throws Throwable  {
        FastJsonHttpMessageConverter fastJsonHttpMessageConverter = ((FastJsonHttpMessageConverter) createInstance("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter"));
        
        boolean actual = fastJsonHttpMessageConverter.canWrite(null, null, null);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCanWrite2() throws Throwable  {
        FastJsonHttpMessageConverter fastJsonHttpMessageConverter = ((FastJsonHttpMessageConverter) createInstance("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter"));
        MediaType mediaType = ((MediaType) createInstance("org.springframework.http.MediaType"));
        
        fastJsonHttpMessageConverter.canWrite(null, null, mediaType);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadInternal1() throws Throwable  {
        Class spring4TypeResolvableHelperClazz = Class.forName("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter$Spring4TypeResolvableHelper");
        boolean prevHasClazzResolvableType = ((boolean) getStaticFieldValue(spring4TypeResolvableHelperClazz, "hasClazzResolvableType"));
        try {
            setStaticField(spring4TypeResolvableHelperClazz, "hasClazzResolvableType", false);
            FastJsonHttpMessageConverter fastJsonHttpMessageConverter = ((FastJsonHttpMessageConverter) createInstance("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter"));
            
            Class fastJsonHttpMessageConverterClazz = Class.forName("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter");
            Class classType = Class.forName("java.lang.Class");
            Class httpInputMessageType = Class.forName("org.springframework.http.HttpInputMessage");
            Method readInternalMethod = fastJsonHttpMessageConverterClazz.getDeclaredMethod("readInternal", classType, httpInputMessageType);
            readInternalMethod.setAccessible(true);
            java.lang.Object[] readInternalMethodArguments = new java.lang.Object[2];
            readInternalMethodArguments[0] = null;
            readInternalMethodArguments[1] = null;
            try {
                readInternalMethod.invoke(fastJsonHttpMessageConverter, readInternalMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }} finally {
            setStaticField(spring4TypeResolvableHelperClazz, "hasClazzResolvableType", prevHasClazzResolvableType);
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadInternal2() throws Throwable  {
        Class spring4TypeResolvableHelperClazz = Class.forName("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter$Spring4TypeResolvableHelper");
        boolean prevHasClazzResolvableType = ((boolean) getStaticFieldValue(spring4TypeResolvableHelperClazz, "hasClazzResolvableType"));
        try {
            setStaticField(spring4TypeResolvableHelperClazz, "hasClazzResolvableType", true);
            FastJsonHttpMessageConverter fastJsonHttpMessageConverter = ((FastJsonHttpMessageConverter) createInstance("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter"));
            
            Class fastJsonHttpMessageConverterClazz = Class.forName("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter");
            Class classType = Class.forName("java.lang.Class");
            Class httpInputMessageType = Class.forName("org.springframework.http.HttpInputMessage");
            Method readInternalMethod = fastJsonHttpMessageConverterClazz.getDeclaredMethod("readInternal", classType, httpInputMessageType);
            readInternalMethod.setAccessible(true);
            java.lang.Object[] readInternalMethodArguments = new java.lang.Object[2];
            readInternalMethodArguments[0] = null;
            readInternalMethodArguments[1] = null;
            try {
                readInternalMethod.invoke(fastJsonHttpMessageConverter, readInternalMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }} finally {
            setStaticField(spring4TypeResolvableHelperClazz, "hasClazzResolvableType", prevHasClazzResolvableType);
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadInternal3() throws Throwable  {
        Class spring4TypeResolvableHelperClazz = Class.forName("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter$Spring4TypeResolvableHelper");
        boolean prevHasClazzResolvableType = ((boolean) getStaticFieldValue(spring4TypeResolvableHelperClazz, "hasClazzResolvableType"));
        try {
            setStaticField(spring4TypeResolvableHelperClazz, "hasClazzResolvableType", true);
            FastJsonHttpMessageConverter fastJsonHttpMessageConverter = ((FastJsonHttpMessageConverter) createInstance("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter"));
            ServletServerHttpRequest servletServerHttpRequest = ((ServletServerHttpRequest) createInstance("org.springframework.http.server.ServletServerHttpRequest"));
            HttpServletRequestWrapper httpServletRequestWrapper = ((HttpServletRequestWrapper) createInstance("javax.servlet.http.HttpServletRequestWrapper"));
            ServletRequestWrapper servletRequestWrapper = ((ServletRequestWrapper) createInstance("javax.servlet.ServletRequestWrapper"));
            ServletRequestWrapper servletRequestWrapper1 = ((ServletRequestWrapper) createInstance("javax.servlet.ServletRequestWrapper"));
            HttpServletRequestWrapper httpServletRequestWrapper1 = ((HttpServletRequestWrapper) createInstance("javax.servlet.http.HttpServletRequestWrapper"));
            HttpServletRequestWrapper httpServletRequestWrapper2 = ((HttpServletRequestWrapper) createInstance("javax.servlet.http.HttpServletRequestWrapper"));
            ContextExposingHttpServletRequest contextExposingHttpServletRequest = ((ContextExposingHttpServletRequest) createInstance("org.springframework.web.context.support.ContextExposingHttpServletRequest"));
            ContextExposingHttpServletRequest contextExposingHttpServletRequest1 = ((ContextExposingHttpServletRequest) createInstance("org.springframework.web.context.support.ContextExposingHttpServletRequest"));
            ServletRequestWrapper servletRequestWrapper2 = ((ServletRequestWrapper) createInstance("javax.servlet.ServletRequestWrapper"));
            ContextExposingHttpServletRequest contextExposingHttpServletRequest2 = ((ContextExposingHttpServletRequest) createInstance("org.springframework.web.context.support.ContextExposingHttpServletRequest"));
            setField(contextExposingHttpServletRequest2, "request", servletRequestWrapper2);
            setField(servletRequestWrapper2, "request", contextExposingHttpServletRequest2);
            setField(contextExposingHttpServletRequest1, "request", servletRequestWrapper2);
            setField(contextExposingHttpServletRequest, "request", contextExposingHttpServletRequest1);
            setField(httpServletRequestWrapper2, "request", contextExposingHttpServletRequest);
            setField(httpServletRequestWrapper1, "request", httpServletRequestWrapper2);
            setField(servletRequestWrapper1, "request", httpServletRequestWrapper1);
            setField(servletRequestWrapper, "request", servletRequestWrapper1);
            setField(httpServletRequestWrapper, "request", servletRequestWrapper);
            setField(servletServerHttpRequest, "servletRequest", httpServletRequestWrapper);
            
            Class fastJsonHttpMessageConverterClazz = Class.forName("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter");
            Class classType = Class.forName("java.lang.Class");
            Class servletServerHttpRequestType = Class.forName("org.springframework.http.HttpInputMessage");
            Method readInternalMethod = fastJsonHttpMessageConverterClazz.getDeclaredMethod("readInternal", classType, servletServerHttpRequestType);
            readInternalMethod.setAccessible(true);
            java.lang.Object[] readInternalMethodArguments = new java.lang.Object[2];
            readInternalMethodArguments[0] = null;
            readInternalMethodArguments[1] = servletServerHttpRequest;
            try {
                readInternalMethod.invoke(fastJsonHttpMessageConverter, readInternalMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }} finally {
            setStaticField(spring4TypeResolvableHelperClazz, "hasClazzResolvableType", prevHasClazzResolvableType);
        }
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
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testWriteInternal2() throws Throwable  {
        FastJsonHttpMessageConverter fastJsonHttpMessageConverter = ((FastJsonHttpMessageConverter) createInstance("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter"));
        
        Class fastJsonHttpMessageConverterClazz = Class.forName("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter");
        Class objectType = Class.forName("java.lang.Object");
        Class httpOutputMessageType = Class.forName("org.springframework.http.HttpOutputMessage");
        Method writeInternalMethod = fastJsonHttpMessageConverterClazz.getDeclaredMethod("writeInternal", objectType, httpOutputMessageType);
        writeInternalMethod.setAccessible(true);
        java.lang.Object[] writeInternalMethodArguments = new java.lang.Object[2];
        writeInternalMethodArguments[0] = null;
        writeInternalMethodArguments[1] = null;
        try {
            writeInternalMethod.invoke(fastJsonHttpMessageConverter, writeInternalMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testWriteInternal3() throws Throwable  {
        FastJsonHttpMessageConverter fastJsonHttpMessageConverter = ((FastJsonHttpMessageConverter) createInstance("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter"));
        setField(fastJsonHttpMessageConverter, "fastJsonConfig", null);
        ServletServerHttpResponse servletServerHttpResponse = ((ServletServerHttpResponse) createInstance("org.springframework.http.server.ServletServerHttpResponse"));
        setField(servletServerHttpResponse, "headersWritten", false);
        Object servletResponseHttpHeaders = createInstance("org.springframework.http.server.ServletServerHttpResponse$ServletResponseHttpHeaders");
        setField(servletServerHttpResponse, "headers", servletResponseHttpHeaders);
        
        Class fastJsonHttpMessageConverterClazz = Class.forName("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter");
        Class objectType = Class.forName("java.lang.Object");
        Class servletServerHttpResponseType = Class.forName("org.springframework.http.HttpOutputMessage");
        Method writeInternalMethod = fastJsonHttpMessageConverterClazz.getDeclaredMethod("writeInternal", objectType, servletServerHttpResponseType);
        writeInternalMethod.setAccessible(true);
        java.lang.Object[] writeInternalMethodArguments = new java.lang.Object[2];
        writeInternalMethodArguments[0] = null;
        writeInternalMethodArguments[1] = servletServerHttpResponse;
        try {
            writeInternalMethod.invoke(fastJsonHttpMessageConverter, writeInternalMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testWriteInternal4() throws Throwable  {
        FastJsonHttpMessageConverter fastJsonHttpMessageConverter = ((FastJsonHttpMessageConverter) createInstance("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter"));
        FastJsonConfig fastJsonConfig = ((FastJsonConfig) createInstance("com.alibaba.fastjson.support.config.FastJsonConfig"));
        setField(fastJsonConfig, "serializeFilters", null);
        setField(fastJsonHttpMessageConverter, "fastJsonConfig", fastJsonConfig);
        java.lang.Object[] forEachTaskArray = createArray("java.util.stream.ForEachOps$ForEachTask", 0);
        ServletServerHttpResponse servletServerHttpResponse = ((ServletServerHttpResponse) createInstance("org.springframework.http.server.ServletServerHttpResponse"));
        setField(servletServerHttpResponse, "headersWritten", false);
        Object servletResponseHttpHeaders = createInstance("org.springframework.http.server.ServletServerHttpResponse$ServletResponseHttpHeaders");
        setField(servletServerHttpResponse, "headers", servletResponseHttpHeaders);
        
        Class fastJsonHttpMessageConverterClazz = Class.forName("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter");
        Class forEachTaskArrayType = Class.forName("java.lang.Object");
        Class servletServerHttpResponseType = Class.forName("org.springframework.http.HttpOutputMessage");
        Method writeInternalMethod = fastJsonHttpMessageConverterClazz.getDeclaredMethod("writeInternal", forEachTaskArrayType, servletServerHttpResponseType);
        writeInternalMethod.setAccessible(true);
        java.lang.Object[] writeInternalMethodArguments = new java.lang.Object[2];
        writeInternalMethodArguments[0] = ((Object) forEachTaskArray);
        writeInternalMethodArguments[1] = servletServerHttpResponse;
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
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testSetFeatures2() throws Throwable  {
        FastJsonHttpMessageConverter fastJsonHttpMessageConverter = ((FastJsonHttpMessageConverter) createInstance("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter"));
        setField(fastJsonHttpMessageConverter, "fastJsonConfig", null);
        com.alibaba.fastjson.serializer.SerializerFeature[] serializerFeatureArray = new com.alibaba.fastjson.serializer.SerializerFeature[9];
        
        SerializerFeature initialSerializerFeatureArray0 = serializerFeatureArray[0];
        SerializerFeature initialSerializerFeatureArray1 = serializerFeatureArray[1];
        SerializerFeature initialSerializerFeatureArray2 = serializerFeatureArray[2];
        SerializerFeature initialSerializerFeatureArray3 = serializerFeatureArray[3];
        SerializerFeature initialSerializerFeatureArray4 = serializerFeatureArray[4];
        SerializerFeature initialSerializerFeatureArray5 = serializerFeatureArray[5];
        SerializerFeature initialSerializerFeatureArray6 = serializerFeatureArray[6];
        SerializerFeature initialSerializerFeatureArray7 = serializerFeatureArray[7];
        SerializerFeature initialSerializerFeatureArray8 = serializerFeatureArray[8];
        
        fastJsonHttpMessageConverter.setFeatures(serializerFeatureArray);
        
        SerializerFeature finalSerializerFeatureArray0 = serializerFeatureArray[0];
        SerializerFeature finalSerializerFeatureArray1 = serializerFeatureArray[1];
        SerializerFeature finalSerializerFeatureArray2 = serializerFeatureArray[2];
        SerializerFeature finalSerializerFeatureArray3 = serializerFeatureArray[3];
        SerializerFeature finalSerializerFeatureArray4 = serializerFeatureArray[4];
        SerializerFeature finalSerializerFeatureArray5 = serializerFeatureArray[5];
        SerializerFeature finalSerializerFeatureArray6 = serializerFeatureArray[6];
        SerializerFeature finalSerializerFeatureArray7 = serializerFeatureArray[7];
        SerializerFeature finalSerializerFeatureArray8 = serializerFeatureArray[8];
        
        assertNull(finalSerializerFeatureArray0);
        
        assertNull(finalSerializerFeatureArray1);
        
        assertNull(finalSerializerFeatureArray2);
        
        assertNull(finalSerializerFeatureArray3);
        
        assertNull(finalSerializerFeatureArray4);
        
        assertNull(finalSerializerFeatureArray5);
        
        assertNull(finalSerializerFeatureArray6);
        
        assertNull(finalSerializerFeatureArray7);
        
        assertNull(finalSerializerFeatureArray8);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetFeatures3() throws Throwable  {
        FastJsonHttpMessageConverter fastJsonHttpMessageConverter = ((FastJsonHttpMessageConverter) createInstance("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter"));
        FastJsonConfig fastJsonConfig = ((FastJsonConfig) createInstance("com.alibaba.fastjson.support.config.FastJsonConfig"));
        setField(fastJsonConfig, "serializerFeatures", null);
        setField(fastJsonHttpMessageConverter, "fastJsonConfig", fastJsonConfig);
        com.alibaba.fastjson.serializer.SerializerFeature[] serializerFeatureArray = new com.alibaba.fastjson.serializer.SerializerFeature[9];
        
        SerializerFeature initialSerializerFeatureArray0 = serializerFeatureArray[0];
        SerializerFeature initialSerializerFeatureArray1 = serializerFeatureArray[1];
        SerializerFeature initialSerializerFeatureArray2 = serializerFeatureArray[2];
        SerializerFeature initialSerializerFeatureArray3 = serializerFeatureArray[3];
        SerializerFeature initialSerializerFeatureArray4 = serializerFeatureArray[4];
        SerializerFeature initialSerializerFeatureArray5 = serializerFeatureArray[5];
        SerializerFeature initialSerializerFeatureArray6 = serializerFeatureArray[6];
        SerializerFeature initialSerializerFeatureArray7 = serializerFeatureArray[7];
        SerializerFeature initialSerializerFeatureArray8 = serializerFeatureArray[8];
        
        fastJsonHttpMessageConverter.setFeatures(serializerFeatureArray);
        
        Object fastJsonHttpMessageConverterFastJsonConfig = getFieldValue(fastJsonHttpMessageConverter, "fastJsonConfig");
        Object finalFastJsonHttpMessageConverterFastJsonConfigSerializerFeatures = getFieldValue(fastJsonHttpMessageConverterFastJsonConfig, "serializerFeatures");
        
        SerializerFeature finalSerializerFeatureArray0 = serializerFeatureArray[0];
        SerializerFeature finalSerializerFeatureArray1 = serializerFeatureArray[1];
        SerializerFeature finalSerializerFeatureArray2 = serializerFeatureArray[2];
        SerializerFeature finalSerializerFeatureArray3 = serializerFeatureArray[3];
        SerializerFeature finalSerializerFeatureArray4 = serializerFeatureArray[4];
        SerializerFeature finalSerializerFeatureArray5 = serializerFeatureArray[5];
        SerializerFeature finalSerializerFeatureArray6 = serializerFeatureArray[6];
        SerializerFeature finalSerializerFeatureArray7 = serializerFeatureArray[7];
        SerializerFeature finalSerializerFeatureArray8 = serializerFeatureArray[8];
        
        assertNull(finalSerializerFeatureArray0);
        
        assertNull(finalSerializerFeatureArray1);
        
        assertNull(finalSerializerFeatureArray2);
        
        assertNull(finalSerializerFeatureArray3);
        
        assertNull(finalSerializerFeatureArray4);
        
        assertNull(finalSerializerFeatureArray5);
        
        assertNull(finalSerializerFeatureArray6);
        
        assertNull(finalSerializerFeatureArray7);
        
        assertNull(finalSerializerFeatureArray8);
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
        FastJsonConfig fastJsonConfig = ((FastJsonConfig) createInstance("com.alibaba.fastjson.support.config.FastJsonConfig"));
        setField(fastJsonConfig, "charset", null);
        setField(fastJsonHttpMessageConverter, "fastJsonConfig", fastJsonConfig);
        
        Charset actual = fastJsonHttpMessageConverter.getCharset();
        
        assertNull(actual);
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
        ServletServerHttpRequest servletServerHttpRequest = ((ServletServerHttpRequest) createInstance("org.springframework.http.server.ServletServerHttpRequest"));
        HttpServletRequestWrapper httpServletRequestWrapper = ((HttpServletRequestWrapper) createInstance("javax.servlet.http.HttpServletRequestWrapper"));
        ContextExposingHttpServletRequest contextExposingHttpServletRequest = ((ContextExposingHttpServletRequest) createInstance("org.springframework.web.context.support.ContextExposingHttpServletRequest"));
        setField(contextExposingHttpServletRequest, "request", contextExposingHttpServletRequest);
        setField(httpServletRequestWrapper, "request", contextExposingHttpServletRequest);
        setField(servletServerHttpRequest, "servletRequest", httpServletRequestWrapper);
        
        Class fastJsonHttpMessageConverterClazz = Class.forName("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter");
        Class typeType = Class.forName("java.lang.reflect.Type");
        Class servletServerHttpRequestType = Class.forName("org.springframework.http.HttpInputMessage");
        Method readTypeMethod = fastJsonHttpMessageConverterClazz.getDeclaredMethod("readType", typeType, servletServerHttpRequestType);
        readTypeMethod.setAccessible(true);
        java.lang.Object[] readTypeMethodArguments = new java.lang.Object[2];
        readTypeMethodArguments[0] = null;
        readTypeMethodArguments[1] = servletServerHttpRequest;
        try {
            readTypeMethod.invoke(fastJsonHttpMessageConverter, readTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
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
        FastJsonConfig fastJsonConfig = ((FastJsonConfig) createInstance("com.alibaba.fastjson.support.config.FastJsonConfig"));
        setField(fastJsonConfig, "serializerFeatures", null);
        setField(fastJsonHttpMessageConverter, "fastJsonConfig", fastJsonConfig);
        
        com.alibaba.fastjson.serializer.SerializerFeature[] actual = fastJsonHttpMessageConverter.getFeatures();
        
        assertNull(actual);
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
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testSetCharset2() throws Throwable  {
        FastJsonHttpMessageConverter fastJsonHttpMessageConverter = ((FastJsonHttpMessageConverter) createInstance("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter"));
        setField(fastJsonHttpMessageConverter, "fastJsonConfig", null);
        US_ASCII uS_ASCII = ((US_ASCII) createInstance("sun.nio.cs.US_ASCII"));
        
        fastJsonHttpMessageConverter.setCharset(uS_ASCII);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetCharset3() throws Throwable  {
        FastJsonHttpMessageConverter fastJsonHttpMessageConverter = ((FastJsonHttpMessageConverter) createInstance("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter"));
        FastJsonConfig fastJsonConfig = ((FastJsonConfig) createInstance("com.alibaba.fastjson.support.config.FastJsonConfig"));
        setField(fastJsonConfig, "charset", null);
        setField(fastJsonHttpMessageConverter, "fastJsonConfig", fastJsonConfig);
        
        fastJsonHttpMessageConverter.setCharset(null);
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
        FastJsonConfig fastJsonConfig = ((FastJsonConfig) createInstance("com.alibaba.fastjson.support.config.FastJsonConfig"));
        
        Object initialFastJsonHttpMessageConverterFastJsonConfig = getFieldValue(fastJsonHttpMessageConverter, "fastJsonConfig");
        
        fastJsonHttpMessageConverter.setFastJsonConfig(fastJsonConfig);
        
        Object finalFastJsonHttpMessageConverterFastJsonConfig = getFieldValue(fastJsonHttpMessageConverter, "fastJsonConfig");
        
        assertFalse(initialFastJsonHttpMessageConverterFastJsonConfig == finalFastJsonHttpMessageConverterFastJsonConfig);
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
        Object defaultLabelFilter = createInstance("com.alibaba.fastjson.serializer.Labels$DefaultLabelFilter");
        
        Class fastJsonHttpMessageConverterClazz = Class.forName("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter");
        Class defaultLabelFilterType = Class.forName("com.alibaba.fastjson.serializer.SerializeFilter");
        Method addSerializeFilterMethod = fastJsonHttpMessageConverterClazz.getDeclaredMethod("addSerializeFilter", defaultLabelFilterType);
        addSerializeFilterMethod.setAccessible(true);
        java.lang.Object[] addSerializeFilterMethodArguments = new java.lang.Object[1];
        addSerializeFilterMethodArguments[0] = defaultLabelFilter;
        try {
            addSerializeFilterMethod.invoke(fastJsonHttpMessageConverter, addSerializeFilterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testAddSerializeFilter4() throws Throwable  {
        FastJsonHttpMessageConverter fastJsonHttpMessageConverter = ((FastJsonHttpMessageConverter) createInstance("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter"));
        FastJsonConfig fastJsonConfig = ((FastJsonConfig) createInstance("com.alibaba.fastjson.support.config.FastJsonConfig"));
        setField(fastJsonConfig, "serializeFilters", null);
        setField(fastJsonHttpMessageConverter, "fastJsonConfig", fastJsonConfig);
        PascalNameFilter pascalNameFilter = ((PascalNameFilter) createInstance("com.alibaba.fastjson.serializer.PascalNameFilter"));
        
        fastJsonHttpMessageConverter.addSerializeFilter(pascalNameFilter);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testAddSerializeFilter5() throws Throwable  {
        FastJsonHttpMessageConverter fastJsonHttpMessageConverter = ((FastJsonHttpMessageConverter) createInstance("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter"));
        FastJsonConfig fastJsonConfig = ((FastJsonConfig) createInstance("com.alibaba.fastjson.support.config.FastJsonConfig"));
        com.alibaba.fastjson.serializer.SerializeFilter[] serializeFilterArray = new com.alibaba.fastjson.serializer.SerializeFilter[8];
        setField(fastJsonConfig, "serializeFilters", serializeFilterArray);
        setField(fastJsonHttpMessageConverter, "fastJsonConfig", fastJsonConfig);
        SimplePropertyPreFilter simplePropertyPreFilter = ((SimplePropertyPreFilter) createInstance("com.alibaba.fastjson.serializer.SimplePropertyPreFilter"));
        
        fastJsonHttpMessageConverter.addSerializeFilter(simplePropertyPreFilter);
        
        Object fastJsonHttpMessageConverterFastJsonConfig = getFieldValue(fastJsonHttpMessageConverter, "fastJsonConfig");
        Object finalFastJsonHttpMessageConverterFastJsonConfigSerializeFilters = getFieldValue(fastJsonHttpMessageConverterFastJsonConfig, "serializeFilters");
        
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testAddSerializeFilter6() throws Throwable  {
        FastJsonHttpMessageConverter fastJsonHttpMessageConverter = ((FastJsonHttpMessageConverter) createInstance("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter"));
        FastJsonConfig fastJsonConfig = ((FastJsonConfig) createInstance("com.alibaba.fastjson.support.config.FastJsonConfig"));
        java.lang.Object[] objectArray = new java.lang.Object[8];
        setField(fastJsonConfig, "serializeFilters", objectArray);
        setField(fastJsonHttpMessageConverter, "fastJsonConfig", fastJsonConfig);
        PascalNameFilter pascalNameFilter = ((PascalNameFilter) createInstance("com.alibaba.fastjson.serializer.PascalNameFilter"));
        
        fastJsonHttpMessageConverter.addSerializeFilter(pascalNameFilter);
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
        FastJsonConfig fastJsonConfig = ((FastJsonConfig) createInstance("com.alibaba.fastjson.support.config.FastJsonConfig"));
        setField(fastJsonConfig, "serializeFilters", null);
        setField(fastJsonHttpMessageConverter, "fastJsonConfig", fastJsonConfig);
        
        com.alibaba.fastjson.serializer.SerializeFilter[] actual = fastJsonHttpMessageConverter.getFilters();
        
        assertNull(actual);
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
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testSetFilters2() throws Throwable  {
        FastJsonHttpMessageConverter fastJsonHttpMessageConverter = ((FastJsonHttpMessageConverter) createInstance("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter"));
        setField(fastJsonHttpMessageConverter, "fastJsonConfig", null);
        com.alibaba.fastjson.serializer.SerializeFilter[] serializeFilterArray = new com.alibaba.fastjson.serializer.SerializeFilter[9];
        
        SerializeFilter initialSerializeFilterArray0 = serializeFilterArray[0];
        SerializeFilter initialSerializeFilterArray1 = serializeFilterArray[1];
        SerializeFilter initialSerializeFilterArray2 = serializeFilterArray[2];
        SerializeFilter initialSerializeFilterArray3 = serializeFilterArray[3];
        SerializeFilter initialSerializeFilterArray4 = serializeFilterArray[4];
        SerializeFilter initialSerializeFilterArray5 = serializeFilterArray[5];
        SerializeFilter initialSerializeFilterArray6 = serializeFilterArray[6];
        SerializeFilter initialSerializeFilterArray7 = serializeFilterArray[7];
        SerializeFilter initialSerializeFilterArray8 = serializeFilterArray[8];
        
        fastJsonHttpMessageConverter.setFilters(serializeFilterArray);
        
        SerializeFilter finalSerializeFilterArray0 = serializeFilterArray[0];
        SerializeFilter finalSerializeFilterArray1 = serializeFilterArray[1];
        SerializeFilter finalSerializeFilterArray2 = serializeFilterArray[2];
        SerializeFilter finalSerializeFilterArray3 = serializeFilterArray[3];
        SerializeFilter finalSerializeFilterArray4 = serializeFilterArray[4];
        SerializeFilter finalSerializeFilterArray5 = serializeFilterArray[5];
        SerializeFilter finalSerializeFilterArray6 = serializeFilterArray[6];
        SerializeFilter finalSerializeFilterArray7 = serializeFilterArray[7];
        SerializeFilter finalSerializeFilterArray8 = serializeFilterArray[8];
        
        assertNull(finalSerializeFilterArray0);
        
        assertNull(finalSerializeFilterArray1);
        
        assertNull(finalSerializeFilterArray2);
        
        assertNull(finalSerializeFilterArray3);
        
        assertNull(finalSerializeFilterArray4);
        
        assertNull(finalSerializeFilterArray5);
        
        assertNull(finalSerializeFilterArray6);
        
        assertNull(finalSerializeFilterArray7);
        
        assertNull(finalSerializeFilterArray8);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetFilters3() throws Throwable  {
        FastJsonHttpMessageConverter fastJsonHttpMessageConverter = ((FastJsonHttpMessageConverter) createInstance("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter"));
        FastJsonConfig fastJsonConfig = ((FastJsonConfig) createInstance("com.alibaba.fastjson.support.config.FastJsonConfig"));
        setField(fastJsonConfig, "serializeFilters", null);
        setField(fastJsonHttpMessageConverter, "fastJsonConfig", fastJsonConfig);
        com.alibaba.fastjson.serializer.SerializeFilter[] serializeFilterArray = new com.alibaba.fastjson.serializer.SerializeFilter[9];
        
        SerializeFilter initialSerializeFilterArray0 = serializeFilterArray[0];
        SerializeFilter initialSerializeFilterArray1 = serializeFilterArray[1];
        SerializeFilter initialSerializeFilterArray2 = serializeFilterArray[2];
        SerializeFilter initialSerializeFilterArray3 = serializeFilterArray[3];
        SerializeFilter initialSerializeFilterArray4 = serializeFilterArray[4];
        SerializeFilter initialSerializeFilterArray5 = serializeFilterArray[5];
        SerializeFilter initialSerializeFilterArray6 = serializeFilterArray[6];
        SerializeFilter initialSerializeFilterArray7 = serializeFilterArray[7];
        SerializeFilter initialSerializeFilterArray8 = serializeFilterArray[8];
        
        fastJsonHttpMessageConverter.setFilters(serializeFilterArray);
        
        Object fastJsonHttpMessageConverterFastJsonConfig = getFieldValue(fastJsonHttpMessageConverter, "fastJsonConfig");
        Object finalFastJsonHttpMessageConverterFastJsonConfigSerializeFilters = getFieldValue(fastJsonHttpMessageConverterFastJsonConfig, "serializeFilters");
        
        SerializeFilter finalSerializeFilterArray0 = serializeFilterArray[0];
        SerializeFilter finalSerializeFilterArray1 = serializeFilterArray[1];
        SerializeFilter finalSerializeFilterArray2 = serializeFilterArray[2];
        SerializeFilter finalSerializeFilterArray3 = serializeFilterArray[3];
        SerializeFilter finalSerializeFilterArray4 = serializeFilterArray[4];
        SerializeFilter finalSerializeFilterArray5 = serializeFilterArray[5];
        SerializeFilter finalSerializeFilterArray6 = serializeFilterArray[6];
        SerializeFilter finalSerializeFilterArray7 = serializeFilterArray[7];
        SerializeFilter finalSerializeFilterArray8 = serializeFilterArray[8];
        
        assertNull(finalSerializeFilterArray0);
        
        assertNull(finalSerializeFilterArray1);
        
        assertNull(finalSerializeFilterArray2);
        
        assertNull(finalSerializeFilterArray3);
        
        assertNull(finalSerializeFilterArray4);
        
        assertNull(finalSerializeFilterArray5);
        
        assertNull(finalSerializeFilterArray6);
        
        assertNull(finalSerializeFilterArray7);
        
        assertNull(finalSerializeFilterArray8);
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
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testSetDateFormat2() throws Throwable  {
        FastJsonHttpMessageConverter fastJsonHttpMessageConverter = ((FastJsonHttpMessageConverter) createInstance("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter"));
        setField(fastJsonHttpMessageConverter, "fastJsonConfig", null);
        String string = new String("");
        
        fastJsonHttpMessageConverter.setDateFormat(string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetDateFormat3() throws Throwable  {
        FastJsonHttpMessageConverter fastJsonHttpMessageConverter = ((FastJsonHttpMessageConverter) createInstance("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter"));
        FastJsonConfig fastJsonConfig = ((FastJsonConfig) createInstance("com.alibaba.fastjson.support.config.FastJsonConfig"));
        setField(fastJsonConfig, "dateFormat", null);
        setField(fastJsonHttpMessageConverter, "fastJsonConfig", fastJsonConfig);
        
        fastJsonHttpMessageConverter.setDateFormat(null);
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
        FastJsonConfig fastJsonConfig = ((FastJsonConfig) createInstance("com.alibaba.fastjson.support.config.FastJsonConfig"));
        setField(fastJsonConfig, "dateFormat", null);
        setField(fastJsonHttpMessageConverter, "fastJsonConfig", fastJsonConfig);
        
        String actual = fastJsonHttpMessageConverter.getDateFormat();
        
        assertNull(actual);
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
    
    @Test(timeout = 10000)
    public void testFastJsonHttpMessageConverter1() {
        FastJsonHttpMessageConverter actual = new FastJsonHttpMessageConverter();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testFastJsonHttpMessageConverter2() {
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
    public void testGetType3() throws Throwable  {
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
    private static sun.misc.Unsafe getUnsafeInstance() throws Exception {
        java.lang.reflect.Field f = sun.misc.Unsafe.class.getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return (sun.misc.Unsafe) f.get(null);
    }
}
