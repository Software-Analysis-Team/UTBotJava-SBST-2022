package com.alibaba.fastjson.serializer;

import org.junit.Test;
import sun.awt.image.PNGImageDecoder.PNGException;
import sun.awt.image.PNGImageDecoder;
import sun.reflect.generics.reflectiveObjects.WildcardTypeImpl;
import java.util.IdentityHashMap;
import sun.reflect.generics.reflectiveObjects.TypeVariableImpl;
import java.io.FileWriter;
import sun.nio.cs.StreamEncoder;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import sun.misc.Unsafe;

import static org.junit.Assert.assertFalse;
import static java.lang.reflect.Array.get;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;

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
        char[] charArray = new char[24];
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
        SerialContext serialContext = ((SerialContext) createInstance("com.alibaba.fastjson.serializer.SerialContext"));
        setField(serialContext, "features", 0);
        setField(serialContext, "fieldName", null);
        setField(serialContext, "object", null);
        setField(serialContext, "parent", null);
        jSONSerializer.context = serialContext;
        IdentityHashMap identityHashMap = ((IdentityHashMap) createInstance("java.util.IdentityHashMap"));
        setField(identityHashMap, "modCount", 0);
        setField(identityHashMap, "size", -2);
        java.lang.Object[] objectArray = new java.lang.Object[3];
        setField(identityHashMap, "table", objectArray);
        jSONSerializer.references = identityHashMap;
        SerializeWriter serializeWriter = ((SerializeWriter) createInstance("com.alibaba.fastjson.serializer.SerializeWriter"));
        serializeWriter.disableCircularReferenceDetect = false;
        setField(jSONSerializer, "out", serializeWriter);
        java.lang.Object[] objectArray1 = new java.lang.Object[9];
        java.lang.Object[] forEachTaskArray = createArray("java.util.stream.ForEachOps$ForEachTask", 0);
        TypeVariableImpl typeVariableImpl = ((TypeVariableImpl) createInstance("sun.reflect.generics.reflectiveObjects.TypeVariableImpl"));
        
        Object initialJSONSerializerContextFieldName = jSONSerializer.context.fieldName;
        Object initialJSONSerializerContextObject = jSONSerializer.context.object;
        IdentityHashMap identityHashMap1 = jSONSerializer.references;
        Object identityHashMap1ReferencesTable = getFieldValue(identityHashMap1, "table");
        Object initialJSONSerializerReferencesTable0 = get(identityHashMap1ReferencesTable, 0);
        IdentityHashMap identityHashMap2 = jSONSerializer.references;
        Object identityHashMap2ReferencesTable = getFieldValue(identityHashMap2, "table");
        Object initialJSONSerializerReferencesTable1 = get(identityHashMap2ReferencesTable, 1);
        
        arraySerializer.write(jSONSerializer, objectArray1, forEachTaskArray, typeVariableImpl, 0);
        
        Object finalJSONSerializerContextFieldName = jSONSerializer.context.fieldName;
        Object finalJSONSerializerContextObject = jSONSerializer.context.object;
        IdentityHashMap identityHashMap3 = jSONSerializer.references;
        Object finalJSONSerializerReferencesModCount = getFieldValue(identityHashMap3, "modCount");
        IdentityHashMap identityHashMap4 = jSONSerializer.references;
        Object finalJSONSerializerReferencesSize = getFieldValue(identityHashMap4, "size");
        IdentityHashMap identityHashMap5 = jSONSerializer.references;
        Object identityHashMap5ReferencesTable = getFieldValue(identityHashMap5, "table");
        Object finalJSONSerializerReferencesTable0 = get(identityHashMap5ReferencesTable, 0);
        IdentityHashMap identityHashMap6 = jSONSerializer.references;
        Object identityHashMap6ReferencesTable = getFieldValue(identityHashMap6, "table");
        Object finalJSONSerializerReferencesTable1 = get(identityHashMap6ReferencesTable, 1);
        
        assertNull(finalJSONSerializerContextFieldName);
        
        assertNull(finalJSONSerializerContextObject);
        
        assertFalse(initialJSONSerializerReferencesTable0 == finalJSONSerializerReferencesTable0);
        
        assertFalse(initialJSONSerializerReferencesTable1 == finalJSONSerializerReferencesTable1);
        
        assertEquals(1, finalJSONSerializerReferencesModCount);
        
        assertEquals(-1, finalJSONSerializerReferencesSize);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testWrite6() throws Throwable  {
        ArraySerializer arraySerializer = ((ArraySerializer) createInstance("com.alibaba.fastjson.serializer.ArraySerializer"));
        CharacterCodec characterCodec = ((CharacterCodec) createInstance("com.alibaba.fastjson.serializer.CharacterCodec"));
        setField(arraySerializer, "compObjectSerializer", characterCodec);
        Class class1 = Object.class;
        setField(arraySerializer, "componentType", class1);
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        setField(jSONSerializer, "context", null);
        SerializeWriter serializeWriter = ((SerializeWriter) createInstance("com.alibaba.fastjson.serializer.SerializeWriter"));
        serializeWriter.disableCircularReferenceDetect = true;
        serializeWriter.count = 0;
        char[] charArray = new char[33];
        serializeWriter.buf = charArray;
        setField(jSONSerializer, "out", serializeWriter);
        java.lang.Object[] objectArray = new java.lang.Object[9];
        java.lang.Object[] forEachTaskArray = createArray("java.util.stream.ForEachOps$ForEachTask", 0);
        objectArray[0] = forEachTaskArray;
        
        arraySerializer.write(jSONSerializer, objectArray, null, null, 0);
        
        int finalJSONSerializerOutCount = jSONSerializer.out.count;
        char finalJSONSerializerOutBuf0 = jSONSerializer.out.buf[0];
        
        assertEquals(1, finalJSONSerializerOutCount);
        
        assertEquals('[', finalJSONSerializerOutBuf0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testWrite7() throws Throwable  {
        ArraySerializer arraySerializer = ((ArraySerializer) createInstance("com.alibaba.fastjson.serializer.ArraySerializer"));
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        setField(jSONSerializer, "context", null);
        SerializeWriter serializeWriter = ((SerializeWriter) createInstance("com.alibaba.fastjson.serializer.SerializeWriter"));
        setField(serializeWriter, "lock", null);
        serializeWriter.disableCircularReferenceDetect = true;
        FileWriter fileWriter = ((FileWriter) createInstance("java.io.FileWriter"));
        setField(fileWriter, "lock", null);
        StreamEncoder streamEncoder = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(streamEncoder, "lock", null);
        setField(streamEncoder, "isOpen", true);
        setField(fileWriter, "se", streamEncoder);
        setField(serializeWriter, "writer", fileWriter);
        serializeWriter.count = 8;
        char[] charArray = new char[8];
        serializeWriter.buf = charArray;
        setField(jSONSerializer, "out", serializeWriter);
        java.lang.Object[] objectArray = new java.lang.Object[9];
        
        SerializeWriter serializeWriter1 = jSONSerializer.out;
        Object initialJSONSerializerOutLock = getFieldValue(serializeWriter1, "lock");
        SerializeWriter serializeWriter2 = jSONSerializer.out;
        Object serializeWriter2OutWriter = getFieldValue(serializeWriter2, "writer");
        Object initialJSONSerializerOutWriterLock = getFieldValue(serializeWriter2OutWriter, "lock");
        SerializeWriter serializeWriter3 = jSONSerializer.out;
        Object serializeWriter3OutWriter = getFieldValue(serializeWriter3, "writer");
        Object serializeWriter3OutWriterOutWriterSe = getFieldValue(serializeWriter3OutWriter, "se");
        Object initialJSONSerializerOutWriterSeLock = getFieldValue(serializeWriter3OutWriterOutWriterSe, "lock");
        
        arraySerializer.write(jSONSerializer, objectArray, null, null, 0);
        
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
