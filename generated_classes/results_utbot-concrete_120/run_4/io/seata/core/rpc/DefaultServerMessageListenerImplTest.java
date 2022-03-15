package io.seata.core.rpc;

import org.junit.Test;
import io.seata.core.protocol.RegisterRMRequest;
import io.seata.core.rpc.netty.RpcServer;
import io.seata.core.rpc.netty.RegisterCheckAuthHandler;
import io.netty.channel.DefaultChannelPipeline;
import java.lang.reflect.Method;
import io.seata.core.protocol.RegisterTMRequest;
import io.netty.channel.unix.DomainSocketAddress;
import java.net.InetSocketAddress;
import java.net.Inet6Address;
import java.net.Inet4Address;
import java.util.concurrent.BlockingQueue;
import org.slf4j.Logger;
import io.seata.core.rpc.DefaultServerMessageListenerImpl.BatchLogRunnable;
import io.seata.core.rpc.DefaultServerMessageListenerImpl;
import java.util.concurrent.LinkedBlockingDeque;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import sun.misc.Unsafe;

import static org.mockito.Mockito.mock;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.mockStatic;
import static org.junit.Assert.assertEquals;

public class DefaultServerMessageListenerImplTest {
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testOnTrxMessage1() throws Throwable  {
        DefaultServerMessageListenerImpl defaultServerMessageListenerImpl = ((DefaultServerMessageListenerImpl) createInstance("io.seata.core.rpc.DefaultServerMessageListenerImpl"));
        Object object = new Object();
        
        defaultServerMessageListenerImpl.onTrxMessage(0L, null, object, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testOnTrxMessage2() throws Throwable  {
        DefaultServerMessageListenerImpl defaultServerMessageListenerImpl = ((DefaultServerMessageListenerImpl) createInstance("io.seata.core.rpc.DefaultServerMessageListenerImpl"));
        java.lang.Object[] directLongBufferRUArray = createArray("[Ljava.nio.DirectLongBufferRU;", 0);
        
        defaultServerMessageListenerImpl.onTrxMessage(0L, null, directLongBufferRUArray, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testOnRegRmMessage1() throws Throwable  {
        DefaultServerMessageListenerImpl defaultServerMessageListenerImpl = ((DefaultServerMessageListenerImpl) createInstance("io.seata.core.rpc.DefaultServerMessageListenerImpl"));
        RegisterRMRequest registerRMRequest = new RegisterRMRequest();
        
        defaultServerMessageListenerImpl.onRegRmMessage(0L, null, registerRMRequest, null, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testOnRegRmMessage2() throws Throwable  {
        DefaultServerMessageListenerImpl defaultServerMessageListenerImpl = ((DefaultServerMessageListenerImpl) createInstance("io.seata.core.rpc.DefaultServerMessageListenerImpl"));
        RpcServer rpcServer = ((RpcServer) createInstance("io.seata.core.rpc.netty.RpcServer"));
        RegisterCheckAuthHandler registerCheckAuthHandlerMock = mock(RegisterCheckAuthHandler.class);
        when(registerCheckAuthHandlerMock.regResourceManagerCheckAuth(any())).thenReturn(false);
        
        defaultServerMessageListenerImpl.onRegRmMessage(0L, null, null, rpcServer, registerCheckAuthHandlerMock);
        
        RegisterCheckAuthHandler finalRegisterCheckAuthHandlerMock = registerCheckAuthHandlerMock;
        
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testOnRegRmMessage3() throws Throwable  {
        DefaultServerMessageListenerImpl defaultServerMessageListenerImpl = ((DefaultServerMessageListenerImpl) createInstance("io.seata.core.rpc.DefaultServerMessageListenerImpl"));
        Object defaultChannelHandlerContext = createInstance("io.netty.channel.DefaultChannelHandlerContext");
        DefaultChannelPipeline defaultChannelPipeline = ((DefaultChannelPipeline) createInstance("io.netty.channel.DefaultChannelPipeline"));
        Object failedChannel = createInstance("io.netty.bootstrap.FailedChannel");
        setField(defaultChannelPipeline, "channel", failedChannel);
        setField(defaultChannelHandlerContext, "pipeline", defaultChannelPipeline);
        RegisterRMRequest registerRMRequest = ((RegisterRMRequest) createInstance("io.seata.core.protocol.RegisterRMRequest"));
        setField(registerRMRequest, "version", null);
        String string = new String("\u0000");
        setField(registerRMRequest, "resourceIds", string);
        RegisterCheckAuthHandler registerCheckAuthHandlerMock = mock(RegisterCheckAuthHandler.class);
        when(registerCheckAuthHandlerMock.regResourceManagerCheckAuth(any())).thenReturn(true);
        
        Class defaultServerMessageListenerImplClazz = Class.forName("io.seata.core.rpc.DefaultServerMessageListenerImpl");
        Class longType = long.class;
        Class defaultChannelHandlerContextType = Class.forName("io.netty.channel.ChannelHandlerContext");
        Class registerRMRequestType = Class.forName("io.seata.core.protocol.RegisterRMRequest");
        Class serverMessageSenderType = Class.forName("io.seata.core.rpc.ServerMessageSender");
        Class registerCheckAuthHandlerMockType = Class.forName("io.seata.core.rpc.netty.RegisterCheckAuthHandler");
        Method onRegRmMessageMethod = defaultServerMessageListenerImplClazz.getDeclaredMethod("onRegRmMessage", longType, defaultChannelHandlerContextType, registerRMRequestType, serverMessageSenderType, registerCheckAuthHandlerMockType);
        onRegRmMessageMethod.setAccessible(true);
        java.lang.Object[] onRegRmMessageMethodArguments = new java.lang.Object[5];
        onRegRmMessageMethodArguments[0] = 0L;
        onRegRmMessageMethodArguments[1] = defaultChannelHandlerContext;
        onRegRmMessageMethodArguments[2] = registerRMRequest;
        onRegRmMessageMethodArguments[3] = null;
        onRegRmMessageMethodArguments[4] = registerCheckAuthHandlerMock;
        try {
            onRegRmMessageMethod.invoke(defaultServerMessageListenerImpl, onRegRmMessageMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        RegisterCheckAuthHandler finalRegisterCheckAuthHandlerMock = registerCheckAuthHandlerMock;
        
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testOnRegTmMessage1() throws Throwable  {
        DefaultServerMessageListenerImpl defaultServerMessageListenerImpl = ((DefaultServerMessageListenerImpl) createInstance("io.seata.core.rpc.DefaultServerMessageListenerImpl"));
        RegisterTMRequest registerTMRequest = new RegisterTMRequest();
        
        defaultServerMessageListenerImpl.onRegTmMessage(0L, null, registerTMRequest, null, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testOnRegTmMessage2() throws Throwable  {
        DefaultServerMessageListenerImpl defaultServerMessageListenerImpl = ((DefaultServerMessageListenerImpl) createInstance("io.seata.core.rpc.DefaultServerMessageListenerImpl"));
        RegisterTMRequest registerTMRequest = ((RegisterTMRequest) createInstance("io.seata.core.protocol.RegisterTMRequest"));
        RegisterCheckAuthHandler registerCheckAuthHandlerMock = mock(RegisterCheckAuthHandler.class);
        
        defaultServerMessageListenerImpl.onRegTmMessage(0L, null, registerTMRequest, null, registerCheckAuthHandlerMock);
        
        RegisterCheckAuthHandler finalRegisterCheckAuthHandlerMock = registerCheckAuthHandlerMock;
        
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testOnRegTmMessage3() throws Throwable  {
        DefaultServerMessageListenerImpl defaultServerMessageListenerImpl = ((DefaultServerMessageListenerImpl) createInstance("io.seata.core.rpc.DefaultServerMessageListenerImpl"));
        Object defaultChannelHandlerContext = createInstance("io.netty.channel.DefaultChannelHandlerContext");
        DefaultChannelPipeline defaultChannelPipeline = ((DefaultChannelPipeline) createInstance("io.netty.channel.DefaultChannelPipeline"));
        Object failedChannel = createInstance("io.netty.bootstrap.FailedChannel");
        DomainSocketAddress domainSocketAddress = ((DomainSocketAddress) createInstance("io.netty.channel.unix.DomainSocketAddress"));
        setField(failedChannel, "remoteAddress", domainSocketAddress);
        setField(defaultChannelPipeline, "channel", failedChannel);
        setField(defaultChannelHandlerContext, "pipeline", defaultChannelPipeline);
        RegisterTMRequest registerTMRequest = ((RegisterTMRequest) createInstance("io.seata.core.protocol.RegisterTMRequest"));
        RpcServer rpcServer = ((RpcServer) createInstance("io.seata.core.rpc.netty.RpcServer"));
        
        Class defaultServerMessageListenerImplClazz = Class.forName("io.seata.core.rpc.DefaultServerMessageListenerImpl");
        Class longType = long.class;
        Class defaultChannelHandlerContextType = Class.forName("io.netty.channel.ChannelHandlerContext");
        Class registerTMRequestType = Class.forName("io.seata.core.protocol.RegisterTMRequest");
        Class rpcServerType = Class.forName("io.seata.core.rpc.ServerMessageSender");
        Class registerCheckAuthHandlerType = Class.forName("io.seata.core.rpc.netty.RegisterCheckAuthHandler");
        Method onRegTmMessageMethod = defaultServerMessageListenerImplClazz.getDeclaredMethod("onRegTmMessage", longType, defaultChannelHandlerContextType, registerTMRequestType, rpcServerType, registerCheckAuthHandlerType);
        onRegTmMessageMethod.setAccessible(true);
        java.lang.Object[] onRegTmMessageMethodArguments = new java.lang.Object[5];
        onRegTmMessageMethodArguments[0] = 0L;
        onRegTmMessageMethodArguments[1] = defaultChannelHandlerContext;
        onRegTmMessageMethodArguments[2] = registerTMRequest;
        onRegTmMessageMethodArguments[3] = rpcServer;
        onRegTmMessageMethodArguments[4] = null;
        try {
            onRegTmMessageMethod.invoke(defaultServerMessageListenerImpl, onRegTmMessageMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testOnRegTmMessage4() throws Throwable  {
        DefaultServerMessageListenerImpl defaultServerMessageListenerImpl = ((DefaultServerMessageListenerImpl) createInstance("io.seata.core.rpc.DefaultServerMessageListenerImpl"));
        Object tailContext = createInstance("io.netty.channel.DefaultChannelPipeline$TailContext");
        DefaultChannelPipeline defaultChannelPipeline = ((DefaultChannelPipeline) createInstance("io.netty.channel.DefaultChannelPipeline"));
        Object failedChannel = createInstance("io.netty.bootstrap.FailedChannel");
        InetSocketAddress inetSocketAddress = ((InetSocketAddress) createInstance("java.net.InetSocketAddress"));
        Object inetSocketAddressHolder = createInstance("java.net.InetSocketAddress$InetSocketAddressHolder");
        Inet6Address inet6Address = ((Inet6Address) createInstance("java.net.Inet6Address"));
        Object inet6AddressHolder = createInstance("java.net.Inet6Address$Inet6AddressHolder");
        byte[] byteArray = new byte[0];
        setField(inet6AddressHolder, "ipaddress", byteArray);
        setField(inet6Address, "holder6", inet6AddressHolder);
        setField(inetSocketAddressHolder, "addr", inet6Address);
        setField(inetSocketAddress, "holder", inetSocketAddressHolder);
        setField(failedChannel, "remoteAddress", inetSocketAddress);
        setField(defaultChannelPipeline, "channel", failedChannel);
        setField(tailContext, "pipeline", defaultChannelPipeline);
        RegisterTMRequest registerTMRequest = ((RegisterTMRequest) createInstance("io.seata.core.protocol.RegisterTMRequest"));
        RpcServer rpcServer = ((RpcServer) createInstance("io.seata.core.rpc.netty.RpcServer"));
        
        Class defaultServerMessageListenerImplClazz = Class.forName("io.seata.core.rpc.DefaultServerMessageListenerImpl");
        Class longType = long.class;
        Class tailContextType = Class.forName("io.netty.channel.ChannelHandlerContext");
        Class registerTMRequestType = Class.forName("io.seata.core.protocol.RegisterTMRequest");
        Class rpcServerType = Class.forName("io.seata.core.rpc.ServerMessageSender");
        Class registerCheckAuthHandlerType = Class.forName("io.seata.core.rpc.netty.RegisterCheckAuthHandler");
        Method onRegTmMessageMethod = defaultServerMessageListenerImplClazz.getDeclaredMethod("onRegTmMessage", longType, tailContextType, registerTMRequestType, rpcServerType, registerCheckAuthHandlerType);
        onRegTmMessageMethod.setAccessible(true);
        java.lang.Object[] onRegTmMessageMethodArguments = new java.lang.Object[5];
        onRegTmMessageMethodArguments[0] = 0L;
        onRegTmMessageMethodArguments[1] = tailContext;
        onRegTmMessageMethodArguments[2] = registerTMRequest;
        onRegTmMessageMethodArguments[3] = rpcServer;
        onRegTmMessageMethodArguments[4] = null;
        try {
            onRegTmMessageMethod.invoke(defaultServerMessageListenerImpl, onRegTmMessageMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testOnRegTmMessage5() throws Throwable  {
        DefaultServerMessageListenerImpl defaultServerMessageListenerImpl = ((DefaultServerMessageListenerImpl) createInstance("io.seata.core.rpc.DefaultServerMessageListenerImpl"));
        Object tailContext = createInstance("io.netty.channel.DefaultChannelPipeline$TailContext");
        DefaultChannelPipeline defaultChannelPipeline = ((DefaultChannelPipeline) createInstance("io.netty.channel.DefaultChannelPipeline"));
        Object failedChannel = createInstance("io.netty.bootstrap.FailedChannel");
        InetSocketAddress inetSocketAddress = ((InetSocketAddress) createInstance("java.net.InetSocketAddress"));
        Object inetSocketAddressHolder = createInstance("java.net.InetSocketAddress$InetSocketAddressHolder");
        Inet4Address inet4Address = ((Inet4Address) createInstance("java.net.Inet4Address"));
        Object inetAddressHolder = createInstance("java.net.InetAddress$InetAddressHolder");
        setField(inetAddressHolder, "address", 0);
        setField(inet4Address, "holder", inetAddressHolder);
        setField(inetSocketAddressHolder, "addr", inet4Address);
        setField(inetSocketAddress, "holder", inetSocketAddressHolder);
        setField(failedChannel, "remoteAddress", inetSocketAddress);
        setField(defaultChannelPipeline, "channel", failedChannel);
        setField(tailContext, "pipeline", defaultChannelPipeline);
        RegisterTMRequest registerTMRequest = ((RegisterTMRequest) createInstance("io.seata.core.protocol.RegisterTMRequest"));
        RpcServer rpcServer = ((RpcServer) createInstance("io.seata.core.rpc.netty.RpcServer"));
        
        Class defaultServerMessageListenerImplClazz = Class.forName("io.seata.core.rpc.DefaultServerMessageListenerImpl");
        Class longType = long.class;
        Class tailContextType = Class.forName("io.netty.channel.ChannelHandlerContext");
        Class registerTMRequestType = Class.forName("io.seata.core.protocol.RegisterTMRequest");
        Class rpcServerType = Class.forName("io.seata.core.rpc.ServerMessageSender");
        Class registerCheckAuthHandlerType = Class.forName("io.seata.core.rpc.netty.RegisterCheckAuthHandler");
        Method onRegTmMessageMethod = defaultServerMessageListenerImplClazz.getDeclaredMethod("onRegTmMessage", longType, tailContextType, registerTMRequestType, rpcServerType, registerCheckAuthHandlerType);
        onRegTmMessageMethod.setAccessible(true);
        java.lang.Object[] onRegTmMessageMethodArguments = new java.lang.Object[5];
        onRegTmMessageMethodArguments[0] = 0L;
        onRegTmMessageMethodArguments[1] = tailContext;
        onRegTmMessageMethodArguments[2] = registerTMRequest;
        onRegTmMessageMethodArguments[3] = rpcServer;
        onRegTmMessageMethodArguments[4] = null;
        try {
            onRegTmMessageMethod.invoke(defaultServerMessageListenerImpl, onRegTmMessageMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testOnCheckMessage1() throws Throwable  {
        DefaultServerMessageListenerImpl defaultServerMessageListenerImpl = ((DefaultServerMessageListenerImpl) createInstance("io.seata.core.rpc.DefaultServerMessageListenerImpl"));
        
        defaultServerMessageListenerImpl.onCheckMessage(0L, null, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetServerMessageSender1() throws Throwable  {
        DefaultServerMessageListenerImpl defaultServerMessageListenerImpl = ((DefaultServerMessageListenerImpl) createInstance("io.seata.core.rpc.DefaultServerMessageListenerImpl"));
        setField(defaultServerMessageListenerImpl, "serverMessageSender", null);
        RpcServer rpcServer = ((RpcServer) createInstance("io.seata.core.rpc.netty.RpcServer"));
        
        Object initialDefaultServerMessageListenerImplServerMessageSender = getFieldValue(defaultServerMessageListenerImpl, "serverMessageSender");
        
        defaultServerMessageListenerImpl.setServerMessageSender(rpcServer);
        
        Object finalDefaultServerMessageListenerImplServerMessageSender = getFieldValue(defaultServerMessageListenerImpl, "serverMessageSender");
        
        assertFalse(initialDefaultServerMessageListenerImplServerMessageSender == finalDefaultServerMessageListenerImplServerMessageSender);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetServerMessageSender1() throws Throwable  {
        DefaultServerMessageListenerImpl defaultServerMessageListenerImpl = ((DefaultServerMessageListenerImpl) createInstance("io.seata.core.rpc.DefaultServerMessageListenerImpl"));
        setField(defaultServerMessageListenerImpl, "serverMessageSender", null);
        
        ServerMessageSender actual = defaultServerMessageListenerImpl.getServerMessageSender();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDefaultServerMessageListenerImpl1() throws Throwable  {
        TransactionMessageHandler transactionMessageHandlerMock = mock(TransactionMessageHandler.class);
        DefaultServerMessageListenerImpl actual = new DefaultServerMessageListenerImpl(transactionMessageHandlerMock);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testRun1() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            Class defaultServerMessageListenerImplClazz = Class.forName("io.seata.core.rpc.DefaultServerMessageListenerImpl");
            BlockingQueue prevMessageStrings = ((BlockingQueue) getStaticFieldValue(defaultServerMessageListenerImplClazz, "messageStrings"));
            try {
                setStaticField(defaultServerMessageListenerImplClazz, "messageStrings", null);
                mockedStatic = mockStatic(org.slf4j.LoggerFactory.class);
                Logger loggerMock = mock(Logger.class);
                mockedStatic.when(() -> {
                    org.slf4j.LoggerFactory.getLogger(org.mockito.ArgumentMatchers.any(Class.class));
                }).thenReturn(loggerMock);
                DefaultServerMessageListenerImpl.BatchLogRunnable batchLogRunnable = ((DefaultServerMessageListenerImpl.BatchLogRunnable) createInstance("io.seata.core.rpc.DefaultServerMessageListenerImpl$BatchLogRunnable"));
                
                batchLogRunnable.run();
            } finally {
                setStaticField(DefaultServerMessageListenerImpl.class, "messageStrings", prevMessageStrings);
            }
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testRun2() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            Class defaultServerMessageListenerImplClazz = Class.forName("io.seata.core.rpc.DefaultServerMessageListenerImpl");
            BlockingQueue prevMessageStrings = ((BlockingQueue) getStaticFieldValue(defaultServerMessageListenerImplClazz, "messageStrings"));
            try {
                LinkedBlockingDeque messageStrings = ((LinkedBlockingDeque) createInstance("java.util.concurrent.LinkedBlockingDeque"));
                Object segment = createInstance("java.util.concurrent.ConcurrentHashMap$Segment");
                Object fairSync = createInstance("java.util.concurrent.locks.ReentrantLock$FairSync");
                Thread thread = ((Thread) createInstance("java.lang.Thread"));
                setField(fairSync, "exclusiveOwnerThread", thread);
                setField(fairSync, "state", Integer.MAX_VALUE);
                setField(segment, "sync", fairSync);
                setField(messageStrings, "lock", segment);
                setStaticField(defaultServerMessageListenerImplClazz, "messageStrings", messageStrings);
                mockedStatic = mockStatic(org.slf4j.LoggerFactory.class);
                Logger loggerMock = mock(Logger.class);
                mockedStatic.when(() -> {
                    org.slf4j.LoggerFactory.getLogger(org.mockito.ArgumentMatchers.any(Class.class));
                }).thenReturn(loggerMock);
                DefaultServerMessageListenerImpl.BatchLogRunnable batchLogRunnable = ((DefaultServerMessageListenerImpl.BatchLogRunnable) createInstance("io.seata.core.rpc.DefaultServerMessageListenerImpl$BatchLogRunnable"));
                
                batchLogRunnable.run();
            } finally {
                setStaticField(DefaultServerMessageListenerImpl.class, "messageStrings", prevMessageStrings);
            }
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testRun3() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            Class defaultServerMessageListenerImplClazz = Class.forName("io.seata.core.rpc.DefaultServerMessageListenerImpl");
            BlockingQueue prevMessageStrings = ((BlockingQueue) getStaticFieldValue(defaultServerMessageListenerImplClazz, "messageStrings"));
            try {
                LinkedBlockingDeque messageStrings = ((LinkedBlockingDeque) createInstance("java.util.concurrent.LinkedBlockingDeque"));
                Object segment = createInstance("java.util.concurrent.ConcurrentHashMap$Segment");
                Object fairSync = createInstance("java.util.concurrent.locks.ReentrantLock$FairSync");
                Thread thread = ((Thread) createInstance("java.lang.Thread"));
                setField(fairSync, "exclusiveOwnerThread", thread);
                setField(fairSync, "state", 2);
                setField(segment, "sync", fairSync);
                setField(messageStrings, "lock", segment);
                setField(messageStrings, "count", 0);
                setStaticField(defaultServerMessageListenerImplClazz, "messageStrings", messageStrings);
                mockedStatic = mockStatic(org.slf4j.LoggerFactory.class);
                Logger loggerMock = mock(Logger.class);
                mockedStatic.when(() -> {
                    org.slf4j.LoggerFactory.getLogger(org.mockito.ArgumentMatchers.any(Class.class));
                }).thenReturn(loggerMock);
                DefaultServerMessageListenerImpl.BatchLogRunnable batchLogRunnable = ((DefaultServerMessageListenerImpl.BatchLogRunnable) createInstance("io.seata.core.rpc.DefaultServerMessageListenerImpl$BatchLogRunnable"));
                
                Object object = getStaticFieldValue(DefaultServerMessageListenerImpl.class, "messageStrings");
                Object objectLock = getFieldValue(object, "lock");
                Object objectLockLockSync = getFieldValue(objectLock, "sync");
                Object initialDefaultServerMessageListenerImplMessageStringsLockSyncState = getFieldValue(objectLockLockSync, "state");
                
                batchLogRunnable.run();
                
                Object object1 = getStaticFieldValue(DefaultServerMessageListenerImpl.class, "messageStrings");
                Object object1Lock = getFieldValue(object1, "lock");
                Object object1LockLockSync = getFieldValue(object1Lock, "sync");
                Object finalDefaultServerMessageListenerImplMessageStringsLockSyncState = getFieldValue(object1LockLockSync, "state");
                
                assertEquals(3, finalDefaultServerMessageListenerImplMessageStringsLockSyncState);
            } finally {
                setStaticField(DefaultServerMessageListenerImpl.class, "messageStrings", prevMessageStrings);
            }
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    
    ///region Errors report for <init>
    
    public void testBatchLogRunnable_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Inner class io.seata.core.rpc.DefaultServerMessageListenerImpl$BatchLogRunnable constructor testing is not supported yet
        // 
    }
    ///endregion
    
    
    ///region Errors report for <init>
    
    public void testBatchLogRunnable_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Inner class io.seata.core.rpc.DefaultServerMessageListenerImpl$BatchLogRunnable constructor testing is not supported yet
        // 
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
    private static Object getStaticFieldValue(Class<?> clazz, String fieldName) throws Exception {
        java.lang.reflect.Field field;
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);
                java.lang.reflect.Field modifiersField = java.lang.reflect.Field.class.getDeclaredField("modifiers");
                modifiersField.setAccessible(true);
                modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
                
                return field.get(null);
            } catch (NoSuchFieldException e) {
                clazz = clazz.getSuperclass();
            }
        } while (clazz != null);
    
        throw new NoSuchFieldException("Field '" + fieldName + "' not found on class " + clazz);
    }
    private static void setStaticField(Class<?> clazz, String fieldName, Object fieldValue) throws Exception {
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
        field.set(null, fieldValue);
    }
    private static sun.misc.Unsafe getUnsafeInstance() throws Exception {
        java.lang.reflect.Field f = sun.misc.Unsafe.class.getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return (sun.misc.Unsafe) f.get(null);
    }
}
