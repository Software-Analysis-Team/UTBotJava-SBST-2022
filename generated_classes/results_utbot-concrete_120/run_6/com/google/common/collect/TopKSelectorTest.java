package com.google.common.collect;

import org.junit.Test;
import sun.misc.ASCIICaseInsensitiveComparator;
import java.lang.reflect.Method;
import java.util.Base64.Decoder;
import java.util.Base64;
import java.util.Locale.Builder;
import java.util.Locale;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.HashMap;
import java.util.HashSet;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Array;
import java.util.Objects;
import java.util.Map;
import java.util.List;
import java.util.Set;
import java.util.Arrays;
import sun.misc.Unsafe;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;
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
    public void testOffer3() throws Throwable  {
        TopKSelector topKSelector = ((TopKSelector) createInstance("com.google.common.collect.TopKSelector"));
        setField(topKSelector, "bufferSize", 0);
        java.lang.Object[] objectArray = new java.lang.Object[0];
        setField(topKSelector, "buffer", objectArray);
        setField(topKSelector, "k", 1);
        
        topKSelector.offer(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testOffer4() throws Throwable  {
        TopKSelector topKSelector = ((TopKSelector) createInstance("com.google.common.collect.TopKSelector"));
        setField(topKSelector, "threshold", null);
        setField(topKSelector, "bufferSize", 0);
        java.lang.Object[] objectArray = new java.lang.Object[9];
        setField(topKSelector, "buffer", objectArray);
        setField(topKSelector, "k", 4096);
        
        Object initialTopKSelectorThreshold = getFieldValue(topKSelector, "threshold");
        
        topKSelector.offer(null);
        
        Object finalTopKSelectorThreshold = getFieldValue(topKSelector, "threshold");
        Object finalTopKSelectorBufferSize = getFieldValue(topKSelector, "bufferSize");
        
        assertNull(finalTopKSelectorThreshold);
        
        assertEquals(1, finalTopKSelectorBufferSize);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testOffer5() throws Throwable  {
        TopKSelector topKSelector = ((TopKSelector) createInstance("com.google.common.collect.TopKSelector"));
        setField(topKSelector, "bufferSize", -2147483646);
        java.lang.Object[] objectArray = new java.lang.Object[0];
        setField(topKSelector, "buffer", objectArray);
        setField(topKSelector, "k", 3);
        
        topKSelector.offer(null);
        
        Object finalTopKSelectorBufferSize = getFieldValue(topKSelector, "bufferSize");
        
        assertEquals(-2147483645, finalTopKSelectorBufferSize);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testOffer6() throws Throwable  {
        TopKSelector topKSelector = ((TopKSelector) createInstance("com.google.common.collect.TopKSelector"));
        java.lang.Object[] transferStackArray = createArray("java.util.concurrent.SynchronousQueue$TransferStack", 0);
        setField(topKSelector, "threshold", transferStackArray);
        setField(topKSelector, "bufferSize", 2);
        ASCIICaseInsensitiveComparator aSCIICaseInsensitiveComparator = ((ASCIICaseInsensitiveComparator) createInstance("sun.misc.ASCIICaseInsensitiveComparator"));
        setField(topKSelector, "comparator", aSCIICaseInsensitiveComparator);
        setField(topKSelector, "k", -2147483645);
        
        topKSelector.offer(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testOffer7() throws Throwable  {
        TopKSelector topKSelector = ((TopKSelector) createInstance("com.google.common.collect.TopKSelector"));
        java.lang.Object[] transferStackArray = createArray("java.util.concurrent.SynchronousQueue$TransferStack", 0);
        setField(topKSelector, "threshold", transferStackArray);
        setField(topKSelector, "bufferSize", 8);
        java.lang.Object[] objectArray = new java.lang.Object[9];
        setField(topKSelector, "buffer", objectArray);
        ASCIICaseInsensitiveComparator aSCIICaseInsensitiveComparator = ((ASCIICaseInsensitiveComparator) createInstance("sun.misc.ASCIICaseInsensitiveComparator"));
        setField(topKSelector, "comparator", aSCIICaseInsensitiveComparator);
        setField(topKSelector, "k", 9);
        
        topKSelector.offer(null);
        
        Object finalTopKSelectorBufferSize = getFieldValue(topKSelector, "bufferSize");
        
        assertEquals(9, finalTopKSelectorBufferSize);
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
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testTrim3() throws Throwable  {
        TopKSelector topKSelector = ((TopKSelector) createInstance("com.google.common.collect.TopKSelector"));
        java.lang.Object[] objectArray = new java.lang.Object[0];
        setField(topKSelector, "buffer", objectArray);
        setField(topKSelector, "k", 196608);
        
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
        setField(topKSelector, "bufferSize", 1);
        java.lang.Object[] objectArray = new java.lang.Object[0];
        setField(topKSelector, "buffer", objectArray);
        
        topKSelector.combine(topKSelector);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCombine5() throws Throwable  {
        TopKSelector topKSelector = ((TopKSelector) createInstance("com.google.common.collect.TopKSelector"));
        setField(topKSelector, "bufferSize", 0);
        java.lang.Object[] objectArray = new java.lang.Object[0];
        setField(topKSelector, "buffer", objectArray);
        setField(topKSelector, "k", 1);
        TopKSelector topKSelector1 = ((TopKSelector) createInstance("com.google.common.collect.TopKSelector"));
        setField(topKSelector1, "bufferSize", 131072);
        java.lang.Object[] objectArray1 = new java.lang.Object[16];
        Object object = createInstance("java.lang.Object");
        objectArray1[1] = object;
        objectArray1[2] = object;
        objectArray1[3] = object;
        objectArray1[4] = object;
        objectArray1[5] = object;
        objectArray1[6] = object;
        objectArray1[7] = object;
        objectArray1[8] = object;
        objectArray1[9] = object;
        objectArray1[10] = object;
        objectArray1[11] = object;
        objectArray1[12] = object;
        objectArray1[13] = object;
        objectArray1[14] = object;
        objectArray1[15] = object;
        setField(topKSelector1, "buffer", objectArray1);
        setField(topKSelector1, "k", 0);
        
        topKSelector.combine(topKSelector1);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCombine6() throws Throwable  {
        TopKSelector topKSelector = ((TopKSelector) createInstance("com.google.common.collect.TopKSelector"));
        setField(topKSelector, "bufferSize", 0);
        setField(topKSelector, "buffer", null);
        setField(topKSelector, "k", 0);
        TopKSelector topKSelector1 = ((TopKSelector) createInstance("com.google.common.collect.TopKSelector"));
        setField(topKSelector1, "bufferSize", 1);
        java.lang.Object[] objectArray = new java.lang.Object[1];
        setField(topKSelector1, "buffer", objectArray);
        setField(topKSelector1, "k", 0);
        
        TopKSelector actual = topKSelector.combine(topKSelector1);
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(topKSelector, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCombine7() throws Throwable  {
        TopKSelector topKSelector = ((TopKSelector) createInstance("com.google.common.collect.TopKSelector"));
        setField(topKSelector, "threshold", null);
        setField(topKSelector, "bufferSize", 0);
        java.lang.Object[] objectArray = new java.lang.Object[1];
        setField(topKSelector, "buffer", objectArray);
        setField(topKSelector, "k", 1);
        TopKSelector topKSelector1 = ((TopKSelector) createInstance("com.google.common.collect.TopKSelector"));
        setField(topKSelector1, "threshold", null);
        setField(topKSelector1, "bufferSize", 512);
        setField(topKSelector1, "buffer", objectArray);
        setField(topKSelector1, "k", 1);
        
        Object initialTopKSelectorThreshold = getFieldValue(topKSelector, "threshold");
        
        Object initialTopKSelector1Threshold = getFieldValue(topKSelector1, "threshold");
        
        topKSelector.combine(topKSelector1);
        
        Object finalTopKSelectorThreshold = getFieldValue(topKSelector, "threshold");
        Object finalTopKSelectorBufferSize = getFieldValue(topKSelector, "bufferSize");
        
        Object finalTopKSelector1Threshold = getFieldValue(topKSelector1, "threshold");
        
        assertNull(finalTopKSelectorThreshold);
        
        assertEquals(1, finalTopKSelectorBufferSize);
        
        assertNull(finalTopKSelector1Threshold);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCombine8() throws Throwable  {
        TopKSelector topKSelector = ((TopKSelector) createInstance("com.google.common.collect.TopKSelector"));
        setField(topKSelector, "threshold", null);
        setField(topKSelector, "bufferSize", 1073741824);
        setField(topKSelector, "buffer", null);
        ASCIICaseInsensitiveComparator aSCIICaseInsensitiveComparator = ((ASCIICaseInsensitiveComparator) createInstance("sun.misc.ASCIICaseInsensitiveComparator"));
        setField(topKSelector, "comparator", aSCIICaseInsensitiveComparator);
        setField(topKSelector, "k", 1);
        TopKSelector topKSelector1 = ((TopKSelector) createInstance("com.google.common.collect.TopKSelector"));
        setField(topKSelector1, "threshold", null);
        setField(topKSelector1, "bufferSize", 8388608);
        java.lang.Object[] objectArray = new java.lang.Object[9];
        java.util.Base64.Decoder[] decoderArray = new java.util.Base64.Decoder[0];
        objectArray[0] = ((Object) decoderArray);
        Object object = createInstance("java.lang.Object");
        objectArray[1] = object;
        objectArray[2] = object;
        objectArray[3] = object;
        objectArray[4] = object;
        objectArray[5] = object;
        objectArray[6] = object;
        objectArray[7] = object;
        objectArray[8] = object;
        setField(topKSelector1, "buffer", objectArray);
        setField(topKSelector1, "comparator", null);
        setField(topKSelector1, "k", 0);
        
        Object initialTopKSelectorThreshold = getFieldValue(topKSelector, "threshold");
        
        Object initialTopKSelector1Threshold = getFieldValue(topKSelector1, "threshold");
        
        topKSelector.combine(topKSelector1);
        
        Object finalTopKSelectorThreshold = getFieldValue(topKSelector, "threshold");
        
        Object finalTopKSelector1Threshold = getFieldValue(topKSelector1, "threshold");
        
        assertNull(finalTopKSelectorThreshold);
        
        assertNull(finalTopKSelector1Threshold);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCombine9() throws Throwable  {
        TopKSelector topKSelector = ((TopKSelector) createInstance("com.google.common.collect.TopKSelector"));
        setField(topKSelector, "bufferSize", 32);
        java.lang.Object[] objectArray = new java.lang.Object[16];
        setField(topKSelector, "buffer", objectArray);
        setField(topKSelector, "k", 16384);
        TopKSelector topKSelector1 = ((TopKSelector) createInstance("com.google.common.collect.TopKSelector"));
        setField(topKSelector1, "bufferSize", 32);
        setField(topKSelector1, "buffer", objectArray);
        setField(topKSelector1, "k", 16384);
        
        topKSelector.combine(topKSelector1);
        
        Object finalTopKSelectorBufferSize = getFieldValue(topKSelector, "bufferSize");
        
        assertEquals(33, finalTopKSelectorBufferSize);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCombine10() throws Throwable  {
        TopKSelector topKSelector = ((TopKSelector) createInstance("com.google.common.collect.TopKSelector"));
        java.util.Locale.Builder[][] builderArray = new java.util.Locale.Builder[0][];
        setField(topKSelector, "threshold", builderArray);
        setField(topKSelector, "bufferSize", 8);
        java.lang.Object[] objectArray = new java.lang.Object[9];
        setField(topKSelector, "buffer", objectArray);
        ASCIICaseInsensitiveComparator aSCIICaseInsensitiveComparator = ((ASCIICaseInsensitiveComparator) createInstance("sun.misc.ASCIICaseInsensitiveComparator"));
        setField(topKSelector, "comparator", aSCIICaseInsensitiveComparator);
        setField(topKSelector, "k", 9);
        TopKSelector topKSelector1 = ((TopKSelector) createInstance("com.google.common.collect.TopKSelector"));
        setField(topKSelector1, "threshold", null);
        setField(topKSelector1, "bufferSize", 536870912);
        java.lang.Object[] objectArray1 = new java.lang.Object[9];
        objectArray1[1] = ((Object) topKSelector1);
        objectArray1[2] = ((Object) topKSelector1);
        objectArray1[3] = ((Object) topKSelector1);
        objectArray1[4] = ((Object) topKSelector1);
        objectArray1[5] = ((Object) topKSelector1);
        objectArray1[6] = ((Object) topKSelector1);
        objectArray1[7] = ((Object) topKSelector1);
        objectArray1[8] = ((Object) topKSelector1);
        setField(topKSelector1, "buffer", objectArray1);
        setField(topKSelector1, "comparator", null);
        setField(topKSelector1, "k", 0);
        
        topKSelector.combine(topKSelector1);
        
        Object finalTopKSelectorBufferSize = getFieldValue(topKSelector, "bufferSize");
        
        assertEquals(9, finalTopKSelectorBufferSize);
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
    
    @Test(timeout = 10000)
    public void testSwap4() throws Throwable  {
        TopKSelector topKSelector = ((TopKSelector) createInstance("com.google.common.collect.TopKSelector"));
        java.lang.Object[] objectArray = new java.lang.Object[9];
        setField(topKSelector, "buffer", objectArray);
        
        Class topKSelectorClazz = Class.forName("com.google.common.collect.TopKSelector");
        Class intType = int.class;
        Method swapMethod = topKSelectorClazz.getDeclaredMethod("swap", intType, intType);
        swapMethod.setAccessible(true);
        java.lang.Object[] swapMethodArguments = new java.lang.Object[2];
        swapMethodArguments[0] = 0;
        swapMethodArguments[1] = 0;
        swapMethod.invoke(topKSelector, swapMethodArguments);
    }
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
    public void testPartition4() throws Throwable  {
        TopKSelector topKSelector = ((TopKSelector) createInstance("com.google.common.collect.TopKSelector"));
        java.lang.Object[] objectArray = new java.lang.Object[11];
        objectArray[2] = objectArray;
        objectArray[3] = objectArray;
        objectArray[4] = objectArray;
        objectArray[5] = objectArray;
        objectArray[6] = objectArray;
        objectArray[7] = objectArray;
        objectArray[8] = objectArray;
        objectArray[9] = objectArray;
        objectArray[10] = objectArray;
        setField(topKSelector, "buffer", objectArray);
        ExplicitOrdering explicitOrdering = ((ExplicitOrdering) createInstance("com.google.common.collect.ExplicitOrdering"));
        setField(topKSelector, "comparator", explicitOrdering);
        
        Class topKSelectorClazz = Class.forName("com.google.common.collect.TopKSelector");
        Class intType = int.class;
        Method partitionMethod = topKSelectorClazz.getDeclaredMethod("partition", intType, intType, intType);
        partitionMethod.setAccessible(true);
        java.lang.Object[] partitionMethodArguments = new java.lang.Object[3];
        partitionMethodArguments[0] = Integer.MIN_VALUE;
        partitionMethodArguments[1] = 1;
        partitionMethodArguments[2] = 0;
        try {
            partitionMethod.invoke(topKSelector, partitionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testPartition5() throws Throwable  {
        TopKSelector topKSelector = ((TopKSelector) createInstance("com.google.common.collect.TopKSelector"));
        java.lang.Object[] objectArray = new java.lang.Object[39];
        objectArray[1] = objectArray;
        objectArray[2] = objectArray;
        objectArray[3] = objectArray;
        objectArray[4] = objectArray;
        objectArray[5] = objectArray;
        objectArray[6] = objectArray;
        objectArray[7] = objectArray;
        objectArray[8] = objectArray;
        objectArray[9] = objectArray;
        objectArray[10] = objectArray;
        objectArray[11] = objectArray;
        objectArray[12] = objectArray;
        objectArray[13] = objectArray;
        objectArray[14] = objectArray;
        objectArray[15] = objectArray;
        objectArray[16] = objectArray;
        objectArray[17] = objectArray;
        objectArray[18] = objectArray;
        objectArray[19] = objectArray;
        objectArray[20] = objectArray;
        objectArray[21] = objectArray;
        objectArray[22] = objectArray;
        objectArray[23] = objectArray;
        objectArray[24] = objectArray;
        objectArray[25] = objectArray;
        objectArray[26] = objectArray;
        objectArray[27] = objectArray;
        objectArray[28] = objectArray;
        objectArray[29] = objectArray;
        objectArray[30] = objectArray;
        objectArray[31] = objectArray;
        objectArray[32] = objectArray;
        objectArray[33] = objectArray;
        objectArray[34] = objectArray;
        objectArray[35] = objectArray;
        objectArray[36] = objectArray;
        objectArray[37] = objectArray;
        setField(topKSelector, "buffer", objectArray);
        
        Class topKSelectorClazz = Class.forName("com.google.common.collect.TopKSelector");
        Class intType = int.class;
        Method partitionMethod = topKSelectorClazz.getDeclaredMethod("partition", intType, intType, intType);
        partitionMethod.setAccessible(true);
        java.lang.Object[] partitionMethodArguments = new java.lang.Object[3];
        partitionMethodArguments[0] = 38;
        partitionMethodArguments[1] = 38;
        partitionMethodArguments[2] = 0;
        int actual = ((int) partitionMethod.invoke(topKSelector, partitionMethodArguments));
        
        assertEquals(38, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testPartition6() throws Throwable  {
        TopKSelector topKSelector = ((TopKSelector) createInstance("com.google.common.collect.TopKSelector"));
        java.lang.Object[] objectArray = new java.lang.Object[3];
        java.lang.Object[] byteBufferAsFloatBufferBArray = createArray("java.nio.ByteBufferAsFloatBufferB", 0);
        objectArray[0] = byteBufferAsFloatBufferBArray;
        setField(topKSelector, "buffer", objectArray);
        ASCIICaseInsensitiveComparator aSCIICaseInsensitiveComparator = ((ASCIICaseInsensitiveComparator) createInstance("sun.misc.ASCIICaseInsensitiveComparator"));
        setField(topKSelector, "comparator", aSCIICaseInsensitiveComparator);
        
        Class topKSelectorClazz = Class.forName("com.google.common.collect.TopKSelector");
        Class intType = int.class;
        Method partitionMethod = topKSelectorClazz.getDeclaredMethod("partition", intType, intType, intType);
        partitionMethod.setAccessible(true);
        java.lang.Object[] partitionMethodArguments = new java.lang.Object[3];
        partitionMethodArguments[0] = 0;
        partitionMethodArguments[1] = 1;
        partitionMethodArguments[2] = 2;
        try {
            partitionMethod.invoke(topKSelector, partitionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testOfferAll1() throws Throwable  {
        TopKSelector topKSelector = ((TopKSelector) createInstance("com.google.common.collect.TopKSelector"));
        
        topKSelector.offerAll(((Iterator) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testOfferAll2() throws Throwable  {
        TopKSelector topKSelector = ((TopKSelector) createInstance("com.google.common.collect.TopKSelector"));
        
        topKSelector.offerAll(((Iterator) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testOfferAll3() throws Throwable  {
        TopKSelector topKSelector = ((TopKSelector) createInstance("com.google.common.collect.TopKSelector"));
        Object valueIterator = createInstance("java.util.concurrent.ConcurrentHashMap$ValueIterator");
        setField(valueIterator, "next", null);
        
        Class topKSelectorClazz = Class.forName("com.google.common.collect.TopKSelector");
        Class valueIteratorType = Class.forName("java.util.Iterator");
        Method offerAllMethod = topKSelectorClazz.getDeclaredMethod("offerAll", valueIteratorType);
        offerAllMethod.setAccessible(true);
        java.lang.Object[] offerAllMethodArguments = new java.lang.Object[1];
        offerAllMethodArguments[0] = valueIterator;
        offerAllMethod.invoke(topKSelector, offerAllMethodArguments);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testOfferAll4() throws Throwable  {
        TopKSelector topKSelector = ((TopKSelector) createInstance("com.google.common.collect.TopKSelector"));
        ArrayList arrayList = new ArrayList();
        
        topKSelector.offerAll(arrayList);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testOfferAll5() throws Throwable  {
        TopKSelector topKSelector = ((TopKSelector) createInstance("com.google.common.collect.TopKSelector"));
        
        topKSelector.offerAll(((Iterable) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testOfferAll6() throws Throwable  {
        TopKSelector topKSelector = ((TopKSelector) createInstance("com.google.common.collect.TopKSelector"));
        LinkedHashSet linkedHashSet = ((LinkedHashSet) createInstance("java.util.LinkedHashSet"));
        HashMap hashMap = new HashMap();
        setField(linkedHashSet, "map", hashMap);
        
        topKSelector.offerAll(linkedHashSet);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testOfferAll7() throws Throwable  {
        TopKSelector topKSelector = ((TopKSelector) createInstance("com.google.common.collect.TopKSelector"));
        HashSet hashSet = ((HashSet) createInstance("java.util.HashSet"));
        HashMap hashMap = new HashMap();
        Integer integer = 0;
        hashMap.put(integer, null);
        hashMap.put(null, null);
        setField(hashSet, "map", hashMap);
        
        topKSelector.offerAll(hashSet);
    }
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
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testLeast1() throws Throwable  {
        TopKSelector.least(Integer.MIN_VALUE);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testLeast2() throws Throwable  {
        TopKSelector actual = TopKSelector.least(5);
        
        TopKSelector expected = ((TopKSelector) createInstance("com.google.common.collect.TopKSelector"));
        setField(expected, "k", 5);
        NaturalOrdering naturalOrdering = ((NaturalOrdering) createInstance("com.google.common.collect.NaturalOrdering"));
        setField(naturalOrdering, "nullsFirst", null);
        setField(naturalOrdering, "nullsLast", null);
        setField(expected, "comparator", naturalOrdering);
        java.lang.Object[] objectArray = new java.lang.Object[10];
        setField(expected, "buffer", objectArray);
        setField(expected, "bufferSize", 0);
        setField(expected, "threshold", null);
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testLeast3() throws Throwable  {
        TopKSelector.least(0, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testLeast4() throws Throwable  {
        TopKSelector.least(0, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testLeast5() throws Throwable  {
        Class lexicographicalComparatorClazz = Class.forName("com.google.common.primitives.Floats$LexicographicalComparator");
        Object lexicographicalComparator = getEnumConstantByName(lexicographicalComparatorClazz, "INSTANCE");
        
        Class topKSelectorClazz = Class.forName("com.google.common.collect.TopKSelector");
        Class intType = int.class;
        Class lexicographicalComparatorType = Class.forName("java.util.Comparator");
        Method leastMethod = topKSelectorClazz.getDeclaredMethod("least", intType, lexicographicalComparatorType);
        leastMethod.setAccessible(true);
        java.lang.Object[] leastMethodArguments = new java.lang.Object[2];
        leastMethodArguments[0] = 1073741824;
        leastMethodArguments[1] = lexicographicalComparator;
        try {
            leastMethod.invoke(null, leastMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testLeast6() throws Throwable  {
        Class lexicographicalComparatorClazz = Class.forName("com.google.common.primitives.Floats$LexicographicalComparator");
        Object lexicographicalComparator = getEnumConstantByName(lexicographicalComparatorClazz, "INSTANCE");
        
        Class topKSelectorClazz = Class.forName("com.google.common.collect.TopKSelector");
        Class intType = int.class;
        Class lexicographicalComparatorType = Class.forName("java.util.Comparator");
        Method leastMethod = topKSelectorClazz.getDeclaredMethod("least", intType, lexicographicalComparatorType);
        leastMethod.setAccessible(true);
        java.lang.Object[] leastMethodArguments = new java.lang.Object[2];
        leastMethodArguments[0] = 5;
        leastMethodArguments[1] = lexicographicalComparator;
        TopKSelector actual = ((TopKSelector) leastMethod.invoke(null, leastMethodArguments));
        
        TopKSelector expected = ((TopKSelector) createInstance("com.google.common.collect.TopKSelector"));
        setField(expected, "k", 5);
        Object lexicographicalComparator1 = getEnumConstantByName(lexicographicalComparatorClazz, "INSTANCE");
        setField(expected, "comparator", lexicographicalComparator1);
        java.lang.Object[] objectArray = new java.lang.Object[10];
        setField(expected, "buffer", objectArray);
        setField(expected, "bufferSize", 0);
        setField(expected, "threshold", null);
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testLeast7() throws Throwable  {
        Class lexicographicalComparatorClazz = Class.forName("com.google.common.primitives.Floats$LexicographicalComparator");
        Object lexicographicalComparator = getEnumConstantByName(lexicographicalComparatorClazz, "INSTANCE");
        
        Class topKSelectorClazz = Class.forName("com.google.common.collect.TopKSelector");
        Class intType = int.class;
        Class lexicographicalComparatorType = Class.forName("java.util.Comparator");
        Method leastMethod = topKSelectorClazz.getDeclaredMethod("least", intType, lexicographicalComparatorType);
        leastMethod.setAccessible(true);
        java.lang.Object[] leastMethodArguments = new java.lang.Object[2];
        leastMethodArguments[0] = Integer.MIN_VALUE;
        leastMethodArguments[1] = lexicographicalComparator;
        try {
            leastMethod.invoke(null, leastMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGreatest1() throws Throwable  {
        TopKSelector.greatest(0, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGreatest2() throws Throwable  {
        AllEqualOrdering allEqualOrdering = ((AllEqualOrdering) createInstance("com.google.common.collect.AllEqualOrdering"));
        
        Class topKSelectorClazz = Class.forName("com.google.common.collect.TopKSelector");
        Class intType = int.class;
        Class allEqualOrderingType = Class.forName("java.util.Comparator");
        Method greatestMethod = topKSelectorClazz.getDeclaredMethod("greatest", intType, allEqualOrderingType);
        greatestMethod.setAccessible(true);
        java.lang.Object[] greatestMethodArguments = new java.lang.Object[2];
        greatestMethodArguments[0] = 5;
        greatestMethodArguments[1] = allEqualOrdering;
        TopKSelector actual = ((TopKSelector) greatestMethod.invoke(null, greatestMethodArguments));
        
        TopKSelector expected = ((TopKSelector) createInstance("com.google.common.collect.TopKSelector"));
        setField(expected, "k", 5);
        setField(expected, "comparator", allEqualOrdering);
        java.lang.Object[] objectArray = new java.lang.Object[10];
        setField(expected, "buffer", objectArray);
        setField(expected, "bufferSize", 0);
        setField(expected, "threshold", null);
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGreatest3() throws Throwable  {
        AllEqualOrdering allEqualOrdering = ((AllEqualOrdering) createInstance("com.google.common.collect.AllEqualOrdering"));
        
        Class topKSelectorClazz = Class.forName("com.google.common.collect.TopKSelector");
        Class intType = int.class;
        Class allEqualOrderingType = Class.forName("java.util.Comparator");
        Method greatestMethod = topKSelectorClazz.getDeclaredMethod("greatest", intType, allEqualOrderingType);
        greatestMethod.setAccessible(true);
        java.lang.Object[] greatestMethodArguments = new java.lang.Object[2];
        greatestMethodArguments[0] = Integer.MIN_VALUE;
        greatestMethodArguments[1] = allEqualOrdering;
        try {
            greatestMethod.invoke(null, greatestMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGreatest4() throws Throwable  {
        TopKSelector.greatest(0, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGreatest5() throws Throwable  {
        NullsFirstOrdering nullsFirstOrdering = ((NullsFirstOrdering) createInstance("com.google.common.collect.NullsFirstOrdering"));
        AllEqualOrdering allEqualOrdering = ((AllEqualOrdering) createInstance("com.google.common.collect.AllEqualOrdering"));
        setField(nullsFirstOrdering, "ordering", allEqualOrdering);
        
        Class topKSelectorClazz = Class.forName("com.google.common.collect.TopKSelector");
        Class intType = int.class;
        Class nullsFirstOrderingType = Class.forName("java.util.Comparator");
        Method greatestMethod = topKSelectorClazz.getDeclaredMethod("greatest", intType, nullsFirstOrderingType);
        greatestMethod.setAccessible(true);
        java.lang.Object[] greatestMethodArguments = new java.lang.Object[2];
        greatestMethodArguments[0] = 1073741824;
        greatestMethodArguments[1] = nullsFirstOrdering;
        try {
            greatestMethod.invoke(null, greatestMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGreatest6() throws Throwable  {
        TopKSelector actual = TopKSelector.greatest(0);
        
        TopKSelector expected = ((TopKSelector) createInstance("com.google.common.collect.TopKSelector"));
        setField(expected, "k", 0);
        ReverseNaturalOrdering reverseNaturalOrdering = ((ReverseNaturalOrdering) createInstance("com.google.common.collect.ReverseNaturalOrdering"));
        setField(expected, "comparator", reverseNaturalOrdering);
        java.lang.Object[] objectArray = new java.lang.Object[0];
        setField(expected, "buffer", objectArray);
        setField(expected, "bufferSize", 0);
        setField(expected, "threshold", null);
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGreatest7() throws Throwable  {
        TopKSelector.greatest(1073741824);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGreatest8() throws Throwable  {
        TopKSelector actual = TopKSelector.greatest(5);
        
        TopKSelector expected = ((TopKSelector) createInstance("com.google.common.collect.TopKSelector"));
        setField(expected, "k", 5);
        ReverseNaturalOrdering reverseNaturalOrdering = ((ReverseNaturalOrdering) createInstance("com.google.common.collect.ReverseNaturalOrdering"));
        setField(expected, "comparator", reverseNaturalOrdering);
        java.lang.Object[] objectArray = new java.lang.Object[10];
        setField(expected, "buffer", objectArray);
        setField(expected, "bufferSize", 0);
        setField(expected, "threshold", null);
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGreatest9() throws Throwable  {
        TopKSelector.greatest(Integer.MIN_VALUE);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testTopKSelector1() throws Throwable  {
        Class topKSelectorClazz = Class.forName("com.google.common.collect.TopKSelector");
        Class comparatorType = Class.forName("java.util.Comparator");
        Class intType = int.class;
        Constructor topKSelectorConstructor = topKSelectorClazz.getDeclaredConstructor(comparatorType, intType);
        topKSelectorConstructor.setAccessible(true);
        java.lang.Object[] topKSelectorConstructorArguments = new java.lang.Object[2];
        topKSelectorConstructorArguments[0] = null;
        topKSelectorConstructorArguments[1] = 0;
        topKSelectorConstructor.newInstance(topKSelectorConstructorArguments);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testTopKSelector2() throws Throwable  {
        Class topKSelectorClazz = Class.forName("com.google.common.collect.TopKSelector");
        Class comparatorType = Class.forName("java.util.Comparator");
        Class intType = int.class;
        Constructor topKSelectorConstructor = topKSelectorClazz.getDeclaredConstructor(comparatorType, intType);
        topKSelectorConstructor.setAccessible(true);
        java.lang.Object[] topKSelectorConstructorArguments = new java.lang.Object[2];
        topKSelectorConstructorArguments[0] = null;
        topKSelectorConstructorArguments[1] = 0;
        topKSelectorConstructor.newInstance(topKSelectorConstructorArguments);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testTopKSelector3() throws Throwable  {
        Class lexicographicalComparatorClazz = Class.forName("com.google.common.primitives.Floats$LexicographicalComparator");
        Object lexicographicalComparator = getEnumConstantByName(lexicographicalComparatorClazz, "INSTANCE");
        Class topKSelectorClazz = Class.forName("com.google.common.collect.TopKSelector");
        Class lexicographicalComparatorType = Class.forName("java.util.Comparator");
        Class intType = int.class;
        Constructor topKSelectorConstructor = topKSelectorClazz.getDeclaredConstructor(lexicographicalComparatorType, intType);
        topKSelectorConstructor.setAccessible(true);
        java.lang.Object[] topKSelectorConstructorArguments = new java.lang.Object[2];
        topKSelectorConstructorArguments[0] = lexicographicalComparator;
        topKSelectorConstructorArguments[1] = 1073741824;
        topKSelectorConstructor.newInstance(topKSelectorConstructorArguments);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testTopKSelector4() throws Throwable  {
        Class lexicographicalComparatorClazz = Class.forName("com.google.common.primitives.UnsignedInts$LexicographicalComparator");
        Object lexicographicalComparator = getEnumConstantByName(lexicographicalComparatorClazz, "INSTANCE");
        Class topKSelectorClazz = Class.forName("com.google.common.collect.TopKSelector");
        Class lexicographicalComparatorType = Class.forName("java.util.Comparator");
        Class intType = int.class;
        Constructor topKSelectorConstructor = topKSelectorClazz.getDeclaredConstructor(lexicographicalComparatorType, intType);
        topKSelectorConstructor.setAccessible(true);
        java.lang.Object[] topKSelectorConstructorArguments = new java.lang.Object[2];
        topKSelectorConstructorArguments[0] = lexicographicalComparator;
        topKSelectorConstructorArguments[1] = 0;
        TopKSelector actual = ((TopKSelector) topKSelectorConstructor.newInstance(topKSelectorConstructorArguments));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testTopKSelector5() throws Throwable  {
        Class lexicographicalComparatorClazz = Class.forName("com.google.common.primitives.UnsignedInts$LexicographicalComparator");
        Object lexicographicalComparator = getEnumConstantByName(lexicographicalComparatorClazz, "INSTANCE");
        Class topKSelectorClazz = Class.forName("com.google.common.collect.TopKSelector");
        Class lexicographicalComparatorType = Class.forName("java.util.Comparator");
        Class intType = int.class;
        Constructor topKSelectorConstructor = topKSelectorClazz.getDeclaredConstructor(lexicographicalComparatorType, intType);
        topKSelectorConstructor.setAccessible(true);
        java.lang.Object[] topKSelectorConstructorArguments = new java.lang.Object[2];
        topKSelectorConstructorArguments[0] = lexicographicalComparator;
        topKSelectorConstructorArguments[1] = Integer.MIN_VALUE;
        topKSelectorConstructor.newInstance(topKSelectorConstructorArguments);
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
    private static Object[] createArray(String className, int length, Object... values) throws ClassNotFoundException {
        Object array = java.lang.reflect.Array.newInstance(Class.forName(className), length);
    
        for (int i = 0; i < values.length; i++) {
            java.lang.reflect.Array.set(array, i, values[i]);
        }
        
        return (Object[]) array;
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
