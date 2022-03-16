package com.google.common.io;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.BufferedOutputStream;
import com.google.common.hash.HashingOutputStream;
import java.io.FilterOutputStream;
import java.io.File;
import java.lang.reflect.Method;
import java.io.DataOutputStream;
import sun.security.util.DerOutputStream;
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
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

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
    
    @Test(timeout = 10000)
    public void testClose3() throws Throwable  {
        FileBackedOutputStream fileBackedOutputStream = ((FileBackedOutputStream) createInstance("com.google.common.io.FileBackedOutputStream"));
        ByteArrayOutputStream byteArrayOutputStream = ((ByteArrayOutputStream) createInstance("java.io.ByteArrayOutputStream"));
        setField(fileBackedOutputStream, "out", byteArrayOutputStream);
        
        fileBackedOutputStream.close();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testClose4() throws Throwable  {
        FileBackedOutputStream fileBackedOutputStream = ((FileBackedOutputStream) createInstance("com.google.common.io.FileBackedOutputStream"));
        BufferedOutputStream bufferedOutputStream = ((BufferedOutputStream) createInstance("java.io.BufferedOutputStream"));
        HashingOutputStream hashingOutputStream = ((HashingOutputStream) createInstance("com.google.common.hash.HashingOutputStream"));
        Object processPipeOutputStream = createInstance("java.lang.UNIXProcess$ProcessPipeOutputStream");
        Object exposedByteArrayOutputStream = createInstance("com.google.common.hash.AbstractNonStreamingHashFunction$ExposedByteArrayOutputStream");
        setField(exposedByteArrayOutputStream, "count", 2147483637);
        byte[] byteArray = new byte[0];
        setField(exposedByteArrayOutputStream, "buf", byteArray);
        setField(processPipeOutputStream, "out", exposedByteArrayOutputStream);
        setField(processPipeOutputStream, "count", 20);
        byte[] byteArray1 = new byte[24];
        setField(processPipeOutputStream, "buf", byteArray1);
        setField(hashingOutputStream, "out", processPipeOutputStream);
        setField(bufferedOutputStream, "out", hashingOutputStream);
        setField(bufferedOutputStream, "count", -2013265920);
        setField(bufferedOutputStream, "buf", null);
        setField(fileBackedOutputStream, "out", bufferedOutputStream);
        
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
    
    @Test(timeout = 10000)
    public void testFlush3() throws Throwable  {
        FileBackedOutputStream fileBackedOutputStream = ((FileBackedOutputStream) createInstance("com.google.common.io.FileBackedOutputStream"));
        FilterOutputStream filterOutputStream = ((FilterOutputStream) createInstance("java.io.FilterOutputStream"));
        BufferedOutputStream bufferedOutputStream = ((BufferedOutputStream) createInstance("java.io.BufferedOutputStream"));
        ByteArrayOutputStream byteArrayOutputStream = ((ByteArrayOutputStream) createInstance("java.io.ByteArrayOutputStream"));
        setField(byteArrayOutputStream, "count", 2);
        byte[] byteArray = new byte[40];
        setField(byteArrayOutputStream, "buf", byteArray);
        setField(bufferedOutputStream, "out", byteArrayOutputStream);
        setField(bufferedOutputStream, "count", 25);
        byte[] byteArray1 = new byte[32];
        setField(bufferedOutputStream, "buf", byteArray1);
        setField(filterOutputStream, "out", bufferedOutputStream);
        setField(fileBackedOutputStream, "out", filterOutputStream);
        
        fileBackedOutputStream.flush();
        
        Object fileBackedOutputStreamOut = getFieldValue(fileBackedOutputStream, "out");
        Object fileBackedOutputStreamOutOutOut = getFieldValue(fileBackedOutputStreamOut, "out");
        Object fileBackedOutputStreamOutOutOutOutOutOut = getFieldValue(fileBackedOutputStreamOutOutOut, "out");
        Object finalFileBackedOutputStreamOutOutOutCount = getFieldValue(fileBackedOutputStreamOutOutOutOutOutOut, "count");
        Object fileBackedOutputStreamOut1 = getFieldValue(fileBackedOutputStream, "out");
        Object fileBackedOutputStreamOut1OutOut = getFieldValue(fileBackedOutputStreamOut1, "out");
        Object finalFileBackedOutputStreamOutOutCount = getFieldValue(fileBackedOutputStreamOut1OutOut, "count");
        
        assertEquals(27, finalFileBackedOutputStreamOutOutOutCount);
        
        assertEquals(0, finalFileBackedOutputStreamOutOutCount);
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
        setField(memoryOutput, "count", 1073734183);
        setField(fileBackedOutputStream, "memory", memoryOutput);
        setField(fileBackedOutputStream, "out", null);
        setField(fileBackedOutputStream, "fileThreshold", 0);
        byte[] byteArray = new byte[12];
        
        fileBackedOutputStream.write(byteArray, 0, -1073749466);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testWrite5() throws Throwable  {
        FileBackedOutputStream fileBackedOutputStream = ((FileBackedOutputStream) createInstance("com.google.common.io.FileBackedOutputStream"));
        File file = ((File) createInstance("java.io.File"));
        setField(fileBackedOutputStream, "file", file);
        Object memoryOutput = createInstance("com.google.common.io.FileBackedOutputStream$MemoryOutput");
        setField(memoryOutput, "count", 0);
        byte[] byteArray = new byte[21];
        setField(memoryOutput, "buf", byteArray);
        setField(fileBackedOutputStream, "out", memoryOutput);
        byte[] byteArray1 = new byte[32];
        
        fileBackedOutputStream.write(byteArray1, 2, 12);
        
        Object fileBackedOutputStreamOut = getFieldValue(fileBackedOutputStream, "out");
        Object finalFileBackedOutputStreamOutCount = getFieldValue(fileBackedOutputStreamOut, "count");
        
        assertEquals(12, finalFileBackedOutputStreamOutCount);
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
    
    @Test(timeout = 10000)
    public void testWrite9() throws Throwable  {
        FileBackedOutputStream fileBackedOutputStream = ((FileBackedOutputStream) createInstance("com.google.common.io.FileBackedOutputStream"));
        File file = ((File) createInstance("java.io.File"));
        setField(fileBackedOutputStream, "file", file);
        ByteArrayOutputStream byteArrayOutputStream = ((ByteArrayOutputStream) createInstance("java.io.ByteArrayOutputStream"));
        setField(byteArrayOutputStream, "count", 0);
        byte[] byteArray = new byte[35];
        setField(byteArrayOutputStream, "buf", byteArray);
        setField(fileBackedOutputStream, "out", byteArrayOutputStream);
        byte[] byteArray1 = new byte[28];
        
        fileBackedOutputStream.write(byteArray1);
        
        Object fileBackedOutputStreamOut = getFieldValue(fileBackedOutputStream, "out");
        Object finalFileBackedOutputStreamOutCount = getFieldValue(fileBackedOutputStreamOut, "count");
        
        assertEquals(28, finalFileBackedOutputStreamOutCount);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testWrite10() throws Throwable  {
        FileBackedOutputStream fileBackedOutputStream = ((FileBackedOutputStream) createInstance("com.google.common.io.FileBackedOutputStream"));
        setField(fileBackedOutputStream, "file", null);
        Object memoryOutput = createInstance("com.google.common.io.FileBackedOutputStream$MemoryOutput");
        setField(memoryOutput, "count", -33);
        setField(memoryOutput, "buf", null);
        setField(fileBackedOutputStream, "memory", memoryOutput);
        ByteArrayOutputStream byteArrayOutputStream = ((ByteArrayOutputStream) createInstance("java.io.ByteArrayOutputStream"));
        setField(byteArrayOutputStream, "count", 0);
        setField(byteArrayOutputStream, "buf", null);
        setField(fileBackedOutputStream, "out", byteArrayOutputStream);
        setField(fileBackedOutputStream, "fileThreshold", 0);
        byte[] byteArray = new byte[30];
        
        fileBackedOutputStream.write(byteArray);
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
        Object urlByteSource = createInstance("com.google.common.io.Resources$UrlByteSource");
        setField(fileBackedOutputStream, "source", urlByteSource);
        
        ByteSource actual = fileBackedOutputStream.asByteSource();
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(urlByteSource, actual));
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
    public void testUpdate5() throws Throwable  {
        FileBackedOutputStream fileBackedOutputStream = ((FileBackedOutputStream) createInstance("com.google.common.io.FileBackedOutputStream"));
        setField(fileBackedOutputStream, "file", null);
        Object memoryOutput = createInstance("com.google.common.io.FileBackedOutputStream$MemoryOutput");
        setField(memoryOutput, "count", 1073741823);
        setField(fileBackedOutputStream, "memory", memoryOutput);
        setField(fileBackedOutputStream, "fileThreshold", 0);
        
        Class fileBackedOutputStreamClazz = Class.forName("com.google.common.io.FileBackedOutputStream");
        Class intType = int.class;
        Method updateMethod = fileBackedOutputStreamClazz.getDeclaredMethod("update", intType);
        updateMethod.setAccessible(true);
        java.lang.Object[] updateMethodArguments = new java.lang.Object[1];
        updateMethodArguments[0] = 1073741822;
        try {
            updateMethod.invoke(fileBackedOutputStream, updateMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
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
        setField(fileBackedOutputStream, "file", null);
        Object memoryOutput = createInstance("com.google.common.io.FileBackedOutputStream$MemoryOutput");
        setField(memoryOutput, "count", 0);
        setField(fileBackedOutputStream, "memory", memoryOutput);
        BufferedOutputStream bufferedOutputStream = ((BufferedOutputStream) createInstance("java.io.BufferedOutputStream"));
        setField(bufferedOutputStream, "out", null);
        setField(bufferedOutputStream, "count", 1);
        byte[] byteArray = new byte[9];
        setField(bufferedOutputStream, "buf", byteArray);
        setField(fileBackedOutputStream, "out", bufferedOutputStream);
        
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
        DataOutputStream dataOutputStream = ((DataOutputStream) createInstance("java.io.DataOutputStream"));
        Object encOutputStream = createInstance("java.util.Base64$EncOutputStream");
        BufferedOutputStream bufferedOutputStream = ((BufferedOutputStream) createInstance("java.io.BufferedOutputStream"));
        DerOutputStream derOutputStream = ((DerOutputStream) createInstance("sun.security.util.DerOutputStream"));
        setField(derOutputStream, "count", 21);
        byte[] byteArray = new byte[32];
        setField(derOutputStream, "buf", byteArray);
        setField(bufferedOutputStream, "out", derOutputStream);
        setField(bufferedOutputStream, "count", 4);
        byte[] byteArray1 = new byte[4];
        setField(bufferedOutputStream, "buf", byteArray1);
        setField(encOutputStream, "out", bufferedOutputStream);
        setField(dataOutputStream, "out", encOutputStream);
        setField(fileBackedOutputStream, "out", dataOutputStream);
        
        Object initialFileBackedOutputStreamOut = getFieldValue(fileBackedOutputStream, "out");
        
        fileBackedOutputStream.reset();
        
        Object finalFileBackedOutputStreamOut = getFieldValue(fileBackedOutputStream, "out");
        
        assertFalse(initialFileBackedOutputStreamOut == finalFileBackedOutputStreamOut);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReset4() throws Throwable  {
        FileBackedOutputStream fileBackedOutputStream = ((FileBackedOutputStream) createInstance("com.google.common.io.FileBackedOutputStream"));
        BufferedOutputStream bufferedOutputStream = ((BufferedOutputStream) createInstance("java.io.BufferedOutputStream"));
        CountingOutputStream countingOutputStream = ((CountingOutputStream) createInstance("com.google.common.io.CountingOutputStream"));
        FilterOutputStream filterOutputStream = ((FilterOutputStream) createInstance("java.io.FilterOutputStream"));
        Object processPipeOutputStream = createInstance("java.lang.UNIXProcess$ProcessPipeOutputStream");
        BufferedOutputStream bufferedOutputStream1 = ((BufferedOutputStream) createInstance("java.io.BufferedOutputStream"));
        setField(bufferedOutputStream1, "out", null);
        setField(bufferedOutputStream1, "count", -2147483616);
        byte[] byteArray = new byte[34];
        setField(bufferedOutputStream1, "buf", byteArray);
        setField(processPipeOutputStream, "out", bufferedOutputStream1);
        setField(processPipeOutputStream, "count", 3);
        setField(processPipeOutputStream, "buf", null);
        setField(filterOutputStream, "out", processPipeOutputStream);
        setField(countingOutputStream, "out", filterOutputStream);
        setField(bufferedOutputStream, "out", countingOutputStream);
        setField(bufferedOutputStream, "count", -2147483647);
        setField(bufferedOutputStream, "buf", fileBackedOutputStream);
        setField(fileBackedOutputStream, "out", bufferedOutputStream);
        
        Object initialFileBackedOutputStreamOut = getFieldValue(fileBackedOutputStream, "out");
        
        fileBackedOutputStream.reset();
        
        Object finalFileBackedOutputStreamOut = getFieldValue(fileBackedOutputStream, "out");
        
        assertFalse(initialFileBackedOutputStreamOut == finalFileBackedOutputStreamOut);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReset5() throws Throwable  {
        FileBackedOutputStream fileBackedOutputStream = ((FileBackedOutputStream) createInstance("com.google.common.io.FileBackedOutputStream"));
        BufferedOutputStream bufferedOutputStream = ((BufferedOutputStream) createInstance("java.io.BufferedOutputStream"));
        HashingOutputStream hashingOutputStream = ((HashingOutputStream) createInstance("com.google.common.hash.HashingOutputStream"));
        FilterOutputStream filterOutputStream = ((FilterOutputStream) createInstance("java.io.FilterOutputStream"));
        Object processPipeOutputStream = createInstance("java.lang.UNIXProcess$ProcessPipeOutputStream");
        BufferedOutputStream bufferedOutputStream1 = ((BufferedOutputStream) createInstance("java.io.BufferedOutputStream"));
        setField(bufferedOutputStream1, "out", null);
        setField(bufferedOutputStream1, "count", 32);
        byte[] byteArray = new byte[40];
        setField(bufferedOutputStream1, "buf", byteArray);
        setField(processPipeOutputStream, "out", bufferedOutputStream1);
        setField(processPipeOutputStream, "count", 1);
        byte[] byteArray1 = new byte[32];
        setField(processPipeOutputStream, "buf", byteArray1);
        setField(filterOutputStream, "out", processPipeOutputStream);
        setField(hashingOutputStream, "out", filterOutputStream);
        setField(bufferedOutputStream, "out", hashingOutputStream);
        setField(bufferedOutputStream, "count", -2147483647);
        setField(bufferedOutputStream, "buf", null);
        setField(fileBackedOutputStream, "out", bufferedOutputStream);
        
        Object initialFileBackedOutputStreamOut = getFieldValue(fileBackedOutputStream, "out");
        
        fileBackedOutputStream.reset();
        
        Object finalFileBackedOutputStreamOut = getFieldValue(fileBackedOutputStream, "out");
        
        assertFalse(initialFileBackedOutputStreamOut == finalFileBackedOutputStreamOut);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReset6() throws Throwable  {
        FileBackedOutputStream fileBackedOutputStream = ((FileBackedOutputStream) createInstance("com.google.common.io.FileBackedOutputStream"));
        BufferedOutputStream bufferedOutputStream = ((BufferedOutputStream) createInstance("java.io.BufferedOutputStream"));
        CountingOutputStream countingOutputStream = ((CountingOutputStream) createInstance("com.google.common.io.CountingOutputStream"));
        FilterOutputStream filterOutputStream = ((FilterOutputStream) createInstance("java.io.FilterOutputStream"));
        Object processPipeOutputStream = createInstance("java.lang.UNIXProcess$ProcessPipeOutputStream");
        DerOutputStream derOutputStream = ((DerOutputStream) createInstance("sun.security.util.DerOutputStream"));
        setField(derOutputStream, "count", 6);
        byte[] byteArray = new byte[8];
        setField(derOutputStream, "buf", byteArray);
        setField(processPipeOutputStream, "out", derOutputStream);
        setField(processPipeOutputStream, "count", 3);
        byte[] byteArray1 = new byte[16];
        setField(processPipeOutputStream, "buf", byteArray1);
        setField(filterOutputStream, "out", processPipeOutputStream);
        setField(countingOutputStream, "out", filterOutputStream);
        setField(bufferedOutputStream, "out", countingOutputStream);
        setField(bufferedOutputStream, "count", -2147481600);
        setField(bufferedOutputStream, "buf", null);
        setField(fileBackedOutputStream, "out", bufferedOutputStream);
        
        Object initialFileBackedOutputStreamOut = getFieldValue(fileBackedOutputStream, "out");
        
        fileBackedOutputStream.reset();
        
        Object finalFileBackedOutputStreamOut = getFieldValue(fileBackedOutputStream, "out");
        
        assertFalse(initialFileBackedOutputStreamOut == finalFileBackedOutputStreamOut);
    }
    ///endregion
    
    
    ///region Errors report for reset
    
    public void testReset_errors()
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
