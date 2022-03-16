package com.alibaba.fastjson.serializer;

import org.junit.Test;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.JSONScanner;
import com.alibaba.fastjson.parser.JSONLexer;
import java.lang.reflect.Method;
import com.alibaba.fastjson.parser.DefaultExtJSONParser;
import com.alibaba.fastjson.parser.JSONReaderScanner;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Array;
import sun.misc.Unsafe;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertArrayEquals;

public class CharArrayCodecTest {
    ///region
    
    @Test(timeout = 10000)
    public void testGetFastMatchToken1() throws Throwable  {
        CharArrayCodec charArrayCodec = new CharArrayCodec();
        
        int actual = charArrayCodec.getFastMatchToken();
        
        assertEquals(4, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetFastMatchToken2() throws Throwable  {
        CharArrayCodec charArrayCodec = ((CharArrayCodec) createInstance("com.alibaba.fastjson.serializer.CharArrayCodec"));
        
        int actual = charArrayCodec.getFastMatchToken();
        
        assertEquals(4, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDeserialze1() throws Throwable  {
        CharArrayCodec charArrayCodec = new CharArrayCodec();
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        Object object = new Object();
        
        charArrayCodec.deserialze(defaultJSONParser, null, object);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDeserialze2() throws Throwable  {
        CharArrayCodec charArrayCodec = ((CharArrayCodec) createInstance("com.alibaba.fastjson.serializer.CharArrayCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "hasSpecial", true);
        setField(jSONScanner, "sp", -2147483647);
        setField(jSONScanner, "sbuf", null);
        setField(jSONScanner, "token", 4);
        setField(defaultJSONParser, "lexer", jSONScanner);
        java.lang.Object[] ofRefArray = createArray("java.util.stream.Nodes$ToArrayTask$OfRef", 0);
        
        charArrayCodec.deserialze(defaultJSONParser, null, ofRefArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDeserialze3() throws Throwable  {
        CharArrayCodec charArrayCodec = ((CharArrayCodec) createInstance("com.alibaba.fastjson.serializer.CharArrayCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "hasSpecial", true);
        setField(jSONScanner, "np", 0);
        setField(jSONScanner, "sp", 9);
        char[] charArray = new char[9];
        setField(jSONScanner, "sbuf", charArray);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '\"');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 4);
        setField(jSONScanner, "len", 0);
        setField(defaultJSONParser, "lexer", jSONScanner);
        java.lang.Object[] ofRefArray = createArray("java.util.stream.Nodes$ToArrayTask$OfRef", 0);
        
        charArrayCodec.deserialze(defaultJSONParser, null, ofRefArray);
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerHasSpecial = getFieldValue(jSONLexer, "hasSpecial");
        JSONLexer jSONLexer1 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerSp = getFieldValue(jSONLexer1, "sp");
        JSONLexer jSONLexer2 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerSbuf = getFieldValue(jSONLexer2, "sbuf");
        JSONLexer jSONLexer3 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerBp = getFieldValue(jSONLexer3, "bp");
        JSONLexer jSONLexer4 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerCh = getFieldValue(jSONLexer4, "ch");
        
        Class assertClazz = Class.forName("org.junit.Assert");
        Class finalDefaultJSONParserLexerHasSpecialType = boolean.class;
        Method assertFalseMethod = assertClazz.getDeclaredMethod("assertFalse", finalDefaultJSONParserLexerHasSpecialType);
        assertFalseMethod.setAccessible(true);
        java.lang.Object[] assertFalseMethodArguments = new java.lang.Object[1];
        assertFalseMethodArguments[0] = finalDefaultJSONParserLexerHasSpecial;
        assertFalseMethod.invoke(null, assertFalseMethodArguments);
        
        assertEquals(14975, finalDefaultJSONParserLexerSp);
        
        assertEquals(14976, finalDefaultJSONParserLexerBp);
        
        assertEquals('\u001A', finalDefaultJSONParserLexerCh);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDeserialze4() throws Throwable  {
        CharArrayCodec charArrayCodec = ((CharArrayCodec) createInstance("com.alibaba.fastjson.serializer.CharArrayCodec"));
        DefaultExtJSONParser defaultExtJSONParser = ((DefaultExtJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultExtJSONParser"));
        JSONReaderScanner jSONReaderScanner = ((JSONReaderScanner) createInstance("com.alibaba.fastjson.parser.JSONReaderScanner"));
        setField(jSONReaderScanner, "token", 0);
        setField(defaultExtJSONParser, "lexer", jSONReaderScanner);
        
        charArrayCodec.deserialze(defaultExtJSONParser, null, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDeserialze5() throws Throwable  {
        CharArrayCodec charArrayCodec = ((CharArrayCodec) createInstance("com.alibaba.fastjson.serializer.CharArrayCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "hasSpecial", true);
        setField(jSONScanner, "sp", 9);
        char[] charArray = new char[9];
        setField(jSONScanner, "sbuf", charArray);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '\n');
        setField(jSONScanner, "token", 4);
        setField(jSONScanner, "len", 0);
        setField(defaultJSONParser, "lexer", jSONScanner);
        java.lang.Object[] ofRefArray = createArray("java.util.stream.Nodes$ToArrayTask$OfRef", 0);
        
        Object actual = charArrayCodec.deserialze(defaultJSONParser, null, ofRefArray);
        
        char[] expected = new char[9];
        assertArrayEquals(expected, ((char[]) actual));
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerSp = getFieldValue(jSONLexer, "sp");
        JSONLexer jSONLexer1 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerBp = getFieldValue(jSONLexer1, "bp");
        JSONLexer jSONLexer2 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerCh = getFieldValue(jSONLexer2, "ch");
        JSONLexer jSONLexer3 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerToken = getFieldValue(jSONLexer3, "token");
        
        assertEquals(0, finalDefaultJSONParserLexerSp);
        
        assertEquals(1, finalDefaultJSONParserLexerBp);
        
        assertEquals('\u001A', finalDefaultJSONParserLexerCh);
        
        assertEquals(20, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDeserialze6() throws Throwable  {
        CharArrayCodec charArrayCodec = ((CharArrayCodec) createInstance("com.alibaba.fastjson.serializer.CharArrayCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "hasSpecial", true);
        setField(jSONScanner, "sp", 9);
        char[] charArray = new char[9];
        setField(jSONScanner, "sbuf", charArray);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '(');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 4);
        setField(jSONScanner, "len", 0);
        setField(defaultJSONParser, "lexer", jSONScanner);
        java.lang.Object[] ofRefArray = createArray("java.util.stream.Nodes$ToArrayTask$OfRef", 0);
        
        Object actual = charArrayCodec.deserialze(defaultJSONParser, null, ofRefArray);
        
        char[] expected = new char[9];
        assertArrayEquals(expected, ((char[]) actual));
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerSp = getFieldValue(jSONLexer, "sp");
        JSONLexer jSONLexer1 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerBp = getFieldValue(jSONLexer1, "bp");
        JSONLexer jSONLexer2 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerCh = getFieldValue(jSONLexer2, "ch");
        JSONLexer jSONLexer3 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerToken = getFieldValue(jSONLexer3, "token");
        
        assertEquals(0, finalDefaultJSONParserLexerSp);
        
        assertEquals(1, finalDefaultJSONParserLexerBp);
        
        assertEquals('\u001A', finalDefaultJSONParserLexerCh);
        
        assertEquals(10, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDeserialze7() throws Throwable  {
        CharArrayCodec charArrayCodec = ((CharArrayCodec) createInstance("com.alibaba.fastjson.serializer.CharArrayCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "hasSpecial", true);
        setField(jSONScanner, "np", 0);
        setField(jSONScanner, "sp", 9);
        char[] charArray = new char[9];
        setField(jSONScanner, "sbuf", charArray);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", 'N');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 4);
        setField(defaultJSONParser, "lexer", jSONScanner);
        java.lang.Object[] ofRefArray = createArray("java.util.stream.Nodes$ToArrayTask$OfRef", 0);
        
        charArrayCodec.deserialze(defaultJSONParser, null, ofRefArray);
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerHasSpecial = getFieldValue(jSONLexer, "hasSpecial");
        JSONLexer jSONLexer1 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerNp = getFieldValue(jSONLexer1, "np");
        JSONLexer jSONLexer2 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerSp = getFieldValue(jSONLexer2, "sp");
        JSONLexer jSONLexer3 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerBp = getFieldValue(jSONLexer3, "bp");
        JSONLexer jSONLexer4 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerCh = getFieldValue(jSONLexer4, "ch");
        
        Class assertClazz = Class.forName("org.junit.Assert");
        Class finalDefaultJSONParserLexerHasSpecialType = boolean.class;
        Method assertFalseMethod = assertClazz.getDeclaredMethod("assertFalse", finalDefaultJSONParserLexerHasSpecialType);
        assertFalseMethod.setAccessible(true);
        java.lang.Object[] assertFalseMethodArguments = new java.lang.Object[1];
        assertFalseMethodArguments[0] = finalDefaultJSONParserLexerHasSpecial;
        assertFalseMethod.invoke(null, assertFalseMethodArguments);
        
        assertEquals(-1, finalDefaultJSONParserLexerNp);
        
        assertEquals(1, finalDefaultJSONParserLexerSp);
        
        assertEquals(1, finalDefaultJSONParserLexerBp);
        
        assertEquals('\u001A', finalDefaultJSONParserLexerCh);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDeserialze8() throws Throwable  {
        CharArrayCodec charArrayCodec = ((CharArrayCodec) createInstance("com.alibaba.fastjson.serializer.CharArrayCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "hasSpecial", true);
        setField(jSONScanner, "sp", 9);
        char[] charArray = new char[9];
        setField(jSONScanner, "sbuf", charArray);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '.');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 4);
        setField(defaultJSONParser, "lexer", jSONScanner);
        java.lang.Object[] ofRefArray = createArray("java.util.stream.Nodes$ToArrayTask$OfRef", 0);
        
        Object actual = charArrayCodec.deserialze(defaultJSONParser, null, ofRefArray);
        
        char[] expected = new char[9];
        assertArrayEquals(expected, ((char[]) actual));
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerSp = getFieldValue(jSONLexer, "sp");
        JSONLexer jSONLexer1 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerBp = getFieldValue(jSONLexer1, "bp");
        JSONLexer jSONLexer2 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerCh = getFieldValue(jSONLexer2, "ch");
        JSONLexer jSONLexer3 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerToken = getFieldValue(jSONLexer3, "token");
        
        assertEquals(0, finalDefaultJSONParserLexerSp);
        
        assertEquals(1, finalDefaultJSONParserLexerBp);
        
        assertEquals('\u001A', finalDefaultJSONParserLexerCh);
        
        assertEquals(25, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDeserialze9() throws Throwable  {
        CharArrayCodec charArrayCodec = ((CharArrayCodec) createInstance("com.alibaba.fastjson.serializer.CharArrayCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "hasSpecial", true);
        setField(jSONScanner, "sp", 0);
        char[] charArray = new char[9];
        setField(jSONScanner, "sbuf", charArray);
        setField(jSONScanner, "bp", Integer.MIN_VALUE);
        setField(jSONScanner, "ch", ']');
        setField(jSONScanner, "token", 4);
        setField(jSONScanner, "len", 0);
        String string = new String("");
        setField(jSONScanner, "text", string);
        setField(defaultJSONParser, "lexer", jSONScanner);
        java.lang.Object[] ofRefArray = createArray("java.util.stream.Nodes$ToArrayTask$OfRef", 0);
        
        charArrayCodec.deserialze(defaultJSONParser, null, ofRefArray);
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerBp = getFieldValue(jSONLexer, "bp");
        JSONLexer jSONLexer1 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerToken = getFieldValue(jSONLexer1, "token");
        
        assertEquals(-2147483647, finalDefaultJSONParserLexerBp);
        
        assertEquals(15, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDeserialze10() throws Throwable  {
        CharArrayCodec charArrayCodec = ((CharArrayCodec) createInstance("com.alibaba.fastjson.serializer.CharArrayCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "hasSpecial", true);
        setField(jSONScanner, "sp", 9);
        char[] charArray = new char[9];
        setField(jSONScanner, "sbuf", charArray);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", ')');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 4);
        setField(defaultJSONParser, "lexer", jSONScanner);
        java.lang.Object[] ofRefArray = createArray("java.util.stream.Nodes$ToArrayTask$OfRef", 0);
        
        Object actual = charArrayCodec.deserialze(defaultJSONParser, null, ofRefArray);
        
        char[] expected = new char[9];
        assertArrayEquals(expected, ((char[]) actual));
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerSp = getFieldValue(jSONLexer, "sp");
        JSONLexer jSONLexer1 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerBp = getFieldValue(jSONLexer1, "bp");
        JSONLexer jSONLexer2 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerCh = getFieldValue(jSONLexer2, "ch");
        JSONLexer jSONLexer3 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerToken = getFieldValue(jSONLexer3, "token");
        
        assertEquals(0, finalDefaultJSONParserLexerSp);
        
        assertEquals(1, finalDefaultJSONParserLexerBp);
        
        assertEquals('\u001A', finalDefaultJSONParserLexerCh);
        
        assertEquals(11, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDeserialze11() throws Throwable  {
        CharArrayCodec charArrayCodec = ((CharArrayCodec) createInstance("com.alibaba.fastjson.serializer.CharArrayCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "hasSpecial", true);
        setField(jSONScanner, "sp", 9);
        char[] charArray = new char[9];
        setField(jSONScanner, "sbuf", charArray);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", 'n');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 4);
        setField(jSONScanner, "len", 0);
        setField(defaultJSONParser, "lexer", jSONScanner);
        java.lang.Object[] ofRefArray = createArray("java.util.stream.Nodes$ToArrayTask$OfRef", 0);
        
        charArrayCodec.deserialze(defaultJSONParser, null, ofRefArray);
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerSp = getFieldValue(jSONLexer, "sp");
        JSONLexer jSONLexer1 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerBp = getFieldValue(jSONLexer1, "bp");
        JSONLexer jSONLexer2 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerCh = getFieldValue(jSONLexer2, "ch");
        
        assertEquals(0, finalDefaultJSONParserLexerSp);
        
        assertEquals(1, finalDefaultJSONParserLexerBp);
        
        assertEquals('\u001A', finalDefaultJSONParserLexerCh);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDeserialze12() throws Throwable  {
        CharArrayCodec charArrayCodec = ((CharArrayCodec) createInstance("com.alibaba.fastjson.serializer.CharArrayCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "np", 0);
        setField(jSONScanner, "sp", 1);
        setField(jSONScanner, "token", 2);
        setField(jSONScanner, "len", 1);
        String string = new String("L");
        setField(jSONScanner, "text", string);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Object actual = charArrayCodec.deserialze(defaultJSONParser, null, null);
        
        char[] expected = new char[1];
        expected[0] = '0';
        assertArrayEquals(expected, ((char[]) actual));
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerSp = getFieldValue(jSONLexer, "sp");
        JSONLexer jSONLexer1 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerToken = getFieldValue(jSONLexer1, "token");
        
        assertEquals(0, finalDefaultJSONParserLexerSp);
        
        assertEquals(20, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDeserialze13() throws Throwable  {
        CharArrayCodec charArrayCodec = ((CharArrayCodec) createInstance("com.alibaba.fastjson.serializer.CharArrayCodec"));
        DefaultExtJSONParser defaultExtJSONParser = ((DefaultExtJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultExtJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "hasSpecial", true);
        setField(jSONScanner, "sp", 9);
        char[] charArray = new char[9];
        setField(jSONScanner, "sbuf", charArray);
        setField(jSONScanner, "bp", Integer.MAX_VALUE);
        setField(jSONScanner, "ch", '/');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 4);
        setField(jSONScanner, "len", 1);
        String string = new String("");
        setField(jSONScanner, "text", string);
        setField(defaultExtJSONParser, "lexer", jSONScanner);
        java.lang.Object[] ofRefArray = createArray("java.util.stream.Nodes$ToArrayTask$OfRef", 0);
        
        charArrayCodec.deserialze(defaultExtJSONParser, null, ofRefArray);
        
        JSONLexer jSONLexer = defaultExtJSONParser.lexer;
        Object finalDefaultExtJSONParserLexerSp = getFieldValue(jSONLexer, "sp");
        JSONLexer jSONLexer1 = defaultExtJSONParser.lexer;
        Object finalDefaultExtJSONParserLexerBp = getFieldValue(jSONLexer1, "bp");
        JSONLexer jSONLexer2 = defaultExtJSONParser.lexer;
        Object finalDefaultExtJSONParserLexerPos = getFieldValue(jSONLexer2, "pos");
        
        assertEquals(0, finalDefaultExtJSONParserLexerSp);
        
        assertEquals(Integer.MIN_VALUE, finalDefaultExtJSONParserLexerBp);
        
        assertEquals(Integer.MAX_VALUE, finalDefaultExtJSONParserLexerPos);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDeserialze14() throws Throwable  {
        CharArrayCodec charArrayCodec = ((CharArrayCodec) createInstance("com.alibaba.fastjson.serializer.CharArrayCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "hasSpecial", true);
        setField(jSONScanner, "sp", 9);
        char[] charArray = new char[9];
        setField(jSONScanner, "sbuf", charArray);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '{');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 4);
        setField(jSONScanner, "len", 0);
        setField(defaultJSONParser, "lexer", jSONScanner);
        java.lang.Object[] ofRefArray = createArray("java.util.stream.Nodes$ToArrayTask$OfRef", 0);
        
        Object actual = charArrayCodec.deserialze(defaultJSONParser, null, ofRefArray);
        
        char[] expected = new char[9];
        assertArrayEquals(expected, ((char[]) actual));
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerSp = getFieldValue(jSONLexer, "sp");
        JSONLexer jSONLexer1 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerBp = getFieldValue(jSONLexer1, "bp");
        JSONLexer jSONLexer2 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerCh = getFieldValue(jSONLexer2, "ch");
        JSONLexer jSONLexer3 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerToken = getFieldValue(jSONLexer3, "token");
        
        assertEquals(0, finalDefaultJSONParserLexerSp);
        
        assertEquals(1, finalDefaultJSONParserLexerBp);
        
        assertEquals('\u001A', finalDefaultJSONParserLexerCh);
        
        assertEquals(12, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDeserialze15() throws Throwable  {
        CharArrayCodec charArrayCodec = ((CharArrayCodec) createInstance("com.alibaba.fastjson.serializer.CharArrayCodec"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "hasSpecial", true);
        setField(jSONScanner, "sp", 9);
        char[] charArray = new char[9];
        setField(jSONScanner, "sbuf", charArray);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '[');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 4);
        setField(jSONScanner, "len", 0);
        setField(defaultJSONParser, "lexer", jSONScanner);
        java.lang.Object[] ofRefArray = createArray("java.util.stream.Nodes$ToArrayTask$OfRef", 0);
        
        Object actual = charArrayCodec.deserialze(defaultJSONParser, null, ofRefArray);
        
        char[] expected = new char[9];
        assertArrayEquals(expected, ((char[]) actual));
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerSp = getFieldValue(jSONLexer, "sp");
        JSONLexer jSONLexer1 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerBp = getFieldValue(jSONLexer1, "bp");
        JSONLexer jSONLexer2 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerCh = getFieldValue(jSONLexer2, "ch");
        JSONLexer jSONLexer3 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerToken = getFieldValue(jSONLexer3, "token");
        
        assertEquals(0, finalDefaultJSONParserLexerSp);
        
        assertEquals(1, finalDefaultJSONParserLexerBp);
        
        assertEquals('\u001A', finalDefaultJSONParserLexerCh);
        
        assertEquals(14, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDeserialze16() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        
        CharArrayCodec.deserialze(defaultJSONParser);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDeserialze17() throws Throwable  {
        CharArrayCodec.deserialze(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDeserialze18() throws Throwable  {
        DefaultExtJSONParser defaultExtJSONParser = ((DefaultExtJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultExtJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "hasSpecial", true);
        setField(jSONScanner, "sp", 2147483646);
        char[] charArray = new char[0];
        setField(jSONScanner, "sbuf", charArray);
        setField(jSONScanner, "token", 4);
        setField(defaultExtJSONParser, "lexer", jSONScanner);
        
        CharArrayCodec.deserialze(defaultExtJSONParser);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDeserialze19() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "hasSpecial", true);
        setField(jSONScanner, "sp", 9);
        char[] charArray = new char[32];
        setField(jSONScanner, "sbuf", charArray);
        setField(jSONScanner, "ch", '\u001A');
        setField(jSONScanner, "token", 4);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Object actual = CharArrayCodec.deserialze(defaultJSONParser);
        
        char[] expected = new char[9];
        assertArrayEquals(expected, ((char[]) actual));
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerSp = getFieldValue(jSONLexer, "sp");
        JSONLexer jSONLexer1 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerToken = getFieldValue(jSONLexer1, "token");
        
        assertEquals(0, finalDefaultJSONParserLexerSp);
        
        assertEquals(20, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDeserialze20() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "hasSpecial", true);
        setField(jSONScanner, "sp", 9);
        char[] charArray = new char[32];
        setField(jSONScanner, "sbuf", charArray);
        setField(jSONScanner, "bp", 1);
        setField(jSONScanner, "ch", '}');
        setField(jSONScanner, "token", 4);
        setField(jSONScanner, "len", -2147483645);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Object actual = CharArrayCodec.deserialze(defaultJSONParser);
        
        char[] expected = new char[9];
        assertArrayEquals(expected, ((char[]) actual));
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerSp = getFieldValue(jSONLexer, "sp");
        JSONLexer jSONLexer1 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerBp = getFieldValue(jSONLexer1, "bp");
        JSONLexer jSONLexer2 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerCh = getFieldValue(jSONLexer2, "ch");
        JSONLexer jSONLexer3 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerToken = getFieldValue(jSONLexer3, "token");
        
        assertEquals(0, finalDefaultJSONParserLexerSp);
        
        assertEquals(2, finalDefaultJSONParserLexerBp);
        
        assertEquals('\u001A', finalDefaultJSONParserLexerCh);
        
        assertEquals(13, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDeserialze21() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "hasSpecial", true);
        setField(jSONScanner, "sp", 9);
        char[] charArray = new char[32];
        setField(jSONScanner, "sbuf", charArray);
        setField(jSONScanner, "bp", 1);
        setField(jSONScanner, "ch", ',');
        setField(jSONScanner, "token", 4);
        setField(jSONScanner, "len", -2147483645);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Object actual = CharArrayCodec.deserialze(defaultJSONParser);
        
        char[] expected = new char[9];
        assertArrayEquals(expected, ((char[]) actual));
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerSp = getFieldValue(jSONLexer, "sp");
        JSONLexer jSONLexer1 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerBp = getFieldValue(jSONLexer1, "bp");
        JSONLexer jSONLexer2 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerCh = getFieldValue(jSONLexer2, "ch");
        JSONLexer jSONLexer3 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerToken = getFieldValue(jSONLexer3, "token");
        
        assertEquals(0, finalDefaultJSONParserLexerSp);
        
        assertEquals(2, finalDefaultJSONParserLexerBp);
        
        assertEquals('\u001A', finalDefaultJSONParserLexerCh);
        
        assertEquals(16, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDeserialze22() throws Throwable  {
        DefaultExtJSONParser defaultExtJSONParser = ((DefaultExtJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultExtJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "hasSpecial", true);
        setField(jSONScanner, "sp", 1);
        char[] charArray = new char[32];
        setField(jSONScanner, "sbuf", charArray);
        setField(jSONScanner, "bp", Integer.MAX_VALUE);
        setField(jSONScanner, "ch", ',');
        setField(jSONScanner, "token", 4);
        setField(jSONScanner, "len", 1);
        String string = new String("");
        setField(jSONScanner, "text", string);
        setField(defaultExtJSONParser, "lexer", jSONScanner);
        
        CharArrayCodec.deserialze(defaultExtJSONParser);
        
        JSONLexer jSONLexer = defaultExtJSONParser.lexer;
        Object finalDefaultExtJSONParserLexerSp = getFieldValue(jSONLexer, "sp");
        JSONLexer jSONLexer1 = defaultExtJSONParser.lexer;
        Object finalDefaultExtJSONParserLexerBp = getFieldValue(jSONLexer1, "bp");
        JSONLexer jSONLexer2 = defaultExtJSONParser.lexer;
        Object finalDefaultExtJSONParserLexerToken = getFieldValue(jSONLexer2, "token");
        
        assertEquals(0, finalDefaultExtJSONParserLexerSp);
        
        assertEquals(Integer.MIN_VALUE, finalDefaultExtJSONParserLexerBp);
        
        assertEquals(16, finalDefaultExtJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDeserialze23() throws Throwable  {
        DefaultExtJSONParser defaultExtJSONParser = ((DefaultExtJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultExtJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "hasSpecial", true);
        setField(jSONScanner, "sp", 1);
        char[] charArray = new char[32];
        setField(jSONScanner, "sbuf", charArray);
        setField(jSONScanner, "bp", Integer.MAX_VALUE);
        setField(jSONScanner, "ch", '\f');
        setField(jSONScanner, "token", 4);
        setField(jSONScanner, "len", 1);
        String string = new String("");
        setField(jSONScanner, "text", string);
        setField(defaultExtJSONParser, "lexer", jSONScanner);
        
        CharArrayCodec.deserialze(defaultExtJSONParser);
        
        JSONLexer jSONLexer = defaultExtJSONParser.lexer;
        Object finalDefaultExtJSONParserLexerSp = getFieldValue(jSONLexer, "sp");
        JSONLexer jSONLexer1 = defaultExtJSONParser.lexer;
        Object finalDefaultExtJSONParserLexerBp = getFieldValue(jSONLexer1, "bp");
        
        assertEquals(0, finalDefaultExtJSONParserLexerSp);
        
        assertEquals(Integer.MIN_VALUE, finalDefaultExtJSONParserLexerBp);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDeserialze24() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "hasSpecial", true);
        setField(jSONScanner, "sp", 9);
        char[] charArray = new char[32];
        setField(jSONScanner, "sbuf", charArray);
        setField(jSONScanner, "bp", 1);
        setField(jSONScanner, "ch", '{');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 4);
        setField(jSONScanner, "len", -2147483645);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Object actual = CharArrayCodec.deserialze(defaultJSONParser);
        
        char[] expected = new char[9];
        assertArrayEquals(expected, ((char[]) actual));
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerSp = getFieldValue(jSONLexer, "sp");
        JSONLexer jSONLexer1 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerBp = getFieldValue(jSONLexer1, "bp");
        JSONLexer jSONLexer2 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerCh = getFieldValue(jSONLexer2, "ch");
        JSONLexer jSONLexer3 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerPos = getFieldValue(jSONLexer3, "pos");
        JSONLexer jSONLexer4 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerToken = getFieldValue(jSONLexer4, "token");
        
        assertEquals(0, finalDefaultJSONParserLexerSp);
        
        assertEquals(2, finalDefaultJSONParserLexerBp);
        
        assertEquals('\u001A', finalDefaultJSONParserLexerCh);
        
        assertEquals(1, finalDefaultJSONParserLexerPos);
        
        assertEquals(12, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDeserialze25() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "hasSpecial", true);
        setField(jSONScanner, "sp", 0);
        char[] charArray = new char[9];
        setField(jSONScanner, "sbuf", charArray);
        setField(jSONScanner, "bp", 1);
        setField(jSONScanner, "ch", ']');
        setField(jSONScanner, "token", 4);
        setField(jSONScanner, "len", -2147483645);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Object actual = CharArrayCodec.deserialze(defaultJSONParser);
        
        char[] expected = new char[0];
        assertArrayEquals(expected, ((char[]) actual));
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerBp = getFieldValue(jSONLexer, "bp");
        JSONLexer jSONLexer1 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerCh = getFieldValue(jSONLexer1, "ch");
        JSONLexer jSONLexer2 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerToken = getFieldValue(jSONLexer2, "token");
        
        assertEquals(2, finalDefaultJSONParserLexerBp);
        
        assertEquals('\u001A', finalDefaultJSONParserLexerCh);
        
        assertEquals(15, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDeserialze26() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "hasSpecial", true);
        setField(jSONScanner, "sp", 9);
        char[] charArray = new char[32];
        setField(jSONScanner, "sbuf", charArray);
        setField(jSONScanner, "bp", 1);
        setField(jSONScanner, "ch", ')');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 4);
        setField(jSONScanner, "len", -2147483645);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Object actual = CharArrayCodec.deserialze(defaultJSONParser);
        
        char[] expected = new char[9];
        assertArrayEquals(expected, ((char[]) actual));
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerSp = getFieldValue(jSONLexer, "sp");
        JSONLexer jSONLexer1 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerBp = getFieldValue(jSONLexer1, "bp");
        JSONLexer jSONLexer2 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerCh = getFieldValue(jSONLexer2, "ch");
        JSONLexer jSONLexer3 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerPos = getFieldValue(jSONLexer3, "pos");
        JSONLexer jSONLexer4 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerToken = getFieldValue(jSONLexer4, "token");
        
        assertEquals(0, finalDefaultJSONParserLexerSp);
        
        assertEquals(2, finalDefaultJSONParserLexerBp);
        
        assertEquals('\u001A', finalDefaultJSONParserLexerCh);
        
        assertEquals(1, finalDefaultJSONParserLexerPos);
        
        assertEquals(11, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDeserialze27() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "hasSpecial", true);
        setField(jSONScanner, "sp", 9);
        char[] charArray = new char[32];
        setField(jSONScanner, "sbuf", charArray);
        setField(jSONScanner, "bp", 1);
        setField(jSONScanner, "ch", '/');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 4);
        setField(jSONScanner, "len", -2147483645);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        CharArrayCodec.deserialze(defaultJSONParser);
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerSp = getFieldValue(jSONLexer, "sp");
        JSONLexer jSONLexer1 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerBp = getFieldValue(jSONLexer1, "bp");
        JSONLexer jSONLexer2 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerCh = getFieldValue(jSONLexer2, "ch");
        JSONLexer jSONLexer3 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerPos = getFieldValue(jSONLexer3, "pos");
        
        assertEquals(0, finalDefaultJSONParserLexerSp);
        
        assertEquals(2, finalDefaultJSONParserLexerBp);
        
        assertEquals('\u001A', finalDefaultJSONParserLexerCh);
        
        assertEquals(1, finalDefaultJSONParserLexerPos);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDeserialze28() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONReaderScanner jSONReaderScanner = ((JSONReaderScanner) createInstance("com.alibaba.fastjson.parser.JSONReaderScanner"));
        setField(jSONReaderScanner, "np", -1);
        setField(jSONReaderScanner, "sp", 0);
        setField(jSONReaderScanner, "token", 2);
        setField(jSONReaderScanner, "bufLength", -1);
        char[] charArray = new char[9];
        setField(jSONReaderScanner, "buf", charArray);
        setField(defaultJSONParser, "lexer", jSONReaderScanner);
        
        CharArrayCodec.deserialze(defaultJSONParser);
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerNp = getFieldValue(jSONLexer, "np");
        
        assertEquals(0, finalDefaultJSONParserLexerNp);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDeserialze29() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "hasSpecial", true);
        setField(jSONScanner, "sp", 9);
        char[] charArray = new char[32];
        setField(jSONScanner, "sbuf", charArray);
        setField(jSONScanner, "bp", Integer.MAX_VALUE);
        setField(jSONScanner, "ch", '[');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 4);
        setField(jSONScanner, "len", 1);
        String string = new String("\u0000");
        setField(jSONScanner, "text", string);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        CharArrayCodec.deserialze(defaultJSONParser);
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerSp = getFieldValue(jSONLexer, "sp");
        JSONLexer jSONLexer1 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerBp = getFieldValue(jSONLexer1, "bp");
        JSONLexer jSONLexer2 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerPos = getFieldValue(jSONLexer2, "pos");
        
        assertEquals(0, finalDefaultJSONParserLexerSp);
        
        assertEquals(Integer.MIN_VALUE, finalDefaultJSONParserLexerBp);
        
        assertEquals(Integer.MAX_VALUE, finalDefaultJSONParserLexerPos);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDeserialze30() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "hasSpecial", true);
        setField(jSONScanner, "sp", 9);
        char[] charArray = new char[32];
        setField(jSONScanner, "sbuf", charArray);
        setField(jSONScanner, "bp", 1);
        setField(jSONScanner, "ch", ';');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 4);
        setField(jSONScanner, "len", -2147483645);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Object actual = CharArrayCodec.deserialze(defaultJSONParser);
        
        char[] expected = new char[9];
        assertArrayEquals(expected, ((char[]) actual));
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerSp = getFieldValue(jSONLexer, "sp");
        JSONLexer jSONLexer1 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerBp = getFieldValue(jSONLexer1, "bp");
        JSONLexer jSONLexer2 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerCh = getFieldValue(jSONLexer2, "ch");
        JSONLexer jSONLexer3 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerPos = getFieldValue(jSONLexer3, "pos");
        JSONLexer jSONLexer4 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerToken = getFieldValue(jSONLexer4, "token");
        
        assertEquals(0, finalDefaultJSONParserLexerSp);
        
        assertEquals(2, finalDefaultJSONParserLexerBp);
        
        assertEquals('\u001A', finalDefaultJSONParserLexerCh);
        
        assertEquals(1, finalDefaultJSONParserLexerPos);
        
        assertEquals(24, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDeserialze31() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONReaderScanner jSONReaderScanner = ((JSONReaderScanner) createInstance("com.alibaba.fastjson.parser.JSONReaderScanner"));
        setField(jSONReaderScanner, "np", -1);
        setField(jSONReaderScanner, "sp", 1073741825);
        setField(jSONReaderScanner, "token", 2);
        setField(jSONReaderScanner, "bufLength", 1073741825);
        char[] charArray = new char[9];
        setField(jSONReaderScanner, "buf", charArray);
        setField(defaultJSONParser, "lexer", jSONReaderScanner);
        
        CharArrayCodec.deserialze(defaultJSONParser);
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerNp = getFieldValue(jSONLexer, "np");
        
        assertEquals(0, finalDefaultJSONParserLexerNp);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDeserialze32() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "hasSpecial", true);
        setField(jSONScanner, "sp", 9);
        char[] charArray = new char[32];
        setField(jSONScanner, "sbuf", charArray);
        setField(jSONScanner, "bp", 31);
        setField(jSONScanner, "ch", '\r');
        setField(jSONScanner, "token", 4);
        setField(jSONScanner, "len", 33);
        String string = new String("]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]");
        setField(jSONScanner, "text", string);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Object actual = CharArrayCodec.deserialze(defaultJSONParser);
        
        char[] expected = new char[9];
        assertArrayEquals(expected, ((char[]) actual));
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerSp = getFieldValue(jSONLexer, "sp");
        JSONLexer jSONLexer1 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerBp = getFieldValue(jSONLexer1, "bp");
        JSONLexer jSONLexer2 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerCh = getFieldValue(jSONLexer2, "ch");
        JSONLexer jSONLexer3 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerToken = getFieldValue(jSONLexer3, "token");
        
        assertEquals(0, finalDefaultJSONParserLexerSp);
        
        assertEquals(33, finalDefaultJSONParserLexerBp);
        
        assertEquals('\u001A', finalDefaultJSONParserLexerCh);
        
        assertEquals(15, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDeserialze33() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONReaderScanner jSONReaderScanner = ((JSONReaderScanner) createInstance("com.alibaba.fastjson.parser.JSONReaderScanner"));
        setField(jSONReaderScanner, "np", -1);
        setField(jSONReaderScanner, "sp", 1073741856);
        setField(jSONReaderScanner, "bp", 0);
        setField(jSONReaderScanner, "token", 2);
        setField(jSONReaderScanner, "bufLength", 62);
        char[] charArray = new char[6];
        setField(jSONReaderScanner, "buf", charArray);
        setField(defaultJSONParser, "lexer", jSONReaderScanner);
        
        CharArrayCodec.deserialze(defaultJSONParser);
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerNp = getFieldValue(jSONLexer, "np");
        
        assertEquals(0, finalDefaultJSONParserLexerNp);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDeserialze34() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "hasSpecial", true);
        setField(jSONScanner, "np", 0);
        setField(jSONScanner, "sp", 9);
        char[] charArray = new char[32];
        setField(jSONScanner, "sbuf", charArray);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '+');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 4);
        setField(jSONScanner, "len", 0);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Object actual = CharArrayCodec.deserialze(defaultJSONParser);
        
        char[] expected = new char[9];
        assertArrayEquals(expected, ((char[]) actual));
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerNp = getFieldValue(jSONLexer, "np");
        JSONLexer jSONLexer1 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerSp = getFieldValue(jSONLexer1, "sp");
        JSONLexer jSONLexer2 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerBp = getFieldValue(jSONLexer2, "bp");
        JSONLexer jSONLexer3 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerCh = getFieldValue(jSONLexer3, "ch");
        JSONLexer jSONLexer4 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerToken = getFieldValue(jSONLexer4, "token");
        
        assertEquals(1, finalDefaultJSONParserLexerNp);
        
        assertEquals(0, finalDefaultJSONParserLexerSp);
        
        assertEquals(1, finalDefaultJSONParserLexerBp);
        
        assertEquals('\u001A', finalDefaultJSONParserLexerCh);
        
        assertEquals(2, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDeserialze35() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "hasSpecial", true);
        setField(jSONScanner, "sp", 9);
        char[] charArray = new char[32];
        setField(jSONScanner, "sbuf", charArray);
        setField(jSONScanner, "eofPos", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '@');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 4);
        setField(jSONScanner, "len", 0);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Object actual = CharArrayCodec.deserialze(defaultJSONParser);
        
        char[] expected = new char[9];
        assertArrayEquals(expected, ((char[]) actual));
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerSp = getFieldValue(jSONLexer, "sp");
        JSONLexer jSONLexer1 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerToken = getFieldValue(jSONLexer1, "token");
        
        assertEquals(0, finalDefaultJSONParserLexerSp);
        
        assertEquals(20, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDeserialze36() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "hasSpecial", true);
        setField(jSONScanner, "sp", 9);
        char[] charArray = new char[32];
        setField(jSONScanner, "sbuf", charArray);
        setField(jSONScanner, "bp", -1);
        setField(jSONScanner, "ch", 'n');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 4);
        setField(jSONScanner, "len", 1);
        String string = new String("\u0000");
        setField(jSONScanner, "text", string);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        CharArrayCodec.deserialze(defaultJSONParser);
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerSp = getFieldValue(jSONLexer, "sp");
        JSONLexer jSONLexer1 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerBp = getFieldValue(jSONLexer1, "bp");
        JSONLexer jSONLexer2 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerCh = getFieldValue(jSONLexer2, "ch");
        JSONLexer jSONLexer3 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerPos = getFieldValue(jSONLexer3, "pos");
        
        assertEquals(0, finalDefaultJSONParserLexerSp);
        
        assertEquals(0, finalDefaultJSONParserLexerBp);
        
        assertEquals('\u0000', finalDefaultJSONParserLexerCh);
        
        assertEquals(-1, finalDefaultJSONParserLexerPos);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDeserialze37() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "hasSpecial", true);
        setField(jSONScanner, "sp", 0);
        char[] charArray = new char[9];
        setField(jSONScanner, "sbuf", charArray);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '.');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 4);
        setField(jSONScanner, "len", 0);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Object actual = CharArrayCodec.deserialze(defaultJSONParser);
        
        char[] expected = new char[0];
        assertArrayEquals(expected, ((char[]) actual));
        
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
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDeserialze38() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "hasSpecial", true);
        setField(jSONScanner, "np", 0);
        setField(jSONScanner, "sp", 9);
        char[] charArray = new char[32];
        setField(jSONScanner, "sbuf", charArray);
        setField(jSONScanner, "bp", -1);
        setField(jSONScanner, "ch", 'S');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 4);
        setField(jSONScanner, "len", 1);
        String string = new String("\u0000");
        setField(jSONScanner, "text", string);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        CharArrayCodec.deserialze(defaultJSONParser);
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerHasSpecial = getFieldValue(jSONLexer, "hasSpecial");
        JSONLexer jSONLexer1 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerNp = getFieldValue(jSONLexer1, "np");
        JSONLexer jSONLexer2 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerSp = getFieldValue(jSONLexer2, "sp");
        JSONLexer jSONLexer3 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerBp = getFieldValue(jSONLexer3, "bp");
        JSONLexer jSONLexer4 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerCh = getFieldValue(jSONLexer4, "ch");
        JSONLexer jSONLexer5 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerPos = getFieldValue(jSONLexer5, "pos");
        
        Class assertClazz = Class.forName("org.junit.Assert");
        Class finalDefaultJSONParserLexerHasSpecialType = boolean.class;
        Method assertFalseMethod = assertClazz.getDeclaredMethod("assertFalse", finalDefaultJSONParserLexerHasSpecialType);
        assertFalseMethod.setAccessible(true);
        java.lang.Object[] assertFalseMethodArguments = new java.lang.Object[1];
        assertFalseMethodArguments[0] = finalDefaultJSONParserLexerHasSpecial;
        assertFalseMethod.invoke(null, assertFalseMethodArguments);
        
        assertEquals(-2, finalDefaultJSONParserLexerNp);
        
        assertEquals(1, finalDefaultJSONParserLexerSp);
        
        assertEquals(0, finalDefaultJSONParserLexerBp);
        
        assertEquals('\u0000', finalDefaultJSONParserLexerCh);
        
        assertEquals(-1, finalDefaultJSONParserLexerPos);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDeserialze39() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "hasSpecial", true);
        setField(jSONScanner, "np", 0);
        setField(jSONScanner, "sp", 9);
        char[] charArray = new char[32];
        setField(jSONScanner, "sbuf", charArray);
        setField(jSONScanner, "bp", 31);
        setField(jSONScanner, "ch", '\"');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 4);
        setField(jSONScanner, "len", 33);
        String string = new String("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        setField(jSONScanner, "text", string);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        CharArrayCodec.deserialze(defaultJSONParser);
        
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
        
        assertEquals(31, finalDefaultJSONParserLexerNp);
        
        assertEquals(0, finalDefaultJSONParserLexerSp);
        
        assertEquals(33, finalDefaultJSONParserLexerBp);
        
        assertEquals('\u001A', finalDefaultJSONParserLexerCh);
        
        assertEquals(31, finalDefaultJSONParserLexerPos);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDeserialze40() throws Throwable  {
        DefaultExtJSONParser defaultExtJSONParser = ((DefaultExtJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultExtJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "hasSpecial", true);
        setField(jSONScanner, "sp", 0);
        char[] charArray = new char[9];
        setField(jSONScanner, "sbuf", charArray);
        setField(jSONScanner, "bp", 1);
        setField(jSONScanner, "ch", '<');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 4);
        setField(jSONScanner, "len", 0);
        setField(defaultExtJSONParser, "lexer", jSONScanner);
        
        Object actual = CharArrayCodec.deserialze(defaultExtJSONParser);
        
        char[] expected = new char[0];
        assertArrayEquals(expected, ((char[]) actual));
        
        JSONLexer jSONLexer = defaultExtJSONParser.lexer;
        Object finalDefaultExtJSONParserLexerBp = getFieldValue(jSONLexer, "bp");
        JSONLexer jSONLexer1 = defaultExtJSONParser.lexer;
        Object finalDefaultExtJSONParserLexerCh = getFieldValue(jSONLexer1, "ch");
        JSONLexer jSONLexer2 = defaultExtJSONParser.lexer;
        Object finalDefaultExtJSONParserLexerPos = getFieldValue(jSONLexer2, "pos");
        JSONLexer jSONLexer3 = defaultExtJSONParser.lexer;
        Object finalDefaultExtJSONParserLexerToken = getFieldValue(jSONLexer3, "token");
        
        assertEquals(2, finalDefaultExtJSONParserLexerBp);
        
        assertEquals('\u001A', finalDefaultExtJSONParserLexerCh);
        
        assertEquals(1, finalDefaultExtJSONParserLexerPos);
        
        assertEquals(1, finalDefaultExtJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDeserialze41() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "hasSpecial", true);
        setField(jSONScanner, "sp", 9);
        char[] charArray = new char[32];
        setField(jSONScanner, "sbuf", charArray);
        setField(jSONScanner, "bp", Integer.MAX_VALUE);
        setField(jSONScanner, "ch", 'f');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 4);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        CharArrayCodec.deserialze(defaultJSONParser);
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerSp = getFieldValue(jSONLexer, "sp");
        JSONLexer jSONLexer1 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerBp = getFieldValue(jSONLexer1, "bp");
        JSONLexer jSONLexer2 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerPos = getFieldValue(jSONLexer2, "pos");
        
        assertEquals(0, finalDefaultJSONParserLexerSp);
        
        assertEquals(Integer.MIN_VALUE, finalDefaultJSONParserLexerBp);
        
        assertEquals(Integer.MAX_VALUE, finalDefaultJSONParserLexerPos);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDeserialze42() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "hasSpecial", true);
        setField(jSONScanner, "np", 0);
        setField(jSONScanner, "sp", 1);
        char[] charArray = new char[32];
        setField(jSONScanner, "sbuf", charArray);
        setField(jSONScanner, "bp", -1);
        setField(jSONScanner, "ch", '-');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 4);
        setField(jSONScanner, "len", 1);
        String string = new String("");
        setField(jSONScanner, "text", string);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        CharArrayCodec.deserialze(defaultJSONParser);
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerNp = getFieldValue(jSONLexer, "np");
        JSONLexer jSONLexer1 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerBp = getFieldValue(jSONLexer1, "bp");
        JSONLexer jSONLexer2 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerPos = getFieldValue(jSONLexer2, "pos");
        
        assertEquals(-1, finalDefaultJSONParserLexerNp);
        
        assertEquals(0, finalDefaultJSONParserLexerBp);
        
        assertEquals(-1, finalDefaultJSONParserLexerPos);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDeserialze43() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "hasSpecial", true);
        setField(jSONScanner, "sp", 0);
        char[] charArray = new char[9];
        setField(jSONScanner, "sbuf", charArray);
        setField(jSONScanner, "bp", 1);
        setField(jSONScanner, "ch", '\u0000');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 4);
        setField(jSONScanner, "len", 0);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        CharArrayCodec.deserialze(defaultJSONParser);
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerBp = getFieldValue(jSONLexer, "bp");
        JSONLexer jSONLexer1 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerCh = getFieldValue(jSONLexer1, "ch");
        JSONLexer jSONLexer2 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerPos = getFieldValue(jSONLexer2, "pos");
        
        assertEquals(14170, finalDefaultJSONParserLexerBp);
        
        assertEquals('\u001A', finalDefaultJSONParserLexerCh);
        
        assertEquals(14169, finalDefaultJSONParserLexerPos);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDeserialze44() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "np", -1);
        setField(jSONScanner, "sp", -2147483647);
        setField(jSONScanner, "token", 2);
        setField(jSONScanner, "len", 1);
        String string = new String("");
        setField(jSONScanner, "text", string);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        CharArrayCodec.deserialze(defaultJSONParser);
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerNp = getFieldValue(jSONLexer, "np");
        
        assertEquals(0, finalDefaultJSONParserLexerNp);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDeserialze45() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "hasSpecial", true);
        setField(jSONScanner, "sp", 9);
        char[] charArray = new char[32];
        setField(jSONScanner, "sbuf", charArray);
        setField(jSONScanner, "bp", 31);
        setField(jSONScanner, "ch", 'n');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 4);
        setField(jSONScanner, "len", 33);
        String string = new String("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        setField(jSONScanner, "text", string);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        CharArrayCodec.deserialze(defaultJSONParser);
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerSp = getFieldValue(jSONLexer, "sp");
        JSONLexer jSONLexer1 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerBp = getFieldValue(jSONLexer1, "bp");
        JSONLexer jSONLexer2 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerCh = getFieldValue(jSONLexer2, "ch");
        JSONLexer jSONLexer3 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerPos = getFieldValue(jSONLexer3, "pos");
        
        assertEquals(0, finalDefaultJSONParserLexerSp);
        
        assertEquals(33, finalDefaultJSONParserLexerBp);
        
        assertEquals('\u001A', finalDefaultJSONParserLexerCh);
        
        assertEquals(31, finalDefaultJSONParserLexerPos);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDeserialze46() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "hasSpecial", true);
        setField(jSONScanner, "sp", 9);
        char[] charArray = new char[32];
        setField(jSONScanner, "sbuf", charArray);
        setField(jSONScanner, "bp", Integer.MAX_VALUE);
        setField(jSONScanner, "ch", 't');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 4);
        setField(jSONScanner, "len", 1);
        String string = new String("");
        setField(jSONScanner, "text", string);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        CharArrayCodec.deserialze(defaultJSONParser);
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerSp = getFieldValue(jSONLexer, "sp");
        JSONLexer jSONLexer1 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerBp = getFieldValue(jSONLexer1, "bp");
        JSONLexer jSONLexer2 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerPos = getFieldValue(jSONLexer2, "pos");
        
        assertEquals(0, finalDefaultJSONParserLexerSp);
        
        assertEquals(Integer.MIN_VALUE, finalDefaultJSONParserLexerBp);
        
        assertEquals(Integer.MAX_VALUE, finalDefaultJSONParserLexerPos);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDeserialze47() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "hasSpecial", true);
        setField(jSONScanner, "np", 0);
        setField(jSONScanner, "sp", 0);
        char[] charArray = new char[9];
        setField(jSONScanner, "sbuf", charArray);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '2');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 4);
        setField(jSONScanner, "len", 0);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Object actual = CharArrayCodec.deserialze(defaultJSONParser);
        
        char[] expected = new char[0];
        assertArrayEquals(expected, ((char[]) actual));
        
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
    public void testDeserialze48() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "hasSpecial", true);
        setField(jSONScanner, "np", 0);
        setField(jSONScanner, "sp", 0);
        char[] charArray = new char[9];
        setField(jSONScanner, "sbuf", charArray);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '\"');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 4);
        setField(jSONScanner, "len", 0);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        CharArrayCodec.deserialze(defaultJSONParser);
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerHasSpecial = getFieldValue(jSONLexer, "hasSpecial");
        JSONLexer jSONLexer1 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerSp = getFieldValue(jSONLexer1, "sp");
        JSONLexer jSONLexer2 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerSbuf = getFieldValue(jSONLexer2, "sbuf");
        JSONLexer jSONLexer3 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerBp = getFieldValue(jSONLexer3, "bp");
        JSONLexer jSONLexer4 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerCh = getFieldValue(jSONLexer4, "ch");
        
        Class assertClazz = Class.forName("org.junit.Assert");
        Class finalDefaultJSONParserLexerHasSpecialType = boolean.class;
        Method assertFalseMethod = assertClazz.getDeclaredMethod("assertFalse", finalDefaultJSONParserLexerHasSpecialType);
        assertFalseMethod.setAccessible(true);
        java.lang.Object[] assertFalseMethodArguments = new java.lang.Object[1];
        assertFalseMethodArguments[0] = finalDefaultJSONParserLexerHasSpecial;
        assertFalseMethod.invoke(null, assertFalseMethodArguments);
        
        assertEquals(14975, finalDefaultJSONParserLexerSp);
        
        assertEquals(14976, finalDefaultJSONParserLexerBp);
        
        assertEquals('\u001A', finalDefaultJSONParserLexerCh);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCharArrayCodec1() {
        CharArrayCodec actual = new CharArrayCodec();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCharArrayCodec2() {
        CharArrayCodec actual = new CharArrayCodec();
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
    private static Object[] createArray(String className, int length, Object... values) throws ClassNotFoundException {
        Object array = java.lang.reflect.Array.newInstance(Class.forName(className), length);
    
        for (int i = 0; i < values.length; i++) {
            java.lang.reflect.Array.set(array, i, values[i]);
        }
        
        return (Object[]) array;
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
