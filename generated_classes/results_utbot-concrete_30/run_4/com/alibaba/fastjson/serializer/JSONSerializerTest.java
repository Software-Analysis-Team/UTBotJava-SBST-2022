package com.alibaba.fastjson.serializer;

import org.junit.Test;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.util.List;
import java.util.ArrayList;
import java.lang.reflect.Method;
import com.alibaba.fastjson.util.IdentityHashMap;
import com.alibaba.fastjson.util.FieldInfo;
import java.io.PrintWriter;
import java.io.Writer;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import sun.misc.Unsafe;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static java.lang.reflect.Array.get;

public class JSONSerializerTest {
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
        JSONSerializer jSONSerializer = new JSONSerializer();
        SerialContext serialContext = ((SerialContext) createInstance("com.alibaba.fastjson.serializer.SerialContext"));
        
        jSONSerializer.setContext(serialContext);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetContext3() throws Throwable  {
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        setField(jSONSerializer, "context", null);
        SerialContext serialContext = ((SerialContext) createInstance("com.alibaba.fastjson.serializer.SerialContext"));
        
        SerialContext initialJSONSerializerContext = jSONSerializer.context;
        
        jSONSerializer.setContext(serialContext);
        
        SerialContext finalJSONSerializerContext = jSONSerializer.context;
        
        assertFalse(initialJSONSerializerContext == finalJSONSerializerContext);
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
        setField(jSONSerializer, "dateFormat", simpleDateFormat);
        
        String actual = jSONSerializer.getDateFormatPattern();
        
        assertNull(actual);
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
    public void testConfig2() throws Throwable  {
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
        String string = new String("");
        
        jSONSerializer.setDateFormat(string);
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
        SimpleDateFormat simpleDateFormat = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        
        Object initialJSONSerializerDateFormat = getFieldValue(jSONSerializer, "dateFormat");
        
        jSONSerializer.setDateFormat(simpleDateFormat);
        
        Object finalJSONSerializerDateFormat = getFieldValue(jSONSerializer, "dateFormat");
        
        assertFalse(initialJSONSerializerDateFormat == finalJSONSerializerDateFormat);
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
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testHasNameFilters1() throws Throwable  {
        JSONSerializer jSONSerializer = new JSONSerializer();
        
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
        java.lang.Object[] forEachOrderedTaskArray = createArray("java.util.stream.ForEachOps$ForEachOrderedTask", 0);
        
        jSONSerializer.writeWithFormat(forEachOrderedTaskArray, null);
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
        
        SerializeConfig serializeConfig1 = jSONSerializer.config;
        Object serializeConfig1ConfigSerializers = getFieldValue(serializeConfig1, "serializers");
        Object serializeConfig1ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig1ConfigSerializers, "buckets");
        Object serializeConfig1ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0 = get(serializeConfig1ConfigSerializersConfigSerializersBuckets, 0);
        Object initialJSONSerializerConfigSerializersBuckets0Value = getFieldValue(serializeConfig1ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0, "value");
        
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
        
        SerializeConfig serializeConfig2 = jSONSerializer.config;
        Object serializeConfig2ConfigSerializers = getFieldValue(serializeConfig2, "serializers");
        Object serializeConfig2ConfigSerializersConfigSerializersBuckets = getFieldValue(serializeConfig2ConfigSerializers, "buckets");
        Object serializeConfig2ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0 = get(serializeConfig2ConfigSerializersConfigSerializersBuckets, 0);
        Object finalJSONSerializerConfigSerializersBuckets0Value = getFieldValue(serializeConfig2ConfigSerializersConfigSerializersBucketsConfigSerializersBuckets0, "value");
        
        assertFalse(initialJSONSerializerConfigSerializersBuckets0Value == finalJSONSerializerConfigSerializersBuckets0Value);
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
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testWriteWithFieldName2() throws Throwable  {
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        java.lang.Object[] forEachOrderedTaskArray = createArray("java.util.stream.ForEachOps$ForEachOrderedTask", 0);
        
        jSONSerializer.writeWithFieldName(forEachOrderedTaskArray, forEachOrderedTaskArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testWriteWithFieldName3() throws Throwable  {
        JSONSerializer jSONSerializer = new JSONSerializer();
        Object object = new Object();
        Object object1 = new Object();
        
        jSONSerializer.writeWithFieldName(object, object1, null, 0);
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
        setField(jSONSerializer, "indentCount", 0);
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
            setField(jSONSerializer, "out", serializeWriter);
            String string = new String("");
            
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
            serializeWriter.useSingleQuotes = false;
            setField(jSONSerializer, "out", serializeWriter);
            String string = new String("");
            
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
            setField(jSONSerializer, "out", serializeWriter);
            
            jSONSerializer.write(((String) null));
        } finally {
            StringCodec.instance = prevInstance;
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testWrite6() throws Throwable  {
        JSONSerializer jSONSerializer = new JSONSerializer();
        Object object = new Object();
        
        jSONSerializer.write(object);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testWrite7() throws Throwable  {
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        JSONSerializerMap jSONSerializerMap = ((JSONSerializerMap) createInstance("com.alibaba.fastjson.serializer.JSONSerializerMap"));
        setField(jSONSerializer, "config", jSONSerializerMap);
        java.lang.Object[] forEachOrderedTaskArray = createArray("java.util.stream.ForEachOps$ForEachOrderedTask", 0);
        
        jSONSerializer.write(forEachOrderedTaskArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testWrite8() throws Throwable  {
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        SerializeWriter serializeWriter = ((SerializeWriter) createInstance("com.alibaba.fastjson.serializer.SerializeWriter"));
        setField(jSONSerializer, "out", serializeWriter);
        
        jSONSerializer.write(null);
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
        SerializeWriter serializeWriter = ((SerializeWriter) createInstance("com.alibaba.fastjson.serializer.SerializeWriter"));
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(serializeWriter, "writer", printWriter);
        serializeWriter.count = 0;
        char[] charArray = new char[9];
        serializeWriter.buf = charArray;
        setField(jSONSerializer, "out", serializeWriter);
        
        jSONSerializer.close();
        
        char[] finalJSONSerializerOutBuf = jSONSerializer.out.buf;
        
        assertNull(finalJSONSerializerOutBuf);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testClose3() throws Throwable  {
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        SerializeWriter serializeWriter = ((SerializeWriter) createInstance("com.alibaba.fastjson.serializer.SerializeWriter"));
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(serializeWriter, "writer", printWriter);
        serializeWriter.count = 1;
        setField(serializeWriter, "buf", null);
        setField(jSONSerializer, "out", serializeWriter);
        
        jSONSerializer.close();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testWrite9() throws Throwable  {
        Object object = new Object();
        
        JSONSerializer.write(((Writer) null), object);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testWrite10() throws Throwable  {
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
    
    ///region
    
    @Test(timeout = 10000)
    public void testJSONSerializer1() {
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
    public void testJSONSerializer3() {
        SerializeWriter serializeWriter = new SerializeWriter();
        SerializeConfig serializeConfig = new SerializeConfig();
        JSONSerializer actual = new JSONSerializer(serializeWriter, serializeConfig);
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
    private static sun.misc.Unsafe getUnsafeInstance() throws Exception {
        java.lang.reflect.Field f = sun.misc.Unsafe.class.getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return (sun.misc.Unsafe) f.get(null);
    }
}
