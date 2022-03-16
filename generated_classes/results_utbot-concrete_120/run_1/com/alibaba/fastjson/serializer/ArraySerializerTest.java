package com.alibaba.fastjson.serializer;

import org.junit.Test;
import sun.awt.image.PNGImageDecoder.PNGException;
import sun.awt.image.PNGImageDecoder;
import sun.reflect.generics.reflectiveObjects.WildcardTypeImpl;
import java.util.IdentityHashMap;
import java.io.OutputStreamWriter;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import sun.misc.Unsafe;

import static org.junit.Assert.assertFalse;

public class ArraySerializerTest {
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testWrite1() throws Throwable  {
        ArraySerializer arraySerializer = ((ArraySerializer) createInstance("com.alibaba.fastjson.serializer.ArraySerializer"));
        java.lang.Object[] arrayMappingArray = createArray("com.sun.jmx.mbeanserver.DefaultMXBeanMappingFactory$ArrayMapping", 0);
        sun.awt.image.PNGImageDecoder.PNGException[] pNGExceptionArray = new sun.awt.image.PNGImageDecoder.PNGException[0];
        WildcardTypeImpl wildcardTypeImpl = ((WildcardTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.WildcardTypeImpl"));
        
        arraySerializer.write(null, arrayMappingArray, pNGExceptionArray, wildcardTypeImpl, 0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testWrite2() throws Throwable  {
        ArraySerializer arraySerializer = ((ArraySerializer) createInstance("com.alibaba.fastjson.serializer.ArraySerializer"));
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        SerializeWriter serializeWriter = ((SerializeWriter) createInstance("com.alibaba.fastjson.serializer.SerializeWriter"));
        setField(jSONSerializer, "out", serializeWriter);
        Object forEachTask = createInstance("java.util.stream.ForEachOps$ForEachTask");
        
        arraySerializer.write(jSONSerializer, forEachTask, null, null, 0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testWrite3() throws Throwable  {
        ArraySerializer arraySerializer = ((ArraySerializer) createInstance("com.alibaba.fastjson.serializer.ArraySerializer"));
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        setField(jSONSerializer, "context", null);
        SerializeWriter serializeWriter = ((SerializeWriter) createInstance("com.alibaba.fastjson.serializer.SerializeWriter"));
        serializeWriter.disableCircularReferenceDetect = true;
        serializeWriter.count = Integer.MAX_VALUE;
        char[] charArray = new char[8];
        serializeWriter.buf = charArray;
        setField(jSONSerializer, "out", serializeWriter);
        java.lang.Object[] objectArray = new java.lang.Object[9];
        
        arraySerializer.write(jSONSerializer, objectArray, null, null, 0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testWrite4() throws Throwable  {
        ArraySerializer arraySerializer = ((ArraySerializer) createInstance("com.alibaba.fastjson.serializer.ArraySerializer"));
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        SerialContext serialContext = ((SerialContext) createInstance("com.alibaba.fastjson.serializer.SerialContext"));
        setField(serialContext, "features", 0);
        setField(serialContext, "fieldName", null);
        setField(serialContext, "object", null);
        setField(serialContext, "parent", null);
        jSONSerializer.context = serialContext;
        IdentityHashMap identityHashMap = ((IdentityHashMap) createInstance("java.util.IdentityHashMap"));
        java.lang.Object[] objectArray = new java.lang.Object[0];
        setField(identityHashMap, "table", objectArray);
        jSONSerializer.references = identityHashMap;
        SerializeWriter serializeWriter = ((SerializeWriter) createInstance("com.alibaba.fastjson.serializer.SerializeWriter"));
        serializeWriter.disableCircularReferenceDetect = false;
        setField(jSONSerializer, "out", serializeWriter);
        java.lang.Object[] objectArray1 = new java.lang.Object[9];
        java.lang.Object[] forEachTaskArray = createArray("java.util.stream.ForEachOps$ForEachTask", 0);
        
        SerialContext initialJSONSerializerContext = jSONSerializer.context;
        
        arraySerializer.write(jSONSerializer, objectArray1, forEachTaskArray, null, 0);
        
        SerialContext finalJSONSerializerContext = jSONSerializer.context;
        
        assertFalse(initialJSONSerializerContext == finalJSONSerializerContext);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testWrite5() throws Throwable  {
        ArraySerializer arraySerializer = ((ArraySerializer) createInstance("com.alibaba.fastjson.serializer.ArraySerializer"));
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        setField(jSONSerializer, "context", null);
        SerializeWriter serializeWriter = ((SerializeWriter) createInstance("com.alibaba.fastjson.serializer.SerializeWriter"));
        serializeWriter.disableCircularReferenceDetect = true;
        OutputStreamWriter outputStreamWriter = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        setField(serializeWriter, "writer", outputStreamWriter);
        serializeWriter.count = 2147483522;
        char[] charArray = new char[1];
        serializeWriter.buf = charArray;
        setField(jSONSerializer, "out", serializeWriter);
        java.lang.Object[] objectArray = new java.lang.Object[9];
        
        arraySerializer.write(jSONSerializer, objectArray, null, null, 0);
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
    private static sun.misc.Unsafe getUnsafeInstance() throws Exception {
        java.lang.reflect.Field f = sun.misc.Unsafe.class.getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return (sun.misc.Unsafe) f.get(null);
    }
}
