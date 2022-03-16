package io.seata.core.rpc.netty;

import org.junit.Test;
import io.netty.channel.ChannelHandlerContext;
import io.netty.util.concurrent.DefaultEventExecutor;
import io.netty.channel.DefaultChannelPipeline;
import java.lang.reflect.Method;
import java.time.LocalDate;
import io.netty.util.concurrent.GlobalEventExecutor;
import io.netty.channel.nio.NioEventLoop;
import org.slf4j.Logger;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Array;
import sun.misc.Unsafe;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.mock;

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
        
        rpcServerHandler.exceptionCaught(((ChannelHandlerContext) null), ((Throwable) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testExceptionCaught3() throws Throwable  {
        RpcServerHandler rpcServerHandler = ((RpcServerHandler) createInstance("io.seata.core.rpc.netty.RpcServerHandler"));
        Object tailContext = createInstance("io.netty.channel.DefaultChannelPipeline$TailContext");
        DefaultEventExecutor defaultEventExecutor = ((DefaultEventExecutor) createInstance("io.netty.util.concurrent.DefaultEventExecutor"));
        setField(tailContext, "executor", defaultEventExecutor);
        DefaultChannelPipeline defaultChannelPipeline = ((DefaultChannelPipeline) createInstance("io.netty.channel.DefaultChannelPipeline"));
        Object failedChannel = createInstance("io.netty.bootstrap.FailedChannel");
        setField(defaultChannelPipeline, "channel", failedChannel);
        setField(tailContext, "pipeline", defaultChannelPipeline);
        setField(tailContext, "prev", null);
        
        Class rpcServerHandlerClazz = Class.forName("io.seata.core.rpc.netty.RpcServerHandler");
        Class tailContextType = Class.forName("io.netty.channel.ChannelHandlerContext");
        Class throwableType = Class.forName("java.lang.Throwable");
        Method exceptionCaughtMethod = rpcServerHandlerClazz.getDeclaredMethod("exceptionCaught", tailContextType, throwableType);
        exceptionCaughtMethod.setAccessible(true);
        java.lang.Object[] exceptionCaughtMethodArguments = new java.lang.Object[2];
        exceptionCaughtMethodArguments[0] = tailContext;
        exceptionCaughtMethodArguments[1] = null;
        try {
            exceptionCaughtMethod.invoke(rpcServerHandler, exceptionCaughtMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
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
        java.time.LocalDate[] localDateArray = new java.time.LocalDate[0];
        
        rpcServerHandler.userEventTriggered(((ChannelHandlerContext) null), localDateArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testUserEventTriggered3() throws Throwable  {
        RpcServerHandler rpcServerHandler = ((RpcServerHandler) createInstance("io.seata.core.rpc.netty.RpcServerHandler"));
        Object tailContext = createInstance("io.netty.channel.DefaultChannelPipeline$TailContext");
        setField(tailContext, "next", null);
        
        Class rpcServerHandlerClazz = Class.forName("io.seata.core.rpc.netty.RpcServerHandler");
        Class tailContextType = Class.forName("io.netty.channel.ChannelHandlerContext");
        Class objectType = Class.forName("java.lang.Object");
        Method userEventTriggeredMethod = rpcServerHandlerClazz.getDeclaredMethod("userEventTriggered", tailContextType, objectType);
        userEventTriggeredMethod.setAccessible(true);
        java.lang.Object[] userEventTriggeredMethodArguments = new java.lang.Object[2];
        userEventTriggeredMethodArguments[0] = tailContext;
        userEventTriggeredMethodArguments[1] = null;
        try {
            userEventTriggeredMethod.invoke(rpcServerHandler, userEventTriggeredMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testUserEventTriggered4() throws Throwable  {
        RpcServerHandler rpcServerHandler = ((RpcServerHandler) createInstance("io.seata.core.rpc.netty.RpcServerHandler"));
        Object tailContext = createInstance("io.netty.channel.DefaultChannelPipeline$TailContext");
        setField(tailContext, "inbound", false);
        Object tailContext1 = createInstance("io.netty.channel.DefaultChannelPipeline$TailContext");
        setField(tailContext1, "inbound", true);
        setField(tailContext1, "next", null);
        setField(tailContext, "next", tailContext1);
        
        Class rpcServerHandlerClazz = Class.forName("io.seata.core.rpc.netty.RpcServerHandler");
        Class tailContextType = Class.forName("io.netty.channel.ChannelHandlerContext");
        Class objectType = Class.forName("java.lang.Object");
        Method userEventTriggeredMethod = rpcServerHandlerClazz.getDeclaredMethod("userEventTriggered", tailContextType, objectType);
        userEventTriggeredMethod.setAccessible(true);
        java.lang.Object[] userEventTriggeredMethodArguments = new java.lang.Object[2];
        userEventTriggeredMethodArguments[0] = tailContext;
        userEventTriggeredMethodArguments[1] = null;
        try {
            userEventTriggeredMethod.invoke(rpcServerHandler, userEventTriggeredMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testUserEventTriggered5() throws Throwable  {
        RpcServerHandler rpcServerHandler = ((RpcServerHandler) createInstance("io.seata.core.rpc.netty.RpcServerHandler"));
        Object tailContext = createInstance("io.netty.channel.DefaultChannelPipeline$TailContext");
        setField(tailContext, "handlerState", 0);
        setField(tailContext, "executor", null);
        setField(tailContext, "ordered", false);
        setField(tailContext, "inbound", false);
        Object defaultChannelHandlerContext = createInstance("io.netty.channel.DefaultChannelHandlerContext");
        setField(defaultChannelHandlerContext, "handlerState", 1);
        GlobalEventExecutor globalEventExecutor = ((GlobalEventExecutor) createInstance("io.netty.util.concurrent.GlobalEventExecutor"));
        Thread thread = ((Thread) createInstance("java.lang.Thread"));
        setField(globalEventExecutor, "thread", thread);
        setField(defaultChannelHandlerContext, "executor", globalEventExecutor);
        setField(defaultChannelHandlerContext, "ordered", false);
        setField(defaultChannelHandlerContext, "inbound", true);
        setField(defaultChannelHandlerContext, "next", null);
        TmRpcClient tmRpcClient = ((TmRpcClient) createInstance("io.seata.core.rpc.netty.TmRpcClient"));
        setField(defaultChannelHandlerContext, "handler", tmRpcClient);
        setField(tailContext, "next", defaultChannelHandlerContext);
        java.lang.Object[] byteBufferAsShortBufferBArray = createArray("java.nio.ByteBufferAsShortBufferB", 0);
        
        Class rpcServerHandlerClazz = Class.forName("io.seata.core.rpc.netty.RpcServerHandler");
        Class tailContextType = Class.forName("io.netty.channel.ChannelHandlerContext");
        Class byteBufferAsShortBufferBArrayType = Class.forName("java.lang.Object");
        Method userEventTriggeredMethod = rpcServerHandlerClazz.getDeclaredMethod("userEventTriggered", tailContextType, byteBufferAsShortBufferBArrayType);
        userEventTriggeredMethod.setAccessible(true);
        java.lang.Object[] userEventTriggeredMethodArguments = new java.lang.Object[2];
        userEventTriggeredMethodArguments[0] = tailContext;
        userEventTriggeredMethodArguments[1] = ((Object) byteBufferAsShortBufferBArray);
        userEventTriggeredMethod.invoke(rpcServerHandler, userEventTriggeredMethodArguments);
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
        RpcServerHandler rpcServerHandler = ((RpcServerHandler) createInstance("io.seata.core.rpc.netty.RpcServerHandler"));
        Object tailContext = createInstance("io.netty.channel.DefaultChannelPipeline$TailContext");
        setField(tailContext, "next", null);
        
        Class rpcServerHandlerClazz = Class.forName("io.seata.core.rpc.netty.RpcServerHandler");
        Class tailContextType = Class.forName("io.netty.channel.ChannelHandlerContext");
        Method channelInactiveMethod = rpcServerHandlerClazz.getDeclaredMethod("channelInactive", tailContextType);
        channelInactiveMethod.setAccessible(true);
        java.lang.Object[] channelInactiveMethodArguments = new java.lang.Object[1];
        channelInactiveMethodArguments[0] = tailContext;
        try {
            channelInactiveMethod.invoke(rpcServerHandler, channelInactiveMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testChannelInactive3() throws Throwable  {
        RpcServerHandler rpcServerHandler = ((RpcServerHandler) createInstance("io.seata.core.rpc.netty.RpcServerHandler"));
        Object tailContext = createInstance("io.netty.channel.DefaultChannelPipeline$TailContext");
        setField(tailContext, "handlerState", 0);
        setField(tailContext, "executor", null);
        setField(tailContext, "ordered", false);
        setField(tailContext, "inbound", false);
        Object tailContext1 = createInstance("io.netty.channel.DefaultChannelPipeline$TailContext");
        setField(tailContext1, "handlerState", 0);
        GlobalEventExecutor globalEventExecutor = ((GlobalEventExecutor) createInstance("io.netty.util.concurrent.GlobalEventExecutor"));
        Thread thread = ((Thread) createInstance("java.lang.Thread"));
        setField(globalEventExecutor, "thread", thread);
        setField(tailContext1, "executor", globalEventExecutor);
        setField(tailContext1, "ordered", true);
        setField(tailContext1, "inbound", true);
        Object tailContext2 = createInstance("io.netty.channel.DefaultChannelPipeline$TailContext");
        setField(tailContext2, "handlerState", 0);
        setField(tailContext2, "executor", null);
        setField(tailContext2, "ordered", false);
        setField(tailContext2, "inbound", false);
        setField(tailContext2, "next", null);
        setField(tailContext1, "next", tailContext2);
        setField(tailContext, "next", tailContext1);
        
        Class rpcServerHandlerClazz = Class.forName("io.seata.core.rpc.netty.RpcServerHandler");
        Class tailContextType = Class.forName("io.netty.channel.ChannelHandlerContext");
        Method channelInactiveMethod = rpcServerHandlerClazz.getDeclaredMethod("channelInactive", tailContextType);
        channelInactiveMethod.setAccessible(true);
        java.lang.Object[] channelInactiveMethodArguments = new java.lang.Object[1];
        channelInactiveMethodArguments[0] = tailContext;
        try {
            channelInactiveMethod.invoke(rpcServerHandler, channelInactiveMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testChannelInactive4() throws Throwable  {
        RpcServerHandler rpcServerHandler = ((RpcServerHandler) createInstance("io.seata.core.rpc.netty.RpcServerHandler"));
        Object headContext = createInstance("io.netty.channel.DefaultChannelPipeline$HeadContext");
        setField(headContext, "handlerState", 0);
        setField(headContext, "executor", null);
        setField(headContext, "inbound", false);
        Object headContext1 = createInstance("io.netty.channel.DefaultChannelPipeline$HeadContext");
        setField(headContext1, "handlerState", 0);
        setField(headContext1, "executor", null);
        setField(headContext1, "inbound", false);
        Object defaultChannelHandlerContext = createInstance("io.netty.channel.DefaultChannelHandlerContext");
        setField(defaultChannelHandlerContext, "handlerState", 2);
        NioEventLoop nioEventLoop = ((NioEventLoop) createInstance("io.netty.channel.nio.NioEventLoop"));
        Thread thread = ((Thread) createInstance("java.lang.Thread"));
        setField(nioEventLoop, "thread", thread);
        setField(defaultChannelHandlerContext, "executor", nioEventLoop);
        setField(defaultChannelHandlerContext, "inbound", true);
        setField(defaultChannelHandlerContext, "next", null);
        Object encoder = createInstance("io.netty.handler.codec.ByteToMessageCodec$Encoder");
        setField(defaultChannelHandlerContext, "handler", encoder);
        setField(headContext1, "next", defaultChannelHandlerContext);
        setField(headContext, "next", headContext1);
        
        Class rpcServerHandlerClazz = Class.forName("io.seata.core.rpc.netty.RpcServerHandler");
        Class headContextType = Class.forName("io.netty.channel.ChannelHandlerContext");
        Method channelInactiveMethod = rpcServerHandlerClazz.getDeclaredMethod("channelInactive", headContextType);
        channelInactiveMethod.setAccessible(true);
        java.lang.Object[] channelInactiveMethodArguments = new java.lang.Object[1];
        channelInactiveMethodArguments[0] = headContext;
        try {
            channelInactiveMethod.invoke(rpcServerHandler, channelInactiveMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testChannelActive1() throws Throwable  {
        RpcServerHandler rpcServerHandler = new RpcServerHandler();
        
        rpcServerHandler.channelActive(((ChannelHandlerContext) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testChannelActive2() throws Throwable  {
        RpcServerHandler rpcServerHandler = ((RpcServerHandler) createInstance("io.seata.core.rpc.netty.RpcServerHandler"));
        Object tailContext = createInstance("io.netty.channel.DefaultChannelPipeline$TailContext");
        setField(tailContext, "next", null);
        
        Class rpcServerHandlerClazz = Class.forName("io.seata.core.rpc.netty.RpcServerHandler");
        Class tailContextType = Class.forName("io.netty.channel.ChannelHandlerContext");
        Method channelActiveMethod = rpcServerHandlerClazz.getDeclaredMethod("channelActive", tailContextType);
        channelActiveMethod.setAccessible(true);
        java.lang.Object[] channelActiveMethodArguments = new java.lang.Object[1];
        channelActiveMethodArguments[0] = tailContext;
        try {
            channelActiveMethod.invoke(rpcServerHandler, channelActiveMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testChannelActive3() throws Throwable  {
        RpcServerHandler rpcServerHandler = ((RpcServerHandler) createInstance("io.seata.core.rpc.netty.RpcServerHandler"));
        Object tailContext = createInstance("io.netty.channel.DefaultChannelPipeline$TailContext");
        setField(tailContext, "handlerState", 0);
        setField(tailContext, "executor", null);
        setField(tailContext, "ordered", false);
        setField(tailContext, "inbound", false);
        Object tailContext1 = createInstance("io.netty.channel.DefaultChannelPipeline$TailContext");
        setField(tailContext1, "handlerState", 0);
        GlobalEventExecutor globalEventExecutor = ((GlobalEventExecutor) createInstance("io.netty.util.concurrent.GlobalEventExecutor"));
        Thread thread = ((Thread) createInstance("java.lang.Thread"));
        setField(globalEventExecutor, "thread", thread);
        setField(tailContext1, "executor", globalEventExecutor);
        setField(tailContext1, "ordered", true);
        setField(tailContext1, "inbound", true);
        Object tailContext2 = createInstance("io.netty.channel.DefaultChannelPipeline$TailContext");
        setField(tailContext2, "handlerState", 0);
        setField(tailContext2, "executor", null);
        setField(tailContext2, "ordered", false);
        setField(tailContext2, "inbound", false);
        setField(tailContext2, "next", null);
        setField(tailContext1, "next", tailContext2);
        setField(tailContext, "next", tailContext1);
        
        Class rpcServerHandlerClazz = Class.forName("io.seata.core.rpc.netty.RpcServerHandler");
        Class tailContextType = Class.forName("io.netty.channel.ChannelHandlerContext");
        Method channelActiveMethod = rpcServerHandlerClazz.getDeclaredMethod("channelActive", tailContextType);
        channelActiveMethod.setAccessible(true);
        java.lang.Object[] channelActiveMethodArguments = new java.lang.Object[1];
        channelActiveMethodArguments[0] = tailContext;
        try {
            channelActiveMethod.invoke(rpcServerHandler, channelActiveMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testChannelActive4() throws Throwable  {
        RpcServerHandler rpcServerHandler = ((RpcServerHandler) createInstance("io.seata.core.rpc.netty.RpcServerHandler"));
        Object headContext = createInstance("io.netty.channel.DefaultChannelPipeline$HeadContext");
        setField(headContext, "handlerState", 0);
        setField(headContext, "executor", null);
        setField(headContext, "ordered", false);
        setField(headContext, "inbound", false);
        Object headContext1 = createInstance("io.netty.channel.DefaultChannelPipeline$HeadContext");
        setField(headContext1, "handlerState", 0);
        setField(headContext1, "executor", null);
        setField(headContext1, "ordered", false);
        setField(headContext1, "inbound", false);
        Object defaultChannelHandlerContext = createInstance("io.netty.channel.DefaultChannelHandlerContext");
        setField(defaultChannelHandlerContext, "handlerState", 1);
        NioEventLoop nioEventLoop = ((NioEventLoop) createInstance("io.netty.channel.nio.NioEventLoop"));
        Thread thread = ((Thread) createInstance("java.lang.Thread"));
        setField(nioEventLoop, "thread", thread);
        setField(defaultChannelHandlerContext, "executor", nioEventLoop);
        setField(defaultChannelHandlerContext, "ordered", false);
        setField(defaultChannelHandlerContext, "inbound", true);
        setField(defaultChannelHandlerContext, "next", null);
        Object encoder = createInstance("io.netty.handler.codec.ByteToMessageCodec$Encoder");
        setField(defaultChannelHandlerContext, "handler", encoder);
        setField(headContext1, "next", defaultChannelHandlerContext);
        setField(headContext, "next", headContext1);
        
        Class rpcServerHandlerClazz = Class.forName("io.seata.core.rpc.netty.RpcServerHandler");
        Class headContextType = Class.forName("io.netty.channel.ChannelHandlerContext");
        Method channelActiveMethod = rpcServerHandlerClazz.getDeclaredMethod("channelActive", headContextType);
        channelActiveMethod.setAccessible(true);
        java.lang.Object[] channelActiveMethodArguments = new java.lang.Object[1];
        channelActiveMethodArguments[0] = headContext;
        try {
            channelActiveMethod.invoke(rpcServerHandler, channelActiveMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testChannelActive5() throws Throwable  {
        RpcServerHandler rpcServerHandler = ((RpcServerHandler) createInstance("io.seata.core.rpc.netty.RpcServerHandler"));
        Object tailContext = createInstance("io.netty.channel.DefaultChannelPipeline$TailContext");
        setField(tailContext, "inbound", false);
        Object tailContext1 = createInstance("io.netty.channel.DefaultChannelPipeline$TailContext");
        setField(tailContext1, "inbound", false);
        Object tailContext2 = createInstance("io.netty.channel.DefaultChannelPipeline$TailContext");
        setField(tailContext2, "inbound", false);
        Object tailContext3 = createInstance("io.netty.channel.DefaultChannelPipeline$TailContext");
        setField(tailContext3, "inbound", false);
        Object tailContext4 = createInstance("io.netty.channel.DefaultChannelPipeline$TailContext");
        setField(tailContext4, "inbound", true);
        setField(tailContext4, "next", tailContext4);
        setField(tailContext3, "next", tailContext4);
        setField(tailContext2, "next", tailContext3);
        setField(tailContext1, "next", tailContext2);
        setField(tailContext, "next", tailContext1);
        
        Class rpcServerHandlerClazz = Class.forName("io.seata.core.rpc.netty.RpcServerHandler");
        Class tailContextType = Class.forName("io.netty.channel.ChannelHandlerContext");
        Method channelActiveMethod = rpcServerHandlerClazz.getDeclaredMethod("channelActive", tailContextType);
        channelActiveMethod.setAccessible(true);
        java.lang.Object[] channelActiveMethodArguments = new java.lang.Object[1];
        channelActiveMethodArguments[0] = tailContext;
        try {
            channelActiveMethod.invoke(rpcServerHandler, channelActiveMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
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
            
            rpcServerHandler.channelRead(((ChannelHandlerContext) null), null);
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
