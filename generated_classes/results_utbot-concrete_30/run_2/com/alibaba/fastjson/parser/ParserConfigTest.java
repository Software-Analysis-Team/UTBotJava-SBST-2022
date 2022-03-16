package com.alibaba.fastjson.parser;

import org.junit.Test;
import java.lang.reflect.Type;
import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;
import com.alibaba.fastjson.parser.deserializer.JavaObjectDeserializer;
import java.util.Properties;
import java.lang.reflect.Method;
import com.alibaba.fastjson.util.IdentityHashMap;
import com.alibaba.fastjson.parser.deserializer.MapDeserializer;
import com.alibaba.fastjson.serializer.MiscCodec;
import com.alibaba.fastjson.serializer.BooleanCodec;
import com.alibaba.fastjson.parser.deserializer.NumberDeserializer;
import com.alibaba.fastjson.serializer.StringCodec;
import com.alibaba.fastjson.serializer.AtomicCodec;
import com.alibaba.fastjson.serializer.LongCodec;
import com.alibaba.fastjson.serializer.DateCodec;
import com.alibaba.fastjson.serializer.FloatCodec;
import com.alibaba.fastjson.serializer.CharArrayCodec;
import com.alibaba.fastjson.serializer.ReferenceCodec;
import com.alibaba.fastjson.serializer.CalendarCodec;
import com.alibaba.fastjson.parser.deserializer.TimeDeserializer;
import com.alibaba.fastjson.parser.deserializer.JSONPDeserializer;
import com.alibaba.fastjson.serializer.IntegerCodec;
import com.alibaba.fastjson.parser.deserializer.StackTraceElementDeserializer;
import com.alibaba.fastjson.serializer.CollectionCodec;
import com.alibaba.fastjson.serializer.BigDecimalCodec;
import com.alibaba.fastjson.serializer.BigIntegerCodec;
import com.alibaba.fastjson.parser.deserializer.SqlDateDeserializer;
import com.alibaba.fastjson.serializer.CharacterCodec;
import com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory;
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
import java.util.LinkedHashMap;
import java.lang.reflect.Constructor;
import java.util.Objects;
import java.util.Map;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.lang.reflect.Modifier;
import sun.misc.Unsafe;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertFalse;

public class ParserConfigTest {
    ///region
    
