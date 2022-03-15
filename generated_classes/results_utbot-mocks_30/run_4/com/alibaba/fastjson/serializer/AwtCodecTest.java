package com.alibaba.fastjson.serializer;

import org.junit.Test;
import sun.reflect.generics.reflectiveObjects.TypeVariableImpl;
import org.slf4j.LoggerFactory;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.JSONLexer;
import java.lang.reflect.Method;
import java.awt.Font;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.Point;
import com.alibaba.fastjson.parser.ParseContext;
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

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.Assert.assertFalse;

public class AwtCodecTest {
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDeserialze1() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        TypeVariableImpl typeVariableImpl = ((TypeVariableImpl) createInstance("sun.reflect.generics.reflectiveObjects.TypeVariableImpl"));
        org.slf4j.LoggerFactory[] loggerFactoryArray = new org.slf4j.LoggerFactory[0];
        
        awtCodec.deserialze(null, typeVariableImpl, loggerFactoryArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDeserialze2() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(8);
        setField(defaultJSONParserMock, "lexer", jSONLexerMock);
        
        Object actual = awtCodec.deserialze(defaultJSONParserMock, null, null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDeserialze3() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(0, 0, 0);
        setField(defaultJSONParserMock, "lexer", jSONLexerMock);
        
        awtCodec.deserialze(defaultJSONParserMock, null, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetFastMatchToken1() throws Throwable  {
        AwtCodec awtCodec = new AwtCodec();
        
        int actual = awtCodec.getFastMatchToken();
        
        assertEquals(12, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetFastMatchToken2() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        
        int actual = awtCodec.getFastMatchToken();
        
        assertEquals(12, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseFont1() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        
        Class awtCodecClazz = Class.forName("com.alibaba.fastjson.serializer.AwtCodec");
        Class defaultJSONParserType = Class.forName("com.alibaba.fastjson.parser.DefaultJSONParser");
        Method parseFontMethod = awtCodecClazz.getDeclaredMethod("parseFont", defaultJSONParserType);
        parseFontMethod.setAccessible(true);
        java.lang.Object[] parseFontMethodArguments = new java.lang.Object[1];
        parseFontMethodArguments[0] = null;
        try {
            parseFontMethod.invoke(awtCodec, parseFontMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseFont2() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(0, 0);
        setField(defaultJSONParserMock, "lexer", jSONLexerMock);
        
        Class awtCodecClazz = Class.forName("com.alibaba.fastjson.serializer.AwtCodec");
        Class defaultJSONParserMockType = Class.forName("com.alibaba.fastjson.parser.DefaultJSONParser");
        Method parseFontMethod = awtCodecClazz.getDeclaredMethod("parseFont", defaultJSONParserMockType);
        parseFontMethod.setAccessible(true);
        java.lang.Object[] parseFontMethodArguments = new java.lang.Object[1];
        parseFontMethodArguments[0] = defaultJSONParserMock;
        try {
            parseFontMethod.invoke(awtCodec, parseFontMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseFont3() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(0, 4);
        when(jSONLexerMock.stringVal()).thenReturn(((String) null));
        setField(defaultJSONParserMock, "lexer", jSONLexerMock);
        
        Class awtCodecClazz = Class.forName("com.alibaba.fastjson.serializer.AwtCodec");
        Class defaultJSONParserMockType = Class.forName("com.alibaba.fastjson.parser.DefaultJSONParser");
        Method parseFontMethod = awtCodecClazz.getDeclaredMethod("parseFont", defaultJSONParserMockType);
        parseFontMethod.setAccessible(true);
        java.lang.Object[] parseFontMethodArguments = new java.lang.Object[1];
        parseFontMethodArguments[0] = defaultJSONParserMock;
        try {
            parseFontMethod.invoke(awtCodec, parseFontMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testParseFont4() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(13);
        setField(defaultJSONParserMock, "lexer", jSONLexerMock);
        
        Class awtCodecClazz = Class.forName("com.alibaba.fastjson.serializer.AwtCodec");
        Class defaultJSONParserMockType = Class.forName("com.alibaba.fastjson.parser.DefaultJSONParser");
        Method parseFontMethod = awtCodecClazz.getDeclaredMethod("parseFont", defaultJSONParserMockType);
        parseFontMethod.setAccessible(true);
        java.lang.Object[] parseFontMethodArguments = new java.lang.Object[1];
        parseFontMethodArguments[0] = defaultJSONParserMock;
        Font actual = ((Font) parseFontMethod.invoke(awtCodec, parseFontMethodArguments));
        
        Font expected = ((Font) createInstance("java.awt.Font"));
        setField(expected, "fontSerializedDataVersion", 1);
        setField(expected, "createdFont", false);
        setField(expected, "pointSize", 0.0f);
        setField(expected, "size", 0);
        setField(expected, "style", 0);
        String string = new String("Default");
        setField(expected, "name", string);
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseColor1() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        
        Class awtCodecClazz = Class.forName("com.alibaba.fastjson.serializer.AwtCodec");
        Class defaultJSONParserType = Class.forName("com.alibaba.fastjson.parser.DefaultJSONParser");
        Method parseColorMethod = awtCodecClazz.getDeclaredMethod("parseColor", defaultJSONParserType);
        parseColorMethod.setAccessible(true);
        java.lang.Object[] parseColorMethodArguments = new java.lang.Object[1];
        parseColorMethodArguments[0] = null;
        try {
            parseColorMethod.invoke(awtCodec, parseColorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseColor2() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(0, 0);
        setField(defaultJSONParserMock, "lexer", jSONLexerMock);
        
        Class awtCodecClazz = Class.forName("com.alibaba.fastjson.serializer.AwtCodec");
        Class defaultJSONParserMockType = Class.forName("com.alibaba.fastjson.parser.DefaultJSONParser");
        Method parseColorMethod = awtCodecClazz.getDeclaredMethod("parseColor", defaultJSONParserMockType);
        parseColorMethod.setAccessible(true);
        java.lang.Object[] parseColorMethodArguments = new java.lang.Object[1];
        parseColorMethodArguments[0] = defaultJSONParserMock;
        try {
            parseColorMethod.invoke(awtCodec, parseColorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseColor3() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(0, 4, 2);
        when(jSONLexerMock.stringVal()).thenReturn(((String) null));
        when(jSONLexerMock.intValue()).thenReturn(0);
        setField(defaultJSONParserMock, "lexer", jSONLexerMock);
        
        Class awtCodecClazz = Class.forName("com.alibaba.fastjson.serializer.AwtCodec");
        Class defaultJSONParserMockType = Class.forName("com.alibaba.fastjson.parser.DefaultJSONParser");
        Method parseColorMethod = awtCodecClazz.getDeclaredMethod("parseColor", defaultJSONParserMockType);
        parseColorMethod.setAccessible(true);
        java.lang.Object[] parseColorMethodArguments = new java.lang.Object[1];
        parseColorMethodArguments[0] = defaultJSONParserMock;
        try {
            parseColorMethod.invoke(awtCodec, parseColorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseColor4() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(0, 4, 0);
        when(jSONLexerMock.stringVal()).thenReturn(((String) null));
        setField(defaultJSONParserMock, "lexer", jSONLexerMock);
        
        Class awtCodecClazz = Class.forName("com.alibaba.fastjson.serializer.AwtCodec");
        Class defaultJSONParserMockType = Class.forName("com.alibaba.fastjson.parser.DefaultJSONParser");
        Method parseColorMethod = awtCodecClazz.getDeclaredMethod("parseColor", defaultJSONParserMockType);
        parseColorMethod.setAccessible(true);
        java.lang.Object[] parseColorMethodArguments = new java.lang.Object[1];
        parseColorMethodArguments[0] = defaultJSONParserMock;
        try {
            parseColorMethod.invoke(awtCodec, parseColorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testParseColor5() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(13);
        setField(defaultJSONParserMock, "lexer", jSONLexerMock);
        
        Class awtCodecClazz = Class.forName("com.alibaba.fastjson.serializer.AwtCodec");
        Class defaultJSONParserMockType = Class.forName("com.alibaba.fastjson.parser.DefaultJSONParser");
        Method parseColorMethod = awtCodecClazz.getDeclaredMethod("parseColor", defaultJSONParserMockType);
        parseColorMethod.setAccessible(true);
        java.lang.Object[] parseColorMethodArguments = new java.lang.Object[1];
        parseColorMethodArguments[0] = defaultJSONParserMock;
        Color actual = ((Color) parseColorMethod.invoke(awtCodec, parseColorMethodArguments));
        
        Color expected = ((Color) createInstance("java.awt.Color"));
        setField(expected, "cs", null);
        setField(expected, "falpha", 0.0f);
        setField(expected, "fvalue", null);
        setField(expected, "frgbvalue", null);
        setField(expected, "value", 0);
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseColor6() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(0, 4, 2, 16, 0, 0);
        String string = new String("R");
        when(jSONLexerMock.stringVal()).thenReturn(string);
        when(jSONLexerMock.intValue()).thenReturn(0);
        setField(defaultJSONParserMock, "lexer", jSONLexerMock);
        
        Class awtCodecClazz = Class.forName("com.alibaba.fastjson.serializer.AwtCodec");
        Class defaultJSONParserMockType = Class.forName("com.alibaba.fastjson.parser.DefaultJSONParser");
        Method parseColorMethod = awtCodecClazz.getDeclaredMethod("parseColor", defaultJSONParserMockType);
        parseColorMethod.setAccessible(true);
        java.lang.Object[] parseColorMethodArguments = new java.lang.Object[1];
        parseColorMethodArguments[0] = defaultJSONParserMock;
        try {
            parseColorMethod.invoke(awtCodec, parseColorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseColor7() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(0, 4, 2, 0, 0, 0);
        String string = new String("R");
        when(jSONLexerMock.stringVal()).thenReturn(string);
        when(jSONLexerMock.intValue()).thenReturn(0);
        setField(defaultJSONParserMock, "lexer", jSONLexerMock);
        
        Class awtCodecClazz = Class.forName("com.alibaba.fastjson.serializer.AwtCodec");
        Class defaultJSONParserMockType = Class.forName("com.alibaba.fastjson.parser.DefaultJSONParser");
        Method parseColorMethod = awtCodecClazz.getDeclaredMethod("parseColor", defaultJSONParserMockType);
        parseColorMethod.setAccessible(true);
        java.lang.Object[] parseColorMethodArguments = new java.lang.Object[1];
        parseColorMethodArguments[0] = defaultJSONParserMock;
        try {
            parseColorMethod.invoke(awtCodec, parseColorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseRectangle1() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        
        Class awtCodecClazz = Class.forName("com.alibaba.fastjson.serializer.AwtCodec");
        Class defaultJSONParserType = Class.forName("com.alibaba.fastjson.parser.DefaultJSONParser");
        Method parseRectangleMethod = awtCodecClazz.getDeclaredMethod("parseRectangle", defaultJSONParserType);
        parseRectangleMethod.setAccessible(true);
        java.lang.Object[] parseRectangleMethodArguments = new java.lang.Object[1];
        parseRectangleMethodArguments[0] = null;
        try {
            parseRectangleMethod.invoke(awtCodec, parseRectangleMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseRectangle2() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(0, 0);
        setField(defaultJSONParserMock, "lexer", jSONLexerMock);
        
        Class awtCodecClazz = Class.forName("com.alibaba.fastjson.serializer.AwtCodec");
        Class defaultJSONParserMockType = Class.forName("com.alibaba.fastjson.parser.DefaultJSONParser");
        Method parseRectangleMethod = awtCodecClazz.getDeclaredMethod("parseRectangle", defaultJSONParserMockType);
        parseRectangleMethod.setAccessible(true);
        java.lang.Object[] parseRectangleMethodArguments = new java.lang.Object[1];
        parseRectangleMethodArguments[0] = defaultJSONParserMock;
        try {
            parseRectangleMethod.invoke(awtCodec, parseRectangleMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseRectangle3() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(0, 4, 2);
        when(jSONLexerMock.stringVal()).thenReturn(((String) null));
        when(jSONLexerMock.intValue()).thenReturn(0);
        setField(defaultJSONParserMock, "lexer", jSONLexerMock);
        
        Class awtCodecClazz = Class.forName("com.alibaba.fastjson.serializer.AwtCodec");
        Class defaultJSONParserMockType = Class.forName("com.alibaba.fastjson.parser.DefaultJSONParser");
        Method parseRectangleMethod = awtCodecClazz.getDeclaredMethod("parseRectangle", defaultJSONParserMockType);
        parseRectangleMethod.setAccessible(true);
        java.lang.Object[] parseRectangleMethodArguments = new java.lang.Object[1];
        parseRectangleMethodArguments[0] = defaultJSONParserMock;
        try {
            parseRectangleMethod.invoke(awtCodec, parseRectangleMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseRectangle4() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(0, 4, 0);
        when(jSONLexerMock.stringVal()).thenReturn(((String) null));
        setField(defaultJSONParserMock, "lexer", jSONLexerMock);
        
        Class awtCodecClazz = Class.forName("com.alibaba.fastjson.serializer.AwtCodec");
        Class defaultJSONParserMockType = Class.forName("com.alibaba.fastjson.parser.DefaultJSONParser");
        Method parseRectangleMethod = awtCodecClazz.getDeclaredMethod("parseRectangle", defaultJSONParserMockType);
        parseRectangleMethod.setAccessible(true);
        java.lang.Object[] parseRectangleMethodArguments = new java.lang.Object[1];
        parseRectangleMethodArguments[0] = defaultJSONParserMock;
        try {
            parseRectangleMethod.invoke(awtCodec, parseRectangleMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseRectangle5() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(0, 4, 3);
        when(jSONLexerMock.stringVal()).thenReturn(((String) null));
        when(jSONLexerMock.floatValue()).thenReturn(java.lang.Float.NaN);
        setField(defaultJSONParserMock, "lexer", jSONLexerMock);
        
        Class awtCodecClazz = Class.forName("com.alibaba.fastjson.serializer.AwtCodec");
        Class defaultJSONParserMockType = Class.forName("com.alibaba.fastjson.parser.DefaultJSONParser");
        Method parseRectangleMethod = awtCodecClazz.getDeclaredMethod("parseRectangle", defaultJSONParserMockType);
        parseRectangleMethod.setAccessible(true);
        java.lang.Object[] parseRectangleMethodArguments = new java.lang.Object[1];
        parseRectangleMethodArguments[0] = defaultJSONParserMock;
        try {
            parseRectangleMethod.invoke(awtCodec, parseRectangleMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testParseRectangle6() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(13);
        setField(defaultJSONParserMock, "lexer", jSONLexerMock);
        
        Class awtCodecClazz = Class.forName("com.alibaba.fastjson.serializer.AwtCodec");
        Class defaultJSONParserMockType = Class.forName("com.alibaba.fastjson.parser.DefaultJSONParser");
        Method parseRectangleMethod = awtCodecClazz.getDeclaredMethod("parseRectangle", defaultJSONParserMockType);
        parseRectangleMethod.setAccessible(true);
        java.lang.Object[] parseRectangleMethodArguments = new java.lang.Object[1];
        parseRectangleMethodArguments[0] = defaultJSONParserMock;
        Rectangle actual = ((Rectangle) parseRectangleMethod.invoke(awtCodec, parseRectangleMethodArguments));
        
        Rectangle expected = new Rectangle();
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseRectangle7() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(0, 4, 2, 16, 0, 0);
        String string = new String("X");
        when(jSONLexerMock.stringVal()).thenReturn(string);
        when(jSONLexerMock.intValue()).thenReturn(0);
        setField(defaultJSONParserMock, "lexer", jSONLexerMock);
        
        Class awtCodecClazz = Class.forName("com.alibaba.fastjson.serializer.AwtCodec");
        Class defaultJSONParserMockType = Class.forName("com.alibaba.fastjson.parser.DefaultJSONParser");
        Method parseRectangleMethod = awtCodecClazz.getDeclaredMethod("parseRectangle", defaultJSONParserMockType);
        parseRectangleMethod.setAccessible(true);
        java.lang.Object[] parseRectangleMethodArguments = new java.lang.Object[1];
        parseRectangleMethodArguments[0] = defaultJSONParserMock;
        try {
            parseRectangleMethod.invoke(awtCodec, parseRectangleMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseRectangle8() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(0, 4, 2, 0, 0, 0);
        String string = new String("X");
        when(jSONLexerMock.stringVal()).thenReturn(string);
        when(jSONLexerMock.intValue()).thenReturn(0);
        setField(defaultJSONParserMock, "lexer", jSONLexerMock);
        
        Class awtCodecClazz = Class.forName("com.alibaba.fastjson.serializer.AwtCodec");
        Class defaultJSONParserMockType = Class.forName("com.alibaba.fastjson.parser.DefaultJSONParser");
        Method parseRectangleMethod = awtCodecClazz.getDeclaredMethod("parseRectangle", defaultJSONParserMockType);
        parseRectangleMethod.setAccessible(true);
        java.lang.Object[] parseRectangleMethodArguments = new java.lang.Object[1];
        parseRectangleMethodArguments[0] = defaultJSONParserMock;
        try {
            parseRectangleMethod.invoke(awtCodec, parseRectangleMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParsePoint1() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        java.lang.Object[] basicPopupMenuListenerArray = createArray("javax.swing.plaf.basic.BasicPopupMenuUI$BasicPopupMenuListener", 0);
        
        Class awtCodecClazz = Class.forName("com.alibaba.fastjson.serializer.AwtCodec");
        Class defaultJSONParserType = Class.forName("com.alibaba.fastjson.parser.DefaultJSONParser");
        Class basicPopupMenuListenerArrayType = Class.forName("java.lang.Object");
        Method parsePointMethod = awtCodecClazz.getDeclaredMethod("parsePoint", defaultJSONParserType, basicPopupMenuListenerArrayType);
        parsePointMethod.setAccessible(true);
        java.lang.Object[] parsePointMethodArguments = new java.lang.Object[2];
        parsePointMethodArguments[0] = null;
        parsePointMethodArguments[1] = ((Object) basicPopupMenuListenerArray);
        try {
            parsePointMethod.invoke(awtCodec, parsePointMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParsePoint2() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(0, 0);
        setField(defaultJSONParserMock, "lexer", jSONLexerMock);
        
        Class awtCodecClazz = Class.forName("com.alibaba.fastjson.serializer.AwtCodec");
        Class defaultJSONParserMockType = Class.forName("com.alibaba.fastjson.parser.DefaultJSONParser");
        Class objectType = Class.forName("java.lang.Object");
        Method parsePointMethod = awtCodecClazz.getDeclaredMethod("parsePoint", defaultJSONParserMockType, objectType);
        parsePointMethod.setAccessible(true);
        java.lang.Object[] parsePointMethodArguments = new java.lang.Object[2];
        parsePointMethodArguments[0] = defaultJSONParserMock;
        parsePointMethodArguments[1] = null;
        try {
            parsePointMethod.invoke(awtCodec, parsePointMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testParsePoint3() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(13);
        setField(defaultJSONParserMock, "lexer", jSONLexerMock);
        
        Class awtCodecClazz = Class.forName("com.alibaba.fastjson.serializer.AwtCodec");
        Class defaultJSONParserMockType = Class.forName("com.alibaba.fastjson.parser.DefaultJSONParser");
        Class objectType = Class.forName("java.lang.Object");
        Method parsePointMethod = awtCodecClazz.getDeclaredMethod("parsePoint", defaultJSONParserMockType, objectType);
        parsePointMethod.setAccessible(true);
        java.lang.Object[] parsePointMethodArguments = new java.lang.Object[2];
        parsePointMethodArguments[0] = defaultJSONParserMock;
        parsePointMethodArguments[1] = null;
        Point actual = ((Point) parsePointMethod.invoke(awtCodec, parsePointMethodArguments));
        
        Point expected = new Point();
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseRef1() throws Throwable  {
        AwtCodec awtCodec = new AwtCodec();
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        Object object = new Object();
        
        Class awtCodecClazz = Class.forName("com.alibaba.fastjson.serializer.AwtCodec");
        Class defaultJSONParserType = Class.forName("com.alibaba.fastjson.parser.DefaultJSONParser");
        Class objectType = Class.forName("java.lang.Object");
        Method parseRefMethod = awtCodecClazz.getDeclaredMethod("parseRef", defaultJSONParserType, objectType);
        parseRefMethod.setAccessible(true);
        java.lang.Object[] parseRefMethodArguments = new java.lang.Object[2];
        parseRefMethodArguments[0] = defaultJSONParser;
        parseRefMethodArguments[1] = object;
        try {
            parseRefMethod.invoke(awtCodec, parseRefMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseRef2() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        java.lang.Object[] basicPopupMenuListenerArray = createArray("javax.swing.plaf.basic.BasicPopupMenuUI$BasicPopupMenuListener", 0);
        
        Class awtCodecClazz = Class.forName("com.alibaba.fastjson.serializer.AwtCodec");
        Class defaultJSONParserType = Class.forName("com.alibaba.fastjson.parser.DefaultJSONParser");
        Class basicPopupMenuListenerArrayType = Class.forName("java.lang.Object");
        Method parseRefMethod = awtCodecClazz.getDeclaredMethod("parseRef", defaultJSONParserType, basicPopupMenuListenerArrayType);
        parseRefMethod.setAccessible(true);
        java.lang.Object[] parseRefMethodArguments = new java.lang.Object[2];
        parseRefMethodArguments[0] = null;
        parseRefMethodArguments[1] = ((Object) basicPopupMenuListenerArray);
        try {
            parseRefMethod.invoke(awtCodec, parseRefMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseRef3() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        when(defaultJSONParserMock.getLexer()).thenReturn(((JSONLexer) null));
        java.lang.Object[] forEachTaskArray = createArray("java.util.stream.ForEachOps$ForEachTask", 0);
        
        Class awtCodecClazz = Class.forName("com.alibaba.fastjson.serializer.AwtCodec");
        Class defaultJSONParserMockType = Class.forName("com.alibaba.fastjson.parser.DefaultJSONParser");
        Class forEachTaskArrayType = Class.forName("java.lang.Object");
        Method parseRefMethod = awtCodecClazz.getDeclaredMethod("parseRef", defaultJSONParserMockType, forEachTaskArrayType);
        parseRefMethod.setAccessible(true);
        java.lang.Object[] parseRefMethodArguments = new java.lang.Object[2];
        parseRefMethodArguments[0] = defaultJSONParserMock;
        parseRefMethodArguments[1] = ((Object) forEachTaskArray);
        try {
            parseRefMethod.invoke(awtCodec, parseRefMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testParseRef4() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        String string = new String("");
        when(jSONLexerMock.stringVal()).thenReturn(string);
        when(defaultJSONParserMock.getLexer()).thenReturn(jSONLexerMock);
        ParseContext parseContextMock = mock(ParseContext.class);
        when(defaultJSONParserMock.getContext()).thenReturn(((ParseContext) null), parseContextMock);
        when(defaultJSONParserMock.setContext(any(), any())).thenReturn(((ParseContext) null));
        java.lang.Object[] forEachTaskArray = createArray("java.util.stream.ForEachOps$ForEachTask", 0);
        
        Class awtCodecClazz = Class.forName("com.alibaba.fastjson.serializer.AwtCodec");
        Class defaultJSONParserMockType = Class.forName("com.alibaba.fastjson.parser.DefaultJSONParser");
        Class forEachTaskArrayType = Class.forName("java.lang.Object");
        Method parseRefMethod = awtCodecClazz.getDeclaredMethod("parseRef", defaultJSONParserMockType, forEachTaskArrayType);
        parseRefMethod.setAccessible(true);
        java.lang.Object[] parseRefMethodArguments = new java.lang.Object[2];
        parseRefMethodArguments[0] = defaultJSONParserMock;
        parseRefMethodArguments[1] = ((Object) forEachTaskArray);
        Object actual = parseRefMethod.invoke(awtCodec, parseRefMethodArguments);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSupport1() throws Throwable  {
        Class class1 = Object.class;
        
        boolean actual = AwtCodec.support(class1);
        
        assertTrue(actual);
        
        Class finalClass1 = class1;
        
        Class expectedFinalClass1 = Point.class;
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expectedFinalClass1, finalClass1));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSupport2() throws Throwable  {
        Class class1 = Object.class;
        
        boolean actual = AwtCodec.support(class1);
        
        assertTrue(actual);
        
        Class finalClass1 = class1;
        
        Class expectedFinalClass1 = Rectangle.class;
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expectedFinalClass1, finalClass1));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSupport3() throws Throwable  {
        boolean actual = AwtCodec.support(null);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSupport4() throws Throwable  {
        Class class1 = Object.class;
        
        boolean actual = AwtCodec.support(class1);
        
        assertTrue(actual);
        
        Class finalClass1 = class1;
        
        Class expectedFinalClass1 = Color.class;
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expectedFinalClass1, finalClass1));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSupport5() throws Throwable  {
        Class class1 = Object.class;
        
        boolean actual = AwtCodec.support(class1);
        
        assertTrue(actual);
        
        Class finalClass1 = class1;
        
        Class expectedFinalClass1 = Font.class;
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expectedFinalClass1, finalClass1));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testAwtCodec1() {
        AwtCodec actual = new AwtCodec();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testAwtCodec2() {
        AwtCodec actual = new AwtCodec();
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
    private static Object[] createArray(String className, int length, Object... values) throws ClassNotFoundException {
        Object array = java.lang.reflect.Array.newInstance(Class.forName(className), length);
    
        for (int i = 0; i < values.length; i++) {
            java.lang.reflect.Array.set(array, i, values[i]);
        }
        
        return (Object[]) array;
    }
    private static sun.misc.Unsafe getUnsafeInstance() throws Exception {
        java.lang.reflect.Field f = sun.misc.Unsafe.class.getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return (sun.misc.Unsafe) f.get(null);
    }
}
