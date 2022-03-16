package com.alibaba.fastjson.parser.deserializer;

import org.junit.Test;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import java.lang.reflect.Method;
import sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl;
import java.lang.reflect.Type;
import com.alibaba.fastjson.parser.JSONScanner;
import com.alibaba.fastjson.parser.JSONLexer;
import com.alibaba.fastjson.parser.DefaultExtJSONParser;
import com.alibaba.fastjson.parser.JSONReaderScanner;
import sun.reflect.generics.reflectiveObjects.TypeVariableImpl;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.util.IdentityHashMap;
import java.lang.reflect.Field;
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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
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
        
        Class mapDeserializerClazz = Class.forName("com.alibaba.fastjson.parser.deserializer.MapDeserializer");
        Class defaultJSONParserType = Class.forName("com.alibaba.fastjson.parser.DefaultJSONParser");
        Class typeType = Class.forName("java.lang.reflect.Type");
        Class objectType = Class.forName("java.lang.Object");
        Class mapType = Class.forName("java.util.Map");
        Method deserialzeMethod = mapDeserializerClazz.getDeclaredMethod("deserialze", defaultJSONParserType, typeType, objectType, mapType);
        deserialzeMethod.setAccessible(true);
        java.lang.Object[] deserialzeMethodArguments = new java.lang.Object[4];
        deserialzeMethodArguments[0] = null;
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
        ParameterizedTypeImpl parameterizedTypeImpl = ((ParameterizedTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl"));
        java.lang.reflect.Type[] typeArray = new java.lang.reflect.Type[1];
        setField(parameterizedTypeImpl, "actualTypeArguments", typeArray);
        
        Class mapDeserializerClazz = Class.forName("com.alibaba.fastjson.parser.deserializer.MapDeserializer");
        Class defaultJSONParserType = Class.forName("com.alibaba.fastjson.parser.DefaultJSONParser");
        Class parameterizedTypeImplType = Class.forName("java.lang.reflect.Type");
        Class objectType = Class.forName("java.lang.Object");
        Class mapType = Class.forName("java.util.Map");
        Method deserialzeMethod = mapDeserializerClazz.getDeclaredMethod("deserialze", defaultJSONParserType, parameterizedTypeImplType, objectType, mapType);
        deserialzeMethod.setAccessible(true);
        java.lang.Object[] deserialzeMethodArguments = new java.lang.Object[4];
        deserialzeMethodArguments[0] = null;
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
    
    @Test(timeout = 10000)
    public void testDeserialze5() throws Throwable  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.MapDeserializer"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '\u0000');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 8);
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
        Object actual = deserialzeMethod.invoke(mapDeserializer, deserialzeMethodArguments);
        
        assertNull(actual);
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerToken = getFieldValue(jSONLexer, "token");
        
        assertEquals(20, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDeserialze6() throws Throwable  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.MapDeserializer"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "token", 0);
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
    public void testDeserialze7() throws Throwable  {
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
    public void testDeserialze8() throws Throwable  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.MapDeserializer"));
        
        mapDeserializer.deserialze(null, null, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDeserialze9() throws Throwable  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.MapDeserializer"));
        Class class1 = Object.class;
        java.lang.Object[] ofLongArray = createArray("java.util.stream.Nodes$EmptyNode$OfLong", 0);
        
        mapDeserializer.deserialze(null, class1, ofLongArray);
        
        Class finalClass1 = class1;
        
        Class expectedFinalClass1 = com.alibaba.fastjson.JSONObject.class;
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expectedFinalClass1, finalClass1));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDeserialze10() throws Throwable  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.MapDeserializer"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "ch", '\u001A');
        setField(jSONScanner, "token", 8);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Object actual = mapDeserializer.deserialze(defaultJSONParser, null, null);
        
        assertNull(actual);
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerToken = getFieldValue(jSONLexer, "token");
        
        assertEquals(20, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDeserialze11() throws Throwable  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.MapDeserializer"));
        DefaultExtJSONParser defaultExtJSONParser = ((DefaultExtJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultExtJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "token", 0);
        setField(defaultExtJSONParser, "lexer", jSONScanner);
        Class class1 = Object.class;
        
        mapDeserializer.deserialze(defaultExtJSONParser, class1, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDeserialze12() throws Throwable  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.MapDeserializer"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", Integer.MAX_VALUE);
        setField(jSONScanner, "ch", '}');
        setField(jSONScanner, "token", 8);
        setField(jSONScanner, "len", Integer.MIN_VALUE);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Object actual = mapDeserializer.deserialze(defaultJSONParser, null, null);
        
        assertNull(actual);
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerBp = getFieldValue(jSONLexer, "bp");
        JSONLexer jSONLexer1 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerCh = getFieldValue(jSONLexer1, "ch");
        JSONLexer jSONLexer2 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerToken = getFieldValue(jSONLexer2, "token");
        
        assertEquals(Integer.MIN_VALUE, finalDefaultJSONParserLexerBp);
        
        assertEquals('\u001A', finalDefaultJSONParserLexerCh);
        
        assertEquals(13, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDeserialze13() throws Throwable  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.MapDeserializer"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", Integer.MAX_VALUE);
        setField(jSONScanner, "ch", ',');
        setField(jSONScanner, "token", 8);
        setField(jSONScanner, "len", Integer.MIN_VALUE);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Object actual = mapDeserializer.deserialze(defaultJSONParser, null, null);
        
        assertNull(actual);
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerBp = getFieldValue(jSONLexer, "bp");
        JSONLexer jSONLexer1 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerCh = getFieldValue(jSONLexer1, "ch");
        JSONLexer jSONLexer2 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerToken = getFieldValue(jSONLexer2, "token");
        
        assertEquals(Integer.MIN_VALUE, finalDefaultJSONParserLexerBp);
        
        assertEquals('\u001A', finalDefaultJSONParserLexerCh);
        
        assertEquals(16, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDeserialze14() throws Throwable  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.MapDeserializer"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '.');
        setField(jSONScanner, "pos", 0);
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
        
        assertEquals(25, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDeserialze15() throws Throwable  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.MapDeserializer"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", ')');
        setField(jSONScanner, "pos", 0);
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
        
        assertEquals(11, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDeserialze16() throws Throwable  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.MapDeserializer"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", ';');
        setField(jSONScanner, "pos", 0);
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
        
        assertEquals(24, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDeserialze17() throws Throwable  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.MapDeserializer"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '{');
        setField(jSONScanner, "pos", 0);
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
        
        assertEquals(12, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDeserialze18() throws Throwable  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.MapDeserializer"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        FieldTypeResolver fieldTypeResolverMock = mock(FieldTypeResolver.class);
        setField(defaultJSONParser, "fieldTypeResolver", fieldTypeResolverMock);
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '\u0000');
        setField(jSONScanner, "pos", 0);
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
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDeserialze19() throws Throwable  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.MapDeserializer"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '\'');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 8);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        mapDeserializer.deserialze(defaultJSONParser, null, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDeserialze20() throws Throwable  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.MapDeserializer"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '(');
        setField(jSONScanner, "pos", 0);
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
        
        assertEquals(10, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDeserialze21() throws Throwable  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.MapDeserializer"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "np", 0);
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '-');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 8);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Object actual = mapDeserializer.deserialze(defaultJSONParser, null, null);
        
        assertNull(actual);
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerSp = getFieldValue(jSONLexer, "sp");
        JSONLexer jSONLexer1 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerBp = getFieldValue(jSONLexer1, "bp");
        JSONLexer jSONLexer2 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerCh = getFieldValue(jSONLexer2, "ch");
        JSONLexer jSONLexer3 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerToken = getFieldValue(jSONLexer3, "token");
        
        assertEquals(1, finalDefaultJSONParserLexerSp);
        
        assertEquals(1, finalDefaultJSONParserLexerBp);
        
        assertEquals('\u001A', finalDefaultJSONParserLexerCh);
        
        assertEquals(2, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDeserialze22() throws Throwable  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.MapDeserializer"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", Integer.MAX_VALUE);
        setField(jSONScanner, "ch", '\f');
        setField(jSONScanner, "token", 8);
        setField(jSONScanner, "len", 1);
        String string = new String("");
        setField(jSONScanner, "text", string);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        mapDeserializer.deserialze(defaultJSONParser, null, null);
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerBp = getFieldValue(jSONLexer, "bp");
        
        assertEquals(Integer.MIN_VALUE, finalDefaultJSONParserLexerBp);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDeserialze23() throws Throwable  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.MapDeserializer"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        FieldTypeResolver fieldTypeResolverMock = mock(FieldTypeResolver.class);
        setField(defaultJSONParser, "fieldTypeResolver", fieldTypeResolverMock);
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "ch", '\f');
        setField(jSONScanner, "token", 8);
        setField(defaultJSONParser, "lexer", jSONScanner);
        Class class1 = Object.class;
        
        Object initialDefaultJSONParserFieldTypeResolver = getFieldValue(defaultJSONParser, "fieldTypeResolver");
        
        Object actual = mapDeserializer.deserialze(defaultJSONParser, class1, null);
        
        assertNull(actual);
        
        Object finalDefaultJSONParserFieldTypeResolver = getFieldValue(defaultJSONParser, "fieldTypeResolver");
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerCh = getFieldValue(jSONLexer, "ch");
        JSONLexer jSONLexer1 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerToken = getFieldValue(jSONLexer1, "token");
        
        assertFalse(initialDefaultJSONParserFieldTypeResolver == finalDefaultJSONParserFieldTypeResolver);
        
        assertEquals('\u001A', finalDefaultJSONParserLexerCh);
        
        assertEquals(20, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDeserialze24() throws Throwable  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.MapDeserializer"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '+');
        setField(jSONScanner, "pos", 0);
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
        
        assertEquals(2, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDeserialze25() throws Throwable  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.MapDeserializer"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", 'n');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 8);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        mapDeserializer.deserialze(defaultJSONParser, null, null);
        
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
    public void testDeserialze26() throws Throwable  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.MapDeserializer"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 1);
        setField(jSONScanner, "ch", '/');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 8);
        setField(jSONScanner, "len", 3);
        String string = new String("");
        setField(jSONScanner, "text", string);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        mapDeserializer.deserialze(defaultJSONParser, null, null);
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerBp = getFieldValue(jSONLexer, "bp");
        JSONLexer jSONLexer1 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerPos = getFieldValue(jSONLexer1, "pos");
        
        assertEquals(2, finalDefaultJSONParserLexerBp);
        
        assertEquals(1, finalDefaultJSONParserLexerPos);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDeserialze27() throws Throwable  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.MapDeserializer"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        FieldTypeResolver fieldTypeResolverMock = mock(FieldTypeResolver.class);
        setField(defaultJSONParser, "fieldTypeResolver", fieldTypeResolverMock);
        JSONReaderScanner jSONReaderScanner = ((JSONReaderScanner) createInstance("com.alibaba.fastjson.parser.JSONReaderScanner"));
        setField(jSONReaderScanner, "sp", 0);
        setField(jSONReaderScanner, "ch", '\r');
        setField(jSONReaderScanner, "token", 8);
        setField(defaultJSONParser, "lexer", jSONReaderScanner);
        Class class1 = Object.class;
        
        Object initialDefaultJSONParserFieldTypeResolver = getFieldValue(defaultJSONParser, "fieldTypeResolver");
        
        mapDeserializer.deserialze(defaultJSONParser, class1, null);
        
        Object finalDefaultJSONParserFieldTypeResolver = getFieldValue(defaultJSONParser, "fieldTypeResolver");
        
        assertFalse(initialDefaultJSONParserFieldTypeResolver == finalDefaultJSONParserFieldTypeResolver);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDeserialze28() throws Throwable  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.MapDeserializer"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "hasSpecial", false);
        setField(jSONScanner, "np", 0);
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '\"');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 8);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        mapDeserializer.deserialze(defaultJSONParser, null, null);
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerBp = getFieldValue(jSONLexer, "bp");
        JSONLexer jSONLexer1 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerCh = getFieldValue(jSONLexer1, "ch");
        
        assertEquals(1, finalDefaultJSONParserLexerBp);
        
        assertEquals('\u001A', finalDefaultJSONParserLexerCh);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDeserialze29() throws Throwable  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.MapDeserializer"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        FieldTypeResolver fieldTypeResolverMock = mock(FieldTypeResolver.class);
        setField(defaultJSONParser, "fieldTypeResolver", fieldTypeResolverMock);
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "ch", ']');
        setField(jSONScanner, "token", 8);
        setField(defaultJSONParser, "lexer", jSONScanner);
        Class class1 = Object.class;
        
        Object initialDefaultJSONParserFieldTypeResolver = getFieldValue(defaultJSONParser, "fieldTypeResolver");
        
        Object actual = mapDeserializer.deserialze(defaultJSONParser, class1, null);
        
        assertNull(actual);
        
        Object finalDefaultJSONParserFieldTypeResolver = getFieldValue(defaultJSONParser, "fieldTypeResolver");
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerCh = getFieldValue(jSONLexer, "ch");
        JSONLexer jSONLexer1 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerToken = getFieldValue(jSONLexer1, "token");
        
        assertFalse(initialDefaultJSONParserFieldTypeResolver == finalDefaultJSONParserFieldTypeResolver);
        
        assertEquals('\u001A', finalDefaultJSONParserLexerCh);
        
        assertEquals(15, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDeserialze30() throws Throwable  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.MapDeserializer"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", 'f');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 8);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        mapDeserializer.deserialze(defaultJSONParser, null, null);
        
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
    public void testDeserialze31() throws Throwable  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.MapDeserializer"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", 'N');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 8);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        mapDeserializer.deserialze(defaultJSONParser, null, null);
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerSp = getFieldValue(jSONLexer, "sp");
        JSONLexer jSONLexer1 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerBp = getFieldValue(jSONLexer1, "bp");
        JSONLexer jSONLexer2 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerCh = getFieldValue(jSONLexer2, "ch");
        
        assertEquals(1, finalDefaultJSONParserLexerSp);
        
        assertEquals(1, finalDefaultJSONParserLexerBp);
        
        assertEquals('\u001A', finalDefaultJSONParserLexerCh);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDeserialze32() throws Throwable  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.MapDeserializer"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", 't');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 8);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        mapDeserializer.deserialze(defaultJSONParser, null, null);
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerBp = getFieldValue(jSONLexer, "bp");
        JSONLexer jSONLexer1 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerCh = getFieldValue(jSONLexer1, "ch");
        
        assertEquals(1, finalDefaultJSONParserLexerBp);
        
        assertEquals('\u001A', finalDefaultJSONParserLexerCh);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDeserialze33() throws Throwable  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.MapDeserializer"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "np", 0);
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '2');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 8);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Object actual = mapDeserializer.deserialze(defaultJSONParser, null, null);
        
        assertNull(actual);
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerSp = getFieldValue(jSONLexer, "sp");
        JSONLexer jSONLexer1 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerBp = getFieldValue(jSONLexer1, "bp");
        JSONLexer jSONLexer2 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerCh = getFieldValue(jSONLexer2, "ch");
        JSONLexer jSONLexer3 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerToken = getFieldValue(jSONLexer3, "token");
        
        assertEquals(1, finalDefaultJSONParserLexerSp);
        
        assertEquals(1, finalDefaultJSONParserLexerBp);
        
        assertEquals('\u001A', finalDefaultJSONParserLexerCh);
        
        assertEquals(2, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDeserialze34() throws Throwable  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.MapDeserializer"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", ':');
        setField(jSONScanner, "pos", 0);
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
        
        assertEquals(17, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDeserialze35() throws Throwable  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.MapDeserializer"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '[');
        setField(jSONScanner, "pos", 0);
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
        
        assertEquals(14, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDeserialze36() throws Throwable  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.MapDeserializer"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '/');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 8);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        mapDeserializer.deserialze(defaultJSONParser, null, null);
        
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
    public void testCreateMap4() throws Throwable  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.MapDeserializer"));
        com.alibaba.fastjson.util.ParameterizedTypeImpl parameterizedTypeImpl = ((com.alibaba.fastjson.util.ParameterizedTypeImpl) createInstance("com.alibaba.fastjson.util.ParameterizedTypeImpl"));
        Class class1 = Object.class;
        setField(parameterizedTypeImpl, "rawType", class1);
        java.lang.reflect.Type[] typeArray = new java.lang.reflect.Type[0];
        setField(parameterizedTypeImpl, "actualTypeArguments", typeArray);
        
        mapDeserializer.createMap(parameterizedTypeImpl);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseMap1() throws Throwable  {
        MapDeserializer.parseMap(null, null, null, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseMap2() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        setField(defaultJSONParser, "context", null);
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '\f');
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
    public void testParseMap3() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        setField(defaultJSONParser, "context", null);
        JSONReaderScanner jSONReaderScanner = ((JSONReaderScanner) createInstance("com.alibaba.fastjson.parser.JSONReaderScanner"));
        setField(jSONReaderScanner, "bp", 7);
        setField(jSONReaderScanner, "ch", ' ');
        setField(jSONReaderScanner, "token", 12);
        setField(jSONReaderScanner, "bufLength", 9);
        char[] charArray = new char[9];
        setField(jSONReaderScanner, "buf", charArray);
        setField(defaultJSONParser, "lexer", jSONReaderScanner);
        
        MapDeserializer.parseMap(defaultJSONParser, null, null, null);
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerBp = getFieldValue(jSONLexer, "bp");
        JSONLexer jSONLexer1 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerCh = getFieldValue(jSONLexer1, "ch");
        
        assertEquals(8, finalDefaultJSONParserLexerBp);
        
        assertEquals('\u0000', finalDefaultJSONParserLexerCh);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseMap4() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        setField(defaultJSONParser, "context", null);
        JSONReaderScanner jSONReaderScanner = ((JSONReaderScanner) createInstance("com.alibaba.fastjson.parser.JSONReaderScanner"));
        setField(jSONReaderScanner, "np", 0);
        setField(jSONReaderScanner, "sp", 0);
        setField(jSONReaderScanner, "bp", 1073741825);
        setField(jSONReaderScanner, "ch", ' ');
        setField(jSONReaderScanner, "token", 12);
        setField(jSONReaderScanner, "bufLength", 3);
        char[] charArray = new char[0];
        setField(jSONReaderScanner, "buf", charArray);
        setField(defaultJSONParser, "lexer", jSONReaderScanner);
        
        MapDeserializer.parseMap(defaultJSONParser, null, null, null);
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerNp = getFieldValue(jSONLexer, "np");
        JSONLexer jSONLexer1 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerBp = getFieldValue(jSONLexer1, "bp");
        JSONLexer jSONLexer2 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerBuf = getFieldValue(jSONLexer2, "buf");
        
        assertEquals(-1, finalDefaultJSONParserLexerNp);
        
        assertEquals(0, finalDefaultJSONParserLexerBp);
        
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseMap5() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        setField(defaultJSONParser, "context", null);
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "bp", -1);
        setField(jSONScanner, "ch", '/');
        setField(jSONScanner, "token", 12);
        setField(jSONScanner, "len", 1);
        String string = new String("/");
        setField(jSONScanner, "text", string);
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
    public void testParseMap6() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        setField(defaultJSONParser, "context", null);
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "bp", -1);
        setField(jSONScanner, "ch", '/');
        setField(jSONScanner, "token", 12);
        setField(jSONScanner, "len", 1);
        String string = new String("*");
        setField(jSONScanner, "text", string);
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
        setField(defaultJSONParser, "context", null);
        JSONReaderScanner jSONReaderScanner = ((JSONReaderScanner) createInstance("com.alibaba.fastjson.parser.JSONReaderScanner"));
        setField(jSONReaderScanner, "sp", 2146959360);
        setField(jSONReaderScanner, "bp", 1073741824);
        setField(jSONReaderScanner, "ch", ' ');
        setField(jSONReaderScanner, "token", 12);
        setField(jSONReaderScanner, "bufLength", 142606336);
        char[] charArray = new char[9];
        setField(jSONReaderScanner, "buf", charArray);
        setField(defaultJSONParser, "lexer", jSONReaderScanner);
        
        MapDeserializer.parseMap(defaultJSONParser, null, null, null);
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerBp = getFieldValue(jSONLexer, "bp");
        
        assertEquals(1073741825, finalDefaultJSONParserLexerBp);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseMap8() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "token", 0);
        setField(defaultJSONParser, "lexer", jSONScanner);
        java.lang.Object[] ofLongArray = createArray("java.util.stream.StreamSpliterators$SliceSpliterator$OfLong", 0);
        
        MapDeserializer.parseMap(defaultJSONParser, null, null, ofLongArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseMap9() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        setField(defaultJSONParser, "context", null);
        JSONReaderScanner jSONReaderScanner = ((JSONReaderScanner) createInstance("com.alibaba.fastjson.parser.JSONReaderScanner"));
        setField(jSONReaderScanner, "bp", 0);
        setField(jSONReaderScanner, "ch", ' ');
        setField(jSONReaderScanner, "token", 12);
        setField(jSONReaderScanner, "bufLength", -1);
        setField(defaultJSONParser, "lexer", jSONReaderScanner);
        
        MapDeserializer.parseMap(defaultJSONParser, null, null, null);
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerBp = getFieldValue(jSONLexer, "bp");
        
        assertEquals(34952, finalDefaultJSONParserLexerBp);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseMap10() throws Throwable  {
        MapDeserializer.parseMap(null, null, null, null, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseMap11() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "token", 12);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(defaultJSONParser, "config", null);
        
        MapDeserializer.parseMap(defaultJSONParser, null, null, null, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseMap12() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "token", 12);
        setField(defaultJSONParser, "lexer", jSONScanner);
        ParserConfig parserConfig = ((ParserConfig) createInstance("com.alibaba.fastjson.parser.ParserConfig"));
        IdentityHashMap identityHashMap = ((IdentityHashMap) createInstance("com.alibaba.fastjson.util.IdentityHashMap"));
        setField(identityHashMap, "indexMask", 1073741862);
        java.lang.Object[] entryArray = createArray("com.alibaba.fastjson.util.IdentityHashMap$Entry", 39);
        setField(identityHashMap, "buckets", entryArray);
        setField(parserConfig, "deserializers", identityHashMap);
        setField(defaultJSONParser, "config", parserConfig);
        
        MapDeserializer.parseMap(defaultJSONParser, null, null, null, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseMap13() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "token", 0);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        MapDeserializer.parseMap(defaultJSONParser, null, null, null, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testMapDeserializer1() {
        MapDeserializer actual = new MapDeserializer();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testMapDeserializer2() {
        MapDeserializer actual = new MapDeserializer();
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
