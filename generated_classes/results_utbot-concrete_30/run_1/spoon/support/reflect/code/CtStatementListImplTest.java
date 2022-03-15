package spoon.support.reflect.code;

import org.junit.Test;
import spoon.reflect.code.CtStatementList;
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
import spoon.reflect.cu.SourcePosition;
import spoon.reflect.declaration.CtElement;
import java.util.ArrayList;
import java.util.Iterator;
import spoon.support.util.EmptyIterator;
import spoon.reflect.visitor.Filter;
import spoon.reflect.factory.QueryFactory;
import spoon.reflect.code.CtStatement;
import java.util.List;
import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Array;
import java.util.Objects;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import sun.misc.Unsafe;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class CtStatementListImplTest {
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testAccept1() throws Throwable  {
        CtStatementListImpl ctStatementListImpl = new CtStatementListImpl();
        
        ctStatementListImpl.accept(null);
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
        CtStatementListImpl ctStatementListImpl = ((CtStatementListImpl) createInstance("spoon.support.reflect.code.CtStatementListImpl"));
        
        ctStatementListImpl.clone();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetPosition1() throws Throwable  {
        CtStatementListImpl ctStatementListImpl = new CtStatementListImpl();
        
        CtElement actual = ctStatementListImpl.setPosition(((SourcePosition) null));
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(ctStatementListImpl, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetPosition2() throws Throwable  {
        CtStatementListImpl ctStatementListImpl = ((CtStatementListImpl) createInstance("spoon.support.reflect.code.CtStatementListImpl"));
        ArrayList arrayList = new ArrayList();
        setField(ctStatementListImpl, "statements", arrayList);
        
        CtElement actual = ctStatementListImpl.setPosition(((SourcePosition) null));
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(ctStatementListImpl, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIterator1() throws Throwable  {
        CtStatementListImpl ctStatementListImpl = new CtStatementListImpl();
        
        Iterator actual = ctStatementListImpl.iterator();
        
        EmptyIterator expected = ((EmptyIterator) createInstance("spoon.support.util.EmptyIterator"));
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIterator2() throws Throwable  {
        CtStatementListImpl ctStatementListImpl = ((CtStatementListImpl) createInstance("spoon.support.reflect.code.CtStatementListImpl"));
        ArrayList arrayList = new ArrayList();
        setField(ctStatementListImpl, "statements", arrayList);
        
        Iterator actual = ctStatementListImpl.iterator();
        
        Object expected = createInstance("java.util.ArrayList$Itr");
        setField(expected, "cursor", 0);
        setField(expected, "lastRet", -1);
        setField(expected, "expectedModCount", 0);
        setField(expected, "this$0", arrayList);
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testInsertBefore1() throws Throwable  {
        CtStatementListImpl ctStatementListImpl = new CtStatementListImpl();
        
        ctStatementListImpl.insertBefore(((Filter) null), ((CtStatementList) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testInsertBefore2() throws Throwable  {
        CtStatementListImpl ctStatementListImpl = ((CtStatementListImpl) createInstance("spoon.support.reflect.code.CtStatementListImpl"));
        FactoryImpl factoryImpl = ((FactoryImpl) createInstance("spoon.reflect.factory.FactoryImpl"));
        QueryFactory queryFactory = ((QueryFactory) createInstance("spoon.reflect.factory.QueryFactory"));
        setField(factoryImpl, "query", queryFactory);
        setField(ctStatementListImpl, "factory", factoryImpl);
        
        ctStatementListImpl.insertBefore(((Filter) null), ((CtStatementList) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testInsertBefore3() throws Throwable  {
        CtStatementListImpl ctStatementListImpl = new CtStatementListImpl();
        
        ctStatementListImpl.insertBefore(((Filter) null), ((CtStatement) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testInsertAfter1() throws Throwable  {
        CtStatementListImpl ctStatementListImpl = new CtStatementListImpl();
        
        ctStatementListImpl.insertAfter(((Filter) null), ((CtStatement) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testInsertAfter2() throws Throwable  {
        CtStatementListImpl ctStatementListImpl = new CtStatementListImpl();
        
        ctStatementListImpl.insertAfter(((Filter) null), ((CtStatementList) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testInsertAfter3() throws Throwable  {
        CtStatementListImpl ctStatementListImpl = ((CtStatementListImpl) createInstance("spoon.support.reflect.code.CtStatementListImpl"));
        FactoryImpl factoryImpl = ((FactoryImpl) createInstance("spoon.reflect.factory.FactoryImpl"));
        QueryFactory queryFactory = ((QueryFactory) createInstance("spoon.reflect.factory.QueryFactory"));
        setField(factoryImpl, "query", queryFactory);
        setField(ctStatementListImpl, "factory", factoryImpl);
        
        ctStatementListImpl.insertAfter(((Filter) null), ((CtStatementList) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetStatement1() throws Throwable  {
        CtStatementListImpl ctStatementListImpl = new CtStatementListImpl();
        
        ctStatementListImpl.getStatement(0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetStatement2() throws Throwable  {
        CtStatementListImpl ctStatementListImpl = ((CtStatementListImpl) createInstance("spoon.support.reflect.code.CtStatementListImpl"));
        ArrayList arrayList = new ArrayList();
        setField(ctStatementListImpl, "statements", arrayList);
        
        ctStatementListImpl.getStatement(0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetLastStatement1() throws Throwable  {
        CtStatementListImpl ctStatementListImpl = new CtStatementListImpl();
        
        ctStatementListImpl.getLastStatement();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetLastStatement2() throws Throwable  {
        CtStatementListImpl ctStatementListImpl = ((CtStatementListImpl) createInstance("spoon.support.reflect.code.CtStatementListImpl"));
        ArrayList arrayList = new ArrayList();
        setField(ctStatementListImpl, "statements", arrayList);
        
        ctStatementListImpl.getLastStatement();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testRemoveStatement1() throws Throwable  {
        CtStatementListImpl ctStatementListImpl = new CtStatementListImpl();
        
        ctStatementListImpl.removeStatement(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testInsertEnd1() throws Throwable  {
        CtStatementListImpl ctStatementListImpl = new CtStatementListImpl();
        
        CtStatementList actual = ctStatementListImpl.insertEnd(((CtStatement) null));
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(ctStatementListImpl, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testInsertEnd2() throws Throwable  {
        CtStatementListImpl ctStatementListImpl = new CtStatementListImpl();
        
        ctStatementListImpl.insertEnd(((CtStatementList) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testInsertEnd3() throws Throwable  {
        CtStatementListImpl ctStatementListImpl = ((CtStatementListImpl) createInstance("spoon.support.reflect.code.CtStatementListImpl"));
        
        ctStatementListImpl.insertEnd(((CtStatementList) null));
    }
    ///endregion
    
    
    ///region Errors report for insertEnd
    
    public void testInsertEnd_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // ClassId spoon.support.reflect.code.CtJavaDocImpl$1 does not have canonical name
        // 
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testAddStatement1() throws Throwable  {
        CtStatementListImpl ctStatementListImpl = new CtStatementListImpl();
        
        CtStatementList actual = ctStatementListImpl.addStatement(null);
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(ctStatementListImpl, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testAddStatement2() throws Throwable  {
        CtStatementListImpl ctStatementListImpl = ((CtStatementListImpl) createInstance("spoon.support.reflect.code.CtStatementListImpl"));
        ArrayList arrayList = new ArrayList();
        setField(ctStatementListImpl, "statements", arrayList);
        
        CtStatementList actual = ctStatementListImpl.addStatement(null);
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(ctStatementListImpl, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testAddStatement3() throws Throwable  {
        CtStatementListImpl ctStatementListImpl = new CtStatementListImpl();
        
        CtStatementList actual = ctStatementListImpl.addStatement(0, null);
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(ctStatementListImpl, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testAddStatement4() throws Throwable  {
        CtStatementListImpl ctStatementListImpl = ((CtStatementListImpl) createInstance("spoon.support.reflect.code.CtStatementListImpl"));
        
        CtStatementList actual = ctStatementListImpl.addStatement(0, null);
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(ctStatementListImpl, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetStatements1() throws Throwable  {
        CtStatementListImpl ctStatementListImpl = new CtStatementListImpl();
        
        List actual = ctStatementListImpl.getStatements();
        
        EmptyClearableList expected = ((EmptyClearableList) createInstance("spoon.support.util.EmptyClearableList"));
        setField(expected, "modCount", 0);
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetStatements2() throws Throwable  {
        CtStatementListImpl ctStatementListImpl = ((CtStatementListImpl) createInstance("spoon.support.reflect.code.CtStatementListImpl"));
        ArrayList arrayList = new ArrayList();
        setField(ctStatementListImpl, "statements", arrayList);
        
        List actual = ctStatementListImpl.getStatements();
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(arrayList, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetStatements1() throws Throwable  {
        CtStatementListImpl ctStatementListImpl = new CtStatementListImpl();
        ArrayList arrayList = new ArrayList();
        
        CtStatementList actual = ctStatementListImpl.setStatements(arrayList);
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(ctStatementListImpl, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetStatements2() throws Throwable  {
        CtStatementListImpl ctStatementListImpl = ((CtStatementListImpl) createInstance("spoon.support.reflect.code.CtStatementListImpl"));
        ArrayList arrayList = new ArrayList();
        
        CtStatementList actual = ctStatementListImpl.setStatements(arrayList);
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(ctStatementListImpl, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testInsertBegin1() throws Throwable  {
        CtStatementListImpl ctStatementListImpl = new CtStatementListImpl();
        
        ctStatementListImpl.insertBegin(((CtStatementList) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testInsertBegin2() throws Throwable  {
        CtStatementListImpl ctStatementListImpl = ((CtStatementListImpl) createInstance("spoon.support.reflect.code.CtStatementListImpl"));
        ArrayList arrayList = new ArrayList();
        setField(ctStatementListImpl, "statements", arrayList);
        
        ctStatementListImpl.insertBegin(((CtStatementList) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testInsertBegin3() throws Throwable  {
        CtStatementListImpl ctStatementListImpl = new CtStatementListImpl();
        
        ctStatementListImpl.insertBegin(((CtStatement) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testInsertBegin4() throws Throwable  {
        CtStatementListImpl ctStatementListImpl = ((CtStatementListImpl) createInstance("spoon.support.reflect.code.CtStatementListImpl"));
        ArrayList arrayList = new ArrayList();
        setField(ctStatementListImpl, "statements", arrayList);
        
        ctStatementListImpl.insertBegin(((CtStatement) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testInsertBegin5() throws Throwable  {
        CtStatementListImpl ctStatementListImpl = ((CtStatementListImpl) createInstance("spoon.support.reflect.code.CtStatementListImpl"));
        ArrayList arrayList = new ArrayList();
        setField(ctStatementListImpl, "statements", arrayList);
        CtThrowImpl ctThrowImpl = ((CtThrowImpl) createInstance("spoon.support.reflect.code.CtThrowImpl"));
        
        CtStatementList actual = ctStatementListImpl.insertBegin(ctThrowImpl);
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(ctStatementListImpl, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testEnsureModifiableStatementsList1() throws Throwable  {
        CtStatementListImpl ctStatementListImpl = new CtStatementListImpl();
        
        Class ctStatementListImplClazz = Class.forName("spoon.support.reflect.code.CtStatementListImpl");
        Method ensureModifiableStatementsListMethod = ctStatementListImplClazz.getDeclaredMethod("ensureModifiableStatementsList");
        ensureModifiableStatementsListMethod.setAccessible(true);
        java.lang.Object[] ensureModifiableStatementsListMethodArguments = new java.lang.Object[0];
        ensureModifiableStatementsListMethod.invoke(ctStatementListImpl, ensureModifiableStatementsListMethodArguments);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testEnsureModifiableStatementsList2() throws Throwable  {
        CtStatementListImpl ctStatementListImpl = ((CtStatementListImpl) createInstance("spoon.support.reflect.code.CtStatementListImpl"));
        ArrayList arrayList = new ArrayList();
        setField(ctStatementListImpl, "statements", arrayList);
        
        Class ctStatementListImplClazz = Class.forName("spoon.support.reflect.code.CtStatementListImpl");
        Method ensureModifiableStatementsListMethod = ctStatementListImplClazz.getDeclaredMethod("ensureModifiableStatementsList");
        ensureModifiableStatementsListMethod.setAccessible(true);
        java.lang.Object[] ensureModifiableStatementsListMethodArguments = new java.lang.Object[0];
        ensureModifiableStatementsListMethod.invoke(ctStatementListImpl, ensureModifiableStatementsListMethodArguments);
    }
    ///endregion
    
    
    ///region Errors report for getSubstitution
    
    public void testGetSubstitution_errors()
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
    public void testGetSubstitution2() throws Throwable  {
        CtStatementListImpl ctStatementListImpl = ((CtStatementListImpl) createInstance("spoon.support.reflect.code.CtStatementListImpl"));
        setField(ctStatementListImpl, "factory", null);
        
        ctStatementListImpl.getSubstitution(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetSubstitution3() throws Throwable  {
        CtStatementListImpl ctStatementListImpl = ((CtStatementListImpl) createInstance("spoon.support.reflect.code.CtStatementListImpl"));
        FactoryImpl factoryImpl = ((FactoryImpl) createInstance("spoon.reflect.factory.FactoryImpl"));
        DefaultCoreFactory defaultCoreFactory = ((DefaultCoreFactory) createInstance("spoon.support.DefaultCoreFactory"));
        setField(factoryImpl, "core", defaultCoreFactory);
        setField(ctStatementListImpl, "factory", factoryImpl);
        
        ctStatementListImpl.getSubstitution(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetSubstitution4() throws Throwable  {
        CtStatementListImpl ctStatementListImpl = ((CtStatementListImpl) createInstance("spoon.support.reflect.code.CtStatementListImpl"));
        FactoryImpl factoryImpl = ((FactoryImpl) createInstance("spoon.reflect.factory.FactoryImpl"));
        setField(factoryImpl, "core", null);
        setField(ctStatementListImpl, "factory", factoryImpl);
        
        Object ctStatementListImplFactory = getFieldValue(ctStatementListImpl, "factory");
        Object initialCtStatementListImplFactoryCore = getFieldValue(ctStatementListImplFactory, "core");
        
        ctStatementListImpl.getSubstitution(null);
        
        Object ctStatementListImplFactory1 = getFieldValue(ctStatementListImpl, "factory");
        Object finalCtStatementListImplFactoryCore = getFieldValue(ctStatementListImplFactory1, "core");
        
        assertFalse(initialCtStatementListImplFactoryCore == finalCtStatementListImplFactoryCore);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCtStatementListImpl1() {
        CtStatementListImpl actual = new CtStatementListImpl();
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
