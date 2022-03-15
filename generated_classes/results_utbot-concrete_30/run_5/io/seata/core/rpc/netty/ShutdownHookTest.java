package io.seata.core.rpc.netty;

import org.junit.Test;
import java.util.LinkedHashSet;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import io.netty.util.concurrent.GlobalEventExecutor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import sun.misc.Unsafe;

import static org.junit.Assert.assertNull;
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
    public void testDestroyAll1() throws Throwable  {
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
        
        Object initialShutdownHookDisposables = getFieldValue(shutdownHook, "disposables");
        
        shutdownHook.addDisposable(null, 0);
        
        Object finalShutdownHookDisposables = getFieldValue(shutdownHook, "disposables");
        
        assertNull(finalShutdownHookDisposables);
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
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testAddDisposable4() throws Throwable  {
        ShutdownHook shutdownHook = ((ShutdownHook) createInstance("io.seata.core.rpc.netty.ShutdownHook"));
        
        shutdownHook.addDisposable(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testAddDisposable5() throws Throwable  {
        ShutdownHook shutdownHook = ((ShutdownHook) createInstance("io.seata.core.rpc.netty.ShutdownHook"));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Integer integer = 1;
        linkedHashSet.add(integer);
        Integer integer1 = 0;
        linkedHashSet.add(integer1);
        setField(shutdownHook, "disposables", linkedHashSet);
        
        shutdownHook.addDisposable(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testRemoveRuntimeShutdownHook1() throws Throwable  {
        ShutdownHook.removeRuntimeShutdownHook();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
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
    public void testGetInstance1() throws Throwable  {
        ShutdownHook.getInstance();
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
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDestroy3() throws Throwable  {
        Object disposablePriorityWrapper = createInstance("io.seata.core.rpc.netty.ShutdownHook$DisposablePriorityWrapper");
        RpcServer rpcServer = ((RpcServer) createInstance("io.seata.core.rpc.netty.RpcServer"));
        GlobalEventExecutor globalEventExecutor = ((GlobalEventExecutor) createInstance("io.netty.util.concurrent.GlobalEventExecutor"));
        setField(rpcServer, "timerExecutor", globalEventExecutor);
        setField(disposablePriorityWrapper, "disposable", rpcServer);
        
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
