package com.alibaba.fastjson.serializer;

import org.junit.Test;
import java.util.IdentityHashMap;
import javax.management.openmbean.KeyAlreadyExistsException;
import java.io.OutputStreamWriter;
import sun.nio.cs.StreamEncoder;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import sun.misc.Unsafe;

import static java.lang.reflect.Array.get;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;

public class ArraySerializerTest {
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testWrite1() throws Throwable  {
        ArraySerializer arraySerializer = ((ArraySerializer) createInstance("com.alibaba.fastjson.serializer.ArraySerializer"));
        java.lang.Object[] unixFileStoreAttributesArray = createArray("sun.nio.fs.UnixFileStoreAttributes", 0);
        
        arraySerializer.write(null, null, unixFileStoreAttributesArray, null, 0);
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
        SerialContext serialContext = ((SerialContext) createInstance("com.alibaba.fastjson.serializer.SerialContext"));
        setField(serialContext, "features", 0);
        setField(serialContext, "fieldName", null);
        setField(serialContext, "object", null);
        setField(serialContext, "parent", null);
        jSONSerializer.context = serialContext;
        IdentityHashMap identityHashMap = ((IdentityHashMap) createInstance("java.util.IdentityHashMap"));
        setField(identityHashMap, "size", 0);
        java.lang.Object[] objectArray = new java.lang.Object[9];
        setField(identityHashMap, "table", objectArray);
        jSONSerializer.references = identityHashMap;
        SerializeWriter serializeWriter = ((SerializeWriter) createInstance("com.alibaba.fastjson.serializer.SerializeWriter"));
        serializeWriter.disableCircularReferenceDetect = false;
        setField(jSONSerializer, "out", serializeWriter);
        java.lang.Object[] objectArray1 = new java.lang.Object[9];
        java.lang.Object[] forEachTaskArray = createArray("java.util.stream.ForEachOps$ForEachTask", 0);
        
        SerialContext initialJSONSerializerContext = jSONSerializer.context;
        IdentityHashMap identityHashMap1 = jSONSerializer.references;
        Object identityHashMap1ReferencesTable = getFieldValue(identityHashMap1, "table");
        Object initialJSONSerializerReferencesTable8 = get(identityHashMap1ReferencesTable, 8);
        
        arraySerializer.write(jSONSerializer, objectArray1, forEachTaskArray, null, 0);
        
        SerialContext finalJSONSerializerContext = jSONSerializer.context;
        IdentityHashMap identityHashMap2 = jSONSerializer.references;
        Object identityHashMap2ReferencesTable = getFieldValue(identityHashMap2, "table");
        Object finalJSONSerializerReferencesTable8 = get(identityHashMap2ReferencesTable, 8);
        
        assertFalse(initialJSONSerializerContext == finalJSONSerializerContext);
        
        assertFalse(initialJSONSerializerReferencesTable8 == finalJSONSerializerReferencesTable8);
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
        java.lang.Object[] objectArray = new java.lang.Object[29];
        javax.management.openmbean.KeyAlreadyExistsException[][] keyAlreadyExistsExceptionArray = new javax.management.openmbean.KeyAlreadyExistsException[9][];
        keyAlreadyExistsExceptionArray[0] = ((javax.management.openmbean.KeyAlreadyExistsException[]) null);
        keyAlreadyExistsExceptionArray[1] = ((javax.management.openmbean.KeyAlreadyExistsException[]) null);
        keyAlreadyExistsExceptionArray[2] = ((javax.management.openmbean.KeyAlreadyExistsException[]) null);
        keyAlreadyExistsExceptionArray[3] = ((javax.management.openmbean.KeyAlreadyExistsException[]) null);
        keyAlreadyExistsExceptionArray[4] = ((javax.management.openmbean.KeyAlreadyExistsException[]) null);
        keyAlreadyExistsExceptionArray[5] = ((javax.management.openmbean.KeyAlreadyExistsException[]) null);
        keyAlreadyExistsExceptionArray[6] = ((javax.management.openmbean.KeyAlreadyExistsException[]) null);
        keyAlreadyExistsExceptionArray[7] = ((javax.management.openmbean.KeyAlreadyExistsException[]) null);
        keyAlreadyExistsExceptionArray[8] = ((javax.management.openmbean.KeyAlreadyExistsException[]) null);
        objectArray[28] = ((Object) keyAlreadyExistsExceptionArray);
        setField(identityHashMap, "table", objectArray);
        jSONSerializer.references = identityHashMap;
        SerializeWriter serializeWriter = ((SerializeWriter) createInstance("com.alibaba.fastjson.serializer.SerializeWriter"));
        serializeWriter.disableCircularReferenceDetect = false;
        setField(jSONSerializer, "out", serializeWriter);
        java.lang.Object[] forEachTaskArray = createArray("java.util.stream.ForEachOps$ForEachTask", 0);
        
        Object initialJSONSerializerContextFieldName = jSONSerializer.context.fieldName;
        Object initialJSONSerializerContextObject = jSONSerializer.context.object;
        IdentityHashMap identityHashMap1 = jSONSerializer.references;
        Object identityHashMap1ReferencesTable = getFieldValue(identityHashMap1, "table");
        Object initialJSONSerializerReferencesTable12 = get(identityHashMap1ReferencesTable, 12);
        IdentityHashMap identityHashMap2 = jSONSerializer.references;
        Object identityHashMap2ReferencesTable = getFieldValue(identityHashMap2, "table");
        Object initialJSONSerializerReferencesTable13 = get(identityHashMap2ReferencesTable, 13);
        
        arraySerializer.write(jSONSerializer, keyAlreadyExistsExceptionArray, forEachTaskArray, null, 0);
        
        Object finalJSONSerializerContextFieldName = jSONSerializer.context.fieldName;
        Object finalJSONSerializerContextObject = jSONSerializer.context.object;
        IdentityHashMap identityHashMap3 = jSONSerializer.references;
        Object identityHashMap3ReferencesTable = getFieldValue(identityHashMap3, "table");
        Object finalJSONSerializerReferencesTable12 = get(identityHashMap3ReferencesTable, 12);
        IdentityHashMap identityHashMap4 = jSONSerializer.references;
        Object identityHashMap4ReferencesTable = getFieldValue(identityHashMap4, "table");
        Object finalJSONSerializerReferencesTable13 = get(identityHashMap4ReferencesTable, 13);
        
        assertNull(finalJSONSerializerContextFieldName);
        
        assertNull(finalJSONSerializerContextObject);
        
        assertFalse(initialJSONSerializerReferencesTable12 == finalJSONSerializerReferencesTable12);
        
        assertFalse(initialJSONSerializerReferencesTable13 == finalJSONSerializerReferencesTable13);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testWrite5() throws Throwable  {
        ArraySerializer arraySerializer = ((ArraySerializer) createInstance("com.alibaba.fastjson.serializer.ArraySerializer"));
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        setField(jSONSerializer, "context", null);
        SerializeWriter serializeWriter = ((SerializeWriter) createInstance("com.alibaba.fastjson.serializer.SerializeWriter"));
        setField(serializeWriter, "lock", null);
        serializeWriter.disableCircularReferenceDetect = true;
        OutputStreamWriter outputStreamWriter = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        setField(outputStreamWriter, "lock", null);
        StreamEncoder streamEncoder = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(streamEncoder, "lock", null);
        setField(outputStreamWriter, "se", streamEncoder);
        setField(serializeWriter, "writer", outputStreamWriter);
        serializeWriter.count = 2147483646;
        char[] charArray = new char[10];
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
