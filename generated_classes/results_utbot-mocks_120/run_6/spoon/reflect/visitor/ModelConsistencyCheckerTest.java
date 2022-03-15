package spoon.reflect.visitor;

import org.junit.Test;
import spoon.reflect.declaration.CtElement;
import java.util.ArrayDeque;
import spoon.support.reflect.cu.position.DeclarationSourcePositionImpl;
import java.lang.reflect.Method;
import spoon.support.util.SortedList;
import java.util.Deque;
import java.util.concurrent.LinkedBlockingDeque;
import org.eclipse.osgi.internal.container.EquinoxReentrantLock;
import java.util.concurrent.locks.AbstractQueuedSynchronizer.ConditionObject;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import spoon.compiler.Environment;
import java.util.concurrent.locks.ReentrantLock;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import sun.misc.Unsafe;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;

public class ModelConsistencyCheckerTest {
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testEnter1() throws Throwable  {
        ModelConsistencyChecker modelConsistencyChecker = ((ModelConsistencyChecker) createInstance("spoon.reflect.visitor.ModelConsistencyChecker"));
        
        modelConsistencyChecker.enter(((CtElement) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testEnter2() throws Throwable  {
        ModelConsistencyChecker modelConsistencyChecker = ((ModelConsistencyChecker) createInstance("spoon.reflect.visitor.ModelConsistencyChecker"));
        setField(modelConsistencyChecker, "stack", null);
        CtElement ctElementMock = mock(CtElement.class);
        
        modelConsistencyChecker.enter(ctElementMock);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testEnter3() throws Throwable  {
        ModelConsistencyChecker modelConsistencyChecker = ((ModelConsistencyChecker) createInstance("spoon.reflect.visitor.ModelConsistencyChecker"));
        ArrayDeque arrayDeque = ((ArrayDeque) createInstance("java.util.ArrayDeque"));
        setField(arrayDeque, "tail", 0);
        setField(arrayDeque, "head", 1);
        setField(modelConsistencyChecker, "stack", arrayDeque);
        
        modelConsistencyChecker.enter(((CtElement) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testEnter4() throws Throwable  {
        ModelConsistencyChecker modelConsistencyChecker = ((ModelConsistencyChecker) createInstance("spoon.reflect.visitor.ModelConsistencyChecker"));
        ArrayDeque arrayDeque = ((ArrayDeque) createInstance("java.util.ArrayDeque"));
        setField(arrayDeque, "tail", 0);
        setField(arrayDeque, "head", Integer.MIN_VALUE);
        java.lang.Object[] objectArray = new java.lang.Object[9];
        setField(arrayDeque, "elements", objectArray);
        setField(modelConsistencyChecker, "stack", arrayDeque);
        CtElement ctElementMock = mock(CtElement.class);
        when(ctElementMock.isParentInitialized()).thenReturn(false, true);
        when(ctElementMock.getParent()).thenReturn(((CtElement) null));
        
        modelConsistencyChecker.enter(ctElementMock);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testEnter5() throws Throwable  {
        ModelConsistencyChecker modelConsistencyChecker = ((ModelConsistencyChecker) createInstance("spoon.reflect.visitor.ModelConsistencyChecker"));
        ArrayDeque arrayDeque = ((ArrayDeque) createInstance("java.util.ArrayDeque"));
        setField(arrayDeque, "tail", 0);
        setField(arrayDeque, "head", Integer.MIN_VALUE);
        java.lang.Object[] objectArray = new java.lang.Object[9];
        setField(arrayDeque, "elements", objectArray);
        setField(modelConsistencyChecker, "stack", arrayDeque);
        modelConsistencyChecker.fixNullParents = true;
        CtElement ctElementMock = mock(CtElement.class);
        when(ctElementMock.isParentInitialized()).thenReturn(false, false);
        
        modelConsistencyChecker.enter(ctElementMock);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testEnter6() throws Throwable  {
        ModelConsistencyChecker modelConsistencyChecker = ((ModelConsistencyChecker) createInstance("spoon.reflect.visitor.ModelConsistencyChecker"));
        ArrayDeque arrayDeque = ((ArrayDeque) createInstance("java.util.ArrayDeque"));
        setField(arrayDeque, "tail", 0);
        setField(arrayDeque, "head", 40);
        java.lang.Object[] objectArray = new java.lang.Object[40];
        setField(arrayDeque, "elements", objectArray);
        setField(modelConsistencyChecker, "stack", arrayDeque);
        CtElement ctElementMock = mock(CtElement.class);
        when(ctElementMock.isParentInitialized()).thenReturn(false, true);
        when(ctElementMock.getParent()).thenReturn(((CtElement) null));
        
        modelConsistencyChecker.enter(ctElementMock);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testEnter7() throws Throwable  {
        ModelConsistencyChecker modelConsistencyChecker = ((ModelConsistencyChecker) createInstance("spoon.reflect.visitor.ModelConsistencyChecker"));
        ArrayDeque arrayDeque = ((ArrayDeque) createInstance("java.util.ArrayDeque"));
        setField(arrayDeque, "tail", 0);
        setField(arrayDeque, "head", 2);
        java.lang.Object[] objectArray = new java.lang.Object[11];
        objectArray[0] = objectArray;
        objectArray[1] = objectArray;
        spoon.support.reflect.cu.position.DeclarationSourcePositionImpl[] declarationSourcePositionImplArray = new spoon.support.reflect.cu.position.DeclarationSourcePositionImpl[0];
        objectArray[2] = ((Object) declarationSourcePositionImplArray);
        objectArray[3] = objectArray;
        objectArray[4] = objectArray;
        objectArray[5] = objectArray;
        objectArray[6] = objectArray;
        objectArray[7] = objectArray;
        objectArray[8] = objectArray;
        objectArray[9] = objectArray;
        objectArray[10] = objectArray;
        setField(arrayDeque, "elements", objectArray);
        setField(modelConsistencyChecker, "stack", arrayDeque);
        modelConsistencyChecker.fixNullParents = true;
        CtElement ctElementMock = mock(CtElement.class);
        when(ctElementMock.isParentInitialized()).thenReturn(false, false);
        
        modelConsistencyChecker.enter(ctElementMock);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testEnter8() throws Throwable  {
        ModelConsistencyChecker modelConsistencyChecker = ((ModelConsistencyChecker) createInstance("spoon.reflect.visitor.ModelConsistencyChecker"));
        ArrayDeque arrayDeque = ((ArrayDeque) createInstance("java.util.ArrayDeque"));
        setField(arrayDeque, "tail", 0);
        setField(arrayDeque, "head", 40);
        java.lang.Object[] objectArray = new java.lang.Object[40];
        setField(arrayDeque, "elements", objectArray);
        setField(modelConsistencyChecker, "stack", arrayDeque);
        modelConsistencyChecker.fixNullParents = false;
        CtElement ctElementMock = mock(CtElement.class);
        when(ctElementMock.isParentInitialized()).thenReturn(false, false);
        when(ctElementMock.getParent()).thenReturn(((CtElement) null));
        
        modelConsistencyChecker.enter(ctElementMock);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testEnter9() throws Throwable  {
        ModelConsistencyChecker modelConsistencyChecker = ((ModelConsistencyChecker) createInstance("spoon.reflect.visitor.ModelConsistencyChecker"));
        ArrayDeque arrayDeque = ((ArrayDeque) createInstance("java.util.ArrayDeque"));
        setField(arrayDeque, "tail", 0);
        setField(arrayDeque, "head", Integer.MIN_VALUE);
        java.lang.Object[] objectArray = new java.lang.Object[9];
        setField(arrayDeque, "elements", objectArray);
        setField(modelConsistencyChecker, "stack", arrayDeque);
        CtElement ctElementMock = mock(CtElement.class);
        when(ctElementMock.isParentInitialized()).thenReturn(true);
        when(ctElementMock.getParent()).thenReturn(((CtElement) null));
        
        modelConsistencyChecker.enter(ctElementMock);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testExit1() throws Throwable  {
        ModelConsistencyChecker modelConsistencyChecker = ((ModelConsistencyChecker) createInstance("spoon.reflect.visitor.ModelConsistencyChecker"));
        
        Class modelConsistencyCheckerClazz = Class.forName("spoon.reflect.visitor.ModelConsistencyChecker");
        Class ctElementType = Class.forName("spoon.reflect.declaration.CtElement");
        Method exitMethod = modelConsistencyCheckerClazz.getDeclaredMethod("exit", ctElementType);
        exitMethod.setAccessible(true);
        java.lang.Object[] exitMethodArguments = new java.lang.Object[1];
        exitMethodArguments[0] = null;
        try {
            exitMethod.invoke(modelConsistencyChecker, exitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testExit2() throws Throwable  {
        ModelConsistencyChecker modelConsistencyChecker = ((ModelConsistencyChecker) createInstance("spoon.reflect.visitor.ModelConsistencyChecker"));
        setField(modelConsistencyChecker, "stack", null);
        CtElement ctElementMock = mock(CtElement.class);
        
        Class modelConsistencyCheckerClazz = Class.forName("spoon.reflect.visitor.ModelConsistencyChecker");
        Class ctElementMockType = Class.forName("spoon.reflect.declaration.CtElement");
        Method exitMethod = modelConsistencyCheckerClazz.getDeclaredMethod("exit", ctElementMockType);
        exitMethod.setAccessible(true);
        java.lang.Object[] exitMethodArguments = new java.lang.Object[1];
        exitMethodArguments[0] = ctElementMock;
        try {
            exitMethod.invoke(modelConsistencyChecker, exitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testExit3() throws Throwable  {
        ModelConsistencyChecker modelConsistencyChecker = ((ModelConsistencyChecker) createInstance("spoon.reflect.visitor.ModelConsistencyChecker"));
        SortedList sortedList = ((SortedList) createInstance("spoon.support.util.SortedList"));
        setField(sortedList, "first", null);
        setField(modelConsistencyChecker, "stack", sortedList);
        CtElement ctElementMock = mock(CtElement.class);
        
        Class modelConsistencyCheckerClazz = Class.forName("spoon.reflect.visitor.ModelConsistencyChecker");
        Class ctElementMockType = Class.forName("spoon.reflect.declaration.CtElement");
        Method exitMethod = modelConsistencyCheckerClazz.getDeclaredMethod("exit", ctElementMockType);
        exitMethod.setAccessible(true);
        java.lang.Object[] exitMethodArguments = new java.lang.Object[1];
        exitMethodArguments[0] = ctElementMock;
        try {
            exitMethod.invoke(modelConsistencyChecker, exitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testExit4() throws Throwable  {
        ModelConsistencyChecker modelConsistencyChecker = ((ModelConsistencyChecker) createInstance("spoon.reflect.visitor.ModelConsistencyChecker"));
        SortedList sortedList = ((SortedList) createInstance("spoon.support.util.SortedList"));
        setField(sortedList, "modCount", 0);
        setField(sortedList, "last", null);
        Object node = createInstance("java.util.LinkedList$Node");
        setField(node, "next", null);
        setField(node, "item", null);
        setField(sortedList, "first", node);
        setField(sortedList, "size", 0);
        setField(modelConsistencyChecker, "stack", sortedList);
        CtElement ctElementMock = mock(CtElement.class);
        
        Deque deque = modelConsistencyChecker.stack;
        Object initialModelConsistencyCheckerStackFirst = getFieldValue(deque, "first");
        
        Class modelConsistencyCheckerClazz = Class.forName("spoon.reflect.visitor.ModelConsistencyChecker");
        Class ctElementMockType = Class.forName("spoon.reflect.declaration.CtElement");
        Method exitMethod = modelConsistencyCheckerClazz.getDeclaredMethod("exit", ctElementMockType);
        exitMethod.setAccessible(true);
        java.lang.Object[] exitMethodArguments = new java.lang.Object[1];
        exitMethodArguments[0] = ctElementMock;
        exitMethod.invoke(modelConsistencyChecker, exitMethodArguments);
        
        Deque deque1 = modelConsistencyChecker.stack;
        Object finalModelConsistencyCheckerStackModCount = getFieldValue(deque1, "modCount");
        Deque deque2 = modelConsistencyChecker.stack;
        Object finalModelConsistencyCheckerStackFirst = getFieldValue(deque2, "first");
        Deque deque3 = modelConsistencyChecker.stack;
        Object finalModelConsistencyCheckerStackSize = getFieldValue(deque3, "size");
        
        assertNull(finalModelConsistencyCheckerStackFirst);
        
        assertEquals(1, finalModelConsistencyCheckerStackModCount);
        
        assertEquals(-1, finalModelConsistencyCheckerStackSize);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testExit5() throws Throwable  {
        ModelConsistencyChecker modelConsistencyChecker = ((ModelConsistencyChecker) createInstance("spoon.reflect.visitor.ModelConsistencyChecker"));
        ArrayDeque arrayDeque = ((ArrayDeque) createInstance("java.util.ArrayDeque"));
        setField(arrayDeque, "head", 0);
        java.lang.Object[] objectArray = new java.lang.Object[9];
        objectArray[1] = objectArray;
        objectArray[2] = objectArray;
        objectArray[3] = objectArray;
        objectArray[4] = objectArray;
        objectArray[5] = objectArray;
        objectArray[6] = objectArray;
        objectArray[7] = objectArray;
        objectArray[8] = objectArray;
        setField(arrayDeque, "elements", objectArray);
        setField(modelConsistencyChecker, "stack", arrayDeque);
        CtElement ctElementMock = mock(CtElement.class);
        
        Class modelConsistencyCheckerClazz = Class.forName("spoon.reflect.visitor.ModelConsistencyChecker");
        Class ctElementMockType = Class.forName("spoon.reflect.declaration.CtElement");
        Method exitMethod = modelConsistencyCheckerClazz.getDeclaredMethod("exit", ctElementMockType);
        exitMethod.setAccessible(true);
        java.lang.Object[] exitMethodArguments = new java.lang.Object[1];
        exitMethodArguments[0] = ctElementMock;
        try {
            exitMethod.invoke(modelConsistencyChecker, exitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testExit6() throws Throwable  {
        ModelConsistencyChecker modelConsistencyChecker = ((ModelConsistencyChecker) createInstance("spoon.reflect.visitor.ModelConsistencyChecker"));
        ArrayDeque arrayDeque = ((ArrayDeque) createInstance("java.util.ArrayDeque"));
        setField(arrayDeque, "head", 40);
        java.lang.Object[] objectArray = new java.lang.Object[40];
        setField(arrayDeque, "elements", objectArray);
        setField(modelConsistencyChecker, "stack", arrayDeque);
        CtElement ctElementMock = mock(CtElement.class);
        
        Class modelConsistencyCheckerClazz = Class.forName("spoon.reflect.visitor.ModelConsistencyChecker");
        Class ctElementMockType = Class.forName("spoon.reflect.declaration.CtElement");
        Method exitMethod = modelConsistencyCheckerClazz.getDeclaredMethod("exit", ctElementMockType);
        exitMethod.setAccessible(true);
        java.lang.Object[] exitMethodArguments = new java.lang.Object[1];
        exitMethodArguments[0] = ctElementMock;
        try {
            exitMethod.invoke(modelConsistencyChecker, exitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testExit7() throws Throwable  {
        ModelConsistencyChecker modelConsistencyChecker = ((ModelConsistencyChecker) createInstance("spoon.reflect.visitor.ModelConsistencyChecker"));
        ArrayDeque arrayDeque = ((ArrayDeque) createInstance("java.util.ArrayDeque"));
        setField(arrayDeque, "head", Integer.MIN_VALUE);
        java.lang.Object[] objectArray = new java.lang.Object[9];
        setField(arrayDeque, "elements", objectArray);
        setField(modelConsistencyChecker, "stack", arrayDeque);
        CtElement ctElementMock = mock(CtElement.class);
        
        Class modelConsistencyCheckerClazz = Class.forName("spoon.reflect.visitor.ModelConsistencyChecker");
        Class ctElementMockType = Class.forName("spoon.reflect.declaration.CtElement");
        Method exitMethod = modelConsistencyCheckerClazz.getDeclaredMethod("exit", ctElementMockType);
        exitMethod.setAccessible(true);
        java.lang.Object[] exitMethodArguments = new java.lang.Object[1];
        exitMethodArguments[0] = ctElementMock;
        try {
            exitMethod.invoke(modelConsistencyChecker, exitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testExit8() throws Throwable  {
        ModelConsistencyChecker modelConsistencyChecker = ((ModelConsistencyChecker) createInstance("spoon.reflect.visitor.ModelConsistencyChecker"));
        LinkedBlockingDeque linkedBlockingDeque = ((LinkedBlockingDeque) createInstance("java.util.concurrent.LinkedBlockingDeque"));
        EquinoxReentrantLock equinoxReentrantLock = ((EquinoxReentrantLock) createInstance("org.eclipse.osgi.internal.container.EquinoxReentrantLock"));
        Object fairSync = createInstance("java.util.concurrent.locks.ReentrantLock$FairSync");
        Thread thread = ((Thread) createInstance("java.lang.Thread"));
        setField(fairSync, "exclusiveOwnerThread", thread);
        setField(fairSync, "state", 2);
        setField(equinoxReentrantLock, "sync", fairSync);
        setField(linkedBlockingDeque, "lock", equinoxReentrantLock);
        setField(linkedBlockingDeque, "first", null);
        setField(modelConsistencyChecker, "stack", linkedBlockingDeque);
        CtElement ctElementMock = mock(CtElement.class);
        
        Class modelConsistencyCheckerClazz = Class.forName("spoon.reflect.visitor.ModelConsistencyChecker");
        Class ctElementMockType = Class.forName("spoon.reflect.declaration.CtElement");
        Method exitMethod = modelConsistencyCheckerClazz.getDeclaredMethod("exit", ctElementMockType);
        exitMethod.setAccessible(true);
        java.lang.Object[] exitMethodArguments = new java.lang.Object[1];
        exitMethodArguments[0] = ctElementMock;
        try {
            exitMethod.invoke(modelConsistencyChecker, exitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        Deque deque = modelConsistencyChecker.stack;
        Object dequeStackLock = getFieldValue(deque, "lock");
        Object dequeStackLockStackLockSync = getFieldValue(dequeStackLock, "sync");
        Object finalModelConsistencyCheckerStackLockSyncState = getFieldValue(dequeStackLockStackLockSync, "state");
        
        assertEquals(3, finalModelConsistencyCheckerStackLockSyncState);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testExit9() throws Throwable  {
        ModelConsistencyChecker modelConsistencyChecker = ((ModelConsistencyChecker) createInstance("spoon.reflect.visitor.ModelConsistencyChecker"));
        LinkedBlockingDeque linkedBlockingDeque = ((LinkedBlockingDeque) createInstance("java.util.concurrent.LinkedBlockingDeque"));
        AbstractQueuedSynchronizer.ConditionObject conditionObject = ((AbstractQueuedSynchronizer.ConditionObject) createInstance("java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject"));
        Object worker = createInstance("java.util.concurrent.ThreadPoolExecutor$Worker");
        setField(worker, "exclusiveOwnerThread", null);
        setField(worker, "state", 0);
        setField(conditionObject, "this$0", worker);
        setField(linkedBlockingDeque, "notFull", conditionObject);
        EquinoxReentrantLock equinoxReentrantLock = ((EquinoxReentrantLock) createInstance("org.eclipse.osgi.internal.container.EquinoxReentrantLock"));
        Object fairSync = createInstance("java.util.concurrent.locks.ReentrantLock$FairSync");
        Thread thread = ((Thread) createInstance("java.lang.Thread"));
        setField(fairSync, "exclusiveOwnerThread", thread);
        setField(fairSync, "state", 2);
        setField(equinoxReentrantLock, "sync", fairSync);
        setField(linkedBlockingDeque, "lock", equinoxReentrantLock);
        setField(linkedBlockingDeque, "count", 0);
        Object node = createInstance("java.util.concurrent.LinkedBlockingDeque$Node");
        setField(node, "next", node);
        setField(node, "prev", null);
        setField(node, "item", null);
        setField(linkedBlockingDeque, "first", node);
        setField(modelConsistencyChecker, "stack", linkedBlockingDeque);
        CtElement ctElementMock = mock(CtElement.class);
        
        Class modelConsistencyCheckerClazz = Class.forName("spoon.reflect.visitor.ModelConsistencyChecker");
        Class ctElementMockType = Class.forName("spoon.reflect.declaration.CtElement");
        Method exitMethod = modelConsistencyCheckerClazz.getDeclaredMethod("exit", ctElementMockType);
        exitMethod.setAccessible(true);
        java.lang.Object[] exitMethodArguments = new java.lang.Object[1];
        exitMethodArguments[0] = ctElementMock;
        try {
            exitMethod.invoke(modelConsistencyChecker, exitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        Deque deque = modelConsistencyChecker.stack;
        Object dequeStackLock = getFieldValue(deque, "lock");
        Object dequeStackLockStackLockSync = getFieldValue(dequeStackLock, "sync");
        Object finalModelConsistencyCheckerStackLockSyncState = getFieldValue(dequeStackLockStackLockSync, "state");
        Deque deque1 = modelConsistencyChecker.stack;
        Object finalModelConsistencyCheckerStackCount = getFieldValue(deque1, "count");
        
        assertEquals(3, finalModelConsistencyCheckerStackLockSyncState);
        
        assertEquals(-1, finalModelConsistencyCheckerStackCount);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDumpStack1() throws Throwable  {
        ModelConsistencyChecker modelConsistencyChecker = ((ModelConsistencyChecker) createInstance("spoon.reflect.visitor.ModelConsistencyChecker"));
        
        Class modelConsistencyCheckerClazz = Class.forName("spoon.reflect.visitor.ModelConsistencyChecker");
        Method dumpStackMethod = modelConsistencyCheckerClazz.getDeclaredMethod("dumpStack");
        dumpStackMethod.setAccessible(true);
        java.lang.Object[] dumpStackMethodArguments = new java.lang.Object[0];
        try {
            dumpStackMethod.invoke(modelConsistencyChecker, dumpStackMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDumpStack2() throws Throwable  {
        ModelConsistencyChecker modelConsistencyChecker = ((ModelConsistencyChecker) createInstance("spoon.reflect.visitor.ModelConsistencyChecker"));
        setField(modelConsistencyChecker, "environment", null);
        
        Class modelConsistencyCheckerClazz = Class.forName("spoon.reflect.visitor.ModelConsistencyChecker");
        Method dumpStackMethod = modelConsistencyCheckerClazz.getDeclaredMethod("dumpStack");
        dumpStackMethod.setAccessible(true);
        java.lang.Object[] dumpStackMethodArguments = new java.lang.Object[0];
        try {
            dumpStackMethod.invoke(modelConsistencyChecker, dumpStackMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDumpStack3() throws Throwable  {
        ModelConsistencyChecker modelConsistencyChecker = ((ModelConsistencyChecker) createInstance("spoon.reflect.visitor.ModelConsistencyChecker"));
        setField(modelConsistencyChecker, "stack", null);
        Environment environmentMock = mock(Environment.class);
        modelConsistencyChecker.environment = environmentMock;
        
        Class modelConsistencyCheckerClazz = Class.forName("spoon.reflect.visitor.ModelConsistencyChecker");
        Method dumpStackMethod = modelConsistencyCheckerClazz.getDeclaredMethod("dumpStack");
        dumpStackMethod.setAccessible(true);
        java.lang.Object[] dumpStackMethodArguments = new java.lang.Object[0];
        try {
            dumpStackMethod.invoke(modelConsistencyChecker, dumpStackMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDumpStack4() throws Throwable  {
        ModelConsistencyChecker modelConsistencyChecker = ((ModelConsistencyChecker) createInstance("spoon.reflect.visitor.ModelConsistencyChecker"));
        LinkedBlockingDeque linkedBlockingDeque = ((LinkedBlockingDeque) createInstance("java.util.concurrent.LinkedBlockingDeque"));
        ReentrantLock reentrantLock = ((ReentrantLock) createInstance("java.util.concurrent.locks.ReentrantLock"));
        Object fairSync = createInstance("java.util.concurrent.locks.ReentrantLock$FairSync");
        Thread thread = ((Thread) createInstance("java.lang.Thread"));
        setField(fairSync, "exclusiveOwnerThread", thread);
        setField(fairSync, "state", 2);
        setField(reentrantLock, "sync", fairSync);
        setField(linkedBlockingDeque, "lock", reentrantLock);
        Object node = createInstance("java.util.concurrent.LinkedBlockingDeque$Node");
        setField(node, "item", null);
        setField(linkedBlockingDeque, "first", node);
        setField(modelConsistencyChecker, "stack", linkedBlockingDeque);
        Environment environmentMock = mock(Environment.class);
        modelConsistencyChecker.environment = environmentMock;
        
        Class modelConsistencyCheckerClazz = Class.forName("spoon.reflect.visitor.ModelConsistencyChecker");
        Method dumpStackMethod = modelConsistencyCheckerClazz.getDeclaredMethod("dumpStack");
        dumpStackMethod.setAccessible(true);
        java.lang.Object[] dumpStackMethodArguments = new java.lang.Object[0];
        try {
            dumpStackMethod.invoke(modelConsistencyChecker, dumpStackMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        Deque deque = modelConsistencyChecker.stack;
        Object dequeStackLock = getFieldValue(deque, "lock");
        Object dequeStackLockStackLockSync = getFieldValue(dequeStackLock, "sync");
        Object finalModelConsistencyCheckerStackLockSyncState = getFieldValue(dequeStackLockStackLockSync, "state");
        
        assertEquals(3, finalModelConsistencyCheckerStackLockSyncState);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDumpStack5() throws Throwable  {
        ModelConsistencyChecker modelConsistencyChecker = ((ModelConsistencyChecker) createInstance("spoon.reflect.visitor.ModelConsistencyChecker"));
        LinkedBlockingDeque linkedBlockingDeque = ((LinkedBlockingDeque) createInstance("java.util.concurrent.LinkedBlockingDeque"));
        EquinoxReentrantLock equinoxReentrantLock = ((EquinoxReentrantLock) createInstance("org.eclipse.osgi.internal.container.EquinoxReentrantLock"));
        Object fairSync = createInstance("java.util.concurrent.locks.ReentrantLock$FairSync");
        Thread thread = ((Thread) createInstance("java.lang.Thread"));
        setField(fairSync, "exclusiveOwnerThread", thread);
        setField(fairSync, "state", Integer.MAX_VALUE);
        setField(equinoxReentrantLock, "sync", fairSync);
        setField(linkedBlockingDeque, "lock", equinoxReentrantLock);
        setField(modelConsistencyChecker, "stack", linkedBlockingDeque);
        Environment environmentMock = mock(Environment.class);
        modelConsistencyChecker.environment = environmentMock;
        
        Class modelConsistencyCheckerClazz = Class.forName("spoon.reflect.visitor.ModelConsistencyChecker");
        Method dumpStackMethod = modelConsistencyCheckerClazz.getDeclaredMethod("dumpStack");
        dumpStackMethod.setAccessible(true);
        java.lang.Object[] dumpStackMethodArguments = new java.lang.Object[0];
        try {
            dumpStackMethod.invoke(modelConsistencyChecker, dumpStackMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testModelConsistencyChecker1() {
        ModelConsistencyChecker actual = new ModelConsistencyChecker(null, false, false);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testModelConsistencyChecker2() throws Throwable  {
        Environment environmentMock = mock(Environment.class);
        ModelConsistencyChecker actual = new ModelConsistencyChecker(environmentMock, false, false);
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
    private static sun.misc.Unsafe getUnsafeInstance() throws Exception {
        java.lang.reflect.Field f = sun.misc.Unsafe.class.getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return (sun.misc.Unsafe) f.get(null);
    }
}
