package com.alibaba.fastjson.parser.deserializer;

import org.junit.Test;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import java.lang.reflect.Type;
import java.util.Map;
import org.springframework.messaging.support.MessageBuilder;
import java.util.LinkedHashMap;
import java.util.ArrayList;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Array;
import sun.misc.Unsafe;

import static org.mockito.Mockito.mock;

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
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        org.springframework.messaging.support.MessageBuilder[] messageBuilderArray = new org.springframework.messaging.support.MessageBuilder[0];
        
        resolveFieldDeserializer.parseField(defaultJSONParserMock, messageBuilderArray, ((Type) null), ((Map) null));
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
        java.lang.Object[] listItrArray = createArray("java.util.ArrayList$ListItr", 0);
        setField(resolveFieldDeserializer, "key", listItrArray);
        Class permitStatusClazz = Class.forName("java.util.stream.StreamSpliterators$UnorderedSliceSpliterator$PermitStatus");
        Object permitStatus = getEnumConstantByName(permitStatusClazz, "NO_MORE");
        
        resolveFieldDeserializer.setValue(permitStatus, null);
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
    private static Object getEnumConstantByName(Class<?> enumClass, String name) throws IllegalAccessException {
        java.lang.reflect.Field[] fields = enumClass.getDeclaredFields();
        for (java.lang.reflect.Field field : fields) {
            String fieldName = field.getName();
            if (field.isEnumConstant() && fieldName.equals(name)) {
                field.setAccessible(true);
                
                return field.get(null);
            }
        }
        
        return null;
    }
    private static sun.misc.Unsafe getUnsafeInstance() throws Exception {
        java.lang.reflect.Field f = sun.misc.Unsafe.class.getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return (sun.misc.Unsafe) f.get(null);
    }
}
