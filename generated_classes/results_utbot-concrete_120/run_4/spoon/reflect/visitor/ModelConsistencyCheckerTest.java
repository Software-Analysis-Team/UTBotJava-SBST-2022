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
import spoon.support.reflect.declaration.CtEnumImpl;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Array;
import sun.misc.Unsafe;

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
    public void testEnter5() throws Throwable  {
        ModelConsistencyChecker modelConsistencyChecker = ((ModelConsistencyChecker) createInstance("spoon.reflect.visitor.ModelConsistencyChecker"));
        ArrayDeque arrayDeque = ((ArrayDeque) createInstance("java.util.ArrayDeque"));
        setField(arrayDeque, "tail", 536870912);
        setField(arrayDeque, "head", 0);
        java.lang.Object[] objectArray = new java.lang.Object[12];
        java.lang.Object[] byteBufferAsDoubleBufferRLArray = createArray("[Ljava.nio.ByteBufferAsDoubleBufferRL;", 0);
        objectArray[0] = byteBufferAsDoubleBufferRLArray;
        setField(arrayDeque, "elements", objectArray);
        setField(modelConsistencyChecker, "stack", arrayDeque);
        modelConsistencyChecker.fixNullParents = true;
        CtEnumImpl ctEnumImpl = ((CtEnumImpl) createInstance("spoon.support.reflect.declaration.CtEnumImpl"));
        setField(ctEnumImpl, "parent", null);
        
        modelConsistencyChecker.enter(ctEnumImpl);
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
