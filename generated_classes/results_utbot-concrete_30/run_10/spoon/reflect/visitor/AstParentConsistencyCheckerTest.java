package spoon.support.reflect.code;

import org.junit.Test;
import spoon.reflect.code.CtFor;
import spoon.support.util.EmptyClearableList;
import spoon.reflect.factory.FactoryImpl;
import spoon.support.DefaultCoreFactory;
import spoon.support.StandardEnvironment;
import org.apache.log4j.Logger;
import org.apache.log4j.Level;
import org.apache.log4j.spi.RootLogger;
import org.apache.log4j.Hierarchy;
import java.util.Vector;
import java.util.Hashtable;
import org.apache.log4j.or.RendererMap;
import org.apache.log4j.helpers.AppenderAttachableImpl;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.helpers.QuietWriter;
import org.apache.log4j.helpers.OnlyOnceErrorHandler;
import java.io.OutputStreamWriter;
import sun.nio.cs.StreamEncoder;
import sun.nio.cs.US_ASCII;
import sun.nio.cs.StandardCharsets;
import java.util.concurrent.atomic.AtomicInteger;
import sun.nio.cs.Surrogate.Parser;
import sun.nio.cs.Surrogate;
import java.nio.charset.CoderResult;
import java.util.List;
import java.util.ArrayList;
import spoon.reflect.code.CtExpression;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Array;
import java.util.Objects;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Iterator;
import sun.misc.Unsafe;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;

public class CtForImplTest {
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testAccept1() throws Throwable  {
        CtForImpl ctForImpl = new CtForImpl();
        
        ctForImpl.accept(null);
    }
    ///endregion
    
    
    ///region Errors report for clone
    
