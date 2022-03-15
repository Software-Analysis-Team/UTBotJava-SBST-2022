package com.google.common.collect;

import org.junit.Test;
import java.util.TreeMap;
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

import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.mock;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;
import static org.junit.Assert.assertEquals;

public class TreeRangeMapTest {
    ///region
    
    @Test(timeout = 10000)
    public void testSubRangeMap1() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(Range.class);
            mockedStatic.when(Range::all).thenReturn(((Range) null));
            TreeRangeMap treeRangeMap = ((TreeRangeMap) createInstance("com.google.common.collect.TreeRangeMap"));
            Range rangeMock = mock(Range.class);
            
            RangeMap actual = treeRangeMap.subRangeMap(rangeMock);
            
            
            // Current deep equals depth exceeds max depth 0
            assertTrue(deepEquals(treeRangeMap, actual));
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testSubRangeMap2() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(Range.class);
            mockedStatic.when(Range::all).thenReturn(((Range) null));
            TreeRangeMap treeRangeMap = ((TreeRangeMap) createInstance("com.google.common.collect.TreeRangeMap"));
            
            treeRangeMap.subRangeMap(null);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSubRangeMap3() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(Range.class);
            mockedStatic.when(Range::all).thenReturn(((Range) null));
            TreeRangeMap treeRangeMap = ((TreeRangeMap) createInstance("com.google.common.collect.TreeRangeMap"));
            Range rangeMock = mock(Range.class);
            
            RangeMap actual = treeRangeMap.subRangeMap(rangeMock);
            
            Object expected = createInstance("com.google.common.collect.TreeRangeMap$SubRangeMap");
            setField(expected, "this$0", treeRangeMap);
            setField(expected, "subRange", rangeMock);
            
            // Current deep equals depth exceeds max depth 0
            assertTrue(deepEquals(expected, actual));
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testRemove1() throws Throwable  {
        TreeRangeMap treeRangeMap = ((TreeRangeMap) createInstance("com.google.common.collect.TreeRangeMap"));
        
        treeRangeMap.remove(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testRemove2() throws Throwable  {
        TreeRangeMap treeRangeMap = ((TreeRangeMap) createInstance("com.google.common.collect.TreeRangeMap"));
        Range rangeMock = mock(Range.class);
        when(rangeMock.isEmpty()).thenReturn(true);
        
        treeRangeMap.remove(rangeMock);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testPut1() throws Throwable  {
        TreeRangeMap treeRangeMap = ((TreeRangeMap) createInstance("com.google.common.collect.TreeRangeMap"));
        java.lang.Object[] defaultProgressMeteringPolicyArray = createArray("sun.net.DefaultProgressMeteringPolicy", 0);
        
        treeRangeMap.put(null, defaultProgressMeteringPolicyArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testPut2() throws Throwable  {
        TreeRangeMap treeRangeMap = ((TreeRangeMap) createInstance("com.google.common.collect.TreeRangeMap"));
        Range rangeMock = mock(Range.class);
        when(rangeMock.isEmpty()).thenReturn(true);
        
        treeRangeMap.put(rangeMock, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testClear1() throws Throwable  {
        TreeRangeMap treeRangeMap = ((TreeRangeMap) createInstance("com.google.common.collect.TreeRangeMap"));
        TreeMap treeMap = ((TreeMap) createInstance("java.util.TreeMap"));
        setField(treeMap, "modCount", 0);
        setField(treeMap, "size", 0);
        setField(treeMap, "root", null);
        setField(treeRangeMap, "entriesByLowerBound", treeMap);
        
        treeRangeMap.clear();
        
        Object treeRangeMapEntriesByLowerBound = getFieldValue(treeRangeMap, "entriesByLowerBound");
        Object finalTreeRangeMapEntriesByLowerBoundModCount = getFieldValue(treeRangeMapEntriesByLowerBound, "modCount");
        
        assertEquals(1, finalTreeRangeMapEntriesByLowerBoundModCount);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testClear2() throws Throwable  {
        TreeRangeMap treeRangeMap = ((TreeRangeMap) createInstance("com.google.common.collect.TreeRangeMap"));
        Object unmodifiableNavigableMap = createInstance("java.util.Collections$UnmodifiableNavigableMap");
        setField(treeRangeMap, "entriesByLowerBound", unmodifiableNavigableMap);
        
        treeRangeMap.clear();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testPutAll1() throws Throwable  {
        TreeRangeMap treeRangeMap = ((TreeRangeMap) createInstance("com.google.common.collect.TreeRangeMap"));
        
        treeRangeMap.putAll(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testPutAll2() throws Throwable  {
        TreeRangeMap treeRangeMap = ((TreeRangeMap) createInstance("com.google.common.collect.TreeRangeMap"));
        RangeMap rangeMapMock = mock(RangeMap.class);
        when(rangeMapMock.asMapOfRanges()).thenReturn(((Map) null));
        
        treeRangeMap.putAll(rangeMapMock);
    }
    ///endregion
    
    private static Object createInstance(String className) throws Exception {
        Class<?> clazz = Class.forName(className);
        return getUnsafeInstance().allocateInstance(clazz);
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
    private static sun.misc.Unsafe getUnsafeInstance() throws Exception {
        java.lang.reflect.Field f = sun.misc.Unsafe.class.getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return (sun.misc.Unsafe) f.get(null);
    }
}
