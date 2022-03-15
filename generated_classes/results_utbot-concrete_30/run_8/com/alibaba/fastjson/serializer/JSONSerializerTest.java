package com.alibaba.fastjson.serializer;

import org.junit.Test;
import java.text.DateFormat;
import java.lang.reflect.Method;
import java.io.Writer;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import sun.misc.Unsafe;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

public class JSONSerializerTest {
    ///region
    
    @Test(timeout = 10000)
    public void testSetDateFormat1() throws Throwable  {
        JSONSerializer jSONSerializer = new JSONSerializer();
        
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
    public void testContainsReference1() throws Throwable  {
        JSONSerializer jSONSerializer = new JSONSerializer();
        Object object = new Object();
        
        boolean actual = jSONSerializer.containsReference(object);
        
        assertFalse(actual);
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
    public void testGetObjectWriter1() throws Throwable  {
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        JSONSerializerMap jSONSerializerMap = ((JSONSerializerMap) createInstance("com.alibaba.fastjson.serializer.JSONSerializerMap"));
        setField(jSONSerializer, "config", jSONSerializerMap);
        Class class1 = Object.class;
        
        jSONSerializer.getObjectWriter(class1);
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
    
    @Test(timeout = 10000)
    public void testGetIndentCount1() throws Throwable  {
        JSONSerializer jSONSerializer = new JSONSerializer();
        
        int actual = jSONSerializer.getIndentCount();
        
        assertEquals(0, actual);
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
    public void testPrintln1() throws Throwable  {
        JSONSerializer jSONSerializer = new JSONSerializer();
        
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
    public void testGetContext1() throws Throwable  {
        JSONSerializer jSONSerializer = new JSONSerializer();
        
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
    public void testWrite3() throws Throwable  {
        Object object = new Object();
        
        JSONSerializer.write(((Writer) null), object);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testWrite4() throws Throwable  {
        SerializeWriter serializeWriter = new SerializeWriter();
        Object object = new Object();
        
        JSONSerializer.write(serializeWriter, object);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testWrite5() throws Throwable  {
        SerializeWriter serializeWriter = ((SerializeWriter) createInstance("com.alibaba.fastjson.serializer.SerializeWriter"));
        
        JSONSerializer.write(serializeWriter, null);
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
    private static sun.misc.Unsafe getUnsafeInstance() throws Exception {
        java.lang.reflect.Field f = sun.misc.Unsafe.class.getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return (sun.misc.Unsafe) f.get(null);
    }
}
