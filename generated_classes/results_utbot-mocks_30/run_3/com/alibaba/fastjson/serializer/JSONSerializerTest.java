package com.alibaba.fastjson.serializer;

import org.junit.Test;
import java.lang.reflect.Method;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.io.Writer;
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
import static org.mockito.Mockito.mock;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

public class JSONSerializerTest {
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
    public void testWriteWithFormat1() throws Throwable  {
        JSONSerializer jSONSerializer = new JSONSerializer();
        Object object = new Object();
        String string = new String();
        
        jSONSerializer.writeWithFormat(object, string);
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
    
    @Test(timeout = 10000)
    public void testIsWriteClassName1() throws Throwable  {
        JSONSerializer jSONSerializer = new JSONSerializer();
        Object object = new Object();
        
        boolean actual = jSONSerializer.isWriteClassName(null, object);
        
        assertFalse(actual);
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
        Object object = new Object();
        Object object1 = new Object();
        
        jSONSerializer.setContext(object, object1);
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
        
        jSONSerializer.setContext(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetContext4() throws Throwable  {
        JSONSerializer jSONSerializer = new JSONSerializer();
        SerialContext serialContext = ((SerialContext) createInstance("com.alibaba.fastjson.serializer.SerialContext"));
        Object object = new Object();
        Object object1 = new Object();
        
        jSONSerializer.setContext(serialContext, object, object1, 0, 0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetContext5() throws Throwable  {
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
    public void testSetContext6() throws Throwable  {
        JSONSerializer jSONSerializer = new JSONSerializer();
        SerialContext serialContext = ((SerialContext) createInstance("com.alibaba.fastjson.serializer.SerialContext"));
        Object object = new Object();
        Object object1 = new Object();
        
        jSONSerializer.setContext(serialContext, object, object1, 0);
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
        JSONSerializer jSONSerializer = new JSONSerializer();
        Object object = new Object();
        Object object1 = new Object();
        
        jSONSerializer.writeWithFieldName(object, object1);
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
    public void testWrite4() throws Throwable  {
        Object object = new Object();
        
        JSONSerializer.write(((Writer) null), object);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testWrite5() throws Throwable  {
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