    public void testClone_errors()
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
    public void testClone2() throws Throwable  {
        CtForImpl ctForImpl = ((CtForImpl) createInstance("spoon.support.reflect.code.CtForImpl"));
        FactoryImpl factoryImpl = ((FactoryImpl) createInstance("spoon.reflect.factory.FactoryImpl"));
        setField(ctForImpl, "factory", factoryImpl);
        
        ctForImpl.clone();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetExpression1() throws Throwable  {
        CtForImpl ctForImpl = new CtForImpl();
        
        CtFor actual = ctForImpl.setExpression(null);
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(ctForImpl, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetExpression2() throws Throwable  {
        CtForImpl ctForImpl = ((CtForImpl) createInstance("spoon.support.reflect.code.CtForImpl"));
        setField(ctForImpl, "parent", null);
        setField(ctForImpl, "factory", null);
        CtLambdaImpl ctLambdaImpl = ((CtLambdaImpl) createInstance("spoon.support.reflect.code.CtLambdaImpl"));
        setField(ctLambdaImpl, "parent", null);
        setField(ctLambdaImpl, "factory", null);
        
        Object initialCtLambdaImplParent = getFieldValue(ctLambdaImpl, "parent");
        
        CtFor actual = ctForImpl.setExpression(ctLambdaImpl);
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(ctForImpl, actual));
        
        Object finalCtLambdaImplParent = getFieldValue(ctLambdaImpl, "parent");
        
        assertFalse(initialCtLambdaImplParent == finalCtLambdaImplParent);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetExpression3() throws Throwable  {
        CtForImpl ctForImpl = ((CtForImpl) createInstance("spoon.support.reflect.code.CtForImpl"));
        FactoryImpl factoryImpl = ((FactoryImpl) createInstance("spoon.reflect.factory.FactoryImpl"));
        setField(factoryImpl, "environment", null);
        setField(ctForImpl, "factory", factoryImpl);
        
        Object ctForImplFactory = getFieldValue(ctForImpl, "factory");
        Object initialCtForImplFactoryEnvironment = getFieldValue(ctForImplFactory, "environment");
        
        CtFor actual = ctForImpl.setExpression(null);
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(ctForImpl, actual));
        
        Object ctForImplFactory1 = getFieldValue(ctForImpl, "factory");
        Object finalCtForImplFactoryEnvironment = getFieldValue(ctForImplFactory1, "environment");
        
        assertFalse(initialCtForImplFactoryEnvironment == finalCtForImplFactoryEnvironment);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetForInit1() throws Throwable  {
        CtForImpl ctForImpl = new CtForImpl();
        
        List actual = ctForImpl.getForInit();
        
        EmptyClearableList expected = ((EmptyClearableList) createInstance("spoon.support.util.EmptyClearableList"));
        setField(expected, "modCount", 0);
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetForInit2() throws Throwable  {
        CtForImpl ctForImpl = ((CtForImpl) createInstance("spoon.support.reflect.code.CtForImpl"));
        ArrayList arrayList = new ArrayList();
        setField(ctForImpl, "forInit", arrayList);
        
        List actual = ctForImpl.getForInit();
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(arrayList, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testAddForInit1() throws Throwable  {
        CtForImpl ctForImpl = new CtForImpl();
        
        CtFor actual = ctForImpl.addForInit(null);
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(ctForImpl, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testAddForInit2() throws Throwable  {
        CtForImpl ctForImpl = ((CtForImpl) createInstance("spoon.support.reflect.code.CtForImpl"));
        
        CtFor actual = ctForImpl.addForInit(null);
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(ctForImpl, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testAddForInit3() throws Throwable  {
        CtForImpl ctForImpl = ((CtForImpl) createInstance("spoon.support.reflect.code.CtForImpl"));
        ArrayList arrayList = new ArrayList();
        setField(ctForImpl, "forInit", arrayList);
        CtContinueImpl ctContinueImpl = ((CtContinueImpl) createInstance("spoon.support.reflect.code.CtContinueImpl"));
        
        CtFor actual = ctForImpl.addForInit(ctContinueImpl);
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(ctForImpl, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetForInit1() throws Throwable  {
        CtForImpl ctForImpl = new CtForImpl();
        ArrayList arrayList = new ArrayList();
        
        CtFor actual = ctForImpl.setForInit(arrayList);
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(ctForImpl, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetForInit2() throws Throwable  {
        CtForImpl ctForImpl = ((CtForImpl) createInstance("spoon.support.reflect.code.CtForImpl"));
        ArrayList arrayList = new ArrayList();
        
        CtFor actual = ctForImpl.setForInit(arrayList);
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(ctForImpl, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testRemoveForInit1() throws Throwable  {
        CtForImpl ctForImpl = new CtForImpl();
        
        boolean actual = ctForImpl.removeForInit(null);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testRemoveForInit2() throws Throwable  {
        CtForImpl ctForImpl = ((CtForImpl) createInstance("spoon.support.reflect.code.CtForImpl"));
        ArrayList arrayList = new ArrayList();
        setField(ctForImpl, "forInit", arrayList);
        
        boolean actual = ctForImpl.removeForInit(null);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testRemoveForInit3() throws Throwable  {
        CtForImpl ctForImpl = ((CtForImpl) createInstance("spoon.support.reflect.code.CtForImpl"));
        FactoryImpl factoryImpl = ((FactoryImpl) createInstance("spoon.reflect.factory.FactoryImpl"));
        setField(ctForImpl, "factory", factoryImpl);
        ArrayList arrayList = new ArrayList();
        setField(ctForImpl, "forInit", arrayList);
        CtAssignmentImpl ctAssignmentImpl = ((CtAssignmentImpl) createInstance("spoon.support.reflect.code.CtAssignmentImpl"));
        setField(ctAssignmentImpl, "factory", null);
        
        boolean actual = ctForImpl.removeForInit(ctAssignmentImpl);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetForUpdate1() throws Throwable  {
        CtForImpl ctForImpl = new CtForImpl();
        
        List actual = ctForImpl.getForUpdate();
        
        EmptyClearableList expected = ((EmptyClearableList) createInstance("spoon.support.util.EmptyClearableList"));
        setField(expected, "modCount", 0);
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetForUpdate2() throws Throwable  {
        CtForImpl ctForImpl = ((CtForImpl) createInstance("spoon.support.reflect.code.CtForImpl"));
        ArrayList arrayList = new ArrayList();
        setField(ctForImpl, "forUpdate", arrayList);
        
        List actual = ctForImpl.getForUpdate();
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(arrayList, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testAddForUpdate1() throws Throwable  {
        CtForImpl ctForImpl = new CtForImpl();
        
        CtFor actual = ctForImpl.addForUpdate(null);
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(ctForImpl, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testAddForUpdate2() throws Throwable  {
        CtForImpl ctForImpl = ((CtForImpl) createInstance("spoon.support.reflect.code.CtForImpl"));
        
        CtFor actual = ctForImpl.addForUpdate(null);
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(ctForImpl, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testAddForUpdate3() throws Throwable  {
        CtForImpl ctForImpl = ((CtForImpl) createInstance("spoon.support.reflect.code.CtForImpl"));
        setField(ctForImpl, "parent", null);
        FactoryImpl factoryImpl = ((FactoryImpl) createInstance("spoon.reflect.factory.FactoryImpl"));
        setField(ctForImpl, "factory", factoryImpl);
        ArrayList arrayList = new ArrayList();
        setField(ctForImpl, "forUpdate", arrayList);
        CtTryImpl ctTryImpl = ((CtTryImpl) createInstance("spoon.support.reflect.code.CtTryImpl"));
        setField(ctTryImpl, "parent", null);
        setField(ctTryImpl, "factory", null);
        
        Object initialCtTryImplParent = getFieldValue(ctTryImpl, "parent");
        
        CtFor actual = ctForImpl.addForUpdate(ctTryImpl);
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(ctForImpl, actual));
        
        Object finalCtTryImplParent = getFieldValue(ctTryImpl, "parent");
        
        assertFalse(initialCtTryImplParent == finalCtTryImplParent);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testAddForUpdate4() throws Throwable  {
        CtForImpl ctForImpl = ((CtForImpl) createInstance("spoon.support.reflect.code.CtForImpl"));
        ArrayList arrayList = new ArrayList();
        setField(ctForImpl, "forUpdate", arrayList);
        CtOperatorAssignmentImpl ctOperatorAssignmentImpl = ((CtOperatorAssignmentImpl) createInstance("spoon.support.reflect.code.CtOperatorAssignmentImpl"));
        
        CtFor actual = ctForImpl.addForUpdate(ctOperatorAssignmentImpl);
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(ctForImpl, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetForUpdate1() throws Throwable  {
        CtForImpl ctForImpl = new CtForImpl();
        ArrayList arrayList = new ArrayList();
        
        CtFor actual = ctForImpl.setForUpdate(arrayList);
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(ctForImpl, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testSetForUpdate2() throws Throwable  {
        CtForImpl ctForImpl = ((CtForImpl) createInstance("spoon.support.reflect.code.CtForImpl"));
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        
        ctForImpl.setForUpdate(arrayList);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetForUpdate3() throws Throwable  {
        CtForImpl ctForImpl = ((CtForImpl) createInstance("spoon.support.reflect.code.CtForImpl"));
        ArrayList arrayList = new ArrayList();
        
        CtFor actual = ctForImpl.setForUpdate(arrayList);
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(ctForImpl, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testRemoveForUpdate1() throws Throwable  {
        CtForImpl ctForImpl = new CtForImpl();
        
        boolean actual = ctForImpl.removeForUpdate(null);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testRemoveForUpdate2() throws Throwable  {
        CtForImpl ctForImpl = ((CtForImpl) createInstance("spoon.support.reflect.code.CtForImpl"));
        ArrayList arrayList = new ArrayList();
        setField(ctForImpl, "forUpdate", arrayList);
        
        boolean actual = ctForImpl.removeForUpdate(null);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetExpression1() throws Throwable  {
        CtForImpl ctForImpl = new CtForImpl();
        
        CtExpression actual = ctForImpl.getExpression();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetExpression2() throws Throwable  {
        CtForImpl ctForImpl = ((CtForImpl) createInstance("spoon.support.reflect.code.CtForImpl"));
        CtOperatorAssignmentImpl ctOperatorAssignmentImpl = ((CtOperatorAssignmentImpl) createInstance("spoon.support.reflect.code.CtOperatorAssignmentImpl"));
        setField(ctForImpl, "expression", ctOperatorAssignmentImpl);
        
        CtExpression actual = ctForImpl.getExpression();
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(ctOperatorAssignmentImpl, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCtForImpl1() {
        CtForImpl actual = new CtForImpl();
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
