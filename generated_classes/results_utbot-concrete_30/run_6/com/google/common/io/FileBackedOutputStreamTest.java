package com.google.common.io;

import org.junit.Test;
import java.io.File;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Method;
import sun.security.util.DerOutputStream;
import java.io.InputStream;
import java.io.ByteArrayInputStream;
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
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class FileBackedOutputStreamTest {
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testClose1() throws Throwable  {
        FileBackedOutputStream fileBackedOutputStream = ((FileBackedOutputStream) createInstance("com.google.common.io.FileBackedOutputStream"));
        
        fileBackedOutputStream.close();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testClose2() throws Throwable  {
        FileBackedOutputStream fileBackedOutputStream = ((FileBackedOutputStream) createInstance("com.google.common.io.FileBackedOutputStream"));
        setField(fileBackedOutputStream, "out", null);
        
        fileBackedOutputStream.close();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testFlush1() throws Throwable  {
        FileBackedOutputStream fileBackedOutputStream = ((FileBackedOutputStream) createInstance("com.google.common.io.FileBackedOutputStream"));
        
        fileBackedOutputStream.flush();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testFlush2() throws Throwable  {
        FileBackedOutputStream fileBackedOutputStream = ((FileBackedOutputStream) createInstance("com.google.common.io.FileBackedOutputStream"));
        setField(fileBackedOutputStream, "out", null);
        
        fileBackedOutputStream.flush();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testWrite1() throws Throwable  {
        FileBackedOutputStream fileBackedOutputStream = ((FileBackedOutputStream) createInstance("com.google.common.io.FileBackedOutputStream"));
        byte[] byteArray = new byte[0];
        
        fileBackedOutputStream.write(byteArray, 0, 0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testWrite2() throws Throwable  {
        FileBackedOutputStream fileBackedOutputStream = ((FileBackedOutputStream) createInstance("com.google.common.io.FileBackedOutputStream"));
        File file = ((File) createInstance("java.io.File"));
        setField(fileBackedOutputStream, "file", file);
        setField(fileBackedOutputStream, "out", null);
        byte[] byteArray = new byte[9];
        
        fileBackedOutputStream.write(byteArray, 0, 0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testWrite3() throws Throwable  {
        FileBackedOutputStream fileBackedOutputStream = ((FileBackedOutputStream) createInstance("com.google.common.io.FileBackedOutputStream"));
        setField(fileBackedOutputStream, "file", null);
        setField(fileBackedOutputStream, "memory", null);
        byte[] byteArray = new byte[9];
        
        fileBackedOutputStream.write(byteArray, 0, 0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testWrite4() throws Throwable  {
        FileBackedOutputStream fileBackedOutputStream = ((FileBackedOutputStream) createInstance("com.google.common.io.FileBackedOutputStream"));
        setField(fileBackedOutputStream, "file", null);
        Object memoryOutput = createInstance("com.google.common.io.FileBackedOutputStream$MemoryOutput");
        setField(memoryOutput, "count", 1073734399);
        setField(fileBackedOutputStream, "memory", memoryOutput);
        setField(fileBackedOutputStream, "out", null);
        setField(fileBackedOutputStream, "fileThreshold", 0);
        byte[] byteArray = new byte[1];
        
        fileBackedOutputStream.write(byteArray, 0, 2147476222);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testWrite5() throws Throwable  {
        FileBackedOutputStream fileBackedOutputStream = ((FileBackedOutputStream) createInstance("com.google.common.io.FileBackedOutputStream"));
        setField(fileBackedOutputStream, "file", null);
        Object memoryOutput = createInstance("com.google.common.io.FileBackedOutputStream$MemoryOutput");
        setField(memoryOutput, "count", 1073741823);
        setField(fileBackedOutputStream, "memory", memoryOutput);
        setField(fileBackedOutputStream, "fileThreshold", 0);
        
        fileBackedOutputStream.write(((byte[]) null), 0, 1073741822);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testWrite6() throws Throwable  {
        FileBackedOutputStream fileBackedOutputStream = ((FileBackedOutputStream) createInstance("com.google.common.io.FileBackedOutputStream"));
        byte[] byteArray = new byte[0];
        
        fileBackedOutputStream.write(byteArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testWrite7() throws Throwable  {
        FileBackedOutputStream fileBackedOutputStream = ((FileBackedOutputStream) createInstance("com.google.common.io.FileBackedOutputStream"));
        
        fileBackedOutputStream.write(((byte[]) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testWrite8() throws Throwable  {
        FileBackedOutputStream fileBackedOutputStream = ((FileBackedOutputStream) createInstance("com.google.common.io.FileBackedOutputStream"));
        setField(fileBackedOutputStream, "file", null);
        setField(fileBackedOutputStream, "memory", null);
        byte[] byteArray = new byte[9];
        
        fileBackedOutputStream.write(byteArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testWrite9() throws Throwable  {
        FileBackedOutputStream fileBackedOutputStream = ((FileBackedOutputStream) createInstance("com.google.common.io.FileBackedOutputStream"));
        File file = ((File) createInstance("java.io.File"));
        setField(fileBackedOutputStream, "file", file);
        Object memoryOutput = createInstance("com.google.common.io.FileBackedOutputStream$MemoryOutput");
        setField(memoryOutput, "count", 2147483639);
        byte[] byteArray = new byte[0];
        setField(memoryOutput, "buf", byteArray);
        setField(fileBackedOutputStream, "out", memoryOutput);
        byte[] byteArray1 = new byte[6];
        
        fileBackedOutputStream.write(byteArray1);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testWrite10() throws Throwable  {
        FileBackedOutputStream fileBackedOutputStream = ((FileBackedOutputStream) createInstance("com.google.common.io.FileBackedOutputStream"));
        File file = ((File) createInstance("java.io.File"));
        setField(fileBackedOutputStream, "file", file);
        Object memoryOutput = createInstance("com.google.common.io.FileBackedOutputStream$MemoryOutput");
        setField(memoryOutput, "count", 32);
        byte[] byteArray = new byte[18];
        setField(memoryOutput, "buf", byteArray);
        setField(fileBackedOutputStream, "out", memoryOutput);
        byte[] byteArray1 = new byte[0];
        
        fileBackedOutputStream.write(byteArray1);
        
        Object fileBackedOutputStreamOut = getFieldValue(fileBackedOutputStream, "out");
        Object finalFileBackedOutputStreamOutBuf = getFieldValue(fileBackedOutputStreamOut, "buf");
        
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testWrite11() throws Throwable  {
        FileBackedOutputStream fileBackedOutputStream = ((FileBackedOutputStream) createInstance("com.google.common.io.FileBackedOutputStream"));
        setField(fileBackedOutputStream, "file", null);
        Object memoryOutput = createInstance("com.google.common.io.FileBackedOutputStream$MemoryOutput");
        setField(memoryOutput, "count", -33);
        setField(fileBackedOutputStream, "memory", memoryOutput);
        ByteArrayOutputStream byteArrayOutputStream = ((ByteArrayOutputStream) createInstance("java.io.ByteArrayOutputStream"));
        setField(byteArrayOutputStream, "count", 0);
        setField(fileBackedOutputStream, "out", byteArrayOutputStream);
        setField(fileBackedOutputStream, "fileThreshold", 0);
        byte[] byteArray = new byte[30];
        
        fileBackedOutputStream.write(byteArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testWrite12() throws Throwable  {
        FileBackedOutputStream fileBackedOutputStream = ((FileBackedOutputStream) createInstance("com.google.common.io.FileBackedOutputStream"));
        setField(fileBackedOutputStream, "file", null);
        Object memoryOutput = createInstance("com.google.common.io.FileBackedOutputStream$MemoryOutput");
        setField(memoryOutput, "count", 2147483615);
        setField(fileBackedOutputStream, "memory", memoryOutput);
        setField(fileBackedOutputStream, "fileThreshold", 0);
        byte[] byteArray = new byte[30];
        
        fileBackedOutputStream.write(byteArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testWrite13() throws Throwable  {
        FileBackedOutputStream fileBackedOutputStream = ((FileBackedOutputStream) createInstance("com.google.common.io.FileBackedOutputStream"));
        
        fileBackedOutputStream.write(0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testWrite14() throws Throwable  {
        FileBackedOutputStream fileBackedOutputStream = ((FileBackedOutputStream) createInstance("com.google.common.io.FileBackedOutputStream"));
        setField(fileBackedOutputStream, "file", null);
        setField(fileBackedOutputStream, "memory", null);
        
        fileBackedOutputStream.write(0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testWrite15() throws Throwable  {
        FileBackedOutputStream fileBackedOutputStream = ((FileBackedOutputStream) createInstance("com.google.common.io.FileBackedOutputStream"));
        File file = ((File) createInstance("java.io.File"));
        setField(fileBackedOutputStream, "file", file);
        setField(fileBackedOutputStream, "out", null);
        
        fileBackedOutputStream.write(0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testWrite16() throws Throwable  {
        FileBackedOutputStream fileBackedOutputStream = ((FileBackedOutputStream) createInstance("com.google.common.io.FileBackedOutputStream"));
        setField(fileBackedOutputStream, "file", null);
        Object memoryOutput = createInstance("com.google.common.io.FileBackedOutputStream$MemoryOutput");
        setField(memoryOutput, "count", -2);
        setField(fileBackedOutputStream, "memory", memoryOutput);
        setField(fileBackedOutputStream, "out", null);
        setField(fileBackedOutputStream, "fileThreshold", 0);
        
        fileBackedOutputStream.write(0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testWrite17() throws Throwable  {
        FileBackedOutputStream fileBackedOutputStream = ((FileBackedOutputStream) createInstance("com.google.common.io.FileBackedOutputStream"));
        File file = ((File) createInstance("java.io.File"));
        setField(fileBackedOutputStream, "file", file);
        ByteArrayOutputStream byteArrayOutputStream = ((ByteArrayOutputStream) createInstance("java.io.ByteArrayOutputStream"));
        setField(byteArrayOutputStream, "count", 0);
        byte[] byteArray = new byte[3];
        setField(byteArrayOutputStream, "buf", byteArray);
        setField(fileBackedOutputStream, "out", byteArrayOutputStream);
        
        fileBackedOutputStream.write(0);
        
        Object fileBackedOutputStreamOut = getFieldValue(fileBackedOutputStream, "out");
        Object finalFileBackedOutputStreamOutCount = getFieldValue(fileBackedOutputStreamOut, "count");
        
        assertEquals(1, finalFileBackedOutputStreamOutCount);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testUpdate1() throws Throwable  {
        FileBackedOutputStream fileBackedOutputStream = ((FileBackedOutputStream) createInstance("com.google.common.io.FileBackedOutputStream"));
        
        Class fileBackedOutputStreamClazz = Class.forName("com.google.common.io.FileBackedOutputStream");
        Class intType = int.class;
        Method updateMethod = fileBackedOutputStreamClazz.getDeclaredMethod("update", intType);
        updateMethod.setAccessible(true);
        java.lang.Object[] updateMethodArguments = new java.lang.Object[1];
        updateMethodArguments[0] = 0;
        try {
            updateMethod.invoke(fileBackedOutputStream, updateMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testUpdate2() throws Throwable  {
        FileBackedOutputStream fileBackedOutputStream = ((FileBackedOutputStream) createInstance("com.google.common.io.FileBackedOutputStream"));
        File file = ((File) createInstance("java.io.File"));
        setField(fileBackedOutputStream, "file", file);
        
        Class fileBackedOutputStreamClazz = Class.forName("com.google.common.io.FileBackedOutputStream");
        Class intType = int.class;
        Method updateMethod = fileBackedOutputStreamClazz.getDeclaredMethod("update", intType);
        updateMethod.setAccessible(true);
        java.lang.Object[] updateMethodArguments = new java.lang.Object[1];
        updateMethodArguments[0] = 0;
        updateMethod.invoke(fileBackedOutputStream, updateMethodArguments);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testUpdate3() throws Throwable  {
        FileBackedOutputStream fileBackedOutputStream = ((FileBackedOutputStream) createInstance("com.google.common.io.FileBackedOutputStream"));
        setField(fileBackedOutputStream, "file", null);
        setField(fileBackedOutputStream, "memory", null);
        
        Class fileBackedOutputStreamClazz = Class.forName("com.google.common.io.FileBackedOutputStream");
        Class intType = int.class;
        Method updateMethod = fileBackedOutputStreamClazz.getDeclaredMethod("update", intType);
        updateMethod.setAccessible(true);
        java.lang.Object[] updateMethodArguments = new java.lang.Object[1];
        updateMethodArguments[0] = 0;
        try {
            updateMethod.invoke(fileBackedOutputStream, updateMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testUpdate4() throws Throwable  {
        FileBackedOutputStream fileBackedOutputStream = ((FileBackedOutputStream) createInstance("com.google.common.io.FileBackedOutputStream"));
        setField(fileBackedOutputStream, "file", null);
        Object memoryOutput = createInstance("com.google.common.io.FileBackedOutputStream$MemoryOutput");
        setField(memoryOutput, "count", 1073217535);
        setField(fileBackedOutputStream, "memory", memoryOutput);
        setField(fileBackedOutputStream, "fileThreshold", 0);
        
        Class fileBackedOutputStreamClazz = Class.forName("com.google.common.io.FileBackedOutputStream");
        Class intType = int.class;
        Method updateMethod = fileBackedOutputStreamClazz.getDeclaredMethod("update", intType);
        updateMethod.setAccessible(true);
        java.lang.Object[] updateMethodArguments = new java.lang.Object[1];
        updateMethodArguments[0] = -1074266114;
        updateMethod.invoke(fileBackedOutputStream, updateMethodArguments);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReset1() throws Throwable  {
        FileBackedOutputStream fileBackedOutputStream = ((FileBackedOutputStream) createInstance("com.google.common.io.FileBackedOutputStream"));
        
        fileBackedOutputStream.reset();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReset2() throws Throwable  {
        FileBackedOutputStream fileBackedOutputStream = ((FileBackedOutputStream) createInstance("com.google.common.io.FileBackedOutputStream"));
        Object processPipeOutputStream = createInstance("java.lang.UNIXProcess$ProcessPipeOutputStream");
        DerOutputStream derOutputStream = ((DerOutputStream) createInstance("sun.security.util.DerOutputStream"));
        setField(derOutputStream, "count", -536870915);
        byte[] byteArray = new byte[0];
        setField(derOutputStream, "buf", byteArray);
        setField(processPipeOutputStream, "out", derOutputStream);
        setField(processPipeOutputStream, "count", 12);
        byte[] byteArray1 = new byte[16];
        setField(processPipeOutputStream, "buf", byteArray1);
        setField(fileBackedOutputStream, "out", processPipeOutputStream);
        
        Object initialFileBackedOutputStreamOut = getFieldValue(fileBackedOutputStream, "out");
        
        fileBackedOutputStream.reset();
        
        Object finalFileBackedOutputStreamOut = getFieldValue(fileBackedOutputStream, "out");
        
        assertFalse(initialFileBackedOutputStreamOut == finalFileBackedOutputStreamOut);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReset3() throws Throwable  {
        FileBackedOutputStream fileBackedOutputStream = ((FileBackedOutputStream) createInstance("com.google.common.io.FileBackedOutputStream"));
        Object processPipeOutputStream = createInstance("java.lang.UNIXProcess$ProcessPipeOutputStream");
        DerOutputStream derOutputStream = ((DerOutputStream) createInstance("sun.security.util.DerOutputStream"));
        setField(derOutputStream, "count", 34);
        byte[] byteArray = new byte[19];
        setField(derOutputStream, "buf", byteArray);
        setField(processPipeOutputStream, "out", derOutputStream);
        setField(processPipeOutputStream, "count", 4);
        byte[] byteArray1 = new byte[8];
        setField(processPipeOutputStream, "buf", byteArray1);
        setField(fileBackedOutputStream, "out", processPipeOutputStream);
        
        Object initialFileBackedOutputStreamOut = getFieldValue(fileBackedOutputStream, "out");
        
        fileBackedOutputStream.reset();
        
        Object finalFileBackedOutputStreamOut = getFieldValue(fileBackedOutputStream, "out");
        
        assertFalse(initialFileBackedOutputStreamOut == finalFileBackedOutputStreamOut);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetFile1() throws Throwable  {
        FileBackedOutputStream fileBackedOutputStream = ((FileBackedOutputStream) createInstance("com.google.common.io.FileBackedOutputStream"));
        
        File actual = fileBackedOutputStream.getFile();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetFile2() throws Throwable  {
        FileBackedOutputStream fileBackedOutputStream = ((FileBackedOutputStream) createInstance("com.google.common.io.FileBackedOutputStream"));
        setField(fileBackedOutputStream, "file", null);
        
        File actual = fileBackedOutputStream.getFile();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testOpenInputStream1() throws Throwable  {
        FileBackedOutputStream fileBackedOutputStream = ((FileBackedOutputStream) createInstance("com.google.common.io.FileBackedOutputStream"));
        
        Class fileBackedOutputStreamClazz = Class.forName("com.google.common.io.FileBackedOutputStream");
        Method openInputStreamMethod = fileBackedOutputStreamClazz.getDeclaredMethod("openInputStream");
        openInputStreamMethod.setAccessible(true);
        java.lang.Object[] openInputStreamMethodArguments = new java.lang.Object[0];
        try {
            openInputStreamMethod.invoke(fileBackedOutputStream, openInputStreamMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testOpenInputStream2() throws Throwable  {
        FileBackedOutputStream fileBackedOutputStream = ((FileBackedOutputStream) createInstance("com.google.common.io.FileBackedOutputStream"));
        setField(fileBackedOutputStream, "file", null);
        setField(fileBackedOutputStream, "memory", null);
        
        Class fileBackedOutputStreamClazz = Class.forName("com.google.common.io.FileBackedOutputStream");
        Method openInputStreamMethod = fileBackedOutputStreamClazz.getDeclaredMethod("openInputStream");
        openInputStreamMethod.setAccessible(true);
        java.lang.Object[] openInputStreamMethodArguments = new java.lang.Object[0];
        try {
            openInputStreamMethod.invoke(fileBackedOutputStream, openInputStreamMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testOpenInputStream3() throws Throwable  {
        FileBackedOutputStream fileBackedOutputStream = ((FileBackedOutputStream) createInstance("com.google.common.io.FileBackedOutputStream"));
        setField(fileBackedOutputStream, "file", null);
        Object memoryOutput = createInstance("com.google.common.io.FileBackedOutputStream$MemoryOutput");
        setField(memoryOutput, "count", -2147483647);
        byte[] byteArray = new byte[0];
        setField(memoryOutput, "buf", byteArray);
        setField(fileBackedOutputStream, "memory", memoryOutput);
        
        Class fileBackedOutputStreamClazz = Class.forName("com.google.common.io.FileBackedOutputStream");
        Method openInputStreamMethod = fileBackedOutputStreamClazz.getDeclaredMethod("openInputStream");
        openInputStreamMethod.setAccessible(true);
        java.lang.Object[] openInputStreamMethodArguments = new java.lang.Object[0];
        InputStream actual = ((InputStream) openInputStreamMethod.invoke(fileBackedOutputStream, openInputStreamMethodArguments));
        
        ByteArrayInputStream expected = ((ByteArrayInputStream) createInstance("java.io.ByteArrayInputStream"));
        setField(expected, "buf", byteArray);
        setField(expected, "pos", 0);
        setField(expected, "mark", 0);
        setField(expected, "count", -2147483647);
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    
    ///region Errors report for openInputStream
    
    public void testOpenInputStream_errors()
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
    public void testAsByteSource1() throws Throwable  {
        FileBackedOutputStream fileBackedOutputStream = ((FileBackedOutputStream) createInstance("com.google.common.io.FileBackedOutputStream"));
        
        ByteSource actual = fileBackedOutputStream.asByteSource();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testAsByteSource2() throws Throwable  {
        FileBackedOutputStream fileBackedOutputStream = ((FileBackedOutputStream) createInstance("com.google.common.io.FileBackedOutputStream"));
        Object pathByteSource = createInstance("com.google.common.io.MoreFiles$PathByteSource");
        setField(fileBackedOutputStream, "source", pathByteSource);
        
        ByteSource actual = fileBackedOutputStream.asByteSource();
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(pathByteSource, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testFileBackedOutputStream1() {
        FileBackedOutputStream actual = new FileBackedOutputStream(0, false);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testFileBackedOutputStream2() {
        FileBackedOutputStream actual = new FileBackedOutputStream(0);
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
