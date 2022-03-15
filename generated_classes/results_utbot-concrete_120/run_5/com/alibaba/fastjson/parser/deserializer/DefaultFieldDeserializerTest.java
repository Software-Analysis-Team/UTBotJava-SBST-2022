package com.alibaba.fastjson.parser.deserializer;

import org.junit.Test;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import java.lang.reflect.Type;
import java.util.Map;
import com.alibaba.fastjson.util.FieldInfo;
import sun.reflect.generics.reflectiveObjects.WildcardTypeImpl;
import java.lang.reflect.Method;
import com.alibaba.fastjson.parser.JSONScanner;
import com.alibaba.fastjson.parser.JSONLexer;
import com.alibaba.fastjson.parser.DefaultExtJSONParser;
import sun.reflect.generics.reflectiveObjects.TypeVariableImpl;
import com.alibaba.fastjson.parser.ParseContext;
import com.alibaba.fastjson.util.ParameterizedTypeImpl;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.util.IdentityHashMap;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Array;
import java.util.Objects;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Iterator;
import sun.misc.Unsafe;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class DefaultFieldDeserializerTest {
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseField1() throws Throwable  {
        DefaultFieldDeserializer defaultFieldDeserializer = ((DefaultFieldDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.DefaultFieldDeserializer"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        Object object = new Object();
        
        defaultFieldDeserializer.parseField(defaultJSONParser, object, ((Type) null), ((Map) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseField2() throws Throwable  {
        DefaultFieldDeserializer defaultFieldDeserializer = ((DefaultFieldDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.DefaultFieldDeserializer"));
        setField(defaultFieldDeserializer, "fieldValueDeserilizer", null);
        
        defaultFieldDeserializer.parseField(((DefaultJSONParser) null), null, ((Type) null), ((Map) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseField3() throws Throwable  {
        DefaultFieldDeserializer defaultFieldDeserializer = ((DefaultFieldDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.DefaultFieldDeserializer"));
        FieldInfo fieldInfo = ((FieldInfo) createInstance("com.alibaba.fastjson.util.FieldInfo"));
        WildcardTypeImpl wildcardTypeImpl = ((WildcardTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.WildcardTypeImpl"));
        setField(fieldInfo, "fieldType", wildcardTypeImpl);
        setField(defaultFieldDeserializer, "fieldInfo", fieldInfo);
        JavaBeanDeserializer javaBeanDeserializer = ((JavaBeanDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer"));
        setField(defaultFieldDeserializer, "fieldValueDeserilizer", javaBeanDeserializer);
        Object parameterizedTypeImpl = createInstance("retrofit2.Utils$ParameterizedTypeImpl");
        
        Class defaultFieldDeserializerClazz = Class.forName("com.alibaba.fastjson.parser.deserializer.DefaultFieldDeserializer");
        Class defaultJSONParserType = Class.forName("com.alibaba.fastjson.parser.DefaultJSONParser");
        Class objectType = Class.forName("java.lang.Object");
        Class parameterizedTypeImplType = Class.forName("java.lang.reflect.Type");
        Class mapType = Class.forName("java.util.Map");
        Method parseFieldMethod = defaultFieldDeserializerClazz.getDeclaredMethod("parseField", defaultJSONParserType, objectType, parameterizedTypeImplType, mapType);
        parseFieldMethod.setAccessible(true);
        java.lang.Object[] parseFieldMethodArguments = new java.lang.Object[4];
        parseFieldMethodArguments[0] = null;
        parseFieldMethodArguments[1] = null;
        parseFieldMethodArguments[2] = parameterizedTypeImpl;
        parseFieldMethodArguments[3] = null;
        try {
            parseFieldMethod.invoke(defaultFieldDeserializer, parseFieldMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseField4() throws Throwable  {
        DefaultFieldDeserializer defaultFieldDeserializer = ((DefaultFieldDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.DefaultFieldDeserializer"));
        FieldInfo fieldInfo = ((FieldInfo) createInstance("com.alibaba.fastjson.util.FieldInfo"));
        setField(fieldInfo, "parserFeatures", 1);
        Class class1 = Object.class;
        setField(fieldInfo, "fieldType", class1);
        String string = new String("");
        setField(fieldInfo, "name", string);
        setField(defaultFieldDeserializer, "fieldInfo", fieldInfo);
        JavaBeanDeserializer javaBeanDeserializer = ((JavaBeanDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer"));
        setField(defaultFieldDeserializer, "fieldValueDeserilizer", javaBeanDeserializer);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "token", 4);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultFieldDeserializer.parseField(defaultJSONParser, null, class1, ((Map) null));
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerToken = getFieldValue(jSONLexer, "token");
        
        assertEquals(20, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseField5() throws Throwable  {
        DefaultFieldDeserializer defaultFieldDeserializer = ((DefaultFieldDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.DefaultFieldDeserializer"));
        FieldInfo fieldInfo = ((FieldInfo) createInstance("com.alibaba.fastjson.util.FieldInfo"));
        String string = new String("");
        setField(fieldInfo, "format", string);
        setField(fieldInfo, "parserFeatures", 0);
        WildcardTypeImpl wildcardTypeImpl = ((WildcardTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.WildcardTypeImpl"));
        setField(fieldInfo, "fieldType", wildcardTypeImpl);
        setField(fieldInfo, "name", string);
        setField(defaultFieldDeserializer, "fieldInfo", fieldInfo);
        Jdk8DateCodec jdk8DateCodec = ((Jdk8DateCodec) createInstance("com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec"));
        setField(defaultFieldDeserializer, "fieldValueDeserilizer", jdk8DateCodec);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '\u0000');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 8);
        setField(defaultJSONParser, "lexer", jSONScanner);
        java.lang.Object[] directLongBufferUArray = createArray("[Ljava.nio.DirectLongBufferU;", 0);
        Object wildcardTypeImpl1 = createInstance("com.sun.beans.WildcardTypeImpl");
        
        Class defaultFieldDeserializerClazz = Class.forName("com.alibaba.fastjson.parser.deserializer.DefaultFieldDeserializer");
        Class defaultJSONParserType = Class.forName("com.alibaba.fastjson.parser.DefaultJSONParser");
        Class directLongBufferUArrayType = Class.forName("java.lang.Object");
        Class wildcardTypeImpl1Type = Class.forName("java.lang.reflect.Type");
        Class mapType = Class.forName("java.util.Map");
        Method parseFieldMethod = defaultFieldDeserializerClazz.getDeclaredMethod("parseField", defaultJSONParserType, directLongBufferUArrayType, wildcardTypeImpl1Type, mapType);
        parseFieldMethod.setAccessible(true);
        java.lang.Object[] parseFieldMethodArguments = new java.lang.Object[4];
        parseFieldMethodArguments[0] = defaultJSONParser;
        parseFieldMethodArguments[1] = ((Object) directLongBufferUArray);
        parseFieldMethodArguments[2] = wildcardTypeImpl1;
        parseFieldMethodArguments[3] = null;
        try {
            parseFieldMethod.invoke(defaultFieldDeserializer, parseFieldMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerToken = getFieldValue(jSONLexer, "token");
        
        assertEquals(20, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseField6() throws Throwable  {
        DefaultFieldDeserializer defaultFieldDeserializer = ((DefaultFieldDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.DefaultFieldDeserializer"));
        FieldInfo fieldInfo = ((FieldInfo) createInstance("com.alibaba.fastjson.util.FieldInfo"));
        String string = new String("");
        setField(fieldInfo, "format", string);
        setField(fieldInfo, "parserFeatures", 0);
        WildcardTypeImpl wildcardTypeImpl = ((WildcardTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.WildcardTypeImpl"));
        setField(fieldInfo, "fieldType", wildcardTypeImpl);
        setField(fieldInfo, "name", string);
        setField(defaultFieldDeserializer, "fieldInfo", fieldInfo);
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.ThrowableDeserializer"));
        setField(defaultFieldDeserializer, "fieldValueDeserilizer", throwableDeserializer);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '\u0000');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 8);
        setField(defaultJSONParser, "lexer", jSONScanner);
        WildcardTypeImpl wildcardTypeImpl1 = ((WildcardTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.WildcardTypeImpl"));
        
        defaultFieldDeserializer.parseField(defaultJSONParser, null, wildcardTypeImpl1, ((Map) null));
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerToken = getFieldValue(jSONLexer, "token");
        
        assertEquals(20, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseField7() throws Throwable  {
        DefaultFieldDeserializer defaultFieldDeserializer = ((DefaultFieldDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.DefaultFieldDeserializer"));
        FieldInfo fieldInfo = ((FieldInfo) createInstance("com.alibaba.fastjson.util.FieldInfo"));
        String string = new String("");
        setField(fieldInfo, "format", string);
        setField(fieldInfo, "parserFeatures", 0);
        WildcardTypeImpl wildcardTypeImpl = ((WildcardTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.WildcardTypeImpl"));
        setField(fieldInfo, "fieldType", wildcardTypeImpl);
        setField(fieldInfo, "name", string);
        setField(defaultFieldDeserializer, "fieldInfo", fieldInfo);
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.ThrowableDeserializer"));
        setField(defaultFieldDeserializer, "fieldValueDeserilizer", throwableDeserializer);
        DefaultExtJSONParser defaultExtJSONParser = ((DefaultExtJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultExtJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '/');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 8);
        setField(jSONScanner, "len", 0);
        setField(defaultExtJSONParser, "lexer", jSONScanner);
        java.lang.Object[] attributesBuilderArray = createArray("[Lsun.nio.fs.AbstractBasicFileAttributeView$AttributesBuilder;", 0);
        TypeVariableImpl typeVariableImpl = ((TypeVariableImpl) createInstance("sun.reflect.generics.reflectiveObjects.TypeVariableImpl"));
        
        defaultFieldDeserializer.parseField(defaultExtJSONParser, attributesBuilderArray, typeVariableImpl, ((Map) null));
        
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
    public void testParseField8() throws Throwable  {
        DefaultFieldDeserializer defaultFieldDeserializer = ((DefaultFieldDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.DefaultFieldDeserializer"));
        FieldInfo fieldInfo = ((FieldInfo) createInstance("com.alibaba.fastjson.util.FieldInfo"));
        String string = new String("");
        setField(fieldInfo, "format", string);
        setField(fieldInfo, "parserFeatures", 0);
        Object syntheticParameterizedType = createInstance("org.springframework.core.ResolvableType$SyntheticParameterizedType");
        setField(fieldInfo, "fieldType", syntheticParameterizedType);
        setField(defaultFieldDeserializer, "fieldInfo", fieldInfo);
        JavaBeanDeserializer javaBeanDeserializer = ((JavaBeanDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer"));
        setField(defaultFieldDeserializer, "fieldValueDeserilizer", javaBeanDeserializer);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        ParseContext parseContext = ((ParseContext) createInstance("com.alibaba.fastjson.parser.ParseContext"));
        setField(parseContext, "type", null);
        setField(defaultJSONParser, "context", parseContext);
        java.lang.Object[] ofIntArray = createArray("java.util.stream.ForEachOps$ForEachOp$OfInt", 0);
        
        Object defaultJSONParserContext = getFieldValue(defaultJSONParser, "context");
        Object initialDefaultJSONParserContextType = getFieldValue(defaultJSONParserContext, "type");
        
        Class defaultFieldDeserializerClazz = Class.forName("com.alibaba.fastjson.parser.deserializer.DefaultFieldDeserializer");
        Class defaultJSONParserType = Class.forName("com.alibaba.fastjson.parser.DefaultJSONParser");
        Class ofIntArrayType = Class.forName("java.lang.Object");
        Class syntheticParameterizedTypeType = Class.forName("java.lang.reflect.Type");
        Class mapType = Class.forName("java.util.Map");
        Method parseFieldMethod = defaultFieldDeserializerClazz.getDeclaredMethod("parseField", defaultJSONParserType, ofIntArrayType, syntheticParameterizedTypeType, mapType);
        parseFieldMethod.setAccessible(true);
        java.lang.Object[] parseFieldMethodArguments = new java.lang.Object[4];
        parseFieldMethodArguments[0] = defaultJSONParser;
        parseFieldMethodArguments[1] = ((Object) ofIntArray);
        parseFieldMethodArguments[2] = syntheticParameterizedType;
        parseFieldMethodArguments[3] = null;
        try {
            parseFieldMethod.invoke(defaultFieldDeserializer, parseFieldMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        Object defaultJSONParserContext1 = getFieldValue(defaultJSONParser, "context");
        Object finalDefaultJSONParserContextType = getFieldValue(defaultJSONParserContext1, "type");
        
        assertFalse(initialDefaultJSONParserContextType == finalDefaultJSONParserContextType);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseField9() throws Throwable  {
        DefaultFieldDeserializer defaultFieldDeserializer = ((DefaultFieldDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.DefaultFieldDeserializer"));
        FieldInfo fieldInfo = ((FieldInfo) createInstance("com.alibaba.fastjson.util.FieldInfo"));
        setField(fieldInfo, "parserFeatures", 1);
        Class class1 = Object.class;
        setField(fieldInfo, "fieldType", class1);
        String string = new String("");
        setField(fieldInfo, "name", string);
        setField(defaultFieldDeserializer, "fieldInfo", fieldInfo);
        JavaBeanDeserializer javaBeanDeserializer = ((JavaBeanDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer"));
        setField(defaultFieldDeserializer, "fieldValueDeserilizer", javaBeanDeserializer);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "token", 8);
        setField(defaultJSONParser, "lexer", jSONScanner);
        
        defaultFieldDeserializer.parseField(defaultJSONParser, null, class1, ((Map) null));
        
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object finalDefaultJSONParserLexerToken = getFieldValue(jSONLexer, "token");
        
        assertEquals(20, finalDefaultJSONParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseField10() throws Throwable  {
        DefaultFieldDeserializer defaultFieldDeserializer = ((DefaultFieldDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.DefaultFieldDeserializer"));
        Class class1 = Object.class;
        setField(defaultFieldDeserializer, "clazz", class1);
        FieldInfo fieldInfo = ((FieldInfo) createInstance("com.alibaba.fastjson.util.FieldInfo"));
        WildcardTypeImpl wildcardTypeImpl = ((WildcardTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.WildcardTypeImpl"));
        setField(fieldInfo, "fieldType", wildcardTypeImpl);
        setField(defaultFieldDeserializer, "fieldInfo", fieldInfo);
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.MapDeserializer"));
        setField(defaultFieldDeserializer, "fieldValueDeserilizer", mapDeserializer);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        ParseContext parseContext = ((ParseContext) createInstance("com.alibaba.fastjson.parser.ParseContext"));
        Object parameterizedTypeImpl = createInstance("retrofit2.Utils$ParameterizedTypeImpl");
        setField(parseContext, "type", parameterizedTypeImpl);
        setField(defaultJSONParser, "context", parseContext);
        java.lang.Object[] ofIntArray = createArray("java.util.stream.ForEachOps$ForEachOp$OfInt", 0);
        Object syntheticParameterizedType = createInstance("org.springframework.core.ResolvableType$SyntheticParameterizedType");
        
        Object defaultJSONParserContext = getFieldValue(defaultJSONParser, "context");
        Object initialDefaultJSONParserContextType = getFieldValue(defaultJSONParserContext, "type");
        
        Class defaultFieldDeserializerClazz = Class.forName("com.alibaba.fastjson.parser.deserializer.DefaultFieldDeserializer");
        Class defaultJSONParserType = Class.forName("com.alibaba.fastjson.parser.DefaultJSONParser");
        Class syntheticParameterizedTypeType = Class.forName("java.lang.reflect.Type");
        Class mapType = Class.forName("java.util.Map");
        Method parseFieldMethod = defaultFieldDeserializerClazz.getDeclaredMethod("parseField", defaultJSONParserType, class1, syntheticParameterizedTypeType, mapType);
        parseFieldMethod.setAccessible(true);
        java.lang.Object[] parseFieldMethodArguments = new java.lang.Object[4];
        parseFieldMethodArguments[0] = defaultJSONParser;
        parseFieldMethodArguments[1] = ((Object) ofIntArray);
        parseFieldMethodArguments[2] = syntheticParameterizedType;
        parseFieldMethodArguments[3] = null;
        try {
            parseFieldMethod.invoke(defaultFieldDeserializer, parseFieldMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        Object defaultJSONParserContext1 = getFieldValue(defaultJSONParser, "context");
        Object finalDefaultJSONParserContextType = getFieldValue(defaultJSONParserContext1, "type");
        
        assertFalse(initialDefaultJSONParserContextType == finalDefaultJSONParserContextType);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseField11() throws Throwable  {
        DefaultFieldDeserializer defaultFieldDeserializer = ((DefaultFieldDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.DefaultFieldDeserializer"));
        Class class1 = Object.class;
        setField(defaultFieldDeserializer, "clazz", class1);
        FieldInfo fieldInfo = ((FieldInfo) createInstance("com.alibaba.fastjson.util.FieldInfo"));
        Object genericArrayTypeImpl = createInstance("retrofit2.Utils$GenericArrayTypeImpl");
        setField(fieldInfo, "fieldType", genericArrayTypeImpl);
        setField(defaultFieldDeserializer, "fieldInfo", fieldInfo);
        JavaBeanDeserializer javaBeanDeserializer = ((JavaBeanDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer"));
        setField(defaultFieldDeserializer, "fieldValueDeserilizer", javaBeanDeserializer);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        ParseContext parseContext = ((ParseContext) createInstance("com.alibaba.fastjson.parser.ParseContext"));
        ParameterizedTypeImpl parameterizedTypeImpl = ((ParameterizedTypeImpl) createInstance("com.alibaba.fastjson.util.ParameterizedTypeImpl"));
        setField(parseContext, "type", parameterizedTypeImpl);
        setField(defaultJSONParser, "context", parseContext);
        java.lang.Object[] forEachTaskArray = createArray("java.util.stream.ForEachOps$ForEachTask", 0);
        Object parameterizedTypeImpl1 = createInstance("retrofit2.Utils$ParameterizedTypeImpl");
        
        Object defaultJSONParserContext = getFieldValue(defaultJSONParser, "context");
        Object initialDefaultJSONParserContextType = getFieldValue(defaultJSONParserContext, "type");
        
        Class defaultFieldDeserializerClazz = Class.forName("com.alibaba.fastjson.parser.deserializer.DefaultFieldDeserializer");
        Class defaultJSONParserType = Class.forName("com.alibaba.fastjson.parser.DefaultJSONParser");
        Class parameterizedTypeImpl1Type = Class.forName("java.lang.reflect.Type");
        Class mapType = Class.forName("java.util.Map");
        Method parseFieldMethod = defaultFieldDeserializerClazz.getDeclaredMethod("parseField", defaultJSONParserType, class1, parameterizedTypeImpl1Type, mapType);
        parseFieldMethod.setAccessible(true);
        java.lang.Object[] parseFieldMethodArguments = new java.lang.Object[4];
        parseFieldMethodArguments[0] = defaultJSONParser;
        parseFieldMethodArguments[1] = ((Object) forEachTaskArray);
        parseFieldMethodArguments[2] = parameterizedTypeImpl1;
        parseFieldMethodArguments[3] = null;
        try {
            parseFieldMethod.invoke(defaultFieldDeserializer, parseFieldMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        Object defaultJSONParserContext1 = getFieldValue(defaultJSONParser, "context");
        Object finalDefaultJSONParserContextType = getFieldValue(defaultJSONParserContext1, "type");
        
        assertFalse(initialDefaultJSONParserContextType == finalDefaultJSONParserContextType);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetFastMatchToken1() throws Throwable  {
        DefaultFieldDeserializer defaultFieldDeserializer = ((DefaultFieldDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.DefaultFieldDeserializer"));
        
        int actual = defaultFieldDeserializer.getFastMatchToken();
        
        assertEquals(2, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetFastMatchToken2() throws Throwable  {
        DefaultFieldDeserializer defaultFieldDeserializer = ((DefaultFieldDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.DefaultFieldDeserializer"));
        setField(defaultFieldDeserializer, "fieldValueDeserilizer", null);
        
        int actual = defaultFieldDeserializer.getFastMatchToken();
        
        assertEquals(2, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetFastMatchToken3() throws Throwable  {
        DefaultFieldDeserializer defaultFieldDeserializer = ((DefaultFieldDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.DefaultFieldDeserializer"));
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.ThrowableDeserializer"));
        setField(defaultFieldDeserializer, "fieldValueDeserilizer", throwableDeserializer);
        
        int actual = defaultFieldDeserializer.getFastMatchToken();
        
        assertEquals(12, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetFieldValueDeserilizer1() throws Throwable  {
        DefaultFieldDeserializer defaultFieldDeserializer = ((DefaultFieldDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.DefaultFieldDeserializer"));
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.ThrowableDeserializer"));
        setField(defaultFieldDeserializer, "fieldValueDeserilizer", throwableDeserializer);
        ParserConfig parserConfig = ((ParserConfig) createInstance("com.alibaba.fastjson.parser.ParserConfig"));
        
        ObjectDeserializer actual = defaultFieldDeserializer.getFieldValueDeserilizer(parserConfig);
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(throwableDeserializer, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetFieldValueDeserilizer2() throws Throwable  {
        DefaultFieldDeserializer defaultFieldDeserializer = ((DefaultFieldDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.DefaultFieldDeserializer"));
        FieldInfo fieldInfo = ((FieldInfo) createInstance("com.alibaba.fastjson.util.FieldInfo"));
        JSONField jSONFieldMock = mock(JSONField.class);
        Class class1 = Object.class;
        when(jSONFieldMock.deserializeUsing()).thenReturn(class1);
        setField(fieldInfo, "fieldAnnotation", jSONFieldMock);
        sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl parameterizedTypeImpl = ((sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl"));
        setField(fieldInfo, "fieldType", parameterizedTypeImpl);
        setField(fieldInfo, "fieldClass", class1);
        setField(defaultFieldDeserializer, "fieldInfo", fieldInfo);
        setField(defaultFieldDeserializer, "fieldValueDeserilizer", null);
        
        FieldInfo fieldInfo1 = defaultFieldDeserializer.fieldInfo;
        Object initialDefaultFieldDeserializerFieldInfoFieldAnnotation = getFieldValue(fieldInfo1, "fieldAnnotation");
        
        defaultFieldDeserializer.getFieldValueDeserilizer(null);
        
        FieldInfo fieldInfo2 = defaultFieldDeserializer.fieldInfo;
        Object finalDefaultFieldDeserializerFieldInfoFieldAnnotation = getFieldValue(fieldInfo2, "fieldAnnotation");
        
        assertFalse(initialDefaultFieldDeserializerFieldInfoFieldAnnotation == finalDefaultFieldDeserializerFieldInfoFieldAnnotation);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetFieldValueDeserilizer3() throws Throwable  {
        DefaultFieldDeserializer defaultFieldDeserializer = ((DefaultFieldDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.DefaultFieldDeserializer"));
        FieldInfo fieldInfo = ((FieldInfo) createInstance("com.alibaba.fastjson.util.FieldInfo"));
        JSONField jSONFieldMock = mock(JSONField.class);
        when(jSONFieldMock.deserializeUsing()).thenReturn(((Class) null), ((Class) null));
        setField(fieldInfo, "fieldAnnotation", jSONFieldMock);
        setField(defaultFieldDeserializer, "fieldInfo", fieldInfo);
        setField(defaultFieldDeserializer, "fieldValueDeserilizer", null);
        
        FieldInfo fieldInfo1 = defaultFieldDeserializer.fieldInfo;
        Object initialDefaultFieldDeserializerFieldInfoFieldAnnotation = getFieldValue(fieldInfo1, "fieldAnnotation");
        
        defaultFieldDeserializer.getFieldValueDeserilizer(null);
        
        FieldInfo fieldInfo2 = defaultFieldDeserializer.fieldInfo;
        Object finalDefaultFieldDeserializerFieldInfoFieldAnnotation = getFieldValue(fieldInfo2, "fieldAnnotation");
        
        assertFalse(initialDefaultFieldDeserializerFieldInfoFieldAnnotation == finalDefaultFieldDeserializerFieldInfoFieldAnnotation);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetFieldValueDeserilizer4() throws Throwable  {
        DefaultFieldDeserializer defaultFieldDeserializer = ((DefaultFieldDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.DefaultFieldDeserializer"));
        FieldInfo fieldInfo = ((FieldInfo) createInstance("com.alibaba.fastjson.util.FieldInfo"));
        JSONField jSONFieldMock = mock(JSONField.class);
        Class class1 = Object.class;
        when(jSONFieldMock.deserializeUsing()).thenReturn(class1);
        setField(fieldInfo, "fieldAnnotation", jSONFieldMock);
        Object wildcardTypeImpl = createInstance("retrofit2.Utils$WildcardTypeImpl");
        setField(fieldInfo, "fieldType", wildcardTypeImpl);
        setField(fieldInfo, "fieldClass", class1);
        setField(defaultFieldDeserializer, "fieldInfo", fieldInfo);
        setField(defaultFieldDeserializer, "fieldValueDeserilizer", null);
        ParserConfig parserConfig = ((ParserConfig) createInstance("com.alibaba.fastjson.parser.ParserConfig"));
        IdentityHashMap identityHashMap = ((IdentityHashMap) createInstance("com.alibaba.fastjson.util.IdentityHashMap"));
        setField(identityHashMap, "indexMask", 38);
        java.lang.Object[] entryArray = createArray("com.alibaba.fastjson.util.IdentityHashMap$Entry", 39);
        Object entry = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.ThrowableDeserializer"));
        setField(entry, "value", throwableDeserializer);
        setField(entry, "key", wildcardTypeImpl);
        entryArray[38] = entry;
        setField(identityHashMap, "buckets", entryArray);
        setField(parserConfig, "deserializers", identityHashMap);
        
        ObjectDeserializer initialDefaultFieldDeserializerFieldValueDeserilizer = defaultFieldDeserializer.fieldValueDeserilizer;
        
        ObjectDeserializer actual = defaultFieldDeserializer.getFieldValueDeserilizer(parserConfig);
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(throwableDeserializer, actual));
        
        ObjectDeserializer finalDefaultFieldDeserializerFieldValueDeserilizer = defaultFieldDeserializer.fieldValueDeserilizer;
        
        assertFalse(initialDefaultFieldDeserializerFieldValueDeserilizer == finalDefaultFieldDeserializerFieldValueDeserilizer);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetFieldValueDeserilizer5() throws Throwable  {
        DefaultFieldDeserializer defaultFieldDeserializer = ((DefaultFieldDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.DefaultFieldDeserializer"));
        FieldInfo fieldInfo = ((FieldInfo) createInstance("com.alibaba.fastjson.util.FieldInfo"));
        JSONField jSONFieldMock = mock(JSONField.class);
        Class class1 = Object.class;
        when(jSONFieldMock.deserializeUsing()).thenReturn(class1);
        setField(fieldInfo, "fieldAnnotation", jSONFieldMock);
        Object parameterizedTypeImpl = createInstance("retrofit2.Utils$ParameterizedTypeImpl");
        setField(fieldInfo, "fieldType", parameterizedTypeImpl);
        setField(fieldInfo, "fieldClass", class1);
        setField(defaultFieldDeserializer, "fieldInfo", fieldInfo);
        setField(defaultFieldDeserializer, "fieldValueDeserilizer", null);
        ParserConfig parserConfig = ((ParserConfig) createInstance("com.alibaba.fastjson.parser.ParserConfig"));
        IdentityHashMap identityHashMap = ((IdentityHashMap) createInstance("com.alibaba.fastjson.util.IdentityHashMap"));
        setField(identityHashMap, "indexMask", 38);
        java.lang.Object[] entryArray = createArray("com.alibaba.fastjson.util.IdentityHashMap$Entry", 39);
        entryArray[0] = ((Object) jSONFieldMock);
        entryArray[1] = ((Object) jSONFieldMock);
        entryArray[2] = ((Object) jSONFieldMock);
        entryArray[3] = ((Object) jSONFieldMock);
        entryArray[4] = ((Object) jSONFieldMock);
        entryArray[5] = ((Object) jSONFieldMock);
        entryArray[6] = ((Object) jSONFieldMock);
        entryArray[7] = ((Object) jSONFieldMock);
        entryArray[8] = ((Object) jSONFieldMock);
        entryArray[9] = ((Object) jSONFieldMock);
        entryArray[10] = ((Object) jSONFieldMock);
        entryArray[11] = ((Object) jSONFieldMock);
        entryArray[12] = ((Object) jSONFieldMock);
        entryArray[13] = ((Object) jSONFieldMock);
        entryArray[14] = ((Object) jSONFieldMock);
        entryArray[15] = ((Object) jSONFieldMock);
        entryArray[16] = ((Object) jSONFieldMock);
        entryArray[17] = ((Object) jSONFieldMock);
        entryArray[18] = ((Object) jSONFieldMock);
        entryArray[19] = ((Object) jSONFieldMock);
        entryArray[20] = ((Object) jSONFieldMock);
        entryArray[21] = ((Object) jSONFieldMock);
        entryArray[22] = ((Object) jSONFieldMock);
        entryArray[23] = ((Object) jSONFieldMock);
        entryArray[24] = ((Object) jSONFieldMock);
        entryArray[25] = ((Object) jSONFieldMock);
        entryArray[26] = ((Object) jSONFieldMock);
        entryArray[27] = ((Object) jSONFieldMock);
        entryArray[28] = ((Object) jSONFieldMock);
        entryArray[29] = ((Object) jSONFieldMock);
        entryArray[30] = ((Object) jSONFieldMock);
        entryArray[31] = ((Object) jSONFieldMock);
        entryArray[32] = ((Object) jSONFieldMock);
        entryArray[33] = ((Object) jSONFieldMock);
        entryArray[34] = ((Object) jSONFieldMock);
        entryArray[35] = ((Object) jSONFieldMock);
        entryArray[36] = ((Object) jSONFieldMock);
        entryArray[37] = ((Object) jSONFieldMock);
        Object entry = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        Object entry1 = createInstance("com.alibaba.fastjson.util.IdentityHashMap$Entry");
        setField(entry1, "next", null);
        java.lang.Object[] sizedLongSortingSinkArray = createArray("java.util.stream.SortedOps$SizedLongSortingSink", 0);
        setField(entry1, "value", sizedLongSortingSinkArray);
        setField(entry1, "key", parameterizedTypeImpl);
        setField(entry, "next", entry1);
        setField(entry, "value", null);
        java.lang.Object[] sizedLongSortingSinkArray1 = createArray("java.util.stream.SortedOps$SizedLongSortingSink", 0);
        setField(entry, "key", sizedLongSortingSinkArray1);
        entryArray[38] = entry;
        setField(identityHashMap, "buckets", entryArray);
        setField(parserConfig, "deserializers", identityHashMap);
        
        defaultFieldDeserializer.getFieldValueDeserilizer(parserConfig);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetFieldValueDeserilizer6() throws Throwable  {
        DefaultFieldDeserializer defaultFieldDeserializer = ((DefaultFieldDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.DefaultFieldDeserializer"));
        FieldInfo fieldInfo = ((FieldInfo) createInstance("com.alibaba.fastjson.util.FieldInfo"));
        JSONField jSONFieldMock = mock(JSONField.class);
        Class class1 = Object.class;
        when(jSONFieldMock.deserializeUsing()).thenReturn(class1);
        setField(fieldInfo, "fieldAnnotation", jSONFieldMock);
        Object parameterizedTypeImpl = createInstance("retrofit2.Utils$ParameterizedTypeImpl");
        setField(fieldInfo, "fieldType", parameterizedTypeImpl);
        setField(fieldInfo, "fieldClass", class1);
        setField(defaultFieldDeserializer, "fieldInfo", fieldInfo);
        setField(defaultFieldDeserializer, "fieldValueDeserilizer", null);
        ParserConfig parserConfig = ((ParserConfig) createInstance("com.alibaba.fastjson.parser.ParserConfig"));
        IdentityHashMap identityHashMap = ((IdentityHashMap) createInstance("com.alibaba.fastjson.util.IdentityHashMap"));
        setField(identityHashMap, "indexMask", 1073741862);
        java.lang.Object[] entryArray = createArray("com.alibaba.fastjson.util.IdentityHashMap$Entry", 39);
        setField(identityHashMap, "buckets", entryArray);
        setField(parserConfig, "deserializers", identityHashMap);
        
        defaultFieldDeserializer.getFieldValueDeserilizer(parserConfig);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetFieldValueDeserilizer7() throws Throwable  {
        DefaultFieldDeserializer defaultFieldDeserializer = ((DefaultFieldDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.DefaultFieldDeserializer"));
        FieldInfo fieldInfo = ((FieldInfo) createInstance("com.alibaba.fastjson.util.FieldInfo"));
        JSONField jSONFieldMock = mock(JSONField.class);
        Class class1 = Object.class;
        when(jSONFieldMock.deserializeUsing()).thenReturn(class1);
        setField(fieldInfo, "fieldAnnotation", jSONFieldMock);
        Object parameterizedTypeImpl = createInstance("retrofit2.Utils$ParameterizedTypeImpl");
        setField(fieldInfo, "fieldType", parameterizedTypeImpl);
        setField(fieldInfo, "fieldClass", class1);
        setField(defaultFieldDeserializer, "fieldInfo", fieldInfo);
        setField(defaultFieldDeserializer, "fieldValueDeserilizer", null);
        ParserConfig parserConfig = ((ParserConfig) createInstance("com.alibaba.fastjson.parser.ParserConfig"));
        IdentityHashMap identityHashMap = ((IdentityHashMap) createInstance("com.alibaba.fastjson.util.IdentityHashMap"));
        setField(identityHashMap, "indexMask", -1);
        java.lang.Object[] entryArray = createArray("com.alibaba.fastjson.util.IdentityHashMap$Entry", 9);
        setField(identityHashMap, "buckets", entryArray);
        setField(parserConfig, "deserializers", identityHashMap);
        
        defaultFieldDeserializer.getFieldValueDeserilizer(parserConfig);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseFieldUnwrapped1() throws Throwable  {
        DefaultFieldDeserializer defaultFieldDeserializer = ((DefaultFieldDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.DefaultFieldDeserializer"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        java.lang.Object[] ofIntArray = createArray("java.util.stream.ForEachOps$ForEachOp$OfInt", 0);
        WildcardTypeImpl wildcardTypeImpl = ((WildcardTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.WildcardTypeImpl"));
        
        defaultFieldDeserializer.parseFieldUnwrapped(defaultJSONParser, ofIntArray, wildcardTypeImpl, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDefaultFieldDeserializer1() throws Throwable  {
        Class class1 = Object.class;
        FieldInfo fieldInfo = ((FieldInfo) createInstance("com.alibaba.fastjson.util.FieldInfo"));
        JSONField jSONFieldMock = mock(JSONField.class);
        when(jSONFieldMock.deserializeUsing()).thenReturn(((Class) null));
        setField(fieldInfo, "fieldAnnotation", jSONFieldMock);
        
        Object initialFieldInfoFieldAnnotation = getFieldValue(fieldInfo, "fieldAnnotation");
        DefaultFieldDeserializer actual = new DefaultFieldDeserializer(null, class1, fieldInfo);
        
        Object finalFieldInfoFieldAnnotation = getFieldValue(fieldInfo, "fieldAnnotation");
        
        assertFalse(initialFieldInfoFieldAnnotation == finalFieldInfoFieldAnnotation);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDefaultFieldDeserializer2() throws Throwable  {
        Class class1 = Object.class;
        FieldInfo fieldInfo = ((FieldInfo) createInstance("com.alibaba.fastjson.util.FieldInfo"));
        JSONField jSONFieldMock = mock(JSONField.class);
        when(jSONFieldMock.deserializeUsing()).thenReturn(class1);
        setField(fieldInfo, "fieldAnnotation", jSONFieldMock);
        
        Object initialFieldInfoFieldAnnotation = getFieldValue(fieldInfo, "fieldAnnotation");
        DefaultFieldDeserializer actual = new DefaultFieldDeserializer(null, class1, fieldInfo);
        
        Object finalFieldInfoFieldAnnotation = getFieldValue(fieldInfo, "fieldAnnotation");
        
        assertFalse(initialFieldInfoFieldAnnotation == finalFieldInfoFieldAnnotation);
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
