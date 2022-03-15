package com.alibaba.fastjson.serializer;

import org.junit.Test;
import java.lang.reflect.Method;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.JSONScanner;
import com.alibaba.fastjson.parser.JSONLexer;
import java.awt.Font;
import com.alibaba.fastjson.parser.JSONReaderScanner;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.Point;
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
import static org.junit.Assert.assertTrue;

public class AwtCodecTest {
    ///region
    
    @Test(timeout = 10000)
    public void testGetFastMatchToken1() throws Throwable  {
        AwtCodec awtCodec = new AwtCodec();
        
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
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "hasSpecial", false);
        setField(jSONScanner, "np", 0);
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", 'T');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 13);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Class awtCodecClazz = Class.forName("com.alibaba.fastjson.serializer.AwtCodec");
        Class defaultJSONParserType = Class.forName("com.alibaba.fastjson.parser.DefaultJSONParser");
        Method parseFontMethod = awtCodecClazz.getDeclaredMethod("parseFont", defaultJSONParserType);
        parseFontMethod.setAccessible(true);
        java.lang.Object[] parseFontMethodArguments = new java.lang.Object[1];
        parseFontMethodArguments[0] = defaultJSONParser;
        try {
            parseFontMethod.invoke(awtCodec, parseFontMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerNp = getFieldValue(jSONLexer, "np");
        JSONLexer jSONLexer1 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerSp = getFieldValue(jSONLexer1, "sp");
        JSONLexer jSONLexer2 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerBp = getFieldValue(jSONLexer2, "bp");
        JSONLexer jSONLexer3 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerCh = getFieldValue(jSONLexer3, "ch");
        
        assertEquals(-1, finalDefaultJSONParserLexerNp);
        
        assertEquals(1, finalDefaultJSONParserLexerSp);
        
        assertEquals(1, finalDefaultJSONParserLexerBp);
        
        assertEquals('\u001A', finalDefaultJSONParserLexerCh);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testParseFont3() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '\u0000');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 13);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Class awtCodecClazz = Class.forName("com.alibaba.fastjson.serializer.AwtCodec");
        Class defaultJSONParserType = Class.forName("com.alibaba.fastjson.parser.DefaultJSONParser");
        Method parseFontMethod = awtCodecClazz.getDeclaredMethod("parseFont", defaultJSONParserType);
        parseFontMethod.setAccessible(true);
        java.lang.Object[] parseFontMethodArguments = new java.lang.Object[1];
        parseFontMethodArguments[0] = defaultJSONParser;
        Font actual = ((Font) parseFontMethod.invoke(awtCodec, parseFontMethodArguments));
        
        Font expected = ((Font) createInstance("java.awt.Font"));
        setField(expected, "fRequestedAttributes", null);
        String string = new String("Default");
        setField(expected, "name", string);
        setField(expected, "style", 0);
        setField(expected, "size", 0);
        setField(expected, "pointSize", 0.0f);
        setField(expected, "peer", null);
        setField(expected, "pData", 0L);
        setField(expected, "font2DHandle", null);
        setField(expected, "values", null);
        setField(expected, "hasLayoutAttributes", false);
        setField(expected, "createdFont", false);
        setField(expected, "nonIdentityTx", false);
        setField(expected, "hash", 0);
        setField(expected, "fontSerializedDataVersion", 1);
        setField(expected, "flmref", null);
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerToken = getFieldValue(jSONLexer, "token");
        
