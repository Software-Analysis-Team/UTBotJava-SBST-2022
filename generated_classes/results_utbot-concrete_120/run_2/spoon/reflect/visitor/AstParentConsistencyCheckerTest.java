package spoon.reflect.visitor;

import org.junit.Test;
import spoon.reflect.declaration.CtElement;
import spoon.support.reflect.code.CtSynchronizedImpl;
import spoon.support.reflect.declaration.CtModuleImpl;
import spoon.support.reflect.declaration.CtEnumImpl;
import spoon.reflect.factory.FactoryImpl;
import spoon.reflect.CtModelImpl;
import spoon.support.reflect.declaration.CtEnumValueImpl;
import spoon.support.reflect.declaration.CtParameterImpl;
import spoon.support.reflect.declaration.CtMethodImpl;
import spoon.support.reflect.declaration.CtInterfaceImpl;
import spoon.reflect.factory.ModuleFactory.CtUnnamedModule;
import spoon.reflect.factory.ModuleFactory;
import java.lang.reflect.Method;
import spoon.support.reflect.declaration.InvisibleArrayConstructorImpl;
import spoon.support.reflect.reference.CtArrayTypeReferenceImpl;
import spoon.support.StandardEnvironment;
import spoon.support.reflect.declaration.CtPackageImpl;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import sun.misc.Unsafe;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class AstParentConsistencyCheckerTest {
    ///region
    
    @Test(timeout = 10000)
    public void testScan1() throws Throwable  {
        AstParentConsistencyChecker astParentConsistencyChecker = new AstParentConsistencyChecker();
        
        astParentConsistencyChecker.scan(((CtElement) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testScan2() throws Throwable  {
        AstParentConsistencyChecker astParentConsistencyChecker = ((AstParentConsistencyChecker) createInstance("spoon.reflect.visitor.AstParentConsistencyChecker"));
        
        astParentConsistencyChecker.scan(((CtElement) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testScan3() throws Throwable  {
        AstParentConsistencyChecker astParentConsistencyChecker = ((AstParentConsistencyChecker) createInstance("spoon.reflect.visitor.AstParentConsistencyChecker"));
        CtSynchronizedImpl ctSynchronizedImpl = ((CtSynchronizedImpl) createInstance("spoon.support.reflect.code.CtSynchronizedImpl"));
        setField(ctSynchronizedImpl, "parent", null);
        setField(ctSynchronizedImpl, "factory", null);
        setField(astParentConsistencyChecker, "parent", ctSynchronizedImpl);
        CtModuleImpl ctModuleImpl = ((CtModuleImpl) createInstance("spoon.support.reflect.declaration.CtModuleImpl"));
        CtEnumImpl ctEnumImpl = ((CtEnumImpl) createInstance("spoon.support.reflect.declaration.CtEnumImpl"));
        setField(ctEnumImpl, "parent", null);
        setField(ctEnumImpl, "factory", null);
        setField(ctModuleImpl, "parent", ctEnumImpl);
        FactoryImpl factoryImpl = ((FactoryImpl) createInstance("spoon.reflect.factory.FactoryImpl"));
        CtModelImpl ctModelImpl = ((CtModelImpl) createInstance("spoon.reflect.CtModelImpl"));
        CtModuleImpl ctModuleImpl1 = ((CtModuleImpl) createInstance("spoon.support.reflect.declaration.CtModuleImpl"));
        setField(ctModuleImpl1, "parent", null);
        setField(ctModuleImpl1, "factory", null);
        setField(ctModelImpl, "unnamedModule", ctModuleImpl1);
        setField(factoryImpl, "model", ctModelImpl);
        setField(ctModuleImpl, "factory", factoryImpl);
        
        astParentConsistencyChecker.scan(ctModuleImpl);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testScan4() throws Throwable  {
        AstParentConsistencyChecker astParentConsistencyChecker = ((AstParentConsistencyChecker) createInstance("spoon.reflect.visitor.AstParentConsistencyChecker"));
        CtEnumValueImpl ctEnumValueImpl = ((CtEnumValueImpl) createInstance("spoon.support.reflect.declaration.CtEnumValueImpl"));
        setField(ctEnumValueImpl, "parent", null);
        setField(astParentConsistencyChecker, "parent", ctEnumValueImpl);
        CtParameterImpl ctParameterImpl = ((CtParameterImpl) createInstance("spoon.support.reflect.declaration.CtParameterImpl"));
        CtMethodImpl ctMethodImpl = ((CtMethodImpl) createInstance("spoon.support.reflect.declaration.CtMethodImpl"));
        setField(ctMethodImpl, "parent", null);
        setField(ctParameterImpl, "parent", ctMethodImpl);
        
        astParentConsistencyChecker.scan(ctParameterImpl);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testScan5() throws Throwable  {
        AstParentConsistencyChecker astParentConsistencyChecker = ((AstParentConsistencyChecker) createInstance("spoon.reflect.visitor.AstParentConsistencyChecker"));
        CtInterfaceImpl ctInterfaceImpl = ((CtInterfaceImpl) createInstance("spoon.support.reflect.declaration.CtInterfaceImpl"));
        setField(ctInterfaceImpl, "parent", null);
        setField(astParentConsistencyChecker, "parent", ctInterfaceImpl);
        ModuleFactory.CtUnnamedModule ctUnnamedModule = ((ModuleFactory.CtUnnamedModule) createInstance("spoon.reflect.factory.ModuleFactory$CtUnnamedModule"));
        CtEnumValueImpl ctEnumValueImpl = ((CtEnumValueImpl) createInstance("spoon.support.reflect.declaration.CtEnumValueImpl"));
        setField(ctEnumValueImpl, "parent", null);
        setField(ctUnnamedModule, "parent", ctEnumValueImpl);
        
        Object initialAstParentConsistencyCheckerParent = getFieldValue(astParentConsistencyChecker, "parent");
        
        Object initialCtUnnamedModuleParent = getFieldValue(ctUnnamedModule, "parent");
        
        Class astParentConsistencyCheckerClazz = Class.forName("spoon.reflect.visitor.AstParentConsistencyChecker");
        Class ctUnnamedModuleType = Class.forName("spoon.reflect.declaration.CtElement");
        Method scanMethod = astParentConsistencyCheckerClazz.getDeclaredMethod("scan", ctUnnamedModuleType);
        scanMethod.setAccessible(true);
        java.lang.Object[] scanMethodArguments = new java.lang.Object[1];
        scanMethodArguments[0] = ctUnnamedModule;
        try {
            scanMethod.invoke(astParentConsistencyChecker, scanMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        Object finalAstParentConsistencyCheckerParent = getFieldValue(astParentConsistencyChecker, "parent");
        
        Object finalCtUnnamedModuleParent = getFieldValue(ctUnnamedModule, "parent");
        
        assertFalse(initialAstParentConsistencyCheckerParent == finalAstParentConsistencyCheckerParent);
        
        assertNull(finalCtUnnamedModuleParent);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testToDebugString1() throws Throwable  {
        Class astParentConsistencyCheckerClazz = Class.forName("spoon.reflect.visitor.AstParentConsistencyChecker");
        Class ctElementType = Class.forName("spoon.reflect.declaration.CtElement");
        Method toDebugStringMethod = astParentConsistencyCheckerClazz.getDeclaredMethod("toDebugString", ctElementType);
        toDebugStringMethod.setAccessible(true);
        java.lang.Object[] toDebugStringMethodArguments = new java.lang.Object[1];
        toDebugStringMethodArguments[0] = null;
        try {
            toDebugStringMethod.invoke(null, toDebugStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testToDebugString2() throws Throwable  {
        InvisibleArrayConstructorImpl invisibleArrayConstructorImpl = ((InvisibleArrayConstructorImpl) createInstance("spoon.support.reflect.declaration.InvisibleArrayConstructorImpl"));
        setField(invisibleArrayConstructorImpl, "factory", null);
        CtArrayTypeReferenceImpl ctArrayTypeReferenceImpl = ((CtArrayTypeReferenceImpl) createInstance("spoon.support.reflect.reference.CtArrayTypeReferenceImpl"));
        setField(ctArrayTypeReferenceImpl, "factory", null);
        setField(invisibleArrayConstructorImpl, "type", ctArrayTypeReferenceImpl);
        
        Class astParentConsistencyCheckerClazz = Class.forName("spoon.reflect.visitor.AstParentConsistencyChecker");
        Class invisibleArrayConstructorImplType = Class.forName("spoon.reflect.declaration.CtElement");
        Method toDebugStringMethod = astParentConsistencyCheckerClazz.getDeclaredMethod("toDebugString", invisibleArrayConstructorImplType);
        toDebugStringMethod.setAccessible(true);
        java.lang.Object[] toDebugStringMethodArguments = new java.lang.Object[1];
        toDebugStringMethodArguments[0] = invisibleArrayConstructorImpl;
        String actual = ((String) toDebugStringMethod.invoke(null, toDebugStringMethodArguments));
        
        String expected = new String("Element: java.lang.Object[]::new\nSignature: spoon.support.reflect.declaration.InvisibleArrayConstructorImpl@6c5e0273\nClass: class spoon.support.reflect.declaration.InvisibleArrayConstructorImpl\nposition: (unknown file)\n");
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testToDebugString3() throws Throwable  {
        InvisibleArrayConstructorImpl invisibleArrayConstructorImpl = ((InvisibleArrayConstructorImpl) createInstance("spoon.support.reflect.declaration.InvisibleArrayConstructorImpl"));
        setField(invisibleArrayConstructorImpl, "factory", null);
        CtArrayTypeReferenceImpl ctArrayTypeReferenceImpl = ((CtArrayTypeReferenceImpl) createInstance("spoon.support.reflect.reference.CtArrayTypeReferenceImpl"));
        FactoryImpl factoryImpl = ((FactoryImpl) createInstance("spoon.reflect.factory.FactoryImpl"));
        StandardEnvironment standardEnvironment = ((StandardEnvironment) createInstance("spoon.support.StandardEnvironment"));
        setField(factoryImpl, "environment", standardEnvironment);
        setField(ctArrayTypeReferenceImpl, "factory", factoryImpl);
        setField(invisibleArrayConstructorImpl, "type", ctArrayTypeReferenceImpl);
        
        Class astParentConsistencyCheckerClazz = Class.forName("spoon.reflect.visitor.AstParentConsistencyChecker");
        Class invisibleArrayConstructorImplType = Class.forName("spoon.reflect.declaration.CtElement");
        Method toDebugStringMethod = astParentConsistencyCheckerClazz.getDeclaredMethod("toDebugString", invisibleArrayConstructorImplType);
        toDebugStringMethod.setAccessible(true);
        java.lang.Object[] toDebugStringMethodArguments = new java.lang.Object[1];
        toDebugStringMethodArguments[0] = invisibleArrayConstructorImpl;
        try {
            toDebugStringMethod.invoke(null, toDebugStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testToDebugString4() throws Throwable  {
        CtPackageImpl ctPackageImpl = ((CtPackageImpl) createInstance("spoon.support.reflect.declaration.CtPackageImpl"));
        setField(ctPackageImpl, "parent", null);
        String string = new String("\u0000\u0000\u0000\u0000\u0000");
        setField(ctPackageImpl, "simpleName", string);
        
        Class astParentConsistencyCheckerClazz = Class.forName("spoon.reflect.visitor.AstParentConsistencyChecker");
        Class ctPackageImplType = Class.forName("spoon.reflect.declaration.CtElement");
        Method toDebugStringMethod = astParentConsistencyCheckerClazz.getDeclaredMethod("toDebugString", ctPackageImplType);
        toDebugStringMethod.setAccessible(true);
        java.lang.Object[] toDebugStringMethodArguments = new java.lang.Object[1];
        toDebugStringMethodArguments[0] = ctPackageImpl;
        String actual = ((String) toDebugStringMethod.invoke(null, toDebugStringMethodArguments));
        
        String expected = new String("Element: \u0000\u0000\u0000\u0000\u0000\nSignature: spoon.support.reflect.declaration.CtPackageImpl@1\nClass: class spoon.support.reflect.declaration.CtPackageImpl\nposition: (unknown file)\n");
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testToDebugString5() throws Throwable  {
        CtEnumImpl ctEnumImpl = ((CtEnumImpl) createInstance("spoon.support.reflect.declaration.CtEnumImpl"));
        
        Class astParentConsistencyCheckerClazz = Class.forName("spoon.reflect.visitor.AstParentConsistencyChecker");
        Class ctEnumImplType = Class.forName("spoon.reflect.declaration.CtElement");
        Method toDebugStringMethod = astParentConsistencyCheckerClazz.getDeclaredMethod("toDebugString", ctEnumImplType);
        toDebugStringMethod.setAccessible(true);
        java.lang.Object[] toDebugStringMethodArguments = new java.lang.Object[1];
        toDebugStringMethodArguments[0] = ctEnumImpl;
        try {
            toDebugStringMethod.invoke(null, toDebugStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testAstParentConsistencyChecker1() {
        AstParentConsistencyChecker actual = new AstParentConsistencyChecker();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testAstParentConsistencyChecker2() {
        AstParentConsistencyChecker actual = new AstParentConsistencyChecker();
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
