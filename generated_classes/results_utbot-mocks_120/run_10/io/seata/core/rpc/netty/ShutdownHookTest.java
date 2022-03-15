package io.seata.core.rpc.netty;

import org.junit.Test;
import java.util.LinkedHashSet;
import io.seata.core.rpc.Disposable;
import java.util.TreeSet;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.security.AccessControlContext;
import sun.misc.URLClassPath;
import java.util.ArrayList;
import java.net.URL;
import sun.net.www.protocol.file.Handler;
import java.util.Hashtable;
import java.util.Stack;
import java.util.jar.JarFile;
import java.lang.ref.SoftReference;
import java.util.jar.Manifest;
import java.util.jar.Attributes;
import java.util.HashMap;
import java.util.jar.Attributes.Name;
import sun.nio.cs.StandardCharsets;
import sun.nio.cs.US_ASCII;
import java.util.concurrent.atomic.AtomicInteger;
import java.nio.charset.CodingErrorAction;
import java.util.WeakHashMap;
import java.util.zip.Inflater;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayDeque;
import sun.misc.JarIndex;
import java.util.LinkedList;
import sun.net.www.protocol.jar.URLJarFile;
import java.security.CodeSource;
import java.security.ProtectionDomain;
import java.security.Principal;
import java.security.Permissions;
import java.io.FilePermission;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Vector;
import java.security.cert.Certificate;
import com.huawei.utbot.framework.plugin.api.util.UtContext;
import com.huawei.utbot.instrumentation.process.HandlerClassesLoader;
import java.io.File;
import sun.nio.cs.Surrogate.Parser;
import sun.nio.cs.Surrogate;
import java.nio.charset.CoderResult;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Array;
import sun.misc.Unsafe;

import static org.mockito.Mockito.mock;
import static org.junit.Assert.assertEquals;

