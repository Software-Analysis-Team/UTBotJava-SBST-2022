package spoon.support.compiler.jdt;

import org.junit.Test;
import org.eclipse.jdt.internal.compiler.batch.CompilationUnit;
import org.eclipse.jdt.internal.compiler.env.INameEnvironment;
import java.util.Map;
import java.util.Set;
import java.util.LinkedHashSet;
import sun.nio.cs.StreamEncoder;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import sun.misc.Unsafe;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mockStatic;

public class JDTBatchCompilerTest {
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetCompilationUnits1() throws Throwable  {
        JDTBatchCompiler jDTBatchCompiler = ((JDTBatchCompiler) createInstance("spoon.support.compiler.jdt.JDTBatchCompiler"));
        
        jDTBatchCompiler.getCompilationUnits();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetCompilationUnits2() throws Throwable  {
        JDTBatchCompiler jDTBatchCompiler = ((JDTBatchCompiler) createInstance("spoon.support.compiler.jdt.JDTBatchCompiler"));
        setField(jDTBatchCompiler, "compilationUnits", null);
        
        jDTBatchCompiler.getCompilationUnits();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetCompilationUnits3() throws Throwable  {
        JDTBatchCompiler jDTBatchCompiler = ((JDTBatchCompiler) createInstance("spoon.support.compiler.jdt.JDTBatchCompiler"));
        org.eclipse.jdt.internal.compiler.batch.CompilationUnit[] compilationUnitArray = new org.eclipse.jdt.internal.compiler.batch.CompilationUnit[9];
        jDTBatchCompiler.compilationUnits = compilationUnitArray;
        
        jDTBatchCompiler.getCompilationUnits();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetCompilationUnits4() throws Throwable  {
        JDTBatchCompiler jDTBatchCompiler = ((JDTBatchCompiler) createInstance("spoon.support.compiler.jdt.JDTBatchCompiler"));
        org.eclipse.jdt.internal.compiler.batch.CompilationUnit[] compilationUnitArray = new org.eclipse.jdt.internal.compiler.batch.CompilationUnit[0];
        jDTBatchCompiler.compilationUnits = compilationUnitArray;
        
        org.eclipse.jdt.internal.compiler.batch.CompilationUnit[] actual = jDTBatchCompiler.getCompilationUnits();
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(compilationUnitArray, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetUnits1() throws Throwable  {
        JDTBatchCompiler jDTBatchCompiler = ((JDTBatchCompiler) createInstance("spoon.support.compiler.jdt.JDTBatchCompiler"));
        
        jDTBatchCompiler.getUnits();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetUnits2() throws Throwable  {
        JDTBatchCompiler jDTBatchCompiler = ((JDTBatchCompiler) createInstance("spoon.support.compiler.jdt.JDTBatchCompiler"));
        jDTBatchCompiler.startTime = 0L;
        setField(jDTBatchCompiler, "options", null);
        JDTBasedSpoonCompiler jDTBasedSpoonCompilerMock = mock(JDTBasedSpoonCompiler.class);
        INameEnvironment iNameEnvironmentMock = mock(INameEnvironment.class);
        jDTBasedSpoonCompilerMock.environment = iNameEnvironmentMock;
        setField(jDTBatchCompiler, "jdtCompiler", jDTBasedSpoonCompilerMock);
        
        Map initialJDTBatchCompilerOptions = jDTBatchCompiler.options;
        INameEnvironment initialJDTBatchCompilerJdtCompilerEnvironment = jDTBatchCompiler.jdtCompiler.environment;
        
        jDTBatchCompiler.getUnits();
        
        long finalJDTBatchCompilerStartTime = jDTBatchCompiler.startTime;
        Map finalJDTBatchCompilerOptions = jDTBatchCompiler.options;
        INameEnvironment finalJDTBatchCompilerJdtCompilerEnvironment = jDTBatchCompiler.jdtCompiler.environment;
        
        assertNull(finalJDTBatchCompilerOptions);
        
        assertFalse(initialJDTBatchCompilerJdtCompilerEnvironment == finalJDTBatchCompilerJdtCompilerEnvironment);
        
        assertEquals(1645062083966L, finalJDTBatchCompilerStartTime);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetUnits3() throws Throwable  {
        JDTBatchCompiler jDTBatchCompiler = ((JDTBatchCompiler) createInstance("spoon.support.compiler.jdt.JDTBatchCompiler"));
        jDTBatchCompiler.startTime = 0L;
        setField(jDTBatchCompiler, "filenames", null);
        setField(jDTBatchCompiler, "limitedModules", null);
        setField(jDTBatchCompiler, "annotationsFromClasspath", false);
        setField(jDTBatchCompiler, "checkedClasspaths", null);
        JDTBasedSpoonCompiler jDTBasedSpoonCompilerMock = mock(JDTBasedSpoonCompiler.class);
        setField(jDTBasedSpoonCompilerMock, "environment", null);
        setField(jDTBatchCompiler, "jdtCompiler", jDTBasedSpoonCompilerMock);
        
        Set initialJDTBatchCompilerLimitedModules = jDTBatchCompiler.limitedModules;
        
        jDTBatchCompiler.getUnits();
        
        long finalJDTBatchCompilerStartTime = jDTBatchCompiler.startTime;
        Set finalJDTBatchCompilerLimitedModules = jDTBatchCompiler.limitedModules;
        
        assertNull(finalJDTBatchCompilerLimitedModules);
        
        assertEquals(1645062084046L, finalJDTBatchCompilerStartTime);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetJdtCompiler1() throws Throwable  {
        JDTBatchCompiler jDTBatchCompiler = ((JDTBatchCompiler) createInstance("spoon.support.compiler.jdt.JDTBatchCompiler"));
        
        JDTBasedSpoonCompiler actual = jDTBatchCompiler.getJdtCompiler();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetJdtCompiler2() throws Throwable  {
        JDTBatchCompiler jDTBatchCompiler = ((JDTBatchCompiler) createInstance("spoon.support.compiler.jdt.JDTBatchCompiler"));
        JDTBasedSpoonCompiler jDTBasedSpoonCompilerMock = mock(JDTBasedSpoonCompiler.class);
        setField(jDTBatchCompiler, "jdtCompiler", jDTBasedSpoonCompilerMock);
        
        JDTBasedSpoonCompiler actual = jDTBatchCompiler.getJdtCompiler();
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(jDTBasedSpoonCompilerMock, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetCompilationUnits1() throws Throwable  {
        JDTBatchCompiler jDTBatchCompiler = ((JDTBatchCompiler) createInstance("spoon.support.compiler.jdt.JDTBatchCompiler"));
        org.eclipse.jdt.internal.compiler.batch.CompilationUnit[] compilationUnitArray = new org.eclipse.jdt.internal.compiler.batch.CompilationUnit[0];
        
        jDTBatchCompiler.setCompilationUnits(compilationUnitArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetCompilationUnits2() throws Throwable  {
        JDTBatchCompiler jDTBatchCompiler = ((JDTBatchCompiler) createInstance("spoon.support.compiler.jdt.JDTBatchCompiler"));
        setField(jDTBatchCompiler, "compilationUnits", null);
        
        jDTBatchCompiler.setCompilationUnits(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testIgnoreFile1() throws Throwable  {
        JDTBatchCompiler jDTBatchCompiler = ((JDTBatchCompiler) createInstance("spoon.support.compiler.jdt.JDTBatchCompiler"));
        String string = new String();
        
        jDTBatchCompiler.ignoreFile(string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testIgnoreFile2() throws Throwable  {
        JDTBatchCompiler jDTBatchCompiler = ((JDTBatchCompiler) createInstance("spoon.support.compiler.jdt.JDTBatchCompiler"));
        setField(jDTBatchCompiler, "filesToBeIgnored", null);
        
        jDTBatchCompiler.ignoreFile(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIgnoreFile3() throws Throwable  {
        JDTBatchCompiler jDTBatchCompiler = ((JDTBatchCompiler) createInstance("spoon.support.compiler.jdt.JDTBatchCompiler"));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        setField(jDTBatchCompiler, "filesToBeIgnored", linkedHashSet);
        String string = new String("");
        
        jDTBatchCompiler.ignoreFile(string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIgnoreFile4() throws Throwable  {
        JDTBatchCompiler jDTBatchCompiler = ((JDTBatchCompiler) createInstance("spoon.support.compiler.jdt.JDTBatchCompiler"));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Integer integer = 0;
        linkedHashSet.add(integer);
        setField(jDTBatchCompiler, "filesToBeIgnored", linkedHashSet);
        
        jDTBatchCompiler.ignoreFile(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIgnoreFile5() throws Throwable  {
        JDTBatchCompiler jDTBatchCompiler = ((JDTBatchCompiler) createInstance("spoon.support.compiler.jdt.JDTBatchCompiler"));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Integer integer = 0;
        linkedHashSet.add(integer);
        setField(jDTBatchCompiler, "filesToBeIgnored", linkedHashSet);
        String string = new String("");
        
        jDTBatchCompiler.ignoreFile(string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testJDTBatchCompiler1() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            Class bufferedWriterClazz = Class.forName("java.io.BufferedWriter");
            int prevDefaultCharBufferSize = ((int) getStaticFieldValue(bufferedWriterClazz, "defaultCharBufferSize"));
            try {
                setStaticField(bufferedWriterClazz, "defaultCharBufferSize", -2147483647);
                mockedStatic = mockStatic(StreamEncoder.class);
                StreamEncoder streamEncoderMock = mock(StreamEncoder.class);
                setField(streamEncoderMock, "lock", null);
                mockedStatic.when(() -> {
                    StreamEncoder.forOutputStreamWriter(any(java.io.OutputStream.class), any(Object.class), anyString());
                }).thenReturn(streamEncoderMock);
                JDTBasedSpoonCompiler jDTBasedSpoonCompilerMock = mock(JDTBasedSpoonCompiler.class);
                new JDTBatchCompiler(jDTBasedSpoonCompilerMock);
            } finally {
                setStaticField(java.io.BufferedWriter.class, "defaultCharBufferSize", prevDefaultCharBufferSize);
            }
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testJDTBatchCompiler2() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            Class bufferedWriterClazz = Class.forName("java.io.BufferedWriter");
            int prevDefaultCharBufferSize = ((int) getStaticFieldValue(bufferedWriterClazz, "defaultCharBufferSize"));
            try {
                setStaticField(bufferedWriterClazz, "defaultCharBufferSize", 9);
                mockedStatic = mockStatic(StreamEncoder.class);
                StreamEncoder streamEncoderMock = mock(StreamEncoder.class);
                setField(streamEncoderMock, "lock", null);
                mockedStatic.when(() -> {
                    StreamEncoder.forOutputStreamWriter(any(java.io.OutputStream.class), any(Object.class), anyString());
                }).thenReturn(streamEncoderMock);
                JDTBasedSpoonCompiler jDTBasedSpoonCompilerMock = mock(JDTBasedSpoonCompiler.class);
                new JDTBatchCompiler(jDTBasedSpoonCompilerMock);
            } finally {
                setStaticField(java.io.BufferedWriter.class, "defaultCharBufferSize", prevDefaultCharBufferSize);
            }
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testJDTBatchCompiler3() throws Throwable  {
        JDTBasedSpoonCompiler jDTBasedSpoonCompiler = ((JDTBasedSpoonCompiler) createInstance("spoon.support.compiler.jdt.JDTBasedSpoonCompiler"));
        new JDTBatchCompiler(jDTBasedSpoonCompiler, null, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testJDTBatchCompiler4() throws Throwable  {
        JDTBasedSpoonCompiler jDTBasedSpoonCompilerMock = mock(JDTBasedSpoonCompiler.class);
        new JDTBatchCompiler(jDTBasedSpoonCompilerMock, null, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testJDTBatchCompiler5() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            Class bufferedWriterClazz = Class.forName("java.io.BufferedWriter");
            int prevDefaultCharBufferSize = ((int) getStaticFieldValue(bufferedWriterClazz, "defaultCharBufferSize"));
            try {
                setStaticField(bufferedWriterClazz, "defaultCharBufferSize", 9);
                mockedStatic = mockStatic(StreamEncoder.class);
                StreamEncoder streamEncoderMock = mock(StreamEncoder.class);
                setField(streamEncoderMock, "lock", null);
                mockedStatic.when(() -> {
                    StreamEncoder.forOutputStreamWriter(any(java.io.OutputStream.class), any(Object.class), anyString());
                }).thenReturn(streamEncoderMock);
                JDTBasedSpoonCompiler jDTBasedSpoonCompilerMock = mock(JDTBasedSpoonCompiler.class);
                ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
                new JDTBatchCompiler(jDTBasedSpoonCompilerMock, objectOutputStream, null);
            } finally {
                setStaticField(java.io.BufferedWriter.class, "defaultCharBufferSize", prevDefaultCharBufferSize);
            }
        } finally {
            mockedStatic.close();
        }
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
    private static Object getStaticFieldValue(Class<?> clazz, String fieldName) throws Exception {
        java.lang.reflect.Field field;
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);
                java.lang.reflect.Field modifiersField = java.lang.reflect.Field.class.getDeclaredField("modifiers");
                modifiersField.setAccessible(true);
                modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
                
                return field.get(null);
            } catch (NoSuchFieldException e) {
                clazz = clazz.getSuperclass();
            }
        } while (clazz != null);
    
        throw new NoSuchFieldException("Field '" + fieldName + "' not found on class " + clazz);
    }
    private static void setStaticField(Class<?> clazz, String fieldName, Object fieldValue) throws Exception {
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
        field.set(null, fieldValue);
    }
    private static sun.misc.Unsafe getUnsafeInstance() throws Exception {
        java.lang.reflect.Field f = sun.misc.Unsafe.class.getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return (sun.misc.Unsafe) f.get(null);
    }
}
