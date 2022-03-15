package com.alibaba.fastjson.serializer;

import org.junit.Test;
import javax.swing.text.html.HTML.Attribute;
import javax.swing.text.html.HTML;
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
        JSONSerializer jSONSerializerMock = mock(JSONSerializer.class);
        javax.swing.text.html.HTML.Attribute[] attributeArray = new javax.swing.text.html.HTML.Attribute[0];
        
        clobSeriliazer.write(jSONSerializerMock, attributeArray, null, null, 0);
    }
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
    private static sun.misc.Unsafe getUnsafeInstance() throws Exception {
        java.lang.reflect.Field f = sun.misc.Unsafe.class.getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return (sun.misc.Unsafe) f.get(null);
    }
}
