package com.google.common.base.internal;

import org.junit.Test;
import java.lang.ref.ReferenceQueue;
import java.lang.reflect.Method;
import java.nio.file.attribute.PosixFilePermission;
import java.lang.reflect.Field;
import java.lang.reflect.Constructor;
import java.lang.ref.PhantomReference;
import java.lang.reflect.Modifier;
import java.lang.reflect.Array;
import java.util.Objects;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Iterator;
import sun.misc.Unsafe;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class FinalizerTest {
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testRun1() throws Throwable  {
        Finalizer finalizer = ((Finalizer) createInstance("com.google.common.base.internal.Finalizer"));
        
        finalizer.run();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testRun2() throws Throwable  {
        Class referenceQueueClazz = Class.forName("java.lang.ref.ReferenceQueue");
        ReferenceQueue prevNULL = ((ReferenceQueue) getStaticFieldValue(referenceQueueClazz, "NULL"));
        try {
            Object nULL = createInstance("java.lang.ref.ReferenceQueue$Null");
            setField(nULL, "queueLength", 0L);
            setField(nULL, "head", null);
            setField(nULL, "lock", null);
            setStaticField(referenceQueueClazz, "NULL", nULL);
            Finalizer finalizer = ((Finalizer) createInstance("com.google.common.base.internal.Finalizer"));
            Object null = createInstance("java.lang.ref.ReferenceQueue$Null");
            setField(null, "queueLength", 0L);
            Object weakValueReference = createInstance("com.google.common.cache.LocalCache$WeakValueReference");
            Object weakKeyDummyValueEntry = createInstance("com.google.common.collect.MapMakerInternalMap$WeakKeyDummyValueEntry");
            setField(weakKeyDummyValueEntry, "next", null);
            setField(weakKeyDummyValueEntry, "queue", null);
            setField(weakKeyDummyValueEntry, "referent", null);
            setField(weakValueReference, "next", weakKeyDummyValueEntry);
            ReferenceQueue referenceQueue = ((ReferenceQueue) createInstance("java.lang.ref.ReferenceQueue"));
            setField(referenceQueue, "queueLength", 0L);
            setField(referenceQueue, "head", null);
            setField(referenceQueue, "lock", null);
            setField(weakValueReference, "queue", referenceQueue);
            setField(weakValueReference, "referent", null);
            setField(null, "head", weakValueReference);
            Object lock = createInstance("java.lang.ref.ReferenceQueue$Lock");
            setField(null, "lock", lock);
            setField(finalizer, "queue", null);
            Object weakClassKey = createInstance("java.io.ObjectStreamClass$WeakClassKey");
            setField(weakClassKey, "next", null);
            setField(weakClassKey, "queue", null);
            setField(weakClassKey, "referent", null);
            setField(finalizer, "finalizableReferenceClassReference", weakClassKey);
            
            Object finalizerQueue = getFieldValue(finalizer, "queue");
            Object initialFinalizerQueueHead = getFieldValue(finalizerQueue, "head");
            
            finalizer.run();
            
            Object finalizerQueue1 = getFieldValue(finalizer, "queue");
            Object finalFinalizerQueueQueueLength = getFieldValue(finalizerQueue1, "queueLength");
            Object finalizerQueue2 = getFieldValue(finalizer, "queue");
            Object finalFinalizerQueueHead = getFieldValue(finalizerQueue2, "head");
            
            assertFalse(initialFinalizerQueueHead == finalFinalizerQueueHead);
            
            assertEquals(-1L, finalFinalizerQueueQueueLength);
        } finally {
            setStaticField(ReferenceQueue.class, "NULL", prevNULL);
        }
    }
    ///endregion
    
    
    ///region Errors report for run
    
    public void testRun_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Field security is not found in class java.lang.System
        // 
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCleanUp1() throws Throwable  {
        Finalizer finalizer = ((Finalizer) createInstance("com.google.common.base.internal.Finalizer"));
        
        Class finalizerClazz = Class.forName("com.google.common.base.internal.Finalizer");
        Class referenceType = Class.forName("java.lang.ref.Reference");
        Method cleanUpMethod = finalizerClazz.getDeclaredMethod("cleanUp", referenceType);
        cleanUpMethod.setAccessible(true);
        java.lang.Object[] cleanUpMethodArguments = new java.lang.Object[1];
        cleanUpMethodArguments[0] = null;
        try {
            cleanUpMethod.invoke(finalizer, cleanUpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCleanUp2() throws Throwable  {
        Finalizer finalizer = ((Finalizer) createInstance("com.google.common.base.internal.Finalizer"));
        Object entry = createInstance("java.lang.ClassValue$Entry");
        java.lang.Object[] eSSCertIdArray = createArray("sun.security.pkcs.ESSCertId", 0);
        setField(entry, "referent", eSSCertIdArray);
        setField(finalizer, "finalizableReferenceClassReference", entry);
        Object loaderReference = createInstance("java.util.ResourceBundle$LoaderReference");
        setField(loaderReference, "referent", null);
        
        Class finalizerClazz = Class.forName("com.google.common.base.internal.Finalizer");
        Class loaderReferenceType = Class.forName("java.lang.ref.Reference");
        Method cleanUpMethod = finalizerClazz.getDeclaredMethod("cleanUp", loaderReferenceType);
        cleanUpMethod.setAccessible(true);
        java.lang.Object[] cleanUpMethodArguments = new java.lang.Object[1];
        cleanUpMethodArguments[0] = loaderReference;
        try {
            cleanUpMethod.invoke(finalizer, cleanUpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCleanUp3() throws Throwable  {
        Finalizer finalizer = ((Finalizer) createInstance("com.google.common.base.internal.Finalizer"));
        Object weakClassKey = createInstance("java.io.ObjectStreamClass$WeakClassKey");
        setField(weakClassKey, "referent", null);
        setField(finalizer, "finalizableReferenceClassReference", weakClassKey);
        Object arrayReference = createInstance("com.google.common.util.concurrent.Striped$SmallLazyStriped$ArrayReference");
        setField(arrayReference, "referent", null);
        
        Class finalizerClazz = Class.forName("com.google.common.base.internal.Finalizer");
        Class arrayReferenceType = Class.forName("java.lang.ref.Reference");
        Method cleanUpMethod = finalizerClazz.getDeclaredMethod("cleanUp", arrayReferenceType);
        cleanUpMethod.setAccessible(true);
        java.lang.Object[] cleanUpMethodArguments = new java.lang.Object[1];
        cleanUpMethodArguments[0] = arrayReference;
        boolean actual = ((boolean) cleanUpMethod.invoke(finalizer, cleanUpMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    
    ///region Errors report for cleanUp
    
    public void testCleanUp_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Field security is not found in class java.lang.System
        // 
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetFinalizeReferentMethod1() throws Throwable  {
        Finalizer finalizer = ((Finalizer) createInstance("com.google.common.base.internal.Finalizer"));
        
        Class finalizerClazz = Class.forName("com.google.common.base.internal.Finalizer");
        Method getFinalizeReferentMethodMethod = finalizerClazz.getDeclaredMethod("getFinalizeReferentMethod");
        getFinalizeReferentMethodMethod.setAccessible(true);
        java.lang.Object[] getFinalizeReferentMethodMethodArguments = new java.lang.Object[0];
        try {
            getFinalizeReferentMethodMethod.invoke(finalizer, getFinalizeReferentMethodMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetFinalizeReferentMethod2() throws Throwable  {
        Finalizer finalizer = ((Finalizer) createInstance("com.google.common.base.internal.Finalizer"));
        Object weakClassKey = createInstance("java.io.ObjectStreamClass$WeakClassKey");
        java.nio.file.attribute.PosixFilePermission[] posixFilePermissionArray = new java.nio.file.attribute.PosixFilePermission[0];
        setField(weakClassKey, "referent", posixFilePermissionArray);
        setField(finalizer, "finalizableReferenceClassReference", weakClassKey);
        
        Class finalizerClazz = Class.forName("com.google.common.base.internal.Finalizer");
        Method getFinalizeReferentMethodMethod = finalizerClazz.getDeclaredMethod("getFinalizeReferentMethod");
        getFinalizeReferentMethodMethod.setAccessible(true);
        java.lang.Object[] getFinalizeReferentMethodMethodArguments = new java.lang.Object[0];
        try {
            getFinalizeReferentMethodMethod.invoke(finalizer, getFinalizeReferentMethodMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetFinalizeReferentMethod3() throws Throwable  {
        Finalizer finalizer = ((Finalizer) createInstance("com.google.common.base.internal.Finalizer"));
        Object arrayReference = createInstance("com.google.common.util.concurrent.Striped$SmallLazyStriped$ArrayReference");
        setField(arrayReference, "referent", null);
        setField(finalizer, "finalizableReferenceClassReference", arrayReference);
        
        Class finalizerClazz = Class.forName("com.google.common.base.internal.Finalizer");
        Method getFinalizeReferentMethodMethod = finalizerClazz.getDeclaredMethod("getFinalizeReferentMethod");
        getFinalizeReferentMethodMethod.setAccessible(true);
        java.lang.Object[] getFinalizeReferentMethodMethodArguments = new java.lang.Object[0];
        Method actual = ((Method) getFinalizeReferentMethodMethod.invoke(finalizer, getFinalizeReferentMethodMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    
    ///region Errors report for getFinalizeReferentMethod
    
    public void testGetFinalizeReferentMethod_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Field security is not found in class java.lang.System
        // 
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetInheritableThreadLocalsField1() throws Throwable  {
        Class finalizerClazz = Class.forName("com.google.common.base.internal.Finalizer");
        Method getInheritableThreadLocalsFieldMethod = finalizerClazz.getDeclaredMethod("getInheritableThreadLocalsField");
        getInheritableThreadLocalsFieldMethod.setAccessible(true);
        java.lang.Object[] getInheritableThreadLocalsFieldMethodArguments = new java.lang.Object[0];
        Field actual = ((Field) getInheritableThreadLocalsFieldMethod.invoke(null, getInheritableThreadLocalsFieldMethodArguments));
        
        Field expected = ((Field) createInstance("java.lang.reflect.Field"));
        Class class1 = Thread.class;
        setField(expected, "clazz", class1);
        setField(expected, "slot", 13);
        String string = new String("inheritableThreadLocals");
        setField(expected, "name", string);
        Class class2 = ThreadLocal.ThreadLocalMap.class;
        setField(expected, "type", class2);
        setField(expected, "modifiers", 0);
        setField(expected, "signature", null);
        setField(expected, "genericInfo", null);
        setField(expected, "annotations", null);
        setField(expected, "fieldAccessor", null);
        setField(expected, "overrideFieldAccessor", null);
        Field field = ((Field) createInstance("java.lang.reflect.Field"));
        setField(field, "clazz", class1);
        setField(field, "slot", 13);
        setField(field, "name", string);
        setField(field, "type", class2);
        setField(field, "modifiers", 0);
        setField(field, "signature", null);
        setField(field, "genericInfo", null);
        setField(field, "annotations", null);
        setField(field, "fieldAccessor", null);
        setField(field, "overrideFieldAccessor", null);
        setField(field, "root", null);
        setField(field, "declaredAnnotations", null);
        setField(field, "override", false);
        setField(field, "securityCheckCache", null);
        setField(expected, "root", field);
        setField(expected, "declaredAnnotations", null);
        setField(expected, "override", true);
        setField(expected, "securityCheckCache", null);
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    
    ///region Errors report for getInheritableThreadLocalsField
    
    public void testGetInheritableThreadLocalsField_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Field security is not found in class java.lang.System
        // 
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetBigThreadConstructor1() throws Throwable  {
        Class finalizerClazz = Class.forName("com.google.common.base.internal.Finalizer");
        Method getBigThreadConstructorMethod = finalizerClazz.getDeclaredMethod("getBigThreadConstructor");
        getBigThreadConstructorMethod.setAccessible(true);
        java.lang.Object[] getBigThreadConstructorMethodArguments = new java.lang.Object[0];
        Constructor actual = ((Constructor) getBigThreadConstructorMethod.invoke(null, getBigThreadConstructorMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    
    ///region Errors report for getBigThreadConstructor
    
    public void testGetBigThreadConstructor_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Field security is not found in class java.lang.System
        // 
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testStartFinalizer1() throws Throwable  {
        Finalizer.startFinalizer(null, null, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testFinalizer1() throws Throwable  {
        Class referenceQueueClazz = Class.forName("java.lang.ref.ReferenceQueue");
        ReferenceQueue prevNULL = ((ReferenceQueue) getStaticFieldValue(referenceQueueClazz, "NULL"));
        try {
            Object nULL = createInstance("java.lang.ref.ReferenceQueue$Null");
            setStaticField(referenceQueueClazz, "NULL", nULL);
            Class class1 = Object.class;
            ReferenceQueue referenceQueue = ((ReferenceQueue) createInstance("java.lang.ref.ReferenceQueue"));
            PhantomReference phantomReference = ((PhantomReference) createInstance("java.lang.ref.PhantomReference"));
            setField(phantomReference, "queue", null);
            setField(phantomReference, "referent", null);
            Class finalizerClazz = Class.forName("com.google.common.base.internal.Finalizer");
            Class class1Type = Class.forName("java.lang.Class");
            Class phantomReferenceType = Class.forName("java.lang.ref.PhantomReference");
            Constructor finalizerConstructor = finalizerClazz.getDeclaredConstructor(class1Type, referenceQueueClazz, phantomReferenceType);
            finalizerConstructor.setAccessible(true);
            java.lang.Object[] finalizerConstructorArguments = new java.lang.Object[3];
            finalizerConstructorArguments[0] = class1;
            finalizerConstructorArguments[1] = referenceQueue;
            finalizerConstructorArguments[2] = phantomReference;
            Finalizer actual = ((Finalizer) finalizerConstructor.newInstance(finalizerConstructorArguments));
        } finally {
            setStaticField(ReferenceQueue.class, "NULL", prevNULL);
        }
    }
    ///endregion
    
    private static Object createInstance(String className) throws Exception {
        Class<?> clazz = Class.forName(className);
        return getUnsafeInstance().allocateInstance(clazz);
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
    private static sun.misc.Unsafe getUnsafeInstance() throws Exception {
        java.lang.reflect.Field f = sun.misc.Unsafe.class.getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return (sun.misc.Unsafe) f.get(null);
    }
}
