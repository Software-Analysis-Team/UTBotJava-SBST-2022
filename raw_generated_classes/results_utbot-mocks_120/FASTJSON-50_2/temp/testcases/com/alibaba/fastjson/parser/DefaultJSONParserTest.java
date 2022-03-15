package com.alibaba.fastjson.parser;

import org.junit.Test;
import java.util.ArrayList;
import java.util.Collection;
import java.lang.reflect.Type;
import com.alibaba.fastjson.util.ParameterizedTypeImpl;
import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;
import java.lang.reflect.Method;
import org.springframework.cglib.core.DefaultNamingPolicy;
import java.util.Map;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import sun.reflect.generics.reflectiveObjects.WildcardTypeImpl;
import sun.reflect.generics.reflectiveObjects.TypeVariableImpl;
import java.text.CollationElementIterator;
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
import static org.junit.Assert.assertArrayEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

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
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(0, 0, 0);
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        
        defaultJSONParser.parseArray(((Collection) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseArray3() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(21, 0);
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        
        defaultJSONParser.parseArray(((Collection) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseArray4() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(0, 22, 0);
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        
        defaultJSONParser.parseArray(((Collection) null));
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
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(21, 0);
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        
        defaultJSONParser.parseArray(((Type) null), ((Collection) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseArray7() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(0);
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        
        defaultJSONParser.parseArray(((Type) null), ((Collection) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseArray8() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        java.lang.reflect.Type[] typeArray = new java.lang.reflect.Type[0];
        
        defaultJSONParser.parseArray(typeArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testParseArray9() throws Throwable  {
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
    public void testParseArray10() throws Throwable  {
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
    public void testParseArray11() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(0, 14);
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        
        defaultJSONParser.parseArray(((java.lang.reflect.Type[]) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testParseArray12() throws Throwable  {
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
    public void testParseArray13() throws Throwable  {
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
    public void testParseArray14() throws Throwable  {
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
    public void testParseArray15() throws Throwable  {
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
    public void testParseArray16() throws Throwable  {
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
    public void testParseArray17() throws Throwable  {
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
    public void testParseArray18() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(0, 14, 0);
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        setField(defaultJSONParser, "config", null);
        java.lang.reflect.Type[] typeArray = new java.lang.reflect.Type[1];
        ParameterizedTypeImpl parameterizedTypeImpl = ((ParameterizedTypeImpl) createInstance("com.alibaba.fastjson.util.ParameterizedTypeImpl"));
        typeArray[0] = ((Type) parameterizedTypeImpl);
        
        defaultJSONParser.parseArray(typeArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseArray19() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(0, 14, 0);
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        setField(defaultJSONParser, "config", null);
        java.lang.reflect.Type[] typeArray = new java.lang.reflect.Type[1];
        Class class1 = Object.class;
        typeArray[0] = ((Type) class1);
        
        defaultJSONParser.parseArray(typeArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseArray20() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        ArrayList arrayList = new ArrayList();
        Object object = new Object();
        
        defaultJSONParser.parseArray(arrayList, object);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseArray21() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(0, 0, 0);
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        
        defaultJSONParser.parseArray(((Collection) null), null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseArray22() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(0, 22, 0);
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        
        defaultJSONParser.parseArray(((Collection) null), null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseArray23() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(21, 0);
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        
        defaultJSONParser.parseArray(((Collection) null), null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseArray24() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(22, 0);
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        
        defaultJSONParser.parseArray(((Class) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseArray25() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(0);
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        
        defaultJSONParser.parseArray(((Class) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseArray26() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(21, 0);
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        
        defaultJSONParser.parseArray(((Class) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseArray27() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        ArrayList arrayList = new ArrayList();
        Object object = new Object();
        
        defaultJSONParser.parseArray(null, arrayList, object);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseArray28() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(0);
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        
        defaultJSONParser.parseArray(null, null, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseArray29() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(22, 0);
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        
        defaultJSONParser.parseArray(null, null, null);
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
    public void testSetContext3() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        Object object = new Object();
        Object object1 = new Object();
        
        defaultJSONParser.setContext(object, object1);
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
    
    @Test(timeout = 10000)
    public void testParseKey3() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(0, 23);
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        
        Object actual = defaultJSONParser.parseKey();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseKey4() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(0, 11);
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        
        defaultJSONParser.parseKey();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testParseKey5() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(0, 2);
        when(jSONLexerMock.integerValue()).thenReturn(((Number) null));
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        
        Object actual = defaultJSONParser.parseKey();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseKey6() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(0, 25);
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        
        defaultJSONParser.parseKey();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseKey7() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(0, 5);
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        
        defaultJSONParser.parseKey();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseKey8() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(0, 24);
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        
        defaultJSONParser.parseKey();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testParseKey9() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(0, 20);
        when(jSONLexerMock.isBlankInput()).thenReturn(true);
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        
        Object actual = defaultJSONParser.parseKey();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseKey10() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(0, 19);
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        
        defaultJSONParser.parseKey();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseKey11() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(0, 27);
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        
        defaultJSONParser.parseKey();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseKey12() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(0, 17);
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        
        defaultJSONParser.parseKey();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseKey13() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(0, 9, 0);
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        
        defaultJSONParser.parseKey();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testParseKey14() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(0, 26);
        byte[] byteArray = new byte[9];
        when(jSONLexerMock.bytesValue()).thenReturn(byteArray);
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        
        Object actual = defaultJSONParser.parseKey();
        
        assertArrayEquals(byteArray, ((byte[]) actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseKey15() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(0, 13);
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        
        defaultJSONParser.parseKey();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseKey16() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(0, 1);
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        
        defaultJSONParser.parseKey();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testParseKey17() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(0, 8);
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        
        Object actual = defaultJSONParser.parseKey();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseKey18() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(0, 16);
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        
        defaultJSONParser.parseKey();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseKey19() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(0, 15);
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        
        defaultJSONParser.parseKey();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseKey20() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(0, 9, 18, 0);
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        
        defaultJSONParser.parseKey();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseKey21() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(0, 20);
        when(jSONLexerMock.isBlankInput()).thenReturn(false);
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        
        defaultJSONParser.parseKey();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseKey22() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(0, 10);
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        
        defaultJSONParser.parseKey();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseKey23() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(0, 18);
        when(jSONLexerMock.stringVal()).thenReturn(((String) null));
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        
        defaultJSONParser.parseKey();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseObject1() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        
        defaultJSONParser.parseObject(((Type) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testParseObject2() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(4);
        byte[] byteArray = new byte[9];
        when(jSONLexerMock.bytesValue()).thenReturn(byteArray);
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        Class class1 = Object.class;
        
        Object actual = defaultJSONParser.parseObject(class1);
        
        assertArrayEquals(byteArray, ((byte[]) actual));
        
        Class finalClass1 = class1;
        
        Class expectedFinalClass1 = byte[].class;
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expectedFinalClass1, finalClass1));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testParseObject3() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(8);
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        
        Object actual = defaultJSONParser.parseObject(((Type) null));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testParseObject4() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(4);
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        ParserConfig parserConfigMock = mock(ParserConfig.class);
        ObjectDeserializer objectDeserializerMock = mock(ObjectDeserializer.class);
        when(objectDeserializerMock.deserialze(org.mockito.ArgumentMatchers.any(), org.mockito.ArgumentMatchers.any(), org.mockito.ArgumentMatchers.any())).thenReturn(null);
        when(parserConfigMock.getDeserializer(any(Type.class))).thenReturn(objectDeserializerMock);
        defaultJSONParser.config = parserConfigMock;
        
        Object actual = defaultJSONParser.parseObject(((Type) null));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testParseObject5() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(0);
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        ParserConfig parserConfigMock = mock(ParserConfig.class);
        ObjectDeserializer objectDeserializerMock = mock(ObjectDeserializer.class);
        when(objectDeserializerMock.deserialze(org.mockito.ArgumentMatchers.any(), org.mockito.ArgumentMatchers.any(), org.mockito.ArgumentMatchers.any())).thenReturn(null);
        when(parserConfigMock.getDeserializer(any(Type.class))).thenReturn(objectDeserializerMock);
        defaultJSONParser.config = parserConfigMock;
        
        Object actual = defaultJSONParser.parseObject(((Type) null));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testParseObject6() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(4);
        String string = new String("");
        when(jSONLexerMock.stringVal()).thenReturn(string);
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        Class class1 = Object.class;
        
        Object actual = defaultJSONParser.parseObject(class1);
        
        char[] expected = new char[0];
        org.junit.Assert.assertArrayEquals(expected, ((char[]) actual));
        
        Class finalClass1 = class1;
        
        Class expectedFinalClass1 = char[].class;
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expectedFinalClass1, finalClass1));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testParseObject7() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(4);
        byte[] byteArray = new byte[9];
        when(jSONLexerMock.bytesValue()).thenReturn(byteArray);
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        Class class1 = Object.class;
        
        Object actual = defaultJSONParser.parseObject(class1);
        
        assertArrayEquals(byteArray, ((byte[]) actual));
        
        Class finalClass1 = class1;
        
        Class expectedFinalClass1 = byte[].class;
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expectedFinalClass1, finalClass1));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testParseObject8() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(8);
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        
        Object actual = defaultJSONParser.parseObject(((Class) null));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testParseObject9() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(4);
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        ParserConfig parserConfigMock = mock(ParserConfig.class);
        ObjectDeserializer objectDeserializerMock = mock(ObjectDeserializer.class);
        when(objectDeserializerMock.deserialze(org.mockito.ArgumentMatchers.any(), org.mockito.ArgumentMatchers.any(), org.mockito.ArgumentMatchers.any())).thenReturn(null);
        when(parserConfigMock.getDeserializer(any(Type.class))).thenReturn(objectDeserializerMock);
        defaultJSONParser.config = parserConfigMock;
        
        Object actual = defaultJSONParser.parseObject(((Class) null));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testParseObject10() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(0);
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        ParserConfig parserConfigMock = mock(ParserConfig.class);
        ObjectDeserializer objectDeserializerMock = mock(ObjectDeserializer.class);
        when(objectDeserializerMock.deserialze(org.mockito.ArgumentMatchers.any(), org.mockito.ArgumentMatchers.any(), org.mockito.ArgumentMatchers.any())).thenReturn(null);
        when(parserConfigMock.getDeserializer(any(Type.class))).thenReturn(objectDeserializerMock);
        defaultJSONParser.config = parserConfigMock;
        
        Object actual = defaultJSONParser.parseObject(((Class) null));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testParseObject11() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(4);
        String string = new String("");
        when(jSONLexerMock.stringVal()).thenReturn(string);
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        Class class1 = Object.class;
        
        Object actual = defaultJSONParser.parseObject(class1);
        
        char[] expected = new char[0];
        org.junit.Assert.assertArrayEquals(expected, ((char[]) actual));
        
        Class finalClass1 = class1;
        
        Class expectedFinalClass1 = char[].class;
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expectedFinalClass1, finalClass1));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseObject12() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        Object object = new Object();
        
        defaultJSONParser.parseObject(((Type) null), object);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseObject13() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(4);
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        setField(defaultJSONParser, "config", null);
        Object genericArrayTypeImpl = createInstance("retrofit2.Utils$GenericArrayTypeImpl");
        java.lang.Object[] collectorTaskArray = createArray("java.util.stream.Nodes$CollectorTask", 0);
        
        Class defaultJSONParserClazz = Class.forName("com.alibaba.fastjson.parser.DefaultJSONParser");
        Class genericArrayTypeImplType = Class.forName("java.lang.reflect.Type");
        Class collectorTaskArrayType = Class.forName("java.lang.Object");
        Method parseObjectMethod = defaultJSONParserClazz.getDeclaredMethod("parseObject", genericArrayTypeImplType, collectorTaskArrayType);
        parseObjectMethod.setAccessible(true);
        java.lang.Object[] parseObjectMethodArguments = new java.lang.Object[2];
        parseObjectMethodArguments[0] = genericArrayTypeImpl;
        parseObjectMethodArguments[1] = ((Object) collectorTaskArray);
        try {
            parseObjectMethod.invoke(defaultJSONParser, parseObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testParseObject14() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(0);
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        ParserConfig parserConfigMock = mock(ParserConfig.class);
        ObjectDeserializer objectDeserializerMock = mock(ObjectDeserializer.class);
        org.springframework.cglib.core.DefaultNamingPolicy[] defaultNamingPolicyArray = new org.springframework.cglib.core.DefaultNamingPolicy[0];
        when(objectDeserializerMock.deserialze(org.mockito.ArgumentMatchers.any(), org.mockito.ArgumentMatchers.any(), org.mockito.ArgumentMatchers.any())).thenReturn(((Object) defaultNamingPolicyArray));
        when(parserConfigMock.getDeserializer(any(Type.class))).thenReturn(objectDeserializerMock);
        defaultJSONParser.config = parserConfigMock;
        
        Object actual = defaultJSONParser.parseObject(((Type) null), null);
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(defaultNamingPolicyArray, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testParseObject15() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(4);
        byte[] byteArray = new byte[10];
        when(jSONLexerMock.bytesValue()).thenReturn(byteArray);
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        Class class1 = Object.class;
        
        Object actual = defaultJSONParser.parseObject(class1, null);
        
        assertArrayEquals(byteArray, ((byte[]) actual));
        
        Class finalClass1 = class1;
        
        Class expectedFinalClass1 = byte[].class;
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expectedFinalClass1, finalClass1));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testParseObject16() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(8);
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        
        Object actual = defaultJSONParser.parseObject(((Type) null), null);
        
        assertNull(actual);
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
        
        defaultJSONParser.parseObject(object);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseObject19() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        
        defaultJSONParser.parseObject(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseObject20() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        setField(defaultJSONParser, "config", null);
        java.lang.Object[] forEachOrderedTaskArray = createArray("java.util.stream.ForEachOps$ForEachOrderedTask", 0);
        
        defaultJSONParser.parseObject(forEachOrderedTaskArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseObject21() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(0, 0);
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        ParserConfig parserConfigMock = mock(ParserConfig.class);
        when(parserConfigMock.getDeserializer(any(Type.class))).thenReturn(((ObjectDeserializer) null));
        defaultJSONParser.config = parserConfigMock;
        java.lang.Object[] forEachOrderedTaskArray = createArray("java.util.stream.ForEachOps$ForEachOrderedTask", 0);
        
        defaultJSONParser.parseObject(forEachOrderedTaskArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testParseObject22() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(0, 16, 13);
        when(jSONLexerMock.scanSymbol(org.mockito.ArgumentMatchers.any())).thenReturn(((String) null));
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        ParserConfig parserConfigMock = mock(ParserConfig.class);
        when(parserConfigMock.getDeserializer(any(Type.class))).thenReturn(((ObjectDeserializer) null));
        defaultJSONParser.config = parserConfigMock;
        SymbolTable symbolTableMock = mock(SymbolTable.class);
        setField(defaultJSONParser, "symbolTable", symbolTableMock);
        java.lang.Object[] forEachOrderedTaskArray = createArray("java.util.stream.ForEachOps$ForEachOrderedTask", 0);
        
        defaultJSONParser.parseObject(forEachOrderedTaskArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseObject23() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        
        defaultJSONParser.parseObject(((Map) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testParseObject24() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(0, 13);
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        
        Object actual = defaultJSONParser.parseObject(((Map) null));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseObject25() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(0, 0, 0, 0, 0);
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        
        defaultJSONParser.parseObject(((Map) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testParseObject26() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(8);
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        
        Object actual = defaultJSONParser.parseObject(((Map) null));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseObject27() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        Object object = new Object();
        
        defaultJSONParser.parseObject(((Map) null), object);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testParseObject28() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(8);
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        
        Object actual = defaultJSONParser.parseObject(((Map) null), null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseObject29() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(0, 0, 4);
        when(jSONLexerMock.stringVal()).thenReturn(((String) null));
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        
        defaultJSONParser.parseObject(((Map) null), null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testParseObject30() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(0, 13);
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        
        Object actual = defaultJSONParser.parseObject(((Map) null), null);
        
        assertNull(actual);
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
    
    @Test(timeout = 10000)
    public void testGetInput2() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        Integer integer = Integer.MIN_VALUE;
        setField(defaultJSONParser, "input", integer);
        
        String actual = defaultJSONParser.getInput();
        
        String expected = new String("-2147483648");
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
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
    
    @Test(timeout = 10000)
    public void testGetObject7() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        setField(defaultJSONParser, "contextArrayIndex", 1);
        com.alibaba.fastjson.parser.ParseContext[] parseContextArray = new com.alibaba.fastjson.parser.ParseContext[9];
        ParseContext parseContextMock = mock(ParseContext.class);
        String string = new String("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        when(parseContextMock.toString()).thenReturn(string);
        parseContextMock.object = null;
        parseContextArray[0] = parseContextMock;
        ParseContext parseContext = ((ParseContext) createInstance("com.alibaba.fastjson.parser.ParseContext"));
        parseContext.object = null;
        parseContextArray[1] = parseContext;
        parseContextArray[2] = parseContext;
        parseContextArray[3] = parseContext;
        parseContextArray[4] = parseContext;
        parseContextArray[5] = parseContext;
        parseContextArray[6] = parseContext;
        parseContextArray[7] = parseContext;
        parseContextArray[8] = parseContext;
        setField(defaultJSONParser, "contextArray", parseContextArray);
        
        Object actual = defaultJSONParser.getObject(string);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetObject8() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        setField(defaultJSONParser, "contextArrayIndex", 1);
        com.alibaba.fastjson.parser.ParseContext[] parseContextArray = new com.alibaba.fastjson.parser.ParseContext[9];
        ParseContext parseContextMock = mock(ParseContext.class);
        when(parseContextMock.toString()).thenReturn(((String) null));
        parseContextArray[0] = parseContextMock;
        setField(defaultJSONParser, "contextArray", parseContextArray);
        String string = new String("");
        
        Object actual = defaultJSONParser.getObject(string);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetObject9() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        setField(defaultJSONParser, "contextArrayIndex", 1);
        com.alibaba.fastjson.parser.ParseContext[] parseContextArray = new com.alibaba.fastjson.parser.ParseContext[9];
        ParseContext parseContextMock = mock(ParseContext.class);
        String string = new String("");
        when(parseContextMock.toString()).thenReturn(string);
        parseContextArray[0] = parseContextMock;
        setField(defaultJSONParser, "contextArray", parseContextArray);
        String string1 = new String("\u0000");
        
        Object actual = defaultJSONParser.getObject(string1);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetObject10() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        setField(defaultJSONParser, "contextArrayIndex", 1);
        com.alibaba.fastjson.parser.ParseContext[] parseContextArray = new com.alibaba.fastjson.parser.ParseContext[9];
        ParseContext parseContextMock = mock(ParseContext.class);
        String string = new String("");
        when(parseContextMock.toString()).thenReturn(string);
        parseContextMock.object = null;
        parseContextArray[0] = parseContextMock;
        ParseContext parseContext = ((ParseContext) createInstance("com.alibaba.fastjson.parser.ParseContext"));
        parseContext.object = null;
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
        
        Object actual = defaultJSONParser.getObject(string1);
        
        assertNull(actual);
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
        Object object = new Object();
        
        defaultJSONParser.parse(object);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testParse2() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(8);
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        
        Object actual = defaultJSONParser.parse(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParse3() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(24);
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        
        defaultJSONParser.parse(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParse4() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(17);
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        
        defaultJSONParser.parse(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParse5() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        
        defaultJSONParser.parse();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testParse6() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(20);
        when(jSONLexerMock.isBlankInput()).thenReturn(true);
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        
        Object actual = defaultJSONParser.parse();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParse7() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(15);
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        
        defaultJSONParser.parse();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParse8() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(25);
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        
        defaultJSONParser.parse();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testParse9() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(26);
        byte[] byteArray = new byte[9];
        when(jSONLexerMock.bytesValue()).thenReturn(byteArray);
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        
        Object actual = defaultJSONParser.parse();
        
        assertArrayEquals(byteArray, ((byte[]) actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParse10() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(16);
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        
        defaultJSONParser.parse();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testParse11() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(2);
        when(jSONLexerMock.integerValue()).thenReturn(((Number) null));
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        
        Object actual = defaultJSONParser.parse();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testParse12() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(8);
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        
        Object actual = defaultJSONParser.parse();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParse13() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(17);
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        
        defaultJSONParser.parse();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParse14() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(5);
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        
        defaultJSONParser.parse();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParse15() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(19);
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        
        defaultJSONParser.parse();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testParse16() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(23);
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        
        Object actual = defaultJSONParser.parse();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParse17() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(11);
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        
        defaultJSONParser.parse();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParse18() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(27);
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        
        defaultJSONParser.parse();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParse19() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(13);
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        
        defaultJSONParser.parse();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParse20() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(10);
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        
        defaultJSONParser.parse();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParse21() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(1);
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        
        defaultJSONParser.parse();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParse22() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(20);
        when(jSONLexerMock.isBlankInput()).thenReturn(false);
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        
        defaultJSONParser.parse();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParse23() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(24);
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        
        defaultJSONParser.parse();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testParse24() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(6);
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        
        Object actual = defaultJSONParser.parse();
        
        Boolean expected = false;
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParse25() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(9, 0);
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        
        defaultJSONParser.parse();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParse26() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(18);
        when(jSONLexerMock.stringVal()).thenReturn(((String) null));
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        
        defaultJSONParser.parse();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParse27() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(9, 18, 0);
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        
        defaultJSONParser.parse();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParse28() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(21, 0, 22, 0);
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        
        defaultJSONParser.parse();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParse29() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(21, 21, 0);
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        
        defaultJSONParser.parse();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParse30() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(9, 18, 10, 0);
        Integer integer = 0;
        when(jSONLexerMock.integerValue()).thenReturn(((Number) integer));
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        
        defaultJSONParser.parse();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParse31() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(21, 0, 0, 0);
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        
        defaultJSONParser.parse();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParse32() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        Object object = new Object();
        
        defaultJSONParser.parse(null, object);
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
    public void testSetConfig1() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        ParserConfig parserConfig = new ParserConfig();
        
        defaultJSONParser.setConfig(parserConfig);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetConfig2() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        setField(defaultJSONParser, "config", null);
        
        defaultJSONParser.setConfig(null);
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
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.getLocale()).thenReturn(((java.util.Locale) null));
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        setField(defaultJSONParser, "dateFormat", null);
        setField(defaultJSONParser, "dateFormatPattern", null);
        
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
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testAddContext5() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        setField(defaultJSONParser, "contextArrayIndex", 1073741824);
        com.alibaba.fastjson.parser.ParseContext[] parseContextArray = new com.alibaba.fastjson.parser.ParseContext[6];
        setField(defaultJSONParser, "contextArray", parseContextArray);
        ParseContext parseContextMock = mock(ParseContext.class);
        
        Class defaultJSONParserClazz = Class.forName("com.alibaba.fastjson.parser.DefaultJSONParser");
        Class parseContextMockType = Class.forName("com.alibaba.fastjson.parser.ParseContext");
        Method addContextMethod = defaultJSONParserClazz.getDeclaredMethod("addContext", parseContextMockType);
        addContextMethod.setAccessible(true);
        java.lang.Object[] addContextMethodArguments = new java.lang.Object[1];
        addContextMethodArguments[0] = parseContextMock;
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
        Object wildcardTypeImpl = createInstance("retrofit2.Utils$WildcardTypeImpl");
        
        Class defaultJSONParserClazz = Class.forName("com.alibaba.fastjson.parser.DefaultJSONParser");
        Class wildcardTypeImplType = Class.forName("java.lang.reflect.Type");
        Method parseArrayWithTypeMethod = defaultJSONParserClazz.getDeclaredMethod("parseArrayWithType", wildcardTypeImplType);
        parseArrayWithTypeMethod.setAccessible(true);
        java.lang.Object[] parseArrayWithTypeMethodArguments = new java.lang.Object[1];
        parseArrayWithTypeMethodArguments[0] = wildcardTypeImpl;
        try {
            parseArrayWithTypeMethod.invoke(defaultJSONParser, parseArrayWithTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
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
        sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl parameterizedTypeImpl = ((sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl"));
        java.lang.reflect.Type[] typeArray = new java.lang.reflect.Type[0];
        setField(parameterizedTypeImpl, "actualTypeArguments", typeArray);
        
        defaultJSONParser.parseArrayWithType(parameterizedTypeImpl);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseArrayWithType6() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(0);
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl parameterizedTypeImpl = ((sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl"));
        java.lang.reflect.Type[] typeArray = new java.lang.reflect.Type[1];
        setField(parameterizedTypeImpl, "actualTypeArguments", typeArray);
        
        defaultJSONParser.parseArrayWithType(parameterizedTypeImpl);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseArrayWithType7() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(0);
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl parameterizedTypeImpl = ((sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl"));
        java.lang.reflect.Type[] typeArray = new java.lang.reflect.Type[1];
        WildcardTypeImpl wildcardTypeImpl = ((WildcardTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.WildcardTypeImpl"));
        java.lang.reflect.Type[] typeArray1 = new java.lang.reflect.Type[0];
        setField(wildcardTypeImpl, "upperBounds", typeArray1);
        typeArray[0] = ((Type) wildcardTypeImpl);
        setField(parameterizedTypeImpl, "actualTypeArguments", typeArray);
        
        defaultJSONParser.parseArrayWithType(parameterizedTypeImpl);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseArrayWithType8() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(0);
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl parameterizedTypeImpl = ((sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl"));
        java.lang.reflect.Type[] typeArray = new java.lang.reflect.Type[0];
        setField(parameterizedTypeImpl, "actualTypeArguments", typeArray);
        
        defaultJSONParser.parseArrayWithType(parameterizedTypeImpl);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseArrayWithType9() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(0);
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl parameterizedTypeImpl = ((sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl"));
        java.lang.reflect.Type[] typeArray = new java.lang.reflect.Type[1];
        TypeVariableImpl typeVariableImpl = ((TypeVariableImpl) createInstance("sun.reflect.generics.reflectiveObjects.TypeVariableImpl"));
        java.lang.reflect.Type[] typeArray1 = new java.lang.reflect.Type[0];
        setField(typeVariableImpl, "bounds", typeArray1);
        typeArray[0] = ((Type) typeVariableImpl);
        setField(parameterizedTypeImpl, "actualTypeArguments", typeArray);
        
        defaultJSONParser.parseArrayWithType(parameterizedTypeImpl);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseArrayWithType10() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(0);
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl parameterizedTypeImpl = ((sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl"));
        java.lang.reflect.Type[] typeArray = new java.lang.reflect.Type[1];
        TypeVariableImpl typeVariableImpl = ((TypeVariableImpl) createInstance("sun.reflect.generics.reflectiveObjects.TypeVariableImpl"));
        java.lang.reflect.Type[] typeArray1 = new java.lang.reflect.Type[1];
        typeArray1[0] = ((Type) typeVariableImpl);
        setField(typeVariableImpl, "bounds", typeArray1);
        typeArray[0] = ((Type) typeVariableImpl);
        setField(parameterizedTypeImpl, "actualTypeArguments", typeArray);
        
        defaultJSONParser.parseArrayWithType(parameterizedTypeImpl);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseArrayWithType11() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(0);
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl parameterizedTypeImpl = ((sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl"));
        java.lang.reflect.Type[] typeArray = new java.lang.reflect.Type[1];
        WildcardTypeImpl wildcardTypeImpl = ((WildcardTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.WildcardTypeImpl"));
        java.lang.reflect.Type[] typeArray1 = new java.lang.reflect.Type[0];
        setField(wildcardTypeImpl, "upperBounds", typeArray1);
        typeArray[0] = ((Type) wildcardTypeImpl);
        setField(parameterizedTypeImpl, "actualTypeArguments", typeArray);
        
        defaultJSONParser.parseArrayWithType(parameterizedTypeImpl);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseArrayWithType12() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(0);
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl parameterizedTypeImpl = ((sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl"));
        java.lang.reflect.Type[] typeArray = new java.lang.reflect.Type[1];
        TypeVariableImpl typeVariableImpl = ((TypeVariableImpl) createInstance("sun.reflect.generics.reflectiveObjects.TypeVariableImpl"));
        java.lang.reflect.Type[] typeArray1 = new java.lang.reflect.Type[0];
        setField(typeVariableImpl, "bounds", typeArray1);
        typeArray[0] = ((Type) typeVariableImpl);
        setField(parameterizedTypeImpl, "actualTypeArguments", typeArray);
        
        defaultJSONParser.parseArrayWithType(parameterizedTypeImpl);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseArrayWithType13() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(0);
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl parameterizedTypeImpl = ((sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl"));
        java.lang.reflect.Type[] typeArray = new java.lang.reflect.Type[1];
        WildcardTypeImpl wildcardTypeImpl = ((WildcardTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.WildcardTypeImpl"));
        java.lang.reflect.Type[] typeArray1 = new java.lang.reflect.Type[0];
        setField(wildcardTypeImpl, "lowerBounds", typeArray1);
        java.lang.reflect.Type[] typeArray2 = new java.lang.reflect.Type[1];
        Class class1 = Object.class;
        typeArray2[0] = ((Type) class1);
        setField(wildcardTypeImpl, "upperBounds", typeArray2);
        typeArray[0] = ((Type) wildcardTypeImpl);
        setField(parameterizedTypeImpl, "actualTypeArguments", typeArray);
        
        defaultJSONParser.parseArrayWithType(parameterizedTypeImpl);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseArrayWithType14() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(0);
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl parameterizedTypeImpl = ((sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl"));
        java.lang.reflect.Type[] typeArray = new java.lang.reflect.Type[1];
        WildcardTypeImpl wildcardTypeImpl = ((WildcardTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.WildcardTypeImpl"));
        java.lang.reflect.Type[] typeArray1 = new java.lang.reflect.Type[16];
        setField(wildcardTypeImpl, "lowerBounds", typeArray1);
        java.lang.reflect.Type[] typeArray2 = new java.lang.reflect.Type[1];
        Class class1 = Object.class;
        typeArray2[0] = ((Type) class1);
        setField(wildcardTypeImpl, "upperBounds", typeArray2);
        typeArray[0] = ((Type) wildcardTypeImpl);
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
        String string = new String("");
        when(jSONLexerMock.stringVal()).thenReturn(string);
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
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testAcceptType8() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(4);
        String string = new String("\u0000\u0000\u0000");
        when(jSONLexerMock.stringVal()).thenReturn(string);
        setField(defaultJSONParser, "lexer", jSONLexerMock);
        String string1 = new String("\u0001\u0000\u0000");
        
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
        java.text.CollationElementIterator[] collationElementIteratorArray = new java.text.CollationElementIterator[0];
        
        defaultJSONParser.checkMapResolve(null, collationElementIteratorArray);
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
        
        defaultJSONParser.getLastResolveTask();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetLastResolveTask3() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        ArrayList arrayList = new ArrayList();
        com.alibaba.fastjson.parser.DefaultJSONParser[] defaultJSONParserArray = new com.alibaba.fastjson.parser.DefaultJSONParser[0];
        arrayList.add(defaultJSONParserArray);
        setField(defaultJSONParser, "resolveTaskList", arrayList);
        
        defaultJSONParser.getLastResolveTask();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetLastResolveTask4() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        ArrayList arrayList = new ArrayList();
        DefaultJSONParser.ResolveTask resolveTask = ((DefaultJSONParser.ResolveTask) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser$ResolveTask"));
        arrayList.add(resolveTask);
        setField(defaultJSONParser, "resolveTaskList", arrayList);
        
        DefaultJSONParser.ResolveTask actual = defaultJSONParser.getLastResolveTask();
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(resolveTask, actual));
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
    public void testResolveReference7() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        setField(defaultJSONParser, "contextArrayIndex", 1);
        com.alibaba.fastjson.parser.ParseContext[] parseContextArray = new com.alibaba.fastjson.parser.ParseContext[9];
        ParseContext parseContextMock = mock(ParseContext.class);
        String string = new String("");
        when(parseContextMock.toString()).thenReturn(string);
        parseContextMock.object = null;
        parseContextArray[0] = parseContextMock;
        ParseContext parseContext = ((ParseContext) createInstance("com.alibaba.fastjson.parser.ParseContext"));
        parseContext.object = null;
        parseContextArray[1] = parseContext;
        parseContextArray[2] = parseContext;
        parseContextArray[3] = parseContext;
        parseContextArray[4] = parseContext;
        parseContextArray[5] = parseContext;
        parseContextArray[6] = parseContext;
        parseContextArray[7] = parseContext;
        parseContextArray[8] = parseContext;
        setField(defaultJSONParser, "contextArray", parseContextArray);
        
        Object actual = defaultJSONParser.resolveReference(string);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testResolveReference8() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        setField(defaultJSONParser, "contextArrayIndex", 1);
        com.alibaba.fastjson.parser.ParseContext[] parseContextArray = new com.alibaba.fastjson.parser.ParseContext[1];
        ParseContext parseContextMock = mock(ParseContext.class);
        String string = new String("");
        when(parseContextMock.toString()).thenReturn(string);
        parseContextArray[0] = parseContextMock;
        setField(defaultJSONParser, "contextArray", parseContextArray);
        
        Object actual = defaultJSONParser.resolveReference(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testResolveReference9() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        setField(defaultJSONParser, "contextArrayIndex", 1);
        com.alibaba.fastjson.parser.ParseContext[] parseContextArray = new com.alibaba.fastjson.parser.ParseContext[1];
        ParseContext parseContextMock = mock(ParseContext.class);
        String string = new String("\u0000");
        when(parseContextMock.toString()).thenReturn(string);
        parseContextArray[0] = parseContextMock;
        setField(defaultJSONParser, "contextArray", parseContextArray);
        String string1 = new String("");
        
        Object actual = defaultJSONParser.resolveReference(string1);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testResolveReference10() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        setField(defaultJSONParser, "contextArrayIndex", 1);
        com.alibaba.fastjson.parser.ParseContext[] parseContextArray = new com.alibaba.fastjson.parser.ParseContext[9];
        ParseContext parseContextMock = mock(ParseContext.class);
        String string = new String("");
        when(parseContextMock.toString()).thenReturn(string);
        parseContextMock.object = null;
        parseContextArray[0] = parseContextMock;
        setField(defaultJSONParser, "contextArray", parseContextArray);
        String string1 = new String("");
        
        Object actual = defaultJSONParser.resolveReference(string1);
        
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
        
        defaultJSONParser.handleResovleTask(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testHandleResovleTask3() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        ArrayList arrayList = new ArrayList();
        setField(defaultJSONParser, "resolveTaskList", arrayList);
        
        defaultJSONParser.handleResovleTask(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testHandleResovleTask4() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        ArrayList arrayList = new ArrayList();
        byte[] byteArray = new byte[0];
        arrayList.add(byteArray);
        arrayList.add(null);
        arrayList.add(null);
        setField(defaultJSONParser, "resolveTaskList", arrayList);
        
        defaultJSONParser.handleResovleTask(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testHandleResovleTask5() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        setField(defaultJSONParser, "resolveTaskList", arrayList);
        java.lang.Object[] sliceTaskArray = createArray("java.util.stream.SliceOps$SliceTask", 0);
        
        defaultJSONParser.handleResovleTask(sliceTaskArray);
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
    public void testDefaultJSONParser1() {
        char[] charArray = new char[0];
        ParserConfig parserConfig = new ParserConfig();
        DefaultJSONParser actual = new DefaultJSONParser(charArray, 0, parserConfig, 0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDefaultJSONParser2() throws Throwable  {
        char[] charArray = new char[0];
        ParserConfig parserConfigMock = mock(ParserConfig.class);
        new DefaultJSONParser(charArray, 2147483646, parserConfigMock, 0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDefaultJSONParser3() {
        String string = new String();
        ParserConfig parserConfig = new ParserConfig();
        DefaultJSONParser actual = new DefaultJSONParser(string, parserConfig, 0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDefaultJSONParser4() {
        String string = new String();
        ParserConfig parserConfig = new ParserConfig();
        DefaultJSONParser actual = new DefaultJSONParser(string, parserConfig);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDefaultJSONParser5() {
        String string = new String();
        DefaultJSONParser actual = new DefaultJSONParser(string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDefaultJSONParser6() {
        Object object = new Object();
        ParserConfig parserConfig = new ParserConfig();
        new DefaultJSONParser(object, ((JSONLexer) null), parserConfig);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDefaultJSONParser7() {
        ParserConfig parserConfig = new ParserConfig();
        new DefaultJSONParser(((JSONLexer) null), parserConfig);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDefaultJSONParser8() {
        new DefaultJSONParser(((JSONLexer) null));
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