        assertEquals(20, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseFont4() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '\'');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 13);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Class awtCodecClazz = Class.forName("com.alibaba.fastjson.serializer.AwtCodec");
        Class defaultJSONParserType = Class.forName("com.alibaba.fastjson.parser.DefaultJSONParser");
        Method parseFontMethod = awtCodecClazz.getDeclaredMethod("parseFont", defaultJSONParserType);
        parseFontMethod.setAccessible(true);
        java.lang.Object[] parseFontMethodArguments = new java.lang.Object[1];
        parseFontMethodArguments[0] = defaultJSONParser;
        try {
            parseFontMethod.invoke(awtCodec, parseFontMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseFont5() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", Integer.MAX_VALUE);
        setField(jSONScanner, "ch", 'f');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 13);
        setField(jSONScanner, "len", 1);
        String string = new String("");
        setField(jSONScanner, "text", string);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Class awtCodecClazz = Class.forName("com.alibaba.fastjson.serializer.AwtCodec");
        Class defaultJSONParserType = Class.forName("com.alibaba.fastjson.parser.DefaultJSONParser");
        Method parseFontMethod = awtCodecClazz.getDeclaredMethod("parseFont", defaultJSONParserType);
        parseFontMethod.setAccessible(true);
        java.lang.Object[] parseFontMethodArguments = new java.lang.Object[1];
        parseFontMethodArguments[0] = defaultJSONParser;
        try {
            parseFontMethod.invoke(awtCodec, parseFontMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerBp = getFieldValue(jSONLexer, "bp");
        JSONLexer jSONLexer1 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerPos = getFieldValue(jSONLexer1, "pos");
        
        assertEquals(Integer.MIN_VALUE, finalDefaultJSONParserLexerBp);
        
        assertEquals(Integer.MAX_VALUE, finalDefaultJSONParserLexerPos);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testParseFont6() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", ')');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 13);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Class awtCodecClazz = Class.forName("com.alibaba.fastjson.serializer.AwtCodec");
        Class defaultJSONParserType = Class.forName("com.alibaba.fastjson.parser.DefaultJSONParser");
        Method parseFontMethod = awtCodecClazz.getDeclaredMethod("parseFont", defaultJSONParserType);
        parseFontMethod.setAccessible(true);
        java.lang.Object[] parseFontMethodArguments = new java.lang.Object[1];
        parseFontMethodArguments[0] = defaultJSONParser;
        Font actual = ((Font) parseFontMethod.invoke(awtCodec, parseFontMethodArguments));
        
        Font expected = ((Font) createInstance("java.awt.Font"));
        setField(expected, "fRequestedAttributes", null);
        String string = new String("Default");
        setField(expected, "name", string);
        setField(expected, "style", 0);
        setField(expected, "size", 0);
        setField(expected, "pointSize", 0.0f);
        setField(expected, "peer", null);
        setField(expected, "pData", 0L);
        setField(expected, "font2DHandle", null);
        setField(expected, "values", null);
        setField(expected, "hasLayoutAttributes", false);
        setField(expected, "createdFont", false);
        setField(expected, "nonIdentityTx", false);
        setField(expected, "hash", 0);
        setField(expected, "fontSerializedDataVersion", 1);
        setField(expected, "flmref", null);
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
        
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
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseFont7() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '\f');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 13);
        setField(jSONScanner, "len", 0);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Class awtCodecClazz = Class.forName("com.alibaba.fastjson.serializer.AwtCodec");
        Class defaultJSONParserType = Class.forName("com.alibaba.fastjson.parser.DefaultJSONParser");
        Method parseFontMethod = awtCodecClazz.getDeclaredMethod("parseFont", defaultJSONParserType);
        parseFontMethod.setAccessible(true);
        java.lang.Object[] parseFontMethodArguments = new java.lang.Object[1];
        parseFontMethodArguments[0] = defaultJSONParser;
        try {
            parseFontMethod.invoke(awtCodec, parseFontMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerBp = getFieldValue(jSONLexer, "bp");
        JSONLexer jSONLexer1 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerCh = getFieldValue(jSONLexer1, "ch");
        JSONLexer jSONLexer2 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerPos = getFieldValue(jSONLexer2, "pos");
        
        assertEquals(14170, finalDefaultJSONParserLexerBp);
        
        assertEquals('\u001A', finalDefaultJSONParserLexerCh);
        
        assertEquals(14170, finalDefaultJSONParserLexerPos);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseFont8() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "hasSpecial", false);
        setField(jSONScanner, "np", 0);
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '\"');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 13);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Class awtCodecClazz = Class.forName("com.alibaba.fastjson.serializer.AwtCodec");
        Class defaultJSONParserType = Class.forName("com.alibaba.fastjson.parser.DefaultJSONParser");
        Method parseFontMethod = awtCodecClazz.getDeclaredMethod("parseFont", defaultJSONParserType);
        parseFontMethod.setAccessible(true);
        java.lang.Object[] parseFontMethodArguments = new java.lang.Object[1];
        parseFontMethodArguments[0] = defaultJSONParser;
        try {
            parseFontMethod.invoke(awtCodec, parseFontMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
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
    public void testParseFont9() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", Integer.MAX_VALUE);
        setField(jSONScanner, "ch", 't');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 13);
        setField(jSONScanner, "len", 1);
        String string = new String("");
        setField(jSONScanner, "text", string);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Class awtCodecClazz = Class.forName("com.alibaba.fastjson.serializer.AwtCodec");
        Class defaultJSONParserType = Class.forName("com.alibaba.fastjson.parser.DefaultJSONParser");
        Method parseFontMethod = awtCodecClazz.getDeclaredMethod("parseFont", defaultJSONParserType);
        parseFontMethod.setAccessible(true);
        java.lang.Object[] parseFontMethodArguments = new java.lang.Object[1];
        parseFontMethodArguments[0] = defaultJSONParser;
        try {
            parseFontMethod.invoke(awtCodec, parseFontMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerBp = getFieldValue(jSONLexer, "bp");
        JSONLexer jSONLexer1 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerPos = getFieldValue(jSONLexer1, "pos");
        
        assertEquals(Integer.MIN_VALUE, finalDefaultJSONParserLexerBp);
        
        assertEquals(Integer.MAX_VALUE, finalDefaultJSONParserLexerPos);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testParseFont10() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "np", 0);
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '-');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 13);
        setField(jSONScanner, "len", 0);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Class awtCodecClazz = Class.forName("com.alibaba.fastjson.serializer.AwtCodec");
        Class defaultJSONParserType = Class.forName("com.alibaba.fastjson.parser.DefaultJSONParser");
        Method parseFontMethod = awtCodecClazz.getDeclaredMethod("parseFont", defaultJSONParserType);
        parseFontMethod.setAccessible(true);
        java.lang.Object[] parseFontMethodArguments = new java.lang.Object[1];
        parseFontMethodArguments[0] = defaultJSONParser;
        Font actual = ((Font) parseFontMethod.invoke(awtCodec, parseFontMethodArguments));
        
        Font expected = ((Font) createInstance("java.awt.Font"));
        setField(expected, "fRequestedAttributes", null);
        String string = new String("Default");
        setField(expected, "name", string);
        setField(expected, "style", 0);
        setField(expected, "size", 0);
        setField(expected, "pointSize", 0.0f);
        setField(expected, "peer", null);
        setField(expected, "pData", 0L);
        setField(expected, "font2DHandle", null);
        setField(expected, "values", null);
        setField(expected, "hasLayoutAttributes", false);
        setField(expected, "createdFont", false);
        setField(expected, "nonIdentityTx", false);
        setField(expected, "hash", 0);
        setField(expected, "fontSerializedDataVersion", 1);
        setField(expected, "flmref", null);
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
        
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
    public void testParseFont11() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONReaderScanner jSONReaderScanner = ((JSONReaderScanner) createInstance("com.alibaba.fastjson.parser.JSONReaderScanner"));
        setField(jSONReaderScanner, "np", 0);
        setField(jSONReaderScanner, "sp", 0);
        setField(jSONReaderScanner, "bp", 0);
        setField(jSONReaderScanner, "ch", '\r');
        setField(jSONReaderScanner, "pos", 0);
        setField(jSONReaderScanner, "token", 13);
        setField(jSONReaderScanner, "bufLength", 0);
        setField(defaultJSONParser, "lexer", jSONReaderScanner);
        
        Class awtCodecClazz = Class.forName("com.alibaba.fastjson.serializer.AwtCodec");
        Class defaultJSONParserType = Class.forName("com.alibaba.fastjson.parser.DefaultJSONParser");
        Method parseFontMethod = awtCodecClazz.getDeclaredMethod("parseFont", defaultJSONParserType);
        parseFontMethod.setAccessible(true);
        java.lang.Object[] parseFontMethodArguments = new java.lang.Object[1];
        parseFontMethodArguments[0] = defaultJSONParser;
        try {
            parseFontMethod.invoke(awtCodec, parseFontMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerNp = getFieldValue(jSONLexer, "np");
        
        assertEquals(-1, finalDefaultJSONParserLexerNp);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testParseFont12() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "np", 0);
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '2');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 13);
        setField(jSONScanner, "len", 0);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Class awtCodecClazz = Class.forName("com.alibaba.fastjson.serializer.AwtCodec");
        Class defaultJSONParserType = Class.forName("com.alibaba.fastjson.parser.DefaultJSONParser");
        Method parseFontMethod = awtCodecClazz.getDeclaredMethod("parseFont", defaultJSONParserType);
        parseFontMethod.setAccessible(true);
        java.lang.Object[] parseFontMethodArguments = new java.lang.Object[1];
        parseFontMethodArguments[0] = defaultJSONParser;
        Font actual = ((Font) parseFontMethod.invoke(awtCodec, parseFontMethodArguments));
        
        Font expected = ((Font) createInstance("java.awt.Font"));
        setField(expected, "fRequestedAttributes", null);
        String string = new String("Default");
        setField(expected, "name", string);
        setField(expected, "style", 0);
        setField(expected, "size", 0);
        setField(expected, "pointSize", 0.0f);
        setField(expected, "peer", null);
        setField(expected, "pData", 0L);
        setField(expected, "font2DHandle", null);
        setField(expected, "values", null);
        setField(expected, "hasLayoutAttributes", false);
        setField(expected, "createdFont", false);
        setField(expected, "nonIdentityTx", false);
        setField(expected, "hash", 0);
        setField(expected, "fontSerializedDataVersion", 1);
        setField(expected, "flmref", null);
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
        
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
    public void testParseFont13() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", Integer.MAX_VALUE);
        setField(jSONScanner, "ch", '(');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 13);
        setField(jSONScanner, "len", 1);
        String string = new String("");
        setField(jSONScanner, "text", string);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Class awtCodecClazz = Class.forName("com.alibaba.fastjson.serializer.AwtCodec");
        Class defaultJSONParserType = Class.forName("com.alibaba.fastjson.parser.DefaultJSONParser");
        Method parseFontMethod = awtCodecClazz.getDeclaredMethod("parseFont", defaultJSONParserType);
        parseFontMethod.setAccessible(true);
        java.lang.Object[] parseFontMethodArguments = new java.lang.Object[1];
        parseFontMethodArguments[0] = defaultJSONParser;
        try {
            parseFontMethod.invoke(awtCodec, parseFontMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerBp = getFieldValue(jSONLexer, "bp");
        JSONLexer jSONLexer1 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerPos = getFieldValue(jSONLexer1, "pos");
        
        assertEquals(Integer.MIN_VALUE, finalDefaultJSONParserLexerBp);
        
        assertEquals(Integer.MAX_VALUE, finalDefaultJSONParserLexerPos);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseFont14() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", Integer.MAX_VALUE);
        setField(jSONScanner, "ch", '/');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 13);
        setField(jSONScanner, "len", 1);
        String string = new String("");
        setField(jSONScanner, "text", string);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Class awtCodecClazz = Class.forName("com.alibaba.fastjson.serializer.AwtCodec");
        Class defaultJSONParserType = Class.forName("com.alibaba.fastjson.parser.DefaultJSONParser");
        Method parseFontMethod = awtCodecClazz.getDeclaredMethod("parseFont", defaultJSONParserType);
        parseFontMethod.setAccessible(true);
        java.lang.Object[] parseFontMethodArguments = new java.lang.Object[1];
        parseFontMethodArguments[0] = defaultJSONParser;
        try {
            parseFontMethod.invoke(awtCodec, parseFontMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerBp = getFieldValue(jSONLexer, "bp");
        JSONLexer jSONLexer1 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerPos = getFieldValue(jSONLexer1, "pos");
        
        assertEquals(Integer.MIN_VALUE, finalDefaultJSONParserLexerBp);
        
        assertEquals(Integer.MAX_VALUE, finalDefaultJSONParserLexerPos);
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
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "hasSpecial", false);
        setField(jSONScanner, "np", 0);
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", 'u');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 13);
        setField(jSONScanner, "len", 0);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Class awtCodecClazz = Class.forName("com.alibaba.fastjson.serializer.AwtCodec");
        Class defaultJSONParserType = Class.forName("com.alibaba.fastjson.parser.DefaultJSONParser");
        Method parseColorMethod = awtCodecClazz.getDeclaredMethod("parseColor", defaultJSONParserType);
        parseColorMethod.setAccessible(true);
        java.lang.Object[] parseColorMethodArguments = new java.lang.Object[1];
        parseColorMethodArguments[0] = defaultJSONParser;
        try {
            parseColorMethod.invoke(awtCodec, parseColorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerNp = getFieldValue(jSONLexer, "np");
        JSONLexer jSONLexer1 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerSp = getFieldValue(jSONLexer1, "sp");
        JSONLexer jSONLexer2 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerBp = getFieldValue(jSONLexer2, "bp");
        JSONLexer jSONLexer3 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerCh = getFieldValue(jSONLexer3, "ch");
        
        assertEquals(-1, finalDefaultJSONParserLexerNp);
        
        assertEquals(1, finalDefaultJSONParserLexerSp);
        
        assertEquals(1, finalDefaultJSONParserLexerBp);
        
        assertEquals('\u001A', finalDefaultJSONParserLexerCh);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseColor3() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", Integer.MAX_VALUE);
        setField(jSONScanner, "ch", 'x');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 13);
        setField(jSONScanner, "len", 1);
        String string = new String("");
        setField(jSONScanner, "text", string);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Class awtCodecClazz = Class.forName("com.alibaba.fastjson.serializer.AwtCodec");
        Class defaultJSONParserType = Class.forName("com.alibaba.fastjson.parser.DefaultJSONParser");
        Method parseColorMethod = awtCodecClazz.getDeclaredMethod("parseColor", defaultJSONParserType);
        parseColorMethod.setAccessible(true);
        java.lang.Object[] parseColorMethodArguments = new java.lang.Object[1];
        parseColorMethodArguments[0] = defaultJSONParser;
        try {
            parseColorMethod.invoke(awtCodec, parseColorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerBp = getFieldValue(jSONLexer, "bp");
        JSONLexer jSONLexer1 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerPos = getFieldValue(jSONLexer1, "pos");
        
        assertEquals(Integer.MIN_VALUE, finalDefaultJSONParserLexerBp);
        
        assertEquals(Integer.MAX_VALUE, finalDefaultJSONParserLexerPos);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseColor4() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", Integer.MAX_VALUE);
        setField(jSONScanner, "ch", ')');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 13);
        setField(jSONScanner, "len", 1);
        String string = new String("");
        setField(jSONScanner, "text", string);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Class awtCodecClazz = Class.forName("com.alibaba.fastjson.serializer.AwtCodec");
        Class defaultJSONParserType = Class.forName("com.alibaba.fastjson.parser.DefaultJSONParser");
        Method parseColorMethod = awtCodecClazz.getDeclaredMethod("parseColor", defaultJSONParserType);
        parseColorMethod.setAccessible(true);
        java.lang.Object[] parseColorMethodArguments = new java.lang.Object[1];
        parseColorMethodArguments[0] = defaultJSONParser;
        try {
            parseColorMethod.invoke(awtCodec, parseColorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerBp = getFieldValue(jSONLexer, "bp");
        JSONLexer jSONLexer1 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerPos = getFieldValue(jSONLexer1, "pos");
        
        assertEquals(Integer.MIN_VALUE, finalDefaultJSONParserLexerBp);
        
        assertEquals(Integer.MAX_VALUE, finalDefaultJSONParserLexerPos);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseColor5() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", 'f');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 13);
        setField(jSONScanner, "len", 0);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Class awtCodecClazz = Class.forName("com.alibaba.fastjson.serializer.AwtCodec");
        Class defaultJSONParserType = Class.forName("com.alibaba.fastjson.parser.DefaultJSONParser");
        Method parseColorMethod = awtCodecClazz.getDeclaredMethod("parseColor", defaultJSONParserType);
        parseColorMethod.setAccessible(true);
        java.lang.Object[] parseColorMethodArguments = new java.lang.Object[1];
        parseColorMethodArguments[0] = defaultJSONParser;
        try {
            parseColorMethod.invoke(awtCodec, parseColorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
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
    public void testParseColor6() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", ']');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 13);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Class awtCodecClazz = Class.forName("com.alibaba.fastjson.serializer.AwtCodec");
        Class defaultJSONParserType = Class.forName("com.alibaba.fastjson.parser.DefaultJSONParser");
        Method parseColorMethod = awtCodecClazz.getDeclaredMethod("parseColor", defaultJSONParserType);
        parseColorMethod.setAccessible(true);
        java.lang.Object[] parseColorMethodArguments = new java.lang.Object[1];
        parseColorMethodArguments[0] = defaultJSONParser;
        Color actual = ((Color) parseColorMethod.invoke(awtCodec, parseColorMethodArguments));
        
        Color expected = ((Color) createInstance("java.awt.Color"));
        setField(expected, "value", 0);
        setField(expected, "frgbvalue", null);
        setField(expected, "fvalue", null);
        setField(expected, "falpha", 0.0f);
        setField(expected, "cs", null);
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
        
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
    
    @Test(timeout = 10000)
    public void testParseColor7() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "np", 0);
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '-');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 13);
        setField(jSONScanner, "len", 0);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Class awtCodecClazz = Class.forName("com.alibaba.fastjson.serializer.AwtCodec");
        Class defaultJSONParserType = Class.forName("com.alibaba.fastjson.parser.DefaultJSONParser");
        Method parseColorMethod = awtCodecClazz.getDeclaredMethod("parseColor", defaultJSONParserType);
        parseColorMethod.setAccessible(true);
        java.lang.Object[] parseColorMethodArguments = new java.lang.Object[1];
        parseColorMethodArguments[0] = defaultJSONParser;
        Color actual = ((Color) parseColorMethod.invoke(awtCodec, parseColorMethodArguments));
        
        Color expected = ((Color) createInstance("java.awt.Color"));
        setField(expected, "value", 0);
        setField(expected, "frgbvalue", null);
        setField(expected, "fvalue", null);
        setField(expected, "falpha", 0.0f);
        setField(expected, "cs", null);
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
        
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
    public void testParseColor8() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", 't');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 13);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Class awtCodecClazz = Class.forName("com.alibaba.fastjson.serializer.AwtCodec");
        Class defaultJSONParserType = Class.forName("com.alibaba.fastjson.parser.DefaultJSONParser");
        Method parseColorMethod = awtCodecClazz.getDeclaredMethod("parseColor", defaultJSONParserType);
        parseColorMethod.setAccessible(true);
        java.lang.Object[] parseColorMethodArguments = new java.lang.Object[1];
        parseColorMethodArguments[0] = defaultJSONParser;
        try {
            parseColorMethod.invoke(awtCodec, parseColorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
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
    public void testParseColor9() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", Integer.MAX_VALUE);
        setField(jSONScanner, "ch", ',');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 13);
        setField(jSONScanner, "len", 1);
        String string = new String("");
        setField(jSONScanner, "text", string);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Class awtCodecClazz = Class.forName("com.alibaba.fastjson.serializer.AwtCodec");
        Class defaultJSONParserType = Class.forName("com.alibaba.fastjson.parser.DefaultJSONParser");
        Method parseColorMethod = awtCodecClazz.getDeclaredMethod("parseColor", defaultJSONParserType);
        parseColorMethod.setAccessible(true);
        java.lang.Object[] parseColorMethodArguments = new java.lang.Object[1];
        parseColorMethodArguments[0] = defaultJSONParser;
        try {
            parseColorMethod.invoke(awtCodec, parseColorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerBp = getFieldValue(jSONLexer, "bp");
        JSONLexer jSONLexer1 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerPos = getFieldValue(jSONLexer1, "pos");
        
        assertEquals(Integer.MIN_VALUE, finalDefaultJSONParserLexerBp);
        
        assertEquals(Integer.MAX_VALUE, finalDefaultJSONParserLexerPos);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseColor10() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONReaderScanner jSONReaderScanner = ((JSONReaderScanner) createInstance("com.alibaba.fastjson.parser.JSONReaderScanner"));
        setField(jSONReaderScanner, "sp", 0);
        setField(jSONReaderScanner, "bp", 0);
        setField(jSONReaderScanner, "ch", '{');
        setField(jSONReaderScanner, "pos", 0);
        setField(jSONReaderScanner, "token", 13);
        setField(defaultJSONParser, "lexer", jSONReaderScanner);
        
        Class awtCodecClazz = Class.forName("com.alibaba.fastjson.serializer.AwtCodec");
        Class defaultJSONParserType = Class.forName("com.alibaba.fastjson.parser.DefaultJSONParser");
        Method parseColorMethod = awtCodecClazz.getDeclaredMethod("parseColor", defaultJSONParserType);
        parseColorMethod.setAccessible(true);
        java.lang.Object[] parseColorMethodArguments = new java.lang.Object[1];
        parseColorMethodArguments[0] = defaultJSONParser;
        try {
            parseColorMethod.invoke(awtCodec, parseColorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testParseColor11() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '(');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 13);
        setField(jSONScanner, "len", 0);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Class awtCodecClazz = Class.forName("com.alibaba.fastjson.serializer.AwtCodec");
        Class defaultJSONParserType = Class.forName("com.alibaba.fastjson.parser.DefaultJSONParser");
        Method parseColorMethod = awtCodecClazz.getDeclaredMethod("parseColor", defaultJSONParserType);
        parseColorMethod.setAccessible(true);
        java.lang.Object[] parseColorMethodArguments = new java.lang.Object[1];
        parseColorMethodArguments[0] = defaultJSONParser;
        Color actual = ((Color) parseColorMethod.invoke(awtCodec, parseColorMethodArguments));
        
        Color expected = ((Color) createInstance("java.awt.Color"));
        setField(expected, "value", 0);
        setField(expected, "frgbvalue", null);
        setField(expected, "fvalue", null);
        setField(expected, "falpha", 0.0f);
        setField(expected, "cs", null);
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
        
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
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseColor12() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", Integer.MAX_VALUE);
        setField(jSONScanner, "ch", '}');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 13);
        setField(jSONScanner, "len", 1);
        String string = new String("");
        setField(jSONScanner, "text", string);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Class awtCodecClazz = Class.forName("com.alibaba.fastjson.serializer.AwtCodec");
        Class defaultJSONParserType = Class.forName("com.alibaba.fastjson.parser.DefaultJSONParser");
        Method parseColorMethod = awtCodecClazz.getDeclaredMethod("parseColor", defaultJSONParserType);
        parseColorMethod.setAccessible(true);
        java.lang.Object[] parseColorMethodArguments = new java.lang.Object[1];
        parseColorMethodArguments[0] = defaultJSONParser;
        try {
            parseColorMethod.invoke(awtCodec, parseColorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerBp = getFieldValue(jSONLexer, "bp");
        JSONLexer jSONLexer1 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerPos = getFieldValue(jSONLexer1, "pos");
        
        assertEquals(Integer.MIN_VALUE, finalDefaultJSONParserLexerBp);
        
        assertEquals(Integer.MAX_VALUE, finalDefaultJSONParserLexerPos);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseColor13() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", 'n');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 13);
        setField(jSONScanner, "len", 0);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Class awtCodecClazz = Class.forName("com.alibaba.fastjson.serializer.AwtCodec");
        Class defaultJSONParserType = Class.forName("com.alibaba.fastjson.parser.DefaultJSONParser");
        Method parseColorMethod = awtCodecClazz.getDeclaredMethod("parseColor", defaultJSONParserType);
        parseColorMethod.setAccessible(true);
        java.lang.Object[] parseColorMethodArguments = new java.lang.Object[1];
        parseColorMethodArguments[0] = defaultJSONParser;
        try {
            parseColorMethod.invoke(awtCodec, parseColorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
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
    public void testParseColor14() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '\t');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 13);
        setField(jSONScanner, "len", 0);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Class awtCodecClazz = Class.forName("com.alibaba.fastjson.serializer.AwtCodec");
        Class defaultJSONParserType = Class.forName("com.alibaba.fastjson.parser.DefaultJSONParser");
        Method parseColorMethod = awtCodecClazz.getDeclaredMethod("parseColor", defaultJSONParserType);
        parseColorMethod.setAccessible(true);
        java.lang.Object[] parseColorMethodArguments = new java.lang.Object[1];
        parseColorMethodArguments[0] = defaultJSONParser;
        try {
            parseColorMethod.invoke(awtCodec, parseColorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerBp = getFieldValue(jSONLexer, "bp");
        JSONLexer jSONLexer1 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerCh = getFieldValue(jSONLexer1, "ch");
        JSONLexer jSONLexer2 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerPos = getFieldValue(jSONLexer2, "pos");
        
        assertEquals(14170, finalDefaultJSONParserLexerBp);
        
        assertEquals('\u001A', finalDefaultJSONParserLexerCh);
        
        assertEquals(14170, finalDefaultJSONParserLexerPos);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testParseColor15() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '}');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 13);
        setField(jSONScanner, "len", 0);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Class awtCodecClazz = Class.forName("com.alibaba.fastjson.serializer.AwtCodec");
        Class defaultJSONParserType = Class.forName("com.alibaba.fastjson.parser.DefaultJSONParser");
        Method parseColorMethod = awtCodecClazz.getDeclaredMethod("parseColor", defaultJSONParserType);
        parseColorMethod.setAccessible(true);
        java.lang.Object[] parseColorMethodArguments = new java.lang.Object[1];
        parseColorMethodArguments[0] = defaultJSONParser;
        Color actual = ((Color) parseColorMethod.invoke(awtCodec, parseColorMethodArguments));
        
        Color expected = ((Color) createInstance("java.awt.Color"));
        setField(expected, "value", 0);
        setField(expected, "frgbvalue", null);
        setField(expected, "fvalue", null);
        setField(expected, "falpha", 0.0f);
        setField(expected, "cs", null);
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
        
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
    public void testParseColor16() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", Integer.MAX_VALUE);
        setField(jSONScanner, "ch", '.');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 13);
        setField(jSONScanner, "len", 1);
        String string = new String("");
        setField(jSONScanner, "text", string);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Class awtCodecClazz = Class.forName("com.alibaba.fastjson.serializer.AwtCodec");
        Class defaultJSONParserType = Class.forName("com.alibaba.fastjson.parser.DefaultJSONParser");
        Method parseColorMethod = awtCodecClazz.getDeclaredMethod("parseColor", defaultJSONParserType);
        parseColorMethod.setAccessible(true);
        java.lang.Object[] parseColorMethodArguments = new java.lang.Object[1];
        parseColorMethodArguments[0] = defaultJSONParser;
        try {
            parseColorMethod.invoke(awtCodec, parseColorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerBp = getFieldValue(jSONLexer, "bp");
        JSONLexer jSONLexer1 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerPos = getFieldValue(jSONLexer1, "pos");
        
        assertEquals(Integer.MIN_VALUE, finalDefaultJSONParserLexerBp);
        
        assertEquals(Integer.MAX_VALUE, finalDefaultJSONParserLexerPos);
    }
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
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "hasSpecial", false);
        setField(jSONScanner, "np", 0);
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", Integer.MAX_VALUE);
        setField(jSONScanner, "ch", '\"');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 13);
        setField(jSONScanner, "len", 1);
        String string = new String("");
        setField(jSONScanner, "text", string);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Class awtCodecClazz = Class.forName("com.alibaba.fastjson.serializer.AwtCodec");
        Class defaultJSONParserType = Class.forName("com.alibaba.fastjson.parser.DefaultJSONParser");
        Method parseRectangleMethod = awtCodecClazz.getDeclaredMethod("parseRectangle", defaultJSONParserType);
        parseRectangleMethod.setAccessible(true);
        java.lang.Object[] parseRectangleMethodArguments = new java.lang.Object[1];
        parseRectangleMethodArguments[0] = defaultJSONParser;
        try {
            parseRectangleMethod.invoke(awtCodec, parseRectangleMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerNp = getFieldValue(jSONLexer, "np");
        JSONLexer jSONLexer1 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerBp = getFieldValue(jSONLexer1, "bp");
        JSONLexer jSONLexer2 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerPos = getFieldValue(jSONLexer2, "pos");
        
        assertEquals(Integer.MAX_VALUE, finalDefaultJSONParserLexerNp);
        
        assertEquals(Integer.MIN_VALUE, finalDefaultJSONParserLexerBp);
        
        assertEquals(Integer.MAX_VALUE, finalDefaultJSONParserLexerPos);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseRectangle3() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "hasSpecial", false);
        setField(jSONScanner, "np", 0);
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", 'N');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 13);
        setField(jSONScanner, "len", 0);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Class awtCodecClazz = Class.forName("com.alibaba.fastjson.serializer.AwtCodec");
        Class defaultJSONParserType = Class.forName("com.alibaba.fastjson.parser.DefaultJSONParser");
        Method parseRectangleMethod = awtCodecClazz.getDeclaredMethod("parseRectangle", defaultJSONParserType);
        parseRectangleMethod.setAccessible(true);
        java.lang.Object[] parseRectangleMethodArguments = new java.lang.Object[1];
        parseRectangleMethodArguments[0] = defaultJSONParser;
        try {
            parseRectangleMethod.invoke(awtCodec, parseRectangleMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerNp = getFieldValue(jSONLexer, "np");
        JSONLexer jSONLexer1 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerSp = getFieldValue(jSONLexer1, "sp");
        JSONLexer jSONLexer2 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerBp = getFieldValue(jSONLexer2, "bp");
        JSONLexer jSONLexer3 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerCh = getFieldValue(jSONLexer3, "ch");
        
        assertEquals(-1, finalDefaultJSONParserLexerNp);
        
        assertEquals(1, finalDefaultJSONParserLexerSp);
        
        assertEquals(1, finalDefaultJSONParserLexerBp);
        
        assertEquals('\u001A', finalDefaultJSONParserLexerCh);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseRectangle4() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", Integer.MAX_VALUE);
        setField(jSONScanner, "ch", ',');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 13);
        setField(jSONScanner, "len", 1);
        String string = new String("");
        setField(jSONScanner, "text", string);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Class awtCodecClazz = Class.forName("com.alibaba.fastjson.serializer.AwtCodec");
        Class defaultJSONParserType = Class.forName("com.alibaba.fastjson.parser.DefaultJSONParser");
        Method parseRectangleMethod = awtCodecClazz.getDeclaredMethod("parseRectangle", defaultJSONParserType);
        parseRectangleMethod.setAccessible(true);
        java.lang.Object[] parseRectangleMethodArguments = new java.lang.Object[1];
        parseRectangleMethodArguments[0] = defaultJSONParser;
        try {
            parseRectangleMethod.invoke(awtCodec, parseRectangleMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerBp = getFieldValue(jSONLexer, "bp");
        JSONLexer jSONLexer1 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerPos = getFieldValue(jSONLexer1, "pos");
        
        assertEquals(Integer.MIN_VALUE, finalDefaultJSONParserLexerBp);
        
        assertEquals(Integer.MAX_VALUE, finalDefaultJSONParserLexerPos);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseRectangle5() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", Integer.MAX_VALUE);
        setField(jSONScanner, "ch", 'x');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 13);
        setField(jSONScanner, "len", 1);
        String string = new String("");
        setField(jSONScanner, "text", string);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Class awtCodecClazz = Class.forName("com.alibaba.fastjson.serializer.AwtCodec");
        Class defaultJSONParserType = Class.forName("com.alibaba.fastjson.parser.DefaultJSONParser");
        Method parseRectangleMethod = awtCodecClazz.getDeclaredMethod("parseRectangle", defaultJSONParserType);
        parseRectangleMethod.setAccessible(true);
        java.lang.Object[] parseRectangleMethodArguments = new java.lang.Object[1];
        parseRectangleMethodArguments[0] = defaultJSONParser;
        try {
            parseRectangleMethod.invoke(awtCodec, parseRectangleMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerBp = getFieldValue(jSONLexer, "bp");
        JSONLexer jSONLexer1 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerPos = getFieldValue(jSONLexer1, "pos");
        
        assertEquals(Integer.MIN_VALUE, finalDefaultJSONParserLexerBp);
        
        assertEquals(Integer.MAX_VALUE, finalDefaultJSONParserLexerPos);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseRectangle6() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 1);
        setField(jSONScanner, "ch", '\u001A');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 13);
        setField(jSONScanner, "len", 0);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Class awtCodecClazz = Class.forName("com.alibaba.fastjson.serializer.AwtCodec");
        Class defaultJSONParserType = Class.forName("com.alibaba.fastjson.parser.DefaultJSONParser");
        Method parseRectangleMethod = awtCodecClazz.getDeclaredMethod("parseRectangle", defaultJSONParserType);
        parseRectangleMethod.setAccessible(true);
        java.lang.Object[] parseRectangleMethodArguments = new java.lang.Object[1];
        parseRectangleMethodArguments[0] = defaultJSONParser;
        try {
            parseRectangleMethod.invoke(awtCodec, parseRectangleMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerBp = getFieldValue(jSONLexer, "bp");
        JSONLexer jSONLexer1 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerPos = getFieldValue(jSONLexer1, "pos");
        
        assertEquals(14171, finalDefaultJSONParserLexerBp);
        
        assertEquals(14170, finalDefaultJSONParserLexerPos);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testParseRectangle7() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '{');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 13);
        setField(jSONScanner, "len", 0);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Class awtCodecClazz = Class.forName("com.alibaba.fastjson.serializer.AwtCodec");
        Class defaultJSONParserType = Class.forName("com.alibaba.fastjson.parser.DefaultJSONParser");
        Method parseRectangleMethod = awtCodecClazz.getDeclaredMethod("parseRectangle", defaultJSONParserType);
        parseRectangleMethod.setAccessible(true);
        java.lang.Object[] parseRectangleMethodArguments = new java.lang.Object[1];
        parseRectangleMethodArguments[0] = defaultJSONParser;
        Rectangle actual = ((Rectangle) parseRectangleMethod.invoke(awtCodec, parseRectangleMethodArguments));
        
        Rectangle expected = ((Rectangle) createInstance("java.awt.Rectangle"));
        expected.x = 0;
        expected.y = 0;
        expected.width = 0;
        expected.height = 0;
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
        
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
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseRectangle8() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONReaderScanner jSONReaderScanner = ((JSONReaderScanner) createInstance("com.alibaba.fastjson.parser.JSONReaderScanner"));
        setField(jSONReaderScanner, "sp", 0);
        setField(jSONReaderScanner, "bp", 0);
        setField(jSONReaderScanner, "ch", '{');
        setField(jSONReaderScanner, "pos", 0);
        setField(jSONReaderScanner, "token", 13);
        setField(defaultJSONParser, "lexer", jSONReaderScanner);
        
        Class awtCodecClazz = Class.forName("com.alibaba.fastjson.serializer.AwtCodec");
        Class defaultJSONParserType = Class.forName("com.alibaba.fastjson.parser.DefaultJSONParser");
        Method parseRectangleMethod = awtCodecClazz.getDeclaredMethod("parseRectangle", defaultJSONParserType);
        parseRectangleMethod.setAccessible(true);
        java.lang.Object[] parseRectangleMethodArguments = new java.lang.Object[1];
        parseRectangleMethodArguments[0] = defaultJSONParser;
        try {
            parseRectangleMethod.invoke(awtCodec, parseRectangleMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseRectangle9() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", Integer.MAX_VALUE);
        setField(jSONScanner, "ch", '\r');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 13);
        setField(jSONScanner, "len", 1);
        String string = new String("");
        setField(jSONScanner, "text", string);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Class awtCodecClazz = Class.forName("com.alibaba.fastjson.serializer.AwtCodec");
        Class defaultJSONParserType = Class.forName("com.alibaba.fastjson.parser.DefaultJSONParser");
        Method parseRectangleMethod = awtCodecClazz.getDeclaredMethod("parseRectangle", defaultJSONParserType);
        parseRectangleMethod.setAccessible(true);
        java.lang.Object[] parseRectangleMethodArguments = new java.lang.Object[1];
        parseRectangleMethodArguments[0] = defaultJSONParser;
        try {
            parseRectangleMethod.invoke(awtCodec, parseRectangleMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerBp = getFieldValue(jSONLexer, "bp");
        JSONLexer jSONLexer1 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerPos = getFieldValue(jSONLexer1, "pos");
        
        assertEquals(Integer.MIN_VALUE, finalDefaultJSONParserLexerBp);
        
        assertEquals(Integer.MAX_VALUE, finalDefaultJSONParserLexerPos);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseRectangle10() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", 't');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 13);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Class awtCodecClazz = Class.forName("com.alibaba.fastjson.serializer.AwtCodec");
        Class defaultJSONParserType = Class.forName("com.alibaba.fastjson.parser.DefaultJSONParser");
        Method parseRectangleMethod = awtCodecClazz.getDeclaredMethod("parseRectangle", defaultJSONParserType);
        parseRectangleMethod.setAccessible(true);
        java.lang.Object[] parseRectangleMethodArguments = new java.lang.Object[1];
        parseRectangleMethodArguments[0] = defaultJSONParser;
        try {
            parseRectangleMethod.invoke(awtCodec, parseRectangleMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
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
    public void testParseRectangle11() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", ')');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 13);
        setField(jSONScanner, "len", 0);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Class awtCodecClazz = Class.forName("com.alibaba.fastjson.serializer.AwtCodec");
        Class defaultJSONParserType = Class.forName("com.alibaba.fastjson.parser.DefaultJSONParser");
        Method parseRectangleMethod = awtCodecClazz.getDeclaredMethod("parseRectangle", defaultJSONParserType);
        parseRectangleMethod.setAccessible(true);
        java.lang.Object[] parseRectangleMethodArguments = new java.lang.Object[1];
        parseRectangleMethodArguments[0] = defaultJSONParser;
        Rectangle actual = ((Rectangle) parseRectangleMethod.invoke(awtCodec, parseRectangleMethodArguments));
        
        Rectangle expected = ((Rectangle) createInstance("java.awt.Rectangle"));
        expected.x = 0;
        expected.y = 0;
        expected.width = 0;
        expected.height = 0;
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
        
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
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseRectangle12() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '\r');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 13);
        setField(jSONScanner, "len", 0);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Class awtCodecClazz = Class.forName("com.alibaba.fastjson.serializer.AwtCodec");
        Class defaultJSONParserType = Class.forName("com.alibaba.fastjson.parser.DefaultJSONParser");
        Method parseRectangleMethod = awtCodecClazz.getDeclaredMethod("parseRectangle", defaultJSONParserType);
        parseRectangleMethod.setAccessible(true);
        java.lang.Object[] parseRectangleMethodArguments = new java.lang.Object[1];
        parseRectangleMethodArguments[0] = defaultJSONParser;
        try {
            parseRectangleMethod.invoke(awtCodec, parseRectangleMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerBp = getFieldValue(jSONLexer, "bp");
        JSONLexer jSONLexer1 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerCh = getFieldValue(jSONLexer1, "ch");
        JSONLexer jSONLexer2 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerPos = getFieldValue(jSONLexer2, "pos");
        
        assertEquals(14170, finalDefaultJSONParserLexerBp);
        
        assertEquals('\u001A', finalDefaultJSONParserLexerCh);
        
        assertEquals(14170, finalDefaultJSONParserLexerPos);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testParseRectangle13() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "np", 0);
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '2');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 13);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Class awtCodecClazz = Class.forName("com.alibaba.fastjson.serializer.AwtCodec");
        Class defaultJSONParserType = Class.forName("com.alibaba.fastjson.parser.DefaultJSONParser");
        Method parseRectangleMethod = awtCodecClazz.getDeclaredMethod("parseRectangle", defaultJSONParserType);
        parseRectangleMethod.setAccessible(true);
        java.lang.Object[] parseRectangleMethodArguments = new java.lang.Object[1];
        parseRectangleMethodArguments[0] = defaultJSONParser;
        Rectangle actual = ((Rectangle) parseRectangleMethod.invoke(awtCodec, parseRectangleMethodArguments));
        
        Rectangle expected = ((Rectangle) createInstance("java.awt.Rectangle"));
        expected.x = 0;
        expected.y = 0;
        expected.width = 0;
        expected.height = 0;
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
        
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
    public void testParseRectangle14() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '+');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 13);
        setField(jSONScanner, "len", 0);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Class awtCodecClazz = Class.forName("com.alibaba.fastjson.serializer.AwtCodec");
        Class defaultJSONParserType = Class.forName("com.alibaba.fastjson.parser.DefaultJSONParser");
        Method parseRectangleMethod = awtCodecClazz.getDeclaredMethod("parseRectangle", defaultJSONParserType);
        parseRectangleMethod.setAccessible(true);
        java.lang.Object[] parseRectangleMethodArguments = new java.lang.Object[1];
        parseRectangleMethodArguments[0] = defaultJSONParser;
        Rectangle actual = ((Rectangle) parseRectangleMethod.invoke(awtCodec, parseRectangleMethodArguments));
        
        Rectangle expected = ((Rectangle) createInstance("java.awt.Rectangle"));
        expected.x = 0;
        expected.y = 0;
        expected.width = 0;
        expected.height = 0;
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
        
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
    
    @Test(timeout = 10000)
    public void testParseRectangle15() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", ',');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 13);
        setField(jSONScanner, "len", 0);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Class awtCodecClazz = Class.forName("com.alibaba.fastjson.serializer.AwtCodec");
        Class defaultJSONParserType = Class.forName("com.alibaba.fastjson.parser.DefaultJSONParser");
        Method parseRectangleMethod = awtCodecClazz.getDeclaredMethod("parseRectangle", defaultJSONParserType);
        parseRectangleMethod.setAccessible(true);
        java.lang.Object[] parseRectangleMethodArguments = new java.lang.Object[1];
        parseRectangleMethodArguments[0] = defaultJSONParser;
        Rectangle actual = ((Rectangle) parseRectangleMethod.invoke(awtCodec, parseRectangleMethodArguments));
        
        Rectangle expected = ((Rectangle) createInstance("java.awt.Rectangle"));
        expected.x = 0;
        expected.y = 0;
        expected.width = 0;
        expected.height = 0;
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerBp = getFieldValue(jSONLexer, "bp");
        JSONLexer jSONLexer1 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerCh = getFieldValue(jSONLexer1, "ch");
        JSONLexer jSONLexer2 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerToken = getFieldValue(jSONLexer2, "token");
        
        assertEquals(1, finalDefaultJSONParserLexerBp);
        
        assertEquals('\u001A', finalDefaultJSONParserLexerCh);
        
        assertEquals(16, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParsePoint1() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        java.lang.Object[] ofIntArray = createArray("java.util.stream.ForEachOps$ForEachOp$OfInt", 0);
        
        Class awtCodecClazz = Class.forName("com.alibaba.fastjson.serializer.AwtCodec");
        Class defaultJSONParserType = Class.forName("com.alibaba.fastjson.parser.DefaultJSONParser");
        Class ofIntArrayType = Class.forName("java.lang.Object");
        Method parsePointMethod = awtCodecClazz.getDeclaredMethod("parsePoint", defaultJSONParserType, ofIntArrayType);
        parsePointMethod.setAccessible(true);
        java.lang.Object[] parsePointMethodArguments = new java.lang.Object[2];
        parsePointMethodArguments[0] = null;
        parsePointMethodArguments[1] = ((Object) ofIntArray);
        try {
            parsePointMethod.invoke(awtCodec, parsePointMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testParsePoint2() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '\u0000');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 13);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Class awtCodecClazz = Class.forName("com.alibaba.fastjson.serializer.AwtCodec");
        Class defaultJSONParserType = Class.forName("com.alibaba.fastjson.parser.DefaultJSONParser");
        Class objectType = Class.forName("java.lang.Object");
        Method parsePointMethod = awtCodecClazz.getDeclaredMethod("parsePoint", defaultJSONParserType, objectType);
        parsePointMethod.setAccessible(true);
        java.lang.Object[] parsePointMethodArguments = new java.lang.Object[2];
        parsePointMethodArguments[0] = defaultJSONParser;
        parsePointMethodArguments[1] = null;
        Point actual = ((Point) parsePointMethod.invoke(awtCodec, parsePointMethodArguments));
        
        Point expected = ((Point) createInstance("java.awt.Point"));
        expected.x = 0;
        expected.y = 0;
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerToken = getFieldValue(jSONLexer, "token");
        
        assertEquals(20, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testParsePoint3() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", ':');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 13);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Class awtCodecClazz = Class.forName("com.alibaba.fastjson.serializer.AwtCodec");
        Class defaultJSONParserType = Class.forName("com.alibaba.fastjson.parser.DefaultJSONParser");
        Class objectType = Class.forName("java.lang.Object");
        Method parsePointMethod = awtCodecClazz.getDeclaredMethod("parsePoint", defaultJSONParserType, objectType);
        parsePointMethod.setAccessible(true);
        java.lang.Object[] parsePointMethodArguments = new java.lang.Object[2];
        parsePointMethodArguments[0] = defaultJSONParser;
        parsePointMethodArguments[1] = null;
        Point actual = ((Point) parsePointMethod.invoke(awtCodec, parsePointMethodArguments));
        
        Point expected = ((Point) createInstance("java.awt.Point"));
        expected.x = 0;
        expected.y = 0;
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
        
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
    public void testParsePoint4() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", ',');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 13);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Class awtCodecClazz = Class.forName("com.alibaba.fastjson.serializer.AwtCodec");
        Class defaultJSONParserType = Class.forName("com.alibaba.fastjson.parser.DefaultJSONParser");
        Class objectType = Class.forName("java.lang.Object");
        Method parsePointMethod = awtCodecClazz.getDeclaredMethod("parsePoint", defaultJSONParserType, objectType);
        parsePointMethod.setAccessible(true);
        java.lang.Object[] parsePointMethodArguments = new java.lang.Object[2];
        parsePointMethodArguments[0] = defaultJSONParser;
        parsePointMethodArguments[1] = null;
        Point actual = ((Point) parsePointMethod.invoke(awtCodec, parsePointMethodArguments));
        
        Point expected = ((Point) createInstance("java.awt.Point"));
        expected.x = 0;
        expected.y = 0;
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerBp = getFieldValue(jSONLexer, "bp");
        JSONLexer jSONLexer1 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerCh = getFieldValue(jSONLexer1, "ch");
        JSONLexer jSONLexer2 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerToken = getFieldValue(jSONLexer2, "token");
        
        assertEquals(1, finalDefaultJSONParserLexerBp);
        
        assertEquals('\u001A', finalDefaultJSONParserLexerCh);
        
        assertEquals(16, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParsePoint5() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '/');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 13);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Class awtCodecClazz = Class.forName("com.alibaba.fastjson.serializer.AwtCodec");
        Class defaultJSONParserType = Class.forName("com.alibaba.fastjson.parser.DefaultJSONParser");
        Class objectType = Class.forName("java.lang.Object");
        Method parsePointMethod = awtCodecClazz.getDeclaredMethod("parsePoint", defaultJSONParserType, objectType);
        parsePointMethod.setAccessible(true);
        java.lang.Object[] parsePointMethodArguments = new java.lang.Object[2];
        parsePointMethodArguments[0] = defaultJSONParser;
        parsePointMethodArguments[1] = null;
        try {
            parsePointMethod.invoke(awtCodec, parsePointMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
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
    public void testParsePoint6() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", ']');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 13);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Class awtCodecClazz = Class.forName("com.alibaba.fastjson.serializer.AwtCodec");
        Class defaultJSONParserType = Class.forName("com.alibaba.fastjson.parser.DefaultJSONParser");
        Class objectType = Class.forName("java.lang.Object");
        Method parsePointMethod = awtCodecClazz.getDeclaredMethod("parsePoint", defaultJSONParserType, objectType);
        parsePointMethod.setAccessible(true);
        java.lang.Object[] parsePointMethodArguments = new java.lang.Object[2];
        parsePointMethodArguments[0] = defaultJSONParser;
        parsePointMethodArguments[1] = null;
        Point actual = ((Point) parsePointMethod.invoke(awtCodec, parsePointMethodArguments));
        
        Point expected = ((Point) createInstance("java.awt.Point"));
        expected.x = 0;
        expected.y = 0;
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
        
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
    
    @Test(timeout = 10000)
    public void testParsePoint7() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '-');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 13);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Class awtCodecClazz = Class.forName("com.alibaba.fastjson.serializer.AwtCodec");
        Class defaultJSONParserType = Class.forName("com.alibaba.fastjson.parser.DefaultJSONParser");
        Class objectType = Class.forName("java.lang.Object");
        Method parsePointMethod = awtCodecClazz.getDeclaredMethod("parsePoint", defaultJSONParserType, objectType);
        parsePointMethod.setAccessible(true);
        java.lang.Object[] parsePointMethodArguments = new java.lang.Object[2];
        parsePointMethodArguments[0] = defaultJSONParser;
        parsePointMethodArguments[1] = null;
        Point actual = ((Point) parsePointMethod.invoke(awtCodec, parsePointMethodArguments));
        
        Point expected = ((Point) createInstance("java.awt.Point"));
        expected.x = 0;
        expected.y = 0;
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
        
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
    public void testParsePoint8() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "hasSpecial", false);
        setField(jSONScanner, "np", 0);
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '\"');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 13);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Class awtCodecClazz = Class.forName("com.alibaba.fastjson.serializer.AwtCodec");
        Class defaultJSONParserType = Class.forName("com.alibaba.fastjson.parser.DefaultJSONParser");
        Class objectType = Class.forName("java.lang.Object");
        Method parsePointMethod = awtCodecClazz.getDeclaredMethod("parsePoint", defaultJSONParserType, objectType);
        parsePointMethod.setAccessible(true);
        java.lang.Object[] parsePointMethodArguments = new java.lang.Object[2];
        parsePointMethodArguments[0] = defaultJSONParser;
        parsePointMethodArguments[1] = null;
        try {
            parsePointMethod.invoke(awtCodec, parsePointMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
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
    public void testParsePoint9() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "np", 0);
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '2');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 13);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Class awtCodecClazz = Class.forName("com.alibaba.fastjson.serializer.AwtCodec");
        Class defaultJSONParserType = Class.forName("com.alibaba.fastjson.parser.DefaultJSONParser");
        Class objectType = Class.forName("java.lang.Object");
        Method parsePointMethod = awtCodecClazz.getDeclaredMethod("parsePoint", defaultJSONParserType, objectType);
        parsePointMethod.setAccessible(true);
        java.lang.Object[] parsePointMethodArguments = new java.lang.Object[2];
        parsePointMethodArguments[0] = defaultJSONParser;
        parsePointMethodArguments[1] = null;
        Point actual = ((Point) parsePointMethod.invoke(awtCodec, parsePointMethodArguments));
        
        Point expected = ((Point) createInstance("java.awt.Point"));
        expected.x = 0;
        expected.y = 0;
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
        
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
        java.lang.Object[] ofIntArray = createArray("java.util.stream.ForEachOps$ForEachOp$OfInt", 0);
        
        Class awtCodecClazz = Class.forName("com.alibaba.fastjson.serializer.AwtCodec");
        Class defaultJSONParserType = Class.forName("com.alibaba.fastjson.parser.DefaultJSONParser");
        Class ofIntArrayType = Class.forName("java.lang.Object");
        Method parseRefMethod = awtCodecClazz.getDeclaredMethod("parseRef", defaultJSONParserType, ofIntArrayType);
        parseRefMethod.setAccessible(true);
        java.lang.Object[] parseRefMethodArguments = new java.lang.Object[2];
        parseRefMethodArguments[0] = null;
        parseRefMethodArguments[1] = ((Object) ofIntArray);
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
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", Integer.MAX_VALUE);
        setField(jSONScanner, "ch", ':');
        setField(jSONScanner, "len", 1);
        String string = new String("");
        setField(jSONScanner, "text", string);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Class awtCodecClazz = Class.forName("com.alibaba.fastjson.serializer.AwtCodec");
        Class defaultJSONParserType = Class.forName("com.alibaba.fastjson.parser.DefaultJSONParser");
        Class objectType = Class.forName("java.lang.Object");
        Method parseRefMethod = awtCodecClazz.getDeclaredMethod("parseRef", defaultJSONParserType, objectType);
        parseRefMethod.setAccessible(true);
        java.lang.Object[] parseRefMethodArguments = new java.lang.Object[2];
        parseRefMethodArguments[0] = defaultJSONParser;
        parseRefMethodArguments[1] = null;
        try {
            parseRefMethod.invoke(awtCodec, parseRefMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerBp = getFieldValue(jSONLexer, "bp");
        
        assertEquals(Integer.MIN_VALUE, finalDefaultJSONParserLexerBp);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseRef4() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '\t');
        setField(jSONScanner, "len", 0);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Class awtCodecClazz = Class.forName("com.alibaba.fastjson.serializer.AwtCodec");
        Class defaultJSONParserType = Class.forName("com.alibaba.fastjson.parser.DefaultJSONParser");
        Class objectType = Class.forName("java.lang.Object");
        Method parseRefMethod = awtCodecClazz.getDeclaredMethod("parseRef", defaultJSONParserType, objectType);
        parseRefMethod.setAccessible(true);
        java.lang.Object[] parseRefMethodArguments = new java.lang.Object[2];
        parseRefMethodArguments[0] = defaultJSONParser;
        parseRefMethodArguments[1] = null;
        try {
            parseRefMethod.invoke(awtCodec, parseRefMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
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
    public void testParseRef5() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "ch", ':');
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Class awtCodecClazz = Class.forName("com.alibaba.fastjson.serializer.AwtCodec");
        Class defaultJSONParserType = Class.forName("com.alibaba.fastjson.parser.DefaultJSONParser");
        Class objectType = Class.forName("java.lang.Object");
        Method parseRefMethod = awtCodecClazz.getDeclaredMethod("parseRef", defaultJSONParserType, objectType);
        parseRefMethod.setAccessible(true);
        java.lang.Object[] parseRefMethodArguments = new java.lang.Object[2];
        parseRefMethodArguments[0] = defaultJSONParser;
        parseRefMethodArguments[1] = null;
        try {
            parseRefMethod.invoke(awtCodec, parseRefMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerCh = getFieldValue(jSONLexer, "ch");
        
        assertEquals('\u001A', finalDefaultJSONParserLexerCh);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testAwtCodec1() {
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
