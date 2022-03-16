package com.google.common.util.concurrent;

import org.junit.Test;
import java.lang.reflect.Method;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ForkJoinPool;
import java.util.InputMismatchException;
import java.util.concurrent.ThreadPoolExecutor;
import com.google.common.cache.CacheLoader.InvalidCacheLoadException;
import com.google.common.cache.CacheLoader;
import com.google.common.base.VerifyException;
import java.nio.channels.UnresolvedAddressException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Array;
import java.util.Objects;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Iterator;
import sun.misc.Unsafe;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class SimpleTimeLimiterTest {
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testRunWithTimeout1() throws Throwable  {
        SimpleTimeLimiter simpleTimeLimiter = ((SimpleTimeLimiter) createInstance("com.google.common.util.concurrent.SimpleTimeLimiter"));
        
        simpleTimeLimiter.runWithTimeout(null, 0L, null);
    }
    ///endregion
    
    
    ///region Errors report for runWithTimeout
    
    public void testRunWithTimeout_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // ClassId java.util.concurrent.TimeUnit$1 does not have canonical name
        // 
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCallWithTimeout1() throws Throwable  {
        SimpleTimeLimiter simpleTimeLimiter = ((SimpleTimeLimiter) createInstance("com.google.common.util.concurrent.SimpleTimeLimiter"));
        
        simpleTimeLimiter.callWithTimeout(null, 0L, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCallWithTimeout2() throws Throwable  {
        SimpleTimeLimiter simpleTimeLimiter = ((SimpleTimeLimiter) createInstance("com.google.common.util.concurrent.SimpleTimeLimiter"));
        Object runnableAdapter = createInstance("java.util.concurrent.Executors$RunnableAdapter");
        
        Class simpleTimeLimiterClazz = Class.forName("com.google.common.util.concurrent.SimpleTimeLimiter");
        Class runnableAdapterType = Class.forName("java.util.concurrent.Callable");
        Class longType = long.class;
        Class timeUnitType = Class.forName("java.util.concurrent.TimeUnit");
        Method callWithTimeoutMethod = simpleTimeLimiterClazz.getDeclaredMethod("callWithTimeout", runnableAdapterType, longType, timeUnitType);
        callWithTimeoutMethod.setAccessible(true);
        java.lang.Object[] callWithTimeoutMethodArguments = new java.lang.Object[3];
        callWithTimeoutMethodArguments[0] = runnableAdapter;
        callWithTimeoutMethodArguments[1] = 0L;
        callWithTimeoutMethodArguments[2] = null;
        try {
            callWithTimeoutMethod.invoke(simpleTimeLimiter, callWithTimeoutMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    
    ///region Errors report for callWithTimeout
    
    public void testCallWithTimeout_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // ClassId java.util.concurrent.TimeUnit$1 does not have canonical name
        // 
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCallWithTimeout4() throws Throwable  {
        SimpleTimeLimiter simpleTimeLimiter = ((SimpleTimeLimiter) createInstance("com.google.common.util.concurrent.SimpleTimeLimiter"));
        
        Class simpleTimeLimiterClazz = Class.forName("com.google.common.util.concurrent.SimpleTimeLimiter");
        Class callableType = Class.forName("java.util.concurrent.Callable");
        Class longType = long.class;
        Class timeUnitType = Class.forName("java.util.concurrent.TimeUnit");
        Class booleanType = boolean.class;
        Method callWithTimeoutMethod = simpleTimeLimiterClazz.getDeclaredMethod("callWithTimeout", callableType, longType, timeUnitType, booleanType);
        callWithTimeoutMethod.setAccessible(true);
        java.lang.Object[] callWithTimeoutMethodArguments = new java.lang.Object[4];
        callWithTimeoutMethodArguments[0] = null;
        callWithTimeoutMethodArguments[1] = 0L;
        callWithTimeoutMethodArguments[2] = null;
        callWithTimeoutMethodArguments[3] = false;
        try {
            callWithTimeoutMethod.invoke(simpleTimeLimiter, callWithTimeoutMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCallWithTimeout5() throws Throwable  {
        SimpleTimeLimiter simpleTimeLimiter = ((SimpleTimeLimiter) createInstance("com.google.common.util.concurrent.SimpleTimeLimiter"));
        Object runnableAdapter = createInstance("java.util.concurrent.Executors$RunnableAdapter");
        
        Class simpleTimeLimiterClazz = Class.forName("com.google.common.util.concurrent.SimpleTimeLimiter");
        Class runnableAdapterType = Class.forName("java.util.concurrent.Callable");
        Class longType = long.class;
        Class timeUnitType = Class.forName("java.util.concurrent.TimeUnit");
        Class booleanType = boolean.class;
        Method callWithTimeoutMethod = simpleTimeLimiterClazz.getDeclaredMethod("callWithTimeout", runnableAdapterType, longType, timeUnitType, booleanType);
        callWithTimeoutMethod.setAccessible(true);
        java.lang.Object[] callWithTimeoutMethodArguments = new java.lang.Object[4];
        callWithTimeoutMethodArguments[0] = runnableAdapter;
        callWithTimeoutMethodArguments[1] = 0L;
        callWithTimeoutMethodArguments[2] = null;
        callWithTimeoutMethodArguments[3] = false;
        try {
            callWithTimeoutMethod.invoke(simpleTimeLimiter, callWithTimeoutMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    
    ///region Errors report for callWithTimeout
    
    public void testCallWithTimeout_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // ClassId java.util.concurrent.TimeUnit$1 does not have canonical name
        // 
    }
    ///endregion
    
    
    ///region Errors report for callWithTimeout
    
    public void testCallWithTimeout_errors2()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // ClassId java.util.concurrent.TimeUnit$1 does not have canonical name
        // 
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testNewProxy1() throws Throwable  {
        SimpleTimeLimiter simpleTimeLimiter = ((SimpleTimeLimiter) createInstance("com.google.common.util.concurrent.SimpleTimeLimiter"));
        java.lang.Object[] fifoWaitQueueArray = createArray("java.util.concurrent.SynchronousQueue$FifoWaitQueue", 0);
        
        simpleTimeLimiter.newProxy(fifoWaitQueueArray, null, 0L, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testNewProxy2() throws Throwable  {
        SimpleTimeLimiter simpleTimeLimiter = ((SimpleTimeLimiter) createInstance("com.google.common.util.concurrent.SimpleTimeLimiter"));
        java.lang.Object[] fifoWaitQueueArray = createArray("java.util.concurrent.SynchronousQueue$FifoWaitQueue", 0);
        Class class1 = Object.class;
        
        simpleTimeLimiter.newProxy(fifoWaitQueueArray, class1, 0L, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCallUninterruptiblyWithTimeout1() throws Throwable  {
        SimpleTimeLimiter simpleTimeLimiter = ((SimpleTimeLimiter) createInstance("com.google.common.util.concurrent.SimpleTimeLimiter"));
        
        simpleTimeLimiter.callUninterruptiblyWithTimeout(null, 0L, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCallUninterruptiblyWithTimeout2() throws Throwable  {
        SimpleTimeLimiter simpleTimeLimiter = ((SimpleTimeLimiter) createInstance("com.google.common.util.concurrent.SimpleTimeLimiter"));
        Object runnableAdapter = createInstance("java.util.concurrent.Executors$RunnableAdapter");
        
        Class simpleTimeLimiterClazz = Class.forName("com.google.common.util.concurrent.SimpleTimeLimiter");
        Class runnableAdapterType = Class.forName("java.util.concurrent.Callable");
        Class longType = long.class;
        Class timeUnitType = Class.forName("java.util.concurrent.TimeUnit");
        Method callUninterruptiblyWithTimeoutMethod = simpleTimeLimiterClazz.getDeclaredMethod("callUninterruptiblyWithTimeout", runnableAdapterType, longType, timeUnitType);
        callUninterruptiblyWithTimeoutMethod.setAccessible(true);
        java.lang.Object[] callUninterruptiblyWithTimeoutMethodArguments = new java.lang.Object[3];
        callUninterruptiblyWithTimeoutMethodArguments[0] = runnableAdapter;
        callUninterruptiblyWithTimeoutMethodArguments[1] = 0L;
        callUninterruptiblyWithTimeoutMethodArguments[2] = null;
        try {
            callUninterruptiblyWithTimeoutMethod.invoke(simpleTimeLimiter, callUninterruptiblyWithTimeoutMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    
    ///region Errors report for callUninterruptiblyWithTimeout
    
    public void testCallUninterruptiblyWithTimeout_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // ClassId java.util.concurrent.TimeUnit$1 does not have canonical name
        // 
    }
    ///endregion
    
    
    ///region Errors report for callUninterruptiblyWithTimeout
    
    public void testCallUninterruptiblyWithTimeout_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // ClassId java.util.concurrent.TimeUnit$1 does not have canonical name
        // 
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testRunUninterruptiblyWithTimeout1() throws Throwable  {
        SimpleTimeLimiter simpleTimeLimiter = ((SimpleTimeLimiter) createInstance("com.google.common.util.concurrent.SimpleTimeLimiter"));
        
        simpleTimeLimiter.runUninterruptiblyWithTimeout(null, 0L, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testRunUninterruptiblyWithTimeout2() throws Throwable  {
        SimpleTimeLimiter simpleTimeLimiter = ((SimpleTimeLimiter) createInstance("com.google.common.util.concurrent.SimpleTimeLimiter"));
        Object fire = createInstance("com.google.common.util.concurrent.TimeoutFuture$Fire");
        
        Class simpleTimeLimiterClazz = Class.forName("com.google.common.util.concurrent.SimpleTimeLimiter");
        Class fireType = Class.forName("java.lang.Runnable");
        Class longType = long.class;
        Class timeUnitType = Class.forName("java.util.concurrent.TimeUnit");
        Method runUninterruptiblyWithTimeoutMethod = simpleTimeLimiterClazz.getDeclaredMethod("runUninterruptiblyWithTimeout", fireType, longType, timeUnitType);
        runUninterruptiblyWithTimeoutMethod.setAccessible(true);
        java.lang.Object[] runUninterruptiblyWithTimeoutMethodArguments = new java.lang.Object[3];
        runUninterruptiblyWithTimeoutMethodArguments[0] = fire;
        runUninterruptiblyWithTimeoutMethodArguments[1] = 0L;
        runUninterruptiblyWithTimeoutMethodArguments[2] = null;
        try {
            runUninterruptiblyWithTimeoutMethod.invoke(simpleTimeLimiter, runUninterruptiblyWithTimeoutMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    
    ///region Errors report for runUninterruptiblyWithTimeout
    
    public void testRunUninterruptiblyWithTimeout_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // ClassId java.util.concurrent.TimeUnit$1 does not have canonical name
        // 
    }
    ///endregion
    
    
    ///region Errors report for runUninterruptiblyWithTimeout
    
    public void testRunUninterruptiblyWithTimeout_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // ClassId java.util.concurrent.TimeUnit$1 does not have canonical name
        // 
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testWrapAndThrowExecutionExceptionOrError1() throws Throwable  {
        SimpleTimeLimiter simpleTimeLimiter = ((SimpleTimeLimiter) createInstance("com.google.common.util.concurrent.SimpleTimeLimiter"));
        Throwable throwable = new Throwable();
        
        Class simpleTimeLimiterClazz = Class.forName("com.google.common.util.concurrent.SimpleTimeLimiter");
        Class throwableType = Class.forName("java.lang.Throwable");
        Method wrapAndThrowExecutionExceptionOrErrorMethod = simpleTimeLimiterClazz.getDeclaredMethod("wrapAndThrowExecutionExceptionOrError", throwableType);
        wrapAndThrowExecutionExceptionOrErrorMethod.setAccessible(true);
        java.lang.Object[] wrapAndThrowExecutionExceptionOrErrorMethodArguments = new java.lang.Object[1];
        wrapAndThrowExecutionExceptionOrErrorMethodArguments[0] = throwable;
        try {
            wrapAndThrowExecutionExceptionOrErrorMethod.invoke(simpleTimeLimiter, wrapAndThrowExecutionExceptionOrErrorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testWrapAndThrowExecutionExceptionOrError2() throws Throwable  {
        SimpleTimeLimiter simpleTimeLimiter = ((SimpleTimeLimiter) createInstance("com.google.common.util.concurrent.SimpleTimeLimiter"));
        AssertionError assertionError = ((AssertionError) createInstance("java.lang.AssertionError"));
        
        Class simpleTimeLimiterClazz = Class.forName("com.google.common.util.concurrent.SimpleTimeLimiter");
        Class assertionErrorType = Class.forName("java.lang.Throwable");
        Method wrapAndThrowExecutionExceptionOrErrorMethod = simpleTimeLimiterClazz.getDeclaredMethod("wrapAndThrowExecutionExceptionOrError", assertionErrorType);
        wrapAndThrowExecutionExceptionOrErrorMethod.setAccessible(true);
        java.lang.Object[] wrapAndThrowExecutionExceptionOrErrorMethodArguments = new java.lang.Object[1];
        wrapAndThrowExecutionExceptionOrErrorMethodArguments[0] = assertionError;
        try {
            wrapAndThrowExecutionExceptionOrErrorMethod.invoke(simpleTimeLimiter, wrapAndThrowExecutionExceptionOrErrorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testWrapAndThrowExecutionExceptionOrError3() throws Throwable  {
        SimpleTimeLimiter simpleTimeLimiter = ((SimpleTimeLimiter) createInstance("com.google.common.util.concurrent.SimpleTimeLimiter"));
        
        Class simpleTimeLimiterClazz = Class.forName("com.google.common.util.concurrent.SimpleTimeLimiter");
        Class throwableType = Class.forName("java.lang.Throwable");
        Method wrapAndThrowExecutionExceptionOrErrorMethod = simpleTimeLimiterClazz.getDeclaredMethod("wrapAndThrowExecutionExceptionOrError", throwableType);
        wrapAndThrowExecutionExceptionOrErrorMethod.setAccessible(true);
        java.lang.Object[] wrapAndThrowExecutionExceptionOrErrorMethodArguments = new java.lang.Object[1];
        wrapAndThrowExecutionExceptionOrErrorMethodArguments[0] = null;
        try {
            wrapAndThrowExecutionExceptionOrErrorMethod.invoke(simpleTimeLimiter, wrapAndThrowExecutionExceptionOrErrorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testWrapAndThrowExecutionExceptionOrError4() throws Throwable  {
        SimpleTimeLimiter simpleTimeLimiter = ((SimpleTimeLimiter) createInstance("com.google.common.util.concurrent.SimpleTimeLimiter"));
        InputMismatchException inputMismatchException = ((InputMismatchException) createInstance("java.util.InputMismatchException"));
        
        Class simpleTimeLimiterClazz = Class.forName("com.google.common.util.concurrent.SimpleTimeLimiter");
        Class inputMismatchExceptionType = Class.forName("java.lang.Throwable");
        Method wrapAndThrowExecutionExceptionOrErrorMethod = simpleTimeLimiterClazz.getDeclaredMethod("wrapAndThrowExecutionExceptionOrError", inputMismatchExceptionType);
        wrapAndThrowExecutionExceptionOrErrorMethod.setAccessible(true);
        java.lang.Object[] wrapAndThrowExecutionExceptionOrErrorMethodArguments = new java.lang.Object[1];
        wrapAndThrowExecutionExceptionOrErrorMethodArguments[0] = inputMismatchException;
        try {
            wrapAndThrowExecutionExceptionOrErrorMethod.invoke(simpleTimeLimiter, wrapAndThrowExecutionExceptionOrErrorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testWrapAndThrowRuntimeExecutionExceptionOrError1() throws Throwable  {
        SimpleTimeLimiter simpleTimeLimiter = ((SimpleTimeLimiter) createInstance("com.google.common.util.concurrent.SimpleTimeLimiter"));
        Throwable throwable = new Throwable();
        
        Class simpleTimeLimiterClazz = Class.forName("com.google.common.util.concurrent.SimpleTimeLimiter");
        Class throwableType = Class.forName("java.lang.Throwable");
        Method wrapAndThrowRuntimeExecutionExceptionOrErrorMethod = simpleTimeLimiterClazz.getDeclaredMethod("wrapAndThrowRuntimeExecutionExceptionOrError", throwableType);
        wrapAndThrowRuntimeExecutionExceptionOrErrorMethod.setAccessible(true);
        java.lang.Object[] wrapAndThrowRuntimeExecutionExceptionOrErrorMethodArguments = new java.lang.Object[1];
        wrapAndThrowRuntimeExecutionExceptionOrErrorMethodArguments[0] = throwable;
        try {
            wrapAndThrowRuntimeExecutionExceptionOrErrorMethod.invoke(simpleTimeLimiter, wrapAndThrowRuntimeExecutionExceptionOrErrorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testWrapAndThrowRuntimeExecutionExceptionOrError2() throws Throwable  {
        SimpleTimeLimiter simpleTimeLimiter = ((SimpleTimeLimiter) createInstance("com.google.common.util.concurrent.SimpleTimeLimiter"));
        AssertionError assertionError = ((AssertionError) createInstance("java.lang.AssertionError"));
        
        Class simpleTimeLimiterClazz = Class.forName("com.google.common.util.concurrent.SimpleTimeLimiter");
        Class assertionErrorType = Class.forName("java.lang.Throwable");
        Method wrapAndThrowRuntimeExecutionExceptionOrErrorMethod = simpleTimeLimiterClazz.getDeclaredMethod("wrapAndThrowRuntimeExecutionExceptionOrError", assertionErrorType);
        wrapAndThrowRuntimeExecutionExceptionOrErrorMethod.setAccessible(true);
        java.lang.Object[] wrapAndThrowRuntimeExecutionExceptionOrErrorMethodArguments = new java.lang.Object[1];
        wrapAndThrowRuntimeExecutionExceptionOrErrorMethodArguments[0] = assertionError;
        try {
            wrapAndThrowRuntimeExecutionExceptionOrErrorMethod.invoke(simpleTimeLimiter, wrapAndThrowRuntimeExecutionExceptionOrErrorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testWrapAndThrowRuntimeExecutionExceptionOrError3() throws Throwable  {
        SimpleTimeLimiter simpleTimeLimiter = ((SimpleTimeLimiter) createInstance("com.google.common.util.concurrent.SimpleTimeLimiter"));
        
        Class simpleTimeLimiterClazz = Class.forName("com.google.common.util.concurrent.SimpleTimeLimiter");
        Class throwableType = Class.forName("java.lang.Throwable");
        Method wrapAndThrowRuntimeExecutionExceptionOrErrorMethod = simpleTimeLimiterClazz.getDeclaredMethod("wrapAndThrowRuntimeExecutionExceptionOrError", throwableType);
        wrapAndThrowRuntimeExecutionExceptionOrErrorMethod.setAccessible(true);
        java.lang.Object[] wrapAndThrowRuntimeExecutionExceptionOrErrorMethodArguments = new java.lang.Object[1];
        wrapAndThrowRuntimeExecutionExceptionOrErrorMethodArguments[0] = null;
        try {
            wrapAndThrowRuntimeExecutionExceptionOrErrorMethod.invoke(simpleTimeLimiter, wrapAndThrowRuntimeExecutionExceptionOrErrorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreate1() throws Throwable  {
        SimpleTimeLimiter.create(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCreate2() throws Throwable  {
        ThreadPoolExecutor threadPoolExecutor = ((ThreadPoolExecutor) createInstance("java.util.concurrent.ThreadPoolExecutor"));
        
        Class simpleTimeLimiterClazz = Class.forName("com.google.common.util.concurrent.SimpleTimeLimiter");
        Class threadPoolExecutorType = Class.forName("java.util.concurrent.ExecutorService");
        Method createMethod = simpleTimeLimiterClazz.getDeclaredMethod("create", threadPoolExecutorType);
        createMethod.setAccessible(true);
        java.lang.Object[] createMethodArguments = new java.lang.Object[1];
        createMethodArguments[0] = threadPoolExecutor;
        SimpleTimeLimiter actual = ((SimpleTimeLimiter) createMethod.invoke(null, createMethodArguments));
        
        SimpleTimeLimiter expected = ((SimpleTimeLimiter) createInstance("com.google.common.util.concurrent.SimpleTimeLimiter"));
        setField(expected, "executor", threadPoolExecutor);
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreate3() throws Throwable  {
        SimpleTimeLimiter.create(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testNewProxy3() throws Throwable  {
        Object typeVariableInvocationHandler = createInstance("com.google.common.reflect.Types$TypeVariableInvocationHandler");
        
        Class simpleTimeLimiterClazz = Class.forName("com.google.common.util.concurrent.SimpleTimeLimiter");
        Class classType = Class.forName("java.lang.Class");
        Class typeVariableInvocationHandlerType = Class.forName("java.lang.reflect.InvocationHandler");
        Method newProxyMethod = simpleTimeLimiterClazz.getDeclaredMethod("newProxy", classType, typeVariableInvocationHandlerType);
        newProxyMethod.setAccessible(true);
        java.lang.Object[] newProxyMethodArguments = new java.lang.Object[2];
        newProxyMethodArguments[0] = null;
        newProxyMethodArguments[1] = typeVariableInvocationHandler;
        try {
            newProxyMethod.invoke(null, newProxyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    
    ///region Errors report for newProxy
    
    public void testNewProxy_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Field security is not found in class java.lang.System
        // 
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testThrowCause1() throws Throwable  {
        Exception exception = new Exception();
        
        Class simpleTimeLimiterClazz = Class.forName("com.google.common.util.concurrent.SimpleTimeLimiter");
        Class exceptionType = Class.forName("java.lang.Exception");
        Class booleanType = boolean.class;
        Method throwCauseMethod = simpleTimeLimiterClazz.getDeclaredMethod("throwCause", exceptionType, booleanType);
        throwCauseMethod.setAccessible(true);
        java.lang.Object[] throwCauseMethodArguments = new java.lang.Object[2];
        throwCauseMethodArguments[0] = exception;
        throwCauseMethodArguments[1] = false;
        try {
            throwCauseMethod.invoke(null, throwCauseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testThrowCause2() throws Throwable  {
        Class simpleTimeLimiterClazz = Class.forName("com.google.common.util.concurrent.SimpleTimeLimiter");
        Class exceptionType = Class.forName("java.lang.Exception");
        Class booleanType = boolean.class;
        Method throwCauseMethod = simpleTimeLimiterClazz.getDeclaredMethod("throwCause", exceptionType, booleanType);
        throwCauseMethod.setAccessible(true);
        java.lang.Object[] throwCauseMethodArguments = new java.lang.Object[2];
        throwCauseMethodArguments[0] = null;
        throwCauseMethodArguments[1] = false;
        try {
            throwCauseMethod.invoke(null, throwCauseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testThrowCause3() throws Throwable  {
        CacheLoader.InvalidCacheLoadException invalidCacheLoadException = ((CacheLoader.InvalidCacheLoadException) createInstance("com.google.common.cache.CacheLoader$InvalidCacheLoadException"));
        setField(invalidCacheLoadException, "cause", invalidCacheLoadException);
        
        Class simpleTimeLimiterClazz = Class.forName("com.google.common.util.concurrent.SimpleTimeLimiter");
        Class invalidCacheLoadExceptionType = Class.forName("java.lang.Exception");
        Class booleanType = boolean.class;
        Method throwCauseMethod = simpleTimeLimiterClazz.getDeclaredMethod("throwCause", invalidCacheLoadExceptionType, booleanType);
        throwCauseMethod.setAccessible(true);
        java.lang.Object[] throwCauseMethodArguments = new java.lang.Object[2];
        throwCauseMethodArguments[0] = invalidCacheLoadException;
        throwCauseMethodArguments[1] = false;
        try {
            throwCauseMethod.invoke(null, throwCauseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testThrowCause4() throws Throwable  {
        VerifyException verifyException = ((VerifyException) createInstance("com.google.common.base.VerifyException"));
        UnresolvedAddressException unresolvedAddressException = ((UnresolvedAddressException) createInstance("java.nio.channels.UnresolvedAddressException"));
        setField(unresolvedAddressException, "cause", null);
        setField(verifyException, "cause", unresolvedAddressException);
        
        Class simpleTimeLimiterClazz = Class.forName("com.google.common.util.concurrent.SimpleTimeLimiter");
        Class verifyExceptionType = Class.forName("java.lang.Exception");
        Class booleanType = boolean.class;
        Method throwCauseMethod = simpleTimeLimiterClazz.getDeclaredMethod("throwCause", verifyExceptionType, booleanType);
        throwCauseMethod.setAccessible(true);
        java.lang.Object[] throwCauseMethodArguments = new java.lang.Object[2];
        throwCauseMethodArguments[0] = verifyException;
        throwCauseMethodArguments[1] = false;
        try {
            throwCauseMethod.invoke(null, throwCauseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testThrowCause5() throws Throwable  {
        UncheckedTimeoutException uncheckedTimeoutException = ((UncheckedTimeoutException) createInstance("com.google.common.util.concurrent.UncheckedTimeoutException"));
        Object emptyServiceManagerWarning = createInstance("com.google.common.util.concurrent.ServiceManager$EmptyServiceManagerWarning");
        setField(emptyServiceManagerWarning, "cause", null);
        setField(uncheckedTimeoutException, "cause", emptyServiceManagerWarning);
        
        Class simpleTimeLimiterClazz = Class.forName("com.google.common.util.concurrent.SimpleTimeLimiter");
        Class uncheckedTimeoutExceptionType = Class.forName("java.lang.Exception");
        Class booleanType = boolean.class;
        Method throwCauseMethod = simpleTimeLimiterClazz.getDeclaredMethod("throwCause", uncheckedTimeoutExceptionType, booleanType);
        throwCauseMethod.setAccessible(true);
        java.lang.Object[] throwCauseMethodArguments = new java.lang.Object[2];
        throwCauseMethodArguments[0] = uncheckedTimeoutException;
        throwCauseMethodArguments[1] = false;
        try {
            throwCauseMethod.invoke(null, throwCauseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testThrowCause6() throws Throwable  {
        NoSuchFieldException noSuchFieldException = ((NoSuchFieldException) createInstance("java.lang.NoSuchFieldException"));
        AssertionError assertionError = ((AssertionError) createInstance("java.lang.AssertionError"));
        setField(assertionError, "cause", null);
        setField(noSuchFieldException, "cause", assertionError);
        
        Class simpleTimeLimiterClazz = Class.forName("com.google.common.util.concurrent.SimpleTimeLimiter");
        Class noSuchFieldExceptionType = Class.forName("java.lang.Exception");
        Class booleanType = boolean.class;
        Method throwCauseMethod = simpleTimeLimiterClazz.getDeclaredMethod("throwCause", noSuchFieldExceptionType, booleanType);
        throwCauseMethod.setAccessible(true);
        java.lang.Object[] throwCauseMethodArguments = new java.lang.Object[2];
        throwCauseMethodArguments[0] = noSuchFieldException;
        throwCauseMethodArguments[1] = false;
        try {
            throwCauseMethod.invoke(null, throwCauseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testFindInterruptibleMethods1() throws Throwable  {
        Class simpleTimeLimiterClazz = Class.forName("com.google.common.util.concurrent.SimpleTimeLimiter");
        Class classType = Class.forName("java.lang.Class");
        Method findInterruptibleMethodsMethod = simpleTimeLimiterClazz.getDeclaredMethod("findInterruptibleMethods", classType);
        findInterruptibleMethodsMethod.setAccessible(true);
        java.lang.Object[] findInterruptibleMethodsMethodArguments = new java.lang.Object[1];
        findInterruptibleMethodsMethodArguments[0] = null;
        try {
            findInterruptibleMethodsMethod.invoke(null, findInterruptibleMethodsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    
    ///region Errors report for findInterruptibleMethods
    
    public void testFindInterruptibleMethods_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Field security is not found in class java.lang.System
        // 
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDeclaresInterruptedEx1() throws Throwable  {
        Class simpleTimeLimiterClazz = Class.forName("com.google.common.util.concurrent.SimpleTimeLimiter");
        Class methodType = Class.forName("java.lang.reflect.Method");
        Method declaresInterruptedExMethod = simpleTimeLimiterClazz.getDeclaredMethod("declaresInterruptedEx", methodType);
        declaresInterruptedExMethod.setAccessible(true);
        java.lang.Object[] declaresInterruptedExMethodArguments = new java.lang.Object[1];
        declaresInterruptedExMethodArguments[0] = null;
        try {
            declaresInterruptedExMethod.invoke(null, declaresInterruptedExMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDeclaresInterruptedEx2() throws Throwable  {
        Method method = ((Method) createInstance("java.lang.reflect.Method"));
        java.lang.Class[] classArray = new java.lang.Class[0];
        setField(method, "exceptionTypes", classArray);
        
        Class simpleTimeLimiterClazz = Class.forName("com.google.common.util.concurrent.SimpleTimeLimiter");
        Class methodType = Class.forName("java.lang.reflect.Method");
        Method declaresInterruptedExMethod = simpleTimeLimiterClazz.getDeclaredMethod("declaresInterruptedEx", methodType);
        declaresInterruptedExMethod.setAccessible(true);
        java.lang.Object[] declaresInterruptedExMethodArguments = new java.lang.Object[1];
        declaresInterruptedExMethodArguments[0] = method;
        boolean actual = ((boolean) declaresInterruptedExMethod.invoke(null, declaresInterruptedExMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDeclaresInterruptedEx3() throws Throwable  {
        Method method = ((Method) createInstance("java.lang.reflect.Method"));
        java.lang.Class[] classArray = new java.lang.Class[1];
        Class class1 = Object.class;
        classArray[0] = class1;
        setField(method, "exceptionTypes", classArray);
        
        Class simpleTimeLimiterClazz = Class.forName("com.google.common.util.concurrent.SimpleTimeLimiter");
        Class methodType = Class.forName("java.lang.reflect.Method");
        Method declaresInterruptedExMethod = simpleTimeLimiterClazz.getDeclaredMethod("declaresInterruptedEx", methodType);
        declaresInterruptedExMethod.setAccessible(true);
        java.lang.Object[] declaresInterruptedExMethodArguments = new java.lang.Object[1];
        declaresInterruptedExMethodArguments[0] = method;
        boolean actual = ((boolean) declaresInterruptedExMethod.invoke(null, declaresInterruptedExMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCheckPositiveTimeout1() throws Throwable  {
        Class simpleTimeLimiterClazz = Class.forName("com.google.common.util.concurrent.SimpleTimeLimiter");
        Class longType = long.class;
        Method checkPositiveTimeoutMethod = simpleTimeLimiterClazz.getDeclaredMethod("checkPositiveTimeout", longType);
        checkPositiveTimeoutMethod.setAccessible(true);
        java.lang.Object[] checkPositiveTimeoutMethodArguments = new java.lang.Object[1];
        checkPositiveTimeoutMethodArguments[0] = 0L;
        try {
            checkPositiveTimeoutMethod.invoke(null, checkPositiveTimeoutMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCheckPositiveTimeout2() throws Throwable  {
        Class simpleTimeLimiterClazz = Class.forName("com.google.common.util.concurrent.SimpleTimeLimiter");
        Class longType = long.class;
        Method checkPositiveTimeoutMethod = simpleTimeLimiterClazz.getDeclaredMethod("checkPositiveTimeout", longType);
        checkPositiveTimeoutMethod.setAccessible(true);
        java.lang.Object[] checkPositiveTimeoutMethodArguments = new java.lang.Object[1];
        checkPositiveTimeoutMethodArguments[0] = 1L;
        checkPositiveTimeoutMethod.invoke(null, checkPositiveTimeoutMethodArguments);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCheckPositiveTimeout3() throws Throwable  {
        Class simpleTimeLimiterClazz = Class.forName("com.google.common.util.concurrent.SimpleTimeLimiter");
        Class longType = long.class;
        Method checkPositiveTimeoutMethod = simpleTimeLimiterClazz.getDeclaredMethod("checkPositiveTimeout", longType);
        checkPositiveTimeoutMethod.setAccessible(true);
        java.lang.Object[] checkPositiveTimeoutMethodArguments = new java.lang.Object[1];
        checkPositiveTimeoutMethodArguments[0] = -9223372036854775806L;
        try {
            checkPositiveTimeoutMethod.invoke(null, checkPositiveTimeoutMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testSimpleTimeLimiter1() throws Throwable  {
        Class simpleTimeLimiterClazz = Class.forName("com.google.common.util.concurrent.SimpleTimeLimiter");
        Class executorServiceType = Class.forName("java.util.concurrent.ExecutorService");
        Constructor simpleTimeLimiterConstructor = simpleTimeLimiterClazz.getDeclaredConstructor(executorServiceType);
        simpleTimeLimiterConstructor.setAccessible(true);
        java.lang.Object[] simpleTimeLimiterConstructorArguments = new java.lang.Object[1];
        simpleTimeLimiterConstructorArguments[0] = null;
        simpleTimeLimiterConstructor.newInstance(simpleTimeLimiterConstructorArguments);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testSimpleTimeLimiter2() throws Throwable  {
        Class simpleTimeLimiterClazz = Class.forName("com.google.common.util.concurrent.SimpleTimeLimiter");
        Class executorServiceType = Class.forName("java.util.concurrent.ExecutorService");
        Constructor simpleTimeLimiterConstructor = simpleTimeLimiterClazz.getDeclaredConstructor(executorServiceType);
        simpleTimeLimiterConstructor.setAccessible(true);
        java.lang.Object[] simpleTimeLimiterConstructorArguments = new java.lang.Object[1];
        simpleTimeLimiterConstructorArguments[0] = null;
        simpleTimeLimiterConstructor.newInstance(simpleTimeLimiterConstructorArguments);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSimpleTimeLimiter3() throws Throwable  {
        ThreadPoolExecutor threadPoolExecutor = ((ThreadPoolExecutor) createInstance("java.util.concurrent.ThreadPoolExecutor"));
        Class simpleTimeLimiterClazz = Class.forName("com.google.common.util.concurrent.SimpleTimeLimiter");
        Class threadPoolExecutorType = Class.forName("java.util.concurrent.ExecutorService");
        Constructor simpleTimeLimiterConstructor = simpleTimeLimiterClazz.getDeclaredConstructor(threadPoolExecutorType);
        simpleTimeLimiterConstructor.setAccessible(true);
        java.lang.Object[] simpleTimeLimiterConstructorArguments = new java.lang.Object[1];
        simpleTimeLimiterConstructorArguments[0] = threadPoolExecutor;
        SimpleTimeLimiter actual = ((SimpleTimeLimiter) simpleTimeLimiterConstructor.newInstance(simpleTimeLimiterConstructorArguments));
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
    private static Object getStaticFieldValue(Class<?> clazz, String fieldName) throws Exception {
        java.lang.reflect.Field field;
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);
                java.lang.reflect.Field modifiersField = java.lang.reflect.Field.class.getDeclaredField("modifiers");
                modifiersField.setAccessible(true);
                modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
                
                return field.get(null);
            } catch (NoSuchFieldException e) {
                clazz = clazz.getSuperclass();
            }
        } while (clazz != null);
    
        throw new NoSuchFieldException("Field '" + fieldName + "' not found on class " + clazz);
    }
    private static sun.misc.Unsafe getUnsafeInstance() throws Exception {
        java.lang.reflect.Field f = sun.misc.Unsafe.class.getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return (sun.misc.Unsafe) f.get(null);
    }
}
