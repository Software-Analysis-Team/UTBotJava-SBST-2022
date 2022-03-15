package io.seata.core.rpc.netty;

import org.junit.Test;
import io.netty.channel.ChannelHandlerContext;
import io.netty.util.concurrent.DefaultEventExecutor;
import io.netty.channel.DefaultChannelPipeline;
import java.lang.reflect.Method;
import io.netty.util.concurrent.GlobalEventExecutor;
import org.slf4j.Logger;
import io.netty.channel.ChannelOutboundHandlerAdapter;
import io.netty.channel.nio.NioEventLoop;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
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
    public void testExceptionCaught4() throws Throwable  {
        RpcServerHandler rpcServerHandler = ((RpcServerHandler) createInstance("io.seata.core.rpc.netty.RpcServerHandler"));
        Object tailContext = createInstance("io.netty.channel.DefaultChannelPipeline$TailContext");
        GlobalEventExecutor globalEventExecutor = ((GlobalEventExecutor) createInstance("io.netty.util.concurrent.GlobalEventExecutor"));
        setField(globalEventExecutor, "thread", null);
        setField(tailContext, "executor", globalEventExecutor);
        DefaultChannelPipeline defaultChannelPipeline = ((DefaultChannelPipeline) createInstance("io.netty.channel.DefaultChannelPipeline"));
        Object failedChannel = createInstance("io.netty.bootstrap.FailedChannel");
        setField(defaultChannelPipeline, "channel", failedChannel);
        setField(tailContext, "pipeline", defaultChannelPipeline);
        setField(tailContext, "outbound", false);
        Object tailContext1 = createInstance("io.netty.channel.DefaultChannelPipeline$TailContext");
        setField(tailContext1, "executor", null);
        setField(tailContext1, "pipeline", null);
        setField(tailContext1, "outbound", false);
        Object tailContext2 = createInstance("io.netty.channel.DefaultChannelPipeline$TailContext");
        setField(tailContext2, "executor", null);
        setField(tailContext2, "pipeline", null);
        setField(tailContext2, "outbound", false);
        Object tailContext3 = createInstance("io.netty.channel.DefaultChannelPipeline$TailContext");
        setField(tailContext3, "executor", globalEventExecutor);
        setField(tailContext3, "pipeline", null);
        setField(tailContext3, "outbound", true);
        setField(tailContext3, "prev", null);
        setField(tailContext2, "prev", tailContext3);
        setField(tailContext1, "prev", tailContext2);
        setField(tailContext, "prev", tailContext1);
        
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
    public void testExceptionCaught5() throws Throwable  {
        RpcServerHandler rpcServerHandler = ((RpcServerHandler) createInstance("io.seata.core.rpc.netty.RpcServerHandler"));
        Object tailContext = createInstance("io.netty.channel.DefaultChannelPipeline$TailContext");
        DefaultEventExecutor defaultEventExecutor = ((DefaultEventExecutor) createInstance("io.netty.util.concurrent.DefaultEventExecutor"));
        setField(tailContext, "executor", defaultEventExecutor);
        DefaultChannelPipeline defaultChannelPipeline = ((DefaultChannelPipeline) createInstance("io.netty.channel.DefaultChannelPipeline"));
        Object failedChannel = createInstance("io.netty.bootstrap.FailedChannel");
        setField(defaultChannelPipeline, "channel", failedChannel);
        setField(tailContext, "pipeline", defaultChannelPipeline);
        setField(tailContext, "outbound", false);
        Object tailContext1 = createInstance("io.netty.channel.DefaultChannelPipeline$TailContext");
        setField(tailContext1, "executor", null);
        setField(tailContext1, "pipeline", null);
        setField(tailContext1, "outbound", false);
        Object tailContext2 = createInstance("io.netty.channel.DefaultChannelPipeline$TailContext");
        setField(tailContext2, "executor", defaultEventExecutor);
        setField(tailContext2, "pipeline", null);
        setField(tailContext2, "outbound", true);
        setField(tailContext2, "prev", null);
        setField(tailContext1, "prev", tailContext2);
        setField(tailContext, "prev", tailContext1);
        
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
        
        rpcServerHandler.userEventTriggered(((ChannelHandlerContext) null), null);
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
        setField(tailContext, "inbound", false);
        Object defaultChannelHandlerContext = createInstance("io.netty.channel.DefaultChannelHandlerContext");
        setField(defaultChannelHandlerContext, "handlerState", 2);
        GlobalEventExecutor globalEventExecutor = ((GlobalEventExecutor) createInstance("io.netty.util.concurrent.GlobalEventExecutor"));
        Thread thread = ((Thread) createInstance("java.lang.Thread"));
        setField(globalEventExecutor, "thread", thread);
        setField(defaultChannelHandlerContext, "executor", globalEventExecutor);
        setField(defaultChannelHandlerContext, "inbound", true);
        setField(defaultChannelHandlerContext, "next", null);
        ChannelOutboundHandlerAdapter channelOutboundHandlerAdapter = ((ChannelOutboundHandlerAdapter) createInstance("io.netty.channel.ChannelOutboundHandlerAdapter"));
        setField(defaultChannelHandlerContext, "handler", channelOutboundHandlerAdapter);
        setField(tailContext, "next", defaultChannelHandlerContext);
        
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
        Object tailContext = createInstance("io.netty.channel.DefaultChannelPipeline$TailContext");
        setField(tailContext, "executor", null);
        setField(tailContext, "inbound", false);
        Object headContext = createInstance("io.netty.channel.DefaultChannelPipeline$HeadContext");
        setField(headContext, "executor", null);
        setField(headContext, "inbound", false);
        Object tailContext1 = createInstance("io.netty.channel.DefaultChannelPipeline$TailContext");
        NioEventLoop nioEventLoop = ((NioEventLoop) createInstance("io.netty.channel.nio.NioEventLoop"));
        setField(tailContext1, "executor", nioEventLoop);
        setField(tailContext1, "inbound", true);
        setField(tailContext1, "next", null);
        setField(headContext, "next", tailContext1);
        setField(tailContext, "next", headContext);
        
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
    public void testChannelActive5() throws Throwable  {
        RpcServerHandler rpcServerHandler = ((RpcServerHandler) createInstance("io.seata.core.rpc.netty.RpcServerHandler"));
        Object defaultChannelHandlerContext = createInstance("io.netty.channel.DefaultChannelHandlerContext");
        setField(defaultChannelHandlerContext, "inbound", false);
        Object tailContext = createInstance("io.netty.channel.DefaultChannelPipeline$TailContext");
        setField(tailContext, "inbound", true);
        Object tailContext1 = createInstance("io.netty.channel.DefaultChannelPipeline$TailContext");
        setField(tailContext1, "inbound", false);
        setField(tailContext1, "next", null);
        setField(tailContext, "next", tailContext1);
        setField(defaultChannelHandlerContext, "next", tailContext);
        
        Class rpcServerHandlerClazz = Class.forName("io.seata.core.rpc.netty.RpcServerHandler");
        Class defaultChannelHandlerContextType = Class.forName("io.netty.channel.ChannelHandlerContext");
        Method channelActiveMethod = rpcServerHandlerClazz.getDeclaredMethod("channelActive", defaultChannelHandlerContextType);
        channelActiveMethod.setAccessible(true);
        java.lang.Object[] channelActiveMethodArguments = new java.lang.Object[1];
        channelActiveMethodArguments[0] = defaultChannelHandlerContext;
        try {
            channelActiveMethod.invoke(rpcServerHandler, channelActiveMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
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
    private static sun.misc.Unsafe getUnsafeInstance() throws Exception {
        java.lang.reflect.Field f = sun.misc.Unsafe.class.getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return (sun.misc.Unsafe) f.get(null);
    }
}
