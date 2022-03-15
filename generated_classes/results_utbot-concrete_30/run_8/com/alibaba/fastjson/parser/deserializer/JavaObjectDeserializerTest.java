package com.alibaba.fastjson.parser.deserializer;

import org.junit.Test;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.JSONScanner;
import com.alibaba.fastjson.parser.JSONLexer;
import com.alibaba.fastjson.parser.DefaultExtJSONParser;
import sun.reflect.generics.reflectiveObjects.GenericArrayTypeImpl;
import sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl;
import sun.reflect.generics.reflectiveObjects.TypeVariableImpl;
import com.alibaba.fastjson.parser.JSONReaderScanner;
import java.lang.reflect.Type;
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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;
import static java.lang.reflect.Array.get;

public class JavaObjectDeserializerTest {
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDeserialze1() throws Throwable  {
        JavaObjectDeserializer javaObjectDeserializer = new JavaObjectDeserializer();
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        Object object = new Object();
        
        javaObjectDeserializer.deserialze(defaultJSONParser, null, object);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDeserialze2() throws Throwable  {
        JavaObjectDeserializer javaObjectDeserializer = ((JavaObjectDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.JavaObjectDeserializer"));
        Class class1 = Object.class;
        
        javaObjectDeserializer.deserialze(null, class1, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDeserialze3() throws Throwable  {
        JavaObjectDeserializer javaObjectDeserializer = ((JavaObjectDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.JavaObjectDeserializer"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "token", 9);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        javaObjectDeserializer.deserialze(defaultJSONParser, null, null);
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerToken = getFieldValue(jSONLexer, "token");
        
        assertEquals(20, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDeserialze4() throws Throwable  {
        JavaObjectDeserializer javaObjectDeserializer = ((JavaObjectDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.JavaObjectDeserializer"));
        DefaultExtJSONParser defaultExtJSONParser = ((DefaultExtJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultExtJSONParser"));
        GenericArrayTypeImpl genericArrayTypeImpl = ((GenericArrayTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.GenericArrayTypeImpl"));
        ParameterizedTypeImpl parameterizedTypeImpl = ((ParameterizedTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl"));
        setField(genericArrayTypeImpl, "genericComponentType", parameterizedTypeImpl);
        
        javaObjectDeserializer.deserialze(defaultExtJSONParser, genericArrayTypeImpl, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDeserialze5() throws Throwable  {
        JavaObjectDeserializer javaObjectDeserializer = ((JavaObjectDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.JavaObjectDeserializer"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "token", 8);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Object actual = javaObjectDeserializer.deserialze(defaultJSONParser, null, null);
        
        assertNull(actual);
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerToken = getFieldValue(jSONLexer, "token");
        
        assertEquals(20, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDeserialze6() throws Throwable  {
        JavaObjectDeserializer javaObjectDeserializer = ((JavaObjectDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.JavaObjectDeserializer"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "token", 26);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Object actual = javaObjectDeserializer.deserialze(defaultJSONParser, null, null);
        
        byte[] expected = new byte[0];
        assertArrayEquals(expected, ((byte[]) actual));
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerToken = getFieldValue(jSONLexer, "token");
        
        assertEquals(20, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDeserialze7() throws Throwable  {
        JavaObjectDeserializer javaObjectDeserializer = ((JavaObjectDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.JavaObjectDeserializer"));
        DefaultExtJSONParser defaultExtJSONParser = ((DefaultExtJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultExtJSONParser"));
        GenericArrayTypeImpl genericArrayTypeImpl = ((GenericArrayTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.GenericArrayTypeImpl"));
        TypeVariableImpl typeVariableImpl = ((TypeVariableImpl) createInstance("sun.reflect.generics.reflectiveObjects.TypeVariableImpl"));
        setField(typeVariableImpl, "bounds", null);
        setField(genericArrayTypeImpl, "genericComponentType", typeVariableImpl);
        
        javaObjectDeserializer.deserialze(defaultExtJSONParser, genericArrayTypeImpl, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDeserialze8() throws Throwable  {
        JavaObjectDeserializer javaObjectDeserializer = ((JavaObjectDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.JavaObjectDeserializer"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "token", 2);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        javaObjectDeserializer.deserialze(defaultJSONParser, null, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDeserialze9() throws Throwable  {
        JavaObjectDeserializer javaObjectDeserializer = ((JavaObjectDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.JavaObjectDeserializer"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "token", 7);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Object actual = javaObjectDeserializer.deserialze(defaultJSONParser, null, null);
        
        Boolean expected = false;
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerToken = getFieldValue(jSONLexer, "token");
        
        assertEquals(20, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDeserialze10() throws Throwable  {
        JavaObjectDeserializer javaObjectDeserializer = ((JavaObjectDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.JavaObjectDeserializer"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONReaderScanner jSONReaderScanner = ((JSONReaderScanner) createInstance("com.alibaba.fastjson.parser.JSONReaderScanner"));
        setField(jSONReaderScanner, "token", 20);
        setField(defaultJSONParser, "lexer", jSONReaderScanner);
        
        javaObjectDeserializer.deserialze(defaultJSONParser, null, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDeserialze11() throws Throwable  {
        JavaObjectDeserializer javaObjectDeserializer = ((JavaObjectDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.JavaObjectDeserializer"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "token", 6);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Object actual = javaObjectDeserializer.deserialze(defaultJSONParser, null, null);
        
        Boolean expected = true;
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerToken = getFieldValue(jSONLexer, "token");
        
        assertEquals(20, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDeserialze12() throws Throwable  {
        JavaObjectDeserializer javaObjectDeserializer = ((JavaObjectDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.JavaObjectDeserializer"));
        DefaultExtJSONParser defaultExtJSONParser = ((DefaultExtJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultExtJSONParser"));
        GenericArrayTypeImpl genericArrayTypeImpl = ((GenericArrayTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.GenericArrayTypeImpl"));
        TypeVariableImpl typeVariableImpl = ((TypeVariableImpl) createInstance("sun.reflect.generics.reflectiveObjects.TypeVariableImpl"));
        java.lang.reflect.Type[] typeArray = new java.lang.reflect.Type[9];
        setField(typeVariableImpl, "bounds", typeArray);
        setField(genericArrayTypeImpl, "genericComponentType", typeVariableImpl);
        
        Object genericArrayTypeImplGenericComponentType = getFieldValue(genericArrayTypeImpl, "genericComponentType");
        Object genericArrayTypeImplGenericComponentTypeGenericComponentTypeBounds = getFieldValue(genericArrayTypeImplGenericComponentType, "bounds");
        Object initialGenericArrayTypeImplGenericComponentTypeBounds0 = get(genericArrayTypeImplGenericComponentTypeGenericComponentTypeBounds, 0);
        Object genericArrayTypeImplGenericComponentType1 = getFieldValue(genericArrayTypeImpl, "genericComponentType");
        Object genericArrayTypeImplGenericComponentType1GenericComponentTypeBounds = getFieldValue(genericArrayTypeImplGenericComponentType1, "bounds");
        Object initialGenericArrayTypeImplGenericComponentTypeBounds1 = get(genericArrayTypeImplGenericComponentType1GenericComponentTypeBounds, 1);
        Object genericArrayTypeImplGenericComponentType2 = getFieldValue(genericArrayTypeImpl, "genericComponentType");
        Object genericArrayTypeImplGenericComponentType2GenericComponentTypeBounds = getFieldValue(genericArrayTypeImplGenericComponentType2, "bounds");
        Object initialGenericArrayTypeImplGenericComponentTypeBounds2 = get(genericArrayTypeImplGenericComponentType2GenericComponentTypeBounds, 2);
        Object genericArrayTypeImplGenericComponentType3 = getFieldValue(genericArrayTypeImpl, "genericComponentType");
        Object genericArrayTypeImplGenericComponentType3GenericComponentTypeBounds = getFieldValue(genericArrayTypeImplGenericComponentType3, "bounds");
        Object initialGenericArrayTypeImplGenericComponentTypeBounds3 = get(genericArrayTypeImplGenericComponentType3GenericComponentTypeBounds, 3);
        Object genericArrayTypeImplGenericComponentType4 = getFieldValue(genericArrayTypeImpl, "genericComponentType");
        Object genericArrayTypeImplGenericComponentType4GenericComponentTypeBounds = getFieldValue(genericArrayTypeImplGenericComponentType4, "bounds");
        Object initialGenericArrayTypeImplGenericComponentTypeBounds4 = get(genericArrayTypeImplGenericComponentType4GenericComponentTypeBounds, 4);
        Object genericArrayTypeImplGenericComponentType5 = getFieldValue(genericArrayTypeImpl, "genericComponentType");
        Object genericArrayTypeImplGenericComponentType5GenericComponentTypeBounds = getFieldValue(genericArrayTypeImplGenericComponentType5, "bounds");
        Object initialGenericArrayTypeImplGenericComponentTypeBounds5 = get(genericArrayTypeImplGenericComponentType5GenericComponentTypeBounds, 5);
        Object genericArrayTypeImplGenericComponentType6 = getFieldValue(genericArrayTypeImpl, "genericComponentType");
        Object genericArrayTypeImplGenericComponentType6GenericComponentTypeBounds = getFieldValue(genericArrayTypeImplGenericComponentType6, "bounds");
        Object initialGenericArrayTypeImplGenericComponentTypeBounds6 = get(genericArrayTypeImplGenericComponentType6GenericComponentTypeBounds, 6);
        Object genericArrayTypeImplGenericComponentType7 = getFieldValue(genericArrayTypeImpl, "genericComponentType");
        Object genericArrayTypeImplGenericComponentType7GenericComponentTypeBounds = getFieldValue(genericArrayTypeImplGenericComponentType7, "bounds");
        Object initialGenericArrayTypeImplGenericComponentTypeBounds7 = get(genericArrayTypeImplGenericComponentType7GenericComponentTypeBounds, 7);
        Object genericArrayTypeImplGenericComponentType8 = getFieldValue(genericArrayTypeImpl, "genericComponentType");
        Object genericArrayTypeImplGenericComponentType8GenericComponentTypeBounds = getFieldValue(genericArrayTypeImplGenericComponentType8, "bounds");
        Object initialGenericArrayTypeImplGenericComponentTypeBounds8 = get(genericArrayTypeImplGenericComponentType8GenericComponentTypeBounds, 8);
        
        javaObjectDeserializer.deserialze(defaultExtJSONParser, genericArrayTypeImpl, null);
        
        Object genericArrayTypeImplGenericComponentType9 = getFieldValue(genericArrayTypeImpl, "genericComponentType");
        Object genericArrayTypeImplGenericComponentType9GenericComponentTypeBounds = getFieldValue(genericArrayTypeImplGenericComponentType9, "bounds");
        Object finalGenericArrayTypeImplGenericComponentTypeBounds0 = get(genericArrayTypeImplGenericComponentType9GenericComponentTypeBounds, 0);
        Object genericArrayTypeImplGenericComponentType10 = getFieldValue(genericArrayTypeImpl, "genericComponentType");
        Object genericArrayTypeImplGenericComponentType10GenericComponentTypeBounds = getFieldValue(genericArrayTypeImplGenericComponentType10, "bounds");
        Object finalGenericArrayTypeImplGenericComponentTypeBounds1 = get(genericArrayTypeImplGenericComponentType10GenericComponentTypeBounds, 1);
        Object genericArrayTypeImplGenericComponentType11 = getFieldValue(genericArrayTypeImpl, "genericComponentType");
        Object genericArrayTypeImplGenericComponentType11GenericComponentTypeBounds = getFieldValue(genericArrayTypeImplGenericComponentType11, "bounds");
        Object finalGenericArrayTypeImplGenericComponentTypeBounds2 = get(genericArrayTypeImplGenericComponentType11GenericComponentTypeBounds, 2);
        Object genericArrayTypeImplGenericComponentType12 = getFieldValue(genericArrayTypeImpl, "genericComponentType");
        Object genericArrayTypeImplGenericComponentType12GenericComponentTypeBounds = getFieldValue(genericArrayTypeImplGenericComponentType12, "bounds");
        Object finalGenericArrayTypeImplGenericComponentTypeBounds3 = get(genericArrayTypeImplGenericComponentType12GenericComponentTypeBounds, 3);
        Object genericArrayTypeImplGenericComponentType13 = getFieldValue(genericArrayTypeImpl, "genericComponentType");
        Object genericArrayTypeImplGenericComponentType13GenericComponentTypeBounds = getFieldValue(genericArrayTypeImplGenericComponentType13, "bounds");
        Object finalGenericArrayTypeImplGenericComponentTypeBounds4 = get(genericArrayTypeImplGenericComponentType13GenericComponentTypeBounds, 4);
        Object genericArrayTypeImplGenericComponentType14 = getFieldValue(genericArrayTypeImpl, "genericComponentType");
        Object genericArrayTypeImplGenericComponentType14GenericComponentTypeBounds = getFieldValue(genericArrayTypeImplGenericComponentType14, "bounds");
        Object finalGenericArrayTypeImplGenericComponentTypeBounds5 = get(genericArrayTypeImplGenericComponentType14GenericComponentTypeBounds, 5);
        Object genericArrayTypeImplGenericComponentType15 = getFieldValue(genericArrayTypeImpl, "genericComponentType");
        Object genericArrayTypeImplGenericComponentType15GenericComponentTypeBounds = getFieldValue(genericArrayTypeImplGenericComponentType15, "bounds");
        Object finalGenericArrayTypeImplGenericComponentTypeBounds6 = get(genericArrayTypeImplGenericComponentType15GenericComponentTypeBounds, 6);
        Object genericArrayTypeImplGenericComponentType16 = getFieldValue(genericArrayTypeImpl, "genericComponentType");
        Object genericArrayTypeImplGenericComponentType16GenericComponentTypeBounds = getFieldValue(genericArrayTypeImplGenericComponentType16, "bounds");
        Object finalGenericArrayTypeImplGenericComponentTypeBounds7 = get(genericArrayTypeImplGenericComponentType16GenericComponentTypeBounds, 7);
        Object genericArrayTypeImplGenericComponentType17 = getFieldValue(genericArrayTypeImpl, "genericComponentType");
        Object genericArrayTypeImplGenericComponentType17GenericComponentTypeBounds = getFieldValue(genericArrayTypeImplGenericComponentType17, "bounds");
        Object finalGenericArrayTypeImplGenericComponentTypeBounds8 = get(genericArrayTypeImplGenericComponentType17GenericComponentTypeBounds, 8);
        
        assertNull(finalGenericArrayTypeImplGenericComponentTypeBounds0);
        
        assertNull(finalGenericArrayTypeImplGenericComponentTypeBounds1);
        
        assertNull(finalGenericArrayTypeImplGenericComponentTypeBounds2);
        
        assertNull(finalGenericArrayTypeImplGenericComponentTypeBounds3);
        
        assertNull(finalGenericArrayTypeImplGenericComponentTypeBounds4);
        
        assertNull(finalGenericArrayTypeImplGenericComponentTypeBounds5);
        
        assertNull(finalGenericArrayTypeImplGenericComponentTypeBounds6);
        
        assertNull(finalGenericArrayTypeImplGenericComponentTypeBounds7);
        
        assertNull(finalGenericArrayTypeImplGenericComponentTypeBounds8);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDeserialze13() throws Throwable  {
        JavaObjectDeserializer javaObjectDeserializer = ((JavaObjectDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.JavaObjectDeserializer"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "token", 18);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        javaObjectDeserializer.deserialze(defaultJSONParser, null, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDeserialze14() throws Throwable  {
        JavaObjectDeserializer javaObjectDeserializer = ((JavaObjectDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.JavaObjectDeserializer"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(defaultJSONParser, "lexer", jSONScanner);
        Class class1 = Object.class;
        
        javaObjectDeserializer.deserialze(defaultJSONParser, class1, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDeserialze15() throws Throwable  {
        JavaObjectDeserializer javaObjectDeserializer = ((JavaObjectDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.JavaObjectDeserializer"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "token", 22);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        javaObjectDeserializer.deserialze(defaultJSONParser, null, null);
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerToken = getFieldValue(jSONLexer, "token");
        
        assertEquals(20, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDeserialze16() throws Throwable  {
        JavaObjectDeserializer javaObjectDeserializer = ((JavaObjectDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.JavaObjectDeserializer"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "token", 23);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Object actual = javaObjectDeserializer.deserialze(defaultJSONParser, null, null);
        
        assertNull(actual);
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerToken = getFieldValue(jSONLexer, "token");
        
        assertEquals(20, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDeserialze17() throws Throwable  {
        JavaObjectDeserializer javaObjectDeserializer = ((JavaObjectDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.JavaObjectDeserializer"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "token", 20);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Object actual = javaObjectDeserializer.deserialze(defaultJSONParser, null, null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetFastMatchToken1() throws Throwable  {
        JavaObjectDeserializer javaObjectDeserializer = new JavaObjectDeserializer();
        
        int actual = javaObjectDeserializer.getFastMatchToken();
        
        assertEquals(12, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetFastMatchToken2() throws Throwable  {
        JavaObjectDeserializer javaObjectDeserializer = ((JavaObjectDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.JavaObjectDeserializer"));
        
        int actual = javaObjectDeserializer.getFastMatchToken();
        
        assertEquals(12, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testJavaObjectDeserializer1() {
        JavaObjectDeserializer actual = new JavaObjectDeserializer();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testJavaObjectDeserializer2() {
        JavaObjectDeserializer actual = new JavaObjectDeserializer();
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
