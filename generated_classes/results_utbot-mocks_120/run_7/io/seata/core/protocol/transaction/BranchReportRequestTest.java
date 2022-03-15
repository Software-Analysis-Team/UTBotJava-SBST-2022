package io.seata.core.protocol.transaction;

import org.junit.Test;
import java.nio.ByteBuffer;
import io.seata.core.model.BranchStatus;
import io.seata.core.model.BranchType;
import io.seata.core.rpc.RpcContext;
import java.util.Objects;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.lang.reflect.Modifier;
import sun.misc.Unsafe;

import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.anyByte;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.ArgumentMatchers.anyShort;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class BranchReportRequestTest {
    ///region
    
    @Test(timeout = 10000)
    public void testToString1() throws Throwable  {
        BranchReportRequest branchReportRequest = new BranchReportRequest();
        
        String actual = branchReportRequest.toString();
        
        String expected = new String("xid=null,branchId=0,resourceId=null,status=null,applicationData=null");
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDecode1() throws Throwable  {
        BranchReportRequest branchReportRequest = new BranchReportRequest();
        
        branchReportRequest.decode(((ByteBuffer) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDecode2() throws Throwable  {
        BranchReportRequest branchReportRequest = ((BranchReportRequest) createInstance("io.seata.core.protocol.transaction.BranchReportRequest"));
        
        branchReportRequest.decode(((ByteBuffer) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDecode3() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        org.mockito.MockedStatic mockedStatic1 = null;
        try {
            mockedStatic = mockStatic(BranchStatus.class);
            BranchStatus branchStatus = BranchStatus.Unknown;
            mockedStatic.when(() -> {
                BranchStatus.get(anyByte());
            }).thenReturn(branchStatus);
            mockedStatic1 = mockStatic(BranchType.class);
            BranchType branchType = BranchType.AT;
            mockedStatic1.when(() -> {
                BranchType.get(anyByte());
            }).thenReturn(branchType);
            BranchReportRequest branchReportRequest = ((BranchReportRequest) createInstance("io.seata.core.protocol.transaction.BranchReportRequest"));
            setField(branchReportRequest, "branchType", null);
            setField(branchReportRequest, "status", null);
            setField(branchReportRequest, "branchId", 0L);
            ByteBuffer byteBufferMock = mock(ByteBuffer.class);
            when(byteBufferMock.getShort()).thenReturn(java.lang.Short.MIN_VALUE, (short) 0);
            when(byteBufferMock.getLong()).thenReturn(0L);
            when(byteBufferMock.get()).thenReturn((byte) 0, (byte) 0);
            when(byteBufferMock.getInt()).thenReturn(-2147483647);
            
            Object initialBranchReportRequestBranchType = getFieldValue(branchReportRequest, "branchType");
            Object initialBranchReportRequestStatus = getFieldValue(branchReportRequest, "status");
            
            branchReportRequest.decode(byteBufferMock);
            
            Object finalBranchReportRequestBranchType = getFieldValue(branchReportRequest, "branchType");
            Object finalBranchReportRequestStatus = getFieldValue(branchReportRequest, "status");
            
            
            // Current deep equals depth exceeds max depth 0
            assertTrue(deepEquals(branchType, finalBranchReportRequestBranchType));
            
            
            // Current deep equals depth exceeds max depth 0
            assertTrue(deepEquals(branchStatus, finalBranchReportRequestStatus));
        } finally {
            mockedStatic.close();
            mockedStatic1.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testEncode1() throws Throwable  {
        BranchReportRequest branchReportRequest = new BranchReportRequest();
        
        branchReportRequest.encode();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testEncode2() throws Throwable  {
        BranchReportRequest branchReportRequest = ((BranchReportRequest) createInstance("io.seata.core.protocol.transaction.BranchReportRequest"));
        setField(branchReportRequest, "byteBuffer", null);
        setField(branchReportRequest, "applicationData", null);
        setField(branchReportRequest, "xid", null);
        
        branchReportRequest.encode();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testEncode3() throws Throwable  {
        BranchReportRequest branchReportRequest = ((BranchReportRequest) createInstance("io.seata.core.protocol.transaction.BranchReportRequest"));
        ByteBuffer byteBufferMock = mock(ByteBuffer.class);
        when(byteBufferMock.putShort(anyShort())).thenReturn(((ByteBuffer) null));
        when(byteBufferMock.putLong(anyLong())).thenReturn(((ByteBuffer) null));
        branchReportRequest.byteBuffer = byteBufferMock;
        setField(branchReportRequest, "applicationData", null);
        setField(branchReportRequest, "status", null);
        setField(branchReportRequest, "branchId", 0L);
        setField(branchReportRequest, "xid", null);
        
        branchReportRequest.encode();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testEncode4() throws Throwable  {
        BranchReportRequest branchReportRequest = ((BranchReportRequest) createInstance("io.seata.core.protocol.transaction.BranchReportRequest"));
        ByteBuffer byteBufferMock = mock(ByteBuffer.class);
        when(byteBufferMock.putShort(anyShort())).thenReturn(((ByteBuffer) null), ((ByteBuffer) null));
        when(byteBufferMock.putLong(anyLong())).thenReturn(((ByteBuffer) null));
        when(byteBufferMock.put(anyByte())).thenReturn(((ByteBuffer) null));
        when(byteBufferMock.putInt(anyInt())).thenReturn(((ByteBuffer) null));
        branchReportRequest.byteBuffer = byteBufferMock;
        setField(branchReportRequest, "branchType", null);
        setField(branchReportRequest, "applicationData", null);
        BranchStatus branchStatusMock = mock(BranchStatus.class);
        when(branchStatusMock.getCode()).thenReturn(0);
        setField(branchReportRequest, "status", branchStatusMock);
        setField(branchReportRequest, "resourceId", null);
        setField(branchReportRequest, "branchId", 0L);
        setField(branchReportRequest, "xid", null);
        
        branchReportRequest.encode();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testEncode5() throws Throwable  {
        BranchReportRequest branchReportRequest = ((BranchReportRequest) createInstance("io.seata.core.protocol.transaction.BranchReportRequest"));
        ByteBuffer byteBufferMock = mock(ByteBuffer.class);
        when(byteBufferMock.putShort(anyShort())).thenReturn(((ByteBuffer) null), ((ByteBuffer) null));
        when(byteBufferMock.putLong(anyLong())).thenReturn(((ByteBuffer) null));
        when(byteBufferMock.put(anyByte())).thenReturn(((ByteBuffer) null), ((ByteBuffer) null));
        when(byteBufferMock.putInt(anyInt())).thenReturn(((ByteBuffer) null));
        when(byteBufferMock.flip()).thenReturn(((java.nio.Buffer) null));
        when(byteBufferMock.limit()).thenReturn(Integer.MIN_VALUE);
        branchReportRequest.byteBuffer = byteBufferMock;
        BranchType branchTypeMock = mock(BranchType.class);
        when(branchTypeMock.ordinal()).thenReturn(0);
        setField(branchReportRequest, "branchType", branchTypeMock);
        setField(branchReportRequest, "applicationData", null);
        BranchStatus branchStatusMock = mock(BranchStatus.class);
        when(branchStatusMock.getCode()).thenReturn(0);
        setField(branchReportRequest, "status", branchStatusMock);
        setField(branchReportRequest, "resourceId", null);
        setField(branchReportRequest, "branchId", 0L);
        setField(branchReportRequest, "xid", null);
        
        branchReportRequest.encode();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testEncode6() throws Throwable  {
        BranchReportRequest branchReportRequest = ((BranchReportRequest) createInstance("io.seata.core.protocol.transaction.BranchReportRequest"));
        ByteBuffer byteBufferMock = mock(ByteBuffer.class);
        when(byteBufferMock.putShort(anyShort())).thenReturn(((ByteBuffer) null), ((ByteBuffer) null));
        when(byteBufferMock.putLong(anyLong())).thenReturn(((ByteBuffer) null));
        when(byteBufferMock.put(anyByte())).thenReturn(((ByteBuffer) null), ((ByteBuffer) null));
        when(byteBufferMock.putInt(anyInt())).thenReturn(((ByteBuffer) null));
        when(byteBufferMock.flip()).thenReturn(((java.nio.Buffer) null));
        when(byteBufferMock.limit()).thenReturn(9);
        when(byteBufferMock.get(any(byte[].class))).thenReturn(((ByteBuffer) null));
        branchReportRequest.byteBuffer = byteBufferMock;
        BranchType branchTypeMock = mock(BranchType.class);
        when(branchTypeMock.ordinal()).thenReturn(0);
        setField(branchReportRequest, "branchType", branchTypeMock);
        setField(branchReportRequest, "applicationData", null);
        BranchStatus branchStatusMock = mock(BranchStatus.class);
        when(branchStatusMock.getCode()).thenReturn(0);
        setField(branchReportRequest, "status", branchStatusMock);
        setField(branchReportRequest, "resourceId", null);
        setField(branchReportRequest, "branchId", 0L);
        setField(branchReportRequest, "xid", null);
        
        byte[] actual = branchReportRequest.encode();
        
        byte[] expected = new byte[9];
        assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetTypeCode1() throws Throwable  {
        BranchReportRequest branchReportRequest = new BranchReportRequest();
        
        short actual = branchReportRequest.getTypeCode();
        
        assertEquals((short) 13, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetTypeCode2() throws Throwable  {
        BranchReportRequest branchReportRequest = ((BranchReportRequest) createInstance("io.seata.core.protocol.transaction.BranchReportRequest"));
        
        short actual = branchReportRequest.getTypeCode();
        
        assertEquals((short) 13, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testHandle1() throws Throwable  {
        BranchReportRequest branchReportRequest = new BranchReportRequest();
        RpcContext rpcContext = new RpcContext();
        
        branchReportRequest.handle(rpcContext);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testHandle2() throws Throwable  {
        BranchReportRequest branchReportRequest = ((BranchReportRequest) createInstance("io.seata.core.protocol.transaction.BranchReportRequest"));
        TCInboundHandler tCInboundHandlerMock = mock(TCInboundHandler.class);
        when(tCInboundHandlerMock.handle(any(BranchReportRequest.class), any(RpcContext.class))).thenReturn(((BranchReportResponse) null));
        branchReportRequest.handler = tCInboundHandlerMock;
        
        AbstractTransactionResponse actual = branchReportRequest.handle(((RpcContext) null));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testHandle3() throws Throwable  {
        BranchReportRequest branchReportRequest = ((BranchReportRequest) createInstance("io.seata.core.protocol.transaction.BranchReportRequest"));
        setField(branchReportRequest, "handler", null);
        
        branchReportRequest.handle(((RpcContext) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetBranchId1() throws Throwable  {
        BranchReportRequest branchReportRequest = new BranchReportRequest();
        
        long actual = branchReportRequest.getBranchId();
        
        assertEquals(0L, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetBranchId2() throws Throwable  {
        BranchReportRequest branchReportRequest = ((BranchReportRequest) createInstance("io.seata.core.protocol.transaction.BranchReportRequest"));
        setField(branchReportRequest, "branchId", 0L);
        
        long actual = branchReportRequest.getBranchId();
        
        assertEquals(0L, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetResourceId1() throws Throwable  {
        BranchReportRequest branchReportRequest = new BranchReportRequest();
        String string = new String();
        
        branchReportRequest.setResourceId(string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetResourceId2() throws Throwable  {
        BranchReportRequest branchReportRequest = ((BranchReportRequest) createInstance("io.seata.core.protocol.transaction.BranchReportRequest"));
        setField(branchReportRequest, "resourceId", null);
        
        branchReportRequest.setResourceId(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetBranchType1() throws Throwable  {
        BranchReportRequest branchReportRequest = ((BranchReportRequest) createInstance("io.seata.core.protocol.transaction.BranchReportRequest"));
        setField(branchReportRequest, "branchType", null);
        
        branchReportRequest.setBranchType(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetXid1() throws Throwable  {
        BranchReportRequest branchReportRequest = new BranchReportRequest();
        String string = new String();
        
        branchReportRequest.setXid(string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetXid2() throws Throwable  {
        BranchReportRequest branchReportRequest = ((BranchReportRequest) createInstance("io.seata.core.protocol.transaction.BranchReportRequest"));
        setField(branchReportRequest, "xid", null);
        
        branchReportRequest.setXid(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetBranchId1() throws Throwable  {
        BranchReportRequest branchReportRequest = new BranchReportRequest();
        
        branchReportRequest.setBranchId(0L);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetBranchId2() throws Throwable  {
        BranchReportRequest branchReportRequest = ((BranchReportRequest) createInstance("io.seata.core.protocol.transaction.BranchReportRequest"));
        setField(branchReportRequest, "branchId", 0L);
        
        branchReportRequest.setBranchId(0L);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetStatus1() throws Throwable  {
        BranchReportRequest branchReportRequest = new BranchReportRequest();
        
        BranchStatus actual = branchReportRequest.getStatus();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetStatus2() throws Throwable  {
        BranchReportRequest branchReportRequest = ((BranchReportRequest) createInstance("io.seata.core.protocol.transaction.BranchReportRequest"));
        setField(branchReportRequest, "status", null);
        
        BranchStatus actual = branchReportRequest.getStatus();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetXid1() throws Throwable  {
        BranchReportRequest branchReportRequest = new BranchReportRequest();
        
        String actual = branchReportRequest.getXid();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetXid2() throws Throwable  {
        BranchReportRequest branchReportRequest = ((BranchReportRequest) createInstance("io.seata.core.protocol.transaction.BranchReportRequest"));
        setField(branchReportRequest, "xid", null);
        
        String actual = branchReportRequest.getXid();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetResourceId1() throws Throwable  {
        BranchReportRequest branchReportRequest = new BranchReportRequest();
        
        String actual = branchReportRequest.getResourceId();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetResourceId2() throws Throwable  {
        BranchReportRequest branchReportRequest = ((BranchReportRequest) createInstance("io.seata.core.protocol.transaction.BranchReportRequest"));
        setField(branchReportRequest, "resourceId", null);
        
        String actual = branchReportRequest.getResourceId();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetApplicationData1() throws Throwable  {
        BranchReportRequest branchReportRequest = new BranchReportRequest();
        String string = new String();
        
        branchReportRequest.setApplicationData(string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetApplicationData2() throws Throwable  {
        BranchReportRequest branchReportRequest = ((BranchReportRequest) createInstance("io.seata.core.protocol.transaction.BranchReportRequest"));
        setField(branchReportRequest, "applicationData", null);
        
        branchReportRequest.setApplicationData(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetStatus1() throws Throwable  {
        BranchReportRequest branchReportRequest = new BranchReportRequest();
        BranchStatus branchStatus = ((BranchStatus) createInstance("io.seata.core.model.BranchStatus"));
        
        branchReportRequest.setStatus(branchStatus);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetStatus2() throws Throwable  {
        BranchReportRequest branchReportRequest = ((BranchReportRequest) createInstance("io.seata.core.protocol.transaction.BranchReportRequest"));
        setField(branchReportRequest, "status", null);
        
        branchReportRequest.setStatus(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetBranchType1() throws Throwable  {
        BranchReportRequest branchReportRequest = new BranchReportRequest();
        
        BranchType actual = branchReportRequest.getBranchType();
        
        BranchType expected = BranchType.AT;
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetBranchType2() throws Throwable  {
        BranchReportRequest branchReportRequest = ((BranchReportRequest) createInstance("io.seata.core.protocol.transaction.BranchReportRequest"));
        setField(branchReportRequest, "branchType", null);
        
        BranchType actual = branchReportRequest.getBranchType();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetApplicationData1() throws Throwable  {
        BranchReportRequest branchReportRequest = new BranchReportRequest();
        
        String actual = branchReportRequest.getApplicationData();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetApplicationData2() throws Throwable  {
        BranchReportRequest branchReportRequest = ((BranchReportRequest) createInstance("io.seata.core.protocol.transaction.BranchReportRequest"));
        setField(branchReportRequest, "applicationData", null);
        
        String actual = branchReportRequest.getApplicationData();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testBranchReportRequest1() {
        BranchReportRequest actual = new BranchReportRequest();
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
    private static sun.misc.Unsafe getUnsafeInstance() throws Exception {
        java.lang.reflect.Field f = sun.misc.Unsafe.class.getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return (sun.misc.Unsafe) f.get(null);
    }
}
