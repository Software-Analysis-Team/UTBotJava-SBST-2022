package com.google.common.collect;

import org.junit.Test;
import com.huawei.utbot.framework.plugin.api.UtNullModel;
import java.util.ArrayList;
import java.util.Iterator;
import sun.text.CompactByteArray;
import java.time.chrono.ThaiBuddhistDate;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Map;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import sun.misc.Unsafe;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.mockStatic;

public class ReverseOrderingTest {
    ///region
    
    @Test(timeout = 10000)
    public void testEquals1() throws Throwable  {
        ReverseOrdering reverseOrdering = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        Object object = new Object();
        
        boolean actual = reverseOrdering.equals(object);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testEquals2() throws Throwable  {
        ReverseOrdering reverseOrdering = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        
        boolean actual = reverseOrdering.equals(reverseOrdering);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testEquals3() throws Throwable  {
        ReverseOrdering reverseOrdering = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        java.lang.Object[] ofDoubleArray = createArray("java.util.stream.SortedOps$OfDouble", 0);
        
        boolean actual = reverseOrdering.equals(ofDoubleArray);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testEquals4() throws Throwable  {
        ReverseOrdering reverseOrdering = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        Ordering orderingMock = mock(Ordering.class);
        setField(reverseOrdering, "forwardOrder", orderingMock);
        ReverseOrdering reverseOrdering1 = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        setField(reverseOrdering1, "forwardOrder", orderingMock);
        
        boolean actual = reverseOrdering.equals(reverseOrdering1);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testHashCode1() throws Throwable  {
        ReverseOrdering reverseOrdering = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        
        reverseOrdering.hashCode();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testHashCode2() throws Throwable  {
        ReverseOrdering reverseOrdering = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        Ordering orderingMock = mock(Ordering.class);
        setField(reverseOrdering, "forwardOrder", orderingMock);
        
        int actual = reverseOrdering.hashCode();
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testToString1() throws Throwable  {
        ReverseOrdering reverseOrdering = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        
        String actual = reverseOrdering.toString();
        
        String expected = new String("null.reverse()");
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testToString2() throws Throwable  {
        ReverseOrdering reverseOrdering = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        Ordering orderingMock = mock(Ordering.class);
        when(orderingMock.toString()).thenReturn(((String) null));
        setField(reverseOrdering, "forwardOrder", orderingMock);
        
        String actual = reverseOrdering.toString();
        
        String expected = new String("null.reverse()");
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCompare1() throws Throwable  {
        ReverseOrdering reverseOrdering = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        Object object = new Object();
        Object object1 = new Object();
        
        reverseOrdering.compare(object, object1);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCompare2() throws Throwable  {
        ReverseOrdering reverseOrdering = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        Ordering orderingMock = mock(Ordering.class);
        when(orderingMock.compare(any(), any())).thenReturn(0);
        setField(reverseOrdering, "forwardOrder", orderingMock);
        com.huawei.utbot.framework.plugin.api.UtNullModel[][] utNullModelArray = new com.huawei.utbot.framework.plugin.api.UtNullModel[0][];
        java.lang.Object[] buildAPIArray = createArray("java.text.RBCollationTables$BuildAPI", 0);
        
        int actual = reverseOrdering.compare(utNullModelArray, buildAPIArray);
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testMin1() throws Throwable  {
        ReverseOrdering reverseOrdering = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        ArrayList arrayList = new ArrayList();
        
        reverseOrdering.min(arrayList);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testMin2() throws Throwable  {
        ReverseOrdering reverseOrdering = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        Ordering orderingMock = mock(Ordering.class);
        java.lang.Object[] contextArray = createArray("jdk.internal.org.objectweb.asm.Context", 0);
        when(orderingMock.max(org.mockito.ArgumentMatchers.any(Iterable.class))).thenReturn(((Object) contextArray));
        setField(reverseOrdering, "forwardOrder", orderingMock);
        
        Object actual = reverseOrdering.min(((Iterable) null));
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(contextArray, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testMin3() throws Throwable  {
        ReverseOrdering reverseOrdering = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        
        reverseOrdering.min(((Iterator) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testMin4() throws Throwable  {
        ReverseOrdering reverseOrdering = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        Ordering orderingMock = mock(Ordering.class);
        sun.text.CompactByteArray[] compactByteArrayArray = new sun.text.CompactByteArray[0];
        when(orderingMock.max(org.mockito.ArgumentMatchers.any(Iterator.class))).thenReturn(((Object) compactByteArrayArray));
        setField(reverseOrdering, "forwardOrder", orderingMock);
        
        Object actual = reverseOrdering.min(((Iterator) null));
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(compactByteArrayArray, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testMin5() throws Throwable  {
        ReverseOrdering reverseOrdering = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        Object object = new Object();
        Object object1 = new Object();
        
        reverseOrdering.min(object, object1);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testMin6() throws Throwable  {
        ReverseOrdering reverseOrdering = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        Ordering orderingMock = mock(Ordering.class);
        when(orderingMock.max(any(), any())).thenReturn(null);
        setField(reverseOrdering, "forwardOrder", orderingMock);
        java.time.chrono.ThaiBuddhistDate[] thaiBuddhistDateArray = new java.time.chrono.ThaiBuddhistDate[0];
        java.lang.Object[] fifoWaitQueueArray = createArray("java.util.concurrent.SynchronousQueue$FifoWaitQueue", 0);
        
        Object actual = reverseOrdering.min(thaiBuddhistDateArray, fifoWaitQueueArray);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testMin7() throws Throwable  {
        ReverseOrdering reverseOrdering = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        Object object = new Object();
        Object object1 = new Object();
        Object object2 = new Object();
        java.lang.Object[] objectArray = new java.lang.Object[0];
        
        reverseOrdering.min(object, object1, object2, objectArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testMin8() throws Throwable  {
        ReverseOrdering reverseOrdering = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        Ordering orderingMock = mock(Ordering.class);
        java.lang.Object[] ofLongArray = createArray("java.util.stream.StreamSpliterators$SliceSpliterator$OfLong", 0);
        when(orderingMock.max(any(), any(), any(), any())).thenReturn(((Object) ofLongArray));
        setField(reverseOrdering, "forwardOrder", orderingMock);
        
        Object actual = reverseOrdering.min(null, null, null, ((java.lang.Object[]) null));
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(ofLongArray, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testMax1() throws Throwable  {
        ReverseOrdering reverseOrdering = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        Object object = new Object();
        Object object1 = new Object();
        
        reverseOrdering.max(object, object1);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testMax2() throws Throwable  {
        ReverseOrdering reverseOrdering = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        Ordering orderingMock = mock(Ordering.class);
        when(orderingMock.min(any(), any())).thenReturn(null);
        setField(reverseOrdering, "forwardOrder", orderingMock);
        java.time.chrono.ThaiBuddhistDate[] thaiBuddhistDateArray = new java.time.chrono.ThaiBuddhistDate[0];
        java.lang.Object[] fifoWaitQueueArray = createArray("java.util.concurrent.SynchronousQueue$FifoWaitQueue", 0);
        
        Object actual = reverseOrdering.max(thaiBuddhistDateArray, fifoWaitQueueArray);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testMax3() throws Throwable  {
        ReverseOrdering reverseOrdering = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        ArrayList arrayList = new ArrayList();
        
        reverseOrdering.max(arrayList);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testMax4() throws Throwable  {
        ReverseOrdering reverseOrdering = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        Ordering orderingMock = mock(Ordering.class);
        java.lang.Object[] ofIntArray = createArray("java.util.stream.Nodes$SizedCollectorTask$OfInt", 0);
        when(orderingMock.min(org.mockito.ArgumentMatchers.any(Iterable.class))).thenReturn(((Object) ofIntArray));
        setField(reverseOrdering, "forwardOrder", orderingMock);
        
        Object actual = reverseOrdering.max(((Iterable) null));
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(ofIntArray, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testMax5() throws Throwable  {
        ReverseOrdering reverseOrdering = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        
        reverseOrdering.max(((Iterator) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testMax6() throws Throwable  {
        ReverseOrdering reverseOrdering = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        Ordering orderingMock = mock(Ordering.class);
        java.lang.Object[] operatorArray = createArray("sun.security.util.DisabledAlgorithmConstraints$Constraint$Operator", 0);
        when(orderingMock.min(org.mockito.ArgumentMatchers.any(Iterator.class))).thenReturn(((Object) operatorArray));
        setField(reverseOrdering, "forwardOrder", orderingMock);
        
        Object actual = reverseOrdering.max(((Iterator) null));
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(operatorArray, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testMax7() throws Throwable  {
        ReverseOrdering reverseOrdering = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        Object object = new Object();
        Object object1 = new Object();
        Object object2 = new Object();
        java.lang.Object[] objectArray = new java.lang.Object[0];
        
        reverseOrdering.max(object, object1, object2, objectArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testMax8() throws Throwable  {
        ReverseOrdering reverseOrdering = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        Ordering orderingMock = mock(Ordering.class);
        when(orderingMock.min(any(), any(), any(), any())).thenReturn(null);
        setField(reverseOrdering, "forwardOrder", orderingMock);
        
        Object actual = reverseOrdering.max(null, null, null, ((java.lang.Object[]) null));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReverse1() throws Throwable  {
        ReverseOrdering reverseOrdering = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        
        Ordering actual = reverseOrdering.reverse();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReverse2() throws Throwable  {
        ReverseOrdering reverseOrdering = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        Ordering orderingMock = mock(Ordering.class);
        setField(reverseOrdering, "forwardOrder", orderingMock);
        
        Ordering actual = reverseOrdering.reverse();
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(orderingMock, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReverseOrdering1() {
        new ReverseOrdering(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReverseOrdering2() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(com.google.common.base.Preconditions.class);
            java.lang.Object[] waitQueueArray = createArray("java.util.concurrent.SynchronousQueue$WaitQueue", 0);
            mockedStatic.when(() -> {
                com.google.common.base.Preconditions.checkNotNull(any());
            }).thenReturn(((Object) waitQueueArray));
            new ReverseOrdering(null);
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
    private static sun.misc.Unsafe getUnsafeInstance() throws Exception {
        java.lang.reflect.Field f = sun.misc.Unsafe.class.getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return (sun.misc.Unsafe) f.get(null);
    }
}
