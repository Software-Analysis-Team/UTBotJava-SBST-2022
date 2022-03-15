package com.google.common.util.concurrent;

import org.junit.Test;
import sun.net.ConnectionResetException;
import java.lang.reflect.Method;
import java.util.InputMismatchException;
import com.google.common.cache.CacheLoader.InvalidCacheLoadException;
import com.google.common.cache.CacheLoader;
import com.google.common.base.VerifyException;
import java.nio.channels.UnresolvedAddressException;
import java.lang.reflect.UndeclaredThrowableException;
import java.lang.reflect.InvocationTargetException;
import jdk.internal.org.xml.sax.SAXException;
import java.util.HashSet;
import java.lang.ref.ReferenceQueue;
import sun.reflect.ReflectionFactory;
import java.util.concurrent.ThreadPoolExecutor.CallerRunsPolicy;
import java.util.concurrent.ThreadPoolExecutor;
import java.lang.reflect.Constructor;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.Arrays;
import java.util.Iterator;
import sun.misc.Unsafe;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.ArgumentMatchers.anyBoolean;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.junit.Assert.assertFalse;
import static java.lang.reflect.Array.get;
import static org.junit.Assert.assertTrue;

public class SimpleTimeLimiterTest {
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testNewProxy1() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(com.google.common.base.Preconditions.class);
            java.lang.Object[] fifoWaitQueueArray = createArray("java.util.concurrent.SynchronousQueue$FifoWaitQueue", 0);
            mockedStatic.when(() -> {
                com.google.common.base.Preconditions.checkNotNull(any());
            }).thenReturn(((Object) fifoWaitQueueArray), ((Object) fifoWaitQueueArray), ((Object) fifoWaitQueueArray));
            SimpleTimeLimiter simpleTimeLimiter = ((SimpleTimeLimiter) createInstance("com.google.common.util.concurrent.SimpleTimeLimiter"));
            
            simpleTimeLimiter.newProxy(fifoWaitQueueArray, null, 1L, null);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testNewProxy2() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(com.google.common.base.Preconditions.class);
            sun.net.ConnectionResetException[] connectionResetExceptionArray = new sun.net.ConnectionResetException[0];
            mockedStatic.when(() -> {
                com.google.common.base.Preconditions.checkNotNull(any());
            }).thenReturn(null, null, ((Object) connectionResetExceptionArray));
            SimpleTimeLimiter simpleTimeLimiter = ((SimpleTimeLimiter) createInstance("com.google.common.util.concurrent.SimpleTimeLimiter"));
            
