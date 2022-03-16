package io.seata.core.protocol;

import org.junit.Test;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.EmptyByteBuf;
import io.netty.buffer.SwappedByteBuf;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
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
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class RegisterRMRequestTest {
    ///region
    
    @Test(timeout = 10000)
    public void testToString1() throws Throwable  {
        RegisterRMRequest registerRMRequest = new RegisterRMRequest();
        
        String actual = registerRMRequest.toString();
        
        String expected = new String("RegisterRMRequest{resourceIds='null', applicationId='null', transactionServiceGroup='null'}");
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDecode1() throws Throwable  {
        RegisterRMRequest registerRMRequest = new RegisterRMRequest();
        
        registerRMRequest.decode(((ByteBuf) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDecode2() throws Throwable  {
        RegisterRMRequest registerRMRequest = ((RegisterRMRequest) createInstance("io.seata.core.protocol.RegisterRMRequest"));
        
        registerRMRequest.decode(((ByteBuf) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDecode3() throws Throwable  {
        RegisterRMRequest registerRMRequest = ((RegisterRMRequest) createInstance("io.seata.core.protocol.RegisterRMRequest"));
        EmptyByteBuf emptyByteBuf = ((EmptyByteBuf) createInstance("io.netty.buffer.EmptyByteBuf"));
        
        boolean actual = registerRMRequest.decode(emptyByteBuf);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDecode4() throws Throwable  {
        RegisterRMRequest registerRMRequest = ((RegisterRMRequest) createInstance("io.seata.core.protocol.RegisterRMRequest"));
        SwappedByteBuf swappedByteBuf = ((SwappedByteBuf) createInstance("io.netty.buffer.SwappedByteBuf"));
        SwappedByteBuf swappedByteBuf1 = ((SwappedByteBuf) createInstance("io.netty.buffer.SwappedByteBuf"));
        EmptyByteBuf emptyByteBuf = ((EmptyByteBuf) createInstance("io.netty.buffer.EmptyByteBuf"));
        setField(swappedByteBuf1, "buf", emptyByteBuf);
        setField(swappedByteBuf, "buf", swappedByteBuf1);
        
        boolean actual = registerRMRequest.decode(swappedByteBuf);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDecode5() throws Throwable  {
        RegisterRMRequest registerRMRequest = ((RegisterRMRequest) createInstance("io.seata.core.protocol.RegisterRMRequest"));
        Object unsafeHeapSwappedByteBuf = createInstance("io.netty.buffer.UnsafeHeapSwappedByteBuf");
        SwappedByteBuf swappedByteBuf = ((SwappedByteBuf) createInstance("io.netty.buffer.SwappedByteBuf"));
        Object unsafeHeapSwappedByteBuf1 = createInstance("io.netty.buffer.UnsafeHeapSwappedByteBuf");
        Object simpleLeakAwareByteBuf = createInstance("io.netty.buffer.SimpleLeakAwareByteBuf");
        EmptyByteBuf emptyByteBuf = ((EmptyByteBuf) createInstance("io.netty.buffer.EmptyByteBuf"));
        setField(simpleLeakAwareByteBuf, "buf", emptyByteBuf);
        setField(unsafeHeapSwappedByteBuf1, "buf", simpleLeakAwareByteBuf);
        setField(swappedByteBuf, "buf", unsafeHeapSwappedByteBuf1);
        setField(unsafeHeapSwappedByteBuf, "buf", swappedByteBuf);
        
        Class registerRMRequestClazz = Class.forName("io.seata.core.protocol.RegisterRMRequest");
        Class unsafeHeapSwappedByteBufType = Class.forName("io.netty.buffer.ByteBuf");
        Method decodeMethod = registerRMRequestClazz.getDeclaredMethod("decode", unsafeHeapSwappedByteBufType);
        decodeMethod.setAccessible(true);
        java.lang.Object[] decodeMethodArguments = new java.lang.Object[1];
        decodeMethodArguments[0] = unsafeHeapSwappedByteBuf;
        boolean actual = ((boolean) decodeMethod.invoke(registerRMRequest, decodeMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetTypeCode1() throws Throwable  {
        RegisterRMRequest registerRMRequest = new RegisterRMRequest();
        
        short actual = registerRMRequest.getTypeCode();
        
        assertEquals((short) 103, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetTypeCode2() throws Throwable  {
        RegisterRMRequest registerRMRequest = ((RegisterRMRequest) createInstance("io.seata.core.protocol.RegisterRMRequest"));
        
        short actual = registerRMRequest.getTypeCode();
        
        assertEquals((short) 103, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDoEncode1() throws Throwable  {
        RegisterRMRequest registerRMRequest = new RegisterRMRequest();
        
        Class registerRMRequestClazz = Class.forName("io.seata.core.protocol.RegisterRMRequest");
        Method doEncodeMethod = registerRMRequestClazz.getDeclaredMethod("doEncode");
        doEncodeMethod.setAccessible(true);
        java.lang.Object[] doEncodeMethodArguments = new java.lang.Object[0];
        doEncodeMethod.invoke(registerRMRequest, doEncodeMethodArguments);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDoEncode2() throws Throwable  {
        RegisterRMRequest registerRMRequest = ((RegisterRMRequest) createInstance("io.seata.core.protocol.RegisterRMRequest"));
        Object heapByteBufferR = createInstance("java.nio.HeapByteBufferR");
        setField(heapByteBufferR, "capacity", 0);
        setField(heapByteBufferR, "limit", 0);
        setField(heapByteBufferR, "position", 0);
        setField(heapByteBufferR, "mark", 0);
        setField(registerRMRequest, "byteBuffer", heapByteBufferR);
        setField(registerRMRequest, "version", null);
        
        Class registerRMRequestClazz = Class.forName("io.seata.core.protocol.RegisterRMRequest");
        Method doEncodeMethod = registerRMRequestClazz.getDeclaredMethod("doEncode");
        doEncodeMethod.setAccessible(true);
        java.lang.Object[] doEncodeMethodArguments = new java.lang.Object[0];
        try {
            doEncodeMethod.invoke(registerRMRequest, doEncodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        ByteBuffer byteBuffer = registerRMRequest.byteBuffer;
        Object finalRegisterRMRequestByteBufferMark = getFieldValue(byteBuffer, "mark");
        
        assertEquals(-1, finalRegisterRMRequestByteBufferMark);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDoEncode3() throws Throwable  {
        RegisterRMRequest registerRMRequest = ((RegisterRMRequest) createInstance("io.seata.core.protocol.RegisterRMRequest"));
        Object heapByteBuffer = createInstance("java.nio.HeapByteBuffer");
        setField(heapByteBuffer, "capacity", 2);
        setField(heapByteBuffer, "limit", 0);
        setField(heapByteBuffer, "position", 0);
        setField(heapByteBuffer, "mark", 0);
        setField(heapByteBuffer, "bigEndian", false);
        setField(heapByteBuffer, "offset", 1);
        byte[] byteArray = new byte[3];
        setField(heapByteBuffer, "hb", byteArray);
        setField(registerRMRequest, "byteBuffer", heapByteBuffer);
        setField(registerRMRequest, "applicationId", null);
        setField(registerRMRequest, "version", null);
        
        Class registerRMRequestClazz = Class.forName("io.seata.core.protocol.RegisterRMRequest");
        Method doEncodeMethod = registerRMRequestClazz.getDeclaredMethod("doEncode");
        doEncodeMethod.setAccessible(true);
        java.lang.Object[] doEncodeMethodArguments = new java.lang.Object[0];
        try {
            doEncodeMethod.invoke(registerRMRequest, doEncodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        ByteBuffer byteBuffer = registerRMRequest.byteBuffer;
        Object finalRegisterRMRequestByteBufferLimit = getFieldValue(byteBuffer, "limit");
        ByteBuffer byteBuffer1 = registerRMRequest.byteBuffer;
        Object finalRegisterRMRequestByteBufferPosition = getFieldValue(byteBuffer1, "position");
        ByteBuffer byteBuffer2 = registerRMRequest.byteBuffer;
        Object finalRegisterRMRequestByteBufferMark = getFieldValue(byteBuffer2, "mark");
        
        assertEquals(2, finalRegisterRMRequestByteBufferLimit);
        
        assertEquals(2, finalRegisterRMRequestByteBufferPosition);
        
        assertEquals(-1, finalRegisterRMRequestByteBufferMark);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDoEncode4() throws Throwable  {
        RegisterRMRequest registerRMRequest = ((RegisterRMRequest) createInstance("io.seata.core.protocol.RegisterRMRequest"));
        Object heapByteBuffer = createInstance("java.nio.HeapByteBuffer");
        setField(heapByteBuffer, "capacity", 4);
        setField(heapByteBuffer, "limit", 0);
        setField(heapByteBuffer, "position", 0);
        setField(heapByteBuffer, "mark", 0);
        setField(heapByteBuffer, "bigEndian", true);
        setField(heapByteBuffer, "offset", 1);
        byte[] byteArray = new byte[7];
        setField(heapByteBuffer, "hb", byteArray);
        setField(registerRMRequest, "byteBuffer", heapByteBuffer);
        setField(registerRMRequest, "transactionServiceGroup", null);
        setField(registerRMRequest, "applicationId", null);
        setField(registerRMRequest, "version", null);
        
        Class registerRMRequestClazz = Class.forName("io.seata.core.protocol.RegisterRMRequest");
        Method doEncodeMethod = registerRMRequestClazz.getDeclaredMethod("doEncode");
        doEncodeMethod.setAccessible(true);
        java.lang.Object[] doEncodeMethodArguments = new java.lang.Object[0];
        try {
            doEncodeMethod.invoke(registerRMRequest, doEncodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        ByteBuffer byteBuffer = registerRMRequest.byteBuffer;
        Object finalRegisterRMRequestByteBufferLimit = getFieldValue(byteBuffer, "limit");
        ByteBuffer byteBuffer1 = registerRMRequest.byteBuffer;
        Object finalRegisterRMRequestByteBufferPosition = getFieldValue(byteBuffer1, "position");
        ByteBuffer byteBuffer2 = registerRMRequest.byteBuffer;
        Object finalRegisterRMRequestByteBufferMark = getFieldValue(byteBuffer2, "mark");
        
        assertEquals(4, finalRegisterRMRequestByteBufferLimit);
        
        assertEquals(4, finalRegisterRMRequestByteBufferPosition);
        
        assertEquals(-1, finalRegisterRMRequestByteBufferMark);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDoEncode5() throws Throwable  {
        RegisterRMRequest registerRMRequest = ((RegisterRMRequest) createInstance("io.seata.core.protocol.RegisterRMRequest"));
        Object heapByteBuffer = createInstance("java.nio.HeapByteBuffer");
        setField(heapByteBuffer, "capacity", 6);
        setField(heapByteBuffer, "limit", 0);
        setField(heapByteBuffer, "position", 0);
        setField(heapByteBuffer, "mark", 0);
        setField(heapByteBuffer, "bigEndian", true);
        setField(heapByteBuffer, "offset", 1);
        byte[] byteArray = new byte[7];
        setField(heapByteBuffer, "hb", byteArray);
        setField(registerRMRequest, "byteBuffer", heapByteBuffer);
        setField(registerRMRequest, "extraData", null);
        setField(registerRMRequest, "transactionServiceGroup", null);
        setField(registerRMRequest, "applicationId", null);
        setField(registerRMRequest, "version", null);
        
        Class registerRMRequestClazz = Class.forName("io.seata.core.protocol.RegisterRMRequest");
        Method doEncodeMethod = registerRMRequestClazz.getDeclaredMethod("doEncode");
        doEncodeMethod.setAccessible(true);
        java.lang.Object[] doEncodeMethodArguments = new java.lang.Object[0];
        try {
            doEncodeMethod.invoke(registerRMRequest, doEncodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        ByteBuffer byteBuffer = registerRMRequest.byteBuffer;
        Object finalRegisterRMRequestByteBufferLimit = getFieldValue(byteBuffer, "limit");
        ByteBuffer byteBuffer1 = registerRMRequest.byteBuffer;
        Object finalRegisterRMRequestByteBufferPosition = getFieldValue(byteBuffer1, "position");
        ByteBuffer byteBuffer2 = registerRMRequest.byteBuffer;
        Object finalRegisterRMRequestByteBufferMark = getFieldValue(byteBuffer2, "mark");
        
        assertEquals(6, finalRegisterRMRequestByteBufferLimit);
        
        assertEquals(6, finalRegisterRMRequestByteBufferPosition);
        
        assertEquals(-1, finalRegisterRMRequestByteBufferMark);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDoEncode6() throws Throwable  {
        RegisterRMRequest registerRMRequest = ((RegisterRMRequest) createInstance("io.seata.core.protocol.RegisterRMRequest"));
        Object heapByteBuffer = createInstance("java.nio.HeapByteBuffer");
        setField(heapByteBuffer, "capacity", 8);
        setField(heapByteBuffer, "limit", 0);
        setField(heapByteBuffer, "position", 0);
        setField(heapByteBuffer, "mark", 0);
        setField(heapByteBuffer, "bigEndian", true);
        setField(heapByteBuffer, "offset", 9);
        byte[] byteArray = new byte[31];
        setField(heapByteBuffer, "hb", byteArray);
        setField(registerRMRequest, "byteBuffer", heapByteBuffer);
        setField(registerRMRequest, "extraData", null);
        setField(registerRMRequest, "transactionServiceGroup", null);
        setField(registerRMRequest, "applicationId", null);
        setField(registerRMRequest, "version", null);
        setField(registerRMRequest, "resourceIds", null);
        
        Class registerRMRequestClazz = Class.forName("io.seata.core.protocol.RegisterRMRequest");
        Method doEncodeMethod = registerRMRequestClazz.getDeclaredMethod("doEncode");
        doEncodeMethod.setAccessible(true);
        java.lang.Object[] doEncodeMethodArguments = new java.lang.Object[0];
        try {
            doEncodeMethod.invoke(registerRMRequest, doEncodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        ByteBuffer byteBuffer = registerRMRequest.byteBuffer;
        Object finalRegisterRMRequestByteBufferLimit = getFieldValue(byteBuffer, "limit");
        ByteBuffer byteBuffer1 = registerRMRequest.byteBuffer;
        Object finalRegisterRMRequestByteBufferPosition = getFieldValue(byteBuffer1, "position");
        ByteBuffer byteBuffer2 = registerRMRequest.byteBuffer;
        Object finalRegisterRMRequestByteBufferMark = getFieldValue(byteBuffer2, "mark");
        
        assertEquals(8, finalRegisterRMRequestByteBufferLimit);
        
        assertEquals(8, finalRegisterRMRequestByteBufferPosition);
        
        assertEquals(-1, finalRegisterRMRequestByteBufferMark);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDoEncode7() throws Throwable  {
        RegisterRMRequest registerRMRequest = ((RegisterRMRequest) createInstance("io.seata.core.protocol.RegisterRMRequest"));
        Object heapByteBuffer = createInstance("java.nio.HeapByteBuffer");
        setField(heapByteBuffer, "capacity", 1073741824);
        setField(heapByteBuffer, "limit", 0);
        setField(heapByteBuffer, "position", 0);
        setField(heapByteBuffer, "mark", 0);
        setField(heapByteBuffer, "bigEndian", true);
        setField(heapByteBuffer, "offset", 1);
        byte[] byteArray = new byte[15];
        setField(heapByteBuffer, "hb", byteArray);
        setField(registerRMRequest, "byteBuffer", heapByteBuffer);
        setField(registerRMRequest, "extraData", null);
        setField(registerRMRequest, "transactionServiceGroup", null);
        setField(registerRMRequest, "applicationId", null);
        setField(registerRMRequest, "version", null);
        setField(registerRMRequest, "resourceIds", null);
        
        Class registerRMRequestClazz = Class.forName("io.seata.core.protocol.RegisterRMRequest");
        Method doEncodeMethod = registerRMRequestClazz.getDeclaredMethod("doEncode");
        doEncodeMethod.setAccessible(true);
        java.lang.Object[] doEncodeMethodArguments = new java.lang.Object[0];
        doEncodeMethod.invoke(registerRMRequest, doEncodeMethodArguments);
        
        ByteBuffer byteBuffer = registerRMRequest.byteBuffer;
        Object finalRegisterRMRequestByteBufferLimit = getFieldValue(byteBuffer, "limit");
        ByteBuffer byteBuffer1 = registerRMRequest.byteBuffer;
        Object finalRegisterRMRequestByteBufferPosition = getFieldValue(byteBuffer1, "position");
        ByteBuffer byteBuffer2 = registerRMRequest.byteBuffer;
        Object finalRegisterRMRequestByteBufferMark = getFieldValue(byteBuffer2, "mark");
        
        assertEquals(1073741824, finalRegisterRMRequestByteBufferLimit);
        
        assertEquals(12, finalRegisterRMRequestByteBufferPosition);
        
        assertEquals(-1, finalRegisterRMRequestByteBufferMark);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDoEncode8() throws Throwable  {
        RegisterRMRequest registerRMRequest = ((RegisterRMRequest) createInstance("io.seata.core.protocol.RegisterRMRequest"));
        Object directByteBuffer = createInstance("java.nio.DirectByteBuffer");
        setField(directByteBuffer, "address", 0L);
        setField(directByteBuffer, "capacity", 8388608);
        setField(directByteBuffer, "limit", 0);
        setField(directByteBuffer, "position", 0);
        setField(directByteBuffer, "mark", 0);
        setField(registerRMRequest, "byteBuffer", directByteBuffer);
        setField(registerRMRequest, "version", null);
        
        Class registerRMRequestClazz = Class.forName("io.seata.core.protocol.RegisterRMRequest");
        Method doEncodeMethod = registerRMRequestClazz.getDeclaredMethod("doEncode");
        doEncodeMethod.setAccessible(true);
        java.lang.Object[] doEncodeMethodArguments = new java.lang.Object[0];
        try {
            doEncodeMethod.invoke(registerRMRequest, doEncodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        ByteBuffer byteBuffer = registerRMRequest.byteBuffer;
        Object finalRegisterRMRequestByteBufferLimit = getFieldValue(byteBuffer, "limit");
        ByteBuffer byteBuffer1 = registerRMRequest.byteBuffer;
        Object finalRegisterRMRequestByteBufferPosition = getFieldValue(byteBuffer1, "position");
        ByteBuffer byteBuffer2 = registerRMRequest.byteBuffer;
        Object finalRegisterRMRequestByteBufferMark = getFieldValue(byteBuffer2, "mark");
        
        assertEquals(8388608, finalRegisterRMRequestByteBufferLimit);
        
        assertEquals(2, finalRegisterRMRequestByteBufferPosition);
        
        assertEquals(-1, finalRegisterRMRequestByteBufferMark);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetResourceIds1() throws Throwable  {
        RegisterRMRequest registerRMRequest = ((RegisterRMRequest) createInstance("io.seata.core.protocol.RegisterRMRequest"));
        setField(registerRMRequest, "resourceIds", null);
        
        registerRMRequest.setResourceIds(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetResourceIds1() throws Throwable  {
        RegisterRMRequest registerRMRequest = new RegisterRMRequest();
        
        String actual = registerRMRequest.getResourceIds();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetResourceIds2() throws Throwable  {
        RegisterRMRequest registerRMRequest = ((RegisterRMRequest) createInstance("io.seata.core.protocol.RegisterRMRequest"));
        setField(registerRMRequest, "resourceIds", null);
        
        String actual = registerRMRequest.getResourceIds();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testRegisterRMRequest1() {
        RegisterRMRequest actual = new RegisterRMRequest();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testRegisterRMRequest2() {
        String string = new String();
        String string1 = new String();
        RegisterRMRequest actual = new RegisterRMRequest(string, string1);
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
