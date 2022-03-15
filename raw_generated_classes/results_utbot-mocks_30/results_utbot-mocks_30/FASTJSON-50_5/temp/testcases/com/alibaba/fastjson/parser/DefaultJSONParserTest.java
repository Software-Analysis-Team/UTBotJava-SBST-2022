package com.alibaba.fastjson.parser;

import org.junit.Test;
import java.util.Map;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.lang.reflect.Method;
import sun.reflect.generics.reflectiveObjects.TypeVariableImpl;
import sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl;
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

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

public class DefaultJSONParserTest {
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testSetContext1() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        Object object = new Object();
        Object object1 = new Object();
        
        defaultJSONParser.setContext(object, object1);
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
    public void testSetContext3() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        ParseContext parseContext = ((ParseContext) createInstance("com.alibaba.fastjson.parser.ParseContext"));
        
        defaultJSONParser.setContext(parseContext);
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
    
    @Test(timeout = 10000)
    public void testParseKey2() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(18);
        when(jSONLexerMock.stringVal()).thenReturn(((String) null));
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        
        Object actual = defaultJSONParser.parseKey();
        
        assertNull(actual);
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
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseObject2() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        Object object = new Object();
        
        defaultJSONParser.parseObject(((Type) null), object);
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
        
        defaultJSONParser.parseObject(((Map) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseObject6() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        Object object = new Object();
        
        defaultJSONParser.parseObject(object);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseObject7() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        
        defaultJSONParser.parseObject(null);
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
        ParseContext parseContextMock = mock(ParseContext.class);
        when(parseContextMock.toString()).thenReturn(((String) null));
        parseContextArray[0] = parseContextMock;
        setField(defaultJSONParser, "contextArray", parseContextArray);
        
        defaultJSONParser.getObject(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetObject5() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        setField(defaultJSONParser, "contextArrayIndex", 1);
        com.alibaba.fastjson.parser.ParseContext[] parseContextArray = new com.alibaba.fastjson.parser.ParseContext[9];
        setField(defaultJSONParser, "contextArray", parseContextArray);
        
        defaultJSONParser.getObject(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetObject6() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        setField(defaultJSONParser, "contextArrayIndex", 1);
        setField(defaultJSONParser, "contextArray", null);
        
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
        
        defaultJSONParser.accept(0, 0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testAccept2() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(0);
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        
        defaultJSONParser.accept(0, 0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testAccept3() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(1);
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        
        defaultJSONParser.accept(0, 0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testAccept4() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        
        defaultJSONParser.accept(0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testAccept5() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(1);
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        
        defaultJSONParser.accept(0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testAccept6() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(0);
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        
        defaultJSONParser.accept(0);
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
        Object object = new Object();
        
        defaultJSONParser.parse(object);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParse3() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        Object object = new Object();
        
        defaultJSONParser.parse(null, object);
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
        ArrayList arrayList = new ArrayList();
        Object object = new Object();
        
        defaultJSONParser.parseArray(arrayList, object);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseArray3() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        ArrayList arrayList = new ArrayList();
        
        defaultJSONParser.parseArray(((Type) null), arrayList);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseArray4() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        java.lang.reflect.Type[] typeArray = new java.lang.reflect.Type[0];
        
        defaultJSONParser.parseArray(typeArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testParseArray5() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(8);
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        java.lang.reflect.Type[] typeArray = new java.lang.reflect.Type[9];
        
        java.lang.Object[] actual = defaultJSONParser.parseArray(typeArray);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseArray6() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(0, 0);
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        java.lang.reflect.Type[] typeArray = new java.lang.reflect.Type[9];
        
        defaultJSONParser.parseArray(typeArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseArray7() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(0, 14);
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        
        defaultJSONParser.parseArray(((java.lang.reflect.Type[]) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testParseArray8() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(0, 14, 15);
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        java.lang.reflect.Type[] typeArray = new java.lang.reflect.Type[0];
        
        java.lang.Object[] actual = defaultJSONParser.parseArray(typeArray);
        
        java.lang.Object[] expected = new java.lang.Object[0];
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseArray9() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(0, 14, 0);
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        java.lang.reflect.Type[] typeArray = new java.lang.reflect.Type[0];
        
        defaultJSONParser.parseArray(typeArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseArray10() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(0, 14, 8, 0, 0);
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        java.lang.reflect.Type[] typeArray = new java.lang.reflect.Type[1];
        
        defaultJSONParser.parseArray(typeArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testParseArray11() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(0, 14, 8, 15, 15);
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        java.lang.reflect.Type[] typeArray = new java.lang.reflect.Type[1];
        
        java.lang.Object[] actual = defaultJSONParser.parseArray(typeArray);
        
        java.lang.Object[] expected = new java.lang.Object[1];
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseArray12() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(0, 14, 8, 15, 0);
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        java.lang.reflect.Type[] typeArray = new java.lang.reflect.Type[1];
        
        defaultJSONParser.parseArray(typeArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseArray13() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(0, 14, 8, 0, 16, 0);
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        java.lang.reflect.Type[] typeArray = new java.lang.reflect.Type[1];
        
        defaultJSONParser.parseArray(typeArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseArray14() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        ArrayList arrayList = new ArrayList();
        Object object = new Object();
        
        defaultJSONParser.parseArray(null, arrayList, object);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIsEnabled1() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.isEnabled(any(Feature.class))).thenReturn(false);
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        
        boolean actual = defaultJSONParser.isEnabled(null);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testConfig1() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        
        defaultJSONParser.config(null, false);
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
        setField(defaultJSONParser, "contextArrayIndex", 8);
        setField(defaultJSONParser, "contextArray", null);
        
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
        Object finalDefaultJSONParserContextArray = getFieldValue(defaultJSONParser, "contextArray");
        
        assertEquals(9, finalDefaultJSONParserContextArrayIndex);
        
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
    public void testParseArrayWithType1() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        
        defaultJSONParser.parseArrayWithType(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseArrayWithType2() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(0);
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        TypeVariableImpl typeVariableImpl = ((TypeVariableImpl) createInstance("sun.reflect.generics.reflectiveObjects.TypeVariableImpl"));
        
        defaultJSONParser.parseArrayWithType(typeVariableImpl);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testParseArrayWithType3() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(8);
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        
        Object actual = defaultJSONParser.parseArrayWithType(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseArrayWithType4() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(0);
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        
        defaultJSONParser.parseArrayWithType(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseArrayWithType5() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(0);
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        ParameterizedTypeImpl parameterizedTypeImpl = ((ParameterizedTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl"));
        java.lang.reflect.Type[] typeArray = new java.lang.reflect.Type[0];
        setField(parameterizedTypeImpl, "actualTypeArguments", typeArray);
        
        defaultJSONParser.parseArrayWithType(parameterizedTypeImpl);
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
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(0);
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        
        defaultJSONParser.acceptType(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testAcceptType3() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(4);
        when(jSONLexerMock.stringVal()).thenReturn(((String) null));
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        
        defaultJSONParser.acceptType(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testAcceptType4() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(4, 0);
        String string = new String("");
        when(jSONLexerMock.stringVal()).thenReturn(string);
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        
        defaultJSONParser.acceptType(string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testAcceptType5() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(4);
        when(jSONLexerMock.stringVal()).thenReturn(((String) null));
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        String string = new String("");
        
        defaultJSONParser.acceptType(string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testAcceptType6() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(4, 16);
        String string = new String("");
        when(jSONLexerMock.stringVal()).thenReturn(string);
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        
        defaultJSONParser.acceptType(string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testAcceptType7() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(4);
        String string = new String("");
        when(jSONLexerMock.stringVal()).thenReturn(string);
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        String string1 = new String("\u0000");
        
        defaultJSONParser.acceptType(string1);
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
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        
        JSONLexer actual = defaultJSONParser.getLexer();
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(jSONLexerMock, actual));
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
        
        Object actual = defaultJSONParser.resolveReference(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testResolveReference4() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        com.alibaba.fastjson.parser.ParseContext[] parseContextArray = new com.alibaba.fastjson.parser.ParseContext[0];
        setField(defaultJSONParser, "contextArray", parseContextArray);
        
        Object actual = defaultJSONParser.resolveReference(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testResolveReference5() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        setField(defaultJSONParser, "contextArrayIndex", 1);
        com.alibaba.fastjson.parser.ParseContext[] parseContextArray = new com.alibaba.fastjson.parser.ParseContext[9];
        setField(defaultJSONParser, "contextArray", parseContextArray);
        
        defaultJSONParser.resolveReference(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testResolveReference6() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        setField(defaultJSONParser, "contextArrayIndex", 1);
        com.alibaba.fastjson.parser.ParseContext[] parseContextArray = new com.alibaba.fastjson.parser.ParseContext[9];
        ParseContext parseContextMock = mock(ParseContext.class);
        when(parseContextMock.toString()).thenReturn(((String) null));
        parseContextArray[0] = parseContextMock;
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
        SymbolTable symbolTableMock = mock(SymbolTable.class);
        setField(defaultJSONParser, "symbolTable", symbolTableMock);
        
        SymbolTable actual = defaultJSONParser.getSymbolTable();
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(symbolTableMock, actual));
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
    
    @Test(timeout = 10000)
    public void testDefaultJSONParser2() {
        String string = new String();
        DefaultJSONParser actual = new DefaultJSONParser(string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDefaultJSONParser3() {
        Object object = new Object();
        ParserConfig parserConfig = new ParserConfig();
        new DefaultJSONParser(object, ((JSONLexer) null), parserConfig);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDefaultJSONParser4() {
        ParserConfig parserConfig = new ParserConfig();
        new DefaultJSONParser(((JSONLexer) null), parserConfig);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDefaultJSONParser5() {
        new DefaultJSONParser(((JSONLexer) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDefaultJSONParser6() {
        char[] charArray = new char[0];
        ParserConfig parserConfig = new ParserConfig();
        DefaultJSONParser actual = new DefaultJSONParser(charArray, 0, parserConfig, 0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDefaultJSONParser7() throws Throwable  {
        char[] charArray = new char[0];
        ParserConfig parserConfigMock = mock(ParserConfig.class);
        new DefaultJSONParser(charArray, 2147483646, parserConfigMock, 0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDefaultJSONParser8() {
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
        ParseContext parseContextMock = mock(ParseContext.class);
        String string = new String("");
        DefaultJSONParser.ResolveTask actual = new DefaultJSONParser.ResolveTask(parseContextMock, string);
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
