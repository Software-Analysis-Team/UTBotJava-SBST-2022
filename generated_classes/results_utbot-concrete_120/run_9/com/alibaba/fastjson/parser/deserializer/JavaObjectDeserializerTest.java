package com.alibaba.fastjson.parser.deserializer;

import org.junit.Test;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.JSONScanner;
import sun.reflect.generics.reflectiveObjects.GenericArrayTypeImpl;
import sun.reflect.generics.reflectiveObjects.TypeVariableImpl;
import java.lang.reflect.Type;
import com.alibaba.fastjson.parser.JSONLexer;
import com.alibaba.fastjson.parser.DefaultExtJSONParser;
import com.alibaba.fastjson.parser.JSONReaderScanner;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import sun.misc.Unsafe;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class JavaObjectDeserializerTest {
    ///region
    
    @Test(timeout = 10000)
    public void testGetFastMatchToken1() throws Throwable  {
        JavaObjectDeserializer javaObjectDeserializer = new JavaObjectDeserializer();
        
        int actual = javaObjectDeserializer.getFastMatchToken();
        
        assertEquals(12, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetFastMatchToken2() throws Throwable  {
        JavaObjectDeserializer javaObjectDeserializer = ((JavaObjectDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.JavaObjectDeserializer"));
        
        int actual = javaObjectDeserializer.getFastMatchToken();
        
        assertEquals(12, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDeserialze1() throws Throwable  {
        JavaObjectDeserializer javaObjectDeserializer = new JavaObjectDeserializer();
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        Object object = new Object();
        
        javaObjectDeserializer.deserialze(defaultJSONParser, null, object);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDeserialze2() throws Throwable  {
        JavaObjectDeserializer javaObjectDeserializer = ((JavaObjectDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.JavaObjectDeserializer"));
        Class class1 = Object.class;
        
        javaObjectDeserializer.deserialze(null, class1, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDeserialze3() throws Throwable  {
        JavaObjectDeserializer javaObjectDeserializer = ((JavaObjectDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.JavaObjectDeserializer"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "token", 5);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        javaObjectDeserializer.deserialze(defaultJSONParser, null, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDeserialze4() throws Throwable  {
        JavaObjectDeserializer javaObjectDeserializer = ((JavaObjectDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.JavaObjectDeserializer"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        GenericArrayTypeImpl genericArrayTypeImpl = ((GenericArrayTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.GenericArrayTypeImpl"));
        TypeVariableImpl typeVariableImpl = ((TypeVariableImpl) createInstance("sun.reflect.generics.reflectiveObjects.TypeVariableImpl"));
        java.lang.reflect.Type[] typeArray = new java.lang.reflect.Type[0];
        setField(typeVariableImpl, "bounds", typeArray);
        setField(genericArrayTypeImpl, "genericComponentType", typeVariableImpl);
        
        javaObjectDeserializer.deserialze(defaultJSONParser, genericArrayTypeImpl, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDeserialze5() throws Throwable  {
        JavaObjectDeserializer javaObjectDeserializer = ((JavaObjectDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.JavaObjectDeserializer"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "token", 22);
        setField(defaultJSONParser, "lexer", jSONScanner);
        Class class1 = Object.class;
        
        javaObjectDeserializer.deserialze(defaultJSONParser, class1, null);
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerToken = getFieldValue(jSONLexer, "token");
        
        assertEquals(20, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDeserialze6() throws Throwable  {
        JavaObjectDeserializer javaObjectDeserializer = ((JavaObjectDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.JavaObjectDeserializer"));
        DefaultExtJSONParser defaultExtJSONParser = ((DefaultExtJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultExtJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '\"');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 8);
        setField(defaultExtJSONParser, "lexer", jSONScanner);
        Class class1 = Object.class;
        
        javaObjectDeserializer.deserialze(defaultExtJSONParser, class1, null);
        
        JSONLexer jSONLexer = defaultExtJSONParser.lexer;
        Object finalDefaultExtJSONParserLexerBp = getFieldValue(jSONLexer, "bp");
        JSONLexer jSONLexer1 = defaultExtJSONParser.lexer;
        Object finalDefaultExtJSONParserLexerCh = getFieldValue(jSONLexer1, "ch");
        
        assertEquals(1, finalDefaultExtJSONParserLexerBp);
        
        assertEquals('\u001A', finalDefaultExtJSONParserLexerCh);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDeserialze7() throws Throwable  {
        JavaObjectDeserializer javaObjectDeserializer = ((JavaObjectDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.JavaObjectDeserializer"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '/');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 6);
        setField(jSONScanner, "len", 0);
        setField(defaultJSONParser, "lexer", jSONScanner);
        Class class1 = Object.class;
        
        javaObjectDeserializer.deserialze(defaultJSONParser, class1, null);
        
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
    public void testDeserialze8() throws Throwable  {
        JavaObjectDeserializer javaObjectDeserializer = ((JavaObjectDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.JavaObjectDeserializer"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "hasSpecial", false);
        setField(jSONScanner, "np", 0);
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", 'T');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 6);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        javaObjectDeserializer.deserialze(defaultJSONParser, null, null);
        
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
    public void testDeserialze9() throws Throwable  {
        JavaObjectDeserializer javaObjectDeserializer = ((JavaObjectDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.JavaObjectDeserializer"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '\t');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 21);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        javaObjectDeserializer.deserialze(defaultJSONParser, null, null);
        
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
    public void testDeserialze10() throws Throwable  {
        JavaObjectDeserializer javaObjectDeserializer = ((JavaObjectDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.JavaObjectDeserializer"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '\u0000');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 21);
        setField(defaultJSONParser, "lexer", jSONScanner);
        Class class1 = Object.class;
        
        javaObjectDeserializer.deserialze(defaultJSONParser, class1, null);
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerToken = getFieldValue(jSONLexer, "token");
        
        assertEquals(20, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDeserialze11() throws Throwable  {
        JavaObjectDeserializer javaObjectDeserializer = ((JavaObjectDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.JavaObjectDeserializer"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "hasSpecial", false);
        setField(jSONScanner, "np", 0);
        setField(jSONScanner, "token", 4);
        setField(defaultJSONParser, "lexer", jSONScanner);
        Class class1 = Object.class;
        
        javaObjectDeserializer.deserialze(defaultJSONParser, class1, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDeserialze12() throws Throwable  {
        JavaObjectDeserializer javaObjectDeserializer = ((JavaObjectDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.JavaObjectDeserializer"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", ']');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 8);
        setField(jSONScanner, "len", 0);
        setField(defaultJSONParser, "lexer", jSONScanner);
        Class class1 = Object.class;
        
        Object actual = javaObjectDeserializer.deserialze(defaultJSONParser, class1, null);
        
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
    public void testDeserialze13() throws Throwable  {
        JavaObjectDeserializer javaObjectDeserializer = ((JavaObjectDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.JavaObjectDeserializer"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", 't');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 8);
        setField(defaultJSONParser, "lexer", jSONScanner);
        Class class1 = Object.class;
        
        javaObjectDeserializer.deserialze(defaultJSONParser, class1, null);
        
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
    public void testDeserialze14() throws Throwable  {
        JavaObjectDeserializer javaObjectDeserializer = ((JavaObjectDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.JavaObjectDeserializer"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", Integer.MAX_VALUE);
        setField(jSONScanner, "ch", '/');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 23);
        setField(jSONScanner, "len", 1);
        String string = new String("");
        setField(jSONScanner, "text", string);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        javaObjectDeserializer.deserialze(defaultJSONParser, null, null);
        
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
    public void testDeserialze15() throws Throwable  {
        JavaObjectDeserializer javaObjectDeserializer = ((JavaObjectDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.JavaObjectDeserializer"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", 'x');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 23);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        javaObjectDeserializer.deserialze(defaultJSONParser, null, null);
        
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
    public void testDeserialze16() throws Throwable  {
        JavaObjectDeserializer javaObjectDeserializer = ((JavaObjectDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.JavaObjectDeserializer"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '\'');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 21);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        javaObjectDeserializer.deserialze(defaultJSONParser, null, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDeserialze17() throws Throwable  {
        JavaObjectDeserializer javaObjectDeserializer = ((JavaObjectDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.JavaObjectDeserializer"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONReaderScanner jSONReaderScanner = ((JSONReaderScanner) createInstance("com.alibaba.fastjson.parser.JSONReaderScanner"));
        setField(jSONReaderScanner, "token", 20);
        char[] charArray = new char[9];
        charArray[0] = '\r';
        setField(jSONReaderScanner, "buf", charArray);
        setField(defaultJSONParser, "lexer", jSONReaderScanner);
        
        javaObjectDeserializer.deserialze(defaultJSONParser, null, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testJavaObjectDeserializer1() {
        JavaObjectDeserializer actual = new JavaObjectDeserializer();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testJavaObjectDeserializer2() {
        JavaObjectDeserializer actual = new JavaObjectDeserializer();
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
    private static sun.misc.Unsafe getUnsafeInstance() throws Exception {
        java.lang.reflect.Field f = sun.misc.Unsafe.class.getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return (sun.misc.Unsafe) f.get(null);
    }
}
