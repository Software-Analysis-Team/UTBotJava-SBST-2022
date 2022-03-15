package com.google.common.collect;

import org.junit.Test;
import java.util.TreeMap;
import sun.misc.ASCIICaseInsensitiveComparator;
import sun.security.util.ByteArrayLexOrder;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import sun.misc.Unsafe;

import static org.junit.Assert.assertFalse;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.Assert.assertNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mockStatic;
import static org.junit.Assert.assertEquals;

public class TreeRangeMapTest {
    ///region
    
    @Test(timeout = 10000)
    public void testEquals1() throws Throwable  {
        TreeRangeMap treeRangeMap = ((TreeRangeMap) createInstance("com.google.common.collect.TreeRangeMap"));
        java.lang.Object[] holderArray = createArray("sun.security.util.DisabledAlgorithmConstraints$Constraints$Holder", 0);
        
        boolean actual = treeRangeMap.equals(holderArray);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testToString1() throws Throwable  {
        TreeRangeMap treeRangeMap = ((TreeRangeMap) createInstance("com.google.common.collect.TreeRangeMap"));
        ImmutableSortedMap immutableSortedMap = ((ImmutableSortedMap) createInstance("com.google.common.collect.ImmutableSortedMap"));
        ImmutableList immutableListMock = mock(ImmutableList.class);
        when(immutableListMock.toString()).thenReturn(((String) null));
        setField(immutableSortedMap, "valueList", immutableListMock);
        setField(treeRangeMap, "entriesByLowerBound", immutableSortedMap);
        
        String actual = treeRangeMap.toString();
        
        assertNull(actual);
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
    public void testRemove3() throws Throwable  {
        TreeRangeMap treeRangeMap = ((TreeRangeMap) createInstance("com.google.common.collect.TreeRangeMap"));
        TreeMap treeMap = ((TreeMap) createInstance("java.util.TreeMap"));
        Object entry = createInstance("java.util.TreeMap$Entry");
        setField(entry, "key", null);
        setField(treeMap, "root", entry);
        ASCIICaseInsensitiveComparator aSCIICaseInsensitiveComparator = ((ASCIICaseInsensitiveComparator) createInstance("sun.misc.ASCIICaseInsensitiveComparator"));
        setField(treeMap, "comparator", aSCIICaseInsensitiveComparator);
        setField(treeRangeMap, "entriesByLowerBound", treeMap);
        Range rangeMock = mock(Range.class);
        when(rangeMock.isEmpty()).thenReturn(false);
        Cut cutMock = mock(Cut.class);
        setField(rangeMock, "lowerBound", cutMock);
        
        treeRangeMap.remove(rangeMock);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testRemove4() throws Throwable  {
        TreeRangeMap treeRangeMap = ((TreeRangeMap) createInstance("com.google.common.collect.TreeRangeMap"));
        TreeMap treeMap = ((TreeMap) createInstance("java.util.TreeMap"));
        Object entry = createInstance("java.util.TreeMap$Entry");
        setField(entry, "key", null);
        setField(treeMap, "root", entry);
        ByteArrayLexOrder byteArrayLexOrder = ((ByteArrayLexOrder) createInstance("sun.security.util.ByteArrayLexOrder"));
        setField(treeMap, "comparator", byteArrayLexOrder);
        setField(treeRangeMap, "entriesByLowerBound", treeMap);
        Range rangeMock = mock(Range.class);
        when(rangeMock.isEmpty()).thenReturn(false);
        Cut cutMock = mock(Cut.class);
        setField(rangeMock, "lowerBound", cutMock);
        
        treeRangeMap.remove(rangeMock);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGet1() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(Cut.class);
            Cut cutMock = mock(Cut.class);
            mockedStatic.when(() -> {
                Cut.belowValue(any());
            }).thenReturn(cutMock);
            TreeRangeMap treeRangeMap = ((TreeRangeMap) createInstance("com.google.common.collect.TreeRangeMap"));
            TreeMap treeMap = ((TreeMap) createInstance("java.util.TreeMap"));
            setField(treeMap, "root", null);
            setField(treeRangeMap, "entriesByLowerBound", treeMap);
            
            Object actual = treeRangeMap.get(null);
            
            assertNull(actual);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testPut1() throws Throwable  {
        TreeRangeMap treeRangeMap = ((TreeRangeMap) createInstance("com.google.common.collect.TreeRangeMap"));
        java.lang.Object[] entrySetArray = createArray("com.google.common.cache.LocalCache$EntrySet", 0);
        
        treeRangeMap.put(null, entrySetArray);
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
        when(rangeMapMock.asMapOfRanges()).thenReturn(((java.util.Map) null));
        
        treeRangeMap.putAll(rangeMapMock);
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