    @Test(timeout = 10000)
    public void testGetDeserializer1() throws Throwable  {
        ParserConfig parserConfig = new ParserConfig();
        
        ObjectDeserializer actual = parserConfig.getDeserializer(((Type) null));
        
        JavaObjectDeserializer expected = ((JavaObjectDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.JavaObjectDeserializer"));
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testInitJavaBeanDeserializers1() throws Throwable  {
        ParserConfig parserConfig = new ParserConfig();
        java.lang.Class[] classArray = new java.lang.Class[0];
        
        parserConfig.initJavaBeanDeserializers(classArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testConfigFromPropety1() throws Throwable  {
        ParserConfig parserConfig = new ParserConfig();
        Properties properties = new Properties();
        
        parserConfig.configFromPropety(properties);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testPutDeserializer1() throws Throwable  {
        ParserConfig parserConfig = new ParserConfig();
        
        parserConfig.putDeserializer(null, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetDefaultClassLoader1() throws Throwable  {
        ParserConfig parserConfig = new ParserConfig();
        
        ClassLoader actual = parserConfig.getDefaultClassLoader();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetDefaultClassLoader1() throws Throwable  {
        ParserConfig parserConfig = new ParserConfig();
        
        parserConfig.setDefaultClassLoader(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testAddDeny1() throws Throwable  {
        ParserConfig parserConfig = new ParserConfig();
        String string = new String();
        
        parserConfig.addDeny(string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testAddAccept1() throws Throwable  {
        ParserConfig parserConfig = new ParserConfig();
        String string = new String();
        
        parserConfig.addAccept(string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCheckAutoType1() throws Throwable  {
        ParserConfig parserConfig = ((ParserConfig) createInstance("com.alibaba.fastjson.parser.ParserConfig"));
        
        Class actual = parserConfig.checkAutoType(null, null, 0);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSplitItemsFormProperty1() throws Throwable  {
        String string = new String();
        
        Class parserConfigClazz = Class.forName("com.alibaba.fastjson.parser.ParserConfig");
        Class stringType = Class.forName("java.lang.String");
        Method splitItemsFormPropertyMethod = parserConfigClazz.getDeclaredMethod("splitItemsFormProperty", stringType);
        splitItemsFormPropertyMethod.setAccessible(true);
        java.lang.Object[] splitItemsFormPropertyMethodArguments = new java.lang.Object[1];
        splitItemsFormPropertyMethodArguments[0] = string;
        java.lang.String[] actual = ((java.lang.String[]) splitItemsFormPropertyMethod.invoke(null, splitItemsFormPropertyMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    
    ///region Errors report for getGlobalInstance
    
    public void testGetGlobalInstance_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // ClassId java.util.jar.JarVerifier$3 does not have canonical name
        // 
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testIsPrimitive21() throws Throwable  {
        ParserConfig.isPrimitive2(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIsPrimitive22() throws Throwable  {
        Class class1 = Object.class;
        
        boolean actual = ParserConfig.isPrimitive2(class1);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParserAllFieldToCache1() throws Throwable  {
        ParserConfig.parserAllFieldToCache(null, null);
    }
    ///endregion
    
    
    ///region Errors report for parserAllFieldToCache
    
    public void testParserAllFieldToCache_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Field security is not found in class java.lang.System
        // 
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetFieldFromCache1() throws Throwable  {
        String string = new String();
        
        ParserConfig.getFieldFromCache(string, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetFieldFromCache2() throws Throwable  {
        ParserConfig.getFieldFromCache(null, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetFieldFromCache3() throws Throwable  {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        
        ParserConfig.getFieldFromCache(null, linkedHashMap);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testParserConfig1() throws Throwable  {
        ASMDeserializerFactory aSMDeserializerFactory = ((ASMDeserializerFactory) createInstance("com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory"));
        Class parserConfigClazz = Class.forName("com.alibaba.fastjson.parser.ParserConfig");
        Class aSMDeserializerFactoryType = Class.forName("com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory");
        Class classLoaderType = Class.forName("java.lang.ClassLoader");
        Class booleanType = boolean.class;
        Constructor parserConfigConstructor = parserConfigClazz.getDeclaredConstructor(aSMDeserializerFactoryType, classLoaderType, booleanType);
        parserConfigConstructor.setAccessible(true);
        java.lang.Object[] parserConfigConstructorArguments = new java.lang.Object[3];
        parserConfigConstructorArguments[0] = aSMDeserializerFactory;
        parserConfigConstructorArguments[1] = null;
        parserConfigConstructorArguments[2] = false;
        ParserConfig actual = ((ParserConfig) parserConfigConstructor.newInstance(parserConfigConstructorArguments));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testParserConfig2() {
        ParserConfig actual = new ParserConfig(((ClassLoader) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testParserConfig3() {
        ParserConfig actual = new ParserConfig(false);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testParserConfig4() {
        ParserConfig actual = new ParserConfig(false);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testParserConfig5() {
        ParserConfig actual = new ParserConfig();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testParserConfig6() throws Throwable  {
        ASMDeserializerFactory aSMDeserializerFactory = ((ASMDeserializerFactory) createInstance("com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory"));
        ParserConfig actual = new ParserConfig(aSMDeserializerFactory);
    }
    ///endregion
    
    private static Object createInstance(String className) throws Exception {
        Class<?> clazz = Class.forName(className);
        return getUnsafeInstance().allocateInstance(clazz);
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
    private static sun.misc.Unsafe getUnsafeInstance() throws Exception {
        java.lang.reflect.Field f = sun.misc.Unsafe.class.getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return (sun.misc.Unsafe) f.get(null);
    }
}
