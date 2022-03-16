package io.seata.core.rpc.netty;

import org.junit.Test;
import io.netty.channel.ChannelHandlerContext;
import org.slf4j.Logger;
import java.util.EnumMap;
import io.netty.handler.timeout.IdleStateEvent;
import java.lang.reflect.Method;
import io.seata.core.protocol.RpcMessage;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.locks.ReentrantLock;
import io.netty.util.concurrent.GlobalEventExecutor;
import io.netty.channel.Channel;
import io.seata.core.protocol.HeartbeatMessage;
import java.time.format.SignStyle;
import io.seata.core.protocol.RegisterRMRequest;
import io.seata.core.rpc.DefaultServerMessageListenerImpl;
import io.netty.channel.DefaultChannelPipeline;
import io.seata.core.rpc.ServerMessageListener;
import io.netty.channel.unix.DomainSocketAddress;
import io.netty.channel.unix.DatagramSocketAddress;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.util.concurrent.ThreadPoolExecutor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import sun.misc.Unsafe;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertFalse;

public class RpcServerTest {
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testExceptionCaught1() throws Throwable  {
        RpcServer rpcServer = ((RpcServer) createInstance("io.seata.core.rpc.netty.RpcServer"));
        Throwable throwable = new Throwable();
        
        rpcServer.exceptionCaught(((ChannelHandlerContext) null), throwable);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testExceptionCaught2() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(org.slf4j.LoggerFactory.class);
            Logger loggerMock = mock(Logger.class);
            when(loggerMock.isInfoEnabled()).thenReturn(false);
            mockedStatic.when(() -> {
                org.slf4j.LoggerFactory.getLogger(any(Class.class));
            }).thenReturn(loggerMock);
            RpcServer rpcServer = ((RpcServer) createInstance("io.seata.core.rpc.netty.RpcServer"));
            
            rpcServer.exceptionCaught(((ChannelHandlerContext) null), ((Throwable) null));
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testExceptionCaught3() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(org.slf4j.LoggerFactory.class);
            Logger loggerMock = mock(Logger.class);
            when(loggerMock.isInfoEnabled()).thenReturn(true);
            mockedStatic.when(() -> {
                org.slf4j.LoggerFactory.getLogger(any(Class.class));
            }).thenReturn(loggerMock);
            RpcServer rpcServer = ((RpcServer) createInstance("io.seata.core.rpc.netty.RpcServer"));
            
            rpcServer.exceptionCaught(((ChannelHandlerContext) null), ((Throwable) null));
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testUserEventTriggered1() throws Throwable  {
        RpcServer rpcServer = ((RpcServer) createInstance("io.seata.core.rpc.netty.RpcServer"));
        Object object = new Object();
        
        rpcServer.userEventTriggered(((ChannelHandlerContext) null), object);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testUserEventTriggered2() throws Throwable  {
        RpcServer rpcServer = ((RpcServer) createInstance("io.seata.core.rpc.netty.RpcServer"));
        java.util.EnumMap[] enumMapArray = new java.util.EnumMap[0];
        
        rpcServer.userEventTriggered(((ChannelHandlerContext) null), enumMapArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testUserEventTriggered3() throws Throwable  {
        RpcServer rpcServer = ((RpcServer) createInstance("io.seata.core.rpc.netty.RpcServer"));
        IdleStateEvent idleStateEvent = ((IdleStateEvent) createInstance("io.netty.handler.timeout.IdleStateEvent"));
        
        rpcServer.userEventTriggered(((ChannelHandlerContext) null), idleStateEvent);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testChannelInactive1() throws Throwable  {
        RpcServer rpcServer = ((RpcServer) createInstance("io.seata.core.rpc.netty.RpcServer"));
        
        rpcServer.channelInactive(((ChannelHandlerContext) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testChannelInactive2() throws Throwable  {
        RpcServer rpcServer = ((RpcServer) createInstance("io.seata.core.rpc.netty.RpcServer"));
        Object headContext = createInstance("io.netty.channel.DefaultChannelPipeline$HeadContext");
        
        Class rpcServerClazz = Class.forName("io.seata.core.rpc.netty.RpcServer");
        Class headContextType = Class.forName("io.netty.channel.ChannelHandlerContext");
        Method channelInactiveMethod = rpcServerClazz.getDeclaredMethod("channelInactive", headContextType);
        channelInactiveMethod.setAccessible(true);
        java.lang.Object[] channelInactiveMethodArguments = new java.lang.Object[1];
        channelInactiveMethodArguments[0] = headContext;
        try {
            channelInactiveMethod.invoke(rpcServer, channelInactiveMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testChannelRead1() throws Throwable  {
        RpcServer rpcServer = ((RpcServer) createInstance("io.seata.core.rpc.netty.RpcServer"));
        Object object = new Object();
        
        rpcServer.channelRead(((ChannelHandlerContext) null), object);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testChannelRead2() throws Throwable  {
        RpcServer rpcServer = ((RpcServer) createInstance("io.seata.core.rpc.netty.RpcServer"));
        
        rpcServer.channelRead(((ChannelHandlerContext) null), null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testChannelRead3() throws Throwable  {
        RpcServer rpcServer = ((RpcServer) createInstance("io.seata.core.rpc.netty.RpcServer"));
        RpcMessage rpcMessage = ((RpcMessage) createInstance("io.seata.core.protocol.RpcMessage"));
        setField(rpcMessage, "body", null);
        
        Object initialRpcMessageBody = getFieldValue(rpcMessage, "body");
        
        rpcServer.channelRead(((ChannelHandlerContext) null), rpcMessage);
        
        Object finalRpcMessageBody = getFieldValue(rpcMessage, "body");
        
        assertNull(finalRpcMessageBody);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testChannelRead4() throws Throwable  {
        RpcServer rpcServer = ((RpcServer) createInstance("io.seata.core.rpc.netty.RpcServer"));
        RpcMessage rpcMessage = ((RpcMessage) createInstance("io.seata.core.protocol.RpcMessage"));
        Character character = '\u0000';
        setField(rpcMessage, "body", character);
        
        rpcServer.channelRead(((ChannelHandlerContext) null), rpcMessage);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDestroy1() throws Throwable  {
        RpcServer rpcServer = ((RpcServer) createInstance("io.seata.core.rpc.netty.RpcServer"));
        
        rpcServer.destroy();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDestroy2() throws Throwable  {
        RpcServer rpcServer = ((RpcServer) createInstance("io.seata.core.rpc.netty.RpcServer"));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = ((ScheduledThreadPoolExecutor) createInstance("java.util.concurrent.ScheduledThreadPoolExecutor"));
        ReentrantLock reentrantLock = ((ReentrantLock) createInstance("java.util.concurrent.locks.ReentrantLock"));
        Object fairSync = createInstance("java.util.concurrent.locks.ReentrantLock$FairSync");
        Thread thread = ((Thread) createInstance("java.lang.Thread"));
        setField(fairSync, "exclusiveOwnerThread", thread);
        setField(fairSync, "state", Integer.MAX_VALUE);
        setField(reentrantLock, "sync", fairSync);
        setField(scheduledThreadPoolExecutor, "mainLock", reentrantLock);
        setField(rpcServer, "timerExecutor", scheduledThreadPoolExecutor);
        
        rpcServer.destroy();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDestroy3() throws Throwable  {
        RpcServer rpcServer = ((RpcServer) createInstance("io.seata.core.rpc.netty.RpcServer"));
        GlobalEventExecutor globalEventExecutor = ((GlobalEventExecutor) createInstance("io.netty.util.concurrent.GlobalEventExecutor"));
        setField(rpcServer, "timerExecutor", globalEventExecutor);
        
        rpcServer.destroy();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testSendResponse1() throws Throwable  {
        RpcServer rpcServer = ((RpcServer) createInstance("io.seata.core.rpc.netty.RpcServer"));
        Object object = new Object();
        
        rpcServer.sendResponse(0L, ((Channel) null), object);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testSendResponse2() throws Throwable  {
        RpcServer rpcServer = ((RpcServer) createInstance("io.seata.core.rpc.netty.RpcServer"));
        HeartbeatMessage heartbeatMessage = ((HeartbeatMessage) createInstance("io.seata.core.protocol.HeartbeatMessage"));
        
        rpcServer.sendResponse(0L, ((Channel) null), heartbeatMessage);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDispatch1() throws Throwable  {
        RpcServer rpcServer = ((RpcServer) createInstance("io.seata.core.rpc.netty.RpcServer"));
        Object object = new Object();
        
        rpcServer.dispatch(0L, ((ChannelHandlerContext) null), object);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDispatch2() throws Throwable  {
        RpcServer rpcServer = ((RpcServer) createInstance("io.seata.core.rpc.netty.RpcServer"));
        java.time.format.SignStyle[] signStyleArray = new java.time.format.SignStyle[0];
        
        rpcServer.dispatch(0L, ((ChannelHandlerContext) null), signStyleArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDispatch3() throws Throwable  {
        RpcServer rpcServer = ((RpcServer) createInstance("io.seata.core.rpc.netty.RpcServer"));
        RegisterCheckAuthHandler registerCheckAuthHandlerMock = mock(RegisterCheckAuthHandler.class);
        setField(rpcServer, "checkAuthHandler", registerCheckAuthHandlerMock);
        setField(rpcServer, "serverMessageListener", null);
        RegisterRMRequest registerRMRequest = ((RegisterRMRequest) createInstance("io.seata.core.protocol.RegisterRMRequest"));
        
        Object initialRpcServerCheckAuthHandler = getFieldValue(rpcServer, "checkAuthHandler");
        
        rpcServer.dispatch(0L, ((ChannelHandlerContext) null), registerRMRequest);
        
        Object finalRpcServerCheckAuthHandler = getFieldValue(rpcServer, "checkAuthHandler");
        
        assertFalse(initialRpcServerCheckAuthHandler == finalRpcServerCheckAuthHandler);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDispatch4() throws Throwable  {
        RpcServer rpcServer = ((RpcServer) createInstance("io.seata.core.rpc.netty.RpcServer"));
        RegisterCheckAuthHandler registerCheckAuthHandlerMock = mock(RegisterCheckAuthHandler.class);
        when(registerCheckAuthHandlerMock.regResourceManagerCheckAuth(org.mockito.ArgumentMatchers.any())).thenReturn(true);
        setField(rpcServer, "checkAuthHandler", registerCheckAuthHandlerMock);
        DefaultServerMessageListenerImpl defaultServerMessageListenerImpl = ((DefaultServerMessageListenerImpl) createInstance("io.seata.core.rpc.DefaultServerMessageListenerImpl"));
        setField(rpcServer, "serverMessageListener", defaultServerMessageListenerImpl);
        Object defaultChannelHandlerContext = createInstance("io.netty.channel.DefaultChannelHandlerContext");
        DefaultChannelPipeline defaultChannelPipeline = ((DefaultChannelPipeline) createInstance("io.netty.channel.DefaultChannelPipeline"));
        Object failedChannel = createInstance("io.netty.bootstrap.FailedChannel");
        setField(defaultChannelPipeline, "channel", failedChannel);
        setField(defaultChannelHandlerContext, "pipeline", defaultChannelPipeline);
        RegisterRMRequest registerRMRequest = ((RegisterRMRequest) createInstance("io.seata.core.protocol.RegisterRMRequest"));
        setField(registerRMRequest, "version", null);
        String string = new String("\u0000");
        setField(registerRMRequest, "resourceIds", string);
        
        Object initialRpcServerCheckAuthHandler = getFieldValue(rpcServer, "checkAuthHandler");
        
        Class rpcServerClazz = Class.forName("io.seata.core.rpc.netty.RpcServer");
        Class longType = long.class;
        Class defaultChannelHandlerContextType = Class.forName("io.netty.channel.ChannelHandlerContext");
        Class registerRMRequestType = Class.forName("java.lang.Object");
        Method dispatchMethod = rpcServerClazz.getDeclaredMethod("dispatch", longType, defaultChannelHandlerContextType, registerRMRequestType);
        dispatchMethod.setAccessible(true);
        java.lang.Object[] dispatchMethodArguments = new java.lang.Object[3];
        dispatchMethodArguments[0] = 0L;
        dispatchMethodArguments[1] = defaultChannelHandlerContext;
        dispatchMethodArguments[2] = registerRMRequest;
        try {
            dispatchMethod.invoke(rpcServer, dispatchMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        Object finalRpcServerCheckAuthHandler = getFieldValue(rpcServer, "checkAuthHandler");
        
        assertFalse(initialRpcServerCheckAuthHandler == finalRpcServerCheckAuthHandler);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testInit1() throws Throwable  {
        RpcServer rpcServer = ((RpcServer) createInstance("io.seata.core.rpc.netty.RpcServer"));
        
        rpcServer.init();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testInit2() throws Throwable  {
        RpcServer rpcServer = ((RpcServer) createInstance("io.seata.core.rpc.netty.RpcServer"));
        
        rpcServer.init();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testSendSyncRequest1() throws Throwable  {
        RpcServer rpcServer = ((RpcServer) createInstance("io.seata.core.rpc.netty.RpcServer"));
        String string = new String();
        String string1 = new String();
        Object object = new Object();
        
        rpcServer.sendSyncRequest(string, string1, object, 0L);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testSendSyncRequest2() throws Throwable  {
        RpcServer rpcServer = ((RpcServer) createInstance("io.seata.core.rpc.netty.RpcServer"));
        
        rpcServer.sendSyncRequest(null, null, null, 0L);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testSendSyncRequest3() throws Throwable  {
        RpcServer rpcServer = ((RpcServer) createInstance("io.seata.core.rpc.netty.RpcServer"));
        String string = new String("");
        
        rpcServer.sendSyncRequest(null, string, null, 0L);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testSendSyncRequest4() throws Throwable  {
        RpcServer rpcServer = ((RpcServer) createInstance("io.seata.core.rpc.netty.RpcServer"));
        String string = new String();
        String string1 = new String();
        Object object = new Object();
        
        rpcServer.sendSyncRequest(string, string1, object);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testSendSyncRequest5() throws Throwable  {
        RpcServer rpcServer = ((RpcServer) createInstance("io.seata.core.rpc.netty.RpcServer"));
        
        rpcServer.sendSyncRequest(null, null, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetHandler1() throws Throwable  {
        RpcServer rpcServer = ((RpcServer) createInstance("io.seata.core.rpc.netty.RpcServer"));
        
        rpcServer.setHandler(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetHandler2() throws Throwable  {
        RpcServer rpcServer = ((RpcServer) createInstance("io.seata.core.rpc.netty.RpcServer"));
        setField(rpcServer, "checkAuthHandler", null);
        setField(rpcServer, "transactionMessageHandler", null);
        
        Object initialRpcServerCheckAuthHandler = getFieldValue(rpcServer, "checkAuthHandler");
        
        rpcServer.setHandler(null);
        
        Object finalRpcServerCheckAuthHandler = getFieldValue(rpcServer, "checkAuthHandler");
        
        assertNull(finalRpcServerCheckAuthHandler);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetHandler3() throws Throwable  {
        RpcServer rpcServer = ((RpcServer) createInstance("io.seata.core.rpc.netty.RpcServer"));
        
        rpcServer.setHandler(null, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetHandler4() throws Throwable  {
        RpcServer rpcServer = ((RpcServer) createInstance("io.seata.core.rpc.netty.RpcServer"));
        setField(rpcServer, "checkAuthHandler", null);
        setField(rpcServer, "transactionMessageHandler", null);
        
        Object initialRpcServerCheckAuthHandler = getFieldValue(rpcServer, "checkAuthHandler");
        
        rpcServer.setHandler(null, null);
        
        Object finalRpcServerCheckAuthHandler = getFieldValue(rpcServer, "checkAuthHandler");
        
        assertNull(finalRpcServerCheckAuthHandler);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetServerMessageListener1() throws Throwable  {
        RpcServer rpcServer = ((RpcServer) createInstance("io.seata.core.rpc.netty.RpcServer"));
        
        rpcServer.setServerMessageListener(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetServerMessageListener2() throws Throwable  {
        RpcServer rpcServer = ((RpcServer) createInstance("io.seata.core.rpc.netty.RpcServer"));
        setField(rpcServer, "serverMessageListener", null);
        
        rpcServer.setServerMessageListener(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetServerMessageListener1() throws Throwable  {
        RpcServer rpcServer = ((RpcServer) createInstance("io.seata.core.rpc.netty.RpcServer"));
        
        ServerMessageListener actual = rpcServer.getServerMessageListener();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetServerMessageListener2() throws Throwable  {
        RpcServer rpcServer = ((RpcServer) createInstance("io.seata.core.rpc.netty.RpcServer"));
        setField(rpcServer, "serverMessageListener", null);
        
        ServerMessageListener actual = rpcServer.getServerMessageListener();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCloseChannelHandlerContext1() throws Throwable  {
        RpcServer rpcServer = ((RpcServer) createInstance("io.seata.core.rpc.netty.RpcServer"));
        
        Class rpcServerClazz = Class.forName("io.seata.core.rpc.netty.RpcServer");
        Class channelHandlerContextType = Class.forName("io.netty.channel.ChannelHandlerContext");
        Method closeChannelHandlerContextMethod = rpcServerClazz.getDeclaredMethod("closeChannelHandlerContext", channelHandlerContextType);
        closeChannelHandlerContextMethod.setAccessible(true);
        java.lang.Object[] closeChannelHandlerContextMethodArguments = new java.lang.Object[1];
        closeChannelHandlerContextMethodArguments[0] = null;
        try {
            closeChannelHandlerContextMethod.invoke(rpcServer, closeChannelHandlerContextMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCloseChannelHandlerContext2() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(org.slf4j.LoggerFactory.class);
            Logger loggerMock = mock(Logger.class);
            when(loggerMock.isInfoEnabled()).thenReturn(false);
            mockedStatic.when(() -> {
                org.slf4j.LoggerFactory.getLogger(any(Class.class));
            }).thenReturn(loggerMock);
            RpcServer rpcServer = ((RpcServer) createInstance("io.seata.core.rpc.netty.RpcServer"));
            
            Class rpcServerClazz = Class.forName("io.seata.core.rpc.netty.RpcServer");
            Class channelHandlerContextType = Class.forName("io.netty.channel.ChannelHandlerContext");
            Method closeChannelHandlerContextMethod = rpcServerClazz.getDeclaredMethod("closeChannelHandlerContext", channelHandlerContextType);
            closeChannelHandlerContextMethod.setAccessible(true);
            java.lang.Object[] closeChannelHandlerContextMethodArguments = new java.lang.Object[1];
            closeChannelHandlerContextMethodArguments[0] = null;
            try {
                closeChannelHandlerContextMethod.invoke(rpcServer, closeChannelHandlerContextMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }} finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCloseChannelHandlerContext3() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(org.slf4j.LoggerFactory.class);
            Logger loggerMock = mock(Logger.class);
            when(loggerMock.isInfoEnabled()).thenReturn(true);
            mockedStatic.when(() -> {
                org.slf4j.LoggerFactory.getLogger(any(Class.class));
            }).thenReturn(loggerMock);
            RpcServer rpcServer = ((RpcServer) createInstance("io.seata.core.rpc.netty.RpcServer"));
            
            Class rpcServerClazz = Class.forName("io.seata.core.rpc.netty.RpcServer");
            Class channelHandlerContextType = Class.forName("io.netty.channel.ChannelHandlerContext");
            Method closeChannelHandlerContextMethod = rpcServerClazz.getDeclaredMethod("closeChannelHandlerContext", channelHandlerContextType);
            closeChannelHandlerContextMethod.setAccessible(true);
            java.lang.Object[] closeChannelHandlerContextMethodArguments = new java.lang.Object[1];
            closeChannelHandlerContextMethodArguments[0] = null;
            try {
                closeChannelHandlerContextMethod.invoke(rpcServer, closeChannelHandlerContextMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }} finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCloseChannelHandlerContext4() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(org.slf4j.LoggerFactory.class);
            Logger loggerMock = mock(Logger.class);
            when(loggerMock.isInfoEnabled()).thenReturn(false);
            mockedStatic.when(() -> {
                org.slf4j.LoggerFactory.getLogger(any(Class.class));
            }).thenReturn(loggerMock);
            RpcServer rpcServer = ((RpcServer) createInstance("io.seata.core.rpc.netty.RpcServer"));
            Object headContext = createInstance("io.netty.channel.DefaultChannelPipeline$HeadContext");
            Object epollEventLoop = createInstance("io.netty.channel.epoll.EpollEventLoop");
            setField(headContext, "executor", epollEventLoop);
            DefaultChannelPipeline defaultChannelPipeline = ((DefaultChannelPipeline) createInstance("io.netty.channel.DefaultChannelPipeline"));
            Object failedChannel = createInstance("io.netty.bootstrap.FailedChannel");
            setField(defaultChannelPipeline, "channel", failedChannel);
            setField(headContext, "pipeline", defaultChannelPipeline);
            setField(headContext, "prev", null);
            
            Class rpcServerClazz = Class.forName("io.seata.core.rpc.netty.RpcServer");
            Class headContextType = Class.forName("io.netty.channel.ChannelHandlerContext");
            Method closeChannelHandlerContextMethod = rpcServerClazz.getDeclaredMethod("closeChannelHandlerContext", headContextType);
            closeChannelHandlerContextMethod.setAccessible(true);
            java.lang.Object[] closeChannelHandlerContextMethodArguments = new java.lang.Object[1];
            closeChannelHandlerContextMethodArguments[0] = headContext;
            try {
                closeChannelHandlerContextMethod.invoke(rpcServer, closeChannelHandlerContextMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }} finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDebugLog1() throws Throwable  {
        RpcServer rpcServer = ((RpcServer) createInstance("io.seata.core.rpc.netty.RpcServer"));
        String string = new String();
        
        rpcServer.debugLog(string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDebugLog2() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(org.slf4j.LoggerFactory.class);
            Logger loggerMock = mock(Logger.class);
            when(loggerMock.isDebugEnabled()).thenReturn(false);
            mockedStatic.when(() -> {
                org.slf4j.LoggerFactory.getLogger(any(Class.class));
            }).thenReturn(loggerMock);
            RpcServer rpcServer = ((RpcServer) createInstance("io.seata.core.rpc.netty.RpcServer"));
            
            rpcServer.debugLog(null);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDebugLog3() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(org.slf4j.LoggerFactory.class);
            Logger loggerMock = mock(Logger.class);
            when(loggerMock.isDebugEnabled()).thenReturn(true);
            mockedStatic.when(() -> {
                org.slf4j.LoggerFactory.getLogger(any(Class.class));
            }).thenReturn(loggerMock);
            RpcServer rpcServer = ((RpcServer) createInstance("io.seata.core.rpc.netty.RpcServer"));
            
            rpcServer.debugLog(null);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testHandleDisconnect1() throws Throwable  {
        RpcServer rpcServer = ((RpcServer) createInstance("io.seata.core.rpc.netty.RpcServer"));
        
        Class rpcServerClazz = Class.forName("io.seata.core.rpc.netty.RpcServer");
        Class channelHandlerContextType = Class.forName("io.netty.channel.ChannelHandlerContext");
        Method handleDisconnectMethod = rpcServerClazz.getDeclaredMethod("handleDisconnect", channelHandlerContextType);
        handleDisconnectMethod.setAccessible(true);
        java.lang.Object[] handleDisconnectMethodArguments = new java.lang.Object[1];
        handleDisconnectMethodArguments[0] = null;
        try {
            handleDisconnectMethod.invoke(rpcServer, handleDisconnectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testHandleDisconnect2() throws Throwable  {
        RpcServer rpcServer = ((RpcServer) createInstance("io.seata.core.rpc.netty.RpcServer"));
        
        Class rpcServerClazz = Class.forName("io.seata.core.rpc.netty.RpcServer");
        Class channelHandlerContextType = Class.forName("io.netty.channel.ChannelHandlerContext");
        Method handleDisconnectMethod = rpcServerClazz.getDeclaredMethod("handleDisconnect", channelHandlerContextType);
        handleDisconnectMethod.setAccessible(true);
        java.lang.Object[] handleDisconnectMethodArguments = new java.lang.Object[1];
        handleDisconnectMethodArguments[0] = null;
        try {
            handleDisconnectMethod.invoke(rpcServer, handleDisconnectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testHandleDisconnect3() throws Throwable  {
        RpcServer rpcServer = ((RpcServer) createInstance("io.seata.core.rpc.netty.RpcServer"));
        Object defaultChannelHandlerContext = createInstance("io.netty.channel.DefaultChannelHandlerContext");
        DefaultChannelPipeline defaultChannelPipeline = ((DefaultChannelPipeline) createInstance("io.netty.channel.DefaultChannelPipeline"));
        Object failedChannel = createInstance("io.netty.bootstrap.FailedChannel");
        DomainSocketAddress domainSocketAddress = ((DomainSocketAddress) createInstance("io.netty.channel.unix.DomainSocketAddress"));
        setField(failedChannel, "remoteAddress", domainSocketAddress);
        setField(defaultChannelPipeline, "channel", failedChannel);
        setField(defaultChannelHandlerContext, "pipeline", defaultChannelPipeline);
        
        Class rpcServerClazz = Class.forName("io.seata.core.rpc.netty.RpcServer");
        Class defaultChannelHandlerContextType = Class.forName("io.netty.channel.ChannelHandlerContext");
        Method handleDisconnectMethod = rpcServerClazz.getDeclaredMethod("handleDisconnect", defaultChannelHandlerContextType);
        handleDisconnectMethod.setAccessible(true);
        java.lang.Object[] handleDisconnectMethodArguments = new java.lang.Object[1];
        handleDisconnectMethodArguments[0] = defaultChannelHandlerContext;
        try {
            handleDisconnectMethod.invoke(rpcServer, handleDisconnectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testHandleDisconnect4() throws Throwable  {
        RpcServer rpcServer = ((RpcServer) createInstance("io.seata.core.rpc.netty.RpcServer"));
        Object tailContext = createInstance("io.netty.channel.DefaultChannelPipeline$TailContext");
        DefaultChannelPipeline defaultChannelPipeline = ((DefaultChannelPipeline) createInstance("io.netty.channel.DefaultChannelPipeline"));
        Object failedChannel = createInstance("io.netty.bootstrap.FailedChannel");
        DatagramSocketAddress datagramSocketAddress = ((DatagramSocketAddress) createInstance("io.netty.channel.unix.DatagramSocketAddress"));
        Object inetSocketAddressHolder = createInstance("java.net.InetSocketAddress$InetSocketAddressHolder");
        Inet6Address inet6Address = ((Inet6Address) createInstance("java.net.Inet6Address"));
        Object inet6AddressHolder = createInstance("java.net.Inet6Address$Inet6AddressHolder");
        byte[] byteArray = new byte[0];
        setField(inet6AddressHolder, "ipaddress", byteArray);
        setField(inet6Address, "holder6", inet6AddressHolder);
        setField(inetSocketAddressHolder, "addr", inet6Address);
        setField(datagramSocketAddress, "holder", inetSocketAddressHolder);
        setField(failedChannel, "remoteAddress", datagramSocketAddress);
        setField(defaultChannelPipeline, "channel", failedChannel);
        setField(tailContext, "pipeline", defaultChannelPipeline);
        
        Class rpcServerClazz = Class.forName("io.seata.core.rpc.netty.RpcServer");
        Class tailContextType = Class.forName("io.netty.channel.ChannelHandlerContext");
        Method handleDisconnectMethod = rpcServerClazz.getDeclaredMethod("handleDisconnect", tailContextType);
        handleDisconnectMethod.setAccessible(true);
        java.lang.Object[] handleDisconnectMethodArguments = new java.lang.Object[1];
        handleDisconnectMethodArguments[0] = tailContext;
        try {
            handleDisconnectMethod.invoke(rpcServer, handleDisconnectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testHandleDisconnect5() throws Throwable  {
        RpcServer rpcServer = ((RpcServer) createInstance("io.seata.core.rpc.netty.RpcServer"));
        Object headContext = createInstance("io.netty.channel.DefaultChannelPipeline$HeadContext");
        DefaultChannelPipeline defaultChannelPipeline = ((DefaultChannelPipeline) createInstance("io.netty.channel.DefaultChannelPipeline"));
        Object failedChannel = createInstance("io.netty.bootstrap.FailedChannel");
        DatagramSocketAddress datagramSocketAddress = ((DatagramSocketAddress) createInstance("io.netty.channel.unix.DatagramSocketAddress"));
        Object inetSocketAddressHolder = createInstance("java.net.InetSocketAddress$InetSocketAddressHolder");
        setField(inetSocketAddressHolder, "port", 1);
        InetAddress inetAddress = ((InetAddress) createInstance("java.net.InetAddress"));
        setField(inetSocketAddressHolder, "addr", inetAddress);
        setField(datagramSocketAddress, "holder", inetSocketAddressHolder);
        setField(failedChannel, "remoteAddress", datagramSocketAddress);
        setField(defaultChannelPipeline, "channel", failedChannel);
        setField(headContext, "pipeline", defaultChannelPipeline);
        
        Class rpcServerClazz = Class.forName("io.seata.core.rpc.netty.RpcServer");
        Class headContextType = Class.forName("io.netty.channel.ChannelHandlerContext");
        Method handleDisconnectMethod = rpcServerClazz.getDeclaredMethod("handleDisconnect", headContextType);
        handleDisconnectMethod.setAccessible(true);
        java.lang.Object[] handleDisconnectMethodArguments = new java.lang.Object[1];
        handleDisconnectMethodArguments[0] = headContext;
        try {
            handleDisconnectMethod.invoke(rpcServer, handleDisconnectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testRpcServer1() throws Throwable  {
        ThreadPoolExecutor threadPoolExecutor = ((ThreadPoolExecutor) createInstance("java.util.concurrent.ThreadPoolExecutor"));
        new RpcServer(threadPoolExecutor);
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
