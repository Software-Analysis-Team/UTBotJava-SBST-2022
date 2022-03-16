package com.alibaba.fastjson.parser;

import org.junit.Test;
import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;
import com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer;
import com.alibaba.fastjson.parser.deserializer.FieldDeserializer;
import com.alibaba.fastjson.util.JavaBeanInfo;
import java.lang.reflect.Constructor;
import com.alibaba.fastjson.util.FieldInfo;
import com.alibaba.fastjson.parser.deserializer.DefaultFieldDeserializer;
import java.lang.reflect.Method;
import com.alibaba.fastjson.util.IdentityHashMap;
import com.alibaba.fastjson.serializer.StringCodec;
import com.alibaba.fastjson.parser.deserializer.MapDeserializer;
import com.alibaba.fastjson.parser.deserializer.NumberDeserializer;
import com.alibaba.fastjson.serializer.MiscCodec;
import com.alibaba.fastjson.serializer.LongCodec;
import com.alibaba.fastjson.serializer.BooleanCodec;
import com.alibaba.fastjson.parser.deserializer.JavaObjectDeserializer;
import com.alibaba.fastjson.serializer.FloatCodec;
import com.alibaba.fastjson.parser.deserializer.JSONPDeserializer;
import com.alibaba.fastjson.serializer.AtomicCodec;
import com.alibaba.fastjson.serializer.CharArrayCodec;
import com.alibaba.fastjson.serializer.BigDecimalCodec;
import com.alibaba.fastjson.serializer.CollectionCodec;
import com.alibaba.fastjson.serializer.IntegerCodec;
import com.alibaba.fastjson.parser.deserializer.SqlDateDeserializer;
import com.alibaba.fastjson.serializer.CalendarCodec;
import com.alibaba.fastjson.serializer.BigIntegerCodec;
import com.alibaba.fastjson.parser.deserializer.TimeDeserializer;
import com.alibaba.fastjson.serializer.CharacterCodec;
import com.alibaba.fastjson.serializer.ReferenceCodec;
import com.alibaba.fastjson.serializer.DateCodec;
import com.alibaba.fastjson.parser.deserializer.StackTraceElementDeserializer;
import java.lang.reflect.Type;
import sun.reflect.generics.reflectiveObjects.WildcardTypeImpl;
import com.alibaba.fastjson.util.ParameterizedTypeImpl;
import java.util.Properties;
import org.springframework.beans.factory.support.ManagedProperties;
import java.util.LinkedHashMap;
import com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import sun.misc.Unsafe;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertFalse;
import static java.lang.reflect.Array.get;

public class ParserConfigTest {
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
    
