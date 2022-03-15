package com.alibaba.fastjson.parser.deserializer;

import org.junit.Test;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import java.lang.reflect.Type;
import java.util.Map;
import javax.swing.text.html.BlockView;
import java.lang.reflect.Method;
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
        javax.swing.text.html.BlockView[][] blockViewArray = new javax.swing.text.html.BlockView[0][];
        Object syntheticParameterizedType = createInstance("org.springframework.core.ResolvableType$SyntheticParameterizedType");
        
        Class resolveFieldDeserializerClazz = Class.forName("com.alibaba.fastjson.parser.deserializer.ResolveFieldDeserializer");
        Class defaultJSONParserMockType = Class.forName("com.alibaba.fastjson.parser.DefaultJSONParser");
        Class blockViewArrayType = Class.forName("java.lang.Object");
        Class syntheticParameterizedTypeType = Class.forName("java.lang.reflect.Type");
        Class mapType = Class.forName("java.util.Map");
        Method parseFieldMethod = resolveFieldDeserializerClazz.getDeclaredMethod("parseField", defaultJSONParserMockType, blockViewArrayType, syntheticParameterizedTypeType, mapType);
        parseFieldMethod.setAccessible(true);
        java.lang.Object[] parseFieldMethodArguments = new java.lang.Object[4];
        parseFieldMethodArguments[0] = defaultJSONParserMock;
        parseFieldMethodArguments[1] = ((Object) blockViewArray);
        parseFieldMethodArguments[2] = syntheticParameterizedType;
        parseFieldMethodArguments[3] = null;
        parseFieldMethod.invoke(resolveFieldDeserializer, parseFieldMethodArguments);
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
        Object listMXBeanType = createInstance("sun.management.MappedMXBeanType$ListMXBeanType");
        java.lang.Object[] toggleComponentOrientationActionArray = createArray("javax.swing.text.DefaultEditorKit$ToggleComponentOrientationAction", 0);
        
        resolveFieldDeserializer.setValue(listMXBeanType, toggleComponentOrientationActionArray);
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
    private static sun.misc.Unsafe getUnsafeInstance() throws Exception {
        java.lang.reflect.Field f = sun.misc.Unsafe.class.getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return (sun.misc.Unsafe) f.get(null);
    }
}
