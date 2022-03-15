package io.seata.core.rpc;

import org.junit.Test;
import io.netty.channel.Channel;
import io.netty.channel.unix.DomainSocketAddress;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import io.seata.core.rpc.netty.NettyPoolKey.TransactionRole;
import io.seata.core.rpc.netty.NettyPoolKey;
import java.util.Set;
import java.util.TreeSet;
import java.util.TreeMap;
import java.util.LinkedHashSet;
import java.lang.reflect.Method;
import io.netty.channel.unix.DatagramSocketAddress;
import java.net.Inet6Address;
import java.net.InetSocketAddress;
import java.util.Objects;
import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.lang.reflect.Modifier;
import sun.misc.Unsafe;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.Assert.assertFalse;

public class RpcContextTest {
    ///region
    
    @Test(timeout = 10000)
    public void testToString1() throws Throwable  {
        RpcContext rpcContext = new RpcContext();
        
        String actual = rpcContext.toString();
        
        String expected = new String("RpcContext{applicationId='null', transactionServiceGroup='null', clientId='null', channel=null, resourceSets=null}");
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetVersion1() throws Throwable  {
        RpcContext rpcContext = new RpcContext();
        String string = new String();
        
        rpcContext.setVersion(string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetVersion2() throws Throwable  {
        RpcContext rpcContext = ((RpcContext) createInstance("io.seata.core.rpc.RpcContext"));
        setField(rpcContext, "version", null);
        
        rpcContext.setVersion(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetChannel1() throws Throwable  {
        RpcContext rpcContext = new RpcContext();
        
        Channel actual = rpcContext.getChannel();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetChannel2() throws Throwable  {
        RpcContext rpcContext = ((RpcContext) createInstance("io.seata.core.rpc.RpcContext"));
        setField(rpcContext, "channel", null);
        
        Channel actual = rpcContext.getChannel();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testRelease1() throws Throwable  {
        RpcContext rpcContext = new RpcContext();
        
        rpcContext.release();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testRelease2() throws Throwable  {
        RpcContext rpcContext = ((RpcContext) createInstance("io.seata.core.rpc.RpcContext"));
        Channel channelMock = mock(Channel.class);
        when(channelMock.remoteAddress()).thenReturn(((java.net.SocketAddress) null));
        setField(rpcContext, "channel", channelMock);
        
        rpcContext.release();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testRelease3() throws Throwable  {
        RpcContext rpcContext = ((RpcContext) createInstance("io.seata.core.rpc.RpcContext"));
        setField(rpcContext, "channel", null);
        
        rpcContext.release();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testRelease4() throws Throwable  {
        RpcContext rpcContext = ((RpcContext) createInstance("io.seata.core.rpc.RpcContext"));
        Channel channelMock = mock(Channel.class);
        DomainSocketAddress domainSocketAddressMock = mock(DomainSocketAddress.class);
        when(domainSocketAddressMock.path()).thenReturn(((String) null), ((String) null));
        when(channelMock.remoteAddress()).thenReturn(((java.net.SocketAddress) domainSocketAddressMock));
        setField(rpcContext, "channel", channelMock);
        
        rpcContext.release();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testRelease5() throws Throwable  {
        RpcContext rpcContext = ((RpcContext) createInstance("io.seata.core.rpc.RpcContext"));
        Channel channelMock = mock(Channel.class);
        DomainSocketAddress domainSocketAddressMock = mock(DomainSocketAddress.class);
        String string = new String("");
        when(domainSocketAddressMock.path()).thenReturn(((String) null), string);
        when(channelMock.remoteAddress()).thenReturn(((java.net.SocketAddress) domainSocketAddressMock));
        setField(rpcContext, "channel", channelMock);
        
        rpcContext.release();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testRelease6() throws Throwable  {
        RpcContext rpcContext = ((RpcContext) createInstance("io.seata.core.rpc.RpcContext"));
        Channel channelMock = mock(Channel.class);
        DomainSocketAddress domainSocketAddressMock = mock(DomainSocketAddress.class);
        String string = new String("\u0000/\u0000");
        when(domainSocketAddressMock.path()).thenReturn(((String) null), string);
        when(channelMock.remoteAddress()).thenReturn(((java.net.SocketAddress) domainSocketAddressMock));
        setField(rpcContext, "channel", channelMock);
        
        rpcContext.release();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetClientRMHolderMap1() throws Throwable  {
        RpcContext rpcContext = new RpcContext();
        
        ConcurrentMap actual = rpcContext.getClientRMHolderMap();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetClientRMHolderMap2() throws Throwable  {
        RpcContext rpcContext = ((RpcContext) createInstance("io.seata.core.rpc.RpcContext"));
        setField(rpcContext, "clientRMHolderMap", null);
        
        ConcurrentMap actual = rpcContext.getClientRMHolderMap();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testHoldInResourceManagerChannels1() throws Throwable  {
        RpcContext rpcContext = new RpcContext();
        String string = new String();
        
        rpcContext.holdInResourceManagerChannels(string, ((ConcurrentMap) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testHoldInResourceManagerChannels2() throws Throwable  {
        RpcContext rpcContext = ((RpcContext) createInstance("io.seata.core.rpc.RpcContext"));
        ConcurrentHashMap concurrentHashMap = ((ConcurrentHashMap) createInstance("java.util.concurrent.ConcurrentHashMap"));
        setField(rpcContext, "clientRMHolderMap", concurrentHashMap);
        Channel channelMock = mock(Channel.class);
        when(channelMock.remoteAddress()).thenReturn(((java.net.SocketAddress) null));
        setField(rpcContext, "channel", channelMock);
        
        rpcContext.holdInResourceManagerChannels(((String) null), ((ConcurrentMap) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testHoldInResourceManagerChannels3() throws Throwable  {
        RpcContext rpcContext = ((RpcContext) createInstance("io.seata.core.rpc.RpcContext"));
        ConcurrentHashMap concurrentHashMap = ((ConcurrentHashMap) createInstance("java.util.concurrent.ConcurrentHashMap"));
        setField(rpcContext, "clientRMHolderMap", concurrentHashMap);
        setField(rpcContext, "channel", null);
        ConcurrentHashMap concurrentHashMap1 = ((ConcurrentHashMap) createInstance("java.util.concurrent.ConcurrentHashMap"));
        
        rpcContext.holdInResourceManagerChannels(((String) null), concurrentHashMap1);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testHoldInResourceManagerChannels4() throws Throwable  {
        RpcContext rpcContext = ((RpcContext) createInstance("io.seata.core.rpc.RpcContext"));
        setField(rpcContext, "clientRMHolderMap", null);
        Channel channelMock = mock(Channel.class);
        when(channelMock.remoteAddress()).thenReturn(((java.net.SocketAddress) null));
        setField(rpcContext, "channel", channelMock);
        
        Object initialRpcContextClientRMHolderMap = getFieldValue(rpcContext, "clientRMHolderMap");
        
        rpcContext.holdInResourceManagerChannels(((String) null), ((ConcurrentMap) null));
        
        Object finalRpcContextClientRMHolderMap = getFieldValue(rpcContext, "clientRMHolderMap");
        
        assertFalse(initialRpcContextClientRMHolderMap == finalRpcContextClientRMHolderMap);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testHoldInResourceManagerChannels5() throws Throwable  {
        RpcContext rpcContext = ((RpcContext) createInstance("io.seata.core.rpc.RpcContext"));
        ConcurrentHashMap concurrentHashMap = ((ConcurrentHashMap) createInstance("java.util.concurrent.ConcurrentHashMap"));
        setField(rpcContext, "clientRMHolderMap", concurrentHashMap);
        Channel channelMock = mock(Channel.class);
        DomainSocketAddress domainSocketAddressMock = mock(DomainSocketAddress.class);
        when(domainSocketAddressMock.path()).thenReturn(((String) null), ((String) null));
        when(channelMock.remoteAddress()).thenReturn(((java.net.SocketAddress) domainSocketAddressMock));
        setField(rpcContext, "channel", channelMock);
        
        rpcContext.holdInResourceManagerChannels(((String) null), ((ConcurrentMap) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testHoldInResourceManagerChannels6() throws Throwable  {
        RpcContext rpcContext = ((RpcContext) createInstance("io.seata.core.rpc.RpcContext"));
        ConcurrentHashMap concurrentHashMap = ((ConcurrentHashMap) createInstance("java.util.concurrent.ConcurrentHashMap"));
        setField(rpcContext, "clientRMHolderMap", concurrentHashMap);
        
        rpcContext.holdInResourceManagerChannels(((String) null), ((Integer) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testHoldInResourceManagerChannels7() throws Throwable  {
        RpcContext rpcContext = ((RpcContext) createInstance("io.seata.core.rpc.RpcContext"));
        setField(rpcContext, "clientRMHolderMap", null);
        
        Object initialRpcContextClientRMHolderMap = getFieldValue(rpcContext, "clientRMHolderMap");
        
        rpcContext.holdInResourceManagerChannels(((String) null), ((Integer) null));
        
        Object finalRpcContextClientRMHolderMap = getFieldValue(rpcContext, "clientRMHolderMap");
        
        assertFalse(initialRpcContextClientRMHolderMap == finalRpcContextClientRMHolderMap);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testHoldInResourceManagerChannels8() throws Throwable  {
        RpcContext rpcContext = ((RpcContext) createInstance("io.seata.core.rpc.RpcContext"));
        ConcurrentHashMap concurrentHashMap = ((ConcurrentHashMap) createInstance("java.util.concurrent.ConcurrentHashMap"));
        setField(concurrentHashMap, "sizeCtl", 0);
        setField(concurrentHashMap, "table", null);
        setField(rpcContext, "clientRMHolderMap", concurrentHashMap);
        String string = new String("");
        
        rpcContext.holdInResourceManagerChannels(string, ((Integer) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testHoldInClientChannels1() throws Throwable  {
        RpcContext rpcContext = new RpcContext();
        
        rpcContext.holdInClientChannels(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testHoldInClientChannels2() throws Throwable  {
        RpcContext rpcContext = ((RpcContext) createInstance("io.seata.core.rpc.RpcContext"));
        ConcurrentHashMap concurrentHashMap = ((ConcurrentHashMap) createInstance("java.util.concurrent.ConcurrentHashMap"));
        setField(rpcContext, "clientTMHolderMap", concurrentHashMap);
        
        rpcContext.holdInClientChannels(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testHoldInClientChannels3() throws Throwable  {
        RpcContext rpcContext = ((RpcContext) createInstance("io.seata.core.rpc.RpcContext"));
        setField(rpcContext, "clientTMHolderMap", null);
        Channel channelMock = mock(Channel.class);
        when(channelMock.remoteAddress()).thenReturn(((java.net.SocketAddress) null));
        setField(rpcContext, "channel", channelMock);
        
        rpcContext.holdInClientChannels(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testHoldInClientChannels4() throws Throwable  {
        RpcContext rpcContext = ((RpcContext) createInstance("io.seata.core.rpc.RpcContext"));
        setField(rpcContext, "clientTMHolderMap", null);
        Channel channelMock = mock(Channel.class);
        DomainSocketAddress domainSocketAddressMock = mock(DomainSocketAddress.class);
        when(domainSocketAddressMock.path()).thenReturn(((String) null), ((String) null));
        when(channelMock.remoteAddress()).thenReturn(((java.net.SocketAddress) domainSocketAddressMock));
        setField(rpcContext, "channel", channelMock);
        
        rpcContext.holdInClientChannels(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testHoldInClientChannels5() throws Throwable  {
        RpcContext rpcContext = ((RpcContext) createInstance("io.seata.core.rpc.RpcContext"));
        setField(rpcContext, "clientTMHolderMap", null);
        Channel channelMock = mock(Channel.class);
        DomainSocketAddress domainSocketAddressMock = mock(DomainSocketAddress.class);
        String string = new String("");
        when(domainSocketAddressMock.path()).thenReturn(((String) null), string);
        when(channelMock.remoteAddress()).thenReturn(((java.net.SocketAddress) domainSocketAddressMock));
        setField(rpcContext, "channel", channelMock);
        
        rpcContext.holdInClientChannels(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testHoldInClientChannels6() throws Throwable  {
        RpcContext rpcContext = ((RpcContext) createInstance("io.seata.core.rpc.RpcContext"));
        setField(rpcContext, "clientTMHolderMap", null);
        Channel channelMock = mock(Channel.class);
        DomainSocketAddress domainSocketAddressMock = mock(DomainSocketAddress.class);
        String string = new String("\u0000/\u0000");
        when(domainSocketAddressMock.path()).thenReturn(((String) null), string);
        when(channelMock.remoteAddress()).thenReturn(((java.net.SocketAddress) domainSocketAddressMock));
        setField(rpcContext, "channel", channelMock);
        
        rpcContext.holdInClientChannels(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testHoldInClientChannels7() throws Throwable  {
        RpcContext rpcContext = ((RpcContext) createInstance("io.seata.core.rpc.RpcContext"));
        setField(rpcContext, "clientTMHolderMap", null);
        Channel channelMock = mock(Channel.class);
        DomainSocketAddress domainSocketAddressMock = mock(DomainSocketAddress.class);
        String string = new String("/\u0000\u0000");
        when(domainSocketAddressMock.path()).thenReturn(((String) null), string, ((String) null));
        when(channelMock.remoteAddress()).thenReturn(((java.net.SocketAddress) domainSocketAddressMock));
        setField(rpcContext, "channel", channelMock);
        
        rpcContext.holdInClientChannels(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetVersion1() throws Throwable  {
        RpcContext rpcContext = new RpcContext();
        
        String actual = rpcContext.getVersion();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetVersion2() throws Throwable  {
        RpcContext rpcContext = ((RpcContext) createInstance("io.seata.core.rpc.RpcContext"));
        setField(rpcContext, "version", null);
        
        String actual = rpcContext.getVersion();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetTransactionServiceGroup1() throws Throwable  {
        RpcContext rpcContext = new RpcContext();
        
        String actual = rpcContext.getTransactionServiceGroup();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetTransactionServiceGroup2() throws Throwable  {
        RpcContext rpcContext = ((RpcContext) createInstance("io.seata.core.rpc.RpcContext"));
        setField(rpcContext, "transactionServiceGroup", null);
        
        String actual = rpcContext.getTransactionServiceGroup();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetPortMap1() throws Throwable  {
        RpcContext rpcContext = new RpcContext();
        String string = new String();
        
        rpcContext.getPortMap(string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetPortMap2() throws Throwable  {
        RpcContext rpcContext = ((RpcContext) createInstance("io.seata.core.rpc.RpcContext"));
        setField(rpcContext, "clientRMHolderMap", null);
        
        rpcContext.getPortMap(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetPortMap3() throws Throwable  {
        RpcContext rpcContext = ((RpcContext) createInstance("io.seata.core.rpc.RpcContext"));
        ConcurrentHashMap concurrentHashMap = ((ConcurrentHashMap) createInstance("java.util.concurrent.ConcurrentHashMap"));
        java.lang.Object[] nodeArray = createArray("java.util.concurrent.ConcurrentHashMap$Node", 0);
        setField(concurrentHashMap, "table", nodeArray);
        setField(rpcContext, "clientRMHolderMap", concurrentHashMap);
        String string = new String("");
        
        Map actual = rpcContext.getPortMap(string);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetPortMap4() throws Throwable  {
        RpcContext rpcContext = ((RpcContext) createInstance("io.seata.core.rpc.RpcContext"));
        ConcurrentHashMap concurrentHashMap = ((ConcurrentHashMap) createInstance("java.util.concurrent.ConcurrentHashMap"));
        java.lang.Object[] nodeArray = createArray("java.util.concurrent.ConcurrentHashMap$Node", 9);
        setField(concurrentHashMap, "table", nodeArray);
        setField(rpcContext, "clientRMHolderMap", concurrentHashMap);
        String string = new String("");
        
        rpcContext.getPortMap(string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetClientId1() throws Throwable  {
        RpcContext rpcContext = new RpcContext();
        
        String actual = rpcContext.getClientId();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetClientId2() throws Throwable  {
        RpcContext rpcContext = ((RpcContext) createInstance("io.seata.core.rpc.RpcContext"));
        setField(rpcContext, "clientId", null);
        
        String actual = rpcContext.getClientId();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetChannel1() throws Throwable  {
        RpcContext rpcContext = new RpcContext();
        
        rpcContext.setChannel(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetChannel2() throws Throwable  {
        RpcContext rpcContext = ((RpcContext) createInstance("io.seata.core.rpc.RpcContext"));
        setField(rpcContext, "channel", null);
        
        rpcContext.setChannel(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetApplicationId1() throws Throwable  {
        RpcContext rpcContext = new RpcContext();
        
        String actual = rpcContext.getApplicationId();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetApplicationId2() throws Throwable  {
        RpcContext rpcContext = ((RpcContext) createInstance("io.seata.core.rpc.RpcContext"));
        setField(rpcContext, "applicationId", null);
        
        String actual = rpcContext.getApplicationId();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetApplicationId1() throws Throwable  {
        RpcContext rpcContext = new RpcContext();
        String string = new String();
        
        rpcContext.setApplicationId(string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetApplicationId2() throws Throwable  {
        RpcContext rpcContext = ((RpcContext) createInstance("io.seata.core.rpc.RpcContext"));
        setField(rpcContext, "applicationId", null);
        
        rpcContext.setApplicationId(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetClientRole1() throws Throwable  {
        RpcContext rpcContext = new RpcContext();
        
        NettyPoolKey.TransactionRole actual = rpcContext.getClientRole();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetClientRole2() throws Throwable  {
        RpcContext rpcContext = ((RpcContext) createInstance("io.seata.core.rpc.RpcContext"));
        setField(rpcContext, "clientRole", null);
        
        NettyPoolKey.TransactionRole actual = rpcContext.getClientRole();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetClientRole1() throws Throwable  {
        RpcContext rpcContext = new RpcContext();
        NettyPoolKey.TransactionRole transactionRole = ((NettyPoolKey.TransactionRole) createInstance("io.seata.core.rpc.netty.NettyPoolKey$TransactionRole"));
        
        rpcContext.setClientRole(transactionRole);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetClientRole2() throws Throwable  {
        RpcContext rpcContext = ((RpcContext) createInstance("io.seata.core.rpc.RpcContext"));
        setField(rpcContext, "clientRole", null);
        
        rpcContext.setClientRole(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetResourceSets1() throws Throwable  {
        RpcContext rpcContext = new RpcContext();
        
        Set actual = rpcContext.getResourceSets();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetResourceSets2() throws Throwable  {
        RpcContext rpcContext = ((RpcContext) createInstance("io.seata.core.rpc.RpcContext"));
        setField(rpcContext, "resourceSets", null);
        
        Set actual = rpcContext.getResourceSets();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetResourceSets1() throws Throwable  {
        RpcContext rpcContext = new RpcContext();
        TreeSet treeSet = ((TreeSet) createInstance("java.util.TreeSet"));
        TreeMap treeMap = new TreeMap();
        setField(treeSet, "m", treeMap);
        
        rpcContext.setResourceSets(treeSet);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetResourceSets2() throws Throwable  {
        RpcContext rpcContext = ((RpcContext) createInstance("io.seata.core.rpc.RpcContext"));
        setField(rpcContext, "resourceSets", null);
        
        rpcContext.setResourceSets(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testAddResource1() throws Throwable  {
        RpcContext rpcContext = new RpcContext();
        String string = new String();
        
        rpcContext.addResource(string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testAddResource2() throws Throwable  {
        RpcContext rpcContext = ((RpcContext) createInstance("io.seata.core.rpc.RpcContext"));
        setField(rpcContext, "resourceSets", null);
        String string = new String("");
        
        rpcContext.addResource(string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testAddResource3() throws Throwable  {
        RpcContext rpcContext = ((RpcContext) createInstance("io.seata.core.rpc.RpcContext"));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        setField(rpcContext, "resourceSets", linkedHashSet);
        String string = new String("");
        
        rpcContext.addResource(string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testAddResource4() throws Throwable  {
        RpcContext rpcContext = ((RpcContext) createInstance("io.seata.core.rpc.RpcContext"));
        setField(rpcContext, "resourceSets", null);
        
        rpcContext.addResource(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testAddResource5() throws Throwable  {
        RpcContext rpcContext = ((RpcContext) createInstance("io.seata.core.rpc.RpcContext"));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Integer integer = 0;
        linkedHashSet.add(integer);
        setField(rpcContext, "resourceSets", linkedHashSet);
        String string = new String("");
        
        rpcContext.addResource(string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testAddResource6() throws Throwable  {
        RpcContext rpcContext = ((RpcContext) createInstance("io.seata.core.rpc.RpcContext"));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Character character = '\u0000';
        linkedHashSet.add(character);
        setField(rpcContext, "resourceSets", linkedHashSet);
        String string = new String("");
        
        rpcContext.addResource(string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testAddResources1() throws Throwable  {
        RpcContext rpcContext = new RpcContext();
        TreeSet treeSet = ((TreeSet) createInstance("java.util.TreeSet"));
        TreeMap treeMap = new TreeMap();
        setField(treeSet, "m", treeMap);
        
        rpcContext.addResources(treeSet);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testAddResources2() throws Throwable  {
        RpcContext rpcContext = ((RpcContext) createInstance("io.seata.core.rpc.RpcContext"));
        
        rpcContext.addResources(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetClientId1() throws Throwable  {
        RpcContext rpcContext = new RpcContext();
        String string = new String();
        
        rpcContext.setClientId(string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetClientId2() throws Throwable  {
        RpcContext rpcContext = ((RpcContext) createInstance("io.seata.core.rpc.RpcContext"));
        setField(rpcContext, "clientId", null);
        
        rpcContext.setClientId(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testHoldInIdentifiedChannels1() throws Throwable  {
        RpcContext rpcContext = new RpcContext();
        
        rpcContext.holdInIdentifiedChannels(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testHoldInIdentifiedChannels2() throws Throwable  {
        RpcContext rpcContext = ((RpcContext) createInstance("io.seata.core.rpc.RpcContext"));
        ConcurrentHashMap concurrentHashMap = ((ConcurrentHashMap) createInstance("java.util.concurrent.ConcurrentHashMap"));
        setField(rpcContext, "clientIDHolderMap", concurrentHashMap);
        
        rpcContext.holdInIdentifiedChannels(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testHoldInIdentifiedChannels3() throws Throwable  {
        RpcContext rpcContext = ((RpcContext) createInstance("io.seata.core.rpc.RpcContext"));
        setField(rpcContext, "clientIDHolderMap", null);
        Channel channelMock = mock(Channel.class);
        setField(rpcContext, "channel", channelMock);
        
        rpcContext.holdInIdentifiedChannels(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testHoldInIdentifiedChannels4() throws Throwable  {
        RpcContext rpcContext = ((RpcContext) createInstance("io.seata.core.rpc.RpcContext"));
        setField(rpcContext, "clientIDHolderMap", null);
        Channel channelMock = mock(Channel.class);
        setField(rpcContext, "channel", channelMock);
        ConcurrentHashMap concurrentHashMap = ((ConcurrentHashMap) createInstance("java.util.concurrent.ConcurrentHashMap"));
        setField(concurrentHashMap, "sizeCtl", 0);
        setField(concurrentHashMap, "table", null);
        
        Object initialRpcContextClientIDHolderMap = getFieldValue(rpcContext, "clientIDHolderMap");
        
        rpcContext.holdInIdentifiedChannels(concurrentHashMap);
        
        Object finalRpcContextClientIDHolderMap = getFieldValue(rpcContext, "clientIDHolderMap");
        
        assertFalse(initialRpcContextClientIDHolderMap == finalRpcContextClientIDHolderMap);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testHoldInIdentifiedChannels5() throws Throwable  {
        RpcContext rpcContext = ((RpcContext) createInstance("io.seata.core.rpc.RpcContext"));
        setField(rpcContext, "clientIDHolderMap", null);
        Channel channelMock = mock(Channel.class);
        setField(rpcContext, "channel", channelMock);
        ConcurrentHashMap concurrentHashMap = ((ConcurrentHashMap) createInstance("java.util.concurrent.ConcurrentHashMap"));
        java.lang.Object[] nodeArray = createArray("java.util.concurrent.ConcurrentHashMap$Node", 9);
        setField(concurrentHashMap, "table", nodeArray);
        
        Object initialRpcContextClientIDHolderMap = getFieldValue(rpcContext, "clientIDHolderMap");
        
        rpcContext.holdInIdentifiedChannels(concurrentHashMap);
        
        Object finalRpcContextClientIDHolderMap = getFieldValue(rpcContext, "clientIDHolderMap");
        
        assertFalse(initialRpcContextClientIDHolderMap == finalRpcContextClientIDHolderMap);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetTransactionServiceGroup1() throws Throwable  {
        RpcContext rpcContext = new RpcContext();
        String string = new String();
        
        rpcContext.setTransactionServiceGroup(string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetTransactionServiceGroup2() throws Throwable  {
        RpcContext rpcContext = ((RpcContext) createInstance("io.seata.core.rpc.RpcContext"));
        setField(rpcContext, "transactionServiceGroup", null);
        
        rpcContext.setTransactionServiceGroup(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetAddressFromChannel1() throws Throwable  {
        Class rpcContextClazz = Class.forName("io.seata.core.rpc.RpcContext");
        Class channelType = Class.forName("io.netty.channel.Channel");
        Method getAddressFromChannelMethod = rpcContextClazz.getDeclaredMethod("getAddressFromChannel", channelType);
        getAddressFromChannelMethod.setAccessible(true);
        java.lang.Object[] getAddressFromChannelMethodArguments = new java.lang.Object[1];
        getAddressFromChannelMethodArguments[0] = null;
        try {
            getAddressFromChannelMethod.invoke(null, getAddressFromChannelMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetAddressFromChannel2() throws Throwable  {
        Channel channelMock = mock(Channel.class);
        when(channelMock.remoteAddress()).thenReturn(((java.net.SocketAddress) null));
        
        Class rpcContextClazz = Class.forName("io.seata.core.rpc.RpcContext");
        Class channelMockType = Class.forName("io.netty.channel.Channel");
        Method getAddressFromChannelMethod = rpcContextClazz.getDeclaredMethod("getAddressFromChannel", channelMockType);
        getAddressFromChannelMethod.setAccessible(true);
        java.lang.Object[] getAddressFromChannelMethodArguments = new java.lang.Object[1];
        getAddressFromChannelMethodArguments[0] = channelMock;
        try {
            getAddressFromChannelMethod.invoke(null, getAddressFromChannelMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetAddressFromChannel3() throws Throwable  {
        Class rpcContextClazz = Class.forName("io.seata.core.rpc.RpcContext");
        Class channelType = Class.forName("io.netty.channel.Channel");
        Method getAddressFromChannelMethod = rpcContextClazz.getDeclaredMethod("getAddressFromChannel", channelType);
        getAddressFromChannelMethod.setAccessible(true);
        java.lang.Object[] getAddressFromChannelMethodArguments = new java.lang.Object[1];
        getAddressFromChannelMethodArguments[0] = null;
        try {
            getAddressFromChannelMethod.invoke(null, getAddressFromChannelMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetAddressFromChannel4() throws Throwable  {
        Channel channelMock = mock(Channel.class);
        DomainSocketAddress domainSocketAddressMock = mock(DomainSocketAddress.class);
        when(domainSocketAddressMock.path()).thenReturn(((String) null), ((String) null));
        when(channelMock.remoteAddress()).thenReturn(((java.net.SocketAddress) domainSocketAddressMock));
        
        Class rpcContextClazz = Class.forName("io.seata.core.rpc.RpcContext");
        Class channelMockType = Class.forName("io.netty.channel.Channel");
        Method getAddressFromChannelMethod = rpcContextClazz.getDeclaredMethod("getAddressFromChannel", channelMockType);
        getAddressFromChannelMethod.setAccessible(true);
        java.lang.Object[] getAddressFromChannelMethodArguments = new java.lang.Object[1];
        getAddressFromChannelMethodArguments[0] = channelMock;
        try {
            getAddressFromChannelMethod.invoke(null, getAddressFromChannelMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetAddressFromChannel5() throws Throwable  {
        Channel channelMock = mock(Channel.class);
        DomainSocketAddress domainSocketAddressMock = mock(DomainSocketAddress.class);
        String string = new String("");
        when(domainSocketAddressMock.path()).thenReturn(((String) null), string);
        when(channelMock.remoteAddress()).thenReturn(((java.net.SocketAddress) domainSocketAddressMock));
        
        Class rpcContextClazz = Class.forName("io.seata.core.rpc.RpcContext");
        Class channelMockType = Class.forName("io.netty.channel.Channel");
        Method getAddressFromChannelMethod = rpcContextClazz.getDeclaredMethod("getAddressFromChannel", channelMockType);
        getAddressFromChannelMethod.setAccessible(true);
        java.lang.Object[] getAddressFromChannelMethodArguments = new java.lang.Object[1];
        getAddressFromChannelMethodArguments[0] = channelMock;
        String actual = ((String) getAddressFromChannelMethod.invoke(null, getAddressFromChannelMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetAddressFromChannel6() throws Throwable  {
        Channel channelMock = mock(Channel.class);
        DomainSocketAddress domainSocketAddressMock = mock(DomainSocketAddress.class);
        String string = new String("\u0000/\u0000");
        when(domainSocketAddressMock.path()).thenReturn(((String) null), string);
        when(channelMock.remoteAddress()).thenReturn(((java.net.SocketAddress) domainSocketAddressMock));
        
        Class rpcContextClazz = Class.forName("io.seata.core.rpc.RpcContext");
        Class channelMockType = Class.forName("io.netty.channel.Channel");
        Method getAddressFromChannelMethod = rpcContextClazz.getDeclaredMethod("getAddressFromChannel", channelMockType);
        getAddressFromChannelMethod.setAccessible(true);
        java.lang.Object[] getAddressFromChannelMethodArguments = new java.lang.Object[1];
        getAddressFromChannelMethodArguments[0] = channelMock;
        String actual = ((String) getAddressFromChannelMethod.invoke(null, getAddressFromChannelMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetAddressFromChannel7() throws Throwable  {
        Channel channelMock = mock(Channel.class);
        DomainSocketAddress domainSocketAddressMock = mock(DomainSocketAddress.class);
        String string = new String("/\u0000\u0000");
        when(domainSocketAddressMock.path()).thenReturn(((String) null), string, ((String) null));
        when(channelMock.remoteAddress()).thenReturn(((java.net.SocketAddress) domainSocketAddressMock));
        
        Class rpcContextClazz = Class.forName("io.seata.core.rpc.RpcContext");
        Class channelMockType = Class.forName("io.netty.channel.Channel");
        Method getAddressFromChannelMethod = rpcContextClazz.getDeclaredMethod("getAddressFromChannel", channelMockType);
        getAddressFromChannelMethod.setAccessible(true);
        java.lang.Object[] getAddressFromChannelMethodArguments = new java.lang.Object[1];
        getAddressFromChannelMethodArguments[0] = channelMock;
        try {
            getAddressFromChannelMethod.invoke(null, getAddressFromChannelMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetAddressFromChannel8() throws Throwable  {
        Channel channelMock = mock(Channel.class);
        DomainSocketAddress domainSocketAddressMock = mock(DomainSocketAddress.class);
        String string = new String("/\u0000\u0000");
        when(domainSocketAddressMock.path()).thenReturn(((String) null), string, string);
        when(channelMock.remoteAddress()).thenReturn(((java.net.SocketAddress) domainSocketAddressMock));
        
        Class rpcContextClazz = Class.forName("io.seata.core.rpc.RpcContext");
        Class channelMockType = Class.forName("io.netty.channel.Channel");
        Method getAddressFromChannelMethod = rpcContextClazz.getDeclaredMethod("getAddressFromChannel", channelMockType);
        getAddressFromChannelMethod.setAccessible(true);
        java.lang.Object[] getAddressFromChannelMethodArguments = new java.lang.Object[1];
        getAddressFromChannelMethodArguments[0] = channelMock;
        String actual = ((String) getAddressFromChannelMethod.invoke(null, getAddressFromChannelMethodArguments));
        
        String expected = new String("\u0000\u0000");
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetAddressFromChannel9() throws Throwable  {
        Channel channelMock = mock(Channel.class);
        DatagramSocketAddress datagramSocketAddress = ((DatagramSocketAddress) createInstance("io.netty.channel.unix.DatagramSocketAddress"));
        Object inetSocketAddressHolder = createInstance("java.net.InetSocketAddress$InetSocketAddressHolder");
        Inet6Address inet6Address = ((Inet6Address) createInstance("java.net.Inet6Address"));
        Object inetAddressHolder = createInstance("java.net.InetAddress$InetAddressHolder");
        setField(inetAddressHolder, "hostName", null);
        setField(inet6Address, "holder", inetAddressHolder);
        Object inet6AddressHolder = createInstance("java.net.Inet6Address$Inet6AddressHolder");
        byte[] byteArray = new byte[1];
        setField(inet6AddressHolder, "ipaddress", byteArray);
        setField(inet6Address, "holder6", inet6AddressHolder);
        setField(inetSocketAddressHolder, "addr", inet6Address);
        setField(datagramSocketAddress, "holder", inetSocketAddressHolder);
        when(channelMock.remoteAddress()).thenReturn(((java.net.SocketAddress) datagramSocketAddress));
        
        Class rpcContextClazz = Class.forName("io.seata.core.rpc.RpcContext");
        Class channelMockType = Class.forName("io.netty.channel.Channel");
        Method getAddressFromChannelMethod = rpcContextClazz.getDeclaredMethod("getAddressFromChannel", channelMockType);
        getAddressFromChannelMethod.setAccessible(true);
        java.lang.Object[] getAddressFromChannelMethodArguments = new java.lang.Object[1];
        getAddressFromChannelMethodArguments[0] = channelMock;
        try {
            getAddressFromChannelMethod.invoke(null, getAddressFromChannelMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetAddressFromChannel10() throws Throwable  {
        Channel channelMock = mock(Channel.class);
        DatagramSocketAddress datagramSocketAddress = ((DatagramSocketAddress) createInstance("io.netty.channel.unix.DatagramSocketAddress"));
        Object inetSocketAddressHolder = createInstance("java.net.InetSocketAddress$InetSocketAddressHolder");
        Inet6Address inet6Address = ((Inet6Address) createInstance("java.net.Inet6Address"));
        Object inetAddressHolder = createInstance("java.net.InetAddress$InetAddressHolder");
        setField(inetAddressHolder, "hostName", null);
        setField(inet6Address, "holder", inetAddressHolder);
        Object inet6AddressHolder = createInstance("java.net.Inet6Address$Inet6AddressHolder");
        byte[] byteArray = new byte[0];
        setField(inet6AddressHolder, "ipaddress", byteArray);
        setField(inet6Address, "holder6", inet6AddressHolder);
        setField(inetSocketAddressHolder, "addr", inet6Address);
        setField(datagramSocketAddress, "holder", inetSocketAddressHolder);
        when(channelMock.remoteAddress()).thenReturn(((java.net.SocketAddress) datagramSocketAddress));
        
        Class rpcContextClazz = Class.forName("io.seata.core.rpc.RpcContext");
        Class channelMockType = Class.forName("io.netty.channel.Channel");
        Method getAddressFromChannelMethod = rpcContextClazz.getDeclaredMethod("getAddressFromChannel", channelMockType);
        getAddressFromChannelMethod.setAccessible(true);
        java.lang.Object[] getAddressFromChannelMethodArguments = new java.lang.Object[1];
        getAddressFromChannelMethodArguments[0] = channelMock;
        try {
            getAddressFromChannelMethod.invoke(null, getAddressFromChannelMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetClientPortFromChannel1() throws Throwable  {
        Class rpcContextClazz = Class.forName("io.seata.core.rpc.RpcContext");
        Class channelType = Class.forName("io.netty.channel.Channel");
        Method getClientPortFromChannelMethod = rpcContextClazz.getDeclaredMethod("getClientPortFromChannel", channelType);
        getClientPortFromChannelMethod.setAccessible(true);
        java.lang.Object[] getClientPortFromChannelMethodArguments = new java.lang.Object[1];
        getClientPortFromChannelMethodArguments[0] = null;
        try {
            getClientPortFromChannelMethod.invoke(null, getClientPortFromChannelMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetClientPortFromChannel2() throws Throwable  {
        Channel channelMock = mock(Channel.class);
        when(channelMock.remoteAddress()).thenReturn(((java.net.SocketAddress) null));
        
        Class rpcContextClazz = Class.forName("io.seata.core.rpc.RpcContext");
        Class channelMockType = Class.forName("io.netty.channel.Channel");
        Method getClientPortFromChannelMethod = rpcContextClazz.getDeclaredMethod("getClientPortFromChannel", channelMockType);
        getClientPortFromChannelMethod.setAccessible(true);
        java.lang.Object[] getClientPortFromChannelMethodArguments = new java.lang.Object[1];
        getClientPortFromChannelMethodArguments[0] = channelMock;
        try {
            getClientPortFromChannelMethod.invoke(null, getClientPortFromChannelMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetClientPortFromChannel3() throws Throwable  {
        Class rpcContextClazz = Class.forName("io.seata.core.rpc.RpcContext");
        Class channelType = Class.forName("io.netty.channel.Channel");
        Method getClientPortFromChannelMethod = rpcContextClazz.getDeclaredMethod("getClientPortFromChannel", channelType);
        getClientPortFromChannelMethod.setAccessible(true);
        java.lang.Object[] getClientPortFromChannelMethodArguments = new java.lang.Object[1];
        getClientPortFromChannelMethodArguments[0] = null;
        try {
            getClientPortFromChannelMethod.invoke(null, getClientPortFromChannelMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetClientPortFromChannel4() throws Throwable  {
        Channel channelMock = mock(Channel.class);
        DomainSocketAddress domainSocketAddressMock = mock(DomainSocketAddress.class);
        when(domainSocketAddressMock.path()).thenReturn(((String) null), ((String) null));
        when(channelMock.remoteAddress()).thenReturn(((java.net.SocketAddress) domainSocketAddressMock));
        
        Class rpcContextClazz = Class.forName("io.seata.core.rpc.RpcContext");
        Class channelMockType = Class.forName("io.netty.channel.Channel");
        Method getClientPortFromChannelMethod = rpcContextClazz.getDeclaredMethod("getClientPortFromChannel", channelMockType);
        getClientPortFromChannelMethod.setAccessible(true);
        java.lang.Object[] getClientPortFromChannelMethodArguments = new java.lang.Object[1];
        getClientPortFromChannelMethodArguments[0] = channelMock;
        try {
            getClientPortFromChannelMethod.invoke(null, getClientPortFromChannelMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetClientPortFromChannel5() throws Throwable  {
        Channel channelMock = mock(Channel.class);
        DomainSocketAddress domainSocketAddressMock = mock(DomainSocketAddress.class);
        String string = new String("\u0000");
        when(domainSocketAddressMock.path()).thenReturn(((String) null), string);
        when(channelMock.remoteAddress()).thenReturn(((java.net.SocketAddress) domainSocketAddressMock));
        
        Class rpcContextClazz = Class.forName("io.seata.core.rpc.RpcContext");
        Class channelMockType = Class.forName("io.netty.channel.Channel");
        Method getClientPortFromChannelMethod = rpcContextClazz.getDeclaredMethod("getClientPortFromChannel", channelMockType);
        getClientPortFromChannelMethod.setAccessible(true);
        java.lang.Object[] getClientPortFromChannelMethodArguments = new java.lang.Object[1];
        getClientPortFromChannelMethodArguments[0] = channelMock;
        try {
            getClientPortFromChannelMethod.invoke(null, getClientPortFromChannelMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetClientPortFromChannel6() throws Throwable  {
        Channel channelMock = mock(Channel.class);
        DomainSocketAddress domainSocketAddressMock = mock(DomainSocketAddress.class);
        String string = new String("\u0000/\u0000");
        when(domainSocketAddressMock.path()).thenReturn(((String) null), string);
        when(channelMock.remoteAddress()).thenReturn(((java.net.SocketAddress) domainSocketAddressMock));
        
        Class rpcContextClazz = Class.forName("io.seata.core.rpc.RpcContext");
        Class channelMockType = Class.forName("io.netty.channel.Channel");
        Method getClientPortFromChannelMethod = rpcContextClazz.getDeclaredMethod("getClientPortFromChannel", channelMockType);
        getClientPortFromChannelMethod.setAccessible(true);
        java.lang.Object[] getClientPortFromChannelMethodArguments = new java.lang.Object[1];
        getClientPortFromChannelMethodArguments[0] = channelMock;
        try {
            getClientPortFromChannelMethod.invoke(null, getClientPortFromChannelMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetClientPortFromChannel7() throws Throwable  {
        Channel channelMock = mock(Channel.class);
        DomainSocketAddress domainSocketAddressMock = mock(DomainSocketAddress.class);
        String string = new String("/\u0000\u0000");
        when(domainSocketAddressMock.path()).thenReturn(((String) null), string, ((String) null));
        when(channelMock.remoteAddress()).thenReturn(((java.net.SocketAddress) domainSocketAddressMock));
        
        Class rpcContextClazz = Class.forName("io.seata.core.rpc.RpcContext");
        Class channelMockType = Class.forName("io.netty.channel.Channel");
        Method getClientPortFromChannelMethod = rpcContextClazz.getDeclaredMethod("getClientPortFromChannel", channelMockType);
        getClientPortFromChannelMethod.setAccessible(true);
        java.lang.Object[] getClientPortFromChannelMethodArguments = new java.lang.Object[1];
        getClientPortFromChannelMethodArguments[0] = channelMock;
        try {
            getClientPortFromChannelMethod.invoke(null, getClientPortFromChannelMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetClientPortFromChannel8() throws Throwable  {
        Channel channelMock = mock(Channel.class);
        DomainSocketAddress domainSocketAddressMock = mock(DomainSocketAddress.class);
        String string = new String("/\u0000\u0000");
        String string1 = new String("");
        when(domainSocketAddressMock.path()).thenReturn(((String) null), string, string1);
        when(channelMock.remoteAddress()).thenReturn(((java.net.SocketAddress) domainSocketAddressMock));
        
        Class rpcContextClazz = Class.forName("io.seata.core.rpc.RpcContext");
        Class channelMockType = Class.forName("io.netty.channel.Channel");
        Method getClientPortFromChannelMethod = rpcContextClazz.getDeclaredMethod("getClientPortFromChannel", channelMockType);
        getClientPortFromChannelMethod.setAccessible(true);
        java.lang.Object[] getClientPortFromChannelMethodArguments = new java.lang.Object[1];
        getClientPortFromChannelMethodArguments[0] = channelMock;
        try {
            getClientPortFromChannelMethod.invoke(null, getClientPortFromChannelMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetClientPortFromChannel9() throws Throwable  {
        Channel channelMock = mock(Channel.class);
        InetSocketAddress inetSocketAddress = ((InetSocketAddress) createInstance("java.net.InetSocketAddress"));
        Object inetSocketAddressHolder = createInstance("java.net.InetSocketAddress$InetSocketAddressHolder");
        Inet6Address inet6Address = ((Inet6Address) createInstance("java.net.Inet6Address"));
        Object inetAddressHolder = createInstance("java.net.InetAddress$InetAddressHolder");
        String string = new String("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        setField(inetAddressHolder, "hostName", string);
        setField(inet6Address, "holder", inetAddressHolder);
        Object inet6AddressHolder = createInstance("java.net.Inet6Address$Inet6AddressHolder");
        byte[] byteArray = new byte[1];
        setField(inet6AddressHolder, "ipaddress", byteArray);
        setField(inet6Address, "holder6", inet6AddressHolder);
        setField(inetSocketAddressHolder, "addr", inet6Address);
        setField(inetSocketAddress, "holder", inetSocketAddressHolder);
        when(channelMock.remoteAddress()).thenReturn(((java.net.SocketAddress) inetSocketAddress));
        
        Class rpcContextClazz = Class.forName("io.seata.core.rpc.RpcContext");
        Class channelMockType = Class.forName("io.netty.channel.Channel");
        Method getClientPortFromChannelMethod = rpcContextClazz.getDeclaredMethod("getClientPortFromChannel", channelMockType);
        getClientPortFromChannelMethod.setAccessible(true);
        java.lang.Object[] getClientPortFromChannelMethodArguments = new java.lang.Object[1];
        getClientPortFromChannelMethodArguments[0] = channelMock;
        try {
            getClientPortFromChannelMethod.invoke(null, getClientPortFromChannelMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetClientPortFromChannel10() throws Throwable  {
        Channel channelMock = mock(Channel.class);
        InetSocketAddress inetSocketAddress = ((InetSocketAddress) createInstance("java.net.InetSocketAddress"));
        Object inetSocketAddressHolder = createInstance("java.net.InetSocketAddress$InetSocketAddressHolder");
        Inet6Address inet6Address = ((Inet6Address) createInstance("java.net.Inet6Address"));
        Object inetAddressHolder = createInstance("java.net.InetAddress$InetAddressHolder");
        String string = new String("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        setField(inetAddressHolder, "hostName", string);
        setField(inet6Address, "holder", inetAddressHolder);
        Object inet6AddressHolder = createInstance("java.net.Inet6Address$Inet6AddressHolder");
        byte[] byteArray = new byte[0];
        setField(inet6AddressHolder, "ipaddress", byteArray);
        setField(inet6Address, "holder6", inet6AddressHolder);
        setField(inetSocketAddressHolder, "addr", inet6Address);
        setField(inetSocketAddress, "holder", inetSocketAddressHolder);
        when(channelMock.remoteAddress()).thenReturn(((java.net.SocketAddress) inetSocketAddress));
        
        Class rpcContextClazz = Class.forName("io.seata.core.rpc.RpcContext");
        Class channelMockType = Class.forName("io.netty.channel.Channel");
        Method getClientPortFromChannelMethod = rpcContextClazz.getDeclaredMethod("getClientPortFromChannel", channelMockType);
        getClientPortFromChannelMethod.setAccessible(true);
        java.lang.Object[] getClientPortFromChannelMethodArguments = new java.lang.Object[1];
        getClientPortFromChannelMethodArguments[0] = channelMock;
        try {
            getClientPortFromChannelMethod.invoke(null, getClientPortFromChannelMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testRpcContext1() {
        RpcContext actual = new RpcContext();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testRpcContext2() {
        RpcContext actual = new RpcContext();
    }
    ///endregion
    
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
