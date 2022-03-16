package com.google.common.collect;

import org.junit.Test;
import java.util.TreeMap;
import java.util.LinkedHashMap;
import java.util.Map;
import sun.security.util.ByteArrayLexOrder;
import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import sun.misc.Unsafe;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNull;

public class TreeRangeMapTest {
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testEquals1() throws Throwable  {
        TreeRangeMap treeRangeMap = ((TreeRangeMap) createInstance("com.google.common.collect.TreeRangeMap"));
        ImmutableRangeMap immutableRangeMap = ((ImmutableRangeMap) createInstance("com.google.common.collect.ImmutableRangeMap"));
        
        treeRangeMap.equals(immutableRangeMap);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testHashCode1() throws Throwable  {
        TreeRangeMap treeRangeMap = ((TreeRangeMap) createInstance("com.google.common.collect.TreeRangeMap"));
        TreeMap treeMap = ((TreeMap) createInstance("java.util.TreeMap"));
        CartesianList cartesianList = ((CartesianList) createInstance("com.google.common.collect.CartesianList"));
        setField(treeMap, "values", cartesianList);
        setField(treeRangeMap, "entriesByLowerBound", treeMap);
        
        treeRangeMap.hashCode();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testToString1() throws Throwable  {
        TreeRangeMap treeRangeMap = ((TreeRangeMap) createInstance("com.google.common.collect.TreeRangeMap"));
        TreeMap treeMap = ((TreeMap) createInstance("java.util.TreeMap"));
        setField(treeMap, "values", null);
        setField(treeMap, "modCount", 0);
        setField(treeMap, "root", null);
        setField(treeRangeMap, "entriesByLowerBound", treeMap);
        
        String actual = treeRangeMap.toString();
        
        String expected = new String("[]");
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testPutCoalescing1() throws Throwable  {
        TreeRangeMap treeRangeMap = ((TreeRangeMap) createInstance("com.google.common.collect.TreeRangeMap"));
        Object unmodifiableNavigableMap = createInstance("java.util.Collections$UnmodifiableNavigableMap");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        setField(unmodifiableNavigableMap, "m", linkedHashMap);
        setField(treeRangeMap, "entriesByLowerBound", unmodifiableNavigableMap);
        Range range = ((Range) createInstance("com.google.common.collect.Range"));
        
        treeRangeMap.putCoalescing(range, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testSpan1() throws Throwable  {
        TreeRangeMap treeRangeMap = ((TreeRangeMap) createInstance("com.google.common.collect.TreeRangeMap"));
        TreeMap treeMap = ((TreeMap) createInstance("java.util.TreeMap"));
        setField(treeRangeMap, "entriesByLowerBound", treeMap);
        
        treeRangeMap.span();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testSpan2() throws Throwable  {
        TreeRangeMap treeRangeMap = ((TreeRangeMap) createInstance("com.google.common.collect.TreeRangeMap"));
        TreeMap treeMap = ((TreeMap) createInstance("java.util.TreeMap"));
        Object entry = createInstance("java.util.TreeMap$Entry");
        Object entry1 = createInstance("java.util.TreeMap$Entry");
        setField(entry1, "left", null);
        setField(entry, "left", entry1);
        setField(treeMap, "root", entry);
        setField(treeRangeMap, "entriesByLowerBound", treeMap);
        
        treeRangeMap.span();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testAsMapOfRanges1() throws Throwable  {
        TreeRangeMap treeRangeMap = ((TreeRangeMap) createInstance("com.google.common.collect.TreeRangeMap"));
        TreeMap treeMap = ((TreeMap) createInstance("java.util.TreeMap"));
        Object linkedValues = createInstance("java.util.LinkedHashMap$LinkedValues");
        setField(treeMap, "values", linkedValues);
        setField(treeRangeMap, "entriesByLowerBound", treeMap);
        
        Map actual = treeRangeMap.asMapOfRanges();
        
        Object expected = createInstance("com.google.common.collect.TreeRangeMap$AsMapOfRanges");
        setField(expected, "entryIterable", linkedValues);
        setField(expected, "this$0", treeRangeMap);
        setField(expected, "keySet", null);
        setField(expected, "values", null);
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testAsMapOfRanges2() throws Throwable  {
        TreeRangeMap treeRangeMap = ((TreeRangeMap) createInstance("com.google.common.collect.TreeRangeMap"));
        ImmutableSortedMap immutableSortedMap = ((ImmutableSortedMap) createInstance("com.google.common.collect.ImmutableSortedMap"));
        Object values = createInstance("com.google.common.collect.RegularImmutableTable$Values");
        setField(immutableSortedMap, "valueList", values);
        setField(treeRangeMap, "entriesByLowerBound", immutableSortedMap);
        
        Map actual = treeRangeMap.asMapOfRanges();
        
        Object expected = createInstance("com.google.common.collect.TreeRangeMap$AsMapOfRanges");
        setField(expected, "entryIterable", values);
        setField(expected, "this$0", treeRangeMap);
        setField(expected, "keySet", null);
        setField(expected, "values", null);
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testAsDescendingMapOfRanges1() throws Throwable  {
        TreeRangeMap treeRangeMap = ((TreeRangeMap) createInstance("com.google.common.collect.TreeRangeMap"));
        ImmutableSortedMap immutableSortedMap = ((ImmutableSortedMap) createInstance("com.google.common.collect.ImmutableSortedMap"));
        setField(immutableSortedMap, "descendingMap", null);
        RegularImmutableList regularImmutableList = ((RegularImmutableList) createInstance("com.google.common.collect.RegularImmutableList"));
        java.lang.Object[] objectArray = new java.lang.Object[0];
        setField(regularImmutableList, "array", objectArray);
        setField(immutableSortedMap, "valueList", regularImmutableList);
        setField(treeRangeMap, "entriesByLowerBound", immutableSortedMap);
        
        treeRangeMap.asDescendingMapOfRanges();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testAsDescendingMapOfRanges2() throws Throwable  {
        TreeRangeMap treeRangeMap = ((TreeRangeMap) createInstance("com.google.common.collect.TreeRangeMap"));
        ImmutableSortedMap immutableSortedMap = ((ImmutableSortedMap) createInstance("com.google.common.collect.ImmutableSortedMap"));
        setField(immutableSortedMap, "descendingMap", immutableSortedMap);
        setField(treeRangeMap, "entriesByLowerBound", immutableSortedMap);
        
        Map actual = treeRangeMap.asDescendingMapOfRanges();
        
        Object expected = createInstance("com.google.common.collect.TreeRangeMap$AsMapOfRanges");
        setField(expected, "entryIterable", null);
        setField(expected, "this$0", treeRangeMap);
        setField(expected, "keySet", null);
        setField(expected, "values", null);
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
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
        Range range = ((Range) createInstance("com.google.common.collect.Range"));
        Object belowAll = createInstance("com.google.common.collect.Cut$BelowAll");
        setField(range, "upperBound", belowAll);
        setField(range, "lowerBound", belowAll);
        
        treeRangeMap.remove(range);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testRemove3() throws Throwable  {
        TreeRangeMap treeRangeMap = ((TreeRangeMap) createInstance("com.google.common.collect.TreeRangeMap"));
        TreeMap treeMap = ((TreeMap) createInstance("java.util.TreeMap"));
        Object entry = createInstance("java.util.TreeMap$Entry");
        setField(entry, "key", null);
        setField(treeMap, "root", entry);
        ByteArrayLexOrder byteArrayLexOrder = ((ByteArrayLexOrder) createInstance("sun.security.util.ByteArrayLexOrder"));
        setField(treeMap, "comparator", byteArrayLexOrder);
        setField(treeRangeMap, "entriesByLowerBound", treeMap);
        Range range = ((Range) createInstance("com.google.common.collect.Range"));
        Object belowAll = createInstance("com.google.common.collect.Cut$BelowAll");
        setField(range, "upperBound", belowAll);
        Object belowAll1 = createInstance("com.google.common.collect.Cut$BelowAll");
        setField(range, "lowerBound", belowAll1);
        
        treeRangeMap.remove(range);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testRemove4() throws Throwable  {
        TreeRangeMap treeRangeMap = ((TreeRangeMap) createInstance("com.google.common.collect.TreeRangeMap"));
        TreeMap treeMap = ((TreeMap) createInstance("java.util.TreeMap"));
        setField(treeRangeMap, "entriesByLowerBound", treeMap);
        Range range = ((Range) createInstance("com.google.common.collect.Range"));
        Object belowAll = createInstance("com.google.common.collect.Cut$BelowAll");
        setField(range, "upperBound", belowAll);
        Object belowAll1 = createInstance("com.google.common.collect.Cut$BelowAll");
        setField(range, "lowerBound", belowAll1);
        
        treeRangeMap.remove(range);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGet1() throws Throwable  {
        TreeRangeMap treeRangeMap = ((TreeRangeMap) createInstance("com.google.common.collect.TreeRangeMap"));
        Object synchronizedNavigableMap = createInstance("java.util.Collections$SynchronizedNavigableMap");
        setField(treeRangeMap, "entriesByLowerBound", synchronizedNavigableMap);
        
        treeRangeMap.get(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGet2() throws Throwable  {
        TreeRangeMap treeRangeMap = ((TreeRangeMap) createInstance("com.google.common.collect.TreeRangeMap"));
        TreeMap treeMap = ((TreeMap) createInstance("java.util.TreeMap"));
        setField(treeMap, "root", null);
        setField(treeRangeMap, "entriesByLowerBound", treeMap);
        Object directByteBufferR = createInstance("java.nio.DirectByteBufferR");
        
        Class treeRangeMapClazz = Class.forName("com.google.common.collect.TreeRangeMap");
        Class directByteBufferRType = Class.forName("java.lang.Comparable");
        Method getMethod = treeRangeMapClazz.getDeclaredMethod("get", directByteBufferRType);
        getMethod.setAccessible(true);
        java.lang.Object[] getMethodArguments = new java.lang.Object[1];
        getMethodArguments[0] = directByteBufferR;
        Object actual = getMethod.invoke(treeRangeMap, getMethodArguments);
        
        assertNull(actual);
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
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testPut2() throws Throwable  {
        TreeRangeMap treeRangeMap = ((TreeRangeMap) createInstance("com.google.common.collect.TreeRangeMap"));
        Range range = ((Range) createInstance("com.google.common.collect.Range"));
        Object belowAll = createInstance("com.google.common.collect.Cut$BelowAll");
        setField(range, "upperBound", belowAll);
        Object belowAll1 = createInstance("com.google.common.collect.Cut$BelowAll");
        setField(range, "lowerBound", belowAll1);
        
        treeRangeMap.put(range, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testPut3() throws Throwable  {
        TreeRangeMap treeRangeMap = ((TreeRangeMap) createInstance("com.google.common.collect.TreeRangeMap"));
        Range range = ((Range) createInstance("com.google.common.collect.Range"));
        Object belowAll = createInstance("com.google.common.collect.Cut$BelowAll");
        setField(range, "upperBound", belowAll);
        setField(range, "lowerBound", belowAll);
        
        treeRangeMap.put(range, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testPut4() throws Throwable  {
        TreeRangeMap treeRangeMap = ((TreeRangeMap) createInstance("com.google.common.collect.TreeRangeMap"));
        Range range = ((Range) createInstance("com.google.common.collect.Range"));
        Object belowAll = createInstance("com.google.common.collect.Cut$BelowAll");
        setField(range, "upperBound", belowAll);
        Object belowAll1 = createInstance("com.google.common.collect.Cut$BelowAll");
        setField(range, "lowerBound", belowAll1);
        java.lang.Object[] defaultProgressMeteringPolicyArray = createArray("sun.net.DefaultProgressMeteringPolicy", 0);
        
        treeRangeMap.put(range, defaultProgressMeteringPolicyArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testPut5() throws Throwable  {
        TreeRangeMap treeRangeMap = ((TreeRangeMap) createInstance("com.google.common.collect.TreeRangeMap"));
        Range range = ((Range) createInstance("com.google.common.collect.Range"));
        Object aboveAll = createInstance("com.google.common.collect.Cut$AboveAll");
        setField(range, "upperBound", aboveAll);
        Object aboveValue = createInstance("com.google.common.collect.Cut$AboveValue");
        setField(range, "lowerBound", aboveValue);
        
        treeRangeMap.put(range, null);
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
        ImmutableRangeMap immutableRangeMap = ((ImmutableRangeMap) createInstance("com.google.common.collect.ImmutableRangeMap"));
        SingletonImmutableList singletonImmutableList = ((SingletonImmutableList) createInstance("com.google.common.collect.SingletonImmutableList"));
        setField(immutableRangeMap, "ranges", singletonImmutableList);
        
        treeRangeMap.putAll(immutableRangeMap);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testPutAll3() throws Throwable  {
        TreeRangeMap treeRangeMap = ((TreeRangeMap) createInstance("com.google.common.collect.TreeRangeMap"));
        ImmutableRangeMap immutableRangeMap = ((ImmutableRangeMap) createInstance("com.google.common.collect.ImmutableRangeMap"));
        RegularImmutableList regularImmutableList = ((RegularImmutableList) createInstance("com.google.common.collect.RegularImmutableList"));
        java.lang.Object[] objectArray = new java.lang.Object[0];
        setField(regularImmutableList, "array", objectArray);
        setField(immutableRangeMap, "ranges", regularImmutableList);
        
        treeRangeMap.putAll(immutableRangeMap);
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
