package io.seata.core.rpc.netty;

import org.junit.Test;
import io.netty.channel.ChannelHandlerContext;
import java.nio.BufferUnderflowException;
import org.slf4j.Logger;
import io.netty.channel.ChannelFuture;
import javax.management.InvalidApplicationException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Array;
import sun.misc.Unsafe;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class RpcServerHandlerTest {
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testExceptionCaught1() throws Throwable  {
        RpcServerHandler rpcServerHandler = new RpcServerHandler();
        Throwable throwable = new Throwable();
        
        rpcServerHandler.exceptionCaught(((ChannelHandlerContext) null), throwable);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testExceptionCaught2() throws Throwable  {
        RpcServerHandler rpcServerHandler = ((RpcServerHandler) createInstance("io.seata.core.rpc.netty.RpcServerHandler"));
        BufferUnderflowException bufferUnderflowException = ((BufferUnderflowException) createInstance("java.nio.BufferUnderflowException"));
        
        rpcServerHandler.exceptionCaught(((ChannelHandlerContext) null), bufferUnderflowException);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testExceptionCaught3() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(org.slf4j.LoggerFactory.class);
            Logger loggerMock = mock(Logger.class);
            mockedStatic.when(() -> {
                org.slf4j.LoggerFactory.getLogger(any(Class.class));
            }).thenReturn(loggerMock);
            RpcServerHandler rpcServerHandler = ((RpcServerHandler) createInstance("io.seata.core.rpc.netty.RpcServerHandler"));
            ChannelHandlerContext channelHandlerContextMock = mock(ChannelHandlerContext.class);
            ChannelFuture channelFutureMock = mock(ChannelFuture.class);
            when(channelHandlerContextMock.close()).thenReturn(channelFutureMock);
            
            rpcServerHandler.exceptionCaught(channelHandlerContextMock, ((Throwable) null));
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testExceptionCaught4() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(org.slf4j.LoggerFactory.class);
            Logger loggerMock = mock(Logger.class);
            mockedStatic.when(() -> {
                org.slf4j.LoggerFactory.getLogger(any(Class.class));
            }).thenReturn(loggerMock);
            RpcServerHandler rpcServerHandler = ((RpcServerHandler) createInstance("io.seata.core.rpc.netty.RpcServerHandler"));
            ChannelHandlerContext channelHandlerContextMock = mock(ChannelHandlerContext.class);
            when(channelHandlerContextMock.close()).thenReturn(((ChannelFuture) null));
            InvalidApplicationException invalidApplicationException = ((InvalidApplicationException) createInstance("javax.management.InvalidApplicationException"));
            setField(invalidApplicationException, "detailMessage", null);
            
            rpcServerHandler.exceptionCaught(channelHandlerContextMock, invalidApplicationException);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testUserEventTriggered1() throws Throwable  {
        RpcServerHandler rpcServerHandler = new RpcServerHandler();
        Object object = new Object();
        
        rpcServerHandler.userEventTriggered(((ChannelHandlerContext) null), object);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testUserEventTriggered2() throws Throwable  {
        RpcServerHandler rpcServerHandler = ((RpcServerHandler) createInstance("io.seata.core.rpc.netty.RpcServerHandler"));
        java.lang.Object[] byteBufferAsLongBufferBArray = createArray("java.nio.ByteBufferAsLongBufferB", 0);
        
        rpcServerHandler.userEventTriggered(((ChannelHandlerContext) null), byteBufferAsLongBufferBArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testUserEventTriggered3() throws Throwable  {
        RpcServerHandler rpcServerHandler = ((RpcServerHandler) createInstance("io.seata.core.rpc.netty.RpcServerHandler"));
        ChannelHandlerContext channelHandlerContextMock = mock(ChannelHandlerContext.class);
        when(channelHandlerContextMock.fireUserEventTriggered(org.mockito.ArgumentMatchers.any())).thenReturn(((ChannelHandlerContext) null));
        java.lang.Object[] byteBufferAsLongBufferBArray = createArray("java.nio.ByteBufferAsLongBufferB", 0);
        
        rpcServerHandler.userEventTriggered(channelHandlerContextMock, byteBufferAsLongBufferBArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testChannelInactive1() throws Throwable  {
        RpcServerHandler rpcServerHandler = new RpcServerHandler();
        
        rpcServerHandler.channelInactive(((ChannelHandlerContext) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testChannelInactive2() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(org.slf4j.LoggerFactory.class);
            Logger loggerMock = mock(Logger.class);
            mockedStatic.when(() -> {
                org.slf4j.LoggerFactory.getLogger(any(Class.class));
            }).thenReturn(loggerMock);
            RpcServerHandler rpcServerHandler = ((RpcServerHandler) createInstance("io.seata.core.rpc.netty.RpcServerHandler"));
            ChannelHandlerContext channelHandlerContextMock = mock(ChannelHandlerContext.class);
            when(channelHandlerContextMock.fireChannelInactive()).thenReturn(((ChannelHandlerContext) null));
            when(channelHandlerContextMock.channel()).thenReturn(((io.netty.channel.Channel) null), ((io.netty.channel.Channel) null));
            
            rpcServerHandler.channelInactive(channelHandlerContextMock);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testChannelActive1() throws Throwable  {
        RpcServerHandler rpcServerHandler = new RpcServerHandler();
        
        rpcServerHandler.channelActive(((ChannelHandlerContext) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testChannelRead1() throws Throwable  {
        RpcServerHandler rpcServerHandler = new RpcServerHandler();
        Object object = new Object();
        
        rpcServerHandler.channelRead(((ChannelHandlerContext) null), object);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testChannelRead2() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(org.slf4j.LoggerFactory.class);
            Logger loggerMock = mock(Logger.class);
            mockedStatic.when(() -> {
                org.slf4j.LoggerFactory.getLogger(any(Class.class));
            }).thenReturn(loggerMock);
            RpcServerHandler rpcServerHandler = ((RpcServerHandler) createInstance("io.seata.core.rpc.netty.RpcServerHandler"));
            ChannelHandlerContext channelHandlerContextMock = mock(ChannelHandlerContext.class);
            
            rpcServerHandler.channelRead(channelHandlerContextMock, null);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testRpcServerHandler1() {
        RpcServerHandler actual = new RpcServerHandler();
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
