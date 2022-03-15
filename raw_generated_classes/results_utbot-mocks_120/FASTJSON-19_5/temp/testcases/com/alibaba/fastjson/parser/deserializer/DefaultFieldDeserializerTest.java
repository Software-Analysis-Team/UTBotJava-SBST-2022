package com.alibaba.fastjson.parser.deserializer;

import org.junit.Test;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import java.lang.reflect.Type;
import java.util.Map;
import sun.reflect.generics.reflectiveObjects.WildcardTypeImpl;
import com.alibaba.fastjson.util.FieldInfo;
import java.lang.reflect.Method;
import com.alibaba.fastjson.parser.ParseContext;
import sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl;
import sun.misc.ObjectInputFilter.Config;
import sun.misc.ObjectInputFilter;
import java.util.LinkedHashMap;
import sun.reflect.generics.reflectiveObjects.TypeVariableImpl;
import sun.font.GraphicComponent;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.parser.DefaultJSONParser.ResolveTask;
import com.alibaba.fastjson.annotation.JSONField;
import sun.reflect.generics.reflectiveObjects.GenericArrayTypeImpl;
import java.security.spec.X509EncodedKeySpec;
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

import static org.mockito.Mockito.mock;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.when;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNull;

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
        java.lang.Object[] forEachTaskArray = createArray("java.util.stream.ForEachOps$ForEachTask", 0);
        WildcardTypeImpl wildcardTypeImpl = ((WildcardTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.WildcardTypeImpl"));
        
        defaultFieldDeserializer.parseField(((DefaultJSONParser) null), forEachTaskArray, wildcardTypeImpl, ((Map) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseField3() throws Throwable  {
        DefaultFieldDeserializer defaultFieldDeserializer = ((DefaultFieldDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.DefaultFieldDeserializer"));
        FieldInfo fieldInfoMock = mock(FieldInfo.class);
        Class class1 = Object.class;
        setField(fieldInfoMock, "fieldType", class1);
        setField(defaultFieldDeserializer, "fieldInfo", fieldInfoMock);
        ObjectDeserializer objectDeserializerMock = mock(ObjectDeserializer.class);
        defaultFieldDeserializer.fieldValueDeserilizer = objectDeserializerMock;
        java.lang.Object[] forEachTaskArray = createArray("java.util.stream.ForEachOps$ForEachTask", 0);
        Object parameterizedTypeImpl = createInstance("retrofit2.Utils$ParameterizedTypeImpl");
        
        Class defaultFieldDeserializerClazz = Class.forName("com.alibaba.fastjson.parser.deserializer.DefaultFieldDeserializer");
        Class defaultJSONParserType = Class.forName("com.alibaba.fastjson.parser.DefaultJSONParser");
        Class parameterizedTypeImplType = Class.forName("java.lang.reflect.Type");
        Class mapType = Class.forName("java.util.Map");
        Method parseFieldMethod = defaultFieldDeserializerClazz.getDeclaredMethod("parseField", defaultJSONParserType, class1, parameterizedTypeImplType, mapType);
        parseFieldMethod.setAccessible(true);
        java.lang.Object[] parseFieldMethodArguments = new java.lang.Object[4];
        parseFieldMethodArguments[0] = null;
        parseFieldMethodArguments[1] = ((Object) forEachTaskArray);
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
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(FieldInfo.class);
            Class class1 = Object.class;
            mockedStatic.when(() -> {
                FieldInfo.getFieldType(any(), any(), any());
            }).thenReturn(((Type) class1));
            DefaultFieldDeserializer defaultFieldDeserializer = ((DefaultFieldDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.DefaultFieldDeserializer"));
            setField(defaultFieldDeserializer, "clazz", class1);
            FieldInfo fieldInfoMock = mock(FieldInfo.class);
            Object parameterizedTypeImpl = createInstance("retrofit2.Utils$ParameterizedTypeImpl");
            setField(fieldInfoMock, "fieldType", parameterizedTypeImpl);
            setField(defaultFieldDeserializer, "fieldInfo", fieldInfoMock);
            ObjectDeserializer objectDeserializerMock = mock(ObjectDeserializer.class);
            defaultFieldDeserializer.fieldValueDeserilizer = objectDeserializerMock;
            DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
            ParseContext parseContextMock = mock(ParseContext.class);
            setField(parseContextMock, "type", class1);
            when(defaultJSONParserMock.getContext()).thenReturn(parseContextMock);
            when(defaultJSONParserMock.getConfig()).thenReturn(((ParserConfig) null));
            java.lang.Object[] forEachTaskArray = createArray("java.util.stream.ForEachOps$ForEachTask", 0);
            ParameterizedTypeImpl parameterizedTypeImpl1 = ((ParameterizedTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl"));
            
            defaultFieldDeserializer.parseField(defaultJSONParserMock, forEachTaskArray, parameterizedTypeImpl1, ((Map) null));
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseField5() throws Throwable  {
        DefaultFieldDeserializer defaultFieldDeserializer = ((DefaultFieldDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.DefaultFieldDeserializer"));
        FieldInfo fieldInfoMock = mock(FieldInfo.class);
        String string = new String("");
        setField(fieldInfoMock, "format", string);
        Object syntheticParameterizedType = createInstance("org.springframework.core.ResolvableType$SyntheticParameterizedType");
        setField(fieldInfoMock, "fieldType", syntheticParameterizedType);
        String string1 = new String("");
        setField(fieldInfoMock, "name", string1);
        setField(defaultFieldDeserializer, "fieldInfo", fieldInfoMock);
        ObjectDeserializer objectDeserializerMock = mock(ObjectDeserializer.class);
        sun.misc.ObjectInputFilter.Config[] configArray = new sun.misc.ObjectInputFilter.Config[0];
        when(objectDeserializerMock.deserialze(any(), any(), any())).thenReturn(((Object) configArray));
        defaultFieldDeserializer.fieldValueDeserilizer = objectDeserializerMock;
        java.lang.Object[] compositeBuilderViaFromArray = createArray("com.sun.jmx.mbeanserver.DefaultMXBeanMappingFactory$CompositeBuilderViaFrom", 0);
        Object genericArrayTypeImpl = createInstance("retrofit2.Utils$GenericArrayTypeImpl");
        
        Class defaultFieldDeserializerClazz = Class.forName("com.alibaba.fastjson.parser.deserializer.DefaultFieldDeserializer");
        Class defaultJSONParserType = Class.forName("com.alibaba.fastjson.parser.DefaultJSONParser");
        Class compositeBuilderViaFromArrayType = Class.forName("java.lang.Object");
        Class genericArrayTypeImplType = Class.forName("java.lang.reflect.Type");
        Class mapType = Class.forName("java.util.Map");
        Method parseFieldMethod = defaultFieldDeserializerClazz.getDeclaredMethod("parseField", defaultJSONParserType, compositeBuilderViaFromArrayType, genericArrayTypeImplType, mapType);
        parseFieldMethod.setAccessible(true);
        java.lang.Object[] parseFieldMethodArguments = new java.lang.Object[4];
        parseFieldMethodArguments[0] = null;
        parseFieldMethodArguments[1] = ((Object) compositeBuilderViaFromArray);
        parseFieldMethodArguments[2] = genericArrayTypeImpl;
        parseFieldMethodArguments[3] = null;
        try {
            parseFieldMethod.invoke(defaultFieldDeserializer, parseFieldMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseField6() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(FieldInfo.class);
            ParameterizedTypeImpl parameterizedTypeImpl = ((ParameterizedTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl"));
            mockedStatic.when(() -> {
                FieldInfo.getFieldType(any(), any(), any());
            }).thenReturn(((Type) parameterizedTypeImpl));
            DefaultFieldDeserializer defaultFieldDeserializer = ((DefaultFieldDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.DefaultFieldDeserializer"));
            Class class1 = Object.class;
            setField(defaultFieldDeserializer, "clazz", class1);
            FieldInfo fieldInfoMock = mock(FieldInfo.class);
            setField(fieldInfoMock, "fieldType", class1);
            setField(defaultFieldDeserializer, "fieldInfo", fieldInfoMock);
            ObjectDeserializer objectDeserializerMock = mock(ObjectDeserializer.class);
            defaultFieldDeserializer.fieldValueDeserilizer = objectDeserializerMock;
            DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
            when(defaultJSONParserMock.getContext()).thenReturn(((ParseContext) null));
            when(defaultJSONParserMock.getConfig()).thenReturn(((ParserConfig) null));
            java.lang.Object[] forEachTaskArray = createArray("java.util.stream.ForEachOps$ForEachTask", 0);
            ParameterizedTypeImpl parameterizedTypeImpl1 = ((ParameterizedTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl"));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            
            defaultFieldDeserializer.parseField(defaultJSONParserMock, forEachTaskArray, parameterizedTypeImpl1, linkedHashMap);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseField7() throws Throwable  {
        DefaultFieldDeserializer defaultFieldDeserializer = ((DefaultFieldDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.DefaultFieldDeserializer"));
        FieldInfo fieldInfoMock = mock(FieldInfo.class);
        String string = new String("");
        setField(fieldInfoMock, "format", string);
        Class class1 = Object.class;
        setField(fieldInfoMock, "fieldType", class1);
        setField(fieldInfoMock, "name", string);
        setField(defaultFieldDeserializer, "fieldInfo", fieldInfoMock);
        ObjectDeserializer objectDeserializerMock = mock(ObjectDeserializer.class);
        when(objectDeserializerMock.deserialze(any(), any(), any())).thenReturn(null);
        defaultFieldDeserializer.fieldValueDeserilizer = objectDeserializerMock;
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        when(defaultJSONParserMock.getResolveStatus()).thenReturn(0);
        
        defaultFieldDeserializer.parseField(defaultJSONParserMock, null, ((Type) null), ((Map) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseField8() throws Throwable  {
        DefaultFieldDeserializer defaultFieldDeserializer = ((DefaultFieldDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.DefaultFieldDeserializer"));
        FieldInfo fieldInfoMock = mock(FieldInfo.class);
        String string = new String("");
        setField(fieldInfoMock, "format", string);
        Class class1 = Object.class;
        setField(fieldInfoMock, "fieldType", class1);
        setField(fieldInfoMock, "name", string);
        setField(defaultFieldDeserializer, "fieldInfo", fieldInfoMock);
        ObjectDeserializer objectDeserializerMock = mock(ObjectDeserializer.class);
        java.lang.Object[] forEachTaskArray = createArray("[Ljava.util.stream.ForEachOps$ForEachTask;", 9);
        forEachTaskArray[0] = null;
        forEachTaskArray[1] = null;
        forEachTaskArray[2] = null;
        forEachTaskArray[3] = null;
        forEachTaskArray[4] = null;
        forEachTaskArray[5] = null;
        forEachTaskArray[6] = null;
        forEachTaskArray[7] = null;
        forEachTaskArray[8] = null;
        when(objectDeserializerMock.deserialze(any(), any(), any())).thenReturn(((Object) forEachTaskArray));
        defaultFieldDeserializer.fieldValueDeserilizer = objectDeserializerMock;
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        when(defaultJSONParserMock.getResolveStatus()).thenReturn(1);
        when(defaultJSONParserMock.getLastResolveTask()).thenReturn(((DefaultJSONParser.ResolveTask) null));
        java.lang.Object[] filteredKeyMultimapArray = createArray("jersey.repackaged.com.google.common.collect.FilteredKeyMultimap", 0);
        TypeVariableImpl typeVariableImpl = ((TypeVariableImpl) createInstance("sun.reflect.generics.reflectiveObjects.TypeVariableImpl"));
        
        defaultFieldDeserializer.parseField(defaultJSONParserMock, filteredKeyMultimapArray, typeVariableImpl, ((Map) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseField9() throws Throwable  {
        DefaultFieldDeserializer defaultFieldDeserializer = ((DefaultFieldDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.DefaultFieldDeserializer"));
        FieldInfo fieldInfoMock = mock(FieldInfo.class);
        String string = new String("");
        setField(fieldInfoMock, "format", string);
        Object parameterizedTypeImpl = createInstance("retrofit2.Utils$ParameterizedTypeImpl");
        setField(fieldInfoMock, "fieldType", parameterizedTypeImpl);
        setField(fieldInfoMock, "name", string);
        setField(defaultFieldDeserializer, "fieldInfo", fieldInfoMock);
        ObjectDeserializer objectDeserializerMock = mock(ObjectDeserializer.class);
        java.lang.Object[] forEachTaskArray = createArray("[Ljava.util.stream.ForEachOps$ForEachTask;", 9);
        forEachTaskArray[0] = null;
        forEachTaskArray[1] = null;
        forEachTaskArray[2] = null;
        forEachTaskArray[3] = null;
        forEachTaskArray[4] = null;
        forEachTaskArray[5] = null;
        forEachTaskArray[6] = null;
        forEachTaskArray[7] = null;
        forEachTaskArray[8] = null;
        when(objectDeserializerMock.deserialze(any(), any(), any())).thenReturn(((Object) forEachTaskArray));
        defaultFieldDeserializer.fieldValueDeserilizer = objectDeserializerMock;
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        when(defaultJSONParserMock.getContext()).thenReturn(((ParseContext) null));
        when(defaultJSONParserMock.getResolveStatus()).thenReturn(1);
        when(defaultJSONParserMock.getLastResolveTask()).thenReturn(((DefaultJSONParser.ResolveTask) null));
        sun.font.GraphicComponent[][] graphicComponentArray = new sun.font.GraphicComponent[0][];
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        
        Class defaultFieldDeserializerClazz = Class.forName("com.alibaba.fastjson.parser.deserializer.DefaultFieldDeserializer");
        Class defaultJSONParserMockType = Class.forName("com.alibaba.fastjson.parser.DefaultJSONParser");
        Class graphicComponentArrayType = Class.forName("java.lang.Object");
        Class parameterizedTypeImplType = Class.forName("java.lang.reflect.Type");
        Class linkedHashMapType = Class.forName("java.util.Map");
        Method parseFieldMethod = defaultFieldDeserializerClazz.getDeclaredMethod("parseField", defaultJSONParserMockType, graphicComponentArrayType, parameterizedTypeImplType, linkedHashMapType);
        parseFieldMethod.setAccessible(true);
        java.lang.Object[] parseFieldMethodArguments = new java.lang.Object[4];
        parseFieldMethodArguments[0] = defaultJSONParserMock;
        parseFieldMethodArguments[1] = ((Object) graphicComponentArray);
        parseFieldMethodArguments[2] = parameterizedTypeImpl;
        parseFieldMethodArguments[3] = linkedHashMap;
        try {
            parseFieldMethod.invoke(defaultFieldDeserializer, parseFieldMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseField10() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(FieldInfo.class);
            ParameterizedTypeImpl parameterizedTypeImpl = ((ParameterizedTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl"));
            mockedStatic.when(() -> {
                FieldInfo.getFieldType(any(), any(), any());
            }).thenReturn(((Type) parameterizedTypeImpl));
            DefaultFieldDeserializer defaultFieldDeserializer = ((DefaultFieldDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.DefaultFieldDeserializer"));
            Class class1 = Object.class;
            setField(defaultFieldDeserializer, "clazz", class1);
            FieldInfo fieldInfoMock = mock(FieldInfo.class);
            String string = new String("");
            setField(fieldInfoMock, "format", string);
            setField(fieldInfoMock, "fieldType", class1);
            String string1 = new String("");
            setField(fieldInfoMock, "name", string1);
            setField(defaultFieldDeserializer, "fieldInfo", fieldInfoMock);
            ObjectDeserializer objectDeserializerMock = mock(ObjectDeserializer.class);
            defaultFieldDeserializer.fieldValueDeserilizer = objectDeserializerMock;
            DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
            when(defaultJSONParserMock.getContext()).thenReturn(((ParseContext) null));
            ParserConfig parserConfigMock = mock(ParserConfig.class);
            when(parserConfigMock.getDeserializer(org.mockito.ArgumentMatchers.any(Type.class))).thenReturn(((ObjectDeserializer) null));
            when(defaultJSONParserMock.getConfig()).thenReturn(parserConfigMock);
            java.lang.Object[] forEachTaskArray = createArray("java.util.stream.ForEachOps$ForEachTask", 0);
            com.alibaba.fastjson.util.ParameterizedTypeImpl parameterizedTypeImpl1 = ((com.alibaba.fastjson.util.ParameterizedTypeImpl) createInstance("com.alibaba.fastjson.util.ParameterizedTypeImpl"));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            
            defaultFieldDeserializer.parseField(defaultJSONParserMock, forEachTaskArray, parameterizedTypeImpl1, linkedHashMap);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testParseField11() throws Throwable  {
        DefaultFieldDeserializer defaultFieldDeserializer = ((DefaultFieldDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.DefaultFieldDeserializer"));
        FieldInfo fieldInfoMock = mock(FieldInfo.class);
        String string = new String("");
        setField(fieldInfoMock, "format", string);
        Object parameterizedTypeImpl = createInstance("retrofit2.Utils$ParameterizedTypeImpl");
        setField(fieldInfoMock, "fieldType", parameterizedTypeImpl);
        setField(fieldInfoMock, "name", string);
        setField(defaultFieldDeserializer, "fieldInfo", fieldInfoMock);
        ObjectDeserializer objectDeserializerMock = mock(ObjectDeserializer.class);
        java.lang.Object[] forEachTaskArray = createArray("[Ljava.util.stream.ForEachOps$ForEachTask;", 9);
        forEachTaskArray[0] = null;
        forEachTaskArray[1] = null;
        forEachTaskArray[2] = null;
        forEachTaskArray[3] = null;
        forEachTaskArray[4] = null;
        forEachTaskArray[5] = null;
        forEachTaskArray[6] = null;
        forEachTaskArray[7] = null;
        forEachTaskArray[8] = null;
        when(objectDeserializerMock.deserialze(any(), any(), any())).thenReturn(((Object) forEachTaskArray));
        defaultFieldDeserializer.fieldValueDeserilizer = objectDeserializerMock;
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        when(defaultJSONParserMock.getContext()).thenReturn(((ParseContext) null), ((ParseContext) null));
        when(defaultJSONParserMock.getResolveStatus()).thenReturn(1);
        DefaultJSONParser.ResolveTask resolveTaskMock = mock(DefaultJSONParser.ResolveTask.class);
        setField(resolveTaskMock, "ownerContext", null);
        setField(resolveTaskMock, "fieldDeserializer", null);
        when(defaultJSONParserMock.getLastResolveTask()).thenReturn(resolveTaskMock);
        java.lang.Object[] pendingFutureArray = createArray("sun.nio.ch.PendingFuture", 0);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        
        Class defaultFieldDeserializerClazz = Class.forName("com.alibaba.fastjson.parser.deserializer.DefaultFieldDeserializer");
        Class defaultJSONParserMockType = Class.forName("com.alibaba.fastjson.parser.DefaultJSONParser");
        Class pendingFutureArrayType = Class.forName("java.lang.Object");
        Class parameterizedTypeImplType = Class.forName("java.lang.reflect.Type");
        Class linkedHashMapType = Class.forName("java.util.Map");
        Method parseFieldMethod = defaultFieldDeserializerClazz.getDeclaredMethod("parseField", defaultJSONParserMockType, pendingFutureArrayType, parameterizedTypeImplType, linkedHashMapType);
        parseFieldMethod.setAccessible(true);
        java.lang.Object[] parseFieldMethodArguments = new java.lang.Object[4];
        parseFieldMethodArguments[0] = defaultJSONParserMock;
        parseFieldMethodArguments[1] = ((Object) pendingFutureArray);
        parseFieldMethodArguments[2] = parameterizedTypeImpl;
        parseFieldMethodArguments[3] = linkedHashMap;
        parseFieldMethod.invoke(defaultFieldDeserializer, parseFieldMethodArguments);
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
        ObjectDeserializer objectDeserializerMock = mock(ObjectDeserializer.class);
        when(objectDeserializerMock.getFastMatchToken()).thenReturn(0);
        defaultFieldDeserializer.fieldValueDeserilizer = objectDeserializerMock;
        
        int actual = defaultFieldDeserializer.getFastMatchToken();
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetFieldValueDeserilizer1() throws Throwable  {
        DefaultFieldDeserializer defaultFieldDeserializer = ((DefaultFieldDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.DefaultFieldDeserializer"));
        ParserConfig parserConfig = new ParserConfig();
        
        defaultFieldDeserializer.getFieldValueDeserilizer(parserConfig);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetFieldValueDeserilizer2() throws Throwable  {
        DefaultFieldDeserializer defaultFieldDeserializer = ((DefaultFieldDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.DefaultFieldDeserializer"));
        ObjectDeserializer objectDeserializerMock = mock(ObjectDeserializer.class);
        defaultFieldDeserializer.fieldValueDeserilizer = objectDeserializerMock;
        
        ObjectDeserializer actual = defaultFieldDeserializer.getFieldValueDeserilizer(null);
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(objectDeserializerMock, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetFieldValueDeserilizer3() throws Throwable  {
        DefaultFieldDeserializer defaultFieldDeserializer = ((DefaultFieldDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.DefaultFieldDeserializer"));
        FieldInfo fieldInfoMock = mock(FieldInfo.class);
        JSONField jSONFieldMock = mock(JSONField.class);
        Class class1 = Object.class;
        when(jSONFieldMock.deserializeUsing()).thenReturn(class1);
        when(fieldInfoMock.getAnnotation()).thenReturn(jSONFieldMock);
        TypeVariableImpl typeVariableImpl = ((TypeVariableImpl) createInstance("sun.reflect.generics.reflectiveObjects.TypeVariableImpl"));
        setField(fieldInfoMock, "fieldType", typeVariableImpl);
        setField(fieldInfoMock, "fieldClass", class1);
        setField(defaultFieldDeserializer, "fieldInfo", fieldInfoMock);
        setField(defaultFieldDeserializer, "fieldValueDeserilizer", null);
        
        defaultFieldDeserializer.getFieldValueDeserilizer(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetFieldValueDeserilizer4() throws Throwable  {
        DefaultFieldDeserializer defaultFieldDeserializer = ((DefaultFieldDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.DefaultFieldDeserializer"));
        FieldInfo fieldInfoMock = mock(FieldInfo.class);
        when(fieldInfoMock.getAnnotation()).thenReturn(((JSONField) null));
        TypeVariableImpl typeVariableImpl = ((TypeVariableImpl) createInstance("sun.reflect.generics.reflectiveObjects.TypeVariableImpl"));
        setField(fieldInfoMock, "fieldType", typeVariableImpl);
        Class class1 = Object.class;
        setField(fieldInfoMock, "fieldClass", class1);
        setField(defaultFieldDeserializer, "fieldInfo", fieldInfoMock);
        setField(defaultFieldDeserializer, "fieldValueDeserilizer", null);
        
        defaultFieldDeserializer.getFieldValueDeserilizer(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetFieldValueDeserilizer5() throws Throwable  {
        DefaultFieldDeserializer defaultFieldDeserializer = ((DefaultFieldDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.DefaultFieldDeserializer"));
        FieldInfo fieldInfoMock = mock(FieldInfo.class);
        JSONField jSONFieldMock = mock(JSONField.class);
        Class class1 = Object.class;
        when(jSONFieldMock.deserializeUsing()).thenReturn(class1);
        when(fieldInfoMock.getAnnotation()).thenReturn(jSONFieldMock);
        GenericArrayTypeImpl genericArrayTypeImpl = ((GenericArrayTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.GenericArrayTypeImpl"));
        setField(fieldInfoMock, "fieldType", genericArrayTypeImpl);
        setField(fieldInfoMock, "fieldClass", class1);
        setField(defaultFieldDeserializer, "fieldInfo", fieldInfoMock);
        setField(defaultFieldDeserializer, "fieldValueDeserilizer", null);
        ParserConfig parserConfigMock = mock(ParserConfig.class);
        when(parserConfigMock.getDeserializer(any(), any())).thenReturn(((ObjectDeserializer) null));
        
        ObjectDeserializer actual = defaultFieldDeserializer.getFieldValueDeserilizer(parserConfigMock);
        
        assertNull(actual);
    }
    ///endregion
    
    
    ///region Errors report for getFieldValueDeserilizer
    
    public void testGetFieldValueDeserilizer_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Field security is not found in class java.lang.System
        // 
    }
    ///endregion
    
    
    ///region Errors report for getFieldValueDeserilizer
    
    public void testGetFieldValueDeserilizer_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Field security is not found in class java.lang.System
        // 
    }
    ///endregion
    
    
    ///region Errors report for getFieldValueDeserilizer
    
    public void testGetFieldValueDeserilizer_errors2()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Field security is not found in class java.lang.System
        // 
    }
    ///endregion
    
    
    ///region Errors report for getFieldValueDeserilizer
    
    public void testGetFieldValueDeserilizer_errors3()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Field security is not found in class java.lang.System
        // 
    }
    ///endregion
    
    
    ///region Errors report for getFieldValueDeserilizer
    
    public void testGetFieldValueDeserilizer_errors4()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Field security is not found in class java.lang.System
        // 
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseFieldUnwrapped1() throws Throwable  {
        DefaultFieldDeserializer defaultFieldDeserializer = ((DefaultFieldDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.DefaultFieldDeserializer"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        Object object = new Object();
        
        defaultFieldDeserializer.parseFieldUnwrapped(defaultJSONParser, object, null, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseFieldUnwrapped2() throws Throwable  {
        DefaultFieldDeserializer defaultFieldDeserializer = ((DefaultFieldDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.DefaultFieldDeserializer"));
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        X509EncodedKeySpec x509EncodedKeySpec = ((X509EncodedKeySpec) createInstance("java.security.spec.X509EncodedKeySpec"));
        
        defaultFieldDeserializer.parseFieldUnwrapped(defaultJSONParserMock, x509EncodedKeySpec, null, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDefaultFieldDeserializer1() throws Throwable  {
        ParserConfig parserConfigMock = mock(ParserConfig.class);
        Class class1 = Object.class;
        FieldInfo fieldInfoMock = mock(FieldInfo.class);
        when(fieldInfoMock.getAnnotation()).thenReturn(((JSONField) null));
        DefaultFieldDeserializer actual = new DefaultFieldDeserializer(parserConfigMock, class1, fieldInfoMock);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDefaultFieldDeserializer2() throws Throwable  {
        ParserConfig parserConfigMock = mock(ParserConfig.class);
        Class class1 = Object.class;
        FieldInfo fieldInfoMock = mock(FieldInfo.class);
        JSONField jSONFieldMock = mock(JSONField.class);
        when(jSONFieldMock.deserializeUsing()).thenReturn(((Class) null));
        when(fieldInfoMock.getAnnotation()).thenReturn(jSONFieldMock);
        DefaultFieldDeserializer actual = new DefaultFieldDeserializer(parserConfigMock, class1, fieldInfoMock);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDefaultFieldDeserializer3() throws Throwable  {
        ParserConfig parserConfigMock = mock(ParserConfig.class);
        Class class1 = Object.class;
        FieldInfo fieldInfoMock = mock(FieldInfo.class);
        JSONField jSONFieldMock = mock(JSONField.class);
        when(jSONFieldMock.deserializeUsing()).thenReturn(class1);
        when(fieldInfoMock.getAnnotation()).thenReturn(jSONFieldMock);
        DefaultFieldDeserializer actual = new DefaultFieldDeserializer(parserConfigMock, class1, fieldInfoMock);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDefaultFieldDeserializer4() throws Throwable  {
        ParserConfig parserConfigMock = mock(ParserConfig.class);
        Class class1 = Object.class;
        FieldInfo fieldInfoMock = mock(FieldInfo.class);
        JSONField jSONFieldMock = mock(JSONField.class);
        when(jSONFieldMock.deserializeUsing()).thenReturn(class1);
        when(fieldInfoMock.getAnnotation()).thenReturn(jSONFieldMock);
        DefaultFieldDeserializer actual = new DefaultFieldDeserializer(parserConfigMock, class1, fieldInfoMock);
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
