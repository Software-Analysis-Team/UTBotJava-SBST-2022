package io.seata.core.rpc.netty;

import org.junit.Test;
import io.netty.channel.Channel;
import org.slf4j.Logger;
import java.lang.reflect.Method;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ReflectiveChannelFactory;
import io.netty.bootstrap.BootstrapConfig;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.DefaultChannelPipeline;
import io.netty.util.concurrent.DefaultEventExecutor;
import io.seata.core.rpc.netty.NettyPoolKey.TransactionRole;
import io.seata.core.rpc.netty.NettyPoolKey;
import io.seata.core.protocol.RegisterTMResponse;
import io.seata.core.protocol.RegisterRMResponse;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Array;
import sun.misc.Unsafe;

import static org.junit.Assert.assertFalse;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

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
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(org.slf4j.LoggerFactory.class);
            Logger loggerMock = mock(Logger.class);
            when(loggerMock.isInfoEnabled()).thenReturn(false);
            mockedStatic.when(() -> {
                org.slf4j.LoggerFactory.getLogger(any(Class.class));
            }).thenReturn(loggerMock);
            NettyPoolableFactory nettyPoolableFactory = ((NettyPoolableFactory) createInstance("io.seata.core.rpc.netty.NettyPoolableFactory"));
            Object failedChannel = createInstance("io.netty.bootstrap.FailedChannel");
            
            Class nettyPoolableFactoryClazz = Class.forName("io.seata.core.rpc.netty.NettyPoolableFactory");
            Class nettyPoolKeyType = Class.forName("io.seata.core.rpc.netty.NettyPoolKey");
            Class failedChannelType = Class.forName("io.netty.channel.Channel");
            Method validateObjectMethod = nettyPoolableFactoryClazz.getDeclaredMethod("validateObject", nettyPoolKeyType, failedChannelType);
            validateObjectMethod.setAccessible(true);
            java.lang.Object[] validateObjectMethodArguments = new java.lang.Object[2];
            validateObjectMethodArguments[0] = null;
            validateObjectMethodArguments[1] = failedChannel;
            boolean actual = ((boolean) validateObjectMethod.invoke(nettyPoolableFactory, validateObjectMethodArguments));
            
            assertFalse(actual);
        } finally {
            mockedStatic.close();
        }
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
            
            boolean actual = nettyPoolableFactory.validateObject(((NettyPoolKey) null), ((Channel) null));
            
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
            when(loggerMock.isInfoEnabled()).thenReturn(true);
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
            Object failedChannel = createInstance("io.netty.bootstrap.FailedChannel");
            String string = new String("");
            setField(failedChannel, "strVal", string);
            setField(failedChannel, "strValActive", false);
            
            Class nettyPoolableFactoryClazz = Class.forName("io.seata.core.rpc.netty.NettyPoolableFactory");
            Class nettyPoolKeyType = Class.forName("io.seata.core.rpc.netty.NettyPoolKey");
            Class failedChannelType = Class.forName("io.netty.channel.Channel");
            Method validateObjectMethod = nettyPoolableFactoryClazz.getDeclaredMethod("validateObject", nettyPoolKeyType, failedChannelType);
            validateObjectMethod.setAccessible(true);
            java.lang.Object[] validateObjectMethodArguments = new java.lang.Object[2];
            validateObjectMethodArguments[0] = null;
            validateObjectMethodArguments[1] = failedChannel;
            boolean actual = ((boolean) validateObjectMethod.invoke(nettyPoolableFactory, validateObjectMethodArguments));
            
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
        NettyPoolableFactory nettyPoolableFactory = ((NettyPoolableFactory) createInstance("io.seata.core.rpc.netty.NettyPoolableFactory"));
        NettyPoolKey nettyPoolKey = ((NettyPoolKey) createInstance("io.seata.core.rpc.netty.NettyPoolKey"));
        String string = new String("\u0000\u0000\u0000");
        setField(nettyPoolKey, "address", string);
        
        nettyPoolableFactory.makeObject(nettyPoolKey);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testMakeObject4() throws Throwable  {
        NettyPoolableFactory nettyPoolableFactory = ((NettyPoolableFactory) createInstance("io.seata.core.rpc.netty.NettyPoolableFactory"));
        NettyPoolKey nettyPoolKey = ((NettyPoolKey) createInstance("io.seata.core.rpc.netty.NettyPoolKey"));
        String string = new String(":");
        setField(nettyPoolKey, "address", string);
        
        nettyPoolableFactory.makeObject(nettyPoolKey);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testMakeObject5() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(org.slf4j.LoggerFactory.class);
            Logger loggerMock = mock(Logger.class);
            when(loggerMock.isInfoEnabled()).thenReturn(false);
            mockedStatic.when(() -> {
                org.slf4j.LoggerFactory.getLogger(any(Class.class));
            }).thenReturn(loggerMock);
            NettyPoolableFactory nettyPoolableFactory = ((NettyPoolableFactory) createInstance("io.seata.core.rpc.netty.NettyPoolableFactory"));
            RmRpcClient rmRpcClient = ((RmRpcClient) createInstance("io.seata.core.rpc.netty.RmRpcClient"));
            Bootstrap bootstrap = ((Bootstrap) createInstance("io.netty.bootstrap.Bootstrap"));
            setField(bootstrap, "group", null);
            setField(rmRpcClient, "bootstrap", bootstrap);
            setField(nettyPoolableFactory, "rpcRemotingClient", rmRpcClient);
            NettyPoolKey nettyPoolKey = ((NettyPoolKey) createInstance("io.seata.core.rpc.netty.NettyPoolKey"));
            String string = new String("[\u0000");
            setField(nettyPoolKey, "address", string);
            
            nettyPoolableFactory.makeObject(nettyPoolKey);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testMakeObject6() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(org.slf4j.LoggerFactory.class);
            Logger loggerMock = mock(Logger.class);
            when(loggerMock.isInfoEnabled()).thenReturn(false);
            mockedStatic.when(() -> {
                org.slf4j.LoggerFactory.getLogger(any(Class.class));
            }).thenReturn(loggerMock);
            NettyPoolableFactory nettyPoolableFactory = ((NettyPoolableFactory) createInstance("io.seata.core.rpc.netty.NettyPoolableFactory"));
            RmRpcClient rmRpcClient = ((RmRpcClient) createInstance("io.seata.core.rpc.netty.RmRpcClient"));
            Bootstrap bootstrap = ((Bootstrap) createInstance("io.netty.bootstrap.Bootstrap"));
            setField(bootstrap, "handler", null);
            ReflectiveChannelFactory reflectiveChannelFactory = ((ReflectiveChannelFactory) createInstance("io.netty.channel.ReflectiveChannelFactory"));
            setField(bootstrap, "channelFactory", reflectiveChannelFactory);
            Object epollEventLoop = createInstance("io.netty.channel.epoll.EpollEventLoop");
            setField(bootstrap, "group", epollEventLoop);
            BootstrapConfig bootstrapConfig = ((BootstrapConfig) createInstance("io.netty.bootstrap.BootstrapConfig"));
            ServerBootstrap serverBootstrap = ((ServerBootstrap) createInstance("io.netty.bootstrap.ServerBootstrap"));
            setField(serverBootstrap, "handler", null);
            setField(serverBootstrap, "channelFactory", null);
            setField(serverBootstrap, "group", null);
            setField(bootstrapConfig, "bootstrap", serverBootstrap);
            setField(bootstrap, "config", bootstrapConfig);
            setField(rmRpcClient, "bootstrap", bootstrap);
            setField(nettyPoolableFactory, "rpcRemotingClient", rmRpcClient);
            NettyPoolKey nettyPoolKey = ((NettyPoolKey) createInstance("io.seata.core.rpc.netty.NettyPoolKey"));
            String string = new String("[\u0000");
            setField(nettyPoolKey, "address", string);
            
            nettyPoolableFactory.makeObject(nettyPoolKey);
        } finally {
            mockedStatic.close();
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
    
    @Test(timeout = 10000, expected = Throwable.class)
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
            Object failedChannel = createInstance("io.netty.bootstrap.FailedChannel");
            DefaultChannelPipeline defaultChannelPipeline = ((DefaultChannelPipeline) createInstance("io.netty.channel.DefaultChannelPipeline"));
            Object failedChannel1 = createInstance("io.netty.bootstrap.FailedChannel");
            setField(failedChannel1, "pipeline", null);
            setField(defaultChannelPipeline, "channel", failedChannel1);
            Object defaultChannelHandlerContext = createInstance("io.netty.channel.DefaultChannelHandlerContext");
            DefaultEventExecutor defaultEventExecutor = ((DefaultEventExecutor) createInstance("io.netty.util.concurrent.DefaultEventExecutor"));
            setField(defaultChannelHandlerContext, "executor", defaultEventExecutor);
            setField(defaultChannelHandlerContext, "pipeline", defaultChannelPipeline);
            setField(defaultChannelHandlerContext, "prev", null);
            setField(defaultChannelPipeline, "tail", defaultChannelHandlerContext);
            setField(failedChannel, "pipeline", defaultChannelPipeline);
            
            Class nettyPoolableFactoryClazz = Class.forName("io.seata.core.rpc.netty.NettyPoolableFactory");
            Class nettyPoolKeyType = Class.forName("io.seata.core.rpc.netty.NettyPoolKey");
            Class failedChannelType = Class.forName("io.netty.channel.Channel");
            Method destroyObjectMethod = nettyPoolableFactoryClazz.getDeclaredMethod("destroyObject", nettyPoolKeyType, failedChannelType);
            destroyObjectMethod.setAccessible(true);
            java.lang.Object[] destroyObjectMethodArguments = new java.lang.Object[2];
            destroyObjectMethodArguments[0] = null;
            destroyObjectMethodArguments[1] = failedChannel;
            try {
                destroyObjectMethod.invoke(nettyPoolableFactory, destroyObjectMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }} finally {
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
        
        nettyPoolableFactory.activateObject(((NettyPoolKey) null), ((Channel) null));
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
        
        nettyPoolableFactory.passivateObject(((NettyPoolKey) null), ((Channel) null));
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
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetVersion2() throws Throwable  {
        NettyPoolableFactory nettyPoolableFactory = ((NettyPoolableFactory) createInstance("io.seata.core.rpc.netty.NettyPoolableFactory"));
        
        Class nettyPoolableFactoryClazz = Class.forName("io.seata.core.rpc.netty.NettyPoolableFactory");
        Class objectType = Class.forName("java.lang.Object");
        Class transactionRoleType = Class.forName("io.seata.core.rpc.netty.NettyPoolKey$TransactionRole");
        Method getVersionMethod = nettyPoolableFactoryClazz.getDeclaredMethod("getVersion", objectType, transactionRoleType);
        getVersionMethod.setAccessible(true);
        java.lang.Object[] getVersionMethodArguments = new java.lang.Object[2];
        getVersionMethodArguments[0] = null;
        getVersionMethodArguments[1] = null;
        try {
            getVersionMethod.invoke(nettyPoolableFactory, getVersionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetVersion3() throws Throwable  {
        NettyPoolableFactory nettyPoolableFactory = ((NettyPoolableFactory) createInstance("io.seata.core.rpc.netty.NettyPoolableFactory"));
        java.lang.Object[] byteBufferAsLongBufferBArray = createArray("java.nio.ByteBufferAsLongBufferB", 0);
        NettyPoolKey.TransactionRole transactionRole = NettyPoolKey.TransactionRole.TMROLE;
        
        Class nettyPoolableFactoryClazz = Class.forName("io.seata.core.rpc.netty.NettyPoolableFactory");
        Class byteBufferAsLongBufferBArrayType = Class.forName("java.lang.Object");
        Class transactionRoleType = Class.forName("io.seata.core.rpc.netty.NettyPoolKey$TransactionRole");
        Method getVersionMethod = nettyPoolableFactoryClazz.getDeclaredMethod("getVersion", byteBufferAsLongBufferBArrayType, transactionRoleType);
        getVersionMethod.setAccessible(true);
        java.lang.Object[] getVersionMethodArguments = new java.lang.Object[2];
        getVersionMethodArguments[0] = ((Object) byteBufferAsLongBufferBArray);
        getVersionMethodArguments[1] = transactionRole;
        try {
            getVersionMethod.invoke(nettyPoolableFactory, getVersionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetVersion4() throws Throwable  {
        NettyPoolableFactory nettyPoolableFactory = ((NettyPoolableFactory) createInstance("io.seata.core.rpc.netty.NettyPoolableFactory"));
        NettyPoolKey.TransactionRole transactionRole = NettyPoolKey.TransactionRole.TMROLE;
        
        Class nettyPoolableFactoryClazz = Class.forName("io.seata.core.rpc.netty.NettyPoolableFactory");
        Class objectType = Class.forName("java.lang.Object");
        Class transactionRoleType = Class.forName("io.seata.core.rpc.netty.NettyPoolKey$TransactionRole");
        Method getVersionMethod = nettyPoolableFactoryClazz.getDeclaredMethod("getVersion", objectType, transactionRoleType);
        getVersionMethod.setAccessible(true);
        java.lang.Object[] getVersionMethodArguments = new java.lang.Object[2];
        getVersionMethodArguments[0] = null;
        getVersionMethodArguments[1] = transactionRole;
        try {
            getVersionMethod.invoke(nettyPoolableFactory, getVersionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetVersion5() throws Throwable  {
        NettyPoolableFactory nettyPoolableFactory = ((NettyPoolableFactory) createInstance("io.seata.core.rpc.netty.NettyPoolableFactory"));
        RegisterTMResponse registerTMResponse = ((RegisterTMResponse) createInstance("io.seata.core.protocol.RegisterTMResponse"));
        setField(registerTMResponse, "version", null);
        NettyPoolKey.TransactionRole transactionRole = NettyPoolKey.TransactionRole.TMROLE;
        
        Class nettyPoolableFactoryClazz = Class.forName("io.seata.core.rpc.netty.NettyPoolableFactory");
        Class registerTMResponseType = Class.forName("java.lang.Object");
        Class transactionRoleType = Class.forName("io.seata.core.rpc.netty.NettyPoolKey$TransactionRole");
        Method getVersionMethod = nettyPoolableFactoryClazz.getDeclaredMethod("getVersion", registerTMResponseType, transactionRoleType);
        getVersionMethod.setAccessible(true);
        java.lang.Object[] getVersionMethodArguments = new java.lang.Object[2];
        getVersionMethodArguments[0] = registerTMResponse;
        getVersionMethodArguments[1] = transactionRole;
        String actual = ((String) getVersionMethod.invoke(nettyPoolableFactory, getVersionMethodArguments));
        
        assertNull(actual);
    }
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
    public void testIsResponseSuccess3() throws Throwable  {
        NettyPoolableFactory nettyPoolableFactory = ((NettyPoolableFactory) createInstance("io.seata.core.rpc.netty.NettyPoolableFactory"));
        java.lang.Object[] directFloatBufferSArray = createArray("java.nio.DirectFloatBufferS", 0);
        
        Class nettyPoolableFactoryClazz = Class.forName("io.seata.core.rpc.netty.NettyPoolableFactory");
        Class directFloatBufferSArrayType = Class.forName("java.lang.Object");
        Class transactionRoleType = Class.forName("io.seata.core.rpc.netty.NettyPoolKey$TransactionRole");
        Method isResponseSuccessMethod = nettyPoolableFactoryClazz.getDeclaredMethod("isResponseSuccess", directFloatBufferSArrayType, transactionRoleType);
        isResponseSuccessMethod.setAccessible(true);
        java.lang.Object[] isResponseSuccessMethodArguments = new java.lang.Object[2];
        isResponseSuccessMethodArguments[0] = ((Object) directFloatBufferSArray);
        isResponseSuccessMethodArguments[1] = null;
        try {
            isResponseSuccessMethod.invoke(nettyPoolableFactory, isResponseSuccessMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIsResponseSuccess4() throws Throwable  {
        NettyPoolableFactory nettyPoolableFactory = ((NettyPoolableFactory) createInstance("io.seata.core.rpc.netty.NettyPoolableFactory"));
        java.lang.Object[] directFloatBufferSArray = createArray("java.nio.DirectFloatBufferS", 0);
        NettyPoolKey.TransactionRole transactionRole = NettyPoolKey.TransactionRole.TMROLE;
        
        Class nettyPoolableFactoryClazz = Class.forName("io.seata.core.rpc.netty.NettyPoolableFactory");
        Class directFloatBufferSArrayType = Class.forName("java.lang.Object");
        Class transactionRoleType = Class.forName("io.seata.core.rpc.netty.NettyPoolKey$TransactionRole");
        Method isResponseSuccessMethod = nettyPoolableFactoryClazz.getDeclaredMethod("isResponseSuccess", directFloatBufferSArrayType, transactionRoleType);
        isResponseSuccessMethod.setAccessible(true);
        java.lang.Object[] isResponseSuccessMethodArguments = new java.lang.Object[2];
        isResponseSuccessMethodArguments[0] = ((Object) directFloatBufferSArray);
        isResponseSuccessMethodArguments[1] = transactionRole;
        boolean actual = ((boolean) isResponseSuccessMethod.invoke(nettyPoolableFactory, isResponseSuccessMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIsResponseSuccess5() throws Throwable  {
        NettyPoolableFactory nettyPoolableFactory = ((NettyPoolableFactory) createInstance("io.seata.core.rpc.netty.NettyPoolableFactory"));
        RegisterTMResponse registerTMResponse = ((RegisterTMResponse) createInstance("io.seata.core.protocol.RegisterTMResponse"));
        setField(registerTMResponse, "identified", true);
        NettyPoolKey.TransactionRole transactionRole = NettyPoolKey.TransactionRole.TMROLE;
        
        Class nettyPoolableFactoryClazz = Class.forName("io.seata.core.rpc.netty.NettyPoolableFactory");
        Class registerTMResponseType = Class.forName("java.lang.Object");
        Class transactionRoleType = Class.forName("io.seata.core.rpc.netty.NettyPoolKey$TransactionRole");
        Method isResponseSuccessMethod = nettyPoolableFactoryClazz.getDeclaredMethod("isResponseSuccess", registerTMResponseType, transactionRoleType);
        isResponseSuccessMethod.setAccessible(true);
        java.lang.Object[] isResponseSuccessMethodArguments = new java.lang.Object[2];
        isResponseSuccessMethodArguments[0] = registerTMResponse;
        isResponseSuccessMethodArguments[1] = transactionRole;
        boolean actual = ((boolean) isResponseSuccessMethod.invoke(nettyPoolableFactory, isResponseSuccessMethodArguments));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIsResponseSuccess6() throws Throwable  {
        NettyPoolableFactory nettyPoolableFactory = ((NettyPoolableFactory) createInstance("io.seata.core.rpc.netty.NettyPoolableFactory"));
        RegisterTMResponse registerTMResponse = ((RegisterTMResponse) createInstance("io.seata.core.protocol.RegisterTMResponse"));
        setField(registerTMResponse, "identified", false);
        NettyPoolKey.TransactionRole transactionRole = NettyPoolKey.TransactionRole.TMROLE;
        
        Class nettyPoolableFactoryClazz = Class.forName("io.seata.core.rpc.netty.NettyPoolableFactory");
        Class registerTMResponseType = Class.forName("java.lang.Object");
        Class transactionRoleType = Class.forName("io.seata.core.rpc.netty.NettyPoolKey$TransactionRole");
        Method isResponseSuccessMethod = nettyPoolableFactoryClazz.getDeclaredMethod("isResponseSuccess", registerTMResponseType, transactionRoleType);
        isResponseSuccessMethod.setAccessible(true);
        java.lang.Object[] isResponseSuccessMethodArguments = new java.lang.Object[2];
        isResponseSuccessMethodArguments[0] = registerTMResponse;
        isResponseSuccessMethodArguments[1] = transactionRole;
        boolean actual = ((boolean) isResponseSuccessMethod.invoke(nettyPoolableFactory, isResponseSuccessMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIsResponseSuccess7() throws Throwable  {
        NettyPoolableFactory nettyPoolableFactory = ((NettyPoolableFactory) createInstance("io.seata.core.rpc.netty.NettyPoolableFactory"));
        java.lang.Object[] directFloatBufferSArray = createArray("java.nio.DirectFloatBufferS", 0);
        NettyPoolKey.TransactionRole transactionRole = NettyPoolKey.TransactionRole.RMROLE;
        
        Class nettyPoolableFactoryClazz = Class.forName("io.seata.core.rpc.netty.NettyPoolableFactory");
        Class directFloatBufferSArrayType = Class.forName("java.lang.Object");
        Class transactionRoleType = Class.forName("io.seata.core.rpc.netty.NettyPoolKey$TransactionRole");
        Method isResponseSuccessMethod = nettyPoolableFactoryClazz.getDeclaredMethod("isResponseSuccess", directFloatBufferSArrayType, transactionRoleType);
        isResponseSuccessMethod.setAccessible(true);
        java.lang.Object[] isResponseSuccessMethodArguments = new java.lang.Object[2];
        isResponseSuccessMethodArguments[0] = ((Object) directFloatBufferSArray);
        isResponseSuccessMethodArguments[1] = transactionRole;
        boolean actual = ((boolean) isResponseSuccessMethod.invoke(nettyPoolableFactory, isResponseSuccessMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIsResponseSuccess8() throws Throwable  {
        NettyPoolableFactory nettyPoolableFactory = ((NettyPoolableFactory) createInstance("io.seata.core.rpc.netty.NettyPoolableFactory"));
        RegisterRMResponse registerRMResponse = ((RegisterRMResponse) createInstance("io.seata.core.protocol.RegisterRMResponse"));
        setField(registerRMResponse, "identified", false);
        NettyPoolKey.TransactionRole transactionRole = NettyPoolKey.TransactionRole.RMROLE;
        
        Class nettyPoolableFactoryClazz = Class.forName("io.seata.core.rpc.netty.NettyPoolableFactory");
        Class registerRMResponseType = Class.forName("java.lang.Object");
        Class transactionRoleType = Class.forName("io.seata.core.rpc.netty.NettyPoolKey$TransactionRole");
        Method isResponseSuccessMethod = nettyPoolableFactoryClazz.getDeclaredMethod("isResponseSuccess", registerRMResponseType, transactionRoleType);
        isResponseSuccessMethod.setAccessible(true);
        java.lang.Object[] isResponseSuccessMethodArguments = new java.lang.Object[2];
        isResponseSuccessMethodArguments[0] = registerRMResponse;
        isResponseSuccessMethodArguments[1] = transactionRole;
        boolean actual = ((boolean) isResponseSuccessMethod.invoke(nettyPoolableFactory, isResponseSuccessMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIsResponseSuccess9() throws Throwable  {
        NettyPoolableFactory nettyPoolableFactory = ((NettyPoolableFactory) createInstance("io.seata.core.rpc.netty.NettyPoolableFactory"));
        RegisterRMResponse registerRMResponse = ((RegisterRMResponse) createInstance("io.seata.core.protocol.RegisterRMResponse"));
        setField(registerRMResponse, "identified", true);
        NettyPoolKey.TransactionRole transactionRole = NettyPoolKey.TransactionRole.RMROLE;
        
        Class nettyPoolableFactoryClazz = Class.forName("io.seata.core.rpc.netty.NettyPoolableFactory");
        Class registerRMResponseType = Class.forName("java.lang.Object");
        Class transactionRoleType = Class.forName("io.seata.core.rpc.netty.NettyPoolKey$TransactionRole");
        Method isResponseSuccessMethod = nettyPoolableFactoryClazz.getDeclaredMethod("isResponseSuccess", registerRMResponseType, transactionRoleType);
        isResponseSuccessMethod.setAccessible(true);
        java.lang.Object[] isResponseSuccessMethodArguments = new java.lang.Object[2];
        isResponseSuccessMethodArguments[0] = registerRMResponse;
        isResponseSuccessMethodArguments[1] = transactionRole;
        boolean actual = ((boolean) isResponseSuccessMethod.invoke(nettyPoolableFactory, isResponseSuccessMethodArguments));
        
        assertTrue(actual);
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
