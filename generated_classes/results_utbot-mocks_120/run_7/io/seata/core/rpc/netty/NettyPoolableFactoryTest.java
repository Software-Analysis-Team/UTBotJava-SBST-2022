package io.seata.core.rpc.netty;

import org.junit.Test;
import io.netty.channel.Channel;
import org.slf4j.Logger;
import java.net.InetSocketAddress;
import io.netty.channel.unix.DatagramSocketAddress;
import io.seata.core.rpc.netty.NettyPoolKey.TransactionRole;
import io.seata.core.rpc.netty.NettyPoolKey;
import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import sun.misc.Unsafe;

import static org.junit.Assert.assertFalse;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.ArgumentMatchers.anyString;

public class NettyPoolableFactoryTest {
    ///region
    
    @Test(timeout = 10000)
    public void testValidateObject1() throws Throwable  {
        NettyPoolableFactory nettyPoolableFactory = ((NettyPoolableFactory) createInstance("io.seata.core.rpc.netty.NettyPoolableFactory"));
        NettyPoolKey nettyPoolKey = ((NettyPoolKey) createInstance("io.seata.core.rpc.netty.NettyPoolKey"));
        
        boolean actual = nettyPoolableFactory.validateObject(nettyPoolKey, ((Channel) null));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testValidateObject2() throws Throwable  {
        NettyPoolableFactory nettyPoolableFactory = ((NettyPoolableFactory) createInstance("io.seata.core.rpc.netty.NettyPoolableFactory"));
        Channel channelMock = mock(Channel.class);
        when(channelMock.isActive()).thenReturn(true);
        
        boolean actual = nettyPoolableFactory.validateObject(((NettyPoolKey) null), channelMock);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testValidateObject3() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(org.slf4j.LoggerFactory.class);
            Logger loggerMock = mock(Logger.class);
            when(loggerMock.isInfoEnabled()).thenReturn(false);
            mockedStatic.when(() -> {
                org.slf4j.LoggerFactory.getLogger(any(Class.class));
            }).thenReturn(loggerMock);
            NettyPoolableFactory nettyPoolableFactory = ((NettyPoolableFactory) createInstance("io.seata.core.rpc.netty.NettyPoolableFactory"));
            Channel channelMock = mock(Channel.class);
            when(channelMock.isActive()).thenReturn(false);
            
            boolean actual = nettyPoolableFactory.validateObject(((NettyPoolKey) null), channelMock);
            
            assertFalse(actual);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testValidateObject4() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(org.slf4j.LoggerFactory.class);
            Logger loggerMock = mock(Logger.class);
            when(loggerMock.isInfoEnabled()).thenReturn(false);
            mockedStatic.when(() -> {
                org.slf4j.LoggerFactory.getLogger(any(Class.class));
            }).thenReturn(loggerMock);
            NettyPoolableFactory nettyPoolableFactory = ((NettyPoolableFactory) createInstance("io.seata.core.rpc.netty.NettyPoolableFactory"));
            
            boolean actual = nettyPoolableFactory.validateObject(((NettyPoolKey) null), ((Channel) null));
            
            assertFalse(actual);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testValidateObject5() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(org.slf4j.LoggerFactory.class);
            Logger loggerMock = mock(Logger.class);
            when(loggerMock.isInfoEnabled()).thenReturn(true);
            mockedStatic.when(() -> {
                org.slf4j.LoggerFactory.getLogger(any(Class.class));
            }).thenReturn(loggerMock);
            NettyPoolableFactory nettyPoolableFactory = ((NettyPoolableFactory) createInstance("io.seata.core.rpc.netty.NettyPoolableFactory"));
            Channel channelMock = mock(Channel.class);
            when(channelMock.isActive()).thenReturn(false);
            when(channelMock.toString()).thenReturn(((String) null));
            
            boolean actual = nettyPoolableFactory.validateObject(((NettyPoolKey) null), channelMock);
            
            assertFalse(actual);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testMakeObject1() throws Throwable  {
        NettyPoolableFactory nettyPoolableFactory = ((NettyPoolableFactory) createInstance("io.seata.core.rpc.netty.NettyPoolableFactory"));
        NettyPoolKey nettyPoolKey = ((NettyPoolKey) createInstance("io.seata.core.rpc.netty.NettyPoolKey"));
        
        nettyPoolableFactory.makeObject(nettyPoolKey);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testMakeObject2() throws Throwable  {
        NettyPoolableFactory nettyPoolableFactory = ((NettyPoolableFactory) createInstance("io.seata.core.rpc.netty.NettyPoolableFactory"));
        
        nettyPoolableFactory.makeObject(((NettyPoolKey) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testMakeObject3() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        org.mockito.MockedStatic mockedStatic1 = null;
        try {
            mockedStatic = mockStatic(io.seata.common.util.NetUtil.class);
            InetSocketAddress inetSocketAddress = ((InetSocketAddress) createInstance("java.net.InetSocketAddress"));
            mockedStatic.when(() -> {
                io.seata.common.util.NetUtil.toInetSocketAddress(anyString());
            }).thenReturn(inetSocketAddress);
            mockedStatic1 = mockStatic(org.slf4j.LoggerFactory.class);
            Logger loggerMock = mock(Logger.class);
            when(loggerMock.isInfoEnabled()).thenReturn(false);
            mockedStatic1.when(() -> {
                org.slf4j.LoggerFactory.getLogger(any(Class.class));
            }).thenReturn(loggerMock);
            NettyPoolableFactory nettyPoolableFactory = ((NettyPoolableFactory) createInstance("io.seata.core.rpc.netty.NettyPoolableFactory"));
            AbstractRpcRemotingClient abstractRpcRemotingClientMock = mock(AbstractRpcRemotingClient.class);
            setField(nettyPoolableFactory, "rpcRemotingClient", abstractRpcRemotingClientMock);
            NettyPoolKey nettyPoolKeyMock = mock(NettyPoolKey.class);
            when(nettyPoolKeyMock.getAddress()).thenReturn(((String) null));
            when(nettyPoolKeyMock.getMessage()).thenReturn(((io.seata.core.protocol.AbstractMessage) null));
            
            nettyPoolableFactory.makeObject(nettyPoolKeyMock);
        } finally {
            mockedStatic.close();
            mockedStatic1.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testMakeObject4() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        org.mockito.MockedStatic mockedStatic1 = null;
        try {
            mockedStatic = mockStatic(io.seata.common.util.NetUtil.class);
            DatagramSocketAddress datagramSocketAddress = ((DatagramSocketAddress) createInstance("io.netty.channel.unix.DatagramSocketAddress"));
            mockedStatic.when(() -> {
                io.seata.common.util.NetUtil.toInetSocketAddress(anyString());
            }).thenReturn(((InetSocketAddress) datagramSocketAddress));
            mockedStatic1 = mockStatic(org.slf4j.LoggerFactory.class);
            Logger loggerMock = mock(Logger.class);
            when(loggerMock.isInfoEnabled()).thenReturn(true);
            mockedStatic1.when(() -> {
                org.slf4j.LoggerFactory.getLogger(any(Class.class));
            }).thenReturn(loggerMock);
            NettyPoolableFactory nettyPoolableFactory = ((NettyPoolableFactory) createInstance("io.seata.core.rpc.netty.NettyPoolableFactory"));
            AbstractRpcRemotingClient abstractRpcRemotingClientMock = mock(AbstractRpcRemotingClient.class);
            setField(nettyPoolableFactory, "rpcRemotingClient", abstractRpcRemotingClientMock);
            NettyPoolKey nettyPoolKeyMock = mock(NettyPoolKey.class);
            String string = new String("");
            when(nettyPoolKeyMock.getAddress()).thenReturn(string);
            when(nettyPoolKeyMock.toString()).thenReturn(((String) null));
            when(nettyPoolKeyMock.getMessage()).thenReturn(((io.seata.core.protocol.AbstractMessage) null));
            
            nettyPoolableFactory.makeObject(nettyPoolKeyMock);
        } finally {
            mockedStatic.close();
            mockedStatic1.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDestroyObject1() throws Throwable  {
        NettyPoolableFactory nettyPoolableFactory = ((NettyPoolableFactory) createInstance("io.seata.core.rpc.netty.NettyPoolableFactory"));
        NettyPoolKey nettyPoolKey = ((NettyPoolKey) createInstance("io.seata.core.rpc.netty.NettyPoolKey"));
        
        nettyPoolableFactory.destroyObject(nettyPoolKey, ((Channel) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDestroyObject2() throws Throwable  {
        NettyPoolableFactory nettyPoolableFactory = ((NettyPoolableFactory) createInstance("io.seata.core.rpc.netty.NettyPoolableFactory"));
        
        nettyPoolableFactory.destroyObject(((NettyPoolKey) null), ((Channel) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDestroyObject3() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(org.slf4j.LoggerFactory.class);
            Logger loggerMock = mock(Logger.class);
            when(loggerMock.isInfoEnabled()).thenReturn(false);
            mockedStatic.when(() -> {
                org.slf4j.LoggerFactory.getLogger(any(Class.class));
            }).thenReturn(loggerMock);
            NettyPoolableFactory nettyPoolableFactory = ((NettyPoolableFactory) createInstance("io.seata.core.rpc.netty.NettyPoolableFactory"));
            Channel channelMock = mock(Channel.class);
            when(channelMock.disconnect()).thenReturn(((io.netty.channel.ChannelFuture) null));
            when(channelMock.close()).thenReturn(((io.netty.channel.ChannelFuture) null));
            
            nettyPoolableFactory.destroyObject(((NettyPoolKey) null), channelMock);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDestroyObject4() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(org.slf4j.LoggerFactory.class);
            Logger loggerMock = mock(Logger.class);
            when(loggerMock.isInfoEnabled()).thenReturn(true);
            mockedStatic.when(() -> {
                org.slf4j.LoggerFactory.getLogger(any(Class.class));
            }).thenReturn(loggerMock);
            NettyPoolableFactory nettyPoolableFactory = ((NettyPoolableFactory) createInstance("io.seata.core.rpc.netty.NettyPoolableFactory"));
            Channel channelMock = mock(Channel.class);
            when(channelMock.toString()).thenReturn(((String) null));
            when(channelMock.disconnect()).thenReturn(((io.netty.channel.ChannelFuture) null));
            when(channelMock.close()).thenReturn(((io.netty.channel.ChannelFuture) null));
            
            nettyPoolableFactory.destroyObject(((NettyPoolKey) null), channelMock);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testActivateObject1() throws Throwable  {
        NettyPoolableFactory nettyPoolableFactory = ((NettyPoolableFactory) createInstance("io.seata.core.rpc.netty.NettyPoolableFactory"));
        NettyPoolKey nettyPoolKey = ((NettyPoolKey) createInstance("io.seata.core.rpc.netty.NettyPoolKey"));
        
        nettyPoolableFactory.activateObject(nettyPoolKey, ((Channel) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testActivateObject2() throws Throwable  {
        NettyPoolableFactory nettyPoolableFactory = ((NettyPoolableFactory) createInstance("io.seata.core.rpc.netty.NettyPoolableFactory"));
        Channel channelMock = mock(Channel.class);
        
        nettyPoolableFactory.activateObject(((NettyPoolKey) null), channelMock);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testPassivateObject1() throws Throwable  {
        NettyPoolableFactory nettyPoolableFactory = ((NettyPoolableFactory) createInstance("io.seata.core.rpc.netty.NettyPoolableFactory"));
        NettyPoolKey nettyPoolKey = ((NettyPoolKey) createInstance("io.seata.core.rpc.netty.NettyPoolKey"));
        
        nettyPoolableFactory.passivateObject(nettyPoolKey, ((Channel) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testPassivateObject2() throws Throwable  {
        NettyPoolableFactory nettyPoolableFactory = ((NettyPoolableFactory) createInstance("io.seata.core.rpc.netty.NettyPoolableFactory"));
        Channel channelMock = mock(Channel.class);
        
        nettyPoolableFactory.passivateObject(((NettyPoolKey) null), channelMock);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetVersion1() throws Throwable  {
        NettyPoolableFactory nettyPoolableFactory = ((NettyPoolableFactory) createInstance("io.seata.core.rpc.netty.NettyPoolableFactory"));
        Object object = new Object();
        NettyPoolKey.TransactionRole transactionRole = ((NettyPoolKey.TransactionRole) createInstance("io.seata.core.rpc.netty.NettyPoolKey$TransactionRole"));
        
        Class nettyPoolableFactoryClazz = Class.forName("io.seata.core.rpc.netty.NettyPoolableFactory");
        Class objectType = Class.forName("java.lang.Object");
        Class transactionRoleType = Class.forName("io.seata.core.rpc.netty.NettyPoolKey$TransactionRole");
        Method getVersionMethod = nettyPoolableFactoryClazz.getDeclaredMethod("getVersion", objectType, transactionRoleType);
        getVersionMethod.setAccessible(true);
        java.lang.Object[] getVersionMethodArguments = new java.lang.Object[2];
        getVersionMethodArguments[0] = object;
        getVersionMethodArguments[1] = transactionRole;
        try {
            getVersionMethod.invoke(nettyPoolableFactory, getVersionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIsResponseSuccess1() throws Throwable  {
        NettyPoolableFactory nettyPoolableFactory = ((NettyPoolableFactory) createInstance("io.seata.core.rpc.netty.NettyPoolableFactory"));
        Object object = new Object();
        NettyPoolKey.TransactionRole transactionRole = ((NettyPoolKey.TransactionRole) createInstance("io.seata.core.rpc.netty.NettyPoolKey$TransactionRole"));
        
        Class nettyPoolableFactoryClazz = Class.forName("io.seata.core.rpc.netty.NettyPoolableFactory");
        Class objectType = Class.forName("java.lang.Object");
        Class transactionRoleType = Class.forName("io.seata.core.rpc.netty.NettyPoolKey$TransactionRole");
        Method isResponseSuccessMethod = nettyPoolableFactoryClazz.getDeclaredMethod("isResponseSuccess", objectType, transactionRoleType);
        isResponseSuccessMethod.setAccessible(true);
        java.lang.Object[] isResponseSuccessMethodArguments = new java.lang.Object[2];
        isResponseSuccessMethodArguments[0] = object;
        isResponseSuccessMethodArguments[1] = transactionRole;
        boolean actual = ((boolean) isResponseSuccessMethod.invoke(nettyPoolableFactory, isResponseSuccessMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIsResponseSuccess2() throws Throwable  {
        NettyPoolableFactory nettyPoolableFactory = ((NettyPoolableFactory) createInstance("io.seata.core.rpc.netty.NettyPoolableFactory"));
        
        Class nettyPoolableFactoryClazz = Class.forName("io.seata.core.rpc.netty.NettyPoolableFactory");
        Class objectType = Class.forName("java.lang.Object");
        Class transactionRoleType = Class.forName("io.seata.core.rpc.netty.NettyPoolKey$TransactionRole");
        Method isResponseSuccessMethod = nettyPoolableFactoryClazz.getDeclaredMethod("isResponseSuccess", objectType, transactionRoleType);
        isResponseSuccessMethod.setAccessible(true);
        java.lang.Object[] isResponseSuccessMethodArguments = new java.lang.Object[2];
        isResponseSuccessMethodArguments[0] = null;
        isResponseSuccessMethodArguments[1] = null;
        boolean actual = ((boolean) isResponseSuccessMethod.invoke(nettyPoolableFactory, isResponseSuccessMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testNettyPoolableFactory1() {
        new NettyPoolableFactory(null);
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
