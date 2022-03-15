package io.seata.core.rpc;

import org.junit.Test;
import io.seata.core.protocol.RegisterRMRequest;
import io.seata.core.rpc.netty.RegisterCheckAuthHandler;
import io.netty.channel.ChannelHandlerContext;
import io.seata.core.protocol.RegisterTMRequest;
import io.netty.channel.Channel;
import java.net.InetSocketAddress;
import io.netty.channel.unix.DomainSocketAddress;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import sun.misc.Unsafe;

import static org.mockito.Mockito.mock;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.junit.Assert.assertNull;

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
        java.lang.Object[] byteBufferAsLongBufferBArray = createArray("java.nio.ByteBufferAsLongBufferB", 0);
        
        defaultServerMessageListenerImpl.onTrxMessage(0L, null, byteBufferAsLongBufferBArray, null);
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
        RegisterRMRequest registerRMRequestMock = mock(RegisterRMRequest.class);
        ServerMessageSender serverMessageSenderMock = mock(ServerMessageSender.class);
        RegisterCheckAuthHandler registerCheckAuthHandlerMock = mock(RegisterCheckAuthHandler.class);
        when(registerCheckAuthHandlerMock.regResourceManagerCheckAuth(any())).thenReturn(false);
        
        defaultServerMessageListenerImpl.onRegRmMessage(0L, null, registerRMRequestMock, serverMessageSenderMock, registerCheckAuthHandlerMock);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testOnRegRmMessage3() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        org.mockito.MockedStatic mockedStatic1 = null;
        org.mockito.MockedStatic mockedStatic2 = null;
        try {
            mockedStatic = mockStatic(ChannelManager.class);
            mockedStatic1 = mockStatic(io.seata.core.protocol.Version.class);
            mockedStatic2 = mockStatic(java.nio.ByteBuffer.class);
            mockedStatic2.when(() -> {
                java.nio.ByteBuffer.allocate(anyInt());
            }).thenReturn(((java.nio.ByteBuffer) null));
            DefaultServerMessageListenerImpl defaultServerMessageListenerImpl = ((DefaultServerMessageListenerImpl) createInstance("io.seata.core.rpc.DefaultServerMessageListenerImpl"));
            ChannelHandlerContext channelHandlerContextMock = mock(ChannelHandlerContext.class);
            when(channelHandlerContextMock.channel()).thenReturn(((Channel) null), ((Channel) null), ((Channel) null));
            RegisterRMRequest registerRMRequestMock = mock(RegisterRMRequest.class);
            when(registerRMRequestMock.getVersion()).thenReturn(((String) null));
            RegisterCheckAuthHandler registerCheckAuthHandlerMock = mock(RegisterCheckAuthHandler.class);
            when(registerCheckAuthHandlerMock.regResourceManagerCheckAuth(any())).thenReturn(true);
            
            defaultServerMessageListenerImpl.onRegRmMessage(0L, channelHandlerContextMock, registerRMRequestMock, null, registerCheckAuthHandlerMock);
        } finally {
            mockedStatic.close();
            mockedStatic1.close();
            mockedStatic2.close();
        }
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
        
        defaultServerMessageListenerImpl.onRegTmMessage(0L, null, null, null, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testOnRegTmMessage3() throws Throwable  {
        DefaultServerMessageListenerImpl defaultServerMessageListenerImpl = ((DefaultServerMessageListenerImpl) createInstance("io.seata.core.rpc.DefaultServerMessageListenerImpl"));
        ChannelHandlerContext channelHandlerContextMock = mock(ChannelHandlerContext.class);
        when(channelHandlerContextMock.channel()).thenReturn(((Channel) null));
        
        defaultServerMessageListenerImpl.onRegTmMessage(0L, channelHandlerContextMock, null, null, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testOnRegTmMessage4() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(io.seata.common.util.NetUtil.class);
            mockedStatic.when(() -> {
                io.seata.common.util.NetUtil.toStringAddress(org.mockito.ArgumentMatchers.any(java.net.SocketAddress.class));
            }).thenReturn(((String) null));
            DefaultServerMessageListenerImpl defaultServerMessageListenerImpl = ((DefaultServerMessageListenerImpl) createInstance("io.seata.core.rpc.DefaultServerMessageListenerImpl"));
            ChannelHandlerContext channelHandlerContextMock = mock(ChannelHandlerContext.class);
            Channel channelMock = mock(Channel.class);
            InetSocketAddress inetSocketAddress = ((InetSocketAddress) createInstance("java.net.InetSocketAddress"));
            when(channelMock.remoteAddress()).thenReturn(((java.net.SocketAddress) inetSocketAddress));
            when(channelHandlerContextMock.channel()).thenReturn(channelMock, ((Channel) null));
            ServerMessageSender serverMessageSenderMock = mock(ServerMessageSender.class);
            
            defaultServerMessageListenerImpl.onRegTmMessage(0L, channelHandlerContextMock, null, serverMessageSenderMock, null);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testOnRegTmMessage5() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        org.mockito.MockedStatic mockedStatic1 = null;
        org.mockito.MockedStatic mockedStatic2 = null;
        try {
            mockedStatic = mockStatic(io.seata.common.util.NetUtil.class);
            mockedStatic.when(() -> {
                io.seata.common.util.NetUtil.toStringAddress(org.mockito.ArgumentMatchers.any(java.net.SocketAddress.class));
            }).thenReturn(((String) null));
            mockedStatic1 = mockStatic(io.seata.core.protocol.Version.class);
            mockedStatic2 = mockStatic(java.nio.ByteBuffer.class);
            mockedStatic2.when(() -> {
                java.nio.ByteBuffer.allocate(anyInt());
            }).thenReturn(((java.nio.ByteBuffer) null));
            DefaultServerMessageListenerImpl defaultServerMessageListenerImpl = ((DefaultServerMessageListenerImpl) createInstance("io.seata.core.rpc.DefaultServerMessageListenerImpl"));
            ChannelHandlerContext channelHandlerContextMock = mock(ChannelHandlerContext.class);
            Channel channelMock = mock(Channel.class);
            DomainSocketAddress domainSocketAddress = ((DomainSocketAddress) createInstance("io.netty.channel.unix.DomainSocketAddress"));
            when(channelMock.remoteAddress()).thenReturn(((java.net.SocketAddress) domainSocketAddress));
            when(channelHandlerContextMock.channel()).thenReturn(channelMock, ((Channel) null), ((Channel) null));
            RegisterTMRequest registerTMRequestMock = mock(RegisterTMRequest.class);
            when(registerTMRequestMock.getVersion()).thenReturn(((String) null));
            ServerMessageSender serverMessageSenderMock = mock(ServerMessageSender.class);
            RegisterCheckAuthHandler registerCheckAuthHandlerMock = mock(RegisterCheckAuthHandler.class);
            when(registerCheckAuthHandlerMock.regTransactionManagerCheckAuth(any())).thenReturn(false);
            
            defaultServerMessageListenerImpl.onRegTmMessage(0L, channelHandlerContextMock, registerTMRequestMock, serverMessageSenderMock, registerCheckAuthHandlerMock);
        } finally {
            mockedStatic.close();
            mockedStatic1.close();
            mockedStatic2.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testOnRegTmMessage6() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        org.mockito.MockedStatic mockedStatic1 = null;
        org.mockito.MockedStatic mockedStatic2 = null;
        try {
            mockedStatic = mockStatic(io.seata.common.util.NetUtil.class);
            mockedStatic.when(() -> {
                io.seata.common.util.NetUtil.toStringAddress(org.mockito.ArgumentMatchers.any(java.net.SocketAddress.class));
            }).thenReturn(((String) null));
            mockedStatic1 = mockStatic(io.seata.core.protocol.Version.class);
            mockedStatic2 = mockStatic(java.nio.ByteBuffer.class);
            mockedStatic2.when(() -> {
                java.nio.ByteBuffer.allocate(anyInt());
            }).thenReturn(((java.nio.ByteBuffer) null));
            DefaultServerMessageListenerImpl defaultServerMessageListenerImpl = ((DefaultServerMessageListenerImpl) createInstance("io.seata.core.rpc.DefaultServerMessageListenerImpl"));
            ChannelHandlerContext channelHandlerContextMock = mock(ChannelHandlerContext.class);
            Channel channelMock = mock(Channel.class);
            InetSocketAddress inetSocketAddress = ((InetSocketAddress) createInstance("java.net.InetSocketAddress"));
            when(channelMock.remoteAddress()).thenReturn(((java.net.SocketAddress) inetSocketAddress));
            when(channelHandlerContextMock.channel()).thenReturn(channelMock, ((Channel) null), ((Channel) null));
            RegisterTMRequest registerTMRequestMock = mock(RegisterTMRequest.class);
            when(registerTMRequestMock.getVersion()).thenReturn(((String) null));
            RegisterCheckAuthHandler registerCheckAuthHandlerMock = mock(RegisterCheckAuthHandler.class);
            when(registerCheckAuthHandlerMock.regTransactionManagerCheckAuth(any())).thenReturn(false);
            
            defaultServerMessageListenerImpl.onRegTmMessage(0L, channelHandlerContextMock, registerTMRequestMock, null, registerCheckAuthHandlerMock);
        } finally {
            mockedStatic.close();
            mockedStatic1.close();
            mockedStatic2.close();
        }
    }
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
        
        defaultServerMessageListenerImpl.setServerMessageSender(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetServerMessageSender2() throws Throwable  {
        DefaultServerMessageListenerImpl defaultServerMessageListenerImpl = ((DefaultServerMessageListenerImpl) createInstance("io.seata.core.rpc.DefaultServerMessageListenerImpl"));
        setField(defaultServerMessageListenerImpl, "serverMessageSender", null);
        
        defaultServerMessageListenerImpl.setServerMessageSender(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetServerMessageSender1() throws Throwable  {
        DefaultServerMessageListenerImpl defaultServerMessageListenerImpl = ((DefaultServerMessageListenerImpl) createInstance("io.seata.core.rpc.DefaultServerMessageListenerImpl"));
        
        ServerMessageSender actual = defaultServerMessageListenerImpl.getServerMessageSender();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetServerMessageSender2() throws Throwable  {
        DefaultServerMessageListenerImpl defaultServerMessageListenerImpl = ((DefaultServerMessageListenerImpl) createInstance("io.seata.core.rpc.DefaultServerMessageListenerImpl"));
        setField(defaultServerMessageListenerImpl, "serverMessageSender", null);
        
        ServerMessageSender actual = defaultServerMessageListenerImpl.getServerMessageSender();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testInit1() throws Throwable  {
        DefaultServerMessageListenerImpl defaultServerMessageListenerImpl = ((DefaultServerMessageListenerImpl) createInstance("io.seata.core.rpc.DefaultServerMessageListenerImpl"));
        
        defaultServerMessageListenerImpl.init();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDefaultServerMessageListenerImpl1() {
        DefaultServerMessageListenerImpl actual = new DefaultServerMessageListenerImpl(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDefaultServerMessageListenerImpl2() throws Throwable  {
        TransactionMessageHandler transactionMessageHandlerMock = mock(TransactionMessageHandler.class);
        DefaultServerMessageListenerImpl actual = new DefaultServerMessageListenerImpl(transactionMessageHandlerMock);
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
    private static sun.misc.Unsafe getUnsafeInstance() throws Exception {
        java.lang.reflect.Field f = sun.misc.Unsafe.class.getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return (sun.misc.Unsafe) f.get(null);
    }
}
