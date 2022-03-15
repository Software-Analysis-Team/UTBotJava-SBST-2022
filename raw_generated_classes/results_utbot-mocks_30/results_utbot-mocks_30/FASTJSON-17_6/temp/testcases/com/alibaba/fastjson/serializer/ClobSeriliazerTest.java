package com.alibaba.fastjson.serializer;

import org.junit.Test;
import java.lang.reflect.Method;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import sun.misc.Unsafe;

import static org.mockito.Mockito.mock;

public class ClobSeriliazerTest {
    ///region
    
    @Test(timeout = 10000)
    public void testWrite1() throws Throwable  {
        ClobSeriliazer clobSeriliazer = ((ClobSeriliazer) createInstance("com.alibaba.fastjson.serializer.ClobSeriliazer"));
        JSONSerializer jSONSerializerMock = mock(JSONSerializer.class);
        
        clobSeriliazer.write(jSONSerializerMock, null, null, null, 0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testWrite2() throws Throwable  {
        ClobSeriliazer clobSeriliazer = ((ClobSeriliazer) createInstance("com.alibaba.fastjson.serializer.ClobSeriliazer"));
        java.lang.Object[] compositeBuilderViaProxyArray = createArray("com.sun.jmx.mbeanserver.DefaultMXBeanMappingFactory$CompositeBuilderViaProxy", 0);
        java.lang.Object[] compositeBuilderViaFromArray = createArray("com.sun.jmx.mbeanserver.DefaultMXBeanMappingFactory$CompositeBuilderViaFrom", 0);
        Object wildcardTypeImpl = createInstance("retrofit2.Utils$WildcardTypeImpl");
        
        Class clobSeriliazerClazz = Class.forName("com.alibaba.fastjson.serializer.ClobSeriliazer");
        Class jSONSerializerType = Class.forName("com.alibaba.fastjson.serializer.JSONSerializer");
        Class compositeBuilderViaProxyArrayType = Class.forName("java.lang.Object");
        Class wildcardTypeImplType = Class.forName("java.lang.reflect.Type");
        Class intType = int.class;
        Method writeMethod = clobSeriliazerClazz.getDeclaredMethod("write", jSONSerializerType, compositeBuilderViaProxyArrayType, compositeBuilderViaProxyArrayType, wildcardTypeImplType, intType);
        writeMethod.setAccessible(true);
        java.lang.Object[] writeMethodArguments = new java.lang.Object[5];
        writeMethodArguments[0] = null;
        writeMethodArguments[1] = ((Object) compositeBuilderViaProxyArray);
        writeMethodArguments[2] = ((Object) compositeBuilderViaFromArray);
        writeMethodArguments[3] = wildcardTypeImpl;
        writeMethodArguments[4] = 0;
        try {
            writeMethod.invoke(clobSeriliazer, writeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testClobSeriliazer1() {
        ClobSeriliazer actual = new ClobSeriliazer();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testClobSeriliazer2() {
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
    private static sun.misc.Unsafe getUnsafeInstance() throws Exception {
        java.lang.reflect.Field f = sun.misc.Unsafe.class.getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return (sun.misc.Unsafe) f.get(null);
    }
}
