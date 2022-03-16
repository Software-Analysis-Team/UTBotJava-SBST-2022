package com.alibaba.fastjson.serializer;

import org.junit.Test;
import java.io.StringWriter;
import java.io.PrintWriter;
import java.io.FileWriter;
import sun.nio.cs.StreamEncoder;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import sun.misc.Unsafe;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;

public class ClobSeriliazerTest {
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testWrite1() throws Throwable  {
        ClobSeriliazer clobSeriliazer = ((ClobSeriliazer) createInstance("com.alibaba.fastjson.serializer.ClobSeriliazer"));
        
        clobSeriliazer.write(null, null, null, null, 0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testWrite2() throws Throwable  {
        ClobSeriliazer clobSeriliazer = ((ClobSeriliazer) createInstance("com.alibaba.fastjson.serializer.ClobSeriliazer"));
        java.lang.Object[] runnableAdapterArray = createArray("java.util.concurrent.Executors$RunnableAdapter", 0);
        
        clobSeriliazer.write(null, runnableAdapterArray, null, null, 0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testWrite3() throws Throwable  {
        ClobSeriliazer clobSeriliazer = ((ClobSeriliazer) createInstance("com.alibaba.fastjson.serializer.ClobSeriliazer"));
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        SerializeWriter serializeWriter = ((SerializeWriter) createInstance("com.alibaba.fastjson.serializer.SerializeWriter"));
        serializeWriter.count = -1073741827;
        char[] charArray = new char[0];
        serializeWriter.buf = charArray;
        setField(jSONSerializer, "out", serializeWriter);
        
        clobSeriliazer.write(jSONSerializer, null, null, null, 0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testWrite4() throws Throwable  {
        ClobSeriliazer clobSeriliazer = ((ClobSeriliazer) createInstance("com.alibaba.fastjson.serializer.ClobSeriliazer"));
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        SerializeWriter serializeWriter = ((SerializeWriter) createInstance("com.alibaba.fastjson.serializer.SerializeWriter"));
        StringWriter stringWriter = ((StringWriter) createInstance("java.io.StringWriter"));
        setField(serializeWriter, "writer", stringWriter);
        serializeWriter.count = 2147483642;
        char[] charArray = new char[0];
        serializeWriter.buf = charArray;
        setField(jSONSerializer, "out", serializeWriter);
        
        clobSeriliazer.write(jSONSerializer, null, null, null, 0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testWrite5() throws Throwable  {
        ClobSeriliazer clobSeriliazer = ((ClobSeriliazer) createInstance("com.alibaba.fastjson.serializer.ClobSeriliazer"));
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        SerializeWriter serializeWriter = ((SerializeWriter) createInstance("com.alibaba.fastjson.serializer.SerializeWriter"));
        setField(serializeWriter, "lock", null);
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(printWriter, "lock", null);
        FileWriter fileWriter = ((FileWriter) createInstance("java.io.FileWriter"));
        setField(fileWriter, "lock", null);
        StreamEncoder streamEncoder = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(streamEncoder, "lock", null);
        setField(streamEncoder, "isOpen", true);
        setField(fileWriter, "se", streamEncoder);
        setField(printWriter, "out", fileWriter);
        setField(serializeWriter, "writer", printWriter);
        serializeWriter.count = 0;
        char[] charArray = new char[3];
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
        
        clobSeriliazer.write(jSONSerializer, null, null, null, 0);
        
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
        char finalJSONSerializerOutBuf0 = jSONSerializer.out.buf[0];
        char finalJSONSerializerOutBuf1 = jSONSerializer.out.buf[1];
        char finalJSONSerializerOutBuf2 = jSONSerializer.out.buf[2];
        
        assertNull(finalJSONSerializerOutLock);
        
        assertNull(finalJSONSerializerOutWriterLock);
        
        assertNull(finalJSONSerializerOutWriterOutLock);
        
        assertNull(finalJSONSerializerOutWriterOutSeLock);
        
        assertEquals(3, finalJSONSerializerOutCount);
        
        assertEquals('n', finalJSONSerializerOutBuf0);
        
        assertEquals('u', finalJSONSerializerOutBuf1);
        
        assertEquals('l', finalJSONSerializerOutBuf2);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testClobSeriliazer1() {
        ClobSeriliazer actual = new ClobSeriliazer();
    }
    ///endregion
    
    private static Object createInstance(String className) throws Exception {
        Class<?> clazz = Class.forName(className);
        return getUnsafeInstance().allocateInstance(clazz);
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
