package com.alibaba.fastjson.parser.deserializer;

import org.junit.Test;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import java.lang.reflect.Method;
import sun.reflect.generics.reflectiveObjects.TypeVariableImpl;
import java.util.LinkedHashMap;
import sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl;
import java.lang.reflect.Type;
import com.alibaba.fastjson.parser.JSONScanner;
import com.alibaba.fastjson.parser.JSONLexer;
import com.alibaba.fastjson.asm.ByteVector;
import org.slf4j.LoggerFactory;
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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertFalse;

public class MapDeserializerTest {
    ///region
    
    @Test(timeout = 10000)
    public void testGetFastMatchToken1() throws Throwable  {
        MapDeserializer mapDeserializer = new MapDeserializer();
        
        int actual = mapDeserializer.getFastMatchToken();
        
        assertEquals(12, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDeserialze1() throws Throwable  {
        MapDeserializer mapDeserializer = new MapDeserializer();
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        Object object = new Object();
        
        Class mapDeserializerClazz = Class.forName("com.alibaba.fastjson.parser.deserializer.MapDeserializer");
        Class defaultJSONParserType = Class.forName("com.alibaba.fastjson.parser.DefaultJSONParser");
        Class typeType = Class.forName("java.lang.reflect.Type");
        Class objectType = Class.forName("java.lang.Object");
        Class mapType = Class.forName("java.util.Map");
        Method deserialzeMethod = mapDeserializerClazz.getDeclaredMethod("deserialze", defaultJSONParserType, typeType, objectType, mapType);
        deserialzeMethod.setAccessible(true);
        java.lang.Object[] deserialzeMethodArguments = new java.lang.Object[4];
        deserialzeMethodArguments[0] = defaultJSONParser;
        deserialzeMethodArguments[1] = null;
        deserialzeMethodArguments[2] = object;
        deserialzeMethodArguments[3] = null;
        try {
            deserialzeMethod.invoke(mapDeserializer, deserialzeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDeserialze2() throws Throwable  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.MapDeserializer"));
        TypeVariableImpl typeVariableImpl = ((TypeVariableImpl) createInstance("sun.reflect.generics.reflectiveObjects.TypeVariableImpl"));
        java.lang.Object[] membershipRegistryArray = createArray("sun.nio.ch.MembershipRegistry", 0);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        
        Class mapDeserializerClazz = Class.forName("com.alibaba.fastjson.parser.deserializer.MapDeserializer");
        Class defaultJSONParserType = Class.forName("com.alibaba.fastjson.parser.DefaultJSONParser");
        Class typeVariableImplType = Class.forName("java.lang.reflect.Type");
        Class membershipRegistryArrayType = Class.forName("java.lang.Object");
        Class linkedHashMapType = Class.forName("java.util.Map");
        Method deserialzeMethod = mapDeserializerClazz.getDeclaredMethod("deserialze", defaultJSONParserType, typeVariableImplType, membershipRegistryArrayType, linkedHashMapType);
        deserialzeMethod.setAccessible(true);
        java.lang.Object[] deserialzeMethodArguments = new java.lang.Object[4];
        deserialzeMethodArguments[0] = null;
        deserialzeMethodArguments[1] = typeVariableImpl;
        deserialzeMethodArguments[2] = ((Object) membershipRegistryArray);
        deserialzeMethodArguments[3] = linkedHashMap;
        try {
            deserialzeMethod.invoke(mapDeserializer, deserialzeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDeserialze3() throws Throwable  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.MapDeserializer"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        ParameterizedTypeImpl parameterizedTypeImpl = ((ParameterizedTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl"));
        java.lang.reflect.Type[] typeArray = new java.lang.reflect.Type[0];
        setField(parameterizedTypeImpl, "actualTypeArguments", typeArray);
        
        Class mapDeserializerClazz = Class.forName("com.alibaba.fastjson.parser.deserializer.MapDeserializer");
        Class defaultJSONParserType = Class.forName("com.alibaba.fastjson.parser.DefaultJSONParser");
        Class parameterizedTypeImplType = Class.forName("java.lang.reflect.Type");
        Class objectType = Class.forName("java.lang.Object");
        Class mapType = Class.forName("java.util.Map");
        Method deserialzeMethod = mapDeserializerClazz.getDeclaredMethod("deserialze", defaultJSONParserType, parameterizedTypeImplType, objectType, mapType);
        deserialzeMethod.setAccessible(true);
        java.lang.Object[] deserialzeMethodArguments = new java.lang.Object[4];
        deserialzeMethodArguments[0] = defaultJSONParser;
        deserialzeMethodArguments[1] = parameterizedTypeImpl;
        deserialzeMethodArguments[2] = null;
        deserialzeMethodArguments[3] = null;
        try {
            deserialzeMethod.invoke(mapDeserializer, deserialzeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDeserialze4() throws Throwable  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.MapDeserializer"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Class mapDeserializerClazz = Class.forName("com.alibaba.fastjson.parser.deserializer.MapDeserializer");
        Class defaultJSONParserType = Class.forName("com.alibaba.fastjson.parser.DefaultJSONParser");
        Class typeType = Class.forName("java.lang.reflect.Type");
        Class objectType = Class.forName("java.lang.Object");
        Class mapType = Class.forName("java.util.Map");
        Method deserialzeMethod = mapDeserializerClazz.getDeclaredMethod("deserialze", defaultJSONParserType, typeType, objectType, mapType);
        deserialzeMethod.setAccessible(true);
        java.lang.Object[] deserialzeMethodArguments = new java.lang.Object[4];
        deserialzeMethodArguments[0] = defaultJSONParser;
        deserialzeMethodArguments[1] = null;
        deserialzeMethodArguments[2] = null;
        deserialzeMethodArguments[3] = null;
        try {
            deserialzeMethod.invoke(mapDeserializer, deserialzeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDeserialze5() throws Throwable  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.MapDeserializer"));
        Object syntheticParameterizedType = createInstance("org.springframework.core.ResolvableType$SyntheticParameterizedType");
        
        Class mapDeserializerClazz = Class.forName("com.alibaba.fastjson.parser.deserializer.MapDeserializer");
        Class defaultJSONParserType = Class.forName("com.alibaba.fastjson.parser.DefaultJSONParser");
        Class syntheticParameterizedTypeType = Class.forName("java.lang.reflect.Type");
        Class objectType = Class.forName("java.lang.Object");
        Class mapType = Class.forName("java.util.Map");
        Method deserialzeMethod = mapDeserializerClazz.getDeclaredMethod("deserialze", defaultJSONParserType, syntheticParameterizedTypeType, objectType, mapType);
        deserialzeMethod.setAccessible(true);
        java.lang.Object[] deserialzeMethodArguments = new java.lang.Object[4];
        deserialzeMethodArguments[0] = null;
        deserialzeMethodArguments[1] = syntheticParameterizedType;
        deserialzeMethodArguments[2] = null;
        deserialzeMethodArguments[3] = null;
        try {
            deserialzeMethod.invoke(mapDeserializer, deserialzeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDeserialze6() throws Throwable  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.MapDeserializer"));
        TypeVariableImpl typeVariableImpl = ((TypeVariableImpl) createInstance("sun.reflect.generics.reflectiveObjects.TypeVariableImpl"));
        java.lang.Object[] collectorTaskArray = createArray("java.util.stream.Nodes$CollectorTask", 0);
        
        mapDeserializer.deserialze(null, typeVariableImpl, collectorTaskArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDeserialze7() throws Throwable  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.MapDeserializer"));
        Class class1 = Object.class;
        
        mapDeserializer.deserialze(null, class1, null);
        
        Class finalClass1 = class1;
        
        Class expectedFinalClass1 = com.alibaba.fastjson.JSONObject.class;
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expectedFinalClass1, finalClass1));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDeserialze8() throws Throwable  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.MapDeserializer"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "token", 0);
        setField(defaultJSONParser, "lexer", jSONScanner);
        Class class1 = Object.class;
        
        mapDeserializer.deserialze(defaultJSONParser, class1, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDeserialze9() throws Throwable  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.MapDeserializer"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        FieldTypeResolver fieldTypeResolverMock = mock(FieldTypeResolver.class);
        setField(defaultJSONParser, "fieldTypeResolver", fieldTypeResolverMock);
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "token", 8);
        setField(defaultJSONParser, "lexer", jSONScanner);
        Class class1 = Object.class;
        
        Object initialDefaultJSONParserFieldTypeResolver = getFieldValue(defaultJSONParser, "fieldTypeResolver");
        
        Object actual = mapDeserializer.deserialze(defaultJSONParser, class1, null);
        
        assertNull(actual);
        
        Object finalDefaultJSONParserFieldTypeResolver = getFieldValue(defaultJSONParser, "fieldTypeResolver");
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerToken = getFieldValue(jSONLexer, "token");
        
        assertFalse(initialDefaultJSONParserFieldTypeResolver == finalDefaultJSONParserFieldTypeResolver);
        
        assertEquals(20, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDeserialze10() throws Throwable  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.MapDeserializer"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '}');
        setField(jSONScanner, "token", 8);
        setField(jSONScanner, "len", 0);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Object actual = mapDeserializer.deserialze(defaultJSONParser, null, null);
        
        assertNull(actual);
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerBp = getFieldValue(jSONLexer, "bp");
        JSONLexer jSONLexer1 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerCh = getFieldValue(jSONLexer1, "ch");
        JSONLexer jSONLexer2 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerToken = getFieldValue(jSONLexer2, "token");
        
        assertEquals(1, finalDefaultJSONParserLexerBp);
        
        assertEquals('\u001A', finalDefaultJSONParserLexerCh);
        
        assertEquals(13, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDeserialze11() throws Throwable  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.MapDeserializer"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", ']');
        setField(jSONScanner, "token", 8);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Object actual = mapDeserializer.deserialze(defaultJSONParser, null, null);
        
        assertNull(actual);
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerBp = getFieldValue(jSONLexer, "bp");
        JSONLexer jSONLexer1 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerCh = getFieldValue(jSONLexer1, "ch");
        JSONLexer jSONLexer2 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerToken = getFieldValue(jSONLexer2, "token");
        
        assertEquals(1, finalDefaultJSONParserLexerBp);
        
        assertEquals('\u001A', finalDefaultJSONParserLexerCh);
        
        assertEquals(15, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateMap1() throws Throwable  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.MapDeserializer"));
        TypeVariableImpl typeVariableImpl = ((TypeVariableImpl) createInstance("sun.reflect.generics.reflectiveObjects.TypeVariableImpl"));
        
        mapDeserializer.createMap(typeVariableImpl);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateMap2() throws Throwable  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.MapDeserializer"));
        
        mapDeserializer.createMap(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateMap3() throws Throwable  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.MapDeserializer"));
        Class class1 = Object.class;
        
        mapDeserializer.createMap(class1);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseMap1() throws Throwable  {
        ParameterizedTypeImpl parameterizedTypeImpl = ((ParameterizedTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl"));
        com.alibaba.fastjson.asm.ByteVector[] byteVectorArray = new com.alibaba.fastjson.asm.ByteVector[0];
        
        MapDeserializer.parseMap(null, null, parameterizedTypeImpl, byteVectorArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseMap2() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        setField(defaultJSONParser, "context", null);
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "bp", Integer.MAX_VALUE);
        setField(jSONScanner, "ch", '\r');
        setField(jSONScanner, "token", 12);
        setField(jSONScanner, "len", 1);
        String string = new String("");
        setField(jSONScanner, "text", string);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        MapDeserializer.parseMap(defaultJSONParser, null, null, null);
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerBp = getFieldValue(jSONLexer, "bp");
        
        assertEquals(Integer.MIN_VALUE, finalDefaultJSONParserLexerBp);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseMap3() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        setField(defaultJSONParser, "context", null);
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "bp", Integer.MAX_VALUE);
        setField(jSONScanner, "ch", '\f');
        setField(jSONScanner, "token", 12);
        setField(jSONScanner, "len", 1);
        String string = new String("");
        setField(jSONScanner, "text", string);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        MapDeserializer.parseMap(defaultJSONParser, null, null, null);
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerBp = getFieldValue(jSONLexer, "bp");
        
        assertEquals(Integer.MIN_VALUE, finalDefaultJSONParserLexerBp);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseMap4() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        setField(defaultJSONParser, "context", null);
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "ch", '\r');
        setField(jSONScanner, "token", 12);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        MapDeserializer.parseMap(defaultJSONParser, null, null, null);
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerCh = getFieldValue(jSONLexer, "ch");
        
        assertEquals('\u001A', finalDefaultJSONParserLexerCh);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseMap5() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        setField(defaultJSONParser, "context", null);
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "bp", Integer.MAX_VALUE);
        setField(jSONScanner, "ch", '/');
        setField(jSONScanner, "token", 12);
        setField(jSONScanner, "len", 1);
        String string = new String("");
        setField(jSONScanner, "text", string);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        MapDeserializer.parseMap(defaultJSONParser, null, null, null);
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerBp = getFieldValue(jSONLexer, "bp");
        
        assertEquals(Integer.MIN_VALUE, finalDefaultJSONParserLexerBp);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseMap6() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        setField(defaultJSONParser, "context", null);
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '/');
        setField(jSONScanner, "token", 12);
        setField(jSONScanner, "len", 0);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        MapDeserializer.parseMap(defaultJSONParser, null, null, null);
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerBp = getFieldValue(jSONLexer, "bp");
        JSONLexer jSONLexer1 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerCh = getFieldValue(jSONLexer1, "ch");
        
        assertEquals(1, finalDefaultJSONParserLexerBp);
        
        assertEquals('\u001A', finalDefaultJSONParserLexerCh);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseMap7() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "token", 0);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        MapDeserializer.parseMap(defaultJSONParser, null, null, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseMap8() throws Throwable  {
        com.alibaba.fastjson.util.ParameterizedTypeImpl parameterizedTypeImpl = ((com.alibaba.fastjson.util.ParameterizedTypeImpl) createInstance("com.alibaba.fastjson.util.ParameterizedTypeImpl"));
        TypeVariableImpl typeVariableImpl = ((TypeVariableImpl) createInstance("sun.reflect.generics.reflectiveObjects.TypeVariableImpl"));
        org.slf4j.LoggerFactory[][] loggerFactoryArray = new org.slf4j.LoggerFactory[0][];
        
        MapDeserializer.parseMap(null, null, parameterizedTypeImpl, typeVariableImpl, loggerFactoryArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseMap9() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "token", 12);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(defaultJSONParser, "config", null);
        
        MapDeserializer.parseMap(defaultJSONParser, null, null, null, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testMapDeserializer1() {
        MapDeserializer actual = new MapDeserializer();
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