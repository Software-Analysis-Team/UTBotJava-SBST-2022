package com.alibaba.fastjson.serializer;

import org.junit.Test;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.JSONLexer;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Array;
import sun.misc.Unsafe;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mockStatic;
import static org.junit.Assert.assertEquals;

public class CharArrayCodecTest {
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
    
    @Test(timeout = 10000)
    public void testDeserialze2() throws Throwable  {
        CharArrayCodec charArrayCodec = ((CharArrayCodec) createInstance("com.alibaba.fastjson.serializer.CharArrayCodec"));
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(4);
        String string = new String("");
        when(jSONLexerMock.stringVal()).thenReturn(string);
        setField(defaultJSONParserMock, "lexer", jSONLexerMock);
        
        Object actual = charArrayCodec.deserialze(defaultJSONParserMock, null, null);
        
        char[] expected = new char[0];
        assertArrayEquals(expected, ((char[]) actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDeserialze3() throws Throwable  {
        CharArrayCodec charArrayCodec = ((CharArrayCodec) createInstance("com.alibaba.fastjson.serializer.CharArrayCodec"));
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(0, 2);
        Integer integer = Integer.MIN_VALUE;
        when(jSONLexerMock.integerValue()).thenReturn(((Number) integer));
        setField(defaultJSONParserMock, "lexer", jSONLexerMock);
        
        Object actual = charArrayCodec.deserialze(defaultJSONParserMock, null, null);
        
        char[] expected = new char[11];
        expected[0] = '-';
        expected[1] = '2';
        expected[2] = '1';
        expected[3] = '4';
        expected[4] = '7';
        expected[5] = '4';
        expected[6] = '8';
        expected[7] = '3';
        expected[8] = '6';
        expected[9] = '4';
        expected[10] = '8';
        assertArrayEquals(expected, ((char[]) actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDeserialze4() throws Throwable  {
        CharArrayCodec charArrayCodec = ((CharArrayCodec) createInstance("com.alibaba.fastjson.serializer.CharArrayCodec"));
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        String string = ((String) createInstance("java.lang.String"));
        when(defaultJSONParserMock.parse()).thenReturn(((Object) string));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(0, 0);
        setField(defaultJSONParserMock, "lexer", jSONLexerMock);
        
        Object actual = charArrayCodec.deserialze(defaultJSONParserMock, null, null);
        
        char[] expected = new char[0];
        assertArrayEquals(expected, ((char[]) actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDeserialze5() throws Throwable  {
        CharArrayCodec charArrayCodec = ((CharArrayCodec) createInstance("com.alibaba.fastjson.serializer.CharArrayCodec"));
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        when(defaultJSONParserMock.parse()).thenReturn(null);
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(0, 0);
        setField(defaultJSONParserMock, "lexer", jSONLexerMock);
        
        Object actual = charArrayCodec.deserialze(defaultJSONParserMock, null, null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDeserialze6() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(com.alibaba.fastjson.JSON.class);
            String string = new String("");
            mockedStatic.when(() -> {
                com.alibaba.fastjson.JSON.toJSONString(any());
            }).thenReturn(string);
            CharArrayCodec charArrayCodec = ((CharArrayCodec) createInstance("com.alibaba.fastjson.serializer.CharArrayCodec"));
            DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
            java.lang.Object[] unmodifiableMapArray = createArray("java.util.Collections$UnmodifiableMap", 0);
            when(defaultJSONParserMock.parse()).thenReturn(((Object) unmodifiableMapArray));
            JSONLexer jSONLexerMock = mock(JSONLexer.class);
            when(jSONLexerMock.token()).thenReturn(0, 0);
            setField(defaultJSONParserMock, "lexer", jSONLexerMock);
            
            Object actual = charArrayCodec.deserialze(defaultJSONParserMock, null, null);
            
            char[] expected = new char[0];
            assertArrayEquals(expected, ((char[]) actual));
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDeserialze7() throws Throwable  {
        CharArrayCodec charArrayCodec = ((CharArrayCodec) createInstance("com.alibaba.fastjson.serializer.CharArrayCodec"));
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(0, 2);
        Long long1 = java.lang.Long.MIN_VALUE;
        when(jSONLexerMock.integerValue()).thenReturn(((Number) long1));
        setField(defaultJSONParserMock, "lexer", jSONLexerMock);
        
        Object actual = charArrayCodec.deserialze(defaultJSONParserMock, null, null);
        
        char[] expected = new char[20];
        expected[0] = '-';
        expected[1] = '9';
        expected[2] = '2';
        expected[3] = '2';
        expected[4] = '3';
        expected[5] = '3';
        expected[6] = '7';
        expected[7] = '2';
        expected[8] = '0';
        expected[9] = '3';
        expected[10] = '6';
        expected[11] = '8';
        expected[12] = '5';
        expected[13] = '4';
        expected[14] = '7';
        expected[15] = '7';
        expected[16] = '5';
        expected[17] = '8';
        expected[18] = '0';
        expected[19] = '8';
        assertArrayEquals(expected, ((char[]) actual));
    }
    ///endregion
    
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
    public void testDeserialze8() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        
        CharArrayCodec.deserialze(defaultJSONParser);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDeserialze9() throws Throwable  {
        CharArrayCodec.deserialze(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDeserialze10() throws Throwable  {
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(4);
        when(jSONLexerMock.stringVal()).thenReturn(((String) null));
        setField(defaultJSONParserMock, "lexer", jSONLexerMock);
        
        CharArrayCodec.deserialze(defaultJSONParserMock);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDeserialze11() throws Throwable  {
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(0, 2);
        when(jSONLexerMock.integerValue()).thenReturn(((Number) null));
        setField(defaultJSONParserMock, "lexer", jSONLexerMock);
        
        CharArrayCodec.deserialze(defaultJSONParserMock);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDeserialze12() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(com.alibaba.fastjson.JSON.class);
            mockedStatic.when(() -> {
                com.alibaba.fastjson.JSON.toJSONString(any());
            }).thenReturn(((String) null));
            DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
            java.lang.Object[] integerToEnumArray = createArray("org.springframework.core.convert.support.IntegerToEnumConverterFactory$IntegerToEnum", 0);
            when(defaultJSONParserMock.parse()).thenReturn(((Object) integerToEnumArray));
            JSONLexer jSONLexerMock = mock(JSONLexer.class);
            when(jSONLexerMock.token()).thenReturn(0, 0);
            setField(defaultJSONParserMock, "lexer", jSONLexerMock);
            
            CharArrayCodec.deserialze(defaultJSONParserMock);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDeserialze13() throws Throwable  {
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        when(defaultJSONParserMock.parse()).thenReturn(null);
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(0, 0);
        setField(defaultJSONParserMock, "lexer", jSONLexerMock);
        
        Object actual = CharArrayCodec.deserialze(defaultJSONParserMock);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDeserialze14() throws Throwable  {
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(4);
        String string = new String("");
        when(jSONLexerMock.stringVal()).thenReturn(string);
        setField(defaultJSONParserMock, "lexer", jSONLexerMock);
        
        Object actual = CharArrayCodec.deserialze(defaultJSONParserMock);
        
        char[] expected = new char[0];
        assertArrayEquals(expected, ((char[]) actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDeserialze15() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(com.alibaba.fastjson.JSON.class);
            String string = new String("");
            mockedStatic.when(() -> {
                com.alibaba.fastjson.JSON.toJSONString(any());
            }).thenReturn(string);
            DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
            java.lang.Object[] entryArray = createArray("java.util.TreeMap$Entry", 0);
            when(defaultJSONParserMock.parse()).thenReturn(((Object) entryArray));
            JSONLexer jSONLexerMock = mock(JSONLexer.class);
            when(jSONLexerMock.token()).thenReturn(0, 0);
            setField(defaultJSONParserMock, "lexer", jSONLexerMock);
            
            Object actual = CharArrayCodec.deserialze(defaultJSONParserMock);
            
            char[] expected = new char[0];
            assertArrayEquals(expected, ((char[]) actual));
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDeserialze16() throws Throwable  {
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        String string = ((String) createInstance("java.lang.String"));
        when(defaultJSONParserMock.parse()).thenReturn(((Object) string));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(0, 0);
        setField(defaultJSONParserMock, "lexer", jSONLexerMock);
        
        Object actual = CharArrayCodec.deserialze(defaultJSONParserMock);
        
        char[] expected = new char[0];
        assertArrayEquals(expected, ((char[]) actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDeserialze17() throws Throwable  {
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(0, 2);
        Integer integer = Integer.MIN_VALUE;
        when(jSONLexerMock.integerValue()).thenReturn(((Number) integer));
        setField(defaultJSONParserMock, "lexer", jSONLexerMock);
        
        Object actual = CharArrayCodec.deserialze(defaultJSONParserMock);
        
        char[] expected = new char[11];
        expected[0] = '-';
        expected[1] = '2';
        expected[2] = '1';
        expected[3] = '4';
        expected[4] = '7';
        expected[5] = '4';
        expected[6] = '8';
        expected[7] = '3';
        expected[8] = '6';
        expected[9] = '4';
        expected[10] = '8';
        assertArrayEquals(expected, ((char[]) actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDeserialze18() throws Throwable  {
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(0, 2);
        Long long1 = java.lang.Long.MIN_VALUE;
        when(jSONLexerMock.integerValue()).thenReturn(((Number) long1));
        setField(defaultJSONParserMock, "lexer", jSONLexerMock);
        
        Object actual = CharArrayCodec.deserialze(defaultJSONParserMock);
        
        char[] expected = new char[20];
        expected[0] = '-';
        expected[1] = '9';
        expected[2] = '2';
        expected[3] = '2';
        expected[4] = '3';
        expected[5] = '3';
        expected[6] = '7';
        expected[7] = '2';
        expected[8] = '0';
        expected[9] = '3';
        expected[10] = '6';
        expected[11] = '8';
        expected[12] = '5';
        expected[13] = '4';
        expected[14] = '7';
        expected[15] = '7';
        expected[16] = '5';
        expected[17] = '8';
        expected[18] = '0';
        expected[19] = '8';
        assertArrayEquals(expected, ((char[]) actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDeserialze19() throws Throwable  {
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(0, 2);
        Integer integer = -4;
        when(jSONLexerMock.integerValue()).thenReturn(((Number) integer));
        setField(defaultJSONParserMock, "lexer", jSONLexerMock);
        
        Object actual = CharArrayCodec.deserialze(defaultJSONParserMock);
        
        char[] expected = new char[2];
        expected[0] = '-';
        expected[1] = '4';
        assertArrayEquals(expected, ((char[]) actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDeserialze20() throws Throwable  {
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(0, 2);
        Long long1 = 10000L;
        when(jSONLexerMock.integerValue()).thenReturn(((Number) long1));
        setField(defaultJSONParserMock, "lexer", jSONLexerMock);
        
        Object actual = CharArrayCodec.deserialze(defaultJSONParserMock);
        
        char[] expected = new char[5];
        expected[0] = '1';
        expected[1] = '0';
        expected[2] = '0';
        expected[3] = '0';
        expected[4] = '0';
        assertArrayEquals(expected, ((char[]) actual));
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
    private static sun.misc.Unsafe getUnsafeInstance() throws Exception {
        java.lang.reflect.Field f = sun.misc.Unsafe.class.getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return (sun.misc.Unsafe) f.get(null);
    }
}
