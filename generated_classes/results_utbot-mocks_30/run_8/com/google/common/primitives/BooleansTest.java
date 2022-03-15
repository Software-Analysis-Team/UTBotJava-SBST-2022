package com.google.common.primitives;

import org.junit.Test;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import java.lang.reflect.Constructor;
import com.google.common.primitives.Booleans;
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

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mockStatic;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.anyBoolean;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.junit.Assert.assertNull;

public class BooleansTest {
    ///region
    
    @Test(timeout = 10000)
    public void testHashCode1() throws Throwable  {
        int actual = Booleans.hashCode(false);
        
        assertEquals(1237, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testHashCode2() throws Throwable  {
        int actual = Booleans.hashCode(true);
        
        assertEquals(1231, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testHashCode3() throws Throwable  {
        int actual = Booleans.hashCode(false);
        
        assertEquals(1237, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIndexOf1() throws Throwable  {
        boolean[] booleanArray = new boolean[0];
        
        Class booleansClazz = Class.forName("com.google.common.primitives.Booleans");
        Class booleanArrayType = Class.forName("[Z");
        Class booleanType = boolean.class;
        Class intType = int.class;
        Method indexOfMethod = booleansClazz.getDeclaredMethod("indexOf", booleanArrayType, booleanType, intType, intType);
        indexOfMethod.setAccessible(true);
        java.lang.Object[] indexOfMethodArguments = new java.lang.Object[4];
        indexOfMethodArguments[0] = ((Object) booleanArray);
        indexOfMethodArguments[1] = false;
        indexOfMethodArguments[2] = 0;
        indexOfMethodArguments[3] = 0;
        int actual = ((int) indexOfMethod.invoke(null, indexOfMethodArguments));
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIndexOf2() throws Throwable  {
        Class booleansClazz = Class.forName("com.google.common.primitives.Booleans");
        Class booleanArrayType = Class.forName("[Z");
        Class booleanType = boolean.class;
        Class intType = int.class;
        Method indexOfMethod = booleansClazz.getDeclaredMethod("indexOf", booleanArrayType, booleanType, intType, intType);
        indexOfMethod.setAccessible(true);
        java.lang.Object[] indexOfMethodArguments = new java.lang.Object[4];
        indexOfMethodArguments[0] = null;
        indexOfMethodArguments[1] = false;
        indexOfMethodArguments[2] = 0;
        indexOfMethodArguments[3] = -2147483647;
        int actual = ((int) indexOfMethod.invoke(null, indexOfMethodArguments));
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testIndexOf3() throws Throwable  {
        boolean[] booleanArray = new boolean[9];
        
        Class booleansClazz = Class.forName("com.google.common.primitives.Booleans");
        Class booleanArrayType = Class.forName("[Z");
        Class booleanType = boolean.class;
        Class intType = int.class;
        Method indexOfMethod = booleansClazz.getDeclaredMethod("indexOf", booleanArrayType, booleanType, intType, intType);
        indexOfMethod.setAccessible(true);
        java.lang.Object[] indexOfMethodArguments = new java.lang.Object[4];
        indexOfMethodArguments[0] = ((Object) booleanArray);
        indexOfMethodArguments[1] = false;
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
    public void testIndexOf4() throws Throwable  {
        boolean[] booleanArray = new boolean[9];
        
        Class booleansClazz = Class.forName("com.google.common.primitives.Booleans");
        Class booleanArrayType = Class.forName("[Z");
        Class booleanType = boolean.class;
        Class intType = int.class;
        Method indexOfMethod = booleansClazz.getDeclaredMethod("indexOf", booleanArrayType, booleanType, intType, intType);
        indexOfMethod.setAccessible(true);
        java.lang.Object[] indexOfMethodArguments = new java.lang.Object[4];
        indexOfMethodArguments[0] = ((Object) booleanArray);
        indexOfMethodArguments[1] = false;
        indexOfMethodArguments[2] = 0;
        indexOfMethodArguments[3] = 1;
        int actual = ((int) indexOfMethod.invoke(null, indexOfMethodArguments));
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testIndexOf5() throws Throwable  {
        Class booleansClazz = Class.forName("com.google.common.primitives.Booleans");
        Class booleanArrayType = Class.forName("[Z");
        Class booleanType = boolean.class;
        Class intType = int.class;
        Method indexOfMethod = booleansClazz.getDeclaredMethod("indexOf", booleanArrayType, booleanType, intType, intType);
        indexOfMethod.setAccessible(true);
        java.lang.Object[] indexOfMethodArguments = new java.lang.Object[4];
        indexOfMethodArguments[0] = null;
        indexOfMethodArguments[1] = false;
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
    public void testIndexOf6() throws Throwable  {
        boolean[] booleanArray = new boolean[9];
        
        Class booleansClazz = Class.forName("com.google.common.primitives.Booleans");
        Class booleanArrayType = Class.forName("[Z");
        Class booleanType = boolean.class;
        Class intType = int.class;
        Method indexOfMethod = booleansClazz.getDeclaredMethod("indexOf", booleanArrayType, booleanType, intType, intType);
        indexOfMethod.setAccessible(true);
        java.lang.Object[] indexOfMethodArguments = new java.lang.Object[4];
        indexOfMethodArguments[0] = ((Object) booleanArray);
        indexOfMethodArguments[1] = false;
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
    public void testIndexOf7() throws Throwable  {
        boolean[] booleanArray = new boolean[9];
        booleanArray[0] = true;
        
        Class booleansClazz = Class.forName("com.google.common.primitives.Booleans");
        Class booleanArrayType = Class.forName("[Z");
        Class booleanType = boolean.class;
        Class intType = int.class;
        Method indexOfMethod = booleansClazz.getDeclaredMethod("indexOf", booleanArrayType, booleanType, intType, intType);
        indexOfMethod.setAccessible(true);
        java.lang.Object[] indexOfMethodArguments = new java.lang.Object[4];
        indexOfMethodArguments[0] = ((Object) booleanArray);
        indexOfMethodArguments[1] = false;
        indexOfMethodArguments[2] = 0;
        indexOfMethodArguments[3] = 1;
        int actual = ((int) indexOfMethod.invoke(null, indexOfMethodArguments));
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIndexOf8() throws Throwable  {
        boolean[] booleanArray = new boolean[0];
        boolean[] booleanArray1 = new boolean[0];
        
        int actual = Booleans.indexOf(booleanArray, booleanArray1);
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testIndexOf9() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(com.google.common.base.Preconditions.class);
            mockedStatic.when(() -> {
                com.google.common.base.Preconditions.checkNotNull(any(), any());
            }).thenReturn(null, null);
            
            Booleans.indexOf(((boolean[]) null), ((boolean[]) null));
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIndexOf10() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(com.google.common.base.Preconditions.class);
            mockedStatic.when(() -> {
                com.google.common.base.Preconditions.checkNotNull(any(), any());
            }).thenReturn(null, null);
            boolean[] booleanArray = new boolean[17];
            boolean[] booleanArray1 = new boolean[0];
            
            int actual = Booleans.indexOf(booleanArray, booleanArray1);
            
            assertEquals(0, actual);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIndexOf11() throws Throwable  {
        boolean[] booleanArray = new boolean[0];
        
        int actual = Booleans.indexOf(booleanArray, false);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testIndexOf12() throws Throwable  {
        Booleans.indexOf(((boolean[]) null), false);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIndexOf13() throws Throwable  {
        boolean[] booleanArray = new boolean[9];
        
        int actual = Booleans.indexOf(booleanArray, false);
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIndexOf14() throws Throwable  {
        boolean[] booleanArray = new boolean[1];
        booleanArray[0] = true;
        
        int actual = Booleans.indexOf(booleanArray, false);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testLastIndexOf1() throws Throwable  {
        boolean[] booleanArray = new boolean[0];
        
        Class booleansClazz = Class.forName("com.google.common.primitives.Booleans");
        Class booleanArrayType = Class.forName("[Z");
        Class booleanType = boolean.class;
        Class intType = int.class;
        Method lastIndexOfMethod = booleansClazz.getDeclaredMethod("lastIndexOf", booleanArrayType, booleanType, intType, intType);
        lastIndexOfMethod.setAccessible(true);
        java.lang.Object[] lastIndexOfMethodArguments = new java.lang.Object[4];
        lastIndexOfMethodArguments[0] = ((Object) booleanArray);
        lastIndexOfMethodArguments[1] = false;
        lastIndexOfMethodArguments[2] = 0;
        lastIndexOfMethodArguments[3] = 0;
        int actual = ((int) lastIndexOfMethod.invoke(null, lastIndexOfMethodArguments));
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testLastIndexOf2() throws Throwable  {
        Class booleansClazz = Class.forName("com.google.common.primitives.Booleans");
        Class booleanArrayType = Class.forName("[Z");
        Class booleanType = boolean.class;
        Class intType = int.class;
        Method lastIndexOfMethod = booleansClazz.getDeclaredMethod("lastIndexOf", booleanArrayType, booleanType, intType, intType);
        lastIndexOfMethod.setAccessible(true);
        java.lang.Object[] lastIndexOfMethodArguments = new java.lang.Object[4];
        lastIndexOfMethodArguments[0] = null;
        lastIndexOfMethodArguments[1] = false;
        lastIndexOfMethodArguments[2] = 1;
        lastIndexOfMethodArguments[3] = -2147483647;
        int actual = ((int) lastIndexOfMethod.invoke(null, lastIndexOfMethodArguments));
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testLastIndexOf3() throws Throwable  {
        boolean[] booleanArray = new boolean[9];
        
        Class booleansClazz = Class.forName("com.google.common.primitives.Booleans");
        Class booleanArrayType = Class.forName("[Z");
        Class booleanType = boolean.class;
        Class intType = int.class;
        Method lastIndexOfMethod = booleansClazz.getDeclaredMethod("lastIndexOf", booleanArrayType, booleanType, intType, intType);
        lastIndexOfMethod.setAccessible(true);
        java.lang.Object[] lastIndexOfMethodArguments = new java.lang.Object[4];
        lastIndexOfMethodArguments[0] = ((Object) booleanArray);
        lastIndexOfMethodArguments[1] = false;
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
    public void testLastIndexOf4() throws Throwable  {
        boolean[] booleanArray = new boolean[9];
        
        Class booleansClazz = Class.forName("com.google.common.primitives.Booleans");
        Class booleanArrayType = Class.forName("[Z");
        Class booleanType = boolean.class;
        Class intType = int.class;
        Method lastIndexOfMethod = booleansClazz.getDeclaredMethod("lastIndexOf", booleanArrayType, booleanType, intType, intType);
        lastIndexOfMethod.setAccessible(true);
        java.lang.Object[] lastIndexOfMethodArguments = new java.lang.Object[4];
        lastIndexOfMethodArguments[0] = ((Object) booleanArray);
        lastIndexOfMethodArguments[1] = false;
        lastIndexOfMethodArguments[2] = -2147483647;
        lastIndexOfMethodArguments[3] = 1;
        int actual = ((int) lastIndexOfMethod.invoke(null, lastIndexOfMethodArguments));
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testLastIndexOf5() throws Throwable  {
        Class booleansClazz = Class.forName("com.google.common.primitives.Booleans");
        Class booleanArrayType = Class.forName("[Z");
        Class booleanType = boolean.class;
        Class intType = int.class;
        Method lastIndexOfMethod = booleansClazz.getDeclaredMethod("lastIndexOf", booleanArrayType, booleanType, intType, intType);
        lastIndexOfMethod.setAccessible(true);
        java.lang.Object[] lastIndexOfMethodArguments = new java.lang.Object[4];
        lastIndexOfMethodArguments[0] = null;
        lastIndexOfMethodArguments[1] = false;
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
    public void testLastIndexOf6() throws Throwable  {
        boolean[] booleanArray = new boolean[9];
        
        Class booleansClazz = Class.forName("com.google.common.primitives.Booleans");
        Class booleanArrayType = Class.forName("[Z");
        Class booleanType = boolean.class;
        Class intType = int.class;
        Method lastIndexOfMethod = booleansClazz.getDeclaredMethod("lastIndexOf", booleanArrayType, booleanType, intType, intType);
        lastIndexOfMethod.setAccessible(true);
        java.lang.Object[] lastIndexOfMethodArguments = new java.lang.Object[4];
        lastIndexOfMethodArguments[0] = ((Object) booleanArray);
        lastIndexOfMethodArguments[1] = false;
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
    public void testLastIndexOf7() throws Throwable  {
        boolean[] booleanArray = new boolean[40];
        booleanArray[31] = true;
        
        Class booleansClazz = Class.forName("com.google.common.primitives.Booleans");
        Class booleanArrayType = Class.forName("[Z");
        Class booleanType = boolean.class;
        Class intType = int.class;
        Method lastIndexOfMethod = booleansClazz.getDeclaredMethod("lastIndexOf", booleanArrayType, booleanType, intType, intType);
        lastIndexOfMethod.setAccessible(true);
        java.lang.Object[] lastIndexOfMethodArguments = new java.lang.Object[4];
        lastIndexOfMethodArguments[0] = ((Object) booleanArray);
        lastIndexOfMethodArguments[1] = false;
        lastIndexOfMethodArguments[2] = 31;
        lastIndexOfMethodArguments[3] = 32;
        int actual = ((int) lastIndexOfMethod.invoke(null, lastIndexOfMethodArguments));
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testLastIndexOf8() throws Throwable  {
        boolean[] booleanArray = new boolean[0];
        
        int actual = Booleans.lastIndexOf(booleanArray, false);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testLastIndexOf9() throws Throwable  {
        Booleans.lastIndexOf(null, false);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testLastIndexOf10() throws Throwable  {
        boolean[] booleanArray = new boolean[2];
        
        int actual = Booleans.lastIndexOf(booleanArray, false);
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testLastIndexOf11() throws Throwable  {
        boolean[] booleanArray = new boolean[0];
        
        int actual = Booleans.lastIndexOf(booleanArray, false);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testLastIndexOf12() throws Throwable  {
        boolean[] booleanArray = new boolean[1];
        booleanArray[0] = true;
        
        int actual = Booleans.lastIndexOf(booleanArray, false);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testConcat1() throws Throwable  {
        boolean[][] booleanArray = new boolean[0][];
        
        boolean[] actual = Booleans.concat(booleanArray);
        
        boolean[] expected = new boolean[0];
        assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testConcat2() throws Throwable  {
        Booleans.concat(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testConcat3() throws Throwable  {
        boolean[][] booleanArray = new boolean[9][];
        booleanArray[0] = ((boolean[]) null);
        boolean[] booleanArray1 = new boolean[0];
        booleanArray[1] = booleanArray1;
        booleanArray[2] = booleanArray1;
        booleanArray[3] = booleanArray1;
        booleanArray[4] = booleanArray1;
        booleanArray[5] = booleanArray1;
        booleanArray[6] = booleanArray1;
        booleanArray[7] = booleanArray1;
        booleanArray[8] = booleanArray1;
        
        Booleans.concat(booleanArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testConcat4() throws Throwable  {
        boolean[][] booleanArray = new boolean[0][];
        
        boolean[] actual = Booleans.concat(booleanArray);
        
        boolean[] expected = new boolean[0];
        assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testConcat5() throws Throwable  {
        boolean[][] booleanArray = new boolean[1][];
        boolean[] booleanArray1 = new boolean[0];
        booleanArray[0] = booleanArray1;
        
        boolean[] actual = Booleans.concat(booleanArray);
        
        boolean[] expected = new boolean[0];
        assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testContains1() throws Throwable  {
        boolean[] booleanArray = new boolean[0];
        
        boolean actual = Booleans.contains(booleanArray, false);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testContains2() throws Throwable  {
        Booleans.contains(null, false);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testContains3() throws Throwable  {
        boolean[] booleanArray = new boolean[0];
        
        boolean actual = Booleans.contains(booleanArray, false);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testContains4() throws Throwable  {
        boolean[] booleanArray = new boolean[9];
        
        boolean actual = Booleans.contains(booleanArray, false);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testContains5() throws Throwable  {
        boolean[] booleanArray = new boolean[1];
        booleanArray[0] = true;
        
        boolean actual = Booleans.contains(booleanArray, false);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testJoin1() throws Throwable  {
        String string = new String();
        boolean[] booleanArray = new boolean[0];
        
        String actual = Booleans.join(string, booleanArray);
        
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
            boolean[] booleanArray = new boolean[0];
            
            String actual = Booleans.join(string, booleanArray);
            
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
            String string = new String("");
            
            Booleans.join(string, null);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCompare1() throws Throwable  {
        int actual = Booleans.compare(false, false);
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCompare2() throws Throwable  {
        int actual = Booleans.compare(false, false);
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCompare3() throws Throwable  {
        int actual = Booleans.compare(false, true);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCompare4() throws Throwable  {
        int actual = Booleans.compare(true, false);
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testToArray1() throws Throwable  {
        ArrayList arrayList = new ArrayList();
        
        boolean[] actual = Booleans.toArray(arrayList);
        
        boolean[] expected = new boolean[0];
        assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testToArray2() throws Throwable  {
        Booleans.toArray(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testAsList1() throws Throwable  {
        boolean[] booleanArray = new boolean[0];
        
        List actual = Booleans.asList(booleanArray);
        
        Object expected = createInstance("java.util.Collections$EmptyList");
        setField(expected, "modCount", 0);
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testAsList2() throws Throwable  {
        Booleans.asList(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testAsList3() throws Throwable  {
        boolean[] booleanArray = new boolean[1];
        
        List actual = Booleans.asList(booleanArray);
        
        Object expected = createInstance("com.google.common.primitives.Booleans$BooleanArrayAsList");
        setField(expected, "modCount", 0);
        setField(expected, "end", 1);
        setField(expected, "start", 0);
        setField(expected, "array", booleanArray);
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testAsList4() throws Throwable  {
        boolean[] booleanArray = new boolean[0];
        
        List actual = Booleans.asList(booleanArray);
        
        ArrayList expected = new ArrayList();
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testEnsureCapacity1() throws Throwable  {
        boolean[] booleanArray = new boolean[0];
        
        boolean[] actual = Booleans.ensureCapacity(booleanArray, 0, 0);
        
        assertArrayEquals(booleanArray, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testEnsureCapacity2() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(com.google.common.base.Preconditions.class);
            
            Booleans.ensureCapacity(null, 0, 0);
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
            boolean[] booleanArray = new boolean[32];
            
            boolean[] actual = Booleans.ensureCapacity(booleanArray, 1, Integer.MIN_VALUE);
            
            assertArrayEquals(booleanArray, actual);
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
            
            Booleans.ensureCapacity(null, Integer.MIN_VALUE, Integer.MIN_VALUE);
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
            boolean[] booleanArray = new boolean[1];
            
            Booleans.ensureCapacity(booleanArray, 1048576, Integer.MIN_VALUE);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReverse1() throws Throwable  {
        boolean[] booleanArray = new boolean[0];
        
        Booleans.reverse(booleanArray, 0, 0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReverse2() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(com.google.common.base.Preconditions.class);
            mockedStatic.when(() -> {
                com.google.common.base.Preconditions.checkNotNull(any());
            }).thenReturn(null);
            
            Booleans.reverse(null, 0, 0);
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
            boolean[] booleanArray = new boolean[10];
            
            Booleans.reverse(booleanArray, 0, 0);
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
            boolean[] booleanArray = new boolean[40];
            
            Booleans.reverse(booleanArray, 40, Integer.MIN_VALUE);
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
            boolean[] booleanArray = new boolean[39];
            
            Booleans.reverse(booleanArray, 0, 1073741863);
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
            boolean[] booleanArray = new boolean[10];
            
            Booleans.reverse(booleanArray, Integer.MIN_VALUE, Integer.MIN_VALUE);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReverse7() throws Throwable  {
        boolean[] booleanArray = new boolean[0];
        
        Booleans.reverse(booleanArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReverse8() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(com.google.common.base.Preconditions.class);
            mockedStatic.when(() -> {
                com.google.common.base.Preconditions.checkNotNull(any());
            }).thenReturn(null);
            
            Booleans.reverse(null);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReverse9() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(com.google.common.base.Preconditions.class);
            mockedStatic.when(() -> {
                com.google.common.base.Preconditions.checkNotNull(any());
            }).thenReturn(null, null);
            boolean[] booleanArray = new boolean[0];
            
            Booleans.reverse(booleanArray);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testFalseFirst1() throws Throwable  {
        Comparator actual = Booleans.falseFirst();
        
        Class booleanComparatorClazz = Class.forName("com.google.common.primitives.Booleans$BooleanComparator");
        Object expected = getEnumConstantByName(booleanComparatorClazz, "FALSE_FIRST");
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testFalseFirst2() throws Throwable  {
        Comparator actual = Booleans.falseFirst();
        
        Class booleanComparatorClazz = Class.forName("com.google.common.primitives.Booleans$BooleanComparator");
        Object expected = getEnumConstantByName(booleanComparatorClazz, "FALSE_FIRST");
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testTrueFirst1() throws Throwable  {
        Comparator actual = Booleans.trueFirst();
        
        Class booleanComparatorClazz = Class.forName("com.google.common.primitives.Booleans$BooleanComparator");
        Object expected = getEnumConstantByName(booleanComparatorClazz, "TRUE_FIRST");
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testTrueFirst2() throws Throwable  {
        Comparator actual = Booleans.trueFirst();
        
        Class booleanComparatorClazz = Class.forName("com.google.common.primitives.Booleans$BooleanComparator");
        Object expected = getEnumConstantByName(booleanComparatorClazz, "TRUE_FIRST");
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testLexicographicalComparator1() throws Throwable  {
        Comparator actual = Booleans.lexicographicalComparator();
        
        Class lexicographicalComparatorClazz = Class.forName("com.google.common.primitives.Booleans$LexicographicalComparator");
        Object expected = getEnumConstantByName(lexicographicalComparatorClazz, "INSTANCE");
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testLexicographicalComparator2() throws Throwable  {
        Comparator actual = Booleans.lexicographicalComparator();
        
        Class lexicographicalComparatorClazz = Class.forName("com.google.common.primitives.Booleans$LexicographicalComparator");
        Object expected = getEnumConstantByName(lexicographicalComparatorClazz, "INSTANCE");
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCountTrue1() throws Throwable  {
        boolean[] booleanArray = new boolean[0];
        
        int actual = Booleans.countTrue(booleanArray);
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCountTrue2() throws Throwable  {
        Booleans.countTrue(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCountTrue3() throws Throwable  {
        boolean[] booleanArray = new boolean[0];
        
        int actual = Booleans.countTrue(booleanArray);
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCountTrue4() throws Throwable  {
        boolean[] booleanArray = new boolean[1];
        booleanArray[0] = true;
        
        int actual = Booleans.countTrue(booleanArray);
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCountTrue5() throws Throwable  {
        boolean[] booleanArray = new boolean[1];
        
        int actual = Booleans.countTrue(booleanArray);
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testBooleans1() throws Throwable  {
        Class booleansClazz = Class.forName("com.google.common.primitives.Booleans");
        Constructor booleansConstructor = booleansClazz.getDeclaredConstructor();
        booleansConstructor.setAccessible(true);
        java.lang.Object[] booleansConstructorArguments = new java.lang.Object[0];
        Booleans actual = ((Booleans) booleansConstructor.newInstance(booleansConstructorArguments));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testBooleans2() throws Throwable  {
        Class booleansClazz = Class.forName("com.google.common.primitives.Booleans");
        Constructor booleansConstructor = booleansClazz.getDeclaredConstructor();
        booleansConstructor.setAccessible(true);
        java.lang.Object[] booleansConstructorArguments = new java.lang.Object[0];
        Booleans actual = ((Booleans) booleansConstructor.newInstance(booleansConstructorArguments));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testContains6() throws Throwable  {
        Object booleanArrayAsList = createInstance("com.google.common.primitives.Booleans$BooleanArrayAsList");
        Object object = new Object();
        
        Class booleanArrayAsListClazz = Class.forName("com.google.common.primitives.Booleans$BooleanArrayAsList");
        Class objectType = Class.forName("java.lang.Object");
        Method containsMethod = booleanArrayAsListClazz.getDeclaredMethod("contains", objectType);
        containsMethod.setAccessible(true);
        java.lang.Object[] containsMethodArguments = new java.lang.Object[1];
        containsMethodArguments[0] = object;
        boolean actual = ((boolean) containsMethod.invoke(booleanArrayAsList, containsMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testContains7() throws Throwable  {
        Object booleanArrayAsList = createInstance("com.google.common.primitives.Booleans$BooleanArrayAsList");
        
        Class booleanArrayAsListClazz = Class.forName("com.google.common.primitives.Booleans$BooleanArrayAsList");
        Class objectType = Class.forName("java.lang.Object");
        Method containsMethod = booleanArrayAsListClazz.getDeclaredMethod("contains", objectType);
        containsMethod.setAccessible(true);
        java.lang.Object[] containsMethodArguments = new java.lang.Object[1];
        containsMethodArguments[0] = null;
        boolean actual = ((boolean) containsMethod.invoke(booleanArrayAsList, containsMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testContains8() throws Throwable  {
        Object booleanArrayAsList = createInstance("com.google.common.primitives.Booleans$BooleanArrayAsList");
        setField(booleanArrayAsList, "end", 0);
        setField(booleanArrayAsList, "start", 0);
        boolean[] booleanArray = new boolean[9];
        setField(booleanArrayAsList, "array", booleanArray);
        Boolean boolean1 = false;
        
        Class booleanArrayAsListClazz = Class.forName("com.google.common.primitives.Booleans$BooleanArrayAsList");
        Class boolean1Type = Class.forName("java.lang.Object");
        Method containsMethod = booleanArrayAsListClazz.getDeclaredMethod("contains", boolean1Type);
        containsMethod.setAccessible(true);
        java.lang.Object[] containsMethodArguments = new java.lang.Object[1];
        containsMethodArguments[0] = boolean1;
        boolean actual = ((boolean) containsMethod.invoke(booleanArrayAsList, containsMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testContains9() throws Throwable  {
        Object booleanArrayAsList = createInstance("com.google.common.primitives.Booleans$BooleanArrayAsList");
        setField(booleanArrayAsList, "end", 0);
        setField(booleanArrayAsList, "start", 0);
        boolean[] booleanArray = new boolean[9];
        setField(booleanArrayAsList, "array", booleanArray);
        Boolean boolean1 = false;
        
        Class booleanArrayAsListClazz = Class.forName("com.google.common.primitives.Booleans$BooleanArrayAsList");
        Class boolean1Type = Class.forName("java.lang.Object");
        Method containsMethod = booleanArrayAsListClazz.getDeclaredMethod("contains", boolean1Type);
        containsMethod.setAccessible(true);
        java.lang.Object[] containsMethodArguments = new java.lang.Object[1];
        containsMethodArguments[0] = boolean1;
        boolean actual = ((boolean) containsMethod.invoke(booleanArrayAsList, containsMethodArguments));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIsEmpty1() throws Throwable  {
        Object booleanArrayAsList = createInstance("com.google.common.primitives.Booleans$BooleanArrayAsList");
        
        Class booleanArrayAsListClazz = Class.forName("com.google.common.primitives.Booleans$BooleanArrayAsList");
        Method isEmptyMethod = booleanArrayAsListClazz.getDeclaredMethod("isEmpty");
        isEmptyMethod.setAccessible(true);
        java.lang.Object[] isEmptyMethodArguments = new java.lang.Object[0];
        boolean actual = ((boolean) isEmptyMethod.invoke(booleanArrayAsList, isEmptyMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIsEmpty2() throws Throwable  {
        Object booleanArrayAsList = createInstance("com.google.common.primitives.Booleans$BooleanArrayAsList");
        
        Class booleanArrayAsListClazz = Class.forName("com.google.common.primitives.Booleans$BooleanArrayAsList");
        Method isEmptyMethod = booleanArrayAsListClazz.getDeclaredMethod("isEmpty");
        isEmptyMethod.setAccessible(true);
        java.lang.Object[] isEmptyMethodArguments = new java.lang.Object[0];
        boolean actual = ((boolean) isEmptyMethod.invoke(booleanArrayAsList, isEmptyMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testEquals1() throws Throwable  {
        Object booleanArrayAsList = createInstance("com.google.common.primitives.Booleans$BooleanArrayAsList");
        Object object = new Object();
        
        Class booleanArrayAsListClazz = Class.forName("com.google.common.primitives.Booleans$BooleanArrayAsList");
        Class objectType = Class.forName("java.lang.Object");
        Method equalsMethod = booleanArrayAsListClazz.getDeclaredMethod("equals", objectType);
        equalsMethod.setAccessible(true);
        java.lang.Object[] equalsMethodArguments = new java.lang.Object[1];
        equalsMethodArguments[0] = object;
        boolean actual = ((boolean) equalsMethod.invoke(booleanArrayAsList, equalsMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testEquals2() throws Throwable  {
        Object booleanArrayAsList = createInstance("com.google.common.primitives.Booleans$BooleanArrayAsList");
        
        Class booleanArrayAsListClazz = Class.forName("com.google.common.primitives.Booleans$BooleanArrayAsList");
        Class booleanArrayAsListType = Class.forName("java.lang.Object");
        Method equalsMethod = booleanArrayAsListClazz.getDeclaredMethod("equals", booleanArrayAsListType);
        equalsMethod.setAccessible(true);
        java.lang.Object[] equalsMethodArguments = new java.lang.Object[1];
        equalsMethodArguments[0] = booleanArrayAsList;
        boolean actual = ((boolean) equalsMethod.invoke(booleanArrayAsList, equalsMethodArguments));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testEquals3() throws Throwable  {
        Object booleanArrayAsList = createInstance("com.google.common.primitives.Booleans$BooleanArrayAsList");
        java.lang.NullPointerException[] nullPointerExceptionArray = new java.lang.NullPointerException[0];
        
        Class booleanArrayAsListClazz = Class.forName("com.google.common.primitives.Booleans$BooleanArrayAsList");
        Class nullPointerExceptionArrayType = Class.forName("java.lang.Object");
        Method equalsMethod = booleanArrayAsListClazz.getDeclaredMethod("equals", nullPointerExceptionArrayType);
        equalsMethod.setAccessible(true);
        java.lang.Object[] equalsMethodArguments = new java.lang.Object[1];
        equalsMethodArguments[0] = ((Object) nullPointerExceptionArray);
        boolean actual = ((boolean) equalsMethod.invoke(booleanArrayAsList, equalsMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testHashCode4() throws Throwable  {
        Object booleanArrayAsList = createInstance("com.google.common.primitives.Booleans$BooleanArrayAsList");
        
        Class booleanArrayAsListClazz = Class.forName("com.google.common.primitives.Booleans$BooleanArrayAsList");
        Method hashCodeMethod = booleanArrayAsListClazz.getDeclaredMethod("hashCode");
        hashCodeMethod.setAccessible(true);
        java.lang.Object[] hashCodeMethodArguments = new java.lang.Object[0];
        int actual = ((int) hashCodeMethod.invoke(booleanArrayAsList, hashCodeMethodArguments));
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testHashCode5() throws Throwable  {
        Object booleanArrayAsList = createInstance("com.google.common.primitives.Booleans$BooleanArrayAsList");
        setField(booleanArrayAsList, "end", -2147483647);
        setField(booleanArrayAsList, "start", 0);
        
        Class booleanArrayAsListClazz = Class.forName("com.google.common.primitives.Booleans$BooleanArrayAsList");
        Method hashCodeMethod = booleanArrayAsListClazz.getDeclaredMethod("hashCode");
        hashCodeMethod.setAccessible(true);
        java.lang.Object[] hashCodeMethodArguments = new java.lang.Object[0];
        int actual = ((int) hashCodeMethod.invoke(booleanArrayAsList, hashCodeMethodArguments));
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testHashCode6() throws Throwable  {
        Object booleanArrayAsList = createInstance("com.google.common.primitives.Booleans$BooleanArrayAsList");
        setField(booleanArrayAsList, "end", 1);
        setField(booleanArrayAsList, "start", Integer.MIN_VALUE);
        boolean[] booleanArray = new boolean[9];
        setField(booleanArrayAsList, "array", booleanArray);
        
        Class booleanArrayAsListClazz = Class.forName("com.google.common.primitives.Booleans$BooleanArrayAsList");
        Method hashCodeMethod = booleanArrayAsListClazz.getDeclaredMethod("hashCode");
        hashCodeMethod.setAccessible(true);
        java.lang.Object[] hashCodeMethodArguments = new java.lang.Object[0];
        try {
            hashCodeMethod.invoke(booleanArrayAsList, hashCodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testHashCode7() throws Throwable  {
        Object booleanArrayAsList = createInstance("com.google.common.primitives.Booleans$BooleanArrayAsList");
        setField(booleanArrayAsList, "end", 1073741825);
        setField(booleanArrayAsList, "start", 1073741824);
        boolean[] booleanArray = new boolean[9];
        setField(booleanArrayAsList, "array", booleanArray);
        
        Class booleanArrayAsListClazz = Class.forName("com.google.common.primitives.Booleans$BooleanArrayAsList");
        Method hashCodeMethod = booleanArrayAsListClazz.getDeclaredMethod("hashCode");
        hashCodeMethod.setAccessible(true);
        java.lang.Object[] hashCodeMethodArguments = new java.lang.Object[0];
        try {
            hashCodeMethod.invoke(booleanArrayAsList, hashCodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testHashCode8() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(Booleans.class);
            mockedStatic.when(() -> {
                Booleans.hashCode(anyBoolean());
            }).thenReturn(0);
            Object booleanArrayAsList = createInstance("com.google.common.primitives.Booleans$BooleanArrayAsList");
            setField(booleanArrayAsList, "end", 1);
            setField(booleanArrayAsList, "start", 0);
            boolean[] booleanArray = new boolean[9];
            setField(booleanArrayAsList, "array", booleanArray);
            
            Class booleanArrayAsListClazz = Class.forName("com.google.common.primitives.Booleans$BooleanArrayAsList");
            Method hashCodeMethod = booleanArrayAsListClazz.getDeclaredMethod("hashCode");
            hashCodeMethod.setAccessible(true);
            java.lang.Object[] hashCodeMethodArguments = new java.lang.Object[0];
            int actual = ((int) hashCodeMethod.invoke(booleanArrayAsList, hashCodeMethodArguments));
            
            assertEquals(31, actual);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testToString1() throws Throwable  {
        Object booleanArrayAsList = createInstance("com.google.common.primitives.Booleans$BooleanArrayAsList");
        
        Class booleanArrayAsListClazz = Class.forName("com.google.common.primitives.Booleans$BooleanArrayAsList");
        Method toStringMethod = booleanArrayAsListClazz.getDeclaredMethod("toString");
        toStringMethod.setAccessible(true);
        java.lang.Object[] toStringMethodArguments = new java.lang.Object[0];
        try {
            toStringMethod.invoke(booleanArrayAsList, toStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testToString2() throws Throwable  {
        Object booleanArrayAsList = createInstance("com.google.common.primitives.Booleans$BooleanArrayAsList");
        setField(booleanArrayAsList, "end", 0);
        setField(booleanArrayAsList, "start", Integer.MIN_VALUE);
        boolean[] booleanArray = new boolean[9];
        setField(booleanArrayAsList, "array", booleanArray);
        
        Class booleanArrayAsListClazz = Class.forName("com.google.common.primitives.Booleans$BooleanArrayAsList");
        Method toStringMethod = booleanArrayAsListClazz.getDeclaredMethod("toString");
        toStringMethod.setAccessible(true);
        java.lang.Object[] toStringMethodArguments = new java.lang.Object[0];
        try {
            toStringMethod.invoke(booleanArrayAsList, toStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testToString3() throws Throwable  {
        Object booleanArrayAsList = createInstance("com.google.common.primitives.Booleans$BooleanArrayAsList");
        setField(booleanArrayAsList, "end", 0);
        setField(booleanArrayAsList, "start", 1073741824);
        boolean[] booleanArray = new boolean[9];
        setField(booleanArrayAsList, "array", booleanArray);
        
        Class booleanArrayAsListClazz = Class.forName("com.google.common.primitives.Booleans$BooleanArrayAsList");
        Method toStringMethod = booleanArrayAsListClazz.getDeclaredMethod("toString");
        toStringMethod.setAccessible(true);
        java.lang.Object[] toStringMethodArguments = new java.lang.Object[0];
        try {
            toStringMethod.invoke(booleanArrayAsList, toStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testToString4() throws Throwable  {
        Object booleanArrayAsList = createInstance("com.google.common.primitives.Booleans$BooleanArrayAsList");
        setField(booleanArrayAsList, "end", 2);
        setField(booleanArrayAsList, "start", 0);
        boolean[] booleanArray = new boolean[1];
        setField(booleanArrayAsList, "array", booleanArray);
        
        Class booleanArrayAsListClazz = Class.forName("com.google.common.primitives.Booleans$BooleanArrayAsList");
        Method toStringMethod = booleanArrayAsListClazz.getDeclaredMethod("toString");
        toStringMethod.setAccessible(true);
        java.lang.Object[] toStringMethodArguments = new java.lang.Object[0];
        try {
            toStringMethod.invoke(booleanArrayAsList, toStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testToString5() throws Throwable  {
        Object booleanArrayAsList = createInstance("com.google.common.primitives.Booleans$BooleanArrayAsList");
        setField(booleanArrayAsList, "end", 2);
        setField(booleanArrayAsList, "start", 0);
        boolean[] booleanArray = new boolean[1];
        booleanArray[0] = true;
        setField(booleanArrayAsList, "array", booleanArray);
        
        Class booleanArrayAsListClazz = Class.forName("com.google.common.primitives.Booleans$BooleanArrayAsList");
        Method toStringMethod = booleanArrayAsListClazz.getDeclaredMethod("toString");
        toStringMethod.setAccessible(true);
        java.lang.Object[] toStringMethodArguments = new java.lang.Object[0];
        try {
            toStringMethod.invoke(booleanArrayAsList, toStringMethodArguments);
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
            Object booleanArrayAsList = createInstance("com.google.common.primitives.Booleans$BooleanArrayAsList");
            setField(booleanArrayAsList, "end", 0);
            setField(booleanArrayAsList, "start", 1073741824);
            boolean[] booleanArray = new boolean[9];
            setField(booleanArrayAsList, "array", booleanArray);
            
            Class booleanArrayAsListClazz = Class.forName("com.google.common.primitives.Booleans$BooleanArrayAsList");
            Class intType = int.class;
            Class booleanType = Class.forName("java.lang.Boolean");
            Method setMethod = booleanArrayAsListClazz.getDeclaredMethod("set", intType, booleanType);
            setMethod.setAccessible(true);
            java.lang.Object[] setMethodArguments = new java.lang.Object[2];
            setMethodArguments[0] = 0;
            setMethodArguments[1] = null;
            try {
                setMethod.invoke(booleanArrayAsList, setMethodArguments);
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
            Object booleanArrayAsList = createInstance("com.google.common.primitives.Booleans$BooleanArrayAsList");
            setField(booleanArrayAsList, "end", 0);
            setField(booleanArrayAsList, "start", 1073741824);
            boolean[] booleanArray = new boolean[9];
            setField(booleanArrayAsList, "array", booleanArray);
            
            Class booleanArrayAsListClazz = Class.forName("com.google.common.primitives.Booleans$BooleanArrayAsList");
            Class intType = int.class;
            Class booleanType = Class.forName("java.lang.Boolean");
            Method setMethod = booleanArrayAsListClazz.getDeclaredMethod("set", intType, booleanType);
            setMethod.setAccessible(true);
            java.lang.Object[] setMethodArguments = new java.lang.Object[2];
            setMethodArguments[0] = 1073741824;
            setMethodArguments[1] = null;
            try {
                setMethod.invoke(booleanArrayAsList, setMethodArguments);
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
            Object booleanArrayAsList = createInstance("com.google.common.primitives.Booleans$BooleanArrayAsList");
            setField(booleanArrayAsList, "end", 0);
            setField(booleanArrayAsList, "start", 0);
            boolean[] booleanArray = new boolean[9];
            setField(booleanArrayAsList, "array", booleanArray);
            Boolean boolean1 = false;
            
            Class booleanArrayAsListClazz = Class.forName("com.google.common.primitives.Booleans$BooleanArrayAsList");
            Class intType = int.class;
            Class boolean1Type = Class.forName("java.lang.Boolean");
            Method setMethod = booleanArrayAsListClazz.getDeclaredMethod("set", intType, boolean1Type);
            setMethod.setAccessible(true);
            java.lang.Object[] setMethodArguments = new java.lang.Object[2];
            setMethodArguments[0] = 0;
            setMethodArguments[1] = boolean1;
            try {
                setMethod.invoke(booleanArrayAsList, setMethodArguments);
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
            Object booleanArrayAsList = createInstance("com.google.common.primitives.Booleans$BooleanArrayAsList");
            setField(booleanArrayAsList, "end", 0);
            setField(booleanArrayAsList, "start", 0);
            boolean[] booleanArray = new boolean[9];
            setField(booleanArrayAsList, "array", booleanArray);
            Boolean boolean1 = false;
            
            Class booleanArrayAsListClazz = Class.forName("com.google.common.primitives.Booleans$BooleanArrayAsList");
            Class intType = int.class;
            Class boolean1Type = Class.forName("java.lang.Boolean");
            Method setMethod = booleanArrayAsListClazz.getDeclaredMethod("set", intType, boolean1Type);
            setMethod.setAccessible(true);
            java.lang.Object[] setMethodArguments = new java.lang.Object[2];
            setMethodArguments[0] = 0;
            setMethodArguments[1] = boolean1;
            try {
                setMethod.invoke(booleanArrayAsList, setMethodArguments);
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
            Boolean boolean1 = false;
            mockedStatic.when(() -> {
                com.google.common.base.Preconditions.checkNotNull(any());
            }).thenReturn(((Object) boolean1));
            Object booleanArrayAsList = createInstance("com.google.common.primitives.Booleans$BooleanArrayAsList");
            setField(booleanArrayAsList, "end", 0);
            setField(booleanArrayAsList, "start", 0);
            boolean[] booleanArray = new boolean[9];
            setField(booleanArrayAsList, "array", booleanArray);
            
            Class booleanArrayAsListClazz = Class.forName("com.google.common.primitives.Booleans$BooleanArrayAsList");
            Class intType = int.class;
            Class booleanType = Class.forName("java.lang.Boolean");
            Method setMethod = booleanArrayAsListClazz.getDeclaredMethod("set", intType, booleanType);
            setMethod.setAccessible(true);
            java.lang.Object[] setMethodArguments = new java.lang.Object[2];
            setMethodArguments[0] = 0;
            setMethodArguments[1] = null;
            Boolean actual = ((Boolean) setMethod.invoke(booleanArrayAsList, setMethodArguments));
            
            Boolean expected = false;
            
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
        Object booleanArrayAsList = createInstance("com.google.common.primitives.Booleans$BooleanArrayAsList");
        
        Class booleanArrayAsListClazz = Class.forName("com.google.common.primitives.Booleans$BooleanArrayAsList");
        Class intType = int.class;
        Method subListMethod = booleanArrayAsListClazz.getDeclaredMethod("subList", intType, intType);
        subListMethod.setAccessible(true);
        java.lang.Object[] subListMethodArguments = new java.lang.Object[2];
        subListMethodArguments[0] = 0;
        subListMethodArguments[1] = 0;
        List actual = ((List) subListMethod.invoke(booleanArrayAsList, subListMethodArguments));
        
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
            Object booleanArrayAsList = createInstance("com.google.common.primitives.Booleans$BooleanArrayAsList");
            setField(booleanArrayAsList, "modCount", 0);
            setField(booleanArrayAsList, "end", 0);
            setField(booleanArrayAsList, "start", 0);
            boolean[] booleanArray = new boolean[9];
            setField(booleanArrayAsList, "array", booleanArray);
            
            Class booleanArrayAsListClazz = Class.forName("com.google.common.primitives.Booleans$BooleanArrayAsList");
            Class intType = int.class;
            Method subListMethod = booleanArrayAsListClazz.getDeclaredMethod("subList", intType, intType);
            subListMethod.setAccessible(true);
            java.lang.Object[] subListMethodArguments = new java.lang.Object[2];
            subListMethodArguments[0] = 8192;
            subListMethodArguments[1] = 0;
            List actual = ((List) subListMethod.invoke(booleanArrayAsList, subListMethodArguments));
            
            Object expected = createInstance("com.google.common.primitives.Booleans$BooleanArrayAsList");
            setField(expected, "modCount", 0);
            setField(expected, "end", 0);
            setField(expected, "start", 8192);
            setField(expected, "array", booleanArray);
            
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
            Object booleanArrayAsList = createInstance("com.google.common.primitives.Booleans$BooleanArrayAsList");
            setField(booleanArrayAsList, "modCount", 0);
            setField(booleanArrayAsList, "end", 0);
            setField(booleanArrayAsList, "start", 0);
            
            Class booleanArrayAsListClazz = Class.forName("com.google.common.primitives.Booleans$BooleanArrayAsList");
            Class intType = int.class;
            Method subListMethod = booleanArrayAsListClazz.getDeclaredMethod("subList", intType, intType);
            subListMethod.setAccessible(true);
            java.lang.Object[] subListMethodArguments = new java.lang.Object[2];
            subListMethodArguments[0] = 0;
            subListMethodArguments[1] = 0;
            List actual = ((List) subListMethod.invoke(booleanArrayAsList, subListMethodArguments));
            
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
        Object booleanArrayAsList = createInstance("com.google.common.primitives.Booleans$BooleanArrayAsList");
        
        Class booleanArrayAsListClazz = Class.forName("com.google.common.primitives.Booleans$BooleanArrayAsList");
        Class intType = int.class;
        Method getMethod = booleanArrayAsListClazz.getDeclaredMethod("get", intType);
        getMethod.setAccessible(true);
        java.lang.Object[] getMethodArguments = new java.lang.Object[1];
        getMethodArguments[0] = 0;
        try {
            getMethod.invoke(booleanArrayAsList, getMethodArguments);
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
            Object booleanArrayAsList = createInstance("com.google.common.primitives.Booleans$BooleanArrayAsList");
            setField(booleanArrayAsList, "end", 0);
            setField(booleanArrayAsList, "start", 1073741824);
            boolean[] booleanArray = new boolean[9];
            setField(booleanArrayAsList, "array", booleanArray);
            
            Class booleanArrayAsListClazz = Class.forName("com.google.common.primitives.Booleans$BooleanArrayAsList");
            Class intType = int.class;
            Method getMethod = booleanArrayAsListClazz.getDeclaredMethod("get", intType);
            getMethod.setAccessible(true);
            java.lang.Object[] getMethodArguments = new java.lang.Object[1];
            getMethodArguments[0] = 0;
            try {
                getMethod.invoke(booleanArrayAsList, getMethodArguments);
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
            Object booleanArrayAsList = createInstance("com.google.common.primitives.Booleans$BooleanArrayAsList");
            setField(booleanArrayAsList, "end", 0);
            setField(booleanArrayAsList, "start", 1073741823);
            boolean[] booleanArray = new boolean[9];
            setField(booleanArrayAsList, "array", booleanArray);
            
            Class booleanArrayAsListClazz = Class.forName("com.google.common.primitives.Booleans$BooleanArrayAsList");
            Class intType = int.class;
            Method getMethod = booleanArrayAsListClazz.getDeclaredMethod("get", intType);
            getMethod.setAccessible(true);
            java.lang.Object[] getMethodArguments = new java.lang.Object[1];
            getMethodArguments[0] = 1073741825;
            try {
                getMethod.invoke(booleanArrayAsList, getMethodArguments);
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
            Object booleanArrayAsList = createInstance("com.google.common.primitives.Booleans$BooleanArrayAsList");
            setField(booleanArrayAsList, "end", 0);
            setField(booleanArrayAsList, "start", 0);
            boolean[] booleanArray = new boolean[9];
            setField(booleanArrayAsList, "array", booleanArray);
            
            Class booleanArrayAsListClazz = Class.forName("com.google.common.primitives.Booleans$BooleanArrayAsList");
            Class intType = int.class;
            Method getMethod = booleanArrayAsListClazz.getDeclaredMethod("get", intType);
            getMethod.setAccessible(true);
            java.lang.Object[] getMethodArguments = new java.lang.Object[1];
            getMethodArguments[0] = 0;
            Boolean actual = ((Boolean) getMethod.invoke(booleanArrayAsList, getMethodArguments));
            
            Boolean expected = false;
            
            // Current deep equals depth exceeds max depth 0
            assertTrue(deepEquals(expected, actual));
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIndexOf15() throws Throwable  {
        Object booleanArrayAsList = createInstance("com.google.common.primitives.Booleans$BooleanArrayAsList");
        Object object = new Object();
        
        Class booleanArrayAsListClazz = Class.forName("com.google.common.primitives.Booleans$BooleanArrayAsList");
        Class objectType = Class.forName("java.lang.Object");
        Method indexOfMethod = booleanArrayAsListClazz.getDeclaredMethod("indexOf", objectType);
        indexOfMethod.setAccessible(true);
        java.lang.Object[] indexOfMethodArguments = new java.lang.Object[1];
        indexOfMethodArguments[0] = object;
        int actual = ((int) indexOfMethod.invoke(booleanArrayAsList, indexOfMethodArguments));
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIndexOf16() throws Throwable  {
        Object booleanArrayAsList = createInstance("com.google.common.primitives.Booleans$BooleanArrayAsList");
        
        Class booleanArrayAsListClazz = Class.forName("com.google.common.primitives.Booleans$BooleanArrayAsList");
        Class objectType = Class.forName("java.lang.Object");
        Method indexOfMethod = booleanArrayAsListClazz.getDeclaredMethod("indexOf", objectType);
        indexOfMethod.setAccessible(true);
        java.lang.Object[] indexOfMethodArguments = new java.lang.Object[1];
        indexOfMethodArguments[0] = null;
        int actual = ((int) indexOfMethod.invoke(booleanArrayAsList, indexOfMethodArguments));
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIndexOf17() throws Throwable  {
        Object booleanArrayAsList = createInstance("com.google.common.primitives.Booleans$BooleanArrayAsList");
        setField(booleanArrayAsList, "end", 0);
        setField(booleanArrayAsList, "start", 0);
        boolean[] booleanArray = new boolean[9];
        setField(booleanArrayAsList, "array", booleanArray);
        Boolean boolean1 = false;
        
        Class booleanArrayAsListClazz = Class.forName("com.google.common.primitives.Booleans$BooleanArrayAsList");
        Class boolean1Type = Class.forName("java.lang.Object");
        Method indexOfMethod = booleanArrayAsListClazz.getDeclaredMethod("indexOf", boolean1Type);
        indexOfMethod.setAccessible(true);
        java.lang.Object[] indexOfMethodArguments = new java.lang.Object[1];
        indexOfMethodArguments[0] = boolean1;
        int actual = ((int) indexOfMethod.invoke(booleanArrayAsList, indexOfMethodArguments));
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIndexOf18() throws Throwable  {
        Object booleanArrayAsList = createInstance("com.google.common.primitives.Booleans$BooleanArrayAsList");
        setField(booleanArrayAsList, "end", 0);
        setField(booleanArrayAsList, "start", 0);
        boolean[] booleanArray = new boolean[9];
        setField(booleanArrayAsList, "array", booleanArray);
        Boolean boolean1 = false;
        
        Class booleanArrayAsListClazz = Class.forName("com.google.common.primitives.Booleans$BooleanArrayAsList");
        Class boolean1Type = Class.forName("java.lang.Object");
        Method indexOfMethod = booleanArrayAsListClazz.getDeclaredMethod("indexOf", boolean1Type);
        indexOfMethod.setAccessible(true);
        java.lang.Object[] indexOfMethodArguments = new java.lang.Object[1];
        indexOfMethodArguments[0] = boolean1;
        int actual = ((int) indexOfMethod.invoke(booleanArrayAsList, indexOfMethodArguments));
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testLastIndexOf13() throws Throwable  {
        Object booleanArrayAsList = createInstance("com.google.common.primitives.Booleans$BooleanArrayAsList");
        Object object = new Object();
        
        Class booleanArrayAsListClazz = Class.forName("com.google.common.primitives.Booleans$BooleanArrayAsList");
        Class objectType = Class.forName("java.lang.Object");
        Method lastIndexOfMethod = booleanArrayAsListClazz.getDeclaredMethod("lastIndexOf", objectType);
        lastIndexOfMethod.setAccessible(true);
        java.lang.Object[] lastIndexOfMethodArguments = new java.lang.Object[1];
        lastIndexOfMethodArguments[0] = object;
        int actual = ((int) lastIndexOfMethod.invoke(booleanArrayAsList, lastIndexOfMethodArguments));
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testLastIndexOf14() throws Throwable  {
        Object booleanArrayAsList = createInstance("com.google.common.primitives.Booleans$BooleanArrayAsList");
        
        Class booleanArrayAsListClazz = Class.forName("com.google.common.primitives.Booleans$BooleanArrayAsList");
        Class objectType = Class.forName("java.lang.Object");
        Method lastIndexOfMethod = booleanArrayAsListClazz.getDeclaredMethod("lastIndexOf", objectType);
        lastIndexOfMethod.setAccessible(true);
        java.lang.Object[] lastIndexOfMethodArguments = new java.lang.Object[1];
        lastIndexOfMethodArguments[0] = null;
        int actual = ((int) lastIndexOfMethod.invoke(booleanArrayAsList, lastIndexOfMethodArguments));
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testLastIndexOf15() throws Throwable  {
        Object booleanArrayAsList = createInstance("com.google.common.primitives.Booleans$BooleanArrayAsList");
        setField(booleanArrayAsList, "end", 0);
        setField(booleanArrayAsList, "start", 0);
        boolean[] booleanArray = new boolean[9];
        setField(booleanArrayAsList, "array", booleanArray);
        Boolean boolean1 = false;
        
        Class booleanArrayAsListClazz = Class.forName("com.google.common.primitives.Booleans$BooleanArrayAsList");
        Class boolean1Type = Class.forName("java.lang.Object");
        Method lastIndexOfMethod = booleanArrayAsListClazz.getDeclaredMethod("lastIndexOf", boolean1Type);
        lastIndexOfMethod.setAccessible(true);
        java.lang.Object[] lastIndexOfMethodArguments = new java.lang.Object[1];
        lastIndexOfMethodArguments[0] = boolean1;
        int actual = ((int) lastIndexOfMethod.invoke(booleanArrayAsList, lastIndexOfMethodArguments));
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testLastIndexOf16() throws Throwable  {
        Object booleanArrayAsList = createInstance("com.google.common.primitives.Booleans$BooleanArrayAsList");
        setField(booleanArrayAsList, "end", 0);
        setField(booleanArrayAsList, "start", 0);
        boolean[] booleanArray = new boolean[9];
        setField(booleanArrayAsList, "array", booleanArray);
        Boolean boolean1 = false;
        
        Class booleanArrayAsListClazz = Class.forName("com.google.common.primitives.Booleans$BooleanArrayAsList");
        Class boolean1Type = Class.forName("java.lang.Object");
        Method lastIndexOfMethod = booleanArrayAsListClazz.getDeclaredMethod("lastIndexOf", boolean1Type);
        lastIndexOfMethod.setAccessible(true);
        java.lang.Object[] lastIndexOfMethodArguments = new java.lang.Object[1];
        lastIndexOfMethodArguments[0] = boolean1;
        int actual = ((int) lastIndexOfMethod.invoke(booleanArrayAsList, lastIndexOfMethodArguments));
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testToBooleanArray1() throws Throwable  {
        Object booleanArrayAsList = createInstance("com.google.common.primitives.Booleans$BooleanArrayAsList");
        
        Class booleanArrayAsListClazz = Class.forName("com.google.common.primitives.Booleans$BooleanArrayAsList");
        Method toBooleanArrayMethod = booleanArrayAsListClazz.getDeclaredMethod("toBooleanArray");
        toBooleanArrayMethod.setAccessible(true);
        java.lang.Object[] toBooleanArrayMethodArguments = new java.lang.Object[0];
        try {
            toBooleanArrayMethod.invoke(booleanArrayAsList, toBooleanArrayMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testToBooleanArray2() throws Throwable  {
        Object booleanArrayAsList = createInstance("com.google.common.primitives.Booleans$BooleanArrayAsList");
        setField(booleanArrayAsList, "end", 1073741824);
        setField(booleanArrayAsList, "start", -1342177280);
        boolean[] booleanArray = new boolean[9];
        setField(booleanArrayAsList, "array", booleanArray);
        
        Class booleanArrayAsListClazz = Class.forName("com.google.common.primitives.Booleans$BooleanArrayAsList");
        Method toBooleanArrayMethod = booleanArrayAsListClazz.getDeclaredMethod("toBooleanArray");
        toBooleanArrayMethod.setAccessible(true);
        java.lang.Object[] toBooleanArrayMethodArguments = new java.lang.Object[0];
        try {
            toBooleanArrayMethod.invoke(booleanArrayAsList, toBooleanArrayMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testToBooleanArray3() throws Throwable  {
        Object booleanArrayAsList = createInstance("com.google.common.primitives.Booleans$BooleanArrayAsList");
        setField(booleanArrayAsList, "end", 0);
        setField(booleanArrayAsList, "start", 0);
        boolean[] booleanArray = new boolean[1];
        setField(booleanArrayAsList, "array", booleanArray);
        
        Class booleanArrayAsListClazz = Class.forName("com.google.common.primitives.Booleans$BooleanArrayAsList");
        Method toBooleanArrayMethod = booleanArrayAsListClazz.getDeclaredMethod("toBooleanArray");
        toBooleanArrayMethod.setAccessible(true);
        java.lang.Object[] toBooleanArrayMethodArguments = new java.lang.Object[0];
        boolean[] actual = ((boolean[]) toBooleanArrayMethod.invoke(booleanArrayAsList, toBooleanArrayMethodArguments));
        
        boolean[] expected = new boolean[0];
        assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSize1() throws Throwable  {
        Object booleanArrayAsList = createInstance("com.google.common.primitives.Booleans$BooleanArrayAsList");
        
        Class booleanArrayAsListClazz = Class.forName("com.google.common.primitives.Booleans$BooleanArrayAsList");
        Method sizeMethod = booleanArrayAsListClazz.getDeclaredMethod("size");
        sizeMethod.setAccessible(true);
        java.lang.Object[] sizeMethodArguments = new java.lang.Object[0];
        int actual = ((int) sizeMethod.invoke(booleanArrayAsList, sizeMethodArguments));
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSize2() throws Throwable  {
        Object booleanArrayAsList = createInstance("com.google.common.primitives.Booleans$BooleanArrayAsList");
        setField(booleanArrayAsList, "end", 0);
        setField(booleanArrayAsList, "start", 0);
        
        Class booleanArrayAsListClazz = Class.forName("com.google.common.primitives.Booleans$BooleanArrayAsList");
        Method sizeMethod = booleanArrayAsListClazz.getDeclaredMethod("size");
        sizeMethod.setAccessible(true);
        java.lang.Object[] sizeMethodArguments = new java.lang.Object[0];
        int actual = ((int) sizeMethod.invoke(booleanArrayAsList, sizeMethodArguments));
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testBooleanArrayAsList1() throws Throwable  {
        boolean[] booleanArray = new boolean[0];
        Class booleanArrayAsListClazz = Class.forName("com.google.common.primitives.Booleans$BooleanArrayAsList");
        Class booleanArrayType = Class.forName("[Z");
        Constructor booleanArrayAsListConstructor = booleanArrayAsListClazz.getDeclaredConstructor(booleanArrayType);
        booleanArrayAsListConstructor.setAccessible(true);
        java.lang.Object[] booleanArrayAsListConstructorArguments = new java.lang.Object[1];
        booleanArrayAsListConstructorArguments[0] = ((Object) booleanArray);
        Object actual = booleanArrayAsListConstructor.newInstance(booleanArrayAsListConstructorArguments);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testBooleanArrayAsList2() throws Throwable  {
        Class booleanArrayAsListClazz = Class.forName("com.google.common.primitives.Booleans$BooleanArrayAsList");
        Class booleanArrayType = Class.forName("[Z");
        Constructor booleanArrayAsListConstructor = booleanArrayAsListClazz.getDeclaredConstructor(booleanArrayType);
        booleanArrayAsListConstructor.setAccessible(true);
        java.lang.Object[] booleanArrayAsListConstructorArguments = new java.lang.Object[1];
        booleanArrayAsListConstructorArguments[0] = null;
        booleanArrayAsListConstructor.newInstance(booleanArrayAsListConstructorArguments);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testBooleanArrayAsList3() throws Throwable  {
        boolean[] booleanArray = new boolean[0];
        Class booleanArrayAsListClazz = Class.forName("com.google.common.primitives.Booleans$BooleanArrayAsList");
        Class booleanArrayType = Class.forName("[Z");
        Constructor booleanArrayAsListConstructor = booleanArrayAsListClazz.getDeclaredConstructor(booleanArrayType);
        booleanArrayAsListConstructor.setAccessible(true);
        java.lang.Object[] booleanArrayAsListConstructorArguments = new java.lang.Object[1];
        booleanArrayAsListConstructorArguments[0] = ((Object) booleanArray);
        Object actual = booleanArrayAsListConstructor.newInstance(booleanArrayAsListConstructorArguments);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testBooleanArrayAsList4() throws Throwable  {
        boolean[] booleanArray = new boolean[0];
        Class booleanArrayAsListClazz = Class.forName("com.google.common.primitives.Booleans$BooleanArrayAsList");
        Class booleanArrayType = Class.forName("[Z");
        Class intType = int.class;
        Constructor booleanArrayAsListConstructor = booleanArrayAsListClazz.getDeclaredConstructor(booleanArrayType, intType, intType);
        booleanArrayAsListConstructor.setAccessible(true);
        java.lang.Object[] booleanArrayAsListConstructorArguments = new java.lang.Object[3];
        booleanArrayAsListConstructorArguments[0] = ((Object) booleanArray);
        booleanArrayAsListConstructorArguments[1] = 0;
        booleanArrayAsListConstructorArguments[2] = 0;
        Object actual = booleanArrayAsListConstructor.newInstance(booleanArrayAsListConstructorArguments);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testBooleanArrayAsList5() throws Throwable  {
        boolean[] booleanArray = new boolean[9];
        Class booleanArrayAsListClazz = Class.forName("com.google.common.primitives.Booleans$BooleanArrayAsList");
        Class booleanArrayType = Class.forName("[Z");
        Class intType = int.class;
        Constructor booleanArrayAsListConstructor = booleanArrayAsListClazz.getDeclaredConstructor(booleanArrayType, intType, intType);
        booleanArrayAsListConstructor.setAccessible(true);
        java.lang.Object[] booleanArrayAsListConstructorArguments = new java.lang.Object[3];
        booleanArrayAsListConstructorArguments[0] = ((Object) booleanArray);
        booleanArrayAsListConstructorArguments[1] = 0;
        booleanArrayAsListConstructorArguments[2] = 0;
        Object actual = booleanArrayAsListConstructor.newInstance(booleanArrayAsListConstructorArguments);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testToString6() throws Throwable  {
        Class lexicographicalComparatorClazz = Class.forName("com.google.common.primitives.Booleans$LexicographicalComparator");
        Object lexicographicalComparator = getEnumConstantByName(lexicographicalComparatorClazz, "INSTANCE");
        
        Method toStringMethod = lexicographicalComparatorClazz.getDeclaredMethod("toString");
        toStringMethod.setAccessible(true);
        java.lang.Object[] toStringMethodArguments = new java.lang.Object[0];
        String actual = ((String) toStringMethod.invoke(lexicographicalComparator, toStringMethodArguments));
        
        String expected = new String("Booleans.lexicographicalComparator()");
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCompare5() throws Throwable  {
        Class lexicographicalComparatorClazz = Class.forName("com.google.common.primitives.Booleans$LexicographicalComparator");
        Object lexicographicalComparator = getEnumConstantByName(lexicographicalComparatorClazz, "INSTANCE");
        
        Class booleanArrayType = Class.forName("[Z");
        Method compareMethod = lexicographicalComparatorClazz.getDeclaredMethod("compare", booleanArrayType, booleanArrayType);
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
    public void testCompare6() throws Throwable  {
        Class lexicographicalComparatorClazz = Class.forName("com.google.common.primitives.Booleans$LexicographicalComparator");
        Object lexicographicalComparator = getEnumConstantByName(lexicographicalComparatorClazz, "INSTANCE");
        boolean[] booleanArray = new boolean[9];
        
        Class booleanArrayType = Class.forName("[Z");
        Method compareMethod = lexicographicalComparatorClazz.getDeclaredMethod("compare", booleanArrayType, booleanArrayType);
        compareMethod.setAccessible(true);
        java.lang.Object[] compareMethodArguments = new java.lang.Object[2];
        compareMethodArguments[0] = ((Object) booleanArray);
        compareMethodArguments[1] = null;
        try {
            compareMethod.invoke(lexicographicalComparator, compareMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCompare7() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(Booleans.class);
            mockedStatic.when(() -> {
                Booleans.compare(anyBoolean(), anyBoolean());
            }).thenReturn(1);
            Class lexicographicalComparatorClazz = Class.forName("com.google.common.primitives.Booleans$LexicographicalComparator");
            Object lexicographicalComparator = getEnumConstantByName(lexicographicalComparatorClazz, "INSTANCE");
            boolean[] booleanArray = new boolean[11];
            boolean[] booleanArray1 = new boolean[10];
            
            Class booleanArrayType = Class.forName("[Z");
            Method compareMethod = lexicographicalComparatorClazz.getDeclaredMethod("compare", booleanArrayType, booleanArrayType);
            compareMethod.setAccessible(true);
            java.lang.Object[] compareMethodArguments = new java.lang.Object[2];
            compareMethodArguments[0] = ((Object) booleanArray);
            compareMethodArguments[1] = ((Object) booleanArray1);
            int actual = ((int) compareMethod.invoke(lexicographicalComparator, compareMethodArguments));
            
            assertEquals(1, actual);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCompare8() throws Throwable  {
        Class lexicographicalComparatorClazz = Class.forName("com.google.common.primitives.Booleans$LexicographicalComparator");
        Object lexicographicalComparator = getEnumConstantByName(lexicographicalComparatorClazz, "INSTANCE");
        boolean[] booleanArray = new boolean[9];
        boolean[] booleanArray1 = new boolean[0];
        
        Class booleanArrayType = Class.forName("[Z");
        Method compareMethod = lexicographicalComparatorClazz.getDeclaredMethod("compare", booleanArrayType, booleanArrayType);
        compareMethod.setAccessible(true);
        java.lang.Object[] compareMethodArguments = new java.lang.Object[2];
        compareMethodArguments[0] = ((Object) booleanArray);
        compareMethodArguments[1] = ((Object) booleanArray1);
        int actual = ((int) compareMethod.invoke(lexicographicalComparator, compareMethodArguments));
        
        assertEquals(9, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCompare9() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(Booleans.class);
            mockedStatic.when(() -> {
                Booleans.compare(anyBoolean(), anyBoolean());
            }).thenReturn(0);
            Class lexicographicalComparatorClazz = Class.forName("com.google.common.primitives.Booleans$LexicographicalComparator");
            Object lexicographicalComparator = getEnumConstantByName(lexicographicalComparatorClazz, "INSTANCE");
            boolean[] booleanArray = new boolean[11];
            boolean[] booleanArray1 = new boolean[1];
            
            Class booleanArrayType = Class.forName("[Z");
            Method compareMethod = lexicographicalComparatorClazz.getDeclaredMethod("compare", booleanArrayType, booleanArrayType);
            compareMethod.setAccessible(true);
            java.lang.Object[] compareMethodArguments = new java.lang.Object[2];
            compareMethodArguments[0] = ((Object) booleanArray);
            compareMethodArguments[1] = ((Object) booleanArray1);
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
        
        Class lexicographicalComparatorClazz = Class.forName("com.google.common.primitives.Booleans$LexicographicalComparator");
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
        Class lexicographicalComparatorClazz = Class.forName("com.google.common.primitives.Booleans$LexicographicalComparator");
        Method valuesMethod = lexicographicalComparatorClazz.getDeclaredMethod("values");
        valuesMethod.setAccessible(true);
        java.lang.Object[] valuesMethodArguments = new java.lang.Object[0];
        Object actual = valuesMethod.invoke(null, valuesMethodArguments);
        
        java.lang.Object[] expected = createArray("com.google.common.primitives.Booleans$LexicographicalComparator", 1);
        Object lexicographicalComparator = getEnumConstantByName(lexicographicalComparatorClazz, "INSTANCE");
        expected[0] = lexicographicalComparator;
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testValues2() throws Throwable  {
        Class lexicographicalComparatorClazz = Class.forName("com.google.common.primitives.Booleans$LexicographicalComparator");
        Method valuesMethod = lexicographicalComparatorClazz.getDeclaredMethod("values");
        valuesMethod.setAccessible(true);
        java.lang.Object[] valuesMethodArguments = new java.lang.Object[0];
        Object actual = valuesMethod.invoke(null, valuesMethodArguments);
        
        java.lang.Object[] expected = createArray("com.google.common.primitives.Booleans$LexicographicalComparator", 1);
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
        Class lexicographicalComparatorClazz = Class.forName("com.google.common.primitives.Booleans$LexicographicalComparator");
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
    public void testToString7() throws Throwable  {
        Object booleanComparator = createInstance("com.google.common.primitives.Booleans$BooleanComparator");
        
        Class booleanComparatorClazz = Class.forName("com.google.common.primitives.Booleans$BooleanComparator");
        Method toStringMethod = booleanComparatorClazz.getDeclaredMethod("toString");
        toStringMethod.setAccessible(true);
        java.lang.Object[] toStringMethodArguments = new java.lang.Object[0];
        String actual = ((String) toStringMethod.invoke(booleanComparator, toStringMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testToString8() throws Throwable  {
        Class booleanComparatorClazz = Class.forName("com.google.common.primitives.Booleans$BooleanComparator");
        Object booleanComparator = getEnumConstantByName(booleanComparatorClazz, "TRUE_FIRST");
        
        Method toStringMethod = booleanComparatorClazz.getDeclaredMethod("toString");
        toStringMethod.setAccessible(true);
        java.lang.Object[] toStringMethodArguments = new java.lang.Object[0];
        String actual = ((String) toStringMethod.invoke(booleanComparator, toStringMethodArguments));
        
        String expected = new String("");
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCompare10() throws Throwable  {
        Class booleanComparatorClazz = Class.forName("com.google.common.primitives.Booleans$BooleanComparator");
        Object booleanComparator = getEnumConstantByName(booleanComparatorClazz, "TRUE_FIRST");
        
        Class booleanType = Class.forName("java.lang.Boolean");
        Method compareMethod = booleanComparatorClazz.getDeclaredMethod("compare", booleanType, booleanType);
        compareMethod.setAccessible(true);
        java.lang.Object[] compareMethodArguments = new java.lang.Object[2];
        compareMethodArguments[0] = null;
        compareMethodArguments[1] = null;
        try {
            compareMethod.invoke(booleanComparator, compareMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCompare11() throws Throwable  {
        Class booleanComparatorClazz = Class.forName("com.google.common.primitives.Booleans$BooleanComparator");
        Object booleanComparator = getEnumConstantByName(booleanComparatorClazz, "TRUE_FIRST");
        Boolean boolean1 = false;
        
        Class boolean1Type = Class.forName("java.lang.Boolean");
        Method compareMethod = booleanComparatorClazz.getDeclaredMethod("compare", boolean1Type, boolean1Type);
        compareMethod.setAccessible(true);
        java.lang.Object[] compareMethodArguments = new java.lang.Object[2];
        compareMethodArguments[0] = boolean1;
        compareMethodArguments[1] = null;
        try {
            compareMethod.invoke(booleanComparator, compareMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCompare12() throws Throwable  {
        Class booleanComparatorClazz = Class.forName("com.google.common.primitives.Booleans$BooleanComparator");
        Object booleanComparator = getEnumConstantByName(booleanComparatorClazz, "TRUE_FIRST");
        Boolean boolean1 = true;
        
        Class boolean1Type = Class.forName("java.lang.Boolean");
        Method compareMethod = booleanComparatorClazz.getDeclaredMethod("compare", boolean1Type, boolean1Type);
        compareMethod.setAccessible(true);
        java.lang.Object[] compareMethodArguments = new java.lang.Object[2];
        compareMethodArguments[0] = boolean1;
        compareMethodArguments[1] = null;
        try {
            compareMethod.invoke(booleanComparator, compareMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCompare13() throws Throwable  {
        Class booleanComparatorClazz = Class.forName("com.google.common.primitives.Booleans$BooleanComparator");
        Object booleanComparator = getEnumConstantByName(booleanComparatorClazz, "TRUE_FIRST");
        Boolean boolean1 = true;
        Boolean boolean2 = false;
        
        Class boolean1Type = Class.forName("java.lang.Boolean");
        Method compareMethod = booleanComparatorClazz.getDeclaredMethod("compare", boolean1Type, boolean1Type);
        compareMethod.setAccessible(true);
        java.lang.Object[] compareMethodArguments = new java.lang.Object[2];
        compareMethodArguments[0] = boolean1;
        compareMethodArguments[1] = boolean2;
        int actual = ((int) compareMethod.invoke(booleanComparator, compareMethodArguments));
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCompare14() throws Throwable  {
        Class booleanComparatorClazz = Class.forName("com.google.common.primitives.Booleans$BooleanComparator");
        Object booleanComparator = getEnumConstantByName(booleanComparatorClazz, "TRUE_FIRST");
        Boolean boolean1 = true;
        
        Class boolean1Type = Class.forName("java.lang.Boolean");
        Method compareMethod = booleanComparatorClazz.getDeclaredMethod("compare", boolean1Type, boolean1Type);
        compareMethod.setAccessible(true);
        java.lang.Object[] compareMethodArguments = new java.lang.Object[2];
        compareMethodArguments[0] = boolean1;
        compareMethodArguments[1] = boolean1;
        int actual = ((int) compareMethod.invoke(booleanComparator, compareMethodArguments));
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testValueOf2() throws Throwable  {
        String string = new String();
        
        Class booleanComparatorClazz = Class.forName("com.google.common.primitives.Booleans$BooleanComparator");
        Class stringType = Class.forName("java.lang.String");
        Method valueOfMethod = booleanComparatorClazz.getDeclaredMethod("valueOf", stringType);
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
    public void testValueOf3() throws Throwable  {
        Class booleanComparatorClazz = Class.forName("com.google.common.primitives.Booleans$BooleanComparator");
        Class stringType = Class.forName("java.lang.String");
        Method valueOfMethod = booleanComparatorClazz.getDeclaredMethod("valueOf", stringType);
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
    
    @Test(timeout = 10000)
    public void testValues3() throws Throwable  {
        Class booleanComparatorClazz = Class.forName("com.google.common.primitives.Booleans$BooleanComparator");
        Method valuesMethod = booleanComparatorClazz.getDeclaredMethod("values");
        valuesMethod.setAccessible(true);
        java.lang.Object[] valuesMethodArguments = new java.lang.Object[0];
        Object actual = valuesMethod.invoke(null, valuesMethodArguments);
        
        java.lang.Object[] expected = createArray("com.google.common.primitives.Booleans$BooleanComparator", 2);
        Object booleanComparator = getEnumConstantByName(booleanComparatorClazz, "TRUE_FIRST");
        expected[0] = booleanComparator;
        Object booleanComparator1 = getEnumConstantByName(booleanComparatorClazz, "FALSE_FIRST");
        expected[1] = booleanComparator1;
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testValues4() throws Throwable  {
        Class booleanComparatorClazz = Class.forName("com.google.common.primitives.Booleans$BooleanComparator");
        Method valuesMethod = booleanComparatorClazz.getDeclaredMethod("values");
        valuesMethod.setAccessible(true);
        java.lang.Object[] valuesMethodArguments = new java.lang.Object[0];
        Object actual = valuesMethod.invoke(null, valuesMethodArguments);
        
        java.lang.Object[] expected = createArray("com.google.common.primitives.Booleans$BooleanComparator", 2);
        Object booleanComparator = getEnumConstantByName(booleanComparatorClazz, "TRUE_FIRST");
        expected[0] = booleanComparator;
        Object booleanComparator1 = getEnumConstantByName(booleanComparatorClazz, "FALSE_FIRST");
        expected[1] = booleanComparator1;
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testBooleanComparator1() throws Throwable  {
        String string = new String("");
        String string1 = new String("");
        Class booleanComparatorClazz = Class.forName("com.google.common.primitives.Booleans$BooleanComparator");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Constructor booleanComparatorConstructor = booleanComparatorClazz.getDeclaredConstructor(stringType, intType, intType, stringType);
        booleanComparatorConstructor.setAccessible(true);
        java.lang.Object[] booleanComparatorConstructorArguments = new java.lang.Object[4];
        booleanComparatorConstructorArguments[0] = string;
        booleanComparatorConstructorArguments[1] = 0;
        booleanComparatorConstructorArguments[2] = 0;
        booleanComparatorConstructorArguments[3] = string1;
        Object actual = booleanComparatorConstructor.newInstance(booleanComparatorConstructorArguments);
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
