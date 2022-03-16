package com.alibaba.fastjson.parser;

import org.junit.Test;
import java.util.Collection;
import java.util.ArrayList;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.LinkedHashMap;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.lang.reflect.Method;
import java.util.List;
import com.alibaba.fastjson.parser.DefaultJSONParser.ResolveTask;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.deserializer.FieldTypeResolver;
import sun.reflect.generics.reflectiveObjects.TypeVariableImpl;
import sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl;
import sun.reflect.generics.reflectiveObjects.WildcardTypeImpl;
import com.alibaba.fastjson.parser.deserializer.PropertyProcessable;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Array;
import java.util.Objects;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Iterator;
import sun.misc.Unsafe;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import static java.lang.reflect.Array.get;
import static org.mockito.Mockito.mock;

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
    public void testParseArray1() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.token = 22;
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultJSONParser.parseArray(((Class) null), ((Collection) null));
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerToken = getFieldValue(jSONLexer, "token");
        
        assertEquals(20, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseArray2() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.sp = 0;
        jSONScanner.bp = 0;
        jSONScanner.ch = '\u0000';
        jSONScanner.pos = 0;
        jSONScanner.token = 21;
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultJSONParser.parseArray(((Class) null));
        
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
        jSONScanner.sp = 0;
        jSONScanner.bp = 0;
        jSONScanner.ch = ',';
        jSONScanner.pos = 0;
        jSONScanner.token = 21;
        setField(jSONScanner, "len", 0);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultJSONParser.parseArray(((Class) null));
        
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
    public void testParseArray4() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.sp = 0;
        jSONScanner.bp = 0;
        jSONScanner.ch = '}';
        jSONScanner.pos = 0;
        jSONScanner.token = 21;
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultJSONParser.parseArray(((Class) null));
        
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
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseArray5() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.hasSpecial = false;
        jSONScanner.np = 0;
        jSONScanner.sp = 0;
        jSONScanner.bp = 0;
        jSONScanner.ch = '\"';
        jSONScanner.pos = 0;
        jSONScanner.token = 22;
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultJSONParser.parseArray(((Class) null));
        
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
    public void testParseArray6() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.sp = 0;
        jSONScanner.bp = 0;
        jSONScanner.ch = '/';
        jSONScanner.pos = 0;
        jSONScanner.token = 22;
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultJSONParser.parseArray(((Class) null));
        
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
    public void testParseArray7() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.sp = 0;
        jSONScanner.bp = 0;
        jSONScanner.ch = '2';
        jSONScanner.pos = 0;
        jSONScanner.token = 21;
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultJSONParser.parseArray(((Class) null));
        
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
    public void testParseArray8() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.sp = 0;
        jSONScanner.bp = 0;
        jSONScanner.ch = 'N';
        jSONScanner.pos = 0;
        jSONScanner.token = 21;
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultJSONParser.parseArray(((Class) null));
        
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
    public void testParseArray9() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.token = 14;
        setField(defaultJSONParser, "lexer", jSONScanner);
        Class class1 = Object.class;
        
        defaultJSONParser.parseArray(class1);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseArray10() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        ArrayList arrayList = new ArrayList();
        Object object = new Object();
        
        defaultJSONParser.parseArray(arrayList, object);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseArray11() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.sp = 0;
        jSONScanner.bp = 0;
        jSONScanner.ch = '\u0000';
        jSONScanner.pos = 0;
        jSONScanner.token = 21;
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultJSONParser.parseArray(((Collection) null), null);
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerToken = getFieldValue(jSONLexer, "token");
        
        assertEquals(20, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseArray12() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.sp = 0;
        jSONScanner.bp = 0;
        jSONScanner.ch = '/';
        jSONScanner.pos = 0;
        jSONScanner.token = 21;
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultJSONParser.parseArray(((Collection) null), null);
        
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
    public void testParseArray13() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONReaderScanner jSONReaderScanner = ((JSONReaderScanner) createInstance("com.alibaba.fastjson.parser.JSONReaderScanner"));
        jSONReaderScanner.token = 0;
        setField(defaultJSONParser, "lexer", jSONReaderScanner);
        java.lang.Object[] pNGImageDataEnumerationArray = createArray("com.sun.imageio.plugins.png.PNGImageDataEnumeration", 0);
        
        defaultJSONParser.parseArray(((Collection) null), pNGImageDataEnumerationArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseArray14() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        ArrayList arrayList = new ArrayList();
        
        defaultJSONParser.parseArray(arrayList);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseArray15() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.sp = 0;
        jSONScanner.bp = 0;
        jSONScanner.ch = '2';
        jSONScanner.pos = 0;
        jSONScanner.token = 21;
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultJSONParser.parseArray(((Collection) null));
        
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
    public void testParseArray16() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.sp = 0;
        jSONScanner.bp = 0;
        jSONScanner.ch = '-';
        jSONScanner.pos = 0;
        jSONScanner.token = 21;
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultJSONParser.parseArray(((Collection) null));
        
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
    public void testParseArray17() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.sp = 0;
        jSONScanner.bp = 0;
        jSONScanner.ch = '\u0000';
        jSONScanner.pos = 0;
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
    public void testParseArray18() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.hasSpecial = false;
        jSONScanner.np = 0;
        jSONScanner.sp = 0;
        jSONScanner.bp = 0;
        jSONScanner.ch = '\"';
        jSONScanner.pos = 0;
        jSONScanner.token = 21;
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultJSONParser.parseArray(((Collection) null));
        
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
    public void testParseArray19() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.sp = 0;
        jSONScanner.bp = 0;
        jSONScanner.ch = ',';
        jSONScanner.pos = 0;
        jSONScanner.token = 21;
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultJSONParser.parseArray(((Collection) null));
        
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
    public void testParseArray20() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.sp = 0;
        jSONScanner.bp = 0;
        jSONScanner.ch = '/';
        jSONScanner.pos = 0;
        jSONScanner.token = 21;
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultJSONParser.parseArray(((Collection) null));
        
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
    public void testParseArray21() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.token = 0;
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultJSONParser.parseArray(((Collection) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseArray22() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        ArrayList arrayList = new ArrayList();
        Object object = new Object();
        
        defaultJSONParser.parseArray(null, arrayList, object);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseArray23() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.token = 21;
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultJSONParser.parseArray(null, null, null);
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerToken = getFieldValue(jSONLexer, "token");
        
        assertEquals(20, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseArray24() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONReaderScanner jSONReaderScanner = ((JSONReaderScanner) createInstance("com.alibaba.fastjson.parser.JSONReaderScanner"));
        jSONReaderScanner.token = 0;
        setField(defaultJSONParser, "lexer", jSONReaderScanner);
        
        defaultJSONParser.parseArray(null, null, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseArray25() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        ArrayList arrayList = new ArrayList();
        
        defaultJSONParser.parseArray(((Type) null), arrayList);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseArray26() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.sp = 0;
        jSONScanner.bp = 0;
        jSONScanner.ch = '/';
        jSONScanner.pos = 0;
        jSONScanner.token = 22;
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultJSONParser.parseArray(((Type) null), ((Collection) null));
        
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
    public void testParseArray27() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.sp = 0;
        jSONScanner.bp = 0;
        jSONScanner.ch = ',';
        jSONScanner.pos = 0;
        jSONScanner.token = 22;
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultJSONParser.parseArray(((Type) null), ((Collection) null));
        
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
    public void testParseArray28() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.sp = 0;
        jSONScanner.bp = 0;
        jSONScanner.ch = '\u0000';
        jSONScanner.pos = 0;
        jSONScanner.token = 21;
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultJSONParser.parseArray(((Type) null), ((Collection) null));
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerToken = getFieldValue(jSONLexer, "token");
        
        assertEquals(20, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseArray29() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.hasSpecial = false;
        jSONScanner.np = 0;
        jSONScanner.sp = 0;
        jSONScanner.bp = 0;
        jSONScanner.ch = '\"';
        jSONScanner.pos = 0;
        jSONScanner.token = 22;
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultJSONParser.parseArray(((Type) null), ((Collection) null));
        
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
    public void testParseArray30() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        java.lang.reflect.Type[] typeArray = new java.lang.reflect.Type[0];
        
        defaultJSONParser.parseArray(typeArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testParseArray31() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.sp = 0;
        jSONScanner.bp = 1;
        jSONScanner.ch = '}';
        jSONScanner.token = 8;
        setField(jSONScanner, "len", -2147483645);
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
        
        assertEquals(2, finalDefaultJSONParserLexerBp);
        
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
    public void testParseArray32() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.sp = 0;
        jSONScanner.ch = '\u001A';
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
    public void testParseArray33() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.sp = 0;
        jSONScanner.bp = Integer.MAX_VALUE;
        jSONScanner.ch = '\b';
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
    public void testParseArray34() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.sp = 0;
        jSONScanner.bp = 0;
        jSONScanner.ch = '\u0000';
        jSONScanner.pos = 0;
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
    
    @Test(timeout = 10000)
    public void testParseArray35() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.sp = 0;
        jSONScanner.bp = 0;
        jSONScanner.ch = '@';
        jSONScanner.pos = 0;
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
    public void testParseArray36() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONReaderScanner jSONReaderScanner = ((JSONReaderScanner) createInstance("com.alibaba.fastjson.parser.JSONReaderScanner"));
        jSONReaderScanner.sp = 0;
        jSONReaderScanner.bp = 0;
        jSONReaderScanner.ch = ' ';
        jSONReaderScanner.token = 8;
        setField(jSONReaderScanner, "bufLength", 0);
        setField(defaultJSONParser, "lexer", jSONReaderScanner);
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
        
        Type finalTypeArray0 = typeArray[0];
        Type finalTypeArray1 = typeArray[1];
        Type finalTypeArray2 = typeArray[2];
        Type finalTypeArray3 = typeArray[3];
        Type finalTypeArray4 = typeArray[4];
        Type finalTypeArray5 = typeArray[5];
        Type finalTypeArray6 = typeArray[6];
        Type finalTypeArray7 = typeArray[7];
        Type finalTypeArray8 = typeArray[8];
        
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
    public void testParseArray37() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.sp = 0;
        jSONScanner.bp = 0;
        jSONScanner.ch = '2';
        jSONScanner.pos = 0;
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
        Object finalDefaultJSONParserLexerSp = getFieldValue(jSONLexer, "sp");
        JSONLexer jSONLexer1 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerBp = getFieldValue(jSONLexer1, "bp");
        JSONLexer jSONLexer2 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerCh = getFieldValue(jSONLexer2, "ch");
        JSONLexer jSONLexer3 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerToken = getFieldValue(jSONLexer3, "token");
        
        Type finalTypeArray0 = typeArray[0];
        Type finalTypeArray1 = typeArray[1];
        Type finalTypeArray2 = typeArray[2];
        Type finalTypeArray3 = typeArray[3];
        Type finalTypeArray4 = typeArray[4];
        Type finalTypeArray5 = typeArray[5];
        Type finalTypeArray6 = typeArray[6];
        Type finalTypeArray7 = typeArray[7];
        Type finalTypeArray8 = typeArray[8];
        
        assertEquals(1, finalDefaultJSONParserLexerSp);
        
        assertEquals(1, finalDefaultJSONParserLexerBp);
        
        assertEquals('\u001A', finalDefaultJSONParserLexerCh);
        
        assertEquals(2, finalDefaultJSONParserLexerToken);
        
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
    public void testParseArray38() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.sp = 0;
        jSONScanner.bp = 0;
        jSONScanner.ch = ']';
        jSONScanner.token = 8;
        setField(jSONScanner, "len", 0);
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
    public void testParseArray39() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.sp = 0;
        jSONScanner.bp = 0;
        jSONScanner.ch = '-';
        jSONScanner.pos = 0;
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
        Object finalDefaultJSONParserLexerSp = getFieldValue(jSONLexer, "sp");
        JSONLexer jSONLexer1 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerBp = getFieldValue(jSONLexer1, "bp");
        JSONLexer jSONLexer2 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerCh = getFieldValue(jSONLexer2, "ch");
        JSONLexer jSONLexer3 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerToken = getFieldValue(jSONLexer3, "token");
        
        Type finalTypeArray0 = typeArray[0];
        Type finalTypeArray1 = typeArray[1];
        Type finalTypeArray2 = typeArray[2];
        Type finalTypeArray3 = typeArray[3];
        Type finalTypeArray4 = typeArray[4];
        Type finalTypeArray5 = typeArray[5];
        Type finalTypeArray6 = typeArray[6];
        Type finalTypeArray7 = typeArray[7];
        Type finalTypeArray8 = typeArray[8];
        
        assertEquals(1, finalDefaultJSONParserLexerSp);
        
        assertEquals(1, finalDefaultJSONParserLexerBp);
        
        assertEquals('\u001A', finalDefaultJSONParserLexerCh);
        
        assertEquals(2, finalDefaultJSONParserLexerToken);
        
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
    public void testParseArray40() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.sp = 0;
        jSONScanner.bp = 0;
        jSONScanner.ch = '/';
        jSONScanner.pos = 0;
        jSONScanner.token = 8;
        setField(jSONScanner, "len", 0);
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
        Object finalDefaultJSONParserLexerCh = getFieldValue(jSONLexer1, "ch");
        
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
    public void testParseArray41() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.hasSpecial = false;
        jSONScanner.np = 0;
        jSONScanner.sp = 0;
        jSONScanner.bp = 0;
        jSONScanner.ch = '\"';
        jSONScanner.pos = 0;
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
        
        defaultJSONParser.parseArray(typeArray);
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerBp = getFieldValue(jSONLexer, "bp");
        JSONLexer jSONLexer1 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerCh = getFieldValue(jSONLexer1, "ch");
        
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
    public void testParseArray42() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONReaderScanner jSONReaderScanner = ((JSONReaderScanner) createInstance("com.alibaba.fastjson.parser.JSONReaderScanner"));
        jSONReaderScanner.token = 0;
        setField(defaultJSONParser, "lexer", jSONReaderScanner);
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
        
        Type finalTypeArray0 = typeArray[0];
        Type finalTypeArray1 = typeArray[1];
        Type finalTypeArray2 = typeArray[2];
        Type finalTypeArray3 = typeArray[3];
        Type finalTypeArray4 = typeArray[4];
        Type finalTypeArray5 = typeArray[5];
        Type finalTypeArray6 = typeArray[6];
        Type finalTypeArray7 = typeArray[7];
        Type finalTypeArray8 = typeArray[8];
        
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
    public void testParseArray43() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.sp = 0;
        jSONScanner.ch = '\f';
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
    public void testPopContext1() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        
        defaultJSONParser.popContext();
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
        jSONScanner.token = 13;
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultJSONParser.parseKey();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseKey3() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.sp = 0;
        jSONScanner.bp = 0;
        jSONScanner.ch = '/';
        jSONScanner.pos = 0;
        jSONScanner.token = 7;
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultJSONParser.parseKey();
        
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
    public void testParseKey4() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.hasSpecial = true;
        jSONScanner.sp = 0;
        setField(jSONScanner, "sbuf", null);
        jSONScanner.token = 18;
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultJSONParser.parseKey();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testParseKey5() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.sp = 0;
        jSONScanner.bp = 0;
        jSONScanner.ch = '\u0000';
        jSONScanner.pos = 0;
        jSONScanner.token = 8;
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Object actual = defaultJSONParser.parseKey();
        
        assertNull(actual);
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerToken = getFieldValue(jSONLexer, "token");
        
        assertEquals(20, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testParseKey6() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.sp = 0;
        jSONScanner.bp = 0;
        jSONScanner.ch = '\u0000';
        jSONScanner.pos = 0;
        jSONScanner.token = 7;
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Object actual = defaultJSONParser.parseKey();
        
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
    public void testParseKey7() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.sp = 0;
        jSONScanner.bp = 0;
        jSONScanner.ch = '\u0000';
        jSONScanner.pos = 0;
        jSONScanner.token = 21;
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultJSONParser.parseKey();
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerToken = getFieldValue(jSONLexer, "token");
        
        assertEquals(20, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseKey8() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.sp = 0;
        jSONScanner.bp = 0;
        jSONScanner.token = 22;
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultJSONParser.parseKey();
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerToken = getFieldValue(jSONLexer, "token");
        
        assertEquals(20, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseKey9() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.sp = 0;
        jSONScanner.token = 9;
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultJSONParser.parseKey();
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerToken = getFieldValue(jSONLexer, "token");
        
        assertEquals(20, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseKey10() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.hasSpecial = false;
        jSONScanner.np = 0;
        jSONScanner.sp = 0;
        jSONScanner.token = 18;
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultJSONParser.parseKey();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testParseKey11() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.sp = 0;
        jSONScanner.bp = 0;
        jSONScanner.pos = 0;
        jSONScanner.token = 23;
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Object actual = defaultJSONParser.parseKey();
        
        assertNull(actual);
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerToken = getFieldValue(jSONLexer, "token");
        
        assertEquals(20, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseKey12() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.token = 14;
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultJSONParser.parseKey();
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerToken = getFieldValue(jSONLexer, "token");
        
        assertEquals(20, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseKey13() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.np = 0;
        jSONScanner.token = 2;
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultJSONParser.parseKey();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseKey14() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.hasSpecial = false;
        jSONScanner.np = 0;
        jSONScanner.token = 4;
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultJSONParser.parseKey();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testParseKey15() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.sp = 0;
        jSONScanner.bp = 0;
        jSONScanner.token = 6;
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Object actual = defaultJSONParser.parseKey();
        
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
    public void testParseKey16() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.np = 0;
        jSONScanner.token = 26;
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Object actual = defaultJSONParser.parseKey();
        
        byte[] expected = new byte[0];
        assertArrayEquals(expected, ((byte[]) actual));
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerToken = getFieldValue(jSONLexer, "token");
        
        assertEquals(20, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseKey17() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.token = 3;
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultJSONParser.parseKey();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseKey18() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.sp = 0;
        jSONScanner.bp = 0;
        jSONScanner.ch = ',';
        jSONScanner.pos = 0;
        jSONScanner.token = 21;
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultJSONParser.parseKey();
        
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
    public void testParseKey19() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.sp = 0;
        jSONScanner.bp = 0;
        jSONScanner.ch = '\"';
        jSONScanner.pos = 0;
        jSONScanner.token = 21;
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultJSONParser.parseKey();
        
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
    public void testParseKey20() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.token = 20;
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Object actual = defaultJSONParser.parseKey();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseObject1() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        Object object = new Object();
        
        defaultJSONParser.parseObject(object);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseObject2() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        
        defaultJSONParser.parseObject(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseObject3() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        setField(defaultJSONParser, "config", null);
        java.lang.Object[] forEachOrderedTaskArray = createArray("java.util.stream.ForEachOps$ForEachOrderedTask", 0);
        
        defaultJSONParser.parseObject(forEachOrderedTaskArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseObject4() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.hasSpecial = false;
        jSONScanner.np = 0;
        jSONScanner.token = 4;
        setField(defaultJSONParser, "lexer", jSONScanner);
        Class class1 = Object.class;
        
        defaultJSONParser.parseObject(class1);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseObject5() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        
        defaultJSONParser.parseObject(((Type) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseObject6() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.np = 0;
        jSONScanner.sp = 0;
        jSONScanner.token = 4;
        String string = new String("");
        setField(jSONScanner, "text", string);
        setField(defaultJSONParser, "lexer", jSONScanner);
        Class class1 = Object.class;
        
        defaultJSONParser.parseObject(class1);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testParseObject7() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.sp = 0;
        jSONScanner.bp = 0;
        jSONScanner.ch = '\u0000';
        jSONScanner.pos = 0;
        jSONScanner.token = 8;
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Object actual = defaultJSONParser.parseObject(((Type) null));
        
        assertNull(actual);
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerToken = getFieldValue(jSONLexer, "token");
        
        assertEquals(20, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseObject8() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.sp = 0;
        jSONScanner.bp = 0;
        jSONScanner.ch = '\"';
        jSONScanner.pos = 0;
        jSONScanner.token = 8;
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultJSONParser.parseObject(((Type) null));
        
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
    public void testParseObject9() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.sp = 0;
        jSONScanner.bp = 0;
        jSONScanner.ch = '/';
        jSONScanner.pos = 0;
        jSONScanner.token = 8;
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultJSONParser.parseObject(((Type) null));
        
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
    public void testParseObject10() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        
        defaultJSONParser.parseObject(((Map) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testParseObject11() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.sp = 0;
        jSONScanner.bp = 0;
        jSONScanner.ch = '2';
        jSONScanner.pos = 0;
        jSONScanner.token = 8;
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Object actual = defaultJSONParser.parseObject(((Map) null));
        
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
    public void testParseObject12() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.sp = 0;
        jSONScanner.bp = 0;
        jSONScanner.ch = '/';
        jSONScanner.pos = 0;
        jSONScanner.token = 8;
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultJSONParser.parseObject(((Map) null));
        
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
    public void testParseObject13() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.sp = 0;
        jSONScanner.bp = 0;
        jSONScanner.ch = ',';
        jSONScanner.pos = 0;
        jSONScanner.token = 8;
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Object actual = defaultJSONParser.parseObject(((Map) null));
        
        assertNull(actual);
        
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
    public void testParseObject14() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.sp = 0;
        jSONScanner.bp = 0;
        jSONScanner.ch = '@';
        jSONScanner.pos = 0;
        jSONScanner.token = 8;
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Object actual = defaultJSONParser.parseObject(((Map) null));
        
        assertNull(actual);
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerToken = getFieldValue(jSONLexer, "token");
        
        assertEquals(20, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseObject15() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.hasSpecial = false;
        jSONScanner.np = 0;
        jSONScanner.sp = 0;
        jSONScanner.bp = 0;
        jSONScanner.ch = '\"';
        jSONScanner.pos = 0;
        jSONScanner.token = 8;
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultJSONParser.parseObject(((Map) null));
        
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
    public void testParseObject16() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.token = 0;
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultJSONParser.parseObject(((Map) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseObject17() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        
        defaultJSONParser.parseObject();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseObject18() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        Object object = new Object();
        
        defaultJSONParser.parseObject(((Map) null), object);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testParseObject19() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.sp = 0;
        jSONScanner.bp = 0;
        jSONScanner.ch = '\u0000';
        jSONScanner.pos = 0;
        jSONScanner.token = 8;
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Object actual = defaultJSONParser.parseObject(((Map) null), null);
        
        assertNull(actual);
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerToken = getFieldValue(jSONLexer, "token");
        
        assertEquals(20, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseObject20() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.sp = 0;
        jSONScanner.bp = 0;
        jSONScanner.ch = '/';
        jSONScanner.pos = 0;
        jSONScanner.token = 8;
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultJSONParser.parseObject(((Map) null), null);
        
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
    public void testParseObject21() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONReaderScanner jSONReaderScanner = ((JSONReaderScanner) createInstance("com.alibaba.fastjson.parser.JSONReaderScanner"));
        jSONReaderScanner.token = 0;
        setField(defaultJSONParser, "lexer", jSONReaderScanner);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        
        defaultJSONParser.parseObject(linkedHashMap, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testSetContext1() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        ParseContext parseContext = ((ParseContext) createInstance("com.alibaba.fastjson.parser.ParseContext"));
        Object object = new Object();
        Object object1 = new Object();
        
        defaultJSONParser.setContext(parseContext, object, object1);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetContext2() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONReaderScanner jSONReaderScanner = ((JSONReaderScanner) createInstance("com.alibaba.fastjson.parser.JSONReaderScanner"));
        setField(defaultJSONParser, "lexer", jSONReaderScanner);
        
        ParseContext actual = defaultJSONParser.setContext(null, null, null);
        
        ParseContext expected = ((ParseContext) createInstance("com.alibaba.fastjson.parser.ParseContext"));
        expected.object = null;
        setField(expected, "parent", null);
        setField(expected, "fieldName", null);
        setField(expected, "type", null);
        setField(expected, "path", null);
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testSetContext3() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        Object object = new Object();
        Object object1 = new Object();
        
        defaultJSONParser.setContext(object, object1);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetContext4() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONReaderScanner jSONReaderScanner = ((JSONReaderScanner) createInstance("com.alibaba.fastjson.parser.JSONReaderScanner"));
        setField(defaultJSONParser, "lexer", jSONReaderScanner);
        
        ParseContext actual = defaultJSONParser.setContext(null, null);
        
        ParseContext expected = ((ParseContext) createInstance("com.alibaba.fastjson.parser.ParseContext"));
        expected.object = null;
        setField(expected, "parent", null);
        setField(expected, "fieldName", null);
        setField(expected, "type", null);
        setField(expected, "path", null);
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testSetContext5() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        ParseContext parseContext = ((ParseContext) createInstance("com.alibaba.fastjson.parser.ParseContext"));
        
        defaultJSONParser.setContext(parseContext);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetContext6() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONReaderScanner jSONReaderScanner = ((JSONReaderScanner) createInstance("com.alibaba.fastjson.parser.JSONReaderScanner"));
        setField(defaultJSONParser, "lexer", jSONReaderScanner);
        
        defaultJSONParser.setContext(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIsEnabled1() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONReaderScanner jSONReaderScanner = ((JSONReaderScanner) createInstance("com.alibaba.fastjson.parser.JSONReaderScanner"));
        jSONReaderScanner.features = 0;
        setField(defaultJSONParser, "lexer", jSONReaderScanner);
        Feature feature = Feature.AutoCloseSource;
        
        boolean actual = defaultJSONParser.isEnabled(feature);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIsEnabled2() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.features = -1;
        setField(defaultJSONParser, "lexer", jSONScanner);
        Feature feature = Feature.AutoCloseSource;
        
        boolean actual = defaultJSONParser.isEnabled(feature);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testConfig1() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.features = 0;
        setField(defaultJSONParser, "lexer", jSONScanner);
        Feature feature = Feature.AutoCloseSource;
        
        defaultJSONParser.config(feature, true);
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerFeatures = getFieldValue(jSONLexer, "features");
        
        assertEquals(1, finalDefaultJSONParserLexerFeatures);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetConfig1() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        ParserConfig parserConfig = new ParserConfig();
        
        defaultJSONParser.setConfig(parserConfig);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetDateFormat1() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        String string = new String();
        
        defaultJSONParser.setDateFormat(string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetDateFormat2() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        setField(defaultJSONParser, "dateFormat", null);
        setField(defaultJSONParser, "dateFormatPattern", null);
        
        defaultJSONParser.setDateFormat(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetDateFormat1() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        
        defaultJSONParser.getDateFormat();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetDateFormat2() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        SimpleDateFormat simpleDateFormat = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        setField(defaultJSONParser, "dateFormat", simpleDateFormat);
        
        DateFormat actual = defaultJSONParser.getDateFormat();
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(simpleDateFormat, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetDateFormat3() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "locale", null);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(defaultJSONParser, "dateFormat", null);
        String string = new String("");
        setField(defaultJSONParser, "dateFormatPattern", string);
        
        defaultJSONParser.getDateFormat();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetConfig1() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        
        ParserConfig actual = defaultJSONParser.getConfig();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetConfig2() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        setField(defaultJSONParser, "config", null);
        
        ParserConfig actual = defaultJSONParser.getConfig();
        
        assertNull(actual);
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
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testAddContext2() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        setField(defaultJSONParser, "contextArrayIndex", Integer.MIN_VALUE);
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
        
        Class defaultJSONParserClazz = Class.forName("com.alibaba.fastjson.parser.DefaultJSONParser");
        Class parseContextType = Class.forName("com.alibaba.fastjson.parser.ParseContext");
        Method addContextMethod = defaultJSONParserClazz.getDeclaredMethod("addContext", parseContextType);
        addContextMethod.setAccessible(true);
        java.lang.Object[] addContextMethodArguments = new java.lang.Object[1];
        addContextMethodArguments[0] = null;
        try {
            addContextMethod.invoke(defaultJSONParser, addContextMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        Object finalDefaultJSONParserContextArrayIndex = getFieldValue(defaultJSONParser, "contextArrayIndex");
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
        
        assertEquals(-2147483647, finalDefaultJSONParserContextArrayIndex);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testAddContext3() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        setField(defaultJSONParser, "contextArrayIndex", 0);
        setField(defaultJSONParser, "contextArray", null);
        
        Class defaultJSONParserClazz = Class.forName("com.alibaba.fastjson.parser.DefaultJSONParser");
        Class parseContextType = Class.forName("com.alibaba.fastjson.parser.ParseContext");
        Method addContextMethod = defaultJSONParserClazz.getDeclaredMethod("addContext", parseContextType);
        addContextMethod.setAccessible(true);
        java.lang.Object[] addContextMethodArguments = new java.lang.Object[1];
        addContextMethodArguments[0] = null;
        addContextMethod.invoke(defaultJSONParser, addContextMethodArguments);
        
        Object finalDefaultJSONParserContextArrayIndex = getFieldValue(defaultJSONParser, "contextArrayIndex");
        Object finalDefaultJSONParserContextArray = getFieldValue(defaultJSONParser, "contextArray");
        
        assertEquals(1, finalDefaultJSONParserContextArrayIndex);
        
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testAddContext4() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        setField(defaultJSONParser, "contextArrayIndex", 1073741824);
        com.alibaba.fastjson.parser.ParseContext[] parseContextArray = new com.alibaba.fastjson.parser.ParseContext[6];
        setField(defaultJSONParser, "contextArray", parseContextArray);
        ParseContext parseContext = ((ParseContext) createInstance("com.alibaba.fastjson.parser.ParseContext"));
        
        Class defaultJSONParserClazz = Class.forName("com.alibaba.fastjson.parser.DefaultJSONParser");
        Class parseContextType = Class.forName("com.alibaba.fastjson.parser.ParseContext");
        Method addContextMethod = defaultJSONParserClazz.getDeclaredMethod("addContext", parseContextType);
        addContextMethod.setAccessible(true);
        java.lang.Object[] addContextMethodArguments = new java.lang.Object[1];
        addContextMethodArguments[0] = parseContext;
        try {
            addContextMethod.invoke(defaultJSONParser, addContextMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        Object finalDefaultJSONParserContextArrayIndex = getFieldValue(defaultJSONParser, "contextArrayIndex");
        Object finalDefaultJSONParserContextArray = getFieldValue(defaultJSONParser, "contextArray");
        
        assertEquals(1073741825, finalDefaultJSONParserContextArrayIndex);
        
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
        jSONScanner.ch = '\u0000';
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultJSONParser.acceptType(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testAcceptType3() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.sp = 0;
        jSONScanner.bp = -1;
        jSONScanner.ch = '\t';
        setField(jSONScanner, "len", 1);
        String string = new String("\u0000");
        setField(jSONScanner, "text", string);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultJSONParser.acceptType(null);
        
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
    public void testAcceptType4() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.sp = 0;
        jSONScanner.bp = 2147483646;
        jSONScanner.ch = ':';
        jSONScanner.pos = 0;
        setField(jSONScanner, "len", Integer.MIN_VALUE);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultJSONParser.acceptType(null);
        
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
    public void testAcceptType5() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONReaderScanner jSONReaderScanner = ((JSONReaderScanner) createInstance("com.alibaba.fastjson.parser.JSONReaderScanner"));
        jSONReaderScanner.np = 0;
        jSONReaderScanner.sp = 0;
        jSONReaderScanner.bp = 1;
        jSONReaderScanner.ch = ' ';
        setField(jSONReaderScanner, "bufLength", -2147483645);
        char[] charArray = new char[9];
        setField(jSONReaderScanner, "buf", charArray);
        setField(jSONReaderScanner, "reader", null);
        setField(defaultJSONParser, "lexer", jSONReaderScanner);
        
        defaultJSONParser.acceptType(null);
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerNp = getFieldValue(jSONLexer, "np");
        JSONLexer jSONLexer1 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerBp = getFieldValue(jSONLexer1, "bp");
        
        assertEquals(-1, finalDefaultJSONParserLexerNp);
        
        assertEquals(0, finalDefaultJSONParserLexerBp);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testAcceptType6() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.sp = 0;
        jSONScanner.bp = 0;
        jSONScanner.ch = '\n';
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
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testAcceptType7() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONReaderScanner jSONReaderScanner = ((JSONReaderScanner) createInstance("com.alibaba.fastjson.parser.JSONReaderScanner"));
        jSONReaderScanner.sp = 0;
        jSONReaderScanner.bp = 0;
        jSONReaderScanner.ch = ' ';
        setField(jSONReaderScanner, "bufLength", -1);
        setField(defaultJSONParser, "lexer", jSONReaderScanner);
        
        defaultJSONParser.acceptType(null);
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerBp = getFieldValue(jSONLexer, "bp");
        
        assertEquals(34952, finalDefaultJSONParserLexerBp);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testAcceptType8() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONReaderScanner jSONReaderScanner = ((JSONReaderScanner) createInstance("com.alibaba.fastjson.parser.JSONReaderScanner"));
        jSONReaderScanner.sp = 0;
        jSONReaderScanner.bp = 7;
        jSONReaderScanner.ch = ' ';
        setField(jSONReaderScanner, "bufLength", 9);
        char[] charArray = new char[9];
        setField(jSONReaderScanner, "buf", charArray);
        setField(defaultJSONParser, "lexer", jSONReaderScanner);
        
        defaultJSONParser.acceptType(null);
        
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
    public void testAcceptType9() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.sp = 0;
        jSONScanner.bp = 0;
        jSONScanner.ch = ':';
        jSONScanner.pos = 0;
        setField(jSONScanner, "len", 0);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultJSONParser.acceptType(null);
        
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
        ArrayList arrayList = new ArrayList();
        setField(defaultJSONParser, "resolveTaskList", arrayList);
        
        defaultJSONParser.checkListResolve(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCheckListResolve4() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        defaultJSONParser.resolveStatus = 1;
        ArrayList arrayList = ((ArrayList) createInstance("java.util.ArrayList"));
        
        defaultJSONParser.checkListResolve(arrayList);
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
        java.lang.Object[] computedDayOfFieldArray = createArray("java.time.temporal.WeekFields$ComputedDayOfField", 0);
        
        defaultJSONParser.checkMapResolve(null, computedDayOfFieldArray);
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
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        setField(defaultJSONParser, "resolveTaskList", arrayList);
        
        defaultJSONParser.addResolveTask(null);
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
    
    @Test(timeout = 10000)
    public void testGetLastResolveTask3() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        setField(defaultJSONParser, "resolveTaskList", arrayList);
        
        DefaultJSONParser.ResolveTask actual = defaultJSONParser.getLastResolveTask();
        
        assertNull(actual);
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
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseArrayWithType3() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.token = 0;
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultJSONParser.parseArrayWithType(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseArrayWithType4() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONReaderScanner jSONReaderScanner = ((JSONReaderScanner) createInstance("com.alibaba.fastjson.parser.JSONReaderScanner"));
        jSONReaderScanner.token = 0;
        setField(defaultJSONParser, "lexer", jSONReaderScanner);
        ParameterizedTypeImpl parameterizedTypeImpl = ((ParameterizedTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl"));
        java.lang.reflect.Type[] typeArray = new java.lang.reflect.Type[0];
        setField(parameterizedTypeImpl, "actualTypeArguments", typeArray);
        
        defaultJSONParser.parseArrayWithType(parameterizedTypeImpl);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseArrayWithType5() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONReaderScanner jSONReaderScanner = ((JSONReaderScanner) createInstance("com.alibaba.fastjson.parser.JSONReaderScanner"));
        jSONReaderScanner.token = 0;
        setField(defaultJSONParser, "lexer", jSONReaderScanner);
        ParameterizedTypeImpl parameterizedTypeImpl = ((ParameterizedTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl"));
        java.lang.reflect.Type[] typeArray = new java.lang.reflect.Type[1];
        setField(parameterizedTypeImpl, "actualTypeArguments", typeArray);
        
        Object parameterizedTypeImplActualTypeArguments = getFieldValue(parameterizedTypeImpl, "actualTypeArguments");
        Object initialParameterizedTypeImplActualTypeArguments0 = get(parameterizedTypeImplActualTypeArguments, 0);
        
        defaultJSONParser.parseArrayWithType(parameterizedTypeImpl);
        
        Object parameterizedTypeImplActualTypeArguments1 = getFieldValue(parameterizedTypeImpl, "actualTypeArguments");
        Object finalParameterizedTypeImplActualTypeArguments0 = get(parameterizedTypeImplActualTypeArguments1, 0);
        
        assertNull(finalParameterizedTypeImplActualTypeArguments0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseArrayWithType6() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.hasSpecial = false;
        jSONScanner.np = 0;
        jSONScanner.sp = 0;
        jSONScanner.bp = 0;
        jSONScanner.ch = 'u';
        jSONScanner.pos = 0;
        jSONScanner.token = 8;
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultJSONParser.parseArrayWithType(null);
        
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
    public void testParseArrayWithType7() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.sp = 0;
        jSONScanner.bp = 0;
        jSONScanner.ch = ']';
        jSONScanner.pos = 0;
        jSONScanner.token = 8;
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Object actual = defaultJSONParser.parseArrayWithType(null);
        
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
    public void testParseArrayWithType8() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.token = 0;
        setField(defaultJSONParser, "lexer", jSONScanner);
        ParameterizedTypeImpl parameterizedTypeImpl = ((ParameterizedTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl"));
        java.lang.reflect.Type[] typeArray = new java.lang.reflect.Type[1];
        Class class1 = Object.class;
        typeArray[0] = ((Type) class1);
        setField(parameterizedTypeImpl, "actualTypeArguments", typeArray);
        
        defaultJSONParser.parseArrayWithType(parameterizedTypeImpl);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseArrayWithType9() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.sp = 0;
        jSONScanner.bp = Integer.MAX_VALUE;
        jSONScanner.ch = ':';
        jSONScanner.pos = 0;
        jSONScanner.token = 8;
        setField(jSONScanner, "len", 1);
        String string = new String("");
        setField(jSONScanner, "text", string);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultJSONParser.parseArrayWithType(null);
        
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
    public void testParseArrayWithType10() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.sp = 0;
        jSONScanner.bp = Integer.MAX_VALUE;
        jSONScanner.ch = '.';
        jSONScanner.pos = 0;
        jSONScanner.token = 8;
        setField(jSONScanner, "len", 1);
        String string = new String("");
        setField(jSONScanner, "text", string);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultJSONParser.parseArrayWithType(null);
        
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
    public void testParseArrayWithType11() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.sp = 0;
        jSONScanner.bp = 0;
        jSONScanner.ch = ' ';
        jSONScanner.pos = 0;
        jSONScanner.token = 8;
        setField(jSONScanner, "len", 0);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultJSONParser.parseArrayWithType(null);
        
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
    public void testParseArrayWithType12() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.np = 0;
        jSONScanner.sp = 0;
        jSONScanner.bp = 0;
        jSONScanner.ch = '2';
        jSONScanner.pos = 0;
        jSONScanner.token = 8;
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Object actual = defaultJSONParser.parseArrayWithType(null);
        
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
    public void testParseArrayWithType13() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.token = 0;
        setField(defaultJSONParser, "lexer", jSONScanner);
        ParameterizedTypeImpl parameterizedTypeImpl = ((ParameterizedTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl"));
        java.lang.reflect.Type[] typeArray = new java.lang.reflect.Type[1];
        WildcardTypeImpl wildcardTypeImpl = ((WildcardTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.WildcardTypeImpl"));
        java.lang.reflect.Type[] typeArray1 = new java.lang.reflect.Type[9];
        setField(wildcardTypeImpl, "upperBounds", typeArray1);
        typeArray[0] = ((Type) wildcardTypeImpl);
        setField(parameterizedTypeImpl, "actualTypeArguments", typeArray);
        
        Object parameterizedTypeImplActualTypeArguments = getFieldValue(parameterizedTypeImpl, "actualTypeArguments");
        Object parameterizedTypeImplActualTypeArgumentsActualTypeArguments0 = get(parameterizedTypeImplActualTypeArguments, 0);
        Object parameterizedTypeImplActualTypeArgumentsActualTypeArguments0ActualTypeArguments0UpperBounds = getFieldValue(parameterizedTypeImplActualTypeArgumentsActualTypeArguments0, "upperBounds");
        Object initialParameterizedTypeImplActualTypeArguments0UpperBounds0 = get(parameterizedTypeImplActualTypeArgumentsActualTypeArguments0ActualTypeArguments0UpperBounds, 0);
        Object parameterizedTypeImplActualTypeArguments1 = getFieldValue(parameterizedTypeImpl, "actualTypeArguments");
        Object parameterizedTypeImplActualTypeArguments1ActualTypeArguments0 = get(parameterizedTypeImplActualTypeArguments1, 0);
        Object parameterizedTypeImplActualTypeArguments1ActualTypeArguments0ActualTypeArguments0UpperBounds = getFieldValue(parameterizedTypeImplActualTypeArguments1ActualTypeArguments0, "upperBounds");
        Object initialParameterizedTypeImplActualTypeArguments0UpperBounds1 = get(parameterizedTypeImplActualTypeArguments1ActualTypeArguments0ActualTypeArguments0UpperBounds, 1);
        Object parameterizedTypeImplActualTypeArguments2 = getFieldValue(parameterizedTypeImpl, "actualTypeArguments");
        Object parameterizedTypeImplActualTypeArguments2ActualTypeArguments0 = get(parameterizedTypeImplActualTypeArguments2, 0);
        Object parameterizedTypeImplActualTypeArguments2ActualTypeArguments0ActualTypeArguments0UpperBounds = getFieldValue(parameterizedTypeImplActualTypeArguments2ActualTypeArguments0, "upperBounds");
        Object initialParameterizedTypeImplActualTypeArguments0UpperBounds2 = get(parameterizedTypeImplActualTypeArguments2ActualTypeArguments0ActualTypeArguments0UpperBounds, 2);
        Object parameterizedTypeImplActualTypeArguments3 = getFieldValue(parameterizedTypeImpl, "actualTypeArguments");
        Object parameterizedTypeImplActualTypeArguments3ActualTypeArguments0 = get(parameterizedTypeImplActualTypeArguments3, 0);
        Object parameterizedTypeImplActualTypeArguments3ActualTypeArguments0ActualTypeArguments0UpperBounds = getFieldValue(parameterizedTypeImplActualTypeArguments3ActualTypeArguments0, "upperBounds");
        Object initialParameterizedTypeImplActualTypeArguments0UpperBounds3 = get(parameterizedTypeImplActualTypeArguments3ActualTypeArguments0ActualTypeArguments0UpperBounds, 3);
        Object parameterizedTypeImplActualTypeArguments4 = getFieldValue(parameterizedTypeImpl, "actualTypeArguments");
        Object parameterizedTypeImplActualTypeArguments4ActualTypeArguments0 = get(parameterizedTypeImplActualTypeArguments4, 0);
        Object parameterizedTypeImplActualTypeArguments4ActualTypeArguments0ActualTypeArguments0UpperBounds = getFieldValue(parameterizedTypeImplActualTypeArguments4ActualTypeArguments0, "upperBounds");
        Object initialParameterizedTypeImplActualTypeArguments0UpperBounds4 = get(parameterizedTypeImplActualTypeArguments4ActualTypeArguments0ActualTypeArguments0UpperBounds, 4);
        Object parameterizedTypeImplActualTypeArguments5 = getFieldValue(parameterizedTypeImpl, "actualTypeArguments");
        Object parameterizedTypeImplActualTypeArguments5ActualTypeArguments0 = get(parameterizedTypeImplActualTypeArguments5, 0);
        Object parameterizedTypeImplActualTypeArguments5ActualTypeArguments0ActualTypeArguments0UpperBounds = getFieldValue(parameterizedTypeImplActualTypeArguments5ActualTypeArguments0, "upperBounds");
        Object initialParameterizedTypeImplActualTypeArguments0UpperBounds5 = get(parameterizedTypeImplActualTypeArguments5ActualTypeArguments0ActualTypeArguments0UpperBounds, 5);
        Object parameterizedTypeImplActualTypeArguments6 = getFieldValue(parameterizedTypeImpl, "actualTypeArguments");
        Object parameterizedTypeImplActualTypeArguments6ActualTypeArguments0 = get(parameterizedTypeImplActualTypeArguments6, 0);
        Object parameterizedTypeImplActualTypeArguments6ActualTypeArguments0ActualTypeArguments0UpperBounds = getFieldValue(parameterizedTypeImplActualTypeArguments6ActualTypeArguments0, "upperBounds");
        Object initialParameterizedTypeImplActualTypeArguments0UpperBounds6 = get(parameterizedTypeImplActualTypeArguments6ActualTypeArguments0ActualTypeArguments0UpperBounds, 6);
        Object parameterizedTypeImplActualTypeArguments7 = getFieldValue(parameterizedTypeImpl, "actualTypeArguments");
        Object parameterizedTypeImplActualTypeArguments7ActualTypeArguments0 = get(parameterizedTypeImplActualTypeArguments7, 0);
        Object parameterizedTypeImplActualTypeArguments7ActualTypeArguments0ActualTypeArguments0UpperBounds = getFieldValue(parameterizedTypeImplActualTypeArguments7ActualTypeArguments0, "upperBounds");
        Object initialParameterizedTypeImplActualTypeArguments0UpperBounds7 = get(parameterizedTypeImplActualTypeArguments7ActualTypeArguments0ActualTypeArguments0UpperBounds, 7);
        Object parameterizedTypeImplActualTypeArguments8 = getFieldValue(parameterizedTypeImpl, "actualTypeArguments");
        Object parameterizedTypeImplActualTypeArguments8ActualTypeArguments0 = get(parameterizedTypeImplActualTypeArguments8, 0);
        Object parameterizedTypeImplActualTypeArguments8ActualTypeArguments0ActualTypeArguments0UpperBounds = getFieldValue(parameterizedTypeImplActualTypeArguments8ActualTypeArguments0, "upperBounds");
        Object initialParameterizedTypeImplActualTypeArguments0UpperBounds8 = get(parameterizedTypeImplActualTypeArguments8ActualTypeArguments0ActualTypeArguments0UpperBounds, 8);
        
        defaultJSONParser.parseArrayWithType(parameterizedTypeImpl);
        
        Object parameterizedTypeImplActualTypeArguments9 = getFieldValue(parameterizedTypeImpl, "actualTypeArguments");
        Object parameterizedTypeImplActualTypeArguments9ActualTypeArguments0 = get(parameterizedTypeImplActualTypeArguments9, 0);
        Object parameterizedTypeImplActualTypeArguments9ActualTypeArguments0ActualTypeArguments0UpperBounds = getFieldValue(parameterizedTypeImplActualTypeArguments9ActualTypeArguments0, "upperBounds");
        Object finalParameterizedTypeImplActualTypeArguments0UpperBounds0 = get(parameterizedTypeImplActualTypeArguments9ActualTypeArguments0ActualTypeArguments0UpperBounds, 0);
        Object parameterizedTypeImplActualTypeArguments10 = getFieldValue(parameterizedTypeImpl, "actualTypeArguments");
        Object parameterizedTypeImplActualTypeArguments10ActualTypeArguments0 = get(parameterizedTypeImplActualTypeArguments10, 0);
        Object parameterizedTypeImplActualTypeArguments10ActualTypeArguments0ActualTypeArguments0UpperBounds = getFieldValue(parameterizedTypeImplActualTypeArguments10ActualTypeArguments0, "upperBounds");
        Object finalParameterizedTypeImplActualTypeArguments0UpperBounds1 = get(parameterizedTypeImplActualTypeArguments10ActualTypeArguments0ActualTypeArguments0UpperBounds, 1);
        Object parameterizedTypeImplActualTypeArguments11 = getFieldValue(parameterizedTypeImpl, "actualTypeArguments");
        Object parameterizedTypeImplActualTypeArguments11ActualTypeArguments0 = get(parameterizedTypeImplActualTypeArguments11, 0);
        Object parameterizedTypeImplActualTypeArguments11ActualTypeArguments0ActualTypeArguments0UpperBounds = getFieldValue(parameterizedTypeImplActualTypeArguments11ActualTypeArguments0, "upperBounds");
        Object finalParameterizedTypeImplActualTypeArguments0UpperBounds2 = get(parameterizedTypeImplActualTypeArguments11ActualTypeArguments0ActualTypeArguments0UpperBounds, 2);
        Object parameterizedTypeImplActualTypeArguments12 = getFieldValue(parameterizedTypeImpl, "actualTypeArguments");
        Object parameterizedTypeImplActualTypeArguments12ActualTypeArguments0 = get(parameterizedTypeImplActualTypeArguments12, 0);
        Object parameterizedTypeImplActualTypeArguments12ActualTypeArguments0ActualTypeArguments0UpperBounds = getFieldValue(parameterizedTypeImplActualTypeArguments12ActualTypeArguments0, "upperBounds");
        Object finalParameterizedTypeImplActualTypeArguments0UpperBounds3 = get(parameterizedTypeImplActualTypeArguments12ActualTypeArguments0ActualTypeArguments0UpperBounds, 3);
        Object parameterizedTypeImplActualTypeArguments13 = getFieldValue(parameterizedTypeImpl, "actualTypeArguments");
        Object parameterizedTypeImplActualTypeArguments13ActualTypeArguments0 = get(parameterizedTypeImplActualTypeArguments13, 0);
        Object parameterizedTypeImplActualTypeArguments13ActualTypeArguments0ActualTypeArguments0UpperBounds = getFieldValue(parameterizedTypeImplActualTypeArguments13ActualTypeArguments0, "upperBounds");
        Object finalParameterizedTypeImplActualTypeArguments0UpperBounds4 = get(parameterizedTypeImplActualTypeArguments13ActualTypeArguments0ActualTypeArguments0UpperBounds, 4);
        Object parameterizedTypeImplActualTypeArguments14 = getFieldValue(parameterizedTypeImpl, "actualTypeArguments");
        Object parameterizedTypeImplActualTypeArguments14ActualTypeArguments0 = get(parameterizedTypeImplActualTypeArguments14, 0);
        Object parameterizedTypeImplActualTypeArguments14ActualTypeArguments0ActualTypeArguments0UpperBounds = getFieldValue(parameterizedTypeImplActualTypeArguments14ActualTypeArguments0, "upperBounds");
        Object finalParameterizedTypeImplActualTypeArguments0UpperBounds5 = get(parameterizedTypeImplActualTypeArguments14ActualTypeArguments0ActualTypeArguments0UpperBounds, 5);
        Object parameterizedTypeImplActualTypeArguments15 = getFieldValue(parameterizedTypeImpl, "actualTypeArguments");
        Object parameterizedTypeImplActualTypeArguments15ActualTypeArguments0 = get(parameterizedTypeImplActualTypeArguments15, 0);
        Object parameterizedTypeImplActualTypeArguments15ActualTypeArguments0ActualTypeArguments0UpperBounds = getFieldValue(parameterizedTypeImplActualTypeArguments15ActualTypeArguments0, "upperBounds");
        Object finalParameterizedTypeImplActualTypeArguments0UpperBounds6 = get(parameterizedTypeImplActualTypeArguments15ActualTypeArguments0ActualTypeArguments0UpperBounds, 6);
        Object parameterizedTypeImplActualTypeArguments16 = getFieldValue(parameterizedTypeImpl, "actualTypeArguments");
        Object parameterizedTypeImplActualTypeArguments16ActualTypeArguments0 = get(parameterizedTypeImplActualTypeArguments16, 0);
        Object parameterizedTypeImplActualTypeArguments16ActualTypeArguments0ActualTypeArguments0UpperBounds = getFieldValue(parameterizedTypeImplActualTypeArguments16ActualTypeArguments0, "upperBounds");
        Object finalParameterizedTypeImplActualTypeArguments0UpperBounds7 = get(parameterizedTypeImplActualTypeArguments16ActualTypeArguments0ActualTypeArguments0UpperBounds, 7);
        Object parameterizedTypeImplActualTypeArguments17 = getFieldValue(parameterizedTypeImpl, "actualTypeArguments");
        Object parameterizedTypeImplActualTypeArguments17ActualTypeArguments0 = get(parameterizedTypeImplActualTypeArguments17, 0);
        Object parameterizedTypeImplActualTypeArguments17ActualTypeArguments0ActualTypeArguments0UpperBounds = getFieldValue(parameterizedTypeImplActualTypeArguments17ActualTypeArguments0, "upperBounds");
        Object finalParameterizedTypeImplActualTypeArguments0UpperBounds8 = get(parameterizedTypeImplActualTypeArguments17ActualTypeArguments0ActualTypeArguments0UpperBounds, 8);
        
        assertNull(finalParameterizedTypeImplActualTypeArguments0UpperBounds0);
        
        assertNull(finalParameterizedTypeImplActualTypeArguments0UpperBounds1);
        
        assertNull(finalParameterizedTypeImplActualTypeArguments0UpperBounds2);
        
        assertNull(finalParameterizedTypeImplActualTypeArguments0UpperBounds3);
        
        assertNull(finalParameterizedTypeImplActualTypeArguments0UpperBounds4);
        
        assertNull(finalParameterizedTypeImplActualTypeArguments0UpperBounds5);
        
        assertNull(finalParameterizedTypeImplActualTypeArguments0UpperBounds6);
        
        assertNull(finalParameterizedTypeImplActualTypeArguments0UpperBounds7);
        
        assertNull(finalParameterizedTypeImplActualTypeArguments0UpperBounds8);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseArrayWithType14() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.sp = 0;
        jSONScanner.bp = Integer.MAX_VALUE;
        jSONScanner.ch = ';';
        jSONScanner.pos = 0;
        jSONScanner.token = 8;
        setField(jSONScanner, "len", 1);
        String string = new String("");
        setField(jSONScanner, "text", string);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultJSONParser.parseArrayWithType(null);
        
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
    public void testParseArrayWithType15() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.sp = 0;
        jSONScanner.bp = 0;
        jSONScanner.ch = '+';
        jSONScanner.pos = 0;
        jSONScanner.token = 8;
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Object actual = defaultJSONParser.parseArrayWithType(null);
        
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
    public void testParseArrayWithType16() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.np = 0;
        jSONScanner.sp = 0;
        jSONScanner.bp = 0;
        jSONScanner.ch = '-';
        jSONScanner.pos = 0;
        jSONScanner.token = 8;
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Object actual = defaultJSONParser.parseArrayWithType(null);
        
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
    public void testParseArrayWithType17() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.sp = 0;
        jSONScanner.bp = 0;
        jSONScanner.ch = ',';
        jSONScanner.pos = 0;
        jSONScanner.token = 8;
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Object actual = defaultJSONParser.parseArrayWithType(null);
        
        assertNull(actual);
        
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
    public void testParseArrayWithType18() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.sp = 0;
        jSONScanner.bp = 0;
        jSONScanner.ch = 'x';
        jSONScanner.pos = 0;
        jSONScanner.token = 8;
        setField(jSONScanner, "len", 0);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultJSONParser.parseArrayWithType(null);
        
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
    public void testParseArrayWithType19() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.sp = 0;
        jSONScanner.bp = 0;
        jSONScanner.ch = '\'';
        jSONScanner.pos = 0;
        jSONScanner.token = 8;
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultJSONParser.parseArrayWithType(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseArrayWithType20() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.sp = 0;
        jSONScanner.bp = Integer.MAX_VALUE;
        jSONScanner.ch = 't';
        jSONScanner.pos = 0;
        jSONScanner.token = 8;
        setField(jSONScanner, "len", 1);
        String string = new String("");
        setField(jSONScanner, "text", string);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultJSONParser.parseArrayWithType(null);
        
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
    public void testParseArrayWithType21() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.sp = 0;
        jSONScanner.bp = Integer.MAX_VALUE;
        jSONScanner.ch = ')';
        jSONScanner.pos = 0;
        jSONScanner.token = 8;
        setField(jSONScanner, "len", 1);
        String string = new String("");
        setField(jSONScanner, "text", string);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultJSONParser.parseArrayWithType(null);
        
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
    public void testParseArrayWithType22() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.sp = 0;
        jSONScanner.bp = Integer.MAX_VALUE;
        jSONScanner.ch = '/';
        jSONScanner.pos = 0;
        jSONScanner.token = 8;
        setField(jSONScanner, "len", 1);
        String string = new String("");
        setField(jSONScanner, "text", string);
        setField(defaultJSONParser, "lexer", jSONScanner);
        TypeVariableImpl typeVariableImpl = ((TypeVariableImpl) createInstance("sun.reflect.generics.reflectiveObjects.TypeVariableImpl"));
        
        defaultJSONParser.parseArrayWithType(typeVariableImpl);
        
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
    public void testParseArrayWithType23() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.sp = 0;
        jSONScanner.bp = 0;
        jSONScanner.ch = '{';
        jSONScanner.pos = 0;
        jSONScanner.token = 8;
        setField(jSONScanner, "len", 0);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Object actual = defaultJSONParser.parseArrayWithType(null);
        
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
        JSONReaderScanner jSONReaderScanner = ((JSONReaderScanner) createInstance("com.alibaba.fastjson.parser.JSONReaderScanner"));
        setField(defaultJSONParser, "lexer", jSONReaderScanner);
        
        JSONLexer actual = defaultJSONParser.getLexer();
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(jSONReaderScanner, actual));
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
        String string = new String("");
        setField(parseContext, "path", string);
        parseContext.object = null;
        parseContextArray[0] = parseContext;
        setField(defaultJSONParser, "contextArray", parseContextArray);
        
        Object defaultJSONParserContextArray = getFieldValue(defaultJSONParser, "contextArray");
        Object defaultJSONParserContextArrayContextArray0 = get(defaultJSONParserContextArray, 0);
        Object initialDefaultJSONParserContextArray0Object = getFieldValue(defaultJSONParserContextArrayContextArray0, "object");
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
        
        Object actual = defaultJSONParser.resolveReference(string);
        
        assertNull(actual);
        
        Object defaultJSONParserContextArray9 = getFieldValue(defaultJSONParser, "contextArray");
        Object defaultJSONParserContextArray9ContextArray0 = get(defaultJSONParserContextArray9, 0);
        Object finalDefaultJSONParserContextArray0Object = getFieldValue(defaultJSONParserContextArray9ContextArray0, "object");
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
        
        assertNull(finalDefaultJSONParserContextArray0Object);
        
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
    public void testResolveReference6() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        setField(defaultJSONParser, "contextArrayIndex", 1);
        com.alibaba.fastjson.parser.ParseContext[] parseContextArray = new com.alibaba.fastjson.parser.ParseContext[1];
        ParseContext parseContext = ((ParseContext) createInstance("com.alibaba.fastjson.parser.ParseContext"));
        String string = new String("");
        setField(parseContext, "path", string);
        parseContextArray[0] = parseContext;
        setField(defaultJSONParser, "contextArray", parseContextArray);
        
        Object actual = defaultJSONParser.resolveReference(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testResolveReference7() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        setField(defaultJSONParser, "contextArrayIndex", 1);
        com.alibaba.fastjson.parser.ParseContext[] parseContextArray = new com.alibaba.fastjson.parser.ParseContext[9];
        ParseContext parseContext = ((ParseContext) createInstance("com.alibaba.fastjson.parser.ParseContext"));
        setField(parseContext, "path", null);
        java.lang.Object[] forEachTaskArray = createArray("java.util.stream.ForEachOps$ForEachTask", 0);
        setField(parseContext, "fieldName", forEachTaskArray);
        setField(parseContext, "parent", parseContext);
        parseContextArray[0] = parseContext;
        setField(defaultJSONParser, "contextArray", parseContextArray);
        
        Object defaultJSONParserContextArray = getFieldValue(defaultJSONParser, "contextArray");
        Object initialDefaultJSONParserContextArray1 = get(defaultJSONParserContextArray, 1);
        Object defaultJSONParserContextArray1 = getFieldValue(defaultJSONParser, "contextArray");
        Object initialDefaultJSONParserContextArray2 = get(defaultJSONParserContextArray1, 2);
        Object defaultJSONParserContextArray2 = getFieldValue(defaultJSONParser, "contextArray");
        Object initialDefaultJSONParserContextArray3 = get(defaultJSONParserContextArray2, 3);
        Object defaultJSONParserContextArray3 = getFieldValue(defaultJSONParser, "contextArray");
        Object initialDefaultJSONParserContextArray4 = get(defaultJSONParserContextArray3, 4);
        Object defaultJSONParserContextArray4 = getFieldValue(defaultJSONParser, "contextArray");
        Object initialDefaultJSONParserContextArray5 = get(defaultJSONParserContextArray4, 5);
        Object defaultJSONParserContextArray5 = getFieldValue(defaultJSONParser, "contextArray");
        Object initialDefaultJSONParserContextArray6 = get(defaultJSONParserContextArray5, 6);
        Object defaultJSONParserContextArray6 = getFieldValue(defaultJSONParser, "contextArray");
        Object initialDefaultJSONParserContextArray7 = get(defaultJSONParserContextArray6, 7);
        Object defaultJSONParserContextArray7 = getFieldValue(defaultJSONParser, "contextArray");
        Object initialDefaultJSONParserContextArray8 = get(defaultJSONParserContextArray7, 8);
        
        defaultJSONParser.resolveReference(null);
        
        Object defaultJSONParserContextArray8 = getFieldValue(defaultJSONParser, "contextArray");
        Object finalDefaultJSONParserContextArray1 = get(defaultJSONParserContextArray8, 1);
        Object defaultJSONParserContextArray9 = getFieldValue(defaultJSONParser, "contextArray");
        Object finalDefaultJSONParserContextArray2 = get(defaultJSONParserContextArray9, 2);
        Object defaultJSONParserContextArray10 = getFieldValue(defaultJSONParser, "contextArray");
        Object finalDefaultJSONParserContextArray3 = get(defaultJSONParserContextArray10, 3);
        Object defaultJSONParserContextArray11 = getFieldValue(defaultJSONParser, "contextArray");
        Object finalDefaultJSONParserContextArray4 = get(defaultJSONParserContextArray11, 4);
        Object defaultJSONParserContextArray12 = getFieldValue(defaultJSONParser, "contextArray");
        Object finalDefaultJSONParserContextArray5 = get(defaultJSONParserContextArray12, 5);
        Object defaultJSONParserContextArray13 = getFieldValue(defaultJSONParser, "contextArray");
        Object finalDefaultJSONParserContextArray6 = get(defaultJSONParserContextArray13, 6);
        Object defaultJSONParserContextArray14 = getFieldValue(defaultJSONParser, "contextArray");
        Object finalDefaultJSONParserContextArray7 = get(defaultJSONParserContextArray14, 7);
        Object defaultJSONParserContextArray15 = getFieldValue(defaultJSONParser, "contextArray");
        Object finalDefaultJSONParserContextArray8 = get(defaultJSONParserContextArray15, 8);
        
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
    public void testResolveReference8() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        setField(defaultJSONParser, "contextArrayIndex", 1);
        com.alibaba.fastjson.parser.ParseContext[] parseContextArray = new com.alibaba.fastjson.parser.ParseContext[9];
        ParseContext parseContext = ((ParseContext) createInstance("com.alibaba.fastjson.parser.ParseContext"));
        setField(parseContext, "path", null);
        Integer integer = 0;
        setField(parseContext, "fieldName", integer);
        setField(parseContext, "parent", parseContext);
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
        
        defaultJSONParser.resolveReference(null);
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
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testHandleResovleTask3() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        setField(defaultJSONParser, "resolveTaskList", arrayList);
        
        defaultJSONParser.handleResovleTask(null);
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
        jSONScanner.bp = 0;
        jSONScanner.ch = ':';
        jSONScanner.pos = 0;
        setField(jSONScanner, "len", 0);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultJSONParser.parseExtra(null, null);
        
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
    public void testParseExtra3() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.sp = 0;
        jSONScanner.bp = Integer.MAX_VALUE;
        jSONScanner.ch = '\f';
        setField(jSONScanner, "len", 1);
        String string = new String("");
        setField(jSONScanner, "text", string);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultJSONParser.parseExtra(null, null);
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerBp = getFieldValue(jSONLexer, "bp");
        
        assertEquals(Integer.MIN_VALUE, finalDefaultJSONParserLexerBp);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseExtra4() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.sp = 0;
        jSONScanner.bp = 0;
        jSONScanner.ch = '\f';
        setField(jSONScanner, "len", 0);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultJSONParser.parseExtra(null, null);
        
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
    public void testParseExtra5() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONReaderScanner jSONReaderScanner = ((JSONReaderScanner) createInstance("com.alibaba.fastjson.parser.JSONReaderScanner"));
        jSONReaderScanner.sp = 0;
        jSONReaderScanner.bp = 0;
        jSONReaderScanner.ch = '\r';
        setField(defaultJSONParser, "lexer", jSONReaderScanner);
        
        defaultJSONParser.parseExtra(null, null);
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
        String string = new String("");
        setField(parseContext, "path", string);
        parseContextArray[0] = parseContext;
        setField(defaultJSONParser, "contextArray", parseContextArray);
        
        Object defaultJSONParserContextArray = getFieldValue(defaultJSONParser, "contextArray");
        Object initialDefaultJSONParserContextArray1 = get(defaultJSONParserContextArray, 1);
        Object defaultJSONParserContextArray1 = getFieldValue(defaultJSONParser, "contextArray");
        Object initialDefaultJSONParserContextArray2 = get(defaultJSONParserContextArray1, 2);
        Object defaultJSONParserContextArray2 = getFieldValue(defaultJSONParser, "contextArray");
        Object initialDefaultJSONParserContextArray3 = get(defaultJSONParserContextArray2, 3);
        Object defaultJSONParserContextArray3 = getFieldValue(defaultJSONParser, "contextArray");
        Object initialDefaultJSONParserContextArray4 = get(defaultJSONParserContextArray3, 4);
        Object defaultJSONParserContextArray4 = getFieldValue(defaultJSONParser, "contextArray");
        Object initialDefaultJSONParserContextArray5 = get(defaultJSONParserContextArray4, 5);
        Object defaultJSONParserContextArray5 = getFieldValue(defaultJSONParser, "contextArray");
        Object initialDefaultJSONParserContextArray6 = get(defaultJSONParserContextArray5, 6);
        Object defaultJSONParserContextArray6 = getFieldValue(defaultJSONParser, "contextArray");
        Object initialDefaultJSONParserContextArray7 = get(defaultJSONParserContextArray6, 7);
        Object defaultJSONParserContextArray7 = getFieldValue(defaultJSONParser, "contextArray");
        Object initialDefaultJSONParserContextArray8 = get(defaultJSONParserContextArray7, 8);
        
        defaultJSONParser.getObject(null);
        
        Object defaultJSONParserContextArray8 = getFieldValue(defaultJSONParser, "contextArray");
        Object finalDefaultJSONParserContextArray1 = get(defaultJSONParserContextArray8, 1);
        Object defaultJSONParserContextArray9 = getFieldValue(defaultJSONParser, "contextArray");
        Object finalDefaultJSONParserContextArray2 = get(defaultJSONParserContextArray9, 2);
        Object defaultJSONParserContextArray10 = getFieldValue(defaultJSONParser, "contextArray");
        Object finalDefaultJSONParserContextArray3 = get(defaultJSONParserContextArray10, 3);
        Object defaultJSONParserContextArray11 = getFieldValue(defaultJSONParser, "contextArray");
        Object finalDefaultJSONParserContextArray4 = get(defaultJSONParserContextArray11, 4);
        Object defaultJSONParserContextArray12 = getFieldValue(defaultJSONParser, "contextArray");
        Object finalDefaultJSONParserContextArray5 = get(defaultJSONParserContextArray12, 5);
        Object defaultJSONParserContextArray13 = getFieldValue(defaultJSONParser, "contextArray");
        Object finalDefaultJSONParserContextArray6 = get(defaultJSONParserContextArray13, 6);
        Object defaultJSONParserContextArray14 = getFieldValue(defaultJSONParser, "contextArray");
        Object finalDefaultJSONParserContextArray7 = get(defaultJSONParserContextArray14, 7);
        Object defaultJSONParserContextArray15 = getFieldValue(defaultJSONParser, "contextArray");
        Object finalDefaultJSONParserContextArray8 = get(defaultJSONParserContextArray15, 8);
        
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
    public void testGetObject6() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        setField(defaultJSONParser, "contextArrayIndex", 2);
        com.alibaba.fastjson.parser.ParseContext[] parseContextArray = new com.alibaba.fastjson.parser.ParseContext[9];
        ParseContext parseContext = ((ParseContext) createInstance("com.alibaba.fastjson.parser.ParseContext"));
        String string = new String("");
        setField(parseContext, "path", string);
        parseContext.object = null;
        parseContextArray[0] = parseContext;
        ParseContext parseContext1 = ((ParseContext) createInstance("com.alibaba.fastjson.parser.ParseContext"));
        setField(parseContext1, "path", null);
        parseContext1.object = null;
        parseContextArray[1] = parseContext1;
        parseContextArray[2] = parseContext1;
        parseContextArray[3] = parseContext1;
        parseContextArray[4] = parseContext1;
        parseContextArray[5] = parseContext1;
        parseContextArray[6] = parseContext1;
        parseContextArray[7] = parseContext1;
        parseContextArray[8] = parseContext1;
        setField(defaultJSONParser, "contextArray", parseContextArray);
        
        Object defaultJSONParserContextArray = getFieldValue(defaultJSONParser, "contextArray");
        Object defaultJSONParserContextArrayContextArray0 = get(defaultJSONParserContextArray, 0);
        Object initialDefaultJSONParserContextArray0Object = getFieldValue(defaultJSONParserContextArrayContextArray0, "object");
        Object defaultJSONParserContextArray1 = getFieldValue(defaultJSONParser, "contextArray");
        Object defaultJSONParserContextArray1ContextArray1 = get(defaultJSONParserContextArray1, 1);
        Object initialDefaultJSONParserContextArray1Object = getFieldValue(defaultJSONParserContextArray1ContextArray1, "object");
        
        Object actual = defaultJSONParser.getObject(string);
        
        assertNull(actual);
        
        Object defaultJSONParserContextArray2 = getFieldValue(defaultJSONParser, "contextArray");
        Object defaultJSONParserContextArray2ContextArray0 = get(defaultJSONParserContextArray2, 0);
        Object finalDefaultJSONParserContextArray0Object = getFieldValue(defaultJSONParserContextArray2ContextArray0, "object");
        Object defaultJSONParserContextArray3 = getFieldValue(defaultJSONParser, "contextArray");
        Object defaultJSONParserContextArray3ContextArray1 = get(defaultJSONParserContextArray3, 1);
        Object finalDefaultJSONParserContextArray1Object = getFieldValue(defaultJSONParserContextArray3ContextArray1, "object");
        
        assertNull(finalDefaultJSONParserContextArray0Object);
        
        assertNull(finalDefaultJSONParserContextArray1Object);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetObject7() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        setField(defaultJSONParser, "contextArrayIndex", 1);
        com.alibaba.fastjson.parser.ParseContext[] parseContextArray = new com.alibaba.fastjson.parser.ParseContext[9];
        ParseContext parseContext = ((ParseContext) createInstance("com.alibaba.fastjson.parser.ParseContext"));
        setField(parseContext, "path", null);
        java.lang.Object[] forEachTaskArray = createArray("java.util.stream.ForEachOps$ForEachTask", 0);
        setField(parseContext, "fieldName", forEachTaskArray);
        ParseContext parseContext1 = ((ParseContext) createInstance("com.alibaba.fastjson.parser.ParseContext"));
        String string = new String("");
        setField(parseContext1, "path", string);
        setField(parseContext1, "fieldName", null);
        setField(parseContext1, "parent", null);
        setField(parseContext, "parent", parseContext1);
        parseContextArray[0] = parseContext;
        setField(defaultJSONParser, "contextArray", parseContextArray);
        
        Object defaultJSONParserContextArray = getFieldValue(defaultJSONParser, "contextArray");
        Object defaultJSONParserContextArrayContextArray0 = get(defaultJSONParserContextArray, 0);
        Object defaultJSONParserContextArrayContextArray0ContextArray0Parent = getFieldValue(defaultJSONParserContextArrayContextArray0, "parent");
        Object initialDefaultJSONParserContextArray0ParentFieldName = getFieldValue(defaultJSONParserContextArrayContextArray0ContextArray0Parent, "fieldName");
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
        Object defaultJSONParserContextArray9ContextArray0 = get(defaultJSONParserContextArray9, 0);
        Object defaultJSONParserContextArray9ContextArray0ContextArray0Parent = getFieldValue(defaultJSONParserContextArray9ContextArray0, "parent");
        Object finalDefaultJSONParserContextArray0ParentFieldName = getFieldValue(defaultJSONParserContextArray9ContextArray0ContextArray0Parent, "fieldName");
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
        
        assertNull(finalDefaultJSONParserContextArray0ParentFieldName);
        
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
    public void testGetObject8() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        setField(defaultJSONParser, "contextArrayIndex", 1);
        com.alibaba.fastjson.parser.ParseContext[] parseContextArray = new com.alibaba.fastjson.parser.ParseContext[9];
        ParseContext parseContext = ((ParseContext) createInstance("com.alibaba.fastjson.parser.ParseContext"));
        setField(parseContext, "path", null);
        Integer integer = 0;
        setField(parseContext, "fieldName", integer);
        ParseContext parseContext1 = ((ParseContext) createInstance("com.alibaba.fastjson.parser.ParseContext"));
        String string = new String("");
        setField(parseContext1, "path", string);
        setField(parseContext1, "fieldName", null);
        setField(parseContext1, "parent", null);
        setField(parseContext, "parent", parseContext1);
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
        String string1 = new String("");
        
        Object defaultJSONParserContextArray = getFieldValue(defaultJSONParser, "contextArray");
        Object defaultJSONParserContextArrayContextArray0 = get(defaultJSONParserContextArray, 0);
        Object defaultJSONParserContextArrayContextArray0ContextArray0Parent = getFieldValue(defaultJSONParserContextArrayContextArray0, "parent");
        Object initialDefaultJSONParserContextArray0ParentFieldName = getFieldValue(defaultJSONParserContextArrayContextArray0ContextArray0Parent, "fieldName");
        
        Object actual = defaultJSONParser.getObject(string1);
        
        assertNull(actual);
        
        Object defaultJSONParserContextArray1 = getFieldValue(defaultJSONParser, "contextArray");
        Object defaultJSONParserContextArray1ContextArray0 = get(defaultJSONParserContextArray1, 0);
        Object defaultJSONParserContextArray1ContextArray0ContextArray0Parent = getFieldValue(defaultJSONParserContextArray1ContextArray0, "parent");
        Object finalDefaultJSONParserContextArray0ParentFieldName = getFieldValue(defaultJSONParserContextArray1ContextArray0ContextArray0Parent, "fieldName");
        
        assertNull(finalDefaultJSONParserContextArray0ParentFieldName);
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
        
        defaultJSONParser.accept(0, 0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testAccept2() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.sp = 0;
        jSONScanner.ch = '\u001A';
        jSONScanner.token = 0;
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultJSONParser.accept(0, 16);
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerToken = getFieldValue(jSONLexer, "token");
        
        assertEquals(20, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testAccept3() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.sp = 0;
        jSONScanner.bp = 0;
        jSONScanner.ch = '\t';
        jSONScanner.token = 0;
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultJSONParser.accept(0, 17);
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerBp = getFieldValue(jSONLexer, "bp");
        JSONLexer jSONLexer1 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerCh = getFieldValue(jSONLexer1, "ch");
        
        assertEquals(14169, finalDefaultJSONParserLexerBp);
        
        assertEquals('\u001A', finalDefaultJSONParserLexerCh);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testAccept4() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.sp = 0;
        jSONScanner.bp = 0;
        jSONScanner.ch = '{';
        jSONScanner.token = 0;
        setField(jSONScanner, "len", 0);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultJSONParser.accept(0, 12);
        
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
    public void testAccept5() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.sp = 0;
        jSONScanner.ch = '\u0000';
        jSONScanner.token = 0;
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultJSONParser.accept(0, 13);
        
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
        jSONScanner.ch = ' ';
        jSONScanner.token = 0;
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultJSONParser.accept(0, 20);
        
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
    public void testAccept7() throws Throwable  {
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
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testAccept8() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        
        defaultJSONParser.accept(0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testAccept9() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.token = 1;
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultJSONParser.accept(0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testAccept10() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.sp = 0;
        jSONScanner.bp = 1;
        jSONScanner.ch = '(';
        jSONScanner.pos = 0;
        jSONScanner.token = 0;
        setField(jSONScanner, "len", -2147483645);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultJSONParser.accept(0);
        
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
    public void testAccept11() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.sp = 0;
        jSONScanner.bp = 1;
        jSONScanner.ch = ']';
        jSONScanner.pos = 0;
        jSONScanner.token = 0;
        setField(jSONScanner, "len", -2147483645);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultJSONParser.accept(0);
        
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
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testAccept12() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.sp = 0;
        jSONScanner.bp = 1;
        jSONScanner.ch = '\u001A';
        jSONScanner.pos = 0;
        jSONScanner.token = 0;
        setField(jSONScanner, "len", 0);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultJSONParser.accept(0);
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerBp = getFieldValue(jSONLexer, "bp");
        JSONLexer jSONLexer1 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerPos = getFieldValue(jSONLexer1, "pos");
        
        assertEquals(14170, finalDefaultJSONParserLexerBp);
        
        assertEquals(14170, finalDefaultJSONParserLexerPos);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testAccept13() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.hasSpecial = false;
        jSONScanner.np = 0;
        jSONScanner.sp = 0;
        jSONScanner.bp = 0;
        jSONScanner.ch = '\"';
        jSONScanner.pos = 0;
        jSONScanner.token = 0;
        setField(jSONScanner, "len", 0);
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
    public void testAccept14() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.sp = 0;
        jSONScanner.bp = Integer.MAX_VALUE;
        jSONScanner.ch = 'x';
        jSONScanner.pos = 0;
        jSONScanner.token = 0;
        setField(jSONScanner, "len", 1);
        String string = new String("");
        setField(jSONScanner, "text", string);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultJSONParser.accept(0);
        
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
    public void testAccept15() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.token = 0;
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultJSONParser.accept(0);
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerToken = getFieldValue(jSONLexer, "token");
        
        assertEquals(20, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testAccept16() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.sp = 0;
        jSONScanner.bp = 0;
        jSONScanner.ch = 't';
        jSONScanner.pos = 0;
        jSONScanner.token = 0;
        setField(jSONScanner, "len", 0);
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
    public void testAccept17() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONReaderScanner jSONReaderScanner = ((JSONReaderScanner) createInstance("com.alibaba.fastjson.parser.JSONReaderScanner"));
        jSONReaderScanner.sp = 0;
        jSONReaderScanner.bp = 0;
        jSONReaderScanner.ch = '{';
        jSONReaderScanner.pos = 0;
        jSONReaderScanner.token = 0;
        setField(defaultJSONParser, "lexer", jSONReaderScanner);
        
        defaultJSONParser.accept(0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testAccept18() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.sp = 0;
        jSONScanner.bp = 0;
        jSONScanner.ch = ';';
        jSONScanner.pos = 0;
        jSONScanner.token = 0;
        setField(jSONScanner, "len", 0);
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
        
        assertEquals(24, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testAccept19() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.hasSpecial = false;
        jSONScanner.np = 0;
        jSONScanner.sp = 0;
        jSONScanner.bp = Integer.MAX_VALUE;
        jSONScanner.ch = 'N';
        jSONScanner.pos = 0;
        jSONScanner.token = 0;
        setField(jSONScanner, "len", 1);
        String string = new String("");
        setField(jSONScanner, "text", string);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultJSONParser.accept(0);
        
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
    public void testAccept20() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.sp = 0;
        jSONScanner.bp = Integer.MAX_VALUE;
        jSONScanner.ch = '\f';
        jSONScanner.pos = 0;
        jSONScanner.token = 0;
        setField(jSONScanner, "len", 1);
        String string = new String("");
        setField(jSONScanner, "text", string);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultJSONParser.accept(0);
        
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
    public void testAccept21() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONReaderScanner jSONReaderScanner = ((JSONReaderScanner) createInstance("com.alibaba.fastjson.parser.JSONReaderScanner"));
        jSONReaderScanner.np = 0;
        jSONReaderScanner.sp = 0;
        jSONReaderScanner.bp = 1;
        jSONReaderScanner.ch = ' ';
        jSONReaderScanner.pos = 0;
        jSONReaderScanner.token = 0;
        setField(jSONReaderScanner, "bufLength", -2147483645);
        char[] charArray = new char[9];
        setField(jSONReaderScanner, "buf", charArray);
        setField(jSONReaderScanner, "reader", null);
        setField(defaultJSONParser, "lexer", jSONReaderScanner);
        
        defaultJSONParser.accept(0);
        
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
    
    @Test(timeout = 10000)
    public void testAccept22() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.sp = 0;
        jSONScanner.bp = 1;
        jSONScanner.ch = '<';
        jSONScanner.pos = 0;
        jSONScanner.token = 0;
        setField(jSONScanner, "len", 0);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultJSONParser.accept(0);
        
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
    public void testAccept23() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.np = 0;
        jSONScanner.sp = 0;
        jSONScanner.bp = 0;
        jSONScanner.ch = '+';
        jSONScanner.pos = 0;
        jSONScanner.token = 0;
        setField(jSONScanner, "len", 0);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultJSONParser.accept(0);
        
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
    public void testAccept24() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.hasSpecial = false;
        jSONScanner.np = 0;
        jSONScanner.sp = 0;
        jSONScanner.bp = 0;
        jSONScanner.ch = 'T';
        jSONScanner.pos = 0;
        jSONScanner.token = 0;
        setField(jSONScanner, "len", 0);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultJSONParser.accept(0);
        
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
    public void testAccept25() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.sp = 0;
        jSONScanner.bp = 0;
        jSONScanner.ch = '\b';
        jSONScanner.pos = 0;
        jSONScanner.token = 0;
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultJSONParser.accept(0);
        
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
    public void testAccept26() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONReaderScanner jSONReaderScanner = ((JSONReaderScanner) createInstance("com.alibaba.fastjson.parser.JSONReaderScanner"));
        jSONReaderScanner.np = 0;
        jSONReaderScanner.sp = 0;
        jSONReaderScanner.bp = 0;
        jSONReaderScanner.ch = '[';
        jSONReaderScanner.pos = 0;
        jSONReaderScanner.token = 0;
        setField(jSONReaderScanner, "bufLength", 0);
        setField(defaultJSONParser, "lexer", jSONReaderScanner);
        
        defaultJSONParser.accept(0);
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerNp = getFieldValue(jSONLexer, "np");
        
        assertEquals(-1, finalDefaultJSONParserLexerNp);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testAccept27() throws Throwable  {
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
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testAccept28() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONReaderScanner jSONReaderScanner = ((JSONReaderScanner) createInstance("com.alibaba.fastjson.parser.JSONReaderScanner"));
        jSONReaderScanner.hasSpecial = false;
        jSONReaderScanner.np = 0;
        jSONReaderScanner.sp = 0;
        jSONReaderScanner.bp = 0;
        jSONReaderScanner.ch = 'N';
        jSONReaderScanner.pos = 0;
        jSONReaderScanner.token = 0;
        setField(defaultJSONParser, "lexer", jSONReaderScanner);
        
        defaultJSONParser.accept(0);
        
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
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testAccept29() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.sp = 0;
        jSONScanner.bp = Integer.MAX_VALUE;
        jSONScanner.ch = '.';
        jSONScanner.pos = 0;
        jSONScanner.token = 0;
        setField(jSONScanner, "len", 1);
        String string = new String("");
        setField(jSONScanner, "text", string);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultJSONParser.accept(0);
        
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
    public void testAccept30() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.np = 0;
        jSONScanner.sp = 0;
        jSONScanner.bp = 0;
        jSONScanner.ch = '-';
        jSONScanner.pos = 0;
        jSONScanner.token = 0;
        setField(jSONScanner, "len", 0);
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
    public void testAccept31() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.sp = 0;
        jSONScanner.bp = 0;
        jSONScanner.ch = ':';
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
        
        assertEquals(17, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testAccept32() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.sp = 0;
        jSONScanner.bp = Integer.MAX_VALUE;
        jSONScanner.ch = '/';
        jSONScanner.pos = 0;
        jSONScanner.token = 0;
        setField(jSONScanner, "len", 1);
        String string = new String("");
        setField(jSONScanner, "text", string);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultJSONParser.accept(0);
        
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
    public void testAccept33() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.sp = 0;
        jSONScanner.bp = 0;
        jSONScanner.ch = 'n';
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
    public void testAccept34() throws Throwable  {
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
        
        defaultJSONParser.parse();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParse2() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.token = 16;
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultJSONParser.parse();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testParse3() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.sp = 0;
        jSONScanner.bp = 0;
        jSONScanner.ch = '\u0000';
        jSONScanner.pos = 0;
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
    
    @Test(timeout = 10000)
    public void testParse4() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.sp = 0;
        jSONScanner.bp = 0;
        jSONScanner.ch = '[';
        jSONScanner.pos = 0;
        jSONScanner.token = 6;
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Object actual = defaultJSONParser.parse();
        
        Boolean expected = true;
        
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
    
    @Test(timeout = 10000)
    public void testParse5() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.sp = 0;
        jSONScanner.bp = 0;
        jSONScanner.ch = '.';
        jSONScanner.pos = 0;
        jSONScanner.token = 6;
        setField(jSONScanner, "len", 0);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Object actual = defaultJSONParser.parse();
        
        Boolean expected = true;
        
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
        
        assertEquals(25, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParse6() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.np = 0;
        jSONScanner.sp = 0;
        jSONScanner.bp = 0;
        jSONScanner.ch = 'S';
        jSONScanner.pos = 0;
        jSONScanner.token = 6;
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultJSONParser.parse();
        
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
    public void testParse7() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.sp = 0;
        jSONScanner.bp = 0;
        jSONScanner.ch = '\n';
        jSONScanner.pos = 0;
        jSONScanner.token = 6;
        setField(jSONScanner, "len", 0);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultJSONParser.parse();
        
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
    public void testParse8() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.sp = 0;
        jSONScanner.bp = 0;
        jSONScanner.ch = ' ';
        jSONScanner.pos = 0;
        jSONScanner.token = 21;
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultJSONParser.parse();
        
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
    public void testParse9() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.sp = 0;
        jSONScanner.bp = 0;
        jSONScanner.ch = ',';
        jSONScanner.pos = 0;
        jSONScanner.token = 23;
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Object actual = defaultJSONParser.parse();
        
        assertNull(actual);
        
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
    public void testParse10() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.sp = 0;
        jSONScanner.bp = 0;
        jSONScanner.ch = ';';
        jSONScanner.pos = 0;
        jSONScanner.token = 6;
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Object actual = defaultJSONParser.parse();
        
        Boolean expected = true;
        
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
        
        assertEquals(24, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParse11() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.np = -1;
        jSONScanner.sp = 0;
        jSONScanner.token = 2;
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultJSONParser.parse();
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerNp = getFieldValue(jSONLexer, "np");
        
        assertEquals(0, finalDefaultJSONParserLexerNp);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testParse12() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.sp = 0;
        jSONScanner.bp = 0;
        jSONScanner.ch = '}';
        jSONScanner.pos = 0;
        jSONScanner.token = 6;
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Object actual = defaultJSONParser.parse();
        
        Boolean expected = true;
        
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
        
        assertEquals(13, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testParse13() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.sp = 0;
        jSONScanner.bp = 0;
        jSONScanner.ch = '\u0000';
        jSONScanner.pos = 0;
        jSONScanner.token = 7;
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Object actual = defaultJSONParser.parse();
        
        Boolean expected = false;
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerToken = getFieldValue(jSONLexer, "token");
        
        assertEquals(20, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testParse14() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.sp = 0;
        jSONScanner.bp = 0;
        jSONScanner.ch = ':';
        jSONScanner.pos = 0;
        jSONScanner.token = 6;
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Object actual = defaultJSONParser.parse();
        
        Boolean expected = true;
        
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
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParse15() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.sp = 0;
        jSONScanner.bp = 0;
        jSONScanner.ch = 'x';
        jSONScanner.pos = 0;
        jSONScanner.token = 6;
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultJSONParser.parse();
        
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
    public void testParse16() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.hasSpecial = false;
        jSONScanner.np = 0;
        jSONScanner.sp = 0;
        jSONScanner.bp = 0;
        jSONScanner.ch = '\"';
        jSONScanner.pos = 0;
        jSONScanner.token = 6;
        setField(jSONScanner, "len", 0);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultJSONParser.parse();
        
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
    public void testParse17() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.sp = 0;
        jSONScanner.bp = 0;
        jSONScanner.ch = '/';
        jSONScanner.pos = 0;
        jSONScanner.token = 8;
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultJSONParser.parse();
        
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
    public void testParse18() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.sp = 0;
        jSONScanner.bp = 0;
        jSONScanner.ch = '(';
        jSONScanner.pos = 0;
        jSONScanner.token = 23;
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Object actual = defaultJSONParser.parse();
        
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
    public void testParse19() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.sp = 0;
        jSONScanner.bp = 0;
        jSONScanner.ch = '\'';
        jSONScanner.pos = 0;
        jSONScanner.token = 6;
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultJSONParser.parse();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testParse20() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.sp = 0;
        jSONScanner.bp = 0;
        jSONScanner.ch = '+';
        jSONScanner.pos = 0;
        jSONScanner.token = 6;
        setField(jSONScanner, "len", 0);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Object actual = defaultJSONParser.parse();
        
        Boolean expected = true;
        
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
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParse21() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.sp = 0;
        jSONScanner.bp = 0;
        jSONScanner.ch = '\u0000';
        jSONScanner.pos = 0;
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
    public void testParse22() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.sp = 0;
        jSONScanner.bp = 0;
        jSONScanner.ch = '{';
        jSONScanner.pos = 0;
        jSONScanner.token = 6;
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Object actual = defaultJSONParser.parse();
        
        Boolean expected = true;
        
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
    
    @Test(timeout = 10000)
    public void testParse23() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.sp = 0;
        jSONScanner.bp = 0;
        jSONScanner.ch = ')';
        jSONScanner.pos = 0;
        jSONScanner.token = 6;
        setField(jSONScanner, "len", 0);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Object actual = defaultJSONParser.parse();
        
        Boolean expected = true;
        
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
    
    @Test(timeout = 10000)
    public void testParse24() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.np = 0;
        jSONScanner.sp = 0;
        jSONScanner.bp = 0;
        jSONScanner.ch = '2';
        jSONScanner.pos = 0;
        jSONScanner.token = 6;
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Object actual = defaultJSONParser.parse();
        
        Boolean expected = true;
        
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
    public void testParse25() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.np = 0;
        jSONScanner.sp = 0;
        jSONScanner.bp = 0;
        jSONScanner.ch = '-';
        jSONScanner.pos = 0;
        jSONScanner.token = 6;
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Object actual = defaultJSONParser.parse();
        
        Boolean expected = true;
        
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
    public void testParse26() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONReaderScanner jSONReaderScanner = ((JSONReaderScanner) createInstance("com.alibaba.fastjson.parser.JSONReaderScanner"));
        jSONReaderScanner.token = 20;
        char[] charArray = new char[9];
        charArray[0] = '\r';
        setField(jSONReaderScanner, "buf", charArray);
        setField(defaultJSONParser, "lexer", jSONReaderScanner);
        
        defaultJSONParser.parse();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParse27() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.sp = 0;
        jSONScanner.bp = 0;
        jSONScanner.ch = '\"';
        jSONScanner.pos = 0;
        jSONScanner.token = 22;
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultJSONParser.parse();
        
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
    public void testParse28() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.hasSpecial = true;
        jSONScanner.sp = 0;
        setField(jSONScanner, "sbuf", null);
        jSONScanner.token = 18;
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultJSONParser.parse();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParse29() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        Object object = new Object();
        
        defaultJSONParser.parse(null, object);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParse30() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        setField(defaultJSONParser, "context", null);
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.bp = Integer.MAX_VALUE;
        jSONScanner.ch = '\b';
        jSONScanner.token = 12;
        setField(jSONScanner, "len", 1);
        String string = new String("");
        setField(jSONScanner, "text", string);
        setField(defaultJSONParser, "lexer", jSONScanner);
        PropertyProcessable propertyProcessableMock = mock(PropertyProcessable.class);
        
        defaultJSONParser.parse(propertyProcessableMock, null);
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerBp = getFieldValue(jSONLexer, "bp");
        
        PropertyProcessable finalPropertyProcessableMock = propertyProcessableMock;
        
        assertEquals(Integer.MIN_VALUE, finalDefaultJSONParserLexerBp);
        
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParse31() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.token = 0;
        setField(defaultJSONParser, "lexer", jSONScanner);
        java.lang.Object[] ofLongArray = createArray("java.util.stream.ForEachOps$ForEachOp$OfLong", 0);
        
        defaultJSONParser.parse(null, ofLongArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParse32() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        setField(defaultJSONParser, "context", null);
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.ch = '0';
        jSONScanner.token = 12;
        setField(defaultJSONParser, "lexer", jSONScanner);
        PropertyProcessable propertyProcessableMock = mock(PropertyProcessable.class);
        
        defaultJSONParser.parse(propertyProcessableMock, null);
        
        PropertyProcessable finalPropertyProcessableMock = propertyProcessableMock;
        
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParse33() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        setField(defaultJSONParser, "context", null);
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.ch = '\b';
        jSONScanner.token = 12;
        setField(defaultJSONParser, "lexer", jSONScanner);
        PropertyProcessable propertyProcessableMock = mock(PropertyProcessable.class);
        
        defaultJSONParser.parse(propertyProcessableMock, null);
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerCh = getFieldValue(jSONLexer, "ch");
        
        PropertyProcessable finalPropertyProcessableMock = propertyProcessableMock;
        
        assertEquals('\u001A', finalDefaultJSONParserLexerCh);
        
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParse34() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        setField(defaultJSONParser, "context", null);
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.bp = 0;
        jSONScanner.ch = '/';
        jSONScanner.token = 12;
        setField(defaultJSONParser, "lexer", jSONScanner);
        PropertyProcessable propertyProcessableMock = mock(PropertyProcessable.class);
        
        defaultJSONParser.parse(propertyProcessableMock, null);
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerBp = getFieldValue(jSONLexer, "bp");
        JSONLexer jSONLexer1 = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerCh = getFieldValue(jSONLexer1, "ch");
        
        PropertyProcessable finalPropertyProcessableMock = propertyProcessableMock;
        
        assertEquals(1, finalDefaultJSONParserLexerBp);
        
        assertEquals('\u001A', finalDefaultJSONParserLexerCh);
        
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParse35() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        Object object = new Object();
        
        defaultJSONParser.parse(object);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParse36() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.token = 17;
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultJSONParser.parse(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testParse37() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.token = 23;
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Object actual = defaultJSONParser.parse(null);
        
        assertNull(actual);
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerToken = getFieldValue(jSONLexer, "token");
        
        assertEquals(20, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParse38() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.token = 2;
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultJSONParser.parse(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParse39() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.token = 22;
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultJSONParser.parse(null);
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerToken = getFieldValue(jSONLexer, "token");
        
        assertEquals(20, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testParse40() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.token = 6;
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Object actual = defaultJSONParser.parse(null);
        
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
    public void testParse41() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONReaderScanner jSONReaderScanner = ((JSONReaderScanner) createInstance("com.alibaba.fastjson.parser.JSONReaderScanner"));
        jSONReaderScanner.token = 0;
        setField(defaultJSONParser, "lexer", jSONReaderScanner);
        
        defaultJSONParser.parse(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testParse42() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.token = 7;
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Object actual = defaultJSONParser.parse(null);
        
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
    public void testParse43() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.sp = 0;
        jSONScanner.token = 21;
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultJSONParser.parse(null);
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerToken = getFieldValue(jSONLexer, "token");
        
        assertEquals(20, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParse44() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.token = 9;
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultJSONParser.parse(null);
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerToken = getFieldValue(jSONLexer, "token");
        
        assertEquals(20, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParse45() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.token = 18;
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultJSONParser.parse(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParse46() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.token = 4;
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultJSONParser.parse(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testParse47() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        jSONScanner.token = 20;
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        Object actual = defaultJSONParser.parse(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDefaultJSONParser1() {
        String string = new String();
        ParserConfig parserConfig = new ParserConfig();
        DefaultJSONParser actual = new DefaultJSONParser(string, parserConfig);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDefaultJSONParser2() {
        ParserConfig parserConfig = new ParserConfig();
        new DefaultJSONParser(((JSONLexer) null), parserConfig);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDefaultJSONParser3() {
        char[] charArray = new char[0];
        ParserConfig parserConfig = new ParserConfig();
        DefaultJSONParser actual = new DefaultJSONParser(charArray, 0, parserConfig, 0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDefaultJSONParser4() throws Throwable  {
        char[] charArray = new char[0];
        ParserConfig parserConfig = ((ParserConfig) createInstance("com.alibaba.fastjson.parser.ParserConfig"));
        new DefaultJSONParser(charArray, 2147483646, parserConfig, 0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDefaultJSONParser5() {
        Object object = new Object();
        ParserConfig parserConfig = new ParserConfig();
        new DefaultJSONParser(object, ((JSONLexer) null), parserConfig);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDefaultJSONParser6() {
        String string = new String();
        ParserConfig parserConfig = new ParserConfig();
        DefaultJSONParser actual = new DefaultJSONParser(string, parserConfig, 0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDefaultJSONParser7() {
        new DefaultJSONParser(((JSONLexer) null));
    }
    ///endregion
    
    
    ///region Errors report for <init>
    
    public void testDefaultJSONParser_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Field security is not found in class java.lang.System
        // 
    }
    ///endregion
    
    
    ///region Errors report for <init>
    
    public void testDefaultJSONParser_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Field security is not found in class java.lang.System
        // 
    }
    ///endregion
    
    
    ///region Errors report for <init>
    
    public void testDefaultJSONParser_errors2()
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
