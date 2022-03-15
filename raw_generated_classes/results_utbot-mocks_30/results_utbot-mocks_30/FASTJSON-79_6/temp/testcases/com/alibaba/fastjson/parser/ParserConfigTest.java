package com.alibaba.fastjson.parser;

import org.junit.Test;
import com.alibaba.fastjson.util.IdentityHashMap;
import com.alibaba.fastjson.parser.deserializer.MapDeserializer;
import com.alibaba.fastjson.serializer.MiscCodec;
import com.alibaba.fastjson.serializer.BooleanCodec;
import com.alibaba.fastjson.parser.deserializer.NumberDeserializer;
import com.alibaba.fastjson.serializer.StringCodec;
import com.alibaba.fastjson.serializer.AtomicCodec;
import com.alibaba.fastjson.serializer.LongCodec;
import com.alibaba.fastjson.parser.deserializer.JavaObjectDeserializer;
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
import java.lang.reflect.Type;
import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;
import com.alibaba.fastjson.util.FieldInfo;
import java.lang.annotation.Annotation;
import com.alibaba.fastjson.util.JavaBeanInfo;
import com.alibaba.fastjson.parser.deserializer.FieldDeserializer;
import com.alibaba.fastjson.parser.deserializer.DefaultFieldDeserializer;
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
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
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
import static org.mockito.Mockito.mock;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mockStatic;
import static org.junit.Assert.assertNull;
import static org.mockito.ArgumentMatchers.anyString;
import static org.junit.Assert.assertFalse;

public class ParserConfigTest {
    ///region
    