            simpleTimeLimiter.newProxy(null, null, -9223372036854775807L, null);
        } finally {
            mockedStatic.close();
        }
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
    public void testNewProxy3() throws Throwable  {
        Class simpleTimeLimiterClazz = Class.forName("com.google.common.util.concurrent.SimpleTimeLimiter");
        Class classType = Class.forName("java.lang.Class");
        Class invocationHandlerType = Class.forName("java.lang.reflect.InvocationHandler");
        Method newProxyMethod = simpleTimeLimiterClazz.getDeclaredMethod("newProxy", classType, invocationHandlerType);
        newProxyMethod.setAccessible(true);
        java.lang.Object[] newProxyMethodArguments = new java.lang.Object[2];
        newProxyMethodArguments[0] = null;
        newProxyMethodArguments[1] = null;
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
    public void testThrowCause7() throws Throwable  {
        UndeclaredThrowableException undeclaredThrowableException = ((UndeclaredThrowableException) createInstance("java.lang.reflect.UndeclaredThrowableException"));
        setField(undeclaredThrowableException, "undeclaredThrowable", null);
        
        Class simpleTimeLimiterClazz = Class.forName("com.google.common.util.concurrent.SimpleTimeLimiter");
        Class undeclaredThrowableExceptionType = Class.forName("java.lang.Exception");
        Class booleanType = boolean.class;
        Method throwCauseMethod = simpleTimeLimiterClazz.getDeclaredMethod("throwCause", undeclaredThrowableExceptionType, booleanType);
        throwCauseMethod.setAccessible(true);
        java.lang.Object[] throwCauseMethodArguments = new java.lang.Object[2];
        throwCauseMethodArguments[0] = undeclaredThrowableException;
        throwCauseMethodArguments[1] = false;
        try {
            throwCauseMethod.invoke(null, throwCauseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testThrowCause8() throws Throwable  {
        ClassNotFoundException classNotFoundException = ((ClassNotFoundException) createInstance("java.lang.ClassNotFoundException"));
        setField(classNotFoundException, "ex", null);
        
        Class simpleTimeLimiterClazz = Class.forName("com.google.common.util.concurrent.SimpleTimeLimiter");
        Class classNotFoundExceptionType = Class.forName("java.lang.Exception");
        Class booleanType = boolean.class;
        Method throwCauseMethod = simpleTimeLimiterClazz.getDeclaredMethod("throwCause", classNotFoundExceptionType, booleanType);
        throwCauseMethod.setAccessible(true);
        java.lang.Object[] throwCauseMethodArguments = new java.lang.Object[2];
        throwCauseMethodArguments[0] = classNotFoundException;
        throwCauseMethodArguments[1] = false;
        try {
            throwCauseMethod.invoke(null, throwCauseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testThrowCause9() throws Throwable  {
        InvocationTargetException invocationTargetException = ((InvocationTargetException) createInstance("java.lang.reflect.InvocationTargetException"));
        setField(invocationTargetException, "target", null);
        
        Class simpleTimeLimiterClazz = Class.forName("com.google.common.util.concurrent.SimpleTimeLimiter");
        Class invocationTargetExceptionType = Class.forName("java.lang.Exception");
        Class booleanType = boolean.class;
        Method throwCauseMethod = simpleTimeLimiterClazz.getDeclaredMethod("throwCause", invocationTargetExceptionType, booleanType);
        throwCauseMethod.setAccessible(true);
        java.lang.Object[] throwCauseMethodArguments = new java.lang.Object[2];
        throwCauseMethodArguments[0] = invocationTargetException;
        throwCauseMethodArguments[1] = false;
        try {
            throwCauseMethod.invoke(null, throwCauseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException1) {
            throw invocationTargetException1.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testThrowCause10() throws Throwable  {
        SAXException sAXException = ((SAXException) createInstance("jdk.internal.org.xml.sax.SAXException"));
        setField(sAXException, "exception", null);
        
        Class simpleTimeLimiterClazz = Class.forName("com.google.common.util.concurrent.SimpleTimeLimiter");
        Class sAXExceptionType = Class.forName("java.lang.Exception");
        Class booleanType = boolean.class;
        Method throwCauseMethod = simpleTimeLimiterClazz.getDeclaredMethod("throwCause", sAXExceptionType, booleanType);
        throwCauseMethod.setAccessible(true);
        java.lang.Object[] throwCauseMethodArguments = new java.lang.Object[2];
        throwCauseMethodArguments[0] = sAXException;
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
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(com.google.common.collect.Sets.class);
            HashSet hashSet = new HashSet();
            mockedStatic.when(com.google.common.collect.Sets::newHashSet).thenReturn(hashSet);
            
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
            }} finally {
            mockedStatic.close();
        }
    }
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
    
    
    ///region Errors report for findInterruptibleMethods
    
    public void testFindInterruptibleMethods_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Field security is not found in class java.lang.System
        // 
    }
    ///endregion
    
    
    ///region Errors report for findInterruptibleMethods
    
    public void testFindInterruptibleMethods_errors2()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Field security is not found in class java.lang.System
        // 
    }
    ///endregion
    
    
    ///region Errors report for findInterruptibleMethods
    
    public void testFindInterruptibleMethods_errors3()
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
        Method method = ((Method) createInstance("java.lang.reflect.Method"));
        
        Class simpleTimeLimiterClazz = Class.forName("com.google.common.util.concurrent.SimpleTimeLimiter");
        Class methodType = Class.forName("java.lang.reflect.Method");
        Method declaresInterruptedExMethod = simpleTimeLimiterClazz.getDeclaredMethod("declaresInterruptedEx", methodType);
        declaresInterruptedExMethod.setAccessible(true);
        java.lang.Object[] declaresInterruptedExMethodArguments = new java.lang.Object[1];
        declaresInterruptedExMethodArguments[0] = method;
        try {
            declaresInterruptedExMethod.invoke(null, declaresInterruptedExMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDeclaresInterruptedEx2() throws Throwable  {
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
    public void testDeclaresInterruptedEx3() throws Throwable  {
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
    public void testDeclaresInterruptedEx4() throws Throwable  {
        Method method = ((Method) createInstance("java.lang.reflect.Method"));
        java.lang.Class[] classArray = new java.lang.Class[1];
        Class class1 = Object.class;
        classArray[0] = class1;
        setField(method, "exceptionTypes", classArray);
        
        Object methodExceptionTypes = getFieldValue(method, "exceptionTypes");
        Object initialMethodExceptionTypes0 = get(methodExceptionTypes, 0);
        
        Class simpleTimeLimiterClazz = Class.forName("com.google.common.util.concurrent.SimpleTimeLimiter");
        Class methodType = Class.forName("java.lang.reflect.Method");
        Method declaresInterruptedExMethod = simpleTimeLimiterClazz.getDeclaredMethod("declaresInterruptedEx", methodType);
        declaresInterruptedExMethod.setAccessible(true);
        java.lang.Object[] declaresInterruptedExMethodArguments = new java.lang.Object[1];
        declaresInterruptedExMethodArguments[0] = method;
        boolean actual = ((boolean) declaresInterruptedExMethod.invoke(null, declaresInterruptedExMethodArguments));
        
        assertTrue(actual);
        
        Object methodExceptionTypes1 = getFieldValue(method, "exceptionTypes");
        Object finalMethodExceptionTypes0 = get(methodExceptionTypes1, 0);
        
        Class expectedFinalMethodExceptionTypes0 = InterruptedException.class;
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expectedFinalMethodExceptionTypes0, finalMethodExceptionTypes0));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDeclaresInterruptedEx5() throws Throwable  {
        Method method = ((Method) createInstance("java.lang.reflect.Method"));
        java.lang.Class[] classArray = new java.lang.Class[1];
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
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(com.google.common.base.Preconditions.class);
            
            Class simpleTimeLimiterClazz = Class.forName("com.google.common.util.concurrent.SimpleTimeLimiter");
            Class longType = long.class;
            Method checkPositiveTimeoutMethod = simpleTimeLimiterClazz.getDeclaredMethod("checkPositiveTimeout", longType);
            checkPositiveTimeoutMethod.setAccessible(true);
            java.lang.Object[] checkPositiveTimeoutMethodArguments = new java.lang.Object[1];
            checkPositiveTimeoutMethodArguments[0] = 1L;
            checkPositiveTimeoutMethod.invoke(null, checkPositiveTimeoutMethodArguments);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCheckPositiveTimeout3() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(com.google.common.base.Preconditions.class);
            
            Class simpleTimeLimiterClazz = Class.forName("com.google.common.util.concurrent.SimpleTimeLimiter");
            Class longType = long.class;
            Method checkPositiveTimeoutMethod = simpleTimeLimiterClazz.getDeclaredMethod("checkPositiveTimeout", longType);
            checkPositiveTimeoutMethod.setAccessible(true);
            java.lang.Object[] checkPositiveTimeoutMethodArguments = new java.lang.Object[1];
            checkPositiveTimeoutMethodArguments[0] = 0L;
            checkPositiveTimeoutMethod.invoke(null, checkPositiveTimeoutMethodArguments);
        } finally {
            mockedStatic.close();
        }
    }
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
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(com.google.common.base.Preconditions.class);
            Object delegatedExecutorService = createInstance("java.util.concurrent.Executors$DelegatedExecutorService");
            mockedStatic.when(() -> {
                com.google.common.base.Preconditions.checkNotNull(any());
            }).thenReturn(delegatedExecutorService);
            
            SimpleTimeLimiter actual = SimpleTimeLimiter.create(null);
            
            SimpleTimeLimiter expected = ((SimpleTimeLimiter) createInstance("com.google.common.util.concurrent.SimpleTimeLimiter"));
            setField(expected, "executor", delegatedExecutorService);
            
            // Current deep equals depth exceeds max depth 0
            assertTrue(deepEquals(expected, actual));
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreate3() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(com.google.common.base.Preconditions.class);
            java.util.concurrent.ThreadPoolExecutor.CallerRunsPolicy[] callerRunsPolicyArray = new java.util.concurrent.ThreadPoolExecutor.CallerRunsPolicy[0];
            mockedStatic.when(() -> {
                com.google.common.base.Preconditions.checkNotNull(any());
            }).thenReturn(((Object) callerRunsPolicyArray));
            Object finalizableDelegatedExecutorService = createInstance("java.util.concurrent.Executors$FinalizableDelegatedExecutorService");
            
            Class simpleTimeLimiterClazz = Class.forName("com.google.common.util.concurrent.SimpleTimeLimiter");
            Class finalizableDelegatedExecutorServiceType = Class.forName("java.util.concurrent.ExecutorService");
            Method createMethod = simpleTimeLimiterClazz.getDeclaredMethod("create", finalizableDelegatedExecutorServiceType);
            createMethod.setAccessible(true);
            java.lang.Object[] createMethodArguments = new java.lang.Object[1];
            createMethodArguments[0] = finalizableDelegatedExecutorService;
            try {
                createMethod.invoke(null, createMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }} finally {
            mockedStatic.close();
        }
    }
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
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(com.google.common.base.Preconditions.class);
            java.util.concurrent.ThreadPoolExecutor.CallerRunsPolicy[] callerRunsPolicyArray = new java.util.concurrent.ThreadPoolExecutor.CallerRunsPolicy[0];
            mockedStatic.when(() -> {
                com.google.common.base.Preconditions.checkNotNull(any());
            }).thenReturn(((Object) callerRunsPolicyArray));
            Class simpleTimeLimiterClazz = Class.forName("com.google.common.util.concurrent.SimpleTimeLimiter");
            Class executorServiceType = Class.forName("java.util.concurrent.ExecutorService");
            Constructor simpleTimeLimiterConstructor = simpleTimeLimiterClazz.getDeclaredConstructor(executorServiceType);
            simpleTimeLimiterConstructor.setAccessible(true);
            java.lang.Object[] simpleTimeLimiterConstructorArguments = new java.lang.Object[1];
            simpleTimeLimiterConstructorArguments[0] = null;
            simpleTimeLimiterConstructor.newInstance(simpleTimeLimiterConstructorArguments);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSimpleTimeLimiter3() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(com.google.common.base.Preconditions.class);
            Object listeningDecorator = createInstance("com.google.common.util.concurrent.MoreExecutors$ListeningDecorator");
            mockedStatic.when(() -> {
                com.google.common.base.Preconditions.checkNotNull(any());
            }).thenReturn(listeningDecorator);
            Class simpleTimeLimiterClazz = Class.forName("com.google.common.util.concurrent.SimpleTimeLimiter");
            Class executorServiceType = Class.forName("java.util.concurrent.ExecutorService");
            Constructor simpleTimeLimiterConstructor = simpleTimeLimiterClazz.getDeclaredConstructor(executorServiceType);
            simpleTimeLimiterConstructor.setAccessible(true);
            java.lang.Object[] simpleTimeLimiterConstructorArguments = new java.lang.Object[1];
            simpleTimeLimiterConstructorArguments[0] = null;
            SimpleTimeLimiter actual = ((SimpleTimeLimiter) simpleTimeLimiterConstructor.newInstance(simpleTimeLimiterConstructorArguments));
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    private static Object[] createArray(String className, int length, Object... values) throws ClassNotFoundException {
        Object array = java.lang.reflect.Array.newInstance(Class.forName(className), length);
    
        for (int i = 0; i < values.length; i++) {
            java.lang.reflect.Array.set(array, i, values[i]);
        }
        
        return (Object[]) array;
    }
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
