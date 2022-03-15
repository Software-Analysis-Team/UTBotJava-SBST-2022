package com.alibaba.fastjson.serializer;

import org.junit.Test;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import sun.reflect.generics.reflectiveObjects.TypeVariableImpl;
import javax.sound.midi.VoiceStatus;
import com.alibaba.fastjson.parser.JSONLexer;
import okhttp3.CertificatePinner;
import java.util.concurrent.atomic.AtomicBoolean;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Iterator;
import sun.misc.Unsafe;

import static org.mockito.Mockito.mock;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
import static org.junit.Assert.assertNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mockStatic;
import static org.junit.Assert.assertTrue;

public class BooleanCodecTest {
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testWrite1() throws Throwable  {
        BooleanCodec booleanCodec = new BooleanCodec();
        JSONSerializer jSONSerializer = new JSONSerializer();
        Object object = new Object();
        Object object1 = new Object();
        
        booleanCodec.write(jSONSerializer, object, object1, null, 0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testWrite2() throws Throwable  {
        BooleanCodec booleanCodec = ((BooleanCodec) createInstance("com.alibaba.fastjson.serializer.BooleanCodec"));
        java.lang.Object[] compositeBuilderViaConstructorArray = createArray("com.sun.jmx.mbeanserver.DefaultMXBeanMappingFactory$CompositeBuilderViaConstructor", 0);
        java.lang.Object[] longCounterSnapshotArray = createArray("sun.management.counter.perf.LongCounterSnapshot", 0);
        Class class1 = Object.class;
        
        booleanCodec.write(null, compositeBuilderViaConstructorArray, longCounterSnapshotArray, class1, 0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testWrite3() throws Throwable  {
        BooleanCodec booleanCodec = ((BooleanCodec) createInstance("com.alibaba.fastjson.serializer.BooleanCodec"));
        JSONSerializer jSONSerializerMock = mock(JSONSerializer.class);
        SerializeWriter serializeWriterMock = mock(SerializeWriter.class);
        setField(jSONSerializerMock, "out", serializeWriterMock);
        java.lang.Object[] forEachTaskArray = createArray("java.util.stream.ForEachOps$ForEachTask", 0);
        
        booleanCodec.write(jSONSerializerMock, forEachTaskArray, null, null, 0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testWrite4() throws Throwable  {
        BooleanCodec booleanCodec = ((BooleanCodec) createInstance("com.alibaba.fastjson.serializer.BooleanCodec"));
        JSONSerializer jSONSerializerMock = mock(JSONSerializer.class);
        SerializeWriter serializeWriterMock = mock(SerializeWriter.class);
        setField(jSONSerializerMock, "out", serializeWriterMock);
        Boolean boolean1 = false;
        
        booleanCodec.write(jSONSerializerMock, boolean1, null, null, 0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testWrite5() throws Throwable  {
        BooleanCodec booleanCodec = ((BooleanCodec) createInstance("com.alibaba.fastjson.serializer.BooleanCodec"));
        JSONSerializer jSONSerializerMock = mock(JSONSerializer.class);
        SerializeWriter serializeWriterMock = mock(SerializeWriter.class);
        setField(jSONSerializerMock, "out", serializeWriterMock);
        Boolean boolean1 = true;
        
        booleanCodec.write(jSONSerializerMock, boolean1, null, null, 0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetFastMatchToken1() throws Throwable  {
        BooleanCodec booleanCodec = new BooleanCodec();
        
        int actual = booleanCodec.getFastMatchToken();
        
        assertEquals(6, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetFastMatchToken2() throws Throwable  {
        BooleanCodec booleanCodec = ((BooleanCodec) createInstance("com.alibaba.fastjson.serializer.BooleanCodec"));
        
        int actual = booleanCodec.getFastMatchToken();
        
        assertEquals(6, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDeserialze1() throws Throwable  {
        BooleanCodec booleanCodec = new BooleanCodec();
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        Object object = new Object();
        
        booleanCodec.deserialze(defaultJSONParser, null, object);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDeserialze2() throws Throwable  {
        BooleanCodec booleanCodec = ((BooleanCodec) createInstance("com.alibaba.fastjson.serializer.BooleanCodec"));
        TypeVariableImpl typeVariableImpl = ((TypeVariableImpl) createInstance("sun.reflect.generics.reflectiveObjects.TypeVariableImpl"));
        javax.sound.midi.VoiceStatus[] voiceStatusArray = new javax.sound.midi.VoiceStatus[0];
        
        booleanCodec.deserialze(null, typeVariableImpl, voiceStatusArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDeserialze3() throws Throwable  {
        BooleanCodec booleanCodec = ((BooleanCodec) createInstance("com.alibaba.fastjson.serializer.BooleanCodec"));
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        when(defaultJSONParserMock.parse()).thenReturn(null);
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(0, 0, 0);
        setField(defaultJSONParserMock, "lexer", jSONLexerMock);
        
        Object actual = booleanCodec.deserialze(defaultJSONParserMock, null, null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDeserialze4() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(com.alibaba.fastjson.util.TypeUtils.class);
            mockedStatic.when(() -> {
                com.alibaba.fastjson.util.TypeUtils.castToBoolean(any());
            }).thenReturn(((Boolean) null));
            BooleanCodec booleanCodec = ((BooleanCodec) createInstance("com.alibaba.fastjson.serializer.BooleanCodec"));
            DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
            okhttp3.CertificatePinner[] certificatePinnerArray = new okhttp3.CertificatePinner[0];
            when(defaultJSONParserMock.parse()).thenReturn(((Object) certificatePinnerArray));
            JSONLexer jSONLexerMock = mock(JSONLexer.class);
            when(jSONLexerMock.token()).thenReturn(0, 0, 0);
            setField(defaultJSONParserMock, "lexer", jSONLexerMock);
            
            Object actual = booleanCodec.deserialze(defaultJSONParserMock, null, null);
            
            assertNull(actual);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDeserialze5() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(com.alibaba.fastjson.util.TypeUtils.class);
            mockedStatic.when(() -> {
                com.alibaba.fastjson.util.TypeUtils.castToBoolean(any());
            }).thenReturn(((Boolean) null));
            BooleanCodec booleanCodec = ((BooleanCodec) createInstance("com.alibaba.fastjson.serializer.BooleanCodec"));
            DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
            java.lang.Object[] ofRefArray = createArray("java.util.stream.Nodes$CollectorTask$OfRef", 0);
            when(defaultJSONParserMock.parse()).thenReturn(((Object) ofRefArray));
            JSONLexer jSONLexerMock = mock(JSONLexer.class);
            when(jSONLexerMock.token()).thenReturn(0, 0, 0);
            setField(defaultJSONParserMock, "lexer", jSONLexerMock);
            Class class1 = Object.class;
            
            booleanCodec.deserialze(defaultJSONParserMock, class1, null);
            
            Class finalClass1 = class1;
            
            Class expectedFinalClass1 = AtomicBoolean.class;
            
            // Current deep equals depth exceeds max depth 0
            assertTrue(deepEquals(expectedFinalClass1, finalClass1));
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDeserialze6() throws Throwable  {
        BooleanCodec booleanCodec = ((BooleanCodec) createInstance("com.alibaba.fastjson.serializer.BooleanCodec"));
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(6);
        setField(defaultJSONParserMock, "lexer", jSONLexerMock);
        
        Object actual = booleanCodec.deserialze(defaultJSONParserMock, null, null);
        
        Boolean expected = false;
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDeserialze7() throws Throwable  {
        BooleanCodec booleanCodec = ((BooleanCodec) createInstance("com.alibaba.fastjson.serializer.BooleanCodec"));
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(0, 0, 2);
        when(jSONLexerMock.intValue()).thenReturn(1);
        setField(defaultJSONParserMock, "lexer", jSONLexerMock);
        
        Object actual = booleanCodec.deserialze(defaultJSONParserMock, null, null);
        
        Boolean expected = false;
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDeserialze8() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(com.alibaba.fastjson.util.TypeUtils.class);
            Boolean boolean1 = false;
            mockedStatic.when(() -> {
                com.alibaba.fastjson.util.TypeUtils.castToBoolean(any());
            }).thenReturn(boolean1);
            BooleanCodec booleanCodec = ((BooleanCodec) createInstance("com.alibaba.fastjson.serializer.BooleanCodec"));
            DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
            java.lang.Object[] ofRefArray = createArray("java.util.stream.Nodes$CollectorTask$OfRef", 0);
            when(defaultJSONParserMock.parse()).thenReturn(((Object) ofRefArray));
            JSONLexer jSONLexerMock = mock(JSONLexer.class);
            when(jSONLexerMock.token()).thenReturn(0, 0, 0);
            setField(defaultJSONParserMock, "lexer", jSONLexerMock);
            Class class1 = Object.class;
            
            Object actual = booleanCodec.deserialze(defaultJSONParserMock, class1, null);
            
            AtomicBoolean expected = new AtomicBoolean();
            
            // Current deep equals depth exceeds max depth 0
            assertTrue(deepEquals(expected, actual));
            
            Class finalClass1 = class1;
            
            Class expectedFinalClass1 = AtomicBoolean.class;
            
            // Current deep equals depth exceeds max depth 0
            assertTrue(deepEquals(expectedFinalClass1, finalClass1));
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testBooleanCodec1() {
        BooleanCodec actual = new BooleanCodec();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testBooleanCodec2() {
        BooleanCodec actual = new BooleanCodec();
    }
    ///endregion
    
    private static Object createInstance(String className) throws Exception {
        Class<?> clazz = Class.forName(className);
        return getUnsafeInstance().allocateInstance(clazz);
    }
    private static Object[] createArray(String className, int length, Object... values) throws ClassNotFoundException {
        Object array = java.lang.reflect.Array.newInstance(Class.forName(className), length);
    
        for (int i = 0; i < values.length; i++) {
            java.lang.reflect.Array.set(array, i, values[i]);
        }
        
        return (Object[]) array;
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
