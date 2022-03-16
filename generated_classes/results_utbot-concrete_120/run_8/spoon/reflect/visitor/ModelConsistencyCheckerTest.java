package spoon.reflect.visitor;

import org.junit.Test;
import spoon.reflect.declaration.CtElement;
import java.util.ArrayDeque;
import spoon.support.reflect.declaration.CtModuleImpl;
import spoon.support.reflect.reference.CtWildcardStaticTypeMemberReferenceImpl;
import spoon.reflect.factory.FactoryImpl;
import spoon.reflect.CtModelImpl;
import spoon.reflect.factory.ModuleFactory.CtUnnamedModule;
import spoon.reflect.factory.ModuleFactory;
import java.lang.reflect.Method;
import spoon.support.StandardEnvironment;
import org.apache.log4j.spi.RootLogger;
import org.apache.log4j.Hierarchy;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.locks.ReentrantLock;
import java.util.Deque;
import org.eclipse.osgi.internal.container.EquinoxReentrantLock;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import sun.misc.Unsafe;

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
        
        modelConsistencyChecker.enter(((CtElement) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testEnter3() throws Throwable  {
        ModelConsistencyChecker modelConsistencyChecker = ((ModelConsistencyChecker) createInstance("spoon.reflect.visitor.ModelConsistencyChecker"));
        ArrayDeque arrayDeque = ((ArrayDeque) createInstance("java.util.ArrayDeque"));
        setField(arrayDeque, "tail", 134217728);
        setField(arrayDeque, "head", 0);
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
        CtModuleImpl ctModuleImpl = ((CtModuleImpl) createInstance("spoon.support.reflect.declaration.CtModuleImpl"));
        CtWildcardStaticTypeMemberReferenceImpl ctWildcardStaticTypeMemberReferenceImpl = ((CtWildcardStaticTypeMemberReferenceImpl) createInstance("spoon.support.reflect.reference.CtWildcardStaticTypeMemberReferenceImpl"));
        setField(ctWildcardStaticTypeMemberReferenceImpl, "parent", null);
        setField(ctWildcardStaticTypeMemberReferenceImpl, "factory", null);
        setField(ctModuleImpl, "parent", ctWildcardStaticTypeMemberReferenceImpl);
        FactoryImpl factoryImpl = ((FactoryImpl) createInstance("spoon.reflect.factory.FactoryImpl"));
        CtModelImpl ctModelImpl = ((CtModelImpl) createInstance("spoon.reflect.CtModelImpl"));
        ModuleFactory.CtUnnamedModule ctUnnamedModule = ((ModuleFactory.CtUnnamedModule) createInstance("spoon.reflect.factory.ModuleFactory$CtUnnamedModule"));
        setField(ctUnnamedModule, "parent", null);
        setField(ctUnnamedModule, "factory", null);
        setField(ctModelImpl, "unnamedModule", ctUnnamedModule);
        setField(factoryImpl, "model", ctModelImpl);
        setField(ctModuleImpl, "factory", factoryImpl);
        
        modelConsistencyChecker.enter(ctModuleImpl);
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
        StandardEnvironment standardEnvironment = ((StandardEnvironment) createInstance("spoon.support.StandardEnvironment"));
        RootLogger rootLogger = ((RootLogger) createInstance("org.apache.log4j.spi.RootLogger"));
        Hierarchy hierarchy = ((Hierarchy) createInstance("org.apache.log4j.Hierarchy"));
        setField(hierarchy, "thresholdInt", 10001);
        setField(rootLogger, "repository", hierarchy);
        setField(standardEnvironment, "logger", rootLogger);
        setField(modelConsistencyChecker, "environment", standardEnvironment);
        
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
        setField(fairSync, "state", 1073741824);
        setField(reentrantLock, "sync", fairSync);
        setField(linkedBlockingDeque, "lock", reentrantLock);
        Object node = createInstance("java.util.concurrent.LinkedBlockingDeque$Node");
        setField(node, "item", null);
        setField(linkedBlockingDeque, "first", node);
        setField(modelConsistencyChecker, "stack", linkedBlockingDeque);
        StandardEnvironment standardEnvironment = ((StandardEnvironment) createInstance("spoon.support.StandardEnvironment"));
        RootLogger rootLogger = ((RootLogger) createInstance("org.apache.log4j.spi.RootLogger"));
        Hierarchy hierarchy = ((Hierarchy) createInstance("org.apache.log4j.Hierarchy"));
        setField(hierarchy, "thresholdInt", 10257);
        setField(rootLogger, "repository", hierarchy);
        setField(standardEnvironment, "logger", rootLogger);
        setField(modelConsistencyChecker, "environment", standardEnvironment);
        
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
        
        assertEquals(1073741825, finalModelConsistencyCheckerStackLockSyncState);
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
        StandardEnvironment standardEnvironment = ((StandardEnvironment) createInstance("spoon.support.StandardEnvironment"));
        RootLogger rootLogger = ((RootLogger) createInstance("org.apache.log4j.spi.RootLogger"));
        Hierarchy hierarchy = ((Hierarchy) createInstance("org.apache.log4j.Hierarchy"));
        setField(hierarchy, "thresholdInt", 10001);
        setField(rootLogger, "repository", hierarchy);
        setField(standardEnvironment, "logger", rootLogger);
        setField(modelConsistencyChecker, "environment", standardEnvironment);
        
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
    
    
    ///region Errors report for dumpStack
    
    public void testDumpStack_errors()
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
    public void testModelConsistencyChecker1() {
        ModelConsistencyChecker actual = new ModelConsistencyChecker(null, false, false);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testModelConsistencyChecker2() {
        ModelConsistencyChecker actual = new ModelConsistencyChecker(null, false, false);
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
