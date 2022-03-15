package io.seata.core.rpc.netty;

import org.junit.Test;
import io.netty.channel.ChannelHandlerContext;
import org.slf4j.Logger;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicInteger;
import io.seata.core.rpc.RpcContext;
import io.seata.core.rpc.netty.NettyPoolKey.TransactionRole;
import io.seata.core.rpc.netty.NettyPoolKey;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import io.netty.channel.Channel;
import io.netty.channel.unix.DatagramSocketAddress;
import io.netty.channel.unix.DomainSocketAddress;
import io.seata.core.protocol.RpcMessage;
import java.util.concurrent.locks.ReentrantLock;
import io.netty.util.concurrent.GlobalEventExecutor;
import io.seata.core.protocol.HeartbeatMessage;
import java.time.temporal.TemporalAdjusters;
import io.netty.channel.ChannelFuture;
import java.time.temporal.IsoFields;
import io.seata.core.rpc.ServerMessageListener;
import io.seata.core.protocol.RegisterRMRequest;
import java.text.Annotation;
import java.time.chrono.JapaneseChronology;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Array;
import sun.misc.Unsafe;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.ArgumentMatchers.anyString;
import static org.junit.Assert.assertNull;

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
            CloneNotSupportedException cloneNotSupportedException = ((CloneNotSupportedException) createInstance("java.lang.CloneNotSupportedException"));
            
            rpcServer.exceptionCaught(((ChannelHandlerContext) null), cloneNotSupportedException);
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
            ChannelHandlerContext channelHandlerContextMock = mock(ChannelHandlerContext.class);
            
            rpcServer.exceptionCaught(channelHandlerContextMock, ((Throwable) null));
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
        ChannelHandlerContext channelHandlerContextMock = mock(ChannelHandlerContext.class);
        
        rpcServer.userEventTriggered(channelHandlerContextMock, null);
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
    
    @Test(timeout = 10000)
    public void testChannelInactive2() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(org.slf4j.LoggerFactory.class);
            Logger loggerMock = mock(Logger.class);
            when(loggerMock.isDebugEnabled()).thenReturn(true);
            mockedStatic.when(() -> {
                org.slf4j.LoggerFactory.getLogger(any(Class.class));
            }).thenReturn(loggerMock);
            RpcServer rpcServer = ((RpcServer) createInstance("io.seata.core.rpc.netty.RpcServer"));
            ThreadPoolExecutor threadPoolExecutor = ((ThreadPoolExecutor) createInstance("java.util.concurrent.ThreadPoolExecutor"));
            AtomicInteger atomicInteger = ((AtomicInteger) createInstance("java.util.concurrent.atomic.AtomicInteger"));
            setField(atomicInteger, "value", 0);
            setField(threadPoolExecutor, "ctl", atomicInteger);
            setField(rpcServer, "messageExecutor", threadPoolExecutor);
            ChannelHandlerContext channelHandlerContextMock = mock(ChannelHandlerContext.class);
            when(channelHandlerContextMock.toString()).thenReturn(((String) null));
            
            rpcServer.channelInactive(channelHandlerContextMock);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testChannelInactive3() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(org.slf4j.LoggerFactory.class);
            Logger loggerMock = mock(Logger.class);
            when(loggerMock.isDebugEnabled()).thenReturn(false);
            mockedStatic.when(() -> {
                org.slf4j.LoggerFactory.getLogger(any(Class.class));
            }).thenReturn(loggerMock);
            RpcServer rpcServer = ((RpcServer) createInstance("io.seata.core.rpc.netty.RpcServer"));
            ThreadPoolExecutor threadPoolExecutor = ((ThreadPoolExecutor) createInstance("java.util.concurrent.ThreadPoolExecutor"));
            AtomicInteger atomicInteger = ((AtomicInteger) createInstance("java.util.concurrent.atomic.AtomicInteger"));
            setField(atomicInteger, "value", 0);
            setField(threadPoolExecutor, "ctl", atomicInteger);
            setField(rpcServer, "messageExecutor", threadPoolExecutor);
            ChannelHandlerContext channelHandlerContextMock = mock(ChannelHandlerContext.class);
            when(channelHandlerContextMock.toString()).thenReturn(((String) null));
            
            rpcServer.channelInactive(channelHandlerContextMock);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testChannelInactive4() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(org.slf4j.LoggerFactory.class);
            Logger loggerMock = mock(Logger.class);
            when(loggerMock.isDebugEnabled()).thenReturn(true);
            mockedStatic.when(() -> {
                org.slf4j.LoggerFactory.getLogger(any(Class.class));
            }).thenReturn(loggerMock);
            RpcServer rpcServer = ((RpcServer) createInstance("io.seata.core.rpc.netty.RpcServer"));
            ThreadPoolExecutor threadPoolExecutor = ((ThreadPoolExecutor) createInstance("java.util.concurrent.ThreadPoolExecutor"));
            AtomicInteger atomicInteger = ((AtomicInteger) createInstance("java.util.concurrent.atomic.AtomicInteger"));
            setField(atomicInteger, "value", Integer.MIN_VALUE);
            setField(threadPoolExecutor, "ctl", atomicInteger);
            setField(rpcServer, "messageExecutor", threadPoolExecutor);
            ChannelHandlerContext channelHandlerContextMock = mock(ChannelHandlerContext.class);
            when(channelHandlerContextMock.toString()).thenReturn(((String) null));
            when(channelHandlerContextMock.channel()).thenReturn(((Channel) null));
            
            rpcServer.channelInactive(channelHandlerContextMock);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testChannelInactive5() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        org.mockito.MockedStatic mockedStatic1 = null;
        org.mockito.MockedStatic mockedStatic2 = null;
        try {
            mockedStatic = mockStatic(org.slf4j.LoggerFactory.class);
            Logger loggerMock = mock(Logger.class);
            when(loggerMock.isDebugEnabled()).thenReturn(true);
            when(loggerMock.isInfoEnabled()).thenReturn(false, false);
            mockedStatic.when(() -> {
                org.slf4j.LoggerFactory.getLogger(any(Class.class));
            }).thenReturn(loggerMock);
            mockedStatic1 = mockStatic(io.seata.common.util.NetUtil.class);
            mockedStatic1.when(() -> {
                io.seata.common.util.NetUtil.toStringAddress(any(java.net.SocketAddress.class));
            }).thenReturn(((String) null));
            mockedStatic2 = mockStatic(io.seata.core.rpc.ChannelManager.class);
            RpcContext rpcContextMock = mock(RpcContext.class);
            NettyPoolKey.TransactionRole transactionRole = NettyPoolKey.TransactionRole.TMROLE;
            when(rpcContextMock.getClientRole()).thenReturn(transactionRole);
            mockedStatic2.when(() -> {
                io.seata.core.rpc.ChannelManager.getContextFromIdentified(org.mockito.ArgumentMatchers.any());
            }).thenReturn(rpcContextMock);
            RpcServer rpcServer = ((RpcServer) createInstance("io.seata.core.rpc.netty.RpcServer"));
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = ((ScheduledThreadPoolExecutor) createInstance("java.util.concurrent.ScheduledThreadPoolExecutor"));
            Object link = createInstance("io.netty.util.Recycler$WeakOrderQueue$Link");
            setField(link, "value", Integer.MIN_VALUE);
            setField(scheduledThreadPoolExecutor, "ctl", link);
            setField(rpcServer, "messageExecutor", scheduledThreadPoolExecutor);
            ChannelHandlerContext channelHandlerContextMock = mock(ChannelHandlerContext.class);
            when(channelHandlerContextMock.toString()).thenReturn(((String) null));
            Channel channelMock = mock(Channel.class);
            DatagramSocketAddress datagramSocketAddress = ((DatagramSocketAddress) createInstance("io.netty.channel.unix.DatagramSocketAddress"));
            when(channelMock.remoteAddress()).thenReturn(((java.net.SocketAddress) datagramSocketAddress));
            when(channelHandlerContextMock.channel()).thenReturn(channelMock, ((Channel) null));
            when(channelHandlerContextMock.fireChannelInactive()).thenReturn(((ChannelHandlerContext) null));
            
            rpcServer.channelInactive(channelHandlerContextMock);
        } finally {
            mockedStatic.close();
            mockedStatic1.close();
            mockedStatic2.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testChannelInactive6() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        org.mockito.MockedStatic mockedStatic1 = null;
        org.mockito.MockedStatic mockedStatic2 = null;
        try {
            mockedStatic = mockStatic(org.slf4j.LoggerFactory.class);
            Logger loggerMock = mock(Logger.class);
            when(loggerMock.isDebugEnabled()).thenReturn(true);
            when(loggerMock.isInfoEnabled()).thenReturn(false, false);
            mockedStatic.when(() -> {
                org.slf4j.LoggerFactory.getLogger(any(Class.class));
            }).thenReturn(loggerMock);
            mockedStatic1 = mockStatic(io.seata.common.util.NetUtil.class);
            mockedStatic1.when(() -> {
                io.seata.common.util.NetUtil.toStringAddress(any(java.net.SocketAddress.class));
            }).thenReturn(((String) null));
            mockedStatic2 = mockStatic(io.seata.core.rpc.ChannelManager.class);
            RpcContext rpcContextMock = mock(RpcContext.class);
            when(rpcContextMock.getClientRole()).thenReturn(((NettyPoolKey.TransactionRole) null));
            mockedStatic2.when(() -> {
                io.seata.core.rpc.ChannelManager.getContextFromIdentified(org.mockito.ArgumentMatchers.any());
            }).thenReturn(rpcContextMock);
            RpcServer rpcServer = ((RpcServer) createInstance("io.seata.core.rpc.netty.RpcServer"));
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = ((ScheduledThreadPoolExecutor) createInstance("java.util.concurrent.ScheduledThreadPoolExecutor"));
            Object link = createInstance("io.netty.util.Recycler$WeakOrderQueue$Link");
            setField(link, "value", Integer.MIN_VALUE);
            setField(scheduledThreadPoolExecutor, "ctl", link);
            setField(rpcServer, "messageExecutor", scheduledThreadPoolExecutor);
            ChannelHandlerContext channelHandlerContextMock = mock(ChannelHandlerContext.class);
            when(channelHandlerContextMock.toString()).thenReturn(((String) null));
            Channel channelMock = mock(Channel.class);
            DomainSocketAddress domainSocketAddress = ((DomainSocketAddress) createInstance("io.netty.channel.unix.DomainSocketAddress"));
            when(channelMock.remoteAddress()).thenReturn(((java.net.SocketAddress) domainSocketAddress));
            when(channelHandlerContextMock.channel()).thenReturn(channelMock, ((Channel) null));
            when(channelHandlerContextMock.fireChannelInactive()).thenReturn(((ChannelHandlerContext) null));
            
            rpcServer.channelInactive(channelHandlerContextMock);
        } finally {
            mockedStatic.close();
            mockedStatic1.close();
            mockedStatic2.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testChannelInactive7() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        org.mockito.MockedStatic mockedStatic1 = null;
        org.mockito.MockedStatic mockedStatic2 = null;
        try {
            mockedStatic = mockStatic(org.slf4j.LoggerFactory.class);
            Logger loggerMock = mock(Logger.class);
            when(loggerMock.isDebugEnabled()).thenReturn(false);
            when(loggerMock.isInfoEnabled()).thenReturn(false, false);
            mockedStatic.when(() -> {
                org.slf4j.LoggerFactory.getLogger(any(Class.class));
            }).thenReturn(loggerMock);
            mockedStatic1 = mockStatic(io.seata.common.util.NetUtil.class);
            mockedStatic1.when(() -> {
                io.seata.common.util.NetUtil.toStringAddress(any(java.net.SocketAddress.class));
            }).thenReturn(((String) null));
            mockedStatic2 = mockStatic(io.seata.core.rpc.ChannelManager.class);
            mockedStatic2.when(() -> {
                io.seata.core.rpc.ChannelManager.getContextFromIdentified(org.mockito.ArgumentMatchers.any());
            }).thenReturn(((RpcContext) null));
            RpcServer rpcServer = ((RpcServer) createInstance("io.seata.core.rpc.netty.RpcServer"));
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = ((ScheduledThreadPoolExecutor) createInstance("java.util.concurrent.ScheduledThreadPoolExecutor"));
            Object link = createInstance("io.netty.util.Recycler$WeakOrderQueue$Link");
            setField(link, "value", Integer.MIN_VALUE);
            setField(scheduledThreadPoolExecutor, "ctl", link);
            setField(rpcServer, "messageExecutor", scheduledThreadPoolExecutor);
            ChannelHandlerContext channelHandlerContextMock = mock(ChannelHandlerContext.class);
            when(channelHandlerContextMock.toString()).thenReturn(((String) null));
            Channel channelMock = mock(Channel.class);
            DatagramSocketAddress datagramSocketAddress = ((DatagramSocketAddress) createInstance("io.netty.channel.unix.DatagramSocketAddress"));
            when(channelMock.remoteAddress()).thenReturn(((java.net.SocketAddress) datagramSocketAddress));
            when(channelHandlerContextMock.channel()).thenReturn(channelMock, ((Channel) null));
            when(channelHandlerContextMock.fireChannelInactive()).thenReturn(((ChannelHandlerContext) null));
            
            rpcServer.channelInactive(channelHandlerContextMock);
        } finally {
            mockedStatic.close();
            mockedStatic1.close();
            mockedStatic2.close();
        }
    }
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
        ChannelHandlerContext channelHandlerContextMock = mock(ChannelHandlerContext.class);
        
        rpcServer.channelRead(channelHandlerContextMock, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testChannelRead3() throws Throwable  {
        RpcServer rpcServer = ((RpcServer) createInstance("io.seata.core.rpc.netty.RpcServer"));
        ChannelHandlerContext channelHandlerContextMock = mock(ChannelHandlerContext.class);
        RpcMessage rpcMessage = ((RpcMessage) createInstance("io.seata.core.protocol.RpcMessage"));
        setField(rpcMessage, "body", null);
        
        rpcServer.channelRead(channelHandlerContextMock, rpcMessage);
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
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(io.seata.core.rpc.ChannelManager.class);
            mockedStatic.when(() -> {
                io.seata.core.rpc.ChannelManager.getSameClientChannel(org.mockito.ArgumentMatchers.any());
            }).thenReturn(((Channel) null));
            RpcServer rpcServer = ((RpcServer) createInstance("io.seata.core.rpc.netty.RpcServer"));
            Channel channelMock = mock(Channel.class);
            java.lang.Object[] ruleBasedBreakIteratorArray = createArray("sun.util.locale.provider.RuleBasedBreakIterator", 0);
            
            rpcServer.sendResponse(0L, channelMock, ruleBasedBreakIteratorArray);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testSendResponse3() throws Throwable  {
        RpcServer rpcServer = ((RpcServer) createInstance("io.seata.core.rpc.netty.RpcServer"));
        HeartbeatMessage heartbeatMessage = ((HeartbeatMessage) createInstance("io.seata.core.protocol.HeartbeatMessage"));
        
        rpcServer.sendResponse(0L, ((Channel) null), heartbeatMessage);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSendResponse4() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(org.slf4j.LoggerFactory.class);
            Logger loggerMock = mock(Logger.class);
            when(loggerMock.isDebugEnabled()).thenReturn(false);
            mockedStatic.when(() -> {
                org.slf4j.LoggerFactory.getLogger(any(Class.class));
            }).thenReturn(loggerMock);
            RpcServer rpcServer = ((RpcServer) createInstance("io.seata.core.rpc.netty.RpcServer"));
            java.time.temporal.TemporalAdjusters[] temporalAdjustersArray = new java.time.temporal.TemporalAdjusters[0];
            setField(rpcServer, "lock", temporalAdjustersArray);
            Channel channelMock = mock(Channel.class);
            when(channelMock.isWritable()).thenReturn(true);
            ChannelFuture channelFutureMock = mock(ChannelFuture.class);
            when(channelMock.writeAndFlush(org.mockito.ArgumentMatchers.any())).thenReturn(channelFutureMock);
            HeartbeatMessage heartbeatMessage = ((HeartbeatMessage) createInstance("io.seata.core.protocol.HeartbeatMessage"));
            
            rpcServer.sendResponse(0L, channelMock, heartbeatMessage);
        } finally {
            mockedStatic.close();
        }
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
        java.time.temporal.IsoFields[] isoFieldsArray = new java.time.temporal.IsoFields[0];
        
        rpcServer.dispatch(0L, ((ChannelHandlerContext) null), isoFieldsArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDispatch3() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(io.seata.core.rpc.ChannelManager.class);
            mockedStatic.when(() -> {
                io.seata.core.rpc.ChannelManager.isRegistered(org.mockito.ArgumentMatchers.any());
            }).thenReturn(true);
            RpcServer rpcServer = ((RpcServer) createInstance("io.seata.core.rpc.netty.RpcServer"));
            setField(rpcServer, "serverMessageListener", null);
            ChannelHandlerContext channelHandlerContextMock = mock(ChannelHandlerContext.class);
            when(channelHandlerContextMock.channel()).thenReturn(((Channel) null));
            java.lang.Object[] dictionaryBasedBreakIteratorArray = createArray("sun.util.locale.provider.DictionaryBasedBreakIterator", 0);
            
            rpcServer.dispatch(0L, channelHandlerContextMock, dictionaryBasedBreakIteratorArray);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDispatch4() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(io.seata.core.rpc.ChannelManager.class);
            mockedStatic.when(() -> {
                io.seata.core.rpc.ChannelManager.isRegistered(org.mockito.ArgumentMatchers.any());
            }).thenReturn(true);
            RpcServer rpcServer = ((RpcServer) createInstance("io.seata.core.rpc.netty.RpcServer"));
            ServerMessageListener serverMessageListenerMock = mock(ServerMessageListener.class);
            rpcServer.serverMessageListener = serverMessageListenerMock;
            ChannelHandlerContext channelHandlerContextMock = mock(ChannelHandlerContext.class);
            when(channelHandlerContextMock.channel()).thenReturn(((Channel) null));
            java.lang.Object[] dictionaryBasedBreakIteratorArray = createArray("sun.util.locale.provider.DictionaryBasedBreakIterator", 0);
            
            rpcServer.dispatch(0L, channelHandlerContextMock, dictionaryBasedBreakIteratorArray);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDispatch5() throws Throwable  {
        RpcServer rpcServer = ((RpcServer) createInstance("io.seata.core.rpc.netty.RpcServer"));
        setField(rpcServer, "checkAuthHandler", null);
        setField(rpcServer, "serverMessageListener", null);
        RegisterRMRequest registerRMRequest = ((RegisterRMRequest) createInstance("io.seata.core.protocol.RegisterRMRequest"));
        
        rpcServer.dispatch(0L, ((ChannelHandlerContext) null), registerRMRequest);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDispatch6() throws Throwable  {
        RpcServer rpcServer = ((RpcServer) createInstance("io.seata.core.rpc.netty.RpcServer"));
        setField(rpcServer, "checkAuthHandler", null);
        ServerMessageListener serverMessageListenerMock = mock(ServerMessageListener.class);
        rpcServer.serverMessageListener = serverMessageListenerMock;
        RegisterRMRequest registerRMRequest = ((RegisterRMRequest) createInstance("io.seata.core.protocol.RegisterRMRequest"));
        
        rpcServer.dispatch(0L, ((ChannelHandlerContext) null), registerRMRequest);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDispatch7() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        org.mockito.MockedStatic mockedStatic1 = null;
        try {
            mockedStatic = mockStatic(io.seata.core.rpc.ChannelManager.class);
            mockedStatic.when(() -> {
                io.seata.core.rpc.ChannelManager.isRegistered(org.mockito.ArgumentMatchers.any());
            }).thenReturn(false);
            mockedStatic1 = mockStatic(org.slf4j.LoggerFactory.class);
            Logger loggerMock = mock(Logger.class);
            when(loggerMock.isInfoEnabled()).thenReturn(false, false);
            mockedStatic1.when(() -> {
                org.slf4j.LoggerFactory.getLogger(any(Class.class));
            }).thenReturn(loggerMock);
            RpcServer rpcServer = ((RpcServer) createInstance("io.seata.core.rpc.netty.RpcServer"));
            ChannelHandlerContext channelHandlerContextMock = mock(ChannelHandlerContext.class);
            when(channelHandlerContextMock.channel()).thenReturn(((Channel) null));
            when(channelHandlerContextMock.disconnect()).thenReturn(((ChannelFuture) null));
            when(channelHandlerContextMock.close()).thenReturn(((ChannelFuture) null));
            java.text.Annotation[] annotationArray = new java.text.Annotation[0];
            
            rpcServer.dispatch(0L, channelHandlerContextMock, annotationArray);
        } finally {
            mockedStatic.close();
            mockedStatic1.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDispatch8() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        org.mockito.MockedStatic mockedStatic1 = null;
        try {
            mockedStatic = mockStatic(io.seata.core.rpc.ChannelManager.class);
            mockedStatic.when(() -> {
                io.seata.core.rpc.ChannelManager.isRegistered(org.mockito.ArgumentMatchers.any());
            }).thenReturn(false);
            mockedStatic1 = mockStatic(org.slf4j.LoggerFactory.class);
            Logger loggerMock = mock(Logger.class);
            when(loggerMock.isInfoEnabled()).thenReturn(false, true);
            mockedStatic1.when(() -> {
                org.slf4j.LoggerFactory.getLogger(any(Class.class));
            }).thenReturn(loggerMock);
            RpcServer rpcServer = ((RpcServer) createInstance("io.seata.core.rpc.netty.RpcServer"));
            ChannelHandlerContext channelHandlerContextMock = mock(ChannelHandlerContext.class);
            when(channelHandlerContextMock.channel()).thenReturn(((Channel) null), ((Channel) null));
            when(channelHandlerContextMock.disconnect()).thenReturn(((ChannelFuture) null));
            when(channelHandlerContextMock.close()).thenReturn(((ChannelFuture) null));
            java.text.Annotation[] annotationArray = new java.text.Annotation[0];
            
            rpcServer.dispatch(0L, channelHandlerContextMock, annotationArray);
        } finally {
            mockedStatic.close();
            mockedStatic1.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDispatch9() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        org.mockito.MockedStatic mockedStatic1 = null;
        try {
            mockedStatic = mockStatic(io.seata.core.rpc.ChannelManager.class);
            mockedStatic.when(() -> {
                io.seata.core.rpc.ChannelManager.isRegistered(org.mockito.ArgumentMatchers.any());
            }).thenReturn(false);
            mockedStatic1 = mockStatic(org.slf4j.LoggerFactory.class);
            Logger loggerMock = mock(Logger.class);
            when(loggerMock.isInfoEnabled()).thenReturn(true, false);
            mockedStatic1.when(() -> {
                org.slf4j.LoggerFactory.getLogger(any(Class.class));
            }).thenReturn(loggerMock);
            RpcServer rpcServer = ((RpcServer) createInstance("io.seata.core.rpc.netty.RpcServer"));
            ChannelHandlerContext channelHandlerContextMock = mock(ChannelHandlerContext.class);
            Channel channelMock = mock(Channel.class);
            when(channelMock.toString()).thenReturn(((String) null));
            when(channelHandlerContextMock.channel()).thenReturn(((Channel) null), channelMock);
            when(channelHandlerContextMock.disconnect()).thenReturn(((ChannelFuture) null));
            when(channelHandlerContextMock.close()).thenReturn(((ChannelFuture) null));
            java.time.chrono.JapaneseChronology[] japaneseChronologyArray = new java.time.chrono.JapaneseChronology[0];
            
            rpcServer.dispatch(0L, channelHandlerContextMock, japaneseChronologyArray);
        } finally {
            mockedStatic.close();
            mockedStatic1.close();
        }
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
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(io.seata.core.rpc.ChannelManager.class);
            mockedStatic.when(() -> {
                io.seata.core.rpc.ChannelManager.getChannel(anyString(), anyString());
            }).thenReturn(((Channel) null));
            RpcServer rpcServer = ((RpcServer) createInstance("io.seata.core.rpc.netty.RpcServer"));
            String string = new String("");
            java.lang.Object[] ruleBasedBreakIteratorArray = createArray("sun.util.locale.provider.RuleBasedBreakIterator", 0);
            
            rpcServer.sendSyncRequest(null, string, ruleBasedBreakIteratorArray, 0L);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testSendSyncRequest3() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(io.seata.core.rpc.ChannelManager.class);
            Channel channelMock = mock(Channel.class);
            mockedStatic.when(() -> {
                io.seata.core.rpc.ChannelManager.getChannel(anyString(), anyString());
            }).thenReturn(channelMock);
            RpcServer rpcServer = ((RpcServer) createInstance("io.seata.core.rpc.netty.RpcServer"));
            
            rpcServer.sendSyncRequest(null, null, null, -9223372036854775807L);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testSendSyncRequest4() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        org.mockito.MockedStatic mockedStatic1 = null;
        try {
            mockedStatic = mockStatic(NettyServerConfig.class);
            mockedStatic.when(NettyServerConfig::getRpcRequestTimeout).thenReturn(0);
            mockedStatic1 = mockStatic(io.seata.core.rpc.ChannelManager.class);
            mockedStatic1.when(() -> {
                io.seata.core.rpc.ChannelManager.getChannel(anyString(), anyString());
            }).thenReturn(((Channel) null));
            RpcServer rpcServer = ((RpcServer) createInstance("io.seata.core.rpc.netty.RpcServer"));
            java.text.Annotation[] annotationArray = new java.text.Annotation[0];
            
            rpcServer.sendSyncRequest(null, null, annotationArray);
        } finally {
            mockedStatic.close();
            mockedStatic1.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testSendSyncRequest5() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        org.mockito.MockedStatic mockedStatic1 = null;
        try {
            mockedStatic = mockStatic(NettyServerConfig.class);
            mockedStatic.when(NettyServerConfig::getRpcRequestTimeout).thenReturn(Integer.MIN_VALUE);
            mockedStatic1 = mockStatic(io.seata.core.rpc.ChannelManager.class);
            Channel channelMock = mock(Channel.class);
            mockedStatic1.when(() -> {
                io.seata.core.rpc.ChannelManager.getChannel(anyString(), anyString());
            }).thenReturn(channelMock);
            RpcServer rpcServer = ((RpcServer) createInstance("io.seata.core.rpc.netty.RpcServer"));
            String string = new String("");
            
            rpcServer.sendSyncRequest(string, null, null);
        } finally {
            mockedStatic.close();
            mockedStatic1.close();
        }
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
        
        rpcServer.setHandler(null);
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
        
        rpcServer.setHandler(null, null);
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
    
    @Test(timeout = 10000)
    public void testCloseChannelHandlerContext3() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(org.slf4j.LoggerFactory.class);
            Logger loggerMock = mock(Logger.class);
            when(loggerMock.isInfoEnabled()).thenReturn(false);
            mockedStatic.when(() -> {
                org.slf4j.LoggerFactory.getLogger(any(Class.class));
            }).thenReturn(loggerMock);
            RpcServer rpcServer = ((RpcServer) createInstance("io.seata.core.rpc.netty.RpcServer"));
            ChannelHandlerContext channelHandlerContextMock = mock(ChannelHandlerContext.class);
            when(channelHandlerContextMock.disconnect()).thenReturn(((ChannelFuture) null));
            when(channelHandlerContextMock.close()).thenReturn(((ChannelFuture) null));
            
            Class rpcServerClazz = Class.forName("io.seata.core.rpc.netty.RpcServer");
            Class channelHandlerContextMockType = Class.forName("io.netty.channel.ChannelHandlerContext");
            Method closeChannelHandlerContextMethod = rpcServerClazz.getDeclaredMethod("closeChannelHandlerContext", channelHandlerContextMockType);
            closeChannelHandlerContextMethod.setAccessible(true);
            java.lang.Object[] closeChannelHandlerContextMethodArguments = new java.lang.Object[1];
            closeChannelHandlerContextMethodArguments[0] = channelHandlerContextMock;
            closeChannelHandlerContextMethod.invoke(rpcServer, closeChannelHandlerContextMethodArguments);
        } finally {
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
    
    @Test(timeout = 10000)
    public void testCloseChannelHandlerContext5() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(org.slf4j.LoggerFactory.class);
            Logger loggerMock = mock(Logger.class);
            when(loggerMock.isInfoEnabled()).thenReturn(true);
            mockedStatic.when(() -> {
                org.slf4j.LoggerFactory.getLogger(any(Class.class));
            }).thenReturn(loggerMock);
            RpcServer rpcServer = ((RpcServer) createInstance("io.seata.core.rpc.netty.RpcServer"));
            ChannelHandlerContext channelHandlerContextMock = mock(ChannelHandlerContext.class);
            Channel channelMock = mock(Channel.class);
            when(channelMock.toString()).thenReturn(((String) null));
            when(channelHandlerContextMock.channel()).thenReturn(channelMock);
            when(channelHandlerContextMock.disconnect()).thenReturn(((ChannelFuture) null));
            when(channelHandlerContextMock.close()).thenReturn(((ChannelFuture) null));
            
            Class rpcServerClazz = Class.forName("io.seata.core.rpc.netty.RpcServer");
            Class channelHandlerContextMockType = Class.forName("io.netty.channel.ChannelHandlerContext");
            Method closeChannelHandlerContextMethod = rpcServerClazz.getDeclaredMethod("closeChannelHandlerContext", channelHandlerContextMockType);
            closeChannelHandlerContextMethod.setAccessible(true);
            java.lang.Object[] closeChannelHandlerContextMethodArguments = new java.lang.Object[1];
            closeChannelHandlerContextMethodArguments[0] = channelHandlerContextMock;
            closeChannelHandlerContextMethod.invoke(rpcServer, closeChannelHandlerContextMethodArguments);
        } finally {
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
        ChannelHandlerContext channelHandlerContextMock = mock(ChannelHandlerContext.class);
        when(channelHandlerContextMock.channel()).thenReturn(((Channel) null));
        
        Class rpcServerClazz = Class.forName("io.seata.core.rpc.netty.RpcServer");
        Class channelHandlerContextMockType = Class.forName("io.netty.channel.ChannelHandlerContext");
        Method handleDisconnectMethod = rpcServerClazz.getDeclaredMethod("handleDisconnect", channelHandlerContextMockType);
        handleDisconnectMethod.setAccessible(true);
        java.lang.Object[] handleDisconnectMethodArguments = new java.lang.Object[1];
        handleDisconnectMethodArguments[0] = channelHandlerContextMock;
        try {
            handleDisconnectMethod.invoke(rpcServer, handleDisconnectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testHandleDisconnect4() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        org.mockito.MockedStatic mockedStatic1 = null;
        org.mockito.MockedStatic mockedStatic2 = null;
        try {
            mockedStatic = mockStatic(io.seata.common.util.NetUtil.class);
            String string = new String("");
            mockedStatic.when(() -> {
                io.seata.common.util.NetUtil.toStringAddress(any(java.net.SocketAddress.class));
            }).thenReturn(string);
            mockedStatic1 = mockStatic(io.seata.core.rpc.ChannelManager.class);
            RpcContext rpcContextMock = mock(RpcContext.class);
            NettyPoolKey.TransactionRole transactionRole = NettyPoolKey.TransactionRole.TMROLE;
            when(rpcContextMock.getClientRole()).thenReturn(transactionRole);
            mockedStatic1.when(() -> {
                io.seata.core.rpc.ChannelManager.getContextFromIdentified(org.mockito.ArgumentMatchers.any());
            }).thenReturn(rpcContextMock);
            mockedStatic2 = mockStatic(org.slf4j.LoggerFactory.class);
            Logger loggerMock = mock(Logger.class);
            when(loggerMock.isInfoEnabled()).thenReturn(false, false);
            mockedStatic2.when(() -> {
                org.slf4j.LoggerFactory.getLogger(any(Class.class));
            }).thenReturn(loggerMock);
            RpcServer rpcServer = ((RpcServer) createInstance("io.seata.core.rpc.netty.RpcServer"));
            ChannelHandlerContext channelHandlerContextMock = mock(ChannelHandlerContext.class);
            Channel channelMock = mock(Channel.class);
            DatagramSocketAddress datagramSocketAddress = ((DatagramSocketAddress) createInstance("io.netty.channel.unix.DatagramSocketAddress"));
            when(channelMock.remoteAddress()).thenReturn(((java.net.SocketAddress) datagramSocketAddress));
            when(channelHandlerContextMock.channel()).thenReturn(channelMock, ((Channel) null));
            
            Class rpcServerClazz = Class.forName("io.seata.core.rpc.netty.RpcServer");
            Class channelHandlerContextMockType = Class.forName("io.netty.channel.ChannelHandlerContext");
            Method handleDisconnectMethod = rpcServerClazz.getDeclaredMethod("handleDisconnect", channelHandlerContextMockType);
            handleDisconnectMethod.setAccessible(true);
            java.lang.Object[] handleDisconnectMethodArguments = new java.lang.Object[1];
            handleDisconnectMethodArguments[0] = channelHandlerContextMock;
            handleDisconnectMethod.invoke(rpcServer, handleDisconnectMethodArguments);
        } finally {
            mockedStatic.close();
            mockedStatic1.close();
            mockedStatic2.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testHandleDisconnect5() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        org.mockito.MockedStatic mockedStatic1 = null;
        org.mockito.MockedStatic mockedStatic2 = null;
        try {
            mockedStatic = mockStatic(io.seata.common.util.NetUtil.class);
            mockedStatic.when(() -> {
                io.seata.common.util.NetUtil.toStringAddress(any(java.net.SocketAddress.class));
            }).thenReturn(((String) null));
            mockedStatic1 = mockStatic(io.seata.core.rpc.ChannelManager.class);
            RpcContext rpcContextMock = mock(RpcContext.class);
            when(rpcContextMock.getClientRole()).thenReturn(((NettyPoolKey.TransactionRole) null));
            mockedStatic1.when(() -> {
                io.seata.core.rpc.ChannelManager.getContextFromIdentified(org.mockito.ArgumentMatchers.any());
            }).thenReturn(rpcContextMock);
            mockedStatic2 = mockStatic(org.slf4j.LoggerFactory.class);
            Logger loggerMock = mock(Logger.class);
            when(loggerMock.isInfoEnabled()).thenReturn(false, false);
            mockedStatic2.when(() -> {
                org.slf4j.LoggerFactory.getLogger(any(Class.class));
            }).thenReturn(loggerMock);
            RpcServer rpcServer = ((RpcServer) createInstance("io.seata.core.rpc.netty.RpcServer"));
            ChannelHandlerContext channelHandlerContextMock = mock(ChannelHandlerContext.class);
            Channel channelMock = mock(Channel.class);
            DatagramSocketAddress datagramSocketAddress = ((DatagramSocketAddress) createInstance("io.netty.channel.unix.DatagramSocketAddress"));
            when(channelMock.remoteAddress()).thenReturn(((java.net.SocketAddress) datagramSocketAddress));
            when(channelHandlerContextMock.channel()).thenReturn(channelMock, ((Channel) null));
            
            Class rpcServerClazz = Class.forName("io.seata.core.rpc.netty.RpcServer");
            Class channelHandlerContextMockType = Class.forName("io.netty.channel.ChannelHandlerContext");
            Method handleDisconnectMethod = rpcServerClazz.getDeclaredMethod("handleDisconnect", channelHandlerContextMockType);
            handleDisconnectMethod.setAccessible(true);
            java.lang.Object[] handleDisconnectMethodArguments = new java.lang.Object[1];
            handleDisconnectMethodArguments[0] = channelHandlerContextMock;
            handleDisconnectMethod.invoke(rpcServer, handleDisconnectMethodArguments);
        } finally {
            mockedStatic.close();
            mockedStatic1.close();
            mockedStatic2.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testHandleDisconnect6() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        org.mockito.MockedStatic mockedStatic1 = null;
        org.mockito.MockedStatic mockedStatic2 = null;
        try {
            mockedStatic = mockStatic(io.seata.common.util.NetUtil.class);
            String string = new String("");
            mockedStatic.when(() -> {
                io.seata.common.util.NetUtil.toStringAddress(any(java.net.SocketAddress.class));
            }).thenReturn(string);
            mockedStatic1 = mockStatic(io.seata.core.rpc.ChannelManager.class);
            mockedStatic1.when(() -> {
                io.seata.core.rpc.ChannelManager.getContextFromIdentified(org.mockito.ArgumentMatchers.any());
            }).thenReturn(((RpcContext) null));
            mockedStatic2 = mockStatic(org.slf4j.LoggerFactory.class);
            Logger loggerMock = mock(Logger.class);
            when(loggerMock.isInfoEnabled()).thenReturn(false, false);
            mockedStatic2.when(() -> {
                org.slf4j.LoggerFactory.getLogger(any(Class.class));
            }).thenReturn(loggerMock);
            RpcServer rpcServer = ((RpcServer) createInstance("io.seata.core.rpc.netty.RpcServer"));
            ChannelHandlerContext channelHandlerContextMock = mock(ChannelHandlerContext.class);
            Channel channelMock = mock(Channel.class);
            DatagramSocketAddress datagramSocketAddress = ((DatagramSocketAddress) createInstance("io.netty.channel.unix.DatagramSocketAddress"));
            when(channelMock.remoteAddress()).thenReturn(((java.net.SocketAddress) datagramSocketAddress));
            when(channelHandlerContextMock.channel()).thenReturn(channelMock, ((Channel) null));
            
            Class rpcServerClazz = Class.forName("io.seata.core.rpc.netty.RpcServer");
            Class channelHandlerContextMockType = Class.forName("io.netty.channel.ChannelHandlerContext");
            Method handleDisconnectMethod = rpcServerClazz.getDeclaredMethod("handleDisconnect", channelHandlerContextMockType);
            handleDisconnectMethod.setAccessible(true);
            java.lang.Object[] handleDisconnectMethodArguments = new java.lang.Object[1];
            handleDisconnectMethodArguments[0] = channelHandlerContextMock;
            handleDisconnectMethod.invoke(rpcServer, handleDisconnectMethodArguments);
        } finally {
            mockedStatic.close();
            mockedStatic1.close();
            mockedStatic2.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testHandleDisconnect7() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        org.mockito.MockedStatic mockedStatic1 = null;
        org.mockito.MockedStatic mockedStatic2 = null;
        try {
            mockedStatic = mockStatic(io.seata.common.util.NetUtil.class);
            mockedStatic.when(() -> {
                io.seata.common.util.NetUtil.toStringAddress(any(java.net.SocketAddress.class));
            }).thenReturn(((String) null));
            mockedStatic1 = mockStatic(io.seata.core.rpc.ChannelManager.class);
            mockedStatic1.when(() -> {
                io.seata.core.rpc.ChannelManager.getContextFromIdentified(org.mockito.ArgumentMatchers.any());
            }).thenReturn(((RpcContext) null));
            mockedStatic2 = mockStatic(org.slf4j.LoggerFactory.class);
            Logger loggerMock = mock(Logger.class);
            when(loggerMock.isInfoEnabled()).thenReturn(false, true);
            mockedStatic2.when(() -> {
                org.slf4j.LoggerFactory.getLogger(any(Class.class));
            }).thenReturn(loggerMock);
            RpcServer rpcServer = ((RpcServer) createInstance("io.seata.core.rpc.netty.RpcServer"));
            ChannelHandlerContext channelHandlerContextMock = mock(ChannelHandlerContext.class);
            Channel channelMock = mock(Channel.class);
            DatagramSocketAddress datagramSocketAddress = ((DatagramSocketAddress) createInstance("io.netty.channel.unix.DatagramSocketAddress"));
            when(channelMock.remoteAddress()).thenReturn(((java.net.SocketAddress) datagramSocketAddress));
            when(channelMock.toString()).thenReturn(((String) null));
            when(channelHandlerContextMock.channel()).thenReturn(channelMock, ((Channel) null), channelMock);
            
            Class rpcServerClazz = Class.forName("io.seata.core.rpc.netty.RpcServer");
            Class channelHandlerContextMockType = Class.forName("io.netty.channel.ChannelHandlerContext");
            Method handleDisconnectMethod = rpcServerClazz.getDeclaredMethod("handleDisconnect", channelHandlerContextMockType);
            handleDisconnectMethod.setAccessible(true);
            java.lang.Object[] handleDisconnectMethodArguments = new java.lang.Object[1];
            handleDisconnectMethodArguments[0] = channelHandlerContextMock;
            handleDisconnectMethod.invoke(rpcServer, handleDisconnectMethodArguments);
        } finally {
            mockedStatic.close();
            mockedStatic1.close();
            mockedStatic2.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testHandleDisconnect8() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        org.mockito.MockedStatic mockedStatic1 = null;
        org.mockito.MockedStatic mockedStatic2 = null;
        try {
            mockedStatic = mockStatic(io.seata.common.util.NetUtil.class);
            mockedStatic.when(() -> {
                io.seata.common.util.NetUtil.toStringAddress(any(java.net.SocketAddress.class));
            }).thenReturn(((String) null));
            mockedStatic1 = mockStatic(io.seata.core.rpc.ChannelManager.class);
            mockedStatic1.when(() -> {
                io.seata.core.rpc.ChannelManager.getContextFromIdentified(org.mockito.ArgumentMatchers.any());
            }).thenReturn(((RpcContext) null));
            mockedStatic2 = mockStatic(org.slf4j.LoggerFactory.class);
            Logger loggerMock = mock(Logger.class);
            when(loggerMock.isInfoEnabled()).thenReturn(true, false);
            mockedStatic2.when(() -> {
                org.slf4j.LoggerFactory.getLogger(any(Class.class));
            }).thenReturn(loggerMock);
            RpcServer rpcServer = ((RpcServer) createInstance("io.seata.core.rpc.netty.RpcServer"));
            ChannelHandlerContext channelHandlerContextMock = mock(ChannelHandlerContext.class);
            Channel channelMock = mock(Channel.class);
            DatagramSocketAddress datagramSocketAddress = ((DatagramSocketAddress) createInstance("io.netty.channel.unix.DatagramSocketAddress"));
            when(channelMock.remoteAddress()).thenReturn(((java.net.SocketAddress) datagramSocketAddress));
            when(channelHandlerContextMock.channel()).thenReturn(channelMock, ((Channel) null));
            
            Class rpcServerClazz = Class.forName("io.seata.core.rpc.netty.RpcServer");
            Class channelHandlerContextMockType = Class.forName("io.netty.channel.ChannelHandlerContext");
            Method handleDisconnectMethod = rpcServerClazz.getDeclaredMethod("handleDisconnect", channelHandlerContextMockType);
            handleDisconnectMethod.setAccessible(true);
            java.lang.Object[] handleDisconnectMethodArguments = new java.lang.Object[1];
            handleDisconnectMethodArguments[0] = channelHandlerContextMock;
            handleDisconnectMethod.invoke(rpcServer, handleDisconnectMethodArguments);
        } finally {
            mockedStatic.close();
            mockedStatic1.close();
            mockedStatic2.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testHandleDisconnect9() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        org.mockito.MockedStatic mockedStatic1 = null;
        org.mockito.MockedStatic mockedStatic2 = null;
        try {
            mockedStatic = mockStatic(io.seata.common.util.NetUtil.class);
            mockedStatic.when(() -> {
                io.seata.common.util.NetUtil.toStringAddress(any(java.net.SocketAddress.class));
            }).thenReturn(((String) null));
            mockedStatic1 = mockStatic(io.seata.core.rpc.ChannelManager.class);
            RpcContext rpcContextMock = mock(RpcContext.class);
            NettyPoolKey.TransactionRole transactionRole = NettyPoolKey.TransactionRole.TMROLE;
            when(rpcContextMock.getClientRole()).thenReturn(transactionRole);
            when(rpcContextMock.toString()).thenReturn(((String) null));
            mockedStatic1.when(() -> {
                io.seata.core.rpc.ChannelManager.getContextFromIdentified(org.mockito.ArgumentMatchers.any());
            }).thenReturn(rpcContextMock);
            mockedStatic2 = mockStatic(org.slf4j.LoggerFactory.class);
            Logger loggerMock = mock(Logger.class);
            when(loggerMock.isInfoEnabled()).thenReturn(false, true);
            mockedStatic2.when(() -> {
                org.slf4j.LoggerFactory.getLogger(any(Class.class));
            }).thenReturn(loggerMock);
            RpcServer rpcServer = ((RpcServer) createInstance("io.seata.core.rpc.netty.RpcServer"));
            ChannelHandlerContext channelHandlerContextMock = mock(ChannelHandlerContext.class);
            Channel channelMock = mock(Channel.class);
            InetSocketAddress inetSocketAddress = ((InetSocketAddress) createInstance("java.net.InetSocketAddress"));
            when(channelMock.remoteAddress()).thenReturn(((java.net.SocketAddress) inetSocketAddress));
            when(channelMock.toString()).thenReturn(((String) null));
            Channel channelMock1 = mock(Channel.class);
            when(channelHandlerContextMock.channel()).thenReturn(channelMock, channelMock1, channelMock);
            
            Class rpcServerClazz = Class.forName("io.seata.core.rpc.netty.RpcServer");
            Class channelHandlerContextMockType = Class.forName("io.netty.channel.ChannelHandlerContext");
            Method handleDisconnectMethod = rpcServerClazz.getDeclaredMethod("handleDisconnect", channelHandlerContextMockType);
            handleDisconnectMethod.setAccessible(true);
            java.lang.Object[] handleDisconnectMethodArguments = new java.lang.Object[1];
            handleDisconnectMethodArguments[0] = channelHandlerContextMock;
            handleDisconnectMethod.invoke(rpcServer, handleDisconnectMethodArguments);
        } finally {
            mockedStatic.close();
            mockedStatic1.close();
            mockedStatic2.close();
        }
    }
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
