package spoon.reflect.visitor;

import org.junit.Test;
import spoon.reflect.declaration.CtElement;
import java.util.ArrayDeque;
import spoon.support.reflect.declaration.CtModuleImpl;
import spoon.support.reflect.declaration.CtAnnotationTypeImpl;
import spoon.reflect.factory.FactoryImpl;
import spoon.support.reflect.reference.CtFieldReferenceImpl;
import spoon.support.reflect.code.CtCommentImpl;
import spoon.support.reflect.code.CtLambdaImpl;
import java.lang.reflect.Method;
import java.util.LinkedList;
import java.util.Deque;
import spoon.support.StandardEnvironment;
import org.apache.log4j.spi.RootLogger;
import org.apache.log4j.Hierarchy;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import sun.misc.Unsafe;

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
        setField(modelConsistencyChecker, "stack", arrayDeque);
        CtModuleImpl ctModuleImpl = ((CtModuleImpl) createInstance("spoon.support.reflect.declaration.CtModuleImpl"));
        CtAnnotationTypeImpl ctAnnotationTypeImpl = ((CtAnnotationTypeImpl) createInstance("spoon.support.reflect.declaration.CtAnnotationTypeImpl"));
        setField(ctAnnotationTypeImpl, "parent", null);
        setField(ctAnnotationTypeImpl, "factory", null);
        setField(ctModuleImpl, "parent", ctAnnotationTypeImpl);
        FactoryImpl factoryImpl = ((FactoryImpl) createInstance("spoon.reflect.factory.FactoryImpl"));
        setField(ctModuleImpl, "factory", factoryImpl);
        
        modelConsistencyChecker.enter(ctModuleImpl);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testEnter5() throws Throwable  {
        ModelConsistencyChecker modelConsistencyChecker = ((ModelConsistencyChecker) createInstance("spoon.reflect.visitor.ModelConsistencyChecker"));
        ArrayDeque arrayDeque = ((ArrayDeque) createInstance("java.util.ArrayDeque"));
        setField(arrayDeque, "tail", 0);
        setField(arrayDeque, "head", 1);
        setField(modelConsistencyChecker, "stack", arrayDeque);
        CtFieldReferenceImpl ctFieldReferenceImpl = ((CtFieldReferenceImpl) createInstance("spoon.support.reflect.reference.CtFieldReferenceImpl"));
        setField(ctFieldReferenceImpl, "parent", null);
        
        modelConsistencyChecker.enter(ctFieldReferenceImpl);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testEnter6() throws Throwable  {
        ModelConsistencyChecker modelConsistencyChecker = ((ModelConsistencyChecker) createInstance("spoon.reflect.visitor.ModelConsistencyChecker"));
        ArrayDeque arrayDeque = ((ArrayDeque) createInstance("java.util.ArrayDeque"));
        setField(arrayDeque, "tail", 0);
        setField(arrayDeque, "head", 0);
        setField(modelConsistencyChecker, "stack", arrayDeque);
        
        modelConsistencyChecker.enter(((CtElement) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testEnter7() throws Throwable  {
        ModelConsistencyChecker modelConsistencyChecker = ((ModelConsistencyChecker) createInstance("spoon.reflect.visitor.ModelConsistencyChecker"));
        ArrayDeque arrayDeque = ((ArrayDeque) createInstance("java.util.ArrayDeque"));
        setField(arrayDeque, "tail", 0);
        setField(arrayDeque, "head", 1);
        setField(modelConsistencyChecker, "stack", arrayDeque);
        CtCommentImpl ctCommentImpl = ((CtCommentImpl) createInstance("spoon.support.reflect.code.CtCommentImpl"));
        CtLambdaImpl ctLambdaImpl = ((CtLambdaImpl) createInstance("spoon.support.reflect.code.CtLambdaImpl"));
        setField(ctLambdaImpl, "parent", null);
        setField(ctCommentImpl, "parent", ctLambdaImpl);
        
        modelConsistencyChecker.enter(ctCommentImpl);
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
    
    @Test(timeout = 10000)
    public void testExit3() throws Throwable  {
        ModelConsistencyChecker modelConsistencyChecker = ((ModelConsistencyChecker) createInstance("spoon.reflect.visitor.ModelConsistencyChecker"));
        LinkedList linkedList = ((LinkedList) createInstance("java.util.LinkedList"));
        setField(linkedList, "modCount", 0);
        setField(linkedList, "last", null);
        Object node = createInstance("java.util.LinkedList$Node");
        setField(node, "next", null);
        setField(node, "item", null);
        setField(linkedList, "first", node);
        setField(linkedList, "size", 0);
        setField(modelConsistencyChecker, "stack", linkedList);
        
        Deque deque = modelConsistencyChecker.stack;
        Object initialModelConsistencyCheckerStackFirst = getFieldValue(deque, "first");
        
        Class modelConsistencyCheckerClazz = Class.forName("spoon.reflect.visitor.ModelConsistencyChecker");
        Class ctElementType = Class.forName("spoon.reflect.declaration.CtElement");
        Method exitMethod = modelConsistencyCheckerClazz.getDeclaredMethod("exit", ctElementType);
        exitMethod.setAccessible(true);
        java.lang.Object[] exitMethodArguments = new java.lang.Object[1];
        exitMethodArguments[0] = null;
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