    @Test(timeout = 10000)
    public void testCreateJavaBeanDeserializer3() throws Throwable  {
        ParserConfig parserConfig = ((ParserConfig) createInstance("com.alibaba.fastjson.parser.ParserConfig"));
        setField(parserConfig, "fieldBased", false);
        setField(parserConfig, "asmEnable", false);
        Class class1 = Object.class;
        
        ObjectDeserializer actual = parserConfig.createJavaBeanDeserializer(class1, null);
        
        JavaBeanDeserializer expected = ((JavaBeanDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer"));
        com.alibaba.fastjson.parser.deserializer.FieldDeserializer[] fieldDeserializerArray = new com.alibaba.fastjson.parser.deserializer.FieldDeserializer[0];
        setField(expected, "fieldDeserializers", fieldDeserializerArray);
        com.alibaba.fastjson.parser.deserializer.FieldDeserializer[] fieldDeserializerArray1 = new com.alibaba.fastjson.parser.deserializer.FieldDeserializer[0];
        setField(expected, "sortedFieldDeserializers", fieldDeserializerArray1);
        setField(expected, "clazz", class1);
        JavaBeanInfo javaBeanInfo = ((JavaBeanInfo) createInstance("com.alibaba.fastjson.util.JavaBeanInfo"));
        setField(javaBeanInfo, "clazz", class1);
        setField(javaBeanInfo, "builderClass", null);
        Constructor constructor = ((Constructor) createInstance("java.lang.reflect.Constructor"));
        setField(constructor, "clazz", class1);
        setField(constructor, "slot", 0);
        java.lang.Class[] classArray = new java.lang.Class[0];
        setField(constructor, "parameterTypes", classArray);
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        setField(constructor, "exceptionTypes", classArray1);
        setField(constructor, "modifiers", 1);
        setField(constructor, "signature", null);
        setField(constructor, "genericInfo", null);
        setField(constructor, "annotations", null);
        setField(constructor, "parameterAnnotations", null);
        setField(constructor, "constructorAccessor", null);
        Constructor constructor1 = ((Constructor) createInstance("java.lang.reflect.Constructor"));
        setField(constructor1, "clazz", class1);
        setField(constructor1, "slot", 0);
        setField(constructor1, "parameterTypes", classArray);
        setField(constructor1, "exceptionTypes", classArray1);
        setField(constructor1, "modifiers", 1);
        setField(constructor1, "signature", null);
        setField(constructor1, "genericInfo", null);
        setField(constructor1, "annotations", null);
        setField(constructor1, "parameterAnnotations", null);
        setField(constructor1, "constructorAccessor", null);
        setField(constructor1, "root", null);
        setField(constructor1, "hasRealParameterData", false);
        setField(constructor1, "parameters", null);
        setField(constructor1, "declaredAnnotations", null);
        setField(constructor1, "override", false);
        setField(constructor1, "securityCheckCache", null);
        setField(constructor, "root", constructor1);
        setField(constructor, "hasRealParameterData", false);
        setField(constructor, "parameters", null);
        setField(constructor, "declaredAnnotations", null);
        setField(constructor, "override", true);
        setField(constructor, "securityCheckCache", null);
        setField(javaBeanInfo, "defaultConstructor", constructor);
        setField(javaBeanInfo, "creatorConstructor", null);
        setField(javaBeanInfo, "factoryMethod", null);
        setField(javaBeanInfo, "buildMethod", null);
        setField(javaBeanInfo, "defaultConstructorParameterSize", 0);
        com.alibaba.fastjson.util.FieldInfo[] fieldInfoArray = new com.alibaba.fastjson.util.FieldInfo[0];
        setField(javaBeanInfo, "fields", fieldInfoArray);
        setField(javaBeanInfo, "sortedFields", fieldInfoArray);
        setField(javaBeanInfo, "parserFeatures", 0);
        setField(javaBeanInfo, "jsonType", null);
        String string = new String("java.lang.Object");
        setField(javaBeanInfo, "typeName", string);
        setField(javaBeanInfo, "typeKey", null);
        setField(javaBeanInfo, "orders", null);
        setField(javaBeanInfo, "creatorConstructorParameterTypes", null);
        setField(javaBeanInfo, "creatorConstructorParameters", null);
        javaBeanInfo.kotlin = false;
        setField(javaBeanInfo, "kotlinDefaultConstructor", null);
        setField(expected, "beanInfo", javaBeanInfo);
        setField(expected, "extraFieldDeserializers", null);
        setField(expected, "alterNameFieldDeserializers", null);
        setField(expected, "smartMatchHashArray", null);
        setField(expected, "smartMatchHashArrayMapping", null);
        setField(expected, "hashArray", null);
        setField(expected, "hashArrayMapping", null);
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
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
        
        parserConfig.createFieldDeserializer(null, null, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateFieldDeserializer3() throws Throwable  {
        ParserConfig parserConfig = ((ParserConfig) createInstance("com.alibaba.fastjson.parser.ParserConfig"));
        JavaBeanInfo javaBeanInfo = ((JavaBeanInfo) createInstance("com.alibaba.fastjson.util.JavaBeanInfo"));
        Class class1 = Object.class;
        setField(javaBeanInfo, "clazz", class1);
        
        parserConfig.createFieldDeserializer(null, javaBeanInfo, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testAddItemsToAccept1() throws Throwable  {
        ParserConfig parserConfig = new ParserConfig();
        java.lang.String[] stringArray = new java.lang.String[0];
        
        Class parserConfigClazz = Class.forName("com.alibaba.fastjson.parser.ParserConfig");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method addItemsToAcceptMethod = parserConfigClazz.getDeclaredMethod("addItemsToAccept", stringArrayType);
        addItemsToAcceptMethod.setAccessible(true);
        java.lang.Object[] addItemsToAcceptMethodArguments = new java.lang.Object[1];
        addItemsToAcceptMethodArguments[0] = ((Object) stringArray);
        addItemsToAcceptMethod.invoke(parserConfig, addItemsToAcceptMethodArguments);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testAddItemsToAccept2() throws Throwable  {
        ParserConfig parserConfig = ((ParserConfig) createInstance("com.alibaba.fastjson.parser.ParserConfig"));
        
        Class parserConfigClazz = Class.forName("com.alibaba.fastjson.parser.ParserConfig");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method addItemsToAcceptMethod = parserConfigClazz.getDeclaredMethod("addItemsToAccept", stringArrayType);
        addItemsToAcceptMethod.setAccessible(true);
        java.lang.Object[] addItemsToAcceptMethodArguments = new java.lang.Object[1];
        addItemsToAcceptMethodArguments[0] = null;
        addItemsToAcceptMethod.invoke(parserConfig, addItemsToAcceptMethodArguments);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testAddItemsToAccept3() throws Throwable  {
        ParserConfig parserConfig = ((ParserConfig) createInstance("com.alibaba.fastjson.parser.ParserConfig"));
        java.lang.String[] stringArray = new java.lang.String[0];
        
        Class parserConfigClazz = Class.forName("com.alibaba.fastjson.parser.ParserConfig");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method addItemsToAcceptMethod = parserConfigClazz.getDeclaredMethod("addItemsToAccept", stringArrayType);
        addItemsToAcceptMethod.setAccessible(true);
        java.lang.Object[] addItemsToAcceptMethodArguments = new java.lang.Object[1];
        addItemsToAcceptMethodArguments[0] = ((Object) stringArray);
        addItemsToAcceptMethod.invoke(parserConfig, addItemsToAcceptMethodArguments);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testAddItemsToAccept4() throws Throwable  {
        ParserConfig parserConfig = ((ParserConfig) createInstance("com.alibaba.fastjson.parser.ParserConfig"));
        java.lang.String[] stringArray = new java.lang.String[9];
        
        String initialStringArray0 = stringArray[0];
        String initialStringArray1 = stringArray[1];
        String initialStringArray2 = stringArray[2];
        String initialStringArray3 = stringArray[3];
        String initialStringArray4 = stringArray[4];
        String initialStringArray5 = stringArray[5];
        String initialStringArray6 = stringArray[6];
        String initialStringArray7 = stringArray[7];
        String initialStringArray8 = stringArray[8];
        
        Class parserConfigClazz = Class.forName("com.alibaba.fastjson.parser.ParserConfig");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method addItemsToAcceptMethod = parserConfigClazz.getDeclaredMethod("addItemsToAccept", stringArrayType);
        addItemsToAcceptMethod.setAccessible(true);
        java.lang.Object[] addItemsToAcceptMethodArguments = new java.lang.Object[1];
        addItemsToAcceptMethodArguments[0] = ((Object) stringArray);
        addItemsToAcceptMethod.invoke(parserConfig, addItemsToAcceptMethodArguments);
        
        String finalStringArray0 = stringArray[0];
        String finalStringArray1 = stringArray[1];
        String finalStringArray2 = stringArray[2];
        String finalStringArray3 = stringArray[3];
        String finalStringArray4 = stringArray[4];
        String finalStringArray5 = stringArray[5];
        String finalStringArray6 = stringArray[6];
        String finalStringArray7 = stringArray[7];
        String finalStringArray8 = stringArray[8];
        
        assertNull(finalStringArray0);
        
        assertNull(finalStringArray1);
        
        assertNull(finalStringArray2);
        
        assertNull(finalStringArray3);
        
        assertNull(finalStringArray4);
        
        assertNull(finalStringArray5);
        
        assertNull(finalStringArray6);
        
        assertNull(finalStringArray7);
        
        assertNull(finalStringArray8);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetAutoTypeSupport1() throws Throwable  {
        ParserConfig parserConfig = new ParserConfig();
        
        parserConfig.setAutoTypeSupport(false);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetAutoTypeSupport2() throws Throwable  {
        ParserConfig parserConfig = ((ParserConfig) createInstance("com.alibaba.fastjson.parser.ParserConfig"));
        setField(parserConfig, "autoTypeSupport", false);
        
        parserConfig.setAutoTypeSupport(false);
    }
    ///endregion
    
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
    public void testIsAsmEnable2() throws Throwable  {
        ParserConfig parserConfig = ((ParserConfig) createInstance("com.alibaba.fastjson.parser.ParserConfig"));
        setField(parserConfig, "asmEnable", false);
        
        boolean actual = parserConfig.isAsmEnable();
        
        assertFalse(actual);
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
        setField(entry, "hashCode", 45023307);
        Class class1 = StringBuffer.class;
        setField(entry, "key", class1);
        StringCodec stringCodec = ((StringCodec) createInstance("com.alibaba.fastjson.serializer.StringCodec"));
        StringCodec.instance = stringCodec;
        setField(entry, "value", stringCodec);
        setField(entry, "next", null);
        entryArray[75] = entry;
        Object entry1 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry1, "hashCode", 1311146128);
        Class class2 = LinkedHashMap.class;
        setField(entry1, "key", class2);
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.MapDeserializer"));
        MapDeserializer.instance = mapDeserializer;
        setField(entry1, "value", mapDeserializer);
        setField(entry1, "next", null);
        entryArray[144] = entry1;
        Object entry2 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry2, "hashCode", 399573350);
        Class class3 = short.class;
        setField(entry2, "key", class3);
        NumberDeserializer numberDeserializer = ((NumberDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.NumberDeserializer"));
        setField(entry2, "value", numberDeserializer);
        setField(entry2, "next", null);
        entryArray[358] = entry2;
        Object entry3 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry3, "hashCode", 1554547125);
        Class class4 = String.class;
        setField(entry3, "key", class4);
        setField(entry3, "value", stringCodec);
        setField(entry3, "next", null);
        entryArray[437] = entry3;
        Object entry4 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry4, "hashCode", 2060468723);
        Class class5 = java.io.File.class;
        setField(entry4, "key", class5);
        MiscCodec miscCodec = ((MiscCodec) createInstance("com.alibaba.fastjson.serializer.MiscCodec"));
        setField(miscCodec, "FILE_RELATIVE_PATH_SUPPORT", false);
        setField(miscCodec, "method_paths_get", null);
        setField(miscCodec, "method_paths_get_error", false);
        setField(entry4, "value", miscCodec);
        setField(entry4, "next", null);
        entryArray[499] = entry4;
        Object entry5 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry5, "hashCode", 664740647);
        Class class6 = double.class;
        setField(entry5, "key", class6);
        setField(entry5, "value", numberDeserializer);
        setField(entry5, "next", null);
        entryArray[807] = entry5;
        Object entry6 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry6, "hashCode", 305808283);
        Class class7 = Long.class;
        setField(entry6, "key", class7);
        LongCodec longCodec = ((LongCodec) createInstance("com.alibaba.fastjson.serializer.LongCodec"));
        LongCodec.instance = longCodec;
        setField(entry6, "value", longCodec);
        setField(entry6, "next", null);
        entryArray[923] = entry6;
        Object entry7 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry7, "hashCode", 65586123);
        Class class8 = java.util.concurrent.atomic.AtomicBoolean.class;
        setField(entry7, "key", class8);
        BooleanCodec booleanCodec = ((BooleanCodec) createInstance("com.alibaba.fastjson.serializer.BooleanCodec"));
        setField(entry7, "value", booleanCodec);
        setField(entry7, "next", null);
        entryArray[971] = entry7;
        Object entry8 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry8, "hashCode", 359023572);
        Class class9 = Short.class;
        setField(entry8, "key", class9);
        setField(entry8, "value", numberDeserializer);
        setField(entry8, "next", null);
        entryArray[980] = entry8;
        Object entry9 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry9, "hashCode", 1961501712);
        Class class10 = java.util.HashMap.class;
        setField(entry9, "key", class10);
        setField(entry9, "value", mapDeserializer);
        setField(entry9, "next", null);
        entryArray[1040] = entry9;
        Object entry10 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry10, "hashCode", 990897274);
        Class class11 = java.net.Inet4Address.class;
        setField(entry10, "key", class11);
        setField(entry10, "value", miscCodec);
        setField(entry10, "next", null);
        entryArray[1146] = entry10;
        Object entry11 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry11, "hashCode", 434398524);
        Class class12 = java.io.Serializable.class;
        setField(entry11, "key", class12);
        JavaObjectDeserializer javaObjectDeserializer = ((JavaObjectDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.JavaObjectDeserializer"));
        setField(entry11, "value", javaObjectDeserializer);
        setField(entry11, "next", null);
        entryArray[1340] = entry11;
        Object entry12 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry12, "hashCode", 146589023);
        Class class13 = java.util.concurrent.ConcurrentHashMap.class;
        setField(entry12, "key", class13);
        setField(entry12, "value", mapDeserializer);
        setField(entry12, "next", null);
        entryArray[1375] = entry12;
        Object entry13 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry13, "hashCode", 523429237);
        Class class14 = float.class;
        setField(entry13, "key", class14);
        FloatCodec floatCodec = ((FloatCodec) createInstance("com.alibaba.fastjson.serializer.FloatCodec"));
        setField(floatCodec, "decimalFormat", null);
        FloatCodec.instance = floatCodec;
        setField(entry13, "value", floatCodec);
        setField(entry13, "next", null);
        entryArray[1397] = entry13;
        Object entry14 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry14, "hashCode", 539690370);
        Class class15 = java.net.Inet6Address.class;
        setField(entry14, "key", class15);
        setField(entry14, "value", miscCodec);
        setField(entry14, "next", null);
        entryArray[1410] = entry14;
        Object entry15 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry15, "hashCode", 1807648168);
        Class class16 = com.alibaba.fastjson.JSONPObject.class;
        setField(entry15, "key", class16);
        JSONPDeserializer jSONPDeserializer = ((JSONPDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.JSONPDeserializer"));
        setField(entry15, "value", jSONPDeserializer);
        setField(entry15, "next", null);
        entryArray[1448] = entry15;
        Object entry16 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry16, "hashCode", 1976804832);
        Class class17 = java.nio.charset.Charset.class;
        setField(entry16, "key", class17);
        setField(entry16, "value", miscCodec);
        setField(entry16, "next", null);
        entryArray[1504] = entry16;
        Object entry17 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry17, "hashCode", 1961002599);
        Class class18 = java.util.concurrent.atomic.AtomicIntegerArray.class;
        setField(entry17, "key", class18);
        AtomicCodec atomicCodec = ((AtomicCodec) createInstance("com.alibaba.fastjson.serializer.AtomicCodec"));
        setField(entry17, "value", atomicCodec);
        setField(entry17, "next", null);
        entryArray[1639] = entry17;
        Object entry18 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry18, "hashCode", 471910020);
        Class class19 = char[].class;
        setField(entry18, "key", class19);
        CharArrayCodec charArrayCodec = ((CharArrayCodec) createInstance("com.alibaba.fastjson.serializer.CharArrayCodec"));
        setField(entry18, "value", charArrayCodec);
        setField(entry18, "next", null);
        entryArray[1668] = entry18;
        Object entry19 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry19, "hashCode", 1392838282);
        Class class20 = long.class;
        setField(entry19, "key", class20);
        setField(entry19, "value", longCodec);
        setField(entry19, "next", null);
        entryArray[1674] = entry19;
        Object entry20 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry20, "hashCode", 2130192211);
        Class class21 = java.util.Currency.class;
        setField(entry20, "key", class21);
        setField(entry20, "value", miscCodec);
        setField(entry20, "next", null);
        entryArray[1875] = entry20;
        Object entry21 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry21, "hashCode", 1991371192);
        Class class22 = java.util.concurrent.ConcurrentMap.class;
        setField(entry21, "key", class22);
        setField(entry21, "value", mapDeserializer);
        setField(entry21, "next", null);
        entryArray[2488] = entry21;
        Object entry22 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry22, "hashCode", 2035616217);
        Class class23 = Cloneable.class;
        setField(entry22, "key", class23);
        setField(entry22, "value", javaObjectDeserializer);
        setField(entry22, "next", null);
        entryArray[2521] = entry22;
        Object entry23 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry23, "hashCode", 2034182655);
        Class class24 = java.math.BigDecimal.class;
        setField(entry23, "key", class24);
        BigDecimalCodec bigDecimalCodec = ((BigDecimalCodec) createInstance("com.alibaba.fastjson.serializer.BigDecimalCodec"));
        setField(entry23, "value", bigDecimalCodec);
        setField(entry23, "next", null);
        entryArray[2559] = entry23;
        Object entry24 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry24, "hashCode", 658532887);
        Class class25 = java.util.Collection.class;
        setField(entry24, "key", class25);
        CollectionCodec collectionCodec = ((CollectionCodec) createInstance("com.alibaba.fastjson.serializer.CollectionCodec"));
        setField(entry24, "value", collectionCodec);
        setField(entry24, "next", null);
        entryArray[2583] = entry24;
        Object entry25 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry25, "hashCode", 1610427175);
        Class class26 = Class.class;
        setField(entry25, "key", class26);
        setField(entry25, "value", miscCodec);
        setField(entry25, "next", null);
        entryArray[2855] = entry25;
        Object entry26 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry26, "hashCode", 2065951873);
        Class class27 = Integer.class;
        setField(entry26, "key", class27);
        IntegerCodec integerCodec = ((IntegerCodec) createInstance("com.alibaba.fastjson.serializer.IntegerCodec"));
        IntegerCodec.instance = integerCodec;
        setField(entry26, "value", integerCodec);
        setField(entry26, "next", null);
        entryArray[3201] = entry26;
        Object entry27 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry27, "hashCode", 617901222);
        Class class28 = Object.class;
        setField(entry27, "key", class28);
        setField(entry27, "value", javaObjectDeserializer);
        setField(entry27, "next", null);
        entryArray[3238] = entry27;
        Object entry28 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry28, "hashCode", 593415583);
        Class class29 = java.net.InetSocketAddress.class;
        setField(entry28, "key", class29);
        setField(entry28, "value", miscCodec);
        setField(entry28, "next", null);
        entryArray[3487] = entry28;
        Object entry29 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry29, "hashCode", 2111991224);
        Class class30 = Double.class;
        setField(entry29, "key", class30);
        setField(entry29, "value", numberDeserializer);
        setField(entry29, "next", null);
        entryArray[3512] = entry29;
        Object entry30 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry30, "hashCode", 1413623320);
        Class class31 = java.util.UUID.class;
        setField(entry30, "key", class31);
        setField(entry30, "value", miscCodec);
        setField(entry30, "next", null);
        entryArray[3608] = entry30;
        Object entry31 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry31, "hashCode", 402009651);
        Class class32 = java.util.TreeMap.class;
        setField(entry31, "key", class32);
        setField(entry31, "value", mapDeserializer);
        setField(entry31, "next", null);
        entryArray[3635] = entry31;
        Object entry32 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry32, "hashCode", 783191662);
        Class class33 = java.sql.Timestamp.class;
        setField(entry32, "key", class33);
        SqlDateDeserializer sqlDateDeserializer = ((SqlDateDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.SqlDateDeserializer"));
        setField(sqlDateDeserializer, "timestamp", true);
        setField(entry32, "value", sqlDateDeserializer);
        setField(entry32, "next", null);
        entryArray[3694] = entry32;
        Object entry33 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry33, "hashCode", 150138649);
        Class class34 = java.sql.Date.class;
        setField(entry33, "key", class34);
        SqlDateDeserializer sqlDateDeserializer1 = ((SqlDateDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.SqlDateDeserializer"));
        setField(sqlDateDeserializer1, "timestamp", false);
        setField(entry33, "value", sqlDateDeserializer1);
        setField(entry33, "next", null);
        entryArray[3865] = entry33;
        Object entry34 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry34, "hashCode", 1489743810);
        Class class35 = java.net.URL.class;
        setField(entry34, "key", class35);
        setField(entry34, "value", miscCodec);
        setField(entry34, "next", null);
        entryArray[4034] = entry34;
        Object entry35 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry35, "hashCode", 1987375157);
        Class class36 = javax.xml.datatype.XMLGregorianCalendar.class;
        setField(entry35, "key", class36);
        CalendarCodec calendarCodec = ((CalendarCodec) createInstance("com.alibaba.fastjson.serializer.CalendarCodec"));
        setField(calendarCodec, "dateFactory", null);
        setField(entry35, "value", calendarCodec);
        setField(entry35, "next", null);
        entryArray[4149] = entry35;
        Object entry36 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry36, "hashCode", 1561063579);
        Class class37 = java.math.BigInteger.class;
        setField(entry36, "key", class37);
        BigIntegerCodec bigIntegerCodec = ((BigIntegerCodec) createInstance("com.alibaba.fastjson.serializer.BigIntegerCodec"));
        setField(entry36, "value", bigIntegerCodec);
        setField(entry36, "next", null);
        entryArray[4251] = entry36;
        Object entry37 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry37, "hashCode", 613298587);
        Class class38 = StringBuilder.class;
        setField(entry37, "key", class38);
        setField(entry37, "value", stringCodec);
        setField(entry37, "next", null);
        entryArray[4507] = entry37;
        Object entry38 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry38, "hashCode", 932172204);
        Class class39 = Boolean.class;
        setField(entry38, "key", class39);
        setField(entry38, "value", booleanCodec);
        setField(entry38, "next", null);
        entryArray[4524] = entry38;
        Object entry39 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry39, "hashCode", 485937598);
        Class class40 = java.util.concurrent.atomic.AtomicLongArray.class;
        setField(entry39, "key", class40);
        setField(entry39, "value", atomicCodec);
        setField(entry39, "next", null);
        entryArray[4542] = entry39;
        Object entry40 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry40, "hashCode", 1703367244);
        Class class41 = java.util.concurrent.atomic.AtomicInteger.class;
        setField(entry40, "key", class41);
        setField(entry40, "value", integerCodec);
        setField(entry40, "next", null);
        entryArray[4684] = entry40;
        Object entry41 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry41, "hashCode", 389993238);
        Class class42 = com.alibaba.fastjson.JSONArray.class;
        setField(entry41, "key", class42);
        setField(entry41, "value", collectionCodec);
        setField(entry41, "next", null);
        entryArray[4886] = entry41;
        Object entry42 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry42, "hashCode", 212628335);
        Class class43 = Byte.class;
        setField(entry42, "key", class43);
        setField(entry42, "value", numberDeserializer);
        setField(entry42, "next", null);
        entryArray[4975] = entry42;
        Object entry43 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry43, "hashCode", 1776374725);
        Class class44 = com.alibaba.fastjson.JSONObject.class;
        setField(entry43, "key", class44);
        setField(entry43, "value", mapDeserializer);
        setField(entry43, "next", null);
        entryArray[5061] = entry43;
        Object entry44 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry44, "hashCode", 480490520);
        Class class45 = java.net.URI.class;
        setField(entry44, "key", class45);
        setField(entry44, "value", miscCodec);
        setField(entry44, "next", null);
        entryArray[5144] = entry44;
        Object entry45 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry45, "hashCode", 1191654595);
        Class class46 = java.sql.Time.class;
        setField(entry45, "key", class46);
        TimeDeserializer timeDeserializer = ((TimeDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.TimeDeserializer"));
        setField(entry45, "value", timeDeserializer);
        setField(entry45, "next", null);
        entryArray[5315] = entry45;
        Object entry46 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry46, "hashCode", 1746572565);
        Class class47 = char.class;
        setField(entry46, "key", class47);
        CharacterCodec characterCodec = ((CharacterCodec) createInstance("com.alibaba.fastjson.serializer.CharacterCodec"));
        setField(entry46, "value", characterCodec);
        setField(entry46, "next", null);
        entryArray[5397] = entry46;
        Object entry47 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry47, "hashCode", 1412601264);
        Class class48 = java.lang.ref.SoftReference.class;
        setField(entry47, "key", class48);
        ReferenceCodec referenceCodec = ((ReferenceCodec) createInstance("com.alibaba.fastjson.serializer.ReferenceCodec"));
        setField(entry47, "value", referenceCodec);
        setField(entry47, "next", null);
        entryArray[5552] = entry47;
        Object entry48 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry48, "hashCode", 754177595);
        Class class49 = java.util.Date.class;
        setField(entry48, "key", class49);
        DateCodec dateCodec = ((DateCodec) createInstance("com.alibaba.fastjson.serializer.DateCodec"));
        setField(entry48, "value", dateCodec);
        setField(entry48, "next", null);
        entryArray[5691] = entry48;
        Object entry49 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry49, "hashCode", 540325452);
        Class class50 = java.util.regex.Pattern.class;
        setField(entry49, "key", class50);
        setField(entry49, "value", miscCodec);
        setField(entry49, "next", null);
        entryArray[5708] = entry49;
        Object entry50 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry50, "hashCode", 1313953385);
        Class class51 = byte.class;
        setField(entry50, "key", class51);
        setField(entry50, "value", numberDeserializer);
        setField(entry50, "next", null);
        entryArray[5737] = entry50;
        Object entry51 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry51, "hashCode", 498931366);
        Class class52 = java.util.concurrent.atomic.AtomicLong.class;
        setField(entry51, "key", class52);
        setField(entry51, "value", longCodec);
        setField(entry51, "next", null);
        entryArray[5798] = entry51;
        Object entry52 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry52, "hashCode", 1363793720);
        Class class53 = java.io.Closeable.class;
        setField(entry52, "key", class53);
        setField(entry52, "value", javaObjectDeserializer);
        setField(entry52, "next", null);
        entryArray[5944] = entry52;
        Object entry53 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry53, "hashCode", 249034932);
        Class class54 = java.util.concurrent.atomic.AtomicReference.class;
        setField(entry53, "key", class54);
        setField(entry53, "value", referenceCodec);
        setField(entry53, "next", null);
        entryArray[6324] = entry53;
        Object entry54 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry54, "hashCode", 1446983876);
        Class class55 = java.lang.ref.WeakReference.class;
        setField(entry54, "key", class55);
        setField(entry54, "value", referenceCodec);
        setField(entry54, "next", null);
        entryArray[6340] = entry54;
        Object entry55 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry55, "hashCode", 1902237905);
        Class class56 = Number.class;
        setField(entry55, "key", class56);
        setField(entry55, "value", numberDeserializer);
        setField(entry55, "next", null);
        entryArray[6353] = entry55;
        Object entry56 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry56, "hashCode", 681842940);
        Class class57 = int.class;
        setField(entry56, "key", class57);
        setField(entry56, "value", integerCodec);
        setField(entry56, "next", null);
        entryArray[6396] = entry56;
        Object entry57 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry57, "hashCode", 932583850);
        Class class58 = Float.class;
        setField(entry57, "key", class58);
        setField(entry57, "value", floatCodec);
        setField(entry57, "next", null);
        entryArray[6570] = entry57;
        Object entry58 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry58, "hashCode", 292641216);
        Class class59 = java.util.TimeZone.class;
        setField(entry58, "key", class59);
        setField(entry58, "value", miscCodec);
        setField(entry58, "next", null);
        entryArray[6592] = entry58;
        Object entry59 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry59, "hashCode", 914504136);
        Class class60 = java.util.Calendar.class;
        setField(entry59, "key", class60);
        setField(entry59, "value", calendarCodec);
        setField(entry59, "next", null);
        entryArray[6600] = entry59;
        Object entry60 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry60, "hashCode", 1042790962);
        Class class61 = java.util.Locale.class;
        setField(entry60, "key", class61);
        setField(entry60, "value", miscCodec);
        setField(entry60, "next", null);
        entryArray[6706] = entry60;
        Object entry61 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry61, "hashCode", 1579572132);
        Class class62 = Character.class;
        setField(entry61, "key", class62);
        setField(entry61, "value", characterCodec);
        setField(entry61, "next", null);
        entryArray[7076] = entry61;
        Object entry62 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry62, "hashCode", 1959910454);
        Class class63 = com.alibaba.fastjson.JSONPath.class;
        setField(entry62, "key", class63);
        setField(entry62, "value", miscCodec);
        setField(entry62, "next", null);
        entryArray[7222] = entry62;
        Object entry63 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry63, "hashCode", 137460818);
        Class class64 = ArrayList.class;
        setField(entry63, "key", class64);
        setField(entry63, "value", collectionCodec);
        setField(entry63, "next", null);
        entryArray[7250] = entry63;
        Object entry64 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry64, "hashCode", 1392794732);
        Class class65 = Comparable.class;
        setField(entry64, "key", class65);
        setField(entry64, "value", javaObjectDeserializer);
        setField(entry64, "next", null);
        entryArray[7276] = entry64;
        Object entry65 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry65, "hashCode", 1265900909);
        Class class66 = java.text.SimpleDateFormat.class;
        setField(entry65, "key", class66);
        setField(entry65, "value", miscCodec);
        setField(entry65, "next", null);
        entryArray[7533] = entry65;
        Object entry66 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry66, "hashCode", 834600351);
        Class class67 = List.class;
        setField(entry66, "key", class67);
        setField(entry66, "value", collectionCodec);
        setField(entry66, "next", null);
        entryArray[7583] = entry66;
        Object entry67 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry67, "hashCode", 634297796);
        Class class68 = Map.class;
        setField(entry67, "key", class68);
        setField(entry67, "value", mapDeserializer);
        setField(entry67, "next", null);
        entryArray[7620] = entry67;
        Object entry68 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry68, "hashCode", 1715248762);
        Class class69 = StackTraceElement.class;
        setField(entry68, "key", class69);
        StackTraceElementDeserializer stackTraceElementDeserializer = ((StackTraceElementDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.StackTraceElementDeserializer"));
        setField(entry68, "value", stackTraceElementDeserializer);
        setField(entry68, "next", null);
        entryArray[7802] = entry68;
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
        IdentityHashMap identityHashMap = ((IdentityHashMap) createInstance("com.alibaba.fastjson.util.IdentityHashMap"));
        setField(parserConfig, "deserializers", identityHashMap);
        
        IdentityHashMap actual = parserConfig.getDerializers();
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(identityHashMap, actual));
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
        setField(entry, "hashCode", 45023307);
        Class class1 = StringBuffer.class;
        setField(entry, "key", class1);
        StringCodec stringCodec = ((StringCodec) createInstance("com.alibaba.fastjson.serializer.StringCodec"));
        StringCodec.instance = stringCodec;
        setField(entry, "value", stringCodec);
        setField(entry, "next", null);
        entryArray[75] = entry;
        Object entry1 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry1, "hashCode", 1311146128);
        Class class2 = LinkedHashMap.class;
        setField(entry1, "key", class2);
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.MapDeserializer"));
        MapDeserializer.instance = mapDeserializer;
        setField(entry1, "value", mapDeserializer);
        setField(entry1, "next", null);
        entryArray[144] = entry1;
        Object entry2 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry2, "hashCode", 399573350);
        Class class3 = short.class;
        setField(entry2, "key", class3);
        NumberDeserializer numberDeserializer = ((NumberDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.NumberDeserializer"));
        setField(entry2, "value", numberDeserializer);
        setField(entry2, "next", null);
        entryArray[358] = entry2;
        Object entry3 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry3, "hashCode", 1554547125);
        Class class4 = String.class;
        setField(entry3, "key", class4);
        setField(entry3, "value", stringCodec);
        setField(entry3, "next", null);
        entryArray[437] = entry3;
        Object entry4 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry4, "hashCode", 2060468723);
        Class class5 = java.io.File.class;
        setField(entry4, "key", class5);
        MiscCodec miscCodec = ((MiscCodec) createInstance("com.alibaba.fastjson.serializer.MiscCodec"));
        setField(miscCodec, "FILE_RELATIVE_PATH_SUPPORT", false);
        setField(miscCodec, "method_paths_get", null);
        setField(miscCodec, "method_paths_get_error", false);
        setField(entry4, "value", miscCodec);
        setField(entry4, "next", null);
        entryArray[499] = entry4;
        Object entry5 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry5, "hashCode", 664740647);
        Class class6 = double.class;
        setField(entry5, "key", class6);
        setField(entry5, "value", numberDeserializer);
        setField(entry5, "next", null);
        entryArray[807] = entry5;
        Object entry6 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry6, "hashCode", 305808283);
        Class class7 = Long.class;
        setField(entry6, "key", class7);
        LongCodec longCodec = ((LongCodec) createInstance("com.alibaba.fastjson.serializer.LongCodec"));
        LongCodec.instance = longCodec;
        setField(entry6, "value", longCodec);
        setField(entry6, "next", null);
        entryArray[923] = entry6;
        Object entry7 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry7, "hashCode", 65586123);
        Class class8 = java.util.concurrent.atomic.AtomicBoolean.class;
        setField(entry7, "key", class8);
        BooleanCodec booleanCodec = ((BooleanCodec) createInstance("com.alibaba.fastjson.serializer.BooleanCodec"));
        setField(entry7, "value", booleanCodec);
        setField(entry7, "next", null);
        entryArray[971] = entry7;
        Object entry8 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry8, "hashCode", 359023572);
        Class class9 = Short.class;
        setField(entry8, "key", class9);
        setField(entry8, "value", numberDeserializer);
        setField(entry8, "next", null);
        entryArray[980] = entry8;
        Object entry9 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry9, "hashCode", 1961501712);
        Class class10 = java.util.HashMap.class;
        setField(entry9, "key", class10);
        setField(entry9, "value", mapDeserializer);
        setField(entry9, "next", null);
        entryArray[1040] = entry9;
        Object entry10 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry10, "hashCode", 990897274);
        Class class11 = java.net.Inet4Address.class;
        setField(entry10, "key", class11);
        setField(entry10, "value", miscCodec);
        setField(entry10, "next", null);
        entryArray[1146] = entry10;
        Object entry11 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry11, "hashCode", 434398524);
        Class class12 = java.io.Serializable.class;
        setField(entry11, "key", class12);
        JavaObjectDeserializer javaObjectDeserializer = ((JavaObjectDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.JavaObjectDeserializer"));
        setField(entry11, "value", javaObjectDeserializer);
        setField(entry11, "next", null);
        entryArray[1340] = entry11;
        Object entry12 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry12, "hashCode", 146589023);
        Class class13 = java.util.concurrent.ConcurrentHashMap.class;
        setField(entry12, "key", class13);
        setField(entry12, "value", mapDeserializer);
        setField(entry12, "next", null);
        entryArray[1375] = entry12;
        Object entry13 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry13, "hashCode", 523429237);
        Class class14 = float.class;
        setField(entry13, "key", class14);
        FloatCodec floatCodec = ((FloatCodec) createInstance("com.alibaba.fastjson.serializer.FloatCodec"));
        setField(floatCodec, "decimalFormat", null);
        FloatCodec.instance = floatCodec;
        setField(entry13, "value", floatCodec);
        setField(entry13, "next", null);
        entryArray[1397] = entry13;
        Object entry14 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry14, "hashCode", 539690370);
        Class class15 = java.net.Inet6Address.class;
        setField(entry14, "key", class15);
        setField(entry14, "value", miscCodec);
        setField(entry14, "next", null);
        entryArray[1410] = entry14;
        Object entry15 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry15, "hashCode", 1807648168);
        Class class16 = com.alibaba.fastjson.JSONPObject.class;
        setField(entry15, "key", class16);
        JSONPDeserializer jSONPDeserializer = ((JSONPDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.JSONPDeserializer"));
        setField(entry15, "value", jSONPDeserializer);
        setField(entry15, "next", null);
        entryArray[1448] = entry15;
        Object entry16 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry16, "hashCode", 1976804832);
        Class class17 = java.nio.charset.Charset.class;
        setField(entry16, "key", class17);
        setField(entry16, "value", miscCodec);
        setField(entry16, "next", null);
        entryArray[1504] = entry16;
        Object entry17 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry17, "hashCode", 1961002599);
        Class class18 = java.util.concurrent.atomic.AtomicIntegerArray.class;
        setField(entry17, "key", class18);
        AtomicCodec atomicCodec = ((AtomicCodec) createInstance("com.alibaba.fastjson.serializer.AtomicCodec"));
        setField(entry17, "value", atomicCodec);
        setField(entry17, "next", null);
        entryArray[1639] = entry17;
        Object entry18 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry18, "hashCode", 471910020);
        Class class19 = char[].class;
        setField(entry18, "key", class19);
        CharArrayCodec charArrayCodec = ((CharArrayCodec) createInstance("com.alibaba.fastjson.serializer.CharArrayCodec"));
        setField(entry18, "value", charArrayCodec);
        setField(entry18, "next", null);
        entryArray[1668] = entry18;
        Object entry19 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry19, "hashCode", 1392838282);
        Class class20 = long.class;
        setField(entry19, "key", class20);
        setField(entry19, "value", longCodec);
        setField(entry19, "next", null);
        entryArray[1674] = entry19;
        Object entry20 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry20, "hashCode", 2130192211);
        Class class21 = java.util.Currency.class;
        setField(entry20, "key", class21);
        setField(entry20, "value", miscCodec);
        setField(entry20, "next", null);
        entryArray[1875] = entry20;
        Object entry21 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry21, "hashCode", 1991371192);
        Class class22 = java.util.concurrent.ConcurrentMap.class;
        setField(entry21, "key", class22);
        setField(entry21, "value", mapDeserializer);
        setField(entry21, "next", null);
        entryArray[2488] = entry21;
        Object entry22 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry22, "hashCode", 2035616217);
        Class class23 = Cloneable.class;
        setField(entry22, "key", class23);
        setField(entry22, "value", javaObjectDeserializer);
        setField(entry22, "next", null);
        entryArray[2521] = entry22;
        Object entry23 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry23, "hashCode", 2034182655);
        Class class24 = java.math.BigDecimal.class;
        setField(entry23, "key", class24);
        BigDecimalCodec bigDecimalCodec = ((BigDecimalCodec) createInstance("com.alibaba.fastjson.serializer.BigDecimalCodec"));
        setField(entry23, "value", bigDecimalCodec);
        setField(entry23, "next", null);
        entryArray[2559] = entry23;
        Object entry24 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry24, "hashCode", 658532887);
        Class class25 = java.util.Collection.class;
        setField(entry24, "key", class25);
        CollectionCodec collectionCodec = ((CollectionCodec) createInstance("com.alibaba.fastjson.serializer.CollectionCodec"));
        setField(entry24, "value", collectionCodec);
        setField(entry24, "next", null);
        entryArray[2583] = entry24;
        Object entry25 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry25, "hashCode", 1610427175);
        Class class26 = Class.class;
        setField(entry25, "key", class26);
        setField(entry25, "value", miscCodec);
        setField(entry25, "next", null);
        entryArray[2855] = entry25;
        Object entry26 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry26, "hashCode", 2065951873);
        Class class27 = Integer.class;
        setField(entry26, "key", class27);
        IntegerCodec integerCodec = ((IntegerCodec) createInstance("com.alibaba.fastjson.serializer.IntegerCodec"));
        IntegerCodec.instance = integerCodec;
        setField(entry26, "value", integerCodec);
        setField(entry26, "next", null);
        entryArray[3201] = entry26;
        Object entry27 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry27, "hashCode", 617901222);
        Class class28 = Object.class;
        setField(entry27, "key", class28);
        setField(entry27, "value", javaObjectDeserializer);
        setField(entry27, "next", null);
        entryArray[3238] = entry27;
        Object entry28 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry28, "hashCode", 593415583);
        Class class29 = java.net.InetSocketAddress.class;
        setField(entry28, "key", class29);
        setField(entry28, "value", miscCodec);
        setField(entry28, "next", null);
        entryArray[3487] = entry28;
        Object entry29 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry29, "hashCode", 2111991224);
        Class class30 = Double.class;
        setField(entry29, "key", class30);
        setField(entry29, "value", numberDeserializer);
        setField(entry29, "next", null);
        entryArray[3512] = entry29;
        Object entry30 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry30, "hashCode", 1413623320);
        Class class31 = java.util.UUID.class;
        setField(entry30, "key", class31);
        setField(entry30, "value", miscCodec);
        setField(entry30, "next", null);
        entryArray[3608] = entry30;
        Object entry31 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry31, "hashCode", 402009651);
        Class class32 = java.util.TreeMap.class;
        setField(entry31, "key", class32);
        setField(entry31, "value", mapDeserializer);
        setField(entry31, "next", null);
        entryArray[3635] = entry31;
        Object entry32 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry32, "hashCode", 783191662);
        Class class33 = java.sql.Timestamp.class;
        setField(entry32, "key", class33);
        SqlDateDeserializer sqlDateDeserializer = ((SqlDateDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.SqlDateDeserializer"));
        setField(sqlDateDeserializer, "timestamp", true);
        setField(entry32, "value", sqlDateDeserializer);
        setField(entry32, "next", null);
        entryArray[3694] = entry32;
        Object entry33 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry33, "hashCode", 150138649);
        Class class34 = java.sql.Date.class;
        setField(entry33, "key", class34);
        SqlDateDeserializer sqlDateDeserializer1 = ((SqlDateDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.SqlDateDeserializer"));
        setField(sqlDateDeserializer1, "timestamp", false);
        setField(entry33, "value", sqlDateDeserializer1);
        setField(entry33, "next", null);
        entryArray[3865] = entry33;
        Object entry34 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry34, "hashCode", 1489743810);
        Class class35 = java.net.URL.class;
        setField(entry34, "key", class35);
        setField(entry34, "value", miscCodec);
        setField(entry34, "next", null);
        entryArray[4034] = entry34;
        Object entry35 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry35, "hashCode", 1987375157);
        Class class36 = javax.xml.datatype.XMLGregorianCalendar.class;
        setField(entry35, "key", class36);
        CalendarCodec calendarCodec = ((CalendarCodec) createInstance("com.alibaba.fastjson.serializer.CalendarCodec"));
        setField(calendarCodec, "dateFactory", null);
        setField(entry35, "value", calendarCodec);
        setField(entry35, "next", null);
        entryArray[4149] = entry35;
        Object entry36 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry36, "hashCode", 1561063579);
        Class class37 = java.math.BigInteger.class;
        setField(entry36, "key", class37);
        BigIntegerCodec bigIntegerCodec = ((BigIntegerCodec) createInstance("com.alibaba.fastjson.serializer.BigIntegerCodec"));
        setField(entry36, "value", bigIntegerCodec);
        setField(entry36, "next", null);
        entryArray[4251] = entry36;
        Object entry37 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry37, "hashCode", 613298587);
        Class class38 = StringBuilder.class;
        setField(entry37, "key", class38);
        setField(entry37, "value", stringCodec);
        setField(entry37, "next", null);
        entryArray[4507] = entry37;
        Object entry38 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry38, "hashCode", 932172204);
        Class class39 = Boolean.class;
        setField(entry38, "key", class39);
        setField(entry38, "value", booleanCodec);
        setField(entry38, "next", null);
        entryArray[4524] = entry38;
        Object entry39 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry39, "hashCode", 485937598);
        Class class40 = java.util.concurrent.atomic.AtomicLongArray.class;
        setField(entry39, "key", class40);
        setField(entry39, "value", atomicCodec);
        setField(entry39, "next", null);
        entryArray[4542] = entry39;
        Object entry40 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry40, "hashCode", 1703367244);
        Class class41 = java.util.concurrent.atomic.AtomicInteger.class;
        setField(entry40, "key", class41);
        setField(entry40, "value", integerCodec);
        setField(entry40, "next", null);
        entryArray[4684] = entry40;
        Object entry41 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry41, "hashCode", 389993238);
        Class class42 = com.alibaba.fastjson.JSONArray.class;
        setField(entry41, "key", class42);
        setField(entry41, "value", collectionCodec);
        setField(entry41, "next", null);
        entryArray[4886] = entry41;
        Object entry42 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry42, "hashCode", 212628335);
        Class class43 = Byte.class;
        setField(entry42, "key", class43);
        setField(entry42, "value", numberDeserializer);
        setField(entry42, "next", null);
        entryArray[4975] = entry42;
        Object entry43 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry43, "hashCode", 1776374725);
        Class class44 = com.alibaba.fastjson.JSONObject.class;
        setField(entry43, "key", class44);
        setField(entry43, "value", mapDeserializer);
        setField(entry43, "next", null);
        entryArray[5061] = entry43;
        Object entry44 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry44, "hashCode", 480490520);
        Class class45 = java.net.URI.class;
        setField(entry44, "key", class45);
        setField(entry44, "value", miscCodec);
        setField(entry44, "next", null);
        entryArray[5144] = entry44;
        Object entry45 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry45, "hashCode", 1191654595);
        Class class46 = java.sql.Time.class;
        setField(entry45, "key", class46);
        TimeDeserializer timeDeserializer = ((TimeDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.TimeDeserializer"));
        setField(entry45, "value", timeDeserializer);
        setField(entry45, "next", null);
        entryArray[5315] = entry45;
        Object entry46 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry46, "hashCode", 1746572565);
        Class class47 = char.class;
        setField(entry46, "key", class47);
        CharacterCodec characterCodec = ((CharacterCodec) createInstance("com.alibaba.fastjson.serializer.CharacterCodec"));
        setField(entry46, "value", characterCodec);
        setField(entry46, "next", null);
        entryArray[5397] = entry46;
        Object entry47 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry47, "hashCode", 1412601264);
        Class class48 = java.lang.ref.SoftReference.class;
        setField(entry47, "key", class48);
        ReferenceCodec referenceCodec = ((ReferenceCodec) createInstance("com.alibaba.fastjson.serializer.ReferenceCodec"));
        setField(entry47, "value", referenceCodec);
        setField(entry47, "next", null);
        entryArray[5552] = entry47;
        Object entry48 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry48, "hashCode", 754177595);
        Class class49 = java.util.Date.class;
        setField(entry48, "key", class49);
        DateCodec dateCodec = ((DateCodec) createInstance("com.alibaba.fastjson.serializer.DateCodec"));
        setField(entry48, "value", dateCodec);
        setField(entry48, "next", null);
        entryArray[5691] = entry48;
        Object entry49 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry49, "hashCode", 540325452);
        Class class50 = java.util.regex.Pattern.class;
        setField(entry49, "key", class50);
        setField(entry49, "value", miscCodec);
        setField(entry49, "next", null);
        entryArray[5708] = entry49;
        Object entry50 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry50, "hashCode", 1313953385);
        Class class51 = byte.class;
        setField(entry50, "key", class51);
        setField(entry50, "value", numberDeserializer);
        setField(entry50, "next", null);
        entryArray[5737] = entry50;
        Object entry51 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry51, "hashCode", 498931366);
        Class class52 = java.util.concurrent.atomic.AtomicLong.class;
        setField(entry51, "key", class52);
        setField(entry51, "value", longCodec);
        setField(entry51, "next", null);
        entryArray[5798] = entry51;
        Object entry52 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry52, "hashCode", 1363793720);
        Class class53 = java.io.Closeable.class;
        setField(entry52, "key", class53);
        setField(entry52, "value", javaObjectDeserializer);
        setField(entry52, "next", null);
        entryArray[5944] = entry52;
        Object entry53 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry53, "hashCode", 249034932);
        Class class54 = java.util.concurrent.atomic.AtomicReference.class;
        setField(entry53, "key", class54);
        setField(entry53, "value", referenceCodec);
        setField(entry53, "next", null);
        entryArray[6324] = entry53;
        Object entry54 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry54, "hashCode", 1446983876);
        Class class55 = java.lang.ref.WeakReference.class;
        setField(entry54, "key", class55);
        setField(entry54, "value", referenceCodec);
        setField(entry54, "next", null);
        entryArray[6340] = entry54;
        Object entry55 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry55, "hashCode", 1902237905);
        Class class56 = Number.class;
        setField(entry55, "key", class56);
        setField(entry55, "value", numberDeserializer);
        setField(entry55, "next", null);
        entryArray[6353] = entry55;
        Object entry56 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry56, "hashCode", 681842940);
        Class class57 = int.class;
        setField(entry56, "key", class57);
        setField(entry56, "value", integerCodec);
        setField(entry56, "next", null);
        entryArray[6396] = entry56;
        Object entry57 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry57, "hashCode", 932583850);
        Class class58 = Float.class;
        setField(entry57, "key", class58);
        setField(entry57, "value", floatCodec);
        setField(entry57, "next", null);
        entryArray[6570] = entry57;
        Object entry58 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry58, "hashCode", 292641216);
        Class class59 = java.util.TimeZone.class;
        setField(entry58, "key", class59);
        setField(entry58, "value", miscCodec);
        setField(entry58, "next", null);
        entryArray[6592] = entry58;
        Object entry59 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry59, "hashCode", 914504136);
        Class class60 = java.util.Calendar.class;
        setField(entry59, "key", class60);
        setField(entry59, "value", calendarCodec);
        setField(entry59, "next", null);
        entryArray[6600] = entry59;
        Object entry60 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry60, "hashCode", 1042790962);
        Class class61 = java.util.Locale.class;
        setField(entry60, "key", class61);
        setField(entry60, "value", miscCodec);
        setField(entry60, "next", null);
        entryArray[6706] = entry60;
        Object entry61 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry61, "hashCode", 1579572132);
        Class class62 = Character.class;
        setField(entry61, "key", class62);
        setField(entry61, "value", characterCodec);
        setField(entry61, "next", null);
        entryArray[7076] = entry61;
        Object entry62 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry62, "hashCode", 1959910454);
        Class class63 = com.alibaba.fastjson.JSONPath.class;
        setField(entry62, "key", class63);
        setField(entry62, "value", miscCodec);
        setField(entry62, "next", null);
        entryArray[7222] = entry62;
        Object entry63 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry63, "hashCode", 137460818);
        Class class64 = ArrayList.class;
        setField(entry63, "key", class64);
        setField(entry63, "value", collectionCodec);
        setField(entry63, "next", null);
        entryArray[7250] = entry63;
        Object entry64 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry64, "hashCode", 1392794732);
        Class class65 = Comparable.class;
        setField(entry64, "key", class65);
        setField(entry64, "value", javaObjectDeserializer);
        setField(entry64, "next", null);
        entryArray[7276] = entry64;
        Object entry65 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry65, "hashCode", 1265900909);
        Class class66 = java.text.SimpleDateFormat.class;
        setField(entry65, "key", class66);
        setField(entry65, "value", miscCodec);
        setField(entry65, "next", null);
        entryArray[7533] = entry65;
        Object entry66 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry66, "hashCode", 834600351);
        Class class67 = List.class;
        setField(entry66, "key", class67);
        setField(entry66, "value", collectionCodec);
        setField(entry66, "next", null);
        entryArray[7583] = entry66;
        Object entry67 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry67, "hashCode", 634297796);
        Class class68 = Map.class;
        setField(entry67, "key", class68);
        setField(entry67, "value", mapDeserializer);
        setField(entry67, "next", null);
        entryArray[7620] = entry67;
        Object entry68 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry68, "hashCode", 1715248762);
        Class class69 = StackTraceElement.class;
        setField(entry68, "key", class69);
        StackTraceElementDeserializer stackTraceElementDeserializer = ((StackTraceElementDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.StackTraceElementDeserializer"));
        setField(entry68, "value", stackTraceElementDeserializer);
        setField(entry68, "next", null);
        entryArray[7802] = entry68;
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
        IdentityHashMap identityHashMap = ((IdentityHashMap) createInstance("com.alibaba.fastjson.util.IdentityHashMap"));
        setField(parserConfig, "deserializers", identityHashMap);
        
        IdentityHashMap actual = parserConfig.getDeserializers();
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(identityHashMap, actual));
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
    
    @Test(timeout = 10000)
    public void testGetDeserializer2() throws Throwable  {
        ParserConfig parserConfig = ((ParserConfig) createInstance("com.alibaba.fastjson.parser.ParserConfig"));
        IdentityHashMap identityHashMap = ((IdentityHashMap) createInstance("com.alibaba.fastjson.util.IdentityHashMap"));
        setField(identityHashMap, "indexMask", 38);
        java.lang.Object[] entryArray = createArray("com.alibaba.fastjson.util.IdentityHashMap$Entry", 39);
        setField(identityHashMap, "buckets", entryArray);
        setField(parserConfig, "deserializers", identityHashMap);
        WildcardTypeImpl wildcardTypeImpl = ((WildcardTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.WildcardTypeImpl"));
        java.lang.reflect.Type[] typeArray = new java.lang.reflect.Type[0];
        setField(wildcardTypeImpl, "upperBounds", typeArray);
        
        Object parserConfigDeserializers = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializersDeserializersBuckets = getFieldValue(parserConfigDeserializers, "buckets");
        Object initialParserConfigDeserializersBuckets0 = get(parserConfigDeserializersDeserializersBuckets, 0);
        Object parserConfigDeserializers1 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers1DeserializersBuckets = getFieldValue(parserConfigDeserializers1, "buckets");
        Object initialParserConfigDeserializersBuckets1 = get(parserConfigDeserializers1DeserializersBuckets, 1);
        Object parserConfigDeserializers2 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers2DeserializersBuckets = getFieldValue(parserConfigDeserializers2, "buckets");
        Object initialParserConfigDeserializersBuckets2 = get(parserConfigDeserializers2DeserializersBuckets, 2);
        Object parserConfigDeserializers3 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers3DeserializersBuckets = getFieldValue(parserConfigDeserializers3, "buckets");
        Object initialParserConfigDeserializersBuckets3 = get(parserConfigDeserializers3DeserializersBuckets, 3);
        Object parserConfigDeserializers4 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers4DeserializersBuckets = getFieldValue(parserConfigDeserializers4, "buckets");
        Object initialParserConfigDeserializersBuckets4 = get(parserConfigDeserializers4DeserializersBuckets, 4);
        Object parserConfigDeserializers5 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers5DeserializersBuckets = getFieldValue(parserConfigDeserializers5, "buckets");
        Object initialParserConfigDeserializersBuckets5 = get(parserConfigDeserializers5DeserializersBuckets, 5);
        Object parserConfigDeserializers6 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers6DeserializersBuckets = getFieldValue(parserConfigDeserializers6, "buckets");
        Object initialParserConfigDeserializersBuckets6 = get(parserConfigDeserializers6DeserializersBuckets, 6);
        Object parserConfigDeserializers7 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers7DeserializersBuckets = getFieldValue(parserConfigDeserializers7, "buckets");
        Object initialParserConfigDeserializersBuckets7 = get(parserConfigDeserializers7DeserializersBuckets, 7);
        Object parserConfigDeserializers8 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers8DeserializersBuckets = getFieldValue(parserConfigDeserializers8, "buckets");
        Object initialParserConfigDeserializersBuckets8 = get(parserConfigDeserializers8DeserializersBuckets, 8);
        Object parserConfigDeserializers9 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers9DeserializersBuckets = getFieldValue(parserConfigDeserializers9, "buckets");
        Object initialParserConfigDeserializersBuckets9 = get(parserConfigDeserializers9DeserializersBuckets, 9);
        Object parserConfigDeserializers10 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers10DeserializersBuckets = getFieldValue(parserConfigDeserializers10, "buckets");
        Object initialParserConfigDeserializersBuckets10 = get(parserConfigDeserializers10DeserializersBuckets, 10);
        Object parserConfigDeserializers11 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers11DeserializersBuckets = getFieldValue(parserConfigDeserializers11, "buckets");
        Object initialParserConfigDeserializersBuckets11 = get(parserConfigDeserializers11DeserializersBuckets, 11);
        Object parserConfigDeserializers12 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers12DeserializersBuckets = getFieldValue(parserConfigDeserializers12, "buckets");
        Object initialParserConfigDeserializersBuckets12 = get(parserConfigDeserializers12DeserializersBuckets, 12);
        Object parserConfigDeserializers13 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers13DeserializersBuckets = getFieldValue(parserConfigDeserializers13, "buckets");
        Object initialParserConfigDeserializersBuckets13 = get(parserConfigDeserializers13DeserializersBuckets, 13);
        Object parserConfigDeserializers14 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers14DeserializersBuckets = getFieldValue(parserConfigDeserializers14, "buckets");
        Object initialParserConfigDeserializersBuckets14 = get(parserConfigDeserializers14DeserializersBuckets, 14);
        Object parserConfigDeserializers15 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers15DeserializersBuckets = getFieldValue(parserConfigDeserializers15, "buckets");
        Object initialParserConfigDeserializersBuckets15 = get(parserConfigDeserializers15DeserializersBuckets, 15);
        Object parserConfigDeserializers16 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers16DeserializersBuckets = getFieldValue(parserConfigDeserializers16, "buckets");
        Object initialParserConfigDeserializersBuckets16 = get(parserConfigDeserializers16DeserializersBuckets, 16);
        Object parserConfigDeserializers17 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers17DeserializersBuckets = getFieldValue(parserConfigDeserializers17, "buckets");
        Object initialParserConfigDeserializersBuckets17 = get(parserConfigDeserializers17DeserializersBuckets, 17);
        Object parserConfigDeserializers18 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers18DeserializersBuckets = getFieldValue(parserConfigDeserializers18, "buckets");
        Object initialParserConfigDeserializersBuckets18 = get(parserConfigDeserializers18DeserializersBuckets, 18);
        Object parserConfigDeserializers19 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers19DeserializersBuckets = getFieldValue(parserConfigDeserializers19, "buckets");
        Object initialParserConfigDeserializersBuckets19 = get(parserConfigDeserializers19DeserializersBuckets, 19);
        Object parserConfigDeserializers20 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers20DeserializersBuckets = getFieldValue(parserConfigDeserializers20, "buckets");
        Object initialParserConfigDeserializersBuckets20 = get(parserConfigDeserializers20DeserializersBuckets, 20);
        Object parserConfigDeserializers21 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers21DeserializersBuckets = getFieldValue(parserConfigDeserializers21, "buckets");
        Object initialParserConfigDeserializersBuckets21 = get(parserConfigDeserializers21DeserializersBuckets, 21);
        Object parserConfigDeserializers22 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers22DeserializersBuckets = getFieldValue(parserConfigDeserializers22, "buckets");
        Object initialParserConfigDeserializersBuckets22 = get(parserConfigDeserializers22DeserializersBuckets, 22);
        Object parserConfigDeserializers23 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers23DeserializersBuckets = getFieldValue(parserConfigDeserializers23, "buckets");
        Object initialParserConfigDeserializersBuckets23 = get(parserConfigDeserializers23DeserializersBuckets, 23);
        Object parserConfigDeserializers24 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers24DeserializersBuckets = getFieldValue(parserConfigDeserializers24, "buckets");
        Object initialParserConfigDeserializersBuckets24 = get(parserConfigDeserializers24DeserializersBuckets, 24);
        Object parserConfigDeserializers25 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers25DeserializersBuckets = getFieldValue(parserConfigDeserializers25, "buckets");
        Object initialParserConfigDeserializersBuckets25 = get(parserConfigDeserializers25DeserializersBuckets, 25);
        Object parserConfigDeserializers26 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers26DeserializersBuckets = getFieldValue(parserConfigDeserializers26, "buckets");
        Object initialParserConfigDeserializersBuckets26 = get(parserConfigDeserializers26DeserializersBuckets, 26);
        Object parserConfigDeserializers27 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers27DeserializersBuckets = getFieldValue(parserConfigDeserializers27, "buckets");
        Object initialParserConfigDeserializersBuckets27 = get(parserConfigDeserializers27DeserializersBuckets, 27);
        Object parserConfigDeserializers28 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers28DeserializersBuckets = getFieldValue(parserConfigDeserializers28, "buckets");
        Object initialParserConfigDeserializersBuckets28 = get(parserConfigDeserializers28DeserializersBuckets, 28);
        Object parserConfigDeserializers29 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers29DeserializersBuckets = getFieldValue(parserConfigDeserializers29, "buckets");
        Object initialParserConfigDeserializersBuckets29 = get(parserConfigDeserializers29DeserializersBuckets, 29);
        Object parserConfigDeserializers30 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers30DeserializersBuckets = getFieldValue(parserConfigDeserializers30, "buckets");
        Object initialParserConfigDeserializersBuckets30 = get(parserConfigDeserializers30DeserializersBuckets, 30);
        Object parserConfigDeserializers31 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers31DeserializersBuckets = getFieldValue(parserConfigDeserializers31, "buckets");
        Object initialParserConfigDeserializersBuckets31 = get(parserConfigDeserializers31DeserializersBuckets, 31);
        Object parserConfigDeserializers32 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers32DeserializersBuckets = getFieldValue(parserConfigDeserializers32, "buckets");
        Object initialParserConfigDeserializersBuckets32 = get(parserConfigDeserializers32DeserializersBuckets, 32);
        Object parserConfigDeserializers33 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers33DeserializersBuckets = getFieldValue(parserConfigDeserializers33, "buckets");
        Object initialParserConfigDeserializersBuckets33 = get(parserConfigDeserializers33DeserializersBuckets, 33);
        Object parserConfigDeserializers34 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers34DeserializersBuckets = getFieldValue(parserConfigDeserializers34, "buckets");
        Object initialParserConfigDeserializersBuckets34 = get(parserConfigDeserializers34DeserializersBuckets, 34);
        Object parserConfigDeserializers35 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers35DeserializersBuckets = getFieldValue(parserConfigDeserializers35, "buckets");
        Object initialParserConfigDeserializersBuckets35 = get(parserConfigDeserializers35DeserializersBuckets, 35);
        Object parserConfigDeserializers36 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers36DeserializersBuckets = getFieldValue(parserConfigDeserializers36, "buckets");
        Object initialParserConfigDeserializersBuckets36 = get(parserConfigDeserializers36DeserializersBuckets, 36);
        Object parserConfigDeserializers37 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers37DeserializersBuckets = getFieldValue(parserConfigDeserializers37, "buckets");
        Object initialParserConfigDeserializersBuckets37 = get(parserConfigDeserializers37DeserializersBuckets, 37);
        Object parserConfigDeserializers38 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers38DeserializersBuckets = getFieldValue(parserConfigDeserializers38, "buckets");
        Object initialParserConfigDeserializersBuckets38 = get(parserConfigDeserializers38DeserializersBuckets, 38);
        
        ObjectDeserializer actual = parserConfig.getDeserializer(wildcardTypeImpl);
        
        JavaObjectDeserializer expected = ((JavaObjectDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.JavaObjectDeserializer"));
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
        
        Object parserConfigDeserializers39 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers39DeserializersBuckets = getFieldValue(parserConfigDeserializers39, "buckets");
        Object finalParserConfigDeserializersBuckets0 = get(parserConfigDeserializers39DeserializersBuckets, 0);
        Object parserConfigDeserializers40 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers40DeserializersBuckets = getFieldValue(parserConfigDeserializers40, "buckets");
        Object finalParserConfigDeserializersBuckets1 = get(parserConfigDeserializers40DeserializersBuckets, 1);
        Object parserConfigDeserializers41 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers41DeserializersBuckets = getFieldValue(parserConfigDeserializers41, "buckets");
        Object finalParserConfigDeserializersBuckets2 = get(parserConfigDeserializers41DeserializersBuckets, 2);
        Object parserConfigDeserializers42 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers42DeserializersBuckets = getFieldValue(parserConfigDeserializers42, "buckets");
        Object finalParserConfigDeserializersBuckets3 = get(parserConfigDeserializers42DeserializersBuckets, 3);
        Object parserConfigDeserializers43 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers43DeserializersBuckets = getFieldValue(parserConfigDeserializers43, "buckets");
        Object finalParserConfigDeserializersBuckets4 = get(parserConfigDeserializers43DeserializersBuckets, 4);
        Object parserConfigDeserializers44 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers44DeserializersBuckets = getFieldValue(parserConfigDeserializers44, "buckets");
        Object finalParserConfigDeserializersBuckets5 = get(parserConfigDeserializers44DeserializersBuckets, 5);
        Object parserConfigDeserializers45 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers45DeserializersBuckets = getFieldValue(parserConfigDeserializers45, "buckets");
        Object finalParserConfigDeserializersBuckets6 = get(parserConfigDeserializers45DeserializersBuckets, 6);
        Object parserConfigDeserializers46 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers46DeserializersBuckets = getFieldValue(parserConfigDeserializers46, "buckets");
        Object finalParserConfigDeserializersBuckets7 = get(parserConfigDeserializers46DeserializersBuckets, 7);
        Object parserConfigDeserializers47 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers47DeserializersBuckets = getFieldValue(parserConfigDeserializers47, "buckets");
        Object finalParserConfigDeserializersBuckets8 = get(parserConfigDeserializers47DeserializersBuckets, 8);
        Object parserConfigDeserializers48 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers48DeserializersBuckets = getFieldValue(parserConfigDeserializers48, "buckets");
        Object finalParserConfigDeserializersBuckets9 = get(parserConfigDeserializers48DeserializersBuckets, 9);
        Object parserConfigDeserializers49 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers49DeserializersBuckets = getFieldValue(parserConfigDeserializers49, "buckets");
        Object finalParserConfigDeserializersBuckets10 = get(parserConfigDeserializers49DeserializersBuckets, 10);
        Object parserConfigDeserializers50 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers50DeserializersBuckets = getFieldValue(parserConfigDeserializers50, "buckets");
        Object finalParserConfigDeserializersBuckets11 = get(parserConfigDeserializers50DeserializersBuckets, 11);
        Object parserConfigDeserializers51 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers51DeserializersBuckets = getFieldValue(parserConfigDeserializers51, "buckets");
        Object finalParserConfigDeserializersBuckets12 = get(parserConfigDeserializers51DeserializersBuckets, 12);
        Object parserConfigDeserializers52 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers52DeserializersBuckets = getFieldValue(parserConfigDeserializers52, "buckets");
        Object finalParserConfigDeserializersBuckets13 = get(parserConfigDeserializers52DeserializersBuckets, 13);
        Object parserConfigDeserializers53 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers53DeserializersBuckets = getFieldValue(parserConfigDeserializers53, "buckets");
        Object finalParserConfigDeserializersBuckets14 = get(parserConfigDeserializers53DeserializersBuckets, 14);
        Object parserConfigDeserializers54 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers54DeserializersBuckets = getFieldValue(parserConfigDeserializers54, "buckets");
        Object finalParserConfigDeserializersBuckets15 = get(parserConfigDeserializers54DeserializersBuckets, 15);
        Object parserConfigDeserializers55 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers55DeserializersBuckets = getFieldValue(parserConfigDeserializers55, "buckets");
        Object finalParserConfigDeserializersBuckets16 = get(parserConfigDeserializers55DeserializersBuckets, 16);
        Object parserConfigDeserializers56 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers56DeserializersBuckets = getFieldValue(parserConfigDeserializers56, "buckets");
        Object finalParserConfigDeserializersBuckets17 = get(parserConfigDeserializers56DeserializersBuckets, 17);
        Object parserConfigDeserializers57 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers57DeserializersBuckets = getFieldValue(parserConfigDeserializers57, "buckets");
        Object finalParserConfigDeserializersBuckets18 = get(parserConfigDeserializers57DeserializersBuckets, 18);
        Object parserConfigDeserializers58 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers58DeserializersBuckets = getFieldValue(parserConfigDeserializers58, "buckets");
        Object finalParserConfigDeserializersBuckets19 = get(parserConfigDeserializers58DeserializersBuckets, 19);
        Object parserConfigDeserializers59 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers59DeserializersBuckets = getFieldValue(parserConfigDeserializers59, "buckets");
        Object finalParserConfigDeserializersBuckets20 = get(parserConfigDeserializers59DeserializersBuckets, 20);
        Object parserConfigDeserializers60 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers60DeserializersBuckets = getFieldValue(parserConfigDeserializers60, "buckets");
        Object finalParserConfigDeserializersBuckets21 = get(parserConfigDeserializers60DeserializersBuckets, 21);
        Object parserConfigDeserializers61 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers61DeserializersBuckets = getFieldValue(parserConfigDeserializers61, "buckets");
        Object finalParserConfigDeserializersBuckets22 = get(parserConfigDeserializers61DeserializersBuckets, 22);
        Object parserConfigDeserializers62 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers62DeserializersBuckets = getFieldValue(parserConfigDeserializers62, "buckets");
        Object finalParserConfigDeserializersBuckets23 = get(parserConfigDeserializers62DeserializersBuckets, 23);
        Object parserConfigDeserializers63 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers63DeserializersBuckets = getFieldValue(parserConfigDeserializers63, "buckets");
        Object finalParserConfigDeserializersBuckets24 = get(parserConfigDeserializers63DeserializersBuckets, 24);
        Object parserConfigDeserializers64 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers64DeserializersBuckets = getFieldValue(parserConfigDeserializers64, "buckets");
        Object finalParserConfigDeserializersBuckets25 = get(parserConfigDeserializers64DeserializersBuckets, 25);
        Object parserConfigDeserializers65 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers65DeserializersBuckets = getFieldValue(parserConfigDeserializers65, "buckets");
        Object finalParserConfigDeserializersBuckets26 = get(parserConfigDeserializers65DeserializersBuckets, 26);
        Object parserConfigDeserializers66 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers66DeserializersBuckets = getFieldValue(parserConfigDeserializers66, "buckets");
        Object finalParserConfigDeserializersBuckets27 = get(parserConfigDeserializers66DeserializersBuckets, 27);
        Object parserConfigDeserializers67 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers67DeserializersBuckets = getFieldValue(parserConfigDeserializers67, "buckets");
        Object finalParserConfigDeserializersBuckets28 = get(parserConfigDeserializers67DeserializersBuckets, 28);
        Object parserConfigDeserializers68 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers68DeserializersBuckets = getFieldValue(parserConfigDeserializers68, "buckets");
        Object finalParserConfigDeserializersBuckets29 = get(parserConfigDeserializers68DeserializersBuckets, 29);
        Object parserConfigDeserializers69 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers69DeserializersBuckets = getFieldValue(parserConfigDeserializers69, "buckets");
        Object finalParserConfigDeserializersBuckets30 = get(parserConfigDeserializers69DeserializersBuckets, 30);
        Object parserConfigDeserializers70 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers70DeserializersBuckets = getFieldValue(parserConfigDeserializers70, "buckets");
        Object finalParserConfigDeserializersBuckets31 = get(parserConfigDeserializers70DeserializersBuckets, 31);
        Object parserConfigDeserializers71 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers71DeserializersBuckets = getFieldValue(parserConfigDeserializers71, "buckets");
        Object finalParserConfigDeserializersBuckets32 = get(parserConfigDeserializers71DeserializersBuckets, 32);
        Object parserConfigDeserializers72 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers72DeserializersBuckets = getFieldValue(parserConfigDeserializers72, "buckets");
        Object finalParserConfigDeserializersBuckets33 = get(parserConfigDeserializers72DeserializersBuckets, 33);
        Object parserConfigDeserializers73 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers73DeserializersBuckets = getFieldValue(parserConfigDeserializers73, "buckets");
        Object finalParserConfigDeserializersBuckets34 = get(parserConfigDeserializers73DeserializersBuckets, 34);
        Object parserConfigDeserializers74 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers74DeserializersBuckets = getFieldValue(parserConfigDeserializers74, "buckets");
        Object finalParserConfigDeserializersBuckets35 = get(parserConfigDeserializers74DeserializersBuckets, 35);
        Object parserConfigDeserializers75 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers75DeserializersBuckets = getFieldValue(parserConfigDeserializers75, "buckets");
        Object finalParserConfigDeserializersBuckets36 = get(parserConfigDeserializers75DeserializersBuckets, 36);
        Object parserConfigDeserializers76 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers76DeserializersBuckets = getFieldValue(parserConfigDeserializers76, "buckets");
        Object finalParserConfigDeserializersBuckets37 = get(parserConfigDeserializers76DeserializersBuckets, 37);
        Object parserConfigDeserializers77 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers77DeserializersBuckets = getFieldValue(parserConfigDeserializers77, "buckets");
        Object finalParserConfigDeserializersBuckets38 = get(parserConfigDeserializers77DeserializersBuckets, 38);
        
        assertNull(finalParserConfigDeserializersBuckets0);
        
        assertNull(finalParserConfigDeserializersBuckets1);
        
        assertNull(finalParserConfigDeserializersBuckets2);
        
        assertNull(finalParserConfigDeserializersBuckets3);
        
        assertNull(finalParserConfigDeserializersBuckets4);
        
        assertNull(finalParserConfigDeserializersBuckets5);
        
        assertNull(finalParserConfigDeserializersBuckets6);
        
        assertNull(finalParserConfigDeserializersBuckets7);
        
        assertNull(finalParserConfigDeserializersBuckets8);
        
        assertNull(finalParserConfigDeserializersBuckets9);
        
        assertNull(finalParserConfigDeserializersBuckets10);
        
        assertNull(finalParserConfigDeserializersBuckets11);
        
        assertNull(finalParserConfigDeserializersBuckets12);
        
        assertNull(finalParserConfigDeserializersBuckets13);
        
        assertNull(finalParserConfigDeserializersBuckets14);
        
        assertNull(finalParserConfigDeserializersBuckets15);
        
        assertNull(finalParserConfigDeserializersBuckets16);
        
        assertNull(finalParserConfigDeserializersBuckets17);
        
        assertNull(finalParserConfigDeserializersBuckets18);
        
        assertNull(finalParserConfigDeserializersBuckets19);
        
        assertNull(finalParserConfigDeserializersBuckets20);
        
        assertNull(finalParserConfigDeserializersBuckets21);
        
        assertNull(finalParserConfigDeserializersBuckets22);
        
        assertNull(finalParserConfigDeserializersBuckets23);
        
        assertNull(finalParserConfigDeserializersBuckets24);
        
        assertNull(finalParserConfigDeserializersBuckets25);
        
        assertNull(finalParserConfigDeserializersBuckets26);
        
        assertNull(finalParserConfigDeserializersBuckets27);
        
        assertNull(finalParserConfigDeserializersBuckets28);
        
        assertNull(finalParserConfigDeserializersBuckets29);
        
        assertNull(finalParserConfigDeserializersBuckets30);
        
        assertNull(finalParserConfigDeserializersBuckets31);
        
        assertNull(finalParserConfigDeserializersBuckets32);
        
        assertNull(finalParserConfigDeserializersBuckets33);
        
        assertNull(finalParserConfigDeserializersBuckets34);
        
        assertNull(finalParserConfigDeserializersBuckets35);
        
        assertNull(finalParserConfigDeserializersBuckets36);
        
        assertNull(finalParserConfigDeserializersBuckets37);
        
        assertNull(finalParserConfigDeserializersBuckets38);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetDeserializer3() throws Throwable  {
        ParserConfig parserConfig = ((ParserConfig) createInstance("com.alibaba.fastjson.parser.ParserConfig"));
        IdentityHashMap identityHashMap = ((IdentityHashMap) createInstance("com.alibaba.fastjson.util.IdentityHashMap"));
        setField(identityHashMap, "indexMask", 38);
        java.lang.Object[] entryArray = createArray("com.alibaba.fastjson.util.IdentityHashMap$Entry", 39);
        setField(identityHashMap, "buckets", entryArray);
        setField(parserConfig, "deserializers", identityHashMap);
        Class class1 = Object.class;
        
        Object parserConfigDeserializers = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializersDeserializersBuckets = getFieldValue(parserConfigDeserializers, "buckets");
        Object initialParserConfigDeserializersBuckets0 = get(parserConfigDeserializersDeserializersBuckets, 0);
        Object parserConfigDeserializers1 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers1DeserializersBuckets = getFieldValue(parserConfigDeserializers1, "buckets");
        Object initialParserConfigDeserializersBuckets1 = get(parserConfigDeserializers1DeserializersBuckets, 1);
        Object parserConfigDeserializers2 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers2DeserializersBuckets = getFieldValue(parserConfigDeserializers2, "buckets");
        Object initialParserConfigDeserializersBuckets2 = get(parserConfigDeserializers2DeserializersBuckets, 2);
        Object parserConfigDeserializers3 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers3DeserializersBuckets = getFieldValue(parserConfigDeserializers3, "buckets");
        Object initialParserConfigDeserializersBuckets3 = get(parserConfigDeserializers3DeserializersBuckets, 3);
        Object parserConfigDeserializers4 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers4DeserializersBuckets = getFieldValue(parserConfigDeserializers4, "buckets");
        Object initialParserConfigDeserializersBuckets4 = get(parserConfigDeserializers4DeserializersBuckets, 4);
        Object parserConfigDeserializers5 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers5DeserializersBuckets = getFieldValue(parserConfigDeserializers5, "buckets");
        Object initialParserConfigDeserializersBuckets5 = get(parserConfigDeserializers5DeserializersBuckets, 5);
        Object parserConfigDeserializers6 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers6DeserializersBuckets = getFieldValue(parserConfigDeserializers6, "buckets");
        Object initialParserConfigDeserializersBuckets6 = get(parserConfigDeserializers6DeserializersBuckets, 6);
        Object parserConfigDeserializers7 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers7DeserializersBuckets = getFieldValue(parserConfigDeserializers7, "buckets");
        Object initialParserConfigDeserializersBuckets7 = get(parserConfigDeserializers7DeserializersBuckets, 7);
        Object parserConfigDeserializers8 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers8DeserializersBuckets = getFieldValue(parserConfigDeserializers8, "buckets");
        Object initialParserConfigDeserializersBuckets8 = get(parserConfigDeserializers8DeserializersBuckets, 8);
        Object parserConfigDeserializers9 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers9DeserializersBuckets = getFieldValue(parserConfigDeserializers9, "buckets");
        Object initialParserConfigDeserializersBuckets9 = get(parserConfigDeserializers9DeserializersBuckets, 9);
        Object parserConfigDeserializers10 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers10DeserializersBuckets = getFieldValue(parserConfigDeserializers10, "buckets");
        Object initialParserConfigDeserializersBuckets10 = get(parserConfigDeserializers10DeserializersBuckets, 10);
        Object parserConfigDeserializers11 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers11DeserializersBuckets = getFieldValue(parserConfigDeserializers11, "buckets");
        Object initialParserConfigDeserializersBuckets11 = get(parserConfigDeserializers11DeserializersBuckets, 11);
        Object parserConfigDeserializers12 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers12DeserializersBuckets = getFieldValue(parserConfigDeserializers12, "buckets");
        Object initialParserConfigDeserializersBuckets12 = get(parserConfigDeserializers12DeserializersBuckets, 12);
        Object parserConfigDeserializers13 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers13DeserializersBuckets = getFieldValue(parserConfigDeserializers13, "buckets");
        Object initialParserConfigDeserializersBuckets13 = get(parserConfigDeserializers13DeserializersBuckets, 13);
        Object parserConfigDeserializers14 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers14DeserializersBuckets = getFieldValue(parserConfigDeserializers14, "buckets");
        Object initialParserConfigDeserializersBuckets14 = get(parserConfigDeserializers14DeserializersBuckets, 14);
        Object parserConfigDeserializers15 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers15DeserializersBuckets = getFieldValue(parserConfigDeserializers15, "buckets");
        Object initialParserConfigDeserializersBuckets15 = get(parserConfigDeserializers15DeserializersBuckets, 15);
        Object parserConfigDeserializers16 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers16DeserializersBuckets = getFieldValue(parserConfigDeserializers16, "buckets");
        Object initialParserConfigDeserializersBuckets16 = get(parserConfigDeserializers16DeserializersBuckets, 16);
        Object parserConfigDeserializers17 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers17DeserializersBuckets = getFieldValue(parserConfigDeserializers17, "buckets");
        Object initialParserConfigDeserializersBuckets17 = get(parserConfigDeserializers17DeserializersBuckets, 17);
        Object parserConfigDeserializers18 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers18DeserializersBuckets = getFieldValue(parserConfigDeserializers18, "buckets");
        Object initialParserConfigDeserializersBuckets18 = get(parserConfigDeserializers18DeserializersBuckets, 18);
        Object parserConfigDeserializers19 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers19DeserializersBuckets = getFieldValue(parserConfigDeserializers19, "buckets");
        Object initialParserConfigDeserializersBuckets19 = get(parserConfigDeserializers19DeserializersBuckets, 19);
        Object parserConfigDeserializers20 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers20DeserializersBuckets = getFieldValue(parserConfigDeserializers20, "buckets");
        Object initialParserConfigDeserializersBuckets20 = get(parserConfigDeserializers20DeserializersBuckets, 20);
        Object parserConfigDeserializers21 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers21DeserializersBuckets = getFieldValue(parserConfigDeserializers21, "buckets");
        Object initialParserConfigDeserializersBuckets21 = get(parserConfigDeserializers21DeserializersBuckets, 21);
        Object parserConfigDeserializers22 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers22DeserializersBuckets = getFieldValue(parserConfigDeserializers22, "buckets");
        Object initialParserConfigDeserializersBuckets22 = get(parserConfigDeserializers22DeserializersBuckets, 22);
        Object parserConfigDeserializers23 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers23DeserializersBuckets = getFieldValue(parserConfigDeserializers23, "buckets");
        Object initialParserConfigDeserializersBuckets23 = get(parserConfigDeserializers23DeserializersBuckets, 23);
        Object parserConfigDeserializers24 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers24DeserializersBuckets = getFieldValue(parserConfigDeserializers24, "buckets");
        Object initialParserConfigDeserializersBuckets24 = get(parserConfigDeserializers24DeserializersBuckets, 24);
        Object parserConfigDeserializers25 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers25DeserializersBuckets = getFieldValue(parserConfigDeserializers25, "buckets");
        Object initialParserConfigDeserializersBuckets25 = get(parserConfigDeserializers25DeserializersBuckets, 25);
        Object parserConfigDeserializers26 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers26DeserializersBuckets = getFieldValue(parserConfigDeserializers26, "buckets");
        Object initialParserConfigDeserializersBuckets26 = get(parserConfigDeserializers26DeserializersBuckets, 26);
        Object parserConfigDeserializers27 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers27DeserializersBuckets = getFieldValue(parserConfigDeserializers27, "buckets");
        Object initialParserConfigDeserializersBuckets27 = get(parserConfigDeserializers27DeserializersBuckets, 27);
        Object parserConfigDeserializers28 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers28DeserializersBuckets = getFieldValue(parserConfigDeserializers28, "buckets");
        Object initialParserConfigDeserializersBuckets28 = get(parserConfigDeserializers28DeserializersBuckets, 28);
        Object parserConfigDeserializers29 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers29DeserializersBuckets = getFieldValue(parserConfigDeserializers29, "buckets");
        Object initialParserConfigDeserializersBuckets29 = get(parserConfigDeserializers29DeserializersBuckets, 29);
        Object parserConfigDeserializers30 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers30DeserializersBuckets = getFieldValue(parserConfigDeserializers30, "buckets");
        Object initialParserConfigDeserializersBuckets30 = get(parserConfigDeserializers30DeserializersBuckets, 30);
        Object parserConfigDeserializers31 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers31DeserializersBuckets = getFieldValue(parserConfigDeserializers31, "buckets");
        Object initialParserConfigDeserializersBuckets31 = get(parserConfigDeserializers31DeserializersBuckets, 31);
        Object parserConfigDeserializers32 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers32DeserializersBuckets = getFieldValue(parserConfigDeserializers32, "buckets");
        Object initialParserConfigDeserializersBuckets32 = get(parserConfigDeserializers32DeserializersBuckets, 32);
        Object parserConfigDeserializers33 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers33DeserializersBuckets = getFieldValue(parserConfigDeserializers33, "buckets");
        Object initialParserConfigDeserializersBuckets33 = get(parserConfigDeserializers33DeserializersBuckets, 33);
        Object parserConfigDeserializers34 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers34DeserializersBuckets = getFieldValue(parserConfigDeserializers34, "buckets");
        Object initialParserConfigDeserializersBuckets34 = get(parserConfigDeserializers34DeserializersBuckets, 34);
        Object parserConfigDeserializers35 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers35DeserializersBuckets = getFieldValue(parserConfigDeserializers35, "buckets");
        Object initialParserConfigDeserializersBuckets35 = get(parserConfigDeserializers35DeserializersBuckets, 35);
        Object parserConfigDeserializers36 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers36DeserializersBuckets = getFieldValue(parserConfigDeserializers36, "buckets");
        Object initialParserConfigDeserializersBuckets36 = get(parserConfigDeserializers36DeserializersBuckets, 36);
        Object parserConfigDeserializers37 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers37DeserializersBuckets = getFieldValue(parserConfigDeserializers37, "buckets");
        Object initialParserConfigDeserializersBuckets37 = get(parserConfigDeserializers37DeserializersBuckets, 37);
        Object parserConfigDeserializers38 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers38DeserializersBuckets = getFieldValue(parserConfigDeserializers38, "buckets");
        Object initialParserConfigDeserializersBuckets38 = get(parserConfigDeserializers38DeserializersBuckets, 38);
        
        ObjectDeserializer actual = parserConfig.getDeserializer(class1);
        
        JavaBeanDeserializer expected = ((JavaBeanDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer"));
        com.alibaba.fastjson.parser.deserializer.FieldDeserializer[] fieldDeserializerArray = new com.alibaba.fastjson.parser.deserializer.FieldDeserializer[0];
        setField(expected, "fieldDeserializers", fieldDeserializerArray);
        com.alibaba.fastjson.parser.deserializer.FieldDeserializer[] fieldDeserializerArray1 = new com.alibaba.fastjson.parser.deserializer.FieldDeserializer[0];
        setField(expected, "sortedFieldDeserializers", fieldDeserializerArray1);
        setField(expected, "clazz", class1);
        JavaBeanInfo javaBeanInfo = ((JavaBeanInfo) createInstance("com.alibaba.fastjson.util.JavaBeanInfo"));
        setField(javaBeanInfo, "clazz", class1);
        setField(javaBeanInfo, "builderClass", null);
        Constructor constructor = ((Constructor) createInstance("java.lang.reflect.Constructor"));
        setField(constructor, "clazz", class1);
        setField(constructor, "slot", 0);
        java.lang.Class[] classArray = new java.lang.Class[0];
        setField(constructor, "parameterTypes", classArray);
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        setField(constructor, "exceptionTypes", classArray1);
        setField(constructor, "modifiers", 1);
        setField(constructor, "signature", null);
        setField(constructor, "genericInfo", null);
        setField(constructor, "annotations", null);
        setField(constructor, "parameterAnnotations", null);
        setField(constructor, "constructorAccessor", null);
        Constructor constructor1 = ((Constructor) createInstance("java.lang.reflect.Constructor"));
        setField(constructor1, "clazz", class1);
        setField(constructor1, "slot", 0);
        setField(constructor1, "parameterTypes", classArray);
        setField(constructor1, "exceptionTypes", classArray1);
        setField(constructor1, "modifiers", 1);
        setField(constructor1, "signature", null);
        setField(constructor1, "genericInfo", null);
        setField(constructor1, "annotations", null);
        setField(constructor1, "parameterAnnotations", null);
        setField(constructor1, "constructorAccessor", null);
        setField(constructor1, "root", null);
        setField(constructor1, "hasRealParameterData", false);
        setField(constructor1, "parameters", null);
        setField(constructor1, "declaredAnnotations", null);
        setField(constructor1, "override", false);
        setField(constructor1, "securityCheckCache", null);
        setField(constructor, "root", constructor1);
        setField(constructor, "hasRealParameterData", false);
        setField(constructor, "parameters", null);
        setField(constructor, "declaredAnnotations", null);
        setField(constructor, "override", true);
        setField(constructor, "securityCheckCache", null);
        setField(javaBeanInfo, "defaultConstructor", constructor);
        setField(javaBeanInfo, "creatorConstructor", null);
        setField(javaBeanInfo, "factoryMethod", null);
        setField(javaBeanInfo, "buildMethod", null);
        setField(javaBeanInfo, "defaultConstructorParameterSize", 0);
        com.alibaba.fastjson.util.FieldInfo[] fieldInfoArray = new com.alibaba.fastjson.util.FieldInfo[0];
        setField(javaBeanInfo, "fields", fieldInfoArray);
        setField(javaBeanInfo, "sortedFields", fieldInfoArray);
        setField(javaBeanInfo, "parserFeatures", 0);
        setField(javaBeanInfo, "jsonType", null);
        String string = new String("java.lang.Object");
        setField(javaBeanInfo, "typeName", string);
        setField(javaBeanInfo, "typeKey", null);
        setField(javaBeanInfo, "orders", null);
        setField(javaBeanInfo, "creatorConstructorParameterTypes", null);
        setField(javaBeanInfo, "creatorConstructorParameters", null);
        javaBeanInfo.kotlin = false;
        setField(javaBeanInfo, "kotlinDefaultConstructor", null);
        setField(expected, "beanInfo", javaBeanInfo);
        setField(expected, "extraFieldDeserializers", null);
        setField(expected, "alterNameFieldDeserializers", null);
        setField(expected, "smartMatchHashArray", null);
        setField(expected, "smartMatchHashArrayMapping", null);
        setField(expected, "hashArray", null);
        setField(expected, "hashArrayMapping", null);
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
        
        Object parserConfigDeserializers39 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers39DeserializersBuckets = getFieldValue(parserConfigDeserializers39, "buckets");
        Object finalParserConfigDeserializersBuckets0 = get(parserConfigDeserializers39DeserializersBuckets, 0);
        Object parserConfigDeserializers40 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers40DeserializersBuckets = getFieldValue(parserConfigDeserializers40, "buckets");
        Object finalParserConfigDeserializersBuckets1 = get(parserConfigDeserializers40DeserializersBuckets, 1);
        Object parserConfigDeserializers41 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers41DeserializersBuckets = getFieldValue(parserConfigDeserializers41, "buckets");
        Object finalParserConfigDeserializersBuckets2 = get(parserConfigDeserializers41DeserializersBuckets, 2);
        Object parserConfigDeserializers42 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers42DeserializersBuckets = getFieldValue(parserConfigDeserializers42, "buckets");
        Object finalParserConfigDeserializersBuckets3 = get(parserConfigDeserializers42DeserializersBuckets, 3);
        Object parserConfigDeserializers43 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers43DeserializersBuckets = getFieldValue(parserConfigDeserializers43, "buckets");
        Object finalParserConfigDeserializersBuckets4 = get(parserConfigDeserializers43DeserializersBuckets, 4);
        Object parserConfigDeserializers44 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers44DeserializersBuckets = getFieldValue(parserConfigDeserializers44, "buckets");
        Object finalParserConfigDeserializersBuckets5 = get(parserConfigDeserializers44DeserializersBuckets, 5);
        Object parserConfigDeserializers45 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers45DeserializersBuckets = getFieldValue(parserConfigDeserializers45, "buckets");
        Object finalParserConfigDeserializersBuckets6 = get(parserConfigDeserializers45DeserializersBuckets, 6);
        Object parserConfigDeserializers46 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers46DeserializersBuckets = getFieldValue(parserConfigDeserializers46, "buckets");
        Object finalParserConfigDeserializersBuckets7 = get(parserConfigDeserializers46DeserializersBuckets, 7);
        Object parserConfigDeserializers47 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers47DeserializersBuckets = getFieldValue(parserConfigDeserializers47, "buckets");
        Object finalParserConfigDeserializersBuckets8 = get(parserConfigDeserializers47DeserializersBuckets, 8);
        Object parserConfigDeserializers48 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers48DeserializersBuckets = getFieldValue(parserConfigDeserializers48, "buckets");
        Object finalParserConfigDeserializersBuckets9 = get(parserConfigDeserializers48DeserializersBuckets, 9);
        Object parserConfigDeserializers49 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers49DeserializersBuckets = getFieldValue(parserConfigDeserializers49, "buckets");
        Object finalParserConfigDeserializersBuckets10 = get(parserConfigDeserializers49DeserializersBuckets, 10);
        Object parserConfigDeserializers50 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers50DeserializersBuckets = getFieldValue(parserConfigDeserializers50, "buckets");
        Object finalParserConfigDeserializersBuckets11 = get(parserConfigDeserializers50DeserializersBuckets, 11);
        Object parserConfigDeserializers51 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers51DeserializersBuckets = getFieldValue(parserConfigDeserializers51, "buckets");
        Object finalParserConfigDeserializersBuckets12 = get(parserConfigDeserializers51DeserializersBuckets, 12);
        Object parserConfigDeserializers52 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers52DeserializersBuckets = getFieldValue(parserConfigDeserializers52, "buckets");
        Object finalParserConfigDeserializersBuckets13 = get(parserConfigDeserializers52DeserializersBuckets, 13);
        Object parserConfigDeserializers53 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers53DeserializersBuckets = getFieldValue(parserConfigDeserializers53, "buckets");
        Object finalParserConfigDeserializersBuckets14 = get(parserConfigDeserializers53DeserializersBuckets, 14);
        Object parserConfigDeserializers54 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers54DeserializersBuckets = getFieldValue(parserConfigDeserializers54, "buckets");
        Object finalParserConfigDeserializersBuckets15 = get(parserConfigDeserializers54DeserializersBuckets, 15);
        Object parserConfigDeserializers55 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers55DeserializersBuckets = getFieldValue(parserConfigDeserializers55, "buckets");
        Object finalParserConfigDeserializersBuckets16 = get(parserConfigDeserializers55DeserializersBuckets, 16);
        Object parserConfigDeserializers56 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers56DeserializersBuckets = getFieldValue(parserConfigDeserializers56, "buckets");
        Object finalParserConfigDeserializersBuckets17 = get(parserConfigDeserializers56DeserializersBuckets, 17);
        Object parserConfigDeserializers57 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers57DeserializersBuckets = getFieldValue(parserConfigDeserializers57, "buckets");
        Object finalParserConfigDeserializersBuckets18 = get(parserConfigDeserializers57DeserializersBuckets, 18);
        Object parserConfigDeserializers58 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers58DeserializersBuckets = getFieldValue(parserConfigDeserializers58, "buckets");
        Object finalParserConfigDeserializersBuckets19 = get(parserConfigDeserializers58DeserializersBuckets, 19);
        Object parserConfigDeserializers59 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers59DeserializersBuckets = getFieldValue(parserConfigDeserializers59, "buckets");
        Object finalParserConfigDeserializersBuckets20 = get(parserConfigDeserializers59DeserializersBuckets, 20);
        Object parserConfigDeserializers60 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers60DeserializersBuckets = getFieldValue(parserConfigDeserializers60, "buckets");
        Object finalParserConfigDeserializersBuckets21 = get(parserConfigDeserializers60DeserializersBuckets, 21);
        Object parserConfigDeserializers61 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers61DeserializersBuckets = getFieldValue(parserConfigDeserializers61, "buckets");
        Object finalParserConfigDeserializersBuckets22 = get(parserConfigDeserializers61DeserializersBuckets, 22);
        Object parserConfigDeserializers62 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers62DeserializersBuckets = getFieldValue(parserConfigDeserializers62, "buckets");
        Object finalParserConfigDeserializersBuckets23 = get(parserConfigDeserializers62DeserializersBuckets, 23);
        Object parserConfigDeserializers63 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers63DeserializersBuckets = getFieldValue(parserConfigDeserializers63, "buckets");
        Object finalParserConfigDeserializersBuckets24 = get(parserConfigDeserializers63DeserializersBuckets, 24);
        Object parserConfigDeserializers64 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers64DeserializersBuckets = getFieldValue(parserConfigDeserializers64, "buckets");
        Object finalParserConfigDeserializersBuckets25 = get(parserConfigDeserializers64DeserializersBuckets, 25);
        Object parserConfigDeserializers65 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers65DeserializersBuckets = getFieldValue(parserConfigDeserializers65, "buckets");
        Object finalParserConfigDeserializersBuckets26 = get(parserConfigDeserializers65DeserializersBuckets, 26);
        Object parserConfigDeserializers66 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers66DeserializersBuckets = getFieldValue(parserConfigDeserializers66, "buckets");
        Object finalParserConfigDeserializersBuckets27 = get(parserConfigDeserializers66DeserializersBuckets, 27);
        Object parserConfigDeserializers67 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers67DeserializersBuckets = getFieldValue(parserConfigDeserializers67, "buckets");
        Object finalParserConfigDeserializersBuckets28 = get(parserConfigDeserializers67DeserializersBuckets, 28);
        Object parserConfigDeserializers68 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers68DeserializersBuckets = getFieldValue(parserConfigDeserializers68, "buckets");
        Object finalParserConfigDeserializersBuckets29 = get(parserConfigDeserializers68DeserializersBuckets, 29);
        Object parserConfigDeserializers69 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers69DeserializersBuckets = getFieldValue(parserConfigDeserializers69, "buckets");
        Object finalParserConfigDeserializersBuckets30 = get(parserConfigDeserializers69DeserializersBuckets, 30);
        Object parserConfigDeserializers70 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers70DeserializersBuckets = getFieldValue(parserConfigDeserializers70, "buckets");
        Object finalParserConfigDeserializersBuckets31 = get(parserConfigDeserializers70DeserializersBuckets, 31);
        Object parserConfigDeserializers71 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers71DeserializersBuckets = getFieldValue(parserConfigDeserializers71, "buckets");
        Object finalParserConfigDeserializersBuckets32 = get(parserConfigDeserializers71DeserializersBuckets, 32);
        Object parserConfigDeserializers72 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers72DeserializersBuckets = getFieldValue(parserConfigDeserializers72, "buckets");
        Object finalParserConfigDeserializersBuckets33 = get(parserConfigDeserializers72DeserializersBuckets, 33);
        Object parserConfigDeserializers73 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers73DeserializersBuckets = getFieldValue(parserConfigDeserializers73, "buckets");
        Object finalParserConfigDeserializersBuckets34 = get(parserConfigDeserializers73DeserializersBuckets, 34);
        Object parserConfigDeserializers74 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers74DeserializersBuckets = getFieldValue(parserConfigDeserializers74, "buckets");
        Object finalParserConfigDeserializersBuckets35 = get(parserConfigDeserializers74DeserializersBuckets, 35);
        Object parserConfigDeserializers75 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers75DeserializersBuckets = getFieldValue(parserConfigDeserializers75, "buckets");
        Object finalParserConfigDeserializersBuckets36 = get(parserConfigDeserializers75DeserializersBuckets, 36);
        Object parserConfigDeserializers76 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers76DeserializersBuckets = getFieldValue(parserConfigDeserializers76, "buckets");
        Object finalParserConfigDeserializersBuckets37 = get(parserConfigDeserializers76DeserializersBuckets, 37);
        Object parserConfigDeserializers77 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers77DeserializersBuckets = getFieldValue(parserConfigDeserializers77, "buckets");
        Object finalParserConfigDeserializersBuckets38 = get(parserConfigDeserializers77DeserializersBuckets, 38);
        
        assertNull(finalParserConfigDeserializersBuckets0);
        
        assertNull(finalParserConfigDeserializersBuckets1);
        
        assertNull(finalParserConfigDeserializersBuckets2);
        
        assertNull(finalParserConfigDeserializersBuckets3);
        
        assertNull(finalParserConfigDeserializersBuckets4);
        
        assertNull(finalParserConfigDeserializersBuckets5);
        
        assertNull(finalParserConfigDeserializersBuckets6);
        
        assertNull(finalParserConfigDeserializersBuckets7);
        
        assertNull(finalParserConfigDeserializersBuckets8);
        
        assertNull(finalParserConfigDeserializersBuckets9);
        
        assertNull(finalParserConfigDeserializersBuckets10);
        
        assertNull(finalParserConfigDeserializersBuckets11);
        
        assertNull(finalParserConfigDeserializersBuckets12);
        
        assertNull(finalParserConfigDeserializersBuckets13);
        
        assertNull(finalParserConfigDeserializersBuckets14);
        
        assertNull(finalParserConfigDeserializersBuckets15);
        
        assertNull(finalParserConfigDeserializersBuckets16);
        
        assertNull(finalParserConfigDeserializersBuckets17);
        
        assertNull(finalParserConfigDeserializersBuckets18);
        
        assertNull(finalParserConfigDeserializersBuckets19);
        
        assertNull(finalParserConfigDeserializersBuckets20);
        
        assertNull(finalParserConfigDeserializersBuckets21);
        
        assertNull(finalParserConfigDeserializersBuckets22);
        
        assertNull(finalParserConfigDeserializersBuckets23);
        
        assertNull(finalParserConfigDeserializersBuckets24);
        
        assertNull(finalParserConfigDeserializersBuckets25);
        
        assertNull(finalParserConfigDeserializersBuckets26);
        
        assertNull(finalParserConfigDeserializersBuckets27);
        
        assertNull(finalParserConfigDeserializersBuckets28);
        
        assertNull(finalParserConfigDeserializersBuckets29);
        
        assertNull(finalParserConfigDeserializersBuckets30);
        
        assertNull(finalParserConfigDeserializersBuckets31);
        
        assertNull(finalParserConfigDeserializersBuckets32);
        
        assertNull(finalParserConfigDeserializersBuckets33);
        
        assertNull(finalParserConfigDeserializersBuckets34);
        
        assertNull(finalParserConfigDeserializersBuckets35);
        
        assertNull(finalParserConfigDeserializersBuckets36);
        
        assertNull(finalParserConfigDeserializersBuckets37);
        
        assertFalse(initialParserConfigDeserializersBuckets38 == finalParserConfigDeserializersBuckets38);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetDeserializer4() throws Throwable  {
        ParserConfig parserConfig = new ParserConfig();
        FieldInfo fieldInfo = ((FieldInfo) createInstance("com.alibaba.fastjson.util.FieldInfo"));
        
        parserConfig.getDeserializer(fieldInfo);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetDeserializer5() throws Throwable  {
        ParserConfig parserConfig = ((ParserConfig) createInstance("com.alibaba.fastjson.parser.ParserConfig"));
        
        parserConfig.getDeserializer(((FieldInfo) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetDeserializer6() throws Throwable  {
        ParserConfig parserConfig = ((ParserConfig) createInstance("com.alibaba.fastjson.parser.ParserConfig"));
        IdentityHashMap identityHashMap = ((IdentityHashMap) createInstance("com.alibaba.fastjson.util.IdentityHashMap"));
        setField(identityHashMap, "indexMask", 28);
        java.lang.Object[] entryArray = createArray("com.alibaba.fastjson.util.IdentityHashMap$Entry", 29);
        Object entry = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        java.lang.Object[] ofLongArray = createArray("java.util.stream.Nodes$EmptyNode$OfLong", 0);
        setField(entry, "value", ofLongArray);
        ParameterizedTypeImpl parameterizedTypeImpl = ((ParameterizedTypeImpl) createInstance("com.alibaba.fastjson.util.ParameterizedTypeImpl"));
        setField(entry, "key", parameterizedTypeImpl);
        entryArray[28] = entry;
        setField(identityHashMap, "buckets", entryArray);
        setField(parserConfig, "deserializers", identityHashMap);
        FieldInfo fieldInfo = ((FieldInfo) createInstance("com.alibaba.fastjson.util.FieldInfo"));
        setField(fieldInfo, "fieldType", parameterizedTypeImpl);
        Class class1 = Object.class;
        setField(fieldInfo, "fieldClass", class1);
        
        Object parserConfigDeserializers = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializersDeserializersBuckets = getFieldValue(parserConfigDeserializers, "buckets");
        Object initialParserConfigDeserializersBuckets0 = get(parserConfigDeserializersDeserializersBuckets, 0);
        Object parserConfigDeserializers1 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers1DeserializersBuckets = getFieldValue(parserConfigDeserializers1, "buckets");
        Object initialParserConfigDeserializersBuckets1 = get(parserConfigDeserializers1DeserializersBuckets, 1);
        Object parserConfigDeserializers2 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers2DeserializersBuckets = getFieldValue(parserConfigDeserializers2, "buckets");
        Object initialParserConfigDeserializersBuckets2 = get(parserConfigDeserializers2DeserializersBuckets, 2);
        Object parserConfigDeserializers3 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers3DeserializersBuckets = getFieldValue(parserConfigDeserializers3, "buckets");
        Object initialParserConfigDeserializersBuckets3 = get(parserConfigDeserializers3DeserializersBuckets, 3);
        Object parserConfigDeserializers4 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers4DeserializersBuckets = getFieldValue(parserConfigDeserializers4, "buckets");
        Object initialParserConfigDeserializersBuckets4 = get(parserConfigDeserializers4DeserializersBuckets, 4);
        Object parserConfigDeserializers5 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers5DeserializersBuckets = getFieldValue(parserConfigDeserializers5, "buckets");
        Object initialParserConfigDeserializersBuckets5 = get(parserConfigDeserializers5DeserializersBuckets, 5);
        Object parserConfigDeserializers6 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers6DeserializersBuckets = getFieldValue(parserConfigDeserializers6, "buckets");
        Object initialParserConfigDeserializersBuckets6 = get(parserConfigDeserializers6DeserializersBuckets, 6);
        Object parserConfigDeserializers7 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers7DeserializersBuckets = getFieldValue(parserConfigDeserializers7, "buckets");
        Object initialParserConfigDeserializersBuckets7 = get(parserConfigDeserializers7DeserializersBuckets, 7);
        Object parserConfigDeserializers8 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers8DeserializersBuckets = getFieldValue(parserConfigDeserializers8, "buckets");
        Object initialParserConfigDeserializersBuckets8 = get(parserConfigDeserializers8DeserializersBuckets, 8);
        Object parserConfigDeserializers9 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers9DeserializersBuckets = getFieldValue(parserConfigDeserializers9, "buckets");
        Object initialParserConfigDeserializersBuckets9 = get(parserConfigDeserializers9DeserializersBuckets, 9);
        Object parserConfigDeserializers10 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers10DeserializersBuckets = getFieldValue(parserConfigDeserializers10, "buckets");
        Object initialParserConfigDeserializersBuckets10 = get(parserConfigDeserializers10DeserializersBuckets, 10);
        Object parserConfigDeserializers11 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers11DeserializersBuckets = getFieldValue(parserConfigDeserializers11, "buckets");
        Object initialParserConfigDeserializersBuckets11 = get(parserConfigDeserializers11DeserializersBuckets, 11);
        Object parserConfigDeserializers12 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers12DeserializersBuckets = getFieldValue(parserConfigDeserializers12, "buckets");
        Object initialParserConfigDeserializersBuckets12 = get(parserConfigDeserializers12DeserializersBuckets, 12);
        Object parserConfigDeserializers13 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers13DeserializersBuckets = getFieldValue(parserConfigDeserializers13, "buckets");
        Object initialParserConfigDeserializersBuckets13 = get(parserConfigDeserializers13DeserializersBuckets, 13);
        Object parserConfigDeserializers14 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers14DeserializersBuckets = getFieldValue(parserConfigDeserializers14, "buckets");
        Object initialParserConfigDeserializersBuckets14 = get(parserConfigDeserializers14DeserializersBuckets, 14);
        Object parserConfigDeserializers15 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers15DeserializersBuckets = getFieldValue(parserConfigDeserializers15, "buckets");
        Object initialParserConfigDeserializersBuckets15 = get(parserConfigDeserializers15DeserializersBuckets, 15);
        Object parserConfigDeserializers16 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers16DeserializersBuckets = getFieldValue(parserConfigDeserializers16, "buckets");
        Object initialParserConfigDeserializersBuckets16 = get(parserConfigDeserializers16DeserializersBuckets, 16);
        Object parserConfigDeserializers17 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers17DeserializersBuckets = getFieldValue(parserConfigDeserializers17, "buckets");
        Object initialParserConfigDeserializersBuckets17 = get(parserConfigDeserializers17DeserializersBuckets, 17);
        Object parserConfigDeserializers18 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers18DeserializersBuckets = getFieldValue(parserConfigDeserializers18, "buckets");
        Object initialParserConfigDeserializersBuckets18 = get(parserConfigDeserializers18DeserializersBuckets, 18);
        Object parserConfigDeserializers19 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers19DeserializersBuckets = getFieldValue(parserConfigDeserializers19, "buckets");
        Object initialParserConfigDeserializersBuckets19 = get(parserConfigDeserializers19DeserializersBuckets, 19);
        Object parserConfigDeserializers20 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers20DeserializersBuckets = getFieldValue(parserConfigDeserializers20, "buckets");
        Object initialParserConfigDeserializersBuckets20 = get(parserConfigDeserializers20DeserializersBuckets, 20);
        Object parserConfigDeserializers21 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers21DeserializersBuckets = getFieldValue(parserConfigDeserializers21, "buckets");
        Object initialParserConfigDeserializersBuckets21 = get(parserConfigDeserializers21DeserializersBuckets, 21);
        Object parserConfigDeserializers22 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers22DeserializersBuckets = getFieldValue(parserConfigDeserializers22, "buckets");
        Object initialParserConfigDeserializersBuckets22 = get(parserConfigDeserializers22DeserializersBuckets, 22);
        Object parserConfigDeserializers23 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers23DeserializersBuckets = getFieldValue(parserConfigDeserializers23, "buckets");
        Object initialParserConfigDeserializersBuckets23 = get(parserConfigDeserializers23DeserializersBuckets, 23);
        Object parserConfigDeserializers24 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers24DeserializersBuckets = getFieldValue(parserConfigDeserializers24, "buckets");
        Object initialParserConfigDeserializersBuckets24 = get(parserConfigDeserializers24DeserializersBuckets, 24);
        Object parserConfigDeserializers25 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers25DeserializersBuckets = getFieldValue(parserConfigDeserializers25, "buckets");
        Object initialParserConfigDeserializersBuckets25 = get(parserConfigDeserializers25DeserializersBuckets, 25);
        Object parserConfigDeserializers26 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers26DeserializersBuckets = getFieldValue(parserConfigDeserializers26, "buckets");
        Object initialParserConfigDeserializersBuckets26 = get(parserConfigDeserializers26DeserializersBuckets, 26);
        Object parserConfigDeserializers27 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers27DeserializersBuckets = getFieldValue(parserConfigDeserializers27, "buckets");
        Object initialParserConfigDeserializersBuckets27 = get(parserConfigDeserializers27DeserializersBuckets, 27);
        
        ObjectDeserializer actual = parserConfig.getDeserializer(fieldInfo);
        
        JavaBeanDeserializer expected = ((JavaBeanDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer"));
        com.alibaba.fastjson.parser.deserializer.FieldDeserializer[] fieldDeserializerArray = new com.alibaba.fastjson.parser.deserializer.FieldDeserializer[0];
        setField(expected, "fieldDeserializers", fieldDeserializerArray);
        com.alibaba.fastjson.parser.deserializer.FieldDeserializer[] fieldDeserializerArray1 = new com.alibaba.fastjson.parser.deserializer.FieldDeserializer[0];
        setField(expected, "sortedFieldDeserializers", fieldDeserializerArray1);
        setField(expected, "clazz", class1);
        JavaBeanInfo javaBeanInfo = ((JavaBeanInfo) createInstance("com.alibaba.fastjson.util.JavaBeanInfo"));
        setField(javaBeanInfo, "clazz", class1);
        setField(javaBeanInfo, "builderClass", null);
        Constructor constructor = ((Constructor) createInstance("java.lang.reflect.Constructor"));
        setField(constructor, "clazz", class1);
        setField(constructor, "slot", 0);
        java.lang.Class[] classArray = new java.lang.Class[0];
        setField(constructor, "parameterTypes", classArray);
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        setField(constructor, "exceptionTypes", classArray1);
        setField(constructor, "modifiers", 1);
        setField(constructor, "signature", null);
        setField(constructor, "genericInfo", null);
        setField(constructor, "annotations", null);
        setField(constructor, "parameterAnnotations", null);
        setField(constructor, "constructorAccessor", null);
        Constructor constructor1 = ((Constructor) createInstance("java.lang.reflect.Constructor"));
        setField(constructor1, "clazz", class1);
        setField(constructor1, "slot", 0);
        setField(constructor1, "parameterTypes", classArray);
        setField(constructor1, "exceptionTypes", classArray1);
        setField(constructor1, "modifiers", 1);
        setField(constructor1, "signature", null);
        setField(constructor1, "genericInfo", null);
        setField(constructor1, "annotations", null);
        setField(constructor1, "parameterAnnotations", null);
        setField(constructor1, "constructorAccessor", null);
        setField(constructor1, "root", null);
        setField(constructor1, "hasRealParameterData", false);
        setField(constructor1, "parameters", null);
        setField(constructor1, "declaredAnnotations", null);
        setField(constructor1, "override", false);
        setField(constructor1, "securityCheckCache", null);
        setField(constructor, "root", constructor1);
        setField(constructor, "hasRealParameterData", false);
        setField(constructor, "parameters", null);
        setField(constructor, "declaredAnnotations", null);
        setField(constructor, "override", true);
        setField(constructor, "securityCheckCache", null);
        setField(javaBeanInfo, "defaultConstructor", constructor);
        setField(javaBeanInfo, "creatorConstructor", null);
        setField(javaBeanInfo, "factoryMethod", null);
        setField(javaBeanInfo, "buildMethod", null);
        setField(javaBeanInfo, "defaultConstructorParameterSize", 0);
        com.alibaba.fastjson.util.FieldInfo[] fieldInfoArray = new com.alibaba.fastjson.util.FieldInfo[0];
        setField(javaBeanInfo, "fields", fieldInfoArray);
        setField(javaBeanInfo, "sortedFields", fieldInfoArray);
        setField(javaBeanInfo, "parserFeatures", 0);
        setField(javaBeanInfo, "jsonType", null);
        String string = new String("java.lang.Object");
        setField(javaBeanInfo, "typeName", string);
        setField(javaBeanInfo, "typeKey", null);
        setField(javaBeanInfo, "orders", null);
        setField(javaBeanInfo, "creatorConstructorParameterTypes", null);
        setField(javaBeanInfo, "creatorConstructorParameters", null);
        javaBeanInfo.kotlin = false;
        setField(javaBeanInfo, "kotlinDefaultConstructor", null);
        setField(expected, "beanInfo", javaBeanInfo);
        setField(expected, "extraFieldDeserializers", null);
        setField(expected, "alterNameFieldDeserializers", null);
        setField(expected, "smartMatchHashArray", null);
        setField(expected, "smartMatchHashArrayMapping", null);
        setField(expected, "hashArray", null);
        setField(expected, "hashArrayMapping", null);
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
        
        Object parserConfigDeserializers28 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers28DeserializersBuckets = getFieldValue(parserConfigDeserializers28, "buckets");
        Object finalParserConfigDeserializersBuckets0 = get(parserConfigDeserializers28DeserializersBuckets, 0);
        Object parserConfigDeserializers29 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers29DeserializersBuckets = getFieldValue(parserConfigDeserializers29, "buckets");
        Object finalParserConfigDeserializersBuckets1 = get(parserConfigDeserializers29DeserializersBuckets, 1);
        Object parserConfigDeserializers30 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers30DeserializersBuckets = getFieldValue(parserConfigDeserializers30, "buckets");
        Object finalParserConfigDeserializersBuckets2 = get(parserConfigDeserializers30DeserializersBuckets, 2);
        Object parserConfigDeserializers31 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers31DeserializersBuckets = getFieldValue(parserConfigDeserializers31, "buckets");
        Object finalParserConfigDeserializersBuckets3 = get(parserConfigDeserializers31DeserializersBuckets, 3);
        Object parserConfigDeserializers32 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers32DeserializersBuckets = getFieldValue(parserConfigDeserializers32, "buckets");
        Object finalParserConfigDeserializersBuckets4 = get(parserConfigDeserializers32DeserializersBuckets, 4);
        Object parserConfigDeserializers33 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers33DeserializersBuckets = getFieldValue(parserConfigDeserializers33, "buckets");
        Object finalParserConfigDeserializersBuckets5 = get(parserConfigDeserializers33DeserializersBuckets, 5);
        Object parserConfigDeserializers34 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers34DeserializersBuckets = getFieldValue(parserConfigDeserializers34, "buckets");
        Object finalParserConfigDeserializersBuckets6 = get(parserConfigDeserializers34DeserializersBuckets, 6);
        Object parserConfigDeserializers35 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers35DeserializersBuckets = getFieldValue(parserConfigDeserializers35, "buckets");
        Object finalParserConfigDeserializersBuckets7 = get(parserConfigDeserializers35DeserializersBuckets, 7);
        Object parserConfigDeserializers36 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers36DeserializersBuckets = getFieldValue(parserConfigDeserializers36, "buckets");
        Object finalParserConfigDeserializersBuckets8 = get(parserConfigDeserializers36DeserializersBuckets, 8);
        Object parserConfigDeserializers37 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers37DeserializersBuckets = getFieldValue(parserConfigDeserializers37, "buckets");
        Object finalParserConfigDeserializersBuckets9 = get(parserConfigDeserializers37DeserializersBuckets, 9);
        Object parserConfigDeserializers38 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers38DeserializersBuckets = getFieldValue(parserConfigDeserializers38, "buckets");
        Object finalParserConfigDeserializersBuckets10 = get(parserConfigDeserializers38DeserializersBuckets, 10);
        Object parserConfigDeserializers39 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers39DeserializersBuckets = getFieldValue(parserConfigDeserializers39, "buckets");
        Object finalParserConfigDeserializersBuckets11 = get(parserConfigDeserializers39DeserializersBuckets, 11);
        Object parserConfigDeserializers40 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers40DeserializersBuckets = getFieldValue(parserConfigDeserializers40, "buckets");
        Object finalParserConfigDeserializersBuckets12 = get(parserConfigDeserializers40DeserializersBuckets, 12);
        Object parserConfigDeserializers41 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers41DeserializersBuckets = getFieldValue(parserConfigDeserializers41, "buckets");
        Object finalParserConfigDeserializersBuckets13 = get(parserConfigDeserializers41DeserializersBuckets, 13);
        Object parserConfigDeserializers42 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers42DeserializersBuckets = getFieldValue(parserConfigDeserializers42, "buckets");
        Object finalParserConfigDeserializersBuckets14 = get(parserConfigDeserializers42DeserializersBuckets, 14);
        Object parserConfigDeserializers43 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers43DeserializersBuckets = getFieldValue(parserConfigDeserializers43, "buckets");
        Object finalParserConfigDeserializersBuckets15 = get(parserConfigDeserializers43DeserializersBuckets, 15);
        Object parserConfigDeserializers44 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers44DeserializersBuckets = getFieldValue(parserConfigDeserializers44, "buckets");
        Object finalParserConfigDeserializersBuckets16 = get(parserConfigDeserializers44DeserializersBuckets, 16);
        Object parserConfigDeserializers45 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers45DeserializersBuckets = getFieldValue(parserConfigDeserializers45, "buckets");
        Object finalParserConfigDeserializersBuckets17 = get(parserConfigDeserializers45DeserializersBuckets, 17);
        Object parserConfigDeserializers46 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers46DeserializersBuckets = getFieldValue(parserConfigDeserializers46, "buckets");
        Object finalParserConfigDeserializersBuckets18 = get(parserConfigDeserializers46DeserializersBuckets, 18);
        Object parserConfigDeserializers47 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers47DeserializersBuckets = getFieldValue(parserConfigDeserializers47, "buckets");
        Object finalParserConfigDeserializersBuckets19 = get(parserConfigDeserializers47DeserializersBuckets, 19);
        Object parserConfigDeserializers48 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers48DeserializersBuckets = getFieldValue(parserConfigDeserializers48, "buckets");
        Object finalParserConfigDeserializersBuckets20 = get(parserConfigDeserializers48DeserializersBuckets, 20);
        Object parserConfigDeserializers49 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers49DeserializersBuckets = getFieldValue(parserConfigDeserializers49, "buckets");
        Object finalParserConfigDeserializersBuckets21 = get(parserConfigDeserializers49DeserializersBuckets, 21);
        Object parserConfigDeserializers50 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers50DeserializersBuckets = getFieldValue(parserConfigDeserializers50, "buckets");
        Object finalParserConfigDeserializersBuckets22 = get(parserConfigDeserializers50DeserializersBuckets, 22);
        Object parserConfigDeserializers51 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers51DeserializersBuckets = getFieldValue(parserConfigDeserializers51, "buckets");
        Object finalParserConfigDeserializersBuckets23 = get(parserConfigDeserializers51DeserializersBuckets, 23);
        Object parserConfigDeserializers52 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers52DeserializersBuckets = getFieldValue(parserConfigDeserializers52, "buckets");
        Object finalParserConfigDeserializersBuckets24 = get(parserConfigDeserializers52DeserializersBuckets, 24);
        Object parserConfigDeserializers53 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers53DeserializersBuckets = getFieldValue(parserConfigDeserializers53, "buckets");
        Object finalParserConfigDeserializersBuckets25 = get(parserConfigDeserializers53DeserializersBuckets, 25);
        Object parserConfigDeserializers54 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers54DeserializersBuckets = getFieldValue(parserConfigDeserializers54, "buckets");
        Object finalParserConfigDeserializersBuckets26 = get(parserConfigDeserializers54DeserializersBuckets, 26);
        Object parserConfigDeserializers55 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers55DeserializersBuckets = getFieldValue(parserConfigDeserializers55, "buckets");
        Object finalParserConfigDeserializersBuckets27 = get(parserConfigDeserializers55DeserializersBuckets, 27);
        
        assertNull(finalParserConfigDeserializersBuckets0);
        
        assertNull(finalParserConfigDeserializersBuckets1);
        
        assertNull(finalParserConfigDeserializersBuckets2);
        
        assertNull(finalParserConfigDeserializersBuckets3);
        
        assertNull(finalParserConfigDeserializersBuckets4);
        
        assertNull(finalParserConfigDeserializersBuckets5);
        
        assertNull(finalParserConfigDeserializersBuckets6);
        
        assertNull(finalParserConfigDeserializersBuckets7);
        
        assertNull(finalParserConfigDeserializersBuckets8);
        
        assertNull(finalParserConfigDeserializersBuckets9);
        
        assertNull(finalParserConfigDeserializersBuckets10);
        
        assertNull(finalParserConfigDeserializersBuckets11);
        
        assertNull(finalParserConfigDeserializersBuckets12);
        
        assertNull(finalParserConfigDeserializersBuckets13);
        
        assertNull(finalParserConfigDeserializersBuckets14);
        
        assertNull(finalParserConfigDeserializersBuckets15);
        
        assertNull(finalParserConfigDeserializersBuckets16);
        
        assertNull(finalParserConfigDeserializersBuckets17);
        
        assertNull(finalParserConfigDeserializersBuckets18);
        
        assertNull(finalParserConfigDeserializersBuckets19);
        
        assertFalse(initialParserConfigDeserializersBuckets20 == finalParserConfigDeserializersBuckets20);
        
        assertNull(finalParserConfigDeserializersBuckets21);
        
        assertNull(finalParserConfigDeserializersBuckets22);
        
        assertNull(finalParserConfigDeserializersBuckets23);
        
        assertNull(finalParserConfigDeserializersBuckets24);
        
        assertNull(finalParserConfigDeserializersBuckets25);
        
        assertNull(finalParserConfigDeserializersBuckets26);
        
        assertNull(finalParserConfigDeserializersBuckets27);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetDeserializer7() throws Throwable  {
        ParserConfig parserConfig = ((ParserConfig) createInstance("com.alibaba.fastjson.parser.ParserConfig"));
        IdentityHashMap identityHashMap = ((IdentityHashMap) createInstance("com.alibaba.fastjson.util.IdentityHashMap"));
        setField(identityHashMap, "indexMask", -1);
        java.lang.Object[] entryArray = createArray("com.alibaba.fastjson.util.IdentityHashMap$Entry", 9);
        setField(identityHashMap, "buckets", entryArray);
        setField(parserConfig, "deserializers", identityHashMap);
        
        Object parserConfigDeserializers = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializersDeserializersBuckets = getFieldValue(parserConfigDeserializers, "buckets");
        Object initialParserConfigDeserializersBuckets0 = get(parserConfigDeserializersDeserializersBuckets, 0);
        Object parserConfigDeserializers1 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers1DeserializersBuckets = getFieldValue(parserConfigDeserializers1, "buckets");
        Object initialParserConfigDeserializersBuckets1 = get(parserConfigDeserializers1DeserializersBuckets, 1);
        Object parserConfigDeserializers2 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers2DeserializersBuckets = getFieldValue(parserConfigDeserializers2, "buckets");
        Object initialParserConfigDeserializersBuckets2 = get(parserConfigDeserializers2DeserializersBuckets, 2);
        Object parserConfigDeserializers3 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers3DeserializersBuckets = getFieldValue(parserConfigDeserializers3, "buckets");
        Object initialParserConfigDeserializersBuckets3 = get(parserConfigDeserializers3DeserializersBuckets, 3);
        Object parserConfigDeserializers4 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers4DeserializersBuckets = getFieldValue(parserConfigDeserializers4, "buckets");
        Object initialParserConfigDeserializersBuckets4 = get(parserConfigDeserializers4DeserializersBuckets, 4);
        Object parserConfigDeserializers5 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers5DeserializersBuckets = getFieldValue(parserConfigDeserializers5, "buckets");
        Object initialParserConfigDeserializersBuckets5 = get(parserConfigDeserializers5DeserializersBuckets, 5);
        Object parserConfigDeserializers6 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers6DeserializersBuckets = getFieldValue(parserConfigDeserializers6, "buckets");
        Object initialParserConfigDeserializersBuckets6 = get(parserConfigDeserializers6DeserializersBuckets, 6);
        Object parserConfigDeserializers7 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers7DeserializersBuckets = getFieldValue(parserConfigDeserializers7, "buckets");
        Object initialParserConfigDeserializersBuckets7 = get(parserConfigDeserializers7DeserializersBuckets, 7);
        Object parserConfigDeserializers8 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers8DeserializersBuckets = getFieldValue(parserConfigDeserializers8, "buckets");
        Object initialParserConfigDeserializersBuckets8 = get(parserConfigDeserializers8DeserializersBuckets, 8);
        
        parserConfig.getDeserializer(null, null);
        
        Object parserConfigDeserializers9 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers9DeserializersBuckets = getFieldValue(parserConfigDeserializers9, "buckets");
        Object finalParserConfigDeserializersBuckets0 = get(parserConfigDeserializers9DeserializersBuckets, 0);
        Object parserConfigDeserializers10 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers10DeserializersBuckets = getFieldValue(parserConfigDeserializers10, "buckets");
        Object finalParserConfigDeserializersBuckets1 = get(parserConfigDeserializers10DeserializersBuckets, 1);
        Object parserConfigDeserializers11 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers11DeserializersBuckets = getFieldValue(parserConfigDeserializers11, "buckets");
        Object finalParserConfigDeserializersBuckets2 = get(parserConfigDeserializers11DeserializersBuckets, 2);
        Object parserConfigDeserializers12 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers12DeserializersBuckets = getFieldValue(parserConfigDeserializers12, "buckets");
        Object finalParserConfigDeserializersBuckets3 = get(parserConfigDeserializers12DeserializersBuckets, 3);
        Object parserConfigDeserializers13 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers13DeserializersBuckets = getFieldValue(parserConfigDeserializers13, "buckets");
        Object finalParserConfigDeserializersBuckets4 = get(parserConfigDeserializers13DeserializersBuckets, 4);
        Object parserConfigDeserializers14 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers14DeserializersBuckets = getFieldValue(parserConfigDeserializers14, "buckets");
        Object finalParserConfigDeserializersBuckets5 = get(parserConfigDeserializers14DeserializersBuckets, 5);
        Object parserConfigDeserializers15 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers15DeserializersBuckets = getFieldValue(parserConfigDeserializers15, "buckets");
        Object finalParserConfigDeserializersBuckets6 = get(parserConfigDeserializers15DeserializersBuckets, 6);
        Object parserConfigDeserializers16 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers16DeserializersBuckets = getFieldValue(parserConfigDeserializers16, "buckets");
        Object finalParserConfigDeserializersBuckets7 = get(parserConfigDeserializers16DeserializersBuckets, 7);
        Object parserConfigDeserializers17 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers17DeserializersBuckets = getFieldValue(parserConfigDeserializers17, "buckets");
        Object finalParserConfigDeserializersBuckets8 = get(parserConfigDeserializers17DeserializersBuckets, 8);
        
        assertNull(finalParserConfigDeserializersBuckets0);
        
        assertNull(finalParserConfigDeserializersBuckets1);
        
        assertNull(finalParserConfigDeserializersBuckets2);
        
        assertNull(finalParserConfigDeserializersBuckets3);
        
        assertNull(finalParserConfigDeserializersBuckets4);
        
        assertNull(finalParserConfigDeserializersBuckets5);
        
        assertNull(finalParserConfigDeserializersBuckets6);
        
        assertNull(finalParserConfigDeserializersBuckets7);
        
        assertNull(finalParserConfigDeserializersBuckets8);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetDeserializer8() throws Throwable  {
        ParserConfig parserConfig = ((ParserConfig) createInstance("com.alibaba.fastjson.parser.ParserConfig"));
        IdentityHashMap identityHashMap = ((IdentityHashMap) createInstance("com.alibaba.fastjson.util.IdentityHashMap"));
        setField(identityHashMap, "indexMask", 38);
        java.lang.Object[] entryArray = createArray("com.alibaba.fastjson.util.IdentityHashMap$Entry", 39);
        Object entry = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        java.lang.Object[] ofRefArray = createArray("java.util.stream.Nodes$ToArrayTask$OfRef", 0);
        setField(entry, "value", ofRefArray);
        Class class1 = Object.class;
        setField(entry, "key", class1);
        entryArray[38] = entry;
        setField(identityHashMap, "buckets", entryArray);
        setField(parserConfig, "deserializers", identityHashMap);
        
        Object parserConfigDeserializers = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializersDeserializersBuckets = getFieldValue(parserConfigDeserializers, "buckets");
        Object initialParserConfigDeserializersBuckets0 = get(parserConfigDeserializersDeserializersBuckets, 0);
        Object parserConfigDeserializers1 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers1DeserializersBuckets = getFieldValue(parserConfigDeserializers1, "buckets");
        Object initialParserConfigDeserializersBuckets1 = get(parserConfigDeserializers1DeserializersBuckets, 1);
        Object parserConfigDeserializers2 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers2DeserializersBuckets = getFieldValue(parserConfigDeserializers2, "buckets");
        Object initialParserConfigDeserializersBuckets2 = get(parserConfigDeserializers2DeserializersBuckets, 2);
        Object parserConfigDeserializers3 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers3DeserializersBuckets = getFieldValue(parserConfigDeserializers3, "buckets");
        Object initialParserConfigDeserializersBuckets3 = get(parserConfigDeserializers3DeserializersBuckets, 3);
        Object parserConfigDeserializers4 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers4DeserializersBuckets = getFieldValue(parserConfigDeserializers4, "buckets");
        Object initialParserConfigDeserializersBuckets4 = get(parserConfigDeserializers4DeserializersBuckets, 4);
        Object parserConfigDeserializers5 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers5DeserializersBuckets = getFieldValue(parserConfigDeserializers5, "buckets");
        Object initialParserConfigDeserializersBuckets5 = get(parserConfigDeserializers5DeserializersBuckets, 5);
        Object parserConfigDeserializers6 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers6DeserializersBuckets = getFieldValue(parserConfigDeserializers6, "buckets");
        Object initialParserConfigDeserializersBuckets6 = get(parserConfigDeserializers6DeserializersBuckets, 6);
        Object parserConfigDeserializers7 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers7DeserializersBuckets = getFieldValue(parserConfigDeserializers7, "buckets");
        Object initialParserConfigDeserializersBuckets7 = get(parserConfigDeserializers7DeserializersBuckets, 7);
        Object parserConfigDeserializers8 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers8DeserializersBuckets = getFieldValue(parserConfigDeserializers8, "buckets");
        Object initialParserConfigDeserializersBuckets8 = get(parserConfigDeserializers8DeserializersBuckets, 8);
        Object parserConfigDeserializers9 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers9DeserializersBuckets = getFieldValue(parserConfigDeserializers9, "buckets");
        Object initialParserConfigDeserializersBuckets9 = get(parserConfigDeserializers9DeserializersBuckets, 9);
        Object parserConfigDeserializers10 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers10DeserializersBuckets = getFieldValue(parserConfigDeserializers10, "buckets");
        Object initialParserConfigDeserializersBuckets10 = get(parserConfigDeserializers10DeserializersBuckets, 10);
        Object parserConfigDeserializers11 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers11DeserializersBuckets = getFieldValue(parserConfigDeserializers11, "buckets");
        Object initialParserConfigDeserializersBuckets11 = get(parserConfigDeserializers11DeserializersBuckets, 11);
        Object parserConfigDeserializers12 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers12DeserializersBuckets = getFieldValue(parserConfigDeserializers12, "buckets");
        Object initialParserConfigDeserializersBuckets12 = get(parserConfigDeserializers12DeserializersBuckets, 12);
        Object parserConfigDeserializers13 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers13DeserializersBuckets = getFieldValue(parserConfigDeserializers13, "buckets");
        Object initialParserConfigDeserializersBuckets13 = get(parserConfigDeserializers13DeserializersBuckets, 13);
        Object parserConfigDeserializers14 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers14DeserializersBuckets = getFieldValue(parserConfigDeserializers14, "buckets");
        Object initialParserConfigDeserializersBuckets14 = get(parserConfigDeserializers14DeserializersBuckets, 14);
        Object parserConfigDeserializers15 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers15DeserializersBuckets = getFieldValue(parserConfigDeserializers15, "buckets");
        Object initialParserConfigDeserializersBuckets15 = get(parserConfigDeserializers15DeserializersBuckets, 15);
        Object parserConfigDeserializers16 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers16DeserializersBuckets = getFieldValue(parserConfigDeserializers16, "buckets");
        Object initialParserConfigDeserializersBuckets16 = get(parserConfigDeserializers16DeserializersBuckets, 16);
        Object parserConfigDeserializers17 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers17DeserializersBuckets = getFieldValue(parserConfigDeserializers17, "buckets");
        Object initialParserConfigDeserializersBuckets17 = get(parserConfigDeserializers17DeserializersBuckets, 17);
        Object parserConfigDeserializers18 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers18DeserializersBuckets = getFieldValue(parserConfigDeserializers18, "buckets");
        Object initialParserConfigDeserializersBuckets18 = get(parserConfigDeserializers18DeserializersBuckets, 18);
        Object parserConfigDeserializers19 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers19DeserializersBuckets = getFieldValue(parserConfigDeserializers19, "buckets");
        Object initialParserConfigDeserializersBuckets19 = get(parserConfigDeserializers19DeserializersBuckets, 19);
        Object parserConfigDeserializers20 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers20DeserializersBuckets = getFieldValue(parserConfigDeserializers20, "buckets");
        Object initialParserConfigDeserializersBuckets20 = get(parserConfigDeserializers20DeserializersBuckets, 20);
        Object parserConfigDeserializers21 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers21DeserializersBuckets = getFieldValue(parserConfigDeserializers21, "buckets");
        Object initialParserConfigDeserializersBuckets21 = get(parserConfigDeserializers21DeserializersBuckets, 21);
        Object parserConfigDeserializers22 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers22DeserializersBuckets = getFieldValue(parserConfigDeserializers22, "buckets");
        Object initialParserConfigDeserializersBuckets22 = get(parserConfigDeserializers22DeserializersBuckets, 22);
        Object parserConfigDeserializers23 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers23DeserializersBuckets = getFieldValue(parserConfigDeserializers23, "buckets");
        Object initialParserConfigDeserializersBuckets23 = get(parserConfigDeserializers23DeserializersBuckets, 23);
        Object parserConfigDeserializers24 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers24DeserializersBuckets = getFieldValue(parserConfigDeserializers24, "buckets");
        Object initialParserConfigDeserializersBuckets24 = get(parserConfigDeserializers24DeserializersBuckets, 24);
        Object parserConfigDeserializers25 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers25DeserializersBuckets = getFieldValue(parserConfigDeserializers25, "buckets");
        Object initialParserConfigDeserializersBuckets25 = get(parserConfigDeserializers25DeserializersBuckets, 25);
        Object parserConfigDeserializers26 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers26DeserializersBuckets = getFieldValue(parserConfigDeserializers26, "buckets");
        Object initialParserConfigDeserializersBuckets26 = get(parserConfigDeserializers26DeserializersBuckets, 26);
        Object parserConfigDeserializers27 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers27DeserializersBuckets = getFieldValue(parserConfigDeserializers27, "buckets");
        Object initialParserConfigDeserializersBuckets27 = get(parserConfigDeserializers27DeserializersBuckets, 27);
        Object parserConfigDeserializers28 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers28DeserializersBuckets = getFieldValue(parserConfigDeserializers28, "buckets");
        Object initialParserConfigDeserializersBuckets28 = get(parserConfigDeserializers28DeserializersBuckets, 28);
        Object parserConfigDeserializers29 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers29DeserializersBuckets = getFieldValue(parserConfigDeserializers29, "buckets");
        Object initialParserConfigDeserializersBuckets29 = get(parserConfigDeserializers29DeserializersBuckets, 29);
        Object parserConfigDeserializers30 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers30DeserializersBuckets = getFieldValue(parserConfigDeserializers30, "buckets");
        Object initialParserConfigDeserializersBuckets30 = get(parserConfigDeserializers30DeserializersBuckets, 30);
        Object parserConfigDeserializers31 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers31DeserializersBuckets = getFieldValue(parserConfigDeserializers31, "buckets");
        Object initialParserConfigDeserializersBuckets31 = get(parserConfigDeserializers31DeserializersBuckets, 31);
        Object parserConfigDeserializers32 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers32DeserializersBuckets = getFieldValue(parserConfigDeserializers32, "buckets");
        Object initialParserConfigDeserializersBuckets32 = get(parserConfigDeserializers32DeserializersBuckets, 32);
        Object parserConfigDeserializers33 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers33DeserializersBuckets = getFieldValue(parserConfigDeserializers33, "buckets");
        Object initialParserConfigDeserializersBuckets33 = get(parserConfigDeserializers33DeserializersBuckets, 33);
        Object parserConfigDeserializers34 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers34DeserializersBuckets = getFieldValue(parserConfigDeserializers34, "buckets");
        Object initialParserConfigDeserializersBuckets34 = get(parserConfigDeserializers34DeserializersBuckets, 34);
        Object parserConfigDeserializers35 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers35DeserializersBuckets = getFieldValue(parserConfigDeserializers35, "buckets");
        Object initialParserConfigDeserializersBuckets35 = get(parserConfigDeserializers35DeserializersBuckets, 35);
        Object parserConfigDeserializers36 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers36DeserializersBuckets = getFieldValue(parserConfigDeserializers36, "buckets");
        Object initialParserConfigDeserializersBuckets36 = get(parserConfigDeserializers36DeserializersBuckets, 36);
        Object parserConfigDeserializers37 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers37DeserializersBuckets = getFieldValue(parserConfigDeserializers37, "buckets");
        Object initialParserConfigDeserializersBuckets37 = get(parserConfigDeserializers37DeserializersBuckets, 37);
        
        parserConfig.getDeserializer(null, class1);
        
        Object parserConfigDeserializers38 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers38DeserializersBuckets = getFieldValue(parserConfigDeserializers38, "buckets");
        Object finalParserConfigDeserializersBuckets0 = get(parserConfigDeserializers38DeserializersBuckets, 0);
        Object parserConfigDeserializers39 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers39DeserializersBuckets = getFieldValue(parserConfigDeserializers39, "buckets");
        Object finalParserConfigDeserializersBuckets1 = get(parserConfigDeserializers39DeserializersBuckets, 1);
        Object parserConfigDeserializers40 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers40DeserializersBuckets = getFieldValue(parserConfigDeserializers40, "buckets");
        Object finalParserConfigDeserializersBuckets2 = get(parserConfigDeserializers40DeserializersBuckets, 2);
        Object parserConfigDeserializers41 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers41DeserializersBuckets = getFieldValue(parserConfigDeserializers41, "buckets");
        Object finalParserConfigDeserializersBuckets3 = get(parserConfigDeserializers41DeserializersBuckets, 3);
        Object parserConfigDeserializers42 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers42DeserializersBuckets = getFieldValue(parserConfigDeserializers42, "buckets");
        Object finalParserConfigDeserializersBuckets4 = get(parserConfigDeserializers42DeserializersBuckets, 4);
        Object parserConfigDeserializers43 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers43DeserializersBuckets = getFieldValue(parserConfigDeserializers43, "buckets");
        Object finalParserConfigDeserializersBuckets5 = get(parserConfigDeserializers43DeserializersBuckets, 5);
        Object parserConfigDeserializers44 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers44DeserializersBuckets = getFieldValue(parserConfigDeserializers44, "buckets");
        Object finalParserConfigDeserializersBuckets6 = get(parserConfigDeserializers44DeserializersBuckets, 6);
        Object parserConfigDeserializers45 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers45DeserializersBuckets = getFieldValue(parserConfigDeserializers45, "buckets");
        Object finalParserConfigDeserializersBuckets7 = get(parserConfigDeserializers45DeserializersBuckets, 7);
        Object parserConfigDeserializers46 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers46DeserializersBuckets = getFieldValue(parserConfigDeserializers46, "buckets");
        Object finalParserConfigDeserializersBuckets8 = get(parserConfigDeserializers46DeserializersBuckets, 8);
        Object parserConfigDeserializers47 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers47DeserializersBuckets = getFieldValue(parserConfigDeserializers47, "buckets");
        Object finalParserConfigDeserializersBuckets9 = get(parserConfigDeserializers47DeserializersBuckets, 9);
        Object parserConfigDeserializers48 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers48DeserializersBuckets = getFieldValue(parserConfigDeserializers48, "buckets");
        Object finalParserConfigDeserializersBuckets10 = get(parserConfigDeserializers48DeserializersBuckets, 10);
        Object parserConfigDeserializers49 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers49DeserializersBuckets = getFieldValue(parserConfigDeserializers49, "buckets");
        Object finalParserConfigDeserializersBuckets11 = get(parserConfigDeserializers49DeserializersBuckets, 11);
        Object parserConfigDeserializers50 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers50DeserializersBuckets = getFieldValue(parserConfigDeserializers50, "buckets");
        Object finalParserConfigDeserializersBuckets12 = get(parserConfigDeserializers50DeserializersBuckets, 12);
        Object parserConfigDeserializers51 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers51DeserializersBuckets = getFieldValue(parserConfigDeserializers51, "buckets");
        Object finalParserConfigDeserializersBuckets13 = get(parserConfigDeserializers51DeserializersBuckets, 13);
        Object parserConfigDeserializers52 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers52DeserializersBuckets = getFieldValue(parserConfigDeserializers52, "buckets");
        Object finalParserConfigDeserializersBuckets14 = get(parserConfigDeserializers52DeserializersBuckets, 14);
        Object parserConfigDeserializers53 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers53DeserializersBuckets = getFieldValue(parserConfigDeserializers53, "buckets");
        Object finalParserConfigDeserializersBuckets15 = get(parserConfigDeserializers53DeserializersBuckets, 15);
        Object parserConfigDeserializers54 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers54DeserializersBuckets = getFieldValue(parserConfigDeserializers54, "buckets");
        Object finalParserConfigDeserializersBuckets16 = get(parserConfigDeserializers54DeserializersBuckets, 16);
        Object parserConfigDeserializers55 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers55DeserializersBuckets = getFieldValue(parserConfigDeserializers55, "buckets");
        Object finalParserConfigDeserializersBuckets17 = get(parserConfigDeserializers55DeserializersBuckets, 17);
        Object parserConfigDeserializers56 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers56DeserializersBuckets = getFieldValue(parserConfigDeserializers56, "buckets");
        Object finalParserConfigDeserializersBuckets18 = get(parserConfigDeserializers56DeserializersBuckets, 18);
        Object parserConfigDeserializers57 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers57DeserializersBuckets = getFieldValue(parserConfigDeserializers57, "buckets");
        Object finalParserConfigDeserializersBuckets19 = get(parserConfigDeserializers57DeserializersBuckets, 19);
        Object parserConfigDeserializers58 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers58DeserializersBuckets = getFieldValue(parserConfigDeserializers58, "buckets");
        Object finalParserConfigDeserializersBuckets20 = get(parserConfigDeserializers58DeserializersBuckets, 20);
        Object parserConfigDeserializers59 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers59DeserializersBuckets = getFieldValue(parserConfigDeserializers59, "buckets");
        Object finalParserConfigDeserializersBuckets21 = get(parserConfigDeserializers59DeserializersBuckets, 21);
        Object parserConfigDeserializers60 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers60DeserializersBuckets = getFieldValue(parserConfigDeserializers60, "buckets");
        Object finalParserConfigDeserializersBuckets22 = get(parserConfigDeserializers60DeserializersBuckets, 22);
        Object parserConfigDeserializers61 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers61DeserializersBuckets = getFieldValue(parserConfigDeserializers61, "buckets");
        Object finalParserConfigDeserializersBuckets23 = get(parserConfigDeserializers61DeserializersBuckets, 23);
        Object parserConfigDeserializers62 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers62DeserializersBuckets = getFieldValue(parserConfigDeserializers62, "buckets");
        Object finalParserConfigDeserializersBuckets24 = get(parserConfigDeserializers62DeserializersBuckets, 24);
        Object parserConfigDeserializers63 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers63DeserializersBuckets = getFieldValue(parserConfigDeserializers63, "buckets");
        Object finalParserConfigDeserializersBuckets25 = get(parserConfigDeserializers63DeserializersBuckets, 25);
        Object parserConfigDeserializers64 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers64DeserializersBuckets = getFieldValue(parserConfigDeserializers64, "buckets");
        Object finalParserConfigDeserializersBuckets26 = get(parserConfigDeserializers64DeserializersBuckets, 26);
        Object parserConfigDeserializers65 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers65DeserializersBuckets = getFieldValue(parserConfigDeserializers65, "buckets");
        Object finalParserConfigDeserializersBuckets27 = get(parserConfigDeserializers65DeserializersBuckets, 27);
        Object parserConfigDeserializers66 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers66DeserializersBuckets = getFieldValue(parserConfigDeserializers66, "buckets");
        Object finalParserConfigDeserializersBuckets28 = get(parserConfigDeserializers66DeserializersBuckets, 28);
        Object parserConfigDeserializers67 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers67DeserializersBuckets = getFieldValue(parserConfigDeserializers67, "buckets");
        Object finalParserConfigDeserializersBuckets29 = get(parserConfigDeserializers67DeserializersBuckets, 29);
        Object parserConfigDeserializers68 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers68DeserializersBuckets = getFieldValue(parserConfigDeserializers68, "buckets");
        Object finalParserConfigDeserializersBuckets30 = get(parserConfigDeserializers68DeserializersBuckets, 30);
        Object parserConfigDeserializers69 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers69DeserializersBuckets = getFieldValue(parserConfigDeserializers69, "buckets");
        Object finalParserConfigDeserializersBuckets31 = get(parserConfigDeserializers69DeserializersBuckets, 31);
        Object parserConfigDeserializers70 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers70DeserializersBuckets = getFieldValue(parserConfigDeserializers70, "buckets");
        Object finalParserConfigDeserializersBuckets32 = get(parserConfigDeserializers70DeserializersBuckets, 32);
        Object parserConfigDeserializers71 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers71DeserializersBuckets = getFieldValue(parserConfigDeserializers71, "buckets");
        Object finalParserConfigDeserializersBuckets33 = get(parserConfigDeserializers71DeserializersBuckets, 33);
        Object parserConfigDeserializers72 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers72DeserializersBuckets = getFieldValue(parserConfigDeserializers72, "buckets");
        Object finalParserConfigDeserializersBuckets34 = get(parserConfigDeserializers72DeserializersBuckets, 34);
        Object parserConfigDeserializers73 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers73DeserializersBuckets = getFieldValue(parserConfigDeserializers73, "buckets");
        Object finalParserConfigDeserializersBuckets35 = get(parserConfigDeserializers73DeserializersBuckets, 35);
        Object parserConfigDeserializers74 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers74DeserializersBuckets = getFieldValue(parserConfigDeserializers74, "buckets");
        Object finalParserConfigDeserializersBuckets36 = get(parserConfigDeserializers74DeserializersBuckets, 36);
        Object parserConfigDeserializers75 = getFieldValue(parserConfig, "deserializers");
        Object parserConfigDeserializers75DeserializersBuckets = getFieldValue(parserConfigDeserializers75, "buckets");
        Object finalParserConfigDeserializersBuckets37 = get(parserConfigDeserializers75DeserializersBuckets, 37);
        
        assertNull(finalParserConfigDeserializersBuckets0);
        
        assertNull(finalParserConfigDeserializersBuckets1);
        
        assertNull(finalParserConfigDeserializersBuckets2);
        
        assertNull(finalParserConfigDeserializersBuckets3);
        
        assertNull(finalParserConfigDeserializersBuckets4);
        
        assertNull(finalParserConfigDeserializersBuckets5);
        
        assertNull(finalParserConfigDeserializersBuckets6);
        
        assertNull(finalParserConfigDeserializersBuckets7);
        
        assertNull(finalParserConfigDeserializersBuckets8);
        
        assertNull(finalParserConfigDeserializersBuckets9);
        
        assertNull(finalParserConfigDeserializersBuckets10);
        
        assertNull(finalParserConfigDeserializersBuckets11);
        
        assertNull(finalParserConfigDeserializersBuckets12);
        
        assertNull(finalParserConfigDeserializersBuckets13);
        
        assertNull(finalParserConfigDeserializersBuckets14);
        
        assertNull(finalParserConfigDeserializersBuckets15);
        
        assertNull(finalParserConfigDeserializersBuckets16);
        
        assertNull(finalParserConfigDeserializersBuckets17);
        
        assertNull(finalParserConfigDeserializersBuckets18);
        
        assertNull(finalParserConfigDeserializersBuckets19);
        
        assertNull(finalParserConfigDeserializersBuckets20);
        
        assertNull(finalParserConfigDeserializersBuckets21);
        
        assertNull(finalParserConfigDeserializersBuckets22);
        
        assertNull(finalParserConfigDeserializersBuckets23);
        
        assertNull(finalParserConfigDeserializersBuckets24);
        
        assertNull(finalParserConfigDeserializersBuckets25);
        
        assertNull(finalParserConfigDeserializersBuckets26);
        
        assertNull(finalParserConfigDeserializersBuckets27);
        
        assertNull(finalParserConfigDeserializersBuckets28);
        
        assertNull(finalParserConfigDeserializersBuckets29);
        
        assertNull(finalParserConfigDeserializersBuckets30);
        
        assertNull(finalParserConfigDeserializersBuckets31);
        
        assertNull(finalParserConfigDeserializersBuckets32);
        
        assertNull(finalParserConfigDeserializersBuckets33);
        
        assertNull(finalParserConfigDeserializersBuckets34);
        
        assertNull(finalParserConfigDeserializersBuckets35);
        
        assertNull(finalParserConfigDeserializersBuckets36);
        
        assertNull(finalParserConfigDeserializersBuckets37);
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
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testConfigFromPropety2() throws Throwable  {
        ParserConfig parserConfig = ((ParserConfig) createInstance("com.alibaba.fastjson.parser.ParserConfig"));
        
        parserConfig.configFromPropety(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testConfigFromPropety3() throws Throwable  {
        ParserConfig parserConfig = ((ParserConfig) createInstance("com.alibaba.fastjson.parser.ParserConfig"));
        ManagedProperties managedProperties = ((ManagedProperties) createInstance("org.springframework.beans.factory.support.ManagedProperties"));
        java.lang.Object[] entryArray = createArray("java.util.Hashtable$Entry", 1);
        Object entry = createInstance("java.util.Hashtable$Entry");
        setField(entry, "next", null);
        setField(entry, "hash", 0);
        entryArray[0] = entry;
        setField(managedProperties, "table", entryArray);
        setField(managedProperties, "defaults", null);
        
        parserConfig.configFromPropety(managedProperties);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testInitDeserializers1() throws Throwable  {
        ParserConfig parserConfig = new ParserConfig();
        
        Class parserConfigClazz = Class.forName("com.alibaba.fastjson.parser.ParserConfig");
        Method initDeserializersMethod = parserConfigClazz.getDeclaredMethod("initDeserializers");
        initDeserializersMethod.setAccessible(true);
        java.lang.Object[] initDeserializersMethodArguments = new java.lang.Object[0];
        initDeserializersMethod.invoke(parserConfig, initDeserializersMethodArguments);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIsAutoTypeSupport1() throws Throwable  {
        ParserConfig parserConfig = new ParserConfig();
        
        boolean actual = parserConfig.isAutoTypeSupport();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIsAutoTypeSupport2() throws Throwable  {
        ParserConfig parserConfig = ((ParserConfig) createInstance("com.alibaba.fastjson.parser.ParserConfig"));
        setField(parserConfig, "autoTypeSupport", false);
        
        boolean actual = parserConfig.isAutoTypeSupport();
        
        assertFalse(actual);
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
        ParserConfig parserConfig = ((ParserConfig) createInstance("com.alibaba.fastjson.parser.ParserConfig"));
        long[] longArray = new long[10];
        longArray[4] = -5818171002830986604L;
        setField(parserConfig, "denyHashCodes", longArray);
        String string = new String("\u2239");
        
        parserConfig.addDeny(string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testAddDeny5() throws Throwable  {
        ParserConfig parserConfig = ((ParserConfig) createInstance("com.alibaba.fastjson.parser.ParserConfig"));
        long[] longArray = new long[1];
        longArray[0] = 4611642366645880257L;
        setField(parserConfig, "denyHashCodes", longArray);
        String string = new String("\uE065");
        
        parserConfig.addDeny(string);
        
        Object finalParserConfigDenyHashCodes = getFieldValue(parserConfig, "denyHashCodes");
        
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
        ParserConfig parserConfig = ((ParserConfig) createInstance("com.alibaba.fastjson.parser.ParserConfig"));
        long[] longArray = new long[10];
        longArray[4] = -5818171002830986604L;
        setField(parserConfig, "acceptHashCodes", longArray);
        String string = new String("\u2239");
        
        parserConfig.addAccept(string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testAddAccept5() throws Throwable  {
        ParserConfig parserConfig = ((ParserConfig) createInstance("com.alibaba.fastjson.parser.ParserConfig"));
        long[] longArray = new long[1];
        longArray[0] = 2991797581311647616L;
        setField(parserConfig, "acceptHashCodes", longArray);
        String string = new String("\u3512");
        
        parserConfig.addAccept(string);
        
        Object finalParserConfigAcceptHashCodes = getFieldValue(parserConfig, "acceptHashCodes");
        
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
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCheckAutoType3() throws Throwable  {
        ParserConfig parserConfig = ((ParserConfig) createInstance("com.alibaba.fastjson.parser.ParserConfig"));
        String string = new String("\u0000\u0000$");
        Class class1 = Object.class;
        
        parserConfig.checkAutoType(string, class1, 0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCheckAutoType4() throws Throwable  {
        ParserConfig parserConfig = ((ParserConfig) createInstance("com.alibaba.fastjson.parser.ParserConfig"));
        String string = new String("$$\u0000");
        
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
        
        assertFalse(actual);
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
        String string = new String("");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(null, null);
        
        ParserConfig.getFieldFromCache(string, linkedHashMap);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSplitItemsFormProperty1() throws Throwable  {
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
    public void testSplitItemsFormProperty2() throws Throwable  {
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
    public void testSplitItemsFormProperty3() throws Throwable  {
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
    
    @Test(timeout = 10000)
    public void testParserConfig1() throws Throwable  {
        ASMDeserializerFactory aSMDeserializerFactory = ((ASMDeserializerFactory) createInstance("com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory"));
        ParserConfig actual = new ParserConfig(aSMDeserializerFactory);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testParserConfig2() throws Throwable  {
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
    public void testParserConfig3() {
        ParserConfig actual = new ParserConfig(((ClassLoader) null));
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
    private static sun.misc.Unsafe getUnsafeInstance() throws Exception {
        java.lang.reflect.Field f = sun.misc.Unsafe.class.getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return (sun.misc.Unsafe) f.get(null);
    }
}
