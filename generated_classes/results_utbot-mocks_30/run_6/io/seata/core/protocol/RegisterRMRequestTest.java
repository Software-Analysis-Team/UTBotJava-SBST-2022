package io.seata.core.protocol;

import org.junit.Test;
import io.netty.buffer.ByteBuf;
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
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyShort;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.mockStatic;

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
        ByteBuf byteBufMock = mock(ByteBuf.class);
        when(byteBufMock.readableBytes()).thenReturn(0);
        
        boolean actual = registerRMRequest.decode(byteBufMock);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDecode4() throws Throwable  {
        RegisterRMRequest registerRMRequest = ((RegisterRMRequest) createInstance("io.seata.core.protocol.RegisterRMRequest"));
        ByteBuf byteBufMock = mock(ByteBuf.class);
        when(byteBufMock.readableBytes()).thenReturn(2);
        when(byteBufMock.readShort()).thenReturn(java.lang.Short.MIN_VALUE, (short) 3);
        
        boolean actual = registerRMRequest.decode(byteBufMock);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDecode5() throws Throwable  {
        RegisterRMRequest registerRMRequest = ((RegisterRMRequest) createInstance("io.seata.core.protocol.RegisterRMRequest"));
        ByteBuf byteBufMock = mock(ByteBuf.class);
        when(byteBufMock.readableBytes()).thenReturn(2);
        when(byteBufMock.readShort()).thenReturn(java.lang.Short.MIN_VALUE, java.lang.Short.MIN_VALUE, (short) 3);
        
        boolean actual = registerRMRequest.decode(byteBufMock);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDecode6() throws Throwable  {
        RegisterRMRequest registerRMRequest = ((RegisterRMRequest) createInstance("io.seata.core.protocol.RegisterRMRequest"));
        ByteBuf byteBufMock = mock(ByteBuf.class);
        when(byteBufMock.readableBytes()).thenReturn(1);
        when(byteBufMock.readShort()).thenReturn(java.lang.Short.MIN_VALUE, java.lang.Short.MIN_VALUE, java.lang.Short.MIN_VALUE, java.lang.Short.MIN_VALUE);
        when(byteBufMock.readInt()).thenReturn(-2147483632);
        
        boolean actual = registerRMRequest.decode(byteBufMock);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDecode7() throws Throwable  {
        RegisterRMRequest registerRMRequest = ((RegisterRMRequest) createInstance("io.seata.core.protocol.RegisterRMRequest"));
        ByteBuf byteBufMock = mock(ByteBuf.class);
        when(byteBufMock.readableBytes()).thenReturn(2);
        when(byteBufMock.readShort()).thenReturn(java.lang.Short.MIN_VALUE, java.lang.Short.MIN_VALUE, java.lang.Short.MIN_VALUE, (short) 3);
        
        boolean actual = registerRMRequest.decode(byteBufMock);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDecode8() throws Throwable  {
        RegisterRMRequest registerRMRequest = ((RegisterRMRequest) createInstance("io.seata.core.protocol.RegisterRMRequest"));
        ByteBuf byteBufMock = mock(ByteBuf.class);
        when(byteBufMock.readableBytes()).thenReturn(2);
        when(byteBufMock.readShort()).thenReturn((short) 3);
        
        boolean actual = registerRMRequest.decode(byteBufMock);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDecode9() throws Throwable  {
        RegisterRMRequest registerRMRequest = ((RegisterRMRequest) createInstance("io.seata.core.protocol.RegisterRMRequest"));
        ByteBuf byteBufMock = mock(ByteBuf.class);
        when(byteBufMock.readableBytes()).thenReturn(2);
        when(byteBufMock.readShort()).thenReturn(java.lang.Short.MIN_VALUE, java.lang.Short.MIN_VALUE, java.lang.Short.MIN_VALUE, java.lang.Short.MIN_VALUE);
        when(byteBufMock.readInt()).thenReturn(3);
        
        boolean actual = registerRMRequest.decode(byteBufMock);
        
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
    
    @Test(timeout = 10000)
    public void testDoEncode2() throws Throwable  {
        RegisterRMRequest registerRMRequest = ((RegisterRMRequest) createInstance("io.seata.core.protocol.RegisterRMRequest"));
        ByteBuffer byteBufferMock = mock(ByteBuffer.class);
        when(byteBufferMock.clear()).thenReturn(((java.nio.Buffer) null));
        when(byteBufferMock.putShort(anyShort())).thenReturn(((ByteBuffer) null), ((ByteBuffer) null), ((ByteBuffer) null), ((ByteBuffer) null));
        when(byteBufferMock.putInt(anyInt())).thenReturn(((ByteBuffer) null));
        registerRMRequest.byteBuffer = byteBufferMock;
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
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetResourceIds1() throws Throwable  {
        RegisterRMRequest registerRMRequest = new RegisterRMRequest();
        String string = new String();
        
        registerRMRequest.setResourceIds(string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetResourceIds2() throws Throwable  {
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
        String string = new String();
        String string1 = new String();
        RegisterRMRequest actual = new RegisterRMRequest(string, string1);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testRegisterRMRequest2() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(ByteBuffer.class);
            mockedStatic.when(() -> {
                ByteBuffer.allocate(anyInt());
            }).thenReturn(((ByteBuffer) null));
            RegisterRMRequest actual = new RegisterRMRequest(null, null);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testRegisterRMRequest3() {
        RegisterRMRequest actual = new RegisterRMRequest();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testRegisterRMRequest4() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(ByteBuffer.class);
            mockedStatic.when(() -> {
                ByteBuffer.allocate(anyInt());
            }).thenReturn(((ByteBuffer) null));
            RegisterRMRequest actual = new RegisterRMRequest();
        } finally {
            mockedStatic.close();
        }
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
    private static sun.misc.Unsafe getUnsafeInstance() throws Exception {
        java.lang.reflect.Field f = sun.misc.Unsafe.class.getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return (sun.misc.Unsafe) f.get(null);
    }
}
