package com.alibaba.fastjson.parser.deserializer;

import org.junit.Test;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import java.lang.reflect.Method;
import sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl;
import java.lang.reflect.Type;
import java.awt.geom.CubicCurve2D.Float;
import java.awt.geom.CubicCurve2D;
import com.alibaba.fastjson.parser.JSONLexer;
import sun.reflect.generics.reflectiveObjects.TypeVariableImpl;
import java.util.Map;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.LinkedHashMap;
import java.util.Hashtable;
import java.util.IdentityHashMap;
import java.util.Properties;
import com.alibaba.fastjson.parser.ParserConfig;
import sun.reflect.generics.reflectiveObjects.GenericArrayTypeImpl;
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
import static org.mockito.Mockito.when;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

public class MapDeserializerTest {
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDeserialze1() throws Throwable  {
        MapDeserializer mapDeserializer = new MapDeserializer();
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        Object object = new Object();
        
        Class mapDeserializerClazz = Class.forName("com.alibaba.fastjson.parser.deserializer.MapDeserializer");
        Class defaultJSONParserType = Class.forName("com.alibaba.fastjson.parser.DefaultJSONParser");
        Class typeType = Class.forName("java.lang.reflect.Type");
        Class objectType = Class.forName("java.lang.Object");
        Class mapType = Class.forName("java.util.Map");
        Method deserialzeMethod = mapDeserializerClazz.getDeclaredMethod("deserialze", defaultJSONParserType, typeType, objectType, mapType);
        deserialzeMethod.setAccessible(true);
        java.lang.Object[] deserialzeMethodArguments = new java.lang.Object[4];
        deserialzeMethodArguments[0] = defaultJSONParser;
        deserialzeMethodArguments[1] = null;
        deserialzeMethodArguments[2] = object;
        deserialzeMethodArguments[3] = null;
        try {
            deserialzeMethod.invoke(mapDeserializer, deserialzeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDeserialze2() throws Throwable  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.MapDeserializer"));
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        when(defaultJSONParserMock.parseObject(any(Map.class), any(Object.class))).thenReturn(null);
        
        Class mapDeserializerClazz = Class.forName("com.alibaba.fastjson.parser.deserializer.MapDeserializer");
        Class defaultJSONParserMockType = Class.forName("com.alibaba.fastjson.parser.DefaultJSONParser");
        Class typeType = Class.forName("java.lang.reflect.Type");
        Class objectType = Class.forName("java.lang.Object");
        Class mapType = Class.forName("java.util.Map");
        Method deserialzeMethod = mapDeserializerClazz.getDeclaredMethod("deserialze", defaultJSONParserMockType, typeType, objectType, mapType);
        deserialzeMethod.setAccessible(true);
        java.lang.Object[] deserialzeMethodArguments = new java.lang.Object[4];
        deserialzeMethodArguments[0] = defaultJSONParserMock;
        deserialzeMethodArguments[1] = null;
        deserialzeMethodArguments[2] = null;
        deserialzeMethodArguments[3] = null;
        Object actual = deserialzeMethod.invoke(mapDeserializer, deserialzeMethodArguments);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDeserialze3() throws Throwable  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.MapDeserializer"));
        Object wildcardTypeImpl = createInstance("retrofit2.Utils$WildcardTypeImpl");
        
        Class mapDeserializerClazz = Class.forName("com.alibaba.fastjson.parser.deserializer.MapDeserializer");
        Class defaultJSONParserType = Class.forName("com.alibaba.fastjson.parser.DefaultJSONParser");
        Class wildcardTypeImplType = Class.forName("java.lang.reflect.Type");
        Class wildcardTypeImplType1 = Class.forName("java.lang.Object");
        Class mapType = Class.forName("java.util.Map");
        Method deserialzeMethod = mapDeserializerClazz.getDeclaredMethod("deserialze", defaultJSONParserType, wildcardTypeImplType, wildcardTypeImplType1, mapType);
        deserialzeMethod.setAccessible(true);
        java.lang.Object[] deserialzeMethodArguments = new java.lang.Object[4];
        deserialzeMethodArguments[0] = null;
        deserialzeMethodArguments[1] = wildcardTypeImpl;
        deserialzeMethodArguments[2] = wildcardTypeImpl;
        deserialzeMethodArguments[3] = null;
        try {
            deserialzeMethod.invoke(mapDeserializer, deserialzeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDeserialze4() throws Throwable  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.MapDeserializer"));
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        ParameterizedTypeImpl parameterizedTypeImpl = ((ParameterizedTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl"));
        java.lang.reflect.Type[] typeArray = new java.lang.reflect.Type[1];
        setField(parameterizedTypeImpl, "actualTypeArguments", typeArray);
        
        Class mapDeserializerClazz = Class.forName("com.alibaba.fastjson.parser.deserializer.MapDeserializer");
        Class defaultJSONParserMockType = Class.forName("com.alibaba.fastjson.parser.DefaultJSONParser");
        Class parameterizedTypeImplType = Class.forName("java.lang.reflect.Type");
        Class objectType = Class.forName("java.lang.Object");
        Class mapType = Class.forName("java.util.Map");
        Method deserialzeMethod = mapDeserializerClazz.getDeclaredMethod("deserialze", defaultJSONParserMockType, parameterizedTypeImplType, objectType, mapType);
        deserialzeMethod.setAccessible(true);
        java.lang.Object[] deserialzeMethodArguments = new java.lang.Object[4];
        deserialzeMethodArguments[0] = defaultJSONParserMock;
        deserialzeMethodArguments[1] = parameterizedTypeImpl;
        deserialzeMethodArguments[2] = null;
        deserialzeMethodArguments[3] = null;
        try {
            deserialzeMethod.invoke(mapDeserializer, deserialzeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDeserialze5() throws Throwable  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.MapDeserializer"));
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        ParameterizedTypeImpl parameterizedTypeImpl = ((ParameterizedTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl"));
        java.lang.reflect.Type[] typeArray = new java.lang.reflect.Type[0];
        setField(parameterizedTypeImpl, "actualTypeArguments", typeArray);
        
        Class mapDeserializerClazz = Class.forName("com.alibaba.fastjson.parser.deserializer.MapDeserializer");
        Class defaultJSONParserMockType = Class.forName("com.alibaba.fastjson.parser.DefaultJSONParser");
        Class parameterizedTypeImplType = Class.forName("java.lang.reflect.Type");
        Class objectType = Class.forName("java.lang.Object");
        Class mapType = Class.forName("java.util.Map");
        Method deserialzeMethod = mapDeserializerClazz.getDeclaredMethod("deserialze", defaultJSONParserMockType, parameterizedTypeImplType, objectType, mapType);
        deserialzeMethod.setAccessible(true);
        java.lang.Object[] deserialzeMethodArguments = new java.lang.Object[4];
        deserialzeMethodArguments[0] = defaultJSONParserMock;
        deserialzeMethodArguments[1] = parameterizedTypeImpl;
        deserialzeMethodArguments[2] = null;
        deserialzeMethodArguments[3] = null;
        try {
            deserialzeMethod.invoke(mapDeserializer, deserialzeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDeserialze6() throws Throwable  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.MapDeserializer"));
        ParameterizedTypeImpl parameterizedTypeImpl = ((ParameterizedTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl"));
        java.awt.geom.CubicCurve2D.Float[][] floatArray = new java.awt.geom.CubicCurve2D.Float[0][];
        
        mapDeserializer.deserialze(null, parameterizedTypeImpl, floatArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDeserialze7() throws Throwable  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.MapDeserializer"));
        Class class1 = Object.class;
        java.lang.Object[] ofRefArray = createArray("java.util.stream.Nodes$ToArrayTask$OfRef", 0);
        
        mapDeserializer.deserialze(null, class1, ofRefArray);
        
        Class finalClass1 = class1;
        
        Class expectedFinalClass1 = com.alibaba.fastjson.JSONObject.class;
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expectedFinalClass1, finalClass1));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDeserialze8() throws Throwable  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.MapDeserializer"));
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        when(defaultJSONParserMock.getFieldTypeResolver()).thenReturn(((FieldTypeResolver) null));
        when(defaultJSONParserMock.parseObject()).thenReturn(((com.alibaba.fastjson.JSONObject) null));
        Class class1 = Object.class;
        java.lang.Object[] ofRefArray = createArray("java.util.stream.Nodes$ToArrayTask$OfRef", 0);
        
        Object actual = mapDeserializer.deserialze(defaultJSONParserMock, class1, ofRefArray);
        
        assertNull(actual);
        
        Class finalClass1 = class1;
        
        Class expectedFinalClass1 = com.alibaba.fastjson.JSONObject.class;
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expectedFinalClass1, finalClass1));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDeserialze9() throws Throwable  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.MapDeserializer"));
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(8);
        setField(defaultJSONParserMock, "lexer", jSONLexerMock);
        
        Object actual = mapDeserializer.deserialze(defaultJSONParserMock, null, null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDeserialze10() throws Throwable  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.MapDeserializer"));
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        FieldTypeResolver fieldTypeResolverMock = mock(FieldTypeResolver.class);
        when(defaultJSONParserMock.getFieldTypeResolver()).thenReturn(fieldTypeResolverMock);
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(8);
        setField(defaultJSONParserMock, "lexer", jSONLexerMock);
        Class class1 = Object.class;
        
        Object actual = mapDeserializer.deserialze(defaultJSONParserMock, class1, null);
        
        assertNull(actual);
        
        Class finalClass1 = class1;
        
        Class expectedFinalClass1 = com.alibaba.fastjson.JSONObject.class;
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expectedFinalClass1, finalClass1));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetFastMatchToken1() throws Throwable  {
        MapDeserializer mapDeserializer = new MapDeserializer();
        
        int actual = mapDeserializer.getFastMatchToken();
        
        assertEquals(12, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetFastMatchToken2() throws Throwable  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.MapDeserializer"));
        
        int actual = mapDeserializer.getFastMatchToken();
        
        assertEquals(12, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateMap1() throws Throwable  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.MapDeserializer"));
        TypeVariableImpl typeVariableImpl = ((TypeVariableImpl) createInstance("sun.reflect.generics.reflectiveObjects.TypeVariableImpl"));
        
        mapDeserializer.createMap(typeVariableImpl);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateMap2() throws Throwable  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.MapDeserializer"));
        
        mapDeserializer.createMap(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateMap3() throws Throwable  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.MapDeserializer"));
        Class class1 = Object.class;
        
        mapDeserializer.createMap(class1);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCreateMap4() throws Throwable  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.MapDeserializer"));
        Class class1 = Object.class;
        
        Map actual = mapDeserializer.createMap(class1);
        
        HashMap expected = new HashMap();
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
        
        Class finalClass1 = class1;
        
        Class expectedFinalClass1 = Map.class;
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expectedFinalClass1, finalClass1));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCreateMap5() throws Throwable  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.MapDeserializer"));
        Class class1 = Object.class;
        
        Map actual = mapDeserializer.createMap(class1);
        
        ConcurrentHashMap expected = new ConcurrentHashMap();
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
        
        Class finalClass1 = class1;
        
        Class expectedFinalClass1 = java.util.concurrent.ConcurrentMap.class;
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expectedFinalClass1, finalClass1));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCreateMap6() throws Throwable  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.MapDeserializer"));
        Class class1 = Object.class;
        
        Map actual = mapDeserializer.createMap(class1);
        
        LinkedHashMap expected = new LinkedHashMap();
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
        
        Class finalClass1 = class1;
        
        Class expectedFinalClass1 = LinkedHashMap.class;
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expectedFinalClass1, finalClass1));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCreateMap7() throws Throwable  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.MapDeserializer"));
        Class class1 = Object.class;
        
        Map actual = mapDeserializer.createMap(class1);
        
        ConcurrentHashMap expected = new ConcurrentHashMap();
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
        
        Class finalClass1 = class1;
        
        Class expectedFinalClass1 = ConcurrentHashMap.class;
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expectedFinalClass1, finalClass1));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateMap8() throws Throwable  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.MapDeserializer"));
        ParameterizedTypeImpl parameterizedTypeImpl = ((ParameterizedTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl"));
        Class class1 = Object.class;
        setField(parameterizedTypeImpl, "rawType", class1);
        java.lang.reflect.Type[] typeArray = new java.lang.reflect.Type[0];
        setField(parameterizedTypeImpl, "actualTypeArguments", typeArray);
        
        Object initialParameterizedTypeImplRawType = getFieldValue(parameterizedTypeImpl, "rawType");
        
        mapDeserializer.createMap(parameterizedTypeImpl);
        
        Object finalParameterizedTypeImplRawType = getFieldValue(parameterizedTypeImpl, "rawType");
        
        Class expectedFinalParameterizedTypeImplRawType = java.util.EnumMap.class;
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expectedFinalParameterizedTypeImplRawType, finalParameterizedTypeImplRawType));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateMap9() throws Throwable  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.MapDeserializer"));
        ParameterizedTypeImpl parameterizedTypeImpl = ((ParameterizedTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl"));
        Class class1 = Object.class;
        setField(parameterizedTypeImpl, "rawType", class1);
        java.lang.reflect.Type[] typeArray = new java.lang.reflect.Type[1];
        TypeVariableImpl typeVariableImpl = ((TypeVariableImpl) createInstance("sun.reflect.generics.reflectiveObjects.TypeVariableImpl"));
        typeArray[0] = ((Type) typeVariableImpl);
        setField(parameterizedTypeImpl, "actualTypeArguments", typeArray);
        
        Object initialParameterizedTypeImplRawType = getFieldValue(parameterizedTypeImpl, "rawType");
        
        mapDeserializer.createMap(parameterizedTypeImpl);
        
        Object finalParameterizedTypeImplRawType = getFieldValue(parameterizedTypeImpl, "rawType");
        
        Class expectedFinalParameterizedTypeImplRawType = java.util.EnumMap.class;
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expectedFinalParameterizedTypeImplRawType, finalParameterizedTypeImplRawType));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCreateMap10() throws Throwable  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.MapDeserializer"));
        Class class1 = Object.class;
        
        Map actual = mapDeserializer.createMap(class1);
        
        HashMap expected = new HashMap();
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
        
        Class finalClass1 = class1;
        
        Class expectedFinalClass1 = HashMap.class;
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expectedFinalClass1, finalClass1));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCreateMap11() throws Throwable  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.MapDeserializer"));
        Class class1 = Object.class;
        
        Map actual = mapDeserializer.createMap(class1);
        
        Hashtable expected = ((Hashtable) createInstance("java.util.Hashtable"));
        setField(expected, "modCount", 0);
        setField(expected, "loadFactor", 0.75f);
        setField(expected, "threshold", 8);
        java.lang.Object[] entryArray = createArray("java.util.Hashtable$Entry", 11);
        setField(expected, "table", entryArray);
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
        
        Class finalClass1 = class1;
        
        Class expectedFinalClass1 = Hashtable.class;
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expectedFinalClass1, finalClass1));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateMap12() throws Throwable  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.MapDeserializer"));
        ParameterizedTypeImpl parameterizedTypeImpl = ((ParameterizedTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl"));
        Class class1 = Object.class;
        setField(parameterizedTypeImpl, "rawType", class1);
        java.lang.reflect.Type[] typeArray = new java.lang.reflect.Type[0];
        setField(parameterizedTypeImpl, "actualTypeArguments", typeArray);
        
        Object initialParameterizedTypeImplRawType = getFieldValue(parameterizedTypeImpl, "rawType");
        
        mapDeserializer.createMap(parameterizedTypeImpl);
        
        Object finalParameterizedTypeImplRawType = getFieldValue(parameterizedTypeImpl, "rawType");
        
        Class expectedFinalParameterizedTypeImplRawType = java.util.EnumMap.class;
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expectedFinalParameterizedTypeImplRawType, finalParameterizedTypeImplRawType));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCreateMap13() throws Throwable  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.MapDeserializer"));
        Class class1 = Object.class;
        
        Map actual = mapDeserializer.createMap(class1);
        
        IdentityHashMap expected = ((IdentityHashMap) createInstance("java.util.IdentityHashMap"));
        java.lang.Object[] objectArray = new java.lang.Object[64];
        setField(expected, "table", objectArray);
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
        
        Class finalClass1 = class1;
        
        Class expectedFinalClass1 = IdentityHashMap.class;
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expectedFinalClass1, finalClass1));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCreateMap14() throws Throwable  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.MapDeserializer"));
        Class class1 = Object.class;
        
        Map actual = mapDeserializer.createMap(class1);
        
        Properties expected = ((Properties) createInstance("java.util.Properties"));
        setField(expected, "modCount", 0);
        setField(expected, "loadFactor", 0.75f);
        setField(expected, "threshold", 8);
        java.lang.Object[] entryArray = createArray("java.util.Hashtable$Entry", 11);
        setField(expected, "table", entryArray);
        setField(expected, "defaults", null);
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
        
        Class finalClass1 = class1;
        
        Class expectedFinalClass1 = Properties.class;
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expectedFinalClass1, finalClass1));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCreateMap15() throws Throwable  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.alibaba.fastjson.parser.deserializer.MapDeserializer"));
        ParameterizedTypeImpl parameterizedTypeImpl = ((ParameterizedTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl"));
        Class class1 = Object.class;
        setField(parameterizedTypeImpl, "rawType", class1);
        
        Object initialParameterizedTypeImplRawType = getFieldValue(parameterizedTypeImpl, "rawType");
        
        Map actual = mapDeserializer.createMap(parameterizedTypeImpl);
        
        Hashtable expected = ((Hashtable) createInstance("java.util.Hashtable"));
        setField(expected, "modCount", 0);
        setField(expected, "loadFactor", 0.75f);
        setField(expected, "threshold", 8);
        java.lang.Object[] entryArray = createArray("java.util.Hashtable$Entry", 11);
        setField(expected, "table", entryArray);
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
        
        Object finalParameterizedTypeImplRawType = getFieldValue(parameterizedTypeImpl, "rawType");
        
        Class expectedFinalParameterizedTypeImplRawType = Hashtable.class;
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expectedFinalParameterizedTypeImplRawType, finalParameterizedTypeImplRawType));
    }
    ///endregion
    
    
    ///region Errors report for createMap
    
    public void testCreateMap_errors()
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
    public void testParseMap1() throws Throwable  {
        Class class1 = Object.class;
        TypeVariableImpl typeVariableImpl = ((TypeVariableImpl) createInstance("sun.reflect.generics.reflectiveObjects.TypeVariableImpl"));
        java.lang.Object[] collectionMappingArray = createArray("com.sun.jmx.mbeanserver.DefaultMXBeanMappingFactory$CollectionMapping", 0);
        
        MapDeserializer.parseMap(null, null, class1, typeVariableImpl, collectionMappingArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseMap2() throws Throwable  {
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(0, 0);
        setField(defaultJSONParserMock, "lexer", jSONLexerMock);
        
        MapDeserializer.parseMap(defaultJSONParserMock, null, null, null, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseMap3() throws Throwable  {
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        when(defaultJSONParserMock.getConfig()).thenReturn(((ParserConfig) null));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(0, 16);
        setField(defaultJSONParserMock, "lexer", jSONLexerMock);
        Class class1 = Object.class;
        Object wildcardTypeImpl = createInstance("retrofit2.Utils$WildcardTypeImpl");
        java.lang.Object[] ofDoubleArray = createArray("java.util.stream.StreamSpliterators$SliceSpliterator$OfDouble", 0);
        
        Class mapDeserializerClazz = Class.forName("com.alibaba.fastjson.parser.deserializer.MapDeserializer");
        Class defaultJSONParserMockType = Class.forName("com.alibaba.fastjson.parser.DefaultJSONParser");
        Class mapType = Class.forName("java.util.Map");
        Class class1Type = Class.forName("java.lang.reflect.Type");
        Method parseMapMethod = mapDeserializerClazz.getDeclaredMethod("parseMap", defaultJSONParserMockType, mapType, class1Type, class1Type, class1);
        parseMapMethod.setAccessible(true);
        java.lang.Object[] parseMapMethodArguments = new java.lang.Object[5];
        parseMapMethodArguments[0] = defaultJSONParserMock;
        parseMapMethodArguments[1] = null;
        parseMapMethodArguments[2] = class1;
        parseMapMethodArguments[3] = wildcardTypeImpl;
        parseMapMethodArguments[4] = ((Object) ofDoubleArray);
        try {
            parseMapMethod.invoke(null, parseMapMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseMap4() throws Throwable  {
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        ParserConfig parserConfigMock = mock(ParserConfig.class);
        when(parserConfigMock.getDeserializer(any(Type.class))).thenReturn(((ObjectDeserializer) null));
        when(defaultJSONParserMock.getConfig()).thenReturn(parserConfigMock, ((ParserConfig) null));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(12);
        setField(defaultJSONParserMock, "lexer", jSONLexerMock);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        TypeVariableImpl typeVariableImpl = ((TypeVariableImpl) createInstance("sun.reflect.generics.reflectiveObjects.TypeVariableImpl"));
        java.lang.Object[] ofDoubleArray = createArray("java.util.stream.StreamSpliterators$SliceSpliterator$OfDouble", 0);
        
        MapDeserializer.parseMap(defaultJSONParserMock, linkedHashMap, typeVariableImpl, typeVariableImpl, ofDoubleArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseMap5() throws Throwable  {
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        ParserConfig parserConfigMock = mock(ParserConfig.class);
        when(parserConfigMock.getDeserializer(any(Type.class))).thenReturn(((ObjectDeserializer) null), ((ObjectDeserializer) null));
        when(defaultJSONParserMock.getConfig()).thenReturn(parserConfigMock, parserConfigMock);
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(0, 16);
        setField(defaultJSONParserMock, "lexer", jSONLexerMock);
        TypeVariableImpl typeVariableImpl = ((TypeVariableImpl) createInstance("sun.reflect.generics.reflectiveObjects.TypeVariableImpl"));
        java.lang.Object[] ofDoubleArray = createArray("java.util.stream.StreamSpliterators$SliceSpliterator$OfDouble", 0);
        
        MapDeserializer.parseMap(defaultJSONParserMock, null, typeVariableImpl, typeVariableImpl, ofDoubleArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseMap6() throws Throwable  {
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        ParserConfig parserConfigMock = mock(ParserConfig.class);
        ObjectDeserializer objectDeserializerMock = mock(ObjectDeserializer.class);
        when(objectDeserializerMock.getFastMatchToken()).thenReturn(0);
        when(parserConfigMock.getDeserializer(any(Type.class))).thenReturn(objectDeserializerMock, ((ObjectDeserializer) null));
        when(defaultJSONParserMock.getConfig()).thenReturn(parserConfigMock, parserConfigMock);
        when(defaultJSONParserMock.getContext()).thenReturn(((com.alibaba.fastjson.parser.ParseContext) null));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(0, 16, 0, 4);
        when(jSONLexerMock.isRef()).thenReturn(false);
        setField(defaultJSONParserMock, "lexer", jSONLexerMock);
        GenericArrayTypeImpl genericArrayTypeImpl = ((GenericArrayTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.GenericArrayTypeImpl"));
        TypeVariableImpl typeVariableImpl = ((TypeVariableImpl) createInstance("sun.reflect.generics.reflectiveObjects.TypeVariableImpl"));
        java.lang.Object[] ofDoubleArray = createArray("java.util.stream.StreamSpliterators$SliceSpliterator$OfDouble", 0);
        
        MapDeserializer.parseMap(defaultJSONParserMock, null, genericArrayTypeImpl, typeVariableImpl, ofDoubleArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testParseMap7() throws Throwable  {
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        ParserConfig parserConfigMock = mock(ParserConfig.class);
        ObjectDeserializer objectDeserializerMock = mock(ObjectDeserializer.class);
        when(objectDeserializerMock.getFastMatchToken()).thenReturn(0);
        when(parserConfigMock.getDeserializer(any(Type.class))).thenReturn(objectDeserializerMock, ((ObjectDeserializer) null));
        when(defaultJSONParserMock.getConfig()).thenReturn(parserConfigMock, parserConfigMock);
        when(defaultJSONParserMock.getContext()).thenReturn(((com.alibaba.fastjson.parser.ParseContext) null));
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(0, 16, 13);
        setField(defaultJSONParserMock, "lexer", jSONLexerMock);
        TypeVariableImpl typeVariableImpl = ((TypeVariableImpl) createInstance("sun.reflect.generics.reflectiveObjects.TypeVariableImpl"));
        Object wildcardTypeImpl = createInstance("retrofit2.Utils$WildcardTypeImpl");
        java.lang.Object[] ofDoubleArray = createArray("java.util.stream.StreamSpliterators$SliceSpliterator$OfDouble", 0);
        
        Class mapDeserializerClazz = Class.forName("com.alibaba.fastjson.parser.deserializer.MapDeserializer");
        Class defaultJSONParserMockType = Class.forName("com.alibaba.fastjson.parser.DefaultJSONParser");
        Class mapType = Class.forName("java.util.Map");
        Class typeVariableImplType = Class.forName("java.lang.reflect.Type");
        Class ofDoubleArrayType = Class.forName("java.lang.Object");
        Method parseMapMethod = mapDeserializerClazz.getDeclaredMethod("parseMap", defaultJSONParserMockType, mapType, typeVariableImplType, typeVariableImplType, ofDoubleArrayType);
        parseMapMethod.setAccessible(true);
        java.lang.Object[] parseMapMethodArguments = new java.lang.Object[5];
        parseMapMethodArguments[0] = defaultJSONParserMock;
        parseMapMethodArguments[1] = null;
        parseMapMethodArguments[2] = typeVariableImpl;
        parseMapMethodArguments[3] = wildcardTypeImpl;
        parseMapMethodArguments[4] = ((Object) ofDoubleArray);
        Object actual = parseMapMethod.invoke(null, parseMapMethodArguments);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testParseMap8() throws Throwable  {
        Class class1 = Object.class;
        java.lang.Object[] inProgressArray = createArray("[Lsun.management.MappedMXBeanType$InProgress;", 0);
        
        MapDeserializer.parseMap(null, null, class1, inProgressArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testMapDeserializer1() {
        MapDeserializer actual = new MapDeserializer();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testMapDeserializer2() {
        MapDeserializer actual = new MapDeserializer();
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