public class ShutdownHookTest {
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testRun1() throws Throwable  {
        ShutdownHook shutdownHook = ((ShutdownHook) createInstance("io.seata.core.rpc.netty.ShutdownHook"));
        
        shutdownHook.run();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testRun2() throws Throwable  {
        ShutdownHook shutdownHook = ((ShutdownHook) createInstance("io.seata.core.rpc.netty.ShutdownHook"));
        
        shutdownHook.run();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDestroyAll1() throws Throwable  {
        ShutdownHook shutdownHook = ((ShutdownHook) createInstance("io.seata.core.rpc.netty.ShutdownHook"));
        
        shutdownHook.destroyAll();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDestroyAll2() throws Throwable  {
        ShutdownHook shutdownHook = ((ShutdownHook) createInstance("io.seata.core.rpc.netty.ShutdownHook"));
        
        shutdownHook.destroyAll();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testAddDisposable1() throws Throwable  {
        ShutdownHook shutdownHook = ((ShutdownHook) createInstance("io.seata.core.rpc.netty.ShutdownHook"));
        
        shutdownHook.addDisposable(null, 0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testAddDisposable2() throws Throwable  {
        ShutdownHook shutdownHook = ((ShutdownHook) createInstance("io.seata.core.rpc.netty.ShutdownHook"));
        setField(shutdownHook, "disposables", null);
        
        shutdownHook.addDisposable(null, 0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testAddDisposable3() throws Throwable  {
        ShutdownHook shutdownHook = ((ShutdownHook) createInstance("io.seata.core.rpc.netty.ShutdownHook"));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        setField(shutdownHook, "disposables", linkedHashSet);
        
        shutdownHook.addDisposable(null, 0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testAddDisposable4() throws Throwable  {
        ShutdownHook shutdownHook = ((ShutdownHook) createInstance("io.seata.core.rpc.netty.ShutdownHook"));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Integer integer = 0;
        linkedHashSet.add(integer);
        setField(shutdownHook, "disposables", linkedHashSet);
        
        shutdownHook.addDisposable(null, 0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testAddDisposable5() throws Throwable  {
        ShutdownHook shutdownHook = ((ShutdownHook) createInstance("io.seata.core.rpc.netty.ShutdownHook"));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Character character = '\u0000';
        linkedHashSet.add(character);
        setField(shutdownHook, "disposables", linkedHashSet);
        Disposable disposableMock = mock(Disposable.class);
        
        shutdownHook.addDisposable(disposableMock, 0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testAddDisposable6() throws Throwable  {
        ShutdownHook shutdownHook = ((ShutdownHook) createInstance("io.seata.core.rpc.netty.ShutdownHook"));
        
        shutdownHook.addDisposable(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testAddDisposable7() throws Throwable  {
        ShutdownHook shutdownHook = ((ShutdownHook) createInstance("io.seata.core.rpc.netty.ShutdownHook"));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        setField(shutdownHook, "disposables", linkedHashSet);
        Disposable disposableMock = mock(Disposable.class);
        
        shutdownHook.addDisposable(disposableMock);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testAddDisposable8() throws Throwable  {
        ShutdownHook shutdownHook = ((ShutdownHook) createInstance("io.seata.core.rpc.netty.ShutdownHook"));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Integer integer = 0;
        linkedHashSet.add(integer);
        setField(shutdownHook, "disposables", linkedHashSet);
        
        shutdownHook.addDisposable(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testAddDisposable9() throws Throwable  {
        ShutdownHook shutdownHook = ((ShutdownHook) createInstance("io.seata.core.rpc.netty.ShutdownHook"));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Character character = '\u0000';
        linkedHashSet.add(character);
        setField(shutdownHook, "disposables", linkedHashSet);
        
        shutdownHook.addDisposable(null);
    }
    ///endregion
    
    
    ///region Errors report for getInstance
    
    public void testGetInstance_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // ClassId java.nio.charset.CoderResult$1 does not have canonical name
        // 
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetInstance2() throws Throwable  {
        ShutdownHook.getInstance();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testRemoveRuntimeShutdownHook1() throws Throwable  {
        ShutdownHook.removeRuntimeShutdownHook();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testRemoveRuntimeShutdownHook2() throws Throwable  {
        Class runtimeClazz = Class.forName("java.lang.Runtime");
        Runtime prevCurrentRuntime = ((Runtime) getStaticFieldValue(runtimeClazz, "currentRuntime"));
        try {
            Runtime currentRuntime = ((Runtime) createInstance("java.lang.Runtime"));
            setStaticField(runtimeClazz, "currentRuntime", currentRuntime);
            
            ShutdownHook.removeRuntimeShutdownHook();
        } finally {
            setStaticField(Runtime.class, "currentRuntime", prevCurrentRuntime);
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testShutdownHook1() throws Throwable  {
        Class shutdownHookClazz = Class.forName("io.seata.core.rpc.netty.ShutdownHook");
        Class stringType = Class.forName("java.lang.String");
        Constructor shutdownHookConstructor = shutdownHookClazz.getDeclaredConstructor(stringType);
        shutdownHookConstructor.setAccessible(true);
        java.lang.Object[] shutdownHookConstructorArguments = new java.lang.Object[1];
        shutdownHookConstructorArguments[0] = null;
        shutdownHookConstructor.newInstance(shutdownHookConstructorArguments);
    }
    ///endregion
    
    
    ///region Errors report for <init>
    
    public void testShutdownHook_errors()
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
    public void testCompareTo1() throws Throwable  {
        Object disposablePriorityWrapper = createInstance("io.seata.core.rpc.netty.ShutdownHook$DisposablePriorityWrapper");
        Object disposablePriorityWrapper1 = createInstance("io.seata.core.rpc.netty.ShutdownHook$DisposablePriorityWrapper");
        
        Class disposablePriorityWrapperClazz = Class.forName("io.seata.core.rpc.netty.ShutdownHook$DisposablePriorityWrapper");
        Method compareToMethod = disposablePriorityWrapperClazz.getDeclaredMethod("compareTo", disposablePriorityWrapperClazz);
        compareToMethod.setAccessible(true);
        java.lang.Object[] compareToMethodArguments = new java.lang.Object[1];
        compareToMethodArguments[0] = disposablePriorityWrapper1;
        int actual = ((int) compareToMethod.invoke(disposablePriorityWrapper, compareToMethodArguments));
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCompareTo2() throws Throwable  {
        Object disposablePriorityWrapper = createInstance("io.seata.core.rpc.netty.ShutdownHook$DisposablePriorityWrapper");
        setField(disposablePriorityWrapper, "priority", 0);
        
        Class disposablePriorityWrapperClazz = Class.forName("io.seata.core.rpc.netty.ShutdownHook$DisposablePriorityWrapper");
        Method compareToMethod = disposablePriorityWrapperClazz.getDeclaredMethod("compareTo", disposablePriorityWrapperClazz);
        compareToMethod.setAccessible(true);
        java.lang.Object[] compareToMethodArguments = new java.lang.Object[1];
        compareToMethodArguments[0] = disposablePriorityWrapper;
        int actual = ((int) compareToMethod.invoke(disposablePriorityWrapper, compareToMethodArguments));
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCompareTo3() throws Throwable  {
        Object disposablePriorityWrapper = createInstance("io.seata.core.rpc.netty.ShutdownHook$DisposablePriorityWrapper");
        setField(disposablePriorityWrapper, "priority", 0);
        
        Class disposablePriorityWrapperClazz = Class.forName("io.seata.core.rpc.netty.ShutdownHook$DisposablePriorityWrapper");
        Method compareToMethod = disposablePriorityWrapperClazz.getDeclaredMethod("compareTo", disposablePriorityWrapperClazz);
        compareToMethod.setAccessible(true);
        java.lang.Object[] compareToMethodArguments = new java.lang.Object[1];
        compareToMethodArguments[0] = null;
        try {
            compareToMethod.invoke(disposablePriorityWrapper, compareToMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDestroy1() throws Throwable  {
        Object disposablePriorityWrapper = createInstance("io.seata.core.rpc.netty.ShutdownHook$DisposablePriorityWrapper");
        
        Class disposablePriorityWrapperClazz = Class.forName("io.seata.core.rpc.netty.ShutdownHook$DisposablePriorityWrapper");
        Method destroyMethod = disposablePriorityWrapperClazz.getDeclaredMethod("destroy");
        destroyMethod.setAccessible(true);
        java.lang.Object[] destroyMethodArguments = new java.lang.Object[0];
        try {
            destroyMethod.invoke(disposablePriorityWrapper, destroyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDestroy2() throws Throwable  {
        Object disposablePriorityWrapper = createInstance("io.seata.core.rpc.netty.ShutdownHook$DisposablePriorityWrapper");
        setField(disposablePriorityWrapper, "disposable", null);
        
        Class disposablePriorityWrapperClazz = Class.forName("io.seata.core.rpc.netty.ShutdownHook$DisposablePriorityWrapper");
        Method destroyMethod = disposablePriorityWrapperClazz.getDeclaredMethod("destroy");
        destroyMethod.setAccessible(true);
        java.lang.Object[] destroyMethodArguments = new java.lang.Object[0];
        try {
            destroyMethod.invoke(disposablePriorityWrapper, destroyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDestroy3() throws Throwable  {
        Object disposablePriorityWrapper = createInstance("io.seata.core.rpc.netty.ShutdownHook$DisposablePriorityWrapper");
        Disposable disposableMock = mock(Disposable.class);
        setField(disposablePriorityWrapper, "disposable", disposableMock);
        
        Class disposablePriorityWrapperClazz = Class.forName("io.seata.core.rpc.netty.ShutdownHook$DisposablePriorityWrapper");
        Method destroyMethod = disposablePriorityWrapperClazz.getDeclaredMethod("destroy");
        destroyMethod.setAccessible(true);
        java.lang.Object[] destroyMethodArguments = new java.lang.Object[0];
        destroyMethod.invoke(disposablePriorityWrapper, destroyMethodArguments);
    }
    ///endregion
    
    
    ///region Errors report for <init>
    
    public void testDisposablePriorityWrapper_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Inner class io.seata.core.rpc.netty.ShutdownHook$DisposablePriorityWrapper constructor testing is not supported yet
        // 
    }
    ///endregion
    
    
    ///region Errors report for <init>
    
    public void testDisposablePriorityWrapper_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Inner class io.seata.core.rpc.netty.ShutdownHook$DisposablePriorityWrapper constructor testing is not supported yet
        // 
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
    private static void setStaticField(Class<?> clazz, String fieldName, Object fieldValue) throws Exception {
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
        field.set(null, fieldValue);
    }
    private static sun.misc.Unsafe getUnsafeInstance() throws Exception {
        java.lang.reflect.Field f = sun.misc.Unsafe.class.getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return (sun.misc.Unsafe) f.get(null);
    }
}
