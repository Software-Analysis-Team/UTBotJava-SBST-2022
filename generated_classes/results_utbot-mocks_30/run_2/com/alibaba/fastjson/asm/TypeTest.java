package com.alibaba.fastjson.asm;

import org.junit.Test;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import sun.misc.Unsafe;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TypeTest {
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetDimensions1() throws Throwable  {
        Type type = ((Type) createInstance("com.alibaba.fastjson.asm.Type"));
        
        Class typeClazz = Class.forName("com.alibaba.fastjson.asm.Type");
        Method getDimensionsMethod = typeClazz.getDeclaredMethod("getDimensions");
        getDimensionsMethod.setAccessible(true);
        java.lang.Object[] getDimensionsMethodArguments = new java.lang.Object[0];
        try {
            getDimensionsMethod.invoke(type, getDimensionsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetDimensions2() throws Throwable  {
        Type type = ((Type) createInstance("com.alibaba.fastjson.asm.Type"));
        setField(type, "off", 1073741825);
        char[] charArray = new char[11];
        setField(type, "buf", charArray);
        
        Class typeClazz = Class.forName("com.alibaba.fastjson.asm.Type");
        Method getDimensionsMethod = typeClazz.getDeclaredMethod("getDimensions");
        getDimensionsMethod.setAccessible(true);
        java.lang.Object[] getDimensionsMethodArguments = new java.lang.Object[0];
        try {
            getDimensionsMethod.invoke(type, getDimensionsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetDimensions3() throws Throwable  {
        Type type = ((Type) createInstance("com.alibaba.fastjson.asm.Type"));
        setField(type, "off", Integer.MAX_VALUE);
        char[] charArray = new char[9];
        setField(type, "buf", charArray);
        
        Class typeClazz = Class.forName("com.alibaba.fastjson.asm.Type");
        Method getDimensionsMethod = typeClazz.getDeclaredMethod("getDimensions");
        getDimensionsMethod.setAccessible(true);
        java.lang.Object[] getDimensionsMethodArguments = new java.lang.Object[0];
        try {
            getDimensionsMethod.invoke(type, getDimensionsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetDimensions4() throws Throwable  {
        Type type = ((Type) createInstance("com.alibaba.fastjson.asm.Type"));
        setField(type, "off", 1);
        char[] charArray = new char[11];
        setField(type, "buf", charArray);
        
        Class typeClazz = Class.forName("com.alibaba.fastjson.asm.Type");
        Method getDimensionsMethod = typeClazz.getDeclaredMethod("getDimensions");
        getDimensionsMethod.setAccessible(true);
        java.lang.Object[] getDimensionsMethodArguments = new java.lang.Object[0];
        int actual = ((int) getDimensionsMethod.invoke(type, getDimensionsMethodArguments));
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetDimensions5() throws Throwable  {
        Type type = ((Type) createInstance("com.alibaba.fastjson.asm.Type"));
        setField(type, "off", 0);
        char[] charArray = new char[11];
        charArray[1] = '[';
        setField(type, "buf", charArray);
        
        Class typeClazz = Class.forName("com.alibaba.fastjson.asm.Type");
        Method getDimensionsMethod = typeClazz.getDeclaredMethod("getDimensions");
        getDimensionsMethod.setAccessible(true);
        java.lang.Object[] getDimensionsMethodArguments = new java.lang.Object[0];
        int actual = ((int) getDimensionsMethod.invoke(type, getDimensionsMethodArguments));
        
        assertEquals(2, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetInternalName1() throws Throwable  {
        Type type = ((Type) createInstance("com.alibaba.fastjson.asm.Type"));
        
        type.getInternalName();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetInternalName2() throws Throwable  {
        Type type = ((Type) createInstance("com.alibaba.fastjson.asm.Type"));
        setField(type, "len", 0);
        setField(type, "off", 1);
        char[] charArray = new char[32];
        setField(type, "buf", charArray);
        
        String actual = type.getInternalName();
        
        String expected = new String("");
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetDescriptor1() throws Throwable  {
        Type type = ((Type) createInstance("com.alibaba.fastjson.asm.Type"));
        
        type.getDescriptor();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetDescriptor2() throws Throwable  {
        Type type = ((Type) createInstance("com.alibaba.fastjson.asm.Type"));
        setField(type, "len", 0);
        setField(type, "off", 1);
        char[] charArray = new char[32];
        setField(type, "buf", charArray);
        
        String actual = type.getDescriptor();
        
        String expected = new String("");
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetClassName1() throws Throwable  {
        Type type = ((Type) createInstance("com.alibaba.fastjson.asm.Type"));
        
        Class typeClazz = Class.forName("com.alibaba.fastjson.asm.Type");
        Method getClassNameMethod = typeClazz.getDeclaredMethod("getClassName");
        getClassNameMethod.setAccessible(true);
        java.lang.Object[] getClassNameMethodArguments = new java.lang.Object[0];
        String actual = ((String) getClassNameMethod.invoke(type, getClassNameMethodArguments));
        
        String expected = new String("void");
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetClassName2() throws Throwable  {
        Type type = ((Type) createInstance("com.alibaba.fastjson.asm.Type"));
        setField(type, "sort", 0);
        
        Class typeClazz = Class.forName("com.alibaba.fastjson.asm.Type");
        Method getClassNameMethod = typeClazz.getDeclaredMethod("getClassName");
        getClassNameMethod.setAccessible(true);
        java.lang.Object[] getClassNameMethodArguments = new java.lang.Object[0];
        String actual = ((String) getClassNameMethod.invoke(type, getClassNameMethodArguments));
        
        String expected = new String("void");
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetClassName3() throws Throwable  {
        Type type = ((Type) createInstance("com.alibaba.fastjson.asm.Type"));
        setField(type, "sort", 4);
        
        Class typeClazz = Class.forName("com.alibaba.fastjson.asm.Type");
        Method getClassNameMethod = typeClazz.getDeclaredMethod("getClassName");
        getClassNameMethod.setAccessible(true);
        java.lang.Object[] getClassNameMethodArguments = new java.lang.Object[0];
        String actual = ((String) getClassNameMethod.invoke(type, getClassNameMethodArguments));
        
        String expected = new String("short");
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetClassName4() throws Throwable  {
        Type type = ((Type) createInstance("com.alibaba.fastjson.asm.Type"));
        setField(type, "sort", 7);
        
        Class typeClazz = Class.forName("com.alibaba.fastjson.asm.Type");
        Method getClassNameMethod = typeClazz.getDeclaredMethod("getClassName");
        getClassNameMethod.setAccessible(true);
        java.lang.Object[] getClassNameMethodArguments = new java.lang.Object[0];
        String actual = ((String) getClassNameMethod.invoke(type, getClassNameMethodArguments));
        
        String expected = new String("long");
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetClassName5() throws Throwable  {
        Type type = ((Type) createInstance("com.alibaba.fastjson.asm.Type"));
        setField(type, "sort", 8);
        
        Class typeClazz = Class.forName("com.alibaba.fastjson.asm.Type");
        Method getClassNameMethod = typeClazz.getDeclaredMethod("getClassName");
        getClassNameMethod.setAccessible(true);
        java.lang.Object[] getClassNameMethodArguments = new java.lang.Object[0];
        String actual = ((String) getClassNameMethod.invoke(type, getClassNameMethodArguments));
        
        String expected = new String("double");
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetClassName6() throws Throwable  {
        Type type = ((Type) createInstance("com.alibaba.fastjson.asm.Type"));
        setField(type, "sort", 2);
        
        Class typeClazz = Class.forName("com.alibaba.fastjson.asm.Type");
        Method getClassNameMethod = typeClazz.getDeclaredMethod("getClassName");
        getClassNameMethod.setAccessible(true);
        java.lang.Object[] getClassNameMethodArguments = new java.lang.Object[0];
        String actual = ((String) getClassNameMethod.invoke(type, getClassNameMethodArguments));
        
        String expected = new String("char");
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetClassName7() throws Throwable  {
        Type type = ((Type) createInstance("com.alibaba.fastjson.asm.Type"));
        setField(type, "sort", 1);
        
        Class typeClazz = Class.forName("com.alibaba.fastjson.asm.Type");
        Method getClassNameMethod = typeClazz.getDeclaredMethod("getClassName");
        getClassNameMethod.setAccessible(true);
        java.lang.Object[] getClassNameMethodArguments = new java.lang.Object[0];
        String actual = ((String) getClassNameMethod.invoke(type, getClassNameMethodArguments));
        
        String expected = new String("boolean");
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetClassName8() throws Throwable  {
        Type type = ((Type) createInstance("com.alibaba.fastjson.asm.Type"));
        setField(type, "sort", 5);
        
        Class typeClazz = Class.forName("com.alibaba.fastjson.asm.Type");
        Method getClassNameMethod = typeClazz.getDeclaredMethod("getClassName");
        getClassNameMethod.setAccessible(true);
        java.lang.Object[] getClassNameMethodArguments = new java.lang.Object[0];
        String actual = ((String) getClassNameMethod.invoke(type, getClassNameMethodArguments));
        
        String expected = new String("int");
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetClassName9() throws Throwable  {
        Type type = ((Type) createInstance("com.alibaba.fastjson.asm.Type"));
        setField(type, "sort", 3);
        
        Class typeClazz = Class.forName("com.alibaba.fastjson.asm.Type");
        Method getClassNameMethod = typeClazz.getDeclaredMethod("getClassName");
        getClassNameMethod.setAccessible(true);
        java.lang.Object[] getClassNameMethodArguments = new java.lang.Object[0];
        String actual = ((String) getClassNameMethod.invoke(type, getClassNameMethodArguments));
        
        String expected = new String("byte");
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetClassName10() throws Throwable  {
        Type type = ((Type) createInstance("com.alibaba.fastjson.asm.Type"));
        setField(type, "sort", 6);
        
        Class typeClazz = Class.forName("com.alibaba.fastjson.asm.Type");
        Method getClassNameMethod = typeClazz.getDeclaredMethod("getClassName");
        getClassNameMethod.setAccessible(true);
        java.lang.Object[] getClassNameMethodArguments = new java.lang.Object[0];
        String actual = ((String) getClassNameMethod.invoke(type, getClassNameMethodArguments));
        
        String expected = new String("float");
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetClassName11() throws Throwable  {
        Type type = ((Type) createInstance("com.alibaba.fastjson.asm.Type"));
        setField(type, "off", 0);
        char[] charArray = new char[2];
        charArray[1] = 'G';
        setField(type, "buf", charArray);
        setField(type, "sort", 9);
        
        Class typeClazz = Class.forName("com.alibaba.fastjson.asm.Type");
        Method getClassNameMethod = typeClazz.getDeclaredMethod("getClassName");
        getClassNameMethod.setAccessible(true);
        java.lang.Object[] getClassNameMethodArguments = new java.lang.Object[0];
        try {
            getClassNameMethod.invoke(type, getClassNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetClassName12() throws Throwable  {
        Type type = ((Type) createInstance("com.alibaba.fastjson.asm.Type"));
        setField(type, "off", 0);
        char[] charArray = new char[2];
        charArray[1] = 'Q';
        setField(type, "buf", charArray);
        setField(type, "sort", 9);
        
        Class typeClazz = Class.forName("com.alibaba.fastjson.asm.Type");
        Method getClassNameMethod = typeClazz.getDeclaredMethod("getClassName");
        getClassNameMethod.setAccessible(true);
        java.lang.Object[] getClassNameMethodArguments = new java.lang.Object[0];
        try {
            getClassNameMethod.invoke(type, getClassNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetClassName13() throws Throwable  {
        Type type = ((Type) createInstance("com.alibaba.fastjson.asm.Type"));
        setField(type, "off", 0);
        char[] charArray = new char[2];
        charArray[1] = 'R';
        setField(type, "buf", charArray);
        setField(type, "sort", 9);
        
        Class typeClazz = Class.forName("com.alibaba.fastjson.asm.Type");
        Method getClassNameMethod = typeClazz.getDeclaredMethod("getClassName");
        getClassNameMethod.setAccessible(true);
        java.lang.Object[] getClassNameMethodArguments = new java.lang.Object[0];
        try {
            getClassNameMethod.invoke(type, getClassNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetClassName14() throws Throwable  {
        Type type = ((Type) createInstance("com.alibaba.fastjson.asm.Type"));
        setField(type, "off", 0);
        char[] charArray = new char[2];
        charArray[1] = 'Y';
        setField(type, "buf", charArray);
        setField(type, "sort", 9);
        
        Class typeClazz = Class.forName("com.alibaba.fastjson.asm.Type");
        Method getClassNameMethod = typeClazz.getDeclaredMethod("getClassName");
        getClassNameMethod.setAccessible(true);
        java.lang.Object[] getClassNameMethodArguments = new java.lang.Object[0];
        try {
            getClassNameMethod.invoke(type, getClassNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetClassName15() throws Throwable  {
        Type type = ((Type) createInstance("com.alibaba.fastjson.asm.Type"));
        setField(type, "off", 0);
        char[] charArray = new char[2];
        charArray[1] = 'T';
        setField(type, "buf", charArray);
        setField(type, "sort", 9);
        
        Class typeClazz = Class.forName("com.alibaba.fastjson.asm.Type");
        Method getClassNameMethod = typeClazz.getDeclaredMethod("getClassName");
        getClassNameMethod.setAccessible(true);
        java.lang.Object[] getClassNameMethodArguments = new java.lang.Object[0];
        try {
            getClassNameMethod.invoke(type, getClassNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetClassName16() throws Throwable  {
        Type type = ((Type) createInstance("com.alibaba.fastjson.asm.Type"));
        setField(type, "off", 0);
        char[] charArray = new char[2];
        charArray[1] = '\\';
        setField(type, "buf", charArray);
        setField(type, "sort", 9);
        
        Class typeClazz = Class.forName("com.alibaba.fastjson.asm.Type");
        Method getClassNameMethod = typeClazz.getDeclaredMethod("getClassName");
        getClassNameMethod.setAccessible(true);
        java.lang.Object[] getClassNameMethodArguments = new java.lang.Object[0];
        try {
            getClassNameMethod.invoke(type, getClassNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetClassName17() throws Throwable  {
        Type type = ((Type) createInstance("com.alibaba.fastjson.asm.Type"));
        setField(type, "off", 0);
        char[] charArray = new char[2];
        charArray[1] = 'P';
        setField(type, "buf", charArray);
        setField(type, "sort", 9);
        
        Class typeClazz = Class.forName("com.alibaba.fastjson.asm.Type");
        Method getClassNameMethod = typeClazz.getDeclaredMethod("getClassName");
        getClassNameMethod.setAccessible(true);
        java.lang.Object[] getClassNameMethodArguments = new java.lang.Object[0];
        try {
            getClassNameMethod.invoke(type, getClassNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetClassName18() throws Throwable  {
        Type type = ((Type) createInstance("com.alibaba.fastjson.asm.Type"));
        setField(type, "off", 0);
        char[] charArray = new char[2];
        charArray[1] = 'O';
        setField(type, "buf", charArray);
        setField(type, "sort", 9);
        
        Class typeClazz = Class.forName("com.alibaba.fastjson.asm.Type");
        Method getClassNameMethod = typeClazz.getDeclaredMethod("getClassName");
        getClassNameMethod.setAccessible(true);
        java.lang.Object[] getClassNameMethodArguments = new java.lang.Object[0];
        try {
            getClassNameMethod.invoke(type, getClassNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetClassName19() throws Throwable  {
        Type type = ((Type) createInstance("com.alibaba.fastjson.asm.Type"));
        setField(type, "off", Integer.MAX_VALUE);
        char[] charArray = new char[9];
        setField(type, "buf", charArray);
        setField(type, "sort", 9);
        
        Class typeClazz = Class.forName("com.alibaba.fastjson.asm.Type");
        Method getClassNameMethod = typeClazz.getDeclaredMethod("getClassName");
        getClassNameMethod.setAccessible(true);
        java.lang.Object[] getClassNameMethodArguments = new java.lang.Object[0];
        try {
            getClassNameMethod.invoke(type, getClassNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetClassName20() throws Throwable  {
        Type type = ((Type) createInstance("com.alibaba.fastjson.asm.Type"));
        setField(type, "off", 0);
        char[] charArray = new char[2];
        charArray[1] = 'U';
        setField(type, "buf", charArray);
        setField(type, "sort", 9);
        
        Class typeClazz = Class.forName("com.alibaba.fastjson.asm.Type");
        Method getClassNameMethod = typeClazz.getDeclaredMethod("getClassName");
        getClassNameMethod.setAccessible(true);
        java.lang.Object[] getClassNameMethodArguments = new java.lang.Object[0];
        try {
            getClassNameMethod.invoke(type, getClassNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetClassName21() throws Throwable  {
        Type type = ((Type) createInstance("com.alibaba.fastjson.asm.Type"));
        setField(type, "off", 0);
        char[] charArray = new char[3];
        charArray[1] = 'G';
        setField(type, "buf", charArray);
        setField(type, "sort", 9);
        
        Class typeClazz = Class.forName("com.alibaba.fastjson.asm.Type");
        Method getClassNameMethod = typeClazz.getDeclaredMethod("getClassName");
        getClassNameMethod.setAccessible(true);
        java.lang.Object[] getClassNameMethodArguments = new java.lang.Object[0];
        try {
            getClassNameMethod.invoke(type, getClassNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetClassName22() throws Throwable  {
        Type type = ((Type) createInstance("com.alibaba.fastjson.asm.Type"));
        setField(type, "off", 0);
        char[] charArray = new char[2];
        charArray[1] = 'H';
        setField(type, "buf", charArray);
        setField(type, "sort", 9);
        
        Class typeClazz = Class.forName("com.alibaba.fastjson.asm.Type");
        Method getClassNameMethod = typeClazz.getDeclaredMethod("getClassName");
        getClassNameMethod.setAccessible(true);
        java.lang.Object[] getClassNameMethodArguments = new java.lang.Object[0];
        try {
            getClassNameMethod.invoke(type, getClassNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetClassName23() throws Throwable  {
        Type type = ((Type) createInstance("com.alibaba.fastjson.asm.Type"));
        setField(type, "off", 1073741825);
        char[] charArray = new char[11];
        setField(type, "buf", charArray);
        setField(type, "sort", 9);
        
        Class typeClazz = Class.forName("com.alibaba.fastjson.asm.Type");
        Method getClassNameMethod = typeClazz.getDeclaredMethod("getClassName");
        getClassNameMethod.setAccessible(true);
        java.lang.Object[] getClassNameMethodArguments = new java.lang.Object[0];
        try {
            getClassNameMethod.invoke(type, getClassNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetClassName24() throws Throwable  {
        Type type = ((Type) createInstance("com.alibaba.fastjson.asm.Type"));
        setField(type, "off", 0);
        char[] charArray = new char[2];
        charArray[1] = 'W';
        setField(type, "buf", charArray);
        setField(type, "sort", 9);
        
        Class typeClazz = Class.forName("com.alibaba.fastjson.asm.Type");
        Method getClassNameMethod = typeClazz.getDeclaredMethod("getClassName");
        getClassNameMethod.setAccessible(true);
        java.lang.Object[] getClassNameMethodArguments = new java.lang.Object[0];
        try {
            getClassNameMethod.invoke(type, getClassNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetClassName25() throws Throwable  {
        Type type = ((Type) createInstance("com.alibaba.fastjson.asm.Type"));
        setField(type, "off", 0);
        char[] charArray = new char[2];
        charArray[1] = 'L';
        setField(type, "buf", charArray);
        setField(type, "sort", 9);
        
        Class typeClazz = Class.forName("com.alibaba.fastjson.asm.Type");
        Method getClassNameMethod = typeClazz.getDeclaredMethod("getClassName");
        getClassNameMethod.setAccessible(true);
        java.lang.Object[] getClassNameMethodArguments = new java.lang.Object[0];
        try {
            getClassNameMethod.invoke(type, getClassNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetClassName26() throws Throwable  {
        Type type = ((Type) createInstance("com.alibaba.fastjson.asm.Type"));
        setField(type, "off", 0);
        char[] charArray = new char[3];
        charArray[1] = 'M';
        setField(type, "buf", charArray);
        setField(type, "sort", 9);
        
        Class typeClazz = Class.forName("com.alibaba.fastjson.asm.Type");
        Method getClassNameMethod = typeClazz.getDeclaredMethod("getClassName");
        getClassNameMethod.setAccessible(true);
        java.lang.Object[] getClassNameMethodArguments = new java.lang.Object[0];
        try {
            getClassNameMethod.invoke(type, getClassNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetArgumentsAndReturnSizes1() throws Throwable  {
        String string = new String();
        
        Type.getArgumentsAndReturnSizes(string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetArgumentsAndReturnSizes2() throws Throwable  {
        Type.getArgumentsAndReturnSizes(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetArgumentsAndReturnSizes3() throws Throwable  {
        String string = new String("");
        
        Type.getArgumentsAndReturnSizes(string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetArgumentsAndReturnSizes4() throws Throwable  {
        String string = new String("\u0000)D");
        
        int actual = Type.getArgumentsAndReturnSizes(string);
        
        assertEquals(6, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetArgumentsAndReturnSizes5() throws Throwable  {
        String string = new String("\u0000)\u0000");
        
        int actual = Type.getArgumentsAndReturnSizes(string);
        
        assertEquals(5, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetArgumentsAndReturnSizes6() throws Throwable  {
        String string = new String("\u0000)V");
        
        int actual = Type.getArgumentsAndReturnSizes(string);
        
        assertEquals(4, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetArgumentsAndReturnSizes7() throws Throwable  {
        String string = new String("\u0000)J");
        
        int actual = Type.getArgumentsAndReturnSizes(string);
        
        assertEquals(6, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetArgumentsAndReturnSizes8() throws Throwable  {
        String string = new String("\u0000L");
        
        Type.getArgumentsAndReturnSizes(string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetArgumentsAndReturnSizes9() throws Throwable  {
        String string = new String("\u0000\u0000");
        
        Type.getArgumentsAndReturnSizes(string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetArgumentsAndReturnSizes10() throws Throwable  {
        String string = new String("\u0000J");
        
        Type.getArgumentsAndReturnSizes(string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetArgumentsAndReturnSizes11() throws Throwable  {
        String string = new String("\u0000D");
        
        Type.getArgumentsAndReturnSizes(string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetArgumentsAndReturnSizes12() throws Throwable  {
        String string = new String("\u0000L\u0000");
        
        Type.getArgumentsAndReturnSizes(string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetArgumentsAndReturnSizes13() throws Throwable  {
        String string = new String("\u0000L;");
        
        Type.getArgumentsAndReturnSizes(string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetArgumentTypes1() throws Throwable  {
        String string = new String();
        
        Type.getArgumentTypes(string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetArgumentTypes2() throws Throwable  {
        Type.getArgumentTypes(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetArgumentTypes3() throws Throwable  {
        String string = new String("");
        
        Type.getArgumentTypes(string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetArgumentTypes4() throws Throwable  {
        String string = new String("\u0000L");
        
        Type.getArgumentTypes(string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetArgumentTypes5() throws Throwable  {
        String string = new String("\u0000)");
        
        com.alibaba.fastjson.asm.Type[] actual = Type.getArgumentTypes(string);
        
        com.alibaba.fastjson.asm.Type[] expected = new com.alibaba.fastjson.asm.Type[0];
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetArgumentTypes6() throws Throwable  {
        String string = new String("\u0000\u0000");
        
        Type.getArgumentTypes(string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetArgumentTypes7() throws Throwable  {
        String string = new String("\u0000L;");
        
        Type.getArgumentTypes(string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetArgumentTypes8() throws Throwable  {
        String string = new String("\u0000[");
        
        Type.getArgumentTypes(string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetArgumentTypes9() throws Throwable  {
        String string = new String("\u0000P)");
        
        Type.getArgumentTypes(string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetArgumentTypes10() throws Throwable  {
        String string = new String("\u0000K)");
        
        Type.getArgumentTypes(string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetArgumentTypes11() throws Throwable  {
        String string = new String("\u0000L\u0000");
        
        Type.getArgumentTypes(string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetArgumentTypes12() throws Throwable  {
        String string = new String("\u0000G)");
        
        Type.getArgumentTypes(string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetArgumentTypes13() throws Throwable  {
        String string = new String("\u0000X)");
        
        Type.getArgumentTypes(string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetArgumentTypes14() throws Throwable  {
        String string = new String("\u0000W)");
        
        Type.getArgumentTypes(string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetArgumentTypes15() throws Throwable  {
        String string = new String("\u0000M)");
        
        Type.getArgumentTypes(string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetArgumentTypes16() throws Throwable  {
        String string = new String("\u0000O)");
        
        Type.getArgumentTypes(string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetArgumentTypes17() throws Throwable  {
        String string = new String("\u0000N)");
        
        Type.getArgumentTypes(string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetArgumentTypes18() throws Throwable  {
        String string = new String("\u0000H)");
        
        Type.getArgumentTypes(string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetArgumentTypes19() throws Throwable  {
        String string = new String("\u0000U)");
        
        Type.getArgumentTypes(string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetArgumentTypes20() throws Throwable  {
        String string = new String("\u0000Q)");
        
        Type.getArgumentTypes(string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetArgumentTypes21() throws Throwable  {
        String string = new String("\u0000P);");
        
        Type.getArgumentTypes(string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetArgumentTypes22() throws Throwable  {
        String string = new String("\u0000\u0000)");
        
        Type.getArgumentTypes(string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetArgumentTypes23() throws Throwable  {
        String string = new String("\u0000Y)");
        
        Type.getArgumentTypes(string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetArgumentTypes24() throws Throwable  {
        String string = new String("\u0000L;)\u0000\u0000\u0000");
        
        com.alibaba.fastjson.asm.Type[] actual = Type.getArgumentTypes(string);
        
        com.alibaba.fastjson.asm.Type[] expected = new com.alibaba.fastjson.asm.Type[1];
        Type type = ((Type) createInstance("com.alibaba.fastjson.asm.Type"));
        setField(type, "len", 0);
        setField(type, "off", 2);
        char[] charArray = new char[7];
        charArray[1] = 'L';
        charArray[2] = ';';
        charArray[3] = ')';
        setField(type, "buf", charArray);
        setField(type, "sort", 10);
        expected[0] = type;
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetArgumentTypes25() throws Throwable  {
        String string = new String("\u0000E)");
        
        Type.getArgumentTypes(string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetArgumentTypes26() throws Throwable  {
        String string = new String("\u0000T)");
        
        Type.getArgumentTypes(string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetArgumentTypes27() throws Throwable  {
        String string = new String("\u0000R)\u0000");
        
        Type.getArgumentTypes(string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetArgumentTypes28() throws Throwable  {
        String string = new String("\u0000[)");
        
        Type.getArgumentTypes(string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetType1() throws Throwable  {
        char[] charArray = new char[0];
        
        Class typeClazz = Class.forName("com.alibaba.fastjson.asm.Type");
        Class charArrayType = Class.forName("[C");
        Class intType = int.class;
        Method getTypeMethod = typeClazz.getDeclaredMethod("getType", charArrayType, intType);
        getTypeMethod.setAccessible(true);
        java.lang.Object[] getTypeMethodArguments = new java.lang.Object[2];
        getTypeMethodArguments[0] = ((Object) charArray);
        getTypeMethodArguments[1] = 0;
        try {
            getTypeMethod.invoke(null, getTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetType2() throws Throwable  {
        Class typeClazz = Class.forName("com.alibaba.fastjson.asm.Type");
        Class charArrayType = Class.forName("[C");
        Class intType = int.class;
        Method getTypeMethod = typeClazz.getDeclaredMethod("getType", charArrayType, intType);
        getTypeMethod.setAccessible(true);
        java.lang.Object[] getTypeMethodArguments = new java.lang.Object[2];
        getTypeMethodArguments[0] = null;
        getTypeMethodArguments[1] = 0;
        try {
            getTypeMethod.invoke(null, getTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetType3() throws Throwable  {
        char[] charArray = new char[9];
        charArray[8] = 'M';
        
        Class typeClazz = Class.forName("com.alibaba.fastjson.asm.Type");
        Class charArrayType = Class.forName("[C");
        Class intType = int.class;
        Method getTypeMethod = typeClazz.getDeclaredMethod("getType", charArrayType, intType);
        getTypeMethod.setAccessible(true);
        java.lang.Object[] getTypeMethodArguments = new java.lang.Object[2];
        getTypeMethodArguments[0] = ((Object) charArray);
        getTypeMethodArguments[1] = 8;
        try {
            getTypeMethod.invoke(null, getTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetType4() throws Throwable  {
        char[] charArray = new char[9];
        charArray[8] = 'U';
        
        Class typeClazz = Class.forName("com.alibaba.fastjson.asm.Type");
        Class charArrayType = Class.forName("[C");
        Class intType = int.class;
        Method getTypeMethod = typeClazz.getDeclaredMethod("getType", charArrayType, intType);
        getTypeMethod.setAccessible(true);
        java.lang.Object[] getTypeMethodArguments = new java.lang.Object[2];
        getTypeMethodArguments[0] = ((Object) charArray);
        getTypeMethodArguments[1] = 8;
        try {
            getTypeMethod.invoke(null, getTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetType5() throws Throwable  {
        char[] charArray = new char[9];
        charArray[8] = 'T';
        
        Class typeClazz = Class.forName("com.alibaba.fastjson.asm.Type");
        Class charArrayType = Class.forName("[C");
        Class intType = int.class;
        Method getTypeMethod = typeClazz.getDeclaredMethod("getType", charArrayType, intType);
        getTypeMethod.setAccessible(true);
        java.lang.Object[] getTypeMethodArguments = new java.lang.Object[2];
        getTypeMethodArguments[0] = ((Object) charArray);
        getTypeMethodArguments[1] = 8;
        try {
            getTypeMethod.invoke(null, getTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetType6() throws Throwable  {
        char[] charArray = new char[9];
        
        Class typeClazz = Class.forName("com.alibaba.fastjson.asm.Type");
        Class charArrayType = Class.forName("[C");
        Class intType = int.class;
        Method getTypeMethod = typeClazz.getDeclaredMethod("getType", charArrayType, intType);
        getTypeMethod.setAccessible(true);
        java.lang.Object[] getTypeMethodArguments = new java.lang.Object[2];
        getTypeMethodArguments[0] = ((Object) charArray);
        getTypeMethodArguments[1] = Integer.MIN_VALUE;
        try {
            getTypeMethod.invoke(null, getTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetType7() throws Throwable  {
        char[] charArray = new char[9];
        charArray[8] = 'O';
        
        Class typeClazz = Class.forName("com.alibaba.fastjson.asm.Type");
        Class charArrayType = Class.forName("[C");
        Class intType = int.class;
        Method getTypeMethod = typeClazz.getDeclaredMethod("getType", charArrayType, intType);
        getTypeMethod.setAccessible(true);
        java.lang.Object[] getTypeMethodArguments = new java.lang.Object[2];
        getTypeMethodArguments[0] = ((Object) charArray);
        getTypeMethodArguments[1] = 8;
        try {
            getTypeMethod.invoke(null, getTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetType8() throws Throwable  {
        char[] charArray = new char[9];
        charArray[8] = 'H';
        
        Class typeClazz = Class.forName("com.alibaba.fastjson.asm.Type");
        Class charArrayType = Class.forName("[C");
        Class intType = int.class;
        Method getTypeMethod = typeClazz.getDeclaredMethod("getType", charArrayType, intType);
        getTypeMethod.setAccessible(true);
        java.lang.Object[] getTypeMethodArguments = new java.lang.Object[2];
        getTypeMethodArguments[0] = ((Object) charArray);
        getTypeMethodArguments[1] = 8;
        try {
            getTypeMethod.invoke(null, getTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetType9() throws Throwable  {
        char[] charArray = new char[9];
        charArray[8] = 'W';
        
        Class typeClazz = Class.forName("com.alibaba.fastjson.asm.Type");
        Class charArrayType = Class.forName("[C");
        Class intType = int.class;
        Method getTypeMethod = typeClazz.getDeclaredMethod("getType", charArrayType, intType);
        getTypeMethod.setAccessible(true);
        java.lang.Object[] getTypeMethodArguments = new java.lang.Object[2];
        getTypeMethodArguments[0] = ((Object) charArray);
        getTypeMethodArguments[1] = 8;
        try {
            getTypeMethod.invoke(null, getTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetType10() throws Throwable  {
        char[] charArray = new char[9];
        charArray[8] = 'P';
        
        Class typeClazz = Class.forName("com.alibaba.fastjson.asm.Type");
        Class charArrayType = Class.forName("[C");
        Class intType = int.class;
        Method getTypeMethod = typeClazz.getDeclaredMethod("getType", charArrayType, intType);
        getTypeMethod.setAccessible(true);
        java.lang.Object[] getTypeMethodArguments = new java.lang.Object[2];
        getTypeMethodArguments[0] = ((Object) charArray);
        getTypeMethodArguments[1] = 8;
        try {
            getTypeMethod.invoke(null, getTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetType11() throws Throwable  {
        char[] charArray = new char[9];
        charArray[8] = 'Q';
        
        Class typeClazz = Class.forName("com.alibaba.fastjson.asm.Type");
        Class charArrayType = Class.forName("[C");
        Class intType = int.class;
        Method getTypeMethod = typeClazz.getDeclaredMethod("getType", charArrayType, intType);
        getTypeMethod.setAccessible(true);
        java.lang.Object[] getTypeMethodArguments = new java.lang.Object[2];
        getTypeMethodArguments[0] = ((Object) charArray);
        getTypeMethodArguments[1] = 8;
        try {
            getTypeMethod.invoke(null, getTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetType12() throws Throwable  {
        char[] charArray = new char[9];
        charArray[8] = '\\';
        
        Class typeClazz = Class.forName("com.alibaba.fastjson.asm.Type");
        Class charArrayType = Class.forName("[C");
        Class intType = int.class;
        Method getTypeMethod = typeClazz.getDeclaredMethod("getType", charArrayType, intType);
        getTypeMethod.setAccessible(true);
        java.lang.Object[] getTypeMethodArguments = new java.lang.Object[2];
        getTypeMethodArguments[0] = ((Object) charArray);
        getTypeMethodArguments[1] = 8;
        try {
            getTypeMethod.invoke(null, getTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetType13() throws Throwable  {
        char[] charArray = new char[9];
        charArray[8] = 'Y';
        
        Class typeClazz = Class.forName("com.alibaba.fastjson.asm.Type");
        Class charArrayType = Class.forName("[C");
        Class intType = int.class;
        Method getTypeMethod = typeClazz.getDeclaredMethod("getType", charArrayType, intType);
        getTypeMethod.setAccessible(true);
        java.lang.Object[] getTypeMethodArguments = new java.lang.Object[2];
        getTypeMethodArguments[0] = ((Object) charArray);
        getTypeMethodArguments[1] = 8;
        try {
            getTypeMethod.invoke(null, getTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetType14() throws Throwable  {
        char[] charArray = new char[9];
        
        Class typeClazz = Class.forName("com.alibaba.fastjson.asm.Type");
        Class charArrayType = Class.forName("[C");
        Class intType = int.class;
        Method getTypeMethod = typeClazz.getDeclaredMethod("getType", charArrayType, intType);
        getTypeMethod.setAccessible(true);
        java.lang.Object[] getTypeMethodArguments = new java.lang.Object[2];
        getTypeMethodArguments[0] = ((Object) charArray);
        getTypeMethodArguments[1] = 1073741824;
        try {
            getTypeMethod.invoke(null, getTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetType15() throws Throwable  {
        char[] charArray = new char[9];
        charArray[8] = '[';
        
        Class typeClazz = Class.forName("com.alibaba.fastjson.asm.Type");
        Class charArrayType = Class.forName("[C");
        Class intType = int.class;
        Method getTypeMethod = typeClazz.getDeclaredMethod("getType", charArrayType, intType);
        getTypeMethod.setAccessible(true);
        java.lang.Object[] getTypeMethodArguments = new java.lang.Object[2];
        getTypeMethodArguments[0] = ((Object) charArray);
        getTypeMethodArguments[1] = 8;
        try {
            getTypeMethod.invoke(null, getTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetType16() throws Throwable  {
        char[] charArray = new char[9];
        charArray[8] = 'G';
        
        Class typeClazz = Class.forName("com.alibaba.fastjson.asm.Type");
        Class charArrayType = Class.forName("[C");
        Class intType = int.class;
        Method getTypeMethod = typeClazz.getDeclaredMethod("getType", charArrayType, intType);
        getTypeMethod.setAccessible(true);
        java.lang.Object[] getTypeMethodArguments = new java.lang.Object[2];
        getTypeMethodArguments[0] = ((Object) charArray);
        getTypeMethodArguments[1] = 8;
        try {
            getTypeMethod.invoke(null, getTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetType17() throws Throwable  {
        char[] charArray = new char[9];
        charArray[8] = 'L';
        
        Class typeClazz = Class.forName("com.alibaba.fastjson.asm.Type");
        Class charArrayType = Class.forName("[C");
        Class intType = int.class;
        Method getTypeMethod = typeClazz.getDeclaredMethod("getType", charArrayType, intType);
        getTypeMethod.setAccessible(true);
        java.lang.Object[] getTypeMethodArguments = new java.lang.Object[2];
        getTypeMethodArguments[0] = ((Object) charArray);
        getTypeMethodArguments[1] = 8;
        try {
            getTypeMethod.invoke(null, getTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetType18() throws Throwable  {
        char[] charArray = new char[9];
        charArray[8] = 'R';
        
        Class typeClazz = Class.forName("com.alibaba.fastjson.asm.Type");
        Class charArrayType = Class.forName("[C");
        Class intType = int.class;
        Method getTypeMethod = typeClazz.getDeclaredMethod("getType", charArrayType, intType);
        getTypeMethod.setAccessible(true);
        java.lang.Object[] getTypeMethodArguments = new java.lang.Object[2];
        getTypeMethodArguments[0] = ((Object) charArray);
        getTypeMethodArguments[1] = 8;
        try {
            getTypeMethod.invoke(null, getTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetType19() throws Throwable  {
        char[] charArray = new char[9];
        charArray[8] = 'N';
        
        Class typeClazz = Class.forName("com.alibaba.fastjson.asm.Type");
        Class charArrayType = Class.forName("[C");
        Class intType = int.class;
        Method getTypeMethod = typeClazz.getDeclaredMethod("getType", charArrayType, intType);
        getTypeMethod.setAccessible(true);
        java.lang.Object[] getTypeMethodArguments = new java.lang.Object[2];
        getTypeMethodArguments[0] = ((Object) charArray);
        getTypeMethodArguments[1] = 8;
        try {
            getTypeMethod.invoke(null, getTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetType20() throws Throwable  {
        char[] charArray = new char[9];
        charArray[8] = 'X';
        
        Class typeClazz = Class.forName("com.alibaba.fastjson.asm.Type");
        Class charArrayType = Class.forName("[C");
        Class intType = int.class;
        Method getTypeMethod = typeClazz.getDeclaredMethod("getType", charArrayType, intType);
        getTypeMethod.setAccessible(true);
        java.lang.Object[] getTypeMethodArguments = new java.lang.Object[2];
        getTypeMethodArguments[0] = ((Object) charArray);
        getTypeMethodArguments[1] = 8;
        try {
            getTypeMethod.invoke(null, getTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetType21() throws Throwable  {
        char[] charArray = new char[9];
        charArray[8] = 'E';
        
        Class typeClazz = Class.forName("com.alibaba.fastjson.asm.Type");
        Class charArrayType = Class.forName("[C");
        Class intType = int.class;
        Method getTypeMethod = typeClazz.getDeclaredMethod("getType", charArrayType, intType);
        getTypeMethod.setAccessible(true);
        java.lang.Object[] getTypeMethodArguments = new java.lang.Object[2];
        getTypeMethodArguments[0] = ((Object) charArray);
        getTypeMethodArguments[1] = 8;
        try {
            getTypeMethod.invoke(null, getTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetType22() throws Throwable  {
        char[] charArray = new char[9];
        charArray[8] = 'K';
        
        Class typeClazz = Class.forName("com.alibaba.fastjson.asm.Type");
        Class charArrayType = Class.forName("[C");
        Class intType = int.class;
        Method getTypeMethod = typeClazz.getDeclaredMethod("getType", charArrayType, intType);
        getTypeMethod.setAccessible(true);
        java.lang.Object[] getTypeMethodArguments = new java.lang.Object[2];
        getTypeMethodArguments[0] = ((Object) charArray);
        getTypeMethodArguments[1] = 8;
        try {
            getTypeMethod.invoke(null, getTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetType23() throws Throwable  {
        char[] charArray = new char[9];
        charArray[7] = '[';
        charArray[8] = 'L';
        
        Class typeClazz = Class.forName("com.alibaba.fastjson.asm.Type");
        Class charArrayType = Class.forName("[C");
        Class intType = int.class;
        Method getTypeMethod = typeClazz.getDeclaredMethod("getType", charArrayType, intType);
        getTypeMethod.setAccessible(true);
        java.lang.Object[] getTypeMethodArguments = new java.lang.Object[2];
        getTypeMethodArguments[0] = ((Object) charArray);
        getTypeMethodArguments[1] = 7;
        try {
            getTypeMethod.invoke(null, getTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetType24() throws Throwable  {
        char[] charArray = new char[9];
        charArray[7] = 'H';
        
        Class typeClazz = Class.forName("com.alibaba.fastjson.asm.Type");
        Class charArrayType = Class.forName("[C");
        Class intType = int.class;
        Method getTypeMethod = typeClazz.getDeclaredMethod("getType", charArrayType, intType);
        getTypeMethod.setAccessible(true);
        java.lang.Object[] getTypeMethodArguments = new java.lang.Object[2];
        getTypeMethodArguments[0] = ((Object) charArray);
        getTypeMethodArguments[1] = 7;
        try {
            getTypeMethod.invoke(null, getTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetType25() throws Throwable  {
        char[] charArray = new char[11];
        charArray[1] = 'P';
        charArray[2] = ';';
        
        Class typeClazz = Class.forName("com.alibaba.fastjson.asm.Type");
        Class charArrayType = Class.forName("[C");
        Class intType = int.class;
        Method getTypeMethod = typeClazz.getDeclaredMethod("getType", charArrayType, intType);
        getTypeMethod.setAccessible(true);
        java.lang.Object[] getTypeMethodArguments = new java.lang.Object[2];
        getTypeMethodArguments[0] = ((Object) charArray);
        getTypeMethodArguments[1] = 1;
        Type actual = ((Type) getTypeMethod.invoke(null, getTypeMethodArguments));
        
        Type expected = ((Type) createInstance("com.alibaba.fastjson.asm.Type"));
        setField(expected, "len", 0);
        setField(expected, "off", 2);
        setField(expected, "buf", charArray);
        setField(expected, "sort", 10);
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetType26() throws Throwable  {
        char[] charArray = new char[11];
        charArray[0] = '[';
        charArray[1] = 'L';
        charArray[2] = ';';
        
        Class typeClazz = Class.forName("com.alibaba.fastjson.asm.Type");
        Class charArrayType = Class.forName("[C");
        Class intType = int.class;
        Method getTypeMethod = typeClazz.getDeclaredMethod("getType", charArrayType, intType);
        getTypeMethod.setAccessible(true);
        java.lang.Object[] getTypeMethodArguments = new java.lang.Object[2];
        getTypeMethodArguments[0] = ((Object) charArray);
        getTypeMethodArguments[1] = 0;
        Type actual = ((Type) getTypeMethod.invoke(null, getTypeMethodArguments));
        
        Type expected = ((Type) createInstance("com.alibaba.fastjson.asm.Type"));
        setField(expected, "len", 3);
        setField(expected, "off", 0);
        setField(expected, "buf", charArray);
        setField(expected, "sort", 9);
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetType27() throws Throwable  {
        char[] charArray = new char[11];
        charArray[0] = '[';
        
        Class typeClazz = Class.forName("com.alibaba.fastjson.asm.Type");
        Class charArrayType = Class.forName("[C");
        Class intType = int.class;
        Method getTypeMethod = typeClazz.getDeclaredMethod("getType", charArrayType, intType);
        getTypeMethod.setAccessible(true);
        java.lang.Object[] getTypeMethodArguments = new java.lang.Object[2];
        getTypeMethodArguments[0] = ((Object) charArray);
        getTypeMethodArguments[1] = 0;
        Type actual = ((Type) getTypeMethod.invoke(null, getTypeMethodArguments));
        
        Type expected = ((Type) createInstance("com.alibaba.fastjson.asm.Type"));
        setField(expected, "len", 2);
        setField(expected, "off", 0);
        setField(expected, "buf", charArray);
        setField(expected, "sort", 9);
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetType28() throws Throwable  {
        char[] charArray = new char[9];
        charArray[6] = '[';
        charArray[7] = 'L';
        
        Class typeClazz = Class.forName("com.alibaba.fastjson.asm.Type");
        Class charArrayType = Class.forName("[C");
        Class intType = int.class;
        Method getTypeMethod = typeClazz.getDeclaredMethod("getType", charArrayType, intType);
        getTypeMethod.setAccessible(true);
        java.lang.Object[] getTypeMethodArguments = new java.lang.Object[2];
        getTypeMethodArguments[0] = ((Object) charArray);
        getTypeMethodArguments[1] = 6;
        try {
            getTypeMethod.invoke(null, getTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetType29() throws Throwable  {
        char[] charArray = new char[9];
        charArray[6] = '[';
        charArray[7] = '[';
        charArray[8] = 'L';
        
        Class typeClazz = Class.forName("com.alibaba.fastjson.asm.Type");
        Class charArrayType = Class.forName("[C");
        Class intType = int.class;
        Method getTypeMethod = typeClazz.getDeclaredMethod("getType", charArrayType, intType);
        getTypeMethod.setAccessible(true);
        java.lang.Object[] getTypeMethodArguments = new java.lang.Object[2];
        getTypeMethodArguments[0] = ((Object) charArray);
        getTypeMethodArguments[1] = 6;
        try {
            getTypeMethod.invoke(null, getTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetType30() throws Throwable  {
        String string = new String();
        
        Type.getType(string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetType31() throws Throwable  {
        Type.getType(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetType32() throws Throwable  {
        String string = new String("[");
        
        Type.getType(string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetType33() throws Throwable  {
        String string = new String("");
        
        Type.getType(string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetType34() throws Throwable  {
        String string = new String("X");
        
        Type.getType(string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetType35() throws Throwable  {
        String string = new String("W");
        
        Type.getType(string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetType36() throws Throwable  {
        String string = new String("Q");
        
        Type.getType(string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetType37() throws Throwable  {
        String string = new String("K");
        
        Type.getType(string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetType38() throws Throwable  {
        String string = new String("\\");
        
        Type.getType(string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetType39() throws Throwable  {
        String string = new String("M");
        
        Type.getType(string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetType40() throws Throwable  {
        String string = new String("Y");
        
        Type.getType(string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetType41() throws Throwable  {
        String string = new String("E");
        
        Type.getType(string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetType42() throws Throwable  {
        String string = new String("P");
        
        Type.getType(string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetType43() throws Throwable  {
        String string = new String("L");
        
        Type.getType(string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetType44() throws Throwable  {
        String string = new String("N\u0000");
        
        Type.getType(string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetType45() throws Throwable  {
        String string = new String("O");
        
        Type.getType(string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetType46() throws Throwable  {
        String string = new String("T");
        
        Type.getType(string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetType47() throws Throwable  {
        String string = new String("G");
        
        Type.getType(string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetType48() throws Throwable  {
        String string = new String("H");
        
        Type.getType(string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetType49() throws Throwable  {
        String string = new String("[\u0000");
        
        Type actual = Type.getType(string);
        
        Type expected = ((Type) createInstance("com.alibaba.fastjson.asm.Type"));
        setField(expected, "len", 2);
        setField(expected, "off", 0);
        char[] charArray = new char[2];
        charArray[0] = '[';
        setField(expected, "buf", charArray);
        setField(expected, "sort", 9);
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetType50() throws Throwable  {
        String string = new String("P;");
        
        Type actual = Type.getType(string);
        
        Type expected = ((Type) createInstance("com.alibaba.fastjson.asm.Type"));
        setField(expected, "len", 0);
        setField(expected, "off", 1);
        char[] charArray = new char[2];
        charArray[0] = 'P';
        charArray[1] = ';';
        setField(expected, "buf", charArray);
        setField(expected, "sort", 10);
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetType51() throws Throwable  {
        String string = new String("[L");
        
        Type.getType(string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetType52() throws Throwable  {
        String string = new String("U");
        
        Type.getType(string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetType53() throws Throwable  {
        String string = new String("R\u0000");
        
        Type.getType(string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetType54() throws Throwable  {
        String string = new String("[L;");
        
        Type actual = Type.getType(string);
        
        Type expected = ((Type) createInstance("com.alibaba.fastjson.asm.Type"));
        setField(expected, "len", 3);
        setField(expected, "off", 0);
        char[] charArray = new char[3];
        charArray[0] = '[';
        charArray[1] = 'L';
        charArray[2] = ';';
        setField(expected, "buf", charArray);
        setField(expected, "sort", 9);
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetType55() throws Throwable  {
        String string = new String("[[L");
        
        Type.getType(string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetType56() throws Throwable  {
        String string = new String("[[L\u0000");
        
        Type.getType(string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testType1() throws Throwable  {
        char[] charArray = new char[0];
        Class typeClazz = Class.forName("com.alibaba.fastjson.asm.Type");
        Class intType = int.class;
        Class charArrayType = Class.forName("[C");
        Constructor typeConstructor = typeClazz.getDeclaredConstructor(intType, charArrayType, intType, intType);
        typeConstructor.setAccessible(true);
        java.lang.Object[] typeConstructorArguments = new java.lang.Object[4];
        typeConstructorArguments[0] = 0;
        typeConstructorArguments[1] = ((Object) charArray);
        typeConstructorArguments[2] = 0;
        typeConstructorArguments[3] = 0;
        Type actual = ((Type) typeConstructor.newInstance(typeConstructorArguments));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testType2() throws Throwable  {
        char[] charArray = new char[9];
        Class typeClazz = Class.forName("com.alibaba.fastjson.asm.Type");
        Class intType = int.class;
        Class charArrayType = Class.forName("[C");
        Constructor typeConstructor = typeClazz.getDeclaredConstructor(intType, charArrayType, intType, intType);
        typeConstructor.setAccessible(true);
        java.lang.Object[] typeConstructorArguments = new java.lang.Object[4];
        typeConstructorArguments[0] = 0;
        typeConstructorArguments[1] = ((Object) charArray);
        typeConstructorArguments[2] = 0;
        typeConstructorArguments[3] = 0;
        Type actual = ((Type) typeConstructor.newInstance(typeConstructorArguments));
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
    private static sun.misc.Unsafe getUnsafeInstance() throws Exception {
        java.lang.reflect.Field f = sun.misc.Unsafe.class.getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return (sun.misc.Unsafe) f.get(null);
    }
}
