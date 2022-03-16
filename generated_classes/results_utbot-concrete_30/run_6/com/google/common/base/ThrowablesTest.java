package com.google.common.base;

import org.junit.Test;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import javax.security.auth.callback.UnsupportedCallbackException;
import java.net.UnknownHostException;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.util.Objects;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.lang.reflect.Modifier;
import sun.misc.Unsafe;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNull;

public class ThrowablesTest {
    ///region
    
    @Test(timeout = 10000)
    public void testGetRootCause1() throws Throwable  {
        Throwable throwable = new Throwable();
        
        Throwable actual = Throwables.getRootCause(throwable);
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(throwable, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetRootCause2() throws Throwable  {
        Throwables.getRootCause(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetRootCause3() throws Throwable  {
        Throwable throwable = ((Throwable) createInstance("java.lang.Throwable"));
        setField(throwable, "cause", null);
        
        Throwable actual = Throwables.getRootCause(throwable);
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(throwable, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testPropagate1() throws Throwable  {
        Throwable throwable = new Throwable();
        
        Throwables.propagate(throwable);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testPropagate2() throws Throwable  {
        IOException iOException = ((IOException) createInstance("java.io.IOException"));
        
        Throwables.propagate(iOException);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testPropagate3() throws Throwable  {
        Throwables.propagate(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testPropagate4() throws Throwable  {
        AssertionError assertionError = ((AssertionError) createInstance("java.lang.AssertionError"));
        
        Throwables.propagate(assertionError);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testThrowIfUnchecked1() throws Throwable  {
        Throwable throwable = new Throwable();
        
        Throwables.throwIfUnchecked(throwable);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testThrowIfUnchecked2() throws Throwable  {
        Throwable throwable = ((Throwable) createInstance("java.lang.Throwable"));
        
        Throwables.throwIfUnchecked(throwable);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testThrowIfUnchecked3() throws Throwable  {
        AssertionError assertionError = ((AssertionError) createInstance("java.lang.AssertionError"));
        
        Throwables.throwIfUnchecked(assertionError);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testThrowIfUnchecked4() throws Throwable  {
        Throwables.throwIfUnchecked(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetCausalChain1() throws Throwable  {
        Throwable throwable = new Throwable();
        
        List actual = Throwables.getCausalChain(throwable);
        
        Object expected = createInstance("java.util.Collections$UnmodifiableRandomAccessList");
        ArrayList arrayList = new ArrayList();
        arrayList.add(throwable);
        setField(expected, "list", arrayList);
        setField(expected, "c", arrayList);
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetCausalChain2() throws Throwable  {
        Throwable throwable = ((Throwable) createInstance("java.lang.Throwable"));
        
        List actual = Throwables.getCausalChain(throwable);
        
        Object expected = createInstance("java.util.Collections$UnmodifiableRandomAccessList");
        ArrayList arrayList = new ArrayList();
        arrayList.add(throwable);
        setField(expected, "list", arrayList);
        setField(expected, "c", arrayList);
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testThrowIfInstanceOf1() throws Throwable  {
        Throwable throwable = ((Throwable) createInstance("java.lang.Throwable"));
        
        Throwables.throwIfInstanceOf(throwable, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testThrowIfInstanceOf2() throws Throwable  {
        Throwable throwable = ((Throwable) createInstance("java.lang.Throwable"));
        Class class1 = Object.class;
        
        Throwables.throwIfInstanceOf(throwable, class1);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testThrowIfInstanceOf3() throws Throwable  {
        Throwables.throwIfInstanceOf(null, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testPropagateIfInstanceOf1() throws Throwable  {
        Throwables.propagateIfInstanceOf(null, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testPropagateIfInstanceOf2() throws Throwable  {
        Throwable throwable = ((Throwable) createInstance("java.lang.Throwable"));
        Class class1 = Object.class;
        
        Throwables.propagateIfInstanceOf(throwable, class1);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testPropagateIfPossible1() throws Throwable  {
        Throwables.propagateIfPossible(null, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testPropagateIfPossible2() throws Throwable  {
        Throwable throwable = ((Throwable) createInstance("java.lang.Throwable"));
        Class class1 = Object.class;
        
        Throwables.propagateIfPossible(throwable, class1);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testPropagateIfPossible3() throws Throwable  {
        Throwable throwable = new Throwable();
        
        Throwables.propagateIfPossible(throwable);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testPropagateIfPossible4() throws Throwable  {
        Throwables.propagateIfPossible(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testPropagateIfPossible5() throws Throwable  {
        UnsupportedCallbackException unsupportedCallbackException = ((UnsupportedCallbackException) createInstance("javax.security.auth.callback.UnsupportedCallbackException"));
        
        Throwables.propagateIfPossible(unsupportedCallbackException);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testPropagateIfPossible6() throws Throwable  {
        AssertionError assertionError = ((AssertionError) createInstance("java.lang.AssertionError"));
        
        Throwables.propagateIfPossible(assertionError);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testPropagateIfPossible7() throws Throwable  {
        Throwables.propagateIfPossible(null, null, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testPropagateIfPossible8() throws Throwable  {
        Throwable throwable = ((Throwable) createInstance("java.lang.Throwable"));
        Class class1 = Object.class;
        
        Throwables.propagateIfPossible(throwable, class1, class1);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testPropagateIfPossible9() throws Throwable  {
        Class class1 = Object.class;
        
        Throwables.propagateIfPossible(null, null, class1);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetCauseAs1() throws Throwable  {
        Throwables.getCauseAs(null, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetCauseAs2() throws Throwable  {
        CloneNotSupportedException cloneNotSupportedException = ((CloneNotSupportedException) createInstance("java.lang.CloneNotSupportedException"));
        setField(cloneNotSupportedException, "cause", cloneNotSupportedException);
        
        Throwables.getCauseAs(cloneNotSupportedException, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetCauseAs3() throws Throwable  {
        UnknownHostException unknownHostException = ((UnknownHostException) createInstance("java.net.UnknownHostException"));
        setField(unknownHostException, "cause", unknownHostException);
        Class class1 = Object.class;
        
        Throwable actual = Throwables.getCauseAs(unknownHostException, class1);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetStackTraceAsString1() throws Throwable  {
        Throwable throwable = new Throwable();
        
        String actual = Throwables.getStackTraceAsString(throwable);
        
        String expected = new String("java.lang.Throwable\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat com.huawei.utbot.framework.concrete.MockValueConstructor.call(MockValueConstructor.kt:414)\n\tat com.huawei.utbot.framework.concrete.MockValueConstructor.updateWithExecutableCallModel(MockValueConstructor.kt:353)\n\tat com.huawei.utbot.framework.concrete.MockValueConstructor.constructFromAssembleModel(MockValueConstructor.kt:332)\n\tat com.huawei.utbot.framework.concrete.MockValueConstructor.construct(MockValueConstructor.kt:126)\n\tat com.huawei.utbot.framework.concrete.MockValueConstructor.constructMethodParameters(MockValueConstructor.kt:101)\n\tat com.huawei.utbot.framework.concrete.UtExecutionInstrumentation.invoke(UtExecutionInstrumentation.kt:126)\n\tat com.huawei.utbot.framework.concrete.UtExecutionInstrumentation.invoke(UtExecutionInstrumentation.kt:96)\n\tat com.huawei.utbot.instrumentation.process.ChildProcessKt.loop(ChildProcess.kt:114)\n\tat com.huawei.utbot.instrumentation.process.ChildProcessKt.main(ChildProcess.kt:76)\n\tat com.huawei.utbot.instrumentation.process.ChildProcessKt.main(ChildProcess.kt)\n");
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetStackTraceAsString2() throws Throwable  {
        Throwables.getStackTraceAsString(null);
    }
    ///endregion
    
    
    ///region Errors report for lazyStackTrace
    
    public void testLazyStackTrace_errors()
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
    public void testLazyStackTraceIsLazy1() throws Throwable  {
        boolean actual = Throwables.lazyStackTraceIsLazy();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testJlaStackTrace1() throws Throwable  {
        Class throwablesClazz = Class.forName("com.google.common.base.Throwables");
        Class throwableType = Class.forName("java.lang.Throwable");
        Method jlaStackTraceMethod = throwablesClazz.getDeclaredMethod("jlaStackTrace", throwableType);
        jlaStackTraceMethod.setAccessible(true);
        java.lang.Object[] jlaStackTraceMethodArguments = new java.lang.Object[1];
        jlaStackTraceMethodArguments[0] = null;
        try {
            jlaStackTraceMethod.invoke(null, jlaStackTraceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testInvokeAccessibleNonThrowingMethod1() throws Throwable  {
        java.lang.Object[] objectArray = new java.lang.Object[9];
        
        Class throwablesClazz = Class.forName("com.google.common.base.Throwables");
        Class methodType = Class.forName("java.lang.reflect.Method");
        Class objectType = Class.forName("java.lang.Object");
        Class objectArrayType = Class.forName("[Ljava.lang.Object;");
        Method invokeAccessibleNonThrowingMethodMethod = throwablesClazz.getDeclaredMethod("invokeAccessibleNonThrowingMethod", methodType, objectType, objectArrayType);
        invokeAccessibleNonThrowingMethodMethod.setAccessible(true);
        java.lang.Object[] invokeAccessibleNonThrowingMethodMethodArguments = new java.lang.Object[3];
        invokeAccessibleNonThrowingMethodMethodArguments[0] = null;
        invokeAccessibleNonThrowingMethodMethodArguments[1] = null;
        invokeAccessibleNonThrowingMethodMethodArguments[2] = ((Object) objectArray);
        try {
            invokeAccessibleNonThrowingMethodMethod.invoke(null, invokeAccessibleNonThrowingMethodMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetGetMethod1() throws Throwable  {
        Class throwablesClazz = Class.forName("com.google.common.base.Throwables");
        Method getGetMethodMethod = throwablesClazz.getDeclaredMethod("getGetMethod");
        getGetMethodMethod.setAccessible(true);
        java.lang.Object[] getGetMethodMethodArguments = new java.lang.Object[0];
        Method actual = ((Method) getGetMethodMethod.invoke(null, getGetMethodMethodArguments));
        
        Method expected = ((Method) createInstance("java.lang.reflect.Method"));
        Class class1 = sun.misc.JavaLangAccess.class;
        setField(expected, "clazz", class1);
        setField(expected, "slot", 6);
        String string = new String("getStackTraceElement");
        setField(expected, "name", string);
        Class class2 = StackTraceElement.class;
        setField(expected, "returnType", class2);
        java.lang.Class[] classArray = new java.lang.Class[2];
        Class class3 = Throwable.class;
        classArray[0] = class3;
        Class class4 = int.class;
        classArray[1] = class4;
        setField(expected, "parameterTypes", classArray);
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        setField(expected, "exceptionTypes", classArray1);
        setField(expected, "modifiers", 1025);
        setField(expected, "signature", null);
        setField(expected, "genericInfo", null);
        setField(expected, "annotations", null);
        setField(expected, "parameterAnnotations", null);
        setField(expected, "annotationDefault", null);
        setField(expected, "methodAccessor", null);
        Method method = ((Method) createInstance("java.lang.reflect.Method"));
        setField(method, "clazz", class1);
        setField(method, "slot", 6);
        setField(method, "name", string);
        setField(method, "returnType", class2);
        setField(method, "parameterTypes", classArray);
        setField(method, "exceptionTypes", classArray1);
        setField(method, "modifiers", 1025);
        setField(method, "signature", null);
        setField(method, "genericInfo", null);
        setField(method, "annotations", null);
        setField(method, "parameterAnnotations", null);
        setField(method, "annotationDefault", null);
        setField(method, "methodAccessor", null);
        setField(method, "root", null);
        setField(method, "hasRealParameterData", false);
        setField(method, "parameters", null);
        setField(method, "declaredAnnotations", null);
        setField(method, "override", false);
        setField(method, "securityCheckCache", null);
        setField(expected, "root", method);
        setField(expected, "hasRealParameterData", false);
        setField(expected, "parameters", null);
        setField(expected, "declaredAnnotations", null);
        setField(expected, "override", false);
        setField(expected, "securityCheckCache", null);
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetSizeMethod1() throws Throwable  {
        Class throwablesClazz = Class.forName("com.google.common.base.Throwables");
        Method getSizeMethodMethod = throwablesClazz.getDeclaredMethod("getSizeMethod");
        getSizeMethodMethod.setAccessible(true);
        java.lang.Object[] getSizeMethodMethodArguments = new java.lang.Object[0];
        Method actual = ((Method) getSizeMethodMethod.invoke(null, getSizeMethodMethodArguments));
        
        Method expected = ((Method) createInstance("java.lang.reflect.Method"));
        Class class1 = sun.misc.JavaLangAccess.class;
        setField(expected, "clazz", class1);
        setField(expected, "slot", 5);
        String string = new String("getStackTraceDepth");
        setField(expected, "name", string);
        Class class2 = int.class;
        setField(expected, "returnType", class2);
        java.lang.Class[] classArray = new java.lang.Class[1];
        Class class3 = Throwable.class;
        classArray[0] = class3;
        setField(expected, "parameterTypes", classArray);
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        setField(expected, "exceptionTypes", classArray1);
        setField(expected, "modifiers", 1025);
        setField(expected, "signature", null);
        setField(expected, "genericInfo", null);
        setField(expected, "annotations", null);
        setField(expected, "parameterAnnotations", null);
        setField(expected, "annotationDefault", null);
        Object delegatingMethodAccessorImpl = createInstance("sun.reflect.DelegatingMethodAccessorImpl");
        Object nativeMethodAccessorImpl = createInstance("sun.reflect.NativeMethodAccessorImpl");
        Method method = ((Method) createInstance("java.lang.reflect.Method"));
        setField(method, "clazz", class1);
        setField(method, "slot", 5);
        setField(method, "name", string);
        setField(method, "returnType", class2);
        setField(method, "parameterTypes", classArray);
        setField(method, "exceptionTypes", classArray1);
        setField(method, "modifiers", 1025);
        setField(method, "signature", null);
        setField(method, "genericInfo", null);
        setField(method, "annotations", null);
        setField(method, "parameterAnnotations", null);
        setField(method, "annotationDefault", null);
        setField(method, "methodAccessor", delegatingMethodAccessorImpl);
        Method method1 = ((Method) createInstance("java.lang.reflect.Method"));
        setField(method1, "clazz", class1);
        setField(method1, "slot", 5);
        setField(method1, "name", string);
        setField(method1, "returnType", class2);
        setField(method1, "parameterTypes", classArray);
        setField(method1, "exceptionTypes", classArray1);
        setField(method1, "modifiers", 1025);
        setField(method1, "signature", null);
        setField(method1, "genericInfo", null);
        setField(method1, "annotations", null);
        setField(method1, "parameterAnnotations", null);
        setField(method1, "annotationDefault", null);
        setField(method1, "methodAccessor", delegatingMethodAccessorImpl);
        setField(method1, "root", null);
        setField(method1, "hasRealParameterData", false);
        setField(method1, "parameters", null);
        setField(method1, "declaredAnnotations", null);
        setField(method1, "override", false);
        setField(method1, "securityCheckCache", null);
        setField(method, "root", method1);
        setField(method, "hasRealParameterData", false);
        setField(method, "parameters", null);
        setField(method, "declaredAnnotations", null);
        setField(method, "override", false);
        setField(method, "securityCheckCache", null);
        setField(nativeMethodAccessorImpl, "method", method);
        setField(nativeMethodAccessorImpl, "parent", delegatingMethodAccessorImpl);
        setField(nativeMethodAccessorImpl, "numInvocations", 2);
        setField(delegatingMethodAccessorImpl, "delegate", nativeMethodAccessorImpl);
        setField(expected, "methodAccessor", delegatingMethodAccessorImpl);
        setField(expected, "root", method1);
        setField(expected, "hasRealParameterData", false);
        setField(expected, "parameters", null);
        setField(expected, "declaredAnnotations", null);
        setField(expected, "override", false);
        setField(expected, "securityCheckCache", null);
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    
    ///region Errors report for getSizeMethod
    
    public void testGetSizeMethod_errors()
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
    public void testGetJlaMethod1() throws Throwable  {
        String string = new String();
        java.lang.Class[] classArray = new java.lang.Class[0];
        
        Class throwablesClazz = Class.forName("com.google.common.base.Throwables");
        Class stringType = Class.forName("java.lang.String");
        Class classArrayType = Class.forName("[Ljava.lang.Class;");
        Method getJlaMethodMethod = throwablesClazz.getDeclaredMethod("getJlaMethod", stringType, classArrayType);
        getJlaMethodMethod.setAccessible(true);
        java.lang.Object[] getJlaMethodMethodArguments = new java.lang.Object[2];
        getJlaMethodMethodArguments[0] = string;
        getJlaMethodMethodArguments[1] = ((Object) classArray);
        Method actual = ((Method) getJlaMethodMethod.invoke(null, getJlaMethodMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testThrowables1() throws Throwable  {
        Class throwablesClazz = Class.forName("com.google.common.base.Throwables");
        Constructor throwablesConstructor = throwablesClazz.getDeclaredConstructor();
        throwablesConstructor.setAccessible(true);
        java.lang.Object[] throwablesConstructorArguments = new java.lang.Object[0];
        Throwables actual = ((Throwables) throwablesConstructor.newInstance(throwablesConstructorArguments));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testThrowables2() throws Throwable  {
        Class throwablesClazz = Class.forName("com.google.common.base.Throwables");
        Constructor throwablesConstructor = throwablesClazz.getDeclaredConstructor();
        throwablesConstructor.setAccessible(true);
        java.lang.Object[] throwablesConstructorArguments = new java.lang.Object[0];
        Throwables actual = ((Throwables) throwablesConstructor.newInstance(throwablesConstructorArguments));
    }
    ///endregion
    
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
    private static sun.misc.Unsafe getUnsafeInstance() throws Exception {
        java.lang.reflect.Field f = sun.misc.Unsafe.class.getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return (sun.misc.Unsafe) f.get(null);
    }
}
