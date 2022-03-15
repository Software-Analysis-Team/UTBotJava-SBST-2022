package com.alibaba.fastjson;

import org.junit.Test;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import java.util.Locale;
import com.alibaba.fastjson.parser.JSONLexer;
import java.lang.reflect.Method;
import java.util.TimeZone;
import java.util.Map;
import java.lang.reflect.Type;
import jdk.internal.org.xml.sax.InputSource;
import sun.reflect.generics.reflectiveObjects.TypeVariableImpl;
import java.io.Reader;
import com.alibaba.fastjson.parser.Feature;
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
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class JSONReaderTest {
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testClose1() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        
        jSONReader.close();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testClose2() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        setField(jSONReader, "parser", defaultJSONParserMock);
        
        jSONReader.close();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testSetLocale1() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        Locale locale = ((Locale) createInstance("java.util.Locale"));
        
        jSONReader.setLocale(locale);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetLocale2() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        setField(defaultJSONParserMock, "lexer", jSONLexerMock);
        setField(jSONReader, "parser", defaultJSONParserMock);
        
        jSONReader.setLocale(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadLong1() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        
        jSONReader.readLong();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReadLong2() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(com.alibaba.fastjson.util.TypeUtils.class);
            Long long1 = 0L;
            mockedStatic.when(() -> {
                com.alibaba.fastjson.util.TypeUtils.castToLong(any());
            }).thenReturn(long1);
            JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
            setField(jSONReader, "context", null);
            DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
            java.lang.Object[] ofIntArray = createArray("java.util.stream.ForEachOps$ForEachOp$OfInt", 0);
            when(defaultJSONParserMock.parse()).thenReturn(((Object) ofIntArray));
            setField(jSONReader, "parser", defaultJSONParserMock);
            
            Long actual = jSONReader.readLong();
            
            
            // Current deep equals depth exceeds max depth 0
            assertTrue(deepEquals(long1, actual));
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReadLong3() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(com.alibaba.fastjson.util.TypeUtils.class);
            mockedStatic.when(() -> {
                com.alibaba.fastjson.util.TypeUtils.castToLong(any());
            }).thenReturn(((Long) null));
            JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
            JSONStreamContext jSONStreamContextMock = mock(JSONStreamContext.class);
            jSONStreamContextMock.state = 1005;
            setField(jSONReader, "context", jSONStreamContextMock);
            DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
            when(defaultJSONParserMock.parse()).thenReturn(null);
            setField(jSONReader, "parser", defaultJSONParserMock);
            
            Long actual = jSONReader.readLong();
            
            assertNull(actual);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadLong4() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContextMock = mock(JSONStreamContext.class);
        jSONStreamContextMock.state = 1006;
        setField(jSONReader, "context", jSONStreamContextMock);
        
        jSONReader.readLong();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReadLong5() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(com.alibaba.fastjson.util.TypeUtils.class);
            mockedStatic.when(() -> {
                com.alibaba.fastjson.util.TypeUtils.castToLong(any());
            }).thenReturn(((Long) null));
            JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
            JSONStreamContext jSONStreamContextMock = mock(JSONStreamContext.class);
            jSONStreamContextMock.state = 1001;
            setField(jSONReader, "context", jSONStreamContextMock);
            DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
            when(defaultJSONParserMock.parse()).thenReturn(null);
            setField(jSONReader, "parser", defaultJSONParserMock);
            
            Long actual = jSONReader.readLong();
            
            assertNull(actual);
            
            Object jSONReaderContext = getFieldValue(jSONReader, "context");
            Object finalJSONReaderContextState = getFieldValue(jSONReaderContext, "state");
            
            assertEquals(1002, finalJSONReaderContextState);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReadLong6() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(com.alibaba.fastjson.util.TypeUtils.class);
            mockedStatic.when(() -> {
                com.alibaba.fastjson.util.TypeUtils.castToLong(any());
            }).thenReturn(((Long) null));
            JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
            JSONStreamContext jSONStreamContextMock = mock(JSONStreamContext.class);
            jSONStreamContextMock.state = 1002;
            setField(jSONReader, "context", jSONStreamContextMock);
            DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
            when(defaultJSONParserMock.parse()).thenReturn(null);
            setField(jSONReader, "parser", defaultJSONParserMock);
            
            Long actual = jSONReader.readLong();
            
            assertNull(actual);
            
            Object jSONReaderContext = getFieldValue(jSONReader, "context");
            Object finalJSONReaderContextState = getFieldValue(jSONReaderContext, "state");
            
            assertEquals(1003, finalJSONReaderContextState);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReadLong7() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(com.alibaba.fastjson.util.TypeUtils.class);
            mockedStatic.when(() -> {
                com.alibaba.fastjson.util.TypeUtils.castToLong(any());
            }).thenReturn(((Long) null));
            JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
            JSONStreamContext jSONStreamContextMock = mock(JSONStreamContext.class);
            jSONStreamContextMock.state = 1003;
            setField(jSONReader, "context", jSONStreamContextMock);
            DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
            when(defaultJSONParserMock.parse()).thenReturn(null);
            setField(jSONReader, "parser", defaultJSONParserMock);
            
            Long actual = jSONReader.readLong();
            
            assertNull(actual);
            
            Object jSONReaderContext = getFieldValue(jSONReader, "context");
            Object finalJSONReaderContextState = getFieldValue(jSONReaderContext, "state");
            
            assertEquals(1002, finalJSONReaderContextState);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReadLong8() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(com.alibaba.fastjson.util.TypeUtils.class);
            mockedStatic.when(() -> {
                com.alibaba.fastjson.util.TypeUtils.castToLong(any());
            }).thenReturn(((Long) null));
            JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
            JSONStreamContext jSONStreamContextMock = mock(JSONStreamContext.class);
            jSONStreamContextMock.state = 1004;
            setField(jSONReader, "context", jSONStreamContextMock);
            DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
            when(defaultJSONParserMock.parse()).thenReturn(null);
            setField(jSONReader, "parser", defaultJSONParserMock);
            
            Long actual = jSONReader.readLong();
            
            assertNull(actual);
            
            Object jSONReaderContext = getFieldValue(jSONReader, "context");
            Object finalJSONReaderContextState = getFieldValue(jSONReaderContext, "state");
            
            assertEquals(1005, finalJSONReaderContextState);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadString1() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        
        jSONReader.readString();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReadString2() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(com.alibaba.fastjson.util.TypeUtils.class);
            mockedStatic.when(() -> {
                com.alibaba.fastjson.util.TypeUtils.castToString(any());
            }).thenReturn(((String) null));
            JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
            setField(jSONReader, "context", null);
            DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
            java.lang.Object[] actionsArray = createArray("javax.swing.plaf.basic.BasicPopupMenuUI$Actions", 0);
            when(defaultJSONParserMock.parse()).thenReturn(((Object) actionsArray));
            setField(jSONReader, "parser", defaultJSONParserMock);
            
            String actual = jSONReader.readString();
            
            assertNull(actual);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReadString3() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(com.alibaba.fastjson.util.TypeUtils.class);
            mockedStatic.when(() -> {
                com.alibaba.fastjson.util.TypeUtils.castToString(any());
            }).thenReturn(((String) null));
            JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
            JSONStreamContext jSONStreamContextMock = mock(JSONStreamContext.class);
            jSONStreamContextMock.state = 1001;
            setField(jSONReader, "context", jSONStreamContextMock);
            DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
            when(defaultJSONParserMock.parse()).thenReturn(null);
            JSONLexer jSONLexerMock = mock(JSONLexer.class);
            when(jSONLexerMock.token()).thenReturn(0);
            setField(defaultJSONParserMock, "lexer", jSONLexerMock);
            setField(jSONReader, "parser", defaultJSONParserMock);
            
            String actual = jSONReader.readString();
            
            assertNull(actual);
            
            Object jSONReaderContext = getFieldValue(jSONReader, "context");
            Object finalJSONReaderContextState = getFieldValue(jSONReaderContext, "state");
            
            assertEquals(1002, finalJSONReaderContextState);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadString4() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContextMock = mock(JSONStreamContext.class);
        jSONStreamContextMock.state = 1006;
        setField(jSONReader, "context", jSONStreamContextMock);
        
        jSONReader.readString();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReadString5() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(com.alibaba.fastjson.util.TypeUtils.class);
            mockedStatic.when(() -> {
                com.alibaba.fastjson.util.TypeUtils.castToString(any());
            }).thenReturn(((String) null));
            JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
            JSONStreamContext jSONStreamContextMock = mock(JSONStreamContext.class);
            jSONStreamContextMock.state = 1004;
            setField(jSONReader, "context", jSONStreamContextMock);
            DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
            when(defaultJSONParserMock.parse()).thenReturn(null);
            JSONLexer jSONLexerMock = mock(JSONLexer.class);
            setField(defaultJSONParserMock, "lexer", jSONLexerMock);
            setField(jSONReader, "parser", defaultJSONParserMock);
            
            String actual = jSONReader.readString();
            
            assertNull(actual);
            
            Object jSONReaderContext = getFieldValue(jSONReader, "context");
            Object finalJSONReaderContextState = getFieldValue(jSONReaderContext, "state");
            
            assertEquals(1005, finalJSONReaderContextState);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReadString6() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(com.alibaba.fastjson.util.TypeUtils.class);
            mockedStatic.when(() -> {
                com.alibaba.fastjson.util.TypeUtils.castToString(any());
            }).thenReturn(((String) null));
            JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
            JSONStreamContext jSONStreamContextMock = mock(JSONStreamContext.class);
            jSONStreamContextMock.state = 1001;
            setField(jSONReader, "context", jSONStreamContextMock);
            DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
            JSONLexer jSONLexerMock = mock(JSONLexer.class);
            when(jSONLexerMock.token()).thenReturn(18);
            when(jSONLexerMock.stringVal()).thenReturn(((String) null));
            setField(defaultJSONParserMock, "lexer", jSONLexerMock);
            setField(jSONReader, "parser", defaultJSONParserMock);
            
            String actual = jSONReader.readString();
            
            assertNull(actual);
            
            Object jSONReaderContext = getFieldValue(jSONReader, "context");
            Object finalJSONReaderContextState = getFieldValue(jSONReaderContext, "state");
            
            assertEquals(1002, finalJSONReaderContextState);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReadString7() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(com.alibaba.fastjson.util.TypeUtils.class);
            mockedStatic.when(() -> {
                com.alibaba.fastjson.util.TypeUtils.castToString(any());
            }).thenReturn(((String) null));
            JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
            JSONStreamContext jSONStreamContextMock = mock(JSONStreamContext.class);
            jSONStreamContextMock.state = 1003;
            setField(jSONReader, "context", jSONStreamContextMock);
            DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
            when(defaultJSONParserMock.parse()).thenReturn(null);
            JSONLexer jSONLexerMock = mock(JSONLexer.class);
            setField(defaultJSONParserMock, "lexer", jSONLexerMock);
            setField(jSONReader, "parser", defaultJSONParserMock);
            
            String actual = jSONReader.readString();
            
            assertNull(actual);
            
            Object jSONReaderContext = getFieldValue(jSONReader, "context");
            Object finalJSONReaderContextState = getFieldValue(jSONReaderContext, "state");
            
            assertEquals(1002, finalJSONReaderContextState);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReadString8() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(com.alibaba.fastjson.util.TypeUtils.class);
            mockedStatic.when(() -> {
                com.alibaba.fastjson.util.TypeUtils.castToString(any());
            }).thenReturn(((String) null));
            JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
            JSONStreamContext jSONStreamContextMock = mock(JSONStreamContext.class);
            jSONStreamContextMock.state = 1005;
            setField(jSONReader, "context", jSONStreamContextMock);
            DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
            when(defaultJSONParserMock.parse()).thenReturn(null);
            JSONLexer jSONLexerMock = mock(JSONLexer.class);
            setField(defaultJSONParserMock, "lexer", jSONLexerMock);
            setField(jSONReader, "parser", defaultJSONParserMock);
            
            String actual = jSONReader.readString();
            
            assertNull(actual);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReadString9() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(com.alibaba.fastjson.util.TypeUtils.class);
            mockedStatic.when(() -> {
                com.alibaba.fastjson.util.TypeUtils.castToString(any());
            }).thenReturn(((String) null));
            JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
            JSONStreamContext jSONStreamContextMock = mock(JSONStreamContext.class);
            jSONStreamContextMock.state = 1002;
            setField(jSONReader, "context", jSONStreamContextMock);
            DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
            when(defaultJSONParserMock.parse()).thenReturn(null);
            JSONLexer jSONLexerMock = mock(JSONLexer.class);
            setField(defaultJSONParserMock, "lexer", jSONLexerMock);
            setField(jSONReader, "parser", defaultJSONParserMock);
            
            String actual = jSONReader.readString();
            
            assertNull(actual);
            
            Object jSONReaderContext = getFieldValue(jSONReader, "context");
            Object finalJSONReaderContextState = getFieldValue(jSONReaderContext, "state");
            
            assertEquals(1003, finalJSONReaderContextState);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testConfig1() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        setField(jSONReader, "parser", defaultJSONParserMock);
        
        jSONReader.config(null, false);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testEndObject1() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        
        jSONReader.endObject();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testEndObject2() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        setField(jSONReader, "context", null);
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        setField(jSONReader, "parser", defaultJSONParserMock);
        
        jSONReader.endObject();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testEndObject3() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContextMock = mock(JSONStreamContext.class);
        jSONStreamContextMock.state = 1001;
        setField(jSONStreamContextMock, "parent", jSONStreamContextMock);
        setField(jSONReader, "context", jSONStreamContextMock);
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        setField(jSONReader, "parser", defaultJSONParserMock);
        
        jSONReader.endObject();
        
        Object jSONReaderContext = getFieldValue(jSONReader, "context");
        Object finalJSONReaderContextState = getFieldValue(jSONReaderContext, "state");
        
        assertEquals(1002, finalJSONReaderContextState);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testEndObject4() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContextMock = mock(JSONStreamContext.class);
        jSONStreamContextMock.state = 1002;
        setField(jSONStreamContextMock, "parent", jSONStreamContextMock);
        setField(jSONReader, "context", jSONStreamContextMock);
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        setField(jSONReader, "parser", defaultJSONParserMock);
        
        jSONReader.endObject();
        
        Object jSONReaderContext = getFieldValue(jSONReader, "context");
        Object finalJSONReaderContextState = getFieldValue(jSONReaderContext, "state");
        
        assertEquals(1003, finalJSONReaderContextState);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testEndObject5() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContextMock = mock(JSONStreamContext.class);
        jSONStreamContextMock.state = 0;
        setField(jSONStreamContextMock, "parent", jSONStreamContextMock);
        setField(jSONReader, "context", jSONStreamContextMock);
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        setField(jSONReader, "parser", defaultJSONParserMock);
        
        jSONReader.endObject();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testEndObject6() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContextMock = mock(JSONStreamContext.class);
        jSONStreamContextMock.state = 1003;
        setField(jSONStreamContextMock, "parent", jSONStreamContextMock);
        setField(jSONReader, "context", jSONStreamContextMock);
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        setField(jSONReader, "parser", defaultJSONParserMock);
        
        jSONReader.endObject();
        
        Object jSONReaderContext = getFieldValue(jSONReader, "context");
        Object finalJSONReaderContextState = getFieldValue(jSONReaderContext, "state");
        
        assertEquals(1002, finalJSONReaderContextState);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testEndObject7() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContextMock = mock(JSONStreamContext.class);
        jSONStreamContextMock.state = 1004;
        setField(jSONStreamContextMock, "parent", jSONStreamContextMock);
        setField(jSONReader, "context", jSONStreamContextMock);
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        setField(jSONReader, "parser", defaultJSONParserMock);
        
        jSONReader.endObject();
        
        Object jSONReaderContext = getFieldValue(jSONReader, "context");
        Object finalJSONReaderContextState = getFieldValue(jSONReaderContext, "state");
        
        assertEquals(1005, finalJSONReaderContextState);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadBefore1() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        
        Class jSONReaderClazz = Class.forName("com.alibaba.fastjson.JSONReader");
        Method readBeforeMethod = jSONReaderClazz.getDeclaredMethod("readBefore");
        readBeforeMethod.setAccessible(true);
        java.lang.Object[] readBeforeMethodArguments = new java.lang.Object[0];
        try {
            readBeforeMethod.invoke(jSONReader, readBeforeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadBefore2() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        setField(jSONReader, "context", null);
        
        Class jSONReaderClazz = Class.forName("com.alibaba.fastjson.JSONReader");
        Method readBeforeMethod = jSONReaderClazz.getDeclaredMethod("readBefore");
        readBeforeMethod.setAccessible(true);
        java.lang.Object[] readBeforeMethodArguments = new java.lang.Object[0];
        try {
            readBeforeMethod.invoke(jSONReader, readBeforeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReadBefore3() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContextMock = mock(JSONStreamContext.class);
        jSONStreamContextMock.state = 1004;
        setField(jSONReader, "context", jSONStreamContextMock);
        
        Class jSONReaderClazz = Class.forName("com.alibaba.fastjson.JSONReader");
        Method readBeforeMethod = jSONReaderClazz.getDeclaredMethod("readBefore");
        readBeforeMethod.setAccessible(true);
        java.lang.Object[] readBeforeMethodArguments = new java.lang.Object[0];
        readBeforeMethod.invoke(jSONReader, readBeforeMethodArguments);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReadBefore4() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContextMock = mock(JSONStreamContext.class);
        jSONStreamContextMock.state = 1001;
        setField(jSONReader, "context", jSONStreamContextMock);
        
        Class jSONReaderClazz = Class.forName("com.alibaba.fastjson.JSONReader");
        Method readBeforeMethod = jSONReaderClazz.getDeclaredMethod("readBefore");
        readBeforeMethod.setAccessible(true);
        java.lang.Object[] readBeforeMethodArguments = new java.lang.Object[0];
        readBeforeMethod.invoke(jSONReader, readBeforeMethodArguments);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadBefore5() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContextMock = mock(JSONStreamContext.class);
        jSONStreamContextMock.state = 1006;
        setField(jSONReader, "context", jSONStreamContextMock);
        
        Class jSONReaderClazz = Class.forName("com.alibaba.fastjson.JSONReader");
        Method readBeforeMethod = jSONReaderClazz.getDeclaredMethod("readBefore");
        readBeforeMethod.setAccessible(true);
        java.lang.Object[] readBeforeMethodArguments = new java.lang.Object[0];
        try {
            readBeforeMethod.invoke(jSONReader, readBeforeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReadBefore6() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContextMock = mock(JSONStreamContext.class);
        jSONStreamContextMock.state = 1003;
        setField(jSONReader, "context", jSONStreamContextMock);
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        setField(jSONReader, "parser", defaultJSONParserMock);
        
        Class jSONReaderClazz = Class.forName("com.alibaba.fastjson.JSONReader");
        Method readBeforeMethod = jSONReaderClazz.getDeclaredMethod("readBefore");
        readBeforeMethod.setAccessible(true);
        java.lang.Object[] readBeforeMethodArguments = new java.lang.Object[0];
        readBeforeMethod.invoke(jSONReader, readBeforeMethodArguments);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReadBefore7() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContextMock = mock(JSONStreamContext.class);
        jSONStreamContextMock.state = 1005;
        setField(jSONReader, "context", jSONStreamContextMock);
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        setField(jSONReader, "parser", defaultJSONParserMock);
        
        Class jSONReaderClazz = Class.forName("com.alibaba.fastjson.JSONReader");
        Method readBeforeMethod = jSONReaderClazz.getDeclaredMethod("readBefore");
        readBeforeMethod.setAccessible(true);
        java.lang.Object[] readBeforeMethodArguments = new java.lang.Object[0];
        readBeforeMethod.invoke(jSONReader, readBeforeMethodArguments);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReadBefore8() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContextMock = mock(JSONStreamContext.class);
        jSONStreamContextMock.state = 1002;
        setField(jSONReader, "context", jSONStreamContextMock);
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        setField(jSONReader, "parser", defaultJSONParserMock);
        
        Class jSONReaderClazz = Class.forName("com.alibaba.fastjson.JSONReader");
        Method readBeforeMethod = jSONReaderClazz.getDeclaredMethod("readBefore");
        readBeforeMethod.setAccessible(true);
        java.lang.Object[] readBeforeMethodArguments = new java.lang.Object[0];
        readBeforeMethod.invoke(jSONReader, readBeforeMethodArguments);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetTimzeZone1() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        
        jSONReader.getTimzeZone();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetTimzeZone2() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.getTimeZone()).thenReturn(((TimeZone) null));
        setField(defaultJSONParserMock, "lexer", jSONLexerMock);
        setField(jSONReader, "parser", defaultJSONParserMock);
        
        TimeZone actual = jSONReader.getTimzeZone();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testStartObject1() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        
        jSONReader.startObject();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testStartObject2() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContextMock = mock(JSONStreamContext.class);
        jSONStreamContextMock.state = 1006;
        setField(jSONReader, "context", jSONStreamContextMock);
        
        jSONReader.startObject();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testStartObject3() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContextMock = mock(JSONStreamContext.class);
        jSONStreamContextMock.state = 1001;
        setField(jSONStreamContextMock, "parent", null);
        setField(jSONReader, "context", jSONStreamContextMock);
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        setField(jSONReader, "parser", defaultJSONParserMock);
        
        Object initialJSONReaderContext = getFieldValue(jSONReader, "context");
        
        jSONReader.startObject();
        
        Object finalJSONReaderContext = getFieldValue(jSONReader, "context");
        
        assertFalse(initialJSONReaderContext == finalJSONReaderContext);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testStartObject4() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContextMock = mock(JSONStreamContext.class);
        jSONStreamContextMock.state = 1004;
        setField(jSONStreamContextMock, "parent", null);
        setField(jSONReader, "context", jSONStreamContextMock);
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        setField(jSONReader, "parser", defaultJSONParserMock);
        
        Object initialJSONReaderContext = getFieldValue(jSONReader, "context");
        
        jSONReader.startObject();
        
        Object finalJSONReaderContext = getFieldValue(jSONReader, "context");
        
        assertFalse(initialJSONReaderContext == finalJSONReaderContext);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testStartObject5() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContextMock = mock(JSONStreamContext.class);
        jSONStreamContextMock.state = 1003;
        setField(jSONStreamContextMock, "parent", null);
        setField(jSONReader, "context", jSONStreamContextMock);
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        setField(jSONReader, "parser", defaultJSONParserMock);
        
        Object initialJSONReaderContext = getFieldValue(jSONReader, "context");
        
        jSONReader.startObject();
        
        Object finalJSONReaderContext = getFieldValue(jSONReader, "context");
        
        assertFalse(initialJSONReaderContext == finalJSONReaderContext);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testStartObject6() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContextMock = mock(JSONStreamContext.class);
        jSONStreamContextMock.state = 1002;
        setField(jSONStreamContextMock, "parent", null);
        setField(jSONReader, "context", jSONStreamContextMock);
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        setField(jSONReader, "parser", defaultJSONParserMock);
        
        Object initialJSONReaderContext = getFieldValue(jSONReader, "context");
        
        jSONReader.startObject();
        
        Object finalJSONReaderContext = getFieldValue(jSONReader, "context");
        
        assertFalse(initialJSONReaderContext == finalJSONReaderContext);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testStartObject7() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContextMock = mock(JSONStreamContext.class);
        jSONStreamContextMock.state = 1005;
        setField(jSONStreamContextMock, "parent", null);
        setField(jSONReader, "context", jSONStreamContextMock);
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        setField(jSONReader, "parser", defaultJSONParserMock);
        
        Object initialJSONReaderContext = getFieldValue(jSONReader, "context");
        
        jSONReader.startObject();
        
        Object finalJSONReaderContext = getFieldValue(jSONReader, "context");
        
        assertFalse(initialJSONReaderContext == finalJSONReaderContext);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testSetTimzeZone1() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        
        jSONReader.setTimzeZone(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetTimzeZone2() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        setField(defaultJSONParserMock, "lexer", jSONLexerMock);
        setField(jSONReader, "parser", defaultJSONParserMock);
        
        jSONReader.setTimzeZone(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadInteger1() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        
        jSONReader.readInteger();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReadInteger2() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(com.alibaba.fastjson.util.TypeUtils.class);
            Integer integer = 0;
            mockedStatic.when(() -> {
                com.alibaba.fastjson.util.TypeUtils.castToInt(any());
            }).thenReturn(integer);
            JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
            setField(jSONReader, "context", null);
            DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
            java.lang.Object[] datagramChannelImplArray = createArray("sun.nio.ch.DatagramChannelImpl", 0);
            when(defaultJSONParserMock.parse()).thenReturn(((Object) datagramChannelImplArray));
            setField(jSONReader, "parser", defaultJSONParserMock);
            
            Integer actual = jSONReader.readInteger();
            
            
            // Current deep equals depth exceeds max depth 0
            assertTrue(deepEquals(integer, actual));
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReadInteger3() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(com.alibaba.fastjson.util.TypeUtils.class);
            mockedStatic.when(() -> {
                com.alibaba.fastjson.util.TypeUtils.castToInt(any());
            }).thenReturn(((Integer) null));
            JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
            JSONStreamContext jSONStreamContextMock = mock(JSONStreamContext.class);
            jSONStreamContextMock.state = 1005;
            setField(jSONReader, "context", jSONStreamContextMock);
            DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
            when(defaultJSONParserMock.parse()).thenReturn(null);
            setField(jSONReader, "parser", defaultJSONParserMock);
            
            Integer actual = jSONReader.readInteger();
            
            assertNull(actual);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadInteger4() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContextMock = mock(JSONStreamContext.class);
        jSONStreamContextMock.state = 1006;
        setField(jSONReader, "context", jSONStreamContextMock);
        
        jSONReader.readInteger();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReadInteger5() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(com.alibaba.fastjson.util.TypeUtils.class);
            mockedStatic.when(() -> {
                com.alibaba.fastjson.util.TypeUtils.castToInt(any());
            }).thenReturn(((Integer) null));
            JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
            JSONStreamContext jSONStreamContextMock = mock(JSONStreamContext.class);
            jSONStreamContextMock.state = 1001;
            setField(jSONReader, "context", jSONStreamContextMock);
            DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
            when(defaultJSONParserMock.parse()).thenReturn(null);
            setField(jSONReader, "parser", defaultJSONParserMock);
            
            Integer actual = jSONReader.readInteger();
            
            assertNull(actual);
            
            Object jSONReaderContext = getFieldValue(jSONReader, "context");
            Object finalJSONReaderContextState = getFieldValue(jSONReaderContext, "state");
            
            assertEquals(1002, finalJSONReaderContextState);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReadInteger6() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(com.alibaba.fastjson.util.TypeUtils.class);
            mockedStatic.when(() -> {
                com.alibaba.fastjson.util.TypeUtils.castToInt(any());
            }).thenReturn(((Integer) null));
            JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
            JSONStreamContext jSONStreamContextMock = mock(JSONStreamContext.class);
            jSONStreamContextMock.state = 1002;
            setField(jSONReader, "context", jSONStreamContextMock);
            DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
            when(defaultJSONParserMock.parse()).thenReturn(null);
            setField(jSONReader, "parser", defaultJSONParserMock);
            
            Integer actual = jSONReader.readInteger();
            
            assertNull(actual);
            
            Object jSONReaderContext = getFieldValue(jSONReader, "context");
            Object finalJSONReaderContextState = getFieldValue(jSONReaderContext, "state");
            
            assertEquals(1003, finalJSONReaderContextState);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReadInteger7() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(com.alibaba.fastjson.util.TypeUtils.class);
            mockedStatic.when(() -> {
                com.alibaba.fastjson.util.TypeUtils.castToInt(any());
            }).thenReturn(((Integer) null));
            JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
            JSONStreamContext jSONStreamContextMock = mock(JSONStreamContext.class);
            jSONStreamContextMock.state = 1003;
            setField(jSONReader, "context", jSONStreamContextMock);
            DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
            when(defaultJSONParserMock.parse()).thenReturn(null);
            setField(jSONReader, "parser", defaultJSONParserMock);
            
            Integer actual = jSONReader.readInteger();
            
            assertNull(actual);
            
            Object jSONReaderContext = getFieldValue(jSONReader, "context");
            Object finalJSONReaderContextState = getFieldValue(jSONReaderContext, "state");
            
            assertEquals(1002, finalJSONReaderContextState);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReadInteger8() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(com.alibaba.fastjson.util.TypeUtils.class);
            mockedStatic.when(() -> {
                com.alibaba.fastjson.util.TypeUtils.castToInt(any());
            }).thenReturn(((Integer) null));
            JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
            JSONStreamContext jSONStreamContextMock = mock(JSONStreamContext.class);
            jSONStreamContextMock.state = 1004;
            setField(jSONReader, "context", jSONStreamContextMock);
            DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
            when(defaultJSONParserMock.parse()).thenReturn(null);
            setField(jSONReader, "parser", defaultJSONParserMock);
            
            Integer actual = jSONReader.readInteger();
            
            assertNull(actual);
            
            Object jSONReaderContext = getFieldValue(jSONReader, "context");
            Object finalJSONReaderContextState = getFieldValue(jSONReaderContext, "state");
            
            assertEquals(1005, finalJSONReaderContextState);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetLocal1() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        
        jSONReader.getLocal();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetLocal2() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.getLocale()).thenReturn(((Locale) null));
        setField(defaultJSONParserMock, "lexer", jSONLexerMock);
        setField(jSONReader, "parser", defaultJSONParserMock);
        
        Locale actual = jSONReader.getLocal();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testStartStructure1() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        
        Class jSONReaderClazz = Class.forName("com.alibaba.fastjson.JSONReader");
        Method startStructureMethod = jSONReaderClazz.getDeclaredMethod("startStructure");
        startStructureMethod.setAccessible(true);
        java.lang.Object[] startStructureMethodArguments = new java.lang.Object[0];
        try {
            startStructureMethod.invoke(jSONReader, startStructureMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testStartStructure2() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        setField(jSONReader, "context", null);
        
        Class jSONReaderClazz = Class.forName("com.alibaba.fastjson.JSONReader");
        Method startStructureMethod = jSONReaderClazz.getDeclaredMethod("startStructure");
        startStructureMethod.setAccessible(true);
        java.lang.Object[] startStructureMethodArguments = new java.lang.Object[0];
        try {
            startStructureMethod.invoke(jSONReader, startStructureMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testStartStructure3() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContextMock = mock(JSONStreamContext.class);
        jSONStreamContextMock.state = 1004;
        setField(jSONReader, "context", jSONStreamContextMock);
        
        Class jSONReaderClazz = Class.forName("com.alibaba.fastjson.JSONReader");
        Method startStructureMethod = jSONReaderClazz.getDeclaredMethod("startStructure");
        startStructureMethod.setAccessible(true);
        java.lang.Object[] startStructureMethodArguments = new java.lang.Object[0];
        startStructureMethod.invoke(jSONReader, startStructureMethodArguments);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testStartStructure4() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContextMock = mock(JSONStreamContext.class);
        jSONStreamContextMock.state = 1001;
        setField(jSONReader, "context", jSONStreamContextMock);
        
        Class jSONReaderClazz = Class.forName("com.alibaba.fastjson.JSONReader");
        Method startStructureMethod = jSONReaderClazz.getDeclaredMethod("startStructure");
        startStructureMethod.setAccessible(true);
        java.lang.Object[] startStructureMethodArguments = new java.lang.Object[0];
        startStructureMethod.invoke(jSONReader, startStructureMethodArguments);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testStartStructure5() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContextMock = mock(JSONStreamContext.class);
        jSONStreamContextMock.state = 1006;
        setField(jSONReader, "context", jSONStreamContextMock);
        
        Class jSONReaderClazz = Class.forName("com.alibaba.fastjson.JSONReader");
        Method startStructureMethod = jSONReaderClazz.getDeclaredMethod("startStructure");
        startStructureMethod.setAccessible(true);
        java.lang.Object[] startStructureMethodArguments = new java.lang.Object[0];
        try {
            startStructureMethod.invoke(jSONReader, startStructureMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testStartStructure6() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContextMock = mock(JSONStreamContext.class);
        jSONStreamContextMock.state = 1003;
        setField(jSONReader, "context", jSONStreamContextMock);
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        setField(jSONReader, "parser", defaultJSONParserMock);
        
        Class jSONReaderClazz = Class.forName("com.alibaba.fastjson.JSONReader");
        Method startStructureMethod = jSONReaderClazz.getDeclaredMethod("startStructure");
        startStructureMethod.setAccessible(true);
        java.lang.Object[] startStructureMethodArguments = new java.lang.Object[0];
        startStructureMethod.invoke(jSONReader, startStructureMethodArguments);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testStartStructure7() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContextMock = mock(JSONStreamContext.class);
        jSONStreamContextMock.state = 1005;
        setField(jSONReader, "context", jSONStreamContextMock);
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        setField(jSONReader, "parser", defaultJSONParserMock);
        
        Class jSONReaderClazz = Class.forName("com.alibaba.fastjson.JSONReader");
        Method startStructureMethod = jSONReaderClazz.getDeclaredMethod("startStructure");
        startStructureMethod.setAccessible(true);
        java.lang.Object[] startStructureMethodArguments = new java.lang.Object[0];
        startStructureMethod.invoke(jSONReader, startStructureMethodArguments);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testStartStructure8() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContextMock = mock(JSONStreamContext.class);
        jSONStreamContextMock.state = 1002;
        setField(jSONReader, "context", jSONStreamContextMock);
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        setField(jSONReader, "parser", defaultJSONParserMock);
        
        Class jSONReaderClazz = Class.forName("com.alibaba.fastjson.JSONReader");
        Method startStructureMethod = jSONReaderClazz.getDeclaredMethod("startStructure");
        startStructureMethod.setAccessible(true);
        java.lang.Object[] startStructureMethodArguments = new java.lang.Object[0];
        startStructureMethod.invoke(jSONReader, startStructureMethodArguments);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testEndStructure1() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        
        Class jSONReaderClazz = Class.forName("com.alibaba.fastjson.JSONReader");
        Method endStructureMethod = jSONReaderClazz.getDeclaredMethod("endStructure");
        endStructureMethod.setAccessible(true);
        java.lang.Object[] endStructureMethodArguments = new java.lang.Object[0];
        try {
            endStructureMethod.invoke(jSONReader, endStructureMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testEndStructure2() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        setField(jSONReader, "context", null);
        
        Class jSONReaderClazz = Class.forName("com.alibaba.fastjson.JSONReader");
        Method endStructureMethod = jSONReaderClazz.getDeclaredMethod("endStructure");
        endStructureMethod.setAccessible(true);
        java.lang.Object[] endStructureMethodArguments = new java.lang.Object[0];
        try {
            endStructureMethod.invoke(jSONReader, endStructureMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testEndStructure3() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContextMock = mock(JSONStreamContext.class);
        jSONStreamContextMock.state = 1004;
        setField(jSONStreamContextMock, "parent", jSONStreamContextMock);
        setField(jSONReader, "context", jSONStreamContextMock);
        
        Class jSONReaderClazz = Class.forName("com.alibaba.fastjson.JSONReader");
        Method endStructureMethod = jSONReaderClazz.getDeclaredMethod("endStructure");
        endStructureMethod.setAccessible(true);
        java.lang.Object[] endStructureMethodArguments = new java.lang.Object[0];
        endStructureMethod.invoke(jSONReader, endStructureMethodArguments);
        
        Object jSONReaderContext = getFieldValue(jSONReader, "context");
        Object finalJSONReaderContextState = getFieldValue(jSONReaderContext, "state");
        
        assertEquals(1005, finalJSONReaderContextState);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testEndStructure4() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContextMock = mock(JSONStreamContext.class);
        jSONStreamContextMock.state = 0;
        setField(jSONStreamContextMock, "parent", jSONStreamContextMock);
        setField(jSONReader, "context", jSONStreamContextMock);
        
        Class jSONReaderClazz = Class.forName("com.alibaba.fastjson.JSONReader");
        Method endStructureMethod = jSONReaderClazz.getDeclaredMethod("endStructure");
        endStructureMethod.setAccessible(true);
        java.lang.Object[] endStructureMethodArguments = new java.lang.Object[0];
        endStructureMethod.invoke(jSONReader, endStructureMethodArguments);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testEndStructure5() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContextMock = mock(JSONStreamContext.class);
        jSONStreamContextMock.state = 1002;
        setField(jSONStreamContextMock, "parent", jSONStreamContextMock);
        setField(jSONReader, "context", jSONStreamContextMock);
        
        Class jSONReaderClazz = Class.forName("com.alibaba.fastjson.JSONReader");
        Method endStructureMethod = jSONReaderClazz.getDeclaredMethod("endStructure");
        endStructureMethod.setAccessible(true);
        java.lang.Object[] endStructureMethodArguments = new java.lang.Object[0];
        endStructureMethod.invoke(jSONReader, endStructureMethodArguments);
        
        Object jSONReaderContext = getFieldValue(jSONReader, "context");
        Object finalJSONReaderContextState = getFieldValue(jSONReaderContext, "state");
        
        assertEquals(1003, finalJSONReaderContextState);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testEndStructure6() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContextMock = mock(JSONStreamContext.class);
        jSONStreamContextMock.state = 1001;
        setField(jSONStreamContextMock, "parent", jSONStreamContextMock);
        setField(jSONReader, "context", jSONStreamContextMock);
        
        Class jSONReaderClazz = Class.forName("com.alibaba.fastjson.JSONReader");
        Method endStructureMethod = jSONReaderClazz.getDeclaredMethod("endStructure");
        endStructureMethod.setAccessible(true);
        java.lang.Object[] endStructureMethodArguments = new java.lang.Object[0];
        endStructureMethod.invoke(jSONReader, endStructureMethodArguments);
        
        Object jSONReaderContext = getFieldValue(jSONReader, "context");
        Object finalJSONReaderContextState = getFieldValue(jSONReaderContext, "state");
        
        assertEquals(1002, finalJSONReaderContextState);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testEndStructure7() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContextMock = mock(JSONStreamContext.class);
        jSONStreamContextMock.state = 1003;
        setField(jSONStreamContextMock, "parent", jSONStreamContextMock);
        setField(jSONReader, "context", jSONStreamContextMock);
        
        Class jSONReaderClazz = Class.forName("com.alibaba.fastjson.JSONReader");
        Method endStructureMethod = jSONReaderClazz.getDeclaredMethod("endStructure");
        endStructureMethod.setAccessible(true);
        java.lang.Object[] endStructureMethodArguments = new java.lang.Object[0];
        endStructureMethod.invoke(jSONReader, endStructureMethodArguments);
        
        Object jSONReaderContext = getFieldValue(jSONReader, "context");
        Object finalJSONReaderContextState = getFieldValue(jSONReaderContext, "state");
        
        assertEquals(1002, finalJSONReaderContextState);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testEndArray1() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        
        jSONReader.endArray();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testEndArray2() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        setField(jSONReader, "context", null);
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        setField(jSONReader, "parser", defaultJSONParserMock);
        
        jSONReader.endArray();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testEndArray3() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContextMock = mock(JSONStreamContext.class);
        jSONStreamContextMock.state = 1001;
        setField(jSONStreamContextMock, "parent", jSONStreamContextMock);
        setField(jSONReader, "context", jSONStreamContextMock);
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        setField(jSONReader, "parser", defaultJSONParserMock);
        
        jSONReader.endArray();
        
        Object jSONReaderContext = getFieldValue(jSONReader, "context");
        Object finalJSONReaderContextState = getFieldValue(jSONReaderContext, "state");
        
        assertEquals(1002, finalJSONReaderContextState);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testEndArray4() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContextMock = mock(JSONStreamContext.class);
        jSONStreamContextMock.state = 1002;
        setField(jSONStreamContextMock, "parent", jSONStreamContextMock);
        setField(jSONReader, "context", jSONStreamContextMock);
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        setField(jSONReader, "parser", defaultJSONParserMock);
        
        jSONReader.endArray();
        
        Object jSONReaderContext = getFieldValue(jSONReader, "context");
        Object finalJSONReaderContextState = getFieldValue(jSONReaderContext, "state");
        
        assertEquals(1003, finalJSONReaderContextState);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testEndArray5() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContextMock = mock(JSONStreamContext.class);
        jSONStreamContextMock.state = 0;
        setField(jSONStreamContextMock, "parent", jSONStreamContextMock);
        setField(jSONReader, "context", jSONStreamContextMock);
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        setField(jSONReader, "parser", defaultJSONParserMock);
        
        jSONReader.endArray();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testEndArray6() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContextMock = mock(JSONStreamContext.class);
        jSONStreamContextMock.state = 1003;
        setField(jSONStreamContextMock, "parent", jSONStreamContextMock);
        setField(jSONReader, "context", jSONStreamContextMock);
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        setField(jSONReader, "parser", defaultJSONParserMock);
        
        jSONReader.endArray();
        
        Object jSONReaderContext = getFieldValue(jSONReader, "context");
        Object finalJSONReaderContextState = getFieldValue(jSONReaderContext, "state");
        
        assertEquals(1002, finalJSONReaderContextState);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testEndArray7() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContextMock = mock(JSONStreamContext.class);
        jSONStreamContextMock.state = 1004;
        setField(jSONStreamContextMock, "parent", jSONStreamContextMock);
        setField(jSONReader, "context", jSONStreamContextMock);
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        setField(jSONReader, "parser", defaultJSONParserMock);
        
        jSONReader.endArray();
        
        Object jSONReaderContext = getFieldValue(jSONReader, "context");
        Object finalJSONReaderContextState = getFieldValue(jSONReaderContext, "state");
        
        assertEquals(1005, finalJSONReaderContextState);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testStartArray1() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        
        jSONReader.startArray();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testStartArray2() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContextMock = mock(JSONStreamContext.class);
        jSONStreamContextMock.state = 1006;
        setField(jSONReader, "context", jSONStreamContextMock);
        
        jSONReader.startArray();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testStartArray3() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContextMock = mock(JSONStreamContext.class);
        jSONStreamContextMock.state = 1001;
        setField(jSONStreamContextMock, "parent", null);
        setField(jSONReader, "context", jSONStreamContextMock);
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        setField(jSONReader, "parser", defaultJSONParserMock);
        
        Object initialJSONReaderContext = getFieldValue(jSONReader, "context");
        
        jSONReader.startArray();
        
        Object finalJSONReaderContext = getFieldValue(jSONReader, "context");
        
        assertFalse(initialJSONReaderContext == finalJSONReaderContext);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testStartArray4() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContextMock = mock(JSONStreamContext.class);
        jSONStreamContextMock.state = 1004;
        setField(jSONStreamContextMock, "parent", null);
        setField(jSONReader, "context", jSONStreamContextMock);
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        setField(jSONReader, "parser", defaultJSONParserMock);
        
        Object initialJSONReaderContext = getFieldValue(jSONReader, "context");
        
        jSONReader.startArray();
        
        Object finalJSONReaderContext = getFieldValue(jSONReader, "context");
        
        assertFalse(initialJSONReaderContext == finalJSONReaderContext);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testStartArray5() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContextMock = mock(JSONStreamContext.class);
        jSONStreamContextMock.state = 1003;
        setField(jSONStreamContextMock, "parent", null);
        setField(jSONReader, "context", jSONStreamContextMock);
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        setField(jSONReader, "parser", defaultJSONParserMock);
        
        Object initialJSONReaderContext = getFieldValue(jSONReader, "context");
        
        jSONReader.startArray();
        
        Object finalJSONReaderContext = getFieldValue(jSONReader, "context");
        
        assertFalse(initialJSONReaderContext == finalJSONReaderContext);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testStartArray6() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContextMock = mock(JSONStreamContext.class);
        jSONStreamContextMock.state = 1002;
        setField(jSONStreamContextMock, "parent", null);
        setField(jSONReader, "context", jSONStreamContextMock);
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        setField(jSONReader, "parser", defaultJSONParserMock);
        
        Object initialJSONReaderContext = getFieldValue(jSONReader, "context");
        
        jSONReader.startArray();
        
        Object finalJSONReaderContext = getFieldValue(jSONReader, "context");
        
        assertFalse(initialJSONReaderContext == finalJSONReaderContext);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testStartArray7() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContextMock = mock(JSONStreamContext.class);
        jSONStreamContextMock.state = 1005;
        setField(jSONStreamContextMock, "parent", null);
        setField(jSONReader, "context", jSONStreamContextMock);
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        setField(jSONReader, "parser", defaultJSONParserMock);
        
        Object initialJSONReaderContext = getFieldValue(jSONReader, "context");
        
        jSONReader.startArray();
        
        Object finalJSONReaderContext = getFieldValue(jSONReader, "context");
        
        assertFalse(initialJSONReaderContext == finalJSONReaderContext);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadAfter1() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        
        Class jSONReaderClazz = Class.forName("com.alibaba.fastjson.JSONReader");
        Method readAfterMethod = jSONReaderClazz.getDeclaredMethod("readAfter");
        readAfterMethod.setAccessible(true);
        java.lang.Object[] readAfterMethodArguments = new java.lang.Object[0];
        try {
            readAfterMethod.invoke(jSONReader, readAfterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadAfter2() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        setField(jSONReader, "context", null);
        
        Class jSONReaderClazz = Class.forName("com.alibaba.fastjson.JSONReader");
        Method readAfterMethod = jSONReaderClazz.getDeclaredMethod("readAfter");
        readAfterMethod.setAccessible(true);
        java.lang.Object[] readAfterMethodArguments = new java.lang.Object[0];
        try {
            readAfterMethod.invoke(jSONReader, readAfterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReadAfter3() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContextMock = mock(JSONStreamContext.class);
        jSONStreamContextMock.state = 1005;
        setField(jSONReader, "context", jSONStreamContextMock);
        
        Class jSONReaderClazz = Class.forName("com.alibaba.fastjson.JSONReader");
        Method readAfterMethod = jSONReaderClazz.getDeclaredMethod("readAfter");
        readAfterMethod.setAccessible(true);
        java.lang.Object[] readAfterMethodArguments = new java.lang.Object[0];
        readAfterMethod.invoke(jSONReader, readAfterMethodArguments);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadAfter4() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContextMock = mock(JSONStreamContext.class);
        jSONStreamContextMock.state = 1006;
        setField(jSONReader, "context", jSONStreamContextMock);
        
        Class jSONReaderClazz = Class.forName("com.alibaba.fastjson.JSONReader");
        Method readAfterMethod = jSONReaderClazz.getDeclaredMethod("readAfter");
        readAfterMethod.setAccessible(true);
        java.lang.Object[] readAfterMethodArguments = new java.lang.Object[0];
        try {
            readAfterMethod.invoke(jSONReader, readAfterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReadAfter5() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContextMock = mock(JSONStreamContext.class);
        jSONStreamContextMock.state = 1002;
        setField(jSONReader, "context", jSONStreamContextMock);
        
        Class jSONReaderClazz = Class.forName("com.alibaba.fastjson.JSONReader");
        Method readAfterMethod = jSONReaderClazz.getDeclaredMethod("readAfter");
        readAfterMethod.setAccessible(true);
        java.lang.Object[] readAfterMethodArguments = new java.lang.Object[0];
        readAfterMethod.invoke(jSONReader, readAfterMethodArguments);
        
        Object jSONReaderContext = getFieldValue(jSONReader, "context");
        Object finalJSONReaderContextState = getFieldValue(jSONReaderContext, "state");
        
        assertEquals(1003, finalJSONReaderContextState);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReadAfter6() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContextMock = mock(JSONStreamContext.class);
        jSONStreamContextMock.state = 1001;
        setField(jSONReader, "context", jSONStreamContextMock);
        
        Class jSONReaderClazz = Class.forName("com.alibaba.fastjson.JSONReader");
        Method readAfterMethod = jSONReaderClazz.getDeclaredMethod("readAfter");
        readAfterMethod.setAccessible(true);
        java.lang.Object[] readAfterMethodArguments = new java.lang.Object[0];
        readAfterMethod.invoke(jSONReader, readAfterMethodArguments);
        
        Object jSONReaderContext = getFieldValue(jSONReader, "context");
        Object finalJSONReaderContextState = getFieldValue(jSONReaderContext, "state");
        
        assertEquals(1002, finalJSONReaderContextState);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReadAfter7() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContextMock = mock(JSONStreamContext.class);
        jSONStreamContextMock.state = 1003;
        setField(jSONReader, "context", jSONStreamContextMock);
        
        Class jSONReaderClazz = Class.forName("com.alibaba.fastjson.JSONReader");
        Method readAfterMethod = jSONReaderClazz.getDeclaredMethod("readAfter");
        readAfterMethod.setAccessible(true);
        java.lang.Object[] readAfterMethodArguments = new java.lang.Object[0];
        readAfterMethod.invoke(jSONReader, readAfterMethodArguments);
        
        Object jSONReaderContext = getFieldValue(jSONReader, "context");
        Object finalJSONReaderContextState = getFieldValue(jSONReaderContext, "state");
        
        assertEquals(1002, finalJSONReaderContextState);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReadAfter8() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContextMock = mock(JSONStreamContext.class);
        jSONStreamContextMock.state = 1004;
        setField(jSONReader, "context", jSONStreamContextMock);
        
        Class jSONReaderClazz = Class.forName("com.alibaba.fastjson.JSONReader");
        Method readAfterMethod = jSONReaderClazz.getDeclaredMethod("readAfter");
        readAfterMethod.setAccessible(true);
        java.lang.Object[] readAfterMethodArguments = new java.lang.Object[0];
        readAfterMethod.invoke(jSONReader, readAfterMethodArguments);
        
        Object jSONReaderContext = getFieldValue(jSONReader, "context");
        Object finalJSONReaderContextState = getFieldValue(jSONReaderContext, "state");
        
        assertEquals(1005, finalJSONReaderContextState);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testHasNext1() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        
        jSONReader.hasNext();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testHasNext2() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        setField(jSONReader, "context", null);
        
        jSONReader.hasNext();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testHasNext3() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContextMock = mock(JSONStreamContext.class);
        jSONStreamContextMock.state = 1002;
        setField(jSONReader, "context", jSONStreamContextMock);
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(0);
        setField(defaultJSONParserMock, "lexer", jSONLexerMock);
        setField(jSONReader, "parser", defaultJSONParserMock);
        
        jSONReader.hasNext();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testHasNext4() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContextMock = mock(JSONStreamContext.class);
        jSONStreamContextMock.state = 1005;
        setField(jSONReader, "context", jSONStreamContextMock);
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(15);
        setField(defaultJSONParserMock, "lexer", jSONLexerMock);
        setField(jSONReader, "parser", defaultJSONParserMock);
        
        boolean actual = jSONReader.hasNext();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testHasNext5() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContextMock = mock(JSONStreamContext.class);
        jSONStreamContextMock.state = 1001;
        setField(jSONReader, "context", jSONStreamContextMock);
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(13);
        setField(defaultJSONParserMock, "lexer", jSONLexerMock);
        setField(jSONReader, "parser", defaultJSONParserMock);
        
        boolean actual = jSONReader.hasNext();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testHasNext6() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContextMock = mock(JSONStreamContext.class);
        jSONStreamContextMock.state = 1004;
        setField(jSONReader, "context", jSONStreamContextMock);
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(0);
        setField(defaultJSONParserMock, "lexer", jSONLexerMock);
        setField(jSONReader, "parser", defaultJSONParserMock);
        
        boolean actual = jSONReader.hasNext();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testHasNext7() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContextMock = mock(JSONStreamContext.class);
        jSONStreamContextMock.state = 1006;
        setField(jSONReader, "context", jSONStreamContextMock);
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(0);
        setField(defaultJSONParserMock, "lexer", jSONLexerMock);
        setField(jSONReader, "parser", defaultJSONParserMock);
        
        jSONReader.hasNext();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testHasNext8() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContextMock = mock(JSONStreamContext.class);
        jSONStreamContextMock.state = 1003;
        setField(jSONReader, "context", jSONStreamContextMock);
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(0);
        setField(defaultJSONParserMock, "lexer", jSONLexerMock);
        setField(jSONReader, "parser", defaultJSONParserMock);
        
        boolean actual = jSONReader.hasNext();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadObject1() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        Object object = new Object();
        
        jSONReader.readObject(object);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReadObject2() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        setField(jSONReader, "context", null);
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        setField(jSONReader, "parser", defaultJSONParserMock);
        java.lang.Object[] forEachOrderedTaskArray = createArray("java.util.stream.ForEachOps$ForEachOrderedTask", 0);
        
        jSONReader.readObject(forEachOrderedTaskArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadObject3() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContextMock = mock(JSONStreamContext.class);
        jSONStreamContextMock.state = 1006;
        setField(jSONReader, "context", jSONStreamContextMock);
        
        jSONReader.readObject(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReadObject4() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContextMock = mock(JSONStreamContext.class);
        jSONStreamContextMock.state = 1001;
        setField(jSONReader, "context", jSONStreamContextMock);
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        setField(jSONReader, "parser", defaultJSONParserMock);
        
        jSONReader.readObject(null);
        
        Object jSONReaderContext = getFieldValue(jSONReader, "context");
        Object finalJSONReaderContextState = getFieldValue(jSONReaderContext, "state");
        
        assertEquals(1002, finalJSONReaderContextState);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReadObject5() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContextMock = mock(JSONStreamContext.class);
        jSONStreamContextMock.state = 1004;
        setField(jSONReader, "context", jSONStreamContextMock);
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        setField(jSONReader, "parser", defaultJSONParserMock);
        
        jSONReader.readObject(null);
        
        Object jSONReaderContext = getFieldValue(jSONReader, "context");
        Object finalJSONReaderContextState = getFieldValue(jSONReaderContext, "state");
        
        assertEquals(1005, finalJSONReaderContextState);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReadObject6() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContextMock = mock(JSONStreamContext.class);
        jSONStreamContextMock.state = 1003;
        setField(jSONReader, "context", jSONStreamContextMock);
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        setField(jSONReader, "parser", defaultJSONParserMock);
        
        jSONReader.readObject(null);
        
        Object jSONReaderContext = getFieldValue(jSONReader, "context");
        Object finalJSONReaderContextState = getFieldValue(jSONReaderContext, "state");
        
        assertEquals(1002, finalJSONReaderContextState);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReadObject7() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContextMock = mock(JSONStreamContext.class);
        jSONStreamContextMock.state = 1002;
        setField(jSONReader, "context", jSONStreamContextMock);
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        setField(jSONReader, "parser", defaultJSONParserMock);
        
        jSONReader.readObject(null);
        
        Object jSONReaderContext = getFieldValue(jSONReader, "context");
        Object finalJSONReaderContextState = getFieldValue(jSONReaderContext, "state");
        
        assertEquals(1003, finalJSONReaderContextState);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReadObject8() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContextMock = mock(JSONStreamContext.class);
        jSONStreamContextMock.state = 1005;
        setField(jSONReader, "context", jSONStreamContextMock);
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        setField(jSONReader, "parser", defaultJSONParserMock);
        
        jSONReader.readObject(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadObject9() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        
        jSONReader.readObject();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReadObject10() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        setField(jSONReader, "context", null);
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        java.lang.Object[] actionsArray = createArray("javax.swing.plaf.basic.BasicPopupMenuUI$Actions", 0);
        when(defaultJSONParserMock.parse()).thenReturn(((Object) actionsArray));
        setField(jSONReader, "parser", defaultJSONParserMock);
        
        Object actual = jSONReader.readObject();
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(actionsArray, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReadObject11() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContextMock = mock(JSONStreamContext.class);
        jSONStreamContextMock.state = 1004;
        setField(jSONReader, "context", jSONStreamContextMock);
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        when(defaultJSONParserMock.parse()).thenReturn(null);
        setField(jSONReader, "parser", defaultJSONParserMock);
        
        Object actual = jSONReader.readObject();
        
        assertNull(actual);
        
        Object jSONReaderContext = getFieldValue(jSONReader, "context");
        Object finalJSONReaderContextState = getFieldValue(jSONReaderContext, "state");
        
        assertEquals(1005, finalJSONReaderContextState);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReadObject12() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContextMock = mock(JSONStreamContext.class);
        jSONStreamContextMock.state = 1002;
        setField(jSONReader, "context", jSONStreamContextMock);
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        when(defaultJSONParserMock.parse()).thenReturn(null);
        setField(jSONReader, "parser", defaultJSONParserMock);
        
        Object actual = jSONReader.readObject();
        
        assertNull(actual);
        
        Object jSONReaderContext = getFieldValue(jSONReader, "context");
        Object finalJSONReaderContextState = getFieldValue(jSONReaderContext, "state");
        
        assertEquals(1003, finalJSONReaderContextState);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReadObject13() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContextMock = mock(JSONStreamContext.class);
        jSONStreamContextMock.state = 1001;
        setField(jSONReader, "context", jSONStreamContextMock);
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        when(defaultJSONParserMock.parseKey()).thenReturn(null);
        setField(jSONReader, "parser", defaultJSONParserMock);
        
        Object actual = jSONReader.readObject();
        
        assertNull(actual);
        
        Object jSONReaderContext = getFieldValue(jSONReader, "context");
        Object finalJSONReaderContextState = getFieldValue(jSONReaderContext, "state");
        
        assertEquals(1002, finalJSONReaderContextState);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadObject14() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContextMock = mock(JSONStreamContext.class);
        jSONStreamContextMock.state = 1006;
        setField(jSONReader, "context", jSONStreamContextMock);
        
        jSONReader.readObject();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReadObject15() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContextMock = mock(JSONStreamContext.class);
        jSONStreamContextMock.state = 1003;
        setField(jSONReader, "context", jSONStreamContextMock);
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        when(defaultJSONParserMock.parseKey()).thenReturn(null);
        setField(jSONReader, "parser", defaultJSONParserMock);
        
        Object actual = jSONReader.readObject();
        
        assertNull(actual);
        
        Object jSONReaderContext = getFieldValue(jSONReader, "context");
        Object finalJSONReaderContextState = getFieldValue(jSONReaderContext, "state");
        
        assertEquals(1002, finalJSONReaderContextState);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReadObject16() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContextMock = mock(JSONStreamContext.class);
        jSONStreamContextMock.state = 1005;
        setField(jSONReader, "context", jSONStreamContextMock);
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        when(defaultJSONParserMock.parse()).thenReturn(null);
        setField(jSONReader, "parser", defaultJSONParserMock);
        
        Object actual = jSONReader.readObject();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadObject17() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        
        jSONReader.readObject(((Map) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReadObject18() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        setField(jSONReader, "context", null);
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        java.lang.Object[] ofLongArray = createArray("java.util.stream.StreamSpliterators$ArrayBuffer$OfLong", 0);
        when(defaultJSONParserMock.parseObject(org.mockito.ArgumentMatchers.any(Map.class))).thenReturn(((Object) ofLongArray));
        setField(jSONReader, "parser", defaultJSONParserMock);
        
        Object actual = jSONReader.readObject(((Map) null));
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(ofLongArray, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadObject19() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContextMock = mock(JSONStreamContext.class);
        jSONStreamContextMock.state = 1006;
        setField(jSONReader, "context", jSONStreamContextMock);
        
        jSONReader.readObject(((Map) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReadObject20() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContextMock = mock(JSONStreamContext.class);
        jSONStreamContextMock.state = 1001;
        setField(jSONReader, "context", jSONStreamContextMock);
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        when(defaultJSONParserMock.parseObject(org.mockito.ArgumentMatchers.any(Map.class))).thenReturn(null);
        setField(jSONReader, "parser", defaultJSONParserMock);
        
        Object actual = jSONReader.readObject(((Map) null));
        
        assertNull(actual);
        
        Object jSONReaderContext = getFieldValue(jSONReader, "context");
        Object finalJSONReaderContextState = getFieldValue(jSONReaderContext, "state");
        
        assertEquals(1002, finalJSONReaderContextState);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReadObject21() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContextMock = mock(JSONStreamContext.class);
        jSONStreamContextMock.state = 1004;
        setField(jSONReader, "context", jSONStreamContextMock);
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        when(defaultJSONParserMock.parseObject(org.mockito.ArgumentMatchers.any(Map.class))).thenReturn(null);
        setField(jSONReader, "parser", defaultJSONParserMock);
        
        Object actual = jSONReader.readObject(((Map) null));
        
        assertNull(actual);
        
        Object jSONReaderContext = getFieldValue(jSONReader, "context");
        Object finalJSONReaderContextState = getFieldValue(jSONReaderContext, "state");
        
        assertEquals(1005, finalJSONReaderContextState);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReadObject22() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContextMock = mock(JSONStreamContext.class);
        jSONStreamContextMock.state = 1003;
        setField(jSONReader, "context", jSONStreamContextMock);
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        when(defaultJSONParserMock.parseObject(org.mockito.ArgumentMatchers.any(Map.class))).thenReturn(null);
        setField(jSONReader, "parser", defaultJSONParserMock);
        
        Object actual = jSONReader.readObject(((Map) null));
        
        assertNull(actual);
        
        Object jSONReaderContext = getFieldValue(jSONReader, "context");
        Object finalJSONReaderContextState = getFieldValue(jSONReaderContext, "state");
        
        assertEquals(1002, finalJSONReaderContextState);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReadObject23() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContextMock = mock(JSONStreamContext.class);
        jSONStreamContextMock.state = 1002;
        setField(jSONReader, "context", jSONStreamContextMock);
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        when(defaultJSONParserMock.parseObject(org.mockito.ArgumentMatchers.any(Map.class))).thenReturn(null);
        setField(jSONReader, "parser", defaultJSONParserMock);
        
        Object actual = jSONReader.readObject(((Map) null));
        
        assertNull(actual);
        
        Object jSONReaderContext = getFieldValue(jSONReader, "context");
        Object finalJSONReaderContextState = getFieldValue(jSONReaderContext, "state");
        
        assertEquals(1003, finalJSONReaderContextState);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReadObject24() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContextMock = mock(JSONStreamContext.class);
        jSONStreamContextMock.state = 1005;
        setField(jSONReader, "context", jSONStreamContextMock);
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        when(defaultJSONParserMock.parseObject(org.mockito.ArgumentMatchers.any(Map.class))).thenReturn(null);
        setField(jSONReader, "parser", defaultJSONParserMock);
        
        Object actual = jSONReader.readObject(((Map) null));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadObject25() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        
        jSONReader.readObject(((Type) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReadObject26() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        setField(jSONReader, "context", null);
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        jdk.internal.org.xml.sax.InputSource[] inputSourceArray = new jdk.internal.org.xml.sax.InputSource[0];
        when(defaultJSONParserMock.parseObject(org.mockito.ArgumentMatchers.any(Type.class))).thenReturn(((Object) inputSourceArray));
        setField(jSONReader, "parser", defaultJSONParserMock);
        TypeVariableImpl typeVariableImpl = ((TypeVariableImpl) createInstance("sun.reflect.generics.reflectiveObjects.TypeVariableImpl"));
        
        Object actual = jSONReader.readObject(typeVariableImpl);
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(inputSourceArray, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadObject27() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContextMock = mock(JSONStreamContext.class);
        jSONStreamContextMock.state = 1006;
        setField(jSONReader, "context", jSONStreamContextMock);
        
        jSONReader.readObject(((Type) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReadObject28() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContextMock = mock(JSONStreamContext.class);
        jSONStreamContextMock.state = 1001;
        setField(jSONReader, "context", jSONStreamContextMock);
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        when(defaultJSONParserMock.parseObject(org.mockito.ArgumentMatchers.any(Type.class))).thenReturn(null);
        setField(jSONReader, "parser", defaultJSONParserMock);
        
        Object actual = jSONReader.readObject(((Type) null));
        
        assertNull(actual);
        
        Object jSONReaderContext = getFieldValue(jSONReader, "context");
        Object finalJSONReaderContextState = getFieldValue(jSONReaderContext, "state");
        
        assertEquals(1002, finalJSONReaderContextState);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReadObject29() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContextMock = mock(JSONStreamContext.class);
        jSONStreamContextMock.state = 1004;
        setField(jSONReader, "context", jSONStreamContextMock);
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        when(defaultJSONParserMock.parseObject(org.mockito.ArgumentMatchers.any(Type.class))).thenReturn(null);
        setField(jSONReader, "parser", defaultJSONParserMock);
        
        Object actual = jSONReader.readObject(((Type) null));
        
        assertNull(actual);
        
        Object jSONReaderContext = getFieldValue(jSONReader, "context");
        Object finalJSONReaderContextState = getFieldValue(jSONReaderContext, "state");
        
        assertEquals(1005, finalJSONReaderContextState);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReadObject30() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContextMock = mock(JSONStreamContext.class);
        jSONStreamContextMock.state = 1003;
        setField(jSONReader, "context", jSONStreamContextMock);
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        when(defaultJSONParserMock.parseObject(org.mockito.ArgumentMatchers.any(Type.class))).thenReturn(null);
        setField(jSONReader, "parser", defaultJSONParserMock);
        Object wildcardTypeImpl = createInstance("retrofit2.Utils$WildcardTypeImpl");
        
        Class jSONReaderClazz = Class.forName("com.alibaba.fastjson.JSONReader");
        Class wildcardTypeImplType = Class.forName("java.lang.reflect.Type");
        Method readObjectMethod = jSONReaderClazz.getDeclaredMethod("readObject", wildcardTypeImplType);
        readObjectMethod.setAccessible(true);
        java.lang.Object[] readObjectMethodArguments = new java.lang.Object[1];
        readObjectMethodArguments[0] = wildcardTypeImpl;
        Object actual = readObjectMethod.invoke(jSONReader, readObjectMethodArguments);
        
        assertNull(actual);
        
        Object jSONReaderContext = getFieldValue(jSONReader, "context");
        Object finalJSONReaderContextState = getFieldValue(jSONReaderContext, "state");
        
        assertEquals(1002, finalJSONReaderContextState);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReadObject31() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContextMock = mock(JSONStreamContext.class);
        jSONStreamContextMock.state = 1002;
        setField(jSONReader, "context", jSONStreamContextMock);
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        when(defaultJSONParserMock.parseObject(org.mockito.ArgumentMatchers.any(Type.class))).thenReturn(null);
        setField(jSONReader, "parser", defaultJSONParserMock);
        
        Object actual = jSONReader.readObject(((Type) null));
        
        assertNull(actual);
        
        Object jSONReaderContext = getFieldValue(jSONReader, "context");
        Object finalJSONReaderContextState = getFieldValue(jSONReaderContext, "state");
        
        assertEquals(1003, finalJSONReaderContextState);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReadObject32() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContextMock = mock(JSONStreamContext.class);
        jSONStreamContextMock.state = 1005;
        setField(jSONReader, "context", jSONStreamContextMock);
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        when(defaultJSONParserMock.parseObject(org.mockito.ArgumentMatchers.any(Type.class))).thenReturn(null);
        setField(jSONReader, "parser", defaultJSONParserMock);
        Object wildcardTypeImpl = createInstance("retrofit2.Utils$WildcardTypeImpl");
        
        Class jSONReaderClazz = Class.forName("com.alibaba.fastjson.JSONReader");
        Class wildcardTypeImplType = Class.forName("java.lang.reflect.Type");
        Method readObjectMethod = jSONReaderClazz.getDeclaredMethod("readObject", wildcardTypeImplType);
        readObjectMethod.setAccessible(true);
        java.lang.Object[] readObjectMethodArguments = new java.lang.Object[1];
        readObjectMethodArguments[0] = wildcardTypeImpl;
        Object actual = readObjectMethod.invoke(jSONReader, readObjectMethodArguments);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadObject33() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        
        jSONReader.readObject(((TypeReference) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReadObject34() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContextMock = mock(JSONStreamContext.class);
        jSONStreamContextMock.state = 1004;
        setField(jSONReader, "context", jSONStreamContextMock);
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        when(defaultJSONParserMock.parseObject(org.mockito.ArgumentMatchers.any(Type.class))).thenReturn(null);
        setField(jSONReader, "parser", defaultJSONParserMock);
        TypeReference typeReferenceMock = mock(TypeReference.class);
        when(typeReferenceMock.getType()).thenReturn(((Type) null));
        
        Object actual = jSONReader.readObject(typeReferenceMock);
        
        assertNull(actual);
        
        Object jSONReaderContext = getFieldValue(jSONReader, "context");
        Object finalJSONReaderContextState = getFieldValue(jSONReaderContext, "state");
        
        assertEquals(1005, finalJSONReaderContextState);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReadObject35() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        setField(jSONReader, "context", null);
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        java.lang.Object[] ofLongArray = createArray("java.util.stream.Nodes$EmptyNode$OfLong", 0);
        when(defaultJSONParserMock.parseObject(org.mockito.ArgumentMatchers.any(Type.class))).thenReturn(((Object) ofLongArray));
        setField(jSONReader, "parser", defaultJSONParserMock);
        TypeReference typeReferenceMock = mock(TypeReference.class);
        Object syntheticParameterizedType = createInstance("org.springframework.core.ResolvableType$SyntheticParameterizedType");
        when(typeReferenceMock.getType()).thenReturn(((Type) syntheticParameterizedType));
        
        Object actual = jSONReader.readObject(typeReferenceMock);
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(ofLongArray, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReadObject36() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContextMock = mock(JSONStreamContext.class);
        jSONStreamContextMock.state = 1003;
        setField(jSONReader, "context", jSONStreamContextMock);
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        when(defaultJSONParserMock.parseObject(org.mockito.ArgumentMatchers.any(Type.class))).thenReturn(null);
        setField(jSONReader, "parser", defaultJSONParserMock);
        TypeReference typeReferenceMock = mock(TypeReference.class);
        when(typeReferenceMock.getType()).thenReturn(((Type) null));
        
        Object actual = jSONReader.readObject(typeReferenceMock);
        
        assertNull(actual);
        
        Object jSONReaderContext = getFieldValue(jSONReader, "context");
        Object finalJSONReaderContextState = getFieldValue(jSONReaderContext, "state");
        
        assertEquals(1002, finalJSONReaderContextState);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReadObject37() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContextMock = mock(JSONStreamContext.class);
        jSONStreamContextMock.state = 1002;
        setField(jSONReader, "context", jSONStreamContextMock);
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        when(defaultJSONParserMock.parseObject(org.mockito.ArgumentMatchers.any(Type.class))).thenReturn(null);
        setField(jSONReader, "parser", defaultJSONParserMock);
        TypeReference typeReferenceMock = mock(TypeReference.class);
        when(typeReferenceMock.getType()).thenReturn(((Type) null));
        
        Object actual = jSONReader.readObject(typeReferenceMock);
        
        assertNull(actual);
        
        Object jSONReaderContext = getFieldValue(jSONReader, "context");
        Object finalJSONReaderContextState = getFieldValue(jSONReaderContext, "state");
        
        assertEquals(1003, finalJSONReaderContextState);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReadObject38() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContextMock = mock(JSONStreamContext.class);
        jSONStreamContextMock.state = 1001;
        setField(jSONReader, "context", jSONStreamContextMock);
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        when(defaultJSONParserMock.parseObject(org.mockito.ArgumentMatchers.any(Type.class))).thenReturn(null);
        setField(jSONReader, "parser", defaultJSONParserMock);
        TypeReference typeReferenceMock = mock(TypeReference.class);
        when(typeReferenceMock.getType()).thenReturn(((Type) null));
        
        Object actual = jSONReader.readObject(typeReferenceMock);
        
        assertNull(actual);
        
        Object jSONReaderContext = getFieldValue(jSONReader, "context");
        Object finalJSONReaderContextState = getFieldValue(jSONReaderContext, "state");
        
        assertEquals(1002, finalJSONReaderContextState);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadObject39() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContextMock = mock(JSONStreamContext.class);
        jSONStreamContextMock.state = 1006;
        setField(jSONReader, "context", jSONStreamContextMock);
        TypeReference typeReferenceMock = mock(TypeReference.class);
        when(typeReferenceMock.getType()).thenReturn(((Type) null));
        
        jSONReader.readObject(typeReferenceMock);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReadObject40() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContextMock = mock(JSONStreamContext.class);
        jSONStreamContextMock.state = 1005;
        setField(jSONReader, "context", jSONStreamContextMock);
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        when(defaultJSONParserMock.parseObject(org.mockito.ArgumentMatchers.any(Type.class))).thenReturn(null);
        setField(jSONReader, "parser", defaultJSONParserMock);
        TypeReference typeReferenceMock = mock(TypeReference.class);
        when(typeReferenceMock.getType()).thenReturn(((Type) null));
        
        Object actual = jSONReader.readObject(typeReferenceMock);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReadObject41() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        setField(jSONReader, "context", null);
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        java.lang.Object[] actionsArray = createArray("javax.swing.plaf.basic.BasicPopupMenuUI$Actions", 0);
        when(defaultJSONParserMock.parseObject(org.mockito.ArgumentMatchers.any(Class.class))).thenReturn(((Object) actionsArray));
        setField(jSONReader, "parser", defaultJSONParserMock);
        Class class1 = Object.class;
        
        Object actual = jSONReader.readObject(class1);
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(actionsArray, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadObject42() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContextMock = mock(JSONStreamContext.class);
        jSONStreamContextMock.state = 1006;
        setField(jSONReader, "context", jSONStreamContextMock);
        
        jSONReader.readObject(((Class) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReadObject43() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContextMock = mock(JSONStreamContext.class);
        jSONStreamContextMock.state = 1001;
        setField(jSONReader, "context", jSONStreamContextMock);
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        when(defaultJSONParserMock.parseObject(org.mockito.ArgumentMatchers.any(Class.class))).thenReturn(null);
        setField(jSONReader, "parser", defaultJSONParserMock);
        
        Object actual = jSONReader.readObject(((Class) null));
        
        assertNull(actual);
        
        Object jSONReaderContext = getFieldValue(jSONReader, "context");
        Object finalJSONReaderContextState = getFieldValue(jSONReaderContext, "state");
        
        assertEquals(1002, finalJSONReaderContextState);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReadObject44() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContextMock = mock(JSONStreamContext.class);
        jSONStreamContextMock.state = 1004;
        setField(jSONReader, "context", jSONStreamContextMock);
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        when(defaultJSONParserMock.parseObject(org.mockito.ArgumentMatchers.any(Class.class))).thenReturn(null);
        setField(jSONReader, "parser", defaultJSONParserMock);
        
        Object actual = jSONReader.readObject(((Class) null));
        
        assertNull(actual);
        
        Object jSONReaderContext = getFieldValue(jSONReader, "context");
        Object finalJSONReaderContextState = getFieldValue(jSONReaderContext, "state");
        
        assertEquals(1005, finalJSONReaderContextState);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReadObject45() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContextMock = mock(JSONStreamContext.class);
        jSONStreamContextMock.state = 1003;
        setField(jSONReader, "context", jSONStreamContextMock);
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        when(defaultJSONParserMock.parseObject(org.mockito.ArgumentMatchers.any(Class.class))).thenReturn(null);
        setField(jSONReader, "parser", defaultJSONParserMock);
        Class class1 = Object.class;
        
        Object actual = jSONReader.readObject(class1);
        
        assertNull(actual);
        
        Object jSONReaderContext = getFieldValue(jSONReader, "context");
        Object finalJSONReaderContextState = getFieldValue(jSONReaderContext, "state");
        
        assertEquals(1002, finalJSONReaderContextState);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReadObject46() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContextMock = mock(JSONStreamContext.class);
        jSONStreamContextMock.state = 1002;
        setField(jSONReader, "context", jSONStreamContextMock);
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        when(defaultJSONParserMock.parseObject(org.mockito.ArgumentMatchers.any(Class.class))).thenReturn(null);
        setField(jSONReader, "parser", defaultJSONParserMock);
        
        Object actual = jSONReader.readObject(((Class) null));
        
        assertNull(actual);
        
        Object jSONReaderContext = getFieldValue(jSONReader, "context");
        Object finalJSONReaderContextState = getFieldValue(jSONReaderContext, "state");
        
        assertEquals(1003, finalJSONReaderContextState);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReadObject47() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContextMock = mock(JSONStreamContext.class);
        jSONStreamContextMock.state = 1005;
        setField(jSONReader, "context", jSONStreamContextMock);
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        when(defaultJSONParserMock.parseObject(org.mockito.ArgumentMatchers.any(Class.class))).thenReturn(null);
        setField(jSONReader, "parser", defaultJSONParserMock);
        Class class1 = Object.class;
        
        Object actual = jSONReader.readObject(class1);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testPeek1() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        
        jSONReader.peek();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testPeek2() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        JSONLexer jSONLexerMock = mock(JSONLexer.class);
        when(jSONLexerMock.token()).thenReturn(0);
        setField(defaultJSONParserMock, "lexer", jSONLexerMock);
        setField(jSONReader, "parser", defaultJSONParserMock);
        
        int actual = jSONReader.peek();
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testJSONReader1() {
        new JSONReader(((Reader) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testJSONReader2() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONReader actual = new JSONReader(defaultJSONParser);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testJSONReader3() throws Throwable  {
        DefaultJSONParser defaultJSONParserMock = mock(DefaultJSONParser.class);
        JSONReader actual = new JSONReader(defaultJSONParserMock);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testJSONReader4() {
        com.alibaba.fastjson.parser.Feature[] featureArray = new com.alibaba.fastjson.parser.Feature[0];
        new JSONReader(null, featureArray);
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
