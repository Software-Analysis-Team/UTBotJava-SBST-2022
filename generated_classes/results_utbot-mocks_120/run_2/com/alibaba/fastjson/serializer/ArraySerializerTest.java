package com.alibaba.fastjson.serializer;

import org.junit.Test;
import sun.reflect.generics.reflectiveObjects.WildcardTypeImpl;
import java.io.ObjectStreamField;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import sun.misc.Unsafe;

import static org.mockito.Mockito.mock;
import static org.mockito.ArgumentMatchers.anyChar;
import static org.mockito.Mockito.when;
import static org.mockito.ArgumentMatchers.any;

public class ArraySerializerTest {
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testWrite1() throws Throwable  {
        ArraySerializer arraySerializer = ((ArraySerializer) createInstance("com.alibaba.fastjson.serializer.ArraySerializer"));
        java.lang.Object[] longArrayCounterSnapshotArray = createArray("[Lsun.management.counter.perf.LongArrayCounterSnapshot;", 0);
        java.lang.Object[] forEachTaskArray = createArray("java.util.stream.ForEachOps$ForEachTask", 0);
        Class class1 = Object.class;
        
        arraySerializer.write(null, longArrayCounterSnapshotArray, forEachTaskArray, class1, 0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testWrite2() throws Throwable  {
        ArraySerializer arraySerializer = ((ArraySerializer) createInstance("com.alibaba.fastjson.serializer.ArraySerializer"));
        JSONSerializer jSONSerializerMock = mock(JSONSerializer.class);
        SerializeWriter serializeWriterMock = mock(SerializeWriter.class);
        setField(jSONSerializerMock, "out", serializeWriterMock);
        Object forEachTask = createInstance("java.util.stream.ForEachOps$ForEachTask");
        
        arraySerializer.write(jSONSerializerMock, forEachTask, null, null, 0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testWrite3() throws Throwable  {
        ArraySerializer arraySerializer = ((ArraySerializer) createInstance("com.alibaba.fastjson.serializer.ArraySerializer"));
        JSONSerializer jSONSerializerMock = mock(JSONSerializer.class);
        setField(jSONSerializerMock, "context", null);
        SerializeWriter serializeWriterMock = mock(SerializeWriter.class);
        when(serializeWriterMock.append(anyChar())).thenReturn(((SerializeWriter) null), ((SerializeWriter) null));
        setField(jSONSerializerMock, "out", serializeWriterMock);
        java.lang.Object[] objectArray = new java.lang.Object[0];
        java.lang.Object[] forEachTaskArray = createArray("java.util.stream.ForEachOps$ForEachTask", 0);
        Class class1 = Object.class;
        
        arraySerializer.write(jSONSerializerMock, objectArray, forEachTaskArray, class1, 0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testWrite4() throws Throwable  {
        ArraySerializer arraySerializer = ((ArraySerializer) createInstance("com.alibaba.fastjson.serializer.ArraySerializer"));
        ObjectSerializer objectSerializerMock = mock(ObjectSerializer.class);
        setField(arraySerializer, "compObjectSerializer", objectSerializerMock);
        Class class1 = Object.class;
        setField(arraySerializer, "componentType", class1);
        JSONSerializer jSONSerializerMock = mock(JSONSerializer.class);
        setField(jSONSerializerMock, "context", null);
        SerializeWriter serializeWriterMock = mock(SerializeWriter.class);
        SerializeWriter serializeWriterMock1 = mock(SerializeWriter.class);
        when(serializeWriterMock.append(anyChar())).thenReturn(((SerializeWriter) null), serializeWriterMock1);
        setField(jSONSerializerMock, "out", serializeWriterMock);
        java.lang.Object[] objectArray = new java.lang.Object[1];
        java.lang.Object[] forEachTaskArray = createArray("java.util.stream.ForEachOps$ForEachTask", 0);
        objectArray[0] = forEachTaskArray;
        java.lang.Object[] constrArray = createArray("com.sun.jmx.mbeanserver.DefaultMXBeanMappingFactory$CompositeBuilderViaConstructor$Constr", 0);
        WildcardTypeImpl wildcardTypeImpl = ((WildcardTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.WildcardTypeImpl"));
        
        arraySerializer.write(jSONSerializerMock, objectArray, constrArray, wildcardTypeImpl, 0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testWrite5() throws Throwable  {
        ArraySerializer arraySerializer = ((ArraySerializer) createInstance("com.alibaba.fastjson.serializer.ArraySerializer"));
        Class class1 = Object.class;
        setField(arraySerializer, "componentType", class1);
        JSONSerializer jSONSerializerMock = mock(JSONSerializer.class);
        when(jSONSerializerMock.getObjectWriter(any())).thenReturn(((ObjectSerializer) null));
        setField(jSONSerializerMock, "context", null);
        SerializeWriter serializeWriterMock = mock(SerializeWriter.class);
        when(serializeWriterMock.append(anyChar())).thenReturn(((SerializeWriter) null));
        setField(jSONSerializerMock, "out", serializeWriterMock);
        java.lang.Object[] objectArray = new java.lang.Object[9];
        java.lang.Object[] forEachTaskArray = createArray("java.util.stream.ForEachOps$ForEachTask", 0);
        objectArray[0] = forEachTaskArray;
        java.io.ObjectStreamField[] objectStreamFieldArray = new java.io.ObjectStreamField[0];
        WildcardTypeImpl wildcardTypeImpl = ((WildcardTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.WildcardTypeImpl"));
        
        arraySerializer.write(jSONSerializerMock, objectArray, objectStreamFieldArray, wildcardTypeImpl, 0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testArraySerializer1() throws Throwable  {
        Class class1 = Object.class;
        ObjectSerializer objectSerializerMock = mock(ObjectSerializer.class);
        ArraySerializer actual = new ArraySerializer(class1, objectSerializerMock);
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
