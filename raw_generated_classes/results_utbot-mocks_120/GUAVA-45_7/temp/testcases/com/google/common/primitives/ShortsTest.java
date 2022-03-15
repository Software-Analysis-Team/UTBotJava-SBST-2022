package com.google.common.primitives;

import org.junit.Test;
import com.google.common.base.Converter;
import java.util.Comparator;
import java.lang.reflect.Method;
import sun.net.ConnectionResetException;
import java.util.ArrayList;
import java.util.List;
import java.lang.reflect.Constructor;
import com.google.common.primitives.Shorts;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Iterator;
import sun.misc.Unsafe;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyBoolean;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import static org.mockito.ArgumentMatchers.anyShort;

public class ShortsTest {
    ///region
    
    @Test(timeout = 10000)
    public void testSortDescending1() throws Throwable  {
        short[] shortArray = new short[0];
        
        Shorts.sortDescending(shortArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testSortDescending2() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(com.google.common.base.Preconditions.class);
            mockedStatic.when(() -> {
                com.google.common.base.Preconditions.checkNotNull(any());
            }).thenReturn(null);
            
            Shorts.sortDescending(null);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSortDescending3() throws Throwable  {
        short[] shortArray = new short[0];
        
        Shorts.sortDescending(shortArray, 0, 0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testSortDescending4() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(com.google.common.base.Preconditions.class);
            java.lang.Object[] nativeSeedGeneratorArray = createArray("sun.security.provider.NativeSeedGenerator", 0);
            mockedStatic.when(() -> {
                com.google.common.base.Preconditions.checkNotNull(any());
            }).thenReturn(((Object) nativeSeedGeneratorArray));
            
            Shorts.sortDescending(null, 0, 0);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testSortDescending5() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(com.google.common.base.Preconditions.class);
            mockedStatic.when(() -> {
                com.google.common.base.Preconditions.checkNotNull(any());
            }).thenReturn(null);
            short[] shortArray = new short[10];
            
            Shorts.sortDescending(shortArray, 1, 0);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSaturatedCast1() throws Throwable  {
        short actual = Shorts.saturatedCast(0L);
        
        assertEquals((short) 0, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSaturatedCast2() throws Throwable  {
        short actual = Shorts.saturatedCast(32768L);
        
        assertEquals(java.lang.Short.MAX_VALUE, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSaturatedCast3() throws Throwable  {
        short actual = Shorts.saturatedCast(-9223372036854644728L);
        
        assertEquals(java.lang.Short.MIN_VALUE, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSaturatedCast4() throws Throwable  {
        short actual = Shorts.saturatedCast(32767L);
        
        assertEquals(java.lang.Short.MAX_VALUE, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testConstrainToRange1() throws Throwable  {
        short actual = Shorts.constrainToRange((short) 0, (short) 0, (short) 0);
        
        assertEquals((short) 0, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testConstrainToRange2() throws Throwable  {
        short actual = Shorts.constrainToRange((short) 0, (short) -32767, (short) 0);
        
        assertEquals((short) 0, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testConstrainToRange3() throws Throwable  {
        Shorts.constrainToRange((short) 0, (short) 1, (short) 0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCheckedCast1() throws Throwable  {
        short actual = Shorts.checkedCast(0L);
        
        assertEquals((short) 0, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCheckedCast2() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(com.google.common.base.Preconditions.class);
            
            short actual = Shorts.checkedCast(-32768L);
            
            assertEquals(java.lang.Short.MIN_VALUE, actual);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCheckedCast3() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(com.google.common.base.Preconditions.class);
            
            short actual = Shorts.checkedCast(32768L);
            
            assertEquals(java.lang.Short.MIN_VALUE, actual);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testFromByteArray1() throws Throwable  {
        byte[] byteArray = new byte[0];
        
        Shorts.fromByteArray(byteArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testFromByteArray2() throws Throwable  {
        Shorts.fromByteArray(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testFromByteArray3() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(com.google.common.base.Preconditions.class);
            byte[] byteArray = new byte[0];
            
            Shorts.fromByteArray(byteArray);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testFromByteArray4() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(com.google.common.base.Preconditions.class);
            byte[] byteArray = new byte[1];
            
            Shorts.fromByteArray(byteArray);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testFromByteArray5() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(com.google.common.base.Preconditions.class);
            byte[] byteArray = new byte[9];
            
            short actual = Shorts.fromByteArray(byteArray);
            
            assertEquals((short) 0, actual);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testFromBytes1() throws Throwable  {
        short actual = Shorts.fromBytes((byte) 0, (byte) 0);
        
        assertEquals((short) 0, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testFromBytes2() throws Throwable  {
        short actual = Shorts.fromBytes((byte) 0, (byte) 0);
        
        assertEquals((short) 0, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testStringConverter1() throws Throwable  {
        Converter actual = Shorts.stringConverter();
        
        Object expected = createInstance("com.google.common.primitives.Shorts$ShortConverter");
        setField(expected, "handleNullAutomatically", true);
        setField(expected, "reverse", null);
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testStringConverter2() throws Throwable  {
        Converter actual = Shorts.stringConverter();
        
        Object expected = createInstance("com.google.common.primitives.Shorts$ShortConverter");
        setField(expected, "handleNullAutomatically", true);
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testLexicographicalComparator1() throws Throwable  {
        Comparator actual = Shorts.lexicographicalComparator();
        
        Class lexicographicalComparatorClazz = Class.forName("com.google.common.primitives.Shorts$LexicographicalComparator");
        Object expected = getEnumConstantByName(lexicographicalComparatorClazz, "INSTANCE");
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testLexicographicalComparator2() throws Throwable  {
        Comparator actual = Shorts.lexicographicalComparator();
        
        Class lexicographicalComparatorClazz = Class.forName("com.google.common.primitives.Shorts$LexicographicalComparator");
        Object expected = getEnumConstantByName(lexicographicalComparatorClazz, "INSTANCE");
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testHashCode1() throws Throwable  {
        int actual = Shorts.hashCode((short) 0);
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testHashCode2() throws Throwable  {
        int actual = Shorts.hashCode((short) 0);
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testMin1() throws Throwable  {
        short[] shortArray = new short[0];
        
        Shorts.min(shortArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testMin2() throws Throwable  {
        Shorts.min(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testMin3() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(com.google.common.base.Preconditions.class);
            short[] shortArray = new short[0];
            
            Shorts.min(shortArray);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testMin4() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(com.google.common.base.Preconditions.class);
            short[] shortArray = new short[1];
            
            short actual = Shorts.min(shortArray);
            
            assertEquals((short) 0, actual);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testMin5() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(com.google.common.base.Preconditions.class);
            short[] shortArray = new short[2];
            shortArray[0] = (short) 1;
            
            short actual = Shorts.min(shortArray);
            
            assertEquals((short) 0, actual);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testMin6() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(com.google.common.base.Preconditions.class);
            short[] shortArray = new short[2];
            shortArray[0] = (short) -8191;
            shortArray[1] = (short) -4096;
            
            short actual = Shorts.min(shortArray);
            
            assertEquals((short) -8191, actual);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testMax1() throws Throwable  {
        short[] shortArray = new short[0];
        
        Shorts.max(shortArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testMax2() throws Throwable  {
        Shorts.max(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testMax3() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(com.google.common.base.Preconditions.class);
            short[] shortArray = new short[0];
            
            Shorts.max(shortArray);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testMax4() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(com.google.common.base.Preconditions.class);
            short[] shortArray = new short[1];
            
            short actual = Shorts.max(shortArray);
            
            assertEquals((short) 0, actual);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testMax5() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(com.google.common.base.Preconditions.class);
            short[] shortArray = new short[2];
            shortArray[1] = (short) 1;
            
            short actual = Shorts.max(shortArray);
            
            assertEquals((short) 1, actual);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testMax6() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(com.google.common.base.Preconditions.class);
            short[] shortArray = new short[2];
            shortArray[0] = (short) -4096;
            shortArray[1] = (short) -8191;
            
            short actual = Shorts.max(shortArray);
            
            assertEquals((short) -4096, actual);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIndexOf1() throws Throwable  {
        short[] shortArray = new short[0];
        
        int actual = Shorts.indexOf(shortArray, (short) 0);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testIndexOf2() throws Throwable  {
        Shorts.indexOf(((short[]) null), (short) 0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIndexOf3() throws Throwable  {
        short[] shortArray = new short[9];
        
        int actual = Shorts.indexOf(shortArray, (short) 0);
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIndexOf4() throws Throwable  {
        short[] shortArray = new short[1];
        shortArray[0] = java.lang.Short.MIN_VALUE;
        
        int actual = Shorts.indexOf(shortArray, (short) 0);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIndexOf5() throws Throwable  {
        short[] shortArray = new short[0];
        
        Class shortsClazz = Class.forName("com.google.common.primitives.Shorts");
        Class shortArrayType = Class.forName("[S");
        Class shortType = short.class;
        Class intType = int.class;
        Method indexOfMethod = shortsClazz.getDeclaredMethod("indexOf", shortArrayType, shortType, intType, intType);
        indexOfMethod.setAccessible(true);
        java.lang.Object[] indexOfMethodArguments = new java.lang.Object[4];
        indexOfMethodArguments[0] = ((Object) shortArray);
        indexOfMethodArguments[1] = (short) 0;
        indexOfMethodArguments[2] = 0;
        indexOfMethodArguments[3] = 0;
        int actual = ((int) indexOfMethod.invoke(null, indexOfMethodArguments));
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIndexOf6() throws Throwable  {
        Class shortsClazz = Class.forName("com.google.common.primitives.Shorts");
        Class shortArrayType = Class.forName("[S");
        Class shortType = short.class;
        Class intType = int.class;
        Method indexOfMethod = shortsClazz.getDeclaredMethod("indexOf", shortArrayType, shortType, intType, intType);
        indexOfMethod.setAccessible(true);
        java.lang.Object[] indexOfMethodArguments = new java.lang.Object[4];
        indexOfMethodArguments[0] = null;
        indexOfMethodArguments[1] = (short) 0;
        indexOfMethodArguments[2] = 0;
        indexOfMethodArguments[3] = -2147483647;
        int actual = ((int) indexOfMethod.invoke(null, indexOfMethodArguments));
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testIndexOf7() throws Throwable  {
        short[] shortArray = new short[9];
        
        Class shortsClazz = Class.forName("com.google.common.primitives.Shorts");
        Class shortArrayType = Class.forName("[S");
        Class shortType = short.class;
        Class intType = int.class;
        Method indexOfMethod = shortsClazz.getDeclaredMethod("indexOf", shortArrayType, shortType, intType, intType);
        indexOfMethod.setAccessible(true);
        java.lang.Object[] indexOfMethodArguments = new java.lang.Object[4];
        indexOfMethodArguments[0] = ((Object) shortArray);
        indexOfMethodArguments[1] = (short) 0;
        indexOfMethodArguments[2] = Integer.MIN_VALUE;
        indexOfMethodArguments[3] = 1;
        try {
            indexOfMethod.invoke(null, indexOfMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIndexOf8() throws Throwable  {
        short[] shortArray = new short[9];
        
        Class shortsClazz = Class.forName("com.google.common.primitives.Shorts");
        Class shortArrayType = Class.forName("[S");
        Class shortType = short.class;
        Class intType = int.class;
        Method indexOfMethod = shortsClazz.getDeclaredMethod("indexOf", shortArrayType, shortType, intType, intType);
        indexOfMethod.setAccessible(true);
        java.lang.Object[] indexOfMethodArguments = new java.lang.Object[4];
        indexOfMethodArguments[0] = ((Object) shortArray);
        indexOfMethodArguments[1] = (short) 0;
        indexOfMethodArguments[2] = 0;
        indexOfMethodArguments[3] = 1;
        int actual = ((int) indexOfMethod.invoke(null, indexOfMethodArguments));
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testIndexOf9() throws Throwable  {
        Class shortsClazz = Class.forName("com.google.common.primitives.Shorts");
        Class shortArrayType = Class.forName("[S");
        Class shortType = short.class;
        Class intType = int.class;
        Method indexOfMethod = shortsClazz.getDeclaredMethod("indexOf", shortArrayType, shortType, intType, intType);
        indexOfMethod.setAccessible(true);
        java.lang.Object[] indexOfMethodArguments = new java.lang.Object[4];
        indexOfMethodArguments[0] = null;
        indexOfMethodArguments[1] = (short) 0;
        indexOfMethodArguments[2] = 0;
        indexOfMethodArguments[3] = 1;
        try {
            indexOfMethod.invoke(null, indexOfMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testIndexOf10() throws Throwable  {
        short[] shortArray = new short[9];
        
        Class shortsClazz = Class.forName("com.google.common.primitives.Shorts");
        Class shortArrayType = Class.forName("[S");
        Class shortType = short.class;
        Class intType = int.class;
        Method indexOfMethod = shortsClazz.getDeclaredMethod("indexOf", shortArrayType, shortType, intType, intType);
        indexOfMethod.setAccessible(true);
        java.lang.Object[] indexOfMethodArguments = new java.lang.Object[4];
        indexOfMethodArguments[0] = ((Object) shortArray);
        indexOfMethodArguments[1] = (short) 0;
        indexOfMethodArguments[2] = 1073741824;
        indexOfMethodArguments[3] = 1073741825;
        try {
            indexOfMethod.invoke(null, indexOfMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIndexOf11() throws Throwable  {
        short[] shortArray = new short[9];
        shortArray[0] = java.lang.Short.MIN_VALUE;
        
        Class shortsClazz = Class.forName("com.google.common.primitives.Shorts");
        Class shortArrayType = Class.forName("[S");
        Class shortType = short.class;
        Class intType = int.class;
        Method indexOfMethod = shortsClazz.getDeclaredMethod("indexOf", shortArrayType, shortType, intType, intType);
        indexOfMethod.setAccessible(true);
        java.lang.Object[] indexOfMethodArguments = new java.lang.Object[4];
        indexOfMethodArguments[0] = ((Object) shortArray);
        indexOfMethodArguments[1] = (short) 0;
        indexOfMethodArguments[2] = 0;
        indexOfMethodArguments[3] = 1;
        int actual = ((int) indexOfMethod.invoke(null, indexOfMethodArguments));
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIndexOf12() throws Throwable  {
        short[] shortArray = new short[0];
        short[] shortArray1 = new short[0];
        
        int actual = Shorts.indexOf(shortArray, shortArray1);
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testIndexOf13() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(com.google.common.base.Preconditions.class);
            sun.net.ConnectionResetException[] connectionResetExceptionArray = new sun.net.ConnectionResetException[0];
            java.lang.Object[] findOpArray = createArray("java.util.stream.FindOps$FindOp", 0);
            mockedStatic.when(() -> {
                com.google.common.base.Preconditions.checkNotNull(any(), any());
            }).thenReturn(((Object) connectionResetExceptionArray), ((Object) findOpArray));
            
            Shorts.indexOf(((short[]) null), ((short[]) null));
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIndexOf14() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(com.google.common.base.Preconditions.class);
            mockedStatic.when(() -> {
                com.google.common.base.Preconditions.checkNotNull(any(), any());
            }).thenReturn(null, null);
            short[] shortArray = new short[17];
            short[] shortArray1 = new short[0];
            
            int actual = Shorts.indexOf(shortArray, shortArray1);
            
            assertEquals(0, actual);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testIndexOf15() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(com.google.common.base.Preconditions.class);
            java.lang.Object[] fifoWaitQueueArray = createArray("java.util.concurrent.SynchronousQueue$FifoWaitQueue", 0);
            mockedStatic.when(() -> {
                com.google.common.base.Preconditions.checkNotNull(any(), any());
            }).thenReturn(((Object) fifoWaitQueueArray), null);
            short[] shortArray = new short[9];
            
            Shorts.indexOf(((short[]) null), shortArray);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIndexOf16() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(com.google.common.base.Preconditions.class);
            mockedStatic.when(() -> {
                com.google.common.base.Preconditions.checkNotNull(any(), any());
            }).thenReturn(null, null);
            short[] shortArray = new short[29];
            short[] shortArray1 = new short[32];
            
            int actual = Shorts.indexOf(shortArray, shortArray1);
            
            assertEquals(-1, actual);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIndexOf17() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(com.google.common.base.Preconditions.class);
            mockedStatic.when(() -> {
                com.google.common.base.Preconditions.checkNotNull(any(), any());
            }).thenReturn(null, null);
            short[] shortArray = new short[7];
            short[] shortArray1 = new short[1];
            
            int actual = Shorts.indexOf(shortArray, shortArray1);
            
            assertEquals(0, actual);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIndexOf18() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(com.google.common.base.Preconditions.class);
            mockedStatic.when(() -> {
                com.google.common.base.Preconditions.checkNotNull(any(), any());
            }).thenReturn(null, null);
            short[] shortArray = new short[32];
            shortArray[0] = java.lang.Short.MIN_VALUE;
            short[] shortArray1 = new short[32];
            
            int actual = Shorts.indexOf(shortArray, shortArray1);
            
            assertEquals(-1, actual);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testLastIndexOf1() throws Throwable  {
        short[] shortArray = new short[0];
        
        int actual = Shorts.lastIndexOf(shortArray, (short) 0);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testLastIndexOf2() throws Throwable  {
        Shorts.lastIndexOf(null, (short) 0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testLastIndexOf3() throws Throwable  {
        short[] shortArray = new short[2];
        
        int actual = Shorts.lastIndexOf(shortArray, (short) 0);
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testLastIndexOf4() throws Throwable  {
        short[] shortArray = new short[0];
        
        int actual = Shorts.lastIndexOf(shortArray, (short) 0);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testLastIndexOf5() throws Throwable  {
        short[] shortArray = new short[1];
        shortArray[0] = java.lang.Short.MIN_VALUE;
        
        int actual = Shorts.lastIndexOf(shortArray, (short) 0);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testLastIndexOf6() throws Throwable  {
        short[] shortArray = new short[0];
        
        Class shortsClazz = Class.forName("com.google.common.primitives.Shorts");
        Class shortArrayType = Class.forName("[S");
        Class shortType = short.class;
        Class intType = int.class;
        Method lastIndexOfMethod = shortsClazz.getDeclaredMethod("lastIndexOf", shortArrayType, shortType, intType, intType);
        lastIndexOfMethod.setAccessible(true);
        java.lang.Object[] lastIndexOfMethodArguments = new java.lang.Object[4];
        lastIndexOfMethodArguments[0] = ((Object) shortArray);
        lastIndexOfMethodArguments[1] = (short) 0;
        lastIndexOfMethodArguments[2] = 0;
        lastIndexOfMethodArguments[3] = 0;
        int actual = ((int) lastIndexOfMethod.invoke(null, lastIndexOfMethodArguments));
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testLastIndexOf7() throws Throwable  {
        Class shortsClazz = Class.forName("com.google.common.primitives.Shorts");
        Class shortArrayType = Class.forName("[S");
        Class shortType = short.class;
        Class intType = int.class;
        Method lastIndexOfMethod = shortsClazz.getDeclaredMethod("lastIndexOf", shortArrayType, shortType, intType, intType);
        lastIndexOfMethod.setAccessible(true);
        java.lang.Object[] lastIndexOfMethodArguments = new java.lang.Object[4];
        lastIndexOfMethodArguments[0] = null;
        lastIndexOfMethodArguments[1] = (short) 0;
        lastIndexOfMethodArguments[2] = 1;
        lastIndexOfMethodArguments[3] = -2147483647;
        int actual = ((int) lastIndexOfMethod.invoke(null, lastIndexOfMethodArguments));
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testLastIndexOf8() throws Throwable  {
        short[] shortArray = new short[9];
        
        Class shortsClazz = Class.forName("com.google.common.primitives.Shorts");
        Class shortArrayType = Class.forName("[S");
        Class shortType = short.class;
        Class intType = int.class;
        Method lastIndexOfMethod = shortsClazz.getDeclaredMethod("lastIndexOf", shortArrayType, shortType, intType, intType);
        lastIndexOfMethod.setAccessible(true);
        java.lang.Object[] lastIndexOfMethodArguments = new java.lang.Object[4];
        lastIndexOfMethodArguments[0] = ((Object) shortArray);
        lastIndexOfMethodArguments[1] = (short) 0;
        lastIndexOfMethodArguments[2] = -2147483647;
        lastIndexOfMethodArguments[3] = -1073741823;
        try {
            lastIndexOfMethod.invoke(null, lastIndexOfMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testLastIndexOf9() throws Throwable  {
        short[] shortArray = new short[9];
        
        Class shortsClazz = Class.forName("com.google.common.primitives.Shorts");
        Class shortArrayType = Class.forName("[S");
        Class shortType = short.class;
        Class intType = int.class;
        Method lastIndexOfMethod = shortsClazz.getDeclaredMethod("lastIndexOf", shortArrayType, shortType, intType, intType);
        lastIndexOfMethod.setAccessible(true);
        java.lang.Object[] lastIndexOfMethodArguments = new java.lang.Object[4];
        lastIndexOfMethodArguments[0] = ((Object) shortArray);
        lastIndexOfMethodArguments[1] = (short) 0;
        lastIndexOfMethodArguments[2] = -2147483647;
        lastIndexOfMethodArguments[3] = 1;
        int actual = ((int) lastIndexOfMethod.invoke(null, lastIndexOfMethodArguments));
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testLastIndexOf10() throws Throwable  {
        Class shortsClazz = Class.forName("com.google.common.primitives.Shorts");
        Class shortArrayType = Class.forName("[S");
        Class shortType = short.class;
        Class intType = int.class;
        Method lastIndexOfMethod = shortsClazz.getDeclaredMethod("lastIndexOf", shortArrayType, shortType, intType, intType);
        lastIndexOfMethod.setAccessible(true);
        java.lang.Object[] lastIndexOfMethodArguments = new java.lang.Object[4];
        lastIndexOfMethodArguments[0] = null;
        lastIndexOfMethodArguments[1] = (short) 0;
        lastIndexOfMethodArguments[2] = -2147483647;
        lastIndexOfMethodArguments[3] = 1;
        try {
            lastIndexOfMethod.invoke(null, lastIndexOfMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testLastIndexOf11() throws Throwable  {
        short[] shortArray = new short[9];
        
        Class shortsClazz = Class.forName("com.google.common.primitives.Shorts");
        Class shortArrayType = Class.forName("[S");
        Class shortType = short.class;
        Class intType = int.class;
        Method lastIndexOfMethod = shortsClazz.getDeclaredMethod("lastIndexOf", shortArrayType, shortType, intType, intType);
        lastIndexOfMethod.setAccessible(true);
        java.lang.Object[] lastIndexOfMethodArguments = new java.lang.Object[4];
        lastIndexOfMethodArguments[0] = ((Object) shortArray);
        lastIndexOfMethodArguments[1] = (short) 0;
        lastIndexOfMethodArguments[2] = -1073741823;
        lastIndexOfMethodArguments[3] = 1073741825;
        try {
            lastIndexOfMethod.invoke(null, lastIndexOfMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testLastIndexOf12() throws Throwable  {
        short[] shortArray = new short[40];
        shortArray[31] = java.lang.Short.MIN_VALUE;
        
        Class shortsClazz = Class.forName("com.google.common.primitives.Shorts");
        Class shortArrayType = Class.forName("[S");
        Class shortType = short.class;
        Class intType = int.class;
        Method lastIndexOfMethod = shortsClazz.getDeclaredMethod("lastIndexOf", shortArrayType, shortType, intType, intType);
        lastIndexOfMethod.setAccessible(true);
        java.lang.Object[] lastIndexOfMethodArguments = new java.lang.Object[4];
        lastIndexOfMethodArguments[0] = ((Object) shortArray);
        lastIndexOfMethodArguments[1] = (short) 0;
        lastIndexOfMethodArguments[2] = 31;
        lastIndexOfMethodArguments[3] = 32;
        int actual = ((int) lastIndexOfMethod.invoke(null, lastIndexOfMethodArguments));
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testConcat1() throws Throwable  {
        short[][] shortArray = new short[0][];
        
        short[] actual = Shorts.concat(shortArray);
        
        short[] expected = new short[0];
        assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testConcat2() throws Throwable  {
        Shorts.concat(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testConcat3() throws Throwable  {
        short[][] shortArray = new short[9][];
        shortArray[0] = ((short[]) null);
        short[] shortArray1 = new short[0];
        shortArray[1] = shortArray1;
        shortArray[2] = shortArray1;
        shortArray[3] = shortArray1;
        shortArray[4] = shortArray1;
        shortArray[5] = shortArray1;
        shortArray[6] = shortArray1;
        shortArray[7] = shortArray1;
        shortArray[8] = shortArray1;
        
        Shorts.concat(shortArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testConcat4() throws Throwable  {
        short[][] shortArray = new short[0][];
        
        short[] actual = Shorts.concat(shortArray);
        
        short[] expected = new short[0];
        assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testConcat5() throws Throwable  {
        short[][] shortArray = new short[9][];
        short[] shortArray1 = new short[9];
        shortArray[0] = shortArray1;
        shortArray[1] = ((short[]) null);
        short[] shortArray2 = new short[0];
        shortArray[2] = shortArray2;
        shortArray[3] = shortArray2;
        shortArray[4] = shortArray2;
        shortArray[5] = shortArray2;
        shortArray[6] = shortArray2;
        shortArray[7] = shortArray2;
        shortArray[8] = shortArray2;
        
        Shorts.concat(shortArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testConcat6() throws Throwable  {
        short[][] shortArray = new short[1][];
        short[] shortArray1 = new short[0];
        shortArray[0] = shortArray1;
        
        short[] actual = Shorts.concat(shortArray);
        
        short[] expected = new short[0];
        assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testContains1() throws Throwable  {
        short[] shortArray = new short[0];
        
        boolean actual = Shorts.contains(shortArray, (short) 0);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testContains2() throws Throwable  {
        Shorts.contains(null, (short) 0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testContains3() throws Throwable  {
        short[] shortArray = new short[0];
        
        boolean actual = Shorts.contains(shortArray, (short) 0);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testContains4() throws Throwable  {
        short[] shortArray = new short[9];
        
        boolean actual = Shorts.contains(shortArray, (short) 0);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testContains5() throws Throwable  {
        short[] shortArray = new short[1];
        shortArray[0] = java.lang.Short.MIN_VALUE;
        
        boolean actual = Shorts.contains(shortArray, (short) 0);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testJoin1() throws Throwable  {
        String string = new String();
        short[] shortArray = new short[0];
        
        String actual = Shorts.join(string, shortArray);
        
        String expected = new String("");
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testJoin2() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(com.google.common.base.Preconditions.class);
            mockedStatic.when(() -> {
                com.google.common.base.Preconditions.checkNotNull(any());
            }).thenReturn(null);
            String string = new String("");
            short[] shortArray = new short[0];
            
            String actual = Shorts.join(string, shortArray);
            
            String expected = new String("");
            
            // Current deep equals depth exceeds max depth 0
            assertTrue(deepEquals(expected, actual));
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testJoin3() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(com.google.common.base.Preconditions.class);
            mockedStatic.when(() -> {
                com.google.common.base.Preconditions.checkNotNull(any());
            }).thenReturn(null);
            
            Shorts.join(null, null);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCompare1() throws Throwable  {
        int actual = Shorts.compare((short) 0, (short) 0);
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCompare2() throws Throwable  {
        int actual = Shorts.compare((short) 0, (short) 0);
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testToArray1() throws Throwable  {
        ArrayList arrayList = new ArrayList();
        
        short[] actual = Shorts.toArray(arrayList);
        
        short[] expected = new short[0];
        assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testToArray2() throws Throwable  {
        Shorts.toArray(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testToArray3() throws Throwable  {
        Object shortArrayAsList = createInstance("com.google.common.primitives.Shorts$ShortArrayAsList");
        setField(shortArrayAsList, "end", 0);
        setField(shortArrayAsList, "start", 1610612736);
        short[] shortArray = new short[9];
        setField(shortArrayAsList, "array", shortArray);
        
        Class shortsClazz = Class.forName("com.google.common.primitives.Shorts");
        Class shortArrayAsListType = Class.forName("java.util.Collection");
        Method toArrayMethod = shortsClazz.getDeclaredMethod("toArray", shortArrayAsListType);
        toArrayMethod.setAccessible(true);
        java.lang.Object[] toArrayMethodArguments = new java.lang.Object[1];
        toArrayMethodArguments[0] = shortArrayAsList;
        try {
            toArrayMethod.invoke(null, toArrayMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testAsList1() throws Throwable  {
        short[] shortArray = new short[0];
        
        List actual = Shorts.asList(shortArray);
        
        Object expected = createInstance("java.util.Collections$EmptyList");
        setField(expected, "modCount", 0);
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testAsList2() throws Throwable  {
        Shorts.asList(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testAsList3() throws Throwable  {
        short[] shortArray = new short[1];
        
        List actual = Shorts.asList(shortArray);
        
        Object expected = createInstance("com.google.common.primitives.Shorts$ShortArrayAsList");
        setField(expected, "modCount", 0);
        setField(expected, "end", 1);
        setField(expected, "start", 0);
        setField(expected, "array", shortArray);
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testAsList4() throws Throwable  {
        short[] shortArray = new short[0];
        
        List actual = Shorts.asList(shortArray);
        
        ArrayList expected = new ArrayList();
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testEnsureCapacity1() throws Throwable  {
        short[] shortArray = new short[0];
        
        short[] actual = Shorts.ensureCapacity(shortArray, 0, 0);
        
        assertArrayEquals(shortArray, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testEnsureCapacity2() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(com.google.common.base.Preconditions.class);
            
            Shorts.ensureCapacity(null, 0, 0);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testEnsureCapacity3() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(com.google.common.base.Preconditions.class);
            short[] shortArray = new short[32];
            
            short[] actual = Shorts.ensureCapacity(shortArray, 1, Integer.MIN_VALUE);
            
            assertArrayEquals(shortArray, actual);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testEnsureCapacity4() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(com.google.common.base.Preconditions.class);
            
            Shorts.ensureCapacity(null, Integer.MIN_VALUE, Integer.MIN_VALUE);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testEnsureCapacity5() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(com.google.common.base.Preconditions.class);
            short[] shortArray = new short[1];
            
            Shorts.ensureCapacity(shortArray, 1048576, Integer.MIN_VALUE);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testEnsureCapacity6() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(com.google.common.base.Preconditions.class);
            short[] shortArray = new short[40];
            
            short[] actual = Shorts.ensureCapacity(shortArray, 1073741833, -1073741824);
            
            short[] expected = new short[9];
            assertArrayEquals(expected, actual);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReverse1() throws Throwable  {
        short[] shortArray = new short[0];
        
        Shorts.reverse(shortArray, 0, 0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReverse2() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(com.google.common.base.Preconditions.class);
            java.lang.Object[] nativeSeedGeneratorArray = createArray("sun.security.provider.NativeSeedGenerator", 0);
            mockedStatic.when(() -> {
                com.google.common.base.Preconditions.checkNotNull(any());
            }).thenReturn(((Object) nativeSeedGeneratorArray));
            
            Shorts.reverse(null, 0, 0);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReverse3() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(com.google.common.base.Preconditions.class);
            mockedStatic.when(() -> {
                com.google.common.base.Preconditions.checkNotNull(any());
            }).thenReturn(null);
            short[] shortArray = new short[10];
            
            Shorts.reverse(shortArray, 0, 0);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReverse4() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(com.google.common.base.Preconditions.class);
            mockedStatic.when(() -> {
                com.google.common.base.Preconditions.checkNotNull(any());
            }).thenReturn(null);
            short[] shortArray = new short[40];
            
            Shorts.reverse(shortArray, 40, Integer.MIN_VALUE);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReverse5() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(com.google.common.base.Preconditions.class);
            mockedStatic.when(() -> {
                com.google.common.base.Preconditions.checkNotNull(any());
            }).thenReturn(null);
            short[] shortArray = new short[39];
            
            Shorts.reverse(shortArray, 0, 1073741863);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReverse6() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(com.google.common.base.Preconditions.class);
            mockedStatic.when(() -> {
                com.google.common.base.Preconditions.checkNotNull(any());
            }).thenReturn(null);
            short[] shortArray = new short[10];
            
            Shorts.reverse(shortArray, Integer.MIN_VALUE, Integer.MIN_VALUE);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReverse7() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(com.google.common.base.Preconditions.class);
            mockedStatic.when(() -> {
                com.google.common.base.Preconditions.checkNotNull(any());
            }).thenReturn(null);
            short[] shortArray = new short[11];
            
            Shorts.reverse(shortArray, 2, 4);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReverse8() throws Throwable  {
        short[] shortArray = new short[0];
        
        Shorts.reverse(shortArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReverse9() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(com.google.common.base.Preconditions.class);
            java.lang.Object[] operatorArray = createArray("sun.security.util.DisabledAlgorithmConstraints$Constraint$Operator", 0);
            mockedStatic.when(() -> {
                com.google.common.base.Preconditions.checkNotNull(any());
            }).thenReturn(((Object) operatorArray));
            
            Shorts.reverse(null);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReverse10() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(com.google.common.base.Preconditions.class);
            mockedStatic.when(() -> {
                com.google.common.base.Preconditions.checkNotNull(any());
            }).thenReturn(null, null);
            short[] shortArray = new short[0];
            
            Shorts.reverse(shortArray);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReverse11() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(com.google.common.base.Preconditions.class);
            mockedStatic.when(() -> {
                com.google.common.base.Preconditions.checkNotNull(any());
            }).thenReturn(null, null);
            short[] shortArray = new short[2];
            
            Shorts.reverse(shortArray);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testToByteArray1() throws Throwable  {
        byte[] actual = Shorts.toByteArray((short) 0);
        
        byte[] expected = new byte[2];
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testToByteArray2() throws Throwable  {
        byte[] actual = Shorts.toByteArray((short) 0);
        
        byte[] expected = new byte[2];
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testShorts1() throws Throwable  {
        Class shortsClazz = Class.forName("com.google.common.primitives.Shorts");
        Constructor shortsConstructor = shortsClazz.getDeclaredConstructor();
        shortsConstructor.setAccessible(true);
        java.lang.Object[] shortsConstructorArguments = new java.lang.Object[0];
        Shorts actual = ((Shorts) shortsConstructor.newInstance(shortsConstructorArguments));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testShorts2() throws Throwable  {
        Class shortsClazz = Class.forName("com.google.common.primitives.Shorts");
        Constructor shortsConstructor = shortsClazz.getDeclaredConstructor();
        shortsConstructor.setAccessible(true);
        java.lang.Object[] shortsConstructorArguments = new java.lang.Object[0];
        Shorts actual = ((Shorts) shortsConstructor.newInstance(shortsConstructorArguments));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testContains6() throws Throwable  {
        Object shortArrayAsList = createInstance("com.google.common.primitives.Shorts$ShortArrayAsList");
        Object object = new Object();
        
        Class shortArrayAsListClazz = Class.forName("com.google.common.primitives.Shorts$ShortArrayAsList");
        Class objectType = Class.forName("java.lang.Object");
        Method containsMethod = shortArrayAsListClazz.getDeclaredMethod("contains", objectType);
        containsMethod.setAccessible(true);
        java.lang.Object[] containsMethodArguments = new java.lang.Object[1];
        containsMethodArguments[0] = object;
        boolean actual = ((boolean) containsMethod.invoke(shortArrayAsList, containsMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testContains7() throws Throwable  {
        Object shortArrayAsList = createInstance("com.google.common.primitives.Shorts$ShortArrayAsList");
        
        Class shortArrayAsListClazz = Class.forName("com.google.common.primitives.Shorts$ShortArrayAsList");
        Class objectType = Class.forName("java.lang.Object");
        Method containsMethod = shortArrayAsListClazz.getDeclaredMethod("contains", objectType);
        containsMethod.setAccessible(true);
        java.lang.Object[] containsMethodArguments = new java.lang.Object[1];
        containsMethodArguments[0] = null;
        boolean actual = ((boolean) containsMethod.invoke(shortArrayAsList, containsMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testContains8() throws Throwable  {
        Object shortArrayAsList = createInstance("com.google.common.primitives.Shorts$ShortArrayAsList");
        setField(shortArrayAsList, "end", 0);
        setField(shortArrayAsList, "start", 0);
        short[] shortArray = new short[9];
        setField(shortArrayAsList, "array", shortArray);
        Short short1 = (short) 0;
        
        Class shortArrayAsListClazz = Class.forName("com.google.common.primitives.Shorts$ShortArrayAsList");
        Class short1Type = Class.forName("java.lang.Object");
        Method containsMethod = shortArrayAsListClazz.getDeclaredMethod("contains", short1Type);
        containsMethod.setAccessible(true);
        java.lang.Object[] containsMethodArguments = new java.lang.Object[1];
        containsMethodArguments[0] = short1;
        boolean actual = ((boolean) containsMethod.invoke(shortArrayAsList, containsMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testContains9() throws Throwable  {
        Object shortArrayAsList = createInstance("com.google.common.primitives.Shorts$ShortArrayAsList");
        setField(shortArrayAsList, "end", 0);
        setField(shortArrayAsList, "start", 0);
        short[] shortArray = new short[9];
        setField(shortArrayAsList, "array", shortArray);
        Short short1 = (short) 0;
        
        Class shortArrayAsListClazz = Class.forName("com.google.common.primitives.Shorts$ShortArrayAsList");
        Class short1Type = Class.forName("java.lang.Object");
        Method containsMethod = shortArrayAsListClazz.getDeclaredMethod("contains", short1Type);
        containsMethod.setAccessible(true);
        java.lang.Object[] containsMethodArguments = new java.lang.Object[1];
        containsMethodArguments[0] = short1;
        boolean actual = ((boolean) containsMethod.invoke(shortArrayAsList, containsMethodArguments));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIsEmpty1() throws Throwable  {
        Object shortArrayAsList = createInstance("com.google.common.primitives.Shorts$ShortArrayAsList");
        
        Class shortArrayAsListClazz = Class.forName("com.google.common.primitives.Shorts$ShortArrayAsList");
        Method isEmptyMethod = shortArrayAsListClazz.getDeclaredMethod("isEmpty");
        isEmptyMethod.setAccessible(true);
        java.lang.Object[] isEmptyMethodArguments = new java.lang.Object[0];
        boolean actual = ((boolean) isEmptyMethod.invoke(shortArrayAsList, isEmptyMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIsEmpty2() throws Throwable  {
        Object shortArrayAsList = createInstance("com.google.common.primitives.Shorts$ShortArrayAsList");
        
        Class shortArrayAsListClazz = Class.forName("com.google.common.primitives.Shorts$ShortArrayAsList");
        Method isEmptyMethod = shortArrayAsListClazz.getDeclaredMethod("isEmpty");
        isEmptyMethod.setAccessible(true);
        java.lang.Object[] isEmptyMethodArguments = new java.lang.Object[0];
        boolean actual = ((boolean) isEmptyMethod.invoke(shortArrayAsList, isEmptyMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testEquals1() throws Throwable  {
        Object shortArrayAsList = createInstance("com.google.common.primitives.Shorts$ShortArrayAsList");
        Object object = new Object();
        
        Class shortArrayAsListClazz = Class.forName("com.google.common.primitives.Shorts$ShortArrayAsList");
        Class objectType = Class.forName("java.lang.Object");
        Method equalsMethod = shortArrayAsListClazz.getDeclaredMethod("equals", objectType);
        equalsMethod.setAccessible(true);
        java.lang.Object[] equalsMethodArguments = new java.lang.Object[1];
        equalsMethodArguments[0] = object;
        boolean actual = ((boolean) equalsMethod.invoke(shortArrayAsList, equalsMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testEquals2() throws Throwable  {
        Object shortArrayAsList = createInstance("com.google.common.primitives.Shorts$ShortArrayAsList");
        
        Class shortArrayAsListClazz = Class.forName("com.google.common.primitives.Shorts$ShortArrayAsList");
        Class shortArrayAsListType = Class.forName("java.lang.Object");
        Method equalsMethod = shortArrayAsListClazz.getDeclaredMethod("equals", shortArrayAsListType);
        equalsMethod.setAccessible(true);
        java.lang.Object[] equalsMethodArguments = new java.lang.Object[1];
        equalsMethodArguments[0] = shortArrayAsList;
        boolean actual = ((boolean) equalsMethod.invoke(shortArrayAsList, equalsMethodArguments));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testEquals3() throws Throwable  {
        Object shortArrayAsList = createInstance("com.google.common.primitives.Shorts$ShortArrayAsList");
        java.lang.NullPointerException[] nullPointerExceptionArray = new java.lang.NullPointerException[0];
        
        Class shortArrayAsListClazz = Class.forName("com.google.common.primitives.Shorts$ShortArrayAsList");
        Class nullPointerExceptionArrayType = Class.forName("java.lang.Object");
        Method equalsMethod = shortArrayAsListClazz.getDeclaredMethod("equals", nullPointerExceptionArrayType);
        equalsMethod.setAccessible(true);
        java.lang.Object[] equalsMethodArguments = new java.lang.Object[1];
        equalsMethodArguments[0] = ((Object) nullPointerExceptionArray);
        boolean actual = ((boolean) equalsMethod.invoke(shortArrayAsList, equalsMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testEquals4() throws Throwable  {
        Object shortArrayAsList = createInstance("com.google.common.primitives.Shorts$ShortArrayAsList");
        setField(shortArrayAsList, "end", 306783378);
        setField(shortArrayAsList, "start", 0);
        Object shortArrayAsList1 = createInstance("com.google.common.primitives.Shorts$ShortArrayAsList");
        setField(shortArrayAsList1, "end", Integer.MIN_VALUE);
        setField(shortArrayAsList1, "start", 2004877312);
        
        Class shortArrayAsListClazz = Class.forName("com.google.common.primitives.Shorts$ShortArrayAsList");
        Class shortArrayAsList1Type = Class.forName("java.lang.Object");
        Method equalsMethod = shortArrayAsListClazz.getDeclaredMethod("equals", shortArrayAsList1Type);
        equalsMethod.setAccessible(true);
        java.lang.Object[] equalsMethodArguments = new java.lang.Object[1];
        equalsMethodArguments[0] = shortArrayAsList1;
        boolean actual = ((boolean) equalsMethod.invoke(shortArrayAsList, equalsMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testEquals5() throws Throwable  {
        Object shortArrayAsList = createInstance("com.google.common.primitives.Shorts$ShortArrayAsList");
        setField(shortArrayAsList, "end", 306783378);
        setField(shortArrayAsList, "start", 2143888531);
        Object shortArrayAsList1 = createInstance("com.google.common.primitives.Shorts$ShortArrayAsList");
        setField(shortArrayAsList1, "end", 1909706752);
        setField(shortArrayAsList1, "start", -548155391);
        
        Class shortArrayAsListClazz = Class.forName("com.google.common.primitives.Shorts$ShortArrayAsList");
        Class shortArrayAsList1Type = Class.forName("java.lang.Object");
        Method equalsMethod = shortArrayAsListClazz.getDeclaredMethod("equals", shortArrayAsList1Type);
        equalsMethod.setAccessible(true);
        java.lang.Object[] equalsMethodArguments = new java.lang.Object[1];
        equalsMethodArguments[0] = shortArrayAsList1;
        boolean actual = ((boolean) equalsMethod.invoke(shortArrayAsList, equalsMethodArguments));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testEquals6() throws Throwable  {
        Object shortArrayAsList = createInstance("com.google.common.primitives.Shorts$ShortArrayAsList");
        setField(shortArrayAsList, "end", -2147483609);
        setField(shortArrayAsList, "start", 40);
        short[] shortArray = new short[40];
        setField(shortArrayAsList, "array", shortArray);
        Object shortArrayAsList1 = createInstance("com.google.common.primitives.Shorts$ShortArrayAsList");
        setField(shortArrayAsList1, "end", -438830204);
        setField(shortArrayAsList1, "start", 1708653445);
        setField(shortArrayAsList1, "array", null);
        
        Class shortArrayAsListClazz = Class.forName("com.google.common.primitives.Shorts$ShortArrayAsList");
        Class shortArrayAsList1Type = Class.forName("java.lang.Object");
        Method equalsMethod = shortArrayAsListClazz.getDeclaredMethod("equals", shortArrayAsList1Type);
        equalsMethod.setAccessible(true);
        java.lang.Object[] equalsMethodArguments = new java.lang.Object[1];
        equalsMethodArguments[0] = shortArrayAsList1;
        try {
            equalsMethod.invoke(shortArrayAsList, equalsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testEquals7() throws Throwable  {
        Object shortArrayAsList = createInstance("com.google.common.primitives.Shorts$ShortArrayAsList");
        setField(shortArrayAsList, "end", 306783378);
        setField(shortArrayAsList, "start", -3595117);
        short[] shortArray = new short[12];
        setField(shortArrayAsList, "array", shortArray);
        Object shortArrayAsList1 = createInstance("com.google.common.primitives.Shorts$ShortArrayAsList");
        setField(shortArrayAsList1, "end", 1909706752);
        setField(shortArrayAsList1, "start", 1599328257);
        setField(shortArrayAsList1, "array", null);
        
        Class shortArrayAsListClazz = Class.forName("com.google.common.primitives.Shorts$ShortArrayAsList");
        Class shortArrayAsList1Type = Class.forName("java.lang.Object");
        Method equalsMethod = shortArrayAsListClazz.getDeclaredMethod("equals", shortArrayAsList1Type);
        equalsMethod.setAccessible(true);
        java.lang.Object[] equalsMethodArguments = new java.lang.Object[1];
        equalsMethodArguments[0] = shortArrayAsList1;
        try {
            equalsMethod.invoke(shortArrayAsList, equalsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testEquals8() throws Throwable  {
        Object shortArrayAsList = createInstance("com.google.common.primitives.Shorts$ShortArrayAsList");
        setField(shortArrayAsList, "end", 536869183);
        setField(shortArrayAsList, "start", 0);
        short[] shortArray = new short[9];
        setField(shortArrayAsList, "array", shortArray);
        Object shortArrayAsList1 = createInstance("com.google.common.primitives.Shorts$ShortArrayAsList");
        setField(shortArrayAsList1, "end", -1210484720);
        setField(shortArrayAsList1, "start", -1747353903);
        setField(shortArrayAsList1, "array", shortArray);
        
        Class shortArrayAsListClazz = Class.forName("com.google.common.primitives.Shorts$ShortArrayAsList");
        Class shortArrayAsList1Type = Class.forName("java.lang.Object");
        Method equalsMethod = shortArrayAsListClazz.getDeclaredMethod("equals", shortArrayAsList1Type);
        equalsMethod.setAccessible(true);
        java.lang.Object[] equalsMethodArguments = new java.lang.Object[1];
        equalsMethodArguments[0] = shortArrayAsList1;
        try {
            equalsMethod.invoke(shortArrayAsList, equalsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testEquals9() throws Throwable  {
        Object shortArrayAsList = createInstance("com.google.common.primitives.Shorts$ShortArrayAsList");
        setField(shortArrayAsList, "end", 2147483099);
        setField(shortArrayAsList, "start", 0);
        short[] shortArray = new short[9];
        setField(shortArrayAsList, "array", shortArray);
        Object shortArrayAsList1 = createInstance("com.google.common.primitives.Shorts$ShortArrayAsList");
        setField(shortArrayAsList1, "end", 2147483139);
        setField(shortArrayAsList1, "start", 40);
        short[] shortArray1 = new short[40];
        setField(shortArrayAsList1, "array", shortArray1);
        
        Class shortArrayAsListClazz = Class.forName("com.google.common.primitives.Shorts$ShortArrayAsList");
        Class shortArrayAsList1Type = Class.forName("java.lang.Object");
        Method equalsMethod = shortArrayAsListClazz.getDeclaredMethod("equals", shortArrayAsList1Type);
        equalsMethod.setAccessible(true);
        java.lang.Object[] equalsMethodArguments = new java.lang.Object[1];
        equalsMethodArguments[0] = shortArrayAsList1;
        try {
            equalsMethod.invoke(shortArrayAsList, equalsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testEquals10() throws Throwable  {
        Object shortArrayAsList = createInstance("com.google.common.primitives.Shorts$ShortArrayAsList");
        setField(shortArrayAsList, "end", -2147483641);
        setField(shortArrayAsList, "start", 8);
        short[] shortArray = new short[9];
        shortArray[8] = java.lang.Short.MIN_VALUE;
        setField(shortArrayAsList, "array", shortArray);
        Object shortArrayAsList1 = createInstance("com.google.common.primitives.Shorts$ShortArrayAsList");
        setField(shortArrayAsList1, "end", Integer.MAX_VALUE);
        setField(shortArrayAsList1, "start", 0);
        setField(shortArrayAsList1, "array", shortArray);
        
        Class shortArrayAsListClazz = Class.forName("com.google.common.primitives.Shorts$ShortArrayAsList");
        Class shortArrayAsList1Type = Class.forName("java.lang.Object");
        Method equalsMethod = shortArrayAsListClazz.getDeclaredMethod("equals", shortArrayAsList1Type);
        equalsMethod.setAccessible(true);
        java.lang.Object[] equalsMethodArguments = new java.lang.Object[1];
        equalsMethodArguments[0] = shortArrayAsList1;
        boolean actual = ((boolean) equalsMethod.invoke(shortArrayAsList, equalsMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testEquals11() throws Throwable  {
        Object shortArrayAsList = createInstance("com.google.common.primitives.Shorts$ShortArrayAsList");
        setField(shortArrayAsList, "end", 1);
        setField(shortArrayAsList, "start", 0);
        short[] shortArray = new short[9];
        setField(shortArrayAsList, "array", shortArray);
        Object shortArrayAsList1 = createInstance("com.google.common.primitives.Shorts$ShortArrayAsList");
        setField(shortArrayAsList1, "end", 1);
        setField(shortArrayAsList1, "start", 0);
        setField(shortArrayAsList1, "array", shortArray);
        
        Class shortArrayAsListClazz = Class.forName("com.google.common.primitives.Shorts$ShortArrayAsList");
        Class shortArrayAsList1Type = Class.forName("java.lang.Object");
        Method equalsMethod = shortArrayAsListClazz.getDeclaredMethod("equals", shortArrayAsList1Type);
        equalsMethod.setAccessible(true);
        java.lang.Object[] equalsMethodArguments = new java.lang.Object[1];
        equalsMethodArguments[0] = shortArrayAsList1;
        boolean actual = ((boolean) equalsMethod.invoke(shortArrayAsList, equalsMethodArguments));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testEquals12() throws Throwable  {
        Object shortArrayAsList = createInstance("com.google.common.primitives.Shorts$ShortArrayAsList");
        setField(shortArrayAsList, "end", -1);
        setField(shortArrayAsList, "start", Integer.MAX_VALUE);
        Object checkedRandomAccessList = createInstance("java.util.Collections$CheckedRandomAccessList");
        
        Class shortArrayAsListClazz = Class.forName("com.google.common.primitives.Shorts$ShortArrayAsList");
        Class checkedRandomAccessListType = Class.forName("java.lang.Object");
        Method equalsMethod = shortArrayAsListClazz.getDeclaredMethod("equals", checkedRandomAccessListType);
        equalsMethod.setAccessible(true);
        java.lang.Object[] equalsMethodArguments = new java.lang.Object[1];
        equalsMethodArguments[0] = checkedRandomAccessList;
        try {
            equalsMethod.invoke(shortArrayAsList, equalsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testHashCode3() throws Throwable  {
        Object shortArrayAsList = createInstance("com.google.common.primitives.Shorts$ShortArrayAsList");
        
        Class shortArrayAsListClazz = Class.forName("com.google.common.primitives.Shorts$ShortArrayAsList");
        Method hashCodeMethod = shortArrayAsListClazz.getDeclaredMethod("hashCode");
        hashCodeMethod.setAccessible(true);
        java.lang.Object[] hashCodeMethodArguments = new java.lang.Object[0];
        int actual = ((int) hashCodeMethod.invoke(shortArrayAsList, hashCodeMethodArguments));
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testHashCode4() throws Throwable  {
        Object shortArrayAsList = createInstance("com.google.common.primitives.Shorts$ShortArrayAsList");
        setField(shortArrayAsList, "end", -2147483647);
        setField(shortArrayAsList, "start", 0);
        
        Class shortArrayAsListClazz = Class.forName("com.google.common.primitives.Shorts$ShortArrayAsList");
        Method hashCodeMethod = shortArrayAsListClazz.getDeclaredMethod("hashCode");
        hashCodeMethod.setAccessible(true);
        java.lang.Object[] hashCodeMethodArguments = new java.lang.Object[0];
        int actual = ((int) hashCodeMethod.invoke(shortArrayAsList, hashCodeMethodArguments));
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testHashCode5() throws Throwable  {
        Object shortArrayAsList = createInstance("com.google.common.primitives.Shorts$ShortArrayAsList");
        setField(shortArrayAsList, "end", 1);
        setField(shortArrayAsList, "start", Integer.MIN_VALUE);
        short[] shortArray = new short[9];
        setField(shortArrayAsList, "array", shortArray);
        
        Class shortArrayAsListClazz = Class.forName("com.google.common.primitives.Shorts$ShortArrayAsList");
        Method hashCodeMethod = shortArrayAsListClazz.getDeclaredMethod("hashCode");
        hashCodeMethod.setAccessible(true);
        java.lang.Object[] hashCodeMethodArguments = new java.lang.Object[0];
        try {
            hashCodeMethod.invoke(shortArrayAsList, hashCodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testHashCode6() throws Throwable  {
        Object shortArrayAsList = createInstance("com.google.common.primitives.Shorts$ShortArrayAsList");
        setField(shortArrayAsList, "end", 1073741825);
        setField(shortArrayAsList, "start", 1073741824);
        short[] shortArray = new short[9];
        setField(shortArrayAsList, "array", shortArray);
        
        Class shortArrayAsListClazz = Class.forName("com.google.common.primitives.Shorts$ShortArrayAsList");
        Method hashCodeMethod = shortArrayAsListClazz.getDeclaredMethod("hashCode");
        hashCodeMethod.setAccessible(true);
        java.lang.Object[] hashCodeMethodArguments = new java.lang.Object[0];
        try {
            hashCodeMethod.invoke(shortArrayAsList, hashCodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testHashCode7() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(Shorts.class);
            mockedStatic.when(() -> {
                Shorts.hashCode(anyShort());
            }).thenReturn(0);
            Object shortArrayAsList = createInstance("com.google.common.primitives.Shorts$ShortArrayAsList");
            setField(shortArrayAsList, "end", 1);
            setField(shortArrayAsList, "start", 0);
            short[] shortArray = new short[9];
            setField(shortArrayAsList, "array", shortArray);
            
            Class shortArrayAsListClazz = Class.forName("com.google.common.primitives.Shorts$ShortArrayAsList");
            Method hashCodeMethod = shortArrayAsListClazz.getDeclaredMethod("hashCode");
            hashCodeMethod.setAccessible(true);
            java.lang.Object[] hashCodeMethodArguments = new java.lang.Object[0];
            int actual = ((int) hashCodeMethod.invoke(shortArrayAsList, hashCodeMethodArguments));
            
            assertEquals(31, actual);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testToString1() throws Throwable  {
        Object shortArrayAsList = createInstance("com.google.common.primitives.Shorts$ShortArrayAsList");
        
        Class shortArrayAsListClazz = Class.forName("com.google.common.primitives.Shorts$ShortArrayAsList");
        Method toStringMethod = shortArrayAsListClazz.getDeclaredMethod("toString");
        toStringMethod.setAccessible(true);
        java.lang.Object[] toStringMethodArguments = new java.lang.Object[0];
        try {
            toStringMethod.invoke(shortArrayAsList, toStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testToString2() throws Throwable  {
        Object shortArrayAsList = createInstance("com.google.common.primitives.Shorts$ShortArrayAsList");
        setField(shortArrayAsList, "end", 0);
        setField(shortArrayAsList, "start", Integer.MIN_VALUE);
        short[] shortArray = new short[9];
        setField(shortArrayAsList, "array", shortArray);
        
        Class shortArrayAsListClazz = Class.forName("com.google.common.primitives.Shorts$ShortArrayAsList");
        Method toStringMethod = shortArrayAsListClazz.getDeclaredMethod("toString");
        toStringMethod.setAccessible(true);
        java.lang.Object[] toStringMethodArguments = new java.lang.Object[0];
        try {
            toStringMethod.invoke(shortArrayAsList, toStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testToString3() throws Throwable  {
        Object shortArrayAsList = createInstance("com.google.common.primitives.Shorts$ShortArrayAsList");
        setField(shortArrayAsList, "end", 0);
        setField(shortArrayAsList, "start", 1073741824);
        short[] shortArray = new short[9];
        setField(shortArrayAsList, "array", shortArray);
        
        Class shortArrayAsListClazz = Class.forName("com.google.common.primitives.Shorts$ShortArrayAsList");
        Method toStringMethod = shortArrayAsListClazz.getDeclaredMethod("toString");
        toStringMethod.setAccessible(true);
        java.lang.Object[] toStringMethodArguments = new java.lang.Object[0];
        try {
            toStringMethod.invoke(shortArrayAsList, toStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testSet1() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(com.google.common.base.Preconditions.class);
            mockedStatic.when(() -> {
                com.google.common.base.Preconditions.checkElementIndex(anyInt(), anyInt());
            }).thenReturn(0);
            Object shortArrayAsList = createInstance("com.google.common.primitives.Shorts$ShortArrayAsList");
            setField(shortArrayAsList, "end", 0);
            setField(shortArrayAsList, "start", 1073741824);
            short[] shortArray = new short[9];
            setField(shortArrayAsList, "array", shortArray);
            
            Class shortArrayAsListClazz = Class.forName("com.google.common.primitives.Shorts$ShortArrayAsList");
            Class intType = int.class;
            Class shortType = Class.forName("java.lang.Short");
            Method setMethod = shortArrayAsListClazz.getDeclaredMethod("set", intType, shortType);
            setMethod.setAccessible(true);
            java.lang.Object[] setMethodArguments = new java.lang.Object[2];
            setMethodArguments[0] = 0;
            setMethodArguments[1] = null;
            try {
                setMethod.invoke(shortArrayAsList, setMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }} finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testSet2() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(com.google.common.base.Preconditions.class);
            mockedStatic.when(() -> {
                com.google.common.base.Preconditions.checkElementIndex(anyInt(), anyInt());
            }).thenReturn(0);
            Object shortArrayAsList = createInstance("com.google.common.primitives.Shorts$ShortArrayAsList");
            setField(shortArrayAsList, "end", 0);
            setField(shortArrayAsList, "start", 1073741824);
            short[] shortArray = new short[9];
            setField(shortArrayAsList, "array", shortArray);
            
            Class shortArrayAsListClazz = Class.forName("com.google.common.primitives.Shorts$ShortArrayAsList");
            Class intType = int.class;
            Class shortType = Class.forName("java.lang.Short");
            Method setMethod = shortArrayAsListClazz.getDeclaredMethod("set", intType, shortType);
            setMethod.setAccessible(true);
            java.lang.Object[] setMethodArguments = new java.lang.Object[2];
            setMethodArguments[0] = 1073741824;
            setMethodArguments[1] = null;
            try {
                setMethod.invoke(shortArrayAsList, setMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }} finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testSet3() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(com.google.common.base.Preconditions.class);
            mockedStatic.when(() -> {
                com.google.common.base.Preconditions.checkElementIndex(anyInt(), anyInt());
            }).thenReturn(0);
            java.lang.Object[] lifoWaitQueueArray = createArray("java.util.concurrent.SynchronousQueue$LifoWaitQueue", 0);
            mockedStatic.when(() -> {
                com.google.common.base.Preconditions.checkNotNull(any());
            }).thenReturn(((Object) lifoWaitQueueArray));
            Object shortArrayAsList = createInstance("com.google.common.primitives.Shorts$ShortArrayAsList");
            setField(shortArrayAsList, "end", 0);
            setField(shortArrayAsList, "start", 0);
            short[] shortArray = new short[9];
            setField(shortArrayAsList, "array", shortArray);
            Short short1 = (short) 0;
            
            Class shortArrayAsListClazz = Class.forName("com.google.common.primitives.Shorts$ShortArrayAsList");
            Class intType = int.class;
            Class short1Type = Class.forName("java.lang.Short");
            Method setMethod = shortArrayAsListClazz.getDeclaredMethod("set", intType, short1Type);
            setMethod.setAccessible(true);
            java.lang.Object[] setMethodArguments = new java.lang.Object[2];
            setMethodArguments[0] = 0;
            setMethodArguments[1] = short1;
            try {
                setMethod.invoke(shortArrayAsList, setMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }} finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testSet4() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(com.google.common.base.Preconditions.class);
            mockedStatic.when(() -> {
                com.google.common.base.Preconditions.checkElementIndex(anyInt(), anyInt());
            }).thenReturn(0);
            mockedStatic.when(() -> {
                com.google.common.base.Preconditions.checkNotNull(any());
            }).thenReturn(null);
            Object shortArrayAsList = createInstance("com.google.common.primitives.Shorts$ShortArrayAsList");
            setField(shortArrayAsList, "end", 0);
            setField(shortArrayAsList, "start", 0);
            short[] shortArray = new short[9];
            setField(shortArrayAsList, "array", shortArray);
            Short short1 = (short) 0;
            
            Class shortArrayAsListClazz = Class.forName("com.google.common.primitives.Shorts$ShortArrayAsList");
            Class intType = int.class;
            Class short1Type = Class.forName("java.lang.Short");
            Method setMethod = shortArrayAsListClazz.getDeclaredMethod("set", intType, short1Type);
            setMethod.setAccessible(true);
            java.lang.Object[] setMethodArguments = new java.lang.Object[2];
            setMethodArguments[0] = 0;
            setMethodArguments[1] = short1;
            try {
                setMethod.invoke(shortArrayAsList, setMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }} finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSet5() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(com.google.common.base.Preconditions.class);
            mockedStatic.when(() -> {
                com.google.common.base.Preconditions.checkElementIndex(anyInt(), anyInt());
            }).thenReturn(0);
            Short short1 = (short) 0;
            mockedStatic.when(() -> {
                com.google.common.base.Preconditions.checkNotNull(any());
            }).thenReturn(((Object) short1));
            Object shortArrayAsList = createInstance("com.google.common.primitives.Shorts$ShortArrayAsList");
            setField(shortArrayAsList, "end", 0);
            setField(shortArrayAsList, "start", 0);
            short[] shortArray = new short[9];
            setField(shortArrayAsList, "array", shortArray);
            
            Class shortArrayAsListClazz = Class.forName("com.google.common.primitives.Shorts$ShortArrayAsList");
            Class intType = int.class;
            Class shortType = Class.forName("java.lang.Short");
            Method setMethod = shortArrayAsListClazz.getDeclaredMethod("set", intType, shortType);
            setMethod.setAccessible(true);
            java.lang.Object[] setMethodArguments = new java.lang.Object[2];
            setMethodArguments[0] = 0;
            setMethodArguments[1] = null;
            Short actual = ((Short) setMethod.invoke(shortArrayAsList, setMethodArguments));
            
            Short expected = (short) 0;
            
            // Current deep equals depth exceeds max depth 0
            assertTrue(deepEquals(expected, actual));
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSubList1() throws Throwable  {
        Object shortArrayAsList = createInstance("com.google.common.primitives.Shorts$ShortArrayAsList");
        
        Class shortArrayAsListClazz = Class.forName("com.google.common.primitives.Shorts$ShortArrayAsList");
        Class intType = int.class;
        Method subListMethod = shortArrayAsListClazz.getDeclaredMethod("subList", intType, intType);
        subListMethod.setAccessible(true);
        java.lang.Object[] subListMethodArguments = new java.lang.Object[2];
        subListMethodArguments[0] = 0;
        subListMethodArguments[1] = 0;
        List actual = ((List) subListMethod.invoke(shortArrayAsList, subListMethodArguments));
        
        Object expected = createInstance("java.util.Collections$EmptyList");
        setField(expected, "modCount", 0);
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSubList2() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(com.google.common.base.Preconditions.class);
            Object shortArrayAsList = createInstance("com.google.common.primitives.Shorts$ShortArrayAsList");
            setField(shortArrayAsList, "modCount", 0);
            setField(shortArrayAsList, "end", 0);
            setField(shortArrayAsList, "start", 0);
            short[] shortArray = new short[9];
            setField(shortArrayAsList, "array", shortArray);
            
            Class shortArrayAsListClazz = Class.forName("com.google.common.primitives.Shorts$ShortArrayAsList");
            Class intType = int.class;
            Method subListMethod = shortArrayAsListClazz.getDeclaredMethod("subList", intType, intType);
            subListMethod.setAccessible(true);
            java.lang.Object[] subListMethodArguments = new java.lang.Object[2];
            subListMethodArguments[0] = 0;
            subListMethodArguments[1] = 8;
            List actual = ((List) subListMethod.invoke(shortArrayAsList, subListMethodArguments));
            
            Object expected = createInstance("com.google.common.primitives.Shorts$ShortArrayAsList");
            setField(expected, "modCount", 0);
            setField(expected, "end", 8);
            setField(expected, "start", 0);
            setField(expected, "array", shortArray);
            
            // Current deep equals depth exceeds max depth 0
            assertTrue(deepEquals(expected, actual));
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSubList3() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(com.google.common.base.Preconditions.class);
            Object shortArrayAsList = createInstance("com.google.common.primitives.Shorts$ShortArrayAsList");
            setField(shortArrayAsList, "modCount", 0);
            setField(shortArrayAsList, "end", 0);
            setField(shortArrayAsList, "start", 0);
            
            Class shortArrayAsListClazz = Class.forName("com.google.common.primitives.Shorts$ShortArrayAsList");
            Class intType = int.class;
            Method subListMethod = shortArrayAsListClazz.getDeclaredMethod("subList", intType, intType);
            subListMethod.setAccessible(true);
            java.lang.Object[] subListMethodArguments = new java.lang.Object[2];
            subListMethodArguments[0] = 0;
            subListMethodArguments[1] = 0;
            List actual = ((List) subListMethod.invoke(shortArrayAsList, subListMethodArguments));
            
            ArrayList expected = new ArrayList();
            
            // Current deep equals depth exceeds max depth 0
            assertTrue(deepEquals(expected, actual));
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGet1() throws Throwable  {
        Object shortArrayAsList = createInstance("com.google.common.primitives.Shorts$ShortArrayAsList");
        
        Class shortArrayAsListClazz = Class.forName("com.google.common.primitives.Shorts$ShortArrayAsList");
        Class intType = int.class;
        Method getMethod = shortArrayAsListClazz.getDeclaredMethod("get", intType);
        getMethod.setAccessible(true);
        java.lang.Object[] getMethodArguments = new java.lang.Object[1];
        getMethodArguments[0] = 0;
        try {
            getMethod.invoke(shortArrayAsList, getMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGet2() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(com.google.common.base.Preconditions.class);
            mockedStatic.when(() -> {
                com.google.common.base.Preconditions.checkElementIndex(anyInt(), anyInt());
            }).thenReturn(0);
            Object shortArrayAsList = createInstance("com.google.common.primitives.Shorts$ShortArrayAsList");
            setField(shortArrayAsList, "end", 0);
            setField(shortArrayAsList, "start", 1073741824);
            short[] shortArray = new short[9];
            setField(shortArrayAsList, "array", shortArray);
            
            Class shortArrayAsListClazz = Class.forName("com.google.common.primitives.Shorts$ShortArrayAsList");
            Class intType = int.class;
            Method getMethod = shortArrayAsListClazz.getDeclaredMethod("get", intType);
            getMethod.setAccessible(true);
            java.lang.Object[] getMethodArguments = new java.lang.Object[1];
            getMethodArguments[0] = 0;
            try {
                getMethod.invoke(shortArrayAsList, getMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }} finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGet3() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(com.google.common.base.Preconditions.class);
            mockedStatic.when(() -> {
                com.google.common.base.Preconditions.checkElementIndex(anyInt(), anyInt());
            }).thenReturn(0);
            Object shortArrayAsList = createInstance("com.google.common.primitives.Shorts$ShortArrayAsList");
            setField(shortArrayAsList, "end", 0);
            setField(shortArrayAsList, "start", 1073741823);
            short[] shortArray = new short[9];
            setField(shortArrayAsList, "array", shortArray);
            
            Class shortArrayAsListClazz = Class.forName("com.google.common.primitives.Shorts$ShortArrayAsList");
            Class intType = int.class;
            Method getMethod = shortArrayAsListClazz.getDeclaredMethod("get", intType);
            getMethod.setAccessible(true);
            java.lang.Object[] getMethodArguments = new java.lang.Object[1];
            getMethodArguments[0] = 1073741825;
            try {
                getMethod.invoke(shortArrayAsList, getMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }} finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGet4() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(com.google.common.base.Preconditions.class);
            mockedStatic.when(() -> {
                com.google.common.base.Preconditions.checkElementIndex(anyInt(), anyInt());
            }).thenReturn(0);
            Object shortArrayAsList = createInstance("com.google.common.primitives.Shorts$ShortArrayAsList");
            setField(shortArrayAsList, "end", 0);
            setField(shortArrayAsList, "start", 0);
            short[] shortArray = new short[9];
            setField(shortArrayAsList, "array", shortArray);
            
            Class shortArrayAsListClazz = Class.forName("com.google.common.primitives.Shorts$ShortArrayAsList");
            Class intType = int.class;
            Method getMethod = shortArrayAsListClazz.getDeclaredMethod("get", intType);
            getMethod.setAccessible(true);
            java.lang.Object[] getMethodArguments = new java.lang.Object[1];
            getMethodArguments[0] = 0;
            Short actual = ((Short) getMethod.invoke(shortArrayAsList, getMethodArguments));
            
            Short expected = (short) 0;
            
            // Current deep equals depth exceeds max depth 0
            assertTrue(deepEquals(expected, actual));
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIndexOf19() throws Throwable  {
        Object shortArrayAsList = createInstance("com.google.common.primitives.Shorts$ShortArrayAsList");
        Object object = new Object();
        
        Class shortArrayAsListClazz = Class.forName("com.google.common.primitives.Shorts$ShortArrayAsList");
        Class objectType = Class.forName("java.lang.Object");
        Method indexOfMethod = shortArrayAsListClazz.getDeclaredMethod("indexOf", objectType);
        indexOfMethod.setAccessible(true);
        java.lang.Object[] indexOfMethodArguments = new java.lang.Object[1];
        indexOfMethodArguments[0] = object;
        int actual = ((int) indexOfMethod.invoke(shortArrayAsList, indexOfMethodArguments));
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIndexOf20() throws Throwable  {
        Object shortArrayAsList = createInstance("com.google.common.primitives.Shorts$ShortArrayAsList");
        
        Class shortArrayAsListClazz = Class.forName("com.google.common.primitives.Shorts$ShortArrayAsList");
        Class objectType = Class.forName("java.lang.Object");
        Method indexOfMethod = shortArrayAsListClazz.getDeclaredMethod("indexOf", objectType);
        indexOfMethod.setAccessible(true);
        java.lang.Object[] indexOfMethodArguments = new java.lang.Object[1];
        indexOfMethodArguments[0] = null;
        int actual = ((int) indexOfMethod.invoke(shortArrayAsList, indexOfMethodArguments));
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIndexOf21() throws Throwable  {
        Object shortArrayAsList = createInstance("com.google.common.primitives.Shorts$ShortArrayAsList");
        setField(shortArrayAsList, "end", 0);
        setField(shortArrayAsList, "start", 0);
        short[] shortArray = new short[9];
        setField(shortArrayAsList, "array", shortArray);
        Short short1 = (short) 0;
        
        Class shortArrayAsListClazz = Class.forName("com.google.common.primitives.Shorts$ShortArrayAsList");
        Class short1Type = Class.forName("java.lang.Object");
        Method indexOfMethod = shortArrayAsListClazz.getDeclaredMethod("indexOf", short1Type);
        indexOfMethod.setAccessible(true);
        java.lang.Object[] indexOfMethodArguments = new java.lang.Object[1];
        indexOfMethodArguments[0] = short1;
        int actual = ((int) indexOfMethod.invoke(shortArrayAsList, indexOfMethodArguments));
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIndexOf22() throws Throwable  {
        Object shortArrayAsList = createInstance("com.google.common.primitives.Shorts$ShortArrayAsList");
        setField(shortArrayAsList, "end", 0);
        setField(shortArrayAsList, "start", 0);
        short[] shortArray = new short[9];
        setField(shortArrayAsList, "array", shortArray);
        Short short1 = (short) 0;
        
        Class shortArrayAsListClazz = Class.forName("com.google.common.primitives.Shorts$ShortArrayAsList");
        Class short1Type = Class.forName("java.lang.Object");
        Method indexOfMethod = shortArrayAsListClazz.getDeclaredMethod("indexOf", short1Type);
        indexOfMethod.setAccessible(true);
        java.lang.Object[] indexOfMethodArguments = new java.lang.Object[1];
        indexOfMethodArguments[0] = short1;
        int actual = ((int) indexOfMethod.invoke(shortArrayAsList, indexOfMethodArguments));
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testLastIndexOf13() throws Throwable  {
        Object shortArrayAsList = createInstance("com.google.common.primitives.Shorts$ShortArrayAsList");
        Object object = new Object();
        
        Class shortArrayAsListClazz = Class.forName("com.google.common.primitives.Shorts$ShortArrayAsList");
        Class objectType = Class.forName("java.lang.Object");
        Method lastIndexOfMethod = shortArrayAsListClazz.getDeclaredMethod("lastIndexOf", objectType);
        lastIndexOfMethod.setAccessible(true);
        java.lang.Object[] lastIndexOfMethodArguments = new java.lang.Object[1];
        lastIndexOfMethodArguments[0] = object;
        int actual = ((int) lastIndexOfMethod.invoke(shortArrayAsList, lastIndexOfMethodArguments));
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testLastIndexOf14() throws Throwable  {
        Object shortArrayAsList = createInstance("com.google.common.primitives.Shorts$ShortArrayAsList");
        
        Class shortArrayAsListClazz = Class.forName("com.google.common.primitives.Shorts$ShortArrayAsList");
        Class objectType = Class.forName("java.lang.Object");
        Method lastIndexOfMethod = shortArrayAsListClazz.getDeclaredMethod("lastIndexOf", objectType);
        lastIndexOfMethod.setAccessible(true);
        java.lang.Object[] lastIndexOfMethodArguments = new java.lang.Object[1];
        lastIndexOfMethodArguments[0] = null;
        int actual = ((int) lastIndexOfMethod.invoke(shortArrayAsList, lastIndexOfMethodArguments));
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testLastIndexOf15() throws Throwable  {
        Object shortArrayAsList = createInstance("com.google.common.primitives.Shorts$ShortArrayAsList");
        setField(shortArrayAsList, "end", 0);
        setField(shortArrayAsList, "start", 0);
        short[] shortArray = new short[9];
        setField(shortArrayAsList, "array", shortArray);
        Short short1 = (short) 0;
        
        Class shortArrayAsListClazz = Class.forName("com.google.common.primitives.Shorts$ShortArrayAsList");
        Class short1Type = Class.forName("java.lang.Object");
        Method lastIndexOfMethod = shortArrayAsListClazz.getDeclaredMethod("lastIndexOf", short1Type);
        lastIndexOfMethod.setAccessible(true);
        java.lang.Object[] lastIndexOfMethodArguments = new java.lang.Object[1];
        lastIndexOfMethodArguments[0] = short1;
        int actual = ((int) lastIndexOfMethod.invoke(shortArrayAsList, lastIndexOfMethodArguments));
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testLastIndexOf16() throws Throwable  {
        Object shortArrayAsList = createInstance("com.google.common.primitives.Shorts$ShortArrayAsList");
        setField(shortArrayAsList, "end", 0);
        setField(shortArrayAsList, "start", 0);
        short[] shortArray = new short[9];
        setField(shortArrayAsList, "array", shortArray);
        Short short1 = (short) 0;
        
        Class shortArrayAsListClazz = Class.forName("com.google.common.primitives.Shorts$ShortArrayAsList");
        Class short1Type = Class.forName("java.lang.Object");
        Method lastIndexOfMethod = shortArrayAsListClazz.getDeclaredMethod("lastIndexOf", short1Type);
        lastIndexOfMethod.setAccessible(true);
        java.lang.Object[] lastIndexOfMethodArguments = new java.lang.Object[1];
        lastIndexOfMethodArguments[0] = short1;
        int actual = ((int) lastIndexOfMethod.invoke(shortArrayAsList, lastIndexOfMethodArguments));
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testToShortArray1() throws Throwable  {
        Object shortArrayAsList = createInstance("com.google.common.primitives.Shorts$ShortArrayAsList");
        
        Class shortArrayAsListClazz = Class.forName("com.google.common.primitives.Shorts$ShortArrayAsList");
        Method toShortArrayMethod = shortArrayAsListClazz.getDeclaredMethod("toShortArray");
        toShortArrayMethod.setAccessible(true);
        java.lang.Object[] toShortArrayMethodArguments = new java.lang.Object[0];
        try {
            toShortArrayMethod.invoke(shortArrayAsList, toShortArrayMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testToShortArray2() throws Throwable  {
        Object shortArrayAsList = createInstance("com.google.common.primitives.Shorts$ShortArrayAsList");
        setField(shortArrayAsList, "end", 1073741824);
        setField(shortArrayAsList, "start", -1342177280);
        short[] shortArray = new short[9];
        setField(shortArrayAsList, "array", shortArray);
        
        Class shortArrayAsListClazz = Class.forName("com.google.common.primitives.Shorts$ShortArrayAsList");
        Method toShortArrayMethod = shortArrayAsListClazz.getDeclaredMethod("toShortArray");
        toShortArrayMethod.setAccessible(true);
        java.lang.Object[] toShortArrayMethodArguments = new java.lang.Object[0];
        try {
            toShortArrayMethod.invoke(shortArrayAsList, toShortArrayMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testToShortArray3() throws Throwable  {
        Object shortArrayAsList = createInstance("com.google.common.primitives.Shorts$ShortArrayAsList");
        setField(shortArrayAsList, "end", 536870924);
        setField(shortArrayAsList, "start", 536870912);
        short[] shortArray = new short[31];
        setField(shortArrayAsList, "array", shortArray);
        
        Class shortArrayAsListClazz = Class.forName("com.google.common.primitives.Shorts$ShortArrayAsList");
        Method toShortArrayMethod = shortArrayAsListClazz.getDeclaredMethod("toShortArray");
        toShortArrayMethod.setAccessible(true);
        java.lang.Object[] toShortArrayMethodArguments = new java.lang.Object[0];
        try {
            toShortArrayMethod.invoke(shortArrayAsList, toShortArrayMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testToShortArray4() throws Throwable  {
        Object shortArrayAsList = createInstance("com.google.common.primitives.Shorts$ShortArrayAsList");
        setField(shortArrayAsList, "end", 0);
        setField(shortArrayAsList, "start", 0);
        short[] shortArray = new short[1];
        setField(shortArrayAsList, "array", shortArray);
        
        Class shortArrayAsListClazz = Class.forName("com.google.common.primitives.Shorts$ShortArrayAsList");
        Method toShortArrayMethod = shortArrayAsListClazz.getDeclaredMethod("toShortArray");
        toShortArrayMethod.setAccessible(true);
        java.lang.Object[] toShortArrayMethodArguments = new java.lang.Object[0];
        short[] actual = ((short[]) toShortArrayMethod.invoke(shortArrayAsList, toShortArrayMethodArguments));
        
        short[] expected = new short[0];
        assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSize1() throws Throwable  {
        Object shortArrayAsList = createInstance("com.google.common.primitives.Shorts$ShortArrayAsList");
        
        Class shortArrayAsListClazz = Class.forName("com.google.common.primitives.Shorts$ShortArrayAsList");
        Method sizeMethod = shortArrayAsListClazz.getDeclaredMethod("size");
        sizeMethod.setAccessible(true);
        java.lang.Object[] sizeMethodArguments = new java.lang.Object[0];
        int actual = ((int) sizeMethod.invoke(shortArrayAsList, sizeMethodArguments));
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSize2() throws Throwable  {
        Object shortArrayAsList = createInstance("com.google.common.primitives.Shorts$ShortArrayAsList");
        setField(shortArrayAsList, "end", 0);
        setField(shortArrayAsList, "start", 0);
        
        Class shortArrayAsListClazz = Class.forName("com.google.common.primitives.Shorts$ShortArrayAsList");
        Method sizeMethod = shortArrayAsListClazz.getDeclaredMethod("size");
        sizeMethod.setAccessible(true);
        java.lang.Object[] sizeMethodArguments = new java.lang.Object[0];
        int actual = ((int) sizeMethod.invoke(shortArrayAsList, sizeMethodArguments));
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testShortArrayAsList1() throws Throwable  {
        short[] shortArray = new short[0];
        Class shortArrayAsListClazz = Class.forName("com.google.common.primitives.Shorts$ShortArrayAsList");
        Class shortArrayType = Class.forName("[S");
        Constructor shortArrayAsListConstructor = shortArrayAsListClazz.getDeclaredConstructor(shortArrayType);
        shortArrayAsListConstructor.setAccessible(true);
        java.lang.Object[] shortArrayAsListConstructorArguments = new java.lang.Object[1];
        shortArrayAsListConstructorArguments[0] = ((Object) shortArray);
        Object actual = shortArrayAsListConstructor.newInstance(shortArrayAsListConstructorArguments);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testShortArrayAsList2() throws Throwable  {
        Class shortArrayAsListClazz = Class.forName("com.google.common.primitives.Shorts$ShortArrayAsList");
        Class shortArrayType = Class.forName("[S");
        Constructor shortArrayAsListConstructor = shortArrayAsListClazz.getDeclaredConstructor(shortArrayType);
        shortArrayAsListConstructor.setAccessible(true);
        java.lang.Object[] shortArrayAsListConstructorArguments = new java.lang.Object[1];
        shortArrayAsListConstructorArguments[0] = null;
        shortArrayAsListConstructor.newInstance(shortArrayAsListConstructorArguments);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testShortArrayAsList3() throws Throwable  {
        short[] shortArray = new short[0];
        Class shortArrayAsListClazz = Class.forName("com.google.common.primitives.Shorts$ShortArrayAsList");
        Class shortArrayType = Class.forName("[S");
        Constructor shortArrayAsListConstructor = shortArrayAsListClazz.getDeclaredConstructor(shortArrayType);
        shortArrayAsListConstructor.setAccessible(true);
        java.lang.Object[] shortArrayAsListConstructorArguments = new java.lang.Object[1];
        shortArrayAsListConstructorArguments[0] = ((Object) shortArray);
        Object actual = shortArrayAsListConstructor.newInstance(shortArrayAsListConstructorArguments);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testShortArrayAsList4() throws Throwable  {
        short[] shortArray = new short[0];
        Class shortArrayAsListClazz = Class.forName("com.google.common.primitives.Shorts$ShortArrayAsList");
        Class shortArrayType = Class.forName("[S");
        Class intType = int.class;
        Constructor shortArrayAsListConstructor = shortArrayAsListClazz.getDeclaredConstructor(shortArrayType, intType, intType);
        shortArrayAsListConstructor.setAccessible(true);
        java.lang.Object[] shortArrayAsListConstructorArguments = new java.lang.Object[3];
        shortArrayAsListConstructorArguments[0] = ((Object) shortArray);
        shortArrayAsListConstructorArguments[1] = 0;
        shortArrayAsListConstructorArguments[2] = 0;
        Object actual = shortArrayAsListConstructor.newInstance(shortArrayAsListConstructorArguments);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testShortArrayAsList5() throws Throwable  {
        short[] shortArray = new short[9];
        Class shortArrayAsListClazz = Class.forName("com.google.common.primitives.Shorts$ShortArrayAsList");
        Class shortArrayType = Class.forName("[S");
        Class intType = int.class;
        Constructor shortArrayAsListConstructor = shortArrayAsListClazz.getDeclaredConstructor(shortArrayType, intType, intType);
        shortArrayAsListConstructor.setAccessible(true);
        java.lang.Object[] shortArrayAsListConstructorArguments = new java.lang.Object[3];
        shortArrayAsListConstructorArguments[0] = ((Object) shortArray);
        shortArrayAsListConstructorArguments[1] = 0;
        shortArrayAsListConstructorArguments[2] = 0;
        Object actual = shortArrayAsListConstructor.newInstance(shortArrayAsListConstructorArguments);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testToString4() throws Throwable  {
        Class lexicographicalComparatorClazz = Class.forName("com.google.common.primitives.Shorts$LexicographicalComparator");
        Object lexicographicalComparator = getEnumConstantByName(lexicographicalComparatorClazz, "INSTANCE");
        
        Method toStringMethod = lexicographicalComparatorClazz.getDeclaredMethod("toString");
        toStringMethod.setAccessible(true);
        java.lang.Object[] toStringMethodArguments = new java.lang.Object[0];
        String actual = ((String) toStringMethod.invoke(lexicographicalComparator, toStringMethodArguments));
        
        String expected = new String("Shorts.lexicographicalComparator()");
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCompare3() throws Throwable  {
        Class lexicographicalComparatorClazz = Class.forName("com.google.common.primitives.Shorts$LexicographicalComparator");
        Object lexicographicalComparator = getEnumConstantByName(lexicographicalComparatorClazz, "INSTANCE");
        
        Class shortArrayType = Class.forName("[S");
        Method compareMethod = lexicographicalComparatorClazz.getDeclaredMethod("compare", shortArrayType, shortArrayType);
        compareMethod.setAccessible(true);
        java.lang.Object[] compareMethodArguments = new java.lang.Object[2];
        compareMethodArguments[0] = null;
        compareMethodArguments[1] = null;
        try {
            compareMethod.invoke(lexicographicalComparator, compareMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCompare4() throws Throwable  {
        Class lexicographicalComparatorClazz = Class.forName("com.google.common.primitives.Shorts$LexicographicalComparator");
        Object lexicographicalComparator = getEnumConstantByName(lexicographicalComparatorClazz, "INSTANCE");
        short[] shortArray = new short[9];
        
        Class shortArrayType = Class.forName("[S");
        Method compareMethod = lexicographicalComparatorClazz.getDeclaredMethod("compare", shortArrayType, shortArrayType);
        compareMethod.setAccessible(true);
        java.lang.Object[] compareMethodArguments = new java.lang.Object[2];
        compareMethodArguments[0] = ((Object) shortArray);
        compareMethodArguments[1] = null;
        try {
            compareMethod.invoke(lexicographicalComparator, compareMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCompare5() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(Shorts.class);
            mockedStatic.when(() -> {
                Shorts.compare(anyShort(), anyShort());
            }).thenReturn(1);
            Class lexicographicalComparatorClazz = Class.forName("com.google.common.primitives.Shorts$LexicographicalComparator");
            Object lexicographicalComparator = getEnumConstantByName(lexicographicalComparatorClazz, "INSTANCE");
            short[] shortArray = new short[11];
            short[] shortArray1 = new short[10];
            
            Class shortArrayType = Class.forName("[S");
            Method compareMethod = lexicographicalComparatorClazz.getDeclaredMethod("compare", shortArrayType, shortArrayType);
            compareMethod.setAccessible(true);
            java.lang.Object[] compareMethodArguments = new java.lang.Object[2];
            compareMethodArguments[0] = ((Object) shortArray);
            compareMethodArguments[1] = ((Object) shortArray1);
            int actual = ((int) compareMethod.invoke(lexicographicalComparator, compareMethodArguments));
            
            assertEquals(1, actual);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCompare6() throws Throwable  {
        Class lexicographicalComparatorClazz = Class.forName("com.google.common.primitives.Shorts$LexicographicalComparator");
        Object lexicographicalComparator = getEnumConstantByName(lexicographicalComparatorClazz, "INSTANCE");
        short[] shortArray = new short[9];
        short[] shortArray1 = new short[0];
        
        Class shortArrayType = Class.forName("[S");
        Method compareMethod = lexicographicalComparatorClazz.getDeclaredMethod("compare", shortArrayType, shortArrayType);
        compareMethod.setAccessible(true);
        java.lang.Object[] compareMethodArguments = new java.lang.Object[2];
        compareMethodArguments[0] = ((Object) shortArray);
        compareMethodArguments[1] = ((Object) shortArray1);
        int actual = ((int) compareMethod.invoke(lexicographicalComparator, compareMethodArguments));
        
        assertEquals(9, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCompare7() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(Shorts.class);
            mockedStatic.when(() -> {
                Shorts.compare(anyShort(), anyShort());
            }).thenReturn(0);
            Class lexicographicalComparatorClazz = Class.forName("com.google.common.primitives.Shorts$LexicographicalComparator");
            Object lexicographicalComparator = getEnumConstantByName(lexicographicalComparatorClazz, "INSTANCE");
            short[] shortArray = new short[11];
            short[] shortArray1 = new short[1];
            
            Class shortArrayType = Class.forName("[S");
            Method compareMethod = lexicographicalComparatorClazz.getDeclaredMethod("compare", shortArrayType, shortArrayType);
            compareMethod.setAccessible(true);
            java.lang.Object[] compareMethodArguments = new java.lang.Object[2];
            compareMethodArguments[0] = ((Object) shortArray);
            compareMethodArguments[1] = ((Object) shortArray1);
            int actual = ((int) compareMethod.invoke(lexicographicalComparator, compareMethodArguments));
            
            assertEquals(10, actual);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testValueOf1() throws Throwable  {
        String string = new String();
        
        Class lexicographicalComparatorClazz = Class.forName("com.google.common.primitives.Shorts$LexicographicalComparator");
        Class stringType = Class.forName("java.lang.String");
        Method valueOfMethod = lexicographicalComparatorClazz.getDeclaredMethod("valueOf", stringType);
        valueOfMethod.setAccessible(true);
        java.lang.Object[] valueOfMethodArguments = new java.lang.Object[1];
        valueOfMethodArguments[0] = string;
        try {
            valueOfMethod.invoke(null, valueOfMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testValueOf2() throws Throwable  {
        Class lexicographicalComparatorClazz = Class.forName("com.google.common.primitives.Shorts$LexicographicalComparator");
        Class stringType = Class.forName("java.lang.String");
        Method valueOfMethod = lexicographicalComparatorClazz.getDeclaredMethod("valueOf", stringType);
        valueOfMethod.setAccessible(true);
        java.lang.Object[] valueOfMethodArguments = new java.lang.Object[1];
        valueOfMethodArguments[0] = null;
        try {
            valueOfMethod.invoke(null, valueOfMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testValueOf3() throws Throwable  {
        String string = new String("");
        
        Class lexicographicalComparatorClazz = Class.forName("com.google.common.primitives.Shorts$LexicographicalComparator");
        Class stringType = Class.forName("java.lang.String");
        Method valueOfMethod = lexicographicalComparatorClazz.getDeclaredMethod("valueOf", stringType);
        valueOfMethod.setAccessible(true);
        java.lang.Object[] valueOfMethodArguments = new java.lang.Object[1];
        valueOfMethodArguments[0] = string;
        try {
            valueOfMethod.invoke(null, valueOfMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testValues1() throws Throwable  {
        Class lexicographicalComparatorClazz = Class.forName("com.google.common.primitives.Shorts$LexicographicalComparator");
        Method valuesMethod = lexicographicalComparatorClazz.getDeclaredMethod("values");
        valuesMethod.setAccessible(true);
        java.lang.Object[] valuesMethodArguments = new java.lang.Object[0];
        Object actual = valuesMethod.invoke(null, valuesMethodArguments);
        
        java.lang.Object[] expected = createArray("com.google.common.primitives.Shorts$LexicographicalComparator", 1);
        Object lexicographicalComparator = getEnumConstantByName(lexicographicalComparatorClazz, "INSTANCE");
        expected[0] = lexicographicalComparator;
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testValues2() throws Throwable  {
        Class lexicographicalComparatorClazz = Class.forName("com.google.common.primitives.Shorts$LexicographicalComparator");
        Method valuesMethod = lexicographicalComparatorClazz.getDeclaredMethod("values");
        valuesMethod.setAccessible(true);
        java.lang.Object[] valuesMethodArguments = new java.lang.Object[0];
        Object actual = valuesMethod.invoke(null, valuesMethodArguments);
        
        java.lang.Object[] expected = createArray("com.google.common.primitives.Shorts$LexicographicalComparator", 1);
        Object lexicographicalComparator = getEnumConstantByName(lexicographicalComparatorClazz, "INSTANCE");
        expected[0] = lexicographicalComparator;
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testLexicographicalComparator3() throws Throwable  {
        String string = new String("");
        Class lexicographicalComparatorClazz = Class.forName("com.google.common.primitives.Shorts$LexicographicalComparator");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Constructor lexicographicalComparatorConstructor = lexicographicalComparatorClazz.getDeclaredConstructor(stringType, intType);
        lexicographicalComparatorConstructor.setAccessible(true);
        java.lang.Object[] lexicographicalComparatorConstructorArguments = new java.lang.Object[2];
        lexicographicalComparatorConstructorArguments[0] = string;
        lexicographicalComparatorConstructorArguments[1] = 0;
        Object actual = lexicographicalComparatorConstructor.newInstance(lexicographicalComparatorConstructorArguments);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testToString5() throws Throwable  {
        Object shortConverter = createInstance("com.google.common.primitives.Shorts$ShortConverter");
        
        Class shortConverterClazz = Class.forName("com.google.common.primitives.Shorts$ShortConverter");
        Method toStringMethod = shortConverterClazz.getDeclaredMethod("toString");
        toStringMethod.setAccessible(true);
        java.lang.Object[] toStringMethodArguments = new java.lang.Object[0];
        String actual = ((String) toStringMethod.invoke(shortConverter, toStringMethodArguments));
        
        String expected = new String("Shorts.stringConverter()");
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDoForward1() throws Throwable  {
        Object shortConverter = createInstance("com.google.common.primitives.Shorts$ShortConverter");
        String string = new String("");
        
        Class shortConverterClazz = Class.forName("com.google.common.primitives.Shorts$ShortConverter");
        Class stringType = Class.forName("java.lang.String");
        Method doForwardMethod = shortConverterClazz.getDeclaredMethod("doForward", stringType);
        doForwardMethod.setAccessible(true);
        java.lang.Object[] doForwardMethodArguments = new java.lang.Object[1];
        doForwardMethodArguments[0] = string;
        try {
            doForwardMethod.invoke(shortConverter, doForwardMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDoForward2() throws Throwable  {
        Object shortConverter = createInstance("com.google.common.primitives.Shorts$ShortConverter");
        String string = new String("+0x-\u0000\u0000");
        
        Class shortConverterClazz = Class.forName("com.google.common.primitives.Shorts$ShortConverter");
        Class stringType = Class.forName("java.lang.String");
        Method doForwardMethod = shortConverterClazz.getDeclaredMethod("doForward", stringType);
        doForwardMethod.setAccessible(true);
        java.lang.Object[] doForwardMethodArguments = new java.lang.Object[1];
        doForwardMethodArguments[0] = string;
        try {
            doForwardMethod.invoke(shortConverter, doForwardMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDoForward3() throws Throwable  {
        Object shortConverter = createInstance("com.google.common.primitives.Shorts$ShortConverter");
        String string = new String("0x");
        
        Class shortConverterClazz = Class.forName("com.google.common.primitives.Shorts$ShortConverter");
        Class stringType = Class.forName("java.lang.String");
        Method doForwardMethod = shortConverterClazz.getDeclaredMethod("doForward", stringType);
        doForwardMethod.setAccessible(true);
        java.lang.Object[] doForwardMethodArguments = new java.lang.Object[1];
        doForwardMethodArguments[0] = string;
        try {
            doForwardMethod.invoke(shortConverter, doForwardMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDoForward4() throws Throwable  {
        Object shortConverter = createInstance("com.google.common.primitives.Shorts$ShortConverter");
        String string = new String("+0X-\u0000\u0000");
        
        Class shortConverterClazz = Class.forName("com.google.common.primitives.Shorts$ShortConverter");
        Class stringType = Class.forName("java.lang.String");
        Method doForwardMethod = shortConverterClazz.getDeclaredMethod("doForward", stringType);
        doForwardMethod.setAccessible(true);
        java.lang.Object[] doForwardMethodArguments = new java.lang.Object[1];
        doForwardMethodArguments[0] = string;
        try {
            doForwardMethod.invoke(shortConverter, doForwardMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDoBackward1() throws Throwable  {
        Object shortConverter = createInstance("com.google.common.primitives.Shorts$ShortConverter");
        
        Class shortConverterClazz = Class.forName("com.google.common.primitives.Shorts$ShortConverter");
        Class shortType = Class.forName("java.lang.Short");
        Method doBackwardMethod = shortConverterClazz.getDeclaredMethod("doBackward", shortType);
        doBackwardMethod.setAccessible(true);
        java.lang.Object[] doBackwardMethodArguments = new java.lang.Object[1];
        doBackwardMethodArguments[0] = null;
        try {
            doBackwardMethod.invoke(shortConverter, doBackwardMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDoBackward2() throws Throwable  {
        Object shortConverter = createInstance("com.google.common.primitives.Shorts$ShortConverter");
        Short short1 = (short) 4;
        
        Class shortConverterClazz = Class.forName("com.google.common.primitives.Shorts$ShortConverter");
        Class short1Type = Class.forName("java.lang.Short");
        Method doBackwardMethod = shortConverterClazz.getDeclaredMethod("doBackward", short1Type);
        doBackwardMethod.setAccessible(true);
        java.lang.Object[] doBackwardMethodArguments = new java.lang.Object[1];
        doBackwardMethodArguments[0] = short1;
        String actual = ((String) doBackwardMethod.invoke(shortConverter, doBackwardMethodArguments));
        
        String expected = new String("4");
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReadResolve1() throws Throwable  {
        Object shortConverter = createInstance("com.google.common.primitives.Shorts$ShortConverter");
        setField(shortConverter, "handleNullAutomatically", false);
        
        Class shortConverterClazz = Class.forName("com.google.common.primitives.Shorts$ShortConverter");
        Method readResolveMethod = shortConverterClazz.getDeclaredMethod("readResolve");
        readResolveMethod.setAccessible(true);
        java.lang.Object[] readResolveMethodArguments = new java.lang.Object[0];
        Object actual = readResolveMethod.invoke(shortConverter, readResolveMethodArguments);
        
        Object expected = createInstance("com.google.common.primitives.Shorts$ShortConverter");
        setField(expected, "handleNullAutomatically", true);
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testShortConverter1() throws Throwable  {
        Class shortConverterClazz = Class.forName("com.google.common.primitives.Shorts$ShortConverter");
        Constructor shortConverterConstructor = shortConverterClazz.getDeclaredConstructor();
        shortConverterConstructor.setAccessible(true);
        java.lang.Object[] shortConverterConstructorArguments = new java.lang.Object[0];
        Object actual = shortConverterConstructor.newInstance(shortConverterConstructorArguments);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testShortConverter2() throws Throwable  {
        Class shortConverterClazz = Class.forName("com.google.common.primitives.Shorts$ShortConverter");
        Constructor shortConverterConstructor = shortConverterClazz.getDeclaredConstructor();
        shortConverterConstructor.setAccessible(true);
        java.lang.Object[] shortConverterConstructorArguments = new java.lang.Object[0];
        Object actual = shortConverterConstructor.newInstance(shortConverterConstructorArguments);
    }
    ///endregion
    
    private static Object[] createArray(String className, int length, Object... values) throws ClassNotFoundException {
        Object array = java.lang.reflect.Array.newInstance(Class.forName(className), length);
    
        for (int i = 0; i < values.length; i++) {
            java.lang.reflect.Array.set(array, i, values[i]);
        }
        
        return (Object[]) array;
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
