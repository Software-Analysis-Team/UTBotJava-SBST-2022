package spoon.support.reflect;

import org.junit.Test;
import sun.awt.image.PixelConverter.Ushort565Rgb;
import sun.awt.image.PixelConverter;
import spoon.reflect.declaration.ModifierKind;
import spoon.reflect.cu.SourcePosition;
import spoon.reflect.cu.position.NoSourcePosition;
import spoon.support.reflect.cu.position.BodyHolderSourcePositionImpl;
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
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class CtExtendedModifierTest {
    ///region
    
    @Test(timeout = 10000)
    public void testEquals1() throws Throwable  {
        CtExtendedModifier ctExtendedModifier = ((CtExtendedModifier) createInstance("spoon.support.reflect.CtExtendedModifier"));
        Object object = new Object();
        
        boolean actual = ctExtendedModifier.equals(object);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testEquals2() throws Throwable  {
        CtExtendedModifier ctExtendedModifier = ((CtExtendedModifier) createInstance("spoon.support.reflect.CtExtendedModifier"));
        
        boolean actual = ctExtendedModifier.equals(ctExtendedModifier);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testEquals3() throws Throwable  {
        CtExtendedModifier ctExtendedModifier = ((CtExtendedModifier) createInstance("spoon.support.reflect.CtExtendedModifier"));
        
        boolean actual = ctExtendedModifier.equals(null);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testEquals4() throws Throwable  {
        CtExtendedModifier ctExtendedModifier = ((CtExtendedModifier) createInstance("spoon.support.reflect.CtExtendedModifier"));
        sun.awt.image.PixelConverter.Ushort565Rgb[] ushort565RgbArray = new sun.awt.image.PixelConverter.Ushort565Rgb[0];
        
        boolean actual = ctExtendedModifier.equals(ushort565RgbArray);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testHashCode1() throws Throwable  {
        CtExtendedModifier ctExtendedModifier = ((CtExtendedModifier) createInstance("spoon.support.reflect.CtExtendedModifier"));
        
        int actual = ctExtendedModifier.hashCode();
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testHashCode2() throws Throwable  {
        CtExtendedModifier ctExtendedModifier = ((CtExtendedModifier) createInstance("spoon.support.reflect.CtExtendedModifier"));
        setField(ctExtendedModifier, "kind", null);
        setField(ctExtendedModifier, "implicit", false);
        
        int actual = ctExtendedModifier.hashCode();
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testHashCode3() throws Throwable  {
        CtExtendedModifier ctExtendedModifier = ((CtExtendedModifier) createInstance("spoon.support.reflect.CtExtendedModifier"));
        setField(ctExtendedModifier, "kind", null);
        setField(ctExtendedModifier, "implicit", true);
        
        int actual = ctExtendedModifier.hashCode();
        
        assertEquals(31, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testHashCode4() throws Throwable  {
        CtExtendedModifier ctExtendedModifier = ((CtExtendedModifier) createInstance("spoon.support.reflect.CtExtendedModifier"));
        ModifierKind modifierKind = ModifierKind.PUBLIC;
        setField(ctExtendedModifier, "kind", modifierKind);
        setField(ctExtendedModifier, "implicit", true);
        
        int actual = ctExtendedModifier.hashCode();
        
        assertEquals(505662502, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetPosition1() throws Throwable  {
        CtExtendedModifier ctExtendedModifier = ((CtExtendedModifier) createInstance("spoon.support.reflect.CtExtendedModifier"));
        
        SourcePosition actual = ctExtendedModifier.getPosition();
        
        NoSourcePosition expected = ((NoSourcePosition) createInstance("spoon.reflect.cu.position.NoSourcePosition"));
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetPosition2() throws Throwable  {
        CtExtendedModifier ctExtendedModifier = ((CtExtendedModifier) createInstance("spoon.support.reflect.CtExtendedModifier"));
        BodyHolderSourcePositionImpl bodyHolderSourcePositionImpl = ((BodyHolderSourcePositionImpl) createInstance("spoon.support.reflect.cu.position.BodyHolderSourcePositionImpl"));
        setField(ctExtendedModifier, "position", bodyHolderSourcePositionImpl);
        
        SourcePosition actual = ctExtendedModifier.getPosition();
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(bodyHolderSourcePositionImpl, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetPosition3() throws Throwable  {
        CtExtendedModifier ctExtendedModifier = ((CtExtendedModifier) createInstance("spoon.support.reflect.CtExtendedModifier"));
        setField(ctExtendedModifier, "position", null);
        
        SourcePosition actual = ctExtendedModifier.getPosition();
        
        NoSourcePosition expected = ((NoSourcePosition) createInstance("spoon.reflect.cu.position.NoSourcePosition"));
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetKind1() throws Throwable  {
        CtExtendedModifier ctExtendedModifier = ((CtExtendedModifier) createInstance("spoon.support.reflect.CtExtendedModifier"));
        
        ModifierKind actual = ctExtendedModifier.getKind();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetKind2() throws Throwable  {
        CtExtendedModifier ctExtendedModifier = ((CtExtendedModifier) createInstance("spoon.support.reflect.CtExtendedModifier"));
        setField(ctExtendedModifier, "kind", null);
        
        ModifierKind actual = ctExtendedModifier.getKind();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetKind1() throws Throwable  {
        CtExtendedModifier ctExtendedModifier = ((CtExtendedModifier) createInstance("spoon.support.reflect.CtExtendedModifier"));
        setField(ctExtendedModifier, "kind", null);
        
        ctExtendedModifier.setKind(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetImplicit1() throws Throwable  {
        CtExtendedModifier ctExtendedModifier = ((CtExtendedModifier) createInstance("spoon.support.reflect.CtExtendedModifier"));
        
        ctExtendedModifier.setImplicit(false);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetImplicit2() throws Throwable  {
        CtExtendedModifier ctExtendedModifier = ((CtExtendedModifier) createInstance("spoon.support.reflect.CtExtendedModifier"));
        setField(ctExtendedModifier, "implicit", false);
        
        ctExtendedModifier.setImplicit(false);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetPosition1() throws Throwable  {
        CtExtendedModifier ctExtendedModifier = ((CtExtendedModifier) createInstance("spoon.support.reflect.CtExtendedModifier"));
        
        ctExtendedModifier.setPosition(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetPosition2() throws Throwable  {
        CtExtendedModifier ctExtendedModifier = ((CtExtendedModifier) createInstance("spoon.support.reflect.CtExtendedModifier"));
        setField(ctExtendedModifier, "position", null);
        
        ctExtendedModifier.setPosition(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIsImplicit1() throws Throwable  {
        CtExtendedModifier ctExtendedModifier = ((CtExtendedModifier) createInstance("spoon.support.reflect.CtExtendedModifier"));
        
        boolean actual = ctExtendedModifier.isImplicit();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIsImplicit2() throws Throwable  {
        CtExtendedModifier ctExtendedModifier = ((CtExtendedModifier) createInstance("spoon.support.reflect.CtExtendedModifier"));
        setField(ctExtendedModifier, "implicit", false);
        
        boolean actual = ctExtendedModifier.isImplicit();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCtExtendedModifier1() {
        CtExtendedModifier actual = new CtExtendedModifier(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCtExtendedModifier2() {
        CtExtendedModifier actual = new CtExtendedModifier(null, false);
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
