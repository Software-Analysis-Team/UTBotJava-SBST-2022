package io.seata.core.rpc.netty;

import org.junit.Test;
import io.netty.channel.Channel;
import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import sun.misc.Unsafe;

import static org.mockito.Mockito.mock;

public class TmRpcClientTest {
    ///region
    
    @Test(timeout = 10000)
    public void testReleaseChannel1() throws Throwable  {
        TmRpcClient tmRpcClient = ((TmRpcClient) createInstance("io.seata.core.rpc.netty.TmRpcClient"));
        Channel channelMock = mock(Channel.class);
        
        Class tmRpcClientClazz = Class.forName("io.seata.core.rpc.netty.TmRpcClient");
        Class channelMockType = Class.forName("io.netty.channel.Channel");
        Class stringType = Class.forName("java.lang.String");
        Method releaseChannelMethod = tmRpcClientClazz.getDeclaredMethod("releaseChannel", channelMockType, stringType);
        releaseChannelMethod.setAccessible(true);
        java.lang.Object[] releaseChannelMethodArguments = new java.lang.Object[2];
        releaseChannelMethodArguments[0] = channelMock;
        releaseChannelMethodArguments[1] = null;
        releaseChannelMethod.invoke(tmRpcClient, releaseChannelMethodArguments);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReleaseChannel2() throws Throwable  {
        TmRpcClient tmRpcClient = ((TmRpcClient) createInstance("io.seata.core.rpc.netty.TmRpcClient"));
        
        Class tmRpcClientClazz = Class.forName("io.seata.core.rpc.netty.TmRpcClient");
        Class channelType = Class.forName("io.netty.channel.Channel");
        Class stringType = Class.forName("java.lang.String");
        Method releaseChannelMethod = tmRpcClientClazz.getDeclaredMethod("releaseChannel", channelType, stringType);
        releaseChannelMethod.setAccessible(true);
        java.lang.Object[] releaseChannelMethodArguments = new java.lang.Object[2];
        releaseChannelMethodArguments[0] = null;
        releaseChannelMethodArguments[1] = null;
        releaseChannelMethod.invoke(tmRpcClient, releaseChannelMethodArguments);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetApplicationId1() throws Throwable  {
        TmRpcClient tmRpcClient = ((TmRpcClient) createInstance("io.seata.core.rpc.netty.TmRpcClient"));
        setField(tmRpcClient, "applicationId", null);
        
        tmRpcClient.setApplicationId(null);
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
    private static sun.misc.Unsafe getUnsafeInstance() throws Exception {
        java.lang.reflect.Field f = sun.misc.Unsafe.class.getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return (sun.misc.Unsafe) f.get(null);
    }
}
