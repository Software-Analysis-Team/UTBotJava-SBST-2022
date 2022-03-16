package spoon.support;

import org.junit.Test;
import spoon.reflect.factory.Factory;
import spoon.reflect.cu.SourcePosition;
import spoon.support.reflect.cu.position.SourcePositionImpl;
import spoon.support.reflect.cu.CompilationUnitImpl;
import spoon.support.reflect.cu.position.PartialSourcePositionImpl;
import spoon.reflect.cu.position.CompoundSourcePosition;
import spoon.support.reflect.cu.position.CompoundSourcePositionImpl;
import spoon.reflect.cu.CompilationUnit;
import java.util.ArrayList;
import java.util.HashSet;
import spoon.reflect.declaration.CtElement;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Map;
import java.util.List;
import java.util.Set;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import sun.misc.Unsafe;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class DefaultCoreFactoryTest {
    ///region
    
    @Test(timeout = 10000)
    public void testGetMainFactory1() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = new DefaultCoreFactory();
        
        Factory actual = defaultCoreFactory.getMainFactory();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetMainFactory2() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = ((DefaultCoreFactory) createInstance("spoon.support.DefaultCoreFactory"));
        setField(defaultCoreFactory, "factory", null);
        
        Factory actual = defaultCoreFactory.getMainFactory();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetMainFactory1() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = new DefaultCoreFactory();
        
        defaultCoreFactory.setMainFactory(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetMainFactory2() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = ((DefaultCoreFactory) createInstance("spoon.support.DefaultCoreFactory"));
        setField(defaultCoreFactory, "factory", null);
        
        defaultCoreFactory.setMainFactory(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCreateSourcePosition1() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = new DefaultCoreFactory();
        int[] intArray = new int[0];
        
        SourcePosition actual = defaultCoreFactory.createSourcePosition(null, 0, 0, intArray);
        
        SourcePositionImpl expected = ((SourcePositionImpl) createInstance("spoon.support.reflect.cu.position.SourcePositionImpl"));
        setField(expected, "sourceStart", 0);
        setField(expected, "sourceEnd", 0);
        setField(expected, "sourceStartline", -1);
        setField(expected, "lineSeparatorPositions", intArray);
        setField(expected, "compilationUnit", null);
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateSourcePosition2() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = ((DefaultCoreFactory) createInstance("spoon.support.DefaultCoreFactory"));
        CompilationUnitImpl compilationUnitImpl = ((CompilationUnitImpl) createInstance("spoon.support.reflect.cu.CompilationUnitImpl"));
        int[] intArray = new int[9];
        
        defaultCoreFactory.createSourcePosition(compilationUnitImpl, Integer.MIN_VALUE, 0, intArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCreateSourcePosition3() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = ((DefaultCoreFactory) createInstance("spoon.support.DefaultCoreFactory"));
        CompilationUnitImpl compilationUnitImpl = ((CompilationUnitImpl) createInstance("spoon.support.reflect.cu.CompilationUnitImpl"));
        int[] intArray = new int[9];
        
        SourcePosition actual = defaultCoreFactory.createSourcePosition(compilationUnitImpl, 0, 0, intArray);
        
        SourcePositionImpl expected = ((SourcePositionImpl) createInstance("spoon.support.reflect.cu.position.SourcePositionImpl"));
        setField(expected, "sourceStart", 0);
        setField(expected, "sourceEnd", 0);
        setField(expected, "sourceStartline", -1);
        setField(expected, "lineSeparatorPositions", intArray);
        setField(expected, "compilationUnit", compilationUnitImpl);
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreatePartialSourcePosition1() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = new DefaultCoreFactory();
        
        defaultCoreFactory.createPartialSourcePosition(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreatePartialSourcePosition2() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = ((DefaultCoreFactory) createInstance("spoon.support.DefaultCoreFactory"));
        
        defaultCoreFactory.createPartialSourcePosition(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCreatePartialSourcePosition3() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = ((DefaultCoreFactory) createInstance("spoon.support.DefaultCoreFactory"));
        CompilationUnitImpl compilationUnitImpl = ((CompilationUnitImpl) createInstance("spoon.support.reflect.cu.CompilationUnitImpl"));
        PartialSourcePositionImpl partialSourcePositionImpl = ((PartialSourcePositionImpl) createInstance("spoon.support.reflect.cu.position.PartialSourcePositionImpl"));
        setField(compilationUnitImpl, "myPartialSourcePosition", partialSourcePositionImpl);
        
        SourcePosition actual = defaultCoreFactory.createPartialSourcePosition(compilationUnitImpl);
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(partialSourcePositionImpl, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCreatePartialSourcePosition4() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = ((DefaultCoreFactory) createInstance("spoon.support.DefaultCoreFactory"));
        CompilationUnitImpl compilationUnitImpl = ((CompilationUnitImpl) createInstance("spoon.support.reflect.cu.CompilationUnitImpl"));
        setField(compilationUnitImpl, "myPartialSourcePosition", null);
        
        Object initialCompilationUnitImplMyPartialSourcePosition = getFieldValue(compilationUnitImpl, "myPartialSourcePosition");
        
        SourcePosition actual = defaultCoreFactory.createPartialSourcePosition(compilationUnitImpl);
        
        PartialSourcePositionImpl expected = ((PartialSourcePositionImpl) createInstance("spoon.support.reflect.cu.position.PartialSourcePositionImpl"));
        setField(expected, "compilationUnit", compilationUnitImpl);
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
        
        Object finalCompilationUnitImplMyPartialSourcePosition = getFieldValue(compilationUnitImpl, "myPartialSourcePosition");
        
        assertFalse(initialCompilationUnitImplMyPartialSourcePosition == finalCompilationUnitImplMyPartialSourcePosition);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCreateCompoundSourcePosition1() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = new DefaultCoreFactory();
        int[] intArray = new int[0];
        
        CompoundSourcePosition actual = defaultCoreFactory.createCompoundSourcePosition(null, 0, 0, 0, 0, intArray);
        
        CompoundSourcePositionImpl expected = ((CompoundSourcePositionImpl) createInstance("spoon.support.reflect.cu.position.CompoundSourcePositionImpl"));
        setField(expected, "declarationSourceStart", 0);
        setField(expected, "declarationSourceEnd", 0);
        setField(expected, "sourceStart", 0);
        setField(expected, "sourceEnd", 0);
        setField(expected, "sourceStartline", -1);
        setField(expected, "lineSeparatorPositions", intArray);
        setField(expected, "compilationUnit", null);
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateCompoundSourcePosition2() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = ((DefaultCoreFactory) createInstance("spoon.support.DefaultCoreFactory"));
        CompilationUnitImpl compilationUnitImpl = ((CompilationUnitImpl) createInstance("spoon.support.reflect.cu.CompilationUnitImpl"));
        int[] intArray = new int[9];
        
        defaultCoreFactory.createCompoundSourcePosition(compilationUnitImpl, Integer.MIN_VALUE, 0, 0, 0, intArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCreateCompoundSourcePosition3() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = ((DefaultCoreFactory) createInstance("spoon.support.DefaultCoreFactory"));
        CompilationUnitImpl compilationUnitImpl = ((CompilationUnitImpl) createInstance("spoon.support.reflect.cu.CompilationUnitImpl"));
        int[] intArray = new int[9];
        
        CompoundSourcePosition actual = defaultCoreFactory.createCompoundSourcePosition(compilationUnitImpl, 0, 0, 0, 0, intArray);
        
        CompoundSourcePositionImpl expected = ((CompoundSourcePositionImpl) createInstance("spoon.support.reflect.cu.position.CompoundSourcePositionImpl"));
        setField(expected, "declarationSourceStart", 0);
        setField(expected, "declarationSourceEnd", 0);
        setField(expected, "sourceStart", 0);
        setField(expected, "sourceEnd", 0);
        setField(expected, "sourceStartline", -1);
        setField(expected, "lineSeparatorPositions", intArray);
        setField(expected, "compilationUnit", compilationUnitImpl);
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateDeclarationSourcePosition1() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = new DefaultCoreFactory();
        int[] intArray = new int[0];
        
        defaultCoreFactory.createDeclarationSourcePosition(null, 0, 0, 0, 0, 0, 0, intArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateDeclarationSourcePosition2() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = ((DefaultCoreFactory) createInstance("spoon.support.DefaultCoreFactory"));
        CompilationUnitImpl compilationUnitImpl = ((CompilationUnitImpl) createInstance("spoon.support.reflect.cu.CompilationUnitImpl"));
        int[] intArray = new int[9];
        
        defaultCoreFactory.createDeclarationSourcePosition(compilationUnitImpl, 0, 0, 0, 0, 0, 0, intArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateDeclarationSourcePosition3() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = ((DefaultCoreFactory) createInstance("spoon.support.DefaultCoreFactory"));
        CompilationUnitImpl compilationUnitImpl = ((CompilationUnitImpl) createInstance("spoon.support.reflect.cu.CompilationUnitImpl"));
        int[] intArray = new int[9];
        
        defaultCoreFactory.createDeclarationSourcePosition(compilationUnitImpl, Integer.MIN_VALUE, 0, 0, 0, 0, 0, intArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateBodyHolderSourcePosition1() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = new DefaultCoreFactory();
        int[] intArray = new int[0];
        
        defaultCoreFactory.createBodyHolderSourcePosition(null, 0, 0, 0, 0, 0, 0, 0, 0, intArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateBodyHolderSourcePosition2() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = ((DefaultCoreFactory) createInstance("spoon.support.DefaultCoreFactory"));
        int[] intArray = new int[9];
        
        defaultCoreFactory.createBodyHolderSourcePosition(null, Integer.MIN_VALUE, 0, 0, 0, 0, 0, 0, 0, intArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateBodyHolderSourcePosition3() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = ((DefaultCoreFactory) createInstance("spoon.support.DefaultCoreFactory"));
        int[] intArray = new int[9];
        
        defaultCoreFactory.createBodyHolderSourcePosition(null, 0, 0, 0, 0, 0, 0, 0, 0, intArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCreateCompilationUnit1() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = new DefaultCoreFactory();
        
        CompilationUnit actual = defaultCoreFactory.createCompilationUnit();
        
        CompilationUnitImpl expected = ((CompilationUnitImpl) createInstance("spoon.support.reflect.cu.CompilationUnitImpl"));
        setField(expected, "factory", null);
        ArrayList arrayList = new ArrayList();
        setField(expected, "declaredTypes", arrayList);
        setField(expected, "ctPackage", null);
        HashSet hashSet = new HashSet();
        setField(expected, "imports", hashSet);
        setField(expected, "ctModule", null);
        setField(expected, "file", null);
        setField(expected, "originalSourceCode", null);
        setField(expected, "autoImport", true);
        setField(expected, "myPartialSourcePosition", null);
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCreateCompilationUnit2() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = ((DefaultCoreFactory) createInstance("spoon.support.DefaultCoreFactory"));
        setField(defaultCoreFactory, "factory", null);
        
        CompilationUnit actual = defaultCoreFactory.createCompilationUnit();
        
        CompilationUnitImpl expected = ((CompilationUnitImpl) createInstance("spoon.support.reflect.cu.CompilationUnitImpl"));
        setField(expected, "factory", null);
        ArrayList arrayList = new ArrayList();
        setField(expected, "declaredTypes", arrayList);
        setField(expected, "ctPackage", null);
        HashSet hashSet = new HashSet();
        setField(expected, "imports", hashSet);
        setField(expected, "ctModule", null);
        setField(expected, "file", null);
        setField(expected, "originalSourceCode", null);
        setField(expected, "autoImport", true);
        setField(expected, "myPartialSourcePosition", null);
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testClone1() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = new DefaultCoreFactory();
        
        CtElement actual = defaultCoreFactory.clone(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreate1() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = ((DefaultCoreFactory) createInstance("spoon.support.DefaultCoreFactory"));
        
        defaultCoreFactory.create(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreate2() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = ((DefaultCoreFactory) createInstance("spoon.support.DefaultCoreFactory"));
        Class class1 = Object.class;
        
        defaultCoreFactory.create(class1);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDefaultCoreFactory1() {
        DefaultCoreFactory actual = new DefaultCoreFactory();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDefaultCoreFactory2() {
        DefaultCoreFactory actual = new DefaultCoreFactory();
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
