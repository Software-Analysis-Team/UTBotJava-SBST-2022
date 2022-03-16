package spoon.pattern.internal.node;

import org.junit.Test;
import java.util.function.BiConsumer;
import spoon.pattern.internal.DefaultGenerator;
import spoon.support.util.ImmutableMapImpl;
import spoon.pattern.internal.PatternPrinter;
import spoon.pattern.internal.ResultHolder.Single;
import spoon.pattern.internal.ResultHolder;
import java.util.Collections;
import java.lang.reflect.Method;
import java.util.ArrayList;
import spoon.pattern.Quantifier;
import spoon.pattern.internal.parameter.ListParameterInfo;
import spoon.pattern.internal.parameter.MapParameterInfo;
import spoon.reflect.meta.ContainerKind;
import spoon.reflect.declaration.CtElement;
import java.lang.reflect.Constructor;
import spoon.pattern.internal.node.MapEntryNode;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Map;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import sun.misc.Unsafe;

import static org.mockito.Mockito.mock;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;

public class MapEntryNodeTest {
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testForEachParameterInfo1() throws Throwable  {
        MapEntryNode mapEntryNode = ((MapEntryNode) createInstance("spoon.pattern.internal.node.MapEntryNode"));
        
        mapEntryNode.forEachParameterInfo(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testForEachParameterInfo2() throws Throwable  {
        MapEntryNode mapEntryNode = ((MapEntryNode) createInstance("spoon.pattern.internal.node.MapEntryNode"));
        setField(mapEntryNode, "key", null);
        BiConsumer biConsumerMock = mock(BiConsumer.class);
        
        mapEntryNode.forEachParameterInfo(biConsumerMock);
        
        BiConsumer finalBiConsumerMock = biConsumerMock;
        
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testForEachParameterInfo3() throws Throwable  {
        MapEntryNode mapEntryNode = ((MapEntryNode) createInstance("spoon.pattern.internal.node.MapEntryNode"));
        SwitchNode switchNode = ((SwitchNode) createInstance("spoon.pattern.internal.node.SwitchNode"));
        setField(mapEntryNode, "key", switchNode);
        
        mapEntryNode.forEachParameterInfo(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGenerateTargets1() throws Throwable  {
        MapEntryNode mapEntryNode = ((MapEntryNode) createInstance("spoon.pattern.internal.node.MapEntryNode"));
        DefaultGenerator defaultGenerator = ((DefaultGenerator) createInstance("spoon.pattern.internal.DefaultGenerator"));
        
        mapEntryNode.generateTargets(defaultGenerator, null, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGenerateTargets2() throws Throwable  {
        MapEntryNode mapEntryNode = ((MapEntryNode) createInstance("spoon.pattern.internal.node.MapEntryNode"));
        setField(mapEntryNode, "key", null);
        ImmutableMapImpl immutableMapImpl = ((ImmutableMapImpl) createInstance("spoon.support.util.ImmutableMapImpl"));
        
        mapEntryNode.generateTargets(null, null, immutableMapImpl);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGenerateTargets3() throws Throwable  {
        MapEntryNode mapEntryNode = ((MapEntryNode) createInstance("spoon.pattern.internal.node.MapEntryNode"));
        ConstantNode constantNode = ((ConstantNode) createInstance("spoon.pattern.internal.node.ConstantNode"));
        setField(mapEntryNode, "key", constantNode);
        PatternPrinter patternPrinter = ((PatternPrinter) createInstance("spoon.pattern.internal.PatternPrinter"));
        ResultHolder.Single single = ((ResultHolder.Single) createInstance("spoon.pattern.internal.ResultHolder$Single"));
        setField(single, "requiredClass", null);
        Collections collections = ((Collections) createInstance("java.util.Collections"));
        setField(single, "result", collections);
        ImmutableMapImpl immutableMapImpl = ((ImmutableMapImpl) createInstance("spoon.support.util.ImmutableMapImpl"));
        
        mapEntryNode.generateTargets(patternPrinter, single, immutableMapImpl);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReplaceNode1() throws Throwable  {
        MapEntryNode mapEntryNode = ((MapEntryNode) createInstance("spoon.pattern.internal.node.MapEntryNode"));
        
        boolean actual = mapEntryNode.replaceNode(null, null);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReplaceNode2() throws Throwable  {
        MapEntryNode mapEntryNode = ((MapEntryNode) createInstance("spoon.pattern.internal.node.MapEntryNode"));
        setField(mapEntryNode, "key", null);
        
        boolean actual = mapEntryNode.replaceNode(null, null);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReplaceNode3() throws Throwable  {
        MapEntryNode mapEntryNode = ((MapEntryNode) createInstance("spoon.pattern.internal.node.MapEntryNode"));
        setField(mapEntryNode, "value", null);
        ParameterNode parameterNode = ((ParameterNode) createInstance("spoon.pattern.internal.node.ParameterNode"));
        setField(mapEntryNode, "key", parameterNode);
        
        boolean actual = mapEntryNode.replaceNode(null, null);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReplaceNode4() throws Throwable  {
        MapEntryNode mapEntryNode = ((MapEntryNode) createInstance("spoon.pattern.internal.node.MapEntryNode"));
        setField(mapEntryNode, "value", null);
        setField(mapEntryNode, "key", null);
        Object caseNode = createInstance("spoon.pattern.internal.node.SwitchNode$CaseNode");
        
        Class mapEntryNodeClazz = Class.forName("spoon.pattern.internal.node.MapEntryNode");
        Class caseNodeType = Class.forName("spoon.pattern.internal.node.RootNode");
        Method replaceNodeMethod = mapEntryNodeClazz.getDeclaredMethod("replaceNode", caseNodeType, caseNodeType);
        replaceNodeMethod.setAccessible(true);
        java.lang.Object[] replaceNodeMethodArguments = new java.lang.Object[2];
        replaceNodeMethodArguments[0] = caseNode;
        replaceNodeMethodArguments[1] = null;
        try {
            replaceNodeMethod.invoke(mapEntryNode, replaceNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReplaceNode5() throws Throwable  {
        MapEntryNode mapEntryNode = ((MapEntryNode) createInstance("spoon.pattern.internal.node.MapEntryNode"));
        ParameterNode parameterNode = ((ParameterNode) createInstance("spoon.pattern.internal.node.ParameterNode"));
        setField(mapEntryNode, "value", parameterNode);
        SwitchNode switchNode = ((SwitchNode) createInstance("spoon.pattern.internal.node.SwitchNode"));
        ArrayList arrayList = new ArrayList();
        setField(switchNode, "cases", arrayList);
        setField(mapEntryNode, "key", switchNode);
        
        boolean actual = mapEntryNode.replaceNode(null, null);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetMatchingStrategy1() throws Throwable  {
        MapEntryNode mapEntryNode = ((MapEntryNode) createInstance("spoon.pattern.internal.node.MapEntryNode"));
        
        Quantifier actual = mapEntryNode.getMatchingStrategy();
        
        Quantifier expected = Quantifier.POSSESSIVE;
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetMatchingStrategy2() throws Throwable  {
        MapEntryNode mapEntryNode = ((MapEntryNode) createInstance("spoon.pattern.internal.node.MapEntryNode"));
        ParameterNode parameterNode = ((ParameterNode) createInstance("spoon.pattern.internal.node.ParameterNode"));
        ListParameterInfo listParameterInfo = ((ListParameterInfo) createInstance("spoon.pattern.internal.parameter.ListParameterInfo"));
        setField(listParameterInfo, "matchingStrategy", null);
        setField(parameterNode, "parameterInfo", listParameterInfo);
        setField(mapEntryNode, "key", parameterNode);
        
        Quantifier actual = mapEntryNode.getMatchingStrategy();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetMatchingStrategy3() throws Throwable  {
        MapEntryNode mapEntryNode = ((MapEntryNode) createInstance("spoon.pattern.internal.node.MapEntryNode"));
        setField(mapEntryNode, "key", null);
        
        Quantifier actual = mapEntryNode.getMatchingStrategy();
        
        Quantifier expected = Quantifier.POSSESSIVE;
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIsTryNextMatch1() throws Throwable  {
        MapEntryNode mapEntryNode = ((MapEntryNode) createInstance("spoon.pattern.internal.node.MapEntryNode"));
        
        boolean actual = mapEntryNode.isTryNextMatch(null);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIsTryNextMatch2() throws Throwable  {
        MapEntryNode mapEntryNode = ((MapEntryNode) createInstance("spoon.pattern.internal.node.MapEntryNode"));
        setField(mapEntryNode, "key", null);
        
        boolean actual = mapEntryNode.isTryNextMatch(null);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testIsTryNextMatch3() throws Throwable  {
        MapEntryNode mapEntryNode = ((MapEntryNode) createInstance("spoon.pattern.internal.node.MapEntryNode"));
        ParameterNode parameterNode = ((ParameterNode) createInstance("spoon.pattern.internal.node.ParameterNode"));
        MapParameterInfo mapParameterInfo = ((MapParameterInfo) createInstance("spoon.pattern.internal.parameter.MapParameterInfo"));
        setField(mapParameterInfo, "containerKind", null);
        setField(parameterNode, "parameterInfo", mapParameterInfo);
        setField(mapEntryNode, "key", parameterNode);
        
        mapEntryNode.isTryNextMatch(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testIsTryNextMatch4() throws Throwable  {
        MapEntryNode mapEntryNode = ((MapEntryNode) createInstance("spoon.pattern.internal.node.MapEntryNode"));
        ParameterNode parameterNode = ((ParameterNode) createInstance("spoon.pattern.internal.node.ParameterNode"));
        MapParameterInfo mapParameterInfo = ((MapParameterInfo) createInstance("spoon.pattern.internal.parameter.MapParameterInfo"));
        ContainerKind containerKind = ContainerKind.SINGLE;
        setField(mapParameterInfo, "containerKind", containerKind);
        setField(parameterNode, "parameterInfo", mapParameterInfo);
        setField(mapEntryNode, "key", parameterNode);
        
        mapEntryNode.isTryNextMatch(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testMatchTarget1() throws Throwable  {
        MapEntryNode mapEntryNode = ((MapEntryNode) createInstance("spoon.pattern.internal.node.MapEntryNode"));
        Object object = new Object();
        
        mapEntryNode.matchTarget(object, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testMatchTarget2() throws Throwable  {
        MapEntryNode mapEntryNode = ((MapEntryNode) createInstance("spoon.pattern.internal.node.MapEntryNode"));
        
        mapEntryNode.matchTarget(null, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testMatchTarget3() throws Throwable  {
        MapEntryNode mapEntryNode = ((MapEntryNode) createInstance("spoon.pattern.internal.node.MapEntryNode"));
        setField(mapEntryNode, "key", null);
        Object treeNode = createInstance("java.util.HashMap$TreeNode");
        
        mapEntryNode.matchTarget(treeNode, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetValue1() throws Throwable  {
        MapEntryNode mapEntryNode = ((MapEntryNode) createInstance("spoon.pattern.internal.node.MapEntryNode"));
        
        RootNode actual = mapEntryNode.getValue();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetValue2() throws Throwable  {
        MapEntryNode mapEntryNode = ((MapEntryNode) createInstance("spoon.pattern.internal.node.MapEntryNode"));
        setField(mapEntryNode, "value", null);
        
        RootNode actual = mapEntryNode.getValue();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetKey1() throws Throwable  {
        MapEntryNode mapEntryNode = ((MapEntryNode) createInstance("spoon.pattern.internal.node.MapEntryNode"));
        
        RootNode actual = mapEntryNode.getKey();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetKey2() throws Throwable  {
        MapEntryNode mapEntryNode = ((MapEntryNode) createInstance("spoon.pattern.internal.node.MapEntryNode"));
        setField(mapEntryNode, "key", null);
        
        RootNode actual = mapEntryNode.getKey();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testMapEntryNode1() {
        MapEntryNode actual = new MapEntryNode(null, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testMapEntryNode2() {
        MapEntryNode actual = new MapEntryNode(null, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetValue1() throws Throwable  {
        Object entry = createInstance("spoon.pattern.internal.node.MapEntryNode$Entry");
        
        Class entryClazz = Class.forName("spoon.pattern.internal.node.MapEntryNode$Entry");
        Class ctElementType = Class.forName("spoon.reflect.declaration.CtElement");
        Method setValueMethod = entryClazz.getDeclaredMethod("setValue", ctElementType);
        setValueMethod.setAccessible(true);
        java.lang.Object[] setValueMethodArguments = new java.lang.Object[1];
        setValueMethodArguments[0] = null;
        CtElement actual = ((CtElement) setValueMethod.invoke(entry, setValueMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetValue2() throws Throwable  {
        Object entry = createInstance("spoon.pattern.internal.node.MapEntryNode$Entry");
        setField(entry, "value", null);
        
        Class entryClazz = Class.forName("spoon.pattern.internal.node.MapEntryNode$Entry");
        Class ctElementType = Class.forName("spoon.reflect.declaration.CtElement");
        Method setValueMethod = entryClazz.getDeclaredMethod("setValue", ctElementType);
        setValueMethod.setAccessible(true);
        java.lang.Object[] setValueMethodArguments = new java.lang.Object[1];
        setValueMethodArguments[0] = null;
        CtElement actual = ((CtElement) setValueMethod.invoke(entry, setValueMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetKey3() throws Throwable  {
        Object entry = createInstance("spoon.pattern.internal.node.MapEntryNode$Entry");
        
        Class entryClazz = Class.forName("spoon.pattern.internal.node.MapEntryNode$Entry");
        Method getKeyMethod = entryClazz.getDeclaredMethod("getKey");
        getKeyMethod.setAccessible(true);
        java.lang.Object[] getKeyMethodArguments = new java.lang.Object[0];
        String actual = ((String) getKeyMethod.invoke(entry, getKeyMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetKey4() throws Throwable  {
        Object entry = createInstance("spoon.pattern.internal.node.MapEntryNode$Entry");
        String string = new String("");
        setField(entry, "key", string);
        
        Class entryClazz = Class.forName("spoon.pattern.internal.node.MapEntryNode$Entry");
        Method getKeyMethod = entryClazz.getDeclaredMethod("getKey");
        getKeyMethod.setAccessible(true);
        java.lang.Object[] getKeyMethodArguments = new java.lang.Object[0];
        String actual = ((String) getKeyMethod.invoke(entry, getKeyMethodArguments));
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(string, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetValue3() throws Throwable  {
        Object entry = createInstance("spoon.pattern.internal.node.MapEntryNode$Entry");
        
        Class entryClazz = Class.forName("spoon.pattern.internal.node.MapEntryNode$Entry");
        Method getValueMethod = entryClazz.getDeclaredMethod("getValue");
        getValueMethod.setAccessible(true);
        java.lang.Object[] getValueMethodArguments = new java.lang.Object[0];
        CtElement actual = ((CtElement) getValueMethod.invoke(entry, getValueMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetValue4() throws Throwable  {
        Object entry = createInstance("spoon.pattern.internal.node.MapEntryNode$Entry");
        setField(entry, "value", null);
        
        Class entryClazz = Class.forName("spoon.pattern.internal.node.MapEntryNode$Entry");
        Method getValueMethod = entryClazz.getDeclaredMethod("getValue");
        getValueMethod.setAccessible(true);
        java.lang.Object[] getValueMethodArguments = new java.lang.Object[0];
        CtElement actual = ((CtElement) getValueMethod.invoke(entry, getValueMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testEntry1() throws Throwable  {
        String string = new String();
        Class entryClazz = Class.forName("spoon.pattern.internal.node.MapEntryNode$Entry");
        Class stringType = Class.forName("java.lang.String");
        Class ctElementType = Class.forName("spoon.reflect.declaration.CtElement");
        Constructor entryConstructor = entryClazz.getDeclaredConstructor(stringType, ctElementType);
        entryConstructor.setAccessible(true);
        java.lang.Object[] entryConstructorArguments = new java.lang.Object[2];
        entryConstructorArguments[0] = string;
        entryConstructorArguments[1] = null;
        Object actual = entryConstructor.newInstance(entryConstructorArguments);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testEntry2() throws Throwable  {
        String string = new String("");
        Class entryClazz = Class.forName("spoon.pattern.internal.node.MapEntryNode$Entry");
        Class stringType = Class.forName("java.lang.String");
        Class ctElementType = Class.forName("spoon.reflect.declaration.CtElement");
        Constructor entryConstructor = entryClazz.getDeclaredConstructor(stringType, ctElementType);
        entryConstructor.setAccessible(true);
        java.lang.Object[] entryConstructorArguments = new java.lang.Object[2];
        entryConstructorArguments[0] = string;
        entryConstructorArguments[1] = null;
        Object actual = entryConstructor.newInstance(entryConstructorArguments);
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
    private static sun.misc.Unsafe getUnsafeInstance() throws Exception {
        java.lang.reflect.Field f = sun.misc.Unsafe.class.getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return (sun.misc.Unsafe) f.get(null);
    }
}
