package com.alibaba.fastjson.serializer;

import org.junit.Test;
import java.io.StringWriter;
import java.io.OutputStreamWriter;
import sun.nio.cs.StreamEncoder;
import java.util.zip.GZIPOutputStream;
import java.util.zip.Deflater;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import sun.misc.Unsafe;

import static org.junit.Assert.assertNull;

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
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        java.lang.Object[] forEachTaskArray = createArray("java.util.stream.ForEachOps$ForEachTask", 0);
        java.lang.Object[] forEachTaskArray1 = createArray("[Ljava.util.stream.ForEachOps$ForEachTask;", 0);
        Class class1 = Object.class;
        
        clobSeriliazer.write(jSONSerializer, forEachTaskArray, forEachTaskArray1, class1, 0);
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
        OutputStreamWriter outputStreamWriter = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        setField(outputStreamWriter, "lock", null);
        StreamEncoder streamEncoder = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(streamEncoder, "lock", null);
        Object encOutputStream = createInstance("java.util.Base64$EncOutputStream");
        Object encOutputStream1 = createInstance("java.util.Base64$EncOutputStream");
        GZIPOutputStream gZIPOutputStream = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
        GZIPOutputStream gZIPOutputStream1 = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
        setField(gZIPOutputStream1, "out", null);
        setField(gZIPOutputStream1, "syncFlush", false);
        setField(gZIPOutputStream1, "def", null);
        setField(gZIPOutputStream, "out", gZIPOutputStream1);
        setField(gZIPOutputStream, "syncFlush", true);
        Deflater deflater = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(deflater, "finished", true);
        Object zStreamRef = createInstance("java.util.zip.ZStreamRef");
        setField(deflater, "zsRef", zStreamRef);
        setField(gZIPOutputStream, "def", deflater);
        setField(encOutputStream1, "out", gZIPOutputStream);
        setField(encOutputStream, "out", encOutputStream1);
        setField(streamEncoder, "out", encOutputStream);
        Object directByteBuffer = createInstance("java.nio.DirectByteBuffer");
        setField(directByteBuffer, "position", -2147483647);
        setField(streamEncoder, "bb", directByteBuffer);
        setField(streamEncoder, "isOpen", true);
        setField(outputStreamWriter, "se", streamEncoder);
        setField(serializeWriter, "writer", outputStreamWriter);
        serializeWriter.count = 0;
        char[] charArray = new char[0];
        serializeWriter.buf = charArray;
        setField(jSONSerializer, "out", serializeWriter);
        
        SerializeWriter serializeWriter1 = jSONSerializer.out;
        Object initialJSONSerializerOutLock = getFieldValue(serializeWriter1, "lock");
        SerializeWriter serializeWriter2 = jSONSerializer.out;
        Object serializeWriter2OutWriter = getFieldValue(serializeWriter2, "writer");
        Object initialJSONSerializerOutWriterLock = getFieldValue(serializeWriter2OutWriter, "lock");
        SerializeWriter serializeWriter3 = jSONSerializer.out;
        Object serializeWriter3OutWriter = getFieldValue(serializeWriter3, "writer");
        Object serializeWriter3OutWriterOutWriterSe = getFieldValue(serializeWriter3OutWriter, "se");
        Object initialJSONSerializerOutWriterSeLock = getFieldValue(serializeWriter3OutWriterOutWriterSe, "lock");
        
        clobSeriliazer.write(jSONSerializer, null, null, null, 0);
        
        SerializeWriter serializeWriter4 = jSONSerializer.out;
        Object finalJSONSerializerOutLock = getFieldValue(serializeWriter4, "lock");
        SerializeWriter serializeWriter5 = jSONSerializer.out;
        Object serializeWriter5OutWriter = getFieldValue(serializeWriter5, "writer");
        Object finalJSONSerializerOutWriterLock = getFieldValue(serializeWriter5OutWriter, "lock");
        SerializeWriter serializeWriter6 = jSONSerializer.out;
        Object serializeWriter6OutWriter = getFieldValue(serializeWriter6, "writer");
        Object serializeWriter6OutWriterOutWriterSe = getFieldValue(serializeWriter6OutWriter, "se");
        Object finalJSONSerializerOutWriterSeLock = getFieldValue(serializeWriter6OutWriterOutWriterSe, "lock");
        
        assertNull(finalJSONSerializerOutLock);
        
        assertNull(finalJSONSerializerOutWriterLock);
        
        assertNull(finalJSONSerializerOutWriterSeLock);
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
