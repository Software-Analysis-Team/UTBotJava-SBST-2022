package io.seata.core.rpc.netty;

import org.junit.Test;
import io.netty.channel.ChannelHandlerContext;
import java.util.concurrent.ConcurrentHashMap;
import io.seata.discovery.registry.RegistryService;
import java.util.ArrayList;
import io.seata.discovery.loadbalance.LoadBalance;
import org.slf4j.Logger;
import java.lang.reflect.Method;
import org.apache.commons.pool.impl.GenericKeyedObjectPool.Config;
import org.apache.commons.pool.impl.GenericKeyedObjectPool;
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
import static org.mockito.Mockito.mockStatic;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.Assert.assertTrue;

public class TmRpcClientTest {
    ///region
    
    @Test(timeout = 10000)
    public void testUserEventTriggered1() throws Throwable  {
        TmRpcClient tmRpcClient = ((TmRpcClient) createInstance("io.seata.core.rpc.netty.TmRpcClient"));
        ChannelHandlerContext channelHandlerContextMock = mock(ChannelHandlerContext.class);
        
        tmRpcClient.userEventTriggered(channelHandlerContextMock, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testOnRegisterMsgSuccess1() throws Throwable  {
        TmRpcClient tmRpcClient = ((TmRpcClient) createInstance("io.seata.core.rpc.netty.TmRpcClient"));
        ConcurrentHashMap concurrentHashMap = ((ConcurrentHashMap) createInstance("java.util.concurrent.ConcurrentHashMap"));
        java.lang.Object[] nodeArray = createArray("java.util.concurrent.ConcurrentHashMap$Node", 0);
        setField(concurrentHashMap, "table", nodeArray);
        setField(tmRpcClient, "channels", concurrentHashMap);
        String string = new String("");
        java.lang.Object[] byteBufferAsLongBufferBArray = createArray("java.nio.ByteBufferAsLongBufferB", 0);
        
        tmRpcClient.onRegisterMsgSuccess(string, null, byteBufferAsLongBufferBArray, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testSendMsgWithResponse1() throws Throwable  {
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
            when(loadBalanceMock.select(any())).thenReturn(null);
            mockedStatic1.when(io.seata.discovery.loadbalance.LoadBalanceFactory::getInstance).thenReturn(loadBalanceMock);
            TmRpcClient tmRpcClient = ((TmRpcClient) createInstance("io.seata.core.rpc.netty.TmRpcClient"));
            String string = new String("");
            setField(tmRpcClient, "transactionServiceGroup", string);
            java.lang.Object[] signedMutableBigIntegerArray = createArray("java.math.SignedMutableBigInteger", 0);
            
            tmRpcClient.sendMsgWithResponse(signedMutableBigIntegerArray, 0L);
        } finally {
            mockedStatic.close();
            mockedStatic1.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testSendMsgWithResponse2() throws Throwable  {
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
            java.lang.Object[] byteBufferAsLongBufferBArray = createArray("java.nio.ByteBufferAsLongBufferB", 0);
            when(loadBalanceMock.select(any())).thenReturn(((Object) byteBufferAsLongBufferBArray));
            mockedStatic1.when(io.seata.discovery.loadbalance.LoadBalanceFactory::getInstance).thenReturn(loadBalanceMock);
            mockedStatic2 = mockStatic(org.slf4j.LoggerFactory.class);
            Logger loggerMock = mock(Logger.class);
            mockedStatic2.when(() -> {
                org.slf4j.LoggerFactory.getLogger(org.mockito.ArgumentMatchers.any(Class.class));
            }).thenReturn(loggerMock);
            TmRpcClient tmRpcClient = ((TmRpcClient) createInstance("io.seata.core.rpc.netty.TmRpcClient"));
            setField(tmRpcClient, "transactionServiceGroup", null);
            
            tmRpcClient.sendMsgWithResponse(null, 0L);
        } finally {
            mockedStatic.close();
            mockedStatic1.close();
            mockedStatic2.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetNettyPoolConfig1() throws Throwable  {
        TmRpcClient tmRpcClient = ((TmRpcClient) createInstance("io.seata.core.rpc.netty.TmRpcClient"));
        NettyClientConfig nettyClientConfigMock = mock(NettyClientConfig.class);
        when(nettyClientConfigMock.getMaxPoolActive()).thenReturn(0);
        when(nettyClientConfigMock.getMinPoolIdle()).thenReturn(0);
        when(nettyClientConfigMock.getMaxAcquireConnMills()).thenReturn(0L);
        when(nettyClientConfigMock.isPoolTestBorrow()).thenReturn(false);
        when(nettyClientConfigMock.isPoolTestReturn()).thenReturn(false);
        when(nettyClientConfigMock.isPoolLifo()).thenReturn(false);
        setField(tmRpcClient, "tmClientConfig", nettyClientConfigMock);
        
        Class tmRpcClientClazz = Class.forName("io.seata.core.rpc.netty.TmRpcClient");
        Method getNettyPoolConfigMethod = tmRpcClientClazz.getDeclaredMethod("getNettyPoolConfig");
        getNettyPoolConfigMethod.setAccessible(true);
        java.lang.Object[] getNettyPoolConfigMethodArguments = new java.lang.Object[0];
        GenericKeyedObjectPool.Config actual = ((GenericKeyedObjectPool.Config) getNettyPoolConfigMethod.invoke(tmRpcClient, getNettyPoolConfigMethodArguments));
        
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
    public void testSetApplicationId1() throws Throwable  {
        TmRpcClient tmRpcClient = ((TmRpcClient) createInstance("io.seata.core.rpc.netty.TmRpcClient"));
        setField(tmRpcClient, "applicationId", null);
        String string = new String("");
        
        tmRpcClient.setApplicationId(string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetTransactionServiceGroup1() throws Throwable  {
        TmRpcClient tmRpcClient = ((TmRpcClient) createInstance("io.seata.core.rpc.netty.TmRpcClient"));
        String string = new String("");
        setField(tmRpcClient, "transactionServiceGroup", string);
        String string1 = new String("");
        
        tmRpcClient.setTransactionServiceGroup(string1);
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
    private static sun.misc.Unsafe getUnsafeInstance() throws Exception {
        java.lang.reflect.Field f = sun.misc.Unsafe.class.getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return (sun.misc.Unsafe) f.get(null);
    }
}
