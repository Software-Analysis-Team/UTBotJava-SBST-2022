package com.alibaba.fastjson.parser;

import org.junit.Test;
import java.util.Map;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.lang.reflect.Method;
import sun.reflect.generics.reflectiveObjects.TypeVariableImpl;
import java.util.List;
import com.alibaba.fastjson.parser.DefaultJSONParser.ResolveTask;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.deserializer.FieldTypeResolver;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import sun.misc.Unsafe;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;
import static java.lang.reflect.Array.get;
import static org.junit.Assert.assertTrue;

public class DefaultJSONParserTest {
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testClose1() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        
        defaultJSONParser.close();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetInput1() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        
        defaultJSONParser.getInput();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseKey1() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        
        defaultJSONParser.parseKey();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseKey2() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.token = 0;
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultJSONParser.parseKey();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseObject1() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        Object object = new Object();
        
        defaultJSONParser.parseObject(((Map) null), object);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testParseObject2() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.token = 8;
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Object actual = defaultJSONParser.parseObject(((Class) null));
        
        assertNull(actual);
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerToken = getFieldValue(jSONLexer, "token");
        
        assertEquals(20, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseObject3() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        
        defaultJSONParser.parseObject();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseObject4() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        
        defaultJSONParser.parseObject(((Type) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseObject5() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.token = 4;
        setField(defaultJSONParser, "lexer", jSONScanner);
        Class class1 = Object.class;
        
        defaultJSONParser.parseObject(class1);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testSetContext1() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        ParseContext parseContext = ((ParseContext) createInstance("com.alibaba.fastjson.parser.ParseContext"));
        
        defaultJSONParser.setContext(parseContext);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testSetContext2() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        ParseContext parseContext = ((ParseContext) createInstance("com.alibaba.fastjson.parser.ParseContext"));
        Object object = new Object();
        Object object1 = new Object();
        
        defaultJSONParser.setContext(parseContext, object, object1);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseArray1() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        ArrayList arrayList = new ArrayList();
        
        defaultJSONParser.parseArray(arrayList);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseArray2() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.token = 21;
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultJSONParser.parseArray(((Collection) null));
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerToken = getFieldValue(jSONLexer, "token");
        
        assertEquals(20, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseArray3() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.token = 0;
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultJSONParser.parseArray(((Collection) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseArray4() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        
        defaultJSONParser.parseArray(((Class) null), ((Collection) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseArray5() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        ArrayList arrayList = new ArrayList();
        
        defaultJSONParser.parseArray(((Type) null), arrayList);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseArray6() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.token = 22;
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultJSONParser.parseArray(((Type) null), ((Collection) null));
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerToken = getFieldValue(jSONLexer, "token");
        
        assertEquals(20, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseArray7() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.token = 22;
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultJSONParser.parseArray(((Class) null));
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerToken = getFieldValue(jSONLexer, "token");
        
        assertEquals(20, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseArray8() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        ArrayList arrayList = new ArrayList();
        Object object = new Object();
        
        defaultJSONParser.parseArray(arrayList, object);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseArray9() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultJSONParser.parseArray(((Collection) null), null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseArray10() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        ArrayList arrayList = new ArrayList();
        Object object = new Object();
        
        defaultJSONParser.parseArray(null, arrayList, object);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseArray11() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultJSONParser.parseArray(null, null, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseArray12() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        java.lang.reflect.Type[] typeArray = new java.lang.reflect.Type[0];
        
        defaultJSONParser.parseArray(typeArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testParseArray13() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.sp = 0;
        jSONScanner.ch = '\u0000';
        jSONScanner.token = 8;
        setField(defaultJSONParser, "lexer", jSONScanner);
        java.lang.reflect.Type[] typeArray = new java.lang.reflect.Type[9];
        
        Type initialTypeArray0 = typeArray[0];
        Type initialTypeArray1 = typeArray[1];
        Type initialTypeArray2 = typeArray[2];
        Type initialTypeArray3 = typeArray[3];
        Type initialTypeArray4 = typeArray[4];
        Type initialTypeArray5 = typeArray[5];
        Type initialTypeArray6 = typeArray[6];
        Type initialTypeArray7 = typeArray[7];
        Type initialTypeArray8 = typeArray[8];
        
        java.lang.Object[] actual = defaultJSONParser.parseArray(typeArray);
        
        assertNull(actual);
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerToken = getFieldValue(jSONLexer, "token");
        
        Type finalTypeArray0 = typeArray[0];
        Type finalTypeArray1 = typeArray[1];
        Type finalTypeArray2 = typeArray[2];
        Type finalTypeArray3 = typeArray[3];
        Type finalTypeArray4 = typeArray[4];
        Type finalTypeArray5 = typeArray[5];
        Type finalTypeArray6 = typeArray[6];
        Type finalTypeArray7 = typeArray[7];
        Type finalTypeArray8 = typeArray[8];
        
        assertEquals(20, finalDefaultJSONParserLexerToken);
        
        assertNull(finalTypeArray0);
        
        assertNull(finalTypeArray1);
        
        assertNull(finalTypeArray2);
        
        assertNull(finalTypeArray3);
        
        assertNull(finalTypeArray4);
        
        assertNull(finalTypeArray5);
        
        assertNull(finalTypeArray6);
        
        assertNull(finalTypeArray7);
        
        assertNull(finalTypeArray8);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseArray14() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.sp = 0;
        jSONScanner.bp = Integer.MAX_VALUE;
        jSONScanner.ch = '}';
        jSONScanner.token = 8;
        setField(jSONScanner, "len", 1);
        String string = new String("");
        setField(jSONScanner, "text", string);
        setField(defaultJSONParser, "lexer", jSONScanner);
        java.lang.reflect.Type[] typeArray = new java.lang.reflect.Type[9];
        
        Type initialTypeArray0 = typeArray[0];
        Type initialTypeArray1 = typeArray[1];
        Type initialTypeArray2 = typeArray[2];
        Type initialTypeArray3 = typeArray[3];
        Type initialTypeArray4 = typeArray[4];
        Type initialTypeArray5 = typeArray[5];
        Type initialTypeArray6 = typeArray[6];
        Type initialTypeArray7 = typeArray[7];
        Type initialTypeArray8 = typeArray[8];
        
        defaultJSONParser.parseArray(typeArray);
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerBp = getFieldValue(jSONLexer, "bp");
        JSONLexer jSONLexer1 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerToken = getFieldValue(jSONLexer1, "token");
        
        Type finalTypeArray0 = typeArray[0];
        Type finalTypeArray1 = typeArray[1];
        Type finalTypeArray2 = typeArray[2];
        Type finalTypeArray3 = typeArray[3];
        Type finalTypeArray4 = typeArray[4];
        Type finalTypeArray5 = typeArray[5];
        Type finalTypeArray6 = typeArray[6];
        Type finalTypeArray7 = typeArray[7];
        Type finalTypeArray8 = typeArray[8];
        
        assertEquals(Integer.MIN_VALUE, finalDefaultJSONParserLexerBp);
        
        assertEquals(13, finalDefaultJSONParserLexerToken);
        
        assertNull(finalTypeArray0);
        
        assertNull(finalTypeArray1);
        
        assertNull(finalTypeArray2);
        
        assertNull(finalTypeArray3);
        
        assertNull(finalTypeArray4);
        
        assertNull(finalTypeArray5);
        
        assertNull(finalTypeArray6);
        
        assertNull(finalTypeArray7);
        
        assertNull(finalTypeArray8);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testParseArray15() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.sp = 0;
        jSONScanner.bp = 0;
        jSONScanner.ch = ',';
        jSONScanner.token = 8;
        setField(defaultJSONParser, "lexer", jSONScanner);
        java.lang.reflect.Type[] typeArray = new java.lang.reflect.Type[9];
        
        Type initialTypeArray0 = typeArray[0];
        Type initialTypeArray1 = typeArray[1];
        Type initialTypeArray2 = typeArray[2];
        Type initialTypeArray3 = typeArray[3];
        Type initialTypeArray4 = typeArray[4];
        Type initialTypeArray5 = typeArray[5];
        Type initialTypeArray6 = typeArray[6];
        Type initialTypeArray7 = typeArray[7];
        Type initialTypeArray8 = typeArray[8];
        
        java.lang.Object[] actual = defaultJSONParser.parseArray(typeArray);
        
        assertNull(actual);
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerBp = getFieldValue(jSONLexer, "bp");
        JSONLexer jSONLexer1 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerCh = getFieldValue(jSONLexer1, "ch");
        JSONLexer jSONLexer2 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerToken = getFieldValue(jSONLexer2, "token");
        
        Type finalTypeArray0 = typeArray[0];
        Type finalTypeArray1 = typeArray[1];
        Type finalTypeArray2 = typeArray[2];
        Type finalTypeArray3 = typeArray[3];
        Type finalTypeArray4 = typeArray[4];
        Type finalTypeArray5 = typeArray[5];
        Type finalTypeArray6 = typeArray[6];
        Type finalTypeArray7 = typeArray[7];
        Type finalTypeArray8 = typeArray[8];
        
        assertEquals(1, finalDefaultJSONParserLexerBp);
        
        assertEquals('\u001A', finalDefaultJSONParserLexerCh);
        
        assertEquals(16, finalDefaultJSONParserLexerToken);
        
        assertNull(finalTypeArray0);
        
        assertNull(finalTypeArray1);
        
        assertNull(finalTypeArray2);
        
        assertNull(finalTypeArray3);
        
        assertNull(finalTypeArray4);
        
        assertNull(finalTypeArray5);
        
        assertNull(finalTypeArray6);
        
        assertNull(finalTypeArray7);
        
        assertNull(finalTypeArray8);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testParseArray16() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.sp = 0;
        jSONScanner.bp = 0;
        jSONScanner.ch = ']';
        jSONScanner.token = 8;
        setField(defaultJSONParser, "lexer", jSONScanner);
        java.lang.reflect.Type[] typeArray = new java.lang.reflect.Type[9];
        
        Type initialTypeArray0 = typeArray[0];
        Type initialTypeArray1 = typeArray[1];
        Type initialTypeArray2 = typeArray[2];
        Type initialTypeArray3 = typeArray[3];
        Type initialTypeArray4 = typeArray[4];
        Type initialTypeArray5 = typeArray[5];
        Type initialTypeArray6 = typeArray[6];
        Type initialTypeArray7 = typeArray[7];
        Type initialTypeArray8 = typeArray[8];
        
        java.lang.Object[] actual = defaultJSONParser.parseArray(typeArray);
        
        assertNull(actual);
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerBp = getFieldValue(jSONLexer, "bp");
        JSONLexer jSONLexer1 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerCh = getFieldValue(jSONLexer1, "ch");
        JSONLexer jSONLexer2 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerToken = getFieldValue(jSONLexer2, "token");
        
        Type finalTypeArray0 = typeArray[0];
        Type finalTypeArray1 = typeArray[1];
        Type finalTypeArray2 = typeArray[2];
        Type finalTypeArray3 = typeArray[3];
        Type finalTypeArray4 = typeArray[4];
        Type finalTypeArray5 = typeArray[5];
        Type finalTypeArray6 = typeArray[6];
        Type finalTypeArray7 = typeArray[7];
        Type finalTypeArray8 = typeArray[8];
        
        assertEquals(1, finalDefaultJSONParserLexerBp);
        
        assertEquals('\u001A', finalDefaultJSONParserLexerCh);
        
        assertEquals(15, finalDefaultJSONParserLexerToken);
        
        assertNull(finalTypeArray0);
        
        assertNull(finalTypeArray1);
        
        assertNull(finalTypeArray2);
        
        assertNull(finalTypeArray3);
        
        assertNull(finalTypeArray4);
        
        assertNull(finalTypeArray5);
        
        assertNull(finalTypeArray6);
        
        assertNull(finalTypeArray7);
        
        assertNull(finalTypeArray8);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testParseArray17() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.sp = 0;
        jSONScanner.ch = '\n';
        jSONScanner.token = 8;
        setField(defaultJSONParser, "lexer", jSONScanner);
        java.lang.reflect.Type[] typeArray = new java.lang.reflect.Type[9];
        
        Type initialTypeArray0 = typeArray[0];
        Type initialTypeArray1 = typeArray[1];
        Type initialTypeArray2 = typeArray[2];
        Type initialTypeArray3 = typeArray[3];
        Type initialTypeArray4 = typeArray[4];
        Type initialTypeArray5 = typeArray[5];
        Type initialTypeArray6 = typeArray[6];
        Type initialTypeArray7 = typeArray[7];
        Type initialTypeArray8 = typeArray[8];
        
        java.lang.Object[] actual = defaultJSONParser.parseArray(typeArray);
        
        assertNull(actual);
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerCh = getFieldValue(jSONLexer, "ch");
        JSONLexer jSONLexer1 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerToken = getFieldValue(jSONLexer1, "token");
        
        Type finalTypeArray0 = typeArray[0];
        Type finalTypeArray1 = typeArray[1];
        Type finalTypeArray2 = typeArray[2];
        Type finalTypeArray3 = typeArray[3];
        Type finalTypeArray4 = typeArray[4];
        Type finalTypeArray5 = typeArray[5];
        Type finalTypeArray6 = typeArray[6];
        Type finalTypeArray7 = typeArray[7];
        Type finalTypeArray8 = typeArray[8];
        
        assertEquals('\u001A', finalDefaultJSONParserLexerCh);
        
        assertEquals(20, finalDefaultJSONParserLexerToken);
        
        assertNull(finalTypeArray0);
        
        assertNull(finalTypeArray1);
        
        assertNull(finalTypeArray2);
        
        assertNull(finalTypeArray3);
        
        assertNull(finalTypeArray4);
        
        assertNull(finalTypeArray5);
        
        assertNull(finalTypeArray6);
        
        assertNull(finalTypeArray7);
        
        assertNull(finalTypeArray8);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseArray18() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.token = 0;
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultJSONParser.parseArray(((java.lang.reflect.Type[]) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testParseArray19() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.sp = 0;
        jSONScanner.ch = '}';
        jSONScanner.token = 8;
        setField(defaultJSONParser, "lexer", jSONScanner);
        java.lang.reflect.Type[] typeArray = new java.lang.reflect.Type[9];
        
        Type initialTypeArray0 = typeArray[0];
        Type initialTypeArray1 = typeArray[1];
        Type initialTypeArray2 = typeArray[2];
        Type initialTypeArray3 = typeArray[3];
        Type initialTypeArray4 = typeArray[4];
        Type initialTypeArray5 = typeArray[5];
        Type initialTypeArray6 = typeArray[6];
        Type initialTypeArray7 = typeArray[7];
        Type initialTypeArray8 = typeArray[8];
        
        java.lang.Object[] actual = defaultJSONParser.parseArray(typeArray);
        
        assertNull(actual);
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerCh = getFieldValue(jSONLexer, "ch");
        JSONLexer jSONLexer1 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerToken = getFieldValue(jSONLexer1, "token");
        
        Type finalTypeArray0 = typeArray[0];
        Type finalTypeArray1 = typeArray[1];
        Type finalTypeArray2 = typeArray[2];
        Type finalTypeArray3 = typeArray[3];
        Type finalTypeArray4 = typeArray[4];
        Type finalTypeArray5 = typeArray[5];
        Type finalTypeArray6 = typeArray[6];
        Type finalTypeArray7 = typeArray[7];
        Type finalTypeArray8 = typeArray[8];
        
        assertEquals('\u001A', finalDefaultJSONParserLexerCh);
        
        assertEquals(13, finalDefaultJSONParserLexerToken);
        
        assertNull(finalTypeArray0);
        
        assertNull(finalTypeArray1);
        
        assertNull(finalTypeArray2);
        
        assertNull(finalTypeArray3);
        
        assertNull(finalTypeArray4);
        
        assertNull(finalTypeArray5);
        
        assertNull(finalTypeArray6);
        
        assertNull(finalTypeArray7);
        
        assertNull(finalTypeArray8);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetObject1() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        String string = new String();
        
        Object actual = defaultJSONParser.getObject(string);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetObject2() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        setField(defaultJSONParser, "contextArrayIndex", -2147483647);
        
        Object actual = defaultJSONParser.getObject(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetObject3() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        setField(defaultJSONParser, "contextArrayIndex", 1);
        com.alibaba.fastjson.parser.ParseContext[] parseContextArray = new com.alibaba.fastjson.parser.ParseContext[0];
        setField(defaultJSONParser, "contextArray", parseContextArray);
        
        defaultJSONParser.getObject(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetObject4() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        setField(defaultJSONParser, "contextArrayIndex", 1);
        com.alibaba.fastjson.parser.ParseContext[] parseContextArray = new com.alibaba.fastjson.parser.ParseContext[9];
        setField(defaultJSONParser, "contextArray", parseContextArray);
        
        Object defaultJSONParserContextArray = getFieldValue(defaultJSONParser, "contextArray");
        Object initialDefaultJSONParserContextArray0 = get(defaultJSONParserContextArray, 0);
        Object defaultJSONParserContextArray1 = getFieldValue(defaultJSONParser, "contextArray");
        Object initialDefaultJSONParserContextArray1 = get(defaultJSONParserContextArray1, 1);
        Object defaultJSONParserContextArray2 = getFieldValue(defaultJSONParser, "contextArray");
        Object initialDefaultJSONParserContextArray2 = get(defaultJSONParserContextArray2, 2);
        Object defaultJSONParserContextArray3 = getFieldValue(defaultJSONParser, "contextArray");
        Object initialDefaultJSONParserContextArray3 = get(defaultJSONParserContextArray3, 3);
        Object defaultJSONParserContextArray4 = getFieldValue(defaultJSONParser, "contextArray");
        Object initialDefaultJSONParserContextArray4 = get(defaultJSONParserContextArray4, 4);
        Object defaultJSONParserContextArray5 = getFieldValue(defaultJSONParser, "contextArray");
        Object initialDefaultJSONParserContextArray5 = get(defaultJSONParserContextArray5, 5);
        Object defaultJSONParserContextArray6 = getFieldValue(defaultJSONParser, "contextArray");
        Object initialDefaultJSONParserContextArray6 = get(defaultJSONParserContextArray6, 6);
        Object defaultJSONParserContextArray7 = getFieldValue(defaultJSONParser, "contextArray");
        Object initialDefaultJSONParserContextArray7 = get(defaultJSONParserContextArray7, 7);
        Object defaultJSONParserContextArray8 = getFieldValue(defaultJSONParser, "contextArray");
        Object initialDefaultJSONParserContextArray8 = get(defaultJSONParserContextArray8, 8);
        
        defaultJSONParser.getObject(null);
        
        Object defaultJSONParserContextArray9 = getFieldValue(defaultJSONParser, "contextArray");
        Object finalDefaultJSONParserContextArray0 = get(defaultJSONParserContextArray9, 0);
        Object defaultJSONParserContextArray10 = getFieldValue(defaultJSONParser, "contextArray");
        Object finalDefaultJSONParserContextArray1 = get(defaultJSONParserContextArray10, 1);
        Object defaultJSONParserContextArray11 = getFieldValue(defaultJSONParser, "contextArray");
        Object finalDefaultJSONParserContextArray2 = get(defaultJSONParserContextArray11, 2);
        Object defaultJSONParserContextArray12 = getFieldValue(defaultJSONParser, "contextArray");
        Object finalDefaultJSONParserContextArray3 = get(defaultJSONParserContextArray12, 3);
        Object defaultJSONParserContextArray13 = getFieldValue(defaultJSONParser, "contextArray");
        Object finalDefaultJSONParserContextArray4 = get(defaultJSONParserContextArray13, 4);
        Object defaultJSONParserContextArray14 = getFieldValue(defaultJSONParser, "contextArray");
        Object finalDefaultJSONParserContextArray5 = get(defaultJSONParserContextArray14, 5);
        Object defaultJSONParserContextArray15 = getFieldValue(defaultJSONParser, "contextArray");
        Object finalDefaultJSONParserContextArray6 = get(defaultJSONParserContextArray15, 6);
        Object defaultJSONParserContextArray16 = getFieldValue(defaultJSONParser, "contextArray");
        Object finalDefaultJSONParserContextArray7 = get(defaultJSONParserContextArray16, 7);
        Object defaultJSONParserContextArray17 = getFieldValue(defaultJSONParser, "contextArray");
        Object finalDefaultJSONParserContextArray8 = get(defaultJSONParserContextArray17, 8);
        
        assertNull(finalDefaultJSONParserContextArray0);
        
        assertNull(finalDefaultJSONParserContextArray1);
        
        assertNull(finalDefaultJSONParserContextArray2);
        
        assertNull(finalDefaultJSONParserContextArray3);
        
        assertNull(finalDefaultJSONParserContextArray4);
        
        assertNull(finalDefaultJSONParserContextArray5);
        
        assertNull(finalDefaultJSONParserContextArray6);
        
        assertNull(finalDefaultJSONParserContextArray7);
        
        assertNull(finalDefaultJSONParserContextArray8);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetObject5() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        setField(defaultJSONParser, "contextArrayIndex", 1);
        com.alibaba.fastjson.parser.ParseContext[] parseContextArray = new com.alibaba.fastjson.parser.ParseContext[9];
        ParseContext parseContext = ((ParseContext) createInstance("com.alibaba.fastjson.parser.ParseContext"));
        parseContextArray[0] = parseContext;
        parseContextArray[1] = parseContext;
        parseContextArray[2] = parseContext;
        parseContextArray[3] = parseContext;
        parseContextArray[4] = parseContext;
        parseContextArray[5] = parseContext;
        parseContextArray[6] = parseContext;
        parseContextArray[7] = parseContext;
        parseContextArray[8] = parseContext;
        setField(defaultJSONParser, "contextArray", parseContextArray);
        
        defaultJSONParser.getObject(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testThrowException1() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        
        defaultJSONParser.throwException(0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testThrowException2() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        
        defaultJSONParser.throwException(0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testAccept1() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        
        defaultJSONParser.accept(0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testAccept2() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.token = 1;
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultJSONParser.accept(0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testAccept3() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.sp = 0;
        jSONScanner.bp = 0;
        jSONScanner.ch = '/';
        jSONScanner.pos = 0;
        jSONScanner.token = 0;
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultJSONParser.accept(0);
        
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
    public void testAccept4() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.sp = 0;
        jSONScanner.bp = 0;
        jSONScanner.ch = 't';
        jSONScanner.pos = 0;
        jSONScanner.token = 0;
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultJSONParser.accept(0);
        
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
    public void testAccept5() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.sp = 0;
        jSONScanner.bp = 0;
        jSONScanner.ch = '@';
        jSONScanner.pos = 0;
        jSONScanner.token = 0;
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultJSONParser.accept(0);
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerToken = getFieldValue(jSONLexer, "token");
        
        assertEquals(20, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testAccept6() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.sp = 0;
        jSONScanner.bp = 0;
        jSONScanner.ch = ',';
        jSONScanner.pos = 0;
        jSONScanner.token = 0;
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultJSONParser.accept(0);
        
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
    
    @Test(timeout = 10000)
    public void testAccept7() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.sp = 0;
        jSONScanner.bp = 0;
        jSONScanner.ch = '-';
        jSONScanner.pos = 0;
        jSONScanner.token = 0;
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultJSONParser.accept(0);
        
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
    public void testAccept8() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.np = 0;
        jSONScanner.sp = 0;
        jSONScanner.bp = 0;
        jSONScanner.ch = '2';
        jSONScanner.pos = 0;
        jSONScanner.token = 0;
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultJSONParser.accept(0);
        
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
    public void testAccept9() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.hasSpecial = false;
        jSONScanner.np = 0;
        jSONScanner.sp = 0;
        jSONScanner.bp = 0;
        jSONScanner.ch = '\"';
        jSONScanner.pos = 0;
        jSONScanner.token = 0;
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultJSONParser.accept(0);
        
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
    public void testAccept10() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        
        defaultJSONParser.accept(0, 0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testAccept11() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.sp = 0;
        jSONScanner.ch = '\u0000';
        jSONScanner.token = 0;
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultJSONParser.accept(0, 2);
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerToken = getFieldValue(jSONLexer, "token");
        
        assertEquals(20, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testAccept12() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.sp = 0;
        jSONScanner.ch = ',';
        jSONScanner.token = 0;
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultJSONParser.accept(0, 16);
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerCh = getFieldValue(jSONLexer, "ch");
        JSONLexer jSONLexer1 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerToken = getFieldValue(jSONLexer1, "token");
        
        assertEquals('\u001A', finalDefaultJSONParserLexerCh);
        
        assertEquals(16, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testAccept13() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.sp = 0;
        jSONScanner.ch = '\u0000';
        jSONScanner.token = 0;
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultJSONParser.accept(0, 16);
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerToken = getFieldValue(jSONLexer, "token");
        
        assertEquals(20, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testAccept14() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.sp = 0;
        jSONScanner.ch = '\u0000';
        jSONScanner.token = 0;
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultJSONParser.accept(0, 4);
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerToken = getFieldValue(jSONLexer, "token");
        
        assertEquals(20, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetContext1() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        
        ParseContext actual = defaultJSONParser.getContext();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetContext2() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        setField(defaultJSONParser, "context", null);
        
        ParseContext actual = defaultJSONParser.getContext();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParse1() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        Object object = new Object();
        
        defaultJSONParser.parse(object);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParse2() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.token = 0;
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultJSONParser.parse(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParse3() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        
        defaultJSONParser.parse();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParse4() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.token = 21;
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultJSONParser.parse();
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerToken = getFieldValue(jSONLexer, "token");
        
        assertEquals(20, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testParse5() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.token = 23;
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Object actual = defaultJSONParser.parse();
        
        assertNull(actual);
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerToken = getFieldValue(jSONLexer, "token");
        
        assertEquals(20, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testParse6() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.token = 6;
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Object actual = defaultJSONParser.parse();
        
        Boolean expected = true;
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerToken = getFieldValue(jSONLexer, "token");
        
        assertEquals(20, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testParse7() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.token = 8;
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Object actual = defaultJSONParser.parse();
        
        assertNull(actual);
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerToken = getFieldValue(jSONLexer, "token");
        
        assertEquals(20, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParse8() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.token = 18;
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultJSONParser.parse();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParse9() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.token = 0;
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultJSONParser.parse();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testParse10() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.token = 20;
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Object actual = defaultJSONParser.parse();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParse11() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        Object object = new Object();
        
        defaultJSONParser.parse(null, object);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testConfig1() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultJSONParser.config(null, false);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testPopContext1() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        
        defaultJSONParser.popContext();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testAddContext1() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        ParseContext parseContext = ((ParseContext) createInstance("com.alibaba.fastjson.parser.ParseContext"));
        
        Class defaultJSONParserClazz = Class.forName("com.alibaba.fastjson.parser.DefaultJSONParser");
        Class parseContextType = Class.forName("com.alibaba.fastjson.parser.ParseContext");
        Method addContextMethod = defaultJSONParserClazz.getDeclaredMethod("addContext", parseContextType);
        addContextMethod.setAccessible(true);
        java.lang.Object[] addContextMethodArguments = new java.lang.Object[1];
        addContextMethodArguments[0] = parseContext;
        addContextMethod.invoke(defaultJSONParser, addContextMethodArguments);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetDateFomartPattern1() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        
        String actual = defaultJSONParser.getDateFomartPattern();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetDateFomartPattern2() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        setField(defaultJSONParser, "dateFormatPattern", null);
        
        String actual = defaultJSONParser.getDateFomartPattern();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetDateFomrat1() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        
        defaultJSONParser.setDateFomrat(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetDateFomrat2() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        setField(defaultJSONParser, "dateFormat", null);
        
        defaultJSONParser.setDateFomrat(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetSymbolTable1() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        
        SymbolTable actual = defaultJSONParser.getSymbolTable();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetSymbolTable2() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        SymbolTable symbolTable = ((SymbolTable) createInstance("com.alibaba.fastjson.parser.SymbolTable"));
        setField(defaultJSONParser, "symbolTable", symbolTable);
        
        SymbolTable actual = defaultJSONParser.getSymbolTable();
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(symbolTable, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseArrayWithType1() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        
        defaultJSONParser.parseArrayWithType(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseArrayWithType2() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.token = 0;
        setField(defaultJSONParser, "lexer", jSONScanner);
        TypeVariableImpl typeVariableImpl = ((TypeVariableImpl) createInstance("sun.reflect.generics.reflectiveObjects.TypeVariableImpl"));
        
        defaultJSONParser.parseArrayWithType(typeVariableImpl);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testParseArrayWithType3() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.token = 8;
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Object actual = defaultJSONParser.parseArrayWithType(null);
        
        assertNull(actual);
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerToken = getFieldValue(jSONLexer, "token");
        
        assertEquals(20, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testAcceptType1() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        String string = new String();
        
        defaultJSONParser.acceptType(string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testAcceptType2() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.sp = 0;
        jSONScanner.bp = Integer.MAX_VALUE;
        jSONScanner.ch = '\t';
        setField(jSONScanner, "len", 1);
        String string = new String("");
        setField(jSONScanner, "text", string);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultJSONParser.acceptType(null);
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerBp = getFieldValue(jSONLexer, "bp");
        
        assertEquals(Integer.MIN_VALUE, finalDefaultJSONParserLexerBp);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testAcceptType3() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.sp = 0;
        jSONScanner.bp = 0;
        jSONScanner.ch = '\b';
        setField(jSONScanner, "len", 0);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultJSONParser.acceptType(null);
        
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
    public void testGetResolveStatus1() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        
        int actual = defaultJSONParser.getResolveStatus();
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetResolveStatus2() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        defaultJSONParser.resolveStatus = 0;
        
        int actual = defaultJSONParser.getResolveStatus();
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetResolveStatus1() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        
        defaultJSONParser.setResolveStatus(0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetResolveStatus2() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        defaultJSONParser.resolveStatus = 0;
        
        defaultJSONParser.setResolveStatus(0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCheckListResolve1() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        ArrayList arrayList = new ArrayList();
        
        defaultJSONParser.checkListResolve(arrayList);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCheckListResolve2() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        defaultJSONParser.resolveStatus = 0;
        
        defaultJSONParser.checkListResolve(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCheckListResolve3() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        defaultJSONParser.resolveStatus = 1;
        
        defaultJSONParser.checkListResolve(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCheckMapResolve1() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        Object object = new Object();
        
        defaultJSONParser.checkMapResolve(null, object);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCheckMapResolve2() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        defaultJSONParser.resolveStatus = 0;
        
        defaultJSONParser.checkMapResolve(null, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetResolveTaskList1() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        
        List actual = defaultJSONParser.getResolveTaskList();
        
        ArrayList expected = new ArrayList();
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetResolveTaskList2() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        ArrayList arrayList = new ArrayList();
        setField(defaultJSONParser, "resolveTaskList", arrayList);
        
        List actual = defaultJSONParser.getResolveTaskList();
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(arrayList, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetResolveTaskList3() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        setField(defaultJSONParser, "resolveTaskList", null);
        
        List actual = defaultJSONParser.getResolveTaskList();
        
        ArrayList expected = new ArrayList();
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testAddResolveTask1() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        DefaultJSONParser.ResolveTask resolveTask = ((DefaultJSONParser.ResolveTask) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser$ResolveTask"));
        
        defaultJSONParser.addResolveTask(resolveTask);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testAddResolveTask2() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        ArrayList arrayList = new ArrayList();
        setField(defaultJSONParser, "resolveTaskList", arrayList);
        DefaultJSONParser.ResolveTask resolveTask = ((DefaultJSONParser.ResolveTask) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser$ResolveTask"));
        
        defaultJSONParser.addResolveTask(resolveTask);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testAddResolveTask3() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        setField(defaultJSONParser, "resolveTaskList", null);
        
        defaultJSONParser.addResolveTask(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetLastResolveTask1() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        
        defaultJSONParser.getLastResolveTask();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetLastResolveTask2() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        setField(defaultJSONParser, "resolveTaskList", null);
        
        Object initialDefaultJSONParserResolveTaskList = getFieldValue(defaultJSONParser, "resolveTaskList");
        
        defaultJSONParser.getLastResolveTask();
        
        Object finalDefaultJSONParserResolveTaskList = getFieldValue(defaultJSONParser, "resolveTaskList");
        
        assertNull(finalDefaultJSONParserResolveTaskList);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetLastResolveTask3() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        ArrayList arrayList = new ArrayList();
        setField(defaultJSONParser, "resolveTaskList", arrayList);
        
        defaultJSONParser.getLastResolveTask();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetExtraProcessors1() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        
        List actual = defaultJSONParser.getExtraProcessors();
        
        ArrayList expected = new ArrayList();
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetExtraProcessors2() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        ArrayList arrayList = new ArrayList();
        setField(defaultJSONParser, "extraProcessors", arrayList);
        
        List actual = defaultJSONParser.getExtraProcessors();
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(arrayList, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetExtraProcessors3() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        setField(defaultJSONParser, "extraProcessors", null);
        
        List actual = defaultJSONParser.getExtraProcessors();
        
        ArrayList expected = new ArrayList();
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetExtraTypeProviders1() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        
        List actual = defaultJSONParser.getExtraTypeProviders();
        
        ArrayList expected = new ArrayList();
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetExtraTypeProviders2() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        ArrayList arrayList = new ArrayList();
        setField(defaultJSONParser, "extraTypeProviders", arrayList);
        
        List actual = defaultJSONParser.getExtraTypeProviders();
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(arrayList, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetExtraTypeProviders3() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        setField(defaultJSONParser, "extraTypeProviders", null);
        
        List actual = defaultJSONParser.getExtraTypeProviders();
        
        ArrayList expected = new ArrayList();
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetFieldTypeResolver1() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        
        FieldTypeResolver actual = defaultJSONParser.getFieldTypeResolver();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetFieldTypeResolver2() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        setField(defaultJSONParser, "fieldTypeResolver", null);
        
        FieldTypeResolver actual = defaultJSONParser.getFieldTypeResolver();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetFieldTypeResolver1() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        
        defaultJSONParser.setFieldTypeResolver(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetFieldTypeResolver2() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        setField(defaultJSONParser, "fieldTypeResolver", null);
        
        defaultJSONParser.setFieldTypeResolver(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetLexer1() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        
        JSONLexer actual = defaultJSONParser.getLexer();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetLexer2() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        JSONLexer actual = defaultJSONParser.getLexer();
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(jSONScanner, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testResolveReference1() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        String string = new String();
        
        Object actual = defaultJSONParser.resolveReference(string);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testResolveReference2() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        setField(defaultJSONParser, "contextArray", null);
        
        Object actual = defaultJSONParser.resolveReference(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testResolveReference3() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        setField(defaultJSONParser, "contextArrayIndex", -2147483647);
        com.alibaba.fastjson.parser.ParseContext[] parseContextArray = new com.alibaba.fastjson.parser.ParseContext[9];
        setField(defaultJSONParser, "contextArray", parseContextArray);
        
        Object defaultJSONParserContextArray = getFieldValue(defaultJSONParser, "contextArray");
        Object initialDefaultJSONParserContextArray0 = get(defaultJSONParserContextArray, 0);
        Object defaultJSONParserContextArray1 = getFieldValue(defaultJSONParser, "contextArray");
        Object initialDefaultJSONParserContextArray1 = get(defaultJSONParserContextArray1, 1);
        Object defaultJSONParserContextArray2 = getFieldValue(defaultJSONParser, "contextArray");
        Object initialDefaultJSONParserContextArray2 = get(defaultJSONParserContextArray2, 2);
        Object defaultJSONParserContextArray3 = getFieldValue(defaultJSONParser, "contextArray");
        Object initialDefaultJSONParserContextArray3 = get(defaultJSONParserContextArray3, 3);
        Object defaultJSONParserContextArray4 = getFieldValue(defaultJSONParser, "contextArray");
        Object initialDefaultJSONParserContextArray4 = get(defaultJSONParserContextArray4, 4);
        Object defaultJSONParserContextArray5 = getFieldValue(defaultJSONParser, "contextArray");
        Object initialDefaultJSONParserContextArray5 = get(defaultJSONParserContextArray5, 5);
        Object defaultJSONParserContextArray6 = getFieldValue(defaultJSONParser, "contextArray");
        Object initialDefaultJSONParserContextArray6 = get(defaultJSONParserContextArray6, 6);
        Object defaultJSONParserContextArray7 = getFieldValue(defaultJSONParser, "contextArray");
        Object initialDefaultJSONParserContextArray7 = get(defaultJSONParserContextArray7, 7);
        Object defaultJSONParserContextArray8 = getFieldValue(defaultJSONParser, "contextArray");
        Object initialDefaultJSONParserContextArray8 = get(defaultJSONParserContextArray8, 8);
        
        Object actual = defaultJSONParser.resolveReference(null);
        
        assertNull(actual);
        
        Object defaultJSONParserContextArray9 = getFieldValue(defaultJSONParser, "contextArray");
        Object finalDefaultJSONParserContextArray0 = get(defaultJSONParserContextArray9, 0);
        Object defaultJSONParserContextArray10 = getFieldValue(defaultJSONParser, "contextArray");
        Object finalDefaultJSONParserContextArray1 = get(defaultJSONParserContextArray10, 1);
        Object defaultJSONParserContextArray11 = getFieldValue(defaultJSONParser, "contextArray");
        Object finalDefaultJSONParserContextArray2 = get(defaultJSONParserContextArray11, 2);
        Object defaultJSONParserContextArray12 = getFieldValue(defaultJSONParser, "contextArray");
        Object finalDefaultJSONParserContextArray3 = get(defaultJSONParserContextArray12, 3);
        Object defaultJSONParserContextArray13 = getFieldValue(defaultJSONParser, "contextArray");
        Object finalDefaultJSONParserContextArray4 = get(defaultJSONParserContextArray13, 4);
        Object defaultJSONParserContextArray14 = getFieldValue(defaultJSONParser, "contextArray");
        Object finalDefaultJSONParserContextArray5 = get(defaultJSONParserContextArray14, 5);
        Object defaultJSONParserContextArray15 = getFieldValue(defaultJSONParser, "contextArray");
        Object finalDefaultJSONParserContextArray6 = get(defaultJSONParserContextArray15, 6);
        Object defaultJSONParserContextArray16 = getFieldValue(defaultJSONParser, "contextArray");
        Object finalDefaultJSONParserContextArray7 = get(defaultJSONParserContextArray16, 7);
        Object defaultJSONParserContextArray17 = getFieldValue(defaultJSONParser, "contextArray");
        Object finalDefaultJSONParserContextArray8 = get(defaultJSONParserContextArray17, 8);
        
        assertNull(finalDefaultJSONParserContextArray0);
        
        assertNull(finalDefaultJSONParserContextArray1);
        
        assertNull(finalDefaultJSONParserContextArray2);
        
        assertNull(finalDefaultJSONParserContextArray3);
        
        assertNull(finalDefaultJSONParserContextArray4);
        
        assertNull(finalDefaultJSONParserContextArray5);
        
        assertNull(finalDefaultJSONParserContextArray6);
        
        assertNull(finalDefaultJSONParserContextArray7);
        
        assertNull(finalDefaultJSONParserContextArray8);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testResolveReference4() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        setField(defaultJSONParser, "contextArrayIndex", 1);
        com.alibaba.fastjson.parser.ParseContext[] parseContextArray = new com.alibaba.fastjson.parser.ParseContext[9];
        setField(defaultJSONParser, "contextArray", parseContextArray);
        
        Object defaultJSONParserContextArray = getFieldValue(defaultJSONParser, "contextArray");
        Object initialDefaultJSONParserContextArray0 = get(defaultJSONParserContextArray, 0);
        Object defaultJSONParserContextArray1 = getFieldValue(defaultJSONParser, "contextArray");
        Object initialDefaultJSONParserContextArray1 = get(defaultJSONParserContextArray1, 1);
        Object defaultJSONParserContextArray2 = getFieldValue(defaultJSONParser, "contextArray");
        Object initialDefaultJSONParserContextArray2 = get(defaultJSONParserContextArray2, 2);
        Object defaultJSONParserContextArray3 = getFieldValue(defaultJSONParser, "contextArray");
        Object initialDefaultJSONParserContextArray3 = get(defaultJSONParserContextArray3, 3);
        Object defaultJSONParserContextArray4 = getFieldValue(defaultJSONParser, "contextArray");
        Object initialDefaultJSONParserContextArray4 = get(defaultJSONParserContextArray4, 4);
        Object defaultJSONParserContextArray5 = getFieldValue(defaultJSONParser, "contextArray");
        Object initialDefaultJSONParserContextArray5 = get(defaultJSONParserContextArray5, 5);
        Object defaultJSONParserContextArray6 = getFieldValue(defaultJSONParser, "contextArray");
        Object initialDefaultJSONParserContextArray6 = get(defaultJSONParserContextArray6, 6);
        Object defaultJSONParserContextArray7 = getFieldValue(defaultJSONParser, "contextArray");
        Object initialDefaultJSONParserContextArray7 = get(defaultJSONParserContextArray7, 7);
        Object defaultJSONParserContextArray8 = getFieldValue(defaultJSONParser, "contextArray");
        Object initialDefaultJSONParserContextArray8 = get(defaultJSONParserContextArray8, 8);
        
        defaultJSONParser.resolveReference(null);
        
        Object defaultJSONParserContextArray9 = getFieldValue(defaultJSONParser, "contextArray");
        Object finalDefaultJSONParserContextArray0 = get(defaultJSONParserContextArray9, 0);
        Object defaultJSONParserContextArray10 = getFieldValue(defaultJSONParser, "contextArray");
        Object finalDefaultJSONParserContextArray1 = get(defaultJSONParserContextArray10, 1);
        Object defaultJSONParserContextArray11 = getFieldValue(defaultJSONParser, "contextArray");
        Object finalDefaultJSONParserContextArray2 = get(defaultJSONParserContextArray11, 2);
        Object defaultJSONParserContextArray12 = getFieldValue(defaultJSONParser, "contextArray");
        Object finalDefaultJSONParserContextArray3 = get(defaultJSONParserContextArray12, 3);
        Object defaultJSONParserContextArray13 = getFieldValue(defaultJSONParser, "contextArray");
        Object finalDefaultJSONParserContextArray4 = get(defaultJSONParserContextArray13, 4);
        Object defaultJSONParserContextArray14 = getFieldValue(defaultJSONParser, "contextArray");
        Object finalDefaultJSONParserContextArray5 = get(defaultJSONParserContextArray14, 5);
        Object defaultJSONParserContextArray15 = getFieldValue(defaultJSONParser, "contextArray");
        Object finalDefaultJSONParserContextArray6 = get(defaultJSONParserContextArray15, 6);
        Object defaultJSONParserContextArray16 = getFieldValue(defaultJSONParser, "contextArray");
        Object finalDefaultJSONParserContextArray7 = get(defaultJSONParserContextArray16, 7);
        Object defaultJSONParserContextArray17 = getFieldValue(defaultJSONParser, "contextArray");
        Object finalDefaultJSONParserContextArray8 = get(defaultJSONParserContextArray17, 8);
        
        assertNull(finalDefaultJSONParserContextArray0);
        
        assertNull(finalDefaultJSONParserContextArray1);
        
        assertNull(finalDefaultJSONParserContextArray2);
        
        assertNull(finalDefaultJSONParserContextArray3);
        
        assertNull(finalDefaultJSONParserContextArray4);
        
        assertNull(finalDefaultJSONParserContextArray5);
        
        assertNull(finalDefaultJSONParserContextArray6);
        
        assertNull(finalDefaultJSONParserContextArray7);
        
        assertNull(finalDefaultJSONParserContextArray8);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testResolveReference5() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        setField(defaultJSONParser, "contextArrayIndex", 1);
        com.alibaba.fastjson.parser.ParseContext[] parseContextArray = new com.alibaba.fastjson.parser.ParseContext[9];
        ParseContext parseContext = ((ParseContext) createInstance("com.alibaba.fastjson.parser.ParseContext"));
        parseContextArray[0] = parseContext;
        parseContextArray[1] = parseContext;
        parseContextArray[2] = parseContext;
        parseContextArray[3] = parseContext;
        parseContextArray[4] = parseContext;
        parseContextArray[5] = parseContext;
        parseContextArray[6] = parseContext;
        parseContextArray[7] = parseContext;
        parseContextArray[8] = parseContext;
        setField(defaultJSONParser, "contextArray", parseContextArray);
        
        Object actual = defaultJSONParser.resolveReference(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testHandleResovleTask1() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        Object object = new Object();
        
        defaultJSONParser.handleResovleTask(object);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testHandleResovleTask2() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        setField(defaultJSONParser, "resolveTaskList", null);
        
        Object initialDefaultJSONParserResolveTaskList = getFieldValue(defaultJSONParser, "resolveTaskList");
        
        defaultJSONParser.handleResovleTask(null);
        
        Object finalDefaultJSONParserResolveTaskList = getFieldValue(defaultJSONParser, "resolveTaskList");
        
        assertNull(finalDefaultJSONParserResolveTaskList);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testHandleResovleTask3() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        ArrayList arrayList = new ArrayList();
        setField(defaultJSONParser, "resolveTaskList", arrayList);
        java.lang.Object[] forEachOrderedTaskArray = createArray("java.util.stream.ForEachOps$ForEachOrderedTask", 1);
        
        Object initialForEachOrderedTaskArray0 = forEachOrderedTaskArray[0];
        
        defaultJSONParser.handleResovleTask(forEachOrderedTaskArray);
        
        Object finalForEachOrderedTaskArray0 = forEachOrderedTaskArray[0];
        
        assertNull(finalForEachOrderedTaskArray0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseExtra1() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        Object object = new Object();
        String string = new String();
        
        defaultJSONParser.parseExtra(object, string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseExtra2() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.sp = 0;
        jSONScanner.ch = '\u0000';
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultJSONParser.parseExtra(null, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseExtra3() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.sp = 0;
        jSONScanner.ch = '\r';
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultJSONParser.parseExtra(null, null);
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerCh = getFieldValue(jSONLexer, "ch");
        
        assertEquals('\u001A', finalDefaultJSONParserLexerCh);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseExtra4() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.sp = 0;
        jSONScanner.bp = 0;
        jSONScanner.ch = ':';
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultJSONParser.parseExtra(null, null);
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerBp = getFieldValue(jSONLexer, "bp");
        JSONLexer jSONLexer1 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerCh = getFieldValue(jSONLexer1, "ch");
        
        assertEquals(14170, finalDefaultJSONParserLexerBp);
        
        assertEquals('\u001A', finalDefaultJSONParserLexerCh);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDefaultJSONParser1() {
        new DefaultJSONParser(((JSONLexer) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDefaultJSONParser2() {
        String string = new String();
        DefaultJSONParser actual = new DefaultJSONParser(string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDefaultJSONParser3() {
        String string = new String();
        ParserConfig parserConfig = new ParserConfig();
        DefaultJSONParser actual = new DefaultJSONParser(string, parserConfig);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDefaultJSONParser4() {
        String string = new String();
        ParserConfig parserConfig = new ParserConfig();
        DefaultJSONParser actual = new DefaultJSONParser(string, parserConfig, 0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testResolveTask1() throws Throwable  {
        ParseContext parseContext = ((ParseContext) createInstance("com.alibaba.fastjson.parser.ParseContext"));
        String string = new String();
        DefaultJSONParser.ResolveTask actual = new DefaultJSONParser.ResolveTask(parseContext, string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testResolveTask2() throws Throwable  {
        ParseContext parseContext = ((ParseContext) createInstance("com.alibaba.fastjson.parser.ParseContext"));
        String string = new String("");
        DefaultJSONParser.ResolveTask actual = new DefaultJSONParser.ResolveTask(parseContext, string);
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
