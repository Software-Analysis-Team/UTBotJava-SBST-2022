package com.google.common.collect;

import org.junit.Test;
import java.util.Comparator;
import jdk.internal.org.xml.sax.InputSource;
import sun.misc.ASCIICaseInsensitiveComparator;
import sun.security.util.ByteArrayLexOrder;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import sun.net.www.protocol.http.HttpURLConnection.TunnelState;
import sun.net.www.protocol.http.HttpURLConnection;
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
import static java.lang.reflect.Array.get;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;

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
    
    @Test(timeout = 10000)
    public void testEquals4() throws Throwable  {
        ReverseOrdering reverseOrdering = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        NaturalOrdering naturalOrdering = ((NaturalOrdering) createInstance("com.google.common.collect.NaturalOrdering"));
        setField(reverseOrdering, "forwardOrder", naturalOrdering);
        ReverseOrdering reverseOrdering1 = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        setField(reverseOrdering1, "forwardOrder", naturalOrdering);
        
        boolean actual = reverseOrdering.equals(reverseOrdering1);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testEquals5() throws Throwable  {
        ReverseOrdering reverseOrdering = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        NullsFirstOrdering nullsFirstOrdering = ((NullsFirstOrdering) createInstance("com.google.common.collect.NullsFirstOrdering"));
        setField(reverseOrdering, "forwardOrder", nullsFirstOrdering);
        ReverseOrdering reverseOrdering1 = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        setField(reverseOrdering1, "forwardOrder", nullsFirstOrdering);
        
        boolean actual = reverseOrdering.equals(reverseOrdering1);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testEquals6() throws Throwable  {
        ReverseOrdering reverseOrdering = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        NullsFirstOrdering nullsFirstOrdering = ((NullsFirstOrdering) createInstance("com.google.common.collect.NullsFirstOrdering"));
        setField(reverseOrdering, "forwardOrder", nullsFirstOrdering);
        ReverseOrdering reverseOrdering1 = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        ReverseOrdering reverseOrdering2 = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        setField(reverseOrdering2, "forwardOrder", null);
        setField(reverseOrdering1, "forwardOrder", reverseOrdering2);
        
        boolean actual = reverseOrdering.equals(reverseOrdering1);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testEquals7() throws Throwable  {
        ReverseOrdering reverseOrdering = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        NullsFirstOrdering nullsFirstOrdering = ((NullsFirstOrdering) createInstance("com.google.common.collect.NullsFirstOrdering"));
        UsingToStringOrdering usingToStringOrdering = ((UsingToStringOrdering) createInstance("com.google.common.collect.UsingToStringOrdering"));
        setField(nullsFirstOrdering, "ordering", usingToStringOrdering);
        setField(reverseOrdering, "forwardOrder", nullsFirstOrdering);
        ReverseOrdering reverseOrdering1 = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        NullsFirstOrdering nullsFirstOrdering1 = ((NullsFirstOrdering) createInstance("com.google.common.collect.NullsFirstOrdering"));
        setField(nullsFirstOrdering1, "ordering", usingToStringOrdering);
        setField(reverseOrdering1, "forwardOrder", nullsFirstOrdering1);
        
        boolean actual = reverseOrdering.equals(reverseOrdering1);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testEquals8() throws Throwable  {
        ReverseOrdering reverseOrdering = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        NullsFirstOrdering nullsFirstOrdering = ((NullsFirstOrdering) createInstance("com.google.common.collect.NullsFirstOrdering"));
        NullsFirstOrdering nullsFirstOrdering1 = ((NullsFirstOrdering) createInstance("com.google.common.collect.NullsFirstOrdering"));
        NullsFirstOrdering nullsFirstOrdering2 = ((NullsFirstOrdering) createInstance("com.google.common.collect.NullsFirstOrdering"));
        NullsFirstOrdering nullsFirstOrdering3 = ((NullsFirstOrdering) createInstance("com.google.common.collect.NullsFirstOrdering"));
        CompoundOrdering compoundOrdering = ((CompoundOrdering) createInstance("com.google.common.collect.CompoundOrdering"));
        java.util.Comparator[] comparatorArray = new java.util.Comparator[1];
        Object caseInsensitiveComparator = createInstance("java.lang.String$CaseInsensitiveComparator");
        comparatorArray[0] = ((Comparator) caseInsensitiveComparator);
        setField(compoundOrdering, "comparators", comparatorArray);
        setField(nullsFirstOrdering3, "ordering", compoundOrdering);
        setField(nullsFirstOrdering2, "ordering", nullsFirstOrdering3);
        setField(nullsFirstOrdering1, "ordering", nullsFirstOrdering2);
        setField(nullsFirstOrdering, "ordering", nullsFirstOrdering1);
        setField(reverseOrdering, "forwardOrder", nullsFirstOrdering);
        ReverseOrdering reverseOrdering1 = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        NullsFirstOrdering nullsFirstOrdering4 = ((NullsFirstOrdering) createInstance("com.google.common.collect.NullsFirstOrdering"));
        NullsFirstOrdering nullsFirstOrdering5 = ((NullsFirstOrdering) createInstance("com.google.common.collect.NullsFirstOrdering"));
        NullsFirstOrdering nullsFirstOrdering6 = ((NullsFirstOrdering) createInstance("com.google.common.collect.NullsFirstOrdering"));
        NullsFirstOrdering nullsFirstOrdering7 = ((NullsFirstOrdering) createInstance("com.google.common.collect.NullsFirstOrdering"));
        CompoundOrdering compoundOrdering1 = ((CompoundOrdering) createInstance("com.google.common.collect.CompoundOrdering"));
        java.util.Comparator[] comparatorArray1 = new java.util.Comparator[1];
        setField(compoundOrdering1, "comparators", comparatorArray1);
        setField(nullsFirstOrdering7, "ordering", compoundOrdering1);
        setField(nullsFirstOrdering6, "ordering", nullsFirstOrdering7);
        setField(nullsFirstOrdering5, "ordering", nullsFirstOrdering6);
        setField(nullsFirstOrdering4, "ordering", nullsFirstOrdering5);
        setField(reverseOrdering1, "forwardOrder", nullsFirstOrdering4);
        
        Ordering ordering = reverseOrdering1.forwardOrder;
        Object orderingForwardOrderOrdering = getFieldValue(ordering, "ordering");
        Object orderingForwardOrderOrderingForwardOrderOrderingOrdering = getFieldValue(orderingForwardOrderOrdering, "ordering");
        Object orderingForwardOrderOrderingForwardOrderOrderingOrderingForwardOrderOrderingOrderingOrdering = getFieldValue(orderingForwardOrderOrderingForwardOrderOrderingOrdering, "ordering");
        Object orderingForwardOrderOrderingForwardOrderOrderingOrderingForwardOrderOrderingOrderingOrderingForwardOrderOrderingOrderingOrderingOrdering = getFieldValue(orderingForwardOrderOrderingForwardOrderOrderingOrderingForwardOrderOrderingOrderingOrdering, "ordering");
        Object orderingForwardOrderOrderingForwardOrderOrderingOrderingForwardOrderOrderingOrderingOrderingForwardOrderOrderingOrderingOrderingOrderingForwardOrderOrderingOrderingOrderingOrderingComparators = getFieldValue(orderingForwardOrderOrderingForwardOrderOrderingOrderingForwardOrderOrderingOrderingOrderingForwardOrderOrderingOrderingOrderingOrdering, "comparators");
        Object initialReverseOrdering1ForwardOrderOrderingOrderingOrderingOrderingComparators0 = get(orderingForwardOrderOrderingForwardOrderOrderingOrderingForwardOrderOrderingOrderingOrderingForwardOrderOrderingOrderingOrderingOrderingForwardOrderOrderingOrderingOrderingOrderingComparators, 0);
        
        boolean actual = reverseOrdering.equals(reverseOrdering1);
        
        assertFalse(actual);
        
        Ordering ordering1 = reverseOrdering1.forwardOrder;
        Object ordering1ForwardOrderOrdering = getFieldValue(ordering1, "ordering");
        Object ordering1ForwardOrderOrderingForwardOrderOrderingOrdering = getFieldValue(ordering1ForwardOrderOrdering, "ordering");
        Object ordering1ForwardOrderOrderingForwardOrderOrderingOrderingForwardOrderOrderingOrderingOrdering = getFieldValue(ordering1ForwardOrderOrderingForwardOrderOrderingOrdering, "ordering");
        Object ordering1ForwardOrderOrderingForwardOrderOrderingOrderingForwardOrderOrderingOrderingOrderingForwardOrderOrderingOrderingOrderingOrdering = getFieldValue(ordering1ForwardOrderOrderingForwardOrderOrderingOrderingForwardOrderOrderingOrderingOrdering, "ordering");
        Object ordering1ForwardOrderOrderingForwardOrderOrderingOrderingForwardOrderOrderingOrderingOrderingForwardOrderOrderingOrderingOrderingOrderingForwardOrderOrderingOrderingOrderingOrderingComparators = getFieldValue(ordering1ForwardOrderOrderingForwardOrderOrderingOrderingForwardOrderOrderingOrderingOrderingForwardOrderOrderingOrderingOrderingOrdering, "comparators");
        Object finalReverseOrdering1ForwardOrderOrderingOrderingOrderingOrderingComparators0 = get(ordering1ForwardOrderOrderingForwardOrderOrderingOrderingForwardOrderOrderingOrderingOrderingForwardOrderOrderingOrderingOrderingOrderingForwardOrderOrderingOrderingOrderingOrderingComparators, 0);
        
        assertNull(finalReverseOrdering1ForwardOrderOrderingOrderingOrderingOrderingComparators0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testEquals9() throws Throwable  {
        ReverseOrdering reverseOrdering = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        NullsFirstOrdering nullsFirstOrdering = ((NullsFirstOrdering) createInstance("com.google.common.collect.NullsFirstOrdering"));
        NullsFirstOrdering nullsFirstOrdering1 = ((NullsFirstOrdering) createInstance("com.google.common.collect.NullsFirstOrdering"));
        NullsFirstOrdering nullsFirstOrdering2 = ((NullsFirstOrdering) createInstance("com.google.common.collect.NullsFirstOrdering"));
        NullsFirstOrdering nullsFirstOrdering3 = ((NullsFirstOrdering) createInstance("com.google.common.collect.NullsFirstOrdering"));
        CompoundOrdering compoundOrdering = ((CompoundOrdering) createInstance("com.google.common.collect.CompoundOrdering"));
        setField(nullsFirstOrdering3, "ordering", compoundOrdering);
        setField(nullsFirstOrdering2, "ordering", nullsFirstOrdering3);
        setField(nullsFirstOrdering1, "ordering", nullsFirstOrdering2);
        setField(nullsFirstOrdering, "ordering", nullsFirstOrdering1);
        setField(reverseOrdering, "forwardOrder", nullsFirstOrdering);
        ReverseOrdering reverseOrdering1 = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        NullsFirstOrdering nullsFirstOrdering4 = ((NullsFirstOrdering) createInstance("com.google.common.collect.NullsFirstOrdering"));
        NullsFirstOrdering nullsFirstOrdering5 = ((NullsFirstOrdering) createInstance("com.google.common.collect.NullsFirstOrdering"));
        NullsFirstOrdering nullsFirstOrdering6 = ((NullsFirstOrdering) createInstance("com.google.common.collect.NullsFirstOrdering"));
        NullsFirstOrdering nullsFirstOrdering7 = ((NullsFirstOrdering) createInstance("com.google.common.collect.NullsFirstOrdering"));
        ReverseNaturalOrdering reverseNaturalOrdering = ((ReverseNaturalOrdering) createInstance("com.google.common.collect.ReverseNaturalOrdering"));
        setField(nullsFirstOrdering7, "ordering", reverseNaturalOrdering);
        setField(nullsFirstOrdering6, "ordering", nullsFirstOrdering7);
        setField(nullsFirstOrdering5, "ordering", nullsFirstOrdering6);
        setField(nullsFirstOrdering4, "ordering", nullsFirstOrdering5);
        setField(reverseOrdering1, "forwardOrder", nullsFirstOrdering4);
        
        boolean actual = reverseOrdering.equals(reverseOrdering1);
        
        assertFalse(actual);
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
    
    @Test(timeout = 10000)
    public void testHashCode3() throws Throwable  {
        ReverseOrdering reverseOrdering = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        NullsFirstOrdering nullsFirstOrdering = ((NullsFirstOrdering) createInstance("com.google.common.collect.NullsFirstOrdering"));
        CompoundOrdering compoundOrdering = ((CompoundOrdering) createInstance("com.google.common.collect.CompoundOrdering"));
        java.util.Comparator[] comparatorArray = new java.util.Comparator[0];
        setField(compoundOrdering, "comparators", comparatorArray);
        setField(nullsFirstOrdering, "ordering", compoundOrdering);
        setField(reverseOrdering, "forwardOrder", nullsFirstOrdering);
        
        int actual = reverseOrdering.hashCode();
        
        assertEquals(-957692533, actual);
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
        
        String expected = new String("com.google.common.collect.Range$RangeLexOrdering@3ea7d816.reverse()");
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testToString3() throws Throwable  {
        ReverseOrdering reverseOrdering = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        AllEqualOrdering allEqualOrdering = ((AllEqualOrdering) createInstance("com.google.common.collect.AllEqualOrdering"));
        setField(reverseOrdering, "forwardOrder", allEqualOrdering);
        
        String actual = reverseOrdering.toString();
        
        String expected = new String("Ordering.allEqual().reverse()");
        
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
    
    @Test(timeout = 10000)
    public void testCompare5() throws Throwable  {
        ReverseOrdering reverseOrdering = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        NullsFirstOrdering nullsFirstOrdering = ((NullsFirstOrdering) createInstance("com.google.common.collect.NullsFirstOrdering"));
        AllEqualOrdering allEqualOrdering = ((AllEqualOrdering) createInstance("com.google.common.collect.AllEqualOrdering"));
        setField(nullsFirstOrdering, "ordering", allEqualOrdering);
        setField(reverseOrdering, "forwardOrder", nullsFirstOrdering);
        java.lang.Object[] ofLongArray = createArray("java.util.stream.Nodes$CollectorTask$OfLong", 0);
        java.lang.Object[] operatorArray = createArray("sun.security.util.DisabledAlgorithmConstraints$Constraint$Operator", 0);
        
        int actual = reverseOrdering.compare(ofLongArray, operatorArray);
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCompare6() throws Throwable  {
        ReverseOrdering reverseOrdering = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        NullsFirstOrdering nullsFirstOrdering = ((NullsFirstOrdering) createInstance("com.google.common.collect.NullsFirstOrdering"));
        NullsFirstOrdering nullsFirstOrdering1 = ((NullsFirstOrdering) createInstance("com.google.common.collect.NullsFirstOrdering"));
        CompoundOrdering compoundOrdering = ((CompoundOrdering) createInstance("com.google.common.collect.CompoundOrdering"));
        java.util.Comparator[] comparatorArray = new java.util.Comparator[0];
        setField(compoundOrdering, "comparators", comparatorArray);
        setField(nullsFirstOrdering1, "ordering", compoundOrdering);
        setField(nullsFirstOrdering, "ordering", nullsFirstOrdering1);
        setField(reverseOrdering, "forwardOrder", nullsFirstOrdering);
        java.lang.Object[] fifoWaitQueueArray = createArray("java.util.concurrent.SynchronousQueue$FifoWaitQueue", 0);
        jdk.internal.org.xml.sax.InputSource[] inputSourceArray = new jdk.internal.org.xml.sax.InputSource[0];
        
        int actual = reverseOrdering.compare(fifoWaitQueueArray, inputSourceArray);
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCompare7() throws Throwable  {
        ReverseOrdering reverseOrdering = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        NullsFirstOrdering nullsFirstOrdering = ((NullsFirstOrdering) createInstance("com.google.common.collect.NullsFirstOrdering"));
        NullsFirstOrdering nullsFirstOrdering1 = ((NullsFirstOrdering) createInstance("com.google.common.collect.NullsFirstOrdering"));
        CompoundOrdering compoundOrdering = ((CompoundOrdering) createInstance("com.google.common.collect.CompoundOrdering"));
        java.util.Comparator[] comparatorArray = new java.util.Comparator[9];
        ASCIICaseInsensitiveComparator aSCIICaseInsensitiveComparator = ((ASCIICaseInsensitiveComparator) createInstance("sun.misc.ASCIICaseInsensitiveComparator"));
        comparatorArray[0] = ((Comparator) aSCIICaseInsensitiveComparator);
        setField(compoundOrdering, "comparators", comparatorArray);
        setField(nullsFirstOrdering1, "ordering", compoundOrdering);
        setField(nullsFirstOrdering, "ordering", nullsFirstOrdering1);
        setField(reverseOrdering, "forwardOrder", nullsFirstOrdering);
        java.lang.Object[] ofDoubleArray = createArray("java.util.stream.ForEachOps$ForEachOp$OfDouble", 0);
        String string = ((String) createInstance("java.lang.String"));
        
        reverseOrdering.compare(ofDoubleArray, string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCompare8() throws Throwable  {
        ReverseOrdering reverseOrdering = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        NullsFirstOrdering nullsFirstOrdering = ((NullsFirstOrdering) createInstance("com.google.common.collect.NullsFirstOrdering"));
        NullsFirstOrdering nullsFirstOrdering1 = ((NullsFirstOrdering) createInstance("com.google.common.collect.NullsFirstOrdering"));
        CompoundOrdering compoundOrdering = ((CompoundOrdering) createInstance("com.google.common.collect.CompoundOrdering"));
        java.util.Comparator[] comparatorArray = new java.util.Comparator[9];
        ByteArrayLexOrder byteArrayLexOrder = ((ByteArrayLexOrder) createInstance("sun.security.util.ByteArrayLexOrder"));
        comparatorArray[0] = ((Comparator) byteArrayLexOrder);
        setField(compoundOrdering, "comparators", comparatorArray);
        setField(nullsFirstOrdering1, "ordering", compoundOrdering);
        setField(nullsFirstOrdering, "ordering", nullsFirstOrdering1);
        setField(reverseOrdering, "forwardOrder", nullsFirstOrdering);
        byte[] byteArray = new byte[9];
        byte[] byteArray1 = new byte[0];
        
        Ordering ordering = reverseOrdering.forwardOrder;
        Object orderingForwardOrderOrdering = getFieldValue(ordering, "ordering");
        Object orderingForwardOrderOrderingForwardOrderOrderingOrdering = getFieldValue(orderingForwardOrderOrdering, "ordering");
        Object orderingForwardOrderOrderingForwardOrderOrderingOrderingForwardOrderOrderingOrderingComparators = getFieldValue(orderingForwardOrderOrderingForwardOrderOrderingOrdering, "comparators");
        Object initialReverseOrderingForwardOrderOrderingOrderingComparators1 = get(orderingForwardOrderOrderingForwardOrderOrderingOrderingForwardOrderOrderingOrderingComparators, 1);
        Ordering ordering1 = reverseOrdering.forwardOrder;
        Object ordering1ForwardOrderOrdering = getFieldValue(ordering1, "ordering");
        Object ordering1ForwardOrderOrderingForwardOrderOrderingOrdering = getFieldValue(ordering1ForwardOrderOrdering, "ordering");
        Object ordering1ForwardOrderOrderingForwardOrderOrderingOrderingForwardOrderOrderingOrderingComparators = getFieldValue(ordering1ForwardOrderOrderingForwardOrderOrderingOrdering, "comparators");
        Object initialReverseOrderingForwardOrderOrderingOrderingComparators2 = get(ordering1ForwardOrderOrderingForwardOrderOrderingOrderingForwardOrderOrderingOrderingComparators, 2);
        Ordering ordering2 = reverseOrdering.forwardOrder;
        Object ordering2ForwardOrderOrdering = getFieldValue(ordering2, "ordering");
        Object ordering2ForwardOrderOrderingForwardOrderOrderingOrdering = getFieldValue(ordering2ForwardOrderOrdering, "ordering");
        Object ordering2ForwardOrderOrderingForwardOrderOrderingOrderingForwardOrderOrderingOrderingComparators = getFieldValue(ordering2ForwardOrderOrderingForwardOrderOrderingOrdering, "comparators");
        Object initialReverseOrderingForwardOrderOrderingOrderingComparators3 = get(ordering2ForwardOrderOrderingForwardOrderOrderingOrderingForwardOrderOrderingOrderingComparators, 3);
        Ordering ordering3 = reverseOrdering.forwardOrder;
        Object ordering3ForwardOrderOrdering = getFieldValue(ordering3, "ordering");
        Object ordering3ForwardOrderOrderingForwardOrderOrderingOrdering = getFieldValue(ordering3ForwardOrderOrdering, "ordering");
        Object ordering3ForwardOrderOrderingForwardOrderOrderingOrderingForwardOrderOrderingOrderingComparators = getFieldValue(ordering3ForwardOrderOrderingForwardOrderOrderingOrdering, "comparators");
        Object initialReverseOrderingForwardOrderOrderingOrderingComparators4 = get(ordering3ForwardOrderOrderingForwardOrderOrderingOrderingForwardOrderOrderingOrderingComparators, 4);
        Ordering ordering4 = reverseOrdering.forwardOrder;
        Object ordering4ForwardOrderOrdering = getFieldValue(ordering4, "ordering");
        Object ordering4ForwardOrderOrderingForwardOrderOrderingOrdering = getFieldValue(ordering4ForwardOrderOrdering, "ordering");
        Object ordering4ForwardOrderOrderingForwardOrderOrderingOrderingForwardOrderOrderingOrderingComparators = getFieldValue(ordering4ForwardOrderOrderingForwardOrderOrderingOrdering, "comparators");
        Object initialReverseOrderingForwardOrderOrderingOrderingComparators5 = get(ordering4ForwardOrderOrderingForwardOrderOrderingOrderingForwardOrderOrderingOrderingComparators, 5);
        Ordering ordering5 = reverseOrdering.forwardOrder;
        Object ordering5ForwardOrderOrdering = getFieldValue(ordering5, "ordering");
        Object ordering5ForwardOrderOrderingForwardOrderOrderingOrdering = getFieldValue(ordering5ForwardOrderOrdering, "ordering");
        Object ordering5ForwardOrderOrderingForwardOrderOrderingOrderingForwardOrderOrderingOrderingComparators = getFieldValue(ordering5ForwardOrderOrderingForwardOrderOrderingOrdering, "comparators");
        Object initialReverseOrderingForwardOrderOrderingOrderingComparators6 = get(ordering5ForwardOrderOrderingForwardOrderOrderingOrderingForwardOrderOrderingOrderingComparators, 6);
        Ordering ordering6 = reverseOrdering.forwardOrder;
        Object ordering6ForwardOrderOrdering = getFieldValue(ordering6, "ordering");
        Object ordering6ForwardOrderOrderingForwardOrderOrderingOrdering = getFieldValue(ordering6ForwardOrderOrdering, "ordering");
        Object ordering6ForwardOrderOrderingForwardOrderOrderingOrderingForwardOrderOrderingOrderingComparators = getFieldValue(ordering6ForwardOrderOrderingForwardOrderOrderingOrdering, "comparators");
        Object initialReverseOrderingForwardOrderOrderingOrderingComparators7 = get(ordering6ForwardOrderOrderingForwardOrderOrderingOrderingForwardOrderOrderingOrderingComparators, 7);
        Ordering ordering7 = reverseOrdering.forwardOrder;
        Object ordering7ForwardOrderOrdering = getFieldValue(ordering7, "ordering");
        Object ordering7ForwardOrderOrderingForwardOrderOrderingOrdering = getFieldValue(ordering7ForwardOrderOrdering, "ordering");
        Object ordering7ForwardOrderOrderingForwardOrderOrderingOrderingForwardOrderOrderingOrderingComparators = getFieldValue(ordering7ForwardOrderOrderingForwardOrderOrderingOrdering, "comparators");
        Object initialReverseOrderingForwardOrderOrderingOrderingComparators8 = get(ordering7ForwardOrderOrderingForwardOrderOrderingOrderingForwardOrderOrderingOrderingComparators, 8);
        
        int actual = reverseOrdering.compare(byteArray, byteArray1);
        
        assertEquals(-9, actual);
        
        Ordering ordering8 = reverseOrdering.forwardOrder;
        Object ordering8ForwardOrderOrdering = getFieldValue(ordering8, "ordering");
        Object ordering8ForwardOrderOrderingForwardOrderOrderingOrdering = getFieldValue(ordering8ForwardOrderOrdering, "ordering");
        Object ordering8ForwardOrderOrderingForwardOrderOrderingOrderingForwardOrderOrderingOrderingComparators = getFieldValue(ordering8ForwardOrderOrderingForwardOrderOrderingOrdering, "comparators");
        Object finalReverseOrderingForwardOrderOrderingOrderingComparators1 = get(ordering8ForwardOrderOrderingForwardOrderOrderingOrderingForwardOrderOrderingOrderingComparators, 1);
        Ordering ordering9 = reverseOrdering.forwardOrder;
        Object ordering9ForwardOrderOrdering = getFieldValue(ordering9, "ordering");
        Object ordering9ForwardOrderOrderingForwardOrderOrderingOrdering = getFieldValue(ordering9ForwardOrderOrdering, "ordering");
        Object ordering9ForwardOrderOrderingForwardOrderOrderingOrderingForwardOrderOrderingOrderingComparators = getFieldValue(ordering9ForwardOrderOrderingForwardOrderOrderingOrdering, "comparators");
        Object finalReverseOrderingForwardOrderOrderingOrderingComparators2 = get(ordering9ForwardOrderOrderingForwardOrderOrderingOrderingForwardOrderOrderingOrderingComparators, 2);
        Ordering ordering10 = reverseOrdering.forwardOrder;
        Object ordering10ForwardOrderOrdering = getFieldValue(ordering10, "ordering");
        Object ordering10ForwardOrderOrderingForwardOrderOrderingOrdering = getFieldValue(ordering10ForwardOrderOrdering, "ordering");
        Object ordering10ForwardOrderOrderingForwardOrderOrderingOrderingForwardOrderOrderingOrderingComparators = getFieldValue(ordering10ForwardOrderOrderingForwardOrderOrderingOrdering, "comparators");
        Object finalReverseOrderingForwardOrderOrderingOrderingComparators3 = get(ordering10ForwardOrderOrderingForwardOrderOrderingOrderingForwardOrderOrderingOrderingComparators, 3);
        Ordering ordering11 = reverseOrdering.forwardOrder;
        Object ordering11ForwardOrderOrdering = getFieldValue(ordering11, "ordering");
        Object ordering11ForwardOrderOrderingForwardOrderOrderingOrdering = getFieldValue(ordering11ForwardOrderOrdering, "ordering");
        Object ordering11ForwardOrderOrderingForwardOrderOrderingOrderingForwardOrderOrderingOrderingComparators = getFieldValue(ordering11ForwardOrderOrderingForwardOrderOrderingOrdering, "comparators");
        Object finalReverseOrderingForwardOrderOrderingOrderingComparators4 = get(ordering11ForwardOrderOrderingForwardOrderOrderingOrderingForwardOrderOrderingOrderingComparators, 4);
        Ordering ordering12 = reverseOrdering.forwardOrder;
        Object ordering12ForwardOrderOrdering = getFieldValue(ordering12, "ordering");
        Object ordering12ForwardOrderOrderingForwardOrderOrderingOrdering = getFieldValue(ordering12ForwardOrderOrdering, "ordering");
        Object ordering12ForwardOrderOrderingForwardOrderOrderingOrderingForwardOrderOrderingOrderingComparators = getFieldValue(ordering12ForwardOrderOrderingForwardOrderOrderingOrdering, "comparators");
        Object finalReverseOrderingForwardOrderOrderingOrderingComparators5 = get(ordering12ForwardOrderOrderingForwardOrderOrderingOrderingForwardOrderOrderingOrderingComparators, 5);
        Ordering ordering13 = reverseOrdering.forwardOrder;
        Object ordering13ForwardOrderOrdering = getFieldValue(ordering13, "ordering");
        Object ordering13ForwardOrderOrderingForwardOrderOrderingOrdering = getFieldValue(ordering13ForwardOrderOrdering, "ordering");
        Object ordering13ForwardOrderOrderingForwardOrderOrderingOrderingForwardOrderOrderingOrderingComparators = getFieldValue(ordering13ForwardOrderOrderingForwardOrderOrderingOrdering, "comparators");
        Object finalReverseOrderingForwardOrderOrderingOrderingComparators6 = get(ordering13ForwardOrderOrderingForwardOrderOrderingOrderingForwardOrderOrderingOrderingComparators, 6);
        Ordering ordering14 = reverseOrdering.forwardOrder;
        Object ordering14ForwardOrderOrdering = getFieldValue(ordering14, "ordering");
        Object ordering14ForwardOrderOrderingForwardOrderOrderingOrdering = getFieldValue(ordering14ForwardOrderOrdering, "ordering");
        Object ordering14ForwardOrderOrderingForwardOrderOrderingOrderingForwardOrderOrderingOrderingComparators = getFieldValue(ordering14ForwardOrderOrderingForwardOrderOrderingOrdering, "comparators");
        Object finalReverseOrderingForwardOrderOrderingOrderingComparators7 = get(ordering14ForwardOrderOrderingForwardOrderOrderingOrderingForwardOrderOrderingOrderingComparators, 7);
        Ordering ordering15 = reverseOrdering.forwardOrder;
        Object ordering15ForwardOrderOrdering = getFieldValue(ordering15, "ordering");
        Object ordering15ForwardOrderOrderingForwardOrderOrderingOrdering = getFieldValue(ordering15ForwardOrderOrdering, "ordering");
        Object ordering15ForwardOrderOrderingForwardOrderOrderingOrderingForwardOrderOrderingOrderingComparators = getFieldValue(ordering15ForwardOrderOrderingForwardOrderOrderingOrdering, "comparators");
        Object finalReverseOrderingForwardOrderOrderingOrderingComparators8 = get(ordering15ForwardOrderOrderingForwardOrderOrderingOrderingForwardOrderOrderingOrderingComparators, 8);
        
        assertNull(finalReverseOrderingForwardOrderOrderingOrderingComparators1);
        
        assertNull(finalReverseOrderingForwardOrderOrderingOrderingComparators2);
        
        assertNull(finalReverseOrderingForwardOrderOrderingOrderingComparators3);
        
        assertNull(finalReverseOrderingForwardOrderOrderingOrderingComparators4);
        
        assertNull(finalReverseOrderingForwardOrderOrderingOrderingComparators5);
        
        assertNull(finalReverseOrderingForwardOrderOrderingOrderingComparators6);
        
        assertNull(finalReverseOrderingForwardOrderOrderingOrderingComparators7);
        
        assertNull(finalReverseOrderingForwardOrderOrderingOrderingComparators8);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCompare9() throws Throwable  {
        ReverseOrdering reverseOrdering = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        NullsFirstOrdering nullsFirstOrdering = ((NullsFirstOrdering) createInstance("com.google.common.collect.NullsFirstOrdering"));
        NullsFirstOrdering nullsFirstOrdering1 = ((NullsFirstOrdering) createInstance("com.google.common.collect.NullsFirstOrdering"));
        CompoundOrdering compoundOrdering = ((CompoundOrdering) createInstance("com.google.common.collect.CompoundOrdering"));
        java.util.Comparator[] comparatorArray = new java.util.Comparator[9];
        ByteArrayLexOrder byteArrayLexOrder = ((ByteArrayLexOrder) createInstance("sun.security.util.ByteArrayLexOrder"));
        comparatorArray[0] = ((Comparator) byteArrayLexOrder);
        comparatorArray[1] = ((Comparator) byteArrayLexOrder);
        comparatorArray[2] = ((Comparator) byteArrayLexOrder);
        comparatorArray[3] = ((Comparator) byteArrayLexOrder);
        comparatorArray[4] = ((Comparator) byteArrayLexOrder);
        comparatorArray[5] = ((Comparator) byteArrayLexOrder);
        comparatorArray[6] = ((Comparator) byteArrayLexOrder);
        comparatorArray[7] = ((Comparator) byteArrayLexOrder);
        comparatorArray[8] = ((Comparator) byteArrayLexOrder);
        setField(compoundOrdering, "comparators", comparatorArray);
        setField(nullsFirstOrdering1, "ordering", compoundOrdering);
        setField(nullsFirstOrdering, "ordering", nullsFirstOrdering1);
        setField(reverseOrdering, "forwardOrder", nullsFirstOrdering);
        byte[] byteArray = new byte[9];
        byte[] byteArray1 = new byte[9];
        
        int actual = reverseOrdering.compare(byteArray, byteArray1);
        
        assertEquals(0, actual);
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
        ReverseOrdering reverseOrdering2 = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        ReverseNaturalOrdering reverseNaturalOrdering = ((ReverseNaturalOrdering) createInstance("com.google.common.collect.ReverseNaturalOrdering"));
        setField(reverseOrdering2, "forwardOrder", reverseNaturalOrdering);
        setField(reverseOrdering1, "forwardOrder", reverseOrdering2);
        setField(reverseOrdering, "forwardOrder", reverseOrdering1);
        LinkedHashSet linkedHashSet = ((LinkedHashSet) createInstance("java.util.LinkedHashSet"));
        HashMap hashMap = new HashMap();
        setField(linkedHashSet, "map", hashMap);
        
        reverseOrdering.min(linkedHashSet);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testMin3() throws Throwable  {
        ReverseOrdering reverseOrdering = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        ReverseOrdering reverseOrdering1 = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        ReverseNaturalOrdering reverseNaturalOrdering = ((ReverseNaturalOrdering) createInstance("com.google.common.collect.ReverseNaturalOrdering"));
        setField(reverseOrdering1, "forwardOrder", reverseNaturalOrdering);
        setField(reverseOrdering, "forwardOrder", reverseOrdering1);
        LinkedHashSet linkedHashSet = ((LinkedHashSet) createInstance("java.util.LinkedHashSet"));
        HashMap hashMap = new HashMap();
        Integer integer = 0;
        java.lang.Integer[] integerArray = new java.lang.Integer[0];
        hashMap.put(integer, integerArray);
        setField(linkedHashSet, "map", hashMap);
        
        Object actual = reverseOrdering.min(linkedHashSet);
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(integer, actual));
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
        setField(scanner, "closed", true);
        
        reverseOrdering.min(scanner);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testMin6() throws Throwable  {
        ReverseOrdering reverseOrdering = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        ReverseOrdering reverseOrdering1 = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        ReverseOrdering reverseOrdering2 = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        ReverseOrdering reverseOrdering3 = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        ReverseOrdering reverseOrdering4 = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        ReverseNaturalOrdering reverseNaturalOrdering = ((ReverseNaturalOrdering) createInstance("com.google.common.collect.ReverseNaturalOrdering"));
        setField(reverseOrdering4, "forwardOrder", reverseNaturalOrdering);
        setField(reverseOrdering3, "forwardOrder", reverseOrdering4);
        setField(reverseOrdering2, "forwardOrder", reverseOrdering3);
        setField(reverseOrdering1, "forwardOrder", reverseOrdering2);
        setField(reverseOrdering, "forwardOrder", reverseOrdering1);
        Scanner scanner = ((Scanner) createInstance("java.util.Scanner"));
        setField(scanner, "closed", false);
        setField(scanner, "matchValid", false);
        setField(scanner, "typeCache", null);
        setField(scanner, "hasNextPattern", null);
        Pattern pattern = ((Pattern) createInstance("java.util.regex.Pattern"));
        setField(pattern, "capturingGroupCount", 0);
        setField(scanner, "delimPattern", pattern);
        Matcher matcher = ((Matcher) createInstance("java.util.regex.Matcher"));
        setField(matcher, "parentPattern", null);
        setField(scanner, "matcher", matcher);
        
        Object initialScannerTypeCache = getFieldValue(scanner, "typeCache");
        Object scannerMatcher = getFieldValue(scanner, "matcher");
        Object initialScannerMatcherParentPattern = getFieldValue(scannerMatcher, "parentPattern");
        
        reverseOrdering.min(scanner);
        
        Object finalScannerTypeCache = getFieldValue(scanner, "typeCache");
        Object scannerMatcher1 = getFieldValue(scanner, "matcher");
        Object finalScannerMatcherParentPattern = getFieldValue(scannerMatcher1, "parentPattern");
        
        assertNull(finalScannerTypeCache);
        
        assertFalse(initialScannerMatcherParentPattern == finalScannerMatcherParentPattern);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testMin7() throws Throwable  {
        ReverseOrdering reverseOrdering = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        Object object = new Object();
        Object object1 = new Object();
        
        reverseOrdering.min(object, object1);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testMin8() throws Throwable  {
        ReverseOrdering reverseOrdering = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        ReverseNaturalOrdering reverseNaturalOrdering = ((ReverseNaturalOrdering) createInstance("com.google.common.collect.ReverseNaturalOrdering"));
        setField(reverseOrdering, "forwardOrder", reverseNaturalOrdering);
        java.lang.Object[] charArrayAsListArray = createArray("com.google.common.primitives.Chars$CharArrayAsList", 0);
        
        reverseOrdering.min(charArrayAsListArray, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testMin9() throws Throwable  {
        ReverseOrdering reverseOrdering = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        ReverseNaturalOrdering reverseNaturalOrdering = ((ReverseNaturalOrdering) createInstance("com.google.common.collect.ReverseNaturalOrdering"));
        setField(reverseOrdering, "forwardOrder", reverseNaturalOrdering);
        java.lang.Object[] descendingImmutableSortedSetArray = createArray("com.google.common.collect.DescendingImmutableSortedSet", 0);
        
        reverseOrdering.min(null, descendingImmutableSortedSetArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testMin10() throws Throwable  {
        ReverseOrdering reverseOrdering = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        ReverseOrdering reverseOrdering1 = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        ReverseNaturalOrdering reverseNaturalOrdering = ((ReverseNaturalOrdering) createInstance("com.google.common.collect.ReverseNaturalOrdering"));
        setField(reverseOrdering1, "forwardOrder", reverseNaturalOrdering);
        setField(reverseOrdering, "forwardOrder", reverseOrdering1);
        java.lang.Object[] charArrayAsListArray = createArray("com.google.common.primitives.Chars$CharArrayAsList", 0);
        
        reverseOrdering.min(charArrayAsListArray, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testMin11() throws Throwable  {
        ReverseOrdering reverseOrdering = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        ReverseOrdering reverseOrdering1 = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        ReverseNaturalOrdering reverseNaturalOrdering = ((ReverseNaturalOrdering) createInstance("com.google.common.collect.ReverseNaturalOrdering"));
        setField(reverseOrdering1, "forwardOrder", reverseNaturalOrdering);
        setField(reverseOrdering, "forwardOrder", reverseOrdering1);
        java.lang.Object[] descendingImmutableSortedSetArray = createArray("com.google.common.collect.DescendingImmutableSortedSet", 0);
        
        reverseOrdering.min(null, descendingImmutableSortedSetArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testMin12() throws Throwable  {
        ReverseOrdering reverseOrdering = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        ReverseNaturalOrdering reverseNaturalOrdering = ((ReverseNaturalOrdering) createInstance("com.google.common.collect.ReverseNaturalOrdering"));
        setField(reverseOrdering, "forwardOrder", reverseNaturalOrdering);
        
        reverseOrdering.min(null, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testMin13() throws Throwable  {
        ReverseOrdering reverseOrdering = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        ReverseOrdering reverseOrdering1 = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        ReverseNaturalOrdering reverseNaturalOrdering = ((ReverseNaturalOrdering) createInstance("com.google.common.collect.ReverseNaturalOrdering"));
        setField(reverseOrdering1, "forwardOrder", reverseNaturalOrdering);
        setField(reverseOrdering, "forwardOrder", reverseOrdering1);
        Integer integer = 0;
        HttpURLConnection.TunnelState tunnelState = HttpURLConnection.TunnelState.NONE;
        
        reverseOrdering.min(integer, tunnelState);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testMin14() throws Throwable  {
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
    public void testMin15() throws Throwable  {
        ReverseOrdering reverseOrdering = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        ReverseNaturalOrdering reverseNaturalOrdering = ((ReverseNaturalOrdering) createInstance("com.google.common.collect.ReverseNaturalOrdering"));
        setField(reverseOrdering, "forwardOrder", reverseNaturalOrdering);
        java.lang.Object[] transposedValueGraphArray = createArray("com.google.common.graph.Graphs$TransposedValueGraph", 0);
        java.lang.Object[] objectArray = new java.lang.Object[9];
        
        reverseOrdering.min(null, null, transposedValueGraphArray, objectArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testMin16() throws Throwable  {
        ReverseOrdering reverseOrdering = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        ReverseNaturalOrdering reverseNaturalOrdering = ((ReverseNaturalOrdering) createInstance("com.google.common.collect.ReverseNaturalOrdering"));
        setField(reverseOrdering, "forwardOrder", reverseNaturalOrdering);
        java.lang.Object[] objectArray = new java.lang.Object[9];
        
        reverseOrdering.min(null, null, null, objectArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testMin17() throws Throwable  {
        ReverseOrdering reverseOrdering = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        ReverseOrdering reverseOrdering1 = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        ReverseNaturalOrdering reverseNaturalOrdering = ((ReverseNaturalOrdering) createInstance("com.google.common.collect.ReverseNaturalOrdering"));
        setField(reverseOrdering1, "forwardOrder", reverseNaturalOrdering);
        setField(reverseOrdering, "forwardOrder", reverseOrdering1);
        Object value = createInstance("java.lang.ProcessEnvironment$Value");
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
        
        reverseOrdering.min(null, value, null, comparableArray);
        
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
    public void testMin18() throws Throwable  {
        ReverseOrdering reverseOrdering = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        ReverseNaturalOrdering reverseNaturalOrdering = ((ReverseNaturalOrdering) createInstance("com.google.common.collect.ReverseNaturalOrdering"));
        setField(reverseOrdering, "forwardOrder", reverseNaturalOrdering);
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
        
        reverseOrdering.min(integer, null, integer, comparableArray);
        
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
        java.lang.Object[] charArrayAsListArray = createArray("com.google.common.primitives.Chars$CharArrayAsList", 0);
        
        reverseOrdering.max(charArrayAsListArray, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testMax5() throws Throwable  {
        ReverseOrdering reverseOrdering = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        ReverseOrdering reverseOrdering1 = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        ReverseNaturalOrdering reverseNaturalOrdering = ((ReverseNaturalOrdering) createInstance("com.google.common.collect.ReverseNaturalOrdering"));
        setField(reverseOrdering1, "forwardOrder", reverseNaturalOrdering);
        setField(reverseOrdering, "forwardOrder", reverseOrdering1);
        java.lang.Object[] descendingImmutableSortedSetArray = createArray("com.google.common.collect.DescendingImmutableSortedSet", 0);
        
        reverseOrdering.max(null, descendingImmutableSortedSetArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testMax6() throws Throwable  {
        ReverseOrdering reverseOrdering = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        ReverseNaturalOrdering reverseNaturalOrdering = ((ReverseNaturalOrdering) createInstance("com.google.common.collect.ReverseNaturalOrdering"));
        setField(reverseOrdering, "forwardOrder", reverseNaturalOrdering);
        Integer integer = 0;
        Object byteBufferAsLongBufferL = createInstance("java.nio.ByteBufferAsLongBufferL");
        
        reverseOrdering.max(integer, byteBufferAsLongBufferL);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testMax7() throws Throwable  {
        ReverseOrdering reverseOrdering = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        ReverseOrdering reverseOrdering1 = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        ReverseNaturalOrdering reverseNaturalOrdering = ((ReverseNaturalOrdering) createInstance("com.google.common.collect.ReverseNaturalOrdering"));
        setField(reverseOrdering1, "forwardOrder", reverseNaturalOrdering);
        setField(reverseOrdering, "forwardOrder", reverseOrdering1);
        Integer integer = 0;
        
        Object actual = reverseOrdering.max(integer, integer);
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(integer, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testMax8() throws Throwable  {
        ReverseOrdering reverseOrdering = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        ReverseOrdering reverseOrdering1 = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        ReverseOrdering reverseOrdering2 = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        ReverseOrdering reverseOrdering3 = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        ReverseNaturalOrdering reverseNaturalOrdering = ((ReverseNaturalOrdering) createInstance("com.google.common.collect.ReverseNaturalOrdering"));
        setField(reverseOrdering3, "forwardOrder", reverseNaturalOrdering);
        setField(reverseOrdering2, "forwardOrder", reverseOrdering3);
        setField(reverseOrdering1, "forwardOrder", reverseOrdering2);
        setField(reverseOrdering, "forwardOrder", reverseOrdering1);
        
        reverseOrdering.max(null, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testMax9() throws Throwable  {
        ReverseOrdering reverseOrdering = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        ArrayList arrayList = new ArrayList();
        
        reverseOrdering.max(arrayList);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testMax10() throws Throwable  {
        ReverseOrdering reverseOrdering = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        ReverseOrdering reverseOrdering1 = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        ReverseNaturalOrdering reverseNaturalOrdering = ((ReverseNaturalOrdering) createInstance("com.google.common.collect.ReverseNaturalOrdering"));
        setField(reverseOrdering1, "forwardOrder", reverseNaturalOrdering);
        setField(reverseOrdering, "forwardOrder", reverseOrdering1);
        LinkedHashSet linkedHashSet = ((LinkedHashSet) createInstance("java.util.LinkedHashSet"));
        HashMap hashMap = new HashMap();
        Integer integer = 0;
        java.lang.Integer[] integerArray = new java.lang.Integer[0];
        hashMap.put(integer, integerArray);
        setField(linkedHashSet, "map", hashMap);
        
        Object actual = reverseOrdering.max(linkedHashSet);
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(integer, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testMax11() throws Throwable  {
        ReverseOrdering reverseOrdering = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        ReverseOrdering reverseOrdering1 = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        ReverseOrdering reverseOrdering2 = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        ReverseNaturalOrdering reverseNaturalOrdering = ((ReverseNaturalOrdering) createInstance("com.google.common.collect.ReverseNaturalOrdering"));
        setField(reverseOrdering2, "forwardOrder", reverseNaturalOrdering);
        setField(reverseOrdering1, "forwardOrder", reverseOrdering2);
        setField(reverseOrdering, "forwardOrder", reverseOrdering1);
        ArrayList arrayList = ((ArrayList) createInstance("java.util.ArrayList"));
        setField(arrayList, "modCount", 0);
        
        reverseOrdering.max(arrayList);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testMax12() throws Throwable  {
        ReverseOrdering reverseOrdering = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        
        reverseOrdering.max(((Iterator) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testMax13() throws Throwable  {
        ReverseOrdering reverseOrdering = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        ReverseOrdering reverseOrdering1 = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        ReverseNaturalOrdering reverseNaturalOrdering = ((ReverseNaturalOrdering) createInstance("com.google.common.collect.ReverseNaturalOrdering"));
        setField(reverseOrdering1, "forwardOrder", reverseNaturalOrdering);
        setField(reverseOrdering, "forwardOrder", reverseOrdering1);
        Scanner scanner = ((Scanner) createInstance("java.util.Scanner"));
        setField(scanner, "closed", true);
        
        reverseOrdering.max(scanner);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testMax14() throws Throwable  {
        ReverseOrdering reverseOrdering = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        ReverseOrdering reverseOrdering1 = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        ReverseOrdering reverseOrdering2 = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        ReverseNaturalOrdering reverseNaturalOrdering = ((ReverseNaturalOrdering) createInstance("com.google.common.collect.ReverseNaturalOrdering"));
        setField(reverseOrdering2, "forwardOrder", reverseNaturalOrdering);
        setField(reverseOrdering1, "forwardOrder", reverseOrdering2);
        setField(reverseOrdering, "forwardOrder", reverseOrdering1);
        
        reverseOrdering.max(((Iterator) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testMax15() throws Throwable  {
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
    public void testMax16() throws Throwable  {
        ReverseOrdering reverseOrdering = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        ReverseNaturalOrdering reverseNaturalOrdering = ((ReverseNaturalOrdering) createInstance("com.google.common.collect.ReverseNaturalOrdering"));
        setField(reverseOrdering, "forwardOrder", reverseNaturalOrdering);
        java.lang.Object[] transposedValueGraphArray = createArray("com.google.common.graph.Graphs$TransposedValueGraph", 0);
        java.lang.Object[] objectArray = new java.lang.Object[9];
        
        reverseOrdering.max(null, null, transposedValueGraphArray, objectArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testMax17() throws Throwable  {
        ReverseOrdering reverseOrdering = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        ReverseNaturalOrdering reverseNaturalOrdering = ((ReverseNaturalOrdering) createInstance("com.google.common.collect.ReverseNaturalOrdering"));
        setField(reverseOrdering, "forwardOrder", reverseNaturalOrdering);
        java.lang.Object[] objectArray = new java.lang.Object[9];
        
        reverseOrdering.max(null, null, null, objectArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testMax18() throws Throwable  {
        ReverseOrdering reverseOrdering = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        ReverseOrdering reverseOrdering1 = ((ReverseOrdering) createInstance("com.google.common.collect.ReverseOrdering"));
        ReverseNaturalOrdering reverseNaturalOrdering = ((ReverseNaturalOrdering) createInstance("com.google.common.collect.ReverseNaturalOrdering"));
        setField(reverseOrdering1, "forwardOrder", reverseNaturalOrdering);
        setField(reverseOrdering, "forwardOrder", reverseOrdering1);
        Object value = createInstance("java.lang.ProcessEnvironment$Value");
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
        
        reverseOrdering.max(null, value, null, comparableArray);
        
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
