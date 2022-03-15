package spoon.reflect.visitor;

import org.junit.Test;
import java.lang.reflect.Method;
import java.util.LinkedList;
import java.util.Deque;
import spoon.reflect.declaration.CtElement;
import java.util.ArrayDeque;
import spoon.support.reflect.declaration.CtModuleImpl;
import spoon.support.reflect.reference.CtWildcardStaticTypeMemberReferenceImpl;
import spoon.reflect.factory.FactoryImpl;
import spoon.reflect.CtModelImpl;
import spoon.reflect.factory.ModuleFactory.CtUnnamedModule;
import spoon.reflect.factory.ModuleFactory;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import sun.misc.Unsafe;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;

public class ModelConsistencyCheckerTest {
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
