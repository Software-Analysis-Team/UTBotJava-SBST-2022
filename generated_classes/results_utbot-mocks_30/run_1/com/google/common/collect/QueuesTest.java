package com.google.common.collect;

import org.junit.Test;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.locks.AbstractQueuedSynchronizer.ConditionObject;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Map;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import sun.misc.Unsafe;

import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mockStatic;

public class QueuesTest {
    ///region
    
    @Test(timeout = 10000)
    public void testNewPriorityQueue1() throws Throwable  {
        ArrayList arrayList = new ArrayList();
        
        PriorityQueue actual = Queues.newPriorityQueue(arrayList);
        
        PriorityQueue expected = ((PriorityQueue) createInstance("java.util.PriorityQueue"));
        java.lang.Object[] objectArray = new java.lang.Object[0];
        setField(expected, "queue", objectArray);
        setField(expected, "size", 0);
        setField(expected, "comparator", null);
        setField(expected, "modCount", 0);
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testNewPriorityQueue2() throws Throwable  {
        PriorityQueue actual = Queues.newPriorityQueue();
        
        PriorityQueue expected = ((PriorityQueue) createInstance("java.util.PriorityQueue"));
        java.lang.Object[] objectArray = new java.lang.Object[11];
        setField(expected, "queue", objectArray);
        setField(expected, "size", 0);
        setField(expected, "comparator", null);
        setField(expected, "modCount", 0);
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testNewArrayDeque1() throws Throwable  {
        ArrayList arrayList = new ArrayList();
        
        ArrayDeque actual = Queues.newArrayDeque(arrayList);
        
        ArrayDeque expected = new ArrayDeque();
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testNewArrayDeque2() throws Throwable  {
        ArrayDeque actual = Queues.newArrayDeque();
        
        ArrayDeque expected = new ArrayDeque();
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testNewArrayDeque3() throws Throwable  {
        ArrayDeque actual = Queues.newArrayDeque();
        
        LinkedList expected = new LinkedList();
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testNewConcurrentLinkedQueue1() throws Throwable  {
        ArrayList arrayList = new ArrayList();
        
        ConcurrentLinkedQueue actual = Queues.newConcurrentLinkedQueue(arrayList);
        
        ConcurrentLinkedQueue expected = ((ConcurrentLinkedQueue) createInstance("java.util.concurrent.ConcurrentLinkedQueue"));
        Object node = createInstance("java.util.concurrent.ConcurrentLinkedQueue$Node");
        setField(node, "item", null);
        setField(node, "next", null);
        setField(expected, "head", node);
        setField(expected, "tail", node);
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testNewConcurrentLinkedQueue2() throws Throwable  {
        ConcurrentLinkedQueue actual = Queues.newConcurrentLinkedQueue();
        
        ConcurrentLinkedQueue expected = ((ConcurrentLinkedQueue) createInstance("java.util.concurrent.ConcurrentLinkedQueue"));
        Object node = createInstance("java.util.concurrent.ConcurrentLinkedQueue$Node");
        setField(node, "item", null);
        setField(node, "next", null);
        setField(expected, "head", node);
        setField(expected, "tail", node);
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testNewLinkedBlockingDeque1() throws Throwable  {
        ArrayList arrayList = new ArrayList();
        
        LinkedBlockingDeque actual = Queues.newLinkedBlockingDeque(arrayList);
        
        LinkedBlockingDeque expected = new LinkedBlockingDeque();
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testNewLinkedBlockingDeque2() throws Throwable  {
        Queues.newLinkedBlockingDeque(0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testNewLinkedBlockingDeque3() throws Throwable  {
        LinkedBlockingDeque actual = Queues.newLinkedBlockingDeque(1);
        
        LinkedBlockingDeque expected = ((LinkedBlockingDeque) createInstance("java.util.concurrent.LinkedBlockingDeque"));
        AbstractQueuedSynchronizer.ConditionObject conditionObject = ((AbstractQueuedSynchronizer.ConditionObject) createInstance("java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject"));
        Object nonfairSync = createInstance("java.util.concurrent.locks.ReentrantLock$NonfairSync");
        setField(conditionObject, "this$0", nonfairSync);
        setField(expected, "notFull", conditionObject);
        AbstractQueuedSynchronizer.ConditionObject conditionObject1 = ((AbstractQueuedSynchronizer.ConditionObject) createInstance("java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject"));
        setField(conditionObject1, "this$0", nonfairSync);
        setField(expected, "notEmpty", conditionObject1);
        ReentrantLock reentrantLock = ((ReentrantLock) createInstance("java.util.concurrent.locks.ReentrantLock"));
        setField(reentrantLock, "sync", nonfairSync);
        setField(expected, "lock", reentrantLock);
        setField(expected, "capacity", 1);
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testNewLinkedBlockingDeque4() throws Throwable  {
        LinkedBlockingDeque actual = Queues.newLinkedBlockingDeque();
        
        LinkedBlockingDeque expected = new LinkedBlockingDeque();
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testNewLinkedBlockingDeque5() throws Throwable  {
        LinkedBlockingDeque actual = Queues.newLinkedBlockingDeque();
        
        LinkedBlockingDeque expected = ((LinkedBlockingDeque) createInstance("java.util.concurrent.LinkedBlockingDeque"));
        AbstractQueuedSynchronizer.ConditionObject conditionObject = ((AbstractQueuedSynchronizer.ConditionObject) createInstance("java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject"));
        Object nonfairSync = createInstance("java.util.concurrent.locks.ReentrantLock$NonfairSync");
        setField(conditionObject, "this$0", nonfairSync);
        setField(expected, "notFull", conditionObject);
        AbstractQueuedSynchronizer.ConditionObject conditionObject1 = ((AbstractQueuedSynchronizer.ConditionObject) createInstance("java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject"));
        setField(conditionObject1, "this$0", nonfairSync);
        setField(expected, "notEmpty", conditionObject1);
        ReentrantLock reentrantLock = ((ReentrantLock) createInstance("java.util.concurrent.locks.ReentrantLock"));
        setField(reentrantLock, "sync", nonfairSync);
        setField(expected, "lock", reentrantLock);
        setField(expected, "capacity", Integer.MAX_VALUE);
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testNewLinkedBlockingQueue1() throws Throwable  {
        Queues.newLinkedBlockingQueue(0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testNewLinkedBlockingQueue2() throws Throwable  {
        Queues.newLinkedBlockingQueue(-2147483647);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testNewLinkedBlockingQueue3() throws Throwable  {
        LinkedBlockingQueue actual = Queues.newLinkedBlockingQueue(1);
        
        LinkedBlockingQueue expected = ((LinkedBlockingQueue) createInstance("java.util.concurrent.LinkedBlockingQueue"));
        AbstractQueuedSynchronizer.ConditionObject conditionObject = ((AbstractQueuedSynchronizer.ConditionObject) createInstance("java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject"));
        Object nonfairSync = createInstance("java.util.concurrent.locks.ReentrantLock$NonfairSync");
        setField(conditionObject, "this$0", nonfairSync);
        setField(expected, "notFull", conditionObject);
        ReentrantLock reentrantLock = ((ReentrantLock) createInstance("java.util.concurrent.locks.ReentrantLock"));
        setField(reentrantLock, "sync", nonfairSync);
        setField(expected, "putLock", reentrantLock);
        AbstractQueuedSynchronizer.ConditionObject conditionObject1 = ((AbstractQueuedSynchronizer.ConditionObject) createInstance("java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject"));
        Object nonfairSync1 = createInstance("java.util.concurrent.locks.ReentrantLock$NonfairSync");
        setField(conditionObject1, "this$0", nonfairSync1);
        setField(expected, "notEmpty", conditionObject1);
        ReentrantLock reentrantLock1 = ((ReentrantLock) createInstance("java.util.concurrent.locks.ReentrantLock"));
        setField(reentrantLock1, "sync", nonfairSync1);
        setField(expected, "takeLock", reentrantLock1);
        Object node = createInstance("java.util.concurrent.LinkedBlockingQueue$Node");
        setField(node, "item", null);
        setField(expected, "last", node);
        setField(expected, "head", node);
        AtomicInteger atomicInteger = ((AtomicInteger) createInstance("java.util.concurrent.atomic.AtomicInteger"));
        setField(expected, "count", atomicInteger);
        setField(expected, "capacity", 1);
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testNewLinkedBlockingQueue4() throws Throwable  {
        LinkedBlockingQueue actual = Queues.newLinkedBlockingQueue();
        
        LinkedBlockingQueue expected = ((LinkedBlockingQueue) createInstance("java.util.concurrent.LinkedBlockingQueue"));
        setField(expected, "capacity", Integer.MAX_VALUE);
        AtomicInteger atomicInteger = ((AtomicInteger) createInstance("java.util.concurrent.atomic.AtomicInteger"));
        setField(atomicInteger, "value", 0);
        setField(expected, "count", atomicInteger);
        Object node = createInstance("java.util.concurrent.LinkedBlockingQueue$Node");
        setField(node, "item", null);
        setField(node, "next", null);
        setField(expected, "head", node);
        setField(expected, "last", node);
        ReentrantLock reentrantLock = ((ReentrantLock) createInstance("java.util.concurrent.locks.ReentrantLock"));
        Object nonfairSync = createInstance("java.util.concurrent.locks.ReentrantLock$NonfairSync");
        setField(nonfairSync, "head", null);
        setField(nonfairSync, "tail", null);
        setField(nonfairSync, "state", 0);
        setField(nonfairSync, "exclusiveOwnerThread", null);
        setField(reentrantLock, "sync", nonfairSync);
        setField(expected, "takeLock", reentrantLock);
        AbstractQueuedSynchronizer.ConditionObject conditionObject = ((AbstractQueuedSynchronizer.ConditionObject) createInstance("java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject"));
        setField(conditionObject, "firstWaiter", null);
        setField(conditionObject, "lastWaiter", null);
        setField(conditionObject, "this$0", nonfairSync);
        setField(expected, "notEmpty", conditionObject);
        ReentrantLock reentrantLock1 = ((ReentrantLock) createInstance("java.util.concurrent.locks.ReentrantLock"));
        Object nonfairSync1 = createInstance("java.util.concurrent.locks.ReentrantLock$NonfairSync");
        setField(nonfairSync1, "head", null);
        setField(nonfairSync1, "tail", null);
        setField(nonfairSync1, "state", 0);
        setField(nonfairSync1, "exclusiveOwnerThread", null);
        setField(reentrantLock1, "sync", nonfairSync1);
        setField(expected, "putLock", reentrantLock1);
        AbstractQueuedSynchronizer.ConditionObject conditionObject1 = ((AbstractQueuedSynchronizer.ConditionObject) createInstance("java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject"));
        setField(conditionObject1, "firstWaiter", null);
        setField(conditionObject1, "lastWaiter", null);
        setField(conditionObject1, "this$0", nonfairSync1);
        setField(expected, "notFull", conditionObject1);
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testNewLinkedBlockingQueue5() throws Throwable  {
        LinkedBlockingQueue actual = Queues.newLinkedBlockingQueue();
        
        LinkedBlockingQueue expected = ((LinkedBlockingQueue) createInstance("java.util.concurrent.LinkedBlockingQueue"));
        AbstractQueuedSynchronizer.ConditionObject conditionObject = ((AbstractQueuedSynchronizer.ConditionObject) createInstance("java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject"));
        Object nonfairSync = createInstance("java.util.concurrent.locks.ReentrantLock$NonfairSync");
        setField(conditionObject, "this$0", nonfairSync);
        setField(expected, "notFull", conditionObject);
        ReentrantLock reentrantLock = ((ReentrantLock) createInstance("java.util.concurrent.locks.ReentrantLock"));
        setField(reentrantLock, "sync", nonfairSync);
        setField(expected, "putLock", reentrantLock);
        AbstractQueuedSynchronizer.ConditionObject conditionObject1 = ((AbstractQueuedSynchronizer.ConditionObject) createInstance("java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject"));
        Object nonfairSync1 = createInstance("java.util.concurrent.locks.ReentrantLock$NonfairSync");
        setField(conditionObject1, "this$0", nonfairSync1);
        setField(expected, "notEmpty", conditionObject1);
        ReentrantLock reentrantLock1 = ((ReentrantLock) createInstance("java.util.concurrent.locks.ReentrantLock"));
        setField(reentrantLock1, "sync", nonfairSync1);
        setField(expected, "takeLock", reentrantLock1);
        Object node = createInstance("java.util.concurrent.LinkedBlockingQueue$Node");
        setField(node, "item", null);
        setField(expected, "last", node);
        setField(expected, "head", node);
        AtomicInteger atomicInteger = ((AtomicInteger) createInstance("java.util.concurrent.atomic.AtomicInteger"));
        setField(expected, "count", atomicInteger);
        setField(expected, "capacity", Integer.MAX_VALUE);
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testNewLinkedBlockingQueue6() throws Throwable  {
        ArrayList arrayList = new ArrayList();
        
        LinkedBlockingQueue actual = Queues.newLinkedBlockingQueue(arrayList);
        
        LinkedBlockingQueue expected = ((LinkedBlockingQueue) createInstance("java.util.concurrent.LinkedBlockingQueue"));
        setField(expected, "capacity", Integer.MAX_VALUE);
        AtomicInteger atomicInteger = ((AtomicInteger) createInstance("java.util.concurrent.atomic.AtomicInteger"));
        setField(atomicInteger, "value", 0);
        setField(expected, "count", atomicInteger);
        Object node = createInstance("java.util.concurrent.LinkedBlockingQueue$Node");
        setField(node, "item", null);
        setField(node, "next", null);
        setField(expected, "head", node);
        setField(expected, "last", node);
        ReentrantLock reentrantLock = ((ReentrantLock) createInstance("java.util.concurrent.locks.ReentrantLock"));
        Object nonfairSync = createInstance("java.util.concurrent.locks.ReentrantLock$NonfairSync");
        setField(nonfairSync, "head", null);
        setField(nonfairSync, "tail", null);
        setField(nonfairSync, "state", 0);
        setField(nonfairSync, "exclusiveOwnerThread", null);
        setField(reentrantLock, "sync", nonfairSync);
        setField(expected, "takeLock", reentrantLock);
        AbstractQueuedSynchronizer.ConditionObject conditionObject = ((AbstractQueuedSynchronizer.ConditionObject) createInstance("java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject"));
        setField(conditionObject, "firstWaiter", null);
        setField(conditionObject, "lastWaiter", null);
        setField(conditionObject, "this$0", nonfairSync);
        setField(expected, "notEmpty", conditionObject);
        ReentrantLock reentrantLock1 = ((ReentrantLock) createInstance("java.util.concurrent.locks.ReentrantLock"));
        Object nonfairSync1 = createInstance("java.util.concurrent.locks.ReentrantLock$NonfairSync");
        setField(nonfairSync1, "head", null);
        setField(nonfairSync1, "tail", null);
        setField(nonfairSync1, "state", 0);
        setField(nonfairSync1, "exclusiveOwnerThread", null);
        setField(reentrantLock1, "sync", nonfairSync1);
        setField(expected, "putLock", reentrantLock1);
        AbstractQueuedSynchronizer.ConditionObject conditionObject1 = ((AbstractQueuedSynchronizer.ConditionObject) createInstance("java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject"));
        setField(conditionObject1, "firstWaiter", null);
        setField(conditionObject1, "lastWaiter", null);
        setField(conditionObject1, "this$0", nonfairSync1);
        setField(expected, "notFull", conditionObject1);
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testNewArrayBlockingQueue1() throws Throwable  {
        Queues.newArrayBlockingQueue(0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testNewArrayBlockingQueue2() throws Throwable  {
        Queues.newArrayBlockingQueue(-2147483647);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testNewArrayBlockingQueue3() throws Throwable  {
        ArrayBlockingQueue actual = Queues.newArrayBlockingQueue(9);
        
        ArrayBlockingQueue expected = ((ArrayBlockingQueue) createInstance("java.util.concurrent.ArrayBlockingQueue"));
        setField(expected, "itrs", null);
        AbstractQueuedSynchronizer.ConditionObject conditionObject = ((AbstractQueuedSynchronizer.ConditionObject) createInstance("java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject"));
        Object nonfairSync = createInstance("java.util.concurrent.locks.ReentrantLock$NonfairSync");
        setField(conditionObject, "this$0", nonfairSync);
        setField(expected, "notFull", conditionObject);
        AbstractQueuedSynchronizer.ConditionObject conditionObject1 = ((AbstractQueuedSynchronizer.ConditionObject) createInstance("java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject"));
        setField(conditionObject1, "this$0", nonfairSync);
        setField(expected, "notEmpty", conditionObject1);
        ReentrantLock reentrantLock = ((ReentrantLock) createInstance("java.util.concurrent.locks.ReentrantLock"));
        setField(reentrantLock, "sync", nonfairSync);
        setField(expected, "lock", reentrantLock);
        java.lang.Object[] objectArray = new java.lang.Object[9];
        setField(expected, "items", objectArray);
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testNewPriorityBlockingQueue1() throws Throwable  {
        ArrayList arrayList = new ArrayList();
        
        PriorityBlockingQueue actual = Queues.newPriorityBlockingQueue(arrayList);
        
        PriorityBlockingQueue expected = ((PriorityBlockingQueue) createInstance("java.util.concurrent.PriorityBlockingQueue"));
        java.lang.Object[] objectArray = new java.lang.Object[0];
        setField(expected, "queue", objectArray);
        setField(expected, "size", 0);
        setField(expected, "comparator", null);
        ReentrantLock reentrantLock = ((ReentrantLock) createInstance("java.util.concurrent.locks.ReentrantLock"));
        Object nonfairSync = createInstance("java.util.concurrent.locks.ReentrantLock$NonfairSync");
        setField(nonfairSync, "head", null);
        setField(nonfairSync, "tail", null);
        setField(nonfairSync, "state", 0);
        setField(nonfairSync, "exclusiveOwnerThread", null);
        setField(reentrantLock, "sync", nonfairSync);
        setField(expected, "lock", reentrantLock);
        AbstractQueuedSynchronizer.ConditionObject conditionObject = ((AbstractQueuedSynchronizer.ConditionObject) createInstance("java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject"));
        setField(conditionObject, "firstWaiter", null);
        setField(conditionObject, "lastWaiter", null);
        setField(conditionObject, "this$0", nonfairSync);
        setField(expected, "notEmpty", conditionObject);
        setField(expected, "allocationSpinLock", 0);
        setField(expected, "q", null);
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testNewPriorityBlockingQueue2() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(Iterables.class);
            mockedStatic.when(() -> {
                Iterables.addAll(any(), any());
            }).thenReturn(false);
            
            PriorityBlockingQueue actual = Queues.newPriorityBlockingQueue(null);
            
            PriorityBlockingQueue expected = ((PriorityBlockingQueue) createInstance("java.util.concurrent.PriorityBlockingQueue"));
            AbstractQueuedSynchronizer.ConditionObject conditionObject = ((AbstractQueuedSynchronizer.ConditionObject) createInstance("java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject"));
            Object nonfairSync = createInstance("java.util.concurrent.locks.ReentrantLock$NonfairSync");
            setField(conditionObject, "this$0", nonfairSync);
            setField(expected, "notEmpty", conditionObject);
            ReentrantLock reentrantLock = ((ReentrantLock) createInstance("java.util.concurrent.locks.ReentrantLock"));
            setField(reentrantLock, "sync", nonfairSync);
            setField(expected, "lock", reentrantLock);
            setField(expected, "comparator", null);
            java.lang.Object[] objectArray = new java.lang.Object[11];
            setField(expected, "queue", objectArray);
            
            // Current deep equals depth exceeds max depth 0
            assertTrue(deepEquals(expected, actual));
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testNewPriorityBlockingQueue3() throws Throwable  {
        PriorityBlockingQueue actual = Queues.newPriorityBlockingQueue();
        
        PriorityBlockingQueue expected = ((PriorityBlockingQueue) createInstance("java.util.concurrent.PriorityBlockingQueue"));
        java.lang.Object[] objectArray = new java.lang.Object[11];
        setField(expected, "queue", objectArray);
        setField(expected, "size", 0);
        setField(expected, "comparator", null);
        ReentrantLock reentrantLock = ((ReentrantLock) createInstance("java.util.concurrent.locks.ReentrantLock"));
        Object nonfairSync = createInstance("java.util.concurrent.locks.ReentrantLock$NonfairSync");
        setField(nonfairSync, "head", null);
        setField(nonfairSync, "tail", null);
        setField(nonfairSync, "state", 0);
        setField(nonfairSync, "exclusiveOwnerThread", null);
        setField(reentrantLock, "sync", nonfairSync);
        setField(expected, "lock", reentrantLock);
        AbstractQueuedSynchronizer.ConditionObject conditionObject = ((AbstractQueuedSynchronizer.ConditionObject) createInstance("java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject"));
        setField(conditionObject, "firstWaiter", null);
        setField(conditionObject, "lastWaiter", null);
        setField(conditionObject, "this$0", nonfairSync);
        setField(expected, "notEmpty", conditionObject);
        setField(expected, "allocationSpinLock", 0);
        setField(expected, "q", null);
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testNewPriorityBlockingQueue4() throws Throwable  {
        PriorityBlockingQueue actual = Queues.newPriorityBlockingQueue();
        
        PriorityBlockingQueue expected = ((PriorityBlockingQueue) createInstance("java.util.concurrent.PriorityBlockingQueue"));
        AbstractQueuedSynchronizer.ConditionObject conditionObject = ((AbstractQueuedSynchronizer.ConditionObject) createInstance("java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject"));
        Object nonfairSync = createInstance("java.util.concurrent.locks.ReentrantLock$NonfairSync");
        setField(conditionObject, "this$0", nonfairSync);
        setField(expected, "notEmpty", conditionObject);
        ReentrantLock reentrantLock = ((ReentrantLock) createInstance("java.util.concurrent.locks.ReentrantLock"));
        setField(reentrantLock, "sync", nonfairSync);
        setField(expected, "lock", reentrantLock);
        setField(expected, "comparator", null);
        java.lang.Object[] objectArray = new java.lang.Object[11];
        setField(expected, "queue", objectArray);
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testNewSynchronousQueue1() throws Throwable  {
        SynchronousQueue actual = Queues.newSynchronousQueue();
        
        SynchronousQueue expected = ((SynchronousQueue) createInstance("java.util.concurrent.SynchronousQueue"));
        Object transferStack = createInstance("java.util.concurrent.SynchronousQueue$TransferStack");
        setField(transferStack, "head", null);
        setField(expected, "transferer", transferStack);
        setField(expected, "qlock", null);
        setField(expected, "waitingProducers", null);
        setField(expected, "waitingConsumers", null);
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testNewSynchronousQueue2() throws Throwable  {
        SynchronousQueue actual = Queues.newSynchronousQueue();
        
        SynchronousQueue expected = ((SynchronousQueue) createInstance("java.util.concurrent.SynchronousQueue"));
        Object transferStack = createInstance("java.util.concurrent.SynchronousQueue$TransferStack");
        setField(expected, "transferer", transferStack);
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDrainUninterruptibly1() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(com.google.common.base.Preconditions.class);
            java.lang.Object[] findOpArray = createArray("java.util.stream.FindOps$FindOp", 0);
            mockedStatic.when(() -> {
                com.google.common.base.Preconditions.checkNotNull(any());
            }).thenReturn(((Object) findOpArray));
            
            Queues.drainUninterruptibly(null, null, 0, 0L, null);
        } finally {
            mockedStatic.close();
        }
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
