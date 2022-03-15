package io.seata.core.rpc.netty;

import org.junit.Test;
import io.netty.channel.ChannelHandlerContext;
import java.lang.reflect.Method;
import io.netty.channel.Channel;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.commons.pool.impl.GenericKeyedObjectPool;
import org.slf4j.Logger;
import io.seata.core.protocol.AbstractMessage;
import io.seata.core.protocol.RegisterRMResponse;
import io.seata.discovery.registry.RegistryService;
import java.util.ArrayList;
import io.seata.discovery.loadbalance.LoadBalance;
import org.apache.commons.pool.impl.GenericKeyedObjectPool.Config;
import io.seata.core.rpc.netty.NettyPoolKey.TransactionRole;
import io.seata.core.rpc.netty.NettyPoolKey;
import io.seata.core.model.ResourceManager;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Map;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Iterator;
import sun.misc.Unsafe;

import static org.mockito.Mockito.mock;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.when;
import static org.mockito.ArgumentMatchers.anyString;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertFalse;

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
        java.lang.Object[] heapIntBufferRArray = createArray("java.nio.HeapIntBufferR", 0);
        
        rmRpcClient.userEventTriggered(((ChannelHandlerContext) null), heapIntBufferRArray);
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
    
    @Test(timeout = 10000)
    public void testDestroyChannel2() throws Throwable  {
        RmRpcClient rmRpcClient = ((RmRpcClient) createInstance("io.seata.core.rpc.netty.RmRpcClient"));
        
        rmRpcClient.destroyChannel(((String) null), ((Channel) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDestroyChannel3() throws Throwable  {
        RmRpcClient rmRpcClient = ((RmRpcClient) createInstance("io.seata.core.rpc.netty.RmRpcClient"));
        ConcurrentHashMap concurrentHashMap = ((ConcurrentHashMap) createInstance("java.util.concurrent.ConcurrentHashMap"));
        java.lang.Object[] nodeArray = createArray("java.util.concurrent.ConcurrentHashMap$Node", 9);
        setField(concurrentHashMap, "table", nodeArray);
        setField(rmRpcClient, "channels", concurrentHashMap);
        String string = new String("");
        Channel channelMock = mock(Channel.class);
        
        rmRpcClient.destroyChannel(string, channelMock);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDestroyChannel4() throws Throwable  {
        RmRpcClient rmRpcClient = ((RmRpcClient) createInstance("io.seata.core.rpc.netty.RmRpcClient"));
        GenericKeyedObjectPool genericKeyedObjectPoolMock = mock(GenericKeyedObjectPool.class);
        rmRpcClient.nettyClientKeyPool = genericKeyedObjectPoolMock;
        ConcurrentHashMap concurrentHashMap = ((ConcurrentHashMap) createInstance("java.util.concurrent.ConcurrentHashMap"));
        setField(concurrentHashMap, "table", null);
        setField(rmRpcClient, "channels", concurrentHashMap);
        ConcurrentHashMap concurrentHashMap1 = ((ConcurrentHashMap) createInstance("java.util.concurrent.ConcurrentHashMap"));
        java.lang.Object[] nodeArray = createArray("java.util.concurrent.ConcurrentHashMap$Node", 0);
        setField(concurrentHashMap1, "table", nodeArray);
        setField(rmRpcClient, "poolKeyMap", concurrentHashMap1);
        String string = new String("");
        Channel channelMock = mock(Channel.class);
        
        rmRpcClient.destroyChannel(string, channelMock);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDestroyChannel5() throws Throwable  {
        RmRpcClient rmRpcClient = ((RmRpcClient) createInstance("io.seata.core.rpc.netty.RmRpcClient"));
        ConcurrentHashMap concurrentHashMap = ((ConcurrentHashMap) createInstance("java.util.concurrent.ConcurrentHashMap"));
        java.lang.Object[] nodeArray = createArray("java.util.concurrent.ConcurrentHashMap$Node", 9);
        setField(concurrentHashMap, "table", nodeArray);
        setField(rmRpcClient, "channels", concurrentHashMap);
        String string = new String("");
        Channel channelMock = mock(Channel.class);
        
        rmRpcClient.destroyChannel(string, channelMock);
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
            String string1 = new String("");
            Channel channelMock = mock(Channel.class);
            AbstractMessage abstractMessageMock = mock(AbstractMessage.class);
            
            rmRpcClient.onRegisterMsgSuccess(string1, channelMock, null, abstractMessageMock);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testOnRegisterMsgSuccess3() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(org.slf4j.LoggerFactory.class);
            Logger loggerMock = mock(Logger.class);
            when(loggerMock.isInfoEnabled()).thenReturn(false);
            mockedStatic.when(() -> {
                org.slf4j.LoggerFactory.getLogger(any(Class.class));
            }).thenReturn(loggerMock);
            RmRpcClient rmRpcClient = ((RmRpcClient) createInstance("io.seata.core.rpc.netty.RmRpcClient"));
            setField(rmRpcClient, "customerKeys", null);
            ConcurrentHashMap concurrentHashMap = ((ConcurrentHashMap) createInstance("java.util.concurrent.ConcurrentHashMap"));
            setField(rmRpcClient, "channels", concurrentHashMap);
            String string = new String("");
            java.lang.Object[] dictionaryBasedBreakIteratorArray = createArray("sun.util.locale.provider.DictionaryBasedBreakIterator", 0);
            
            rmRpcClient.onRegisterMsgSuccess(string, null, dictionaryBasedBreakIteratorArray, null);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testOnRegisterMsgSuccess4() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(org.slf4j.LoggerFactory.class);
            Logger loggerMock = mock(Logger.class);
            when(loggerMock.isInfoEnabled()).thenReturn(true);
            mockedStatic.when(() -> {
                org.slf4j.LoggerFactory.getLogger(any(Class.class));
            }).thenReturn(loggerMock);
            RmRpcClient rmRpcClient = ((RmRpcClient) createInstance("io.seata.core.rpc.netty.RmRpcClient"));
            Channel channelMock = mock(Channel.class);
            java.lang.Object[] attributeMapArray = createArray("java.text.AttributedString$AttributeMap", 0);
            
            rmRpcClient.onRegisterMsgSuccess(null, channelMock, attributeMapArray, null);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testOnRegisterMsgSuccess5() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(org.slf4j.LoggerFactory.class);
            Logger loggerMock = mock(Logger.class);
            when(loggerMock.isInfoEnabled()).thenReturn(true);
            mockedStatic.when(() -> {
                org.slf4j.LoggerFactory.getLogger(any(Class.class));
            }).thenReturn(loggerMock);
            RmRpcClient rmRpcClient = ((RmRpcClient) createInstance("io.seata.core.rpc.netty.RmRpcClient"));
            Channel channelMock = mock(Channel.class);
            AbstractMessage abstractMessageMock = mock(AbstractMessage.class);
            
            rmRpcClient.onRegisterMsgSuccess(null, channelMock, null, abstractMessageMock);
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
        java.lang.Object[] dictionaryBasedBreakIteratorArray = createArray("sun.util.locale.provider.DictionaryBasedBreakIterator", 0);
        
        rmRpcClient.onRegisterMsgFail(null, null, dictionaryBasedBreakIteratorArray, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testOnRegisterMsgFail3() throws Throwable  {
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
            RegisterRMResponse registerRMResponse = ((RegisterRMResponse) createInstance("io.seata.core.protocol.RegisterRMResponse"));
            
            rmRpcClient.onRegisterMsgFail(string, null, registerRMResponse, null);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testSendMsgWithResponse1() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        org.mockito.MockedStatic mockedStatic1 = null;
        org.mockito.MockedStatic mockedStatic2 = null;
        try {
            mockedStatic = mockStatic(NettyClientConfig.class);
            mockedStatic.when(NettyClientConfig::getRpcRequestTimeout).thenReturn(0);
            mockedStatic1 = mockStatic(io.seata.discovery.registry.RegistryFactory.class);
            RegistryService registryServiceMock = mock(RegistryService.class);
            ArrayList arrayList = new ArrayList();
            when(registryServiceMock.lookup(anyString())).thenReturn(((List) arrayList));
            mockedStatic1.when(io.seata.discovery.registry.RegistryFactory::getInstance).thenReturn(registryServiceMock);
            mockedStatic2 = mockStatic(io.seata.discovery.loadbalance.LoadBalanceFactory.class);
            LoadBalance loadBalanceMock = mock(LoadBalance.class);
            when(loadBalanceMock.select(org.mockito.ArgumentMatchers.any())).thenReturn(null);
            mockedStatic2.when(io.seata.discovery.loadbalance.LoadBalanceFactory::getInstance).thenReturn(loadBalanceMock);
            RmRpcClient rmRpcClient = ((RmRpcClient) createInstance("io.seata.core.rpc.netty.RmRpcClient"));
            String string = new String("");
            setField(rmRpcClient, "transactionServiceGroup", string);
            java.lang.Object[] ofRefArray = createArray("java.util.stream.ForEachOps$ForEachOp$OfRef", 0);
            
            rmRpcClient.sendMsgWithResponse(ofRefArray);
        } finally {
            mockedStatic.close();
            mockedStatic1.close();
            mockedStatic2.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testSendMsgWithResponse2() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        org.mockito.MockedStatic mockedStatic1 = null;
        org.mockito.MockedStatic mockedStatic2 = null;
        org.mockito.MockedStatic mockedStatic3 = null;
        try {
            mockedStatic = mockStatic(NettyClientConfig.class);
            mockedStatic.when(NettyClientConfig::getRpcRequestTimeout).thenReturn(0);
            mockedStatic1 = mockStatic(io.seata.discovery.registry.RegistryFactory.class);
            RegistryService registryServiceMock = mock(RegistryService.class);
            ArrayList arrayList = new ArrayList();
            when(registryServiceMock.lookup(anyString())).thenReturn(((List) arrayList));
            mockedStatic1.when(io.seata.discovery.registry.RegistryFactory::getInstance).thenReturn(registryServiceMock);
            mockedStatic2 = mockStatic(io.seata.discovery.loadbalance.LoadBalanceFactory.class);
            LoadBalance loadBalanceMock = mock(LoadBalance.class);
            java.lang.Object[] dictionaryBasedBreakIteratorArray = createArray("sun.util.locale.provider.DictionaryBasedBreakIterator", 0);
            when(loadBalanceMock.select(org.mockito.ArgumentMatchers.any())).thenReturn(((Object) dictionaryBasedBreakIteratorArray));
            mockedStatic2.when(io.seata.discovery.loadbalance.LoadBalanceFactory::getInstance).thenReturn(loadBalanceMock);
            mockedStatic3 = mockStatic(org.slf4j.LoggerFactory.class);
            Logger loggerMock = mock(Logger.class);
            mockedStatic3.when(() -> {
                org.slf4j.LoggerFactory.getLogger(any(Class.class));
            }).thenReturn(loggerMock);
            RmRpcClient rmRpcClient = ((RmRpcClient) createInstance("io.seata.core.rpc.netty.RmRpcClient"));
            setField(rmRpcClient, "transactionServiceGroup", null);
            
            rmRpcClient.sendMsgWithResponse(null);
        } finally {
            mockedStatic.close();
            mockedStatic1.close();
            mockedStatic2.close();
            mockedStatic3.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testSendMsgWithResponse3() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        org.mockito.MockedStatic mockedStatic1 = null;
        try {
            mockedStatic = mockStatic(io.seata.discovery.registry.RegistryFactory.class);
            RegistryService registryServiceMock = mock(RegistryService.class);
            ArrayList arrayList = new ArrayList();
            when(registryServiceMock.lookup(anyString())).thenReturn(((List) arrayList));
            mockedStatic.when(io.seata.discovery.registry.RegistryFactory::getInstance).thenReturn(registryServiceMock);
            mockedStatic1 = mockStatic(io.seata.discovery.loadbalance.LoadBalanceFactory.class);
            LoadBalance loadBalanceMock = mock(LoadBalance.class);
            when(loadBalanceMock.select(org.mockito.ArgumentMatchers.any())).thenReturn(null);
            mockedStatic1.when(io.seata.discovery.loadbalance.LoadBalanceFactory::getInstance).thenReturn(loadBalanceMock);
            RmRpcClient rmRpcClient = ((RmRpcClient) createInstance("io.seata.core.rpc.netty.RmRpcClient"));
            String string = new String("");
            setField(rmRpcClient, "transactionServiceGroup", string);
            java.lang.Object[] digitArraysArray = createArray("java.text.DecimalFormat$DigitArrays", 0);
            
            rmRpcClient.sendMsgWithResponse(digitArraysArray, 0L);
        } finally {
            mockedStatic.close();
            mockedStatic1.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testSendMsgWithResponse4() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        org.mockito.MockedStatic mockedStatic1 = null;
        org.mockito.MockedStatic mockedStatic2 = null;
        try {
            mockedStatic = mockStatic(io.seata.discovery.registry.RegistryFactory.class);
            RegistryService registryServiceMock = mock(RegistryService.class);
            when(registryServiceMock.lookup(anyString())).thenReturn(((List) null));
            mockedStatic.when(io.seata.discovery.registry.RegistryFactory::getInstance).thenReturn(registryServiceMock);
            mockedStatic1 = mockStatic(io.seata.discovery.loadbalance.LoadBalanceFactory.class);
            LoadBalance loadBalanceMock = mock(LoadBalance.class);
            java.lang.Object[] dictionaryBasedBreakIteratorArray = createArray("sun.util.locale.provider.DictionaryBasedBreakIterator", 0);
            when(loadBalanceMock.select(org.mockito.ArgumentMatchers.any())).thenReturn(((Object) dictionaryBasedBreakIteratorArray));
            mockedStatic1.when(io.seata.discovery.loadbalance.LoadBalanceFactory::getInstance).thenReturn(loadBalanceMock);
            mockedStatic2 = mockStatic(org.slf4j.LoggerFactory.class);
            Logger loggerMock = mock(Logger.class);
            mockedStatic2.when(() -> {
                org.slf4j.LoggerFactory.getLogger(any(Class.class));
            }).thenReturn(loggerMock);
            RmRpcClient rmRpcClient = ((RmRpcClient) createInstance("io.seata.core.rpc.netty.RmRpcClient"));
            setField(rmRpcClient, "transactionServiceGroup", null);
            
            rmRpcClient.sendMsgWithResponse(null, 0L);
        } finally {
            mockedStatic.close();
            mockedStatic1.close();
            mockedStatic2.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testSendMsgWithResponse5() throws Throwable  {
        RmRpcClient rmRpcClient = ((RmRpcClient) createInstance("io.seata.core.rpc.netty.RmRpcClient"));
        String string = new String();
        Object object = new Object();
        
        rmRpcClient.sendMsgWithResponse(string, object, 0L);
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
        NettyClientConfig nettyClientConfigMock = mock(NettyClientConfig.class);
        when(nettyClientConfigMock.getMaxPoolActive()).thenReturn(0);
        when(nettyClientConfigMock.getMinPoolIdle()).thenReturn(0);
        when(nettyClientConfigMock.getMaxAcquireConnMills()).thenReturn(0L);
        when(nettyClientConfigMock.isPoolTestBorrow()).thenReturn(false);
        when(nettyClientConfigMock.isPoolTestReturn()).thenReturn(false);
        when(nettyClientConfigMock.isPoolLifo()).thenReturn(false);
        setField(rmRpcClient, "rmClientConfig", nettyClientConfigMock);
        
        Class rmRpcClientClazz = Class.forName("io.seata.core.rpc.netty.RmRpcClient");
        Method getNettyPoolConfigMethod = rmRpcClientClazz.getDeclaredMethod("getNettyPoolConfig");
        getNettyPoolConfigMethod.setAccessible(true);
        java.lang.Object[] getNettyPoolConfigMethodArguments = new java.lang.Object[0];
        GenericKeyedObjectPool.Config actual = ((GenericKeyedObjectPool.Config) getNettyPoolConfigMethod.invoke(rmRpcClient, getNettyPoolConfigMethodArguments));
        
        GenericKeyedObjectPool.Config expected = ((GenericKeyedObjectPool.Config) createInstance("org.apache.commons.pool.impl.GenericKeyedObjectPool$Config"));
        expected.lifo = false;
        expected.minEvictableIdleTimeMillis = 1800000L;
        expected.numTestsPerEvictionRun = 3;
        expected.timeBetweenEvictionRunsMillis = -1L;
        expected.testWhileIdle = false;
        expected.testOnReturn = false;
        expected.testOnBorrow = false;
        expected.whenExhaustedAction = (byte) 1;
        expected.maxWait = 0L;
        expected.minIdle = 0;
        expected.maxTotal = -1;
        expected.maxActive = 0;
        expected.maxIdle = 8;
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetTransactionRole1() throws Throwable  {
        RmRpcClient rmRpcClient = ((RmRpcClient) createInstance("io.seata.core.rpc.netty.RmRpcClient"));
        
        Class rmRpcClientClazz = Class.forName("io.seata.core.rpc.netty.RmRpcClient");
        Method getTransactionRoleMethod = rmRpcClientClazz.getDeclaredMethod("getTransactionRole");
        getTransactionRoleMethod.setAccessible(true);
        java.lang.Object[] getTransactionRoleMethodArguments = new java.lang.Object[0];
        NettyPoolKey.TransactionRole actual = ((NettyPoolKey.TransactionRole) getTransactionRoleMethod.invoke(rmRpcClient, getTransactionRoleMethodArguments));
        
        NettyPoolKey.TransactionRole expected = NettyPoolKey.TransactionRole.RMROLE;
        
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
        Channel channelMock = mock(Channel.class);
        
        Class rmRpcClientClazz = Class.forName("io.seata.core.rpc.netty.RmRpcClient");
        Class channelMockType = Class.forName("io.netty.channel.Channel");
        Class stringType = Class.forName("java.lang.String");
        Method releaseChannelMethod = rmRpcClientClazz.getDeclaredMethod("releaseChannel", channelMockType, stringType);
        releaseChannelMethod.setAccessible(true);
        java.lang.Object[] releaseChannelMethodArguments = new java.lang.Object[2];
        releaseChannelMethodArguments[0] = channelMock;
        releaseChannelMethodArguments[1] = null;
        releaseChannelMethod.invoke(rmRpcClient, releaseChannelMethodArguments);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReleaseChannel3() throws Throwable  {
        RmRpcClient rmRpcClient = ((RmRpcClient) createInstance("io.seata.core.rpc.netty.RmRpcClient"));
        
        Class rmRpcClientClazz = Class.forName("io.seata.core.rpc.netty.RmRpcClient");
        Class channelType = Class.forName("io.netty.channel.Channel");
        Class stringType = Class.forName("java.lang.String");
        Method releaseChannelMethod = rmRpcClientClazz.getDeclaredMethod("releaseChannel", channelType, stringType);
        releaseChannelMethod.setAccessible(true);
        java.lang.Object[] releaseChannelMethodArguments = new java.lang.Object[2];
        releaseChannelMethodArguments[0] = null;
        releaseChannelMethodArguments[1] = null;
        releaseChannelMethod.invoke(rmRpcClient, releaseChannelMethodArguments);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReleaseChannel4() throws Throwable  {
        RmRpcClient rmRpcClient = ((RmRpcClient) createInstance("io.seata.core.rpc.netty.RmRpcClient"));
        ConcurrentHashMap concurrentHashMap = ((ConcurrentHashMap) createInstance("java.util.concurrent.ConcurrentHashMap"));
        java.lang.Object[] nodeArray = createArray("java.util.concurrent.ConcurrentHashMap$Node", 9);
        setField(concurrentHashMap, "table", nodeArray);
        setField(rmRpcClient, "channelLocks", concurrentHashMap);
        Channel channelMock = mock(Channel.class);
        String string = new String("");
        
        Class rmRpcClientClazz = Class.forName("io.seata.core.rpc.netty.RmRpcClient");
        Class channelMockType = Class.forName("io.netty.channel.Channel");
        Class stringType = Class.forName("java.lang.String");
        Method releaseChannelMethod = rmRpcClientClazz.getDeclaredMethod("releaseChannel", channelMockType, stringType);
        releaseChannelMethod.setAccessible(true);
        java.lang.Object[] releaseChannelMethodArguments = new java.lang.Object[2];
        releaseChannelMethodArguments[0] = channelMock;
        releaseChannelMethodArguments[1] = string;
        try {
            releaseChannelMethod.invoke(rmRpcClient, releaseChannelMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReleaseChannel5() throws Throwable  {
        RmRpcClient rmRpcClient = ((RmRpcClient) createInstance("io.seata.core.rpc.netty.RmRpcClient"));
        ConcurrentHashMap concurrentHashMap = ((ConcurrentHashMap) createInstance("java.util.concurrent.ConcurrentHashMap"));
        java.lang.Object[] nodeArray = createArray("java.util.concurrent.ConcurrentHashMap$Node", 9);
        setField(concurrentHashMap, "table", nodeArray);
        setField(rmRpcClient, "channelLocks", concurrentHashMap);
        Channel channelMock = mock(Channel.class);
        String string = new String("");
        
        Class rmRpcClientClazz = Class.forName("io.seata.core.rpc.netty.RmRpcClient");
        Class channelMockType = Class.forName("io.netty.channel.Channel");
        Class stringType = Class.forName("java.lang.String");
        Method releaseChannelMethod = rmRpcClientClazz.getDeclaredMethod("releaseChannel", channelMockType, stringType);
        releaseChannelMethod.setAccessible(true);
        java.lang.Object[] releaseChannelMethodArguments = new java.lang.Object[2];
        releaseChannelMethodArguments[0] = channelMock;
        releaseChannelMethodArguments[1] = string;
        try {
            releaseChannelMethod.invoke(rmRpcClient, releaseChannelMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
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
    
    @Test(timeout = 10000)
    public void testGetExistAliveChannel2() throws Throwable  {
        RmRpcClient rmRpcClient = ((RmRpcClient) createInstance("io.seata.core.rpc.netty.RmRpcClient"));
        Channel channelMock = mock(Channel.class);
        when(channelMock.isActive()).thenReturn(true);
        
        Class rmRpcClientClazz = Class.forName("io.seata.core.rpc.netty.RmRpcClient");
        Class channelMockType = Class.forName("io.netty.channel.Channel");
        Class stringType = Class.forName("java.lang.String");
        Method getExistAliveChannelMethod = rmRpcClientClazz.getDeclaredMethod("getExistAliveChannel", channelMockType, stringType);
        getExistAliveChannelMethod.setAccessible(true);
        java.lang.Object[] getExistAliveChannelMethodArguments = new java.lang.Object[2];
        getExistAliveChannelMethodArguments[0] = channelMock;
        getExistAliveChannelMethodArguments[1] = null;
        Channel actual = ((Channel) getExistAliveChannelMethod.invoke(rmRpcClient, getExistAliveChannelMethodArguments));
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(channelMock, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetExistAliveChannel3() throws Throwable  {
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
    public void testGetExistAliveChannel4() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(NettyClientConfig.class);
            mockedStatic.when(NettyClientConfig::getMaxCheckAliveRetry).thenReturn(-2147483640, 2);
            RmRpcClient rmRpcClient = ((RmRpcClient) createInstance("io.seata.core.rpc.netty.RmRpcClient"));
            Channel channelMock = mock(Channel.class);
            when(channelMock.isActive()).thenReturn(false);
            
            Class rmRpcClientClazz = Class.forName("io.seata.core.rpc.netty.RmRpcClient");
            Class channelMockType = Class.forName("io.netty.channel.Channel");
            Class stringType = Class.forName("java.lang.String");
            Method getExistAliveChannelMethod = rmRpcClientClazz.getDeclaredMethod("getExistAliveChannel", channelMockType, stringType);
            getExistAliveChannelMethod.setAccessible(true);
            java.lang.Object[] getExistAliveChannelMethodArguments = new java.lang.Object[2];
            getExistAliveChannelMethodArguments[0] = channelMock;
            getExistAliveChannelMethodArguments[1] = null;
            Channel actual = ((Channel) getExistAliveChannelMethod.invoke(rmRpcClient, getExistAliveChannelMethodArguments));
            
            assertNull(actual);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetExistAliveChannel5() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(NettyClientConfig.class);
            mockedStatic.when(NettyClientConfig::getMaxCheckAliveRetry).thenReturn(1);
            mockedStatic.when(NettyClientConfig::getCheckAliveInternal).thenReturn(0);
            RmRpcClient rmRpcClient = ((RmRpcClient) createInstance("io.seata.core.rpc.netty.RmRpcClient"));
            ConcurrentHashMap concurrentHashMap = ((ConcurrentHashMap) createInstance("java.util.concurrent.ConcurrentHashMap"));
            java.lang.Object[] nodeArray = createArray("java.util.concurrent.ConcurrentHashMap$Node", 0);
            setField(concurrentHashMap, "table", nodeArray);
            setField(rmRpcClient, "channels", concurrentHashMap);
            Channel channelMock = mock(Channel.class);
            when(channelMock.isActive()).thenReturn(false);
            String string = new String("");
            
            Class rmRpcClientClazz = Class.forName("io.seata.core.rpc.netty.RmRpcClient");
            Class channelMockType = Class.forName("io.netty.channel.Channel");
            Class stringType = Class.forName("java.lang.String");
            Method getExistAliveChannelMethod = rmRpcClientClazz.getDeclaredMethod("getExistAliveChannel", channelMockType, stringType);
            getExistAliveChannelMethod.setAccessible(true);
            java.lang.Object[] getExistAliveChannelMethodArguments = new java.lang.Object[2];
            getExistAliveChannelMethodArguments[0] = channelMock;
            getExistAliveChannelMethodArguments[1] = string;
            Channel actual = ((Channel) getExistAliveChannelMethod.invoke(rmRpcClient, getExistAliveChannelMethodArguments));
            
            assertNull(actual);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetExistAliveChannel6() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(NettyClientConfig.class);
            mockedStatic.when(NettyClientConfig::getMaxCheckAliveRetry).thenReturn(1);
            mockedStatic.when(NettyClientConfig::getCheckAliveInternal).thenReturn(0);
            RmRpcClient rmRpcClient = ((RmRpcClient) createInstance("io.seata.core.rpc.netty.RmRpcClient"));
            ConcurrentHashMap concurrentHashMap = ((ConcurrentHashMap) createInstance("java.util.concurrent.ConcurrentHashMap"));
            java.lang.Object[] nodeArray = createArray("java.util.concurrent.ConcurrentHashMap$Node", 9);
            setField(concurrentHashMap, "table", nodeArray);
            setField(rmRpcClient, "channels", concurrentHashMap);
            Channel channelMock = mock(Channel.class);
            when(channelMock.isActive()).thenReturn(false);
            String string = new String("");
            
            Class rmRpcClientClazz = Class.forName("io.seata.core.rpc.netty.RmRpcClient");
            Class channelMockType = Class.forName("io.netty.channel.Channel");
            Class stringType = Class.forName("java.lang.String");
            Method getExistAliveChannelMethod = rmRpcClientClazz.getDeclaredMethod("getExistAliveChannel", channelMockType, stringType);
            getExistAliveChannelMethod.setAccessible(true);
            java.lang.Object[] getExistAliveChannelMethodArguments = new java.lang.Object[2];
            getExistAliveChannelMethodArguments[0] = channelMock;
            getExistAliveChannelMethodArguments[1] = string;
            try {
                getExistAliveChannelMethod.invoke(rmRpcClient, getExistAliveChannelMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }} finally {
            mockedStatic.close();
        }
    }
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
    public void testRegisterResource2() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(org.slf4j.LoggerFactory.class);
            Logger loggerMock = mock(Logger.class);
            when(loggerMock.isInfoEnabled()).thenReturn(false);
            mockedStatic.when(() -> {
                org.slf4j.LoggerFactory.getLogger(any(Class.class));
            }).thenReturn(loggerMock);
            RmRpcClient rmRpcClient = ((RmRpcClient) createInstance("io.seata.core.rpc.netty.RmRpcClient"));
            ConcurrentHashMap concurrentHashMap = ((ConcurrentHashMap) createInstance("java.util.concurrent.ConcurrentHashMap"));
            Object entrySetView = createInstance("java.util.concurrent.ConcurrentHashMap$EntrySetView");
            setField(entrySetView, "map", concurrentHashMap);
            setField(concurrentHashMap, "entrySet", entrySetView);
            java.lang.Object[] nodeArray = createArray("java.util.concurrent.ConcurrentHashMap$Node", 0);
            setField(concurrentHashMap, "table", nodeArray);
            setField(rmRpcClient, "channels", concurrentHashMap);
            String string = new String("");
            
            rmRpcClient.registerResource(null, string);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testRegisterResource3() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(org.slf4j.LoggerFactory.class);
            Logger loggerMock = mock(Logger.class);
            when(loggerMock.isInfoEnabled()).thenReturn(false);
            mockedStatic.when(() -> {
                org.slf4j.LoggerFactory.getLogger(any(Class.class));
            }).thenReturn(loggerMock);
            RmRpcClient rmRpcClient = ((RmRpcClient) createInstance("io.seata.core.rpc.netty.RmRpcClient"));
            ConcurrentHashMap concurrentHashMap = ((ConcurrentHashMap) createInstance("java.util.concurrent.ConcurrentHashMap"));
            setField(concurrentHashMap, "entrySet", null);
            java.lang.Object[] nodeArray = createArray("java.util.concurrent.ConcurrentHashMap$Node", 0);
            setField(concurrentHashMap, "table", nodeArray);
            setField(rmRpcClient, "channels", concurrentHashMap);
            
            Object rmRpcClientChannels = getFieldValue(rmRpcClient, "channels");
            Object initialRmRpcClientChannelsEntrySet = getFieldValue(rmRpcClientChannels, "entrySet");
            
            rmRpcClient.registerResource(null, null);
            
            Object rmRpcClientChannels1 = getFieldValue(rmRpcClient, "channels");
            Object finalRmRpcClientChannelsEntrySet = getFieldValue(rmRpcClientChannels1, "entrySet");
            
            assertFalse(initialRmRpcClientChannelsEntrySet == finalRmRpcClientChannelsEntrySet);
        } finally {
            mockedStatic.close();
        }
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
