package io.seata.core.rpc.netty;

import org.junit.Test;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.timeout.IdleStateEvent;
import java.lang.reflect.Method;
import io.netty.channel.Channel;
import org.slf4j.Logger;
import io.seata.core.protocol.transaction.BranchRegisterRequest;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.commons.pool.impl.GenericKeyedObjectPool.Config;
import org.apache.commons.pool.impl.GenericKeyedObjectPool;
import io.seata.core.model.ResourceManager;
import java.util.LinkedHashMap;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Array;
import java.util.Objects;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Iterator;
import sun.misc.Unsafe;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static java.lang.reflect.Array.get;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class RmRpcClientTest {
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testExceptionCaught1() throws Throwable  {
        RmRpcClient rmRpcClient = ((RmRpcClient) createInstance("io.seata.core.rpc.netty.RmRpcClient"));
        Throwable throwable = new Throwable();
        
        rmRpcClient.exceptionCaught(((ChannelHandlerContext) null), throwable);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testUserEventTriggered1() throws Throwable  {
        RmRpcClient rmRpcClient = ((RmRpcClient) createInstance("io.seata.core.rpc.netty.RmRpcClient"));
        Object object = new Object();
        
        rmRpcClient.userEventTriggered(((ChannelHandlerContext) null), object);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testUserEventTriggered2() throws Throwable  {
        RmRpcClient rmRpcClient = ((RmRpcClient) createInstance("io.seata.core.rpc.netty.RmRpcClient"));
        
        rmRpcClient.userEventTriggered(((ChannelHandlerContext) null), null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testUserEventTriggered3() throws Throwable  {
        RmRpcClient rmRpcClient = ((RmRpcClient) createInstance("io.seata.core.rpc.netty.RmRpcClient"));
        IdleStateEvent idleStateEvent = ((IdleStateEvent) createInstance("io.netty.handler.timeout.IdleStateEvent"));
        
        rmRpcClient.userEventTriggered(((ChannelHandlerContext) null), idleStateEvent);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testConnect1() throws Throwable  {
        RmRpcClient rmRpcClient = ((RmRpcClient) createInstance("io.seata.core.rpc.netty.RmRpcClient"));
        String string = new String();
        
        Class rmRpcClientClazz = Class.forName("io.seata.core.rpc.netty.RmRpcClient");
        Class stringType = Class.forName("java.lang.String");
        Method connectMethod = rmRpcClientClazz.getDeclaredMethod("connect", stringType);
        connectMethod.setAccessible(true);
        java.lang.Object[] connectMethodArguments = new java.lang.Object[1];
        connectMethodArguments[0] = string;
        try {
            connectMethod.invoke(rmRpcClient, connectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testInit1() throws Throwable  {
        RmRpcClient rmRpcClient = ((RmRpcClient) createInstance("io.seata.core.rpc.netty.RmRpcClient"));
        
        rmRpcClient.init();
    }
    ///endregion
    
    
    ///region Errors report for init
    
    public void testInit_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Field security is not found in class java.lang.System
        // 
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testSendResponse1() throws Throwable  {
        RmRpcClient rmRpcClient = ((RmRpcClient) createInstance("io.seata.core.rpc.netty.RmRpcClient"));
        String string = new String();
        Object object = new Object();
        
        rmRpcClient.sendResponse(0L, string, object);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDestroyChannel1() throws Throwable  {
        RmRpcClient rmRpcClient = ((RmRpcClient) createInstance("io.seata.core.rpc.netty.RmRpcClient"));
        String string = new String();
        
        rmRpcClient.destroyChannel(string, ((Channel) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testOnRegisterMsgSuccess1() throws Throwable  {
        RmRpcClient rmRpcClient = ((RmRpcClient) createInstance("io.seata.core.rpc.netty.RmRpcClient"));
        String string = new String();
        Object object = new Object();
        
        rmRpcClient.onRegisterMsgSuccess(string, null, object, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testOnRegisterMsgSuccess2() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(org.slf4j.LoggerFactory.class);
            Logger loggerMock = mock(Logger.class);
            when(loggerMock.isInfoEnabled()).thenReturn(false);
            mockedStatic.when(() -> {
                org.slf4j.LoggerFactory.getLogger(any(Class.class));
            }).thenReturn(loggerMock);
            RmRpcClient rmRpcClient = ((RmRpcClient) createInstance("io.seata.core.rpc.netty.RmRpcClient"));
            String string = new String("");
            setField(rmRpcClient, "customerKeys", string);
            
            rmRpcClient.onRegisterMsgSuccess(null, null, null, null);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testOnRegisterMsgFail1() throws Throwable  {
        RmRpcClient rmRpcClient = ((RmRpcClient) createInstance("io.seata.core.rpc.netty.RmRpcClient"));
        String string = new String();
        Object object = new Object();
        
        rmRpcClient.onRegisterMsgFail(string, null, object, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testOnRegisterMsgFail2() throws Throwable  {
        RmRpcClient rmRpcClient = ((RmRpcClient) createInstance("io.seata.core.rpc.netty.RmRpcClient"));
        String string = new String("");
        Object failedChannel = createInstance("io.netty.bootstrap.FailedChannel");
        BranchRegisterRequest branchRegisterRequest = ((BranchRegisterRequest) createInstance("io.seata.core.protocol.transaction.BranchRegisterRequest"));
        
        Class rmRpcClientClazz = Class.forName("io.seata.core.rpc.netty.RmRpcClient");
        Class stringType = Class.forName("java.lang.String");
        Class failedChannelType = Class.forName("io.netty.channel.Channel");
        Class objectType = Class.forName("java.lang.Object");
        Class branchRegisterRequestType = Class.forName("io.seata.core.protocol.AbstractMessage");
        Method onRegisterMsgFailMethod = rmRpcClientClazz.getDeclaredMethod("onRegisterMsgFail", stringType, failedChannelType, objectType, branchRegisterRequestType);
        onRegisterMsgFailMethod.setAccessible(true);
        java.lang.Object[] onRegisterMsgFailMethodArguments = new java.lang.Object[4];
        onRegisterMsgFailMethodArguments[0] = string;
        onRegisterMsgFailMethodArguments[1] = failedChannel;
        onRegisterMsgFailMethodArguments[2] = null;
        onRegisterMsgFailMethodArguments[3] = branchRegisterRequest;
        try {
            onRegisterMsgFailMethod.invoke(rmRpcClient, onRegisterMsgFailMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testSendMsgWithResponse1() throws Throwable  {
        RmRpcClient rmRpcClient = ((RmRpcClient) createInstance("io.seata.core.rpc.netty.RmRpcClient"));
        String string = new String();
        Object object = new Object();
        
        rmRpcClient.sendMsgWithResponse(string, object, 0L);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testSendMsgWithResponse2() throws Throwable  {
        RmRpcClient rmRpcClient = ((RmRpcClient) createInstance("io.seata.core.rpc.netty.RmRpcClient"));
        ConcurrentHashMap concurrentHashMap = ((ConcurrentHashMap) createInstance("java.util.concurrent.ConcurrentHashMap"));
        java.lang.Object[] nodeArray = createArray("java.util.concurrent.ConcurrentHashMap$Node", 9);
        setField(concurrentHashMap, "table", nodeArray);
        setField(rmRpcClient, "channels", concurrentHashMap);
        String string = new String("");
        
        Object rmRpcClientChannels = getFieldValue(rmRpcClient, "channels");
        Object rmRpcClientChannelsChannelsTable = getFieldValue(rmRpcClientChannels, "table");
        Object initialRmRpcClientChannelsTable0 = get(rmRpcClientChannelsChannelsTable, 0);
        Object rmRpcClientChannels1 = getFieldValue(rmRpcClient, "channels");
        Object rmRpcClientChannels1ChannelsTable = getFieldValue(rmRpcClientChannels1, "table");
        Object initialRmRpcClientChannelsTable1 = get(rmRpcClientChannels1ChannelsTable, 1);
        Object rmRpcClientChannels2 = getFieldValue(rmRpcClient, "channels");
        Object rmRpcClientChannels2ChannelsTable = getFieldValue(rmRpcClientChannels2, "table");
        Object initialRmRpcClientChannelsTable2 = get(rmRpcClientChannels2ChannelsTable, 2);
        Object rmRpcClientChannels3 = getFieldValue(rmRpcClient, "channels");
        Object rmRpcClientChannels3ChannelsTable = getFieldValue(rmRpcClientChannels3, "table");
        Object initialRmRpcClientChannelsTable3 = get(rmRpcClientChannels3ChannelsTable, 3);
        Object rmRpcClientChannels4 = getFieldValue(rmRpcClient, "channels");
        Object rmRpcClientChannels4ChannelsTable = getFieldValue(rmRpcClientChannels4, "table");
        Object initialRmRpcClientChannelsTable4 = get(rmRpcClientChannels4ChannelsTable, 4);
        Object rmRpcClientChannels5 = getFieldValue(rmRpcClient, "channels");
        Object rmRpcClientChannels5ChannelsTable = getFieldValue(rmRpcClientChannels5, "table");
        Object initialRmRpcClientChannelsTable5 = get(rmRpcClientChannels5ChannelsTable, 5);
        Object rmRpcClientChannels6 = getFieldValue(rmRpcClient, "channels");
        Object rmRpcClientChannels6ChannelsTable = getFieldValue(rmRpcClientChannels6, "table");
        Object initialRmRpcClientChannelsTable6 = get(rmRpcClientChannels6ChannelsTable, 6);
        Object rmRpcClientChannels7 = getFieldValue(rmRpcClient, "channels");
        Object rmRpcClientChannels7ChannelsTable = getFieldValue(rmRpcClientChannels7, "table");
        Object initialRmRpcClientChannelsTable7 = get(rmRpcClientChannels7ChannelsTable, 7);
        Object rmRpcClientChannels8 = getFieldValue(rmRpcClient, "channels");
        Object rmRpcClientChannels8ChannelsTable = getFieldValue(rmRpcClientChannels8, "table");
        Object initialRmRpcClientChannelsTable8 = get(rmRpcClientChannels8ChannelsTable, 8);
        
        rmRpcClient.sendMsgWithResponse(string, null, 0L);
        
        Object rmRpcClientChannels9 = getFieldValue(rmRpcClient, "channels");
        Object rmRpcClientChannels9ChannelsTable = getFieldValue(rmRpcClientChannels9, "table");
        Object finalRmRpcClientChannelsTable0 = get(rmRpcClientChannels9ChannelsTable, 0);
        Object rmRpcClientChannels10 = getFieldValue(rmRpcClient, "channels");
        Object rmRpcClientChannels10ChannelsTable = getFieldValue(rmRpcClientChannels10, "table");
        Object finalRmRpcClientChannelsTable1 = get(rmRpcClientChannels10ChannelsTable, 1);
        Object rmRpcClientChannels11 = getFieldValue(rmRpcClient, "channels");
        Object rmRpcClientChannels11ChannelsTable = getFieldValue(rmRpcClientChannels11, "table");
        Object finalRmRpcClientChannelsTable2 = get(rmRpcClientChannels11ChannelsTable, 2);
        Object rmRpcClientChannels12 = getFieldValue(rmRpcClient, "channels");
        Object rmRpcClientChannels12ChannelsTable = getFieldValue(rmRpcClientChannels12, "table");
        Object finalRmRpcClientChannelsTable3 = get(rmRpcClientChannels12ChannelsTable, 3);
        Object rmRpcClientChannels13 = getFieldValue(rmRpcClient, "channels");
        Object rmRpcClientChannels13ChannelsTable = getFieldValue(rmRpcClientChannels13, "table");
        Object finalRmRpcClientChannelsTable4 = get(rmRpcClientChannels13ChannelsTable, 4);
        Object rmRpcClientChannels14 = getFieldValue(rmRpcClient, "channels");
        Object rmRpcClientChannels14ChannelsTable = getFieldValue(rmRpcClientChannels14, "table");
        Object finalRmRpcClientChannelsTable5 = get(rmRpcClientChannels14ChannelsTable, 5);
        Object rmRpcClientChannels15 = getFieldValue(rmRpcClient, "channels");
        Object rmRpcClientChannels15ChannelsTable = getFieldValue(rmRpcClientChannels15, "table");
        Object finalRmRpcClientChannelsTable6 = get(rmRpcClientChannels15ChannelsTable, 6);
        Object rmRpcClientChannels16 = getFieldValue(rmRpcClient, "channels");
        Object rmRpcClientChannels16ChannelsTable = getFieldValue(rmRpcClientChannels16, "table");
        Object finalRmRpcClientChannelsTable7 = get(rmRpcClientChannels16ChannelsTable, 7);
        Object rmRpcClientChannels17 = getFieldValue(rmRpcClient, "channels");
        Object rmRpcClientChannels17ChannelsTable = getFieldValue(rmRpcClientChannels17, "table");
        Object finalRmRpcClientChannelsTable8 = get(rmRpcClientChannels17ChannelsTable, 8);
        
        assertNull(finalRmRpcClientChannelsTable0);
        
        assertNull(finalRmRpcClientChannelsTable1);
        
        assertNull(finalRmRpcClientChannelsTable2);
        
        assertNull(finalRmRpcClientChannelsTable3);
        
        assertNull(finalRmRpcClientChannelsTable4);
        
        assertNull(finalRmRpcClientChannelsTable5);
        
        assertNull(finalRmRpcClientChannelsTable6);
        
        assertNull(finalRmRpcClientChannelsTable7);
        
        assertNull(finalRmRpcClientChannelsTable8);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetNettyPoolConfig1() throws Throwable  {
        RmRpcClient rmRpcClient = ((RmRpcClient) createInstance("io.seata.core.rpc.netty.RmRpcClient"));
        
        Class rmRpcClientClazz = Class.forName("io.seata.core.rpc.netty.RmRpcClient");
        Method getNettyPoolConfigMethod = rmRpcClientClazz.getDeclaredMethod("getNettyPoolConfig");
        getNettyPoolConfigMethod.setAccessible(true);
        java.lang.Object[] getNettyPoolConfigMethodArguments = new java.lang.Object[0];
        try {
            getNettyPoolConfigMethod.invoke(rmRpcClient, getNettyPoolConfigMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetNettyPoolConfig2() throws Throwable  {
        RmRpcClient rmRpcClient = ((RmRpcClient) createInstance("io.seata.core.rpc.netty.RmRpcClient"));
        NettyClientConfig nettyClientConfig = ((NettyClientConfig) createInstance("io.seata.core.rpc.netty.NettyClientConfig"));
        setField(rmRpcClient, "rmClientConfig", nettyClientConfig);
        
        Class rmRpcClientClazz = Class.forName("io.seata.core.rpc.netty.RmRpcClient");
        Method getNettyPoolConfigMethod = rmRpcClientClazz.getDeclaredMethod("getNettyPoolConfig");
        getNettyPoolConfigMethod.setAccessible(true);
        java.lang.Object[] getNettyPoolConfigMethodArguments = new java.lang.Object[0];
        GenericKeyedObjectPool.Config actual = ((GenericKeyedObjectPool.Config) getNettyPoolConfigMethod.invoke(rmRpcClient, getNettyPoolConfigMethodArguments));
        
        GenericKeyedObjectPool.Config expected = ((GenericKeyedObjectPool.Config) createInstance("org.apache.commons.pool.impl.GenericKeyedObjectPool$Config"));
        expected.lifo = true;
        expected.minEvictableIdleTimeMillis = 1800000L;
        expected.numTestsPerEvictionRun = 3;
        expected.timeBetweenEvictionRunsMillis = -1L;
        expected.testWhileIdle = false;
        expected.testOnReturn = true;
        expected.testOnBorrow = true;
        expected.whenExhaustedAction = (byte) 1;
        expected.maxWait = 60000L;
        expected.minIdle = 0;
        expected.maxTotal = -1;
        expected.maxActive = 1;
        expected.maxIdle = 8;
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReleaseChannel1() throws Throwable  {
        RmRpcClient rmRpcClient = ((RmRpcClient) createInstance("io.seata.core.rpc.netty.RmRpcClient"));
        String string = new String();
        
        Class rmRpcClientClazz = Class.forName("io.seata.core.rpc.netty.RmRpcClient");
        Class channelType = Class.forName("io.netty.channel.Channel");
        Class stringType = Class.forName("java.lang.String");
        Method releaseChannelMethod = rmRpcClientClazz.getDeclaredMethod("releaseChannel", channelType, stringType);
        releaseChannelMethod.setAccessible(true);
        java.lang.Object[] releaseChannelMethodArguments = new java.lang.Object[2];
        releaseChannelMethodArguments[0] = null;
        releaseChannelMethodArguments[1] = string;
        releaseChannelMethod.invoke(rmRpcClient, releaseChannelMethodArguments);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReleaseChannel2() throws Throwable  {
        RmRpcClient rmRpcClient = ((RmRpcClient) createInstance("io.seata.core.rpc.netty.RmRpcClient"));
        Object failedChannel = createInstance("io.netty.bootstrap.FailedChannel");
        
        Class rmRpcClientClazz = Class.forName("io.seata.core.rpc.netty.RmRpcClient");
        Class failedChannelType = Class.forName("io.netty.channel.Channel");
        Class stringType = Class.forName("java.lang.String");
        Method releaseChannelMethod = rmRpcClientClazz.getDeclaredMethod("releaseChannel", failedChannelType, stringType);
        releaseChannelMethod.setAccessible(true);
        java.lang.Object[] releaseChannelMethodArguments = new java.lang.Object[2];
        releaseChannelMethodArguments[0] = failedChannel;
        releaseChannelMethodArguments[1] = null;
        releaseChannelMethod.invoke(rmRpcClient, releaseChannelMethodArguments);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReleaseChannel3() throws Throwable  {
        Class runtimeClazz = Class.forName("java.lang.Runtime");
        Runtime prevCurrentRuntime = ((Runtime) getStaticFieldValue(runtimeClazz, "currentRuntime"));
        try {
            Runtime currentRuntime = ((Runtime) createInstance("java.lang.Runtime"));
            setStaticField(runtimeClazz, "currentRuntime", currentRuntime);
            RmRpcClient rmRpcClient = ((RmRpcClient) createInstance("io.seata.core.rpc.netty.RmRpcClient"));
            ConcurrentHashMap concurrentHashMap = ((ConcurrentHashMap) createInstance("java.util.concurrent.ConcurrentHashMap"));
            java.lang.Object[] nodeArray = createArray("java.util.concurrent.ConcurrentHashMap$Node", 9);
            setField(concurrentHashMap, "table", nodeArray);
            setField(rmRpcClient, "channelLocks", concurrentHashMap);
            Object failedChannel = createInstance("io.netty.bootstrap.FailedChannel");
            String string = new String("");
            
            Object rmRpcClientChannelLocks = getFieldValue(rmRpcClient, "channelLocks");
            Object rmRpcClientChannelLocksChannelLocksTable = getFieldValue(rmRpcClientChannelLocks, "table");
            Object initialRmRpcClientChannelLocksTable0 = get(rmRpcClientChannelLocksChannelLocksTable, 0);
            Object rmRpcClientChannelLocks1 = getFieldValue(rmRpcClient, "channelLocks");
            Object rmRpcClientChannelLocks1ChannelLocksTable = getFieldValue(rmRpcClientChannelLocks1, "table");
            Object initialRmRpcClientChannelLocksTable1 = get(rmRpcClientChannelLocks1ChannelLocksTable, 1);
            Object rmRpcClientChannelLocks2 = getFieldValue(rmRpcClient, "channelLocks");
            Object rmRpcClientChannelLocks2ChannelLocksTable = getFieldValue(rmRpcClientChannelLocks2, "table");
            Object initialRmRpcClientChannelLocksTable2 = get(rmRpcClientChannelLocks2ChannelLocksTable, 2);
            Object rmRpcClientChannelLocks3 = getFieldValue(rmRpcClient, "channelLocks");
            Object rmRpcClientChannelLocks3ChannelLocksTable = getFieldValue(rmRpcClientChannelLocks3, "table");
            Object initialRmRpcClientChannelLocksTable3 = get(rmRpcClientChannelLocks3ChannelLocksTable, 3);
            Object rmRpcClientChannelLocks4 = getFieldValue(rmRpcClient, "channelLocks");
            Object rmRpcClientChannelLocks4ChannelLocksTable = getFieldValue(rmRpcClientChannelLocks4, "table");
            Object initialRmRpcClientChannelLocksTable4 = get(rmRpcClientChannelLocks4ChannelLocksTable, 4);
            Object rmRpcClientChannelLocks5 = getFieldValue(rmRpcClient, "channelLocks");
            Object rmRpcClientChannelLocks5ChannelLocksTable = getFieldValue(rmRpcClientChannelLocks5, "table");
            Object initialRmRpcClientChannelLocksTable5 = get(rmRpcClientChannelLocks5ChannelLocksTable, 5);
            Object rmRpcClientChannelLocks6 = getFieldValue(rmRpcClient, "channelLocks");
            Object rmRpcClientChannelLocks6ChannelLocksTable = getFieldValue(rmRpcClientChannelLocks6, "table");
            Object initialRmRpcClientChannelLocksTable6 = get(rmRpcClientChannelLocks6ChannelLocksTable, 6);
            Object rmRpcClientChannelLocks7 = getFieldValue(rmRpcClient, "channelLocks");
            Object rmRpcClientChannelLocks7ChannelLocksTable = getFieldValue(rmRpcClientChannelLocks7, "table");
            Object initialRmRpcClientChannelLocksTable7 = get(rmRpcClientChannelLocks7ChannelLocksTable, 7);
            Object rmRpcClientChannelLocks8 = getFieldValue(rmRpcClient, "channelLocks");
            Object rmRpcClientChannelLocks8ChannelLocksTable = getFieldValue(rmRpcClientChannelLocks8, "table");
            Object initialRmRpcClientChannelLocksTable8 = get(rmRpcClientChannelLocks8ChannelLocksTable, 8);
            
            Class rmRpcClientClazz = Class.forName("io.seata.core.rpc.netty.RmRpcClient");
            Class failedChannelType = Class.forName("io.netty.channel.Channel");
            Class stringType = Class.forName("java.lang.String");
            Method releaseChannelMethod = rmRpcClientClazz.getDeclaredMethod("releaseChannel", failedChannelType, stringType);
            releaseChannelMethod.setAccessible(true);
            java.lang.Object[] releaseChannelMethodArguments = new java.lang.Object[2];
            releaseChannelMethodArguments[0] = failedChannel;
            releaseChannelMethodArguments[1] = string;
            releaseChannelMethod.invoke(rmRpcClient, releaseChannelMethodArguments);
            
            Object rmRpcClientChannelLocks9 = getFieldValue(rmRpcClient, "channelLocks");
            Object rmRpcClientChannelLocks9ChannelLocksTable = getFieldValue(rmRpcClientChannelLocks9, "table");
            Object finalRmRpcClientChannelLocksTable0 = get(rmRpcClientChannelLocks9ChannelLocksTable, 0);
            Object rmRpcClientChannelLocks10 = getFieldValue(rmRpcClient, "channelLocks");
            Object rmRpcClientChannelLocks10ChannelLocksTable = getFieldValue(rmRpcClientChannelLocks10, "table");
            Object finalRmRpcClientChannelLocksTable1 = get(rmRpcClientChannelLocks10ChannelLocksTable, 1);
            Object rmRpcClientChannelLocks11 = getFieldValue(rmRpcClient, "channelLocks");
            Object rmRpcClientChannelLocks11ChannelLocksTable = getFieldValue(rmRpcClientChannelLocks11, "table");
            Object finalRmRpcClientChannelLocksTable2 = get(rmRpcClientChannelLocks11ChannelLocksTable, 2);
            Object rmRpcClientChannelLocks12 = getFieldValue(rmRpcClient, "channelLocks");
            Object rmRpcClientChannelLocks12ChannelLocksTable = getFieldValue(rmRpcClientChannelLocks12, "table");
            Object finalRmRpcClientChannelLocksTable3 = get(rmRpcClientChannelLocks12ChannelLocksTable, 3);
            Object rmRpcClientChannelLocks13 = getFieldValue(rmRpcClient, "channelLocks");
            Object rmRpcClientChannelLocks13ChannelLocksTable = getFieldValue(rmRpcClientChannelLocks13, "table");
            Object finalRmRpcClientChannelLocksTable4 = get(rmRpcClientChannelLocks13ChannelLocksTable, 4);
            Object rmRpcClientChannelLocks14 = getFieldValue(rmRpcClient, "channelLocks");
            Object rmRpcClientChannelLocks14ChannelLocksTable = getFieldValue(rmRpcClientChannelLocks14, "table");
            Object finalRmRpcClientChannelLocksTable5 = get(rmRpcClientChannelLocks14ChannelLocksTable, 5);
            Object rmRpcClientChannelLocks15 = getFieldValue(rmRpcClient, "channelLocks");
            Object rmRpcClientChannelLocks15ChannelLocksTable = getFieldValue(rmRpcClientChannelLocks15, "table");
            Object finalRmRpcClientChannelLocksTable6 = get(rmRpcClientChannelLocks15ChannelLocksTable, 6);
            Object rmRpcClientChannelLocks16 = getFieldValue(rmRpcClient, "channelLocks");
            Object rmRpcClientChannelLocks16ChannelLocksTable = getFieldValue(rmRpcClientChannelLocks16, "table");
            Object finalRmRpcClientChannelLocksTable7 = get(rmRpcClientChannelLocks16ChannelLocksTable, 7);
            Object rmRpcClientChannelLocks17 = getFieldValue(rmRpcClient, "channelLocks");
            Object rmRpcClientChannelLocks17ChannelLocksTable = getFieldValue(rmRpcClientChannelLocks17, "table");
            Object finalRmRpcClientChannelLocksTable8 = get(rmRpcClientChannelLocks17ChannelLocksTable, 8);
            
            assertNull(finalRmRpcClientChannelLocksTable0);
            
            assertNull(finalRmRpcClientChannelLocksTable1);
            
            assertNull(finalRmRpcClientChannelLocksTable2);
            
            assertNull(finalRmRpcClientChannelLocksTable3);
            
            assertNull(finalRmRpcClientChannelLocksTable4);
            
            assertNull(finalRmRpcClientChannelLocksTable5);
            
            assertNull(finalRmRpcClientChannelLocksTable6);
            
            assertNull(finalRmRpcClientChannelLocksTable7);
            
            assertNull(finalRmRpcClientChannelLocksTable8);
        } finally {
            setStaticField(Runtime.class, "currentRuntime", prevCurrentRuntime);
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetResourceManager1() throws Throwable  {
        RmRpcClient rmRpcClient = ((RmRpcClient) createInstance("io.seata.core.rpc.netty.RmRpcClient"));
        
        rmRpcClient.setResourceManager(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetResourceManager2() throws Throwable  {
        RmRpcClient rmRpcClient = ((RmRpcClient) createInstance("io.seata.core.rpc.netty.RmRpcClient"));
        setField(rmRpcClient, "resourceManager", null);
        
        rmRpcClient.setResourceManager(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetApplicationId1() throws Throwable  {
        RmRpcClient rmRpcClient = ((RmRpcClient) createInstance("io.seata.core.rpc.netty.RmRpcClient"));
        String string = new String();
        
        rmRpcClient.setApplicationId(string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetApplicationId2() throws Throwable  {
        RmRpcClient rmRpcClient = ((RmRpcClient) createInstance("io.seata.core.rpc.netty.RmRpcClient"));
        setField(rmRpcClient, "applicationId", null);
        
        rmRpcClient.setApplicationId(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetTransactionServiceGroup1() throws Throwable  {
        RmRpcClient rmRpcClient = ((RmRpcClient) createInstance("io.seata.core.rpc.netty.RmRpcClient"));
        String string = new String();
        
        rmRpcClient.setTransactionServiceGroup(string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetTransactionServiceGroup2() throws Throwable  {
        RmRpcClient rmRpcClient = ((RmRpcClient) createInstance("io.seata.core.rpc.netty.RmRpcClient"));
        setField(rmRpcClient, "transactionServiceGroup", null);
        
        rmRpcClient.setTransactionServiceGroup(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDoConnect1() throws Throwable  {
        RmRpcClient rmRpcClient = ((RmRpcClient) createInstance("io.seata.core.rpc.netty.RmRpcClient"));
        String string = new String();
        
        Class rmRpcClientClazz = Class.forName("io.seata.core.rpc.netty.RmRpcClient");
        Class stringType = Class.forName("java.lang.String");
        Method doConnectMethod = rmRpcClientClazz.getDeclaredMethod("doConnect", stringType);
        doConnectMethod.setAccessible(true);
        java.lang.Object[] doConnectMethodArguments = new java.lang.Object[1];
        doConnectMethodArguments[0] = string;
        try {
            doConnectMethod.invoke(rmRpcClient, doConnectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDoConnect2() throws Throwable  {
        Class runtimeClazz = Class.forName("java.lang.Runtime");
        Runtime prevCurrentRuntime = ((Runtime) getStaticFieldValue(runtimeClazz, "currentRuntime"));
        try {
            Runtime currentRuntime = ((Runtime) createInstance("java.lang.Runtime"));
            setStaticField(runtimeClazz, "currentRuntime", currentRuntime);
            RmRpcClient rmRpcClient = ((RmRpcClient) createInstance("io.seata.core.rpc.netty.RmRpcClient"));
            ConcurrentHashMap concurrentHashMap = ((ConcurrentHashMap) createInstance("java.util.concurrent.ConcurrentHashMap"));
            java.lang.Object[] nodeArray = createArray("java.util.concurrent.ConcurrentHashMap$Node", 1);
            setField(concurrentHashMap, "table", nodeArray);
            setField(rmRpcClient, "channels", concurrentHashMap);
            String string = new String("");
            
            Object rmRpcClientChannels = getFieldValue(rmRpcClient, "channels");
            Object rmRpcClientChannelsChannelsTable = getFieldValue(rmRpcClientChannels, "table");
            Object initialRmRpcClientChannelsTable0 = get(rmRpcClientChannelsChannelsTable, 0);
            
            Class rmRpcClientClazz = Class.forName("io.seata.core.rpc.netty.RmRpcClient");
            Class stringType = Class.forName("java.lang.String");
            Method doConnectMethod = rmRpcClientClazz.getDeclaredMethod("doConnect", stringType);
            doConnectMethod.setAccessible(true);
            java.lang.Object[] doConnectMethodArguments = new java.lang.Object[1];
            doConnectMethodArguments[0] = string;
            try {
                doConnectMethod.invoke(rmRpcClient, doConnectMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            Object rmRpcClientChannels1 = getFieldValue(rmRpcClient, "channels");
            Object rmRpcClientChannels1ChannelsTable = getFieldValue(rmRpcClientChannels1, "table");
            Object finalRmRpcClientChannelsTable0 = get(rmRpcClientChannels1ChannelsTable, 0);
            
            assertNull(finalRmRpcClientChannelsTable0);
        } finally {
            setStaticField(Runtime.class, "currentRuntime", prevCurrentRuntime);
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetExistAliveChannel1() throws Throwable  {
        RmRpcClient rmRpcClient = ((RmRpcClient) createInstance("io.seata.core.rpc.netty.RmRpcClient"));
        String string = new String();
        
        Class rmRpcClientClazz = Class.forName("io.seata.core.rpc.netty.RmRpcClient");
        Class channelType = Class.forName("io.netty.channel.Channel");
        Class stringType = Class.forName("java.lang.String");
        Method getExistAliveChannelMethod = rmRpcClientClazz.getDeclaredMethod("getExistAliveChannel", channelType, stringType);
        getExistAliveChannelMethod.setAccessible(true);
        java.lang.Object[] getExistAliveChannelMethodArguments = new java.lang.Object[2];
        getExistAliveChannelMethodArguments[0] = null;
        getExistAliveChannelMethodArguments[1] = string;
        try {
            getExistAliveChannelMethod.invoke(rmRpcClient, getExistAliveChannelMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetExistAliveChannel2() throws Throwable  {
        RmRpcClient rmRpcClient = ((RmRpcClient) createInstance("io.seata.core.rpc.netty.RmRpcClient"));
        
        Class rmRpcClientClazz = Class.forName("io.seata.core.rpc.netty.RmRpcClient");
        Class channelType = Class.forName("io.netty.channel.Channel");
        Class stringType = Class.forName("java.lang.String");
        Method getExistAliveChannelMethod = rmRpcClientClazz.getDeclaredMethod("getExistAliveChannel", channelType, stringType);
        getExistAliveChannelMethod.setAccessible(true);
        java.lang.Object[] getExistAliveChannelMethodArguments = new java.lang.Object[2];
        getExistAliveChannelMethodArguments[0] = null;
        getExistAliveChannelMethodArguments[1] = null;
        try {
            getExistAliveChannelMethod.invoke(rmRpcClient, getExistAliveChannelMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSendRegisterMessage1() throws Throwable  {
        RmRpcClient rmRpcClient = ((RmRpcClient) createInstance("io.seata.core.rpc.netty.RmRpcClient"));
        String string = new String();
        String string1 = new String();
        
        Class rmRpcClientClazz = Class.forName("io.seata.core.rpc.netty.RmRpcClient");
        Class stringType = Class.forName("java.lang.String");
        Class channelType = Class.forName("io.netty.channel.Channel");
        Method sendRegisterMessageMethod = rmRpcClientClazz.getDeclaredMethod("sendRegisterMessage", stringType, channelType, stringType);
        sendRegisterMessageMethod.setAccessible(true);
        java.lang.Object[] sendRegisterMessageMethodArguments = new java.lang.Object[3];
        sendRegisterMessageMethodArguments[0] = string;
        sendRegisterMessageMethodArguments[1] = null;
        sendRegisterMessageMethodArguments[2] = string1;
        sendRegisterMessageMethod.invoke(rmRpcClient, sendRegisterMessageMethodArguments);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testRegisterResource1() throws Throwable  {
        RmRpcClient rmRpcClient = ((RmRpcClient) createInstance("io.seata.core.rpc.netty.RmRpcClient"));
        String string = new String();
        String string1 = new String();
        
        rmRpcClient.registerResource(string, string1);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetCustomerKeys1() throws Throwable  {
        RmRpcClient rmRpcClient = ((RmRpcClient) createInstance("io.seata.core.rpc.netty.RmRpcClient"));
        
        String actual = rmRpcClient.getCustomerKeys();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetCustomerKeys2() throws Throwable  {
        RmRpcClient rmRpcClient = ((RmRpcClient) createInstance("io.seata.core.rpc.netty.RmRpcClient"));
        setField(rmRpcClient, "customerKeys", null);
        
        String actual = rmRpcClient.getCustomerKeys();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetCustomerKeys1() throws Throwable  {
        RmRpcClient rmRpcClient = ((RmRpcClient) createInstance("io.seata.core.rpc.netty.RmRpcClient"));
        String string = new String();
        
        rmRpcClient.setCustomerKeys(string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetCustomerKeys2() throws Throwable  {
        RmRpcClient rmRpcClient = ((RmRpcClient) createInstance("io.seata.core.rpc.netty.RmRpcClient"));
        setField(rmRpcClient, "customerKeys", null);
        
        rmRpcClient.setCustomerKeys(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetMergedResourceKeys1() throws Throwable  {
        RmRpcClient rmRpcClient = ((RmRpcClient) createInstance("io.seata.core.rpc.netty.RmRpcClient"));
        
        rmRpcClient.getMergedResourceKeys(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetMergedResourceKeys2() throws Throwable  {
        RmRpcClient rmRpcClient = ((RmRpcClient) createInstance("io.seata.core.rpc.netty.RmRpcClient"));
        
        rmRpcClient.getMergedResourceKeys(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetMergedResourceKeys3() throws Throwable  {
        RmRpcClient rmRpcClient = ((RmRpcClient) createInstance("io.seata.core.rpc.netty.RmRpcClient"));
        ResourceManager resourceManagerMock = mock(ResourceManager.class);
        when(resourceManagerMock.getManagedResources()).thenReturn(((Map) null));
        
        rmRpcClient.getMergedResourceKeys(resourceManagerMock);
        
        ResourceManager finalResourceManagerMock = resourceManagerMock;
        
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetMergedResourceKeys4() throws Throwable  {
        RmRpcClient rmRpcClient = ((RmRpcClient) createInstance("io.seata.core.rpc.netty.RmRpcClient"));
        ResourceManager resourceManagerMock = mock(ResourceManager.class);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(null, null);
        when(resourceManagerMock.getManagedResources()).thenReturn(((Map) linkedHashMap));
        
        String actual = rmRpcClient.getMergedResourceKeys(resourceManagerMock);
        
        String expected = new String("null");
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
        
        ResourceManager finalResourceManagerMock = resourceManagerMock;
        
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetInstance1() throws Throwable  {
        String string = new String();
        String string1 = new String();
        
        RmRpcClient.getInstance(string, string1);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetInstance2() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            Class rmRpcClientClazz = Class.forName("io.seata.core.rpc.netty.RmRpcClient");
            RmRpcClient prevInstance = ((RmRpcClient) getStaticFieldValue(rmRpcClientClazz, "instance"));
            try {
                RmRpcClient instance = ((RmRpcClient) createInstance("io.seata.core.rpc.netty.RmRpcClient"));
                setField(instance, "transactionServiceGroup", null);
                setField(instance, "applicationId", null);
                setStaticField(rmRpcClientClazz, "instance", instance);
                mockedStatic = mockStatic(org.slf4j.LoggerFactory.class);
                Logger loggerMock = mock(Logger.class);
                mockedStatic.when(() -> {
                    org.slf4j.LoggerFactory.getLogger(any(Class.class));
                }).thenReturn(loggerMock);
                
                RmRpcClient actual = RmRpcClient.getInstance(null, null);
                
                
                // Current deep equals depth exceeds max depth 0
                assertTrue(deepEquals(instance, actual));
            } finally {
                setStaticField(RmRpcClient.class, "instance", prevInstance);
            }
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetInstance3() throws Throwable  {
        RmRpcClient.getInstance();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetInstance4() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            Class rmRpcClientClazz = Class.forName("io.seata.core.rpc.netty.RmRpcClient");
            RmRpcClient prevInstance = ((RmRpcClient) getStaticFieldValue(rmRpcClientClazz, "instance"));
            try {
                RmRpcClient instance = ((RmRpcClient) createInstance("io.seata.core.rpc.netty.RmRpcClient"));
                setStaticField(rmRpcClientClazz, "instance", instance);
                mockedStatic = mockStatic(org.slf4j.LoggerFactory.class);
                Logger loggerMock = mock(Logger.class);
                mockedStatic.when(() -> {
                    org.slf4j.LoggerFactory.getLogger(any(Class.class));
                }).thenReturn(loggerMock);
                
                RmRpcClient actual = RmRpcClient.getInstance();
                
                
                // Current deep equals depth exceeds max depth 0
                assertTrue(deepEquals(instance, actual));
            } finally {
                setStaticField(RmRpcClient.class, "instance", prevInstance);
            }
        } finally {
            mockedStatic.close();
        }
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
    static class FieldsPair {
        final Object o1;
        final Object o2;
    
        public FieldsPair(Object o1, Object o2) {
            this.o1 = o1;
            this.o2 = o2;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            FieldsPair that = (FieldsPair) o;
            return Objects.equals(o1, that.o1) && Objects.equals(o2, that.o2);
        }
    
        @Override
        public int hashCode() {
            return Objects.hash(o1, o2);
        }
    }
    
    private boolean deepEquals(Object o1, Object o2) {
        try {
            return deepEquals(o1, o2, new HashSet<>());
        } catch (Throwable t) {
            return true;
        }
    }
    
    private boolean deepEquals(Object o1, Object o2, Set<FieldsPair> visited) {
        visited.add(new FieldsPair(o1, o2));
    
        if (o1 == o2) {
            return true;
        }
    
        if (o1 == null || o2 == null) {
            return false;
        }
    
        if (o1 instanceof Iterable) {
            if (!(o2 instanceof Iterable)) {
                return false;
            }
    
            return iterablesDeepEquals((Iterable<?>) o1, (Iterable<?>) o2, visited);
        }
        
        if (o2 instanceof Iterable) {
            return false;
        }
    
        if (o1 instanceof Map) {
            if (!(o2 instanceof Map)) {
                return false;
            }
    
            return mapsDeepEquals((Map<?, ?>) o1, (Map<?, ?>) o2, visited);
        }
        
        if (o2 instanceof Map) {
            return false;
        }
    
        Class<?> firstClass = o1.getClass();
        if (firstClass.isArray()) {
            if (!o2.getClass().isArray()) {
                return false;
            }
    
            // Primitive arrays should not appear here
            return arraysDeepEquals(o1, o2, visited);
        }
    
        // common classes
    
        // common classes without custom equals, use comparison by fields
        final List<java.lang.reflect.Field> fields = new ArrayList<>();
        while (firstClass != Object.class) {
            fields.addAll(Arrays.asList(firstClass.getDeclaredFields()));
            // Interface should not appear here
            firstClass = firstClass.getSuperclass();
        }
    
        for (java.lang.reflect.Field field : fields) {
            field.setAccessible(true);
            try {
                final Object field1 = field.get(o1);
                final Object field2 = field.get(o2);
                if (!visited.contains(new FieldsPair(field1, field2)) && !deepEquals(field1, field2, visited)) {
                    return false;
                }
            } catch (IllegalArgumentException e) {
                return false;
            } catch (IllegalAccessException e) {
                // should never occur because field was set accessible
                return false;
            }
        }
    
        return true;
    }
    private boolean arraysDeepEquals(Object arr1, Object arr2, Set<FieldsPair> visited) {
        final int length = Array.getLength(arr1);
        if (length != Array.getLength(arr2)) {
            return false;
        }
    
        for (int i = 0; i < length; i++) {
            if (!deepEquals(Array.get(arr1, i), Array.get(arr2, i), visited)) {
                return false;
            }
        }
    
        return true;
    }
    private boolean iterablesDeepEquals(Iterable<?> i1, Iterable<?> i2, Set<FieldsPair> visited) {
        final Iterator<?> firstIterator = i1.iterator();
        final Iterator<?> secondIterator = i2.iterator();
        while (firstIterator.hasNext() && secondIterator.hasNext()) {
            if (!deepEquals(firstIterator.next(), secondIterator.next(), visited)) {
                return false;
            }
        }
    
        if (firstIterator.hasNext()) {
            return false;
        }
    
        return !secondIterator.hasNext();
    }
    private boolean mapsDeepEquals(Map<?, ?> m1, Map<?, ?> m2, Set<FieldsPair> visited) {
        final Iterator<? extends Map.Entry<?, ?>> firstIterator = m1.entrySet().iterator();
        final Iterator<? extends Map.Entry<?, ?>> secondIterator = m2.entrySet().iterator();
        while (firstIterator.hasNext() && secondIterator.hasNext()) {
            final Map.Entry<?, ?> firstEntry = firstIterator.next();
            final Map.Entry<?, ?> secondEntry = secondIterator.next();
    
            if (!deepEquals(firstEntry.getKey(), secondEntry.getKey(), visited)) {
                return false;
            }
    
            if (!deepEquals(firstEntry.getValue(), secondEntry.getValue(), visited)) {
                return false;
            }
        }
    
        if (firstIterator.hasNext()) {
            return false;
        }
    
        return !secondIterator.hasNext();
    }
    private boolean hasCustomEquals(Class<?> clazz) {
        while (!Object.class.equals(clazz)) {
            try {
                clazz.getDeclaredMethod("equals", Object.class);
                return true;
            } catch (Exception e) { 
                // Interface should not appear here
                clazz = clazz.getSuperclass();
            }
        }
    
        return false;
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
