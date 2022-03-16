package com.google.common.collect;

import org.junit.Test;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Map;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import sun.misc.Unsafe;

import static org.junit.Assert.assertTrue;

public class TopKSelectorTest {
    ///region
    
    @Test(timeout = 10000)
    public void testOffer1() throws Throwable  {
        TopKSelector topKSelector = ((TopKSelector) createInstance("com.google.common.collect.TopKSelector"));
        Object object = new Object();
        
        topKSelector.offer(object);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testOffer2() throws Throwable  {
        TopKSelector topKSelector = ((TopKSelector) createInstance("com.google.common.collect.TopKSelector"));
        setField(topKSelector, "k", 0);
        
        topKSelector.offer(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testTrim1() throws Throwable  {
        TopKSelector topKSelector = ((TopKSelector) createInstance("com.google.common.collect.TopKSelector"));
        
        Class topKSelectorClazz = Class.forName("com.google.common.collect.TopKSelector");
        Method trimMethod = topKSelectorClazz.getDeclaredMethod("trim");
        trimMethod.setAccessible(true);
        java.lang.Object[] trimMethodArguments = new java.lang.Object[0];
        try {
            trimMethod.invoke(topKSelector, trimMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testTrim2() throws Throwable  {
        TopKSelector topKSelector = ((TopKSelector) createInstance("com.google.common.collect.TopKSelector"));
        setField(topKSelector, "k", 0);
        
        Class topKSelectorClazz = Class.forName("com.google.common.collect.TopKSelector");
        Method trimMethod = topKSelectorClazz.getDeclaredMethod("trim");
        trimMethod.setAccessible(true);
        java.lang.Object[] trimMethodArguments = new java.lang.Object[0];
        try {
            trimMethod.invoke(topKSelector, trimMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCombine1() throws Throwable  {
        TopKSelector topKSelector = ((TopKSelector) createInstance("com.google.common.collect.TopKSelector"));
        TopKSelector topKSelector1 = ((TopKSelector) createInstance("com.google.common.collect.TopKSelector"));
        
        TopKSelector actual = topKSelector.combine(topKSelector1);
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(topKSelector, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCombine2() throws Throwable  {
        TopKSelector topKSelector = ((TopKSelector) createInstance("com.google.common.collect.TopKSelector"));
        
        topKSelector.combine(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCombine3() throws Throwable  {
        TopKSelector topKSelector = ((TopKSelector) createInstance("com.google.common.collect.TopKSelector"));
        setField(topKSelector, "bufferSize", -2147483647);
        
        TopKSelector actual = topKSelector.combine(topKSelector);
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(topKSelector, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCombine4() throws Throwable  {
        TopKSelector topKSelector = ((TopKSelector) createInstance("com.google.common.collect.TopKSelector"));
        setField(topKSelector, "bufferSize", 32);
        java.lang.Object[] objectArray = new java.lang.Object[16];
        setField(topKSelector, "buffer", objectArray);
        TopKSelector topKSelector1 = ((TopKSelector) createInstance("com.google.common.collect.TopKSelector"));
        setField(topKSelector1, "bufferSize", 32);
        setField(topKSelector1, "buffer", objectArray);
        
        topKSelector.combine(topKSelector1);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testSwap1() throws Throwable  {
        TopKSelector topKSelector = ((TopKSelector) createInstance("com.google.common.collect.TopKSelector"));
        
        Class topKSelectorClazz = Class.forName("com.google.common.collect.TopKSelector");
        Class intType = int.class;
        Method swapMethod = topKSelectorClazz.getDeclaredMethod("swap", intType, intType);
        swapMethod.setAccessible(true);
        java.lang.Object[] swapMethodArguments = new java.lang.Object[2];
        swapMethodArguments[0] = 0;
        swapMethodArguments[1] = 0;
        try {
            swapMethod.invoke(topKSelector, swapMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testSwap2() throws Throwable  {
        TopKSelector topKSelector = ((TopKSelector) createInstance("com.google.common.collect.TopKSelector"));
        java.lang.Object[] objectArray = new java.lang.Object[40];
        setField(topKSelector, "buffer", objectArray);
        
        Class topKSelectorClazz = Class.forName("com.google.common.collect.TopKSelector");
        Class intType = int.class;
        Method swapMethod = topKSelectorClazz.getDeclaredMethod("swap", intType, intType);
        swapMethod.setAccessible(true);
        java.lang.Object[] swapMethodArguments = new java.lang.Object[2];
        swapMethodArguments[0] = 40;
        swapMethodArguments[1] = 0;
        try {
            swapMethod.invoke(topKSelector, swapMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testSwap3() throws Throwable  {
        TopKSelector topKSelector = ((TopKSelector) createInstance("com.google.common.collect.TopKSelector"));
        java.lang.Object[] objectArray = new java.lang.Object[40];
        Object object = createInstance("java.lang.Object");
        objectArray[1] = object;
        objectArray[2] = object;
        objectArray[3] = object;
        objectArray[4] = object;
        objectArray[5] = object;
        objectArray[6] = object;
        objectArray[7] = object;
        objectArray[8] = object;
        objectArray[9] = object;
        objectArray[10] = object;
        objectArray[11] = object;
        objectArray[12] = object;
        objectArray[13] = object;
        objectArray[14] = object;
        objectArray[15] = object;
        objectArray[16] = object;
        objectArray[17] = object;
        objectArray[18] = object;
        objectArray[19] = object;
        objectArray[20] = object;
        objectArray[21] = object;
        objectArray[22] = object;
        objectArray[23] = object;
        objectArray[24] = object;
        objectArray[25] = object;
        objectArray[26] = object;
        objectArray[27] = object;
        objectArray[28] = object;
        objectArray[29] = object;
        objectArray[30] = object;
        objectArray[31] = object;
        objectArray[32] = object;
        objectArray[33] = object;
        objectArray[34] = object;
        objectArray[35] = object;
        objectArray[36] = object;
        objectArray[37] = object;
        objectArray[38] = object;
        objectArray[39] = object;
        setField(topKSelector, "buffer", objectArray);
        
        Class topKSelectorClazz = Class.forName("com.google.common.collect.TopKSelector");
        Class intType = int.class;
        Method swapMethod = topKSelectorClazz.getDeclaredMethod("swap", intType, intType);
        swapMethod.setAccessible(true);
        java.lang.Object[] swapMethodArguments = new java.lang.Object[2];
        swapMethodArguments[0] = 0;
        swapMethodArguments[1] = 40;
        try {
            swapMethod.invoke(topKSelector, swapMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testPartition1() throws Throwable  {
        TopKSelector topKSelector = ((TopKSelector) createInstance("com.google.common.collect.TopKSelector"));
        
        Class topKSelectorClazz = Class.forName("com.google.common.collect.TopKSelector");
        Class intType = int.class;
        Method partitionMethod = topKSelectorClazz.getDeclaredMethod("partition", intType, intType, intType);
        partitionMethod.setAccessible(true);
        java.lang.Object[] partitionMethodArguments = new java.lang.Object[3];
        partitionMethodArguments[0] = 0;
        partitionMethodArguments[1] = 0;
        partitionMethodArguments[2] = 0;
        try {
            partitionMethod.invoke(topKSelector, partitionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testPartition2() throws Throwable  {
        TopKSelector topKSelector = ((TopKSelector) createInstance("com.google.common.collect.TopKSelector"));
        java.lang.Object[] objectArray = new java.lang.Object[40];
        setField(topKSelector, "buffer", objectArray);
        
        Class topKSelectorClazz = Class.forName("com.google.common.collect.TopKSelector");
        Class intType = int.class;
        Method partitionMethod = topKSelectorClazz.getDeclaredMethod("partition", intType, intType, intType);
        partitionMethod.setAccessible(true);
        java.lang.Object[] partitionMethodArguments = new java.lang.Object[3];
        partitionMethodArguments[0] = 0;
        partitionMethodArguments[1] = 0;
        partitionMethodArguments[2] = 40;
        try {
            partitionMethod.invoke(topKSelector, partitionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testPartition3() throws Throwable  {
        TopKSelector topKSelector = ((TopKSelector) createInstance("com.google.common.collect.TopKSelector"));
        java.lang.Object[] objectArray = new java.lang.Object[9];
        Object object = createInstance("java.lang.Object");
        objectArray[1] = object;
        objectArray[2] = object;
        objectArray[3] = object;
        objectArray[4] = object;
        objectArray[5] = object;
        objectArray[6] = object;
        objectArray[7] = object;
        objectArray[8] = object;
        setField(topKSelector, "buffer", objectArray);
        
        Class topKSelectorClazz = Class.forName("com.google.common.collect.TopKSelector");
        Class intType = int.class;
        Method partitionMethod = topKSelectorClazz.getDeclaredMethod("partition", intType, intType, intType);
        partitionMethod.setAccessible(true);
        java.lang.Object[] partitionMethodArguments = new java.lang.Object[3];
        partitionMethodArguments[0] = 0;
        partitionMethodArguments[1] = Integer.MIN_VALUE;
        partitionMethodArguments[2] = 0;
        try {
            partitionMethod.invoke(topKSelector, partitionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testTopK1() throws Throwable  {
        TopKSelector topKSelector = ((TopKSelector) createInstance("com.google.common.collect.TopKSelector"));
        
        topKSelector.topK();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testTopK2() throws Throwable  {
        TopKSelector topKSelector = ((TopKSelector) createInstance("com.google.common.collect.TopKSelector"));
        setField(topKSelector, "bufferSize", Integer.MIN_VALUE);
        java.lang.Object[] objectArray = new java.lang.Object[9];
        setField(topKSelector, "buffer", objectArray);
        Class lexicographicalComparatorClazz = Class.forName("com.google.common.primitives.SignedBytes$LexicographicalComparator");
        Object lexicographicalComparator = getEnumConstantByName(lexicographicalComparatorClazz, "INSTANCE");
        setField(topKSelector, "comparator", lexicographicalComparator);
        
        topKSelector.topK();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testOfferAll1() throws Throwable  {
        TopKSelector topKSelector = ((TopKSelector) createInstance("com.google.common.collect.TopKSelector"));
        ArrayList arrayList = new ArrayList();
        
        topKSelector.offerAll(arrayList);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testOfferAll2() throws Throwable  {
        TopKSelector topKSelector = ((TopKSelector) createInstance("com.google.common.collect.TopKSelector"));
        
        topKSelector.offerAll(((Iterable) null));
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
    private static Object getEnumConstantByName(Class<?> enumClass, String name) throws IllegalAccessException {
        java.lang.reflect.Field[] fields = enumClass.getDeclaredFields();
        for (java.lang.reflect.Field field : fields) {
            String fieldName = field.getName();
            if (field.isEnumConstant() && fieldName.equals(name)) {
                field.setAccessible(true);
                
                return field.get(null);
            }
        }
        
        return null;
    }
    private static sun.misc.Unsafe getUnsafeInstance() throws Exception {
        java.lang.reflect.Field f = sun.misc.Unsafe.class.getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return (sun.misc.Unsafe) f.get(null);
    }
}
