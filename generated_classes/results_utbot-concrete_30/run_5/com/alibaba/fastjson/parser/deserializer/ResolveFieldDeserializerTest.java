package com.alibaba.fastjson.parser.deserializer;

import org.junit.Test;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.ArrayList;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Array;
import sun.misc.Unsafe;

import static java.lang.reflect.Array.get;
import static org.junit.Assert.assertNull;

public class ResolveFieldDeserializerTest {
    ///region
    
    @Test(timeout = 10000)
    public void testParseField1() throws Throwable  {
        ResolveFieldDeserializer resolveFieldDeserializer = ((ResolveFieldDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.ResolveFieldDeserializer"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        Object object = new Object();
        
        resolveFieldDeserializer.parseField(defaultJSONParser, object, ((Type) null), ((Map) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testParseField2() throws Throwable  {
        ResolveFieldDeserializer resolveFieldDeserializer = ((ResolveFieldDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.ResolveFieldDeserializer"));
        
        resolveFieldDeserializer.parseField(((DefaultJSONParser) null), null, ((Type) null), ((Map) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testSetValue1() throws Throwable  {
        ResolveFieldDeserializer resolveFieldDeserializer = ((ResolveFieldDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.ResolveFieldDeserializer"));
        Object object = new Object();
        Object object1 = new Object();
        
        resolveFieldDeserializer.setValue(object, object1);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetValue2() throws Throwable  {
        ResolveFieldDeserializer resolveFieldDeserializer = ((ResolveFieldDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.ResolveFieldDeserializer"));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        setField(resolveFieldDeserializer, "map", linkedHashMap);
        java.lang.Object[] permitStatusArray = createArray("java.util.stream.StreamSpliterators$UnorderedSliceSpliterator$PermitStatus", 9);
        setField(resolveFieldDeserializer, "key", permitStatusArray);
        
        Object resolveFieldDeserializerKey = getFieldValue(resolveFieldDeserializer, "key");
        Object initialResolveFieldDeserializerKey0 = get(resolveFieldDeserializerKey, 0);
        Object resolveFieldDeserializerKey1 = getFieldValue(resolveFieldDeserializer, "key");
        Object initialResolveFieldDeserializerKey1 = get(resolveFieldDeserializerKey1, 1);
        Object resolveFieldDeserializerKey2 = getFieldValue(resolveFieldDeserializer, "key");
        Object initialResolveFieldDeserializerKey2 = get(resolveFieldDeserializerKey2, 2);
        Object resolveFieldDeserializerKey3 = getFieldValue(resolveFieldDeserializer, "key");
        Object initialResolveFieldDeserializerKey3 = get(resolveFieldDeserializerKey3, 3);
        Object resolveFieldDeserializerKey4 = getFieldValue(resolveFieldDeserializer, "key");
        Object initialResolveFieldDeserializerKey4 = get(resolveFieldDeserializerKey4, 4);
        Object resolveFieldDeserializerKey5 = getFieldValue(resolveFieldDeserializer, "key");
        Object initialResolveFieldDeserializerKey5 = get(resolveFieldDeserializerKey5, 5);
        Object resolveFieldDeserializerKey6 = getFieldValue(resolveFieldDeserializer, "key");
        Object initialResolveFieldDeserializerKey6 = get(resolveFieldDeserializerKey6, 6);
        Object resolveFieldDeserializerKey7 = getFieldValue(resolveFieldDeserializer, "key");
        Object initialResolveFieldDeserializerKey7 = get(resolveFieldDeserializerKey7, 7);
        Object resolveFieldDeserializerKey8 = getFieldValue(resolveFieldDeserializer, "key");
        Object initialResolveFieldDeserializerKey8 = get(resolveFieldDeserializerKey8, 8);
        
        resolveFieldDeserializer.setValue(null, null);
        
        Object resolveFieldDeserializerKey9 = getFieldValue(resolveFieldDeserializer, "key");
        Object finalResolveFieldDeserializerKey0 = get(resolveFieldDeserializerKey9, 0);
        Object resolveFieldDeserializerKey10 = getFieldValue(resolveFieldDeserializer, "key");
        Object finalResolveFieldDeserializerKey1 = get(resolveFieldDeserializerKey10, 1);
        Object resolveFieldDeserializerKey11 = getFieldValue(resolveFieldDeserializer, "key");
        Object finalResolveFieldDeserializerKey2 = get(resolveFieldDeserializerKey11, 2);
        Object resolveFieldDeserializerKey12 = getFieldValue(resolveFieldDeserializer, "key");
        Object finalResolveFieldDeserializerKey3 = get(resolveFieldDeserializerKey12, 3);
        Object resolveFieldDeserializerKey13 = getFieldValue(resolveFieldDeserializer, "key");
        Object finalResolveFieldDeserializerKey4 = get(resolveFieldDeserializerKey13, 4);
        Object resolveFieldDeserializerKey14 = getFieldValue(resolveFieldDeserializer, "key");
        Object finalResolveFieldDeserializerKey5 = get(resolveFieldDeserializerKey14, 5);
        Object resolveFieldDeserializerKey15 = getFieldValue(resolveFieldDeserializer, "key");
        Object finalResolveFieldDeserializerKey6 = get(resolveFieldDeserializerKey15, 6);
        Object resolveFieldDeserializerKey16 = getFieldValue(resolveFieldDeserializer, "key");
        Object finalResolveFieldDeserializerKey7 = get(resolveFieldDeserializerKey16, 7);
        Object resolveFieldDeserializerKey17 = getFieldValue(resolveFieldDeserializer, "key");
        Object finalResolveFieldDeserializerKey8 = get(resolveFieldDeserializerKey17, 8);
        
        assertNull(finalResolveFieldDeserializerKey0);
        
        assertNull(finalResolveFieldDeserializerKey1);
        
        assertNull(finalResolveFieldDeserializerKey2);
        
        assertNull(finalResolveFieldDeserializerKey3);
        
        assertNull(finalResolveFieldDeserializerKey4);
        
        assertNull(finalResolveFieldDeserializerKey5);
        
        assertNull(finalResolveFieldDeserializerKey6);
        
        assertNull(finalResolveFieldDeserializerKey7);
        
        assertNull(finalResolveFieldDeserializerKey8);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testResolveFieldDeserializer1() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        ArrayList arrayList = new ArrayList();
        ResolveFieldDeserializer actual = new ResolveFieldDeserializer(defaultJSONParser, arrayList, 0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testResolveFieldDeserializer2() {
        ArrayList arrayList = new ArrayList();
        ResolveFieldDeserializer actual = new ResolveFieldDeserializer(arrayList);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testResolveFieldDeserializer3() {
        Object object = new Object();
        ResolveFieldDeserializer actual = new ResolveFieldDeserializer(null, object);
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
