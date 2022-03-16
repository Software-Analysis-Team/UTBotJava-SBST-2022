package com.alibaba.fastjson.serializer;

import org.junit.Test;
import sun.reflect.generics.reflectiveObjects.WildcardTypeImpl;
import sun.nio.cs.StreamEncoder;
import java.awt.SystemColor;
import sun.reflect.generics.reflectiveObjects.TypeVariableImpl;
import kotlin.jvm.internal.Ref.LongRef;
import kotlin.jvm.internal.Ref;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.JSONScanner;
import com.alibaba.fastjson.parser.JSONLexer;
import com.alibaba.fastjson.parser.JSONReaderScanner;
import java.lang.reflect.Method;
import java.awt.Font;
import java.io.BufferedReader;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.Point;
import java.io.PrintWriter;
import java.io.FileWriter;
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

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static java.lang.reflect.Array.get;

public class AwtCodecTest {
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testWrite1() throws Throwable  {
        AwtCodec awtCodec = new AwtCodec();
        JSONSerializer jSONSerializer = new JSONSerializer();
        Object object = new Object();
        Object object1 = new Object();
        
        awtCodec.write(jSONSerializer, object, object1, null, 0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testWrite2() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        java.lang.Object[] forEachTaskArray = createArray("java.util.stream.ForEachOps$ForEachTask", 0);
        java.lang.Object[] stringBuilderHelperArray = createArray("java.math.BigDecimal$StringBuilderHelper", 0);
        WildcardTypeImpl wildcardTypeImpl = ((WildcardTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.WildcardTypeImpl"));
        
        awtCodec.write(null, forEachTaskArray, stringBuilderHelperArray, wildcardTypeImpl, 0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testWrite3() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        SerializeWriter serializeWriter = ((SerializeWriter) createInstance("com.alibaba.fastjson.serializer.SerializeWriter"));
        setField(jSONSerializer, "out", serializeWriter);
        java.lang.Object[] forEachTaskArray = createArray("java.util.stream.ForEachOps$ForEachTask", 0);
        
        awtCodec.write(jSONSerializer, forEachTaskArray, null, null, 0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testWrite4() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        SerializeWriter serializeWriter = ((SerializeWriter) createInstance("com.alibaba.fastjson.serializer.SerializeWriter"));
        serializeWriter.count = -507;
        char[] charArray = new char[0];
        serializeWriter.buf = charArray;
        setField(jSONSerializer, "out", serializeWriter);
        
        awtCodec.write(jSONSerializer, null, null, null, 0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testWrite5() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        SerializeWriter serializeWriter = ((SerializeWriter) createInstance("com.alibaba.fastjson.serializer.SerializeWriter"));
        StreamEncoder streamEncoder = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(serializeWriter, "writer", streamEncoder);
        serializeWriter.count = 2147483141;
        char[] charArray = new char[0];
        serializeWriter.buf = charArray;
        setField(jSONSerializer, "out", serializeWriter);
        
        awtCodec.write(jSONSerializer, null, null, null, 0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testWrite6() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        JSONSerializer jSONSerializer = ((JSONSerializer) createInstance("com.alibaba.fastjson.serializer.JSONSerializer"));
        SerializeWriter serializeWriter = ((SerializeWriter) createInstance("com.alibaba.fastjson.serializer.SerializeWriter"));
        setField(jSONSerializer, "out", serializeWriter);
        SystemColor systemColor = ((SystemColor) createInstance("java.awt.SystemColor"));
        
        awtCodec.write(jSONSerializer, systemColor, null, null, 0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDeserialze1() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        TypeVariableImpl typeVariableImpl = ((TypeVariableImpl) createInstance("sun.reflect.generics.reflectiveObjects.TypeVariableImpl"));
        kotlin.jvm.internal.Ref.LongRef[] longRefArray = new kotlin.jvm.internal.Ref.LongRef[0];
        
        awtCodec.deserialze(null, typeVariableImpl, longRefArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDeserialze2() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 1);
        setField(jSONScanner, "ch", '}');
        setField(jSONScanner, "token", 8);
        setField(jSONScanner, "len", -2147483645);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Object actual = awtCodec.deserialze(defaultJSONParser, null, null);
        
        assertNull(actual);
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerBp = getFieldValue(jSONLexer, "bp");
        JSONLexer jSONLexer1 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerCh = getFieldValue(jSONLexer1, "ch");
        JSONLexer jSONLexer2 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerToken = getFieldValue(jSONLexer2, "token");
        
        assertEquals(2, finalDefaultJSONParserLexerBp);
        
        assertEquals('\u001A', finalDefaultJSONParserLexerCh);
        
        assertEquals(13, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDeserialze3() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "ch", '\u001A');
        setField(jSONScanner, "token", 8);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Object actual = awtCodec.deserialze(defaultJSONParser, null, null);
        
        assertNull(actual);
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerToken = getFieldValue(jSONLexer, "token");
        
        assertEquals(20, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDeserialze4() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", 'S');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 8);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        awtCodec.deserialze(defaultJSONParser, null, null);
        
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
    
    @Test(timeout = 10000)
    public void testDeserialze5() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '@');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 8);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Object actual = awtCodec.deserialze(defaultJSONParser, null, null);
        
        assertNull(actual);
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerToken = getFieldValue(jSONLexer, "token");
        
        assertEquals(20, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDeserialze6() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '2');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 8);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Object actual = awtCodec.deserialze(defaultJSONParser, null, null);
        
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
    public void testDeserialze7() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", Integer.MAX_VALUE);
        setField(jSONScanner, "ch", '\r');
        setField(jSONScanner, "token", 8);
        setField(jSONScanner, "len", 1);
        String string = new String("");
        setField(jSONScanner, "text", string);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        awtCodec.deserialze(defaultJSONParser, null, null);
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerBp = getFieldValue(jSONLexer, "bp");
        
        assertEquals(Integer.MIN_VALUE, finalDefaultJSONParserLexerBp);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDeserialze8() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '\n');
        setField(jSONScanner, "token", 8);
        setField(jSONScanner, "len", 0);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Object actual = awtCodec.deserialze(defaultJSONParser, null, null);
        
        assertNull(actual);
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerBp = getFieldValue(jSONLexer, "bp");
        JSONLexer jSONLexer1 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerCh = getFieldValue(jSONLexer1, "ch");
        JSONLexer jSONLexer2 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerToken = getFieldValue(jSONLexer2, "token");
        
        assertEquals(1, finalDefaultJSONParserLexerBp);
        
        assertEquals('\u001A', finalDefaultJSONParserLexerCh);
        
        assertEquals(20, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDeserialze9() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '{');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 8);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Object actual = awtCodec.deserialze(defaultJSONParser, null, null);
        
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
    public void testDeserialze10() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", ':');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 8);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Object actual = awtCodec.deserialze(defaultJSONParser, null, null);
        
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
    public void testDeserialze11() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '.');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 8);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Object actual = awtCodec.deserialze(defaultJSONParser, null, null);
        
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
    public void testDeserialze12() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '+');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 8);
        setField(jSONScanner, "len", 0);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Object actual = awtCodec.deserialze(defaultJSONParser, null, null);
        
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
    
    @Test(timeout = 10000)
    public void testDeserialze13() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '(');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 8);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Object actual = awtCodec.deserialze(defaultJSONParser, null, null);
        
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
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDeserialze14() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", 'x');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 8);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        awtCodec.deserialze(defaultJSONParser, null, null);
        
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
    public void testDeserialze15() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", Integer.MAX_VALUE);
        setField(jSONScanner, "ch", ']');
        setField(jSONScanner, "token", 8);
        setField(jSONScanner, "len", 1);
        String string = new String("");
        setField(jSONScanner, "text", string);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        awtCodec.deserialze(defaultJSONParser, null, null);
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerBp = getFieldValue(jSONLexer, "bp");
        JSONLexer jSONLexer1 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerToken = getFieldValue(jSONLexer1, "token");
        
        assertEquals(Integer.MIN_VALUE, finalDefaultJSONParserLexerBp);
        
        assertEquals(15, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDeserialze16() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '/');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 8);
        setField(jSONScanner, "len", 0);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        awtCodec.deserialze(defaultJSONParser, null, null);
        
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
    public void testDeserialze17() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", ')');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 8);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Object actual = awtCodec.deserialze(defaultJSONParser, null, null);
        
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
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDeserialze18() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONReaderScanner jSONReaderScanner = ((JSONReaderScanner) createInstance("com.alibaba.fastjson.parser.JSONReaderScanner"));
        setField(jSONReaderScanner, "np", 0);
        setField(jSONReaderScanner, "sp", 0);
        setField(jSONReaderScanner, "bp", 0);
        setField(jSONReaderScanner, "ch", '}');
        setField(jSONReaderScanner, "token", 8);
        setField(jSONReaderScanner, "bufLength", 0);
        setField(defaultJSONParser, "lexer", jSONReaderScanner);
        
        awtCodec.deserialze(defaultJSONParser, null, null);
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerNp = getFieldValue(jSONLexer, "np");
        JSONLexer jSONLexer1 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerToken = getFieldValue(jSONLexer1, "token");
        
        assertEquals(-1, finalDefaultJSONParserLexerNp);
        
        assertEquals(13, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDeserialze19() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", ';');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 8);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Object actual = awtCodec.deserialze(defaultJSONParser, null, null);
        
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
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDeserialze20() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", 't');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 8);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        awtCodec.deserialze(defaultJSONParser, null, null);
        
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
    public void testDeserialze21() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "np", 0);
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '-');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 8);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Object actual = awtCodec.deserialze(defaultJSONParser, null, null);
        
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
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", 'f');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 8);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        awtCodec.deserialze(defaultJSONParser, null, null);
        
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
    public void testDeserialze23() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "hasSpecial", false);
        setField(jSONScanner, "np", 0);
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '\"');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 8);
        setField(jSONScanner, "len", 0);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        awtCodec.deserialze(defaultJSONParser, null, null);
        
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
    public void testDeserialze24() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "ch", ']');
        setField(jSONScanner, "token", 8);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Object actual = awtCodec.deserialze(defaultJSONParser, null, null);
        
        assertNull(actual);
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerCh = getFieldValue(jSONLexer, "ch");
        JSONLexer jSONLexer1 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerToken = getFieldValue(jSONLexer1, "token");
        
        assertEquals('\u001A', finalDefaultJSONParserLexerCh);
        
        assertEquals(15, finalDefaultJSONParserLexerToken);
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
        setField(jSONScanner, "token", 0);
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
    public void testParseFont3() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONReaderScanner jSONReaderScanner = ((JSONReaderScanner) createInstance("com.alibaba.fastjson.parser.JSONReaderScanner"));
        setField(jSONReaderScanner, "sp", 0);
        setField(jSONReaderScanner, "bp", Integer.MAX_VALUE);
        setField(jSONReaderScanner, "ch", ')');
        setField(jSONReaderScanner, "pos", 0);
        setField(jSONReaderScanner, "token", 13);
        setField(jSONReaderScanner, "bufLength", 1);
        char[] charArray = new char[9];
        setField(jSONReaderScanner, "buf", charArray);
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
        Object finalDefaultJSONParserLexerBp = getFieldValue(jSONLexer, "bp");
        JSONLexer jSONLexer1 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerPos = getFieldValue(jSONLexer1, "pos");
        
        assertEquals(Integer.MIN_VALUE, finalDefaultJSONParserLexerBp);
        
        assertEquals(Integer.MAX_VALUE, finalDefaultJSONParserLexerPos);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseFont4() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONReaderScanner jSONReaderScanner = ((JSONReaderScanner) createInstance("com.alibaba.fastjson.parser.JSONReaderScanner"));
        setField(jSONReaderScanner, "sp", 0);
        setField(jSONReaderScanner, "bp", 1073741831);
        setField(jSONReaderScanner, "ch", '\r');
        setField(jSONReaderScanner, "pos", 0);
        setField(jSONReaderScanner, "token", 13);
        setField(jSONReaderScanner, "bufLength", 1073741833);
        char[] charArray = new char[9];
        setField(jSONReaderScanner, "buf", charArray);
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
        Object finalDefaultJSONParserLexerBp = getFieldValue(jSONLexer, "bp");
        JSONLexer jSONLexer1 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerPos = getFieldValue(jSONLexer1, "pos");
        
        assertEquals(1073741832, finalDefaultJSONParserLexerBp);
        
        assertEquals(1073741831, finalDefaultJSONParserLexerPos);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testParseFont5() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "eofPos", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '<');
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
        Object finalDefaultJSONParserLexerToken = getFieldValue(jSONLexer, "token");
        
        assertEquals(20, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testParseFont6() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", -1);
        setField(jSONScanner, "ch", '{');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 13);
        setField(jSONScanner, "len", 1);
        String string = new String("\u0000");
        setField(jSONScanner, "text", string);
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
        String string1 = new String("Default");
        setField(expected, "name", string1);
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
        Object finalDefaultJSONParserLexerPos = getFieldValue(jSONLexer2, "pos");
        JSONLexer jSONLexer3 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerToken = getFieldValue(jSONLexer3, "token");
        
        assertEquals(0, finalDefaultJSONParserLexerBp);
        
        assertEquals('\u0000', finalDefaultJSONParserLexerCh);
        
        assertEquals(-1, finalDefaultJSONParserLexerPos);
        
        assertEquals(12, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseFont7() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "hasSpecial", true);
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "sbuf", null);
        setField(jSONScanner, "token", 4);
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
    
    @Test(timeout = 10000)
    public void testParseFont8() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 1);
        setField(jSONScanner, "ch", ',');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 13);
        setField(jSONScanner, "len", -2147483645);
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
        Object finalDefaultJSONParserLexerPos = getFieldValue(jSONLexer2, "pos");
        JSONLexer jSONLexer3 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerToken = getFieldValue(jSONLexer3, "token");
        
        assertEquals(2, finalDefaultJSONParserLexerBp);
        
        assertEquals('\u001A', finalDefaultJSONParserLexerCh);
        
        assertEquals(1, finalDefaultJSONParserLexerPos);
        
        assertEquals(16, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testParseFont9() throws Throwable  {
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
    public void testParseFont10() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "hasSpecial", false);
        setField(jSONScanner, "np", 0);
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", Integer.MAX_VALUE);
        setField(jSONScanner, "ch", 'T');
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
        Object finalDefaultJSONParserLexerNp = getFieldValue(jSONLexer, "np");
        JSONLexer jSONLexer1 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerSp = getFieldValue(jSONLexer1, "sp");
        JSONLexer jSONLexer2 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerBp = getFieldValue(jSONLexer2, "bp");
        JSONLexer jSONLexer3 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerPos = getFieldValue(jSONLexer3, "pos");
        
        assertEquals(2147483646, finalDefaultJSONParserLexerNp);
        
        assertEquals(1, finalDefaultJSONParserLexerSp);
        
        assertEquals(Integer.MIN_VALUE, finalDefaultJSONParserLexerBp);
        
        assertEquals(Integer.MAX_VALUE, finalDefaultJSONParserLexerPos);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseFont11() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONReaderScanner jSONReaderScanner = ((JSONReaderScanner) createInstance("com.alibaba.fastjson.parser.JSONReaderScanner"));
        setField(jSONReaderScanner, "sp", 0);
        setField(jSONReaderScanner, "bp", 0);
        setField(jSONReaderScanner, "ch", ':');
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
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testParseFont12() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 1);
        setField(jSONScanner, "ch", ';');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 13);
        setField(jSONScanner, "len", -2147483645);
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
        Object finalDefaultJSONParserLexerPos = getFieldValue(jSONLexer2, "pos");
        JSONLexer jSONLexer3 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerToken = getFieldValue(jSONLexer3, "token");
        
        assertEquals(2, finalDefaultJSONParserLexerBp);
        
        assertEquals('\u001A', finalDefaultJSONParserLexerCh);
        
        assertEquals(1, finalDefaultJSONParserLexerPos);
        
        assertEquals(24, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseFont13() throws Throwable  {
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
    public void testParseFont14() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONReaderScanner jSONReaderScanner = ((JSONReaderScanner) createInstance("com.alibaba.fastjson.parser.JSONReaderScanner"));
        setField(jSONReaderScanner, "hasSpecial", false);
        setField(jSONReaderScanner, "np", 0);
        setField(jSONReaderScanner, "sp", 0);
        setField(jSONReaderScanner, "bp", 0);
        setField(jSONReaderScanner, "ch", 'u');
        setField(jSONReaderScanner, "pos", 0);
        setField(jSONReaderScanner, "token", 13);
        setField(jSONReaderScanner, "bufLength", -1);
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
        JSONLexer jSONLexer1 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerSp = getFieldValue(jSONLexer1, "sp");
        JSONLexer jSONLexer2 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerBp = getFieldValue(jSONLexer2, "bp");
        
        assertEquals(-1, finalDefaultJSONParserLexerNp);
        
        assertEquals(32767, finalDefaultJSONParserLexerSp);
        
        assertEquals(32767, finalDefaultJSONParserLexerBp);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseFont15() throws Throwable  {
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
    public void testParseFont16() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONReaderScanner jSONReaderScanner = ((JSONReaderScanner) createInstance("com.alibaba.fastjson.parser.JSONReaderScanner"));
        setField(jSONReaderScanner, "sp", 0);
        setField(jSONReaderScanner, "eofPos", 0);
        setField(jSONReaderScanner, "bp", 0);
        setField(jSONReaderScanner, "ch", '<');
        setField(jSONReaderScanner, "pos", 0);
        setField(jSONReaderScanner, "token", 13);
        setField(jSONReaderScanner, "bufLength", -1);
        setField(defaultJSONParser, "lexer", jSONReaderScanner);
        
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
    public void testParseFont17() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONReaderScanner jSONReaderScanner = ((JSONReaderScanner) createInstance("com.alibaba.fastjson.parser.JSONReaderScanner"));
        setField(jSONReaderScanner, "np", 0);
        setField(jSONReaderScanner, "sp", 0);
        setField(jSONReaderScanner, "bp", 1);
        setField(jSONReaderScanner, "ch", ')');
        setField(jSONReaderScanner, "pos", 0);
        setField(jSONReaderScanner, "token", 13);
        setField(jSONReaderScanner, "bufLength", -2147483645);
        char[] charArray = new char[0];
        setField(jSONReaderScanner, "buf", charArray);
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
        JSONLexer jSONLexer1 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerBp = getFieldValue(jSONLexer1, "bp");
        JSONLexer jSONLexer2 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerPos = getFieldValue(jSONLexer2, "pos");
        JSONLexer jSONLexer3 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerBuf = getFieldValue(jSONLexer3, "buf");
        
        assertEquals(-1, finalDefaultJSONParserLexerNp);
        
        assertEquals(0, finalDefaultJSONParserLexerBp);
        
        assertEquals(1, finalDefaultJSONParserLexerPos);
        
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testParseFont18() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "np", 0);
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '+');
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
        Object finalDefaultJSONParserLexerNp = getFieldValue(jSONLexer, "np");
        JSONLexer jSONLexer1 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerBp = getFieldValue(jSONLexer1, "bp");
        JSONLexer jSONLexer2 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerCh = getFieldValue(jSONLexer2, "ch");
        JSONLexer jSONLexer3 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerToken = getFieldValue(jSONLexer3, "token");
        
        assertEquals(1, finalDefaultJSONParserLexerNp);
        
        assertEquals(1, finalDefaultJSONParserLexerBp);
        
        assertEquals('\u001A', finalDefaultJSONParserLexerCh);
        
        assertEquals(2, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseFont19() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONReaderScanner jSONReaderScanner = ((JSONReaderScanner) createInstance("com.alibaba.fastjson.parser.JSONReaderScanner"));
        setField(jSONReaderScanner, "hasSpecial", false);
        setField(jSONReaderScanner, "np", 0);
        setField(jSONReaderScanner, "sp", 0);
        setField(jSONReaderScanner, "bp", 0);
        setField(jSONReaderScanner, "ch", 'T');
        setField(jSONReaderScanner, "pos", 0);
        setField(jSONReaderScanner, "token", 13);
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
        JSONLexer jSONLexer1 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerSp = getFieldValue(jSONLexer1, "sp");
        JSONLexer jSONLexer2 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerBp = getFieldValue(jSONLexer2, "bp");
        
        assertEquals(-1, finalDefaultJSONParserLexerNp);
        
        assertEquals(1, finalDefaultJSONParserLexerSp);
        
        assertEquals(1, finalDefaultJSONParserLexerBp);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testParseFont20() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONReaderScanner jSONReaderScanner = ((JSONReaderScanner) createInstance("com.alibaba.fastjson.parser.JSONReaderScanner"));
        setField(jSONReaderScanner, "sp", 0);
        setField(jSONReaderScanner, "bp", 7);
        setField(jSONReaderScanner, "ch", ')');
        setField(jSONReaderScanner, "pos", 0);
        setField(jSONReaderScanner, "token", 13);
        setField(jSONReaderScanner, "bufLength", 9);
        char[] charArray = new char[9];
        setField(jSONReaderScanner, "buf", charArray);
        setField(defaultJSONParser, "lexer", jSONReaderScanner);
        
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
        Object finalDefaultJSONParserLexerPos = getFieldValue(jSONLexer2, "pos");
        JSONLexer jSONLexer3 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerToken = getFieldValue(jSONLexer3, "token");
        
        assertEquals(8, finalDefaultJSONParserLexerBp);
        
        assertEquals('\u0000', finalDefaultJSONParserLexerCh);
        
        assertEquals(7, finalDefaultJSONParserLexerPos);
        
        assertEquals(11, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testParseFont21() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 1);
        setField(jSONScanner, "ch", ':');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 13);
        setField(jSONScanner, "len", -2147483645);
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
        Object finalDefaultJSONParserLexerPos = getFieldValue(jSONLexer2, "pos");
        JSONLexer jSONLexer3 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerToken = getFieldValue(jSONLexer3, "token");
        
        assertEquals(2, finalDefaultJSONParserLexerBp);
        
        assertEquals('\u001A', finalDefaultJSONParserLexerCh);
        
        assertEquals(1, finalDefaultJSONParserLexerPos);
        
        assertEquals(17, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseFont22() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONReaderScanner jSONReaderScanner = ((JSONReaderScanner) createInstance("com.alibaba.fastjson.parser.JSONReaderScanner"));
        setField(jSONReaderScanner, "hasSpecial", true);
        setField(jSONReaderScanner, "sp", 0);
        setField(jSONReaderScanner, "sbuf", null);
        setField(jSONReaderScanner, "token", 4);
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
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseFont23() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONReaderScanner jSONReaderScanner = ((JSONReaderScanner) createInstance("com.alibaba.fastjson.parser.JSONReaderScanner"));
        setField(jSONReaderScanner, "np", 0);
        setField(jSONReaderScanner, "sp", 0);
        setField(jSONReaderScanner, "bp", 1);
        setField(jSONReaderScanner, "ch", '[');
        setField(jSONReaderScanner, "pos", 0);
        setField(jSONReaderScanner, "token", 13);
        setField(jSONReaderScanner, "bufLength", -2147483645);
        char[] charArray = new char[0];
        setField(jSONReaderScanner, "buf", charArray);
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
        JSONLexer jSONLexer1 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerBp = getFieldValue(jSONLexer1, "bp");
        JSONLexer jSONLexer2 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerPos = getFieldValue(jSONLexer2, "pos");
        JSONLexer jSONLexer3 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerBuf = getFieldValue(jSONLexer3, "buf");
        
        assertEquals(-1, finalDefaultJSONParserLexerNp);
        
        assertEquals(0, finalDefaultJSONParserLexerBp);
        
        assertEquals(1, finalDefaultJSONParserLexerPos);
        
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseFont24() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", Integer.MAX_VALUE);
        setField(jSONScanner, "ch", '');
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
    public void testParseFont25() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", Integer.MAX_VALUE);
        setField(jSONScanner, "ch", '\u001A');
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
    public void testParseFont26() throws Throwable  {
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
    public void testParseFont27() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "hasSpecial", false);
        setField(jSONScanner, "np", 0);
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "token", 4);
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
    public void testParseFont28() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 1);
        setField(jSONScanner, "ch", '');
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
        
        assertEquals(14171, finalDefaultJSONParserLexerBp);
        
        assertEquals('\u001A', finalDefaultJSONParserLexerCh);
        
        assertEquals(14170, finalDefaultJSONParserLexerPos);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testParseFont29() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", -1);
        setField(jSONScanner, "ch", '[');
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
        Object finalDefaultJSONParserLexerPos = getFieldValue(jSONLexer2, "pos");
        JSONLexer jSONLexer3 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerToken = getFieldValue(jSONLexer3, "token");
        
        assertEquals(0, finalDefaultJSONParserLexerBp);
        
        assertEquals('\u001A', finalDefaultJSONParserLexerCh);
        
        assertEquals(-1, finalDefaultJSONParserLexerPos);
        
        assertEquals(14, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseFont30() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", -1);
        setField(jSONScanner, "ch", '/');
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
        JSONLexer jSONLexer2 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerPos = getFieldValue(jSONLexer2, "pos");
        
        assertEquals(0, finalDefaultJSONParserLexerBp);
        
        assertEquals('\u001A', finalDefaultJSONParserLexerCh);
        
        assertEquals(-1, finalDefaultJSONParserLexerPos);
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
        JSONReaderScanner jSONReaderScanner = ((JSONReaderScanner) createInstance("com.alibaba.fastjson.parser.JSONReaderScanner"));
        setField(jSONReaderScanner, "sp", 0);
        setField(jSONReaderScanner, "bp", Integer.MAX_VALUE);
        setField(jSONReaderScanner, "ch", '{');
        setField(jSONReaderScanner, "pos", 0);
        setField(jSONReaderScanner, "token", 13);
        setField(jSONReaderScanner, "bufLength", 1);
        char[] charArray = new char[9];
        setField(jSONReaderScanner, "buf", charArray);
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
    public void testParseColor3() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONReaderScanner jSONReaderScanner = ((JSONReaderScanner) createInstance("com.alibaba.fastjson.parser.JSONReaderScanner"));
        setField(jSONReaderScanner, "sp", 0);
        setField(jSONReaderScanner, "bp", Integer.MAX_VALUE);
        setField(jSONReaderScanner, "ch", '+');
        setField(jSONReaderScanner, "pos", 0);
        setField(jSONReaderScanner, "token", 13);
        setField(jSONReaderScanner, "bufLength", 1);
        char[] charArray = new char[9];
        setField(jSONReaderScanner, "buf", charArray);
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
        setField(jSONScanner, "ch", 't');
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
    public void testParseColor6() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONReaderScanner jSONReaderScanner = ((JSONReaderScanner) createInstance("com.alibaba.fastjson.parser.JSONReaderScanner"));
        setField(jSONReaderScanner, "np", 0);
        setField(jSONReaderScanner, "sp", 0);
        setField(jSONReaderScanner, "bp", 1);
        setField(jSONReaderScanner, "ch", '{');
        setField(jSONReaderScanner, "pos", 0);
        setField(jSONReaderScanner, "token", 13);
        setField(jSONReaderScanner, "bufLength", -2147483645);
        char[] charArray = new char[9];
        setField(jSONReaderScanner, "buf", charArray);
        BufferedReader bufferedReader = ((BufferedReader) createInstance("java.io.BufferedReader"));
        setField(bufferedReader, "lock", null);
        setField(bufferedReader, "in", null);
        setField(jSONReaderScanner, "reader", bufferedReader);
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
        }
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerNp = getFieldValue(jSONLexer, "np");
        JSONLexer jSONLexer1 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerBp = getFieldValue(jSONLexer1, "bp");
        JSONLexer jSONLexer2 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerPos = getFieldValue(jSONLexer2, "pos");
        
        assertEquals(-1, finalDefaultJSONParserLexerNp);
        
        assertEquals(0, finalDefaultJSONParserLexerBp);
        
        assertEquals(1, finalDefaultJSONParserLexerPos);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseColor7() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", -1);
        setField(jSONScanner, "ch", 'f');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 13);
        setField(jSONScanner, "len", 1);
        String string = new String("\u0000");
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
        Object finalDefaultJSONParserLexerCh = getFieldValue(jSONLexer1, "ch");
        JSONLexer jSONLexer2 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerPos = getFieldValue(jSONLexer2, "pos");
        
        assertEquals(0, finalDefaultJSONParserLexerBp);
        
        assertEquals('\u0000', finalDefaultJSONParserLexerCh);
        
        assertEquals(-1, finalDefaultJSONParserLexerPos);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseColor8() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", Integer.MAX_VALUE);
        setField(jSONScanner, "ch", 'n');
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
    public void testParseColor9() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONReaderScanner jSONReaderScanner = ((JSONReaderScanner) createInstance("com.alibaba.fastjson.parser.JSONReaderScanner"));
        setField(jSONReaderScanner, "np", 0);
        setField(jSONReaderScanner, "sp", 0);
        setField(jSONReaderScanner, "bp", 1);
        setField(jSONReaderScanner, "ch", '+');
        setField(jSONReaderScanner, "pos", 0);
        setField(jSONReaderScanner, "token", 13);
        setField(jSONReaderScanner, "bufLength", -2147483645);
        char[] charArray = new char[0];
        setField(jSONReaderScanner, "buf", charArray);
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
        }
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerNp = getFieldValue(jSONLexer, "np");
        JSONLexer jSONLexer1 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerBp = getFieldValue(jSONLexer1, "bp");
        JSONLexer jSONLexer2 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerPos = getFieldValue(jSONLexer2, "pos");
        JSONLexer jSONLexer3 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerBuf = getFieldValue(jSONLexer3, "buf");
        
        assertEquals(-1, finalDefaultJSONParserLexerNp);
        
        assertEquals(0, finalDefaultJSONParserLexerBp);
        
        assertEquals(1, finalDefaultJSONParserLexerPos);
        
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseColor10() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONReaderScanner jSONReaderScanner = ((JSONReaderScanner) createInstance("com.alibaba.fastjson.parser.JSONReaderScanner"));
        setField(jSONReaderScanner, "sp", 0);
        setField(jSONReaderScanner, "bp", 7);
        setField(jSONReaderScanner, "ch", '\b');
        setField(jSONReaderScanner, "pos", 0);
        setField(jSONReaderScanner, "token", 13);
        setField(jSONReaderScanner, "bufLength", 9);
        char[] charArray = new char[9];
        setField(jSONReaderScanner, "buf", charArray);
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
        }
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerBp = getFieldValue(jSONLexer, "bp");
        JSONLexer jSONLexer1 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerCh = getFieldValue(jSONLexer1, "ch");
        JSONLexer jSONLexer2 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerPos = getFieldValue(jSONLexer2, "pos");
        
        assertEquals(0, finalDefaultJSONParserLexerBp);
        
        assertEquals('\u0000', finalDefaultJSONParserLexerCh);
        
        assertEquals(8, finalDefaultJSONParserLexerPos);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseColor11() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "hasSpecial", false);
        setField(jSONScanner, "np", 0);
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", Integer.MAX_VALUE);
        setField(jSONScanner, "ch", 'S');
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
        Object finalDefaultJSONParserLexerNp = getFieldValue(jSONLexer, "np");
        JSONLexer jSONLexer1 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerSp = getFieldValue(jSONLexer1, "sp");
        JSONLexer jSONLexer2 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerBp = getFieldValue(jSONLexer2, "bp");
        JSONLexer jSONLexer3 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerPos = getFieldValue(jSONLexer3, "pos");
        
        assertEquals(2147483646, finalDefaultJSONParserLexerNp);
        
        assertEquals(1, finalDefaultJSONParserLexerSp);
        
        assertEquals(Integer.MIN_VALUE, finalDefaultJSONParserLexerBp);
        
        assertEquals(Integer.MAX_VALUE, finalDefaultJSONParserLexerPos);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseColor12() throws Throwable  {
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
        
        assertEquals(14171, finalDefaultJSONParserLexerBp);
        
        assertEquals(14170, finalDefaultJSONParserLexerPos);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testParseColor13() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 1);
        setField(jSONScanner, "ch", ')');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 13);
        setField(jSONScanner, "len", -2147483645);
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
        Object finalDefaultJSONParserLexerPos = getFieldValue(jSONLexer2, "pos");
        JSONLexer jSONLexer3 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerToken = getFieldValue(jSONLexer3, "token");
        
        assertEquals(2, finalDefaultJSONParserLexerBp);
        
        assertEquals('\u001A', finalDefaultJSONParserLexerCh);
        
        assertEquals(1, finalDefaultJSONParserLexerPos);
        
        assertEquals(11, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseColor14() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONReaderScanner jSONReaderScanner = ((JSONReaderScanner) createInstance("com.alibaba.fastjson.parser.JSONReaderScanner"));
        setField(jSONReaderScanner, "hasSpecial", false);
        setField(jSONReaderScanner, "np", 0);
        setField(jSONReaderScanner, "sp", 0);
        setField(jSONReaderScanner, "bp", Integer.MAX_VALUE);
        setField(jSONReaderScanner, "ch", 'u');
        setField(jSONReaderScanner, "pos", 0);
        setField(jSONReaderScanner, "token", 13);
        setField(jSONReaderScanner, "bufLength", Integer.MIN_VALUE);
        char[] charArray = new char[9];
        setField(jSONReaderScanner, "buf", charArray);
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
        }
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerNp = getFieldValue(jSONLexer, "np");
        JSONLexer jSONLexer1 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerSp = getFieldValue(jSONLexer1, "sp");
        JSONLexer jSONLexer2 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerBp = getFieldValue(jSONLexer2, "bp");
        JSONLexer jSONLexer3 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerPos = getFieldValue(jSONLexer3, "pos");
        
        assertEquals(2147483646, finalDefaultJSONParserLexerNp);
        
        assertEquals(1, finalDefaultJSONParserLexerSp);
        
        assertEquals(Integer.MIN_VALUE, finalDefaultJSONParserLexerBp);
        
        assertEquals(Integer.MAX_VALUE, finalDefaultJSONParserLexerPos);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testParseColor15() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 1);
        setField(jSONScanner, "ch", '.');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 13);
        setField(jSONScanner, "len", -2147483645);
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
        Object finalDefaultJSONParserLexerPos = getFieldValue(jSONLexer2, "pos");
        JSONLexer jSONLexer3 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerToken = getFieldValue(jSONLexer3, "token");
        
        assertEquals(2, finalDefaultJSONParserLexerBp);
        
        assertEquals('\u001A', finalDefaultJSONParserLexerCh);
        
        assertEquals(1, finalDefaultJSONParserLexerPos);
        
        assertEquals(25, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testParseColor16() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "eofPos", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '@');
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
        Object finalDefaultJSONParserLexerToken = getFieldValue(jSONLexer, "token");
        
        assertEquals(20, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testParseColor17() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "np", 0);
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '+');
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
        Object finalDefaultJSONParserLexerNp = getFieldValue(jSONLexer, "np");
        JSONLexer jSONLexer1 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerBp = getFieldValue(jSONLexer1, "bp");
        JSONLexer jSONLexer2 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerCh = getFieldValue(jSONLexer2, "ch");
        JSONLexer jSONLexer3 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerToken = getFieldValue(jSONLexer3, "token");
        
        assertEquals(1, finalDefaultJSONParserLexerNp);
        
        assertEquals(1, finalDefaultJSONParserLexerBp);
        
        assertEquals('\u001A', finalDefaultJSONParserLexerCh);
        
        assertEquals(2, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testParseColor18() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONReaderScanner jSONReaderScanner = ((JSONReaderScanner) createInstance("com.alibaba.fastjson.parser.JSONReaderScanner"));
        setField(jSONReaderScanner, "sp", 0);
        setField(jSONReaderScanner, "bp", 0);
        setField(jSONReaderScanner, "ch", '\u0000');
        setField(jSONReaderScanner, "pos", 0);
        setField(jSONReaderScanner, "token", 13);
        setField(jSONReaderScanner, "bufLength", 0);
        char[] charArray = new char[0];
        setField(jSONReaderScanner, "buf", charArray);
        setField(defaultJSONParser, "lexer", jSONReaderScanner);
        
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
        Object finalDefaultJSONParserLexerToken = getFieldValue(jSONLexer, "token");
        
        assertEquals(20, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testParseColor19() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONReaderScanner jSONReaderScanner = ((JSONReaderScanner) createInstance("com.alibaba.fastjson.parser.JSONReaderScanner"));
        setField(jSONReaderScanner, "np", 0);
        setField(jSONReaderScanner, "sp", 0);
        setField(jSONReaderScanner, "bp", 7);
        setField(jSONReaderScanner, "ch", '+');
        setField(jSONReaderScanner, "pos", 0);
        setField(jSONReaderScanner, "token", 13);
        setField(jSONReaderScanner, "bufLength", 9);
        char[] charArray = new char[9];
        charArray[0] = '+';
        charArray[1] = '+';
        charArray[2] = '+';
        charArray[3] = '+';
        charArray[4] = '+';
        charArray[5] = '+';
        charArray[6] = '+';
        charArray[7] = '+';
        charArray[8] = '@';
        setField(jSONReaderScanner, "buf", charArray);
        setField(defaultJSONParser, "lexer", jSONReaderScanner);
        
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
        Object finalDefaultJSONParserLexerNp = getFieldValue(jSONLexer, "np");
        JSONLexer jSONLexer1 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerBp = getFieldValue(jSONLexer1, "bp");
        JSONLexer jSONLexer2 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerCh = getFieldValue(jSONLexer2, "ch");
        JSONLexer jSONLexer3 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerPos = getFieldValue(jSONLexer3, "pos");
        JSONLexer jSONLexer4 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerToken = getFieldValue(jSONLexer4, "token");
        
        assertEquals(8, finalDefaultJSONParserLexerNp);
        
        assertEquals(8, finalDefaultJSONParserLexerBp);
        
        assertEquals('@', finalDefaultJSONParserLexerCh);
        
        assertEquals(7, finalDefaultJSONParserLexerPos);
        
        assertEquals(2, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseColor20() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONReaderScanner jSONReaderScanner = ((JSONReaderScanner) createInstance("com.alibaba.fastjson.parser.JSONReaderScanner"));
        setField(jSONReaderScanner, "np", 0);
        setField(jSONReaderScanner, "sp", 0);
        setField(jSONReaderScanner, "bp", 7);
        setField(jSONReaderScanner, "ch", '+');
        setField(jSONReaderScanner, "pos", 0);
        setField(jSONReaderScanner, "token", 13);
        setField(jSONReaderScanner, "bufLength", 9);
        char[] charArray = new char[9];
        charArray[0] = '+';
        charArray[1] = '+';
        charArray[2] = '+';
        charArray[3] = '+';
        charArray[4] = '+';
        charArray[5] = '+';
        charArray[6] = '+';
        charArray[7] = '+';
        charArray[8] = '2';
        setField(jSONReaderScanner, "buf", charArray);
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
        }
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerNp = getFieldValue(jSONLexer, "np");
        JSONLexer jSONLexer1 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerSp = getFieldValue(jSONLexer1, "sp");
        JSONLexer jSONLexer2 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerBp = getFieldValue(jSONLexer2, "bp");
        JSONLexer jSONLexer3 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerCh = getFieldValue(jSONLexer3, "ch");
        JSONLexer jSONLexer4 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerPos = getFieldValue(jSONLexer4, "pos");
        JSONLexer jSONLexer5 = defaultJSONParser.lexer;
        Object jSONLexer5LexerBuf = getFieldValue(jSONLexer5, "buf");
        Object finalDefaultJSONParserLexerBuf0 = get(jSONLexer5LexerBuf, 0);
        
        assertEquals(-1, finalDefaultJSONParserLexerNp);
        
        assertEquals(1, finalDefaultJSONParserLexerSp);
        
        assertEquals(1, finalDefaultJSONParserLexerBp);
        
        assertEquals('2', finalDefaultJSONParserLexerCh);
        
        assertEquals(7, finalDefaultJSONParserLexerPos);
        
        assertEquals('2', finalDefaultJSONParserLexerBuf0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testParseColor21() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 1);
        setField(jSONScanner, "ch", '(');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 13);
        setField(jSONScanner, "len", -2147483645);
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
        Object finalDefaultJSONParserLexerPos = getFieldValue(jSONLexer2, "pos");
        JSONLexer jSONLexer3 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerToken = getFieldValue(jSONLexer3, "token");
        
        assertEquals(2, finalDefaultJSONParserLexerBp);
        
        assertEquals('\u001A', finalDefaultJSONParserLexerCh);
        
        assertEquals(1, finalDefaultJSONParserLexerPos);
        
        assertEquals(10, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testParseColor22() throws Throwable  {
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
    public void testParseColor23() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "hasSpecial", false);
        setField(jSONScanner, "np", 0);
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 1);
        setField(jSONScanner, "ch", 'N');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 13);
        setField(jSONScanner, "len", -2147483645);
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
        Object finalDefaultJSONParserLexerSp = getFieldValue(jSONLexer, "sp");
        JSONLexer jSONLexer1 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerBp = getFieldValue(jSONLexer1, "bp");
        JSONLexer jSONLexer2 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerCh = getFieldValue(jSONLexer2, "ch");
        JSONLexer jSONLexer3 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerPos = getFieldValue(jSONLexer3, "pos");
        
        assertEquals(1, finalDefaultJSONParserLexerSp);
        
        assertEquals(2, finalDefaultJSONParserLexerBp);
        
        assertEquals('\u001A', finalDefaultJSONParserLexerCh);
        
        assertEquals(1, finalDefaultJSONParserLexerPos);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseColor24() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "hasSpecial", false);
        setField(jSONScanner, "np", 0);
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 2147483646);
        setField(jSONScanner, "ch", '\"');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 13);
        setField(jSONScanner, "len", Integer.MIN_VALUE);
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
        Object finalDefaultJSONParserLexerBp = getFieldValue(jSONLexer1, "bp");
        JSONLexer jSONLexer2 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerCh = getFieldValue(jSONLexer2, "ch");
        JSONLexer jSONLexer3 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerPos = getFieldValue(jSONLexer3, "pos");
        
        assertEquals(2147483646, finalDefaultJSONParserLexerNp);
        
        assertEquals(Integer.MAX_VALUE, finalDefaultJSONParserLexerBp);
        
        assertEquals('\u001A', finalDefaultJSONParserLexerCh);
        
        assertEquals(2147483646, finalDefaultJSONParserLexerPos);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testParseColor25() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 1);
        setField(jSONScanner, "ch", '{');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 13);
        setField(jSONScanner, "len", -2147483645);
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
        Object finalDefaultJSONParserLexerPos = getFieldValue(jSONLexer2, "pos");
        JSONLexer jSONLexer3 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerToken = getFieldValue(jSONLexer3, "token");
        
        assertEquals(2, finalDefaultJSONParserLexerBp);
        
        assertEquals('\u001A', finalDefaultJSONParserLexerCh);
        
        assertEquals(1, finalDefaultJSONParserLexerPos);
        
        assertEquals(12, finalDefaultJSONParserLexerToken);
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
        JSONReaderScanner jSONReaderScanner = ((JSONReaderScanner) createInstance("com.alibaba.fastjson.parser.JSONReaderScanner"));
        setField(jSONReaderScanner, "sp", 0);
        setField(jSONReaderScanner, "bp", Integer.MAX_VALUE);
        setField(jSONReaderScanner, "ch", '{');
        setField(jSONReaderScanner, "pos", 0);
        setField(jSONReaderScanner, "token", 13);
        setField(jSONReaderScanner, "bufLength", 1);
        char[] charArray = new char[9];
        setField(jSONReaderScanner, "buf", charArray);
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
    public void testParseRectangle3() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONReaderScanner jSONReaderScanner = ((JSONReaderScanner) createInstance("com.alibaba.fastjson.parser.JSONReaderScanner"));
        setField(jSONReaderScanner, "sp", 0);
        setField(jSONReaderScanner, "bp", Integer.MAX_VALUE);
        setField(jSONReaderScanner, "ch", '+');
        setField(jSONReaderScanner, "pos", 0);
        setField(jSONReaderScanner, "token", 13);
        setField(jSONReaderScanner, "bufLength", 1);
        char[] charArray = new char[9];
        setField(jSONReaderScanner, "buf", charArray);
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
    public void testParseRectangle4() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 1);
        setField(jSONScanner, "ch", '/');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 13);
        setField(jSONScanner, "len", -2147483645);
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
        
        assertEquals(2, finalDefaultJSONParserLexerBp);
        
        assertEquals('\u001A', finalDefaultJSONParserLexerCh);
        
        assertEquals(1, finalDefaultJSONParserLexerPos);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseRectangle5() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 1);
        setField(jSONScanner, "ch", 'x');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 13);
        setField(jSONScanner, "len", -2147483645);
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
        
        assertEquals(2, finalDefaultJSONParserLexerBp);
        
        assertEquals('\u001A', finalDefaultJSONParserLexerCh);
        
        assertEquals(1, finalDefaultJSONParserLexerPos);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseRectangle6() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONReaderScanner jSONReaderScanner = ((JSONReaderScanner) createInstance("com.alibaba.fastjson.parser.JSONReaderScanner"));
        setField(jSONReaderScanner, "sp", 0);
        setField(jSONReaderScanner, "bp", Integer.MAX_VALUE);
        setField(jSONReaderScanner, "ch", '\b');
        setField(jSONReaderScanner, "pos", 0);
        setField(jSONReaderScanner, "token", 13);
        setField(jSONReaderScanner, "bufLength", 1);
        char[] charArray = new char[9];
        setField(jSONReaderScanner, "buf", charArray);
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
    public void testParseRectangle7() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONReaderScanner jSONReaderScanner = ((JSONReaderScanner) createInstance("com.alibaba.fastjson.parser.JSONReaderScanner"));
        setField(jSONReaderScanner, "np", 0);
        setField(jSONReaderScanner, "sp", 0);
        setField(jSONReaderScanner, "bp", 1);
        setField(jSONReaderScanner, "ch", '{');
        setField(jSONReaderScanner, "pos", 0);
        setField(jSONReaderScanner, "token", 13);
        setField(jSONReaderScanner, "bufLength", -2147483645);
        char[] charArray = new char[0];
        setField(jSONReaderScanner, "buf", charArray);
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
        }
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerNp = getFieldValue(jSONLexer, "np");
        JSONLexer jSONLexer1 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerBp = getFieldValue(jSONLexer1, "bp");
        JSONLexer jSONLexer2 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerPos = getFieldValue(jSONLexer2, "pos");
        JSONLexer jSONLexer3 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerBuf = getFieldValue(jSONLexer3, "buf");
        
        assertEquals(-1, finalDefaultJSONParserLexerNp);
        
        assertEquals(0, finalDefaultJSONParserLexerBp);
        
        assertEquals(1, finalDefaultJSONParserLexerPos);
        
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseRectangle8() throws Throwable  {
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
        
        assertEquals(1, finalDefaultJSONParserLexerBp);
        
        assertEquals('\u001A', finalDefaultJSONParserLexerCh);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseRectangle9() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", -1);
        setField(jSONScanner, "ch", 'n');
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
        JSONLexer jSONLexer2 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerPos = getFieldValue(jSONLexer2, "pos");
        
        assertEquals(0, finalDefaultJSONParserLexerBp);
        
        assertEquals('\u001A', finalDefaultJSONParserLexerCh);
        
        assertEquals(-1, finalDefaultJSONParserLexerPos);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testParseRectangle10() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 1);
        setField(jSONScanner, "ch", ';');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 13);
        setField(jSONScanner, "len", -2147483645);
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
        Object finalDefaultJSONParserLexerPos = getFieldValue(jSONLexer2, "pos");
        JSONLexer jSONLexer3 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerToken = getFieldValue(jSONLexer3, "token");
        
        assertEquals(2, finalDefaultJSONParserLexerBp);
        
        assertEquals('\u001A', finalDefaultJSONParserLexerCh);
        
        assertEquals(1, finalDefaultJSONParserLexerPos);
        
        assertEquals(24, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testParseRectangle11() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONReaderScanner jSONReaderScanner = ((JSONReaderScanner) createInstance("com.alibaba.fastjson.parser.JSONReaderScanner"));
        setField(jSONReaderScanner, "np", 0);
        setField(jSONReaderScanner, "sp", 0);
        setField(jSONReaderScanner, "bp", 7);
        setField(jSONReaderScanner, "ch", '+');
        setField(jSONReaderScanner, "pos", 0);
        setField(jSONReaderScanner, "token", 13);
        setField(jSONReaderScanner, "bufLength", 9);
        char[] charArray = new char[9];
        setField(jSONReaderScanner, "buf", charArray);
        setField(defaultJSONParser, "lexer", jSONReaderScanner);
        
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
        Object finalDefaultJSONParserLexerNp = getFieldValue(jSONLexer, "np");
        JSONLexer jSONLexer1 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerBp = getFieldValue(jSONLexer1, "bp");
        JSONLexer jSONLexer2 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerCh = getFieldValue(jSONLexer2, "ch");
        JSONLexer jSONLexer3 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerPos = getFieldValue(jSONLexer3, "pos");
        JSONLexer jSONLexer4 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerToken = getFieldValue(jSONLexer4, "token");
        
        assertEquals(8, finalDefaultJSONParserLexerNp);
        
        assertEquals(8, finalDefaultJSONParserLexerBp);
        
        assertEquals('\u0000', finalDefaultJSONParserLexerCh);
        
        assertEquals(7, finalDefaultJSONParserLexerPos);
        
        assertEquals(2, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseRectangle12() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONReaderScanner jSONReaderScanner = ((JSONReaderScanner) createInstance("com.alibaba.fastjson.parser.JSONReaderScanner"));
        setField(jSONReaderScanner, "np", 0);
        setField(jSONReaderScanner, "sp", 0);
        setField(jSONReaderScanner, "bp", 7);
        setField(jSONReaderScanner, "ch", '+');
        setField(jSONReaderScanner, "pos", 0);
        setField(jSONReaderScanner, "token", 13);
        setField(jSONReaderScanner, "bufLength", 9);
        char[] charArray = new char[9];
        charArray[0] = '+';
        charArray[1] = '+';
        charArray[2] = '+';
        charArray[3] = '+';
        charArray[4] = '+';
        charArray[5] = '+';
        charArray[6] = '+';
        charArray[7] = '+';
        charArray[8] = 'E';
        setField(jSONReaderScanner, "buf", charArray);
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
        }
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerNp = getFieldValue(jSONLexer, "np");
        JSONLexer jSONLexer1 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerSp = getFieldValue(jSONLexer1, "sp");
        JSONLexer jSONLexer2 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerBp = getFieldValue(jSONLexer2, "bp");
        JSONLexer jSONLexer3 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerCh = getFieldValue(jSONLexer3, "ch");
        JSONLexer jSONLexer4 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerPos = getFieldValue(jSONLexer4, "pos");
        JSONLexer jSONLexer5 = defaultJSONParser.lexer;
        Object jSONLexer5LexerBuf = getFieldValue(jSONLexer5, "buf");
        Object finalDefaultJSONParserLexerBuf0 = get(jSONLexer5LexerBuf, 0);
        
        assertEquals(-1, finalDefaultJSONParserLexerNp);
        
        assertEquals(1, finalDefaultJSONParserLexerSp);
        
        assertEquals(1, finalDefaultJSONParserLexerBp);
        
        assertEquals('E', finalDefaultJSONParserLexerCh);
        
        assertEquals(7, finalDefaultJSONParserLexerPos);
        
        assertEquals('E', finalDefaultJSONParserLexerBuf0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseRectangle13() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '\n');
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
    public void testParseRectangle14() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", -1);
        setField(jSONScanner, "ch", '}');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 13);
        setField(jSONScanner, "len", 1);
        String string = new String("\u0000");
        setField(jSONScanner, "text", string);
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
        Object finalDefaultJSONParserLexerPos = getFieldValue(jSONLexer2, "pos");
        
        assertEquals(0, finalDefaultJSONParserLexerBp);
        
        assertEquals('\u0000', finalDefaultJSONParserLexerCh);
        
        assertEquals(-1, finalDefaultJSONParserLexerPos);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseRectangle15() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONReaderScanner jSONReaderScanner = ((JSONReaderScanner) createInstance("com.alibaba.fastjson.parser.JSONReaderScanner"));
        setField(jSONReaderScanner, "hasSpecial", false);
        setField(jSONReaderScanner, "np", 0);
        setField(jSONReaderScanner, "sp", 0);
        setField(jSONReaderScanner, "bp", 0);
        setField(jSONReaderScanner, "ch", 'u');
        setField(jSONReaderScanner, "pos", 0);
        setField(jSONReaderScanner, "token", 13);
        setField(jSONReaderScanner, "bufLength", -1);
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
        }
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerNp = getFieldValue(jSONLexer, "np");
        JSONLexer jSONLexer1 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerSp = getFieldValue(jSONLexer1, "sp");
        JSONLexer jSONLexer2 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerBp = getFieldValue(jSONLexer2, "bp");
        
        assertEquals(-1, finalDefaultJSONParserLexerNp);
        
        assertEquals(32767, finalDefaultJSONParserLexerSp);
        
        assertEquals(32767, finalDefaultJSONParserLexerBp);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseRectangle16() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "hasSpecial", false);
        setField(jSONScanner, "np", 0);
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 1);
        setField(jSONScanner, "ch", 'S');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 13);
        setField(jSONScanner, "len", -2147483645);
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
        Object finalDefaultJSONParserLexerSp = getFieldValue(jSONLexer, "sp");
        JSONLexer jSONLexer1 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerBp = getFieldValue(jSONLexer1, "bp");
        JSONLexer jSONLexer2 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerCh = getFieldValue(jSONLexer2, "ch");
        JSONLexer jSONLexer3 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerPos = getFieldValue(jSONLexer3, "pos");
        
        assertEquals(1, finalDefaultJSONParserLexerSp);
        
        assertEquals(2, finalDefaultJSONParserLexerBp);
        
        assertEquals('\u001A', finalDefaultJSONParserLexerCh);
        
        assertEquals(1, finalDefaultJSONParserLexerPos);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testParseRectangle17() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONReaderScanner jSONReaderScanner = ((JSONReaderScanner) createInstance("com.alibaba.fastjson.parser.JSONReaderScanner"));
        setField(jSONReaderScanner, "sp", 0);
        setField(jSONReaderScanner, "eofPos", 0);
        setField(jSONReaderScanner, "bp", 0);
        setField(jSONReaderScanner, "ch", '<');
        setField(jSONReaderScanner, "pos", 0);
        setField(jSONReaderScanner, "token", 13);
        setField(jSONReaderScanner, "bufLength", 0);
        char[] charArray = new char[0];
        setField(jSONReaderScanner, "buf", charArray);
        setField(defaultJSONParser, "lexer", jSONReaderScanner);
        
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
        Object finalDefaultJSONParserLexerToken = getFieldValue(jSONLexer, "token");
        
        assertEquals(20, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testParseRectangle18() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "eofPos", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '\u0000');
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
        Object finalDefaultJSONParserLexerToken = getFieldValue(jSONLexer, "token");
        
        assertEquals(20, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseRectangle19() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONReaderScanner jSONReaderScanner = ((JSONReaderScanner) createInstance("com.alibaba.fastjson.parser.JSONReaderScanner"));
        setField(jSONReaderScanner, "np", 0);
        setField(jSONReaderScanner, "sp", 0);
        setField(jSONReaderScanner, "bp", 7);
        setField(jSONReaderScanner, "ch", '+');
        setField(jSONReaderScanner, "pos", 0);
        setField(jSONReaderScanner, "token", 13);
        setField(jSONReaderScanner, "bufLength", 9);
        char[] charArray = new char[9];
        charArray[0] = '+';
        charArray[1] = '+';
        charArray[2] = '+';
        charArray[3] = '+';
        charArray[4] = '+';
        charArray[5] = '+';
        charArray[6] = '+';
        charArray[7] = '+';
        charArray[8] = '-';
        setField(jSONReaderScanner, "buf", charArray);
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
        }
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerNp = getFieldValue(jSONLexer, "np");
        JSONLexer jSONLexer1 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerSp = getFieldValue(jSONLexer1, "sp");
        JSONLexer jSONLexer2 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerBp = getFieldValue(jSONLexer2, "bp");
        JSONLexer jSONLexer3 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerCh = getFieldValue(jSONLexer3, "ch");
        JSONLexer jSONLexer4 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerPos = getFieldValue(jSONLexer4, "pos");
        JSONLexer jSONLexer5 = defaultJSONParser.lexer;
        Object jSONLexer5LexerBuf = getFieldValue(jSONLexer5, "buf");
        Object finalDefaultJSONParserLexerBuf0 = get(jSONLexer5LexerBuf, 0);
        
        assertEquals(-1, finalDefaultJSONParserLexerNp);
        
        assertEquals(1, finalDefaultJSONParserLexerSp);
        
        assertEquals(1, finalDefaultJSONParserLexerBp);
        
        assertEquals('-', finalDefaultJSONParserLexerCh);
        
        assertEquals(7, finalDefaultJSONParserLexerPos);
        
        assertEquals('-', finalDefaultJSONParserLexerBuf0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testParseRectangle20() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 1);
        setField(jSONScanner, "ch", ']');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 13);
        setField(jSONScanner, "len", -2147483645);
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
        Object finalDefaultJSONParserLexerPos = getFieldValue(jSONLexer2, "pos");
        JSONLexer jSONLexer3 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerToken = getFieldValue(jSONLexer3, "token");
        
        assertEquals(2, finalDefaultJSONParserLexerBp);
        
        assertEquals('\u001A', finalDefaultJSONParserLexerCh);
        
        assertEquals(1, finalDefaultJSONParserLexerPos);
        
        assertEquals(15, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testParseRectangle21() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONReaderScanner jSONReaderScanner = ((JSONReaderScanner) createInstance("com.alibaba.fastjson.parser.JSONReaderScanner"));
        setField(jSONReaderScanner, "sp", 0);
        setField(jSONReaderScanner, "bp", 7);
        setField(jSONReaderScanner, "ch", '{');
        setField(jSONReaderScanner, "pos", 0);
        setField(jSONReaderScanner, "token", 13);
        setField(jSONReaderScanner, "bufLength", 9);
        char[] charArray = new char[9];
        setField(jSONReaderScanner, "buf", charArray);
        setField(defaultJSONParser, "lexer", jSONReaderScanner);
        
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
        Object finalDefaultJSONParserLexerPos = getFieldValue(jSONLexer2, "pos");
        JSONLexer jSONLexer3 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerToken = getFieldValue(jSONLexer3, "token");
        
        assertEquals(8, finalDefaultJSONParserLexerBp);
        
        assertEquals('\u0000', finalDefaultJSONParserLexerCh);
        
        assertEquals(7, finalDefaultJSONParserLexerPos);
        
        assertEquals(12, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseRectangle22() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONReaderScanner jSONReaderScanner = ((JSONReaderScanner) createInstance("com.alibaba.fastjson.parser.JSONReaderScanner"));
        setField(jSONReaderScanner, "np", 0);
        setField(jSONReaderScanner, "sp", 0);
        setField(jSONReaderScanner, "bp", 0);
        setField(jSONReaderScanner, "ch", '(');
        setField(jSONReaderScanner, "pos", 0);
        setField(jSONReaderScanner, "token", 13);
        setField(jSONReaderScanner, "bufLength", 0);
        setField(jSONReaderScanner, "buf", null);
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
        }
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerNp = getFieldValue(jSONLexer, "np");
        
        assertEquals(-1, finalDefaultJSONParserLexerNp);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseRectangle23() throws Throwable  {
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
    
    @Test(timeout = 10000)
    public void testParseRectangle24() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 1);
        setField(jSONScanner, "ch", ')');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 13);
        setField(jSONScanner, "len", -2147483645);
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
        Object finalDefaultJSONParserLexerPos = getFieldValue(jSONLexer2, "pos");
        JSONLexer jSONLexer3 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerToken = getFieldValue(jSONLexer3, "token");
        
        assertEquals(2, finalDefaultJSONParserLexerBp);
        
        assertEquals('\u001A', finalDefaultJSONParserLexerCh);
        
        assertEquals(1, finalDefaultJSONParserLexerPos);
        
        assertEquals(11, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testParseRectangle25() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", -1);
        setField(jSONScanner, "ch", '.');
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
        Object finalDefaultJSONParserLexerBp = getFieldValue(jSONLexer, "bp");
        JSONLexer jSONLexer1 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerCh = getFieldValue(jSONLexer1, "ch");
        JSONLexer jSONLexer2 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerPos = getFieldValue(jSONLexer2, "pos");
        JSONLexer jSONLexer3 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerToken = getFieldValue(jSONLexer3, "token");
        
        assertEquals(0, finalDefaultJSONParserLexerBp);
        
        assertEquals('\u001A', finalDefaultJSONParserLexerCh);
        
        assertEquals(-1, finalDefaultJSONParserLexerPos);
        
        assertEquals(25, finalDefaultJSONParserLexerToken);
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
    public void testParsePoint3() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '.');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 13);
        setField(jSONScanner, "len", 2);
        String string = new String("");
        setField(jSONScanner, "text", string);
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
        
        assertEquals(1, finalDefaultJSONParserLexerBp);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParsePoint4() throws Throwable  {
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
    public void testParsePoint5() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "eofPos", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '@');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 13);
        setField(jSONScanner, "len", 0);
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
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParsePoint6() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '\n');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 13);
        setField(jSONScanner, "len", 2);
        String string = new String("");
        setField(jSONScanner, "text", string);
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
        
        assertEquals(1, finalDefaultJSONParserLexerBp);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParsePoint7() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", Integer.MAX_VALUE);
        setField(jSONScanner, "ch", '+');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 13);
        setField(jSONScanner, "len", 1);
        String string = new String("");
        setField(jSONScanner, "text", string);
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
        Object finalDefaultJSONParserLexerPos = getFieldValue(jSONLexer1, "pos");
        
        assertEquals(Integer.MIN_VALUE, finalDefaultJSONParserLexerBp);
        
        assertEquals(Integer.MAX_VALUE, finalDefaultJSONParserLexerPos);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParsePoint8() throws Throwable  {
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
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParsePoint9() throws Throwable  {
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
        setField(jSONScanner, "len", 0);
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
    public void testParsePoint10() throws Throwable  {
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
    public void testParsePoint11() throws Throwable  {
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
        Object finalDefaultJSONParserLexerNp = getFieldValue(jSONLexer, "np");
        
        assertEquals(-1, finalDefaultJSONParserLexerNp);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParsePoint12() throws Throwable  {
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
        Object finalDefaultJSONParserLexerPos = getFieldValue(jSONLexer1, "pos");
        
        assertEquals(Integer.MIN_VALUE, finalDefaultJSONParserLexerBp);
        
        assertEquals(Integer.MAX_VALUE, finalDefaultJSONParserLexerPos);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testParsePoint13() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '[');
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
        
        assertEquals(14, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParsePoint14() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", 'x');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 13);
        setField(jSONScanner, "len", 2);
        String string = new String("");
        setField(jSONScanner, "text", string);
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
        
        assertEquals(1, finalDefaultJSONParserLexerBp);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testParsePoint15() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", Integer.MAX_VALUE);
        setField(jSONScanner, "ch", ':');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 13);
        setField(jSONScanner, "len", Integer.MIN_VALUE);
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
        Object finalDefaultJSONParserLexerPos = getFieldValue(jSONLexer2, "pos");
        JSONLexer jSONLexer3 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerToken = getFieldValue(jSONLexer3, "token");
        
        assertEquals(Integer.MIN_VALUE, finalDefaultJSONParserLexerBp);
        
        assertEquals('\u001A', finalDefaultJSONParserLexerCh);
        
        assertEquals(Integer.MAX_VALUE, finalDefaultJSONParserLexerPos);
        
        assertEquals(17, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testParsePoint16() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 1);
        setField(jSONScanner, "ch", '<');
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
        Object finalDefaultJSONParserLexerPos = getFieldValue(jSONLexer2, "pos");
        JSONLexer jSONLexer3 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerToken = getFieldValue(jSONLexer3, "token");
        
        assertEquals(2, finalDefaultJSONParserLexerBp);
        
        assertEquals('\u001A', finalDefaultJSONParserLexerCh);
        
        assertEquals(1, finalDefaultJSONParserLexerPos);
        
        assertEquals(1, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testParsePoint17() throws Throwable  {
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
        
        assertEquals(1, finalDefaultJSONParserLexerBp);
        
        assertEquals('\u001A', finalDefaultJSONParserLexerCh);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParsePoint18() throws Throwable  {
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
        Object finalDefaultJSONParserLexerPos = getFieldValue(jSONLexer1, "pos");
        
        assertEquals(Integer.MIN_VALUE, finalDefaultJSONParserLexerBp);
        
        assertEquals(Integer.MAX_VALUE, finalDefaultJSONParserLexerPos);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParsePoint19() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", 'x');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 13);
        setField(jSONScanner, "len", 0);
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
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParsePoint20() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", ';');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 13);
        setField(jSONScanner, "len", 2);
        String string = new String("");
        setField(jSONScanner, "text", string);
        setField(defaultJSONParser, "lexer", jSONScanner);
        java.lang.Object[] ofIntArray = createArray("java.util.stream.ForEachOps$ForEachOp$OfInt", 0);
        
        Class awtCodecClazz = Class.forName("com.alibaba.fastjson.serializer.AwtCodec");
        Class defaultJSONParserType = Class.forName("com.alibaba.fastjson.parser.DefaultJSONParser");
        Class ofIntArrayType = Class.forName("java.lang.Object");
        Method parsePointMethod = awtCodecClazz.getDeclaredMethod("parsePoint", defaultJSONParserType, ofIntArrayType);
        parsePointMethod.setAccessible(true);
        java.lang.Object[] parsePointMethodArguments = new java.lang.Object[2];
        parsePointMethodArguments[0] = defaultJSONParser;
        parsePointMethodArguments[1] = ((Object) ofIntArray);
        try {
            parsePointMethod.invoke(awtCodec, parsePointMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerBp = getFieldValue(jSONLexer, "bp");
        
        assertEquals(1, finalDefaultJSONParserLexerBp);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParsePoint21() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONReaderScanner jSONReaderScanner = ((JSONReaderScanner) createInstance("com.alibaba.fastjson.parser.JSONReaderScanner"));
        setField(jSONReaderScanner, "sp", 0);
        setField(jSONReaderScanner, "bp", 0);
        setField(jSONReaderScanner, "ch", '\r');
        setField(jSONReaderScanner, "pos", 0);
        setField(jSONReaderScanner, "token", 13);
        setField(jSONReaderScanner, "bufLength", -1);
        setField(defaultJSONParser, "lexer", jSONReaderScanner);
        
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
        Object finalDefaultJSONParserLexerPos = getFieldValue(jSONLexer1, "pos");
        
        assertEquals(21399, finalDefaultJSONParserLexerBp);
        
        assertEquals(21399, finalDefaultJSONParserLexerPos);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParsePoint22() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '\b');
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
        JSONLexer jSONLexer2 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerPos = getFieldValue(jSONLexer2, "pos");
        
        assertEquals(14170, finalDefaultJSONParserLexerBp);
        
        assertEquals('\u001A', finalDefaultJSONParserLexerCh);
        
        assertEquals(14170, finalDefaultJSONParserLexerPos);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testParsePoint23() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "np", 0);
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
        setField(jSONScanner, "ch", '\u0000');
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
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseRef4() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", -1);
        setField(jSONScanner, "ch", ':');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "len", 1);
        String string = new String("@");
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
        JSONLexer jSONLexer1 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerCh = getFieldValue(jSONLexer1, "ch");
        
        assertEquals(0, finalDefaultJSONParserLexerBp);
        
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
        setField(jSONScanner, "bp", -1);
        setField(jSONScanner, "ch", ':');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "len", 1);
        String string = new String(",");
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
        JSONLexer jSONLexer1 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerCh = getFieldValue(jSONLexer1, "ch");
        
        assertEquals(0, finalDefaultJSONParserLexerBp);
        
        assertEquals('\u001A', finalDefaultJSONParserLexerCh);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseRef6() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", -1);
        setField(jSONScanner, "ch", ':');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "len", 1);
        String string = new String("\u0000");
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
        JSONLexer jSONLexer1 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerCh = getFieldValue(jSONLexer1, "ch");
        
        assertEquals(0, finalDefaultJSONParserLexerBp);
        
        assertEquals('\u001A', finalDefaultJSONParserLexerCh);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseRef7() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "np", 0);
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", -1);
        setField(jSONScanner, "ch", ':');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "len", 1);
        String string = new String("-");
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
    public void testParseRef8() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "ch", '\t');
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
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseRef9() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONReaderScanner jSONReaderScanner = ((JSONReaderScanner) createInstance("com.alibaba.fastjson.parser.JSONReaderScanner"));
        setField(jSONReaderScanner, "sp", 0);
        setField(jSONReaderScanner, "bp", 0);
        setField(jSONReaderScanner, "ch", '\r');
        setField(jSONReaderScanner, "bufLength", -1);
        setField(defaultJSONParser, "lexer", jSONReaderScanner);
        
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
        
        assertEquals(27594, finalDefaultJSONParserLexerBp);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseRef10() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONReaderScanner jSONReaderScanner = ((JSONReaderScanner) createInstance("com.alibaba.fastjson.parser.JSONReaderScanner"));
        setField(jSONReaderScanner, "np", 0);
        setField(jSONReaderScanner, "sp", 0);
        setField(jSONReaderScanner, "bp", 1);
        setField(jSONReaderScanner, "ch", ' ');
        setField(jSONReaderScanner, "bufLength", -2147483645);
        char[] charArray = new char[0];
        setField(jSONReaderScanner, "buf", charArray);
        setField(defaultJSONParser, "lexer", jSONReaderScanner);
        
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
    public void testParseRef11() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", -1);
        setField(jSONScanner, "ch", ':');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "len", 1);
        String string = new String("/");
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
        JSONLexer jSONLexer1 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerCh = getFieldValue(jSONLexer1, "ch");
        
        assertEquals(1, finalDefaultJSONParserLexerBp);
        
        assertEquals('\u001A', finalDefaultJSONParserLexerCh);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseRef12() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONReaderScanner jSONReaderScanner = ((JSONReaderScanner) createInstance("com.alibaba.fastjson.parser.JSONReaderScanner"));
        setField(jSONReaderScanner, "sp", 0);
        setField(jSONReaderScanner, "bp", Integer.MAX_VALUE);
        setField(jSONReaderScanner, "ch", '\r');
        setField(jSONReaderScanner, "bufLength", 1);
        char[] charArray = new char[9];
        setField(jSONReaderScanner, "buf", charArray);
        setField(defaultJSONParser, "lexer", jSONReaderScanner);
        
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
    public void testParseRef13() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "hasSpecial", false);
        setField(jSONScanner, "np", 0);
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", -1);
        setField(jSONScanner, "ch", ':');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "len", 1);
        String string = new String("\"");
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
        JSONLexer jSONLexer1 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerCh = getFieldValue(jSONLexer1, "ch");
        
        assertEquals(1, finalDefaultJSONParserLexerBp);
        
        assertEquals('\u001A', finalDefaultJSONParserLexerCh);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseRef14() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", -1);
        setField(jSONScanner, "ch", ':');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "len", 1);
        String string = new String("+");
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
        JSONLexer jSONLexer1 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerCh = getFieldValue(jSONLexer1, "ch");
        
        assertEquals(1, finalDefaultJSONParserLexerBp);
        
        assertEquals('\u001A', finalDefaultJSONParserLexerCh);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseRef15() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", -1);
        setField(jSONScanner, "ch", ':');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "len", 1);
        String string = new String(".");
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
        JSONLexer jSONLexer1 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerCh = getFieldValue(jSONLexer1, "ch");
        
        assertEquals(0, finalDefaultJSONParserLexerBp);
        
        assertEquals('\u001A', finalDefaultJSONParserLexerCh);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseRef16() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", -1);
        setField(jSONScanner, "ch", ':');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "len", 1);
        String string = new String("\n");
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
        JSONLexer jSONLexer1 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerCh = getFieldValue(jSONLexer1, "ch");
        
        assertEquals(0, finalDefaultJSONParserLexerBp);
        
        assertEquals('\u001A', finalDefaultJSONParserLexerCh);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseRef17() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", -1);
        setField(jSONScanner, "ch", '\r');
        setField(jSONScanner, "len", 1);
        String string = new String("\u0000");
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
        JSONLexer jSONLexer1 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerCh = getFieldValue(jSONLexer1, "ch");
        
        assertEquals(0, finalDefaultJSONParserLexerBp);
        
        assertEquals('\u0000', finalDefaultJSONParserLexerCh);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testWriteClassName1() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        
        Class awtCodecClazz = Class.forName("com.alibaba.fastjson.serializer.AwtCodec");
        Class serializeWriterType = Class.forName("com.alibaba.fastjson.serializer.SerializeWriter");
        Class classType = Class.forName("java.lang.Class");
        Class charType = char.class;
        Method writeClassNameMethod = awtCodecClazz.getDeclaredMethod("writeClassName", serializeWriterType, classType, charType);
        writeClassNameMethod.setAccessible(true);
        java.lang.Object[] writeClassNameMethodArguments = new java.lang.Object[3];
        writeClassNameMethodArguments[0] = null;
        writeClassNameMethodArguments[1] = null;
        writeClassNameMethodArguments[2] = '\u0000';
        try {
            writeClassNameMethod.invoke(awtCodec, writeClassNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testWriteClassName2() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        SerializeWriter serializeWriter = ((SerializeWriter) createInstance("com.alibaba.fastjson.serializer.SerializeWriter"));
        serializeWriter.features = 0;
        
        Class awtCodecClazz = Class.forName("com.alibaba.fastjson.serializer.AwtCodec");
        Class serializeWriterType = Class.forName("com.alibaba.fastjson.serializer.SerializeWriter");
        Class classType = Class.forName("java.lang.Class");
        Class charType = char.class;
        Method writeClassNameMethod = awtCodecClazz.getDeclaredMethod("writeClassName", serializeWriterType, classType, charType);
        writeClassNameMethod.setAccessible(true);
        java.lang.Object[] writeClassNameMethodArguments = new java.lang.Object[3];
        writeClassNameMethodArguments[0] = serializeWriter;
        writeClassNameMethodArguments[1] = null;
        writeClassNameMethodArguments[2] = '\u0000';
        char actual = ((char) writeClassNameMethod.invoke(awtCodec, writeClassNameMethodArguments));
        
        assertEquals('\u0000', actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testWriteClassName3() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        SerializeWriter serializeWriter = ((SerializeWriter) createInstance("com.alibaba.fastjson.serializer.SerializeWriter"));
        serializeWriter.features = 16384;
        serializeWriter.count = -258;
        char[] charArray = new char[10];
        serializeWriter.buf = charArray;
        
        Class awtCodecClazz = Class.forName("com.alibaba.fastjson.serializer.AwtCodec");
        Class serializeWriterType = Class.forName("com.alibaba.fastjson.serializer.SerializeWriter");
        Class classType = Class.forName("java.lang.Class");
        Class charType = char.class;
        Method writeClassNameMethod = awtCodecClazz.getDeclaredMethod("writeClassName", serializeWriterType, classType, charType);
        writeClassNameMethod.setAccessible(true);
        java.lang.Object[] writeClassNameMethodArguments = new java.lang.Object[3];
        writeClassNameMethodArguments[0] = serializeWriter;
        writeClassNameMethodArguments[1] = null;
        writeClassNameMethodArguments[2] = '\u0000';
        try {
            writeClassNameMethod.invoke(awtCodec, writeClassNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testWriteClassName4() throws Throwable  {
        AwtCodec awtCodec = ((AwtCodec) createInstance("com.alibaba.fastjson.serializer.AwtCodec"));
        SerializeWriter serializeWriter = ((SerializeWriter) createInstance("com.alibaba.fastjson.serializer.SerializeWriter"));
        setField(serializeWriter, "lock", null);
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(printWriter, "lock", null);
        FileWriter fileWriter = ((FileWriter) createInstance("java.io.FileWriter"));
        setField(fileWriter, "lock", null);
        setField(printWriter, "out", fileWriter);
        setField(serializeWriter, "writer", printWriter);
        serializeWriter.features = 16384;
        serializeWriter.count = 2147483390;
        char[] charArray = new char[10];
        serializeWriter.buf = charArray;
        
        Object initialSerializeWriterLock = getFieldValue(serializeWriter, "lock");
        Object serializeWriterWriter = getFieldValue(serializeWriter, "writer");
        Object initialSerializeWriterWriterLock = getFieldValue(serializeWriterWriter, "lock");
        Object serializeWriterWriter1 = getFieldValue(serializeWriter, "writer");
        Object serializeWriterWriter1WriterOut = getFieldValue(serializeWriterWriter1, "out");
        Object initialSerializeWriterWriterOutLock = getFieldValue(serializeWriterWriter1WriterOut, "lock");
        
        Class awtCodecClazz = Class.forName("com.alibaba.fastjson.serializer.AwtCodec");
        Class serializeWriterType = Class.forName("com.alibaba.fastjson.serializer.SerializeWriter");
        Class classType = Class.forName("java.lang.Class");
        Class charType = char.class;
        Method writeClassNameMethod = awtCodecClazz.getDeclaredMethod("writeClassName", serializeWriterType, classType, charType);
        writeClassNameMethod.setAccessible(true);
        java.lang.Object[] writeClassNameMethodArguments = new java.lang.Object[3];
        writeClassNameMethodArguments[0] = serializeWriter;
        writeClassNameMethodArguments[1] = null;
        writeClassNameMethodArguments[2] = '\u0000';
        try {
            writeClassNameMethod.invoke(awtCodec, writeClassNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        Object finalSerializeWriterLock = getFieldValue(serializeWriter, "lock");
        Object serializeWriterWriter2 = getFieldValue(serializeWriter, "writer");
        Object finalSerializeWriterWriterLock = getFieldValue(serializeWriterWriter2, "lock");
        Object serializeWriterWriter3 = getFieldValue(serializeWriter, "writer");
        Object serializeWriterWriter3WriterOut = getFieldValue(serializeWriterWriter3, "out");
        Object finalSerializeWriterWriterOutLock = getFieldValue(serializeWriterWriter3WriterOut, "lock");
        
        assertNull(finalSerializeWriterLock);
        
        assertNull(finalSerializeWriterWriterLock);
        
        assertNull(finalSerializeWriterWriterOutLock);
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
