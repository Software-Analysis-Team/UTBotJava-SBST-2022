package spoon.reflect.visitor;

import org.junit.Test;
import spoon.reflect.declaration.CtElement;
import spoon.support.reflect.declaration.CtClassImpl;
import spoon.support.reflect.declaration.CtModuleImpl;
import spoon.reflect.factory.ModuleFactory.CtUnnamedModule;
import spoon.reflect.factory.ModuleFactory;
import spoon.support.reflect.declaration.CtPackageImpl;
import spoon.support.reflect.reference.CtFieldReferenceImpl;
import spoon.support.reflect.declaration.CtEnumImpl;
import java.lang.reflect.Method;
import spoon.reflect.CtModelImpl.CtRootPackage;
import spoon.reflect.CtModelImpl;
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
        CtClassImpl ctClassImpl = ((CtClassImpl) createInstance("spoon.support.reflect.declaration.CtClassImpl"));
        setField(ctClassImpl, "parent", null);
        setField(ctClassImpl, "factory", null);
        setField(astParentConsistencyChecker, "parent", ctClassImpl);
        CtModuleImpl ctModuleImpl = ((CtModuleImpl) createInstance("spoon.support.reflect.declaration.CtModuleImpl"));
        CtClassImpl ctClassImpl1 = ((CtClassImpl) createInstance("spoon.support.reflect.declaration.CtClassImpl"));
        setField(ctClassImpl1, "parent", null);
        setField(ctClassImpl1, "factory", null);
        setField(ctModuleImpl, "parent", ctClassImpl1);
        setField(ctModuleImpl, "factory", null);
        
        astParentConsistencyChecker.scan(ctModuleImpl);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testScan4() throws Throwable  {
        AstParentConsistencyChecker astParentConsistencyChecker = ((AstParentConsistencyChecker) createInstance("spoon.reflect.visitor.AstParentConsistencyChecker"));
        ModuleFactory.CtUnnamedModule ctUnnamedModule = ((ModuleFactory.CtUnnamedModule) createInstance("spoon.reflect.factory.ModuleFactory$CtUnnamedModule"));
        setField(ctUnnamedModule, "parent", null);
        setField(astParentConsistencyChecker, "parent", ctUnnamedModule);
        CtPackageImpl ctPackageImpl = ((CtPackageImpl) createInstance("spoon.support.reflect.declaration.CtPackageImpl"));
        setField(ctPackageImpl, "parent", null);
        
        Object initialAstParentConsistencyCheckerParent = getFieldValue(astParentConsistencyChecker, "parent");
        
        astParentConsistencyChecker.scan(ctPackageImpl);
        
        Object finalAstParentConsistencyCheckerParent = getFieldValue(astParentConsistencyChecker, "parent");
        
        assertFalse(initialAstParentConsistencyCheckerParent == finalAstParentConsistencyCheckerParent);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testScan5() throws Throwable  {
        AstParentConsistencyChecker astParentConsistencyChecker = ((AstParentConsistencyChecker) createInstance("spoon.reflect.visitor.AstParentConsistencyChecker"));
        CtFieldReferenceImpl ctFieldReferenceImpl = ((CtFieldReferenceImpl) createInstance("spoon.support.reflect.reference.CtFieldReferenceImpl"));
        CtEnumImpl ctEnumImpl = ((CtEnumImpl) createInstance("spoon.support.reflect.declaration.CtEnumImpl"));
        setField(ctEnumImpl, "parent", ctEnumImpl);
        setField(ctFieldReferenceImpl, "parent", ctEnumImpl);
        setField(astParentConsistencyChecker, "parent", ctFieldReferenceImpl);
        CtFieldReferenceImpl ctFieldReferenceImpl1 = ((CtFieldReferenceImpl) createInstance("spoon.support.reflect.reference.CtFieldReferenceImpl"));
        setField(ctFieldReferenceImpl1, "parent", ctEnumImpl);
        
        astParentConsistencyChecker.scan(ctFieldReferenceImpl1);
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
        CtPackageImpl ctPackageImpl = ((CtPackageImpl) createInstance("spoon.support.reflect.declaration.CtPackageImpl"));
        CtFieldReferenceImpl ctFieldReferenceImpl = ((CtFieldReferenceImpl) createInstance("spoon.support.reflect.reference.CtFieldReferenceImpl"));
        setField(ctFieldReferenceImpl, "parent", null);
        setField(ctPackageImpl, "parent", ctFieldReferenceImpl);
        
        Class astParentConsistencyCheckerClazz = Class.forName("spoon.reflect.visitor.AstParentConsistencyChecker");
        Class ctPackageImplType = Class.forName("spoon.reflect.declaration.CtElement");
        Method toDebugStringMethod = astParentConsistencyCheckerClazz.getDeclaredMethod("toDebugString", ctPackageImplType);
        toDebugStringMethod.setAccessible(true);
        java.lang.Object[] toDebugStringMethodArguments = new java.lang.Object[1];
        toDebugStringMethodArguments[0] = ctPackageImpl;
        String actual = ((String) toDebugStringMethod.invoke(null, toDebugStringMethodArguments));
        
        String expected = new String("Element: null\nSignature: spoon.support.reflect.declaration.CtPackageImpl@1\nClass: class spoon.support.reflect.declaration.CtPackageImpl\nposition: (unknown file)\n");
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testToDebugString3() throws Throwable  {
        CtPackageImpl ctPackageImpl = ((CtPackageImpl) createInstance("spoon.support.reflect.declaration.CtPackageImpl"));
        setField(ctPackageImpl, "parent", null);
        String string = new String("");
        setField(ctPackageImpl, "simpleName", string);
        
        Class astParentConsistencyCheckerClazz = Class.forName("spoon.reflect.visitor.AstParentConsistencyChecker");
        Class ctPackageImplType = Class.forName("spoon.reflect.declaration.CtElement");
        Method toDebugStringMethod = astParentConsistencyCheckerClazz.getDeclaredMethod("toDebugString", ctPackageImplType);
        toDebugStringMethod.setAccessible(true);
        java.lang.Object[] toDebugStringMethodArguments = new java.lang.Object[1];
        toDebugStringMethodArguments[0] = ctPackageImpl;
        String actual = ((String) toDebugStringMethod.invoke(null, toDebugStringMethodArguments));
        
        String expected = new String("Element: \nSignature: spoon.support.reflect.declaration.CtPackageImpl@1\nClass: class spoon.support.reflect.declaration.CtPackageImpl\nposition: (unknown file)\n");
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testToDebugString4() throws Throwable  {
        CtPackageImpl ctPackageImpl = ((CtPackageImpl) createInstance("spoon.support.reflect.declaration.CtPackageImpl"));
        CtModuleImpl ctModuleImpl = ((CtModuleImpl) createInstance("spoon.support.reflect.declaration.CtModuleImpl"));
        CtClassImpl ctClassImpl = ((CtClassImpl) createInstance("spoon.support.reflect.declaration.CtClassImpl"));
        setField(ctClassImpl, "parent", null);
        setField(ctModuleImpl, "parent", ctClassImpl);
        setField(ctPackageImpl, "parent", ctModuleImpl);
        
        Class astParentConsistencyCheckerClazz = Class.forName("spoon.reflect.visitor.AstParentConsistencyChecker");
        Class ctPackageImplType = Class.forName("spoon.reflect.declaration.CtElement");
        Method toDebugStringMethod = astParentConsistencyCheckerClazz.getDeclaredMethod("toDebugString", ctPackageImplType);
        toDebugStringMethod.setAccessible(true);
        java.lang.Object[] toDebugStringMethodArguments = new java.lang.Object[1];
        toDebugStringMethodArguments[0] = ctPackageImpl;
        String actual = ((String) toDebugStringMethod.invoke(null, toDebugStringMethodArguments));
        
        String expected = new String("Element: null\nSignature: spoon.support.reflect.declaration.CtPackageImpl@1\nClass: class spoon.support.reflect.declaration.CtPackageImpl\nposition: (unknown file)\n");
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testToDebugString5() throws Throwable  {
        CtPackageImpl ctPackageImpl = ((CtPackageImpl) createInstance("spoon.support.reflect.declaration.CtPackageImpl"));
        CtModelImpl.CtRootPackage ctRootPackage = ((CtModelImpl.CtRootPackage) createInstance("spoon.reflect.CtModelImpl$CtRootPackage"));
        setField(ctRootPackage, "parent", null);
        setField(ctPackageImpl, "parent", ctRootPackage);
        
        Class astParentConsistencyCheckerClazz = Class.forName("spoon.reflect.visitor.AstParentConsistencyChecker");
        Class ctPackageImplType = Class.forName("spoon.reflect.declaration.CtElement");
        Method toDebugStringMethod = astParentConsistencyCheckerClazz.getDeclaredMethod("toDebugString", ctPackageImplType);
        toDebugStringMethod.setAccessible(true);
        java.lang.Object[] toDebugStringMethodArguments = new java.lang.Object[1];
        toDebugStringMethodArguments[0] = ctPackageImpl;
        String actual = ((String) toDebugStringMethod.invoke(null, toDebugStringMethodArguments));
        
        String expected = new String("Element: .null\nSignature: spoon.support.reflect.declaration.CtPackageImpl@1\nClass: class spoon.support.reflect.declaration.CtPackageImpl\nposition: (unknown file)\n");
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testToDebugString6() throws Throwable  {
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
