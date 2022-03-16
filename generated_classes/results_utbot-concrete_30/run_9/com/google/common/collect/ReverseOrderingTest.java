package com.google.common.collect;

import org.junit.Test;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.security.spec.ECFieldF2m;
import jdk.internal.org.xml.sax.SAXParseException;
import java.util.HashMap;
import com.google.common.collect.Ordering.ArbitraryOrdering;
import com.google.common.collect.Ordering;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Map;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.lang.reflect.Array;
import sun.misc.Unsafe;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class ReverseOrderingTest {
    ///region
    
    @Test(timeout = 10000)
    public void testEquals1() throws Throwable  {
        ReverseOrdering reverseOrdering = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        Object object = new Object();
        
        boolean actual = reverseOrdering.equals(object);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testEquals2() throws Throwable  {
        ReverseOrdering reverseOrdering = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        
        boolean actual = reverseOrdering.equals(reverseOrdering);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testEquals3() throws Throwable  {
        ReverseOrdering reverseOrdering = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        
        boolean actual = reverseOrdering.equals(null);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testEquals4() throws Throwable  {
        ReverseOrdering reverseOrdering = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        ReverseOrdering reverseOrdering1 = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        
        reverseOrdering.equals(reverseOrdering1);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testHashCode1() throws Throwable  {
        ReverseOrdering reverseOrdering = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        
        reverseOrdering.hashCode();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testHashCode2() throws Throwable  {
        ReverseOrdering reverseOrdering = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        CompoundOrdering compoundOrdering = ((CompoundOrdering) createInstance("com.google.common.collect.CompoundOrdering"));
        java.util.Comparator[] comparatorArray = new java.util.Comparator[0];
        setField(compoundOrdering, "comparators", comparatorArray);
        setField(reverseOrdering, "forwardOrder", compoundOrdering);
        
        int actual = reverseOrdering.hashCode();
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testHashCode3() throws Throwable  {
        ReverseOrdering reverseOrdering = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        NullsFirstOrdering nullsFirstOrdering = ((NullsFirstOrdering) createInstance("com.google.common.collect.NullsFirstOrdering"));
        setField(nullsFirstOrdering, "ordering", nullsFirstOrdering);
        setField(reverseOrdering, "forwardOrder", nullsFirstOrdering);
        
        reverseOrdering.hashCode();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testToString1() throws Throwable  {
        ReverseOrdering reverseOrdering = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        
        String actual = reverseOrdering.toString();
        
        String expected = new String("null.reverse()");
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testToString2() throws Throwable  {
        ReverseOrdering reverseOrdering = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        Object rangeLexOrdering = createInstance("com.google.common.collect.Range$RangeLexOrdering");
        setField(reverseOrdering, "forwardOrder", rangeLexOrdering);
        
        String actual = reverseOrdering.toString();
        
        String expected = new String("com.google.common.collect.Range$RangeLexOrdering@35603ba6.reverse()");
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCompare1() throws Throwable  {
        ReverseOrdering reverseOrdering = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        Object object = new Object();
        Object object1 = new Object();
        
        reverseOrdering.compare(object, object1);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCompare2() throws Throwable  {
        ReverseOrdering reverseOrdering = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        AllEqualOrdering allEqualOrdering = ((AllEqualOrdering) createInstance("com.google.common.collect.AllEqualOrdering"));
        setField(reverseOrdering, "forwardOrder", allEqualOrdering);
        
        int actual = reverseOrdering.compare(null, null);
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCompare3() throws Throwable  {
        ReverseOrdering reverseOrdering = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        NullsFirstOrdering nullsFirstOrdering = ((NullsFirstOrdering) createInstance("com.google.common.collect.NullsFirstOrdering"));
        setField(reverseOrdering, "forwardOrder", nullsFirstOrdering);
        java.lang.Object[] fifoWaitQueueArray = createArray("java.util.concurrent.SynchronousQueue$FifoWaitQueue", 0);
        
        int actual = reverseOrdering.compare(null, fifoWaitQueueArray);
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCompare4() throws Throwable  {
        ReverseOrdering reverseOrdering = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        NullsFirstOrdering nullsFirstOrdering = ((NullsFirstOrdering) createInstance("com.google.common.collect.NullsFirstOrdering"));
        setField(reverseOrdering, "forwardOrder", nullsFirstOrdering);
        java.lang.Object[] fifoWaitQueueArray = createArray("java.util.concurrent.SynchronousQueue$FifoWaitQueue", 0);
        
        int actual = reverseOrdering.compare(fifoWaitQueueArray, null);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCompare5() throws Throwable  {
        ReverseOrdering reverseOrdering = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        NullsFirstOrdering nullsFirstOrdering = ((NullsFirstOrdering) createInstance("com.google.common.collect.NullsFirstOrdering"));
        setField(reverseOrdering, "forwardOrder", nullsFirstOrdering);
        java.lang.Object[] fifoWaitQueueArray = createArray("java.util.concurrent.SynchronousQueue$FifoWaitQueue", 0);
        java.lang.Object[] fifoWaitQueueArray1 = createArray("java.util.concurrent.SynchronousQueue$FifoWaitQueue", 0);
        
        reverseOrdering.compare(fifoWaitQueueArray, fifoWaitQueueArray1);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testMin1() throws Throwable  {
        ReverseOrdering reverseOrdering = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        ArrayList arrayList = new ArrayList();
        
        reverseOrdering.min(arrayList);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testMin2() throws Throwable  {
        ReverseOrdering reverseOrdering = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        ReverseOrdering reverseOrdering1 = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        ReverseNaturalOrdering reverseNaturalOrdering = ((ReverseNaturalOrdering) createInstance("com.google.common.collect.ReverseNaturalOrdering"));
        setField(reverseOrdering1, "forwardOrder", reverseNaturalOrdering);
        setField(reverseOrdering, "forwardOrder", reverseOrdering1);
        LinkedHashSet linkedHashSet = ((LinkedHashSet) createInstance("java.util.LinkedHashSet"));
        
        reverseOrdering.min(linkedHashSet);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testMin3() throws Throwable  {
        ReverseOrdering reverseOrdering = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        ReverseOrdering reverseOrdering1 = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        ReverseOrdering reverseOrdering2 = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        ReverseNaturalOrdering reverseNaturalOrdering = ((ReverseNaturalOrdering) createInstance("com.google.common.collect.ReverseNaturalOrdering"));
        setField(reverseOrdering2, "forwardOrder", reverseNaturalOrdering);
        setField(reverseOrdering1, "forwardOrder", reverseOrdering2);
        setField(reverseOrdering, "forwardOrder", reverseOrdering1);
        
        reverseOrdering.min(((Iterable) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testMin4() throws Throwable  {
        ReverseOrdering reverseOrdering = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        
        reverseOrdering.min(((Iterator) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testMin5() throws Throwable  {
        ReverseOrdering reverseOrdering = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        ReverseOrdering reverseOrdering1 = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        ReverseNaturalOrdering reverseNaturalOrdering = ((ReverseNaturalOrdering) createInstance("com.google.common.collect.ReverseNaturalOrdering"));
        setField(reverseOrdering1, "forwardOrder", reverseNaturalOrdering);
        setField(reverseOrdering, "forwardOrder", reverseOrdering1);
        Scanner scanner = ((Scanner) createInstance("java.util.Scanner"));
        
        reverseOrdering.min(scanner);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testMin6() throws Throwable  {
        ReverseOrdering reverseOrdering = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        Object object = new Object();
        Object object1 = new Object();
        
        reverseOrdering.min(object, object1);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testMin7() throws Throwable  {
        ReverseOrdering reverseOrdering = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        ReverseNaturalOrdering reverseNaturalOrdering = ((ReverseNaturalOrdering) createInstance("com.google.common.collect.ReverseNaturalOrdering"));
        setField(reverseOrdering, "forwardOrder", reverseNaturalOrdering);
        java.lang.Object[] charArrayAsListArray = createArray("com.google.common.primitives.Chars$CharArrayAsList", 0);
        
        reverseOrdering.min(charArrayAsListArray, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testMin8() throws Throwable  {
        ReverseOrdering reverseOrdering = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        ReverseNaturalOrdering reverseNaturalOrdering = ((ReverseNaturalOrdering) createInstance("com.google.common.collect.ReverseNaturalOrdering"));
        setField(reverseOrdering, "forwardOrder", reverseNaturalOrdering);
        java.lang.Object[] descendingImmutableSortedSetArray = createArray("com.google.common.collect.DescendingImmutableSortedSet", 0);
        
        reverseOrdering.min(null, descendingImmutableSortedSetArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testMin9() throws Throwable  {
        ReverseOrdering reverseOrdering = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        ReverseOrdering reverseOrdering1 = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        setField(reverseOrdering1, "forwardOrder", reverseOrdering1);
        setField(reverseOrdering, "forwardOrder", reverseOrdering1);
        
        reverseOrdering.min(null, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testMin10() throws Throwable  {
        ReverseOrdering reverseOrdering = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        ReverseNaturalOrdering reverseNaturalOrdering = ((ReverseNaturalOrdering) createInstance("com.google.common.collect.ReverseNaturalOrdering"));
        setField(reverseOrdering, "forwardOrder", reverseNaturalOrdering);
        
        reverseOrdering.min(null, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testMin11() throws Throwable  {
        ReverseOrdering reverseOrdering = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        Object object = new Object();
        Object object1 = new Object();
        Object object2 = new Object();
        java.lang.Object[] objectArray = new java.lang.Object[0];
        
        reverseOrdering.min(object, object1, object2, objectArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testMin12() throws Throwable  {
        ReverseOrdering reverseOrdering = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        ReverseNaturalOrdering reverseNaturalOrdering = ((ReverseNaturalOrdering) createInstance("com.google.common.collect.ReverseNaturalOrdering"));
        setField(reverseOrdering, "forwardOrder", reverseNaturalOrdering);
        java.lang.Object[] findOpArray = createArray("java.util.stream.FindOps$FindOp", 9);
        java.lang.Object[] handlerArray = createArray("jdk.internal.org.objectweb.asm.Handler", 9);
        java.lang.Object[] objectArray = new java.lang.Object[9];
        
        Object initialFindOpArray0 = findOpArray[0];
        Object initialFindOpArray1 = findOpArray[1];
        Object initialFindOpArray2 = findOpArray[2];
        Object initialFindOpArray3 = findOpArray[3];
        Object initialFindOpArray4 = findOpArray[4];
        Object initialFindOpArray5 = findOpArray[5];
        Object initialFindOpArray6 = findOpArray[6];
        Object initialFindOpArray7 = findOpArray[7];
        Object initialFindOpArray8 = findOpArray[8];
        
        Object initialHandlerArray0 = handlerArray[0];
        Object initialHandlerArray1 = handlerArray[1];
        Object initialHandlerArray2 = handlerArray[2];
        Object initialHandlerArray3 = handlerArray[3];
        Object initialHandlerArray4 = handlerArray[4];
        Object initialHandlerArray5 = handlerArray[5];
        Object initialHandlerArray6 = handlerArray[6];
        Object initialHandlerArray7 = handlerArray[7];
        Object initialHandlerArray8 = handlerArray[8];
        
        reverseOrdering.min(findOpArray, handlerArray, null, objectArray);
        
        Object finalFindOpArray0 = findOpArray[0];
        Object finalFindOpArray1 = findOpArray[1];
        Object finalFindOpArray2 = findOpArray[2];
        Object finalFindOpArray3 = findOpArray[3];
        Object finalFindOpArray4 = findOpArray[4];
        Object finalFindOpArray5 = findOpArray[5];
        Object finalFindOpArray6 = findOpArray[6];
        Object finalFindOpArray7 = findOpArray[7];
        Object finalFindOpArray8 = findOpArray[8];
        
        Object finalHandlerArray0 = handlerArray[0];
        Object finalHandlerArray1 = handlerArray[1];
        Object finalHandlerArray2 = handlerArray[2];
        Object finalHandlerArray3 = handlerArray[3];
        Object finalHandlerArray4 = handlerArray[4];
        Object finalHandlerArray5 = handlerArray[5];
        Object finalHandlerArray6 = handlerArray[6];
        Object finalHandlerArray7 = handlerArray[7];
        Object finalHandlerArray8 = handlerArray[8];
        
        assertNull(finalFindOpArray0);
        
        assertNull(finalFindOpArray1);
        
        assertNull(finalFindOpArray2);
        
        assertNull(finalFindOpArray3);
        
        assertNull(finalFindOpArray4);
        
        assertNull(finalFindOpArray5);
        
        assertNull(finalFindOpArray6);
        
        assertNull(finalFindOpArray7);
        
        assertNull(finalFindOpArray8);
        
        assertNull(finalHandlerArray0);
        
        assertNull(finalHandlerArray1);
        
        assertNull(finalHandlerArray2);
        
        assertNull(finalHandlerArray3);
        
        assertNull(finalHandlerArray4);
        
        assertNull(finalHandlerArray5);
        
        assertNull(finalHandlerArray6);
        
        assertNull(finalHandlerArray7);
        
        assertNull(finalHandlerArray8);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testMin13() throws Throwable  {
        ReverseOrdering reverseOrdering = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        ReverseOrdering reverseOrdering1 = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        setField(reverseOrdering1, "forwardOrder", reverseOrdering1);
        setField(reverseOrdering, "forwardOrder", reverseOrdering1);
        java.security.spec.ECFieldF2m[] eCFieldF2mArray = new java.security.spec.ECFieldF2m[9];
        jdk.internal.org.xml.sax.SAXParseException[] sAXParseExceptionArray = new jdk.internal.org.xml.sax.SAXParseException[9];
        java.lang.Object[] operatorArray = createArray("sun.security.util.DisabledAlgorithmConstraints$Constraint$Operator", 9);
        
        ECFieldF2m initialECFieldF2mArray0 = eCFieldF2mArray[0];
        ECFieldF2m initialECFieldF2mArray1 = eCFieldF2mArray[1];
        ECFieldF2m initialECFieldF2mArray2 = eCFieldF2mArray[2];
        ECFieldF2m initialECFieldF2mArray3 = eCFieldF2mArray[3];
        ECFieldF2m initialECFieldF2mArray4 = eCFieldF2mArray[4];
        ECFieldF2m initialECFieldF2mArray5 = eCFieldF2mArray[5];
        ECFieldF2m initialECFieldF2mArray6 = eCFieldF2mArray[6];
        ECFieldF2m initialECFieldF2mArray7 = eCFieldF2mArray[7];
        ECFieldF2m initialECFieldF2mArray8 = eCFieldF2mArray[8];
        
        SAXParseException initialSAXParseExceptionArray0 = sAXParseExceptionArray[0];
        SAXParseException initialSAXParseExceptionArray1 = sAXParseExceptionArray[1];
        SAXParseException initialSAXParseExceptionArray2 = sAXParseExceptionArray[2];
        SAXParseException initialSAXParseExceptionArray3 = sAXParseExceptionArray[3];
        SAXParseException initialSAXParseExceptionArray4 = sAXParseExceptionArray[4];
        SAXParseException initialSAXParseExceptionArray5 = sAXParseExceptionArray[5];
        SAXParseException initialSAXParseExceptionArray6 = sAXParseExceptionArray[6];
        SAXParseException initialSAXParseExceptionArray7 = sAXParseExceptionArray[7];
        SAXParseException initialSAXParseExceptionArray8 = sAXParseExceptionArray[8];
        
        Object initialOperatorArray0 = operatorArray[0];
        Object initialOperatorArray1 = operatorArray[1];
        Object initialOperatorArray2 = operatorArray[2];
        Object initialOperatorArray3 = operatorArray[3];
        Object initialOperatorArray4 = operatorArray[4];
        Object initialOperatorArray5 = operatorArray[5];
        Object initialOperatorArray6 = operatorArray[6];
        Object initialOperatorArray7 = operatorArray[7];
        Object initialOperatorArray8 = operatorArray[8];
        
        reverseOrdering.min(eCFieldF2mArray, sAXParseExceptionArray, operatorArray, ((java.lang.Object[]) null));
        
        ECFieldF2m finalECFieldF2mArray0 = eCFieldF2mArray[0];
        ECFieldF2m finalECFieldF2mArray1 = eCFieldF2mArray[1];
        ECFieldF2m finalECFieldF2mArray2 = eCFieldF2mArray[2];
        ECFieldF2m finalECFieldF2mArray3 = eCFieldF2mArray[3];
        ECFieldF2m finalECFieldF2mArray4 = eCFieldF2mArray[4];
        ECFieldF2m finalECFieldF2mArray5 = eCFieldF2mArray[5];
        ECFieldF2m finalECFieldF2mArray6 = eCFieldF2mArray[6];
        ECFieldF2m finalECFieldF2mArray7 = eCFieldF2mArray[7];
        ECFieldF2m finalECFieldF2mArray8 = eCFieldF2mArray[8];
        
        SAXParseException finalSAXParseExceptionArray0 = sAXParseExceptionArray[0];
        SAXParseException finalSAXParseExceptionArray1 = sAXParseExceptionArray[1];
        SAXParseException finalSAXParseExceptionArray2 = sAXParseExceptionArray[2];
        SAXParseException finalSAXParseExceptionArray3 = sAXParseExceptionArray[3];
        SAXParseException finalSAXParseExceptionArray4 = sAXParseExceptionArray[4];
        SAXParseException finalSAXParseExceptionArray5 = sAXParseExceptionArray[5];
        SAXParseException finalSAXParseExceptionArray6 = sAXParseExceptionArray[6];
        SAXParseException finalSAXParseExceptionArray7 = sAXParseExceptionArray[7];
        SAXParseException finalSAXParseExceptionArray8 = sAXParseExceptionArray[8];
        
        Object finalOperatorArray0 = operatorArray[0];
        Object finalOperatorArray1 = operatorArray[1];
        Object finalOperatorArray2 = operatorArray[2];
        Object finalOperatorArray3 = operatorArray[3];
        Object finalOperatorArray4 = operatorArray[4];
        Object finalOperatorArray5 = operatorArray[5];
        Object finalOperatorArray6 = operatorArray[6];
        Object finalOperatorArray7 = operatorArray[7];
        Object finalOperatorArray8 = operatorArray[8];
        
        assertNull(finalECFieldF2mArray0);
        
        assertNull(finalECFieldF2mArray1);
        
        assertNull(finalECFieldF2mArray2);
        
        assertNull(finalECFieldF2mArray3);
        
        assertNull(finalECFieldF2mArray4);
        
        assertNull(finalECFieldF2mArray5);
        
        assertNull(finalECFieldF2mArray6);
        
        assertNull(finalECFieldF2mArray7);
        
        assertNull(finalECFieldF2mArray8);
        
        assertNull(finalSAXParseExceptionArray0);
        
        assertNull(finalSAXParseExceptionArray1);
        
        assertNull(finalSAXParseExceptionArray2);
        
        assertNull(finalSAXParseExceptionArray3);
        
        assertNull(finalSAXParseExceptionArray4);
        
        assertNull(finalSAXParseExceptionArray5);
        
        assertNull(finalSAXParseExceptionArray6);
        
        assertNull(finalSAXParseExceptionArray7);
        
        assertNull(finalSAXParseExceptionArray8);
        
        assertNull(finalOperatorArray0);
        
        assertNull(finalOperatorArray1);
        
        assertNull(finalOperatorArray2);
        
        assertNull(finalOperatorArray3);
        
        assertNull(finalOperatorArray4);
        
        assertNull(finalOperatorArray5);
        
        assertNull(finalOperatorArray6);
        
        assertNull(finalOperatorArray7);
        
        assertNull(finalOperatorArray8);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testMax1() throws Throwable  {
        ReverseOrdering reverseOrdering = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        Object object = new Object();
        Object object1 = new Object();
        
        reverseOrdering.max(object, object1);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testMax2() throws Throwable  {
        ReverseOrdering reverseOrdering = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        ReverseNaturalOrdering reverseNaturalOrdering = ((ReverseNaturalOrdering) createInstance("com.google.common.collect.ReverseNaturalOrdering"));
        setField(reverseOrdering, "forwardOrder", reverseNaturalOrdering);
        java.lang.Object[] charArrayAsListArray = createArray("com.google.common.primitives.Chars$CharArrayAsList", 0);
        
        reverseOrdering.max(charArrayAsListArray, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testMax3() throws Throwable  {
        ReverseOrdering reverseOrdering = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        ReverseNaturalOrdering reverseNaturalOrdering = ((ReverseNaturalOrdering) createInstance("com.google.common.collect.ReverseNaturalOrdering"));
        setField(reverseOrdering, "forwardOrder", reverseNaturalOrdering);
        java.lang.Object[] descendingImmutableSortedSetArray = createArray("com.google.common.collect.DescendingImmutableSortedSet", 0);
        
        reverseOrdering.max(null, descendingImmutableSortedSetArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testMax4() throws Throwable  {
        ReverseOrdering reverseOrdering = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        ReverseOrdering reverseOrdering1 = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        ReverseNaturalOrdering reverseNaturalOrdering = ((ReverseNaturalOrdering) createInstance("com.google.common.collect.ReverseNaturalOrdering"));
        setField(reverseOrdering1, "forwardOrder", reverseNaturalOrdering);
        setField(reverseOrdering, "forwardOrder", reverseOrdering1);
        java.lang.Object[] ofDoubleArray = createArray("java.util.stream.Nodes$InternalNodeSpliterator$OfDouble", 0);
        
        reverseOrdering.max(ofDoubleArray, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testMax5() throws Throwable  {
        ReverseOrdering reverseOrdering = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        ReverseNaturalOrdering reverseNaturalOrdering = ((ReverseNaturalOrdering) createInstance("com.google.common.collect.ReverseNaturalOrdering"));
        setField(reverseOrdering, "forwardOrder", reverseNaturalOrdering);
        
        reverseOrdering.max(null, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testMax6() throws Throwable  {
        ReverseOrdering reverseOrdering = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        ArrayList arrayList = new ArrayList();
        
        reverseOrdering.max(arrayList);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testMax7() throws Throwable  {
        ReverseOrdering reverseOrdering = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        ReverseOrdering reverseOrdering1 = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        ReverseNaturalOrdering reverseNaturalOrdering = ((ReverseNaturalOrdering) createInstance("com.google.common.collect.ReverseNaturalOrdering"));
        setField(reverseOrdering1, "forwardOrder", reverseNaturalOrdering);
        setField(reverseOrdering, "forwardOrder", reverseOrdering1);
        LinkedHashSet linkedHashSet = ((LinkedHashSet) createInstance("java.util.LinkedHashSet"));
        HashMap hashMap = new HashMap();
        setField(linkedHashSet, "map", hashMap);
        
        reverseOrdering.max(linkedHashSet);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testMax8() throws Throwable  {
        ReverseOrdering reverseOrdering = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        ReverseOrdering reverseOrdering1 = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        ReverseOrdering reverseOrdering2 = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        ReverseNaturalOrdering reverseNaturalOrdering = ((ReverseNaturalOrdering) createInstance("com.google.common.collect.ReverseNaturalOrdering"));
        setField(reverseOrdering2, "forwardOrder", reverseNaturalOrdering);
        setField(reverseOrdering1, "forwardOrder", reverseOrdering2);
        setField(reverseOrdering, "forwardOrder", reverseOrdering1);
        
        reverseOrdering.max(((Iterable) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testMax9() throws Throwable  {
        ReverseOrdering reverseOrdering = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        
        reverseOrdering.max(((Iterator) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testMax10() throws Throwable  {
        ReverseOrdering reverseOrdering = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        ReverseOrdering reverseOrdering1 = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        ReverseNaturalOrdering reverseNaturalOrdering = ((ReverseNaturalOrdering) createInstance("com.google.common.collect.ReverseNaturalOrdering"));
        setField(reverseOrdering1, "forwardOrder", reverseNaturalOrdering);
        setField(reverseOrdering, "forwardOrder", reverseOrdering1);
        Scanner scanner = ((Scanner) createInstance("java.util.Scanner"));
        
        reverseOrdering.max(scanner);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testMax11() throws Throwable  {
        ReverseOrdering reverseOrdering = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        Object object = new Object();
        Object object1 = new Object();
        Object object2 = new Object();
        java.lang.Object[] objectArray = new java.lang.Object[0];
        
        reverseOrdering.max(object, object1, object2, objectArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testMax12() throws Throwable  {
        ReverseOrdering reverseOrdering = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        ReverseNaturalOrdering reverseNaturalOrdering = ((ReverseNaturalOrdering) createInstance("com.google.common.collect.ReverseNaturalOrdering"));
        setField(reverseOrdering, "forwardOrder", reverseNaturalOrdering);
        Byte byte1 = (byte) 0;
        Integer integer = 0;
        java.lang.Comparable[] comparableArray = new java.lang.Comparable[9];
        
        Comparable initialComparableArray0 = comparableArray[0];
        Comparable initialComparableArray1 = comparableArray[1];
        Comparable initialComparableArray2 = comparableArray[2];
        Comparable initialComparableArray3 = comparableArray[3];
        Comparable initialComparableArray4 = comparableArray[4];
        Comparable initialComparableArray5 = comparableArray[5];
        Comparable initialComparableArray6 = comparableArray[6];
        Comparable initialComparableArray7 = comparableArray[7];
        Comparable initialComparableArray8 = comparableArray[8];
        
        reverseOrdering.max(byte1, null, integer, comparableArray);
        
        Comparable finalComparableArray0 = comparableArray[0];
        Comparable finalComparableArray1 = comparableArray[1];
        Comparable finalComparableArray2 = comparableArray[2];
        Comparable finalComparableArray3 = comparableArray[3];
        Comparable finalComparableArray4 = comparableArray[4];
        Comparable finalComparableArray5 = comparableArray[5];
        Comparable finalComparableArray6 = comparableArray[6];
        Comparable finalComparableArray7 = comparableArray[7];
        Comparable finalComparableArray8 = comparableArray[8];
        
        assertNull(finalComparableArray0);
        
        assertNull(finalComparableArray1);
        
        assertNull(finalComparableArray2);
        
        assertNull(finalComparableArray3);
        
        assertNull(finalComparableArray4);
        
        assertNull(finalComparableArray5);
        
        assertNull(finalComparableArray6);
        
        assertNull(finalComparableArray7);
        
        assertNull(finalComparableArray8);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testMax13() throws Throwable  {
        ReverseOrdering reverseOrdering = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        ReverseOrdering reverseOrdering1 = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        setField(reverseOrdering1, "forwardOrder", reverseOrdering1);
        setField(reverseOrdering, "forwardOrder", reverseOrdering1);
        java.security.spec.ECFieldF2m[] eCFieldF2mArray = new java.security.spec.ECFieldF2m[9];
        jdk.internal.org.xml.sax.SAXParseException[] sAXParseExceptionArray = new jdk.internal.org.xml.sax.SAXParseException[9];
        java.lang.Object[] operatorArray = createArray("sun.security.util.DisabledAlgorithmConstraints$Constraint$Operator", 9);
        
        ECFieldF2m initialECFieldF2mArray0 = eCFieldF2mArray[0];
        ECFieldF2m initialECFieldF2mArray1 = eCFieldF2mArray[1];
        ECFieldF2m initialECFieldF2mArray2 = eCFieldF2mArray[2];
        ECFieldF2m initialECFieldF2mArray3 = eCFieldF2mArray[3];
        ECFieldF2m initialECFieldF2mArray4 = eCFieldF2mArray[4];
        ECFieldF2m initialECFieldF2mArray5 = eCFieldF2mArray[5];
        ECFieldF2m initialECFieldF2mArray6 = eCFieldF2mArray[6];
        ECFieldF2m initialECFieldF2mArray7 = eCFieldF2mArray[7];
        ECFieldF2m initialECFieldF2mArray8 = eCFieldF2mArray[8];
        
        SAXParseException initialSAXParseExceptionArray0 = sAXParseExceptionArray[0];
        SAXParseException initialSAXParseExceptionArray1 = sAXParseExceptionArray[1];
        SAXParseException initialSAXParseExceptionArray2 = sAXParseExceptionArray[2];
        SAXParseException initialSAXParseExceptionArray3 = sAXParseExceptionArray[3];
        SAXParseException initialSAXParseExceptionArray4 = sAXParseExceptionArray[4];
        SAXParseException initialSAXParseExceptionArray5 = sAXParseExceptionArray[5];
        SAXParseException initialSAXParseExceptionArray6 = sAXParseExceptionArray[6];
        SAXParseException initialSAXParseExceptionArray7 = sAXParseExceptionArray[7];
        SAXParseException initialSAXParseExceptionArray8 = sAXParseExceptionArray[8];
        
        Object initialOperatorArray0 = operatorArray[0];
        Object initialOperatorArray1 = operatorArray[1];
        Object initialOperatorArray2 = operatorArray[2];
        Object initialOperatorArray3 = operatorArray[3];
        Object initialOperatorArray4 = operatorArray[4];
        Object initialOperatorArray5 = operatorArray[5];
        Object initialOperatorArray6 = operatorArray[6];
        Object initialOperatorArray7 = operatorArray[7];
        Object initialOperatorArray8 = operatorArray[8];
        
        reverseOrdering.max(eCFieldF2mArray, sAXParseExceptionArray, operatorArray, ((java.lang.Object[]) null));
        
        ECFieldF2m finalECFieldF2mArray0 = eCFieldF2mArray[0];
        ECFieldF2m finalECFieldF2mArray1 = eCFieldF2mArray[1];
        ECFieldF2m finalECFieldF2mArray2 = eCFieldF2mArray[2];
        ECFieldF2m finalECFieldF2mArray3 = eCFieldF2mArray[3];
        ECFieldF2m finalECFieldF2mArray4 = eCFieldF2mArray[4];
        ECFieldF2m finalECFieldF2mArray5 = eCFieldF2mArray[5];
        ECFieldF2m finalECFieldF2mArray6 = eCFieldF2mArray[6];
        ECFieldF2m finalECFieldF2mArray7 = eCFieldF2mArray[7];
        ECFieldF2m finalECFieldF2mArray8 = eCFieldF2mArray[8];
        
        SAXParseException finalSAXParseExceptionArray0 = sAXParseExceptionArray[0];
        SAXParseException finalSAXParseExceptionArray1 = sAXParseExceptionArray[1];
        SAXParseException finalSAXParseExceptionArray2 = sAXParseExceptionArray[2];
        SAXParseException finalSAXParseExceptionArray3 = sAXParseExceptionArray[3];
        SAXParseException finalSAXParseExceptionArray4 = sAXParseExceptionArray[4];
        SAXParseException finalSAXParseExceptionArray5 = sAXParseExceptionArray[5];
        SAXParseException finalSAXParseExceptionArray6 = sAXParseExceptionArray[6];
        SAXParseException finalSAXParseExceptionArray7 = sAXParseExceptionArray[7];
        SAXParseException finalSAXParseExceptionArray8 = sAXParseExceptionArray[8];
        
        Object finalOperatorArray0 = operatorArray[0];
        Object finalOperatorArray1 = operatorArray[1];
        Object finalOperatorArray2 = operatorArray[2];
        Object finalOperatorArray3 = operatorArray[3];
        Object finalOperatorArray4 = operatorArray[4];
        Object finalOperatorArray5 = operatorArray[5];
        Object finalOperatorArray6 = operatorArray[6];
        Object finalOperatorArray7 = operatorArray[7];
        Object finalOperatorArray8 = operatorArray[8];
        
        assertNull(finalECFieldF2mArray0);
        
        assertNull(finalECFieldF2mArray1);
        
        assertNull(finalECFieldF2mArray2);
        
        assertNull(finalECFieldF2mArray3);
        
        assertNull(finalECFieldF2mArray4);
        
        assertNull(finalECFieldF2mArray5);
        
        assertNull(finalECFieldF2mArray6);
        
        assertNull(finalECFieldF2mArray7);
        
        assertNull(finalECFieldF2mArray8);
        
        assertNull(finalSAXParseExceptionArray0);
        
        assertNull(finalSAXParseExceptionArray1);
        
        assertNull(finalSAXParseExceptionArray2);
        
        assertNull(finalSAXParseExceptionArray3);
        
        assertNull(finalSAXParseExceptionArray4);
        
        assertNull(finalSAXParseExceptionArray5);
        
        assertNull(finalSAXParseExceptionArray6);
        
        assertNull(finalSAXParseExceptionArray7);
        
        assertNull(finalSAXParseExceptionArray8);
        
        assertNull(finalOperatorArray0);
        
        assertNull(finalOperatorArray1);
        
        assertNull(finalOperatorArray2);
        
        assertNull(finalOperatorArray3);
        
        assertNull(finalOperatorArray4);
        
        assertNull(finalOperatorArray5);
        
        assertNull(finalOperatorArray6);
        
        assertNull(finalOperatorArray7);
        
        assertNull(finalOperatorArray8);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReverse1() throws Throwable  {
        ReverseOrdering reverseOrdering = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        
        Ordering actual = reverseOrdering.reverse();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReverse2() throws Throwable  {
        ReverseOrdering reverseOrdering = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        Ordering.ArbitraryOrdering arbitraryOrdering = ((Ordering.ArbitraryOrdering) createInstance("com.google.common.collect.Ordering$ArbitraryOrdering"));
        setField(reverseOrdering, "forwardOrder", arbitraryOrdering);
        
        Ordering actual = reverseOrdering.reverse();
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(arbitraryOrdering, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReverseOrdering1() {
        new ReverseOrdering(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReverseOrdering2() throws Throwable  {
        NaturalOrdering naturalOrdering = ((NaturalOrdering) createInstance("com.google.common.collect.NaturalOrdering"));
        ReverseOrdering actual = new ReverseOrdering(naturalOrdering);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReverseOrdering3() {
        new ReverseOrdering(null);
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