    @Test(timeout = 10000)
    public void testIsAsmEnable1() throws Throwable  {
        ParserConfig parserConfig = new ParserConfig();
        
        boolean actual = parserConfig.isAsmEnable();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetAsmEnable1() throws Throwable  {
        ParserConfig parserConfig = new ParserConfig();
        
        parserConfig.setAsmEnable(false);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetAsmEnable2() throws Throwable  {
        ParserConfig parserConfig = ((ParserConfig) createInstance("com.alibaba.fastjson.parser.ParserConfig"));
        setField(parserConfig, "asmEnable", false);
        
        parserConfig.setAsmEnable(false);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetDerializers1() throws Throwable  {
        ParserConfig parserConfig = new ParserConfig();
        
        IdentityHashMap actual = parserConfig.getDerializers();
        
        IdentityHashMap expected = ((IdentityHashMap) createInstance("com.alibaba.fastjson.util.IdentityHashMap"));
        java.lang.Object[] entryArray = createArray("com.alibaba.fastjson.util.IdentityHashMap$Entry", 8192);
        Object entry = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry, "hashCode", 1311146128);
        Class class1 = java.util.LinkedHashMap.class;
        setField(entry, "key", class1);
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.MapDeserializer"));
        MapDeserializer.instance = mapDeserializer;
        setField(entry, "value", mapDeserializer);
        setField(entry, "next", null);
        entryArray[144] = entry;
        Object entry1 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry1, "hashCode", 400064818);
        Class class2 = java.util.UUID.class;
        setField(entry1, "key", class2);
        MiscCodec miscCodec = ((MiscCodec) createInstance("com.alibaba.fastjson.serializer.MiscCodec"));
        setField(miscCodec, "FILE_RELATIVE_PATH_SUPPORT", false);
        setField(miscCodec, "method_paths_get", null);
        setField(miscCodec, "method_paths_get_error", false);
        setField(entry1, "value", miscCodec);
        setField(entry1, "next", null);
        entryArray[306] = entry1;
        Object entry2 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry2, "hashCode", 1866768727);
        Class class3 = java.util.concurrent.atomic.AtomicBoolean.class;
        setField(entry2, "key", class3);
        BooleanCodec booleanCodec = ((BooleanCodec) createInstance("com.alibaba.fastjson.serializer.BooleanCodec"));
        setField(entry2, "value", booleanCodec);
        setField(entry2, "next", null);
        entryArray[343] = entry2;
        Object entry3 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry3, "hashCode", 399573350);
        Class class4 = short.class;
        setField(entry3, "key", class4);
        NumberDeserializer numberDeserializer = ((NumberDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.NumberDeserializer"));
        setField(entry3, "value", numberDeserializer);
        setField(entry3, "next", null);
        entryArray[358] = entry3;
        Object entry4 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry4, "hashCode", 1554547125);
        Class class5 = String.class;
        setField(entry4, "key", class5);
        StringCodec stringCodec = ((StringCodec) createInstance("com.alibaba.fastjson.serializer.StringCodec"));
        StringCodec.instance = stringCodec;
        setField(entry4, "value", stringCodec);
        setField(entry4, "next", null);
        entryArray[437] = entry4;
        Object entry5 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry5, "hashCode", 2060468723);
        Class class6 = File.class;
        setField(entry5, "key", class6);
        setField(entry5, "value", miscCodec);
        setField(entry5, "next", null);
        entryArray[499] = entry5;
        Object entry6 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry6, "hashCode", 919446210);
        Class class7 = URI.class;
        setField(entry6, "key", class7);
        setField(entry6, "value", miscCodec);
        setField(entry6, "next", null);
        entryArray[706] = entry6;
        Object entry7 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry7, "hashCode", 1209770703);
        Class class8 = java.util.concurrent.atomic.AtomicIntegerArray.class;
        setField(entry7, "key", class8);
        AtomicCodec atomicCodec = ((AtomicCodec) createInstance("com.alibaba.fastjson.serializer.AtomicCodec"));
        setField(entry7, "value", atomicCodec);
        setField(entry7, "next", null);
        entryArray[719] = entry7;
        Object entry8 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry8, "hashCode", 664740647);
        Class class9 = double.class;
        setField(entry8, "key", class9);
        setField(entry8, "value", numberDeserializer);
        setField(entry8, "next", null);
        entryArray[807] = entry8;
        Object entry9 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry9, "hashCode", 305808283);
        Class class10 = Long.class;
        setField(entry9, "key", class10);
        LongCodec longCodec = ((LongCodec) createInstance("com.alibaba.fastjson.serializer.LongCodec"));
        LongCodec.instance = longCodec;
        setField(entry9, "value", longCodec);
        setField(entry9, "next", null);
        entryArray[923] = entry9;
        Object entry10 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry10, "hashCode", 519979933);
        Class class11 = Cloneable.class;
        setField(entry10, "key", class11);
        JavaObjectDeserializer javaObjectDeserializer = ((JavaObjectDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.JavaObjectDeserializer"));
        setField(entry10, "value", javaObjectDeserializer);
        setField(entry10, "next", null);
        entryArray[925] = entry10;
        Object entry11 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry11, "hashCode", 359023572);
        Class class12 = Short.class;
        setField(entry11, "key", class12);
        setField(entry11, "value", numberDeserializer);
        setField(entry11, "next", null);
        entryArray[980] = entry11;
        Object entry12 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry12, "hashCode", 1943634922);
        Class class13 = Date.class;
        setField(entry12, "key", class13);
        DateCodec dateCodec = ((DateCodec) createInstance("com.alibaba.fastjson.serializer.DateCodec"));
        setField(entry12, "value", dateCodec);
        setField(entry12, "next", null);
        entryArray[1002] = entry12;
        Object entry13 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry13, "hashCode", 1574749319);
        Class class14 = java.util.TimeZone.class;
        setField(entry13, "key", class14);
        setField(entry13, "value", miscCodec);
        setField(entry13, "next", null);
        entryArray[1159] = entry13;
        Object entry14 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry14, "hashCode", 1112737073);
        Class class15 = StringBuffer.class;
        setField(entry14, "key", class15);
        setField(entry14, "value", stringCodec);
        setField(entry14, "next", null);
        entryArray[1329] = entry14;
        Object entry15 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry15, "hashCode", 428696898);
        Class class16 = com.alibaba.fastjson.JSONObject.class;
        setField(entry15, "key", class16);
        setField(entry15, "value", mapDeserializer);
        setField(entry15, "next", null);
        entryArray[1346] = entry15;
        Object entry16 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry16, "hashCode", 146589023);
        Class class17 = ConcurrentHashMap.class;
        setField(entry16, "key", class17);
        setField(entry16, "value", mapDeserializer);
        setField(entry16, "next", null);
        entryArray[1375] = entry16;
        Object entry17 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry17, "hashCode", 523429237);
        Class class18 = float.class;
        setField(entry17, "key", class18);
        FloatCodec floatCodec = ((FloatCodec) createInstance("com.alibaba.fastjson.serializer.FloatCodec"));
        setField(floatCodec, "decimalFormat", null);
        FloatCodec.instance = floatCodec;
        setField(entry17, "value", floatCodec);
        setField(entry17, "next", null);
        entryArray[1397] = entry17;
        Object entry18 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry18, "hashCode", 1976804832);
        Class class19 = HashMap.class;
        setField(entry18, "key", class19);
        setField(entry18, "value", mapDeserializer);
        setField(entry18, "next", null);
        entryArray[1504] = entry18;
        Object entry19 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry19, "hashCode", 3540494);
        Class class20 = Number.class;
        setField(entry19, "key", class20);
        setField(entry19, "value", numberDeserializer);
        setField(entry19, "next", null);
        entryArray[1550] = entry19;
        Object entry20 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry20, "hashCode", 1961002599);
        Class class21 = java.util.concurrent.ConcurrentMap.class;
        setField(entry20, "key", class21);
        setField(entry20, "value", mapDeserializer);
        setField(entry20, "next", null);
        entryArray[1639] = entry20;
        Object entry21 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry21, "hashCode", 471910020);
        Class class22 = char[].class;
        setField(entry21, "key", class22);
        CharArrayCodec charArrayCodec = ((CharArrayCodec) createInstance("com.alibaba.fastjson.serializer.CharArrayCodec"));
        setField(entry21, "value", charArrayCodec);
        setField(entry21, "next", null);
        entryArray[1668] = entry21;
        Object entry22 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry22, "hashCode", 1392838282);
        Class class23 = long.class;
        setField(entry22, "key", class23);
        setField(entry22, "value", longCodec);
        setField(entry22, "next", null);
        entryArray[1674] = entry22;
        Object entry23 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry23, "hashCode", 1593165620);
        Class class24 = java.util.Currency.class;
        setField(entry23, "key", class24);
        setField(entry23, "value", miscCodec);
        setField(entry23, "next", null);
        entryArray[1844] = entry23;
        Object entry24 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry24, "hashCode", 199657303);
        Class class25 = Comparable.class;
        setField(entry24, "key", class25);
        setField(entry24, "value", javaObjectDeserializer);
        setField(entry24, "next", null);
        entryArray[1879] = entry24;
        Object entry25 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry25, "hashCode", 1513867245);
        Class class26 = StringBuilder.class;
        setField(entry25, "key", class26);
        setField(entry25, "value", stringCodec);
        setField(entry25, "next", null);
        entryArray[2029] = entry25;
        Object entry26 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry26, "hashCode", 1808009213);
        Class class27 = java.lang.ref.WeakReference.class;
        setField(entry26, "key", class27);
        ReferenceCodec referenceCodec = ((ReferenceCodec) createInstance("com.alibaba.fastjson.serializer.ReferenceCodec"));
        setField(entry26, "value", referenceCodec);
        setField(entry26, "next", null);
        entryArray[2045] = entry26;
        Object entry27 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry27, "hashCode", 917768476);
        Class class28 = java.net.Inet6Address.class;
        setField(entry27, "key", class28);
        setField(entry27, "value", miscCodec);
        setField(entry27, "next", null);
        entryArray[2332] = entry27;
        Object entry28 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry28, "hashCode", 916835004);
        Class class29 = javax.xml.datatype.XMLGregorianCalendar.class;
        setField(entry28, "key", class29);
        CalendarCodec calendarCodec = ((CalendarCodec) createInstance("com.alibaba.fastjson.serializer.CalendarCodec"));
        setField(calendarCodec, "dateFactory", null);
        setField(entry28, "value", calendarCodec);
        setField(entry28, "next", null);
        entryArray[2748] = entry28;
        Object entry29 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry29, "hashCode", 1610427175);
        Class class30 = Class.class;
        setField(entry29, "key", class30);
        setField(entry29, "value", miscCodec);
        setField(entry29, "next", null);
        entryArray[2855] = entry29;
        Object entry30 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry30, "hashCode", 384617262);
        Class class31 = java.util.Locale.class;
        setField(entry30, "key", class31);
        setField(entry30, "value", miscCodec);
        setField(entry30, "next", null);
        entryArray[2862] = entry30;
        Object entry31 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry31, "hashCode", 1911155630);
        Class class32 = java.sql.Time.class;
        setField(entry31, "key", class32);
        TimeDeserializer timeDeserializer = ((TimeDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.TimeDeserializer"));
        setField(entry31, "value", timeDeserializer);
        setField(entry31, "next", null);
        entryArray[2990] = entry31;
        Object entry32 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry32, "hashCode", 2115628016);
        Class class33 = com.alibaba.fastjson.JSONPObject.class;
        setField(entry32, "key", class33);
        JSONPDeserializer jSONPDeserializer = ((JSONPDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.JSONPDeserializer"));
        setField(entry32, "value", jSONPDeserializer);
        setField(entry32, "next", null);
        entryArray[3056] = entry32;
        Object entry33 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry33, "hashCode", 2065951873);
        Class class34 = Integer.class;
        setField(entry33, "key", class34);
        IntegerCodec integerCodec = ((IntegerCodec) createInstance("com.alibaba.fastjson.serializer.IntegerCodec"));
        IntegerCodec.instance = integerCodec;
        setField(entry33, "value", integerCodec);
        setField(entry33, "next", null);
        entryArray[3201] = entry33;
        Object entry34 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry34, "hashCode", 617901222);
        Class class35 = Object.class;
        setField(entry34, "key", class35);
        setField(entry34, "value", javaObjectDeserializer);
        setField(entry34, "next", null);
        entryArray[3238] = entry34;
        Object entry35 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry35, "hashCode", 1093864783);
        Class class36 = StackTraceElement.class;
        setField(entry35, "key", class36);
        StackTraceElementDeserializer stackTraceElementDeserializer = ((StackTraceElementDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.StackTraceElementDeserializer"));
        setField(entry35, "value", stackTraceElementDeserializer);
        setField(entry35, "next", null);
        entryArray[3407] = entry35;
        Object entry36 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry36, "hashCode", 2111991224);
        Class class37 = Double.class;
        setField(entry36, "key", class37);
        setField(entry36, "value", numberDeserializer);
        setField(entry36, "next", null);
        entryArray[3512] = entry36;
        Object entry37 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry37, "hashCode", 2101636817);
        Class class38 = java.io.Closeable.class;
        setField(entry37, "key", class38);
        setField(entry37, "value", javaObjectDeserializer);
        setField(entry37, "next", null);
        entryArray[3793] = entry37;
        Object entry38 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry38, "hashCode", 2108297149);
        Class class39 = java.util.Collection.class;
        setField(entry38, "key", class39);
        CollectionCodec collectionCodec = ((CollectionCodec) createInstance("com.alibaba.fastjson.serializer.CollectionCodec"));
        setField(entry38, "value", collectionCodec);
        setField(entry38, "next", null);
        entryArray[4029] = entry38;
        Object entry39 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry39, "hashCode", 895766599);
        Class class40 = java.math.BigDecimal.class;
        setField(entry39, "key", class40);
        BigDecimalCodec bigDecimalCodec = ((BigDecimalCodec) createInstance("com.alibaba.fastjson.serializer.BigDecimalCodec"));
        setField(entry39, "value", bigDecimalCodec);
        setField(entry39, "next", null);
        entryArray[4167] = entry39;
        Object entry40 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry40, "hashCode", 1181815135);
        Class class41 = java.net.InetSocketAddress.class;
        setField(entry40, "key", class41);
        setField(entry40, "value", miscCodec);
        setField(entry40, "next", null);
        entryArray[4447] = entry40;
        Object entry41 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry41, "hashCode", 57241990);
        Class class42 = URL.class;
        setField(entry41, "key", class42);
        setField(entry41, "value", miscCodec);
        setField(entry41, "next", null);
        entryArray[4486] = entry41;
        Object entry42 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry42, "hashCode", 932172204);
        Class class43 = Boolean.class;
        setField(entry42, "key", class43);
        setField(entry42, "value", booleanCodec);
        setField(entry42, "next", null);
        entryArray[4524] = entry42;
        Object entry43 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry43, "hashCode", 1703367244);
        Class class44 = AtomicInteger.class;
        setField(entry43, "key", class44);
        setField(entry43, "value", integerCodec);
        setField(entry43, "next", null);
        entryArray[4684] = entry43;
        Object entry44 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry44, "hashCode", 857068247);
        Class class45 = ArrayList.class;
        setField(entry44, "key", class45);
        setField(entry44, "value", collectionCodec);
        setField(entry44, "next", null);
        entryArray[4823] = entry44;
        Object entry45 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry45, "hashCode", 404648734);
        Class class46 = BigInteger.class;
        setField(entry45, "key", class46);
        BigIntegerCodec bigIntegerCodec = ((BigIntegerCodec) createInstance("com.alibaba.fastjson.serializer.BigIntegerCodec"));
        setField(entry45, "value", bigIntegerCodec);
        setField(entry45, "next", null);
        entryArray[4894] = entry45;
        Object entry46 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry46, "hashCode", 212628335);
        Class class47 = Byte.class;
        setField(entry46, "key", class47);
        setField(entry46, "value", numberDeserializer);
        setField(entry46, "next", null);
        entryArray[4975] = entry46;
        Object entry47 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry47, "hashCode", 1530295320);
        Class class48 = java.nio.charset.Charset.class;
        setField(entry47, "key", class48);
        setField(entry47, "value", miscCodec);
        setField(entry47, "next", null);
        entryArray[5144] = entry47;
        Object entry48 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry48, "hashCode", 360936478);
        Class class49 = java.util.regex.Pattern.class;
        setField(entry48, "key", class49);
        setField(entry48, "value", miscCodec);
        setField(entry48, "next", null);
        entryArray[5150] = entry48;
        Object entry49 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry49, "hashCode", 1364497552);
        Class class50 = java.sql.Date.class;
        setField(entry49, "key", class50);
        SqlDateDeserializer sqlDateDeserializer = ((SqlDateDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.SqlDateDeserializer"));
        setField(sqlDateDeserializer, "timestamp", false);
        setField(entry49, "value", sqlDateDeserializer);
        setField(entry49, "next", null);
        entryArray[5264] = entry49;
        Object entry50 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry50, "hashCode", 1746572565);
        Class class51 = char.class;
        setField(entry50, "key", class51);
        CharacterCodec characterCodec = ((CharacterCodec) createInstance("com.alibaba.fastjson.serializer.CharacterCodec"));
        setField(entry50, "value", characterCodec);
        setField(entry50, "next", null);
        entryArray[5397] = entry50;
        Object entry51 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry51, "hashCode", 776484396);
        Class class52 = java.io.Serializable.class;
        setField(entry51, "key", class52);
        setField(entry51, "value", javaObjectDeserializer);
        setField(entry51, "next", null);
        entryArray[5676] = entry51;
        Object entry52 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry52, "hashCode", 512456259);
        Class class53 = java.sql.Timestamp.class;
        setField(entry52, "key", class53);
        SqlDateDeserializer sqlDateDeserializer1 = ((SqlDateDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.SqlDateDeserializer"));
        setField(sqlDateDeserializer1, "timestamp", true);
        setField(entry52, "value", sqlDateDeserializer1);
        setField(entry52, "next", null);
        entryArray[5699] = entry52;
        Object entry53 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry53, "hashCode", 1313953385);
        Class class54 = byte.class;
        setField(entry53, "key", class54);
        setField(entry53, "value", numberDeserializer);
        setField(entry53, "next", null);
        entryArray[5737] = entry53;
        Object entry54 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry54, "hashCode", 498931366);
        Class class55 = java.util.concurrent.atomic.AtomicLong.class;
        setField(entry54, "key", class55);
        setField(entry54, "value", longCodec);
        setField(entry54, "next", null);
        entryArray[5798] = entry54;
        Object entry55 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry55, "hashCode", 249034932);
        Class class56 = java.util.concurrent.atomic.AtomicReference.class;
        setField(entry55, "key", class56);
        setField(entry55, "value", referenceCodec);
        setField(entry55, "next", null);
        entryArray[6324] = entry55;
        Object entry56 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry56, "hashCode", 1126185196);
        Class class57 = Map.class;
        setField(entry56, "key", class57);
        setField(entry56, "value", mapDeserializer);
        setField(entry56, "next", null);
        entryArray[6380] = entry56;
        Object entry57 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry57, "hashCode", 681842940);
        Class class58 = int.class;
        setField(entry57, "key", class58);
        setField(entry57, "value", integerCodec);
        setField(entry57, "next", null);
        entryArray[6396] = entry57;
        Object entry58 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry58, "hashCode", 932583850);
        Class class59 = Float.class;
        setField(entry58, "key", class59);
        setField(entry58, "value", floatCodec);
        setField(entry58, "next", null);
        entryArray[6570] = entry58;
        Object entry59 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry59, "hashCode", 914504136);
        Class class60 = java.util.Calendar.class;
        setField(entry59, "key", class60);
        setField(entry59, "value", calendarCodec);
        setField(entry59, "next", null);
        entryArray[6600] = entry59;
        Object entry60 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry60, "hashCode", 380812044);
        Class class61 = com.alibaba.fastjson.JSONPath.class;
        setField(entry60, "key", class61);
        setField(entry60, "value", miscCodec);
        setField(entry60, "next", null);
        entryArray[6924] = entry60;
        Object entry61 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry61, "hashCode", 1581267786);
        Class class62 = com.alibaba.fastjson.JSONArray.class;
        setField(entry61, "key", class62);
        setField(entry61, "value", collectionCodec);
        setField(entry61, "next", null);
        entryArray[6986] = entry61;
        Object entry62 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry62, "hashCode", 1579572132);
        Class class63 = Character.class;
        setField(entry62, "key", class63);
        setField(entry62, "value", characterCodec);
        setField(entry62, "next", null);
        entryArray[7076] = entry62;
        Object entry63 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry63, "hashCode", 1959910454);
        Class class64 = TreeMap.class;
        setField(entry63, "key", class64);
        setField(entry63, "value", mapDeserializer);
        setField(entry63, "next", null);
        entryArray[7222] = entry63;
        Object entry64 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry64, "hashCode", 1186339926);
        Class class65 = java.util.concurrent.atomic.AtomicLongArray.class;
        setField(entry64, "key", class65);
        setField(entry64, "value", atomicCodec);
        setField(entry64, "next", null);
        entryArray[7254] = entry64;
        Object entry65 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry65, "hashCode", 1062714541);
        Class class66 = java.text.SimpleDateFormat.class;
        setField(entry65, "key", class66);
        setField(entry65, "value", miscCodec);
        setField(entry65, "next", null);
        entryArray[7341] = entry65;
        Object entry66 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry66, "hashCode", 225909961);
        Class class67 = java.net.Inet4Address.class;
        setField(entry66, "key", class67);
        setField(entry66, "value", miscCodec);
        setField(entry66, "next", null);
        entryArray[7369] = entry66;
        Object entry67 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry67, "hashCode", 834600351);
        Class class68 = List.class;
        setField(entry67, "key", class68);
        setField(entry67, "value", collectionCodec);
        setField(entry67, "next", null);
        entryArray[7583] = entry67;
        Object entry68 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry68, "hashCode", 2694936);
        Class class69 = SoftReference.class;
        setField(entry68, "key", class69);
        setField(entry68, "value", referenceCodec);
        setField(entry68, "next", null);
        entryArray[7960] = entry68;
        Object entry69 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry69, "hashCode", 989110044);
        Class class70 = boolean.class;
        setField(entry69, "key", class70);
        setField(entry69, "value", booleanCodec);
        setField(entry69, "next", null);
        entryArray[7964] = entry69;
        setField(expected, "buckets", entryArray);
        setField(expected, "indexMask", 8191);
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetDerializers2() throws Throwable  {
        ParserConfig parserConfig = ((ParserConfig) createInstance("com.alibaba.fastjson.parser.ParserConfig"));
        IdentityHashMap identityHashMapMock = mock(IdentityHashMap.class);
        setField(parserConfig, "deserializers", identityHashMapMock);
        
        IdentityHashMap actual = parserConfig.getDerializers();
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(identityHashMapMock, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetDeserializers1() throws Throwable  {
        ParserConfig parserConfig = new ParserConfig();
        
        IdentityHashMap actual = parserConfig.getDeserializers();
        
        IdentityHashMap expected = ((IdentityHashMap) createInstance("com.alibaba.fastjson.util.IdentityHashMap"));
        java.lang.Object[] entryArray = createArray("com.alibaba.fastjson.util.IdentityHashMap$Entry", 8192);
        Object entry = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry, "hashCode", 1311146128);
        Class class1 = java.util.LinkedHashMap.class;
        setField(entry, "key", class1);
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.MapDeserializer"));
        MapDeserializer.instance = mapDeserializer;
        setField(entry, "value", mapDeserializer);
        setField(entry, "next", null);
        entryArray[144] = entry;
        Object entry1 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry1, "hashCode", 400064818);
        Class class2 = java.util.UUID.class;
        setField(entry1, "key", class2);
        MiscCodec miscCodec = ((MiscCodec) createInstance("com.alibaba.fastjson.serializer.MiscCodec"));
        setField(miscCodec, "FILE_RELATIVE_PATH_SUPPORT", false);
        setField(miscCodec, "method_paths_get", null);
        setField(miscCodec, "method_paths_get_error", false);
        setField(entry1, "value", miscCodec);
        setField(entry1, "next", null);
        entryArray[306] = entry1;
        Object entry2 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry2, "hashCode", 1866768727);
        Class class3 = java.util.concurrent.atomic.AtomicBoolean.class;
        setField(entry2, "key", class3);
        BooleanCodec booleanCodec = ((BooleanCodec) createInstance("com.alibaba.fastjson.serializer.BooleanCodec"));
        setField(entry2, "value", booleanCodec);
        setField(entry2, "next", null);
        entryArray[343] = entry2;
        Object entry3 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry3, "hashCode", 399573350);
        Class class4 = short.class;
        setField(entry3, "key", class4);
        NumberDeserializer numberDeserializer = ((NumberDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.NumberDeserializer"));
        setField(entry3, "value", numberDeserializer);
        setField(entry3, "next", null);
        entryArray[358] = entry3;
        Object entry4 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry4, "hashCode", 1554547125);
        Class class5 = String.class;
        setField(entry4, "key", class5);
        StringCodec stringCodec = ((StringCodec) createInstance("com.alibaba.fastjson.serializer.StringCodec"));
        StringCodec.instance = stringCodec;
        setField(entry4, "value", stringCodec);
        setField(entry4, "next", null);
        entryArray[437] = entry4;
        Object entry5 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry5, "hashCode", 2060468723);
        Class class6 = File.class;
        setField(entry5, "key", class6);
        setField(entry5, "value", miscCodec);
        setField(entry5, "next", null);
        entryArray[499] = entry5;
        Object entry6 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry6, "hashCode", 919446210);
        Class class7 = URI.class;
        setField(entry6, "key", class7);
        setField(entry6, "value", miscCodec);
        setField(entry6, "next", null);
        entryArray[706] = entry6;
        Object entry7 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry7, "hashCode", 1209770703);
        Class class8 = java.util.concurrent.atomic.AtomicIntegerArray.class;
        setField(entry7, "key", class8);
        AtomicCodec atomicCodec = ((AtomicCodec) createInstance("com.alibaba.fastjson.serializer.AtomicCodec"));
        setField(entry7, "value", atomicCodec);
        setField(entry7, "next", null);
        entryArray[719] = entry7;
        Object entry8 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry8, "hashCode", 664740647);
        Class class9 = double.class;
        setField(entry8, "key", class9);
        setField(entry8, "value", numberDeserializer);
        setField(entry8, "next", null);
        entryArray[807] = entry8;
        Object entry9 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry9, "hashCode", 305808283);
        Class class10 = Long.class;
        setField(entry9, "key", class10);
        LongCodec longCodec = ((LongCodec) createInstance("com.alibaba.fastjson.serializer.LongCodec"));
        LongCodec.instance = longCodec;
        setField(entry9, "value", longCodec);
        setField(entry9, "next", null);
        entryArray[923] = entry9;
        Object entry10 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry10, "hashCode", 519979933);
        Class class11 = Cloneable.class;
        setField(entry10, "key", class11);
        JavaObjectDeserializer javaObjectDeserializer = ((JavaObjectDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.JavaObjectDeserializer"));
        setField(entry10, "value", javaObjectDeserializer);
        setField(entry10, "next", null);
        entryArray[925] = entry10;
        Object entry11 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry11, "hashCode", 359023572);
        Class class12 = Short.class;
        setField(entry11, "key", class12);
        setField(entry11, "value", numberDeserializer);
        setField(entry11, "next", null);
        entryArray[980] = entry11;
        Object entry12 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry12, "hashCode", 1943634922);
        Class class13 = Date.class;
        setField(entry12, "key", class13);
        DateCodec dateCodec = ((DateCodec) createInstance("com.alibaba.fastjson.serializer.DateCodec"));
        setField(entry12, "value", dateCodec);
        setField(entry12, "next", null);
        entryArray[1002] = entry12;
        Object entry13 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry13, "hashCode", 1574749319);
        Class class14 = java.util.TimeZone.class;
        setField(entry13, "key", class14);
        setField(entry13, "value", miscCodec);
        setField(entry13, "next", null);
        entryArray[1159] = entry13;
        Object entry14 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry14, "hashCode", 1112737073);
        Class class15 = StringBuffer.class;
        setField(entry14, "key", class15);
        setField(entry14, "value", stringCodec);
        setField(entry14, "next", null);
        entryArray[1329] = entry14;
        Object entry15 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry15, "hashCode", 428696898);
        Class class16 = com.alibaba.fastjson.JSONObject.class;
        setField(entry15, "key", class16);
        setField(entry15, "value", mapDeserializer);
        setField(entry15, "next", null);
        entryArray[1346] = entry15;
        Object entry16 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry16, "hashCode", 146589023);
        Class class17 = ConcurrentHashMap.class;
        setField(entry16, "key", class17);
        setField(entry16, "value", mapDeserializer);
        setField(entry16, "next", null);
        entryArray[1375] = entry16;
        Object entry17 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry17, "hashCode", 523429237);
        Class class18 = float.class;
        setField(entry17, "key", class18);
        FloatCodec floatCodec = ((FloatCodec) createInstance("com.alibaba.fastjson.serializer.FloatCodec"));
        setField(floatCodec, "decimalFormat", null);
        FloatCodec.instance = floatCodec;
        setField(entry17, "value", floatCodec);
        setField(entry17, "next", null);
        entryArray[1397] = entry17;
        Object entry18 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry18, "hashCode", 1976804832);
        Class class19 = HashMap.class;
        setField(entry18, "key", class19);
        setField(entry18, "value", mapDeserializer);
        setField(entry18, "next", null);
        entryArray[1504] = entry18;
        Object entry19 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry19, "hashCode", 3540494);
        Class class20 = Number.class;
        setField(entry19, "key", class20);
        setField(entry19, "value", numberDeserializer);
        setField(entry19, "next", null);
        entryArray[1550] = entry19;
        Object entry20 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry20, "hashCode", 1961002599);
        Class class21 = java.util.concurrent.ConcurrentMap.class;
        setField(entry20, "key", class21);
        setField(entry20, "value", mapDeserializer);
        setField(entry20, "next", null);
        entryArray[1639] = entry20;
        Object entry21 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry21, "hashCode", 471910020);
        Class class22 = char[].class;
        setField(entry21, "key", class22);
        CharArrayCodec charArrayCodec = ((CharArrayCodec) createInstance("com.alibaba.fastjson.serializer.CharArrayCodec"));
        setField(entry21, "value", charArrayCodec);
        setField(entry21, "next", null);
        entryArray[1668] = entry21;
        Object entry22 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry22, "hashCode", 1392838282);
        Class class23 = long.class;
        setField(entry22, "key", class23);
        setField(entry22, "value", longCodec);
        setField(entry22, "next", null);
        entryArray[1674] = entry22;
        Object entry23 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry23, "hashCode", 1593165620);
        Class class24 = java.util.Currency.class;
        setField(entry23, "key", class24);
        setField(entry23, "value", miscCodec);
        setField(entry23, "next", null);
        entryArray[1844] = entry23;
        Object entry24 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry24, "hashCode", 199657303);
        Class class25 = Comparable.class;
        setField(entry24, "key", class25);
        setField(entry24, "value", javaObjectDeserializer);
        setField(entry24, "next", null);
        entryArray[1879] = entry24;
        Object entry25 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry25, "hashCode", 1513867245);
        Class class26 = StringBuilder.class;
        setField(entry25, "key", class26);
        setField(entry25, "value", stringCodec);
        setField(entry25, "next", null);
        entryArray[2029] = entry25;
        Object entry26 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry26, "hashCode", 1808009213);
        Class class27 = java.lang.ref.WeakReference.class;
        setField(entry26, "key", class27);
        ReferenceCodec referenceCodec = ((ReferenceCodec) createInstance("com.alibaba.fastjson.serializer.ReferenceCodec"));
        setField(entry26, "value", referenceCodec);
        setField(entry26, "next", null);
        entryArray[2045] = entry26;
        Object entry27 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry27, "hashCode", 917768476);
        Class class28 = java.net.Inet6Address.class;
        setField(entry27, "key", class28);
        setField(entry27, "value", miscCodec);
        setField(entry27, "next", null);
        entryArray[2332] = entry27;
        Object entry28 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry28, "hashCode", 916835004);
        Class class29 = javax.xml.datatype.XMLGregorianCalendar.class;
        setField(entry28, "key", class29);
        CalendarCodec calendarCodec = ((CalendarCodec) createInstance("com.alibaba.fastjson.serializer.CalendarCodec"));
        setField(calendarCodec, "dateFactory", null);
        setField(entry28, "value", calendarCodec);
        setField(entry28, "next", null);
        entryArray[2748] = entry28;
        Object entry29 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry29, "hashCode", 1610427175);
        Class class30 = Class.class;
        setField(entry29, "key", class30);
        setField(entry29, "value", miscCodec);
        setField(entry29, "next", null);
        entryArray[2855] = entry29;
        Object entry30 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry30, "hashCode", 384617262);
        Class class31 = java.util.Locale.class;
        setField(entry30, "key", class31);
        setField(entry30, "value", miscCodec);
        setField(entry30, "next", null);
        entryArray[2862] = entry30;
        Object entry31 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry31, "hashCode", 1911155630);
        Class class32 = java.sql.Time.class;
        setField(entry31, "key", class32);
        TimeDeserializer timeDeserializer = ((TimeDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.TimeDeserializer"));
        setField(entry31, "value", timeDeserializer);
        setField(entry31, "next", null);
        entryArray[2990] = entry31;
        Object entry32 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry32, "hashCode", 2115628016);
        Class class33 = com.alibaba.fastjson.JSONPObject.class;
        setField(entry32, "key", class33);
        JSONPDeserializer jSONPDeserializer = ((JSONPDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.JSONPDeserializer"));
        setField(entry32, "value", jSONPDeserializer);
        setField(entry32, "next", null);
        entryArray[3056] = entry32;
        Object entry33 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry33, "hashCode", 2065951873);
        Class class34 = Integer.class;
        setField(entry33, "key", class34);
        IntegerCodec integerCodec = ((IntegerCodec) createInstance("com.alibaba.fastjson.serializer.IntegerCodec"));
        IntegerCodec.instance = integerCodec;
        setField(entry33, "value", integerCodec);
        setField(entry33, "next", null);
        entryArray[3201] = entry33;
        Object entry34 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry34, "hashCode", 617901222);
        Class class35 = Object.class;
        setField(entry34, "key", class35);
        setField(entry34, "value", javaObjectDeserializer);
        setField(entry34, "next", null);
        entryArray[3238] = entry34;
        Object entry35 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry35, "hashCode", 1093864783);
        Class class36 = StackTraceElement.class;
        setField(entry35, "key", class36);
        StackTraceElementDeserializer stackTraceElementDeserializer = ((StackTraceElementDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.StackTraceElementDeserializer"));
        setField(entry35, "value", stackTraceElementDeserializer);
        setField(entry35, "next", null);
        entryArray[3407] = entry35;
        Object entry36 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry36, "hashCode", 2111991224);
        Class class37 = Double.class;
        setField(entry36, "key", class37);
        setField(entry36, "value", numberDeserializer);
        setField(entry36, "next", null);
        entryArray[3512] = entry36;
        Object entry37 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry37, "hashCode", 2101636817);
        Class class38 = java.io.Closeable.class;
        setField(entry37, "key", class38);
        setField(entry37, "value", javaObjectDeserializer);
        setField(entry37, "next", null);
        entryArray[3793] = entry37;
        Object entry38 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry38, "hashCode", 2108297149);
        Class class39 = java.util.Collection.class;
        setField(entry38, "key", class39);
        CollectionCodec collectionCodec = ((CollectionCodec) createInstance("com.alibaba.fastjson.serializer.CollectionCodec"));
        setField(entry38, "value", collectionCodec);
        setField(entry38, "next", null);
        entryArray[4029] = entry38;
        Object entry39 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry39, "hashCode", 895766599);
        Class class40 = java.math.BigDecimal.class;
        setField(entry39, "key", class40);
        BigDecimalCodec bigDecimalCodec = ((BigDecimalCodec) createInstance("com.alibaba.fastjson.serializer.BigDecimalCodec"));
        setField(entry39, "value", bigDecimalCodec);
        setField(entry39, "next", null);
        entryArray[4167] = entry39;
        Object entry40 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry40, "hashCode", 1181815135);
        Class class41 = java.net.InetSocketAddress.class;
        setField(entry40, "key", class41);
        setField(entry40, "value", miscCodec);
        setField(entry40, "next", null);
        entryArray[4447] = entry40;
        Object entry41 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry41, "hashCode", 57241990);
        Class class42 = URL.class;
        setField(entry41, "key", class42);
        setField(entry41, "value", miscCodec);
        setField(entry41, "next", null);
        entryArray[4486] = entry41;
        Object entry42 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry42, "hashCode", 932172204);
        Class class43 = Boolean.class;
        setField(entry42, "key", class43);
        setField(entry42, "value", booleanCodec);
        setField(entry42, "next", null);
        entryArray[4524] = entry42;
        Object entry43 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry43, "hashCode", 1703367244);
        Class class44 = AtomicInteger.class;
        setField(entry43, "key", class44);
        setField(entry43, "value", integerCodec);
        setField(entry43, "next", null);
        entryArray[4684] = entry43;
        Object entry44 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry44, "hashCode", 857068247);
        Class class45 = ArrayList.class;
        setField(entry44, "key", class45);
        setField(entry44, "value", collectionCodec);
        setField(entry44, "next", null);
        entryArray[4823] = entry44;
        Object entry45 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry45, "hashCode", 404648734);
        Class class46 = BigInteger.class;
        setField(entry45, "key", class46);
        BigIntegerCodec bigIntegerCodec = ((BigIntegerCodec) createInstance("com.alibaba.fastjson.serializer.BigIntegerCodec"));
        setField(entry45, "value", bigIntegerCodec);
        setField(entry45, "next", null);
        entryArray[4894] = entry45;
        Object entry46 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry46, "hashCode", 212628335);
        Class class47 = Byte.class;
        setField(entry46, "key", class47);
        setField(entry46, "value", numberDeserializer);
        setField(entry46, "next", null);
        entryArray[4975] = entry46;
        Object entry47 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry47, "hashCode", 1530295320);
        Class class48 = java.nio.charset.Charset.class;
        setField(entry47, "key", class48);
        setField(entry47, "value", miscCodec);
        setField(entry47, "next", null);
        entryArray[5144] = entry47;
        Object entry48 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry48, "hashCode", 360936478);
        Class class49 = java.util.regex.Pattern.class;
        setField(entry48, "key", class49);
        setField(entry48, "value", miscCodec);
        setField(entry48, "next", null);
        entryArray[5150] = entry48;
        Object entry49 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry49, "hashCode", 1364497552);
        Class class50 = java.sql.Date.class;
        setField(entry49, "key", class50);
        SqlDateDeserializer sqlDateDeserializer = ((SqlDateDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.SqlDateDeserializer"));
        setField(sqlDateDeserializer, "timestamp", false);
        setField(entry49, "value", sqlDateDeserializer);
        setField(entry49, "next", null);
        entryArray[5264] = entry49;
        Object entry50 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry50, "hashCode", 1746572565);
        Class class51 = char.class;
        setField(entry50, "key", class51);
        CharacterCodec characterCodec = ((CharacterCodec) createInstance("com.alibaba.fastjson.serializer.CharacterCodec"));
        setField(entry50, "value", characterCodec);
        setField(entry50, "next", null);
        entryArray[5397] = entry50;
        Object entry51 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry51, "hashCode", 776484396);
        Class class52 = java.io.Serializable.class;
        setField(entry51, "key", class52);
        setField(entry51, "value", javaObjectDeserializer);
        setField(entry51, "next", null);
        entryArray[5676] = entry51;
        Object entry52 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry52, "hashCode", 512456259);
        Class class53 = java.sql.Timestamp.class;
        setField(entry52, "key", class53);
        SqlDateDeserializer sqlDateDeserializer1 = ((SqlDateDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.SqlDateDeserializer"));
        setField(sqlDateDeserializer1, "timestamp", true);
        setField(entry52, "value", sqlDateDeserializer1);
        setField(entry52, "next", null);
        entryArray[5699] = entry52;
        Object entry53 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry53, "hashCode", 1313953385);
        Class class54 = byte.class;
        setField(entry53, "key", class54);
        setField(entry53, "value", numberDeserializer);
        setField(entry53, "next", null);
        entryArray[5737] = entry53;
        Object entry54 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry54, "hashCode", 498931366);
        Class class55 = java.util.concurrent.atomic.AtomicLong.class;
        setField(entry54, "key", class55);
        setField(entry54, "value", longCodec);
        setField(entry54, "next", null);
        entryArray[5798] = entry54;
        Object entry55 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry55, "hashCode", 249034932);
        Class class56 = java.util.concurrent.atomic.AtomicReference.class;
        setField(entry55, "key", class56);
        setField(entry55, "value", referenceCodec);
        setField(entry55, "next", null);
        entryArray[6324] = entry55;
        Object entry56 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry56, "hashCode", 1126185196);
        Class class57 = Map.class;
        setField(entry56, "key", class57);
        setField(entry56, "value", mapDeserializer);
        setField(entry56, "next", null);
        entryArray[6380] = entry56;
        Object entry57 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry57, "hashCode", 681842940);
        Class class58 = int.class;
        setField(entry57, "key", class58);
        setField(entry57, "value", integerCodec);
        setField(entry57, "next", null);
        entryArray[6396] = entry57;
        Object entry58 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry58, "hashCode", 932583850);
        Class class59 = Float.class;
        setField(entry58, "key", class59);
        setField(entry58, "value", floatCodec);
        setField(entry58, "next", null);
        entryArray[6570] = entry58;
        Object entry59 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry59, "hashCode", 914504136);
        Class class60 = java.util.Calendar.class;
        setField(entry59, "key", class60);
        setField(entry59, "value", calendarCodec);
        setField(entry59, "next", null);
        entryArray[6600] = entry59;
        Object entry60 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry60, "hashCode", 380812044);
        Class class61 = com.alibaba.fastjson.JSONPath.class;
        setField(entry60, "key", class61);
        setField(entry60, "value", miscCodec);
        setField(entry60, "next", null);
        entryArray[6924] = entry60;
        Object entry61 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry61, "hashCode", 1581267786);
        Class class62 = com.alibaba.fastjson.JSONArray.class;
        setField(entry61, "key", class62);
        setField(entry61, "value", collectionCodec);
        setField(entry61, "next", null);
        entryArray[6986] = entry61;
        Object entry62 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry62, "hashCode", 1579572132);
        Class class63 = Character.class;
        setField(entry62, "key", class63);
        setField(entry62, "value", characterCodec);
        setField(entry62, "next", null);
        entryArray[7076] = entry62;
        Object entry63 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry63, "hashCode", 1959910454);
        Class class64 = TreeMap.class;
        setField(entry63, "key", class64);
        setField(entry63, "value", mapDeserializer);
        setField(entry63, "next", null);
        entryArray[7222] = entry63;
        Object entry64 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry64, "hashCode", 1186339926);
        Class class65 = java.util.concurrent.atomic.AtomicLongArray.class;
        setField(entry64, "key", class65);
        setField(entry64, "value", atomicCodec);
        setField(entry64, "next", null);
        entryArray[7254] = entry64;
        Object entry65 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry65, "hashCode", 1062714541);
        Class class66 = java.text.SimpleDateFormat.class;
        setField(entry65, "key", class66);
        setField(entry65, "value", miscCodec);
        setField(entry65, "next", null);
        entryArray[7341] = entry65;
        Object entry66 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry66, "hashCode", 225909961);
        Class class67 = java.net.Inet4Address.class;
        setField(entry66, "key", class67);
        setField(entry66, "value", miscCodec);
        setField(entry66, "next", null);
        entryArray[7369] = entry66;
        Object entry67 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry67, "hashCode", 834600351);
        Class class68 = List.class;
        setField(entry67, "key", class68);
        setField(entry67, "value", collectionCodec);
        setField(entry67, "next", null);
        entryArray[7583] = entry67;
        Object entry68 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry68, "hashCode", 2694936);
        Class class69 = SoftReference.class;
        setField(entry68, "key", class69);
        setField(entry68, "value", referenceCodec);
        setField(entry68, "next", null);
        entryArray[7960] = entry68;
        Object entry69 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry69, "hashCode", 989110044);
        Class class70 = boolean.class;
        setField(entry69, "key", class70);
        setField(entry69, "value", booleanCodec);
        setField(entry69, "next", null);
        entryArray[7964] = entry69;
        setField(expected, "buckets", entryArray);
        setField(expected, "indexMask", 8191);
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetDeserializers2() throws Throwable  {
        ParserConfig parserConfig = ((ParserConfig) createInstance("com.alibaba.fastjson.parser.ParserConfig"));
        IdentityHashMap identityHashMapMock = mock(IdentityHashMap.class);
        setField(parserConfig, "deserializers", identityHashMapMock);
        
        IdentityHashMap actual = parserConfig.getDeserializers();
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(identityHashMapMock, actual));
    }
    ///endregion
    
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
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetDeserializer2() throws Throwable  {
        ParserConfig parserConfig = ((ParserConfig) createInstance("com.alibaba.fastjson.parser.ParserConfig"));
        IdentityHashMap identityHashMapMock = mock(IdentityHashMap.class);
        java.lang.Object[] ofDoubleArray = createArray("java.util.stream.ForEachOps$ForEachOp$OfDouble", 0);
        when(identityHashMapMock.get(any())).thenReturn(((Object) ofDoubleArray));
        setField(parserConfig, "deserializers", identityHashMapMock);
        
        parserConfig.getDeserializer(((Type) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetDeserializer3() throws Throwable  {
        ParserConfig parserConfig = new ParserConfig();
        FieldInfo fieldInfo = ((FieldInfo) createInstance("com.alibaba.fastjson.util.FieldInfo"));
        
        parserConfig.getDeserializer(fieldInfo);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetDeserializer4() throws Throwable  {
        ParserConfig parserConfig = ((ParserConfig) createInstance("com.alibaba.fastjson.parser.ParserConfig"));
        
        parserConfig.getDeserializer(((FieldInfo) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetDeserializer5() throws Throwable  {
        ParserConfig parserConfig = ((ParserConfig) createInstance("com.alibaba.fastjson.parser.ParserConfig"));
        IdentityHashMap identityHashMapMock = mock(IdentityHashMap.class);
        java.lang.Object[] forEachOrderedTaskArray = createArray("java.util.stream.ForEachOps$ForEachOrderedTask", 0);
        when(identityHashMapMock.get(any())).thenReturn(((Object) forEachOrderedTaskArray));
        setField(parserConfig, "deserializers", identityHashMapMock);
        
        parserConfig.getDeserializer(null, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetDeserializer6() throws Throwable  {
        ParserConfig parserConfig = ((ParserConfig) createInstance("com.alibaba.fastjson.parser.ParserConfig"));
        IdentityHashMap identityHashMapMock = mock(IdentityHashMap.class);
        NumberDeserializer numberDeserializer = ((NumberDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.NumberDeserializer"));
        when(identityHashMapMock.get(any())).thenReturn(((Object) numberDeserializer));
        setField(parserConfig, "deserializers", identityHashMapMock);
        
        ObjectDeserializer actual = parserConfig.getDeserializer(null, null);
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(numberDeserializer, actual));
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
    public void testInitJavaBeanDeserializers2() throws Throwable  {
        ParserConfig parserConfig = ((ParserConfig) createInstance("com.alibaba.fastjson.parser.ParserConfig"));
        
        parserConfig.initJavaBeanDeserializers(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testInitJavaBeanDeserializers3() throws Throwable  {
        ParserConfig parserConfig = ((ParserConfig) createInstance("com.alibaba.fastjson.parser.ParserConfig"));
        java.lang.Class[] classArray = new java.lang.Class[0];
        
        parserConfig.initJavaBeanDeserializers(classArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testInitJavaBeanDeserializers4() throws Throwable  {
        ParserConfig parserConfig = ((ParserConfig) createInstance("com.alibaba.fastjson.parser.ParserConfig"));
        java.lang.Class[] classArray = new java.lang.Class[1];
        
        parserConfig.initJavaBeanDeserializers(classArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateJavaBeanDeserializer1() throws Throwable  {
        ParserConfig parserConfig = ((ParserConfig) createInstance("com.alibaba.fastjson.parser.ParserConfig"));
        setField(parserConfig, "fieldBased", false);
        setField(parserConfig, "asmEnable", false);
        
        parserConfig.createJavaBeanDeserializer(null, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateJavaBeanDeserializer2() throws Throwable  {
        ParserConfig parserConfig = ((ParserConfig) createInstance("com.alibaba.fastjson.parser.ParserConfig"));
        setField(parserConfig, "fieldBased", true);
        setField(parserConfig, "asmEnable", false);
        
        parserConfig.createJavaBeanDeserializer(null, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateJavaBeanDeserializer3() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(com.alibaba.fastjson.util.TypeUtils.class);
            Annotation annotationMock = mock(Annotation.class);
            mockedStatic.when(() -> {
                com.alibaba.fastjson.util.TypeUtils.getAnnotation(any(), any());
            }).thenReturn(annotationMock);
            ParserConfig parserConfig = ((ParserConfig) createInstance("com.alibaba.fastjson.parser.ParserConfig"));
            setField(parserConfig, "fieldBased", false);
            setField(parserConfig, "asmEnable", true);
            
            parserConfig.createJavaBeanDeserializer(null, null);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCreateFieldDeserializer1() throws Throwable  {
        ParserConfig parserConfig = new ParserConfig();
        ParserConfig parserConfig1 = new ParserConfig();
        JavaBeanInfo javaBeanInfo = ((JavaBeanInfo) createInstance("com.alibaba.fastjson.util.JavaBeanInfo"));
        FieldInfo fieldInfo = ((FieldInfo) createInstance("com.alibaba.fastjson.util.FieldInfo"));
        
        FieldDeserializer actual = parserConfig.createFieldDeserializer(parserConfig1, javaBeanInfo, fieldInfo);
        
        DefaultFieldDeserializer expected = ((DefaultFieldDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.DefaultFieldDeserializer"));
        setField(expected, "fieldValueDeserilizer", null);
        setField(expected, "customDeserilizer", false);
        setField(expected, "fieldInfo", fieldInfo);
        setField(expected, "clazz", null);
        setField(expected, "beanContext", null);
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateFieldDeserializer2() throws Throwable  {
        ParserConfig parserConfig = ((ParserConfig) createInstance("com.alibaba.fastjson.parser.ParserConfig"));
        ParserConfig parserConfig1 = ((ParserConfig) createInstance("com.alibaba.fastjson.parser.ParserConfig"));
        
        parserConfig.createFieldDeserializer(parserConfig1, null, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateFieldDeserializer3() throws Throwable  {
        ParserConfig parserConfig = ((ParserConfig) createInstance("com.alibaba.fastjson.parser.ParserConfig"));
        ParserConfig parserConfig1 = ((ParserConfig) createInstance("com.alibaba.fastjson.parser.ParserConfig"));
        JavaBeanInfo javaBeanInfoMock = mock(JavaBeanInfo.class);
        Class class1 = Object.class;
        setField(javaBeanInfoMock, "clazz", class1);
        
        parserConfig.createFieldDeserializer(parserConfig1, javaBeanInfoMock, null);
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
    public void testPutDeserializer2() throws Throwable  {
        ParserConfig parserConfig = ((ParserConfig) createInstance("com.alibaba.fastjson.parser.ParserConfig"));
        IdentityHashMap identityHashMapMock = mock(IdentityHashMap.class);
        when(identityHashMapMock.put(any(), any())).thenReturn(false);
        setField(parserConfig, "deserializers", identityHashMapMock);
        ObjectDeserializer objectDeserializerMock = mock(ObjectDeserializer.class);
        
        parserConfig.putDeserializer(null, objectDeserializerMock);
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
    public void testGetDefaultClassLoader2() throws Throwable  {
        ParserConfig parserConfig = ((ParserConfig) createInstance("com.alibaba.fastjson.parser.ParserConfig"));
        setField(parserConfig, "defaultClassLoader", null);
        
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
    public void testSetDefaultClassLoader2() throws Throwable  {
        ParserConfig parserConfig = ((ParserConfig) createInstance("com.alibaba.fastjson.parser.ParserConfig"));
        setField(parserConfig, "defaultClassLoader", null);
        
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
    public void testAddDeny2() throws Throwable  {
        ParserConfig parserConfig = ((ParserConfig) createInstance("com.alibaba.fastjson.parser.ParserConfig"));
        
        parserConfig.addDeny(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testAddDeny3() throws Throwable  {
        ParserConfig parserConfig = ((ParserConfig) createInstance("com.alibaba.fastjson.parser.ParserConfig"));
        String string = new String("");
        
        parserConfig.addDeny(string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testAddDeny4() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(com.alibaba.fastjson.util.TypeUtils.class);
            mockedStatic.when(() -> {
                com.alibaba.fastjson.util.TypeUtils.fnv1a_64(anyString());
            }).thenReturn(0L);
            ParserConfig parserConfig = ((ParserConfig) createInstance("com.alibaba.fastjson.parser.ParserConfig"));
            long[] longArray = new long[1];
            setField(parserConfig, "denyHashCodes", longArray);
            String string = new String("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
            
            parserConfig.addDeny(string);
        } finally {
            mockedStatic.close();
        }
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
    public void testAddAccept2() throws Throwable  {
        ParserConfig parserConfig = ((ParserConfig) createInstance("com.alibaba.fastjson.parser.ParserConfig"));
        
        parserConfig.addAccept(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testAddAccept3() throws Throwable  {
        ParserConfig parserConfig = ((ParserConfig) createInstance("com.alibaba.fastjson.parser.ParserConfig"));
        String string = new String("");
        
        parserConfig.addAccept(string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testAddAccept4() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(com.alibaba.fastjson.util.TypeUtils.class);
            mockedStatic.when(() -> {
                com.alibaba.fastjson.util.TypeUtils.fnv1a_64(anyString());
            }).thenReturn(0L);
            ParserConfig parserConfig = ((ParserConfig) createInstance("com.alibaba.fastjson.parser.ParserConfig"));
            long[] longArray = new long[1];
            setField(parserConfig, "acceptHashCodes", longArray);
            String string = new String("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
            
            parserConfig.addAccept(string);
        } finally {
            mockedStatic.close();
        }
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
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCheckAutoType2() throws Throwable  {
        ParserConfig parserConfig = ((ParserConfig) createInstance("com.alibaba.fastjson.parser.ParserConfig"));
        String string = new String("");
        
        parserConfig.checkAutoType(string, null, 0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testClearDeserializers1() throws Throwable  {
        ParserConfig parserConfig = new ParserConfig();
        
        parserConfig.clearDeserializers();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIsPrimitive1() throws Throwable  {
        ParserConfig parserConfig = ((ParserConfig) createInstance("com.alibaba.fastjson.parser.ParserConfig"));
        Class class1 = Object.class;
        
        boolean actual = parserConfig.isPrimitive(class1);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIsPrimitive2() throws Throwable  {
        ParserConfig parserConfig = ((ParserConfig) createInstance("com.alibaba.fastjson.parser.ParserConfig"));
        Class class1 = Object.class;
        
        boolean actual = parserConfig.isPrimitive(class1);
        
        assertTrue(actual);
        
        Class finalClass1 = class1;
        
        Class expectedFinalClass1 = Double.class;
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expectedFinalClass1, finalClass1));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIsPrimitive3() throws Throwable  {
        ParserConfig parserConfig = ((ParserConfig) createInstance("com.alibaba.fastjson.parser.ParserConfig"));
        Class class1 = Object.class;
        
        boolean actual = parserConfig.isPrimitive(class1);
        
        assertTrue(actual);
        
        Class finalClass1 = class1;
        
        Class expectedFinalClass1 = Integer.class;
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expectedFinalClass1, finalClass1));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIsPrimitive4() throws Throwable  {
        ParserConfig parserConfig = ((ParserConfig) createInstance("com.alibaba.fastjson.parser.ParserConfig"));
        Class class1 = Object.class;
        
        boolean actual = parserConfig.isPrimitive(class1);
        
        assertTrue(actual);
        
        Class finalClass1 = class1;
        
        Class expectedFinalClass1 = Byte.class;
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expectedFinalClass1, finalClass1));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIsPrimitive5() throws Throwable  {
        ParserConfig parserConfig = ((ParserConfig) createInstance("com.alibaba.fastjson.parser.ParserConfig"));
        Class class1 = Object.class;
        
        boolean actual = parserConfig.isPrimitive(class1);
        
        assertTrue(actual);
        
        Class finalClass1 = class1;
        
        Class expectedFinalClass1 = java.sql.Time.class;
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expectedFinalClass1, finalClass1));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIsPrimitive6() throws Throwable  {
        ParserConfig parserConfig = ((ParserConfig) createInstance("com.alibaba.fastjson.parser.ParserConfig"));
        Class class1 = Object.class;
        
        boolean actual = parserConfig.isPrimitive(class1);
        
        assertTrue(actual);
        
        Class finalClass1 = class1;
        
        Class expectedFinalClass1 = BigInteger.class;
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expectedFinalClass1, finalClass1));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIsPrimitive7() throws Throwable  {
        ParserConfig parserConfig = ((ParserConfig) createInstance("com.alibaba.fastjson.parser.ParserConfig"));
        Class class1 = Object.class;
        
        boolean actual = parserConfig.isPrimitive(class1);
        
        assertTrue(actual);
        
        Class finalClass1 = class1;
        
        Class expectedFinalClass1 = Long.class;
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expectedFinalClass1, finalClass1));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIsPrimitive8() throws Throwable  {
        ParserConfig parserConfig = ((ParserConfig) createInstance("com.alibaba.fastjson.parser.ParserConfig"));
        Class class1 = Object.class;
        
        boolean actual = parserConfig.isPrimitive(class1);
        
        assertTrue(actual);
        
        Class finalClass1 = class1;
        
        Class expectedFinalClass1 = java.math.BigDecimal.class;
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expectedFinalClass1, finalClass1));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIsPrimitive9() throws Throwable  {
        ParserConfig parserConfig = ((ParserConfig) createInstance("com.alibaba.fastjson.parser.ParserConfig"));
        Class class1 = Object.class;
        
        boolean actual = parserConfig.isPrimitive(class1);
        
        assertTrue(actual);
        
        Class finalClass1 = class1;
        
        Class expectedFinalClass1 = Float.class;
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expectedFinalClass1, finalClass1));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIsPrimitive10() throws Throwable  {
        ParserConfig parserConfig = ((ParserConfig) createInstance("com.alibaba.fastjson.parser.ParserConfig"));
        Class class1 = Object.class;
        
        boolean actual = parserConfig.isPrimitive(class1);
        
        assertTrue(actual);
        
        Class finalClass1 = class1;
        
        Class expectedFinalClass1 = Date.class;
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expectedFinalClass1, finalClass1));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIsPrimitive11() throws Throwable  {
        ParserConfig parserConfig = ((ParserConfig) createInstance("com.alibaba.fastjson.parser.ParserConfig"));
        Class class1 = Object.class;
        
        boolean actual = parserConfig.isPrimitive(class1);
        
        assertTrue(actual);
        
        Class finalClass1 = class1;
        
        Class expectedFinalClass1 = java.sql.Timestamp.class;
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expectedFinalClass1, finalClass1));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIsPrimitive12() throws Throwable  {
        ParserConfig parserConfig = ((ParserConfig) createInstance("com.alibaba.fastjson.parser.ParserConfig"));
        Class class1 = Object.class;
        
        boolean actual = parserConfig.isPrimitive(class1);
        
        assertTrue(actual);
        
        Class finalClass1 = class1;
        
        Class expectedFinalClass1 = Short.class;
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expectedFinalClass1, finalClass1));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIsPrimitive13() throws Throwable  {
        ParserConfig parserConfig = ((ParserConfig) createInstance("com.alibaba.fastjson.parser.ParserConfig"));
        Class class1 = Object.class;
        
        boolean actual = parserConfig.isPrimitive(class1);
        
        assertTrue(actual);
        
        Class finalClass1 = class1;
        
        Class expectedFinalClass1 = Boolean.class;
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expectedFinalClass1, finalClass1));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIsPrimitive14() throws Throwable  {
        ParserConfig parserConfig = ((ParserConfig) createInstance("com.alibaba.fastjson.parser.ParserConfig"));
        Class class1 = Object.class;
        
        boolean actual = parserConfig.isPrimitive(class1);
        
        assertTrue(actual);
        
        Class finalClass1 = class1;
        
        Class expectedFinalClass1 = String.class;
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expectedFinalClass1, finalClass1));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIsPrimitive15() throws Throwable  {
        ParserConfig parserConfig = ((ParserConfig) createInstance("com.alibaba.fastjson.parser.ParserConfig"));
        Class class1 = Object.class;
        
        boolean actual = parserConfig.isPrimitive(class1);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIsPrimitive16() throws Throwable  {
        ParserConfig parserConfig = ((ParserConfig) createInstance("com.alibaba.fastjson.parser.ParserConfig"));
        Class class1 = Object.class;
        
        boolean actual = parserConfig.isPrimitive(class1);
        
        assertTrue(actual);
        
        Class finalClass1 = class1;
        
        Class expectedFinalClass1 = java.sql.Date.class;
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expectedFinalClass1, finalClass1));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIsPrimitive17() throws Throwable  {
        ParserConfig parserConfig = ((ParserConfig) createInstance("com.alibaba.fastjson.parser.ParserConfig"));
        Class class1 = Object.class;
        
        boolean actual = parserConfig.isPrimitive(class1);
        
        assertTrue(actual);
        
        Class finalClass1 = class1;
        
        Class expectedFinalClass1 = Character.class;
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expectedFinalClass1, finalClass1));
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
    
    
    ///region Errors report for getGlobalInstance
    
    public void testGetGlobalInstance_errors1()
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
    
    ///region
    
    @Test(timeout = 10000)
    public void testSplitItemsFormProperty2() throws Throwable  {
        Class parserConfigClazz = Class.forName("com.alibaba.fastjson.parser.ParserConfig");
        Class stringType = Class.forName("java.lang.String");
        Method splitItemsFormPropertyMethod = parserConfigClazz.getDeclaredMethod("splitItemsFormProperty", stringType);
        splitItemsFormPropertyMethod.setAccessible(true);
        java.lang.Object[] splitItemsFormPropertyMethodArguments = new java.lang.Object[1];
        splitItemsFormPropertyMethodArguments[0] = null;
        java.lang.String[] actual = ((java.lang.String[]) splitItemsFormPropertyMethod.invoke(null, splitItemsFormPropertyMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSplitItemsFormProperty3() throws Throwable  {
        String string = new String("");
        
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
    
    ///region
    
    @Test(timeout = 10000)
    public void testSplitItemsFormProperty4() throws Throwable  {
        String string = new String("\u0000");
        
        Class parserConfigClazz = Class.forName("com.alibaba.fastjson.parser.ParserConfig");
        Class stringType = Class.forName("java.lang.String");
        Method splitItemsFormPropertyMethod = parserConfigClazz.getDeclaredMethod("splitItemsFormProperty", stringType);
        splitItemsFormPropertyMethod.setAccessible(true);
        java.lang.Object[] splitItemsFormPropertyMethodArguments = new java.lang.Object[1];
        splitItemsFormPropertyMethodArguments[0] = string;
        java.lang.String[] actual = ((java.lang.String[]) splitItemsFormPropertyMethod.invoke(null, splitItemsFormPropertyMethodArguments));
        
        java.lang.String[] expected = new java.lang.String[1];
        expected[0] = string;
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
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
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIsPrimitive23() throws Throwable  {
        Class class1 = Object.class;
        
        boolean actual = ParserConfig.isPrimitive2(class1);
        
        assertTrue(actual);
        
        Class finalClass1 = class1;
        
        Class expectedFinalClass1 = Character.class;
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expectedFinalClass1, finalClass1));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIsPrimitive24() throws Throwable  {
        Class class1 = Object.class;
        
        boolean actual = ParserConfig.isPrimitive2(class1);
        
        assertTrue(actual);
        
        Class finalClass1 = class1;
        
        Class expectedFinalClass1 = Short.class;
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expectedFinalClass1, finalClass1));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIsPrimitive25() throws Throwable  {
        Class class1 = Object.class;
        
        boolean actual = ParserConfig.isPrimitive2(class1);
        
        assertTrue(actual);
        
        Class finalClass1 = class1;
        
        Class expectedFinalClass1 = Byte.class;
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expectedFinalClass1, finalClass1));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIsPrimitive26() throws Throwable  {
        Class class1 = Object.class;
        
        boolean actual = ParserConfig.isPrimitive2(class1);
        
        assertTrue(actual);
        
        Class finalClass1 = class1;
        
        Class expectedFinalClass1 = Double.class;
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expectedFinalClass1, finalClass1));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIsPrimitive27() throws Throwable  {
        Class class1 = Object.class;
        
        boolean actual = ParserConfig.isPrimitive2(class1);
        
        assertTrue(actual);
        
        Class finalClass1 = class1;
        
        Class expectedFinalClass1 = Long.class;
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expectedFinalClass1, finalClass1));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIsPrimitive28() throws Throwable  {
        Class class1 = Object.class;
        
        boolean actual = ParserConfig.isPrimitive2(class1);
        
        assertTrue(actual);
        
        Class finalClass1 = class1;
        
        Class expectedFinalClass1 = Float.class;
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expectedFinalClass1, finalClass1));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIsPrimitive29() throws Throwable  {
        Class class1 = Object.class;
        
        boolean actual = ParserConfig.isPrimitive2(class1);
        
        assertTrue(actual);
        
        Class finalClass1 = class1;
        
        Class expectedFinalClass1 = String.class;
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expectedFinalClass1, finalClass1));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIsPrimitive210() throws Throwable  {
        Class class1 = Object.class;
        
        boolean actual = ParserConfig.isPrimitive2(class1);
        
        assertTrue(actual);
        
        Class finalClass1 = class1;
        
        Class expectedFinalClass1 = Boolean.class;
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expectedFinalClass1, finalClass1));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIsPrimitive211() throws Throwable  {
        Class class1 = Object.class;
        
        boolean actual = ParserConfig.isPrimitive2(class1);
        
        assertTrue(actual);
        
        Class finalClass1 = class1;
        
        Class expectedFinalClass1 = BigInteger.class;
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expectedFinalClass1, finalClass1));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIsPrimitive212() throws Throwable  {
        Class class1 = Object.class;
        
        boolean actual = ParserConfig.isPrimitive2(class1);
        
        assertTrue(actual);
        
        Class finalClass1 = class1;
        
        Class expectedFinalClass1 = Integer.class;
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expectedFinalClass1, finalClass1));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIsPrimitive213() throws Throwable  {
        Class class1 = Object.class;
        
        boolean actual = ParserConfig.isPrimitive2(class1);
        
        assertTrue(actual);
        
        Class finalClass1 = class1;
        
        Class expectedFinalClass1 = Date.class;
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expectedFinalClass1, finalClass1));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIsPrimitive214() throws Throwable  {
        Class class1 = Object.class;
        
        boolean actual = ParserConfig.isPrimitive2(class1);
        
        assertTrue(actual);
        
        Class finalClass1 = class1;
        
        Class expectedFinalClass1 = java.math.BigDecimal.class;
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expectedFinalClass1, finalClass1));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIsPrimitive215() throws Throwable  {
        Class class1 = Object.class;
        
        boolean actual = ParserConfig.isPrimitive2(class1);
        
        assertTrue(actual);
        
        Class finalClass1 = class1;
        
        Class expectedFinalClass1 = java.sql.Timestamp.class;
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expectedFinalClass1, finalClass1));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIsPrimitive216() throws Throwable  {
        Class class1 = Object.class;
        
        boolean actual = ParserConfig.isPrimitive2(class1);
        
        assertTrue(actual);
        
        Class finalClass1 = class1;
        
        Class expectedFinalClass1 = java.sql.Date.class;
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expectedFinalClass1, finalClass1));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIsPrimitive217() throws Throwable  {
        Class class1 = Object.class;
        
        boolean actual = ParserConfig.isPrimitive2(class1);
        
        assertTrue(actual);
        
        Class finalClass1 = class1;
        
        Class expectedFinalClass1 = java.sql.Time.class;
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expectedFinalClass1, finalClass1));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIsPrimitive218() throws Throwable  {
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
    
    @Test(timeout = 10000)
    public void testParserConfig1() throws Throwable  {
        ASMDeserializerFactory aSMDeserializerFactory = ((ASMDeserializerFactory) createInstance("com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory"));
        ParserConfig actual = new ParserConfig(aSMDeserializerFactory);
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
    public void testParserConfig4() throws Throwable  {
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
    public void testParserConfig5() {
        ParserConfig actual = new ParserConfig();
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
    private static sun.misc.Unsafe getUnsafeInstance() throws Exception {
        java.lang.reflect.Field f = sun.misc.Unsafe.class.getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return (sun.misc.Unsafe) f.get(null);
    }
}
