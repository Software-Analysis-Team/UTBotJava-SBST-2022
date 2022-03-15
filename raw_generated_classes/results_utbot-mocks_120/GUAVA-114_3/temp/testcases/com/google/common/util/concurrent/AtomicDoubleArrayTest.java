package com.google.common.util.concurrent;

import org.junit.Test;
import java.util.concurrent.atomic.AtomicLongArray;
import java.lang.reflect.Method;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import sun.net.www.http.ChunkedInputStream;
import java.io.ObjectOutputStream;
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

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static java.lang.reflect.Array.get;

public class AtomicDoubleArrayTest {
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testToString1() throws Throwable  {
        AtomicDoubleArray atomicDoubleArray = ((AtomicDoubleArray) createInstance("com.google.common.util.concurrent.AtomicDoubleArray"));
        
        atomicDoubleArray.toString();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testToString2() throws Throwable  {
        AtomicDoubleArray atomicDoubleArray = ((AtomicDoubleArray) createInstance("com.google.common.util.concurrent.AtomicDoubleArray"));
        AtomicLongArray atomicLongArray = ((AtomicLongArray) createInstance("java.util.concurrent.atomic.AtomicLongArray"));
        long[] longArray = new long[0];
        setField(atomicLongArray, "array", longArray);
        setField(atomicDoubleArray, "longs", atomicLongArray);
        
        String actual = atomicDoubleArray.toString();
        
        String expected = new String("[]");
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGet1() throws Throwable  {
        AtomicDoubleArray atomicDoubleArray = ((AtomicDoubleArray) createInstance("com.google.common.util.concurrent.AtomicDoubleArray"));
        
        atomicDoubleArray.get(0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGet2() throws Throwable  {
        AtomicDoubleArray atomicDoubleArray = ((AtomicDoubleArray) createInstance("com.google.common.util.concurrent.AtomicDoubleArray"));
        setField(atomicDoubleArray, "longs", null);
        
        atomicDoubleArray.get(0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGet3() throws Throwable  {
        AtomicDoubleArray atomicDoubleArray = ((AtomicDoubleArray) createInstance("com.google.common.util.concurrent.AtomicDoubleArray"));
        AtomicLongArray atomicLongArray = ((AtomicLongArray) createInstance("java.util.concurrent.atomic.AtomicLongArray"));
        long[] longArray = new long[9];
        setField(atomicLongArray, "array", longArray);
        setField(atomicDoubleArray, "longs", atomicLongArray);
        
        atomicDoubleArray.get(1073741824);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testLength1() throws Throwable  {
        AtomicDoubleArray atomicDoubleArray = ((AtomicDoubleArray) createInstance("com.google.common.util.concurrent.AtomicDoubleArray"));
        
        atomicDoubleArray.length();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testLength2() throws Throwable  {
        AtomicDoubleArray atomicDoubleArray = ((AtomicDoubleArray) createInstance("com.google.common.util.concurrent.AtomicDoubleArray"));
        setField(atomicDoubleArray, "longs", null);
        
        atomicDoubleArray.length();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testLength3() throws Throwable  {
        AtomicDoubleArray atomicDoubleArray = ((AtomicDoubleArray) createInstance("com.google.common.util.concurrent.AtomicDoubleArray"));
        AtomicLongArray atomicLongArray = ((AtomicLongArray) createInstance("java.util.concurrent.atomic.AtomicLongArray"));
        long[] longArray = new long[9];
        setField(atomicLongArray, "array", longArray);
        setField(atomicDoubleArray, "longs", atomicLongArray);
        
        int actual = atomicDoubleArray.length();
        
        assertEquals(9, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadObject1() throws Throwable  {
        AtomicDoubleArray atomicDoubleArray = ((AtomicDoubleArray) createInstance("com.google.common.util.concurrent.AtomicDoubleArray"));
        
        Class atomicDoubleArrayClazz = Class.forName("com.google.common.util.concurrent.AtomicDoubleArray");
        Class objectInputStreamType = Class.forName("java.io.ObjectInputStream");
        Method readObjectMethod = atomicDoubleArrayClazz.getDeclaredMethod("readObject", objectInputStreamType);
        readObjectMethod.setAccessible(true);
        java.lang.Object[] readObjectMethodArguments = new java.lang.Object[1];
        readObjectMethodArguments[0] = null;
        try {
            readObjectMethod.invoke(atomicDoubleArray, readObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadObject2() throws Throwable  {
        AtomicDoubleArray atomicDoubleArray = ((AtomicDoubleArray) createInstance("com.google.common.util.concurrent.AtomicDoubleArray"));
        ObjectInputStream objectInputStream = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        setField(objectInputStream, "curContext", null);
        
        Class atomicDoubleArrayClazz = Class.forName("com.google.common.util.concurrent.AtomicDoubleArray");
        Class objectInputStreamType = Class.forName("java.io.ObjectInputStream");
        Method readObjectMethod = atomicDoubleArrayClazz.getDeclaredMethod("readObject", objectInputStreamType);
        readObjectMethod.setAccessible(true);
        java.lang.Object[] readObjectMethodArguments = new java.lang.Object[1];
        readObjectMethodArguments[0] = objectInputStream;
        try {
            readObjectMethod.invoke(atomicDoubleArray, readObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadObject3() throws Throwable  {
        AtomicDoubleArray atomicDoubleArray = ((AtomicDoubleArray) createInstance("com.google.common.util.concurrent.AtomicDoubleArray"));
        ObjectInputStream objectInputStream = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object serialCallbackContext = createInstance("java.io.SerialCallbackContext");
        Thread thread = ((Thread) createInstance("java.lang.Thread"));
        setField(serialCallbackContext, "thread", thread);
        ObjectStreamClass objectStreamClass = ((ObjectStreamClass) createInstance("java.io.ObjectStreamClass"));
        setField(serialCallbackContext, "desc", objectStreamClass);
        sun.net.www.http.ChunkedInputStream[] chunkedInputStreamArray = new sun.net.www.http.ChunkedInputStream[0];
        setField(serialCallbackContext, "obj", chunkedInputStreamArray);
        setField(objectInputStream, "curContext", serialCallbackContext);
        Object blockDataInputStream = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        setField(blockDataInputStream, "end", 1);
        setField(blockDataInputStream, "pos", 0);
        setField(blockDataInputStream, "blkmode", true);
        setField(objectInputStream, "bin", blockDataInputStream);
        
        Object objectInputStreamCurContext = getFieldValue(objectInputStream, "curContext");
        Object initialObjectInputStreamCurContextThread = getFieldValue(objectInputStreamCurContext, "thread");
        
        Class atomicDoubleArrayClazz = Class.forName("com.google.common.util.concurrent.AtomicDoubleArray");
        Class objectInputStreamType = Class.forName("java.io.ObjectInputStream");
        Method readObjectMethod = atomicDoubleArrayClazz.getDeclaredMethod("readObject", objectInputStreamType);
        readObjectMethod.setAccessible(true);
        java.lang.Object[] readObjectMethodArguments = new java.lang.Object[1];
        readObjectMethodArguments[0] = objectInputStream;
        try {
            readObjectMethod.invoke(atomicDoubleArray, readObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        Object objectInputStreamCurContext1 = getFieldValue(objectInputStream, "curContext");
        Object finalObjectInputStreamCurContextThread = getFieldValue(objectInputStreamCurContext1, "thread");
        
        assertNull(finalObjectInputStreamCurContextThread);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadObject4() throws Throwable  {
        AtomicDoubleArray atomicDoubleArray = ((AtomicDoubleArray) createInstance("com.google.common.util.concurrent.AtomicDoubleArray"));
        ObjectInputStream objectInputStream = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object serialCallbackContext = createInstance("java.io.SerialCallbackContext");
        Thread thread = ((Thread) createInstance("java.lang.Thread"));
        setField(serialCallbackContext, "thread", thread);
        ObjectStreamClass objectStreamClass = ((ObjectStreamClass) createInstance("java.io.ObjectStreamClass"));
        setField(objectStreamClass, "primDataSize", Integer.MIN_VALUE);
        setField(objectStreamClass, "cl", null);
        setField(serialCallbackContext, "desc", objectStreamClass);
        sun.net.www.http.ChunkedInputStream[] chunkedInputStreamArray = new sun.net.www.http.ChunkedInputStream[0];
        setField(serialCallbackContext, "obj", chunkedInputStreamArray);
        setField(objectInputStream, "curContext", serialCallbackContext);
        setField(objectInputStream, "primVals", null);
        Object blockDataInputStream = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        setField(blockDataInputStream, "blkmode", false);
        setField(objectInputStream, "bin", blockDataInputStream);
        
        Object objectInputStreamCurContext = getFieldValue(objectInputStream, "curContext");
        Object initialObjectInputStreamCurContextThread = getFieldValue(objectInputStreamCurContext, "thread");
        
        Class atomicDoubleArrayClazz = Class.forName("com.google.common.util.concurrent.AtomicDoubleArray");
        Class objectInputStreamType = Class.forName("java.io.ObjectInputStream");
        Method readObjectMethod = atomicDoubleArrayClazz.getDeclaredMethod("readObject", objectInputStreamType);
        readObjectMethod.setAccessible(true);
        java.lang.Object[] readObjectMethodArguments = new java.lang.Object[1];
        readObjectMethodArguments[0] = objectInputStream;
        try {
            readObjectMethod.invoke(atomicDoubleArray, readObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        Object objectInputStreamCurContext1 = getFieldValue(objectInputStream, "curContext");
        Object finalObjectInputStreamCurContextThread = getFieldValue(objectInputStreamCurContext1, "thread");
        
        assertNull(finalObjectInputStreamCurContextThread);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadObject5() throws Throwable  {
        AtomicDoubleArray atomicDoubleArray = ((AtomicDoubleArray) createInstance("com.google.common.util.concurrent.AtomicDoubleArray"));
        ObjectInputStream objectInputStream = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object serialCallbackContext = createInstance("java.io.SerialCallbackContext");
        setField(serialCallbackContext, "thread", null);
        setField(objectInputStream, "curContext", serialCallbackContext);
        
        Class atomicDoubleArrayClazz = Class.forName("com.google.common.util.concurrent.AtomicDoubleArray");
        Class objectInputStreamType = Class.forName("java.io.ObjectInputStream");
        Method readObjectMethod = atomicDoubleArrayClazz.getDeclaredMethod("readObject", objectInputStreamType);
        readObjectMethod.setAccessible(true);
        java.lang.Object[] readObjectMethodArguments = new java.lang.Object[1];
        readObjectMethodArguments[0] = objectInputStream;
        try {
            readObjectMethod.invoke(atomicDoubleArray, readObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testWriteObject1() throws Throwable  {
        AtomicDoubleArray atomicDoubleArray = ((AtomicDoubleArray) createInstance("com.google.common.util.concurrent.AtomicDoubleArray"));
        
        Class atomicDoubleArrayClazz = Class.forName("com.google.common.util.concurrent.AtomicDoubleArray");
        Class objectOutputStreamType = Class.forName("java.io.ObjectOutputStream");
        Method writeObjectMethod = atomicDoubleArrayClazz.getDeclaredMethod("writeObject", objectOutputStreamType);
        writeObjectMethod.setAccessible(true);
        java.lang.Object[] writeObjectMethodArguments = new java.lang.Object[1];
        writeObjectMethodArguments[0] = null;
        try {
            writeObjectMethod.invoke(atomicDoubleArray, writeObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testWriteObject2() throws Throwable  {
        AtomicDoubleArray atomicDoubleArray = ((AtomicDoubleArray) createInstance("com.google.common.util.concurrent.AtomicDoubleArray"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        setField(objectOutputStream, "curContext", null);
        
        Class atomicDoubleArrayClazz = Class.forName("com.google.common.util.concurrent.AtomicDoubleArray");
        Class objectOutputStreamType = Class.forName("java.io.ObjectOutputStream");
        Method writeObjectMethod = atomicDoubleArrayClazz.getDeclaredMethod("writeObject", objectOutputStreamType);
        writeObjectMethod.setAccessible(true);
        java.lang.Object[] writeObjectMethodArguments = new java.lang.Object[1];
        writeObjectMethodArguments[0] = objectOutputStream;
        try {
            writeObjectMethod.invoke(atomicDoubleArray, writeObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testWriteObject3() throws Throwable  {
        AtomicDoubleArray atomicDoubleArray = ((AtomicDoubleArray) createInstance("com.google.common.util.concurrent.AtomicDoubleArray"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object serialCallbackContext = createInstance("java.io.SerialCallbackContext");
        Thread thread = ((Thread) createInstance("java.lang.Thread"));
        setField(serialCallbackContext, "thread", thread);
        ObjectStreamClass objectStreamClass = ((ObjectStreamClass) createInstance("java.io.ObjectStreamClass"));
        setField(serialCallbackContext, "desc", objectStreamClass);
        java.lang.Object[] stdSocketOptionArray = createArray("java.net.StandardSocketOptions$StdSocketOption", 0);
        setField(serialCallbackContext, "obj", stdSocketOptionArray);
        setField(objectOutputStream, "curContext", serialCallbackContext);
        Object blockDataOutputStream = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        setField(blockDataOutputStream, "pos", 256);
        setField(blockDataOutputStream, "blkmode", true);
        byte[] byteArray = new byte[0];
        setField(blockDataOutputStream, "hbuf", byteArray);
        setField(objectOutputStream, "bout", blockDataOutputStream);
        
        Object objectOutputStreamCurContext = getFieldValue(objectOutputStream, "curContext");
        Object initialObjectOutputStreamCurContextThread = getFieldValue(objectOutputStreamCurContext, "thread");
        
        Class atomicDoubleArrayClazz = Class.forName("com.google.common.util.concurrent.AtomicDoubleArray");
        Class objectOutputStreamType = Class.forName("java.io.ObjectOutputStream");
        Method writeObjectMethod = atomicDoubleArrayClazz.getDeclaredMethod("writeObject", objectOutputStreamType);
        writeObjectMethod.setAccessible(true);
        java.lang.Object[] writeObjectMethodArguments = new java.lang.Object[1];
        writeObjectMethodArguments[0] = objectOutputStream;
        try {
            writeObjectMethod.invoke(atomicDoubleArray, writeObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        Object objectOutputStreamCurContext1 = getFieldValue(objectOutputStream, "curContext");
        Object finalObjectOutputStreamCurContextThread = getFieldValue(objectOutputStreamCurContext1, "thread");
        
        assertNull(finalObjectOutputStreamCurContextThread);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testWriteObject4() throws Throwable  {
        AtomicDoubleArray atomicDoubleArray = ((AtomicDoubleArray) createInstance("com.google.common.util.concurrent.AtomicDoubleArray"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object serialCallbackContext = createInstance("java.io.SerialCallbackContext");
        Thread thread = ((Thread) createInstance("java.lang.Thread"));
        setField(serialCallbackContext, "thread", thread);
        ObjectStreamClass objectStreamClass = ((ObjectStreamClass) createInstance("java.io.ObjectStreamClass"));
        setField(serialCallbackContext, "desc", objectStreamClass);
        java.lang.Object[] stdSocketOptionArray = createArray("java.net.StandardSocketOptions$StdSocketOption", 0);
        setField(serialCallbackContext, "obj", stdSocketOptionArray);
        setField(objectOutputStream, "curContext", serialCallbackContext);
        Object blockDataOutputStream = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        setField(blockDataOutputStream, "pos", -2147483392);
        setField(blockDataOutputStream, "blkmode", true);
        byte[] byteArray = new byte[1];
        setField(blockDataOutputStream, "hbuf", byteArray);
        setField(objectOutputStream, "bout", blockDataOutputStream);
        
        Object objectOutputStreamCurContext = getFieldValue(objectOutputStream, "curContext");
        Object initialObjectOutputStreamCurContextThread = getFieldValue(objectOutputStreamCurContext, "thread");
        
        Class atomicDoubleArrayClazz = Class.forName("com.google.common.util.concurrent.AtomicDoubleArray");
        Class objectOutputStreamType = Class.forName("java.io.ObjectOutputStream");
        Method writeObjectMethod = atomicDoubleArrayClazz.getDeclaredMethod("writeObject", objectOutputStreamType);
        writeObjectMethod.setAccessible(true);
        java.lang.Object[] writeObjectMethodArguments = new java.lang.Object[1];
        writeObjectMethodArguments[0] = objectOutputStream;
        try {
            writeObjectMethod.invoke(atomicDoubleArray, writeObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        Object objectOutputStreamCurContext1 = getFieldValue(objectOutputStream, "curContext");
        Object finalObjectOutputStreamCurContextThread = getFieldValue(objectOutputStreamCurContext1, "thread");
        Object objectOutputStreamBout = getFieldValue(objectOutputStream, "bout");
        Object objectOutputStreamBoutBoutHbuf = getFieldValue(objectOutputStreamBout, "hbuf");
        Object finalObjectOutputStreamBoutHbuf0 = get(objectOutputStreamBoutBoutHbuf, 0);
        
        assertNull(finalObjectOutputStreamCurContextThread);
        
        assertEquals((byte) 119, finalObjectOutputStreamBoutHbuf0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testWriteObject5() throws Throwable  {
        AtomicDoubleArray atomicDoubleArray = ((AtomicDoubleArray) createInstance("com.google.common.util.concurrent.AtomicDoubleArray"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object serialCallbackContext = createInstance("java.io.SerialCallbackContext");
        Thread thread = ((Thread) createInstance("java.lang.Thread"));
        setField(serialCallbackContext, "thread", thread);
        ObjectStreamClass objectStreamClass = ((ObjectStreamClass) createInstance("java.io.ObjectStreamClass"));
        setField(serialCallbackContext, "desc", objectStreamClass);
        java.lang.Object[] stdSocketOptionArray = createArray("java.net.StandardSocketOptions$StdSocketOption", 0);
        setField(serialCallbackContext, "obj", stdSocketOptionArray);
        setField(objectOutputStream, "curContext", serialCallbackContext);
        Object blockDataOutputStream = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        setField(blockDataOutputStream, "pos", -2147483392);
        setField(blockDataOutputStream, "blkmode", true);
        byte[] byteArray = new byte[0];
        setField(blockDataOutputStream, "hbuf", byteArray);
        setField(objectOutputStream, "bout", blockDataOutputStream);
        
        Object objectOutputStreamCurContext = getFieldValue(objectOutputStream, "curContext");
        Object initialObjectOutputStreamCurContextThread = getFieldValue(objectOutputStreamCurContext, "thread");
        
        Class atomicDoubleArrayClazz = Class.forName("com.google.common.util.concurrent.AtomicDoubleArray");
        Class objectOutputStreamType = Class.forName("java.io.ObjectOutputStream");
        Method writeObjectMethod = atomicDoubleArrayClazz.getDeclaredMethod("writeObject", objectOutputStreamType);
        writeObjectMethod.setAccessible(true);
        java.lang.Object[] writeObjectMethodArguments = new java.lang.Object[1];
        writeObjectMethodArguments[0] = objectOutputStream;
        try {
            writeObjectMethod.invoke(atomicDoubleArray, writeObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        Object objectOutputStreamCurContext1 = getFieldValue(objectOutputStream, "curContext");
        Object finalObjectOutputStreamCurContextThread = getFieldValue(objectOutputStreamCurContext1, "thread");
        
        assertNull(finalObjectOutputStreamCurContextThread);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testWriteObject6() throws Throwable  {
        AtomicDoubleArray atomicDoubleArray = ((AtomicDoubleArray) createInstance("com.google.common.util.concurrent.AtomicDoubleArray"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object serialCallbackContext = createInstance("java.io.SerialCallbackContext");
        setField(serialCallbackContext, "thread", null);
        setField(objectOutputStream, "curContext", serialCallbackContext);
        
        Class atomicDoubleArrayClazz = Class.forName("com.google.common.util.concurrent.AtomicDoubleArray");
        Class objectOutputStreamType = Class.forName("java.io.ObjectOutputStream");
        Method writeObjectMethod = atomicDoubleArrayClazz.getDeclaredMethod("writeObject", objectOutputStreamType);
        writeObjectMethod.setAccessible(true);
        java.lang.Object[] writeObjectMethodArguments = new java.lang.Object[1];
        writeObjectMethodArguments[0] = objectOutputStream;
        try {
            writeObjectMethod.invoke(atomicDoubleArray, writeObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testWriteObject7() throws Throwable  {
        AtomicDoubleArray atomicDoubleArray = ((AtomicDoubleArray) createInstance("com.google.common.util.concurrent.AtomicDoubleArray"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object serialCallbackContext = createInstance("java.io.SerialCallbackContext");
        Thread thread = ((Thread) createInstance("java.lang.Thread"));
        setField(serialCallbackContext, "thread", thread);
        ObjectStreamClass objectStreamClass = ((ObjectStreamClass) createInstance("java.io.ObjectStreamClass"));
        setField(serialCallbackContext, "desc", objectStreamClass);
        java.lang.Object[] stdSocketOptionArray = createArray("java.net.StandardSocketOptions$StdSocketOption", 0);
        setField(serialCallbackContext, "obj", stdSocketOptionArray);
        setField(objectOutputStream, "curContext", serialCallbackContext);
        Object blockDataOutputStream = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        setField(blockDataOutputStream, "pos", 256);
        setField(blockDataOutputStream, "blkmode", true);
        byte[] byteArray = new byte[1];
        setField(blockDataOutputStream, "hbuf", byteArray);
        setField(objectOutputStream, "bout", blockDataOutputStream);
        
        Object objectOutputStreamCurContext = getFieldValue(objectOutputStream, "curContext");
        Object initialObjectOutputStreamCurContextThread = getFieldValue(objectOutputStreamCurContext, "thread");
        
        Class atomicDoubleArrayClazz = Class.forName("com.google.common.util.concurrent.AtomicDoubleArray");
        Class objectOutputStreamType = Class.forName("java.io.ObjectOutputStream");
        Method writeObjectMethod = atomicDoubleArrayClazz.getDeclaredMethod("writeObject", objectOutputStreamType);
        writeObjectMethod.setAccessible(true);
        java.lang.Object[] writeObjectMethodArguments = new java.lang.Object[1];
        writeObjectMethodArguments[0] = objectOutputStream;
        try {
            writeObjectMethod.invoke(atomicDoubleArray, writeObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        Object objectOutputStreamCurContext1 = getFieldValue(objectOutputStream, "curContext");
        Object finalObjectOutputStreamCurContextThread = getFieldValue(objectOutputStreamCurContext1, "thread");
        Object objectOutputStreamBout = getFieldValue(objectOutputStream, "bout");
        Object objectOutputStreamBoutBoutHbuf = getFieldValue(objectOutputStreamBout, "hbuf");
        Object finalObjectOutputStreamBoutHbuf0 = get(objectOutputStreamBoutBoutHbuf, 0);
        
        assertNull(finalObjectOutputStreamCurContextThread);
        
        assertEquals((byte) 122, finalObjectOutputStreamBoutHbuf0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testSet1() throws Throwable  {
        AtomicDoubleArray atomicDoubleArray = ((AtomicDoubleArray) createInstance("com.google.common.util.concurrent.AtomicDoubleArray"));
        
        atomicDoubleArray.set(0, 0.0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testSet2() throws Throwable  {
        AtomicDoubleArray atomicDoubleArray = ((AtomicDoubleArray) createInstance("com.google.common.util.concurrent.AtomicDoubleArray"));
        setField(atomicDoubleArray, "longs", null);
        
        atomicDoubleArray.set(0, java.lang.Double.NaN);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testLazySet1() throws Throwable  {
        AtomicDoubleArray atomicDoubleArray = ((AtomicDoubleArray) createInstance("com.google.common.util.concurrent.AtomicDoubleArray"));
        
        atomicDoubleArray.lazySet(0, 0.0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testLazySet2() throws Throwable  {
        AtomicDoubleArray atomicDoubleArray = ((AtomicDoubleArray) createInstance("com.google.common.util.concurrent.AtomicDoubleArray"));
        setField(atomicDoubleArray, "longs", null);
        
        atomicDoubleArray.lazySet(0, java.lang.Double.NaN);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetAndAdd1() throws Throwable  {
        AtomicDoubleArray atomicDoubleArray = ((AtomicDoubleArray) createInstance("com.google.common.util.concurrent.AtomicDoubleArray"));
        
        atomicDoubleArray.getAndAdd(0, 0.0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetAndAdd2() throws Throwable  {
        AtomicDoubleArray atomicDoubleArray = ((AtomicDoubleArray) createInstance("com.google.common.util.concurrent.AtomicDoubleArray"));
        setField(atomicDoubleArray, "longs", null);
        
        atomicDoubleArray.getAndAdd(0, java.lang.Double.NaN);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetAndAdd3() throws Throwable  {
        AtomicDoubleArray atomicDoubleArray = ((AtomicDoubleArray) createInstance("com.google.common.util.concurrent.AtomicDoubleArray"));
        AtomicLongArray atomicLongArray = ((AtomicLongArray) createInstance("java.util.concurrent.atomic.AtomicLongArray"));
        long[] longArray = new long[9];
        setField(atomicLongArray, "array", longArray);
        setField(atomicDoubleArray, "longs", atomicLongArray);
        
        atomicDoubleArray.getAndAdd(1073741824, java.lang.Double.NaN);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetAndSet1() throws Throwable  {
        AtomicDoubleArray atomicDoubleArray = ((AtomicDoubleArray) createInstance("com.google.common.util.concurrent.AtomicDoubleArray"));
        
        atomicDoubleArray.getAndSet(0, 0.0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetAndSet2() throws Throwable  {
        AtomicDoubleArray atomicDoubleArray = ((AtomicDoubleArray) createInstance("com.google.common.util.concurrent.AtomicDoubleArray"));
        setField(atomicDoubleArray, "longs", null);
        
        atomicDoubleArray.getAndSet(0, java.lang.Double.NaN);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCompareAndSet1() throws Throwable  {
        AtomicDoubleArray atomicDoubleArray = ((AtomicDoubleArray) createInstance("com.google.common.util.concurrent.AtomicDoubleArray"));
        
        atomicDoubleArray.compareAndSet(0, 0.0, 0.0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCompareAndSet2() throws Throwable  {
        AtomicDoubleArray atomicDoubleArray = ((AtomicDoubleArray) createInstance("com.google.common.util.concurrent.AtomicDoubleArray"));
        setField(atomicDoubleArray, "longs", null);
        
        atomicDoubleArray.compareAndSet(0, java.lang.Double.NaN, java.lang.Double.NaN);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCompareAndSet3() throws Throwable  {
        AtomicDoubleArray atomicDoubleArray = ((AtomicDoubleArray) createInstance("com.google.common.util.concurrent.AtomicDoubleArray"));
        AtomicLongArray atomicLongArray = ((AtomicLongArray) createInstance("java.util.concurrent.atomic.AtomicLongArray"));
        long[] longArray = new long[9];
        setField(atomicLongArray, "array", longArray);
        setField(atomicDoubleArray, "longs", atomicLongArray);
        
        atomicDoubleArray.compareAndSet(1073741824, java.lang.Double.NaN, java.lang.Double.NaN);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testWeakCompareAndSet1() throws Throwable  {
        AtomicDoubleArray atomicDoubleArray = ((AtomicDoubleArray) createInstance("com.google.common.util.concurrent.AtomicDoubleArray"));
        
        atomicDoubleArray.weakCompareAndSet(0, 0.0, 0.0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testWeakCompareAndSet2() throws Throwable  {
        AtomicDoubleArray atomicDoubleArray = ((AtomicDoubleArray) createInstance("com.google.common.util.concurrent.AtomicDoubleArray"));
        setField(atomicDoubleArray, "longs", null);
        
        atomicDoubleArray.weakCompareAndSet(0, java.lang.Double.NaN, java.lang.Double.NaN);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testWeakCompareAndSet3() throws Throwable  {
        AtomicDoubleArray atomicDoubleArray = ((AtomicDoubleArray) createInstance("com.google.common.util.concurrent.AtomicDoubleArray"));
        AtomicLongArray atomicLongArray = ((AtomicLongArray) createInstance("java.util.concurrent.atomic.AtomicLongArray"));
        setField(atomicDoubleArray, "longs", atomicLongArray);
        
        atomicDoubleArray.weakCompareAndSet(Integer.MIN_VALUE, java.lang.Double.NaN, java.lang.Double.NaN);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testAddAndGet1() throws Throwable  {
        AtomicDoubleArray atomicDoubleArray = ((AtomicDoubleArray) createInstance("com.google.common.util.concurrent.AtomicDoubleArray"));
        
        atomicDoubleArray.addAndGet(0, 0.0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testAddAndGet2() throws Throwable  {
        AtomicDoubleArray atomicDoubleArray = ((AtomicDoubleArray) createInstance("com.google.common.util.concurrent.AtomicDoubleArray"));
        setField(atomicDoubleArray, "longs", null);
        
        atomicDoubleArray.addAndGet(0, java.lang.Double.NaN);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testAddAndGet3() throws Throwable  {
        AtomicDoubleArray atomicDoubleArray = ((AtomicDoubleArray) createInstance("com.google.common.util.concurrent.AtomicDoubleArray"));
        AtomicLongArray atomicLongArray = ((AtomicLongArray) createInstance("java.util.concurrent.atomic.AtomicLongArray"));
        long[] longArray = new long[9];
        setField(atomicLongArray, "array", longArray);
        setField(atomicDoubleArray, "longs", atomicLongArray);
        
        atomicDoubleArray.addAndGet(1073741824, java.lang.Double.NaN);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testAtomicDoubleArray1() {
        AtomicDoubleArray actual = new AtomicDoubleArray(0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testAtomicDoubleArray2() {
        new AtomicDoubleArray(Integer.MIN_VALUE);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testAtomicDoubleArray3() {
        AtomicDoubleArray actual = new AtomicDoubleArray(9);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testAtomicDoubleArray4() {
        double[] doubleArray = new double[0];
        AtomicDoubleArray actual = new AtomicDoubleArray(doubleArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testAtomicDoubleArray5() {
        new AtomicDoubleArray(((double[]) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testAtomicDoubleArray6() {
        double[] doubleArray = new double[0];
        AtomicDoubleArray actual = new AtomicDoubleArray(doubleArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testAtomicDoubleArray7() {
        double[] doubleArray = new double[1];
        AtomicDoubleArray actual = new AtomicDoubleArray(doubleArray);
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
