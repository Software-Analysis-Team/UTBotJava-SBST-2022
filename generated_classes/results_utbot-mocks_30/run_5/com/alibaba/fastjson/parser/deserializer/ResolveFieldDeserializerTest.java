package com.alibaba.fastjson.parser.deserializer;

import org.junit.Test;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.ArrayList;
import java.lang.reflect.Field;
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
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        
        resolveFieldDeserializer.parseField(defaultJSONParserMock, null, ((Type) null), linkedHashMap);
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
    private static sun.misc.Unsafe getUnsafeInstance() throws Exception {
        java.lang.reflect.Field f = sun.misc.Unsafe.class.getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return (sun.misc.Unsafe) f.get(null);
    }
}
