package com.google.common.base;

import org.junit.Test;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.util.Objects;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import sun.misc.Unsafe;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class CaseFormatTest {
    
    ///region Errors report for to
    
    public void testTo_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // ClassId com.google.common.base.CaseFormat$3 does not have canonical name
        // 
    }
    ///endregion
    
    
    ///region Errors report for to
    
    public void testTo_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // ClassId com.google.common.base.CaseFormat$3 does not have canonical name
        // 
    }
    ///endregion
    
    
    ///region Errors report for normalizeFirstWord
    
    public void testNormalizeFirstWord_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // ClassId com.google.common.base.CaseFormat$3 does not have canonical name
        // 
    }
    ///endregion
    
    
    ///region Errors report for converterTo
    
    public void testConverterTo_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // ClassId com.google.common.base.CaseFormat$3 does not have canonical name
        // 
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testFirstCharOnlyToUpper1() throws Throwable  {
        String string = new String();
        
        Class caseFormatClazz = Class.forName("com.google.common.base.CaseFormat");
        Class stringType = Class.forName("java.lang.String");
        Method firstCharOnlyToUpperMethod = caseFormatClazz.getDeclaredMethod("firstCharOnlyToUpper", stringType);
        firstCharOnlyToUpperMethod.setAccessible(true);
        java.lang.Object[] firstCharOnlyToUpperMethodArguments = new java.lang.Object[1];
        firstCharOnlyToUpperMethodArguments[0] = string;
        String actual = ((String) firstCharOnlyToUpperMethod.invoke(null, firstCharOnlyToUpperMethodArguments));
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(string, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testFirstCharOnlyToUpper2() throws Throwable  {
        Class caseFormatClazz = Class.forName("com.google.common.base.CaseFormat");
        Class stringType = Class.forName("java.lang.String");
        Method firstCharOnlyToUpperMethod = caseFormatClazz.getDeclaredMethod("firstCharOnlyToUpper", stringType);
        firstCharOnlyToUpperMethod.setAccessible(true);
        java.lang.Object[] firstCharOnlyToUpperMethodArguments = new java.lang.Object[1];
        firstCharOnlyToUpperMethodArguments[0] = null;
        try {
            firstCharOnlyToUpperMethod.invoke(null, firstCharOnlyToUpperMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testFirstCharOnlyToUpper3() throws Throwable  {
        String string = new String("");
        
        Class caseFormatClazz = Class.forName("com.google.common.base.CaseFormat");
        Class stringType = Class.forName("java.lang.String");
        Method firstCharOnlyToUpperMethod = caseFormatClazz.getDeclaredMethod("firstCharOnlyToUpper", stringType);
        firstCharOnlyToUpperMethod.setAccessible(true);
        java.lang.Object[] firstCharOnlyToUpperMethodArguments = new java.lang.Object[1];
        firstCharOnlyToUpperMethodArguments[0] = string;
        String actual = ((String) firstCharOnlyToUpperMethod.invoke(null, firstCharOnlyToUpperMethodArguments));
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(string, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testFirstCharOnlyToUpper4() throws Throwable  {
        String string = new String("{\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        
        Class caseFormatClazz = Class.forName("com.google.common.base.CaseFormat");
        Class stringType = Class.forName("java.lang.String");
        Method firstCharOnlyToUpperMethod = caseFormatClazz.getDeclaredMethod("firstCharOnlyToUpper", stringType);
        firstCharOnlyToUpperMethod.setAccessible(true);
        java.lang.Object[] firstCharOnlyToUpperMethodArguments = new java.lang.Object[1];
        firstCharOnlyToUpperMethodArguments[0] = string;
        String actual = ((String) firstCharOnlyToUpperMethod.invoke(null, firstCharOnlyToUpperMethodArguments));
        
        String expected = new String("{\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testValueOf1() throws Throwable  {
        String string = new String();
        
        CaseFormat.valueOf(string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testValueOf2() throws Throwable  {
        CaseFormat.valueOf(null);
    }
    ///endregion
    
    
    ///region Errors report for values
    
    public void testValues_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // ClassId com.google.common.base.CaseFormat$1 does not have canonical name
        // 
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCaseFormat1() throws Throwable  {
        String string = new String("");
        Object isEither = createInstance("com.google.common.base.CharMatcher$IsEither");
        String string1 = new String("");
        Class caseFormatClazz = Class.forName("com.google.common.base.CaseFormat");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Class isEitherType = Class.forName("com.google.common.base.CharMatcher");
        Constructor caseFormatConstructor = caseFormatClazz.getDeclaredConstructor(stringType, intType, isEitherType, stringType);
        caseFormatConstructor.setAccessible(true);
        java.lang.Object[] caseFormatConstructorArguments = new java.lang.Object[4];
        caseFormatConstructorArguments[0] = string;
        caseFormatConstructorArguments[1] = 0;
        caseFormatConstructorArguments[2] = isEither;
        caseFormatConstructorArguments[3] = string1;
        CaseFormat actual = ((CaseFormat) caseFormatConstructor.newInstance(caseFormatConstructorArguments));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testEquals1() throws Throwable  {
        Object stringConverter = createInstance("com.google.common.base.CaseFormat$StringConverter");
        Object object = new Object();
        
        Class stringConverterClazz = Class.forName("com.google.common.base.CaseFormat$StringConverter");
        Class objectType = Class.forName("java.lang.Object");
        Method equalsMethod = stringConverterClazz.getDeclaredMethod("equals", objectType);
        equalsMethod.setAccessible(true);
        java.lang.Object[] equalsMethodArguments = new java.lang.Object[1];
        equalsMethodArguments[0] = object;
        boolean actual = ((boolean) equalsMethod.invoke(stringConverter, equalsMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testEquals2() throws Throwable  {
        Object stringConverter = createInstance("com.google.common.base.CaseFormat$StringConverter");
        
        Class stringConverterClazz = Class.forName("com.google.common.base.CaseFormat$StringConverter");
        Class objectType = Class.forName("java.lang.Object");
        Method equalsMethod = stringConverterClazz.getDeclaredMethod("equals", objectType);
        equalsMethod.setAccessible(true);
        java.lang.Object[] equalsMethodArguments = new java.lang.Object[1];
        equalsMethodArguments[0] = null;
        boolean actual = ((boolean) equalsMethod.invoke(stringConverter, equalsMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    
    ///region Errors report for equals
    
    public void testEquals_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // ClassId com.google.common.base.CaseFormat$3 does not have canonical name
        // 
    }
    ///endregion
    
    
    ///region Errors report for equals
    
    public void testEquals_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // ClassId com.google.common.base.CaseFormat$3 does not have canonical name
        // 
    }
    ///endregion
    
    
    ///region Errors report for equals
    
    public void testEquals_errors2()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // ClassId com.google.common.base.CaseFormat$3 does not have canonical name
        // 
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testHashCode1() throws Throwable  {
        Object stringConverter = createInstance("com.google.common.base.CaseFormat$StringConverter");
        
        Class stringConverterClazz = Class.forName("com.google.common.base.CaseFormat$StringConverter");
        Method hashCodeMethod = stringConverterClazz.getDeclaredMethod("hashCode");
        hashCodeMethod.setAccessible(true);
        java.lang.Object[] hashCodeMethodArguments = new java.lang.Object[0];
        try {
            hashCodeMethod.invoke(stringConverter, hashCodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    
    ///region Errors report for hashCode
    
    public void testHashCode_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // ClassId com.google.common.base.CaseFormat$3 does not have canonical name
        // 
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testToString1() throws Throwable  {
        Object stringConverter = createInstance("com.google.common.base.CaseFormat$StringConverter");
        
        Class stringConverterClazz = Class.forName("com.google.common.base.CaseFormat$StringConverter");
        Method toStringMethod = stringConverterClazz.getDeclaredMethod("toString");
        toStringMethod.setAccessible(true);
        java.lang.Object[] toStringMethodArguments = new java.lang.Object[0];
        String actual = ((String) toStringMethod.invoke(stringConverter, toStringMethodArguments));
        
        String expected = new String("null.converterTo(null)");
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    
    ///region Errors report for toString
    
    public void testToString_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // ClassId com.google.common.base.CaseFormat$4 does not have canonical name
        // 
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDoForward1() throws Throwable  {
        Object stringConverter = createInstance("com.google.common.base.CaseFormat$StringConverter");
        String string = new String();
        
        Class stringConverterClazz = Class.forName("com.google.common.base.CaseFormat$StringConverter");
        Class stringType = Class.forName("java.lang.String");
        Method doForwardMethod = stringConverterClazz.getDeclaredMethod("doForward", stringType);
        doForwardMethod.setAccessible(true);
        java.lang.Object[] doForwardMethodArguments = new java.lang.Object[1];
        doForwardMethodArguments[0] = string;
        try {
            doForwardMethod.invoke(stringConverter, doForwardMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    
    ///region Errors report for doForward
    
    public void testDoForward_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // ClassId com.google.common.base.CaseFormat$4 does not have canonical name
        // 
    }
    ///endregion
    
    
    ///region Errors report for doForward
    
    public void testDoForward_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // ClassId com.google.common.base.CaseFormat$5 does not have canonical name
        // 
    }
    ///endregion
    
    
    ///region Errors report for doForward
    
    public void testDoForward_errors2()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // ClassId com.google.common.base.CaseFormat$5 does not have canonical name
        // 
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDoBackward1() throws Throwable  {
        Object stringConverter = createInstance("com.google.common.base.CaseFormat$StringConverter");
        String string = new String();
        
        Class stringConverterClazz = Class.forName("com.google.common.base.CaseFormat$StringConverter");
        Class stringType = Class.forName("java.lang.String");
        Method doBackwardMethod = stringConverterClazz.getDeclaredMethod("doBackward", stringType);
        doBackwardMethod.setAccessible(true);
        java.lang.Object[] doBackwardMethodArguments = new java.lang.Object[1];
        doBackwardMethodArguments[0] = string;
        try {
            doBackwardMethod.invoke(stringConverter, doBackwardMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    
    ///region Errors report for doBackward
    
    public void testDoBackward_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // ClassId com.google.common.base.CaseFormat$3 does not have canonical name
        // 
    }
    ///endregion
    
    
    ///region Errors report for doBackward
    
    public void testDoBackward_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // ClassId com.google.common.base.CaseFormat$4 does not have canonical name
        // 
    }
    ///endregion
    
    
    ///region Errors report for doBackward
    
    public void testDoBackward_errors2()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // ClassId com.google.common.base.CaseFormat$5 does not have canonical name
        // 
    }
    ///endregion
    
    
    ///region Errors report for <init>
    
    public void testStringConverter_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // ClassId com.google.common.base.CaseFormat$3 does not have canonical name
        // 
    }
    ///endregion
    
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
    private static Object createInstance(String className) throws Exception {
        Class<?> clazz = Class.forName(className);
        return getUnsafeInstance().allocateInstance(clazz);
    }
    private static sun.misc.Unsafe getUnsafeInstance() throws Exception {
        java.lang.reflect.Field f = sun.misc.Unsafe.class.getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return (sun.misc.Unsafe) f.get(null);
    }
}
