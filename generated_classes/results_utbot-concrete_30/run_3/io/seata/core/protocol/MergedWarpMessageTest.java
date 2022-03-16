package io.seata.core.protocol;

import org.junit.Test;
import java.util.List;
import java.util.ArrayList;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.EmptyByteBuf;
import io.netty.buffer.SwappedByteBuf;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.lang.reflect.Modifier;
import sun.misc.Unsafe;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

public class MergedWarpMessageTest {
    ///region
    
    @Test(timeout = 10000)
    public void testToString1() throws Throwable  {
        MergedWarpMessage mergedWarpMessage = new MergedWarpMessage();
        
        String actual = mergedWarpMessage.toString();
        
        String expected = new String("SeataMergeMessage ");
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testToString2() throws Throwable  {
        MergedWarpMessage mergedWarpMessage = ((MergedWarpMessage) createInstance("io.seata.core.protocol.MergedWarpMessage"));
        setField(mergedWarpMessage, "msgs", null);
        
        List initialMergedWarpMessageMsgs = mergedWarpMessage.msgs;
        
        mergedWarpMessage.toString();
        
        List finalMergedWarpMessageMsgs = mergedWarpMessage.msgs;
        
        assertNull(finalMergedWarpMessageMsgs);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testToString3() throws Throwable  {
        MergedWarpMessage mergedWarpMessage = ((MergedWarpMessage) createInstance("io.seata.core.protocol.MergedWarpMessage"));
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        setField(mergedWarpMessage, "msgs", arrayList);
        
        mergedWarpMessage.toString();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDecode1() throws Throwable  {
        MergedWarpMessage mergedWarpMessage = new MergedWarpMessage();
        
        mergedWarpMessage.decode(((ByteBuf) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDecode2() throws Throwable  {
        MergedWarpMessage mergedWarpMessage = ((MergedWarpMessage) createInstance("io.seata.core.protocol.MergedWarpMessage"));
        
        mergedWarpMessage.decode(((ByteBuf) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDecode3() throws Throwable  {
        MergedWarpMessage mergedWarpMessage = ((MergedWarpMessage) createInstance("io.seata.core.protocol.MergedWarpMessage"));
        EmptyByteBuf emptyByteBuf = ((EmptyByteBuf) createInstance("io.netty.buffer.EmptyByteBuf"));
        
        boolean actual = mergedWarpMessage.decode(emptyByteBuf);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDecode4() throws Throwable  {
        MergedWarpMessage mergedWarpMessage = ((MergedWarpMessage) createInstance("io.seata.core.protocol.MergedWarpMessage"));
        SwappedByteBuf swappedByteBuf = ((SwappedByteBuf) createInstance("io.netty.buffer.SwappedByteBuf"));
        Object unsafeHeapSwappedByteBuf = createInstance("io.netty.buffer.UnsafeHeapSwappedByteBuf");
        Object unsafeHeapSwappedByteBuf1 = createInstance("io.netty.buffer.UnsafeHeapSwappedByteBuf");
        Object simpleLeakAwareByteBuf = createInstance("io.netty.buffer.SimpleLeakAwareByteBuf");
        EmptyByteBuf emptyByteBuf = ((EmptyByteBuf) createInstance("io.netty.buffer.EmptyByteBuf"));
        setField(simpleLeakAwareByteBuf, "buf", emptyByteBuf);
        setField(unsafeHeapSwappedByteBuf1, "buf", simpleLeakAwareByteBuf);
        setField(unsafeHeapSwappedByteBuf, "buf", unsafeHeapSwappedByteBuf1);
        setField(swappedByteBuf, "buf", unsafeHeapSwappedByteBuf);
        
        boolean actual = mergedWarpMessage.decode(swappedByteBuf);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testEncode1() throws Throwable  {
        MergedWarpMessage mergedWarpMessage = new MergedWarpMessage();
        
        mergedWarpMessage.encode();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testEncode2() throws Throwable  {
        MergedWarpMessage mergedWarpMessage = ((MergedWarpMessage) createInstance("io.seata.core.protocol.MergedWarpMessage"));
        setField(mergedWarpMessage, "msgs", null);
        
        List initialMergedWarpMessageMsgs = mergedWarpMessage.msgs;
        
        mergedWarpMessage.encode();
        
        List finalMergedWarpMessageMsgs = mergedWarpMessage.msgs;
        
        assertNull(finalMergedWarpMessageMsgs);
    }
    ///endregion
    
    
    ///region Errors report for encode
    
    public void testEncode_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Field security is not found in class java.lang.System
        // 
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetTypeCode1() throws Throwable  {
        MergedWarpMessage mergedWarpMessage = new MergedWarpMessage();
        
        short actual = mergedWarpMessage.getTypeCode();
        
        assertEquals((short) 59, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetTypeCode2() throws Throwable  {
        MergedWarpMessage mergedWarpMessage = ((MergedWarpMessage) createInstance("io.seata.core.protocol.MergedWarpMessage"));
        
        short actual = mergedWarpMessage.getTypeCode();
        
        assertEquals((short) 59, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDoDecode1() throws Throwable  {
        MergedWarpMessage mergedWarpMessage = new MergedWarpMessage();
        
        Class mergedWarpMessageClazz = Class.forName("io.seata.core.protocol.MergedWarpMessage");
        Class byteBufferType = Class.forName("java.nio.ByteBuffer");
        Method doDecodeMethod = mergedWarpMessageClazz.getDeclaredMethod("doDecode", byteBufferType);
        doDecodeMethod.setAccessible(true);
        java.lang.Object[] doDecodeMethodArguments = new java.lang.Object[1];
        doDecodeMethodArguments[0] = null;
        try {
            doDecodeMethod.invoke(mergedWarpMessage, doDecodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDoDecode2() throws Throwable  {
        MergedWarpMessage mergedWarpMessage = ((MergedWarpMessage) createInstance("io.seata.core.protocol.MergedWarpMessage"));
        
        Class mergedWarpMessageClazz = Class.forName("io.seata.core.protocol.MergedWarpMessage");
        Class byteBufferType = Class.forName("java.nio.ByteBuffer");
        Method doDecodeMethod = mergedWarpMessageClazz.getDeclaredMethod("doDecode", byteBufferType);
        doDecodeMethod.setAccessible(true);
        java.lang.Object[] doDecodeMethodArguments = new java.lang.Object[1];
        doDecodeMethodArguments[0] = null;
        try {
            doDecodeMethod.invoke(mergedWarpMessage, doDecodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDoDecode3() throws Throwable  {
        MergedWarpMessage mergedWarpMessage = ((MergedWarpMessage) createInstance("io.seata.core.protocol.MergedWarpMessage"));
        Object heapByteBufferR = createInstance("java.nio.HeapByteBufferR");
        setField(heapByteBufferR, "limit", 2);
        setField(heapByteBufferR, "position", 0);
        setField(heapByteBufferR, "bigEndian", true);
        setField(heapByteBufferR, "offset", 1);
        byte[] byteArray = new byte[11];
        byteArray[1] = java.lang.Byte.MIN_VALUE;
        setField(heapByteBufferR, "hb", byteArray);
        
        Class mergedWarpMessageClazz = Class.forName("io.seata.core.protocol.MergedWarpMessage");
        Class heapByteBufferRType = Class.forName("java.nio.ByteBuffer");
        Method doDecodeMethod = mergedWarpMessageClazz.getDeclaredMethod("doDecode", heapByteBufferRType);
        doDecodeMethod.setAccessible(true);
        java.lang.Object[] doDecodeMethodArguments = new java.lang.Object[1];
        doDecodeMethodArguments[0] = heapByteBufferR;
        doDecodeMethod.invoke(mergedWarpMessage, doDecodeMethodArguments);
        
        Object finalHeapByteBufferRPosition = getFieldValue(heapByteBufferR, "position");
        
        assertEquals(2, finalHeapByteBufferRPosition);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDoDecode4() throws Throwable  {
        MergedWarpMessage mergedWarpMessage = ((MergedWarpMessage) createInstance("io.seata.core.protocol.MergedWarpMessage"));
        Object heapByteBufferR = createInstance("java.nio.HeapByteBufferR");
        setField(heapByteBufferR, "limit", 2);
        setField(heapByteBufferR, "position", 0);
        setField(heapByteBufferR, "bigEndian", true);
        setField(heapByteBufferR, "offset", 1);
        byte[] byteArray = new byte[11];
        byteArray[1] = (byte) 1;
        setField(heapByteBufferR, "hb", byteArray);
        
        Class mergedWarpMessageClazz = Class.forName("io.seata.core.protocol.MergedWarpMessage");
        Class heapByteBufferRType = Class.forName("java.nio.ByteBuffer");
        Method doDecodeMethod = mergedWarpMessageClazz.getDeclaredMethod("doDecode", heapByteBufferRType);
        doDecodeMethod.setAccessible(true);
        java.lang.Object[] doDecodeMethodArguments = new java.lang.Object[1];
        doDecodeMethodArguments[0] = heapByteBufferR;
        try {
            doDecodeMethod.invoke(mergedWarpMessage, doDecodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        Object finalHeapByteBufferRPosition = getFieldValue(heapByteBufferR, "position");
        
        assertEquals(2, finalHeapByteBufferRPosition);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDoDecode5() throws Throwable  {
        MergedWarpMessage mergedWarpMessage = ((MergedWarpMessage) createInstance("io.seata.core.protocol.MergedWarpMessage"));
        Object directByteBufferR = createInstance("java.nio.DirectByteBufferR");
        setField(directByteBufferR, "address", 0L);
        setField(directByteBufferR, "limit", -2144337664);
        setField(directByteBufferR, "position", 1425595886);
        
        Class mergedWarpMessageClazz = Class.forName("io.seata.core.protocol.MergedWarpMessage");
        Class directByteBufferRType = Class.forName("java.nio.ByteBuffer");
        Method doDecodeMethod = mergedWarpMessageClazz.getDeclaredMethod("doDecode", directByteBufferRType);
        doDecodeMethod.setAccessible(true);
        java.lang.Object[] doDecodeMethodArguments = new java.lang.Object[1];
        doDecodeMethodArguments[0] = directByteBufferR;
        try {
            doDecodeMethod.invoke(mergedWarpMessage, doDecodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        Object finalDirectByteBufferRPosition = getFieldValue(directByteBufferR, "position");
        
        assertEquals(1425595888, finalDirectByteBufferRPosition);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDoDecode6() throws Throwable  {
        MergedWarpMessage mergedWarpMessage = ((MergedWarpMessage) createInstance("io.seata.core.protocol.MergedWarpMessage"));
        Object directByteBufferR = createInstance("java.nio.DirectByteBufferR");
        setField(directByteBufferR, "address", 0L);
        setField(directByteBufferR, "limit", -2147483136);
        setField(directByteBufferR, "position", 1102979025);
        
        Class mergedWarpMessageClazz = Class.forName("io.seata.core.protocol.MergedWarpMessage");
        Class directByteBufferRType = Class.forName("java.nio.ByteBuffer");
        Method doDecodeMethod = mergedWarpMessageClazz.getDeclaredMethod("doDecode", directByteBufferRType);
        doDecodeMethod.setAccessible(true);
        java.lang.Object[] doDecodeMethodArguments = new java.lang.Object[1];
        doDecodeMethodArguments[0] = directByteBufferR;
        try {
            doDecodeMethod.invoke(mergedWarpMessage, doDecodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        Object finalDirectByteBufferRPosition = getFieldValue(directByteBufferR, "position");
        
        assertEquals(1102979027, finalDirectByteBufferRPosition);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDoDecode7() throws Throwable  {
        MergedWarpMessage mergedWarpMessage = ((MergedWarpMessage) createInstance("io.seata.core.protocol.MergedWarpMessage"));
        Object heapByteBufferR = createInstance("java.nio.HeapByteBufferR");
        setField(heapByteBufferR, "limit", -1006764024);
        setField(heapByteBufferR, "position", -1140981759);
        setField(heapByteBufferR, "bigEndian", true);
        setField(heapByteBufferR, "offset", 1140981760);
        byte[] byteArray = new byte[15];
        byteArray[1] = (byte) 1;
        byteArray[4] = (byte) 8;
        setField(heapByteBufferR, "hb", byteArray);
        
        Class mergedWarpMessageClazz = Class.forName("io.seata.core.protocol.MergedWarpMessage");
        Class heapByteBufferRType = Class.forName("java.nio.ByteBuffer");
        Method doDecodeMethod = mergedWarpMessageClazz.getDeclaredMethod("doDecode", heapByteBufferRType);
        doDecodeMethod.setAccessible(true);
        java.lang.Object[] doDecodeMethodArguments = new java.lang.Object[1];
        doDecodeMethodArguments[0] = heapByteBufferR;
        try {
            doDecodeMethod.invoke(mergedWarpMessage, doDecodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        Object finalHeapByteBufferRPosition = getFieldValue(heapByteBufferR, "position");
        
        assertEquals(-1140981755, finalHeapByteBufferRPosition);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDoDecode8() throws Throwable  {
        MergedWarpMessage mergedWarpMessage = ((MergedWarpMessage) createInstance("io.seata.core.protocol.MergedWarpMessage"));
        Object heapByteBufferR = createInstance("java.nio.HeapByteBufferR");
        setField(heapByteBufferR, "limit", -1057095672);
        setField(heapByteBufferR, "position", -1073872895);
        setField(heapByteBufferR, "bigEndian", true);
        setField(heapByteBufferR, "offset", 1073872896);
        byte[] byteArray = new byte[15];
        byteArray[1] = (byte) 1;
        byteArray[4] = (byte) 15;
        setField(heapByteBufferR, "hb", byteArray);
        
        Class mergedWarpMessageClazz = Class.forName("io.seata.core.protocol.MergedWarpMessage");
        Class heapByteBufferRType = Class.forName("java.nio.ByteBuffer");
        Method doDecodeMethod = mergedWarpMessageClazz.getDeclaredMethod("doDecode", heapByteBufferRType);
        doDecodeMethod.setAccessible(true);
        java.lang.Object[] doDecodeMethodArguments = new java.lang.Object[1];
        doDecodeMethodArguments[0] = heapByteBufferR;
        try {
            doDecodeMethod.invoke(mergedWarpMessage, doDecodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        Object finalHeapByteBufferRPosition = getFieldValue(heapByteBufferR, "position");
        
        assertEquals(-1073872887, finalHeapByteBufferRPosition);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDoDecode9() throws Throwable  {
        MergedWarpMessage mergedWarpMessage = ((MergedWarpMessage) createInstance("io.seata.core.protocol.MergedWarpMessage"));
        Object heapByteBufferR = createInstance("java.nio.HeapByteBufferR");
        setField(heapByteBufferR, "limit", -1057095672);
        setField(heapByteBufferR, "position", -1073872895);
        setField(heapByteBufferR, "bigEndian", true);
        setField(heapByteBufferR, "offset", 1073872896);
        byte[] byteArray = new byte[15];
        byteArray[1] = (byte) 1;
        byteArray[4] = (byte) 21;
        setField(heapByteBufferR, "hb", byteArray);
        
        Class mergedWarpMessageClazz = Class.forName("io.seata.core.protocol.MergedWarpMessage");
        Class heapByteBufferRType = Class.forName("java.nio.ByteBuffer");
        Method doDecodeMethod = mergedWarpMessageClazz.getDeclaredMethod("doDecode", heapByteBufferRType);
        doDecodeMethod.setAccessible(true);
        java.lang.Object[] doDecodeMethodArguments = new java.lang.Object[1];
        doDecodeMethodArguments[0] = heapByteBufferR;
        try {
            doDecodeMethod.invoke(mergedWarpMessage, doDecodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        Object finalHeapByteBufferRPosition = getFieldValue(heapByteBufferR, "position");
        
        assertEquals(-1073872878, finalHeapByteBufferRPosition);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testMergedWarpMessage1() {
        MergedWarpMessage actual = new MergedWarpMessage();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testMergedWarpMessage2() {
        MergedWarpMessage actual = new MergedWarpMessage();
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
